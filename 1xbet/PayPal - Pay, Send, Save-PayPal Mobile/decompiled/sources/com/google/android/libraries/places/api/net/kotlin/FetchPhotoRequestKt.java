package com.google.android.libraries.places.api.net.kotlin;

@kotlin.Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a4\u0010\b\u001a\u00020\u00072\u0006\u0010\u0001\u001a\u00020\u00002\u001b\b\u0002\u0010\u0006\u001a\u0015\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0002¢\u0006\u0002\b\u0005H\u0007¢\u0006\u0004\b\b\u0010\t"}, d2 = {"Lcom/google/android/libraries/places/api/model/PhotoMetadata;", "photoMetadata", "Lkotlin/Function1;", "Lcom/google/android/libraries/places/api/net/FetchPhotoRequest$Builder;", "", "Lkotlin/ExtensionFunctionType;", com.datadog.android.rum.internal.metric.SessionEndedMetric.NO_VIEW_EVENTS_COUNT_ACTIONS_KEY, "Lcom/google/android/libraries/places/api/net/FetchPhotoRequest;", "fetchPhotoRequest", "(Lcom/google/android/libraries/places/api/model/PhotoMetadata;Lkotlin/jvm/functions/Function1;)Lcom/google/android/libraries/places/api/net/FetchPhotoRequest;"}, k = 2, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes.dex */
public final class FetchPhotoRequestKt {
    @kotlin.Deprecated(message = "Replaced with new API.", replaceWith = @kotlin.ReplaceWith(expression = "fetchResolvedPhotoUriRequest", imports = {"com.google.android.libraries.places.api.net.kotlin.fetchResolvedPhotoUriRequest", "com.google.android.libraries.places.api.net.kotlin.awaitFetchResolvedPhotoUri"}))
    public static final com.google.android.libraries.places.api.net.FetchPhotoRequest fetchPhotoRequest(com.google.android.libraries.places.api.model.PhotoMetadata photoMetadata, kotlin.jvm.functions.Function1<? super com.google.android.libraries.places.api.net.FetchPhotoRequest.Builder, kotlin.Unit> function1) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(photoMetadata, "");
        com.google.android.libraries.places.api.net.FetchPhotoRequest.Builder builder = com.google.android.libraries.places.api.net.FetchPhotoRequest.builder(photoMetadata);
        if (function1 != null) {
            function1.invoke(builder);
        }
        com.google.android.libraries.places.api.net.FetchPhotoRequest build = builder.build();
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(build, "");
        return build;
    }

    public static /* synthetic */ com.google.android.libraries.places.api.net.FetchPhotoRequest fetchPhotoRequest$default(com.google.android.libraries.places.api.model.PhotoMetadata photoMetadata, kotlin.jvm.functions.Function1 function1, int i, java.lang.Object obj) {
        if ((i & 2) != 0) {
            function1 = null;
        }
        return fetchPhotoRequest(photoMetadata, function1);
    }
}
