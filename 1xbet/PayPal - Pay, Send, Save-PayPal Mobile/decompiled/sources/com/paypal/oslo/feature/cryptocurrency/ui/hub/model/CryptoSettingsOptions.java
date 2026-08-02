package com.paypal.oslo.feature.cryptocurrency.ui.hub.model;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@kotlin.Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0010\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u001b\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007R\u001a\u0010\b\u001a\u00020\u00028\u0001X\u0080\u0004¢\u0006\f\n\u0004\b\b\u0010\t\u001a\u0004\b\n\u0010\u000bR\u001a\u0010\f\u001a\u00020\u00048\u0001X\u0081\u0004¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\u000e\u0010\u000fj\u0002\b\u0010j\u0002\b\u0011j\u0002\b\u0012j\u0002\b\u0013j\u0002\b\u0014"}, d2 = {"Lcom/paypal/oslo/feature/cryptocurrency/ui/hub/model/CryptoSettingsOptions;", "", "", "p0", "Lcom/paypal/pds/core/Icon;", "p1", "<init>", "(Ljava/lang/String;IILcom/paypal/pds/core/Icon;)V", "title", com.visa.cbp.getEncExpo.warmup, "getTitle$cryptocurrency_prodRelease", "()I", "icon", "Lcom/paypal/pds/core/Icon;", "getIcon$cryptocurrency_prodRelease", "()Lcom/paypal/pds/core/Icon;", "RECURRING_PURCHASES", "PRICE_ALERTS", "ADDRESS_BOOK", "PYUSD_REWARDS", "TAX_DOCUMENTS"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class CryptoSettingsOptions {
    public static final com.paypal.oslo.feature.cryptocurrency.ui.hub.model.CryptoSettingsOptions ADDRESS_BOOK;
    private static final /* synthetic */ com.paypal.oslo.feature.cryptocurrency.ui.hub.model.CryptoSettingsOptions[] Camera2StreamConfigurationMap;
    public static final com.paypal.oslo.feature.cryptocurrency.ui.hub.model.CryptoSettingsOptions PRICE_ALERTS;
    public static final com.paypal.oslo.feature.cryptocurrency.ui.hub.model.CryptoSettingsOptions PYUSD_REWARDS;
    public static final com.paypal.oslo.feature.cryptocurrency.ui.hub.model.CryptoSettingsOptions RECURRING_PURCHASES;
    public static final com.paypal.oslo.feature.cryptocurrency.ui.hub.model.CryptoSettingsOptions TAX_DOCUMENTS;
    private static final /* synthetic */ kotlin.enums.EnumEntries getHighResolutionOutputSizeshNQ4ISI;
    private final com.paypal.pds.core.Icon icon;
    private final int title;

    private CryptoSettingsOptions(java.lang.String str, int i, int i2, com.paypal.pds.core.Icon icon) {
        this.title = i2;
        this.icon = icon;
    }

    /* renamed from: getTitle$cryptocurrency_prodRelease, reason: from getter */
    public final int getTitle() {
        return this.title;
    }

    /* synthetic */ CryptoSettingsOptions(java.lang.String str, int i, int i2, com.paypal.pds.core.Icon.NoIcon noIcon, int i3, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this(str, i, i2, (i3 & 2) != 0 ? com.paypal.pds.core.Icon.NoIcon.INSTANCE : noIcon);
    }

    /* renamed from: getIcon$cryptocurrency_prodRelease, reason: from getter */
    public final com.paypal.pds.core.Icon getIcon() {
        return this.icon;
    }

    static {
        com.paypal.oslo.feature.cryptocurrency.ui.hub.model.CryptoSettingsOptions cryptoSettingsOptions = new com.paypal.oslo.feature.cryptocurrency.ui.hub.model.CryptoSettingsOptions("RECURRING_PURCHASES", 0, com.paypal.oslo.feature.cryptocurrency.R.string.feature_cryptocurrency_settings_recurring_purchases, com.paypal.pds.core.Icon.ArrowsClockwise.INSTANCE);
        RECURRING_PURCHASES = cryptoSettingsOptions;
        com.paypal.oslo.feature.cryptocurrency.ui.hub.model.CryptoSettingsOptions cryptoSettingsOptions2 = new com.paypal.oslo.feature.cryptocurrency.ui.hub.model.CryptoSettingsOptions("PRICE_ALERTS", 1, com.paypal.oslo.feature.cryptocurrency.R.string.feature_cryptocurrency_settings_price_alerts, com.paypal.pds.core.Icon.Bell.INSTANCE);
        PRICE_ALERTS = cryptoSettingsOptions2;
        com.paypal.oslo.feature.cryptocurrency.ui.hub.model.CryptoSettingsOptions cryptoSettingsOptions3 = new com.paypal.oslo.feature.cryptocurrency.ui.hub.model.CryptoSettingsOptions("ADDRESS_BOOK", 2, com.paypal.oslo.feature.cryptocurrency.R.string.feature_cryptocurrency_settings_address_book, com.paypal.pds.core.Icon.Wallet.INSTANCE);
        ADDRESS_BOOK = cryptoSettingsOptions3;
        com.paypal.oslo.feature.cryptocurrency.ui.hub.model.CryptoSettingsOptions cryptoSettingsOptions4 = new com.paypal.oslo.feature.cryptocurrency.ui.hub.model.CryptoSettingsOptions("PYUSD_REWARDS", 3, com.paypal.oslo.feature.cryptocurrency.R.string.feature_cryptocurrency_settings_pyusd_rewards, null, 2, null);
        PYUSD_REWARDS = cryptoSettingsOptions4;
        com.paypal.oslo.feature.cryptocurrency.ui.hub.model.CryptoSettingsOptions cryptoSettingsOptions5 = new com.paypal.oslo.feature.cryptocurrency.ui.hub.model.CryptoSettingsOptions("TAX_DOCUMENTS", 4, com.paypal.oslo.feature.cryptocurrency.R.string.feature_cryptocurrency_settings_tax_documents, com.paypal.pds.core.Icon.Document.INSTANCE);
        TAX_DOCUMENTS = cryptoSettingsOptions5;
        com.paypal.oslo.feature.cryptocurrency.ui.hub.model.CryptoSettingsOptions[] cryptoSettingsOptionsArr = {cryptoSettingsOptions, cryptoSettingsOptions2, cryptoSettingsOptions3, cryptoSettingsOptions4, cryptoSettingsOptions5};
        Camera2StreamConfigurationMap = cryptoSettingsOptionsArr;
        getHighResolutionOutputSizeshNQ4ISI = kotlin.enums.EnumEntriesKt.enumEntries(cryptoSettingsOptionsArr);
    }

    public static com.paypal.oslo.feature.cryptocurrency.ui.hub.model.CryptoSettingsOptions[] values() {
        return (com.paypal.oslo.feature.cryptocurrency.ui.hub.model.CryptoSettingsOptions[]) Camera2StreamConfigurationMap.clone();
    }

    public static com.paypal.oslo.feature.cryptocurrency.ui.hub.model.CryptoSettingsOptions valueOf(java.lang.String str) {
        return (com.paypal.oslo.feature.cryptocurrency.ui.hub.model.CryptoSettingsOptions) java.lang.Enum.valueOf(com.paypal.oslo.feature.cryptocurrency.ui.hub.model.CryptoSettingsOptions.class, str);
    }

    public static kotlin.enums.EnumEntries<com.paypal.oslo.feature.cryptocurrency.ui.hub.model.CryptoSettingsOptions> getEntries() {
        return getHighResolutionOutputSizeshNQ4ISI;
    }
}
