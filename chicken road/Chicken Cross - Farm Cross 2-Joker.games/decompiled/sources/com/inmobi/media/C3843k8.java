package com.inmobi.media;

import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.flow.MutableSharedFlow;

/* renamed from: com.inmobi.media.k8, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C3843k8 extends SuspendLambda implements Function2 {

    /* renamed from: a, reason: collision with root package name */
    public int f7198a;
    public final /* synthetic */ C4043r8 b;
    public final /* synthetic */ AbstractC3691eo c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C3843k8(C4043r8 c4043r8, AbstractC3691eo abstractC3691eo, Continuation continuation) {
        super(2, continuation);
        this.b = c4043r8;
        this.c = abstractC3691eo;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new C3843k8(this.b, this.c, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return new C3843k8(this.b, this.c, (Continuation) obj2).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.f7198a;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            MutableSharedFlow mutableSharedFlow = this.b.k;
            AbstractC3691eo abstractC3691eo = this.c;
            this.f7198a = 1;
            if (mutableSharedFlow.emit(abstractC3691eo, this) == coroutine_suspended) {
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
