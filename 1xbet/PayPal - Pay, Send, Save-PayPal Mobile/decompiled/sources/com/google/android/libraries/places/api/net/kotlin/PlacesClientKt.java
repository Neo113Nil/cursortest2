package com.google.android.libraries.places.api.net.kotlin;

@kotlin.Metadata(d1 = {"\u0000\u0090\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a-\u0010\u0007\u001a\u00020\u0006*\u00020\u00002\u0017\u0010\u0005\u001a\u0013\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001¢\u0006\u0002\b\u0004H\u0086@¢\u0006\u0004\b\u0007\u0010\b\u001a7\u0010\r\u001a\u00020\f*\u00020\u00002\u0006\u0010\n\u001a\u00020\t2\u0019\b\u0002\u0010\u0005\u001a\u0013\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\u00030\u0001¢\u0006\u0002\b\u0004H\u0087@¢\u0006\u0004\b\r\u0010\u000e\u001a7\u0010\u0011\u001a\u00020\u0010*\u00020\u00002\u0006\u0010\n\u001a\u00020\t2\u0019\b\u0002\u0010\u0005\u001a\u0013\u0012\u0004\u0012\u00020\u000f\u0012\u0004\u0012\u00020\u00030\u0001¢\u0006\u0002\b\u0004H\u0086@¢\u0006\u0004\b\u0011\u0010\u000e\u001aE\u0010\u0019\u001a\u00020\u0018*\u00020\u00002\u0006\u0010\u0013\u001a\u00020\u00122\f\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00150\u00142\u0019\b\u0002\u0010\u0005\u001a\u0013\u0012\u0004\u0012\u00020\u0017\u0012\u0004\u0012\u00020\u00030\u0001¢\u0006\u0002\b\u0004H\u0086@¢\u0006\u0004\b\u0019\u0010\u001a\u001a\"\u0010\u001c\u001a\u00020\u001b*\u00020\u00002\f\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00150\u0014H\u0087@¢\u0006\u0004\b\u001c\u0010\u001d\u001a(\u0010!\u001a\u00020 *\u00020\u00002\u0006\u0010\u0013\u001a\u00020\u00122\n\b\u0002\u0010\u001f\u001a\u0004\u0018\u00010\u001eH\u0086@¢\u0006\u0004\b!\u0010\"\u001a(\u0010!\u001a\u00020 *\u00020\u00002\u0006\u0010$\u001a\u00020#2\n\b\u0002\u0010\u001f\u001a\u0004\u0018\u00010\u001eH\u0086@¢\u0006\u0004\b!\u0010%\u001aE\u0010)\u001a\u00020(*\u00020\u00002\u0006\u0010&\u001a\u00020\u00122\f\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00150\u00142\u0019\b\u0002\u0010\u0005\u001a\u0013\u0012\u0004\u0012\u00020'\u0012\u0004\u0012\u00020\u00030\u0001¢\u0006\u0002\b\u0004H\u0086@¢\u0006\u0004\b)\u0010\u001a\u001aE\u0010.\u001a\u00020-*\u00020\u00002\u0006\u0010+\u001a\u00020*2\f\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00150\u00142\u0019\b\u0002\u0010\u0005\u001a\u0013\u0012\u0004\u0012\u00020,\u0012\u0004\u0012\u00020\u00030\u0001¢\u0006\u0002\b\u0004H\u0086@¢\u0006\u0004\b.\u0010/"}, d2 = {"Lcom/google/android/libraries/places/api/net/PlacesClient;", "Lkotlin/Function1;", "Lcom/google/android/libraries/places/api/net/FindAutocompletePredictionsRequest$Builder;", "", "Lkotlin/ExtensionFunctionType;", com.datadog.android.rum.internal.metric.SessionEndedMetric.NO_VIEW_EVENTS_COUNT_ACTIONS_KEY, "Lcom/google/android/libraries/places/api/net/FindAutocompletePredictionsResponse;", "awaitFindAutocompletePredictions", "(Lcom/google/android/libraries/places/api/net/PlacesClient;Lkotlin/jvm/functions/Function1;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lcom/google/android/libraries/places/api/model/PhotoMetadata;", "photoMetadata", "Lcom/google/android/libraries/places/api/net/FetchPhotoRequest$Builder;", "Lcom/google/android/libraries/places/api/net/FetchPhotoResponse;", "awaitFetchPhoto", "(Lcom/google/android/libraries/places/api/net/PlacesClient;Lcom/google/android/libraries/places/api/model/PhotoMetadata;Lkotlin/jvm/functions/Function1;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lcom/google/android/libraries/places/api/net/FetchResolvedPhotoUriRequest$Builder;", "Lcom/google/android/libraries/places/api/net/FetchResolvedPhotoUriResponse;", "awaitFetchResolvedPhotoUri", "", "placeId", "", "Lcom/google/android/libraries/places/api/model/Place$Field;", "placeFields", "Lcom/google/android/libraries/places/api/net/FetchPlaceRequest$Builder;", "Lcom/google/android/libraries/places/api/net/FetchPlaceResponse;", "awaitFetchPlace", "(Lcom/google/android/libraries/places/api/net/PlacesClient;Ljava/lang/String;Ljava/util/List;Lkotlin/jvm/functions/Function1;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lcom/google/android/libraries/places/api/net/FindCurrentPlaceResponse;", "awaitFindCurrentPlace", "(Lcom/google/android/libraries/places/api/net/PlacesClient;Ljava/util/List;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "", "utcTimeMillis", "Lcom/google/android/libraries/places/api/net/IsOpenResponse;", "awaitIsOpen", "(Lcom/google/android/libraries/places/api/net/PlacesClient;Ljava/lang/String;Ljava/lang/Long;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lcom/google/android/libraries/places/api/model/Place;", "place", "(Lcom/google/android/libraries/places/api/net/PlacesClient;Lcom/google/android/libraries/places/api/model/Place;Ljava/lang/Long;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "textQuery", "Lcom/google/android/libraries/places/api/net/SearchByTextRequest$Builder;", "Lcom/google/android/libraries/places/api/net/SearchByTextResponse;", "awaitSearchByText", "Lcom/google/android/libraries/places/api/model/LocationRestriction;", "locationRestriction", "Lcom/google/android/libraries/places/api/net/SearchNearbyRequest$Builder;", "Lcom/google/android/libraries/places/api/net/SearchNearbyResponse;", "awaitSearchNearby", "(Lcom/google/android/libraries/places/api/net/PlacesClient;Lcom/google/android/libraries/places/api/model/LocationRestriction;Ljava/util/List;Lkotlin/jvm/functions/Function1;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;"}, k = 2, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes.dex */
public final class PlacesClientKt {
    /* JADX WARN: Removed duplicated region for block: B:15:0x0033  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0025  */
    @kotlin.Deprecated(message = "Replaced with new API.", replaceWith = @kotlin.ReplaceWith(expression = "awaitFetchResolvedPhotoUri", imports = {"com.google.android.libraries.places.api.net.kotlin.awaitFetchResolvedPhotoUri"}))
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final java.lang.Object awaitFetchPhoto(com.google.android.libraries.places.api.net.PlacesClient placesClient, com.google.android.libraries.places.api.model.PhotoMetadata photoMetadata, kotlin.jvm.functions.Function1<? super com.google.android.libraries.places.api.net.FetchPhotoRequest.Builder, kotlin.Unit> function1, kotlin.coroutines.Continuation<? super com.google.android.libraries.places.api.net.FetchPhotoResponse> continuation) throws com.google.android.gms.common.api.ApiException {
        com.google.android.libraries.places.api.net.kotlin.zzi zziVar;
        int i;
        if (continuation instanceof com.google.android.libraries.places.api.net.kotlin.zzi) {
            zziVar = (com.google.android.libraries.places.api.net.kotlin.zzi) continuation;
            int i2 = zziVar.zzb;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                zziVar.zzb = i2 - 2147483648;
                java.lang.Object obj = zziVar.zza;
                java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = zziVar.zzb;
                if (i != 0) {
                    kotlin.ResultKt.throwOnFailure(obj);
                    com.google.android.gms.tasks.CancellationTokenSource cancellationTokenSource = new com.google.android.gms.tasks.CancellationTokenSource();
                    com.google.android.libraries.places.api.net.FetchPhotoRequest.Builder builder = com.google.android.libraries.places.api.net.FetchPhotoRequest.builder(photoMetadata);
                    builder.setCancellationToken(cancellationTokenSource.getToken());
                    function1.invoke(builder);
                    com.google.android.gms.tasks.Task zzb = placesClient.zzb(builder.build(), com.google.android.libraries.places.internal.zzmy.PROGRAMMATIC_KOTLIN_API);
                    kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(zzb, "");
                    zziVar.zzb = 1;
                    obj = kotlinx.coroutines.tasks.TasksKt.await(zzb, cancellationTokenSource, zziVar);
                    if (obj == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                } else {
                    if (i != 1) {
                        throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    kotlin.ResultKt.throwOnFailure(obj);
                }
                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(obj, "");
                return obj;
            }
        }
        zziVar = new com.google.android.libraries.places.api.net.kotlin.zzi(continuation);
        java.lang.Object obj2 = zziVar.zza;
        java.lang.Object coroutine_suspended2 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = zziVar.zzb;
        if (i != 0) {
        }
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(obj2, "");
        return obj2;
    }

    public static /* synthetic */ java.lang.Object awaitFetchPhoto$default(com.google.android.libraries.places.api.net.PlacesClient placesClient, com.google.android.libraries.places.api.model.PhotoMetadata photoMetadata, kotlin.jvm.functions.Function1 function1, kotlin.coroutines.Continuation continuation, int i, java.lang.Object obj) throws com.google.android.gms.common.api.ApiException {
        if ((i & 2) != 0) {
            function1 = com.google.android.libraries.places.api.net.kotlin.zzh.zza;
        }
        return awaitFetchPhoto(placesClient, photoMetadata, function1, continuation);
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0033  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0025  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final java.lang.Object awaitFetchPlace(com.google.android.libraries.places.api.net.PlacesClient placesClient, java.lang.String str, java.util.List<? extends com.google.android.libraries.places.api.model.Place.Field> list, kotlin.jvm.functions.Function1<? super com.google.android.libraries.places.api.net.FetchPlaceRequest.Builder, kotlin.Unit> function1, kotlin.coroutines.Continuation<? super com.google.android.libraries.places.api.net.FetchPlaceResponse> continuation) throws com.google.android.gms.common.api.ApiException {
        com.google.android.libraries.places.api.net.kotlin.zzj zzjVar;
        int i;
        if (continuation instanceof com.google.android.libraries.places.api.net.kotlin.zzj) {
            zzjVar = (com.google.android.libraries.places.api.net.kotlin.zzj) continuation;
            int i2 = zzjVar.zzb;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                zzjVar.zzb = i2 - 2147483648;
                java.lang.Object obj = zzjVar.zza;
                java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = zzjVar.zzb;
                if (i != 0) {
                    kotlin.ResultKt.throwOnFailure(obj);
                    com.google.android.gms.tasks.CancellationTokenSource cancellationTokenSource = new com.google.android.gms.tasks.CancellationTokenSource();
                    com.google.android.libraries.places.api.net.FetchPlaceRequest.Builder builder = com.google.android.libraries.places.api.net.FetchPlaceRequest.builder(str, list);
                    builder.setCancellationToken(cancellationTokenSource.getToken());
                    function1.invoke(builder);
                    com.google.android.gms.tasks.Task zzd = placesClient.zzd(builder.build(), com.google.android.libraries.places.internal.zzmy.PROGRAMMATIC_KOTLIN_API);
                    kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(zzd, "");
                    zzjVar.zzb = 1;
                    obj = kotlinx.coroutines.tasks.TasksKt.await(zzd, cancellationTokenSource, zzjVar);
                    if (obj == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                } else {
                    if (i != 1) {
                        throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    kotlin.ResultKt.throwOnFailure(obj);
                }
                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(obj, "");
                return obj;
            }
        }
        zzjVar = new com.google.android.libraries.places.api.net.kotlin.zzj(continuation);
        java.lang.Object obj2 = zzjVar.zza;
        java.lang.Object coroutine_suspended2 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = zzjVar.zzb;
        if (i != 0) {
        }
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(obj2, "");
        return obj2;
    }

    public static /* synthetic */ java.lang.Object awaitFetchPlace$default(com.google.android.libraries.places.api.net.PlacesClient placesClient, java.lang.String str, java.util.List list, kotlin.jvm.functions.Function1 function1, kotlin.coroutines.Continuation continuation, int i, java.lang.Object obj) throws com.google.android.gms.common.api.ApiException {
        if ((i & 4) != 0) {
            function1 = com.google.android.libraries.places.api.net.kotlin.zzb.zza;
        }
        return awaitFetchPlace(placesClient, str, list, function1, continuation);
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0033  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0025  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final java.lang.Object awaitFetchResolvedPhotoUri(com.google.android.libraries.places.api.net.PlacesClient placesClient, com.google.android.libraries.places.api.model.PhotoMetadata photoMetadata, kotlin.jvm.functions.Function1<? super com.google.android.libraries.places.api.net.FetchResolvedPhotoUriRequest.Builder, kotlin.Unit> function1, kotlin.coroutines.Continuation<? super com.google.android.libraries.places.api.net.FetchResolvedPhotoUriResponse> continuation) throws com.google.android.gms.common.api.ApiException {
        com.google.android.libraries.places.api.net.kotlin.zzk zzkVar;
        int i;
        if (continuation instanceof com.google.android.libraries.places.api.net.kotlin.zzk) {
            zzkVar = (com.google.android.libraries.places.api.net.kotlin.zzk) continuation;
            int i2 = zzkVar.zzb;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                zzkVar.zzb = i2 - 2147483648;
                java.lang.Object obj = zzkVar.zza;
                java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = zzkVar.zzb;
                if (i != 0) {
                    kotlin.ResultKt.throwOnFailure(obj);
                    com.google.android.gms.tasks.CancellationTokenSource cancellationTokenSource = new com.google.android.gms.tasks.CancellationTokenSource();
                    com.google.android.libraries.places.api.net.FetchResolvedPhotoUriRequest.Builder builder = com.google.android.libraries.places.api.net.FetchResolvedPhotoUriRequest.builder(photoMetadata);
                    builder.setCancellationToken(cancellationTokenSource.getToken());
                    function1.invoke(builder);
                    com.google.android.gms.tasks.Task zzc = placesClient.zzc(builder.build(), com.google.android.libraries.places.internal.zzmy.PROGRAMMATIC_KOTLIN_API);
                    kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(zzc, "");
                    zzkVar.zzb = 1;
                    obj = kotlinx.coroutines.tasks.TasksKt.await(zzc, cancellationTokenSource, zzkVar);
                    if (obj == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                } else {
                    if (i != 1) {
                        throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    kotlin.ResultKt.throwOnFailure(obj);
                }
                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(obj, "");
                return obj;
            }
        }
        zzkVar = new com.google.android.libraries.places.api.net.kotlin.zzk(continuation);
        java.lang.Object obj2 = zzkVar.zza;
        java.lang.Object coroutine_suspended2 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = zzkVar.zzb;
        if (i != 0) {
        }
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(obj2, "");
        return obj2;
    }

    public static /* synthetic */ java.lang.Object awaitFetchResolvedPhotoUri$default(com.google.android.libraries.places.api.net.PlacesClient placesClient, com.google.android.libraries.places.api.model.PhotoMetadata photoMetadata, kotlin.jvm.functions.Function1 function1, kotlin.coroutines.Continuation continuation, int i, java.lang.Object obj) throws com.google.android.gms.common.api.ApiException {
        if ((i & 2) != 0) {
            function1 = com.google.android.libraries.places.api.net.kotlin.zza.zza;
        }
        return awaitFetchResolvedPhotoUri(placesClient, photoMetadata, function1, continuation);
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0033  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0025  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final java.lang.Object awaitFindAutocompletePredictions(com.google.android.libraries.places.api.net.PlacesClient placesClient, kotlin.jvm.functions.Function1<? super com.google.android.libraries.places.api.net.FindAutocompletePredictionsRequest.Builder, kotlin.Unit> function1, kotlin.coroutines.Continuation<? super com.google.android.libraries.places.api.net.FindAutocompletePredictionsResponse> continuation) throws com.google.android.gms.common.api.ApiException {
        com.google.android.libraries.places.api.net.kotlin.zzl zzlVar;
        int i;
        if (continuation instanceof com.google.android.libraries.places.api.net.kotlin.zzl) {
            zzlVar = (com.google.android.libraries.places.api.net.kotlin.zzl) continuation;
            int i2 = zzlVar.zzb;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                zzlVar.zzb = i2 - 2147483648;
                java.lang.Object obj = zzlVar.zza;
                java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = zzlVar.zzb;
                if (i != 0) {
                    kotlin.ResultKt.throwOnFailure(obj);
                    com.google.android.gms.tasks.CancellationTokenSource cancellationTokenSource = new com.google.android.gms.tasks.CancellationTokenSource();
                    com.google.android.libraries.places.api.net.FindAutocompletePredictionsRequest.Builder builder = com.google.android.libraries.places.api.net.FindAutocompletePredictionsRequest.builder();
                    builder.setCancellationToken(cancellationTokenSource.getToken());
                    function1.invoke(builder);
                    com.google.android.gms.tasks.Task zza = placesClient.zza(builder.build(), com.google.android.libraries.places.internal.zzmy.PROGRAMMATIC_KOTLIN_API);
                    kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(zza, "");
                    zzlVar.zzb = 1;
                    obj = kotlinx.coroutines.tasks.TasksKt.await(zza, cancellationTokenSource, zzlVar);
                    if (obj == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                } else {
                    if (i != 1) {
                        throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    kotlin.ResultKt.throwOnFailure(obj);
                }
                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(obj, "");
                return obj;
            }
        }
        zzlVar = new com.google.android.libraries.places.api.net.kotlin.zzl(continuation);
        java.lang.Object obj2 = zzlVar.zza;
        java.lang.Object coroutine_suspended2 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = zzlVar.zzb;
        if (i != 0) {
        }
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(obj2, "");
        return obj2;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0033  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0025  */
    @kotlin.Deprecated(message = "Replaced with new API.", replaceWith = @kotlin.ReplaceWith(expression = "awaitSearchNearby", imports = {"com.google.android.libraries.places.api.net.kotlin.awaitSearchNearby"}))
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final java.lang.Object awaitFindCurrentPlace(com.google.android.libraries.places.api.net.PlacesClient placesClient, java.util.List<? extends com.google.android.libraries.places.api.model.Place.Field> list, kotlin.coroutines.Continuation<? super com.google.android.libraries.places.api.net.FindCurrentPlaceResponse> continuation) throws com.google.android.gms.common.api.ApiException {
        com.google.android.libraries.places.api.net.kotlin.zzm zzmVar;
        int i;
        if (continuation instanceof com.google.android.libraries.places.api.net.kotlin.zzm) {
            zzmVar = (com.google.android.libraries.places.api.net.kotlin.zzm) continuation;
            int i2 = zzmVar.zzb;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                zzmVar.zzb = i2 - 2147483648;
                java.lang.Object obj = zzmVar.zza;
                java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = zzmVar.zzb;
                if (i != 0) {
                    kotlin.ResultKt.throwOnFailure(obj);
                    final com.google.android.gms.tasks.CancellationTokenSource cancellationTokenSource = new com.google.android.gms.tasks.CancellationTokenSource();
                    com.google.android.gms.tasks.Task zzf = placesClient.zzf(com.google.android.libraries.places.api.net.kotlin.FindCurrentPlaceRequestKt.findCurrentPlaceRequest(list, new kotlin.jvm.functions.Function1() { // from class: com.google.android.libraries.places.api.net.kotlin.zzc
                        @Override // kotlin.jvm.functions.Function1
                        public final /* synthetic */ java.lang.Object invoke(java.lang.Object obj2) {
                            com.google.android.libraries.places.api.net.FindCurrentPlaceRequest.Builder builder = (com.google.android.libraries.places.api.net.FindCurrentPlaceRequest.Builder) obj2;
                            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(builder, "");
                            builder.setCancellationToken(com.google.android.gms.tasks.CancellationTokenSource.this.getToken());
                            return kotlin.Unit.INSTANCE;
                        }
                    }), com.google.android.libraries.places.internal.zzmy.PROGRAMMATIC_KOTLIN_API);
                    kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(zzf, "");
                    zzmVar.zzb = 1;
                    obj = kotlinx.coroutines.tasks.TasksKt.await(zzf, cancellationTokenSource, zzmVar);
                    if (obj == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                } else {
                    if (i != 1) {
                        throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    kotlin.ResultKt.throwOnFailure(obj);
                }
                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(obj, "");
                return obj;
            }
        }
        zzmVar = new com.google.android.libraries.places.api.net.kotlin.zzm(continuation);
        java.lang.Object obj2 = zzmVar.zza;
        java.lang.Object coroutine_suspended2 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = zzmVar.zzb;
        if (i != 0) {
        }
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(obj2, "");
        return obj2;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0033  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0025  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final java.lang.Object awaitIsOpen(com.google.android.libraries.places.api.net.PlacesClient placesClient, com.google.android.libraries.places.api.model.Place place, java.lang.Long l, kotlin.coroutines.Continuation<? super com.google.android.libraries.places.api.net.IsOpenResponse> continuation) throws com.google.android.gms.common.api.ApiException {
        com.google.android.libraries.places.api.net.kotlin.zzo zzoVar;
        int i;
        if (continuation instanceof com.google.android.libraries.places.api.net.kotlin.zzo) {
            zzoVar = (com.google.android.libraries.places.api.net.kotlin.zzo) continuation;
            int i2 = zzoVar.zzb;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                zzoVar.zzb = i2 - 2147483648;
                java.lang.Object obj = zzoVar.zza;
                java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = zzoVar.zzb;
                if (i != 0) {
                    kotlin.ResultKt.throwOnFailure(obj);
                    final com.google.android.gms.tasks.CancellationTokenSource cancellationTokenSource = new com.google.android.gms.tasks.CancellationTokenSource();
                    com.google.android.gms.tasks.Task zzh = placesClient.zzh(com.google.android.libraries.places.api.net.kotlin.IsOpenRequestKt.isOpenRequest(place, l, (kotlin.jvm.functions.Function1<? super com.google.android.libraries.places.api.net.IsOpenRequest.Builder, kotlin.Unit>) new kotlin.jvm.functions.Function1() { // from class: com.google.android.libraries.places.api.net.kotlin.zze
                        @Override // kotlin.jvm.functions.Function1
                        public final /* synthetic */ java.lang.Object invoke(java.lang.Object obj2) {
                            com.google.android.libraries.places.api.net.IsOpenRequest.Builder builder = (com.google.android.libraries.places.api.net.IsOpenRequest.Builder) obj2;
                            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(builder, "");
                            builder.setCancellationToken(com.google.android.gms.tasks.CancellationTokenSource.this.getToken());
                            return kotlin.Unit.INSTANCE;
                        }
                    }), com.google.android.libraries.places.internal.zzmy.PROGRAMMATIC_KOTLIN_API);
                    kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(zzh, "");
                    zzoVar.zzb = 1;
                    obj = kotlinx.coroutines.tasks.TasksKt.await(zzh, cancellationTokenSource, zzoVar);
                    if (obj == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                } else {
                    if (i != 1) {
                        throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    kotlin.ResultKt.throwOnFailure(obj);
                }
                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(obj, "");
                return obj;
            }
        }
        zzoVar = new com.google.android.libraries.places.api.net.kotlin.zzo(continuation);
        java.lang.Object obj2 = zzoVar.zza;
        java.lang.Object coroutine_suspended2 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = zzoVar.zzb;
        if (i != 0) {
        }
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(obj2, "");
        return obj2;
    }

    public static /* synthetic */ java.lang.Object awaitIsOpen$default(com.google.android.libraries.places.api.net.PlacesClient placesClient, com.google.android.libraries.places.api.model.Place place, java.lang.Long l, kotlin.coroutines.Continuation continuation, int i, java.lang.Object obj) throws com.google.android.gms.common.api.ApiException {
        if ((i & 2) != 0) {
            l = null;
        }
        return awaitIsOpen(placesClient, place, l, (kotlin.coroutines.Continuation<? super com.google.android.libraries.places.api.net.IsOpenResponse>) continuation);
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0033  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0025  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final java.lang.Object awaitSearchByText(com.google.android.libraries.places.api.net.PlacesClient placesClient, java.lang.String str, java.util.List<? extends com.google.android.libraries.places.api.model.Place.Field> list, kotlin.jvm.functions.Function1<? super com.google.android.libraries.places.api.net.SearchByTextRequest.Builder, kotlin.Unit> function1, kotlin.coroutines.Continuation<? super com.google.android.libraries.places.api.net.SearchByTextResponse> continuation) throws com.google.android.gms.common.api.ApiException {
        com.google.android.libraries.places.api.net.kotlin.zzp zzpVar;
        int i;
        if (continuation instanceof com.google.android.libraries.places.api.net.kotlin.zzp) {
            zzpVar = (com.google.android.libraries.places.api.net.kotlin.zzp) continuation;
            int i2 = zzpVar.zzb;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                zzpVar.zzb = i2 - 2147483648;
                java.lang.Object obj = zzpVar.zza;
                java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = zzpVar.zzb;
                if (i != 0) {
                    kotlin.ResultKt.throwOnFailure(obj);
                    com.google.android.gms.tasks.CancellationTokenSource cancellationTokenSource = new com.google.android.gms.tasks.CancellationTokenSource();
                    com.google.android.libraries.places.api.net.SearchByTextRequest.Builder builder = com.google.android.libraries.places.api.net.SearchByTextRequest.builder(str, list);
                    builder.setCancellationToken(cancellationTokenSource.getToken());
                    function1.invoke(builder);
                    com.google.android.gms.tasks.Task zzi = placesClient.zzi(builder.build(), com.google.android.libraries.places.internal.zzmy.PROGRAMMATIC_KOTLIN_API);
                    kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(zzi, "");
                    zzpVar.zzb = 1;
                    obj = kotlinx.coroutines.tasks.TasksKt.await(zzi, cancellationTokenSource, zzpVar);
                    if (obj == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                } else {
                    if (i != 1) {
                        throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    kotlin.ResultKt.throwOnFailure(obj);
                }
                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(obj, "");
                return obj;
            }
        }
        zzpVar = new com.google.android.libraries.places.api.net.kotlin.zzp(continuation);
        java.lang.Object obj2 = zzpVar.zza;
        java.lang.Object coroutine_suspended2 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = zzpVar.zzb;
        if (i != 0) {
        }
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(obj2, "");
        return obj2;
    }

    public static /* synthetic */ java.lang.Object awaitSearchByText$default(com.google.android.libraries.places.api.net.PlacesClient placesClient, java.lang.String str, java.util.List list, kotlin.jvm.functions.Function1 function1, kotlin.coroutines.Continuation continuation, int i, java.lang.Object obj) throws com.google.android.gms.common.api.ApiException {
        if ((i & 4) != 0) {
            function1 = com.google.android.libraries.places.api.net.kotlin.zzf.zza;
        }
        return awaitSearchByText(placesClient, str, list, function1, continuation);
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0033  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0025  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final java.lang.Object awaitSearchNearby(com.google.android.libraries.places.api.net.PlacesClient placesClient, com.google.android.libraries.places.api.model.LocationRestriction locationRestriction, java.util.List<? extends com.google.android.libraries.places.api.model.Place.Field> list, kotlin.jvm.functions.Function1<? super com.google.android.libraries.places.api.net.SearchNearbyRequest.Builder, kotlin.Unit> function1, kotlin.coroutines.Continuation<? super com.google.android.libraries.places.api.net.SearchNearbyResponse> continuation) throws com.google.android.gms.common.api.ApiException {
        com.google.android.libraries.places.api.net.kotlin.zzq zzqVar;
        int i;
        if (continuation instanceof com.google.android.libraries.places.api.net.kotlin.zzq) {
            zzqVar = (com.google.android.libraries.places.api.net.kotlin.zzq) continuation;
            int i2 = zzqVar.zzb;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                zzqVar.zzb = i2 - 2147483648;
                java.lang.Object obj = zzqVar.zza;
                java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = zzqVar.zzb;
                if (i != 0) {
                    kotlin.ResultKt.throwOnFailure(obj);
                    com.google.android.gms.tasks.CancellationTokenSource cancellationTokenSource = new com.google.android.gms.tasks.CancellationTokenSource();
                    com.google.android.libraries.places.api.net.SearchNearbyRequest.Builder builder = com.google.android.libraries.places.api.net.SearchNearbyRequest.builder(locationRestriction, list);
                    builder.setCancellationToken(cancellationTokenSource.getToken());
                    function1.invoke(builder);
                    com.google.android.gms.tasks.Task zzj = placesClient.zzj(builder.build(), com.google.android.libraries.places.internal.zzmy.PROGRAMMATIC_KOTLIN_API);
                    kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(zzj, "");
                    zzqVar.zzb = 1;
                    obj = kotlinx.coroutines.tasks.TasksKt.await(zzj, cancellationTokenSource, zzqVar);
                    if (obj == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                } else {
                    if (i != 1) {
                        throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    kotlin.ResultKt.throwOnFailure(obj);
                }
                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(obj, "");
                return obj;
            }
        }
        zzqVar = new com.google.android.libraries.places.api.net.kotlin.zzq(continuation);
        java.lang.Object obj2 = zzqVar.zza;
        java.lang.Object coroutine_suspended2 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = zzqVar.zzb;
        if (i != 0) {
        }
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(obj2, "");
        return obj2;
    }

    public static /* synthetic */ java.lang.Object awaitSearchNearby$default(com.google.android.libraries.places.api.net.PlacesClient placesClient, com.google.android.libraries.places.api.model.LocationRestriction locationRestriction, java.util.List list, kotlin.jvm.functions.Function1 function1, kotlin.coroutines.Continuation continuation, int i, java.lang.Object obj) throws com.google.android.gms.common.api.ApiException {
        if ((i & 4) != 0) {
            function1 = com.google.android.libraries.places.api.net.kotlin.zzg.zza;
        }
        return awaitSearchNearby(placesClient, locationRestriction, list, function1, continuation);
    }

    public static /* synthetic */ java.lang.Object awaitIsOpen$default(com.google.android.libraries.places.api.net.PlacesClient placesClient, java.lang.String str, java.lang.Long l, kotlin.coroutines.Continuation continuation, int i, java.lang.Object obj) throws com.google.android.gms.common.api.ApiException {
        if ((i & 2) != 0) {
            l = null;
        }
        return awaitIsOpen(placesClient, str, l, (kotlin.coroutines.Continuation<? super com.google.android.libraries.places.api.net.IsOpenResponse>) continuation);
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0033  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0025  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final java.lang.Object awaitIsOpen(com.google.android.libraries.places.api.net.PlacesClient placesClient, java.lang.String str, java.lang.Long l, kotlin.coroutines.Continuation<? super com.google.android.libraries.places.api.net.IsOpenResponse> continuation) throws com.google.android.gms.common.api.ApiException {
        com.google.android.libraries.places.api.net.kotlin.zzn zznVar;
        int i;
        if (continuation instanceof com.google.android.libraries.places.api.net.kotlin.zzn) {
            zznVar = (com.google.android.libraries.places.api.net.kotlin.zzn) continuation;
            int i2 = zznVar.zzb;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                zznVar.zzb = i2 - 2147483648;
                java.lang.Object obj = zznVar.zza;
                java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = zznVar.zzb;
                if (i != 0) {
                    kotlin.ResultKt.throwOnFailure(obj);
                    final com.google.android.gms.tasks.CancellationTokenSource cancellationTokenSource = new com.google.android.gms.tasks.CancellationTokenSource();
                    com.google.android.gms.tasks.Task zzh = placesClient.zzh(com.google.android.libraries.places.api.net.kotlin.IsOpenRequestKt.isOpenRequest(str, l, (kotlin.jvm.functions.Function1<? super com.google.android.libraries.places.api.net.IsOpenRequest.Builder, kotlin.Unit>) new kotlin.jvm.functions.Function1() { // from class: com.google.android.libraries.places.api.net.kotlin.zzd
                        @Override // kotlin.jvm.functions.Function1
                        public final /* synthetic */ java.lang.Object invoke(java.lang.Object obj2) {
                            com.google.android.libraries.places.api.net.IsOpenRequest.Builder builder = (com.google.android.libraries.places.api.net.IsOpenRequest.Builder) obj2;
                            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(builder, "");
                            builder.setCancellationToken(com.google.android.gms.tasks.CancellationTokenSource.this.getToken());
                            return kotlin.Unit.INSTANCE;
                        }
                    }), com.google.android.libraries.places.internal.zzmy.PROGRAMMATIC_KOTLIN_API);
                    kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(zzh, "");
                    zznVar.zzb = 1;
                    obj = kotlinx.coroutines.tasks.TasksKt.await(zzh, cancellationTokenSource, zznVar);
                    if (obj == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                } else {
                    if (i != 1) {
                        throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    kotlin.ResultKt.throwOnFailure(obj);
                }
                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(obj, "");
                return obj;
            }
        }
        zznVar = new com.google.android.libraries.places.api.net.kotlin.zzn(continuation);
        java.lang.Object obj2 = zznVar.zza;
        java.lang.Object coroutine_suspended2 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = zznVar.zzb;
        if (i != 0) {
        }
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(obj2, "");
        return obj2;
    }
}
