package sg.bigo.ads.n1;

import android.content.Context;
import java.io.File;

/* loaded from: classes3.dex */
public final class i implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ n f13211a;

    public i(n nVar) {
        this.f13211a = nVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        n nVar = this.f13211a;
        nVar.getClass();
        Context context = nVar.d;
        StringBuilder sb = new StringBuilder();
        StringBuilder append = new StringBuilder().append(sg.bigo.ads.U.q.a(context));
        String str = File.separator;
        nVar.a(new File(sg.bigo.ads.U.p.a(append, str, "video", sb, str).append("files").toString()), false);
        nVar.a(new File(sg.bigo.ads.U.o.a(new StringBuilder().append(sg.bigo.ads.U.q.a(nVar.d) + str + "video"), str, "vpaid")), true);
    }
}
