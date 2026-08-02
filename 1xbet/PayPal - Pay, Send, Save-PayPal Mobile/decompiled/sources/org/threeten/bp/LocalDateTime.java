package org.threeten.bp;

/* loaded from: classes18.dex */
public final class LocalDateTime extends org.threeten.bp.chrono.ChronoLocalDateTime<org.threeten.bp.LocalDate> implements org.threeten.bp.temporal.Temporal, org.threeten.bp.temporal.TemporalAdjuster, java.io.Serializable {
    private static final long serialVersionUID = 6207766400415563566L;
    private final org.threeten.bp.LocalDate Camera2StreamConfigurationMap;
    private final org.threeten.bp.LocalTime getHighSpeedVideoFpsRanges;
    public static final org.threeten.bp.LocalDateTime MIN = of(org.threeten.bp.LocalDate.MIN, org.threeten.bp.LocalTime.MIN);
    public static final org.threeten.bp.LocalDateTime MAX = of(org.threeten.bp.LocalDate.MAX, org.threeten.bp.LocalTime.MAX);
    public static final org.threeten.bp.temporal.TemporalQuery<org.threeten.bp.LocalDateTime> FROM = new org.threeten.bp.temporal.TemporalQuery<org.threeten.bp.LocalDateTime>() { // from class: org.threeten.bp.LocalDateTime.1
        @Override // org.threeten.bp.temporal.TemporalQuery
        public /* synthetic */ org.threeten.bp.LocalDateTime queryFrom(org.threeten.bp.temporal.TemporalAccessor temporalAccessor) {
            return org.threeten.bp.LocalDateTime.from(temporalAccessor);
        }
    };

    @Override // org.threeten.bp.chrono.ChronoLocalDateTime, java.lang.Comparable
    public final /* bridge */ /* synthetic */ int compareTo(java.lang.Object obj) {
        return compareTo((org.threeten.bp.chrono.ChronoLocalDateTime<?>) obj);
    }

    public static org.threeten.bp.LocalDateTime now() {
        return now(org.threeten.bp.Clock.systemDefaultZone());
    }

    public static org.threeten.bp.LocalDateTime now(org.threeten.bp.ZoneId zoneId) {
        return now(org.threeten.bp.Clock.system(zoneId));
    }

    public static org.threeten.bp.LocalDateTime now(org.threeten.bp.Clock clock) {
        org.threeten.bp.jdk8.Jdk8Methods.requireNonNull(clock, "clock");
        org.threeten.bp.Instant instant = clock.instant();
        return ofEpochSecond(instant.getEpochSecond(), instant.getNano(), clock.getZone().getRules().getOffset(instant));
    }

    public static org.threeten.bp.LocalDateTime of(int i, org.threeten.bp.Month month, int i2, int i3, int i4) {
        return new org.threeten.bp.LocalDateTime(org.threeten.bp.LocalDate.of(i, month, i2), org.threeten.bp.LocalTime.of(i3, i4));
    }

    public static org.threeten.bp.LocalDateTime of(int i, org.threeten.bp.Month month, int i2, int i3, int i4, int i5) {
        return new org.threeten.bp.LocalDateTime(org.threeten.bp.LocalDate.of(i, month, i2), org.threeten.bp.LocalTime.of(i3, i4, i5));
    }

    public static org.threeten.bp.LocalDateTime of(int i, org.threeten.bp.Month month, int i2, int i3, int i4, int i5, int i6) {
        return new org.threeten.bp.LocalDateTime(org.threeten.bp.LocalDate.of(i, month, i2), org.threeten.bp.LocalTime.of(i3, i4, i5, i6));
    }

    public static org.threeten.bp.LocalDateTime of(int i, int i2, int i3, int i4, int i5) {
        return new org.threeten.bp.LocalDateTime(org.threeten.bp.LocalDate.of(i, i2, i3), org.threeten.bp.LocalTime.of(i4, i5));
    }

    public static org.threeten.bp.LocalDateTime of(int i, int i2, int i3, int i4, int i5, int i6) {
        return new org.threeten.bp.LocalDateTime(org.threeten.bp.LocalDate.of(i, i2, i3), org.threeten.bp.LocalTime.of(i4, i5, i6));
    }

    public static org.threeten.bp.LocalDateTime of(int i, int i2, int i3, int i4, int i5, int i6, int i7) {
        return new org.threeten.bp.LocalDateTime(org.threeten.bp.LocalDate.of(i, i2, i3), org.threeten.bp.LocalTime.of(i4, i5, i6, i7));
    }

    public static org.threeten.bp.LocalDateTime of(org.threeten.bp.LocalDate localDate, org.threeten.bp.LocalTime localTime) {
        org.threeten.bp.jdk8.Jdk8Methods.requireNonNull(localDate, "date");
        org.threeten.bp.jdk8.Jdk8Methods.requireNonNull(localTime, "time");
        return new org.threeten.bp.LocalDateTime(localDate, localTime);
    }

    public static org.threeten.bp.LocalDateTime ofInstant(org.threeten.bp.Instant instant, org.threeten.bp.ZoneId zoneId) {
        org.threeten.bp.jdk8.Jdk8Methods.requireNonNull(instant, "instant");
        org.threeten.bp.jdk8.Jdk8Methods.requireNonNull(zoneId, "zone");
        return ofEpochSecond(instant.getEpochSecond(), instant.getNano(), zoneId.getRules().getOffset(instant));
    }

    public static org.threeten.bp.LocalDateTime ofEpochSecond(long j, int i, org.threeten.bp.ZoneOffset zoneOffset) {
        org.threeten.bp.jdk8.Jdk8Methods.requireNonNull(zoneOffset, "offset");
        return new org.threeten.bp.LocalDateTime(org.threeten.bp.LocalDate.ofEpochDay(org.threeten.bp.jdk8.Jdk8Methods.floorDiv(j + zoneOffset.getTotalSeconds(), 86400L)), org.threeten.bp.LocalTime.getHighResolutionOutputSizeshNQ4ISI(org.threeten.bp.jdk8.Jdk8Methods.floorMod(r2, kotlinx.datetime.internal.DateCalculationsKt.SECONDS_PER_DAY), i));
    }

    /* JADX WARN: Type inference failed for: r3v5, types: [org.threeten.bp.LocalDateTime] */
    public static org.threeten.bp.LocalDateTime from(org.threeten.bp.temporal.TemporalAccessor temporalAccessor) {
        if (temporalAccessor instanceof org.threeten.bp.LocalDateTime) {
            return (org.threeten.bp.LocalDateTime) temporalAccessor;
        }
        if (temporalAccessor instanceof org.threeten.bp.ZonedDateTime) {
            return ((org.threeten.bp.ZonedDateTime) temporalAccessor).toLocalDateTime2();
        }
        try {
            return new org.threeten.bp.LocalDateTime(org.threeten.bp.LocalDate.from(temporalAccessor), org.threeten.bp.LocalTime.from(temporalAccessor));
        } catch (org.threeten.bp.DateTimeException unused) {
            java.lang.StringBuilder sb = new java.lang.StringBuilder("Unable to obtain LocalDateTime from TemporalAccessor: ");
            sb.append(temporalAccessor);
            sb.append(", type ");
            sb.append(temporalAccessor.getClass().getName());
            throw new org.threeten.bp.DateTimeException(sb.toString());
        }
    }

    public static org.threeten.bp.LocalDateTime parse(java.lang.CharSequence charSequence) {
        return parse(charSequence, org.threeten.bp.format.DateTimeFormatter.ISO_LOCAL_DATE_TIME);
    }

    public static org.threeten.bp.LocalDateTime parse(java.lang.CharSequence charSequence, org.threeten.bp.format.DateTimeFormatter dateTimeFormatter) {
        org.threeten.bp.jdk8.Jdk8Methods.requireNonNull(dateTimeFormatter, "formatter");
        return (org.threeten.bp.LocalDateTime) dateTimeFormatter.parse(charSequence, FROM);
    }

    private LocalDateTime(org.threeten.bp.LocalDate localDate, org.threeten.bp.LocalTime localTime) {
        this.Camera2StreamConfigurationMap = localDate;
        this.getHighSpeedVideoFpsRanges = localTime;
    }

    @Override // org.threeten.bp.temporal.TemporalAccessor
    public final boolean isSupported(org.threeten.bp.temporal.TemporalField temporalField) {
        return temporalField instanceof org.threeten.bp.temporal.ChronoField ? temporalField.isDateBased() || temporalField.isTimeBased() : temporalField != null && temporalField.isSupportedBy(this);
    }

    @Override // org.threeten.bp.temporal.Temporal
    public final boolean isSupported(org.threeten.bp.temporal.TemporalUnit temporalUnit) {
        return temporalUnit instanceof org.threeten.bp.temporal.ChronoUnit ? temporalUnit.isDateBased() || temporalUnit.isTimeBased() : temporalUnit != null && temporalUnit.isSupportedBy(this);
    }

    @Override // org.threeten.bp.jdk8.DefaultInterfaceTemporalAccessor, org.threeten.bp.temporal.TemporalAccessor
    public final org.threeten.bp.temporal.ValueRange range(org.threeten.bp.temporal.TemporalField temporalField) {
        if (temporalField instanceof org.threeten.bp.temporal.ChronoField) {
            return (temporalField.isTimeBased() ? this.getHighSpeedVideoFpsRanges : this.Camera2StreamConfigurationMap).range(temporalField);
        }
        return temporalField.rangeRefinedBy(this);
    }

    @Override // org.threeten.bp.jdk8.DefaultInterfaceTemporalAccessor, org.threeten.bp.temporal.TemporalAccessor
    public final int get(org.threeten.bp.temporal.TemporalField temporalField) {
        if (temporalField instanceof org.threeten.bp.temporal.ChronoField) {
            return (temporalField.isTimeBased() ? this.getHighSpeedVideoFpsRanges : this.Camera2StreamConfigurationMap).get(temporalField);
        }
        return super.get(temporalField);
    }

    @Override // org.threeten.bp.temporal.TemporalAccessor
    public final long getLong(org.threeten.bp.temporal.TemporalField temporalField) {
        if (temporalField instanceof org.threeten.bp.temporal.ChronoField) {
            return temporalField.isTimeBased() ? this.getHighSpeedVideoFpsRanges.getLong(temporalField) : this.Camera2StreamConfigurationMap.getLong(temporalField);
        }
        return temporalField.getFrom(this);
    }

    public final int getYear() {
        return this.Camera2StreamConfigurationMap.getYear();
    }

    public final int getMonthValue() {
        return this.Camera2StreamConfigurationMap.getMonthValue();
    }

    public final org.threeten.bp.Month getMonth() {
        return this.Camera2StreamConfigurationMap.getMonth();
    }

    public final int getDayOfMonth() {
        return this.Camera2StreamConfigurationMap.getDayOfMonth();
    }

    public final int getDayOfYear() {
        return this.Camera2StreamConfigurationMap.getDayOfYear();
    }

    public final org.threeten.bp.DayOfWeek getDayOfWeek() {
        return this.Camera2StreamConfigurationMap.getDayOfWeek();
    }

    public final int getHour() {
        return this.getHighSpeedVideoFpsRanges.getHour();
    }

    public final int getMinute() {
        return this.getHighSpeedVideoFpsRanges.getMinute();
    }

    public final int getSecond() {
        return this.getHighSpeedVideoFpsRanges.getSecond();
    }

    public final int getNano() {
        return this.getHighSpeedVideoFpsRanges.getNano();
    }

    @Override // org.threeten.bp.chrono.ChronoLocalDateTime, org.threeten.bp.jdk8.DefaultInterfaceTemporal, org.threeten.bp.temporal.Temporal
    public final org.threeten.bp.LocalDateTime with(org.threeten.bp.temporal.TemporalAdjuster temporalAdjuster) {
        if (temporalAdjuster instanceof org.threeten.bp.LocalDate) {
            org.threeten.bp.LocalDate localDate = (org.threeten.bp.LocalDate) temporalAdjuster;
            return this.Camera2StreamConfigurationMap == localDate ? this : new org.threeten.bp.LocalDateTime(localDate, this.getHighSpeedVideoFpsRanges);
        }
        if (temporalAdjuster instanceof org.threeten.bp.LocalTime) {
            org.threeten.bp.LocalTime localTime = (org.threeten.bp.LocalTime) temporalAdjuster;
            return this.getHighSpeedVideoFpsRanges == localTime ? this : new org.threeten.bp.LocalDateTime(this.Camera2StreamConfigurationMap, localTime);
        }
        if (temporalAdjuster instanceof org.threeten.bp.LocalDateTime) {
            return (org.threeten.bp.LocalDateTime) temporalAdjuster;
        }
        return (org.threeten.bp.LocalDateTime) temporalAdjuster.adjustInto(this);
    }

    @Override // org.threeten.bp.chrono.ChronoLocalDateTime, org.threeten.bp.temporal.Temporal
    public final org.threeten.bp.LocalDateTime with(org.threeten.bp.temporal.TemporalField temporalField, long j) {
        if (temporalField instanceof org.threeten.bp.temporal.ChronoField) {
            if (temporalField.isTimeBased()) {
                org.threeten.bp.LocalDate localDate = this.Camera2StreamConfigurationMap;
                org.threeten.bp.LocalTime with = this.getHighSpeedVideoFpsRanges.with(temporalField, j);
                return (this.Camera2StreamConfigurationMap == localDate && this.getHighSpeedVideoFpsRanges == with) ? this : new org.threeten.bp.LocalDateTime(localDate, with);
            }
            org.threeten.bp.LocalDate with2 = this.Camera2StreamConfigurationMap.with(temporalField, j);
            return this.Camera2StreamConfigurationMap == with2 ? this : new org.threeten.bp.LocalDateTime(with2, this.getHighSpeedVideoFpsRanges);
        }
        return (org.threeten.bp.LocalDateTime) temporalField.adjustInto(this, j);
    }

    public final org.threeten.bp.LocalDateTime withYear(int i) {
        org.threeten.bp.LocalDate withYear = this.Camera2StreamConfigurationMap.withYear(i);
        return this.Camera2StreamConfigurationMap == withYear ? this : new org.threeten.bp.LocalDateTime(withYear, this.getHighSpeedVideoFpsRanges);
    }

    public final org.threeten.bp.LocalDateTime withMonth(int i) {
        org.threeten.bp.LocalDate withMonth = this.Camera2StreamConfigurationMap.withMonth(i);
        return this.Camera2StreamConfigurationMap == withMonth ? this : new org.threeten.bp.LocalDateTime(withMonth, this.getHighSpeedVideoFpsRanges);
    }

    public final org.threeten.bp.LocalDateTime withDayOfMonth(int i) {
        org.threeten.bp.LocalDate withDayOfMonth = this.Camera2StreamConfigurationMap.withDayOfMonth(i);
        return this.Camera2StreamConfigurationMap == withDayOfMonth ? this : new org.threeten.bp.LocalDateTime(withDayOfMonth, this.getHighSpeedVideoFpsRanges);
    }

    public final org.threeten.bp.LocalDateTime withDayOfYear(int i) {
        org.threeten.bp.LocalDate withDayOfYear = this.Camera2StreamConfigurationMap.withDayOfYear(i);
        return this.Camera2StreamConfigurationMap == withDayOfYear ? this : new org.threeten.bp.LocalDateTime(withDayOfYear, this.getHighSpeedVideoFpsRanges);
    }

    public final org.threeten.bp.LocalDateTime withHour(int i) {
        org.threeten.bp.LocalTime withHour = this.getHighSpeedVideoFpsRanges.withHour(i);
        return this.getHighSpeedVideoFpsRanges == withHour ? this : new org.threeten.bp.LocalDateTime(this.Camera2StreamConfigurationMap, withHour);
    }

    public final org.threeten.bp.LocalDateTime withMinute(int i) {
        org.threeten.bp.LocalTime withMinute = this.getHighSpeedVideoFpsRanges.withMinute(i);
        return this.getHighSpeedVideoFpsRanges == withMinute ? this : new org.threeten.bp.LocalDateTime(this.Camera2StreamConfigurationMap, withMinute);
    }

    public final org.threeten.bp.LocalDateTime withSecond(int i) {
        org.threeten.bp.LocalTime withSecond = this.getHighSpeedVideoFpsRanges.withSecond(i);
        return this.getHighSpeedVideoFpsRanges == withSecond ? this : new org.threeten.bp.LocalDateTime(this.Camera2StreamConfigurationMap, withSecond);
    }

    public final org.threeten.bp.LocalDateTime withNano(int i) {
        org.threeten.bp.LocalTime withNano = this.getHighSpeedVideoFpsRanges.withNano(i);
        return this.getHighSpeedVideoFpsRanges == withNano ? this : new org.threeten.bp.LocalDateTime(this.Camera2StreamConfigurationMap, withNano);
    }

    public final org.threeten.bp.LocalDateTime truncatedTo(org.threeten.bp.temporal.TemporalUnit temporalUnit) {
        org.threeten.bp.LocalDate localDate = this.Camera2StreamConfigurationMap;
        org.threeten.bp.LocalTime truncatedTo = this.getHighSpeedVideoFpsRanges.truncatedTo(temporalUnit);
        return (this.Camera2StreamConfigurationMap == localDate && this.getHighSpeedVideoFpsRanges == truncatedTo) ? this : new org.threeten.bp.LocalDateTime(localDate, truncatedTo);
    }

    @Override // org.threeten.bp.chrono.ChronoLocalDateTime, org.threeten.bp.jdk8.DefaultInterfaceTemporal, org.threeten.bp.temporal.Temporal
    public final org.threeten.bp.LocalDateTime plus(org.threeten.bp.temporal.TemporalAmount temporalAmount) {
        return (org.threeten.bp.LocalDateTime) temporalAmount.addTo(this);
    }

    @Override // org.threeten.bp.chrono.ChronoLocalDateTime, org.threeten.bp.temporal.Temporal
    public final org.threeten.bp.LocalDateTime plus(long j, org.threeten.bp.temporal.TemporalUnit temporalUnit) {
        if (temporalUnit instanceof org.threeten.bp.temporal.ChronoUnit) {
            switch (org.threeten.bp.LocalDateTime.AnonymousClass2.getHighSpeedVideoFpsRanges[((org.threeten.bp.temporal.ChronoUnit) temporalUnit).ordinal()]) {
                case 1:
                    return plusNanos(j);
                case 2:
                    return plusDays(j / 86400000000L).plusNanos((j % 86400000000L) * 1000);
                case 3:
                    return plusDays(j / 86400000).plusNanos((j % 86400000) * 1000000);
                case 4:
                    return plusSeconds(j);
                case 5:
                    return plusMinutes(j);
                case 6:
                    return plusHours(j);
                case 7:
                    return plusDays(j / 256).plusHours((j % 256) * 12);
                default:
                    org.threeten.bp.LocalDate plus = this.Camera2StreamConfigurationMap.plus(j, temporalUnit);
                    return this.Camera2StreamConfigurationMap == plus ? this : new org.threeten.bp.LocalDateTime(plus, this.getHighSpeedVideoFpsRanges);
            }
        }
        return (org.threeten.bp.LocalDateTime) temporalUnit.addTo(this, j);
    }

    /* renamed from: org.threeten.bp.LocalDateTime$2, reason: invalid class name */
    static /* synthetic */ class AnonymousClass2 {
        static final /* synthetic */ int[] getHighSpeedVideoFpsRanges;

        static {
            int[] iArr = new int[org.threeten.bp.temporal.ChronoUnit.values().length];
            getHighSpeedVideoFpsRanges = iArr;
            try {
                iArr[org.threeten.bp.temporal.ChronoUnit.NANOS.ordinal()] = 1;
            } catch (java.lang.NoSuchFieldError unused) {
            }
            try {
                getHighSpeedVideoFpsRanges[org.threeten.bp.temporal.ChronoUnit.MICROS.ordinal()] = 2;
            } catch (java.lang.NoSuchFieldError unused2) {
            }
            try {
                getHighSpeedVideoFpsRanges[org.threeten.bp.temporal.ChronoUnit.MILLIS.ordinal()] = 3;
            } catch (java.lang.NoSuchFieldError unused3) {
            }
            try {
                getHighSpeedVideoFpsRanges[org.threeten.bp.temporal.ChronoUnit.SECONDS.ordinal()] = 4;
            } catch (java.lang.NoSuchFieldError unused4) {
            }
            try {
                getHighSpeedVideoFpsRanges[org.threeten.bp.temporal.ChronoUnit.MINUTES.ordinal()] = 5;
            } catch (java.lang.NoSuchFieldError unused5) {
            }
            try {
                getHighSpeedVideoFpsRanges[org.threeten.bp.temporal.ChronoUnit.HOURS.ordinal()] = 6;
            } catch (java.lang.NoSuchFieldError unused6) {
            }
            try {
                getHighSpeedVideoFpsRanges[org.threeten.bp.temporal.ChronoUnit.HALF_DAYS.ordinal()] = 7;
            } catch (java.lang.NoSuchFieldError unused7) {
            }
        }
    }

    public final org.threeten.bp.LocalDateTime plusYears(long j) {
        org.threeten.bp.LocalDate plusYears = this.Camera2StreamConfigurationMap.plusYears(j);
        return this.Camera2StreamConfigurationMap == plusYears ? this : new org.threeten.bp.LocalDateTime(plusYears, this.getHighSpeedVideoFpsRanges);
    }

    public final org.threeten.bp.LocalDateTime plusMonths(long j) {
        org.threeten.bp.LocalDate plusMonths = this.Camera2StreamConfigurationMap.plusMonths(j);
        return this.Camera2StreamConfigurationMap == plusMonths ? this : new org.threeten.bp.LocalDateTime(plusMonths, this.getHighSpeedVideoFpsRanges);
    }

    public final org.threeten.bp.LocalDateTime plusWeeks(long j) {
        org.threeten.bp.LocalDate plusWeeks = this.Camera2StreamConfigurationMap.plusWeeks(j);
        return this.Camera2StreamConfigurationMap == plusWeeks ? this : new org.threeten.bp.LocalDateTime(plusWeeks, this.getHighSpeedVideoFpsRanges);
    }

    public final org.threeten.bp.LocalDateTime plusDays(long j) {
        org.threeten.bp.LocalDate plusDays = this.Camera2StreamConfigurationMap.plusDays(j);
        return this.Camera2StreamConfigurationMap == plusDays ? this : new org.threeten.bp.LocalDateTime(plusDays, this.getHighSpeedVideoFpsRanges);
    }

    public final org.threeten.bp.LocalDateTime plusHours(long j) {
        return Camera2StreamConfigurationMap(this.Camera2StreamConfigurationMap, j, 0L, 0L, 0L, 1);
    }

    public final org.threeten.bp.LocalDateTime plusMinutes(long j) {
        return Camera2StreamConfigurationMap(this.Camera2StreamConfigurationMap, 0L, j, 0L, 0L, 1);
    }

    public final org.threeten.bp.LocalDateTime plusSeconds(long j) {
        return Camera2StreamConfigurationMap(this.Camera2StreamConfigurationMap, 0L, 0L, j, 0L, 1);
    }

    public final org.threeten.bp.LocalDateTime plusNanos(long j) {
        return Camera2StreamConfigurationMap(this.Camera2StreamConfigurationMap, 0L, 0L, 0L, j, 1);
    }

    @Override // org.threeten.bp.chrono.ChronoLocalDateTime, org.threeten.bp.jdk8.DefaultInterfaceTemporal, org.threeten.bp.temporal.Temporal
    public final org.threeten.bp.LocalDateTime minus(org.threeten.bp.temporal.TemporalAmount temporalAmount) {
        return (org.threeten.bp.LocalDateTime) temporalAmount.subtractFrom(this);
    }

    @Override // org.threeten.bp.chrono.ChronoLocalDateTime, org.threeten.bp.jdk8.DefaultInterfaceTemporal, org.threeten.bp.temporal.Temporal
    public final org.threeten.bp.LocalDateTime minus(long j, org.threeten.bp.temporal.TemporalUnit temporalUnit) {
        return j == Long.MIN_VALUE ? plus(Long.MAX_VALUE, temporalUnit).plus(1L, temporalUnit) : plus(-j, temporalUnit);
    }

    public final org.threeten.bp.LocalDateTime minusYears(long j) {
        return j == Long.MIN_VALUE ? plusYears(Long.MAX_VALUE).plusYears(1L) : plusYears(-j);
    }

    public final org.threeten.bp.LocalDateTime minusMonths(long j) {
        return j == Long.MIN_VALUE ? plusMonths(Long.MAX_VALUE).plusMonths(1L) : plusMonths(-j);
    }

    public final org.threeten.bp.LocalDateTime minusWeeks(long j) {
        return j == Long.MIN_VALUE ? plusWeeks(Long.MAX_VALUE).plusWeeks(1L) : plusWeeks(-j);
    }

    public final org.threeten.bp.LocalDateTime minusDays(long j) {
        return j == Long.MIN_VALUE ? plusDays(Long.MAX_VALUE).plusDays(1L) : plusDays(-j);
    }

    public final org.threeten.bp.LocalDateTime minusHours(long j) {
        return Camera2StreamConfigurationMap(this.Camera2StreamConfigurationMap, j, 0L, 0L, 0L, -1);
    }

    public final org.threeten.bp.LocalDateTime minusMinutes(long j) {
        return Camera2StreamConfigurationMap(this.Camera2StreamConfigurationMap, 0L, j, 0L, 0L, -1);
    }

    public final org.threeten.bp.LocalDateTime minusSeconds(long j) {
        return Camera2StreamConfigurationMap(this.Camera2StreamConfigurationMap, 0L, 0L, j, 0L, -1);
    }

    public final org.threeten.bp.LocalDateTime minusNanos(long j) {
        return Camera2StreamConfigurationMap(this.Camera2StreamConfigurationMap, 0L, 0L, 0L, j, -1);
    }

    private org.threeten.bp.LocalDateTime Camera2StreamConfigurationMap(org.threeten.bp.LocalDate localDate, long j, long j2, long j3, long j4, int i) {
        if ((j | j2 | j3 | j4) == 0) {
            return this.Camera2StreamConfigurationMap == localDate ? this : new org.threeten.bp.LocalDateTime(localDate, this.getHighSpeedVideoFpsRanges);
        }
        long j5 = j4 / kotlinx.datetime.internal.DateCalculationsKt.NANOS_PER_DAY;
        long j6 = j3 / 86400;
        long j7 = j2 / 1440;
        long j8 = j / 24;
        long j9 = i;
        long nanoOfDay = this.getHighSpeedVideoFpsRanges.toNanoOfDay();
        long j10 = (((j4 % kotlinx.datetime.internal.DateCalculationsKt.NANOS_PER_DAY) + ((j3 % 86400) * 1000000000) + ((j2 % 1440) * kotlinx.datetime.internal.DateCalculationsKt.NANOS_PER_MINUTE) + ((j % 24) * kotlinx.datetime.internal.DateCalculationsKt.NANOS_PER_HOUR)) * j9) + nanoOfDay;
        long floorDiv = org.threeten.bp.jdk8.Jdk8Methods.floorDiv(j10, kotlinx.datetime.internal.DateCalculationsKt.NANOS_PER_DAY);
        long floorMod = org.threeten.bp.jdk8.Jdk8Methods.floorMod(j10, kotlinx.datetime.internal.DateCalculationsKt.NANOS_PER_DAY);
        org.threeten.bp.LocalTime ofNanoOfDay = floorMod == nanoOfDay ? this.getHighSpeedVideoFpsRanges : org.threeten.bp.LocalTime.ofNanoOfDay(floorMod);
        org.threeten.bp.LocalDate plusDays = localDate.plusDays(((j5 + j6 + j7 + j8) * j9) + floorDiv);
        return (this.Camera2StreamConfigurationMap == plusDays && this.getHighSpeedVideoFpsRanges == ofNanoOfDay) ? this : new org.threeten.bp.LocalDateTime(plusDays, ofNanoOfDay);
    }

    @Override // org.threeten.bp.chrono.ChronoLocalDateTime, org.threeten.bp.jdk8.DefaultInterfaceTemporalAccessor, org.threeten.bp.temporal.TemporalAccessor
    public final <R> R query(org.threeten.bp.temporal.TemporalQuery<R> temporalQuery) {
        if (temporalQuery == org.threeten.bp.temporal.TemporalQueries.localDate()) {
            return (R) toLocalDate();
        }
        return (R) super.query(temporalQuery);
    }

    @Override // org.threeten.bp.chrono.ChronoLocalDateTime, org.threeten.bp.temporal.TemporalAdjuster
    public final org.threeten.bp.temporal.Temporal adjustInto(org.threeten.bp.temporal.Temporal temporal) {
        return super.adjustInto(temporal);
    }

    @Override // org.threeten.bp.temporal.Temporal
    public final long until(org.threeten.bp.temporal.Temporal temporal, org.threeten.bp.temporal.TemporalUnit temporalUnit) {
        org.threeten.bp.LocalDateTime from = from((org.threeten.bp.temporal.TemporalAccessor) temporal);
        if (temporalUnit instanceof org.threeten.bp.temporal.ChronoUnit) {
            org.threeten.bp.temporal.ChronoUnit chronoUnit = (org.threeten.bp.temporal.ChronoUnit) temporalUnit;
            if (chronoUnit.isTimeBased()) {
                long epochDay = from.Camera2StreamConfigurationMap.toEpochDay() - this.Camera2StreamConfigurationMap.toEpochDay();
                long nanoOfDay = from.getHighSpeedVideoFpsRanges.toNanoOfDay() - this.getHighSpeedVideoFpsRanges.toNanoOfDay();
                if (epochDay > 0 && nanoOfDay < 0) {
                    epochDay--;
                    nanoOfDay += kotlinx.datetime.internal.DateCalculationsKt.NANOS_PER_DAY;
                } else if (epochDay < 0 && nanoOfDay > 0) {
                    epochDay++;
                    nanoOfDay -= kotlinx.datetime.internal.DateCalculationsKt.NANOS_PER_DAY;
                }
                switch (org.threeten.bp.LocalDateTime.AnonymousClass2.getHighSpeedVideoFpsRanges[chronoUnit.ordinal()]) {
                    case 1:
                        return org.threeten.bp.jdk8.Jdk8Methods.safeAdd(org.threeten.bp.jdk8.Jdk8Methods.safeMultiply(epochDay, kotlinx.datetime.internal.DateCalculationsKt.NANOS_PER_DAY), nanoOfDay);
                    case 2:
                        return org.threeten.bp.jdk8.Jdk8Methods.safeAdd(org.threeten.bp.jdk8.Jdk8Methods.safeMultiply(epochDay, 86400000000L), nanoOfDay / 1000);
                    case 3:
                        return org.threeten.bp.jdk8.Jdk8Methods.safeAdd(org.threeten.bp.jdk8.Jdk8Methods.safeMultiply(epochDay, 86400000L), nanoOfDay / 1000000);
                    case 4:
                        return org.threeten.bp.jdk8.Jdk8Methods.safeAdd(org.threeten.bp.jdk8.Jdk8Methods.safeMultiply(epochDay, kotlinx.datetime.internal.DateCalculationsKt.SECONDS_PER_DAY), nanoOfDay / 1000000000);
                    case 5:
                        return org.threeten.bp.jdk8.Jdk8Methods.safeAdd(org.threeten.bp.jdk8.Jdk8Methods.safeMultiply(epochDay, com.paypal.oslo.feature.verificationcapture.ui.screens.daonface.FaceCaptureManager.IDEAL_CAPTURE_WIDTH), nanoOfDay / kotlinx.datetime.internal.DateCalculationsKt.NANOS_PER_MINUTE);
                    case 6:
                        return org.threeten.bp.jdk8.Jdk8Methods.safeAdd(org.threeten.bp.jdk8.Jdk8Methods.safeMultiply(epochDay, 24), nanoOfDay / kotlinx.datetime.internal.DateCalculationsKt.NANOS_PER_HOUR);
                    case 7:
                        return org.threeten.bp.jdk8.Jdk8Methods.safeAdd(org.threeten.bp.jdk8.Jdk8Methods.safeMultiply(epochDay, 2), nanoOfDay / 43200000000000L);
                    default:
                        throw new org.threeten.bp.temporal.UnsupportedTemporalTypeException("Unsupported unit: ".concat(java.lang.String.valueOf(temporalUnit)));
                }
            }
            org.threeten.bp.LocalDate localDate = from.Camera2StreamConfigurationMap;
            if (localDate.isAfter(this.Camera2StreamConfigurationMap) && from.getHighSpeedVideoFpsRanges.isBefore(this.getHighSpeedVideoFpsRanges)) {
                localDate = localDate.minusDays(1L);
            } else if (localDate.isBefore(this.Camera2StreamConfigurationMap) && from.getHighSpeedVideoFpsRanges.isAfter(this.getHighSpeedVideoFpsRanges)) {
                localDate = localDate.plusDays(1L);
            }
            return this.Camera2StreamConfigurationMap.until(localDate, temporalUnit);
        }
        return temporalUnit.between(this, from);
    }

    public final org.threeten.bp.OffsetDateTime atOffset(org.threeten.bp.ZoneOffset zoneOffset) {
        return org.threeten.bp.OffsetDateTime.of(this, zoneOffset);
    }

    @Override // org.threeten.bp.chrono.ChronoLocalDateTime
    /* renamed from: atZone, reason: merged with bridge method [inline-methods] */
    public final org.threeten.bp.chrono.ChronoZonedDateTime<org.threeten.bp.LocalDate> atZone2(org.threeten.bp.ZoneId zoneId) {
        return org.threeten.bp.ZonedDateTime.of(this, zoneId);
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // org.threeten.bp.chrono.ChronoLocalDateTime
    public final org.threeten.bp.LocalDate toLocalDate() {
        return this.Camera2StreamConfigurationMap;
    }

    @Override // org.threeten.bp.chrono.ChronoLocalDateTime
    public final org.threeten.bp.LocalTime toLocalTime() {
        return this.getHighSpeedVideoFpsRanges;
    }

    @Override // org.threeten.bp.chrono.ChronoLocalDateTime
    public final int compareTo(org.threeten.bp.chrono.ChronoLocalDateTime<?> chronoLocalDateTime) {
        if (chronoLocalDateTime instanceof org.threeten.bp.LocalDateTime) {
            org.threeten.bp.LocalDateTime localDateTime = (org.threeten.bp.LocalDateTime) chronoLocalDateTime;
            int highSpeedVideoSizes = this.Camera2StreamConfigurationMap.getHighSpeedVideoSizes(localDateTime.toLocalDate());
            return highSpeedVideoSizes == 0 ? this.getHighSpeedVideoFpsRanges.compareTo(localDateTime.toLocalTime()) : highSpeedVideoSizes;
        }
        return super.compareTo(chronoLocalDateTime);
    }

    @Override // org.threeten.bp.chrono.ChronoLocalDateTime
    public final boolean isAfter(org.threeten.bp.chrono.ChronoLocalDateTime<?> chronoLocalDateTime) {
        if (chronoLocalDateTime instanceof org.threeten.bp.LocalDateTime) {
            org.threeten.bp.LocalDateTime localDateTime = (org.threeten.bp.LocalDateTime) chronoLocalDateTime;
            int highSpeedVideoSizes = this.Camera2StreamConfigurationMap.getHighSpeedVideoSizes(localDateTime.toLocalDate());
            if (highSpeedVideoSizes == 0) {
                highSpeedVideoSizes = this.getHighSpeedVideoFpsRanges.compareTo(localDateTime.toLocalTime());
            }
            return highSpeedVideoSizes > 0;
        }
        return super.isAfter(chronoLocalDateTime);
    }

    @Override // org.threeten.bp.chrono.ChronoLocalDateTime
    public final boolean isBefore(org.threeten.bp.chrono.ChronoLocalDateTime<?> chronoLocalDateTime) {
        if (chronoLocalDateTime instanceof org.threeten.bp.LocalDateTime) {
            org.threeten.bp.LocalDateTime localDateTime = (org.threeten.bp.LocalDateTime) chronoLocalDateTime;
            int highSpeedVideoSizes = this.Camera2StreamConfigurationMap.getHighSpeedVideoSizes(localDateTime.toLocalDate());
            if (highSpeedVideoSizes == 0) {
                highSpeedVideoSizes = this.getHighSpeedVideoFpsRanges.compareTo(localDateTime.toLocalTime());
            }
            return highSpeedVideoSizes < 0;
        }
        return super.isBefore(chronoLocalDateTime);
    }

    @Override // org.threeten.bp.chrono.ChronoLocalDateTime
    public final boolean isEqual(org.threeten.bp.chrono.ChronoLocalDateTime<?> chronoLocalDateTime) {
        if (chronoLocalDateTime instanceof org.threeten.bp.LocalDateTime) {
            org.threeten.bp.LocalDateTime localDateTime = (org.threeten.bp.LocalDateTime) chronoLocalDateTime;
            int highSpeedVideoSizes = this.Camera2StreamConfigurationMap.getHighSpeedVideoSizes(localDateTime.toLocalDate());
            if (highSpeedVideoSizes == 0) {
                highSpeedVideoSizes = this.getHighSpeedVideoFpsRanges.compareTo(localDateTime.toLocalTime());
            }
            return highSpeedVideoSizes == 0;
        }
        return super.isEqual(chronoLocalDateTime);
    }

    @Override // org.threeten.bp.chrono.ChronoLocalDateTime
    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof org.threeten.bp.LocalDateTime)) {
            return false;
        }
        org.threeten.bp.LocalDateTime localDateTime = (org.threeten.bp.LocalDateTime) obj;
        return this.Camera2StreamConfigurationMap.equals(localDateTime.Camera2StreamConfigurationMap) && this.getHighSpeedVideoFpsRanges.equals(localDateTime.getHighSpeedVideoFpsRanges);
    }

    @Override // org.threeten.bp.chrono.ChronoLocalDateTime
    public final int hashCode() {
        return this.Camera2StreamConfigurationMap.hashCode() ^ this.getHighSpeedVideoFpsRanges.hashCode();
    }

    @Override // org.threeten.bp.chrono.ChronoLocalDateTime
    public final java.lang.String toString() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append(this.Camera2StreamConfigurationMap.toString());
        sb.append('T');
        sb.append(this.getHighSpeedVideoFpsRanges.toString());
        return sb.toString();
    }

    @Override // org.threeten.bp.chrono.ChronoLocalDateTime
    public final java.lang.String format(org.threeten.bp.format.DateTimeFormatter dateTimeFormatter) {
        return super.format(dateTimeFormatter);
    }

    private java.lang.Object writeReplace() {
        return new org.threeten.bp.Ser((byte) 4, this);
    }

    private java.lang.Object readResolve() throws java.io.ObjectStreamException {
        throw new java.io.InvalidObjectException("Deserialization via serialization delegate");
    }

    final void Camera2StreamConfigurationMap(java.io.DataOutput dataOutput) throws java.io.IOException {
        org.threeten.bp.LocalDate localDate = this.Camera2StreamConfigurationMap;
        dataOutput.writeInt(localDate.getHighSpeedVideoFpsRangesFor);
        dataOutput.writeByte(localDate.Camera2StreamConfigurationMap);
        dataOutput.writeByte(localDate.getHighSpeedVideoSizes);
        this.getHighSpeedVideoFpsRanges.Camera2StreamConfigurationMap(dataOutput);
    }

    static org.threeten.bp.LocalDateTime getHighSpeedVideoFpsRangesFor(java.io.DataInput dataInput) throws java.io.IOException {
        return of(org.threeten.bp.LocalDate.getHighSpeedVideoFpsRangesFor(dataInput), org.threeten.bp.LocalTime.getHighSpeedVideoFpsRangesFor(dataInput));
    }
}
