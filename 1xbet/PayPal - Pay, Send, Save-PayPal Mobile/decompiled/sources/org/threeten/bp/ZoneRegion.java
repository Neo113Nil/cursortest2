package org.threeten.bp;

/* loaded from: classes18.dex */
final class ZoneRegion extends org.threeten.bp.ZoneId implements java.io.Serializable {
    private static final java.util.regex.Pattern Camera2StreamConfigurationMap = java.util.regex.Pattern.compile("[A-Za-z][A-Za-z0-9~/._+-]+");
    private static final long serialVersionUID = 8386373296231747096L;
    private final transient org.threeten.bp.zone.ZoneRules getHighSpeedVideoFpsRanges;
    final java.lang.String getHighSpeedVideoFpsRangesFor;

    static org.threeten.bp.ZoneRegion getHighSpeedVideoFpsRangesFor(java.lang.String str, boolean z) {
        org.threeten.bp.zone.ZoneRules zoneRules;
        org.threeten.bp.jdk8.Jdk8Methods.requireNonNull(str, "zoneId");
        if (str.length() < 2 || !Camera2StreamConfigurationMap.matcher(str).matches()) {
            throw new org.threeten.bp.DateTimeException("Invalid ID for region-based ZoneId, invalid format: ".concat(java.lang.String.valueOf(str)));
        }
        try {
            zoneRules = org.threeten.bp.zone.ZoneRulesProvider.getRules(str, true);
        } catch (org.threeten.bp.zone.ZoneRulesException e) {
            if (str.equals("GMT0")) {
                zoneRules = org.threeten.bp.ZoneOffset.UTC.getRules();
            } else {
                if (z) {
                    throw e;
                }
                zoneRules = null;
            }
        }
        return new org.threeten.bp.ZoneRegion(str, zoneRules);
    }

    ZoneRegion(java.lang.String str, org.threeten.bp.zone.ZoneRules zoneRules) {
        this.getHighSpeedVideoFpsRangesFor = str;
        this.getHighSpeedVideoFpsRanges = zoneRules;
    }

    @Override // org.threeten.bp.ZoneId
    public final java.lang.String getId() {
        return this.getHighSpeedVideoFpsRangesFor;
    }

    @Override // org.threeten.bp.ZoneId
    public final org.threeten.bp.zone.ZoneRules getRules() {
        org.threeten.bp.zone.ZoneRules zoneRules = this.getHighSpeedVideoFpsRanges;
        return zoneRules != null ? zoneRules : org.threeten.bp.zone.ZoneRulesProvider.getRules(this.getHighSpeedVideoFpsRangesFor, false);
    }

    private java.lang.Object writeReplace() {
        return new org.threeten.bp.Ser((byte) 7, this);
    }

    private java.lang.Object readResolve() throws java.io.ObjectStreamException {
        throw new java.io.InvalidObjectException("Deserialization via serialization delegate");
    }

    @Override // org.threeten.bp.ZoneId
    final void getHighSpeedVideoFpsRanges(java.io.DataOutput dataOutput) throws java.io.IOException {
        dataOutput.writeByte(7);
        dataOutput.writeUTF(this.getHighSpeedVideoFpsRangesFor);
    }

    static org.threeten.bp.ZoneId Camera2StreamConfigurationMap(java.io.DataInput dataInput) throws java.io.IOException {
        java.lang.String readUTF = dataInput.readUTF();
        if (readUTF.equals("Z") || readUTF.startsWith("+") || readUTF.startsWith("-")) {
            throw new org.threeten.bp.DateTimeException("Invalid ID for region-based ZoneId, invalid format: ".concat(java.lang.String.valueOf(readUTF)));
        }
        if (readUTF.equals(com.paypal.oslo.feature.activity.domain.base.constants.ActivityConstants.DateTimeFormatConstants.KEY_TIMEZONE_UTC) || readUTF.equals("GMT") || readUTF.equals("UT")) {
            return new org.threeten.bp.ZoneRegion(readUTF, org.threeten.bp.ZoneOffset.UTC.getRules());
        }
        if (readUTF.startsWith("UTC+") || readUTF.startsWith("GMT+") || readUTF.startsWith("UTC-") || readUTF.startsWith("GMT-")) {
            org.threeten.bp.ZoneOffset of = org.threeten.bp.ZoneOffset.of(readUTF.substring(3));
            if (of.getTotalSeconds() == 0) {
                return new org.threeten.bp.ZoneRegion(readUTF.substring(0, 3), of.getRules());
            }
            java.lang.StringBuilder sb = new java.lang.StringBuilder();
            sb.append(readUTF.substring(0, 3));
            sb.append(of.getId());
            return new org.threeten.bp.ZoneRegion(sb.toString(), of.getRules());
        }
        if (readUTF.startsWith("UT+") || readUTF.startsWith("UT-")) {
            org.threeten.bp.ZoneOffset of2 = org.threeten.bp.ZoneOffset.of(readUTF.substring(2));
            if (of2.getTotalSeconds() == 0) {
                return new org.threeten.bp.ZoneRegion("UT", of2.getRules());
            }
            java.lang.StringBuilder sb2 = new java.lang.StringBuilder("UT");
            sb2.append(of2.getId());
            return new org.threeten.bp.ZoneRegion(sb2.toString(), of2.getRules());
        }
        return getHighSpeedVideoFpsRangesFor(readUTF, false);
    }
}
