package com.paypal.oslo.feature.searchandintelligence.ui;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0006\b\u0082\u0001\u0018\u0000 \u00042\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\u0004B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007"}, d2 = {"Lcom/paypal/oslo/feature/searchandintelligence/ui/StreamCompletionStatus;", "", "<init>", "(Ljava/lang/String;I)V", "Companion", "Camera2StreamConfigurationMap", "getHighSpeedVideoSizes", "getHighResolutionOutputSizeshNQ4ISI"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes14.dex */
final class StreamCompletionStatus {
    public static final com.paypal.oslo.feature.searchandintelligence.ui.StreamCompletionStatus Camera2StreamConfigurationMap;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final com.paypal.oslo.feature.searchandintelligence.ui.StreamCompletionStatus.Companion INSTANCE;
    public static final com.paypal.oslo.feature.searchandintelligence.ui.StreamCompletionStatus getHighResolutionOutputSizeshNQ4ISI;
    private static final /* synthetic */ kotlin.enums.EnumEntries getHighSpeedVideoFpsRanges;
    private static final /* synthetic */ com.paypal.oslo.feature.searchandintelligence.ui.StreamCompletionStatus[] getHighSpeedVideoFpsRangesFor;
    public static final com.paypal.oslo.feature.searchandintelligence.ui.StreamCompletionStatus getHighSpeedVideoSizes;

    private StreamCompletionStatus(java.lang.String str, int i) {
    }

    static {
        com.paypal.oslo.feature.searchandintelligence.ui.StreamCompletionStatus streamCompletionStatus = new com.paypal.oslo.feature.searchandintelligence.ui.StreamCompletionStatus("COMPLETED", 0);
        Camera2StreamConfigurationMap = streamCompletionStatus;
        com.paypal.oslo.feature.searchandintelligence.ui.StreamCompletionStatus streamCompletionStatus2 = new com.paypal.oslo.feature.searchandintelligence.ui.StreamCompletionStatus("ERROR", 1);
        getHighSpeedVideoSizes = streamCompletionStatus2;
        com.paypal.oslo.feature.searchandintelligence.ui.StreamCompletionStatus streamCompletionStatus3 = new com.paypal.oslo.feature.searchandintelligence.ui.StreamCompletionStatus("ABRUPT", 2);
        getHighResolutionOutputSizeshNQ4ISI = streamCompletionStatus3;
        com.paypal.oslo.feature.searchandintelligence.ui.StreamCompletionStatus[] streamCompletionStatusArr = {streamCompletionStatus, streamCompletionStatus2, streamCompletionStatus3};
        getHighSpeedVideoFpsRangesFor = streamCompletionStatusArr;
        getHighSpeedVideoFpsRanges = kotlin.enums.EnumEntriesKt.enumEntries(streamCompletionStatusArr);
        INSTANCE = new com.paypal.oslo.feature.searchandintelligence.ui.StreamCompletionStatus.Companion(null);
    }

    @kotlin.Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001d\u0010\b\u001a\u00020\u00072\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u0004¢\u0006\u0004\b\b\u0010\t"}, d2 = {"Lcom/paypal/oslo/feature/searchandintelligence/ui/StreamCompletionStatus$Companion;", "", "<init>", "()V", "", "hasError", "completedEventReceived", "Lcom/paypal/oslo/feature/searchandintelligence/ui/StreamCompletionStatus;", "from", "(ZZ)Lcom/paypal/oslo/feature/searchandintelligence/ui/StreamCompletionStatus;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class Companion {
        private Companion() {
        }

        public final com.paypal.oslo.feature.searchandintelligence.ui.StreamCompletionStatus from(boolean hasError, boolean completedEventReceived) {
            if (hasError) {
                return com.paypal.oslo.feature.searchandintelligence.ui.StreamCompletionStatus.getHighSpeedVideoSizes;
            }
            if (completedEventReceived) {
                return com.paypal.oslo.feature.searchandintelligence.ui.StreamCompletionStatus.Camera2StreamConfigurationMap;
            }
            return com.paypal.oslo.feature.searchandintelligence.ui.StreamCompletionStatus.getHighResolutionOutputSizeshNQ4ISI;
        }

        public /* synthetic */ Companion(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public static com.paypal.oslo.feature.searchandintelligence.ui.StreamCompletionStatus[] values() {
        return (com.paypal.oslo.feature.searchandintelligence.ui.StreamCompletionStatus[]) getHighSpeedVideoFpsRangesFor.clone();
    }

    public static com.paypal.oslo.feature.searchandintelligence.ui.StreamCompletionStatus valueOf(java.lang.String str) {
        return (com.paypal.oslo.feature.searchandintelligence.ui.StreamCompletionStatus) java.lang.Enum.valueOf(com.paypal.oslo.feature.searchandintelligence.ui.StreamCompletionStatus.class, str);
    }
}
