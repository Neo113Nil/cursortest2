package com.paypal.oslo.feature.searchandintelligence.ui;

@kotlin.Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\b0\u0018\u00002\u00020\u0001:\u0005\u0004\u0005\u0006\u0007\bB\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0005\t\n\u000b\f\r"}, d2 = {"Lcom/paypal/oslo/feature/searchandintelligence/ui/ChatMessage;", "", "<init>", "()V", "Remote", "User", "Thinking", "Agent", "Error", "Lcom/paypal/oslo/feature/searchandintelligence/ui/ChatMessage$Agent;", "Lcom/paypal/oslo/feature/searchandintelligence/ui/ChatMessage$Error;", "Lcom/paypal/oslo/feature/searchandintelligence/ui/ChatMessage$Remote;", "Lcom/paypal/oslo/feature/searchandintelligence/ui/ChatMessage$Thinking;", "Lcom/paypal/oslo/feature/searchandintelligence/ui/ChatMessage$User;"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes14.dex */
public abstract class ChatMessage {
    public static final int $stable = 0;

    private ChatMessage() {
    }

    @kotlin.Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001B\u0017\u0012\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u0016\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002HÆ\u0003¢\u0006\u0004\b\u0007\u0010\bJ \u0010\t\u001a\u00020\u00002\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002HÆ\u0001¢\u0006\u0004\b\t\u0010\nJ\u001a\u0010\u000e\u001a\u00020\r2\b\u0010\f\u001a\u0004\u0018\u00010\u000bHÖ\u0003¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0011\u001a\u00020\u0010HÖ\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0014\u001a\u00020\u0013HÖ\u0001¢\u0006\u0004\b\u0014\u0010\u0015R\u001d\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0007¢\u0006\f\n\u0004\b\u0004\u0010\u0016\u001a\u0004\b\u0017\u0010\b"}, d2 = {"Lcom/paypal/oslo/feature/searchandintelligence/ui/ChatMessage$Remote;", "Lcom/paypal/oslo/feature/searchandintelligence/ui/ChatMessage;", "", "Lcom/paypal/oslo/feature/searchandintelligence/api/component/UiComponent;", "components", "<init>", "(Ljava/util/List;)V", "component1", "()Ljava/util/List;", "copy", "(Ljava/util/List;)Lcom/paypal/oslo/feature/searchandintelligence/ui/ChatMessage$Remote;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "Ljava/util/List;", "getComponents"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class Remote extends com.paypal.oslo.feature.searchandintelligence.ui.ChatMessage {
        public static final int $stable = 8;
        private final java.util.List<com.paypal.oslo.feature.searchandintelligence.api.component.UiComponent> components;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public Remote(java.util.List<? extends com.paypal.oslo.feature.searchandintelligence.api.component.UiComponent> list) {
            super(null);
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(list, "");
            this.components = list;
        }

        public /* synthetic */ Remote(java.util.List list, int i, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? kotlin.collections.CollectionsKt.emptyList() : list);
        }

        public final java.util.List<com.paypal.oslo.feature.searchandintelligence.api.component.UiComponent> getComponents() {
            return this.components;
        }

        public final java.lang.String toString() {
            java.util.List<com.paypal.oslo.feature.searchandintelligence.api.component.UiComponent> list = this.components;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("Remote(components=");
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
            return (other instanceof com.paypal.oslo.feature.searchandintelligence.ui.ChatMessage.Remote) && kotlin.jvm.internal.Intrinsics.areEqual(this.components, ((com.paypal.oslo.feature.searchandintelligence.ui.ChatMessage.Remote) other).components);
        }

        public final com.paypal.oslo.feature.searchandintelligence.ui.ChatMessage.Remote copy(java.util.List<? extends com.paypal.oslo.feature.searchandintelligence.api.component.UiComponent> components) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(components, "");
            return new com.paypal.oslo.feature.searchandintelligence.ui.ChatMessage.Remote(components);
        }

        public final java.util.List<com.paypal.oslo.feature.searchandintelligence.api.component.UiComponent> component1() {
            return this.components;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ com.paypal.oslo.feature.searchandintelligence.ui.ChatMessage.Remote copy$default(com.paypal.oslo.feature.searchandintelligence.ui.ChatMessage.Remote remote, java.util.List list, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                list = remote.components;
            }
            return remote.copy(list);
        }

        /* JADX WARN: Multi-variable type inference failed */
        public Remote() {
            this(null, 1, 0 == true ? 1 : 0);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\t\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\b\b\u0086\b\u0018\u00002\u00020\u0001B\u0019\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\b\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\n\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\n\u0010\u000bJ$\u0010\f\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u0004HÆ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0011\u001a\u00020\u00102\b\u0010\u000f\u001a\u0004\u0018\u00010\u000eHÖ\u0003¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0013\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u000bJ\u0010\u0010\u0014\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0014\u0010\tR\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0015\u001a\u0004\b\u0016\u0010\tR\u001a\u0010\u0005\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0017\u001a\u0004\b\u0018\u0010\u000b"}, d2 = {"Lcom/paypal/oslo/feature/searchandintelligence/ui/ChatMessage$User;", "Lcom/paypal/oslo/feature/searchandintelligence/ui/ChatMessage;", "", "text", "", "maxLines", "<init>", "(Ljava/lang/String;I)V", "component1", "()Ljava/lang/String;", "component2", "()I", "copy", "(Ljava/lang/String;I)Lcom/paypal/oslo/feature/searchandintelligence/ui/ChatMessage$User;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "hashCode", "toString", "Ljava/lang/String;", "getText", com.visa.cbp.getEncExpo.warmup, "getMaxLines"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class User extends com.paypal.oslo.feature.searchandintelligence.ui.ChatMessage {
        public static final int $stable = 0;
        private final int maxLines;
        private final java.lang.String text;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public User(java.lang.String str, int i) {
            super(null);
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
            this.text = str;
            this.maxLines = i;
        }

        public /* synthetic */ User(java.lang.String str, int i, int i2, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this(str, (i2 & 2) != 0 ? Integer.MAX_VALUE : i);
        }

        public final java.lang.String getText() {
            return this.text;
        }

        public final int getMaxLines() {
            return this.maxLines;
        }

        public final java.lang.String toString() {
            java.lang.String str = this.text;
            int i = this.maxLines;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("User(text=");
            sb.append(str);
            sb.append(", maxLines=");
            sb.append(i);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            return (this.text.hashCode() * 31) + java.lang.Integer.hashCode(this.maxLines);
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.searchandintelligence.ui.ChatMessage.User)) {
                return false;
            }
            com.paypal.oslo.feature.searchandintelligence.ui.ChatMessage.User user = (com.paypal.oslo.feature.searchandintelligence.ui.ChatMessage.User) other;
            return kotlin.jvm.internal.Intrinsics.areEqual(this.text, user.text) && this.maxLines == user.maxLines;
        }

        public final com.paypal.oslo.feature.searchandintelligence.ui.ChatMessage.User copy(java.lang.String text, int maxLines) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(text, "");
            return new com.paypal.oslo.feature.searchandintelligence.ui.ChatMessage.User(text, maxLines);
        }

        /* renamed from: component2, reason: from getter */
        public final int getMaxLines() {
            return this.maxLines;
        }

        /* renamed from: component1, reason: from getter */
        public final java.lang.String getText() {
            return this.text;
        }

        public static /* synthetic */ com.paypal.oslo.feature.searchandintelligence.ui.ChatMessage.User copy$default(com.paypal.oslo.feature.searchandintelligence.ui.ChatMessage.User user, java.lang.String str, int i, int i2, java.lang.Object obj) {
            if ((i2 & 1) != 0) {
                str = user.text;
            }
            if ((i2 & 2) != 0) {
                i = user.maxLines;
            }
            return user.copy(str, i);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001a\u0010\u0007\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004HÖ\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000e"}, d2 = {"Lcom/paypal/oslo/feature/searchandintelligence/ui/ChatMessage$Thinking;", "Lcom/paypal/oslo/feature/searchandintelligence/ui/ChatMessage;", "<init>", "()V", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class Thinking extends com.paypal.oslo.feature.searchandintelligence.ui.ChatMessage {
        public static final int $stable = 0;
        public static final com.paypal.oslo.feature.searchandintelligence.ui.ChatMessage.Thinking INSTANCE = new com.paypal.oslo.feature.searchandintelligence.ui.ChatMessage.Thinking();

        public final int hashCode() {
            return 1568084344;
        }

        private Thinking() {
            super(null);
        }

        public final java.lang.String toString() {
            return "Thinking";
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.searchandintelligence.ui.ChatMessage.Thinking)) {
                return false;
            }
            return true;
        }
    }

    @kotlin.Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\t\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\b\b\u0086\b\u0018\u00002\u00020\u0001B\u0019\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\b\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\n\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\n\u0010\u000bJ$\u0010\f\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u0004HÆ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0011\u001a\u00020\u00102\b\u0010\u000f\u001a\u0004\u0018\u00010\u000eHÖ\u0003¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0013\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u000bJ\u0010\u0010\u0014\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0014\u0010\tR\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0015\u001a\u0004\b\u0016\u0010\tR\u001a\u0010\u0005\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0017\u001a\u0004\b\u0018\u0010\u000b"}, d2 = {"Lcom/paypal/oslo/feature/searchandintelligence/ui/ChatMessage$Agent;", "Lcom/paypal/oslo/feature/searchandintelligence/ui/ChatMessage;", "", "text", "", "maxLines", "<init>", "(Ljava/lang/String;I)V", "component1", "()Ljava/lang/String;", "component2", "()I", "copy", "(Ljava/lang/String;I)Lcom/paypal/oslo/feature/searchandintelligence/ui/ChatMessage$Agent;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "hashCode", "toString", "Ljava/lang/String;", "getText", com.visa.cbp.getEncExpo.warmup, "getMaxLines"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class Agent extends com.paypal.oslo.feature.searchandintelligence.ui.ChatMessage {
        public static final int $stable = 0;
        private final int maxLines;
        private final java.lang.String text;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Agent(java.lang.String str, int i) {
            super(null);
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
            this.text = str;
            this.maxLines = i;
        }

        public /* synthetic */ Agent(java.lang.String str, int i, int i2, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this(str, (i2 & 2) != 0 ? Integer.MAX_VALUE : i);
        }

        public final java.lang.String getText() {
            return this.text;
        }

        public final int getMaxLines() {
            return this.maxLines;
        }

        public final java.lang.String toString() {
            java.lang.String str = this.text;
            int i = this.maxLines;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("Agent(text=");
            sb.append(str);
            sb.append(", maxLines=");
            sb.append(i);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            return (this.text.hashCode() * 31) + java.lang.Integer.hashCode(this.maxLines);
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.searchandintelligence.ui.ChatMessage.Agent)) {
                return false;
            }
            com.paypal.oslo.feature.searchandintelligence.ui.ChatMessage.Agent agent = (com.paypal.oslo.feature.searchandintelligence.ui.ChatMessage.Agent) other;
            return kotlin.jvm.internal.Intrinsics.areEqual(this.text, agent.text) && this.maxLines == agent.maxLines;
        }

        public final com.paypal.oslo.feature.searchandintelligence.ui.ChatMessage.Agent copy(java.lang.String text, int maxLines) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(text, "");
            return new com.paypal.oslo.feature.searchandintelligence.ui.ChatMessage.Agent(text, maxLines);
        }

        /* renamed from: component2, reason: from getter */
        public final int getMaxLines() {
            return this.maxLines;
        }

        /* renamed from: component1, reason: from getter */
        public final java.lang.String getText() {
            return this.text;
        }

        public static /* synthetic */ com.paypal.oslo.feature.searchandintelligence.ui.ChatMessage.Agent copy$default(com.paypal.oslo.feature.searchandintelligence.ui.ChatMessage.Agent agent, java.lang.String str, int i, int i2, java.lang.Object obj) {
            if ((i2 & 1) != 0) {
                str = agent.text;
            }
            if ((i2 & 2) != 0) {
                i = agent.maxLines;
            }
            return agent.copy(str, i);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u001a\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0013\u001a\u00020\u0012HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014R\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0015\u001a\u0004\b\u0016\u0010\u0007"}, d2 = {"Lcom/paypal/oslo/feature/searchandintelligence/ui/ChatMessage$Error;", "Lcom/paypal/oslo/feature/searchandintelligence/ui/ChatMessage;", "Lcom/paypal/oslo/feature/searchandintelligence/ui/ChatStatus;", "cause", "<init>", "(Lcom/paypal/oslo/feature/searchandintelligence/ui/ChatStatus;)V", "component1", "()Lcom/paypal/oslo/feature/searchandintelligence/ui/ChatStatus;", "copy", "(Lcom/paypal/oslo/feature/searchandintelligence/ui/ChatStatus;)Lcom/paypal/oslo/feature/searchandintelligence/ui/ChatMessage$Error;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "Lcom/paypal/oslo/feature/searchandintelligence/ui/ChatStatus;", "getCause"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class Error extends com.paypal.oslo.feature.searchandintelligence.ui.ChatMessage {
        public static final int $stable = 0;
        private final com.paypal.oslo.feature.searchandintelligence.ui.ChatStatus cause;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Error(com.paypal.oslo.feature.searchandintelligence.ui.ChatStatus chatStatus) {
            super(null);
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(chatStatus, "");
            this.cause = chatStatus;
        }

        public final com.paypal.oslo.feature.searchandintelligence.ui.ChatStatus getCause() {
            return this.cause;
        }

        public final java.lang.String toString() {
            com.paypal.oslo.feature.searchandintelligence.ui.ChatStatus chatStatus = this.cause;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("Error(cause=");
            sb.append(chatStatus);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            return this.cause.hashCode();
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof com.paypal.oslo.feature.searchandintelligence.ui.ChatMessage.Error) && kotlin.jvm.internal.Intrinsics.areEqual(this.cause, ((com.paypal.oslo.feature.searchandintelligence.ui.ChatMessage.Error) other).cause);
        }

        public final com.paypal.oslo.feature.searchandintelligence.ui.ChatMessage.Error copy(com.paypal.oslo.feature.searchandintelligence.ui.ChatStatus cause) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(cause, "");
            return new com.paypal.oslo.feature.searchandintelligence.ui.ChatMessage.Error(cause);
        }

        /* renamed from: component1, reason: from getter */
        public final com.paypal.oslo.feature.searchandintelligence.ui.ChatStatus getCause() {
            return this.cause;
        }

        public static /* synthetic */ com.paypal.oslo.feature.searchandintelligence.ui.ChatMessage.Error copy$default(com.paypal.oslo.feature.searchandintelligence.ui.ChatMessage.Error error, com.paypal.oslo.feature.searchandintelligence.ui.ChatStatus chatStatus, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                chatStatus = error.cause;
            }
            return error.copy(chatStatus);
        }
    }

    public /* synthetic */ ChatMessage(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }
}
