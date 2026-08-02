package org.threeten.bp;

/* loaded from: classes18.dex */
public final class ZonedDateTime extends org.threeten.bp.chrono.ChronoZonedDateTime<org.threeten.bp.LocalDate> implements org.threeten.bp.temporal.Temporal, java.io.Serializable {
    public static final org.threeten.bp.temporal.TemporalQuery<org.threeten.bp.ZonedDateTime> FROM = new org.threeten.bp.temporal.TemporalQuery<org.threeten.bp.ZonedDateTime>() { // from class: org.threeten.bp.ZonedDateTime.1
        @Override // org.threeten.bp.temporal.TemporalQuery
        public /* synthetic */ org.threeten.bp.ZonedDateTime queryFrom(org.threeten.bp.temporal.TemporalAccessor temporalAccessor) {
            return org.threeten.bp.ZonedDateTime.from(temporalAccessor);
        }
    };
    private static final long serialVersionUID = -6260982410461394882L;
    final org.threeten.bp.ZoneOffset getHighResolutionOutputSizeshNQ4ISI;
    final org.threeten.bp.LocalDateTime getHighSpeedVideoFpsRangesFor;
    final org.threeten.bp.ZoneId getHighSpeedVideoSizes;

    public static org.threeten.bp.ZonedDateTime now() {
        return now(org.threeten.bp.Clock.systemDefaultZone());
    }

    public static org.threeten.bp.ZonedDateTime now(org.threeten.bp.ZoneId zoneId) {
        return now(org.threeten.bp.Clock.system(zoneId));
    }

    public static org.threeten.bp.ZonedDateTime now(org.threeten.bp.Clock clock) {
        org.threeten.bp.jdk8.Jdk8Methods.requireNonNull(clock, "clock");
        return ofInstant(clock.instant(), clock.getZone());
    }

    public static org.threeten.bp.ZonedDateTime of(org.threeten.bp.LocalDate localDate, org.threeten.bp.LocalTime localTime, org.threeten.bp.ZoneId zoneId) {
        return of(org.threeten.bp.LocalDateTime.of(localDate, localTime), zoneId);
    }

    public static org.threeten.bp.ZonedDateTime of(org.threeten.bp.LocalDateTime localDateTime, org.threeten.bp.ZoneId zoneId) {
        return ofLocal(localDateTime, zoneId, null);
    }

    public static org.threeten.bp.ZonedDateTime of(int i, int i2, int i3, int i4, int i5, int i6, int i7, org.threeten.bp.ZoneId zoneId) {
        return ofLocal(org.threeten.bp.LocalDateTime.of(i, i2, i3, i4, i5, i6, i7), zoneId, null);
    }

    public static org.threeten.bp.ZonedDateTime ofLocal(org.threeten.bp.LocalDateTime localDateTime, org.threeten.bp.ZoneId zoneId, org.threeten.bp.ZoneOffset zoneOffset) {
        org.threeten.bp.jdk8.Jdk8Methods.requireNonNull(localDateTime, "localDateTime");
        org.threeten.bp.jdk8.Jdk8Methods.requireNonNull(zoneId, "zone");
        if (zoneId instanceof org.threeten.bp.ZoneOffset) {
            return new org.threeten.bp.ZonedDateTime(localDateTime, (org.threeten.bp.ZoneOffset) zoneId, zoneId);
        }
        org.threeten.bp.zone.ZoneRules rules = zoneId.getRules();
        java.util.List<org.threeten.bp.ZoneOffset> validOffsets = rules.getValidOffsets(localDateTime);
        if (validOffsets.size() == 1) {
            zoneOffset = validOffsets.get(0);
        } else if (validOffsets.size() == 0) {
            org.threeten.bp.zone.ZoneOffsetTransition transition = rules.getTransition(localDateTime);
            localDateTime = localDateTime.plusSeconds(transition.getDuration().getSeconds());
            zoneOffset = transition.getOffsetAfter();
        } else if (zoneOffset == null || !validOffsets.contains(zoneOffset)) {
            zoneOffset = (org.threeten.bp.ZoneOffset) org.threeten.bp.jdk8.Jdk8Methods.requireNonNull(validOffsets.get(0), "offset");
        }
        return new org.threeten.bp.ZonedDateTime(localDateTime, zoneOffset, zoneId);
    }

    public static org.threeten.bp.ZonedDateTime ofInstant(org.threeten.bp.Instant instant, org.threeten.bp.ZoneId zoneId) {
        org.threeten.bp.jdk8.Jdk8Methods.requireNonNull(instant, "instant");
        org.threeten.bp.jdk8.Jdk8Methods.requireNonNull(zoneId, "zone");
        return getHighSpeedVideoFpsRanges(instant.getEpochSecond(), instant.getNano(), zoneId);
    }

    public static org.threeten.bp.ZonedDateTime ofInstant(org.threeten.bp.LocalDateTime localDateTime, org.threeten.bp.ZoneOffset zoneOffset, org.threeten.bp.ZoneId zoneId) {
        org.threeten.bp.jdk8.Jdk8Methods.requireNonNull(localDateTime, "localDateTime");
        org.threeten.bp.jdk8.Jdk8Methods.requireNonNull(zoneOffset, "offset");
        org.threeten.bp.jdk8.Jdk8Methods.requireNonNull(zoneId, "zone");
        return getHighSpeedVideoFpsRanges(localDateTime.toEpochSecond(zoneOffset), localDateTime.getNano(), zoneId);
    }

    private static org.threeten.bp.ZonedDateTime getHighSpeedVideoFpsRanges(long j, int i, org.threeten.bp.ZoneId zoneId) {
        org.threeten.bp.ZoneOffset offset = zoneId.getRules().getOffset(org.threeten.bp.Instant.ofEpochSecond(j, i));
        return new org.threeten.bp.ZonedDateTime(org.threeten.bp.LocalDateTime.ofEpochSecond(j, i, offset), offset, zoneId);
    }

    public static org.threeten.bp.ZonedDateTime ofStrict(org.threeten.bp.LocalDateTime localDateTime, org.threeten.bp.ZoneOffset zoneOffset, org.threeten.bp.ZoneId zoneId) {
        org.threeten.bp.jdk8.Jdk8Methods.requireNonNull(localDateTime, "localDateTime");
        org.threeten.bp.jdk8.Jdk8Methods.requireNonNull(zoneOffset, "offset");
        org.threeten.bp.jdk8.Jdk8Methods.requireNonNull(zoneId, "zone");
        org.threeten.bp.zone.ZoneRules rules = zoneId.getRules();
        if (!rules.isValidOffset(localDateTime, zoneOffset)) {
            org.threeten.bp.zone.ZoneOffsetTransition transition = rules.getTransition(localDateTime);
            if (transition != null && transition.isGap()) {
                java.lang.StringBuilder sb = new java.lang.StringBuilder("LocalDateTime '");
                sb.append(localDateTime);
                sb.append("' does not exist in zone '");
                sb.append(zoneId);
                sb.append("' due to a gap in the local time-line, typically caused by daylight savings");
                throw new org.threeten.bp.DateTimeException(sb.toString());
            }
            java.lang.StringBuilder sb2 = new java.lang.StringBuilder("ZoneOffset '");
            sb2.append(zoneOffset);
            sb2.append("' is not valid for LocalDateTime '");
            sb2.append(localDateTime);
            sb2.append("' in zone '");
            sb2.append(zoneId);
            sb2.append("'");
            throw new org.threeten.bp.DateTimeException(sb2.toString());
        }
        return new org.threeten.bp.ZonedDateTime(localDateTime, zoneOffset, zoneId);
    }

    public static org.threeten.bp.ZonedDateTime from(org.threeten.bp.temporal.TemporalAccessor temporalAccessor) {
        if (temporalAccessor instanceof org.threeten.bp.ZonedDateTime) {
            return (org.threeten.bp.ZonedDateTime) temporalAccessor;
        }
        try {
            org.threeten.bp.ZoneId from = org.threeten.bp.ZoneId.from(temporalAccessor);
            if (temporalAccessor.isSupported(org.threeten.bp.temporal.ChronoField.INSTANT_SECONDS)) {
                try {
                    return getHighSpeedVideoFpsRanges(temporalAccessor.getLong(org.threeten.bp.temporal.ChronoField.INSTANT_SECONDS), temporalAccessor.get(org.threeten.bp.temporal.ChronoField.NANO_OF_SECOND), from);
                } catch (org.threeten.bp.DateTimeException unused) {
                }
            }
            return of(org.threeten.bp.LocalDateTime.from(temporalAccessor), from);
        } catch (org.threeten.bp.DateTimeException unused2) {
            java.lang.StringBuilder sb = new java.lang.StringBuilder("Unable to obtain ZonedDateTime from TemporalAccessor: ");
            sb.append(temporalAccessor);
            sb.append(", type ");
            sb.append(temporalAccessor.getClass().getName());
            throw new org.threeten.bp.DateTimeException(sb.toString());
        }
    }

    public static org.threeten.bp.ZonedDateTime parse(java.lang.CharSequence charSequence) {
        return parse(charSequence, org.threeten.bp.format.DateTimeFormatter.ISO_ZONED_DATE_TIME);
    }

    public static org.threeten.bp.ZonedDateTime parse(java.lang.CharSequence charSequence, org.threeten.bp.format.DateTimeFormatter dateTimeFormatter) {
        org.threeten.bp.jdk8.Jdk8Methods.requireNonNull(dateTimeFormatter, "formatter");
        return (org.threeten.bp.ZonedDateTime) dateTimeFormatter.parse(charSequence, FROM);
    }

    private ZonedDateTime(org.threeten.bp.LocalDateTime localDateTime, org.threeten.bp.ZoneOffset zoneOffset, org.threeten.bp.ZoneId zoneId) {
        this.getHighSpeedVideoFpsRangesFor = localDateTime;
        this.getHighResolutionOutputSizeshNQ4ISI = zoneOffset;
        this.getHighSpeedVideoSizes = zoneId;
    }

    private org.threeten.bp.ZonedDateTime getHighSpeedVideoFpsRanges(org.threeten.bp.ZoneOffset zoneOffset) {
        return (zoneOffset.equals(this.getHighResolutionOutputSizeshNQ4ISI) || !this.getHighSpeedVideoSizes.getRules().isValidOffset(this.getHighSpeedVideoFpsRangesFor, zoneOffset)) ? this : new org.threeten.bp.ZonedDateTime(this.getHighSpeedVideoFpsRangesFor, zoneOffset, this.getHighSpeedVideoSizes);
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

    @Override // org.threeten.bp.chrono.ChronoZonedDateTime, org.threeten.bp.jdk8.DefaultInterfaceTemporalAccessor, org.threeten.bp.temporal.TemporalAccessor
    public final org.threeten.bp.temporal.ValueRange range(org.threeten.bp.temporal.TemporalField temporalField) {
        if (temporalField instanceof org.threeten.bp.temporal.ChronoField) {
            if (temporalField == org.threeten.bp.temporal.ChronoField.INSTANT_SECONDS || temporalField == org.threeten.bp.temporal.ChronoField.OFFSET_SECONDS) {
                return temporalField.range();
            }
            return this.getHighSpeedVideoFpsRangesFor.range(temporalField);
        }
        return temporalField.rangeRefinedBy(this);
    }

    /* renamed from: org.threeten.bp.ZonedDateTime$2, reason: invalid class name */
    static /* synthetic */ class AnonymousClass2 {
        static final /* synthetic */ int[] getHighSpeedVideoFpsRangesFor;

        static {
            int[] iArr = new int[org.threeten.bp.temporal.ChronoField.values().length];
            getHighSpeedVideoFpsRangesFor = iArr;
            try {
                iArr[org.threeten.bp.temporal.ChronoField.INSTANT_SECONDS.ordinal()] = 1;
            } catch (java.lang.NoSuchFieldError unused) {
            }
            try {
                getHighSpeedVideoFpsRangesFor[org.threeten.bp.temporal.ChronoField.OFFSET_SECONDS.ordinal()] = 2;
            } catch (java.lang.NoSuchFieldError unused2) {
            }
        }
    }

    @Override // org.threeten.bp.chrono.ChronoZonedDateTime, org.threeten.bp.jdk8.DefaultInterfaceTemporalAccessor, org.threeten.bp.temporal.TemporalAccessor
    public final int get(org.threeten.bp.temporal.TemporalField temporalField) {
        if (temporalField instanceof org.threeten.bp.temporal.ChronoField) {
            int i = org.threeten.bp.ZonedDateTime.AnonymousClass2.getHighSpeedVideoFpsRangesFor[((org.threeten.bp.temporal.ChronoField) temporalField).ordinal()];
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

    @Override // org.threeten.bp.chrono.ChronoZonedDateTime, org.threeten.bp.temporal.TemporalAccessor
    public final long getLong(org.threeten.bp.temporal.TemporalField temporalField) {
        if (temporalField instanceof org.threeten.bp.temporal.ChronoField) {
            int i = org.threeten.bp.ZonedDateTime.AnonymousClass2.getHighSpeedVideoFpsRangesFor[((org.threeten.bp.temporal.ChronoField) temporalField).ordinal()];
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

    @Override // org.threeten.bp.chrono.ChronoZonedDateTime
    public final org.threeten.bp.ZoneOffset getOffset() {
        return this.getHighResolutionOutputSizeshNQ4ISI;
    }

    @Override // org.threeten.bp.chrono.ChronoZonedDateTime
    /* renamed from: withEarlierOffsetAtOverlap, reason: merged with bridge method [inline-methods] */
    public final org.threeten.bp.chrono.ChronoZonedDateTime<org.threeten.bp.LocalDate> withEarlierOffsetAtOverlap2() {
        org.threeten.bp.zone.ZoneOffsetTransition transition = getZone().getRules().getTransition(this.getHighSpeedVideoFpsRangesFor);
        if (transition != null && transition.isOverlap()) {
            org.threeten.bp.ZoneOffset offsetBefore = transition.getOffsetBefore();
            if (!offsetBefore.equals(this.getHighResolutionOutputSizeshNQ4ISI)) {
                return new org.threeten.bp.ZonedDateTime(this.getHighSpeedVideoFpsRangesFor, offsetBefore, this.getHighSpeedVideoSizes);
            }
        }
        return this;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v0, types: [org.threeten.bp.LocalDateTime] */
    @Override // org.threeten.bp.chrono.ChronoZonedDateTime
    /* renamed from: withLaterOffsetAtOverlap, reason: merged with bridge method [inline-methods] */
    public final org.threeten.bp.chrono.ChronoZonedDateTime<org.threeten.bp.LocalDate> withLaterOffsetAtOverlap2() {
        org.threeten.bp.zone.ZoneOffsetTransition transition = getZone().getRules().getTransition(toLocalDateTime2());
        if (transition != null) {
            org.threeten.bp.ZoneOffset offsetAfter = transition.getOffsetAfter();
            if (!offsetAfter.equals(this.getHighResolutionOutputSizeshNQ4ISI)) {
                return new org.threeten.bp.ZonedDateTime(this.getHighSpeedVideoFpsRangesFor, offsetAfter, this.getHighSpeedVideoSizes);
            }
        }
        return this;
    }

    @Override // org.threeten.bp.chrono.ChronoZonedDateTime
    public final org.threeten.bp.ZoneId getZone() {
        return this.getHighSpeedVideoSizes;
    }

    @Override // org.threeten.bp.chrono.ChronoZonedDateTime
    /* renamed from: withZoneSameLocal, reason: merged with bridge method [inline-methods] */
    public final org.threeten.bp.chrono.ChronoZonedDateTime<org.threeten.bp.LocalDate> withZoneSameLocal2(org.threeten.bp.ZoneId zoneId) {
        org.threeten.bp.jdk8.Jdk8Methods.requireNonNull(zoneId, "zone");
        return this.getHighSpeedVideoSizes.equals(zoneId) ? this : ofLocal(this.getHighSpeedVideoFpsRangesFor, zoneId, this.getHighResolutionOutputSizeshNQ4ISI);
    }

    @Override // org.threeten.bp.chrono.ChronoZonedDateTime
    /* renamed from: withZoneSameInstant, reason: merged with bridge method [inline-methods] */
    public final org.threeten.bp.chrono.ChronoZonedDateTime<org.threeten.bp.LocalDate> withZoneSameInstant2(org.threeten.bp.ZoneId zoneId) {
        org.threeten.bp.jdk8.Jdk8Methods.requireNonNull(zoneId, "zone");
        return this.getHighSpeedVideoSizes.equals(zoneId) ? this : getHighSpeedVideoFpsRanges(this.getHighSpeedVideoFpsRangesFor.toEpochSecond(this.getHighResolutionOutputSizeshNQ4ISI), this.getHighSpeedVideoFpsRangesFor.getNano(), zoneId);
    }

    public final org.threeten.bp.ZonedDateTime withFixedOffsetZone() {
        if (this.getHighSpeedVideoSizes.equals(this.getHighResolutionOutputSizeshNQ4ISI)) {
            return this;
        }
        org.threeten.bp.LocalDateTime localDateTime = this.getHighSpeedVideoFpsRangesFor;
        org.threeten.bp.ZoneOffset zoneOffset = this.getHighResolutionOutputSizeshNQ4ISI;
        return new org.threeten.bp.ZonedDateTime(localDateTime, zoneOffset, zoneOffset);
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

    @Override // org.threeten.bp.chrono.ChronoZonedDateTime, org.threeten.bp.jdk8.DefaultInterfaceTemporal, org.threeten.bp.temporal.Temporal
    public final org.threeten.bp.ZonedDateTime with(org.threeten.bp.temporal.TemporalAdjuster temporalAdjuster) {
        if (!(temporalAdjuster instanceof org.threeten.bp.LocalDate)) {
            if (!(temporalAdjuster instanceof org.threeten.bp.LocalTime)) {
                if (!(temporalAdjuster instanceof org.threeten.bp.LocalDateTime)) {
                    if (temporalAdjuster instanceof org.threeten.bp.Instant) {
                        org.threeten.bp.Instant instant = (org.threeten.bp.Instant) temporalAdjuster;
                        return getHighSpeedVideoFpsRanges(instant.getEpochSecond(), instant.getNano(), this.getHighSpeedVideoSizes);
                    }
                    if (temporalAdjuster instanceof org.threeten.bp.ZoneOffset) {
                        return getHighSpeedVideoFpsRanges((org.threeten.bp.ZoneOffset) temporalAdjuster);
                    }
                    return (org.threeten.bp.ZonedDateTime) temporalAdjuster.adjustInto(this);
                }
                return ofLocal((org.threeten.bp.LocalDateTime) temporalAdjuster, this.getHighSpeedVideoSizes, this.getHighResolutionOutputSizeshNQ4ISI);
            }
            return ofLocal(org.threeten.bp.LocalDateTime.of(this.getHighSpeedVideoFpsRangesFor.toLocalDate(), (org.threeten.bp.LocalTime) temporalAdjuster), this.getHighSpeedVideoSizes, this.getHighResolutionOutputSizeshNQ4ISI);
        }
        return ofLocal(org.threeten.bp.LocalDateTime.of((org.threeten.bp.LocalDate) temporalAdjuster, this.getHighSpeedVideoFpsRangesFor.toLocalTime()), this.getHighSpeedVideoSizes, this.getHighResolutionOutputSizeshNQ4ISI);
    }

    @Override // org.threeten.bp.chrono.ChronoZonedDateTime, org.threeten.bp.temporal.Temporal
    public final org.threeten.bp.ZonedDateTime with(org.threeten.bp.temporal.TemporalField temporalField, long j) {
        if (temporalField instanceof org.threeten.bp.temporal.ChronoField) {
            org.threeten.bp.temporal.ChronoField chronoField = (org.threeten.bp.temporal.ChronoField) temporalField;
            int i = org.threeten.bp.ZonedDateTime.AnonymousClass2.getHighSpeedVideoFpsRangesFor[chronoField.ordinal()];
            if (i == 1) {
                return getHighSpeedVideoFpsRanges(j, getNano(), this.getHighSpeedVideoSizes);
            }
            if (i == 2) {
                return getHighSpeedVideoFpsRanges(org.threeten.bp.ZoneOffset.ofTotalSeconds(chronoField.checkValidIntValue(j)));
            }
            return ofLocal(this.getHighSpeedVideoFpsRangesFor.with(temporalField, j), this.getHighSpeedVideoSizes, this.getHighResolutionOutputSizeshNQ4ISI);
        }
        return (org.threeten.bp.ZonedDateTime) temporalField.adjustInto(this, j);
    }

    public final org.threeten.bp.ZonedDateTime withYear(int i) {
        return ofLocal(this.getHighSpeedVideoFpsRangesFor.withYear(i), this.getHighSpeedVideoSizes, this.getHighResolutionOutputSizeshNQ4ISI);
    }

    public final org.threeten.bp.ZonedDateTime withMonth(int i) {
        return ofLocal(this.getHighSpeedVideoFpsRangesFor.withMonth(i), this.getHighSpeedVideoSizes, this.getHighResolutionOutputSizeshNQ4ISI);
    }

    public final org.threeten.bp.ZonedDateTime withDayOfMonth(int i) {
        return ofLocal(this.getHighSpeedVideoFpsRangesFor.withDayOfMonth(i), this.getHighSpeedVideoSizes, this.getHighResolutionOutputSizeshNQ4ISI);
    }

    public final org.threeten.bp.ZonedDateTime withDayOfYear(int i) {
        return ofLocal(this.getHighSpeedVideoFpsRangesFor.withDayOfYear(i), this.getHighSpeedVideoSizes, this.getHighResolutionOutputSizeshNQ4ISI);
    }

    public final org.threeten.bp.ZonedDateTime withHour(int i) {
        return ofLocal(this.getHighSpeedVideoFpsRangesFor.withHour(i), this.getHighSpeedVideoSizes, this.getHighResolutionOutputSizeshNQ4ISI);
    }

    public final org.threeten.bp.ZonedDateTime withMinute(int i) {
        return ofLocal(this.getHighSpeedVideoFpsRangesFor.withMinute(i), this.getHighSpeedVideoSizes, this.getHighResolutionOutputSizeshNQ4ISI);
    }

    public final org.threeten.bp.ZonedDateTime withSecond(int i) {
        return ofLocal(this.getHighSpeedVideoFpsRangesFor.withSecond(i), this.getHighSpeedVideoSizes, this.getHighResolutionOutputSizeshNQ4ISI);
    }

    public final org.threeten.bp.ZonedDateTime withNano(int i) {
        return ofLocal(this.getHighSpeedVideoFpsRangesFor.withNano(i), this.getHighSpeedVideoSizes, this.getHighResolutionOutputSizeshNQ4ISI);
    }

    public final org.threeten.bp.ZonedDateTime truncatedTo(org.threeten.bp.temporal.TemporalUnit temporalUnit) {
        return ofLocal(this.getHighSpeedVideoFpsRangesFor.truncatedTo(temporalUnit), this.getHighSpeedVideoSizes, this.getHighResolutionOutputSizeshNQ4ISI);
    }

    @Override // org.threeten.bp.chrono.ChronoZonedDateTime, org.threeten.bp.jdk8.DefaultInterfaceTemporal, org.threeten.bp.temporal.Temporal
    public final org.threeten.bp.ZonedDateTime plus(org.threeten.bp.temporal.TemporalAmount temporalAmount) {
        return (org.threeten.bp.ZonedDateTime) temporalAmount.addTo(this);
    }

    @Override // org.threeten.bp.chrono.ChronoZonedDateTime, org.threeten.bp.temporal.Temporal
    public final org.threeten.bp.ZonedDateTime plus(long j, org.threeten.bp.temporal.TemporalUnit temporalUnit) {
        if (temporalUnit instanceof org.threeten.bp.temporal.ChronoUnit) {
            if (temporalUnit.isDateBased()) {
                return ofLocal(this.getHighSpeedVideoFpsRangesFor.plus(j, temporalUnit), this.getHighSpeedVideoSizes, this.getHighResolutionOutputSizeshNQ4ISI);
            }
            return ofInstant(this.getHighSpeedVideoFpsRangesFor.plus(j, temporalUnit), this.getHighResolutionOutputSizeshNQ4ISI, this.getHighSpeedVideoSizes);
        }
        return (org.threeten.bp.ZonedDateTime) temporalUnit.addTo(this, j);
    }

    public final org.threeten.bp.ZonedDateTime plusYears(long j) {
        return ofLocal(this.getHighSpeedVideoFpsRangesFor.plusYears(j), this.getHighSpeedVideoSizes, this.getHighResolutionOutputSizeshNQ4ISI);
    }

    public final org.threeten.bp.ZonedDateTime plusMonths(long j) {
        return ofLocal(this.getHighSpeedVideoFpsRangesFor.plusMonths(j), this.getHighSpeedVideoSizes, this.getHighResolutionOutputSizeshNQ4ISI);
    }

    public final org.threeten.bp.ZonedDateTime plusWeeks(long j) {
        return ofLocal(this.getHighSpeedVideoFpsRangesFor.plusWeeks(j), this.getHighSpeedVideoSizes, this.getHighResolutionOutputSizeshNQ4ISI);
    }

    public final org.threeten.bp.ZonedDateTime plusDays(long j) {
        return ofLocal(this.getHighSpeedVideoFpsRangesFor.plusDays(j), this.getHighSpeedVideoSizes, this.getHighResolutionOutputSizeshNQ4ISI);
    }

    public final org.threeten.bp.ZonedDateTime plusHours(long j) {
        return ofInstant(this.getHighSpeedVideoFpsRangesFor.plusHours(j), this.getHighResolutionOutputSizeshNQ4ISI, this.getHighSpeedVideoSizes);
    }

    public final org.threeten.bp.ZonedDateTime plusMinutes(long j) {
        return ofInstant(this.getHighSpeedVideoFpsRangesFor.plusMinutes(j), this.getHighResolutionOutputSizeshNQ4ISI, this.getHighSpeedVideoSizes);
    }

    public final org.threeten.bp.ZonedDateTime plusSeconds(long j) {
        return ofInstant(this.getHighSpeedVideoFpsRangesFor.plusSeconds(j), this.getHighResolutionOutputSizeshNQ4ISI, this.getHighSpeedVideoSizes);
    }

    public final org.threeten.bp.ZonedDateTime plusNanos(long j) {
        return ofInstant(this.getHighSpeedVideoFpsRangesFor.plusNanos(j), this.getHighResolutionOutputSizeshNQ4ISI, this.getHighSpeedVideoSizes);
    }

    @Override // org.threeten.bp.chrono.ChronoZonedDateTime, org.threeten.bp.jdk8.DefaultInterfaceTemporal, org.threeten.bp.temporal.Temporal
    public final org.threeten.bp.ZonedDateTime minus(org.threeten.bp.temporal.TemporalAmount temporalAmount) {
        return (org.threeten.bp.ZonedDateTime) temporalAmount.subtractFrom(this);
    }

    @Override // org.threeten.bp.chrono.ChronoZonedDateTime, org.threeten.bp.jdk8.DefaultInterfaceTemporal, org.threeten.bp.temporal.Temporal
    public final org.threeten.bp.ZonedDateTime minus(long j, org.threeten.bp.temporal.TemporalUnit temporalUnit) {
        return j == Long.MIN_VALUE ? plus(Long.MAX_VALUE, temporalUnit).plus(1L, temporalUnit) : plus(-j, temporalUnit);
    }

    public final org.threeten.bp.ZonedDateTime minusYears(long j) {
        return j == Long.MIN_VALUE ? plusYears(Long.MAX_VALUE).plusYears(1L) : plusYears(-j);
    }

    public final org.threeten.bp.ZonedDateTime minusMonths(long j) {
        return j == Long.MIN_VALUE ? plusMonths(Long.MAX_VALUE).plusMonths(1L) : plusMonths(-j);
    }

    public final org.threeten.bp.ZonedDateTime minusWeeks(long j) {
        return j == Long.MIN_VALUE ? plusWeeks(Long.MAX_VALUE).plusWeeks(1L) : plusWeeks(-j);
    }

    public final org.threeten.bp.ZonedDateTime minusDays(long j) {
        return j == Long.MIN_VALUE ? plusDays(Long.MAX_VALUE).plusDays(1L) : plusDays(-j);
    }

    public final org.threeten.bp.ZonedDateTime minusHours(long j) {
        return j == Long.MIN_VALUE ? plusHours(Long.MAX_VALUE).plusHours(1L) : plusHours(-j);
    }

    public final org.threeten.bp.ZonedDateTime minusMinutes(long j) {
        return j == Long.MIN_VALUE ? plusMinutes(Long.MAX_VALUE).plusMinutes(1L) : plusMinutes(-j);
    }

    public final org.threeten.bp.ZonedDateTime minusSeconds(long j) {
        return j == Long.MIN_VALUE ? plusSeconds(Long.MAX_VALUE).plusSeconds(1L) : plusSeconds(-j);
    }

    public final org.threeten.bp.ZonedDateTime minusNanos(long j) {
        return j == Long.MIN_VALUE ? plusNanos(Long.MAX_VALUE).plusNanos(1L) : plusNanos(-j);
    }

    @Override // org.threeten.bp.chrono.ChronoZonedDateTime, org.threeten.bp.jdk8.DefaultInterfaceTemporalAccessor, org.threeten.bp.temporal.TemporalAccessor
    public final <R> R query(org.threeten.bp.temporal.TemporalQuery<R> temporalQuery) {
        if (temporalQuery == org.threeten.bp.temporal.TemporalQueries.localDate()) {
            return (R) toLocalDate();
        }
        return (R) super.query(temporalQuery);
    }

    /* JADX WARN: Type inference failed for: r2v3, types: [org.threeten.bp.ZonedDateTime] */
    @Override // org.threeten.bp.temporal.Temporal
    public final long until(org.threeten.bp.temporal.Temporal temporal, org.threeten.bp.temporal.TemporalUnit temporalUnit) {
        org.threeten.bp.ZonedDateTime from = from((org.threeten.bp.temporal.TemporalAccessor) temporal);
        if (temporalUnit instanceof org.threeten.bp.temporal.ChronoUnit) {
            ?? withZoneSameInstant2 = from.withZoneSameInstant2(this.getHighSpeedVideoSizes);
            if (temporalUnit.isDateBased()) {
                return this.getHighSpeedVideoFpsRangesFor.until(withZoneSameInstant2.getHighSpeedVideoFpsRangesFor, temporalUnit);
            }
            return toOffsetDateTime().until(withZoneSameInstant2.toOffsetDateTime(), temporalUnit);
        }
        return temporalUnit.between(this, from);
    }

    @Override // org.threeten.bp.chrono.ChronoZonedDateTime
    /* renamed from: toLocalDateTime, reason: merged with bridge method [inline-methods] */
    public final org.threeten.bp.chrono.ChronoLocalDateTime<org.threeten.bp.LocalDate> toLocalDateTime2() {
        return this.getHighSpeedVideoFpsRangesFor;
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // org.threeten.bp.chrono.ChronoZonedDateTime
    public final org.threeten.bp.LocalDate toLocalDate() {
        return this.getHighSpeedVideoFpsRangesFor.toLocalDate();
    }

    @Override // org.threeten.bp.chrono.ChronoZonedDateTime
    public final org.threeten.bp.LocalTime toLocalTime() {
        return this.getHighSpeedVideoFpsRangesFor.toLocalTime();
    }

    public final org.threeten.bp.OffsetDateTime toOffsetDateTime() {
        return org.threeten.bp.OffsetDateTime.of(this.getHighSpeedVideoFpsRangesFor, this.getHighResolutionOutputSizeshNQ4ISI);
    }

    @Override // org.threeten.bp.chrono.ChronoZonedDateTime
    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof org.threeten.bp.ZonedDateTime)) {
            return false;
        }
        org.threeten.bp.ZonedDateTime zonedDateTime = (org.threeten.bp.ZonedDateTime) obj;
        return this.getHighSpeedVideoFpsRangesFor.equals(zonedDateTime.getHighSpeedVideoFpsRangesFor) && this.getHighResolutionOutputSizeshNQ4ISI.equals(zonedDateTime.getHighResolutionOutputSizeshNQ4ISI) && this.getHighSpeedVideoSizes.equals(zonedDateTime.getHighSpeedVideoSizes);
    }

    @Override // org.threeten.bp.chrono.ChronoZonedDateTime
    public final int hashCode() {
        return (this.getHighSpeedVideoFpsRangesFor.hashCode() ^ this.getHighResolutionOutputSizeshNQ4ISI.hashCode()) ^ java.lang.Integer.rotateLeft(this.getHighSpeedVideoSizes.hashCode(), 3);
    }

    @Override // org.threeten.bp.chrono.ChronoZonedDateTime
    public final java.lang.String toString() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append(this.getHighSpeedVideoFpsRangesFor.toString());
        sb.append(this.getHighResolutionOutputSizeshNQ4ISI.toString());
        java.lang.String obj = sb.toString();
        if (this.getHighResolutionOutputSizeshNQ4ISI == this.getHighSpeedVideoSizes) {
            return obj;
        }
        java.lang.StringBuilder sb2 = new java.lang.StringBuilder();
        sb2.append(obj);
        sb2.append(kotlinx.serialization.json.internal.AbstractJsonLexerKt.BEGIN_LIST);
        sb2.append(this.getHighSpeedVideoSizes.toString());
        sb2.append(kotlinx.serialization.json.internal.AbstractJsonLexerKt.END_LIST);
        return sb2.toString();
    }

    @Override // org.threeten.bp.chrono.ChronoZonedDateTime
    public final java.lang.String format(org.threeten.bp.format.DateTimeFormatter dateTimeFormatter) {
        return super.format(dateTimeFormatter);
    }

    private java.lang.Object writeReplace() {
        return new org.threeten.bp.Ser((byte) 6, this);
    }

    private java.lang.Object readResolve() throws java.io.ObjectStreamException {
        throw new java.io.InvalidObjectException("Deserialization via serialization delegate");
    }

    static org.threeten.bp.ZonedDateTime getHighSpeedVideoFpsRanges(java.io.DataInput dataInput) throws java.io.IOException {
        org.threeten.bp.LocalDateTime highSpeedVideoFpsRangesFor = org.threeten.bp.LocalDateTime.getHighSpeedVideoFpsRangesFor(dataInput);
        org.threeten.bp.ZoneOffset highSpeedVideoFpsRanges = org.threeten.bp.ZoneOffset.getHighSpeedVideoFpsRanges(dataInput);
        org.threeten.bp.ZoneId zoneId = (org.threeten.bp.ZoneId) org.threeten.bp.Ser.Camera2StreamConfigurationMap(dataInput);
        org.threeten.bp.jdk8.Jdk8Methods.requireNonNull(highSpeedVideoFpsRangesFor, "localDateTime");
        org.threeten.bp.jdk8.Jdk8Methods.requireNonNull(highSpeedVideoFpsRanges, "offset");
        org.threeten.bp.jdk8.Jdk8Methods.requireNonNull(zoneId, "zone");
        if ((zoneId instanceof org.threeten.bp.ZoneOffset) && !highSpeedVideoFpsRanges.equals(zoneId)) {
            throw new java.lang.IllegalArgumentException("ZoneId must match ZoneOffset");
        }
        return new org.threeten.bp.ZonedDateTime(highSpeedVideoFpsRangesFor, highSpeedVideoFpsRanges, zoneId);
    }
}
