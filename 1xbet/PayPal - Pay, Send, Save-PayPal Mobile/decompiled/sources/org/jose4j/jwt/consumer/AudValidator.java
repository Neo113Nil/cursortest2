package org.jose4j.jwt.consumer;

/* loaded from: classes18.dex */
public class AudValidator implements org.jose4j.jwt.consumer.ErrorCodeValidator {
    private static final org.jose4j.jwt.consumer.ErrorCodeValidator.Error getHighSpeedVideoSizes = new org.jose4j.jwt.consumer.ErrorCodeValidator.Error(7, "No Audience (aud) claim present.");
    private java.util.Set<java.lang.String> Camera2StreamConfigurationMap;
    private boolean getHighSpeedVideoFpsRanges;

    public AudValidator(java.util.Set<java.lang.String> set, boolean z) {
        this.Camera2StreamConfigurationMap = set;
        this.getHighSpeedVideoFpsRanges = z;
    }

    @Override // org.jose4j.jwt.consumer.ErrorCodeValidator
    public org.jose4j.jwt.consumer.ErrorCodeValidator.Error validate(org.jose4j.jwt.consumer.JwtContext jwtContext) throws org.jose4j.jwt.MalformedClaimException {
        org.jose4j.jwt.JwtClaims jwtClaims = jwtContext.getJwtClaims();
        if (!jwtClaims.hasAudience()) {
            if (this.getHighSpeedVideoFpsRanges) {
                return getHighSpeedVideoSizes;
            }
            return null;
        }
        java.util.List<java.lang.String> audience = jwtClaims.getAudience();
        java.util.Iterator<java.lang.String> it = audience.iterator();
        boolean z = false;
        while (it.hasNext()) {
            if (this.Camera2StreamConfigurationMap.contains(it.next())) {
                z = true;
            }
        }
        if (z) {
            return null;
        }
        java.lang.StringBuilder sb = new java.lang.StringBuilder("Audience (aud) claim ");
        sb.append(audience);
        if (this.Camera2StreamConfigurationMap.isEmpty()) {
            sb.append(" present in the JWT but no expected audience value(s) were provided to the JWT Consumer.");
        } else {
            sb.append(" doesn't contain an acceptable identifier.");
        }
        sb.append(" Expected ");
        if (this.Camera2StreamConfigurationMap.size() == 1) {
            sb.append(this.Camera2StreamConfigurationMap.iterator().next());
        } else {
            sb.append("one of ");
            sb.append(this.Camera2StreamConfigurationMap);
        }
        sb.append(" as an aud value.");
        return new org.jose4j.jwt.consumer.ErrorCodeValidator.Error(8, sb.toString());
    }
}
