package org.threeten.bp;

/* loaded from: classes18.dex */
public enum Month implements org.threeten.bp.temporal.TemporalAccessor, org.threeten.bp.temporal.TemporalAdjuster {
    JANUARY,
    FEBRUARY,
    MARCH,
    APRIL,
    MAY,
    JUNE,
    JULY,
    AUGUST,
    SEPTEMBER,
    OCTOBER,
    NOVEMBER,
    DECEMBER;

    public static final org.threeten.bp.temporal.TemporalQuery<org.threeten.bp.Month> FROM = new org.threeten.bp.temporal.TemporalQuery<org.threeten.bp.Month>() { // from class: org.threeten.bp.Month.1
        @Override // org.threeten.bp.temporal.TemporalQuery
        public /* synthetic */ org.threeten.bp.Month queryFrom(org.threeten.bp.temporal.TemporalAccessor temporalAccessor) {
            return org.threeten.bp.Month.from(temporalAccessor);
        }
    };
    private static final org.threeten.bp.Month[] getHighSpeedVideoFpsRangesFor = values();

    public static org.threeten.bp.Month of(int i) {
        if (i <= 0 || i > 12) {
            throw new org.threeten.bp.DateTimeException("Invalid value for MonthOfYear: ".concat(java.lang.String.valueOf(i)));
        }
        return getHighSpeedVideoFpsRangesFor[i - 1];
    }

    public static org.threeten.bp.Month from(org.threeten.bp.temporal.TemporalAccessor temporalAccessor) {
        if (temporalAccessor instanceof org.threeten.bp.Month) {
            return (org.threeten.bp.Month) temporalAccessor;
        }
        try {
            if (!org.threeten.bp.chrono.IsoChronology.INSTANCE.equals(org.threeten.bp.chrono.Chronology.from(temporalAccessor))) {
                temporalAccessor = org.threeten.bp.LocalDate.from(temporalAccessor);
            }
            return of(temporalAccessor.get(org.threeten.bp.temporal.ChronoField.MONTH_OF_YEAR));
        } catch (org.threeten.bp.DateTimeException e) {
            java.lang.StringBuilder sb = new java.lang.StringBuilder("Unable to obtain Month from TemporalAccessor: ");
            sb.append(temporalAccessor);
            sb.append(", type ");
            sb.append(temporalAccessor.getClass().getName());
            throw new org.threeten.bp.DateTimeException(sb.toString(), e);
        }
    }

    public final int getValue() {
        return ordinal() + 1;
    }

    public final java.lang.String getDisplayName(org.threeten.bp.format.TextStyle textStyle, java.util.Locale locale) {
        return new org.threeten.bp.format.DateTimeFormatterBuilder().appendText(org.threeten.bp.temporal.ChronoField.MONTH_OF_YEAR, textStyle).toFormatter(locale).format(this);
    }

    @Override // org.threeten.bp.temporal.TemporalAccessor
    public final boolean isSupported(org.threeten.bp.temporal.TemporalField temporalField) {
        return temporalField instanceof org.threeten.bp.temporal.ChronoField ? temporalField == org.threeten.bp.temporal.ChronoField.MONTH_OF_YEAR : temporalField != null && temporalField.isSupportedBy(this);
    }

    @Override // org.threeten.bp.temporal.TemporalAccessor
    public final org.threeten.bp.temporal.ValueRange range(org.threeten.bp.temporal.TemporalField temporalField) {
        if (temporalField == org.threeten.bp.temporal.ChronoField.MONTH_OF_YEAR) {
            return temporalField.range();
        }
        if (temporalField instanceof org.threeten.bp.temporal.ChronoField) {
            throw new org.threeten.bp.temporal.UnsupportedTemporalTypeException("Unsupported field: ".concat(java.lang.String.valueOf(temporalField)));
        }
        return temporalField.rangeRefinedBy(this);
    }

    @Override // org.threeten.bp.temporal.TemporalAccessor
    public final int get(org.threeten.bp.temporal.TemporalField temporalField) {
        if (temporalField == org.threeten.bp.temporal.ChronoField.MONTH_OF_YEAR) {
            return getValue();
        }
        return range(temporalField).checkValidIntValue(getLong(temporalField), temporalField);
    }

    @Override // org.threeten.bp.temporal.TemporalAccessor
    public final long getLong(org.threeten.bp.temporal.TemporalField temporalField) {
        if (temporalField == org.threeten.bp.temporal.ChronoField.MONTH_OF_YEAR) {
            return getValue();
        }
        if (temporalField instanceof org.threeten.bp.temporal.ChronoField) {
            throw new org.threeten.bp.temporal.UnsupportedTemporalTypeException("Unsupported field: ".concat(java.lang.String.valueOf(temporalField)));
        }
        return temporalField.getFrom(this);
    }

    public final org.threeten.bp.Month plus(long j) {
        return getHighSpeedVideoFpsRangesFor[(ordinal() + (((int) (j % 12)) + 12)) % 12];
    }

    public final org.threeten.bp.Month minus(long j) {
        return plus(-(j % 12));
    }

    /* renamed from: org.threeten.bp.Month$2, reason: invalid class name */
    static /* synthetic */ class AnonymousClass2 {
        static final /* synthetic */ int[] getHighSpeedVideoFpsRanges;

        static {
            int[] iArr = new int[org.threeten.bp.Month.values().length];
            getHighSpeedVideoFpsRanges = iArr;
            try {
                iArr[org.threeten.bp.Month.FEBRUARY.ordinal()] = 1;
            } catch (java.lang.NoSuchFieldError unused) {
            }
            try {
                getHighSpeedVideoFpsRanges[org.threeten.bp.Month.APRIL.ordinal()] = 2;
            } catch (java.lang.NoSuchFieldError unused2) {
            }
            try {
                getHighSpeedVideoFpsRanges[org.threeten.bp.Month.JUNE.ordinal()] = 3;
            } catch (java.lang.NoSuchFieldError unused3) {
            }
            try {
                getHighSpeedVideoFpsRanges[org.threeten.bp.Month.SEPTEMBER.ordinal()] = 4;
            } catch (java.lang.NoSuchFieldError unused4) {
            }
            try {
                getHighSpeedVideoFpsRanges[org.threeten.bp.Month.NOVEMBER.ordinal()] = 5;
            } catch (java.lang.NoSuchFieldError unused5) {
            }
            try {
                getHighSpeedVideoFpsRanges[org.threeten.bp.Month.JANUARY.ordinal()] = 6;
            } catch (java.lang.NoSuchFieldError unused6) {
            }
            try {
                getHighSpeedVideoFpsRanges[org.threeten.bp.Month.MARCH.ordinal()] = 7;
            } catch (java.lang.NoSuchFieldError unused7) {
            }
            try {
                getHighSpeedVideoFpsRanges[org.threeten.bp.Month.MAY.ordinal()] = 8;
            } catch (java.lang.NoSuchFieldError unused8) {
            }
            try {
                getHighSpeedVideoFpsRanges[org.threeten.bp.Month.JULY.ordinal()] = 9;
            } catch (java.lang.NoSuchFieldError unused9) {
            }
            try {
                getHighSpeedVideoFpsRanges[org.threeten.bp.Month.AUGUST.ordinal()] = 10;
            } catch (java.lang.NoSuchFieldError unused10) {
            }
            try {
                getHighSpeedVideoFpsRanges[org.threeten.bp.Month.OCTOBER.ordinal()] = 11;
            } catch (java.lang.NoSuchFieldError unused11) {
            }
            try {
                getHighSpeedVideoFpsRanges[org.threeten.bp.Month.DECEMBER.ordinal()] = 12;
            } catch (java.lang.NoSuchFieldError unused12) {
            }
        }
    }

    public final int length(boolean z) {
        int i = org.threeten.bp.Month.AnonymousClass2.getHighSpeedVideoFpsRanges[ordinal()];
        return i != 1 ? (i == 2 || i == 3 || i == 4 || i == 5) ? 30 : 31 : z ? 29 : 28;
    }

    public final int minLength() {
        int i = org.threeten.bp.Month.AnonymousClass2.getHighSpeedVideoFpsRanges[ordinal()];
        if (i != 1) {
            return (i == 2 || i == 3 || i == 4 || i == 5) ? 30 : 31;
        }
        return 28;
    }

    public final int maxLength() {
        int i = org.threeten.bp.Month.AnonymousClass2.getHighSpeedVideoFpsRanges[ordinal()];
        if (i != 1) {
            return (i == 2 || i == 3 || i == 4 || i == 5) ? 30 : 31;
        }
        return 29;
    }

    public final int firstDayOfYear(boolean z) {
        switch (org.threeten.bp.Month.AnonymousClass2.getHighSpeedVideoFpsRanges[ordinal()]) {
            case 1:
                return 32;
            case 2:
                return (z ? 1 : 0) + 91;
            case 3:
                return (z ? 1 : 0) + 152;
            case 4:
                return (z ? 1 : 0) + com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_PLAID_OVERLAY_BALANCE_BEAM_01_VALUE;
            case 5:
                return (z ? 1 : 0) + 305;
            case 6:
                return 1;
            case 7:
                return (z ? 1 : 0) + 60;
            case 8:
                return (z ? 1 : 0) + 121;
            case 9:
                return (z ? 1 : 0) + com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_PINWHEEL_LOGO_VALUE;
            case 10:
                return (z ? 1 : 0) + com.plaid.internal.EnumC0527g.SDK_ASSET_ICON_PAUSE_VALUE;
            case 11:
                return (z ? 1 : 0) + com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_SUCCESS_BRUSHSTROKE_VALUE;
            default:
                return (z ? 1 : 0) + com.visa.cbp.getCertUsage.setAppPrgrmID;
        }
    }

    public final org.threeten.bp.Month firstMonthOfQuarter() {
        return getHighSpeedVideoFpsRangesFor[(ordinal() / 3) * 3];
    }

    @Override // org.threeten.bp.temporal.TemporalAccessor
    public final <R> R query(org.threeten.bp.temporal.TemporalQuery<R> temporalQuery) {
        if (temporalQuery == org.threeten.bp.temporal.TemporalQueries.chronology()) {
            return (R) org.threeten.bp.chrono.IsoChronology.INSTANCE;
        }
        if (temporalQuery == org.threeten.bp.temporal.TemporalQueries.precision()) {
            return (R) org.threeten.bp.temporal.ChronoUnit.MONTHS;
        }
        if (temporalQuery == org.threeten.bp.temporal.TemporalQueries.localDate() || temporalQuery == org.threeten.bp.temporal.TemporalQueries.localTime() || temporalQuery == org.threeten.bp.temporal.TemporalQueries.zone() || temporalQuery == org.threeten.bp.temporal.TemporalQueries.zoneId() || temporalQuery == org.threeten.bp.temporal.TemporalQueries.offset()) {
            return null;
        }
        return temporalQuery.queryFrom(this);
    }

    @Override // org.threeten.bp.temporal.TemporalAdjuster
    public final org.threeten.bp.temporal.Temporal adjustInto(org.threeten.bp.temporal.Temporal temporal) {
        if (!org.threeten.bp.chrono.Chronology.from(temporal).equals(org.threeten.bp.chrono.IsoChronology.INSTANCE)) {
            throw new org.threeten.bp.DateTimeException("Adjustment only supported on ISO date-time");
        }
        return temporal.with(org.threeten.bp.temporal.ChronoField.MONTH_OF_YEAR, getValue());
    }
}
