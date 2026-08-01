package sg.bigo.ads.v;

import android.graphics.Bitmap;

/* loaded from: classes3.dex */
public final class m extends sg.bigo.ads.E0.k {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ u f13350a;

    public m(u uVar) {
        this.f13350a = uVar;
    }

    @Override // sg.bigo.ads.E0.k
    public final long a() {
        return 500L;
    }

    @Override // sg.bigo.ads.E0.k
    public final boolean b(int i) {
        u uVar = this.f13350a;
        uVar.l = i;
        if (uVar.a(uVar.c)) {
            u uVar2 = this.f13350a;
            Bitmap bitmap = uVar2.k;
            int i2 = uVar2.l;
            if (uVar2.a()) {
                uVar2.h.post(new o(uVar2, bitmap, i2));
            }
        }
        t tVar = this.f13350a.m;
        if (tVar == null) {
            return false;
        }
        tVar.a();
        return false;
    }

    @Override // sg.bigo.ads.E0.k
    public final void a(int i) {
        t tVar = this.f13350a.m;
        if (tVar != null) {
            tVar.b();
        }
    }
}
