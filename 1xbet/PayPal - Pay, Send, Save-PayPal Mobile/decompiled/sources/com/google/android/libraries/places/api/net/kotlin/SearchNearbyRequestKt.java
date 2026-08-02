package com.google.android.libraries.places.api.net.kotlin;

@kotlin.Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a@\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0001\u001a\u00020\u00002\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022\u001b\b\u0002\u0010\t\u001a\u0015\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0005¢\u0006\u0002\b\b¢\u0006\u0004\b\u000b\u0010\f"}, d2 = {"Lcom/google/android/libraries/places/api/model/LocationRestriction;", "locationRestriction", "", "Lcom/google/android/libraries/places/api/model/Place$Field;", "placeFields", "Lkotlin/Function1;", "Lcom/google/android/libraries/places/api/net/SearchNearbyRequest$Builder;", "", "Lkotlin/ExtensionFunctionType;", com.datadog.android.rum.internal.metric.SessionEndedMetric.NO_VIEW_EVENTS_COUNT_ACTIONS_KEY, "Lcom/google/android/libraries/places/api/net/SearchNearbyRequest;", "searchNearbyRequest", "(Lcom/google/android/libraries/places/api/model/LocationRestriction;Ljava/util/List;Lkotlin/jvm/functions/Function1;)Lcom/google/android/libraries/places/api/net/SearchNearbyRequest;"}, k = 2, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes8.dex */
public final class SearchNearbyRequestKt {
    public static final com.google.android.libraries.places.api.net.SearchNearbyRequest searchNearbyRequest(com.google.android.libraries.places.api.model.LocationRestriction locationRestriction, java.util.List<? extends com.google.android.libraries.places.api.model.Place.Field> list, kotlin.jvm.functions.Function1<? super com.google.android.libraries.places.api.net.SearchNearbyRequest.Builder, kotlin.Unit> function1) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(locationRestriction, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(list, "");
        com.google.android.libraries.places.api.net.SearchNearbyRequest.Builder builder = com.google.android.libraries.places.api.net.SearchNearbyRequest.builder(locationRestriction, list);
        if (function1 != null) {
            function1.invoke(builder);
        }
        com.google.android.libraries.places.api.net.SearchNearbyRequest build = builder.build();
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(build, "");
        return build;
    }

    public static /* synthetic */ com.google.android.libraries.places.api.net.SearchNearbyRequest searchNearbyRequest$default(com.google.android.libraries.places.api.model.LocationRestriction locationRestriction, java.util.List list, kotlin.jvm.functions.Function1 function1, int i, java.lang.Object obj) {
        if ((i & 4) != 0) {
            function1 = null;
        }
        return searchNearbyRequest(locationRestriction, list, function1);
    }
}
