package com.inmobi.media;

import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;

/* renamed from: com.inmobi.media.mh, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C3911mh extends SuspendLambda implements Function2 {

    /* renamed from: a, reason: collision with root package name */
    public int f7249a;
    public final /* synthetic */ C3939nh b;
    public final /* synthetic */ Vg c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C3911mh(C3939nh c3939nh, Vg vg, Continuation continuation) {
        super(2, continuation);
        this.b = c3939nh;
        this.c = vg;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new C3911mh(this.b, this.c, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return new C3911mh(this.b, this.c, (Continuation) obj2).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.f7249a;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            C3939nh c3939nh = this.b;
            String str = this.c.e;
            Oj oj = c3939nh.b;
            if (oj != null) {
                oj.b(str);
            }
            C3939nh c3939nh2 = this.b;
            Vg vg = this.c;
            this.f7249a = 1;
            c3939nh2.getClass();
            if (C3939nh.a(vg, this) == coroutine_suspended) {
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
