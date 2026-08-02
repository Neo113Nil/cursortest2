package org.betup.ui.fragment.support.compose;

import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.modelmapper.internal.bytebuddy.description.method.MethodDescription;

/* compiled from: SupportModels.kt */
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\b\u0004\u0005\u0006\u0007\b\t\n\u000bB\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\b\f\r\u000e\u000f\u0010\u0011\u0012\u0013¨\u0006\u0014"}, d2 = {"Lorg/betup/ui/fragment/support/compose/SupportEvent;", "", MethodDescription.CONSTRUCTOR_INTERNAL_NAME, "()V", "ChatMessageSent", "ChatError", "FeedbackSent", "FeedbackError", "TicketCreated", "TicketError", "TicketClosed", "OpenCreateTicketDialog", "Lorg/betup/ui/fragment/support/compose/SupportEvent$ChatError;", "Lorg/betup/ui/fragment/support/compose/SupportEvent$ChatMessageSent;", "Lorg/betup/ui/fragment/support/compose/SupportEvent$FeedbackError;", "Lorg/betup/ui/fragment/support/compose/SupportEvent$FeedbackSent;", "Lorg/betup/ui/fragment/support/compose/SupportEvent$OpenCreateTicketDialog;", "Lorg/betup/ui/fragment/support/compose/SupportEvent$TicketClosed;", "Lorg/betup/ui/fragment/support/compose/SupportEvent$TicketCreated;", "Lorg/betup/ui/fragment/support/compose/SupportEvent$TicketError;", "app_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes4.dex */
public abstract class SupportEvent {
    public static final int $stable = 0;

    public /* synthetic */ SupportEvent(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    /* compiled from: SupportModels.kt */
    @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\b\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\b\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\n\u001a\u00020\u00032\b\u0010\u000b\u001a\u0004\u0018\u00010\fHÖ\u0003J\t\u0010\r\u001a\u00020\u000eHÖ\u0001J\t\u0010\u000f\u001a\u00020\u0010HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0011"}, d2 = {"Lorg/betup/ui/fragment/support/compose/SupportEvent$ChatMessageSent;", "Lorg/betup/ui/fragment/support/compose/SupportEvent;", "showDialog", "", MethodDescription.CONSTRUCTOR_INTERNAL_NAME, "(Z)V", "getShowDialog", "()Z", "component1", "copy", "equals", "other", "", "hashCode", "", "toString", "", "app_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class ChatMessageSent extends SupportEvent {
        public static final int $stable = 0;
        private final boolean showDialog;

        public static /* synthetic */ ChatMessageSent copy$default(ChatMessageSent chatMessageSent, boolean z, int i, Object obj) {
            if ((i & 1) != 0) {
                z = chatMessageSent.showDialog;
            }
            return chatMessageSent.copy(z);
        }

        /* renamed from: component1, reason: from getter */
        public final boolean getShowDialog() {
            return this.showDialog;
        }

        public final ChatMessageSent copy(boolean showDialog) {
            return new ChatMessageSent(showDialog);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof ChatMessageSent) && this.showDialog == ((ChatMessageSent) other).showDialog;
        }

        public int hashCode() {
            return Boolean.hashCode(this.showDialog);
        }

        public String toString() {
            return "ChatMessageSent(showDialog=" + this.showDialog + ")";
        }

        public ChatMessageSent(boolean z) {
            super(null);
            this.showDialog = z;
        }

        public final boolean getShowDialog() {
            return this.showDialog;
        }
    }

    private SupportEvent() {
    }

    /* compiled from: SupportModels.kt */
    @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\b\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\rHÖ\u0003J\t\u0010\u000e\u001a\u00020\u000fHÖ\u0001J\t\u0010\u0010\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0011"}, d2 = {"Lorg/betup/ui/fragment/support/compose/SupportEvent$ChatError;", "Lorg/betup/ui/fragment/support/compose/SupportEvent;", "message", "", MethodDescription.CONSTRUCTOR_INTERNAL_NAME, "(Ljava/lang/String;)V", "getMessage", "()Ljava/lang/String;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "app_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class ChatError extends SupportEvent {
        public static final int $stable = 0;
        private final String message;

        public static /* synthetic */ ChatError copy$default(ChatError chatError, String str, int i, Object obj) {
            if ((i & 1) != 0) {
                str = chatError.message;
            }
            return chatError.copy(str);
        }

        /* renamed from: component1, reason: from getter */
        public final String getMessage() {
            return this.message;
        }

        public final ChatError copy(String message) {
            Intrinsics.checkNotNullParameter(message, "message");
            return new ChatError(message);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof ChatError) && Intrinsics.areEqual(this.message, ((ChatError) other).message);
        }

        public int hashCode() {
            return this.message.hashCode();
        }

        public String toString() {
            return "ChatError(message=" + this.message + ")";
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public ChatError(String message) {
            super(null);
            Intrinsics.checkNotNullParameter(message, "message");
            this.message = message;
        }

        public final String getMessage() {
            return this.message;
        }
    }

    /* compiled from: SupportModels.kt */
    @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\n\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u001b\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u000b\u0010\n\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u000b\u001a\u0004\u0018\u00010\u0003HÆ\u0003J!\u0010\f\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0013\u0010\r\u001a\u00020\u000e2\b\u0010\u000f\u001a\u0004\u0018\u00010\u0010HÖ\u0003J\t\u0010\u0011\u001a\u00020\u0012HÖ\u0001J\t\u0010\u0013\u001a\u00020\u0003HÖ\u0001R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\b¨\u0006\u0014"}, d2 = {"Lorg/betup/ui/fragment/support/compose/SupportEvent$FeedbackSent;", "Lorg/betup/ui/fragment/support/compose/SupportEvent;", "messageType", "", "email", MethodDescription.CONSTRUCTOR_INTERNAL_NAME, "(Ljava/lang/String;Ljava/lang/String;)V", "getMessageType", "()Ljava/lang/String;", "getEmail", "component1", "component2", "copy", "equals", "", "other", "", "hashCode", "", "toString", "app_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class FeedbackSent extends SupportEvent {
        public static final int $stable = 0;
        private final String email;
        private final String messageType;

        public static /* synthetic */ FeedbackSent copy$default(FeedbackSent feedbackSent, String str, String str2, int i, Object obj) {
            if ((i & 1) != 0) {
                str = feedbackSent.messageType;
            }
            if ((i & 2) != 0) {
                str2 = feedbackSent.email;
            }
            return feedbackSent.copy(str, str2);
        }

        /* renamed from: component1, reason: from getter */
        public final String getMessageType() {
            return this.messageType;
        }

        /* renamed from: component2, reason: from getter */
        public final String getEmail() {
            return this.email;
        }

        public final FeedbackSent copy(String messageType, String email) {
            return new FeedbackSent(messageType, email);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof FeedbackSent)) {
                return false;
            }
            FeedbackSent feedbackSent = (FeedbackSent) other;
            return Intrinsics.areEqual(this.messageType, feedbackSent.messageType) && Intrinsics.areEqual(this.email, feedbackSent.email);
        }

        public int hashCode() {
            String str = this.messageType;
            int hashCode = (str == null ? 0 : str.hashCode()) * 31;
            String str2 = this.email;
            return hashCode + (str2 != null ? str2.hashCode() : 0);
        }

        public String toString() {
            return "FeedbackSent(messageType=" + this.messageType + ", email=" + this.email + ")";
        }

        public FeedbackSent(String str, String str2) {
            super(null);
            this.messageType = str;
            this.email = str2;
        }

        public final String getEmail() {
            return this.email;
        }

        public final String getMessageType() {
            return this.messageType;
        }
    }

    /* compiled from: SupportModels.kt */
    @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\b\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\rHÖ\u0003J\t\u0010\u000e\u001a\u00020\u000fHÖ\u0001J\t\u0010\u0010\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0011"}, d2 = {"Lorg/betup/ui/fragment/support/compose/SupportEvent$FeedbackError;", "Lorg/betup/ui/fragment/support/compose/SupportEvent;", "message", "", MethodDescription.CONSTRUCTOR_INTERNAL_NAME, "(Ljava/lang/String;)V", "getMessage", "()Ljava/lang/String;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "app_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class FeedbackError extends SupportEvent {
        public static final int $stable = 0;
        private final String message;

        public static /* synthetic */ FeedbackError copy$default(FeedbackError feedbackError, String str, int i, Object obj) {
            if ((i & 1) != 0) {
                str = feedbackError.message;
            }
            return feedbackError.copy(str);
        }

        /* renamed from: component1, reason: from getter */
        public final String getMessage() {
            return this.message;
        }

        public final FeedbackError copy(String message) {
            Intrinsics.checkNotNullParameter(message, "message");
            return new FeedbackError(message);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof FeedbackError) && Intrinsics.areEqual(this.message, ((FeedbackError) other).message);
        }

        public int hashCode() {
            return this.message.hashCode();
        }

        public String toString() {
            return "FeedbackError(message=" + this.message + ")";
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public FeedbackError(String message) {
            super(null);
            Intrinsics.checkNotNullParameter(message, "message");
            this.message = message;
        }

        public final String getMessage() {
            return this.message;
        }
    }

    /* compiled from: SupportModels.kt */
    @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\b\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\rHÖ\u0003J\t\u0010\u000e\u001a\u00020\u000fHÖ\u0001J\t\u0010\u0010\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0011"}, d2 = {"Lorg/betup/ui/fragment/support/compose/SupportEvent$TicketCreated;", "Lorg/betup/ui/fragment/support/compose/SupportEvent;", "chatId", "", MethodDescription.CONSTRUCTOR_INTERNAL_NAME, "(Ljava/lang/String;)V", "getChatId", "()Ljava/lang/String;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "app_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class TicketCreated extends SupportEvent {
        public static final int $stable = 0;
        private final String chatId;

        public static /* synthetic */ TicketCreated copy$default(TicketCreated ticketCreated, String str, int i, Object obj) {
            if ((i & 1) != 0) {
                str = ticketCreated.chatId;
            }
            return ticketCreated.copy(str);
        }

        /* renamed from: component1, reason: from getter */
        public final String getChatId() {
            return this.chatId;
        }

        public final TicketCreated copy(String chatId) {
            Intrinsics.checkNotNullParameter(chatId, "chatId");
            return new TicketCreated(chatId);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof TicketCreated) && Intrinsics.areEqual(this.chatId, ((TicketCreated) other).chatId);
        }

        public int hashCode() {
            return this.chatId.hashCode();
        }

        public String toString() {
            return "TicketCreated(chatId=" + this.chatId + ")";
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public TicketCreated(String chatId) {
            super(null);
            Intrinsics.checkNotNullParameter(chatId, "chatId");
            this.chatId = chatId;
        }

        public final String getChatId() {
            return this.chatId;
        }
    }

    /* compiled from: SupportModels.kt */
    @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\b\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\rHÖ\u0003J\t\u0010\u000e\u001a\u00020\u000fHÖ\u0001J\t\u0010\u0010\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0011"}, d2 = {"Lorg/betup/ui/fragment/support/compose/SupportEvent$TicketError;", "Lorg/betup/ui/fragment/support/compose/SupportEvent;", "message", "", MethodDescription.CONSTRUCTOR_INTERNAL_NAME, "(Ljava/lang/String;)V", "getMessage", "()Ljava/lang/String;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "app_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class TicketError extends SupportEvent {
        public static final int $stable = 0;
        private final String message;

        public static /* synthetic */ TicketError copy$default(TicketError ticketError, String str, int i, Object obj) {
            if ((i & 1) != 0) {
                str = ticketError.message;
            }
            return ticketError.copy(str);
        }

        /* renamed from: component1, reason: from getter */
        public final String getMessage() {
            return this.message;
        }

        public final TicketError copy(String message) {
            Intrinsics.checkNotNullParameter(message, "message");
            return new TicketError(message);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof TicketError) && Intrinsics.areEqual(this.message, ((TicketError) other).message);
        }

        public int hashCode() {
            return this.message.hashCode();
        }

        public String toString() {
            return "TicketError(message=" + this.message + ")";
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public TicketError(String message) {
            super(null);
            Intrinsics.checkNotNullParameter(message, "message");
            this.message = message;
        }

        public final String getMessage() {
            return this.message;
        }
    }

    /* compiled from: SupportModels.kt */
    @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\b\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\rHÖ\u0003J\t\u0010\u000e\u001a\u00020\u000fHÖ\u0001J\t\u0010\u0010\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0011"}, d2 = {"Lorg/betup/ui/fragment/support/compose/SupportEvent$TicketClosed;", "Lorg/betup/ui/fragment/support/compose/SupportEvent;", "chatId", "", MethodDescription.CONSTRUCTOR_INTERNAL_NAME, "(Ljava/lang/String;)V", "getChatId", "()Ljava/lang/String;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "app_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class TicketClosed extends SupportEvent {
        public static final int $stable = 0;
        private final String chatId;

        public static /* synthetic */ TicketClosed copy$default(TicketClosed ticketClosed, String str, int i, Object obj) {
            if ((i & 1) != 0) {
                str = ticketClosed.chatId;
            }
            return ticketClosed.copy(str);
        }

        /* renamed from: component1, reason: from getter */
        public final String getChatId() {
            return this.chatId;
        }

        public final TicketClosed copy(String chatId) {
            Intrinsics.checkNotNullParameter(chatId, "chatId");
            return new TicketClosed(chatId);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof TicketClosed) && Intrinsics.areEqual(this.chatId, ((TicketClosed) other).chatId);
        }

        public int hashCode() {
            return this.chatId.hashCode();
        }

        public String toString() {
            return "TicketClosed(chatId=" + this.chatId + ")";
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public TicketClosed(String chatId) {
            super(null);
            Intrinsics.checkNotNullParameter(chatId, "chatId");
            this.chatId = chatId;
        }

        public final String getChatId() {
            return this.chatId;
        }
    }

    /* compiled from: SupportModels.kt */
    @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b\n\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B#\u0012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u000f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003HÆ\u0003J\u000f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003HÆ\u0003J)\u0010\r\u001a\u00020\u00002\u000e\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\u000e\b\u0002\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003HÆ\u0001J\u0013\u0010\u000e\u001a\u00020\u000f2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0011HÖ\u0003J\t\u0010\u0012\u001a\u00020\u0013HÖ\u0001J\t\u0010\u0014\u001a\u00020\u0004HÖ\u0001R\u0017\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0017\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\t¨\u0006\u0015"}, d2 = {"Lorg/betup/ui/fragment/support/compose/SupportEvent$OpenCreateTicketDialog;", "Lorg/betup/ui/fragment/support/compose/SupportEvent;", "categoryIds", "", "", "categoryNames", MethodDescription.CONSTRUCTOR_INTERNAL_NAME, "(Ljava/util/List;Ljava/util/List;)V", "getCategoryIds", "()Ljava/util/List;", "getCategoryNames", "component1", "component2", "copy", "equals", "", "other", "", "hashCode", "", "toString", "app_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class OpenCreateTicketDialog extends SupportEvent {
        public static final int $stable = 8;
        private final List<String> categoryIds;
        private final List<String> categoryNames;

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ OpenCreateTicketDialog copy$default(OpenCreateTicketDialog openCreateTicketDialog, List list, List list2, int i, Object obj) {
            if ((i & 1) != 0) {
                list = openCreateTicketDialog.categoryIds;
            }
            if ((i & 2) != 0) {
                list2 = openCreateTicketDialog.categoryNames;
            }
            return openCreateTicketDialog.copy(list, list2);
        }

        public final List<String> component1() {
            return this.categoryIds;
        }

        public final List<String> component2() {
            return this.categoryNames;
        }

        public final OpenCreateTicketDialog copy(List<String> categoryIds, List<String> categoryNames) {
            Intrinsics.checkNotNullParameter(categoryIds, "categoryIds");
            Intrinsics.checkNotNullParameter(categoryNames, "categoryNames");
            return new OpenCreateTicketDialog(categoryIds, categoryNames);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof OpenCreateTicketDialog)) {
                return false;
            }
            OpenCreateTicketDialog openCreateTicketDialog = (OpenCreateTicketDialog) other;
            return Intrinsics.areEqual(this.categoryIds, openCreateTicketDialog.categoryIds) && Intrinsics.areEqual(this.categoryNames, openCreateTicketDialog.categoryNames);
        }

        public int hashCode() {
            return (this.categoryIds.hashCode() * 31) + this.categoryNames.hashCode();
        }

        public String toString() {
            return "OpenCreateTicketDialog(categoryIds=" + this.categoryIds + ", categoryNames=" + this.categoryNames + ")";
        }

        public final List<String> getCategoryIds() {
            return this.categoryIds;
        }

        public final List<String> getCategoryNames() {
            return this.categoryNames;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OpenCreateTicketDialog(List<String> categoryIds, List<String> categoryNames) {
            super(null);
            Intrinsics.checkNotNullParameter(categoryIds, "categoryIds");
            Intrinsics.checkNotNullParameter(categoryNames, "categoryNames");
            this.categoryIds = categoryIds;
            this.categoryNames = categoryNames;
        }
    }
}
