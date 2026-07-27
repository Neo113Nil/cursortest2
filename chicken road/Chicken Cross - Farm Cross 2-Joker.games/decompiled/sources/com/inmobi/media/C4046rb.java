package com.inmobi.media;

import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Ref;
import kotlinx.coroutines.CompletableDeferred;
import kotlinx.coroutines.CoroutineScope;

/* renamed from: com.inmobi.media.rb, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C4046rb extends SuspendLambda implements Function2 {

    /* renamed from: a, reason: collision with root package name */
    public int f7348a;
    public final /* synthetic */ ViewTreeObserverOnGlobalLayoutListenerC3933nb b;
    public final /* synthetic */ Ref.IntRef c;
    public final /* synthetic */ Ref.IntRef d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C4046rb(ViewTreeObserverOnGlobalLayoutListenerC3933nb viewTreeObserverOnGlobalLayoutListenerC3933nb, Ref.IntRef intRef, Ref.IntRef intRef2, Continuation continuation) {
        super(2, continuation);
        this.b = viewTreeObserverOnGlobalLayoutListenerC3933nb;
        this.c = intRef;
        this.d = intRef2;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new C4046rb(this.b, this.c, this.d, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((C4046rb) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.f7348a;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            CompletableDeferred completableDeferred = this.b.e;
            this.f7348a = 1;
            if (completableDeferred.await(this) == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
        }
        Ref.IntRef intRef = this.c;
        ViewTreeObserverOnGlobalLayoutListenerC3933nb viewTreeObserverOnGlobalLayoutListenerC3933nb = this.b;
        intRef.element = viewTreeObserverOnGlobalLayoutListenerC3933nb.c;
        this.d.element = viewTreeObserverOnGlobalLayoutListenerC3933nb.d;
        return Unit.INSTANCE;
    }
}
