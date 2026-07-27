package sg.bigo.ads.x0;

import android.os.Build;
import sg.bigo.ads.X0.u;
import sg.bigo.ads.y0.C5516b;
import sg.bigo.ads.y0.C5517c;
import sg.bigo.ads.y0.C5519e;
import sg.bigo.ads.z0.C5532g;

/* renamed from: sg.bigo.ads.x0.g, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public abstract class AbstractC5507g {

    /* renamed from: a, reason: collision with root package name */
    public static C5517c f13384a;
    public static C5532g b;
    public static sg.bigo.ads.U.h c;

    public static void a(sg.bigo.ads.B0.a aVar, AbstractC5503c abstractC5503c) {
        if (abstractC5503c == null) {
            abstractC5503c = AbstractC5503c.f13381a;
        }
        if (a()) {
            b.a(aVar, abstractC5503c);
            return;
        }
        C5517c c5517c = f13384a;
        c5517c.getClass();
        C5516b c5516b = new C5516b(c5517c, aVar.c, aVar, abstractC5503c);
        c5516b.f13420a.execute(c5516b);
    }

    public static C5504d a(sg.bigo.ads.B0.a aVar) {
        C5502b c5502b = new C5502b();
        if (a()) {
            b.b(aVar, c5502b);
        } else {
            C5517c c5517c = f13384a;
            c5517c.a(new C5519e(aVar, null, null, c5517c.f13416a, c5517c.b), c5502b, false);
        }
        return new C5504d(c5502b.b, c5502b.c);
    }

    public static boolean a() {
        sg.bigo.ads.U.h hVar;
        boolean z = Build.VERSION.SDK_INT >= 34 && (hVar = c) != null && ((u) hVar).c.B.a(30);
        if (z) {
            try {
                if (b == null) {
                    sg.bigo.ads.U.h hVar2 = c;
                    b = new C5532g(((u) hVar2).b, hVar2);
                }
            } catch (Throwable unused) {
                return false;
            }
        }
        return z;
    }
}
