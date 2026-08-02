package androidx.view;

@kotlin.Metadata(d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0012\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0000\u0018\u0000*\u0004\b\u0000\u0010\u00012\u00020\u0002Bn\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00000\u0003\u00129\u0010\u000b\u001a5\b\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u0006\u0012\n\u0012\b\u0012\u0004\u0012\u00020\b0\u0007\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u0005j\n\b\u0001\u0012\u0004\u0012\u00028\u0000`\t¢\u0006\u0002\b\n\u0012\u0006\u0010\r\u001a\u00020\f\u0012\u0006\u0010\u000f\u001a\u00020\u000e\u0012\f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\b0\u0010¢\u0006\u0004\b\u0012\u0010\u0013J\r\u0010\u0014\u001a\u00020\b¢\u0006\u0004\b\u0014\u0010\u0015J\r\u0010\u0016\u001a\u00020\b¢\u0006\u0004\b\u0016\u0010\u0015R\u001a\u0010\u0017\u001a\b\u0012\u0004\u0012\u00028\u00000\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010\u0018RG\u0010\u0019\u001a5\b\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u0006\u0012\n\u0012\b\u0012\u0004\u0012\u00020\b0\u0007\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u0005j\n\b\u0001\u0012\u0004\u0012\u00028\u0000`\t¢\u0006\u0002\b\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0019\u0010\u001aR\u0014\u0010\u001d\u001a\u00020\f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001b\u0010\u001cR\u0014\u0010 \u001a\u00020\u000e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001e\u0010\u001fR\u001a\u0010!\u001a\b\u0012\u0004\u0012\u00020\b0\u00108\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b!\u0010\"R\u0018\u0010%\u001a\u0004\u0018\u00010#8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001d\u0010$R\u0018\u0010\u001e\u001a\u0004\u0018\u00010#8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b \u0010$"}, d2 = {"Landroidx/lifecycle/BlockRunner;", "T", "", "Landroidx/lifecycle/CoroutineLiveData;", "liveData", "Lkotlin/Function2;", "Landroidx/lifecycle/LiveDataScope;", "Lkotlin/coroutines/Continuation;", "", "Landroidx/lifecycle/Block;", "Lkotlin/ExtensionFunctionType;", "block", "", "timeoutInMs", "Lkotlinx/coroutines/CoroutineScope;", com.paypal.oslo.feature.identity.connect.inboundconnect.utils.Constants.SCOPE_KEY, "Lkotlin/Function0;", "onDone", "<init>", "(Landroidx/lifecycle/CoroutineLiveData;Lkotlin/jvm/functions/Function2;JLkotlinx/coroutines/CoroutineScope;Lkotlin/jvm/functions/Function0;)V", "maybeRun", "()V", com.paypal.oslo.feature.identity.passwordrecovery.ui.analytics.PasswordRecoveryAnalytics.ITEM_CANCEL, "Camera2StreamConfigurationMap", "Landroidx/lifecycle/CoroutineLiveData;", "getHighSpeedVideoFpsRangesFor", "Lkotlin/jvm/functions/Function2;", "getHighSpeedVideoSizesFor", "J", "getHighResolutionOutputSizeshNQ4ISI", "getInputFormats", "Lkotlinx/coroutines/CoroutineScope;", "getHighSpeedVideoFpsRanges", "getHighSpeedVideoSizes", "Lkotlin/jvm/functions/Function0;", "Lkotlinx/coroutines/Job;", "Lkotlinx/coroutines/Job;", "getOutputFormats"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class BlockRunner<T> {
    private final androidx.view.CoroutineLiveData<T> Camera2StreamConfigurationMap;

    /* renamed from: getHighResolutionOutputSizeshNQ4ISI, reason: from kotlin metadata */
    private kotlinx.coroutines.Job getOutputFormats;

    /* renamed from: getHighSpeedVideoFpsRanges, reason: from kotlin metadata */
    private kotlinx.coroutines.Job getInputFormats;
    private final kotlin.jvm.functions.Function2<androidx.view.LiveDataScope<T>, kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> getHighSpeedVideoFpsRangesFor;
    private final kotlin.jvm.functions.Function0<kotlin.Unit> getHighSpeedVideoSizes;

    /* renamed from: getHighSpeedVideoSizesFor, reason: from kotlin metadata */
    private final long getHighResolutionOutputSizeshNQ4ISI;

    /* renamed from: getInputFormats, reason: from kotlin metadata */
    private final kotlinx.coroutines.CoroutineScope getHighSpeedVideoFpsRanges;

    /* JADX WARN: Multi-variable type inference failed */
    public BlockRunner(androidx.view.CoroutineLiveData<T> coroutineLiveData, kotlin.jvm.functions.Function2<? super androidx.view.LiveDataScope<T>, ? super kotlin.coroutines.Continuation<? super kotlin.Unit>, ? extends java.lang.Object> function2, long j, kotlinx.coroutines.CoroutineScope coroutineScope, kotlin.jvm.functions.Function0<kotlin.Unit> function0) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(coroutineLiveData, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(function2, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(coroutineScope, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(function0, "");
        this.Camera2StreamConfigurationMap = coroutineLiveData;
        this.getHighSpeedVideoFpsRangesFor = function2;
        this.getHighResolutionOutputSizeshNQ4ISI = j;
        this.getHighSpeedVideoFpsRanges = coroutineScope;
        this.getHighSpeedVideoSizes = function0;
    }

    public final void maybeRun() {
        kotlinx.coroutines.Job launch$default;
        kotlinx.coroutines.Job job = this.getInputFormats;
        if (job != null) {
            kotlinx.coroutines.Job.DefaultImpls.cancel$default(job, (java.util.concurrent.CancellationException) null, 1, (java.lang.Object) null);
        }
        this.getInputFormats = null;
        if (this.getOutputFormats != null) {
            return;
        }
        launch$default = kotlinx.coroutines.BuildersKt__Builders_commonKt.launch$default(this.getHighSpeedVideoFpsRanges, null, null, new androidx.view.BlockRunner$maybeRun$1(this, null), 3, null);
        this.getOutputFormats = launch$default;
    }

    public final void cancel() {
        kotlinx.coroutines.Job launch$default;
        if (this.getInputFormats == null) {
            launch$default = kotlinx.coroutines.BuildersKt__Builders_commonKt.launch$default(this.getHighSpeedVideoFpsRanges, kotlinx.coroutines.Dispatchers.getMain().getImmediate(), null, new androidx.view.BlockRunner$cancel$1(this, null), 2, null);
            this.getInputFormats = launch$default;
            return;
        }
        throw new java.lang.IllegalStateException("Cancel call cannot happen without a maybeRun".toString());
    }
}
