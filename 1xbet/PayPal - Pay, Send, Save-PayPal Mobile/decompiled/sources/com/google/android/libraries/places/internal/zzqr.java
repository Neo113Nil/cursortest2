package com.google.android.libraries.places.internal;

/* loaded from: classes8.dex */
public final class zzqr extends androidx.view.AndroidViewModel {
    public static final /* synthetic */ int zza = 0;
    private final androidx.view.MutableLiveData zzb;
    private final androidx.view.LiveData zzc;
    private final androidx.view.MutableLiveData zzd;
    private final androidx.view.LiveData zze;
    private final androidx.view.MutableLiveData zzf;
    private final androidx.view.LiveData zzg;
    private com.google.android.libraries.places.api.net.PlacesClient zzh;
    private com.google.android.libraries.places.internal.zzpt zzi;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzqr(android.app.Application application) {
        super(application);
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(application, "");
        androidx.view.MutableLiveData mutableLiveData = new androidx.view.MutableLiveData();
        this.zzb = mutableLiveData;
        this.zzc = mutableLiveData;
        androidx.view.MutableLiveData mutableLiveData2 = new androidx.view.MutableLiveData();
        this.zzd = mutableLiveData2;
        this.zze = mutableLiveData2;
        androidx.view.MutableLiveData mutableLiveData3 = new androidx.view.MutableLiveData();
        this.zzf = mutableLiveData3;
        this.zzg = mutableLiveData3;
    }

    static /* synthetic */ kotlin.Unit zzk(com.google.android.libraries.places.internal.zzqr zzqrVar, com.google.android.libraries.places.api.net.SearchByTextResponse searchByTextResponse) {
        zzqrVar.zzb.postValue(searchByTextResponse.getPlaces());
        java.util.List<com.google.android.libraries.places.api.model.Place> places = searchByTextResponse.getPlaces();
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(places, "");
        zzqrVar.zzh(places);
        return kotlin.Unit.INSTANCE;
    }

    static /* synthetic */ void zzl(com.google.android.libraries.places.internal.zzqr zzqrVar, java.lang.Exception exc) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(exc, "");
        zzqrVar.zzd.postValue(exc);
    }

    static /* synthetic */ kotlin.Unit zzm(com.google.android.libraries.places.internal.zzqr zzqrVar, com.google.android.libraries.places.api.net.SearchNearbyResponse searchNearbyResponse) {
        zzqrVar.zzb.postValue(searchNearbyResponse.getPlaces());
        java.util.List<com.google.android.libraries.places.api.model.Place> places = searchNearbyResponse.getPlaces();
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(places, "");
        zzqrVar.zzh(places);
        return kotlin.Unit.INSTANCE;
    }

    static /* synthetic */ void zzn(com.google.android.libraries.places.internal.zzqr zzqrVar, java.lang.Exception exc) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(exc, "");
        zzqrVar.zzd.postValue(exc);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final java.lang.Object zzo(java.util.List list, kotlin.coroutines.Continuation continuation) {
        com.google.android.libraries.places.api.model.PhotoMetadata photoMetadata = list != null ? (com.google.android.libraries.places.api.model.PhotoMetadata) kotlin.collections.CollectionsKt.firstOrNull(list) : null;
        if (photoMetadata == null) {
            return com.google.android.libraries.places.widget.internal.placedetails.zzbp.zza;
        }
        kotlinx.coroutines.CancellableContinuationImpl cancellableContinuationImpl = new kotlinx.coroutines.CancellableContinuationImpl(kotlin.coroutines.intrinsics.IntrinsicsKt.intercepted(continuation), 1);
        cancellableContinuationImpl.initCancellability();
        kotlinx.coroutines.CancellableContinuationImpl cancellableContinuationImpl2 = cancellableContinuationImpl;
        com.google.android.libraries.places.api.net.FetchResolvedPhotoUriRequest newInstance = com.google.android.libraries.places.api.net.FetchResolvedPhotoUriRequest.newInstance(photoMetadata);
        com.google.android.libraries.places.api.net.PlacesClient zzd = zzd();
        com.google.android.gms.tasks.Task zzc = zzd != null ? zzd.zzc(newInstance, com.google.android.libraries.places.internal.zzmy.PLACES_UI_KIT) : null;
        if (zzc != null) {
            final com.google.android.libraries.places.internal.zzqo zzqoVar = new com.google.android.libraries.places.internal.zzqo(cancellableContinuationImpl2);
            zzc.addOnSuccessListener(new com.google.android.gms.tasks.OnSuccessListener(zzqoVar) { // from class: com.google.android.libraries.places.internal.zzqq
                private final /* synthetic */ kotlin.jvm.functions.Function1 zza;

                @Override // com.google.android.gms.tasks.OnSuccessListener
                public final /* synthetic */ void onSuccess(java.lang.Object obj) {
                    this.zza.invoke(obj);
                }

                {
                    kotlin.jvm.internal.Intrinsics.checkNotNullParameter(zzqoVar, "");
                    this.zza = zzqoVar;
                }
            });
        }
        if (zzc != null) {
            zzc.addOnFailureListener(new com.google.android.libraries.places.internal.zzqp(cancellableContinuationImpl2));
        }
        java.lang.Object result = cancellableContinuationImpl.getResult();
        if (result == kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()) {
            kotlin.coroutines.jvm.internal.DebugProbesKt.probeCoroutineSuspended(continuation);
        }
        return result;
    }

    @Override // androidx.view.ViewModel
    public final void onCleared() {
        java.lang.System.out.println("onCleared");
        super.onCleared();
        com.google.android.libraries.places.api.net.PlacesClient zzd = zzd();
        if (zzd != null) {
            zzd.zzk();
        }
    }

    public final com.google.android.libraries.places.api.net.PlacesClient zzd() {
        if (this.zzh == null) {
            com.google.android.libraries.places.internal.zzpt zze = zze();
            this.zzh = zze != null ? zze.zzc() : null;
        }
        return this.zzh;
    }

    public final com.google.android.libraries.places.internal.zzpt zze() {
        if (this.zzi == null) {
            com.google.android.libraries.places.internal.zzps zza2 = com.google.android.libraries.places.internal.zzpr.zza();
            zza2.zzc(getApplication().getApplicationContext());
            zza2.zzb(com.google.android.libraries.places.internal.zzmy.PLACES_UI_KIT);
            this.zzi = zza2.zza();
        }
        return this.zzi;
    }

    public final void zzf(com.google.android.libraries.places.api.net.SearchByTextRequest searchByTextRequest, java.util.List list) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(searchByTextRequest, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(list, "");
        com.google.android.libraries.places.api.net.SearchByTextRequest.Builder zzc = searchByTextRequest.zzc();
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(zzc, "");
        zzc.setPlaceFields(list);
        zzc.setRoutingSummariesIncluded(false);
        com.google.android.libraries.places.api.net.PlacesClient zzd = zzd();
        com.google.android.gms.tasks.Task zzi = zzd != null ? zzd.zzi(zzc.build(), com.google.android.libraries.places.internal.zzmy.PLACES_UI_KIT) : null;
        if (zzi != null) {
            final kotlin.jvm.functions.Function1 function1 = new kotlin.jvm.functions.Function1() { // from class: com.google.android.libraries.places.internal.zzql
                @Override // kotlin.jvm.functions.Function1
                public final /* synthetic */ java.lang.Object invoke(java.lang.Object obj) {
                    return com.google.android.libraries.places.internal.zzqr.zzk(com.google.android.libraries.places.internal.zzqr.this, (com.google.android.libraries.places.api.net.SearchByTextResponse) obj);
                }
            };
            zzi.addOnSuccessListener(new com.google.android.gms.tasks.OnSuccessListener() { // from class: com.google.android.libraries.places.internal.zzqg
                @Override // com.google.android.gms.tasks.OnSuccessListener
                public final /* synthetic */ void onSuccess(java.lang.Object obj) {
                    kotlin.jvm.functions.Function1.this.invoke(obj);
                }
            });
        }
        if (zzi != null) {
            zzi.addOnFailureListener(new com.google.android.gms.tasks.OnFailureListener() { // from class: com.google.android.libraries.places.internal.zzqh
                @Override // com.google.android.gms.tasks.OnFailureListener
                public final /* synthetic */ void onFailure(java.lang.Exception exc) {
                    com.google.android.libraries.places.internal.zzqr.zzl(com.google.android.libraries.places.internal.zzqr.this, exc);
                }
            });
        }
    }

    public final void zzg(com.google.android.libraries.places.api.net.SearchNearbyRequest searchNearbyRequest, java.util.List list) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(searchNearbyRequest, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(list, "");
        com.google.android.libraries.places.api.net.SearchNearbyRequest.Builder zza2 = searchNearbyRequest.zza();
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(zza2, "");
        zza2.setPlaceFields(list);
        zza2.setRoutingSummariesIncluded(false);
        com.google.android.libraries.places.api.net.PlacesClient zzd = zzd();
        com.google.android.gms.tasks.Task zzj = zzd != null ? zzd.zzj(zza2.build(), com.google.android.libraries.places.internal.zzmy.PLACES_UI_KIT) : null;
        if (zzj != null) {
            final kotlin.jvm.functions.Function1 function1 = new kotlin.jvm.functions.Function1() { // from class: com.google.android.libraries.places.internal.zzqi
                @Override // kotlin.jvm.functions.Function1
                public final /* synthetic */ java.lang.Object invoke(java.lang.Object obj) {
                    return com.google.android.libraries.places.internal.zzqr.zzm(com.google.android.libraries.places.internal.zzqr.this, (com.google.android.libraries.places.api.net.SearchNearbyResponse) obj);
                }
            };
            zzj.addOnSuccessListener(new com.google.android.gms.tasks.OnSuccessListener() { // from class: com.google.android.libraries.places.internal.zzqj
                @Override // com.google.android.gms.tasks.OnSuccessListener
                public final /* synthetic */ void onSuccess(java.lang.Object obj) {
                    kotlin.jvm.functions.Function1.this.invoke(obj);
                }
            });
        }
        if (zzj != null) {
            zzj.addOnFailureListener(new com.google.android.gms.tasks.OnFailureListener() { // from class: com.google.android.libraries.places.internal.zzqk
                @Override // com.google.android.gms.tasks.OnFailureListener
                public final /* synthetic */ void onFailure(java.lang.Exception exc) {
                    com.google.android.libraries.places.internal.zzqr.zzn(com.google.android.libraries.places.internal.zzqr.this, exc);
                }
            });
        }
    }

    public final void zzh(java.util.List list) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(list, "");
        kotlinx.coroutines.BuildersKt__Builders_commonKt.launch$default(androidx.view.ViewModelKt.getViewModelScope(this), null, null, new com.google.android.libraries.places.internal.zzqn(list, this, null), 3, null);
    }

    public final androidx.view.LiveData zzc() {
        return this.zzg;
    }

    public final androidx.view.LiveData zzb() {
        return this.zze;
    }

    public final androidx.view.LiveData zza() {
        return this.zzc;
    }
}
