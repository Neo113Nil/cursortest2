package org.betup.ui.fragment.user.compose.messages;

import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.modelmapper.internal.bytebuddy.description.method.MethodDescription;

/* compiled from: MessagesModels.kt */
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0018\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001BG\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\u0006\u0010\b\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\u0006\u0012\b\b\u0002\u0010\n\u001a\u00020\u000b¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u0018\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010\u000fJ\u0010\u0010\u0019\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010\u000fJ\t\u0010\u001a\u001a\u00020\u0006HÆ\u0003J\u000b\u0010\u001b\u001a\u0004\u0018\u00010\u0006HÆ\u0003J\t\u0010\u001c\u001a\u00020\u0006HÆ\u0003J\t\u0010\u001d\u001a\u00020\u0006HÆ\u0003J\t\u0010\u001e\u001a\u00020\u000bHÆ\u0003JZ\u0010\u001f\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00062\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00062\b\b\u0002\u0010\b\u001a\u00020\u00062\b\b\u0002\u0010\t\u001a\u00020\u00062\b\b\u0002\u0010\n\u001a\u00020\u000bHÆ\u0001¢\u0006\u0002\u0010 J\u0013\u0010!\u001a\u00020\u000b2\b\u0010\"\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010#\u001a\u00020$HÖ\u0001J\t\u0010%\u001a\u00020\u0006HÖ\u0001R\u0015\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\n\n\u0002\u0010\u0010\u001a\u0004\b\u000e\u0010\u000fR\u0015\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\n\n\u0002\u0010\u0010\u001a\u0004\b\u0011\u0010\u000fR\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013R\u0013\u0010\u0007\u001a\u0004\u0018\u00010\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0013R\u0011\u0010\b\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0013R\u0011\u0010\t\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0013R\u0011\u0010\n\u001a\u00020\u000b¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u0017¨\u0006&"}, d2 = {"Lorg/betup/ui/fragment/user/compose/messages/ChatListItemUi;", "", "chatId", "", "correspondentId", "name", "", "avatarUrl", "lastMessagePreview", "timestampLabel", "isUnread", "", MethodDescription.CONSTRUCTOR_INTERNAL_NAME, "(Ljava/lang/Long;Ljava/lang/Long;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Z)V", "getChatId", "()Ljava/lang/Long;", "Ljava/lang/Long;", "getCorrespondentId", "getName", "()Ljava/lang/String;", "getAvatarUrl", "getLastMessagePreview", "getTimestampLabel", "()Z", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "copy", "(Ljava/lang/Long;Ljava/lang/Long;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Z)Lorg/betup/ui/fragment/user/compose/messages/ChatListItemUi;", "equals", "other", "hashCode", "", "toString", "app_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes4.dex */
public final /* data */ class ChatListItemUi {
    public static final int $stable = 0;
    private final String avatarUrl;
    private final Long chatId;
    private final Long correspondentId;
    private final boolean isUnread;
    private final String lastMessagePreview;
    private final String name;
    private final String timestampLabel;

    public static /* synthetic */ ChatListItemUi copy$default(ChatListItemUi chatListItemUi, Long l, Long l2, String str, String str2, String str3, String str4, boolean z, int i, Object obj) {
        if ((i & 1) != 0) {
            l = chatListItemUi.chatId;
        }
        if ((i & 2) != 0) {
            l2 = chatListItemUi.correspondentId;
        }
        Long l3 = l2;
        if ((i & 4) != 0) {
            str = chatListItemUi.name;
        }
        String str5 = str;
        if ((i & 8) != 0) {
            str2 = chatListItemUi.avatarUrl;
        }
        String str6 = str2;
        if ((i & 16) != 0) {
            str3 = chatListItemUi.lastMessagePreview;
        }
        String str7 = str3;
        if ((i & 32) != 0) {
            str4 = chatListItemUi.timestampLabel;
        }
        String str8 = str4;
        if ((i & 64) != 0) {
            z = chatListItemUi.isUnread;
        }
        return chatListItemUi.copy(l, l3, str5, str6, str7, str8, z);
    }

    /* renamed from: component1, reason: from getter */
    public final Long getChatId() {
        return this.chatId;
    }

    /* renamed from: component2, reason: from getter */
    public final Long getCorrespondentId() {
        return this.correspondentId;
    }

    /* renamed from: component3, reason: from getter */
    public final String getName() {
        return this.name;
    }

    /* renamed from: component4, reason: from getter */
    public final String getAvatarUrl() {
        return this.avatarUrl;
    }

    /* renamed from: component5, reason: from getter */
    public final String getLastMessagePreview() {
        return this.lastMessagePreview;
    }

    /* renamed from: component6, reason: from getter */
    public final String getTimestampLabel() {
        return this.timestampLabel;
    }

    /* renamed from: component7, reason: from getter */
    public final boolean getIsUnread() {
        return this.isUnread;
    }

    public final ChatListItemUi copy(Long chatId, Long correspondentId, String name, String avatarUrl, String lastMessagePreview, String timestampLabel, boolean isUnread) {
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(lastMessagePreview, "lastMessagePreview");
        Intrinsics.checkNotNullParameter(timestampLabel, "timestampLabel");
        return new ChatListItemUi(chatId, correspondentId, name, avatarUrl, lastMessagePreview, timestampLabel, isUnread);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ChatListItemUi)) {
            return false;
        }
        ChatListItemUi chatListItemUi = (ChatListItemUi) other;
        return Intrinsics.areEqual(this.chatId, chatListItemUi.chatId) && Intrinsics.areEqual(this.correspondentId, chatListItemUi.correspondentId) && Intrinsics.areEqual(this.name, chatListItemUi.name) && Intrinsics.areEqual(this.avatarUrl, chatListItemUi.avatarUrl) && Intrinsics.areEqual(this.lastMessagePreview, chatListItemUi.lastMessagePreview) && Intrinsics.areEqual(this.timestampLabel, chatListItemUi.timestampLabel) && this.isUnread == chatListItemUi.isUnread;
    }

    public int hashCode() {
        Long l = this.chatId;
        int hashCode = (l == null ? 0 : l.hashCode()) * 31;
        Long l2 = this.correspondentId;
        int hashCode2 = (((hashCode + (l2 == null ? 0 : l2.hashCode())) * 31) + this.name.hashCode()) * 31;
        String str = this.avatarUrl;
        return ((((((hashCode2 + (str != null ? str.hashCode() : 0)) * 31) + this.lastMessagePreview.hashCode()) * 31) + this.timestampLabel.hashCode()) * 31) + Boolean.hashCode(this.isUnread);
    }

    public String toString() {
        return "ChatListItemUi(chatId=" + this.chatId + ", correspondentId=" + this.correspondentId + ", name=" + this.name + ", avatarUrl=" + this.avatarUrl + ", lastMessagePreview=" + this.lastMessagePreview + ", timestampLabel=" + this.timestampLabel + ", isUnread=" + this.isUnread + ")";
    }

    public ChatListItemUi(Long l, Long l2, String name, String str, String lastMessagePreview, String timestampLabel, boolean z) {
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(lastMessagePreview, "lastMessagePreview");
        Intrinsics.checkNotNullParameter(timestampLabel, "timestampLabel");
        this.chatId = l;
        this.correspondentId = l2;
        this.name = name;
        this.avatarUrl = str;
        this.lastMessagePreview = lastMessagePreview;
        this.timestampLabel = timestampLabel;
        this.isUnread = z;
    }

    public /* synthetic */ ChatListItemUi(Long l, Long l2, String str, String str2, String str3, String str4, boolean z, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(l, l2, str, str2, str3, str4, (i & 64) != 0 ? false : z);
    }

    public final Long getChatId() {
        return this.chatId;
    }

    public final Long getCorrespondentId() {
        return this.correspondentId;
    }

    public final String getName() {
        return this.name;
    }

    public final String getAvatarUrl() {
        return this.avatarUrl;
    }

    public final String getLastMessagePreview() {
        return this.lastMessagePreview;
    }

    public final String getTimestampLabel() {
        return this.timestampLabel;
    }

    public final boolean isUnread() {
        return this.isUnread;
    }
}
