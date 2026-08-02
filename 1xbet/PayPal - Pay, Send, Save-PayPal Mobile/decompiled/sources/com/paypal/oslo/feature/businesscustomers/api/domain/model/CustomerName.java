package com.paypal.oslo.feature.businesscustomers.api.domain.model;

@kotlin.Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\b\b\u0087\b\u0018\u0000 &2\u00020\u0001:\u0002'&B\u001f\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007B/\b\u0010\u0012\u0006\u0010\t\u001a\u00020\b\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\n¢\u0006\u0004\b\u0006\u0010\fJ\u0012\u0010\r\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\r\u0010\u000eJ\u0012\u0010\u000f\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b\u000f\u0010\u0010J(\u0010\u0011\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004HÆ\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\u001a\u0010\u0015\u001a\u00020\u00142\b\u0010\u0013\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0015\u0010\u0016J\u0010\u0010\u0017\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\u0017\u0010\u0018J\u0010\u0010\u0019\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0019\u0010\u0010J'\u0010 \u001a\u00020\u001f2\u0006\u0010\u001a\u001a\u00020\u00002\u0006\u0010\u001c\u001a\u00020\u001b2\u0006\u0010\u001e\u001a\u00020\u001dH\u0001¢\u0006\u0004\b \u0010!R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\"\u001a\u0004\b#\u0010\u000eR\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010$\u001a\u0004\b%\u0010\u0010"}, d2 = {"Lcom/paypal/oslo/feature/businesscustomers/api/domain/model/CustomerName;", "", "Lcom/paypal/oslo/feature/businesscustomers/api/domain/model/CustomerPersonName;", androidx.autofill.HintConstants.AUTOFILL_HINT_PERSON_NAME, "", "businessName", "<init>", "(Lcom/paypal/oslo/feature/businesscustomers/api/domain/model/CustomerPersonName;Ljava/lang/String;)V", "", "seen0", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "serializationConstructorMarker", "(ILcom/paypal/oslo/feature/businesscustomers/api/domain/model/CustomerPersonName;Ljava/lang/String;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", "component1", "()Lcom/paypal/oslo/feature/businesscustomers/api/domain/model/CustomerPersonName;", "component2", "()Ljava/lang/String;", "copy", "(Lcom/paypal/oslo/feature/businesscustomers/api/domain/model/CustomerPersonName;Ljava/lang/String;)Lcom/paypal/oslo/feature/businesscustomers/api/domain/model/CustomerName;", "other", "", "equals", "(Ljava/lang/Object;)Z", "hashCode", "()I", "toString", "self", "Lkotlinx/serialization/encoding/CompositeEncoder;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "", "write$Self$business_customers_api_prodRelease", "(Lcom/paypal/oslo/feature/businesscustomers/api/domain/model/CustomerName;Lkotlinx/serialization/encoding/CompositeEncoder;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "Lcom/paypal/oslo/feature/businesscustomers/api/domain/model/CustomerPersonName;", "getPersonName", "Ljava/lang/String;", "getBusinessName", "Companion", "$serializer"}, k = 1, mv = {2, 3, 0}, xi = 48)
@kotlinx.serialization.Serializable
/* loaded from: classes2.dex */
public final /* data */ class CustomerName {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final com.paypal.oslo.feature.businesscustomers.api.domain.model.CustomerName.Companion INSTANCE = new com.paypal.oslo.feature.businesscustomers.api.domain.model.CustomerName.Companion(null);
    private final java.lang.String businessName;
    private final com.paypal.oslo.feature.businesscustomers.api.domain.model.CustomerPersonName personName;

    @kotlin.Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"Lcom/paypal/oslo/feature/businesscustomers/api/domain/model/CustomerName$Companion;", "", "<init>", "()V", "Lkotlinx/serialization/KSerializer;", "Lcom/paypal/oslo/feature/businesscustomers/api/domain/model/CustomerName;", "serializer", "()Lkotlinx/serialization/KSerializer;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    /* loaded from: classes11.dex */
    public static final class Companion {
        private Companion() {
        }

        public final kotlinx.serialization.KSerializer<com.paypal.oslo.feature.businesscustomers.api.domain.model.CustomerName> serializer() {
            return com.paypal.oslo.feature.businesscustomers.api.domain.model.CustomerName$$serializer.INSTANCE;
        }

        public /* synthetic */ Companion(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public /* synthetic */ CustomerName(int i, com.paypal.oslo.feature.businesscustomers.api.domain.model.CustomerPersonName customerPersonName, java.lang.String str, kotlinx.serialization.internal.SerializationConstructorMarker serializationConstructorMarker) {
        if ((i & 1) == 0) {
            this.personName = null;
        } else {
            this.personName = customerPersonName;
        }
        if ((i & 2) == 0) {
            this.businessName = null;
        } else {
            this.businessName = str;
        }
    }

    public CustomerName(com.paypal.oslo.feature.businesscustomers.api.domain.model.CustomerPersonName customerPersonName, java.lang.String str) {
        this.personName = customerPersonName;
        this.businessName = str;
    }

    @kotlin.jvm.JvmStatic
    public static final /* synthetic */ void write$Self$business_customers_api_prodRelease(com.paypal.oslo.feature.businesscustomers.api.domain.model.CustomerName self, kotlinx.serialization.encoding.CompositeEncoder output, kotlinx.serialization.descriptors.SerialDescriptor serialDesc) {
        if (output.shouldEncodeElementDefault(serialDesc, 0) || self.personName != null) {
            output.encodeNullableSerializableElement(serialDesc, 0, com.paypal.oslo.feature.businesscustomers.api.domain.model.CustomerPersonName$$serializer.INSTANCE, self.personName);
        }
        if (output.shouldEncodeElementDefault(serialDesc, 1) || self.businessName != null) {
            output.encodeNullableSerializableElement(serialDesc, 1, kotlinx.serialization.internal.StringSerializer.INSTANCE, self.businessName);
        }
    }

    public /* synthetic */ CustomerName(com.paypal.oslo.feature.businesscustomers.api.domain.model.CustomerPersonName customerPersonName, java.lang.String str, int i, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : customerPersonName, (i & 2) != 0 ? null : str);
    }

    public final com.paypal.oslo.feature.businesscustomers.api.domain.model.CustomerPersonName getPersonName() {
        return this.personName;
    }

    public final java.lang.String getBusinessName() {
        return this.businessName;
    }

    public final java.lang.String toString() {
        com.paypal.oslo.feature.businesscustomers.api.domain.model.CustomerPersonName customerPersonName = this.personName;
        java.lang.String str = this.businessName;
        java.lang.StringBuilder sb = new java.lang.StringBuilder("CustomerName(personName=");
        sb.append(customerPersonName);
        sb.append(", businessName=");
        sb.append(str);
        sb.append(")");
        return sb.toString();
    }

    public final int hashCode() {
        com.paypal.oslo.feature.businesscustomers.api.domain.model.CustomerPersonName customerPersonName = this.personName;
        int hashCode = customerPersonName == null ? 0 : customerPersonName.hashCode();
        java.lang.String str = this.businessName;
        return (hashCode * 31) + (str != null ? str.hashCode() : 0);
    }

    public final boolean equals(java.lang.Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof com.paypal.oslo.feature.businesscustomers.api.domain.model.CustomerName)) {
            return false;
        }
        com.paypal.oslo.feature.businesscustomers.api.domain.model.CustomerName customerName = (com.paypal.oslo.feature.businesscustomers.api.domain.model.CustomerName) other;
        return kotlin.jvm.internal.Intrinsics.areEqual(this.personName, customerName.personName) && kotlin.jvm.internal.Intrinsics.areEqual(this.businessName, customerName.businessName);
    }

    public final com.paypal.oslo.feature.businesscustomers.api.domain.model.CustomerName copy(com.paypal.oslo.feature.businesscustomers.api.domain.model.CustomerPersonName personName, java.lang.String businessName) {
        return new com.paypal.oslo.feature.businesscustomers.api.domain.model.CustomerName(personName, businessName);
    }

    /* renamed from: component2, reason: from getter */
    public final java.lang.String getBusinessName() {
        return this.businessName;
    }

    /* renamed from: component1, reason: from getter */
    public final com.paypal.oslo.feature.businesscustomers.api.domain.model.CustomerPersonName getPersonName() {
        return this.personName;
    }

    public static /* synthetic */ com.paypal.oslo.feature.businesscustomers.api.domain.model.CustomerName copy$default(com.paypal.oslo.feature.businesscustomers.api.domain.model.CustomerName customerName, com.paypal.oslo.feature.businesscustomers.api.domain.model.CustomerPersonName customerPersonName, java.lang.String str, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            customerPersonName = customerName.personName;
        }
        if ((i & 2) != 0) {
            str = customerName.businessName;
        }
        return customerName.copy(customerPersonName, str);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public CustomerName() {
        this((com.paypal.oslo.feature.businesscustomers.api.domain.model.CustomerPersonName) null, (java.lang.String) (0 == true ? 1 : 0), 3, (kotlin.jvm.internal.DefaultConstructorMarker) (0 == true ? 1 : 0));
    }
}
