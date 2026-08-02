package com.paypal.oslo.feature.settings.closeaccount.domain.model;

@kotlin.Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0007\b\u0086\b\u0018\u00002\u00020\u0001B!\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0010\b\u0002\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0004¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\t\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\t\u0010\nJ\u0018\u0010\u000b\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b\u000b\u0010\fJ,\u0010\r\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\u0010\b\u0002\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0004HÆ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u001a\u0010\u0011\u001a\u00020\u00102\b\u0010\u000f\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0014\u001a\u00020\u0013HÖ\u0001¢\u0006\u0004\b\u0014\u0010\u0015J\u0010\u0010\u0016\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0016\u0010\nR\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0017\u001a\u0004\b\u0018\u0010\nR\"\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u0019\u001a\u0004\b\u001a\u0010\f"}, d2 = {"Lcom/paypal/oslo/feature/settings/closeaccount/domain/model/CloseAccountEligibilityResult;", "", "", com.paypal.oslo.feature.cryptocurrency.ui.receive.CryptoReceiveViewModel.LOG_KEY_DECISION_CODE, "", "Lcom/paypal/oslo/feature/settings/closeaccount/domain/model/IneligibilityReason;", "ineligibilityReasons", "<init>", "(Ljava/lang/String;Ljava/util/List;)V", "component1", "()Ljava/lang/String;", "component2", "()Ljava/util/List;", "copy", "(Ljava/lang/String;Ljava/util/List;)Lcom/paypal/oslo/feature/settings/closeaccount/domain/model/CloseAccountEligibilityResult;", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "Ljava/lang/String;", "getDecisionCode", "Ljava/util/List;", "getIneligibilityReasons"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes14.dex */
public final /* data */ class CloseAccountEligibilityResult {
    public static final int $stable = 8;
    private final java.lang.String decisionCode;
    private final java.util.List<com.paypal.oslo.feature.settings.closeaccount.domain.model.IneligibilityReason> ineligibilityReasons;

    public CloseAccountEligibilityResult(java.lang.String str, java.util.List<com.paypal.oslo.feature.settings.closeaccount.domain.model.IneligibilityReason> list) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
        this.decisionCode = str;
        this.ineligibilityReasons = list;
    }

    public /* synthetic */ CloseAccountEligibilityResult(java.lang.String str, java.util.List list, int i, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this(str, (i & 2) != 0 ? null : list);
    }

    public final java.lang.String getDecisionCode() {
        return this.decisionCode;
    }

    public final java.util.List<com.paypal.oslo.feature.settings.closeaccount.domain.model.IneligibilityReason> getIneligibilityReasons() {
        return this.ineligibilityReasons;
    }

    public final java.lang.String toString() {
        java.lang.String str = this.decisionCode;
        java.util.List<com.paypal.oslo.feature.settings.closeaccount.domain.model.IneligibilityReason> list = this.ineligibilityReasons;
        java.lang.StringBuilder sb = new java.lang.StringBuilder("CloseAccountEligibilityResult(decisionCode=");
        sb.append(str);
        sb.append(", ineligibilityReasons=");
        sb.append(list);
        sb.append(")");
        return sb.toString();
    }

    public final int hashCode() {
        int hashCode = this.decisionCode.hashCode();
        java.util.List<com.paypal.oslo.feature.settings.closeaccount.domain.model.IneligibilityReason> list = this.ineligibilityReasons;
        return (hashCode * 31) + (list == null ? 0 : list.hashCode());
    }

    public final boolean equals(java.lang.Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof com.paypal.oslo.feature.settings.closeaccount.domain.model.CloseAccountEligibilityResult)) {
            return false;
        }
        com.paypal.oslo.feature.settings.closeaccount.domain.model.CloseAccountEligibilityResult closeAccountEligibilityResult = (com.paypal.oslo.feature.settings.closeaccount.domain.model.CloseAccountEligibilityResult) other;
        return kotlin.jvm.internal.Intrinsics.areEqual(this.decisionCode, closeAccountEligibilityResult.decisionCode) && kotlin.jvm.internal.Intrinsics.areEqual(this.ineligibilityReasons, closeAccountEligibilityResult.ineligibilityReasons);
    }

    public final com.paypal.oslo.feature.settings.closeaccount.domain.model.CloseAccountEligibilityResult copy(java.lang.String decisionCode, java.util.List<com.paypal.oslo.feature.settings.closeaccount.domain.model.IneligibilityReason> ineligibilityReasons) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(decisionCode, "");
        return new com.paypal.oslo.feature.settings.closeaccount.domain.model.CloseAccountEligibilityResult(decisionCode, ineligibilityReasons);
    }

    public final java.util.List<com.paypal.oslo.feature.settings.closeaccount.domain.model.IneligibilityReason> component2() {
        return this.ineligibilityReasons;
    }

    /* renamed from: component1, reason: from getter */
    public final java.lang.String getDecisionCode() {
        return this.decisionCode;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ com.paypal.oslo.feature.settings.closeaccount.domain.model.CloseAccountEligibilityResult copy$default(com.paypal.oslo.feature.settings.closeaccount.domain.model.CloseAccountEligibilityResult closeAccountEligibilityResult, java.lang.String str, java.util.List list, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            str = closeAccountEligibilityResult.decisionCode;
        }
        if ((i & 2) != 0) {
            list = closeAccountEligibilityResult.ineligibilityReasons;
        }
        return closeAccountEligibilityResult.copy(str, list);
    }
}
