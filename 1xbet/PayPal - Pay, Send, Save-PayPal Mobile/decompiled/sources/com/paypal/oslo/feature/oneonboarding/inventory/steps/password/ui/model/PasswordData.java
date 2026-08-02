package com.paypal.oslo.feature.oneonboarding.inventory.steps.password.ui.model;

@kotlin.Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0010\b\n\u0002\b\t\b\u0086\b\u0018\u00002\u00020\u0001B7\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004\u0012\u001a\b\u0002\u0010\n\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\t0\u00070\u0006¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\r\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u000f\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\u000f\u0010\u0010J\"\u0010\u0011\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\t0\u00070\u0006HÆ\u0003¢\u0006\u0004\b\u0011\u0010\u0012J@\u0010\u0013\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\u001a\b\u0002\u0010\n\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\t0\u00070\u0006HÆ\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u001a\u0010\u0016\u001a\u00020\u00042\b\u0010\u0015\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0016\u0010\u0017J\u0010\u0010\u0019\u001a\u00020\u0018HÖ\u0001¢\u0006\u0004\b\u0019\u0010\u001aJ\u0010\u0010\u001b\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u001b\u0010\u000eR\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u001c\u001a\u0004\b\u001d\u0010\u000eR\u001a\u0010\u0005\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u001e\u001a\u0004\b\u001f\u0010\u0010R,\u0010\n\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\t0\u00070\u00068\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\n\u0010 \u001a\u0004\b!\u0010\u0012"}, d2 = {"Lcom/paypal/oslo/feature/oneonboarding/inventory/steps/password/ui/model/PasswordData;", "", "", "password", "", "showPasswordHints", "", "Larrow/core/Either;", "Lcom/paypal/oslo/feature/oneonboarding/validators/domain/ValidationError;", "Lcom/paypal/oslo/feature/oneonboarding/validators/domain/ValidationSuccess;", "validationResults", "<init>", "(Ljava/lang/String;ZLjava/util/List;)V", "component1", "()Ljava/lang/String;", "component2", "()Z", "component3", "()Ljava/util/List;", "copy", "(Ljava/lang/String;ZLjava/util/List;)Lcom/paypal/oslo/feature/oneonboarding/inventory/steps/password/ui/model/PasswordData;", "other", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "Ljava/lang/String;", "getPassword", "Z", "getShowPasswordHints", "Ljava/util/List;", "getValidationResults"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes13.dex */
public final /* data */ class PasswordData {
    public static final int $stable = 0;
    private final java.lang.String password;
    private final boolean showPasswordHints;
    private final java.util.List<arrow.core.Either<com.paypal.oslo.feature.oneonboarding.validators.domain.ValidationError, com.paypal.oslo.feature.oneonboarding.validators.domain.ValidationSuccess>> validationResults;

    /* JADX WARN: Multi-variable type inference failed */
    public PasswordData(java.lang.String str, boolean z, java.util.List<? extends arrow.core.Either<com.paypal.oslo.feature.oneonboarding.validators.domain.ValidationError, com.paypal.oslo.feature.oneonboarding.validators.domain.ValidationSuccess>> list) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(list, "");
        this.password = str;
        this.showPasswordHints = z;
        this.validationResults = list;
    }

    public /* synthetic */ PasswordData(java.lang.String str, boolean z, java.util.List list, int i, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? true : z, (i & 4) != 0 ? kotlin.collections.CollectionsKt.emptyList() : list);
    }

    public final java.lang.String getPassword() {
        return this.password;
    }

    public final boolean getShowPasswordHints() {
        return this.showPasswordHints;
    }

    public final java.util.List<arrow.core.Either<com.paypal.oslo.feature.oneonboarding.validators.domain.ValidationError, com.paypal.oslo.feature.oneonboarding.validators.domain.ValidationSuccess>> getValidationResults() {
        return this.validationResults;
    }

    public final java.lang.String toString() {
        java.lang.String str = this.password;
        boolean z = this.showPasswordHints;
        java.util.List<arrow.core.Either<com.paypal.oslo.feature.oneonboarding.validators.domain.ValidationError, com.paypal.oslo.feature.oneonboarding.validators.domain.ValidationSuccess>> list = this.validationResults;
        java.lang.StringBuilder sb = new java.lang.StringBuilder("PasswordData(password=");
        sb.append(str);
        sb.append(", showPasswordHints=");
        sb.append(z);
        sb.append(", validationResults=");
        sb.append(list);
        sb.append(")");
        return sb.toString();
    }

    public final int hashCode() {
        return (((this.password.hashCode() * 31) + java.lang.Boolean.hashCode(this.showPasswordHints)) * 31) + this.validationResults.hashCode();
    }

    public final boolean equals(java.lang.Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof com.paypal.oslo.feature.oneonboarding.inventory.steps.password.ui.model.PasswordData)) {
            return false;
        }
        com.paypal.oslo.feature.oneonboarding.inventory.steps.password.ui.model.PasswordData passwordData = (com.paypal.oslo.feature.oneonboarding.inventory.steps.password.ui.model.PasswordData) other;
        return kotlin.jvm.internal.Intrinsics.areEqual(this.password, passwordData.password) && this.showPasswordHints == passwordData.showPasswordHints && kotlin.jvm.internal.Intrinsics.areEqual(this.validationResults, passwordData.validationResults);
    }

    public final com.paypal.oslo.feature.oneonboarding.inventory.steps.password.ui.model.PasswordData copy(java.lang.String password, boolean showPasswordHints, java.util.List<? extends arrow.core.Either<com.paypal.oslo.feature.oneonboarding.validators.domain.ValidationError, com.paypal.oslo.feature.oneonboarding.validators.domain.ValidationSuccess>> validationResults) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(password, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(validationResults, "");
        return new com.paypal.oslo.feature.oneonboarding.inventory.steps.password.ui.model.PasswordData(password, showPasswordHints, validationResults);
    }

    public final java.util.List<arrow.core.Either<com.paypal.oslo.feature.oneonboarding.validators.domain.ValidationError, com.paypal.oslo.feature.oneonboarding.validators.domain.ValidationSuccess>> component3() {
        return this.validationResults;
    }

    /* renamed from: component2, reason: from getter */
    public final boolean getShowPasswordHints() {
        return this.showPasswordHints;
    }

    /* renamed from: component1, reason: from getter */
    public final java.lang.String getPassword() {
        return this.password;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ com.paypal.oslo.feature.oneonboarding.inventory.steps.password.ui.model.PasswordData copy$default(com.paypal.oslo.feature.oneonboarding.inventory.steps.password.ui.model.PasswordData passwordData, java.lang.String str, boolean z, java.util.List list, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            str = passwordData.password;
        }
        if ((i & 2) != 0) {
            z = passwordData.showPasswordHints;
        }
        if ((i & 4) != 0) {
            list = passwordData.validationResults;
        }
        return passwordData.copy(str, z, list);
    }

    public PasswordData() {
        this(null, false, null, 7, null);
    }
}
