package okio.internal;

@kotlin.Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\b\u0012\u0004\u0012\u00020\u00030\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlin/sequences/SequenceScope;", "Lokio/Path;"}, k = 3, mv = {2, 2, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "okio.internal.-FileSystem$commonDeleteRecursively$sequence$1", f = "FileSystem.kt", i = {0}, l = {75}, m = "invokeSuspend", n = {"$this$sequence"}, s = {"L$0"}, v = 1)
/* renamed from: okio.internal.-FileSystem$commonDeleteRecursively$sequence$1, reason: invalid class name */
/* loaded from: classes5.dex */
final class FileSystem$commonDeleteRecursively$sequence$1 extends kotlin.coroutines.jvm.internal.RestrictedSuspendLambda implements kotlin.jvm.functions.Function2<kotlin.sequences.SequenceScope<? super okio.Path>, kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> {
    int getHighResolutionOutputSizeshNQ4ISI;
    final /* synthetic */ okio.Path getHighSpeedVideoFpsRanges;
    private /* synthetic */ java.lang.Object getHighSpeedVideoFpsRangesFor;
    final /* synthetic */ okio.FileSystem getHighSpeedVideoSizes;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        kotlin.sequences.SequenceScope sequenceScope = (kotlin.sequences.SequenceScope) this.getHighSpeedVideoFpsRangesFor;
        java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.getHighResolutionOutputSizeshNQ4ISI;
        if (i == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            this.getHighSpeedVideoFpsRangesFor = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(sequenceScope);
            this.getHighResolutionOutputSizeshNQ4ISI = 1;
            if (okio.internal.FileSystem.collectRecursively(sequenceScope, this.getHighSpeedVideoSizes, new kotlin.collections.ArrayDeque(), this.getHighSpeedVideoFpsRanges, false, true, this) == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.ResultKt.throwOnFailure(obj);
        }
        return kotlin.Unit.INSTANCE;
    }

    @Override // kotlin.jvm.functions.Function2
    public final /* synthetic */ java.lang.Object invoke(kotlin.sequences.SequenceScope<? super okio.Path> sequenceScope, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        return ((okio.internal.FileSystem$commonDeleteRecursively$sequence$1) create(sequenceScope, continuation)).invokeSuspend(kotlin.Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final kotlin.coroutines.Continuation<kotlin.Unit> create(java.lang.Object obj, kotlin.coroutines.Continuation<?> continuation) {
        okio.internal.FileSystem$commonDeleteRecursively$sequence$1 fileSystem$commonDeleteRecursively$sequence$1 = new okio.internal.FileSystem$commonDeleteRecursively$sequence$1(this.getHighSpeedVideoSizes, this.getHighSpeedVideoFpsRanges, continuation);
        fileSystem$commonDeleteRecursively$sequence$1.getHighSpeedVideoFpsRangesFor = obj;
        return fileSystem$commonDeleteRecursively$sequence$1;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    FileSystem$commonDeleteRecursively$sequence$1(okio.FileSystem fileSystem, okio.Path path, kotlin.coroutines.Continuation<? super okio.internal.FileSystem$commonDeleteRecursively$sequence$1> continuation) {
        super(2, continuation);
        this.getHighSpeedVideoSizes = fileSystem;
        this.getHighSpeedVideoFpsRanges = path;
    }
}
