package com.paypal.android.taptopay.data.thales.init;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0004\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005"}, d2 = {"Lcom/paypal/android/taptopay/data/thales/init/AppPaymentExperience;", "", "<init>", "(Ljava/lang/String;I)V", "ONE_TAP", "TWO_TAP"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes10.dex */
public final class AppPaymentExperience {
    public static final com.paypal.android.taptopay.data.thales.init.AppPaymentExperience ONE_TAP;
    public static final com.paypal.android.taptopay.data.thales.init.AppPaymentExperience TWO_TAP;
    private static final /* synthetic */ com.paypal.android.taptopay.data.thales.init.AppPaymentExperience[] getHighSpeedVideoFpsRangesFor;
    private static final /* synthetic */ kotlin.enums.EnumEntries getHighSpeedVideoSizes;

    private AppPaymentExperience(java.lang.String str, int i) {
    }

    static {
        com.paypal.android.taptopay.data.thales.init.AppPaymentExperience appPaymentExperience = new com.paypal.android.taptopay.data.thales.init.AppPaymentExperience("ONE_TAP", 0);
        ONE_TAP = appPaymentExperience;
        com.paypal.android.taptopay.data.thales.init.AppPaymentExperience appPaymentExperience2 = new com.paypal.android.taptopay.data.thales.init.AppPaymentExperience("TWO_TAP", 1);
        TWO_TAP = appPaymentExperience2;
        com.paypal.android.taptopay.data.thales.init.AppPaymentExperience[] appPaymentExperienceArr = {appPaymentExperience, appPaymentExperience2};
        getHighSpeedVideoFpsRangesFor = appPaymentExperienceArr;
        getHighSpeedVideoSizes = kotlin.enums.EnumEntriesKt.enumEntries(appPaymentExperienceArr);
    }

    public static com.paypal.android.taptopay.data.thales.init.AppPaymentExperience[] values() {
        return (com.paypal.android.taptopay.data.thales.init.AppPaymentExperience[]) getHighSpeedVideoFpsRangesFor.clone();
    }

    public static com.paypal.android.taptopay.data.thales.init.AppPaymentExperience valueOf(java.lang.String str) {
        return (com.paypal.android.taptopay.data.thales.init.AppPaymentExperience) java.lang.Enum.valueOf(com.paypal.android.taptopay.data.thales.init.AppPaymentExperience.class, str);
    }

    public static kotlin.enums.EnumEntries<com.paypal.android.taptopay.data.thales.init.AppPaymentExperience> getEntries() {
        return getHighSpeedVideoSizes;
    }
}
