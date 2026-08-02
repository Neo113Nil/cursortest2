package com.paypal.oslo.feature.activity.api.widget.models;

@kotlin.Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0010\n\u0002\u0010\b\n\u0002\b\n\b\u0086\b\u0018\u00002\u00020\u0001B3\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0002\u0012\b\b\u0002\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\f\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000e\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u000e\u0010\rJ\u0010\u0010\u000f\u001a\u00020\u0005HÆ\u0003¢\u0006\u0004\b\u000f\u0010\u0010J\u0012\u0010\u0011\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0011\u0010\rJ\u0010\u0010\u0012\u001a\u00020\bHÆ\u0003¢\u0006\u0004\b\u0012\u0010\u0013JD\u0010\u0014\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00022\b\b\u0002\u0010\u0006\u001a\u00020\u00052\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00022\b\b\u0002\u0010\t\u001a\u00020\bHÆ\u0001¢\u0006\u0004\b\u0014\u0010\u0015J\u001a\u0010\u0017\u001a\u00020\b2\b\u0010\u0016\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0017\u0010\u0018J\u0010\u0010\u001a\u001a\u00020\u0019HÖ\u0001¢\u0006\u0004\b\u001a\u0010\u001bJ\u0010\u0010\u001c\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u001c\u0010\rR\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u001d\u001a\u0004\b\u001e\u0010\rR\u001a\u0010\u0004\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u001d\u001a\u0004\b\u001f\u0010\rR\u001a\u0010\u0006\u001a\u00020\u00058\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010 \u001a\u0004\b!\u0010\u0010R\u001c\u0010\u0007\u001a\u0004\u0018\u00010\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010\u001d\u001a\u0004\b\"\u0010\rR\u001a\u0010\t\u001a\u00020\b8\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\t\u0010#\u001a\u0004\b\t\u0010\u0013"}, d2 = {"Lcom/paypal/oslo/feature/activity/api/widget/models/ActivityWidgetTransformContext;", "", "", "id", "counterPartyName", "Lcom/paypal/oslo/feature/activity/api/models/ActivityMoneyMovementDirection;", "moneyMovementDirection", "amount", "", "isAnonymousContribution", "<init>", "(Ljava/lang/String;Ljava/lang/String;Lcom/paypal/oslo/feature/activity/api/models/ActivityMoneyMovementDirection;Ljava/lang/String;Z)V", "component1", "()Ljava/lang/String;", "component2", "component3", "()Lcom/paypal/oslo/feature/activity/api/models/ActivityMoneyMovementDirection;", "component4", "component5", "()Z", "copy", "(Ljava/lang/String;Ljava/lang/String;Lcom/paypal/oslo/feature/activity/api/models/ActivityMoneyMovementDirection;Ljava/lang/String;Z)Lcom/paypal/oslo/feature/activity/api/widget/models/ActivityWidgetTransformContext;", "other", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "Ljava/lang/String;", "getId", "getCounterPartyName", "Lcom/paypal/oslo/feature/activity/api/models/ActivityMoneyMovementDirection;", "getMoneyMovementDirection", "getAmount", "Z"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes10.dex */
public final /* data */ class ActivityWidgetTransformContext {
    public static final int $stable = 0;
    private final java.lang.String amount;
    private final java.lang.String counterPartyName;
    private final java.lang.String id;
    private final boolean isAnonymousContribution;
    private final com.paypal.oslo.feature.activity.api.models.ActivityMoneyMovementDirection moneyMovementDirection;

    public ActivityWidgetTransformContext(java.lang.String str, java.lang.String str2, com.paypal.oslo.feature.activity.api.models.ActivityMoneyMovementDirection activityMoneyMovementDirection, java.lang.String str3, boolean z) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str2, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(activityMoneyMovementDirection, "");
        this.id = str;
        this.counterPartyName = str2;
        this.moneyMovementDirection = activityMoneyMovementDirection;
        this.amount = str3;
        this.isAnonymousContribution = z;
    }

    public /* synthetic */ ActivityWidgetTransformContext(java.lang.String str, java.lang.String str2, com.paypal.oslo.feature.activity.api.models.ActivityMoneyMovementDirection activityMoneyMovementDirection, java.lang.String str3, boolean z, int i, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this(str, str2, activityMoneyMovementDirection, str3, (i & 16) != 0 ? false : z);
    }

    public final java.lang.String getId() {
        return this.id;
    }

    public final java.lang.String getCounterPartyName() {
        return this.counterPartyName;
    }

    public final com.paypal.oslo.feature.activity.api.models.ActivityMoneyMovementDirection getMoneyMovementDirection() {
        return this.moneyMovementDirection;
    }

    public final java.lang.String getAmount() {
        return this.amount;
    }

    public final boolean isAnonymousContribution() {
        return this.isAnonymousContribution;
    }

    public final java.lang.String toString() {
        java.lang.String str = this.id;
        java.lang.String str2 = this.counterPartyName;
        com.paypal.oslo.feature.activity.api.models.ActivityMoneyMovementDirection activityMoneyMovementDirection = this.moneyMovementDirection;
        java.lang.String str3 = this.amount;
        boolean z = this.isAnonymousContribution;
        java.lang.StringBuilder sb = new java.lang.StringBuilder("ActivityWidgetTransformContext(id=");
        sb.append(str);
        sb.append(", counterPartyName=");
        sb.append(str2);
        sb.append(", moneyMovementDirection=");
        sb.append(activityMoneyMovementDirection);
        sb.append(", amount=");
        sb.append(str3);
        sb.append(", isAnonymousContribution=");
        sb.append(z);
        sb.append(")");
        return sb.toString();
    }

    public final int hashCode() {
        int hashCode = this.id.hashCode();
        int hashCode2 = this.counterPartyName.hashCode();
        int hashCode3 = this.moneyMovementDirection.hashCode();
        java.lang.String str = this.amount;
        return (((((((hashCode * 31) + hashCode2) * 31) + hashCode3) * 31) + (str == null ? 0 : str.hashCode())) * 31) + java.lang.Boolean.hashCode(this.isAnonymousContribution);
    }

    public final boolean equals(java.lang.Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof com.paypal.oslo.feature.activity.api.widget.models.ActivityWidgetTransformContext)) {
            return false;
        }
        com.paypal.oslo.feature.activity.api.widget.models.ActivityWidgetTransformContext activityWidgetTransformContext = (com.paypal.oslo.feature.activity.api.widget.models.ActivityWidgetTransformContext) other;
        return kotlin.jvm.internal.Intrinsics.areEqual(this.id, activityWidgetTransformContext.id) && kotlin.jvm.internal.Intrinsics.areEqual(this.counterPartyName, activityWidgetTransformContext.counterPartyName) && kotlin.jvm.internal.Intrinsics.areEqual(this.moneyMovementDirection, activityWidgetTransformContext.moneyMovementDirection) && kotlin.jvm.internal.Intrinsics.areEqual(this.amount, activityWidgetTransformContext.amount) && this.isAnonymousContribution == activityWidgetTransformContext.isAnonymousContribution;
    }

    public final com.paypal.oslo.feature.activity.api.widget.models.ActivityWidgetTransformContext copy(java.lang.String id, java.lang.String counterPartyName, com.paypal.oslo.feature.activity.api.models.ActivityMoneyMovementDirection moneyMovementDirection, java.lang.String amount, boolean isAnonymousContribution) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(id, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(counterPartyName, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(moneyMovementDirection, "");
        return new com.paypal.oslo.feature.activity.api.widget.models.ActivityWidgetTransformContext(id, counterPartyName, moneyMovementDirection, amount, isAnonymousContribution);
    }

    /* renamed from: component5, reason: from getter */
    public final boolean getIsAnonymousContribution() {
        return this.isAnonymousContribution;
    }

    /* renamed from: component4, reason: from getter */
    public final java.lang.String getAmount() {
        return this.amount;
    }

    /* renamed from: component3, reason: from getter */
    public final com.paypal.oslo.feature.activity.api.models.ActivityMoneyMovementDirection getMoneyMovementDirection() {
        return this.moneyMovementDirection;
    }

    /* renamed from: component2, reason: from getter */
    public final java.lang.String getCounterPartyName() {
        return this.counterPartyName;
    }

    /* renamed from: component1, reason: from getter */
    public final java.lang.String getId() {
        return this.id;
    }

    public static /* synthetic */ com.paypal.oslo.feature.activity.api.widget.models.ActivityWidgetTransformContext copy$default(com.paypal.oslo.feature.activity.api.widget.models.ActivityWidgetTransformContext activityWidgetTransformContext, java.lang.String str, java.lang.String str2, com.paypal.oslo.feature.activity.api.models.ActivityMoneyMovementDirection activityMoneyMovementDirection, java.lang.String str3, boolean z, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            str = activityWidgetTransformContext.id;
        }
        if ((i & 2) != 0) {
            str2 = activityWidgetTransformContext.counterPartyName;
        }
        java.lang.String str4 = str2;
        if ((i & 4) != 0) {
            activityMoneyMovementDirection = activityWidgetTransformContext.moneyMovementDirection;
        }
        com.paypal.oslo.feature.activity.api.models.ActivityMoneyMovementDirection activityMoneyMovementDirection2 = activityMoneyMovementDirection;
        if ((i & 8) != 0) {
            str3 = activityWidgetTransformContext.amount;
        }
        java.lang.String str5 = str3;
        if ((i & 16) != 0) {
            z = activityWidgetTransformContext.isAnonymousContribution;
        }
        return activityWidgetTransformContext.copy(str, str4, activityMoneyMovementDirection2, str5, z);
    }
}
