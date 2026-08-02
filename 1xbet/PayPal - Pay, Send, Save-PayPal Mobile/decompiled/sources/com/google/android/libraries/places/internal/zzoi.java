package com.google.android.libraries.places.internal;

/* loaded from: classes8.dex */
public final class zzoi extends androidx.view.ViewModel {
    private final com.google.android.libraries.places.internal.zznx zza;
    private final com.google.android.libraries.places.internal.zzom zzb;
    private final com.google.android.libraries.places.internal.zzpu zzc;
    private java.lang.Runnable zze;
    private final android.os.Handler zzd = new android.os.Handler(android.os.Looper.getMainLooper());
    private final androidx.view.MutableLiveData zzf = new androidx.view.MutableLiveData();

    /* synthetic */ zzoi(com.google.android.libraries.places.internal.zznx zznxVar, com.google.android.libraries.places.internal.zzom zzomVar, com.google.android.libraries.places.internal.zzpu zzpuVar, byte[] bArr) {
        this.zza = zznxVar;
        this.zzb = zzomVar;
        this.zzc = zzpuVar;
    }

    private final void zzp(com.google.android.libraries.places.internal.zzns zznsVar) {
        androidx.view.MutableLiveData mutableLiveData = this.zzf;
        if (zznsVar.equals(mutableLiveData.getValue())) {
            return;
        }
        mutableLiveData.setValue(zznsVar);
    }

    private static com.google.android.gms.common.api.Status zzq(java.lang.Exception exc) {
        return exc instanceof com.google.android.gms.common.api.ApiException ? ((com.google.android.gms.common.api.ApiException) exc).getStatus() : new com.google.android.gms.common.api.Status(13, exc.getMessage());
    }

    private static boolean zzr(com.google.android.gms.common.api.Status status) {
        return status.isCanceled() || status.getStatusCode() == 9012 || status.getStatusCode() == 9011;
    }

    @Override // androidx.view.ViewModel
    public final void onCleared() {
        try {
            this.zza.zzc();
            this.zzd.removeCallbacks(this.zze);
            com.google.android.libraries.places.internal.zzom zzomVar = this.zzb;
            zzomVar.zzw();
            this.zzc.zza(zzomVar);
        } catch (java.lang.Error | java.lang.RuntimeException e) {
            com.google.android.libraries.places.internal.zznb.zzb(e);
            throw e;
        }
    }

    public final void zzb(android.os.Bundle bundle) {
        if (bundle == null) {
            this.zzf.setValue(com.google.android.libraries.places.internal.zzns.zzh());
        }
    }

    public final void zzc(final java.lang.String str, final int i) {
        this.zzb.zzC(str);
        java.lang.Runnable runnable = this.zze;
        if (runnable != null) {
            this.zzd.removeCallbacks(runnable);
        }
        if (str.isEmpty()) {
            this.zza.zzc();
            zzp(com.google.android.libraries.places.internal.zzns.zzi());
        } else {
            java.lang.Runnable runnable2 = new java.lang.Runnable() { // from class: com.google.android.libraries.places.internal.zzog
                @Override // java.lang.Runnable
                public final /* synthetic */ void run() {
                    com.google.android.libraries.places.internal.zzoi.this.zzm(str, i);
                }
            };
            this.zze = runnable2;
            this.zzd.postDelayed(runnable2, 100L);
            zzp(com.google.android.libraries.places.internal.zzns.zzj());
        }
    }

    public final void zzd(final com.google.android.libraries.places.api.model.AutocompletePrediction autocompletePrediction, int i) {
        com.google.android.libraries.places.internal.zzom zzomVar = this.zzb;
        zzomVar.zzu(i);
        com.google.android.libraries.places.internal.zznx zznxVar = this.zza;
        if (zznxVar.zzf() == com.google.android.libraries.places.internal.zzmy.PLACES_UI_KIT) {
            com.google.android.libraries.places.api.model.Place.Builder builder = com.google.android.libraries.places.api.model.Place.builder();
            builder.setId(autocompletePrediction.getPlaceId());
            com.google.android.libraries.places.api.model.Place build = builder.build();
            zzomVar.zzA();
            zzp(com.google.android.libraries.places.internal.zzns.zzo(build));
            return;
        }
        if (zznxVar.zzf() == com.google.android.libraries.places.internal.zzmy.ONE_PLATFORM_AUTOCOMPLETE_WIDGET) {
            zzomVar.zzA();
            zzp(com.google.android.libraries.places.internal.zzns.zzp(autocompletePrediction, zzomVar.zzg()));
        } else {
            com.google.android.gms.tasks.Task zzb = zznxVar.zzb(autocompletePrediction);
            if (!zzb.isComplete()) {
                zzp(com.google.android.libraries.places.internal.zzns.zzj());
            }
            zzb.addOnCompleteListener(new com.google.android.gms.tasks.OnCompleteListener() { // from class: com.google.android.libraries.places.internal.zzof
                @Override // com.google.android.gms.tasks.OnCompleteListener
                public final /* synthetic */ void onComplete(com.google.android.gms.tasks.Task task) {
                    com.google.android.libraries.places.internal.zzoi.this.zzo(autocompletePrediction, task);
                }
            });
        }
    }

    public final void zze() {
        this.zzb.zzE();
    }

    public final void zzf() {
        this.zzb.zzD();
        zzc("", 0);
    }

    public final void zzg(java.lang.String str, int i) {
        this.zza.zzc();
        zzc(str, i);
        zzp(com.google.android.libraries.places.internal.zzns.zzk());
    }

    public final void zzh() {
        this.zzb.zzF();
    }

    public final void zzi() {
        this.zzb.zzG();
    }

    public final void zzj() {
        this.zzb.zzv();
        zzp(com.google.android.libraries.places.internal.zzns.zzr());
    }

    public final void zzk() {
        this.zza.zzd();
    }

    public final void zzl() {
        this.zza.zze();
    }

    final /* synthetic */ void zzm(final java.lang.String str, int i) {
        this.zza.zza(str, i).addOnCompleteListener(new com.google.android.gms.tasks.OnCompleteListener() { // from class: com.google.android.libraries.places.internal.zzoe
            @Override // com.google.android.gms.tasks.OnCompleteListener
            public final /* synthetic */ void onComplete(com.google.android.gms.tasks.Task task) {
                com.google.android.libraries.places.internal.zzoi.this.zzn(str, task);
            }
        });
    }

    final /* synthetic */ void zzn(java.lang.String str, com.google.android.gms.tasks.Task task) {
        if (task.isCanceled()) {
            return;
        }
        java.lang.Exception exception = task.getException();
        if (exception == null) {
            this.zzb.zzx();
            java.util.List<com.google.android.libraries.places.api.model.AutocompletePrediction> autocompletePredictions = ((com.google.android.libraries.places.api.net.FindAutocompletePredictionsResponse) task.getResult()).getAutocompletePredictions();
            if (autocompletePredictions.isEmpty()) {
                zzp(com.google.android.libraries.places.internal.zzns.zzm(str));
                return;
            } else {
                zzp(com.google.android.libraries.places.internal.zzns.zzl(autocompletePredictions));
                return;
            }
        }
        java.lang.String message = exception.getMessage();
        if (message != null && message.contains("Too many concurrent requests")) {
            this.zzb.zzz();
            return;
        }
        this.zzb.zzy();
        com.google.android.gms.common.api.Status zzq = zzq(exception);
        if (zzr(zzq)) {
            zzp(com.google.android.libraries.places.internal.zzns.zzs(zzq));
        } else {
            zzp(com.google.android.libraries.places.internal.zzns.zzn(str, zzq));
        }
    }

    final /* synthetic */ void zzo(com.google.android.libraries.places.api.model.AutocompletePrediction autocompletePrediction, com.google.android.gms.tasks.Task task) {
        if (task.isCanceled()) {
            return;
        }
        java.lang.Exception exception = task.getException();
        if (exception == null) {
            this.zzb.zzA();
            zzp(com.google.android.libraries.places.internal.zzns.zzo(((com.google.android.libraries.places.api.net.FetchPlaceResponse) task.getResult()).getPlace()));
            return;
        }
        this.zzb.zzB();
        com.google.android.gms.common.api.Status zzq = zzq(exception);
        if (zzr(zzq)) {
            zzp(com.google.android.libraries.places.internal.zzns.zzs(zzq));
        } else {
            zzp(com.google.android.libraries.places.internal.zzns.zzq(autocompletePrediction, zzq));
        }
    }

    public final androidx.view.LiveData zza() {
        return this.zzf;
    }
}
