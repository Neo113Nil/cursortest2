package com.paypal.oslo.feature.qrc.domain.model.session;

@kotlin.Metadata(d1 = {"\u0000|\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u001d\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b \b\u0081\b\u0018\u0000 f2\u00020\u0001:\u0002gfBw\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\n\u0012\b\u0010\r\u001a\u0004\u0018\u00010\f\u0012\u0006\u0010\u000f\u001a\u00020\u000e\u0012\u0006\u0010\u0011\u001a\u00020\u0010\u0012\u0006\u0010\u0013\u001a\u00020\u0012\u0012\b\u0010\u0015\u001a\u0004\u0018\u00010\u0014\u0012\b\u0010\u0017\u001a\u0004\u0018\u00010\u0016\u0012\b\u0010\u0019\u001a\u0004\u0018\u00010\u0018¢\u0006\u0004\b\u001a\u0010\u001bB\u0093\u0001\b\u0010\u0012\u0006\u0010\u001d\u001a\u00020\u001c\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\n\u0012\b\u0010\r\u001a\u0004\u0018\u00010\f\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\u000e\u0012\b\u0010\u0011\u001a\u0004\u0018\u00010\u0010\u0012\b\u0010\u0013\u001a\u0004\u0018\u00010\u0012\u0012\b\u0010\u0015\u001a\u0004\u0018\u00010\u0014\u0012\b\u0010\u0017\u001a\u0004\u0018\u00010\u0016\u0012\b\u0010\u0019\u001a\u0004\u0018\u00010\u0018\u0012\b\u0010\u001f\u001a\u0004\u0018\u00010\u001e¢\u0006\u0004\b\u001a\u0010 J\u0010\u0010!\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b!\u0010\"J\u0012\u0010#\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b#\u0010$J\u0012\u0010%\u001a\u0004\u0018\u00010\u0006HÆ\u0003¢\u0006\u0004\b%\u0010&J\u0012\u0010'\u001a\u0004\u0018\u00010\bHÆ\u0003¢\u0006\u0004\b'\u0010(J\u0012\u0010)\u001a\u0004\u0018\u00010\nHÆ\u0003¢\u0006\u0004\b)\u0010*J\u0012\u0010+\u001a\u0004\u0018\u00010\fHÆ\u0003¢\u0006\u0004\b+\u0010,J\u0010\u0010-\u001a\u00020\u000eHÆ\u0003¢\u0006\u0004\b-\u0010.J\u0010\u0010/\u001a\u00020\u0010HÆ\u0003¢\u0006\u0004\b/\u00100J\u0010\u00101\u001a\u00020\u0012HÆ\u0003¢\u0006\u0004\b1\u00102J\u0012\u00103\u001a\u0004\u0018\u00010\u0014HÆ\u0003¢\u0006\u0004\b3\u00104J\u0012\u00105\u001a\u0004\u0018\u00010\u0016HÆ\u0003¢\u0006\u0004\b5\u00106J\u0012\u00107\u001a\u0004\u0018\u00010\u0018HÆ\u0003¢\u0006\u0004\b7\u00108J\u0098\u0001\u00109\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\b2\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\n2\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\f2\b\b\u0002\u0010\u000f\u001a\u00020\u000e2\b\b\u0002\u0010\u0011\u001a\u00020\u00102\b\b\u0002\u0010\u0013\u001a\u00020\u00122\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00010\u00142\n\b\u0002\u0010\u0017\u001a\u0004\u0018\u00010\u00162\n\b\u0002\u0010\u0019\u001a\u0004\u0018\u00010\u0018HÆ\u0001¢\u0006\u0004\b9\u0010:J\u001a\u0010=\u001a\u00020<2\b\u0010;\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b=\u0010>J\u0010\u0010?\u001a\u00020\u001cHÖ\u0001¢\u0006\u0004\b?\u0010@J\u0010\u0010A\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\bA\u0010\"J'\u0010H\u001a\u00020G2\u0006\u0010B\u001a\u00020\u00002\u0006\u0010D\u001a\u00020C2\u0006\u0010F\u001a\u00020EH\u0001¢\u0006\u0004\bH\u0010IR\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010J\u001a\u0004\bK\u0010\"R\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010L\u001a\u0004\bM\u0010$R\u001c\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010N\u001a\u0004\bO\u0010&R\u001c\u0010\t\u001a\u0004\u0018\u00010\b8\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\t\u0010P\u001a\u0004\bQ\u0010(R\u001c\u0010\u000b\u001a\u0004\u0018\u00010\n8\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u000b\u0010R\u001a\u0004\bS\u0010*R\u001c\u0010\r\u001a\u0004\u0018\u00010\f8\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\r\u0010T\u001a\u0004\bU\u0010,R\u001a\u0010\u000f\u001a\u00020\u000e8\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u000f\u0010V\u001a\u0004\bW\u0010.R\u001a\u0010\u0011\u001a\u00020\u00108\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0011\u0010X\u001a\u0004\bY\u00100R\u001a\u0010\u0013\u001a\u00020\u00128\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0013\u0010Z\u001a\u0004\b[\u00102R\u001c\u0010\u0015\u001a\u0004\u0018\u00010\u00148\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0015\u0010\\\u001a\u0004\b]\u00104R\u001c\u0010\u0017\u001a\u0004\u0018\u00010\u00168\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0017\u0010^\u001a\u0004\b_\u00106R\u001c\u0010\u0019\u001a\u0004\u0018\u00010\u00188\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0019\u0010`\u001a\u0004\ba\u00108R\u0011\u0010b\u001a\u00020<8G¢\u0006\u0006\u001a\u0004\bb\u0010cR\u0011\u0010e\u001a\u00020<8G¢\u0006\u0006\u001a\u0004\bd\u0010c"}, d2 = {"Lcom/paypal/oslo/feature/qrc/domain/model/session/QrcSessionNavArgs;", "", "", "sessionId", "Lcom/paypal/oslo/feature/qrc/domain/model/session/QrcMode;", "mode", "Lcom/paypal/oslo/feature/qrc/domain/model/session/QrCodeType;", "qrCodeType", "Lcom/paypal/oslo/feature/qrc/domain/model/session/QrcPointOfInitiationMethod;", "pointOfInitiationMethod", "Lcom/paypal/oslo/feature/qrc/domain/model/session/ProductFlow;", "productFlow", "Lcom/paypal/oslo/feature/qrc/domain/model/session/QrcSessionRequiredAction;", "requiredAction", "Lcom/paypal/oslo/feature/qrc/domain/model/session/QrcTransactionDetails;", "transactionDetails", "Lcom/paypal/oslo/feature/qrc/domain/model/session/QrcParticipants;", "participants", "Lcom/paypal/oslo/feature/qrc/domain/model/session/QrcTipDetails;", "tipDetails", "Lcom/paypal/oslo/feature/qrc/domain/model/session/PayPalWorldTransactionDetails;", "paypalWorldDetails", "Lcom/paypal/oslo/feature/qrc/domain/model/session/PaymentResponse;", "paymentResponse", "Lcom/paypal/oslo/feature/qrc/domain/model/review/PaymentOptions;", "paymentOptions", "<init>", "(Ljava/lang/String;Lcom/paypal/oslo/feature/qrc/domain/model/session/QrcMode;Lcom/paypal/oslo/feature/qrc/domain/model/session/QrCodeType;Lcom/paypal/oslo/feature/qrc/domain/model/session/QrcPointOfInitiationMethod;Lcom/paypal/oslo/feature/qrc/domain/model/session/ProductFlow;Lcom/paypal/oslo/feature/qrc/domain/model/session/QrcSessionRequiredAction;Lcom/paypal/oslo/feature/qrc/domain/model/session/QrcTransactionDetails;Lcom/paypal/oslo/feature/qrc/domain/model/session/QrcParticipants;Lcom/paypal/oslo/feature/qrc/domain/model/session/QrcTipDetails;Lcom/paypal/oslo/feature/qrc/domain/model/session/PayPalWorldTransactionDetails;Lcom/paypal/oslo/feature/qrc/domain/model/session/PaymentResponse;Lcom/paypal/oslo/feature/qrc/domain/model/review/PaymentOptions;)V", "", "seen0", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "serializationConstructorMarker", "(ILjava/lang/String;Lcom/paypal/oslo/feature/qrc/domain/model/session/QrcMode;Lcom/paypal/oslo/feature/qrc/domain/model/session/QrCodeType;Lcom/paypal/oslo/feature/qrc/domain/model/session/QrcPointOfInitiationMethod;Lcom/paypal/oslo/feature/qrc/domain/model/session/ProductFlow;Lcom/paypal/oslo/feature/qrc/domain/model/session/QrcSessionRequiredAction;Lcom/paypal/oslo/feature/qrc/domain/model/session/QrcTransactionDetails;Lcom/paypal/oslo/feature/qrc/domain/model/session/QrcParticipants;Lcom/paypal/oslo/feature/qrc/domain/model/session/QrcTipDetails;Lcom/paypal/oslo/feature/qrc/domain/model/session/PayPalWorldTransactionDetails;Lcom/paypal/oslo/feature/qrc/domain/model/session/PaymentResponse;Lcom/paypal/oslo/feature/qrc/domain/model/review/PaymentOptions;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", "component1", "()Ljava/lang/String;", "component2", "()Lcom/paypal/oslo/feature/qrc/domain/model/session/QrcMode;", "component3", "()Lcom/paypal/oslo/feature/qrc/domain/model/session/QrCodeType;", "component4", "()Lcom/paypal/oslo/feature/qrc/domain/model/session/QrcPointOfInitiationMethod;", "component5", "()Lcom/paypal/oslo/feature/qrc/domain/model/session/ProductFlow;", "component6", "()Lcom/paypal/oslo/feature/qrc/domain/model/session/QrcSessionRequiredAction;", "component7", "()Lcom/paypal/oslo/feature/qrc/domain/model/session/QrcTransactionDetails;", "component8", "()Lcom/paypal/oslo/feature/qrc/domain/model/session/QrcParticipants;", "component9", "()Lcom/paypal/oslo/feature/qrc/domain/model/session/QrcTipDetails;", "component10", "()Lcom/paypal/oslo/feature/qrc/domain/model/session/PayPalWorldTransactionDetails;", "component11", "()Lcom/paypal/oslo/feature/qrc/domain/model/session/PaymentResponse;", "component12", "()Lcom/paypal/oslo/feature/qrc/domain/model/review/PaymentOptions;", "copy", "(Ljava/lang/String;Lcom/paypal/oslo/feature/qrc/domain/model/session/QrcMode;Lcom/paypal/oslo/feature/qrc/domain/model/session/QrCodeType;Lcom/paypal/oslo/feature/qrc/domain/model/session/QrcPointOfInitiationMethod;Lcom/paypal/oslo/feature/qrc/domain/model/session/ProductFlow;Lcom/paypal/oslo/feature/qrc/domain/model/session/QrcSessionRequiredAction;Lcom/paypal/oslo/feature/qrc/domain/model/session/QrcTransactionDetails;Lcom/paypal/oslo/feature/qrc/domain/model/session/QrcParticipants;Lcom/paypal/oslo/feature/qrc/domain/model/session/QrcTipDetails;Lcom/paypal/oslo/feature/qrc/domain/model/session/PayPalWorldTransactionDetails;Lcom/paypal/oslo/feature/qrc/domain/model/session/PaymentResponse;Lcom/paypal/oslo/feature/qrc/domain/model/review/PaymentOptions;)Lcom/paypal/oslo/feature/qrc/domain/model/session/QrcSessionNavArgs;", "other", "", "equals", "(Ljava/lang/Object;)Z", "hashCode", "()I", "toString", "self", "Lkotlinx/serialization/encoding/CompositeEncoder;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "", "write$Self$qrc_prodRelease", "(Lcom/paypal/oslo/feature/qrc/domain/model/session/QrcSessionNavArgs;Lkotlinx/serialization/encoding/CompositeEncoder;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "Ljava/lang/String;", "getSessionId", "Lcom/paypal/oslo/feature/qrc/domain/model/session/QrcMode;", "getMode", "Lcom/paypal/oslo/feature/qrc/domain/model/session/QrCodeType;", "getQrCodeType", "Lcom/paypal/oslo/feature/qrc/domain/model/session/QrcPointOfInitiationMethod;", "getPointOfInitiationMethod", "Lcom/paypal/oslo/feature/qrc/domain/model/session/ProductFlow;", "getProductFlow", "Lcom/paypal/oslo/feature/qrc/domain/model/session/QrcSessionRequiredAction;", "getRequiredAction", "Lcom/paypal/oslo/feature/qrc/domain/model/session/QrcTransactionDetails;", "getTransactionDetails", "Lcom/paypal/oslo/feature/qrc/domain/model/session/QrcParticipants;", "getParticipants", "Lcom/paypal/oslo/feature/qrc/domain/model/session/QrcTipDetails;", "getTipDetails", "Lcom/paypal/oslo/feature/qrc/domain/model/session/PayPalWorldTransactionDetails;", "getPaypalWorldDetails", "Lcom/paypal/oslo/feature/qrc/domain/model/session/PaymentResponse;", "getPaymentResponse", "Lcom/paypal/oslo/feature/qrc/domain/model/review/PaymentOptions;", "getPaymentOptions", "isPayPalWorldQR", "()Z", "getShouldCollectTransactionAmount", "shouldCollectTransactionAmount", "Companion", "$serializer"}, k = 1, mv = {2, 3, 0}, xi = 48)
@kotlinx.serialization.Serializable
/* loaded from: classes2.dex */
public final /* data */ class QrcSessionNavArgs {
    private final com.paypal.oslo.feature.qrc.domain.model.session.QrcMode mode;
    private final com.paypal.oslo.feature.qrc.domain.model.session.QrcParticipants participants;
    private final com.paypal.oslo.feature.qrc.domain.model.review.PaymentOptions paymentOptions;
    private final com.paypal.oslo.feature.qrc.domain.model.session.PaymentResponse paymentResponse;
    private final com.paypal.oslo.feature.qrc.domain.model.session.PayPalWorldTransactionDetails paypalWorldDetails;
    private final com.paypal.oslo.feature.qrc.domain.model.session.QrcPointOfInitiationMethod pointOfInitiationMethod;
    private final com.paypal.oslo.feature.qrc.domain.model.session.ProductFlow productFlow;
    private final com.paypal.oslo.feature.qrc.domain.model.session.QrCodeType qrCodeType;
    private final com.paypal.oslo.feature.qrc.domain.model.session.QrcSessionRequiredAction requiredAction;
    private final java.lang.String sessionId;
    private final com.paypal.oslo.feature.qrc.domain.model.session.QrcTipDetails tipDetails;
    private final com.paypal.oslo.feature.qrc.domain.model.session.QrcTransactionDetails transactionDetails;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final com.paypal.oslo.feature.qrc.domain.model.session.QrcSessionNavArgs.Companion INSTANCE = new com.paypal.oslo.feature.qrc.domain.model.session.QrcSessionNavArgs.Companion(null);
    public static final int $stable = 8;
    private static final kotlin.Lazy<kotlinx.serialization.KSerializer<java.lang.Object>>[] $childSerializers = {null, kotlin.LazyKt.lazy(kotlin.LazyThreadSafetyMode.PUBLICATION, new kotlin.jvm.functions.Function0() { // from class: com.paypal.oslo.feature.qrc.domain.model.session.QrcSessionNavArgs$$ExternalSyntheticLambda0
        @Override // kotlin.jvm.functions.Function0
        public final java.lang.Object invoke() {
            kotlinx.serialization.KSerializer serializer;
            serializer = com.paypal.oslo.feature.qrc.domain.model.session.QrcMode.INSTANCE.serializer();
            return serializer;
        }
    }), kotlin.LazyKt.lazy(kotlin.LazyThreadSafetyMode.PUBLICATION, new kotlin.jvm.functions.Function0() { // from class: com.paypal.oslo.feature.qrc.domain.model.session.QrcSessionNavArgs$$ExternalSyntheticLambda1
        @Override // kotlin.jvm.functions.Function0
        public final java.lang.Object invoke() {
            kotlinx.serialization.KSerializer serializer;
            serializer = com.paypal.oslo.feature.qrc.domain.model.session.QrCodeType.INSTANCE.serializer();
            return serializer;
        }
    }), kotlin.LazyKt.lazy(kotlin.LazyThreadSafetyMode.PUBLICATION, new kotlin.jvm.functions.Function0() { // from class: com.paypal.oslo.feature.qrc.domain.model.session.QrcSessionNavArgs$$ExternalSyntheticLambda2
        @Override // kotlin.jvm.functions.Function0
        public final java.lang.Object invoke() {
            kotlinx.serialization.KSerializer serializer;
            serializer = com.paypal.oslo.feature.qrc.domain.model.session.QrcPointOfInitiationMethod.INSTANCE.serializer();
            return serializer;
        }
    }), kotlin.LazyKt.lazy(kotlin.LazyThreadSafetyMode.PUBLICATION, new kotlin.jvm.functions.Function0() { // from class: com.paypal.oslo.feature.qrc.domain.model.session.QrcSessionNavArgs$$ExternalSyntheticLambda3
        @Override // kotlin.jvm.functions.Function0
        public final java.lang.Object invoke() {
            kotlinx.serialization.KSerializer serializer;
            serializer = com.paypal.oslo.feature.qrc.domain.model.session.ProductFlow.INSTANCE.serializer();
            return serializer;
        }
    }), kotlin.LazyKt.lazy(kotlin.LazyThreadSafetyMode.PUBLICATION, new kotlin.jvm.functions.Function0() { // from class: com.paypal.oslo.feature.qrc.domain.model.session.QrcSessionNavArgs$$ExternalSyntheticLambda4
        @Override // kotlin.jvm.functions.Function0
        public final java.lang.Object invoke() {
            kotlinx.serialization.KSerializer serializer;
            serializer = com.paypal.oslo.feature.qrc.domain.model.session.QrcSessionRequiredAction.INSTANCE.serializer();
            return serializer;
        }
    }), null, null, null, null, null, null};

    @kotlin.Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"Lcom/paypal/oslo/feature/qrc/domain/model/session/QrcSessionNavArgs$Companion;", "", "<init>", "()V", "Lkotlinx/serialization/KSerializer;", "Lcom/paypal/oslo/feature/qrc/domain/model/session/QrcSessionNavArgs;", "serializer", "()Lkotlinx/serialization/KSerializer;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    /* loaded from: classes14.dex */
    public static final class Companion {
        private Companion() {
        }

        public final kotlinx.serialization.KSerializer<com.paypal.oslo.feature.qrc.domain.model.session.QrcSessionNavArgs> serializer() {
            return com.paypal.oslo.feature.qrc.domain.model.session.QrcSessionNavArgs$$serializer.INSTANCE;
        }

        public /* synthetic */ Companion(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public /* synthetic */ QrcSessionNavArgs(int i, java.lang.String str, com.paypal.oslo.feature.qrc.domain.model.session.QrcMode qrcMode, com.paypal.oslo.feature.qrc.domain.model.session.QrCodeType qrCodeType, com.paypal.oslo.feature.qrc.domain.model.session.QrcPointOfInitiationMethod qrcPointOfInitiationMethod, com.paypal.oslo.feature.qrc.domain.model.session.ProductFlow productFlow, com.paypal.oslo.feature.qrc.domain.model.session.QrcSessionRequiredAction qrcSessionRequiredAction, com.paypal.oslo.feature.qrc.domain.model.session.QrcTransactionDetails qrcTransactionDetails, com.paypal.oslo.feature.qrc.domain.model.session.QrcParticipants qrcParticipants, com.paypal.oslo.feature.qrc.domain.model.session.QrcTipDetails qrcTipDetails, com.paypal.oslo.feature.qrc.domain.model.session.PayPalWorldTransactionDetails payPalWorldTransactionDetails, com.paypal.oslo.feature.qrc.domain.model.session.PaymentResponse paymentResponse, com.paypal.oslo.feature.qrc.domain.model.review.PaymentOptions paymentOptions, kotlinx.serialization.internal.SerializationConstructorMarker serializationConstructorMarker) {
        if (4095 != (i & my.com.softspace.ssfasstapsdk.SSFasstapSDK.CardScheme.ALL)) {
            kotlinx.serialization.internal.PluginExceptionsKt.throwMissingFieldException(i, my.com.softspace.ssfasstapsdk.SSFasstapSDK.CardScheme.ALL, com.paypal.oslo.feature.qrc.domain.model.session.QrcSessionNavArgs$$serializer.INSTANCE.getDescriptor());
        }
        this.sessionId = str;
        this.mode = qrcMode;
        this.qrCodeType = qrCodeType;
        this.pointOfInitiationMethod = qrcPointOfInitiationMethod;
        this.productFlow = productFlow;
        this.requiredAction = qrcSessionRequiredAction;
        this.transactionDetails = qrcTransactionDetails;
        this.participants = qrcParticipants;
        this.tipDetails = qrcTipDetails;
        this.paypalWorldDetails = payPalWorldTransactionDetails;
        this.paymentResponse = paymentResponse;
        this.paymentOptions = paymentOptions;
    }

    public QrcSessionNavArgs(java.lang.String str, com.paypal.oslo.feature.qrc.domain.model.session.QrcMode qrcMode, com.paypal.oslo.feature.qrc.domain.model.session.QrCodeType qrCodeType, com.paypal.oslo.feature.qrc.domain.model.session.QrcPointOfInitiationMethod qrcPointOfInitiationMethod, com.paypal.oslo.feature.qrc.domain.model.session.ProductFlow productFlow, com.paypal.oslo.feature.qrc.domain.model.session.QrcSessionRequiredAction qrcSessionRequiredAction, com.paypal.oslo.feature.qrc.domain.model.session.QrcTransactionDetails qrcTransactionDetails, com.paypal.oslo.feature.qrc.domain.model.session.QrcParticipants qrcParticipants, com.paypal.oslo.feature.qrc.domain.model.session.QrcTipDetails qrcTipDetails, com.paypal.oslo.feature.qrc.domain.model.session.PayPalWorldTransactionDetails payPalWorldTransactionDetails, com.paypal.oslo.feature.qrc.domain.model.session.PaymentResponse paymentResponse, com.paypal.oslo.feature.qrc.domain.model.review.PaymentOptions paymentOptions) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(qrcTransactionDetails, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(qrcParticipants, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(qrcTipDetails, "");
        this.sessionId = str;
        this.mode = qrcMode;
        this.qrCodeType = qrCodeType;
        this.pointOfInitiationMethod = qrcPointOfInitiationMethod;
        this.productFlow = productFlow;
        this.requiredAction = qrcSessionRequiredAction;
        this.transactionDetails = qrcTransactionDetails;
        this.participants = qrcParticipants;
        this.tipDetails = qrcTipDetails;
        this.paypalWorldDetails = payPalWorldTransactionDetails;
        this.paymentResponse = paymentResponse;
        this.paymentOptions = paymentOptions;
    }

    @kotlin.jvm.JvmStatic
    public static final /* synthetic */ void write$Self$qrc_prodRelease(com.paypal.oslo.feature.qrc.domain.model.session.QrcSessionNavArgs self, kotlinx.serialization.encoding.CompositeEncoder output, kotlinx.serialization.descriptors.SerialDescriptor serialDesc) {
        kotlin.Lazy<kotlinx.serialization.KSerializer<java.lang.Object>>[] lazyArr = $childSerializers;
        output.encodeStringElement(serialDesc, 0, self.sessionId);
        output.encodeNullableSerializableElement(serialDesc, 1, lazyArr[1].getValue(), self.mode);
        output.encodeNullableSerializableElement(serialDesc, 2, lazyArr[2].getValue(), self.qrCodeType);
        output.encodeNullableSerializableElement(serialDesc, 3, lazyArr[3].getValue(), self.pointOfInitiationMethod);
        output.encodeNullableSerializableElement(serialDesc, 4, lazyArr[4].getValue(), self.productFlow);
        output.encodeNullableSerializableElement(serialDesc, 5, lazyArr[5].getValue(), self.requiredAction);
        output.encodeSerializableElement(serialDesc, 6, com.paypal.oslo.feature.qrc.domain.model.session.QrcTransactionDetails$$serializer.INSTANCE, self.transactionDetails);
        output.encodeSerializableElement(serialDesc, 7, com.paypal.oslo.feature.qrc.domain.model.session.QrcParticipants$$serializer.INSTANCE, self.participants);
        output.encodeSerializableElement(serialDesc, 8, com.paypal.oslo.feature.qrc.domain.model.session.QrcTipDetails$$serializer.INSTANCE, self.tipDetails);
        output.encodeNullableSerializableElement(serialDesc, 9, com.paypal.oslo.feature.qrc.domain.model.session.PayPalWorldTransactionDetails$$serializer.INSTANCE, self.paypalWorldDetails);
        output.encodeNullableSerializableElement(serialDesc, 10, com.paypal.oslo.feature.qrc.domain.model.session.PaymentResponse$$serializer.INSTANCE, self.paymentResponse);
        output.encodeNullableSerializableElement(serialDesc, 11, com.paypal.oslo.feature.qrc.domain.model.review.PaymentOptions$$serializer.INSTANCE, self.paymentOptions);
    }

    public final java.lang.String getSessionId() {
        return this.sessionId;
    }

    public final com.paypal.oslo.feature.qrc.domain.model.session.QrcMode getMode() {
        return this.mode;
    }

    public final com.paypal.oslo.feature.qrc.domain.model.session.QrCodeType getQrCodeType() {
        return this.qrCodeType;
    }

    public final com.paypal.oslo.feature.qrc.domain.model.session.QrcPointOfInitiationMethod getPointOfInitiationMethod() {
        return this.pointOfInitiationMethod;
    }

    public final com.paypal.oslo.feature.qrc.domain.model.session.ProductFlow getProductFlow() {
        return this.productFlow;
    }

    public final com.paypal.oslo.feature.qrc.domain.model.session.QrcSessionRequiredAction getRequiredAction() {
        return this.requiredAction;
    }

    public final com.paypal.oslo.feature.qrc.domain.model.session.QrcTransactionDetails getTransactionDetails() {
        return this.transactionDetails;
    }

    public final com.paypal.oslo.feature.qrc.domain.model.session.QrcParticipants getParticipants() {
        return this.participants;
    }

    public final com.paypal.oslo.feature.qrc.domain.model.session.QrcTipDetails getTipDetails() {
        return this.tipDetails;
    }

    public final com.paypal.oslo.feature.qrc.domain.model.session.PayPalWorldTransactionDetails getPaypalWorldDetails() {
        return this.paypalWorldDetails;
    }

    public final com.paypal.oslo.feature.qrc.domain.model.session.PaymentResponse getPaymentResponse() {
        return this.paymentResponse;
    }

    public final com.paypal.oslo.feature.qrc.domain.model.review.PaymentOptions getPaymentOptions() {
        return this.paymentOptions;
    }

    public final boolean isPayPalWorldQR() {
        return this.qrCodeType == com.paypal.oslo.feature.qrc.domain.model.session.QrCodeType.PAYPAL_WORLD;
    }

    public final boolean getShouldCollectTransactionAmount() {
        return this.pointOfInitiationMethod == com.paypal.oslo.feature.qrc.domain.model.session.QrcPointOfInitiationMethod.STATIC && this.paymentOptions == null;
    }

    public final java.lang.String toString() {
        java.lang.String str = this.sessionId;
        com.paypal.oslo.feature.qrc.domain.model.session.QrcMode qrcMode = this.mode;
        com.paypal.oslo.feature.qrc.domain.model.session.QrCodeType qrCodeType = this.qrCodeType;
        com.paypal.oslo.feature.qrc.domain.model.session.QrcPointOfInitiationMethod qrcPointOfInitiationMethod = this.pointOfInitiationMethod;
        com.paypal.oslo.feature.qrc.domain.model.session.ProductFlow productFlow = this.productFlow;
        com.paypal.oslo.feature.qrc.domain.model.session.QrcSessionRequiredAction qrcSessionRequiredAction = this.requiredAction;
        com.paypal.oslo.feature.qrc.domain.model.session.QrcTransactionDetails qrcTransactionDetails = this.transactionDetails;
        com.paypal.oslo.feature.qrc.domain.model.session.QrcParticipants qrcParticipants = this.participants;
        com.paypal.oslo.feature.qrc.domain.model.session.QrcTipDetails qrcTipDetails = this.tipDetails;
        com.paypal.oslo.feature.qrc.domain.model.session.PayPalWorldTransactionDetails payPalWorldTransactionDetails = this.paypalWorldDetails;
        com.paypal.oslo.feature.qrc.domain.model.session.PaymentResponse paymentResponse = this.paymentResponse;
        com.paypal.oslo.feature.qrc.domain.model.review.PaymentOptions paymentOptions = this.paymentOptions;
        java.lang.StringBuilder sb = new java.lang.StringBuilder("QrcSessionNavArgs(sessionId=");
        sb.append(str);
        sb.append(", mode=");
        sb.append(qrcMode);
        sb.append(", qrCodeType=");
        sb.append(qrCodeType);
        sb.append(", pointOfInitiationMethod=");
        sb.append(qrcPointOfInitiationMethod);
        sb.append(", productFlow=");
        sb.append(productFlow);
        sb.append(", requiredAction=");
        sb.append(qrcSessionRequiredAction);
        sb.append(", transactionDetails=");
        sb.append(qrcTransactionDetails);
        sb.append(", participants=");
        sb.append(qrcParticipants);
        sb.append(", tipDetails=");
        sb.append(qrcTipDetails);
        sb.append(", paypalWorldDetails=");
        sb.append(payPalWorldTransactionDetails);
        sb.append(", paymentResponse=");
        sb.append(paymentResponse);
        sb.append(", paymentOptions=");
        sb.append(paymentOptions);
        sb.append(")");
        return sb.toString();
    }

    public final int hashCode() {
        int hashCode = this.sessionId.hashCode();
        com.paypal.oslo.feature.qrc.domain.model.session.QrcMode qrcMode = this.mode;
        int hashCode2 = qrcMode == null ? 0 : qrcMode.hashCode();
        com.paypal.oslo.feature.qrc.domain.model.session.QrCodeType qrCodeType = this.qrCodeType;
        int hashCode3 = qrCodeType == null ? 0 : qrCodeType.hashCode();
        com.paypal.oslo.feature.qrc.domain.model.session.QrcPointOfInitiationMethod qrcPointOfInitiationMethod = this.pointOfInitiationMethod;
        int hashCode4 = qrcPointOfInitiationMethod == null ? 0 : qrcPointOfInitiationMethod.hashCode();
        com.paypal.oslo.feature.qrc.domain.model.session.ProductFlow productFlow = this.productFlow;
        int hashCode5 = productFlow == null ? 0 : productFlow.hashCode();
        com.paypal.oslo.feature.qrc.domain.model.session.QrcSessionRequiredAction qrcSessionRequiredAction = this.requiredAction;
        int hashCode6 = qrcSessionRequiredAction == null ? 0 : qrcSessionRequiredAction.hashCode();
        int hashCode7 = this.transactionDetails.hashCode();
        int hashCode8 = this.participants.hashCode();
        int hashCode9 = this.tipDetails.hashCode();
        com.paypal.oslo.feature.qrc.domain.model.session.PayPalWorldTransactionDetails payPalWorldTransactionDetails = this.paypalWorldDetails;
        int hashCode10 = payPalWorldTransactionDetails == null ? 0 : payPalWorldTransactionDetails.hashCode();
        com.paypal.oslo.feature.qrc.domain.model.session.PaymentResponse paymentResponse = this.paymentResponse;
        int hashCode11 = paymentResponse == null ? 0 : paymentResponse.hashCode();
        com.paypal.oslo.feature.qrc.domain.model.review.PaymentOptions paymentOptions = this.paymentOptions;
        return (((((((((((((((((((((hashCode * 31) + hashCode2) * 31) + hashCode3) * 31) + hashCode4) * 31) + hashCode5) * 31) + hashCode6) * 31) + hashCode7) * 31) + hashCode8) * 31) + hashCode9) * 31) + hashCode10) * 31) + hashCode11) * 31) + (paymentOptions != null ? paymentOptions.hashCode() : 0);
    }

    public final boolean equals(java.lang.Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof com.paypal.oslo.feature.qrc.domain.model.session.QrcSessionNavArgs)) {
            return false;
        }
        com.paypal.oslo.feature.qrc.domain.model.session.QrcSessionNavArgs qrcSessionNavArgs = (com.paypal.oslo.feature.qrc.domain.model.session.QrcSessionNavArgs) other;
        return kotlin.jvm.internal.Intrinsics.areEqual(this.sessionId, qrcSessionNavArgs.sessionId) && this.mode == qrcSessionNavArgs.mode && this.qrCodeType == qrcSessionNavArgs.qrCodeType && this.pointOfInitiationMethod == qrcSessionNavArgs.pointOfInitiationMethod && this.productFlow == qrcSessionNavArgs.productFlow && kotlin.jvm.internal.Intrinsics.areEqual(this.requiredAction, qrcSessionNavArgs.requiredAction) && kotlin.jvm.internal.Intrinsics.areEqual(this.transactionDetails, qrcSessionNavArgs.transactionDetails) && kotlin.jvm.internal.Intrinsics.areEqual(this.participants, qrcSessionNavArgs.participants) && kotlin.jvm.internal.Intrinsics.areEqual(this.tipDetails, qrcSessionNavArgs.tipDetails) && kotlin.jvm.internal.Intrinsics.areEqual(this.paypalWorldDetails, qrcSessionNavArgs.paypalWorldDetails) && kotlin.jvm.internal.Intrinsics.areEqual(this.paymentResponse, qrcSessionNavArgs.paymentResponse) && kotlin.jvm.internal.Intrinsics.areEqual(this.paymentOptions, qrcSessionNavArgs.paymentOptions);
    }

    public final com.paypal.oslo.feature.qrc.domain.model.session.QrcSessionNavArgs copy(java.lang.String sessionId, com.paypal.oslo.feature.qrc.domain.model.session.QrcMode mode, com.paypal.oslo.feature.qrc.domain.model.session.QrCodeType qrCodeType, com.paypal.oslo.feature.qrc.domain.model.session.QrcPointOfInitiationMethod pointOfInitiationMethod, com.paypal.oslo.feature.qrc.domain.model.session.ProductFlow productFlow, com.paypal.oslo.feature.qrc.domain.model.session.QrcSessionRequiredAction requiredAction, com.paypal.oslo.feature.qrc.domain.model.session.QrcTransactionDetails transactionDetails, com.paypal.oslo.feature.qrc.domain.model.session.QrcParticipants participants, com.paypal.oslo.feature.qrc.domain.model.session.QrcTipDetails tipDetails, com.paypal.oslo.feature.qrc.domain.model.session.PayPalWorldTransactionDetails paypalWorldDetails, com.paypal.oslo.feature.qrc.domain.model.session.PaymentResponse paymentResponse, com.paypal.oslo.feature.qrc.domain.model.review.PaymentOptions paymentOptions) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(sessionId, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(transactionDetails, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(participants, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(tipDetails, "");
        return new com.paypal.oslo.feature.qrc.domain.model.session.QrcSessionNavArgs(sessionId, mode, qrCodeType, pointOfInitiationMethod, productFlow, requiredAction, transactionDetails, participants, tipDetails, paypalWorldDetails, paymentResponse, paymentOptions);
    }

    /* renamed from: component9, reason: from getter */
    public final com.paypal.oslo.feature.qrc.domain.model.session.QrcTipDetails getTipDetails() {
        return this.tipDetails;
    }

    /* renamed from: component8, reason: from getter */
    public final com.paypal.oslo.feature.qrc.domain.model.session.QrcParticipants getParticipants() {
        return this.participants;
    }

    /* renamed from: component7, reason: from getter */
    public final com.paypal.oslo.feature.qrc.domain.model.session.QrcTransactionDetails getTransactionDetails() {
        return this.transactionDetails;
    }

    /* renamed from: component6, reason: from getter */
    public final com.paypal.oslo.feature.qrc.domain.model.session.QrcSessionRequiredAction getRequiredAction() {
        return this.requiredAction;
    }

    /* renamed from: component5, reason: from getter */
    public final com.paypal.oslo.feature.qrc.domain.model.session.ProductFlow getProductFlow() {
        return this.productFlow;
    }

    /* renamed from: component4, reason: from getter */
    public final com.paypal.oslo.feature.qrc.domain.model.session.QrcPointOfInitiationMethod getPointOfInitiationMethod() {
        return this.pointOfInitiationMethod;
    }

    /* renamed from: component3, reason: from getter */
    public final com.paypal.oslo.feature.qrc.domain.model.session.QrCodeType getQrCodeType() {
        return this.qrCodeType;
    }

    /* renamed from: component2, reason: from getter */
    public final com.paypal.oslo.feature.qrc.domain.model.session.QrcMode getMode() {
        return this.mode;
    }

    /* renamed from: component12, reason: from getter */
    public final com.paypal.oslo.feature.qrc.domain.model.review.PaymentOptions getPaymentOptions() {
        return this.paymentOptions;
    }

    /* renamed from: component11, reason: from getter */
    public final com.paypal.oslo.feature.qrc.domain.model.session.PaymentResponse getPaymentResponse() {
        return this.paymentResponse;
    }

    /* renamed from: component10, reason: from getter */
    public final com.paypal.oslo.feature.qrc.domain.model.session.PayPalWorldTransactionDetails getPaypalWorldDetails() {
        return this.paypalWorldDetails;
    }

    /* renamed from: component1, reason: from getter */
    public final java.lang.String getSessionId() {
        return this.sessionId;
    }
}
