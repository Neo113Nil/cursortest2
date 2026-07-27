package sg.bigo.ads.g;

import java.util.HashSet;
import java.util.Set;
import sg.bigo.ads.K0.A;
import sg.bigo.ads.Z0.g;
import sg.bigo.ads.api.Ad;

/* renamed from: sg.bigo.ads.g.b, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C5119b implements sg.bigo.ads.Q.c {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Set f12793a;
    public final /* synthetic */ Set b;
    public final /* synthetic */ sg.bigo.ads.Q.c c;
    public final /* synthetic */ C5122e d;

    public C5119b(C5122e c5122e, HashSet hashSet, HashSet hashSet2, g gVar) {
        this.d = c5122e;
        this.f12793a = hashSet;
        this.b = hashSet2;
        this.c = gVar;
    }

    @Override // sg.bigo.ads.Q.c
    public final void a(Ad ad, int i, int i2, String str) {
        a();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // sg.bigo.ads.Q.c
    public final void a(sg.bigo.ads.Q.b bVar, boolean z) {
        a();
    }

    @Override // sg.bigo.ads.Q.c
    public final void a(Ad ad) {
        a();
    }

    public final void a() {
        if (A.a(this.f12793a)) {
            if (A.a(this.b)) {
                this.c.a(this.d, 1020, 1500, "all icon ads are invalid.");
            } else {
                this.c.a(this.d);
            }
        }
    }
}
