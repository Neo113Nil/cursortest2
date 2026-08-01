package sg.bigo.ads.h1;

import sg.bigo.ads.K0.I;

/* loaded from: classes3.dex */
public final class i {

    /* renamed from: a, reason: collision with root package name */
    public int f12964a;
    public int b;
    public int c;
    public int d;

    public final void a(String str) {
        str.getClass();
        str.hashCode();
        switch (str) {
            case "filled":
                this.b++;
                break;
            case "load":
                this.f12964a++;
                break;
            case "impression":
                this.c++;
                break;
            case "clicked":
                this.d++;
                break;
        }
        sg.bigo.ads.F0.b.b("sp_ads", "cb_event_count", toString(), 3);
    }

    public final String toString() {
        return this.f12964a + "," + this.b + "," + this.c + "," + this.d;
    }

    public static i a() {
        i iVar = new i();
        String str = (String) sg.bigo.ads.F0.b.a("sp_ads", "cb_event_count", "", 3);
        if (!I.a((CharSequence) str)) {
            String[] split = str.split(",");
            if (split.length == 4) {
                try {
                    iVar.f12964a = Integer.parseInt(split[0]);
                    iVar.b = Integer.parseInt(split[1]);
                    iVar.c = Integer.parseInt(split[2]);
                    iVar.d = Integer.parseInt(split[3]);
                } catch (NumberFormatException unused) {
                }
            }
        }
        return iVar;
    }
}
