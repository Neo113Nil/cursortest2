package org.betup.ui.fragment.user.compose.messages;

import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.modelmapper.internal.bytebuddy.description.method.MethodDescription;

/* compiled from: MessagesModels.kt */
@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b$\b\u0087\b\u0018\u00002\u00020\u0001B¥\u0001\u0012\u000e\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0006\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006\u0012\b\b\u0002\u0010\b\u001a\u00020\u0006\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0004\u0012\u000e\b\u0002\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u000b0\u0003\u0012\b\b\u0002\u0010\f\u001a\u00020\u0006\u0012\b\b\u0002\u0010\r\u001a\u00020\u0006\u0012\b\b\u0002\u0010\u000e\u001a\u00020\u0006\u0012\b\b\u0002\u0010\u000f\u001a\u00020\u0006\u0012\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u0011\u0012\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u0011\u0012\b\b\u0002\u0010\u0013\u001a\u00020\u0014\u0012\b\b\u0002\u0010\u0015\u001a\u00020\u0006¢\u0006\u0004\b\u0016\u0010\u0017J\u000f\u0010%\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003HÆ\u0003J\t\u0010&\u001a\u00020\u0006HÆ\u0003J\t\u0010'\u001a\u00020\u0006HÆ\u0003J\t\u0010(\u001a\u00020\u0006HÆ\u0003J\u000b\u0010)\u001a\u0004\u0018\u00010\u0004HÆ\u0003J\u000f\u0010*\u001a\b\u0012\u0004\u0012\u00020\u000b0\u0003HÆ\u0003J\t\u0010+\u001a\u00020\u0006HÆ\u0003J\t\u0010,\u001a\u00020\u0006HÆ\u0003J\t\u0010-\u001a\u00020\u0006HÆ\u0003J\t\u0010.\u001a\u00020\u0006HÆ\u0003J\u000b\u0010/\u001a\u0004\u0018\u00010\u0011HÆ\u0003J\u000b\u00100\u001a\u0004\u0018\u00010\u0011HÆ\u0003J\t\u00101\u001a\u00020\u0014HÆ\u0003J\t\u00102\u001a\u00020\u0006HÆ\u0003J§\u0001\u00103\u001a\u00020\u00002\u000e\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00062\b\b\u0002\u0010\u0007\u001a\u00020\u00062\b\b\u0002\u0010\b\u001a\u00020\u00062\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u00042\u000e\b\u0002\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u000b0\u00032\b\b\u0002\u0010\f\u001a\u00020\u00062\b\b\u0002\u0010\r\u001a\u00020\u00062\b\b\u0002\u0010\u000e\u001a\u00020\u00062\b\b\u0002\u0010\u000f\u001a\u00020\u00062\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u00112\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u00112\b\b\u0002\u0010\u0013\u001a\u00020\u00142\b\b\u0002\u0010\u0015\u001a\u00020\u0006HÆ\u0001J\u0013\u00104\u001a\u00020\u00062\b\u00105\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u00106\u001a\u00020\u0014HÖ\u0001J\t\u00107\u001a\u00020\u0011HÖ\u0001R\u0017\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0019R\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u001aR\u0011\u0010\u0007\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\u001aR\u0011\u0010\b\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u001aR\u0013\u0010\t\u001a\u0004\u0018\u00010\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u001dR\u0017\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u000b0\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001e\u0010\u0019R\u0011\u0010\f\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\u001aR\u0011\u0010\r\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u001aR\u0011\u0010\u000e\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u001f\u0010\u001aR\u0011\u0010\u000f\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u001aR\u0013\u0010\u0010\u001a\u0004\u0018\u00010\u0011¢\u0006\b\n\u0000\u001a\u0004\b \u0010!R\u0013\u0010\u0012\u001a\u0004\u0018\u00010\u0011¢\u0006\b\n\u0000\u001a\u0004\b\"\u0010!R\u0011\u0010\u0013\u001a\u00020\u0014¢\u0006\b\n\u0000\u001a\u0004\b#\u0010$R\u0011\u0010\u0015\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u001a¨\u00068"}, d2 = {"Lorg/betup/ui/fragment/user/compose/messages/UserMessagesState;", "", "chats", "", "Lorg/betup/ui/fragment/user/compose/messages/ChatListItemUi;", "isChatsLoading", "", "isChatsLoadingMore", "hasMoreChats", "selectedChat", "messages", "Lorg/betup/ui/fragment/user/compose/messages/MessageBubbleUi;", "isMessagesLoading", "isMessagesLoadingMore", "hasMoreMessages", "isSendingMessage", "conversationTitle", "", "conversationAvatarUrl", "currentUserId", "", "isSingleConversation", MethodDescription.CONSTRUCTOR_INTERNAL_NAME, "(Ljava/util/List;ZZZLorg/betup/ui/fragment/user/compose/messages/ChatListItemUi;Ljava/util/List;ZZZZLjava/lang/String;Ljava/lang/String;IZ)V", "getChats", "()Ljava/util/List;", "()Z", "getHasMoreChats", "getSelectedChat", "()Lorg/betup/ui/fragment/user/compose/messages/ChatListItemUi;", "getMessages", "getHasMoreMessages", "getConversationTitle", "()Ljava/lang/String;", "getConversationAvatarUrl", "getCurrentUserId", "()I", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "component10", "component11", "component12", "component13", "component14", "copy", "equals", "other", "hashCode", "toString", "app_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes4.dex */
public final /* data */ class UserMessagesState {
    public static final int $stable = 0;
    private final List<ChatListItemUi> chats;
    private final String conversationAvatarUrl;
    private final String conversationTitle;
    private final int currentUserId;
    private final boolean hasMoreChats;
    private final boolean hasMoreMessages;
    private final boolean isChatsLoading;
    private final boolean isChatsLoadingMore;
    private final boolean isMessagesLoading;
    private final boolean isMessagesLoadingMore;
    private final boolean isSendingMessage;
    private final boolean isSingleConversation;
    private final List<MessageBubbleUi> messages;
    private final ChatListItemUi selectedChat;

    public UserMessagesState() {
        this(null, false, false, false, null, null, false, false, false, false, null, null, 0, false, 16383, null);
    }

    public final List<ChatListItemUi> component1() {
        return this.chats;
    }

    /* renamed from: component10, reason: from getter */
    public final boolean getIsSendingMessage() {
        return this.isSendingMessage;
    }

    /* renamed from: component11, reason: from getter */
    public final String getConversationTitle() {
        return this.conversationTitle;
    }

    /* renamed from: component12, reason: from getter */
    public final String getConversationAvatarUrl() {
        return this.conversationAvatarUrl;
    }

    /* renamed from: component13, reason: from getter */
    public final int getCurrentUserId() {
        return this.currentUserId;
    }

    /* renamed from: component14, reason: from getter */
    public final boolean getIsSingleConversation() {
        return this.isSingleConversation;
    }

    /* renamed from: component2, reason: from getter */
    public final boolean getIsChatsLoading() {
        return this.isChatsLoading;
    }

    /* renamed from: component3, reason: from getter */
    public final boolean getIsChatsLoadingMore() {
        return this.isChatsLoadingMore;
    }

    /* renamed from: component4, reason: from getter */
    public final boolean getHasMoreChats() {
        return this.hasMoreChats;
    }

    /* renamed from: component5, reason: from getter */
    public final ChatListItemUi getSelectedChat() {
        return this.selectedChat;
    }

    public final List<MessageBubbleUi> component6() {
        return this.messages;
    }

    /* renamed from: component7, reason: from getter */
    public final boolean getIsMessagesLoading() {
        return this.isMessagesLoading;
    }

    /* renamed from: component8, reason: from getter */
    public final boolean getIsMessagesLoadingMore() {
        return this.isMessagesLoadingMore;
    }

    /* renamed from: component9, reason: from getter */
    public final boolean getHasMoreMessages() {
        return this.hasMoreMessages;
    }

    public final UserMessagesState copy(List<ChatListItemUi> chats, boolean isChatsLoading, boolean isChatsLoadingMore, boolean hasMoreChats, ChatListItemUi selectedChat, List<MessageBubbleUi> messages, boolean isMessagesLoading, boolean isMessagesLoadingMore, boolean hasMoreMessages, boolean isSendingMessage, String conversationTitle, String conversationAvatarUrl, int currentUserId, boolean isSingleConversation) {
        Intrinsics.checkNotNullParameter(chats, "chats");
        Intrinsics.checkNotNullParameter(messages, "messages");
        return new UserMessagesState(chats, isChatsLoading, isChatsLoadingMore, hasMoreChats, selectedChat, messages, isMessagesLoading, isMessagesLoadingMore, hasMoreMessages, isSendingMessage, conversationTitle, conversationAvatarUrl, currentUserId, isSingleConversation);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof UserMessagesState)) {
            return false;
        }
        UserMessagesState userMessagesState = (UserMessagesState) other;
        return Intrinsics.areEqual(this.chats, userMessagesState.chats) && this.isChatsLoading == userMessagesState.isChatsLoading && this.isChatsLoadingMore == userMessagesState.isChatsLoadingMore && this.hasMoreChats == userMessagesState.hasMoreChats && Intrinsics.areEqual(this.selectedChat, userMessagesState.selectedChat) && Intrinsics.areEqual(this.messages, userMessagesState.messages) && this.isMessagesLoading == userMessagesState.isMessagesLoading && this.isMessagesLoadingMore == userMessagesState.isMessagesLoadingMore && this.hasMoreMessages == userMessagesState.hasMoreMessages && this.isSendingMessage == userMessagesState.isSendingMessage && Intrinsics.areEqual(this.conversationTitle, userMessagesState.conversationTitle) && Intrinsics.areEqual(this.conversationAvatarUrl, userMessagesState.conversationAvatarUrl) && this.currentUserId == userMessagesState.currentUserId && this.isSingleConversation == userMessagesState.isSingleConversation;
    }

    public int hashCode() {
        int hashCode = ((((((this.chats.hashCode() * 31) + Boolean.hashCode(this.isChatsLoading)) * 31) + Boolean.hashCode(this.isChatsLoadingMore)) * 31) + Boolean.hashCode(this.hasMoreChats)) * 31;
        ChatListItemUi chatListItemUi = this.selectedChat;
        int hashCode2 = (((((((((((hashCode + (chatListItemUi == null ? 0 : chatListItemUi.hashCode())) * 31) + this.messages.hashCode()) * 31) + Boolean.hashCode(this.isMessagesLoading)) * 31) + Boolean.hashCode(this.isMessagesLoadingMore)) * 31) + Boolean.hashCode(this.hasMoreMessages)) * 31) + Boolean.hashCode(this.isSendingMessage)) * 31;
        String str = this.conversationTitle;
        int hashCode3 = (hashCode2 + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.conversationAvatarUrl;
        return ((((hashCode3 + (str2 != null ? str2.hashCode() : 0)) * 31) + Integer.hashCode(this.currentUserId)) * 31) + Boolean.hashCode(this.isSingleConversation);
    }

    public String toString() {
        return "UserMessagesState(chats=" + this.chats + ", isChatsLoading=" + this.isChatsLoading + ", isChatsLoadingMore=" + this.isChatsLoadingMore + ", hasMoreChats=" + this.hasMoreChats + ", selectedChat=" + this.selectedChat + ", messages=" + this.messages + ", isMessagesLoading=" + this.isMessagesLoading + ", isMessagesLoadingMore=" + this.isMessagesLoadingMore + ", hasMoreMessages=" + this.hasMoreMessages + ", isSendingMessage=" + this.isSendingMessage + ", conversationTitle=" + this.conversationTitle + ", conversationAvatarUrl=" + this.conversationAvatarUrl + ", currentUserId=" + this.currentUserId + ", isSingleConversation=" + this.isSingleConversation + ")";
    }

    public UserMessagesState(List<ChatListItemUi> chats, boolean z, boolean z2, boolean z3, ChatListItemUi chatListItemUi, List<MessageBubbleUi> messages, boolean z4, boolean z5, boolean z6, boolean z7, String str, String str2, int i, boolean z8) {
        Intrinsics.checkNotNullParameter(chats, "chats");
        Intrinsics.checkNotNullParameter(messages, "messages");
        this.chats = chats;
        this.isChatsLoading = z;
        this.isChatsLoadingMore = z2;
        this.hasMoreChats = z3;
        this.selectedChat = chatListItemUi;
        this.messages = messages;
        this.isMessagesLoading = z4;
        this.isMessagesLoadingMore = z5;
        this.hasMoreMessages = z6;
        this.isSendingMessage = z7;
        this.conversationTitle = str;
        this.conversationAvatarUrl = str2;
        this.currentUserId = i;
        this.isSingleConversation = z8;
    }

    public /* synthetic */ UserMessagesState(List list, boolean z, boolean z2, boolean z3, ChatListItemUi chatListItemUi, List list2, boolean z4, boolean z5, boolean z6, boolean z7, String str, String str2, int i, boolean z8, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this((i2 & 1) != 0 ? CollectionsKt.emptyList() : list, (i2 & 2) != 0 ? false : z, (i2 & 4) != 0 ? false : z2, (i2 & 8) != 0 ? false : z3, (i2 & 16) != 0 ? null : chatListItemUi, (i2 & 32) != 0 ? CollectionsKt.emptyList() : list2, (i2 & 64) != 0 ? false : z4, (i2 & 128) != 0 ? false : z5, (i2 & 256) != 0 ? false : z6, (i2 & 512) != 0 ? false : z7, (i2 & 1024) != 0 ? null : str, (i2 & 2048) == 0 ? str2 : null, (i2 & 4096) != 0 ? 0 : i, (i2 & 8192) == 0 ? z8 : false);
    }

    public final List<ChatListItemUi> getChats() {
        return this.chats;
    }

    public final boolean isChatsLoading() {
        return this.isChatsLoading;
    }

    public final boolean isChatsLoadingMore() {
        return this.isChatsLoadingMore;
    }

    public final boolean getHasMoreChats() {
        return this.hasMoreChats;
    }

    public final ChatListItemUi getSelectedChat() {
        return this.selectedChat;
    }

    public final List<MessageBubbleUi> getMessages() {
        return this.messages;
    }

    public final boolean isMessagesLoading() {
        return this.isMessagesLoading;
    }

    public final boolean isMessagesLoadingMore() {
        return this.isMessagesLoadingMore;
    }

    public final boolean getHasMoreMessages() {
        return this.hasMoreMessages;
    }

    public final boolean isSendingMessage() {
        return this.isSendingMessage;
    }

    public final String getConversationTitle() {
        return this.conversationTitle;
    }

    public final String getConversationAvatarUrl() {
        return this.conversationAvatarUrl;
    }

    public final int getCurrentUserId() {
        return this.currentUserId;
    }

    public final boolean isSingleConversation() {
        return this.isSingleConversation;
    }
}
