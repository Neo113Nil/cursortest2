package org.threeten.bp.format;

/* loaded from: classes18.dex */
final class DateTimeParseContext {
    org.threeten.bp.chrono.Chronology Camera2StreamConfigurationMap;
    boolean getHighResolutionOutputSizeshNQ4ISI;
    java.util.Locale getHighSpeedVideoFpsRanges;
    final java.util.ArrayList<org.threeten.bp.format.DateTimeParseContext.Parsed> getHighSpeedVideoFpsRangesFor;
    boolean getHighSpeedVideoSizes;
    org.threeten.bp.format.DecimalStyle getOutputFormats;
    private org.threeten.bp.ZoneId getOutputMinFrameDuration;

    DateTimeParseContext(org.threeten.bp.format.DateTimeFormatter dateTimeFormatter) {
        this.getHighSpeedVideoSizes = true;
        this.getHighResolutionOutputSizeshNQ4ISI = true;
        java.util.ArrayList<org.threeten.bp.format.DateTimeParseContext.Parsed> arrayList = new java.util.ArrayList<>();
        this.getHighSpeedVideoFpsRangesFor = arrayList;
        this.getHighSpeedVideoFpsRanges = dateTimeFormatter.getLocale();
        this.getOutputFormats = dateTimeFormatter.getDecimalStyle();
        this.Camera2StreamConfigurationMap = dateTimeFormatter.getChronology();
        this.getOutputMinFrameDuration = dateTimeFormatter.getZone();
        arrayList.add(new org.threeten.bp.format.DateTimeParseContext.Parsed(this, (byte) 0));
    }

    DateTimeParseContext(org.threeten.bp.format.DateTimeParseContext dateTimeParseContext) {
        this.getHighSpeedVideoSizes = true;
        this.getHighResolutionOutputSizeshNQ4ISI = true;
        java.util.ArrayList<org.threeten.bp.format.DateTimeParseContext.Parsed> arrayList = new java.util.ArrayList<>();
        this.getHighSpeedVideoFpsRangesFor = arrayList;
        this.getHighSpeedVideoFpsRanges = dateTimeParseContext.getHighSpeedVideoFpsRanges;
        this.getOutputFormats = dateTimeParseContext.getOutputFormats;
        this.Camera2StreamConfigurationMap = dateTimeParseContext.Camera2StreamConfigurationMap;
        this.getOutputMinFrameDuration = dateTimeParseContext.getOutputMinFrameDuration;
        this.getHighSpeedVideoSizes = dateTimeParseContext.getHighSpeedVideoSizes;
        this.getHighResolutionOutputSizeshNQ4ISI = dateTimeParseContext.getHighResolutionOutputSizeshNQ4ISI;
        arrayList.add(new org.threeten.bp.format.DateTimeParseContext.Parsed(this, (byte) 0));
    }

    final boolean Camera2StreamConfigurationMap(java.lang.CharSequence charSequence, int i, java.lang.CharSequence charSequence2, int i2, int i3) {
        if (i + i3 > charSequence.length() || i2 + i3 > charSequence2.length()) {
            return false;
        }
        if (this.getHighSpeedVideoSizes) {
            for (int i4 = 0; i4 < i3; i4++) {
                if (charSequence.charAt(i + i4) != charSequence2.charAt(i2 + i4)) {
                    return false;
                }
            }
            return true;
        }
        for (int i5 = 0; i5 < i3; i5++) {
            char charAt = charSequence.charAt(i + i5);
            char charAt2 = charSequence2.charAt(i2 + i5);
            if (charAt != charAt2 && java.lang.Character.toUpperCase(charAt) != java.lang.Character.toUpperCase(charAt2) && java.lang.Character.toLowerCase(charAt) != java.lang.Character.toLowerCase(charAt2)) {
                return false;
            }
        }
        return true;
    }

    static boolean Camera2StreamConfigurationMap(char c, char c2) {
        return c == c2 || java.lang.Character.toUpperCase(c) == java.lang.Character.toUpperCase(c2) || java.lang.Character.toLowerCase(c) == java.lang.Character.toLowerCase(c2);
    }

    final void getHighSpeedVideoFpsRangesFor(boolean z) {
        if (z) {
            this.getHighSpeedVideoFpsRangesFor.remove(r2.size() - 2);
        } else {
            this.getHighSpeedVideoFpsRangesFor.remove(r2.size() - 1);
        }
    }

    final int getHighResolutionOutputSizeshNQ4ISI(org.threeten.bp.temporal.TemporalField temporalField, long j, int i, int i2) {
        org.threeten.bp.jdk8.Jdk8Methods.requireNonNull(temporalField, "field");
        java.lang.Long put = this.getHighSpeedVideoFpsRangesFor.get(r0.size() - 1).getHighSpeedVideoFpsRanges.put(temporalField, java.lang.Long.valueOf(j));
        return (put == null || put.longValue() == j) ? i2 : ~i;
    }

    final class Parsed extends org.threeten.bp.jdk8.DefaultInterfaceTemporalAccessor {
        boolean Camera2StreamConfigurationMap;
        org.threeten.bp.chrono.Chronology getHighResolutionOutputSizeshNQ4ISI;
        final java.util.Map<org.threeten.bp.temporal.TemporalField, java.lang.Long> getHighSpeedVideoFpsRanges;
        org.threeten.bp.Period getHighSpeedVideoFpsRangesFor;
        java.util.List<java.lang.Object[]> getHighSpeedVideoSizes;
        org.threeten.bp.ZoneId getHighSpeedVideoSizesFor;

        /* synthetic */ Parsed(org.threeten.bp.format.DateTimeParseContext dateTimeParseContext, byte b) {
            this();
        }

        Parsed() {
            this.getHighResolutionOutputSizeshNQ4ISI = null;
            this.getHighSpeedVideoSizesFor = null;
            this.getHighSpeedVideoFpsRanges = new java.util.HashMap();
            this.getHighSpeedVideoFpsRangesFor = org.threeten.bp.Period.ZERO;
        }

        public final java.lang.String toString() {
            java.lang.StringBuilder sb = new java.lang.StringBuilder();
            sb.append(this.getHighSpeedVideoFpsRanges.toString());
            sb.append(",");
            sb.append(this.getHighResolutionOutputSizeshNQ4ISI);
            sb.append(",");
            sb.append(this.getHighSpeedVideoSizesFor);
            return sb.toString();
        }

        @Override // org.threeten.bp.temporal.TemporalAccessor
        public final boolean isSupported(org.threeten.bp.temporal.TemporalField temporalField) {
            return this.getHighSpeedVideoFpsRanges.containsKey(temporalField);
        }

        @Override // org.threeten.bp.jdk8.DefaultInterfaceTemporalAccessor, org.threeten.bp.temporal.TemporalAccessor
        public final int get(org.threeten.bp.temporal.TemporalField temporalField) {
            if (!this.getHighSpeedVideoFpsRanges.containsKey(temporalField)) {
                throw new org.threeten.bp.temporal.UnsupportedTemporalTypeException("Unsupported field: ".concat(java.lang.String.valueOf(temporalField)));
            }
            return org.threeten.bp.jdk8.Jdk8Methods.safeToInt(this.getHighSpeedVideoFpsRanges.get(temporalField).longValue());
        }

        @Override // org.threeten.bp.temporal.TemporalAccessor
        public final long getLong(org.threeten.bp.temporal.TemporalField temporalField) {
            if (!this.getHighSpeedVideoFpsRanges.containsKey(temporalField)) {
                throw new org.threeten.bp.temporal.UnsupportedTemporalTypeException("Unsupported field: ".concat(java.lang.String.valueOf(temporalField)));
            }
            return this.getHighSpeedVideoFpsRanges.get(temporalField).longValue();
        }

        @Override // org.threeten.bp.jdk8.DefaultInterfaceTemporalAccessor, org.threeten.bp.temporal.TemporalAccessor
        public final <R> R query(org.threeten.bp.temporal.TemporalQuery<R> temporalQuery) {
            if (temporalQuery == org.threeten.bp.temporal.TemporalQueries.chronology()) {
                return (R) this.getHighResolutionOutputSizeshNQ4ISI;
            }
            if (temporalQuery == org.threeten.bp.temporal.TemporalQueries.zoneId() || temporalQuery == org.threeten.bp.temporal.TemporalQueries.zone()) {
                return (R) this.getHighSpeedVideoSizesFor;
            }
            return (R) super.query(temporalQuery);
        }

        final org.threeten.bp.format.DateTimeBuilder getHighResolutionOutputSizeshNQ4ISI() {
            org.threeten.bp.format.DateTimeBuilder dateTimeBuilder = new org.threeten.bp.format.DateTimeBuilder();
            dateTimeBuilder.getHighSpeedVideoFpsRangesFor.putAll(this.getHighSpeedVideoFpsRanges);
            dateTimeBuilder.getHighResolutionOutputSizeshNQ4ISI = org.threeten.bp.format.DateTimeParseContext.this.getHighSpeedVideoFpsRanges();
            org.threeten.bp.ZoneId zoneId = this.getHighSpeedVideoSizesFor;
            if (zoneId == null) {
                dateTimeBuilder.getInputSizeshNQ4ISI = org.threeten.bp.format.DateTimeParseContext.this.getOutputMinFrameDuration;
            } else {
                dateTimeBuilder.getInputSizeshNQ4ISI = zoneId;
            }
            dateTimeBuilder.getHighSpeedVideoFpsRanges = this.Camera2StreamConfigurationMap;
            dateTimeBuilder.getHighSpeedVideoSizes = this.getHighSpeedVideoFpsRangesFor;
            return dateTimeBuilder;
        }
    }

    final void getHighSpeedVideoFpsRanges(org.threeten.bp.format.DateTimeFormatterBuilder.ReducedPrinterParser reducedPrinterParser, long j, int i, int i2) {
        org.threeten.bp.format.DateTimeParseContext.Parsed parsed = this.getHighSpeedVideoFpsRangesFor.get(r0.size() - 1);
        if (parsed.getHighSpeedVideoSizes == null) {
            parsed.getHighSpeedVideoSizes = new java.util.ArrayList(2);
        }
        parsed.getHighSpeedVideoSizes.add(new java.lang.Object[]{reducedPrinterParser, java.lang.Long.valueOf(j), java.lang.Integer.valueOf(i), java.lang.Integer.valueOf(i2)});
    }

    final org.threeten.bp.chrono.Chronology getHighSpeedVideoFpsRanges() {
        org.threeten.bp.chrono.Chronology chronology = this.getHighSpeedVideoFpsRangesFor.get(r0.size() - 1).getHighResolutionOutputSizeshNQ4ISI;
        if (chronology != null) {
            return chronology;
        }
        org.threeten.bp.chrono.Chronology chronology2 = this.Camera2StreamConfigurationMap;
        return chronology2 == null ? org.threeten.bp.chrono.IsoChronology.INSTANCE : chronology2;
    }

    public final java.lang.String toString() {
        return this.getHighSpeedVideoFpsRangesFor.get(r0.size() - 1).toString();
    }
}
