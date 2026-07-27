package com.inmobi.media;

/* renamed from: com.inmobi.media.q3, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C4010q3 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ C4038r3 f7318a;

    public C4010q3(C4038r3 c4038r3) {
        this.f7318a = c4038r3;
    }

    public final void a(boolean z) {
        C3998pj c3998pj;
        if (z && (c3998pj = (C3998pj) this.f7318a.k.get()) != null) {
            Ej.h1.getClass();
            c3998pj.a(C3855kj.a("IN_NATIVE_BROWSER", "onInteraction"));
        }
        C3998pj c3998pj2 = (C3998pj) this.f7318a.k.get();
        if (c3998pj2 != null) {
            Ej.h1.getClass();
            c3998pj2.a(C3855kj.a("IN_NATIVE_BROWSER", "onClose"));
        }
        String str = "Session ended: didUserInteract=" + z;
    }
}
