package com.paypal.oslo.feature.businesspayandgetpaid.requestmanagement.domain.model.invoicemanagement;

@kotlin.Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\t\b\u0081\b\u0018\u0000 \"2\u00020\u0001:\u0005#$%&\"B\u0011\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0004\u0010\u0005B%\b\u0010\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b\u0004\u0010\nJ\u0012\u0010\u000b\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u000b\u0010\fJ\u001c\u0010\r\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002HÆ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u001a\u0010\u0011\u001a\u00020\u00102\b\u0010\u000f\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0013\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0016\u001a\u00020\u0015HÖ\u0001¢\u0006\u0004\b\u0016\u0010\u0017J'\u0010\u001e\u001a\u00020\u001d2\u0006\u0010\u0018\u001a\u00020\u00002\u0006\u0010\u001a\u001a\u00020\u00192\u0006\u0010\u001c\u001a\u00020\u001bH\u0001¢\u0006\u0004\b\u001e\u0010\u001fR\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010 \u001a\u0004\b!\u0010\f"}, d2 = {"Lcom/paypal/oslo/feature/businesspayandgetpaid/requestmanagement/domain/model/invoicemanagement/Recipient;", "", "Lcom/paypal/oslo/feature/businesspayandgetpaid/requestmanagement/domain/model/invoicemanagement/Recipient$RecipientInfo;", "billingInfo", "<init>", "(Lcom/paypal/oslo/feature/businesspayandgetpaid/requestmanagement/domain/model/invoicemanagement/Recipient$RecipientInfo;)V", "", "seen0", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "serializationConstructorMarker", "(ILcom/paypal/oslo/feature/businesspayandgetpaid/requestmanagement/domain/model/invoicemanagement/Recipient$RecipientInfo;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", "component1", "()Lcom/paypal/oslo/feature/businesspayandgetpaid/requestmanagement/domain/model/invoicemanagement/Recipient$RecipientInfo;", "copy", "(Lcom/paypal/oslo/feature/businesspayandgetpaid/requestmanagement/domain/model/invoicemanagement/Recipient$RecipientInfo;)Lcom/paypal/oslo/feature/businesspayandgetpaid/requestmanagement/domain/model/invoicemanagement/Recipient;", "other", "", "equals", "(Ljava/lang/Object;)Z", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "self", "Lkotlinx/serialization/encoding/CompositeEncoder;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "", "write$Self$business_pay_and_get_paid_prodRelease", "(Lcom/paypal/oslo/feature/businesspayandgetpaid/requestmanagement/domain/model/invoicemanagement/Recipient;Lkotlinx/serialization/encoding/CompositeEncoder;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "Lcom/paypal/oslo/feature/businesspayandgetpaid/requestmanagement/domain/model/invoicemanagement/Recipient$RecipientInfo;", "getBillingInfo", "Companion", "RecipientInfo", "RecipientName", "RecipientPhoneNumber", "$serializer"}, k = 1, mv = {2, 3, 0}, xi = 48)
@kotlinx.serialization.Serializable
/* loaded from: classes2.dex */
public final /* data */ class Recipient {
    private final com.paypal.oslo.feature.businesspayandgetpaid.requestmanagement.domain.model.invoicemanagement.Recipient.RecipientInfo billingInfo;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final com.paypal.oslo.feature.businesspayandgetpaid.requestmanagement.domain.model.invoicemanagement.Recipient.Companion INSTANCE = new com.paypal.oslo.feature.businesspayandgetpaid.requestmanagement.domain.model.invoicemanagement.Recipient.Companion(null);
    public static final int $stable = 8;

    @kotlin.Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"Lcom/paypal/oslo/feature/businesspayandgetpaid/requestmanagement/domain/model/invoicemanagement/Recipient$Companion;", "", "<init>", "()V", "Lkotlinx/serialization/KSerializer;", "Lcom/paypal/oslo/feature/businesspayandgetpaid/requestmanagement/domain/model/invoicemanagement/Recipient;", "serializer", "()Lkotlinx/serialization/KSerializer;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    /* loaded from: classes11.dex */
    public static final class Companion {
        private Companion() {
        }

        public final kotlinx.serialization.KSerializer<com.paypal.oslo.feature.businesspayandgetpaid.requestmanagement.domain.model.invoicemanagement.Recipient> serializer() {
            return com.paypal.oslo.feature.businesspayandgetpaid.requestmanagement.domain.model.invoicemanagement.Recipient$$serializer.INSTANCE;
        }

        public /* synthetic */ Companion(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public /* synthetic */ Recipient(int i, com.paypal.oslo.feature.businesspayandgetpaid.requestmanagement.domain.model.invoicemanagement.Recipient.RecipientInfo recipientInfo, kotlinx.serialization.internal.SerializationConstructorMarker serializationConstructorMarker) {
        if (1 != (i & 1)) {
            kotlinx.serialization.internal.PluginExceptionsKt.throwMissingFieldException(i, 1, com.paypal.oslo.feature.businesspayandgetpaid.requestmanagement.domain.model.invoicemanagement.Recipient$$serializer.INSTANCE.getDescriptor());
        }
        this.billingInfo = recipientInfo;
    }

    public Recipient(com.paypal.oslo.feature.businesspayandgetpaid.requestmanagement.domain.model.invoicemanagement.Recipient.RecipientInfo recipientInfo) {
        this.billingInfo = recipientInfo;
    }

    public final com.paypal.oslo.feature.businesspayandgetpaid.requestmanagement.domain.model.invoicemanagement.Recipient.RecipientInfo getBillingInfo() {
        return this.billingInfo;
    }

    @kotlin.Metadata(d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\n\b\u0081\b\u0018\u0000 -2\u00020\u0001:\u0002.-B+\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\u000e\u0010\b\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0006¢\u0006\u0004\b\t\u0010\nB?\b\u0010\u0012\u0006\u0010\f\u001a\u00020\u000b\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\u000e\u0010\b\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0006\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\r¢\u0006\u0004\b\t\u0010\u000fJ\u0012\u0010\u0010\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0010\u0010\u0011J\u0012\u0010\u0012\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b\u0012\u0010\u0013J\u0018\u0010\u0014\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0006HÆ\u0003¢\u0006\u0004\b\u0014\u0010\u0015J:\u0010\u0016\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00042\u0010\b\u0002\u0010\b\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0006HÆ\u0001¢\u0006\u0004\b\u0016\u0010\u0017J\u001a\u0010\u001a\u001a\u00020\u00192\b\u0010\u0018\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u001a\u0010\u001bJ\u0010\u0010\u001c\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\u001c\u0010\u001dJ\u0010\u0010\u001e\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u001e\u0010\u0013J'\u0010%\u001a\u00020$2\u0006\u0010\u001f\u001a\u00020\u00002\u0006\u0010!\u001a\u00020 2\u0006\u0010#\u001a\u00020\"H\u0001¢\u0006\u0004\b%\u0010&R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010'\u001a\u0004\b(\u0010\u0011R\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010)\u001a\u0004\b*\u0010\u0013R\"\u0010\b\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u00068\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\b\u0010+\u001a\u0004\b,\u0010\u0015"}, d2 = {"Lcom/paypal/oslo/feature/businesspayandgetpaid/requestmanagement/domain/model/invoicemanagement/Recipient$RecipientInfo;", "", "Lcom/paypal/oslo/feature/businesspayandgetpaid/requestmanagement/domain/model/invoicemanagement/Recipient$RecipientName;", "name", "", androidx.autofill.HintConstants.AUTOFILL_HINT_EMAIL_ADDRESS, "", "Lcom/paypal/oslo/feature/businesspayandgetpaid/requestmanagement/domain/model/invoicemanagement/Recipient$RecipientPhoneNumber;", "phones", "<init>", "(Lcom/paypal/oslo/feature/businesspayandgetpaid/requestmanagement/domain/model/invoicemanagement/Recipient$RecipientName;Ljava/lang/String;Ljava/util/List;)V", "", "seen0", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "serializationConstructorMarker", "(ILcom/paypal/oslo/feature/businesspayandgetpaid/requestmanagement/domain/model/invoicemanagement/Recipient$RecipientName;Ljava/lang/String;Ljava/util/List;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", "component1", "()Lcom/paypal/oslo/feature/businesspayandgetpaid/requestmanagement/domain/model/invoicemanagement/Recipient$RecipientName;", "component2", "()Ljava/lang/String;", "component3", "()Ljava/util/List;", "copy", "(Lcom/paypal/oslo/feature/businesspayandgetpaid/requestmanagement/domain/model/invoicemanagement/Recipient$RecipientName;Ljava/lang/String;Ljava/util/List;)Lcom/paypal/oslo/feature/businesspayandgetpaid/requestmanagement/domain/model/invoicemanagement/Recipient$RecipientInfo;", "other", "", "equals", "(Ljava/lang/Object;)Z", "hashCode", "()I", "toString", "self", "Lkotlinx/serialization/encoding/CompositeEncoder;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "", "write$Self$business_pay_and_get_paid_prodRelease", "(Lcom/paypal/oslo/feature/businesspayandgetpaid/requestmanagement/domain/model/invoicemanagement/Recipient$RecipientInfo;Lkotlinx/serialization/encoding/CompositeEncoder;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "Lcom/paypal/oslo/feature/businesspayandgetpaid/requestmanagement/domain/model/invoicemanagement/Recipient$RecipientName;", "getName", "Ljava/lang/String;", "getEmailAddress", "Ljava/util/List;", "getPhones", "Companion", "$serializer"}, k = 1, mv = {2, 3, 0}, xi = 48)
    @kotlinx.serialization.Serializable
    public static final /* data */ class RecipientInfo {
        private final java.lang.String emailAddress;
        private final com.paypal.oslo.feature.businesspayandgetpaid.requestmanagement.domain.model.invoicemanagement.Recipient.RecipientName name;
        private final java.util.List<com.paypal.oslo.feature.businesspayandgetpaid.requestmanagement.domain.model.invoicemanagement.Recipient.RecipientPhoneNumber> phones;

        /* renamed from: Companion, reason: from kotlin metadata */
        public static final com.paypal.oslo.feature.businesspayandgetpaid.requestmanagement.domain.model.invoicemanagement.Recipient.RecipientInfo.Companion INSTANCE = new com.paypal.oslo.feature.businesspayandgetpaid.requestmanagement.domain.model.invoicemanagement.Recipient.RecipientInfo.Companion(null);
        public static final int $stable = 8;
        private static final kotlin.Lazy<kotlinx.serialization.KSerializer<java.lang.Object>>[] $childSerializers = {null, null, kotlin.LazyKt.lazy(kotlin.LazyThreadSafetyMode.PUBLICATION, new kotlin.jvm.functions.Function0() { // from class: com.paypal.oslo.feature.businesspayandgetpaid.requestmanagement.domain.model.invoicemanagement.Recipient$RecipientInfo$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return com.paypal.oslo.feature.businesspayandgetpaid.requestmanagement.domain.model.invoicemanagement.Recipient.RecipientInfo.m13314$r8$lambda$R4Jg63Euqgxq3i8KK1QImrSVq4();
            }
        })};

        @kotlin.Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"Lcom/paypal/oslo/feature/businesspayandgetpaid/requestmanagement/domain/model/invoicemanagement/Recipient$RecipientInfo$Companion;", "", "<init>", "()V", "Lkotlinx/serialization/KSerializer;", "Lcom/paypal/oslo/feature/businesspayandgetpaid/requestmanagement/domain/model/invoicemanagement/Recipient$RecipientInfo;", "serializer", "()Lkotlinx/serialization/KSerializer;"}, k = 1, mv = {2, 3, 0}, xi = 48)
        /* loaded from: classes11.dex */
        public static final class Companion {
            private Companion() {
            }

            public final kotlinx.serialization.KSerializer<com.paypal.oslo.feature.businesspayandgetpaid.requestmanagement.domain.model.invoicemanagement.Recipient.RecipientInfo> serializer() {
                return com.paypal.oslo.feature.businesspayandgetpaid.requestmanagement.domain.model.invoicemanagement.Recipient$RecipientInfo$$serializer.INSTANCE;
            }

            public /* synthetic */ Companion(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }
        }

        public /* synthetic */ RecipientInfo(int i, com.paypal.oslo.feature.businesspayandgetpaid.requestmanagement.domain.model.invoicemanagement.Recipient.RecipientName recipientName, java.lang.String str, java.util.List list, kotlinx.serialization.internal.SerializationConstructorMarker serializationConstructorMarker) {
            if (7 != (i & 7)) {
                kotlinx.serialization.internal.PluginExceptionsKt.throwMissingFieldException(i, 7, com.paypal.oslo.feature.businesspayandgetpaid.requestmanagement.domain.model.invoicemanagement.Recipient$RecipientInfo$$serializer.INSTANCE.getDescriptor());
            }
            this.name = recipientName;
            this.emailAddress = str;
            this.phones = list;
        }

        public RecipientInfo(com.paypal.oslo.feature.businesspayandgetpaid.requestmanagement.domain.model.invoicemanagement.Recipient.RecipientName recipientName, java.lang.String str, java.util.List<com.paypal.oslo.feature.businesspayandgetpaid.requestmanagement.domain.model.invoicemanagement.Recipient.RecipientPhoneNumber> list) {
            this.name = recipientName;
            this.emailAddress = str;
            this.phones = list;
        }

        @kotlin.jvm.JvmStatic
        public static final /* synthetic */ void write$Self$business_pay_and_get_paid_prodRelease(com.paypal.oslo.feature.businesspayandgetpaid.requestmanagement.domain.model.invoicemanagement.Recipient.RecipientInfo self, kotlinx.serialization.encoding.CompositeEncoder output, kotlinx.serialization.descriptors.SerialDescriptor serialDesc) {
            kotlin.Lazy<kotlinx.serialization.KSerializer<java.lang.Object>>[] lazyArr = $childSerializers;
            output.encodeNullableSerializableElement(serialDesc, 0, com.paypal.oslo.feature.businesspayandgetpaid.requestmanagement.domain.model.invoicemanagement.Recipient$RecipientName$$serializer.INSTANCE, self.name);
            output.encodeNullableSerializableElement(serialDesc, 1, kotlinx.serialization.internal.StringSerializer.INSTANCE, self.emailAddress);
            output.encodeNullableSerializableElement(serialDesc, 2, lazyArr[2].getValue(), self.phones);
        }

        public final com.paypal.oslo.feature.businesspayandgetpaid.requestmanagement.domain.model.invoicemanagement.Recipient.RecipientName getName() {
            return this.name;
        }

        public final java.lang.String getEmailAddress() {
            return this.emailAddress;
        }

        public final java.util.List<com.paypal.oslo.feature.businesspayandgetpaid.requestmanagement.domain.model.invoicemanagement.Recipient.RecipientPhoneNumber> getPhones() {
            return this.phones;
        }

        /* renamed from: $r8$lambda$R-4Jg63Euqgxq3i8KK1QImrSVq4, reason: not valid java name */
        public static /* synthetic */ kotlinx.serialization.KSerializer m13314$r8$lambda$R4Jg63Euqgxq3i8KK1QImrSVq4() {
            return new kotlinx.serialization.internal.ArrayListSerializer(com.paypal.oslo.feature.businesspayandgetpaid.requestmanagement.domain.model.invoicemanagement.Recipient$RecipientPhoneNumber$$serializer.INSTANCE);
        }

        public final java.lang.String toString() {
            com.paypal.oslo.feature.businesspayandgetpaid.requestmanagement.domain.model.invoicemanagement.Recipient.RecipientName recipientName = this.name;
            java.lang.String str = this.emailAddress;
            java.util.List<com.paypal.oslo.feature.businesspayandgetpaid.requestmanagement.domain.model.invoicemanagement.Recipient.RecipientPhoneNumber> list = this.phones;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("RecipientInfo(name=");
            sb.append(recipientName);
            sb.append(", emailAddress=");
            sb.append(str);
            sb.append(", phones=");
            sb.append(list);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            com.paypal.oslo.feature.businesspayandgetpaid.requestmanagement.domain.model.invoicemanagement.Recipient.RecipientName recipientName = this.name;
            int hashCode = recipientName == null ? 0 : recipientName.hashCode();
            java.lang.String str = this.emailAddress;
            int hashCode2 = str == null ? 0 : str.hashCode();
            java.util.List<com.paypal.oslo.feature.businesspayandgetpaid.requestmanagement.domain.model.invoicemanagement.Recipient.RecipientPhoneNumber> list = this.phones;
            return (((hashCode * 31) + hashCode2) * 31) + (list != null ? list.hashCode() : 0);
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.businesspayandgetpaid.requestmanagement.domain.model.invoicemanagement.Recipient.RecipientInfo)) {
                return false;
            }
            com.paypal.oslo.feature.businesspayandgetpaid.requestmanagement.domain.model.invoicemanagement.Recipient.RecipientInfo recipientInfo = (com.paypal.oslo.feature.businesspayandgetpaid.requestmanagement.domain.model.invoicemanagement.Recipient.RecipientInfo) other;
            return kotlin.jvm.internal.Intrinsics.areEqual(this.name, recipientInfo.name) && kotlin.jvm.internal.Intrinsics.areEqual(this.emailAddress, recipientInfo.emailAddress) && kotlin.jvm.internal.Intrinsics.areEqual(this.phones, recipientInfo.phones);
        }

        public final com.paypal.oslo.feature.businesspayandgetpaid.requestmanagement.domain.model.invoicemanagement.Recipient.RecipientInfo copy(com.paypal.oslo.feature.businesspayandgetpaid.requestmanagement.domain.model.invoicemanagement.Recipient.RecipientName name2, java.lang.String emailAddress, java.util.List<com.paypal.oslo.feature.businesspayandgetpaid.requestmanagement.domain.model.invoicemanagement.Recipient.RecipientPhoneNumber> phones) {
            return new com.paypal.oslo.feature.businesspayandgetpaid.requestmanagement.domain.model.invoicemanagement.Recipient.RecipientInfo(name2, emailAddress, phones);
        }

        public final java.util.List<com.paypal.oslo.feature.businesspayandgetpaid.requestmanagement.domain.model.invoicemanagement.Recipient.RecipientPhoneNumber> component3() {
            return this.phones;
        }

        /* renamed from: component2, reason: from getter */
        public final java.lang.String getEmailAddress() {
            return this.emailAddress;
        }

        /* renamed from: component1, reason: from getter */
        public final com.paypal.oslo.feature.businesspayandgetpaid.requestmanagement.domain.model.invoicemanagement.Recipient.RecipientName getName() {
            return this.name;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ com.paypal.oslo.feature.businesspayandgetpaid.requestmanagement.domain.model.invoicemanagement.Recipient.RecipientInfo copy$default(com.paypal.oslo.feature.businesspayandgetpaid.requestmanagement.domain.model.invoicemanagement.Recipient.RecipientInfo recipientInfo, com.paypal.oslo.feature.businesspayandgetpaid.requestmanagement.domain.model.invoicemanagement.Recipient.RecipientName recipientName, java.lang.String str, java.util.List list, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                recipientName = recipientInfo.name;
            }
            if ((i & 2) != 0) {
                str = recipientInfo.emailAddress;
            }
            if ((i & 4) != 0) {
                list = recipientInfo.phones;
            }
            return recipientInfo.copy(recipientName, str, list);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0007\b\u0081\b\u0018\u0000 #2\u00020\u0001:\u0002$#B\u001b\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0005\u0010\u0006B/\b\u0010\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\n\u001a\u0004\u0018\u00010\t¢\u0006\u0004\b\u0005\u0010\u000bJ\u0012\u0010\f\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\f\u0010\rJ\u0012\u0010\u000e\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u000e\u0010\rJ(\u0010\u000f\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0002HÆ\u0001¢\u0006\u0004\b\u000f\u0010\u0010J\u001a\u0010\u0013\u001a\u00020\u00122\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0015\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\u0015\u0010\u0016J\u0010\u0010\u0017\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0017\u0010\rJ'\u0010\u001e\u001a\u00020\u001d2\u0006\u0010\u0018\u001a\u00020\u00002\u0006\u0010\u001a\u001a\u00020\u00192\u0006\u0010\u001c\u001a\u00020\u001bH\u0001¢\u0006\u0004\b\u001e\u0010\u001fR\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010 \u001a\u0004\b!\u0010\rR\u001c\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010 \u001a\u0004\b\"\u0010\r"}, d2 = {"Lcom/paypal/oslo/feature/businesspayandgetpaid/requestmanagement/domain/model/invoicemanagement/Recipient$RecipientName;", "", "", com.microblink.blinkid.entities.recognizers.blinkid.austria.AustriaCombinedRecognizer.VerificationConstants.GivenName, "surname", "<init>", "(Ljava/lang/String;Ljava/lang/String;)V", "", "seen0", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "serializationConstructorMarker", "(ILjava/lang/String;Ljava/lang/String;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", "component1", "()Ljava/lang/String;", "component2", "copy", "(Ljava/lang/String;Ljava/lang/String;)Lcom/paypal/oslo/feature/businesspayandgetpaid/requestmanagement/domain/model/invoicemanagement/Recipient$RecipientName;", "other", "", "equals", "(Ljava/lang/Object;)Z", "hashCode", "()I", "toString", "self", "Lkotlinx/serialization/encoding/CompositeEncoder;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "", "write$Self$business_pay_and_get_paid_prodRelease", "(Lcom/paypal/oslo/feature/businesspayandgetpaid/requestmanagement/domain/model/invoicemanagement/Recipient$RecipientName;Lkotlinx/serialization/encoding/CompositeEncoder;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "Ljava/lang/String;", "getGivenName", "getSurname", "Companion", "$serializer"}, k = 1, mv = {2, 3, 0}, xi = 48)
    @kotlinx.serialization.Serializable
    public static final /* data */ class RecipientName {
        public static final int $stable = 0;

        /* renamed from: Companion, reason: from kotlin metadata */
        public static final com.paypal.oslo.feature.businesspayandgetpaid.requestmanagement.domain.model.invoicemanagement.Recipient.RecipientName.Companion INSTANCE = new com.paypal.oslo.feature.businesspayandgetpaid.requestmanagement.domain.model.invoicemanagement.Recipient.RecipientName.Companion(null);
        private final java.lang.String givenName;
        private final java.lang.String surname;

        @kotlin.Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"Lcom/paypal/oslo/feature/businesspayandgetpaid/requestmanagement/domain/model/invoicemanagement/Recipient$RecipientName$Companion;", "", "<init>", "()V", "Lkotlinx/serialization/KSerializer;", "Lcom/paypal/oslo/feature/businesspayandgetpaid/requestmanagement/domain/model/invoicemanagement/Recipient$RecipientName;", "serializer", "()Lkotlinx/serialization/KSerializer;"}, k = 1, mv = {2, 3, 0}, xi = 48)
        /* loaded from: classes11.dex */
        public static final class Companion {
            private Companion() {
            }

            public final kotlinx.serialization.KSerializer<com.paypal.oslo.feature.businesspayandgetpaid.requestmanagement.domain.model.invoicemanagement.Recipient.RecipientName> serializer() {
                return com.paypal.oslo.feature.businesspayandgetpaid.requestmanagement.domain.model.invoicemanagement.Recipient$RecipientName$$serializer.INSTANCE;
            }

            public /* synthetic */ Companion(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }
        }

        public /* synthetic */ RecipientName(int i, java.lang.String str, java.lang.String str2, kotlinx.serialization.internal.SerializationConstructorMarker serializationConstructorMarker) {
            if (3 != (i & 3)) {
                kotlinx.serialization.internal.PluginExceptionsKt.throwMissingFieldException(i, 3, com.paypal.oslo.feature.businesspayandgetpaid.requestmanagement.domain.model.invoicemanagement.Recipient$RecipientName$$serializer.INSTANCE.getDescriptor());
            }
            this.givenName = str;
            this.surname = str2;
        }

        public RecipientName(java.lang.String str, java.lang.String str2) {
            this.givenName = str;
            this.surname = str2;
        }

        @kotlin.jvm.JvmStatic
        public static final /* synthetic */ void write$Self$business_pay_and_get_paid_prodRelease(com.paypal.oslo.feature.businesspayandgetpaid.requestmanagement.domain.model.invoicemanagement.Recipient.RecipientName self, kotlinx.serialization.encoding.CompositeEncoder output, kotlinx.serialization.descriptors.SerialDescriptor serialDesc) {
            output.encodeNullableSerializableElement(serialDesc, 0, kotlinx.serialization.internal.StringSerializer.INSTANCE, self.givenName);
            output.encodeNullableSerializableElement(serialDesc, 1, kotlinx.serialization.internal.StringSerializer.INSTANCE, self.surname);
        }

        public final java.lang.String getGivenName() {
            return this.givenName;
        }

        public final java.lang.String getSurname() {
            return this.surname;
        }

        public final java.lang.String toString() {
            java.lang.String str = this.givenName;
            java.lang.String str2 = this.surname;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("RecipientName(givenName=");
            sb.append(str);
            sb.append(", surname=");
            sb.append(str2);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            java.lang.String str = this.givenName;
            int hashCode = str == null ? 0 : str.hashCode();
            java.lang.String str2 = this.surname;
            return (hashCode * 31) + (str2 != null ? str2.hashCode() : 0);
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.businesspayandgetpaid.requestmanagement.domain.model.invoicemanagement.Recipient.RecipientName)) {
                return false;
            }
            com.paypal.oslo.feature.businesspayandgetpaid.requestmanagement.domain.model.invoicemanagement.Recipient.RecipientName recipientName = (com.paypal.oslo.feature.businesspayandgetpaid.requestmanagement.domain.model.invoicemanagement.Recipient.RecipientName) other;
            return kotlin.jvm.internal.Intrinsics.areEqual(this.givenName, recipientName.givenName) && kotlin.jvm.internal.Intrinsics.areEqual(this.surname, recipientName.surname);
        }

        public final com.paypal.oslo.feature.businesspayandgetpaid.requestmanagement.domain.model.invoicemanagement.Recipient.RecipientName copy(java.lang.String givenName, java.lang.String surname) {
            return new com.paypal.oslo.feature.businesspayandgetpaid.requestmanagement.domain.model.invoicemanagement.Recipient.RecipientName(givenName, surname);
        }

        /* renamed from: component2, reason: from getter */
        public final java.lang.String getSurname() {
            return this.surname;
        }

        /* renamed from: component1, reason: from getter */
        public final java.lang.String getGivenName() {
            return this.givenName;
        }

        public static /* synthetic */ com.paypal.oslo.feature.businesspayandgetpaid.requestmanagement.domain.model.invoicemanagement.Recipient.RecipientName copy$default(com.paypal.oslo.feature.businesspayandgetpaid.requestmanagement.domain.model.invoicemanagement.Recipient.RecipientName recipientName, java.lang.String str, java.lang.String str2, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                str = recipientName.givenName;
            }
            if ((i & 2) != 0) {
                str2 = recipientName.surname;
            }
            return recipientName.copy(str, str2);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0007\b\u0081\b\u0018\u0000 #2\u00020\u0001:\u0002$#B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002¢\u0006\u0004\b\u0005\u0010\u0006B/\b\u0010\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\n\u001a\u0004\u0018\u00010\t¢\u0006\u0004\b\u0005\u0010\u000bJ\u0010\u0010\f\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000e\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u000e\u0010\rJ$\u0010\u000f\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\u000f\u0010\u0010J\u001a\u0010\u0013\u001a\u00020\u00122\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0015\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\u0015\u0010\u0016J\u0010\u0010\u0017\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0017\u0010\rJ'\u0010\u001e\u001a\u00020\u001d2\u0006\u0010\u0018\u001a\u00020\u00002\u0006\u0010\u001a\u001a\u00020\u00192\u0006\u0010\u001c\u001a\u00020\u001bH\u0001¢\u0006\u0004\b\u001e\u0010\u001fR\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010 \u001a\u0004\b!\u0010\rR\u001a\u0010\u0004\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010 \u001a\u0004\b\"\u0010\r"}, d2 = {"Lcom/paypal/oslo/feature/businesspayandgetpaid/requestmanagement/domain/model/invoicemanagement/Recipient$RecipientPhoneNumber;", "", "", "countryCode", com.microblink.blinkid.entities.recognizers.blinkid.jordan.JordanCombinedRecognizer.VerificationConstants.NationalNumber, "<init>", "(Ljava/lang/String;Ljava/lang/String;)V", "", "seen0", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "serializationConstructorMarker", "(ILjava/lang/String;Ljava/lang/String;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", "component1", "()Ljava/lang/String;", "component2", "copy", "(Ljava/lang/String;Ljava/lang/String;)Lcom/paypal/oslo/feature/businesspayandgetpaid/requestmanagement/domain/model/invoicemanagement/Recipient$RecipientPhoneNumber;", "other", "", "equals", "(Ljava/lang/Object;)Z", "hashCode", "()I", "toString", "self", "Lkotlinx/serialization/encoding/CompositeEncoder;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "", "write$Self$business_pay_and_get_paid_prodRelease", "(Lcom/paypal/oslo/feature/businesspayandgetpaid/requestmanagement/domain/model/invoicemanagement/Recipient$RecipientPhoneNumber;Lkotlinx/serialization/encoding/CompositeEncoder;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "Ljava/lang/String;", "getCountryCode", "getNationalNumber", "Companion", "$serializer"}, k = 1, mv = {2, 3, 0}, xi = 48)
    @kotlinx.serialization.Serializable
    public static final /* data */ class RecipientPhoneNumber {
        public static final int $stable = 0;

        /* renamed from: Companion, reason: from kotlin metadata */
        public static final com.paypal.oslo.feature.businesspayandgetpaid.requestmanagement.domain.model.invoicemanagement.Recipient.RecipientPhoneNumber.Companion INSTANCE = new com.paypal.oslo.feature.businesspayandgetpaid.requestmanagement.domain.model.invoicemanagement.Recipient.RecipientPhoneNumber.Companion(null);
        private final java.lang.String countryCode;
        private final java.lang.String nationalNumber;

        @kotlin.Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"Lcom/paypal/oslo/feature/businesspayandgetpaid/requestmanagement/domain/model/invoicemanagement/Recipient$RecipientPhoneNumber$Companion;", "", "<init>", "()V", "Lkotlinx/serialization/KSerializer;", "Lcom/paypal/oslo/feature/businesspayandgetpaid/requestmanagement/domain/model/invoicemanagement/Recipient$RecipientPhoneNumber;", "serializer", "()Lkotlinx/serialization/KSerializer;"}, k = 1, mv = {2, 3, 0}, xi = 48)
        /* loaded from: classes11.dex */
        public static final class Companion {
            private Companion() {
            }

            public final kotlinx.serialization.KSerializer<com.paypal.oslo.feature.businesspayandgetpaid.requestmanagement.domain.model.invoicemanagement.Recipient.RecipientPhoneNumber> serializer() {
                return com.paypal.oslo.feature.businesspayandgetpaid.requestmanagement.domain.model.invoicemanagement.Recipient$RecipientPhoneNumber$$serializer.INSTANCE;
            }

            public /* synthetic */ Companion(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }
        }

        public /* synthetic */ RecipientPhoneNumber(int i, java.lang.String str, java.lang.String str2, kotlinx.serialization.internal.SerializationConstructorMarker serializationConstructorMarker) {
            if (3 != (i & 3)) {
                kotlinx.serialization.internal.PluginExceptionsKt.throwMissingFieldException(i, 3, com.paypal.oslo.feature.businesspayandgetpaid.requestmanagement.domain.model.invoicemanagement.Recipient$RecipientPhoneNumber$$serializer.INSTANCE.getDescriptor());
            }
            this.countryCode = str;
            this.nationalNumber = str2;
        }

        public RecipientPhoneNumber(java.lang.String str, java.lang.String str2) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str2, "");
            this.countryCode = str;
            this.nationalNumber = str2;
        }

        @kotlin.jvm.JvmStatic
        public static final /* synthetic */ void write$Self$business_pay_and_get_paid_prodRelease(com.paypal.oslo.feature.businesspayandgetpaid.requestmanagement.domain.model.invoicemanagement.Recipient.RecipientPhoneNumber self, kotlinx.serialization.encoding.CompositeEncoder output, kotlinx.serialization.descriptors.SerialDescriptor serialDesc) {
            output.encodeStringElement(serialDesc, 0, self.countryCode);
            output.encodeStringElement(serialDesc, 1, self.nationalNumber);
        }

        public final java.lang.String getCountryCode() {
            return this.countryCode;
        }

        public final java.lang.String getNationalNumber() {
            return this.nationalNumber;
        }

        public final java.lang.String toString() {
            java.lang.String str = this.countryCode;
            java.lang.String str2 = this.nationalNumber;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("RecipientPhoneNumber(countryCode=");
            sb.append(str);
            sb.append(", nationalNumber=");
            sb.append(str2);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            return (this.countryCode.hashCode() * 31) + this.nationalNumber.hashCode();
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.businesspayandgetpaid.requestmanagement.domain.model.invoicemanagement.Recipient.RecipientPhoneNumber)) {
                return false;
            }
            com.paypal.oslo.feature.businesspayandgetpaid.requestmanagement.domain.model.invoicemanagement.Recipient.RecipientPhoneNumber recipientPhoneNumber = (com.paypal.oslo.feature.businesspayandgetpaid.requestmanagement.domain.model.invoicemanagement.Recipient.RecipientPhoneNumber) other;
            return kotlin.jvm.internal.Intrinsics.areEqual(this.countryCode, recipientPhoneNumber.countryCode) && kotlin.jvm.internal.Intrinsics.areEqual(this.nationalNumber, recipientPhoneNumber.nationalNumber);
        }

        public final com.paypal.oslo.feature.businesspayandgetpaid.requestmanagement.domain.model.invoicemanagement.Recipient.RecipientPhoneNumber copy(java.lang.String countryCode, java.lang.String nationalNumber) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(countryCode, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(nationalNumber, "");
            return new com.paypal.oslo.feature.businesspayandgetpaid.requestmanagement.domain.model.invoicemanagement.Recipient.RecipientPhoneNumber(countryCode, nationalNumber);
        }

        /* renamed from: component2, reason: from getter */
        public final java.lang.String getNationalNumber() {
            return this.nationalNumber;
        }

        /* renamed from: component1, reason: from getter */
        public final java.lang.String getCountryCode() {
            return this.countryCode;
        }

        public static /* synthetic */ com.paypal.oslo.feature.businesspayandgetpaid.requestmanagement.domain.model.invoicemanagement.Recipient.RecipientPhoneNumber copy$default(com.paypal.oslo.feature.businesspayandgetpaid.requestmanagement.domain.model.invoicemanagement.Recipient.RecipientPhoneNumber recipientPhoneNumber, java.lang.String str, java.lang.String str2, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                str = recipientPhoneNumber.countryCode;
            }
            if ((i & 2) != 0) {
                str2 = recipientPhoneNumber.nationalNumber;
            }
            return recipientPhoneNumber.copy(str, str2);
        }
    }

    public final java.lang.String toString() {
        com.paypal.oslo.feature.businesspayandgetpaid.requestmanagement.domain.model.invoicemanagement.Recipient.RecipientInfo recipientInfo = this.billingInfo;
        java.lang.StringBuilder sb = new java.lang.StringBuilder("Recipient(billingInfo=");
        sb.append(recipientInfo);
        sb.append(")");
        return sb.toString();
    }

    public final int hashCode() {
        com.paypal.oslo.feature.businesspayandgetpaid.requestmanagement.domain.model.invoicemanagement.Recipient.RecipientInfo recipientInfo = this.billingInfo;
        if (recipientInfo == null) {
            return 0;
        }
        return recipientInfo.hashCode();
    }

    public final boolean equals(java.lang.Object other) {
        if (this == other) {
            return true;
        }
        return (other instanceof com.paypal.oslo.feature.businesspayandgetpaid.requestmanagement.domain.model.invoicemanagement.Recipient) && kotlin.jvm.internal.Intrinsics.areEqual(this.billingInfo, ((com.paypal.oslo.feature.businesspayandgetpaid.requestmanagement.domain.model.invoicemanagement.Recipient) other).billingInfo);
    }

    public final com.paypal.oslo.feature.businesspayandgetpaid.requestmanagement.domain.model.invoicemanagement.Recipient copy(com.paypal.oslo.feature.businesspayandgetpaid.requestmanagement.domain.model.invoicemanagement.Recipient.RecipientInfo billingInfo) {
        return new com.paypal.oslo.feature.businesspayandgetpaid.requestmanagement.domain.model.invoicemanagement.Recipient(billingInfo);
    }

    /* renamed from: component1, reason: from getter */
    public final com.paypal.oslo.feature.businesspayandgetpaid.requestmanagement.domain.model.invoicemanagement.Recipient.RecipientInfo getBillingInfo() {
        return this.billingInfo;
    }

    public static /* synthetic */ com.paypal.oslo.feature.businesspayandgetpaid.requestmanagement.domain.model.invoicemanagement.Recipient copy$default(com.paypal.oslo.feature.businesspayandgetpaid.requestmanagement.domain.model.invoicemanagement.Recipient recipient, com.paypal.oslo.feature.businesspayandgetpaid.requestmanagement.domain.model.invoicemanagement.Recipient.RecipientInfo recipientInfo, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            recipientInfo = recipient.billingInfo;
        }
        return recipient.copy(recipientInfo);
    }
}
