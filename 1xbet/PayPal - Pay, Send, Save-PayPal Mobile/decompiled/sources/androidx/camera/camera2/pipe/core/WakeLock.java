package androidx.camera.camera2.pipe.core;

@kotlin.Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0012\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\u00020\u0001:\u0001&B1\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006\u0012\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\b¢\u0006\u0004\b\u000b\u0010\fJ\u000f\u0010\u000e\u001a\u0004\u0018\u00010\r¢\u0006\u0004\b\u000e\u0010\u000fJ\r\u0010\u0010\u001a\u00020\u0006¢\u0006\u0004\b\u0010\u0010\u0011J\u000f\u0010\u0012\u001a\u00020\tH\u0000¢\u0006\u0004\b\u0012\u0010\u0013R\u0014\u0010\u0016\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010\u0015R\u0014\u0010\u0019\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010\u0018R\u0014\u0010\u001c\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001a\u0010\u001bR\u001a\u0010\u001e\u001a\b\u0012\u0004\u0012\u00020\t0\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0016\u0010\u001dR\u0014\u0010\u0014\u001a\u00020\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001c\u0010\u001fR\u0016\u0010\"\u001a\u00020 8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001e\u0010!R\u0018\u0010$\u001a\u0004\u0018\u00010#8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b$\u0010%R\u0016\u0010\u0017\u001a\u00020\u00068\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0019\u0010\u001b"}, d2 = {"Landroidx/camera/camera2/pipe/core/WakeLock;", "", "Lkotlinx/coroutines/CoroutineScope;", com.paypal.oslo.feature.identity.connect.inboundconnect.utils.Constants.SCOPE_KEY, "", com.datadog.trace.bootstrap.instrumentation.api.InstrumentationTags.TIMEOUT, "", "startTimeoutOnCreation", "Lkotlin/Function0;", "", com.sun.jna.Callback.METHOD_NAME, "<init>", "(Lkotlinx/coroutines/CoroutineScope;JZLkotlin/jvm/functions/Function0;)V", "Landroidx/camera/camera2/pipe/core/Token;", "acquire", "()Landroidx/camera/camera2/pipe/core/Token;", "release", "()Z", "releaseToken$camera_camera2_pipe", "()V", "getHighSpeedVideoFpsRangesFor", "Lkotlinx/coroutines/CoroutineScope;", "getHighSpeedVideoSizes", "getOutputFormats", "J", "Camera2StreamConfigurationMap", "getInputFormats", "Z", "getHighResolutionOutputSizeshNQ4ISI", "Lkotlin/jvm/functions/Function0;", "getHighSpeedVideoFpsRanges", "Ljava/lang/Object;", "", com.visa.cbp.getEncExpo.warmup, "getOutputMinFrameDuration", "Lkotlinx/coroutines/Job;", "getHighSpeedVideoSizesFor", "Lkotlinx/coroutines/Job;", "WakeLockToken"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class WakeLock {

    /* renamed from: Camera2StreamConfigurationMap, reason: from kotlin metadata */
    private boolean getOutputFormats;

    /* renamed from: getHighResolutionOutputSizeshNQ4ISI, reason: from kotlin metadata */
    private final java.lang.Object getHighSpeedVideoFpsRangesFor;

    /* renamed from: getHighSpeedVideoFpsRanges, reason: from kotlin metadata */
    private int getOutputMinFrameDuration;

    /* renamed from: getHighSpeedVideoFpsRangesFor, reason: from kotlin metadata */
    private final kotlinx.coroutines.CoroutineScope getHighSpeedVideoSizes;

    /* renamed from: getHighSpeedVideoSizes, reason: from kotlin metadata */
    private final kotlin.jvm.functions.Function0<kotlin.Unit> getHighSpeedVideoFpsRanges;
    private kotlinx.coroutines.Job getHighSpeedVideoSizesFor;

    /* renamed from: getInputFormats, reason: from kotlin metadata */
    private final boolean getHighResolutionOutputSizeshNQ4ISI;

    /* renamed from: getOutputFormats, reason: from kotlin metadata */
    private final long Camera2StreamConfigurationMap;

    public WakeLock(kotlinx.coroutines.CoroutineScope coroutineScope, long j, boolean z, kotlin.jvm.functions.Function0<kotlin.Unit> function0) {
        kotlinx.coroutines.Job launch$default;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(coroutineScope, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(function0, "");
        this.getHighSpeedVideoSizes = coroutineScope;
        this.Camera2StreamConfigurationMap = j;
        this.getHighResolutionOutputSizeshNQ4ISI = z;
        this.getHighSpeedVideoFpsRanges = function0;
        java.lang.Object obj = new java.lang.Object();
        this.getHighSpeedVideoFpsRangesFor = obj;
        if (z) {
            synchronized (obj) {
                launch$default = kotlinx.coroutines.BuildersKt__Builders_commonKt.launch$default(coroutineScope, null, null, new androidx.camera.camera2.pipe.core.WakeLock$startTimeout$1(this, null), 3, null);
                this.getHighSpeedVideoSizesFor = launch$default;
                kotlin.Unit unit = kotlin.Unit.INSTANCE;
            }
        }
    }

    public /* synthetic */ WakeLock(kotlinx.coroutines.CoroutineScope coroutineScope, long j, boolean z, kotlin.jvm.functions.Function0 function0, int i, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this(coroutineScope, (i & 2) != 0 ? 0L : j, (i & 4) != 0 ? false : z, function0);
    }

    @kotlin.Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0082\u0004\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u000f\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0005\u0010\u0006R\u0014\u0010\n\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010\tR\u0014\u0010\f\u001a\u00020\u00048WX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u000b\u0010\u0006"}, d2 = {"Landroidx/camera/camera2/pipe/core/WakeLock$WakeLockToken;", "Landroidx/camera/camera2/pipe/core/Token;", "<init>", "(Landroidx/camera/camera2/pipe/core/WakeLock;)V", "", "release", "()Z", "Lkotlinx/atomicfu/AtomicBoolean;", "getHighSpeedVideoSizes", "Lkotlinx/atomicfu/AtomicBoolean;", "getHighSpeedVideoFpsRanges", "getReleased", "Camera2StreamConfigurationMap"}, k = 1, mv = {2, 1, 0}, xi = 48)
    final class WakeLockToken implements androidx.camera.camera2.pipe.core.Token {

        /* renamed from: getHighSpeedVideoSizes, reason: from kotlin metadata */
        private final kotlinx.atomicfu.AtomicBoolean getHighSpeedVideoFpsRanges = kotlinx.atomicfu.AtomicFU.atomic(false);

        public WakeLockToken() {
        }

        @Override // androidx.camera.camera2.pipe.core.Token
        public final boolean getReleased() {
            return this.getHighSpeedVideoFpsRanges.getValue();
        }

        @Override // androidx.camera.camera2.pipe.core.Token
        public final boolean release() {
            if (!this.getHighSpeedVideoFpsRanges.compareAndSet(false, true)) {
                return false;
            }
            androidx.camera.camera2.pipe.core.WakeLock.this.releaseToken$camera_camera2_pipe();
            return true;
        }
    }

    public final androidx.camera.camera2.pipe.core.Token acquire() {
        synchronized (this.getHighSpeedVideoFpsRangesFor) {
            if (this.getOutputFormats) {
                return null;
            }
            int i = this.getOutputMinFrameDuration + 1;
            this.getOutputMinFrameDuration = i;
            if (i == 1) {
                kotlinx.coroutines.Job job = this.getHighSpeedVideoSizesFor;
                if (job != null) {
                    kotlinx.coroutines.Job.DefaultImpls.cancel$default(job, (java.util.concurrent.CancellationException) null, 1, (java.lang.Object) null);
                }
                this.getHighSpeedVideoSizesFor = null;
            }
            kotlin.Unit unit = kotlin.Unit.INSTANCE;
            return new androidx.camera.camera2.pipe.core.WakeLock.WakeLockToken();
        }
    }

    public final boolean release() {
        synchronized (this.getHighSpeedVideoFpsRangesFor) {
            if (this.getOutputFormats) {
                return false;
            }
            this.getOutputFormats = true;
            kotlinx.coroutines.Job job = this.getHighSpeedVideoSizesFor;
            if (job != null) {
                kotlinx.coroutines.Job.DefaultImpls.cancel$default(job, (java.util.concurrent.CancellationException) null, 1, (java.lang.Object) null);
            }
            this.getHighSpeedVideoSizesFor = null;
            kotlin.Unit unit = kotlin.Unit.INSTANCE;
            kotlinx.coroutines.BuildersKt__Builders_commonKt.launch$default(this.getHighSpeedVideoSizes, null, null, new androidx.camera.camera2.pipe.core.WakeLock$release$2(this, null), 3, null);
            return true;
        }
    }

    public final void releaseToken$camera_camera2_pipe() {
        kotlinx.coroutines.Job launch$default;
        synchronized (this.getHighSpeedVideoFpsRangesFor) {
            int i = this.getOutputMinFrameDuration - 1;
            this.getOutputMinFrameDuration = i;
            if (i == 0 && !this.getOutputFormats) {
                launch$default = kotlinx.coroutines.BuildersKt__Builders_commonKt.launch$default(this.getHighSpeedVideoSizes, null, null, new androidx.camera.camera2.pipe.core.WakeLock$startTimeout$1(this, null), 3, null);
                this.getHighSpeedVideoSizesFor = launch$default;
            }
            kotlin.Unit unit = kotlin.Unit.INSTANCE;
        }
    }
}
