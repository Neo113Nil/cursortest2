package sg.bigo.ads.i;

import android.content.Context;
import android.view.View;
import java.util.Iterator;
import sg.bigo.ads.api.Ad;
import sg.bigo.ads.j.C5252f;
import sg.bigo.ads.k.C5256a;
import sg.bigo.ads.k.InterfaceC5257b;

/* renamed from: sg.bigo.ads.i.c, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C5231c implements sg.bigo.ads.k.f, sg.bigo.ads.k.d {

    /* renamed from: a, reason: collision with root package name */
    public final boolean f12978a;
    public final InterfaceC5257b b;
    public final C5256a c = new C5256a();

    public C5231c(boolean z, Ad ad, sg.bigo.ads.T0.p pVar, sg.bigo.ads.P.c cVar, sg.bigo.ads.n1.o oVar, sg.bigo.ads.z1.p pVar2) {
        sg.bigo.ads.z1.a aVar;
        sg.bigo.ads.z1.b bVar;
        sg.bigo.ads.U0.b bVar2 = (sg.bigo.ads.U0.b) cVar;
        if ((bVar2.b() || pVar.t == 1) && !z) {
            int i = bVar2.l;
            if (i == 3 || i == 4 || i == 12 || i == 20) {
                sg.bigo.ads.z1.a aVar2 = null;
                if (pVar2 != null) {
                    Iterator it = pVar2.y.iterator();
                    sg.bigo.ads.z1.a aVar3 = null;
                    while (it.hasNext() && ((bVar = (sg.bigo.ads.z1.b) it.next()) == null || (((aVar2 = sg.bigo.ads.z1.b.a(bVar.b)) == null || !aVar2.a()) && ((aVar3 = sg.bigo.ads.z1.b.a(bVar.f13438a)) == null || !aVar3.a())))) {
                    }
                    aVar = aVar3;
                } else {
                    aVar = null;
                }
                if (aVar2 != null && aVar2.a()) {
                    this.b = new sg.bigo.ads.j.l(this, ad, bVar2, oVar, pVar2, new C5230b(this));
                }
                if (this.b == null && aVar != null && aVar.a()) {
                    this.b = new C5252f(ad, bVar2, oVar, pVar2, aVar, new C5229a(this));
                }
                this.f12978a = this.b != null;
                String str = pVar.l;
            }
        }
    }

    @Override // sg.bigo.ads.k.InterfaceC5257b
    public final void a(int i) {
        InterfaceC5257b interfaceC5257b;
        if (this.f12978a && (interfaceC5257b = this.b) != null) {
            interfaceC5257b.a(1);
        }
    }

    @Override // sg.bigo.ads.k.InterfaceC5257b
    public final void b() {
        InterfaceC5257b interfaceC5257b = this.b;
        if (interfaceC5257b != null) {
            interfaceC5257b.b();
        }
    }

    @Override // sg.bigo.ads.k.InterfaceC5257b
    public final boolean c() {
        InterfaceC5257b interfaceC5257b;
        if (this.f12978a && (interfaceC5257b = this.b) != null) {
            return interfaceC5257b.c();
        }
        return false;
    }

    @Override // sg.bigo.ads.k.InterfaceC5257b
    public final void d() {
        InterfaceC5257b interfaceC5257b = this.b;
        if (interfaceC5257b != null) {
            interfaceC5257b.d();
        }
    }

    @Override // sg.bigo.ads.k.InterfaceC5257b
    public final View e() {
        InterfaceC5257b interfaceC5257b;
        if (this.f12978a && (interfaceC5257b = this.b) != null) {
            return interfaceC5257b.e();
        }
        return null;
    }

    @Override // sg.bigo.ads.k.InterfaceC5257b
    public final void pause() {
        InterfaceC5257b interfaceC5257b = this.b;
        if (interfaceC5257b != null) {
            interfaceC5257b.pause();
        }
    }

    @Override // sg.bigo.ads.k.InterfaceC5257b
    public final boolean a(Context context) {
        InterfaceC5257b interfaceC5257b;
        if (this.f12978a && (interfaceC5257b = this.b) != null) {
            return interfaceC5257b.a(context);
        }
        return false;
    }

    @Override // sg.bigo.ads.k.InterfaceC5257b
    public final void a() {
        InterfaceC5257b interfaceC5257b = this.b;
        if (interfaceC5257b != null) {
            interfaceC5257b.a();
        }
    }

    @Override // sg.bigo.ads.k.InterfaceC5257b
    public final void a(int i, int i2) {
        InterfaceC5257b interfaceC5257b;
        if (this.f12978a && (interfaceC5257b = this.b) != null) {
            interfaceC5257b.a(i, i2);
        }
    }
}
