package com.inmobi.media;

/* renamed from: com.inmobi.media.qd, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C2696qd implements com.inmobi.media.InterfaceC2859wh {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.inmobi.media.C2721rd f5408a;

    public C2696qd(com.inmobi.media.C2721rd c2721rd) {
        this.f5408a = c2721rd;
    }

    @Override // com.inmobi.media.InterfaceC2859wh
    public final boolean a() {
        long userTouchResetTime = this.f5408a.f5426a.b.f4714a.b.getRendering().getUserTouchResetTime();
        long elapsedRealtime = android.os.SystemClock.elapsedRealtime();
        long j = this.f5408a.b;
        return j != 0 && elapsedRealtime - j < userTouchResetTime;
    }

    @Override // com.inmobi.media.InterfaceC2859wh
    public final boolean c() {
        return !this.f5408a.f5426a.b.f4714a.b.getRendering().getAutoRedirectionEnforcement() || a();
    }

    @Override // com.inmobi.media.InterfaceC2859wh
    public final long getViewTouchTimestamp() {
        return this.f5408a.b;
    }

    @Override // com.inmobi.media.InterfaceC2859wh
    public final void a(java.lang.String api) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(api, "api");
        java.util.Map a2 = com.inmobi.media.AbstractC2938zk.a(this.f5408a.f5426a.e.f4817a);
        com.inmobi.media.C2624nk c2624nk = com.inmobi.media.C2624nk.f5360a;
        com.inmobi.media.C2624nk.b("BlockAutoRedirection", a2, com.inmobi.media.EnumC2728rk.f5431a);
    }
}
