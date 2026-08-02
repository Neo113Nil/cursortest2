package androidx.compose.runtime.snapshots;

@kotlin.Metadata(d1 = {"\u0000\u0012\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\f\u0012\b\u0012\u00060\u0003j\u0002`\u00040\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlin/sequences/SequenceScope;", "", "Landroidx/compose/runtime/snapshots/SnapshotId;"}, k = 3, mv = {2, 0, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "androidx.compose.runtime.snapshots.SnapshotIdSet$iterator$1", f = "SnapshotIdSet.kt", i = {0, 0, 1, 1, 2, 2}, l = {com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_ROUTING_NUMBER_CONFIRMED_CIRCLE_VALUE, 256, 263}, m = "invokeSuspend", n = {"$this$sequence", "$this$forEach$iv", "$this$sequence", "index", "$this$sequence", "index"}, s = {"L$0", "L$1", "L$0", "I$0", "L$0", "I$0"}, v = 1)
/* loaded from: classes.dex */
final class SnapshotIdSet$iterator$1 extends kotlin.coroutines.jvm.internal.RestrictedSuspendLambda implements kotlin.jvm.functions.Function2<kotlin.sequences.SequenceScope<? super java.lang.Long>, kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> {
    java.lang.Object Camera2StreamConfigurationMap;
    int getHighResolutionOutputSizeshNQ4ISI;
    int getHighSpeedVideoFpsRanges;
    final /* synthetic */ androidx.compose.runtime.snapshots.SnapshotIdSet getHighSpeedVideoFpsRangesFor;
    int getHighSpeedVideoSizes;
    private /* synthetic */ java.lang.Object getOutputMinFrameDuration;

    /* JADX WARN: Code restructure failed: missing block: B:27:0x00af, code lost:
    
        if (r13.yield(kotlin.coroutines.jvm.internal.Boxing.boxLong(r18.getHighSpeedVideoFpsRangesFor.getHighSpeedVideoFpsRangesFor + r2), r18) != r1) goto L28;
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x0073, code lost:
    
        if (r15.yield(r9, r18) != r1) goto L18;
     */
    /* JADX WARN: Removed duplicated region for block: B:10:0x00c4  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0086  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x00b5  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x00c0  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x005f  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0077  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x0082  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:11:0x00d1 -> B:8:0x00f6). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:16:0x00f4 -> B:7:0x00f5). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:25:0x0092 -> B:22:0x00b1). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:27:0x00af -> B:22:0x00b1). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:36:0x0073 -> B:33:0x0075). Please report as a decompilation issue!!! */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        kotlin.sequences.SequenceScope sequenceScope;
        kotlin.sequences.SequenceScope sequenceScope2;
        int length;
        long[] jArr;
        int i;
        kotlin.sequences.SequenceScope sequenceScope3;
        int i2;
        kotlin.sequences.SequenceScope sequenceScope4;
        int i3;
        java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i4 = this.getHighResolutionOutputSizeshNQ4ISI;
        long j = 1;
        long j2 = 0;
        if (i4 == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            sequenceScope = (kotlin.sequences.SequenceScope) this.getOutputMinFrameDuration;
            long[] jArr2 = this.getHighSpeedVideoFpsRangesFor.getHighSpeedVideoFpsRanges;
            if (jArr2 != null) {
                sequenceScope2 = sequenceScope;
                length = jArr2.length;
                jArr = jArr2;
                i = 0;
                if (i >= length) {
                }
            }
            if (this.getHighSpeedVideoFpsRangesFor.getHighResolutionOutputSizeshNQ4ISI != 0) {
            }
            if (this.getHighSpeedVideoFpsRangesFor.Camera2StreamConfigurationMap != 0) {
            }
            return kotlin.Unit.INSTANCE;
        }
        if (i4 == 1) {
            length = this.getHighSpeedVideoFpsRanges;
            i = this.getHighSpeedVideoSizes;
            jArr = (long[]) this.Camera2StreamConfigurationMap;
            sequenceScope2 = (kotlin.sequences.SequenceScope) this.getOutputMinFrameDuration;
            kotlin.ResultKt.throwOnFailure(obj);
            i++;
            if (i >= length) {
                java.lang.Long boxLong = kotlin.coroutines.jvm.internal.Boxing.boxLong(jArr[i]);
                this.getOutputMinFrameDuration = sequenceScope2;
                this.Camera2StreamConfigurationMap = jArr;
                this.getHighSpeedVideoSizes = i;
                this.getHighSpeedVideoFpsRanges = length;
                this.getHighResolutionOutputSizeshNQ4ISI = 1;
            } else {
                sequenceScope = sequenceScope2;
                if (this.getHighSpeedVideoFpsRangesFor.getHighResolutionOutputSizeshNQ4ISI != 0) {
                    sequenceScope3 = sequenceScope;
                    i2 = 0;
                    if (i2 >= 64) {
                    }
                }
                if (this.getHighSpeedVideoFpsRangesFor.Camera2StreamConfigurationMap != 0) {
                }
                return kotlin.Unit.INSTANCE;
            }
        } else {
            if (i4 != 2) {
                if (i4 != 3) {
                    throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                int i5 = this.getHighSpeedVideoSizes;
                sequenceScope4 = (kotlin.sequences.SequenceScope) this.getOutputMinFrameDuration;
                kotlin.ResultKt.throwOnFailure(obj);
                i3 = i5;
                i3++;
                j2 = 0;
                if (i3 < 64) {
                    if ((this.getHighSpeedVideoFpsRangesFor.Camera2StreamConfigurationMap & (1 << i3)) != j2) {
                        this.getOutputMinFrameDuration = sequenceScope4;
                        this.Camera2StreamConfigurationMap = null;
                        this.getHighSpeedVideoSizes = i3;
                        this.getHighResolutionOutputSizeshNQ4ISI = 3;
                        if (sequenceScope4.yield(kotlin.coroutines.jvm.internal.Boxing.boxLong(this.getHighSpeedVideoFpsRangesFor.getHighSpeedVideoFpsRangesFor + i3 + 64), this) != coroutine_suspended) {
                            i5 = i3;
                            i3 = i5;
                        }
                        return coroutine_suspended;
                    }
                    i3++;
                    j2 = 0;
                    if (i3 < 64) {
                    }
                }
                return kotlin.Unit.INSTANCE;
            }
            i2 = this.getHighSpeedVideoSizes;
            sequenceScope3 = (kotlin.sequences.SequenceScope) this.getOutputMinFrameDuration;
            kotlin.ResultKt.throwOnFailure(obj);
            i2++;
            j = 1;
            if (i2 >= 64) {
                sequenceScope = sequenceScope3;
                if (this.getHighSpeedVideoFpsRangesFor.Camera2StreamConfigurationMap != 0) {
                    sequenceScope4 = sequenceScope;
                    i3 = 0;
                    if (i3 < 64) {
                    }
                }
                return kotlin.Unit.INSTANCE;
            }
            if ((this.getHighSpeedVideoFpsRangesFor.getHighResolutionOutputSizeshNQ4ISI & (j << i2)) != 0) {
                this.getOutputMinFrameDuration = sequenceScope3;
                this.Camera2StreamConfigurationMap = null;
                this.getHighSpeedVideoSizes = i2;
                this.getHighResolutionOutputSizeshNQ4ISI = 2;
            }
            i2++;
            j = 1;
            if (i2 >= 64) {
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Override // kotlin.jvm.functions.Function2
    /* renamed from: getHighResolutionOutputSizeshNQ4ISI, reason: merged with bridge method [inline-methods] */
    public java.lang.Object invoke(kotlin.sequences.SequenceScope<? super java.lang.Long> sequenceScope, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        return ((androidx.compose.runtime.snapshots.SnapshotIdSet$iterator$1) create(sequenceScope, continuation)).invokeSuspend(kotlin.Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final kotlin.coroutines.Continuation<kotlin.Unit> create(java.lang.Object obj, kotlin.coroutines.Continuation<?> continuation) {
        androidx.compose.runtime.snapshots.SnapshotIdSet$iterator$1 snapshotIdSet$iterator$1 = new androidx.compose.runtime.snapshots.SnapshotIdSet$iterator$1(this.getHighSpeedVideoFpsRangesFor, continuation);
        snapshotIdSet$iterator$1.getOutputMinFrameDuration = obj;
        return snapshotIdSet$iterator$1;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    SnapshotIdSet$iterator$1(androidx.compose.runtime.snapshots.SnapshotIdSet snapshotIdSet, kotlin.coroutines.Continuation<? super androidx.compose.runtime.snapshots.SnapshotIdSet$iterator$1> continuation) {
        super(2, continuation);
        this.getHighSpeedVideoFpsRangesFor = snapshotIdSet;
    }
}
