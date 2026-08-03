package com.inmobi.media;

/* loaded from: classes5.dex */
public final class Am extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2 {

    /* renamed from: a, reason: collision with root package name */
    public int f4608a;
    public /* synthetic */ java.lang.Object b;
    public final /* synthetic */ com.inmobi.media.Fm c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Am(com.inmobi.media.Fm fm, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.c = fm;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        com.inmobi.media.Am am = new com.inmobi.media.Am(this.c, continuation);
        am.b = obj;
        return am;
    }

    @Override // kotlin.jvm.functions.Function2
    public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        com.inmobi.media.Am am = new com.inmobi.media.Am(this.c, (kotlin.coroutines.Continuation) obj2);
        am.b = (com.inmobi.media.AbstractC2493im) obj;
        return am.invokeSuspend(kotlin.Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        java.lang.Object mediaEvent;
        java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.f4608a;
        if (i == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            com.inmobi.media.AbstractC2493im abstractC2493im = (com.inmobi.media.AbstractC2493im) this.b;
            kotlinx.coroutines.flow.MutableSharedFlow mutableSharedFlow = this.c.d;
            this.b = abstractC2493im;
            this.f4608a = 1;
            if (mutableSharedFlow.emit(abstractC2493im, this) == coroutine_suspended) {
                return coroutine_suspended;
            }
            mediaEvent = abstractC2493im;
        } else {
            if (i != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            mediaEvent = (com.inmobi.media.AbstractC2493im) this.b;
            kotlin.ResultKt.throwOnFailure(obj);
        }
        com.inmobi.media.Hn hn = this.c.c.g;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(mediaEvent, "mediaEvent");
        if (mediaEvent instanceof com.inmobi.media.Sm) {
            java.util.Map a2 = com.inmobi.media.AbstractC2938zk.a(hn.f4751a);
            com.inmobi.media.C2624nk c2624nk = com.inmobi.media.C2624nk.f5360a;
            com.inmobi.media.C2624nk.b("VideoLoadStarted", a2, com.inmobi.media.EnumC2728rk.f5431a);
        } else if (mediaEvent instanceof com.inmobi.media.Vm) {
            java.util.Map a3 = com.inmobi.media.AbstractC2938zk.a(hn.f4751a);
            com.inmobi.media.C2624nk c2624nk2 = com.inmobi.media.C2624nk.f5360a;
            com.inmobi.media.C2624nk.b("VideoLoadSuccess", a3, com.inmobi.media.EnumC2728rk.f5431a);
        } else if (mediaEvent instanceof com.inmobi.media.Bn) {
            boolean[] zArr = hn.b;
            if (!zArr[0]) {
                zArr[0] = true;
                java.util.Map a4 = com.inmobi.media.AbstractC2938zk.a(hn.f4751a);
                com.inmobi.media.C2624nk c2624nk3 = com.inmobi.media.C2624nk.f5360a;
                com.inmobi.media.C2624nk.b("VideoStart", a4, com.inmobi.media.EnumC2728rk.f5431a);
            }
        } else if (mediaEvent instanceof com.inmobi.media.Om) {
            boolean[] zArr2 = hn.b;
            if (!zArr2[1]) {
                zArr2[1] = true;
                java.util.Map a5 = com.inmobi.media.AbstractC2938zk.a(hn.f4751a);
                com.inmobi.media.C2624nk c2624nk4 = com.inmobi.media.C2624nk.f5360a;
                com.inmobi.media.C2624nk.b("VideoFirstQuartile", a5, com.inmobi.media.EnumC2728rk.f5431a);
            }
        } else if (mediaEvent instanceof com.inmobi.media.C2941zn) {
            boolean[] zArr3 = hn.b;
            if (!zArr3[2]) {
                zArr3[2] = true;
                java.util.Map a6 = com.inmobi.media.AbstractC2938zk.a(hn.f4751a);
                com.inmobi.media.C2624nk c2624nk5 = com.inmobi.media.C2624nk.f5360a;
                com.inmobi.media.C2624nk.b("VideoSecondQuartile", a6, com.inmobi.media.EnumC2728rk.f5431a);
            }
        } else if (mediaEvent instanceof com.inmobi.media.In) {
            boolean[] zArr4 = hn.b;
            if (!zArr4[3]) {
                zArr4[3] = true;
                java.util.Map a7 = com.inmobi.media.AbstractC2938zk.a(hn.f4751a);
                com.inmobi.media.C2624nk c2624nk6 = com.inmobi.media.C2624nk.f5360a;
                com.inmobi.media.C2624nk.b("VideoThirdQuartile", a7, com.inmobi.media.EnumC2728rk.f5431a);
            }
        } else if (mediaEvent instanceof com.inmobi.media.C2442gm) {
            boolean[] zArr5 = hn.b;
            if (!zArr5[4]) {
                zArr5[4] = true;
                java.util.Map a8 = com.inmobi.media.AbstractC2938zk.a(hn.f4751a);
                com.inmobi.media.C2624nk c2624nk7 = com.inmobi.media.C2624nk.f5360a;
                com.inmobi.media.C2624nk.b("VideoComplete", a8, com.inmobi.media.EnumC2728rk.f5431a);
            }
        } else if (mediaEvent instanceof com.inmobi.media.C2468hm) {
            ((com.inmobi.media.C2468hm) mediaEvent).getClass();
            java.util.Map mutableMap = kotlin.collections.MapsKt.toMutableMap(com.inmobi.media.AbstractC2938zk.a(hn.f4751a));
            mutableMap.put("errorCode", (short) 66);
            com.inmobi.media.C2624nk c2624nk8 = com.inmobi.media.C2624nk.f5360a;
            com.inmobi.media.C2624nk.b("VideoLoadFailure", mutableMap, com.inmobi.media.EnumC2728rk.f5431a);
        }
        com.inmobi.media.C2363dm c2363dm = this.c.c.f;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(mediaEvent, "mediaEvent");
        if (mediaEvent instanceof com.inmobi.media.Vm) {
            c2363dm.b.d = com.inmobi.media.AbstractC2914yl.a(((com.inmobi.media.Vm) mediaEvent).f5020a);
            c2363dm.c.f.a(com.inmobi.media.C2302bf.f5123a);
        } else if (mediaEvent instanceof com.inmobi.media.C2468hm) {
            ((com.inmobi.media.C2468hm) mediaEvent).getClass();
            c2363dm.c.m.a(new com.inmobi.media.Wo(kotlin.collections.MapsKt.mapOf(kotlin.TuplesKt.to("[ERRORCODE]", java.lang.String.valueOf(com.ironsource.InterfaceC3141l1.a.b.e))), null, 2));
        } else if (mediaEvent instanceof com.inmobi.media.Bn) {
            java.lang.String str = ((com.inmobi.media.Bn) mediaEvent).b;
            if (c2363dm.f5165a.incrementAndGet() > 1) {
                java.util.Map mutableMapOf = kotlin.collections.MapsKt.mutableMapOf(kotlin.TuplesKt.to("trigger", str));
                com.inmobi.media.C2624nk c2624nk9 = com.inmobi.media.C2624nk.f5360a;
                com.inmobi.media.C2624nk.b("MultipleVideoReadyFired", mutableMapOf, com.inmobi.media.EnumC2728rk.f5431a);
            }
            com.inmobi.media.Gc gc = c2363dm.c.g;
            com.inmobi.media.C2302bf c2302bf = com.inmobi.media.C2302bf.f5123a;
            gc.a(c2302bf);
            c2363dm.c.h.a(c2302bf);
        } else if (mediaEvent instanceof com.inmobi.media.C2916yn) {
            c2363dm.c.l.a(com.inmobi.media.C2302bf.f5123a);
        } else if (mediaEvent instanceof com.inmobi.media.C2417fn) {
            c2363dm.c.k.a(com.inmobi.media.C2302bf.f5123a);
        } else if (mediaEvent instanceof com.inmobi.media.Om) {
            c2363dm.c.b.a(com.inmobi.media.C2302bf.f5123a);
        } else if (mediaEvent instanceof com.inmobi.media.C2941zn) {
            c2363dm.c.c.a(com.inmobi.media.C2302bf.f5123a);
        } else if (mediaEvent instanceof com.inmobi.media.In) {
            c2363dm.c.d.a(com.inmobi.media.C2302bf.f5123a);
        } else if (mediaEvent instanceof com.inmobi.media.C2442gm) {
            c2363dm.c.e.a(com.inmobi.media.C2302bf.f5123a);
        } else if (mediaEvent instanceof com.inmobi.media.C2653on) {
            c2363dm.b.e = ((com.inmobi.media.C2653on) mediaEvent).f5380a;
            c2363dm.c.n.a(com.inmobi.media.C2302bf.f5123a);
        } else if (mediaEvent instanceof com.inmobi.media.S1) {
            if (((com.inmobi.media.S1) mediaEvent).f4947a) {
                c2363dm.c.i.a(com.inmobi.media.C2302bf.f5123a);
            } else {
                c2363dm.c.j.a(com.inmobi.media.C2302bf.f5123a);
            }
        } else if (mediaEvent instanceof com.inmobi.media.C2265a4) {
            c2363dm.c.o.a(new com.inmobi.media.Wo(null, ((com.inmobi.media.C2265a4) mediaEvent).f5093a, 1));
        }
        return kotlin.Unit.INSTANCE;
    }
}
