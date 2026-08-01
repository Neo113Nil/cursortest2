package com.inmobi.media;

import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CompletableDeferred;

/* renamed from: com.inmobi.media.mb, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C3905mb extends SuspendLambda implements Function2 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ ViewTreeObserverOnGlobalLayoutListenerC3933nb f7245a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C3905mb(ViewTreeObserverOnGlobalLayoutListenerC3933nb viewTreeObserverOnGlobalLayoutListenerC3933nb, Continuation continuation) {
        super(2, continuation);
        this.f7245a = viewTreeObserverOnGlobalLayoutListenerC3933nb;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new C3905mb(this.f7245a, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return new C3905mb(this.f7245a, (Continuation) obj2).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        ResultKt.throwOnFailure(obj);
        CompletableDeferred completableDeferred = this.f7245a.e;
        Unit unit = Unit.INSTANCE;
        completableDeferred.complete(unit);
        return unit;
    }
}
