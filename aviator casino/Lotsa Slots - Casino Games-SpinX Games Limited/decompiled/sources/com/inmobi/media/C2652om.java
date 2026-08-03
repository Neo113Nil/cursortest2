package com.inmobi.media;

/* renamed from: com.inmobi.media.om, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C2652om implements kotlinx.coroutines.flow.FlowCollector {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.inmobi.media.Fm f5379a;

    public C2652om(kotlinx.coroutines.CoroutineScope coroutineScope, com.inmobi.media.Fm fm) {
        this.f5379a = fm;
    }

    @Override // kotlinx.coroutines.flow.FlowCollector
    public final java.lang.Object emit(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        kotlinx.coroutines.Job launch$default;
        kotlinx.coroutines.Job launch$default2;
        boolean booleanValue = ((java.lang.Boolean) obj).booleanValue();
        com.inmobi.media.C2799u9 c2799u9 = this.f5379a.e;
        if (c2799u9 != null) {
            c2799u9.a("VideoExperienceManager", "attachWindowLifecycleObserver - window visibility changed: " + booleanValue);
        }
        if (booleanValue) {
            com.inmobi.media.Fm fm = this.f5379a;
            com.inmobi.media.C2799u9 c2799u92 = fm.e;
            if (c2799u92 != null) {
                c2799u92.a("VideoExperienceManager", "handleOnWindowVisible called - starting media player and setting up observers");
            }
            com.inmobi.media.InterfaceC2588mc interfaceC2588mc = fm.h;
            if (interfaceC2588mc == null) {
                kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("mediaPlayer");
                interfaceC2588mc = null;
            }
            com.inmobi.media.C2275ae c2275ae = (com.inmobi.media.C2275ae) interfaceC2588mc;
            com.inmobi.media.Gn gn = c2275ae.k;
            gn.d.set(true);
            com.inmobi.media.Fg fg = (com.inmobi.media.Fg) gn.i.d.getValue();
            fg.b.setValue(com.inmobi.media.EnumC2391eo.f5188a);
            fg.f.set(true);
            com.inmobi.media.L6.a(fg.e);
            fg.e = null;
            com.inmobi.media.Fg fg2 = (com.inmobi.media.Fg) gn.i.d.getValue();
            fg2.a();
            launch$default = kotlinx.coroutines.BuildersKt__Builders_commonKt.launch$default(gn.f4732a, kotlinx.coroutines.Dispatchers.getMain(), null, new com.inmobi.media.En(new com.inmobi.media.C2599mn(fg2.b), null, gn), 2, null);
            java.util.ArrayList activeJobs = gn.e;
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(launch$default, "<this>");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(activeJobs, "activeJobs");
            activeJobs.add(launch$default);
            gn.a();
            launch$default2 = kotlinx.coroutines.BuildersKt__Builders_commonKt.launch$default(c2275ae.f5102a, null, null, new com.inmobi.media.Td(new com.inmobi.media.Wd(c2275ae.m), null, c2275ae), 3, null);
            java.util.ArrayList activeJobs2 = c2275ae.d;
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(launch$default2, "<this>");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(activeJobs2, "activeJobs");
            activeJobs2.add(launch$default2);
            c2275ae.j.b();
            com.inmobi.media.C2799u9 c2799u93 = fm.e;
            if (c2799u93 != null) {
                c2799u93.a("VideoExperienceManager", "observeMediaEvents - setting up media event observers");
            }
            com.inmobi.media.InterfaceC2588mc interfaceC2588mc2 = fm.h;
            if (interfaceC2588mc2 == null) {
                kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("mediaPlayer");
                interfaceC2588mc2 = null;
            }
            kotlinx.coroutines.Job launchIn = kotlinx.coroutines.flow.FlowKt.launchIn(kotlinx.coroutines.flow.FlowKt.onEach(new com.inmobi.media.C2940zm(kotlinx.coroutines.flow.FlowKt.onEach(((com.inmobi.media.C2275ae) interfaceC2588mc2).m, new com.inmobi.media.Am(fm, null))), new com.inmobi.media.Bm(fm, null)), fm.b);
            java.util.ArrayList activeJobs3 = fm.f;
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(launchIn, "<this>");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(activeJobs3, "activeJobs");
            activeJobs3.add(launchIn);
            com.inmobi.media.T4.a(fm.b, new com.inmobi.media.Em(fm, null));
            fm.c();
        } else {
            this.f5379a.b();
        }
        return kotlin.Unit.INSTANCE;
    }
}
