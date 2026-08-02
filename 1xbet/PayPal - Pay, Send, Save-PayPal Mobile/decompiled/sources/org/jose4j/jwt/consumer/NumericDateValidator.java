package org.jose4j.jwt.consumer;

/* loaded from: classes18.dex */
public class NumericDateValidator implements org.jose4j.jwt.consumer.ErrorCodeValidator {
    private java.lang.Integer getHighSpeedVideoSizes;
    private java.lang.Integer getInputFormats;
    private boolean getInputSizeshNQ4ISI;
    private boolean getOutputFormats;
    private boolean getOutputMinFrameDuration;
    private org.jose4j.jwt.NumericDate getOutputStallDurationlomOqCM;
    private static final org.jose4j.jwt.consumer.ErrorCodeValidator.Error getHighResolutionOutputSizeshNQ4ISI = new org.jose4j.jwt.consumer.ErrorCodeValidator.Error(2, "No Expiration Time (exp) claim present.");
    private static final org.jose4j.jwt.consumer.ErrorCodeValidator.Error getHighSpeedVideoFpsRanges = new org.jose4j.jwt.consumer.ErrorCodeValidator.Error(3, "No Issued At (iat) claim present.");
    private static final org.jose4j.jwt.consumer.ErrorCodeValidator.Error Camera2StreamConfigurationMap = new org.jose4j.jwt.consumer.ErrorCodeValidator.Error(4, "No Not Before (nbf) claim present.");
    private int getHighSpeedVideoFpsRangesFor = 0;
    private int getHighSpeedVideoSizesFor = 0;

    public void setRequireExp(boolean z) {
        this.getOutputMinFrameDuration = z;
    }

    public void setRequireIat(boolean z) {
        this.getInputSizeshNQ4ISI = z;
    }

    public void setRequireNbf(boolean z) {
        this.getOutputFormats = z;
    }

    public void setEvaluationTime(org.jose4j.jwt.NumericDate numericDate) {
        this.getOutputStallDurationlomOqCM = numericDate;
    }

    public void setAllowedClockSkewSeconds(int i) {
        this.getHighSpeedVideoFpsRangesFor = i;
    }

    public void setMaxFutureValidityInMinutes(int i) {
        this.getHighSpeedVideoSizesFor = i;
    }

    public void setIatAllowedSecondsInTheFuture(int i) {
        this.getHighSpeedVideoSizes = java.lang.Integer.valueOf(i);
    }

    public void setIatAllowedSecondsInThePast(int i) {
        this.getInputFormats = java.lang.Integer.valueOf(i);
    }

    @Override // org.jose4j.jwt.consumer.ErrorCodeValidator
    public org.jose4j.jwt.consumer.ErrorCodeValidator.Error validate(org.jose4j.jwt.consumer.JwtContext jwtContext) throws org.jose4j.jwt.MalformedClaimException {
        org.jose4j.jwt.JwtClaims jwtClaims = jwtContext.getJwtClaims();
        org.jose4j.jwt.NumericDate expirationTime = jwtClaims.getExpirationTime();
        org.jose4j.jwt.NumericDate issuedAt = jwtClaims.getIssuedAt();
        org.jose4j.jwt.NumericDate notBefore = jwtClaims.getNotBefore();
        if (this.getOutputMinFrameDuration && expirationTime == null) {
            return getHighResolutionOutputSizeshNQ4ISI;
        }
        if (this.getInputSizeshNQ4ISI && issuedAt == null) {
            return getHighSpeedVideoFpsRanges;
        }
        if (this.getOutputFormats && notBefore == null) {
            return Camera2StreamConfigurationMap;
        }
        org.jose4j.jwt.NumericDate numericDate = this.getOutputStallDurationlomOqCM;
        if (numericDate == null) {
            numericDate = org.jose4j.jwt.NumericDate.now();
        }
        if (expirationTime != null) {
            if (org.jose4j.lang.Maths.subtract(numericDate.getValue(), this.getHighSpeedVideoFpsRangesFor) >= expirationTime.getValue()) {
                java.lang.StringBuilder sb = new java.lang.StringBuilder("The JWT is no longer valid - the evaluation time ");
                sb.append(numericDate);
                sb.append(" is on or after the Expiration Time (exp=");
                sb.append(expirationTime);
                sb.append(") claim value");
                sb.append(getHighSpeedVideoFpsRangesFor());
                return new org.jose4j.jwt.consumer.ErrorCodeValidator.Error(1, sb.toString());
            }
            if (issuedAt != null && expirationTime.isBefore(issuedAt)) {
                java.lang.StringBuilder sb2 = new java.lang.StringBuilder("The Expiration Time (exp=");
                sb2.append(expirationTime);
                sb2.append(") claim value cannot be before the Issued At (iat=");
                sb2.append(issuedAt);
                sb2.append(") claim value.");
                return new org.jose4j.jwt.consumer.ErrorCodeValidator.Error(17, sb2.toString());
            }
            if (notBefore != null && expirationTime.isBefore(notBefore)) {
                java.lang.StringBuilder sb3 = new java.lang.StringBuilder("The Expiration Time (exp=");
                sb3.append(expirationTime);
                sb3.append(") claim value cannot be before the Not Before (nbf=");
                sb3.append(notBefore);
                sb3.append(") claim value.");
                return new org.jose4j.jwt.consumer.ErrorCodeValidator.Error(17, sb3.toString());
            }
            if (this.getHighSpeedVideoSizesFor > 0 && org.jose4j.lang.Maths.subtract(org.jose4j.lang.Maths.subtract(expirationTime.getValue(), this.getHighSpeedVideoFpsRangesFor), numericDate.getValue()) > this.getHighSpeedVideoSizesFor * 60) {
                java.lang.StringBuilder sb4 = new java.lang.StringBuilder("The Expiration Time (exp=");
                sb4.append(expirationTime);
                sb4.append(") claim value cannot be more than ");
                sb4.append(this.getHighSpeedVideoSizesFor);
                sb4.append(" minutes in the future relative to the evaluation time ");
                sb4.append(numericDate);
                sb4.append(getHighSpeedVideoFpsRangesFor());
                return new org.jose4j.jwt.consumer.ErrorCodeValidator.Error(5, sb4.toString());
            }
        }
        if (notBefore != null && org.jose4j.lang.Maths.add(numericDate.getValue(), this.getHighSpeedVideoFpsRangesFor) < notBefore.getValue()) {
            java.lang.StringBuilder sb5 = new java.lang.StringBuilder("The JWT is not yet valid as the evaluation time ");
            sb5.append(numericDate);
            sb5.append(" is before the Not Before (nbf=");
            sb5.append(notBefore);
            sb5.append(") claim time");
            sb5.append(getHighSpeedVideoFpsRangesFor());
            return new org.jose4j.jwt.consumer.ErrorCodeValidator.Error(6, sb5.toString());
        }
        if (issuedAt == null) {
            return null;
        }
        if (this.getHighSpeedVideoSizes != null && org.jose4j.lang.Maths.subtract(org.jose4j.lang.Maths.subtract(issuedAt.getValue(), numericDate.getValue()), this.getHighSpeedVideoFpsRangesFor) > this.getHighSpeedVideoSizes.intValue()) {
            java.lang.StringBuilder sb6 = new java.lang.StringBuilder("iat ");
            sb6.append(issuedAt);
            sb6.append(" is more than ");
            sb6.append(this.getHighSpeedVideoSizes);
            sb6.append(" second(s) ahead of now ");
            sb6.append(numericDate);
            sb6.append(getHighSpeedVideoFpsRangesFor());
            return new org.jose4j.jwt.consumer.ErrorCodeValidator.Error(23, sb6.toString());
        }
        if (this.getInputFormats == null || org.jose4j.lang.Maths.subtract(org.jose4j.lang.Maths.subtract(numericDate.getValue(), issuedAt.getValue()), this.getHighSpeedVideoFpsRangesFor) <= this.getInputFormats.intValue()) {
            return null;
        }
        java.lang.StringBuilder sb7 = new java.lang.StringBuilder("As of now ");
        sb7.append(numericDate);
        sb7.append(" iat ");
        sb7.append(issuedAt);
        sb7.append(" is more than ");
        sb7.append(this.getInputFormats);
        sb7.append(" second(s) in the past");
        sb7.append(getHighSpeedVideoFpsRangesFor());
        return new org.jose4j.jwt.consumer.ErrorCodeValidator.Error(24, sb7.toString());
    }

    private java.lang.String getHighSpeedVideoFpsRangesFor() {
        if (this.getHighSpeedVideoFpsRangesFor > 0) {
            java.lang.StringBuilder sb = new java.lang.StringBuilder(" (even when providing ");
            sb.append(this.getHighSpeedVideoFpsRangesFor);
            sb.append(" seconds of leeway to account for clock skew).");
            return sb.toString();
        }
        return ".";
    }
}
