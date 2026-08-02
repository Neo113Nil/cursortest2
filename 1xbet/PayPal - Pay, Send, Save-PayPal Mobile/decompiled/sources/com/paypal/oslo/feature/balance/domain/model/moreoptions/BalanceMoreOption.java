package com.paypal.oslo.feature.balance.domain.model.moreoptions;

@kotlin.Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u001a\b\u0086\b\u0018\u00002\u00020\u0001B-\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0004\u0012\b\b\u0002\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\u000b\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\r\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\r\u0010\u000eJ\u0012\u0010\u000f\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0011\u001a\u00020\u0007HÆ\u0003¢\u0006\u0004\b\u0011\u0010\u0012J:\u0010\u0013\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00042\b\b\u0002\u0010\b\u001a\u00020\u0007HÆ\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u001a\u0010\u0016\u001a\u00020\u00072\b\u0010\u0015\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0016\u0010\u0017J\u0010\u0010\u0018\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0018\u0010\u000eJ\u0010\u0010\u0019\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0019\u0010\fR\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u001a\u001a\u0004\b\u001b\u0010\fR\u001a\u0010\u0005\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u001c\u001a\u0004\b\u001d\u0010\u000eR\u001c\u0010\u0006\u001a\u0004\u0018\u00010\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u001e\u001a\u0004\b\u001f\u0010\u0010R\u001a\u0010\b\u001a\u00020\u00078\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\b\u0010 \u001a\u0004\b!\u0010\u0012"}, d2 = {"Lcom/paypal/oslo/feature/balance/domain/model/moreoptions/BalanceMoreOption;", "", "", "id", "", "titleResId", "descriptionResId", "", "enabled", "<init>", "(Ljava/lang/String;ILjava/lang/Integer;Z)V", "component1", "()Ljava/lang/String;", "component2", "()I", "component3", "()Ljava/lang/Integer;", "component4", "()Z", "copy", "(Ljava/lang/String;ILjava/lang/Integer;Z)Lcom/paypal/oslo/feature/balance/domain/model/moreoptions/BalanceMoreOption;", "other", "equals", "(Ljava/lang/Object;)Z", "hashCode", "toString", "Ljava/lang/String;", "getId", com.visa.cbp.getEncExpo.warmup, "getTitleResId", "Ljava/lang/Integer;", "getDescriptionResId", "Z", "getEnabled"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes11.dex */
public final /* data */ class BalanceMoreOption {
    public static final int $stable = 0;
    private final java.lang.Integer descriptionResId;
    private final boolean enabled;
    private final java.lang.String id;
    private final int titleResId;

    public BalanceMoreOption(java.lang.String str, int i, java.lang.Integer num, boolean z) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
        this.id = str;
        this.titleResId = i;
        this.descriptionResId = num;
        this.enabled = z;
    }

    public /* synthetic */ BalanceMoreOption(java.lang.String str, int i, java.lang.Integer num, boolean z, int i2, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this(str, i, (i2 & 4) != 0 ? null : num, (i2 & 8) != 0 ? true : z);
    }

    public final java.lang.String getId() {
        return this.id;
    }

    public final int getTitleResId() {
        return this.titleResId;
    }

    public final java.lang.Integer getDescriptionResId() {
        return this.descriptionResId;
    }

    public final boolean getEnabled() {
        return this.enabled;
    }

    public final java.lang.String toString() {
        java.lang.String str = this.id;
        int i = this.titleResId;
        java.lang.Integer num = this.descriptionResId;
        boolean z = this.enabled;
        java.lang.StringBuilder sb = new java.lang.StringBuilder("BalanceMoreOption(id=");
        sb.append(str);
        sb.append(", titleResId=");
        sb.append(i);
        sb.append(", descriptionResId=");
        sb.append(num);
        sb.append(", enabled=");
        sb.append(z);
        sb.append(")");
        return sb.toString();
    }

    public final int hashCode() {
        int hashCode = this.id.hashCode();
        int hashCode2 = java.lang.Integer.hashCode(this.titleResId);
        java.lang.Integer num = this.descriptionResId;
        return (((((hashCode * 31) + hashCode2) * 31) + (num == null ? 0 : num.hashCode())) * 31) + java.lang.Boolean.hashCode(this.enabled);
    }

    public final boolean equals(java.lang.Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof com.paypal.oslo.feature.balance.domain.model.moreoptions.BalanceMoreOption)) {
            return false;
        }
        com.paypal.oslo.feature.balance.domain.model.moreoptions.BalanceMoreOption balanceMoreOption = (com.paypal.oslo.feature.balance.domain.model.moreoptions.BalanceMoreOption) other;
        return kotlin.jvm.internal.Intrinsics.areEqual(this.id, balanceMoreOption.id) && this.titleResId == balanceMoreOption.titleResId && kotlin.jvm.internal.Intrinsics.areEqual(this.descriptionResId, balanceMoreOption.descriptionResId) && this.enabled == balanceMoreOption.enabled;
    }

    public final com.paypal.oslo.feature.balance.domain.model.moreoptions.BalanceMoreOption copy(java.lang.String id, int titleResId, java.lang.Integer descriptionResId, boolean enabled) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(id, "");
        return new com.paypal.oslo.feature.balance.domain.model.moreoptions.BalanceMoreOption(id, titleResId, descriptionResId, enabled);
    }

    /* renamed from: component4, reason: from getter */
    public final boolean getEnabled() {
        return this.enabled;
    }

    /* renamed from: component3, reason: from getter */
    public final java.lang.Integer getDescriptionResId() {
        return this.descriptionResId;
    }

    /* renamed from: component2, reason: from getter */
    public final int getTitleResId() {
        return this.titleResId;
    }

    /* renamed from: component1, reason: from getter */
    public final java.lang.String getId() {
        return this.id;
    }

    public static /* synthetic */ com.paypal.oslo.feature.balance.domain.model.moreoptions.BalanceMoreOption copy$default(com.paypal.oslo.feature.balance.domain.model.moreoptions.BalanceMoreOption balanceMoreOption, java.lang.String str, int i, java.lang.Integer num, boolean z, int i2, java.lang.Object obj) {
        if ((i2 & 1) != 0) {
            str = balanceMoreOption.id;
        }
        if ((i2 & 2) != 0) {
            i = balanceMoreOption.titleResId;
        }
        if ((i2 & 4) != 0) {
            num = balanceMoreOption.descriptionResId;
        }
        if ((i2 & 8) != 0) {
            z = balanceMoreOption.enabled;
        }
        return balanceMoreOption.copy(str, i, num, z);
    }
}
