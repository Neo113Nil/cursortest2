package androidx.view.compose;

@kotlin.Metadata(d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0002\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u000f\u0010\t\u001a\u00020\bH\u0002¢\u0006\u0004\b\t\u0010\nJ\u0017\u0010\f\u001a\u00020\b2\u0006\u0010\u0003\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\f\u0010\rJ\u0017\u0010\u000e\u001a\u00020\b2\u0006\u0010\u0003\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\u000e\u0010\rJ\u000f\u0010\u000f\u001a\u00020\bH\u0016¢\u0006\u0004\b\u000f\u0010\nJ\u000f\u0010\u0010\u001a\u00020\bH\u0016¢\u0006\u0004\b\u0010\u0010\nR\u0011\u0010\u0013\u001a\u00020\u00028\u0006¢\u0006\u0006\n\u0004\b\u0011\u0010\u0012R=\u0010\u0011\u001a)\b\u0001\u0012\u000f\u0012\r\u0012\u0004\u0012\u00020\u000b0\u0015¢\u0006\u0002\b\u0016\u0012\n\u0012\b\u0012\u0004\u0012\u00020\b0\u0017\u0012\u0006\u0012\u0004\u0018\u00010\u00180\u00148\u0007@\u0007X\u0086\f¢\u0006\u0006\n\u0004\b\u0013\u0010\u0019R$\u0010\u001f\u001a\u00020\u001a2\u0006\u0010\u0003\u001a\u00020\u001a8W@WX\u0096\u000e¢\u0006\f\u001a\u0004\b\u001b\u0010\u001c\"\u0004\b\u001d\u0010\u001eR\u001e\u0010!\u001a\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010 8\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\b!\u0010\"R\u0018\u0010\t\u001a\u0004\u0018\u00010#8\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\b\u001f\u0010$R\u0016\u0010&\u001a\u00020\u001a8\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\b\t\u0010%"}, d2 = {"Landroidx/activity/compose/ComposePredictiveBackHandler;", "Landroidx/activity/compose/internal/BackHandlerCompat;", "Lkotlinx/coroutines/CoroutineScope;", "p0", "Landroidx/activity/compose/PredictiveBackHandlerInfo;", "p1", "<init>", "(Lkotlinx/coroutines/CoroutineScope;Landroidx/activity/compose/PredictiveBackHandlerInfo;)V", "", "getHighSpeedVideoSizes", "()V", "Landroidx/activity/BackEventCompat;", "onBackStarted", "(Landroidx/activity/BackEventCompat;)V", "onBackProgressed", "onBackCompleted", "onBackCancelled", "Camera2StreamConfigurationMap", "Lkotlinx/coroutines/CoroutineScope;", "getHighSpeedVideoFpsRangesFor", "Lkotlin/Function2;", "Lkotlinx/coroutines/flow/Flow;", "Lkotlin/ParameterName;", "Lkotlin/coroutines/Continuation;", "", "Lkotlin/jvm/functions/Function2;", "", "isBackEnabled", "()Z", "setBackEnabled", "(Z)V", "getHighResolutionOutputSizeshNQ4ISI", "Lkotlinx/coroutines/channels/Channel;", "getHighSpeedVideoFpsRanges", "Lkotlinx/coroutines/channels/Channel;", "Lkotlinx/coroutines/Job;", "Lkotlinx/coroutines/Job;", "Z", "getHighSpeedVideoSizesFor"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes5.dex */
final class ComposePredictiveBackHandler extends androidx.view.compose.internal.BackHandlerCompat {

    /* renamed from: Camera2StreamConfigurationMap, reason: from kotlin metadata */
    private final kotlinx.coroutines.CoroutineScope getHighSpeedVideoFpsRangesFor;

    /* renamed from: getHighResolutionOutputSizeshNQ4ISI, reason: from kotlin metadata */
    private kotlinx.coroutines.Job getHighSpeedVideoSizes;
    private kotlinx.coroutines.channels.Channel<androidx.view.BackEventCompat> getHighSpeedVideoFpsRanges;

    /* renamed from: getHighSpeedVideoFpsRangesFor, reason: from kotlin metadata */
    kotlin.jvm.functions.Function2<? super kotlinx.coroutines.flow.Flow<androidx.view.BackEventCompat>, ? super kotlin.coroutines.Continuation<? super kotlin.Unit>, ? extends java.lang.Object> Camera2StreamConfigurationMap;

    /* renamed from: getHighSpeedVideoSizes, reason: from kotlin metadata */
    private boolean getHighSpeedVideoSizesFor;

    public ComposePredictiveBackHandler(kotlinx.coroutines.CoroutineScope coroutineScope, androidx.view.compose.PredictiveBackHandlerInfo predictiveBackHandlerInfo) {
        super(predictiveBackHandlerInfo);
        this.getHighSpeedVideoFpsRangesFor = coroutineScope;
        this.Camera2StreamConfigurationMap = new androidx.view.compose.ComposePredictiveBackHandler$currentOnBack$1(null);
    }

    @Override // androidx.view.compose.internal.BackHandlerCompat
    public final boolean isBackEnabled() {
        return super.isBackEnabled();
    }

    @Override // androidx.view.compose.internal.BackHandlerCompat
    public final void setBackEnabled(boolean z) {
        kotlinx.coroutines.Job job;
        if (!z && super.isBackEnabled() && (job = this.getHighSpeedVideoSizes) != null && !job.isActive()) {
            onBackCancelled();
        }
        super.setBackEnabled(z);
    }

    private final void getHighSpeedVideoSizes() {
        kotlinx.coroutines.Job launch$default;
        this.getHighSpeedVideoFpsRanges = kotlinx.coroutines.channels.ChannelKt.Channel$default(-2, kotlinx.coroutines.channels.BufferOverflow.SUSPEND, null, 4, null);
        launch$default = kotlinx.coroutines.BuildersKt__Builders_commonKt.launch$default(this.getHighSpeedVideoFpsRangesFor, null, null, new androidx.view.compose.ComposePredictiveBackHandler$launchNewGesture$1(this, null), 3, null);
        this.getHighSpeedVideoSizes = launch$default;
    }

    @Override // androidx.view.compose.internal.BackHandlerCompat
    public final void onBackStarted(androidx.view.BackEventCompat p0) {
        onBackCancelled();
        if (isBackEnabled()) {
            this.getHighSpeedVideoSizesFor = true;
            getHighSpeedVideoSizes();
        }
    }

    @Override // androidx.view.compose.internal.BackHandlerCompat
    public final void onBackProgressed(androidx.view.BackEventCompat p0) {
        kotlinx.coroutines.channels.Channel<androidx.view.BackEventCompat> channel = this.getHighSpeedVideoFpsRanges;
        if (channel != null) {
            kotlinx.coroutines.channels.ChannelResult.m24079boximpl(channel.mo9266trySendJP2dKIU(p0));
        }
    }

    @Override // androidx.view.compose.internal.BackHandlerCompat
    public final void onBackCompleted() {
        if (this.getHighSpeedVideoFpsRanges != null && !this.getHighSpeedVideoSizesFor) {
            onBackCancelled();
        }
        if (this.getHighSpeedVideoFpsRanges == null) {
            this.getHighSpeedVideoSizesFor = false;
            getHighSpeedVideoSizes();
        }
        kotlinx.coroutines.channels.Channel<androidx.view.BackEventCompat> channel = this.getHighSpeedVideoFpsRanges;
        if (channel != null) {
            kotlinx.coroutines.channels.SendChannel.DefaultImpls.close$default(channel, null, 1, null);
        }
        this.getHighSpeedVideoSizesFor = false;
    }

    @Override // androidx.view.compose.internal.BackHandlerCompat
    public final void onBackCancelled() {
        kotlinx.coroutines.channels.Channel<androidx.view.BackEventCompat> channel = this.getHighSpeedVideoFpsRanges;
        if (channel != null) {
            channel.cancel(new java.util.concurrent.CancellationException("onBack cancelled"));
        }
        kotlinx.coroutines.Job job = this.getHighSpeedVideoSizes;
        if (job != null) {
            kotlinx.coroutines.Job.DefaultImpls.cancel$default(job, (java.util.concurrent.CancellationException) null, 1, (java.lang.Object) null);
        }
        this.getHighSpeedVideoFpsRanges = null;
        this.getHighSpeedVideoSizes = null;
        this.getHighSpeedVideoSizesFor = false;
    }
}
