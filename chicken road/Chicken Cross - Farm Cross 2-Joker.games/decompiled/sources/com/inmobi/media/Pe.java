package com.inmobi.media;

import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;

/* loaded from: classes6.dex */
public final class Pe extends SuspendLambda implements Function2 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Te f6783a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Pe(Te te, Continuation continuation) {
        super(2, continuation);
        this.f6783a = te;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new Pe(this.f6783a, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return new Pe(this.f6783a, (Continuation) obj2).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        ResultKt.throwOnFailure(obj);
        try {
            this.f6783a.j.release();
        } catch (Exception e) {
            Z9 z9 = this.f6783a.c;
            if (z9 != null) {
                z9.a("NativeMediaPlayer", "Failed to release MediaPlayer", e);
            }
        }
        return Unit.INSTANCE;
    }
}
