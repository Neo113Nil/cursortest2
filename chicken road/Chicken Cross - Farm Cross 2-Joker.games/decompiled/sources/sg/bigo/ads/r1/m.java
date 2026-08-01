package sg.bigo.ads.r1;

import java.util.HashMap;
import sg.bigo.ads.e1.InterfaceC5087a;

/* loaded from: classes3.dex */
public final class m implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ n f13278a;

    public m(n nVar) {
        this.f13278a = nVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f13278a.g();
        InterfaceC5087a interfaceC5087a = this.f13278a.d;
        String k = interfaceC5087a != null ? ((sg.bigo.ads.U0.k) interfaceC5087a).k() : "";
        HashMap hashMap = interfaceC5087a == null ? new HashMap() : sg.bigo.ads.s1.b.a((sg.bigo.ads.P.c) interfaceC5087a, (sg.bigo.ads.Q.b) null, false);
        hashMap.put("rslt", "0");
        hashMap.put("video_url", k);
        hashMap.put("retry", String.valueOf(0));
        hashMap.put("media_player_status", String.valueOf(13));
        hashMap.put("error", "onSurfaceTextureAvailable not called");
        sg.bigo.ads.s1.b.a("06002054", hashMap);
        this.f13278a.a("AdVideoTooLate", new int[]{10311});
    }
}
