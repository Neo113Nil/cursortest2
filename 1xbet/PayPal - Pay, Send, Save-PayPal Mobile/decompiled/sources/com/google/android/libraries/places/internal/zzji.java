package com.google.android.libraries.places.internal;

/* loaded from: classes4.dex */
final class zzji {
    private final com.google.common.collect.ImmutableMap zza = com.google.common.collect.ImmutableMap.builder().put(com.google.android.libraries.places.internal.zzayy.OPERATIONAL, com.google.android.libraries.places.api.model.Place.BusinessStatus.OPERATIONAL).put(com.google.android.libraries.places.internal.zzayy.CLOSED_TEMPORARILY, com.google.android.libraries.places.api.model.Place.BusinessStatus.CLOSED_TEMPORARILY).put(com.google.android.libraries.places.internal.zzayy.CLOSED_PERMANENTLY, com.google.android.libraries.places.api.model.Place.BusinessStatus.CLOSED_PERMANENTLY).buildOrThrow();
    private final com.google.common.collect.ImmutableMap zzb = com.google.common.collect.ImmutableMap.builder().put(com.google.android.libraries.places.internal.zzazu.ACCESS, com.google.android.libraries.places.api.model.OpeningHours.HoursType.ACCESS).put(com.google.android.libraries.places.internal.zzazu.BREAKFAST, com.google.android.libraries.places.api.model.OpeningHours.HoursType.BREAKFAST).put(com.google.android.libraries.places.internal.zzazu.BRUNCH, com.google.android.libraries.places.api.model.OpeningHours.HoursType.BRUNCH).put(com.google.android.libraries.places.internal.zzazu.DELIVERY, com.google.android.libraries.places.api.model.OpeningHours.HoursType.DELIVERY).put(com.google.android.libraries.places.internal.zzazu.DINNER, com.google.android.libraries.places.api.model.OpeningHours.HoursType.DINNER).put(com.google.android.libraries.places.internal.zzazu.DRIVE_THROUGH, com.google.android.libraries.places.api.model.OpeningHours.HoursType.DRIVE_THROUGH).put(com.google.android.libraries.places.internal.zzazu.HAPPY_HOUR, com.google.android.libraries.places.api.model.OpeningHours.HoursType.HAPPY_HOUR).put(com.google.android.libraries.places.internal.zzazu.KITCHEN, com.google.android.libraries.places.api.model.OpeningHours.HoursType.KITCHEN).put(com.google.android.libraries.places.internal.zzazu.LUNCH, com.google.android.libraries.places.api.model.OpeningHours.HoursType.LUNCH).put(com.google.android.libraries.places.internal.zzazu.ONLINE_SERVICE_HOURS, com.google.android.libraries.places.api.model.OpeningHours.HoursType.ONLINE_SERVICE_HOURS).put(com.google.android.libraries.places.internal.zzazu.PICKUP, com.google.android.libraries.places.api.model.OpeningHours.HoursType.PICKUP).put(com.google.android.libraries.places.internal.zzazu.SENIOR_HOURS, com.google.android.libraries.places.api.model.OpeningHours.HoursType.SENIOR_HOURS).put(com.google.android.libraries.places.internal.zzazu.TAKEOUT, com.google.android.libraries.places.api.model.OpeningHours.HoursType.TAKEOUT).buildOrThrow();
    private final com.google.common.collect.ImmutableMap zzc = com.google.common.collect.ImmutableMap.builder().put(com.google.android.libraries.places.internal.zzaxz.EV_CONNECTOR_TYPE_UNSPECIFIED, com.google.android.libraries.places.api.model.EVConnectorType.EV_CONNECTOR_TYPE_UNSPECIFIED).put(com.google.android.libraries.places.internal.zzaxz.EV_CONNECTOR_TYPE_OTHER, com.google.android.libraries.places.api.model.EVConnectorType.EV_CONNECTOR_TYPE_OTHER).put(com.google.android.libraries.places.internal.zzaxz.EV_CONNECTOR_TYPE_J1772, com.google.android.libraries.places.api.model.EVConnectorType.EV_CONNECTOR_TYPE_J1772).put(com.google.android.libraries.places.internal.zzaxz.EV_CONNECTOR_TYPE_TYPE_2, com.google.android.libraries.places.api.model.EVConnectorType.EV_CONNECTOR_TYPE_TYPE_2).put(com.google.android.libraries.places.internal.zzaxz.EV_CONNECTOR_TYPE_CHADEMO, com.google.android.libraries.places.api.model.EVConnectorType.EV_CONNECTOR_TYPE_CHADEMO).put(com.google.android.libraries.places.internal.zzaxz.EV_CONNECTOR_TYPE_CCS_COMBO_1, com.google.android.libraries.places.api.model.EVConnectorType.EV_CONNECTOR_TYPE_CCS_COMBO_1).put(com.google.android.libraries.places.internal.zzaxz.EV_CONNECTOR_TYPE_CCS_COMBO_2, com.google.android.libraries.places.api.model.EVConnectorType.EV_CONNECTOR_TYPE_CCS_COMBO_2).put(com.google.android.libraries.places.internal.zzaxz.EV_CONNECTOR_TYPE_TESLA, com.google.android.libraries.places.api.model.EVConnectorType.EV_CONNECTOR_TYPE_TESLA).put(com.google.android.libraries.places.internal.zzaxz.EV_CONNECTOR_TYPE_UNSPECIFIED_GB_T, com.google.android.libraries.places.api.model.EVConnectorType.EV_CONNECTOR_TYPE_UNSPECIFIED_GB_T).put(com.google.android.libraries.places.internal.zzaxz.EV_CONNECTOR_TYPE_UNSPECIFIED_WALL_OUTLET, com.google.android.libraries.places.api.model.EVConnectorType.EV_CONNECTOR_TYPE_UNSPECIFIED_WALL_OUTLET).put(com.google.android.libraries.places.internal.zzaxz.EV_CONNECTOR_TYPE_NACS, com.google.android.libraries.places.api.model.EVConnectorType.EV_CONNECTOR_TYPE_NACS).buildOrThrow();
    private final com.google.common.collect.ImmutableMap zzd = com.google.common.collect.ImmutableMap.builder().put(com.google.android.libraries.places.internal.zzayc.FUEL_TYPE_UNSPECIFIED, com.google.android.libraries.places.api.model.FuelPrice.FuelType.FUEL_TYPE_UNSPECIFIED).put(com.google.android.libraries.places.internal.zzayc.DIESEL, com.google.android.libraries.places.api.model.FuelPrice.FuelType.DIESEL).put(com.google.android.libraries.places.internal.zzayc.REGULAR_UNLEADED, com.google.android.libraries.places.api.model.FuelPrice.FuelType.REGULAR_UNLEADED).put(com.google.android.libraries.places.internal.zzayc.MIDGRADE, com.google.android.libraries.places.api.model.FuelPrice.FuelType.MIDGRADE).put(com.google.android.libraries.places.internal.zzayc.PREMIUM, com.google.android.libraries.places.api.model.FuelPrice.FuelType.PREMIUM).put(com.google.android.libraries.places.internal.zzayc.SP91, com.google.android.libraries.places.api.model.FuelPrice.FuelType.SP91).put(com.google.android.libraries.places.internal.zzayc.SP91_E10, com.google.android.libraries.places.api.model.FuelPrice.FuelType.SP91_E10).put(com.google.android.libraries.places.internal.zzayc.SP92, com.google.android.libraries.places.api.model.FuelPrice.FuelType.SP92).put(com.google.android.libraries.places.internal.zzayc.SP95, com.google.android.libraries.places.api.model.FuelPrice.FuelType.SP95).put(com.google.android.libraries.places.internal.zzayc.SP95_E10, com.google.android.libraries.places.api.model.FuelPrice.FuelType.SP95_E10).put(com.google.android.libraries.places.internal.zzayc.SP98, com.google.android.libraries.places.api.model.FuelPrice.FuelType.SP98).put(com.google.android.libraries.places.internal.zzayc.SP99, com.google.android.libraries.places.api.model.FuelPrice.FuelType.SP99).put(com.google.android.libraries.places.internal.zzayc.SP100, com.google.android.libraries.places.api.model.FuelPrice.FuelType.SP100).put(com.google.android.libraries.places.internal.zzayc.LPG, com.google.android.libraries.places.api.model.FuelPrice.FuelType.LPG).put(com.google.android.libraries.places.internal.zzayc.E80, com.google.android.libraries.places.api.model.FuelPrice.FuelType.E80).put(com.google.android.libraries.places.internal.zzayc.E85, com.google.android.libraries.places.api.model.FuelPrice.FuelType.E85).put(com.google.android.libraries.places.internal.zzayc.METHANE, com.google.android.libraries.places.api.model.FuelPrice.FuelType.METHANE).put(com.google.android.libraries.places.internal.zzayc.BIO_DIESEL, com.google.android.libraries.places.api.model.FuelPrice.FuelType.BIO_DIESEL).put(com.google.android.libraries.places.internal.zzayc.TRUCK_DIESEL, com.google.android.libraries.places.api.model.FuelPrice.FuelType.TRUCK_DIESEL).buildOrThrow();

    zzji() {
    }

    private final java.util.List zzf(java.util.List list) throws com.google.android.gms.common.api.ApiException {
        if (list.isEmpty()) {
            return null;
        }
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.util.Iterator it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(zzg((com.google.android.libraries.places.internal.zzazx) it.next()));
        }
        return arrayList;
    }

    private final com.google.android.libraries.places.api.model.OpeningHours zzg(com.google.android.libraries.places.internal.zzazx zzazxVar) throws com.google.android.gms.common.api.ApiException {
        com.google.android.libraries.places.api.model.OpeningHours.Builder builder = com.google.android.libraries.places.api.model.OpeningHours.builder();
        java.util.List zzd = zzazxVar.zzd();
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.util.Iterator it = zzd.iterator();
        while (true) {
            com.google.android.libraries.places.api.model.TimeOfWeek timeOfWeek = null;
            if (!it.hasNext()) {
                break;
            }
            com.google.android.libraries.places.internal.zzazt zzaztVar = (com.google.android.libraries.places.internal.zzazt) it.next();
            com.google.android.libraries.places.api.model.Period.Builder builder2 = com.google.android.libraries.places.api.model.Period.builder();
            builder2.setOpen(zzaztVar.zza() ? zzu(zzaztVar.zzc()) : null);
            if (zzaztVar.zzd()) {
                timeOfWeek = zzu(zzaztVar.zze());
            }
            builder2.setClose(timeOfWeek);
            arrayList.add(builder2.build());
        }
        builder.setPeriods(arrayList);
        builder.setWeekdayText(zzazxVar.zze());
        builder.setHoursType((com.google.android.libraries.places.api.model.OpeningHours.HoursType) this.zzb.getOrDefault(zzazxVar.zzf(), null));
        java.util.List zzg = zzazxVar.zzg();
        java.util.ArrayList arrayList2 = new java.util.ArrayList();
        java.util.Iterator it2 = zzg.iterator();
        while (it2.hasNext()) {
            try {
                com.google.android.libraries.places.api.model.SpecialDay.Builder builder3 = com.google.android.libraries.places.api.model.SpecialDay.builder(zzo(((com.google.android.libraries.places.internal.zzazw) it2.next()).zza()));
                builder3.setExceptional(true);
                arrayList2.add(builder3.build());
            } catch (java.lang.IllegalArgumentException e) {
                throw zzh(java.lang.String.format("Special day is not properly defined: %s", e.getMessage()));
            }
        }
        builder.setSpecialDays(arrayList2);
        builder.zza(zzazxVar.zza() ? java.lang.Boolean.valueOf(zzazxVar.zzc()) : null);
        builder.zzb(zzazxVar.zzh() ? zzj(zzazxVar.zzi()) : null);
        builder.zzc(zzazxVar.zzj() ? zzj(zzazxVar.zzk()) : null);
        return builder.build();
    }

    private static final com.google.android.gms.common.api.ApiException zzh(java.lang.String str) {
        return new com.google.android.gms.common.api.ApiException(new com.google.android.gms.common.api.Status(8, "Unexpected server error: ".concat(java.lang.String.valueOf(str))));
    }

    private static final java.lang.String zzi(java.lang.String str) {
        if (str.isEmpty()) {
            return null;
        }
        return str;
    }

    private static final java.time.Instant zzj(com.google.android.libraries.places.internal.zzbfw zzbfwVar) {
        return java.time.Instant.ofEpochSecond(zzbfwVar.zzc(), zzbfwVar.zze());
    }

    private static final com.google.android.libraries.places.api.model.Place.BooleanPlaceAttributeValue zzk(boolean z, boolean z2) {
        return !z ? com.google.android.libraries.places.api.model.Place.BooleanPlaceAttributeValue.UNKNOWN : z2 ? com.google.android.libraries.places.api.model.Place.BooleanPlaceAttributeValue.TRUE : com.google.android.libraries.places.api.model.Place.BooleanPlaceAttributeValue.FALSE;
    }

    private static final java.lang.String zzl(java.lang.String str) {
        return str.startsWith("//") ? "https:".concat(java.lang.String.valueOf(str)) : str;
    }

    private static final java.time.Instant zzm(com.google.android.libraries.places.internal.zzbfw zzbfwVar) {
        return java.time.Instant.ofEpochSecond(zzbfwVar.zzc(), zzbfwVar.zze());
    }

    private static final com.google.android.gms.maps.model.LatLng zzn(com.google.android.libraries.places.internal.zzbht zzbhtVar) {
        return new com.google.android.gms.maps.model.LatLng(zzbhtVar.zzc(), zzbhtVar.zze());
    }

    private static final com.google.android.libraries.places.api.model.LocalDate zzo(com.google.android.libraries.places.internal.zzbhr zzbhrVar) {
        return com.google.android.libraries.places.api.model.LocalDate.newInstance(zzbhrVar.zzc(), zzbhrVar.zze(), zzbhrVar.zzf());
    }

    private static final com.google.android.libraries.places.api.model.Money zzp(com.google.android.libraries.places.internal.zzbhx zzbhxVar) {
        return com.google.android.libraries.places.api.model.Money.newInstance(zzbhxVar.zzc(), java.lang.Long.valueOf(zzbhxVar.zze()), java.lang.Integer.valueOf(zzbhxVar.zzf()));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final java.lang.String zzq(java.lang.String str, java.lang.String str2) {
        com.google.android.libraries.places.internal.zzxj zzxjVar = new com.google.android.libraries.places.internal.zzxj("a");
        zzxjVar.zza(com.google.android.libraries.places.internal.zzxm.zza(str, com.google.android.libraries.places.internal.zzxl.zza));
        zzxjVar.zzb(str2);
        return zzxjVar.zzc().zza();
    }

    private static final android.net.Uri zzr(java.lang.String str) {
        if (str.isEmpty()) {
            return null;
        }
        return android.net.Uri.parse(str);
    }

    private static final com.google.android.libraries.places.api.model.AuthorAttribution zzs(com.google.android.libraries.places.internal.zzawg zzawgVar) throws com.google.android.gms.common.api.ApiException {
        java.lang.String zza = zzawgVar.zza();
        if (zza.isEmpty()) {
            throw zzh("Author name not provided for an AuthorAttribution result.");
        }
        com.google.android.libraries.places.api.model.AuthorAttribution.Builder builder = com.google.android.libraries.places.api.model.AuthorAttribution.builder(zza);
        builder.setUri(zzi(zzawgVar.zzc()));
        builder.setPhotoUri(zzi(zzawgVar.zzd()));
        return builder.build();
    }

    private static final com.google.android.libraries.places.api.model.ContentBlock zzt(com.google.android.libraries.places.internal.zzaxe zzaxeVar) {
        com.google.android.libraries.places.api.model.ContentBlock.Builder builder = com.google.android.libraries.places.api.model.ContentBlock.builder();
        builder.setContent(zzi(zzaxeVar.zza().zzc()));
        builder.setContentLanguageCode(zzi(zzaxeVar.zza().zze()));
        builder.setReferencedPlaceResourceNames(zzaxeVar.zzc().isEmpty() ? null : zzaxeVar.zzc());
        builder.setReferencedPlaceIds(zzaxeVar.zzc().isEmpty() ? null : (com.google.common.collect.ImmutableList) zzaxeVar.zzc().stream().map(com.google.android.libraries.places.internal.zzjh.zza).collect(com.google.common.collect.ImmutableList.toImmutableList()));
        return builder.build();
    }

    private static final com.google.android.libraries.places.api.model.TimeOfWeek zzu(com.google.android.libraries.places.internal.zzazs zzazsVar) throws com.google.android.gms.common.api.ApiException {
        com.google.android.libraries.places.api.model.DayOfWeek dayOfWeek;
        int zza = zzazsVar.zza();
        com.google.android.libraries.places.api.model.LocalTime newInstance = com.google.android.libraries.places.api.model.LocalTime.newInstance(zzazsVar.zzc(), zzazsVar.zzd());
        com.google.android.libraries.places.api.model.LocalDate zzo = zzazsVar.zze() ? zzo(zzazsVar.zzf()) : null;
        switch (zza) {
            case 0:
                dayOfWeek = com.google.android.libraries.places.api.model.DayOfWeek.SUNDAY;
                break;
            case 1:
                dayOfWeek = com.google.android.libraries.places.api.model.DayOfWeek.MONDAY;
                break;
            case 2:
                dayOfWeek = com.google.android.libraries.places.api.model.DayOfWeek.TUESDAY;
                break;
            case 3:
                dayOfWeek = com.google.android.libraries.places.api.model.DayOfWeek.WEDNESDAY;
                break;
            case 4:
                dayOfWeek = com.google.android.libraries.places.api.model.DayOfWeek.THURSDAY;
                break;
            case 5:
                dayOfWeek = com.google.android.libraries.places.api.model.DayOfWeek.FRIDAY;
                break;
            case 6:
                dayOfWeek = com.google.android.libraries.places.api.model.DayOfWeek.SATURDAY;
                break;
            default:
                throw zzh("Day of week must an integer between 0 and 6");
        }
        com.google.android.libraries.places.api.model.TimeOfWeek.Builder builder = com.google.android.libraries.places.api.model.TimeOfWeek.builder(dayOfWeek, newInstance);
        builder.setDate(zzo);
        builder.setTruncated(zzazsVar.zzg());
        return builder.build();
    }

    /* JADX WARN: Removed duplicated region for block: B:108:0x0737  */
    /* JADX WARN: Removed duplicated region for block: B:111:0x077d  */
    /* JADX WARN: Removed duplicated region for block: B:114:0x0794  */
    /* JADX WARN: Removed duplicated region for block: B:117:0x07be  */
    /* JADX WARN: Removed duplicated region for block: B:120:0x07f6  */
    /* JADX WARN: Removed duplicated region for block: B:123:0x0863  */
    /* JADX WARN: Removed duplicated region for block: B:126:0x0a10  */
    /* JADX WARN: Removed duplicated region for block: B:129:0x0a4f  */
    /* JADX WARN: Removed duplicated region for block: B:132:0x0a62  */
    /* JADX WARN: Removed duplicated region for block: B:135:0x0a75  */
    /* JADX WARN: Removed duplicated region for block: B:139:0x0a8f  */
    /* JADX WARN: Removed duplicated region for block: B:140:0x0a6b  */
    /* JADX WARN: Removed duplicated region for block: B:141:0x0a58  */
    /* JADX WARN: Removed duplicated region for block: B:142:0x0a12  */
    /* JADX WARN: Removed duplicated region for block: B:147:0x0866  */
    /* JADX WARN: Removed duplicated region for block: B:188:0x0855  */
    /* JADX WARN: Removed duplicated region for block: B:189:0x07c0  */
    /* JADX WARN: Removed duplicated region for block: B:190:0x07a1  */
    /* JADX WARN: Removed duplicated region for block: B:191:0x078a  */
    /* JADX WARN: Removed duplicated region for block: B:192:0x0739  */
    /* JADX WARN: Removed duplicated region for block: B:200:0x0725  */
    /* JADX WARN: Removed duplicated region for block: B:201:0x06f6  */
    /* JADX WARN: Removed duplicated region for block: B:202:0x06c6  */
    /* JADX WARN: Removed duplicated region for block: B:203:0x05f8  */
    /* JADX WARN: Removed duplicated region for block: B:227:0x0513  */
    /* JADX WARN: Removed duplicated region for block: B:230:0x0500  */
    /* JADX WARN: Removed duplicated region for block: B:231:0x0480  */
    /* JADX WARN: Removed duplicated region for block: B:232:0x0448  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x043d  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x0477  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x04a4  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x050a  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x05f5  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x06c4  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x06d3  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x0705  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    final com.google.android.libraries.places.api.model.Place zza(com.google.android.libraries.places.internal.zzbai zzbaiVar) throws com.google.android.gms.common.api.ApiException {
        com.google.android.libraries.places.api.model.AddressComponents newInstance;
        com.google.android.libraries.places.api.model.ConsumerAlert consumerAlert;
        com.google.android.libraries.places.api.model.EvChargeAmenitySummary evChargeAmenitySummary;
        com.google.android.libraries.places.api.model.EVChargeOptions eVChargeOptions;
        com.google.android.libraries.places.api.model.GenerativeSummary generativeSummary;
        com.google.android.libraries.places.api.model.GoogleMapsLinks googleMapsLinks;
        java.lang.Integer valueOf;
        com.google.android.libraries.places.api.model.NeighborhoodSummary neighborhoodSummary;
        java.util.List<com.google.android.libraries.places.internal.zzaym> zzC;
        java.util.ArrayList arrayList;
        com.google.android.libraries.places.api.model.AuthorAttributions newInstance2;
        com.google.android.libraries.places.api.model.PlusCode plusCode;
        com.google.android.libraries.places.api.model.zzgf zzc;
        com.google.android.libraries.places.api.model.ReviewSummary reviewSummary;
        java.util.List<com.google.android.libraries.places.internal.zzbau> zzx;
        java.util.ArrayList arrayList2;
        java.util.List<com.google.android.libraries.places.internal.zzbah> zzaN;
        java.util.ArrayList arrayList3;
        com.google.android.gms.maps.model.LatLngBounds latLngBounds;
        com.google.android.libraries.places.api.model.ConsumerAlertDetails consumerAlertDetails;
        com.google.android.libraries.places.api.model.Place.Builder builder = com.google.android.libraries.places.api.model.Place.builder();
        com.google.android.libraries.places.internal.zzayq zzaO = zzbaiVar.zzaO();
        com.google.android.libraries.places.api.model.AccessibilityOptions.Builder builder2 = com.google.android.libraries.places.api.model.AccessibilityOptions.builder();
        builder2.setWheelchairAccessibleParking(zzk(zzaO.zza(), zzaO.zzc()));
        builder2.setWheelchairAccessibleEntrance(zzk(zzaO.zzd(), zzaO.zze()));
        builder2.setWheelchairAccessibleRestroom(zzk(zzaO.zzf(), zzaO.zzg()));
        builder2.setWheelchairAccessibleSeating(zzk(zzaO.zzh(), zzaO.zzi()));
        builder.setAccessibilityOptions(builder2.build());
        java.util.List<com.google.android.libraries.places.internal.zzays> zzn = zzbaiVar.zzn();
        java.lang.String str = null;
        if (zzn.isEmpty()) {
            newInstance = null;
        } else {
            java.util.ArrayList arrayList4 = new java.util.ArrayList();
            for (com.google.android.libraries.places.internal.zzays zzaysVar : zzn) {
                try {
                    com.google.android.libraries.places.api.model.AddressComponent.Builder builder3 = com.google.android.libraries.places.api.model.AddressComponent.builder(zzaysVar.zza(), zzaysVar.zzd());
                    builder3.setShortName(zzi(zzaysVar.zzc()));
                    arrayList4.add(builder3.build());
                } catch (java.lang.IllegalArgumentException e) {
                    throw zzh(java.lang.String.format("AddressComponent is not properly defined: %s.", e.getMessage()));
                }
            }
            newInstance = com.google.android.libraries.places.api.model.AddressComponents.newInstance(arrayList4);
        }
        builder.setAddressComponents(newInstance);
        java.lang.String zzD = zzbaiVar.zzD();
        builder.setAdrFormatAddress(zzD.isEmpty() ? null : com.google.android.libraries.places.internal.zzxk.zza(zzD).zza());
        builder.setAllowsDogs(zzk(zzbaiVar.zzaD(), zzbaiVar.zzaE()));
        java.util.List zzG = zzbaiVar.zzG();
        builder.setAttributions(zzG.isEmpty() ? null : (java.util.List) zzG.stream().map(new java.util.function.Function(this) { // from class: com.google.android.libraries.places.internal.zzje
            @Override // java.util.function.Function
            public final /* synthetic */ java.lang.Object apply(java.lang.Object obj) {
                java.lang.String zzq;
                zzq = com.google.android.libraries.places.internal.zzji.zzq(com.google.android.libraries.places.internal.zzji.zzl(r1.zzc()), ((com.google.android.libraries.places.internal.zzayw) obj).zza());
                return zzq;
            }
        }).collect(com.google.common.collect.ImmutableList.toImmutableList()));
        builder.setBusinessStatus((com.google.android.libraries.places.api.model.Place.BusinessStatus) this.zza.getOrDefault(zzbaiVar.zzE(), null));
        if (zzbaiVar.zzbg()) {
            com.google.android.libraries.places.internal.zzaze zzbh = zzbaiVar.zzbh();
            com.google.android.libraries.places.api.model.ConsumerAlert.Builder builder4 = com.google.android.libraries.places.api.model.ConsumerAlert.builder();
            builder4.setOverview(zzi(zzbh.zza()));
            if (zzbh.zzc()) {
                com.google.android.libraries.places.internal.zzazd zzd = zzbh.zzd();
                com.google.android.libraries.places.api.model.ConsumerAlertDetails.Builder builder5 = com.google.android.libraries.places.api.model.ConsumerAlertDetails.builder();
                builder5.setTitle(zzi(zzd.zza()));
                builder5.setDescription(zzi(zzd.zzc()));
                builder5.setAboutLinkTitle(zzi(zzd.zzd().zza()));
                builder5.setAboutLinkUri(zzr(zzd.zzd().zzc()));
                consumerAlertDetails = builder5.build();
            } else {
                consumerAlertDetails = null;
            }
            builder4.setDetails(consumerAlertDetails);
            builder4.setLanguageCode(zzi(zzbh.zze()));
            consumerAlert = builder4.build();
        } else {
            consumerAlert = null;
        }
        builder.setConsumerAlert(consumerAlert);
        builder.setCurbsidePickup(zzk(zzbaiVar.zzR(), zzbaiVar.zzS()));
        builder.setCurrentOpeningHours(zzbaiVar.zzaj() ? zzg(zzbaiVar.zzak()) : null);
        builder.setCurrentSecondaryOpeningHours(zzf(zzbaiVar.zzal()));
        builder.setDelivery(zzk(zzbaiVar.zzN(), zzbaiVar.zzO()));
        builder.setDineIn(zzk(zzbaiVar.zzP(), zzbaiVar.zzQ()));
        builder.setDisplayName(zzbaiVar.zzd() ? zzi(zzbaiVar.zze().zzc()) : null);
        builder.setDisplayNameLanguageCode(zzbaiVar.zzd() ? zzi(zzbaiVar.zze().zze()) : null);
        builder.setEditorialSummary(zzbaiVar.zzan() ? zzi(zzbaiVar.zzao().zzc()) : null);
        builder.setEditorialSummaryLanguageCode(zzbaiVar.zzan() ? zzi(zzbaiVar.zzao().zze()) : null);
        if (zzbaiVar.zzbc()) {
            com.google.android.libraries.places.internal.zzazi zzbd = zzbaiVar.zzbd();
            com.google.android.libraries.places.api.model.EvChargeAmenitySummary.Builder builder6 = com.google.android.libraries.places.api.model.EvChargeAmenitySummary.builder(zzt(zzbd.zza()));
            builder6.setCoffee(zzbd.zzc() ? zzt(zzbd.zzd()) : null);
            builder6.setRestaurant(zzbd.zze() ? zzt(zzbd.zzf()) : null);
            builder6.setStore(zzbd.zzg() ? zzt(zzbd.zzh()) : null);
            builder6.setFlagContentUri(zzr(zzbd.zzi()));
            builder6.setDisclosureText(zzi(zzbd.zzj().zzc()));
            builder6.setDisclosureTextLanguageCode(zzi(zzbd.zzj().zze()));
            evChargeAmenitySummary = builder6.build();
        } else {
            evChargeAmenitySummary = null;
        }
        builder.setEvChargeAmenitySummary(evChargeAmenitySummary);
        if (zzbaiVar.zzaR()) {
            com.google.android.libraries.places.internal.zzaxy zzaS = zzbaiVar.zzaS();
            eVChargeOptions = com.google.android.libraries.places.api.model.EVChargeOptions.newInstance(java.lang.Integer.valueOf(zzaS.zza()), (com.google.common.collect.ImmutableList) zzaS.zzc().stream().map(new java.util.function.Function() { // from class: com.google.android.libraries.places.internal.zzjg
                @Override // java.util.function.Function
                public final /* synthetic */ java.lang.Object apply(java.lang.Object obj) {
                    return com.google.android.libraries.places.internal.zzji.this.zzc((com.google.android.libraries.places.internal.zzaxv) obj);
                }
            }).collect(com.google.common.collect.ImmutableList.toImmutableList()));
        } else {
            eVChargeOptions = null;
        }
        builder.setEvChargeOptions(eVChargeOptions);
        builder.setFormattedAddress(zzi(zzbaiVar.zzl()));
        builder.setFuelOptions(zzbaiVar.zzaP() ? com.google.android.libraries.places.api.model.FuelOptions.newInstance((com.google.common.collect.ImmutableList) zzbaiVar.zzaQ().zza().stream().map(new java.util.function.Function() { // from class: com.google.android.libraries.places.internal.zzjf
            @Override // java.util.function.Function
            public final /* synthetic */ java.lang.Object apply(java.lang.Object obj) {
                return com.google.android.libraries.places.internal.zzji.this.zzb((com.google.android.libraries.places.internal.zzayd) obj);
            }
        }).collect(com.google.common.collect.ImmutableList.toImmutableList())) : null);
        if (zzbaiVar.zzaT()) {
            com.google.android.libraries.places.internal.zzazk zzaU = zzbaiVar.zzaU();
            com.google.android.libraries.places.api.model.GenerativeSummary.Builder builder7 = com.google.android.libraries.places.api.model.GenerativeSummary.builder();
            builder7.setOverview(zzaU.zza() ? zzi(zzaU.zzc().zzc()) : null);
            builder7.setOverviewLanguageCode(zzaU.zza() ? zzi(zzaU.zzc().zze()) : null);
            builder7.setFlagContentUri(zzr(zzaU.zzd()));
            builder7.setDisclosureText(zzaU.zze() ? zzi(zzaU.zzf().zzc()) : null);
            builder7.setDisclosureTextLanguageCode(zzaU.zze() ? zzi(zzaU.zzf().zze()) : null);
            generativeSummary = builder7.build();
        } else {
            generativeSummary = null;
        }
        builder.setGenerativeSummary(generativeSummary);
        builder.setGoodForChildren(zzk(zzbaiVar.zzaB(), zzbaiVar.zzaC()));
        builder.setGoodForGroups(zzk(zzbaiVar.zzaH(), zzbaiVar.zzaI()));
        builder.setGoodForWatchingSports(zzk(zzbaiVar.zzaJ(), zzbaiVar.zzaK()));
        if (zzbaiVar.zzaX()) {
            com.google.android.libraries.places.internal.zzazm zzaY = zzbaiVar.zzaY();
            com.google.android.libraries.places.api.model.GoogleMapsLinks.Builder builder8 = com.google.android.libraries.places.api.model.GoogleMapsLinks.builder();
            builder8.setDirectionsUri(zzr(zzaY.zza()));
            builder8.setPlaceUri(zzr(zzaY.zzc()));
            builder8.setWriteAReviewUri(zzr(zzaY.zzd()));
            builder8.setReviewsUri(zzr(zzaY.zze()));
            builder8.setPhotosUri(zzr(zzaY.zzf()));
            googleMapsLinks = builder8.build();
        } else {
            googleMapsLinks = null;
        }
        builder.setGoogleMapsLinks(googleMapsLinks);
        builder.setGoogleMapsUri(zzr(zzbaiVar.zzv()));
        java.lang.String zzK = zzbaiVar.zzK();
        if (!zzK.isEmpty()) {
            try {
                valueOf = java.lang.Integer.valueOf(android.graphics.Color.parseColor(zzK));
            } catch (java.lang.IllegalArgumentException unused) {
            }
            builder.setIconBackgroundColor(valueOf);
            java.lang.String zzJ = zzbaiVar.zzJ();
            builder.setIconMaskUrl(zzJ.isEmpty() ? java.lang.String.valueOf(zzJ).concat(".png") : null);
            builder.setId(zzi(zzbaiVar.zzc()));
            builder.setInternationalPhoneNumber(zzi(zzbaiVar.zzk()));
            builder.setLiveMusic(zzk(zzbaiVar.zzar(), zzbaiVar.zzas()));
            builder.setLocation(!zzbaiVar.zzq() ? zzn(zzbaiVar.zzr()) : null);
            builder.setMenuForChildren(zzk(zzbaiVar.zzat(), zzbaiVar.zzau()));
            builder.setNationalPhoneNumber(zzi(zzbaiVar.zzj()));
            if (zzbaiVar.zzbe()) {
                neighborhoodSummary = null;
            } else {
                com.google.android.libraries.places.internal.zzazo zzbf = zzbaiVar.zzbf();
                com.google.android.libraries.places.api.model.NeighborhoodSummary.Builder builder9 = com.google.android.libraries.places.api.model.NeighborhoodSummary.builder();
                builder9.setOverview(zzbf.zza() ? zzt(zzbf.zzc()) : null);
                builder9.setDescription(zzbf.zzd() ? zzt(zzbf.zze()) : null);
                builder9.setFlagContentUri(zzr(zzbf.zzf()));
                builder9.setDisclosureText(zzi(zzbf.zzg().zzc()));
                builder9.setDisclosureTextLanguageCode(zzi(zzbf.zzg().zze()));
                neighborhoodSummary = builder9.build();
            }
            builder.setNeighborhoodSummary(neighborhoodSummary);
            builder.setOpeningHours(!zzbaiVar.zzy() ? zzg(zzbaiVar.zzz()) : null);
            builder.setOutdoorSeating(zzk(zzbaiVar.zzap(), zzbaiVar.zzaq()));
            com.google.android.libraries.places.internal.zzazz zzaM = zzbaiVar.zzaM();
            com.google.android.libraries.places.api.model.ParkingOptions.Builder builder10 = com.google.android.libraries.places.api.model.ParkingOptions.builder();
            builder10.setFreeParkingLot(zzk(zzaM.zza(), zzaM.zzc()));
            builder10.setPaidParkingLot(zzk(zzaM.zzd(), zzaM.zze()));
            builder10.setFreeStreetParking(zzk(zzaM.zzf(), zzaM.zzg()));
            builder10.setPaidStreetParking(zzk(zzaM.zzh(), zzaM.zzi()));
            builder10.setValetParking(zzk(zzaM.zzj(), zzaM.zzk()));
            builder10.setFreeGarageParking(zzk(zzaM.zzl(), zzaM.zzm()));
            builder10.setPaidGarageParking(zzk(zzaM.zzn(), zzaM.zzo()));
            builder.setParkingOptions(builder10.build());
            com.google.android.libraries.places.internal.zzbab zzaL = zzbaiVar.zzaL();
            com.google.android.libraries.places.api.model.PaymentOptions.Builder builder11 = com.google.android.libraries.places.api.model.PaymentOptions.builder();
            builder11.setAcceptsCreditCards(zzk(zzaL.zza(), zzaL.zzc()));
            builder11.setAcceptsDebitCards(zzk(zzaL.zzd(), zzaL.zze()));
            builder11.setAcceptsCashOnly(zzk(zzaL.zzf(), zzaL.zzg()));
            builder11.setAcceptsNfc(zzk(zzaL.zzh(), zzaL.zzi()));
            builder.setPaymentOptions(builder11.build());
            zzC = zzbaiVar.zzC();
            if (zzC.isEmpty()) {
                arrayList = new java.util.ArrayList();
                for (com.google.android.libraries.places.internal.zzaym zzaymVar : zzC) {
                    java.lang.String zza = zzaymVar.zza();
                    if (zza.isEmpty() || zza.split(androidx.view.exceptions.publickeycredential.DomExceptionUtils.SEPARATOR).length != 4) {
                        throw zzh("Photo reference not provided for a PhotoMetadata result.");
                    }
                    com.google.android.libraries.places.api.model.PhotoMetadata.Builder builder12 = com.google.android.libraries.places.api.model.PhotoMetadata.builder((java.lang.String) com.google.common.collect.Iterables.get(com.google.common.base.Splitter.on(kotlinx.io.files.FileSystemKt.UnixPathSeparator).split(zza), 3));
                    builder12.zzb(zzaymVar.zza());
                    builder12.setAttributions((java.lang.String) zzaymVar.zze().stream().map(new java.util.function.Function(this) { // from class: com.google.android.libraries.places.internal.zzjd
                        @Override // java.util.function.Function
                        public final /* synthetic */ java.lang.Object apply(java.lang.Object obj) {
                            java.lang.String zzq;
                            zzq = com.google.android.libraries.places.internal.zzji.zzq(com.google.android.libraries.places.internal.zzji.zzl(r1.zzc()), ((com.google.android.libraries.places.internal.zzawg) obj).zza());
                            return zzq;
                        }
                    }).collect(java.util.stream.Collectors.joining(", ")));
                    builder12.setHeight(zzaymVar.zzd());
                    builder12.setWidth(zzaymVar.zzc());
                    java.util.List zze = zzaymVar.zze();
                    if (zze.isEmpty()) {
                        newInstance2 = null;
                    } else {
                        com.google.common.collect.ImmutableList.Builder builder13 = com.google.common.collect.ImmutableList.builder();
                        java.util.Iterator it = zze.iterator();
                        while (it.hasNext()) {
                            builder13.add((com.google.common.collect.ImmutableList.Builder) zzs((com.google.android.libraries.places.internal.zzawg) it.next()));
                        }
                        newInstance2 = com.google.android.libraries.places.api.model.AuthorAttributions.newInstance(builder13.build());
                    }
                    builder12.setAuthorAttributions(newInstance2);
                    builder12.zzc(zzr(zzaymVar.zzf()));
                    arrayList.add(builder12.build());
                }
            } else {
                arrayList = null;
            }
            builder.setPhotoMetadatas(arrayList);
            builder.setPlaceTypes(!zzbaiVar.zzf().isEmpty() ? null : zzbaiVar.zzf());
            if (zzbaiVar.zzo()) {
                plusCode = null;
            } else {
                com.google.android.libraries.places.internal.zzbad zzp = zzbaiVar.zzp();
                com.google.android.libraries.places.api.model.PlusCode.Builder builder14 = com.google.android.libraries.places.api.model.PlusCode.builder();
                builder14.setCompoundCode(zzi(zzp.zzc()));
                builder14.setGlobalCode(zzi(zzp.zza()));
                plusCode = builder14.build();
            }
            builder.setPlusCode(plusCode);
            int ordinal = zzbaiVar.zzF().ordinal();
            builder.setPriceLevel(ordinal == 1 ? ordinal != 2 ? ordinal != 3 ? ordinal != 4 ? ordinal != 5 ? null : 4 : 3 : 2 : 1 : 0);
            if (zzbaiVar.zzaZ().zza()) {
                zzc = null;
            } else {
                com.google.android.libraries.places.api.model.zzge zzc2 = com.google.android.libraries.places.api.model.zzgf.zzc();
                zzc2.zza(zzp(zzbaiVar.zzaZ().zzc()));
                if (zzbaiVar.zzaZ().zzd()) {
                    zzc2.zzb(zzp(zzbaiVar.zzaZ().zze()));
                }
                zzc = zzc2.zzc();
            }
            builder.zza(zzc);
            builder.setPrimaryType(zzi(zzbaiVar.zzg()));
            builder.setPrimaryTypeDisplayName(!zzbaiVar.zzh() ? zzi(zzbaiVar.zzi().zzc()) : null);
            builder.setPrimaryTypeDisplayNameLanguageCode(!zzbaiVar.zzh() ? zzi(zzbaiVar.zzi().zze()) : null);
            builder.setPureServiceAreaBusiness(zzk(zzbaiVar.zzaV(), zzbaiVar.zzaW()));
            double zzu = zzbaiVar.zzu();
            builder.setRating(zzu >= 1.0d ? null : java.lang.Double.valueOf(zzu));
            builder.setReservable(zzk(zzbaiVar.zzT(), zzbaiVar.zzU()));
            builder.setResourceName(zzi(zzbaiVar.zza()));
            builder.setRestroom(zzk(zzbaiVar.zzaF(), zzbaiVar.zzaG()));
            if (zzbaiVar.zzba()) {
                reviewSummary = null;
            } else {
                com.google.android.libraries.places.internal.zzbaf zzbb = zzbaiVar.zzbb();
                com.google.android.libraries.places.api.model.ReviewSummary.Builder builder15 = com.google.android.libraries.places.api.model.ReviewSummary.builder();
                builder15.setText(zzi(zzbb.zza().zzc()));
                builder15.setTextLanguageCode(zzi(zzbb.zza().zze()));
                builder15.setFlagContentUri(zzr(zzbb.zzc()));
                builder15.setDisclosureText(zzi(zzbb.zzd().zzc()));
                builder15.setDisclosureTextLanguageCode(zzi(zzbb.zzd().zze()));
                builder15.setReviewsUri(zzr(zzbb.zze()));
                reviewSummary = builder15.build();
            }
            builder.setReviewSummary(reviewSummary);
            zzx = zzbaiVar.zzx();
            if (zzx.isEmpty()) {
                arrayList2 = new java.util.ArrayList();
                for (com.google.android.libraries.places.internal.zzbau zzbauVar : zzx) {
                    double zzg = zzbauVar.zzg();
                    if (zzg == 0.0d) {
                        throw zzh("Review rating not provided for a Review result.");
                    }
                    if (!zzbauVar.zzh()) {
                        throw zzh("Author attribution not provided for a Review result.");
                    }
                    java.lang.String zza2 = zzbauVar.zzj() ? com.google.android.libraries.places.internal.zzbgq.zza(zzbauVar.zzk()) : str;
                    java.lang.String zzi = zzbauVar.zzc() ? zzi(zzbauVar.zzd().zzc()) : str;
                    java.lang.String zzi2 = zzbauVar.zzc() ? zzi(zzbauVar.zzd().zze()) : str;
                    java.lang.String zzi3 = zzbauVar.zze() ? zzi(zzbauVar.zzf().zzc()) : str;
                    java.lang.String zzi4 = zzbauVar.zze() ? zzi(zzbauVar.zzf().zze()) : str;
                    java.lang.String zzi5 = zzi(zzbauVar.zza());
                    com.google.android.libraries.places.api.model.LocalDate newInstance3 = zzbauVar.zzm() ? com.google.android.libraries.places.api.model.LocalDate.newInstance(zzbauVar.zzn().zzc(), zzbauVar.zzn().zze(), 1) : null;
                    com.google.android.libraries.places.api.model.Review.Builder builder16 = com.google.android.libraries.places.api.model.Review.builder(java.lang.Double.valueOf(zzg), zzs(zzbauVar.zzi()));
                    builder16.setPublishTime(zza2);
                    builder16.setText(zzi);
                    builder16.setTextLanguageCode(zzi2);
                    builder16.setOriginalText(zzi3);
                    builder16.setOriginalTextLanguageCode(zzi4);
                    builder16.setRelativePublishTimeDescription(zzi5);
                    builder16.setFlagContentUri(zzr(zzbauVar.zzl()));
                    builder16.setVisitDate(newInstance3);
                    arrayList2.add(builder16.build());
                    str = null;
                }
            } else {
                arrayList2 = null;
            }
            builder.setReviews(arrayList2);
            builder.setSecondaryOpeningHours(zzf(zzbaiVar.zzam()));
            builder.setServesBeer(zzk(zzbaiVar.zzab(), zzbaiVar.zzac()));
            builder.setServesBreakfast(zzk(zzbaiVar.zzV(), zzbaiVar.zzW()));
            builder.setServesBrunch(zzk(zzbaiVar.zzaf(), zzbaiVar.zzag()));
            builder.setServesCocktails(zzk(zzbaiVar.zzav(), zzbaiVar.zzaw()));
            builder.setServesCoffee(zzk(zzbaiVar.zzaz(), zzbaiVar.zzaA()));
            builder.setServesDessert(zzk(zzbaiVar.zzax(), zzbaiVar.zzay()));
            builder.setServesDinner(zzk(zzbaiVar.zzZ(), zzbaiVar.zzaa()));
            builder.setServesLunch(zzk(zzbaiVar.zzX(), zzbaiVar.zzY()));
            builder.setServesVegetarianFood(zzk(zzbaiVar.zzah(), zzbaiVar.zzai()));
            builder.setServesWine(zzk(zzbaiVar.zzad(), zzbaiVar.zzae()));
            builder.setShortFormattedAddress(zzi(zzbaiVar.zzm()));
            zzaN = zzbaiVar.zzaN();
            if (zzaN.isEmpty()) {
                arrayList3 = new java.util.ArrayList();
                for (com.google.android.libraries.places.internal.zzbah zzbahVar : zzaN) {
                    arrayList3.add(com.google.android.libraries.places.api.model.SubDestination.newInstance(zzbahVar.zzc(), zzbahVar.zza()));
                }
            } else {
                arrayList3 = null;
            }
            builder.setSubDestinations(arrayList3);
            builder.setTakeout(zzk(zzbaiVar.zzL(), zzbaiVar.zzM()));
            builder.setUserRatingCount(!zzbaiVar.zzH() ? java.lang.Integer.valueOf(zzbaiVar.zzI()) : null);
            builder.setUtcOffsetMinutes(!zzbaiVar.zzA() ? java.lang.Integer.valueOf(zzbaiVar.zzB()) : null);
            if (zzbaiVar.zzs()) {
                latLngBounds = null;
            } else {
                com.google.android.libraries.places.internal.zzaua zzt = zzbaiVar.zzt();
                latLngBounds = new com.google.android.gms.maps.model.LatLngBounds(zzn(zzt.zza()), zzn(zzt.zzc()));
            }
            builder.setViewport(latLngBounds);
            builder.setWebsiteUri(zzr(zzbaiVar.zzw()));
            return builder.build();
        }
        valueOf = null;
        builder.setIconBackgroundColor(valueOf);
        java.lang.String zzJ2 = zzbaiVar.zzJ();
        builder.setIconMaskUrl(zzJ2.isEmpty() ? java.lang.String.valueOf(zzJ2).concat(".png") : null);
        builder.setId(zzi(zzbaiVar.zzc()));
        builder.setInternationalPhoneNumber(zzi(zzbaiVar.zzk()));
        builder.setLiveMusic(zzk(zzbaiVar.zzar(), zzbaiVar.zzas()));
        builder.setLocation(!zzbaiVar.zzq() ? zzn(zzbaiVar.zzr()) : null);
        builder.setMenuForChildren(zzk(zzbaiVar.zzat(), zzbaiVar.zzau()));
        builder.setNationalPhoneNumber(zzi(zzbaiVar.zzj()));
        if (zzbaiVar.zzbe()) {
        }
        builder.setNeighborhoodSummary(neighborhoodSummary);
        builder.setOpeningHours(!zzbaiVar.zzy() ? zzg(zzbaiVar.zzz()) : null);
        builder.setOutdoorSeating(zzk(zzbaiVar.zzap(), zzbaiVar.zzaq()));
        com.google.android.libraries.places.internal.zzazz zzaM2 = zzbaiVar.zzaM();
        com.google.android.libraries.places.api.model.ParkingOptions.Builder builder102 = com.google.android.libraries.places.api.model.ParkingOptions.builder();
        builder102.setFreeParkingLot(zzk(zzaM2.zza(), zzaM2.zzc()));
        builder102.setPaidParkingLot(zzk(zzaM2.zzd(), zzaM2.zze()));
        builder102.setFreeStreetParking(zzk(zzaM2.zzf(), zzaM2.zzg()));
        builder102.setPaidStreetParking(zzk(zzaM2.zzh(), zzaM2.zzi()));
        builder102.setValetParking(zzk(zzaM2.zzj(), zzaM2.zzk()));
        builder102.setFreeGarageParking(zzk(zzaM2.zzl(), zzaM2.zzm()));
        builder102.setPaidGarageParking(zzk(zzaM2.zzn(), zzaM2.zzo()));
        builder.setParkingOptions(builder102.build());
        com.google.android.libraries.places.internal.zzbab zzaL2 = zzbaiVar.zzaL();
        com.google.android.libraries.places.api.model.PaymentOptions.Builder builder112 = com.google.android.libraries.places.api.model.PaymentOptions.builder();
        builder112.setAcceptsCreditCards(zzk(zzaL2.zza(), zzaL2.zzc()));
        builder112.setAcceptsDebitCards(zzk(zzaL2.zzd(), zzaL2.zze()));
        builder112.setAcceptsCashOnly(zzk(zzaL2.zzf(), zzaL2.zzg()));
        builder112.setAcceptsNfc(zzk(zzaL2.zzh(), zzaL2.zzi()));
        builder.setPaymentOptions(builder112.build());
        zzC = zzbaiVar.zzC();
        if (zzC.isEmpty()) {
        }
        builder.setPhotoMetadatas(arrayList);
        builder.setPlaceTypes(!zzbaiVar.zzf().isEmpty() ? null : zzbaiVar.zzf());
        if (zzbaiVar.zzo()) {
        }
        builder.setPlusCode(plusCode);
        int ordinal2 = zzbaiVar.zzF().ordinal();
        builder.setPriceLevel(ordinal2 == 1 ? ordinal2 != 2 ? ordinal2 != 3 ? ordinal2 != 4 ? ordinal2 != 5 ? null : 4 : 3 : 2 : 1 : 0);
        if (zzbaiVar.zzaZ().zza()) {
        }
        builder.zza(zzc);
        builder.setPrimaryType(zzi(zzbaiVar.zzg()));
        builder.setPrimaryTypeDisplayName(!zzbaiVar.zzh() ? zzi(zzbaiVar.zzi().zzc()) : null);
        builder.setPrimaryTypeDisplayNameLanguageCode(!zzbaiVar.zzh() ? zzi(zzbaiVar.zzi().zze()) : null);
        builder.setPureServiceAreaBusiness(zzk(zzbaiVar.zzaV(), zzbaiVar.zzaW()));
        double zzu2 = zzbaiVar.zzu();
        builder.setRating(zzu2 >= 1.0d ? null : java.lang.Double.valueOf(zzu2));
        builder.setReservable(zzk(zzbaiVar.zzT(), zzbaiVar.zzU()));
        builder.setResourceName(zzi(zzbaiVar.zza()));
        builder.setRestroom(zzk(zzbaiVar.zzaF(), zzbaiVar.zzaG()));
        if (zzbaiVar.zzba()) {
        }
        builder.setReviewSummary(reviewSummary);
        zzx = zzbaiVar.zzx();
        if (zzx.isEmpty()) {
        }
        builder.setReviews(arrayList2);
        builder.setSecondaryOpeningHours(zzf(zzbaiVar.zzam()));
        builder.setServesBeer(zzk(zzbaiVar.zzab(), zzbaiVar.zzac()));
        builder.setServesBreakfast(zzk(zzbaiVar.zzV(), zzbaiVar.zzW()));
        builder.setServesBrunch(zzk(zzbaiVar.zzaf(), zzbaiVar.zzag()));
        builder.setServesCocktails(zzk(zzbaiVar.zzav(), zzbaiVar.zzaw()));
        builder.setServesCoffee(zzk(zzbaiVar.zzaz(), zzbaiVar.zzaA()));
        builder.setServesDessert(zzk(zzbaiVar.zzax(), zzbaiVar.zzay()));
        builder.setServesDinner(zzk(zzbaiVar.zzZ(), zzbaiVar.zzaa()));
        builder.setServesLunch(zzk(zzbaiVar.zzX(), zzbaiVar.zzY()));
        builder.setServesVegetarianFood(zzk(zzbaiVar.zzah(), zzbaiVar.zzai()));
        builder.setServesWine(zzk(zzbaiVar.zzad(), zzbaiVar.zzae()));
        builder.setShortFormattedAddress(zzi(zzbaiVar.zzm()));
        zzaN = zzbaiVar.zzaN();
        if (zzaN.isEmpty()) {
        }
        builder.setSubDestinations(arrayList3);
        builder.setTakeout(zzk(zzbaiVar.zzL(), zzbaiVar.zzM()));
        builder.setUserRatingCount(!zzbaiVar.zzH() ? java.lang.Integer.valueOf(zzbaiVar.zzI()) : null);
        builder.setUtcOffsetMinutes(!zzbaiVar.zzA() ? java.lang.Integer.valueOf(zzbaiVar.zzB()) : null);
        if (zzbaiVar.zzs()) {
        }
        builder.setViewport(latLngBounds);
        builder.setWebsiteUri(zzr(zzbaiVar.zzw()));
        return builder.build();
    }

    final /* synthetic */ com.google.android.libraries.places.api.model.FuelPrice zzb(com.google.android.libraries.places.internal.zzayd zzaydVar) {
        return com.google.android.libraries.places.api.model.FuelPrice.newInstance((com.google.android.libraries.places.api.model.FuelPrice.FuelType) this.zzd.getOrDefault(zzaydVar.zza(), com.google.android.libraries.places.api.model.FuelPrice.FuelType.FUEL_TYPE_UNSPECIFIED), zzp(zzaydVar.zzc()), zzm(zzaydVar.zzd()));
    }

    final /* synthetic */ com.google.android.libraries.places.api.model.ConnectorAggregation zzc(com.google.android.libraries.places.internal.zzaxv zzaxvVar) {
        com.google.android.libraries.places.api.model.ConnectorAggregation.Builder builder = com.google.android.libraries.places.api.model.ConnectorAggregation.builder((com.google.android.libraries.places.api.model.EVConnectorType) this.zzc.getOrDefault(zzaxvVar.zza(), com.google.android.libraries.places.api.model.EVConnectorType.EV_CONNECTOR_TYPE_UNSPECIFIED), java.lang.Double.valueOf(zzaxvVar.zzc()), java.lang.Integer.valueOf(zzaxvVar.zzd()));
        builder.setAvailableCount(zzaxvVar.zze() ? java.lang.Integer.valueOf(zzaxvVar.zzf()) : null);
        builder.setOutOfServiceCount(zzaxvVar.zzg() ? java.lang.Integer.valueOf(zzaxvVar.zzh()) : null);
        builder.setAvailabilityLastUpdateTime(zzaxvVar.zzi() ? zzm(zzaxvVar.zzj()) : null);
        return builder.build();
    }
}
