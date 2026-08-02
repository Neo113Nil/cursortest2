package com.google.android.libraries.places.api.model.kotlin;

@kotlin.Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a\u0015\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lcom/google/android/libraries/places/api/model/Polyline;", "polyline", "Lcom/google/android/libraries/places/api/model/SearchAlongRouteParameters;", "searchAlongRouteParameters", "(Lcom/google/android/libraries/places/api/model/Polyline;)Lcom/google/android/libraries/places/api/model/SearchAlongRouteParameters;"}, k = 2, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes8.dex */
public final class SearchAlongRouteParametersKt {
    public static final com.google.android.libraries.places.api.model.SearchAlongRouteParameters searchAlongRouteParameters(com.google.android.libraries.places.api.model.Polyline polyline) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(polyline, "");
        com.google.android.libraries.places.api.model.SearchAlongRouteParameters newInstance = com.google.android.libraries.places.api.model.SearchAlongRouteParameters.newInstance(polyline);
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(newInstance, "");
        return newInstance;
    }
}
