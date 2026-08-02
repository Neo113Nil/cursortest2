package com.google.android.libraries.places.widget.internal.placedetails;

/* loaded from: classes8.dex */
public final class zzbj extends androidx.view.AndroidViewModel {
    public static final /* synthetic */ int zza = 0;
    private final androidx.view.MutableLiveData zzb;
    private final androidx.view.LiveData zzc;
    private final androidx.view.MutableLiveData zzd;
    private final androidx.view.LiveData zze;
    private final java.util.List zzf;
    private final java.util.List zzg;
    private final java.util.List zzh;
    private final androidx.view.MutableLiveData zzi;
    private final androidx.view.MutableLiveData zzj;
    private com.google.android.libraries.places.internal.zzpt zzk;
    private com.google.android.libraries.places.api.net.PlacesClient zzl;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzbj(android.app.Application application) {
        super(application);
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(application, "");
        androidx.view.MutableLiveData mutableLiveData = new androidx.view.MutableLiveData();
        this.zzb = mutableLiveData;
        this.zzc = mutableLiveData;
        androidx.view.MutableLiveData mutableLiveData2 = new androidx.view.MutableLiveData();
        this.zzd = mutableLiveData2;
        this.zze = mutableLiveData2;
        java.util.List mutableListOf = kotlin.collections.CollectionsKt.mutableListOf(new androidx.view.MutableLiveData(), new androidx.view.MutableLiveData(), new androidx.view.MutableLiveData());
        this.zzf = mutableListOf;
        this.zzg = new java.util.ArrayList();
        this.zzh = mutableListOf;
        androidx.view.MutableLiveData mutableLiveData3 = new androidx.view.MutableLiveData();
        this.zzi = mutableLiveData3;
        this.zzj = mutableLiveData3;
    }

    static /* synthetic */ kotlin.Unit zzl(com.google.android.libraries.places.widget.internal.placedetails.zzbj zzbjVar, com.google.android.libraries.places.widget.internal.placedetails.zzbd zzbdVar, com.google.android.libraries.places.api.net.FetchPlaceResponse fetchPlaceResponse) {
        java.util.List list;
        androidx.view.MutableLiveData mutableLiveData = zzbjVar.zzb;
        com.google.android.libraries.places.api.model.Place place = fetchPlaceResponse.getPlace();
        mutableLiveData.postValue(place);
        if (zzbdVar.zza()) {
            java.util.List<com.google.android.libraries.places.api.model.PhotoMetadata> photoMetadatas = place.getPhotoMetadatas();
            int i = 0;
            if (photoMetadatas == null) {
                java.util.List list2 = zzbjVar.zzf;
                ((androidx.view.MutableLiveData) list2.get(0)).postValue(com.google.android.libraries.places.widget.internal.placedetails.zzbp.zza);
                androidx.view.MutableLiveData mutableLiveData2 = (androidx.view.MutableLiveData) list2.get(1);
                com.google.android.libraries.places.widget.internal.placedetails.zzbo zzboVar = com.google.android.libraries.places.widget.internal.placedetails.zzbo.zza;
                mutableLiveData2.postValue(zzboVar);
                ((androidx.view.MutableLiveData) list2.get(2)).postValue(zzboVar);
            } else if (photoMetadatas.isEmpty()) {
                ((androidx.view.MutableLiveData) zzbjVar.zzf.get(0)).postValue(com.google.android.libraries.places.widget.internal.placedetails.zzbp.zza);
            } else {
                while (true) {
                    list = zzbjVar.zzf;
                    if (list.size() >= photoMetadatas.size()) {
                        break;
                    }
                    list.add(new androidx.view.MutableLiveData());
                }
                java.util.List list3 = zzbjVar.zzg;
                int size = photoMetadatas.size();
                java.util.ArrayList arrayList = new java.util.ArrayList(size);
                for (int i2 = 0; i2 < size; i2++) {
                    arrayList.add(new androidx.view.MutableLiveData());
                }
                list3.addAll(arrayList);
                java.util.ArrayList arrayList2 = new java.util.ArrayList();
                for (com.google.android.libraries.places.api.model.PhotoMetadata photoMetadata : photoMetadatas) {
                    arrayList2.add(new com.google.android.libraries.places.widget.internal.placedetails.zzav(photoMetadata, zzbdVar.zzc(), (androidx.view.MutableLiveData) list.get(i)));
                    arrayList2.add(new com.google.android.libraries.places.widget.internal.placedetails.zzav(photoMetadata, zzbdVar.zzd(), (androidx.view.MutableLiveData) list3.get(i)));
                    i++;
                }
                for (int size2 = photoMetadatas.size(); size2 < 3; size2++) {
                    ((androidx.view.MutableLiveData) list.get(size2)).postValue(com.google.android.libraries.places.widget.internal.placedetails.zzbo.zza);
                }
                kotlinx.coroutines.BuildersKt__Builders_commonKt.launch$default(androidx.view.ViewModelKt.getViewModelScope(zzbjVar), null, null, new com.google.android.libraries.places.widget.internal.placedetails.zzbf(arrayList2, zzbjVar, null), 3, null);
            }
        }
        return kotlin.Unit.INSTANCE;
    }

    static /* synthetic */ void zzm(com.google.android.libraries.places.widget.internal.placedetails.zzbj zzbjVar, java.lang.String str, java.lang.Exception exc) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(exc, "");
        zzbjVar.zzd.postValue(exc);
    }

    static /* synthetic */ void zzn(com.google.android.libraries.places.widget.internal.placedetails.zzbj zzbjVar, com.google.android.gms.maps.model.LatLng latLng, java.lang.Exception exc) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(exc, "");
        zzbjVar.zzd.postValue(exc);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final java.lang.Object zzo(com.google.android.libraries.places.api.model.PhotoMetadata photoMetadata, int i, kotlin.coroutines.Continuation continuation) {
        kotlinx.coroutines.CancellableContinuationImpl cancellableContinuationImpl = new kotlinx.coroutines.CancellableContinuationImpl(kotlin.coroutines.intrinsics.IntrinsicsKt.intercepted(continuation), 1);
        cancellableContinuationImpl.initCancellability();
        kotlinx.coroutines.CancellableContinuationImpl cancellableContinuationImpl2 = cancellableContinuationImpl;
        com.google.android.libraries.places.api.net.FetchResolvedPhotoUriRequest.Builder builder = com.google.android.libraries.places.api.net.FetchResolvedPhotoUriRequest.builder(photoMetadata);
        builder.setMaxWidth(kotlin.coroutines.jvm.internal.Boxing.boxInt(i));
        builder.setMaxHeight(kotlin.coroutines.jvm.internal.Boxing.boxInt(i));
        com.google.android.libraries.places.api.net.FetchResolvedPhotoUriRequest build = builder.build();
        com.google.android.libraries.places.api.net.PlacesClient placesClient = this.zzl;
        com.google.android.gms.tasks.Task zzc = placesClient != null ? placesClient.zzc(build, com.google.android.libraries.places.internal.zzmy.PLACES_UI_KIT) : null;
        if (zzc != null) {
            final com.google.android.libraries.places.widget.internal.placedetails.zzbg zzbgVar = new com.google.android.libraries.places.widget.internal.placedetails.zzbg(cancellableContinuationImpl2);
            zzc.addOnSuccessListener(new com.google.android.gms.tasks.OnSuccessListener(zzbgVar) { // from class: com.google.android.libraries.places.widget.internal.placedetails.zzbi
                private final /* synthetic */ kotlin.jvm.functions.Function1 zza;

                @Override // com.google.android.gms.tasks.OnSuccessListener
                public final /* synthetic */ void onSuccess(java.lang.Object obj) {
                    this.zza.invoke(obj);
                }

                {
                    kotlin.jvm.internal.Intrinsics.checkNotNullParameter(zzbgVar, "");
                    this.zza = zzbgVar;
                }
            });
        }
        if (zzc != null) {
            zzc.addOnFailureListener(new com.google.android.libraries.places.widget.internal.placedetails.zzbh(cancellableContinuationImpl2));
        }
        java.lang.Object result = cancellableContinuationImpl.getResult();
        if (result == kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()) {
            kotlin.coroutines.jvm.internal.DebugProbesKt.probeCoroutineSuspended(continuation);
        }
        return result;
    }

    public final com.google.android.libraries.places.internal.zzpt zze() {
        if (this.zzk == null) {
            com.google.android.libraries.places.internal.zzps zza2 = com.google.android.libraries.places.internal.zzpr.zza();
            zza2.zzc(getApplication().getApplicationContext());
            zza2.zzb(com.google.android.libraries.places.internal.zzmy.PLACES_UI_KIT);
            this.zzk = zza2.zza();
        }
        return this.zzk;
    }

    public final void zzf(final java.lang.String str, final com.google.android.libraries.places.widget.internal.placedetails.zzbd zzbdVar) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(zzbdVar, "");
        for (int i = 0; i < 3; i++) {
            ((androidx.view.MutableLiveData) this.zzf.get(i)).postValue(com.google.android.libraries.places.widget.internal.placedetails.zzbn.zza);
        }
        com.google.android.libraries.places.internal.zzpt zze = zze();
        this.zzl = zze != null ? zze.zzc() : null;
        com.google.android.libraries.places.api.net.FetchPlaceRequest newInstance = com.google.android.libraries.places.api.net.FetchPlaceRequest.newInstance(str, zzbdVar.zzb());
        com.google.android.libraries.places.api.net.PlacesClient placesClient = this.zzl;
        com.google.android.gms.tasks.Task zzd = placesClient != null ? placesClient.zzd(newInstance, com.google.android.libraries.places.internal.zzmy.PLACES_UI_KIT) : null;
        if (zzd != null) {
            final kotlin.jvm.functions.Function1 function1 = new kotlin.jvm.functions.Function1() { // from class: com.google.android.libraries.places.widget.internal.placedetails.zzbb
                @Override // kotlin.jvm.functions.Function1
                public final /* synthetic */ java.lang.Object invoke(java.lang.Object obj) {
                    return com.google.android.libraries.places.widget.internal.placedetails.zzbj.zzl(com.google.android.libraries.places.widget.internal.placedetails.zzbj.this, zzbdVar, (com.google.android.libraries.places.api.net.FetchPlaceResponse) obj);
                }
            };
            zzd.addOnSuccessListener(new com.google.android.gms.tasks.OnSuccessListener() { // from class: com.google.android.libraries.places.widget.internal.placedetails.zzaw
                @Override // com.google.android.gms.tasks.OnSuccessListener
                public final /* synthetic */ void onSuccess(java.lang.Object obj) {
                    kotlin.jvm.functions.Function1.this.invoke(obj);
                }
            });
        }
        if (zzd != null) {
            zzd.addOnFailureListener(new com.google.android.gms.tasks.OnFailureListener() { // from class: com.google.android.libraries.places.widget.internal.placedetails.zzax
                @Override // com.google.android.gms.tasks.OnFailureListener
                public final /* synthetic */ void onFailure(java.lang.Exception exc) {
                    com.google.android.libraries.places.widget.internal.placedetails.zzbj.zzm(com.google.android.libraries.places.widget.internal.placedetails.zzbj.this, str, exc);
                }
            });
        }
    }

    public final void zzg(final com.google.android.gms.maps.model.LatLng latLng, final com.google.android.libraries.places.widget.internal.placedetails.zzbd zzbdVar) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(latLng, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(zzbdVar, "");
        for (int i = 0; i < 3; i++) {
            ((androidx.view.MutableLiveData) this.zzf.get(i)).postValue(com.google.android.libraries.places.widget.internal.placedetails.zzbn.zza);
        }
        com.google.android.libraries.places.internal.zzpt zze = zze();
        com.google.android.libraries.places.api.net.PlacesClient zzc = zze != null ? zze.zzc() : null;
        this.zzl = zzc;
        com.google.android.gms.tasks.Task zze2 = zzc != null ? zzc.zze(latLng) : null;
        if (zze2 != null) {
            final kotlin.jvm.functions.Function1 function1 = new kotlin.jvm.functions.Function1() { // from class: com.google.android.libraries.places.widget.internal.placedetails.zzay
                @Override // kotlin.jvm.functions.Function1
                public final /* synthetic */ java.lang.Object invoke(java.lang.Object obj) {
                    java.lang.String str = (java.lang.String) obj;
                    kotlin.jvm.internal.Intrinsics.checkNotNull(str);
                    com.google.android.libraries.places.widget.internal.placedetails.zzbj.this.zzf(str, zzbdVar);
                    return kotlin.Unit.INSTANCE;
                }
            };
            zze2.addOnSuccessListener(new com.google.android.gms.tasks.OnSuccessListener() { // from class: com.google.android.libraries.places.widget.internal.placedetails.zzaz
                @Override // com.google.android.gms.tasks.OnSuccessListener
                public final /* synthetic */ void onSuccess(java.lang.Object obj) {
                    kotlin.jvm.functions.Function1.this.invoke(obj);
                }
            });
        }
        if (zze2 != null) {
            zze2.addOnFailureListener(new com.google.android.gms.tasks.OnFailureListener() { // from class: com.google.android.libraries.places.widget.internal.placedetails.zzba
                @Override // com.google.android.gms.tasks.OnFailureListener
                public final /* synthetic */ void onFailure(java.lang.Exception exc) {
                    com.google.android.libraries.places.widget.internal.placedetails.zzbj.zzn(com.google.android.libraries.places.widget.internal.placedetails.zzbj.this, latLng, exc);
                }
            });
        }
    }

    public final void zzh() {
        this.zzi.postValue(kotlin.Unit.INSTANCE);
    }

    public final com.google.android.libraries.places.internal.zzpu zzi() {
        com.google.android.libraries.places.internal.zzpt zze = zze();
        if (zze != null) {
            return zze.zzd();
        }
        return null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final java.util.ArrayList zzj() {
        java.util.List<com.google.android.libraries.places.api.model.PhotoMetadata> photoMetadatas;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        com.google.android.libraries.places.api.model.Place place = (com.google.android.libraries.places.api.model.Place) this.zzb.getValue();
        if (place != null && (photoMetadatas = place.getPhotoMetadatas()) != null) {
            int size = photoMetadatas.size();
            for (int i = 0; i < size; i++) {
                com.google.android.libraries.places.api.model.PhotoMetadata photoMetadata = photoMetadatas.get(i);
                android.net.Uri zzc = photoMetadata.zzc();
                java.lang.String str = null;
                java.lang.String obj = zzc != null ? zzc.toString() : null;
                com.google.android.libraries.places.api.model.AuthorAttributions authorAttributions = photoMetadata.getAuthorAttributions();
                com.google.android.libraries.places.api.model.AuthorAttribution authorAttribution = authorAttributions != null ? authorAttributions.asList().get(0) : null;
                androidx.view.MutableLiveData mutableLiveData = (androidx.view.MutableLiveData) kotlin.collections.CollectionsKt.getOrNull(this.zzg, i);
                com.google.android.libraries.places.widget.internal.placedetails.zzbq zzbqVar = mutableLiveData != null ? (com.google.android.libraries.places.widget.internal.placedetails.zzbq) mutableLiveData.getValue() : null;
                kotlin.jvm.internal.Intrinsics.checkNotNull(zzbqVar, "");
                java.lang.String obj2 = ((com.google.android.libraries.places.widget.internal.placedetails.zzbm) zzbqVar).zza().toString();
                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(obj2, "");
                androidx.view.MutableLiveData mutableLiveData2 = (androidx.view.MutableLiveData) kotlin.collections.CollectionsKt.getOrNull(this.zzf, i);
                com.google.android.libraries.places.widget.internal.placedetails.zzbq zzbqVar2 = mutableLiveData2 != null ? (com.google.android.libraries.places.widget.internal.placedetails.zzbq) mutableLiveData2.getValue() : null;
                com.google.android.libraries.places.widget.internal.placedetails.zzbm zzbmVar = zzbqVar2 instanceof com.google.android.libraries.places.widget.internal.placedetails.zzbm ? (com.google.android.libraries.places.widget.internal.placedetails.zzbm) zzbqVar2 : null;
                java.lang.String obj3 = zzbmVar != null ? zzbmVar.zza().toString() : null;
                java.lang.String name2 = authorAttribution != null ? authorAttribution.getName() : null;
                java.lang.String photoUri = authorAttribution != null ? authorAttribution.getPhotoUri() : null;
                if (authorAttribution != null) {
                    str = authorAttribution.getUri();
                }
                arrayList.add(new com.google.android.libraries.places.widget.internal.photoviewer.zzd(obj2, obj3, obj, name2, photoUri, str));
            }
        }
        return arrayList;
    }

    public final androidx.view.MutableLiveData zzd() {
        return this.zzj;
    }

    public final java.util.List zzc() {
        return this.zzh;
    }

    public final androidx.view.LiveData zzb() {
        return this.zze;
    }

    public final androidx.view.LiveData zza() {
        return this.zzc;
    }
}
