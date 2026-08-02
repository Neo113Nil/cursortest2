package com.google.android.libraries.places.api.net.kotlin;

@kotlin.Metadata(d1 = {"\u0000$\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a:\u0010\t\u001a\u00020\b2\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u00002\u001b\b\u0002\u0010\u0007\u001a\u0015\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0003¢\u0006\u0002\b\u0006H\u0007¢\u0006\u0004\b\t\u0010\n"}, d2 = {"", "Lcom/google/android/libraries/places/api/model/Place$Field;", "placeFields", "Lkotlin/Function1;", "Lcom/google/android/libraries/places/api/net/FindCurrentPlaceRequest$Builder;", "", "Lkotlin/ExtensionFunctionType;", com.datadog.android.rum.internal.metric.SessionEndedMetric.NO_VIEW_EVENTS_COUNT_ACTIONS_KEY, "Lcom/google/android/libraries/places/api/net/FindCurrentPlaceRequest;", "findCurrentPlaceRequest", "(Ljava/util/List;Lkotlin/jvm/functions/Function1;)Lcom/google/android/libraries/places/api/net/FindCurrentPlaceRequest;"}, k = 2, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes.dex */
public final class FindCurrentPlaceRequestKt {
    @kotlin.Deprecated(message = "Replaced with new API.", replaceWith = @kotlin.ReplaceWith(expression = "searchNearbyRequest", imports = {"com.google.android.libraries.places.api.net.kotlin.searchNearbyRequest", "com.google.android.libraries.places.api.net.kotlin.awaitSearchNearby"}))
    public static final com.google.android.libraries.places.api.net.FindCurrentPlaceRequest findCurrentPlaceRequest(java.util.List<? extends com.google.android.libraries.places.api.model.Place.Field> list, kotlin.jvm.functions.Function1<? super com.google.android.libraries.places.api.net.FindCurrentPlaceRequest.Builder, kotlin.Unit> function1) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(list, "");
        com.google.android.libraries.places.api.net.FindCurrentPlaceRequest.Builder builder = com.google.android.libraries.places.api.net.FindCurrentPlaceRequest.builder(list);
        if (function1 != null) {
            function1.invoke(builder);
        }
        com.google.android.libraries.places.api.net.FindCurrentPlaceRequest build = builder.build();
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(build, "");
        return build;
    }

    public static /* synthetic */ com.google.android.libraries.places.api.net.FindCurrentPlaceRequest findCurrentPlaceRequest$default(java.util.List list, kotlin.jvm.functions.Function1 function1, int i, java.lang.Object obj) {
        if ((i & 2) != 0) {
            function1 = null;
        }
        return findCurrentPlaceRequest(list, function1);
    }
}
