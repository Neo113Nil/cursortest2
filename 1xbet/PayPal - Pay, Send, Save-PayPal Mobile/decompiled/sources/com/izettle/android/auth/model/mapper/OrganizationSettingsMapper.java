package com.izettle.android.auth.model.mapper;

@kotlin.Metadata(d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0013\b\u0000\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001Bu\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006\u0012\b\b\u0002\u0010\t\u001a\u00020\b\u0012\b\b\u0002\u0010\u000b\u001a\u00020\n\u0012\b\b\u0002\u0010\r\u001a\u00020\f\u0012\b\b\u0002\u0010\u000f\u001a\u00020\u000e\u0012\b\b\u0002\u0010\u0011\u001a\u00020\u0010\u0012\b\b\u0002\u0010\u0013\u001a\u00020\u0012\u0012\b\b\u0002\u0010\u0015\u001a\u00020\u0014\u0012\b\b\u0002\u0010\u0017\u001a\u00020\u0016\u0012\b\b\u0002\u0010\u0019\u001a\u00020\u0018¢\u0006\u0004\b\u001a\u0010\u001bJ\u0017\u0010\u001d\u001a\u00020\u00022\u0006\u0010\u001c\u001a\u00020\u0003H\u0016¢\u0006\u0004\b\u001d\u0010\u001eJ\u0017\u0010\u001f\u001a\u00020\u00032\u0006\u0010\u001c\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u001f\u0010 R\u0014\u0010\u000b\u001a\u00020\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010!R\u0014\u0010\r\u001a\u00020\f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u0010\"R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010#R\u0014\u0010\u0013\u001a\u00020\u00128\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010$R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010%R\u0014\u0010\u0011\u001a\u00020\u00108\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010&R\u0014\u0010\u000f\u001a\u00020\u000e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010'R\u0014\u0010\u0015\u001a\u00020\u00148\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010(R\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010)R\u0014\u0010\u0019\u001a\u00020\u00188\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0019\u0010*R\u0014\u0010\u0017\u001a\u00020\u00168\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010+"}, d2 = {"Lcom/izettle/android/auth/model/mapper/OrganizationSettingsMapper;", "Lcom/izettle/android/auth/model/mapper/Mapper;", "Lcom/izettle/android/auth/dto/OrganizationSettingsDto;", "Lcom/zettle/android/entities/OrganizationSettings;", "Lcom/izettle/android/auth/model/mapper/CustomerSettingsMapper;", "customerSettingsMapper", "Lcom/izettle/android/auth/model/mapper/InvoiceSettingsMapper;", "invoiceSettingsMapper", "Lcom/izettle/android/auth/model/mapper/PaymentLinkSettingsMapper;", "paymentLinkSettingsMapper", "Lcom/izettle/android/auth/model/mapper/CashRegisterSettingsMapper;", "cashRegisterSettingsMapper", "Lcom/izettle/android/auth/model/mapper/CashRegisterTssMapper;", "cashRegisterTssMapper", "Lcom/izettle/android/auth/model/mapper/KlarnaInStoreSettingsMapper;", "klarnaInStoreSettingsMapper", "Lcom/izettle/android/auth/model/mapper/KeyInSettingsMapper;", "keyInSettingsMapper", "Lcom/izettle/android/auth/model/mapper/GiftCardSettingsMapper;", "giftCardSettingsMapper", "Lcom/izettle/android/auth/model/mapper/PayPalQrcSettingsMapper;", "payPalQrcSettingsMapper", "Lcom/izettle/android/auth/model/mapper/VenmoQrcSettingsMapper;", "venmoQrcSettingsMapper", "Lcom/izettle/android/auth/model/mapper/ReceiptSettingsMapper;", "receiptSettingsMapper", "<init>", "(Lcom/izettle/android/auth/model/mapper/CustomerSettingsMapper;Lcom/izettle/android/auth/model/mapper/InvoiceSettingsMapper;Lcom/izettle/android/auth/model/mapper/PaymentLinkSettingsMapper;Lcom/izettle/android/auth/model/mapper/CashRegisterSettingsMapper;Lcom/izettle/android/auth/model/mapper/CashRegisterTssMapper;Lcom/izettle/android/auth/model/mapper/KlarnaInStoreSettingsMapper;Lcom/izettle/android/auth/model/mapper/KeyInSettingsMapper;Lcom/izettle/android/auth/model/mapper/GiftCardSettingsMapper;Lcom/izettle/android/auth/model/mapper/PayPalQrcSettingsMapper;Lcom/izettle/android/auth/model/mapper/VenmoQrcSettingsMapper;Lcom/izettle/android/auth/model/mapper/ReceiptSettingsMapper;)V", "from", "inverseMap", "(Lcom/zettle/android/entities/OrganizationSettings;)Lcom/izettle/android/auth/dto/OrganizationSettingsDto;", "map", "(Lcom/izettle/android/auth/dto/OrganizationSettingsDto;)Lcom/zettle/android/entities/OrganizationSettings;", "Lcom/izettle/android/auth/model/mapper/CashRegisterSettingsMapper;", "Lcom/izettle/android/auth/model/mapper/CashRegisterTssMapper;", "Lcom/izettle/android/auth/model/mapper/CustomerSettingsMapper;", "Lcom/izettle/android/auth/model/mapper/GiftCardSettingsMapper;", "Lcom/izettle/android/auth/model/mapper/InvoiceSettingsMapper;", "Lcom/izettle/android/auth/model/mapper/KeyInSettingsMapper;", "Lcom/izettle/android/auth/model/mapper/KlarnaInStoreSettingsMapper;", "Lcom/izettle/android/auth/model/mapper/PayPalQrcSettingsMapper;", "Lcom/izettle/android/auth/model/mapper/PaymentLinkSettingsMapper;", "Lcom/izettle/android/auth/model/mapper/ReceiptSettingsMapper;", "Lcom/izettle/android/auth/model/mapper/VenmoQrcSettingsMapper;"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes9.dex */
public final class OrganizationSettingsMapper implements com.izettle.android.auth.model.mapper.Mapper<com.izettle.android.auth.dto.OrganizationSettingsDto, com.zettle.android.entities.OrganizationSettings> {
    private final com.izettle.android.auth.model.mapper.CashRegisterSettingsMapper cashRegisterSettingsMapper;
    private final com.izettle.android.auth.model.mapper.CashRegisterTssMapper cashRegisterTssMapper;
    private final com.izettle.android.auth.model.mapper.CustomerSettingsMapper customerSettingsMapper;
    private final com.izettle.android.auth.model.mapper.GiftCardSettingsMapper giftCardSettingsMapper;
    private final com.izettle.android.auth.model.mapper.InvoiceSettingsMapper invoiceSettingsMapper;
    private final com.izettle.android.auth.model.mapper.KeyInSettingsMapper keyInSettingsMapper;
    private final com.izettle.android.auth.model.mapper.KlarnaInStoreSettingsMapper klarnaInStoreSettingsMapper;
    private final com.izettle.android.auth.model.mapper.PayPalQrcSettingsMapper payPalQrcSettingsMapper;
    private final com.izettle.android.auth.model.mapper.PaymentLinkSettingsMapper paymentLinkSettingsMapper;
    private final com.izettle.android.auth.model.mapper.ReceiptSettingsMapper receiptSettingsMapper;
    private final com.izettle.android.auth.model.mapper.VenmoQrcSettingsMapper venmoQrcSettingsMapper;

    public OrganizationSettingsMapper(com.izettle.android.auth.model.mapper.CustomerSettingsMapper customerSettingsMapper, com.izettle.android.auth.model.mapper.InvoiceSettingsMapper invoiceSettingsMapper, com.izettle.android.auth.model.mapper.PaymentLinkSettingsMapper paymentLinkSettingsMapper, com.izettle.android.auth.model.mapper.CashRegisterSettingsMapper cashRegisterSettingsMapper, com.izettle.android.auth.model.mapper.CashRegisterTssMapper cashRegisterTssMapper, com.izettle.android.auth.model.mapper.KlarnaInStoreSettingsMapper klarnaInStoreSettingsMapper, com.izettle.android.auth.model.mapper.KeyInSettingsMapper keyInSettingsMapper, com.izettle.android.auth.model.mapper.GiftCardSettingsMapper giftCardSettingsMapper, com.izettle.android.auth.model.mapper.PayPalQrcSettingsMapper payPalQrcSettingsMapper, com.izettle.android.auth.model.mapper.VenmoQrcSettingsMapper venmoQrcSettingsMapper, com.izettle.android.auth.model.mapper.ReceiptSettingsMapper receiptSettingsMapper) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(customerSettingsMapper, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(invoiceSettingsMapper, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(paymentLinkSettingsMapper, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(cashRegisterSettingsMapper, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(cashRegisterTssMapper, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(klarnaInStoreSettingsMapper, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(keyInSettingsMapper, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(giftCardSettingsMapper, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(payPalQrcSettingsMapper, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(venmoQrcSettingsMapper, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(receiptSettingsMapper, "");
        this.customerSettingsMapper = customerSettingsMapper;
        this.invoiceSettingsMapper = invoiceSettingsMapper;
        this.paymentLinkSettingsMapper = paymentLinkSettingsMapper;
        this.cashRegisterSettingsMapper = cashRegisterSettingsMapper;
        this.cashRegisterTssMapper = cashRegisterTssMapper;
        this.klarnaInStoreSettingsMapper = klarnaInStoreSettingsMapper;
        this.keyInSettingsMapper = keyInSettingsMapper;
        this.giftCardSettingsMapper = giftCardSettingsMapper;
        this.payPalQrcSettingsMapper = payPalQrcSettingsMapper;
        this.venmoQrcSettingsMapper = venmoQrcSettingsMapper;
        this.receiptSettingsMapper = receiptSettingsMapper;
    }

    @Override // com.izettle.android.auth.model.mapper.Mapper
    public final java.lang.Iterable<com.izettle.android.auth.dto.OrganizationSettingsDto> inverseMap(java.lang.Iterable<? extends com.zettle.android.entities.OrganizationSettings> iterable) {
        return com.izettle.android.auth.model.mapper.Mapper.DefaultImpls.inverseMap(this, iterable);
    }

    @Override // com.izettle.android.auth.model.mapper.Mapper
    public final java.lang.Iterable<com.zettle.android.entities.OrganizationSettings> map(java.lang.Iterable<? extends com.izettle.android.auth.dto.OrganizationSettingsDto> iterable) {
        return com.izettle.android.auth.model.mapper.Mapper.DefaultImpls.map(this, iterable);
    }

    public /* synthetic */ OrganizationSettingsMapper(com.izettle.android.auth.model.mapper.CustomerSettingsMapper customerSettingsMapper, com.izettle.android.auth.model.mapper.InvoiceSettingsMapper invoiceSettingsMapper, com.izettle.android.auth.model.mapper.PaymentLinkSettingsMapper paymentLinkSettingsMapper, com.izettle.android.auth.model.mapper.CashRegisterSettingsMapper cashRegisterSettingsMapper, com.izettle.android.auth.model.mapper.CashRegisterTssMapper cashRegisterTssMapper, com.izettle.android.auth.model.mapper.KlarnaInStoreSettingsMapper klarnaInStoreSettingsMapper, com.izettle.android.auth.model.mapper.KeyInSettingsMapper keyInSettingsMapper, com.izettle.android.auth.model.mapper.GiftCardSettingsMapper giftCardSettingsMapper, com.izettle.android.auth.model.mapper.PayPalQrcSettingsMapper payPalQrcSettingsMapper, com.izettle.android.auth.model.mapper.VenmoQrcSettingsMapper venmoQrcSettingsMapper, com.izettle.android.auth.model.mapper.ReceiptSettingsMapper receiptSettingsMapper, int i, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? new com.izettle.android.auth.model.mapper.CustomerSettingsMapper() : customerSettingsMapper, (i & 2) != 0 ? new com.izettle.android.auth.model.mapper.InvoiceSettingsMapper() : invoiceSettingsMapper, (i & 4) != 0 ? new com.izettle.android.auth.model.mapper.PaymentLinkSettingsMapper() : paymentLinkSettingsMapper, (i & 8) != 0 ? new com.izettle.android.auth.model.mapper.CashRegisterSettingsMapper() : cashRegisterSettingsMapper, (i & 16) != 0 ? new com.izettle.android.auth.model.mapper.CashRegisterTssMapper() : cashRegisterTssMapper, (i & 32) != 0 ? new com.izettle.android.auth.model.mapper.KlarnaInStoreSettingsMapper() : klarnaInStoreSettingsMapper, (i & 64) != 0 ? new com.izettle.android.auth.model.mapper.KeyInSettingsMapper() : keyInSettingsMapper, (i & 128) != 0 ? new com.izettle.android.auth.model.mapper.GiftCardSettingsMapper() : giftCardSettingsMapper, (i & 256) != 0 ? new com.izettle.android.auth.model.mapper.PayPalQrcSettingsMapper() : payPalQrcSettingsMapper, (i & 512) != 0 ? new com.izettle.android.auth.model.mapper.VenmoQrcSettingsMapper() : venmoQrcSettingsMapper, (i & 1024) != 0 ? new com.izettle.android.auth.model.mapper.ReceiptSettingsMapper() : receiptSettingsMapper);
    }

    @Override // com.izettle.android.auth.model.mapper.Mapper
    public final com.zettle.android.entities.OrganizationSettings map(com.izettle.android.auth.dto.OrganizationSettingsDto from) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(from, "");
        com.zettle.android.entities.OrganizationSettings.Companion companion = com.zettle.android.entities.OrganizationSettings.INSTANCE;
        com.izettle.android.auth.dto.CustomersSettingsDto customersSettingsDto = from.getCustomersSettingsDto();
        com.zettle.android.entities.CustomersSettings map = customersSettingsDto != null ? this.customerSettingsMapper.map(customersSettingsDto) : null;
        com.izettle.android.auth.dto.InvoiceSettingsDto invoiceSettingsDto = from.getInvoiceSettingsDto();
        com.zettle.android.entities.InvoiceSettings map2 = invoiceSettingsDto != null ? this.invoiceSettingsMapper.map(invoiceSettingsDto) : null;
        com.izettle.android.auth.dto.PaymentLinkSettingsDto paymentLinkSettingsDto = from.getPaymentLinkSettingsDto();
        com.zettle.android.entities.PaymentLinkSettings map3 = paymentLinkSettingsDto != null ? this.paymentLinkSettingsMapper.map(paymentLinkSettingsDto) : null;
        com.izettle.android.auth.dto.CashRegisterSettingsDto cashRegisterSettingsDto = from.getCashRegisterSettingsDto();
        com.zettle.android.entities.CashRegisterSettings map4 = cashRegisterSettingsDto != null ? this.cashRegisterSettingsMapper.map(cashRegisterSettingsDto) : null;
        com.izettle.android.auth.dto.CashRegisterTssDto cashRegisterTssDto = from.getCashRegisterTssDto();
        com.zettle.android.entities.CashRegisterTss map5 = cashRegisterTssDto != null ? this.cashRegisterTssMapper.map(cashRegisterTssDto) : null;
        com.izettle.android.auth.dto.KlarnaInStoreSettingsDto klarnaInStoreSettingsDto = from.getKlarnaInStoreSettingsDto();
        com.zettle.android.entities.KlarnaInStoreSettings map6 = klarnaInStoreSettingsDto != null ? this.klarnaInStoreSettingsMapper.map(klarnaInStoreSettingsDto) : null;
        com.izettle.android.auth.dto.KeyInSettingsDto keyInSettingsDto = from.getKeyInSettingsDto();
        com.zettle.android.entities.KeyInSettings map7 = keyInSettingsDto != null ? this.keyInSettingsMapper.map(keyInSettingsDto) : null;
        com.izettle.android.auth.dto.GiftCardSettingsDto giftCardSettingsDto = from.getGiftCardSettingsDto();
        com.zettle.android.entities.GiftCardSettings map8 = giftCardSettingsDto != null ? this.giftCardSettingsMapper.map(giftCardSettingsDto) : null;
        com.izettle.android.auth.dto.PayPalQrcSettingsDto payPalQrcSettingsDto = from.getPayPalQrcSettingsDto();
        com.zettle.android.entities.PayPalQrcSettings map9 = payPalQrcSettingsDto != null ? this.payPalQrcSettingsMapper.map(payPalQrcSettingsDto) : null;
        com.izettle.android.auth.dto.VenmoQrcSettingsDto venmoQrcSettingsDto = from.getVenmoQrcSettingsDto();
        com.zettle.android.entities.VenmoQrcSettings map10 = venmoQrcSettingsDto != null ? this.venmoQrcSettingsMapper.map(venmoQrcSettingsDto) : null;
        com.izettle.android.auth.dto.ReceiptSettingsDto receiptSettingsDto = from.getReceiptSettingsDto();
        return companion.invoke(map, map2, map3, map4, map5, map6, map7, map8, map9, map10, receiptSettingsDto != null ? this.receiptSettingsMapper.map(receiptSettingsDto) : null);
    }

    @Override // com.izettle.android.auth.model.mapper.Mapper
    public final com.izettle.android.auth.dto.OrganizationSettingsDto inverseMap(com.zettle.android.entities.OrganizationSettings from) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(from, "");
        com.zettle.android.entities.CustomersSettings customersSettings = from.getCustomersSettings();
        com.izettle.android.auth.dto.CustomersSettingsDto inverseMap = customersSettings != null ? this.customerSettingsMapper.inverseMap(customersSettings) : null;
        com.zettle.android.entities.InvoiceSettings invoiceSettings = from.getInvoiceSettings();
        com.izettle.android.auth.dto.InvoiceSettingsDto inverseMap2 = invoiceSettings != null ? this.invoiceSettingsMapper.inverseMap(invoiceSettings) : null;
        com.zettle.android.entities.PaymentLinkSettings paymentLinkSettings = from.getPaymentLinkSettings();
        com.izettle.android.auth.dto.PaymentLinkSettingsDto inverseMap3 = paymentLinkSettings != null ? this.paymentLinkSettingsMapper.inverseMap(paymentLinkSettings) : null;
        com.zettle.android.entities.CashRegisterSettings cashRegisterSettings = from.getCashRegisterSettings();
        com.izettle.android.auth.dto.CashRegisterSettingsDto inverseMap4 = cashRegisterSettings != null ? this.cashRegisterSettingsMapper.inverseMap(cashRegisterSettings) : null;
        com.zettle.android.entities.CashRegisterTss cashRegisterTss = from.getCashRegisterTss();
        com.izettle.android.auth.dto.CashRegisterTssDto inverseMap5 = cashRegisterTss != null ? this.cashRegisterTssMapper.inverseMap(cashRegisterTss) : null;
        com.zettle.android.entities.KlarnaInStoreSettings klarnaInStoreSettings = from.getKlarnaInStoreSettings();
        com.izettle.android.auth.dto.KlarnaInStoreSettingsDto inverseMap6 = klarnaInStoreSettings != null ? this.klarnaInStoreSettingsMapper.inverseMap(klarnaInStoreSettings) : null;
        com.zettle.android.entities.KeyInSettings keyInSettings = from.getKeyInSettings();
        com.izettle.android.auth.dto.KeyInSettingsDto inverseMap7 = keyInSettings != null ? this.keyInSettingsMapper.inverseMap(keyInSettings) : null;
        com.zettle.android.entities.GiftCardSettings giftCardSettings = from.getGiftCardSettings();
        com.izettle.android.auth.dto.GiftCardSettingsDto inverseMap8 = giftCardSettings != null ? this.giftCardSettingsMapper.inverseMap(giftCardSettings) : null;
        com.zettle.android.entities.PayPalQrcSettings payPalQrcSettings = from.getPayPalQrcSettings();
        com.izettle.android.auth.dto.PayPalQrcSettingsDto inverseMap9 = payPalQrcSettings != null ? this.payPalQrcSettingsMapper.inverseMap(payPalQrcSettings) : null;
        com.zettle.android.entities.VenmoQrcSettings venmoQrcSettings = from.getVenmoQrcSettings();
        com.izettle.android.auth.dto.VenmoQrcSettingsDto inverseMap10 = venmoQrcSettings != null ? this.venmoQrcSettingsMapper.inverseMap(venmoQrcSettings) : null;
        com.zettle.android.entities.ReceiptSettings receiptSettings = from.getReceiptSettings();
        return new com.izettle.android.auth.dto.OrganizationSettingsDto(inverseMap, inverseMap2, inverseMap3, inverseMap4, inverseMap5, inverseMap6, inverseMap7, inverseMap8, inverseMap9, inverseMap10, receiptSettings != null ? this.receiptSettingsMapper.inverseMap(receiptSettings) : null);
    }

    public OrganizationSettingsMapper() {
        this(null, null, null, null, null, null, null, null, null, null, null, 2047, null);
    }
}
