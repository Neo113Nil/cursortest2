package org.betup.ui.fragment.user.compose.messages;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.betup.model.remote.entity.messaging.CorrespondentModel;
import org.betup.model.remote.entity.messaging.ExtendedMessageModel;
import org.betup.model.remote.entity.messaging.MessageModel;

/* compiled from: MessagesModels.kt */
@Metadata(d1 = {"\u0000\u0018\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\u001a\u001c\u0010\u0000\u001a\u00020\u0001*\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u00042\b\b\u0002\u0010\u0005\u001a\u00020\u0006¨\u0006\u0007"}, d2 = {"toBubbleUi", "Lorg/betup/ui/fragment/user/compose/messages/MessageBubbleUi;", "Lorg/betup/model/remote/entity/messaging/ExtendedMessageModel;", "currentUserId", "", "timestamp", "", "app_release"}, k = 2, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class MessagesModelsKt {
    public static /* synthetic */ MessageBubbleUi toBubbleUi$default(ExtendedMessageModel extendedMessageModel, int i, String str, int i2, Object obj) {
        if ((i2 & 2) != 0) {
            str = "";
        }
        return toBubbleUi(extendedMessageModel, i, str);
    }

    public static final MessageBubbleUi toBubbleUi(ExtendedMessageModel extendedMessageModel, int i, String timestamp) {
        Intrinsics.checkNotNullParameter(extendedMessageModel, "<this>");
        Intrinsics.checkNotNullParameter(timestamp, "timestamp");
        MessageModel message = extendedMessageModel.getMessage();
        if (message == null) {
            message = new MessageModel();
        }
        CorrespondentModel user = message.getUser();
        if (user == null) {
            user = new CorrespondentModel();
        }
        String valueOf = String.valueOf(message.getId());
        int id = user.getId();
        String name = user.getName();
        String str = name == null ? "" : name;
        String avatarUrl = user.getAvatarUrl();
        String message2 = message.getMessage();
        if (message2 == null) {
            message2 = "";
        }
        return new MessageBubbleUi(valueOf, id, str, avatarUrl, message2, timestamp, user.getId() == i);
    }
}
