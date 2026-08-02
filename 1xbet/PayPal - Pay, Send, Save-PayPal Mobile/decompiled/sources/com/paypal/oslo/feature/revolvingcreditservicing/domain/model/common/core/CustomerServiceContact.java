package com.paypal.oslo.feature.revolvingcreditservicing.domain.model.common.core;

@kotlin.Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\b\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\r\b\u0081\b\u0018\u0000 52\u00020\u0001:\u000265BC\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0004\u0012\u0006\u0010\b\u001a\u00020\u0004\u0012\u0006\u0010\t\u001a\u00020\u0004\u0012\u0006\u0010\n\u001a\u00020\u0004¢\u0006\u0004\b\u000b\u0010\fBa\b\u0010\u0012\u0006\u0010\u000e\u001a\u00020\r\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\t\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0010\u001a\u0004\u0018\u00010\u000f¢\u0006\u0004\b\u000b\u0010\u0011J\u0012\u0010\u0012\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0012\u0010\u0013J\u0010\u0010\u0014\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\u0014\u0010\u0015J\u0012\u0010\u0016\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b\u0016\u0010\u0015J\u0010\u0010\u0017\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\u0017\u0010\u0015J\u0010\u0010\u0018\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\u0018\u0010\u0015J\u0010\u0010\u0019\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\u0019\u0010\u0015J\u0010\u0010\u001a\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\u001a\u0010\u0015JZ\u0010\u001b\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u00042\b\b\u0002\u0010\b\u001a\u00020\u00042\b\b\u0002\u0010\t\u001a\u00020\u00042\b\b\u0002\u0010\n\u001a\u00020\u0004HÆ\u0001¢\u0006\u0004\b\u001b\u0010\u001cJ\u001a\u0010\u001f\u001a\u00020\u001e2\b\u0010\u001d\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u001f\u0010 J\u0010\u0010!\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b!\u0010\"J\u0010\u0010#\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b#\u0010\u0015J'\u0010*\u001a\u00020)2\u0006\u0010$\u001a\u00020\u00002\u0006\u0010&\u001a\u00020%2\u0006\u0010(\u001a\u00020'H\u0001¢\u0006\u0004\b*\u0010+R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010,\u001a\u0004\b-\u0010\u0013R\u001a\u0010\u0005\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010.\u001a\u0004\b/\u0010\u0015R\u001c\u0010\u0006\u001a\u0004\u0018\u00010\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010.\u001a\u0004\b0\u0010\u0015R\u001a\u0010\u0007\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010.\u001a\u0004\b1\u0010\u0015R\u001a\u0010\b\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\b\u0010.\u001a\u0004\b2\u0010\u0015R\u001a\u0010\t\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\t\u0010.\u001a\u0004\b3\u0010\u0015R\u001a\u0010\n\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\n\u0010.\u001a\u0004\b4\u0010\u0015"}, d2 = {"Lcom/paypal/oslo/feature/revolvingcreditservicing/domain/model/common/core/CustomerServiceContact;", "", "Lcom/paypal/oslo/feature/revolvingcreditservicing/domain/model/common/profiles/PhoneNumber;", "phoneNumber", "", "operationHoursLine1", "operationHoursLine2", "mailAddressLine1", "mailAddressLine2", "mailAddressLine3", "payableTo", "<init>", "(Lcom/paypal/oslo/feature/revolvingcreditservicing/domain/model/common/profiles/PhoneNumber;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "", "seen0", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "serializationConstructorMarker", "(ILcom/paypal/oslo/feature/revolvingcreditservicing/domain/model/common/profiles/PhoneNumber;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", "component1", "()Lcom/paypal/oslo/feature/revolvingcreditservicing/domain/model/common/profiles/PhoneNumber;", "component2", "()Ljava/lang/String;", "component3", "component4", "component5", "component6", "component7", "copy", "(Lcom/paypal/oslo/feature/revolvingcreditservicing/domain/model/common/profiles/PhoneNumber;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lcom/paypal/oslo/feature/revolvingcreditservicing/domain/model/common/core/CustomerServiceContact;", "other", "", "equals", "(Ljava/lang/Object;)Z", "hashCode", "()I", "toString", "self", "Lkotlinx/serialization/encoding/CompositeEncoder;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "", "write$Self$revolvingcredit_servicing_prodRelease", "(Lcom/paypal/oslo/feature/revolvingcreditservicing/domain/model/common/core/CustomerServiceContact;Lkotlinx/serialization/encoding/CompositeEncoder;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "Lcom/paypal/oslo/feature/revolvingcreditservicing/domain/model/common/profiles/PhoneNumber;", "getPhoneNumber", "Ljava/lang/String;", "getOperationHoursLine1", "getOperationHoursLine2", "getMailAddressLine1", "getMailAddressLine2", "getMailAddressLine3", "getPayableTo", "Companion", "$serializer"}, k = 1, mv = {2, 3, 0}, xi = 48)
@kotlinx.serialization.Serializable
/* loaded from: classes2.dex */
public final /* data */ class CustomerServiceContact {
    public static final int $stable = 0;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final com.paypal.oslo.feature.revolvingcreditservicing.domain.model.common.core.CustomerServiceContact.Companion INSTANCE = new com.paypal.oslo.feature.revolvingcreditservicing.domain.model.common.core.CustomerServiceContact.Companion(null);
    private final java.lang.String mailAddressLine1;
    private final java.lang.String mailAddressLine2;
    private final java.lang.String mailAddressLine3;
    private final java.lang.String operationHoursLine1;
    private final java.lang.String operationHoursLine2;
    private final java.lang.String payableTo;
    private final com.paypal.oslo.feature.revolvingcreditservicing.domain.model.common.profiles.PhoneNumber phoneNumber;

    @kotlin.Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"Lcom/paypal/oslo/feature/revolvingcreditservicing/domain/model/common/core/CustomerServiceContact$Companion;", "", "<init>", "()V", "Lkotlinx/serialization/KSerializer;", "Lcom/paypal/oslo/feature/revolvingcreditservicing/domain/model/common/core/CustomerServiceContact;", "serializer", "()Lkotlinx/serialization/KSerializer;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    /* loaded from: classes14.dex */
    public static final class Companion {
        private Companion() {
        }

        public final kotlinx.serialization.KSerializer<com.paypal.oslo.feature.revolvingcreditservicing.domain.model.common.core.CustomerServiceContact> serializer() {
            return com.paypal.oslo.feature.revolvingcreditservicing.domain.model.common.core.CustomerServiceContact$$serializer.INSTANCE;
        }

        public /* synthetic */ Companion(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public /* synthetic */ CustomerServiceContact(int i, com.paypal.oslo.feature.revolvingcreditservicing.domain.model.common.profiles.PhoneNumber phoneNumber, java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.String str4, java.lang.String str5, java.lang.String str6, kotlinx.serialization.internal.SerializationConstructorMarker serializationConstructorMarker) {
        if (127 != (i & 127)) {
            kotlinx.serialization.internal.PluginExceptionsKt.throwMissingFieldException(i, 127, com.paypal.oslo.feature.revolvingcreditservicing.domain.model.common.core.CustomerServiceContact$$serializer.INSTANCE.getDescriptor());
        }
        this.phoneNumber = phoneNumber;
        this.operationHoursLine1 = str;
        this.operationHoursLine2 = str2;
        this.mailAddressLine1 = str3;
        this.mailAddressLine2 = str4;
        this.mailAddressLine3 = str5;
        this.payableTo = str6;
    }

    public CustomerServiceContact(com.paypal.oslo.feature.revolvingcreditservicing.domain.model.common.profiles.PhoneNumber phoneNumber, java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.String str4, java.lang.String str5, java.lang.String str6) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str3, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str4, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str5, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str6, "");
        this.phoneNumber = phoneNumber;
        this.operationHoursLine1 = str;
        this.operationHoursLine2 = str2;
        this.mailAddressLine1 = str3;
        this.mailAddressLine2 = str4;
        this.mailAddressLine3 = str5;
        this.payableTo = str6;
    }

    @kotlin.jvm.JvmStatic
    public static final /* synthetic */ void write$Self$revolvingcredit_servicing_prodRelease(com.paypal.oslo.feature.revolvingcreditservicing.domain.model.common.core.CustomerServiceContact self, kotlinx.serialization.encoding.CompositeEncoder output, kotlinx.serialization.descriptors.SerialDescriptor serialDesc) {
        output.encodeNullableSerializableElement(serialDesc, 0, com.paypal.oslo.feature.revolvingcreditservicing.domain.model.common.profiles.PhoneNumber$$serializer.INSTANCE, self.phoneNumber);
        output.encodeStringElement(serialDesc, 1, self.operationHoursLine1);
        output.encodeNullableSerializableElement(serialDesc, 2, kotlinx.serialization.internal.StringSerializer.INSTANCE, self.operationHoursLine2);
        output.encodeStringElement(serialDesc, 3, self.mailAddressLine1);
        output.encodeStringElement(serialDesc, 4, self.mailAddressLine2);
        output.encodeStringElement(serialDesc, 5, self.mailAddressLine3);
        output.encodeStringElement(serialDesc, 6, self.payableTo);
    }

    public final com.paypal.oslo.feature.revolvingcreditservicing.domain.model.common.profiles.PhoneNumber getPhoneNumber() {
        return this.phoneNumber;
    }

    public final java.lang.String getOperationHoursLine1() {
        return this.operationHoursLine1;
    }

    public final java.lang.String getOperationHoursLine2() {
        return this.operationHoursLine2;
    }

    public final java.lang.String getMailAddressLine1() {
        return this.mailAddressLine1;
    }

    public final java.lang.String getMailAddressLine2() {
        return this.mailAddressLine2;
    }

    public final java.lang.String getMailAddressLine3() {
        return this.mailAddressLine3;
    }

    public final java.lang.String getPayableTo() {
        return this.payableTo;
    }

    public final java.lang.String toString() {
        com.paypal.oslo.feature.revolvingcreditservicing.domain.model.common.profiles.PhoneNumber phoneNumber = this.phoneNumber;
        java.lang.String str = this.operationHoursLine1;
        java.lang.String str2 = this.operationHoursLine2;
        java.lang.String str3 = this.mailAddressLine1;
        java.lang.String str4 = this.mailAddressLine2;
        java.lang.String str5 = this.mailAddressLine3;
        java.lang.String str6 = this.payableTo;
        java.lang.StringBuilder sb = new java.lang.StringBuilder("CustomerServiceContact(phoneNumber=");
        sb.append(phoneNumber);
        sb.append(", operationHoursLine1=");
        sb.append(str);
        sb.append(", operationHoursLine2=");
        sb.append(str2);
        sb.append(", mailAddressLine1=");
        sb.append(str3);
        sb.append(", mailAddressLine2=");
        sb.append(str4);
        sb.append(", mailAddressLine3=");
        sb.append(str5);
        sb.append(", payableTo=");
        sb.append(str6);
        sb.append(")");
        return sb.toString();
    }

    public final int hashCode() {
        com.paypal.oslo.feature.revolvingcreditservicing.domain.model.common.profiles.PhoneNumber phoneNumber = this.phoneNumber;
        int hashCode = phoneNumber == null ? 0 : phoneNumber.hashCode();
        int hashCode2 = this.operationHoursLine1.hashCode();
        java.lang.String str = this.operationHoursLine2;
        return (((((((((((hashCode * 31) + hashCode2) * 31) + (str != null ? str.hashCode() : 0)) * 31) + this.mailAddressLine1.hashCode()) * 31) + this.mailAddressLine2.hashCode()) * 31) + this.mailAddressLine3.hashCode()) * 31) + this.payableTo.hashCode();
    }

    public final boolean equals(java.lang.Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof com.paypal.oslo.feature.revolvingcreditservicing.domain.model.common.core.CustomerServiceContact)) {
            return false;
        }
        com.paypal.oslo.feature.revolvingcreditservicing.domain.model.common.core.CustomerServiceContact customerServiceContact = (com.paypal.oslo.feature.revolvingcreditservicing.domain.model.common.core.CustomerServiceContact) other;
        return kotlin.jvm.internal.Intrinsics.areEqual(this.phoneNumber, customerServiceContact.phoneNumber) && kotlin.jvm.internal.Intrinsics.areEqual(this.operationHoursLine1, customerServiceContact.operationHoursLine1) && kotlin.jvm.internal.Intrinsics.areEqual(this.operationHoursLine2, customerServiceContact.operationHoursLine2) && kotlin.jvm.internal.Intrinsics.areEqual(this.mailAddressLine1, customerServiceContact.mailAddressLine1) && kotlin.jvm.internal.Intrinsics.areEqual(this.mailAddressLine2, customerServiceContact.mailAddressLine2) && kotlin.jvm.internal.Intrinsics.areEqual(this.mailAddressLine3, customerServiceContact.mailAddressLine3) && kotlin.jvm.internal.Intrinsics.areEqual(this.payableTo, customerServiceContact.payableTo);
    }

    public final com.paypal.oslo.feature.revolvingcreditservicing.domain.model.common.core.CustomerServiceContact copy(com.paypal.oslo.feature.revolvingcreditservicing.domain.model.common.profiles.PhoneNumber phoneNumber, java.lang.String operationHoursLine1, java.lang.String operationHoursLine2, java.lang.String mailAddressLine1, java.lang.String mailAddressLine2, java.lang.String mailAddressLine3, java.lang.String payableTo) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(operationHoursLine1, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(mailAddressLine1, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(mailAddressLine2, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(mailAddressLine3, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(payableTo, "");
        return new com.paypal.oslo.feature.revolvingcreditservicing.domain.model.common.core.CustomerServiceContact(phoneNumber, operationHoursLine1, operationHoursLine2, mailAddressLine1, mailAddressLine2, mailAddressLine3, payableTo);
    }

    /* renamed from: component7, reason: from getter */
    public final java.lang.String getPayableTo() {
        return this.payableTo;
    }

    /* renamed from: component6, reason: from getter */
    public final java.lang.String getMailAddressLine3() {
        return this.mailAddressLine3;
    }

    /* renamed from: component5, reason: from getter */
    public final java.lang.String getMailAddressLine2() {
        return this.mailAddressLine2;
    }

    /* renamed from: component4, reason: from getter */
    public final java.lang.String getMailAddressLine1() {
        return this.mailAddressLine1;
    }

    /* renamed from: component3, reason: from getter */
    public final java.lang.String getOperationHoursLine2() {
        return this.operationHoursLine2;
    }

    /* renamed from: component2, reason: from getter */
    public final java.lang.String getOperationHoursLine1() {
        return this.operationHoursLine1;
    }

    /* renamed from: component1, reason: from getter */
    public final com.paypal.oslo.feature.revolvingcreditservicing.domain.model.common.profiles.PhoneNumber getPhoneNumber() {
        return this.phoneNumber;
    }

    public static /* synthetic */ com.paypal.oslo.feature.revolvingcreditservicing.domain.model.common.core.CustomerServiceContact copy$default(com.paypal.oslo.feature.revolvingcreditservicing.domain.model.common.core.CustomerServiceContact customerServiceContact, com.paypal.oslo.feature.revolvingcreditservicing.domain.model.common.profiles.PhoneNumber phoneNumber, java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.String str4, java.lang.String str5, java.lang.String str6, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            phoneNumber = customerServiceContact.phoneNumber;
        }
        if ((i & 2) != 0) {
            str = customerServiceContact.operationHoursLine1;
        }
        java.lang.String str7 = str;
        if ((i & 4) != 0) {
            str2 = customerServiceContact.operationHoursLine2;
        }
        java.lang.String str8 = str2;
        if ((i & 8) != 0) {
            str3 = customerServiceContact.mailAddressLine1;
        }
        java.lang.String str9 = str3;
        if ((i & 16) != 0) {
            str4 = customerServiceContact.mailAddressLine2;
        }
        java.lang.String str10 = str4;
        if ((i & 32) != 0) {
            str5 = customerServiceContact.mailAddressLine3;
        }
        java.lang.String str11 = str5;
        if ((i & 64) != 0) {
            str6 = customerServiceContact.payableTo;
        }
        return customerServiceContact.copy(phoneNumber, str7, str8, str9, str10, str11, str6);
    }
}
