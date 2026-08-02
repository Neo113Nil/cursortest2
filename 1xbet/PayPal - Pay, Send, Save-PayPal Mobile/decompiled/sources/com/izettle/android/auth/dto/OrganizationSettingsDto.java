package com.izettle.android.auth.dto;

@kotlin.Metadata(d1 = {"\u0000\\\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b#\b\u0000\u0018\u00002\u00020\u0001B\u008b\u0001\u0012\n\b\u0001\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0001\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0001\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0001\u0010\t\u001a\u0004\u0018\u00010\b\u0012\n\b\u0001\u0010\u000b\u001a\u0004\u0018\u00010\n\u0012\n\b\u0001\u0010\r\u001a\u0004\u0018\u00010\f\u0012\n\b\u0001\u0010\u000f\u001a\u0004\u0018\u00010\u000e\u0012\n\b\u0001\u0010\u0011\u001a\u0004\u0018\u00010\u0010\u0012\n\b\u0001\u0010\u0013\u001a\u0004\u0018\u00010\u0012\u0012\n\b\u0001\u0010\u0015\u001a\u0004\u0018\u00010\u0014\u0012\n\b\u0001\u0010\u0017\u001a\u0004\u0018\u00010\u0016¢\u0006\u0004\b\u0018\u0010\u0019J\u001a\u0010\u001c\u001a\u00020\u001b2\b\u0010\u001a\u001a\u0004\u0018\u00010\u0001H\u0096\u0002¢\u0006\u0004\b\u001c\u0010\u001dJ\u000f\u0010\u001f\u001a\u00020\u001eH\u0016¢\u0006\u0004\b\u001f\u0010 R\u001c\u0010\t\u001a\u0004\u0018\u00010\b8\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\t\u0010!\u001a\u0004\b\"\u0010#R\u001c\u0010\u000b\u001a\u0004\u0018\u00010\n8\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u000b\u0010$\u001a\u0004\b%\u0010&R\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010'\u001a\u0004\b(\u0010)R\u001c\u0010\u0011\u001a\u0004\u0018\u00010\u00108\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0011\u0010*\u001a\u0004\b+\u0010,R\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010-\u001a\u0004\b.\u0010/R\u001c\u0010\u000f\u001a\u0004\u0018\u00010\u000e8\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u000f\u00100\u001a\u0004\b1\u00102R\u001c\u0010\r\u001a\u0004\u0018\u00010\f8\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\r\u00103\u001a\u0004\b4\u00105R\u001c\u0010\u0013\u001a\u0004\u0018\u00010\u00128\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0013\u00106\u001a\u0004\b7\u00108R\u001c\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u00109\u001a\u0004\b:\u0010;R\u001c\u0010\u0017\u001a\u0004\u0018\u00010\u00168\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0017\u0010<\u001a\u0004\b=\u0010>R\u001c\u0010\u0015\u001a\u0004\u0018\u00010\u00148\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0015\u0010?\u001a\u0004\b@\u0010A"}, d2 = {"Lcom/izettle/android/auth/dto/OrganizationSettingsDto;", "", "Lcom/izettle/android/auth/dto/CustomersSettingsDto;", "customersSettingsDto", "Lcom/izettle/android/auth/dto/InvoiceSettingsDto;", "invoiceSettingsDto", "Lcom/izettle/android/auth/dto/PaymentLinkSettingsDto;", "paymentLinkSettingsDto", "Lcom/izettle/android/auth/dto/CashRegisterSettingsDto;", "cashRegisterSettingsDto", "Lcom/izettle/android/auth/dto/CashRegisterTssDto;", "cashRegisterTssDto", "Lcom/izettle/android/auth/dto/KlarnaInStoreSettingsDto;", "klarnaInStoreSettingsDto", "Lcom/izettle/android/auth/dto/KeyInSettingsDto;", "keyInSettingsDto", "Lcom/izettle/android/auth/dto/GiftCardSettingsDto;", "giftCardSettingsDto", "Lcom/izettle/android/auth/dto/PayPalQrcSettingsDto;", "payPalQrcSettingsDto", "Lcom/izettle/android/auth/dto/VenmoQrcSettingsDto;", "venmoQrcSettingsDto", "Lcom/izettle/android/auth/dto/ReceiptSettingsDto;", "receiptSettingsDto", "<init>", "(Lcom/izettle/android/auth/dto/CustomersSettingsDto;Lcom/izettle/android/auth/dto/InvoiceSettingsDto;Lcom/izettle/android/auth/dto/PaymentLinkSettingsDto;Lcom/izettle/android/auth/dto/CashRegisterSettingsDto;Lcom/izettle/android/auth/dto/CashRegisterTssDto;Lcom/izettle/android/auth/dto/KlarnaInStoreSettingsDto;Lcom/izettle/android/auth/dto/KeyInSettingsDto;Lcom/izettle/android/auth/dto/GiftCardSettingsDto;Lcom/izettle/android/auth/dto/PayPalQrcSettingsDto;Lcom/izettle/android/auth/dto/VenmoQrcSettingsDto;Lcom/izettle/android/auth/dto/ReceiptSettingsDto;)V", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "Lcom/izettle/android/auth/dto/CashRegisterSettingsDto;", "getCashRegisterSettingsDto", "()Lcom/izettle/android/auth/dto/CashRegisterSettingsDto;", "Lcom/izettle/android/auth/dto/CashRegisterTssDto;", "getCashRegisterTssDto", "()Lcom/izettle/android/auth/dto/CashRegisterTssDto;", "Lcom/izettle/android/auth/dto/CustomersSettingsDto;", "getCustomersSettingsDto", "()Lcom/izettle/android/auth/dto/CustomersSettingsDto;", "Lcom/izettle/android/auth/dto/GiftCardSettingsDto;", "getGiftCardSettingsDto", "()Lcom/izettle/android/auth/dto/GiftCardSettingsDto;", "Lcom/izettle/android/auth/dto/InvoiceSettingsDto;", "getInvoiceSettingsDto", "()Lcom/izettle/android/auth/dto/InvoiceSettingsDto;", "Lcom/izettle/android/auth/dto/KeyInSettingsDto;", "getKeyInSettingsDto", "()Lcom/izettle/android/auth/dto/KeyInSettingsDto;", "Lcom/izettle/android/auth/dto/KlarnaInStoreSettingsDto;", "getKlarnaInStoreSettingsDto", "()Lcom/izettle/android/auth/dto/KlarnaInStoreSettingsDto;", "Lcom/izettle/android/auth/dto/PayPalQrcSettingsDto;", "getPayPalQrcSettingsDto", "()Lcom/izettle/android/auth/dto/PayPalQrcSettingsDto;", "Lcom/izettle/android/auth/dto/PaymentLinkSettingsDto;", "getPaymentLinkSettingsDto", "()Lcom/izettle/android/auth/dto/PaymentLinkSettingsDto;", "Lcom/izettle/android/auth/dto/ReceiptSettingsDto;", "getReceiptSettingsDto", "()Lcom/izettle/android/auth/dto/ReceiptSettingsDto;", "Lcom/izettle/android/auth/dto/VenmoQrcSettingsDto;", "getVenmoQrcSettingsDto", "()Lcom/izettle/android/auth/dto/VenmoQrcSettingsDto;"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes9.dex */
public final class OrganizationSettingsDto {

    @com.izettle.android.serialization.annotations.JsonSerialize("cashRegister")
    private final com.izettle.android.auth.dto.CashRegisterSettingsDto cashRegisterSettingsDto;

    @com.izettle.android.serialization.annotations.JsonSerialize("cashRegisterTss")
    private final com.izettle.android.auth.dto.CashRegisterTssDto cashRegisterTssDto;

    @com.izettle.android.serialization.annotations.JsonSerialize("loyalty")
    private final com.izettle.android.auth.dto.CustomersSettingsDto customersSettingsDto;

    @com.izettle.android.serialization.annotations.JsonSerialize("giftcard")
    private final com.izettle.android.auth.dto.GiftCardSettingsDto giftCardSettingsDto;

    @com.izettle.android.serialization.annotations.JsonSerialize(com.paypal.oslo.feature.businesspayandgetpaid.payandgetpaid.analytics.TransactionContextValues.TransactionType.Invoice)
    private final com.izettle.android.auth.dto.InvoiceSettingsDto invoiceSettingsDto;

    @com.izettle.android.serialization.annotations.JsonSerialize("paypalKeyIn")
    private final com.izettle.android.auth.dto.KeyInSettingsDto keyInSettingsDto;

    @com.izettle.android.serialization.annotations.JsonSerialize("klarnaInStore")
    private final com.izettle.android.auth.dto.KlarnaInStoreSettingsDto klarnaInStoreSettingsDto;

    @com.izettle.android.serialization.annotations.JsonSerialize("paypalQRC")
    private final com.izettle.android.auth.dto.PayPalQrcSettingsDto payPalQrcSettingsDto;

    @com.izettle.android.serialization.annotations.JsonSerialize("paymentLink")
    private final com.izettle.android.auth.dto.PaymentLinkSettingsDto paymentLinkSettingsDto;

    @com.izettle.android.serialization.annotations.JsonSerialize("receipt")
    private final com.izettle.android.auth.dto.ReceiptSettingsDto receiptSettingsDto;

    @com.izettle.android.serialization.annotations.JsonSerialize("venmoQRC")
    private final com.izettle.android.auth.dto.VenmoQrcSettingsDto venmoQrcSettingsDto;

    public OrganizationSettingsDto(@com.izettle.android.serialization.annotations.JsonDeserialize("loyalty") com.izettle.android.auth.dto.CustomersSettingsDto customersSettingsDto, @com.izettle.android.serialization.annotations.JsonDeserialize("invoice") com.izettle.android.auth.dto.InvoiceSettingsDto invoiceSettingsDto, @com.izettle.android.serialization.annotations.JsonDeserialize("paymentLink") com.izettle.android.auth.dto.PaymentLinkSettingsDto paymentLinkSettingsDto, @com.izettle.android.serialization.annotations.JsonDeserialize("cashRegister") com.izettle.android.auth.dto.CashRegisterSettingsDto cashRegisterSettingsDto, @com.izettle.android.serialization.annotations.JsonDeserialize("cashRegisterTss") com.izettle.android.auth.dto.CashRegisterTssDto cashRegisterTssDto, @com.izettle.android.serialization.annotations.JsonDeserialize("klarnaInStore") com.izettle.android.auth.dto.KlarnaInStoreSettingsDto klarnaInStoreSettingsDto, @com.izettle.android.serialization.annotations.JsonDeserialize("paypalKeyIn") com.izettle.android.auth.dto.KeyInSettingsDto keyInSettingsDto, @com.izettle.android.serialization.annotations.JsonDeserialize("giftcard") com.izettle.android.auth.dto.GiftCardSettingsDto giftCardSettingsDto, @com.izettle.android.serialization.annotations.JsonDeserialize("paypalQRC") com.izettle.android.auth.dto.PayPalQrcSettingsDto payPalQrcSettingsDto, @com.izettle.android.serialization.annotations.JsonDeserialize("venmoQRC") com.izettle.android.auth.dto.VenmoQrcSettingsDto venmoQrcSettingsDto, @com.izettle.android.serialization.annotations.JsonDeserialize("receipt") com.izettle.android.auth.dto.ReceiptSettingsDto receiptSettingsDto) {
        this.customersSettingsDto = customersSettingsDto;
        this.invoiceSettingsDto = invoiceSettingsDto;
        this.paymentLinkSettingsDto = paymentLinkSettingsDto;
        this.cashRegisterSettingsDto = cashRegisterSettingsDto;
        this.cashRegisterTssDto = cashRegisterTssDto;
        this.klarnaInStoreSettingsDto = klarnaInStoreSettingsDto;
        this.keyInSettingsDto = keyInSettingsDto;
        this.giftCardSettingsDto = giftCardSettingsDto;
        this.payPalQrcSettingsDto = payPalQrcSettingsDto;
        this.venmoQrcSettingsDto = venmoQrcSettingsDto;
        this.receiptSettingsDto = receiptSettingsDto;
    }

    public final com.izettle.android.auth.dto.CustomersSettingsDto getCustomersSettingsDto() {
        return this.customersSettingsDto;
    }

    public final com.izettle.android.auth.dto.InvoiceSettingsDto getInvoiceSettingsDto() {
        return this.invoiceSettingsDto;
    }

    public final com.izettle.android.auth.dto.PaymentLinkSettingsDto getPaymentLinkSettingsDto() {
        return this.paymentLinkSettingsDto;
    }

    public final com.izettle.android.auth.dto.CashRegisterSettingsDto getCashRegisterSettingsDto() {
        return this.cashRegisterSettingsDto;
    }

    public final com.izettle.android.auth.dto.CashRegisterTssDto getCashRegisterTssDto() {
        return this.cashRegisterTssDto;
    }

    public final com.izettle.android.auth.dto.KlarnaInStoreSettingsDto getKlarnaInStoreSettingsDto() {
        return this.klarnaInStoreSettingsDto;
    }

    public final com.izettle.android.auth.dto.KeyInSettingsDto getKeyInSettingsDto() {
        return this.keyInSettingsDto;
    }

    public final com.izettle.android.auth.dto.GiftCardSettingsDto getGiftCardSettingsDto() {
        return this.giftCardSettingsDto;
    }

    public final com.izettle.android.auth.dto.PayPalQrcSettingsDto getPayPalQrcSettingsDto() {
        return this.payPalQrcSettingsDto;
    }

    public final com.izettle.android.auth.dto.VenmoQrcSettingsDto getVenmoQrcSettingsDto() {
        return this.venmoQrcSettingsDto;
    }

    public final com.izettle.android.auth.dto.ReceiptSettingsDto getReceiptSettingsDto() {
        return this.receiptSettingsDto;
    }

    public final boolean equals(java.lang.Object other) {
        if (!(other instanceof com.izettle.android.auth.dto.OrganizationSettingsDto)) {
            return false;
        }
        com.izettle.android.auth.dto.OrganizationSettingsDto organizationSettingsDto = (com.izettle.android.auth.dto.OrganizationSettingsDto) other;
        return kotlin.jvm.internal.Intrinsics.areEqual(organizationSettingsDto.customersSettingsDto, this.customersSettingsDto) && kotlin.jvm.internal.Intrinsics.areEqual(organizationSettingsDto.invoiceSettingsDto, this.invoiceSettingsDto) && kotlin.jvm.internal.Intrinsics.areEqual(organizationSettingsDto.paymentLinkSettingsDto, this.paymentLinkSettingsDto) && kotlin.jvm.internal.Intrinsics.areEqual(organizationSettingsDto.klarnaInStoreSettingsDto, this.klarnaInStoreSettingsDto) && kotlin.jvm.internal.Intrinsics.areEqual(organizationSettingsDto.keyInSettingsDto, this.keyInSettingsDto) && kotlin.jvm.internal.Intrinsics.areEqual(organizationSettingsDto.giftCardSettingsDto, this.giftCardSettingsDto) && kotlin.jvm.internal.Intrinsics.areEqual(organizationSettingsDto.payPalQrcSettingsDto, this.payPalQrcSettingsDto) && kotlin.jvm.internal.Intrinsics.areEqual(organizationSettingsDto.venmoQrcSettingsDto, this.venmoQrcSettingsDto) && kotlin.jvm.internal.Intrinsics.areEqual(organizationSettingsDto.receiptSettingsDto, this.receiptSettingsDto);
    }

    public final int hashCode() {
        return java.util.Objects.hash(this.customersSettingsDto, this.invoiceSettingsDto, this.paymentLinkSettingsDto, this.klarnaInStoreSettingsDto, this.keyInSettingsDto, this.giftCardSettingsDto, this.payPalQrcSettingsDto, this.venmoQrcSettingsDto, this.receiptSettingsDto);
    }
}
