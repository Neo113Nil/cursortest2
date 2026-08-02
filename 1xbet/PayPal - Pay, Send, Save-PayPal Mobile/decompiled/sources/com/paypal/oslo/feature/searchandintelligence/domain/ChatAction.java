package com.paypal.oslo.feature.searchandintelligence.domain;

@kotlin.Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\b0\u0018\u00002\u00020\u0001:\u0003\u0004\u0005\u0006B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0003\u0007\b\t"}, d2 = {"Lcom/paypal/oslo/feature/searchandintelligence/domain/ChatAction;", "", "<init>", "()V", "SendMessage", "DisplayComponents", "ExecuteAction", "Lcom/paypal/oslo/feature/searchandintelligence/domain/ChatAction$DisplayComponents;", "Lcom/paypal/oslo/feature/searchandintelligence/domain/ChatAction$ExecuteAction;", "Lcom/paypal/oslo/feature/searchandintelligence/domain/ChatAction$SendMessage;"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes14.dex */
public abstract class ChatAction {
    public static final int $stable = 0;

    private ChatAction() {
    }

    @kotlin.Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u000b\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\n\b\u0086\b\u0018\u00002\u00020\u0001B!\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\n\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\f\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000e\u001a\u00020\u0006HÆ\u0003¢\u0006\u0004\b\u000e\u0010\u000fJ.\u0010\u0010\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u0006HÆ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u001a\u0010\u0015\u001a\u00020\u00142\b\u0010\u0013\u001a\u0004\u0018\u00010\u0012HÖ\u0003¢\u0006\u0004\b\u0015\u0010\u0016J\u0010\u0010\u0017\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0017\u0010\u000fJ\u0010\u0010\u0018\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0018\u0010\u000bR\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0019\u001a\u0004\b\u001a\u0010\u000bR\u001a\u0010\u0005\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u001b\u001a\u0004\b\u001c\u0010\rR\u001a\u0010\u0007\u001a\u00020\u00068\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010\u001d\u001a\u0004\b\u001e\u0010\u000f"}, d2 = {"Lcom/paypal/oslo/feature/searchandintelligence/domain/ChatAction$SendMessage;", "Lcom/paypal/oslo/feature/searchandintelligence/domain/ChatAction;", "", "text", "Lcom/paypal/oslo/feature/searchandintelligence/api/domain/RequestedMessageType;", "messageType", "", "maxLines", "<init>", "(Ljava/lang/String;Lcom/paypal/oslo/feature/searchandintelligence/api/domain/RequestedMessageType;I)V", "component1", "()Ljava/lang/String;", "component2", "()Lcom/paypal/oslo/feature/searchandintelligence/api/domain/RequestedMessageType;", "component3", "()I", "copy", "(Ljava/lang/String;Lcom/paypal/oslo/feature/searchandintelligence/api/domain/RequestedMessageType;I)Lcom/paypal/oslo/feature/searchandintelligence/domain/ChatAction$SendMessage;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "hashCode", "toString", "Ljava/lang/String;", "getText", "Lcom/paypal/oslo/feature/searchandintelligence/api/domain/RequestedMessageType;", "getMessageType", com.visa.cbp.getEncExpo.warmup, "getMaxLines"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class SendMessage extends com.paypal.oslo.feature.searchandintelligence.domain.ChatAction {
        public static final int $stable = 0;
        private final int maxLines;
        private final com.paypal.oslo.feature.searchandintelligence.api.domain.RequestedMessageType messageType;
        private final java.lang.String text;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public SendMessage(java.lang.String str, com.paypal.oslo.feature.searchandintelligence.api.domain.RequestedMessageType requestedMessageType, int i) {
            super(null);
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(requestedMessageType, "");
            this.text = str;
            this.messageType = requestedMessageType;
            this.maxLines = i;
        }

        public /* synthetic */ SendMessage(java.lang.String str, com.paypal.oslo.feature.searchandintelligence.api.domain.RequestedMessageType requestedMessageType, int i, int i2, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
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
            if (!(other instanceof com.paypal.oslo.feature.searchandintelligence.domain.ChatAction.SendMessage)) {
                return false;
            }
            com.paypal.oslo.feature.searchandintelligence.domain.ChatAction.SendMessage sendMessage = (com.paypal.oslo.feature.searchandintelligence.domain.ChatAction.SendMessage) other;
            return kotlin.jvm.internal.Intrinsics.areEqual(this.text, sendMessage.text) && this.messageType == sendMessage.messageType && this.maxLines == sendMessage.maxLines;
        }

        public final com.paypal.oslo.feature.searchandintelligence.domain.ChatAction.SendMessage copy(java.lang.String text, com.paypal.oslo.feature.searchandintelligence.api.domain.RequestedMessageType messageType, int maxLines) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(text, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(messageType, "");
            return new com.paypal.oslo.feature.searchandintelligence.domain.ChatAction.SendMessage(text, messageType, maxLines);
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

        public static /* synthetic */ com.paypal.oslo.feature.searchandintelligence.domain.ChatAction.SendMessage copy$default(com.paypal.oslo.feature.searchandintelligence.domain.ChatAction.SendMessage sendMessage, java.lang.String str, com.paypal.oslo.feature.searchandintelligence.api.domain.RequestedMessageType requestedMessageType, int i, int i2, java.lang.Object obj) {
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

    @kotlin.Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001B\u0015\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u0016\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002HÆ\u0003¢\u0006\u0004\b\u0007\u0010\bJ \u0010\t\u001a\u00020\u00002\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002HÆ\u0001¢\u0006\u0004\b\t\u0010\nJ\u001a\u0010\u000e\u001a\u00020\r2\b\u0010\f\u001a\u0004\u0018\u00010\u000bHÖ\u0003¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0011\u001a\u00020\u0010HÖ\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0014\u001a\u00020\u0013HÖ\u0001¢\u0006\u0004\b\u0014\u0010\u0015R\u001d\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0007¢\u0006\f\n\u0004\b\u0004\u0010\u0016\u001a\u0004\b\u0017\u0010\b"}, d2 = {"Lcom/paypal/oslo/feature/searchandintelligence/domain/ChatAction$DisplayComponents;", "Lcom/paypal/oslo/feature/searchandintelligence/domain/ChatAction;", "", "Lcom/paypal/oslo/feature/searchandintelligence/api/component/UiComponent;", "components", "<init>", "(Ljava/util/List;)V", "component1", "()Ljava/util/List;", "copy", "(Ljava/util/List;)Lcom/paypal/oslo/feature/searchandintelligence/domain/ChatAction$DisplayComponents;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "Ljava/util/List;", "getComponents"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class DisplayComponents extends com.paypal.oslo.feature.searchandintelligence.domain.ChatAction {
        public static final int $stable = 8;
        private final java.util.List<com.paypal.oslo.feature.searchandintelligence.api.component.UiComponent> components;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public DisplayComponents(java.util.List<? extends com.paypal.oslo.feature.searchandintelligence.api.component.UiComponent> list) {
            super(null);
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(list, "");
            this.components = list;
        }

        public final java.util.List<com.paypal.oslo.feature.searchandintelligence.api.component.UiComponent> getComponents() {
            return this.components;
        }

        public final java.lang.String toString() {
            java.util.List<com.paypal.oslo.feature.searchandintelligence.api.component.UiComponent> list = this.components;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("DisplayComponents(components=");
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
            return (other instanceof com.paypal.oslo.feature.searchandintelligence.domain.ChatAction.DisplayComponents) && kotlin.jvm.internal.Intrinsics.areEqual(this.components, ((com.paypal.oslo.feature.searchandintelligence.domain.ChatAction.DisplayComponents) other).components);
        }

        public final com.paypal.oslo.feature.searchandintelligence.domain.ChatAction.DisplayComponents copy(java.util.List<? extends com.paypal.oslo.feature.searchandintelligence.api.component.UiComponent> components) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(components, "");
            return new com.paypal.oslo.feature.searchandintelligence.domain.ChatAction.DisplayComponents(components);
        }

        public final java.util.List<com.paypal.oslo.feature.searchandintelligence.api.component.UiComponent> component1() {
            return this.components;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ com.paypal.oslo.feature.searchandintelligence.domain.ChatAction.DisplayComponents copy$default(com.paypal.oslo.feature.searchandintelligence.domain.ChatAction.DisplayComponents displayComponents, java.util.List list, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                list = displayComponents.components;
            }
            return displayComponents.copy(list);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u001a\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0013\u001a\u00020\u0012HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014R\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0015\u001a\u0004\b\u0016\u0010\u0007"}, d2 = {"Lcom/paypal/oslo/feature/searchandintelligence/domain/ChatAction$ExecuteAction;", "Lcom/paypal/oslo/feature/searchandintelligence/domain/ChatAction;", "Lcom/paypal/oslo/feature/searchandintelligence/api/domain/ActionContent;", com.paypal.oslo.feature.inappcheckout.domain.util.LoggerParameterKeys.ACTION_CONTENT_KEY, "<init>", "(Lcom/paypal/oslo/feature/searchandintelligence/api/domain/ActionContent;)V", "component1", "()Lcom/paypal/oslo/feature/searchandintelligence/api/domain/ActionContent;", "copy", "(Lcom/paypal/oslo/feature/searchandintelligence/api/domain/ActionContent;)Lcom/paypal/oslo/feature/searchandintelligence/domain/ChatAction$ExecuteAction;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "Lcom/paypal/oslo/feature/searchandintelligence/api/domain/ActionContent;", "getActionContent"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class ExecuteAction extends com.paypal.oslo.feature.searchandintelligence.domain.ChatAction {
        public static final int $stable = com.paypal.oslo.feature.searchandintelligence.api.domain.ActionContent.$stable;
        private final com.paypal.oslo.feature.searchandintelligence.api.domain.ActionContent actionContent;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public ExecuteAction(com.paypal.oslo.feature.searchandintelligence.api.domain.ActionContent actionContent) {
            super(null);
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(actionContent, "");
            this.actionContent = actionContent;
        }

        public final com.paypal.oslo.feature.searchandintelligence.api.domain.ActionContent getActionContent() {
            return this.actionContent;
        }

        public final java.lang.String toString() {
            com.paypal.oslo.feature.searchandintelligence.api.domain.ActionContent actionContent = this.actionContent;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("ExecuteAction(actionContent=");
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
            return (other instanceof com.paypal.oslo.feature.searchandintelligence.domain.ChatAction.ExecuteAction) && kotlin.jvm.internal.Intrinsics.areEqual(this.actionContent, ((com.paypal.oslo.feature.searchandintelligence.domain.ChatAction.ExecuteAction) other).actionContent);
        }

        public final com.paypal.oslo.feature.searchandintelligence.domain.ChatAction.ExecuteAction copy(com.paypal.oslo.feature.searchandintelligence.api.domain.ActionContent actionContent) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(actionContent, "");
            return new com.paypal.oslo.feature.searchandintelligence.domain.ChatAction.ExecuteAction(actionContent);
        }

        /* renamed from: component1, reason: from getter */
        public final com.paypal.oslo.feature.searchandintelligence.api.domain.ActionContent getActionContent() {
            return this.actionContent;
        }

        public static /* synthetic */ com.paypal.oslo.feature.searchandintelligence.domain.ChatAction.ExecuteAction copy$default(com.paypal.oslo.feature.searchandintelligence.domain.ChatAction.ExecuteAction executeAction, com.paypal.oslo.feature.searchandintelligence.api.domain.ActionContent actionContent, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                actionContent = executeAction.actionContent;
            }
            return executeAction.copy(actionContent);
        }
    }

    public /* synthetic */ ChatAction(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }
}
