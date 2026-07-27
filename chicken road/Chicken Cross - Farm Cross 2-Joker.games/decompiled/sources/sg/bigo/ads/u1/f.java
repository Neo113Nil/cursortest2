package sg.bigo.ads.u1;

import java.util.ArrayList;
import java.util.List;
import sg.bigo.ads.U.k;

/* loaded from: classes3.dex */
public final class f implements k {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ List f13338a;
    public final /* synthetic */ g b;

    public f(g gVar, ArrayList arrayList) {
        this.b = gVar;
        this.f13338a = arrayList;
    }

    @Override // sg.bigo.ads.U.k
    public final void a(int i, int i2, String str) {
        sg.bigo.ads.v1.c.f13361a.submit(new sg.bigo.ads.v1.a(new d(this)));
    }

    @Override // sg.bigo.ads.U.k
    public final void a() {
        sg.bigo.ads.v1.c.f13361a.submit(new sg.bigo.ads.v1.a(new e(this)));
    }
}
