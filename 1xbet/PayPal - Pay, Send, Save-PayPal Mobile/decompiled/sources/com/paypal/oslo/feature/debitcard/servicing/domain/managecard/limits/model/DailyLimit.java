package com.paypal.oslo.feature.debitcard.servicing.domain.managecard.limits.model;

@kotlin.Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u000e\n\u0002\u0010\b\n\u0002\b\t\b\u0080\b\u0018\u00002\u00020\u0001B)\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\n\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\f\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\f\u0010\u000bJ\u0010\u0010\r\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\r\u0010\u000bJ\u0010\u0010\u000e\u001a\u00020\u0006HÆ\u0003¢\u0006\u0004\b\u000e\u0010\u000fJ8\u0010\u0010\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00022\b\b\u0002\u0010\u0007\u001a\u00020\u0006HÆ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u001a\u0010\u0013\u001a\u00020\u00062\b\u0010\u0012\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0016\u001a\u00020\u0015HÖ\u0001¢\u0006\u0004\b\u0016\u0010\u0017J\u0010\u0010\u0018\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0018\u0010\u000bR\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0019\u001a\u0004\b\u001a\u0010\u000bR\u001a\u0010\u0004\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u0019\u001a\u0004\b\u001b\u0010\u000bR\u001a\u0010\u0005\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0019\u001a\u0004\b\u001c\u0010\u000bR\u001a\u0010\u0007\u001a\u00020\u00068\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010\u001d\u001a\u0004\b\u001e\u0010\u000f"}, d2 = {"Lcom/paypal/oslo/feature/debitcard/servicing/domain/managecard/limits/model/DailyLimit;", "", "", "title", "amount", com.paypal.oslo.feature.inappcheckout.domain.util.LoggerParameterKeys.DESCRIPTION, "", "showDescription", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Z)V", "component1", "()Ljava/lang/String;", "component2", "component3", "component4", "()Z", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Z)Lcom/paypal/oslo/feature/debitcard/servicing/domain/managecard/limits/model/DailyLimit;", "other", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "Ljava/lang/String;", "getTitle", "getAmount", "getDescription", "Z", "getShowDescription"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes12.dex */
public final /* data */ class DailyLimit {
    public static final int $stable = 0;
    private final java.lang.String amount;
    private final java.lang.String description;
    private final boolean showDescription;
    private final java.lang.String title;

    public DailyLimit(java.lang.String str, java.lang.String str2, java.lang.String str3, boolean z) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str2, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str3, "");
        this.title = str;
        this.amount = str2;
        this.description = str3;
        this.showDescription = z;
    }

    public /* synthetic */ DailyLimit(java.lang.String str, java.lang.String str2, java.lang.String str3, boolean z, int i, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this(str, str2, str3, (i & 8) != 0 ? true : z);
    }

    public final java.lang.String getTitle() {
        return this.title;
    }

    public final java.lang.String getAmount() {
        return this.amount;
    }

    public final java.lang.String getDescription() {
        return this.description;
    }

    public final boolean getShowDescription() {
        return this.showDescription;
    }

    public final java.lang.String toString() {
        java.lang.String str = this.title;
        java.lang.String str2 = this.amount;
        java.lang.String str3 = this.description;
        boolean z = this.showDescription;
        java.lang.StringBuilder sb = new java.lang.StringBuilder("DailyLimit(title=");
        sb.append(str);
        sb.append(", amount=");
        sb.append(str2);
        sb.append(", description=");
        sb.append(str3);
        sb.append(", showDescription=");
        sb.append(z);
        sb.append(")");
        return sb.toString();
    }

    public final int hashCode() {
        return (((((this.title.hashCode() * 31) + this.amount.hashCode()) * 31) + this.description.hashCode()) * 31) + java.lang.Boolean.hashCode(this.showDescription);
    }

    public final boolean equals(java.lang.Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof com.paypal.oslo.feature.debitcard.servicing.domain.managecard.limits.model.DailyLimit)) {
            return false;
        }
        com.paypal.oslo.feature.debitcard.servicing.domain.managecard.limits.model.DailyLimit dailyLimit = (com.paypal.oslo.feature.debitcard.servicing.domain.managecard.limits.model.DailyLimit) other;
        return kotlin.jvm.internal.Intrinsics.areEqual(this.title, dailyLimit.title) && kotlin.jvm.internal.Intrinsics.areEqual(this.amount, dailyLimit.amount) && kotlin.jvm.internal.Intrinsics.areEqual(this.description, dailyLimit.description) && this.showDescription == dailyLimit.showDescription;
    }

    public final com.paypal.oslo.feature.debitcard.servicing.domain.managecard.limits.model.DailyLimit copy(java.lang.String title, java.lang.String amount, java.lang.String description, boolean showDescription) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(title, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(amount, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(description, "");
        return new com.paypal.oslo.feature.debitcard.servicing.domain.managecard.limits.model.DailyLimit(title, amount, description, showDescription);
    }

    /* renamed from: component4, reason: from getter */
    public final boolean getShowDescription() {
        return this.showDescription;
    }

    /* renamed from: component3, reason: from getter */
    public final java.lang.String getDescription() {
        return this.description;
    }

    /* renamed from: component2, reason: from getter */
    public final java.lang.String getAmount() {
        return this.amount;
    }

    /* renamed from: component1, reason: from getter */
    public final java.lang.String getTitle() {
        return this.title;
    }

    public static /* synthetic */ com.paypal.oslo.feature.debitcard.servicing.domain.managecard.limits.model.DailyLimit copy$default(com.paypal.oslo.feature.debitcard.servicing.domain.managecard.limits.model.DailyLimit dailyLimit, java.lang.String str, java.lang.String str2, java.lang.String str3, boolean z, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            str = dailyLimit.title;
        }
        if ((i & 2) != 0) {
            str2 = dailyLimit.amount;
        }
        if ((i & 4) != 0) {
            str3 = dailyLimit.description;
        }
        if ((i & 8) != 0) {
            z = dailyLimit.showDescription;
        }
        return dailyLimit.copy(str, str2, str3, z);
    }
}
