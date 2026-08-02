package org.betup.ui.fragment.user.compose.messages;

import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.modelmapper.internal.bytebuddy.description.method.MethodDescription;

/* compiled from: MessagesModels.kt */
@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0016\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u0093\u0001\u0012\u000e\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\u000e\b\u0002\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\u000e\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\u000e\b\u0002\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\u0014\b\u0002\u0010\b\u001a\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u00040\t\u0012\u000e\b\u0002\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\u000e\b\u0002\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\u0014\b\u0002\u0010\r\u001a\u000e\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\u00040\t¢\u0006\u0004\b\u000f\u0010\u0010J\u000f\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003HÆ\u0003J\u000f\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003HÆ\u0003J\u000f\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003HÆ\u0003J\u000f\u0010\u001e\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003HÆ\u0003J\u0015\u0010\u001f\u001a\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u00040\tHÆ\u0003J\u000f\u0010 \u001a\b\u0012\u0004\u0012\u00020\u00040\u0003HÆ\u0003J\u000f\u0010!\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003HÆ\u0003J\u0015\u0010\"\u001a\u000e\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\u00040\tHÆ\u0003J\u0095\u0001\u0010#\u001a\u00020\u00002\u000e\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\u000e\b\u0002\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\u000e\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\u000e\b\u0002\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\u0014\b\u0002\u0010\b\u001a\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u00040\t2\u000e\b\u0002\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\u000e\b\u0002\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\u0014\b\u0002\u0010\r\u001a\u000e\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\u00040\tHÆ\u0001J\u0013\u0010$\u001a\u00020%2\b\u0010&\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010'\u001a\u00020(HÖ\u0001J\t\u0010)\u001a\u00020\u000eHÖ\u0001R\u0017\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u0017\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0012R\u0017\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0012R\u0017\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0012R\u001d\u0010\b\u001a\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u00040\t¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0017R\u0017\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0012R\u0017\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u0012R\u001d\u0010\r\u001a\u000e\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\u00040\t¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u0017¨\u0006*"}, d2 = {"Lorg/betup/ui/fragment/user/compose/messages/UserMessagesCallbacks;", "", "onMessagesTabVisible", "Lkotlin/Function0;", "", "onRefreshChats", "onRefreshActiveChat", "onLoadMoreChats", "onChatSelected", "Lkotlin/Function1;", "Lorg/betup/ui/fragment/user/compose/messages/ChatListItemUi;", "onBackFromChat", "onLoadMoreMessages", "onSendMessage", "", MethodDescription.CONSTRUCTOR_INTERNAL_NAME, "(Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function1;)V", "getOnMessagesTabVisible", "()Lkotlin/jvm/functions/Function0;", "getOnRefreshChats", "getOnRefreshActiveChat", "getOnLoadMoreChats", "getOnChatSelected", "()Lkotlin/jvm/functions/Function1;", "getOnBackFromChat", "getOnLoadMoreMessages", "getOnSendMessage", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "copy", "equals", "", "other", "hashCode", "", "toString", "app_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes4.dex */
public final /* data */ class UserMessagesCallbacks {
    public static final int $stable = 0;
    private final Function0<Unit> onBackFromChat;
    private final Function1<ChatListItemUi, Unit> onChatSelected;
    private final Function0<Unit> onLoadMoreChats;
    private final Function0<Unit> onLoadMoreMessages;
    private final Function0<Unit> onMessagesTabVisible;
    private final Function0<Unit> onRefreshActiveChat;
    private final Function0<Unit> onRefreshChats;
    private final Function1<String, Unit> onSendMessage;

    public UserMessagesCallbacks() {
        this(null, null, null, null, null, null, null, null, 255, null);
    }

    public final Function0<Unit> component1() {
        return this.onMessagesTabVisible;
    }

    public final Function0<Unit> component2() {
        return this.onRefreshChats;
    }

    public final Function0<Unit> component3() {
        return this.onRefreshActiveChat;
    }

    public final Function0<Unit> component4() {
        return this.onLoadMoreChats;
    }

    public final Function1<ChatListItemUi, Unit> component5() {
        return this.onChatSelected;
    }

    public final Function0<Unit> component6() {
        return this.onBackFromChat;
    }

    public final Function0<Unit> component7() {
        return this.onLoadMoreMessages;
    }

    public final Function1<String, Unit> component8() {
        return this.onSendMessage;
    }

    public final UserMessagesCallbacks copy(Function0<Unit> onMessagesTabVisible, Function0<Unit> onRefreshChats, Function0<Unit> onRefreshActiveChat, Function0<Unit> onLoadMoreChats, Function1<? super ChatListItemUi, Unit> onChatSelected, Function0<Unit> onBackFromChat, Function0<Unit> onLoadMoreMessages, Function1<? super String, Unit> onSendMessage) {
        Intrinsics.checkNotNullParameter(onMessagesTabVisible, "onMessagesTabVisible");
        Intrinsics.checkNotNullParameter(onRefreshChats, "onRefreshChats");
        Intrinsics.checkNotNullParameter(onRefreshActiveChat, "onRefreshActiveChat");
        Intrinsics.checkNotNullParameter(onLoadMoreChats, "onLoadMoreChats");
        Intrinsics.checkNotNullParameter(onChatSelected, "onChatSelected");
        Intrinsics.checkNotNullParameter(onBackFromChat, "onBackFromChat");
        Intrinsics.checkNotNullParameter(onLoadMoreMessages, "onLoadMoreMessages");
        Intrinsics.checkNotNullParameter(onSendMessage, "onSendMessage");
        return new UserMessagesCallbacks(onMessagesTabVisible, onRefreshChats, onRefreshActiveChat, onLoadMoreChats, onChatSelected, onBackFromChat, onLoadMoreMessages, onSendMessage);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof UserMessagesCallbacks)) {
            return false;
        }
        UserMessagesCallbacks userMessagesCallbacks = (UserMessagesCallbacks) other;
        return Intrinsics.areEqual(this.onMessagesTabVisible, userMessagesCallbacks.onMessagesTabVisible) && Intrinsics.areEqual(this.onRefreshChats, userMessagesCallbacks.onRefreshChats) && Intrinsics.areEqual(this.onRefreshActiveChat, userMessagesCallbacks.onRefreshActiveChat) && Intrinsics.areEqual(this.onLoadMoreChats, userMessagesCallbacks.onLoadMoreChats) && Intrinsics.areEqual(this.onChatSelected, userMessagesCallbacks.onChatSelected) && Intrinsics.areEqual(this.onBackFromChat, userMessagesCallbacks.onBackFromChat) && Intrinsics.areEqual(this.onLoadMoreMessages, userMessagesCallbacks.onLoadMoreMessages) && Intrinsics.areEqual(this.onSendMessage, userMessagesCallbacks.onSendMessage);
    }

    public int hashCode() {
        return (((((((((((((this.onMessagesTabVisible.hashCode() * 31) + this.onRefreshChats.hashCode()) * 31) + this.onRefreshActiveChat.hashCode()) * 31) + this.onLoadMoreChats.hashCode()) * 31) + this.onChatSelected.hashCode()) * 31) + this.onBackFromChat.hashCode()) * 31) + this.onLoadMoreMessages.hashCode()) * 31) + this.onSendMessage.hashCode();
    }

    public String toString() {
        return "UserMessagesCallbacks(onMessagesTabVisible=" + this.onMessagesTabVisible + ", onRefreshChats=" + this.onRefreshChats + ", onRefreshActiveChat=" + this.onRefreshActiveChat + ", onLoadMoreChats=" + this.onLoadMoreChats + ", onChatSelected=" + this.onChatSelected + ", onBackFromChat=" + this.onBackFromChat + ", onLoadMoreMessages=" + this.onLoadMoreMessages + ", onSendMessage=" + this.onSendMessage + ")";
    }

    /* JADX WARN: Multi-variable type inference failed */
    public UserMessagesCallbacks(Function0<Unit> onMessagesTabVisible, Function0<Unit> onRefreshChats, Function0<Unit> onRefreshActiveChat, Function0<Unit> onLoadMoreChats, Function1<? super ChatListItemUi, Unit> onChatSelected, Function0<Unit> onBackFromChat, Function0<Unit> onLoadMoreMessages, Function1<? super String, Unit> onSendMessage) {
        Intrinsics.checkNotNullParameter(onMessagesTabVisible, "onMessagesTabVisible");
        Intrinsics.checkNotNullParameter(onRefreshChats, "onRefreshChats");
        Intrinsics.checkNotNullParameter(onRefreshActiveChat, "onRefreshActiveChat");
        Intrinsics.checkNotNullParameter(onLoadMoreChats, "onLoadMoreChats");
        Intrinsics.checkNotNullParameter(onChatSelected, "onChatSelected");
        Intrinsics.checkNotNullParameter(onBackFromChat, "onBackFromChat");
        Intrinsics.checkNotNullParameter(onLoadMoreMessages, "onLoadMoreMessages");
        Intrinsics.checkNotNullParameter(onSendMessage, "onSendMessage");
        this.onMessagesTabVisible = onMessagesTabVisible;
        this.onRefreshChats = onRefreshChats;
        this.onRefreshActiveChat = onRefreshActiveChat;
        this.onLoadMoreChats = onLoadMoreChats;
        this.onChatSelected = onChatSelected;
        this.onBackFromChat = onBackFromChat;
        this.onLoadMoreMessages = onLoadMoreMessages;
        this.onSendMessage = onSendMessage;
    }

    public /* synthetic */ UserMessagesCallbacks(Function0 function0, Function0 function02, Function0 function03, Function0 function04, Function1 function1, Function0 function05, Function0 function06, Function1 function12, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? new Function0() { // from class: org.betup.ui.fragment.user.compose.messages.UserMessagesCallbacks$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                Unit unit;
                unit = Unit.INSTANCE;
                return unit;
            }
        } : function0, (i & 2) != 0 ? new Function0() { // from class: org.betup.ui.fragment.user.compose.messages.UserMessagesCallbacks$$ExternalSyntheticLambda1
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                Unit unit;
                unit = Unit.INSTANCE;
                return unit;
            }
        } : function02, (i & 4) != 0 ? new Function0() { // from class: org.betup.ui.fragment.user.compose.messages.UserMessagesCallbacks$$ExternalSyntheticLambda2
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                Unit unit;
                unit = Unit.INSTANCE;
                return unit;
            }
        } : function03, (i & 8) != 0 ? new Function0() { // from class: org.betup.ui.fragment.user.compose.messages.UserMessagesCallbacks$$ExternalSyntheticLambda3
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                Unit unit;
                unit = Unit.INSTANCE;
                return unit;
            }
        } : function04, (i & 16) != 0 ? new Function1() { // from class: org.betup.ui.fragment.user.compose.messages.UserMessagesCallbacks$$ExternalSyntheticLambda4
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                Unit _init_$lambda$4;
                _init_$lambda$4 = UserMessagesCallbacks._init_$lambda$4((ChatListItemUi) obj);
                return _init_$lambda$4;
            }
        } : function1, (i & 32) != 0 ? new Function0() { // from class: org.betup.ui.fragment.user.compose.messages.UserMessagesCallbacks$$ExternalSyntheticLambda5
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                Unit unit;
                unit = Unit.INSTANCE;
                return unit;
            }
        } : function05, (i & 64) != 0 ? new Function0() { // from class: org.betup.ui.fragment.user.compose.messages.UserMessagesCallbacks$$ExternalSyntheticLambda6
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                Unit unit;
                unit = Unit.INSTANCE;
                return unit;
            }
        } : function06, (i & 128) != 0 ? new Function1() { // from class: org.betup.ui.fragment.user.compose.messages.UserMessagesCallbacks$$ExternalSyntheticLambda7
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                Unit _init_$lambda$7;
                _init_$lambda$7 = UserMessagesCallbacks._init_$lambda$7((String) obj);
                return _init_$lambda$7;
            }
        } : function12);
    }

    public final Function0<Unit> getOnMessagesTabVisible() {
        return this.onMessagesTabVisible;
    }

    public final Function0<Unit> getOnRefreshChats() {
        return this.onRefreshChats;
    }

    public final Function0<Unit> getOnRefreshActiveChat() {
        return this.onRefreshActiveChat;
    }

    public final Function0<Unit> getOnLoadMoreChats() {
        return this.onLoadMoreChats;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit _init_$lambda$4(ChatListItemUi it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return Unit.INSTANCE;
    }

    public final Function1<ChatListItemUi, Unit> getOnChatSelected() {
        return this.onChatSelected;
    }

    public final Function0<Unit> getOnBackFromChat() {
        return this.onBackFromChat;
    }

    public final Function0<Unit> getOnLoadMoreMessages() {
        return this.onLoadMoreMessages;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit _init_$lambda$7(String it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return Unit.INSTANCE;
    }

    public final Function1<String, Unit> getOnSendMessage() {
        return this.onSendMessage;
    }
}
