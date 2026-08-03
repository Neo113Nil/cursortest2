package com.inmobi.media;

/* loaded from: classes5.dex */
public final class Dn implements kotlinx.coroutines.flow.FlowCollector {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.inmobi.media.Gn f4669a;

    public Dn(kotlinx.coroutines.CoroutineScope coroutineScope, com.inmobi.media.Gn gn) {
        this.f4669a = gn;
    }

    @Override // kotlinx.coroutines.flow.FlowCollector
    public final java.lang.Object emit(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        boolean booleanValue = ((java.lang.Boolean) obj).booleanValue();
        com.inmobi.media.C2799u9 c2799u9 = this.f4669a.c;
        if (c2799u9 != null) {
            c2799u9.a("VideoSurfaceViewabilityController", "Viewability " + booleanValue);
        }
        if (booleanValue) {
            com.inmobi.media.Zj zj = this.f4669a.h;
            if (zj != null) {
                zj.a();
            }
        } else {
            com.inmobi.media.Zj zj2 = this.f4669a.h;
            if (zj2 != null) {
                zj2.b();
            }
        }
        return kotlin.Unit.INSTANCE;
    }
}
