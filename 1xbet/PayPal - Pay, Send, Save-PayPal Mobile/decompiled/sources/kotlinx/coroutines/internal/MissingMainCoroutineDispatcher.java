package kotlinx.coroutines.internal;

@kotlin.Metadata(d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0001\n\u0002\b\f\b\u0002\u0018\u00002\u00020\u00012\u00020\u0002B\u001d\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0004\u001a\u00020\tH\u0016¢\u0006\u0004\b\u000b\u0010\fJ!\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0004\u001a\u00020\r2\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005H\u0016¢\u0006\u0004\b\u000f\u0010\u0010J+\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u0004\u001a\u00020\u00112\n\u0010\u0006\u001a\u00060\u0012j\u0002`\u00132\u0006\u0010\u0014\u001a\u00020\tH\u0016¢\u0006\u0004\b\u0016\u0010\u0017J\u000f\u0010\u0019\u001a\u00020\u0018H\u0002¢\u0006\u0004\b\u0019\u0010\u001aJ\u000f\u0010\u001b\u001a\u00020\u0005H\u0016¢\u0006\u0004\b\u001b\u0010\u001cR\u0016\u0010\u001e\u001a\u0004\u0018\u00010\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0019\u0010\u001dR\u0016\u0010!\u001a\u0004\u0018\u00010\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001f\u0010 R\u0014\u0010$\u001a\u00020\u00018WX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\"\u0010#"}, d2 = {"Lkotlinx/coroutines/internal/MissingMainCoroutineDispatcher;", "Lkotlinx/coroutines/MainCoroutineDispatcher;", "Lkotlinx/coroutines/Delay;", "", "p0", "", "p1", "<init>", "(Ljava/lang/Throwable;Ljava/lang/String;)V", "Lkotlin/coroutines/CoroutineContext;", "", "isDispatchNeeded", "(Lkotlin/coroutines/CoroutineContext;)Z", "", "Lkotlinx/coroutines/CoroutineDispatcher;", "limitedParallelism", "(ILjava/lang/String;)Lkotlinx/coroutines/CoroutineDispatcher;", "", "Ljava/lang/Runnable;", "Lkotlinx/coroutines/getHighSpeedVideoSizes;", "p2", "Lkotlinx/coroutines/DisposableHandle;", "invokeOnTimeout", "(JLjava/lang/Runnable;Lkotlin/coroutines/CoroutineContext;)Lkotlinx/coroutines/DisposableHandle;", "", "getHighResolutionOutputSizeshNQ4ISI", "()Ljava/lang/Void;", "toString", "()Ljava/lang/String;", "Ljava/lang/Throwable;", "getHighSpeedVideoFpsRanges", "getHighSpeedVideoSizes", "Ljava/lang/String;", "Camera2StreamConfigurationMap", "getImmediate", "()Lkotlinx/coroutines/MainCoroutineDispatcher;", "getHighSpeedVideoFpsRangesFor"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
final class MissingMainCoroutineDispatcher extends kotlinx.coroutines.MainCoroutineDispatcher implements kotlinx.coroutines.Delay {

    /* renamed from: getHighResolutionOutputSizeshNQ4ISI, reason: from kotlin metadata */
    private final java.lang.Throwable getHighSpeedVideoFpsRanges;

    /* renamed from: getHighSpeedVideoSizes, reason: from kotlin metadata */
    private final java.lang.String Camera2StreamConfigurationMap;

    public /* synthetic */ MissingMainCoroutineDispatcher(java.lang.Throwable th, java.lang.String str, int i, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this(th, (i & 2) != 0 ? null : str);
    }

    @Override // kotlinx.coroutines.Delay
    @kotlin.Deprecated(level = kotlin.DeprecationLevel.ERROR, message = "Deprecated without replacement as an internal method never intended for public use")
    public final java.lang.Object delay(long j, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        return kotlinx.coroutines.Delay.DefaultImpls.delay(this, j, continuation);
    }

    public MissingMainCoroutineDispatcher(java.lang.Throwable th, java.lang.String str) {
        this.getHighSpeedVideoFpsRanges = th;
        this.Camera2StreamConfigurationMap = str;
    }

    @Override // kotlinx.coroutines.MainCoroutineDispatcher
    public final kotlinx.coroutines.MainCoroutineDispatcher getImmediate() {
        return this;
    }

    @Override // kotlinx.coroutines.CoroutineDispatcher
    public final boolean isDispatchNeeded(kotlin.coroutines.CoroutineContext p0) {
        getHighResolutionOutputSizeshNQ4ISI();
        throw new kotlin.KotlinNothingValueException();
    }

    @Override // kotlinx.coroutines.MainCoroutineDispatcher, kotlinx.coroutines.CoroutineDispatcher
    public final kotlinx.coroutines.CoroutineDispatcher limitedParallelism(int p0, java.lang.String p1) {
        getHighResolutionOutputSizeshNQ4ISI();
        throw new kotlin.KotlinNothingValueException();
    }

    @Override // kotlinx.coroutines.Delay
    public final kotlinx.coroutines.DisposableHandle invokeOnTimeout(long p0, java.lang.Runnable p1, kotlin.coroutines.CoroutineContext p2) {
        getHighResolutionOutputSizeshNQ4ISI();
        throw new kotlin.KotlinNothingValueException();
    }

    private final java.lang.Void getHighResolutionOutputSizeshNQ4ISI() {
        java.lang.String str;
        if (this.getHighSpeedVideoFpsRanges == null) {
            kotlinx.coroutines.internal.MainDispatchersKt.throwMissingMainDispatcherException();
            throw new kotlin.KotlinNothingValueException();
        }
        java.lang.StringBuilder sb = new java.lang.StringBuilder("Module with the Main dispatcher had failed to initialize");
        java.lang.String str2 = this.Camera2StreamConfigurationMap;
        if (str2 == null || (str = ". ".concat(java.lang.String.valueOf(str2))) == null) {
            str = "";
        }
        sb.append(str);
        throw new java.lang.IllegalStateException(sb.toString(), this.getHighSpeedVideoFpsRanges);
    }

    @Override // kotlinx.coroutines.MainCoroutineDispatcher, kotlinx.coroutines.CoroutineDispatcher
    public final java.lang.String toString() {
        java.lang.String str;
        java.lang.StringBuilder sb = new java.lang.StringBuilder("Dispatchers.Main[missing");
        if (this.getHighSpeedVideoFpsRanges != null) {
            java.lang.StringBuilder sb2 = new java.lang.StringBuilder(", cause=");
            sb2.append(this.getHighSpeedVideoFpsRanges);
            str = sb2.toString();
        } else {
            str = "";
        }
        sb.append(str);
        sb.append(kotlinx.serialization.json.internal.AbstractJsonLexerKt.END_LIST);
        return sb.toString();
    }

    @Override // kotlinx.coroutines.CoroutineDispatcher
    public final /* synthetic */ void dispatch(kotlin.coroutines.CoroutineContext coroutineContext, java.lang.Runnable runnable) {
        getHighResolutionOutputSizeshNQ4ISI();
        throw new kotlin.KotlinNothingValueException();
    }

    @Override // kotlinx.coroutines.Delay
    public final /* synthetic */ void scheduleResumeAfterDelay(long j, kotlinx.coroutines.CancellableContinuation cancellableContinuation) {
        getHighResolutionOutputSizeshNQ4ISI();
        throw new kotlin.KotlinNothingValueException();
    }
}
