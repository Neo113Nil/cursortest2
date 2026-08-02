package com.paypal.android.taptopay.data.thales.fcm.model;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0006\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007"}, d2 = {"Lcom/paypal/android/taptopay/data/thales/fcm/model/PushSender;", "", "<init>", "(Ljava/lang/String;I)V", "CPS", "MG", "TNS", "UNKNOWN"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class PushSender {
    public static final com.paypal.android.taptopay.data.thales.fcm.model.PushSender CPS;
    private static final /* synthetic */ kotlin.enums.EnumEntries Camera2StreamConfigurationMap;
    public static final com.paypal.android.taptopay.data.thales.fcm.model.PushSender MG;
    public static final com.paypal.android.taptopay.data.thales.fcm.model.PushSender TNS;
    public static final com.paypal.android.taptopay.data.thales.fcm.model.PushSender UNKNOWN;
    private static final /* synthetic */ com.paypal.android.taptopay.data.thales.fcm.model.PushSender[] getHighResolutionOutputSizeshNQ4ISI;

    private PushSender(java.lang.String str, int i) {
    }

    static {
        com.paypal.android.taptopay.data.thales.fcm.model.PushSender pushSender = new com.paypal.android.taptopay.data.thales.fcm.model.PushSender("CPS", 0);
        CPS = pushSender;
        com.paypal.android.taptopay.data.thales.fcm.model.PushSender pushSender2 = new com.paypal.android.taptopay.data.thales.fcm.model.PushSender("MG", 1);
        MG = pushSender2;
        com.paypal.android.taptopay.data.thales.fcm.model.PushSender pushSender3 = new com.paypal.android.taptopay.data.thales.fcm.model.PushSender("TNS", 2);
        TNS = pushSender3;
        com.paypal.android.taptopay.data.thales.fcm.model.PushSender pushSender4 = new com.paypal.android.taptopay.data.thales.fcm.model.PushSender("UNKNOWN", 3);
        UNKNOWN = pushSender4;
        com.paypal.android.taptopay.data.thales.fcm.model.PushSender[] pushSenderArr = {pushSender, pushSender2, pushSender3, pushSender4};
        getHighResolutionOutputSizeshNQ4ISI = pushSenderArr;
        Camera2StreamConfigurationMap = kotlin.enums.EnumEntriesKt.enumEntries(pushSenderArr);
    }

    public static com.paypal.android.taptopay.data.thales.fcm.model.PushSender[] values() {
        return (com.paypal.android.taptopay.data.thales.fcm.model.PushSender[]) getHighResolutionOutputSizeshNQ4ISI.clone();
    }

    public static com.paypal.android.taptopay.data.thales.fcm.model.PushSender valueOf(java.lang.String str) {
        return (com.paypal.android.taptopay.data.thales.fcm.model.PushSender) java.lang.Enum.valueOf(com.paypal.android.taptopay.data.thales.fcm.model.PushSender.class, str);
    }

    public static kotlin.enums.EnumEntries<com.paypal.android.taptopay.data.thales.fcm.model.PushSender> getEntries() {
        return Camera2StreamConfigurationMap;
    }
}
