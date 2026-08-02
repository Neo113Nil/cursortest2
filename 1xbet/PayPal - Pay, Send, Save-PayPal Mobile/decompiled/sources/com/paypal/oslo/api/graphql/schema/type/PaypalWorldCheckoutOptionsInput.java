package com.paypal.oslo.api.graphql.schema.type;

@kotlin.Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\b\b\u0086\b\u0018\u00002\u00020\u0001B)\u0012\u0006\u0010\u0002\u001a\u00020\u0001\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0010\b\u0002\u0010\u0007\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00060\u0005¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\n\u001a\u00020\u0001HÆ\u0003¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\f\u001a\u00020\u0003HÆ\u0003¢\u0006\u0004\b\f\u0010\rJ\u0018\u0010\u000e\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00060\u0005HÆ\u0003¢\u0006\u0004\b\u000e\u0010\u000fJ6\u0010\u0010\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00012\b\b\u0002\u0010\u0004\u001a\u00020\u00032\u0010\b\u0002\u0010\u0007\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00060\u0005HÆ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u001a\u0010\u0014\u001a\u00020\u00132\b\u0010\u0012\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0014\u0010\u0015J\u0010\u0010\u0016\u001a\u00020\u0003HÖ\u0001¢\u0006\u0004\b\u0016\u0010\rJ\u0010\u0010\u0018\u001a\u00020\u0017HÖ\u0001¢\u0006\u0004\b\u0018\u0010\u0019R\u0017\u0010\u0002\u001a\u00020\u00018\u0007¢\u0006\f\n\u0004\b\u0002\u0010\u001a\u001a\u0004\b\u001b\u0010\u000bR\u001a\u0010\u0004\u001a\u00020\u00038\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u001c\u001a\u0004\b\u001d\u0010\rR\"\u0010\u0007\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00060\u00058\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010\u001e\u001a\u0004\b\u001f\u0010\u000f"}, d2 = {"Lcom/paypal/oslo/api/graphql/schema/type/PaypalWorldCheckoutOptionsInput;", "", "countryCode", "", "enrollmentVersion", "Lcom/apollographql/apollo/api/Optional;", "Lcom/paypal/oslo/api/graphql/schema/type/DeviceMetadataInput;", "deviceMetadata", "<init>", "(Ljava/lang/Object;ILcom/apollographql/apollo/api/Optional;)V", "component1", "()Ljava/lang/Object;", "component2", "()I", "component3", "()Lcom/apollographql/apollo/api/Optional;", "copy", "(Ljava/lang/Object;ILcom/apollographql/apollo/api/Optional;)Lcom/paypal/oslo/api/graphql/schema/type/PaypalWorldCheckoutOptionsInput;", "other", "", "equals", "(Ljava/lang/Object;)Z", "hashCode", "", "toString", "()Ljava/lang/String;", "Ljava/lang/Object;", "getCountryCode", com.visa.cbp.getEncExpo.warmup, "getEnrollmentVersion", "Lcom/apollographql/apollo/api/Optional;", "getDeviceMetadata"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes4.dex */
public final /* data */ class PaypalWorldCheckoutOptionsInput {
    private final java.lang.Object countryCode;
    private final com.apollographql.apollo.api.Optional<com.paypal.oslo.api.graphql.schema.type.DeviceMetadataInput> deviceMetadata;
    private final int enrollmentVersion;

    public PaypalWorldCheckoutOptionsInput(java.lang.Object obj, int i, com.apollographql.apollo.api.Optional<com.paypal.oslo.api.graphql.schema.type.DeviceMetadataInput> optional) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(obj, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(optional, "");
        this.countryCode = obj;
        this.enrollmentVersion = i;
        this.deviceMetadata = optional;
    }

    public final java.lang.Object getCountryCode() {
        return this.countryCode;
    }

    public final int getEnrollmentVersion() {
        return this.enrollmentVersion;
    }

    public /* synthetic */ PaypalWorldCheckoutOptionsInput(java.lang.Object obj, int i, com.apollographql.apollo.api.Optional.Absent absent, int i2, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this(obj, i, (i2 & 4) != 0 ? com.apollographql.apollo.api.Optional.Absent.INSTANCE : absent);
    }

    public final com.apollographql.apollo.api.Optional<com.paypal.oslo.api.graphql.schema.type.DeviceMetadataInput> getDeviceMetadata() {
        return this.deviceMetadata;
    }

    public final java.lang.String toString() {
        java.lang.Object obj = this.countryCode;
        int i = this.enrollmentVersion;
        com.apollographql.apollo.api.Optional<com.paypal.oslo.api.graphql.schema.type.DeviceMetadataInput> optional = this.deviceMetadata;
        java.lang.StringBuilder sb = new java.lang.StringBuilder("PaypalWorldCheckoutOptionsInput(countryCode=");
        sb.append(obj);
        sb.append(", enrollmentVersion=");
        sb.append(i);
        sb.append(", deviceMetadata=");
        sb.append(optional);
        sb.append(")");
        return sb.toString();
    }

    public final int hashCode() {
        return (((this.countryCode.hashCode() * 31) + java.lang.Integer.hashCode(this.enrollmentVersion)) * 31) + this.deviceMetadata.hashCode();
    }

    public final boolean equals(java.lang.Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof com.paypal.oslo.api.graphql.schema.type.PaypalWorldCheckoutOptionsInput)) {
            return false;
        }
        com.paypal.oslo.api.graphql.schema.type.PaypalWorldCheckoutOptionsInput paypalWorldCheckoutOptionsInput = (com.paypal.oslo.api.graphql.schema.type.PaypalWorldCheckoutOptionsInput) other;
        return kotlin.jvm.internal.Intrinsics.areEqual(this.countryCode, paypalWorldCheckoutOptionsInput.countryCode) && this.enrollmentVersion == paypalWorldCheckoutOptionsInput.enrollmentVersion && kotlin.jvm.internal.Intrinsics.areEqual(this.deviceMetadata, paypalWorldCheckoutOptionsInput.deviceMetadata);
    }

    public final com.paypal.oslo.api.graphql.schema.type.PaypalWorldCheckoutOptionsInput copy(java.lang.Object countryCode, int enrollmentVersion, com.apollographql.apollo.api.Optional<com.paypal.oslo.api.graphql.schema.type.DeviceMetadataInput> deviceMetadata) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(countryCode, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(deviceMetadata, "");
        return new com.paypal.oslo.api.graphql.schema.type.PaypalWorldCheckoutOptionsInput(countryCode, enrollmentVersion, deviceMetadata);
    }

    public final com.apollographql.apollo.api.Optional<com.paypal.oslo.api.graphql.schema.type.DeviceMetadataInput> component3() {
        return this.deviceMetadata;
    }

    /* renamed from: component2, reason: from getter */
    public final int getEnrollmentVersion() {
        return this.enrollmentVersion;
    }

    /* renamed from: component1, reason: from getter */
    public final java.lang.Object getCountryCode() {
        return this.countryCode;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ com.paypal.oslo.api.graphql.schema.type.PaypalWorldCheckoutOptionsInput copy$default(com.paypal.oslo.api.graphql.schema.type.PaypalWorldCheckoutOptionsInput paypalWorldCheckoutOptionsInput, java.lang.Object obj, int i, com.apollographql.apollo.api.Optional optional, int i2, java.lang.Object obj2) {
        if ((i2 & 1) != 0) {
            obj = paypalWorldCheckoutOptionsInput.countryCode;
        }
        if ((i2 & 2) != 0) {
            i = paypalWorldCheckoutOptionsInput.enrollmentVersion;
        }
        if ((i2 & 4) != 0) {
            optional = paypalWorldCheckoutOptionsInput.deviceMetadata;
        }
        return paypalWorldCheckoutOptionsInput.copy(obj, i, optional);
    }
}
