package com.paypal.oslo.feature.businesshome.api.domain.model;

@kotlin.Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0086\b\u0018\u00002\u00020\u0001B#\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0004\b\u0006\u0010\u0007J\u0016\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002HÆ\u0003¢\u0006\u0004\b\b\u0010\tJ\u0016\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002HÆ\u0003¢\u0006\u0004\b\n\u0010\tJ0\u0010\u000b\u001a\u00020\u00002\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022\u000e\b\u0002\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002HÆ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0012\u001a\u00020\u0011HÖ\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\u0010\u0010\u0015\u001a\u00020\u0014HÖ\u0001¢\u0006\u0004\b\u0015\u0010\u0016R\u001d\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0007¢\u0006\f\n\u0004\b\u0004\u0010\u0017\u001a\u0004\b\u0018\u0010\tR \u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0017\u001a\u0004\b\u0019\u0010\t"}, d2 = {"Lcom/paypal/oslo/feature/businesshome/api/domain/model/AccountSetupStatus;", "", "", "Lcom/paypal/oslo/feature/businesshome/api/domain/model/AccountSetupStep;", "setupSteps", "recommendedSteps", "<init>", "(Ljava/util/List;Ljava/util/List;)V", "component1", "()Ljava/util/List;", "component2", "copy", "(Ljava/util/List;Ljava/util/List;)Lcom/paypal/oslo/feature/businesshome/api/domain/model/AccountSetupStatus;", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "Ljava/util/List;", "getSetupSteps", "getRecommendedSteps"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes11.dex */
public final /* data */ class AccountSetupStatus {
    public static final int $stable = 8;
    private final java.util.List<com.paypal.oslo.feature.businesshome.api.domain.model.AccountSetupStep> recommendedSteps;
    private final java.util.List<com.paypal.oslo.feature.businesshome.api.domain.model.AccountSetupStep> setupSteps;

    public AccountSetupStatus(java.util.List<com.paypal.oslo.feature.businesshome.api.domain.model.AccountSetupStep> list, java.util.List<com.paypal.oslo.feature.businesshome.api.domain.model.AccountSetupStep> list2) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(list, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(list2, "");
        this.setupSteps = list;
        this.recommendedSteps = list2;
    }

    public final java.util.List<com.paypal.oslo.feature.businesshome.api.domain.model.AccountSetupStep> getSetupSteps() {
        return this.setupSteps;
    }

    public final java.util.List<com.paypal.oslo.feature.businesshome.api.domain.model.AccountSetupStep> getRecommendedSteps() {
        return this.recommendedSteps;
    }

    public final java.lang.String toString() {
        java.util.List<com.paypal.oslo.feature.businesshome.api.domain.model.AccountSetupStep> list = this.setupSteps;
        java.util.List<com.paypal.oslo.feature.businesshome.api.domain.model.AccountSetupStep> list2 = this.recommendedSteps;
        java.lang.StringBuilder sb = new java.lang.StringBuilder("AccountSetupStatus(setupSteps=");
        sb.append(list);
        sb.append(", recommendedSteps=");
        sb.append(list2);
        sb.append(")");
        return sb.toString();
    }

    public final int hashCode() {
        return (this.setupSteps.hashCode() * 31) + this.recommendedSteps.hashCode();
    }

    public final boolean equals(java.lang.Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof com.paypal.oslo.feature.businesshome.api.domain.model.AccountSetupStatus)) {
            return false;
        }
        com.paypal.oslo.feature.businesshome.api.domain.model.AccountSetupStatus accountSetupStatus = (com.paypal.oslo.feature.businesshome.api.domain.model.AccountSetupStatus) other;
        return kotlin.jvm.internal.Intrinsics.areEqual(this.setupSteps, accountSetupStatus.setupSteps) && kotlin.jvm.internal.Intrinsics.areEqual(this.recommendedSteps, accountSetupStatus.recommendedSteps);
    }

    public final com.paypal.oslo.feature.businesshome.api.domain.model.AccountSetupStatus copy(java.util.List<com.paypal.oslo.feature.businesshome.api.domain.model.AccountSetupStep> setupSteps, java.util.List<com.paypal.oslo.feature.businesshome.api.domain.model.AccountSetupStep> recommendedSteps) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(setupSteps, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(recommendedSteps, "");
        return new com.paypal.oslo.feature.businesshome.api.domain.model.AccountSetupStatus(setupSteps, recommendedSteps);
    }

    public final java.util.List<com.paypal.oslo.feature.businesshome.api.domain.model.AccountSetupStep> component2() {
        return this.recommendedSteps;
    }

    public final java.util.List<com.paypal.oslo.feature.businesshome.api.domain.model.AccountSetupStep> component1() {
        return this.setupSteps;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ com.paypal.oslo.feature.businesshome.api.domain.model.AccountSetupStatus copy$default(com.paypal.oslo.feature.businesshome.api.domain.model.AccountSetupStatus accountSetupStatus, java.util.List list, java.util.List list2, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            list = accountSetupStatus.setupSteps;
        }
        if ((i & 2) != 0) {
            list2 = accountSetupStatus.recommendedSteps;
        }
        return accountSetupStatus.copy(list, list2);
    }
}
