package org.threeten.bp.chrono;

/* loaded from: classes18.dex */
final class ChronoLocalDateTimeImpl<D extends org.threeten.bp.chrono.ChronoLocalDate> extends org.threeten.bp.chrono.ChronoLocalDateTime<D> implements org.threeten.bp.temporal.Temporal, org.threeten.bp.temporal.TemporalAdjuster, java.io.Serializable {
    private static final long serialVersionUID = 4556003607393004514L;
    final org.threeten.bp.LocalTime getHighResolutionOutputSizeshNQ4ISI;
    final D getHighSpeedVideoSizes;

    static <R extends org.threeten.bp.chrono.ChronoLocalDate> org.threeten.bp.chrono.ChronoLocalDateTimeImpl<R> getHighSpeedVideoFpsRangesFor(R r, org.threeten.bp.LocalTime localTime) {
        return new org.threeten.bp.chrono.ChronoLocalDateTimeImpl<>(r, localTime);
    }

    private ChronoLocalDateTimeImpl(D d, org.threeten.bp.LocalTime localTime) {
        org.threeten.bp.jdk8.Jdk8Methods.requireNonNull(d, "date");
        org.threeten.bp.jdk8.Jdk8Methods.requireNonNull(localTime, "time");
        this.getHighSpeedVideoSizes = d;
        this.getHighResolutionOutputSizeshNQ4ISI = localTime;
    }

    private org.threeten.bp.chrono.ChronoLocalDateTimeImpl<D> getHighSpeedVideoSizes(org.threeten.bp.temporal.Temporal temporal, org.threeten.bp.LocalTime localTime) {
        D d = this.getHighSpeedVideoSizes;
        return (d == temporal && this.getHighResolutionOutputSizeshNQ4ISI == localTime) ? this : new org.threeten.bp.chrono.ChronoLocalDateTimeImpl<>(d.getChronology().getHighSpeedVideoFpsRangesFor(temporal), localTime);
    }

    @Override // org.threeten.bp.chrono.ChronoLocalDateTime
    public final D toLocalDate() {
        return this.getHighSpeedVideoSizes;
    }

    @Override // org.threeten.bp.chrono.ChronoLocalDateTime
    public final org.threeten.bp.LocalTime toLocalTime() {
        return this.getHighResolutionOutputSizeshNQ4ISI;
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
            return (temporalField.isTimeBased() ? this.getHighResolutionOutputSizeshNQ4ISI : this.getHighSpeedVideoSizes).range(temporalField);
        }
        return temporalField.rangeRefinedBy(this);
    }

    @Override // org.threeten.bp.jdk8.DefaultInterfaceTemporalAccessor, org.threeten.bp.temporal.TemporalAccessor
    public final int get(org.threeten.bp.temporal.TemporalField temporalField) {
        if (temporalField instanceof org.threeten.bp.temporal.ChronoField) {
            return temporalField.isTimeBased() ? this.getHighResolutionOutputSizeshNQ4ISI.get(temporalField) : this.getHighSpeedVideoSizes.get(temporalField);
        }
        return range(temporalField).checkValidIntValue(getLong(temporalField), temporalField);
    }

    @Override // org.threeten.bp.temporal.TemporalAccessor
    public final long getLong(org.threeten.bp.temporal.TemporalField temporalField) {
        if (temporalField instanceof org.threeten.bp.temporal.ChronoField) {
            return temporalField.isTimeBased() ? this.getHighResolutionOutputSizeshNQ4ISI.getLong(temporalField) : this.getHighSpeedVideoSizes.getLong(temporalField);
        }
        return temporalField.getFrom(this);
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Override // org.threeten.bp.chrono.ChronoLocalDateTime, org.threeten.bp.jdk8.DefaultInterfaceTemporal, org.threeten.bp.temporal.Temporal
    /* renamed from: getHighSpeedVideoSizes, reason: merged with bridge method [inline-methods] */
    public org.threeten.bp.chrono.ChronoLocalDateTimeImpl<D> with(org.threeten.bp.temporal.TemporalAdjuster temporalAdjuster) {
        if (temporalAdjuster instanceof org.threeten.bp.chrono.ChronoLocalDate) {
            return getHighSpeedVideoSizes((org.threeten.bp.chrono.ChronoLocalDate) temporalAdjuster, this.getHighResolutionOutputSizeshNQ4ISI);
        }
        if (temporalAdjuster instanceof org.threeten.bp.LocalTime) {
            return getHighSpeedVideoSizes(this.getHighSpeedVideoSizes, (org.threeten.bp.LocalTime) temporalAdjuster);
        }
        if (temporalAdjuster instanceof org.threeten.bp.chrono.ChronoLocalDateTimeImpl) {
            return this.getHighSpeedVideoSizes.getChronology().getHighResolutionOutputSizeshNQ4ISI((org.threeten.bp.chrono.ChronoLocalDateTimeImpl) temporalAdjuster);
        }
        return this.getHighSpeedVideoSizes.getChronology().getHighResolutionOutputSizeshNQ4ISI((org.threeten.bp.chrono.ChronoLocalDateTimeImpl) temporalAdjuster.adjustInto(this));
    }

    @Override // org.threeten.bp.chrono.ChronoLocalDateTime, org.threeten.bp.temporal.Temporal
    /* renamed from: getHighResolutionOutputSizeshNQ4ISI, reason: merged with bridge method [inline-methods] */
    public final org.threeten.bp.chrono.ChronoLocalDateTimeImpl<D> with(org.threeten.bp.temporal.TemporalField temporalField, long j) {
        if (temporalField instanceof org.threeten.bp.temporal.ChronoField) {
            if (temporalField.isTimeBased()) {
                return getHighSpeedVideoSizes(this.getHighSpeedVideoSizes, this.getHighResolutionOutputSizeshNQ4ISI.with(temporalField, j));
            }
            return getHighSpeedVideoSizes(this.getHighSpeedVideoSizes.with(temporalField, j), this.getHighResolutionOutputSizeshNQ4ISI);
        }
        return this.getHighSpeedVideoSizes.getChronology().getHighResolutionOutputSizeshNQ4ISI(temporalField.adjustInto(this, j));
    }

    @Override // org.threeten.bp.chrono.ChronoLocalDateTime, org.threeten.bp.temporal.Temporal
    /* renamed from: getHighSpeedVideoSizes, reason: merged with bridge method [inline-methods] */
    public final org.threeten.bp.chrono.ChronoLocalDateTimeImpl<D> plus(long j, org.threeten.bp.temporal.TemporalUnit temporalUnit) {
        if (!(temporalUnit instanceof org.threeten.bp.temporal.ChronoUnit)) {
            return this.getHighSpeedVideoSizes.getChronology().getHighResolutionOutputSizeshNQ4ISI(temporalUnit.addTo(this, j));
        }
        switch (org.threeten.bp.chrono.ChronoLocalDateTimeImpl.AnonymousClass1.Camera2StreamConfigurationMap[((org.threeten.bp.temporal.ChronoUnit) temporalUnit).ordinal()]) {
            case 1:
                return Camera2StreamConfigurationMap(this.getHighSpeedVideoSizes, 0L, 0L, 0L, j);
            case 2:
                org.threeten.bp.chrono.ChronoLocalDateTimeImpl<D> highSpeedVideoSizes = getHighSpeedVideoSizes(this.getHighSpeedVideoSizes.plus(j / 86400000000L, org.threeten.bp.temporal.ChronoUnit.DAYS), this.getHighResolutionOutputSizeshNQ4ISI);
                return highSpeedVideoSizes.Camera2StreamConfigurationMap(highSpeedVideoSizes.getHighSpeedVideoSizes, 0L, 0L, 0L, (j % 86400000000L) * 1000);
            case 3:
                org.threeten.bp.chrono.ChronoLocalDateTimeImpl<D> highSpeedVideoSizes2 = getHighSpeedVideoSizes(this.getHighSpeedVideoSizes.plus(j / 86400000, org.threeten.bp.temporal.ChronoUnit.DAYS), this.getHighResolutionOutputSizeshNQ4ISI);
                return highSpeedVideoSizes2.Camera2StreamConfigurationMap(highSpeedVideoSizes2.getHighSpeedVideoSizes, 0L, 0L, 0L, (j % 86400000) * 1000000);
            case 4:
                return Camera2StreamConfigurationMap(this.getHighSpeedVideoSizes, 0L, 0L, j, 0L);
            case 5:
                return Camera2StreamConfigurationMap(this.getHighSpeedVideoSizes, 0L, j, 0L, 0L);
            case 6:
                return Camera2StreamConfigurationMap(this.getHighSpeedVideoSizes, j, 0L, 0L, 0L);
            case 7:
                org.threeten.bp.chrono.ChronoLocalDateTimeImpl<D> highSpeedVideoSizes3 = getHighSpeedVideoSizes(this.getHighSpeedVideoSizes.plus(j / 256, org.threeten.bp.temporal.ChronoUnit.DAYS), this.getHighResolutionOutputSizeshNQ4ISI);
                return highSpeedVideoSizes3.Camera2StreamConfigurationMap(highSpeedVideoSizes3.getHighSpeedVideoSizes, (j % 256) * 12, 0L, 0L, 0L);
            default:
                return getHighSpeedVideoSizes(this.getHighSpeedVideoSizes.plus(j, temporalUnit), this.getHighResolutionOutputSizeshNQ4ISI);
        }
    }

    /* renamed from: org.threeten.bp.chrono.ChronoLocalDateTimeImpl$1, reason: invalid class name */
    static /* synthetic */ class AnonymousClass1 {
        static final /* synthetic */ int[] Camera2StreamConfigurationMap;

        static {
            int[] iArr = new int[org.threeten.bp.temporal.ChronoUnit.values().length];
            Camera2StreamConfigurationMap = iArr;
            try {
                iArr[org.threeten.bp.temporal.ChronoUnit.NANOS.ordinal()] = 1;
            } catch (java.lang.NoSuchFieldError unused) {
            }
            try {
                Camera2StreamConfigurationMap[org.threeten.bp.temporal.ChronoUnit.MICROS.ordinal()] = 2;
            } catch (java.lang.NoSuchFieldError unused2) {
            }
            try {
                Camera2StreamConfigurationMap[org.threeten.bp.temporal.ChronoUnit.MILLIS.ordinal()] = 3;
            } catch (java.lang.NoSuchFieldError unused3) {
            }
            try {
                Camera2StreamConfigurationMap[org.threeten.bp.temporal.ChronoUnit.SECONDS.ordinal()] = 4;
            } catch (java.lang.NoSuchFieldError unused4) {
            }
            try {
                Camera2StreamConfigurationMap[org.threeten.bp.temporal.ChronoUnit.MINUTES.ordinal()] = 5;
            } catch (java.lang.NoSuchFieldError unused5) {
            }
            try {
                Camera2StreamConfigurationMap[org.threeten.bp.temporal.ChronoUnit.HOURS.ordinal()] = 6;
            } catch (java.lang.NoSuchFieldError unused6) {
            }
            try {
                Camera2StreamConfigurationMap[org.threeten.bp.temporal.ChronoUnit.HALF_DAYS.ordinal()] = 7;
            } catch (java.lang.NoSuchFieldError unused7) {
            }
        }
    }

    final org.threeten.bp.chrono.ChronoLocalDateTimeImpl<D> Camera2StreamConfigurationMap(D d, long j, long j2, long j3, long j4) {
        if ((j | j2 | j3 | j4) == 0) {
            return getHighSpeedVideoSizes(d, this.getHighResolutionOutputSizeshNQ4ISI);
        }
        long j5 = j4 / kotlinx.datetime.internal.DateCalculationsKt.NANOS_PER_DAY;
        long j6 = j3 / 86400;
        long j7 = j2 / 1440;
        long j8 = j / 24;
        long nanoOfDay = this.getHighResolutionOutputSizeshNQ4ISI.toNanoOfDay();
        long j9 = (j4 % kotlinx.datetime.internal.DateCalculationsKt.NANOS_PER_DAY) + ((j3 % 86400) * 1000000000) + ((j2 % 1440) * kotlinx.datetime.internal.DateCalculationsKt.NANOS_PER_MINUTE) + ((j % 24) * kotlinx.datetime.internal.DateCalculationsKt.NANOS_PER_HOUR) + nanoOfDay;
        long floorDiv = org.threeten.bp.jdk8.Jdk8Methods.floorDiv(j9, kotlinx.datetime.internal.DateCalculationsKt.NANOS_PER_DAY);
        long floorMod = org.threeten.bp.jdk8.Jdk8Methods.floorMod(j9, kotlinx.datetime.internal.DateCalculationsKt.NANOS_PER_DAY);
        return getHighSpeedVideoSizes(d.plus(j5 + j6 + j7 + j8 + floorDiv, org.threeten.bp.temporal.ChronoUnit.DAYS), floorMod == nanoOfDay ? this.getHighResolutionOutputSizeshNQ4ISI : org.threeten.bp.LocalTime.ofNanoOfDay(floorMod));
    }

    @Override // org.threeten.bp.chrono.ChronoLocalDateTime
    /* renamed from: atZone */
    public final org.threeten.bp.chrono.ChronoZonedDateTime<D> atZone2(org.threeten.bp.ZoneId zoneId) {
        return org.threeten.bp.chrono.ChronoZonedDateTimeImpl.getHighResolutionOutputSizeshNQ4ISI(this, zoneId, (org.threeten.bp.ZoneOffset) null);
    }

    /* JADX WARN: Type inference failed for: r0v5, types: [org.threeten.bp.chrono.ChronoLocalDate] */
    @Override // org.threeten.bp.temporal.Temporal
    public final long until(org.threeten.bp.temporal.Temporal temporal, org.threeten.bp.temporal.TemporalUnit temporalUnit) {
        org.threeten.bp.chrono.ChronoLocalDateTime<?> localDateTime = toLocalDate().getChronology().localDateTime(temporal);
        if (temporalUnit instanceof org.threeten.bp.temporal.ChronoUnit) {
            org.threeten.bp.temporal.ChronoUnit chronoUnit = (org.threeten.bp.temporal.ChronoUnit) temporalUnit;
            if (chronoUnit.isTimeBased()) {
                long j = localDateTime.getLong(org.threeten.bp.temporal.ChronoField.EPOCH_DAY) - this.getHighSpeedVideoSizes.getLong(org.threeten.bp.temporal.ChronoField.EPOCH_DAY);
                switch (org.threeten.bp.chrono.ChronoLocalDateTimeImpl.AnonymousClass1.Camera2StreamConfigurationMap[chronoUnit.ordinal()]) {
                    case 1:
                        j = org.threeten.bp.jdk8.Jdk8Methods.safeMultiply(j, kotlinx.datetime.internal.DateCalculationsKt.NANOS_PER_DAY);
                        break;
                    case 2:
                        j = org.threeten.bp.jdk8.Jdk8Methods.safeMultiply(j, 86400000000L);
                        break;
                    case 3:
                        j = org.threeten.bp.jdk8.Jdk8Methods.safeMultiply(j, 86400000L);
                        break;
                    case 4:
                        j = org.threeten.bp.jdk8.Jdk8Methods.safeMultiply(j, kotlinx.datetime.internal.DateCalculationsKt.SECONDS_PER_DAY);
                        break;
                    case 5:
                        j = org.threeten.bp.jdk8.Jdk8Methods.safeMultiply(j, com.paypal.oslo.feature.verificationcapture.ui.screens.daonface.FaceCaptureManager.IDEAL_CAPTURE_WIDTH);
                        break;
                    case 6:
                        j = org.threeten.bp.jdk8.Jdk8Methods.safeMultiply(j, 24);
                        break;
                    case 7:
                        j = org.threeten.bp.jdk8.Jdk8Methods.safeMultiply(j, 2);
                        break;
                }
                return org.threeten.bp.jdk8.Jdk8Methods.safeAdd(j, this.getHighResolutionOutputSizeshNQ4ISI.until(localDateTime.toLocalTime(), temporalUnit));
            }
            ?? localDate = localDateTime.toLocalDate();
            org.threeten.bp.chrono.ChronoLocalDate chronoLocalDate = localDate;
            if (localDateTime.toLocalTime().isBefore(this.getHighResolutionOutputSizeshNQ4ISI)) {
                chronoLocalDate = localDate.minus(1L, org.threeten.bp.temporal.ChronoUnit.DAYS);
            }
            return this.getHighSpeedVideoSizes.until(chronoLocalDate, temporalUnit);
        }
        return temporalUnit.between(this, localDateTime);
    }

    private java.lang.Object writeReplace() {
        return new org.threeten.bp.chrono.Ser(com.google.common.base.Ascii.FF, this);
    }

    static org.threeten.bp.chrono.ChronoLocalDateTime<?> getHighResolutionOutputSizeshNQ4ISI(java.io.ObjectInput objectInput) throws java.io.IOException, java.lang.ClassNotFoundException {
        return ((org.threeten.bp.chrono.ChronoLocalDate) objectInput.readObject()).atTime((org.threeten.bp.LocalTime) objectInput.readObject());
    }
}
