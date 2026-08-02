package org.threeten.bp.format;

import org.threeten.bp.format.DateTimeParseContext.Parsed;

/* loaded from: classes18.dex */
public final class DateTimeFormatterBuilder {
    private static final org.threeten.bp.temporal.TemporalQuery<org.threeten.bp.ZoneId> Camera2StreamConfigurationMap = new org.threeten.bp.temporal.TemporalQuery<org.threeten.bp.ZoneId>() { // from class: org.threeten.bp.format.DateTimeFormatterBuilder.1
        @Override // org.threeten.bp.temporal.TemporalQuery
        public /* synthetic */ org.threeten.bp.ZoneId queryFrom(org.threeten.bp.temporal.TemporalAccessor temporalAccessor) {
            org.threeten.bp.ZoneId zoneId = (org.threeten.bp.ZoneId) temporalAccessor.query(org.threeten.bp.temporal.TemporalQueries.zoneId());
            if (zoneId == null || (zoneId instanceof org.threeten.bp.ZoneOffset)) {
                return null;
            }
            return zoneId;
        }
    };
    static final java.util.Comparator<java.lang.String> getHighSpeedVideoFpsRangesFor;
    private static final java.util.Map<java.lang.Character, org.threeten.bp.temporal.TemporalField> getHighSpeedVideoSizes;
    private org.threeten.bp.format.DateTimeFormatterBuilder getHighResolutionOutputSizeshNQ4ISI;
    private final boolean getHighSpeedVideoFpsRanges;
    private int getHighSpeedVideoSizesFor;
    private final java.util.List<org.threeten.bp.format.DateTimeFormatterBuilder.DateTimePrinterParser> getInputFormats;
    private char getInputSizeshNQ4ISI;
    private int getOutputFormats;
    private final org.threeten.bp.format.DateTimeFormatterBuilder getOutputMinFrameDuration;

    interface DateTimePrinterParser {
        boolean Camera2StreamConfigurationMap(org.threeten.bp.format.DateTimePrintContext dateTimePrintContext, java.lang.StringBuilder sb);

        int getHighSpeedVideoFpsRanges(org.threeten.bp.format.DateTimeParseContext dateTimeParseContext, java.lang.CharSequence charSequence, int i);
    }

    static {
        java.util.HashMap hashMap = new java.util.HashMap();
        getHighSpeedVideoSizes = hashMap;
        hashMap.put('G', org.threeten.bp.temporal.ChronoField.ERA);
        hashMap.put('y', org.threeten.bp.temporal.ChronoField.YEAR_OF_ERA);
        hashMap.put(java.lang.Character.valueOf(kotlinx.serialization.json.internal.AbstractJsonLexerKt.UNICODE_ESC), org.threeten.bp.temporal.ChronoField.YEAR);
        hashMap.put('Q', org.threeten.bp.temporal.IsoFields.QUARTER_OF_YEAR);
        hashMap.put('q', org.threeten.bp.temporal.IsoFields.QUARTER_OF_YEAR);
        hashMap.put(java.lang.Character.valueOf(io.ktor.util.date.GMTDateParser.MONTH), org.threeten.bp.temporal.ChronoField.MONTH_OF_YEAR);
        hashMap.put(java.lang.Character.valueOf(org.bouncycastle.pqc.math.linearalgebra.Matrix.MATRIX_TYPE_RANDOM_LT), org.threeten.bp.temporal.ChronoField.MONTH_OF_YEAR);
        hashMap.put('D', org.threeten.bp.temporal.ChronoField.DAY_OF_YEAR);
        hashMap.put(java.lang.Character.valueOf(io.ktor.util.date.GMTDateParser.DAY_OF_MONTH), org.threeten.bp.temporal.ChronoField.DAY_OF_MONTH);
        hashMap.put('F', org.threeten.bp.temporal.ChronoField.ALIGNED_DAY_OF_WEEK_IN_MONTH);
        hashMap.put('E', org.threeten.bp.temporal.ChronoField.DAY_OF_WEEK);
        hashMap.put('c', org.threeten.bp.temporal.ChronoField.DAY_OF_WEEK);
        hashMap.put('e', org.threeten.bp.temporal.ChronoField.DAY_OF_WEEK);
        hashMap.put('a', org.threeten.bp.temporal.ChronoField.AMPM_OF_DAY);
        hashMap.put('H', org.threeten.bp.temporal.ChronoField.HOUR_OF_DAY);
        hashMap.put('k', org.threeten.bp.temporal.ChronoField.CLOCK_HOUR_OF_DAY);
        hashMap.put('K', org.threeten.bp.temporal.ChronoField.HOUR_OF_AMPM);
        hashMap.put(java.lang.Character.valueOf(io.ktor.util.date.GMTDateParser.HOURS), org.threeten.bp.temporal.ChronoField.CLOCK_HOUR_OF_AMPM);
        hashMap.put(java.lang.Character.valueOf(io.ktor.util.date.GMTDateParser.MINUTES), org.threeten.bp.temporal.ChronoField.MINUTE_OF_HOUR);
        hashMap.put(java.lang.Character.valueOf(io.ktor.util.date.GMTDateParser.SECONDS), org.threeten.bp.temporal.ChronoField.SECOND_OF_MINUTE);
        hashMap.put('S', org.threeten.bp.temporal.ChronoField.NANO_OF_SECOND);
        hashMap.put('A', org.threeten.bp.temporal.ChronoField.MILLI_OF_DAY);
        hashMap.put('n', org.threeten.bp.temporal.ChronoField.NANO_OF_SECOND);
        hashMap.put('N', org.threeten.bp.temporal.ChronoField.NANO_OF_DAY);
        getHighSpeedVideoFpsRangesFor = new java.util.Comparator<java.lang.String>() { // from class: org.threeten.bp.format.DateTimeFormatterBuilder.3
            @Override // java.util.Comparator
            public /* synthetic */ int compare(java.lang.String str, java.lang.String str2) {
                java.lang.String str3 = str;
                java.lang.String str4 = str2;
                return str3.length() == str4.length() ? str3.compareTo(str4) : str3.length() - str4.length();
            }
        };
    }

    public static java.lang.String getLocalizedDateTimePattern(org.threeten.bp.format.FormatStyle formatStyle, org.threeten.bp.format.FormatStyle formatStyle2, org.threeten.bp.chrono.Chronology chronology, java.util.Locale locale) {
        java.text.DateFormat timeInstance;
        org.threeten.bp.jdk8.Jdk8Methods.requireNonNull(locale, "locale");
        org.threeten.bp.jdk8.Jdk8Methods.requireNonNull(chronology, "chrono");
        if (formatStyle == null && formatStyle2 == null) {
            throw new java.lang.IllegalArgumentException("Either dateStyle or timeStyle must be non-null");
        }
        if (formatStyle == null) {
            timeInstance = java.text.DateFormat.getTimeInstance(formatStyle2.ordinal(), locale);
        } else if (formatStyle2 != null) {
            timeInstance = java.text.DateFormat.getDateTimeInstance(formatStyle.ordinal(), formatStyle2.ordinal(), locale);
        } else {
            timeInstance = java.text.DateFormat.getDateInstance(formatStyle.ordinal(), locale);
        }
        if (timeInstance instanceof java.text.SimpleDateFormat) {
            return ((java.text.SimpleDateFormat) timeInstance).toPattern();
        }
        throw new java.lang.IllegalArgumentException("Unable to determine pattern");
    }

    public DateTimeFormatterBuilder() {
        this.getHighResolutionOutputSizeshNQ4ISI = this;
        this.getInputFormats = new java.util.ArrayList();
        this.getOutputFormats = -1;
        this.getOutputMinFrameDuration = null;
        this.getHighSpeedVideoFpsRanges = false;
    }

    private DateTimeFormatterBuilder(org.threeten.bp.format.DateTimeFormatterBuilder dateTimeFormatterBuilder) {
        this.getHighResolutionOutputSizeshNQ4ISI = this;
        this.getInputFormats = new java.util.ArrayList();
        this.getOutputFormats = -1;
        this.getOutputMinFrameDuration = dateTimeFormatterBuilder;
        this.getHighSpeedVideoFpsRanges = true;
    }

    public final org.threeten.bp.format.DateTimeFormatterBuilder parseCaseSensitive() {
        getHighSpeedVideoFpsRangesFor(org.threeten.bp.format.DateTimeFormatterBuilder.SettingsParser.SENSITIVE);
        return this;
    }

    public final org.threeten.bp.format.DateTimeFormatterBuilder parseCaseInsensitive() {
        getHighSpeedVideoFpsRangesFor(org.threeten.bp.format.DateTimeFormatterBuilder.SettingsParser.INSENSITIVE);
        return this;
    }

    public final org.threeten.bp.format.DateTimeFormatterBuilder parseStrict() {
        getHighSpeedVideoFpsRangesFor(org.threeten.bp.format.DateTimeFormatterBuilder.SettingsParser.STRICT);
        return this;
    }

    public final org.threeten.bp.format.DateTimeFormatterBuilder parseLenient() {
        getHighSpeedVideoFpsRangesFor(org.threeten.bp.format.DateTimeFormatterBuilder.SettingsParser.LENIENT);
        return this;
    }

    public final org.threeten.bp.format.DateTimeFormatterBuilder parseDefaulting(org.threeten.bp.temporal.TemporalField temporalField, long j) {
        org.threeten.bp.jdk8.Jdk8Methods.requireNonNull(temporalField, "field");
        getHighSpeedVideoFpsRangesFor(new org.threeten.bp.format.DateTimeFormatterBuilder.DefaultingParser(temporalField, j));
        return this;
    }

    public final org.threeten.bp.format.DateTimeFormatterBuilder appendValue(org.threeten.bp.temporal.TemporalField temporalField) {
        org.threeten.bp.jdk8.Jdk8Methods.requireNonNull(temporalField, "field");
        getHighSpeedVideoSizes(new org.threeten.bp.format.DateTimeFormatterBuilder.NumberPrinterParser(temporalField, 1, 19, org.threeten.bp.format.SignStyle.NORMAL));
        return this;
    }

    public final org.threeten.bp.format.DateTimeFormatterBuilder appendValue(org.threeten.bp.temporal.TemporalField temporalField, int i) {
        org.threeten.bp.jdk8.Jdk8Methods.requireNonNull(temporalField, "field");
        if (i <= 0 || i > 19) {
            throw new java.lang.IllegalArgumentException("The width must be from 1 to 19 inclusive but was ".concat(java.lang.String.valueOf(i)));
        }
        getHighSpeedVideoSizes(new org.threeten.bp.format.DateTimeFormatterBuilder.NumberPrinterParser(temporalField, i, i, org.threeten.bp.format.SignStyle.NOT_NEGATIVE));
        return this;
    }

    public final org.threeten.bp.format.DateTimeFormatterBuilder appendValue(org.threeten.bp.temporal.TemporalField temporalField, int i, int i2, org.threeten.bp.format.SignStyle signStyle) {
        if (i == i2 && signStyle == org.threeten.bp.format.SignStyle.NOT_NEGATIVE) {
            return appendValue(temporalField, i2);
        }
        org.threeten.bp.jdk8.Jdk8Methods.requireNonNull(temporalField, "field");
        org.threeten.bp.jdk8.Jdk8Methods.requireNonNull(signStyle, "signStyle");
        if (i <= 0 || i > 19) {
            throw new java.lang.IllegalArgumentException("The minimum width must be from 1 to 19 inclusive but was ".concat(java.lang.String.valueOf(i)));
        }
        if (i2 <= 0 || i2 > 19) {
            throw new java.lang.IllegalArgumentException("The maximum width must be from 1 to 19 inclusive but was ".concat(java.lang.String.valueOf(i2)));
        }
        if (i2 < i) {
            java.lang.StringBuilder sb = new java.lang.StringBuilder("The maximum width must exceed or equal the minimum width but ");
            sb.append(i2);
            sb.append(" < ");
            sb.append(i);
            throw new java.lang.IllegalArgumentException(sb.toString());
        }
        getHighSpeedVideoSizes(new org.threeten.bp.format.DateTimeFormatterBuilder.NumberPrinterParser(temporalField, i, i2, signStyle));
        return this;
    }

    public final org.threeten.bp.format.DateTimeFormatterBuilder appendValueReduced(org.threeten.bp.temporal.TemporalField temporalField, int i, int i2, int i3) {
        org.threeten.bp.jdk8.Jdk8Methods.requireNonNull(temporalField, "field");
        getHighSpeedVideoSizes(new org.threeten.bp.format.DateTimeFormatterBuilder.ReducedPrinterParser(temporalField, i, i2, i3, null));
        return this;
    }

    public final org.threeten.bp.format.DateTimeFormatterBuilder appendValueReduced(org.threeten.bp.temporal.TemporalField temporalField, int i, int i2, org.threeten.bp.chrono.ChronoLocalDate chronoLocalDate) {
        org.threeten.bp.jdk8.Jdk8Methods.requireNonNull(temporalField, "field");
        org.threeten.bp.jdk8.Jdk8Methods.requireNonNull(chronoLocalDate, "baseDate");
        getHighSpeedVideoSizes(new org.threeten.bp.format.DateTimeFormatterBuilder.ReducedPrinterParser(temporalField, i, i2, 0, chronoLocalDate));
        return this;
    }

    private org.threeten.bp.format.DateTimeFormatterBuilder getHighSpeedVideoSizes(org.threeten.bp.format.DateTimeFormatterBuilder.NumberPrinterParser numberPrinterParser) {
        org.threeten.bp.format.DateTimeFormatterBuilder.NumberPrinterParser highSpeedVideoFpsRangesFor;
        org.threeten.bp.format.DateTimeFormatterBuilder dateTimeFormatterBuilder = this.getHighResolutionOutputSizeshNQ4ISI;
        int i = dateTimeFormatterBuilder.getOutputFormats;
        if (i >= 0 && (dateTimeFormatterBuilder.getInputFormats.get(i) instanceof org.threeten.bp.format.DateTimeFormatterBuilder.NumberPrinterParser)) {
            org.threeten.bp.format.DateTimeFormatterBuilder dateTimeFormatterBuilder2 = this.getHighResolutionOutputSizeshNQ4ISI;
            int i2 = dateTimeFormatterBuilder2.getOutputFormats;
            org.threeten.bp.format.DateTimeFormatterBuilder.NumberPrinterParser numberPrinterParser2 = (org.threeten.bp.format.DateTimeFormatterBuilder.NumberPrinterParser) dateTimeFormatterBuilder2.getInputFormats.get(i2);
            if (numberPrinterParser.getHighSpeedVideoFpsRangesFor == numberPrinterParser.getHighSpeedVideoSizes && numberPrinterParser.Camera2StreamConfigurationMap == org.threeten.bp.format.SignStyle.NOT_NEGATIVE) {
                highSpeedVideoFpsRangesFor = numberPrinterParser2.getHighResolutionOutputSizeshNQ4ISI(numberPrinterParser.getHighSpeedVideoSizes);
                getHighSpeedVideoFpsRangesFor(numberPrinterParser.getHighSpeedVideoFpsRangesFor());
                this.getHighResolutionOutputSizeshNQ4ISI.getOutputFormats = i2;
            } else {
                highSpeedVideoFpsRangesFor = numberPrinterParser2.getHighSpeedVideoFpsRangesFor();
                this.getHighResolutionOutputSizeshNQ4ISI.getOutputFormats = getHighSpeedVideoFpsRangesFor(numberPrinterParser);
            }
            this.getHighResolutionOutputSizeshNQ4ISI.getInputFormats.set(i2, highSpeedVideoFpsRangesFor);
            return this;
        }
        this.getHighResolutionOutputSizeshNQ4ISI.getOutputFormats = getHighSpeedVideoFpsRangesFor(numberPrinterParser);
        return this;
    }

    public final org.threeten.bp.format.DateTimeFormatterBuilder appendFraction(org.threeten.bp.temporal.TemporalField temporalField, int i, int i2, boolean z) {
        getHighSpeedVideoFpsRangesFor(new org.threeten.bp.format.DateTimeFormatterBuilder.FractionPrinterParser(temporalField, i, i2, z));
        return this;
    }

    public final org.threeten.bp.format.DateTimeFormatterBuilder appendText(org.threeten.bp.temporal.TemporalField temporalField) {
        return appendText(temporalField, org.threeten.bp.format.TextStyle.FULL);
    }

    public final org.threeten.bp.format.DateTimeFormatterBuilder appendText(org.threeten.bp.temporal.TemporalField temporalField, org.threeten.bp.format.TextStyle textStyle) {
        org.threeten.bp.jdk8.Jdk8Methods.requireNonNull(temporalField, "field");
        org.threeten.bp.jdk8.Jdk8Methods.requireNonNull(textStyle, "textStyle");
        getHighSpeedVideoFpsRangesFor(new org.threeten.bp.format.DateTimeFormatterBuilder.TextPrinterParser(temporalField, textStyle, org.threeten.bp.format.DateTimeTextProvider.getHighSpeedVideoSizes()));
        return this;
    }

    public final org.threeten.bp.format.DateTimeFormatterBuilder appendText(org.threeten.bp.temporal.TemporalField temporalField, java.util.Map<java.lang.Long, java.lang.String> map) {
        org.threeten.bp.jdk8.Jdk8Methods.requireNonNull(temporalField, "field");
        org.threeten.bp.jdk8.Jdk8Methods.requireNonNull(map, "textLookup");
        final org.threeten.bp.format.SimpleDateTimeTextProvider.LocaleStore localeStore = new org.threeten.bp.format.SimpleDateTimeTextProvider.LocaleStore(java.util.Collections.singletonMap(org.threeten.bp.format.TextStyle.FULL, new java.util.LinkedHashMap(map)));
        getHighSpeedVideoFpsRangesFor(new org.threeten.bp.format.DateTimeFormatterBuilder.TextPrinterParser(temporalField, org.threeten.bp.format.TextStyle.FULL, new org.threeten.bp.format.DateTimeTextProvider() { // from class: org.threeten.bp.format.DateTimeFormatterBuilder.2
            @Override // org.threeten.bp.format.DateTimeTextProvider
            public java.lang.String getText(org.threeten.bp.temporal.TemporalField temporalField2, long j, org.threeten.bp.format.TextStyle textStyle, java.util.Locale locale) {
                return localeStore.getHighSpeedVideoFpsRanges(j, textStyle);
            }

            @Override // org.threeten.bp.format.DateTimeTextProvider
            public java.util.Iterator<java.util.Map.Entry<java.lang.String, java.lang.Long>> getTextIterator(org.threeten.bp.temporal.TemporalField temporalField2, org.threeten.bp.format.TextStyle textStyle, java.util.Locale locale) {
                java.util.List<java.util.Map.Entry<java.lang.String, java.lang.Long>> list = localeStore.getHighSpeedVideoFpsRanges.get(textStyle);
                if (list != null) {
                    return list.iterator();
                }
                return null;
            }
        }));
        return this;
    }

    public final org.threeten.bp.format.DateTimeFormatterBuilder appendInstant() {
        getHighSpeedVideoFpsRangesFor(new org.threeten.bp.format.DateTimeFormatterBuilder.InstantPrinterParser(-2));
        return this;
    }

    public final org.threeten.bp.format.DateTimeFormatterBuilder appendInstant(int i) {
        if (i < -1 || i > 9) {
            throw new java.lang.IllegalArgumentException("Invalid fractional digits: ".concat(java.lang.String.valueOf(i)));
        }
        getHighSpeedVideoFpsRangesFor(new org.threeten.bp.format.DateTimeFormatterBuilder.InstantPrinterParser(i));
        return this;
    }

    public final org.threeten.bp.format.DateTimeFormatterBuilder appendOffsetId() {
        getHighSpeedVideoFpsRangesFor(org.threeten.bp.format.DateTimeFormatterBuilder.OffsetIdPrinterParser.Camera2StreamConfigurationMap);
        return this;
    }

    public final org.threeten.bp.format.DateTimeFormatterBuilder appendOffset(java.lang.String str, java.lang.String str2) {
        getHighSpeedVideoFpsRangesFor(new org.threeten.bp.format.DateTimeFormatterBuilder.OffsetIdPrinterParser(str2, str));
        return this;
    }

    public final org.threeten.bp.format.DateTimeFormatterBuilder appendLocalizedOffset(org.threeten.bp.format.TextStyle textStyle) {
        org.threeten.bp.jdk8.Jdk8Methods.requireNonNull(textStyle, com.adobe.marketing.mobile.messaging.MessagingConstants.ContentCard.UIKeys.STYLE);
        if (textStyle != org.threeten.bp.format.TextStyle.FULL && textStyle != org.threeten.bp.format.TextStyle.SHORT) {
            throw new java.lang.IllegalArgumentException("Style must be either full or short");
        }
        getHighSpeedVideoFpsRangesFor(new org.threeten.bp.format.DateTimeFormatterBuilder.LocalizedOffsetPrinterParser(textStyle));
        return this;
    }

    public final org.threeten.bp.format.DateTimeFormatterBuilder appendZoneId() {
        getHighSpeedVideoFpsRangesFor(new org.threeten.bp.format.DateTimeFormatterBuilder.ZoneIdPrinterParser(org.threeten.bp.temporal.TemporalQueries.zoneId(), "ZoneId()"));
        return this;
    }

    public final org.threeten.bp.format.DateTimeFormatterBuilder appendZoneRegionId() {
        getHighSpeedVideoFpsRangesFor(new org.threeten.bp.format.DateTimeFormatterBuilder.ZoneIdPrinterParser(Camera2StreamConfigurationMap, "ZoneRegionId()"));
        return this;
    }

    public final org.threeten.bp.format.DateTimeFormatterBuilder appendZoneOrOffsetId() {
        getHighSpeedVideoFpsRangesFor(new org.threeten.bp.format.DateTimeFormatterBuilder.ZoneIdPrinterParser(org.threeten.bp.temporal.TemporalQueries.zone(), "ZoneOrOffsetId()"));
        return this;
    }

    public final org.threeten.bp.format.DateTimeFormatterBuilder appendZoneText(org.threeten.bp.format.TextStyle textStyle) {
        getHighSpeedVideoFpsRangesFor(new org.threeten.bp.format.DateTimeFormatterBuilder.ZoneTextPrinterParser(textStyle));
        return this;
    }

    public final org.threeten.bp.format.DateTimeFormatterBuilder appendZoneText(org.threeten.bp.format.TextStyle textStyle, java.util.Set<org.threeten.bp.ZoneId> set) {
        org.threeten.bp.jdk8.Jdk8Methods.requireNonNull(set, "preferredZones");
        getHighSpeedVideoFpsRangesFor(new org.threeten.bp.format.DateTimeFormatterBuilder.ZoneTextPrinterParser(textStyle));
        return this;
    }

    public final org.threeten.bp.format.DateTimeFormatterBuilder appendChronologyId() {
        getHighSpeedVideoFpsRangesFor(new org.threeten.bp.format.DateTimeFormatterBuilder.ChronoPrinterParser(null));
        return this;
    }

    public final org.threeten.bp.format.DateTimeFormatterBuilder appendChronologyText(org.threeten.bp.format.TextStyle textStyle) {
        org.threeten.bp.jdk8.Jdk8Methods.requireNonNull(textStyle, "textStyle");
        getHighSpeedVideoFpsRangesFor(new org.threeten.bp.format.DateTimeFormatterBuilder.ChronoPrinterParser(textStyle));
        return this;
    }

    public final org.threeten.bp.format.DateTimeFormatterBuilder appendLocalized(org.threeten.bp.format.FormatStyle formatStyle, org.threeten.bp.format.FormatStyle formatStyle2) {
        if (formatStyle == null && formatStyle2 == null) {
            throw new java.lang.IllegalArgumentException("Either the date or time style must be non-null");
        }
        getHighSpeedVideoFpsRangesFor(new org.threeten.bp.format.DateTimeFormatterBuilder.LocalizedPrinterParser(formatStyle, formatStyle2));
        return this;
    }

    public final org.threeten.bp.format.DateTimeFormatterBuilder appendLiteral(char c) {
        getHighSpeedVideoFpsRangesFor(new org.threeten.bp.format.DateTimeFormatterBuilder.CharLiteralPrinterParser(c));
        return this;
    }

    public final org.threeten.bp.format.DateTimeFormatterBuilder appendLiteral(java.lang.String str) {
        org.threeten.bp.jdk8.Jdk8Methods.requireNonNull(str, "literal");
        if (str.length() > 0) {
            if (str.length() == 1) {
                getHighSpeedVideoFpsRangesFor(new org.threeten.bp.format.DateTimeFormatterBuilder.CharLiteralPrinterParser(str.charAt(0)));
                return this;
            }
            getHighSpeedVideoFpsRangesFor(new org.threeten.bp.format.DateTimeFormatterBuilder.StringLiteralPrinterParser(str));
        }
        return this;
    }

    public final org.threeten.bp.format.DateTimeFormatterBuilder append(org.threeten.bp.format.DateTimeFormatter dateTimeFormatter) {
        org.threeten.bp.jdk8.Jdk8Methods.requireNonNull(dateTimeFormatter, "formatter");
        org.threeten.bp.format.DateTimeFormatterBuilder.CompositePrinterParser compositePrinterParser = dateTimeFormatter.getHighSpeedVideoFpsRangesFor;
        if (compositePrinterParser.Camera2StreamConfigurationMap) {
            compositePrinterParser = new org.threeten.bp.format.DateTimeFormatterBuilder.CompositePrinterParser(compositePrinterParser.getHighSpeedVideoSizes, false);
        }
        getHighSpeedVideoFpsRangesFor(compositePrinterParser);
        return this;
    }

    public final org.threeten.bp.format.DateTimeFormatterBuilder appendOptional(org.threeten.bp.format.DateTimeFormatter dateTimeFormatter) {
        org.threeten.bp.jdk8.Jdk8Methods.requireNonNull(dateTimeFormatter, "formatter");
        org.threeten.bp.format.DateTimeFormatterBuilder.CompositePrinterParser compositePrinterParser = dateTimeFormatter.getHighSpeedVideoFpsRangesFor;
        if (true != compositePrinterParser.Camera2StreamConfigurationMap) {
            compositePrinterParser = new org.threeten.bp.format.DateTimeFormatterBuilder.CompositePrinterParser(compositePrinterParser.getHighSpeedVideoSizes, true);
        }
        getHighSpeedVideoFpsRangesFor(compositePrinterParser);
        return this;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Removed duplicated region for block: B:139:0x01fd  */
    /* JADX WARN: Removed duplicated region for block: B:140:0x0202  */
    /* JADX WARN: Removed duplicated region for block: B:266:0x03d4  */
    /* JADX WARN: Removed duplicated region for block: B:272:0x03ed A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final org.threeten.bp.format.DateTimeFormatterBuilder appendPattern(java.lang.String str) {
        int i;
        int i2;
        org.threeten.bp.jdk8.Jdk8Methods.requireNonNull(str, "pattern");
        int i3 = 0;
        while (i3 < str.length()) {
            char charAt = str.charAt(i3);
            if ((charAt >= 'A' && charAt <= 'Z') || (charAt >= 'a' && charAt <= 'z')) {
                int i4 = i3 + 1;
                while (i4 < str.length() && str.charAt(i4) == charAt) {
                    i4++;
                }
                int i5 = i4 - i3;
                if (charAt == 'p') {
                    if (i4 >= str.length() || (((charAt = str.charAt(i4)) < 'A' || charAt > 'Z') && (charAt < 'a' || charAt > 'z'))) {
                        i = i4;
                        i2 = i5;
                        i5 = 0;
                    } else {
                        i = i4 + 1;
                        while (i < str.length() && str.charAt(i) == charAt) {
                            i++;
                        }
                        i2 = i - i4;
                    }
                    if (i5 == 0) {
                        throw new java.lang.IllegalArgumentException("Pad letter 'p' must be followed by valid pad pattern: ".concat(java.lang.String.valueOf(str)));
                    }
                    padNext(i5);
                    i5 = i2;
                    i4 = i;
                }
                org.threeten.bp.temporal.TemporalField temporalField = getHighSpeedVideoSizes.get(java.lang.Character.valueOf(charAt));
                if (temporalField != null) {
                    if (charAt != 'Q') {
                        if (charAt == 'S') {
                            appendFraction(org.threeten.bp.temporal.ChronoField.NANO_OF_SECOND, i5, i5, false);
                        } else if (charAt != 'a') {
                            if (charAt != 'h' && charAt != 'k' && charAt != 'm') {
                                if (charAt != 'q') {
                                    if (charAt != 's') {
                                        if (charAt != 'u' && charAt != 'y') {
                                            switch (charAt) {
                                                case 'D':
                                                    if (i5 == 1) {
                                                        appendValue(temporalField);
                                                        break;
                                                    } else if (i5 <= 3) {
                                                        appendValue(temporalField, i5);
                                                        break;
                                                    } else {
                                                        throw new java.lang.IllegalArgumentException("Too many pattern letters: ".concat(java.lang.String.valueOf(charAt)));
                                                    }
                                                case 'E':
                                                case 'G':
                                                    if (i5 != 1 && i5 != 2 && i5 != 3) {
                                                        if (i5 == 4) {
                                                            appendText(temporalField, org.threeten.bp.format.TextStyle.FULL);
                                                            break;
                                                        } else if (i5 == 5) {
                                                            appendText(temporalField, org.threeten.bp.format.TextStyle.NARROW);
                                                            break;
                                                        } else {
                                                            throw new java.lang.IllegalArgumentException("Too many pattern letters: ".concat(java.lang.String.valueOf(charAt)));
                                                        }
                                                    } else {
                                                        appendText(temporalField, org.threeten.bp.format.TextStyle.SHORT);
                                                        break;
                                                    }
                                                case 'F':
                                                    if (i5 == 1) {
                                                        appendValue(temporalField);
                                                        break;
                                                    } else {
                                                        throw new java.lang.IllegalArgumentException("Too many pattern letters: ".concat(java.lang.String.valueOf(charAt)));
                                                    }
                                                default:
                                                    switch (charAt) {
                                                        case 'K':
                                                            break;
                                                        case 'L':
                                                            break;
                                                        case 'M':
                                                            break;
                                                        default:
                                                            switch (charAt) {
                                                                case 'c':
                                                                    if (i5 == 1) {
                                                                        getHighSpeedVideoFpsRangesFor(new org.threeten.bp.format.DateTimeFormatterBuilder.WeekFieldsPrinterParser('c', i5));
                                                                        break;
                                                                    } else {
                                                                        if (i5 == 2) {
                                                                            throw new java.lang.IllegalArgumentException("Invalid number of pattern letters: ".concat(java.lang.String.valueOf(charAt)));
                                                                        }
                                                                        if (i5 == 3) {
                                                                            appendText(temporalField, org.threeten.bp.format.TextStyle.SHORT_STANDALONE);
                                                                            break;
                                                                        } else if (i5 == 4) {
                                                                            appendText(temporalField, org.threeten.bp.format.TextStyle.FULL_STANDALONE);
                                                                            break;
                                                                        } else if (i5 == 5) {
                                                                            appendText(temporalField, org.threeten.bp.format.TextStyle.NARROW_STANDALONE);
                                                                            break;
                                                                        } else {
                                                                            throw new java.lang.IllegalArgumentException("Too many pattern letters: ".concat(java.lang.String.valueOf(charAt)));
                                                                        }
                                                                    }
                                                                case 'd':
                                                                    break;
                                                                case 'e':
                                                                    if (i5 != 1 && i5 != 2) {
                                                                        if (i5 == 3) {
                                                                            appendText(temporalField, org.threeten.bp.format.TextStyle.SHORT);
                                                                            break;
                                                                        } else if (i5 == 4) {
                                                                            appendText(temporalField, org.threeten.bp.format.TextStyle.FULL);
                                                                            break;
                                                                        } else if (i5 == 5) {
                                                                            appendText(temporalField, org.threeten.bp.format.TextStyle.NARROW);
                                                                            break;
                                                                        } else {
                                                                            throw new java.lang.IllegalArgumentException("Too many pattern letters: ".concat(java.lang.String.valueOf(charAt)));
                                                                        }
                                                                    } else {
                                                                        getHighSpeedVideoFpsRangesFor(new org.threeten.bp.format.DateTimeFormatterBuilder.WeekFieldsPrinterParser('e', i5));
                                                                        break;
                                                                    }
                                                                default:
                                                                    if (i5 == 1) {
                                                                        appendValue(temporalField);
                                                                        break;
                                                                    } else {
                                                                        appendValue(temporalField, i5);
                                                                        break;
                                                                    }
                                                            }
                                                    }
                                                case 'H':
                                                    if (i5 != 1) {
                                                        appendValue(temporalField);
                                                        break;
                                                    } else if (i5 == 2) {
                                                        appendValue(temporalField, i5);
                                                        break;
                                                    } else {
                                                        throw new java.lang.IllegalArgumentException("Too many pattern letters: ".concat(java.lang.String.valueOf(charAt)));
                                                    }
                                            }
                                        } else if (i5 == 2) {
                                            appendValueReduced(temporalField, 2, 2, org.threeten.bp.format.DateTimeFormatterBuilder.ReducedPrinterParser.getInputFormats);
                                        } else if (i5 < 4) {
                                            appendValue(temporalField, i5, 19, org.threeten.bp.format.SignStyle.NORMAL);
                                        } else {
                                            appendValue(temporalField, i5, 19, org.threeten.bp.format.SignStyle.EXCEEDS_PAD);
                                        }
                                    }
                                }
                                if (i5 == 1) {
                                    appendValue(temporalField);
                                } else if (i5 == 2) {
                                    appendValue(temporalField, 2);
                                } else if (i5 == 3) {
                                    appendText(temporalField, org.threeten.bp.format.TextStyle.SHORT_STANDALONE);
                                } else if (i5 == 4) {
                                    appendText(temporalField, org.threeten.bp.format.TextStyle.FULL_STANDALONE);
                                } else if (i5 == 5) {
                                    appendText(temporalField, org.threeten.bp.format.TextStyle.NARROW_STANDALONE);
                                } else {
                                    throw new java.lang.IllegalArgumentException("Too many pattern letters: ".concat(java.lang.String.valueOf(charAt)));
                                }
                            }
                            if (i5 != 1) {
                            }
                        } else if (i5 == 1) {
                            appendText(temporalField, org.threeten.bp.format.TextStyle.SHORT);
                        } else {
                            throw new java.lang.IllegalArgumentException("Too many pattern letters: ".concat(java.lang.String.valueOf(charAt)));
                        }
                    }
                    if (i5 == 1) {
                        appendValue(temporalField);
                    } else if (i5 == 2) {
                        appendValue(temporalField, 2);
                    } else if (i5 == 3) {
                        appendText(temporalField, org.threeten.bp.format.TextStyle.SHORT);
                    } else if (i5 == 4) {
                        appendText(temporalField, org.threeten.bp.format.TextStyle.FULL);
                    } else if (i5 == 5) {
                        appendText(temporalField, org.threeten.bp.format.TextStyle.NARROW);
                    } else {
                        throw new java.lang.IllegalArgumentException("Too many pattern letters: ".concat(java.lang.String.valueOf(charAt)));
                    }
                } else if (charAt == 'z') {
                    if (i5 > 4) {
                        throw new java.lang.IllegalArgumentException("Too many pattern letters: ".concat(java.lang.String.valueOf(charAt)));
                    }
                    if (i5 == 4) {
                        appendZoneText(org.threeten.bp.format.TextStyle.FULL);
                    } else {
                        appendZoneText(org.threeten.bp.format.TextStyle.SHORT);
                    }
                } else if (charAt != 'V') {
                    java.lang.String str2 = "+0000";
                    if (charAt == 'Z') {
                        if (i5 < 4) {
                            appendOffset("+HHMM", "+0000");
                        } else if (i5 == 4) {
                            appendLocalizedOffset(org.threeten.bp.format.TextStyle.FULL);
                        } else if (i5 == 5) {
                            appendOffset("+HH:MM:ss", "Z");
                        } else {
                            throw new java.lang.IllegalArgumentException("Too many pattern letters: ".concat(java.lang.String.valueOf(charAt)));
                        }
                    } else if (charAt == 'O') {
                        if (i5 == 1) {
                            appendLocalizedOffset(org.threeten.bp.format.TextStyle.SHORT);
                        } else if (i5 == 4) {
                            appendLocalizedOffset(org.threeten.bp.format.TextStyle.FULL);
                        } else {
                            throw new java.lang.IllegalArgumentException("Pattern letter count must be 1 or 4: ".concat(java.lang.String.valueOf(charAt)));
                        }
                    } else if (charAt == 'X') {
                        if (i5 <= 5) {
                            appendOffset(org.threeten.bp.format.DateTimeFormatterBuilder.OffsetIdPrinterParser.getHighSpeedVideoFpsRangesFor[i5 + (i5 == 1 ? 0 : 1)], "Z");
                        } else {
                            throw new java.lang.IllegalArgumentException("Too many pattern letters: ".concat(java.lang.String.valueOf(charAt)));
                        }
                    } else if (charAt == 'x') {
                        if (i5 > 5) {
                            throw new java.lang.IllegalArgumentException("Too many pattern letters: ".concat(java.lang.String.valueOf(charAt)));
                        }
                        if (i5 == 1) {
                            str2 = "+00";
                        } else if (i5 % 2 != 0) {
                            str2 = "+00:00";
                        }
                        appendOffset(org.threeten.bp.format.DateTimeFormatterBuilder.OffsetIdPrinterParser.getHighSpeedVideoFpsRangesFor[i5 + (i5 == 1 ? 0 : 1)], str2);
                    } else if (charAt == 'W') {
                        if (i5 > 1) {
                            throw new java.lang.IllegalArgumentException("Too many pattern letters: ".concat(java.lang.String.valueOf(charAt)));
                        }
                        getHighSpeedVideoFpsRangesFor(new org.threeten.bp.format.DateTimeFormatterBuilder.WeekFieldsPrinterParser('W', i5));
                    } else if (charAt == 'w') {
                        if (i5 > 2) {
                            throw new java.lang.IllegalArgumentException("Too many pattern letters: ".concat(java.lang.String.valueOf(charAt)));
                        }
                        getHighSpeedVideoFpsRangesFor(new org.threeten.bp.format.DateTimeFormatterBuilder.WeekFieldsPrinterParser('w', i5));
                    } else if (charAt == 'Y') {
                        getHighSpeedVideoFpsRangesFor(new org.threeten.bp.format.DateTimeFormatterBuilder.WeekFieldsPrinterParser(io.ktor.util.date.GMTDateParser.YEAR, i5));
                    } else {
                        throw new java.lang.IllegalArgumentException("Unknown pattern letter: ".concat(java.lang.String.valueOf(charAt)));
                    }
                } else {
                    if (i5 != 2) {
                        throw new java.lang.IllegalArgumentException("Pattern letter count must be 2: ".concat(java.lang.String.valueOf(charAt)));
                    }
                    appendZoneId();
                }
                i3 = i4 - 1;
            } else if (charAt == '\'') {
                int i6 = i3 + 1;
                int i7 = i6;
                while (i7 < str.length()) {
                    if (str.charAt(i7) == '\'') {
                        int i8 = i7 + 1;
                        if (i8 < str.length() && str.charAt(i8) == '\'') {
                            i7 = i8;
                        }
                        if (i7 < str.length()) {
                            throw new java.lang.IllegalArgumentException("Pattern ends with an incomplete string literal: ".concat(java.lang.String.valueOf(str)));
                        }
                        java.lang.String substring = str.substring(i6, i7);
                        if (substring.length() != 0) {
                            appendLiteral(substring.replace("''", "'"));
                        } else {
                            appendLiteral('\'');
                        }
                        i3 = i7;
                    }
                    i7++;
                }
                if (i7 < str.length()) {
                }
            } else if (charAt == '[') {
                optionalStart();
            } else if (charAt == ']') {
                if (this.getHighResolutionOutputSizeshNQ4ISI.getOutputMinFrameDuration == null) {
                    throw new java.lang.IllegalArgumentException("Pattern invalid as it contains ] without previous [");
                }
                optionalEnd();
            } else {
                if (charAt == '{' || charAt == '}' || charAt == '#') {
                    java.lang.StringBuilder sb = new java.lang.StringBuilder("Pattern includes reserved character: '");
                    sb.append(charAt);
                    sb.append("'");
                    throw new java.lang.IllegalArgumentException(sb.toString());
                }
                appendLiteral(charAt);
            }
            i3++;
        }
        return this;
    }

    public final org.threeten.bp.format.DateTimeFormatterBuilder padNext(int i) {
        return padNext(i, ' ');
    }

    public final org.threeten.bp.format.DateTimeFormatterBuilder padNext(int i, char c) {
        if (i <= 0) {
            throw new java.lang.IllegalArgumentException("The pad width must be at least one but was ".concat(java.lang.String.valueOf(i)));
        }
        org.threeten.bp.format.DateTimeFormatterBuilder dateTimeFormatterBuilder = this.getHighResolutionOutputSizeshNQ4ISI;
        dateTimeFormatterBuilder.getHighSpeedVideoSizesFor = i;
        dateTimeFormatterBuilder.getInputSizeshNQ4ISI = c;
        dateTimeFormatterBuilder.getOutputFormats = -1;
        return this;
    }

    public final org.threeten.bp.format.DateTimeFormatterBuilder optionalStart() {
        org.threeten.bp.format.DateTimeFormatterBuilder dateTimeFormatterBuilder = this.getHighResolutionOutputSizeshNQ4ISI;
        dateTimeFormatterBuilder.getOutputFormats = -1;
        this.getHighResolutionOutputSizeshNQ4ISI = new org.threeten.bp.format.DateTimeFormatterBuilder(dateTimeFormatterBuilder);
        return this;
    }

    public final org.threeten.bp.format.DateTimeFormatterBuilder optionalEnd() {
        org.threeten.bp.format.DateTimeFormatterBuilder dateTimeFormatterBuilder = this.getHighResolutionOutputSizeshNQ4ISI;
        if (dateTimeFormatterBuilder.getOutputMinFrameDuration == null) {
            throw new java.lang.IllegalStateException("Cannot call optionalEnd() as there was no previous call to optionalStart()");
        }
        if (dateTimeFormatterBuilder.getInputFormats.size() > 0) {
            org.threeten.bp.format.DateTimeFormatterBuilder dateTimeFormatterBuilder2 = this.getHighResolutionOutputSizeshNQ4ISI;
            org.threeten.bp.format.DateTimeFormatterBuilder.CompositePrinterParser compositePrinterParser = new org.threeten.bp.format.DateTimeFormatterBuilder.CompositePrinterParser(dateTimeFormatterBuilder2.getInputFormats, dateTimeFormatterBuilder2.getHighSpeedVideoFpsRanges);
            this.getHighResolutionOutputSizeshNQ4ISI = this.getHighResolutionOutputSizeshNQ4ISI.getOutputMinFrameDuration;
            getHighSpeedVideoFpsRangesFor(compositePrinterParser);
            return this;
        }
        this.getHighResolutionOutputSizeshNQ4ISI = this.getHighResolutionOutputSizeshNQ4ISI.getOutputMinFrameDuration;
        return this;
    }

    private int getHighSpeedVideoFpsRangesFor(org.threeten.bp.format.DateTimeFormatterBuilder.DateTimePrinterParser dateTimePrinterParser) {
        org.threeten.bp.jdk8.Jdk8Methods.requireNonNull(dateTimePrinterParser, "pp");
        org.threeten.bp.format.DateTimeFormatterBuilder dateTimeFormatterBuilder = this.getHighResolutionOutputSizeshNQ4ISI;
        int i = dateTimeFormatterBuilder.getHighSpeedVideoSizesFor;
        if (i > 0) {
            if (dateTimePrinterParser != null) {
                dateTimePrinterParser = new org.threeten.bp.format.DateTimeFormatterBuilder.PadPrinterParserDecorator(dateTimePrinterParser, i, dateTimeFormatterBuilder.getInputSizeshNQ4ISI);
            }
            org.threeten.bp.format.DateTimeFormatterBuilder dateTimeFormatterBuilder2 = this.getHighResolutionOutputSizeshNQ4ISI;
            dateTimeFormatterBuilder2.getHighSpeedVideoSizesFor = 0;
            dateTimeFormatterBuilder2.getInputSizeshNQ4ISI = (char) 0;
        }
        this.getHighResolutionOutputSizeshNQ4ISI.getInputFormats.add(dateTimePrinterParser);
        this.getHighResolutionOutputSizeshNQ4ISI.getOutputFormats = -1;
        return r4.getInputFormats.size() - 1;
    }

    public final org.threeten.bp.format.DateTimeFormatter toFormatter() {
        return toFormatter(java.util.Locale.getDefault());
    }

    public final org.threeten.bp.format.DateTimeFormatter toFormatter(java.util.Locale locale) {
        org.threeten.bp.jdk8.Jdk8Methods.requireNonNull(locale, "locale");
        while (this.getHighResolutionOutputSizeshNQ4ISI.getOutputMinFrameDuration != null) {
            optionalEnd();
        }
        return new org.threeten.bp.format.DateTimeFormatter(new org.threeten.bp.format.DateTimeFormatterBuilder.CompositePrinterParser(this.getInputFormats, false), locale, org.threeten.bp.format.DecimalStyle.STANDARD, org.threeten.bp.format.ResolverStyle.SMART, null, null, null);
    }

    static final class CompositePrinterParser implements org.threeten.bp.format.DateTimeFormatterBuilder.DateTimePrinterParser {
        final boolean Camera2StreamConfigurationMap;
        final org.threeten.bp.format.DateTimeFormatterBuilder.DateTimePrinterParser[] getHighSpeedVideoSizes;

        CompositePrinterParser(java.util.List<org.threeten.bp.format.DateTimeFormatterBuilder.DateTimePrinterParser> list, boolean z) {
            this((org.threeten.bp.format.DateTimeFormatterBuilder.DateTimePrinterParser[]) list.toArray(new org.threeten.bp.format.DateTimeFormatterBuilder.DateTimePrinterParser[list.size()]), z);
        }

        CompositePrinterParser(org.threeten.bp.format.DateTimeFormatterBuilder.DateTimePrinterParser[] dateTimePrinterParserArr, boolean z) {
            this.getHighSpeedVideoSizes = dateTimePrinterParserArr;
            this.Camera2StreamConfigurationMap = z;
        }

        @Override // org.threeten.bp.format.DateTimeFormatterBuilder.DateTimePrinterParser
        public final boolean Camera2StreamConfigurationMap(org.threeten.bp.format.DateTimePrintContext dateTimePrintContext, java.lang.StringBuilder sb) {
            int length = sb.length();
            if (this.Camera2StreamConfigurationMap) {
                dateTimePrintContext.getHighSpeedVideoFpsRangesFor++;
            }
            try {
                for (org.threeten.bp.format.DateTimeFormatterBuilder.DateTimePrinterParser dateTimePrinterParser : this.getHighSpeedVideoSizes) {
                    if (!dateTimePrinterParser.Camera2StreamConfigurationMap(dateTimePrintContext, sb)) {
                        sb.setLength(length);
                        return true;
                    }
                }
                if (this.Camera2StreamConfigurationMap) {
                    dateTimePrintContext.getHighSpeedVideoFpsRangesFor--;
                }
                return true;
            } finally {
                if (this.Camera2StreamConfigurationMap) {
                    dateTimePrintContext.getHighSpeedVideoFpsRangesFor--;
                }
            }
        }

        @Override // org.threeten.bp.format.DateTimeFormatterBuilder.DateTimePrinterParser
        public final int getHighSpeedVideoFpsRanges(org.threeten.bp.format.DateTimeParseContext dateTimeParseContext, java.lang.CharSequence charSequence, int i) {
            if (!this.Camera2StreamConfigurationMap) {
                for (org.threeten.bp.format.DateTimeFormatterBuilder.DateTimePrinterParser dateTimePrinterParser : this.getHighSpeedVideoSizes) {
                    i = dateTimePrinterParser.getHighSpeedVideoFpsRanges(dateTimeParseContext, charSequence, i);
                    if (i < 0) {
                        return i;
                    }
                }
                return i;
            }
            java.util.ArrayList<org.threeten.bp.format.DateTimeParseContext.Parsed> arrayList = dateTimeParseContext.getHighSpeedVideoFpsRangesFor;
            java.util.ArrayList<org.threeten.bp.format.DateTimeParseContext.Parsed> arrayList2 = dateTimeParseContext.getHighSpeedVideoFpsRangesFor;
            org.threeten.bp.format.DateTimeParseContext.Parsed parsed = arrayList2.get(arrayList2.size() - 1);
            org.threeten.bp.format.DateTimeParseContext.Parsed parsed2 = org.threeten.bp.format.DateTimeParseContext.this.new Parsed();
            parsed2.getHighResolutionOutputSizeshNQ4ISI = parsed.getHighResolutionOutputSizeshNQ4ISI;
            parsed2.getHighSpeedVideoSizesFor = parsed.getHighSpeedVideoSizesFor;
            parsed2.getHighSpeedVideoFpsRanges.putAll(parsed.getHighSpeedVideoFpsRanges);
            parsed2.Camera2StreamConfigurationMap = parsed.Camera2StreamConfigurationMap;
            arrayList.add(parsed2);
            int i2 = i;
            for (org.threeten.bp.format.DateTimeFormatterBuilder.DateTimePrinterParser dateTimePrinterParser2 : this.getHighSpeedVideoSizes) {
                i2 = dateTimePrinterParser2.getHighSpeedVideoFpsRanges(dateTimeParseContext, charSequence, i2);
                if (i2 < 0) {
                    dateTimeParseContext.getHighSpeedVideoFpsRangesFor(false);
                    return i;
                }
            }
            dateTimeParseContext.getHighSpeedVideoFpsRangesFor(true);
            return i2;
        }

        public final java.lang.String toString() {
            java.lang.StringBuilder sb = new java.lang.StringBuilder();
            if (this.getHighSpeedVideoSizes != null) {
                sb.append(this.Camera2StreamConfigurationMap ? "[" : "(");
                for (org.threeten.bp.format.DateTimeFormatterBuilder.DateTimePrinterParser dateTimePrinterParser : this.getHighSpeedVideoSizes) {
                    sb.append(dateTimePrinterParser);
                }
                sb.append(this.Camera2StreamConfigurationMap ? "]" : ")");
            }
            return sb.toString();
        }
    }

    static final class PadPrinterParserDecorator implements org.threeten.bp.format.DateTimeFormatterBuilder.DateTimePrinterParser {
        private final char Camera2StreamConfigurationMap;
        private final org.threeten.bp.format.DateTimeFormatterBuilder.DateTimePrinterParser getHighSpeedVideoFpsRanges;
        private final int getHighSpeedVideoSizes;

        PadPrinterParserDecorator(org.threeten.bp.format.DateTimeFormatterBuilder.DateTimePrinterParser dateTimePrinterParser, int i, char c) {
            this.getHighSpeedVideoFpsRanges = dateTimePrinterParser;
            this.getHighSpeedVideoSizes = i;
            this.Camera2StreamConfigurationMap = c;
        }

        @Override // org.threeten.bp.format.DateTimeFormatterBuilder.DateTimePrinterParser
        public final boolean Camera2StreamConfigurationMap(org.threeten.bp.format.DateTimePrintContext dateTimePrintContext, java.lang.StringBuilder sb) {
            int length = sb.length();
            if (!this.getHighSpeedVideoFpsRanges.Camera2StreamConfigurationMap(dateTimePrintContext, sb)) {
                return false;
            }
            int length2 = sb.length() - length;
            if (length2 > this.getHighSpeedVideoSizes) {
                java.lang.StringBuilder sb2 = new java.lang.StringBuilder("Cannot print as output of ");
                sb2.append(length2);
                sb2.append(" characters exceeds pad width of ");
                sb2.append(this.getHighSpeedVideoSizes);
                throw new org.threeten.bp.DateTimeException(sb2.toString());
            }
            for (int i = 0; i < this.getHighSpeedVideoSizes - length2; i++) {
                sb.insert(length, this.Camera2StreamConfigurationMap);
            }
            return true;
        }

        public final java.lang.String toString() {
            java.lang.String obj;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("Pad(");
            sb.append(this.getHighSpeedVideoFpsRanges);
            sb.append(",");
            sb.append(this.getHighSpeedVideoSizes);
            if (this.Camera2StreamConfigurationMap == ' ') {
                obj = ")";
            } else {
                java.lang.StringBuilder sb2 = new java.lang.StringBuilder(",'");
                sb2.append(this.Camera2StreamConfigurationMap);
                sb2.append("')");
                obj = sb2.toString();
            }
            sb.append(obj);
            return sb.toString();
        }

        @Override // org.threeten.bp.format.DateTimeFormatterBuilder.DateTimePrinterParser
        public final int getHighSpeedVideoFpsRanges(org.threeten.bp.format.DateTimeParseContext dateTimeParseContext, java.lang.CharSequence charSequence, int i) {
            boolean z = dateTimeParseContext.getHighResolutionOutputSizeshNQ4ISI;
            boolean z2 = dateTimeParseContext.getHighSpeedVideoSizes;
            if (i > charSequence.length()) {
                throw new java.lang.IndexOutOfBoundsException();
            }
            if (i == charSequence.length()) {
                return ~i;
            }
            int i2 = this.getHighSpeedVideoSizes + i;
            if (i2 > charSequence.length()) {
                if (z) {
                    return ~i;
                }
                i2 = charSequence.length();
            }
            int i3 = i;
            while (i3 < i2) {
                if (z2) {
                    if (charSequence.charAt(i3) != this.Camera2StreamConfigurationMap) {
                        break;
                    }
                    i3++;
                } else {
                    char charAt = charSequence.charAt(i3);
                    char c = this.Camera2StreamConfigurationMap;
                    if (!dateTimeParseContext.getHighSpeedVideoSizes) {
                        if (!org.threeten.bp.format.DateTimeParseContext.Camera2StreamConfigurationMap(charAt, c)) {
                            break;
                        }
                        i3++;
                    } else {
                        if (charAt != c) {
                            break;
                        }
                        i3++;
                    }
                }
            }
            int highSpeedVideoFpsRanges = this.getHighSpeedVideoFpsRanges.getHighSpeedVideoFpsRanges(dateTimeParseContext, charSequence.subSequence(0, i2), i3);
            return (highSpeedVideoFpsRanges == i2 || !z) ? highSpeedVideoFpsRanges : ~(i + i3);
        }
    }

    enum SettingsParser implements org.threeten.bp.format.DateTimeFormatterBuilder.DateTimePrinterParser {
        SENSITIVE,
        INSENSITIVE,
        STRICT,
        LENIENT;

        @Override // org.threeten.bp.format.DateTimeFormatterBuilder.DateTimePrinterParser
        public final boolean Camera2StreamConfigurationMap(org.threeten.bp.format.DateTimePrintContext dateTimePrintContext, java.lang.StringBuilder sb) {
            return true;
        }

        @Override // org.threeten.bp.format.DateTimeFormatterBuilder.DateTimePrinterParser
        public final int getHighSpeedVideoFpsRanges(org.threeten.bp.format.DateTimeParseContext dateTimeParseContext, java.lang.CharSequence charSequence, int i) {
            int ordinal = ordinal();
            if (ordinal == 0) {
                dateTimeParseContext.getHighSpeedVideoSizes = true;
                return i;
            }
            if (ordinal == 1) {
                dateTimeParseContext.getHighSpeedVideoSizes = false;
                return i;
            }
            if (ordinal == 2) {
                dateTimeParseContext.getHighResolutionOutputSizeshNQ4ISI = true;
                return i;
            }
            if (ordinal != 3) {
                return i;
            }
            dateTimeParseContext.getHighResolutionOutputSizeshNQ4ISI = false;
            return i;
        }

        @Override // java.lang.Enum
        public final java.lang.String toString() {
            int ordinal = ordinal();
            if (ordinal == 0) {
                return "ParseCaseSensitive(true)";
            }
            if (ordinal == 1) {
                return "ParseCaseSensitive(false)";
            }
            if (ordinal == 2) {
                return "ParseStrict(true)";
            }
            if (ordinal == 3) {
                return "ParseStrict(false)";
            }
            throw new java.lang.IllegalStateException("Unreachable");
        }
    }

    static class DefaultingParser implements org.threeten.bp.format.DateTimeFormatterBuilder.DateTimePrinterParser {
        private final long Camera2StreamConfigurationMap;
        private final org.threeten.bp.temporal.TemporalField getHighSpeedVideoFpsRangesFor;

        @Override // org.threeten.bp.format.DateTimeFormatterBuilder.DateTimePrinterParser
        public final boolean Camera2StreamConfigurationMap(org.threeten.bp.format.DateTimePrintContext dateTimePrintContext, java.lang.StringBuilder sb) {
            return true;
        }

        DefaultingParser(org.threeten.bp.temporal.TemporalField temporalField, long j) {
            this.getHighSpeedVideoFpsRangesFor = temporalField;
            this.Camera2StreamConfigurationMap = j;
        }

        @Override // org.threeten.bp.format.DateTimeFormatterBuilder.DateTimePrinterParser
        public final int getHighSpeedVideoFpsRanges(org.threeten.bp.format.DateTimeParseContext dateTimeParseContext, java.lang.CharSequence charSequence, int i) {
            if (dateTimeParseContext.getHighSpeedVideoFpsRangesFor.get(r0.size() - 1).getHighSpeedVideoFpsRanges.get(this.getHighSpeedVideoFpsRangesFor) == null) {
                dateTimeParseContext.getHighResolutionOutputSizeshNQ4ISI(this.getHighSpeedVideoFpsRangesFor, this.Camera2StreamConfigurationMap, i, i);
            }
            return i;
        }
    }

    static final class CharLiteralPrinterParser implements org.threeten.bp.format.DateTimeFormatterBuilder.DateTimePrinterParser {
        private final char getHighResolutionOutputSizeshNQ4ISI;

        CharLiteralPrinterParser(char c) {
            this.getHighResolutionOutputSizeshNQ4ISI = c;
        }

        @Override // org.threeten.bp.format.DateTimeFormatterBuilder.DateTimePrinterParser
        public final boolean Camera2StreamConfigurationMap(org.threeten.bp.format.DateTimePrintContext dateTimePrintContext, java.lang.StringBuilder sb) {
            sb.append(this.getHighResolutionOutputSizeshNQ4ISI);
            return true;
        }

        @Override // org.threeten.bp.format.DateTimeFormatterBuilder.DateTimePrinterParser
        public final int getHighSpeedVideoFpsRanges(org.threeten.bp.format.DateTimeParseContext dateTimeParseContext, java.lang.CharSequence charSequence, int i) {
            if (i == charSequence.length()) {
                return ~i;
            }
            char charAt = charSequence.charAt(i);
            char c = this.getHighResolutionOutputSizeshNQ4ISI;
            return (!dateTimeParseContext.getHighSpeedVideoSizes ? !org.threeten.bp.format.DateTimeParseContext.Camera2StreamConfigurationMap(c, charAt) : c != charAt) ? i + 1 : ~i;
        }

        public final java.lang.String toString() {
            if (this.getHighResolutionOutputSizeshNQ4ISI == '\'') {
                return "''";
            }
            java.lang.StringBuilder sb = new java.lang.StringBuilder("'");
            sb.append(this.getHighResolutionOutputSizeshNQ4ISI);
            sb.append("'");
            return sb.toString();
        }
    }

    static final class StringLiteralPrinterParser implements org.threeten.bp.format.DateTimeFormatterBuilder.DateTimePrinterParser {
        private final java.lang.String getHighResolutionOutputSizeshNQ4ISI;

        StringLiteralPrinterParser(java.lang.String str) {
            this.getHighResolutionOutputSizeshNQ4ISI = str;
        }

        @Override // org.threeten.bp.format.DateTimeFormatterBuilder.DateTimePrinterParser
        public final boolean Camera2StreamConfigurationMap(org.threeten.bp.format.DateTimePrintContext dateTimePrintContext, java.lang.StringBuilder sb) {
            sb.append(this.getHighResolutionOutputSizeshNQ4ISI);
            return true;
        }

        @Override // org.threeten.bp.format.DateTimeFormatterBuilder.DateTimePrinterParser
        public final int getHighSpeedVideoFpsRanges(org.threeten.bp.format.DateTimeParseContext dateTimeParseContext, java.lang.CharSequence charSequence, int i) {
            if (i > charSequence.length() || i < 0) {
                throw new java.lang.IndexOutOfBoundsException();
            }
            java.lang.String str = this.getHighResolutionOutputSizeshNQ4ISI;
            return !dateTimeParseContext.Camera2StreamConfigurationMap(charSequence, i, str, 0, str.length()) ? ~i : i + this.getHighResolutionOutputSizeshNQ4ISI.length();
        }

        public final java.lang.String toString() {
            java.lang.String replace = this.getHighResolutionOutputSizeshNQ4ISI.replace("'", "''");
            java.lang.StringBuilder sb = new java.lang.StringBuilder("'");
            sb.append(replace);
            sb.append("'");
            return sb.toString();
        }
    }

    static class NumberPrinterParser implements org.threeten.bp.format.DateTimeFormatterBuilder.DateTimePrinterParser {
        static final int[] getHighSpeedVideoFpsRanges = {0, 10, 100, 1000, 10000, androidx.compose.ui.platform.AndroidComposeViewAccessibilityDelegateCompat.ParcelSafeTextLength, 1000000, androidx.camera.video.internal.workaround.DefaultEncoderProfilesProvider.DEFAULT_VIDEO_BITRATE_FHD, 100000000, 1000000000};
        final org.threeten.bp.format.SignStyle Camera2StreamConfigurationMap;
        final org.threeten.bp.temporal.TemporalField getHighResolutionOutputSizeshNQ4ISI;
        final int getHighSpeedVideoFpsRangesFor;
        final int getHighSpeedVideoSizes;
        final int getHighSpeedVideoSizesFor;

        long getHighSpeedVideoFpsRanges(org.threeten.bp.format.DateTimePrintContext dateTimePrintContext, long j) {
            return j;
        }

        /* synthetic */ NumberPrinterParser(org.threeten.bp.temporal.TemporalField temporalField, int i, int i2, org.threeten.bp.format.SignStyle signStyle, int i3, byte b) {
            this(temporalField, i, i2, signStyle, i3);
        }

        NumberPrinterParser(org.threeten.bp.temporal.TemporalField temporalField, int i, int i2, org.threeten.bp.format.SignStyle signStyle) {
            this.getHighResolutionOutputSizeshNQ4ISI = temporalField;
            this.getHighSpeedVideoFpsRangesFor = i;
            this.getHighSpeedVideoSizes = i2;
            this.Camera2StreamConfigurationMap = signStyle;
            this.getHighSpeedVideoSizesFor = 0;
        }

        private NumberPrinterParser(org.threeten.bp.temporal.TemporalField temporalField, int i, int i2, org.threeten.bp.format.SignStyle signStyle, int i3) {
            this.getHighResolutionOutputSizeshNQ4ISI = temporalField;
            this.getHighSpeedVideoFpsRangesFor = i;
            this.getHighSpeedVideoSizes = i2;
            this.Camera2StreamConfigurationMap = signStyle;
            this.getHighSpeedVideoSizesFor = i3;
        }

        org.threeten.bp.format.DateTimeFormatterBuilder.NumberPrinterParser getHighSpeedVideoFpsRangesFor() {
            return this.getHighSpeedVideoSizesFor == -1 ? this : new org.threeten.bp.format.DateTimeFormatterBuilder.NumberPrinterParser(this.getHighResolutionOutputSizeshNQ4ISI, this.getHighSpeedVideoFpsRangesFor, this.getHighSpeedVideoSizes, this.Camera2StreamConfigurationMap, -1);
        }

        org.threeten.bp.format.DateTimeFormatterBuilder.NumberPrinterParser getHighResolutionOutputSizeshNQ4ISI(int i) {
            return new org.threeten.bp.format.DateTimeFormatterBuilder.NumberPrinterParser(this.getHighResolutionOutputSizeshNQ4ISI, this.getHighSpeedVideoFpsRangesFor, this.getHighSpeedVideoSizes, this.Camera2StreamConfigurationMap, this.getHighSpeedVideoSizesFor + i);
        }

        @Override // org.threeten.bp.format.DateTimeFormatterBuilder.DateTimePrinterParser
        public final boolean Camera2StreamConfigurationMap(org.threeten.bp.format.DateTimePrintContext dateTimePrintContext, java.lang.StringBuilder sb) {
            java.lang.Long Camera2StreamConfigurationMap = dateTimePrintContext.Camera2StreamConfigurationMap(this.getHighResolutionOutputSizeshNQ4ISI);
            if (Camera2StreamConfigurationMap == null) {
                return false;
            }
            long highSpeedVideoFpsRanges = getHighSpeedVideoFpsRanges(dateTimePrintContext, Camera2StreamConfigurationMap.longValue());
            org.threeten.bp.format.DecimalStyle decimalStyle = dateTimePrintContext.getHighSpeedVideoFpsRanges;
            java.lang.String l = highSpeedVideoFpsRanges == Long.MIN_VALUE ? "9223372036854775808" : java.lang.Long.toString(java.lang.Math.abs(highSpeedVideoFpsRanges));
            if (l.length() > this.getHighSpeedVideoSizes) {
                java.lang.StringBuilder sb2 = new java.lang.StringBuilder("Field ");
                sb2.append(this.getHighResolutionOutputSizeshNQ4ISI);
                sb2.append(" cannot be printed as the value ");
                sb2.append(highSpeedVideoFpsRanges);
                sb2.append(" exceeds the maximum print width of ");
                sb2.append(this.getHighSpeedVideoSizes);
                throw new org.threeten.bp.DateTimeException(sb2.toString());
            }
            java.lang.String highSpeedVideoSizes = decimalStyle.getHighSpeedVideoSizes(l);
            if (highSpeedVideoFpsRanges >= 0) {
                int i = org.threeten.bp.format.DateTimeFormatterBuilder.AnonymousClass4.Camera2StreamConfigurationMap[this.Camera2StreamConfigurationMap.ordinal()];
                if (i == 1) {
                    if (this.getHighSpeedVideoFpsRangesFor < 19 && highSpeedVideoFpsRanges >= getHighSpeedVideoFpsRanges[r4]) {
                        sb.append(decimalStyle.getPositiveSign());
                    }
                } else if (i == 2) {
                    sb.append(decimalStyle.getPositiveSign());
                }
            } else {
                int i2 = org.threeten.bp.format.DateTimeFormatterBuilder.AnonymousClass4.Camera2StreamConfigurationMap[this.Camera2StreamConfigurationMap.ordinal()];
                if (i2 == 1 || i2 == 2 || i2 == 3) {
                    sb.append(decimalStyle.getNegativeSign());
                } else if (i2 == 4) {
                    java.lang.StringBuilder sb3 = new java.lang.StringBuilder("Field ");
                    sb3.append(this.getHighResolutionOutputSizeshNQ4ISI);
                    sb3.append(" cannot be printed as the value ");
                    sb3.append(highSpeedVideoFpsRanges);
                    sb3.append(" cannot be negative according to the SignStyle");
                    throw new org.threeten.bp.DateTimeException(sb3.toString());
                }
            }
            for (int i3 = 0; i3 < this.getHighSpeedVideoFpsRangesFor - highSpeedVideoSizes.length(); i3++) {
                sb.append(decimalStyle.getZeroDigit());
            }
            sb.append(highSpeedVideoSizes);
            return true;
        }

        boolean getHighResolutionOutputSizeshNQ4ISI(org.threeten.bp.format.DateTimeParseContext dateTimeParseContext) {
            int i = this.getHighSpeedVideoSizesFor;
            if (i != -1) {
                return i > 0 && this.getHighSpeedVideoFpsRangesFor == this.getHighSpeedVideoSizes && this.Camera2StreamConfigurationMap == org.threeten.bp.format.SignStyle.NOT_NEGATIVE;
            }
            return true;
        }

        /* JADX WARN: Code restructure failed: missing block: B:55:0x00f9, code lost:
        
            r5 = r12;
            r7 = r16;
         */
        /* JADX WARN: Code restructure failed: missing block: B:56:0x0100, code lost:
        
            if (r0 == false) goto L95;
         */
        /* JADX WARN: Code restructure failed: missing block: B:57:0x0102, code lost:
        
            if (r13 == null) goto L88;
         */
        /* JADX WARN: Code restructure failed: missing block: B:59:0x010a, code lost:
        
            if (r13.equals(java.math.BigInteger.ZERO) == false) goto L87;
         */
        /* JADX WARN: Code restructure failed: missing block: B:61:0x010e, code lost:
        
            if (r22.getHighResolutionOutputSizeshNQ4ISI == false) goto L87;
         */
        /* JADX WARN: Code restructure failed: missing block: B:63:0x0113, code lost:
        
            return ~(r4 - 1);
         */
        /* JADX WARN: Code restructure failed: missing block: B:64:0x0114, code lost:
        
            r13 = r13.negate();
         */
        /* JADX WARN: Code restructure failed: missing block: B:65:0x0145, code lost:
        
            r2 = r7;
         */
        /* JADX WARN: Code restructure failed: missing block: B:66:0x0146, code lost:
        
            if (r13 == null) goto L116;
         */
        /* JADX WARN: Code restructure failed: missing block: B:68:0x014e, code lost:
        
            if (r13.bitLength() <= 63) goto L114;
         */
        /* JADX WARN: Code restructure failed: missing block: B:69:0x0150, code lost:
        
            r13 = r13.divide(java.math.BigInteger.TEN);
            r5 = r5 - 1;
         */
        /* JADX WARN: Code restructure failed: missing block: B:71:0x0164, code lost:
        
            return getHighResolutionOutputSizeshNQ4ISI(r22, r13.longValue(), r4, r5);
         */
        /* JADX WARN: Code restructure failed: missing block: B:73:0x016d, code lost:
        
            return getHighResolutionOutputSizeshNQ4ISI(r22, r2, r4, r5);
         */
        /* JADX WARN: Code restructure failed: missing block: B:75:0x011e, code lost:
        
            if (r7 != 0) goto L94;
         */
        /* JADX WARN: Code restructure failed: missing block: B:77:0x0122, code lost:
        
            if (r22.getHighResolutionOutputSizeshNQ4ISI == false) goto L94;
         */
        /* JADX WARN: Code restructure failed: missing block: B:79:0x0126, code lost:
        
            return ~(r4 - 1);
         */
        /* JADX WARN: Code restructure failed: missing block: B:80:0x0127, code lost:
        
            r2 = -r7;
         */
        /* JADX WARN: Code restructure failed: missing block: B:82:0x012d, code lost:
        
            if (r21.Camera2StreamConfigurationMap != org.threeten.bp.format.SignStyle.EXCEEDS_PAD) goto L109;
         */
        /* JADX WARN: Code restructure failed: missing block: B:84:0x0131, code lost:
        
            if (r22.getHighResolutionOutputSizeshNQ4ISI == false) goto L109;
         */
        /* JADX WARN: Code restructure failed: missing block: B:85:0x0133, code lost:
        
            r0 = r5 - r4;
         */
        /* JADX WARN: Code restructure failed: missing block: B:86:0x0135, code lost:
        
            if (r3 == false) goto L105;
         */
        /* JADX WARN: Code restructure failed: missing block: B:88:0x0139, code lost:
        
            if (r0 > r21.getHighSpeedVideoFpsRangesFor) goto L109;
         */
        /* JADX WARN: Code restructure failed: missing block: B:90:0x013e, code lost:
        
            return ~(r4 - 1);
         */
        /* JADX WARN: Code restructure failed: missing block: B:92:0x0141, code lost:
        
            if (r0 <= r21.getHighSpeedVideoFpsRangesFor) goto L109;
         */
        /* JADX WARN: Code restructure failed: missing block: B:94:0x0144, code lost:
        
            return ~r4;
         */
        @Override // org.threeten.bp.format.DateTimeFormatterBuilder.DateTimePrinterParser
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final int getHighSpeedVideoFpsRanges(org.threeten.bp.format.DateTimeParseContext dateTimeParseContext, java.lang.CharSequence charSequence, int i) {
            int i2;
            boolean z;
            boolean z2;
            int length = charSequence.length();
            if (i != length) {
                char charAt = charSequence.charAt(i);
                int i3 = 0;
                if (charAt == dateTimeParseContext.getOutputFormats.getPositiveSign()) {
                    if (!this.Camera2StreamConfigurationMap.getHighSpeedVideoFpsRanges(true, dateTimeParseContext.getHighResolutionOutputSizeshNQ4ISI, this.getHighSpeedVideoFpsRangesFor == this.getHighSpeedVideoSizes)) {
                        return ~i;
                    }
                    i2 = i + 1;
                    z = false;
                    z2 = true;
                } else if (charAt == dateTimeParseContext.getOutputFormats.getNegativeSign()) {
                    if (!this.Camera2StreamConfigurationMap.getHighSpeedVideoFpsRanges(false, dateTimeParseContext.getHighResolutionOutputSizeshNQ4ISI, this.getHighSpeedVideoFpsRangesFor == this.getHighSpeedVideoSizes)) {
                        return ~i;
                    }
                    i2 = i + 1;
                    z2 = false;
                    z = true;
                } else {
                    if (this.Camera2StreamConfigurationMap == org.threeten.bp.format.SignStyle.ALWAYS && dateTimeParseContext.getHighResolutionOutputSizeshNQ4ISI) {
                        return ~i;
                    }
                    i2 = i;
                    z = false;
                    z2 = false;
                }
                int i4 = (dateTimeParseContext.getHighResolutionOutputSizeshNQ4ISI || getHighResolutionOutputSizeshNQ4ISI(dateTimeParseContext)) ? this.getHighSpeedVideoFpsRangesFor : 1;
                int i5 = i2 + i4;
                if (i5 <= length) {
                    int i6 = 9;
                    int max = ((dateTimeParseContext.getHighResolutionOutputSizeshNQ4ISI || getHighResolutionOutputSizeshNQ4ISI(dateTimeParseContext)) ? this.getHighSpeedVideoSizes : 9) + java.lang.Math.max(this.getHighSpeedVideoSizesFor, 0);
                    while (true) {
                        java.math.BigInteger bigInteger = null;
                        if (i3 >= 2) {
                            int i7 = i2;
                            long j = 0;
                            break;
                        }
                        int min = java.lang.Math.min(max + i2, length);
                        int i8 = i2;
                        long j2 = 0;
                        while (true) {
                            if (i8 >= min) {
                                break;
                            }
                            int i9 = i8 + 1;
                            int charAt2 = charSequence.charAt(i8) - dateTimeParseContext.getOutputFormats.getHighSpeedVideoFpsRangesFor;
                            if (charAt2 < 0 || charAt2 > i6) {
                                charAt2 = -1;
                            }
                            if (charAt2 >= 0) {
                                if (i9 - i2 > 18) {
                                    if (bigInteger == null) {
                                        bigInteger = java.math.BigInteger.valueOf(j2);
                                    }
                                    bigInteger = bigInteger.multiply(java.math.BigInteger.TEN).add(java.math.BigInteger.valueOf(charAt2));
                                } else {
                                    j2 = (j2 * 10) + charAt2;
                                }
                                i8 = i9;
                                i6 = 9;
                            } else if (i8 < i5) {
                                return ~i2;
                            }
                        }
                        int i10 = this.getHighSpeedVideoSizesFor;
                        if (i10 <= 0 || i3 != 0) {
                            break;
                        }
                        max = java.lang.Math.max(i4, (i8 - i2) - i10);
                        i3++;
                        i6 = 9;
                    }
                } else {
                    return ~i2;
                }
            } else {
                return ~i;
            }
        }

        int getHighResolutionOutputSizeshNQ4ISI(org.threeten.bp.format.DateTimeParseContext dateTimeParseContext, long j, int i, int i2) {
            return dateTimeParseContext.getHighResolutionOutputSizeshNQ4ISI(this.getHighResolutionOutputSizeshNQ4ISI, j, i, i2);
        }

        public java.lang.String toString() {
            if (this.getHighSpeedVideoFpsRangesFor == 1 && this.getHighSpeedVideoSizes == 19 && this.Camera2StreamConfigurationMap == org.threeten.bp.format.SignStyle.NORMAL) {
                java.lang.StringBuilder sb = new java.lang.StringBuilder("Value(");
                sb.append(this.getHighResolutionOutputSizeshNQ4ISI);
                sb.append(")");
                return sb.toString();
            }
            if (this.getHighSpeedVideoFpsRangesFor == this.getHighSpeedVideoSizes && this.Camera2StreamConfigurationMap == org.threeten.bp.format.SignStyle.NOT_NEGATIVE) {
                java.lang.StringBuilder sb2 = new java.lang.StringBuilder("Value(");
                sb2.append(this.getHighResolutionOutputSizeshNQ4ISI);
                sb2.append(",");
                sb2.append(this.getHighSpeedVideoFpsRangesFor);
                sb2.append(")");
                return sb2.toString();
            }
            java.lang.StringBuilder sb3 = new java.lang.StringBuilder("Value(");
            sb3.append(this.getHighResolutionOutputSizeshNQ4ISI);
            sb3.append(",");
            sb3.append(this.getHighSpeedVideoFpsRangesFor);
            sb3.append(",");
            sb3.append(this.getHighSpeedVideoSizes);
            sb3.append(",");
            sb3.append(this.Camera2StreamConfigurationMap);
            sb3.append(")");
            return sb3.toString();
        }
    }

    /* renamed from: org.threeten.bp.format.DateTimeFormatterBuilder$4, reason: invalid class name */
    static /* synthetic */ class AnonymousClass4 {
        static final /* synthetic */ int[] Camera2StreamConfigurationMap;

        static {
            int[] iArr = new int[org.threeten.bp.format.SignStyle.values().length];
            Camera2StreamConfigurationMap = iArr;
            try {
                iArr[org.threeten.bp.format.SignStyle.EXCEEDS_PAD.ordinal()] = 1;
            } catch (java.lang.NoSuchFieldError unused) {
            }
            try {
                Camera2StreamConfigurationMap[org.threeten.bp.format.SignStyle.ALWAYS.ordinal()] = 2;
            } catch (java.lang.NoSuchFieldError unused2) {
            }
            try {
                Camera2StreamConfigurationMap[org.threeten.bp.format.SignStyle.NORMAL.ordinal()] = 3;
            } catch (java.lang.NoSuchFieldError unused3) {
            }
            try {
                Camera2StreamConfigurationMap[org.threeten.bp.format.SignStyle.NOT_NEGATIVE.ordinal()] = 4;
            } catch (java.lang.NoSuchFieldError unused4) {
            }
        }
    }

    static final class ReducedPrinterParser extends org.threeten.bp.format.DateTimeFormatterBuilder.NumberPrinterParser {
        static final org.threeten.bp.LocalDate getInputFormats = org.threeten.bp.LocalDate.of(2000, 1, 1);
        private final int getOutputFormats;
        private final org.threeten.bp.chrono.ChronoLocalDate getOutputMinFrameDuration;

        ReducedPrinterParser(org.threeten.bp.temporal.TemporalField temporalField, int i, int i2, int i3, org.threeten.bp.chrono.ChronoLocalDate chronoLocalDate) {
            super(temporalField, i, i2, org.threeten.bp.format.SignStyle.NOT_NEGATIVE);
            if (i <= 0 || i > 10) {
                throw new java.lang.IllegalArgumentException("The width must be from 1 to 10 inclusive but was ".concat(java.lang.String.valueOf(i)));
            }
            if (i2 <= 0 || i2 > 10) {
                throw new java.lang.IllegalArgumentException("The maxWidth must be from 1 to 10 inclusive but was ".concat(java.lang.String.valueOf(i2)));
            }
            if (i2 < i) {
                throw new java.lang.IllegalArgumentException("The maxWidth must be greater than the width");
            }
            if (chronoLocalDate == null) {
                long j = i3;
                if (!temporalField.range().isValidValue(j)) {
                    throw new java.lang.IllegalArgumentException("The base value must be within the range of the field");
                }
                if (j + getHighSpeedVideoFpsRanges[i] > androidx.collection.SieveCacheKt.NodeLinkMask) {
                    throw new org.threeten.bp.DateTimeException("Unable to add printer-parser as the range exceeds the capacity of an int");
                }
            }
            this.getOutputFormats = i3;
            this.getOutputMinFrameDuration = chronoLocalDate;
        }

        private ReducedPrinterParser(org.threeten.bp.temporal.TemporalField temporalField, int i, int i2, int i3, org.threeten.bp.chrono.ChronoLocalDate chronoLocalDate, int i4) {
            super(temporalField, i, i2, org.threeten.bp.format.SignStyle.NOT_NEGATIVE, i4, (byte) 0);
            this.getOutputFormats = i3;
            this.getOutputMinFrameDuration = chronoLocalDate;
        }

        @Override // org.threeten.bp.format.DateTimeFormatterBuilder.NumberPrinterParser
        final long getHighSpeedVideoFpsRanges(org.threeten.bp.format.DateTimePrintContext dateTimePrintContext, long j) {
            long abs = java.lang.Math.abs(j);
            int i = this.getOutputFormats;
            if (this.getOutputMinFrameDuration != null) {
                i = org.threeten.bp.chrono.Chronology.from(dateTimePrintContext.getHighResolutionOutputSizeshNQ4ISI).date(this.getOutputMinFrameDuration).get(this.getHighResolutionOutputSizeshNQ4ISI);
            }
            if (j >= i && j < i + getHighSpeedVideoFpsRanges[this.getHighSpeedVideoFpsRangesFor]) {
                return abs % getHighSpeedVideoFpsRanges[this.getHighSpeedVideoFpsRangesFor];
            }
            return abs % getHighSpeedVideoFpsRanges[this.getHighSpeedVideoSizes];
        }

        @Override // org.threeten.bp.format.DateTimeFormatterBuilder.NumberPrinterParser
        final int getHighResolutionOutputSizeshNQ4ISI(org.threeten.bp.format.DateTimeParseContext dateTimeParseContext, long j, int i, int i2) {
            int i3 = this.getOutputFormats;
            if (this.getOutputMinFrameDuration != null) {
                org.threeten.bp.chrono.Chronology chronology = dateTimeParseContext.getHighSpeedVideoFpsRangesFor.get(r0.size() - 1).getHighResolutionOutputSizeshNQ4ISI;
                if (chronology == null && (chronology = dateTimeParseContext.Camera2StreamConfigurationMap) == null) {
                    chronology = org.threeten.bp.chrono.IsoChronology.INSTANCE;
                }
                i3 = chronology.date(this.getOutputMinFrameDuration).get(this.getHighResolutionOutputSizeshNQ4ISI);
                dateTimeParseContext.getHighSpeedVideoFpsRanges(this, j, i, i2);
            }
            if (i2 - i == this.getHighSpeedVideoFpsRangesFor && j >= 0) {
                long j2 = getHighSpeedVideoFpsRanges[this.getHighSpeedVideoFpsRangesFor];
                long j3 = i3;
                long j4 = j3 - (j3 % j2);
                j = i3 > 0 ? j4 + j : j4 - j;
                if (j < j3) {
                    j += j2;
                }
            }
            return dateTimeParseContext.getHighResolutionOutputSizeshNQ4ISI(this.getHighResolutionOutputSizeshNQ4ISI, j, i, i2);
        }

        @Override // org.threeten.bp.format.DateTimeFormatterBuilder.NumberPrinterParser
        final org.threeten.bp.format.DateTimeFormatterBuilder.NumberPrinterParser getHighSpeedVideoFpsRangesFor() {
            return this.getHighSpeedVideoSizesFor == -1 ? this : new org.threeten.bp.format.DateTimeFormatterBuilder.ReducedPrinterParser(this.getHighResolutionOutputSizeshNQ4ISI, this.getHighSpeedVideoFpsRangesFor, this.getHighSpeedVideoSizes, this.getOutputFormats, this.getOutputMinFrameDuration, -1);
        }

        @Override // org.threeten.bp.format.DateTimeFormatterBuilder.NumberPrinterParser
        public final java.lang.String toString() {
            java.lang.StringBuilder sb = new java.lang.StringBuilder("ReducedValue(");
            sb.append(this.getHighResolutionOutputSizeshNQ4ISI);
            sb.append(",");
            sb.append(this.getHighSpeedVideoFpsRangesFor);
            sb.append(",");
            sb.append(this.getHighSpeedVideoSizes);
            sb.append(",");
            java.lang.Object obj = this.getOutputMinFrameDuration;
            if (obj == null) {
                obj = java.lang.Integer.valueOf(this.getOutputFormats);
            }
            sb.append(obj);
            sb.append(")");
            return sb.toString();
        }

        @Override // org.threeten.bp.format.DateTimeFormatterBuilder.NumberPrinterParser
        final boolean getHighResolutionOutputSizeshNQ4ISI(org.threeten.bp.format.DateTimeParseContext dateTimeParseContext) {
            if (dateTimeParseContext.getHighResolutionOutputSizeshNQ4ISI) {
                return super.getHighResolutionOutputSizeshNQ4ISI(dateTimeParseContext);
            }
            return false;
        }

        @Override // org.threeten.bp.format.DateTimeFormatterBuilder.NumberPrinterParser
        final /* synthetic */ org.threeten.bp.format.DateTimeFormatterBuilder.NumberPrinterParser getHighResolutionOutputSizeshNQ4ISI(int i) {
            return new org.threeten.bp.format.DateTimeFormatterBuilder.ReducedPrinterParser(this.getHighResolutionOutputSizeshNQ4ISI, this.getHighSpeedVideoFpsRangesFor, this.getHighSpeedVideoSizes, this.getOutputFormats, this.getOutputMinFrameDuration, this.getHighSpeedVideoSizesFor + i);
        }
    }

    static final class FractionPrinterParser implements org.threeten.bp.format.DateTimeFormatterBuilder.DateTimePrinterParser {
        private final int Camera2StreamConfigurationMap;
        private final org.threeten.bp.temporal.TemporalField getHighSpeedVideoFpsRanges;
        private final boolean getHighSpeedVideoFpsRangesFor;
        private final int getHighSpeedVideoSizes;

        FractionPrinterParser(org.threeten.bp.temporal.TemporalField temporalField, int i, int i2, boolean z) {
            org.threeten.bp.jdk8.Jdk8Methods.requireNonNull(temporalField, "field");
            if (!temporalField.range().isFixed()) {
                throw new java.lang.IllegalArgumentException("Field must have a fixed set of values: ".concat(java.lang.String.valueOf(temporalField)));
            }
            if (i < 0 || i > 9) {
                throw new java.lang.IllegalArgumentException("Minimum width must be from 0 to 9 inclusive but was ".concat(java.lang.String.valueOf(i)));
            }
            if (i2 <= 0 || i2 > 9) {
                throw new java.lang.IllegalArgumentException("Maximum width must be from 1 to 9 inclusive but was ".concat(java.lang.String.valueOf(i2)));
            }
            if (i2 < i) {
                java.lang.StringBuilder sb = new java.lang.StringBuilder("Maximum width must exceed or equal the minimum width but ");
                sb.append(i2);
                sb.append(" < ");
                sb.append(i);
                throw new java.lang.IllegalArgumentException(sb.toString());
            }
            this.getHighSpeedVideoFpsRanges = temporalField;
            this.getHighSpeedVideoSizes = i;
            this.Camera2StreamConfigurationMap = i2;
            this.getHighSpeedVideoFpsRangesFor = z;
        }

        @Override // org.threeten.bp.format.DateTimeFormatterBuilder.DateTimePrinterParser
        public final boolean Camera2StreamConfigurationMap(org.threeten.bp.format.DateTimePrintContext dateTimePrintContext, java.lang.StringBuilder sb) {
            java.lang.Long Camera2StreamConfigurationMap = dateTimePrintContext.Camera2StreamConfigurationMap(this.getHighSpeedVideoFpsRanges);
            if (Camera2StreamConfigurationMap == null) {
                return false;
            }
            org.threeten.bp.format.DecimalStyle decimalStyle = dateTimePrintContext.getHighSpeedVideoFpsRanges;
            long longValue = Camera2StreamConfigurationMap.longValue();
            org.threeten.bp.temporal.ValueRange range = this.getHighSpeedVideoFpsRanges.range();
            range.checkValidValue(longValue, this.getHighSpeedVideoFpsRanges);
            java.math.BigDecimal valueOf = java.math.BigDecimal.valueOf(range.getMinimum());
            java.math.BigDecimal divide = java.math.BigDecimal.valueOf(longValue).subtract(valueOf).divide(java.math.BigDecimal.valueOf(range.getMaximum()).subtract(valueOf).add(java.math.BigDecimal.ONE), 9, java.math.RoundingMode.FLOOR);
            java.math.BigDecimal m = divide.compareTo(java.math.BigDecimal.ZERO) == 0 ? java.math.BigDecimal.ZERO : org.threeten.bp.format.DateTimeFormatterBuilder$FractionPrinterParser$$ExternalSyntheticBackportWithForwarding0.m(divide);
            if (m.scale() == 0) {
                if (this.getHighSpeedVideoSizes <= 0) {
                    return true;
                }
                if (this.getHighSpeedVideoFpsRangesFor) {
                    sb.append(decimalStyle.getDecimalSeparator());
                }
                for (int i = 0; i < this.getHighSpeedVideoSizes; i++) {
                    sb.append(decimalStyle.getZeroDigit());
                }
                return true;
            }
            java.lang.String highSpeedVideoSizes = decimalStyle.getHighSpeedVideoSizes(m.setScale(java.lang.Math.min(java.lang.Math.max(m.scale(), this.getHighSpeedVideoSizes), this.Camera2StreamConfigurationMap), java.math.RoundingMode.FLOOR).toPlainString().substring(2));
            if (this.getHighSpeedVideoFpsRangesFor) {
                sb.append(decimalStyle.getDecimalSeparator());
            }
            sb.append(highSpeedVideoSizes);
            return true;
        }

        public final java.lang.String toString() {
            java.lang.String str = this.getHighSpeedVideoFpsRangesFor ? ",DecimalPoint" : "";
            java.lang.StringBuilder sb = new java.lang.StringBuilder("Fraction(");
            sb.append(this.getHighSpeedVideoFpsRanges);
            sb.append(",");
            sb.append(this.getHighSpeedVideoSizes);
            sb.append(",");
            sb.append(this.Camera2StreamConfigurationMap);
            sb.append(str);
            sb.append(")");
            return sb.toString();
        }

        @Override // org.threeten.bp.format.DateTimeFormatterBuilder.DateTimePrinterParser
        public final int getHighSpeedVideoFpsRanges(org.threeten.bp.format.DateTimeParseContext dateTimeParseContext, java.lang.CharSequence charSequence, int i) {
            int i2 = dateTimeParseContext.getHighResolutionOutputSizeshNQ4ISI ? this.getHighSpeedVideoSizes : 0;
            int i3 = dateTimeParseContext.getHighResolutionOutputSizeshNQ4ISI ? this.Camera2StreamConfigurationMap : 9;
            int length = charSequence.length();
            if (i != length) {
                if (this.getHighSpeedVideoFpsRangesFor) {
                    if (charSequence.charAt(i) == dateTimeParseContext.getOutputFormats.getDecimalSeparator()) {
                        i++;
                    } else if (i2 > 0) {
                        return ~i;
                    }
                }
                int i4 = i;
                int i5 = i2 + i4;
                if (i5 > length) {
                    return ~i4;
                }
                int min = java.lang.Math.min(i3 + i4, length);
                int i6 = 0;
                int i7 = i4;
                while (true) {
                    if (i7 >= min) {
                        break;
                    }
                    int i8 = i7 + 1;
                    int charAt = charSequence.charAt(i7) - dateTimeParseContext.getOutputFormats.getHighSpeedVideoFpsRangesFor;
                    if (charAt < 0 || charAt > 9) {
                        charAt = -1;
                    }
                    if (charAt >= 0) {
                        i6 = (i6 * 10) + charAt;
                        i7 = i8;
                    } else if (i8 < i5) {
                        return ~i4;
                    }
                }
                java.math.BigDecimal movePointLeft = new java.math.BigDecimal(i6).movePointLeft(i7 - i4);
                org.threeten.bp.temporal.ValueRange range = this.getHighSpeedVideoFpsRanges.range();
                java.math.BigDecimal valueOf = java.math.BigDecimal.valueOf(range.getMinimum());
                return dateTimeParseContext.getHighResolutionOutputSizeshNQ4ISI(this.getHighSpeedVideoFpsRanges, movePointLeft.multiply(java.math.BigDecimal.valueOf(range.getMaximum()).subtract(valueOf).add(java.math.BigDecimal.ONE)).setScale(0, java.math.RoundingMode.FLOOR).add(valueOf).longValueExact(), i4, i7);
            }
            if (i2 > 0) {
                return ~i;
            }
            return i;
        }
    }

    static final class TextPrinterParser implements org.threeten.bp.format.DateTimeFormatterBuilder.DateTimePrinterParser {
        private final org.threeten.bp.temporal.TemporalField getHighResolutionOutputSizeshNQ4ISI;
        private final org.threeten.bp.format.TextStyle getHighSpeedVideoFpsRanges;
        private volatile org.threeten.bp.format.DateTimeFormatterBuilder.NumberPrinterParser getHighSpeedVideoFpsRangesFor;
        private final org.threeten.bp.format.DateTimeTextProvider getHighSpeedVideoSizes;

        TextPrinterParser(org.threeten.bp.temporal.TemporalField temporalField, org.threeten.bp.format.TextStyle textStyle, org.threeten.bp.format.DateTimeTextProvider dateTimeTextProvider) {
            this.getHighResolutionOutputSizeshNQ4ISI = temporalField;
            this.getHighSpeedVideoFpsRanges = textStyle;
            this.getHighSpeedVideoSizes = dateTimeTextProvider;
        }

        @Override // org.threeten.bp.format.DateTimeFormatterBuilder.DateTimePrinterParser
        public final boolean Camera2StreamConfigurationMap(org.threeten.bp.format.DateTimePrintContext dateTimePrintContext, java.lang.StringBuilder sb) {
            java.lang.Long Camera2StreamConfigurationMap = dateTimePrintContext.Camera2StreamConfigurationMap(this.getHighResolutionOutputSizeshNQ4ISI);
            if (Camera2StreamConfigurationMap == null) {
                return false;
            }
            java.lang.String text = this.getHighSpeedVideoSizes.getText(this.getHighResolutionOutputSizeshNQ4ISI, Camera2StreamConfigurationMap.longValue(), this.getHighSpeedVideoFpsRanges, dateTimePrintContext.getHighSpeedVideoSizes);
            if (text == null) {
                return Camera2StreamConfigurationMap().Camera2StreamConfigurationMap(dateTimePrintContext, sb);
            }
            sb.append(text);
            return true;
        }

        @Override // org.threeten.bp.format.DateTimeFormatterBuilder.DateTimePrinterParser
        public final int getHighSpeedVideoFpsRanges(org.threeten.bp.format.DateTimeParseContext dateTimeParseContext, java.lang.CharSequence charSequence, int i) {
            int length = charSequence.length();
            if (i < 0 || i > length) {
                throw new java.lang.IndexOutOfBoundsException();
            }
            java.util.Iterator<java.util.Map.Entry<java.lang.String, java.lang.Long>> textIterator = this.getHighSpeedVideoSizes.getTextIterator(this.getHighResolutionOutputSizeshNQ4ISI, dateTimeParseContext.getHighResolutionOutputSizeshNQ4ISI ? this.getHighSpeedVideoFpsRanges : null, dateTimeParseContext.getHighSpeedVideoFpsRanges);
            if (textIterator != null) {
                while (textIterator.hasNext()) {
                    java.util.Map.Entry<java.lang.String, java.lang.Long> next = textIterator.next();
                    java.lang.String key = next.getKey();
                    if (dateTimeParseContext.Camera2StreamConfigurationMap(key, 0, charSequence, i, key.length())) {
                        return dateTimeParseContext.getHighResolutionOutputSizeshNQ4ISI(this.getHighResolutionOutputSizeshNQ4ISI, next.getValue().longValue(), i, i + key.length());
                    }
                }
                if (dateTimeParseContext.getHighResolutionOutputSizeshNQ4ISI) {
                    return ~i;
                }
            }
            return Camera2StreamConfigurationMap().getHighSpeedVideoFpsRanges(dateTimeParseContext, charSequence, i);
        }

        private org.threeten.bp.format.DateTimeFormatterBuilder.NumberPrinterParser Camera2StreamConfigurationMap() {
            if (this.getHighSpeedVideoFpsRangesFor == null) {
                this.getHighSpeedVideoFpsRangesFor = new org.threeten.bp.format.DateTimeFormatterBuilder.NumberPrinterParser(this.getHighResolutionOutputSizeshNQ4ISI, 1, 19, org.threeten.bp.format.SignStyle.NORMAL);
            }
            return this.getHighSpeedVideoFpsRangesFor;
        }

        public final java.lang.String toString() {
            if (this.getHighSpeedVideoFpsRanges == org.threeten.bp.format.TextStyle.FULL) {
                java.lang.StringBuilder sb = new java.lang.StringBuilder("Text(");
                sb.append(this.getHighResolutionOutputSizeshNQ4ISI);
                sb.append(")");
                return sb.toString();
            }
            java.lang.StringBuilder sb2 = new java.lang.StringBuilder("Text(");
            sb2.append(this.getHighResolutionOutputSizeshNQ4ISI);
            sb2.append(",");
            sb2.append(this.getHighSpeedVideoFpsRanges);
            sb2.append(")");
            return sb2.toString();
        }
    }

    static final class InstantPrinterParser implements org.threeten.bp.format.DateTimeFormatterBuilder.DateTimePrinterParser {
        private final int getHighSpeedVideoFpsRangesFor;

        InstantPrinterParser(int i) {
            this.getHighSpeedVideoFpsRangesFor = i;
        }

        @Override // org.threeten.bp.format.DateTimeFormatterBuilder.DateTimePrinterParser
        public final boolean Camera2StreamConfigurationMap(org.threeten.bp.format.DateTimePrintContext dateTimePrintContext, java.lang.StringBuilder sb) {
            java.lang.Long Camera2StreamConfigurationMap = dateTimePrintContext.Camera2StreamConfigurationMap(org.threeten.bp.temporal.ChronoField.INSTANT_SECONDS);
            java.lang.Long l = 0L;
            if (dateTimePrintContext.getHighResolutionOutputSizeshNQ4ISI.isSupported(org.threeten.bp.temporal.ChronoField.NANO_OF_SECOND)) {
                l = java.lang.Long.valueOf(dateTimePrintContext.getHighResolutionOutputSizeshNQ4ISI.getLong(org.threeten.bp.temporal.ChronoField.NANO_OF_SECOND));
            }
            int i = 0;
            if (Camera2StreamConfigurationMap == null) {
                return false;
            }
            long longValue = Camera2StreamConfigurationMap.longValue();
            int checkValidIntValue = org.threeten.bp.temporal.ChronoField.NANO_OF_SECOND.checkValidIntValue(l.longValue());
            if (longValue >= -62167219200L) {
                long j = longValue - 253402300800L;
                long floorDiv = org.threeten.bp.jdk8.Jdk8Methods.floorDiv(j, kotlinx.datetime.internal.DateCalculationsKt.SECONDS_PER_10000_YEARS) + 1;
                org.threeten.bp.LocalDateTime ofEpochSecond = org.threeten.bp.LocalDateTime.ofEpochSecond(org.threeten.bp.jdk8.Jdk8Methods.floorMod(j, kotlinx.datetime.internal.DateCalculationsKt.SECONDS_PER_10000_YEARS) - 62167219200L, 0, org.threeten.bp.ZoneOffset.UTC);
                if (floorDiv > 0) {
                    sb.append('+');
                    sb.append(floorDiv);
                }
                sb.append(ofEpochSecond);
                if (ofEpochSecond.getSecond() == 0) {
                    sb.append(":00");
                }
            } else {
                long j2 = longValue + 62167219200L;
                long j3 = j2 / kotlinx.datetime.internal.DateCalculationsKt.SECONDS_PER_10000_YEARS;
                long j4 = j2 % kotlinx.datetime.internal.DateCalculationsKt.SECONDS_PER_10000_YEARS;
                org.threeten.bp.LocalDateTime ofEpochSecond2 = org.threeten.bp.LocalDateTime.ofEpochSecond(j4 - 62167219200L, 0, org.threeten.bp.ZoneOffset.UTC);
                int length = sb.length();
                sb.append(ofEpochSecond2);
                if (ofEpochSecond2.getSecond() == 0) {
                    sb.append(":00");
                }
                if (j3 < 0) {
                    if (ofEpochSecond2.getYear() == -10000) {
                        sb.replace(length, length + 2, java.lang.Long.toString(j3 - 1));
                    } else if (j4 == 0) {
                        sb.insert(length, j3);
                    } else {
                        sb.insert(length + 1, java.lang.Math.abs(j3));
                    }
                }
            }
            int i2 = this.getHighSpeedVideoFpsRangesFor;
            if (i2 == -2) {
                if (checkValidIntValue != 0) {
                    sb.append(com.paypal.oslo.core.money.MoneyKt.DECIMALSEPARATOR);
                    if (checkValidIntValue % 1000000 == 0) {
                        sb.append(java.lang.Integer.toString((checkValidIntValue / 1000000) + 1000).substring(1));
                    } else if (checkValidIntValue % 1000 == 0) {
                        sb.append(java.lang.Integer.toString((checkValidIntValue / 1000) + 1000000).substring(1));
                    } else {
                        sb.append(java.lang.Integer.toString(checkValidIntValue + 1000000000).substring(1));
                    }
                }
            } else if (i2 > 0 || (i2 == -1 && checkValidIntValue > 0)) {
                sb.append(com.paypal.oslo.core.money.MoneyKt.DECIMALSEPARATOR);
                int i3 = 100000000;
                while (true) {
                    int i4 = this.getHighSpeedVideoFpsRangesFor;
                    if ((i4 != -1 || checkValidIntValue <= 0) && i >= i4) {
                        break;
                    }
                    int i5 = checkValidIntValue / i3;
                    sb.append((char) (i5 + 48));
                    checkValidIntValue -= i5 * i3;
                    i3 /= 10;
                    i++;
                }
            }
            sb.append(org.bouncycastle.pqc.math.linearalgebra.Matrix.MATRIX_TYPE_ZERO);
            return true;
        }

        public final java.lang.String toString() {
            return "Instant()";
        }

        @Override // org.threeten.bp.format.DateTimeFormatterBuilder.DateTimePrinterParser
        public final int getHighSpeedVideoFpsRanges(org.threeten.bp.format.DateTimeParseContext dateTimeParseContext, java.lang.CharSequence charSequence, int i) {
            int i2;
            int i3;
            org.threeten.bp.format.DateTimeParseContext dateTimeParseContext2 = new org.threeten.bp.format.DateTimeParseContext(dateTimeParseContext);
            int i4 = this.getHighSpeedVideoFpsRangesFor;
            int i5 = i4 < 0 ? 0 : i4;
            if (i4 < 0) {
                i4 = 9;
            }
            org.threeten.bp.format.DateTimeFormatterBuilder.CompositePrinterParser compositePrinterParser = new org.threeten.bp.format.DateTimeFormatterBuilder().append(org.threeten.bp.format.DateTimeFormatter.ISO_LOCAL_DATE).appendLiteral('T').appendValue(org.threeten.bp.temporal.ChronoField.HOUR_OF_DAY, 2).appendLiteral(kotlinx.serialization.json.internal.AbstractJsonLexerKt.COLON).appendValue(org.threeten.bp.temporal.ChronoField.MINUTE_OF_HOUR, 2).appendLiteral(kotlinx.serialization.json.internal.AbstractJsonLexerKt.COLON).appendValue(org.threeten.bp.temporal.ChronoField.SECOND_OF_MINUTE, 2).appendFraction(org.threeten.bp.temporal.ChronoField.NANO_OF_SECOND, i5, i4, true).appendLiteral(org.bouncycastle.pqc.math.linearalgebra.Matrix.MATRIX_TYPE_ZERO).toFormatter().getHighSpeedVideoFpsRangesFor;
            if (compositePrinterParser.Camera2StreamConfigurationMap) {
                compositePrinterParser = new org.threeten.bp.format.DateTimeFormatterBuilder.CompositePrinterParser(compositePrinterParser.getHighSpeedVideoSizes, false);
            }
            int highSpeedVideoFpsRanges = compositePrinterParser.getHighSpeedVideoFpsRanges(dateTimeParseContext2, charSequence, i);
            if (highSpeedVideoFpsRanges < 0) {
                return highSpeedVideoFpsRanges;
            }
            org.threeten.bp.temporal.ChronoField chronoField = org.threeten.bp.temporal.ChronoField.YEAR;
            java.util.ArrayList<org.threeten.bp.format.DateTimeParseContext.Parsed> arrayList = dateTimeParseContext2.getHighSpeedVideoFpsRangesFor;
            long longValue = arrayList.get(arrayList.size() - 1).getHighSpeedVideoFpsRanges.get(chronoField).longValue();
            org.threeten.bp.temporal.ChronoField chronoField2 = org.threeten.bp.temporal.ChronoField.MONTH_OF_YEAR;
            java.util.ArrayList<org.threeten.bp.format.DateTimeParseContext.Parsed> arrayList2 = dateTimeParseContext2.getHighSpeedVideoFpsRangesFor;
            int intValue = arrayList2.get(arrayList2.size() - 1).getHighSpeedVideoFpsRanges.get(chronoField2).intValue();
            org.threeten.bp.temporal.ChronoField chronoField3 = org.threeten.bp.temporal.ChronoField.DAY_OF_MONTH;
            java.util.ArrayList<org.threeten.bp.format.DateTimeParseContext.Parsed> arrayList3 = dateTimeParseContext2.getHighSpeedVideoFpsRangesFor;
            int intValue2 = arrayList3.get(arrayList3.size() - 1).getHighSpeedVideoFpsRanges.get(chronoField3).intValue();
            org.threeten.bp.temporal.ChronoField chronoField4 = org.threeten.bp.temporal.ChronoField.HOUR_OF_DAY;
            java.util.ArrayList<org.threeten.bp.format.DateTimeParseContext.Parsed> arrayList4 = dateTimeParseContext2.getHighSpeedVideoFpsRangesFor;
            int intValue3 = arrayList4.get(arrayList4.size() - 1).getHighSpeedVideoFpsRanges.get(chronoField4).intValue();
            org.threeten.bp.temporal.ChronoField chronoField5 = org.threeten.bp.temporal.ChronoField.MINUTE_OF_HOUR;
            java.util.ArrayList<org.threeten.bp.format.DateTimeParseContext.Parsed> arrayList5 = dateTimeParseContext2.getHighSpeedVideoFpsRangesFor;
            int intValue4 = arrayList5.get(arrayList5.size() - 1).getHighSpeedVideoFpsRanges.get(chronoField5).intValue();
            org.threeten.bp.temporal.ChronoField chronoField6 = org.threeten.bp.temporal.ChronoField.SECOND_OF_MINUTE;
            java.util.ArrayList<org.threeten.bp.format.DateTimeParseContext.Parsed> arrayList6 = dateTimeParseContext2.getHighSpeedVideoFpsRangesFor;
            java.lang.Long l = arrayList6.get(arrayList6.size() - 1).getHighSpeedVideoFpsRanges.get(chronoField6);
            org.threeten.bp.temporal.ChronoField chronoField7 = org.threeten.bp.temporal.ChronoField.NANO_OF_SECOND;
            java.util.ArrayList<org.threeten.bp.format.DateTimeParseContext.Parsed> arrayList7 = dateTimeParseContext2.getHighSpeedVideoFpsRangesFor;
            java.lang.Long l2 = arrayList7.get(arrayList7.size() - 1).getHighSpeedVideoFpsRanges.get(chronoField7);
            int intValue5 = l != null ? l.intValue() : 0;
            int intValue6 = l2 != null ? l2.intValue() : 0;
            int i6 = (int) longValue;
            if (intValue3 == 24 && intValue4 == 0 && intValue5 == 0 && intValue6 == 0) {
                intValue3 = 0;
                i3 = 1;
                i2 = intValue5;
            } else {
                if (intValue3 == 23) {
                    i2 = 59;
                    if (intValue4 == 59 && intValue5 == 60) {
                        java.util.ArrayList<org.threeten.bp.format.DateTimeParseContext.Parsed> arrayList8 = dateTimeParseContext.getHighSpeedVideoFpsRangesFor;
                        arrayList8.get(arrayList8.size() - 1).Camera2StreamConfigurationMap = true;
                        i3 = 0;
                    }
                }
                i2 = intValue5;
                i3 = 0;
            }
            try {
                return dateTimeParseContext.getHighResolutionOutputSizeshNQ4ISI(org.threeten.bp.temporal.ChronoField.NANO_OF_SECOND, intValue6, i, dateTimeParseContext.getHighResolutionOutputSizeshNQ4ISI(org.threeten.bp.temporal.ChronoField.INSTANT_SECONDS, org.threeten.bp.jdk8.Jdk8Methods.safeMultiply(longValue / 10000, kotlinx.datetime.internal.DateCalculationsKt.SECONDS_PER_10000_YEARS) + org.threeten.bp.LocalDateTime.of(i6 % 10000, intValue, intValue2, intValue3, intValue4, i2, 0).plusDays(i3).toEpochSecond(org.threeten.bp.ZoneOffset.UTC), i, highSpeedVideoFpsRanges));
            } catch (java.lang.RuntimeException unused) {
                return ~i;
            }
        }
    }

    static final class OffsetIdPrinterParser implements org.threeten.bp.format.DateTimeFormatterBuilder.DateTimePrinterParser {
        private final java.lang.String getHighResolutionOutputSizeshNQ4ISI;
        private final int getHighSpeedVideoSizes;
        static final java.lang.String[] getHighSpeedVideoFpsRangesFor = {"+HH", "+HHmm", "+HH:mm", "+HHMM", "+HH:MM", "+HHMMss", "+HH:MM:ss", "+HHMMSS", "+HH:MM:SS"};
        static final org.threeten.bp.format.DateTimeFormatterBuilder.OffsetIdPrinterParser Camera2StreamConfigurationMap = new org.threeten.bp.format.DateTimeFormatterBuilder.OffsetIdPrinterParser("Z", "+HH:MM:ss");
        static final org.threeten.bp.format.DateTimeFormatterBuilder.OffsetIdPrinterParser getHighSpeedVideoFpsRanges = new org.threeten.bp.format.DateTimeFormatterBuilder.OffsetIdPrinterParser("0", "+HH:MM:ss");

        OffsetIdPrinterParser(java.lang.String str, java.lang.String str2) {
            org.threeten.bp.jdk8.Jdk8Methods.requireNonNull(str, "noOffsetText");
            org.threeten.bp.jdk8.Jdk8Methods.requireNonNull(str2, "pattern");
            this.getHighResolutionOutputSizeshNQ4ISI = str;
            int i = 0;
            while (true) {
                java.lang.String[] strArr = getHighSpeedVideoFpsRangesFor;
                if (i < strArr.length) {
                    if (strArr[i].equals(str2)) {
                        this.getHighSpeedVideoSizes = i;
                        return;
                    }
                    i++;
                } else {
                    throw new java.lang.IllegalArgumentException("Invalid zone offset pattern: ".concat(java.lang.String.valueOf(str2)));
                }
            }
        }

        @Override // org.threeten.bp.format.DateTimeFormatterBuilder.DateTimePrinterParser
        public final boolean Camera2StreamConfigurationMap(org.threeten.bp.format.DateTimePrintContext dateTimePrintContext, java.lang.StringBuilder sb) {
            java.lang.Long Camera2StreamConfigurationMap2 = dateTimePrintContext.Camera2StreamConfigurationMap(org.threeten.bp.temporal.ChronoField.OFFSET_SECONDS);
            if (Camera2StreamConfigurationMap2 == null) {
                return false;
            }
            int safeToInt = org.threeten.bp.jdk8.Jdk8Methods.safeToInt(Camera2StreamConfigurationMap2.longValue());
            if (safeToInt == 0) {
                sb.append(this.getHighResolutionOutputSizeshNQ4ISI);
                return true;
            }
            int abs = java.lang.Math.abs((safeToInt / 3600) % 100);
            int abs2 = java.lang.Math.abs((safeToInt / 60) % 60);
            int abs3 = java.lang.Math.abs(safeToInt % 60);
            int length = sb.length();
            sb.append(safeToInt < 0 ? "-" : "+");
            sb.append((char) ((abs / 10) + 48));
            sb.append((char) ((abs % 10) + 48));
            int i = this.getHighSpeedVideoSizes;
            if (i >= 3 || (i > 0 && abs2 > 0)) {
                sb.append(i % 2 == 0 ? io.ktor.sse.ServerSentEventKt.COLON : "");
                sb.append((char) ((abs2 / 10) + 48));
                sb.append((char) ((abs2 % 10) + 48));
                abs += abs2;
                int i2 = this.getHighSpeedVideoSizes;
                if (i2 >= 7 || (i2 >= 5 && abs3 > 0)) {
                    sb.append(i2 % 2 == 0 ? io.ktor.sse.ServerSentEventKt.COLON : "");
                    sb.append((char) ((abs3 / 10) + 48));
                    sb.append((char) ((abs3 % 10) + 48));
                    abs += abs3;
                }
            }
            if (abs != 0) {
                return true;
            }
            sb.setLength(length);
            sb.append(this.getHighResolutionOutputSizeshNQ4ISI);
            return true;
        }

        @Override // org.threeten.bp.format.DateTimeFormatterBuilder.DateTimePrinterParser
        public final int getHighSpeedVideoFpsRanges(org.threeten.bp.format.DateTimeParseContext dateTimeParseContext, java.lang.CharSequence charSequence, int i) {
            int length = charSequence.length();
            int length2 = this.getHighResolutionOutputSizeshNQ4ISI.length();
            if (length2 == 0) {
                if (i == length) {
                    return dateTimeParseContext.getHighResolutionOutputSizeshNQ4ISI(org.threeten.bp.temporal.ChronoField.OFFSET_SECONDS, 0L, i, i);
                }
            } else {
                if (i == length) {
                    return ~i;
                }
                if (dateTimeParseContext.Camera2StreamConfigurationMap(charSequence, i, this.getHighResolutionOutputSizeshNQ4ISI, 0, length2)) {
                    return dateTimeParseContext.getHighResolutionOutputSizeshNQ4ISI(org.threeten.bp.temporal.ChronoField.OFFSET_SECONDS, 0L, i, i + length2);
                }
            }
            char charAt = charSequence.charAt(i);
            if (charAt == '+' || charAt == '-') {
                int i2 = charAt == '-' ? -1 : 1;
                int[] iArr = new int[4];
                iArr[0] = i + 1;
                if (!getHighSpeedVideoFpsRangesFor(iArr, 1, charSequence, true)) {
                    if (!getHighSpeedVideoFpsRangesFor(iArr, 2, charSequence, this.getHighSpeedVideoSizes >= 3) && !getHighSpeedVideoFpsRangesFor(iArr, 3, charSequence, false)) {
                        return dateTimeParseContext.getHighResolutionOutputSizeshNQ4ISI(org.threeten.bp.temporal.ChronoField.OFFSET_SECONDS, i2 * ((iArr[1] * 3600) + (iArr[2] * 60) + iArr[3]), i, iArr[0]);
                    }
                }
            }
            return length2 == 0 ? dateTimeParseContext.getHighResolutionOutputSizeshNQ4ISI(org.threeten.bp.temporal.ChronoField.OFFSET_SECONDS, 0L, i, i + length2) : ~i;
        }

        private boolean getHighSpeedVideoFpsRangesFor(int[] iArr, int i, java.lang.CharSequence charSequence, boolean z) {
            int i2;
            int i3 = this.getHighSpeedVideoSizes;
            if ((i3 + 3) / 2 < i) {
                return false;
            }
            int i4 = iArr[0];
            if (i3 % 2 == 0 && i > 1) {
                int i5 = i4 + 1;
                if (i5 <= charSequence.length() && charSequence.charAt(i4) == ':') {
                    i4 = i5;
                }
                return z;
            }
            int i6 = i4 + 2;
            if (i6 <= charSequence.length()) {
                char charAt = charSequence.charAt(i4);
                char charAt2 = charSequence.charAt(i4 + 1);
                if (charAt >= '0' && charAt <= '9' && charAt2 >= '0' && charAt2 <= '9' && (i2 = ((charAt - com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask) * 10) + (charAt2 - com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask)) >= 0 && i2 <= 59) {
                    iArr[i] = i2;
                    iArr[0] = i6;
                    return false;
                }
            }
            return z;
        }

        public final java.lang.String toString() {
            java.lang.String replace = this.getHighResolutionOutputSizeshNQ4ISI.replace("'", "''");
            java.lang.StringBuilder sb = new java.lang.StringBuilder("Offset(");
            sb.append(getHighSpeedVideoFpsRangesFor[this.getHighSpeedVideoSizes]);
            sb.append(",'");
            sb.append(replace);
            sb.append("')");
            return sb.toString();
        }
    }

    static final class LocalizedOffsetPrinterParser implements org.threeten.bp.format.DateTimeFormatterBuilder.DateTimePrinterParser {
        private final org.threeten.bp.format.TextStyle Camera2StreamConfigurationMap;

        public LocalizedOffsetPrinterParser(org.threeten.bp.format.TextStyle textStyle) {
            this.Camera2StreamConfigurationMap = textStyle;
        }

        @Override // org.threeten.bp.format.DateTimeFormatterBuilder.DateTimePrinterParser
        public final boolean Camera2StreamConfigurationMap(org.threeten.bp.format.DateTimePrintContext dateTimePrintContext, java.lang.StringBuilder sb) {
            java.lang.Long Camera2StreamConfigurationMap = dateTimePrintContext.Camera2StreamConfigurationMap(org.threeten.bp.temporal.ChronoField.OFFSET_SECONDS);
            if (Camera2StreamConfigurationMap == null) {
                return false;
            }
            sb.append("GMT");
            if (this.Camera2StreamConfigurationMap == org.threeten.bp.format.TextStyle.FULL) {
                return new org.threeten.bp.format.DateTimeFormatterBuilder.OffsetIdPrinterParser("", "+HH:MM:ss").Camera2StreamConfigurationMap(dateTimePrintContext, sb);
            }
            int safeToInt = org.threeten.bp.jdk8.Jdk8Methods.safeToInt(Camera2StreamConfigurationMap.longValue());
            if (safeToInt == 0) {
                return true;
            }
            int abs = java.lang.Math.abs((safeToInt / 3600) % 100);
            int abs2 = java.lang.Math.abs((safeToInt / 60) % 60);
            int abs3 = java.lang.Math.abs(safeToInt % 60);
            sb.append(safeToInt < 0 ? "-" : "+");
            sb.append(abs);
            if (abs2 <= 0 && abs3 <= 0) {
                return true;
            }
            sb.append(io.ktor.sse.ServerSentEventKt.COLON);
            sb.append((char) ((abs2 / 10) + 48));
            sb.append((char) ((abs2 % 10) + 48));
            if (abs3 <= 0) {
                return true;
            }
            sb.append(io.ktor.sse.ServerSentEventKt.COLON);
            sb.append((char) ((abs3 / 10) + 48));
            sb.append((char) ((abs3 % 10) + 48));
            return true;
        }

        @Override // org.threeten.bp.format.DateTimeFormatterBuilder.DateTimePrinterParser
        public final int getHighSpeedVideoFpsRanges(org.threeten.bp.format.DateTimeParseContext dateTimeParseContext, java.lang.CharSequence charSequence, int i) {
            char charAt;
            if (!dateTimeParseContext.Camera2StreamConfigurationMap(charSequence, i, "GMT", 0, 3)) {
                return ~i;
            }
            int i2 = i + 3;
            if (this.Camera2StreamConfigurationMap == org.threeten.bp.format.TextStyle.FULL) {
                return new org.threeten.bp.format.DateTimeFormatterBuilder.OffsetIdPrinterParser("", "+HH:MM:ss").getHighSpeedVideoFpsRanges(dateTimeParseContext, charSequence, i2);
            }
            int length = charSequence.length();
            if (i2 == length) {
                return dateTimeParseContext.getHighResolutionOutputSizeshNQ4ISI(org.threeten.bp.temporal.ChronoField.OFFSET_SECONDS, 0L, i2, i2);
            }
            char charAt2 = charSequence.charAt(i2);
            if (charAt2 != '+' && charAt2 != '-') {
                return dateTimeParseContext.getHighResolutionOutputSizeshNQ4ISI(org.threeten.bp.temporal.ChronoField.OFFSET_SECONDS, 0L, i2, i2);
            }
            int i3 = charAt2 == '-' ? -1 : 1;
            if (i2 == length) {
                return ~i2;
            }
            int i4 = i + 4;
            char charAt3 = charSequence.charAt(i4);
            if (charAt3 < '0' || charAt3 > '9') {
                return ~i4;
            }
            int i5 = i + 5;
            int i6 = charAt3 - com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask;
            if (i5 != length && (charAt = charSequence.charAt(i5)) >= '0' && charAt <= '9') {
                i6 = (i6 * 10) + (charAt - com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask);
                if (i6 > 23) {
                    return ~i5;
                }
                i5 = i + 6;
            }
            int i7 = i5;
            if (i7 == length || charSequence.charAt(i7) != ':') {
                return dateTimeParseContext.getHighResolutionOutputSizeshNQ4ISI(org.threeten.bp.temporal.ChronoField.OFFSET_SECONDS, i3 * 3600 * i6, i7, i7);
            }
            int i8 = i7 + 1;
            int i9 = length - 2;
            if (i8 > i9) {
                return ~i8;
            }
            char charAt4 = charSequence.charAt(i8);
            if (charAt4 < '0' || charAt4 > '9') {
                return ~i8;
            }
            int i10 = i7 + 2;
            char charAt5 = charSequence.charAt(i10);
            if (charAt5 < '0' || charAt5 > '9') {
                return ~i10;
            }
            int i11 = i7 + 3;
            if (((charAt4 - com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask) * 10) + (charAt5 - com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask) > 59) {
                return ~i11;
            }
            if (i11 == length || charSequence.charAt(i11) != ':') {
                return dateTimeParseContext.getHighResolutionOutputSizeshNQ4ISI(org.threeten.bp.temporal.ChronoField.OFFSET_SECONDS, i3 * ((i6 * 3600) + (r11 * 60)), i11, i11);
            }
            int i12 = i7 + 4;
            if (i12 > i9) {
                return ~i12;
            }
            char charAt6 = charSequence.charAt(i12);
            if (charAt6 < '0' || charAt6 > '9') {
                return ~i12;
            }
            int i13 = i7 + 5;
            char charAt7 = charSequence.charAt(i13);
            if (charAt7 < '0' || charAt7 > '9') {
                return ~i13;
            }
            int i14 = i7 + 6;
            return ((charAt6 - com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask) * 10) + (charAt7 - com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask) > 59 ? ~i14 : dateTimeParseContext.getHighResolutionOutputSizeshNQ4ISI(org.threeten.bp.temporal.ChronoField.OFFSET_SECONDS, i3 * ((i6 * 3600) + (r11 * 60) + r1), i14, i14);
        }
    }

    static final class ZoneTextPrinterParser implements org.threeten.bp.format.DateTimeFormatterBuilder.DateTimePrinterParser {
        private static final java.util.Comparator<java.lang.String> Camera2StreamConfigurationMap = new java.util.Comparator<java.lang.String>() { // from class: org.threeten.bp.format.DateTimeFormatterBuilder.ZoneTextPrinterParser.1
            @Override // java.util.Comparator
            public /* synthetic */ int compare(java.lang.String str, java.lang.String str2) {
                java.lang.String str3 = str;
                java.lang.String str4 = str2;
                int length = str4.length() - str3.length();
                return length == 0 ? str3.compareTo(str4) : length;
            }
        };
        private final org.threeten.bp.format.TextStyle getHighSpeedVideoFpsRanges;

        ZoneTextPrinterParser(org.threeten.bp.format.TextStyle textStyle) {
            this.getHighSpeedVideoFpsRanges = (org.threeten.bp.format.TextStyle) org.threeten.bp.jdk8.Jdk8Methods.requireNonNull(textStyle, "textStyle");
        }

        @Override // org.threeten.bp.format.DateTimeFormatterBuilder.DateTimePrinterParser
        public final boolean Camera2StreamConfigurationMap(org.threeten.bp.format.DateTimePrintContext dateTimePrintContext, java.lang.StringBuilder sb) {
            org.threeten.bp.ZoneId zoneId = (org.threeten.bp.ZoneId) dateTimePrintContext.getHighResolutionOutputSizeshNQ4ISI(org.threeten.bp.temporal.TemporalQueries.zoneId());
            if (zoneId == null) {
                return false;
            }
            if (zoneId.normalized() instanceof org.threeten.bp.ZoneOffset) {
                sb.append(zoneId.getId());
                return true;
            }
            org.threeten.bp.temporal.TemporalAccessor temporalAccessor = dateTimePrintContext.getHighResolutionOutputSizeshNQ4ISI;
            sb.append(java.util.TimeZone.getTimeZone(zoneId.getId()).getDisplayName(temporalAccessor.isSupported(org.threeten.bp.temporal.ChronoField.INSTANT_SECONDS) ? zoneId.getRules().isDaylightSavings(org.threeten.bp.Instant.ofEpochSecond(temporalAccessor.getLong(org.threeten.bp.temporal.ChronoField.INSTANT_SECONDS))) : false, this.getHighSpeedVideoFpsRanges.asNormal() == org.threeten.bp.format.TextStyle.FULL ? 1 : 0, dateTimePrintContext.getHighSpeedVideoSizes));
            return true;
        }

        @Override // org.threeten.bp.format.DateTimeFormatterBuilder.DateTimePrinterParser
        public final int getHighSpeedVideoFpsRanges(org.threeten.bp.format.DateTimeParseContext dateTimeParseContext, java.lang.CharSequence charSequence, int i) {
            int length = charSequence.length();
            if (i > length) {
                throw new java.lang.IndexOutOfBoundsException();
            }
            if (i == length) {
                return ~i;
            }
            char charAt = charSequence.charAt(i);
            if (charAt == '+' || charAt == '-') {
                return i + 6 > length ? ~i : getHighSpeedVideoSizes(dateTimeParseContext, charSequence, i, "");
            }
            if (dateTimeParseContext.Camera2StreamConfigurationMap(charSequence, i, "GMT", 0, 3)) {
                return getHighSpeedVideoSizes(dateTimeParseContext, charSequence, i, "GMT");
            }
            if (dateTimeParseContext.Camera2StreamConfigurationMap(charSequence, i, com.paypal.oslo.feature.activity.domain.base.constants.ActivityConstants.DateTimeFormatConstants.KEY_TIMEZONE_UTC, 0, 3)) {
                return getHighSpeedVideoSizes(dateTimeParseContext, charSequence, i, com.paypal.oslo.feature.activity.domain.base.constants.ActivityConstants.DateTimeFormatConstants.KEY_TIMEZONE_UTC);
            }
            if (dateTimeParseContext.Camera2StreamConfigurationMap(charSequence, i, "UT", 0, 2)) {
                return getHighSpeedVideoSizes(dateTimeParseContext, charSequence, i, "UT");
            }
            java.util.TreeMap treeMap = new java.util.TreeMap(Camera2StreamConfigurationMap);
            for (java.lang.String str : org.threeten.bp.ZoneId.getAvailableZoneIds()) {
                treeMap.put(str, str);
                java.util.TimeZone timeZone = java.util.TimeZone.getTimeZone(str);
                int i2 = this.getHighSpeedVideoFpsRanges.asNormal() == org.threeten.bp.format.TextStyle.FULL ? 1 : 0;
                java.lang.String displayName = timeZone.getDisplayName(false, i2, dateTimeParseContext.getHighSpeedVideoFpsRanges);
                if (str.startsWith("Etc/") || (!displayName.startsWith("GMT+") && !displayName.startsWith("GMT+"))) {
                    treeMap.put(displayName, str);
                }
                java.lang.String displayName2 = timeZone.getDisplayName(true, i2, dateTimeParseContext.getHighSpeedVideoFpsRanges);
                if (str.startsWith("Etc/") || (!displayName2.startsWith("GMT+") && !displayName2.startsWith("GMT+"))) {
                    treeMap.put(displayName2, str);
                }
            }
            for (java.util.Map.Entry entry : treeMap.entrySet()) {
                java.lang.String str2 = (java.lang.String) entry.getKey();
                if (dateTimeParseContext.Camera2StreamConfigurationMap(charSequence, i, str2, 0, str2.length())) {
                    org.threeten.bp.ZoneId of = org.threeten.bp.ZoneId.of((java.lang.String) entry.getValue());
                    org.threeten.bp.jdk8.Jdk8Methods.requireNonNull(of, "zone");
                    java.util.ArrayList<org.threeten.bp.format.DateTimeParseContext.Parsed> arrayList = dateTimeParseContext.getHighSpeedVideoFpsRangesFor;
                    arrayList.get(arrayList.size() - 1).getHighSpeedVideoSizesFor = of;
                    return i + str2.length();
                }
            }
            if (charAt != 'Z') {
                return ~i;
            }
            org.threeten.bp.ZoneOffset zoneOffset = org.threeten.bp.ZoneOffset.UTC;
            org.threeten.bp.jdk8.Jdk8Methods.requireNonNull(zoneOffset, "zone");
            java.util.ArrayList<org.threeten.bp.format.DateTimeParseContext.Parsed> arrayList2 = dateTimeParseContext.getHighSpeedVideoFpsRangesFor;
            arrayList2.get(arrayList2.size() - 1).getHighSpeedVideoSizesFor = zoneOffset;
            return i + 1;
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r1v8, types: [org.threeten.bp.ZoneId] */
        private static int getHighSpeedVideoSizes(org.threeten.bp.format.DateTimeParseContext dateTimeParseContext, java.lang.CharSequence charSequence, int i, java.lang.String str) {
            int length = str.length();
            int i2 = i + length;
            if (i2 >= charSequence.length()) {
                org.threeten.bp.ZoneId of = org.threeten.bp.ZoneId.of(str);
                org.threeten.bp.jdk8.Jdk8Methods.requireNonNull(of, "zone");
                dateTimeParseContext.getHighSpeedVideoFpsRangesFor.get(r5.size() - 1).getHighSpeedVideoSizesFor = of;
                return i2;
            }
            char charAt = charSequence.charAt(i2);
            if (charAt != '+' && charAt != '-') {
                org.threeten.bp.ZoneId of2 = org.threeten.bp.ZoneId.of(str);
                org.threeten.bp.jdk8.Jdk8Methods.requireNonNull(of2, "zone");
                dateTimeParseContext.getHighSpeedVideoFpsRangesFor.get(r5.size() - 1).getHighSpeedVideoSizesFor = of2;
                return i2;
            }
            org.threeten.bp.format.DateTimeParseContext dateTimeParseContext2 = new org.threeten.bp.format.DateTimeParseContext(dateTimeParseContext);
            try {
                int highSpeedVideoFpsRanges = org.threeten.bp.format.DateTimeFormatterBuilder.OffsetIdPrinterParser.getHighSpeedVideoFpsRanges.getHighSpeedVideoFpsRanges(dateTimeParseContext2, charSequence, i2);
                if (highSpeedVideoFpsRanges < 0) {
                    org.threeten.bp.ZoneId of3 = org.threeten.bp.ZoneId.of(str);
                    org.threeten.bp.jdk8.Jdk8Methods.requireNonNull(of3, "zone");
                    dateTimeParseContext.getHighSpeedVideoFpsRangesFor.get(r5.size() - 1).getHighSpeedVideoSizesFor = of3;
                    return i2;
                }
                org.threeten.bp.ZoneOffset ofTotalSeconds = org.threeten.bp.ZoneOffset.ofTotalSeconds((int) dateTimeParseContext2.getHighSpeedVideoFpsRangesFor.get(r2.size() - 1).getHighSpeedVideoFpsRanges.get(org.threeten.bp.temporal.ChronoField.OFFSET_SECONDS).longValue());
                org.threeten.bp.ZoneOffset zoneOffset = ofTotalSeconds;
                if (length != 0) {
                    zoneOffset = org.threeten.bp.ZoneId.ofOffset(str, ofTotalSeconds);
                }
                org.threeten.bp.jdk8.Jdk8Methods.requireNonNull(zoneOffset, "zone");
                dateTimeParseContext.getHighSpeedVideoFpsRangesFor.get(r5.size() - 1).getHighSpeedVideoSizesFor = zoneOffset;
                return highSpeedVideoFpsRanges;
            } catch (org.threeten.bp.DateTimeException unused) {
                return ~i;
            }
        }

        public final java.lang.String toString() {
            java.lang.StringBuilder sb = new java.lang.StringBuilder("ZoneText(");
            sb.append(this.getHighSpeedVideoFpsRanges);
            sb.append(")");
            return sb.toString();
        }
    }

    static final class ZoneIdPrinterParser implements org.threeten.bp.format.DateTimeFormatterBuilder.DateTimePrinterParser {
        private static volatile java.util.Map.Entry<java.lang.Integer, org.threeten.bp.format.DateTimeFormatterBuilder.ZoneIdPrinterParser.SubstringTree> getHighSpeedVideoFpsRanges;
        private final java.lang.String getHighResolutionOutputSizeshNQ4ISI;
        private final org.threeten.bp.temporal.TemporalQuery<org.threeten.bp.ZoneId> getHighSpeedVideoFpsRangesFor;

        ZoneIdPrinterParser(org.threeten.bp.temporal.TemporalQuery<org.threeten.bp.ZoneId> temporalQuery, java.lang.String str) {
            this.getHighSpeedVideoFpsRangesFor = temporalQuery;
            this.getHighResolutionOutputSizeshNQ4ISI = str;
        }

        @Override // org.threeten.bp.format.DateTimeFormatterBuilder.DateTimePrinterParser
        public final boolean Camera2StreamConfigurationMap(org.threeten.bp.format.DateTimePrintContext dateTimePrintContext, java.lang.StringBuilder sb) {
            org.threeten.bp.ZoneId zoneId = (org.threeten.bp.ZoneId) dateTimePrintContext.getHighResolutionOutputSizeshNQ4ISI(this.getHighSpeedVideoFpsRangesFor);
            if (zoneId == null) {
                return false;
            }
            sb.append(zoneId.getId());
            return true;
        }

        @Override // org.threeten.bp.format.DateTimeFormatterBuilder.DateTimePrinterParser
        public final int getHighSpeedVideoFpsRanges(org.threeten.bp.format.DateTimeParseContext dateTimeParseContext, java.lang.CharSequence charSequence, int i) {
            int length = charSequence.length();
            if (i > length) {
                throw new java.lang.IndexOutOfBoundsException();
            }
            if (i == length) {
                return ~i;
            }
            char charAt = charSequence.charAt(i);
            if (charAt != '+' && charAt != '-') {
                int i2 = i + 2;
                if (length >= i2) {
                    char charAt2 = charSequence.charAt(i + 1);
                    if (!dateTimeParseContext.getHighSpeedVideoSizes ? org.threeten.bp.format.DateTimeParseContext.Camera2StreamConfigurationMap(charAt, org.bouncycastle.pqc.math.linearalgebra.Matrix.MATRIX_TYPE_RANDOM_UT) : charAt == 'U') {
                        if (!dateTimeParseContext.getHighSpeedVideoSizes ? org.threeten.bp.format.DateTimeParseContext.Camera2StreamConfigurationMap(charAt2, 'T') : charAt2 == 'T') {
                            int i3 = i + 3;
                            if (length >= i3) {
                                char charAt3 = charSequence.charAt(i2);
                                if (!dateTimeParseContext.getHighSpeedVideoSizes ? org.threeten.bp.format.DateTimeParseContext.Camera2StreamConfigurationMap(charAt3, 'C') : charAt3 == 'C') {
                                    return getHighSpeedVideoSizes(dateTimeParseContext, charSequence, i, i3);
                                }
                            }
                            return getHighSpeedVideoSizes(dateTimeParseContext, charSequence, i, i2);
                        }
                    }
                    if (!dateTimeParseContext.getHighSpeedVideoSizes ? org.threeten.bp.format.DateTimeParseContext.Camera2StreamConfigurationMap(charAt, 'G') : charAt == 'G') {
                        int i4 = i + 3;
                        if (length >= i4 && (!dateTimeParseContext.getHighSpeedVideoSizes ? org.threeten.bp.format.DateTimeParseContext.Camera2StreamConfigurationMap(charAt2, io.ktor.util.date.GMTDateParser.MONTH) : charAt2 == 'M')) {
                            char charAt4 = charSequence.charAt(i2);
                            if (!dateTimeParseContext.getHighSpeedVideoSizes ? org.threeten.bp.format.DateTimeParseContext.Camera2StreamConfigurationMap(charAt4, 'T') : charAt4 == 'T') {
                                return getHighSpeedVideoSizes(dateTimeParseContext, charSequence, i, i4);
                            }
                        }
                    }
                }
                java.util.Set<java.lang.String> availableZoneIds = org.threeten.bp.zone.ZoneRulesProvider.getAvailableZoneIds();
                int size = availableZoneIds.size();
                java.util.Map.Entry<java.lang.Integer, org.threeten.bp.format.DateTimeFormatterBuilder.ZoneIdPrinterParser.SubstringTree> entry = getHighSpeedVideoFpsRanges;
                if (entry == null || entry.getKey().intValue() != size) {
                    synchronized (this) {
                        entry = getHighSpeedVideoFpsRanges;
                        if (entry == null || entry.getKey().intValue() != size) {
                            entry = new java.util.AbstractMap.SimpleImmutableEntry<>(java.lang.Integer.valueOf(size), getHighResolutionOutputSizeshNQ4ISI(availableZoneIds));
                            getHighSpeedVideoFpsRanges = entry;
                        }
                    }
                }
                org.threeten.bp.format.DateTimeFormatterBuilder.ZoneIdPrinterParser.SubstringTree value = entry.getValue();
                java.lang.String str = null;
                java.lang.String str2 = null;
                while (value != null) {
                    int i5 = value.getHighSpeedVideoFpsRanges + i;
                    if (i5 > length) {
                        break;
                    }
                    java.lang.String obj = charSequence.subSequence(i, i5).toString();
                    value = org.threeten.bp.format.DateTimeFormatterBuilder.ZoneIdPrinterParser.SubstringTree.getHighSpeedVideoFpsRangesFor(value, obj, dateTimeParseContext.getHighSpeedVideoSizes);
                    str2 = str;
                    str = obj;
                }
                org.threeten.bp.ZoneId highResolutionOutputSizeshNQ4ISI = getHighResolutionOutputSizeshNQ4ISI(availableZoneIds, str, dateTimeParseContext.getHighSpeedVideoSizes);
                if (highResolutionOutputSizeshNQ4ISI == null) {
                    highResolutionOutputSizeshNQ4ISI = getHighResolutionOutputSizeshNQ4ISI(availableZoneIds, str2, dateTimeParseContext.getHighSpeedVideoSizes);
                    if (highResolutionOutputSizeshNQ4ISI == null) {
                        if (!dateTimeParseContext.getHighSpeedVideoSizes ? org.threeten.bp.format.DateTimeParseContext.Camera2StreamConfigurationMap(charAt, org.bouncycastle.pqc.math.linearalgebra.Matrix.MATRIX_TYPE_ZERO) : charAt == 'Z') {
                            return ~i;
                        }
                        org.threeten.bp.ZoneOffset zoneOffset = org.threeten.bp.ZoneOffset.UTC;
                        org.threeten.bp.jdk8.Jdk8Methods.requireNonNull(zoneOffset, "zone");
                        dateTimeParseContext.getHighSpeedVideoFpsRangesFor.get(r10.size() - 1).getHighSpeedVideoSizesFor = zoneOffset;
                        return i + 1;
                    }
                    str = str2;
                }
                org.threeten.bp.jdk8.Jdk8Methods.requireNonNull(highResolutionOutputSizeshNQ4ISI, "zone");
                dateTimeParseContext.getHighSpeedVideoFpsRangesFor.get(r10.size() - 1).getHighSpeedVideoSizesFor = highResolutionOutputSizeshNQ4ISI;
                return i + str.length();
            }
            org.threeten.bp.format.DateTimeParseContext dateTimeParseContext2 = new org.threeten.bp.format.DateTimeParseContext(dateTimeParseContext);
            int highSpeedVideoFpsRanges = org.threeten.bp.format.DateTimeFormatterBuilder.OffsetIdPrinterParser.Camera2StreamConfigurationMap.getHighSpeedVideoFpsRanges(dateTimeParseContext2, charSequence, i);
            if (highSpeedVideoFpsRanges < 0) {
                return highSpeedVideoFpsRanges;
            }
            org.threeten.bp.ZoneOffset ofTotalSeconds = org.threeten.bp.ZoneOffset.ofTotalSeconds((int) dateTimeParseContext2.getHighSpeedVideoFpsRangesFor.get(r0.size() - 1).getHighSpeedVideoFpsRanges.get(org.threeten.bp.temporal.ChronoField.OFFSET_SECONDS).longValue());
            org.threeten.bp.jdk8.Jdk8Methods.requireNonNull(ofTotalSeconds, "zone");
            dateTimeParseContext.getHighSpeedVideoFpsRangesFor.get(r10.size() - 1).getHighSpeedVideoSizesFor = ofTotalSeconds;
            return highSpeedVideoFpsRanges;
        }

        private static org.threeten.bp.ZoneId getHighResolutionOutputSizeshNQ4ISI(java.util.Set<java.lang.String> set, java.lang.String str, boolean z) {
            if (str == null) {
                return null;
            }
            if (z) {
                if (set.contains(str)) {
                    return org.threeten.bp.ZoneId.of(str);
                }
                return null;
            }
            for (java.lang.String str2 : set) {
                if (str2.equalsIgnoreCase(str)) {
                    return org.threeten.bp.ZoneId.of(str2);
                }
            }
            return null;
        }

        private static int getHighSpeedVideoSizes(org.threeten.bp.format.DateTimeParseContext dateTimeParseContext, java.lang.CharSequence charSequence, int i, int i2) {
            java.lang.String upperCase = charSequence.subSequence(i, i2).toString().toUpperCase();
            org.threeten.bp.format.DateTimeParseContext dateTimeParseContext2 = new org.threeten.bp.format.DateTimeParseContext(dateTimeParseContext);
            if (i2 < charSequence.length()) {
                char charAt = charSequence.charAt(i2);
                if (!dateTimeParseContext.getHighSpeedVideoSizes ? org.threeten.bp.format.DateTimeParseContext.Camera2StreamConfigurationMap(charAt, org.bouncycastle.pqc.math.linearalgebra.Matrix.MATRIX_TYPE_ZERO) : charAt == 'Z') {
                    org.threeten.bp.ZoneId ofOffset = org.threeten.bp.ZoneId.ofOffset(upperCase, org.threeten.bp.ZoneOffset.UTC);
                    org.threeten.bp.jdk8.Jdk8Methods.requireNonNull(ofOffset, "zone");
                    dateTimeParseContext.getHighSpeedVideoFpsRangesFor.get(r5.size() - 1).getHighSpeedVideoSizesFor = ofOffset;
                    return i2;
                }
            }
            int highSpeedVideoFpsRanges = org.threeten.bp.format.DateTimeFormatterBuilder.OffsetIdPrinterParser.Camera2StreamConfigurationMap.getHighSpeedVideoFpsRanges(dateTimeParseContext2, charSequence, i2);
            if (highSpeedVideoFpsRanges < 0) {
                org.threeten.bp.ZoneId ofOffset2 = org.threeten.bp.ZoneId.ofOffset(upperCase, org.threeten.bp.ZoneOffset.UTC);
                org.threeten.bp.jdk8.Jdk8Methods.requireNonNull(ofOffset2, "zone");
                dateTimeParseContext.getHighSpeedVideoFpsRangesFor.get(r5.size() - 1).getHighSpeedVideoSizesFor = ofOffset2;
                return i2;
            }
            org.threeten.bp.ZoneId ofOffset3 = org.threeten.bp.ZoneId.ofOffset(upperCase, org.threeten.bp.ZoneOffset.ofTotalSeconds((int) dateTimeParseContext2.getHighSpeedVideoFpsRangesFor.get(r0.size() - 1).getHighSpeedVideoFpsRanges.get(org.threeten.bp.temporal.ChronoField.OFFSET_SECONDS).longValue()));
            org.threeten.bp.jdk8.Jdk8Methods.requireNonNull(ofOffset3, "zone");
            dateTimeParseContext.getHighSpeedVideoFpsRangesFor.get(r5.size() - 1).getHighSpeedVideoSizesFor = ofOffset3;
            return highSpeedVideoFpsRanges;
        }

        static final class SubstringTree {
            private final java.util.Map<java.lang.CharSequence, org.threeten.bp.format.DateTimeFormatterBuilder.ZoneIdPrinterParser.SubstringTree> getHighResolutionOutputSizeshNQ4ISI;
            final int getHighSpeedVideoFpsRanges;
            private final java.util.Map<java.lang.String, org.threeten.bp.format.DateTimeFormatterBuilder.ZoneIdPrinterParser.SubstringTree> getHighSpeedVideoFpsRangesFor;

            /* synthetic */ SubstringTree(int i, byte b) {
                this(i);
            }

            private SubstringTree(int i) {
                this.getHighResolutionOutputSizeshNQ4ISI = new java.util.HashMap();
                this.getHighSpeedVideoFpsRangesFor = new java.util.HashMap();
                this.getHighSpeedVideoFpsRanges = i;
            }

            static /* synthetic */ org.threeten.bp.format.DateTimeFormatterBuilder.ZoneIdPrinterParser.SubstringTree getHighSpeedVideoFpsRangesFor(org.threeten.bp.format.DateTimeFormatterBuilder.ZoneIdPrinterParser.SubstringTree substringTree, java.lang.CharSequence charSequence, boolean z) {
                if (z) {
                    return substringTree.getHighResolutionOutputSizeshNQ4ISI.get(charSequence);
                }
                return substringTree.getHighSpeedVideoFpsRangesFor.get(charSequence.toString().toLowerCase(java.util.Locale.ENGLISH));
            }

            static /* synthetic */ void getHighSpeedVideoFpsRangesFor(org.threeten.bp.format.DateTimeFormatterBuilder.ZoneIdPrinterParser.SubstringTree substringTree, java.lang.String str) {
                while (true) {
                    int length = str.length();
                    int i = substringTree.getHighSpeedVideoFpsRanges;
                    if (length == i) {
                        substringTree.getHighResolutionOutputSizeshNQ4ISI.put(str, null);
                        substringTree.getHighSpeedVideoFpsRangesFor.put(str.toLowerCase(java.util.Locale.ENGLISH), null);
                        return;
                    } else {
                        if (length <= i) {
                            return;
                        }
                        java.lang.String substring = str.substring(0, i);
                        org.threeten.bp.format.DateTimeFormatterBuilder.ZoneIdPrinterParser.SubstringTree substringTree2 = substringTree.getHighResolutionOutputSizeshNQ4ISI.get(substring);
                        if (substringTree2 == null) {
                            substringTree2 = new org.threeten.bp.format.DateTimeFormatterBuilder.ZoneIdPrinterParser.SubstringTree(length);
                            substringTree.getHighResolutionOutputSizeshNQ4ISI.put(substring, substringTree2);
                            substringTree.getHighSpeedVideoFpsRangesFor.put(substring.toLowerCase(java.util.Locale.ENGLISH), substringTree2);
                        }
                        substringTree = substringTree2;
                    }
                }
            }
        }

        private static org.threeten.bp.format.DateTimeFormatterBuilder.ZoneIdPrinterParser.SubstringTree getHighResolutionOutputSizeshNQ4ISI(java.util.Set<java.lang.String> set) {
            java.util.ArrayList arrayList = new java.util.ArrayList(set);
            java.util.Collections.sort(arrayList, org.threeten.bp.format.DateTimeFormatterBuilder.getHighSpeedVideoFpsRangesFor);
            org.threeten.bp.format.DateTimeFormatterBuilder.ZoneIdPrinterParser.SubstringTree substringTree = new org.threeten.bp.format.DateTimeFormatterBuilder.ZoneIdPrinterParser.SubstringTree(((java.lang.String) arrayList.get(0)).length(), (byte) 0);
            java.util.Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                org.threeten.bp.format.DateTimeFormatterBuilder.ZoneIdPrinterParser.SubstringTree.getHighSpeedVideoFpsRangesFor(substringTree, (java.lang.String) it.next());
            }
            return substringTree;
        }

        public final java.lang.String toString() {
            return this.getHighResolutionOutputSizeshNQ4ISI;
        }
    }

    static final class ChronoPrinterParser implements org.threeten.bp.format.DateTimeFormatterBuilder.DateTimePrinterParser {
        private final org.threeten.bp.format.TextStyle getHighResolutionOutputSizeshNQ4ISI;

        ChronoPrinterParser(org.threeten.bp.format.TextStyle textStyle) {
            this.getHighResolutionOutputSizeshNQ4ISI = textStyle;
        }

        @Override // org.threeten.bp.format.DateTimeFormatterBuilder.DateTimePrinterParser
        public final boolean Camera2StreamConfigurationMap(org.threeten.bp.format.DateTimePrintContext dateTimePrintContext, java.lang.StringBuilder sb) {
            org.threeten.bp.chrono.Chronology chronology = (org.threeten.bp.chrono.Chronology) dateTimePrintContext.getHighResolutionOutputSizeshNQ4ISI(org.threeten.bp.temporal.TemporalQueries.chronology());
            if (chronology == null) {
                return false;
            }
            if (this.getHighResolutionOutputSizeshNQ4ISI == null) {
                sb.append(chronology.getId());
                return true;
            }
            try {
                sb.append(java.util.ResourceBundle.getBundle("org.threeten.bp.format.ChronologyText", dateTimePrintContext.getHighSpeedVideoSizes, org.threeten.bp.format.DateTimeFormatterBuilder.class.getClassLoader()).getString(chronology.getId()));
                return true;
            } catch (java.util.MissingResourceException unused) {
                sb.append(chronology.getId());
                return true;
            }
        }

        @Override // org.threeten.bp.format.DateTimeFormatterBuilder.DateTimePrinterParser
        public final int getHighSpeedVideoFpsRanges(org.threeten.bp.format.DateTimeParseContext dateTimeParseContext, java.lang.CharSequence charSequence, int i) {
            if (i < 0 || i > charSequence.length()) {
                throw new java.lang.IndexOutOfBoundsException();
            }
            org.threeten.bp.chrono.Chronology chronology = null;
            int i2 = -1;
            for (org.threeten.bp.chrono.Chronology chronology2 : org.threeten.bp.chrono.Chronology.getAvailableChronologies()) {
                java.lang.String id = chronology2.getId();
                int length = id.length();
                if (length > i2 && dateTimeParseContext.Camera2StreamConfigurationMap(charSequence, i, id, 0, length)) {
                    chronology = chronology2;
                    i2 = length;
                }
            }
            if (chronology == null) {
                return ~i;
            }
            org.threeten.bp.jdk8.Jdk8Methods.requireNonNull(chronology, "chrono");
            java.util.ArrayList<org.threeten.bp.format.DateTimeParseContext.Parsed> arrayList = dateTimeParseContext.getHighSpeedVideoFpsRangesFor;
            org.threeten.bp.format.DateTimeParseContext.Parsed parsed = arrayList.get(arrayList.size() - 1);
            parsed.getHighResolutionOutputSizeshNQ4ISI = chronology;
            if (parsed.getHighSpeedVideoSizes != null) {
                java.util.ArrayList<java.lang.Object[]> arrayList2 = new java.util.ArrayList(parsed.getHighSpeedVideoSizes);
                parsed.getHighSpeedVideoSizes.clear();
                for (java.lang.Object[] objArr : arrayList2) {
                    ((org.threeten.bp.format.DateTimeFormatterBuilder.ReducedPrinterParser) objArr[0]).getHighResolutionOutputSizeshNQ4ISI(dateTimeParseContext, ((java.lang.Long) objArr[1]).longValue(), ((java.lang.Integer) objArr[2]).intValue(), ((java.lang.Integer) objArr[3]).intValue());
                }
            }
            return i + i2;
        }
    }

    static final class LocalizedPrinterParser implements org.threeten.bp.format.DateTimeFormatterBuilder.DateTimePrinterParser {
        private final org.threeten.bp.format.FormatStyle getHighResolutionOutputSizeshNQ4ISI;
        private final org.threeten.bp.format.FormatStyle getHighSpeedVideoFpsRangesFor;

        LocalizedPrinterParser(org.threeten.bp.format.FormatStyle formatStyle, org.threeten.bp.format.FormatStyle formatStyle2) {
            this.getHighResolutionOutputSizeshNQ4ISI = formatStyle;
            this.getHighSpeedVideoFpsRangesFor = formatStyle2;
        }

        public final java.lang.String toString() {
            java.lang.StringBuilder sb = new java.lang.StringBuilder("Localized(");
            java.lang.Object obj = this.getHighResolutionOutputSizeshNQ4ISI;
            if (obj == null) {
                obj = "";
            }
            sb.append(obj);
            sb.append(",");
            org.threeten.bp.format.FormatStyle formatStyle = this.getHighSpeedVideoFpsRangesFor;
            sb.append(formatStyle != null ? formatStyle : "");
            sb.append(")");
            return sb.toString();
        }

        @Override // org.threeten.bp.format.DateTimeFormatterBuilder.DateTimePrinterParser
        public final int getHighSpeedVideoFpsRanges(org.threeten.bp.format.DateTimeParseContext dateTimeParseContext, java.lang.CharSequence charSequence, int i) {
            org.threeten.bp.chrono.Chronology chronology = dateTimeParseContext.getHighSpeedVideoFpsRangesFor.get(r0.size() - 1).getHighResolutionOutputSizeshNQ4ISI;
            if (chronology == null && (chronology = dateTimeParseContext.Camera2StreamConfigurationMap) == null) {
                chronology = org.threeten.bp.chrono.IsoChronology.INSTANCE;
            }
            org.threeten.bp.format.DateTimeFormatterBuilder.CompositePrinterParser compositePrinterParser = org.threeten.bp.format.DateTimeFormatStyleProvider.Camera2StreamConfigurationMap().Camera2StreamConfigurationMap(this.getHighResolutionOutputSizeshNQ4ISI, this.getHighSpeedVideoFpsRangesFor, chronology, dateTimeParseContext.getHighSpeedVideoFpsRanges).getHighSpeedVideoFpsRangesFor;
            if (compositePrinterParser.Camera2StreamConfigurationMap) {
                compositePrinterParser = new org.threeten.bp.format.DateTimeFormatterBuilder.CompositePrinterParser(compositePrinterParser.getHighSpeedVideoSizes, false);
            }
            return compositePrinterParser.getHighSpeedVideoFpsRanges(dateTimeParseContext, charSequence, i);
        }

        @Override // org.threeten.bp.format.DateTimeFormatterBuilder.DateTimePrinterParser
        public final boolean Camera2StreamConfigurationMap(org.threeten.bp.format.DateTimePrintContext dateTimePrintContext, java.lang.StringBuilder sb) {
            org.threeten.bp.format.DateTimeFormatterBuilder.CompositePrinterParser compositePrinterParser = org.threeten.bp.format.DateTimeFormatStyleProvider.Camera2StreamConfigurationMap().Camera2StreamConfigurationMap(this.getHighResolutionOutputSizeshNQ4ISI, this.getHighSpeedVideoFpsRangesFor, org.threeten.bp.chrono.Chronology.from(dateTimePrintContext.getHighResolutionOutputSizeshNQ4ISI), dateTimePrintContext.getHighSpeedVideoSizes).getHighSpeedVideoFpsRangesFor;
            if (compositePrinterParser.Camera2StreamConfigurationMap) {
                compositePrinterParser = new org.threeten.bp.format.DateTimeFormatterBuilder.CompositePrinterParser(compositePrinterParser.getHighSpeedVideoSizes, false);
            }
            return compositePrinterParser.Camera2StreamConfigurationMap(dateTimePrintContext, sb);
        }
    }

    static final class WeekFieldsPrinterParser implements org.threeten.bp.format.DateTimeFormatterBuilder.DateTimePrinterParser {
        private final char getHighResolutionOutputSizeshNQ4ISI;
        private final int getHighSpeedVideoFpsRangesFor;

        public WeekFieldsPrinterParser(char c, int i) {
            this.getHighResolutionOutputSizeshNQ4ISI = c;
            this.getHighSpeedVideoFpsRangesFor = i;
        }

        private org.threeten.bp.format.DateTimeFormatterBuilder.DateTimePrinterParser getHighResolutionOutputSizeshNQ4ISI(org.threeten.bp.temporal.WeekFields weekFields) {
            char c = this.getHighResolutionOutputSizeshNQ4ISI;
            if (c == 'W') {
                return new org.threeten.bp.format.DateTimeFormatterBuilder.NumberPrinterParser(weekFields.weekOfMonth(), 1, 2, org.threeten.bp.format.SignStyle.NOT_NEGATIVE);
            }
            if (c == 'Y') {
                if (this.getHighSpeedVideoFpsRangesFor == 2) {
                    return new org.threeten.bp.format.DateTimeFormatterBuilder.ReducedPrinterParser(weekFields.weekBasedYear(), 2, 2, 0, org.threeten.bp.format.DateTimeFormatterBuilder.ReducedPrinterParser.getInputFormats);
                }
                org.threeten.bp.temporal.TemporalField weekBasedYear = weekFields.weekBasedYear();
                int i = this.getHighSpeedVideoFpsRangesFor;
                return new org.threeten.bp.format.DateTimeFormatterBuilder.NumberPrinterParser(weekBasedYear, i, 19, i < 4 ? org.threeten.bp.format.SignStyle.NORMAL : org.threeten.bp.format.SignStyle.EXCEEDS_PAD, -1, (byte) 0);
            }
            if (c == 'c') {
                return new org.threeten.bp.format.DateTimeFormatterBuilder.NumberPrinterParser(weekFields.dayOfWeek(), this.getHighSpeedVideoFpsRangesFor, 2, org.threeten.bp.format.SignStyle.NOT_NEGATIVE);
            }
            if (c == 'e') {
                return new org.threeten.bp.format.DateTimeFormatterBuilder.NumberPrinterParser(weekFields.dayOfWeek(), this.getHighSpeedVideoFpsRangesFor, 2, org.threeten.bp.format.SignStyle.NOT_NEGATIVE);
            }
            if (c != 'w') {
                return null;
            }
            return new org.threeten.bp.format.DateTimeFormatterBuilder.NumberPrinterParser(weekFields.weekOfWeekBasedYear(), this.getHighSpeedVideoFpsRangesFor, 2, org.threeten.bp.format.SignStyle.NOT_NEGATIVE);
        }

        public final java.lang.String toString() {
            java.lang.StringBuilder sb = new java.lang.StringBuilder(30);
            sb.append("Localized(");
            char c = this.getHighResolutionOutputSizeshNQ4ISI;
            if (c == 'Y') {
                int i = this.getHighSpeedVideoFpsRangesFor;
                if (i == 1) {
                    sb.append("WeekBasedYear");
                } else if (i == 2) {
                    sb.append("ReducedValue(WeekBasedYear,2,2,2000-01-01)");
                } else {
                    sb.append("WeekBasedYear,");
                    sb.append(this.getHighSpeedVideoFpsRangesFor);
                    sb.append(",19,");
                    sb.append(this.getHighSpeedVideoFpsRangesFor < 4 ? org.threeten.bp.format.SignStyle.NORMAL : org.threeten.bp.format.SignStyle.EXCEEDS_PAD);
                }
            } else {
                if (c == 'c' || c == 'e') {
                    sb.append("DayOfWeek");
                } else if (c == 'w') {
                    sb.append("WeekOfWeekBasedYear");
                } else if (c == 'W') {
                    sb.append("WeekOfMonth");
                }
                sb.append(",");
                sb.append(this.getHighSpeedVideoFpsRangesFor);
            }
            sb.append(")");
            return sb.toString();
        }

        @Override // org.threeten.bp.format.DateTimeFormatterBuilder.DateTimePrinterParser
        public final int getHighSpeedVideoFpsRanges(org.threeten.bp.format.DateTimeParseContext dateTimeParseContext, java.lang.CharSequence charSequence, int i) {
            return getHighResolutionOutputSizeshNQ4ISI(org.threeten.bp.temporal.WeekFields.of(dateTimeParseContext.getHighSpeedVideoFpsRanges)).getHighSpeedVideoFpsRanges(dateTimeParseContext, charSequence, i);
        }

        @Override // org.threeten.bp.format.DateTimeFormatterBuilder.DateTimePrinterParser
        public final boolean Camera2StreamConfigurationMap(org.threeten.bp.format.DateTimePrintContext dateTimePrintContext, java.lang.StringBuilder sb) {
            return getHighResolutionOutputSizeshNQ4ISI(org.threeten.bp.temporal.WeekFields.of(dateTimePrintContext.getHighSpeedVideoSizes)).Camera2StreamConfigurationMap(dateTimePrintContext, sb);
        }
    }
}
