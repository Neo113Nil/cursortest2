package org.threeten.bp;

/* loaded from: classes18.dex */
public final class MonthDay extends org.threeten.bp.jdk8.DefaultInterfaceTemporalAccessor implements org.threeten.bp.temporal.TemporalAccessor, org.threeten.bp.temporal.TemporalAdjuster, java.lang.Comparable<org.threeten.bp.MonthDay>, java.io.Serializable {
    public static final org.threeten.bp.temporal.TemporalQuery<org.threeten.bp.MonthDay> FROM = new org.threeten.bp.temporal.TemporalQuery<org.threeten.bp.MonthDay>() { // from class: org.threeten.bp.MonthDay.1
        @Override // org.threeten.bp.temporal.TemporalQuery
        public /* synthetic */ org.threeten.bp.MonthDay queryFrom(org.threeten.bp.temporal.TemporalAccessor temporalAccessor) {
            return org.threeten.bp.MonthDay.from(temporalAccessor);
        }
    };
    private static final org.threeten.bp.format.DateTimeFormatter getHighSpeedVideoFpsRangesFor = new org.threeten.bp.format.DateTimeFormatterBuilder().appendLiteral("--").appendValue(org.threeten.bp.temporal.ChronoField.MONTH_OF_YEAR, 2).appendLiteral('-').appendValue(org.threeten.bp.temporal.ChronoField.DAY_OF_MONTH, 2).toFormatter();
    private static final long serialVersionUID = -939150713474957432L;
    final int Camera2StreamConfigurationMap;
    final int getHighSpeedVideoSizes;

    public static org.threeten.bp.MonthDay now() {
        return now(org.threeten.bp.Clock.systemDefaultZone());
    }

    public static org.threeten.bp.MonthDay now(org.threeten.bp.ZoneId zoneId) {
        return now(org.threeten.bp.Clock.system(zoneId));
    }

    public static org.threeten.bp.MonthDay now(org.threeten.bp.Clock clock) {
        org.threeten.bp.LocalDate now = org.threeten.bp.LocalDate.now(clock);
        return of(now.getMonth(), now.getDayOfMonth());
    }

    public static org.threeten.bp.MonthDay of(org.threeten.bp.Month month, int i) {
        org.threeten.bp.jdk8.Jdk8Methods.requireNonNull(month, "month");
        org.threeten.bp.temporal.ChronoField.DAY_OF_MONTH.checkValidValue(i);
        if (i > month.maxLength()) {
            java.lang.StringBuilder sb = new java.lang.StringBuilder("Illegal value for DayOfMonth field, value ");
            sb.append(i);
            sb.append(" is not valid for month ");
            sb.append(month.name());
            throw new org.threeten.bp.DateTimeException(sb.toString());
        }
        return new org.threeten.bp.MonthDay(month.getValue(), i);
    }

    public static org.threeten.bp.MonthDay of(int i, int i2) {
        return of(org.threeten.bp.Month.of(i), i2);
    }

    public static org.threeten.bp.MonthDay from(org.threeten.bp.temporal.TemporalAccessor temporalAccessor) {
        if (temporalAccessor instanceof org.threeten.bp.MonthDay) {
            return (org.threeten.bp.MonthDay) temporalAccessor;
        }
        try {
            if (!org.threeten.bp.chrono.IsoChronology.INSTANCE.equals(org.threeten.bp.chrono.Chronology.from(temporalAccessor))) {
                temporalAccessor = org.threeten.bp.LocalDate.from(temporalAccessor);
            }
            return of(temporalAccessor.get(org.threeten.bp.temporal.ChronoField.MONTH_OF_YEAR), temporalAccessor.get(org.threeten.bp.temporal.ChronoField.DAY_OF_MONTH));
        } catch (org.threeten.bp.DateTimeException unused) {
            java.lang.StringBuilder sb = new java.lang.StringBuilder("Unable to obtain MonthDay from TemporalAccessor: ");
            sb.append(temporalAccessor);
            sb.append(", type ");
            sb.append(temporalAccessor.getClass().getName());
            throw new org.threeten.bp.DateTimeException(sb.toString());
        }
    }

    public static org.threeten.bp.MonthDay parse(java.lang.CharSequence charSequence) {
        return parse(charSequence, getHighSpeedVideoFpsRangesFor);
    }

    public static org.threeten.bp.MonthDay parse(java.lang.CharSequence charSequence, org.threeten.bp.format.DateTimeFormatter dateTimeFormatter) {
        org.threeten.bp.jdk8.Jdk8Methods.requireNonNull(dateTimeFormatter, "formatter");
        return (org.threeten.bp.MonthDay) dateTimeFormatter.parse(charSequence, FROM);
    }

    private MonthDay(int i, int i2) {
        this.Camera2StreamConfigurationMap = i;
        this.getHighSpeedVideoSizes = i2;
    }

    @Override // org.threeten.bp.temporal.TemporalAccessor
    public final boolean isSupported(org.threeten.bp.temporal.TemporalField temporalField) {
        return temporalField instanceof org.threeten.bp.temporal.ChronoField ? temporalField == org.threeten.bp.temporal.ChronoField.MONTH_OF_YEAR || temporalField == org.threeten.bp.temporal.ChronoField.DAY_OF_MONTH : temporalField != null && temporalField.isSupportedBy(this);
    }

    @Override // org.threeten.bp.jdk8.DefaultInterfaceTemporalAccessor, org.threeten.bp.temporal.TemporalAccessor
    public final org.threeten.bp.temporal.ValueRange range(org.threeten.bp.temporal.TemporalField temporalField) {
        if (temporalField == org.threeten.bp.temporal.ChronoField.MONTH_OF_YEAR) {
            return temporalField.range();
        }
        if (temporalField == org.threeten.bp.temporal.ChronoField.DAY_OF_MONTH) {
            return org.threeten.bp.temporal.ValueRange.of(1L, getMonth().minLength(), getMonth().maxLength());
        }
        return super.range(temporalField);
    }

    @Override // org.threeten.bp.jdk8.DefaultInterfaceTemporalAccessor, org.threeten.bp.temporal.TemporalAccessor
    public final int get(org.threeten.bp.temporal.TemporalField temporalField) {
        return range(temporalField).checkValidIntValue(getLong(temporalField), temporalField);
    }

    /* renamed from: org.threeten.bp.MonthDay$2, reason: invalid class name */
    static /* synthetic */ class AnonymousClass2 {
        static final /* synthetic */ int[] getHighSpeedVideoSizes;

        static {
            int[] iArr = new int[org.threeten.bp.temporal.ChronoField.values().length];
            getHighSpeedVideoSizes = iArr;
            try {
                iArr[org.threeten.bp.temporal.ChronoField.DAY_OF_MONTH.ordinal()] = 1;
            } catch (java.lang.NoSuchFieldError unused) {
            }
            try {
                getHighSpeedVideoSizes[org.threeten.bp.temporal.ChronoField.MONTH_OF_YEAR.ordinal()] = 2;
            } catch (java.lang.NoSuchFieldError unused2) {
            }
        }
    }

    @Override // org.threeten.bp.temporal.TemporalAccessor
    public final long getLong(org.threeten.bp.temporal.TemporalField temporalField) {
        int i;
        if (temporalField instanceof org.threeten.bp.temporal.ChronoField) {
            int i2 = org.threeten.bp.MonthDay.AnonymousClass2.getHighSpeedVideoSizes[((org.threeten.bp.temporal.ChronoField) temporalField).ordinal()];
            if (i2 == 1) {
                i = this.getHighSpeedVideoSizes;
            } else if (i2 == 2) {
                i = this.Camera2StreamConfigurationMap;
            } else {
                throw new org.threeten.bp.temporal.UnsupportedTemporalTypeException("Unsupported field: ".concat(java.lang.String.valueOf(temporalField)));
            }
            return i;
        }
        return temporalField.getFrom(this);
    }

    public final int getMonthValue() {
        return this.Camera2StreamConfigurationMap;
    }

    public final org.threeten.bp.Month getMonth() {
        return org.threeten.bp.Month.of(this.Camera2StreamConfigurationMap);
    }

    public final int getDayOfMonth() {
        return this.getHighSpeedVideoSizes;
    }

    public final boolean isValidYear(int i) {
        return !(this.getHighSpeedVideoSizes == 29 && this.Camera2StreamConfigurationMap == 2 && !org.threeten.bp.Year.isLeap((long) i));
    }

    public final org.threeten.bp.MonthDay withMonth(int i) {
        return with(org.threeten.bp.Month.of(i));
    }

    public final org.threeten.bp.MonthDay with(org.threeten.bp.Month month) {
        org.threeten.bp.jdk8.Jdk8Methods.requireNonNull(month, "month");
        if (month.getValue() == this.Camera2StreamConfigurationMap) {
            return this;
        }
        return new org.threeten.bp.MonthDay(month.getValue(), java.lang.Math.min(this.getHighSpeedVideoSizes, month.maxLength()));
    }

    public final org.threeten.bp.MonthDay withDayOfMonth(int i) {
        return i == this.getHighSpeedVideoSizes ? this : of(this.Camera2StreamConfigurationMap, i);
    }

    @Override // org.threeten.bp.jdk8.DefaultInterfaceTemporalAccessor, org.threeten.bp.temporal.TemporalAccessor
    public final <R> R query(org.threeten.bp.temporal.TemporalQuery<R> temporalQuery) {
        if (temporalQuery == org.threeten.bp.temporal.TemporalQueries.chronology()) {
            return (R) org.threeten.bp.chrono.IsoChronology.INSTANCE;
        }
        return (R) super.query(temporalQuery);
    }

    @Override // org.threeten.bp.temporal.TemporalAdjuster
    public final org.threeten.bp.temporal.Temporal adjustInto(org.threeten.bp.temporal.Temporal temporal) {
        if (!org.threeten.bp.chrono.Chronology.from(temporal).equals(org.threeten.bp.chrono.IsoChronology.INSTANCE)) {
            throw new org.threeten.bp.DateTimeException("Adjustment only supported on ISO date-time");
        }
        org.threeten.bp.temporal.Temporal with = temporal.with(org.threeten.bp.temporal.ChronoField.MONTH_OF_YEAR, this.Camera2StreamConfigurationMap);
        return with.with(org.threeten.bp.temporal.ChronoField.DAY_OF_MONTH, java.lang.Math.min(with.range(org.threeten.bp.temporal.ChronoField.DAY_OF_MONTH).getMaximum(), this.getHighSpeedVideoSizes));
    }

    public final org.threeten.bp.LocalDate atYear(int i) {
        return org.threeten.bp.LocalDate.of(i, this.Camera2StreamConfigurationMap, isValidYear(i) ? this.getHighSpeedVideoSizes : 28);
    }

    @Override // java.lang.Comparable
    public final int compareTo(org.threeten.bp.MonthDay monthDay) {
        int i = this.Camera2StreamConfigurationMap - monthDay.Camera2StreamConfigurationMap;
        return i == 0 ? this.getHighSpeedVideoSizes - monthDay.getHighSpeedVideoSizes : i;
    }

    public final boolean isAfter(org.threeten.bp.MonthDay monthDay) {
        return compareTo(monthDay) > 0;
    }

    public final boolean isBefore(org.threeten.bp.MonthDay monthDay) {
        return compareTo(monthDay) < 0;
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof org.threeten.bp.MonthDay)) {
            return false;
        }
        org.threeten.bp.MonthDay monthDay = (org.threeten.bp.MonthDay) obj;
        return this.Camera2StreamConfigurationMap == monthDay.Camera2StreamConfigurationMap && this.getHighSpeedVideoSizes == monthDay.getHighSpeedVideoSizes;
    }

    public final int hashCode() {
        return (this.Camera2StreamConfigurationMap << 6) + this.getHighSpeedVideoSizes;
    }

    public final java.lang.String toString() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder(10);
        sb.append("--");
        sb.append(this.Camera2StreamConfigurationMap < 10 ? "0" : "");
        sb.append(this.Camera2StreamConfigurationMap);
        sb.append(this.getHighSpeedVideoSizes < 10 ? "-0" : "-");
        sb.append(this.getHighSpeedVideoSizes);
        return sb.toString();
    }

    public final java.lang.String format(org.threeten.bp.format.DateTimeFormatter dateTimeFormatter) {
        org.threeten.bp.jdk8.Jdk8Methods.requireNonNull(dateTimeFormatter, "formatter");
        return dateTimeFormatter.format(this);
    }

    private java.lang.Object writeReplace() {
        return new org.threeten.bp.Ser((byte) 64, this);
    }

    private java.lang.Object readResolve() throws java.io.ObjectStreamException {
        throw new java.io.InvalidObjectException("Deserialization via serialization delegate");
    }

    static org.threeten.bp.MonthDay getHighSpeedVideoSizes(java.io.DataInput dataInput) throws java.io.IOException {
        return of(dataInput.readByte(), dataInput.readByte());
    }
}
