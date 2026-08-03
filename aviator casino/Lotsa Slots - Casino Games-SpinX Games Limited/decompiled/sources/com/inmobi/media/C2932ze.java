package com.inmobi.media;

/* renamed from: com.inmobi.media.ze, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C2932ze extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2 {

    /* renamed from: a, reason: collision with root package name */
    public int f5591a;
    public final /* synthetic */ com.inmobi.media.Be b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2932ze(com.inmobi.media.Be be, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.b = be;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new com.inmobi.media.C2932ze(this.b, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        return new com.inmobi.media.C2932ze(this.b, (kotlin.coroutines.Continuation) obj2).invokeSuspend(kotlin.Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.f5591a;
        if (i == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            com.inmobi.media.InterfaceC2772t9 l = this.b.l();
            if (l != null) {
                ((com.inmobi.media.C2799u9) l).a("NativeRenderedState", "Track Views Attached to Telemetry Started - waiting for window state change");
            }
            kotlinx.coroutines.flow.MutableStateFlow mutableStateFlow = ((com.inmobi.media.Po) this.b.b.l.getValue()).b;
            com.inmobi.media.C2907ye c2907ye = new com.inmobi.media.C2907ye(null);
            this.f5591a = 1;
            if (kotlinx.coroutines.flow.FlowKt.first(mutableStateFlow, c2907ye, this) == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.ResultKt.throwOnFailure(obj);
        }
        com.inmobi.media.Ce ce = this.b.b;
        ce.b.b = true;
        ce.f.b.e.a(com.inmobi.media.C2302bf.f5123a);
        com.inmobi.media.Be be = this.b;
        com.inmobi.media.AbstractC2379ed.a(be.b.c, be.l());
        com.inmobi.media.C2313c0 c2313c0 = this.b.f5559a.f5538a.d;
        c2313c0.getClass();
        c2313c0.e = android.os.SystemClock.elapsedRealtime();
        com.inmobi.media.Lc lc = (com.inmobi.media.Lc) this.b.b.g.f.getValue();
        com.inmobi.media.C2304bh publisherNativeViewData = this.b.b.c;
        lc.getClass();
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(publisherNativeViewData, "publisherNativeViewData");
        java.util.Map a2 = com.inmobi.media.AbstractC2938zk.a(lc.f4817a);
        android.view.ViewGroup parentView = publisherNativeViewData.f5125a.getParentView();
        int i2 = 0;
        for (kotlin.Pair pair : com.inmobi.media.AbstractC2379ed.a(publisherNativeViewData)) {
            android.view.View view = (android.view.View) pair.component1();
            short shortValue = ((java.lang.Number) pair.component2()).shortValue();
            if (view != null && view.getVisibility() == 0 && com.inmobi.media.Mn.a(view, parentView)) {
                i2 |= 1 << shortValue;
            }
        }
        a2.put("viewState", java.lang.Integer.valueOf(i2));
        com.inmobi.media.C2624nk c2624nk = com.inmobi.media.C2624nk.f5360a;
        com.inmobi.media.C2624nk.b("ViewStateOnParentAttached", a2, com.inmobi.media.EnumC2728rk.f5431a);
        return kotlin.Unit.INSTANCE;
    }
}
