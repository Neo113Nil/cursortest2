package org.jose4j.jwt.consumer;

/* loaded from: classes18.dex */
public class JtiValidator implements org.jose4j.jwt.consumer.ErrorCodeValidator {
    private static final org.jose4j.jwt.consumer.ErrorCodeValidator.Error Camera2StreamConfigurationMap = new org.jose4j.jwt.consumer.ErrorCodeValidator.Error(13, "The JWT ID (jti) claim is not present.");
    private boolean getHighSpeedVideoFpsRanges;

    public JtiValidator(boolean z) {
        this.getHighSpeedVideoFpsRanges = z;
    }

    @Override // org.jose4j.jwt.consumer.ErrorCodeValidator
    public org.jose4j.jwt.consumer.ErrorCodeValidator.Error validate(org.jose4j.jwt.consumer.JwtContext jwtContext) throws org.jose4j.jwt.MalformedClaimException {
        if (jwtContext.getJwtClaims().getJwtId() == null && this.getHighSpeedVideoFpsRanges) {
            return Camera2StreamConfigurationMap;
        }
        return null;
    }
}
