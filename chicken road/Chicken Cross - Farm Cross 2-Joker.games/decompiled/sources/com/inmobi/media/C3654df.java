package com.inmobi.media;

import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* renamed from: com.inmobi.media.df, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C3654df extends SuspendLambda implements Function2 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ C4135uf f7068a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C3654df(C4135uf c4135uf, Continuation continuation) {
        super(2, continuation);
        this.f7068a = c4135uf;
    }

    public static final Unit a(C4135uf c4135uf, short s) {
        Y9 l = c4135uf.l();
        if (l != null) {
            ((Z9) l).a("NativeRenderedState", "onAssetClickEvent " + ((int) s));
        }
        ((Sd) c4135uf.b.m.getValue()).a(s);
        return Unit.INSTANCE;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new C3654df(this.f7068a, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return new C3654df(this.f7068a, (Continuation) obj2).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        ResultKt.throwOnFailure(obj);
        C3969oi c3969oi = (C3969oi) this.f7068a.b.o.getValue();
        final C4135uf c4135uf = this.f7068a;
        C3912mi c3912mi = c4135uf.b.c;
        Function1 function1 = new Function1() { // from class: com.inmobi.media.df$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj2) {
                return C3654df.a(C4135uf.this, ((Short) obj2).shortValue());
            }
        };
        c3969oi.getClass();
        C3969oi.a(c3912mi, function1);
        return Unit.INSTANCE;
    }
}
