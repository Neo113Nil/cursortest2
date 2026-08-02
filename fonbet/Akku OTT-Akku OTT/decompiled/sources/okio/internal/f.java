package okio.internal;

import java.util.Iterator;
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

@DebugMetadata(c = "okio.internal.-FileSystem$commonListRecursively$1", f = "FileSystem.kt", i = {0, 0}, l = {96}, m = "invokeSuspend", n = {"$this$sequence", "stack"}, s = {"L$0", "L$1"})
/* loaded from: classes5.dex */
public final class f extends RestrictedSuspendLambda implements Function2<SequenceScope<? super C>, Continuation<? super Unit>, Object> {
    public ArrayDeque a;
    public Iterator b;
    public int c;
    public /* synthetic */ Object d;
    public final /* synthetic */ C e;
    public final /* synthetic */ AbstractC1197l f;
    public final /* synthetic */ boolean i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(C c, AbstractC1197l abstractC1197l, boolean z, Continuation<? super f> continuation) {
        super(2, continuation);
        this.e = c;
        this.f = abstractC1197l;
        this.i = z;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        f fVar = new f(this.e, this.f, this.i, continuation);
        fVar.d = obj;
        return fVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(SequenceScope<? super C> sequenceScope, Continuation<? super Unit> continuation) {
        return ((f) create(sequenceScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        ArrayDeque arrayDeque;
        Iterator<C> it;
        SequenceScope sequenceScope;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.c;
        AbstractC1197l abstractC1197l = this.f;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            SequenceScope sequenceScope2 = (SequenceScope) this.d;
            ArrayDeque arrayDeque2 = new ArrayDeque();
            C c = this.e;
            arrayDeque2.addLast(c);
            arrayDeque = arrayDeque2;
            it = abstractC1197l.list(c).iterator();
            sequenceScope = sequenceScope2;
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            it = this.b;
            ArrayDeque arrayDeque3 = this.a;
            SequenceScope sequenceScope3 = (SequenceScope) this.d;
            ResultKt.throwOnFailure(obj);
            arrayDeque = arrayDeque3;
            sequenceScope = sequenceScope3;
        }
        while (it.hasNext()) {
            C next = it.next();
            this.d = sequenceScope;
            this.a = arrayDeque;
            this.b = it;
            this.c = 1;
            if (g.a(sequenceScope, abstractC1197l, arrayDeque, next, this.i, false, this) == coroutine_suspended) {
                return coroutine_suspended;
            }
        }
        return Unit.INSTANCE;
    }
}
