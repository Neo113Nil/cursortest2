package org.jose4j.jwt.consumer;

/* loaded from: classes18.dex */
public interface ErrorCodeValidator {
    org.jose4j.jwt.consumer.ErrorCodeValidator.Error validate(org.jose4j.jwt.consumer.JwtContext jwtContext) throws org.jose4j.jwt.MalformedClaimException;

    public static class Error {
        private java.lang.String Camera2StreamConfigurationMap;
        private int getHighResolutionOutputSizeshNQ4ISI;

        public Error(int i, java.lang.String str) {
            this.getHighResolutionOutputSizeshNQ4ISI = i;
            this.Camera2StreamConfigurationMap = str;
        }

        public int getErrorCode() {
            return this.getHighResolutionOutputSizeshNQ4ISI;
        }

        public java.lang.String getErrorMessage() {
            return this.Camera2StreamConfigurationMap;
        }

        public java.lang.String toString() {
            java.lang.StringBuilder sb = new java.lang.StringBuilder("[");
            sb.append(this.getHighResolutionOutputSizeshNQ4ISI);
            sb.append("] ");
            sb.append(this.Camera2StreamConfigurationMap);
            return sb.toString();
        }
    }
}
