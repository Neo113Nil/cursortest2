package org.jose4j.jwt.consumer;

/* loaded from: classes18.dex */
public class InvalidJwtException extends java.lang.Exception {
    private java.util.List<org.jose4j.jwt.consumer.ErrorCodeValidator.Error> getHighResolutionOutputSizeshNQ4ISI;
    private org.jose4j.jwt.consumer.JwtContext getHighSpeedVideoFpsRangesFor;

    public InvalidJwtException(java.lang.String str, java.util.List<org.jose4j.jwt.consumer.ErrorCodeValidator.Error> list, org.jose4j.jwt.consumer.JwtContext jwtContext) {
        super(str);
        java.util.Collections.emptyList();
        this.getHighResolutionOutputSizeshNQ4ISI = list;
        this.getHighSpeedVideoFpsRangesFor = jwtContext;
    }

    public InvalidJwtException(java.lang.String str, org.jose4j.jwt.consumer.ErrorCodeValidator.Error error, java.lang.Throwable th, org.jose4j.jwt.consumer.JwtContext jwtContext) {
        super(str, th);
        this.getHighResolutionOutputSizeshNQ4ISI = java.util.Collections.emptyList();
        this.getHighSpeedVideoFpsRangesFor = jwtContext;
        this.getHighResolutionOutputSizeshNQ4ISI = java.util.Collections.singletonList(error);
    }

    public boolean hasErrorCode(int i) {
        java.util.Iterator<org.jose4j.jwt.consumer.ErrorCodeValidator.Error> it = this.getHighResolutionOutputSizeshNQ4ISI.iterator();
        while (it.hasNext()) {
            if (i == it.next().getErrorCode()) {
                return true;
            }
        }
        return false;
    }

    public boolean hasExpired() {
        return hasErrorCode(1);
    }

    public java.util.List<org.jose4j.jwt.consumer.ErrorCodeValidator.Error> getErrorDetails() {
        return this.getHighResolutionOutputSizeshNQ4ISI;
    }

    public org.jose4j.jwt.consumer.JwtContext getJwtContext() {
        return this.getHighSpeedVideoFpsRangesFor;
    }

    @Override // java.lang.Throwable
    public java.lang.String getMessage() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append(super.getMessage());
        if (!this.getHighResolutionOutputSizeshNQ4ISI.isEmpty()) {
            sb.append(" Additional details: ");
            sb.append(this.getHighResolutionOutputSizeshNQ4ISI);
        }
        return sb.toString();
    }

    public java.lang.String getOriginalMessage() {
        return super.getMessage();
    }
}
