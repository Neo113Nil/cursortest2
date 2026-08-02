package okio.internal;

@kotlin.Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\b\u0012\u0004\u0012\u00020\u00030\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlin/sequences/SequenceScope;", "Lokio/Path;"}, k = 3, mv = {2, 2, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "okio.internal.-FileSystem$commonListRecursively$1", f = "FileSystem.kt", i = {0, 0, 0}, l = {96}, m = "invokeSuspend", n = {"$this$sequence", com.datadog.android.trace.api.DatadogTracingConstants.LogAttributes.STACK, "child"}, s = {"L$0", "L$1", "L$3"}, v = 1)
/* renamed from: okio.internal.-FileSystem$commonListRecursively$1, reason: invalid class name */
/* loaded from: classes5.dex */
final class FileSystem$commonListRecursively$1 extends kotlin.coroutines.jvm.internal.RestrictedSuspendLambda implements kotlin.jvm.functions.Function2<kotlin.sequences.SequenceScope<? super okio.Path>, kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> {
    final /* synthetic */ boolean Camera2StreamConfigurationMap;
    java.lang.Object getHighResolutionOutputSizeshNQ4ISI;
    java.lang.Object getHighSpeedVideoFpsRanges;
    final /* synthetic */ okio.FileSystem getHighSpeedVideoFpsRangesFor;
    final /* synthetic */ okio.Path getHighSpeedVideoSizes;
    java.lang.Object getHighSpeedVideoSizesFor;
    int getInputFormats;
    private /* synthetic */ java.lang.Object getOutputMinFrameDuration;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        kotlin.collections.ArrayDeque arrayDeque;
        java.util.Iterator<okio.Path> it;
        kotlin.sequences.SequenceScope sequenceScope = (kotlin.sequences.SequenceScope) this.getOutputMinFrameDuration;
        java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.getInputFormats;
        if (i == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            arrayDeque = new kotlin.collections.ArrayDeque();
            arrayDeque.addLast(this.getHighSpeedVideoSizes);
            it = this.getHighSpeedVideoFpsRangesFor.list(this.getHighSpeedVideoSizes).iterator();
        } else {
            if (i != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            it = (java.util.Iterator) this.getHighSpeedVideoFpsRanges;
            arrayDeque = (kotlin.collections.ArrayDeque) this.getHighResolutionOutputSizeshNQ4ISI;
            kotlin.ResultKt.throwOnFailure(obj);
        }
        java.util.Iterator<okio.Path> it2 = it;
        kotlin.collections.ArrayDeque arrayDeque2 = arrayDeque;
        while (it2.hasNext()) {
            okio.Path next = it2.next();
            this.getOutputMinFrameDuration = sequenceScope;
            this.getHighResolutionOutputSizeshNQ4ISI = arrayDeque2;
            this.getHighSpeedVideoFpsRanges = it2;
            this.getHighSpeedVideoSizesFor = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(next);
            this.getInputFormats = 1;
            if (okio.internal.FileSystem.collectRecursively(sequenceScope, this.getHighSpeedVideoFpsRangesFor, arrayDeque2, next, this.Camera2StreamConfigurationMap, false, this) == coroutine_suspended) {
                return coroutine_suspended;
            }
        }
        return kotlin.Unit.INSTANCE;
    }

    @Override // kotlin.jvm.functions.Function2
    public final /* synthetic */ java.lang.Object invoke(kotlin.sequences.SequenceScope<? super okio.Path> sequenceScope, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        return ((okio.internal.FileSystem$commonListRecursively$1) create(sequenceScope, continuation)).invokeSuspend(kotlin.Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final kotlin.coroutines.Continuation<kotlin.Unit> create(java.lang.Object obj, kotlin.coroutines.Continuation<?> continuation) {
        okio.internal.FileSystem$commonListRecursively$1 fileSystem$commonListRecursively$1 = new okio.internal.FileSystem$commonListRecursively$1(this.getHighSpeedVideoSizes, this.getHighSpeedVideoFpsRangesFor, this.Camera2StreamConfigurationMap, continuation);
        fileSystem$commonListRecursively$1.getOutputMinFrameDuration = obj;
        return fileSystem$commonListRecursively$1;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    FileSystem$commonListRecursively$1(okio.Path path, okio.FileSystem fileSystem, boolean z, kotlin.coroutines.Continuation<? super okio.internal.FileSystem$commonListRecursively$1> continuation) {
        super(2, continuation);
        this.getHighSpeedVideoSizes = path;
        this.getHighSpeedVideoFpsRangesFor = fileSystem;
        this.Camera2StreamConfigurationMap = z;
    }
}
