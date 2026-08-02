package com.paypal.oslo.core.navigation.ui;

@kotlin.Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\u0006\n\u0002\u0010 \n\u0002\b\u0004\bÂ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\"\u0010\n\u001a\u00020\u00048\u0007@\u0007X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0005\u0010\u0007\"\u0004\b\b\u0010\tR(\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u000b8\u0007@\u0007X\u0087\u000e¢\u0006\u0012\n\u0004\b\f\u0010\r\u001a\u0004\b\b\u0010\u000e\"\u0004\b\n\u0010\u000f"}, d2 = {"Lcom/paypal/oslo/core/navigation/ui/BottomNavPositionHolder;", "", "<init>", "()V", "", "getHighResolutionOutputSizeshNQ4ISI", com.adobe.marketing.mobile.internal.CoreConstants.Wrapper.Type.FLUTTER, "()F", "getHighSpeedVideoSizes", "(F)V", "getHighSpeedVideoFpsRanges", "", "getHighSpeedVideoFpsRangesFor", "Ljava/util/List;", "()Ljava/util/List;", "(Ljava/util/List;)V"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes10.dex */
final class BottomNavPositionHolder {

    /* renamed from: getHighResolutionOutputSizeshNQ4ISI, reason: from kotlin metadata */
    private static volatile float getHighSpeedVideoFpsRanges;
    public static final com.paypal.oslo.core.navigation.ui.BottomNavPositionHolder INSTANCE = new com.paypal.oslo.core.navigation.ui.BottomNavPositionHolder();

    /* renamed from: getHighSpeedVideoFpsRangesFor, reason: from kotlin metadata */
    private static volatile java.util.List<java.lang.Float> getHighResolutionOutputSizeshNQ4ISI = kotlin.collections.CollectionsKt.emptyList();

    private BottomNavPositionHolder() {
    }

    public static float getHighResolutionOutputSizeshNQ4ISI() {
        return getHighSpeedVideoFpsRanges;
    }

    public static void getHighSpeedVideoSizes(float f) {
        getHighSpeedVideoFpsRanges = f;
    }

    public static void getHighSpeedVideoFpsRanges(java.util.List<java.lang.Float> list) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(list, "");
        getHighResolutionOutputSizeshNQ4ISI = list;
    }

    public static java.util.List<java.lang.Float> getHighSpeedVideoSizes() {
        return getHighResolutionOutputSizeshNQ4ISI;
    }
}
