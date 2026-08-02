package com.paypal.oslo.feature.packagetracking.domain.repository;

@kotlin.Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J$\u0010\u0006\u001a\u00020\u00052\b\b\u0001\u0010\u0003\u001a\u00020\u00022\b\b\u0001\u0010\u0004\u001a\u00020\u0002H§@¢\u0006\u0004\b\u0006\u0010\u0007À\u0006\u0003"}, d2 = {"Lcom/paypal/oslo/feature/packagetracking/domain/repository/GeoCoderApi;", "", "", "address", "key", "Lcom/paypal/oslo/feature/packagetracking/domain/repository/models/GeocoderModel;", "getGeocoderData", "(Ljava/lang/String;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes5.dex */
public interface GeoCoderApi {
    @retrofit2.http.GET("maps/api/geocode/json")
    java.lang.Object getGeocoderData(@retrofit2.http.Query("address") java.lang.String str, @retrofit2.http.Query("key") java.lang.String str2, kotlin.coroutines.Continuation<? super com.paypal.oslo.feature.packagetracking.domain.repository.models.GeocoderModel> continuation);
}
