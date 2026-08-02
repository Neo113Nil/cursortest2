package com.google.android.libraries.places.internal;

/* loaded from: classes8.dex */
public final class zzod implements com.google.android.libraries.places.internal.zznx {
    public static final /* synthetic */ int zza = 0;
    private static final com.google.common.collect.ImmutableList zzb = com.google.common.collect.ImmutableList.of(com.google.android.libraries.places.api.model.Place.Field.ID, com.google.android.libraries.places.api.model.Place.Field.TYPES);
    private final com.google.android.libraries.places.api.net.PlacesClient zzc;
    private final com.google.android.libraries.places.internal.zznq zzd;
    private final com.google.android.libraries.places.api.model.AutocompleteSessionToken zze;
    private final com.google.android.libraries.places.internal.zzmy zzf;
    private com.google.android.libraries.places.internal.zzoa zzg;
    private com.google.android.libraries.places.internal.zzob zzh;

    @Override // com.google.android.libraries.places.internal.zznx
    public final com.google.android.gms.tasks.Task zza(java.lang.String str, int i) {
        com.google.common.base.Preconditions.checkArgument(!android.text.TextUtils.isEmpty(str));
        com.google.android.libraries.places.internal.zzoa zzoaVar = this.zzg;
        if (zzoaVar != null) {
            if (zzoaVar.zzb().equals(str)) {
                return (com.google.android.gms.tasks.Task) com.google.common.base.Preconditions.checkNotNull(zzoaVar.zzc());
            }
            zzoaVar.zza().cancel();
        }
        final com.google.android.libraries.places.internal.zznv zznvVar = new com.google.android.libraries.places.internal.zznv(new com.google.android.gms.tasks.CancellationTokenSource(), str);
        this.zzg = zznvVar;
        com.google.android.libraries.places.api.net.PlacesClient placesClient = this.zzc;
        com.google.android.libraries.places.api.net.FindAutocompletePredictionsRequest.Builder builder = com.google.android.libraries.places.api.net.FindAutocompletePredictionsRequest.builder();
        builder.setQuery(str);
        com.google.android.libraries.places.internal.zznq zznqVar = this.zzd;
        builder.setLocationBias(zznqVar.zzh());
        builder.setLocationRestriction(zznqVar.zzi());
        builder.setCountries(zznqVar.zzj());
        builder.setRegionCode(zznqVar.zzn());
        builder.setInputOffset(java.lang.Integer.valueOf(i));
        builder.setTypesFilter(zznqVar.zzk());
        builder.setSessionToken(this.zze);
        builder.setCancellationToken(zznvVar.zza().getToken());
        builder.setOrigin(zznqVar.zze());
        builder.setPureServiceAreaBusinessesIncluded(zznqVar.zzp());
        com.google.android.gms.tasks.Task continueWithTask = placesClient.zza(builder.build(), this.zzf).continueWithTask(new com.google.android.gms.tasks.Continuation() { // from class: com.google.android.libraries.places.internal.zznz
            @Override // com.google.android.gms.tasks.Continuation
            public final /* synthetic */ java.lang.Object then(com.google.android.gms.tasks.Task task) {
                return com.google.android.libraries.places.internal.zzoa.this.zza().getToken().isCancellationRequested() ? com.google.android.gms.tasks.Tasks.forCanceled() : task;
            }
        });
        zznvVar.zzd(continueWithTask);
        return continueWithTask;
    }

    @Override // com.google.android.libraries.places.internal.zznx
    public final com.google.android.gms.tasks.Task zzb(com.google.android.libraries.places.api.model.AutocompletePrediction autocompletePrediction) {
        com.google.common.collect.ImmutableList immutableList = zzb;
        com.google.android.libraries.places.internal.zznq zznqVar = this.zzd;
        if (immutableList.containsAll(zznqVar.zzc())) {
            com.google.android.libraries.places.api.model.Place.Builder builder = com.google.android.libraries.places.api.model.Place.builder();
            builder.setId(autocompletePrediction.getPlaceId());
            builder.setPlaceTypes(autocompletePrediction.getTypes().isEmpty() ? null : autocompletePrediction.getTypes());
            return com.google.android.gms.tasks.Tasks.forResult(com.google.android.libraries.places.api.net.FetchPlaceResponse.newInstance(builder.build()));
        }
        com.google.android.libraries.places.internal.zzob zzobVar = this.zzh;
        if (zzobVar != null) {
            if (zzobVar.zzb().equals(autocompletePrediction.getPlaceId())) {
                return (com.google.android.gms.tasks.Task) com.google.common.base.Preconditions.checkNotNull(zzobVar.zzc());
            }
            zzobVar.zza().cancel();
        }
        final com.google.android.libraries.places.internal.zznw zznwVar = new com.google.android.libraries.places.internal.zznw(new com.google.android.gms.tasks.CancellationTokenSource(), autocompletePrediction.getPlaceId());
        this.zzh = zznwVar;
        com.google.android.libraries.places.api.net.PlacesClient placesClient = this.zzc;
        com.google.android.libraries.places.api.net.FetchPlaceRequest.Builder builder2 = com.google.android.libraries.places.api.net.FetchPlaceRequest.builder(autocompletePrediction.getPlaceId(), zznqVar.zzc());
        builder2.setSessionToken(this.zze);
        builder2.setCancellationToken(zznwVar.zza().getToken());
        com.google.android.gms.tasks.Task continueWithTask = placesClient.zzd(builder2.build(), com.google.android.libraries.places.internal.zzmy.AUTOCOMPLETE_WIDGET).continueWithTask(new com.google.android.gms.tasks.Continuation() { // from class: com.google.android.libraries.places.internal.zzny
            @Override // com.google.android.gms.tasks.Continuation
            public final /* synthetic */ java.lang.Object then(com.google.android.gms.tasks.Task task) {
                return com.google.android.libraries.places.internal.zzob.this.zza().getToken().isCancellationRequested() ? com.google.android.gms.tasks.Tasks.forCanceled() : task;
            }
        });
        zznwVar.zzd(continueWithTask);
        return continueWithTask;
    }

    @Override // com.google.android.libraries.places.internal.zznx
    public final void zzc() {
        com.google.android.libraries.places.internal.zzoa zzoaVar = this.zzg;
        if (zzoaVar != null) {
            zzoaVar.zza().cancel();
        }
        com.google.android.libraries.places.internal.zzob zzobVar = this.zzh;
        if (zzobVar != null) {
            zzobVar.zza().cancel();
        }
        this.zzg = null;
        this.zzh = null;
    }

    @Override // com.google.android.libraries.places.internal.zznx
    public final void zzd() {
        this.zzc.zzk();
    }

    @Override // com.google.android.libraries.places.internal.zznx
    public final void zze() {
        this.zzc.zzl();
    }

    @Override // com.google.android.libraries.places.internal.zznx
    public final com.google.android.libraries.places.internal.zzmy zzf() {
        return this.zzf;
    }

    public zzod(com.google.android.libraries.places.api.net.PlacesClient placesClient, com.google.android.libraries.places.internal.zznq zznqVar, com.google.android.libraries.places.api.model.AutocompleteSessionToken autocompleteSessionToken, com.google.android.libraries.places.internal.zzmy zzmyVar) {
        this.zzc = placesClient;
        this.zzd = zznqVar;
        this.zze = autocompleteSessionToken;
        this.zzf = zzmyVar;
    }
}
