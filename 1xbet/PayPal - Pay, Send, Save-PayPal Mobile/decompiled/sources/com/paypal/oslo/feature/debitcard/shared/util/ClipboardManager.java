package com.paypal.oslo.feature.debitcard.shared.util;

@kotlin.Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u0000 \u00192\u00020\u0001:\u0001\u0019B\u0019\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J)\u0010\u000e\u001a\u00020\r2\u0006\u0010\t\u001a\u00020\b2\b\b\u0002\u0010\n\u001a\u00020\b2\b\b\u0002\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\u000e\u0010\u000fR\u0014\u0010\u0012\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0015\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010\u0014R\u0014\u0010\u0017\u001a\u00020\u00168\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010\u0018"}, d2 = {"Lcom/paypal/oslo/feature/debitcard/shared/util/ClipboardManager;", "", "Landroid/content/Context;", "context", "Landroidx/work/WorkManager;", "workManager", "<init>", "(Landroid/content/Context;Landroidx/work/WorkManager;)V", "", "text", "label", "", "timeoutMinutes", "", "copyWithTimeout", "(Ljava/lang/String;Ljava/lang/String;J)V", "getHighResolutionOutputSizeshNQ4ISI", "Landroid/content/Context;", "getHighSpeedVideoFpsRangesFor", "getHighSpeedVideoSizes", "Landroidx/work/WorkManager;", "Camera2StreamConfigurationMap", "Landroid/content/ClipboardManager;", "getHighSpeedVideoFpsRanges", "Landroid/content/ClipboardManager;", "Companion"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class ClipboardManager {
    public static final java.lang.String COPY_CARD_NUMBER_LABEL = "Card Number";

    /* renamed from: getHighResolutionOutputSizeshNQ4ISI, reason: from kotlin metadata */
    private final android.content.Context getHighSpeedVideoFpsRangesFor;
    private final android.content.ClipboardManager getHighSpeedVideoFpsRanges;

    /* renamed from: getHighSpeedVideoSizes, reason: from kotlin metadata */
    private final androidx.work.WorkManager Camera2StreamConfigurationMap;
    public static final int $stable = 8;

    public ClipboardManager(android.content.Context context, androidx.work.WorkManager workManager) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(context, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(workManager, "");
        this.getHighSpeedVideoFpsRangesFor = context;
        this.Camera2StreamConfigurationMap = workManager;
        java.lang.Object systemService = context.getSystemService("clipboard");
        kotlin.jvm.internal.Intrinsics.checkNotNull(systemService, "");
        this.getHighSpeedVideoFpsRanges = (android.content.ClipboardManager) systemService;
    }

    public /* synthetic */ ClipboardManager(android.content.Context context, androidx.work.WorkManager workManager, int i, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i & 2) != 0 ? androidx.work.WorkManager.INSTANCE.getInstance(context) : workManager);
    }

    public static /* synthetic */ void copyWithTimeout$default(com.paypal.oslo.feature.debitcard.shared.util.ClipboardManager clipboardManager, java.lang.String str, java.lang.String str2, long j, int i, java.lang.Object obj) {
        if ((i & 2) != 0) {
            str2 = COPY_CARD_NUMBER_LABEL;
        }
        if ((i & 4) != 0) {
            j = 15;
        }
        clipboardManager.copyWithTimeout(str, str2, j);
    }

    public final void copyWithTimeout(java.lang.String text, java.lang.String label, long timeoutMinutes) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(text, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(label, "");
        this.getHighSpeedVideoFpsRanges.setPrimaryClip(android.content.ClipData.newPlainText(label, text));
        this.Camera2StreamConfigurationMap.enqueueUniqueWork("clear_clipboard", androidx.work.ExistingWorkPolicy.REPLACE, new androidx.work.OneTimeWorkRequest.Builder((java.lang.Class<? extends androidx.work.ListenableWorker>) com.paypal.oslo.feature.debitcard.shared.worker.ClearClipboardWorker.class).setInitialDelay(timeoutMinutes, java.util.concurrent.TimeUnit.MINUTES).addTag("clear_clipboard").build());
    }
}
