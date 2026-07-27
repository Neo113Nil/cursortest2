package sg.bigo.ads.f0;

import android.content.Context;
import android.text.TextUtils;
import sg.bigo.ads.q0.AbstractC5446j;
import sg.bigo.ads.w0.AbstractC5496a;
import sg.bigo.ads.x0.AbstractC5503c;
import sg.bigo.ads.x0.C5508h;

/* loaded from: classes3.dex */
public final class k extends AbstractC5503c {
    public final /* synthetic */ Context b;
    public final /* synthetic */ String c;
    public final /* synthetic */ l d;

    public k(l lVar, Context context, String str) {
        this.d = lVar;
        this.b = context;
        this.c = str;
    }

    @Override // sg.bigo.ads.x0.AbstractC5503c
    public final void a(sg.bigo.ads.B0.c cVar, C5508h c5508h) {
        AbstractC5496a.b(this.d.d(), "fetch js from network fail: " + c5508h.b);
        this.d.c(this.b);
    }

    @Override // sg.bigo.ads.x0.AbstractC5503c
    public final void a(sg.bigo.ads.B0.c cVar, sg.bigo.ads.C0.c cVar2) {
        String str = ((sg.bigo.ads.C0.d) cVar2).b;
        if (!TextUtils.isEmpty(str) && this.d.a(str)) {
            l lVar = this.d;
            lVar.f12790a = str;
            lVar.b = true;
            AbstractC5446j.a(0, null, new j(this), 0L);
            return;
        }
        this.d.c(this.b);
    }

    @Override // sg.bigo.ads.x0.AbstractC5503c
    public final sg.bigo.ads.C0.c a(sg.bigo.ads.C0.a aVar) {
        return new sg.bigo.ads.C0.d(aVar);
    }
}
