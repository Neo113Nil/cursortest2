package com.inmobi.media;

/* renamed from: com.inmobi.media.ic, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C2484ic implements com.inmobi.media.InterfaceC2458hc {

    /* renamed from: a, reason: collision with root package name */
    public final com.inmobi.media.InterfaceC2458hc f5258a;
    public final java.util.concurrent.atomic.AtomicBoolean b;

    public C2484ic(com.inmobi.media.InterfaceC2458hc mediaChangeReceiver) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(mediaChangeReceiver, "mediaChangeReceiver");
        this.f5258a = mediaChangeReceiver;
        this.b = new java.util.concurrent.atomic.AtomicBoolean(false);
    }

    @Override // com.inmobi.media.InterfaceC2458hc
    public final void a() {
        if (this.b.getAndSet(false)) {
            this.f5258a.a();
        }
    }

    @Override // com.inmobi.media.InterfaceC2458hc
    public final void b() {
        if (this.b.getAndSet(true)) {
            return;
        }
        this.f5258a.b();
    }
}
