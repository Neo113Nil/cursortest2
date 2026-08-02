package com.google.android.libraries.places.widget.internal.placedetails;

/* loaded from: classes8.dex */
public final class zzag {
    public static final com.google.android.libraries.places.widget.internal.placedetails.zzag zza = new com.google.android.libraries.places.widget.internal.placedetails.zzag();

    public static final int zza(com.google.android.libraries.places.api.model.Place place, android.content.Context context, int i) {
        int i2;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(place, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(context, "");
        int color = context.getResources().getColor(com.google.android.libraries.places.R.color.places_color_on_surface_variant, context.getTheme());
        int[] iArr = com.google.android.libraries.places.R.styleable.PlacesMaterialThemeAttrs;
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(iArr, "");
        android.content.res.TypedArray obtainStyledAttributes = context.obtainStyledAttributes(i, iArr);
        switch (com.google.android.libraries.places.widget.internal.placedetails.zzaf.zza[zzi(place).ordinal()]) {
            case 1:
            case 3:
                i2 = com.google.android.libraries.places.R.styleable.PlacesMaterialThemeAttrs_placesColorPositive;
                break;
            case 2:
            case 4:
            case 5:
                i2 = com.google.android.libraries.places.R.styleable.PlacesMaterialThemeAttrs_placesColorNegative;
                break;
            case 6:
                i2 = com.google.android.libraries.places.R.styleable.PlacesMaterialThemeAttrs_placesColorOnSurfaceVariant;
                break;
            default:
                throw new kotlin.NoWhenBranchMatchedException();
        }
        int color2 = obtainStyledAttributes.getColor(i2, color);
        obtainStyledAttributes.recycle();
        return color2;
    }

    public static final java.lang.String zzb(com.google.android.libraries.places.api.model.Place place, java.time.Instant instant, android.content.Context context) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(place, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(context, "");
        com.google.android.libraries.places.api.model.OpeningHours currentOpeningHours = place.getCurrentOpeningHours();
        java.time.Instant zzc = currentOpeningHours != null ? currentOpeningHours.zzc() : null;
        com.google.android.libraries.places.api.model.OpeningHours currentOpeningHours2 = place.getCurrentOpeningHours();
        java.time.Instant zzb = currentOpeningHours2 != null ? currentOpeningHours2.zzb() : null;
        if (place.getUtcOffsetMinutes() == null || instant == null) {
            return null;
        }
        if (zzi(place) == com.google.android.libraries.places.widget.internal.placedetails.zzae.zzb && zzc != null) {
            java.lang.Integer utcOffsetMinutes = place.getUtcOffsetMinutes();
            kotlin.jvm.internal.Intrinsics.checkNotNull(utcOffsetMinutes);
            java.lang.String zzg = zzg(zzc, utcOffsetMinutes.intValue(), instant, context);
            if (zzg == null) {
                int i = com.google.android.libraries.places.R.string.place_details_next_close_time;
                java.lang.Integer utcOffsetMinutes2 = place.getUtcOffsetMinutes();
                kotlin.jvm.internal.Intrinsics.checkNotNull(utcOffsetMinutes2);
                return context.getString(i, zzh(zzc, utcOffsetMinutes2.intValue(), context));
            }
            int i2 = com.google.android.libraries.places.R.string.place_details_next_close_time_and_day;
            java.lang.Integer utcOffsetMinutes3 = place.getUtcOffsetMinutes();
            kotlin.jvm.internal.Intrinsics.checkNotNull(utcOffsetMinutes3);
            return context.getString(i2, zzh(zzc, utcOffsetMinutes3.intValue(), context), zzg);
        }
        if (zzi(place) == com.google.android.libraries.places.widget.internal.placedetails.zzae.zzd && zzb != null) {
            java.lang.Integer utcOffsetMinutes4 = place.getUtcOffsetMinutes();
            kotlin.jvm.internal.Intrinsics.checkNotNull(utcOffsetMinutes4);
            java.lang.String zzg2 = zzg(zzb, utcOffsetMinutes4.intValue(), instant, context);
            if (zzg2 == null) {
                int i3 = com.google.android.libraries.places.R.string.place_details_next_open_time;
                java.lang.Integer utcOffsetMinutes5 = place.getUtcOffsetMinutes();
                kotlin.jvm.internal.Intrinsics.checkNotNull(utcOffsetMinutes5);
                return context.getString(i3, zzh(zzb, utcOffsetMinutes5.intValue(), context));
            }
            int i4 = com.google.android.libraries.places.R.string.place_details_next_open_time_and_day;
            java.lang.Integer utcOffsetMinutes6 = place.getUtcOffsetMinutes();
            kotlin.jvm.internal.Intrinsics.checkNotNull(utcOffsetMinutes6);
            return context.getString(i4, zzh(zzb, utcOffsetMinutes6.intValue(), context), zzg2);
        }
        return null;
    }

    public static final java.lang.String zzc(com.google.android.libraries.places.api.model.Place place, android.content.Context context) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(place, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(context, "");
        int i = com.google.android.libraries.places.widget.internal.placedetails.zzaf.zza[zzi(place).ordinal()];
        if (i == 1) {
            return context.getString(com.google.android.libraries.places.R.string.place_details_opening_status_open);
        }
        if (i == 2) {
            return context.getString(com.google.android.libraries.places.R.string.place_details_opening_status_closed);
        }
        if (i == 3) {
            return context.getString(com.google.android.libraries.places.R.string.place_details_opening_status_open_24_hours);
        }
        if (i == 4) {
            return context.getString(com.google.android.libraries.places.R.string.place_details_opening_status_open_temporarily_closed);
        }
        if (i != 5) {
            return null;
        }
        return context.getString(com.google.android.libraries.places.R.string.place_details_opening_status_open_permanently_closed);
    }

    private static final boolean zzd(com.google.android.libraries.places.api.model.Place place) {
        com.google.android.libraries.places.api.model.TimeOfWeek close;
        com.google.android.libraries.places.api.model.LocalTime time;
        com.google.android.libraries.places.api.model.TimeOfWeek close2;
        com.google.android.libraries.places.api.model.LocalTime time2;
        com.google.android.libraries.places.api.model.TimeOfWeek open;
        com.google.android.libraries.places.api.model.LocalTime time3;
        com.google.android.libraries.places.api.model.TimeOfWeek open2;
        com.google.android.libraries.places.api.model.LocalTime time4;
        com.google.android.libraries.places.api.model.OpeningHours currentOpeningHours = place.getCurrentOpeningHours();
        java.util.List<com.google.android.libraries.places.api.model.Period> periods = currentOpeningHours != null ? currentOpeningHours.getPeriods() : null;
        com.google.android.libraries.places.api.model.Period period = periods != null ? (com.google.android.libraries.places.api.model.Period) kotlin.collections.CollectionsKt.singleOrNull((java.util.List) periods) : null;
        return (period != null && (open = period.getOpen()) != null && (time3 = open.getTime()) != null && time3.getHours() == 0 && (open2 = period.getOpen()) != null && (time4 = open2.getTime()) != null && time4.getMinutes() == 0) && ((period != null ? period.getClose() : null) == null || ((close = period.getClose()) != null && (time = close.getTime()) != null && time.getHours() == 23 && (close2 = period.getClose()) != null && (time2 = close2.getTime()) != null && time2.getMinutes() == 59));
    }

    private static final boolean zze(java.time.OffsetDateTime offsetDateTime) {
        return offsetDateTime.getHour() == 0 && offsetDateTime.getMinute() == 0;
    }

    private static final java.time.OffsetDateTime zzf(java.time.Instant instant, int i) {
        java.time.ZoneOffset ofTotalSeconds = java.time.ZoneOffset.ofTotalSeconds(i * 60);
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(ofTotalSeconds, "");
        java.time.OffsetDateTime atOffset = instant.atOffset(ofTotalSeconds);
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(atOffset, "");
        return atOffset;
    }

    private static final java.lang.String zzg(java.time.Instant instant, int i, java.time.Instant instant2, android.content.Context context) {
        java.time.OffsetDateTime zzf = zzf(instant, i);
        java.time.OffsetDateTime zzf2 = zzf(instant2, i);
        long hours = java.time.Duration.between(instant, instant2).abs().toHours();
        if (zzf.getYear() == zzf2.getYear() && zzf.getDayOfYear() == zzf2.getDayOfYear()) {
            return null;
        }
        if (zze(zzf) && hours < 24) {
            return null;
        }
        switch (com.google.android.libraries.places.widget.internal.placedetails.zzaf.zzb[zzf.getDayOfWeek().ordinal()]) {
            case 1:
                return context.getString(com.google.android.libraries.places.R.string.place_details_day_of_week_monday);
            case 2:
                return context.getString(com.google.android.libraries.places.R.string.place_details_day_of_week_tuesday);
            case 3:
                return context.getString(com.google.android.libraries.places.R.string.place_details_day_of_week_wednesday);
            case 4:
                return context.getString(com.google.android.libraries.places.R.string.place_details_day_of_week_thursday);
            case 5:
                return context.getString(com.google.android.libraries.places.R.string.place_details_day_of_week_friday);
            case 6:
                return context.getString(com.google.android.libraries.places.R.string.place_details_day_of_week_saturday);
            case 7:
                return context.getString(com.google.android.libraries.places.R.string.place_details_day_of_week_sunday);
            default:
                throw new kotlin.NoWhenBranchMatchedException();
        }
    }

    private static final java.lang.String zzh(java.time.Instant instant, int i, android.content.Context context) {
        java.time.OffsetDateTime zzf = zzf(instant, i);
        java.util.Locale locale = context.getResources().getConfiguration().locale;
        if (zze(zzf)) {
            java.lang.String string = context.getString(com.google.android.libraries.places.R.string.place_details_time_midnight);
            kotlin.jvm.internal.Intrinsics.checkNotNull(string);
            return string;
        }
        if (zzf.getHour() == 12 && zzf.getMinute() == 0) {
            java.lang.String string2 = context.getString(com.google.android.libraries.places.R.string.place_details_time_noon);
            kotlin.jvm.internal.Intrinsics.checkNotNull(string2);
            return string2;
        }
        if (android.text.format.DateFormat.is24HourFormat(context)) {
            java.lang.String format = zzf.format(java.time.format.DateTimeFormatter.ofPattern(android.text.format.DateFormat.getBestDateTimePattern(locale, "H:mm")));
            kotlin.jvm.internal.Intrinsics.checkNotNull(format);
            return format;
        }
        java.lang.String format2 = zzf.format(java.time.format.DateTimeFormatter.ofPattern(zzf.getMinute() == 0 ? android.text.format.DateFormat.getBestDateTimePattern(locale, "h a") : android.text.format.DateFormat.getBestDateTimePattern(locale, "h:mm a")));
        kotlin.jvm.internal.Intrinsics.checkNotNull(format2);
        return format2;
    }

    private static final com.google.android.libraries.places.widget.internal.placedetails.zzae zzi(com.google.android.libraries.places.api.model.Place place) {
        if (place.getBusinessStatus() == com.google.android.libraries.places.api.model.Place.BusinessStatus.CLOSED_PERMANENTLY) {
            return com.google.android.libraries.places.widget.internal.placedetails.zzae.zzf;
        }
        if (place.getBusinessStatus() == com.google.android.libraries.places.api.model.Place.BusinessStatus.CLOSED_TEMPORARILY) {
            return com.google.android.libraries.places.widget.internal.placedetails.zzae.zze;
        }
        if (zzd(place)) {
            return com.google.android.libraries.places.widget.internal.placedetails.zzae.zzc;
        }
        com.google.android.libraries.places.api.model.OpeningHours currentOpeningHours = place.getCurrentOpeningHours();
        if (currentOpeningHours != null && kotlin.jvm.internal.Intrinsics.areEqual(currentOpeningHours.zza(), java.lang.Boolean.TRUE)) {
            return com.google.android.libraries.places.widget.internal.placedetails.zzae.zzb;
        }
        com.google.android.libraries.places.api.model.OpeningHours currentOpeningHours2 = place.getCurrentOpeningHours();
        return (currentOpeningHours2 == null || !kotlin.jvm.internal.Intrinsics.areEqual(currentOpeningHours2.zza(), java.lang.Boolean.FALSE)) ? com.google.android.libraries.places.widget.internal.placedetails.zzae.zza : com.google.android.libraries.places.widget.internal.placedetails.zzae.zzd;
    }

    private zzag() {
    }
}
