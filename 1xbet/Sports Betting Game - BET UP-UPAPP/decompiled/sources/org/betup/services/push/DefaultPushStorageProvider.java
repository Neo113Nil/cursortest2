package org.betup.services.push;

import android.content.Context;
import android.util.Log;
import me.leolin.shortcutbadger.ShortcutBadger;
import org.betup.bus.EventsCountMessage;
import org.betup.model.local.entity.Event;
import org.betup.model.local.interactor.AddEventInteractor;
import org.betup.model.local.interactor.GetNewEventsCountInteractor;
import org.betup.model.local.interactor.GetNewEventsCountInteractorByUUID;
import org.betup.model.local.interactor.ReadAllEventsInteractor;
import org.betup.model.local.interactor.ReadEventInteractor;
import org.betup.model.remote.api.FetchedResponseMessage;
import org.betup.model.remote.api.rest.base.BaseCachedSharedInteractor;
import org.greenrobot.eventbus.EventBus;

/* loaded from: classes2.dex */
public class DefaultPushStorageProvider implements PushStorageProvider {
    private final AddEventInteractor addEventInteractor;
    private final Context context;
    private int eventsCount;
    private final GetNewEventsCountInteractor getNewEventsCountInteractor;
    private final GetNewEventsCountInteractorByUUID getNewEventsCountInteractorByUUID;
    private final ReadAllEventsInteractor readAllEventsInteractor;
    private final ReadEventInteractor readEventInteractor;
    private final BaseCachedSharedInteractor.OnFetchedListener<Event, Event> addListener = new BaseCachedSharedInteractor.OnFetchedListener<Event, Event>() { // from class: org.betup.services.push.DefaultPushStorageProvider.1
        @Override // org.betup.model.remote.api.rest.base.BaseCachedSharedInteractor.OnFetchedListener
        public void onFetched(FetchedResponseMessage<Event, Event> responseMessage) {
            DefaultPushStorageProvider.this.refreshEventCount(Integer.valueOf(responseMessage.getId().getUserId()));
        }
    };
    private final BaseCachedSharedInteractor.OnFetchedListener<Boolean, Integer> readListener = new BaseCachedSharedInteractor.OnFetchedListener<Boolean, Integer>() { // from class: org.betup.services.push.DefaultPushStorageProvider.2
        @Override // org.betup.model.remote.api.rest.base.BaseCachedSharedInteractor.OnFetchedListener
        public void onFetched(FetchedResponseMessage<Boolean, Integer> responseMessage) {
            DefaultPushStorageProvider.this.refreshEventCount(responseMessage.getId());
        }
    };
    private final BaseCachedSharedInteractor.OnFetchedListener<Boolean, String> readEventListener = new BaseCachedSharedInteractor.OnFetchedListener<Boolean, String>() { // from class: org.betup.services.push.DefaultPushStorageProvider.3
        @Override // org.betup.model.remote.api.rest.base.BaseCachedSharedInteractor.OnFetchedListener
        public void onFetched(FetchedResponseMessage<Boolean, String> responseMessage) {
            DefaultPushStorageProvider.this.refreshEventCountByUUID(responseMessage.getId());
        }
    };
    private final BaseCachedSharedInteractor.OnFetchedListener<Integer, Integer> getNewListener = new BaseCachedSharedInteractor.OnFetchedListener<Integer, Integer>() { // from class: org.betup.services.push.DefaultPushStorageProvider.4
        @Override // org.betup.model.remote.api.rest.base.BaseCachedSharedInteractor.OnFetchedListener
        public void onFetched(FetchedResponseMessage<Integer, Integer> responseMessage) {
            if (responseMessage.getModel() != null) {
                DefaultPushStorageProvider.this.applyShortcutBadgeSafely(responseMessage.getModel().intValue());
                DefaultPushStorageProvider.this.eventsCount = responseMessage.getModel().intValue();
                Log.d("EVENTTEST", "APPLYING EVENT COUNT " + responseMessage.getModel());
                EventBus.getDefault().post(new EventsCountMessage());
            }
        }
    };
    private final BaseCachedSharedInteractor.OnFetchedListener<Integer, String> getNewUUIDListener = new BaseCachedSharedInteractor.OnFetchedListener<Integer, String>() { // from class: org.betup.services.push.DefaultPushStorageProvider.5
        @Override // org.betup.model.remote.api.rest.base.BaseCachedSharedInteractor.OnFetchedListener
        public void onFetched(FetchedResponseMessage<Integer, String> responseMessage) {
            if (responseMessage.getModel() != null) {
                DefaultPushStorageProvider.this.applyShortcutBadgeSafely(responseMessage.getModel().intValue());
                DefaultPushStorageProvider.this.eventsCount = responseMessage.getModel().intValue();
                Log.d("EVENTTEST", "APPLYING EVENT COUNT " + responseMessage.getModel());
                EventBus.getDefault().post(new EventsCountMessage());
            }
        }
    };

    @Override // org.betup.services.push.PushStorageProvider
    public int getEventsCount() {
        return this.eventsCount;
    }

    public DefaultPushStorageProvider(Context context, AddEventInteractor addEventInteractor, GetNewEventsCountInteractor getNewEventsCountInteractor, ReadEventInteractor readEventInteractor, ReadAllEventsInteractor readAllEventsInteractor, GetNewEventsCountInteractorByUUID getNewEventsCountInteractorByUUID) {
        this.context = context;
        this.addEventInteractor = addEventInteractor;
        this.getNewEventsCountInteractor = getNewEventsCountInteractor;
        this.readEventInteractor = readEventInteractor;
        this.readAllEventsInteractor = readAllEventsInteractor;
        this.getNewEventsCountInteractorByUUID = getNewEventsCountInteractorByUUID;
    }

    @Override // org.betup.services.push.PushStorageProvider
    public void saveEvent(Event event) {
        this.addEventInteractor.load(this.addListener, event, null);
        Log.d("EVENTTEST", "SAVING EVENT");
    }

    @Override // org.betup.services.push.PushStorageProvider
    public void refreshEventCount(Integer userId) {
        this.getNewEventsCountInteractor.load(this.getNewListener, userId, null);
    }

    @Override // org.betup.services.push.PushStorageProvider
    public void refreshEventCountByUUID(String uuid) {
        this.getNewEventsCountInteractorByUUID.load(this.getNewUUIDListener, uuid, null);
    }

    @Override // org.betup.services.push.PushStorageProvider
    public void readAll(Integer userId) {
        this.readAllEventsInteractor.load(this.readListener, userId, null);
    }

    @Override // org.betup.services.push.PushStorageProvider
    public void readEvent(String userId) {
        this.readEventInteractor.load(this.readEventListener, userId, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void applyShortcutBadgeSafely(int count) {
        try {
            ShortcutBadger.applyCount(this.context.getApplicationContext(), count);
        } catch (Throwable th) {
            Log.w("PushBadge", "Unable to apply shortcut badge, count=" + count, th);
        }
    }
}
