package com.paypal.oslo.feature.xoom.domain.model;

@kotlin.Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\b0\u0018\u00002\u00020\u0001:\u0005\u0004\u0005\u0006\u0007\bB\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0005\t\n\u000b\f\r"}, d2 = {"Lcom/paypal/oslo/feature/xoom/domain/model/UserValidationResult;", "", "<init>", "()V", "ActiveUser", "UnlinkedUser", "InactiveUser", "ForbiddenUser", "NetworkError", "Lcom/paypal/oslo/feature/xoom/domain/model/UserValidationResult$ActiveUser;", "Lcom/paypal/oslo/feature/xoom/domain/model/UserValidationResult$ForbiddenUser;", "Lcom/paypal/oslo/feature/xoom/domain/model/UserValidationResult$InactiveUser;", "Lcom/paypal/oslo/feature/xoom/domain/model/UserValidationResult$NetworkError;", "Lcom/paypal/oslo/feature/xoom/domain/model/UserValidationResult$UnlinkedUser;"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes16.dex */
public abstract class UserValidationResult {
    public static final int $stable = 0;

    private UserValidationResult() {
    }

    @kotlin.Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001a\u0010\u0007\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004HÖ\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000e"}, d2 = {"Lcom/paypal/oslo/feature/xoom/domain/model/UserValidationResult$ActiveUser;", "Lcom/paypal/oslo/feature/xoom/domain/model/UserValidationResult;", "<init>", "()V", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class ActiveUser extends com.paypal.oslo.feature.xoom.domain.model.UserValidationResult {
        public static final int $stable = 0;
        public static final com.paypal.oslo.feature.xoom.domain.model.UserValidationResult.ActiveUser INSTANCE = new com.paypal.oslo.feature.xoom.domain.model.UserValidationResult.ActiveUser();

        public final int hashCode() {
            return 1591678935;
        }

        private ActiveUser() {
            super(null);
        }

        public final java.lang.String toString() {
            return "ActiveUser";
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.xoom.domain.model.UserValidationResult.ActiveUser)) {
                return false;
            }
            return true;
        }
    }

    @kotlin.Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001a\u0010\u0007\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004HÖ\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000e"}, d2 = {"Lcom/paypal/oslo/feature/xoom/domain/model/UserValidationResult$UnlinkedUser;", "Lcom/paypal/oslo/feature/xoom/domain/model/UserValidationResult;", "<init>", "()V", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class UnlinkedUser extends com.paypal.oslo.feature.xoom.domain.model.UserValidationResult {
        public static final int $stable = 0;
        public static final com.paypal.oslo.feature.xoom.domain.model.UserValidationResult.UnlinkedUser INSTANCE = new com.paypal.oslo.feature.xoom.domain.model.UserValidationResult.UnlinkedUser();

        public final int hashCode() {
            return -1716486333;
        }

        private UnlinkedUser() {
            super(null);
        }

        public final java.lang.String toString() {
            return "UnlinkedUser";
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.xoom.domain.model.UserValidationResult.UnlinkedUser)) {
                return false;
            }
            return true;
        }
    }

    @kotlin.Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u001a\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0013\u001a\u00020\u0012HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014R\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0015\u001a\u0004\b\u0016\u0010\u0007"}, d2 = {"Lcom/paypal/oslo/feature/xoom/domain/model/UserValidationResult$InactiveUser;", "Lcom/paypal/oslo/feature/xoom/domain/model/UserValidationResult;", "Lcom/paypal/oslo/feature/xoom/domain/model/FailedPaymentInfo;", "failedPaymentInfo", "<init>", "(Lcom/paypal/oslo/feature/xoom/domain/model/FailedPaymentInfo;)V", "component1", "()Lcom/paypal/oslo/feature/xoom/domain/model/FailedPaymentInfo;", "copy", "(Lcom/paypal/oslo/feature/xoom/domain/model/FailedPaymentInfo;)Lcom/paypal/oslo/feature/xoom/domain/model/UserValidationResult$InactiveUser;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "Lcom/paypal/oslo/feature/xoom/domain/model/FailedPaymentInfo;", "getFailedPaymentInfo"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class InactiveUser extends com.paypal.oslo.feature.xoom.domain.model.UserValidationResult {
        public static final int $stable = 0;
        private final com.paypal.oslo.feature.xoom.domain.model.FailedPaymentInfo failedPaymentInfo;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public InactiveUser(com.paypal.oslo.feature.xoom.domain.model.FailedPaymentInfo failedPaymentInfo) {
            super(null);
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(failedPaymentInfo, "");
            this.failedPaymentInfo = failedPaymentInfo;
        }

        public final com.paypal.oslo.feature.xoom.domain.model.FailedPaymentInfo getFailedPaymentInfo() {
            return this.failedPaymentInfo;
        }

        public final java.lang.String toString() {
            com.paypal.oslo.feature.xoom.domain.model.FailedPaymentInfo failedPaymentInfo = this.failedPaymentInfo;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("InactiveUser(failedPaymentInfo=");
            sb.append(failedPaymentInfo);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            return this.failedPaymentInfo.hashCode();
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof com.paypal.oslo.feature.xoom.domain.model.UserValidationResult.InactiveUser) && kotlin.jvm.internal.Intrinsics.areEqual(this.failedPaymentInfo, ((com.paypal.oslo.feature.xoom.domain.model.UserValidationResult.InactiveUser) other).failedPaymentInfo);
        }

        public final com.paypal.oslo.feature.xoom.domain.model.UserValidationResult.InactiveUser copy(com.paypal.oslo.feature.xoom.domain.model.FailedPaymentInfo failedPaymentInfo) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(failedPaymentInfo, "");
            return new com.paypal.oslo.feature.xoom.domain.model.UserValidationResult.InactiveUser(failedPaymentInfo);
        }

        /* renamed from: component1, reason: from getter */
        public final com.paypal.oslo.feature.xoom.domain.model.FailedPaymentInfo getFailedPaymentInfo() {
            return this.failedPaymentInfo;
        }

        public static /* synthetic */ com.paypal.oslo.feature.xoom.domain.model.UserValidationResult.InactiveUser copy$default(com.paypal.oslo.feature.xoom.domain.model.UserValidationResult.InactiveUser inactiveUser, com.paypal.oslo.feature.xoom.domain.model.FailedPaymentInfo failedPaymentInfo, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                failedPaymentInfo = inactiveUser.failedPaymentInfo;
            }
            return inactiveUser.copy(failedPaymentInfo);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u000b\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0006\b\u0086\b\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\b\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\n\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\n\u0010\tJ\u0010\u0010\u000b\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u000b\u0010\tJ.\u0010\f\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0011\u001a\u00020\u00102\b\u0010\u000f\u001a\u0004\u0018\u00010\u000eHÖ\u0003¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0013\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0013\u0010\tJ\u0010\u0010\u0015\u001a\u00020\u0014HÖ\u0001¢\u0006\u0004\b\u0015\u0010\u0016R\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0017\u001a\u0004\b\u0018\u0010\tR\u001a\u0010\u0004\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u0017\u001a\u0004\b\u0019\u0010\tR\u001a\u0010\u0005\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0017\u001a\u0004\b\u001a\u0010\t"}, d2 = {"Lcom/paypal/oslo/feature/xoom/domain/model/UserValidationResult$ForbiddenUser;", "Lcom/paypal/oslo/feature/xoom/domain/model/UserValidationResult;", "", "titleRes", "descriptionRes", "primaryButtonTextRes", "<init>", "(III)V", "component1", "()I", "component2", "component3", "copy", "(III)Lcom/paypal/oslo/feature/xoom/domain/model/UserValidationResult$ForbiddenUser;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "hashCode", "", "toString", "()Ljava/lang/String;", com.visa.cbp.getEncExpo.warmup, "getTitleRes", "getDescriptionRes", "getPrimaryButtonTextRes"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class ForbiddenUser extends com.paypal.oslo.feature.xoom.domain.model.UserValidationResult {
        public static final int $stable = 0;
        private final int descriptionRes;
        private final int primaryButtonTextRes;
        private final int titleRes;

        public ForbiddenUser(int i, int i2, int i3) {
            super(null);
            this.titleRes = i;
            this.descriptionRes = i2;
            this.primaryButtonTextRes = i3;
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

        public final java.lang.String toString() {
            int i = this.titleRes;
            int i2 = this.descriptionRes;
            int i3 = this.primaryButtonTextRes;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("ForbiddenUser(titleRes=");
            sb.append(i);
            sb.append(", descriptionRes=");
            sb.append(i2);
            sb.append(", primaryButtonTextRes=");
            sb.append(i3);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            return (((java.lang.Integer.hashCode(this.titleRes) * 31) + java.lang.Integer.hashCode(this.descriptionRes)) * 31) + java.lang.Integer.hashCode(this.primaryButtonTextRes);
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.xoom.domain.model.UserValidationResult.ForbiddenUser)) {
                return false;
            }
            com.paypal.oslo.feature.xoom.domain.model.UserValidationResult.ForbiddenUser forbiddenUser = (com.paypal.oslo.feature.xoom.domain.model.UserValidationResult.ForbiddenUser) other;
            return this.titleRes == forbiddenUser.titleRes && this.descriptionRes == forbiddenUser.descriptionRes && this.primaryButtonTextRes == forbiddenUser.primaryButtonTextRes;
        }

        public final com.paypal.oslo.feature.xoom.domain.model.UserValidationResult.ForbiddenUser copy(int titleRes, int descriptionRes, int primaryButtonTextRes) {
            return new com.paypal.oslo.feature.xoom.domain.model.UserValidationResult.ForbiddenUser(titleRes, descriptionRes, primaryButtonTextRes);
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

        public static /* synthetic */ com.paypal.oslo.feature.xoom.domain.model.UserValidationResult.ForbiddenUser copy$default(com.paypal.oslo.feature.xoom.domain.model.UserValidationResult.ForbiddenUser forbiddenUser, int i, int i2, int i3, int i4, java.lang.Object obj) {
            if ((i4 & 1) != 0) {
                i = forbiddenUser.titleRes;
            }
            if ((i4 & 2) != 0) {
                i2 = forbiddenUser.descriptionRes;
            }
            if ((i4 & 4) != 0) {
                i3 = forbiddenUser.primaryButtonTextRes;
            }
            return forbiddenUser.copy(i, i2, i3);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001a\u0010\u0007\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004HÖ\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000e"}, d2 = {"Lcom/paypal/oslo/feature/xoom/domain/model/UserValidationResult$NetworkError;", "Lcom/paypal/oslo/feature/xoom/domain/model/UserValidationResult;", "<init>", "()V", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class NetworkError extends com.paypal.oslo.feature.xoom.domain.model.UserValidationResult {
        public static final int $stable = 0;
        public static final com.paypal.oslo.feature.xoom.domain.model.UserValidationResult.NetworkError INSTANCE = new com.paypal.oslo.feature.xoom.domain.model.UserValidationResult.NetworkError();

        public final int hashCode() {
            return -929661216;
        }

        private NetworkError() {
            super(null);
        }

        public final java.lang.String toString() {
            return "NetworkError";
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.xoom.domain.model.UserValidationResult.NetworkError)) {
                return false;
            }
            return true;
        }
    }

    public /* synthetic */ UserValidationResult(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }
}
