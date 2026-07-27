package com.inmobi.media;

import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.flow.MutableSharedFlow;

/* renamed from: com.inmobi.media.p5, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C3984p5 extends SuspendLambda implements Function2 {

    /* renamed from: a, reason: collision with root package name */
    public int f7299a;
    public final /* synthetic */ MutableSharedFlow b;
    public final /* synthetic */ AbstractC3595bd c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C3984p5(MutableSharedFlow mutableSharedFlow, AbstractC3595bd abstractC3595bd, Continuation continuation) {
        super(2, continuation);
        this.b = mutableSharedFlow;
        this.c = abstractC3595bd;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new C3984p5(this.b, this.c, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return new C3984p5(this.b, this.c, (Continuation) obj2).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.f7299a;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            MutableSharedFlow mutableSharedFlow = this.b;
            AbstractC3595bd abstractC3595bd = this.c;
            this.f7299a = 1;
            if (mutableSharedFlow.emit(abstractC3595bd, this) == coroutine_suspended) {
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
