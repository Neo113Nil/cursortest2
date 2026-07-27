package com.inmobi.media;

import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.MutableSharedFlow;

/* renamed from: com.inmobi.media.gf, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C3738gf extends SuspendLambda implements Function2 {

    /* renamed from: a, reason: collision with root package name */
    public int f7122a;
    public /* synthetic */ Object b;
    public final /* synthetic */ MutableSharedFlow c;
    public final /* synthetic */ C4135uf d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C3738gf(MutableSharedFlow mutableSharedFlow, Continuation continuation, C4135uf c4135uf) {
        super(2, continuation);
        this.c = mutableSharedFlow;
        this.d = c4135uf;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        C3738gf c3738gf = new C3738gf(this.c, continuation, this.d);
        c3738gf.b = obj;
        return c3738gf;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((C3738gf) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.f7122a;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            CoroutineScope coroutineScope = (CoroutineScope) this.b;
            MutableSharedFlow mutableSharedFlow = this.c;
            C3710ff c3710ff = new C3710ff(coroutineScope, this.d);
            this.f7122a = 1;
            if (mutableSharedFlow.collect(c3710ff, this) == coroutine_suspended) {
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
