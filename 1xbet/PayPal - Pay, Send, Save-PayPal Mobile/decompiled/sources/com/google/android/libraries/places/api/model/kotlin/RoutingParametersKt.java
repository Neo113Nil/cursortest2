package com.google.android.libraries.places.api.model.kotlin;

@kotlin.Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a*\u0010\u0006\u001a\u00020\u00052\u001b\b\u0002\u0010\u0004\u001a\u0015\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u0000¢\u0006\u0002\b\u0003¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"Lkotlin/Function1;", "Lcom/google/android/libraries/places/api/model/RoutingParameters$Builder;", "", "Lkotlin/ExtensionFunctionType;", com.datadog.android.rum.internal.metric.SessionEndedMetric.NO_VIEW_EVENTS_COUNT_ACTIONS_KEY, "Lcom/google/android/libraries/places/api/model/RoutingParameters;", "routingParameters", "(Lkotlin/jvm/functions/Function1;)Lcom/google/android/libraries/places/api/model/RoutingParameters;"}, k = 2, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes8.dex */
public final class RoutingParametersKt {
    public static final com.google.android.libraries.places.api.model.RoutingParameters routingParameters(kotlin.jvm.functions.Function1<? super com.google.android.libraries.places.api.model.RoutingParameters.Builder, kotlin.Unit> function1) {
        com.google.android.libraries.places.api.model.RoutingParameters.Builder builder = com.google.android.libraries.places.api.model.RoutingParameters.builder();
        if (function1 != null) {
            function1.invoke(builder);
        }
        com.google.android.libraries.places.api.model.RoutingParameters build = builder.build();
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(build, "");
        return build;
    }

    public static /* synthetic */ com.google.android.libraries.places.api.model.RoutingParameters routingParameters$default(kotlin.jvm.functions.Function1 function1, int i, java.lang.Object obj) {
        if (1 == (i & 1)) {
            function1 = null;
        }
        return routingParameters(function1);
    }
}
