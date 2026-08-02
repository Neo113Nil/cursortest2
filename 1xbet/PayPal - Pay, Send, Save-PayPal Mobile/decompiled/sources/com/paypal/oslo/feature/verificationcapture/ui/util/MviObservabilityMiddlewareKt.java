package com.paypal.oslo.feature.verificationcapture.ui.util;

@kotlin.Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\u001a5\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0006\"\b\b\u0000\u0010\u0001*\u00020\u0000\"\b\b\u0001\u0010\u0003*\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0007\u0010\b\u001a\u0017\u0010\u000b\u001a\u00020\u00042\u0006\u0010\n\u001a\u00020\tH\u0002¢\u0006\u0004\b\u000b\u0010\f\u001a\u0017\u0010\r\u001a\u00020\u00042\u0006\u0010\n\u001a\u00020\tH\u0002¢\u0006\u0004\b\r\u0010\f"}, d2 = {"Lcom/paypal/oslo/core/mvi/UiState;", "S", "Lcom/paypal/oslo/core/mvi/Event;", "E", "", "screenName", "Lcom/paypal/oslo/core/mvi/MviStateStore$Middleware;", "createObservabilityMiddleware", "(Ljava/lang/String;)Lcom/paypal/oslo/core/mvi/MviStateStore$Middleware;", "", "p0", "getHighSpeedVideoSizes", "(Ljava/lang/Object;)Ljava/lang/String;", "getHighSpeedVideoFpsRanges"}, k = 2, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes15.dex */
public final class MviObservabilityMiddlewareKt {
    public static final <S extends com.paypal.oslo.core.mvi.UiState, E extends com.paypal.oslo.core.mvi.Event> com.paypal.oslo.core.mvi.MviStateStore.Middleware<S, E> createObservabilityMiddleware(final java.lang.String str) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
        return (com.paypal.oslo.core.mvi.MviStateStore.Middleware) new com.paypal.oslo.core.mvi.MviStateStore.Middleware<S, E>() { // from class: com.paypal.oslo.feature.verificationcapture.ui.util.MviObservabilityMiddlewareKt$createObservabilityMiddleware$1
            @Override // com.paypal.oslo.core.mvi.MviStateStore.Middleware
            public final void invoke(com.paypal.oslo.core.mvi.MviStateStore.Middleware.Input<S, E> input) {
                java.lang.String highSpeedVideoSizes;
                java.lang.String highSpeedVideoFpsRanges;
                java.lang.String highSpeedVideoFpsRanges2;
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(input, "");
                com.paypal.android.logger.Logger logger = com.paypal.oslo.feature.verificationcapture.LoggerKt.log;
                java.lang.String str2 = str;
                java.lang.StringBuilder sb = new java.lang.StringBuilder();
                sb.append(str2);
                sb.append(" state transition");
                java.lang.String obj = sb.toString();
                highSpeedVideoSizes = com.paypal.oslo.feature.verificationcapture.ui.util.MviObservabilityMiddlewareKt.getHighSpeedVideoSizes(input.getEvent());
                kotlin.Pair pair = kotlin.TuplesKt.to("event", highSpeedVideoSizes);
                highSpeedVideoFpsRanges = com.paypal.oslo.feature.verificationcapture.ui.util.MviObservabilityMiddlewareKt.getHighSpeedVideoFpsRanges(input.getStates().getFirst());
                kotlin.Pair pair2 = kotlin.TuplesKt.to("from_state", highSpeedVideoFpsRanges);
                highSpeedVideoFpsRanges2 = com.paypal.oslo.feature.verificationcapture.ui.util.MviObservabilityMiddlewareKt.getHighSpeedVideoFpsRanges(input.getStates().getSecond());
                com.paypal.android.logger.Logger.d$default(logger, obj, kotlin.collections.MapsKt.mapOf(pair, pair2, kotlin.TuplesKt.to("to_state", highSpeedVideoFpsRanges2)), null, 4, null);
            }
        };
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final java.lang.String getHighSpeedVideoSizes(java.lang.Object obj) {
        try {
            java.lang.reflect.Field declaredField = obj.getClass().getDeclaredField("name");
            declaredField.setAccessible(true);
            java.lang.Object obj2 = declaredField.get(obj);
            java.lang.String str = obj2 instanceof java.lang.String ? (java.lang.String) obj2 : null;
            if (str != null) {
                return str;
            }
            java.lang.String simpleName = kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(obj.getClass()).getSimpleName();
            return simpleName == null ? "UnknownEvent" : simpleName;
        } catch (java.lang.Exception unused) {
            java.lang.String simpleName2 = kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(obj.getClass()).getSimpleName();
            return simpleName2 == null ? "UnknownEvent" : simpleName2;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final java.lang.String getHighSpeedVideoFpsRanges(java.lang.Object obj) {
        try {
            java.lang.reflect.Field declaredField = obj.getClass().getDeclaredField("name");
            declaredField.setAccessible(true);
            java.lang.Object obj2 = declaredField.get(obj);
            java.lang.String str = obj2 instanceof java.lang.String ? (java.lang.String) obj2 : null;
            if (str != null) {
                return str;
            }
            java.lang.String simpleName = kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(obj.getClass()).getSimpleName();
            return simpleName == null ? "UnknownState" : simpleName;
        } catch (java.lang.Exception unused) {
            java.lang.String simpleName2 = kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(obj.getClass()).getSimpleName();
            return simpleName2 == null ? "UnknownState" : simpleName2;
        }
    }
}
