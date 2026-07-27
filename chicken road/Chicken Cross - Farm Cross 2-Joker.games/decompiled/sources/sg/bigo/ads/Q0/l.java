package sg.bigo.ads.Q0;

import android.os.SystemClock;
import android.webkit.ValueCallback;
import sg.bigo.ads.R0.u;
import sg.bigo.ads.x0.AbstractC5503c;
import sg.bigo.ads.x0.C5508h;

/* loaded from: classes3.dex */
public final class l extends AbstractC5503c {
    public final /* synthetic */ sg.bigo.ads.R0.b b;
    public final /* synthetic */ ValueCallback c;
    public final /* synthetic */ long d;
    public final /* synthetic */ String e;
    public final /* synthetic */ u f;
    public final /* synthetic */ ValueCallback g;
    public final /* synthetic */ n h;

    public l(n nVar, sg.bigo.ads.R0.b bVar, ValueCallback valueCallback, long j, String str, u uVar, ValueCallback valueCallback2) {
        this.h = nVar;
        this.b = bVar;
        this.c = valueCallback;
        this.d = j;
        this.e = str;
        this.f = uVar;
        this.g = valueCallback2;
    }

    @Override // sg.bigo.ads.x0.AbstractC5503c
    public final void a(sg.bigo.ads.B0.c cVar, C5508h c5508h) {
        String str = this.b.b;
        sg.bigo.ads.s1.b.a(this.d > 0 ? SystemClock.elapsedRealtime() - this.d : 0L, false, this.b.b, 4000, "NetError:" + c5508h.f13385a + ", " + c5508h.b);
        this.h.a(this.e, this.f, this.c, this.g);
    }

    @Override // sg.bigo.ads.x0.AbstractC5503c
    public final void a(sg.bigo.ads.B0.c cVar, sg.bigo.ads.C0.c cVar2) {
        sg.bigo.ads.R0.b bVar = this.b;
        String str = bVar.b;
        String str2 = ((sg.bigo.ads.C0.d) cVar2).b;
        ValueCallback valueCallback = this.c;
        if (valueCallback != null) {
            valueCallback.onReceiveValue(new m(bVar, str2, this.d));
        }
    }

    @Override // sg.bigo.ads.x0.AbstractC5503c
    public final sg.bigo.ads.C0.c a(sg.bigo.ads.C0.a aVar) {
        return new sg.bigo.ads.C0.d(aVar);
    }
}
