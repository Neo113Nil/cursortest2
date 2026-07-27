package sg.bigo.ads.s0;

import android.content.Context;
import java.io.File;
import sg.bigo.ads.g0.C5123a;

/* loaded from: classes3.dex */
public final class v extends k {
    public v() {
        this.c = new C5123a();
    }

    @Override // sg.bigo.ads.s0.k
    public final sg.bigo.ads.U.c a(String str, Context context) {
        return t.a(context).b(str);
    }

    @Override // sg.bigo.ads.s0.k
    public final String b(Context context) {
        return sg.bigo.ads.U.o.a(new StringBuilder().append(sg.bigo.ads.U.q.a(context)), File.separator, "icon");
    }

    @Override // sg.bigo.ads.s0.k
    public final void d(String str, Context context) {
        t.a(context).d(str);
    }

    @Override // sg.bigo.ads.s0.k
    public final int a() {
        C5123a c5123a = this.c;
        if (c5123a.b == 0) {
            return Integer.MAX_VALUE;
        }
        return c5123a.c;
    }

    @Override // sg.bigo.ads.s0.k
    public final void a(Context context, String str, sg.bigo.ads.U.c cVar) {
        t.a(context).b(str, cVar);
    }

    @Override // sg.bigo.ads.s0.k
    public final String b(String str, Context context) {
        StringBuilder sb = new StringBuilder();
        StringBuilder append = new StringBuilder().append(sg.bigo.ads.U.q.a(context));
        String str2 = File.separator;
        return sg.bigo.ads.U.p.a(append, str2, "icon", sb, str2).append(str).toString();
    }

    @Override // sg.bigo.ads.s0.k
    public final String b() {
        return "IconLoader";
    }
}
