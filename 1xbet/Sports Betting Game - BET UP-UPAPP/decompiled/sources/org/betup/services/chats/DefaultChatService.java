package org.betup.services.chats;

import javax.inject.Inject;
import javax.inject.Singleton;
import org.betup.bus.EventsCountMessage;
import org.betup.model.remote.api.FetchStat;
import org.betup.model.remote.api.FetchedResponseMessage;
import org.betup.model.remote.api.rest.base.BaseCachedSharedInteractor;
import org.betup.model.remote.api.rest.messaging.GetUserMessagesInteractor;
import org.betup.model.remote.entity.messaging.UserCorrespondentModel;
import org.greenrobot.eventbus.EventBus;

@Singleton
/* loaded from: classes2.dex */
public class DefaultChatService implements ChatService, BaseCachedSharedInteractor.OnFetchedListener<UserCorrespondentModel, Void> {
    private GetUserMessagesInteractor getUserMessagesInteractor;
    private int unreadTotal;

    @Inject
    public DefaultChatService(GetUserMessagesInteractor getUserMessagesInteractor) {
        this.getUserMessagesInteractor = getUserMessagesInteractor;
    }

    @Override // org.betup.services.chats.ChatService
    public int getUnreadMessagesCount() {
        return this.unreadTotal;
    }

    @Override // org.betup.services.chats.ChatService
    public void refreshUnreadMessagesCount() {
        this.getUserMessagesInteractor.load(this, null);
    }

    @Override // org.betup.model.remote.api.rest.base.BaseCachedSharedInteractor.OnFetchedListener
    public void onFetched(FetchedResponseMessage<UserCorrespondentModel, Void> responseMessage) {
        if (responseMessage.getStat() != FetchStat.SUCCESS) {
            return;
        }
        this.unreadTotal = responseMessage.getModel().getUnreadMessages();
        EventBus.getDefault().post(new EventsCountMessage());
    }
}
