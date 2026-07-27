package com.inmobi.media;

import com.inmobi.ads.AdMetaInfo;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;

/* renamed from: com.inmobi.media.oe, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C3965oe extends SuspendLambda implements Function2 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ C3993pe f7287a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C3965oe(C3993pe c3993pe, Continuation continuation) {
        super(2, continuation);
        this.f7287a = c3993pe;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new C3965oe(this.f7287a, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return new C3965oe(this.f7287a, (Continuation) obj2).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        ResultKt.throwOnFailure(obj);
        Y9 l = this.f7287a.l();
        if (l != null) {
            ((Z9) l).a("AUM-NativeLoadedState", "Initialize - notifying publisher of load success");
        }
        C3993pe c3993pe = this.f7287a;
        Hd hd = c3993pe.i;
        C3626cf c3626cf = c3993pe.f;
        H h = c3993pe.f7514a.b;
        hd.a(c3626cf, new AdMetaInfo(h.e, h.l));
        return Unit.INSTANCE;
    }
}
