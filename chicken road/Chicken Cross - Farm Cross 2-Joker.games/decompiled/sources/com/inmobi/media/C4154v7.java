package com.inmobi.media;

import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.CoroutineScopeKt;
import kotlinx.coroutines.DelayKt;

/* renamed from: com.inmobi.media.v7, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C4154v7 extends SuspendLambda implements Function2 {

    /* renamed from: a, reason: collision with root package name */
    public int f7430a;
    public /* synthetic */ Object b;
    public final /* synthetic */ C4181w7 c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C4154v7(C4181w7 c4181w7, Continuation continuation) {
        super(2, continuation);
        this.c = c4181w7;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        C4154v7 c4154v7 = new C4154v7(this.c, continuation);
        c4154v7.b = obj;
        return c4154v7;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        C4154v7 c4154v7 = new C4154v7(this.c, (Continuation) obj2);
        c4154v7.b = (CoroutineScope) obj;
        return c4154v7.invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineScope coroutineScope;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.f7430a;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            coroutineScope = (CoroutineScope) this.b;
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            coroutineScope = (CoroutineScope) this.b;
            ResultKt.throwOnFailure(obj);
        }
        while (CoroutineScopeKt.isActive(coroutineScope)) {
            C4181w7 c4181w7 = this.c;
            c4181w7.d.setValue(Boxing.boxBoolean(c4181w7.b.getWindowVisibility() == 0));
            long j = this.c.c;
            this.b = coroutineScope;
            this.f7430a = 1;
            if (DelayKt.delay(j, this) == coroutine_suspended) {
                return coroutine_suspended;
            }
        }
        return Unit.INSTANCE;
    }
}
