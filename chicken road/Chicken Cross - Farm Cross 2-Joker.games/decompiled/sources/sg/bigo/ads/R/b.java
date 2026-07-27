package sg.bigo.ads.R;

/* loaded from: classes3.dex */
public final class b {
    public static int f = 0;
    public static int g = 3;
    public static boolean h = false;

    /* renamed from: a, reason: collision with root package name */
    public int f12516a = 1;
    public boolean b = false;
    public boolean c = false;
    public long d = -1;
    public boolean e = false;

    public static b a(int i) {
        b bVar = new b();
        if (h) {
            bVar.e = true;
            bVar.c = true;
            bVar.b = true;
            bVar.d = 2000L;
        } else {
            if (i != 2) {
                if (i == 3) {
                    bVar.e = true;
                    bVar.c = true;
                } else if (i == 4) {
                    bVar.e = true;
                    bVar.c = true;
                    bVar.b = true;
                } else if (i != 12) {
                    if (i == 20) {
                        bVar.c = true;
                        bVar.f12516a = 4;
                    }
                }
                bVar.d = 2000L;
                bVar.f12516a = g;
            }
            bVar.e = true;
            bVar.c = true;
            bVar.b = true;
            bVar.d = 2000L;
            bVar.f12516a = 4;
        }
        g = 3;
        return bVar;
    }
}
