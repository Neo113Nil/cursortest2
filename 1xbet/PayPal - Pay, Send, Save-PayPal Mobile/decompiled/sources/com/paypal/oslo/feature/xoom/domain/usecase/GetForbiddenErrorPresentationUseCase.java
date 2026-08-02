package com.paypal.oslo.feature.xoom.domain.usecase;

@kotlin.Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\u00020\u0001:\u0001\tB\t\b\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0018\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0086\u0002¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"Lcom/paypal/oslo/feature/xoom/domain/usecase/GetForbiddenErrorPresentationUseCase;", "", "<init>", "()V", "Lcom/paypal/oslo/feature/xoom/domain/model/UserError$ForbiddenError;", "error", "Lcom/paypal/oslo/feature/xoom/domain/usecase/GetForbiddenErrorPresentationUseCase$ErrorPresentationResources;", "invoke", "(Lcom/paypal/oslo/feature/xoom/domain/model/UserError$ForbiddenError;)Lcom/paypal/oslo/feature/xoom/domain/usecase/GetForbiddenErrorPresentationUseCase$ErrorPresentationResources;", "ErrorPresentationResources"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes16.dex */
public final class GetForbiddenErrorPresentationUseCase {
    public static final int $stable = 0;

    @javax.inject.Inject
    public GetForbiddenErrorPresentationUseCase() {
    }

    @kotlin.Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u000f\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\b\b\u0080\b\u0018\u00002\u00020\u0001B+\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\t\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\u000b\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u000b\u0010\nJ\u0010\u0010\f\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\f\u0010\nJ\u0012\u0010\r\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\r\u0010\u000eJ:\u0010\u000f\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00022\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0002HÆ\u0001¢\u0006\u0004\b\u000f\u0010\u0010J\u001a\u0010\u0013\u001a\u00020\u00122\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0015\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0015\u0010\nJ\u0010\u0010\u0017\u001a\u00020\u0016HÖ\u0001¢\u0006\u0004\b\u0017\u0010\u0018R\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0019\u001a\u0004\b\u001a\u0010\nR\u001a\u0010\u0004\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u0019\u001a\u0004\b\u001b\u0010\nR\u001a\u0010\u0005\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0019\u001a\u0004\b\u001c\u0010\nR\u001c\u0010\u0006\u001a\u0004\u0018\u00010\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u001d\u001a\u0004\b\u001e\u0010\u000e"}, d2 = {"Lcom/paypal/oslo/feature/xoom/domain/usecase/GetForbiddenErrorPresentationUseCase$ErrorPresentationResources;", "", "", "titleRes", "descriptionRes", "primaryButtonTextRes", "secondaryButtonTextRes", "<init>", "(IIILjava/lang/Integer;)V", "component1", "()I", "component2", "component3", "component4", "()Ljava/lang/Integer;", "copy", "(IIILjava/lang/Integer;)Lcom/paypal/oslo/feature/xoom/domain/usecase/GetForbiddenErrorPresentationUseCase$ErrorPresentationResources;", "other", "", "equals", "(Ljava/lang/Object;)Z", "hashCode", "", "toString", "()Ljava/lang/String;", com.visa.cbp.getEncExpo.warmup, "getTitleRes", "getDescriptionRes", "getPrimaryButtonTextRes", "Ljava/lang/Integer;", "getSecondaryButtonTextRes"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class ErrorPresentationResources {
        public static final int $stable = 0;
        private final int descriptionRes;
        private final int primaryButtonTextRes;
        private final java.lang.Integer secondaryButtonTextRes;
        private final int titleRes;

        public ErrorPresentationResources(int i, int i2, int i3, java.lang.Integer num) {
            this.titleRes = i;
            this.descriptionRes = i2;
            this.primaryButtonTextRes = i3;
            this.secondaryButtonTextRes = num;
        }

        public /* synthetic */ ErrorPresentationResources(int i, int i2, int i3, java.lang.Integer num, int i4, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this(i, i2, i3, (i4 & 8) != 0 ? null : num);
        }

        public final int getTitleRes() {
            return this.titleRes;
        }

        public final int getDescriptionRes() {
            return this.descriptionRes;
        }

        public final int getPrimaryButtonTextRes() {
            return this.primaryButtonTextRes;
        }

        public final java.lang.Integer getSecondaryButtonTextRes() {
            return this.secondaryButtonTextRes;
        }

        public final java.lang.String toString() {
            int i = this.titleRes;
            int i2 = this.descriptionRes;
            int i3 = this.primaryButtonTextRes;
            java.lang.Integer num = this.secondaryButtonTextRes;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("ErrorPresentationResources(titleRes=");
            sb.append(i);
            sb.append(", descriptionRes=");
            sb.append(i2);
            sb.append(", primaryButtonTextRes=");
            sb.append(i3);
            sb.append(", secondaryButtonTextRes=");
            sb.append(num);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            int hashCode = java.lang.Integer.hashCode(this.titleRes);
            int hashCode2 = java.lang.Integer.hashCode(this.descriptionRes);
            int hashCode3 = java.lang.Integer.hashCode(this.primaryButtonTextRes);
            java.lang.Integer num = this.secondaryButtonTextRes;
            return (((((hashCode * 31) + hashCode2) * 31) + hashCode3) * 31) + (num == null ? 0 : num.hashCode());
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.xoom.domain.usecase.GetForbiddenErrorPresentationUseCase.ErrorPresentationResources)) {
                return false;
            }
            com.paypal.oslo.feature.xoom.domain.usecase.GetForbiddenErrorPresentationUseCase.ErrorPresentationResources errorPresentationResources = (com.paypal.oslo.feature.xoom.domain.usecase.GetForbiddenErrorPresentationUseCase.ErrorPresentationResources) other;
            return this.titleRes == errorPresentationResources.titleRes && this.descriptionRes == errorPresentationResources.descriptionRes && this.primaryButtonTextRes == errorPresentationResources.primaryButtonTextRes && kotlin.jvm.internal.Intrinsics.areEqual(this.secondaryButtonTextRes, errorPresentationResources.secondaryButtonTextRes);
        }

        public final com.paypal.oslo.feature.xoom.domain.usecase.GetForbiddenErrorPresentationUseCase.ErrorPresentationResources copy(int titleRes, int descriptionRes, int primaryButtonTextRes, java.lang.Integer secondaryButtonTextRes) {
            return new com.paypal.oslo.feature.xoom.domain.usecase.GetForbiddenErrorPresentationUseCase.ErrorPresentationResources(titleRes, descriptionRes, primaryButtonTextRes, secondaryButtonTextRes);
        }

        /* renamed from: component4, reason: from getter */
        public final java.lang.Integer getSecondaryButtonTextRes() {
            return this.secondaryButtonTextRes;
        }

        /* renamed from: component3, reason: from getter */
        public final int getPrimaryButtonTextRes() {
            return this.primaryButtonTextRes;
        }

        /* renamed from: component2, reason: from getter */
        public final int getDescriptionRes() {
            return this.descriptionRes;
        }

        /* renamed from: component1, reason: from getter */
        public final int getTitleRes() {
            return this.titleRes;
        }

        public static /* synthetic */ com.paypal.oslo.feature.xoom.domain.usecase.GetForbiddenErrorPresentationUseCase.ErrorPresentationResources copy$default(com.paypal.oslo.feature.xoom.domain.usecase.GetForbiddenErrorPresentationUseCase.ErrorPresentationResources errorPresentationResources, int i, int i2, int i3, java.lang.Integer num, int i4, java.lang.Object obj) {
            if ((i4 & 1) != 0) {
                i = errorPresentationResources.titleRes;
            }
            if ((i4 & 2) != 0) {
                i2 = errorPresentationResources.descriptionRes;
            }
            if ((i4 & 4) != 0) {
                i3 = errorPresentationResources.primaryButtonTextRes;
            }
            if ((i4 & 8) != 0) {
                num = errorPresentationResources.secondaryButtonTextRes;
            }
            return errorPresentationResources.copy(i, i2, i3, num);
        }
    }

    public final com.paypal.oslo.feature.xoom.domain.usecase.GetForbiddenErrorPresentationUseCase.ErrorPresentationResources invoke(com.paypal.oslo.feature.xoom.domain.model.UserError.ForbiddenError error) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(error, "");
        switch (com.paypal.oslo.feature.xoom.domain.usecase.GetForbiddenErrorPresentationUseCase.WhenMappings.$EnumSwitchMapping$0[error.getErrorType().ordinal()]) {
            case 1:
                return new com.paypal.oslo.feature.xoom.domain.usecase.GetForbiddenErrorPresentationUseCase.ErrorPresentationResources(com.paypal.oslo.feature.xoom.R.string.feature_xoom_account_restricted_title, com.paypal.oslo.feature.xoom.R.string.feature_xoom_account_limited_payments_message, com.paypal.oslo.feature.xoom.R.string.feature_xoom_general_error_button_ok, null, 8, null);
            case 2:
            case 3:
                return new com.paypal.oslo.feature.xoom.domain.usecase.GetForbiddenErrorPresentationUseCase.ErrorPresentationResources(com.paypal.oslo.feature.xoom.R.string.feature_xoom_account_blocked_business_title, com.paypal.oslo.feature.xoom.R.string.feature_xoom_account_blocked_business_message, com.paypal.oslo.feature.xoom.R.string.feature_xoom_general_error_button_ok, null, 8, null);
            case 4:
                return new com.paypal.oslo.feature.xoom.domain.usecase.GetForbiddenErrorPresentationUseCase.ErrorPresentationResources(com.paypal.oslo.feature.xoom.R.string.feature_xoom_account_blocked_country_title, com.paypal.oslo.feature.xoom.R.string.feature_xoom_account_blocked_country_message, com.paypal.oslo.feature.xoom.R.string.feature_xoom_general_error_button_ok, java.lang.Integer.valueOf(com.paypal.oslo.feature.xoom.R.string.feature_xoom_general_error_button_learn_more));
            case 5:
                return new com.paypal.oslo.feature.xoom.domain.usecase.GetForbiddenErrorPresentationUseCase.ErrorPresentationResources(com.paypal.oslo.feature.xoom.R.string.feature_xoom_account_terminated_title, com.paypal.oslo.feature.xoom.R.string.feature_xoom_account_terminated_message, com.paypal.oslo.feature.xoom.R.string.feature_xoom_general_error_button_ok, null, 8, null);
            case 6:
            case 7:
            case 8:
                return new com.paypal.oslo.feature.xoom.domain.usecase.GetForbiddenErrorPresentationUseCase.ErrorPresentationResources(com.paypal.oslo.feature.xoom.R.string.feature_xoom_account_restricted_title, com.paypal.oslo.feature.xoom.R.string.feature_xoom_account_restricted_message, com.paypal.oslo.feature.xoom.R.string.feature_xoom_general_error_button_ok, null, 8, null);
            default:
                throw new kotlin.NoWhenBranchMatchedException();
        }
    }

    @kotlin.Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[com.paypal.oslo.feature.xoom.domain.model.ForbiddenErrorType.values().length];
            try {
                iArr[com.paypal.oslo.feature.xoom.domain.model.ForbiddenErrorType.LIMITED_PAYMENTS.ordinal()] = 1;
            } catch (java.lang.NoSuchFieldError unused) {
            }
            try {
                iArr[com.paypal.oslo.feature.xoom.domain.model.ForbiddenErrorType.BLOCKED_BUSINESS.ordinal()] = 2;
            } catch (java.lang.NoSuchFieldError unused2) {
            }
            try {
                iArr[com.paypal.oslo.feature.xoom.domain.model.ForbiddenErrorType.UNAUTHORIZED_USER.ordinal()] = 3;
            } catch (java.lang.NoSuchFieldError unused3) {
            }
            try {
                iArr[com.paypal.oslo.feature.xoom.domain.model.ForbiddenErrorType.BLOCKED_COUNTRY.ordinal()] = 4;
            } catch (java.lang.NoSuchFieldError unused4) {
            }
            try {
                iArr[com.paypal.oslo.feature.xoom.domain.model.ForbiddenErrorType.TERMINATED.ordinal()] = 5;
            } catch (java.lang.NoSuchFieldError unused5) {
            }
            try {
                iArr[com.paypal.oslo.feature.xoom.domain.model.ForbiddenErrorType.BLOCKED.ordinal()] = 6;
            } catch (java.lang.NoSuchFieldError unused6) {
            }
            try {
                iArr[com.paypal.oslo.feature.xoom.domain.model.ForbiddenErrorType.LIMITED_COMPLIANCE.ordinal()] = 7;
            } catch (java.lang.NoSuchFieldError unused7) {
            }
            try {
                iArr[com.paypal.oslo.feature.xoom.domain.model.ForbiddenErrorType.UNSUPPORTED.ordinal()] = 8;
            } catch (java.lang.NoSuchFieldError unused8) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }
}
