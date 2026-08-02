package com.google.android.libraries.places.internal;

/* loaded from: classes4.dex */
final class zzlq {
    private static final com.google.common.collect.ImmutableMap zza = com.google.common.collect.ImmutableMap.builder().put("OPERATIONAL", com.google.android.libraries.places.api.model.Place.BusinessStatus.OPERATIONAL).put("CLOSED_TEMPORARILY", com.google.android.libraries.places.api.model.Place.BusinessStatus.CLOSED_TEMPORARILY).put("CLOSED_PERMANENTLY", com.google.android.libraries.places.api.model.Place.BusinessStatus.CLOSED_PERMANENTLY).buildOrThrow();
    private static final com.google.common.collect.ImmutableMap zzb = com.google.common.collect.ImmutableMap.builder().put("ACCESS", com.google.android.libraries.places.api.model.OpeningHours.HoursType.ACCESS).put("BREAKFAST", com.google.android.libraries.places.api.model.OpeningHours.HoursType.BREAKFAST).put("BRUNCH", com.google.android.libraries.places.api.model.OpeningHours.HoursType.BRUNCH).put("DELIVERY", com.google.android.libraries.places.api.model.OpeningHours.HoursType.DELIVERY).put("DINNER", com.google.android.libraries.places.api.model.OpeningHours.HoursType.DINNER).put("DRIVE_THROUGH", com.google.android.libraries.places.api.model.OpeningHours.HoursType.DRIVE_THROUGH).put("HAPPY_HOUR", com.google.android.libraries.places.api.model.OpeningHours.HoursType.HAPPY_HOUR).put("KITCHEN", com.google.android.libraries.places.api.model.OpeningHours.HoursType.KITCHEN).put("LUNCH", com.google.android.libraries.places.api.model.OpeningHours.HoursType.LUNCH).put("ONLINE_SERVICE_HOURS", com.google.android.libraries.places.api.model.OpeningHours.HoursType.ONLINE_SERVICE_HOURS).put("PICKUP", com.google.android.libraries.places.api.model.OpeningHours.HoursType.PICKUP).put("SENIOR_HOURS", com.google.android.libraries.places.api.model.OpeningHours.HoursType.SENIOR_HOURS).put("TAKEOUT", com.google.android.libraries.places.api.model.OpeningHours.HoursType.TAKEOUT).buildOrThrow();

    static com.google.android.libraries.places.api.model.TimeOfWeek zza(com.google.android.libraries.places.internal.zzlt.zzd.zzc zzcVar) {
        com.google.android.libraries.places.api.model.LocalTime localTime;
        com.google.android.libraries.places.api.model.DayOfWeek dayOfWeek;
        com.google.android.libraries.places.api.model.LocalDate localDate = null;
        if (zzcVar == null) {
            return null;
        }
        try {
            java.lang.Integer num = (java.lang.Integer) com.google.common.base.Preconditions.checkNotNull(zzcVar.zza(), "Unable to convert Pablo response to TimeOfWeek: The \"day\" field is missing.");
            java.lang.String str = (java.lang.String) com.google.common.base.Preconditions.checkNotNull(zzcVar.zzb(), "Unable to convert Pablo response to TimeOfWeek: The \"time\" field is missing.");
            if (str != null) {
                java.lang.String format = java.lang.String.format("Unable to convert %s to LocalTime, must be of format \"hhmm\".", str);
                com.google.common.base.Preconditions.checkArgument(str.length() == 4, format);
                try {
                    localTime = com.google.android.libraries.places.api.model.LocalTime.newInstance(java.lang.Integer.parseInt(str.substring(0, 2)), java.lang.Integer.parseInt(str.substring(2, 4)));
                } catch (java.lang.NumberFormatException e) {
                    throw new java.lang.IllegalArgumentException(format, e);
                }
            } else {
                localTime = null;
            }
            com.google.android.libraries.places.api.model.LocalTime localTime2 = (com.google.android.libraries.places.api.model.LocalTime) com.google.common.base.Preconditions.checkNotNull(localTime);
            try {
                localDate = zzb(zzcVar.zzc());
            } catch (java.lang.IllegalArgumentException unused) {
            }
            switch (num.intValue()) {
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
                    throw new java.lang.IllegalArgumentException("pabloDayOfWeek can only be an integer between 0 and 6");
            }
            com.google.android.libraries.places.api.model.TimeOfWeek.Builder builder = com.google.android.libraries.places.api.model.TimeOfWeek.builder(dayOfWeek, localTime2);
            builder.setDate(localDate);
            builder.setTruncated(java.util.Objects.equals(zzcVar.zzd(), java.lang.Boolean.TRUE));
            return builder.build();
        } catch (java.lang.NullPointerException e2) {
            throw new java.lang.IllegalArgumentException(e2.getMessage(), e2);
        }
    }

    static com.google.android.libraries.places.api.model.LocalDate zzb(java.lang.String str) {
        if (str == null) {
            return null;
        }
        try {
            return com.google.android.libraries.places.api.model.LocalDate.newInstance(java.lang.Integer.parseInt(str.substring(0, 4)), java.lang.Integer.parseInt(str.substring(5, 7)), java.lang.Integer.parseInt(str.substring(8, 10)));
        } catch (java.lang.IllegalArgumentException e) {
            throw new java.lang.IllegalArgumentException(java.lang.String.format("Unable to convert %s to LocalDate; date should be in format YYYY-MM-DD.", str), e);
        }
    }

    static java.util.List zzc(java.util.List list) {
        if (list.isEmpty()) {
            return null;
        }
        return list;
    }

    static com.google.android.libraries.places.api.model.Place.BooleanPlaceAttributeValue zzd(java.lang.Boolean bool) {
        return bool == null ? com.google.android.libraries.places.api.model.Place.BooleanPlaceAttributeValue.UNKNOWN : bool.booleanValue() ? com.google.android.libraries.places.api.model.Place.BooleanPlaceAttributeValue.TRUE : com.google.android.libraries.places.api.model.Place.BooleanPlaceAttributeValue.FALSE;
    }

    static java.util.List zze(java.util.List list) {
        return list != null ? list : new java.util.ArrayList();
    }

    /* JADX WARN: Removed duplicated region for block: B:25:0x0112  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0121  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x015d  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x01e4  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x0222  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x01e6  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x01cf  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x0123  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x0114  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    static final com.google.android.libraries.places.api.model.Place zzf(com.google.android.libraries.places.internal.zzlt zzltVar, java.util.List list) throws com.google.android.gms.common.api.ApiException {
        com.google.android.libraries.places.api.model.AddressComponents newInstance;
        com.google.android.libraries.places.api.model.AddressComponent build;
        com.google.android.gms.maps.model.LatLng latLng;
        com.google.android.gms.maps.model.LatLngBounds latLngBounds;
        java.lang.Integer valueOf;
        com.google.common.collect.ImmutableList<com.google.android.libraries.places.internal.zzlt.zze> zzo;
        java.util.ArrayList arrayList;
        com.google.android.libraries.places.internal.zzlt.zzf zzq;
        com.google.android.libraries.places.api.model.PlusCode build2;
        com.google.common.collect.ImmutableList zzu;
        com.google.android.libraries.places.api.model.PhotoMetadata build3;
        com.google.android.libraries.places.api.model.Place.Builder builder = com.google.android.libraries.places.api.model.Place.builder();
        builder.setAttributions(list);
        if (zzltVar != null) {
            com.google.common.collect.ImmutableList<com.google.android.libraries.places.internal.zzlt.zza> zza2 = zzltVar.zza();
            java.util.ArrayList arrayList2 = null;
            if (zza2.isEmpty()) {
                newInstance = null;
            } else {
                java.util.ArrayList arrayList3 = new java.util.ArrayList();
                for (com.google.android.libraries.places.internal.zzlt.zza zzaVar : zza2) {
                    if (zzaVar == null) {
                        build = null;
                    } else {
                        try {
                            com.google.android.libraries.places.api.model.AddressComponent.Builder builder2 = com.google.android.libraries.places.api.model.AddressComponent.builder((java.lang.String) com.google.common.base.Preconditions.checkNotNull(zzaVar.zza()), zzaVar.zzc());
                            builder2.setShortName(zzaVar.zzb());
                            build = builder2.build();
                        } catch (java.lang.IllegalStateException | java.lang.NullPointerException e) {
                            throw zzi(java.lang.String.format("AddressComponent not properly defined (%s).", e.getMessage()));
                        }
                    }
                    zzj(arrayList3, build);
                }
                newInstance = com.google.android.libraries.places.api.model.AddressComponents.newInstance(arrayList3);
            }
            com.google.android.libraries.places.internal.zzlt.zzc zzi = zzltVar.zzi();
            if (zzi != null) {
                latLng = zzh(zzi.zza());
                com.google.android.libraries.places.internal.zzlt.zzc.zzb zzb2 = zzi.zzb();
                if (zzb2 != null) {
                    com.google.android.gms.maps.model.LatLng zzh = zzh(zzb2.zzb());
                    com.google.android.gms.maps.model.LatLng zzh2 = zzh(zzb2.zza());
                    if (zzh != null && zzh2 != null) {
                        latLngBounds = new com.google.android.gms.maps.model.LatLngBounds(zzh, zzh2);
                    }
                }
                latLngBounds = null;
            } else {
                latLng = null;
                latLngBounds = null;
            }
            java.lang.String zzF = zzltVar.zzF();
            android.net.Uri parse = zzF != null ? android.net.Uri.parse(zzF) : null;
            java.lang.String zzk = zzltVar.zzk();
            java.lang.String concat = zzk != null ? zzk.concat(".png") : null;
            java.lang.String zzj = zzltVar.zzj();
            if (zzj != null) {
                try {
                    valueOf = java.lang.Integer.valueOf(android.graphics.Color.parseColor(zzj));
                } catch (java.lang.IllegalArgumentException unused) {
                }
                builder.setAddressComponents(newInstance);
                builder.setBusinessStatus((com.google.android.libraries.places.api.model.Place.BusinessStatus) zza.getOrDefault(zzltVar.zzb(), null));
                builder.setCurbsidePickup(zzd(zzltVar.zzc()));
                builder.setCurrentOpeningHours(zzg(zzltVar.zzd()));
                builder.setDelivery(zzd(zzltVar.zze()));
                builder.setDineIn(zzd(zzltVar.zzf()));
                builder.setDisplayName(zzltVar.zzm());
                com.google.android.libraries.places.internal.zzlt.zzb zzg = zzltVar.zzg();
                builder.setEditorialSummary(zzg != null ? null : zzg.zzb());
                com.google.android.libraries.places.internal.zzlt.zzb zzg2 = zzltVar.zzg();
                builder.setEditorialSummaryLanguageCode(zzg2 != null ? null : zzg2.zza());
                builder.setFormattedAddress(zzltVar.zzh());
                builder.setIconBackgroundColor(valueOf);
                builder.setIconMaskUrl(concat);
                builder.setId(zzltVar.zzp());
                builder.setInternationalPhoneNumber(zzltVar.zzl());
                builder.setLocation(latLng);
                builder.setOpeningHours(zzg(zzltVar.zzn()));
                zzo = zzltVar.zzo();
                if (zzo.isEmpty()) {
                    arrayList = new java.util.ArrayList();
                    for (com.google.android.libraries.places.internal.zzlt.zze zzeVar : zzo) {
                        if (zzeVar == null) {
                            build3 = null;
                        } else {
                            java.lang.String zzc = zzeVar.zzc();
                            if (android.text.TextUtils.isEmpty(zzc)) {
                                throw zzi("Photo reference not provided for a PhotoMetadata result.");
                            }
                            java.lang.Integer zza3 = zzeVar.zza();
                            java.lang.Integer zzb3 = zzeVar.zzb();
                            com.google.android.libraries.places.api.model.PhotoMetadata.Builder builder3 = com.google.android.libraries.places.api.model.PhotoMetadata.builder(zzc);
                            com.google.common.collect.ImmutableList zzd = zzeVar.zzd();
                            builder3.setAttributions(zzd.isEmpty() ? "" : com.google.common.base.Joiner.on(", ").skipNulls().join(zzd));
                            builder3.setHeight(zza3 == null ? 0 : zza3.intValue());
                            builder3.setWidth(zzb3 != null ? zzb3.intValue() : 0);
                            build3 = builder3.build();
                        }
                        zzj(arrayList, build3);
                    }
                } else {
                    arrayList = null;
                }
                builder.setPhotoMetadatas(arrayList);
                builder.setPlaceTypes(zzc(zzltVar.zzC()));
                zzq = zzltVar.zzq();
                if (zzq != null) {
                    build2 = null;
                } else {
                    com.google.android.libraries.places.api.model.PlusCode.Builder builder4 = com.google.android.libraries.places.api.model.PlusCode.builder();
                    builder4.setCompoundCode(zzq.zza());
                    builder4.setGlobalCode(zzq.zzb());
                    build2 = builder4.build();
                }
                builder.setPlusCode(build2);
                builder.setPriceLevel(zzltVar.zzr());
                builder.setRating(zzltVar.zzs());
                builder.setReservable(zzd(zzltVar.zzt()));
                zzu = zzltVar.zzu();
                if (!zzu.isEmpty()) {
                    java.util.ArrayList arrayList4 = new java.util.ArrayList();
                    java.util.Iterator<E> it = zzu.iterator();
                    while (it.hasNext()) {
                        zzj(arrayList4, zzg((com.google.android.libraries.places.internal.zzlt.zzd) it.next()));
                    }
                    if (!arrayList4.isEmpty()) {
                        arrayList2 = arrayList4;
                    }
                }
                builder.setSecondaryOpeningHours(arrayList2);
                builder.setServesBeer(zzd(zzltVar.zzv()));
                builder.setServesBreakfast(zzd(zzltVar.zzw()));
                builder.setServesBrunch(zzd(zzltVar.zzw()));
                builder.setServesDinner(zzd(zzltVar.zzx()));
                builder.setServesLunch(zzd(zzltVar.zzy()));
                builder.setServesVegetarianFood(zzd(zzltVar.zzz()));
                builder.setServesWine(zzd(zzltVar.zzA()));
                builder.setTakeout(zzd(zzltVar.zzB()));
                builder.setUserRatingCount(zzltVar.zzD());
                builder.setUtcOffsetMinutes(zzltVar.zzE());
                builder.setViewport(latLngBounds);
                builder.setWebsiteUri(parse);
            }
            valueOf = null;
            builder.setAddressComponents(newInstance);
            builder.setBusinessStatus((com.google.android.libraries.places.api.model.Place.BusinessStatus) zza.getOrDefault(zzltVar.zzb(), null));
            builder.setCurbsidePickup(zzd(zzltVar.zzc()));
            builder.setCurrentOpeningHours(zzg(zzltVar.zzd()));
            builder.setDelivery(zzd(zzltVar.zze()));
            builder.setDineIn(zzd(zzltVar.zzf()));
            builder.setDisplayName(zzltVar.zzm());
            com.google.android.libraries.places.internal.zzlt.zzb zzg3 = zzltVar.zzg();
            builder.setEditorialSummary(zzg3 != null ? null : zzg3.zzb());
            com.google.android.libraries.places.internal.zzlt.zzb zzg22 = zzltVar.zzg();
            builder.setEditorialSummaryLanguageCode(zzg22 != null ? null : zzg22.zza());
            builder.setFormattedAddress(zzltVar.zzh());
            builder.setIconBackgroundColor(valueOf);
            builder.setIconMaskUrl(concat);
            builder.setId(zzltVar.zzp());
            builder.setInternationalPhoneNumber(zzltVar.zzl());
            builder.setLocation(latLng);
            builder.setOpeningHours(zzg(zzltVar.zzn()));
            zzo = zzltVar.zzo();
            if (zzo.isEmpty()) {
            }
            builder.setPhotoMetadatas(arrayList);
            builder.setPlaceTypes(zzc(zzltVar.zzC()));
            zzq = zzltVar.zzq();
            if (zzq != null) {
            }
            builder.setPlusCode(build2);
            builder.setPriceLevel(zzltVar.zzr());
            builder.setRating(zzltVar.zzs());
            builder.setReservable(zzd(zzltVar.zzt()));
            zzu = zzltVar.zzu();
            if (!zzu.isEmpty()) {
            }
            builder.setSecondaryOpeningHours(arrayList2);
            builder.setServesBeer(zzd(zzltVar.zzv()));
            builder.setServesBreakfast(zzd(zzltVar.zzw()));
            builder.setServesBrunch(zzd(zzltVar.zzw()));
            builder.setServesDinner(zzd(zzltVar.zzx()));
            builder.setServesLunch(zzd(zzltVar.zzy()));
            builder.setServesVegetarianFood(zzd(zzltVar.zzz()));
            builder.setServesWine(zzd(zzltVar.zzA()));
            builder.setTakeout(zzd(zzltVar.zzB()));
            builder.setUserRatingCount(zzltVar.zzD());
            builder.setUtcOffsetMinutes(zzltVar.zzE());
            builder.setViewport(latLngBounds);
            builder.setWebsiteUri(parse);
        }
        return builder.build();
    }

    private static com.google.android.libraries.places.api.model.OpeningHours zzg(com.google.android.libraries.places.internal.zzlt.zzd zzdVar) {
        java.util.ArrayList arrayList;
        com.google.android.libraries.places.api.model.SpecialDay build;
        com.google.android.libraries.places.api.model.Period period;
        if (zzdVar == null) {
            return null;
        }
        com.google.android.libraries.places.api.model.OpeningHours.Builder builder = com.google.android.libraries.places.api.model.OpeningHours.builder();
        com.google.common.collect.ImmutableList<com.google.android.libraries.places.internal.zzlt.zzd.zza> zza2 = zzdVar.zza();
        if (zza2.isEmpty()) {
            arrayList = null;
        } else {
            arrayList = new java.util.ArrayList();
            for (com.google.android.libraries.places.internal.zzlt.zzd.zza zzaVar : zza2) {
                if (zzaVar != null) {
                    com.google.android.libraries.places.api.model.Period.Builder builder2 = com.google.android.libraries.places.api.model.Period.builder();
                    builder2.setOpen(zza(zzaVar.zzb()));
                    builder2.setClose(zza(zzaVar.zza()));
                    period = builder2.build();
                } else {
                    period = null;
                }
                zzj(arrayList, period);
            }
        }
        builder.setPeriods(zze(arrayList));
        builder.setWeekdayText(zzdVar.zzb());
        builder.setHoursType((com.google.android.libraries.places.api.model.OpeningHours.HoursType) zzb.getOrDefault(zzdVar.zzc(), null));
        com.google.common.collect.ImmutableList<com.google.android.libraries.places.internal.zzlt.zzd.zzb> zzd = zzdVar.zzd();
        java.util.ArrayList arrayList2 = new java.util.ArrayList();
        if (!zzd.isEmpty()) {
            for (com.google.android.libraries.places.internal.zzlt.zzd.zzb zzbVar : zzd) {
                if (zzbVar != null) {
                    try {
                        com.google.android.libraries.places.api.model.SpecialDay.Builder builder3 = com.google.android.libraries.places.api.model.SpecialDay.builder((com.google.android.libraries.places.api.model.LocalDate) com.google.common.base.Preconditions.checkNotNull(zzb(zzbVar.zza())));
                        builder3.setExceptional(java.util.Objects.equals(zzbVar.zzb(), java.lang.Boolean.TRUE));
                        build = builder3.build();
                    } catch (java.lang.IllegalArgumentException | java.lang.NullPointerException unused) {
                    }
                    zzj(arrayList2, build);
                }
                build = null;
                zzj(arrayList2, build);
            }
        }
        builder.setSpecialDays(arrayList2);
        return builder.build();
    }

    private static com.google.android.gms.maps.model.LatLng zzh(com.google.android.libraries.places.internal.zzlt.zzc.zza zzaVar) {
        if (zzaVar == null) {
            return null;
        }
        java.lang.Double zza2 = zzaVar.zza();
        java.lang.Double zzb2 = zzaVar.zzb();
        if (zza2 == null || zzb2 == null) {
            return null;
        }
        return new com.google.android.gms.maps.model.LatLng(zza2.doubleValue(), zzb2.doubleValue());
    }

    private static com.google.android.gms.common.api.ApiException zzi(java.lang.String str) {
        return new com.google.android.gms.common.api.ApiException(new com.google.android.gms.common.api.Status(8, "Unexpected server error: ".concat(java.lang.String.valueOf(str))));
    }

    private static boolean zzj(java.util.Collection collection, java.lang.Object obj) {
        if (obj != null) {
            return collection.add(obj);
        }
        return false;
    }

    zzlq() {
    }
}
