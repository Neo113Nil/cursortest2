package com.inmobi.media;

/* loaded from: classes5.dex */
public final class Dm extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.inmobi.media.Fm f4668a;
    public final /* synthetic */ com.inmobi.media.O3 b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Dm(com.inmobi.media.Fm fm, com.inmobi.media.O3 o3, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f4668a = fm;
        this.b = o3;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new com.inmobi.media.Dm(this.f4668a, this.b, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        return new com.inmobi.media.Dm(this.f4668a, this.b, (kotlin.coroutines.Continuation) obj2).invokeSuspend(kotlin.Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        kotlin.ResultKt.throwOnFailure(obj);
        com.inmobi.media.C2799u9 c2799u9 = this.f4668a.e;
        if (c2799u9 != null) {
            c2799u9.a("VideoExperienceManager", "Companion Ad Rendered");
        }
        android.view.ViewGroup viewGroup = this.f4668a.j;
        android.view.ViewParent parent = viewGroup != null ? viewGroup.getParent() : null;
        android.widget.FrameLayout parentView = parent instanceof android.widget.FrameLayout ? (android.widget.FrameLayout) parent : null;
        if (parentView != null) {
            parentView.removeAllViews();
        }
        com.inmobi.media.Fm fm = this.f4668a;
        fm.j = null;
        com.inmobi.media.InterfaceC2588mc interfaceC2588mc = fm.h;
        if (interfaceC2588mc == null) {
            kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("mediaPlayer");
            interfaceC2588mc = null;
        }
        com.inmobi.media.C2275ae c2275ae = (com.inmobi.media.C2275ae) interfaceC2588mc;
        com.inmobi.media.C2799u9 c2799u92 = c2275ae.c;
        if (c2799u92 != null) {
            c2799u92.a("NativeMediaPlayer", "destroy called");
        }
        c2275ae.e = com.inmobi.media.Bg.h;
        com.inmobi.media.T4.a(c2275ae.d);
        c2275ae.k.b();
        com.inmobi.media.C2486ie c2486ie = c2275ae.i;
        c2486ie.g.removeAllViews();
        c2486ie.f.d();
        c2275ae.j.c();
        c2275ae.g.removeAllViews();
        c2275ae.h.release();
        if (parentView == null) {
            return null;
        }
        com.inmobi.media.O3 o3 = this.b;
        o3.getClass();
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(parentView, "parentView");
        if (!kotlin.jvm.internal.Intrinsics.areEqual(o3.i, com.inmobi.media.P3.f4886a)) {
            com.inmobi.media.T3 t3 = o3.i;
            throw new com.inmobi.media.M3(!kotlin.jvm.internal.Intrinsics.areEqual(t3, com.inmobi.media.Q3.f4909a) ? !kotlin.jvm.internal.Intrinsics.areEqual(t3, com.inmobi.media.S3.f4948a) ? kotlin.jvm.internal.Intrinsics.areEqual(t3, com.inmobi.media.R3.f4930a) ? "Companion ad failed to load" : "Companion ad view is not available" : "Companion ad is still loading" : "Companion ad has not started loading");
        }
        com.inmobi.media.C2799u9 c2799u93 = o3.c;
        if (c2799u93 != null) {
            c2799u93.a("CompanionAdManager", "renderCompanionView");
        }
        android.widget.FrameLayout.LayoutParams layoutParams = new android.widget.FrameLayout.LayoutParams(-2, -2);
        layoutParams.gravity = 17;
        parentView.addView(o3.f, layoutParams);
        o3.b();
        com.inmobi.media.Dl dl = o3.g;
        if (dl != null) {
            java.util.List plus = kotlin.collections.CollectionsKt.plus((java.util.Collection) dl.b, (java.lang.Iterable) dl.c);
            java.util.ArrayList arrayList = new java.util.ArrayList();
            for (java.lang.Object obj2 : plus) {
                if (kotlin.jvm.internal.Intrinsics.areEqual(((com.inmobi.media.De) obj2).b, "creativeView")) {
                    arrayList.add(obj2);
                }
            }
            java.util.ArrayList arrayList2 = new java.util.ArrayList(kotlin.collections.CollectionsKt.collectionSizeOrDefault(arrayList, 10));
            java.util.Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                arrayList2.add(((com.inmobi.media.De) it.next()).f4662a);
            }
            java.util.Map a2 = com.inmobi.media.AbstractC2938zk.a(o3.b.f5078a);
            com.inmobi.media.C2624nk c2624nk = com.inmobi.media.C2624nk.f5360a;
            com.inmobi.media.C2624nk.b("CompanionAdRendered", a2, com.inmobi.media.EnumC2728rk.f5431a);
            com.inmobi.media.T4.a(o3.d, o3.f4867a, new com.inmobi.media.C2265a4(arrayList2));
        }
        return kotlin.Unit.INSTANCE;
    }
}
