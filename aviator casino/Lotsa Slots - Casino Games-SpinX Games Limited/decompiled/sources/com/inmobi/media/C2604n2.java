package com.inmobi.media;

/* renamed from: com.inmobi.media.n2, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C2604n2 implements kotlinx.coroutines.flow.FlowCollector {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.inmobi.media.AbstractC2765t2 f5347a;

    public C2604n2(kotlinx.coroutines.CoroutineScope coroutineScope, com.inmobi.media.AbstractC2765t2 abstractC2765t2) {
        this.f5347a = abstractC2765t2;
    }

    @Override // kotlinx.coroutines.flow.FlowCollector
    public final java.lang.Object emit(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        boolean booleanValue = ((java.lang.Boolean) obj).booleanValue();
        this.f5347a.getClass();
        this.f5347a.e.set(booleanValue);
        com.inmobi.media.AbstractC2765t2 abstractC2765t2 = this.f5347a;
        if (abstractC2765t2.e.get()) {
            com.inmobi.media.Fg fg = abstractC2765t2.c().f4963a;
            fg.f.set(false);
            fg.a();
        } else {
            com.inmobi.media.Fg fg2 = abstractC2765t2.c().f4963a;
            fg2.b.setValue(com.inmobi.media.EnumC2391eo.f5188a);
            fg2.f.set(true);
            com.inmobi.media.L6.a(fg2.e);
            fg2.e = null;
        }
        com.inmobi.media.AbstractC2765t2 abstractC2765t22 = this.f5347a;
        if (abstractC2765t22.e.get()) {
            abstractC2765t22.g.a();
        } else {
            abstractC2765t22.g.b();
        }
        return kotlin.Unit.INSTANCE;
    }
}
