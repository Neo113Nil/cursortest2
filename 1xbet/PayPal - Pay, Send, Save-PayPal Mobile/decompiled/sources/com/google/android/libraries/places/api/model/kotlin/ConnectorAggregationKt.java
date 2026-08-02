package com.google.android.libraries.places.api.model.kotlin;

@kotlin.Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0006\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u001aB\u0010\f\u001a\u00020\u000b2\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u001b\b\u0002\u0010\n\u001a\u0015\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\b\u0018\u00010\u0006¢\u0006\u0002\b\t¢\u0006\u0004\b\f\u0010\r"}, d2 = {"Lcom/google/android/libraries/places/api/model/EVConnectorType;", "type", "", "maxChargeRateKw", "", com.datadog.android.rum.internal.metric.slowframes.DefaultUISlownessMetricDispatcher.KEY_COUNT, "Lkotlin/Function1;", "Lcom/google/android/libraries/places/api/model/ConnectorAggregation$Builder;", "", "Lkotlin/ExtensionFunctionType;", com.datadog.android.rum.internal.metric.SessionEndedMetric.NO_VIEW_EVENTS_COUNT_ACTIONS_KEY, "Lcom/google/android/libraries/places/api/model/ConnectorAggregation;", "connectorAggregation", "(Lcom/google/android/libraries/places/api/model/EVConnectorType;DILkotlin/jvm/functions/Function1;)Lcom/google/android/libraries/places/api/model/ConnectorAggregation;"}, k = 2, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes8.dex */
public final class ConnectorAggregationKt {
    public static final com.google.android.libraries.places.api.model.ConnectorAggregation connectorAggregation(com.google.android.libraries.places.api.model.EVConnectorType eVConnectorType, double d, int i, kotlin.jvm.functions.Function1<? super com.google.android.libraries.places.api.model.ConnectorAggregation.Builder, kotlin.Unit> function1) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(eVConnectorType, "");
        com.google.android.libraries.places.api.model.ConnectorAggregation.Builder builder = com.google.android.libraries.places.api.model.ConnectorAggregation.builder(eVConnectorType, java.lang.Double.valueOf(d), java.lang.Integer.valueOf(i));
        if (function1 != null) {
            function1.invoke(builder);
        }
        com.google.android.libraries.places.api.model.ConnectorAggregation build = builder.build();
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(build, "");
        return build;
    }

    public static /* synthetic */ com.google.android.libraries.places.api.model.ConnectorAggregation connectorAggregation$default(com.google.android.libraries.places.api.model.EVConnectorType eVConnectorType, double d, int i, kotlin.jvm.functions.Function1 function1, int i2, java.lang.Object obj) {
        if ((i2 & 8) != 0) {
            function1 = null;
        }
        return connectorAggregation(eVConnectorType, d, i, function1);
    }
}
