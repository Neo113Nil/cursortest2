package com.inmobi.media;

import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;

/* renamed from: com.inmobi.media.v8, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C4155v8 extends SuspendLambda implements Function2 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ C4182w8 f7431a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C4155v8(C4182w8 c4182w8, Continuation continuation) {
        super(2, continuation);
        this.f7431a = c4182w8;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new C4155v8(this.f7431a, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return new C4155v8(this.f7431a, (Continuation) obj2).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        ResultKt.throwOnFailure(obj);
        if (this.f7431a.d.e()) {
            C4182w8 c4182w8 = this.f7431a;
            c4182w8.b.setVolume(1.0f);
            AbstractC4012q5.a(c4182w8.c, c4182w8.f7453a, new C3866l2(1.0f, false));
            c4182w8.e = false;
        } else {
            this.f7431a.a();
        }
        return Unit.INSTANCE;
    }
}
