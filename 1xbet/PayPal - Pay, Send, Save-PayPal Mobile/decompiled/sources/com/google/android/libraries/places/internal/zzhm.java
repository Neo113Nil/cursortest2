package com.google.android.libraries.places.internal;

/* loaded from: classes4.dex */
public final class zzhm implements com.google.android.libraries.places.api.net.PlacesClient {
    private final com.google.android.libraries.places.internal.zzfv zza;
    private final com.google.android.libraries.places.internal.zzfl zzb;
    private final com.google.android.libraries.places.internal.zzfq zzc;
    private final com.google.android.libraries.places.internal.zzmo zzd;
    private final com.google.android.libraries.places.internal.zzef zze;
    private final com.google.android.libraries.places.internal.zzja zzf;
    private final com.google.android.libraries.places.internal.zzfa zzg;
    private final com.google.android.libraries.places.internal.zzmp zzh;

    zzhm(com.google.android.libraries.places.internal.zzmp zzmpVar, com.google.android.libraries.places.internal.zzfv zzfvVar, com.google.android.libraries.places.internal.zzfl zzflVar, com.google.android.libraries.places.internal.zzfq zzfqVar, com.google.android.libraries.places.internal.zzmo zzmoVar, com.google.android.libraries.places.internal.zzef zzefVar, com.google.android.libraries.places.internal.zzja zzjaVar, com.google.android.libraries.places.internal.zzfa zzfaVar) {
        this.zzh = zzmpVar;
        this.zza = zzfvVar;
        this.zzb = zzflVar;
        this.zzc = zzfqVar;
        this.zzd = zzmoVar;
        this.zze = zzefVar;
        this.zzf = zzjaVar;
        this.zzg = zzfaVar;
        zzfaVar.zza();
    }

    private static void zzK(com.google.android.libraries.places.internal.zzfi zzfiVar, com.google.android.libraries.places.internal.zzfj zzfjVar) {
        com.google.android.libraries.places.internal.zzfi.zzb(zzfiVar, com.google.android.libraries.places.internal.zzfi.zza("Duration"));
        com.google.android.libraries.places.internal.zzek.zza();
        com.google.android.libraries.places.internal.zzek.zza();
        com.google.android.libraries.places.internal.zzfi.zzb(zzfiVar, com.google.android.libraries.places.internal.zzfi.zza("Battery"));
        com.google.android.libraries.places.internal.zzek.zza();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static com.google.android.gms.tasks.Task zzL(com.google.android.gms.tasks.Task task) {
        java.lang.Exception exception = task.getException();
        if (exception != null) {
            return com.google.android.gms.tasks.Tasks.forException(exception instanceof com.google.android.gms.common.api.ApiException ? (com.google.android.gms.common.api.ApiException) exception : exception instanceof com.google.android.libraries.places.internal.zzbns ? com.google.android.libraries.places.internal.zzfu.zzb((com.google.android.libraries.places.internal.zzbns) exception) : ((exception instanceof java.util.concurrent.ExecutionException) && (exception.getCause() instanceof com.google.android.libraries.places.internal.zzbns)) ? com.google.android.libraries.places.internal.zzfu.zzb((com.google.android.libraries.places.internal.zzbns) exception.getCause()) : new com.google.android.gms.common.api.ApiException(new com.google.android.gms.common.api.Status(13, exception.toString())));
        }
        return task;
    }

    @Override // com.google.android.libraries.places.api.net.PlacesClient
    public final com.google.android.gms.tasks.Task<com.google.android.libraries.places.api.net.FetchPhotoResponse> fetchPhoto(com.google.android.libraries.places.api.net.FetchPhotoRequest fetchPhotoRequest) {
        return zzb(fetchPhotoRequest, com.google.android.libraries.places.internal.zzmy.PROGRAMMATIC_API);
    }

    @Override // com.google.android.libraries.places.api.net.PlacesClient
    public final com.google.android.gms.tasks.Task<com.google.android.libraries.places.api.net.FetchPlaceResponse> fetchPlace(com.google.android.libraries.places.api.net.FetchPlaceRequest fetchPlaceRequest) {
        return zzd(fetchPlaceRequest, com.google.android.libraries.places.internal.zzmy.PROGRAMMATIC_API);
    }

    @Override // com.google.android.libraries.places.api.net.PlacesClient
    public final com.google.android.gms.tasks.Task<com.google.android.libraries.places.api.net.FetchResolvedPhotoUriResponse> fetchResolvedPhotoUri(com.google.android.libraries.places.api.net.FetchResolvedPhotoUriRequest fetchResolvedPhotoUriRequest) {
        return zzc(fetchResolvedPhotoUriRequest, com.google.android.libraries.places.internal.zzmy.PROGRAMMATIC_API);
    }

    @Override // com.google.android.libraries.places.api.net.PlacesClient
    public final com.google.android.gms.tasks.Task<com.google.android.libraries.places.api.net.FindAutocompletePredictionsResponse> findAutocompletePredictions(com.google.android.libraries.places.api.net.FindAutocompletePredictionsRequest findAutocompletePredictionsRequest) {
        return zza(findAutocompletePredictionsRequest, com.google.android.libraries.places.internal.zzmy.PROGRAMMATIC_API);
    }

    @Override // com.google.android.libraries.places.api.net.PlacesClient
    public final com.google.android.gms.tasks.Task<com.google.android.libraries.places.api.net.FindCurrentPlaceResponse> findCurrentPlace(com.google.android.libraries.places.api.net.FindCurrentPlaceRequest findCurrentPlaceRequest) {
        return zzg(findCurrentPlaceRequest, null, com.google.android.libraries.places.internal.zzmy.PROGRAMMATIC_API);
    }

    @Override // com.google.android.libraries.places.api.net.PlacesClient
    public final com.google.android.gms.tasks.Task<com.google.android.libraries.places.api.net.IsOpenResponse> isOpen(com.google.android.libraries.places.api.net.IsOpenRequest isOpenRequest) {
        return zzh(isOpenRequest, com.google.android.libraries.places.internal.zzmy.PROGRAMMATIC_API);
    }

    @Override // com.google.android.libraries.places.api.net.PlacesClient
    public final com.google.android.gms.tasks.Task<com.google.android.libraries.places.api.net.SearchByTextResponse> searchByText(com.google.android.libraries.places.api.net.SearchByTextRequest searchByTextRequest) {
        return zzi(searchByTextRequest, com.google.android.libraries.places.internal.zzmy.PROGRAMMATIC_API);
    }

    @Override // com.google.android.libraries.places.api.net.PlacesClient
    public final com.google.android.gms.tasks.Task<com.google.android.libraries.places.api.net.SearchNearbyResponse> searchNearby(com.google.android.libraries.places.api.net.SearchNearbyRequest searchNearbyRequest) {
        return zzj(searchNearbyRequest, com.google.android.libraries.places.internal.zzmy.PROGRAMMATIC_API);
    }

    final /* synthetic */ com.google.android.libraries.places.api.net.FindCurrentPlaceResponse zzA(com.google.android.libraries.places.api.net.FindCurrentPlaceRequest findCurrentPlaceRequest, long j, com.google.android.libraries.places.internal.zzmy zzmyVar, com.google.android.libraries.places.internal.zzfj zzfjVar, com.google.android.gms.tasks.Task task) {
        this.zzd.zza(findCurrentPlaceRequest, task, j, this.zze.zzb(), zzmyVar);
        zzK(com.google.android.libraries.places.internal.zzfi.zza("FindCurrentPlace"), zzfjVar);
        return (com.google.android.libraries.places.api.net.FindCurrentPlaceResponse) task.getResult();
    }

    final /* synthetic */ com.google.android.libraries.places.api.net.FetchPlaceResponse zzC(com.google.android.libraries.places.api.net.FetchPlaceRequest fetchPlaceRequest, com.google.android.libraries.places.internal.zzmy zzmyVar, com.google.android.libraries.places.internal.zzfj zzfjVar, com.google.android.gms.tasks.Task task) {
        this.zzd.zzo(fetchPlaceRequest, 2, zzmyVar);
        zzK(com.google.android.libraries.places.internal.zzfi.zza("IsOpenFetchPlace"), zzfjVar);
        return (com.google.android.libraries.places.api.net.FetchPlaceResponse) task.getResult();
    }

    final /* synthetic */ com.google.android.libraries.places.api.net.FetchPlaceResponse zzE(com.google.android.libraries.places.api.net.FetchPlaceRequest fetchPlaceRequest, com.google.android.libraries.places.internal.zzmy zzmyVar, com.google.android.libraries.places.internal.zzfj zzfjVar, com.google.android.gms.tasks.Task task) {
        this.zzd.zzo(fetchPlaceRequest, 3, zzmyVar);
        zzK(com.google.android.libraries.places.internal.zzfi.zza("IsOpenGetPlace"), zzfjVar);
        return (com.google.android.libraries.places.api.net.FetchPlaceResponse) task.getResult();
    }

    final /* synthetic */ com.google.android.libraries.places.api.net.SearchByTextResponse zzG(com.google.android.libraries.places.api.net.SearchByTextRequest searchByTextRequest, com.google.android.libraries.places.internal.zzmy zzmyVar, com.google.android.libraries.places.internal.zzfj zzfjVar, com.google.android.gms.tasks.Task task) {
        this.zzd.zze(searchByTextRequest, zzmyVar);
        zzK(com.google.android.libraries.places.internal.zzfi.zza("SearchByText"), zzfjVar);
        java.lang.String zza = ((com.google.android.libraries.places.api.net.SearchByTextResponse) task.getResult()).zza();
        com.google.android.libraries.places.api.net.SearchByTextResponse.Builder builder = com.google.android.libraries.places.api.net.SearchByTextResponse.builder(((com.google.android.libraries.places.api.net.SearchByTextResponse) task.getResult()).getPlaces());
        builder.setPagination(zza == null ? null : new com.google.android.libraries.places.internal.zzgm(this, searchByTextRequest, zza, zzmyVar, ((com.google.android.libraries.places.api.net.SearchByTextResponse) task.getResult()).zzb() + 1));
        builder.zza(zza);
        builder.setRoutingSummaries(((com.google.android.libraries.places.api.net.SearchByTextResponse) task.getResult()).getRoutingSummaries());
        builder.setSearchUri(((com.google.android.libraries.places.api.net.SearchByTextResponse) task.getResult()).getSearchUri());
        return builder.build();
    }

    final /* synthetic */ com.google.android.libraries.places.api.net.SearchNearbyResponse zzI(com.google.android.libraries.places.api.net.SearchNearbyRequest searchNearbyRequest, com.google.android.libraries.places.internal.zzmy zzmyVar, com.google.android.libraries.places.internal.zzfj zzfjVar, com.google.android.gms.tasks.Task task) {
        this.zzd.zzi(searchNearbyRequest, zzmyVar);
        zzK(com.google.android.libraries.places.internal.zzfi.zza("SearchNearby"), zzfjVar);
        return (com.google.android.libraries.places.api.net.SearchNearbyResponse) task.getResult();
    }

    @Override // com.google.android.libraries.places.api.net.PlacesClient
    public final com.google.android.gms.tasks.Task zza(final com.google.android.libraries.places.api.net.FindAutocompletePredictionsRequest findAutocompletePredictionsRequest, final com.google.android.libraries.places.internal.zzmy zzmyVar) {
        try {
            com.google.common.base.Preconditions.checkNotNull(findAutocompletePredictionsRequest, "Request must not be null.");
            com.google.android.libraries.places.internal.zzek.zza();
            final com.google.android.libraries.places.internal.zzfj zza = com.google.android.libraries.places.internal.zzfj.zza();
            if (!zzmyVar.equals(com.google.android.libraries.places.internal.zzmy.PLACES_UI_KIT) && !zzmyVar.equals(com.google.android.libraries.places.internal.zzmy.ONE_PLATFORM_AUTOCOMPLETE_WIDGET) && (!this.zzh.zzg() || zzmyVar.equals(com.google.android.libraries.places.internal.zzmy.AUTOCOMPLETE_WIDGET))) {
                return this.zza.zza(findAutocompletePredictionsRequest, zzmyVar).continueWith(new com.google.android.gms.tasks.Continuation() { // from class: com.google.android.libraries.places.internal.zzhl
                    @Override // com.google.android.gms.tasks.Continuation
                    public final /* synthetic */ java.lang.Object then(com.google.android.gms.tasks.Task task) {
                        return com.google.android.libraries.places.internal.zzhm.this.zzn(findAutocompletePredictionsRequest, zzmyVar, zza, task);
                    }
                }).continueWithTask(com.google.android.libraries.places.internal.zzgn.zza);
            }
            return this.zzf.zzb(findAutocompletePredictionsRequest, zzmyVar).continueWith(new com.google.android.gms.tasks.Continuation() { // from class: com.google.android.libraries.places.internal.zzgy
                @Override // com.google.android.gms.tasks.Continuation
                public final /* synthetic */ java.lang.Object then(com.google.android.gms.tasks.Task task) {
                    return com.google.android.libraries.places.internal.zzhm.this.zzp(findAutocompletePredictionsRequest, zzmyVar, zza, task);
                }
            }).continueWithTask(com.google.android.libraries.places.internal.zzhd.zza);
        } catch (java.lang.Error | java.lang.RuntimeException e) {
            com.google.android.libraries.places.internal.zznb.zzb(e);
            throw e;
        }
    }

    @Override // com.google.android.libraries.places.api.net.PlacesClient
    public final com.google.android.gms.tasks.Task zzb(final com.google.android.libraries.places.api.net.FetchPhotoRequest fetchPhotoRequest, final com.google.android.libraries.places.internal.zzmy zzmyVar) {
        try {
            com.google.common.base.Preconditions.checkNotNull(fetchPhotoRequest, "Request must not be null.");
            com.google.android.libraries.places.internal.zzek.zza();
            final com.google.android.libraries.places.internal.zzfj zza = com.google.android.libraries.places.internal.zzfj.zza();
            return this.zza.zzb(fetchPhotoRequest, zzmyVar).continueWith(new com.google.android.gms.tasks.Continuation() { // from class: com.google.android.libraries.places.internal.zzhe
                @Override // com.google.android.gms.tasks.Continuation
                public final /* synthetic */ java.lang.Object then(com.google.android.gms.tasks.Task task) {
                    return com.google.android.libraries.places.internal.zzhm.this.zzr(fetchPhotoRequest, zzmyVar, zza, task);
                }
            }).continueWithTask(com.google.android.libraries.places.internal.zzhf.zza);
        } catch (java.lang.Error | java.lang.RuntimeException e) {
            com.google.android.libraries.places.internal.zznb.zzb(e);
            throw e;
        }
    }

    @Override // com.google.android.libraries.places.api.net.PlacesClient
    public final com.google.android.gms.tasks.Task zzc(final com.google.android.libraries.places.api.net.FetchResolvedPhotoUriRequest fetchResolvedPhotoUriRequest, final com.google.android.libraries.places.internal.zzmy zzmyVar) {
        try {
            com.google.common.base.Preconditions.checkNotNull(fetchResolvedPhotoUriRequest, "Request must not be null.");
            com.google.android.libraries.places.internal.zzek.zza();
            final com.google.android.libraries.places.internal.zzfj zza = com.google.android.libraries.places.internal.zzfj.zza();
            return this.zzf.zzd(fetchResolvedPhotoUriRequest, zzmyVar).continueWith(new com.google.android.gms.tasks.Continuation() { // from class: com.google.android.libraries.places.internal.zzhg
                @Override // com.google.android.gms.tasks.Continuation
                public final /* synthetic */ java.lang.Object then(com.google.android.gms.tasks.Task task) {
                    return com.google.android.libraries.places.internal.zzhm.this.zzt(fetchResolvedPhotoUriRequest, zzmyVar, zza, task);
                }
            }).continueWithTask(com.google.android.libraries.places.internal.zzhh.zza);
        } catch (java.lang.Error | java.lang.RuntimeException e) {
            com.google.android.libraries.places.internal.zznb.zzb(e);
            throw e;
        }
    }

    @Override // com.google.android.libraries.places.api.net.PlacesClient
    public final com.google.android.gms.tasks.Task zzd(final com.google.android.libraries.places.api.net.FetchPlaceRequest fetchPlaceRequest, final com.google.android.libraries.places.internal.zzmy zzmyVar) {
        try {
            com.google.common.base.Preconditions.checkNotNull(fetchPlaceRequest, "Request must not be null.");
            com.google.android.libraries.places.internal.zzek.zza();
            final com.google.android.libraries.places.internal.zzfj zza = com.google.android.libraries.places.internal.zzfj.zza();
            return (!this.zzh.zzg() || zzmyVar.equals(com.google.android.libraries.places.internal.zzmy.AUTOCOMPLETE_WIDGET)) ? this.zza.zzc(fetchPlaceRequest, zzmyVar).continueWith(new com.google.android.gms.tasks.Continuation() { // from class: com.google.android.libraries.places.internal.zzhi
                @Override // com.google.android.gms.tasks.Continuation
                public final /* synthetic */ java.lang.Object then(com.google.android.gms.tasks.Task task) {
                    return com.google.android.libraries.places.internal.zzhm.this.zzv(fetchPlaceRequest, zzmyVar, zza, task);
                }
            }).continueWithTask(com.google.android.libraries.places.internal.zzhj.zza) : this.zzf.zzc(fetchPlaceRequest, zzmyVar).continueWith(new com.google.android.gms.tasks.Continuation() { // from class: com.google.android.libraries.places.internal.zzhk
                @Override // com.google.android.gms.tasks.Continuation
                public final /* synthetic */ java.lang.Object then(com.google.android.gms.tasks.Task task) {
                    return com.google.android.libraries.places.internal.zzhm.this.zzx(fetchPlaceRequest, zzmyVar, zza, task);
                }
            }).continueWithTask(com.google.android.libraries.places.internal.zzgo.zza);
        } catch (java.lang.Error | java.lang.RuntimeException e) {
            com.google.android.libraries.places.internal.zznb.zzb(e);
            throw e;
        }
    }

    @Override // com.google.android.libraries.places.api.net.PlacesClient
    public final com.google.android.gms.tasks.Task zze(com.google.android.gms.maps.model.LatLng latLng) {
        return this.zzf.zze(latLng);
    }

    @Override // com.google.android.libraries.places.api.net.PlacesClient
    public final com.google.android.gms.tasks.Task zzf(com.google.android.libraries.places.api.net.FindCurrentPlaceRequest findCurrentPlaceRequest, com.google.android.libraries.places.internal.zzmy zzmyVar) {
        return zzg(findCurrentPlaceRequest, null, zzmyVar);
    }

    public final com.google.android.gms.tasks.Task zzg(final com.google.android.libraries.places.api.net.FindCurrentPlaceRequest findCurrentPlaceRequest, java.lang.String str, final com.google.android.libraries.places.internal.zzmy zzmyVar) {
        try {
            com.google.common.base.Preconditions.checkNotNull(findCurrentPlaceRequest, "Request must not be null.");
            final long zzb = this.zze.zzb();
            com.google.android.libraries.places.internal.zzek.zza();
            final com.google.android.libraries.places.internal.zzfj zza = com.google.android.libraries.places.internal.zzfj.zza();
            final java.lang.String str2 = null;
            return this.zzb.zza(findCurrentPlaceRequest.getCancellationToken()).onSuccessTask(new com.google.android.gms.tasks.SuccessContinuation(findCurrentPlaceRequest, str2, zzmyVar) { // from class: com.google.android.libraries.places.internal.zzgp
                private final /* synthetic */ com.google.android.libraries.places.api.net.FindCurrentPlaceRequest zzb;
                private final /* synthetic */ com.google.android.libraries.places.internal.zzmy zzc;

                @Override // com.google.android.gms.tasks.SuccessContinuation
                public final /* synthetic */ com.google.android.gms.tasks.Task then(java.lang.Object obj) {
                    return com.google.android.libraries.places.internal.zzhm.this.zzz(this.zzb, null, this.zzc, (android.location.Location) obj);
                }

                {
                    this.zzc = zzmyVar;
                }
            }).continueWith(new com.google.android.gms.tasks.Continuation() { // from class: com.google.android.libraries.places.internal.zzgq
                @Override // com.google.android.gms.tasks.Continuation
                public final /* synthetic */ java.lang.Object then(com.google.android.gms.tasks.Task task) {
                    return com.google.android.libraries.places.internal.zzhm.this.zzA(findCurrentPlaceRequest, zzb, zzmyVar, zza, task);
                }
            }).continueWithTask(com.google.android.libraries.places.internal.zzgr.zza);
        } catch (java.lang.Error | java.lang.RuntimeException e) {
            com.google.android.libraries.places.internal.zznb.zzb(e);
            throw e;
        }
    }

    @Override // com.google.android.libraries.places.api.net.PlacesClient
    public final com.google.android.gms.tasks.Task zzh(com.google.android.libraries.places.api.net.IsOpenRequest isOpenRequest, final com.google.android.libraries.places.internal.zzmy zzmyVar) {
        java.util.List arrayList;
        try {
            com.google.common.base.Preconditions.checkNotNull(isOpenRequest, "Request must not be null.");
            final com.google.android.libraries.places.api.model.Place place = isOpenRequest.getPlace();
            java.lang.String placeId = isOpenRequest.getPlaceId();
            final long utcTimeMillis = isOpenRequest.getUtcTimeMillis();
            final com.google.android.gms.tasks.TaskCompletionSource taskCompletionSource = new com.google.android.gms.tasks.TaskCompletionSource();
            if (place == null) {
                arrayList = java.util.Arrays.asList(com.google.android.libraries.places.api.model.Place.Field.BUSINESS_STATUS, com.google.android.libraries.places.api.model.Place.Field.CURRENT_OPENING_HOURS, com.google.android.libraries.places.api.model.Place.Field.OPENING_HOURS, com.google.android.libraries.places.api.model.Place.Field.UTC_OFFSET);
            } else {
                arrayList = new java.util.ArrayList();
                com.google.android.libraries.places.api.model.Place.BusinessStatus businessStatus = place.getBusinessStatus();
                if (businessStatus == null || businessStatus == com.google.android.libraries.places.api.model.Place.BusinessStatus.OPERATIONAL) {
                    if (businessStatus == null) {
                        arrayList.add(com.google.android.libraries.places.api.model.Place.Field.BUSINESS_STATUS);
                    }
                    if (place.getCurrentOpeningHours() == null) {
                        arrayList.add(com.google.android.libraries.places.api.model.Place.Field.CURRENT_OPENING_HOURS);
                    }
                    if (place.getOpeningHours() == null) {
                        arrayList.add(com.google.android.libraries.places.api.model.Place.Field.OPENING_HOURS);
                    }
                    if (place.getUtcOffsetMinutes() == null) {
                        arrayList.add(com.google.android.libraries.places.api.model.Place.Field.UTC_OFFSET);
                    }
                }
            }
            if (arrayList.isEmpty()) {
                taskCompletionSource.setResult(com.google.android.libraries.places.api.net.IsOpenResponse.newInstance(com.google.android.libraries.places.api.model.zzga.zza((com.google.android.libraries.places.api.model.Place) com.google.common.base.Preconditions.checkNotNull(place), utcTimeMillis)));
                return taskCompletionSource.getTask();
            }
            if (place != null) {
                placeId = place.getId();
            }
            com.google.android.libraries.places.api.net.FetchPlaceRequest.Builder builder = com.google.android.libraries.places.api.net.FetchPlaceRequest.builder((java.lang.String) com.google.common.base.Preconditions.checkNotNull(placeId), arrayList);
            builder.setCancellationToken(isOpenRequest.getCancellationToken());
            final com.google.android.libraries.places.api.net.FetchPlaceRequest build = builder.build();
            com.google.android.libraries.places.internal.zzek.zza();
            final com.google.android.libraries.places.internal.zzfj zza = com.google.android.libraries.places.internal.zzfj.zza();
            return this.zzh.zzg() ? this.zzf.zzc(build, zzmyVar).continueWith(new com.google.android.gms.tasks.Continuation() { // from class: com.google.android.libraries.places.internal.zzgv
                @Override // com.google.android.gms.tasks.Continuation
                public final /* synthetic */ java.lang.Object then(com.google.android.gms.tasks.Task task) {
                    return com.google.android.libraries.places.internal.zzhm.this.zzE(build, zzmyVar, zza, task);
                }
            }).onSuccessTask(new com.google.android.gms.tasks.SuccessContinuation() { // from class: com.google.android.libraries.places.internal.zzgw
                @Override // com.google.android.gms.tasks.SuccessContinuation
                public final /* synthetic */ com.google.android.gms.tasks.Task then(java.lang.Object obj) {
                    com.google.android.libraries.places.api.model.Place place2 = ((com.google.android.libraries.places.api.net.FetchPlaceResponse) obj).getPlace();
                    com.google.android.libraries.places.api.model.Place.BusinessStatus businessStatus2 = place2.getBusinessStatus();
                    com.google.android.libraries.places.api.model.OpeningHours currentOpeningHours = place2.getCurrentOpeningHours();
                    com.google.android.libraries.places.api.model.OpeningHours openingHours = place2.getOpeningHours();
                    java.lang.Integer utcOffsetMinutes = place2.getUtcOffsetMinutes();
                    com.google.android.libraries.places.api.model.Place place3 = com.google.android.libraries.places.api.model.Place.this;
                    if (place3 != null) {
                        if (utcOffsetMinutes == null) {
                            utcOffsetMinutes = place3.getUtcOffsetMinutes();
                        }
                        if (businessStatus2 == null) {
                            businessStatus2 = place3.getBusinessStatus();
                        }
                        if (currentOpeningHours == null) {
                            currentOpeningHours = place3.getCurrentOpeningHours();
                        }
                        if (openingHours == null) {
                            openingHours = place3.getOpeningHours();
                        }
                    }
                    com.google.android.gms.tasks.TaskCompletionSource taskCompletionSource2 = taskCompletionSource;
                    long j = utcTimeMillis;
                    com.google.android.libraries.places.api.model.Place.Builder builder2 = com.google.android.libraries.places.api.model.Place.builder();
                    builder2.setBusinessStatus(businessStatus2);
                    builder2.setCurrentOpeningHours(currentOpeningHours);
                    builder2.setOpeningHours(openingHours);
                    builder2.setUtcOffsetMinutes(utcOffsetMinutes);
                    taskCompletionSource2.setResult(com.google.android.libraries.places.api.net.IsOpenResponse.newInstance(com.google.android.libraries.places.api.model.zzga.zza(builder2.build(), j)));
                    return taskCompletionSource2.getTask();
                }
            }).continueWithTask(com.google.android.libraries.places.internal.zzgx.zza) : this.zza.zzc(build, zzmyVar).continueWith(new com.google.android.gms.tasks.Continuation() { // from class: com.google.android.libraries.places.internal.zzgs
                @Override // com.google.android.gms.tasks.Continuation
                public final /* synthetic */ java.lang.Object then(com.google.android.gms.tasks.Task task) {
                    return com.google.android.libraries.places.internal.zzhm.this.zzC(build, zzmyVar, zza, task);
                }
            }).onSuccessTask(new com.google.android.gms.tasks.SuccessContinuation() { // from class: com.google.android.libraries.places.internal.zzgt
                @Override // com.google.android.gms.tasks.SuccessContinuation
                public final /* synthetic */ com.google.android.gms.tasks.Task then(java.lang.Object obj) {
                    com.google.android.libraries.places.api.model.Place place2 = ((com.google.android.libraries.places.api.net.FetchPlaceResponse) obj).getPlace();
                    com.google.android.libraries.places.api.model.Place.BusinessStatus businessStatus2 = place2.getBusinessStatus();
                    com.google.android.libraries.places.api.model.OpeningHours currentOpeningHours = place2.getCurrentOpeningHours();
                    com.google.android.libraries.places.api.model.OpeningHours openingHours = place2.getOpeningHours();
                    java.lang.Integer utcOffsetMinutes = place2.getUtcOffsetMinutes();
                    com.google.android.libraries.places.api.model.Place place3 = com.google.android.libraries.places.api.model.Place.this;
                    if (place3 != null) {
                        if (utcOffsetMinutes == null) {
                            utcOffsetMinutes = place3.getUtcOffsetMinutes();
                        }
                        if (businessStatus2 == null) {
                            businessStatus2 = place3.getBusinessStatus();
                        }
                        if (currentOpeningHours == null) {
                            currentOpeningHours = place3.getCurrentOpeningHours();
                        }
                        if (openingHours == null) {
                            openingHours = place3.getOpeningHours();
                        }
                    }
                    com.google.android.gms.tasks.TaskCompletionSource taskCompletionSource2 = taskCompletionSource;
                    long j = utcTimeMillis;
                    com.google.android.libraries.places.api.model.Place.Builder builder2 = com.google.android.libraries.places.api.model.Place.builder();
                    builder2.setBusinessStatus(businessStatus2);
                    builder2.setCurrentOpeningHours(currentOpeningHours);
                    builder2.setOpeningHours(openingHours);
                    builder2.setUtcOffsetMinutes(utcOffsetMinutes);
                    taskCompletionSource2.setResult(com.google.android.libraries.places.api.net.IsOpenResponse.newInstance(com.google.android.libraries.places.api.model.zzga.zza(builder2.build(), j)));
                    return taskCompletionSource2.getTask();
                }
            }).continueWithTask(com.google.android.libraries.places.internal.zzgu.zza);
        } catch (java.lang.Error | java.lang.RuntimeException e) {
            com.google.android.libraries.places.internal.zznb.zzb(e);
            throw e;
        }
    }

    @Override // com.google.android.libraries.places.api.net.PlacesClient
    public final com.google.android.gms.tasks.Task zzi(final com.google.android.libraries.places.api.net.SearchByTextRequest searchByTextRequest, final com.google.android.libraries.places.internal.zzmy zzmyVar) {
        try {
            com.google.common.base.Preconditions.checkNotNull(searchByTextRequest, "Request must not be null.");
            com.google.android.libraries.places.internal.zzek.zza();
            final com.google.android.libraries.places.internal.zzfj zza = com.google.android.libraries.places.internal.zzfj.zza();
            return this.zzf.zza(searchByTextRequest, zzmyVar).continueWith(new com.google.android.gms.tasks.Continuation() { // from class: com.google.android.libraries.places.internal.zzgz
                @Override // com.google.android.gms.tasks.Continuation
                public final /* synthetic */ java.lang.Object then(com.google.android.gms.tasks.Task task) {
                    return com.google.android.libraries.places.internal.zzhm.this.zzG(searchByTextRequest, zzmyVar, zza, task);
                }
            }).continueWithTask(com.google.android.libraries.places.internal.zzha.zza);
        } catch (java.lang.Error | java.lang.RuntimeException e) {
            com.google.android.libraries.places.internal.zznb.zzb(e);
            throw e;
        }
    }

    @Override // com.google.android.libraries.places.api.net.PlacesClient
    public final com.google.android.gms.tasks.Task zzj(final com.google.android.libraries.places.api.net.SearchNearbyRequest searchNearbyRequest, final com.google.android.libraries.places.internal.zzmy zzmyVar) {
        try {
            com.google.common.base.Preconditions.checkNotNull(searchNearbyRequest, "Request must not be null.");
            com.google.android.libraries.places.internal.zzek.zza();
            final com.google.android.libraries.places.internal.zzfj zza = com.google.android.libraries.places.internal.zzfj.zza();
            return this.zzf.zzf(searchNearbyRequest, zzmyVar).continueWith(new com.google.android.gms.tasks.Continuation() { // from class: com.google.android.libraries.places.internal.zzhb
                @Override // com.google.android.gms.tasks.Continuation
                public final /* synthetic */ java.lang.Object then(com.google.android.gms.tasks.Task task) {
                    return com.google.android.libraries.places.internal.zzhm.this.zzI(searchNearbyRequest, zzmyVar, zza, task);
                }
            }).continueWithTask(com.google.android.libraries.places.internal.zzhc.zza);
        } catch (java.lang.Error | java.lang.RuntimeException e) {
            com.google.android.libraries.places.internal.zznb.zzb(e);
            throw e;
        }
    }

    @Override // com.google.android.libraries.places.api.net.PlacesClient
    public final void zzk() {
        this.zzf.zzg();
        this.zzg.zzb();
    }

    @Override // com.google.android.libraries.places.api.net.PlacesClient
    public final void zzl() {
        this.zzf.zzh();
    }

    @Override // com.google.android.libraries.places.api.net.PlacesClient
    public final void zzm() {
        this.zzf.zzi();
    }

    final /* synthetic */ com.google.android.libraries.places.api.net.FindAutocompletePredictionsResponse zzn(com.google.android.libraries.places.api.net.FindAutocompletePredictionsRequest findAutocompletePredictionsRequest, com.google.android.libraries.places.internal.zzmy zzmyVar, com.google.android.libraries.places.internal.zzfj zzfjVar, com.google.android.gms.tasks.Task task) {
        this.zzd.zzk(findAutocompletePredictionsRequest, 2, zzmyVar);
        zzK(com.google.android.libraries.places.internal.zzfi.zza("FindAutocompletePredictions"), zzfjVar);
        return (com.google.android.libraries.places.api.net.FindAutocompletePredictionsResponse) task.getResult();
    }

    final /* synthetic */ com.google.android.libraries.places.api.net.FindAutocompletePredictionsResponse zzp(com.google.android.libraries.places.api.net.FindAutocompletePredictionsRequest findAutocompletePredictionsRequest, com.google.android.libraries.places.internal.zzmy zzmyVar, com.google.android.libraries.places.internal.zzfj zzfjVar, com.google.android.gms.tasks.Task task) {
        this.zzd.zzk(findAutocompletePredictionsRequest, 3, zzmyVar);
        zzK(com.google.android.libraries.places.internal.zzfi.zza("FindAutocompletePredictionsOnePlatform"), zzfjVar);
        return (com.google.android.libraries.places.api.net.FindAutocompletePredictionsResponse) task.getResult();
    }

    final /* synthetic */ com.google.android.libraries.places.api.net.FetchPhotoResponse zzr(com.google.android.libraries.places.api.net.FetchPhotoRequest fetchPhotoRequest, com.google.android.libraries.places.internal.zzmy zzmyVar, com.google.android.libraries.places.internal.zzfj zzfjVar, com.google.android.gms.tasks.Task task) {
        this.zzd.zzc(fetchPhotoRequest, zzmyVar);
        zzK(com.google.android.libraries.places.internal.zzfi.zza("FetchPhoto"), zzfjVar);
        return (com.google.android.libraries.places.api.net.FetchPhotoResponse) task.getResult();
    }

    final /* synthetic */ com.google.android.libraries.places.api.net.FetchResolvedPhotoUriResponse zzt(com.google.android.libraries.places.api.net.FetchResolvedPhotoUriRequest fetchResolvedPhotoUriRequest, com.google.android.libraries.places.internal.zzmy zzmyVar, com.google.android.libraries.places.internal.zzfj zzfjVar, com.google.android.gms.tasks.Task task) {
        this.zzd.zzg(fetchResolvedPhotoUriRequest, zzmyVar);
        zzK(com.google.android.libraries.places.internal.zzfi.zza("GetPhotoMedia"), zzfjVar);
        return (com.google.android.libraries.places.api.net.FetchResolvedPhotoUriResponse) task.getResult();
    }

    final /* synthetic */ com.google.android.libraries.places.api.net.FetchPlaceResponse zzv(com.google.android.libraries.places.api.net.FetchPlaceRequest fetchPlaceRequest, com.google.android.libraries.places.internal.zzmy zzmyVar, com.google.android.libraries.places.internal.zzfj zzfjVar, com.google.android.gms.tasks.Task task) {
        this.zzd.zzm(fetchPlaceRequest, 2, zzmyVar);
        zzK(com.google.android.libraries.places.internal.zzfi.zza("FetchPlace"), zzfjVar);
        return (com.google.android.libraries.places.api.net.FetchPlaceResponse) task.getResult();
    }

    final /* synthetic */ com.google.android.libraries.places.api.net.FetchPlaceResponse zzx(com.google.android.libraries.places.api.net.FetchPlaceRequest fetchPlaceRequest, com.google.android.libraries.places.internal.zzmy zzmyVar, com.google.android.libraries.places.internal.zzfj zzfjVar, com.google.android.gms.tasks.Task task) {
        this.zzd.zzm(fetchPlaceRequest, 3, zzmyVar);
        zzK(com.google.android.libraries.places.internal.zzfi.zza(com.paypal.oslo.feature.onboarding.graphql.GetPlaceQuery.OPERATION_NAME), zzfjVar);
        return (com.google.android.libraries.places.api.net.FetchPlaceResponse) task.getResult();
    }

    final /* synthetic */ com.google.android.gms.tasks.Task zzz(com.google.android.libraries.places.api.net.FindCurrentPlaceRequest findCurrentPlaceRequest, java.lang.String str, com.google.android.libraries.places.internal.zzmy zzmyVar, android.location.Location location) {
        com.google.common.base.Preconditions.checkNotNull(location, "Location must not be null.");
        return this.zza.zzd(findCurrentPlaceRequest, location, this.zzc.zza(null), zzmyVar);
    }
}
