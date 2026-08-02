package com.paypal.oslo.api.graphql.schema.type;

@kotlin.Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u000e\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\t\b\u0086\b\u0018\u00002\u00020\u0001BE\u0012\u0010\b\u0002\u0010\u0004\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00030\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0010\b\u0002\u0010\u0007\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00050\u0002\u0012\u0010\b\u0002\u0010\b\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00050\u0002¢\u0006\u0004\b\t\u0010\nJ\u0018\u0010\u000b\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00030\u0002HÆ\u0003¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\r\u001a\u00020\u0005HÆ\u0003¢\u0006\u0004\b\r\u0010\u000eJ\u0018\u0010\u000f\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00050\u0002HÆ\u0003¢\u0006\u0004\b\u000f\u0010\fJ\u0018\u0010\u0010\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00050\u0002HÆ\u0003¢\u0006\u0004\b\u0010\u0010\fJP\u0010\u0011\u001a\u00020\u00002\u0010\b\u0002\u0010\u0004\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00030\u00022\b\b\u0002\u0010\u0006\u001a\u00020\u00052\u0010\b\u0002\u0010\u0007\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00050\u00022\u0010\b\u0002\u0010\b\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00050\u0002HÆ\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\u001a\u0010\u0015\u001a\u00020\u00142\b\u0010\u0013\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0015\u0010\u0016J\u0010\u0010\u0018\u001a\u00020\u0017HÖ\u0001¢\u0006\u0004\b\u0018\u0010\u0019J\u0010\u0010\u001a\u001a\u00020\u0005HÖ\u0001¢\u0006\u0004\b\u001a\u0010\u000eR\u001f\u0010\u0004\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00030\u00028\u0007¢\u0006\f\n\u0004\b\u0004\u0010\u001b\u001a\u0004\b\u001c\u0010\fR\u001a\u0010\u0006\u001a\u00020\u00058\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u001d\u001a\u0004\b\u001e\u0010\u000eR\"\u0010\u0007\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00050\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010\u001b\u001a\u0004\b\u001f\u0010\fR\"\u0010\b\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00050\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\b\u0010\u001b\u001a\u0004\b \u0010\f"}, d2 = {"Lcom/paypal/oslo/api/graphql/schema/type/DeviceWalletProviderInfoInput;", "", "Lcom/apollographql/apollo/api/Optional;", "Lcom/paypal/oslo/api/graphql/schema/type/DeviceWalletTokenizationPartner;", "name", "", "enrollmentId", "productId", com.paypal.oslo.feature.debitcard.shared.constants.DebitCardLoggerConstants.PRODUCT_NAME, "<init>", "(Lcom/apollographql/apollo/api/Optional;Ljava/lang/String;Lcom/apollographql/apollo/api/Optional;Lcom/apollographql/apollo/api/Optional;)V", "component1", "()Lcom/apollographql/apollo/api/Optional;", "component2", "()Ljava/lang/String;", "component3", "component4", "copy", "(Lcom/apollographql/apollo/api/Optional;Ljava/lang/String;Lcom/apollographql/apollo/api/Optional;Lcom/apollographql/apollo/api/Optional;)Lcom/paypal/oslo/api/graphql/schema/type/DeviceWalletProviderInfoInput;", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "Lcom/apollographql/apollo/api/Optional;", "getName", "Ljava/lang/String;", "getEnrollmentId", "getProductId", "getProductName"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes4.dex */
public final /* data */ class DeviceWalletProviderInfoInput {
    private final java.lang.String enrollmentId;
    private final com.apollographql.apollo.api.Optional<com.paypal.oslo.api.graphql.schema.type.DeviceWalletTokenizationPartner> name;
    private final com.apollographql.apollo.api.Optional<java.lang.String> productId;
    private final com.apollographql.apollo.api.Optional<java.lang.String> productName;

    /* JADX WARN: Multi-variable type inference failed */
    public DeviceWalletProviderInfoInput(com.apollographql.apollo.api.Optional<? extends com.paypal.oslo.api.graphql.schema.type.DeviceWalletTokenizationPartner> optional, java.lang.String str, com.apollographql.apollo.api.Optional<java.lang.String> optional2, com.apollographql.apollo.api.Optional<java.lang.String> optional3) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(optional, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(optional2, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(optional3, "");
        this.name = optional;
        this.enrollmentId = str;
        this.productId = optional2;
        this.productName = optional3;
    }

    public /* synthetic */ DeviceWalletProviderInfoInput(com.apollographql.apollo.api.Optional.Absent absent, java.lang.String str, com.apollographql.apollo.api.Optional.Absent absent2, com.apollographql.apollo.api.Optional.Absent absent3, int i, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? com.apollographql.apollo.api.Optional.Absent.INSTANCE : absent, str, (i & 4) != 0 ? com.apollographql.apollo.api.Optional.Absent.INSTANCE : absent2, (i & 8) != 0 ? com.apollographql.apollo.api.Optional.Absent.INSTANCE : absent3);
    }

    public final com.apollographql.apollo.api.Optional<com.paypal.oslo.api.graphql.schema.type.DeviceWalletTokenizationPartner> getName() {
        return this.name;
    }

    public final java.lang.String getEnrollmentId() {
        return this.enrollmentId;
    }

    public final com.apollographql.apollo.api.Optional<java.lang.String> getProductId() {
        return this.productId;
    }

    public final com.apollographql.apollo.api.Optional<java.lang.String> getProductName() {
        return this.productName;
    }

    public final java.lang.String toString() {
        com.apollographql.apollo.api.Optional<com.paypal.oslo.api.graphql.schema.type.DeviceWalletTokenizationPartner> optional = this.name;
        java.lang.String str = this.enrollmentId;
        com.apollographql.apollo.api.Optional<java.lang.String> optional2 = this.productId;
        com.apollographql.apollo.api.Optional<java.lang.String> optional3 = this.productName;
        java.lang.StringBuilder sb = new java.lang.StringBuilder("DeviceWalletProviderInfoInput(name=");
        sb.append(optional);
        sb.append(", enrollmentId=");
        sb.append(str);
        sb.append(", productId=");
        sb.append(optional2);
        sb.append(", productName=");
        sb.append(optional3);
        sb.append(")");
        return sb.toString();
    }

    public final int hashCode() {
        return (((((this.name.hashCode() * 31) + this.enrollmentId.hashCode()) * 31) + this.productId.hashCode()) * 31) + this.productName.hashCode();
    }

    public final boolean equals(java.lang.Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof com.paypal.oslo.api.graphql.schema.type.DeviceWalletProviderInfoInput)) {
            return false;
        }
        com.paypal.oslo.api.graphql.schema.type.DeviceWalletProviderInfoInput deviceWalletProviderInfoInput = (com.paypal.oslo.api.graphql.schema.type.DeviceWalletProviderInfoInput) other;
        return kotlin.jvm.internal.Intrinsics.areEqual(this.name, deviceWalletProviderInfoInput.name) && kotlin.jvm.internal.Intrinsics.areEqual(this.enrollmentId, deviceWalletProviderInfoInput.enrollmentId) && kotlin.jvm.internal.Intrinsics.areEqual(this.productId, deviceWalletProviderInfoInput.productId) && kotlin.jvm.internal.Intrinsics.areEqual(this.productName, deviceWalletProviderInfoInput.productName);
    }

    public final com.paypal.oslo.api.graphql.schema.type.DeviceWalletProviderInfoInput copy(com.apollographql.apollo.api.Optional<? extends com.paypal.oslo.api.graphql.schema.type.DeviceWalletTokenizationPartner> name2, java.lang.String enrollmentId, com.apollographql.apollo.api.Optional<java.lang.String> productId, com.apollographql.apollo.api.Optional<java.lang.String> productName) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(name2, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(enrollmentId, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(productId, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(productName, "");
        return new com.paypal.oslo.api.graphql.schema.type.DeviceWalletProviderInfoInput(name2, enrollmentId, productId, productName);
    }

    public final com.apollographql.apollo.api.Optional<java.lang.String> component4() {
        return this.productName;
    }

    public final com.apollographql.apollo.api.Optional<java.lang.String> component3() {
        return this.productId;
    }

    /* renamed from: component2, reason: from getter */
    public final java.lang.String getEnrollmentId() {
        return this.enrollmentId;
    }

    public final com.apollographql.apollo.api.Optional<com.paypal.oslo.api.graphql.schema.type.DeviceWalletTokenizationPartner> component1() {
        return this.name;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ com.paypal.oslo.api.graphql.schema.type.DeviceWalletProviderInfoInput copy$default(com.paypal.oslo.api.graphql.schema.type.DeviceWalletProviderInfoInput deviceWalletProviderInfoInput, com.apollographql.apollo.api.Optional optional, java.lang.String str, com.apollographql.apollo.api.Optional optional2, com.apollographql.apollo.api.Optional optional3, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            optional = deviceWalletProviderInfoInput.name;
        }
        if ((i & 2) != 0) {
            str = deviceWalletProviderInfoInput.enrollmentId;
        }
        if ((i & 4) != 0) {
            optional2 = deviceWalletProviderInfoInput.productId;
        }
        if ((i & 8) != 0) {
            optional3 = deviceWalletProviderInfoInput.productName;
        }
        return deviceWalletProviderInfoInput.copy(optional, str, optional2, optional3);
    }
}
