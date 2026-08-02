package com.miteksystems.misnap.workflow.util;

@kotlin.Metadata(d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u001f\b\u0000\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0007\u0010\bB\u0011\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0007\u0010\tB\t\b\u0016¢\u0006\u0004\b\u0007\u0010\nJ\u001d\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\r\u001a\u00020\u0005¢\u0006\u0004\b\u000f\u0010\u0010J\u0015\u0010\u0011\u001a\u00020\u000e2\u0006\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\u0011\u0010\u0012J\u0015\u0010\u0013\u001a\u00020\u000e2\u0006\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\u0013\u0010\u0012J\u0015\u0010\u0014\u001a\u00020\u000e2\u0006\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\u0014\u0010\u0012J\r\u0010\u0015\u001a\u00020\u000e¢\u0006\u0004\b\u0015\u0010\nJ\u0015\u0010\u0017\u001a\u00020\u00162\u0006\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\u0017\u0010\u0018J\u0015\u0010\u0019\u001a\u00020\u00052\u0006\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\u0019\u0010\u001aR\u001a\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001b\u0010\u001cR\u0014\u0010\u001b\u001a\u00020\u001e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001d\u0010\u001fR0\u0010&\u001a\u001e\u0012\u0004\u0012\u00020!\u0012\u0004\u0012\u00020\"0 j\u000e\u0012\u0004\u0012\u00020!\u0012\u0004\u0012\u00020\"`#8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b$\u0010%"}, d2 = {"Lcom/miteksystems/misnap/workflow/util/PausableTimer;", "", "Landroid/os/Looper;", "looper", "Lkotlin/Function0;", "", "currentTime", "<init>", "(Landroid/os/Looper;Lkotlin/jvm/functions/Function0;)V", "(Landroid/os/Looper;)V", "()V", "Ljava/lang/Runnable;", "runnable", "delay", "", com.adobe.marketing.mobile.internal.CoreConstants.EventDataKeys.Lifecycle.LIFECYCLE_START, "(Ljava/lang/Runnable;J)V", com.adobe.marketing.mobile.internal.CoreConstants.EventDataKeys.Lifecycle.LIFECYCLE_PAUSE, "(Ljava/lang/Runnable;)V", "resume", com.paypal.oslo.feature.identity.passwordrecovery.ui.analytics.PasswordRecoveryAnalytics.ITEM_CANCEL, "cancelAll", "", "isRunning", "(Ljava/lang/Runnable;)Z", "remainingTime", "(Ljava/lang/Runnable;)J", "Camera2StreamConfigurationMap", "Lkotlin/jvm/functions/Function0;", "getHighResolutionOutputSizeshNQ4ISI", "Landroid/os/Handler;", "Landroid/os/Handler;", "Ljava/util/HashMap;", "", "Lcom/miteksystems/misnap/workflow/util/a;", "Lkotlin/collections/getHighSpeedVideoFpsRangesFor;", "getHighSpeedVideoSizes", "Ljava/util/HashMap;", "getHighSpeedVideoFpsRangesFor"}, k = 1, mv = {1, 8, 0})
/* loaded from: classes10.dex */
public final class PausableTimer {

    /* renamed from: Camera2StreamConfigurationMap, reason: from kotlin metadata */
    private final kotlin.jvm.functions.Function0<java.lang.Long> getHighResolutionOutputSizeshNQ4ISI;

    /* renamed from: getHighResolutionOutputSizeshNQ4ISI, reason: from kotlin metadata */
    private final android.os.Handler Camera2StreamConfigurationMap;

    /* renamed from: getHighSpeedVideoSizes, reason: from kotlin metadata */
    private final java.util.HashMap<java.lang.Integer, com.miteksystems.misnap.workflow.util.a> getHighSpeedVideoFpsRangesFor;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public PausableTimer() {
        this(r0, com.miteksystems.misnap.workflow.util.PausableTimer.b.getHighSpeedVideoFpsRangesFor);
        android.os.Looper mainLooper = android.os.Looper.getMainLooper();
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(mainLooper, "");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public PausableTimer(android.os.Looper looper) {
        this(looper, com.miteksystems.misnap.workflow.util.PausableTimer.a.Camera2StreamConfigurationMap);
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(looper, "");
    }

    public PausableTimer(android.os.Looper looper, kotlin.jvm.functions.Function0<java.lang.Long> function0) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(looper, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(function0, "");
        this.getHighResolutionOutputSizeshNQ4ISI = function0;
        this.Camera2StreamConfigurationMap = new android.os.Handler(looper);
        this.getHighSpeedVideoFpsRangesFor = new java.util.HashMap<>();
    }

    public static /* synthetic */ void $r8$lambda$KmTfwObMXhgLehtsEQJbKgTs5zk(java.lang.Runnable runnable, com.miteksystems.misnap.workflow.util.PausableTimer pausableTimer) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(runnable, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(pausableTimer, "");
        runnable.run();
        pausableTimer.getHighSpeedVideoFpsRangesFor.remove(java.lang.Integer.valueOf(runnable.hashCode()));
    }

    public final boolean isRunning(java.lang.Runnable runnable) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(runnable, "");
        com.miteksystems.misnap.workflow.util.a aVar = this.getHighSpeedVideoFpsRangesFor.get(java.lang.Integer.valueOf(runnable.hashCode()));
        if (aVar != null) {
            return aVar.getHighSpeedVideoSizes;
        }
        return false;
    }

    public final void pause(java.lang.Runnable runnable) {
        com.miteksystems.misnap.workflow.util.a aVar;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(runnable, "");
        if (!isRunning(runnable) || (aVar = this.getHighSpeedVideoFpsRangesFor.get(java.lang.Integer.valueOf(runnable.hashCode()))) == null) {
            return;
        }
        long j = aVar.getHighSpeedVideoFpsRangesFor;
        long longValue = this.getHighResolutionOutputSizeshNQ4ISI.invoke().longValue();
        long j2 = aVar.getHighSpeedVideoFpsRanges;
        this.Camera2StreamConfigurationMap.removeCallbacksAndMessages(aVar);
        this.getHighSpeedVideoFpsRangesFor.put(java.lang.Integer.valueOf(runnable.hashCode()), new com.miteksystems.misnap.workflow.util.a(this.getHighResolutionOutputSizeshNQ4ISI.invoke().longValue(), j - (longValue - j2), false));
    }

    public final long remainingTime(java.lang.Runnable runnable) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(runnable, "");
        if (isRunning(runnable)) {
            com.miteksystems.misnap.workflow.util.a aVar = this.getHighSpeedVideoFpsRangesFor.get(java.lang.Integer.valueOf(runnable.hashCode()));
            if (aVar != null) {
                return aVar.getHighSpeedVideoFpsRangesFor - (this.getHighResolutionOutputSizeshNQ4ISI.invoke().longValue() - aVar.getHighSpeedVideoFpsRanges);
            }
            return 0L;
        }
        com.miteksystems.misnap.workflow.util.a aVar2 = this.getHighSpeedVideoFpsRangesFor.get(java.lang.Integer.valueOf(runnable.hashCode()));
        if (aVar2 != null) {
            return aVar2.getHighSpeedVideoFpsRangesFor;
        }
        return 0L;
    }

    public final void resume(java.lang.Runnable runnable) {
        com.miteksystems.misnap.workflow.util.a aVar;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(runnable, "");
        if (isRunning(runnable) || (aVar = this.getHighSpeedVideoFpsRangesFor.get(java.lang.Integer.valueOf(runnable.hashCode()))) == null) {
            return;
        }
        com.miteksystems.misnap.workflow.util.a aVar2 = new com.miteksystems.misnap.workflow.util.a(this.getHighResolutionOutputSizeshNQ4ISI.invoke().longValue(), aVar.getHighSpeedVideoFpsRangesFor, true);
        androidx.core.os.HandlerCompat.postDelayed(this.Camera2StreamConfigurationMap, new com.miteksystems.misnap.workflow.util.PausableTimer$$ExternalSyntheticLambda0(runnable, this), aVar2, aVar.getHighSpeedVideoFpsRangesFor);
        this.getHighSpeedVideoFpsRangesFor.put(java.lang.Integer.valueOf(runnable.hashCode()), aVar2);
    }

    public final void start(java.lang.Runnable runnable, long delay) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(runnable, "");
        com.miteksystems.misnap.workflow.util.a aVar = new com.miteksystems.misnap.workflow.util.a(this.getHighResolutionOutputSizeshNQ4ISI.invoke().longValue(), delay, true);
        com.miteksystems.misnap.workflow.util.a aVar2 = this.getHighSpeedVideoFpsRangesFor.get(java.lang.Integer.valueOf(runnable.hashCode()));
        if (aVar2 != null) {
            this.Camera2StreamConfigurationMap.removeCallbacksAndMessages(aVar2);
        }
        this.getHighSpeedVideoFpsRangesFor.put(java.lang.Integer.valueOf(runnable.hashCode()), aVar);
        androidx.core.os.HandlerCompat.postDelayed(this.Camera2StreamConfigurationMap, new com.miteksystems.misnap.workflow.util.PausableTimer$$ExternalSyntheticLambda0(runnable, this), aVar, delay);
    }

    @kotlin.Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    final /* synthetic */ class a extends kotlin.jvm.internal.FunctionReferenceImpl implements kotlin.jvm.functions.Function0<java.lang.Long> {
        public static final com.miteksystems.misnap.workflow.util.PausableTimer.a Camera2StreamConfigurationMap = new com.miteksystems.misnap.workflow.util.PausableTimer.a();

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: getHighSpeedVideoFpsRanges, reason: merged with bridge method [inline-methods] */
        public final java.lang.Long invoke() {
            return java.lang.Long.valueOf(java.lang.System.currentTimeMillis());
        }

        a() {
            super(0, java.lang.System.class, "currentTimeMillis", "currentTimeMillis()J", 0);
        }
    }

    @kotlin.Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    final /* synthetic */ class b extends kotlin.jvm.internal.FunctionReferenceImpl implements kotlin.jvm.functions.Function0<java.lang.Long> {
        public static final com.miteksystems.misnap.workflow.util.PausableTimer.b getHighSpeedVideoFpsRangesFor = new com.miteksystems.misnap.workflow.util.PausableTimer.b();

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: Camera2StreamConfigurationMap, reason: merged with bridge method [inline-methods] */
        public final java.lang.Long invoke() {
            return java.lang.Long.valueOf(java.lang.System.currentTimeMillis());
        }

        b() {
            super(0, java.lang.System.class, "currentTimeMillis", "currentTimeMillis()J", 0);
        }
    }

    public final void cancelAll() {
        this.getHighSpeedVideoFpsRangesFor.clear();
        this.Camera2StreamConfigurationMap.removeCallbacksAndMessages(null);
    }

    public final void cancel(java.lang.Runnable runnable) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(runnable, "");
        com.miteksystems.misnap.workflow.util.a aVar = this.getHighSpeedVideoFpsRangesFor.get(java.lang.Integer.valueOf(runnable.hashCode()));
        if (aVar != null) {
            this.Camera2StreamConfigurationMap.removeCallbacksAndMessages(aVar);
            this.getHighSpeedVideoFpsRangesFor.remove(java.lang.Integer.valueOf(runnable.hashCode()));
        }
    }
}
