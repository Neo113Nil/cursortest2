package com.zettle.sdk.core.user;

@kotlin.Metadata(d1 = {"\u0000|\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u001d\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u001a\b\u0087\b\u0018\u0000 ^2\u00020\u0001:\u0002_^B\u0089\u0001\b\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\n\u0012\b\u0010\r\u001a\u0004\u0018\u00010\f\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\u000e\u0012\b\u0010\u0011\u001a\u0004\u0018\u00010\u0010\u0012\b\u0010\u0013\u001a\u0004\u0018\u00010\u0012\u0012\b\u0010\u0015\u001a\u0004\u0018\u00010\u0014\u0012\b\u0010\u0017\u001a\u0004\u0018\u00010\u0016\u0012\b\u0010\u0019\u001a\u0004\u0018\u00010\u0018\u0012\b\u0010\u001b\u001a\u0004\u0018\u00010\u001a¢\u0006\u0004\b\u001c\u0010\u001dBu\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\n\u0012\b\u0010\r\u001a\u0004\u0018\u00010\f\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\u000e\u0012\b\u0010\u0011\u001a\u0004\u0018\u00010\u0010\u0012\b\u0010\u0013\u001a\u0004\u0018\u00010\u0012\u0012\b\u0010\u0015\u001a\u0004\u0018\u00010\u0014\u0012\b\u0010\u0017\u001a\u0004\u0018\u00010\u0016\u0012\b\u0010\u0019\u001a\u0004\u0018\u00010\u0018¢\u0006\u0004\b\u001c\u0010\u001eJ\u0012\u0010\u001f\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b\u001f\u0010 J\u0012\u0010!\u001a\u0004\u0018\u00010\u0016HÆ\u0003¢\u0006\u0004\b!\u0010\"J\u0012\u0010#\u001a\u0004\u0018\u00010\u0018HÆ\u0003¢\u0006\u0004\b#\u0010$J\u0012\u0010%\u001a\u0004\u0018\u00010\u0006HÆ\u0003¢\u0006\u0004\b%\u0010&J\u0012\u0010'\u001a\u0004\u0018\u00010\bHÆ\u0003¢\u0006\u0004\b'\u0010(J\u0012\u0010)\u001a\u0004\u0018\u00010\nHÆ\u0003¢\u0006\u0004\b)\u0010*J\u0012\u0010+\u001a\u0004\u0018\u00010\fHÆ\u0003¢\u0006\u0004\b+\u0010,J\u0012\u0010-\u001a\u0004\u0018\u00010\u000eHÆ\u0003¢\u0006\u0004\b-\u0010.J\u0012\u0010/\u001a\u0004\u0018\u00010\u0010HÆ\u0003¢\u0006\u0004\b/\u00100J\u0012\u00101\u001a\u0004\u0018\u00010\u0012HÆ\u0003¢\u0006\u0004\b1\u00102J\u0012\u00103\u001a\u0004\u0018\u00010\u0014HÆ\u0003¢\u0006\u0004\b3\u00104J\u0094\u0001\u00105\u001a\u00020\u00002\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\b2\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\n2\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\f2\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u000e2\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u00102\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u00122\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00010\u00142\n\b\u0002\u0010\u0017\u001a\u0004\u0018\u00010\u00162\n\b\u0002\u0010\u0019\u001a\u0004\u0018\u00010\u0018HÆ\u0001¢\u0006\u0004\b5\u00106J\u001a\u00109\u001a\u0002082\b\u00107\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b9\u0010:J\u0010\u0010;\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b;\u0010<J\u0010\u0010>\u001a\u00020=HÖ\u0001¢\u0006\u0004\b>\u0010?J(\u0010F\u001a\u00020E2\u0006\u0010@\u001a\u00020\u00002\u0006\u0010B\u001a\u00020A2\u0006\u0010D\u001a\u00020CHÇ\u0001¢\u0006\u0004\bF\u0010GR\u0019\u0010\u000b\u001a\u0004\u0018\u00010\n8\u0007¢\u0006\f\n\u0004\b\u000b\u0010H\u001a\u0004\bI\u0010*R\u001c\u0010\r\u001a\u0004\u0018\u00010\f8\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\r\u0010J\u001a\u0004\bK\u0010,R\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010L\u001a\u0004\bM\u0010 R\u001c\u0010\u0013\u001a\u0004\u0018\u00010\u00128\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0013\u0010N\u001a\u0004\bO\u00102R\u001c\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010P\u001a\u0004\bQ\u0010&R\u001c\u0010\u0011\u001a\u0004\u0018\u00010\u00108\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0011\u0010R\u001a\u0004\bS\u00100R\u001c\u0010\u000f\u001a\u0004\u0018\u00010\u000e8\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u000f\u0010T\u001a\u0004\bU\u0010.R\u001c\u0010\u0015\u001a\u0004\u0018\u00010\u00148\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0015\u0010V\u001a\u0004\bW\u00104R\u001c\u0010\t\u001a\u0004\u0018\u00010\b8\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\t\u0010X\u001a\u0004\bY\u0010(R\u001c\u0010\u0019\u001a\u0004\u0018\u00010\u00188\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0019\u0010Z\u001a\u0004\b[\u0010$R\u001c\u0010\u0017\u001a\u0004\u0018\u00010\u00168\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0017\u0010\\\u001a\u0004\b]\u0010\""}, d2 = {"Lcom/zettle/sdk/core/user/OrganizationSettings;", "", "", "seen1", "Lcom/zettle/sdk/core/user/CustomersSettings;", "customersSettings", "Lcom/zettle/sdk/core/user/InvoiceSettings;", "invoiceSettings", "Lcom/zettle/sdk/core/user/PaymentLinkSettings;", "paymentLinkSettings", "Lcom/zettle/sdk/core/user/CashRegisterSettings;", "cashRegisterSettings", "Lcom/zettle/sdk/core/user/CashRegisterTss;", "cashRegisterTss", "Lcom/zettle/sdk/core/user/KlarnaInStoreSettings;", "klarnaInStoreSettings", "Lcom/zettle/sdk/core/user/KeyInSettings;", "keyInSettings", "Lcom/zettle/sdk/core/user/GiftCardSettings;", "giftCardSettings", "Lcom/zettle/sdk/core/user/PayPalQrcSettings;", "payPalQrcSettings", "Lcom/zettle/sdk/core/user/VenmoQrcSettings;", "venmoQrcSettings", "Lcom/zettle/sdk/core/user/ReceiptSettings;", "receiptSettings", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "serializationConstructorMarker", "<init>", "(ILcom/zettle/sdk/core/user/CustomersSettings;Lcom/zettle/sdk/core/user/InvoiceSettings;Lcom/zettle/sdk/core/user/PaymentLinkSettings;Lcom/zettle/sdk/core/user/CashRegisterSettings;Lcom/zettle/sdk/core/user/CashRegisterTss;Lcom/zettle/sdk/core/user/KlarnaInStoreSettings;Lcom/zettle/sdk/core/user/KeyInSettings;Lcom/zettle/sdk/core/user/GiftCardSettings;Lcom/zettle/sdk/core/user/PayPalQrcSettings;Lcom/zettle/sdk/core/user/VenmoQrcSettings;Lcom/zettle/sdk/core/user/ReceiptSettings;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", "(Lcom/zettle/sdk/core/user/CustomersSettings;Lcom/zettle/sdk/core/user/InvoiceSettings;Lcom/zettle/sdk/core/user/PaymentLinkSettings;Lcom/zettle/sdk/core/user/CashRegisterSettings;Lcom/zettle/sdk/core/user/CashRegisterTss;Lcom/zettle/sdk/core/user/KlarnaInStoreSettings;Lcom/zettle/sdk/core/user/KeyInSettings;Lcom/zettle/sdk/core/user/GiftCardSettings;Lcom/zettle/sdk/core/user/PayPalQrcSettings;Lcom/zettle/sdk/core/user/VenmoQrcSettings;Lcom/zettle/sdk/core/user/ReceiptSettings;)V", "component1", "()Lcom/zettle/sdk/core/user/CustomersSettings;", "component10", "()Lcom/zettle/sdk/core/user/VenmoQrcSettings;", "component11", "()Lcom/zettle/sdk/core/user/ReceiptSettings;", "component2", "()Lcom/zettle/sdk/core/user/InvoiceSettings;", "component3", "()Lcom/zettle/sdk/core/user/PaymentLinkSettings;", "component4", "()Lcom/zettle/sdk/core/user/CashRegisterSettings;", "component5", "()Lcom/zettle/sdk/core/user/CashRegisterTss;", "component6", "()Lcom/zettle/sdk/core/user/KlarnaInStoreSettings;", "component7", "()Lcom/zettle/sdk/core/user/KeyInSettings;", "component8", "()Lcom/zettle/sdk/core/user/GiftCardSettings;", "component9", "()Lcom/zettle/sdk/core/user/PayPalQrcSettings;", "copy", "(Lcom/zettle/sdk/core/user/CustomersSettings;Lcom/zettle/sdk/core/user/InvoiceSettings;Lcom/zettle/sdk/core/user/PaymentLinkSettings;Lcom/zettle/sdk/core/user/CashRegisterSettings;Lcom/zettle/sdk/core/user/CashRegisterTss;Lcom/zettle/sdk/core/user/KlarnaInStoreSettings;Lcom/zettle/sdk/core/user/KeyInSettings;Lcom/zettle/sdk/core/user/GiftCardSettings;Lcom/zettle/sdk/core/user/PayPalQrcSettings;Lcom/zettle/sdk/core/user/VenmoQrcSettings;Lcom/zettle/sdk/core/user/ReceiptSettings;)Lcom/zettle/sdk/core/user/OrganizationSettings;", "other", "", "equals", "(Ljava/lang/Object;)Z", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "self", "Lkotlinx/serialization/encoding/CompositeEncoder;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "", "write$Self", "(Lcom/zettle/sdk/core/user/OrganizationSettings;Lkotlinx/serialization/encoding/CompositeEncoder;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "Lcom/zettle/sdk/core/user/CashRegisterSettings;", "getCashRegisterSettings", "Lcom/zettle/sdk/core/user/CashRegisterTss;", "getCashRegisterTss", "Lcom/zettle/sdk/core/user/CustomersSettings;", "getCustomersSettings", "Lcom/zettle/sdk/core/user/GiftCardSettings;", "getGiftCardSettings", "Lcom/zettle/sdk/core/user/InvoiceSettings;", "getInvoiceSettings", "Lcom/zettle/sdk/core/user/KeyInSettings;", "getKeyInSettings", "Lcom/zettle/sdk/core/user/KlarnaInStoreSettings;", "getKlarnaInStoreSettings", "Lcom/zettle/sdk/core/user/PayPalQrcSettings;", "getPayPalQrcSettings", "Lcom/zettle/sdk/core/user/PaymentLinkSettings;", "getPaymentLinkSettings", "Lcom/zettle/sdk/core/user/ReceiptSettings;", "getReceiptSettings", "Lcom/zettle/sdk/core/user/VenmoQrcSettings;", "getVenmoQrcSettings", "Companion", "$serializer"}, k = 1, mv = {1, 8, 0}, xi = 48)
@kotlinx.serialization.Serializable
/* loaded from: classes3.dex */
public final /* data */ class OrganizationSettings {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final com.zettle.sdk.core.user.OrganizationSettings.Companion INSTANCE = new com.zettle.sdk.core.user.OrganizationSettings.Companion(null);
    private final com.zettle.sdk.core.user.CashRegisterSettings cashRegisterSettings;
    private final com.zettle.sdk.core.user.CashRegisterTss cashRegisterTss;
    private final com.zettle.sdk.core.user.CustomersSettings customersSettings;
    private final com.zettle.sdk.core.user.GiftCardSettings giftCardSettings;
    private final com.zettle.sdk.core.user.InvoiceSettings invoiceSettings;
    private final com.zettle.sdk.core.user.KeyInSettings keyInSettings;
    private final com.zettle.sdk.core.user.KlarnaInStoreSettings klarnaInStoreSettings;
    private final com.zettle.sdk.core.user.PayPalQrcSettings payPalQrcSettings;
    private final com.zettle.sdk.core.user.PaymentLinkSettings paymentLinkSettings;
    private final com.zettle.sdk.core.user.ReceiptSettings receiptSettings;
    private final com.zettle.sdk.core.user.VenmoQrcSettings venmoQrcSettings;

    @kotlin.Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0016\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004HÆ\u0001¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"Lcom/zettle/sdk/core/user/OrganizationSettings$Companion;", "", "<init>", "()V", "Lkotlinx/serialization/KSerializer;", "Lcom/zettle/sdk/core/user/OrganizationSettings;", "serializer", "()Lkotlinx/serialization/KSerializer;"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class Companion {
        private Companion() {
        }

        public final kotlinx.serialization.KSerializer<com.zettle.sdk.core.user.OrganizationSettings> serializer() {
            return com.zettle.sdk.core.user.OrganizationSettings$$serializer.INSTANCE;
        }

        public /* synthetic */ Companion(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    @kotlin.Deprecated(level = kotlin.DeprecationLevel.HIDDEN, message = "This synthesized declaration should not be used directly", replaceWith = @kotlin.ReplaceWith(expression = "", imports = {}))
    public /* synthetic */ OrganizationSettings(int i, com.zettle.sdk.core.user.CustomersSettings customersSettings, com.zettle.sdk.core.user.InvoiceSettings invoiceSettings, com.zettle.sdk.core.user.PaymentLinkSettings paymentLinkSettings, com.zettle.sdk.core.user.CashRegisterSettings cashRegisterSettings, com.zettle.sdk.core.user.CashRegisterTss cashRegisterTss, com.zettle.sdk.core.user.KlarnaInStoreSettings klarnaInStoreSettings, com.zettle.sdk.core.user.KeyInSettings keyInSettings, com.zettle.sdk.core.user.GiftCardSettings giftCardSettings, com.zettle.sdk.core.user.PayPalQrcSettings payPalQrcSettings, com.zettle.sdk.core.user.VenmoQrcSettings venmoQrcSettings, com.zettle.sdk.core.user.ReceiptSettings receiptSettings, kotlinx.serialization.internal.SerializationConstructorMarker serializationConstructorMarker) {
        if (2047 != (i & 2047)) {
            kotlinx.serialization.internal.PluginExceptionsKt.throwMissingFieldException(i, 2047, com.zettle.sdk.core.user.OrganizationSettings$$serializer.INSTANCE.getDescriptor());
        }
        this.customersSettings = customersSettings;
        this.invoiceSettings = invoiceSettings;
        this.paymentLinkSettings = paymentLinkSettings;
        this.cashRegisterSettings = cashRegisterSettings;
        this.cashRegisterTss = cashRegisterTss;
        this.klarnaInStoreSettings = klarnaInStoreSettings;
        this.keyInSettings = keyInSettings;
        this.giftCardSettings = giftCardSettings;
        this.payPalQrcSettings = payPalQrcSettings;
        this.venmoQrcSettings = venmoQrcSettings;
        this.receiptSettings = receiptSettings;
    }

    public OrganizationSettings(com.zettle.sdk.core.user.CustomersSettings customersSettings, com.zettle.sdk.core.user.InvoiceSettings invoiceSettings, com.zettle.sdk.core.user.PaymentLinkSettings paymentLinkSettings, com.zettle.sdk.core.user.CashRegisterSettings cashRegisterSettings, com.zettle.sdk.core.user.CashRegisterTss cashRegisterTss, com.zettle.sdk.core.user.KlarnaInStoreSettings klarnaInStoreSettings, com.zettle.sdk.core.user.KeyInSettings keyInSettings, com.zettle.sdk.core.user.GiftCardSettings giftCardSettings, com.zettle.sdk.core.user.PayPalQrcSettings payPalQrcSettings, com.zettle.sdk.core.user.VenmoQrcSettings venmoQrcSettings, com.zettle.sdk.core.user.ReceiptSettings receiptSettings) {
        this.customersSettings = customersSettings;
        this.invoiceSettings = invoiceSettings;
        this.paymentLinkSettings = paymentLinkSettings;
        this.cashRegisterSettings = cashRegisterSettings;
        this.cashRegisterTss = cashRegisterTss;
        this.klarnaInStoreSettings = klarnaInStoreSettings;
        this.keyInSettings = keyInSettings;
        this.giftCardSettings = giftCardSettings;
        this.payPalQrcSettings = payPalQrcSettings;
        this.venmoQrcSettings = venmoQrcSettings;
        this.receiptSettings = receiptSettings;
    }

    @kotlin.jvm.JvmStatic
    public static final void write$Self(com.zettle.sdk.core.user.OrganizationSettings self, kotlinx.serialization.encoding.CompositeEncoder output, kotlinx.serialization.descriptors.SerialDescriptor serialDesc) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(self, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(output, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(serialDesc, "");
        output.encodeNullableSerializableElement(serialDesc, 0, com.zettle.sdk.core.user.CustomersSettings$$serializer.INSTANCE, self.customersSettings);
        output.encodeNullableSerializableElement(serialDesc, 1, com.zettle.sdk.core.user.InvoiceSettings$$serializer.INSTANCE, self.invoiceSettings);
        output.encodeNullableSerializableElement(serialDesc, 2, com.zettle.sdk.core.user.PaymentLinkSettings$$serializer.INSTANCE, self.paymentLinkSettings);
        output.encodeNullableSerializableElement(serialDesc, 3, com.zettle.sdk.core.user.CashRegisterSettings$$serializer.INSTANCE, self.cashRegisterSettings);
        output.encodeNullableSerializableElement(serialDesc, 4, com.zettle.sdk.core.user.CashRegisterTss$$serializer.INSTANCE, self.cashRegisterTss);
        output.encodeNullableSerializableElement(serialDesc, 5, com.zettle.sdk.core.user.KlarnaInStoreSettings$$serializer.INSTANCE, self.klarnaInStoreSettings);
        output.encodeNullableSerializableElement(serialDesc, 6, com.zettle.sdk.core.user.KeyInSettings$$serializer.INSTANCE, self.keyInSettings);
        output.encodeNullableSerializableElement(serialDesc, 7, com.zettle.sdk.core.user.GiftCardSettings$$serializer.INSTANCE, self.giftCardSettings);
        output.encodeNullableSerializableElement(serialDesc, 8, com.zettle.sdk.core.user.PayPalQrcSettings$$serializer.INSTANCE, self.payPalQrcSettings);
        output.encodeNullableSerializableElement(serialDesc, 9, com.zettle.sdk.core.user.VenmoQrcSettings$$serializer.INSTANCE, self.venmoQrcSettings);
        output.encodeNullableSerializableElement(serialDesc, 10, com.zettle.sdk.core.user.ReceiptSettings$$serializer.INSTANCE, self.receiptSettings);
    }

    public final com.zettle.sdk.core.user.CustomersSettings getCustomersSettings() {
        return this.customersSettings;
    }

    public final com.zettle.sdk.core.user.InvoiceSettings getInvoiceSettings() {
        return this.invoiceSettings;
    }

    public final com.zettle.sdk.core.user.PaymentLinkSettings getPaymentLinkSettings() {
        return this.paymentLinkSettings;
    }

    public final com.zettle.sdk.core.user.CashRegisterSettings getCashRegisterSettings() {
        return this.cashRegisterSettings;
    }

    public final com.zettle.sdk.core.user.CashRegisterTss getCashRegisterTss() {
        return this.cashRegisterTss;
    }

    public final com.zettle.sdk.core.user.KlarnaInStoreSettings getKlarnaInStoreSettings() {
        return this.klarnaInStoreSettings;
    }

    public final com.zettle.sdk.core.user.KeyInSettings getKeyInSettings() {
        return this.keyInSettings;
    }

    public final com.zettle.sdk.core.user.GiftCardSettings getGiftCardSettings() {
        return this.giftCardSettings;
    }

    public final com.zettle.sdk.core.user.PayPalQrcSettings getPayPalQrcSettings() {
        return this.payPalQrcSettings;
    }

    public final com.zettle.sdk.core.user.VenmoQrcSettings getVenmoQrcSettings() {
        return this.venmoQrcSettings;
    }

    public final com.zettle.sdk.core.user.ReceiptSettings getReceiptSettings() {
        return this.receiptSettings;
    }

    public final java.lang.String toString() {
        com.zettle.sdk.core.user.CustomersSettings customersSettings = this.customersSettings;
        com.zettle.sdk.core.user.InvoiceSettings invoiceSettings = this.invoiceSettings;
        com.zettle.sdk.core.user.PaymentLinkSettings paymentLinkSettings = this.paymentLinkSettings;
        com.zettle.sdk.core.user.CashRegisterSettings cashRegisterSettings = this.cashRegisterSettings;
        com.zettle.sdk.core.user.CashRegisterTss cashRegisterTss = this.cashRegisterTss;
        com.zettle.sdk.core.user.KlarnaInStoreSettings klarnaInStoreSettings = this.klarnaInStoreSettings;
        com.zettle.sdk.core.user.KeyInSettings keyInSettings = this.keyInSettings;
        com.zettle.sdk.core.user.GiftCardSettings giftCardSettings = this.giftCardSettings;
        com.zettle.sdk.core.user.PayPalQrcSettings payPalQrcSettings = this.payPalQrcSettings;
        com.zettle.sdk.core.user.VenmoQrcSettings venmoQrcSettings = this.venmoQrcSettings;
        com.zettle.sdk.core.user.ReceiptSettings receiptSettings = this.receiptSettings;
        java.lang.StringBuilder sb = new java.lang.StringBuilder("OrganizationSettings(customersSettings=");
        sb.append(customersSettings);
        sb.append(", invoiceSettings=");
        sb.append(invoiceSettings);
        sb.append(", paymentLinkSettings=");
        sb.append(paymentLinkSettings);
        sb.append(", cashRegisterSettings=");
        sb.append(cashRegisterSettings);
        sb.append(", cashRegisterTss=");
        sb.append(cashRegisterTss);
        sb.append(", klarnaInStoreSettings=");
        sb.append(klarnaInStoreSettings);
        sb.append(", keyInSettings=");
        sb.append(keyInSettings);
        sb.append(", giftCardSettings=");
        sb.append(giftCardSettings);
        sb.append(", payPalQrcSettings=");
        sb.append(payPalQrcSettings);
        sb.append(", venmoQrcSettings=");
        sb.append(venmoQrcSettings);
        sb.append(", receiptSettings=");
        sb.append(receiptSettings);
        sb.append(")");
        return sb.toString();
    }

    public final int hashCode() {
        com.zettle.sdk.core.user.CustomersSettings customersSettings = this.customersSettings;
        int hashCode = customersSettings == null ? 0 : customersSettings.hashCode();
        com.zettle.sdk.core.user.InvoiceSettings invoiceSettings = this.invoiceSettings;
        int hashCode2 = invoiceSettings == null ? 0 : invoiceSettings.hashCode();
        com.zettle.sdk.core.user.PaymentLinkSettings paymentLinkSettings = this.paymentLinkSettings;
        int hashCode3 = paymentLinkSettings == null ? 0 : paymentLinkSettings.hashCode();
        com.zettle.sdk.core.user.CashRegisterSettings cashRegisterSettings = this.cashRegisterSettings;
        int hashCode4 = cashRegisterSettings == null ? 0 : cashRegisterSettings.hashCode();
        com.zettle.sdk.core.user.CashRegisterTss cashRegisterTss = this.cashRegisterTss;
        int hashCode5 = cashRegisterTss == null ? 0 : cashRegisterTss.hashCode();
        com.zettle.sdk.core.user.KlarnaInStoreSettings klarnaInStoreSettings = this.klarnaInStoreSettings;
        int hashCode6 = klarnaInStoreSettings == null ? 0 : klarnaInStoreSettings.hashCode();
        com.zettle.sdk.core.user.KeyInSettings keyInSettings = this.keyInSettings;
        int hashCode7 = keyInSettings == null ? 0 : keyInSettings.hashCode();
        com.zettle.sdk.core.user.GiftCardSettings giftCardSettings = this.giftCardSettings;
        int hashCode8 = giftCardSettings == null ? 0 : giftCardSettings.hashCode();
        com.zettle.sdk.core.user.PayPalQrcSettings payPalQrcSettings = this.payPalQrcSettings;
        int hashCode9 = payPalQrcSettings == null ? 0 : payPalQrcSettings.hashCode();
        com.zettle.sdk.core.user.VenmoQrcSettings venmoQrcSettings = this.venmoQrcSettings;
        int hashCode10 = venmoQrcSettings == null ? 0 : venmoQrcSettings.hashCode();
        com.zettle.sdk.core.user.ReceiptSettings receiptSettings = this.receiptSettings;
        return (((((((((((((((((((hashCode * 31) + hashCode2) * 31) + hashCode3) * 31) + hashCode4) * 31) + hashCode5) * 31) + hashCode6) * 31) + hashCode7) * 31) + hashCode8) * 31) + hashCode9) * 31) + hashCode10) * 31) + (receiptSettings != null ? receiptSettings.hashCode() : 0);
    }

    public final boolean equals(java.lang.Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof com.zettle.sdk.core.user.OrganizationSettings)) {
            return false;
        }
        com.zettle.sdk.core.user.OrganizationSettings organizationSettings = (com.zettle.sdk.core.user.OrganizationSettings) other;
        return kotlin.jvm.internal.Intrinsics.areEqual(this.customersSettings, organizationSettings.customersSettings) && kotlin.jvm.internal.Intrinsics.areEqual(this.invoiceSettings, organizationSettings.invoiceSettings) && kotlin.jvm.internal.Intrinsics.areEqual(this.paymentLinkSettings, organizationSettings.paymentLinkSettings) && kotlin.jvm.internal.Intrinsics.areEqual(this.cashRegisterSettings, organizationSettings.cashRegisterSettings) && kotlin.jvm.internal.Intrinsics.areEqual(this.cashRegisterTss, organizationSettings.cashRegisterTss) && kotlin.jvm.internal.Intrinsics.areEqual(this.klarnaInStoreSettings, organizationSettings.klarnaInStoreSettings) && kotlin.jvm.internal.Intrinsics.areEqual(this.keyInSettings, organizationSettings.keyInSettings) && kotlin.jvm.internal.Intrinsics.areEqual(this.giftCardSettings, organizationSettings.giftCardSettings) && kotlin.jvm.internal.Intrinsics.areEqual(this.payPalQrcSettings, organizationSettings.payPalQrcSettings) && kotlin.jvm.internal.Intrinsics.areEqual(this.venmoQrcSettings, organizationSettings.venmoQrcSettings) && kotlin.jvm.internal.Intrinsics.areEqual(this.receiptSettings, organizationSettings.receiptSettings);
    }

    public final com.zettle.sdk.core.user.OrganizationSettings copy(com.zettle.sdk.core.user.CustomersSettings customersSettings, com.zettle.sdk.core.user.InvoiceSettings invoiceSettings, com.zettle.sdk.core.user.PaymentLinkSettings paymentLinkSettings, com.zettle.sdk.core.user.CashRegisterSettings cashRegisterSettings, com.zettle.sdk.core.user.CashRegisterTss cashRegisterTss, com.zettle.sdk.core.user.KlarnaInStoreSettings klarnaInStoreSettings, com.zettle.sdk.core.user.KeyInSettings keyInSettings, com.zettle.sdk.core.user.GiftCardSettings giftCardSettings, com.zettle.sdk.core.user.PayPalQrcSettings payPalQrcSettings, com.zettle.sdk.core.user.VenmoQrcSettings venmoQrcSettings, com.zettle.sdk.core.user.ReceiptSettings receiptSettings) {
        return new com.zettle.sdk.core.user.OrganizationSettings(customersSettings, invoiceSettings, paymentLinkSettings, cashRegisterSettings, cashRegisterTss, klarnaInStoreSettings, keyInSettings, giftCardSettings, payPalQrcSettings, venmoQrcSettings, receiptSettings);
    }

    /* renamed from: component9, reason: from getter */
    public final com.zettle.sdk.core.user.PayPalQrcSettings getPayPalQrcSettings() {
        return this.payPalQrcSettings;
    }

    /* renamed from: component8, reason: from getter */
    public final com.zettle.sdk.core.user.GiftCardSettings getGiftCardSettings() {
        return this.giftCardSettings;
    }

    /* renamed from: component7, reason: from getter */
    public final com.zettle.sdk.core.user.KeyInSettings getKeyInSettings() {
        return this.keyInSettings;
    }

    /* renamed from: component6, reason: from getter */
    public final com.zettle.sdk.core.user.KlarnaInStoreSettings getKlarnaInStoreSettings() {
        return this.klarnaInStoreSettings;
    }

    /* renamed from: component5, reason: from getter */
    public final com.zettle.sdk.core.user.CashRegisterTss getCashRegisterTss() {
        return this.cashRegisterTss;
    }

    /* renamed from: component4, reason: from getter */
    public final com.zettle.sdk.core.user.CashRegisterSettings getCashRegisterSettings() {
        return this.cashRegisterSettings;
    }

    /* renamed from: component3, reason: from getter */
    public final com.zettle.sdk.core.user.PaymentLinkSettings getPaymentLinkSettings() {
        return this.paymentLinkSettings;
    }

    /* renamed from: component2, reason: from getter */
    public final com.zettle.sdk.core.user.InvoiceSettings getInvoiceSettings() {
        return this.invoiceSettings;
    }

    /* renamed from: component11, reason: from getter */
    public final com.zettle.sdk.core.user.ReceiptSettings getReceiptSettings() {
        return this.receiptSettings;
    }

    /* renamed from: component10, reason: from getter */
    public final com.zettle.sdk.core.user.VenmoQrcSettings getVenmoQrcSettings() {
        return this.venmoQrcSettings;
    }

    /* renamed from: component1, reason: from getter */
    public final com.zettle.sdk.core.user.CustomersSettings getCustomersSettings() {
        return this.customersSettings;
    }
}
