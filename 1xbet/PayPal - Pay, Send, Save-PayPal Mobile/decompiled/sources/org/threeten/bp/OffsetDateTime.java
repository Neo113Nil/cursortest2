package org.threeten.bp;

/* loaded from: classes18.dex */
public final class OffsetDateTime extends org.threeten.bp.jdk8.DefaultInterfaceTemporal implements org.threeten.bp.temporal.Temporal, org.threeten.bp.temporal.TemporalAdjuster, java.lang.Comparable<org.threeten.bp.OffsetDateTime>, java.io.Serializable {
    private static final long serialVersionUID = 2287754244819255394L;
    final org.threeten.bp.ZoneOffset getHighResolutionOutputSizeshNQ4ISI;
    final org.threeten.bp.LocalDateTime getHighSpeedVideoFpsRangesFor;
    public static final org.threeten.bp.OffsetDateTime MIN = org.threeten.bp.LocalDateTime.MIN.atOffset(org.threeten.bp.ZoneOffset.MAX);
    public static final org.threeten.bp.OffsetDateTime MAX = org.threeten.bp.LocalDateTime.MAX.atOffset(org.threeten.bp.ZoneOffset.MIN);
    public static final org.threeten.bp.temporal.TemporalQuery<org.threeten.bp.OffsetDateTime> FROM = new org.threeten.bp.temporal.TemporalQuery<org.threeten.bp.OffsetDateTime>() { // from class: org.threeten.bp.OffsetDateTime.1
        @Override // org.threeten.bp.temporal.TemporalQuery
        public /* synthetic */ org.threeten.bp.OffsetDateTime queryFrom(org.threeten.bp.temporal.TemporalAccessor temporalAccessor) {
            return org.threeten.bp.OffsetDateTime.from(temporalAccessor);
        }
    };
    private static final java.util.Comparator<org.threeten.bp.OffsetDateTime> getHighSpeedVideoFpsRanges = new java.util.Comparator<org.threeten.bp.OffsetDateTime>() { // from class: org.threeten.bp.OffsetDateTime.2
        @Override // java.util.Comparator
        public /* synthetic */ int compare(org.threeten.bp.OffsetDateTime offsetDateTime, org.threeten.bp.OffsetDateTime offsetDateTime2) {
            int compareLongs = org.threeten.bp.jdk8.Jdk8Methods.compareLongs(offsetDateTime.toEpochSecond(), offsetDateTime2.toEpochSecond());
            return compareLongs == 0 ? org.threeten.bp.jdk8.Jdk8Methods.compareLongs(r5.getNano(), r6.getNano()) : compareLongs;
        }
    };

    public static java.util.Comparator<org.threeten.bp.OffsetDateTime> timeLineOrder() {
        return getHighSpeedVideoFpsRanges;
    }

    public static org.threeten.bp.OffsetDateTime now() {
        return now(org.threeten.bp.Clock.systemDefaultZone());
    }

    public static org.threeten.bp.OffsetDateTime now(org.threeten.bp.ZoneId zoneId) {
        return now(org.threeten.bp.Clock.system(zoneId));
    }

    public static org.threeten.bp.OffsetDateTime now(org.threeten.bp.Clock clock) {
        org.threeten.bp.jdk8.Jdk8Methods.requireNonNull(clock, "clock");
        org.threeten.bp.Instant instant = clock.instant();
        return ofInstant(instant, clock.getZone().getRules().getOffset(instant));
    }

    public static org.threeten.bp.OffsetDateTime of(org.threeten.bp.LocalDate localDate, org.threeten.bp.LocalTime localTime, org.threeten.bp.ZoneOffset zoneOffset) {
        return new org.threeten.bp.OffsetDateTime(org.threeten.bp.LocalDateTime.of(localDate, localTime), zoneOffset);
    }

    public static org.threeten.bp.OffsetDateTime of(org.threeten.bp.LocalDateTime localDateTime, org.threeten.bp.ZoneOffset zoneOffset) {
        return new org.threeten.bp.OffsetDateTime(localDateTime, zoneOffset);
    }

    public static org.threeten.bp.OffsetDateTime of(int i, int i2, int i3, int i4, int i5, int i6, int i7, org.threeten.bp.ZoneOffset zoneOffset) {
        return new org.threeten.bp.OffsetDateTime(org.threeten.bp.LocalDateTime.of(i, i2, i3, i4, i5, i6, i7), zoneOffset);
    }

    public static org.threeten.bp.OffsetDateTime ofInstant(org.threeten.bp.Instant instant, org.threeten.bp.ZoneId zoneId) {
        org.threeten.bp.jdk8.Jdk8Methods.requireNonNull(instant, "instant");
        org.threeten.bp.jdk8.Jdk8Methods.requireNonNull(zoneId, "zone");
        org.threeten.bp.ZoneOffset offset = zoneId.getRules().getOffset(instant);
        return new org.threeten.bp.OffsetDateTime(org.threeten.bp.LocalDateTime.ofEpochSecond(instant.getEpochSecond(), instant.getNano(), offset), offset);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v7, types: [org.threeten.bp.OffsetDateTime] */
    public static org.threeten.bp.OffsetDateTime from(org.threeten.bp.temporal.TemporalAccessor temporalAccessor) {
        if (temporalAccessor instanceof org.threeten.bp.OffsetDateTime) {
            return (org.threeten.bp.OffsetDateTime) temporalAccessor;
        }
        try {
            org.threeten.bp.ZoneOffset from = org.threeten.bp.ZoneOffset.from(temporalAccessor);
            try {
                temporalAccessor = of(org.threeten.bp.LocalDateTime.from(temporalAccessor), from);
                return temporalAccessor;
            } catch (org.threeten.bp.DateTimeException unused) {
                return ofInstant(org.threeten.bp.Instant.from(temporalAccessor), from);
            }
        } catch (org.threeten.bp.DateTimeException unused2) {
            java.lang.StringBuilder sb = new java.lang.StringBuilder("Unable to obtain OffsetDateTime from TemporalAccessor: ");
            sb.append(temporalAccessor);
            sb.append(", type ");
            sb.append(temporalAccessor.getClass().getName());
            throw new org.threeten.bp.DateTimeException(sb.toString());
        }
    }

    public static org.threeten.bp.OffsetDateTime parse(java.lang.CharSequence charSequence) {
        return parse(charSequence, org.threeten.bp.format.DateTimeFormatter.ISO_OFFSET_DATE_TIME);
    }

    public static org.threeten.bp.OffsetDateTime parse(java.lang.CharSequence charSequence, org.threeten.bp.format.DateTimeFormatter dateTimeFormatter) {
        org.threeten.bp.jdk8.Jdk8Methods.requireNonNull(dateTimeFormatter, "formatter");
        return (org.threeten.bp.OffsetDateTime) dateTimeFormatter.parse(charSequence, FROM);
    }

    private OffsetDateTime(org.threeten.bp.LocalDateTime localDateTime, org.threeten.bp.ZoneOffset zoneOffset) {
        this.getHighSpeedVideoFpsRangesFor = (org.threeten.bp.LocalDateTime) org.threeten.bp.jdk8.Jdk8Methods.requireNonNull(localDateTime, "dateTime");
        this.getHighResolutionOutputSizeshNQ4ISI = (org.threeten.bp.ZoneOffset) org.threeten.bp.jdk8.Jdk8Methods.requireNonNull(zoneOffset, "offset");
    }

    @Override // org.threeten.bp.temporal.TemporalAccessor
    public final boolean isSupported(org.threeten.bp.temporal.TemporalField temporalField) {
        if (temporalField instanceof org.threeten.bp.temporal.ChronoField) {
            return true;
        }
        return temporalField != null && temporalField.isSupportedBy(this);
    }

    @Override // org.threeten.bp.temporal.Temporal
    public final boolean isSupported(org.threeten.bp.temporal.TemporalUnit temporalUnit) {
        return temporalUnit instanceof org.threeten.bp.temporal.ChronoUnit ? temporalUnit.isDateBased() || temporalUnit.isTimeBased() : temporalUnit != null && temporalUnit.isSupportedBy(this);
    }

    @Override // org.threeten.bp.jdk8.DefaultInterfaceTemporalAccessor, org.threeten.bp.temporal.TemporalAccessor
    public final org.threeten.bp.temporal.ValueRange range(org.threeten.bp.temporal.TemporalField temporalField) {
        if (temporalField instanceof org.threeten.bp.temporal.ChronoField) {
            if (temporalField == org.threeten.bp.temporal.ChronoField.INSTANT_SECONDS || temporalField == org.threeten.bp.temporal.ChronoField.OFFSET_SECONDS) {
                return temporalField.range();
            }
            return this.getHighSpeedVideoFpsRangesFor.range(temporalField);
        }
        return temporalField.rangeRefinedBy(this);
    }

    /* renamed from: org.threeten.bp.OffsetDateTime$3, reason: invalid class name */
    static /* synthetic */ class AnonymousClass3 {
        static final /* synthetic */ int[] Camera2StreamConfigurationMap;

        static {
            int[] iArr = new int[org.threeten.bp.temporal.ChronoField.values().length];
            Camera2StreamConfigurationMap = iArr;
            try {
                iArr[org.threeten.bp.temporal.ChronoField.INSTANT_SECONDS.ordinal()] = 1;
            } catch (java.lang.NoSuchFieldError unused) {
            }
            try {
                Camera2StreamConfigurationMap[org.threeten.bp.temporal.ChronoField.OFFSET_SECONDS.ordinal()] = 2;
            } catch (java.lang.NoSuchFieldError unused2) {
            }
        }
    }

    @Override // org.threeten.bp.jdk8.DefaultInterfaceTemporalAccessor, org.threeten.bp.temporal.TemporalAccessor
    public final int get(org.threeten.bp.temporal.TemporalField temporalField) {
        if (temporalField instanceof org.threeten.bp.temporal.ChronoField) {
            int i = org.threeten.bp.OffsetDateTime.AnonymousClass3.Camera2StreamConfigurationMap[((org.threeten.bp.temporal.ChronoField) temporalField).ordinal()];
            if (i == 1) {
                throw new org.threeten.bp.DateTimeException("Field too large for an int: ".concat(java.lang.String.valueOf(temporalField)));
            }
            if (i == 2) {
                return getOffset().getTotalSeconds();
            }
            return this.getHighSpeedVideoFpsRangesFor.get(temporalField);
        }
        return super.get(temporalField);
    }

    @Override // org.threeten.bp.temporal.TemporalAccessor
    public final long getLong(org.threeten.bp.temporal.TemporalField temporalField) {
        if (temporalField instanceof org.threeten.bp.temporal.ChronoField) {
            int i = org.threeten.bp.OffsetDateTime.AnonymousClass3.Camera2StreamConfigurationMap[((org.threeten.bp.temporal.ChronoField) temporalField).ordinal()];
            if (i == 1) {
                return toEpochSecond();
            }
            if (i == 2) {
                return getOffset().getTotalSeconds();
            }
            return this.getHighSpeedVideoFpsRangesFor.getLong(temporalField);
        }
        return temporalField.getFrom(this);
    }

    public final org.threeten.bp.ZoneOffset getOffset() {
        return this.getHighResolutionOutputSizeshNQ4ISI;
    }

    public final org.threeten.bp.OffsetDateTime withOffsetSameLocal(org.threeten.bp.ZoneOffset zoneOffset) {
        return this.getHighResolutionOutputSizeshNQ4ISI.equals(zoneOffset) ? this : new org.threeten.bp.OffsetDateTime(this.getHighSpeedVideoFpsRangesFor, zoneOffset);
    }

    public final org.threeten.bp.OffsetDateTime withOffsetSameInstant(org.threeten.bp.ZoneOffset zoneOffset) {
        if (zoneOffset.equals(this.getHighResolutionOutputSizeshNQ4ISI)) {
            return this;
        }
        return new org.threeten.bp.OffsetDateTime(this.getHighSpeedVideoFpsRangesFor.plusSeconds(zoneOffset.getTotalSeconds() - this.getHighResolutionOutputSizeshNQ4ISI.getTotalSeconds()), zoneOffset);
    }

    public final int getYear() {
        return this.getHighSpeedVideoFpsRangesFor.getYear();
    }

    public final int getMonthValue() {
        return this.getHighSpeedVideoFpsRangesFor.getMonthValue();
    }

    public final org.threeten.bp.Month getMonth() {
        return this.getHighSpeedVideoFpsRangesFor.getMonth();
    }

    public final int getDayOfMonth() {
        return this.getHighSpeedVideoFpsRangesFor.getDayOfMonth();
    }

    public final int getDayOfYear() {
        return this.getHighSpeedVideoFpsRangesFor.getDayOfYear();
    }

    public final org.threeten.bp.DayOfWeek getDayOfWeek() {
        return this.getHighSpeedVideoFpsRangesFor.getDayOfWeek();
    }

    public final int getHour() {
        return this.getHighSpeedVideoFpsRangesFor.getHour();
    }

    public final int getMinute() {
        return this.getHighSpeedVideoFpsRangesFor.getMinute();
    }

    public final int getSecond() {
        return this.getHighSpeedVideoFpsRangesFor.getSecond();
    }

    public final int getNano() {
        return this.getHighSpeedVideoFpsRangesFor.getNano();
    }

    @Override // org.threeten.bp.jdk8.DefaultInterfaceTemporal, org.threeten.bp.temporal.Temporal
    public final org.threeten.bp.OffsetDateTime with(org.threeten.bp.temporal.TemporalAdjuster temporalAdjuster) {
        if ((temporalAdjuster instanceof org.threeten.bp.LocalDate) || (temporalAdjuster instanceof org.threeten.bp.LocalTime) || (temporalAdjuster instanceof org.threeten.bp.LocalDateTime)) {
            org.threeten.bp.LocalDateTime with = this.getHighSpeedVideoFpsRangesFor.with(temporalAdjuster);
            org.threeten.bp.ZoneOffset zoneOffset = this.getHighResolutionOutputSizeshNQ4ISI;
            return (this.getHighSpeedVideoFpsRangesFor == with && zoneOffset.equals(zoneOffset)) ? this : new org.threeten.bp.OffsetDateTime(with, zoneOffset);
        }
        if (temporalAdjuster instanceof org.threeten.bp.Instant) {
            return ofInstant((org.threeten.bp.Instant) temporalAdjuster, this.getHighResolutionOutputSizeshNQ4ISI);
        }
        if (temporalAdjuster instanceof org.threeten.bp.ZoneOffset) {
            org.threeten.bp.ZoneOffset zoneOffset2 = (org.threeten.bp.ZoneOffset) temporalAdjuster;
            return this.getHighResolutionOutputSizeshNQ4ISI.equals(zoneOffset2) ? this : new org.threeten.bp.OffsetDateTime(this.getHighSpeedVideoFpsRangesFor, zoneOffset2);
        }
        if (temporalAdjuster instanceof org.threeten.bp.OffsetDateTime) {
            return (org.threeten.bp.OffsetDateTime) temporalAdjuster;
        }
        return (org.threeten.bp.OffsetDateTime) temporalAdjuster.adjustInto(this);
    }

    @Override // org.threeten.bp.temporal.Temporal
    public final org.threeten.bp.OffsetDateTime with(org.threeten.bp.temporal.TemporalField temporalField, long j) {
        if (temporalField instanceof org.threeten.bp.temporal.ChronoField) {
            org.threeten.bp.temporal.ChronoField chronoField = (org.threeten.bp.temporal.ChronoField) temporalField;
            int i = org.threeten.bp.OffsetDateTime.AnonymousClass3.Camera2StreamConfigurationMap[chronoField.ordinal()];
            if (i == 1) {
                return ofInstant(org.threeten.bp.Instant.ofEpochSecond(j, getNano()), this.getHighResolutionOutputSizeshNQ4ISI);
            }
            if (i == 2) {
                org.threeten.bp.LocalDateTime localDateTime = this.getHighSpeedVideoFpsRangesFor;
                org.threeten.bp.ZoneOffset ofTotalSeconds = org.threeten.bp.ZoneOffset.ofTotalSeconds(chronoField.checkValidIntValue(j));
                return (this.getHighSpeedVideoFpsRangesFor == localDateTime && this.getHighResolutionOutputSizeshNQ4ISI.equals(ofTotalSeconds)) ? this : new org.threeten.bp.OffsetDateTime(localDateTime, ofTotalSeconds);
            }
            org.threeten.bp.LocalDateTime with = this.getHighSpeedVideoFpsRangesFor.with(temporalField, j);
            org.threeten.bp.ZoneOffset zoneOffset = this.getHighResolutionOutputSizeshNQ4ISI;
            return (this.getHighSpeedVideoFpsRangesFor == with && zoneOffset.equals(zoneOffset)) ? this : new org.threeten.bp.OffsetDateTime(with, zoneOffset);
        }
        return (org.threeten.bp.OffsetDateTime) temporalField.adjustInto(this, j);
    }

    public final org.threeten.bp.OffsetDateTime withYear(int i) {
        org.threeten.bp.LocalDateTime withYear = this.getHighSpeedVideoFpsRangesFor.withYear(i);
        org.threeten.bp.ZoneOffset zoneOffset = this.getHighResolutionOutputSizeshNQ4ISI;
        return (this.getHighSpeedVideoFpsRangesFor == withYear && zoneOffset.equals(zoneOffset)) ? this : new org.threeten.bp.OffsetDateTime(withYear, zoneOffset);
    }

    public final org.threeten.bp.OffsetDateTime withMonth(int i) {
        org.threeten.bp.LocalDateTime withMonth = this.getHighSpeedVideoFpsRangesFor.withMonth(i);
        org.threeten.bp.ZoneOffset zoneOffset = this.getHighResolutionOutputSizeshNQ4ISI;
        return (this.getHighSpeedVideoFpsRangesFor == withMonth && zoneOffset.equals(zoneOffset)) ? this : new org.threeten.bp.OffsetDateTime(withMonth, zoneOffset);
    }

    public final org.threeten.bp.OffsetDateTime withDayOfMonth(int i) {
        org.threeten.bp.LocalDateTime withDayOfMonth = this.getHighSpeedVideoFpsRangesFor.withDayOfMonth(i);
        org.threeten.bp.ZoneOffset zoneOffset = this.getHighResolutionOutputSizeshNQ4ISI;
        return (this.getHighSpeedVideoFpsRangesFor == withDayOfMonth && zoneOffset.equals(zoneOffset)) ? this : new org.threeten.bp.OffsetDateTime(withDayOfMonth, zoneOffset);
    }

    public final org.threeten.bp.OffsetDateTime withDayOfYear(int i) {
        org.threeten.bp.LocalDateTime withDayOfYear = this.getHighSpeedVideoFpsRangesFor.withDayOfYear(i);
        org.threeten.bp.ZoneOffset zoneOffset = this.getHighResolutionOutputSizeshNQ4ISI;
        return (this.getHighSpeedVideoFpsRangesFor == withDayOfYear && zoneOffset.equals(zoneOffset)) ? this : new org.threeten.bp.OffsetDateTime(withDayOfYear, zoneOffset);
    }

    public final org.threeten.bp.OffsetDateTime withHour(int i) {
        org.threeten.bp.LocalDateTime withHour = this.getHighSpeedVideoFpsRangesFor.withHour(i);
        org.threeten.bp.ZoneOffset zoneOffset = this.getHighResolutionOutputSizeshNQ4ISI;
        return (this.getHighSpeedVideoFpsRangesFor == withHour && zoneOffset.equals(zoneOffset)) ? this : new org.threeten.bp.OffsetDateTime(withHour, zoneOffset);
    }

    public final org.threeten.bp.OffsetDateTime withMinute(int i) {
        org.threeten.bp.LocalDateTime withMinute = this.getHighSpeedVideoFpsRangesFor.withMinute(i);
        org.threeten.bp.ZoneOffset zoneOffset = this.getHighResolutionOutputSizeshNQ4ISI;
        return (this.getHighSpeedVideoFpsRangesFor == withMinute && zoneOffset.equals(zoneOffset)) ? this : new org.threeten.bp.OffsetDateTime(withMinute, zoneOffset);
    }

    public final org.threeten.bp.OffsetDateTime withSecond(int i) {
        org.threeten.bp.LocalDateTime withSecond = this.getHighSpeedVideoFpsRangesFor.withSecond(i);
        org.threeten.bp.ZoneOffset zoneOffset = this.getHighResolutionOutputSizeshNQ4ISI;
        return (this.getHighSpeedVideoFpsRangesFor == withSecond && zoneOffset.equals(zoneOffset)) ? this : new org.threeten.bp.OffsetDateTime(withSecond, zoneOffset);
    }

    public final org.threeten.bp.OffsetDateTime withNano(int i) {
        org.threeten.bp.LocalDateTime withNano = this.getHighSpeedVideoFpsRangesFor.withNano(i);
        org.threeten.bp.ZoneOffset zoneOffset = this.getHighResolutionOutputSizeshNQ4ISI;
        return (this.getHighSpeedVideoFpsRangesFor == withNano && zoneOffset.equals(zoneOffset)) ? this : new org.threeten.bp.OffsetDateTime(withNano, zoneOffset);
    }

    public final org.threeten.bp.OffsetDateTime truncatedTo(org.threeten.bp.temporal.TemporalUnit temporalUnit) {
        org.threeten.bp.LocalDateTime truncatedTo = this.getHighSpeedVideoFpsRangesFor.truncatedTo(temporalUnit);
        org.threeten.bp.ZoneOffset zoneOffset = this.getHighResolutionOutputSizeshNQ4ISI;
        return (this.getHighSpeedVideoFpsRangesFor == truncatedTo && zoneOffset.equals(zoneOffset)) ? this : new org.threeten.bp.OffsetDateTime(truncatedTo, zoneOffset);
    }

    @Override // org.threeten.bp.jdk8.DefaultInterfaceTemporal, org.threeten.bp.temporal.Temporal
    public final org.threeten.bp.OffsetDateTime plus(org.threeten.bp.temporal.TemporalAmount temporalAmount) {
        return (org.threeten.bp.OffsetDateTime) temporalAmount.addTo(this);
    }

    @Override // org.threeten.bp.temporal.Temporal
    public final org.threeten.bp.OffsetDateTime plus(long j, org.threeten.bp.temporal.TemporalUnit temporalUnit) {
        if (temporalUnit instanceof org.threeten.bp.temporal.ChronoUnit) {
            org.threeten.bp.LocalDateTime plus = this.getHighSpeedVideoFpsRangesFor.plus(j, temporalUnit);
            org.threeten.bp.ZoneOffset zoneOffset = this.getHighResolutionOutputSizeshNQ4ISI;
            return (this.getHighSpeedVideoFpsRangesFor == plus && zoneOffset.equals(zoneOffset)) ? this : new org.threeten.bp.OffsetDateTime(plus, zoneOffset);
        }
        return (org.threeten.bp.OffsetDateTime) temporalUnit.addTo(this, j);
    }

    public final org.threeten.bp.OffsetDateTime plusYears(long j) {
        org.threeten.bp.LocalDateTime plusYears = this.getHighSpeedVideoFpsRangesFor.plusYears(j);
        org.threeten.bp.ZoneOffset zoneOffset = this.getHighResolutionOutputSizeshNQ4ISI;
        return (this.getHighSpeedVideoFpsRangesFor == plusYears && zoneOffset.equals(zoneOffset)) ? this : new org.threeten.bp.OffsetDateTime(plusYears, zoneOffset);
    }

    public final org.threeten.bp.OffsetDateTime plusMonths(long j) {
        org.threeten.bp.LocalDateTime plusMonths = this.getHighSpeedVideoFpsRangesFor.plusMonths(j);
        org.threeten.bp.ZoneOffset zoneOffset = this.getHighResolutionOutputSizeshNQ4ISI;
        return (this.getHighSpeedVideoFpsRangesFor == plusMonths && zoneOffset.equals(zoneOffset)) ? this : new org.threeten.bp.OffsetDateTime(plusMonths, zoneOffset);
    }

    public final org.threeten.bp.OffsetDateTime plusWeeks(long j) {
        org.threeten.bp.LocalDateTime plusWeeks = this.getHighSpeedVideoFpsRangesFor.plusWeeks(j);
        org.threeten.bp.ZoneOffset zoneOffset = this.getHighResolutionOutputSizeshNQ4ISI;
        return (this.getHighSpeedVideoFpsRangesFor == plusWeeks && zoneOffset.equals(zoneOffset)) ? this : new org.threeten.bp.OffsetDateTime(plusWeeks, zoneOffset);
    }

    public final org.threeten.bp.OffsetDateTime plusDays(long j) {
        org.threeten.bp.LocalDateTime plusDays = this.getHighSpeedVideoFpsRangesFor.plusDays(j);
        org.threeten.bp.ZoneOffset zoneOffset = this.getHighResolutionOutputSizeshNQ4ISI;
        return (this.getHighSpeedVideoFpsRangesFor == plusDays && zoneOffset.equals(zoneOffset)) ? this : new org.threeten.bp.OffsetDateTime(plusDays, zoneOffset);
    }

    public final org.threeten.bp.OffsetDateTime plusHours(long j) {
        org.threeten.bp.LocalDateTime plusHours = this.getHighSpeedVideoFpsRangesFor.plusHours(j);
        org.threeten.bp.ZoneOffset zoneOffset = this.getHighResolutionOutputSizeshNQ4ISI;
        return (this.getHighSpeedVideoFpsRangesFor == plusHours && zoneOffset.equals(zoneOffset)) ? this : new org.threeten.bp.OffsetDateTime(plusHours, zoneOffset);
    }

    public final org.threeten.bp.OffsetDateTime plusMinutes(long j) {
        org.threeten.bp.LocalDateTime plusMinutes = this.getHighSpeedVideoFpsRangesFor.plusMinutes(j);
        org.threeten.bp.ZoneOffset zoneOffset = this.getHighResolutionOutputSizeshNQ4ISI;
        return (this.getHighSpeedVideoFpsRangesFor == plusMinutes && zoneOffset.equals(zoneOffset)) ? this : new org.threeten.bp.OffsetDateTime(plusMinutes, zoneOffset);
    }

    public final org.threeten.bp.OffsetDateTime plusSeconds(long j) {
        org.threeten.bp.LocalDateTime plusSeconds = this.getHighSpeedVideoFpsRangesFor.plusSeconds(j);
        org.threeten.bp.ZoneOffset zoneOffset = this.getHighResolutionOutputSizeshNQ4ISI;
        return (this.getHighSpeedVideoFpsRangesFor == plusSeconds && zoneOffset.equals(zoneOffset)) ? this : new org.threeten.bp.OffsetDateTime(plusSeconds, zoneOffset);
    }

    public final org.threeten.bp.OffsetDateTime plusNanos(long j) {
        org.threeten.bp.LocalDateTime plusNanos = this.getHighSpeedVideoFpsRangesFor.plusNanos(j);
        org.threeten.bp.ZoneOffset zoneOffset = this.getHighResolutionOutputSizeshNQ4ISI;
        return (this.getHighSpeedVideoFpsRangesFor == plusNanos && zoneOffset.equals(zoneOffset)) ? this : new org.threeten.bp.OffsetDateTime(plusNanos, zoneOffset);
    }

    @Override // org.threeten.bp.jdk8.DefaultInterfaceTemporal, org.threeten.bp.temporal.Temporal
    public final org.threeten.bp.OffsetDateTime minus(org.threeten.bp.temporal.TemporalAmount temporalAmount) {
        return (org.threeten.bp.OffsetDateTime) temporalAmount.subtractFrom(this);
    }

    @Override // org.threeten.bp.jdk8.DefaultInterfaceTemporal, org.threeten.bp.temporal.Temporal
    public final org.threeten.bp.OffsetDateTime minus(long j, org.threeten.bp.temporal.TemporalUnit temporalUnit) {
        return j == Long.MIN_VALUE ? plus(Long.MAX_VALUE, temporalUnit).plus(1L, temporalUnit) : plus(-j, temporalUnit);
    }

    public final org.threeten.bp.OffsetDateTime minusYears(long j) {
        return j == Long.MIN_VALUE ? plusYears(Long.MAX_VALUE).plusYears(1L) : plusYears(-j);
    }

    public final org.threeten.bp.OffsetDateTime minusMonths(long j) {
        return j == Long.MIN_VALUE ? plusMonths(Long.MAX_VALUE).plusMonths(1L) : plusMonths(-j);
    }

    public final org.threeten.bp.OffsetDateTime minusWeeks(long j) {
        return j == Long.MIN_VALUE ? plusWeeks(Long.MAX_VALUE).plusWeeks(1L) : plusWeeks(-j);
    }

    public final org.threeten.bp.OffsetDateTime minusDays(long j) {
        return j == Long.MIN_VALUE ? plusDays(Long.MAX_VALUE).plusDays(1L) : plusDays(-j);
    }

    public final org.threeten.bp.OffsetDateTime minusHours(long j) {
        return j == Long.MIN_VALUE ? plusHours(Long.MAX_VALUE).plusHours(1L) : plusHours(-j);
    }

    public final org.threeten.bp.OffsetDateTime minusMinutes(long j) {
        return j == Long.MIN_VALUE ? plusMinutes(Long.MAX_VALUE).plusMinutes(1L) : plusMinutes(-j);
    }

    public final org.threeten.bp.OffsetDateTime minusSeconds(long j) {
        return j == Long.MIN_VALUE ? plusSeconds(Long.MAX_VALUE).plusSeconds(1L) : plusSeconds(-j);
    }

    public final org.threeten.bp.OffsetDateTime minusNanos(long j) {
        return j == Long.MIN_VALUE ? plusNanos(Long.MAX_VALUE).plusNanos(1L) : plusNanos(-j);
    }

    @Override // org.threeten.bp.jdk8.DefaultInterfaceTemporalAccessor, org.threeten.bp.temporal.TemporalAccessor
    public final <R> R query(org.threeten.bp.temporal.TemporalQuery<R> temporalQuery) {
        if (temporalQuery == org.threeten.bp.temporal.TemporalQueries.chronology()) {
            return (R) org.threeten.bp.chrono.IsoChronology.INSTANCE;
        }
        if (temporalQuery == org.threeten.bp.temporal.TemporalQueries.precision()) {
            return (R) org.threeten.bp.temporal.ChronoUnit.NANOS;
        }
        if (temporalQuery == org.threeten.bp.temporal.TemporalQueries.offset() || temporalQuery == org.threeten.bp.temporal.TemporalQueries.zone()) {
            return (R) getOffset();
        }
        if (temporalQuery == org.threeten.bp.temporal.TemporalQueries.localDate()) {
            return (R) toLocalDate();
        }
        if (temporalQuery == org.threeten.bp.temporal.TemporalQueries.localTime()) {
            return (R) toLocalTime();
        }
        if (temporalQuery == org.threeten.bp.temporal.TemporalQueries.zoneId()) {
            return null;
        }
        return (R) super.query(temporalQuery);
    }

    @Override // org.threeten.bp.temporal.TemporalAdjuster
    public final org.threeten.bp.temporal.Temporal adjustInto(org.threeten.bp.temporal.Temporal temporal) {
        return temporal.with(org.threeten.bp.temporal.ChronoField.EPOCH_DAY, toLocalDate().toEpochDay()).with(org.threeten.bp.temporal.ChronoField.NANO_OF_DAY, toLocalTime().toNanoOfDay()).with(org.threeten.bp.temporal.ChronoField.OFFSET_SECONDS, getOffset().getTotalSeconds());
    }

    @Override // org.threeten.bp.temporal.Temporal
    public final long until(org.threeten.bp.temporal.Temporal temporal, org.threeten.bp.temporal.TemporalUnit temporalUnit) {
        org.threeten.bp.OffsetDateTime from = from(temporal);
        if (temporalUnit instanceof org.threeten.bp.temporal.ChronoUnit) {
            return this.getHighSpeedVideoFpsRangesFor.until(from.withOffsetSameInstant(this.getHighResolutionOutputSizeshNQ4ISI).getHighSpeedVideoFpsRangesFor, temporalUnit);
        }
        return temporalUnit.between(this, from);
    }

    public final org.threeten.bp.ZonedDateTime atZoneSameInstant(org.threeten.bp.ZoneId zoneId) {
        return org.threeten.bp.ZonedDateTime.ofInstant(this.getHighSpeedVideoFpsRangesFor, this.getHighResolutionOutputSizeshNQ4ISI, zoneId);
    }

    public final org.threeten.bp.ZonedDateTime atZoneSimilarLocal(org.threeten.bp.ZoneId zoneId) {
        return org.threeten.bp.ZonedDateTime.ofLocal(this.getHighSpeedVideoFpsRangesFor, zoneId, this.getHighResolutionOutputSizeshNQ4ISI);
    }

    public final org.threeten.bp.LocalDateTime toLocalDateTime() {
        return this.getHighSpeedVideoFpsRangesFor;
    }

    public final org.threeten.bp.LocalDate toLocalDate() {
        return this.getHighSpeedVideoFpsRangesFor.toLocalDate();
    }

    public final org.threeten.bp.LocalTime toLocalTime() {
        return this.getHighSpeedVideoFpsRangesFor.toLocalTime();
    }

    public final org.threeten.bp.OffsetTime toOffsetTime() {
        return org.threeten.bp.OffsetTime.of(this.getHighSpeedVideoFpsRangesFor.toLocalTime(), this.getHighResolutionOutputSizeshNQ4ISI);
    }

    public final org.threeten.bp.ZonedDateTime toZonedDateTime() {
        return org.threeten.bp.ZonedDateTime.of(this.getHighSpeedVideoFpsRangesFor, this.getHighResolutionOutputSizeshNQ4ISI);
    }

    public final org.threeten.bp.Instant toInstant() {
        return this.getHighSpeedVideoFpsRangesFor.toInstant(this.getHighResolutionOutputSizeshNQ4ISI);
    }

    public final long toEpochSecond() {
        return this.getHighSpeedVideoFpsRangesFor.toEpochSecond(this.getHighResolutionOutputSizeshNQ4ISI);
    }

    @Override // java.lang.Comparable
    public final int compareTo(org.threeten.bp.OffsetDateTime offsetDateTime) {
        if (getOffset().equals(offsetDateTime.getOffset())) {
            return toLocalDateTime().compareTo((org.threeten.bp.chrono.ChronoLocalDateTime<?>) offsetDateTime.toLocalDateTime());
        }
        int compareLongs = org.threeten.bp.jdk8.Jdk8Methods.compareLongs(toEpochSecond(), offsetDateTime.toEpochSecond());
        return (compareLongs == 0 && (compareLongs = toLocalTime().getNano() - offsetDateTime.toLocalTime().getNano()) == 0) ? toLocalDateTime().compareTo((org.threeten.bp.chrono.ChronoLocalDateTime<?>) offsetDateTime.toLocalDateTime()) : compareLongs;
    }

    public final boolean isAfter(org.threeten.bp.OffsetDateTime offsetDateTime) {
        long epochSecond = toEpochSecond();
        long epochSecond2 = offsetDateTime.toEpochSecond();
        if (epochSecond <= epochSecond2) {
            return epochSecond == epochSecond2 && toLocalTime().getNano() > offsetDateTime.toLocalTime().getNano();
        }
        return true;
    }

    public final boolean isBefore(org.threeten.bp.OffsetDateTime offsetDateTime) {
        long epochSecond = toEpochSecond();
        long epochSecond2 = offsetDateTime.toEpochSecond();
        if (epochSecond >= epochSecond2) {
            return epochSecond == epochSecond2 && toLocalTime().getNano() < offsetDateTime.toLocalTime().getNano();
        }
        return true;
    }

    public final boolean isEqual(org.threeten.bp.OffsetDateTime offsetDateTime) {
        return toEpochSecond() == offsetDateTime.toEpochSecond() && toLocalTime().getNano() == offsetDateTime.toLocalTime().getNano();
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof org.threeten.bp.OffsetDateTime)) {
            return false;
        }
        org.threeten.bp.OffsetDateTime offsetDateTime = (org.threeten.bp.OffsetDateTime) obj;
        return this.getHighSpeedVideoFpsRangesFor.equals(offsetDateTime.getHighSpeedVideoFpsRangesFor) && this.getHighResolutionOutputSizeshNQ4ISI.equals(offsetDateTime.getHighResolutionOutputSizeshNQ4ISI);
    }

    public final int hashCode() {
        return this.getHighSpeedVideoFpsRangesFor.hashCode() ^ this.getHighResolutionOutputSizeshNQ4ISI.hashCode();
    }

    public final java.lang.String toString() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append(this.getHighSpeedVideoFpsRangesFor.toString());
        sb.append(this.getHighResolutionOutputSizeshNQ4ISI.toString());
        return sb.toString();
    }

    public final java.lang.String format(org.threeten.bp.format.DateTimeFormatter dateTimeFormatter) {
        org.threeten.bp.jdk8.Jdk8Methods.requireNonNull(dateTimeFormatter, "formatter");
        return dateTimeFormatter.format(this);
    }

    private java.lang.Object writeReplace() {
        return new org.threeten.bp.Ser((byte) 69, this);
    }

    private java.lang.Object readResolve() throws java.io.ObjectStreamException {
        throw new java.io.InvalidObjectException("Deserialization via serialization delegate");
    }

    static org.threeten.bp.OffsetDateTime Camera2StreamConfigurationMap(java.io.DataInput dataInput) throws java.io.IOException {
        return of(org.threeten.bp.LocalDateTime.getHighSpeedVideoFpsRangesFor(dataInput), org.threeten.bp.ZoneOffset.getHighSpeedVideoFpsRanges(dataInput));
    }
}
