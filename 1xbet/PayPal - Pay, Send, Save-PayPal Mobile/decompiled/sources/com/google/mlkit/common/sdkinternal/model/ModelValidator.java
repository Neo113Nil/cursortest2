package com.google.mlkit.common.sdkinternal.model;

/* loaded from: classes9.dex */
public interface ModelValidator {
    com.google.mlkit.common.sdkinternal.model.ModelValidator.ValidationResult validateModel(java.io.File file, com.google.mlkit.common.model.RemoteModel remoteModel);

    public static class ValidationResult {
        public static final com.google.mlkit.common.sdkinternal.model.ModelValidator.ValidationResult VALID = new com.google.mlkit.common.sdkinternal.model.ModelValidator.ValidationResult(com.google.mlkit.common.sdkinternal.model.ModelValidator.ValidationResult.ErrorCode.OK, null);
        private final com.google.mlkit.common.sdkinternal.model.ModelValidator.ValidationResult.ErrorCode zza;
        private final java.lang.String zzb;

        public enum ErrorCode {
            OK,
            TFLITE_VERSION_INCOMPATIBLE,
            MODEL_FORMAT_INVALID
        }

        public boolean isValid() {
            return this.zza == com.google.mlkit.common.sdkinternal.model.ModelValidator.ValidationResult.ErrorCode.OK;
        }

        public java.lang.String getErrorMessage() {
            return this.zzb;
        }

        public com.google.mlkit.common.sdkinternal.model.ModelValidator.ValidationResult.ErrorCode getErrorCode() {
            return this.zza;
        }

        public ValidationResult(com.google.mlkit.common.sdkinternal.model.ModelValidator.ValidationResult.ErrorCode errorCode, java.lang.String str) {
            this.zza = errorCode;
            this.zzb = str;
        }
    }
}
