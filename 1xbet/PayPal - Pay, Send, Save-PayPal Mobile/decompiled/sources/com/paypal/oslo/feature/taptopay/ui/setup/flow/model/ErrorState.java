package com.paypal.oslo.feature.taptopay.ui.setup.flow.model;

@kotlin.Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\bv\u0018\u00002\u00020\u0001:\u0002\u0006\u0007R\u0016\u0010\u0005\u001a\u0004\u0018\u00010\u00028'X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004\u0082\u0001\u0002\b\tÀ\u0006\u0003"}, d2 = {"Lcom/paypal/oslo/feature/taptopay/ui/setup/flow/model/ErrorState;", "", "", "getErrorDescription", "()Ljava/lang/String;", "errorDescription", "Tokenization", "OtpError", "Lcom/paypal/oslo/feature/taptopay/ui/setup/flow/model/ErrorState$OtpError;", "Lcom/paypal/oslo/feature/taptopay/ui/setup/flow/model/ErrorState$Tokenization;"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes15.dex */
public interface ErrorState {
    java.lang.String getErrorDescription();

    @kotlin.Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\f\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u000b\b\u0086\b\u0018\u00002\u00020\u0001B1\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0004\u0012\b\b\u0002\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\u000b\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u000b\u0010\fJ\u0012\u0010\r\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b\r\u0010\u000eJ\u0012\u0010\u000f\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b\u000f\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u0007HÆ\u0003¢\u0006\u0004\b\u0010\u0010\u0011J<\u0010\u0012\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00042\b\b\u0002\u0010\b\u001a\u00020\u0007HÆ\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\u001a\u0010\u0017\u001a\u00020\u00162\b\u0010\u0015\u001a\u0004\u0018\u00010\u0014HÖ\u0003¢\u0006\u0004\b\u0017\u0010\u0018J\u0010\u0010\u0019\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\u0019\u0010\u0011J\u0010\u0010\u001a\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u001a\u0010\u000eR\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u001b\u001a\u0004\b\u001c\u0010\fR\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0017X\u0097\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u001d\u001a\u0004\b\u001e\u0010\u000eR\u001c\u0010\u0006\u001a\u0004\u0018\u00010\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u001d\u001a\u0004\b\u001f\u0010\u000eR\u001a\u0010\b\u001a\u00020\u00078\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\b\u0010 \u001a\u0004\b!\u0010\u0011"}, d2 = {"Lcom/paypal/oslo/feature/taptopay/ui/setup/flow/model/ErrorState$Tokenization;", "Lcom/paypal/oslo/feature/taptopay/ui/setup/flow/model/ErrorState;", "Lcom/paypal/oslo/feature/taptopay/ui/setup/flow/model/TokenizationErrorType;", "type", "", "errorDescription", "sdkErrorCode", "", "retryCount", "<init>", "(Lcom/paypal/oslo/feature/taptopay/ui/setup/flow/model/TokenizationErrorType;Ljava/lang/String;Ljava/lang/String;I)V", "component1", "()Lcom/paypal/oslo/feature/taptopay/ui/setup/flow/model/TokenizationErrorType;", "component2", "()Ljava/lang/String;", "component3", "component4", "()I", "copy", "(Lcom/paypal/oslo/feature/taptopay/ui/setup/flow/model/TokenizationErrorType;Ljava/lang/String;Ljava/lang/String;I)Lcom/paypal/oslo/feature/taptopay/ui/setup/flow/model/ErrorState$Tokenization;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "hashCode", "toString", "Lcom/paypal/oslo/feature/taptopay/ui/setup/flow/model/TokenizationErrorType;", "getType", "Ljava/lang/String;", "getErrorDescription", "getSdkErrorCode", com.visa.cbp.getEncExpo.warmup, "getRetryCount"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class Tokenization implements com.paypal.oslo.feature.taptopay.ui.setup.flow.model.ErrorState {
        public static final int $stable = 0;
        private final java.lang.String errorDescription;
        private final int retryCount;
        private final java.lang.String sdkErrorCode;
        private final com.paypal.oslo.feature.taptopay.ui.setup.flow.model.TokenizationErrorType type;

        public Tokenization(com.paypal.oslo.feature.taptopay.ui.setup.flow.model.TokenizationErrorType tokenizationErrorType, java.lang.String str, java.lang.String str2, int i) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(tokenizationErrorType, "");
            this.type = tokenizationErrorType;
            this.errorDescription = str;
            this.sdkErrorCode = str2;
            this.retryCount = i;
        }

        public /* synthetic */ Tokenization(com.paypal.oslo.feature.taptopay.ui.setup.flow.model.TokenizationErrorType tokenizationErrorType, java.lang.String str, java.lang.String str2, int i, int i2, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this(tokenizationErrorType, (i2 & 2) != 0 ? null : str, (i2 & 4) != 0 ? null : str2, (i2 & 8) != 0 ? 0 : i);
        }

        public final com.paypal.oslo.feature.taptopay.ui.setup.flow.model.TokenizationErrorType getType() {
            return this.type;
        }

        @Override // com.paypal.oslo.feature.taptopay.ui.setup.flow.model.ErrorState
        public final java.lang.String getErrorDescription() {
            return this.errorDescription;
        }

        public final java.lang.String getSdkErrorCode() {
            return this.sdkErrorCode;
        }

        public final int getRetryCount() {
            return this.retryCount;
        }

        public final java.lang.String toString() {
            com.paypal.oslo.feature.taptopay.ui.setup.flow.model.TokenizationErrorType tokenizationErrorType = this.type;
            java.lang.String str = this.errorDescription;
            java.lang.String str2 = this.sdkErrorCode;
            int i = this.retryCount;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("Tokenization(type=");
            sb.append(tokenizationErrorType);
            sb.append(", errorDescription=");
            sb.append(str);
            sb.append(", sdkErrorCode=");
            sb.append(str2);
            sb.append(", retryCount=");
            sb.append(i);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            int hashCode = this.type.hashCode();
            java.lang.String str = this.errorDescription;
            int hashCode2 = str == null ? 0 : str.hashCode();
            java.lang.String str2 = this.sdkErrorCode;
            return (((((hashCode * 31) + hashCode2) * 31) + (str2 != null ? str2.hashCode() : 0)) * 31) + java.lang.Integer.hashCode(this.retryCount);
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.taptopay.ui.setup.flow.model.ErrorState.Tokenization)) {
                return false;
            }
            com.paypal.oslo.feature.taptopay.ui.setup.flow.model.ErrorState.Tokenization tokenization = (com.paypal.oslo.feature.taptopay.ui.setup.flow.model.ErrorState.Tokenization) other;
            return this.type == tokenization.type && kotlin.jvm.internal.Intrinsics.areEqual(this.errorDescription, tokenization.errorDescription) && kotlin.jvm.internal.Intrinsics.areEqual(this.sdkErrorCode, tokenization.sdkErrorCode) && this.retryCount == tokenization.retryCount;
        }

        public final com.paypal.oslo.feature.taptopay.ui.setup.flow.model.ErrorState.Tokenization copy(com.paypal.oslo.feature.taptopay.ui.setup.flow.model.TokenizationErrorType type, java.lang.String errorDescription, java.lang.String sdkErrorCode, int retryCount) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(type, "");
            return new com.paypal.oslo.feature.taptopay.ui.setup.flow.model.ErrorState.Tokenization(type, errorDescription, sdkErrorCode, retryCount);
        }

        /* renamed from: component4, reason: from getter */
        public final int getRetryCount() {
            return this.retryCount;
        }

        /* renamed from: component3, reason: from getter */
        public final java.lang.String getSdkErrorCode() {
            return this.sdkErrorCode;
        }

        /* renamed from: component2, reason: from getter */
        public final java.lang.String getErrorDescription() {
            return this.errorDescription;
        }

        /* renamed from: component1, reason: from getter */
        public final com.paypal.oslo.feature.taptopay.ui.setup.flow.model.TokenizationErrorType getType() {
            return this.type;
        }

        public static /* synthetic */ com.paypal.oslo.feature.taptopay.ui.setup.flow.model.ErrorState.Tokenization copy$default(com.paypal.oslo.feature.taptopay.ui.setup.flow.model.ErrorState.Tokenization tokenization, com.paypal.oslo.feature.taptopay.ui.setup.flow.model.TokenizationErrorType tokenizationErrorType, java.lang.String str, java.lang.String str2, int i, int i2, java.lang.Object obj) {
            if ((i2 & 1) != 0) {
                tokenizationErrorType = tokenization.type;
            }
            if ((i2 & 2) != 0) {
                str = tokenization.errorDescription;
            }
            if ((i2 & 4) != 0) {
                str2 = tokenization.sdkErrorCode;
            }
            if ((i2 & 8) != 0) {
                i = tokenization.retryCount;
            }
            return tokenization.copy(tokenizationErrorType, str, str2, i);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\t\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0007\b\u0086\b\u0018\u00002\u00020\u0001B\u001b\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\b\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\b\u0010\tJ\u0012\u0010\n\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b\n\u0010\u000bJ&\u0010\f\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004HÆ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0011\u001a\u00020\u00102\b\u0010\u000f\u001a\u0004\u0018\u00010\u000eHÖ\u0003¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0014\u001a\u00020\u0013HÖ\u0001¢\u0006\u0004\b\u0014\u0010\u0015J\u0010\u0010\u0016\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0016\u0010\u000bR\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0017\u001a\u0004\b\u0018\u0010\tR\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0017X\u0097\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0019\u001a\u0004\b\u001a\u0010\u000b"}, d2 = {"Lcom/paypal/oslo/feature/taptopay/ui/setup/flow/model/ErrorState$OtpError;", "Lcom/paypal/oslo/feature/taptopay/ui/setup/flow/model/ErrorState;", "Lcom/paypal/oslo/feature/taptopay/domain/model/card/paypal/OTPErrorCode;", "errorCode", "", "errorDescription", "<init>", "(Lcom/paypal/oslo/feature/taptopay/domain/model/card/paypal/OTPErrorCode;Ljava/lang/String;)V", "component1", "()Lcom/paypal/oslo/feature/taptopay/domain/model/card/paypal/OTPErrorCode;", "component2", "()Ljava/lang/String;", "copy", "(Lcom/paypal/oslo/feature/taptopay/domain/model/card/paypal/OTPErrorCode;Ljava/lang/String;)Lcom/paypal/oslo/feature/taptopay/ui/setup/flow/model/ErrorState$OtpError;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "Lcom/paypal/oslo/feature/taptopay/domain/model/card/paypal/OTPErrorCode;", "getErrorCode", "Ljava/lang/String;", "getErrorDescription"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class OtpError implements com.paypal.oslo.feature.taptopay.ui.setup.flow.model.ErrorState {
        public static final int $stable = 0;
        private final com.paypal.oslo.feature.taptopay.domain.model.card.paypal.OTPErrorCode errorCode;
        private final java.lang.String errorDescription;

        public OtpError(com.paypal.oslo.feature.taptopay.domain.model.card.paypal.OTPErrorCode oTPErrorCode, java.lang.String str) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(oTPErrorCode, "");
            this.errorCode = oTPErrorCode;
            this.errorDescription = str;
        }

        public /* synthetic */ OtpError(com.paypal.oslo.feature.taptopay.domain.model.card.paypal.OTPErrorCode oTPErrorCode, java.lang.String str, int i, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this(oTPErrorCode, (i & 2) != 0 ? null : str);
        }

        public final com.paypal.oslo.feature.taptopay.domain.model.card.paypal.OTPErrorCode getErrorCode() {
            return this.errorCode;
        }

        @Override // com.paypal.oslo.feature.taptopay.ui.setup.flow.model.ErrorState
        public final java.lang.String getErrorDescription() {
            return this.errorDescription;
        }

        public final java.lang.String toString() {
            com.paypal.oslo.feature.taptopay.domain.model.card.paypal.OTPErrorCode oTPErrorCode = this.errorCode;
            java.lang.String str = this.errorDescription;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("OtpError(errorCode=");
            sb.append(oTPErrorCode);
            sb.append(", errorDescription=");
            sb.append(str);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            int hashCode = this.errorCode.hashCode();
            java.lang.String str = this.errorDescription;
            return (hashCode * 31) + (str == null ? 0 : str.hashCode());
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.taptopay.ui.setup.flow.model.ErrorState.OtpError)) {
                return false;
            }
            com.paypal.oslo.feature.taptopay.ui.setup.flow.model.ErrorState.OtpError otpError = (com.paypal.oslo.feature.taptopay.ui.setup.flow.model.ErrorState.OtpError) other;
            return this.errorCode == otpError.errorCode && kotlin.jvm.internal.Intrinsics.areEqual(this.errorDescription, otpError.errorDescription);
        }

        public final com.paypal.oslo.feature.taptopay.ui.setup.flow.model.ErrorState.OtpError copy(com.paypal.oslo.feature.taptopay.domain.model.card.paypal.OTPErrorCode errorCode, java.lang.String errorDescription) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(errorCode, "");
            return new com.paypal.oslo.feature.taptopay.ui.setup.flow.model.ErrorState.OtpError(errorCode, errorDescription);
        }

        /* renamed from: component2, reason: from getter */
        public final java.lang.String getErrorDescription() {
            return this.errorDescription;
        }

        /* renamed from: component1, reason: from getter */
        public final com.paypal.oslo.feature.taptopay.domain.model.card.paypal.OTPErrorCode getErrorCode() {
            return this.errorCode;
        }

        public static /* synthetic */ com.paypal.oslo.feature.taptopay.ui.setup.flow.model.ErrorState.OtpError copy$default(com.paypal.oslo.feature.taptopay.ui.setup.flow.model.ErrorState.OtpError otpError, com.paypal.oslo.feature.taptopay.domain.model.card.paypal.OTPErrorCode oTPErrorCode, java.lang.String str, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                oTPErrorCode = otpError.errorCode;
            }
            if ((i & 2) != 0) {
                str = otpError.errorDescription;
            }
            return otpError.copy(oTPErrorCode, str);
        }
    }
}
