package org.threeten.bp.chrono;

/* loaded from: classes18.dex */
public abstract class Chronology implements java.lang.Comparable<org.threeten.bp.chrono.Chronology> {
    private static final java.lang.reflect.Method getHighSpeedVideoFpsRangesFor;
    public static final org.threeten.bp.temporal.TemporalQuery<org.threeten.bp.chrono.Chronology> FROM = new org.threeten.bp.temporal.TemporalQuery<org.threeten.bp.chrono.Chronology>() { // from class: org.threeten.bp.chrono.Chronology.1
        @Override // org.threeten.bp.temporal.TemporalQuery
        public /* synthetic */ org.threeten.bp.chrono.Chronology queryFrom(org.threeten.bp.temporal.TemporalAccessor temporalAccessor) {
            return org.threeten.bp.chrono.Chronology.from(temporalAccessor);
        }
    };
    private static final java.util.concurrent.ConcurrentHashMap<java.lang.String, org.threeten.bp.chrono.Chronology> getHighSpeedVideoSizes = new java.util.concurrent.ConcurrentHashMap<>();
    private static final java.util.concurrent.ConcurrentHashMap<java.lang.String, org.threeten.bp.chrono.Chronology> getHighResolutionOutputSizeshNQ4ISI = new java.util.concurrent.ConcurrentHashMap<>();

    public abstract org.threeten.bp.chrono.ChronoLocalDate date(int i, int i2, int i3);

    public abstract org.threeten.bp.chrono.ChronoLocalDate date(org.threeten.bp.temporal.TemporalAccessor temporalAccessor);

    public abstract org.threeten.bp.chrono.ChronoLocalDate dateEpochDay(long j);

    public abstract org.threeten.bp.chrono.ChronoLocalDate dateYearDay(int i, int i2);

    public abstract org.threeten.bp.chrono.Era eraOf(int i);

    public abstract java.util.List<org.threeten.bp.chrono.Era> eras();

    public abstract java.lang.String getCalendarType();

    public abstract java.lang.String getId();

    public abstract boolean isLeapYear(long j);

    public abstract int prolepticYear(org.threeten.bp.chrono.Era era, int i);

    public abstract org.threeten.bp.temporal.ValueRange range(org.threeten.bp.temporal.ChronoField chronoField);

    public abstract org.threeten.bp.chrono.ChronoLocalDate resolveDate(java.util.Map<org.threeten.bp.temporal.TemporalField, java.lang.Long> map, org.threeten.bp.format.ResolverStyle resolverStyle);

    static {
        java.lang.reflect.Method method;
        try {
            method = java.util.Locale.class.getMethod("getUnicodeLocaleType", java.lang.String.class);
        } catch (java.lang.Throwable unused) {
            method = null;
        }
        getHighSpeedVideoFpsRangesFor = method;
    }

    public static org.threeten.bp.chrono.Chronology from(org.threeten.bp.temporal.TemporalAccessor temporalAccessor) {
        org.threeten.bp.jdk8.Jdk8Methods.requireNonNull(temporalAccessor, "temporal");
        org.threeten.bp.chrono.Chronology chronology = (org.threeten.bp.chrono.Chronology) temporalAccessor.query(org.threeten.bp.temporal.TemporalQueries.chronology());
        return chronology != null ? chronology : org.threeten.bp.chrono.IsoChronology.INSTANCE;
    }

    public static org.threeten.bp.chrono.Chronology ofLocale(java.util.Locale locale) {
        java.lang.String str;
        getHighSpeedVideoFpsRanges();
        org.threeten.bp.jdk8.Jdk8Methods.requireNonNull(locale, "locale");
        java.lang.reflect.Method method = getHighSpeedVideoFpsRangesFor;
        if (method != null) {
            try {
                str = (java.lang.String) method.invoke(locale, "ca");
            } catch (java.lang.IllegalAccessException | java.lang.IllegalArgumentException | java.lang.reflect.InvocationTargetException unused) {
            }
        } else {
            if (locale.equals(org.threeten.bp.chrono.JapaneseChronology.getHighSpeedVideoSizes)) {
                str = "japanese";
            }
            str = "iso";
        }
        if (str == null || "iso".equals(str) || "iso8601".equals(str)) {
            return org.threeten.bp.chrono.IsoChronology.INSTANCE;
        }
        org.threeten.bp.chrono.Chronology chronology = getHighResolutionOutputSizeshNQ4ISI.get(str);
        if (chronology != null) {
            return chronology;
        }
        throw new org.threeten.bp.DateTimeException("Unknown calendar system: ".concat(java.lang.String.valueOf(str)));
    }

    public static org.threeten.bp.chrono.Chronology of(java.lang.String str) {
        getHighSpeedVideoFpsRanges();
        org.threeten.bp.chrono.Chronology chronology = getHighSpeedVideoSizes.get(str);
        if (chronology != null) {
            return chronology;
        }
        org.threeten.bp.chrono.Chronology chronology2 = getHighResolutionOutputSizeshNQ4ISI.get(str);
        if (chronology2 != null) {
            return chronology2;
        }
        throw new org.threeten.bp.DateTimeException("Unknown chronology: ".concat(java.lang.String.valueOf(str)));
    }

    public static java.util.Set<org.threeten.bp.chrono.Chronology> getAvailableChronologies() {
        getHighSpeedVideoFpsRanges();
        return new java.util.HashSet(getHighSpeedVideoSizes.values());
    }

    private static void getHighSpeedVideoFpsRanges() {
        java.util.concurrent.ConcurrentHashMap<java.lang.String, org.threeten.bp.chrono.Chronology> concurrentHashMap = getHighSpeedVideoSizes;
        if (concurrentHashMap.isEmpty()) {
            org.threeten.bp.chrono.IsoChronology isoChronology = org.threeten.bp.chrono.IsoChronology.INSTANCE;
            concurrentHashMap.putIfAbsent(isoChronology.getId(), isoChronology);
            java.lang.String calendarType = isoChronology.getCalendarType();
            if (calendarType != null) {
                getHighResolutionOutputSizeshNQ4ISI.putIfAbsent(calendarType, isoChronology);
            }
            org.threeten.bp.chrono.ThaiBuddhistChronology thaiBuddhistChronology = org.threeten.bp.chrono.ThaiBuddhistChronology.INSTANCE;
            concurrentHashMap.putIfAbsent(thaiBuddhistChronology.getId(), thaiBuddhistChronology);
            java.lang.String calendarType2 = thaiBuddhistChronology.getCalendarType();
            if (calendarType2 != null) {
                getHighResolutionOutputSizeshNQ4ISI.putIfAbsent(calendarType2, thaiBuddhistChronology);
            }
            org.threeten.bp.chrono.MinguoChronology minguoChronology = org.threeten.bp.chrono.MinguoChronology.INSTANCE;
            concurrentHashMap.putIfAbsent(minguoChronology.getId(), minguoChronology);
            java.lang.String calendarType3 = minguoChronology.getCalendarType();
            if (calendarType3 != null) {
                getHighResolutionOutputSizeshNQ4ISI.putIfAbsent(calendarType3, minguoChronology);
            }
            org.threeten.bp.chrono.JapaneseChronology japaneseChronology = org.threeten.bp.chrono.JapaneseChronology.INSTANCE;
            concurrentHashMap.putIfAbsent(japaneseChronology.getId(), japaneseChronology);
            java.lang.String calendarType4 = japaneseChronology.getCalendarType();
            if (calendarType4 != null) {
                getHighResolutionOutputSizeshNQ4ISI.putIfAbsent(calendarType4, japaneseChronology);
            }
            org.threeten.bp.chrono.HijrahChronology hijrahChronology = org.threeten.bp.chrono.HijrahChronology.INSTANCE;
            concurrentHashMap.putIfAbsent(hijrahChronology.getId(), hijrahChronology);
            java.lang.String calendarType5 = hijrahChronology.getCalendarType();
            if (calendarType5 != null) {
                getHighResolutionOutputSizeshNQ4ISI.putIfAbsent(calendarType5, hijrahChronology);
            }
            concurrentHashMap.putIfAbsent("Hijrah", org.threeten.bp.chrono.HijrahChronology.INSTANCE);
            getHighResolutionOutputSizeshNQ4ISI.putIfAbsent(androidx.core.text.util.LocalePreferences.CalendarType.ISLAMIC, org.threeten.bp.chrono.HijrahChronology.INSTANCE);
            java.util.Iterator it = java.util.ServiceLoader.load(org.threeten.bp.chrono.Chronology.class, org.threeten.bp.chrono.Chronology.class.getClassLoader()).iterator();
            while (it.hasNext()) {
                org.threeten.bp.chrono.Chronology chronology = (org.threeten.bp.chrono.Chronology) it.next();
                getHighSpeedVideoSizes.putIfAbsent(chronology.getId(), chronology);
                java.lang.String calendarType6 = chronology.getCalendarType();
                if (calendarType6 != null) {
                    getHighResolutionOutputSizeshNQ4ISI.putIfAbsent(calendarType6, chronology);
                }
            }
        }
    }

    protected Chronology() {
    }

    final <D extends org.threeten.bp.chrono.ChronoLocalDate> D getHighSpeedVideoFpsRangesFor(org.threeten.bp.temporal.Temporal temporal) {
        D d = (D) temporal;
        if (equals(d.getChronology())) {
            return d;
        }
        java.lang.StringBuilder sb = new java.lang.StringBuilder("Chrono mismatch, expected: ");
        sb.append(getId());
        sb.append(", actual: ");
        sb.append(d.getChronology().getId());
        throw new java.lang.ClassCastException(sb.toString());
    }

    final <D extends org.threeten.bp.chrono.ChronoLocalDate> org.threeten.bp.chrono.ChronoLocalDateTimeImpl<D> getHighResolutionOutputSizeshNQ4ISI(org.threeten.bp.temporal.Temporal temporal) {
        org.threeten.bp.chrono.ChronoLocalDateTimeImpl<D> chronoLocalDateTimeImpl = (org.threeten.bp.chrono.ChronoLocalDateTimeImpl) temporal;
        if (equals(chronoLocalDateTimeImpl.toLocalDate().getChronology())) {
            return chronoLocalDateTimeImpl;
        }
        java.lang.StringBuilder sb = new java.lang.StringBuilder("Chrono mismatch, required: ");
        sb.append(getId());
        sb.append(", supplied: ");
        sb.append(chronoLocalDateTimeImpl.toLocalDate().getChronology().getId());
        throw new java.lang.ClassCastException(sb.toString());
    }

    final <D extends org.threeten.bp.chrono.ChronoLocalDate> org.threeten.bp.chrono.ChronoZonedDateTimeImpl<D> Camera2StreamConfigurationMap(org.threeten.bp.temporal.Temporal temporal) {
        org.threeten.bp.chrono.ChronoZonedDateTimeImpl<D> chronoZonedDateTimeImpl = (org.threeten.bp.chrono.ChronoZonedDateTimeImpl) temporal;
        if (equals(chronoZonedDateTimeImpl.toLocalDate().getChronology())) {
            return chronoZonedDateTimeImpl;
        }
        java.lang.StringBuilder sb = new java.lang.StringBuilder("Chrono mismatch, required: ");
        sb.append(getId());
        sb.append(", supplied: ");
        sb.append(chronoZonedDateTimeImpl.toLocalDate().getChronology().getId());
        throw new java.lang.ClassCastException(sb.toString());
    }

    public org.threeten.bp.chrono.ChronoLocalDate date(org.threeten.bp.chrono.Era era, int i, int i2, int i3) {
        return date(prolepticYear(era, i), i2, i3);
    }

    public org.threeten.bp.chrono.ChronoLocalDate dateYearDay(org.threeten.bp.chrono.Era era, int i, int i2) {
        return dateYearDay(prolepticYear(era, i), i2);
    }

    public org.threeten.bp.chrono.ChronoLocalDate dateNow() {
        return dateNow(org.threeten.bp.Clock.systemDefaultZone());
    }

    public org.threeten.bp.chrono.ChronoLocalDate dateNow(org.threeten.bp.ZoneId zoneId) {
        return dateNow(org.threeten.bp.Clock.system(zoneId));
    }

    public org.threeten.bp.chrono.ChronoLocalDate dateNow(org.threeten.bp.Clock clock) {
        org.threeten.bp.jdk8.Jdk8Methods.requireNonNull(clock, "clock");
        return date(org.threeten.bp.LocalDate.now(clock));
    }

    public org.threeten.bp.chrono.ChronoLocalDateTime<?> localDateTime(org.threeten.bp.temporal.TemporalAccessor temporalAccessor) {
        try {
            return date(temporalAccessor).atTime(org.threeten.bp.LocalTime.from(temporalAccessor));
        } catch (org.threeten.bp.DateTimeException e) {
            java.lang.StringBuilder sb = new java.lang.StringBuilder("Unable to obtain ChronoLocalDateTime from TemporalAccessor: ");
            sb.append(temporalAccessor.getClass());
            throw new org.threeten.bp.DateTimeException(sb.toString(), e);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r5v6, types: [org.threeten.bp.chrono.ChronoZonedDateTime, org.threeten.bp.chrono.ChronoZonedDateTime<?>] */
    public org.threeten.bp.chrono.ChronoZonedDateTime<?> zonedDateTime(org.threeten.bp.temporal.TemporalAccessor temporalAccessor) {
        try {
            org.threeten.bp.ZoneId from = org.threeten.bp.ZoneId.from(temporalAccessor);
            try {
                temporalAccessor = zonedDateTime(org.threeten.bp.Instant.from(temporalAccessor), from);
                return temporalAccessor;
            } catch (org.threeten.bp.DateTimeException unused) {
                return org.threeten.bp.chrono.ChronoZonedDateTimeImpl.getHighResolutionOutputSizeshNQ4ISI(getHighResolutionOutputSizeshNQ4ISI(localDateTime(temporalAccessor)), from, (org.threeten.bp.ZoneOffset) null);
            }
        } catch (org.threeten.bp.DateTimeException e) {
            java.lang.StringBuilder sb = new java.lang.StringBuilder("Unable to obtain ChronoZonedDateTime from TemporalAccessor: ");
            sb.append(temporalAccessor.getClass());
            throw new org.threeten.bp.DateTimeException(sb.toString(), e);
        }
    }

    public org.threeten.bp.chrono.ChronoZonedDateTime<?> zonedDateTime(org.threeten.bp.Instant instant, org.threeten.bp.ZoneId zoneId) {
        return org.threeten.bp.chrono.ChronoZonedDateTimeImpl.getHighResolutionOutputSizeshNQ4ISI(this, instant, zoneId);
    }

    public org.threeten.bp.chrono.ChronoPeriod period(int i, int i2, int i3) {
        return new org.threeten.bp.chrono.ChronoPeriodImpl(this, i, i2, i3);
    }

    public java.lang.String getDisplayName(org.threeten.bp.format.TextStyle textStyle, java.util.Locale locale) {
        return new org.threeten.bp.format.DateTimeFormatterBuilder().appendChronologyText(textStyle).toFormatter(locale).format(new org.threeten.bp.jdk8.DefaultInterfaceTemporalAccessor() { // from class: org.threeten.bp.chrono.Chronology.2
            @Override // org.threeten.bp.temporal.TemporalAccessor
            public boolean isSupported(org.threeten.bp.temporal.TemporalField temporalField) {
                return false;
            }

            @Override // org.threeten.bp.temporal.TemporalAccessor
            public long getLong(org.threeten.bp.temporal.TemporalField temporalField) {
                throw new org.threeten.bp.temporal.UnsupportedTemporalTypeException("Unsupported field: ".concat(java.lang.String.valueOf(temporalField)));
            }

            @Override // org.threeten.bp.jdk8.DefaultInterfaceTemporalAccessor, org.threeten.bp.temporal.TemporalAccessor
            public <R> R query(org.threeten.bp.temporal.TemporalQuery<R> temporalQuery) {
                if (temporalQuery == org.threeten.bp.temporal.TemporalQueries.chronology()) {
                    return (R) org.threeten.bp.chrono.Chronology.this;
                }
                return (R) super.query(temporalQuery);
            }
        });
    }

    static void getHighSpeedVideoFpsRanges(java.util.Map<org.threeten.bp.temporal.TemporalField, java.lang.Long> map, org.threeten.bp.temporal.ChronoField chronoField, long j) {
        java.lang.Long l = map.get(chronoField);
        if (l != null && l.longValue() != j) {
            java.lang.StringBuilder sb = new java.lang.StringBuilder("Invalid state, field: ");
            sb.append(chronoField);
            sb.append(" ");
            sb.append(l);
            sb.append(" conflicts with ");
            sb.append(chronoField);
            sb.append(" ");
            sb.append(j);
            throw new org.threeten.bp.DateTimeException(sb.toString());
        }
        map.put(chronoField, java.lang.Long.valueOf(j));
    }

    @Override // java.lang.Comparable
    public int compareTo(org.threeten.bp.chrono.Chronology chronology) {
        return getId().compareTo(chronology.getId());
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof org.threeten.bp.chrono.Chronology) && compareTo((org.threeten.bp.chrono.Chronology) obj) == 0;
    }

    public int hashCode() {
        return getClass().hashCode() ^ getId().hashCode();
    }

    public java.lang.String toString() {
        return getId();
    }

    private java.lang.Object writeReplace() {
        return new org.threeten.bp.chrono.Ser(com.google.common.base.Ascii.VT, this);
    }

    private java.lang.Object readResolve() throws java.io.ObjectStreamException {
        throw new java.io.InvalidObjectException("Deserialization via serialization delegate");
    }

    static org.threeten.bp.chrono.Chronology getHighResolutionOutputSizeshNQ4ISI(java.io.DataInput dataInput) throws java.io.IOException {
        return of(dataInput.readUTF());
    }
}
