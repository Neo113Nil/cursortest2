package org.threeten.bp;

/* loaded from: classes18.dex */
public abstract class ZoneId implements java.io.Serializable {
    public static final org.threeten.bp.temporal.TemporalQuery<org.threeten.bp.ZoneId> FROM = new org.threeten.bp.temporal.TemporalQuery<org.threeten.bp.ZoneId>() { // from class: org.threeten.bp.ZoneId.1
        @Override // org.threeten.bp.temporal.TemporalQuery
        public /* synthetic */ org.threeten.bp.ZoneId queryFrom(org.threeten.bp.temporal.TemporalAccessor temporalAccessor) {
            return org.threeten.bp.ZoneId.from(temporalAccessor);
        }
    };
    public static final java.util.Map<java.lang.String, java.lang.String> SHORT_IDS;
    private static final long serialVersionUID = 8352817235686L;

    abstract void getHighSpeedVideoFpsRanges(java.io.DataOutput dataOutput) throws java.io.IOException;

    public abstract java.lang.String getId();

    public abstract org.threeten.bp.zone.ZoneRules getRules();

    static {
        java.util.HashMap hashMap = new java.util.HashMap();
        hashMap.put("ACT", "Australia/Darwin");
        hashMap.put("AET", "Australia/Sydney");
        hashMap.put("AGT", "America/Argentina/Buenos_Aires");
        hashMap.put("ART", "Africa/Cairo");
        hashMap.put("AST", "America/Anchorage");
        hashMap.put("BET", "America/Sao_Paulo");
        hashMap.put("BST", "Asia/Dhaka");
        hashMap.put("CAT", "Africa/Harare");
        hashMap.put("CNT", "America/St_Johns");
        hashMap.put("CST", "America/Chicago");
        hashMap.put("CTT", "Asia/Shanghai");
        hashMap.put("EAT", "Africa/Addis_Ababa");
        hashMap.put(com.google.common.net.HttpHeaders.ECT, "Europe/Paris");
        hashMap.put("IET", "America/Indiana/Indianapolis");
        hashMap.put("IST", "Asia/Kolkata");
        hashMap.put("JST", "Asia/Tokyo");
        hashMap.put("MIT", "Pacific/Apia");
        hashMap.put("NET", "Asia/Yerevan");
        hashMap.put("NST", "Pacific/Auckland");
        hashMap.put("PLT", "Asia/Karachi");
        hashMap.put("PNT", "America/Phoenix");
        hashMap.put("PRT", "America/Puerto_Rico");
        hashMap.put("PST", "America/Los_Angeles");
        hashMap.put("SST", "Pacific/Guadalcanal");
        hashMap.put("VST", "Asia/Ho_Chi_Minh");
        hashMap.put("EST", "-05:00");
        hashMap.put("MST", "-07:00");
        hashMap.put("HST", "-10:00");
        SHORT_IDS = java.util.Collections.unmodifiableMap(hashMap);
    }

    public static org.threeten.bp.ZoneId systemDefault() {
        return of(java.util.TimeZone.getDefault().getID(), SHORT_IDS);
    }

    public static java.util.Set<java.lang.String> getAvailableZoneIds() {
        return new java.util.HashSet(org.threeten.bp.zone.ZoneRulesProvider.getAvailableZoneIds());
    }

    public static org.threeten.bp.ZoneId of(java.lang.String str, java.util.Map<java.lang.String, java.lang.String> map) {
        org.threeten.bp.jdk8.Jdk8Methods.requireNonNull(str, "zoneId");
        org.threeten.bp.jdk8.Jdk8Methods.requireNonNull(map, "aliasMap");
        java.lang.String str2 = map.get(str);
        if (str2 != null) {
            str = str2;
        }
        return of(str);
    }

    public static org.threeten.bp.ZoneId of(java.lang.String str) {
        org.threeten.bp.jdk8.Jdk8Methods.requireNonNull(str, "zoneId");
        if (str.equals("Z")) {
            return org.threeten.bp.ZoneOffset.UTC;
        }
        if (str.length() == 1) {
            throw new org.threeten.bp.DateTimeException("Invalid zone: ".concat(java.lang.String.valueOf(str)));
        }
        if (str.startsWith("+") || str.startsWith("-")) {
            return org.threeten.bp.ZoneOffset.of(str);
        }
        if (str.equals(com.paypal.oslo.feature.activity.domain.base.constants.ActivityConstants.DateTimeFormatConstants.KEY_TIMEZONE_UTC) || str.equals("GMT") || str.equals("UT")) {
            return new org.threeten.bp.ZoneRegion(str, org.threeten.bp.ZoneOffset.UTC.getRules());
        }
        if (str.startsWith("UTC+") || str.startsWith("GMT+") || str.startsWith("UTC-") || str.startsWith("GMT-")) {
            org.threeten.bp.ZoneOffset of = org.threeten.bp.ZoneOffset.of(str.substring(3));
            if (of.getTotalSeconds() == 0) {
                return new org.threeten.bp.ZoneRegion(str.substring(0, 3), of.getRules());
            }
            java.lang.StringBuilder sb = new java.lang.StringBuilder();
            sb.append(str.substring(0, 3));
            sb.append(of.getId());
            return new org.threeten.bp.ZoneRegion(sb.toString(), of.getRules());
        }
        if (str.startsWith("UT+") || str.startsWith("UT-")) {
            org.threeten.bp.ZoneOffset of2 = org.threeten.bp.ZoneOffset.of(str.substring(2));
            if (of2.getTotalSeconds() == 0) {
                return new org.threeten.bp.ZoneRegion("UT", of2.getRules());
            }
            java.lang.StringBuilder sb2 = new java.lang.StringBuilder("UT");
            sb2.append(of2.getId());
            return new org.threeten.bp.ZoneRegion(sb2.toString(), of2.getRules());
        }
        return org.threeten.bp.ZoneRegion.getHighSpeedVideoFpsRangesFor(str, true);
    }

    public static org.threeten.bp.ZoneId ofOffset(java.lang.String str, org.threeten.bp.ZoneOffset zoneOffset) {
        org.threeten.bp.jdk8.Jdk8Methods.requireNonNull(str, "prefix");
        org.threeten.bp.jdk8.Jdk8Methods.requireNonNull(zoneOffset, "offset");
        if (str.length() == 0) {
            return zoneOffset;
        }
        if (str.equals("GMT") || str.equals(com.paypal.oslo.feature.activity.domain.base.constants.ActivityConstants.DateTimeFormatConstants.KEY_TIMEZONE_UTC) || str.equals("UT")) {
            if (zoneOffset.getTotalSeconds() == 0) {
                return new org.threeten.bp.ZoneRegion(str, zoneOffset.getRules());
            }
            java.lang.StringBuilder sb = new java.lang.StringBuilder();
            sb.append(str);
            sb.append(zoneOffset.getId());
            return new org.threeten.bp.ZoneRegion(sb.toString(), zoneOffset.getRules());
        }
        throw new java.lang.IllegalArgumentException("Invalid prefix, must be GMT, UTC or UT: ".concat(java.lang.String.valueOf(str)));
    }

    public static org.threeten.bp.ZoneId from(org.threeten.bp.temporal.TemporalAccessor temporalAccessor) {
        org.threeten.bp.ZoneId zoneId = (org.threeten.bp.ZoneId) temporalAccessor.query(org.threeten.bp.temporal.TemporalQueries.zone());
        if (zoneId != null) {
            return zoneId;
        }
        java.lang.StringBuilder sb = new java.lang.StringBuilder("Unable to obtain ZoneId from TemporalAccessor: ");
        sb.append(temporalAccessor);
        sb.append(", type ");
        sb.append(temporalAccessor.getClass().getName());
        throw new org.threeten.bp.DateTimeException(sb.toString());
    }

    ZoneId() {
        if (getClass() != org.threeten.bp.ZoneOffset.class && getClass() != org.threeten.bp.ZoneRegion.class) {
            throw new java.lang.AssertionError("Invalid subclass");
        }
    }

    public java.lang.String getDisplayName(org.threeten.bp.format.TextStyle textStyle, java.util.Locale locale) {
        return new org.threeten.bp.format.DateTimeFormatterBuilder().appendZoneText(textStyle).toFormatter(locale).format(new org.threeten.bp.jdk8.DefaultInterfaceTemporalAccessor() { // from class: org.threeten.bp.ZoneId.2
            @Override // org.threeten.bp.temporal.TemporalAccessor
            public boolean isSupported(org.threeten.bp.temporal.TemporalField temporalField) {
                return false;
            }

            @Override // org.threeten.bp.temporal.TemporalAccessor
            public long getLong(org.threeten.bp.temporal.TemporalField temporalField) {
                throw new org.threeten.bp.temporal.UnsupportedTemporalTypeException("Unsupported field: ".concat(java.lang.String.valueOf(temporalField)));
            }

            @Override // org.threeten.bp.jdk8.DefaultInterfaceTemporalAccessor, org.threeten.bp.temporal.TemporalAccessor
            public <R> R query(org.threeten.bp.temporal.TemporalQuery<R> temporalQuery) {
                if (temporalQuery == org.threeten.bp.temporal.TemporalQueries.zoneId()) {
                    return (R) org.threeten.bp.ZoneId.this;
                }
                return (R) super.query(temporalQuery);
            }
        });
    }

    public org.threeten.bp.ZoneId normalized() {
        try {
            org.threeten.bp.zone.ZoneRules rules = getRules();
            if (rules.isFixedOffset()) {
                return rules.getOffset(org.threeten.bp.Instant.EPOCH);
            }
        } catch (org.threeten.bp.zone.ZoneRulesException unused) {
        }
        return this;
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof org.threeten.bp.ZoneId) {
            return getId().equals(((org.threeten.bp.ZoneId) obj).getId());
        }
        return false;
    }

    public int hashCode() {
        return getId().hashCode();
    }

    public java.lang.String toString() {
        return getId();
    }
}
