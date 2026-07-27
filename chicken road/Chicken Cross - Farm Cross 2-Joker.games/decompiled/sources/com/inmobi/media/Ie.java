package com.inmobi.media;

import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.channels.ProducerScope;
import kotlinx.coroutines.flow.MutableSharedFlow;

/* loaded from: classes6.dex */
public final class Ie extends SuspendLambda implements Function2 {

    /* renamed from: a, reason: collision with root package name */
    public int f6627a;
    public /* synthetic */ Object b;
    public final /* synthetic */ Je c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Ie(Je je, Continuation continuation) {
        super(2, continuation);
        this.c = je;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        Ie ie = new Ie(this.c, continuation);
        ie.b = obj;
        return ie;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        Ie ie = new Ie(this.c, (Continuation) obj2);
        ie.b = (ProducerScope) obj;
        return ie.invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.f6627a;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            ProducerScope producerScope = (ProducerScope) this.b;
            Je je = this.c;
            MutableSharedFlow mutableSharedFlow = je.f6650a.f7035a;
            He he = new He(je, producerScope);
            this.f6627a = 1;
            if (mutableSharedFlow.collect(he, this) == coroutine_suspended) {
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
