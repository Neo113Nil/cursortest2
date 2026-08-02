package okio.internal;

import androidx.media3.container.MdtaMetadataEntry;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.ArrayDeque;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.RestrictedSuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.sequences.SequenceScope;
import okio.AbstractC1197l;
import okio.C;

@DebugMetadata(c = "okio.internal.-FileSystem$commonDeleteRecursively$sequence$1", f = "FileSystem.kt", i = {}, l = {MdtaMetadataEntry.TYPE_INDICATOR_8_BIT_UNSIGNED_INT}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes5.dex */
public final class e extends RestrictedSuspendLambda implements Function2<SequenceScope<? super C>, Continuation<? super Unit>, Object> {
    public int a;
    public /* synthetic */ Object b;
    public final /* synthetic */ AbstractC1197l c;
    public final /* synthetic */ C d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(AbstractC1197l abstractC1197l, C c, Continuation<? super e> continuation) {
        super(2, continuation);
        this.c = abstractC1197l;
        this.d = c;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        e eVar = new e(this.c, this.d, continuation);
        eVar.b = obj;
        return eVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(SequenceScope<? super C> sequenceScope, Continuation<? super Unit> continuation) {
        return ((e) create(sequenceScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.a;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            SequenceScope sequenceScope = (SequenceScope) this.b;
            ArrayDeque arrayDeque = new ArrayDeque();
            this.a = 1;
            if (g.a(sequenceScope, this.c, arrayDeque, this.d, false, true, this) == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
        }
        return Unit.INSTANCE;
    }
}
