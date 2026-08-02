package com.airbnb.lottie.compose;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0004\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005"}, d2 = {"Lcom/airbnb/lottie/compose/LottieCancellationBehavior;", "", "<init>", "(Ljava/lang/String;I)V", "Immediately", "OnIterationFinish"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class LottieCancellationBehavior {
    public static final com.airbnb.lottie.compose.LottieCancellationBehavior Immediately = new com.airbnb.lottie.compose.LottieCancellationBehavior("Immediately", 0);
    public static final com.airbnb.lottie.compose.LottieCancellationBehavior OnIterationFinish = new com.airbnb.lottie.compose.LottieCancellationBehavior("OnIterationFinish", 1);
    private static final /* synthetic */ com.airbnb.lottie.compose.LottieCancellationBehavior[] getHighResolutionOutputSizeshNQ4ISI;
    private static final /* synthetic */ kotlin.enums.EnumEntries getHighSpeedVideoSizes;

    private LottieCancellationBehavior(java.lang.String str, int i) {
    }

    static {
        com.airbnb.lottie.compose.LottieCancellationBehavior[] highSpeedVideoSizes = getHighSpeedVideoSizes();
        getHighResolutionOutputSizeshNQ4ISI = highSpeedVideoSizes;
        getHighSpeedVideoSizes = kotlin.enums.EnumEntriesKt.enumEntries(highSpeedVideoSizes);
    }

    public static com.airbnb.lottie.compose.LottieCancellationBehavior[] values() {
        return (com.airbnb.lottie.compose.LottieCancellationBehavior[]) getHighResolutionOutputSizeshNQ4ISI.clone();
    }

    public static com.airbnb.lottie.compose.LottieCancellationBehavior valueOf(java.lang.String str) {
        return (com.airbnb.lottie.compose.LottieCancellationBehavior) java.lang.Enum.valueOf(com.airbnb.lottie.compose.LottieCancellationBehavior.class, str);
    }

    public static kotlin.enums.EnumEntries<com.airbnb.lottie.compose.LottieCancellationBehavior> getEntries() {
        return getHighSpeedVideoSizes;
    }

    private static final /* synthetic */ com.airbnb.lottie.compose.LottieCancellationBehavior[] getHighSpeedVideoSizes() {
        return new com.airbnb.lottie.compose.LottieCancellationBehavior[]{Immediately, OnIterationFinish};
    }
}
