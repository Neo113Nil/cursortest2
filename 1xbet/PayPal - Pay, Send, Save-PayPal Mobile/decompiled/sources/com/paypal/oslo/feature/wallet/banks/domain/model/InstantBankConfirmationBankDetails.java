package com.paypal.oslo.feature.wallet.banks.domain.model;

@kotlin.Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0011\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0010\b\u0087\b\u0018\u0000 =2\u00020\u0001:\u0002>=Bi\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0002\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\n\u0012\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\f¢\u0006\u0004\b\u000e\u0010\u000fBu\b\u0010\u0012\u0006\u0010\u0010\u001a\u00020\n\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\t\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\n\u0012\b\u0010\r\u001a\u0004\u0018\u00010\f\u0012\b\u0010\u0012\u001a\u0004\u0018\u00010\u0011¢\u0006\u0004\b\u000e\u0010\u0013J\u0010\u0010\u0014\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0014\u0010\u0015J\u0012\u0010\u0016\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0016\u0010\u0015J\u0012\u0010\u0017\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0017\u0010\u0015J\u0010\u0010\u0018\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0018\u0010\u0015J\u0012\u0010\u0019\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0019\u0010\u0015J\u0012\u0010\u001a\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u001a\u0010\u0015J\u0012\u0010\u001b\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u001b\u0010\u0015J\u0012\u0010\u001c\u001a\u0004\u0018\u00010\nHÆ\u0003¢\u0006\u0004\b\u001c\u0010\u001dJ\u0012\u0010\u001e\u001a\u0004\u0018\u00010\fHÆ\u0003¢\u0006\u0004\b\u001e\u0010\u001fJx\u0010 \u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00022\b\b\u0002\u0010\u0006\u001a\u00020\u00022\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\n2\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\fHÆ\u0001¢\u0006\u0004\b \u0010!J\u001a\u0010$\u001a\u00020#2\b\u0010\"\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b$\u0010%J\u0010\u0010&\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b&\u0010'J\u0010\u0010(\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b(\u0010\u0015J'\u0010/\u001a\u00020.2\u0006\u0010)\u001a\u00020\u00002\u0006\u0010+\u001a\u00020*2\u0006\u0010-\u001a\u00020,H\u0001¢\u0006\u0004\b/\u00100R\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u00101\u001a\u0004\b2\u0010\u0015R\u001c\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u00101\u001a\u0004\b3\u0010\u0015R\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u00101\u001a\u0004\b4\u0010\u0015R\u001a\u0010\u0006\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u00101\u001a\u0004\b5\u0010\u0015R\u001c\u0010\u0007\u001a\u0004\u0018\u00010\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u00101\u001a\u0004\b6\u0010\u0015R\u001c\u0010\b\u001a\u0004\u0018\u00010\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\b\u00101\u001a\u0004\b7\u0010\u0015R\u001c\u0010\t\u001a\u0004\u0018\u00010\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\t\u00101\u001a\u0004\b8\u0010\u0015R\u001c\u0010\u000b\u001a\u0004\u0018\u00010\n8\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u000b\u00109\u001a\u0004\b:\u0010\u001dR\u001c\u0010\r\u001a\u0004\u0018\u00010\f8\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\r\u0010;\u001a\u0004\b<\u0010\u001f"}, d2 = {"Lcom/paypal/oslo/feature/wallet/banks/domain/model/InstantBankConfirmationBankDetails;", "", "", "bankName", "inlineLogoUrl", "primaryLogoUrl", "externalBankId", "internalInstitutionId", "institutionUrl", "countryCode", "", "rank", "Lcom/paypal/oslo/feature/wallet/banks/domain/model/IntegrationType;", com.paypal.oslo.feature.inappcheckout.domain.util.LoggerParameterKeys.INTEGRATION_TYPE_KEY, "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Lcom/paypal/oslo/feature/wallet/banks/domain/model/IntegrationType;)V", "seen0", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "serializationConstructorMarker", "(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Lcom/paypal/oslo/feature/wallet/banks/domain/model/IntegrationType;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", "component1", "()Ljava/lang/String;", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "()Ljava/lang/Integer;", "component9", "()Lcom/paypal/oslo/feature/wallet/banks/domain/model/IntegrationType;", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Lcom/paypal/oslo/feature/wallet/banks/domain/model/IntegrationType;)Lcom/paypal/oslo/feature/wallet/banks/domain/model/InstantBankConfirmationBankDetails;", "other", "", "equals", "(Ljava/lang/Object;)Z", "hashCode", "()I", "toString", "self", "Lkotlinx/serialization/encoding/CompositeEncoder;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "", "write$Self$wallet_prodRelease", "(Lcom/paypal/oslo/feature/wallet/banks/domain/model/InstantBankConfirmationBankDetails;Lkotlinx/serialization/encoding/CompositeEncoder;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "Ljava/lang/String;", "getBankName", "getInlineLogoUrl", "getPrimaryLogoUrl", "getExternalBankId", "getInternalInstitutionId", "getInstitutionUrl", "getCountryCode", "Ljava/lang/Integer;", "getRank", "Lcom/paypal/oslo/feature/wallet/banks/domain/model/IntegrationType;", "getIntegrationType", "Companion", "$serializer"}, k = 1, mv = {2, 3, 0}, xi = 48)
@kotlinx.serialization.Serializable
/* loaded from: classes2.dex */
public final /* data */ class InstantBankConfirmationBankDetails {
    public static final int $stable = 0;
    private final java.lang.String bankName;
    private final java.lang.String countryCode;
    private final java.lang.String externalBankId;
    private final java.lang.String inlineLogoUrl;
    private final java.lang.String institutionUrl;
    private final com.paypal.oslo.feature.wallet.banks.domain.model.IntegrationType integrationType;
    private final java.lang.String internalInstitutionId;
    private final java.lang.String primaryLogoUrl;
    private final java.lang.Integer rank;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final com.paypal.oslo.feature.wallet.banks.domain.model.InstantBankConfirmationBankDetails.Companion INSTANCE = new com.paypal.oslo.feature.wallet.banks.domain.model.InstantBankConfirmationBankDetails.Companion(null);
    private static final kotlin.Lazy<kotlinx.serialization.KSerializer<java.lang.Object>>[] $childSerializers = {null, null, null, null, null, null, null, null, kotlin.LazyKt.lazy(kotlin.LazyThreadSafetyMode.PUBLICATION, new kotlin.jvm.functions.Function0() { // from class: com.paypal.oslo.feature.wallet.banks.domain.model.InstantBankConfirmationBankDetails$$ExternalSyntheticLambda0
        @Override // kotlin.jvm.functions.Function0
        public final java.lang.Object invoke() {
            kotlinx.serialization.KSerializer createSimpleEnumSerializer;
            createSimpleEnumSerializer = kotlinx.serialization.internal.EnumsKt.createSimpleEnumSerializer("com.paypal.oslo.feature.wallet.banks.domain.model.IntegrationType", com.paypal.oslo.feature.wallet.banks.domain.model.IntegrationType.values());
            return createSimpleEnumSerializer;
        }
    })};

    @kotlin.Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"Lcom/paypal/oslo/feature/wallet/banks/domain/model/InstantBankConfirmationBankDetails$Companion;", "", "<init>", "()V", "Lkotlinx/serialization/KSerializer;", "Lcom/paypal/oslo/feature/wallet/banks/domain/model/InstantBankConfirmationBankDetails;", "serializer", "()Lkotlinx/serialization/KSerializer;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    /* loaded from: classes15.dex */
    public static final class Companion {
        private Companion() {
        }

        public final kotlinx.serialization.KSerializer<com.paypal.oslo.feature.wallet.banks.domain.model.InstantBankConfirmationBankDetails> serializer() {
            return com.paypal.oslo.feature.wallet.banks.domain.model.InstantBankConfirmationBankDetails$$serializer.INSTANCE;
        }

        public /* synthetic */ Companion(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public /* synthetic */ InstantBankConfirmationBankDetails(int i, java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.String str4, java.lang.String str5, java.lang.String str6, java.lang.String str7, java.lang.Integer num, com.paypal.oslo.feature.wallet.banks.domain.model.IntegrationType integrationType, kotlinx.serialization.internal.SerializationConstructorMarker serializationConstructorMarker) {
        if (7 != (i & 7)) {
            kotlinx.serialization.internal.PluginExceptionsKt.throwMissingFieldException(i, 7, com.paypal.oslo.feature.wallet.banks.domain.model.InstantBankConfirmationBankDetails$$serializer.INSTANCE.getDescriptor());
        }
        this.bankName = str;
        this.inlineLogoUrl = str2;
        this.primaryLogoUrl = str3;
        if ((i & 8) == 0) {
            this.externalBankId = "";
        } else {
            this.externalBankId = str4;
        }
        if ((i & 16) == 0) {
            this.internalInstitutionId = null;
        } else {
            this.internalInstitutionId = str5;
        }
        if ((i & 32) == 0) {
            this.institutionUrl = null;
        } else {
            this.institutionUrl = str6;
        }
        if ((i & 64) == 0) {
            this.countryCode = null;
        } else {
            this.countryCode = str7;
        }
        if ((i & 128) == 0) {
            this.rank = null;
        } else {
            this.rank = num;
        }
        if ((i & 256) == 0) {
            this.integrationType = null;
        } else {
            this.integrationType = integrationType;
        }
    }

    public InstantBankConfirmationBankDetails(java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.String str4, java.lang.String str5, java.lang.String str6, java.lang.String str7, java.lang.Integer num, com.paypal.oslo.feature.wallet.banks.domain.model.IntegrationType integrationType) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str4, "");
        this.bankName = str;
        this.inlineLogoUrl = str2;
        this.primaryLogoUrl = str3;
        this.externalBankId = str4;
        this.internalInstitutionId = str5;
        this.institutionUrl = str6;
        this.countryCode = str7;
        this.rank = num;
        this.integrationType = integrationType;
    }

    @kotlin.jvm.JvmStatic
    public static final /* synthetic */ void write$Self$wallet_prodRelease(com.paypal.oslo.feature.wallet.banks.domain.model.InstantBankConfirmationBankDetails self, kotlinx.serialization.encoding.CompositeEncoder output, kotlinx.serialization.descriptors.SerialDescriptor serialDesc) {
        kotlin.Lazy<kotlinx.serialization.KSerializer<java.lang.Object>>[] lazyArr = $childSerializers;
        output.encodeStringElement(serialDesc, 0, self.bankName);
        output.encodeNullableSerializableElement(serialDesc, 1, kotlinx.serialization.internal.StringSerializer.INSTANCE, self.inlineLogoUrl);
        output.encodeNullableSerializableElement(serialDesc, 2, kotlinx.serialization.internal.StringSerializer.INSTANCE, self.primaryLogoUrl);
        if (output.shouldEncodeElementDefault(serialDesc, 3) || !kotlin.jvm.internal.Intrinsics.areEqual(self.externalBankId, "")) {
            output.encodeStringElement(serialDesc, 3, self.externalBankId);
        }
        if (output.shouldEncodeElementDefault(serialDesc, 4) || self.internalInstitutionId != null) {
            output.encodeNullableSerializableElement(serialDesc, 4, kotlinx.serialization.internal.StringSerializer.INSTANCE, self.internalInstitutionId);
        }
        if (output.shouldEncodeElementDefault(serialDesc, 5) || self.institutionUrl != null) {
            output.encodeNullableSerializableElement(serialDesc, 5, kotlinx.serialization.internal.StringSerializer.INSTANCE, self.institutionUrl);
        }
        if (output.shouldEncodeElementDefault(serialDesc, 6) || self.countryCode != null) {
            output.encodeNullableSerializableElement(serialDesc, 6, kotlinx.serialization.internal.StringSerializer.INSTANCE, self.countryCode);
        }
        if (output.shouldEncodeElementDefault(serialDesc, 7) || self.rank != null) {
            output.encodeNullableSerializableElement(serialDesc, 7, kotlinx.serialization.internal.IntSerializer.INSTANCE, self.rank);
        }
        if (output.shouldEncodeElementDefault(serialDesc, 8) || self.integrationType != null) {
            output.encodeNullableSerializableElement(serialDesc, 8, lazyArr[8].getValue(), self.integrationType);
        }
    }

    public final java.lang.String getBankName() {
        return this.bankName;
    }

    public final java.lang.String getInlineLogoUrl() {
        return this.inlineLogoUrl;
    }

    public final java.lang.String getPrimaryLogoUrl() {
        return this.primaryLogoUrl;
    }

    public /* synthetic */ InstantBankConfirmationBankDetails(java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.String str4, java.lang.String str5, java.lang.String str6, java.lang.String str7, java.lang.Integer num, com.paypal.oslo.feature.wallet.banks.domain.model.IntegrationType integrationType, int i, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this(str, str2, str3, (i & 8) != 0 ? "" : str4, (i & 16) != 0 ? null : str5, (i & 32) != 0 ? null : str6, (i & 64) != 0 ? null : str7, (i & 128) != 0 ? null : num, (i & 256) != 0 ? null : integrationType);
    }

    public final java.lang.String getExternalBankId() {
        return this.externalBankId;
    }

    public final java.lang.String getInternalInstitutionId() {
        return this.internalInstitutionId;
    }

    public final java.lang.String getInstitutionUrl() {
        return this.institutionUrl;
    }

    public final java.lang.String getCountryCode() {
        return this.countryCode;
    }

    public final java.lang.Integer getRank() {
        return this.rank;
    }

    public final com.paypal.oslo.feature.wallet.banks.domain.model.IntegrationType getIntegrationType() {
        return this.integrationType;
    }

    public final java.lang.String toString() {
        java.lang.String str = this.bankName;
        java.lang.String str2 = this.inlineLogoUrl;
        java.lang.String str3 = this.primaryLogoUrl;
        java.lang.String str4 = this.externalBankId;
        java.lang.String str5 = this.internalInstitutionId;
        java.lang.String str6 = this.institutionUrl;
        java.lang.String str7 = this.countryCode;
        java.lang.Integer num = this.rank;
        com.paypal.oslo.feature.wallet.banks.domain.model.IntegrationType integrationType = this.integrationType;
        java.lang.StringBuilder sb = new java.lang.StringBuilder("InstantBankConfirmationBankDetails(bankName=");
        sb.append(str);
        sb.append(", inlineLogoUrl=");
        sb.append(str2);
        sb.append(", primaryLogoUrl=");
        sb.append(str3);
        sb.append(", externalBankId=");
        sb.append(str4);
        sb.append(", internalInstitutionId=");
        sb.append(str5);
        sb.append(", institutionUrl=");
        sb.append(str6);
        sb.append(", countryCode=");
        sb.append(str7);
        sb.append(", rank=");
        sb.append(num);
        sb.append(", integrationType=");
        sb.append(integrationType);
        sb.append(")");
        return sb.toString();
    }

    public final int hashCode() {
        int hashCode = this.bankName.hashCode();
        java.lang.String str = this.inlineLogoUrl;
        int hashCode2 = str == null ? 0 : str.hashCode();
        java.lang.String str2 = this.primaryLogoUrl;
        int hashCode3 = str2 == null ? 0 : str2.hashCode();
        int hashCode4 = this.externalBankId.hashCode();
        java.lang.String str3 = this.internalInstitutionId;
        int hashCode5 = str3 == null ? 0 : str3.hashCode();
        java.lang.String str4 = this.institutionUrl;
        int hashCode6 = str4 == null ? 0 : str4.hashCode();
        java.lang.String str5 = this.countryCode;
        int hashCode7 = str5 == null ? 0 : str5.hashCode();
        java.lang.Integer num = this.rank;
        int hashCode8 = num == null ? 0 : num.hashCode();
        com.paypal.oslo.feature.wallet.banks.domain.model.IntegrationType integrationType = this.integrationType;
        return (((((((((((((((hashCode * 31) + hashCode2) * 31) + hashCode3) * 31) + hashCode4) * 31) + hashCode5) * 31) + hashCode6) * 31) + hashCode7) * 31) + hashCode8) * 31) + (integrationType != null ? integrationType.hashCode() : 0);
    }

    public final boolean equals(java.lang.Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof com.paypal.oslo.feature.wallet.banks.domain.model.InstantBankConfirmationBankDetails)) {
            return false;
        }
        com.paypal.oslo.feature.wallet.banks.domain.model.InstantBankConfirmationBankDetails instantBankConfirmationBankDetails = (com.paypal.oslo.feature.wallet.banks.domain.model.InstantBankConfirmationBankDetails) other;
        return kotlin.jvm.internal.Intrinsics.areEqual(this.bankName, instantBankConfirmationBankDetails.bankName) && kotlin.jvm.internal.Intrinsics.areEqual(this.inlineLogoUrl, instantBankConfirmationBankDetails.inlineLogoUrl) && kotlin.jvm.internal.Intrinsics.areEqual(this.primaryLogoUrl, instantBankConfirmationBankDetails.primaryLogoUrl) && kotlin.jvm.internal.Intrinsics.areEqual(this.externalBankId, instantBankConfirmationBankDetails.externalBankId) && kotlin.jvm.internal.Intrinsics.areEqual(this.internalInstitutionId, instantBankConfirmationBankDetails.internalInstitutionId) && kotlin.jvm.internal.Intrinsics.areEqual(this.institutionUrl, instantBankConfirmationBankDetails.institutionUrl) && kotlin.jvm.internal.Intrinsics.areEqual(this.countryCode, instantBankConfirmationBankDetails.countryCode) && kotlin.jvm.internal.Intrinsics.areEqual(this.rank, instantBankConfirmationBankDetails.rank) && this.integrationType == instantBankConfirmationBankDetails.integrationType;
    }

    public final com.paypal.oslo.feature.wallet.banks.domain.model.InstantBankConfirmationBankDetails copy(java.lang.String bankName, java.lang.String inlineLogoUrl, java.lang.String primaryLogoUrl, java.lang.String externalBankId, java.lang.String internalInstitutionId, java.lang.String institutionUrl, java.lang.String countryCode, java.lang.Integer rank, com.paypal.oslo.feature.wallet.banks.domain.model.IntegrationType integrationType) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(bankName, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(externalBankId, "");
        return new com.paypal.oslo.feature.wallet.banks.domain.model.InstantBankConfirmationBankDetails(bankName, inlineLogoUrl, primaryLogoUrl, externalBankId, internalInstitutionId, institutionUrl, countryCode, rank, integrationType);
    }

    /* renamed from: component9, reason: from getter */
    public final com.paypal.oslo.feature.wallet.banks.domain.model.IntegrationType getIntegrationType() {
        return this.integrationType;
    }

    /* renamed from: component8, reason: from getter */
    public final java.lang.Integer getRank() {
        return this.rank;
    }

    /* renamed from: component7, reason: from getter */
    public final java.lang.String getCountryCode() {
        return this.countryCode;
    }

    /* renamed from: component6, reason: from getter */
    public final java.lang.String getInstitutionUrl() {
        return this.institutionUrl;
    }

    /* renamed from: component5, reason: from getter */
    public final java.lang.String getInternalInstitutionId() {
        return this.internalInstitutionId;
    }

    /* renamed from: component4, reason: from getter */
    public final java.lang.String getExternalBankId() {
        return this.externalBankId;
    }

    /* renamed from: component3, reason: from getter */
    public final java.lang.String getPrimaryLogoUrl() {
        return this.primaryLogoUrl;
    }

    /* renamed from: component2, reason: from getter */
    public final java.lang.String getInlineLogoUrl() {
        return this.inlineLogoUrl;
    }

    /* renamed from: component1, reason: from getter */
    public final java.lang.String getBankName() {
        return this.bankName;
    }
}
