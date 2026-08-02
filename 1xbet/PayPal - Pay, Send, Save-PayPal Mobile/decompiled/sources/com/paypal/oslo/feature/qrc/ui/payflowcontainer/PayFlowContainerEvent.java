package com.paypal.oslo.feature.qrc.ui.payflowcontainer;

@kotlin.Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\b0\u0018\u00002\u00020\u0001:\u0005\n\u000b\f\r\u000eB\u0011\b\u0004\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u001a\u0010\u0006\u001a\u00020\u00028\u0017X\u0096\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\b\u0010\t\u0082\u0001\u0005\u000f\u0010\u0011\u0012\u0013"}, d2 = {"Lcom/paypal/oslo/feature/qrc/ui/payflowcontainer/PayFlowContainerEvent;", "Lcom/paypal/oslo/core/mvi/Event;", "", "p0", "<init>", "(Ljava/lang/String;)V", "name", "Ljava/lang/String;", "getName", "()Ljava/lang/String;", "LoadScreen", "TabPressed", "ClosePressed", "LoadingTaskStarted", "LoadingTaskCompleted", "Lcom/paypal/oslo/feature/qrc/ui/payflowcontainer/PayFlowContainerEvent$ClosePressed;", "Lcom/paypal/oslo/feature/qrc/ui/payflowcontainer/PayFlowContainerEvent$LoadScreen;", "Lcom/paypal/oslo/feature/qrc/ui/payflowcontainer/PayFlowContainerEvent$LoadingTaskCompleted;", "Lcom/paypal/oslo/feature/qrc/ui/payflowcontainer/PayFlowContainerEvent$LoadingTaskStarted;", "Lcom/paypal/oslo/feature/qrc/ui/payflowcontainer/PayFlowContainerEvent$TabPressed;"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes14.dex */
public abstract class PayFlowContainerEvent implements com.paypal.oslo.core.mvi.Event {
    public static final int $stable = 0;
    private final java.lang.String name;

    private PayFlowContainerEvent(java.lang.String str) {
        this.name = str;
    }

    @Override // com.paypal.oslo.core.mvi.Event
    public java.lang.String getName() {
        return this.name;
    }

    @kotlin.Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001B\u0015\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u0016\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002HÆ\u0003¢\u0006\u0004\b\u0007\u0010\bJ \u0010\t\u001a\u00020\u00002\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002HÆ\u0001¢\u0006\u0004\b\t\u0010\nJ\u001a\u0010\u000e\u001a\u00020\r2\b\u0010\f\u001a\u0004\u0018\u00010\u000bHÖ\u0003¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0011\u001a\u00020\u0010HÖ\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0014\u001a\u00020\u0013HÖ\u0001¢\u0006\u0004\b\u0014\u0010\u0015R\u001d\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0007¢\u0006\f\n\u0004\b\u0004\u0010\u0016\u001a\u0004\b\u0017\u0010\b"}, d2 = {"Lcom/paypal/oslo/feature/qrc/ui/payflowcontainer/PayFlowContainerEvent$LoadScreen;", "Lcom/paypal/oslo/feature/qrc/ui/payflowcontainer/PayFlowContainerEvent;", "", "Lcom/paypal/oslo/feature/qrc/ui/payflowcontainer/QrcTab;", "availableTabs", "<init>", "(Ljava/util/List;)V", "component1", "()Ljava/util/List;", "copy", "(Ljava/util/List;)Lcom/paypal/oslo/feature/qrc/ui/payflowcontainer/PayFlowContainerEvent$LoadScreen;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "Ljava/util/List;", "getAvailableTabs"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class LoadScreen extends com.paypal.oslo.feature.qrc.ui.payflowcontainer.PayFlowContainerEvent {
        public static final int $stable = 8;
        private final java.util.List<com.paypal.oslo.feature.qrc.ui.payflowcontainer.QrcTab> availableTabs;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public LoadScreen(java.util.List<? extends com.paypal.oslo.feature.qrc.ui.payflowcontainer.QrcTab> list) {
            super("PayFlowContainerEvent.LoadScreen", null);
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(list, "");
            this.availableTabs = list;
        }

        public final java.util.List<com.paypal.oslo.feature.qrc.ui.payflowcontainer.QrcTab> getAvailableTabs() {
            return this.availableTabs;
        }

        public final java.lang.String toString() {
            java.util.List<com.paypal.oslo.feature.qrc.ui.payflowcontainer.QrcTab> list = this.availableTabs;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("LoadScreen(availableTabs=");
            sb.append(list);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            return this.availableTabs.hashCode();
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof com.paypal.oslo.feature.qrc.ui.payflowcontainer.PayFlowContainerEvent.LoadScreen) && kotlin.jvm.internal.Intrinsics.areEqual(this.availableTabs, ((com.paypal.oslo.feature.qrc.ui.payflowcontainer.PayFlowContainerEvent.LoadScreen) other).availableTabs);
        }

        public final com.paypal.oslo.feature.qrc.ui.payflowcontainer.PayFlowContainerEvent.LoadScreen copy(java.util.List<? extends com.paypal.oslo.feature.qrc.ui.payflowcontainer.QrcTab> availableTabs) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(availableTabs, "");
            return new com.paypal.oslo.feature.qrc.ui.payflowcontainer.PayFlowContainerEvent.LoadScreen(availableTabs);
        }

        public final java.util.List<com.paypal.oslo.feature.qrc.ui.payflowcontainer.QrcTab> component1() {
            return this.availableTabs;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ com.paypal.oslo.feature.qrc.ui.payflowcontainer.PayFlowContainerEvent.LoadScreen copy$default(com.paypal.oslo.feature.qrc.ui.payflowcontainer.PayFlowContainerEvent.LoadScreen loadScreen, java.util.List list, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                list = loadScreen.availableTabs;
            }
            return loadScreen.copy(list);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u001a\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u000f\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u000f\u0010\u0007J\u0010\u0010\u0011\u001a\u00020\u0010HÖ\u0001¢\u0006\u0004\b\u0011\u0010\u0012R\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0013\u001a\u0004\b\u0014\u0010\u0007"}, d2 = {"Lcom/paypal/oslo/feature/qrc/ui/payflowcontainer/PayFlowContainerEvent$TabPressed;", "Lcom/paypal/oslo/feature/qrc/ui/payflowcontainer/PayFlowContainerEvent;", "", "selectedIndex", "<init>", "(I)V", "component1", "()I", "copy", "(I)Lcom/paypal/oslo/feature/qrc/ui/payflowcontainer/PayFlowContainerEvent$TabPressed;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "hashCode", "", "toString", "()Ljava/lang/String;", com.visa.cbp.getEncExpo.warmup, "getSelectedIndex"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class TabPressed extends com.paypal.oslo.feature.qrc.ui.payflowcontainer.PayFlowContainerEvent {
        public static final int $stable = 0;
        private final int selectedIndex;

        public TabPressed(int i) {
            super("PayFlowContainerEvent.TabPressed", null);
            this.selectedIndex = i;
        }

        public final int getSelectedIndex() {
            return this.selectedIndex;
        }

        public final java.lang.String toString() {
            int i = this.selectedIndex;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("TabPressed(selectedIndex=");
            sb.append(i);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            return java.lang.Integer.hashCode(this.selectedIndex);
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof com.paypal.oslo.feature.qrc.ui.payflowcontainer.PayFlowContainerEvent.TabPressed) && this.selectedIndex == ((com.paypal.oslo.feature.qrc.ui.payflowcontainer.PayFlowContainerEvent.TabPressed) other).selectedIndex;
        }

        public final com.paypal.oslo.feature.qrc.ui.payflowcontainer.PayFlowContainerEvent.TabPressed copy(int selectedIndex) {
            return new com.paypal.oslo.feature.qrc.ui.payflowcontainer.PayFlowContainerEvent.TabPressed(selectedIndex);
        }

        /* renamed from: component1, reason: from getter */
        public final int getSelectedIndex() {
            return this.selectedIndex;
        }

        public static /* synthetic */ com.paypal.oslo.feature.qrc.ui.payflowcontainer.PayFlowContainerEvent.TabPressed copy$default(com.paypal.oslo.feature.qrc.ui.payflowcontainer.PayFlowContainerEvent.TabPressed tabPressed, int i, int i2, java.lang.Object obj) {
            if ((i2 & 1) != 0) {
                i = tabPressed.selectedIndex;
            }
            return tabPressed.copy(i);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001a\u0010\u0007\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004HÖ\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000e"}, d2 = {"Lcom/paypal/oslo/feature/qrc/ui/payflowcontainer/PayFlowContainerEvent$ClosePressed;", "Lcom/paypal/oslo/feature/qrc/ui/payflowcontainer/PayFlowContainerEvent;", "<init>", "()V", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class ClosePressed extends com.paypal.oslo.feature.qrc.ui.payflowcontainer.PayFlowContainerEvent {
        public static final int $stable = 0;
        public static final com.paypal.oslo.feature.qrc.ui.payflowcontainer.PayFlowContainerEvent.ClosePressed INSTANCE = new com.paypal.oslo.feature.qrc.ui.payflowcontainer.PayFlowContainerEvent.ClosePressed();

        public final int hashCode() {
            return 327599;
        }

        private ClosePressed() {
            super("PayFlowContainerEvent.ClosePressed", null);
        }

        public final java.lang.String toString() {
            return "ClosePressed";
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.qrc.ui.payflowcontainer.PayFlowContainerEvent.ClosePressed)) {
                return false;
            }
            return true;
        }
    }

    @kotlin.Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001a\u0010\u0007\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004HÖ\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000e"}, d2 = {"Lcom/paypal/oslo/feature/qrc/ui/payflowcontainer/PayFlowContainerEvent$LoadingTaskStarted;", "Lcom/paypal/oslo/feature/qrc/ui/payflowcontainer/PayFlowContainerEvent;", "<init>", "()V", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class LoadingTaskStarted extends com.paypal.oslo.feature.qrc.ui.payflowcontainer.PayFlowContainerEvent {
        public static final int $stable = 0;
        public static final com.paypal.oslo.feature.qrc.ui.payflowcontainer.PayFlowContainerEvent.LoadingTaskStarted INSTANCE = new com.paypal.oslo.feature.qrc.ui.payflowcontainer.PayFlowContainerEvent.LoadingTaskStarted();

        public final int hashCode() {
            return 2047290693;
        }

        private LoadingTaskStarted() {
            super("PayFlowContainerEvent.LoadingTaskStarted", null);
        }

        public final java.lang.String toString() {
            return "LoadingTaskStarted";
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.qrc.ui.payflowcontainer.PayFlowContainerEvent.LoadingTaskStarted)) {
                return false;
            }
            return true;
        }
    }

    @kotlin.Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001a\u0010\u0007\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004HÖ\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000e"}, d2 = {"Lcom/paypal/oslo/feature/qrc/ui/payflowcontainer/PayFlowContainerEvent$LoadingTaskCompleted;", "Lcom/paypal/oslo/feature/qrc/ui/payflowcontainer/PayFlowContainerEvent;", "<init>", "()V", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class LoadingTaskCompleted extends com.paypal.oslo.feature.qrc.ui.payflowcontainer.PayFlowContainerEvent {
        public static final int $stable = 0;
        public static final com.paypal.oslo.feature.qrc.ui.payflowcontainer.PayFlowContainerEvent.LoadingTaskCompleted INSTANCE = new com.paypal.oslo.feature.qrc.ui.payflowcontainer.PayFlowContainerEvent.LoadingTaskCompleted();

        public final int hashCode() {
            return 1077199375;
        }

        private LoadingTaskCompleted() {
            super("PayFlowContainerEvent.LoadingTaskCompleted", null);
        }

        public final java.lang.String toString() {
            return "LoadingTaskCompleted";
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.qrc.ui.payflowcontainer.PayFlowContainerEvent.LoadingTaskCompleted)) {
                return false;
            }
            return true;
        }
    }

    public /* synthetic */ PayFlowContainerEvent(java.lang.String str, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this(str);
    }
}
