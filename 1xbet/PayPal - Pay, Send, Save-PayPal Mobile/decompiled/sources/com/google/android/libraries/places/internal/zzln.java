package com.google.android.libraries.places.internal;

/* loaded from: classes4.dex */
public final class zzln implements com.google.android.libraries.places.internal.zzfv {
    private final com.google.android.libraries.places.internal.zznh zza;
    private final com.google.android.libraries.places.internal.zzga zzb;
    private final com.google.android.libraries.places.internal.zzgg zzc;
    private final com.google.android.libraries.places.internal.zzmo zzd;
    private final com.google.android.libraries.places.internal.zzef zze;
    private final com.google.android.libraries.places.internal.zzks zzf;
    private final com.google.android.libraries.places.internal.zzla zzg;
    private final com.google.android.libraries.places.internal.zzmp zzh;

    static final /* synthetic */ com.google.android.libraries.places.api.net.FetchPlaceResponse zzi(com.google.android.gms.tasks.Task task) {
        com.google.android.libraries.places.internal.zzkr zzkrVar = (com.google.android.libraries.places.internal.zzkr) task.getResult();
        int zza = com.google.android.libraries.places.internal.zzlu.zza(zzkrVar.status);
        if (com.google.android.libraries.places.api.net.PlacesStatusCodes.isError(zza)) {
            throw new com.google.android.gms.common.api.ApiException(new com.google.android.gms.common.api.Status(zza, com.google.android.libraries.places.internal.zzlu.zzb(zzkrVar.status, zzkrVar.errorMessage)));
        }
        com.google.android.libraries.places.internal.zzlt zzltVar = zzkrVar.result;
        java.lang.String[] strArr = zzkrVar.htmlAttributions;
        return com.google.android.libraries.places.api.net.FetchPlaceResponse.newInstance(com.google.android.libraries.places.internal.zzlq.zzf(zzltVar, strArr != null ? com.google.common.collect.ImmutableList.copyOf(strArr) : null));
    }

    static final /* synthetic */ com.google.android.libraries.places.api.net.FindCurrentPlaceResponse zzj(com.google.android.gms.tasks.Task task) {
        com.google.android.libraries.places.internal.zzkz zzkzVar = (com.google.android.libraries.places.internal.zzkz) task.getResult();
        int zza = com.google.android.libraries.places.internal.zzlu.zza(zzkzVar.status);
        if (com.google.android.libraries.places.api.net.PlacesStatusCodes.isError(zza)) {
            throw new com.google.android.gms.common.api.ApiException(new com.google.android.gms.common.api.Status(zza, com.google.android.libraries.places.internal.zzlu.zzb(zzkzVar.status, zzkzVar.errorMessage)));
        }
        java.util.ArrayList arrayList = new java.util.ArrayList();
        com.google.android.libraries.places.internal.zzls[] zzlsVarArr = zzkzVar.predictions;
        if (zzlsVarArr != null) {
            for (com.google.android.libraries.places.internal.zzls zzlsVar : zzlsVarArr) {
                if (zzlsVar.zzb() == null) {
                    throw new com.google.android.gms.common.api.ApiException(new com.google.android.gms.common.api.Status(8, "Unexpected server error: PlaceLikelihood returned without a Place value"));
                }
                java.lang.Double zza2 = zzlsVar.zza();
                if (zza2 == null) {
                    throw new com.google.android.gms.common.api.ApiException(new com.google.android.gms.common.api.Status(8, "Unexpected server error: PlaceLikelihood returned without a likelihood value"));
                }
                com.google.android.libraries.places.internal.zzlt zzb = zzlsVar.zzb();
                java.lang.String[] strArr = zzkzVar.htmlAttributions;
                arrayList.add(com.google.android.libraries.places.api.model.PlaceLikelihood.newInstance(com.google.android.libraries.places.internal.zzlq.zzf(zzb, strArr != null ? com.google.common.collect.ImmutableList.copyOf(strArr) : null), zza2.doubleValue()));
            }
        }
        return com.google.android.libraries.places.api.net.FindCurrentPlaceResponse.newInstance(arrayList);
    }

    @Override // com.google.android.libraries.places.internal.zzfv
    public final com.google.android.gms.tasks.Task zza(com.google.android.libraries.places.api.net.FindAutocompletePredictionsRequest findAutocompletePredictionsRequest, final com.google.android.libraries.places.internal.zzmy zzmyVar) {
        java.lang.String query = findAutocompletePredictionsRequest.getQuery();
        if (query == null || android.text.TextUtils.isEmpty(query.trim())) {
            return com.google.android.gms.tasks.Tasks.forResult(com.google.android.libraries.places.api.net.FindAutocompletePredictionsResponse.newInstance(com.google.common.collect.ImmutableList.of()));
        }
        com.google.android.libraries.places.internal.zzmp zzmpVar = this.zzh;
        com.google.android.libraries.places.internal.zzku zzkuVar = new com.google.android.libraries.places.internal.zzku(findAutocompletePredictionsRequest, zzmpVar.zzf(), zzmpVar.zze(), this.zza);
        com.google.android.libraries.places.internal.zzef zzefVar = this.zze;
        com.google.android.libraries.places.internal.zzga zzgaVar = this.zzb;
        final long zzb = zzefVar.zzb();
        return zzgaVar.zza(zzkuVar, com.google.android.libraries.places.internal.zzkv.class).continueWith(new com.google.android.gms.tasks.Continuation(this) { // from class: com.google.android.libraries.places.internal.zzlm
            @Override // com.google.android.gms.tasks.Continuation
            public final /* synthetic */ java.lang.Object then(com.google.android.gms.tasks.Task task) {
                return com.google.android.libraries.places.internal.zzkw.zza((com.google.android.libraries.places.internal.zzkv) task.getResult());
            }
        }).continueWith(new com.google.android.gms.tasks.Continuation() { // from class: com.google.android.libraries.places.internal.zzlf
            @Override // com.google.android.gms.tasks.Continuation
            public final /* synthetic */ java.lang.Object then(com.google.android.gms.tasks.Task task) {
                return com.google.android.libraries.places.internal.zzln.this.zze(zzb, zzmyVar, task);
            }
        });
    }

    @Override // com.google.android.libraries.places.internal.zzfv
    public final com.google.android.gms.tasks.Task zzb(com.google.android.libraries.places.api.net.FetchPhotoRequest fetchPhotoRequest, final com.google.android.libraries.places.internal.zzmy zzmyVar) {
        java.lang.Integer maxWidth = fetchPhotoRequest.getMaxWidth();
        java.lang.Integer maxHeight = fetchPhotoRequest.getMaxHeight();
        if (maxWidth == null && maxHeight == null) {
            return com.google.android.gms.tasks.Tasks.forException(new com.google.android.gms.common.api.ApiException(new com.google.android.gms.common.api.Status(com.google.android.libraries.places.api.net.PlacesStatusCodes.INVALID_REQUEST, "Must include max width or max height in request.")));
        }
        if (maxWidth != null && maxWidth.intValue() <= 0) {
            return com.google.android.gms.tasks.Tasks.forException(new com.google.android.gms.common.api.ApiException(new com.google.android.gms.common.api.Status(com.google.android.libraries.places.api.net.PlacesStatusCodes.INVALID_REQUEST, java.lang.String.format("Max Width must not be < 1, but was: %d.", maxWidth))));
        }
        if (maxHeight != null && maxHeight.intValue() <= 0) {
            return com.google.android.gms.tasks.Tasks.forException(new com.google.android.gms.common.api.ApiException(new com.google.android.gms.common.api.Status(com.google.android.libraries.places.api.net.PlacesStatusCodes.INVALID_REQUEST, java.lang.String.format("Max Height must not be < 1, but was: %d.", maxHeight))));
        }
        com.google.android.libraries.places.internal.zzmp zzmpVar = this.zzh;
        com.google.android.libraries.places.internal.zzkl zzklVar = new com.google.android.libraries.places.internal.zzkl(fetchPhotoRequest, zzmpVar.zze(), this.zza);
        com.google.android.libraries.places.internal.zzef zzefVar = this.zze;
        com.google.android.libraries.places.internal.zzgg zzggVar = this.zzc;
        final long zzb = zzefVar.zzb();
        return zzggVar.zzb(zzklVar, new com.google.android.libraries.places.internal.zzkm()).continueWith(new com.google.android.gms.tasks.Continuation(this) { // from class: com.google.android.libraries.places.internal.zzlg
            @Override // com.google.android.gms.tasks.Continuation
            public final /* synthetic */ java.lang.Object then(com.google.android.gms.tasks.Task task) {
                return com.google.android.libraries.places.api.net.FetchPhotoResponse.newInstance(((com.google.android.libraries.places.internal.zzkn) task.getResult()).zza);
            }
        }).continueWith(new com.google.android.gms.tasks.Continuation() { // from class: com.google.android.libraries.places.internal.zzlh
            @Override // com.google.android.gms.tasks.Continuation
            public final /* synthetic */ java.lang.Object then(com.google.android.gms.tasks.Task task) {
                return com.google.android.libraries.places.internal.zzln.this.zzf(zzb, zzmyVar, task);
            }
        });
    }

    @Override // com.google.android.libraries.places.internal.zzfv
    public final com.google.android.gms.tasks.Task zzc(com.google.android.libraries.places.api.net.FetchPlaceRequest fetchPlaceRequest, final com.google.android.libraries.places.internal.zzmy zzmyVar) {
        if (android.text.TextUtils.isEmpty(fetchPlaceRequest.getPlaceId())) {
            return com.google.android.gms.tasks.Tasks.forException(new com.google.android.gms.common.api.ApiException(new com.google.android.gms.common.api.Status(com.google.android.libraries.places.api.net.PlacesStatusCodes.INVALID_REQUEST, "Place ID must not be empty.")));
        }
        if (fetchPlaceRequest.getPlaceFields().isEmpty()) {
            return com.google.android.gms.tasks.Tasks.forException(new com.google.android.gms.common.api.ApiException(new com.google.android.gms.common.api.Status(com.google.android.libraries.places.api.net.PlacesStatusCodes.INVALID_REQUEST, "Place Fields must not be empty.")));
        }
        com.google.android.libraries.places.internal.zzmp zzmpVar = this.zzh;
        com.google.android.libraries.places.internal.zzkq zzkqVar = new com.google.android.libraries.places.internal.zzkq(fetchPlaceRequest, zzmpVar.zzf(), zzmpVar.zze(), this.zza);
        com.google.android.libraries.places.internal.zzef zzefVar = this.zze;
        com.google.android.libraries.places.internal.zzga zzgaVar = this.zzb;
        final long zzb = zzefVar.zzb();
        return zzgaVar.zza(zzkqVar, com.google.android.libraries.places.internal.zzkr.class).continueWith(new com.google.android.gms.tasks.Continuation() { // from class: com.google.android.libraries.places.internal.zzli
            @Override // com.google.android.gms.tasks.Continuation
            public final /* synthetic */ java.lang.Object then(com.google.android.gms.tasks.Task task) {
                return com.google.android.libraries.places.internal.zzln.zzi(task);
            }
        }).continueWith(new com.google.android.gms.tasks.Continuation() { // from class: com.google.android.libraries.places.internal.zzlj
            @Override // com.google.android.gms.tasks.Continuation
            public final /* synthetic */ java.lang.Object then(com.google.android.gms.tasks.Task task) {
                return com.google.android.libraries.places.internal.zzln.this.zzg(zzb, zzmyVar, task);
            }
        });
    }

    @Override // com.google.android.libraries.places.internal.zzfv
    public final com.google.android.gms.tasks.Task zzd(com.google.android.libraries.places.api.net.FindCurrentPlaceRequest findCurrentPlaceRequest, android.location.Location location, com.google.common.collect.ImmutableList immutableList, final com.google.android.libraries.places.internal.zzmy zzmyVar) {
        if (findCurrentPlaceRequest.getPlaceFields().isEmpty()) {
            return com.google.android.gms.tasks.Tasks.forException(new com.google.android.gms.common.api.ApiException(new com.google.android.gms.common.api.Status(com.google.android.libraries.places.api.net.PlacesStatusCodes.INVALID_REQUEST, "Place Fields must not be empty.")));
        }
        com.google.android.libraries.places.internal.zzmp zzmpVar = this.zzh;
        com.google.android.libraries.places.internal.zzky zzkyVar = new com.google.android.libraries.places.internal.zzky(findCurrentPlaceRequest, location, immutableList, zzmpVar.zzf(), zzmpVar.zze(), this.zza);
        com.google.android.libraries.places.internal.zzef zzefVar = this.zze;
        com.google.android.libraries.places.internal.zzga zzgaVar = this.zzb;
        final long zzb = zzefVar.zzb();
        return zzgaVar.zza(zzkyVar, com.google.android.libraries.places.internal.zzkz.class).continueWith(new com.google.android.gms.tasks.Continuation() { // from class: com.google.android.libraries.places.internal.zzlk
            @Override // com.google.android.gms.tasks.Continuation
            public final /* synthetic */ java.lang.Object then(com.google.android.gms.tasks.Task task) {
                return com.google.android.libraries.places.internal.zzln.zzj(task);
            }
        }).continueWith(new com.google.android.gms.tasks.Continuation() { // from class: com.google.android.libraries.places.internal.zzll
            @Override // com.google.android.gms.tasks.Continuation
            public final /* synthetic */ java.lang.Object then(com.google.android.gms.tasks.Task task) {
                return com.google.android.libraries.places.internal.zzln.this.zzh(zzb, zzmyVar, task);
            }
        });
    }

    final /* synthetic */ com.google.android.libraries.places.api.net.FindAutocompletePredictionsResponse zze(long j, com.google.android.libraries.places.internal.zzmy zzmyVar, com.google.android.gms.tasks.Task task) {
        this.zzd.zzl(task, j, this.zze.zzb(), 2, zzmyVar, com.google.android.libraries.places.api.auth.zzb.zza);
        return (com.google.android.libraries.places.api.net.FindAutocompletePredictionsResponse) task.getResult();
    }

    final /* synthetic */ com.google.android.libraries.places.api.net.FetchPhotoResponse zzf(long j, com.google.android.libraries.places.internal.zzmy zzmyVar, com.google.android.gms.tasks.Task task) {
        this.zzd.zzd(task, j, this.zze.zzb(), zzmyVar);
        return (com.google.android.libraries.places.api.net.FetchPhotoResponse) task.getResult();
    }

    final /* synthetic */ com.google.android.libraries.places.api.net.FetchPlaceResponse zzg(long j, com.google.android.libraries.places.internal.zzmy zzmyVar, com.google.android.gms.tasks.Task task) {
        this.zzd.zzn(task, j, this.zze.zzb(), 2, zzmyVar, com.google.android.libraries.places.api.auth.zzb.zza);
        return (com.google.android.libraries.places.api.net.FetchPlaceResponse) task.getResult();
    }

    final /* synthetic */ com.google.android.libraries.places.api.net.FindCurrentPlaceResponse zzh(long j, com.google.android.libraries.places.internal.zzmy zzmyVar, com.google.android.gms.tasks.Task task) {
        this.zzd.zzb(task, j, this.zze.zzb(), zzmyVar);
        return (com.google.android.libraries.places.api.net.FindCurrentPlaceResponse) task.getResult();
    }

    zzln(com.google.android.libraries.places.internal.zzmp zzmpVar, com.google.android.libraries.places.internal.zznh zznhVar, com.google.android.libraries.places.internal.zzga zzgaVar, com.google.android.libraries.places.internal.zzgg zzggVar, com.google.android.libraries.places.internal.zzmo zzmoVar, com.google.android.libraries.places.internal.zzef zzefVar, com.google.android.libraries.places.internal.zzko zzkoVar, com.google.android.libraries.places.internal.zzks zzksVar, com.google.android.libraries.places.internal.zzkw zzkwVar, com.google.android.libraries.places.internal.zzla zzlaVar) {
        this.zzh = zzmpVar;
        this.zza = zznhVar;
        this.zzb = zzgaVar;
        this.zzc = zzggVar;
        this.zzd = zzmoVar;
        this.zze = zzefVar;
        this.zzf = zzksVar;
        this.zzg = zzlaVar;
    }
}
