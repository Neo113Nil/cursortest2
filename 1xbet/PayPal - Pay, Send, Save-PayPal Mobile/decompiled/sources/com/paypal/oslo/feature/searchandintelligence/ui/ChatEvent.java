package com.paypal.oslo.feature.searchandintelligence.ui;

@kotlin.Metadata(d1 = {"\u0000X\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0019\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\b0\u0018\u00002\u00020\u0001:\u0012\n\u000b\f\r\u000e\u000f\u0010\u0011\u0012\u0013\u0014\u0015\u0016\u0017\u0018\u0019\u001a\u001bB\u0011\b\u0004\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u001a\u0010\u0006\u001a\u00020\u00028\u0017X\u0096\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\b\u0010\t\u0082\u0001\u0012\u001c\u001d\u001e\u001f !\"#$%&'()*+,-"}, d2 = {"Lcom/paypal/oslo/feature/searchandintelligence/ui/ChatEvent;", "Lcom/paypal/oslo/core/mvi/Event;", "", "p0", "<init>", "(Ljava/lang/String;)V", "name", "Ljava/lang/String;", "getName", "()Ljava/lang/String;", "VisibilityChanged", "SendMessage", "HandleNavigationWithPrompt", "InputTextChanged", "StartOver", "ContinueChat", "Retry", "DelegateSendMessage", "DelegateDisplayComponents", "DelegateExecuteAction", "SessionCreated", "SessionCreateFailed", "SubscribeToStream", "SseResponseReceived", "SseErrorReceived", "StreamCompleted", "ShowResumeOverlay", "Logout", "Lcom/paypal/oslo/feature/searchandintelligence/ui/ChatEvent$ContinueChat;", "Lcom/paypal/oslo/feature/searchandintelligence/ui/ChatEvent$DelegateDisplayComponents;", "Lcom/paypal/oslo/feature/searchandintelligence/ui/ChatEvent$DelegateExecuteAction;", "Lcom/paypal/oslo/feature/searchandintelligence/ui/ChatEvent$DelegateSendMessage;", "Lcom/paypal/oslo/feature/searchandintelligence/ui/ChatEvent$HandleNavigationWithPrompt;", "Lcom/paypal/oslo/feature/searchandintelligence/ui/ChatEvent$InputTextChanged;", "Lcom/paypal/oslo/feature/searchandintelligence/ui/ChatEvent$Logout;", "Lcom/paypal/oslo/feature/searchandintelligence/ui/ChatEvent$Retry;", "Lcom/paypal/oslo/feature/searchandintelligence/ui/ChatEvent$SendMessage;", "Lcom/paypal/oslo/feature/searchandintelligence/ui/ChatEvent$SessionCreateFailed;", "Lcom/paypal/oslo/feature/searchandintelligence/ui/ChatEvent$SessionCreated;", "Lcom/paypal/oslo/feature/searchandintelligence/ui/ChatEvent$ShowResumeOverlay;", "Lcom/paypal/oslo/feature/searchandintelligence/ui/ChatEvent$SseErrorReceived;", "Lcom/paypal/oslo/feature/searchandintelligence/ui/ChatEvent$SseResponseReceived;", "Lcom/paypal/oslo/feature/searchandintelligence/ui/ChatEvent$StartOver;", "Lcom/paypal/oslo/feature/searchandintelligence/ui/ChatEvent$StreamCompleted;", "Lcom/paypal/oslo/feature/searchandintelligence/ui/ChatEvent$SubscribeToStream;", "Lcom/paypal/oslo/feature/searchandintelligence/ui/ChatEvent$VisibilityChanged;"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes14.dex */
public abstract class ChatEvent implements com.paypal.oslo.core.mvi.Event {
    public static final int $stable = 0;
    private final java.lang.String name;

    private ChatEvent(java.lang.String str) {
        this.name = str;
    }

    @Override // com.paypal.oslo.core.mvi.Event
    public java.lang.String getName() {
        return this.name;
    }

    @kotlin.Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u001a\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\f\u001a\u00020\u00022\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000f\u001a\u00020\u000eHÖ\u0001¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0012\u001a\u00020\u0011HÖ\u0001¢\u0006\u0004\b\u0012\u0010\u0013R\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0014\u001a\u0004\b\u0003\u0010\u0007"}, d2 = {"Lcom/paypal/oslo/feature/searchandintelligence/ui/ChatEvent$VisibilityChanged;", "Lcom/paypal/oslo/feature/searchandintelligence/ui/ChatEvent;", "", "isVisible", "<init>", "(Z)V", "component1", "()Z", "copy", "(Z)Lcom/paypal/oslo/feature/searchandintelligence/ui/ChatEvent$VisibilityChanged;", "", "other", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "Z"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class VisibilityChanged extends com.paypal.oslo.feature.searchandintelligence.ui.ChatEvent {
        public static final int $stable = 0;
        private final boolean isVisible;

        public VisibilityChanged(boolean z) {
            super("VisibilityChanged", null);
            this.isVisible = z;
        }

        public final boolean isVisible() {
            return this.isVisible;
        }

        public final java.lang.String toString() {
            boolean z = this.isVisible;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("VisibilityChanged(isVisible=");
            sb.append(z);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            return java.lang.Boolean.hashCode(this.isVisible);
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof com.paypal.oslo.feature.searchandintelligence.ui.ChatEvent.VisibilityChanged) && this.isVisible == ((com.paypal.oslo.feature.searchandintelligence.ui.ChatEvent.VisibilityChanged) other).isVisible;
        }

        public final com.paypal.oslo.feature.searchandintelligence.ui.ChatEvent.VisibilityChanged copy(boolean isVisible) {
            return new com.paypal.oslo.feature.searchandintelligence.ui.ChatEvent.VisibilityChanged(isVisible);
        }

        /* renamed from: component1, reason: from getter */
        public final boolean getIsVisible() {
            return this.isVisible;
        }

        public static /* synthetic */ com.paypal.oslo.feature.searchandintelligence.ui.ChatEvent.VisibilityChanged copy$default(com.paypal.oslo.feature.searchandintelligence.ui.ChatEvent.VisibilityChanged visibilityChanged, boolean z, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                z = visibilityChanged.isVisible;
            }
            return visibilityChanged.copy(z);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u000b\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\n\b\u0086\b\u0018\u00002\u00020\u0001B#\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\n\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\f\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000e\u001a\u00020\u0006HÆ\u0003¢\u0006\u0004\b\u000e\u0010\u000fJ.\u0010\u0010\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u0006HÆ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u001a\u0010\u0015\u001a\u00020\u00142\b\u0010\u0013\u001a\u0004\u0018\u00010\u0012HÖ\u0003¢\u0006\u0004\b\u0015\u0010\u0016J\u0010\u0010\u0017\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0017\u0010\u000fJ\u0010\u0010\u0018\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0018\u0010\u000bR\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0019\u001a\u0004\b\u001a\u0010\u000bR\u001a\u0010\u0005\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u001b\u001a\u0004\b\u001c\u0010\rR\u001a\u0010\u0007\u001a\u00020\u00068\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010\u001d\u001a\u0004\b\u001e\u0010\u000f"}, d2 = {"Lcom/paypal/oslo/feature/searchandintelligence/ui/ChatEvent$SendMessage;", "Lcom/paypal/oslo/feature/searchandintelligence/ui/ChatEvent;", "", "text", "Lcom/paypal/oslo/feature/searchandintelligence/api/domain/RequestedMessageType;", "messageType", "", "maxLines", "<init>", "(Ljava/lang/String;Lcom/paypal/oslo/feature/searchandintelligence/api/domain/RequestedMessageType;I)V", "component1", "()Ljava/lang/String;", "component2", "()Lcom/paypal/oslo/feature/searchandintelligence/api/domain/RequestedMessageType;", "component3", "()I", "copy", "(Ljava/lang/String;Lcom/paypal/oslo/feature/searchandintelligence/api/domain/RequestedMessageType;I)Lcom/paypal/oslo/feature/searchandintelligence/ui/ChatEvent$SendMessage;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "hashCode", "toString", "Ljava/lang/String;", "getText", "Lcom/paypal/oslo/feature/searchandintelligence/api/domain/RequestedMessageType;", "getMessageType", com.visa.cbp.getEncExpo.warmup, "getMaxLines"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class SendMessage extends com.paypal.oslo.feature.searchandintelligence.ui.ChatEvent {
        public static final int $stable = 0;
        private final int maxLines;
        private final com.paypal.oslo.feature.searchandintelligence.api.domain.RequestedMessageType messageType;
        private final java.lang.String text;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public SendMessage(java.lang.String str, com.paypal.oslo.feature.searchandintelligence.api.domain.RequestedMessageType requestedMessageType, int i) {
            super("SendMessage", null);
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(requestedMessageType, "");
            this.text = str;
            this.messageType = requestedMessageType;
            this.maxLines = i;
        }

        public final java.lang.String getText() {
            return this.text;
        }

        public /* synthetic */ SendMessage(java.lang.String str, com.paypal.oslo.feature.searchandintelligence.api.domain.RequestedMessageType requestedMessageType, int i, int i2, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this(str, (i2 & 2) != 0 ? com.paypal.oslo.feature.searchandintelligence.api.domain.RequestedMessageType.USER_VISIBLE_REMOTE : requestedMessageType, (i2 & 4) != 0 ? Integer.MAX_VALUE : i);
        }

        public final com.paypal.oslo.feature.searchandintelligence.api.domain.RequestedMessageType getMessageType() {
            return this.messageType;
        }

        public final int getMaxLines() {
            return this.maxLines;
        }

        public final java.lang.String toString() {
            java.lang.String str = this.text;
            com.paypal.oslo.feature.searchandintelligence.api.domain.RequestedMessageType requestedMessageType = this.messageType;
            int i = this.maxLines;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("SendMessage(text=");
            sb.append(str);
            sb.append(", messageType=");
            sb.append(requestedMessageType);
            sb.append(", maxLines=");
            sb.append(i);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            return (((this.text.hashCode() * 31) + this.messageType.hashCode()) * 31) + java.lang.Integer.hashCode(this.maxLines);
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.searchandintelligence.ui.ChatEvent.SendMessage)) {
                return false;
            }
            com.paypal.oslo.feature.searchandintelligence.ui.ChatEvent.SendMessage sendMessage = (com.paypal.oslo.feature.searchandintelligence.ui.ChatEvent.SendMessage) other;
            return kotlin.jvm.internal.Intrinsics.areEqual(this.text, sendMessage.text) && this.messageType == sendMessage.messageType && this.maxLines == sendMessage.maxLines;
        }

        public final com.paypal.oslo.feature.searchandintelligence.ui.ChatEvent.SendMessage copy(java.lang.String text, com.paypal.oslo.feature.searchandintelligence.api.domain.RequestedMessageType messageType, int maxLines) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(text, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(messageType, "");
            return new com.paypal.oslo.feature.searchandintelligence.ui.ChatEvent.SendMessage(text, messageType, maxLines);
        }

        /* renamed from: component3, reason: from getter */
        public final int getMaxLines() {
            return this.maxLines;
        }

        /* renamed from: component2, reason: from getter */
        public final com.paypal.oslo.feature.searchandintelligence.api.domain.RequestedMessageType getMessageType() {
            return this.messageType;
        }

        /* renamed from: component1, reason: from getter */
        public final java.lang.String getText() {
            return this.text;
        }

        public static /* synthetic */ com.paypal.oslo.feature.searchandintelligence.ui.ChatEvent.SendMessage copy$default(com.paypal.oslo.feature.searchandintelligence.ui.ChatEvent.SendMessage sendMessage, java.lang.String str, com.paypal.oslo.feature.searchandintelligence.api.domain.RequestedMessageType requestedMessageType, int i, int i2, java.lang.Object obj) {
            if ((i2 & 1) != 0) {
                str = sendMessage.text;
            }
            if ((i2 & 2) != 0) {
                requestedMessageType = sendMessage.messageType;
            }
            if ((i2 & 4) != 0) {
                i = sendMessage.maxLines;
            }
            return sendMessage.copy(str, requestedMessageType, i);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\b\b\u0086\b\u0018\u00002\u00020\u0001B#\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\t\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\u000b\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\u000b\u0010\fJ\u0012\u0010\r\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\r\u0010\nJ0\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0002HÆ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u001a\u0010\u0013\u001a\u00020\u00122\b\u0010\u0011\u001a\u0004\u0018\u00010\u0010HÖ\u0003¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0016\u001a\u00020\u0015HÖ\u0001¢\u0006\u0004\b\u0016\u0010\u0017J\u0010\u0010\u0018\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0018\u0010\nR\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0019\u001a\u0004\b\u001a\u0010\nR\u001a\u0010\u0005\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u001b\u001a\u0004\b\u001c\u0010\fR\u001c\u0010\u0006\u001a\u0004\u0018\u00010\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u0019\u001a\u0004\b\u001d\u0010\n"}, d2 = {"Lcom/paypal/oslo/feature/searchandintelligence/ui/ChatEvent$HandleNavigationWithPrompt;", "Lcom/paypal/oslo/feature/searchandintelligence/ui/ChatEvent;", "", "prompt", "Lcom/paypal/oslo/feature/searchandintelligence/api/domain/RequestedMessageType;", "messageType", "source", "<init>", "(Ljava/lang/String;Lcom/paypal/oslo/feature/searchandintelligence/api/domain/RequestedMessageType;Ljava/lang/String;)V", "component1", "()Ljava/lang/String;", "component2", "()Lcom/paypal/oslo/feature/searchandintelligence/api/domain/RequestedMessageType;", "component3", "copy", "(Ljava/lang/String;Lcom/paypal/oslo/feature/searchandintelligence/api/domain/RequestedMessageType;Ljava/lang/String;)Lcom/paypal/oslo/feature/searchandintelligence/ui/ChatEvent$HandleNavigationWithPrompt;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "Ljava/lang/String;", "getPrompt", "Lcom/paypal/oslo/feature/searchandintelligence/api/domain/RequestedMessageType;", "getMessageType", "getSource"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class HandleNavigationWithPrompt extends com.paypal.oslo.feature.searchandintelligence.ui.ChatEvent {
        public static final int $stable = 0;
        private final com.paypal.oslo.feature.searchandintelligence.api.domain.RequestedMessageType messageType;
        private final java.lang.String prompt;
        private final java.lang.String source;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public HandleNavigationWithPrompt(java.lang.String str, com.paypal.oslo.feature.searchandintelligence.api.domain.RequestedMessageType requestedMessageType, java.lang.String str2) {
            super("HandleNavigationWithPrompt", null);
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(requestedMessageType, "");
            this.prompt = str;
            this.messageType = requestedMessageType;
            this.source = str2;
        }

        public /* synthetic */ HandleNavigationWithPrompt(java.lang.String str, com.paypal.oslo.feature.searchandintelligence.api.domain.RequestedMessageType requestedMessageType, java.lang.String str2, int i, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this(str, requestedMessageType, (i & 4) != 0 ? null : str2);
        }

        public final java.lang.String getPrompt() {
            return this.prompt;
        }

        public final com.paypal.oslo.feature.searchandintelligence.api.domain.RequestedMessageType getMessageType() {
            return this.messageType;
        }

        public final java.lang.String getSource() {
            return this.source;
        }

        public final java.lang.String toString() {
            java.lang.String str = this.prompt;
            com.paypal.oslo.feature.searchandintelligence.api.domain.RequestedMessageType requestedMessageType = this.messageType;
            java.lang.String str2 = this.source;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("HandleNavigationWithPrompt(prompt=");
            sb.append(str);
            sb.append(", messageType=");
            sb.append(requestedMessageType);
            sb.append(", source=");
            sb.append(str2);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            int hashCode = this.prompt.hashCode();
            int hashCode2 = this.messageType.hashCode();
            java.lang.String str = this.source;
            return (((hashCode * 31) + hashCode2) * 31) + (str == null ? 0 : str.hashCode());
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.searchandintelligence.ui.ChatEvent.HandleNavigationWithPrompt)) {
                return false;
            }
            com.paypal.oslo.feature.searchandintelligence.ui.ChatEvent.HandleNavigationWithPrompt handleNavigationWithPrompt = (com.paypal.oslo.feature.searchandintelligence.ui.ChatEvent.HandleNavigationWithPrompt) other;
            return kotlin.jvm.internal.Intrinsics.areEqual(this.prompt, handleNavigationWithPrompt.prompt) && this.messageType == handleNavigationWithPrompt.messageType && kotlin.jvm.internal.Intrinsics.areEqual(this.source, handleNavigationWithPrompt.source);
        }

        public final com.paypal.oslo.feature.searchandintelligence.ui.ChatEvent.HandleNavigationWithPrompt copy(java.lang.String prompt, com.paypal.oslo.feature.searchandintelligence.api.domain.RequestedMessageType messageType, java.lang.String source) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(prompt, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(messageType, "");
            return new com.paypal.oslo.feature.searchandintelligence.ui.ChatEvent.HandleNavigationWithPrompt(prompt, messageType, source);
        }

        /* renamed from: component3, reason: from getter */
        public final java.lang.String getSource() {
            return this.source;
        }

        /* renamed from: component2, reason: from getter */
        public final com.paypal.oslo.feature.searchandintelligence.api.domain.RequestedMessageType getMessageType() {
            return this.messageType;
        }

        /* renamed from: component1, reason: from getter */
        public final java.lang.String getPrompt() {
            return this.prompt;
        }

        public static /* synthetic */ com.paypal.oslo.feature.searchandintelligence.ui.ChatEvent.HandleNavigationWithPrompt copy$default(com.paypal.oslo.feature.searchandintelligence.ui.ChatEvent.HandleNavigationWithPrompt handleNavigationWithPrompt, java.lang.String str, com.paypal.oslo.feature.searchandintelligence.api.domain.RequestedMessageType requestedMessageType, java.lang.String str2, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                str = handleNavigationWithPrompt.prompt;
            }
            if ((i & 2) != 0) {
                requestedMessageType = handleNavigationWithPrompt.messageType;
            }
            if ((i & 4) != 0) {
                str2 = handleNavigationWithPrompt.source;
            }
            return handleNavigationWithPrompt.copy(str, requestedMessageType, str2);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0005\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u001a\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0012\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0012\u0010\u0007R\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0013\u001a\u0004\b\u0014\u0010\u0007"}, d2 = {"Lcom/paypal/oslo/feature/searchandintelligence/ui/ChatEvent$InputTextChanged;", "Lcom/paypal/oslo/feature/searchandintelligence/ui/ChatEvent;", "", "text", "<init>", "(Ljava/lang/String;)V", "component1", "()Ljava/lang/String;", "copy", "(Ljava/lang/String;)Lcom/paypal/oslo/feature/searchandintelligence/ui/ChatEvent$InputTextChanged;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "Ljava/lang/String;", "getText"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class InputTextChanged extends com.paypal.oslo.feature.searchandintelligence.ui.ChatEvent {
        public static final int $stable = 0;
        private final java.lang.String text;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public InputTextChanged(java.lang.String str) {
            super("InputTextChanged", null);
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
            this.text = str;
        }

        public final java.lang.String getText() {
            return this.text;
        }

        public final java.lang.String toString() {
            java.lang.String str = this.text;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("InputTextChanged(text=");
            sb.append(str);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            return this.text.hashCode();
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof com.paypal.oslo.feature.searchandintelligence.ui.ChatEvent.InputTextChanged) && kotlin.jvm.internal.Intrinsics.areEqual(this.text, ((com.paypal.oslo.feature.searchandintelligence.ui.ChatEvent.InputTextChanged) other).text);
        }

        public final com.paypal.oslo.feature.searchandintelligence.ui.ChatEvent.InputTextChanged copy(java.lang.String text) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(text, "");
            return new com.paypal.oslo.feature.searchandintelligence.ui.ChatEvent.InputTextChanged(text);
        }

        /* renamed from: component1, reason: from getter */
        public final java.lang.String getText() {
            return this.text;
        }

        public static /* synthetic */ com.paypal.oslo.feature.searchandintelligence.ui.ChatEvent.InputTextChanged copy$default(com.paypal.oslo.feature.searchandintelligence.ui.ChatEvent.InputTextChanged inputTextChanged, java.lang.String str, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                str = inputTextChanged.text;
            }
            return inputTextChanged.copy(str);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001a\u0010\u0007\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004HÖ\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000e"}, d2 = {"Lcom/paypal/oslo/feature/searchandintelligence/ui/ChatEvent$StartOver;", "Lcom/paypal/oslo/feature/searchandintelligence/ui/ChatEvent;", "<init>", "()V", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class StartOver extends com.paypal.oslo.feature.searchandintelligence.ui.ChatEvent {
        public static final int $stable = 0;
        public static final com.paypal.oslo.feature.searchandintelligence.ui.ChatEvent.StartOver INSTANCE = new com.paypal.oslo.feature.searchandintelligence.ui.ChatEvent.StartOver();

        public final int hashCode() {
            return 2142673953;
        }

        private StartOver() {
            super("StartOver", null);
        }

        public final java.lang.String toString() {
            return "StartOver";
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.searchandintelligence.ui.ChatEvent.StartOver)) {
                return false;
            }
            return true;
        }
    }

    @kotlin.Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001a\u0010\u0007\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004HÖ\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000e"}, d2 = {"Lcom/paypal/oslo/feature/searchandintelligence/ui/ChatEvent$ContinueChat;", "Lcom/paypal/oslo/feature/searchandintelligence/ui/ChatEvent;", "<init>", "()V", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class ContinueChat extends com.paypal.oslo.feature.searchandintelligence.ui.ChatEvent {
        public static final int $stable = 0;
        public static final com.paypal.oslo.feature.searchandintelligence.ui.ChatEvent.ContinueChat INSTANCE = new com.paypal.oslo.feature.searchandintelligence.ui.ChatEvent.ContinueChat();

        public final int hashCode() {
            return 1067469044;
        }

        private ContinueChat() {
            super("ContinueChat", null);
        }

        public final java.lang.String toString() {
            return "ContinueChat";
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.searchandintelligence.ui.ChatEvent.ContinueChat)) {
                return false;
            }
            return true;
        }
    }

    @kotlin.Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001a\u0010\u0007\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004HÖ\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000e"}, d2 = {"Lcom/paypal/oslo/feature/searchandintelligence/ui/ChatEvent$Retry;", "Lcom/paypal/oslo/feature/searchandintelligence/ui/ChatEvent;", "<init>", "()V", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class Retry extends com.paypal.oslo.feature.searchandintelligence.ui.ChatEvent {
        public static final int $stable = 0;
        public static final com.paypal.oslo.feature.searchandintelligence.ui.ChatEvent.Retry INSTANCE = new com.paypal.oslo.feature.searchandintelligence.ui.ChatEvent.Retry();

        public final int hashCode() {
            return 1055057907;
        }

        private Retry() {
            super("Retry", null);
        }

        public final java.lang.String toString() {
            return "Retry";
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.searchandintelligence.ui.ChatEvent.Retry)) {
                return false;
            }
            return true;
        }
    }

    @kotlin.Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u000b\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\n\b\u0086\b\u0018\u00002\u00020\u0001B!\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\n\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\f\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000e\u001a\u00020\u0006HÆ\u0003¢\u0006\u0004\b\u000e\u0010\u000fJ.\u0010\u0010\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u0006HÆ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u001a\u0010\u0015\u001a\u00020\u00142\b\u0010\u0013\u001a\u0004\u0018\u00010\u0012HÖ\u0003¢\u0006\u0004\b\u0015\u0010\u0016J\u0010\u0010\u0017\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0017\u0010\u000fJ\u0010\u0010\u0018\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0018\u0010\u000bR\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0019\u001a\u0004\b\u001a\u0010\u000bR\u001a\u0010\u0005\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u001b\u001a\u0004\b\u001c\u0010\rR\u001a\u0010\u0007\u001a\u00020\u00068\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010\u001d\u001a\u0004\b\u001e\u0010\u000f"}, d2 = {"Lcom/paypal/oslo/feature/searchandintelligence/ui/ChatEvent$DelegateSendMessage;", "Lcom/paypal/oslo/feature/searchandintelligence/ui/ChatEvent;", "", "text", "Lcom/paypal/oslo/feature/searchandintelligence/api/domain/RequestedMessageType;", "messageType", "", "maxLines", "<init>", "(Ljava/lang/String;Lcom/paypal/oslo/feature/searchandintelligence/api/domain/RequestedMessageType;I)V", "component1", "()Ljava/lang/String;", "component2", "()Lcom/paypal/oslo/feature/searchandintelligence/api/domain/RequestedMessageType;", "component3", "()I", "copy", "(Ljava/lang/String;Lcom/paypal/oslo/feature/searchandintelligence/api/domain/RequestedMessageType;I)Lcom/paypal/oslo/feature/searchandintelligence/ui/ChatEvent$DelegateSendMessage;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "hashCode", "toString", "Ljava/lang/String;", "getText", "Lcom/paypal/oslo/feature/searchandintelligence/api/domain/RequestedMessageType;", "getMessageType", com.visa.cbp.getEncExpo.warmup, "getMaxLines"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class DelegateSendMessage extends com.paypal.oslo.feature.searchandintelligence.ui.ChatEvent {
        public static final int $stable = 0;
        private final int maxLines;
        private final com.paypal.oslo.feature.searchandintelligence.api.domain.RequestedMessageType messageType;
        private final java.lang.String text;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public DelegateSendMessage(java.lang.String str, com.paypal.oslo.feature.searchandintelligence.api.domain.RequestedMessageType requestedMessageType, int i) {
            super("DelegateSendMessage", null);
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(requestedMessageType, "");
            this.text = str;
            this.messageType = requestedMessageType;
            this.maxLines = i;
        }

        public /* synthetic */ DelegateSendMessage(java.lang.String str, com.paypal.oslo.feature.searchandintelligence.api.domain.RequestedMessageType requestedMessageType, int i, int i2, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this(str, requestedMessageType, (i2 & 4) != 0 ? Integer.MAX_VALUE : i);
        }

        public final java.lang.String getText() {
            return this.text;
        }

        public final com.paypal.oslo.feature.searchandintelligence.api.domain.RequestedMessageType getMessageType() {
            return this.messageType;
        }

        public final int getMaxLines() {
            return this.maxLines;
        }

        public final java.lang.String toString() {
            java.lang.String str = this.text;
            com.paypal.oslo.feature.searchandintelligence.api.domain.RequestedMessageType requestedMessageType = this.messageType;
            int i = this.maxLines;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("DelegateSendMessage(text=");
            sb.append(str);
            sb.append(", messageType=");
            sb.append(requestedMessageType);
            sb.append(", maxLines=");
            sb.append(i);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            return (((this.text.hashCode() * 31) + this.messageType.hashCode()) * 31) + java.lang.Integer.hashCode(this.maxLines);
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.searchandintelligence.ui.ChatEvent.DelegateSendMessage)) {
                return false;
            }
            com.paypal.oslo.feature.searchandintelligence.ui.ChatEvent.DelegateSendMessage delegateSendMessage = (com.paypal.oslo.feature.searchandintelligence.ui.ChatEvent.DelegateSendMessage) other;
            return kotlin.jvm.internal.Intrinsics.areEqual(this.text, delegateSendMessage.text) && this.messageType == delegateSendMessage.messageType && this.maxLines == delegateSendMessage.maxLines;
        }

        public final com.paypal.oslo.feature.searchandintelligence.ui.ChatEvent.DelegateSendMessage copy(java.lang.String text, com.paypal.oslo.feature.searchandintelligence.api.domain.RequestedMessageType messageType, int maxLines) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(text, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(messageType, "");
            return new com.paypal.oslo.feature.searchandintelligence.ui.ChatEvent.DelegateSendMessage(text, messageType, maxLines);
        }

        /* renamed from: component3, reason: from getter */
        public final int getMaxLines() {
            return this.maxLines;
        }

        /* renamed from: component2, reason: from getter */
        public final com.paypal.oslo.feature.searchandintelligence.api.domain.RequestedMessageType getMessageType() {
            return this.messageType;
        }

        /* renamed from: component1, reason: from getter */
        public final java.lang.String getText() {
            return this.text;
        }

        public static /* synthetic */ com.paypal.oslo.feature.searchandintelligence.ui.ChatEvent.DelegateSendMessage copy$default(com.paypal.oslo.feature.searchandintelligence.ui.ChatEvent.DelegateSendMessage delegateSendMessage, java.lang.String str, com.paypal.oslo.feature.searchandintelligence.api.domain.RequestedMessageType requestedMessageType, int i, int i2, java.lang.Object obj) {
            if ((i2 & 1) != 0) {
                str = delegateSendMessage.text;
            }
            if ((i2 & 2) != 0) {
                requestedMessageType = delegateSendMessage.messageType;
            }
            if ((i2 & 4) != 0) {
                i = delegateSendMessage.maxLines;
            }
            return delegateSendMessage.copy(str, requestedMessageType, i);
        }
    }

    @kotlin.Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001B\u0015\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u0016\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002HÆ\u0003¢\u0006\u0004\b\u0007\u0010\bJ \u0010\t\u001a\u00020\u00002\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002HÆ\u0001¢\u0006\u0004\b\t\u0010\nJ\u001a\u0010\u000e\u001a\u00020\r2\b\u0010\f\u001a\u0004\u0018\u00010\u000bHÖ\u0003¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0011\u001a\u00020\u0010HÖ\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0014\u001a\u00020\u0013HÖ\u0001¢\u0006\u0004\b\u0014\u0010\u0015R\u001d\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0007¢\u0006\f\n\u0004\b\u0004\u0010\u0016\u001a\u0004\b\u0017\u0010\b"}, d2 = {"Lcom/paypal/oslo/feature/searchandintelligence/ui/ChatEvent$DelegateDisplayComponents;", "Lcom/paypal/oslo/feature/searchandintelligence/ui/ChatEvent;", "", "Lcom/paypal/oslo/feature/searchandintelligence/api/component/UiComponent;", "components", "<init>", "(Ljava/util/List;)V", "component1", "()Ljava/util/List;", "copy", "(Ljava/util/List;)Lcom/paypal/oslo/feature/searchandintelligence/ui/ChatEvent$DelegateDisplayComponents;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "Ljava/util/List;", "getComponents"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class DelegateDisplayComponents extends com.paypal.oslo.feature.searchandintelligence.ui.ChatEvent {
        public static final int $stable = 8;
        private final java.util.List<com.paypal.oslo.feature.searchandintelligence.api.component.UiComponent> components;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public DelegateDisplayComponents(java.util.List<? extends com.paypal.oslo.feature.searchandintelligence.api.component.UiComponent> list) {
            super("DelegateDisplayComponents", null);
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(list, "");
            this.components = list;
        }

        public final java.util.List<com.paypal.oslo.feature.searchandintelligence.api.component.UiComponent> getComponents() {
            return this.components;
        }

        public final java.lang.String toString() {
            java.util.List<com.paypal.oslo.feature.searchandintelligence.api.component.UiComponent> list = this.components;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("DelegateDisplayComponents(components=");
            sb.append(list);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            return this.components.hashCode();
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof com.paypal.oslo.feature.searchandintelligence.ui.ChatEvent.DelegateDisplayComponents) && kotlin.jvm.internal.Intrinsics.areEqual(this.components, ((com.paypal.oslo.feature.searchandintelligence.ui.ChatEvent.DelegateDisplayComponents) other).components);
        }

        public final com.paypal.oslo.feature.searchandintelligence.ui.ChatEvent.DelegateDisplayComponents copy(java.util.List<? extends com.paypal.oslo.feature.searchandintelligence.api.component.UiComponent> components) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(components, "");
            return new com.paypal.oslo.feature.searchandintelligence.ui.ChatEvent.DelegateDisplayComponents(components);
        }

        public final java.util.List<com.paypal.oslo.feature.searchandintelligence.api.component.UiComponent> component1() {
            return this.components;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ com.paypal.oslo.feature.searchandintelligence.ui.ChatEvent.DelegateDisplayComponents copy$default(com.paypal.oslo.feature.searchandintelligence.ui.ChatEvent.DelegateDisplayComponents delegateDisplayComponents, java.util.List list, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                list = delegateDisplayComponents.components;
            }
            return delegateDisplayComponents.copy(list);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u001a\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0013\u001a\u00020\u0012HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014R\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0015\u001a\u0004\b\u0016\u0010\u0007"}, d2 = {"Lcom/paypal/oslo/feature/searchandintelligence/ui/ChatEvent$DelegateExecuteAction;", "Lcom/paypal/oslo/feature/searchandintelligence/ui/ChatEvent;", "Lcom/paypal/oslo/feature/searchandintelligence/api/domain/ActionContent;", com.paypal.oslo.feature.inappcheckout.domain.util.LoggerParameterKeys.ACTION_CONTENT_KEY, "<init>", "(Lcom/paypal/oslo/feature/searchandintelligence/api/domain/ActionContent;)V", "component1", "()Lcom/paypal/oslo/feature/searchandintelligence/api/domain/ActionContent;", "copy", "(Lcom/paypal/oslo/feature/searchandintelligence/api/domain/ActionContent;)Lcom/paypal/oslo/feature/searchandintelligence/ui/ChatEvent$DelegateExecuteAction;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "Lcom/paypal/oslo/feature/searchandintelligence/api/domain/ActionContent;", "getActionContent"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class DelegateExecuteAction extends com.paypal.oslo.feature.searchandintelligence.ui.ChatEvent {
        public static final int $stable = com.paypal.oslo.feature.searchandintelligence.api.domain.ActionContent.$stable;
        private final com.paypal.oslo.feature.searchandintelligence.api.domain.ActionContent actionContent;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public DelegateExecuteAction(com.paypal.oslo.feature.searchandintelligence.api.domain.ActionContent actionContent) {
            super("DelegateExecuteAction", null);
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(actionContent, "");
            this.actionContent = actionContent;
        }

        public final com.paypal.oslo.feature.searchandintelligence.api.domain.ActionContent getActionContent() {
            return this.actionContent;
        }

        public final java.lang.String toString() {
            com.paypal.oslo.feature.searchandintelligence.api.domain.ActionContent actionContent = this.actionContent;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("DelegateExecuteAction(actionContent=");
            sb.append(actionContent);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            return this.actionContent.hashCode();
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof com.paypal.oslo.feature.searchandintelligence.ui.ChatEvent.DelegateExecuteAction) && kotlin.jvm.internal.Intrinsics.areEqual(this.actionContent, ((com.paypal.oslo.feature.searchandintelligence.ui.ChatEvent.DelegateExecuteAction) other).actionContent);
        }

        public final com.paypal.oslo.feature.searchandintelligence.ui.ChatEvent.DelegateExecuteAction copy(com.paypal.oslo.feature.searchandintelligence.api.domain.ActionContent actionContent) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(actionContent, "");
            return new com.paypal.oslo.feature.searchandintelligence.ui.ChatEvent.DelegateExecuteAction(actionContent);
        }

        /* renamed from: component1, reason: from getter */
        public final com.paypal.oslo.feature.searchandintelligence.api.domain.ActionContent getActionContent() {
            return this.actionContent;
        }

        public static /* synthetic */ com.paypal.oslo.feature.searchandintelligence.ui.ChatEvent.DelegateExecuteAction copy$default(com.paypal.oslo.feature.searchandintelligence.ui.ChatEvent.DelegateExecuteAction delegateExecuteAction, com.paypal.oslo.feature.searchandintelligence.api.domain.ActionContent actionContent, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                actionContent = delegateExecuteAction.actionContent;
            }
            return delegateExecuteAction.copy(actionContent);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0005\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u001a\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0012\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0012\u0010\u0007R\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0013\u001a\u0004\b\u0014\u0010\u0007"}, d2 = {"Lcom/paypal/oslo/feature/searchandintelligence/ui/ChatEvent$SessionCreated;", "Lcom/paypal/oslo/feature/searchandintelligence/ui/ChatEvent;", "", "sessionId", "<init>", "(Ljava/lang/String;)V", "component1", "()Ljava/lang/String;", "copy", "(Ljava/lang/String;)Lcom/paypal/oslo/feature/searchandintelligence/ui/ChatEvent$SessionCreated;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "Ljava/lang/String;", "getSessionId"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class SessionCreated extends com.paypal.oslo.feature.searchandintelligence.ui.ChatEvent {
        public static final int $stable = 0;
        private final java.lang.String sessionId;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public SessionCreated(java.lang.String str) {
            super("SessionCreated", null);
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
            this.sessionId = str;
        }

        public final java.lang.String getSessionId() {
            return this.sessionId;
        }

        public final java.lang.String toString() {
            java.lang.String str = this.sessionId;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("SessionCreated(sessionId=");
            sb.append(str);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            return this.sessionId.hashCode();
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof com.paypal.oslo.feature.searchandintelligence.ui.ChatEvent.SessionCreated) && kotlin.jvm.internal.Intrinsics.areEqual(this.sessionId, ((com.paypal.oslo.feature.searchandintelligence.ui.ChatEvent.SessionCreated) other).sessionId);
        }

        public final com.paypal.oslo.feature.searchandintelligence.ui.ChatEvent.SessionCreated copy(java.lang.String sessionId) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(sessionId, "");
            return new com.paypal.oslo.feature.searchandintelligence.ui.ChatEvent.SessionCreated(sessionId);
        }

        /* renamed from: component1, reason: from getter */
        public final java.lang.String getSessionId() {
            return this.sessionId;
        }

        public static /* synthetic */ com.paypal.oslo.feature.searchandintelligence.ui.ChatEvent.SessionCreated copy$default(com.paypal.oslo.feature.searchandintelligence.ui.ChatEvent.SessionCreated sessionCreated, java.lang.String str, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                str = sessionCreated.sessionId;
            }
            return sessionCreated.copy(str);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u001a\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0013\u001a\u00020\u0012HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014R\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0015\u001a\u0004\b\u0016\u0010\u0007"}, d2 = {"Lcom/paypal/oslo/feature/searchandintelligence/ui/ChatEvent$SessionCreateFailed;", "Lcom/paypal/oslo/feature/searchandintelligence/ui/ChatEvent;", "Lcom/paypal/oslo/core/network/http/error/NetworkError;", "error", "<init>", "(Lcom/paypal/oslo/core/network/http/error/NetworkError;)V", "component1", "()Lcom/paypal/oslo/core/network/http/error/NetworkError;", "copy", "(Lcom/paypal/oslo/core/network/http/error/NetworkError;)Lcom/paypal/oslo/feature/searchandintelligence/ui/ChatEvent$SessionCreateFailed;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "Lcom/paypal/oslo/core/network/http/error/NetworkError;", "getError"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class SessionCreateFailed extends com.paypal.oslo.feature.searchandintelligence.ui.ChatEvent {
        public static final int $stable = 8;
        private final com.paypal.oslo.core.network.http.error.NetworkError error;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public SessionCreateFailed(com.paypal.oslo.core.network.http.error.NetworkError networkError) {
            super("SessionCreateFailed", null);
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(networkError, "");
            this.error = networkError;
        }

        public final com.paypal.oslo.core.network.http.error.NetworkError getError() {
            return this.error;
        }

        public final java.lang.String toString() {
            com.paypal.oslo.core.network.http.error.NetworkError networkError = this.error;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("SessionCreateFailed(error=");
            sb.append(networkError);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            return this.error.hashCode();
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof com.paypal.oslo.feature.searchandintelligence.ui.ChatEvent.SessionCreateFailed) && kotlin.jvm.internal.Intrinsics.areEqual(this.error, ((com.paypal.oslo.feature.searchandintelligence.ui.ChatEvent.SessionCreateFailed) other).error);
        }

        public final com.paypal.oslo.feature.searchandintelligence.ui.ChatEvent.SessionCreateFailed copy(com.paypal.oslo.core.network.http.error.NetworkError error) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(error, "");
            return new com.paypal.oslo.feature.searchandintelligence.ui.ChatEvent.SessionCreateFailed(error);
        }

        /* renamed from: component1, reason: from getter */
        public final com.paypal.oslo.core.network.http.error.NetworkError getError() {
            return this.error;
        }

        public static /* synthetic */ com.paypal.oslo.feature.searchandintelligence.ui.ChatEvent.SessionCreateFailed copy$default(com.paypal.oslo.feature.searchandintelligence.ui.ChatEvent.SessionCreateFailed sessionCreateFailed, com.paypal.oslo.core.network.http.error.NetworkError networkError, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                networkError = sessionCreateFailed.error;
            }
            return sessionCreateFailed.copy(networkError);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0007\b\u0086\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\b\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\n\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\n\u0010\u000bJ$\u0010\f\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u0004HÆ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0011\u001a\u00020\u00102\b\u0010\u000f\u001a\u0004\u0018\u00010\u000eHÖ\u0003¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0014\u001a\u00020\u0013HÖ\u0001¢\u0006\u0004\b\u0014\u0010\u0015J\u0010\u0010\u0016\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0016\u0010\tR\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0017\u001a\u0004\b\u0018\u0010\tR\u001a\u0010\u0005\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0019\u001a\u0004\b\u001a\u0010\u000b"}, d2 = {"Lcom/paypal/oslo/feature/searchandintelligence/ui/ChatEvent$SubscribeToStream;", "Lcom/paypal/oslo/feature/searchandintelligence/ui/ChatEvent;", "", "sessionId", "Lcom/paypal/oslo/feature/searchandintelligence/domain/model/ChatInput;", "input", "<init>", "(Ljava/lang/String;Lcom/paypal/oslo/feature/searchandintelligence/domain/model/ChatInput;)V", "component1", "()Ljava/lang/String;", "component2", "()Lcom/paypal/oslo/feature/searchandintelligence/domain/model/ChatInput;", "copy", "(Ljava/lang/String;Lcom/paypal/oslo/feature/searchandintelligence/domain/model/ChatInput;)Lcom/paypal/oslo/feature/searchandintelligence/ui/ChatEvent$SubscribeToStream;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "Ljava/lang/String;", "getSessionId", "Lcom/paypal/oslo/feature/searchandintelligence/domain/model/ChatInput;", "getInput"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class SubscribeToStream extends com.paypal.oslo.feature.searchandintelligence.ui.ChatEvent {
        public static final int $stable = 8;
        private final com.paypal.oslo.feature.searchandintelligence.domain.model.ChatInput input;
        private final java.lang.String sessionId;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public SubscribeToStream(java.lang.String str, com.paypal.oslo.feature.searchandintelligence.domain.model.ChatInput chatInput) {
            super("SubscribeToStream", null);
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(chatInput, "");
            this.sessionId = str;
            this.input = chatInput;
        }

        public final java.lang.String getSessionId() {
            return this.sessionId;
        }

        public final com.paypal.oslo.feature.searchandintelligence.domain.model.ChatInput getInput() {
            return this.input;
        }

        public final java.lang.String toString() {
            java.lang.String str = this.sessionId;
            com.paypal.oslo.feature.searchandintelligence.domain.model.ChatInput chatInput = this.input;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("SubscribeToStream(sessionId=");
            sb.append(str);
            sb.append(", input=");
            sb.append(chatInput);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            return (this.sessionId.hashCode() * 31) + this.input.hashCode();
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.searchandintelligence.ui.ChatEvent.SubscribeToStream)) {
                return false;
            }
            com.paypal.oslo.feature.searchandintelligence.ui.ChatEvent.SubscribeToStream subscribeToStream = (com.paypal.oslo.feature.searchandintelligence.ui.ChatEvent.SubscribeToStream) other;
            return kotlin.jvm.internal.Intrinsics.areEqual(this.sessionId, subscribeToStream.sessionId) && kotlin.jvm.internal.Intrinsics.areEqual(this.input, subscribeToStream.input);
        }

        public final com.paypal.oslo.feature.searchandintelligence.ui.ChatEvent.SubscribeToStream copy(java.lang.String sessionId, com.paypal.oslo.feature.searchandintelligence.domain.model.ChatInput input) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(sessionId, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(input, "");
            return new com.paypal.oslo.feature.searchandintelligence.ui.ChatEvent.SubscribeToStream(sessionId, input);
        }

        /* renamed from: component2, reason: from getter */
        public final com.paypal.oslo.feature.searchandintelligence.domain.model.ChatInput getInput() {
            return this.input;
        }

        /* renamed from: component1, reason: from getter */
        public final java.lang.String getSessionId() {
            return this.sessionId;
        }

        public static /* synthetic */ com.paypal.oslo.feature.searchandintelligence.ui.ChatEvent.SubscribeToStream copy$default(com.paypal.oslo.feature.searchandintelligence.ui.ChatEvent.SubscribeToStream subscribeToStream, java.lang.String str, com.paypal.oslo.feature.searchandintelligence.domain.model.ChatInput chatInput, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                str = subscribeToStream.sessionId;
            }
            if ((i & 2) != 0) {
                chatInput = subscribeToStream.input;
            }
            return subscribeToStream.copy(str, chatInput);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u001a\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0013\u001a\u00020\u0012HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014R\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0015\u001a\u0004\b\u0016\u0010\u0007"}, d2 = {"Lcom/paypal/oslo/feature/searchandintelligence/ui/ChatEvent$SseResponseReceived;", "Lcom/paypal/oslo/feature/searchandintelligence/ui/ChatEvent;", "Lcom/paypal/oslo/feature/searchandintelligence/domain/model/SseResponse;", "response", "<init>", "(Lcom/paypal/oslo/feature/searchandintelligence/domain/model/SseResponse;)V", "component1", "()Lcom/paypal/oslo/feature/searchandintelligence/domain/model/SseResponse;", "copy", "(Lcom/paypal/oslo/feature/searchandintelligence/domain/model/SseResponse;)Lcom/paypal/oslo/feature/searchandintelligence/ui/ChatEvent$SseResponseReceived;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "Lcom/paypal/oslo/feature/searchandintelligence/domain/model/SseResponse;", "getResponse"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class SseResponseReceived extends com.paypal.oslo.feature.searchandintelligence.ui.ChatEvent {
        public static final int $stable = 0;
        private final com.paypal.oslo.feature.searchandintelligence.domain.model.SseResponse response;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public SseResponseReceived(com.paypal.oslo.feature.searchandintelligence.domain.model.SseResponse sseResponse) {
            super("SseResponseReceived", null);
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(sseResponse, "");
            this.response = sseResponse;
        }

        public final com.paypal.oslo.feature.searchandintelligence.domain.model.SseResponse getResponse() {
            return this.response;
        }

        public final java.lang.String toString() {
            com.paypal.oslo.feature.searchandintelligence.domain.model.SseResponse sseResponse = this.response;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("SseResponseReceived(response=");
            sb.append(sseResponse);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            return this.response.hashCode();
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof com.paypal.oslo.feature.searchandintelligence.ui.ChatEvent.SseResponseReceived) && kotlin.jvm.internal.Intrinsics.areEqual(this.response, ((com.paypal.oslo.feature.searchandintelligence.ui.ChatEvent.SseResponseReceived) other).response);
        }

        public final com.paypal.oslo.feature.searchandintelligence.ui.ChatEvent.SseResponseReceived copy(com.paypal.oslo.feature.searchandintelligence.domain.model.SseResponse response) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(response, "");
            return new com.paypal.oslo.feature.searchandintelligence.ui.ChatEvent.SseResponseReceived(response);
        }

        /* renamed from: component1, reason: from getter */
        public final com.paypal.oslo.feature.searchandintelligence.domain.model.SseResponse getResponse() {
            return this.response;
        }

        public static /* synthetic */ com.paypal.oslo.feature.searchandintelligence.ui.ChatEvent.SseResponseReceived copy$default(com.paypal.oslo.feature.searchandintelligence.ui.ChatEvent.SseResponseReceived sseResponseReceived, com.paypal.oslo.feature.searchandintelligence.domain.model.SseResponse sseResponse, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                sseResponse = sseResponseReceived.response;
            }
            return sseResponseReceived.copy(sseResponse);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u001a\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0013\u001a\u00020\u0012HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014R\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0015\u001a\u0004\b\u0016\u0010\u0007"}, d2 = {"Lcom/paypal/oslo/feature/searchandintelligence/ui/ChatEvent$SseErrorReceived;", "Lcom/paypal/oslo/feature/searchandintelligence/ui/ChatEvent;", "Lcom/paypal/oslo/core/network/sse/domain/error/SseError;", "error", "<init>", "(Lcom/paypal/oslo/core/network/sse/domain/error/SseError;)V", "component1", "()Lcom/paypal/oslo/core/network/sse/domain/error/SseError;", "copy", "(Lcom/paypal/oslo/core/network/sse/domain/error/SseError;)Lcom/paypal/oslo/feature/searchandintelligence/ui/ChatEvent$SseErrorReceived;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "Lcom/paypal/oslo/core/network/sse/domain/error/SseError;", "getError"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class SseErrorReceived extends com.paypal.oslo.feature.searchandintelligence.ui.ChatEvent {
        public static final int $stable = 8;
        private final com.paypal.oslo.core.network.sse.domain.error.SseError error;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public SseErrorReceived(com.paypal.oslo.core.network.sse.domain.error.SseError sseError) {
            super("SseErrorReceived", null);
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(sseError, "");
            this.error = sseError;
        }

        public final com.paypal.oslo.core.network.sse.domain.error.SseError getError() {
            return this.error;
        }

        public final java.lang.String toString() {
            com.paypal.oslo.core.network.sse.domain.error.SseError sseError = this.error;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("SseErrorReceived(error=");
            sb.append(sseError);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            return this.error.hashCode();
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof com.paypal.oslo.feature.searchandintelligence.ui.ChatEvent.SseErrorReceived) && kotlin.jvm.internal.Intrinsics.areEqual(this.error, ((com.paypal.oslo.feature.searchandintelligence.ui.ChatEvent.SseErrorReceived) other).error);
        }

        public final com.paypal.oslo.feature.searchandintelligence.ui.ChatEvent.SseErrorReceived copy(com.paypal.oslo.core.network.sse.domain.error.SseError error) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(error, "");
            return new com.paypal.oslo.feature.searchandintelligence.ui.ChatEvent.SseErrorReceived(error);
        }

        /* renamed from: component1, reason: from getter */
        public final com.paypal.oslo.core.network.sse.domain.error.SseError getError() {
            return this.error;
        }

        public static /* synthetic */ com.paypal.oslo.feature.searchandintelligence.ui.ChatEvent.SseErrorReceived copy$default(com.paypal.oslo.feature.searchandintelligence.ui.ChatEvent.SseErrorReceived sseErrorReceived, com.paypal.oslo.core.network.sse.domain.error.SseError sseError, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                sseError = sseErrorReceived.error;
            }
            return sseErrorReceived.copy(sseError);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001a\u0010\u0007\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004HÖ\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000e"}, d2 = {"Lcom/paypal/oslo/feature/searchandintelligence/ui/ChatEvent$StreamCompleted;", "Lcom/paypal/oslo/feature/searchandintelligence/ui/ChatEvent;", "<init>", "()V", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class StreamCompleted extends com.paypal.oslo.feature.searchandintelligence.ui.ChatEvent {
        public static final int $stable = 0;
        public static final com.paypal.oslo.feature.searchandintelligence.ui.ChatEvent.StreamCompleted INSTANCE = new com.paypal.oslo.feature.searchandintelligence.ui.ChatEvent.StreamCompleted();

        public final int hashCode() {
            return -986047946;
        }

        private StreamCompleted() {
            super("StreamCompleted", null);
        }

        public final java.lang.String toString() {
            return "StreamCompleted";
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.searchandintelligence.ui.ChatEvent.StreamCompleted)) {
                return false;
            }
            return true;
        }
    }

    @kotlin.Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001a\u0010\u0007\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004HÖ\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000e"}, d2 = {"Lcom/paypal/oslo/feature/searchandintelligence/ui/ChatEvent$ShowResumeOverlay;", "Lcom/paypal/oslo/feature/searchandintelligence/ui/ChatEvent;", "<init>", "()V", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class ShowResumeOverlay extends com.paypal.oslo.feature.searchandintelligence.ui.ChatEvent {
        public static final int $stable = 0;
        public static final com.paypal.oslo.feature.searchandintelligence.ui.ChatEvent.ShowResumeOverlay INSTANCE = new com.paypal.oslo.feature.searchandintelligence.ui.ChatEvent.ShowResumeOverlay();

        public final int hashCode() {
            return -1256260559;
        }

        private ShowResumeOverlay() {
            super("ShowResumeOverlay", null);
        }

        public final java.lang.String toString() {
            return "ShowResumeOverlay";
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.searchandintelligence.ui.ChatEvent.ShowResumeOverlay)) {
                return false;
            }
            return true;
        }
    }

    @kotlin.Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001a\u0010\u0007\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004HÖ\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000e"}, d2 = {"Lcom/paypal/oslo/feature/searchandintelligence/ui/ChatEvent$Logout;", "Lcom/paypal/oslo/feature/searchandintelligence/ui/ChatEvent;", "<init>", "()V", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class Logout extends com.paypal.oslo.feature.searchandintelligence.ui.ChatEvent {
        public static final int $stable = 0;
        public static final com.paypal.oslo.feature.searchandintelligence.ui.ChatEvent.Logout INSTANCE = new com.paypal.oslo.feature.searchandintelligence.ui.ChatEvent.Logout();

        public final int hashCode() {
            return -1815873121;
        }

        private Logout() {
            super("Logout", null);
        }

        public final java.lang.String toString() {
            return "Logout";
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.searchandintelligence.ui.ChatEvent.Logout)) {
                return false;
            }
            return true;
        }
    }

    public /* synthetic */ ChatEvent(java.lang.String str, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this(str);
    }
}
