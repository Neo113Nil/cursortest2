package com.paypal.oslo.feature.cashin.domain.geocoding;

@kotlin.Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u0011\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u001a\u0010\t\u001a\u0004\u0018\u00010\b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0086@¢\u0006\u0004\b\t\u0010\nR\u0014\u0010\u000b\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\f"}, d2 = {"Lcom/paypal/oslo/feature/cashin/domain/geocoding/CashInPlacesGeocoder;", "", "Lcom/google/android/libraries/places/api/net/PlacesClient;", "placesClient", "<init>", "(Lcom/google/android/libraries/places/api/net/PlacesClient;)V", "", "query", "Lcom/google/android/gms/maps/model/LatLng;", "searchLocation", "(Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getHighSpeedVideoFpsRangesFor", "Lcom/google/android/libraries/places/api/net/PlacesClient;"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class CashInPlacesGeocoder {
    public static final int $stable = 8;
    private final com.google.android.libraries.places.api.net.PlacesClient getHighSpeedVideoFpsRangesFor;

    @javax.inject.Inject
    public CashInPlacesGeocoder(com.google.android.libraries.places.api.net.PlacesClient placesClient) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(placesClient, "");
        this.getHighSpeedVideoFpsRangesFor = placesClient;
    }

    /* JADX WARN: Code restructure failed: missing block: B:25:0x010a, code lost:
    
        if (r14 == r1) goto L31;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x0125, code lost:
    
        return r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x00a0, code lost:
    
        if (r4 != r1) goto L18;
     */
    /* JADX WARN: Removed duplicated region for block: B:29:0x006c  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0027  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object searchLocation(java.lang.String str, kotlin.coroutines.Continuation<? super com.google.android.gms.maps.model.LatLng> continuation) {
        com.paypal.oslo.feature.cashin.domain.geocoding.CashInPlacesGeocoder$searchLocation$1 cashInPlacesGeocoder$searchLocation$1;
        int i;
        com.google.android.libraries.places.api.model.AutocompleteSessionToken newInstance;
        com.google.android.libraries.places.api.net.FindAutocompletePredictionsRequest build;
        java.lang.Object await;
        com.google.android.libraries.places.api.model.AutocompletePrediction autocompletePrediction;
        java.lang.String placeId;
        if (continuation instanceof com.paypal.oslo.feature.cashin.domain.geocoding.CashInPlacesGeocoder$searchLocation$1) {
            cashInPlacesGeocoder$searchLocation$1 = (com.paypal.oslo.feature.cashin.domain.geocoding.CashInPlacesGeocoder$searchLocation$1) continuation;
            if ((cashInPlacesGeocoder$searchLocation$1.getInputFormats & Integer.MIN_VALUE) != 0) {
                cashInPlacesGeocoder$searchLocation$1.getInputFormats -= 2147483648;
                java.lang.Object obj = cashInPlacesGeocoder$searchLocation$1.getOutputFormats;
                java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = cashInPlacesGeocoder$searchLocation$1.getInputFormats;
                if (i != 0) {
                    kotlin.ResultKt.throwOnFailure(obj);
                    newInstance = com.google.android.libraries.places.api.model.AutocompleteSessionToken.newInstance();
                    build = com.google.android.libraries.places.api.net.FindAutocompletePredictionsRequest.builder().setSessionToken(newInstance).setQuery(str).build();
                    com.google.android.gms.tasks.Task<com.google.android.libraries.places.api.net.FindAutocompletePredictionsResponse> findAutocompletePredictions = this.getHighSpeedVideoFpsRangesFor.findAutocompletePredictions(build);
                    kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(findAutocompletePredictions, "");
                    cashInPlacesGeocoder$searchLocation$1.getHighSpeedVideoFpsRanges = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(str);
                    cashInPlacesGeocoder$searchLocation$1.getHighResolutionOutputSizeshNQ4ISI = newInstance;
                    cashInPlacesGeocoder$searchLocation$1.getHighSpeedVideoSizes = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(build);
                    cashInPlacesGeocoder$searchLocation$1.getInputFormats = 1;
                    await = kotlinx.coroutines.tasks.TasksKt.await(findAutocompletePredictions, cashInPlacesGeocoder$searchLocation$1);
                } else {
                    if (i != 1) {
                        if (i != 2) {
                            throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        kotlin.ResultKt.throwOnFailure(obj);
                        com.google.android.gms.maps.model.LatLng location = ((com.google.android.libraries.places.api.net.FetchPlaceResponse) obj).getPlace().getLocation();
                        if (location != null) {
                            return new com.google.android.gms.maps.model.LatLng(location.latitude, location.longitude);
                        }
                        return null;
                    }
                    com.google.android.libraries.places.api.net.FindAutocompletePredictionsRequest findAutocompletePredictionsRequest = (com.google.android.libraries.places.api.net.FindAutocompletePredictionsRequest) cashInPlacesGeocoder$searchLocation$1.getHighSpeedVideoSizes;
                    newInstance = (com.google.android.libraries.places.api.model.AutocompleteSessionToken) cashInPlacesGeocoder$searchLocation$1.getHighResolutionOutputSizeshNQ4ISI;
                    java.lang.String str2 = (java.lang.String) cashInPlacesGeocoder$searchLocation$1.getHighSpeedVideoFpsRanges;
                    kotlin.ResultKt.throwOnFailure(obj);
                    build = findAutocompletePredictionsRequest;
                    str = str2;
                    await = obj;
                }
                com.google.android.libraries.places.api.net.FindAutocompletePredictionsResponse findAutocompletePredictionsResponse = (com.google.android.libraries.places.api.net.FindAutocompletePredictionsResponse) await;
                java.util.List<com.google.android.libraries.places.api.model.AutocompletePrediction> autocompletePredictions = findAutocompletePredictionsResponse.getAutocompletePredictions();
                kotlin.jvm.internal.Intrinsics.checkNotNull(autocompletePredictions);
                autocompletePrediction = (com.google.android.libraries.places.api.model.AutocompletePrediction) kotlin.collections.CollectionsKt.firstOrNull((java.util.List) autocompletePredictions);
                if (autocompletePrediction == null && (placeId = autocompletePrediction.getPlaceId()) != null) {
                    java.util.List listOf = kotlin.collections.CollectionsKt.listOf(com.google.android.libraries.places.api.model.Place.Field.LOCATION);
                    com.google.android.libraries.places.api.net.FetchPlaceRequest build2 = com.google.android.libraries.places.api.net.FetchPlaceRequest.builder(placeId, listOf).setSessionToken(newInstance).build();
                    com.google.android.gms.tasks.Task<com.google.android.libraries.places.api.net.FetchPlaceResponse> fetchPlace = this.getHighSpeedVideoFpsRangesFor.fetchPlace(build2);
                    kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(fetchPlace, "");
                    cashInPlacesGeocoder$searchLocation$1.getHighSpeedVideoFpsRanges = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(str);
                    cashInPlacesGeocoder$searchLocation$1.getHighResolutionOutputSizeshNQ4ISI = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(newInstance);
                    cashInPlacesGeocoder$searchLocation$1.getHighSpeedVideoSizes = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(build);
                    cashInPlacesGeocoder$searchLocation$1.getHighSpeedVideoFpsRangesFor = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(findAutocompletePredictionsResponse);
                    cashInPlacesGeocoder$searchLocation$1.Camera2StreamConfigurationMap = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(autocompletePredictions);
                    cashInPlacesGeocoder$searchLocation$1.getOutputMinFrameDuration = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(placeId);
                    cashInPlacesGeocoder$searchLocation$1.getHighSpeedVideoSizesFor = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(listOf);
                    cashInPlacesGeocoder$searchLocation$1.getInputSizeshNQ4ISI = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(build2);
                    cashInPlacesGeocoder$searchLocation$1.getInputFormats = 2;
                    obj = kotlinx.coroutines.tasks.TasksKt.await(fetchPlace, cashInPlacesGeocoder$searchLocation$1);
                }
            }
        }
        cashInPlacesGeocoder$searchLocation$1 = new com.paypal.oslo.feature.cashin.domain.geocoding.CashInPlacesGeocoder$searchLocation$1(this, continuation);
        java.lang.Object obj2 = cashInPlacesGeocoder$searchLocation$1.getOutputFormats;
        java.lang.Object coroutine_suspended2 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = cashInPlacesGeocoder$searchLocation$1.getInputFormats;
        if (i != 0) {
        }
        com.google.android.libraries.places.api.net.FindAutocompletePredictionsResponse findAutocompletePredictionsResponse2 = (com.google.android.libraries.places.api.net.FindAutocompletePredictionsResponse) await;
        java.util.List<com.google.android.libraries.places.api.model.AutocompletePrediction> autocompletePredictions2 = findAutocompletePredictionsResponse2.getAutocompletePredictions();
        kotlin.jvm.internal.Intrinsics.checkNotNull(autocompletePredictions2);
        autocompletePrediction = (com.google.android.libraries.places.api.model.AutocompletePrediction) kotlin.collections.CollectionsKt.firstOrNull((java.util.List) autocompletePredictions2);
        return autocompletePrediction == null ? null : null;
    }
}
