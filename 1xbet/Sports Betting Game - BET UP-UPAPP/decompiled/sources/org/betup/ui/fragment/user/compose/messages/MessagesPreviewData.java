package org.betup.ui.fragment.user.compose.messages;

import androidx.exifinterface.media.ExifInterface;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import org.modelmapper.internal.bytebuddy.description.method.MethodDescription;

/* compiled from: MessagesModels.kt */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0017\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0017\u0010\t\u001a\b\u0012\u0004\u0012\u00020\n0\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\b¨\u0006\f"}, d2 = {"Lorg/betup/ui/fragment/user/compose/messages/MessagesPreviewData;", "", MethodDescription.CONSTRUCTOR_INTERNAL_NAME, "()V", "chats", "", "Lorg/betup/ui/fragment/user/compose/messages/ChatListItemUi;", "getChats", "()Ljava/util/List;", "messages", "Lorg/betup/ui/fragment/user/compose/messages/MessageBubbleUi;", "getMessages", "app_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class MessagesPreviewData {
    public static final MessagesPreviewData INSTANCE = new MessagesPreviewData();
    private static final List<ChatListItemUi> chats = CollectionsKt.listOf((Object[]) new ChatListItemUi[]{new ChatListItemUi(1L, 42L, "George_123", null, "Hey, I want to talk about yesterday's match…", "1 h", true), new ChatListItemUi(2L, 43L, "Mika", null, "That penalty was insane!", "1 day ago", false, 64, null), new ChatListItemUi(3L, 44L, "Alex", null, "We should place a new bet soon", "1 month", false, 64, null)});
    private static final List<MessageBubbleUi> messages = CollectionsKt.listOf((Object[]) new MessageBubbleUi[]{new MessageBubbleUi("1", 1, "George_123", null, "Man, I still can't believe that ending. How did they blow a 2-0 lead?", "20:14", false), new MessageBubbleUi(ExifInterface.GPS_MEASUREMENT_2D, 0, "You", null, "Right?! I had them winning by at least one goal. My bet was looking golden until the last 10 minutes.", "20:15", true), new MessageBubbleUi(ExifInterface.GPS_MEASUREMENT_3D, 1, "George_123", null, "Bro, I told y'all, never trust that team to hold a lead. They always choke under pressure.", "20:16", false)});
    public static final int $stable = 8;

    private MessagesPreviewData() {
    }

    public final List<ChatListItemUi> getChats() {
        return chats;
    }

    public final List<MessageBubbleUi> getMessages() {
        return messages;
    }
}
