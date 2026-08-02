package com.paypal.oslo.feature.revolvingcreditacquisition.ui.landing.viewmodel;

@kotlin.Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\b0\u0018\u00002\u00020\u00012\u00020\u0002:\u0005\u000b\f\r\u000e\u000fB\u0011\b\u0004\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006R\u001a\u0010\u0007\u001a\u00020\u00038\u0017X\u0096\u0004¢\u0006\f\n\u0004\b\u0007\u0010\b\u001a\u0004\b\t\u0010\n\u0082\u0001\u0005\u0010\u0011\u0012\u0013\u0014"}, d2 = {"Lcom/paypal/oslo/feature/revolvingcreditacquisition/ui/landing/viewmodel/AcquisitionLandingEvent;", "Lcom/paypal/oslo/core/mvi/Event;", "Lcom/paypal/oslo/feature/revolvingcreditacquisition/ui/common/logger/Loggable;", "", "p0", "<init>", "(Ljava/lang/String;)V", "name", "Ljava/lang/String;", "getName", "()Ljava/lang/String;", "OnNavigateToWebViewFlow", "OnNavigateToNativeFlow", "OnFlowDisabled", "OnDismissUnavailableScreen", "OnDismissInvalidState", "Lcom/paypal/oslo/feature/revolvingcreditacquisition/ui/landing/viewmodel/AcquisitionLandingEvent$OnDismissInvalidState;", "Lcom/paypal/oslo/feature/revolvingcreditacquisition/ui/landing/viewmodel/AcquisitionLandingEvent$OnDismissUnavailableScreen;", "Lcom/paypal/oslo/feature/revolvingcreditacquisition/ui/landing/viewmodel/AcquisitionLandingEvent$OnFlowDisabled;", "Lcom/paypal/oslo/feature/revolvingcreditacquisition/ui/landing/viewmodel/AcquisitionLandingEvent$OnNavigateToNativeFlow;", "Lcom/paypal/oslo/feature/revolvingcreditacquisition/ui/landing/viewmodel/AcquisitionLandingEvent$OnNavigateToWebViewFlow;"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes14.dex */
public abstract class AcquisitionLandingEvent implements com.paypal.oslo.core.mvi.Event, com.paypal.oslo.feature.revolvingcreditacquisition.ui.common.logger.Loggable {
    public static final int $stable = 0;
    private final java.lang.String name;

    @kotlin.Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001a\u0010\u0007\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004HÖ\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000e"}, d2 = {"Lcom/paypal/oslo/feature/revolvingcreditacquisition/ui/landing/viewmodel/AcquisitionLandingEvent$OnNavigateToWebViewFlow;", "Lcom/paypal/oslo/feature/revolvingcreditacquisition/ui/landing/viewmodel/AcquisitionLandingEvent;", "<init>", "()V", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class OnNavigateToWebViewFlow extends com.paypal.oslo.feature.revolvingcreditacquisition.ui.landing.viewmodel.AcquisitionLandingEvent {
        public static final int $stable = 0;
        public static final com.paypal.oslo.feature.revolvingcreditacquisition.ui.landing.viewmodel.AcquisitionLandingEvent.OnNavigateToWebViewFlow INSTANCE = new com.paypal.oslo.feature.revolvingcreditacquisition.ui.landing.viewmodel.AcquisitionLandingEvent.OnNavigateToWebViewFlow();

        public final int hashCode() {
            return 1160454712;
        }

        private OnNavigateToWebViewFlow() {
            super("OnNavigateToWebViewFlow", null);
        }

        public final java.lang.String toString() {
            return "OnNavigateToWebViewFlow";
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.revolvingcreditacquisition.ui.landing.viewmodel.AcquisitionLandingEvent.OnNavigateToWebViewFlow)) {
                return false;
            }
            return true;
        }
    }

    private AcquisitionLandingEvent(java.lang.String str) {
        this.name = str;
    }

    @Override // com.paypal.oslo.feature.revolvingcreditacquisition.ui.common.logger.Loggable
    public /* bridge */ java.util.Map<java.lang.String, java.lang.String> getLogParams() {
        return super.getLogParams();
    }

    @Override // com.paypal.oslo.core.mvi.Event
    public java.lang.String getName() {
        return this.name;
    }

    @Override // com.paypal.oslo.feature.revolvingcreditacquisition.ui.common.logger.Loggable
    public /* bridge */ java.util.Map<java.lang.String, java.lang.String> getPiiParams() {
        return super.getPiiParams();
    }

    @kotlin.Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001a\u0010\u0007\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004HÖ\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000e"}, d2 = {"Lcom/paypal/oslo/feature/revolvingcreditacquisition/ui/landing/viewmodel/AcquisitionLandingEvent$OnNavigateToNativeFlow;", "Lcom/paypal/oslo/feature/revolvingcreditacquisition/ui/landing/viewmodel/AcquisitionLandingEvent;", "<init>", "()V", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class OnNavigateToNativeFlow extends com.paypal.oslo.feature.revolvingcreditacquisition.ui.landing.viewmodel.AcquisitionLandingEvent {
        public static final int $stable = 0;
        public static final com.paypal.oslo.feature.revolvingcreditacquisition.ui.landing.viewmodel.AcquisitionLandingEvent.OnNavigateToNativeFlow INSTANCE = new com.paypal.oslo.feature.revolvingcreditacquisition.ui.landing.viewmodel.AcquisitionLandingEvent.OnNavigateToNativeFlow();

        public final int hashCode() {
            return 1666663028;
        }

        private OnNavigateToNativeFlow() {
            super("OnNavigateToNativeFlow", null);
        }

        public final java.lang.String toString() {
            return "OnNavigateToNativeFlow";
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.revolvingcreditacquisition.ui.landing.viewmodel.AcquisitionLandingEvent.OnNavigateToNativeFlow)) {
                return false;
            }
            return true;
        }
    }

    @kotlin.Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001a\u0010\u0007\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004HÖ\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000e"}, d2 = {"Lcom/paypal/oslo/feature/revolvingcreditacquisition/ui/landing/viewmodel/AcquisitionLandingEvent$OnFlowDisabled;", "Lcom/paypal/oslo/feature/revolvingcreditacquisition/ui/landing/viewmodel/AcquisitionLandingEvent;", "<init>", "()V", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class OnFlowDisabled extends com.paypal.oslo.feature.revolvingcreditacquisition.ui.landing.viewmodel.AcquisitionLandingEvent {
        public static final int $stable = 0;
        public static final com.paypal.oslo.feature.revolvingcreditacquisition.ui.landing.viewmodel.AcquisitionLandingEvent.OnFlowDisabled INSTANCE = new com.paypal.oslo.feature.revolvingcreditacquisition.ui.landing.viewmodel.AcquisitionLandingEvent.OnFlowDisabled();

        public final int hashCode() {
            return 644923501;
        }

        private OnFlowDisabled() {
            super("OnFlowDisabled", null);
        }

        public final java.lang.String toString() {
            return "OnFlowDisabled";
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.revolvingcreditacquisition.ui.landing.viewmodel.AcquisitionLandingEvent.OnFlowDisabled)) {
                return false;
            }
            return true;
        }
    }

    @kotlin.Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001a\u0010\u0007\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004HÖ\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000e"}, d2 = {"Lcom/paypal/oslo/feature/revolvingcreditacquisition/ui/landing/viewmodel/AcquisitionLandingEvent$OnDismissUnavailableScreen;", "Lcom/paypal/oslo/feature/revolvingcreditacquisition/ui/landing/viewmodel/AcquisitionLandingEvent;", "<init>", "()V", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class OnDismissUnavailableScreen extends com.paypal.oslo.feature.revolvingcreditacquisition.ui.landing.viewmodel.AcquisitionLandingEvent {
        public static final int $stable = 0;
        public static final com.paypal.oslo.feature.revolvingcreditacquisition.ui.landing.viewmodel.AcquisitionLandingEvent.OnDismissUnavailableScreen INSTANCE = new com.paypal.oslo.feature.revolvingcreditacquisition.ui.landing.viewmodel.AcquisitionLandingEvent.OnDismissUnavailableScreen();

        public final int hashCode() {
            return -875754091;
        }

        private OnDismissUnavailableScreen() {
            super("OnDismissUnavailableScreen", null);
        }

        public final java.lang.String toString() {
            return "OnDismissUnavailableScreen";
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.revolvingcreditacquisition.ui.landing.viewmodel.AcquisitionLandingEvent.OnDismissUnavailableScreen)) {
                return false;
            }
            return true;
        }
    }

    @kotlin.Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010$\n\u0002\b\t\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0007\b\u0086\b\u0018\u00002\u00020\u0001B%\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0014\b\u0002\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\b\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\b\u0010\tJ\u001c\u0010\n\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00020\u0004HÆ\u0003¢\u0006\u0004\b\n\u0010\u000bJ0\u0010\f\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\u0014\b\u0002\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00020\u0004HÆ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0011\u001a\u00020\u00102\b\u0010\u000f\u001a\u0004\u0018\u00010\u000eHÖ\u0003¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0014\u001a\u00020\u0013HÖ\u0001¢\u0006\u0004\b\u0014\u0010\u0015J\u0010\u0010\u0016\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0016\u0010\tR\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0017\u001a\u0004\b\u0018\u0010\tR&\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00020\u00048\u0017X\u0097\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0019\u001a\u0004\b\u001a\u0010\u000b"}, d2 = {"Lcom/paypal/oslo/feature/revolvingcreditacquisition/ui/landing/viewmodel/AcquisitionLandingEvent$OnDismissInvalidState;", "Lcom/paypal/oslo/feature/revolvingcreditacquisition/ui/landing/viewmodel/AcquisitionLandingEvent;", "", "reason", "", "logParams", "<init>", "(Ljava/lang/String;Ljava/util/Map;)V", "component1", "()Ljava/lang/String;", "component2", "()Ljava/util/Map;", "copy", "(Ljava/lang/String;Ljava/util/Map;)Lcom/paypal/oslo/feature/revolvingcreditacquisition/ui/landing/viewmodel/AcquisitionLandingEvent$OnDismissInvalidState;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "Ljava/lang/String;", "getReason", "Ljava/util/Map;", "getLogParams"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class OnDismissInvalidState extends com.paypal.oslo.feature.revolvingcreditacquisition.ui.landing.viewmodel.AcquisitionLandingEvent {
        public static final int $stable = 8;
        private final java.util.Map<java.lang.String, java.lang.String> logParams;
        private final java.lang.String reason;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OnDismissInvalidState(java.lang.String str, java.util.Map<java.lang.String, java.lang.String> map) {
            super("OnDismissInvalidState", null);
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(map, "");
            this.reason = str;
            this.logParams = map;
        }

        public final java.lang.String getReason() {
            return this.reason;
        }

        public /* synthetic */ OnDismissInvalidState(java.lang.String str, java.util.Map map, int i, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this(str, (i & 2) != 0 ? kotlin.collections.MapsKt.mapOf(kotlin.TuplesKt.to("reason", str)) : map);
        }

        @Override // com.paypal.oslo.feature.revolvingcreditacquisition.ui.landing.viewmodel.AcquisitionLandingEvent, com.paypal.oslo.feature.revolvingcreditacquisition.ui.common.logger.Loggable
        public final java.util.Map<java.lang.String, java.lang.String> getLogParams() {
            return this.logParams;
        }

        public final java.lang.String toString() {
            java.lang.String str = this.reason;
            java.util.Map<java.lang.String, java.lang.String> map = this.logParams;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("OnDismissInvalidState(reason=");
            sb.append(str);
            sb.append(", logParams=");
            sb.append(map);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            return (this.reason.hashCode() * 31) + this.logParams.hashCode();
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.revolvingcreditacquisition.ui.landing.viewmodel.AcquisitionLandingEvent.OnDismissInvalidState)) {
                return false;
            }
            com.paypal.oslo.feature.revolvingcreditacquisition.ui.landing.viewmodel.AcquisitionLandingEvent.OnDismissInvalidState onDismissInvalidState = (com.paypal.oslo.feature.revolvingcreditacquisition.ui.landing.viewmodel.AcquisitionLandingEvent.OnDismissInvalidState) other;
            return kotlin.jvm.internal.Intrinsics.areEqual(this.reason, onDismissInvalidState.reason) && kotlin.jvm.internal.Intrinsics.areEqual(this.logParams, onDismissInvalidState.logParams);
        }

        public final com.paypal.oslo.feature.revolvingcreditacquisition.ui.landing.viewmodel.AcquisitionLandingEvent.OnDismissInvalidState copy(java.lang.String reason, java.util.Map<java.lang.String, java.lang.String> logParams) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(reason, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(logParams, "");
            return new com.paypal.oslo.feature.revolvingcreditacquisition.ui.landing.viewmodel.AcquisitionLandingEvent.OnDismissInvalidState(reason, logParams);
        }

        public final java.util.Map<java.lang.String, java.lang.String> component2() {
            return this.logParams;
        }

        /* renamed from: component1, reason: from getter */
        public final java.lang.String getReason() {
            return this.reason;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ com.paypal.oslo.feature.revolvingcreditacquisition.ui.landing.viewmodel.AcquisitionLandingEvent.OnDismissInvalidState copy$default(com.paypal.oslo.feature.revolvingcreditacquisition.ui.landing.viewmodel.AcquisitionLandingEvent.OnDismissInvalidState onDismissInvalidState, java.lang.String str, java.util.Map map, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                str = onDismissInvalidState.reason;
            }
            if ((i & 2) != 0) {
                map = onDismissInvalidState.logParams;
            }
            return onDismissInvalidState.copy(str, map);
        }
    }

    public /* synthetic */ AcquisitionLandingEvent(java.lang.String str, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this(str);
    }
}
