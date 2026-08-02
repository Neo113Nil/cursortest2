package org.jose4j.jwt.consumer;

/* loaded from: classes18.dex */
public class SubValidator implements org.jose4j.jwt.consumer.ErrorCodeValidator {
    private static final org.jose4j.jwt.consumer.ErrorCodeValidator.Error getHighResolutionOutputSizeshNQ4ISI = new org.jose4j.jwt.consumer.ErrorCodeValidator.Error(14, "No Subject (sub) claim is present.");
    private java.lang.String Camera2StreamConfigurationMap;
    private boolean getHighSpeedVideoSizes;

    public SubValidator(boolean z) {
        this.getHighSpeedVideoSizes = z;
    }

    public SubValidator(java.lang.String str) {
        this(true);
        this.Camera2StreamConfigurationMap = str;
    }

    @Override // org.jose4j.jwt.consumer.ErrorCodeValidator
    public org.jose4j.jwt.consumer.ErrorCodeValidator.Error validate(org.jose4j.jwt.consumer.JwtContext jwtContext) throws org.jose4j.jwt.MalformedClaimException {
        java.lang.String subject = jwtContext.getJwtClaims().getSubject();
        if (subject == null && this.getHighSpeedVideoSizes) {
            return getHighResolutionOutputSizeshNQ4ISI;
        }
        java.lang.String str = this.Camera2StreamConfigurationMap;
        if (str == null || str.equals(subject)) {
            return null;
        }
        java.lang.StringBuilder sb = new java.lang.StringBuilder("Subject (sub) claim value (");
        sb.append(subject);
        sb.append(") doesn't match expected value of ");
        sb.append(this.Camera2StreamConfigurationMap);
        return new org.jose4j.jwt.consumer.ErrorCodeValidator.Error(15, sb.toString());
    }
}
