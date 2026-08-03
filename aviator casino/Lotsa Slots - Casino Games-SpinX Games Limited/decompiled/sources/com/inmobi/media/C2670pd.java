package com.inmobi.media;

/* renamed from: com.inmobi.media.pd, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C2670pd implements com.inmobi.media.Ta {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.inmobi.media.C2721rd f5390a;

    public C2670pd(com.inmobi.media.C2721rd c2721rd) {
        this.f5390a = c2721rd;
    }

    @Override // com.inmobi.media.Ta
    public final void a(java.lang.String trackerName, java.util.Map macros) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(trackerName, "trackerName");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(macros, "macros");
    }

    @Override // com.inmobi.media.Ta
    public final void b(java.lang.String str, java.lang.String str2, java.lang.String str3) {
    }

    @Override // com.inmobi.media.Ta
    public final void a() {
        com.inmobi.media.InterfaceC2772t9 interfaceC2772t9 = this.f5390a.f5426a.g;
        if (interfaceC2772t9 != null) {
            ((com.inmobi.media.C2799u9) interfaceC2772t9).a("PublisherViewClickHandler", "User left application");
        }
        com.inmobi.media.AbstractC2445h abstractC2445h = (com.inmobi.media.AbstractC2445h) this.f5390a.f5426a.f;
        abstractC2445h.getClass();
        com.inmobi.media.InterfaceC2782tj interfaceC2782tj = ((com.inmobi.media.Ic) abstractC2445h).c;
        com.inmobi.media.Ei ei = interfaceC2782tj instanceof com.inmobi.media.Ei ? (com.inmobi.media.Ei) interfaceC2782tj : null;
        if (ei != null) {
            com.inmobi.media.InterfaceC2772t9 l = ei.l();
            if (l != null) {
                ((com.inmobi.media.C2799u9) l).a("AUM-RenderedState", "onUserLeftApplication");
            }
            com.inmobi.media.T4.a(ei.k(), new com.inmobi.media.Di(ei, null));
        }
    }

    @Override // com.inmobi.media.Ta
    public final void a(java.lang.String str, java.lang.String message, java.lang.String str2) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(message, "message");
        com.inmobi.media.InterfaceC2772t9 interfaceC2772t9 = this.f5390a.f5426a.g;
        if (interfaceC2772t9 != null) {
            ((com.inmobi.media.C2799u9) interfaceC2772t9).b("PublisherViewClickHandler", "Landing page error: " + message + io.ktor.sse.ServerSentEventKt.SPACE + str2);
        }
    }

    @Override // com.inmobi.media.Ta
    public final void a(android.content.Intent intent) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(intent, "intent");
        com.inmobi.media.InterfaceC2772t9 interfaceC2772t9 = this.f5390a.f5426a.g;
        if (interfaceC2772t9 != null) {
            android.content.ComponentName component = intent.getComponent();
            ((com.inmobi.media.C2799u9) interfaceC2772t9).a("PublisherViewClickHandler", "Starting activity: " + (component != null ? component.getClassName() : null));
        }
        this.f5390a.a(intent);
    }
}
