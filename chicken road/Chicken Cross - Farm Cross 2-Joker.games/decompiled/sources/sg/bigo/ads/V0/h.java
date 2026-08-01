package sg.bigo.ads.V0;

import sg.bigo.ads.K0.AbstractC4955l;

/* loaded from: classes3.dex */
public final class h implements sg.bigo.ads.U.m {

    /* renamed from: a, reason: collision with root package name */
    public final String f12588a;
    public final String b;
    public final boolean c;
    public final String d;

    public h(String str, sg.bigo.ads.R0.g gVar) {
        this.f12588a = str;
        if (gVar != null) {
            boolean a2 = AbstractC4955l.a(gVar.b);
            this.c = a2;
            String str2 = gVar.f12519a;
            this.b = str2;
            str = a2 ? AbstractC4955l.a(str, gVar.b) : AbstractC4955l.a(str, str2);
        } else {
            this.c = false;
            this.b = "";
        }
        this.d = str;
    }

    @Override // sg.bigo.ads.U.m
    public final String a() {
        return this.d;
    }

    @Override // sg.bigo.ads.U.m
    public final String b() {
        return this.b;
    }

    @Override // sg.bigo.ads.U.m
    public final boolean c() {
        return this.c;
    }

    @Override // sg.bigo.ads.U.m
    public final String d() {
        return this.f12588a;
    }
}
