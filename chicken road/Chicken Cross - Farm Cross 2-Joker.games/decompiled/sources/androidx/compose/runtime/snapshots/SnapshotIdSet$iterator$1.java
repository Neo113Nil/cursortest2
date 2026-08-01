package androidx.compose.runtime.snapshots;

import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.RestrictedSuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.sequences.SequenceScope;

/* compiled from: SnapshotIdSet.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\u0010\u0000\u001a\u00020\u0001*\b\u0012\u0004\u0012\u00020\u00030\u0002H\u008a@"}, d2 = {"<anonymous>", "", "Lkotlin/sequences/SequenceScope;", ""}, k = 3, mv = {1, 6, 0}, xi = 48)
@DebugMetadata(c = "androidx.compose.runtime.snapshots.SnapshotIdSet$iterator$1", f = "SnapshotIdSet.kt", i = {0, 0, 1, 1, 2, 2}, l = {295, 300, 307}, m = "invokeSuspend", n = {"$this$sequence", "belowBound", "$this$sequence", "index", "$this$sequence", "index"}, s = {"L$0", "L$1", "L$0", "I$0", "L$0", "I$0"})
/* loaded from: classes.dex */
final class SnapshotIdSet$iterator$1 extends RestrictedSuspendLambda implements Function2<SequenceScope<? super Integer>, Continuation<? super Unit>, Object> {
    int I$0;
    int I$1;
    private /* synthetic */ Object L$0;
    Object L$1;
    int label;
    final /* synthetic */ SnapshotIdSet this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    SnapshotIdSet$iterator$1(SnapshotIdSet snapshotIdSet, Continuation<? super SnapshotIdSet$iterator$1> continuation) {
        super(2, continuation);
        this.this$0 = snapshotIdSet;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        SnapshotIdSet$iterator$1 snapshotIdSet$iterator$1 = new SnapshotIdSet$iterator$1(this.this$0, continuation);
        snapshotIdSet$iterator$1.L$0 = obj;
        return snapshotIdSet$iterator$1;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(SequenceScope<? super Integer> sequenceScope, Continuation<? super Unit> continuation) {
        return ((SnapshotIdSet$iterator$1) create(sequenceScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x00c7  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x008b  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x00b8  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x00c3  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x005f  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x007c  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x0087  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:16:0x00f5 -> B:7:0x00f6). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:17:0x00f8 -> B:8:0x00f9). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:26:0x0097 -> B:23:0x00b6). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:28:0x00b3 -> B:23:0x00b6). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:38:0x0076 -> B:35:0x0079). Please report as a decompilation issue!!! */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        SequenceScope sequenceScope;
        SequenceScope sequenceScope2;
        int length;
        int[] iArr;
        int i;
        SequenceScope sequenceScope3;
        int i2;
        SequenceScope sequenceScope4;
        int i3;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i4 = this.label;
        if (i4 == 0) {
            ResultKt.throwOnFailure(obj);
            sequenceScope = (SequenceScope) this.L$0;
            int[] iArr2 = this.this$0.belowBound;
            if (iArr2 != null) {
                sequenceScope2 = sequenceScope;
                length = iArr2.length;
                iArr = iArr2;
                i = 0;
                if (i < length) {
                }
            }
            if (this.this$0.lowerSet != 0) {
            }
            if (this.this$0.upperSet != 0) {
            }
            return Unit.INSTANCE;
        }
        if (i4 == 1) {
            length = this.I$1;
            i = this.I$0;
            iArr = (int[]) this.L$1;
            sequenceScope2 = (SequenceScope) this.L$0;
            ResultKt.throwOnFailure(obj);
            i++;
            if (i < length) {
                this.L$0 = sequenceScope2;
                this.L$1 = iArr;
                this.I$0 = i;
                this.I$1 = length;
                this.label = 1;
                if (sequenceScope2.yield(Boxing.boxInt(iArr[i]), this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
                i++;
                if (i < length) {
                    sequenceScope = sequenceScope2;
                    if (this.this$0.lowerSet != 0) {
                        sequenceScope3 = sequenceScope;
                        i2 = 0;
                        if (i2 >= 64) {
                        }
                    }
                    if (this.this$0.upperSet != 0) {
                    }
                    return Unit.INSTANCE;
                }
            }
        } else {
            if (i4 != 2) {
                if (i4 == 3) {
                    int i5 = this.I$0;
                    sequenceScope4 = (SequenceScope) this.L$0;
                    ResultKt.throwOnFailure(obj);
                    i3 = i5;
                    i3++;
                    if (i3 < 64) {
                        if ((this.this$0.upperSet & (1 << i3)) != 0) {
                            this.L$0 = sequenceScope4;
                            this.L$1 = null;
                            this.I$0 = i3;
                            this.label = 3;
                            if (sequenceScope4.yield(Boxing.boxInt(i3 + 64 + this.this$0.lowerBound), this) == coroutine_suspended) {
                                return coroutine_suspended;
                            }
                            i5 = i3;
                            i3 = i5;
                            i3++;
                            if (i3 < 64) {
                            }
                        } else {
                            i3++;
                            if (i3 < 64) {
                            }
                        }
                    }
                    return Unit.INSTANCE;
                }
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            i2 = this.I$0;
            sequenceScope3 = (SequenceScope) this.L$0;
            ResultKt.throwOnFailure(obj);
            i2++;
            if (i2 >= 64) {
                sequenceScope = sequenceScope3;
                if (this.this$0.upperSet != 0) {
                    sequenceScope4 = sequenceScope;
                    i3 = 0;
                    if (i3 < 64) {
                    }
                }
                return Unit.INSTANCE;
            }
            if ((this.this$0.lowerSet & (1 << i2)) != 0) {
                this.L$0 = sequenceScope3;
                this.L$1 = null;
                this.I$0 = i2;
                this.label = 2;
                if (sequenceScope3.yield(Boxing.boxInt(this.this$0.lowerBound + i2), this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            }
            i2++;
            if (i2 >= 64) {
            }
        }
    }
}
