package com.paypal.oslo.downloads.api.model;

@kotlin.Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\b6\u0018\u00002\u00020\u0001:\u0002\u0004\u0005B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0002\u0006\u0007"}, d2 = {"Lcom/paypal/oslo/downloads/api/model/DownloadRequestResult;", "", "<init>", "()V", "Success", "ValidationFailed", "Lcom/paypal/oslo/downloads/api/model/DownloadRequestResult$Success;", "Lcom/paypal/oslo/downloads/api/model/DownloadRequestResult$ValidationFailed;"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes10.dex */
public abstract class DownloadRequestResult {
    private DownloadRequestResult() {
    }

    @kotlin.Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\b\u0086\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\b\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\n\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\n\u0010\u000bJ$\u0010\f\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u0004HÆ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0011\u001a\u00020\u00102\b\u0010\u000f\u001a\u0004\u0018\u00010\u000eHÖ\u0003¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0014\u001a\u00020\u0013HÖ\u0001¢\u0006\u0004\b\u0014\u0010\u0015J\u0010\u0010\u0017\u001a\u00020\u0016HÖ\u0001¢\u0006\u0004\b\u0017\u0010\u0018R\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0019\u001a\u0004\b\u001a\u0010\tR\u001a\u0010\u0005\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u001b\u001a\u0004\b\u001c\u0010\u000b"}, d2 = {"Lcom/paypal/oslo/downloads/api/model/DownloadRequestResult$Success;", "Lcom/paypal/oslo/downloads/api/model/DownloadRequestResult;", "Lcom/paypal/oslo/downloads/api/model/DownloadRequest;", "request", "Lcom/paypal/oslo/downloads/api/validation/ValidationResult;", "validationResult", "<init>", "(Lcom/paypal/oslo/downloads/api/model/DownloadRequest;Lcom/paypal/oslo/downloads/api/validation/ValidationResult;)V", "component1", "()Lcom/paypal/oslo/downloads/api/model/DownloadRequest;", "component2", "()Lcom/paypal/oslo/downloads/api/validation/ValidationResult;", "copy", "(Lcom/paypal/oslo/downloads/api/model/DownloadRequest;Lcom/paypal/oslo/downloads/api/validation/ValidationResult;)Lcom/paypal/oslo/downloads/api/model/DownloadRequestResult$Success;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "Lcom/paypal/oslo/downloads/api/model/DownloadRequest;", "getRequest", "Lcom/paypal/oslo/downloads/api/validation/ValidationResult;", "getValidationResult"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class Success extends com.paypal.oslo.downloads.api.model.DownloadRequestResult {
        private final com.paypal.oslo.downloads.api.model.DownloadRequest request;
        private final com.paypal.oslo.downloads.api.validation.ValidationResult validationResult;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Success(com.paypal.oslo.downloads.api.model.DownloadRequest downloadRequest, com.paypal.oslo.downloads.api.validation.ValidationResult validationResult) {
            super(null);
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(downloadRequest, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(validationResult, "");
            this.request = downloadRequest;
            this.validationResult = validationResult;
        }

        public final com.paypal.oslo.downloads.api.model.DownloadRequest getRequest() {
            return this.request;
        }

        public final com.paypal.oslo.downloads.api.validation.ValidationResult getValidationResult() {
            return this.validationResult;
        }

        public final java.lang.String toString() {
            com.paypal.oslo.downloads.api.model.DownloadRequest downloadRequest = this.request;
            com.paypal.oslo.downloads.api.validation.ValidationResult validationResult = this.validationResult;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("Success(request=");
            sb.append(downloadRequest);
            sb.append(", validationResult=");
            sb.append(validationResult);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            return (this.request.hashCode() * 31) + this.validationResult.hashCode();
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.downloads.api.model.DownloadRequestResult.Success)) {
                return false;
            }
            com.paypal.oslo.downloads.api.model.DownloadRequestResult.Success success = (com.paypal.oslo.downloads.api.model.DownloadRequestResult.Success) other;
            return kotlin.jvm.internal.Intrinsics.areEqual(this.request, success.request) && kotlin.jvm.internal.Intrinsics.areEqual(this.validationResult, success.validationResult);
        }

        public final com.paypal.oslo.downloads.api.model.DownloadRequestResult.Success copy(com.paypal.oslo.downloads.api.model.DownloadRequest request, com.paypal.oslo.downloads.api.validation.ValidationResult validationResult) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(request, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(validationResult, "");
            return new com.paypal.oslo.downloads.api.model.DownloadRequestResult.Success(request, validationResult);
        }

        /* renamed from: component2, reason: from getter */
        public final com.paypal.oslo.downloads.api.validation.ValidationResult getValidationResult() {
            return this.validationResult;
        }

        /* renamed from: component1, reason: from getter */
        public final com.paypal.oslo.downloads.api.model.DownloadRequest getRequest() {
            return this.request;
        }

        public static /* synthetic */ com.paypal.oslo.downloads.api.model.DownloadRequestResult.Success copy$default(com.paypal.oslo.downloads.api.model.DownloadRequestResult.Success success, com.paypal.oslo.downloads.api.model.DownloadRequest downloadRequest, com.paypal.oslo.downloads.api.validation.ValidationResult validationResult, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                downloadRequest = success.request;
            }
            if ((i & 2) != 0) {
                validationResult = success.validationResult;
            }
            return success.copy(downloadRequest, validationResult);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u001a\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0013\u001a\u00020\u0012HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014R\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0015\u001a\u0004\b\u0016\u0010\u0007"}, d2 = {"Lcom/paypal/oslo/downloads/api/model/DownloadRequestResult$ValidationFailed;", "Lcom/paypal/oslo/downloads/api/model/DownloadRequestResult;", "Lcom/paypal/oslo/downloads/api/validation/ValidationResult;", "validationResult", "<init>", "(Lcom/paypal/oslo/downloads/api/validation/ValidationResult;)V", "component1", "()Lcom/paypal/oslo/downloads/api/validation/ValidationResult;", "copy", "(Lcom/paypal/oslo/downloads/api/validation/ValidationResult;)Lcom/paypal/oslo/downloads/api/model/DownloadRequestResult$ValidationFailed;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "Lcom/paypal/oslo/downloads/api/validation/ValidationResult;", "getValidationResult"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class ValidationFailed extends com.paypal.oslo.downloads.api.model.DownloadRequestResult {
        private final com.paypal.oslo.downloads.api.validation.ValidationResult validationResult;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public ValidationFailed(com.paypal.oslo.downloads.api.validation.ValidationResult validationResult) {
            super(null);
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(validationResult, "");
            this.validationResult = validationResult;
        }

        public final com.paypal.oslo.downloads.api.validation.ValidationResult getValidationResult() {
            return this.validationResult;
        }

        public final java.lang.String toString() {
            com.paypal.oslo.downloads.api.validation.ValidationResult validationResult = this.validationResult;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("ValidationFailed(validationResult=");
            sb.append(validationResult);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            return this.validationResult.hashCode();
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof com.paypal.oslo.downloads.api.model.DownloadRequestResult.ValidationFailed) && kotlin.jvm.internal.Intrinsics.areEqual(this.validationResult, ((com.paypal.oslo.downloads.api.model.DownloadRequestResult.ValidationFailed) other).validationResult);
        }

        public final com.paypal.oslo.downloads.api.model.DownloadRequestResult.ValidationFailed copy(com.paypal.oslo.downloads.api.validation.ValidationResult validationResult) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(validationResult, "");
            return new com.paypal.oslo.downloads.api.model.DownloadRequestResult.ValidationFailed(validationResult);
        }

        /* renamed from: component1, reason: from getter */
        public final com.paypal.oslo.downloads.api.validation.ValidationResult getValidationResult() {
            return this.validationResult;
        }

        public static /* synthetic */ com.paypal.oslo.downloads.api.model.DownloadRequestResult.ValidationFailed copy$default(com.paypal.oslo.downloads.api.model.DownloadRequestResult.ValidationFailed validationFailed, com.paypal.oslo.downloads.api.validation.ValidationResult validationResult, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                validationResult = validationFailed.validationResult;
            }
            return validationFailed.copy(validationResult);
        }
    }

    public /* synthetic */ DownloadRequestResult(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }
}
