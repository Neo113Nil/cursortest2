package androidx.work.impl.utils;

@kotlin.Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u000b\u0018\u00002\u00020\u0001B'\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bB!\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\n\u0010\fJ\u000f\u0010\u000e\u001a\u00020\rH\u0016¢\u0006\u0004\b\u000e\u0010\u000fR\u0014\u0010\u0010\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0014\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013R\u0014\u0010\u0015\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016R\u0014\u0010\u0017\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010\u0018"}, d2 = {"Landroidx/work/impl/utils/StopWorkRunnable;", "Ljava/lang/Runnable;", "Landroidx/work/impl/Processor;", "processor", "Landroidx/work/impl/StartStopToken;", com.paypal.oslo.feature.inappcheckout.domain.util.LoggerParameterKeys.TOKEN_KEY, "", "stopInForeground", "", "reason", "<init>", "(Landroidx/work/impl/Processor;Landroidx/work/impl/StartStopToken;ZI)V", "(Landroidx/work/impl/Processor;Landroidx/work/impl/StartStopToken;Z)V", "", "run", "()V", "getHighResolutionOutputSizeshNQ4ISI", "Landroidx/work/impl/Processor;", "getHighSpeedVideoSizes", "Landroidx/work/impl/StartStopToken;", "getHighSpeedVideoFpsRangesFor", "getHighSpeedVideoFpsRanges", "Z", "Camera2StreamConfigurationMap", com.visa.cbp.getEncExpo.warmup}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class StopWorkRunnable implements java.lang.Runnable {
    private final int Camera2StreamConfigurationMap;
    private final androidx.work.impl.Processor getHighResolutionOutputSizeshNQ4ISI;
    private final boolean getHighSpeedVideoFpsRanges;

    /* renamed from: getHighSpeedVideoSizes, reason: from kotlin metadata */
    private final androidx.work.impl.StartStopToken getHighSpeedVideoFpsRangesFor;

    public StopWorkRunnable(androidx.work.impl.Processor processor, androidx.work.impl.StartStopToken startStopToken, boolean z, int i) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(processor, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(startStopToken, "");
        this.getHighResolutionOutputSizeshNQ4ISI = processor;
        this.getHighSpeedVideoFpsRangesFor = startStopToken;
        this.getHighSpeedVideoFpsRanges = z;
        this.Camera2StreamConfigurationMap = i;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public StopWorkRunnable(androidx.work.impl.Processor processor, androidx.work.impl.StartStopToken startStopToken, boolean z) {
        this(processor, startStopToken, z, androidx.work.WorkInfo.STOP_REASON_UNKNOWN);
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(processor, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(startStopToken, "");
    }

    @Override // java.lang.Runnable
    public final void run() {
        boolean stopWork;
        if (this.getHighSpeedVideoFpsRanges) {
            stopWork = this.getHighResolutionOutputSizeshNQ4ISI.stopForegroundWork(this.getHighSpeedVideoFpsRangesFor, this.Camera2StreamConfigurationMap);
        } else {
            stopWork = this.getHighResolutionOutputSizeshNQ4ISI.stopWork(this.getHighSpeedVideoFpsRangesFor, this.Camera2StreamConfigurationMap);
        }
        androidx.work.Logger logger = androidx.work.Logger.get();
        java.lang.String tagWithPrefix = androidx.work.Logger.tagWithPrefix("StopWorkRunnable");
        java.lang.StringBuilder sb = new java.lang.StringBuilder("StopWorkRunnable for ");
        sb.append(this.getHighSpeedVideoFpsRangesFor.getId().getWorkSpecId());
        sb.append("; Processor.stopWork = ");
        sb.append(stopWork);
        logger.debug(tagWithPrefix, sb.toString());
    }
}
