package com.google.android.libraries.places.internal;

/* loaded from: classes4.dex */
public final class zzja {
    private final com.google.android.libraries.places.internal.zzbak zza;
    private final com.google.android.libraries.places.internal.zzblw zzb;
    private final com.google.android.libraries.places.internal.zzjc zzc;
    private final com.google.android.libraries.places.internal.zzmo zzd;
    private final com.google.android.libraries.places.internal.zzef zze;
    private final com.google.android.libraries.places.internal.zzkd zzf;
    private final com.google.android.libraries.places.internal.zzkf zzg;
    private final com.google.android.libraries.places.internal.zzji zzh;
    private final com.google.android.libraries.places.internal.zzjp zzi;
    private final com.google.android.libraries.places.internal.zzjw zzj;
    private final com.google.android.libraries.places.internal.zzbiy zzk;
    private final com.google.android.libraries.places.internal.zzhw zzl;
    private final com.google.android.libraries.places.internal.zzmp zzm;

    zzja(com.google.android.libraries.places.internal.zzmp zzmpVar, com.google.android.libraries.places.internal.zzblw zzblwVar, com.google.android.libraries.places.internal.zzmo zzmoVar, com.google.android.libraries.places.internal.zzef zzefVar, com.google.android.libraries.places.internal.zzkf zzkfVar, com.google.android.libraries.places.internal.zzkd zzkdVar, com.google.android.libraries.places.internal.zzib zzibVar, com.google.android.libraries.places.internal.zzhy zzhyVar, com.google.android.libraries.places.internal.zzho zzhoVar, com.google.android.libraries.places.internal.zzji zzjiVar, com.google.android.libraries.places.internal.zzka zzkaVar, com.google.android.libraries.places.internal.zzkh zzkhVar, com.google.android.libraries.places.internal.zzjc zzjcVar, com.google.android.libraries.places.internal.zzjp zzjpVar, com.google.android.libraries.places.internal.zzjw zzjwVar, com.google.android.libraries.places.internal.zzbiy zzbiyVar, com.google.android.libraries.places.internal.zzhw zzhwVar) {
        this.zzm = zzmpVar;
        this.zzb = zzblwVar;
        this.zza = com.google.android.libraries.places.internal.zzbal.zzf(zzblwVar);
        this.zzc = zzjcVar;
        this.zzd = zzmoVar;
        this.zze = zzefVar;
        this.zzg = zzkfVar;
        this.zzf = zzkdVar;
        this.zzh = zzjiVar;
        this.zzi = zzjpVar;
        this.zzj = zzjwVar;
        this.zzk = zzbiyVar;
        this.zzl = zzhwVar;
    }

    private final com.google.common.util.concurrent.ListenableFuture zzx() {
        com.google.android.libraries.places.api.auth.PlacesAppCheckTokenProvider zzh = this.zzm.zzh();
        if (zzh == null) {
            return com.google.common.util.concurrent.Futures.immediateFuture(com.google.android.libraries.places.api.auth.zzb.zza);
        }
        com.google.common.util.concurrent.SettableFuture create = com.google.common.util.concurrent.SettableFuture.create();
        com.google.common.util.concurrent.Futures.addCallback(zzh.fetchAppCheckToken(), new com.google.android.libraries.places.internal.zzie(this, create), com.google.common.util.concurrent.MoreExecutors.directExecutor());
        return create;
    }

    private final com.google.android.libraries.places.internal.zzbak zzy(com.google.android.libraries.places.internal.zzmy zzmyVar, java.lang.String str, com.google.android.libraries.places.api.auth.zzb zzbVar, com.google.android.libraries.places.internal.zzbgs zzbgsVar) throws java.lang.InterruptedException, java.util.concurrent.ExecutionException {
        com.google.android.libraries.places.internal.zzbiy[] zzbiyVarArr = new com.google.android.libraries.places.internal.zzbiy[4];
        zzbiyVarArr[0] = com.google.android.libraries.places.internal.zzcei.zza(zzmyVar == com.google.android.libraries.places.internal.zzmy.PLACES_UI_KIT ? this.zzc.zzb(zzz((com.google.android.libraries.places.internal.zzbgs) com.google.common.base.Preconditions.checkNotNull(zzbgsVar)), str) : this.zzc.zza(this.zzm.zze(), str));
        zzbiyVarArr[1] = com.google.android.libraries.places.internal.zzey.zza(zzbVar.zzb());
        com.google.common.collect.ImmutableList of = com.google.common.collect.ImmutableList.of(com.google.android.libraries.places.internal.zzer.zza);
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(of, "");
        com.google.android.libraries.places.internal.zzava zzc = com.google.android.libraries.places.internal.zzavl.zzc();
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(zzc, "");
        java.util.Iterator<E> it = of.iterator();
        while (it.hasNext()) {
            if (((com.google.android.libraries.places.internal.zzer) it.next()).ordinal() != 0) {
                throw new kotlin.NoWhenBranchMatchedException();
            }
            java.util.List zza = zzc.zza();
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(zza, "");
            com.google.android.libraries.places.internal.zzbgm zzbgmVar = new com.google.android.libraries.places.internal.zzbgm(zza);
            java.util.Set zzb = com.google.android.libraries.places.internal.zzeo.zzb();
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(zzb, "");
            java.util.Set set = zzb;
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(zzbgmVar, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(set, "");
            zzc.zzb(set);
        }
        com.google.android.libraries.places.internal.zzbak zzbakVar = this.zza;
        com.google.android.libraries.places.internal.zzbdq zzG = zzc.zzG();
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(zzG, "");
        com.google.android.libraries.places.internal.zzbmg zzbmgVar = new com.google.android.libraries.places.internal.zzbmg();
        zzbmgVar.zzc(com.google.android.libraries.places.internal.zzbmc.zzc("x-goog-gmp-client-signals", com.google.android.libraries.places.internal.zzbmg.zza), java.util.Base64.getEncoder().encodeToString(((com.google.android.libraries.places.internal.zzavl) zzG).zzbl()));
        zzbiyVarArr[2] = com.google.android.libraries.places.internal.zzcei.zza(zzbmgVar);
        zzbiyVarArr[3] = this.zzk;
        return (com.google.android.libraries.places.internal.zzbak) zzbakVar.zze(zzbiyVarArr);
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final java.lang.String zzz(com.google.android.libraries.places.internal.zzbgs zzbgsVar) throws java.lang.InterruptedException, java.util.concurrent.ExecutionException {
        return zzbgsVar == com.google.android.libraries.places.internal.zzbgs.PLACE_AUTOCOMPLETE ? (java.lang.String) this.zzj.zzb(zzbgsVar).get() : (java.lang.String) this.zzj.zza(zzbgsVar).get();
    }

    public final com.google.android.gms.tasks.Task zza(final com.google.android.libraries.places.api.net.SearchByTextRequest searchByTextRequest, final com.google.android.libraries.places.internal.zzmy zzmyVar) {
        java.util.List<com.google.android.libraries.places.api.model.Place.Field> placeFields = searchByTextRequest.getPlaceFields();
        if (placeFields.isEmpty()) {
            return com.google.android.gms.tasks.Tasks.forException(new com.google.android.gms.common.api.ApiException(new com.google.android.gms.common.api.Status(com.google.android.libraries.places.api.net.PlacesStatusCodes.INVALID_REQUEST, "Place fields must not be empty.")));
        }
        if (searchByTextRequest.getTextQuery().isEmpty()) {
            return com.google.android.gms.tasks.Tasks.forException(new com.google.android.gms.common.api.ApiException(new com.google.android.gms.common.api.Status(com.google.android.libraries.places.api.net.PlacesStatusCodes.INVALID_REQUEST, "Text query must not be an empty string.")));
        }
        java.lang.String includedType = searchByTextRequest.getIncludedType();
        if (includedType != null && includedType.isEmpty()) {
            return com.google.android.gms.tasks.Tasks.forException(new com.google.android.gms.common.api.ApiException(new com.google.android.gms.common.api.Status(com.google.android.libraries.places.api.net.PlacesStatusCodes.INVALID_REQUEST, "Included type must not be an empty string.")));
        }
        java.lang.String regionCode = searchByTextRequest.getRegionCode();
        if (regionCode != null && regionCode.isEmpty()) {
            return com.google.android.gms.tasks.Tasks.forException(new com.google.android.gms.common.api.ApiException(new com.google.android.gms.common.api.Status(com.google.android.libraries.places.api.net.PlacesStatusCodes.INVALID_REQUEST, "Region code must not be an empty string.")));
        }
        final long zzb = this.zze.zzb();
        java.util.ArrayList arrayList = new java.util.ArrayList();
        if (searchByTextRequest.isRoutingSummariesIncluded()) {
            arrayList.add(com.google.android.libraries.places.internal.zzht.ROUTING_SUMMARIES);
        }
        if (searchByTextRequest.isSearchUriIncluded()) {
            arrayList.add(com.google.android.libraries.places.internal.zzht.SEARCH_URI);
        }
        arrayList.add(com.google.android.libraries.places.internal.zzht.NEXT_PAGE_TOKEN);
        final java.lang.String zza = com.google.android.libraries.places.internal.zzhu.zza(com.google.android.libraries.places.internal.zzjl.zza(placeFields), arrayList);
        final com.google.common.util.concurrent.ListenableFuture zzx = zzx();
        final com.google.common.util.concurrent.ListenableFuture transformAsync = com.google.common.util.concurrent.Futures.transformAsync(zzx, new com.google.common.util.concurrent.AsyncFunction() { // from class: com.google.android.libraries.places.internal.zziz
            @Override // com.google.common.util.concurrent.AsyncFunction
            public final /* synthetic */ com.google.common.util.concurrent.ListenableFuture apply(java.lang.Object obj) {
                return com.google.android.libraries.places.internal.zzja.this.zzj(zzmyVar, zza, searchByTextRequest, (com.google.android.libraries.places.api.auth.zzb) obj);
            }
        }, com.google.common.util.concurrent.MoreExecutors.directExecutor());
        com.google.android.gms.tasks.CancellationToken cancellationToken = searchByTextRequest.getCancellationToken();
        if (cancellationToken != null) {
            cancellationToken.onCanceledRequested(new com.google.android.gms.tasks.OnTokenCanceledListener() { // from class: com.google.android.libraries.places.internal.zzir
                @Override // com.google.android.gms.tasks.OnTokenCanceledListener
                public final /* synthetic */ void onCanceled() {
                    com.google.common.util.concurrent.ListenableFuture.this.cancel(true);
                }
            });
        }
        return com.google.android.libraries.places.internal.zzen.zza(transformAsync).onSuccessTask(new com.google.android.gms.tasks.SuccessContinuation() { // from class: com.google.android.libraries.places.internal.zzif
            @Override // com.google.android.gms.tasks.SuccessContinuation
            public final /* synthetic */ com.google.android.gms.tasks.Task then(java.lang.Object obj) {
                return com.google.android.libraries.places.internal.zzja.this.zzk(searchByTextRequest, (com.google.android.libraries.places.internal.zzbbw) obj);
            }
        }).continueWithTask(new com.google.android.gms.tasks.Continuation() { // from class: com.google.android.libraries.places.internal.zziq
            @Override // com.google.android.gms.tasks.Continuation
            public final /* synthetic */ java.lang.Object then(com.google.android.gms.tasks.Task task) {
                com.google.android.libraries.places.internal.zzja.this.zzl(searchByTextRequest, zzb, zzmyVar, zzx, task);
                return task;
            }
        });
    }

    public final com.google.android.gms.tasks.Task zzb(final com.google.android.libraries.places.api.net.FindAutocompletePredictionsRequest findAutocompletePredictionsRequest, final com.google.android.libraries.places.internal.zzmy zzmyVar) {
        java.lang.String regionCode = findAutocompletePredictionsRequest.getRegionCode();
        if (regionCode != null && regionCode.isEmpty()) {
            return com.google.android.gms.tasks.Tasks.forException(new com.google.android.gms.common.api.ApiException(new com.google.android.gms.common.api.Status(com.google.android.libraries.places.api.net.PlacesStatusCodes.INVALID_REQUEST, "Region code must not be an empty string.")));
        }
        java.lang.String query = findAutocompletePredictionsRequest.getQuery();
        if (query == null) {
            return com.google.android.gms.tasks.Tasks.forException(new com.google.android.gms.common.api.ApiException(new com.google.android.gms.common.api.Status(com.google.android.libraries.places.api.net.PlacesStatusCodes.INVALID_REQUEST, "Query must not be null.")));
        }
        if (android.text.TextUtils.isEmpty(query.trim())) {
            return com.google.android.gms.tasks.Tasks.forResult(com.google.android.libraries.places.api.net.FindAutocompletePredictionsResponse.newInstance(com.google.common.collect.ImmutableList.of()));
        }
        final long zzb = this.zze.zzb();
        final com.google.common.util.concurrent.ListenableFuture zzx = zzx();
        final com.google.common.util.concurrent.ListenableFuture transformAsync = com.google.common.util.concurrent.Futures.transformAsync(zzx, new com.google.common.util.concurrent.AsyncFunction() { // from class: com.google.android.libraries.places.internal.zzis
            @Override // com.google.common.util.concurrent.AsyncFunction
            public final /* synthetic */ com.google.common.util.concurrent.ListenableFuture apply(java.lang.Object obj) {
                return com.google.android.libraries.places.internal.zzja.this.zzm(zzmyVar, findAutocompletePredictionsRequest, (com.google.android.libraries.places.api.auth.zzb) obj);
            }
        }, com.google.common.util.concurrent.MoreExecutors.directExecutor());
        com.google.android.gms.tasks.CancellationToken cancellationToken = findAutocompletePredictionsRequest.getCancellationToken();
        if (cancellationToken != null) {
            cancellationToken.onCanceledRequested(new com.google.android.gms.tasks.OnTokenCanceledListener() { // from class: com.google.android.libraries.places.internal.zziv
                @Override // com.google.android.gms.tasks.OnTokenCanceledListener
                public final /* synthetic */ void onCanceled() {
                    com.google.common.util.concurrent.ListenableFuture.this.cancel(true);
                }
            });
        }
        return com.google.android.libraries.places.internal.zzen.zza(transformAsync).onSuccessTask(new com.google.android.gms.tasks.SuccessContinuation(this) { // from class: com.google.android.libraries.places.internal.zzit
            @Override // com.google.android.gms.tasks.SuccessContinuation
            public final /* synthetic */ com.google.android.gms.tasks.Task then(java.lang.Object obj) {
                com.google.android.gms.tasks.TaskCompletionSource taskCompletionSource = new com.google.android.gms.tasks.TaskCompletionSource();
                java.util.ArrayList arrayList = new java.util.ArrayList();
                for (com.google.android.libraries.places.internal.zzawz zzawzVar : ((com.google.android.libraries.places.internal.zzaxa) obj).zza()) {
                    com.google.android.libraries.places.internal.zzaws zzc = zzawzVar.zzc();
                    if (!zzawzVar.zza()) {
                        throw new java.lang.IllegalArgumentException("Suggestion does not contain a PlacePrediction.");
                    }
                    com.google.android.libraries.places.api.model.AutocompletePrediction.Builder builder = com.google.android.libraries.places.api.model.AutocompletePrediction.builder(zzc.zza());
                    builder.setDistanceMeters(zzc.zzf() == 0 ? null : java.lang.Integer.valueOf(zzc.zzf()));
                    builder.setTypes(com.google.common.collect.ImmutableList.copyOf((java.util.Collection) zzc.zze()));
                    builder.setFullText(zzc.zzc().zza());
                    builder.zzb(com.google.android.libraries.places.internal.zzkh.zza(zzc.zzc().zzc()));
                    builder.setPrimaryText(zzc.zzd().zza().zza());
                    builder.zzc(com.google.android.libraries.places.internal.zzkh.zza(zzc.zzd().zza().zzc()));
                    builder.setSecondaryText(zzc.zzd().zzc().zza());
                    builder.zzd(com.google.android.libraries.places.internal.zzkh.zza(zzc.zzd().zzc().zzc()));
                    arrayList.add(builder.build());
                }
                taskCompletionSource.setResult(com.google.android.libraries.places.api.net.FindAutocompletePredictionsResponse.newInstance(arrayList));
                return taskCompletionSource.getTask();
            }
        }).continueWithTask(new com.google.android.gms.tasks.Continuation() { // from class: com.google.android.libraries.places.internal.zziu
            @Override // com.google.android.gms.tasks.Continuation
            public final /* synthetic */ java.lang.Object then(com.google.android.gms.tasks.Task task) {
                com.google.android.libraries.places.internal.zzja.this.zzn(zzb, zzmyVar, zzx, task);
                return task;
            }
        });
    }

    public final com.google.android.gms.tasks.Task zzc(final com.google.android.libraries.places.api.net.FetchPlaceRequest fetchPlaceRequest, final com.google.android.libraries.places.internal.zzmy zzmyVar) {
        if (fetchPlaceRequest.getPlaceId().isEmpty()) {
            return com.google.android.gms.tasks.Tasks.forException(new com.google.android.gms.common.api.ApiException(new com.google.android.gms.common.api.Status(com.google.android.libraries.places.api.net.PlacesStatusCodes.INVALID_REQUEST, "Place id must not be an empty string.")));
        }
        java.util.List<com.google.android.libraries.places.api.model.Place.Field> placeFields = fetchPlaceRequest.getPlaceFields();
        if (placeFields.isEmpty()) {
            return com.google.android.gms.tasks.Tasks.forException(new com.google.android.gms.common.api.ApiException(new com.google.android.gms.common.api.Status(com.google.android.libraries.places.api.net.PlacesStatusCodes.INVALID_REQUEST, "Place fields must not be empty.")));
        }
        java.lang.String regionCode = fetchPlaceRequest.getRegionCode();
        if (regionCode != null && regionCode.isEmpty()) {
            return com.google.android.gms.tasks.Tasks.forException(new com.google.android.gms.common.api.ApiException(new com.google.android.gms.common.api.Status(com.google.android.libraries.places.api.net.PlacesStatusCodes.INVALID_REQUEST, "Region code must not be an empty string.")));
        }
        final long zzb = this.zze.zzb();
        final java.lang.String zzb2 = com.google.android.libraries.places.internal.zzhu.zzb(com.google.android.libraries.places.internal.zzjl.zza(placeFields));
        final com.google.common.util.concurrent.ListenableFuture zzx = zzx();
        final com.google.common.util.concurrent.ListenableFuture transformAsync = com.google.common.util.concurrent.Futures.transformAsync(zzx, new com.google.common.util.concurrent.AsyncFunction() { // from class: com.google.android.libraries.places.internal.zziw
            @Override // com.google.common.util.concurrent.AsyncFunction
            public final /* synthetic */ com.google.common.util.concurrent.ListenableFuture apply(java.lang.Object obj) {
                return com.google.android.libraries.places.internal.zzja.this.zzo(zzmyVar, zzb2, fetchPlaceRequest, (com.google.android.libraries.places.api.auth.zzb) obj);
            }
        }, com.google.common.util.concurrent.MoreExecutors.directExecutor());
        com.google.android.gms.tasks.CancellationToken cancellationToken = fetchPlaceRequest.getCancellationToken();
        if (cancellationToken != null) {
            cancellationToken.onCanceledRequested(new com.google.android.gms.tasks.OnTokenCanceledListener() { // from class: com.google.android.libraries.places.internal.zzig
                @Override // com.google.android.gms.tasks.OnTokenCanceledListener
                public final /* synthetic */ void onCanceled() {
                    com.google.common.util.concurrent.ListenableFuture.this.cancel(true);
                }
            });
        }
        return com.google.android.libraries.places.internal.zzen.zza(transformAsync).onSuccessTask(new com.google.android.gms.tasks.SuccessContinuation() { // from class: com.google.android.libraries.places.internal.zzix
            @Override // com.google.android.gms.tasks.SuccessContinuation
            public final /* synthetic */ com.google.android.gms.tasks.Task then(java.lang.Object obj) {
                return com.google.android.libraries.places.internal.zzja.this.zzp((com.google.android.libraries.places.internal.zzbai) obj);
            }
        }).continueWithTask(new com.google.android.gms.tasks.Continuation() { // from class: com.google.android.libraries.places.internal.zziy
            @Override // com.google.android.gms.tasks.Continuation
            public final /* synthetic */ java.lang.Object then(com.google.android.gms.tasks.Task task) {
                com.google.android.libraries.places.internal.zzja.this.zzq(zzb, zzmyVar, zzx, task);
                return task;
            }
        });
    }

    public final com.google.android.gms.tasks.Task zzd(final com.google.android.libraries.places.api.net.FetchResolvedPhotoUriRequest fetchResolvedPhotoUriRequest, final com.google.android.libraries.places.internal.zzmy zzmyVar) {
        if (zzmyVar == com.google.android.libraries.places.internal.zzmy.PLACES_UI_KIT && this.zzj.zzc == null) {
            return com.google.android.gms.tasks.Tasks.forException(new com.google.android.gms.common.api.ApiException(new com.google.android.gms.common.api.Status(com.google.android.libraries.places.api.net.PlacesStatusCodes.INVALID_REQUEST, "Get Photo Media for Places UI Kit but widget type is null")));
        }
        final long zzb = this.zze.zzb();
        final com.google.common.util.concurrent.ListenableFuture zzx = zzx();
        final com.google.common.util.concurrent.ListenableFuture transformAsync = com.google.common.util.concurrent.Futures.transformAsync(zzx, new com.google.common.util.concurrent.AsyncFunction() { // from class: com.google.android.libraries.places.internal.zzih
            @Override // com.google.common.util.concurrent.AsyncFunction
            public final /* synthetic */ com.google.common.util.concurrent.ListenableFuture apply(java.lang.Object obj) {
                return com.google.android.libraries.places.internal.zzja.this.zzr(zzmyVar, fetchResolvedPhotoUriRequest, (com.google.android.libraries.places.api.auth.zzb) obj);
            }
        }, com.google.common.util.concurrent.MoreExecutors.directExecutor());
        com.google.android.gms.tasks.CancellationToken cancellationToken = fetchResolvedPhotoUriRequest.getCancellationToken();
        if (cancellationToken != null) {
            cancellationToken.onCanceledRequested(new com.google.android.gms.tasks.OnTokenCanceledListener() { // from class: com.google.android.libraries.places.internal.zzik
                @Override // com.google.android.gms.tasks.OnTokenCanceledListener
                public final /* synthetic */ void onCanceled() {
                    com.google.common.util.concurrent.ListenableFuture.this.cancel(true);
                }
            });
        }
        return com.google.android.libraries.places.internal.zzen.zza(transformAsync).onSuccessTask(com.google.android.libraries.places.internal.zzii.zza).continueWithTask(new com.google.android.gms.tasks.Continuation() { // from class: com.google.android.libraries.places.internal.zzij
            @Override // com.google.android.gms.tasks.Continuation
            public final /* synthetic */ java.lang.Object then(com.google.android.gms.tasks.Task task) {
                com.google.android.libraries.places.internal.zzja.this.zzs(zzb, zzmyVar, zzx, task);
                return task;
            }
        });
    }

    public final com.google.android.gms.tasks.Task zze(final com.google.android.gms.maps.model.LatLng latLng) {
        return com.google.android.libraries.places.internal.zzen.zza(com.google.common.util.concurrent.Futures.transformAsync(zzx(), new com.google.common.util.concurrent.AsyncFunction() { // from class: com.google.android.libraries.places.internal.zzil
            @Override // com.google.common.util.concurrent.AsyncFunction
            public final /* synthetic */ com.google.common.util.concurrent.ListenableFuture apply(java.lang.Object obj) {
                return com.google.android.libraries.places.internal.zzja.this.zzt(latLng, (com.google.android.libraries.places.api.auth.zzb) obj);
            }
        }, com.google.common.util.concurrent.MoreExecutors.directExecutor()));
    }

    public final com.google.android.gms.tasks.Task zzf(final com.google.android.libraries.places.api.net.SearchNearbyRequest searchNearbyRequest, final com.google.android.libraries.places.internal.zzmy zzmyVar) {
        java.util.List<com.google.android.libraries.places.api.model.Place.Field> placeFields = searchNearbyRequest.getPlaceFields();
        if (placeFields.isEmpty()) {
            return com.google.android.gms.tasks.Tasks.forException(new com.google.android.gms.common.api.ApiException(new com.google.android.gms.common.api.Status(com.google.android.libraries.places.api.net.PlacesStatusCodes.INVALID_REQUEST, "Place fields must not be empty.")));
        }
        java.lang.String regionCode = searchNearbyRequest.getRegionCode();
        if (regionCode != null && regionCode.isEmpty()) {
            return com.google.android.gms.tasks.Tasks.forException(new com.google.android.gms.common.api.ApiException(new com.google.android.gms.common.api.Status(com.google.android.libraries.places.api.net.PlacesStatusCodes.INVALID_REQUEST, "Region code must not be an empty string.")));
        }
        final long zzb = this.zze.zzb();
        java.util.ArrayList arrayList = new java.util.ArrayList();
        if (searchNearbyRequest.isRoutingSummariesIncluded()) {
            arrayList.add(com.google.android.libraries.places.internal.zzht.ROUTING_SUMMARIES);
        }
        final java.lang.String zza = com.google.android.libraries.places.internal.zzhu.zza(com.google.android.libraries.places.internal.zzjl.zza(placeFields), arrayList);
        final com.google.common.util.concurrent.ListenableFuture zzx = zzx();
        final com.google.common.util.concurrent.ListenableFuture transformAsync = com.google.common.util.concurrent.Futures.transformAsync(zzx, new com.google.common.util.concurrent.AsyncFunction() { // from class: com.google.android.libraries.places.internal.zzim
            @Override // com.google.common.util.concurrent.AsyncFunction
            public final /* synthetic */ com.google.common.util.concurrent.ListenableFuture apply(java.lang.Object obj) {
                return com.google.android.libraries.places.internal.zzja.this.zzu(zzmyVar, zza, searchNearbyRequest, (com.google.android.libraries.places.api.auth.zzb) obj);
            }
        }, com.google.common.util.concurrent.MoreExecutors.directExecutor());
        com.google.android.gms.tasks.CancellationToken cancellationToken = searchNearbyRequest.getCancellationToken();
        if (cancellationToken != null) {
            cancellationToken.onCanceledRequested(new com.google.android.gms.tasks.OnTokenCanceledListener() { // from class: com.google.android.libraries.places.internal.zzip
                @Override // com.google.android.gms.tasks.OnTokenCanceledListener
                public final /* synthetic */ void onCanceled() {
                    com.google.common.util.concurrent.ListenableFuture.this.cancel(true);
                }
            });
        }
        return com.google.android.libraries.places.internal.zzen.zza(transformAsync).onSuccessTask(new com.google.android.gms.tasks.SuccessContinuation() { // from class: com.google.android.libraries.places.internal.zzin
            @Override // com.google.android.gms.tasks.SuccessContinuation
            public final /* synthetic */ com.google.android.gms.tasks.Task then(java.lang.Object obj) {
                return com.google.android.libraries.places.internal.zzja.this.zzv(searchNearbyRequest, (com.google.android.libraries.places.internal.zzbbk) obj);
            }
        }).continueWithTask(new com.google.android.gms.tasks.Continuation() { // from class: com.google.android.libraries.places.internal.zzio
            @Override // com.google.android.gms.tasks.Continuation
            public final /* synthetic */ java.lang.Object then(com.google.android.gms.tasks.Task task) {
                com.google.android.libraries.places.internal.zzja.this.zzw(searchNearbyRequest, zzb, zzmyVar, zzx, task);
                return task;
            }
        });
    }

    public final void zzg() {
        this.zzb.zzd();
        com.google.android.libraries.places.internal.zzjp zzjpVar = this.zzi;
        zzjpVar.zzb.shutdownNow();
        zzjpVar.zza.zzd();
        this.zzj.zzc();
    }

    public final void zzh() {
        this.zzi.zzb();
    }

    public final void zzi() {
        this.zzj.zzc();
    }

    final /* synthetic */ com.google.common.util.concurrent.ListenableFuture zzj(com.google.android.libraries.places.internal.zzmy zzmyVar, java.lang.String str, com.google.android.libraries.places.api.net.SearchByTextRequest searchByTextRequest, com.google.android.libraries.places.api.auth.zzb zzbVar) {
        int i;
        com.google.android.libraries.places.internal.zzaxz zzaxzVar;
        com.google.android.libraries.places.internal.zzbak zzy = zzy(zzmyVar, str, zzbVar, com.google.android.libraries.places.internal.zzbgs.PLACE_LIST);
        java.util.Locale zzf = this.zzm.zzf();
        com.google.android.libraries.places.internal.zzbbl zza = com.google.android.libraries.places.internal.zzbbu.zza();
        java.lang.String includedType = searchByTextRequest.getIncludedType();
        if (includedType != null) {
            zza.zzd(includedType);
        }
        com.google.android.libraries.places.api.model.LocationBias locationBias = searchByTextRequest.getLocationBias();
        if (locationBias != null) {
            boolean z = locationBias instanceof com.google.android.libraries.places.api.model.RectangularBounds;
            com.google.common.base.Preconditions.checkArgument(z || (locationBias instanceof com.google.android.libraries.places.api.model.CircularBounds), "LocationBias must be of type RectangularBounds or CircularBounds.");
            com.google.android.libraries.places.internal.zzbbo zza2 = com.google.android.libraries.places.internal.zzbbp.zza();
            if (z) {
                zza2.zza(com.google.android.libraries.places.internal.zzhq.zzc((com.google.android.libraries.places.api.model.RectangularBounds) locationBias));
            } else {
                zza2.zzb(com.google.android.libraries.places.internal.zzhq.zzb((com.google.android.libraries.places.api.model.CircularBounds) locationBias));
            }
            zza.zzk((com.google.android.libraries.places.internal.zzbbp) zza2.zzG());
        }
        com.google.android.libraries.places.api.model.LocationRestriction locationRestriction = searchByTextRequest.getLocationRestriction();
        if (locationRestriction != null) {
            com.google.common.base.Preconditions.checkArgument(locationRestriction instanceof com.google.android.libraries.places.api.model.RectangularBounds, "LocationRestriction must be of type RectangularBounds.");
            com.google.android.libraries.places.internal.zzbbq zza3 = com.google.android.libraries.places.internal.zzbbr.zza();
            zza3.zza(com.google.android.libraries.places.internal.zzhq.zzc((com.google.android.libraries.places.api.model.RectangularBounds) locationRestriction));
            zza.zzl((com.google.android.libraries.places.internal.zzbbr) zza3.zzG());
        }
        java.lang.Integer maxResultCount = searchByTextRequest.getMaxResultCount();
        if (maxResultCount != null) {
            zza.zzg(maxResultCount.intValue());
        }
        java.lang.Double minRating = searchByTextRequest.getMinRating();
        if (minRating != null) {
            zza.zzf(minRating.doubleValue());
        }
        zza.zze(searchByTextRequest.isOpenNow());
        java.util.List<java.lang.Integer> priceLevels = searchByTextRequest.getPriceLevels();
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.util.Iterator<java.lang.Integer> it = priceLevels.iterator();
        while (true) {
            i = 3;
            if (!it.hasNext()) {
                break;
            }
            int intValue = it.next().intValue();
            if (intValue == 0) {
                arrayList.add(com.google.android.libraries.places.internal.zzbao.PRICE_LEVEL_FREE);
            } else if (intValue == 1) {
                arrayList.add(com.google.android.libraries.places.internal.zzbao.PRICE_LEVEL_INEXPENSIVE);
            } else if (intValue == 2) {
                arrayList.add(com.google.android.libraries.places.internal.zzbao.PRICE_LEVEL_MODERATE);
            } else if (intValue == 3) {
                arrayList.add(com.google.android.libraries.places.internal.zzbao.PRICE_LEVEL_EXPENSIVE);
            } else if (intValue == 4) {
                arrayList.add(com.google.android.libraries.places.internal.zzbao.PRICE_LEVEL_VERY_EXPENSIVE);
            }
        }
        zza.zzi(arrayList);
        com.google.android.libraries.places.api.net.SearchByTextRequest.RankPreference rankPreference = searchByTextRequest.getRankPreference();
        if (rankPreference == null) {
            i = 2;
        } else if (rankPreference.ordinal() != 0) {
            i = 4;
        }
        zza.zzq(i);
        java.lang.String regionCode = searchByTextRequest.getRegionCode();
        if (regionCode != null) {
            zza.zzc(regionCode);
        }
        zza.zzj(searchByTextRequest.isStrictTypeFiltering());
        zza.zza(searchByTextRequest.getTextQuery());
        zza.zzb(zzf.toLanguageTag());
        com.google.android.libraries.places.api.model.EVSearchOptions evSearchOptions = searchByTextRequest.getEvSearchOptions();
        if (evSearchOptions != null) {
            com.google.android.libraries.places.internal.zzbbm zza4 = com.google.android.libraries.places.internal.zzbbn.zza();
            java.lang.Double minimumChargingRateKw = evSearchOptions.getMinimumChargingRateKw();
            if (minimumChargingRateKw != null) {
                zza4.zza(minimumChargingRateKw.doubleValue());
            }
            java.util.List<com.google.android.libraries.places.api.model.EVConnectorType> connectorTypes = evSearchOptions.getConnectorTypes();
            if (connectorTypes != null) {
                java.util.ArrayList arrayList2 = new java.util.ArrayList();
                java.util.Iterator<com.google.android.libraries.places.api.model.EVConnectorType> it2 = connectorTypes.iterator();
                while (it2.hasNext()) {
                    switch (it2.next().ordinal()) {
                        case 1:
                            zzaxzVar = com.google.android.libraries.places.internal.zzaxz.EV_CONNECTOR_TYPE_OTHER;
                            break;
                        case 2:
                            zzaxzVar = com.google.android.libraries.places.internal.zzaxz.EV_CONNECTOR_TYPE_J1772;
                            break;
                        case 3:
                            zzaxzVar = com.google.android.libraries.places.internal.zzaxz.EV_CONNECTOR_TYPE_TYPE_2;
                            break;
                        case 4:
                            zzaxzVar = com.google.android.libraries.places.internal.zzaxz.EV_CONNECTOR_TYPE_CHADEMO;
                            break;
                        case 5:
                            zzaxzVar = com.google.android.libraries.places.internal.zzaxz.EV_CONNECTOR_TYPE_CCS_COMBO_1;
                            break;
                        case 6:
                            zzaxzVar = com.google.android.libraries.places.internal.zzaxz.EV_CONNECTOR_TYPE_CCS_COMBO_2;
                            break;
                        case 7:
                            zzaxzVar = com.google.android.libraries.places.internal.zzaxz.EV_CONNECTOR_TYPE_TESLA;
                            break;
                        case 8:
                            zzaxzVar = com.google.android.libraries.places.internal.zzaxz.EV_CONNECTOR_TYPE_UNSPECIFIED_GB_T;
                            break;
                        case 9:
                            zzaxzVar = com.google.android.libraries.places.internal.zzaxz.EV_CONNECTOR_TYPE_UNSPECIFIED_WALL_OUTLET;
                            break;
                        case 10:
                            zzaxzVar = com.google.android.libraries.places.internal.zzaxz.EV_CONNECTOR_TYPE_NACS;
                            break;
                        default:
                            zzaxzVar = com.google.android.libraries.places.internal.zzaxz.EV_CONNECTOR_TYPE_UNSPECIFIED;
                            break;
                    }
                    arrayList2.add(zzaxzVar);
                }
                zza4.zzb(arrayList2);
            }
            zza.zzm((com.google.android.libraries.places.internal.zzbbn) zza4.zzG());
        }
        com.google.android.libraries.places.api.model.SearchAlongRouteParameters searchAlongRouteParameters = searchByTextRequest.getSearchAlongRouteParameters();
        if (searchAlongRouteParameters != null) {
            com.google.android.libraries.places.internal.zzbbs zza5 = com.google.android.libraries.places.internal.zzbbt.zza();
            com.google.android.libraries.places.api.model.EncodedPolyline encodedPolyline = (com.google.android.libraries.places.api.model.EncodedPolyline) searchAlongRouteParameters.getPolyline();
            com.google.android.libraries.places.internal.zzbam zza6 = com.google.android.libraries.places.internal.zzban.zza();
            zza6.zza(encodedPolyline.getEncodedPolyline());
            zza5.zza((com.google.android.libraries.places.internal.zzban) zza6.zzG());
            zza.zzo((com.google.android.libraries.places.internal.zzbbt) zza5.zzG());
        }
        com.google.android.libraries.places.api.model.RoutingParameters routingParameters = searchByTextRequest.getRoutingParameters();
        if (routingParameters != null) {
            zza.zzn(com.google.android.libraries.places.internal.zzjy.zza(routingParameters));
        }
        if (searchByTextRequest.isPureServiceAreaBusinessesIncluded()) {
            zza.zzp(true);
        }
        java.lang.String zza7 = searchByTextRequest.zza();
        if (zza7 != null) {
            zza.zzh(zza7);
        }
        return com.google.android.libraries.places.internal.zzcef.zzb(zzy.zzc().zza(com.google.android.libraries.places.internal.zzbal.zzb(), zzy.zzd()), (com.google.android.libraries.places.internal.zzbbu) zza.zzG());
    }

    final /* synthetic */ com.google.android.gms.tasks.Task zzk(com.google.android.libraries.places.api.net.SearchByTextRequest searchByTextRequest, com.google.android.libraries.places.internal.zzbbw zzbbwVar) {
        com.google.android.gms.tasks.TaskCompletionSource taskCompletionSource = new com.google.android.gms.tasks.TaskCompletionSource();
        java.util.List zza = zzbbwVar.zza();
        java.util.List zzc = zzbbwVar.zzc();
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.util.ArrayList arrayList2 = new java.util.ArrayList();
        java.lang.String zzd = zzbbwVar.zzd();
        java.util.Iterator it = zza.iterator();
        while (it.hasNext()) {
            arrayList.add(this.zzh.zza((com.google.android.libraries.places.internal.zzbai) it.next()));
        }
        java.util.Iterator it2 = zzc.iterator();
        while (it2.hasNext()) {
            arrayList2.add(com.google.android.libraries.places.internal.zzka.zza((com.google.android.libraries.places.internal.zzbbc) it2.next()));
        }
        java.lang.String zze = zzbbwVar.zze();
        com.google.android.libraries.places.api.net.SearchByTextResponse.Builder builder = com.google.android.libraries.places.api.net.SearchByTextResponse.builder(arrayList);
        if (true != searchByTextRequest.isRoutingSummariesIncluded()) {
            arrayList2 = null;
        }
        builder.setRoutingSummaries(arrayList2);
        if (true == zzd.isEmpty()) {
            zzd = null;
        }
        builder.zza(zzd);
        builder.zzb(searchByTextRequest.zzb());
        builder.setSearchUri(zze.isEmpty() ? null : android.net.Uri.parse(zze));
        taskCompletionSource.setResult(builder.build());
        return taskCompletionSource.getTask();
    }

    /* JADX WARN: Multi-variable type inference failed */
    final /* synthetic */ com.google.android.gms.tasks.Task zzl(com.google.android.libraries.places.api.net.SearchByTextRequest searchByTextRequest, long j, com.google.android.libraries.places.internal.zzmy zzmyVar, com.google.common.util.concurrent.ListenableFuture listenableFuture, com.google.android.gms.tasks.Task task) {
        if (!task.isCanceled()) {
            this.zzd.zzf(searchByTextRequest, task, j, this.zze.zzb(), zzmyVar, (com.google.android.libraries.places.api.auth.zzb) listenableFuture.get());
        }
        return task;
    }

    final /* synthetic */ com.google.common.util.concurrent.ListenableFuture zzm(com.google.android.libraries.places.internal.zzmy zzmyVar, com.google.android.libraries.places.api.net.FindAutocompletePredictionsRequest findAutocompletePredictionsRequest, com.google.android.libraries.places.api.auth.zzb zzbVar) {
        com.google.android.libraries.places.internal.zzbak zzy = zzy(zzmyVar, "", zzbVar, com.google.android.libraries.places.internal.zzbgs.PLACE_AUTOCOMPLETE);
        java.util.Locale zzf = this.zzm.zzf();
        com.google.android.libraries.places.internal.zzawh zza = com.google.android.libraries.places.internal.zzawm.zza();
        zza.zza((java.lang.String) com.google.common.base.Preconditions.checkNotNull(findAutocompletePredictionsRequest.getQuery()));
        zza.zzf(zzf.toLanguageTag());
        java.lang.Integer inputOffset = findAutocompletePredictionsRequest.getInputOffset();
        if (inputOffset != null) {
            zza.zzi(inputOffset.intValue());
        }
        java.lang.String regionCode = findAutocompletePredictionsRequest.getRegionCode();
        if (regionCode != null) {
            zza.zzg(regionCode);
        }
        com.google.android.libraries.places.api.model.LocationBias locationBias = findAutocompletePredictionsRequest.getLocationBias();
        if (locationBias != null) {
            boolean z = locationBias instanceof com.google.android.libraries.places.api.model.CircularBounds;
            com.google.common.base.Preconditions.checkArgument(z || (locationBias instanceof com.google.android.libraries.places.api.model.RectangularBounds));
            com.google.android.libraries.places.internal.zzawi zza2 = com.google.android.libraries.places.internal.zzawj.zza();
            if (z) {
                zza2.zzb(com.google.android.libraries.places.internal.zzhq.zzb((com.google.android.libraries.places.api.model.CircularBounds) locationBias));
            }
            if (locationBias instanceof com.google.android.libraries.places.api.model.RectangularBounds) {
                zza2.zza(com.google.android.libraries.places.internal.zzhq.zzc((com.google.android.libraries.places.api.model.RectangularBounds) locationBias));
            }
            zza.zzb((com.google.android.libraries.places.internal.zzawj) zza2.zzG());
        }
        com.google.android.libraries.places.api.model.LocationRestriction locationRestriction = findAutocompletePredictionsRequest.getLocationRestriction();
        if (locationRestriction != null) {
            boolean z2 = locationRestriction instanceof com.google.android.libraries.places.api.model.CircularBounds;
            com.google.common.base.Preconditions.checkArgument(z2 || (locationRestriction instanceof com.google.android.libraries.places.api.model.RectangularBounds));
            com.google.android.libraries.places.internal.zzawk zza3 = com.google.android.libraries.places.internal.zzawl.zza();
            if (z2) {
                zza3.zzb(com.google.android.libraries.places.internal.zzhq.zzb((com.google.android.libraries.places.api.model.CircularBounds) locationRestriction));
            }
            if (locationRestriction instanceof com.google.android.libraries.places.api.model.RectangularBounds) {
                zza3.zza(com.google.android.libraries.places.internal.zzhq.zzc((com.google.android.libraries.places.api.model.RectangularBounds) locationRestriction));
            }
            zza.zzc((com.google.android.libraries.places.internal.zzawl) zza3.zzG());
        }
        com.google.android.gms.maps.model.LatLng origin = findAutocompletePredictionsRequest.getOrigin();
        if (origin != null) {
            zza.zzh(com.google.android.libraries.places.internal.zzhq.zza(origin));
        }
        java.util.Iterator<java.lang.String> it = findAutocompletePredictionsRequest.getCountries().iterator();
        while (it.hasNext()) {
            zza.zze(it.next());
        }
        com.google.android.libraries.places.api.model.AutocompleteSessionToken sessionToken = findAutocompletePredictionsRequest.getSessionToken();
        if (sessionToken != null) {
            zza.zzj(sessionToken.toString());
        }
        java.util.Iterator<java.lang.String> it2 = findAutocompletePredictionsRequest.getTypesFilter().iterator();
        while (it2.hasNext()) {
            zza.zzd(it2.next());
        }
        if (findAutocompletePredictionsRequest.isPureServiceAreaBusinessesIncluded()) {
            zza.zzk(true);
        }
        return com.google.android.libraries.places.internal.zzcef.zzb(zzy.zzc().zza(com.google.android.libraries.places.internal.zzbal.zze(), zzy.zzd()), (com.google.android.libraries.places.internal.zzawm) zza.zzG());
    }

    /* JADX WARN: Multi-variable type inference failed */
    final /* synthetic */ com.google.android.gms.tasks.Task zzn(long j, com.google.android.libraries.places.internal.zzmy zzmyVar, com.google.common.util.concurrent.ListenableFuture listenableFuture, com.google.android.gms.tasks.Task task) {
        if (!task.isCanceled()) {
            this.zzd.zzl(task, j, this.zze.zzb(), 3, zzmyVar, (com.google.android.libraries.places.api.auth.zzb) listenableFuture.get());
        }
        return task;
    }

    final /* synthetic */ com.google.common.util.concurrent.ListenableFuture zzo(com.google.android.libraries.places.internal.zzmy zzmyVar, java.lang.String str, com.google.android.libraries.places.api.net.FetchPlaceRequest fetchPlaceRequest, com.google.android.libraries.places.api.auth.zzb zzbVar) {
        com.google.android.libraries.places.internal.zzbak zzy = zzy(zzmyVar, str, zzbVar, com.google.android.libraries.places.internal.zzbgs.PLACE_DETAILS);
        java.util.Locale zzf = this.zzm.zzf();
        com.google.android.libraries.places.internal.zzayh zza = com.google.android.libraries.places.internal.zzayi.zza();
        zza.zza("places/".concat(java.lang.String.valueOf(fetchPlaceRequest.getPlaceId())));
        java.lang.String regionCode = fetchPlaceRequest.getRegionCode();
        if (regionCode != null) {
            zza.zzc(regionCode);
        }
        com.google.android.libraries.places.api.model.AutocompleteSessionToken sessionToken = fetchPlaceRequest.getSessionToken();
        if (sessionToken != null) {
            zza.zzd(sessionToken.toString());
        }
        zza.zzb(zzf.toLanguageTag());
        return com.google.android.libraries.places.internal.zzcef.zzb(zzy.zzc().zza(com.google.android.libraries.places.internal.zzbal.zzd(), zzy.zzd()), (com.google.android.libraries.places.internal.zzayi) zza.zzG());
    }

    final /* synthetic */ com.google.android.gms.tasks.Task zzp(com.google.android.libraries.places.internal.zzbai zzbaiVar) {
        com.google.android.gms.tasks.TaskCompletionSource taskCompletionSource = new com.google.android.gms.tasks.TaskCompletionSource();
        taskCompletionSource.setResult(com.google.android.libraries.places.api.net.FetchPlaceResponse.newInstance(this.zzh.zza(zzbaiVar)));
        return taskCompletionSource.getTask();
    }

    /* JADX WARN: Multi-variable type inference failed */
    final /* synthetic */ com.google.android.gms.tasks.Task zzq(long j, com.google.android.libraries.places.internal.zzmy zzmyVar, com.google.common.util.concurrent.ListenableFuture listenableFuture, com.google.android.gms.tasks.Task task) {
        if (!task.isCanceled()) {
            this.zzd.zzn(task, j, this.zze.zzb(), 3, zzmyVar, (com.google.android.libraries.places.api.auth.zzb) listenableFuture.get());
        }
        return task;
    }

    final /* synthetic */ com.google.common.util.concurrent.ListenableFuture zzr(com.google.android.libraries.places.internal.zzmy zzmyVar, com.google.android.libraries.places.api.net.FetchResolvedPhotoUriRequest fetchResolvedPhotoUriRequest, com.google.android.libraries.places.api.auth.zzb zzbVar) {
        com.google.android.libraries.places.internal.zzbak zzy = zzy(zzmyVar, "", zzbVar, this.zzj.zzc);
        com.google.android.libraries.places.internal.zzayf zza = com.google.android.libraries.places.internal.zzayg.zza();
        zza.zza(java.lang.String.valueOf((java.lang.String) com.google.common.base.Preconditions.checkNotNull(fetchResolvedPhotoUriRequest.getPhotoMetadata().zzb())).concat("/media"));
        java.lang.Integer maxHeight = fetchResolvedPhotoUriRequest.getMaxHeight();
        if (maxHeight != null) {
            zza.zzc(maxHeight.intValue());
        }
        java.lang.Integer maxWidth = fetchResolvedPhotoUriRequest.getMaxWidth();
        if (maxWidth != null) {
            zza.zzb(maxWidth.intValue());
        }
        zza.zzd(true);
        return com.google.android.libraries.places.internal.zzcef.zzb(zzy.zzc().zza(com.google.android.libraries.places.internal.zzbal.zzc(), zzy.zzd()), (com.google.android.libraries.places.internal.zzayg) zza.zzG());
    }

    /* JADX WARN: Multi-variable type inference failed */
    final /* synthetic */ com.google.android.gms.tasks.Task zzs(long j, com.google.android.libraries.places.internal.zzmy zzmyVar, com.google.common.util.concurrent.ListenableFuture listenableFuture, com.google.android.gms.tasks.Task task) {
        if (!task.isCanceled()) {
            this.zzd.zzh(task, j, this.zze.zzb(), zzmyVar, (com.google.android.libraries.places.api.auth.zzb) listenableFuture.get());
        }
        return task;
    }

    final /* synthetic */ com.google.common.util.concurrent.ListenableFuture zzt(com.google.android.gms.maps.model.LatLng latLng, com.google.android.libraries.places.api.auth.zzb zzbVar) {
        return this.zzl.zza(latLng, zzbVar, zzz(com.google.android.libraries.places.internal.zzbgs.PLACE_DETAILS));
    }

    final /* synthetic */ com.google.common.util.concurrent.ListenableFuture zzu(com.google.android.libraries.places.internal.zzmy zzmyVar, java.lang.String str, com.google.android.libraries.places.api.net.SearchNearbyRequest searchNearbyRequest, com.google.android.libraries.places.api.auth.zzb zzbVar) {
        com.google.android.libraries.places.internal.zzbak zzy = zzy(zzmyVar, str, zzbVar, com.google.android.libraries.places.internal.zzbgs.PLACE_LIST);
        java.util.Locale zzf = this.zzm.zzf();
        com.google.android.libraries.places.internal.zzbbd zza = com.google.android.libraries.places.internal.zzbbi.zza();
        zza.zza(zzf.toLanguageTag());
        java.lang.String regionCode = searchNearbyRequest.getRegionCode();
        if (regionCode != null) {
            zza.zzb(regionCode);
        }
        java.util.List<java.lang.String> includedTypes = searchNearbyRequest.getIncludedTypes();
        if (includedTypes != null) {
            zza.zzc(includedTypes);
        }
        java.util.List<java.lang.String> excludedTypes = searchNearbyRequest.getExcludedTypes();
        if (excludedTypes != null) {
            zza.zzd(excludedTypes);
        }
        java.util.List<java.lang.String> includedPrimaryTypes = searchNearbyRequest.getIncludedPrimaryTypes();
        if (includedPrimaryTypes != null) {
            zza.zze(includedPrimaryTypes);
        }
        java.util.List<java.lang.String> excludedPrimaryTypes = searchNearbyRequest.getExcludedPrimaryTypes();
        if (excludedPrimaryTypes != null) {
            zza.zzf(excludedPrimaryTypes);
        }
        java.lang.Integer maxResultCount = searchNearbyRequest.getMaxResultCount();
        if (maxResultCount != null) {
            zza.zzg(maxResultCount.intValue());
        }
        com.google.android.libraries.places.api.model.RoutingParameters routingParameters = searchNearbyRequest.getRoutingParameters();
        if (routingParameters != null) {
            zza.zzi(com.google.android.libraries.places.internal.zzjy.zza(routingParameters));
        }
        com.google.android.libraries.places.internal.zzbbg zza2 = com.google.android.libraries.places.internal.zzbbh.zza();
        zza2.zza(com.google.android.libraries.places.internal.zzhq.zzb((com.google.android.libraries.places.api.model.CircularBounds) searchNearbyRequest.getLocationRestriction()));
        zza.zzh((com.google.android.libraries.places.internal.zzbbh) zza2.zzG());
        com.google.android.libraries.places.api.net.SearchNearbyRequest.RankPreference rankPreference = searchNearbyRequest.getRankPreference();
        zza.zzj(rankPreference == null ? 2 : rankPreference.ordinal() != 0 ? 4 : 3);
        return com.google.android.libraries.places.internal.zzcef.zzb(zzy.zzc().zza(com.google.android.libraries.places.internal.zzbal.zza(), zzy.zzd()), (com.google.android.libraries.places.internal.zzbbi) zza.zzG());
    }

    final /* synthetic */ com.google.android.gms.tasks.Task zzv(com.google.android.libraries.places.api.net.SearchNearbyRequest searchNearbyRequest, com.google.android.libraries.places.internal.zzbbk zzbbkVar) {
        com.google.android.gms.tasks.TaskCompletionSource taskCompletionSource = new com.google.android.gms.tasks.TaskCompletionSource();
        java.util.List zza = zzbbkVar.zza();
        java.util.List zzc = zzbbkVar.zzc();
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.util.ArrayList arrayList2 = new java.util.ArrayList();
        java.util.Iterator it = zza.iterator();
        while (it.hasNext()) {
            arrayList.add(this.zzh.zza((com.google.android.libraries.places.internal.zzbai) it.next()));
        }
        java.util.Iterator it2 = zzc.iterator();
        while (it2.hasNext()) {
            arrayList2.add(com.google.android.libraries.places.internal.zzka.zza((com.google.android.libraries.places.internal.zzbbc) it2.next()));
        }
        com.google.android.libraries.places.api.net.SearchNearbyResponse.Builder builder = com.google.android.libraries.places.api.net.SearchNearbyResponse.builder(arrayList);
        if (true != searchNearbyRequest.isRoutingSummariesIncluded()) {
            arrayList2 = null;
        }
        builder.setRoutingSummaries(arrayList2);
        taskCompletionSource.setResult(builder.build());
        return taskCompletionSource.getTask();
    }

    /* JADX WARN: Multi-variable type inference failed */
    final /* synthetic */ com.google.android.gms.tasks.Task zzw(com.google.android.libraries.places.api.net.SearchNearbyRequest searchNearbyRequest, long j, com.google.android.libraries.places.internal.zzmy zzmyVar, com.google.common.util.concurrent.ListenableFuture listenableFuture, com.google.android.gms.tasks.Task task) {
        if (!task.isCanceled()) {
            this.zzd.zzj(searchNearbyRequest, task, j, this.zze.zzb(), zzmyVar, (com.google.android.libraries.places.api.auth.zzb) listenableFuture.get());
        }
        return task;
    }
}
