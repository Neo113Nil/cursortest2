package com.adobe.marketing.mobile.edge.identity;

/* loaded from: classes3.dex */
final class ECID {
    private final java.lang.String getHighSpeedVideoFpsRangesFor;

    ECID() {
        java.util.UUID randomUUID = java.util.UUID.randomUUID();
        long mostSignificantBits = randomUUID.getMostSignificantBits();
        long leastSignificantBits = randomUUID.getLeastSignificantBits();
        this.getHighSpeedVideoFpsRangesFor = java.lang.String.format(java.util.Locale.US, "%019d%019d", java.lang.Long.valueOf(mostSignificantBits < 0 ? -mostSignificantBits : mostSignificantBits), java.lang.Long.valueOf(leastSignificantBits < 0 ? -leastSignificantBits : leastSignificantBits));
    }

    ECID(java.lang.String str) {
        if (com.adobe.marketing.mobile.util.StringUtils.isNullOrEmpty(str)) {
            com.adobe.marketing.mobile.services.Log.debug("EdgeIdentity", "ECID", "Creating an ECID with null or empty ecidString is not allowed, generating a new ECID.", new java.lang.Object[0]);
            this.getHighSpeedVideoFpsRangesFor = new com.adobe.marketing.mobile.edge.identity.ECID().toString();
        } else {
            this.getHighSpeedVideoFpsRangesFor = str;
        }
    }

    public final java.lang.String toString() {
        return this.getHighSpeedVideoFpsRangesFor;
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        return java.util.Objects.equals(this.getHighSpeedVideoFpsRangesFor, ((com.adobe.marketing.mobile.edge.identity.ECID) obj).getHighSpeedVideoFpsRangesFor);
    }

    public final int hashCode() {
        return java.util.Objects.hash(this.getHighSpeedVideoFpsRangesFor);
    }
}
