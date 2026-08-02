package org.threeten.bp.chrono;

/* loaded from: classes18.dex */
abstract class ChronoDateImpl<D extends org.threeten.bp.chrono.ChronoLocalDate> extends org.threeten.bp.chrono.ChronoLocalDate implements org.threeten.bp.temporal.Temporal, org.threeten.bp.temporal.TemporalAdjuster, java.io.Serializable {
    private static final long serialVersionUID = 6282433883239719096L;

    abstract org.threeten.bp.chrono.ChronoDateImpl<D> Camera2StreamConfigurationMap(long j);

    abstract org.threeten.bp.chrono.ChronoDateImpl<D> getHighSpeedVideoFpsRanges(long j);

    abstract org.threeten.bp.chrono.ChronoDateImpl<D> getHighSpeedVideoFpsRangesFor(long j);

    ChronoDateImpl() {
    }

    @Override // org.threeten.bp.chrono.ChronoLocalDate, org.threeten.bp.temporal.Temporal
    public org.threeten.bp.chrono.ChronoDateImpl<D> plus(long j, org.threeten.bp.temporal.TemporalUnit temporalUnit) {
        if (temporalUnit instanceof org.threeten.bp.temporal.ChronoUnit) {
            switch (org.threeten.bp.chrono.ChronoDateImpl.AnonymousClass1.Camera2StreamConfigurationMap[((org.threeten.bp.temporal.ChronoUnit) temporalUnit).ordinal()]) {
                case 1:
                    return Camera2StreamConfigurationMap(j);
                case 2:
                    return Camera2StreamConfigurationMap(org.threeten.bp.jdk8.Jdk8Methods.safeMultiply(j, 7));
                case 3:
                    return getHighSpeedVideoFpsRangesFor(j);
                case 4:
                    return getHighSpeedVideoFpsRanges(j);
                case 5:
                    return getHighSpeedVideoFpsRanges(org.threeten.bp.jdk8.Jdk8Methods.safeMultiply(j, 10));
                case 6:
                    return getHighSpeedVideoFpsRanges(org.threeten.bp.jdk8.Jdk8Methods.safeMultiply(j, 100));
                case 7:
                    return getHighSpeedVideoFpsRanges(org.threeten.bp.jdk8.Jdk8Methods.safeMultiply(j, 1000));
                default:
                    java.lang.StringBuilder sb = new java.lang.StringBuilder();
                    sb.append(temporalUnit);
                    sb.append(" not valid for chronology ");
                    sb.append(getChronology().getId());
                    throw new org.threeten.bp.DateTimeException(sb.toString());
            }
        }
        return (org.threeten.bp.chrono.ChronoDateImpl) getChronology().getHighSpeedVideoFpsRangesFor(temporalUnit.addTo(this, j));
    }

    /* renamed from: org.threeten.bp.chrono.ChronoDateImpl$1, reason: invalid class name */
    static /* synthetic */ class AnonymousClass1 {
        static final /* synthetic */ int[] Camera2StreamConfigurationMap;

        static {
            int[] iArr = new int[org.threeten.bp.temporal.ChronoUnit.values().length];
            Camera2StreamConfigurationMap = iArr;
            try {
                iArr[org.threeten.bp.temporal.ChronoUnit.DAYS.ordinal()] = 1;
            } catch (java.lang.NoSuchFieldError unused) {
            }
            try {
                Camera2StreamConfigurationMap[org.threeten.bp.temporal.ChronoUnit.WEEKS.ordinal()] = 2;
            } catch (java.lang.NoSuchFieldError unused2) {
            }
            try {
                Camera2StreamConfigurationMap[org.threeten.bp.temporal.ChronoUnit.MONTHS.ordinal()] = 3;
            } catch (java.lang.NoSuchFieldError unused3) {
            }
            try {
                Camera2StreamConfigurationMap[org.threeten.bp.temporal.ChronoUnit.YEARS.ordinal()] = 4;
            } catch (java.lang.NoSuchFieldError unused4) {
            }
            try {
                Camera2StreamConfigurationMap[org.threeten.bp.temporal.ChronoUnit.DECADES.ordinal()] = 5;
            } catch (java.lang.NoSuchFieldError unused5) {
            }
            try {
                Camera2StreamConfigurationMap[org.threeten.bp.temporal.ChronoUnit.CENTURIES.ordinal()] = 6;
            } catch (java.lang.NoSuchFieldError unused6) {
            }
            try {
                Camera2StreamConfigurationMap[org.threeten.bp.temporal.ChronoUnit.MILLENNIA.ordinal()] = 7;
            } catch (java.lang.NoSuchFieldError unused7) {
            }
        }
    }

    @Override // org.threeten.bp.chrono.ChronoLocalDate
    public org.threeten.bp.chrono.ChronoLocalDateTime<?> atTime(org.threeten.bp.LocalTime localTime) {
        return org.threeten.bp.chrono.ChronoLocalDateTimeImpl.getHighSpeedVideoFpsRangesFor(this, localTime);
    }

    @Override // org.threeten.bp.temporal.Temporal
    public long until(org.threeten.bp.temporal.Temporal temporal, org.threeten.bp.temporal.TemporalUnit temporalUnit) {
        org.threeten.bp.chrono.ChronoLocalDate date = getChronology().date(temporal);
        if (temporalUnit instanceof org.threeten.bp.temporal.ChronoUnit) {
            return org.threeten.bp.LocalDate.from((org.threeten.bp.temporal.TemporalAccessor) this).until(date, temporalUnit);
        }
        return temporalUnit.between(this, date);
    }

    @Override // org.threeten.bp.chrono.ChronoLocalDate
    public org.threeten.bp.chrono.ChronoPeriod until(org.threeten.bp.chrono.ChronoLocalDate chronoLocalDate) {
        throw new java.lang.UnsupportedOperationException("Not supported in ThreeTen backport");
    }
}
