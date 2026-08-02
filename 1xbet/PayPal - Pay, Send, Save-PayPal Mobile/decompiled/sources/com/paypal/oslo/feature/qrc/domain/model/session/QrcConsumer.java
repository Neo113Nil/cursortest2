package com.paypal.oslo.feature.qrc.domain.model.session;

@kotlin.Metadata(d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u000e\b\u0081\b\u0018\u0000 82\u00020\u0001:\u000298B[\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\f\u0010\rBa\b\u0010\u0012\u0006\u0010\u000f\u001a\u00020\u000e\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\t\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0011\u001a\u0004\u0018\u00010\u0010¢\u0006\u0004\b\f\u0010\u0012J\u0012\u0010\u0013\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0013\u0010\u0014J\u0012\u0010\u0015\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b\u0015\u0010\u0016J\u0012\u0010\u0017\u001a\u0004\u0018\u00010\u0006HÆ\u0003¢\u0006\u0004\b\u0017\u0010\u0018J\u0012\u0010\u0019\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0019\u0010\u0014J\u0012\u0010\u001a\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u001a\u0010\u0014J\u0012\u0010\u001b\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u001b\u0010\u0014J\u0012\u0010\u001c\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u001c\u0010\u0014Jd\u0010\u001d\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u0002HÆ\u0001¢\u0006\u0004\b\u001d\u0010\u001eJ\u001a\u0010!\u001a\u00020 2\b\u0010\u001f\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b!\u0010\"J\u0010\u0010#\u001a\u00020\u000eHÖ\u0001¢\u0006\u0004\b#\u0010$J\u0010\u0010%\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b%\u0010\u0014J'\u0010,\u001a\u00020+2\u0006\u0010&\u001a\u00020\u00002\u0006\u0010(\u001a\u00020'2\u0006\u0010*\u001a\u00020)H\u0001¢\u0006\u0004\b,\u0010-R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010.\u001a\u0004\b/\u0010\u0014R\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u00100\u001a\u0004\b1\u0010\u0016R\u001c\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u00102\u001a\u0004\b3\u0010\u0018R\u001c\u0010\b\u001a\u0004\u0018\u00010\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\b\u0010.\u001a\u0004\b4\u0010\u0014R\u001c\u0010\t\u001a\u0004\u0018\u00010\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\t\u0010.\u001a\u0004\b5\u0010\u0014R\u001c\u0010\n\u001a\u0004\u0018\u00010\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\n\u0010.\u001a\u0004\b6\u0010\u0014R\u001c\u0010\u000b\u001a\u0004\u0018\u00010\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u000b\u0010.\u001a\u0004\b7\u0010\u0014"}, d2 = {"Lcom/paypal/oslo/feature/qrc/domain/model/session/QrcConsumer;", "", "", "accountId", "Lcom/paypal/oslo/feature/qrc/domain/model/session/QrcPersonName;", "name", "Lcom/paypal/oslo/feature/qrc/domain/model/session/Address;", "address", "email", "tenantName", "externalId", "countryCode", "<init>", "(Ljava/lang/String;Lcom/paypal/oslo/feature/qrc/domain/model/session/QrcPersonName;Lcom/paypal/oslo/feature/qrc/domain/model/session/Address;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "", "seen0", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "serializationConstructorMarker", "(ILjava/lang/String;Lcom/paypal/oslo/feature/qrc/domain/model/session/QrcPersonName;Lcom/paypal/oslo/feature/qrc/domain/model/session/Address;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", "component1", "()Ljava/lang/String;", "component2", "()Lcom/paypal/oslo/feature/qrc/domain/model/session/QrcPersonName;", "component3", "()Lcom/paypal/oslo/feature/qrc/domain/model/session/Address;", "component4", "component5", "component6", "component7", "copy", "(Ljava/lang/String;Lcom/paypal/oslo/feature/qrc/domain/model/session/QrcPersonName;Lcom/paypal/oslo/feature/qrc/domain/model/session/Address;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lcom/paypal/oslo/feature/qrc/domain/model/session/QrcConsumer;", "other", "", "equals", "(Ljava/lang/Object;)Z", "hashCode", "()I", "toString", "self", "Lkotlinx/serialization/encoding/CompositeEncoder;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "", "write$Self$qrc_prodRelease", "(Lcom/paypal/oslo/feature/qrc/domain/model/session/QrcConsumer;Lkotlinx/serialization/encoding/CompositeEncoder;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "Ljava/lang/String;", "getAccountId", "Lcom/paypal/oslo/feature/qrc/domain/model/session/QrcPersonName;", "getName", "Lcom/paypal/oslo/feature/qrc/domain/model/session/Address;", "getAddress", "getEmail", "getTenantName", "getExternalId", "getCountryCode", "Companion", "$serializer"}, k = 1, mv = {2, 3, 0}, xi = 48)
@kotlinx.serialization.Serializable
/* loaded from: classes2.dex */
public final /* data */ class QrcConsumer {
    public static final int $stable = 0;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final com.paypal.oslo.feature.qrc.domain.model.session.QrcConsumer.Companion INSTANCE = new com.paypal.oslo.feature.qrc.domain.model.session.QrcConsumer.Companion(null);
    private final java.lang.String accountId;
    private final com.paypal.oslo.feature.qrc.domain.model.session.Address address;
    private final java.lang.String countryCode;
    private final java.lang.String email;
    private final java.lang.String externalId;
    private final com.paypal.oslo.feature.qrc.domain.model.session.QrcPersonName name;
    private final java.lang.String tenantName;

    @kotlin.Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"Lcom/paypal/oslo/feature/qrc/domain/model/session/QrcConsumer$Companion;", "", "<init>", "()V", "Lkotlinx/serialization/KSerializer;", "Lcom/paypal/oslo/feature/qrc/domain/model/session/QrcConsumer;", "serializer", "()Lkotlinx/serialization/KSerializer;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    /* loaded from: classes14.dex */
    public static final class Companion {
        private Companion() {
        }

        public final kotlinx.serialization.KSerializer<com.paypal.oslo.feature.qrc.domain.model.session.QrcConsumer> serializer() {
            return com.paypal.oslo.feature.qrc.domain.model.session.QrcConsumer$$serializer.INSTANCE;
        }

        public /* synthetic */ Companion(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public /* synthetic */ QrcConsumer(int i, java.lang.String str, com.paypal.oslo.feature.qrc.domain.model.session.QrcPersonName qrcPersonName, com.paypal.oslo.feature.qrc.domain.model.session.Address address, java.lang.String str2, java.lang.String str3, java.lang.String str4, java.lang.String str5, kotlinx.serialization.internal.SerializationConstructorMarker serializationConstructorMarker) {
        if ((i & 1) == 0) {
            this.accountId = null;
        } else {
            this.accountId = str;
        }
        if ((i & 2) == 0) {
            this.name = null;
        } else {
            this.name = qrcPersonName;
        }
        if ((i & 4) == 0) {
            this.address = null;
        } else {
            this.address = address;
        }
        if ((i & 8) == 0) {
            this.email = null;
        } else {
            this.email = str2;
        }
        if ((i & 16) == 0) {
            this.tenantName = null;
        } else {
            this.tenantName = str3;
        }
        if ((i & 32) == 0) {
            this.externalId = null;
        } else {
            this.externalId = str4;
        }
        if ((i & 64) == 0) {
            this.countryCode = null;
        } else {
            this.countryCode = str5;
        }
    }

    public QrcConsumer(java.lang.String str, com.paypal.oslo.feature.qrc.domain.model.session.QrcPersonName qrcPersonName, com.paypal.oslo.feature.qrc.domain.model.session.Address address, java.lang.String str2, java.lang.String str3, java.lang.String str4, java.lang.String str5) {
        this.accountId = str;
        this.name = qrcPersonName;
        this.address = address;
        this.email = str2;
        this.tenantName = str3;
        this.externalId = str4;
        this.countryCode = str5;
    }

    @kotlin.jvm.JvmStatic
    public static final /* synthetic */ void write$Self$qrc_prodRelease(com.paypal.oslo.feature.qrc.domain.model.session.QrcConsumer self, kotlinx.serialization.encoding.CompositeEncoder output, kotlinx.serialization.descriptors.SerialDescriptor serialDesc) {
        if (output.shouldEncodeElementDefault(serialDesc, 0) || self.accountId != null) {
            output.encodeNullableSerializableElement(serialDesc, 0, kotlinx.serialization.internal.StringSerializer.INSTANCE, self.accountId);
        }
        if (output.shouldEncodeElementDefault(serialDesc, 1) || self.name != null) {
            output.encodeNullableSerializableElement(serialDesc, 1, com.paypal.oslo.feature.qrc.domain.model.session.QrcPersonName$$serializer.INSTANCE, self.name);
        }
        if (output.shouldEncodeElementDefault(serialDesc, 2) || self.address != null) {
            output.encodeNullableSerializableElement(serialDesc, 2, com.paypal.oslo.feature.qrc.domain.model.session.Address$$serializer.INSTANCE, self.address);
        }
        if (output.shouldEncodeElementDefault(serialDesc, 3) || self.email != null) {
            output.encodeNullableSerializableElement(serialDesc, 3, kotlinx.serialization.internal.StringSerializer.INSTANCE, self.email);
        }
        if (output.shouldEncodeElementDefault(serialDesc, 4) || self.tenantName != null) {
            output.encodeNullableSerializableElement(serialDesc, 4, kotlinx.serialization.internal.StringSerializer.INSTANCE, self.tenantName);
        }
        if (output.shouldEncodeElementDefault(serialDesc, 5) || self.externalId != null) {
            output.encodeNullableSerializableElement(serialDesc, 5, kotlinx.serialization.internal.StringSerializer.INSTANCE, self.externalId);
        }
        if (output.shouldEncodeElementDefault(serialDesc, 6) || self.countryCode != null) {
            output.encodeNullableSerializableElement(serialDesc, 6, kotlinx.serialization.internal.StringSerializer.INSTANCE, self.countryCode);
        }
    }

    public /* synthetic */ QrcConsumer(java.lang.String str, com.paypal.oslo.feature.qrc.domain.model.session.QrcPersonName qrcPersonName, com.paypal.oslo.feature.qrc.domain.model.session.Address address, java.lang.String str2, java.lang.String str3, java.lang.String str4, java.lang.String str5, int i, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : qrcPersonName, (i & 4) != 0 ? null : address, (i & 8) != 0 ? null : str2, (i & 16) != 0 ? null : str3, (i & 32) != 0 ? null : str4, (i & 64) != 0 ? null : str5);
    }

    public final java.lang.String getAccountId() {
        return this.accountId;
    }

    public final com.paypal.oslo.feature.qrc.domain.model.session.QrcPersonName getName() {
        return this.name;
    }

    public final com.paypal.oslo.feature.qrc.domain.model.session.Address getAddress() {
        return this.address;
    }

    public final java.lang.String getEmail() {
        return this.email;
    }

    public final java.lang.String getTenantName() {
        return this.tenantName;
    }

    public final java.lang.String getExternalId() {
        return this.externalId;
    }

    public final java.lang.String getCountryCode() {
        return this.countryCode;
    }

    public final java.lang.String toString() {
        java.lang.String str = this.accountId;
        com.paypal.oslo.feature.qrc.domain.model.session.QrcPersonName qrcPersonName = this.name;
        com.paypal.oslo.feature.qrc.domain.model.session.Address address = this.address;
        java.lang.String str2 = this.email;
        java.lang.String str3 = this.tenantName;
        java.lang.String str4 = this.externalId;
        java.lang.String str5 = this.countryCode;
        java.lang.StringBuilder sb = new java.lang.StringBuilder("QrcConsumer(accountId=");
        sb.append(str);
        sb.append(", name=");
        sb.append(qrcPersonName);
        sb.append(", address=");
        sb.append(address);
        sb.append(", email=");
        sb.append(str2);
        sb.append(", tenantName=");
        sb.append(str3);
        sb.append(", externalId=");
        sb.append(str4);
        sb.append(", countryCode=");
        sb.append(str5);
        sb.append(")");
        return sb.toString();
    }

    public final int hashCode() {
        java.lang.String str = this.accountId;
        int hashCode = str == null ? 0 : str.hashCode();
        com.paypal.oslo.feature.qrc.domain.model.session.QrcPersonName qrcPersonName = this.name;
        int hashCode2 = qrcPersonName == null ? 0 : qrcPersonName.hashCode();
        com.paypal.oslo.feature.qrc.domain.model.session.Address address = this.address;
        int hashCode3 = address == null ? 0 : address.hashCode();
        java.lang.String str2 = this.email;
        int hashCode4 = str2 == null ? 0 : str2.hashCode();
        java.lang.String str3 = this.tenantName;
        int hashCode5 = str3 == null ? 0 : str3.hashCode();
        java.lang.String str4 = this.externalId;
        int hashCode6 = str4 == null ? 0 : str4.hashCode();
        java.lang.String str5 = this.countryCode;
        return (((((((((((hashCode * 31) + hashCode2) * 31) + hashCode3) * 31) + hashCode4) * 31) + hashCode5) * 31) + hashCode6) * 31) + (str5 != null ? str5.hashCode() : 0);
    }

    public final boolean equals(java.lang.Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof com.paypal.oslo.feature.qrc.domain.model.session.QrcConsumer)) {
            return false;
        }
        com.paypal.oslo.feature.qrc.domain.model.session.QrcConsumer qrcConsumer = (com.paypal.oslo.feature.qrc.domain.model.session.QrcConsumer) other;
        return kotlin.jvm.internal.Intrinsics.areEqual(this.accountId, qrcConsumer.accountId) && kotlin.jvm.internal.Intrinsics.areEqual(this.name, qrcConsumer.name) && kotlin.jvm.internal.Intrinsics.areEqual(this.address, qrcConsumer.address) && kotlin.jvm.internal.Intrinsics.areEqual(this.email, qrcConsumer.email) && kotlin.jvm.internal.Intrinsics.areEqual(this.tenantName, qrcConsumer.tenantName) && kotlin.jvm.internal.Intrinsics.areEqual(this.externalId, qrcConsumer.externalId) && kotlin.jvm.internal.Intrinsics.areEqual(this.countryCode, qrcConsumer.countryCode);
    }

    public final com.paypal.oslo.feature.qrc.domain.model.session.QrcConsumer copy(java.lang.String accountId, com.paypal.oslo.feature.qrc.domain.model.session.QrcPersonName name2, com.paypal.oslo.feature.qrc.domain.model.session.Address address, java.lang.String email, java.lang.String tenantName, java.lang.String externalId, java.lang.String countryCode) {
        return new com.paypal.oslo.feature.qrc.domain.model.session.QrcConsumer(accountId, name2, address, email, tenantName, externalId, countryCode);
    }

    /* renamed from: component7, reason: from getter */
    public final java.lang.String getCountryCode() {
        return this.countryCode;
    }

    /* renamed from: component6, reason: from getter */
    public final java.lang.String getExternalId() {
        return this.externalId;
    }

    /* renamed from: component5, reason: from getter */
    public final java.lang.String getTenantName() {
        return this.tenantName;
    }

    /* renamed from: component4, reason: from getter */
    public final java.lang.String getEmail() {
        return this.email;
    }

    /* renamed from: component3, reason: from getter */
    public final com.paypal.oslo.feature.qrc.domain.model.session.Address getAddress() {
        return this.address;
    }

    /* renamed from: component2, reason: from getter */
    public final com.paypal.oslo.feature.qrc.domain.model.session.QrcPersonName getName() {
        return this.name;
    }

    /* renamed from: component1, reason: from getter */
    public final java.lang.String getAccountId() {
        return this.accountId;
    }

    public static /* synthetic */ com.paypal.oslo.feature.qrc.domain.model.session.QrcConsumer copy$default(com.paypal.oslo.feature.qrc.domain.model.session.QrcConsumer qrcConsumer, java.lang.String str, com.paypal.oslo.feature.qrc.domain.model.session.QrcPersonName qrcPersonName, com.paypal.oslo.feature.qrc.domain.model.session.Address address, java.lang.String str2, java.lang.String str3, java.lang.String str4, java.lang.String str5, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            str = qrcConsumer.accountId;
        }
        if ((i & 2) != 0) {
            qrcPersonName = qrcConsumer.name;
        }
        com.paypal.oslo.feature.qrc.domain.model.session.QrcPersonName qrcPersonName2 = qrcPersonName;
        if ((i & 4) != 0) {
            address = qrcConsumer.address;
        }
        com.paypal.oslo.feature.qrc.domain.model.session.Address address2 = address;
        if ((i & 8) != 0) {
            str2 = qrcConsumer.email;
        }
        java.lang.String str6 = str2;
        if ((i & 16) != 0) {
            str3 = qrcConsumer.tenantName;
        }
        java.lang.String str7 = str3;
        if ((i & 32) != 0) {
            str4 = qrcConsumer.externalId;
        }
        java.lang.String str8 = str4;
        if ((i & 64) != 0) {
            str5 = qrcConsumer.countryCode;
        }
        return qrcConsumer.copy(str, qrcPersonName2, address2, str6, str7, str8, str5);
    }

    public QrcConsumer() {
        this((java.lang.String) null, (com.paypal.oslo.feature.qrc.domain.model.session.QrcPersonName) null, (com.paypal.oslo.feature.qrc.domain.model.session.Address) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, 127, (kotlin.jvm.internal.DefaultConstructorMarker) null);
    }
}
