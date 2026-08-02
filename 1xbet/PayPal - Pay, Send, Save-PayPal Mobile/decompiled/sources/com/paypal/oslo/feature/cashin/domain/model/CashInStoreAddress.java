package com.paypal.oslo.feature.cashin.domain.model;

@kotlin.Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u000e\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\b\b\u0086\b\u0018\u00002\u00020\u0001B'\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0002¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\t\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\u000b\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u000b\u0010\nJ\u0010\u0010\f\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\f\u0010\nJ\u0010\u0010\r\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\r\u0010\nJ8\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00022\b\b\u0002\u0010\u0006\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u001a\u0010\u0012\u001a\u00020\u00112\b\u0010\u0010\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0012\u0010\u0013J\u0010\u0010\u0015\u001a\u00020\u0014HÖ\u0001¢\u0006\u0004\b\u0015\u0010\u0016J\u0010\u0010\u0017\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0017\u0010\nR\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0018\u001a\u0004\b\u0019\u0010\nR\u001a\u0010\u0004\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u0018\u001a\u0004\b\u001a\u0010\nR\u001a\u0010\u0005\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0018\u001a\u0004\b\u001b\u0010\nR\u001a\u0010\u0006\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u0018\u001a\u0004\b\u001c\u0010\n"}, d2 = {"Lcom/paypal/oslo/feature/cashin/domain/model/CashInStoreAddress;", "", "", "line1", com.paypal.oslo.feature.oneonboarding.inventory.steps.personalinfo.analytics.PersonalInfoAnalytics.ModuleCity, "state", androidx.autofill.HintConstants.AUTOFILL_HINT_POSTAL_CODE, "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "component1", "()Ljava/lang/String;", "component2", "component3", "component4", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lcom/paypal/oslo/feature/cashin/domain/model/CashInStoreAddress;", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "Ljava/lang/String;", "getLine1", "getCity", "getState", "getPostalCode"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes11.dex */
public final /* data */ class CashInStoreAddress {
    public static final int $stable = 0;
    private final java.lang.String city;
    private final java.lang.String line1;
    private final java.lang.String postalCode;
    private final java.lang.String state;

    public CashInStoreAddress(java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.String str4) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str2, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str3, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str4, "");
        this.line1 = str;
        this.city = str2;
        this.state = str3;
        this.postalCode = str4;
    }

    public final java.lang.String getLine1() {
        return this.line1;
    }

    public final java.lang.String getCity() {
        return this.city;
    }

    public final java.lang.String getState() {
        return this.state;
    }

    public final java.lang.String getPostalCode() {
        return this.postalCode;
    }

    public final java.lang.String toString() {
        java.lang.String str = this.line1;
        java.lang.String str2 = this.city;
        java.lang.String str3 = this.state;
        java.lang.String str4 = this.postalCode;
        java.lang.StringBuilder sb = new java.lang.StringBuilder("CashInStoreAddress(line1=");
        sb.append(str);
        sb.append(", city=");
        sb.append(str2);
        sb.append(", state=");
        sb.append(str3);
        sb.append(", postalCode=");
        sb.append(str4);
        sb.append(")");
        return sb.toString();
    }

    public final int hashCode() {
        return (((((this.line1.hashCode() * 31) + this.city.hashCode()) * 31) + this.state.hashCode()) * 31) + this.postalCode.hashCode();
    }

    public final boolean equals(java.lang.Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof com.paypal.oslo.feature.cashin.domain.model.CashInStoreAddress)) {
            return false;
        }
        com.paypal.oslo.feature.cashin.domain.model.CashInStoreAddress cashInStoreAddress = (com.paypal.oslo.feature.cashin.domain.model.CashInStoreAddress) other;
        return kotlin.jvm.internal.Intrinsics.areEqual(this.line1, cashInStoreAddress.line1) && kotlin.jvm.internal.Intrinsics.areEqual(this.city, cashInStoreAddress.city) && kotlin.jvm.internal.Intrinsics.areEqual(this.state, cashInStoreAddress.state) && kotlin.jvm.internal.Intrinsics.areEqual(this.postalCode, cashInStoreAddress.postalCode);
    }

    public final com.paypal.oslo.feature.cashin.domain.model.CashInStoreAddress copy(java.lang.String line1, java.lang.String city, java.lang.String state, java.lang.String postalCode) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(line1, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(city, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(state, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(postalCode, "");
        return new com.paypal.oslo.feature.cashin.domain.model.CashInStoreAddress(line1, city, state, postalCode);
    }

    /* renamed from: component4, reason: from getter */
    public final java.lang.String getPostalCode() {
        return this.postalCode;
    }

    /* renamed from: component3, reason: from getter */
    public final java.lang.String getState() {
        return this.state;
    }

    /* renamed from: component2, reason: from getter */
    public final java.lang.String getCity() {
        return this.city;
    }

    /* renamed from: component1, reason: from getter */
    public final java.lang.String getLine1() {
        return this.line1;
    }

    public static /* synthetic */ com.paypal.oslo.feature.cashin.domain.model.CashInStoreAddress copy$default(com.paypal.oslo.feature.cashin.domain.model.CashInStoreAddress cashInStoreAddress, java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.String str4, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            str = cashInStoreAddress.line1;
        }
        if ((i & 2) != 0) {
            str2 = cashInStoreAddress.city;
        }
        if ((i & 4) != 0) {
            str3 = cashInStoreAddress.state;
        }
        if ((i & 8) != 0) {
            str4 = cashInStoreAddress.postalCode;
        }
        return cashInStoreAddress.copy(str, str2, str3, str4);
    }
}
