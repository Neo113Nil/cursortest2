package com.inmobi.media;

/* renamed from: com.inmobi.media.i4, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C2476i4 implements kotlinx.coroutines.flow.FlowCollector {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.inmobi.media.C2580m4 f5252a;

    public C2476i4(com.inmobi.media.C2580m4 c2580m4) {
        this.f5252a = c2580m4;
    }

    @Override // kotlinx.coroutines.flow.FlowCollector
    public final java.lang.Object emit(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        com.inmobi.media.core.config.models.Config config = (com.inmobi.media.core.config.models.Config) obj;
        this.f5252a.f5327a.b.put(config.getType(), config);
        com.inmobi.media.C2580m4 c2580m4 = this.f5252a;
        java.util.concurrent.ConcurrentLinkedQueue concurrentLinkedQueue = (java.util.concurrent.ConcurrentLinkedQueue) c2580m4.f5327a.c.get(config.getType());
        if (concurrentLinkedQueue != null) {
            java.util.Iterator it = concurrentLinkedQueue.iterator();
            while (it.hasNext()) {
                com.inmobi.media.InterfaceC2846w4 interfaceC2846w4 = (com.inmobi.media.InterfaceC2846w4) ((java.lang.ref.WeakReference) it.next()).get();
                if (interfaceC2846w4 != null) {
                    interfaceC2846w4.a(config);
                }
            }
        }
        c2580m4.f5327a.c.remove(config.getType());
        return kotlin.Unit.INSTANCE;
    }
}
