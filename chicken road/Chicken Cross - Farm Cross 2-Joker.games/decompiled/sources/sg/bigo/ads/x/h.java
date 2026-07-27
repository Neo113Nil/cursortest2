package sg.bigo.ads.x;

import android.net.Uri;
import java.io.File;
import sg.bigo.ads.C.t;
import sg.bigo.ads.K0.AbstractC4964v;
import sg.bigo.ads.e1.InterfaceC5087a;
import sg.bigo.ads.q0.AbstractC5446j;

/* loaded from: classes3.dex */
public final class h implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ k f13373a;

    public h(k kVar) {
        this.f13373a = kVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0096 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0010 A[SYNTHETIC] */
    @Override // java.lang.Runnable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void run() {
        boolean z;
        String e;
        String sb;
        int i = 0;
        for (sg.bigo.ads.C.l lVar : this.f13373a.b0.o0.keySet()) {
            this.f13373a.getClass();
            if (lVar instanceof t) {
                sg.bigo.ads.P.j jVar = lVar.k;
                sb = Uri.parse(sg.bigo.ads.U.q.a(((sg.bigo.ads.U0.k) ((InterfaceC5087a) jVar.f12482a)).j(), jVar.e)).getPath();
            } else {
                if (lVar != null && (e = ((sg.bigo.ads.U0.k) ((InterfaceC5087a) lVar.e())).e()) != null) {
                    String valueOf = String.valueOf(e.hashCode());
                    StringBuilder sb2 = new StringBuilder();
                    StringBuilder append = new StringBuilder().append(sg.bigo.ads.U.q.a(lVar.k.e));
                    String str = File.separator;
                    sb = sb2.append(append.append(str).append("image").toString()).append(str).append(valueOf).toString();
                }
                z = false;
                if (!z) {
                    i++;
                }
            }
            z = AbstractC4964v.a(sb);
            if (!z) {
            }
        }
        AbstractC5446j.a(3, null, new g(this), i == this.f13373a.b0.o0.size() ? 0L : 800L);
    }
}
