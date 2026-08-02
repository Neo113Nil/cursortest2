package com.paypal.oslo.feature.identity.analytics.domain;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@kotlin.Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\u000e\n\u0002\b\u000f\b\u0080\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0011\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u0017\u0010\u0006\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\b\u0010\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\fj\u0002\b\rj\u0002\b\u000ej\u0002\b\u000fj\u0002\b\u0010j\u0002\b\u0011"}, d2 = {"Lcom/paypal/oslo/feature/identity/analytics/domain/ItemName;", "", "", "p0", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", com.datadog.android.rum.internal.metric.ViewEndedMetricDispatcher.KEY_VALUE, "Ljava/lang/String;", "getValue", "()Ljava/lang/String;", "Cta", "Edit", com.paypal.oslo.feature.balance.common.AutoReloadConstants.IntentNames.INTENT_DISMISS, "AddPasswordField", "MoreOptions", "CountryPicker", "CountryCodePicker", "IdentifierField"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class ItemName {
    public static final com.paypal.oslo.feature.identity.analytics.domain.ItemName AddPasswordField;
    private static final /* synthetic */ kotlin.enums.EnumEntries Camera2StreamConfigurationMap;
    public static final com.paypal.oslo.feature.identity.analytics.domain.ItemName CountryCodePicker;
    public static final com.paypal.oslo.feature.identity.analytics.domain.ItemName CountryPicker;
    public static final com.paypal.oslo.feature.identity.analytics.domain.ItemName Cta;
    public static final com.paypal.oslo.feature.identity.analytics.domain.ItemName Dismiss;
    public static final com.paypal.oslo.feature.identity.analytics.domain.ItemName Edit;
    public static final com.paypal.oslo.feature.identity.analytics.domain.ItemName IdentifierField;
    public static final com.paypal.oslo.feature.identity.analytics.domain.ItemName MoreOptions;
    private static final /* synthetic */ com.paypal.oslo.feature.identity.analytics.domain.ItemName[] getHighSpeedVideoSizes;
    private final java.lang.String value;

    private ItemName(java.lang.String str, int i, java.lang.String str2) {
        this.value = str2;
    }

    public final java.lang.String getValue() {
        return this.value;
    }

    static {
        com.paypal.oslo.feature.identity.analytics.domain.ItemName itemName = new com.paypal.oslo.feature.identity.analytics.domain.ItemName("Cta", 0, "cta");
        Cta = itemName;
        com.paypal.oslo.feature.identity.analytics.domain.ItemName itemName2 = new com.paypal.oslo.feature.identity.analytics.domain.ItemName("Edit", 1, "edit");
        Edit = itemName2;
        com.paypal.oslo.feature.identity.analytics.domain.ItemName itemName3 = new com.paypal.oslo.feature.identity.analytics.domain.ItemName(com.paypal.oslo.feature.balance.common.AutoReloadConstants.IntentNames.INTENT_DISMISS, 2, "dismiss");
        Dismiss = itemName3;
        com.paypal.oslo.feature.identity.analytics.domain.ItemName itemName4 = new com.paypal.oslo.feature.identity.analytics.domain.ItemName("AddPasswordField", 3, "add_password_field");
        AddPasswordField = itemName4;
        com.paypal.oslo.feature.identity.analytics.domain.ItemName itemName5 = new com.paypal.oslo.feature.identity.analytics.domain.ItemName("MoreOptions", 4, "more_options");
        MoreOptions = itemName5;
        com.paypal.oslo.feature.identity.analytics.domain.ItemName itemName6 = new com.paypal.oslo.feature.identity.analytics.domain.ItemName("CountryPicker", 5, "country_picker");
        CountryPicker = itemName6;
        com.paypal.oslo.feature.identity.analytics.domain.ItemName itemName7 = new com.paypal.oslo.feature.identity.analytics.domain.ItemName("CountryCodePicker", 6, "country_code_picker");
        CountryCodePicker = itemName7;
        com.paypal.oslo.feature.identity.analytics.domain.ItemName itemName8 = new com.paypal.oslo.feature.identity.analytics.domain.ItemName("IdentifierField", 7, "identifier_field");
        IdentifierField = itemName8;
        com.paypal.oslo.feature.identity.analytics.domain.ItemName[] itemNameArr = {itemName, itemName2, itemName3, itemName4, itemName5, itemName6, itemName7, itemName8};
        getHighSpeedVideoSizes = itemNameArr;
        Camera2StreamConfigurationMap = kotlin.enums.EnumEntriesKt.enumEntries(itemNameArr);
    }

    public static com.paypal.oslo.feature.identity.analytics.domain.ItemName[] values() {
        return (com.paypal.oslo.feature.identity.analytics.domain.ItemName[]) getHighSpeedVideoSizes.clone();
    }

    public static com.paypal.oslo.feature.identity.analytics.domain.ItemName valueOf(java.lang.String str) {
        return (com.paypal.oslo.feature.identity.analytics.domain.ItemName) java.lang.Enum.valueOf(com.paypal.oslo.feature.identity.analytics.domain.ItemName.class, str);
    }

    public static kotlin.enums.EnumEntries<com.paypal.oslo.feature.identity.analytics.domain.ItemName> getEntries() {
        return Camera2StreamConfigurationMap;
    }
}
