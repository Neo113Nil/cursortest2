package com.inmobi.media;

/* renamed from: com.inmobi.media.x7, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C2875x7 implements kotlinx.coroutines.flow.FlowCollector {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.inmobi.media.R7 f5544a;

    public C2875x7(kotlinx.coroutines.CoroutineScope coroutineScope, com.inmobi.media.R7 r7) {
        this.f5544a = r7;
    }

    @Override // kotlinx.coroutines.flow.FlowCollector
    public final java.lang.Object emit(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        com.inmobi.media.R7 r7 = this.f5544a;
        r7.x.a();
        r7.l.set(com.inmobi.media.Bg.f);
        return kotlin.Unit.INSTANCE;
    }
}
