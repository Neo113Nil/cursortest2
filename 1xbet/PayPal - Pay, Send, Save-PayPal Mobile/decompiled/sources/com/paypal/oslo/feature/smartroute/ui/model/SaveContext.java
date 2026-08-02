package com.paypal.oslo.feature.smartroute.ui.model;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0005\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006"}, d2 = {"Lcom/paypal/oslo/feature/smartroute/ui/model/SaveContext;", "", "<init>", "(Ljava/lang/String;I)V", "NONE", "REGULAR_SAVE", "TURN_OFF"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes15.dex */
public final class SaveContext {
    public static final com.paypal.oslo.feature.smartroute.ui.model.SaveContext NONE;
    public static final com.paypal.oslo.feature.smartroute.ui.model.SaveContext REGULAR_SAVE;
    public static final com.paypal.oslo.feature.smartroute.ui.model.SaveContext TURN_OFF;
    private static final /* synthetic */ kotlin.enums.EnumEntries getHighSpeedVideoFpsRanges;
    private static final /* synthetic */ com.paypal.oslo.feature.smartroute.ui.model.SaveContext[] getHighSpeedVideoSizes;

    private SaveContext(java.lang.String str, int i) {
    }

    static {
        com.paypal.oslo.feature.smartroute.ui.model.SaveContext saveContext = new com.paypal.oslo.feature.smartroute.ui.model.SaveContext("NONE", 0);
        NONE = saveContext;
        com.paypal.oslo.feature.smartroute.ui.model.SaveContext saveContext2 = new com.paypal.oslo.feature.smartroute.ui.model.SaveContext("REGULAR_SAVE", 1);
        REGULAR_SAVE = saveContext2;
        com.paypal.oslo.feature.smartroute.ui.model.SaveContext saveContext3 = new com.paypal.oslo.feature.smartroute.ui.model.SaveContext("TURN_OFF", 2);
        TURN_OFF = saveContext3;
        com.paypal.oslo.feature.smartroute.ui.model.SaveContext[] saveContextArr = {saveContext, saveContext2, saveContext3};
        getHighSpeedVideoSizes = saveContextArr;
        getHighSpeedVideoFpsRanges = kotlin.enums.EnumEntriesKt.enumEntries(saveContextArr);
    }

    public static com.paypal.oslo.feature.smartroute.ui.model.SaveContext[] values() {
        return (com.paypal.oslo.feature.smartroute.ui.model.SaveContext[]) getHighSpeedVideoSizes.clone();
    }

    public static com.paypal.oslo.feature.smartroute.ui.model.SaveContext valueOf(java.lang.String str) {
        return (com.paypal.oslo.feature.smartroute.ui.model.SaveContext) java.lang.Enum.valueOf(com.paypal.oslo.feature.smartroute.ui.model.SaveContext.class, str);
    }

    public static kotlin.enums.EnumEntries<com.paypal.oslo.feature.smartroute.ui.model.SaveContext> getEntries() {
        return getHighSpeedVideoFpsRanges;
    }
}
