package com.paypal.oslo.feature.businesscustomers.api.domain.model;

@kotlin.Metadata(d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0010\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u000f\b\u0087\b\u0018\u0000 ;2\u00020\u0001:\u0002<;BS\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\b\u001a\u00020\u0002\u0012\u0006\u0010\n\u001a\u00020\t\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u000b¢\u0006\u0004\b\r\u0010\u000eBk\b\u0010\u0012\u0006\u0010\u0010\u001a\u00020\u000f\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\n\u001a\u0004\u0018\u00010\t\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u000b\u0012\b\u0010\u0012\u001a\u0004\u0018\u00010\u0011¢\u0006\u0004\b\r\u0010\u0013J\u0012\u0010\u0014\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0014\u0010\u0015J\u0012\u0010\u0016\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0016\u0010\u0015J\u0012\u0010\u0017\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0017\u0010\u0015J\u0012\u0010\u0018\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0018\u0010\u0015J\u0012\u0010\u0019\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0019\u0010\u0015J\u0010\u0010\u001a\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u001a\u0010\u0015J\u0010\u0010\u001b\u001a\u00020\tHÆ\u0003¢\u0006\u0004\b\u001b\u0010\u001cJ\u0012\u0010\u001d\u001a\u0004\u0018\u00010\u000bHÆ\u0003¢\u0006\u0004\b\u001d\u0010\u001eJl\u0010\u001f\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00022\b\b\u0002\u0010\b\u001a\u00020\u00022\b\b\u0002\u0010\n\u001a\u00020\t2\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u000bHÆ\u0001¢\u0006\u0004\b\u001f\u0010 J\u001a\u0010#\u001a\u00020\"2\b\u0010!\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b#\u0010$J\u0010\u0010%\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b%\u0010&J\u0010\u0010'\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b'\u0010\u0015J'\u0010.\u001a\u00020-2\u0006\u0010(\u001a\u00020\u00002\u0006\u0010*\u001a\u00020)2\u0006\u0010,\u001a\u00020+H\u0001¢\u0006\u0004\b.\u0010/R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u00100\u001a\u0004\b1\u0010\u0015R\u001c\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u00100\u001a\u0004\b2\u0010\u0015R\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u00100\u001a\u0004\b3\u0010\u0015R\u001c\u0010\u0006\u001a\u0004\u0018\u00010\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u00100\u001a\u0004\b4\u0010\u0015R\u001c\u0010\u0007\u001a\u0004\u0018\u00010\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u00100\u001a\u0004\b5\u0010\u0015R\u001a\u0010\b\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\b\u00100\u001a\u0004\b6\u0010\u0015R\u001a\u0010\n\u001a\u00020\t8\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\n\u00107\u001a\u0004\b8\u0010\u001cR\u001c\u0010\f\u001a\u0004\u0018\u00010\u000b8\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\f\u00109\u001a\u0004\b:\u0010\u001e"}, d2 = {"Lcom/paypal/oslo/feature/businesscustomers/api/domain/model/CustomerAddress;", "", "", "addressLine1", "addressLine2", "adminArea1", "adminArea2", androidx.autofill.HintConstants.AUTOFILL_HINT_POSTAL_CODE, "countryCode", "Lcom/paypal/oslo/feature/businesscustomers/api/domain/model/AddressType;", "addressType", "Lcom/paypal/oslo/feature/businesscustomers/api/domain/model/CustomerName;", "recipientName", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/paypal/oslo/feature/businesscustomers/api/domain/model/AddressType;Lcom/paypal/oslo/feature/businesscustomers/api/domain/model/CustomerName;)V", "", "seen0", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "serializationConstructorMarker", "(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/paypal/oslo/feature/businesscustomers/api/domain/model/AddressType;Lcom/paypal/oslo/feature/businesscustomers/api/domain/model/CustomerName;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", "component1", "()Ljava/lang/String;", "component2", "component3", "component4", "component5", "component6", "component7", "()Lcom/paypal/oslo/feature/businesscustomers/api/domain/model/AddressType;", "component8", "()Lcom/paypal/oslo/feature/businesscustomers/api/domain/model/CustomerName;", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/paypal/oslo/feature/businesscustomers/api/domain/model/AddressType;Lcom/paypal/oslo/feature/businesscustomers/api/domain/model/CustomerName;)Lcom/paypal/oslo/feature/businesscustomers/api/domain/model/CustomerAddress;", "other", "", "equals", "(Ljava/lang/Object;)Z", "hashCode", "()I", "toString", "self", "Lkotlinx/serialization/encoding/CompositeEncoder;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "", "write$Self$business_customers_api_prodRelease", "(Lcom/paypal/oslo/feature/businesscustomers/api/domain/model/CustomerAddress;Lkotlinx/serialization/encoding/CompositeEncoder;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "Ljava/lang/String;", "getAddressLine1", "getAddressLine2", "getAdminArea1", "getAdminArea2", "getPostalCode", "getCountryCode", "Lcom/paypal/oslo/feature/businesscustomers/api/domain/model/AddressType;", "getAddressType", "Lcom/paypal/oslo/feature/businesscustomers/api/domain/model/CustomerName;", "getRecipientName", "Companion", "$serializer"}, k = 1, mv = {2, 3, 0}, xi = 48)
@kotlinx.serialization.Serializable
/* loaded from: classes2.dex */
public final /* data */ class CustomerAddress {
    private final java.lang.String addressLine1;
    private final java.lang.String addressLine2;
    private final com.paypal.oslo.feature.businesscustomers.api.domain.model.AddressType addressType;
    private final java.lang.String adminArea1;
    private final java.lang.String adminArea2;
    private final java.lang.String countryCode;
    private final java.lang.String postalCode;
    private final com.paypal.oslo.feature.businesscustomers.api.domain.model.CustomerName recipientName;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final com.paypal.oslo.feature.businesscustomers.api.domain.model.CustomerAddress.Companion INSTANCE = new com.paypal.oslo.feature.businesscustomers.api.domain.model.CustomerAddress.Companion(null);
    private static final kotlin.Lazy<kotlinx.serialization.KSerializer<java.lang.Object>>[] $childSerializers = {null, null, null, null, null, null, kotlin.LazyKt.lazy(kotlin.LazyThreadSafetyMode.PUBLICATION, new kotlin.jvm.functions.Function0() { // from class: com.paypal.oslo.feature.businesscustomers.api.domain.model.CustomerAddress$$ExternalSyntheticLambda0
        @Override // kotlin.jvm.functions.Function0
        public final java.lang.Object invoke() {
            kotlinx.serialization.KSerializer createSimpleEnumSerializer;
            createSimpleEnumSerializer = kotlinx.serialization.internal.EnumsKt.createSimpleEnumSerializer("com.paypal.oslo.feature.businesscustomers.api.domain.model.AddressType", com.paypal.oslo.feature.businesscustomers.api.domain.model.AddressType.values());
            return createSimpleEnumSerializer;
        }
    }), null};

    @kotlin.Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"Lcom/paypal/oslo/feature/businesscustomers/api/domain/model/CustomerAddress$Companion;", "", "<init>", "()V", "Lkotlinx/serialization/KSerializer;", "Lcom/paypal/oslo/feature/businesscustomers/api/domain/model/CustomerAddress;", "serializer", "()Lkotlinx/serialization/KSerializer;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    /* loaded from: classes11.dex */
    public static final class Companion {
        private Companion() {
        }

        public final kotlinx.serialization.KSerializer<com.paypal.oslo.feature.businesscustomers.api.domain.model.CustomerAddress> serializer() {
            return com.paypal.oslo.feature.businesscustomers.api.domain.model.CustomerAddress$$serializer.INSTANCE;
        }

        public /* synthetic */ Companion(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public /* synthetic */ CustomerAddress(int i, java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.String str4, java.lang.String str5, java.lang.String str6, com.paypal.oslo.feature.businesscustomers.api.domain.model.AddressType addressType, com.paypal.oslo.feature.businesscustomers.api.domain.model.CustomerName customerName, kotlinx.serialization.internal.SerializationConstructorMarker serializationConstructorMarker) {
        if (255 != (i & 255)) {
            kotlinx.serialization.internal.PluginExceptionsKt.throwMissingFieldException(i, 255, com.paypal.oslo.feature.businesscustomers.api.domain.model.CustomerAddress$$serializer.INSTANCE.getDescriptor());
        }
        this.addressLine1 = str;
        this.addressLine2 = str2;
        this.adminArea1 = str3;
        this.adminArea2 = str4;
        this.postalCode = str5;
        this.countryCode = str6;
        this.addressType = addressType;
        this.recipientName = customerName;
    }

    public CustomerAddress(java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.String str4, java.lang.String str5, java.lang.String str6, com.paypal.oslo.feature.businesscustomers.api.domain.model.AddressType addressType, com.paypal.oslo.feature.businesscustomers.api.domain.model.CustomerName customerName) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str6, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(addressType, "");
        this.addressLine1 = str;
        this.addressLine2 = str2;
        this.adminArea1 = str3;
        this.adminArea2 = str4;
        this.postalCode = str5;
        this.countryCode = str6;
        this.addressType = addressType;
        this.recipientName = customerName;
    }

    @kotlin.jvm.JvmStatic
    public static final /* synthetic */ void write$Self$business_customers_api_prodRelease(com.paypal.oslo.feature.businesscustomers.api.domain.model.CustomerAddress self, kotlinx.serialization.encoding.CompositeEncoder output, kotlinx.serialization.descriptors.SerialDescriptor serialDesc) {
        kotlin.Lazy<kotlinx.serialization.KSerializer<java.lang.Object>>[] lazyArr = $childSerializers;
        output.encodeNullableSerializableElement(serialDesc, 0, kotlinx.serialization.internal.StringSerializer.INSTANCE, self.addressLine1);
        output.encodeNullableSerializableElement(serialDesc, 1, kotlinx.serialization.internal.StringSerializer.INSTANCE, self.addressLine2);
        output.encodeNullableSerializableElement(serialDesc, 2, kotlinx.serialization.internal.StringSerializer.INSTANCE, self.adminArea1);
        output.encodeNullableSerializableElement(serialDesc, 3, kotlinx.serialization.internal.StringSerializer.INSTANCE, self.adminArea2);
        output.encodeNullableSerializableElement(serialDesc, 4, kotlinx.serialization.internal.StringSerializer.INSTANCE, self.postalCode);
        output.encodeStringElement(serialDesc, 5, self.countryCode);
        output.encodeSerializableElement(serialDesc, 6, lazyArr[6].getValue(), self.addressType);
        output.encodeNullableSerializableElement(serialDesc, 7, com.paypal.oslo.feature.businesscustomers.api.domain.model.CustomerName$$serializer.INSTANCE, self.recipientName);
    }

    public final java.lang.String getAddressLine1() {
        return this.addressLine1;
    }

    public final java.lang.String getAddressLine2() {
        return this.addressLine2;
    }

    public final java.lang.String getAdminArea1() {
        return this.adminArea1;
    }

    public final java.lang.String getAdminArea2() {
        return this.adminArea2;
    }

    public final java.lang.String getPostalCode() {
        return this.postalCode;
    }

    public final java.lang.String getCountryCode() {
        return this.countryCode;
    }

    public final com.paypal.oslo.feature.businesscustomers.api.domain.model.AddressType getAddressType() {
        return this.addressType;
    }

    public final com.paypal.oslo.feature.businesscustomers.api.domain.model.CustomerName getRecipientName() {
        return this.recipientName;
    }

    public final java.lang.String toString() {
        java.lang.String str = this.addressLine1;
        java.lang.String str2 = this.addressLine2;
        java.lang.String str3 = this.adminArea1;
        java.lang.String str4 = this.adminArea2;
        java.lang.String str5 = this.postalCode;
        java.lang.String str6 = this.countryCode;
        com.paypal.oslo.feature.businesscustomers.api.domain.model.AddressType addressType = this.addressType;
        com.paypal.oslo.feature.businesscustomers.api.domain.model.CustomerName customerName = this.recipientName;
        java.lang.StringBuilder sb = new java.lang.StringBuilder("CustomerAddress(addressLine1=");
        sb.append(str);
        sb.append(", addressLine2=");
        sb.append(str2);
        sb.append(", adminArea1=");
        sb.append(str3);
        sb.append(", adminArea2=");
        sb.append(str4);
        sb.append(", postalCode=");
        sb.append(str5);
        sb.append(", countryCode=");
        sb.append(str6);
        sb.append(", addressType=");
        sb.append(addressType);
        sb.append(", recipientName=");
        sb.append(customerName);
        sb.append(")");
        return sb.toString();
    }

    public final int hashCode() {
        java.lang.String str = this.addressLine1;
        int hashCode = str == null ? 0 : str.hashCode();
        java.lang.String str2 = this.addressLine2;
        int hashCode2 = str2 == null ? 0 : str2.hashCode();
        java.lang.String str3 = this.adminArea1;
        int hashCode3 = str3 == null ? 0 : str3.hashCode();
        java.lang.String str4 = this.adminArea2;
        int hashCode4 = str4 == null ? 0 : str4.hashCode();
        java.lang.String str5 = this.postalCode;
        int hashCode5 = str5 == null ? 0 : str5.hashCode();
        int hashCode6 = this.countryCode.hashCode();
        int hashCode7 = this.addressType.hashCode();
        com.paypal.oslo.feature.businesscustomers.api.domain.model.CustomerName customerName = this.recipientName;
        return (((((((((((((hashCode * 31) + hashCode2) * 31) + hashCode3) * 31) + hashCode4) * 31) + hashCode5) * 31) + hashCode6) * 31) + hashCode7) * 31) + (customerName != null ? customerName.hashCode() : 0);
    }

    public final boolean equals(java.lang.Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof com.paypal.oslo.feature.businesscustomers.api.domain.model.CustomerAddress)) {
            return false;
        }
        com.paypal.oslo.feature.businesscustomers.api.domain.model.CustomerAddress customerAddress = (com.paypal.oslo.feature.businesscustomers.api.domain.model.CustomerAddress) other;
        return kotlin.jvm.internal.Intrinsics.areEqual(this.addressLine1, customerAddress.addressLine1) && kotlin.jvm.internal.Intrinsics.areEqual(this.addressLine2, customerAddress.addressLine2) && kotlin.jvm.internal.Intrinsics.areEqual(this.adminArea1, customerAddress.adminArea1) && kotlin.jvm.internal.Intrinsics.areEqual(this.adminArea2, customerAddress.adminArea2) && kotlin.jvm.internal.Intrinsics.areEqual(this.postalCode, customerAddress.postalCode) && kotlin.jvm.internal.Intrinsics.areEqual(this.countryCode, customerAddress.countryCode) && this.addressType == customerAddress.addressType && kotlin.jvm.internal.Intrinsics.areEqual(this.recipientName, customerAddress.recipientName);
    }

    public final com.paypal.oslo.feature.businesscustomers.api.domain.model.CustomerAddress copy(java.lang.String addressLine1, java.lang.String addressLine2, java.lang.String adminArea1, java.lang.String adminArea2, java.lang.String postalCode, java.lang.String countryCode, com.paypal.oslo.feature.businesscustomers.api.domain.model.AddressType addressType, com.paypal.oslo.feature.businesscustomers.api.domain.model.CustomerName recipientName) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(countryCode, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(addressType, "");
        return new com.paypal.oslo.feature.businesscustomers.api.domain.model.CustomerAddress(addressLine1, addressLine2, adminArea1, adminArea2, postalCode, countryCode, addressType, recipientName);
    }

    /* renamed from: component8, reason: from getter */
    public final com.paypal.oslo.feature.businesscustomers.api.domain.model.CustomerName getRecipientName() {
        return this.recipientName;
    }

    /* renamed from: component7, reason: from getter */
    public final com.paypal.oslo.feature.businesscustomers.api.domain.model.AddressType getAddressType() {
        return this.addressType;
    }

    /* renamed from: component6, reason: from getter */
    public final java.lang.String getCountryCode() {
        return this.countryCode;
    }

    /* renamed from: component5, reason: from getter */
    public final java.lang.String getPostalCode() {
        return this.postalCode;
    }

    /* renamed from: component4, reason: from getter */
    public final java.lang.String getAdminArea2() {
        return this.adminArea2;
    }

    /* renamed from: component3, reason: from getter */
    public final java.lang.String getAdminArea1() {
        return this.adminArea1;
    }

    /* renamed from: component2, reason: from getter */
    public final java.lang.String getAddressLine2() {
        return this.addressLine2;
    }

    /* renamed from: component1, reason: from getter */
    public final java.lang.String getAddressLine1() {
        return this.addressLine1;
    }
}
