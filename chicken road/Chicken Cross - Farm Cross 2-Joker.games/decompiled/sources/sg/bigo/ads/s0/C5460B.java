package sg.bigo.ads.s0;

import android.content.Context;
import java.io.File;
import sg.bigo.ads.g0.C5123a;

/* renamed from: sg.bigo.ads.s0.B, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C5460B extends k {
    public C5460B() {
        this.c = new C5123a();
    }

    @Override // sg.bigo.ads.s0.k
    public final sg.bigo.ads.U.c a(String str, Context context) {
        return t.a(context).a(str);
    }

    @Override // sg.bigo.ads.s0.k
    public final String b(Context context) {
        return sg.bigo.ads.U.o.a(new StringBuilder().append(sg.bigo.ads.U.q.a(context)), File.separator, "image");
    }

    @Override // sg.bigo.ads.s0.k
    public final void d(String str, Context context) {
        t.a(context).c(str);
    }

    @Override // sg.bigo.ads.s0.k
    public final int a() {
        int i = this.c.b;
        if (i == 0) {
            return Integer.MAX_VALUE;
        }
        return i;
    }

    @Override // sg.bigo.ads.s0.k
    public final void a(Context context, String str, sg.bigo.ads.U.c cVar) {
        t.a(context).a(str, cVar);
    }

    @Override // sg.bigo.ads.s0.k
    public final String b(String str, Context context) {
        StringBuilder sb = new StringBuilder();
        StringBuilder append = new StringBuilder().append(sg.bigo.ads.U.q.a(context));
        String str2 = File.separator;
        return sg.bigo.ads.U.p.a(append, str2, "image", sb, str2).append(str).toString();
    }

    @Override // sg.bigo.ads.s0.k
    public final String b() {
        return "ImageLoader";
    }
}
