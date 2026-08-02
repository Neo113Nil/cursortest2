package org.threeten.bp;

/* loaded from: classes18.dex */
public final class LocalTime extends org.threeten.bp.jdk8.DefaultInterfaceTemporalAccessor implements org.threeten.bp.temporal.Temporal, org.threeten.bp.temporal.TemporalAdjuster, java.lang.Comparable<org.threeten.bp.LocalTime>, java.io.Serializable {
    public static final org.threeten.bp.LocalTime MAX;
    public static final org.threeten.bp.LocalTime MIDNIGHT;
    public static final org.threeten.bp.LocalTime MIN;
    public static final org.threeten.bp.LocalTime NOON;
    private static final long serialVersionUID = 6414437269572265201L;
    private final byte Camera2StreamConfigurationMap;
    private final byte getHighResolutionOutputSizeshNQ4ISI;
    private final byte getHighSpeedVideoFpsRanges;
    private final int getHighSpeedVideoFpsRangesFor;
    public static final org.threeten.bp.temporal.TemporalQuery<org.threeten.bp.LocalTime> FROM = new org.threeten.bp.temporal.TemporalQuery<org.threeten.bp.LocalTime>() { // from class: org.threeten.bp.LocalTime.1
        @Override // org.threeten.bp.temporal.TemporalQuery
        public /* synthetic */ org.threeten.bp.LocalTime queryFrom(org.threeten.bp.temporal.TemporalAccessor temporalAccessor) {
            return org.threeten.bp.LocalTime.from(temporalAccessor);
        }
    };
    private static final org.threeten.bp.LocalTime[] getHighSpeedVideoSizes = new org.threeten.bp.LocalTime[24];

    static {
        int i = 0;
        while (true) {
            org.threeten.bp.LocalTime[] localTimeArr = getHighSpeedVideoSizes;
            if (i < localTimeArr.length) {
                localTimeArr[i] = new org.threeten.bp.LocalTime(i, 0, 0, 0);
                i++;
            } else {
                org.threeten.bp.LocalTime localTime = localTimeArr[0];
                MIDNIGHT = localTime;
                NOON = localTimeArr[12];
                MIN = localTime;
                MAX = new org.threeten.bp.LocalTime(23, 59, 59, org.threeten.bp.Year.MAX_VALUE);
                return;
            }
        }
    }

    public static org.threeten.bp.LocalTime now() {
        return now(org.threeten.bp.Clock.systemDefaultZone());
    }

    public static org.threeten.bp.LocalTime now(org.threeten.bp.ZoneId zoneId) {
        return now(org.threeten.bp.Clock.system(zoneId));
    }

    public static org.threeten.bp.LocalTime now(org.threeten.bp.Clock clock) {
        org.threeten.bp.jdk8.Jdk8Methods.requireNonNull(clock, "clock");
        org.threeten.bp.Instant instant = clock.instant();
        long epochSecond = ((instant.getEpochSecond() % 86400) + clock.getZone().getRules().getOffset(instant).getTotalSeconds()) % 86400;
        if (epochSecond < 0) {
            epochSecond += 86400;
        }
        return getHighResolutionOutputSizeshNQ4ISI(epochSecond, instant.getNano());
    }

    public static org.threeten.bp.LocalTime of(int i, int i2) {
        org.threeten.bp.temporal.ChronoField.HOUR_OF_DAY.checkValidValue(i);
        if (i2 == 0) {
            return getHighSpeedVideoSizes[i];
        }
        org.threeten.bp.temporal.ChronoField.MINUTE_OF_HOUR.checkValidValue(i2);
        return new org.threeten.bp.LocalTime(i, i2, 0, 0);
    }

    public static org.threeten.bp.LocalTime of(int i, int i2, int i3) {
        org.threeten.bp.temporal.ChronoField.HOUR_OF_DAY.checkValidValue(i);
        if ((i2 | i3) == 0) {
            return getHighSpeedVideoSizes[i];
        }
        org.threeten.bp.temporal.ChronoField.MINUTE_OF_HOUR.checkValidValue(i2);
        org.threeten.bp.temporal.ChronoField.SECOND_OF_MINUTE.checkValidValue(i3);
        return new org.threeten.bp.LocalTime(i, i2, i3, 0);
    }

    public static org.threeten.bp.LocalTime of(int i, int i2, int i3, int i4) {
        org.threeten.bp.temporal.ChronoField.HOUR_OF_DAY.checkValidValue(i);
        org.threeten.bp.temporal.ChronoField.MINUTE_OF_HOUR.checkValidValue(i2);
        org.threeten.bp.temporal.ChronoField.SECOND_OF_MINUTE.checkValidValue(i3);
        org.threeten.bp.temporal.ChronoField.NANO_OF_SECOND.checkValidValue(i4);
        if ((i2 | i3 | i4) == 0) {
            return getHighSpeedVideoSizes[i];
        }
        return new org.threeten.bp.LocalTime(i, i2, i3, i4);
    }

    public static org.threeten.bp.LocalTime ofSecondOfDay(long j) {
        org.threeten.bp.temporal.ChronoField.SECOND_OF_DAY.checkValidValue(j);
        int i = (int) (j / 3600);
        long j2 = j - (i * 3600);
        int i2 = (int) (j2 / 60);
        int i3 = (int) (j2 - (i2 * 60));
        if ((i2 | i3) == 0) {
            return getHighSpeedVideoSizes[i];
        }
        return new org.threeten.bp.LocalTime(i, i2, i3, 0);
    }

    static org.threeten.bp.LocalTime getHighResolutionOutputSizeshNQ4ISI(long j, int i) {
        org.threeten.bp.temporal.ChronoField.SECOND_OF_DAY.checkValidValue(j);
        org.threeten.bp.temporal.ChronoField.NANO_OF_SECOND.checkValidValue(i);
        int i2 = (int) (j / 3600);
        long j2 = j - (i2 * 3600);
        int i3 = (int) (j2 / 60);
        int i4 = (int) (j2 - (i3 * 60));
        if ((i3 | i4 | i) == 0) {
            return getHighSpeedVideoSizes[i2];
        }
        return new org.threeten.bp.LocalTime(i2, i3, i4, i);
    }

    public static org.threeten.bp.LocalTime ofNanoOfDay(long j) {
        org.threeten.bp.temporal.ChronoField.NANO_OF_DAY.checkValidValue(j);
        int i = (int) (j / kotlinx.datetime.internal.DateCalculationsKt.NANOS_PER_HOUR);
        long j2 = j - (i * kotlinx.datetime.internal.DateCalculationsKt.NANOS_PER_HOUR);
        int i2 = (int) (j2 / kotlinx.datetime.internal.DateCalculationsKt.NANOS_PER_MINUTE);
        long j3 = j2 - (i2 * kotlinx.datetime.internal.DateCalculationsKt.NANOS_PER_MINUTE);
        int i3 = (int) (j3 / 1000000000);
        int i4 = (int) (j3 - (i3 * 1000000000));
        if ((i2 | i3 | i4) == 0) {
            return getHighSpeedVideoSizes[i];
        }
        return new org.threeten.bp.LocalTime(i, i2, i3, i4);
    }

    public static org.threeten.bp.LocalTime from(org.threeten.bp.temporal.TemporalAccessor temporalAccessor) {
        org.threeten.bp.LocalTime localTime = (org.threeten.bp.LocalTime) temporalAccessor.query(org.threeten.bp.temporal.TemporalQueries.localTime());
        if (localTime != null) {
            return localTime;
        }
        java.lang.StringBuilder sb = new java.lang.StringBuilder("Unable to obtain LocalTime from TemporalAccessor: ");
        sb.append(temporalAccessor);
        sb.append(", type ");
        sb.append(temporalAccessor.getClass().getName());
        throw new org.threeten.bp.DateTimeException(sb.toString());
    }

    public static org.threeten.bp.LocalTime parse(java.lang.CharSequence charSequence) {
        return parse(charSequence, org.threeten.bp.format.DateTimeFormatter.ISO_LOCAL_TIME);
    }

    public static org.threeten.bp.LocalTime parse(java.lang.CharSequence charSequence, org.threeten.bp.format.DateTimeFormatter dateTimeFormatter) {
        org.threeten.bp.jdk8.Jdk8Methods.requireNonNull(dateTimeFormatter, "formatter");
        return (org.threeten.bp.LocalTime) dateTimeFormatter.parse(charSequence, FROM);
    }

    private LocalTime(int i, int i2, int i3, int i4) {
        this.Camera2StreamConfigurationMap = (byte) i;
        this.getHighSpeedVideoFpsRanges = (byte) i2;
        this.getHighResolutionOutputSizeshNQ4ISI = (byte) i3;
        this.getHighSpeedVideoFpsRangesFor = i4;
    }

    @Override // org.threeten.bp.temporal.TemporalAccessor
    public final boolean isSupported(org.threeten.bp.temporal.TemporalField temporalField) {
        if (temporalField instanceof org.threeten.bp.temporal.ChronoField) {
            return temporalField.isTimeBased();
        }
        return temporalField != null && temporalField.isSupportedBy(this);
    }

    @Override // org.threeten.bp.temporal.Temporal
    public final boolean isSupported(org.threeten.bp.temporal.TemporalUnit temporalUnit) {
        if (temporalUnit instanceof org.threeten.bp.temporal.ChronoUnit) {
            return temporalUnit.isTimeBased();
        }
        return temporalUnit != null && temporalUnit.isSupportedBy(this);
    }

    @Override // org.threeten.bp.jdk8.DefaultInterfaceTemporalAccessor, org.threeten.bp.temporal.TemporalAccessor
    public final org.threeten.bp.temporal.ValueRange range(org.threeten.bp.temporal.TemporalField temporalField) {
        return super.range(temporalField);
    }

    @Override // org.threeten.bp.jdk8.DefaultInterfaceTemporalAccessor, org.threeten.bp.temporal.TemporalAccessor
    public final int get(org.threeten.bp.temporal.TemporalField temporalField) {
        if (temporalField instanceof org.threeten.bp.temporal.ChronoField) {
            return getHighSpeedVideoSizes(temporalField);
        }
        return super.get(temporalField);
    }

    @Override // org.threeten.bp.temporal.TemporalAccessor
    public final long getLong(org.threeten.bp.temporal.TemporalField temporalField) {
        if (temporalField instanceof org.threeten.bp.temporal.ChronoField) {
            if (temporalField == org.threeten.bp.temporal.ChronoField.NANO_OF_DAY) {
                return toNanoOfDay();
            }
            if (temporalField == org.threeten.bp.temporal.ChronoField.MICRO_OF_DAY) {
                return toNanoOfDay() / 1000;
            }
            return getHighSpeedVideoSizes(temporalField);
        }
        return temporalField.getFrom(this);
    }

    private int getHighSpeedVideoSizes(org.threeten.bp.temporal.TemporalField temporalField) {
        switch (org.threeten.bp.LocalTime.AnonymousClass2.Camera2StreamConfigurationMap[((org.threeten.bp.temporal.ChronoField) temporalField).ordinal()]) {
            case 1:
                return this.getHighSpeedVideoFpsRangesFor;
            case 2:
                throw new org.threeten.bp.DateTimeException("Field too large for an int: ".concat(java.lang.String.valueOf(temporalField)));
            case 3:
                return this.getHighSpeedVideoFpsRangesFor / 1000;
            case 4:
                throw new org.threeten.bp.DateTimeException("Field too large for an int: ".concat(java.lang.String.valueOf(temporalField)));
            case 5:
                return this.getHighSpeedVideoFpsRangesFor / 1000000;
            case 6:
                return (int) (toNanoOfDay() / 1000000);
            case 7:
                return this.getHighResolutionOutputSizeshNQ4ISI;
            case 8:
                return toSecondOfDay();
            case 9:
                return this.getHighSpeedVideoFpsRanges;
            case 10:
                return (this.Camera2StreamConfigurationMap * 60) + this.getHighSpeedVideoFpsRanges;
            case 11:
                return this.Camera2StreamConfigurationMap % com.google.common.base.Ascii.FF;
            case 12:
                int i = this.Camera2StreamConfigurationMap % com.google.common.base.Ascii.FF;
                if (i % 12 == 0) {
                    return 12;
                }
                return i;
            case 13:
                return this.Camera2StreamConfigurationMap;
            case 14:
                byte b = this.Camera2StreamConfigurationMap;
                if (b == 0) {
                    return 24;
                }
                return b;
            case 15:
                return this.Camera2StreamConfigurationMap / com.google.common.base.Ascii.FF;
            default:
                throw new org.threeten.bp.temporal.UnsupportedTemporalTypeException("Unsupported field: ".concat(java.lang.String.valueOf(temporalField)));
        }
    }

    public final int getHour() {
        return this.Camera2StreamConfigurationMap;
    }

    public final int getMinute() {
        return this.getHighSpeedVideoFpsRanges;
    }

    public final int getSecond() {
        return this.getHighResolutionOutputSizeshNQ4ISI;
    }

    public final int getNano() {
        return this.getHighSpeedVideoFpsRangesFor;
    }

    @Override // org.threeten.bp.temporal.Temporal
    public final org.threeten.bp.LocalTime with(org.threeten.bp.temporal.TemporalAdjuster temporalAdjuster) {
        if (temporalAdjuster instanceof org.threeten.bp.LocalTime) {
            return (org.threeten.bp.LocalTime) temporalAdjuster;
        }
        return (org.threeten.bp.LocalTime) temporalAdjuster.adjustInto(this);
    }

    @Override // org.threeten.bp.temporal.Temporal
    public final org.threeten.bp.LocalTime with(org.threeten.bp.temporal.TemporalField temporalField, long j) {
        if (temporalField instanceof org.threeten.bp.temporal.ChronoField) {
            org.threeten.bp.temporal.ChronoField chronoField = (org.threeten.bp.temporal.ChronoField) temporalField;
            chronoField.checkValidValue(j);
            switch (org.threeten.bp.LocalTime.AnonymousClass2.Camera2StreamConfigurationMap[chronoField.ordinal()]) {
                case 1:
                    return withNano((int) j);
                case 2:
                    return ofNanoOfDay(j);
                case 3:
                    return withNano(((int) j) * 1000);
                case 4:
                    return ofNanoOfDay(j * 1000);
                case 5:
                    return withNano(((int) j) * 1000000);
                case 6:
                    return ofNanoOfDay(j * 1000000);
                case 7:
                    return withSecond((int) j);
                case 8:
                    return plusSeconds(j - toSecondOfDay());
                case 9:
                    return withMinute((int) j);
                case 10:
                    return plusMinutes(j - ((this.Camera2StreamConfigurationMap * 60) + this.getHighSpeedVideoFpsRanges));
                case 11:
                    return plusHours(j - (this.Camera2StreamConfigurationMap % com.google.common.base.Ascii.FF));
                case 12:
                    if (j == 12) {
                        j = 0;
                    }
                    return plusHours(j - (this.Camera2StreamConfigurationMap % com.google.common.base.Ascii.FF));
                case 13:
                    return withHour((int) j);
                case 14:
                    if (j == 24) {
                        j = 0;
                    }
                    return withHour((int) j);
                case 15:
                    return plusHours((j - (this.Camera2StreamConfigurationMap / com.google.common.base.Ascii.FF)) * 12);
                default:
                    throw new org.threeten.bp.temporal.UnsupportedTemporalTypeException("Unsupported field: ".concat(java.lang.String.valueOf(temporalField)));
            }
        }
        return (org.threeten.bp.LocalTime) temporalField.adjustInto(this, j);
    }

    public final org.threeten.bp.LocalTime withHour(int i) {
        if (this.Camera2StreamConfigurationMap == i) {
            return this;
        }
        org.threeten.bp.temporal.ChronoField.HOUR_OF_DAY.checkValidValue(i);
        byte b = this.getHighSpeedVideoFpsRanges;
        byte b2 = this.getHighResolutionOutputSizeshNQ4ISI;
        int i2 = this.getHighSpeedVideoFpsRangesFor;
        if ((b | b2 | i2) == 0) {
            return getHighSpeedVideoSizes[i];
        }
        return new org.threeten.bp.LocalTime(i, b, b2, i2);
    }

    public final org.threeten.bp.LocalTime withMinute(int i) {
        if (this.getHighSpeedVideoFpsRanges == i) {
            return this;
        }
        org.threeten.bp.temporal.ChronoField.MINUTE_OF_HOUR.checkValidValue(i);
        byte b = this.Camera2StreamConfigurationMap;
        byte b2 = this.getHighResolutionOutputSizeshNQ4ISI;
        int i2 = this.getHighSpeedVideoFpsRangesFor;
        if ((i | b2 | i2) == 0) {
            return getHighSpeedVideoSizes[b];
        }
        return new org.threeten.bp.LocalTime(b, i, b2, i2);
    }

    public final org.threeten.bp.LocalTime withSecond(int i) {
        if (this.getHighResolutionOutputSizeshNQ4ISI == i) {
            return this;
        }
        org.threeten.bp.temporal.ChronoField.SECOND_OF_MINUTE.checkValidValue(i);
        byte b = this.Camera2StreamConfigurationMap;
        byte b2 = this.getHighSpeedVideoFpsRanges;
        int i2 = this.getHighSpeedVideoFpsRangesFor;
        if ((b2 | i | i2) == 0) {
            return getHighSpeedVideoSizes[b];
        }
        return new org.threeten.bp.LocalTime(b, b2, i, i2);
    }

    public final org.threeten.bp.LocalTime withNano(int i) {
        if (this.getHighSpeedVideoFpsRangesFor == i) {
            return this;
        }
        org.threeten.bp.temporal.ChronoField.NANO_OF_SECOND.checkValidValue(i);
        byte b = this.Camera2StreamConfigurationMap;
        byte b2 = this.getHighSpeedVideoFpsRanges;
        byte b3 = this.getHighResolutionOutputSizeshNQ4ISI;
        if ((b2 | b3 | i) == 0) {
            return getHighSpeedVideoSizes[b];
        }
        return new org.threeten.bp.LocalTime(b, b2, b3, i);
    }

    public final org.threeten.bp.LocalTime truncatedTo(org.threeten.bp.temporal.TemporalUnit temporalUnit) {
        if (temporalUnit == org.threeten.bp.temporal.ChronoUnit.NANOS) {
            return this;
        }
        org.threeten.bp.Duration duration = temporalUnit.getDuration();
        if (duration.getSeconds() > 86400) {
            throw new org.threeten.bp.DateTimeException("Unit is too large to be used for truncation");
        }
        long nanos = duration.toNanos();
        if (kotlinx.datetime.internal.DateCalculationsKt.NANOS_PER_DAY % nanos != 0) {
            throw new org.threeten.bp.DateTimeException("Unit must divide into a standard day without remainder");
        }
        return ofNanoOfDay((toNanoOfDay() / nanos) * nanos);
    }

    @Override // org.threeten.bp.temporal.Temporal
    public final org.threeten.bp.LocalTime plus(org.threeten.bp.temporal.TemporalAmount temporalAmount) {
        return (org.threeten.bp.LocalTime) temporalAmount.addTo(this);
    }

    @Override // org.threeten.bp.temporal.Temporal
    public final org.threeten.bp.LocalTime plus(long j, org.threeten.bp.temporal.TemporalUnit temporalUnit) {
        if (temporalUnit instanceof org.threeten.bp.temporal.ChronoUnit) {
            switch (org.threeten.bp.LocalTime.AnonymousClass2.getHighResolutionOutputSizeshNQ4ISI[((org.threeten.bp.temporal.ChronoUnit) temporalUnit).ordinal()]) {
                case 1:
                    return plusNanos(j);
                case 2:
                    return plusNanos((j % 86400000000L) * 1000);
                case 3:
                    return plusNanos((j % 86400000) * 1000000);
                case 4:
                    return plusSeconds(j);
                case 5:
                    return plusMinutes(j);
                case 6:
                    return plusHours(j);
                case 7:
                    return plusHours((j % 2) * 12);
                default:
                    throw new org.threeten.bp.temporal.UnsupportedTemporalTypeException("Unsupported unit: ".concat(java.lang.String.valueOf(temporalUnit)));
            }
        }
        return (org.threeten.bp.LocalTime) temporalUnit.addTo(this, j);
    }

    /* renamed from: org.threeten.bp.LocalTime$2, reason: invalid class name */
    static /* synthetic */ class AnonymousClass2 {
        static final /* synthetic */ int[] Camera2StreamConfigurationMap;
        static final /* synthetic */ int[] getHighResolutionOutputSizeshNQ4ISI;

        static {
            int[] iArr = new int[org.threeten.bp.temporal.ChronoUnit.values().length];
            getHighResolutionOutputSizeshNQ4ISI = iArr;
            try {
                iArr[org.threeten.bp.temporal.ChronoUnit.NANOS.ordinal()] = 1;
            } catch (java.lang.NoSuchFieldError unused) {
            }
            try {
                getHighResolutionOutputSizeshNQ4ISI[org.threeten.bp.temporal.ChronoUnit.MICROS.ordinal()] = 2;
            } catch (java.lang.NoSuchFieldError unused2) {
            }
            try {
                getHighResolutionOutputSizeshNQ4ISI[org.threeten.bp.temporal.ChronoUnit.MILLIS.ordinal()] = 3;
            } catch (java.lang.NoSuchFieldError unused3) {
            }
            try {
                getHighResolutionOutputSizeshNQ4ISI[org.threeten.bp.temporal.ChronoUnit.SECONDS.ordinal()] = 4;
            } catch (java.lang.NoSuchFieldError unused4) {
            }
            try {
                getHighResolutionOutputSizeshNQ4ISI[org.threeten.bp.temporal.ChronoUnit.MINUTES.ordinal()] = 5;
            } catch (java.lang.NoSuchFieldError unused5) {
            }
            try {
                getHighResolutionOutputSizeshNQ4ISI[org.threeten.bp.temporal.ChronoUnit.HOURS.ordinal()] = 6;
            } catch (java.lang.NoSuchFieldError unused6) {
            }
            try {
                getHighResolutionOutputSizeshNQ4ISI[org.threeten.bp.temporal.ChronoUnit.HALF_DAYS.ordinal()] = 7;
            } catch (java.lang.NoSuchFieldError unused7) {
            }
            int[] iArr2 = new int[org.threeten.bp.temporal.ChronoField.values().length];
            Camera2StreamConfigurationMap = iArr2;
            try {
                iArr2[org.threeten.bp.temporal.ChronoField.NANO_OF_SECOND.ordinal()] = 1;
            } catch (java.lang.NoSuchFieldError unused8) {
            }
            try {
                Camera2StreamConfigurationMap[org.threeten.bp.temporal.ChronoField.NANO_OF_DAY.ordinal()] = 2;
            } catch (java.lang.NoSuchFieldError unused9) {
            }
            try {
                Camera2StreamConfigurationMap[org.threeten.bp.temporal.ChronoField.MICRO_OF_SECOND.ordinal()] = 3;
            } catch (java.lang.NoSuchFieldError unused10) {
            }
            try {
                Camera2StreamConfigurationMap[org.threeten.bp.temporal.ChronoField.MICRO_OF_DAY.ordinal()] = 4;
            } catch (java.lang.NoSuchFieldError unused11) {
            }
            try {
                Camera2StreamConfigurationMap[org.threeten.bp.temporal.ChronoField.MILLI_OF_SECOND.ordinal()] = 5;
            } catch (java.lang.NoSuchFieldError unused12) {
            }
            try {
                Camera2StreamConfigurationMap[org.threeten.bp.temporal.ChronoField.MILLI_OF_DAY.ordinal()] = 6;
            } catch (java.lang.NoSuchFieldError unused13) {
            }
            try {
                Camera2StreamConfigurationMap[org.threeten.bp.temporal.ChronoField.SECOND_OF_MINUTE.ordinal()] = 7;
            } catch (java.lang.NoSuchFieldError unused14) {
            }
            try {
                Camera2StreamConfigurationMap[org.threeten.bp.temporal.ChronoField.SECOND_OF_DAY.ordinal()] = 8;
            } catch (java.lang.NoSuchFieldError unused15) {
            }
            try {
                Camera2StreamConfigurationMap[org.threeten.bp.temporal.ChronoField.MINUTE_OF_HOUR.ordinal()] = 9;
            } catch (java.lang.NoSuchFieldError unused16) {
            }
            try {
                Camera2StreamConfigurationMap[org.threeten.bp.temporal.ChronoField.MINUTE_OF_DAY.ordinal()] = 10;
            } catch (java.lang.NoSuchFieldError unused17) {
            }
            try {
                Camera2StreamConfigurationMap[org.threeten.bp.temporal.ChronoField.HOUR_OF_AMPM.ordinal()] = 11;
            } catch (java.lang.NoSuchFieldError unused18) {
            }
            try {
                Camera2StreamConfigurationMap[org.threeten.bp.temporal.ChronoField.CLOCK_HOUR_OF_AMPM.ordinal()] = 12;
            } catch (java.lang.NoSuchFieldError unused19) {
            }
            try {
                Camera2StreamConfigurationMap[org.threeten.bp.temporal.ChronoField.HOUR_OF_DAY.ordinal()] = 13;
            } catch (java.lang.NoSuchFieldError unused20) {
            }
            try {
                Camera2StreamConfigurationMap[org.threeten.bp.temporal.ChronoField.CLOCK_HOUR_OF_DAY.ordinal()] = 14;
            } catch (java.lang.NoSuchFieldError unused21) {
            }
            try {
                Camera2StreamConfigurationMap[org.threeten.bp.temporal.ChronoField.AMPM_OF_DAY.ordinal()] = 15;
            } catch (java.lang.NoSuchFieldError unused22) {
            }
        }
    }

    public final org.threeten.bp.LocalTime plusHours(long j) {
        if (j == 0) {
            return this;
        }
        int i = ((((int) (j % 24)) + this.Camera2StreamConfigurationMap) + 24) % 24;
        byte b = this.getHighSpeedVideoFpsRanges;
        byte b2 = this.getHighResolutionOutputSizeshNQ4ISI;
        int i2 = this.getHighSpeedVideoFpsRangesFor;
        if ((b | b2 | i2) == 0) {
            return getHighSpeedVideoSizes[i];
        }
        return new org.threeten.bp.LocalTime(i, b, b2, i2);
    }

    public final org.threeten.bp.LocalTime plusMinutes(long j) {
        if (j != 0) {
            int i = (this.Camera2StreamConfigurationMap * 60) + this.getHighSpeedVideoFpsRanges;
            int i2 = ((((int) (j % 1440)) + i) + com.paypal.oslo.feature.verificationcapture.ui.screens.daonface.FaceCaptureManager.IDEAL_CAPTURE_WIDTH) % com.paypal.oslo.feature.verificationcapture.ui.screens.daonface.FaceCaptureManager.IDEAL_CAPTURE_WIDTH;
            if (i != i2) {
                int i3 = i2 / 60;
                int i4 = i2 % 60;
                byte b = this.getHighResolutionOutputSizeshNQ4ISI;
                int i5 = this.getHighSpeedVideoFpsRangesFor;
                if ((i4 | b | i5) == 0) {
                    return getHighSpeedVideoSizes[i3];
                }
                return new org.threeten.bp.LocalTime(i3, i4, b, i5);
            }
        }
        return this;
    }

    public final org.threeten.bp.LocalTime plusSeconds(long j) {
        if (j != 0) {
            int i = (this.Camera2StreamConfigurationMap * 3600) + (this.getHighSpeedVideoFpsRanges * 60) + this.getHighResolutionOutputSizeshNQ4ISI;
            int i2 = ((((int) (j % 86400)) + i) + kotlinx.datetime.internal.DateCalculationsKt.SECONDS_PER_DAY) % kotlinx.datetime.internal.DateCalculationsKt.SECONDS_PER_DAY;
            if (i != i2) {
                int i3 = i2 / 3600;
                int i4 = (i2 / 60) % 60;
                int i5 = i2 % 60;
                int i6 = this.getHighSpeedVideoFpsRangesFor;
                if ((i4 | i5 | i6) == 0) {
                    return getHighSpeedVideoSizes[i3];
                }
                return new org.threeten.bp.LocalTime(i3, i4, i5, i6);
            }
        }
        return this;
    }

    public final org.threeten.bp.LocalTime plusNanos(long j) {
        if (j != 0) {
            long nanoOfDay = toNanoOfDay();
            long j2 = (((j % kotlinx.datetime.internal.DateCalculationsKt.NANOS_PER_DAY) + nanoOfDay) + kotlinx.datetime.internal.DateCalculationsKt.NANOS_PER_DAY) % kotlinx.datetime.internal.DateCalculationsKt.NANOS_PER_DAY;
            if (nanoOfDay != j2) {
                int i = (int) (j2 / kotlinx.datetime.internal.DateCalculationsKt.NANOS_PER_HOUR);
                int i2 = (int) ((j2 / kotlinx.datetime.internal.DateCalculationsKt.NANOS_PER_MINUTE) % 60);
                int i3 = (int) ((j2 / 1000000000) % 60);
                int i4 = (int) (j2 % 1000000000);
                if ((i2 | i3 | i4) == 0) {
                    return getHighSpeedVideoSizes[i];
                }
                return new org.threeten.bp.LocalTime(i, i2, i3, i4);
            }
        }
        return this;
    }

    @Override // org.threeten.bp.temporal.Temporal
    public final org.threeten.bp.LocalTime minus(org.threeten.bp.temporal.TemporalAmount temporalAmount) {
        return (org.threeten.bp.LocalTime) temporalAmount.subtractFrom(this);
    }

    @Override // org.threeten.bp.temporal.Temporal
    public final org.threeten.bp.LocalTime minus(long j, org.threeten.bp.temporal.TemporalUnit temporalUnit) {
        return j == Long.MIN_VALUE ? plus(Long.MAX_VALUE, temporalUnit).plus(1L, temporalUnit) : plus(-j, temporalUnit);
    }

    public final org.threeten.bp.LocalTime minusHours(long j) {
        return plusHours(-(j % 24));
    }

    public final org.threeten.bp.LocalTime minusMinutes(long j) {
        return plusMinutes(-(j % 1440));
    }

    public final org.threeten.bp.LocalTime minusSeconds(long j) {
        return plusSeconds(-(j % 86400));
    }

    public final org.threeten.bp.LocalTime minusNanos(long j) {
        return plusNanos(-(j % kotlinx.datetime.internal.DateCalculationsKt.NANOS_PER_DAY));
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // org.threeten.bp.jdk8.DefaultInterfaceTemporalAccessor, org.threeten.bp.temporal.TemporalAccessor
    public final <R> R query(org.threeten.bp.temporal.TemporalQuery<R> temporalQuery) {
        if (temporalQuery == org.threeten.bp.temporal.TemporalQueries.precision()) {
            return (R) org.threeten.bp.temporal.ChronoUnit.NANOS;
        }
        if (temporalQuery == org.threeten.bp.temporal.TemporalQueries.localTime()) {
            return this;
        }
        if (temporalQuery == org.threeten.bp.temporal.TemporalQueries.chronology() || temporalQuery == org.threeten.bp.temporal.TemporalQueries.zoneId() || temporalQuery == org.threeten.bp.temporal.TemporalQueries.zone() || temporalQuery == org.threeten.bp.temporal.TemporalQueries.offset() || temporalQuery == org.threeten.bp.temporal.TemporalQueries.localDate()) {
            return null;
        }
        return temporalQuery.queryFrom(this);
    }

    @Override // org.threeten.bp.temporal.TemporalAdjuster
    public final org.threeten.bp.temporal.Temporal adjustInto(org.threeten.bp.temporal.Temporal temporal) {
        return temporal.with(org.threeten.bp.temporal.ChronoField.NANO_OF_DAY, toNanoOfDay());
    }

    @Override // org.threeten.bp.temporal.Temporal
    public final long until(org.threeten.bp.temporal.Temporal temporal, org.threeten.bp.temporal.TemporalUnit temporalUnit) {
        org.threeten.bp.LocalTime from = from(temporal);
        if (temporalUnit instanceof org.threeten.bp.temporal.ChronoUnit) {
            long nanoOfDay = from.toNanoOfDay() - toNanoOfDay();
            switch (org.threeten.bp.LocalTime.AnonymousClass2.getHighResolutionOutputSizeshNQ4ISI[((org.threeten.bp.temporal.ChronoUnit) temporalUnit).ordinal()]) {
                case 1:
                    return nanoOfDay;
                case 2:
                    return nanoOfDay / 1000;
                case 3:
                    return nanoOfDay / 1000000;
                case 4:
                    return nanoOfDay / 1000000000;
                case 5:
                    return nanoOfDay / kotlinx.datetime.internal.DateCalculationsKt.NANOS_PER_MINUTE;
                case 6:
                    return nanoOfDay / kotlinx.datetime.internal.DateCalculationsKt.NANOS_PER_HOUR;
                case 7:
                    return nanoOfDay / 43200000000000L;
                default:
                    throw new org.threeten.bp.temporal.UnsupportedTemporalTypeException("Unsupported unit: ".concat(java.lang.String.valueOf(temporalUnit)));
            }
        }
        return temporalUnit.between(this, from);
    }

    public final org.threeten.bp.LocalDateTime atDate(org.threeten.bp.LocalDate localDate) {
        return org.threeten.bp.LocalDateTime.of(localDate, this);
    }

    public final org.threeten.bp.OffsetTime atOffset(org.threeten.bp.ZoneOffset zoneOffset) {
        return org.threeten.bp.OffsetTime.of(this, zoneOffset);
    }

    public final int toSecondOfDay() {
        return (this.Camera2StreamConfigurationMap * 3600) + (this.getHighSpeedVideoFpsRanges * 60) + this.getHighResolutionOutputSizeshNQ4ISI;
    }

    public final long toNanoOfDay() {
        return (this.Camera2StreamConfigurationMap * kotlinx.datetime.internal.DateCalculationsKt.NANOS_PER_HOUR) + (this.getHighSpeedVideoFpsRanges * kotlinx.datetime.internal.DateCalculationsKt.NANOS_PER_MINUTE) + (this.getHighResolutionOutputSizeshNQ4ISI * 1000000000) + this.getHighSpeedVideoFpsRangesFor;
    }

    @Override // java.lang.Comparable
    public final int compareTo(org.threeten.bp.LocalTime localTime) {
        int compareInts = org.threeten.bp.jdk8.Jdk8Methods.compareInts(this.Camera2StreamConfigurationMap, localTime.Camera2StreamConfigurationMap);
        return (compareInts == 0 && (compareInts = org.threeten.bp.jdk8.Jdk8Methods.compareInts(this.getHighSpeedVideoFpsRanges, localTime.getHighSpeedVideoFpsRanges)) == 0 && (compareInts = org.threeten.bp.jdk8.Jdk8Methods.compareInts(this.getHighResolutionOutputSizeshNQ4ISI, localTime.getHighResolutionOutputSizeshNQ4ISI)) == 0) ? org.threeten.bp.jdk8.Jdk8Methods.compareInts(this.getHighSpeedVideoFpsRangesFor, localTime.getHighSpeedVideoFpsRangesFor) : compareInts;
    }

    public final boolean isAfter(org.threeten.bp.LocalTime localTime) {
        return compareTo(localTime) > 0;
    }

    public final boolean isBefore(org.threeten.bp.LocalTime localTime) {
        return compareTo(localTime) < 0;
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof org.threeten.bp.LocalTime)) {
            return false;
        }
        org.threeten.bp.LocalTime localTime = (org.threeten.bp.LocalTime) obj;
        return this.Camera2StreamConfigurationMap == localTime.Camera2StreamConfigurationMap && this.getHighSpeedVideoFpsRanges == localTime.getHighSpeedVideoFpsRanges && this.getHighResolutionOutputSizeshNQ4ISI == localTime.getHighResolutionOutputSizeshNQ4ISI && this.getHighSpeedVideoFpsRangesFor == localTime.getHighSpeedVideoFpsRangesFor;
    }

    public final int hashCode() {
        long nanoOfDay = toNanoOfDay();
        return (int) (nanoOfDay ^ (nanoOfDay >>> 32));
    }

    public final java.lang.String toString() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder(18);
        byte b = this.Camera2StreamConfigurationMap;
        byte b2 = this.getHighSpeedVideoFpsRanges;
        byte b3 = this.getHighResolutionOutputSizeshNQ4ISI;
        int i = this.getHighSpeedVideoFpsRangesFor;
        sb.append(b < 10 ? "0" : "");
        sb.append((int) b);
        java.lang.String str = io.ktor.sse.ServerSentEventKt.COLON;
        sb.append(b2 < 10 ? ":0" : io.ktor.sse.ServerSentEventKt.COLON);
        sb.append((int) b2);
        if (b3 > 0 || i > 0) {
            if (b3 < 10) {
                str = ":0";
            }
            sb.append(str);
            sb.append((int) b3);
            if (i > 0) {
                sb.append(com.paypal.oslo.core.money.MoneyKt.DECIMALSEPARATOR);
                if (i % 1000000 == 0) {
                    sb.append(java.lang.Integer.toString((i / 1000000) + 1000).substring(1));
                } else if (i % 1000 == 0) {
                    sb.append(java.lang.Integer.toString((i / 1000) + 1000000).substring(1));
                } else {
                    sb.append(java.lang.Integer.toString(i + 1000000000).substring(1));
                }
            }
        }
        return sb.toString();
    }

    public final java.lang.String format(org.threeten.bp.format.DateTimeFormatter dateTimeFormatter) {
        org.threeten.bp.jdk8.Jdk8Methods.requireNonNull(dateTimeFormatter, "formatter");
        return dateTimeFormatter.format(this);
    }

    private java.lang.Object writeReplace() {
        return new org.threeten.bp.Ser((byte) 5, this);
    }

    private java.lang.Object readResolve() throws java.io.ObjectStreamException {
        throw new java.io.InvalidObjectException("Deserialization via serialization delegate");
    }

    final void Camera2StreamConfigurationMap(java.io.DataOutput dataOutput) throws java.io.IOException {
        if (this.getHighSpeedVideoFpsRangesFor == 0) {
            if (this.getHighResolutionOutputSizeshNQ4ISI == 0) {
                if (this.getHighSpeedVideoFpsRanges == 0) {
                    dataOutput.writeByte(~this.Camera2StreamConfigurationMap);
                    return;
                } else {
                    dataOutput.writeByte(this.Camera2StreamConfigurationMap);
                    dataOutput.writeByte(~this.getHighSpeedVideoFpsRanges);
                    return;
                }
            }
            dataOutput.writeByte(this.Camera2StreamConfigurationMap);
            dataOutput.writeByte(this.getHighSpeedVideoFpsRanges);
            dataOutput.writeByte(~this.getHighResolutionOutputSizeshNQ4ISI);
            return;
        }
        dataOutput.writeByte(this.Camera2StreamConfigurationMap);
        dataOutput.writeByte(this.getHighSpeedVideoFpsRanges);
        dataOutput.writeByte(this.getHighResolutionOutputSizeshNQ4ISI);
        dataOutput.writeInt(this.getHighSpeedVideoFpsRangesFor);
    }

    static org.threeten.bp.LocalTime getHighSpeedVideoFpsRangesFor(java.io.DataInput dataInput) throws java.io.IOException {
        int i;
        int i2;
        int readByte = dataInput.readByte();
        int i3 = 0;
        if (readByte < 0) {
            readByte = ~readByte;
            i = 0;
            i2 = 0;
        } else {
            byte readByte2 = dataInput.readByte();
            if (readByte2 < 0) {
                int i4 = ~readByte2;
                i2 = 0;
                i3 = i4;
                i = 0;
            } else {
                byte readByte3 = dataInput.readByte();
                if (readByte3 < 0) {
                    i = ~readByte3;
                } else {
                    i3 = dataInput.readInt();
                    i = readByte3;
                }
                i2 = i3;
                i3 = readByte2;
            }
        }
        return of(readByte, i3, i, i2);
    }
}
