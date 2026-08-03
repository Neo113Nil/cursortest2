package com.inmobi.media;

/* renamed from: com.inmobi.media.me, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C2590me implements kotlinx.coroutines.flow.FlowCollector {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.inmobi.media.Be f5335a;

    public C2590me(kotlinx.coroutines.CoroutineScope coroutineScope, com.inmobi.media.Be be) {
        this.f5335a = be;
    }

    @Override // kotlinx.coroutines.flow.FlowCollector
    public final java.lang.Object emit(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        com.inmobi.media.AbstractC2509jc mediaEvent = (com.inmobi.media.AbstractC2509jc) obj;
        com.inmobi.media.Vc vc = this.f5335a.b.f;
        vc.getClass();
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(mediaEvent, "mediaEvent");
        if (mediaEvent instanceof com.inmobi.media.Vm) {
            vc.f5013a.d = com.inmobi.media.AbstractC2914yl.a(((com.inmobi.media.Vm) mediaEvent).f5020a);
        } else if (mediaEvent instanceof com.inmobi.media.C2653on) {
            vc.f5013a.e = ((com.inmobi.media.C2653on) mediaEvent).f5380a;
        }
        if (!(mediaEvent instanceof com.inmobi.media.C2653on)) {
            com.inmobi.media.InterfaceC2772t9 l = this.f5335a.l();
            if (l != null) {
                ((com.inmobi.media.C2799u9) l).a("NativeRenderedState", "listenMediaEvents - processing media event: " + mediaEvent);
            }
            ((com.inmobi.media.C2274ad) this.f5335a.b.m.getValue()).a(mediaEvent);
            com.inmobi.media.Ai ai = (com.inmobi.media.Ai) this.f5335a.b.n.getValue();
            ai.getClass();
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(mediaEvent, "event");
            if (mediaEvent instanceof com.inmobi.media.AbstractC2493im) {
                ai.b.a((com.inmobi.media.AbstractC2493im) mediaEvent);
            }
            com.inmobi.media.Ai ai2 = (com.inmobi.media.Ai) this.f5335a.b.n.getValue();
            ai2.getClass();
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(mediaEvent, "event");
            com.inmobi.media.Ic ic = ai2.c.c;
            if (mediaEvent instanceof com.inmobi.media.Bn) {
                ic.f();
            } else if (mediaEvent instanceof com.inmobi.media.C2916yn) {
                ic.i();
            } else if (mediaEvent instanceof com.inmobi.media.C2417fn) {
                ic.b();
            } else if (mediaEvent instanceof com.inmobi.media.C2442gm) {
                ic.h();
            } else if (mediaEvent instanceof com.inmobi.media.S1) {
                ic.a(((com.inmobi.media.S1) mediaEvent).f4947a);
            }
            com.inmobi.media.Ai ai3 = (com.inmobi.media.Ai) this.f5335a.b.n.getValue();
            ai3.getClass();
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(mediaEvent, "mediaEvent");
            if (mediaEvent instanceof com.inmobi.media.C2442gm) {
                ai3.f4604a.g();
            }
        }
        return kotlin.Unit.INSTANCE;
    }
}
