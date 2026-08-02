package com.paypal.oslo.feature.moneymovement.api.shared.backend;

@kotlin.Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\t\b\u0086\b\u0018\u00002\u00020\u0001B=\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\u0010\b\u0002\u0010\t\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u0007¢\u0006\u0004\b\n\u0010\u000bJ\u0012\u0010\f\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\f\u0010\rJ\u0012\u0010\u000e\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u000e\u0010\rJ\u0012\u0010\u000f\u001a\u0004\u0018\u00010\u0005HÆ\u0003¢\u0006\u0004\b\u000f\u0010\u0010J\u0018\u0010\u0011\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u0007HÆ\u0003¢\u0006\u0004\b\u0011\u0010\u0012JF\u0010\u0013\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00052\u0010\b\u0002\u0010\t\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u0007HÆ\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u001a\u0010\u0017\u001a\u00020\u00162\b\u0010\u0015\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0017\u0010\u0018J\u0010\u0010\u0019\u001a\u00020\u0005HÖ\u0001¢\u0006\u0004\b\u0019\u0010\u001aJ\u0010\u0010\u001c\u001a\u00020\u001bHÖ\u0001¢\u0006\u0004\b\u001c\u0010\u001dR\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u001e\u001a\u0004\b\u001f\u0010\rR\u001c\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u001e\u001a\u0004\b \u0010\rR\u001c\u0010\u0006\u001a\u0004\u0018\u00010\u00058\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010!\u001a\u0004\b\"\u0010\u0010R\"\u0010\t\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u00078\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\t\u0010#\u001a\u0004\b$\u0010\u0012"}, d2 = {"Lcom/paypal/oslo/feature/moneymovement/api/shared/backend/ValidationRulesNode;", "", "Ljava/math/BigDecimal;", "minAmount", "maxAmount", "", "allowedDecimals", "", "Lcom/paypal/oslo/feature/moneymovement/api/shared/backend/CustomValidationRule;", "customRules", "<init>", "(Ljava/math/BigDecimal;Ljava/math/BigDecimal;Ljava/lang/Integer;Ljava/util/List;)V", "component1", "()Ljava/math/BigDecimal;", "component2", "component3", "()Ljava/lang/Integer;", "component4", "()Ljava/util/List;", "copy", "(Ljava/math/BigDecimal;Ljava/math/BigDecimal;Ljava/lang/Integer;Ljava/util/List;)Lcom/paypal/oslo/feature/moneymovement/api/shared/backend/ValidationRulesNode;", "other", "", "equals", "(Ljava/lang/Object;)Z", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "Ljava/math/BigDecimal;", "getMinAmount", "getMaxAmount", "Ljava/lang/Integer;", "getAllowedDecimals", "Ljava/util/List;", "getCustomRules"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes13.dex */
public final /* data */ class ValidationRulesNode {
    public static final int $stable = 8;
    private final java.lang.Integer allowedDecimals;
    private final java.util.List<com.paypal.oslo.feature.moneymovement.api.shared.backend.CustomValidationRule> customRules;
    private final java.math.BigDecimal maxAmount;
    private final java.math.BigDecimal minAmount;

    public ValidationRulesNode(java.math.BigDecimal bigDecimal, java.math.BigDecimal bigDecimal2, java.lang.Integer num, java.util.List<com.paypal.oslo.feature.moneymovement.api.shared.backend.CustomValidationRule> list) {
        this.minAmount = bigDecimal;
        this.maxAmount = bigDecimal2;
        this.allowedDecimals = num;
        this.customRules = list;
    }

    public /* synthetic */ ValidationRulesNode(java.math.BigDecimal bigDecimal, java.math.BigDecimal bigDecimal2, java.lang.Integer num, java.util.List list, int i, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : bigDecimal, (i & 2) != 0 ? null : bigDecimal2, (i & 4) != 0 ? null : num, (i & 8) != 0 ? null : list);
    }

    public final java.math.BigDecimal getMinAmount() {
        return this.minAmount;
    }

    public final java.math.BigDecimal getMaxAmount() {
        return this.maxAmount;
    }

    public final java.lang.Integer getAllowedDecimals() {
        return this.allowedDecimals;
    }

    public final java.util.List<com.paypal.oslo.feature.moneymovement.api.shared.backend.CustomValidationRule> getCustomRules() {
        return this.customRules;
    }

    public final java.lang.String toString() {
        java.math.BigDecimal bigDecimal = this.minAmount;
        java.math.BigDecimal bigDecimal2 = this.maxAmount;
        java.lang.Integer num = this.allowedDecimals;
        java.util.List<com.paypal.oslo.feature.moneymovement.api.shared.backend.CustomValidationRule> list = this.customRules;
        java.lang.StringBuilder sb = new java.lang.StringBuilder("ValidationRulesNode(minAmount=");
        sb.append(bigDecimal);
        sb.append(", maxAmount=");
        sb.append(bigDecimal2);
        sb.append(", allowedDecimals=");
        sb.append(num);
        sb.append(", customRules=");
        sb.append(list);
        sb.append(")");
        return sb.toString();
    }

    public final int hashCode() {
        java.math.BigDecimal bigDecimal = this.minAmount;
        int hashCode = bigDecimal == null ? 0 : bigDecimal.hashCode();
        java.math.BigDecimal bigDecimal2 = this.maxAmount;
        int hashCode2 = bigDecimal2 == null ? 0 : bigDecimal2.hashCode();
        java.lang.Integer num = this.allowedDecimals;
        int hashCode3 = num == null ? 0 : num.hashCode();
        java.util.List<com.paypal.oslo.feature.moneymovement.api.shared.backend.CustomValidationRule> list = this.customRules;
        return (((((hashCode * 31) + hashCode2) * 31) + hashCode3) * 31) + (list != null ? list.hashCode() : 0);
    }

    public final boolean equals(java.lang.Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof com.paypal.oslo.feature.moneymovement.api.shared.backend.ValidationRulesNode)) {
            return false;
        }
        com.paypal.oslo.feature.moneymovement.api.shared.backend.ValidationRulesNode validationRulesNode = (com.paypal.oslo.feature.moneymovement.api.shared.backend.ValidationRulesNode) other;
        return kotlin.jvm.internal.Intrinsics.areEqual(this.minAmount, validationRulesNode.minAmount) && kotlin.jvm.internal.Intrinsics.areEqual(this.maxAmount, validationRulesNode.maxAmount) && kotlin.jvm.internal.Intrinsics.areEqual(this.allowedDecimals, validationRulesNode.allowedDecimals) && kotlin.jvm.internal.Intrinsics.areEqual(this.customRules, validationRulesNode.customRules);
    }

    public final com.paypal.oslo.feature.moneymovement.api.shared.backend.ValidationRulesNode copy(java.math.BigDecimal minAmount, java.math.BigDecimal maxAmount, java.lang.Integer allowedDecimals, java.util.List<com.paypal.oslo.feature.moneymovement.api.shared.backend.CustomValidationRule> customRules) {
        return new com.paypal.oslo.feature.moneymovement.api.shared.backend.ValidationRulesNode(minAmount, maxAmount, allowedDecimals, customRules);
    }

    public final java.util.List<com.paypal.oslo.feature.moneymovement.api.shared.backend.CustomValidationRule> component4() {
        return this.customRules;
    }

    /* renamed from: component3, reason: from getter */
    public final java.lang.Integer getAllowedDecimals() {
        return this.allowedDecimals;
    }

    /* renamed from: component2, reason: from getter */
    public final java.math.BigDecimal getMaxAmount() {
        return this.maxAmount;
    }

    /* renamed from: component1, reason: from getter */
    public final java.math.BigDecimal getMinAmount() {
        return this.minAmount;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ com.paypal.oslo.feature.moneymovement.api.shared.backend.ValidationRulesNode copy$default(com.paypal.oslo.feature.moneymovement.api.shared.backend.ValidationRulesNode validationRulesNode, java.math.BigDecimal bigDecimal, java.math.BigDecimal bigDecimal2, java.lang.Integer num, java.util.List list, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            bigDecimal = validationRulesNode.minAmount;
        }
        if ((i & 2) != 0) {
            bigDecimal2 = validationRulesNode.maxAmount;
        }
        if ((i & 4) != 0) {
            num = validationRulesNode.allowedDecimals;
        }
        if ((i & 8) != 0) {
            list = validationRulesNode.customRules;
        }
        return validationRulesNode.copy(bigDecimal, bigDecimal2, num, list);
    }

    public ValidationRulesNode() {
        this(null, null, null, null, 15, null);
    }
}
