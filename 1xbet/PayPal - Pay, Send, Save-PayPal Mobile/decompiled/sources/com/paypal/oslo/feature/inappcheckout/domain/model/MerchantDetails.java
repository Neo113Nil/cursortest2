package com.paypal.oslo.feature.inappcheckout.domain.model;

@kotlin.Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\f\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0007\b\u0086\b\u0018\u00002\u00020\u0001B%\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\b\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\n\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\n\u0010\tJ\u0012\u0010\u000b\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u000b\u0010\tJ0\u0010\f\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0002HÆ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0010\u001a\u00020\u000f2\b\u0010\u000e\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0013\u001a\u00020\u0012HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0015\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0015\u0010\tR\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0016\u001a\u0004\b\u0017\u0010\tR\u001a\u0010\u0004\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u0016\u001a\u0004\b\u0018\u0010\tR\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0016\u001a\u0004\b\u0019\u0010\t"}, d2 = {"Lcom/paypal/oslo/feature/inappcheckout/domain/model/MerchantDetails;", "", "", "name", "id", "logo", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "component1", "()Ljava/lang/String;", "component2", "component3", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lcom/paypal/oslo/feature/inappcheckout/domain/model/MerchantDetails;", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "Ljava/lang/String;", "getName", "getId", "getLogo"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes5.dex */
public final /* data */ class MerchantDetails {
    public static final int $stable = 0;
    private final java.lang.String id;
    private final java.lang.String logo;
    private final java.lang.String name;

    public MerchantDetails(java.lang.String str, java.lang.String str2, java.lang.String str3) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str2, "");
        this.name = str;
        this.id = str2;
        this.logo = str3;
    }

    public /* synthetic */ MerchantDetails(java.lang.String str, java.lang.String str2, java.lang.String str3, int i, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this(str, (i & 2) != 0 ? str : str2, (i & 4) != 0 ? null : str3);
    }

    public final java.lang.String getName() {
        return this.name;
    }

    public final java.lang.String getId() {
        return this.id;
    }

    public final java.lang.String getLogo() {
        return this.logo;
    }

    public final java.lang.String toString() {
        java.lang.String str = this.name;
        java.lang.String str2 = this.id;
        java.lang.String str3 = this.logo;
        java.lang.StringBuilder sb = new java.lang.StringBuilder("MerchantDetails(name=");
        sb.append(str);
        sb.append(", id=");
        sb.append(str2);
        sb.append(", logo=");
        sb.append(str3);
        sb.append(")");
        return sb.toString();
    }

    public final int hashCode() {
        int hashCode = this.name.hashCode();
        int hashCode2 = this.id.hashCode();
        java.lang.String str = this.logo;
        return (((hashCode * 31) + hashCode2) * 31) + (str == null ? 0 : str.hashCode());
    }

    public final boolean equals(java.lang.Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof com.paypal.oslo.feature.inappcheckout.domain.model.MerchantDetails)) {
            return false;
        }
        com.paypal.oslo.feature.inappcheckout.domain.model.MerchantDetails merchantDetails = (com.paypal.oslo.feature.inappcheckout.domain.model.MerchantDetails) other;
        return kotlin.jvm.internal.Intrinsics.areEqual(this.name, merchantDetails.name) && kotlin.jvm.internal.Intrinsics.areEqual(this.id, merchantDetails.id) && kotlin.jvm.internal.Intrinsics.areEqual(this.logo, merchantDetails.logo);
    }

    public final com.paypal.oslo.feature.inappcheckout.domain.model.MerchantDetails copy(java.lang.String name2, java.lang.String id, java.lang.String logo) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(name2, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(id, "");
        return new com.paypal.oslo.feature.inappcheckout.domain.model.MerchantDetails(name2, id, logo);
    }

    /* renamed from: component3, reason: from getter */
    public final java.lang.String getLogo() {
        return this.logo;
    }

    /* renamed from: component2, reason: from getter */
    public final java.lang.String getId() {
        return this.id;
    }

    /* renamed from: component1, reason: from getter */
    public final java.lang.String getName() {
        return this.name;
    }

    public static /* synthetic */ com.paypal.oslo.feature.inappcheckout.domain.model.MerchantDetails copy$default(com.paypal.oslo.feature.inappcheckout.domain.model.MerchantDetails merchantDetails, java.lang.String str, java.lang.String str2, java.lang.String str3, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            str = merchantDetails.name;
        }
        if ((i & 2) != 0) {
            str2 = merchantDetails.id;
        }
        if ((i & 4) != 0) {
            str3 = merchantDetails.logo;
        }
        return merchantDetails.copy(str, str2, str3);
    }
}
