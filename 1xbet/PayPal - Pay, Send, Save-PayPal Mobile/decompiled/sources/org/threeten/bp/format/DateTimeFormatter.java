package org.threeten.bp.format;

/* loaded from: classes18.dex */
public final class DateTimeFormatter {
    public static final org.threeten.bp.format.DateTimeFormatter BASIC_ISO_DATE;
    public static final org.threeten.bp.format.DateTimeFormatter ISO_DATE;
    public static final org.threeten.bp.format.DateTimeFormatter ISO_DATE_TIME;
    public static final org.threeten.bp.format.DateTimeFormatter ISO_INSTANT;
    public static final org.threeten.bp.format.DateTimeFormatter ISO_LOCAL_DATE;
    public static final org.threeten.bp.format.DateTimeFormatter ISO_LOCAL_DATE_TIME;
    public static final org.threeten.bp.format.DateTimeFormatter ISO_LOCAL_TIME;
    public static final org.threeten.bp.format.DateTimeFormatter ISO_OFFSET_DATE;
    public static final org.threeten.bp.format.DateTimeFormatter ISO_OFFSET_DATE_TIME;
    public static final org.threeten.bp.format.DateTimeFormatter ISO_OFFSET_TIME;
    public static final org.threeten.bp.format.DateTimeFormatter ISO_ORDINAL_DATE;
    public static final org.threeten.bp.format.DateTimeFormatter ISO_TIME;
    public static final org.threeten.bp.format.DateTimeFormatter ISO_WEEK_DATE;
    public static final org.threeten.bp.format.DateTimeFormatter ISO_ZONED_DATE_TIME;
    public static final org.threeten.bp.format.DateTimeFormatter RFC_1123_DATE_TIME;
    private static final org.threeten.bp.temporal.TemporalQuery<org.threeten.bp.Period> getHighResolutionOutputSizeshNQ4ISI;
    private static final org.threeten.bp.temporal.TemporalQuery<java.lang.Boolean> getHighSpeedVideoSizes;
    private final org.threeten.bp.format.DecimalStyle Camera2StreamConfigurationMap;
    private final org.threeten.bp.chrono.Chronology getHighSpeedVideoFpsRanges;
    final org.threeten.bp.format.DateTimeFormatterBuilder.CompositePrinterParser getHighSpeedVideoFpsRangesFor;
    private final java.util.Locale getHighSpeedVideoSizesFor;
    private final org.threeten.bp.format.ResolverStyle getInputFormats;
    private final java.util.Set<org.threeten.bp.temporal.TemporalField> getInputSizeshNQ4ISI;
    private final org.threeten.bp.ZoneId getOutputFormats;

    static /* synthetic */ org.threeten.bp.format.DateTimeBuilder getHighSpeedVideoFpsRangesFor(org.threeten.bp.format.DateTimeFormatter dateTimeFormatter, java.lang.CharSequence charSequence) {
        return dateTimeFormatter.getHighResolutionOutputSizeshNQ4ISI(charSequence, null);
    }

    static {
        org.threeten.bp.format.DateTimeFormatterBuilder appendValue = new org.threeten.bp.format.DateTimeFormatterBuilder().appendValue(org.threeten.bp.temporal.ChronoField.YEAR, 4, 10, org.threeten.bp.format.SignStyle.EXCEEDS_PAD).appendLiteral('-').appendValue(org.threeten.bp.temporal.ChronoField.MONTH_OF_YEAR, 2).appendLiteral('-').appendValue(org.threeten.bp.temporal.ChronoField.DAY_OF_MONTH, 2);
        org.threeten.bp.format.DateTimeFormatter withChronology = appendValue.toFormatter().withResolverStyle(org.threeten.bp.format.ResolverStyle.STRICT).withChronology(org.threeten.bp.chrono.IsoChronology.INSTANCE);
        ISO_LOCAL_DATE = withChronology;
        org.threeten.bp.format.DateTimeFormatterBuilder appendOffsetId = new org.threeten.bp.format.DateTimeFormatterBuilder().parseCaseInsensitive().append(withChronology).appendOffsetId();
        ISO_OFFSET_DATE = appendOffsetId.toFormatter().withResolverStyle(org.threeten.bp.format.ResolverStyle.STRICT).withChronology(org.threeten.bp.chrono.IsoChronology.INSTANCE);
        org.threeten.bp.format.DateTimeFormatterBuilder appendOffsetId2 = new org.threeten.bp.format.DateTimeFormatterBuilder().parseCaseInsensitive().append(withChronology).optionalStart().appendOffsetId();
        ISO_DATE = appendOffsetId2.toFormatter().withResolverStyle(org.threeten.bp.format.ResolverStyle.STRICT).withChronology(org.threeten.bp.chrono.IsoChronology.INSTANCE);
        org.threeten.bp.format.DateTimeFormatterBuilder appendFraction = new org.threeten.bp.format.DateTimeFormatterBuilder().appendValue(org.threeten.bp.temporal.ChronoField.HOUR_OF_DAY, 2).appendLiteral(kotlinx.serialization.json.internal.AbstractJsonLexerKt.COLON).appendValue(org.threeten.bp.temporal.ChronoField.MINUTE_OF_HOUR, 2).optionalStart().appendLiteral(kotlinx.serialization.json.internal.AbstractJsonLexerKt.COLON).appendValue(org.threeten.bp.temporal.ChronoField.SECOND_OF_MINUTE, 2).optionalStart().appendFraction(org.threeten.bp.temporal.ChronoField.NANO_OF_SECOND, 0, 9, true);
        org.threeten.bp.format.DateTimeFormatter withResolverStyle = appendFraction.toFormatter().withResolverStyle(org.threeten.bp.format.ResolverStyle.STRICT);
        ISO_LOCAL_TIME = withResolverStyle;
        org.threeten.bp.format.DateTimeFormatterBuilder appendOffsetId3 = new org.threeten.bp.format.DateTimeFormatterBuilder().parseCaseInsensitive().append(withResolverStyle).appendOffsetId();
        ISO_OFFSET_TIME = appendOffsetId3.toFormatter().withResolverStyle(org.threeten.bp.format.ResolverStyle.STRICT);
        org.threeten.bp.format.DateTimeFormatterBuilder appendOffsetId4 = new org.threeten.bp.format.DateTimeFormatterBuilder().parseCaseInsensitive().append(withResolverStyle).optionalStart().appendOffsetId();
        ISO_TIME = appendOffsetId4.toFormatter().withResolverStyle(org.threeten.bp.format.ResolverStyle.STRICT);
        org.threeten.bp.format.DateTimeFormatterBuilder append = new org.threeten.bp.format.DateTimeFormatterBuilder().parseCaseInsensitive().append(withChronology).appendLiteral('T').append(withResolverStyle);
        org.threeten.bp.format.DateTimeFormatter withChronology2 = append.toFormatter().withResolverStyle(org.threeten.bp.format.ResolverStyle.STRICT).withChronology(org.threeten.bp.chrono.IsoChronology.INSTANCE);
        ISO_LOCAL_DATE_TIME = withChronology2;
        org.threeten.bp.format.DateTimeFormatterBuilder appendOffsetId5 = new org.threeten.bp.format.DateTimeFormatterBuilder().parseCaseInsensitive().append(withChronology2).appendOffsetId();
        org.threeten.bp.format.DateTimeFormatter withChronology3 = appendOffsetId5.toFormatter().withResolverStyle(org.threeten.bp.format.ResolverStyle.STRICT).withChronology(org.threeten.bp.chrono.IsoChronology.INSTANCE);
        ISO_OFFSET_DATE_TIME = withChronology3;
        org.threeten.bp.format.DateTimeFormatterBuilder appendLiteral = new org.threeten.bp.format.DateTimeFormatterBuilder().append(withChronology3).optionalStart().appendLiteral(kotlinx.serialization.json.internal.AbstractJsonLexerKt.BEGIN_LIST).parseCaseSensitive().appendZoneRegionId().appendLiteral(kotlinx.serialization.json.internal.AbstractJsonLexerKt.END_LIST);
        ISO_ZONED_DATE_TIME = appendLiteral.toFormatter().withResolverStyle(org.threeten.bp.format.ResolverStyle.STRICT).withChronology(org.threeten.bp.chrono.IsoChronology.INSTANCE);
        org.threeten.bp.format.DateTimeFormatterBuilder appendLiteral2 = new org.threeten.bp.format.DateTimeFormatterBuilder().append(withChronology2).optionalStart().appendOffsetId().optionalStart().appendLiteral(kotlinx.serialization.json.internal.AbstractJsonLexerKt.BEGIN_LIST).parseCaseSensitive().appendZoneRegionId().appendLiteral(kotlinx.serialization.json.internal.AbstractJsonLexerKt.END_LIST);
        ISO_DATE_TIME = appendLiteral2.toFormatter().withResolverStyle(org.threeten.bp.format.ResolverStyle.STRICT).withChronology(org.threeten.bp.chrono.IsoChronology.INSTANCE);
        org.threeten.bp.format.DateTimeFormatterBuilder appendOffsetId6 = new org.threeten.bp.format.DateTimeFormatterBuilder().parseCaseInsensitive().appendValue(org.threeten.bp.temporal.ChronoField.YEAR, 4, 10, org.threeten.bp.format.SignStyle.EXCEEDS_PAD).appendLiteral('-').appendValue(org.threeten.bp.temporal.ChronoField.DAY_OF_YEAR, 3).optionalStart().appendOffsetId();
        ISO_ORDINAL_DATE = appendOffsetId6.toFormatter().withResolverStyle(org.threeten.bp.format.ResolverStyle.STRICT).withChronology(org.threeten.bp.chrono.IsoChronology.INSTANCE);
        org.threeten.bp.format.DateTimeFormatterBuilder appendOffsetId7 = new org.threeten.bp.format.DateTimeFormatterBuilder().parseCaseInsensitive().appendValue(org.threeten.bp.temporal.IsoFields.WEEK_BASED_YEAR, 4, 10, org.threeten.bp.format.SignStyle.EXCEEDS_PAD).appendLiteral("-W").appendValue(org.threeten.bp.temporal.IsoFields.WEEK_OF_WEEK_BASED_YEAR, 2).appendLiteral('-').appendValue(org.threeten.bp.temporal.ChronoField.DAY_OF_WEEK, 1).optionalStart().appendOffsetId();
        ISO_WEEK_DATE = appendOffsetId7.toFormatter().withResolverStyle(org.threeten.bp.format.ResolverStyle.STRICT).withChronology(org.threeten.bp.chrono.IsoChronology.INSTANCE);
        org.threeten.bp.format.DateTimeFormatterBuilder appendInstant = new org.threeten.bp.format.DateTimeFormatterBuilder().parseCaseInsensitive().appendInstant();
        ISO_INSTANT = appendInstant.toFormatter().withResolverStyle(org.threeten.bp.format.ResolverStyle.STRICT);
        org.threeten.bp.format.DateTimeFormatterBuilder appendOffset = new org.threeten.bp.format.DateTimeFormatterBuilder().parseCaseInsensitive().appendValue(org.threeten.bp.temporal.ChronoField.YEAR, 4).appendValue(org.threeten.bp.temporal.ChronoField.MONTH_OF_YEAR, 2).appendValue(org.threeten.bp.temporal.ChronoField.DAY_OF_MONTH, 2).optionalStart().appendOffset("+HHMMss", "Z");
        BASIC_ISO_DATE = appendOffset.toFormatter().withResolverStyle(org.threeten.bp.format.ResolverStyle.STRICT).withChronology(org.threeten.bp.chrono.IsoChronology.INSTANCE);
        java.util.HashMap hashMap = new java.util.HashMap();
        hashMap.put(1L, "Mon");
        hashMap.put(2L, "Tue");
        hashMap.put(3L, "Wed");
        hashMap.put(4L, "Thu");
        hashMap.put(5L, "Fri");
        hashMap.put(6L, "Sat");
        hashMap.put(7L, "Sun");
        java.util.HashMap hashMap2 = new java.util.HashMap();
        hashMap2.put(1L, "Jan");
        hashMap2.put(2L, "Feb");
        hashMap2.put(3L, "Mar");
        hashMap2.put(4L, "Apr");
        hashMap2.put(5L, "May");
        hashMap2.put(6L, "Jun");
        hashMap2.put(7L, "Jul");
        hashMap2.put(8L, "Aug");
        hashMap2.put(9L, "Sep");
        hashMap2.put(10L, "Oct");
        hashMap2.put(11L, "Nov");
        hashMap2.put(12L, "Dec");
        org.threeten.bp.format.DateTimeFormatterBuilder appendOffset2 = new org.threeten.bp.format.DateTimeFormatterBuilder().parseCaseInsensitive().parseLenient().optionalStart().appendText(org.threeten.bp.temporal.ChronoField.DAY_OF_WEEK, hashMap).appendLiteral(", ").optionalEnd().appendValue(org.threeten.bp.temporal.ChronoField.DAY_OF_MONTH, 1, 2, org.threeten.bp.format.SignStyle.NOT_NEGATIVE).appendLiteral(' ').appendText(org.threeten.bp.temporal.ChronoField.MONTH_OF_YEAR, hashMap2).appendLiteral(' ').appendValue(org.threeten.bp.temporal.ChronoField.YEAR, 4).appendLiteral(' ').appendValue(org.threeten.bp.temporal.ChronoField.HOUR_OF_DAY, 2).appendLiteral(kotlinx.serialization.json.internal.AbstractJsonLexerKt.COLON).appendValue(org.threeten.bp.temporal.ChronoField.MINUTE_OF_HOUR, 2).optionalStart().appendLiteral(kotlinx.serialization.json.internal.AbstractJsonLexerKt.COLON).appendValue(org.threeten.bp.temporal.ChronoField.SECOND_OF_MINUTE, 2).optionalEnd().appendLiteral(' ').appendOffset("+HHMM", "GMT");
        RFC_1123_DATE_TIME = appendOffset2.toFormatter().withResolverStyle(org.threeten.bp.format.ResolverStyle.SMART).withChronology(org.threeten.bp.chrono.IsoChronology.INSTANCE);
        getHighResolutionOutputSizeshNQ4ISI = new org.threeten.bp.temporal.TemporalQuery<org.threeten.bp.Period>() { // from class: org.threeten.bp.format.DateTimeFormatter.1
            @Override // org.threeten.bp.temporal.TemporalQuery
            public /* bridge */ /* synthetic */ org.threeten.bp.Period queryFrom(org.threeten.bp.temporal.TemporalAccessor temporalAccessor) {
                if (temporalAccessor instanceof org.threeten.bp.format.DateTimeBuilder) {
                    return ((org.threeten.bp.format.DateTimeBuilder) temporalAccessor).getHighSpeedVideoSizes;
                }
                return org.threeten.bp.Period.ZERO;
            }
        };
        getHighSpeedVideoSizes = new org.threeten.bp.temporal.TemporalQuery<java.lang.Boolean>() { // from class: org.threeten.bp.format.DateTimeFormatter.2
            @Override // org.threeten.bp.temporal.TemporalQuery
            public /* synthetic */ java.lang.Boolean queryFrom(org.threeten.bp.temporal.TemporalAccessor temporalAccessor) {
                if (temporalAccessor instanceof org.threeten.bp.format.DateTimeBuilder) {
                    return java.lang.Boolean.valueOf(((org.threeten.bp.format.DateTimeBuilder) temporalAccessor).getHighSpeedVideoFpsRanges);
                }
                return java.lang.Boolean.FALSE;
            }
        };
    }

    public static org.threeten.bp.format.DateTimeFormatter ofPattern(java.lang.String str) {
        return new org.threeten.bp.format.DateTimeFormatterBuilder().appendPattern(str).toFormatter();
    }

    public static org.threeten.bp.format.DateTimeFormatter ofPattern(java.lang.String str, java.util.Locale locale) {
        return new org.threeten.bp.format.DateTimeFormatterBuilder().appendPattern(str).toFormatter(locale);
    }

    public static org.threeten.bp.format.DateTimeFormatter ofLocalizedDate(org.threeten.bp.format.FormatStyle formatStyle) {
        org.threeten.bp.jdk8.Jdk8Methods.requireNonNull(formatStyle, "dateStyle");
        return new org.threeten.bp.format.DateTimeFormatterBuilder().appendLocalized(formatStyle, null).toFormatter().withChronology(org.threeten.bp.chrono.IsoChronology.INSTANCE);
    }

    public static org.threeten.bp.format.DateTimeFormatter ofLocalizedTime(org.threeten.bp.format.FormatStyle formatStyle) {
        org.threeten.bp.jdk8.Jdk8Methods.requireNonNull(formatStyle, "timeStyle");
        return new org.threeten.bp.format.DateTimeFormatterBuilder().appendLocalized(null, formatStyle).toFormatter().withChronology(org.threeten.bp.chrono.IsoChronology.INSTANCE);
    }

    public static org.threeten.bp.format.DateTimeFormatter ofLocalizedDateTime(org.threeten.bp.format.FormatStyle formatStyle) {
        org.threeten.bp.jdk8.Jdk8Methods.requireNonNull(formatStyle, "dateTimeStyle");
        return new org.threeten.bp.format.DateTimeFormatterBuilder().appendLocalized(formatStyle, formatStyle).toFormatter().withChronology(org.threeten.bp.chrono.IsoChronology.INSTANCE);
    }

    public static org.threeten.bp.format.DateTimeFormatter ofLocalizedDateTime(org.threeten.bp.format.FormatStyle formatStyle, org.threeten.bp.format.FormatStyle formatStyle2) {
        org.threeten.bp.jdk8.Jdk8Methods.requireNonNull(formatStyle, "dateStyle");
        org.threeten.bp.jdk8.Jdk8Methods.requireNonNull(formatStyle2, "timeStyle");
        return new org.threeten.bp.format.DateTimeFormatterBuilder().appendLocalized(formatStyle, formatStyle2).toFormatter().withChronology(org.threeten.bp.chrono.IsoChronology.INSTANCE);
    }

    public static final org.threeten.bp.temporal.TemporalQuery<org.threeten.bp.Period> parsedExcessDays() {
        return getHighResolutionOutputSizeshNQ4ISI;
    }

    public static final org.threeten.bp.temporal.TemporalQuery<java.lang.Boolean> parsedLeapSecond() {
        return getHighSpeedVideoSizes;
    }

    DateTimeFormatter(org.threeten.bp.format.DateTimeFormatterBuilder.CompositePrinterParser compositePrinterParser, java.util.Locale locale, org.threeten.bp.format.DecimalStyle decimalStyle, org.threeten.bp.format.ResolverStyle resolverStyle, java.util.Set<org.threeten.bp.temporal.TemporalField> set, org.threeten.bp.chrono.Chronology chronology, org.threeten.bp.ZoneId zoneId) {
        this.getHighSpeedVideoFpsRangesFor = (org.threeten.bp.format.DateTimeFormatterBuilder.CompositePrinterParser) org.threeten.bp.jdk8.Jdk8Methods.requireNonNull(compositePrinterParser, "printerParser");
        this.getHighSpeedVideoSizesFor = (java.util.Locale) org.threeten.bp.jdk8.Jdk8Methods.requireNonNull(locale, "locale");
        this.Camera2StreamConfigurationMap = (org.threeten.bp.format.DecimalStyle) org.threeten.bp.jdk8.Jdk8Methods.requireNonNull(decimalStyle, "decimalStyle");
        this.getInputFormats = (org.threeten.bp.format.ResolverStyle) org.threeten.bp.jdk8.Jdk8Methods.requireNonNull(resolverStyle, "resolverStyle");
        this.getInputSizeshNQ4ISI = set;
        this.getHighSpeedVideoFpsRanges = chronology;
        this.getOutputFormats = zoneId;
    }

    public final java.util.Locale getLocale() {
        return this.getHighSpeedVideoSizesFor;
    }

    public final org.threeten.bp.format.DateTimeFormatter withLocale(java.util.Locale locale) {
        return this.getHighSpeedVideoSizesFor.equals(locale) ? this : new org.threeten.bp.format.DateTimeFormatter(this.getHighSpeedVideoFpsRangesFor, locale, this.Camera2StreamConfigurationMap, this.getInputFormats, this.getInputSizeshNQ4ISI, this.getHighSpeedVideoFpsRanges, this.getOutputFormats);
    }

    public final org.threeten.bp.format.DecimalStyle getDecimalStyle() {
        return this.Camera2StreamConfigurationMap;
    }

    public final org.threeten.bp.format.DateTimeFormatter withDecimalStyle(org.threeten.bp.format.DecimalStyle decimalStyle) {
        return this.Camera2StreamConfigurationMap.equals(decimalStyle) ? this : new org.threeten.bp.format.DateTimeFormatter(this.getHighSpeedVideoFpsRangesFor, this.getHighSpeedVideoSizesFor, decimalStyle, this.getInputFormats, this.getInputSizeshNQ4ISI, this.getHighSpeedVideoFpsRanges, this.getOutputFormats);
    }

    public final org.threeten.bp.chrono.Chronology getChronology() {
        return this.getHighSpeedVideoFpsRanges;
    }

    public final org.threeten.bp.format.DateTimeFormatter withChronology(org.threeten.bp.chrono.Chronology chronology) {
        return org.threeten.bp.jdk8.Jdk8Methods.equals(this.getHighSpeedVideoFpsRanges, chronology) ? this : new org.threeten.bp.format.DateTimeFormatter(this.getHighSpeedVideoFpsRangesFor, this.getHighSpeedVideoSizesFor, this.Camera2StreamConfigurationMap, this.getInputFormats, this.getInputSizeshNQ4ISI, chronology, this.getOutputFormats);
    }

    public final org.threeten.bp.ZoneId getZone() {
        return this.getOutputFormats;
    }

    public final org.threeten.bp.format.DateTimeFormatter withZone(org.threeten.bp.ZoneId zoneId) {
        return org.threeten.bp.jdk8.Jdk8Methods.equals(this.getOutputFormats, zoneId) ? this : new org.threeten.bp.format.DateTimeFormatter(this.getHighSpeedVideoFpsRangesFor, this.getHighSpeedVideoSizesFor, this.Camera2StreamConfigurationMap, this.getInputFormats, this.getInputSizeshNQ4ISI, this.getHighSpeedVideoFpsRanges, zoneId);
    }

    public final org.threeten.bp.format.ResolverStyle getResolverStyle() {
        return this.getInputFormats;
    }

    public final org.threeten.bp.format.DateTimeFormatter withResolverStyle(org.threeten.bp.format.ResolverStyle resolverStyle) {
        org.threeten.bp.jdk8.Jdk8Methods.requireNonNull(resolverStyle, "resolverStyle");
        return org.threeten.bp.jdk8.Jdk8Methods.equals(this.getInputFormats, resolverStyle) ? this : new org.threeten.bp.format.DateTimeFormatter(this.getHighSpeedVideoFpsRangesFor, this.getHighSpeedVideoSizesFor, this.Camera2StreamConfigurationMap, resolverStyle, this.getInputSizeshNQ4ISI, this.getHighSpeedVideoFpsRanges, this.getOutputFormats);
    }

    public final java.util.Set<org.threeten.bp.temporal.TemporalField> getResolverFields() {
        return this.getInputSizeshNQ4ISI;
    }

    public final org.threeten.bp.format.DateTimeFormatter withResolverFields(org.threeten.bp.temporal.TemporalField... temporalFieldArr) {
        if (temporalFieldArr == null) {
            return new org.threeten.bp.format.DateTimeFormatter(this.getHighSpeedVideoFpsRangesFor, this.getHighSpeedVideoSizesFor, this.Camera2StreamConfigurationMap, this.getInputFormats, null, this.getHighSpeedVideoFpsRanges, this.getOutputFormats);
        }
        java.util.HashSet hashSet = new java.util.HashSet(java.util.Arrays.asList(temporalFieldArr));
        if (org.threeten.bp.jdk8.Jdk8Methods.equals(this.getInputSizeshNQ4ISI, hashSet)) {
            return this;
        }
        return new org.threeten.bp.format.DateTimeFormatter(this.getHighSpeedVideoFpsRangesFor, this.getHighSpeedVideoSizesFor, this.Camera2StreamConfigurationMap, this.getInputFormats, java.util.Collections.unmodifiableSet(hashSet), this.getHighSpeedVideoFpsRanges, this.getOutputFormats);
    }

    public final org.threeten.bp.format.DateTimeFormatter withResolverFields(java.util.Set<org.threeten.bp.temporal.TemporalField> set) {
        if (set == null) {
            return new org.threeten.bp.format.DateTimeFormatter(this.getHighSpeedVideoFpsRangesFor, this.getHighSpeedVideoSizesFor, this.Camera2StreamConfigurationMap, this.getInputFormats, null, this.getHighSpeedVideoFpsRanges, this.getOutputFormats);
        }
        if (org.threeten.bp.jdk8.Jdk8Methods.equals(this.getInputSizeshNQ4ISI, set)) {
            return this;
        }
        return new org.threeten.bp.format.DateTimeFormatter(this.getHighSpeedVideoFpsRangesFor, this.getHighSpeedVideoSizesFor, this.Camera2StreamConfigurationMap, this.getInputFormats, java.util.Collections.unmodifiableSet(new java.util.HashSet(set)), this.getHighSpeedVideoFpsRanges, this.getOutputFormats);
    }

    public final java.lang.String format(org.threeten.bp.temporal.TemporalAccessor temporalAccessor) {
        java.lang.StringBuilder sb = new java.lang.StringBuilder(32);
        formatTo(temporalAccessor, sb);
        return sb.toString();
    }

    public final void formatTo(org.threeten.bp.temporal.TemporalAccessor temporalAccessor, java.lang.Appendable appendable) {
        org.threeten.bp.jdk8.Jdk8Methods.requireNonNull(temporalAccessor, "temporal");
        org.threeten.bp.jdk8.Jdk8Methods.requireNonNull(appendable, "appendable");
        try {
            org.threeten.bp.format.DateTimePrintContext dateTimePrintContext = new org.threeten.bp.format.DateTimePrintContext(temporalAccessor, this);
            if (appendable instanceof java.lang.StringBuilder) {
                this.getHighSpeedVideoFpsRangesFor.Camera2StreamConfigurationMap(dateTimePrintContext, (java.lang.StringBuilder) appendable);
                return;
            }
            java.lang.StringBuilder sb = new java.lang.StringBuilder(32);
            this.getHighSpeedVideoFpsRangesFor.Camera2StreamConfigurationMap(dateTimePrintContext, sb);
            appendable.append(sb);
        } catch (java.io.IOException e) {
            throw new org.threeten.bp.DateTimeException(e.getMessage(), e);
        }
    }

    public final org.threeten.bp.temporal.TemporalAccessor parse(java.lang.CharSequence charSequence) {
        org.threeten.bp.jdk8.Jdk8Methods.requireNonNull(charSequence, "text");
        try {
            return getHighResolutionOutputSizeshNQ4ISI(charSequence, null).getHighResolutionOutputSizeshNQ4ISI(this.getInputFormats, this.getInputSizeshNQ4ISI);
        } catch (org.threeten.bp.format.DateTimeParseException e) {
            throw e;
        } catch (java.lang.RuntimeException e2) {
            throw getHighSpeedVideoFpsRanges(charSequence, e2);
        }
    }

    public final org.threeten.bp.temporal.TemporalAccessor parse(java.lang.CharSequence charSequence, java.text.ParsePosition parsePosition) {
        org.threeten.bp.jdk8.Jdk8Methods.requireNonNull(charSequence, "text");
        org.threeten.bp.jdk8.Jdk8Methods.requireNonNull(parsePosition, com.daon.sdk.face.license.License.FEATURE_POSITION);
        try {
            return getHighResolutionOutputSizeshNQ4ISI(charSequence, parsePosition).getHighResolutionOutputSizeshNQ4ISI(this.getInputFormats, this.getInputSizeshNQ4ISI);
        } catch (java.lang.IndexOutOfBoundsException e) {
            throw e;
        } catch (org.threeten.bp.format.DateTimeParseException e2) {
            throw e2;
        } catch (java.lang.RuntimeException e3) {
            throw getHighSpeedVideoFpsRanges(charSequence, e3);
        }
    }

    public final <T> T parse(java.lang.CharSequence charSequence, org.threeten.bp.temporal.TemporalQuery<T> temporalQuery) {
        org.threeten.bp.jdk8.Jdk8Methods.requireNonNull(charSequence, "text");
        org.threeten.bp.jdk8.Jdk8Methods.requireNonNull(temporalQuery, "type");
        try {
            return temporalQuery.queryFrom(getHighResolutionOutputSizeshNQ4ISI(charSequence, null).getHighResolutionOutputSizeshNQ4ISI(this.getInputFormats, this.getInputSizeshNQ4ISI));
        } catch (org.threeten.bp.format.DateTimeParseException e) {
            throw e;
        } catch (java.lang.RuntimeException e2) {
            throw getHighSpeedVideoFpsRanges(charSequence, e2);
        }
    }

    public final org.threeten.bp.temporal.TemporalAccessor parseBest(java.lang.CharSequence charSequence, org.threeten.bp.temporal.TemporalQuery<?>... temporalQueryArr) {
        org.threeten.bp.jdk8.Jdk8Methods.requireNonNull(charSequence, "text");
        org.threeten.bp.jdk8.Jdk8Methods.requireNonNull(temporalQueryArr, "types");
        if (temporalQueryArr.length < 2) {
            throw new java.lang.IllegalArgumentException("At least two types must be specified");
        }
        try {
            try {
                org.threeten.bp.format.DateTimeBuilder highResolutionOutputSizeshNQ4ISI = getHighResolutionOutputSizeshNQ4ISI(charSequence, null).getHighResolutionOutputSizeshNQ4ISI(this.getInputFormats, this.getInputSizeshNQ4ISI);
                for (org.threeten.bp.temporal.TemporalQuery<?> temporalQuery : temporalQueryArr) {
                    try {
                        return (org.threeten.bp.temporal.TemporalAccessor) temporalQuery.queryFrom(highResolutionOutputSizeshNQ4ISI);
                    } catch (java.lang.RuntimeException unused) {
                    }
                }
                java.lang.StringBuilder sb = new java.lang.StringBuilder();
                sb.append("Unable to convert parsed text to any specified type: ");
                sb.append(java.util.Arrays.toString(temporalQueryArr));
                throw new org.threeten.bp.DateTimeException(sb.toString());
            } catch (java.lang.RuntimeException e) {
                throw getHighSpeedVideoFpsRanges(charSequence, e);
            }
        } catch (org.threeten.bp.format.DateTimeParseException e2) {
            throw e2;
        }
    }

    private static org.threeten.bp.format.DateTimeParseException getHighSpeedVideoFpsRanges(java.lang.CharSequence charSequence, java.lang.RuntimeException runtimeException) {
        java.lang.String obj;
        if (charSequence.length() > 64) {
            java.lang.StringBuilder sb = new java.lang.StringBuilder();
            sb.append(charSequence.subSequence(0, 64).toString());
            sb.append("...");
            obj = sb.toString();
        } else {
            obj = charSequence.toString();
        }
        java.lang.StringBuilder sb2 = new java.lang.StringBuilder("Text '");
        sb2.append(obj);
        sb2.append("' could not be parsed: ");
        sb2.append(runtimeException.getMessage());
        return new org.threeten.bp.format.DateTimeParseException(sb2.toString(), charSequence, 0, runtimeException);
    }

    private org.threeten.bp.format.DateTimeBuilder getHighResolutionOutputSizeshNQ4ISI(java.lang.CharSequence charSequence, java.text.ParsePosition parsePosition) {
        java.lang.String obj;
        java.text.ParsePosition parsePosition2 = parsePosition != null ? parsePosition : new java.text.ParsePosition(0);
        org.threeten.bp.format.DateTimeParseContext.Parsed highSpeedVideoFpsRanges = getHighSpeedVideoFpsRanges(charSequence, parsePosition2);
        if (highSpeedVideoFpsRanges == null || parsePosition2.getErrorIndex() >= 0 || (parsePosition == null && parsePosition2.getIndex() < charSequence.length())) {
            if (charSequence.length() > 64) {
                java.lang.StringBuilder sb = new java.lang.StringBuilder();
                sb.append(charSequence.subSequence(0, 64).toString());
                sb.append("...");
                obj = sb.toString();
            } else {
                obj = charSequence.toString();
            }
            if (parsePosition2.getErrorIndex() >= 0) {
                java.lang.StringBuilder sb2 = new java.lang.StringBuilder("Text '");
                sb2.append(obj);
                sb2.append("' could not be parsed at index ");
                sb2.append(parsePosition2.getErrorIndex());
                throw new org.threeten.bp.format.DateTimeParseException(sb2.toString(), charSequence, parsePosition2.getErrorIndex());
            }
            java.lang.StringBuilder sb3 = new java.lang.StringBuilder("Text '");
            sb3.append(obj);
            sb3.append("' could not be parsed, unparsed text found at index ");
            sb3.append(parsePosition2.getIndex());
            throw new org.threeten.bp.format.DateTimeParseException(sb3.toString(), charSequence, parsePosition2.getIndex());
        }
        return highSpeedVideoFpsRanges.getHighResolutionOutputSizeshNQ4ISI();
    }

    public final org.threeten.bp.temporal.TemporalAccessor parseUnresolved(java.lang.CharSequence charSequence, java.text.ParsePosition parsePosition) {
        return getHighSpeedVideoFpsRanges(charSequence, parsePosition);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public org.threeten.bp.format.DateTimeParseContext.Parsed getHighSpeedVideoFpsRanges(java.lang.CharSequence charSequence, java.text.ParsePosition parsePosition) {
        org.threeten.bp.jdk8.Jdk8Methods.requireNonNull(charSequence, "text");
        org.threeten.bp.jdk8.Jdk8Methods.requireNonNull(parsePosition, com.daon.sdk.face.license.License.FEATURE_POSITION);
        org.threeten.bp.format.DateTimeParseContext dateTimeParseContext = new org.threeten.bp.format.DateTimeParseContext(this);
        int highSpeedVideoFpsRanges = this.getHighSpeedVideoFpsRangesFor.getHighSpeedVideoFpsRanges(dateTimeParseContext, charSequence, parsePosition.getIndex());
        if (highSpeedVideoFpsRanges < 0) {
            parsePosition.setErrorIndex(~highSpeedVideoFpsRanges);
            return null;
        }
        parsePosition.setIndex(highSpeedVideoFpsRanges);
        return dateTimeParseContext.getHighSpeedVideoFpsRangesFor.get(r4.size() - 1);
    }

    public final java.text.Format toFormat() {
        return new org.threeten.bp.format.DateTimeFormatter.ClassicFormat(this, null);
    }

    public final java.text.Format toFormat(org.threeten.bp.temporal.TemporalQuery<?> temporalQuery) {
        org.threeten.bp.jdk8.Jdk8Methods.requireNonNull(temporalQuery, "query");
        return new org.threeten.bp.format.DateTimeFormatter.ClassicFormat(this, temporalQuery);
    }

    public final java.lang.String toString() {
        java.lang.String obj = this.getHighSpeedVideoFpsRangesFor.toString();
        return obj.startsWith("[") ? obj : obj.substring(1, obj.length() - 1);
    }

    static class ClassicFormat extends java.text.Format {
        private final org.threeten.bp.format.DateTimeFormatter getHighSpeedVideoFpsRanges;
        private final org.threeten.bp.temporal.TemporalQuery<?> getHighSpeedVideoSizes;

        public ClassicFormat(org.threeten.bp.format.DateTimeFormatter dateTimeFormatter, org.threeten.bp.temporal.TemporalQuery<?> temporalQuery) {
            this.getHighSpeedVideoFpsRanges = dateTimeFormatter;
            this.getHighSpeedVideoSizes = temporalQuery;
        }

        @Override // java.text.Format
        public java.lang.StringBuffer format(java.lang.Object obj, java.lang.StringBuffer stringBuffer, java.text.FieldPosition fieldPosition) {
            org.threeten.bp.jdk8.Jdk8Methods.requireNonNull(obj, "obj");
            org.threeten.bp.jdk8.Jdk8Methods.requireNonNull(stringBuffer, "toAppendTo");
            org.threeten.bp.jdk8.Jdk8Methods.requireNonNull(fieldPosition, "pos");
            if (!(obj instanceof org.threeten.bp.temporal.TemporalAccessor)) {
                throw new java.lang.IllegalArgumentException("Format target must implement TemporalAccessor");
            }
            fieldPosition.setBeginIndex(0);
            fieldPosition.setEndIndex(0);
            try {
                this.getHighSpeedVideoFpsRanges.formatTo((org.threeten.bp.temporal.TemporalAccessor) obj, stringBuffer);
                return stringBuffer;
            } catch (java.lang.RuntimeException e) {
                throw new java.lang.IllegalArgumentException(e.getMessage(), e);
            }
        }

        @Override // java.text.Format
        public java.lang.Object parseObject(java.lang.String str) throws java.text.ParseException {
            org.threeten.bp.jdk8.Jdk8Methods.requireNonNull(str, "text");
            try {
                org.threeten.bp.temporal.TemporalQuery<?> temporalQuery = this.getHighSpeedVideoSizes;
                if (temporalQuery == null) {
                    return org.threeten.bp.format.DateTimeFormatter.getHighSpeedVideoFpsRangesFor(this.getHighSpeedVideoFpsRanges, str).getHighResolutionOutputSizeshNQ4ISI(this.getHighSpeedVideoFpsRanges.getResolverStyle(), this.getHighSpeedVideoFpsRanges.getResolverFields());
                }
                return this.getHighSpeedVideoFpsRanges.parse(str, temporalQuery);
            } catch (org.threeten.bp.format.DateTimeParseException e) {
                throw new java.text.ParseException(e.getMessage(), e.getErrorIndex());
            } catch (java.lang.RuntimeException e2) {
                throw ((java.text.ParseException) new java.text.ParseException(e2.getMessage(), 0).initCause(e2));
            }
        }

        @Override // java.text.Format
        public java.lang.Object parseObject(java.lang.String str, java.text.ParsePosition parsePosition) {
            org.threeten.bp.jdk8.Jdk8Methods.requireNonNull(str, "text");
            try {
                org.threeten.bp.format.DateTimeParseContext.Parsed highSpeedVideoFpsRanges = this.getHighSpeedVideoFpsRanges.getHighSpeedVideoFpsRanges(str, parsePosition);
                if (highSpeedVideoFpsRanges == null) {
                    if (parsePosition.getErrorIndex() < 0) {
                        parsePosition.setErrorIndex(0);
                    }
                    return null;
                }
                try {
                    org.threeten.bp.format.DateTimeBuilder highResolutionOutputSizeshNQ4ISI = highSpeedVideoFpsRanges.getHighResolutionOutputSizeshNQ4ISI().getHighResolutionOutputSizeshNQ4ISI(this.getHighSpeedVideoFpsRanges.getResolverStyle(), this.getHighSpeedVideoFpsRanges.getResolverFields());
                    org.threeten.bp.temporal.TemporalQuery<?> temporalQuery = this.getHighSpeedVideoSizes;
                    return temporalQuery == null ? highResolutionOutputSizeshNQ4ISI : temporalQuery.queryFrom(highResolutionOutputSizeshNQ4ISI);
                } catch (java.lang.RuntimeException unused) {
                    parsePosition.setErrorIndex(0);
                    return null;
                }
            } catch (java.lang.IndexOutOfBoundsException unused2) {
                if (parsePosition.getErrorIndex() < 0) {
                    parsePosition.setErrorIndex(0);
                }
                return null;
            }
        }
    }
}
