package com.google.android.libraries.places.api.model;

/* loaded from: classes8.dex */
public final class zzga {
    public static final /* synthetic */ int zza = 0;
    private static final com.google.common.collect.ImmutableMap zzb = com.google.common.collect.ImmutableMap.builder().put(java.time.DayOfWeek.SUNDAY, com.google.android.libraries.places.api.model.DayOfWeek.SUNDAY).put(java.time.DayOfWeek.MONDAY, com.google.android.libraries.places.api.model.DayOfWeek.MONDAY).put(java.time.DayOfWeek.TUESDAY, com.google.android.libraries.places.api.model.DayOfWeek.TUESDAY).put(java.time.DayOfWeek.WEDNESDAY, com.google.android.libraries.places.api.model.DayOfWeek.WEDNESDAY).put(java.time.DayOfWeek.THURSDAY, com.google.android.libraries.places.api.model.DayOfWeek.THURSDAY).put(java.time.DayOfWeek.FRIDAY, com.google.android.libraries.places.api.model.DayOfWeek.FRIDAY).put(java.time.DayOfWeek.SATURDAY, com.google.android.libraries.places.api.model.DayOfWeek.SATURDAY).buildOrThrow();
    private static final com.google.android.libraries.places.api.model.LocalTime zzc = com.google.android.libraries.places.api.model.LocalTime.newInstance(23, 59);

    /* JADX WARN: Code restructure failed: missing block: B:20:0x0085, code lost:
    
        if (com.google.common.collect.Range.closed(java.lang.Long.valueOf(zzb(r1, r6, 0, 0)), java.lang.Long.valueOf(zzb(r1, r5, 23, 59))).contains(java.lang.Long.valueOf(r13)) != false) goto L22;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static java.lang.Boolean zza(com.google.android.libraries.places.api.model.Place place, long j) {
        java.time.ZoneOffset zzc2;
        com.google.android.libraries.places.api.model.Place.BusinessStatus businessStatus = place.getBusinessStatus();
        java.lang.Integer utcOffsetMinutes = place.getUtcOffsetMinutes();
        java.lang.Boolean bool = java.lang.Boolean.FALSE;
        if (businessStatus != null && businessStatus != com.google.android.libraries.places.api.model.Place.BusinessStatus.OPERATIONAL) {
            return bool;
        }
        if (utcOffsetMinutes != null && (zzc2 = zzc(utcOffsetMinutes.intValue())) != null) {
            com.google.android.libraries.places.api.model.OpeningHours currentOpeningHours = place.getCurrentOpeningHours();
            if (currentOpeningHours != null) {
                java.util.ArrayList arrayList = new java.util.ArrayList(currentOpeningHours.getPeriods());
                if (!arrayList.isEmpty()) {
                    try {
                        java.util.Collections.sort(arrayList, com.google.android.libraries.places.api.model.zzfz.zza);
                        com.google.android.libraries.places.api.model.LocalDate date = ((com.google.android.libraries.places.api.model.TimeOfWeek) com.google.common.base.Preconditions.checkNotNull(((com.google.android.libraries.places.api.model.Period) arrayList.get(0)).getOpen())).getDate();
                        com.google.android.libraries.places.api.model.LocalDate date2 = ((com.google.android.libraries.places.api.model.TimeOfWeek) com.google.common.base.Preconditions.checkNotNull(((com.google.android.libraries.places.api.model.Period) com.google.common.collect.Iterables.getLast(arrayList)).getClose())).getDate();
                        if (date != null && date2 != null) {
                        }
                    } catch (java.lang.NullPointerException unused) {
                    }
                }
            }
            currentOpeningHours = place.getOpeningHours();
            if (currentOpeningHours != null) {
                java.util.List<com.google.android.libraries.places.api.model.Period> periods = currentOpeningHours.getPeriods();
                if (!periods.isEmpty()) {
                    if (periods.size() == 1) {
                        com.google.android.libraries.places.api.model.Period period = periods.get(0);
                        com.google.android.libraries.places.api.model.TimeOfWeek open = period.getOpen();
                        if (period.getClose() == null && open != null && open.getDay() == com.google.android.libraries.places.api.model.DayOfWeek.SUNDAY && open.getTime().getHours() == 0 && open.getTime().getMinutes() == 0) {
                            return java.lang.Boolean.TRUE;
                        }
                    }
                    for (com.google.android.libraries.places.api.model.Period period2 : periods) {
                        if (period2.getOpen() != null && period2.getClose() != null) {
                        }
                    }
                    java.time.OffsetDateTime atOffset = java.time.Instant.ofEpochMilli(j).atOffset(zzc2);
                    com.google.android.libraries.places.api.model.DayOfWeek dayOfWeek = (com.google.android.libraries.places.api.model.DayOfWeek) zzb.get(atOffset.getDayOfWeek());
                    com.google.android.libraries.places.api.model.LocalTime newInstance = com.google.android.libraries.places.api.model.LocalTime.newInstance(atOffset.getHour(), atOffset.getMinute());
                    java.util.EnumMap enumMap = new java.util.EnumMap(com.google.android.libraries.places.api.model.DayOfWeek.class);
                    if (!periods.isEmpty()) {
                        com.google.android.libraries.places.api.model.Period period3 = periods.get(0);
                        int i = 0;
                        while (period3 != null) {
                            com.google.android.libraries.places.api.model.TimeOfWeek open2 = period3.getOpen();
                            com.google.android.libraries.places.api.model.TimeOfWeek close = period3.getClose();
                            if (open2 == null || close == null) {
                                i++;
                                period3 = i >= periods.size() ? null : periods.get(i);
                            } else {
                                com.google.android.libraries.places.api.model.DayOfWeek day = open2.getDay();
                                com.google.android.libraries.places.api.model.LocalTime time = open2.getTime();
                                if (open2.getDay() != close.getDay()) {
                                    com.google.android.libraries.places.api.model.LocalTime localTime = zzc;
                                    java.util.List list = (java.util.List) enumMap.getOrDefault(day, new java.util.ArrayList());
                                    list.add(com.google.common.collect.Range.closed(time, localTime));
                                    enumMap.put((java.util.EnumMap) day, (com.google.android.libraries.places.api.model.DayOfWeek) list);
                                    com.google.android.libraries.places.api.model.TimeOfWeek newInstance2 = com.google.android.libraries.places.api.model.TimeOfWeek.newInstance(com.google.android.libraries.places.api.model.DayOfWeek.values()[(day.ordinal() + 1) % 7], com.google.android.libraries.places.api.model.LocalTime.newInstance(0, 0));
                                    com.google.android.libraries.places.api.model.TimeOfWeek close2 = period3.getClose();
                                    com.google.android.libraries.places.api.model.Period.Builder builder = com.google.android.libraries.places.api.model.Period.builder();
                                    builder.setOpen(newInstance2);
                                    builder.setClose(close2);
                                    period3 = builder.build();
                                } else {
                                    i++;
                                    com.google.android.libraries.places.api.model.LocalTime time2 = close.getTime();
                                    java.util.List list2 = (java.util.List) enumMap.getOrDefault(day, new java.util.ArrayList());
                                    list2.add(com.google.common.collect.Range.closedOpen(time, time2));
                                    enumMap.put((java.util.EnumMap) day, (com.google.android.libraries.places.api.model.DayOfWeek) list2);
                                    if (i < periods.size()) {
                                        period3 = periods.get(i);
                                    }
                                }
                            }
                        }
                    }
                    java.util.List list3 = (java.util.List) enumMap.get(dayOfWeek);
                    if (list3 == null) {
                        return bool;
                    }
                    java.util.Iterator it = list3.iterator();
                    while (it.hasNext()) {
                        if (((com.google.common.collect.Range) it.next()).contains(newInstance)) {
                            return java.lang.Boolean.TRUE;
                        }
                    }
                }
                return bool;
            }
        }
        return null;
    }

    static long zzb(java.time.ZoneOffset zoneOffset, com.google.android.libraries.places.api.model.LocalDate localDate, int i, int i2) {
        return java.time.OffsetDateTime.of(java.time.LocalDate.of(localDate.getYear(), localDate.getMonth(), localDate.getDay()), java.time.LocalTime.of(i, i2), zoneOffset).toInstant().toEpochMilli();
    }

    private static java.time.ZoneOffset zzc(int i) {
        try {
            return java.time.ZoneOffset.ofTotalSeconds(i * 60);
        } catch (java.time.DateTimeException unused) {
            new java.lang.Object[]{java.lang.Integer.valueOf(i)};
            return null;
        }
    }
}
