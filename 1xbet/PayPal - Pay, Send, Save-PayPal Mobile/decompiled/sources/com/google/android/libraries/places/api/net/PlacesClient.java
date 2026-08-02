package com.google.android.libraries.places.api.net;

/* loaded from: classes.dex */
public interface PlacesClient {
    @java.lang.Deprecated
    com.google.android.gms.tasks.Task<com.google.android.libraries.places.api.net.FetchPhotoResponse> fetchPhoto(com.google.android.libraries.places.api.net.FetchPhotoRequest fetchPhotoRequest);

    com.google.android.gms.tasks.Task<com.google.android.libraries.places.api.net.FetchPlaceResponse> fetchPlace(com.google.android.libraries.places.api.net.FetchPlaceRequest fetchPlaceRequest);

    com.google.android.gms.tasks.Task<com.google.android.libraries.places.api.net.FetchResolvedPhotoUriResponse> fetchResolvedPhotoUri(com.google.android.libraries.places.api.net.FetchResolvedPhotoUriRequest fetchResolvedPhotoUriRequest);

    com.google.android.gms.tasks.Task<com.google.android.libraries.places.api.net.FindAutocompletePredictionsResponse> findAutocompletePredictions(com.google.android.libraries.places.api.net.FindAutocompletePredictionsRequest findAutocompletePredictionsRequest);

    @java.lang.Deprecated
    com.google.android.gms.tasks.Task<com.google.android.libraries.places.api.net.FindCurrentPlaceResponse> findCurrentPlace(com.google.android.libraries.places.api.net.FindCurrentPlaceRequest findCurrentPlaceRequest);

    com.google.android.gms.tasks.Task<com.google.android.libraries.places.api.net.IsOpenResponse> isOpen(com.google.android.libraries.places.api.net.IsOpenRequest isOpenRequest);

    com.google.android.gms.tasks.Task<com.google.android.libraries.places.api.net.SearchByTextResponse> searchByText(com.google.android.libraries.places.api.net.SearchByTextRequest searchByTextRequest);

    com.google.android.gms.tasks.Task<com.google.android.libraries.places.api.net.SearchNearbyResponse> searchNearby(com.google.android.libraries.places.api.net.SearchNearbyRequest searchNearbyRequest);

    com.google.android.gms.tasks.Task zza(com.google.android.libraries.places.api.net.FindAutocompletePredictionsRequest findAutocompletePredictionsRequest, com.google.android.libraries.places.internal.zzmy zzmyVar);

    @java.lang.Deprecated
    com.google.android.gms.tasks.Task zzb(com.google.android.libraries.places.api.net.FetchPhotoRequest fetchPhotoRequest, com.google.android.libraries.places.internal.zzmy zzmyVar);

    com.google.android.gms.tasks.Task zzc(com.google.android.libraries.places.api.net.FetchResolvedPhotoUriRequest fetchResolvedPhotoUriRequest, com.google.android.libraries.places.internal.zzmy zzmyVar);

    com.google.android.gms.tasks.Task zzd(com.google.android.libraries.places.api.net.FetchPlaceRequest fetchPlaceRequest, com.google.android.libraries.places.internal.zzmy zzmyVar);

    com.google.android.gms.tasks.Task zze(com.google.android.gms.maps.model.LatLng latLng);

    @java.lang.Deprecated
    com.google.android.gms.tasks.Task zzf(com.google.android.libraries.places.api.net.FindCurrentPlaceRequest findCurrentPlaceRequest, com.google.android.libraries.places.internal.zzmy zzmyVar);

    com.google.android.gms.tasks.Task zzh(com.google.android.libraries.places.api.net.IsOpenRequest isOpenRequest, com.google.android.libraries.places.internal.zzmy zzmyVar);

    com.google.android.gms.tasks.Task zzi(com.google.android.libraries.places.api.net.SearchByTextRequest searchByTextRequest, com.google.android.libraries.places.internal.zzmy zzmyVar);

    com.google.android.gms.tasks.Task zzj(com.google.android.libraries.places.api.net.SearchNearbyRequest searchNearbyRequest, com.google.android.libraries.places.internal.zzmy zzmyVar);

    void zzk();

    void zzl();

    void zzm();
}
