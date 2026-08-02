package com.zettle.android.entities;

@kotlin.Metadata(d1 = {"\u0000j\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u001b\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0018\b\u0082\b\u0018\u00002\u00020\u0001Bu\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\n\u0012\b\u0010\r\u001a\u0004\u0018\u00010\f\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\u000e\u0012\b\u0010\u0011\u001a\u0004\u0018\u00010\u0010\u0012\b\u0010\u0013\u001a\u0004\u0018\u00010\u0012\u0012\b\u0010\u0015\u001a\u0004\u0018\u00010\u0014\u0012\b\u0010\u0017\u001a\u0004\u0018\u00010\u0016¢\u0006\u0004\b\u0018\u0010\u0019J\u0012\u0010\u001a\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u001a\u0010\u001bJ\u0012\u0010\u001c\u001a\u0004\u0018\u00010\u0014HÆ\u0003¢\u0006\u0004\b\u001c\u0010\u001dJ\u0012\u0010\u001e\u001a\u0004\u0018\u00010\u0016HÆ\u0003¢\u0006\u0004\b\u001e\u0010\u001fJ\u0012\u0010 \u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b \u0010!J\u0012\u0010\"\u001a\u0004\u0018\u00010\u0006HÆ\u0003¢\u0006\u0004\b\"\u0010#J\u0012\u0010$\u001a\u0004\u0018\u00010\bHÆ\u0003¢\u0006\u0004\b$\u0010%J\u0012\u0010&\u001a\u0004\u0018\u00010\nHÆ\u0003¢\u0006\u0004\b&\u0010'J\u0012\u0010(\u001a\u0004\u0018\u00010\fHÆ\u0003¢\u0006\u0004\b(\u0010)J\u0012\u0010*\u001a\u0004\u0018\u00010\u000eHÆ\u0003¢\u0006\u0004\b*\u0010+J\u0012\u0010,\u001a\u0004\u0018\u00010\u0010HÆ\u0003¢\u0006\u0004\b,\u0010-J\u0012\u0010.\u001a\u0004\u0018\u00010\u0012HÆ\u0003¢\u0006\u0004\b.\u0010/J\u0094\u0001\u00100\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\b2\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\n2\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\f2\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u000e2\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u00102\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u00122\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00010\u00142\n\b\u0002\u0010\u0017\u001a\u0004\u0018\u00010\u0016HÆ\u0001¢\u0006\u0004\b0\u00101J\u001a\u00105\u001a\u0002042\b\u00103\u001a\u0004\u0018\u000102HÖ\u0003¢\u0006\u0004\b5\u00106J\u0010\u00108\u001a\u000207HÖ\u0001¢\u0006\u0004\b8\u00109J\u0010\u0010;\u001a\u00020:HÖ\u0001¢\u0006\u0004\b;\u0010<R\u001c\u0010\t\u001a\u0004\u0018\u00010\b8\u0017X\u0096\u0004¢\u0006\f\n\u0004\b\t\u0010=\u001a\u0004\b>\u0010%R\u001c\u0010\u000b\u001a\u0004\u0018\u00010\n8\u0017X\u0097\u0004¢\u0006\f\n\u0004\b\u000b\u0010?\u001a\u0004\b@\u0010'R\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0017X\u0097\u0004¢\u0006\f\n\u0004\b\u0003\u0010A\u001a\u0004\bB\u0010\u001bR\u001c\u0010\u0011\u001a\u0004\u0018\u00010\u00108\u0017X\u0097\u0004¢\u0006\f\n\u0004\b\u0011\u0010C\u001a\u0004\bD\u0010-R\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0017X\u0097\u0004¢\u0006\f\n\u0004\b\u0005\u0010E\u001a\u0004\bF\u0010!R\u001c\u0010\u000f\u001a\u0004\u0018\u00010\u000e8\u0017X\u0097\u0004¢\u0006\f\n\u0004\b\u000f\u0010G\u001a\u0004\bH\u0010+R\u001c\u0010\r\u001a\u0004\u0018\u00010\f8\u0017X\u0097\u0004¢\u0006\f\n\u0004\b\r\u0010I\u001a\u0004\bJ\u0010)R\u001c\u0010\u0013\u001a\u0004\u0018\u00010\u00128\u0017X\u0097\u0004¢\u0006\f\n\u0004\b\u0013\u0010K\u001a\u0004\bL\u0010/R\u001c\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0017X\u0097\u0004¢\u0006\f\n\u0004\b\u0007\u0010M\u001a\u0004\bN\u0010#R\u001c\u0010\u0017\u001a\u0004\u0018\u00010\u00168\u0017X\u0097\u0004¢\u0006\f\n\u0004\b\u0017\u0010O\u001a\u0004\bP\u0010\u001fR\u001c\u0010\u0015\u001a\u0004\u0018\u00010\u00148\u0017X\u0097\u0004¢\u0006\f\n\u0004\b\u0015\u0010Q\u001a\u0004\bR\u0010\u001d"}, d2 = {"Lcom/zettle/android/entities/OrganizationSettingsImpl;", "Lcom/zettle/android/entities/OrganizationSettings;", "Lcom/zettle/android/entities/CustomersSettings;", "customersSettings", "Lcom/zettle/android/entities/InvoiceSettings;", "invoiceSettings", "Lcom/zettle/android/entities/PaymentLinkSettings;", "paymentLinkSettings", "Lcom/zettle/android/entities/CashRegisterSettings;", "cashRegisterSettings", "Lcom/zettle/android/entities/CashRegisterTss;", "cashRegisterTss", "Lcom/zettle/android/entities/KlarnaInStoreSettings;", "klarnaInStoreSettings", "Lcom/zettle/android/entities/KeyInSettings;", "keyInSettings", "Lcom/zettle/android/entities/GiftCardSettings;", "giftCardSettings", "Lcom/zettle/android/entities/PayPalQrcSettings;", "payPalQrcSettings", "Lcom/zettle/android/entities/VenmoQrcSettings;", "venmoQrcSettings", "Lcom/zettle/android/entities/ReceiptSettings;", "receiptSettings", "<init>", "(Lcom/zettle/android/entities/CustomersSettings;Lcom/zettle/android/entities/InvoiceSettings;Lcom/zettle/android/entities/PaymentLinkSettings;Lcom/zettle/android/entities/CashRegisterSettings;Lcom/zettle/android/entities/CashRegisterTss;Lcom/zettle/android/entities/KlarnaInStoreSettings;Lcom/zettle/android/entities/KeyInSettings;Lcom/zettle/android/entities/GiftCardSettings;Lcom/zettle/android/entities/PayPalQrcSettings;Lcom/zettle/android/entities/VenmoQrcSettings;Lcom/zettle/android/entities/ReceiptSettings;)V", "component1", "()Lcom/zettle/android/entities/CustomersSettings;", "component10", "()Lcom/zettle/android/entities/VenmoQrcSettings;", "component11", "()Lcom/zettle/android/entities/ReceiptSettings;", "component2", "()Lcom/zettle/android/entities/InvoiceSettings;", "component3", "()Lcom/zettle/android/entities/PaymentLinkSettings;", "component4", "()Lcom/zettle/android/entities/CashRegisterSettings;", "component5", "()Lcom/zettle/android/entities/CashRegisterTss;", "component6", "()Lcom/zettle/android/entities/KlarnaInStoreSettings;", "component7", "()Lcom/zettle/android/entities/KeyInSettings;", "component8", "()Lcom/zettle/android/entities/GiftCardSettings;", "component9", "()Lcom/zettle/android/entities/PayPalQrcSettings;", "copy", "(Lcom/zettle/android/entities/CustomersSettings;Lcom/zettle/android/entities/InvoiceSettings;Lcom/zettle/android/entities/PaymentLinkSettings;Lcom/zettle/android/entities/CashRegisterSettings;Lcom/zettle/android/entities/CashRegisterTss;Lcom/zettle/android/entities/KlarnaInStoreSettings;Lcom/zettle/android/entities/KeyInSettings;Lcom/zettle/android/entities/GiftCardSettings;Lcom/zettle/android/entities/PayPalQrcSettings;Lcom/zettle/android/entities/VenmoQrcSettings;Lcom/zettle/android/entities/ReceiptSettings;)Lcom/zettle/android/entities/OrganizationSettingsImpl;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "Lcom/zettle/android/entities/CashRegisterSettings;", "getCashRegisterSettings", "Lcom/zettle/android/entities/CashRegisterTss;", "getCashRegisterTss", "Lcom/zettle/android/entities/CustomersSettings;", "getCustomersSettings", "Lcom/zettle/android/entities/GiftCardSettings;", "getGiftCardSettings", "Lcom/zettle/android/entities/InvoiceSettings;", "getInvoiceSettings", "Lcom/zettle/android/entities/KeyInSettings;", "getKeyInSettings", "Lcom/zettle/android/entities/KlarnaInStoreSettings;", "getKlarnaInStoreSettings", "Lcom/zettle/android/entities/PayPalQrcSettings;", "getPayPalQrcSettings", "Lcom/zettle/android/entities/PaymentLinkSettings;", "getPaymentLinkSettings", "Lcom/zettle/android/entities/ReceiptSettings;", "getReceiptSettings", "Lcom/zettle/android/entities/VenmoQrcSettings;", "getVenmoQrcSettings"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes16.dex */
final /* data */ class OrganizationSettingsImpl implements com.zettle.android.entities.OrganizationSettings {
    private final com.zettle.android.entities.CashRegisterSettings cashRegisterSettings;
    private final com.zettle.android.entities.CashRegisterTss cashRegisterTss;
    private final com.zettle.android.entities.CustomersSettings customersSettings;
    private final com.zettle.android.entities.GiftCardSettings giftCardSettings;
    private final com.zettle.android.entities.InvoiceSettings invoiceSettings;
    private final com.zettle.android.entities.KeyInSettings keyInSettings;
    private final com.zettle.android.entities.KlarnaInStoreSettings klarnaInStoreSettings;
    private final com.zettle.android.entities.PayPalQrcSettings payPalQrcSettings;
    private final com.zettle.android.entities.PaymentLinkSettings paymentLinkSettings;
    private final com.zettle.android.entities.ReceiptSettings receiptSettings;
    private final com.zettle.android.entities.VenmoQrcSettings venmoQrcSettings;

    public OrganizationSettingsImpl(com.zettle.android.entities.CustomersSettings customersSettings, com.zettle.android.entities.InvoiceSettings invoiceSettings, com.zettle.android.entities.PaymentLinkSettings paymentLinkSettings, com.zettle.android.entities.CashRegisterSettings cashRegisterSettings, com.zettle.android.entities.CashRegisterTss cashRegisterTss, com.zettle.android.entities.KlarnaInStoreSettings klarnaInStoreSettings, com.zettle.android.entities.KeyInSettings keyInSettings, com.zettle.android.entities.GiftCardSettings giftCardSettings, com.zettle.android.entities.PayPalQrcSettings payPalQrcSettings, com.zettle.android.entities.VenmoQrcSettings venmoQrcSettings, com.zettle.android.entities.ReceiptSettings receiptSettings) {
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

    @Override // com.zettle.android.entities.OrganizationSettings
    public final com.zettle.android.entities.CustomersSettings getCustomersSettings() {
        return this.customersSettings;
    }

    @Override // com.zettle.android.entities.OrganizationSettings
    public final com.zettle.android.entities.InvoiceSettings getInvoiceSettings() {
        return this.invoiceSettings;
    }

    @Override // com.zettle.android.entities.OrganizationSettings
    public final com.zettle.android.entities.PaymentLinkSettings getPaymentLinkSettings() {
        return this.paymentLinkSettings;
    }

    @Override // com.zettle.android.entities.OrganizationSettings
    public final com.zettle.android.entities.CashRegisterSettings getCashRegisterSettings() {
        return this.cashRegisterSettings;
    }

    @Override // com.zettle.android.entities.OrganizationSettings
    public final com.zettle.android.entities.CashRegisterTss getCashRegisterTss() {
        return this.cashRegisterTss;
    }

    @Override // com.zettle.android.entities.OrganizationSettings
    public final com.zettle.android.entities.KlarnaInStoreSettings getKlarnaInStoreSettings() {
        return this.klarnaInStoreSettings;
    }

    @Override // com.zettle.android.entities.OrganizationSettings
    public final com.zettle.android.entities.KeyInSettings getKeyInSettings() {
        return this.keyInSettings;
    }

    @Override // com.zettle.android.entities.OrganizationSettings
    public final com.zettle.android.entities.GiftCardSettings getGiftCardSettings() {
        return this.giftCardSettings;
    }

    @Override // com.zettle.android.entities.OrganizationSettings
    public final com.zettle.android.entities.PayPalQrcSettings getPayPalQrcSettings() {
        return this.payPalQrcSettings;
    }

    @Override // com.zettle.android.entities.OrganizationSettings
    public final com.zettle.android.entities.VenmoQrcSettings getVenmoQrcSettings() {
        return this.venmoQrcSettings;
    }

    @Override // com.zettle.android.entities.OrganizationSettings
    public final com.zettle.android.entities.ReceiptSettings getReceiptSettings() {
        return this.receiptSettings;
    }

    public final java.lang.String toString() {
        com.zettle.android.entities.CustomersSettings customersSettings = this.customersSettings;
        com.zettle.android.entities.InvoiceSettings invoiceSettings = this.invoiceSettings;
        com.zettle.android.entities.PaymentLinkSettings paymentLinkSettings = this.paymentLinkSettings;
        com.zettle.android.entities.CashRegisterSettings cashRegisterSettings = this.cashRegisterSettings;
        com.zettle.android.entities.CashRegisterTss cashRegisterTss = this.cashRegisterTss;
        com.zettle.android.entities.KlarnaInStoreSettings klarnaInStoreSettings = this.klarnaInStoreSettings;
        com.zettle.android.entities.KeyInSettings keyInSettings = this.keyInSettings;
        com.zettle.android.entities.GiftCardSettings giftCardSettings = this.giftCardSettings;
        com.zettle.android.entities.PayPalQrcSettings payPalQrcSettings = this.payPalQrcSettings;
        com.zettle.android.entities.VenmoQrcSettings venmoQrcSettings = this.venmoQrcSettings;
        com.zettle.android.entities.ReceiptSettings receiptSettings = this.receiptSettings;
        java.lang.StringBuilder sb = new java.lang.StringBuilder("OrganizationSettingsImpl(customersSettings=");
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
        com.zettle.android.entities.CustomersSettings customersSettings = this.customersSettings;
        int hashCode = customersSettings == null ? 0 : customersSettings.hashCode();
        com.zettle.android.entities.InvoiceSettings invoiceSettings = this.invoiceSettings;
        int hashCode2 = invoiceSettings == null ? 0 : invoiceSettings.hashCode();
        com.zettle.android.entities.PaymentLinkSettings paymentLinkSettings = this.paymentLinkSettings;
        int hashCode3 = paymentLinkSettings == null ? 0 : paymentLinkSettings.hashCode();
        com.zettle.android.entities.CashRegisterSettings cashRegisterSettings = this.cashRegisterSettings;
        int hashCode4 = cashRegisterSettings == null ? 0 : cashRegisterSettings.hashCode();
        com.zettle.android.entities.CashRegisterTss cashRegisterTss = this.cashRegisterTss;
        int hashCode5 = cashRegisterTss == null ? 0 : cashRegisterTss.hashCode();
        com.zettle.android.entities.KlarnaInStoreSettings klarnaInStoreSettings = this.klarnaInStoreSettings;
        int hashCode6 = klarnaInStoreSettings == null ? 0 : klarnaInStoreSettings.hashCode();
        com.zettle.android.entities.KeyInSettings keyInSettings = this.keyInSettings;
        int hashCode7 = keyInSettings == null ? 0 : keyInSettings.hashCode();
        com.zettle.android.entities.GiftCardSettings giftCardSettings = this.giftCardSettings;
        int hashCode8 = giftCardSettings == null ? 0 : giftCardSettings.hashCode();
        com.zettle.android.entities.PayPalQrcSettings payPalQrcSettings = this.payPalQrcSettings;
        int hashCode9 = payPalQrcSettings == null ? 0 : payPalQrcSettings.hashCode();
        com.zettle.android.entities.VenmoQrcSettings venmoQrcSettings = this.venmoQrcSettings;
        int hashCode10 = venmoQrcSettings == null ? 0 : venmoQrcSettings.hashCode();
        com.zettle.android.entities.ReceiptSettings receiptSettings = this.receiptSettings;
        return (((((((((((((((((((hashCode * 31) + hashCode2) * 31) + hashCode3) * 31) + hashCode4) * 31) + hashCode5) * 31) + hashCode6) * 31) + hashCode7) * 31) + hashCode8) * 31) + hashCode9) * 31) + hashCode10) * 31) + (receiptSettings != null ? receiptSettings.hashCode() : 0);
    }

    public final boolean equals(java.lang.Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof com.zettle.android.entities.OrganizationSettingsImpl)) {
            return false;
        }
        com.zettle.android.entities.OrganizationSettingsImpl organizationSettingsImpl = (com.zettle.android.entities.OrganizationSettingsImpl) other;
        return kotlin.jvm.internal.Intrinsics.areEqual(this.customersSettings, organizationSettingsImpl.customersSettings) && kotlin.jvm.internal.Intrinsics.areEqual(this.invoiceSettings, organizationSettingsImpl.invoiceSettings) && kotlin.jvm.internal.Intrinsics.areEqual(this.paymentLinkSettings, organizationSettingsImpl.paymentLinkSettings) && kotlin.jvm.internal.Intrinsics.areEqual(this.cashRegisterSettings, organizationSettingsImpl.cashRegisterSettings) && kotlin.jvm.internal.Intrinsics.areEqual(this.cashRegisterTss, organizationSettingsImpl.cashRegisterTss) && kotlin.jvm.internal.Intrinsics.areEqual(this.klarnaInStoreSettings, organizationSettingsImpl.klarnaInStoreSettings) && kotlin.jvm.internal.Intrinsics.areEqual(this.keyInSettings, organizationSettingsImpl.keyInSettings) && kotlin.jvm.internal.Intrinsics.areEqual(this.giftCardSettings, organizationSettingsImpl.giftCardSettings) && kotlin.jvm.internal.Intrinsics.areEqual(this.payPalQrcSettings, organizationSettingsImpl.payPalQrcSettings) && kotlin.jvm.internal.Intrinsics.areEqual(this.venmoQrcSettings, organizationSettingsImpl.venmoQrcSettings) && kotlin.jvm.internal.Intrinsics.areEqual(this.receiptSettings, organizationSettingsImpl.receiptSettings);
    }

    public final com.zettle.android.entities.OrganizationSettingsImpl copy(com.zettle.android.entities.CustomersSettings customersSettings, com.zettle.android.entities.InvoiceSettings invoiceSettings, com.zettle.android.entities.PaymentLinkSettings paymentLinkSettings, com.zettle.android.entities.CashRegisterSettings cashRegisterSettings, com.zettle.android.entities.CashRegisterTss cashRegisterTss, com.zettle.android.entities.KlarnaInStoreSettings klarnaInStoreSettings, com.zettle.android.entities.KeyInSettings keyInSettings, com.zettle.android.entities.GiftCardSettings giftCardSettings, com.zettle.android.entities.PayPalQrcSettings payPalQrcSettings, com.zettle.android.entities.VenmoQrcSettings venmoQrcSettings, com.zettle.android.entities.ReceiptSettings receiptSettings) {
        return new com.zettle.android.entities.OrganizationSettingsImpl(customersSettings, invoiceSettings, paymentLinkSettings, cashRegisterSettings, cashRegisterTss, klarnaInStoreSettings, keyInSettings, giftCardSettings, payPalQrcSettings, venmoQrcSettings, receiptSettings);
    }

    /* renamed from: component9, reason: from getter */
    public final com.zettle.android.entities.PayPalQrcSettings getPayPalQrcSettings() {
        return this.payPalQrcSettings;
    }

    /* renamed from: component8, reason: from getter */
    public final com.zettle.android.entities.GiftCardSettings getGiftCardSettings() {
        return this.giftCardSettings;
    }

    /* renamed from: component7, reason: from getter */
    public final com.zettle.android.entities.KeyInSettings getKeyInSettings() {
        return this.keyInSettings;
    }

    /* renamed from: component6, reason: from getter */
    public final com.zettle.android.entities.KlarnaInStoreSettings getKlarnaInStoreSettings() {
        return this.klarnaInStoreSettings;
    }

    /* renamed from: component5, reason: from getter */
    public final com.zettle.android.entities.CashRegisterTss getCashRegisterTss() {
        return this.cashRegisterTss;
    }

    /* renamed from: component4, reason: from getter */
    public final com.zettle.android.entities.CashRegisterSettings getCashRegisterSettings() {
        return this.cashRegisterSettings;
    }

    /* renamed from: component3, reason: from getter */
    public final com.zettle.android.entities.PaymentLinkSettings getPaymentLinkSettings() {
        return this.paymentLinkSettings;
    }

    /* renamed from: component2, reason: from getter */
    public final com.zettle.android.entities.InvoiceSettings getInvoiceSettings() {
        return this.invoiceSettings;
    }

    /* renamed from: component11, reason: from getter */
    public final com.zettle.android.entities.ReceiptSettings getReceiptSettings() {
        return this.receiptSettings;
    }

    /* renamed from: component10, reason: from getter */
    public final com.zettle.android.entities.VenmoQrcSettings getVenmoQrcSettings() {
        return this.venmoQrcSettings;
    }

    /* renamed from: component1, reason: from getter */
    public final com.zettle.android.entities.CustomersSettings getCustomersSettings() {
        return this.customersSettings;
    }
}
