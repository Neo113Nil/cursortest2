package com.google.android.libraries.places.api.model.kotlin;

@kotlin.Metadata(d1 = {"\u0000\u0018\n\u0002\u0010\b\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a#\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0001\u001a\u00020\u00002\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"", "connectorCount", "", "Lcom/google/android/libraries/places/api/model/ConnectorAggregation;", "connectorAggregations", "Lcom/google/android/libraries/places/api/model/EVChargeOptions;", "evChargeOptions", "(ILjava/util/List;)Lcom/google/android/libraries/places/api/model/EVChargeOptions;"}, k = 2, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes8.dex */
public final class EVChargeOptionsKt {
    public static final com.google.android.libraries.places.api.model.EVChargeOptions evChargeOptions(int i, java.util.List<? extends com.google.android.libraries.places.api.model.ConnectorAggregation> list) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(list, "");
        com.google.android.libraries.places.api.model.EVChargeOptions newInstance = com.google.android.libraries.places.api.model.EVChargeOptions.newInstance(java.lang.Integer.valueOf(i), list);
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(newInstance, "");
        return newInstance;
    }
}
