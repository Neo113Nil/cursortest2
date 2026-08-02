package org.betup.ui.fragment.user.compose.messages;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.modelmapper.internal.bytebuddy.description.method.MethodDescription;

/* compiled from: MessagesModels.kt */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0018\b\u0087\b\u0018\u00002\u00020\u0001BA\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0003\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\b\u001a\u00020\u0003\u0012\u0006\u0010\t\u001a\u00020\u0003\u0012\u0006\u0010\n\u001a\u00020\u000b¢\u0006\u0004\b\f\u0010\rJ\t\u0010\u0017\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0018\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0019\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\u001a\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\t\u0010\u001b\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001c\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001d\u001a\u00020\u000bHÆ\u0003JQ\u0010\u001e\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00032\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\b\u001a\u00020\u00032\b\b\u0002\u0010\t\u001a\u00020\u00032\b\b\u0002\u0010\n\u001a\u00020\u000bHÆ\u0001J\u0013\u0010\u001f\u001a\u00020\u000b2\b\u0010 \u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010!\u001a\u00020\u0005HÖ\u0001J\t\u0010\"\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0011\u0010\u0006\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u000fR\u0013\u0010\u0007\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u000fR\u0011\u0010\b\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u000fR\u0011\u0010\t\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u000fR\u0011\u0010\n\u001a\u00020\u000b¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u0016¨\u0006#"}, d2 = {"Lorg/betup/ui/fragment/user/compose/messages/MessageBubbleUi;", "", "id", "", "authorId", "", "authorName", "authorAvatar", "text", "timestampLabel", "isMine", "", MethodDescription.CONSTRUCTOR_INTERNAL_NAME, "(Ljava/lang/String;ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Z)V", "getId", "()Ljava/lang/String;", "getAuthorId", "()I", "getAuthorName", "getAuthorAvatar", "getText", "getTimestampLabel", "()Z", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "copy", "equals", "other", "hashCode", "toString", "app_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes4.dex */
public final /* data */ class MessageBubbleUi {
    public static final int $stable = 0;
    private final String authorAvatar;
    private final int authorId;
    private final String authorName;
    private final String id;
    private final boolean isMine;
    private final String text;
    private final String timestampLabel;

    public static /* synthetic */ MessageBubbleUi copy$default(MessageBubbleUi messageBubbleUi, String str, int i, String str2, String str3, String str4, String str5, boolean z, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            str = messageBubbleUi.id;
        }
        if ((i2 & 2) != 0) {
            i = messageBubbleUi.authorId;
        }
        int i3 = i;
        if ((i2 & 4) != 0) {
            str2 = messageBubbleUi.authorName;
        }
        String str6 = str2;
        if ((i2 & 8) != 0) {
            str3 = messageBubbleUi.authorAvatar;
        }
        String str7 = str3;
        if ((i2 & 16) != 0) {
            str4 = messageBubbleUi.text;
        }
        String str8 = str4;
        if ((i2 & 32) != 0) {
            str5 = messageBubbleUi.timestampLabel;
        }
        String str9 = str5;
        if ((i2 & 64) != 0) {
            z = messageBubbleUi.isMine;
        }
        return messageBubbleUi.copy(str, i3, str6, str7, str8, str9, z);
    }

    /* renamed from: component1, reason: from getter */
    public final String getId() {
        return this.id;
    }

    /* renamed from: component2, reason: from getter */
    public final int getAuthorId() {
        return this.authorId;
    }

    /* renamed from: component3, reason: from getter */
    public final String getAuthorName() {
        return this.authorName;
    }

    /* renamed from: component4, reason: from getter */
    public final String getAuthorAvatar() {
        return this.authorAvatar;
    }

    /* renamed from: component5, reason: from getter */
    public final String getText() {
        return this.text;
    }

    /* renamed from: component6, reason: from getter */
    public final String getTimestampLabel() {
        return this.timestampLabel;
    }

    /* renamed from: component7, reason: from getter */
    public final boolean getIsMine() {
        return this.isMine;
    }

    public final MessageBubbleUi copy(String id, int authorId, String authorName, String authorAvatar, String text, String timestampLabel, boolean isMine) {
        Intrinsics.checkNotNullParameter(id, "id");
        Intrinsics.checkNotNullParameter(authorName, "authorName");
        Intrinsics.checkNotNullParameter(text, "text");
        Intrinsics.checkNotNullParameter(timestampLabel, "timestampLabel");
        return new MessageBubbleUi(id, authorId, authorName, authorAvatar, text, timestampLabel, isMine);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof MessageBubbleUi)) {
            return false;
        }
        MessageBubbleUi messageBubbleUi = (MessageBubbleUi) other;
        return Intrinsics.areEqual(this.id, messageBubbleUi.id) && this.authorId == messageBubbleUi.authorId && Intrinsics.areEqual(this.authorName, messageBubbleUi.authorName) && Intrinsics.areEqual(this.authorAvatar, messageBubbleUi.authorAvatar) && Intrinsics.areEqual(this.text, messageBubbleUi.text) && Intrinsics.areEqual(this.timestampLabel, messageBubbleUi.timestampLabel) && this.isMine == messageBubbleUi.isMine;
    }

    public int hashCode() {
        int hashCode = ((((this.id.hashCode() * 31) + Integer.hashCode(this.authorId)) * 31) + this.authorName.hashCode()) * 31;
        String str = this.authorAvatar;
        return ((((((hashCode + (str == null ? 0 : str.hashCode())) * 31) + this.text.hashCode()) * 31) + this.timestampLabel.hashCode()) * 31) + Boolean.hashCode(this.isMine);
    }

    public String toString() {
        return "MessageBubbleUi(id=" + this.id + ", authorId=" + this.authorId + ", authorName=" + this.authorName + ", authorAvatar=" + this.authorAvatar + ", text=" + this.text + ", timestampLabel=" + this.timestampLabel + ", isMine=" + this.isMine + ")";
    }

    public MessageBubbleUi(String id, int i, String authorName, String str, String text, String timestampLabel, boolean z) {
        Intrinsics.checkNotNullParameter(id, "id");
        Intrinsics.checkNotNullParameter(authorName, "authorName");
        Intrinsics.checkNotNullParameter(text, "text");
        Intrinsics.checkNotNullParameter(timestampLabel, "timestampLabel");
        this.id = id;
        this.authorId = i;
        this.authorName = authorName;
        this.authorAvatar = str;
        this.text = text;
        this.timestampLabel = timestampLabel;
        this.isMine = z;
    }

    public final String getId() {
        return this.id;
    }

    public final int getAuthorId() {
        return this.authorId;
    }

    public final String getAuthorName() {
        return this.authorName;
    }

    public final String getAuthorAvatar() {
        return this.authorAvatar;
    }

    public final String getText() {
        return this.text;
    }

    public final String getTimestampLabel() {
        return this.timestampLabel;
    }

    public final boolean isMine() {
        return this.isMine;
    }
}
