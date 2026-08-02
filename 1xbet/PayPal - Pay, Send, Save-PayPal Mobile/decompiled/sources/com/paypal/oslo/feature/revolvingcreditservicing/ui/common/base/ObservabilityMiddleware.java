package com.paypal.oslo.feature.revolvingcreditservicing.ui.common.base;

@kotlin.Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\u0004\b \u0018\u0000 \u001d*\b\b\u0000\u0010\u0002*\u00020\u0001*\b\b\u0001\u0010\u0004*\u00020\u00032\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0005:\u0001\u001dB\u000f\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ!\u0010\r\u001a\u00020\f2\u0012\u0010\u000b\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\n¢\u0006\u0004\b\r\u0010\u000eJ\u001f\u0010\u0011\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\u00012\u0006\u0010\u0010\u001a\u00020\u0001H\u0016¢\u0006\u0004\b\u0011\u0010\u0012J\u0017\u0010\u0014\u001a\u00020\f2\u0006\u0010\u0013\u001a\u00020\u0003H\u0016¢\u0006\u0004\b\u0014\u0010\u0015R\u0017\u0010\u0007\u001a\u00020\u00068\u0007¢\u0006\f\n\u0004\b\u0007\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018R\u0014\u0010\u001c\u001a\u00020\u00198'X¦\u0004¢\u0006\u0006\u001a\u0004\b\u001a\u0010\u001b"}, d2 = {"Lcom/paypal/oslo/feature/revolvingcreditservicing/ui/common/base/ObservabilityMiddleware;", "Lcom/paypal/oslo/core/mvi/UiState;", "S", "Lcom/paypal/oslo/core/mvi/Event;", com.visa.cbp.getEncExpo.warmup, "Lcom/paypal/oslo/core/mvi/MviStateStore$Middleware;", "", "name", "<init>", "(Ljava/lang/String;)V", "Lcom/paypal/oslo/core/mvi/MviStateStore$Middleware$Input;", "input", "", "invoke", "(Lcom/paypal/oslo/core/mvi/MviStateStore$Middleware$Input;)V", "preState", "currentState", "trackByState", "(Lcom/paypal/oslo/core/mvi/UiState;Lcom/paypal/oslo/core/mvi/UiState;)V", "event", "trackByEvent", "(Lcom/paypal/oslo/core/mvi/Event;)V", "Ljava/lang/String;", "getName", "()Ljava/lang/String;", "Lcom/paypal/oslo/feature/revolvingcreditservicing/api/model/CreditProductIdentifier;", "getCpi", "()Lcom/paypal/oslo/feature/revolvingcreditservicing/api/model/CreditProductIdentifier;", com.paypal.oslo.feature.revolvingcreditservicing.ui.common.base.ObservabilityMiddleware.KEY_CPI, "Companion"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes14.dex */
public abstract class ObservabilityMiddleware<S extends com.paypal.oslo.core.mvi.UiState, I extends com.paypal.oslo.core.mvi.Event> implements com.paypal.oslo.core.mvi.MviStateStore.Middleware<S, I> {
    public static final int $stable = 0;
    protected static final com.paypal.oslo.feature.revolvingcreditservicing.ui.common.base.ObservabilityMiddleware.Companion Companion = new com.paypal.oslo.feature.revolvingcreditservicing.ui.common.base.ObservabilityMiddleware.Companion(null);
    public static final java.lang.String EVENT_DISPATCHED = "Event dispatched";
    public static final java.lang.String KEY_CPI = "cpi";
    public static final java.lang.String KEY_CURRENT_STATE = "currentState";
    public static final java.lang.String KEY_EVENT = "event";
    public static final java.lang.String KEY_MIDDLEWARE = "middleware";
    public static final java.lang.String KEY_PRE_STATE = "preState";
    public static final java.lang.String STATE_TRANSITION = "State transition";
    private final java.lang.String name;

    public abstract com.paypal.oslo.feature.revolvingcreditservicing.api.model.CreditProductIdentifier getCpi();

    public ObservabilityMiddleware(java.lang.String str) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
        this.name = str;
    }

    public final java.lang.String getName() {
        return this.name;
    }

    @kotlin.Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\b\b\u0084\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0007\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0007\u0010\u0006R\u0014\u0010\b\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\b\u0010\u0006R\u0014\u0010\t\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\t\u0010\u0006R\u0014\u0010\n\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\n\u0010\u0006R\u0014\u0010\u000b\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u000b\u0010\u0006R\u0014\u0010\f\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\f\u0010\u0006"}, d2 = {"Lcom/paypal/oslo/feature/revolvingcreditservicing/ui/common/base/ObservabilityMiddleware$Companion;", "", "<init>", "()V", "", "STATE_TRANSITION", "Ljava/lang/String;", "EVENT_DISPATCHED", "KEY_MIDDLEWARE", "KEY_CPI", "KEY_PRE_STATE", "KEY_CURRENT_STATE", "KEY_EVENT"}, k = 1, mv = {2, 3, 0}, xi = 48)
    protected static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    @Override // com.paypal.oslo.core.mvi.MviStateStore.Middleware
    public final void invoke(com.paypal.oslo.core.mvi.MviStateStore.Middleware.Input<S, I> input) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(input, "");
        kotlinx.coroutines.BuildersKt__Builders_commonKt.launch$default(input.getScope(), null, null, new com.paypal.oslo.feature.revolvingcreditservicing.ui.common.base.ObservabilityMiddleware$invoke$1(input, this, null), 3, null);
    }

    public void trackByState(com.paypal.oslo.core.mvi.UiState preState, com.paypal.oslo.core.mvi.UiState currentState) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(preState, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(currentState, "");
        if (currentState instanceof com.paypal.oslo.feature.revolvingcreditservicing.ui.common.base.Loggable) {
            java.util.Map mapOf = kotlin.collections.MapsKt.mapOf(kotlin.TuplesKt.to("middleware", this.name), kotlin.TuplesKt.to(KEY_CPI, getCpi().name()), kotlin.TuplesKt.to("preState", preState.getName()), kotlin.TuplesKt.to("currentState", currentState.getName()));
            java.util.Map<java.lang.String, java.lang.String> logParams = ((com.paypal.oslo.feature.revolvingcreditservicing.ui.common.base.Loggable) currentState).getLogParams();
            if (logParams == null) {
                logParams = kotlin.collections.MapsKt.emptyMap();
            }
            com.paypal.android.logger.Logger.i$default(com.paypal.oslo.feature.revolvingcreditservicing.LoggerKt.log, "State transition", kotlin.collections.MapsKt.plus(mapOf, logParams), null, 4, null);
        }
    }

    public void trackByEvent(com.paypal.oslo.core.mvi.Event event) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(event, "");
        if (event instanceof com.paypal.oslo.feature.revolvingcreditservicing.ui.common.base.Loggable) {
            java.util.Map mapOf = kotlin.collections.MapsKt.mapOf(kotlin.TuplesKt.to("middleware", this.name), kotlin.TuplesKt.to(KEY_CPI, getCpi().name()), kotlin.TuplesKt.to("event", event.getName()));
            java.util.Map<java.lang.String, java.lang.String> logParams = ((com.paypal.oslo.feature.revolvingcreditservicing.ui.common.base.Loggable) event).getLogParams();
            if (logParams == null) {
                logParams = kotlin.collections.MapsKt.emptyMap();
            }
            com.paypal.android.logger.Logger.i$default(com.paypal.oslo.feature.revolvingcreditservicing.LoggerKt.log, "Event dispatched", kotlin.collections.MapsKt.plus(mapOf, logParams), null, 4, null);
        }
    }
}
