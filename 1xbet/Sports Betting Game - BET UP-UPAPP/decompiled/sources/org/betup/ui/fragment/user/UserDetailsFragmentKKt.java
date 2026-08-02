package org.betup.ui.fragment.user;

import io.bidmachine.media3.exoplayer.upstream.CmcdData;
import java.util.Date;
import kotlin.Metadata;
import org.betup.model.remote.entity.messaging.ChatModel;
import org.betup.ui.fragment.user.compose.messages.ChatListItemUi;

/* compiled from: UserDetailsFragmentK.kt */
@Metadata(d1 = {"\u0000\u0018\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\t\n\u0000\u001a\f\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u0002\u001a\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0002¨\u0006\u0007"}, d2 = {"toListUi", "Lorg/betup/ui/fragment/user/compose/messages/ChatListItemUi;", "Lorg/betup/model/remote/entity/messaging/ChatModel;", "relativeTimeLabel", "", "timestamp", "", "app_release"}, k = 2, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class UserDetailsFragmentKKt {
    /* JADX INFO: Access modifiers changed from: private */
    public static final ChatListItemUi toListUi(ChatModel chatModel) {
        String relativeTimeLabel;
        String lastMessageText = chatModel.getLastMessageText();
        String str = lastMessageText == null ? "" : lastMessageText;
        Date lastMessageDate = chatModel.getLastMessageDate();
        String str2 = (lastMessageDate == null || (relativeTimeLabel = relativeTimeLabel(lastMessageDate.getTime())) == null) ? "" : relativeTimeLabel;
        Long chatId = chatModel.getChatId();
        Long correspondentId = chatModel.getCorrespondentId();
        String name = chatModel.getName();
        return new ChatListItemUi(chatId, correspondentId, name == null ? "" : name, chatModel.getPhotoUrl(), str, str2, !chatModel.isRead());
    }

    private static final String relativeTimeLabel(long j) {
        long currentTimeMillis = (System.currentTimeMillis() - j) / 60000;
        if (currentTimeMillis < 1) {
            return "now";
        }
        if (currentTimeMillis < 60) {
            return currentTimeMillis + CmcdData.OBJECT_TYPE_MANIFEST;
        }
        if (currentTimeMillis < 1440) {
            return (currentTimeMillis / 60) + " h";
        }
        if (currentTimeMillis < 43200) {
            return (currentTimeMillis / 1440) + " d";
        }
        if (currentTimeMillis < 525600) {
            return (currentTimeMillis / 43200) + " mo";
        }
        return (currentTimeMillis / 525600) + " y";
    }
}
