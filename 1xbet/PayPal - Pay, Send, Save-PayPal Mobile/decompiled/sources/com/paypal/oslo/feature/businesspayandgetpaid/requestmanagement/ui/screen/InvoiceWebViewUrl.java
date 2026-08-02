package com.paypal.oslo.feature.businesspayandgetpaid.requestmanagement.ui.screen;

@kotlin.Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\b1\u0018\u0000 \u00172\u00020\u0001:\u0004\u0018\u0019\u001a\u0017B\u0011\b\u0004\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005B%\b\u0016\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\n\u001a\u0004\u0018\u00010\t¢\u0006\u0004\b\u0004\u0010\u000bJ'\u0010\u0012\u001a\u00020\u00112\u0006\u0010\f\u001a\u00020\u00002\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0010\u001a\u00020\u000fH\u0007¢\u0006\u0004\b\u0012\u0010\u0013R\u0017\u0010\b\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\b\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016\u0082\u0001\u0003\u001b\u001c\u001d"}, d2 = {"Lcom/paypal/oslo/feature/businesspayandgetpaid/requestmanagement/ui/screen/InvoiceWebViewUrl;", "", "", "p0", "<init>", "(Ljava/lang/String;)V", "", "seen0", "invoiceId", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "serializationConstructorMarker", "(ILjava/lang/String;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", "self", "Lkotlinx/serialization/encoding/CompositeEncoder;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "", "write$Self", "(Lcom/paypal/oslo/feature/businesspayandgetpaid/requestmanagement/ui/screen/InvoiceWebViewUrl;Lkotlinx/serialization/encoding/CompositeEncoder;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "Ljava/lang/String;", "getInvoiceId", "()Ljava/lang/String;", "Companion", "InvoiceDetailsUrl", "CopyInvoiceUrl", "EditInvoiceUrl", "Lcom/paypal/oslo/feature/businesspayandgetpaid/requestmanagement/ui/screen/InvoiceWebViewUrl$CopyInvoiceUrl;", "Lcom/paypal/oslo/feature/businesspayandgetpaid/requestmanagement/ui/screen/InvoiceWebViewUrl$EditInvoiceUrl;", "Lcom/paypal/oslo/feature/businesspayandgetpaid/requestmanagement/ui/screen/InvoiceWebViewUrl$InvoiceDetailsUrl;"}, k = 1, mv = {2, 3, 0}, xi = 48)
@kotlinx.serialization.Serializable
/* loaded from: classes2.dex */
public abstract class InvoiceWebViewUrl {
    public static final int $stable = 0;
    private final java.lang.String invoiceId;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final com.paypal.oslo.feature.businesspayandgetpaid.requestmanagement.ui.screen.InvoiceWebViewUrl.Companion INSTANCE = new com.paypal.oslo.feature.businesspayandgetpaid.requestmanagement.ui.screen.InvoiceWebViewUrl.Companion(null);
    private static final kotlin.Lazy<kotlinx.serialization.KSerializer<java.lang.Object>> $cachedSerializer$delegate = kotlin.LazyKt.lazy(kotlin.LazyThreadSafetyMode.PUBLICATION, new kotlin.jvm.functions.Function0() { // from class: com.paypal.oslo.feature.businesspayandgetpaid.requestmanagement.ui.screen.InvoiceWebViewUrl$$ExternalSyntheticLambda0
        @Override // kotlin.jvm.functions.Function0
        public final java.lang.Object invoke() {
            return com.paypal.oslo.feature.businesspayandgetpaid.requestmanagement.ui.screen.InvoiceWebViewUrl.$r8$lambda$B0o6jkx1wY1VGNdjXEFVnR2mWS8();
        }
    });

    @kotlin.Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"Lcom/paypal/oslo/feature/businesspayandgetpaid/requestmanagement/ui/screen/InvoiceWebViewUrl$Companion;", "", "<init>", "()V", "Lkotlinx/serialization/KSerializer;", "Lcom/paypal/oslo/feature/businesspayandgetpaid/requestmanagement/ui/screen/InvoiceWebViewUrl;", "serializer", "()Lkotlinx/serialization/KSerializer;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    /* loaded from: classes11.dex */
    public static final class Companion {
        private Companion() {
        }

        public final kotlinx.serialization.KSerializer<com.paypal.oslo.feature.businesspayandgetpaid.requestmanagement.ui.screen.InvoiceWebViewUrl> serializer() {
            return (kotlinx.serialization.KSerializer) com.paypal.oslo.feature.businesspayandgetpaid.requestmanagement.ui.screen.InvoiceWebViewUrl.$cachedSerializer$delegate.getValue();
        }

        public /* synthetic */ Companion(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    private InvoiceWebViewUrl(java.lang.String str) {
        this.invoiceId = str;
    }

    @kotlin.Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lcom/paypal/oslo/feature/businesspayandgetpaid/requestmanagement/ui/screen/InvoiceWebViewUrl$InvoiceDetailsUrl;", "Lcom/paypal/oslo/feature/businesspayandgetpaid/requestmanagement/ui/screen/InvoiceWebViewUrl;", "", "invoiceId", "<init>", "(Ljava/lang/String;)V"}, k = 1, mv = {2, 3, 0}, xi = 48)
    /* loaded from: classes11.dex */
    public static final class InvoiceDetailsUrl extends com.paypal.oslo.feature.businesspayandgetpaid.requestmanagement.ui.screen.InvoiceWebViewUrl {
        public static final int $stable = 0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public InvoiceDetailsUrl(java.lang.String str) {
            super(str, null);
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
        }
    }

    public final java.lang.String getInvoiceId() {
        return this.invoiceId;
    }

    @kotlin.Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lcom/paypal/oslo/feature/businesspayandgetpaid/requestmanagement/ui/screen/InvoiceWebViewUrl$CopyInvoiceUrl;", "Lcom/paypal/oslo/feature/businesspayandgetpaid/requestmanagement/ui/screen/InvoiceWebViewUrl;", "", "invoiceId", "<init>", "(Ljava/lang/String;)V"}, k = 1, mv = {2, 3, 0}, xi = 48)
    /* loaded from: classes11.dex */
    public static final class CopyInvoiceUrl extends com.paypal.oslo.feature.businesspayandgetpaid.requestmanagement.ui.screen.InvoiceWebViewUrl {
        public static final int $stable = 0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public CopyInvoiceUrl(java.lang.String str) {
            super(str, null);
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
        }
    }

    @kotlin.Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lcom/paypal/oslo/feature/businesspayandgetpaid/requestmanagement/ui/screen/InvoiceWebViewUrl$EditInvoiceUrl;", "Lcom/paypal/oslo/feature/businesspayandgetpaid/requestmanagement/ui/screen/InvoiceWebViewUrl;", "", "invoiceId", "<init>", "(Ljava/lang/String;)V"}, k = 1, mv = {2, 3, 0}, xi = 48)
    /* loaded from: classes11.dex */
    public static final class EditInvoiceUrl extends com.paypal.oslo.feature.businesspayandgetpaid.requestmanagement.ui.screen.InvoiceWebViewUrl {
        public static final int $stable = 0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public EditInvoiceUrl(java.lang.String str) {
            super(str, null);
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
        }
    }

    public static /* synthetic */ kotlinx.serialization.KSerializer $r8$lambda$B0o6jkx1wY1VGNdjXEFVnR2mWS8() {
        return new kotlinx.serialization.SealedClassSerializer("com.paypal.oslo.feature.businesspayandgetpaid.requestmanagement.ui.screen.InvoiceWebViewUrl", kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(com.paypal.oslo.feature.businesspayandgetpaid.requestmanagement.ui.screen.InvoiceWebViewUrl.class), new kotlin.reflect.KClass[0], new kotlinx.serialization.KSerializer[0], new java.lang.annotation.Annotation[0]);
    }

    public /* synthetic */ InvoiceWebViewUrl(java.lang.String str, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this(str);
    }
}
