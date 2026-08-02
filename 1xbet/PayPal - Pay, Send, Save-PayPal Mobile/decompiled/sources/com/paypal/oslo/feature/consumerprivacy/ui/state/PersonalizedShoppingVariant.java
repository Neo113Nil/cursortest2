package com.paypal.oslo.feature.consumerprivacy.ui.state;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0004\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005"}, d2 = {"Lcom/paypal/oslo/feature/consumerprivacy/ui/state/PersonalizedShoppingVariant;", "", "<init>", "(Ljava/lang/String;I)V", "DEFAULT", "US_SPECIAL"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class PersonalizedShoppingVariant {
    private static final /* synthetic */ kotlin.enums.EnumEntries Camera2StreamConfigurationMap;
    public static final com.paypal.oslo.feature.consumerprivacy.ui.state.PersonalizedShoppingVariant DEFAULT;
    public static final com.paypal.oslo.feature.consumerprivacy.ui.state.PersonalizedShoppingVariant US_SPECIAL;
    private static final /* synthetic */ com.paypal.oslo.feature.consumerprivacy.ui.state.PersonalizedShoppingVariant[] getHighSpeedVideoFpsRanges;

    private PersonalizedShoppingVariant(java.lang.String str, int i) {
    }

    static {
        com.paypal.oslo.feature.consumerprivacy.ui.state.PersonalizedShoppingVariant personalizedShoppingVariant = new com.paypal.oslo.feature.consumerprivacy.ui.state.PersonalizedShoppingVariant("DEFAULT", 0);
        DEFAULT = personalizedShoppingVariant;
        com.paypal.oslo.feature.consumerprivacy.ui.state.PersonalizedShoppingVariant personalizedShoppingVariant2 = new com.paypal.oslo.feature.consumerprivacy.ui.state.PersonalizedShoppingVariant("US_SPECIAL", 1);
        US_SPECIAL = personalizedShoppingVariant2;
        com.paypal.oslo.feature.consumerprivacy.ui.state.PersonalizedShoppingVariant[] personalizedShoppingVariantArr = {personalizedShoppingVariant, personalizedShoppingVariant2};
        getHighSpeedVideoFpsRanges = personalizedShoppingVariantArr;
        Camera2StreamConfigurationMap = kotlin.enums.EnumEntriesKt.enumEntries(personalizedShoppingVariantArr);
    }

    public static com.paypal.oslo.feature.consumerprivacy.ui.state.PersonalizedShoppingVariant[] values() {
        return (com.paypal.oslo.feature.consumerprivacy.ui.state.PersonalizedShoppingVariant[]) getHighSpeedVideoFpsRanges.clone();
    }

    public static com.paypal.oslo.feature.consumerprivacy.ui.state.PersonalizedShoppingVariant valueOf(java.lang.String str) {
        return (com.paypal.oslo.feature.consumerprivacy.ui.state.PersonalizedShoppingVariant) java.lang.Enum.valueOf(com.paypal.oslo.feature.consumerprivacy.ui.state.PersonalizedShoppingVariant.class, str);
    }

    public static kotlin.enums.EnumEntries<com.paypal.oslo.feature.consumerprivacy.ui.state.PersonalizedShoppingVariant> getEntries() {
        return Camera2StreamConfigurationMap;
    }
}
