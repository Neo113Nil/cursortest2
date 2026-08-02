package com.paypal.oslo.feature.debitcard.servicing.domain.activatecard;

@kotlin.Metadata(d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u001c\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0016\b\u0087\b\u0018\u0000 M2\u00020\u0001:\u0002NMBu\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0002\u0012\u0006\u0010\u0007\u001a\u00020\u0002\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\n\u001a\u00020\u0002\u0012\u0006\u0010\f\u001a\u00020\u000b\u0012\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u0002\u0012\b\b\u0002\u0010\u000e\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u000f\u001a\u00020\b\u0012\b\b\u0002\u0010\u0011\u001a\u00020\u0010\u0012\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0013\u0010\u0014B\u0085\u0001\b\u0010\u0012\u0006\u0010\u0016\u001a\u00020\u0015\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\t\u001a\u00020\b\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u000b\u0012\b\u0010\r\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u000f\u001a\u00020\b\u0012\b\u0010\u0011\u001a\u0004\u0018\u00010\u0010\u0012\b\u0010\u0018\u001a\u0004\u0018\u00010\u0017¢\u0006\u0004\b\u0013\u0010\u0019J\u0010\u0010\u001a\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u001a\u0010\u001bJ\u0010\u0010\u001c\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\u001c\u0010\u001dJ\u0010\u0010\u001e\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u001e\u0010\u001bJ\u0010\u0010\u001f\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u001f\u0010\u001bJ\u0010\u0010 \u001a\u00020\bHÆ\u0003¢\u0006\u0004\b \u0010!J\u0010\u0010\"\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\"\u0010\u001bJ\u0010\u0010#\u001a\u00020\u000bHÆ\u0003¢\u0006\u0004\b#\u0010$J\u0012\u0010%\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b%\u0010\u001bJ\u0010\u0010&\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b&\u0010\u001bJ\u0010\u0010'\u001a\u00020\bHÆ\u0003¢\u0006\u0004\b'\u0010!J\u0010\u0010(\u001a\u00020\u0010HÆ\u0003¢\u0006\u0004\b(\u0010)J\u0012\u0010*\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b*\u0010\u001bJ\u008c\u0001\u0010+\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0006\u001a\u00020\u00022\b\b\u0002\u0010\u0007\u001a\u00020\u00022\b\b\u0002\u0010\t\u001a\u00020\b2\b\b\u0002\u0010\n\u001a\u00020\u00022\b\b\u0002\u0010\f\u001a\u00020\u000b2\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u00022\b\b\u0002\u0010\u000e\u001a\u00020\u00022\b\b\u0002\u0010\u000f\u001a\u00020\b2\b\b\u0002\u0010\u0011\u001a\u00020\u00102\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u0002HÆ\u0001¢\u0006\u0004\b+\u0010,J\u001a\u0010.\u001a\u00020\b2\b\u0010-\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b.\u0010/J\u0010\u00100\u001a\u00020\u0015HÖ\u0001¢\u0006\u0004\b0\u00101J\u0010\u00102\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b2\u0010\u001bJ'\u00109\u001a\u0002082\u0006\u00103\u001a\u00020\u00002\u0006\u00105\u001a\u0002042\u0006\u00107\u001a\u000206H\u0001¢\u0006\u0004\b9\u0010:R\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010;\u001a\u0004\b<\u0010\u001bR\u001a\u0010\u0005\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010=\u001a\u0004\b>\u0010\u001dR\u001a\u0010\u0006\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010;\u001a\u0004\b?\u0010\u001bR\u001a\u0010\u0007\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010;\u001a\u0004\b@\u0010\u001bR\u001a\u0010\t\u001a\u00020\b8\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\t\u0010A\u001a\u0004\b\t\u0010!R\u001a\u0010\n\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\n\u0010;\u001a\u0004\bB\u0010\u001bR\u001a\u0010\f\u001a\u00020\u000b8\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\f\u0010C\u001a\u0004\bD\u0010$R\u001c\u0010\r\u001a\u0004\u0018\u00010\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\r\u0010;\u001a\u0004\bE\u0010\u001bR\u001a\u0010\u000e\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u000e\u0010;\u001a\u0004\bF\u0010\u001bR\u001a\u0010\u000f\u001a\u00020\b8\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u000f\u0010A\u001a\u0004\bG\u0010!R\u001a\u0010\u0011\u001a\u00020\u00108\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0011\u0010H\u001a\u0004\bI\u0010)R\"\u0010\u0012\u001a\u0004\u0018\u00010\u00028\u0007X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0012\u0010;\u0012\u0004\bK\u0010L\u001a\u0004\bJ\u0010\u001b"}, d2 = {"Lcom/paypal/oslo/feature/debitcard/servicing/domain/activatecard/DebitCardActivationInfo;", "", "", "instrumentId", "Lcom/paypal/oslo/feature/debitcard/api/model/DebitCardProductName;", com.paypal.oslo.feature.debitcard.shared.constants.DebitCardLoggerConstants.PRODUCT_NAME, "cardImageUrl", "lastFourDigits", "", "isPinSet", "displayAddress", "Lcom/paypal/oslo/feature/debitcard/shared/domain/model/DebitInstrumentLifecycleState;", "lifecycleState", "billingAddressId", "expectedArrivalDate", "primary", "Lcom/paypal/oslo/feature/debitcard/api/navigation/result/DebitCardActivationResultType;", com.paypal.oslo.feature.p2p.domain.constants.P2pConstants.Log.Attributes.RESULT_TYPE, "collectedPin", "<init>", "(Ljava/lang/String;Lcom/paypal/oslo/feature/debitcard/api/model/DebitCardProductName;Ljava/lang/String;Ljava/lang/String;ZLjava/lang/String;Lcom/paypal/oslo/feature/debitcard/shared/domain/model/DebitInstrumentLifecycleState;Ljava/lang/String;Ljava/lang/String;ZLcom/paypal/oslo/feature/debitcard/api/navigation/result/DebitCardActivationResultType;Ljava/lang/String;)V", "", "seen0", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "serializationConstructorMarker", "(ILjava/lang/String;Lcom/paypal/oslo/feature/debitcard/api/model/DebitCardProductName;Ljava/lang/String;Ljava/lang/String;ZLjava/lang/String;Lcom/paypal/oslo/feature/debitcard/shared/domain/model/DebitInstrumentLifecycleState;Ljava/lang/String;Ljava/lang/String;ZLcom/paypal/oslo/feature/debitcard/api/navigation/result/DebitCardActivationResultType;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", "component1", "()Ljava/lang/String;", "component2", "()Lcom/paypal/oslo/feature/debitcard/api/model/DebitCardProductName;", "component3", "component4", "component5", "()Z", "component6", "component7", "()Lcom/paypal/oslo/feature/debitcard/shared/domain/model/DebitInstrumentLifecycleState;", "component8", "component9", "component10", "component11", "()Lcom/paypal/oslo/feature/debitcard/api/navigation/result/DebitCardActivationResultType;", "component12", "copy", "(Ljava/lang/String;Lcom/paypal/oslo/feature/debitcard/api/model/DebitCardProductName;Ljava/lang/String;Ljava/lang/String;ZLjava/lang/String;Lcom/paypal/oslo/feature/debitcard/shared/domain/model/DebitInstrumentLifecycleState;Ljava/lang/String;Ljava/lang/String;ZLcom/paypal/oslo/feature/debitcard/api/navigation/result/DebitCardActivationResultType;Ljava/lang/String;)Lcom/paypal/oslo/feature/debitcard/servicing/domain/activatecard/DebitCardActivationInfo;", "other", "equals", "(Ljava/lang/Object;)Z", "hashCode", "()I", "toString", "self", "Lkotlinx/serialization/encoding/CompositeEncoder;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "", "write$Self$debit_card_prodRelease", "(Lcom/paypal/oslo/feature/debitcard/servicing/domain/activatecard/DebitCardActivationInfo;Lkotlinx/serialization/encoding/CompositeEncoder;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "Ljava/lang/String;", "getInstrumentId", "Lcom/paypal/oslo/feature/debitcard/api/model/DebitCardProductName;", "getProductName", "getCardImageUrl", "getLastFourDigits", "Z", "getDisplayAddress", "Lcom/paypal/oslo/feature/debitcard/shared/domain/model/DebitInstrumentLifecycleState;", "getLifecycleState", "getBillingAddressId", "getExpectedArrivalDate", "getPrimary", "Lcom/paypal/oslo/feature/debitcard/api/navigation/result/DebitCardActivationResultType;", "getResultType", "getCollectedPin", "getCollectedPin$annotations", "()V", "Companion", "$serializer"}, k = 1, mv = {2, 3, 0}, xi = 48)
@kotlinx.serialization.Serializable
/* loaded from: classes2.dex */
public final /* data */ class DebitCardActivationInfo {
    public static final int $stable = 0;
    private final java.lang.String billingAddressId;
    private final java.lang.String cardImageUrl;
    private final java.lang.String collectedPin;
    private final java.lang.String displayAddress;
    private final java.lang.String expectedArrivalDate;
    private final java.lang.String instrumentId;
    private final boolean isPinSet;
    private final java.lang.String lastFourDigits;
    private final com.paypal.oslo.feature.debitcard.shared.domain.model.DebitInstrumentLifecycleState lifecycleState;
    private final boolean primary;
    private final com.paypal.oslo.feature.debitcard.api.model.DebitCardProductName productName;
    private final com.paypal.oslo.feature.debitcard.api.navigation.result.DebitCardActivationResultType resultType;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final com.paypal.oslo.feature.debitcard.servicing.domain.activatecard.DebitCardActivationInfo.Companion INSTANCE = new com.paypal.oslo.feature.debitcard.servicing.domain.activatecard.DebitCardActivationInfo.Companion(null);
    private static final kotlin.Lazy<kotlinx.serialization.KSerializer<java.lang.Object>>[] $childSerializers = {null, kotlin.LazyKt.lazy(kotlin.LazyThreadSafetyMode.PUBLICATION, new kotlin.jvm.functions.Function0() { // from class: com.paypal.oslo.feature.debitcard.servicing.domain.activatecard.DebitCardActivationInfo$$ExternalSyntheticLambda0
        @Override // kotlin.jvm.functions.Function0
        public final java.lang.Object invoke() {
            kotlinx.serialization.KSerializer serializer;
            serializer = com.paypal.oslo.feature.debitcard.api.model.DebitCardProductName.INSTANCE.serializer();
            return serializer;
        }
    }), null, null, null, null, kotlin.LazyKt.lazy(kotlin.LazyThreadSafetyMode.PUBLICATION, new kotlin.jvm.functions.Function0() { // from class: com.paypal.oslo.feature.debitcard.servicing.domain.activatecard.DebitCardActivationInfo$$ExternalSyntheticLambda1
        @Override // kotlin.jvm.functions.Function0
        public final java.lang.Object invoke() {
            kotlinx.serialization.KSerializer serializer;
            serializer = com.paypal.oslo.feature.debitcard.shared.domain.model.DebitInstrumentLifecycleState.INSTANCE.serializer();
            return serializer;
        }
    }), null, null, null, kotlin.LazyKt.lazy(kotlin.LazyThreadSafetyMode.PUBLICATION, new kotlin.jvm.functions.Function0() { // from class: com.paypal.oslo.feature.debitcard.servicing.domain.activatecard.DebitCardActivationInfo$$ExternalSyntheticLambda2
        @Override // kotlin.jvm.functions.Function0
        public final java.lang.Object invoke() {
            kotlinx.serialization.KSerializer serializer;
            serializer = com.paypal.oslo.feature.debitcard.api.navigation.result.DebitCardActivationResultType.INSTANCE.serializer();
            return serializer;
        }
    })};

    @kotlinx.serialization.Transient
    public static /* synthetic */ void getCollectedPin$annotations() {
    }

    @kotlin.Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"Lcom/paypal/oslo/feature/debitcard/servicing/domain/activatecard/DebitCardActivationInfo$Companion;", "", "<init>", "()V", "Lkotlinx/serialization/KSerializer;", "Lcom/paypal/oslo/feature/debitcard/servicing/domain/activatecard/DebitCardActivationInfo;", "serializer", "()Lkotlinx/serialization/KSerializer;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    /* loaded from: classes12.dex */
    public static final class Companion {
        private Companion() {
        }

        public final kotlinx.serialization.KSerializer<com.paypal.oslo.feature.debitcard.servicing.domain.activatecard.DebitCardActivationInfo> serializer() {
            return com.paypal.oslo.feature.debitcard.servicing.domain.activatecard.DebitCardActivationInfo$$serializer.INSTANCE;
        }

        public /* synthetic */ Companion(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public /* synthetic */ DebitCardActivationInfo(int i, java.lang.String str, com.paypal.oslo.feature.debitcard.api.model.DebitCardProductName debitCardProductName, java.lang.String str2, java.lang.String str3, boolean z, java.lang.String str4, com.paypal.oslo.feature.debitcard.shared.domain.model.DebitInstrumentLifecycleState debitInstrumentLifecycleState, java.lang.String str5, java.lang.String str6, boolean z2, com.paypal.oslo.feature.debitcard.api.navigation.result.DebitCardActivationResultType debitCardActivationResultType, kotlinx.serialization.internal.SerializationConstructorMarker serializationConstructorMarker) {
        if (127 != (i & 127)) {
            kotlinx.serialization.internal.PluginExceptionsKt.throwMissingFieldException(i, 127, com.paypal.oslo.feature.debitcard.servicing.domain.activatecard.DebitCardActivationInfo$$serializer.INSTANCE.getDescriptor());
        }
        this.instrumentId = str;
        this.productName = debitCardProductName;
        this.cardImageUrl = str2;
        this.lastFourDigits = str3;
        this.isPinSet = z;
        this.displayAddress = str4;
        this.lifecycleState = debitInstrumentLifecycleState;
        if ((i & 128) == 0) {
            this.billingAddressId = null;
        } else {
            this.billingAddressId = str5;
        }
        if ((i & 256) == 0) {
            this.expectedArrivalDate = "";
        } else {
            this.expectedArrivalDate = str6;
        }
        if ((i & 512) == 0) {
            this.primary = true;
        } else {
            this.primary = z2;
        }
        if ((i & 1024) == 0) {
            this.resultType = com.paypal.oslo.feature.debitcard.api.navigation.result.DebitCardActivationResultType.DISMISSED;
        } else {
            this.resultType = debitCardActivationResultType;
        }
        this.collectedPin = null;
    }

    public DebitCardActivationInfo(java.lang.String str, com.paypal.oslo.feature.debitcard.api.model.DebitCardProductName debitCardProductName, java.lang.String str2, java.lang.String str3, boolean z, java.lang.String str4, com.paypal.oslo.feature.debitcard.shared.domain.model.DebitInstrumentLifecycleState debitInstrumentLifecycleState, java.lang.String str5, java.lang.String str6, boolean z2, com.paypal.oslo.feature.debitcard.api.navigation.result.DebitCardActivationResultType debitCardActivationResultType, java.lang.String str7) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(debitCardProductName, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str2, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str3, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str4, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(debitInstrumentLifecycleState, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str6, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(debitCardActivationResultType, "");
        this.instrumentId = str;
        this.productName = debitCardProductName;
        this.cardImageUrl = str2;
        this.lastFourDigits = str3;
        this.isPinSet = z;
        this.displayAddress = str4;
        this.lifecycleState = debitInstrumentLifecycleState;
        this.billingAddressId = str5;
        this.expectedArrivalDate = str6;
        this.primary = z2;
        this.resultType = debitCardActivationResultType;
        this.collectedPin = str7;
    }

    @kotlin.jvm.JvmStatic
    public static final /* synthetic */ void write$Self$debit_card_prodRelease(com.paypal.oslo.feature.debitcard.servicing.domain.activatecard.DebitCardActivationInfo self, kotlinx.serialization.encoding.CompositeEncoder output, kotlinx.serialization.descriptors.SerialDescriptor serialDesc) {
        kotlin.Lazy<kotlinx.serialization.KSerializer<java.lang.Object>>[] lazyArr = $childSerializers;
        output.encodeStringElement(serialDesc, 0, self.instrumentId);
        output.encodeSerializableElement(serialDesc, 1, lazyArr[1].getValue(), self.productName);
        output.encodeStringElement(serialDesc, 2, self.cardImageUrl);
        output.encodeStringElement(serialDesc, 3, self.lastFourDigits);
        output.encodeBooleanElement(serialDesc, 4, self.isPinSet);
        output.encodeStringElement(serialDesc, 5, self.displayAddress);
        output.encodeSerializableElement(serialDesc, 6, lazyArr[6].getValue(), self.lifecycleState);
        if (output.shouldEncodeElementDefault(serialDesc, 7) || self.billingAddressId != null) {
            output.encodeNullableSerializableElement(serialDesc, 7, kotlinx.serialization.internal.StringSerializer.INSTANCE, self.billingAddressId);
        }
        if (output.shouldEncodeElementDefault(serialDesc, 8) || !kotlin.jvm.internal.Intrinsics.areEqual(self.expectedArrivalDate, "")) {
            output.encodeStringElement(serialDesc, 8, self.expectedArrivalDate);
        }
        if (output.shouldEncodeElementDefault(serialDesc, 9) || !self.primary) {
            output.encodeBooleanElement(serialDesc, 9, self.primary);
        }
        if (output.shouldEncodeElementDefault(serialDesc, 10) || self.resultType != com.paypal.oslo.feature.debitcard.api.navigation.result.DebitCardActivationResultType.DISMISSED) {
            output.encodeSerializableElement(serialDesc, 10, lazyArr[10].getValue(), self.resultType);
        }
    }

    public final java.lang.String getInstrumentId() {
        return this.instrumentId;
    }

    public final com.paypal.oslo.feature.debitcard.api.model.DebitCardProductName getProductName() {
        return this.productName;
    }

    public final java.lang.String getCardImageUrl() {
        return this.cardImageUrl;
    }

    public final java.lang.String getLastFourDigits() {
        return this.lastFourDigits;
    }

    public final boolean isPinSet() {
        return this.isPinSet;
    }

    public final java.lang.String getDisplayAddress() {
        return this.displayAddress;
    }

    public final com.paypal.oslo.feature.debitcard.shared.domain.model.DebitInstrumentLifecycleState getLifecycleState() {
        return this.lifecycleState;
    }

    public final java.lang.String getBillingAddressId() {
        return this.billingAddressId;
    }

    public /* synthetic */ DebitCardActivationInfo(java.lang.String str, com.paypal.oslo.feature.debitcard.api.model.DebitCardProductName debitCardProductName, java.lang.String str2, java.lang.String str3, boolean z, java.lang.String str4, com.paypal.oslo.feature.debitcard.shared.domain.model.DebitInstrumentLifecycleState debitInstrumentLifecycleState, java.lang.String str5, java.lang.String str6, boolean z2, com.paypal.oslo.feature.debitcard.api.navigation.result.DebitCardActivationResultType debitCardActivationResultType, java.lang.String str7, int i, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this(str, debitCardProductName, str2, str3, z, str4, debitInstrumentLifecycleState, (i & 128) != 0 ? null : str5, (i & 256) != 0 ? "" : str6, (i & 512) != 0 ? true : z2, (i & 1024) != 0 ? com.paypal.oslo.feature.debitcard.api.navigation.result.DebitCardActivationResultType.DISMISSED : debitCardActivationResultType, (i & 2048) != 0 ? null : str7);
    }

    public final java.lang.String getExpectedArrivalDate() {
        return this.expectedArrivalDate;
    }

    public final boolean getPrimary() {
        return this.primary;
    }

    public final com.paypal.oslo.feature.debitcard.api.navigation.result.DebitCardActivationResultType getResultType() {
        return this.resultType;
    }

    public final java.lang.String getCollectedPin() {
        return this.collectedPin;
    }

    public final java.lang.String toString() {
        java.lang.String str = this.instrumentId;
        com.paypal.oslo.feature.debitcard.api.model.DebitCardProductName debitCardProductName = this.productName;
        java.lang.String str2 = this.cardImageUrl;
        java.lang.String str3 = this.lastFourDigits;
        boolean z = this.isPinSet;
        java.lang.String str4 = this.displayAddress;
        com.paypal.oslo.feature.debitcard.shared.domain.model.DebitInstrumentLifecycleState debitInstrumentLifecycleState = this.lifecycleState;
        java.lang.String str5 = this.billingAddressId;
        java.lang.String str6 = this.expectedArrivalDate;
        boolean z2 = this.primary;
        com.paypal.oslo.feature.debitcard.api.navigation.result.DebitCardActivationResultType debitCardActivationResultType = this.resultType;
        java.lang.String str7 = this.collectedPin;
        java.lang.StringBuilder sb = new java.lang.StringBuilder("DebitCardActivationInfo(instrumentId=");
        sb.append(str);
        sb.append(", productName=");
        sb.append(debitCardProductName);
        sb.append(", cardImageUrl=");
        sb.append(str2);
        sb.append(", lastFourDigits=");
        sb.append(str3);
        sb.append(", isPinSet=");
        sb.append(z);
        sb.append(", displayAddress=");
        sb.append(str4);
        sb.append(", lifecycleState=");
        sb.append(debitInstrumentLifecycleState);
        sb.append(", billingAddressId=");
        sb.append(str5);
        sb.append(", expectedArrivalDate=");
        sb.append(str6);
        sb.append(", primary=");
        sb.append(z2);
        sb.append(", resultType=");
        sb.append(debitCardActivationResultType);
        sb.append(", collectedPin=");
        sb.append(str7);
        sb.append(")");
        return sb.toString();
    }

    public final int hashCode() {
        int hashCode = this.instrumentId.hashCode();
        int hashCode2 = this.productName.hashCode();
        int hashCode3 = this.cardImageUrl.hashCode();
        int hashCode4 = this.lastFourDigits.hashCode();
        int hashCode5 = java.lang.Boolean.hashCode(this.isPinSet);
        int hashCode6 = this.displayAddress.hashCode();
        int hashCode7 = this.lifecycleState.hashCode();
        java.lang.String str = this.billingAddressId;
        int hashCode8 = str == null ? 0 : str.hashCode();
        int hashCode9 = this.expectedArrivalDate.hashCode();
        int hashCode10 = java.lang.Boolean.hashCode(this.primary);
        int hashCode11 = this.resultType.hashCode();
        java.lang.String str2 = this.collectedPin;
        return (((((((((((((((((((((hashCode * 31) + hashCode2) * 31) + hashCode3) * 31) + hashCode4) * 31) + hashCode5) * 31) + hashCode6) * 31) + hashCode7) * 31) + hashCode8) * 31) + hashCode9) * 31) + hashCode10) * 31) + hashCode11) * 31) + (str2 != null ? str2.hashCode() : 0);
    }

    public final boolean equals(java.lang.Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof com.paypal.oslo.feature.debitcard.servicing.domain.activatecard.DebitCardActivationInfo)) {
            return false;
        }
        com.paypal.oslo.feature.debitcard.servicing.domain.activatecard.DebitCardActivationInfo debitCardActivationInfo = (com.paypal.oslo.feature.debitcard.servicing.domain.activatecard.DebitCardActivationInfo) other;
        return kotlin.jvm.internal.Intrinsics.areEqual(this.instrumentId, debitCardActivationInfo.instrumentId) && this.productName == debitCardActivationInfo.productName && kotlin.jvm.internal.Intrinsics.areEqual(this.cardImageUrl, debitCardActivationInfo.cardImageUrl) && kotlin.jvm.internal.Intrinsics.areEqual(this.lastFourDigits, debitCardActivationInfo.lastFourDigits) && this.isPinSet == debitCardActivationInfo.isPinSet && kotlin.jvm.internal.Intrinsics.areEqual(this.displayAddress, debitCardActivationInfo.displayAddress) && this.lifecycleState == debitCardActivationInfo.lifecycleState && kotlin.jvm.internal.Intrinsics.areEqual(this.billingAddressId, debitCardActivationInfo.billingAddressId) && kotlin.jvm.internal.Intrinsics.areEqual(this.expectedArrivalDate, debitCardActivationInfo.expectedArrivalDate) && this.primary == debitCardActivationInfo.primary && this.resultType == debitCardActivationInfo.resultType && kotlin.jvm.internal.Intrinsics.areEqual(this.collectedPin, debitCardActivationInfo.collectedPin);
    }

    public final com.paypal.oslo.feature.debitcard.servicing.domain.activatecard.DebitCardActivationInfo copy(java.lang.String instrumentId, com.paypal.oslo.feature.debitcard.api.model.DebitCardProductName productName, java.lang.String cardImageUrl, java.lang.String lastFourDigits, boolean isPinSet, java.lang.String displayAddress, com.paypal.oslo.feature.debitcard.shared.domain.model.DebitInstrumentLifecycleState lifecycleState, java.lang.String billingAddressId, java.lang.String expectedArrivalDate, boolean primary, com.paypal.oslo.feature.debitcard.api.navigation.result.DebitCardActivationResultType resultType, java.lang.String collectedPin) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(instrumentId, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(productName, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(cardImageUrl, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(lastFourDigits, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(displayAddress, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(lifecycleState, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(expectedArrivalDate, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(resultType, "");
        return new com.paypal.oslo.feature.debitcard.servicing.domain.activatecard.DebitCardActivationInfo(instrumentId, productName, cardImageUrl, lastFourDigits, isPinSet, displayAddress, lifecycleState, billingAddressId, expectedArrivalDate, primary, resultType, collectedPin);
    }

    /* renamed from: component9, reason: from getter */
    public final java.lang.String getExpectedArrivalDate() {
        return this.expectedArrivalDate;
    }

    /* renamed from: component8, reason: from getter */
    public final java.lang.String getBillingAddressId() {
        return this.billingAddressId;
    }

    /* renamed from: component7, reason: from getter */
    public final com.paypal.oslo.feature.debitcard.shared.domain.model.DebitInstrumentLifecycleState getLifecycleState() {
        return this.lifecycleState;
    }

    /* renamed from: component6, reason: from getter */
    public final java.lang.String getDisplayAddress() {
        return this.displayAddress;
    }

    /* renamed from: component5, reason: from getter */
    public final boolean getIsPinSet() {
        return this.isPinSet;
    }

    /* renamed from: component4, reason: from getter */
    public final java.lang.String getLastFourDigits() {
        return this.lastFourDigits;
    }

    /* renamed from: component3, reason: from getter */
    public final java.lang.String getCardImageUrl() {
        return this.cardImageUrl;
    }

    /* renamed from: component2, reason: from getter */
    public final com.paypal.oslo.feature.debitcard.api.model.DebitCardProductName getProductName() {
        return this.productName;
    }

    /* renamed from: component12, reason: from getter */
    public final java.lang.String getCollectedPin() {
        return this.collectedPin;
    }

    /* renamed from: component11, reason: from getter */
    public final com.paypal.oslo.feature.debitcard.api.navigation.result.DebitCardActivationResultType getResultType() {
        return this.resultType;
    }

    /* renamed from: component10, reason: from getter */
    public final boolean getPrimary() {
        return this.primary;
    }

    /* renamed from: component1, reason: from getter */
    public final java.lang.String getInstrumentId() {
        return this.instrumentId;
    }
}
