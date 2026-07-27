package com.inmobi.media;

import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;

/* renamed from: com.inmobi.media.cg, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C3627cg extends SuspendLambda implements Function2 {

    /* renamed from: a, reason: collision with root package name */
    public int f7048a;
    public final /* synthetic */ long b;
    public final /* synthetic */ C3682eg c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C3627cg(long j, C3682eg c3682eg, Continuation continuation) {
        super(2, continuation);
        this.b = j;
        this.c = c3682eg;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new C3627cg(this.b, this.c, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return new C3627cg(this.b, this.c, (Continuation) obj2).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Code restructure failed: missing block: B:13:0x0034, code lost:
    
        if (r7.d(r6) == r0) goto L15;
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x0036, code lost:
    
        return r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x0029, code lost:
    
        if (kotlinx.coroutines.DelayKt.delay(r4, r6) == r0) goto L15;
     */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.f7048a;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            long j = this.b;
            this.f7048a = 1;
        } else {
            if (i != 1) {
                if (i != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
                return Unit.INSTANCE;
            }
            ResultKt.throwOnFailure(obj);
        }
        C3682eg c3682eg = this.c;
        this.f7048a = 2;
    }
}
