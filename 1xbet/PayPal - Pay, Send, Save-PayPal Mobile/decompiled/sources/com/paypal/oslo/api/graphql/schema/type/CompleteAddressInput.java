package com.paypal.oslo.api.graphql.schema.type;

@kotlin.Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u000b\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0007\b\u0086\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0001¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\u0007\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\t\u001a\u00020\u0001HÆ\u0003¢\u0006\u0004\b\t\u0010\nJ$\u0010\u000b\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u0001HÆ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0012\u001a\u00020\u0011HÖ\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\u0010\u0010\u0014\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0014\u0010\bR\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0015\u001a\u0004\b\u0016\u0010\bR\u001a\u0010\u0004\u001a\u00020\u00018\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u0017\u001a\u0004\b\u0018\u0010\n"}, d2 = {"Lcom/paypal/oslo/api/graphql/schema/type/CompleteAddressInput;", "", "", "address", "countryCode", "<init>", "(Ljava/lang/String;Ljava/lang/Object;)V", "component1", "()Ljava/lang/String;", "component2", "()Ljava/lang/Object;", "copy", "(Ljava/lang/String;Ljava/lang/Object;)Lcom/paypal/oslo/api/graphql/schema/type/CompleteAddressInput;", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "Ljava/lang/String;", "getAddress", "Ljava/lang/Object;", "getCountryCode"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes4.dex */
public final /* data */ class CompleteAddressInput {
    private final java.lang.String address;
    private final java.lang.Object countryCode;

    public CompleteAddressInput(java.lang.String str, java.lang.Object obj) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(obj, "");
        this.address = str;
        this.countryCode = obj;
    }

    public final java.lang.String getAddress() {
        return this.address;
    }

    public final java.lang.Object getCountryCode() {
        return this.countryCode;
    }

    public final java.lang.String toString() {
        java.lang.String str = this.address;
        java.lang.Object obj = this.countryCode;
        java.lang.StringBuilder sb = new java.lang.StringBuilder("CompleteAddressInput(address=");
        sb.append(str);
        sb.append(", countryCode=");
        sb.append(obj);
        sb.append(")");
        return sb.toString();
    }

    public final int hashCode() {
        return (this.address.hashCode() * 31) + this.countryCode.hashCode();
    }

    public final boolean equals(java.lang.Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof com.paypal.oslo.api.graphql.schema.type.CompleteAddressInput)) {
            return false;
        }
        com.paypal.oslo.api.graphql.schema.type.CompleteAddressInput completeAddressInput = (com.paypal.oslo.api.graphql.schema.type.CompleteAddressInput) other;
        return kotlin.jvm.internal.Intrinsics.areEqual(this.address, completeAddressInput.address) && kotlin.jvm.internal.Intrinsics.areEqual(this.countryCode, completeAddressInput.countryCode);
    }

    public final com.paypal.oslo.api.graphql.schema.type.CompleteAddressInput copy(java.lang.String address, java.lang.Object countryCode) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(address, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(countryCode, "");
        return new com.paypal.oslo.api.graphql.schema.type.CompleteAddressInput(address, countryCode);
    }

    /* renamed from: component2, reason: from getter */
    public final java.lang.Object getCountryCode() {
        return this.countryCode;
    }

    /* renamed from: component1, reason: from getter */
    public final java.lang.String getAddress() {
        return this.address;
    }

    public static /* synthetic */ com.paypal.oslo.api.graphql.schema.type.CompleteAddressInput copy$default(com.paypal.oslo.api.graphql.schema.type.CompleteAddressInput completeAddressInput, java.lang.String str, java.lang.Object obj, int i, java.lang.Object obj2) {
        if ((i & 1) != 0) {
            str = completeAddressInput.address;
        }
        if ((i & 2) != 0) {
            obj = completeAddressInput.countryCode;
        }
        return completeAddressInput.copy(str, obj);
    }
}
