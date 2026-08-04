package androidx.appcompat.widget;

import java.util.ArrayList;

/* JADX INFO: loaded from: classes.dex */
public final class i1 extends p097n3.a {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final /* synthetic */ int f8634g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public boolean f8635h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public int f8636i;
    public final /* synthetic */ Object j;

    public i1(j1 j1Var, int i7) {
        this.f8634g = 0;
        this.j = j1Var;
        this.f8636i = i7;
        this.f8635h = false;
    }

    @Override // p097n3.a, P.c0
    public void a() {
        switch (this.f8634g) {
            case 0:
                this.f8635h = true;
                break;
        }
    }

    @Override // p097n3.a, P.c0
    public final void b() {
        switch (this.f8634g) {
            case 0:
                ((j1) this.j).f8662a.setVisibility(0);
                break;
            default:
                if (!this.f8635h) {
                    this.f8635h = true;
                    p097n3.a aVar = (p097n3.a) ((p078l.k) this.j).f14861e;
                    if (aVar != null) {
                        aVar.b();
                    }
                    break;
                }
                break;
        }
    }

    @Override // P.c0
    public final void c() {
        switch (this.f8634g) {
            case 0:
                if (!this.f8635h) {
                    ((j1) this.j).f8662a.setVisibility(this.f8636i);
                }
                break;
            default:
                int i7 = this.f8636i + 1;
                this.f8636i = i7;
                p078l.k kVar = (p078l.k) this.j;
                if (i7 == ((ArrayList) kVar.f14859c).size()) {
                    p097n3.a aVar = (p097n3.a) kVar.f14861e;
                    if (aVar != null) {
                        aVar.c();
                    }
                    this.f8636i = 0;
                    this.f8635h = false;
                    kVar.f14858b = false;
                }
                break;
        }
    }

    public i1(p078l.k kVar) {
        this.f8634g = 1;
        this.j = kVar;
        this.f8635h = false;
        this.f8636i = 0;
    }
}
