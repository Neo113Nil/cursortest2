package com.google.android.libraries.places.internal;

/* loaded from: classes4.dex */
public final class zzfs implements com.google.android.libraries.places.internal.zzmo {
    private final com.google.android.libraries.places.internal.zznf zza;
    private final com.google.android.libraries.places.internal.zzmz zzb;
    private final com.google.android.libraries.places.internal.zzmp zzc;

    static final int zzp(com.google.android.gms.tasks.Task task) {
        if (task.isSuccessful()) {
            return 2;
        }
        java.lang.Exception exc = (java.lang.Exception) com.google.common.base.Preconditions.checkNotNull(task.getException());
        int statusCode = (exc instanceof com.google.android.gms.common.api.ApiException ? (com.google.android.gms.common.api.ApiException) exc : new com.google.android.gms.common.api.ApiException(new com.google.android.gms.common.api.Status(13, exc.getMessage()))).getStatusCode();
        if (statusCode != 7) {
            return statusCode != 15 ? 1 : 3;
        }
        return 4;
    }

    private final com.google.android.libraries.places.internal.zzapt zzq() {
        java.util.Locale zzf = this.zzc.zzf();
        java.util.Locale locale = java.util.Locale.getDefault();
        com.google.android.libraries.places.internal.zzapt zza = com.google.android.libraries.places.internal.zzapv.zza();
        zza.zza(zzf.toLanguageTag());
        if (!zzf.equals(locale)) {
            zza.zzb(locale.toLanguageTag());
        }
        return zza;
    }

    private final void zzr(com.google.android.libraries.places.internal.zzalz zzalzVar, com.google.android.libraries.places.internal.zzmy zzmyVar) {
        zzt(zzalzVar, 2, zzmyVar, com.google.android.libraries.places.api.auth.zzb.zza);
    }

    private static final com.google.android.libraries.places.internal.zzaqu zzs(com.google.android.libraries.places.api.model.RoutingParameters routingParameters) {
        com.google.android.libraries.places.internal.zzaqt zza = com.google.android.libraries.places.internal.zzaqu.zza();
        com.google.android.libraries.places.api.model.RoutingParameters.TravelMode travelMode = routingParameters.getTravelMode();
        int i = 4;
        if (travelMode != null) {
            int ordinal = travelMode.ordinal();
            zza.zzb(ordinal != 1 ? ordinal != 2 ? ordinal != 3 ? ordinal != 4 ? 1 : 5 : 4 : 3 : 2);
        }
        com.google.android.libraries.places.api.model.RouteModifiers routeModifiers = routingParameters.getRouteModifiers();
        if (routeModifiers != null) {
            com.google.android.libraries.places.internal.zzaqr zza2 = com.google.android.libraries.places.internal.zzaqs.zza();
            zza2.zza(routeModifiers.isTollAvoided());
            zza2.zzb(routeModifiers.isHighwayAvoided());
            zza2.zzc(routeModifiers.isFerryAvoided());
            zza2.zzd(routeModifiers.isIndoorAvoided());
            zza.zza((com.google.android.libraries.places.internal.zzaqs) zza2.zzG());
        }
        com.google.android.libraries.places.api.model.RoutingParameters.RoutingPreference routingPreference = routingParameters.getRoutingPreference();
        if (routingPreference != null) {
            int ordinal2 = routingPreference.ordinal();
            if (ordinal2 == 1) {
                i = 2;
            } else if (ordinal2 == 2) {
                i = 3;
            } else if (ordinal2 != 3) {
                i = 1;
            }
            zza.zzc(i);
        }
        return (com.google.android.libraries.places.internal.zzaqu) zza.zzG();
    }

    private final void zzt(com.google.android.libraries.places.internal.zzalz zzalzVar, int i, com.google.android.libraries.places.internal.zzmy zzmyVar, com.google.android.libraries.places.api.auth.zzb zzbVar) {
        com.google.android.libraries.places.internal.zzaoc zzb = com.google.android.libraries.places.internal.zzng.zzb(this.zzb, i, zzmyVar, zzbVar);
        zzb.zzp(16);
        zzb.zzf(zzalzVar);
        zzb.zzj(this.zzc.zze());
        this.zza.zzb(zzb);
    }

    @Override // com.google.android.libraries.places.internal.zzmo
    public final void zza(com.google.android.libraries.places.api.net.FindCurrentPlaceRequest findCurrentPlaceRequest, com.google.android.gms.tasks.Task task, long j, long j2, com.google.android.libraries.places.internal.zzmy zzmyVar) {
        int i = true == task.isSuccessful() ? 2 : 1;
        com.google.android.libraries.places.internal.zzaou zza = com.google.android.libraries.places.internal.zzaow.zza();
        com.google.android.libraries.places.internal.zzapo zza2 = com.google.android.libraries.places.internal.zzapp.zza();
        zza2.zza(com.google.android.libraries.places.internal.zzlw.zza(findCurrentPlaceRequest.getPlaceFields()));
        zza.zzb((com.google.android.libraries.places.internal.zzapp) zza2.zzG());
        zza.zza((int) (j2 - j));
        zza.zzc(i);
        com.google.android.libraries.places.internal.zzaow zzaowVar = (com.google.android.libraries.places.internal.zzaow) zza.zzG();
        com.google.android.libraries.places.internal.zzaoc zzb = com.google.android.libraries.places.internal.zzng.zzb(this.zzb, 2, zzmyVar, com.google.android.libraries.places.api.auth.zzb.zza);
        zzb.zzp(6);
        zzb.zzd(zzaowVar);
        zzb.zzj(this.zzc.zze());
        this.zza.zzb(zzb);
    }

    @Override // com.google.android.libraries.places.internal.zzmo
    public final void zzb(com.google.android.gms.tasks.Task task, long j, long j2, com.google.android.libraries.places.internal.zzmy zzmyVar) {
        int size = task.isSuccessful() ? ((com.google.android.libraries.places.api.net.FindCurrentPlaceResponse) task.getResult()).getPlaceLikelihoods().size() : 0;
        com.google.android.libraries.places.internal.zzalb zza = com.google.android.libraries.places.internal.zzalc.zza();
        zza.zza(size);
        com.google.android.libraries.places.internal.zzalc zzalcVar = (com.google.android.libraries.places.internal.zzalc) zza.zzG();
        com.google.android.libraries.places.internal.zzalu zza2 = com.google.android.libraries.places.internal.zzalz.zza();
        zza2.zzf(4);
        zza2.zzc(zzalcVar);
        zza2.zzg(zzp(task));
        zza2.zza((int) (j2 - j));
        zzr((com.google.android.libraries.places.internal.zzalz) zza2.zzG(), zzmyVar);
    }

    @Override // com.google.android.libraries.places.internal.zzmo
    public final void zzc(com.google.android.libraries.places.api.net.FetchPhotoRequest fetchPhotoRequest, com.google.android.libraries.places.internal.zzmy zzmyVar) {
        com.google.android.libraries.places.internal.zzapl zza = com.google.android.libraries.places.internal.zzapn.zza();
        zza.zza(2);
        com.google.android.libraries.places.internal.zzapn zzapnVar = (com.google.android.libraries.places.internal.zzapn) zza.zzG();
        com.google.android.libraries.places.internal.zzaoc zzb = com.google.android.libraries.places.internal.zzng.zzb(this.zzb, 2, zzmyVar, com.google.android.libraries.places.api.auth.zzb.zza);
        zzb.zzp(5);
        zzb.zzc(zzapnVar);
        zzb.zzj(this.zzc.zze());
        this.zza.zzb(zzb);
    }

    @Override // com.google.android.libraries.places.internal.zzmo
    public final void zzd(com.google.android.gms.tasks.Task task, long j, long j2, com.google.android.libraries.places.internal.zzmy zzmyVar) {
        com.google.android.libraries.places.internal.zzalu zza = com.google.android.libraries.places.internal.zzalz.zza();
        zza.zzf(15);
        zza.zzg(zzp(task));
        zza.zza((int) (j2 - j));
        zzr((com.google.android.libraries.places.internal.zzalz) zza.zzG(), zzmyVar);
    }

    @Override // com.google.android.libraries.places.internal.zzmo
    public final void zze(com.google.android.libraries.places.api.net.SearchByTextRequest searchByTextRequest, com.google.android.libraries.places.internal.zzmy zzmyVar) {
        com.google.android.libraries.places.internal.zzala zzalaVar;
        com.google.android.libraries.places.internal.zzaqc zza = com.google.android.libraries.places.internal.zzaqg.zza();
        zza.zzb(searchByTextRequest.isOpenNow());
        com.google.android.libraries.places.internal.zzapo zza2 = com.google.android.libraries.places.internal.zzapp.zza();
        zza2.zza(com.google.android.libraries.places.internal.zzjl.zza(searchByTextRequest.getPlaceFields()));
        zza.zzg((com.google.android.libraries.places.internal.zzapp) zza2.zzG());
        com.google.android.libraries.places.api.net.SearchByTextRequest.RankPreference rankPreference = searchByTextRequest.getRankPreference();
        zza.zzm(rankPreference == null ? 1 : true != rankPreference.equals(com.google.android.libraries.places.api.net.SearchByTextRequest.RankPreference.DISTANCE) ? 3 : 2);
        zza.zzf(searchByTextRequest.isStrictTypeFiltering());
        zza.zzj(searchByTextRequest.isRoutingSummariesIncluded());
        zza.zzl(searchByTextRequest.isSearchUriIncluded());
        java.lang.String includedType = searchByTextRequest.getIncludedType();
        if (includedType != null) {
            zza.zza(includedType);
        }
        java.lang.Double minRating = searchByTextRequest.getMinRating();
        if (minRating != null) {
            zza.zzc(minRating.doubleValue());
        }
        java.lang.Integer maxResultCount = searchByTextRequest.getMaxResultCount();
        if (maxResultCount != null) {
            zza.zzd(maxResultCount.intValue());
        }
        com.google.android.libraries.places.api.model.EVSearchOptions evSearchOptions = searchByTextRequest.getEvSearchOptions();
        if (evSearchOptions != null) {
            com.google.android.libraries.places.internal.zzaqd zza3 = com.google.android.libraries.places.internal.zzaqe.zza();
            java.lang.Double minimumChargingRateKw = evSearchOptions.getMinimumChargingRateKw();
            if (minimumChargingRateKw != null) {
                zza3.zza(minimumChargingRateKw.doubleValue());
            }
            java.util.List<com.google.android.libraries.places.api.model.EVConnectorType> connectorTypes = evSearchOptions.getConnectorTypes();
            if (connectorTypes != null) {
                java.util.ArrayList arrayList = new java.util.ArrayList();
                java.util.Iterator<com.google.android.libraries.places.api.model.EVConnectorType> it = connectorTypes.iterator();
                while (it.hasNext()) {
                    int ordinal = it.next().ordinal();
                    if (ordinal != 0) {
                        switch (ordinal) {
                            case 2:
                                zzalaVar = com.google.android.libraries.places.internal.zzala.EV_CONNECTOR_TYPE_J1772;
                                break;
                            case 3:
                                zzalaVar = com.google.android.libraries.places.internal.zzala.EV_CONNECTOR_TYPE_TYPE_2;
                                break;
                            case 4:
                                zzalaVar = com.google.android.libraries.places.internal.zzala.EV_CONNECTOR_TYPE_CHADEMO;
                                break;
                            case 5:
                                zzalaVar = com.google.android.libraries.places.internal.zzala.EV_CONNECTOR_TYPE_CCS_COMBO_1;
                                break;
                            case 6:
                                zzalaVar = com.google.android.libraries.places.internal.zzala.EV_CONNECTOR_TYPE_CCS_COMBO_2;
                                break;
                            case 7:
                                zzalaVar = com.google.android.libraries.places.internal.zzala.EV_CONNECTOR_TYPE_TESLA;
                                break;
                            case 8:
                                zzalaVar = com.google.android.libraries.places.internal.zzala.EV_CONNECTOR_TYPE_UNSPECIFIED_GB_T;
                                break;
                            case 9:
                                zzalaVar = com.google.android.libraries.places.internal.zzala.EV_CONNECTOR_TYPE_UNSPECIFIED_WALL_OUTLET;
                                break;
                            case 10:
                                zzalaVar = com.google.android.libraries.places.internal.zzala.EV_CONNECTOR_TYPE_NACS;
                                break;
                            default:
                                zzalaVar = com.google.android.libraries.places.internal.zzala.EV_CONNECTOR_TYPE_OTHER;
                                break;
                        }
                    } else {
                        zzalaVar = com.google.android.libraries.places.internal.zzala.EV_CONNECTOR_TYPE_UNSPECIFIED;
                    }
                    arrayList.add(zzalaVar);
                }
                zza3.zzb(arrayList);
            }
            zza.zzh((com.google.android.libraries.places.internal.zzaqe) zza3.zzG());
        }
        com.google.android.libraries.places.api.model.RoutingParameters routingParameters = searchByTextRequest.getRoutingParameters();
        if (routingParameters != null) {
            zza.zzi(zzs(routingParameters));
        }
        zza.zzk(searchByTextRequest.zza() != null);
        java.util.ArrayList arrayList2 = new java.util.ArrayList();
        for (java.lang.Integer num : searchByTextRequest.getPriceLevels()) {
            if (num != null) {
                arrayList2.add(num);
            }
        }
        zza.zze(arrayList2);
        com.google.android.libraries.places.internal.zzapt zzq = zzq();
        zzq.zzh(2);
        zzq.zze((com.google.android.libraries.places.internal.zzaqg) zza.zzG());
        com.google.android.libraries.places.internal.zzapv zzapvVar = (com.google.android.libraries.places.internal.zzapv) zzq.zzG();
        com.google.android.libraries.places.internal.zzaoc zzb = com.google.android.libraries.places.internal.zzng.zzb(this.zzb, 3, zzmyVar, com.google.android.libraries.places.api.auth.zzb.zza);
        zzb.zzp(1);
        zzb.zzb(zzapvVar);
        zzb.zzj(this.zzc.zze());
        this.zza.zzb(zzb);
    }

    @Override // com.google.android.libraries.places.internal.zzmo
    public final void zzf(com.google.android.libraries.places.api.net.SearchByTextRequest searchByTextRequest, com.google.android.gms.tasks.Task task, long j, long j2, com.google.android.libraries.places.internal.zzmy zzmyVar, com.google.android.libraries.places.api.auth.zzb zzbVar) {
        java.util.List<com.google.android.libraries.places.api.model.RoutingSummary> routingSummaries;
        int size = task.isSuccessful() ? ((com.google.android.libraries.places.api.net.SearchByTextResponse) task.getResult()).getPlaces().size() : 0;
        int size2 = (searchByTextRequest.isRoutingSummariesIncluded() && task.isSuccessful() && (routingSummaries = ((com.google.android.libraries.places.api.net.SearchByTextResponse) task.getResult()).getRoutingSummaries()) != null) ? routingSummaries.size() : 0;
        java.lang.Integer maxResultCount = searchByTextRequest.getMaxResultCount();
        com.google.android.libraries.places.internal.zzarg zza = com.google.android.libraries.places.internal.zzarh.zza();
        zza.zza(maxResultCount == null ? 0 : maxResultCount.intValue());
        zza.zzb(size);
        zza.zzc(size2);
        if (task.isSuccessful()) {
            com.google.android.libraries.places.api.net.SearchByTextResponse searchByTextResponse = (com.google.android.libraries.places.api.net.SearchByTextResponse) task.getResult();
            zza.zzd(searchByTextResponse.zza() != null);
            zza.zze(searchByTextResponse.zzb());
        }
        com.google.android.libraries.places.internal.zzalu zza2 = com.google.android.libraries.places.internal.zzalz.zza();
        zza2.zzf(10);
        zza2.zze((com.google.android.libraries.places.internal.zzarh) zza.zzG());
        zza2.zzg(zzp(task));
        zza2.zza((int) (j2 - j));
        zzt((com.google.android.libraries.places.internal.zzalz) zza2.zzG(), 3, zzmyVar, zzbVar);
    }

    @Override // com.google.android.libraries.places.internal.zzmo
    public final void zzg(com.google.android.libraries.places.api.net.FetchResolvedPhotoUriRequest fetchResolvedPhotoUriRequest, com.google.android.libraries.places.internal.zzmy zzmyVar) {
        com.google.android.libraries.places.internal.zzapl zza = com.google.android.libraries.places.internal.zzapn.zza();
        zza.zza(2);
        com.google.android.libraries.places.internal.zzapn zzapnVar = (com.google.android.libraries.places.internal.zzapn) zza.zzG();
        com.google.android.libraries.places.internal.zzaoc zzb = com.google.android.libraries.places.internal.zzng.zzb(this.zzb, 3, zzmyVar, com.google.android.libraries.places.api.auth.zzb.zza);
        zzb.zzp(5);
        zzb.zzc(zzapnVar);
        zzb.zzj(this.zzc.zze());
        this.zza.zzb(zzb);
    }

    @Override // com.google.android.libraries.places.internal.zzmo
    public final void zzh(com.google.android.gms.tasks.Task task, long j, long j2, com.google.android.libraries.places.internal.zzmy zzmyVar, com.google.android.libraries.places.api.auth.zzb zzbVar) {
        com.google.android.libraries.places.internal.zzalu zza = com.google.android.libraries.places.internal.zzalz.zza();
        zza.zzf(15);
        zza.zzg(zzp(task));
        zza.zza((int) (j2 - j));
        zzt((com.google.android.libraries.places.internal.zzalz) zza.zzG(), 3, zzmyVar, zzbVar);
    }

    @Override // com.google.android.libraries.places.internal.zzmo
    public final void zzi(com.google.android.libraries.places.api.net.SearchNearbyRequest searchNearbyRequest, com.google.android.libraries.places.internal.zzmy zzmyVar) {
        com.google.android.libraries.places.internal.zzaqh zza = com.google.android.libraries.places.internal.zzaqj.zza();
        com.google.android.libraries.places.internal.zzapo zza2 = com.google.android.libraries.places.internal.zzapp.zza();
        zza2.zza(com.google.android.libraries.places.internal.zzjl.zza(searchNearbyRequest.getPlaceFields()));
        zza.zzf((com.google.android.libraries.places.internal.zzapp) zza2.zzG());
        com.google.android.libraries.places.api.net.SearchNearbyRequest.RankPreference rankPreference = searchNearbyRequest.getRankPreference();
        zza.zzi(rankPreference == null ? 1 : true != rankPreference.equals(com.google.android.libraries.places.api.net.SearchNearbyRequest.RankPreference.DISTANCE) ? 3 : 2);
        zza.zzh(searchNearbyRequest.isRoutingSummariesIncluded());
        java.util.List<java.lang.String> includedTypes = searchNearbyRequest.getIncludedTypes();
        if (includedTypes != null) {
            zza.zza(includedTypes);
        }
        java.util.List<java.lang.String> excludedTypes = searchNearbyRequest.getExcludedTypes();
        if (excludedTypes != null) {
            zza.zzb(excludedTypes);
        }
        java.util.List<java.lang.String> includedPrimaryTypes = searchNearbyRequest.getIncludedPrimaryTypes();
        if (includedPrimaryTypes != null) {
            zza.zzc(includedPrimaryTypes);
        }
        java.util.List<java.lang.String> excludedPrimaryTypes = searchNearbyRequest.getExcludedPrimaryTypes();
        if (excludedPrimaryTypes != null) {
            zza.zzd(excludedPrimaryTypes);
        }
        java.lang.Integer maxResultCount = searchNearbyRequest.getMaxResultCount();
        if (maxResultCount != null) {
            zza.zze(maxResultCount.intValue());
        }
        com.google.android.libraries.places.api.model.RoutingParameters routingParameters = searchNearbyRequest.getRoutingParameters();
        if (routingParameters != null) {
            zza.zzg(zzs(routingParameters));
        }
        com.google.android.libraries.places.internal.zzapt zzq = zzq();
        zzq.zzh(2);
        zzq.zzf((com.google.android.libraries.places.internal.zzaqj) zza.zzG());
        com.google.android.libraries.places.internal.zzapv zzapvVar = (com.google.android.libraries.places.internal.zzapv) zzq.zzG();
        com.google.android.libraries.places.internal.zzaoc zzb = com.google.android.libraries.places.internal.zzng.zzb(this.zzb, 3, zzmyVar, com.google.android.libraries.places.api.auth.zzb.zza);
        zzb.zzp(1);
        zzb.zzb(zzapvVar);
        zzb.zzj(this.zzc.zze());
        this.zza.zzb(zzb);
    }

    @Override // com.google.android.libraries.places.internal.zzmo
    public final void zzj(com.google.android.libraries.places.api.net.SearchNearbyRequest searchNearbyRequest, com.google.android.gms.tasks.Task task, long j, long j2, com.google.android.libraries.places.internal.zzmy zzmyVar, com.google.android.libraries.places.api.auth.zzb zzbVar) {
        java.util.List<com.google.android.libraries.places.api.model.RoutingSummary> routingSummaries;
        int size = task.isSuccessful() ? ((com.google.android.libraries.places.api.net.SearchNearbyResponse) task.getResult()).getPlaces().size() : 0;
        int size2 = (searchNearbyRequest.isRoutingSummariesIncluded() && task.isSuccessful() && (routingSummaries = ((com.google.android.libraries.places.api.net.SearchNearbyResponse) task.getResult()).getRoutingSummaries()) != null) ? routingSummaries.size() : 0;
        java.lang.Integer maxResultCount = searchNearbyRequest.getMaxResultCount();
        com.google.android.libraries.places.internal.zzarg zza = com.google.android.libraries.places.internal.zzarh.zza();
        zza.zza(maxResultCount != null ? maxResultCount.intValue() : 0);
        zza.zzb(size);
        zza.zzc(size2);
        com.google.android.libraries.places.internal.zzarh zzarhVar = (com.google.android.libraries.places.internal.zzarh) zza.zzG();
        com.google.android.libraries.places.internal.zzalu zza2 = com.google.android.libraries.places.internal.zzalz.zza();
        zza2.zzf(10);
        zza2.zze(zzarhVar);
        zza2.zzg(zzp(task));
        zza2.zza((int) (j2 - j));
        zzt((com.google.android.libraries.places.internal.zzalz) zza2.zzG(), 3, zzmyVar, zzbVar);
    }

    @Override // com.google.android.libraries.places.internal.zzmo
    public final void zzk(com.google.android.libraries.places.api.net.FindAutocompletePredictionsRequest findAutocompletePredictionsRequest, int i, com.google.android.libraries.places.internal.zzmy zzmyVar) {
        com.google.android.libraries.places.internal.zzamn zza = com.google.android.libraries.places.internal.zzamo.zza();
        java.util.List<java.lang.String> typesFilter = findAutocompletePredictionsRequest.getTypesFilter();
        java.lang.Integer inputOffset = findAutocompletePredictionsRequest.getInputOffset();
        if (!typesFilter.isEmpty()) {
            java.util.Iterator<java.lang.String> it = typesFilter.iterator();
            while (it.hasNext()) {
                zza.zza(it.next());
            }
        }
        if (inputOffset != null) {
            zza.zzb(inputOffset.intValue());
        }
        com.google.android.libraries.places.internal.zzamo zzamoVar = (com.google.android.libraries.places.internal.zzamo) zza.zzG();
        com.google.android.libraries.places.internal.zzanm zza2 = com.google.android.libraries.places.internal.zzann.zza();
        if (zzamoVar != null) {
            zza2.zza(zzamoVar);
        }
        com.google.android.libraries.places.internal.zzann zzannVar = (com.google.android.libraries.places.internal.zzann) zza2.zzG();
        com.google.android.libraries.places.internal.zzapt zzq = zzq();
        zzq.zzh(6);
        zzq.zzd(zzannVar);
        com.google.android.libraries.places.internal.zzapv zzapvVar = (com.google.android.libraries.places.internal.zzapv) zzq.zzG();
        com.google.android.libraries.places.internal.zzaoc zzb = com.google.android.libraries.places.internal.zzng.zzb(this.zzb, i, zzmyVar, com.google.android.libraries.places.api.auth.zzb.zza);
        zzb.zzp(1);
        zzb.zzb(zzapvVar);
        zzb.zzj(this.zzc.zze());
        com.google.android.libraries.places.api.model.AutocompleteSessionToken sessionToken = findAutocompletePredictionsRequest.getSessionToken();
        if (sessionToken != null) {
            zzb.zzh(sessionToken.toString());
        }
        this.zza.zzb(zzb);
    }

    @Override // com.google.android.libraries.places.internal.zzmo
    public final void zzl(com.google.android.gms.tasks.Task task, long j, long j2, int i, com.google.android.libraries.places.internal.zzmy zzmyVar, com.google.android.libraries.places.api.auth.zzb zzbVar) {
        int size = task.isSuccessful() ? ((com.google.android.libraries.places.api.net.FindAutocompletePredictionsResponse) task.getResult()).getAutocompletePredictions().size() : 0;
        com.google.android.libraries.places.internal.zzalh zza = com.google.android.libraries.places.internal.zzali.zza();
        zza.zza(size);
        com.google.android.libraries.places.internal.zzali zzaliVar = (com.google.android.libraries.places.internal.zzali) zza.zzG();
        com.google.android.libraries.places.internal.zzalu zza2 = com.google.android.libraries.places.internal.zzalz.zza();
        zza2.zzf(6);
        zza2.zzd(zzaliVar);
        zza2.zzg(zzp(task));
        zza2.zza((int) (j2 - j));
        zzt((com.google.android.libraries.places.internal.zzalz) zza2.zzG(), i, zzmyVar, zzbVar);
    }

    @Override // com.google.android.libraries.places.internal.zzmo
    public final void zzm(com.google.android.libraries.places.api.net.FetchPlaceRequest fetchPlaceRequest, int i, com.google.android.libraries.places.internal.zzmy zzmyVar) {
        com.google.android.libraries.places.internal.zzaoo zza = com.google.android.libraries.places.internal.zzaop.zza();
        zza.zza(1);
        com.google.android.libraries.places.internal.zzapo zza2 = com.google.android.libraries.places.internal.zzapp.zza();
        zza2.zza(com.google.android.libraries.places.internal.zzjl.zza(fetchPlaceRequest.getPlaceFields()));
        zza.zzb((com.google.android.libraries.places.internal.zzapp) zza2.zzG());
        com.google.android.libraries.places.internal.zzaop zzaopVar = (com.google.android.libraries.places.internal.zzaop) zza.zzG();
        com.google.android.libraries.places.internal.zzapt zzq = zzq();
        zzq.zzh(5);
        zzq.zzc(zzaopVar);
        com.google.android.libraries.places.internal.zzapv zzapvVar = (com.google.android.libraries.places.internal.zzapv) zzq.zzG();
        com.google.android.libraries.places.internal.zzaoc zzb = com.google.android.libraries.places.internal.zzng.zzb(this.zzb, i, zzmyVar, com.google.android.libraries.places.api.auth.zzb.zza);
        zzb.zzp(1);
        zzb.zzb(zzapvVar);
        zzb.zzj(this.zzc.zze());
        com.google.android.libraries.places.api.model.AutocompleteSessionToken sessionToken = fetchPlaceRequest.getSessionToken();
        if (sessionToken != null) {
            zzb.zzh(sessionToken.toString());
        }
        this.zza.zzb(zzb);
    }

    @Override // com.google.android.libraries.places.internal.zzmo
    public final void zzn(com.google.android.gms.tasks.Task task, long j, long j2, int i, com.google.android.libraries.places.internal.zzmy zzmyVar, com.google.android.libraries.places.api.auth.zzb zzbVar) {
        boolean isSuccessful = task.isSuccessful();
        com.google.android.libraries.places.internal.zzalm zza = com.google.android.libraries.places.internal.zzaln.zza();
        zza.zza(1);
        zza.zzb(isSuccessful ? 1 : 0);
        com.google.android.libraries.places.internal.zzaln zzalnVar = (com.google.android.libraries.places.internal.zzaln) zza.zzG();
        com.google.android.libraries.places.internal.zzalu zza2 = com.google.android.libraries.places.internal.zzalz.zza();
        zza2.zzf(8);
        zza2.zzb(zzalnVar);
        zza2.zzg(zzp(task));
        zza2.zza((int) (j2 - j));
        zzt((com.google.android.libraries.places.internal.zzalz) zza2.zzG(), i, zzmyVar, zzbVar);
    }

    @Override // com.google.android.libraries.places.internal.zzmo
    public final void zzo(com.google.android.libraries.places.api.net.FetchPlaceRequest fetchPlaceRequest, int i, com.google.android.libraries.places.internal.zzmy zzmyVar) {
        com.google.android.libraries.places.internal.zzaoo zza = com.google.android.libraries.places.internal.zzaop.zza();
        zza.zza(1);
        com.google.android.libraries.places.internal.zzapo zza2 = com.google.android.libraries.places.internal.zzapp.zza();
        zza2.zza(com.google.android.libraries.places.internal.zzjl.zza(fetchPlaceRequest.getPlaceFields()));
        zza.zzb((com.google.android.libraries.places.internal.zzapp) zza2.zzG());
        com.google.android.libraries.places.internal.zzaop zzaopVar = (com.google.android.libraries.places.internal.zzaop) zza.zzG();
        com.google.android.libraries.places.internal.zzapt zzq = zzq();
        zzq.zzh(5);
        zzq.zzg(zzaopVar);
        com.google.android.libraries.places.internal.zzapv zzapvVar = (com.google.android.libraries.places.internal.zzapv) zzq.zzG();
        com.google.android.libraries.places.internal.zzaoc zzb = com.google.android.libraries.places.internal.zzng.zzb(this.zzb, i, zzmyVar, com.google.android.libraries.places.api.auth.zzb.zza);
        zzb.zzp(1);
        zzb.zzb(zzapvVar);
        zzb.zzj(this.zzc.zze());
        this.zza.zzb(zzb);
    }

    zzfs(com.google.android.libraries.places.internal.zznf zznfVar, com.google.android.libraries.places.internal.zzmz zzmzVar, com.google.android.libraries.places.internal.zzmp zzmpVar) {
        this.zza = zznfVar;
        this.zzb = zzmzVar;
        this.zzc = zzmpVar;
    }
}
