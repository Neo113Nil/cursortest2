package com.adobe.marketing.mobile.aepcomposeui;

@kotlin.Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\b6\u0018\u0000*\b\b\u0000\u0010\u0002*\u00020\u0001*\b\b\u0001\u0010\u0004*\u00020\u00032\u00020\u0005:\u0003\u000e\u000f\u0010B\u001d\b\u0004\u0012\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0006¢\u0006\u0004\b\b\u0010\tR&\u0010\n\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u00068\u0017X\u0096\u0004¢\u0006\f\n\u0004\b\n\u0010\u000b\u001a\u0004\b\f\u0010\r\u0082\u0001\u0003\u0011\u0012\u0013"}, d2 = {"Lcom/adobe/marketing/mobile/aepcomposeui/UIEvent;", "Lcom/adobe/marketing/mobile/aepcomposeui/uimodels/AepUITemplate;", "T", "Lcom/adobe/marketing/mobile/aepcomposeui/state/AepCardUIState;", "S", "", "Lcom/adobe/marketing/mobile/aepcomposeui/AepUI;", "p0", "<init>", "(Lcom/adobe/marketing/mobile/aepcomposeui/AepUI;)V", "aepUi", "Lcom/adobe/marketing/mobile/aepcomposeui/AepUI;", "getAepUi", "()Lcom/adobe/marketing/mobile/aepcomposeui/AepUI;", com.paypal.oslo.feature.balance.common.AutoReloadConstants.IntentNames.INTENT_DISMISS, "Display", "Interact", "Lcom/adobe/marketing/mobile/aepcomposeui/UIEvent$Dismiss;", "Lcom/adobe/marketing/mobile/aepcomposeui/UIEvent$Display;", "Lcom/adobe/marketing/mobile/aepcomposeui/UIEvent$Interact;"}, k = 1, mv = {1, 5, 1}, xi = 48)
/* loaded from: classes7.dex */
public abstract class UIEvent<T extends com.adobe.marketing.mobile.aepcomposeui.uimodels.AepUITemplate, S extends com.adobe.marketing.mobile.aepcomposeui.state.AepCardUIState> {
    public static final int $stable = 8;
    private final com.adobe.marketing.mobile.aepcomposeui.AepUI<T, S> aepUi;

    private UIEvent(com.adobe.marketing.mobile.aepcomposeui.AepUI<T, S> aepUI) {
        this.aepUi = aepUI;
    }

    public com.adobe.marketing.mobile.aepcomposeui.AepUI<T, S> getAepUi() {
        return this.aepUi;
    }

    @kotlin.Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0086\b\u0018\u0000*\b\b\u0002\u0010\u0002*\u00020\u0001*\b\b\u0003\u0010\u0004*\u00020\u00032\u000e\u0012\u0004\u0012\u00028\u0002\u0012\u0004\u0012\u00028\u00030\u0005B\u001b\u0012\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00028\u0002\u0012\u0004\u0012\u00028\u00030\u0006¢\u0006\u0004\b\b\u0010\tJ\u001c\u0010\n\u001a\u000e\u0012\u0004\u0012\u00028\u0002\u0012\u0004\u0012\u00028\u00030\u0006HÆ\u0003¢\u0006\u0004\b\n\u0010\u000bJ2\u0010\f\u001a\u000e\u0012\u0004\u0012\u00028\u0002\u0012\u0004\u0012\u00028\u00030\u00002\u0014\b\u0002\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00028\u0002\u0012\u0004\u0012\u00028\u00030\u0006HÆ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0011\u001a\u00020\u00102\b\u0010\u000f\u001a\u0004\u0018\u00010\u000eHÖ\u0003¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0014\u001a\u00020\u0013HÖ\u0001¢\u0006\u0004\b\u0014\u0010\u0015J\u0010\u0010\u0017\u001a\u00020\u0016HÖ\u0001¢\u0006\u0004\b\u0017\u0010\u0018R&\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00028\u0002\u0012\u0004\u0012\u00028\u00030\u00068\u0017X\u0096\u0004¢\u0006\f\n\u0004\b\u0007\u0010\u0019\u001a\u0004\b\u001a\u0010\u000b"}, d2 = {"Lcom/adobe/marketing/mobile/aepcomposeui/UIEvent$Display;", "Lcom/adobe/marketing/mobile/aepcomposeui/uimodels/AepUITemplate;", "T", "Lcom/adobe/marketing/mobile/aepcomposeui/state/AepCardUIState;", "S", "Lcom/adobe/marketing/mobile/aepcomposeui/UIEvent;", "Lcom/adobe/marketing/mobile/aepcomposeui/AepUI;", "aepUi", "<init>", "(Lcom/adobe/marketing/mobile/aepcomposeui/AepUI;)V", "component1", "()Lcom/adobe/marketing/mobile/aepcomposeui/AepUI;", "copy", "(Lcom/adobe/marketing/mobile/aepcomposeui/AepUI;)Lcom/adobe/marketing/mobile/aepcomposeui/UIEvent$Display;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "Lcom/adobe/marketing/mobile/aepcomposeui/AepUI;", "getAepUi"}, k = 1, mv = {1, 5, 1}, xi = 48)
    public static final /* data */ class Display<T extends com.adobe.marketing.mobile.aepcomposeui.uimodels.AepUITemplate, S extends com.adobe.marketing.mobile.aepcomposeui.state.AepCardUIState> extends com.adobe.marketing.mobile.aepcomposeui.UIEvent<T, S> {
        public static final int $stable = 8;
        private final com.adobe.marketing.mobile.aepcomposeui.AepUI<T, S> aepUi;

        @Override // com.adobe.marketing.mobile.aepcomposeui.UIEvent
        public final com.adobe.marketing.mobile.aepcomposeui.AepUI<T, S> getAepUi() {
            return this.aepUi;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Display(com.adobe.marketing.mobile.aepcomposeui.AepUI<T, S> aepUI) {
            super(aepUI, null);
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(aepUI, "");
            this.aepUi = aepUI;
        }

        public final java.lang.String toString() {
            java.lang.StringBuilder sb = new java.lang.StringBuilder("Display(aepUi=");
            sb.append(this.aepUi);
            sb.append(')');
            return sb.toString();
        }

        public final int hashCode() {
            return this.aepUi.hashCode();
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof com.adobe.marketing.mobile.aepcomposeui.UIEvent.Display) && kotlin.jvm.internal.Intrinsics.areEqual(this.aepUi, ((com.adobe.marketing.mobile.aepcomposeui.UIEvent.Display) other).aepUi);
        }

        public final com.adobe.marketing.mobile.aepcomposeui.UIEvent.Display<T, S> copy(com.adobe.marketing.mobile.aepcomposeui.AepUI<T, S> aepUi) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(aepUi, "");
            return new com.adobe.marketing.mobile.aepcomposeui.UIEvent.Display<>(aepUi);
        }

        public final com.adobe.marketing.mobile.aepcomposeui.AepUI<T, S> component1() {
            return this.aepUi;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ com.adobe.marketing.mobile.aepcomposeui.UIEvent.Display copy$default(com.adobe.marketing.mobile.aepcomposeui.UIEvent.Display display, com.adobe.marketing.mobile.aepcomposeui.AepUI aepUI, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                aepUI = display.aepUi;
            }
            return display.copy(aepUI);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\b\u0086\b\u0018\u0000*\b\b\u0002\u0010\u0002*\u00020\u0001*\b\b\u0003\u0010\u0004*\u00020\u00032\u000e\u0012\u0004\u0012\u00028\u0002\u0012\u0004\u0012\u00028\u00030\u0005B#\u0012\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00028\u0002\u0012\u0004\u0012\u00028\u00030\u0006\u0012\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bJ\u001c\u0010\f\u001a\u000e\u0012\u0004\u0012\u00028\u0002\u0012\u0004\u0012\u00028\u00030\u0006HÆ\u0003¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000e\u001a\u00020\bHÆ\u0003¢\u0006\u0004\b\u000e\u0010\u000fJ<\u0010\u0010\u001a\u000e\u0012\u0004\u0012\u00028\u0002\u0012\u0004\u0012\u00028\u00030\u00002\u0014\b\u0002\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00028\u0002\u0012\u0004\u0012\u00028\u00030\u00062\b\b\u0002\u0010\t\u001a\u00020\bHÆ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u001a\u0010\u0015\u001a\u00020\u00142\b\u0010\u0013\u001a\u0004\u0018\u00010\u0012HÖ\u0003¢\u0006\u0004\b\u0015\u0010\u0016J\u0010\u0010\u0018\u001a\u00020\u0017HÖ\u0001¢\u0006\u0004\b\u0018\u0010\u0019J\u0010\u0010\u001b\u001a\u00020\u001aHÖ\u0001¢\u0006\u0004\b\u001b\u0010\u001cR\u0017\u0010\t\u001a\u00020\b8\u0007¢\u0006\f\n\u0004\b\t\u0010\u001d\u001a\u0004\b\u001e\u0010\u000fR&\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00028\u0002\u0012\u0004\u0012\u00028\u00030\u00068\u0017X\u0097\u0004¢\u0006\f\n\u0004\b\u0007\u0010\u001f\u001a\u0004\b \u0010\r"}, d2 = {"Lcom/adobe/marketing/mobile/aepcomposeui/UIEvent$Interact;", "Lcom/adobe/marketing/mobile/aepcomposeui/uimodels/AepUITemplate;", "T", "Lcom/adobe/marketing/mobile/aepcomposeui/state/AepCardUIState;", "S", "Lcom/adobe/marketing/mobile/aepcomposeui/UIEvent;", "Lcom/adobe/marketing/mobile/aepcomposeui/AepUI;", "aepUi", "Lcom/adobe/marketing/mobile/aepcomposeui/UIAction;", "action", "<init>", "(Lcom/adobe/marketing/mobile/aepcomposeui/AepUI;Lcom/adobe/marketing/mobile/aepcomposeui/UIAction;)V", "component1", "()Lcom/adobe/marketing/mobile/aepcomposeui/AepUI;", "component2", "()Lcom/adobe/marketing/mobile/aepcomposeui/UIAction;", "copy", "(Lcom/adobe/marketing/mobile/aepcomposeui/AepUI;Lcom/adobe/marketing/mobile/aepcomposeui/UIAction;)Lcom/adobe/marketing/mobile/aepcomposeui/UIEvent$Interact;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "Lcom/adobe/marketing/mobile/aepcomposeui/UIAction;", "getAction", "Lcom/adobe/marketing/mobile/aepcomposeui/AepUI;", "getAepUi"}, k = 1, mv = {1, 5, 1}, xi = 48)
    public static final /* data */ class Interact<T extends com.adobe.marketing.mobile.aepcomposeui.uimodels.AepUITemplate, S extends com.adobe.marketing.mobile.aepcomposeui.state.AepCardUIState> extends com.adobe.marketing.mobile.aepcomposeui.UIEvent<T, S> {
        public static final int $stable = 8;
        private final com.adobe.marketing.mobile.aepcomposeui.UIAction action;
        private final com.adobe.marketing.mobile.aepcomposeui.AepUI<T, S> aepUi;

        @Override // com.adobe.marketing.mobile.aepcomposeui.UIEvent
        public final com.adobe.marketing.mobile.aepcomposeui.AepUI<T, S> getAepUi() {
            return this.aepUi;
        }

        public final com.adobe.marketing.mobile.aepcomposeui.UIAction getAction() {
            return this.action;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Interact(com.adobe.marketing.mobile.aepcomposeui.AepUI<T, S> aepUI, com.adobe.marketing.mobile.aepcomposeui.UIAction uIAction) {
            super(aepUI, null);
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(aepUI, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(uIAction, "");
            this.aepUi = aepUI;
            this.action = uIAction;
        }

        public final java.lang.String toString() {
            java.lang.StringBuilder sb = new java.lang.StringBuilder("Interact(aepUi=");
            sb.append(this.aepUi);
            sb.append(", action=");
            sb.append(this.action);
            sb.append(')');
            return sb.toString();
        }

        public final int hashCode() {
            return (this.aepUi.hashCode() * 31) + this.action.hashCode();
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.adobe.marketing.mobile.aepcomposeui.UIEvent.Interact)) {
                return false;
            }
            com.adobe.marketing.mobile.aepcomposeui.UIEvent.Interact interact = (com.adobe.marketing.mobile.aepcomposeui.UIEvent.Interact) other;
            return kotlin.jvm.internal.Intrinsics.areEqual(this.aepUi, interact.aepUi) && kotlin.jvm.internal.Intrinsics.areEqual(this.action, interact.action);
        }

        public final com.adobe.marketing.mobile.aepcomposeui.UIEvent.Interact<T, S> copy(com.adobe.marketing.mobile.aepcomposeui.AepUI<T, S> aepUi, com.adobe.marketing.mobile.aepcomposeui.UIAction action) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(aepUi, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(action, "");
            return new com.adobe.marketing.mobile.aepcomposeui.UIEvent.Interact<>(aepUi, action);
        }

        /* renamed from: component2, reason: from getter */
        public final com.adobe.marketing.mobile.aepcomposeui.UIAction getAction() {
            return this.action;
        }

        public final com.adobe.marketing.mobile.aepcomposeui.AepUI<T, S> component1() {
            return this.aepUi;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ com.adobe.marketing.mobile.aepcomposeui.UIEvent.Interact copy$default(com.adobe.marketing.mobile.aepcomposeui.UIEvent.Interact interact, com.adobe.marketing.mobile.aepcomposeui.AepUI aepUI, com.adobe.marketing.mobile.aepcomposeui.UIAction uIAction, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                aepUI = interact.aepUi;
            }
            if ((i & 2) != 0) {
                uIAction = interact.action;
            }
            return interact.copy(aepUI, uIAction);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0086\b\u0018\u0000*\b\b\u0002\u0010\u0002*\u00020\u0001*\b\b\u0003\u0010\u0004*\u00020\u00032\u000e\u0012\u0004\u0012\u00028\u0002\u0012\u0004\u0012\u00028\u00030\u0005B\u001b\u0012\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00028\u0002\u0012\u0004\u0012\u00028\u00030\u0006¢\u0006\u0004\b\b\u0010\tJ\u001c\u0010\n\u001a\u000e\u0012\u0004\u0012\u00028\u0002\u0012\u0004\u0012\u00028\u00030\u0006HÆ\u0003¢\u0006\u0004\b\n\u0010\u000bJ2\u0010\f\u001a\u000e\u0012\u0004\u0012\u00028\u0002\u0012\u0004\u0012\u00028\u00030\u00002\u0014\b\u0002\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00028\u0002\u0012\u0004\u0012\u00028\u00030\u0006HÆ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0011\u001a\u00020\u00102\b\u0010\u000f\u001a\u0004\u0018\u00010\u000eHÖ\u0003¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0014\u001a\u00020\u0013HÖ\u0001¢\u0006\u0004\b\u0014\u0010\u0015J\u0010\u0010\u0017\u001a\u00020\u0016HÖ\u0001¢\u0006\u0004\b\u0017\u0010\u0018R&\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00028\u0002\u0012\u0004\u0012\u00028\u00030\u00068\u0017X\u0096\u0004¢\u0006\f\n\u0004\b\u0007\u0010\u0019\u001a\u0004\b\u001a\u0010\u000b"}, d2 = {"Lcom/adobe/marketing/mobile/aepcomposeui/UIEvent$Dismiss;", "Lcom/adobe/marketing/mobile/aepcomposeui/uimodels/AepUITemplate;", "T", "Lcom/adobe/marketing/mobile/aepcomposeui/state/AepCardUIState;", "S", "Lcom/adobe/marketing/mobile/aepcomposeui/UIEvent;", "Lcom/adobe/marketing/mobile/aepcomposeui/AepUI;", "aepUi", "<init>", "(Lcom/adobe/marketing/mobile/aepcomposeui/AepUI;)V", "component1", "()Lcom/adobe/marketing/mobile/aepcomposeui/AepUI;", "copy", "(Lcom/adobe/marketing/mobile/aepcomposeui/AepUI;)Lcom/adobe/marketing/mobile/aepcomposeui/UIEvent$Dismiss;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "Lcom/adobe/marketing/mobile/aepcomposeui/AepUI;", "getAepUi"}, k = 1, mv = {1, 5, 1}, xi = 48)
    public static final /* data */ class Dismiss<T extends com.adobe.marketing.mobile.aepcomposeui.uimodels.AepUITemplate, S extends com.adobe.marketing.mobile.aepcomposeui.state.AepCardUIState> extends com.adobe.marketing.mobile.aepcomposeui.UIEvent<T, S> {
        public static final int $stable = 8;
        private final com.adobe.marketing.mobile.aepcomposeui.AepUI<T, S> aepUi;

        @Override // com.adobe.marketing.mobile.aepcomposeui.UIEvent
        public final com.adobe.marketing.mobile.aepcomposeui.AepUI<T, S> getAepUi() {
            return this.aepUi;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Dismiss(com.adobe.marketing.mobile.aepcomposeui.AepUI<T, S> aepUI) {
            super(aepUI, null);
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(aepUI, "");
            this.aepUi = aepUI;
        }

        public final java.lang.String toString() {
            java.lang.StringBuilder sb = new java.lang.StringBuilder("Dismiss(aepUi=");
            sb.append(this.aepUi);
            sb.append(')');
            return sb.toString();
        }

        public final int hashCode() {
            return this.aepUi.hashCode();
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof com.adobe.marketing.mobile.aepcomposeui.UIEvent.Dismiss) && kotlin.jvm.internal.Intrinsics.areEqual(this.aepUi, ((com.adobe.marketing.mobile.aepcomposeui.UIEvent.Dismiss) other).aepUi);
        }

        public final com.adobe.marketing.mobile.aepcomposeui.UIEvent.Dismiss<T, S> copy(com.adobe.marketing.mobile.aepcomposeui.AepUI<T, S> aepUi) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(aepUi, "");
            return new com.adobe.marketing.mobile.aepcomposeui.UIEvent.Dismiss<>(aepUi);
        }

        public final com.adobe.marketing.mobile.aepcomposeui.AepUI<T, S> component1() {
            return this.aepUi;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ com.adobe.marketing.mobile.aepcomposeui.UIEvent.Dismiss copy$default(com.adobe.marketing.mobile.aepcomposeui.UIEvent.Dismiss dismiss, com.adobe.marketing.mobile.aepcomposeui.AepUI aepUI, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                aepUI = dismiss.aepUi;
            }
            return dismiss.copy(aepUI);
        }
    }

    public /* synthetic */ UIEvent(com.adobe.marketing.mobile.aepcomposeui.AepUI aepUI, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this(aepUI);
    }
}
