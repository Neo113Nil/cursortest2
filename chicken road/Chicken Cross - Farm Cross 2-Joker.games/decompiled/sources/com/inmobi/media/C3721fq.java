package com.inmobi.media;

import java.lang.ref.WeakReference;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.CoroutineScopeKt;
import kotlinx.coroutines.DelayKt;

/* renamed from: com.inmobi.media.fq, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C3721fq extends SuspendLambda implements Function2 {

    /* renamed from: a, reason: collision with root package name */
    public int f7112a;
    public /* synthetic */ Object b;
    public final /* synthetic */ WeakReference c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C3721fq(WeakReference weakReference, Continuation continuation) {
        super(2, continuation);
        this.c = weakReference;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        C3721fq c3721fq = new C3721fq(this.c, continuation);
        c3721fq.b = obj;
        return c3721fq;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        C3721fq c3721fq = new C3721fq(this.c, (Continuation) obj2);
        c3721fq.b = (CoroutineScope) obj;
        return c3721fq.invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineScope coroutineScope;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.f7112a;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            CoroutineScope coroutineScope2 = (CoroutineScope) this.b;
            AbstractC3749gq abstractC3749gq = (AbstractC3749gq) this.c.get();
            if (abstractC3749gq == null) {
                return Unit.INSTANCE;
            }
            long c = abstractC3749gq.c();
            this.b = coroutineScope2;
            this.f7112a = 1;
            if (DelayKt.delay(c, this) == coroutine_suspended) {
                return coroutine_suspended;
            }
            coroutineScope = coroutineScope2;
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            coroutineScope = (CoroutineScope) this.b;
            ResultKt.throwOnFailure(obj);
        }
        if (!CoroutineScopeKt.isActive(coroutineScope)) {
            return Unit.INSTANCE;
        }
        AbstractC3749gq abstractC3749gq2 = (AbstractC3749gq) this.c.get();
        if (abstractC3749gq2 == null) {
            return Unit.INSTANCE;
        }
        if (abstractC3749gq2.g.get()) {
            return Unit.INSTANCE;
        }
        abstractC3749gq2.b.removeCallbacks((RunnableC3637cq) abstractC3749gq2.i.getValue());
        abstractC3749gq2.b.post((RunnableC3637cq) abstractC3749gq2.i.getValue());
        return Unit.INSTANCE;
    }
}
