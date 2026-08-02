package org.jose4j.jwt.consumer;

/* loaded from: classes18.dex */
public class IssValidator implements org.jose4j.jwt.consumer.ErrorCodeValidator {
    private boolean getHighResolutionOutputSizeshNQ4ISI;
    private java.util.Set<java.lang.String> getHighSpeedVideoFpsRangesFor;

    public IssValidator(java.lang.String str, boolean z) {
        if (str != null) {
            this.getHighSpeedVideoFpsRangesFor = java.util.Collections.singleton(str);
        }
        this.getHighResolutionOutputSizeshNQ4ISI = z;
    }

    public IssValidator(boolean z, java.lang.String... strArr) {
        this.getHighResolutionOutputSizeshNQ4ISI = z;
        if (strArr == null || strArr.length <= 0) {
            return;
        }
        java.util.HashSet hashSet = new java.util.HashSet();
        this.getHighSpeedVideoFpsRangesFor = hashSet;
        java.util.Collections.addAll(hashSet, strArr);
    }

    @Override // org.jose4j.jwt.consumer.ErrorCodeValidator
    public org.jose4j.jwt.consumer.ErrorCodeValidator.Error validate(org.jose4j.jwt.consumer.JwtContext jwtContext) throws org.jose4j.jwt.MalformedClaimException {
        java.lang.String obj;
        java.lang.String issuer = jwtContext.getJwtClaims().getIssuer();
        org.jose4j.jwt.consumer.ErrorCodeValidator.Error error = null;
        if (issuer == null) {
            if (this.getHighResolutionOutputSizeshNQ4ISI) {
                return new org.jose4j.jwt.consumer.ErrorCodeValidator.Error(11, "No Issuer (iss) claim present.");
            }
            return null;
        }
        java.util.Set<java.lang.String> set = this.getHighSpeedVideoFpsRangesFor;
        if (set != null && !set.contains(issuer)) {
            java.lang.StringBuilder sb = new java.lang.StringBuilder("Issuer (iss) claim value (");
            sb.append(issuer);
            sb.append(") doesn't match expected value of ");
            if (this.getHighSpeedVideoFpsRangesFor.size() == 1) {
                obj = this.getHighSpeedVideoFpsRangesFor.iterator().next();
            } else {
                java.lang.StringBuilder sb2 = new java.lang.StringBuilder("one of ");
                sb2.append(this.getHighSpeedVideoFpsRangesFor);
                obj = sb2.toString();
            }
            sb.append(obj);
            error = new org.jose4j.jwt.consumer.ErrorCodeValidator.Error(12, sb.toString());
        }
        return error;
    }
}
