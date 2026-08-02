package com.paypal.oslo.feature.revolvingcreditservicing.domain.model.managecard;

@kotlin.Metadata(d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0011\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0010\b\u0081\b\u0018\u0000 >2\u00020\u0001:\u0002?>BM\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0002\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\n\u001a\u0004\u0018\u00010\t\u0012\u0006\u0010\u000b\u001a\u00020\u0002\u0012\b\u0010\r\u001a\u0004\u0018\u00010\f¢\u0006\u0004\b\u000e\u0010\u000fBk\b\u0010\u0012\u0006\u0010\u0011\u001a\u00020\u0010\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\n\u001a\u0004\u0018\u00010\t\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\r\u001a\u0004\u0018\u00010\f\u0012\b\u0010\u0013\u001a\u0004\u0018\u00010\u0012¢\u0006\u0004\b\u000e\u0010\u0014J\u0010\u0010\u0015\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0015\u0010\u0016J\u0010\u0010\u0017\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0017\u0010\u0016J\u0010\u0010\u0018\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0018\u0010\u0016J\u0010\u0010\u0019\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0019\u0010\u0016J\u0012\u0010\u001a\u001a\u0004\u0018\u00010\u0007HÆ\u0003¢\u0006\u0004\b\u001a\u0010\u001bJ\u0012\u0010\u001c\u001a\u0004\u0018\u00010\tHÆ\u0003¢\u0006\u0004\b\u001c\u0010\u001dJ\u0010\u0010\u001e\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u001e\u0010\u0016J\u0012\u0010\u001f\u001a\u0004\u0018\u00010\fHÆ\u0003¢\u0006\u0004\b\u001f\u0010 Jf\u0010!\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00022\b\b\u0002\u0010\u0006\u001a\u00020\u00022\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\t2\b\b\u0002\u0010\u000b\u001a\u00020\u00022\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\fHÆ\u0001¢\u0006\u0004\b!\u0010\"J\u001a\u0010%\u001a\u00020$2\b\u0010#\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b%\u0010&J\u0010\u0010'\u001a\u00020\u0010HÖ\u0001¢\u0006\u0004\b'\u0010(J\u0010\u0010)\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b)\u0010\u0016J'\u00100\u001a\u00020/2\u0006\u0010*\u001a\u00020\u00002\u0006\u0010,\u001a\u00020+2\u0006\u0010.\u001a\u00020-H\u0001¢\u0006\u0004\b0\u00101R\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u00102\u001a\u0004\b3\u0010\u0016R\u001a\u0010\u0004\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u00102\u001a\u0004\b4\u0010\u0016R\u001a\u0010\u0005\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u00102\u001a\u0004\b5\u0010\u0016R\u001a\u0010\u0006\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u00102\u001a\u0004\b6\u0010\u0016R\u001c\u0010\b\u001a\u0004\u0018\u00010\u00078\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\b\u00107\u001a\u0004\b8\u0010\u001bR\u001c\u0010\n\u001a\u0004\u0018\u00010\t8\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\n\u00109\u001a\u0004\b:\u0010\u001dR\u001a\u0010\u000b\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u000b\u00102\u001a\u0004\b;\u0010\u0016R\u001c\u0010\r\u001a\u0004\u0018\u00010\f8\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\r\u0010<\u001a\u0004\b=\u0010 "}, d2 = {"Lcom/paypal/oslo/feature/revolvingcreditservicing/domain/model/managecard/PushToWalletProvisioningData;", "", "", "cardNickname", "creditAccountId", com.microblink.blinkid.entities.recognizers.blinkid.austria.AustriaCombinedRecognizer.VerificationConstants.GivenName, "surName", "Lcom/paypal/oslo/feature/revolvingcreditservicing/domain/model/common/cards/CardNetwork;", "cardNetwork", "Lcom/paypal/oslo/feature/revolvingcreditservicing/domain/model/common/cards/TokenServiceProvider;", "tokenServiceProvider", "lastDigits", "Lcom/paypal/oslo/feature/revolvingcreditservicing/domain/model/common/profiles/CustomerProfileDetails;", "customerProfileDetails", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/paypal/oslo/feature/revolvingcreditservicing/domain/model/common/cards/CardNetwork;Lcom/paypal/oslo/feature/revolvingcreditservicing/domain/model/common/cards/TokenServiceProvider;Ljava/lang/String;Lcom/paypal/oslo/feature/revolvingcreditservicing/domain/model/common/profiles/CustomerProfileDetails;)V", "", "seen0", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "serializationConstructorMarker", "(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/paypal/oslo/feature/revolvingcreditservicing/domain/model/common/cards/CardNetwork;Lcom/paypal/oslo/feature/revolvingcreditservicing/domain/model/common/cards/TokenServiceProvider;Ljava/lang/String;Lcom/paypal/oslo/feature/revolvingcreditservicing/domain/model/common/profiles/CustomerProfileDetails;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", "component1", "()Ljava/lang/String;", "component2", "component3", "component4", "component5", "()Lcom/paypal/oslo/feature/revolvingcreditservicing/domain/model/common/cards/CardNetwork;", "component6", "()Lcom/paypal/oslo/feature/revolvingcreditservicing/domain/model/common/cards/TokenServiceProvider;", "component7", "component8", "()Lcom/paypal/oslo/feature/revolvingcreditservicing/domain/model/common/profiles/CustomerProfileDetails;", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/paypal/oslo/feature/revolvingcreditservicing/domain/model/common/cards/CardNetwork;Lcom/paypal/oslo/feature/revolvingcreditservicing/domain/model/common/cards/TokenServiceProvider;Ljava/lang/String;Lcom/paypal/oslo/feature/revolvingcreditservicing/domain/model/common/profiles/CustomerProfileDetails;)Lcom/paypal/oslo/feature/revolvingcreditservicing/domain/model/managecard/PushToWalletProvisioningData;", "other", "", "equals", "(Ljava/lang/Object;)Z", "hashCode", "()I", "toString", "self", "Lkotlinx/serialization/encoding/CompositeEncoder;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "", "write$Self$revolvingcredit_servicing_prodRelease", "(Lcom/paypal/oslo/feature/revolvingcreditservicing/domain/model/managecard/PushToWalletProvisioningData;Lkotlinx/serialization/encoding/CompositeEncoder;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "Ljava/lang/String;", "getCardNickname", "getCreditAccountId", "getGivenName", "getSurName", "Lcom/paypal/oslo/feature/revolvingcreditservicing/domain/model/common/cards/CardNetwork;", "getCardNetwork", "Lcom/paypal/oslo/feature/revolvingcreditservicing/domain/model/common/cards/TokenServiceProvider;", "getTokenServiceProvider", "getLastDigits", "Lcom/paypal/oslo/feature/revolvingcreditservicing/domain/model/common/profiles/CustomerProfileDetails;", "getCustomerProfileDetails", "Companion", "$serializer"}, k = 1, mv = {2, 3, 0}, xi = 48)
@kotlinx.serialization.Serializable
/* loaded from: classes2.dex */
public final /* data */ class PushToWalletProvisioningData {
    private final com.paypal.oslo.feature.revolvingcreditservicing.domain.model.common.cards.CardNetwork cardNetwork;
    private final java.lang.String cardNickname;
    private final java.lang.String creditAccountId;
    private final com.paypal.oslo.feature.revolvingcreditservicing.domain.model.common.profiles.CustomerProfileDetails customerProfileDetails;
    private final java.lang.String givenName;
    private final java.lang.String lastDigits;
    private final java.lang.String surName;
    private final com.paypal.oslo.feature.revolvingcreditservicing.domain.model.common.cards.TokenServiceProvider tokenServiceProvider;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final com.paypal.oslo.feature.revolvingcreditservicing.domain.model.managecard.PushToWalletProvisioningData.Companion INSTANCE = new com.paypal.oslo.feature.revolvingcreditservicing.domain.model.managecard.PushToWalletProvisioningData.Companion(null);
    public static final int $stable = 8;
    private static final kotlin.Lazy<kotlinx.serialization.KSerializer<java.lang.Object>>[] $childSerializers = {null, null, null, null, kotlin.LazyKt.lazy(kotlin.LazyThreadSafetyMode.PUBLICATION, new kotlin.jvm.functions.Function0() { // from class: com.paypal.oslo.feature.revolvingcreditservicing.domain.model.managecard.PushToWalletProvisioningData$$ExternalSyntheticLambda0
        @Override // kotlin.jvm.functions.Function0
        public final java.lang.Object invoke() {
            kotlinx.serialization.KSerializer createSimpleEnumSerializer;
            createSimpleEnumSerializer = kotlinx.serialization.internal.EnumsKt.createSimpleEnumSerializer("com.paypal.oslo.feature.revolvingcreditservicing.domain.model.common.cards.CardNetwork", com.paypal.oslo.feature.revolvingcreditservicing.domain.model.common.cards.CardNetwork.values());
            return createSimpleEnumSerializer;
        }
    }), kotlin.LazyKt.lazy(kotlin.LazyThreadSafetyMode.PUBLICATION, new kotlin.jvm.functions.Function0() { // from class: com.paypal.oslo.feature.revolvingcreditservicing.domain.model.managecard.PushToWalletProvisioningData$$ExternalSyntheticLambda1
        @Override // kotlin.jvm.functions.Function0
        public final java.lang.Object invoke() {
            kotlinx.serialization.KSerializer createSimpleEnumSerializer;
            createSimpleEnumSerializer = kotlinx.serialization.internal.EnumsKt.createSimpleEnumSerializer("com.paypal.oslo.feature.revolvingcreditservicing.domain.model.common.cards.TokenServiceProvider", com.paypal.oslo.feature.revolvingcreditservicing.domain.model.common.cards.TokenServiceProvider.values());
            return createSimpleEnumSerializer;
        }
    }), null, null};

    @kotlin.Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"Lcom/paypal/oslo/feature/revolvingcreditservicing/domain/model/managecard/PushToWalletProvisioningData$Companion;", "", "<init>", "()V", "Lkotlinx/serialization/KSerializer;", "Lcom/paypal/oslo/feature/revolvingcreditservicing/domain/model/managecard/PushToWalletProvisioningData;", "serializer", "()Lkotlinx/serialization/KSerializer;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    /* loaded from: classes14.dex */
    public static final class Companion {
        private Companion() {
        }

        public final kotlinx.serialization.KSerializer<com.paypal.oslo.feature.revolvingcreditservicing.domain.model.managecard.PushToWalletProvisioningData> serializer() {
            return com.paypal.oslo.feature.revolvingcreditservicing.domain.model.managecard.PushToWalletProvisioningData$$serializer.INSTANCE;
        }

        public /* synthetic */ Companion(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public /* synthetic */ PushToWalletProvisioningData(int i, java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.String str4, com.paypal.oslo.feature.revolvingcreditservicing.domain.model.common.cards.CardNetwork cardNetwork, com.paypal.oslo.feature.revolvingcreditservicing.domain.model.common.cards.TokenServiceProvider tokenServiceProvider, java.lang.String str5, com.paypal.oslo.feature.revolvingcreditservicing.domain.model.common.profiles.CustomerProfileDetails customerProfileDetails, kotlinx.serialization.internal.SerializationConstructorMarker serializationConstructorMarker) {
        if (255 != (i & 255)) {
            kotlinx.serialization.internal.PluginExceptionsKt.throwMissingFieldException(i, 255, com.paypal.oslo.feature.revolvingcreditservicing.domain.model.managecard.PushToWalletProvisioningData$$serializer.INSTANCE.getDescriptor());
        }
        this.cardNickname = str;
        this.creditAccountId = str2;
        this.givenName = str3;
        this.surName = str4;
        this.cardNetwork = cardNetwork;
        this.tokenServiceProvider = tokenServiceProvider;
        this.lastDigits = str5;
        this.customerProfileDetails = customerProfileDetails;
    }

    public PushToWalletProvisioningData(java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.String str4, com.paypal.oslo.feature.revolvingcreditservicing.domain.model.common.cards.CardNetwork cardNetwork, com.paypal.oslo.feature.revolvingcreditservicing.domain.model.common.cards.TokenServiceProvider tokenServiceProvider, java.lang.String str5, com.paypal.oslo.feature.revolvingcreditservicing.domain.model.common.profiles.CustomerProfileDetails customerProfileDetails) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str2, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str3, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str4, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str5, "");
        this.cardNickname = str;
        this.creditAccountId = str2;
        this.givenName = str3;
        this.surName = str4;
        this.cardNetwork = cardNetwork;
        this.tokenServiceProvider = tokenServiceProvider;
        this.lastDigits = str5;
        this.customerProfileDetails = customerProfileDetails;
    }

    @kotlin.jvm.JvmStatic
    public static final /* synthetic */ void write$Self$revolvingcredit_servicing_prodRelease(com.paypal.oslo.feature.revolvingcreditservicing.domain.model.managecard.PushToWalletProvisioningData self, kotlinx.serialization.encoding.CompositeEncoder output, kotlinx.serialization.descriptors.SerialDescriptor serialDesc) {
        kotlin.Lazy<kotlinx.serialization.KSerializer<java.lang.Object>>[] lazyArr = $childSerializers;
        output.encodeStringElement(serialDesc, 0, self.cardNickname);
        output.encodeStringElement(serialDesc, 1, self.creditAccountId);
        output.encodeStringElement(serialDesc, 2, self.givenName);
        output.encodeStringElement(serialDesc, 3, self.surName);
        output.encodeNullableSerializableElement(serialDesc, 4, lazyArr[4].getValue(), self.cardNetwork);
        output.encodeNullableSerializableElement(serialDesc, 5, lazyArr[5].getValue(), self.tokenServiceProvider);
        output.encodeStringElement(serialDesc, 6, self.lastDigits);
        output.encodeNullableSerializableElement(serialDesc, 7, com.paypal.oslo.feature.revolvingcreditservicing.domain.model.common.profiles.CustomerProfileDetails$$serializer.INSTANCE, self.customerProfileDetails);
    }

    public final java.lang.String getCardNickname() {
        return this.cardNickname;
    }

    public final java.lang.String getCreditAccountId() {
        return this.creditAccountId;
    }

    public final java.lang.String getGivenName() {
        return this.givenName;
    }

    public final java.lang.String getSurName() {
        return this.surName;
    }

    public final com.paypal.oslo.feature.revolvingcreditservicing.domain.model.common.cards.CardNetwork getCardNetwork() {
        return this.cardNetwork;
    }

    public final com.paypal.oslo.feature.revolvingcreditservicing.domain.model.common.cards.TokenServiceProvider getTokenServiceProvider() {
        return this.tokenServiceProvider;
    }

    public final java.lang.String getLastDigits() {
        return this.lastDigits;
    }

    public final com.paypal.oslo.feature.revolvingcreditservicing.domain.model.common.profiles.CustomerProfileDetails getCustomerProfileDetails() {
        return this.customerProfileDetails;
    }

    public final java.lang.String toString() {
        java.lang.String str = this.cardNickname;
        java.lang.String str2 = this.creditAccountId;
        java.lang.String str3 = this.givenName;
        java.lang.String str4 = this.surName;
        com.paypal.oslo.feature.revolvingcreditservicing.domain.model.common.cards.CardNetwork cardNetwork = this.cardNetwork;
        com.paypal.oslo.feature.revolvingcreditservicing.domain.model.common.cards.TokenServiceProvider tokenServiceProvider = this.tokenServiceProvider;
        java.lang.String str5 = this.lastDigits;
        com.paypal.oslo.feature.revolvingcreditservicing.domain.model.common.profiles.CustomerProfileDetails customerProfileDetails = this.customerProfileDetails;
        java.lang.StringBuilder sb = new java.lang.StringBuilder("PushToWalletProvisioningData(cardNickname=");
        sb.append(str);
        sb.append(", creditAccountId=");
        sb.append(str2);
        sb.append(", givenName=");
        sb.append(str3);
        sb.append(", surName=");
        sb.append(str4);
        sb.append(", cardNetwork=");
        sb.append(cardNetwork);
        sb.append(", tokenServiceProvider=");
        sb.append(tokenServiceProvider);
        sb.append(", lastDigits=");
        sb.append(str5);
        sb.append(", customerProfileDetails=");
        sb.append(customerProfileDetails);
        sb.append(")");
        return sb.toString();
    }

    public final int hashCode() {
        int hashCode = this.cardNickname.hashCode();
        int hashCode2 = this.creditAccountId.hashCode();
        int hashCode3 = this.givenName.hashCode();
        int hashCode4 = this.surName.hashCode();
        com.paypal.oslo.feature.revolvingcreditservicing.domain.model.common.cards.CardNetwork cardNetwork = this.cardNetwork;
        int hashCode5 = cardNetwork == null ? 0 : cardNetwork.hashCode();
        com.paypal.oslo.feature.revolvingcreditservicing.domain.model.common.cards.TokenServiceProvider tokenServiceProvider = this.tokenServiceProvider;
        int hashCode6 = tokenServiceProvider == null ? 0 : tokenServiceProvider.hashCode();
        int hashCode7 = this.lastDigits.hashCode();
        com.paypal.oslo.feature.revolvingcreditservicing.domain.model.common.profiles.CustomerProfileDetails customerProfileDetails = this.customerProfileDetails;
        return (((((((((((((hashCode * 31) + hashCode2) * 31) + hashCode3) * 31) + hashCode4) * 31) + hashCode5) * 31) + hashCode6) * 31) + hashCode7) * 31) + (customerProfileDetails != null ? customerProfileDetails.hashCode() : 0);
    }

    public final boolean equals(java.lang.Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof com.paypal.oslo.feature.revolvingcreditservicing.domain.model.managecard.PushToWalletProvisioningData)) {
            return false;
        }
        com.paypal.oslo.feature.revolvingcreditservicing.domain.model.managecard.PushToWalletProvisioningData pushToWalletProvisioningData = (com.paypal.oslo.feature.revolvingcreditservicing.domain.model.managecard.PushToWalletProvisioningData) other;
        return kotlin.jvm.internal.Intrinsics.areEqual(this.cardNickname, pushToWalletProvisioningData.cardNickname) && kotlin.jvm.internal.Intrinsics.areEqual(this.creditAccountId, pushToWalletProvisioningData.creditAccountId) && kotlin.jvm.internal.Intrinsics.areEqual(this.givenName, pushToWalletProvisioningData.givenName) && kotlin.jvm.internal.Intrinsics.areEqual(this.surName, pushToWalletProvisioningData.surName) && this.cardNetwork == pushToWalletProvisioningData.cardNetwork && this.tokenServiceProvider == pushToWalletProvisioningData.tokenServiceProvider && kotlin.jvm.internal.Intrinsics.areEqual(this.lastDigits, pushToWalletProvisioningData.lastDigits) && kotlin.jvm.internal.Intrinsics.areEqual(this.customerProfileDetails, pushToWalletProvisioningData.customerProfileDetails);
    }

    public final com.paypal.oslo.feature.revolvingcreditservicing.domain.model.managecard.PushToWalletProvisioningData copy(java.lang.String cardNickname, java.lang.String creditAccountId, java.lang.String givenName, java.lang.String surName, com.paypal.oslo.feature.revolvingcreditservicing.domain.model.common.cards.CardNetwork cardNetwork, com.paypal.oslo.feature.revolvingcreditservicing.domain.model.common.cards.TokenServiceProvider tokenServiceProvider, java.lang.String lastDigits, com.paypal.oslo.feature.revolvingcreditservicing.domain.model.common.profiles.CustomerProfileDetails customerProfileDetails) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(cardNickname, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(creditAccountId, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(givenName, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(surName, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(lastDigits, "");
        return new com.paypal.oslo.feature.revolvingcreditservicing.domain.model.managecard.PushToWalletProvisioningData(cardNickname, creditAccountId, givenName, surName, cardNetwork, tokenServiceProvider, lastDigits, customerProfileDetails);
    }

    /* renamed from: component8, reason: from getter */
    public final com.paypal.oslo.feature.revolvingcreditservicing.domain.model.common.profiles.CustomerProfileDetails getCustomerProfileDetails() {
        return this.customerProfileDetails;
    }

    /* renamed from: component7, reason: from getter */
    public final java.lang.String getLastDigits() {
        return this.lastDigits;
    }

    /* renamed from: component6, reason: from getter */
    public final com.paypal.oslo.feature.revolvingcreditservicing.domain.model.common.cards.TokenServiceProvider getTokenServiceProvider() {
        return this.tokenServiceProvider;
    }

    /* renamed from: component5, reason: from getter */
    public final com.paypal.oslo.feature.revolvingcreditservicing.domain.model.common.cards.CardNetwork getCardNetwork() {
        return this.cardNetwork;
    }

    /* renamed from: component4, reason: from getter */
    public final java.lang.String getSurName() {
        return this.surName;
    }

    /* renamed from: component3, reason: from getter */
    public final java.lang.String getGivenName() {
        return this.givenName;
    }

    /* renamed from: component2, reason: from getter */
    public final java.lang.String getCreditAccountId() {
        return this.creditAccountId;
    }

    /* renamed from: component1, reason: from getter */
    public final java.lang.String getCardNickname() {
        return this.cardNickname;
    }
}
