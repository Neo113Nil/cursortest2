package androidx.appcompat.widget;

import java.util.ArrayList;
import l.C1373k;
import n3.AbstractC1464a;

/* loaded from: classes.dex */
public final class i1 extends AbstractC1464a {

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ int f8634g;

    /* renamed from: h, reason: collision with root package name */
    public boolean f8635h;

    /* renamed from: i, reason: collision with root package name */
    public int f8636i;
    public final /* synthetic */ Object j;

    public i1(j1 j1Var, int i7) {
        this.f8634g = 0;
        this.j = j1Var;
        this.f8636i = i7;
        this.f8635h = false;
    }

    @Override // n3.AbstractC1464a, P.c0
    public void a() {
        switch (this.f8634g) {
            case 0:
                this.f8635h = true;
                break;
        }
    }

    @Override // n3.AbstractC1464a, P.c0
    public final void b() {
        switch (this.f8634g) {
            case 0:
                ((j1) this.j).f8662a.setVisibility(0);
                break;
            default:
                if (!this.f8635h) {
                    this.f8635h = true;
                    AbstractC1464a abstractC1464a = (AbstractC1464a) ((C1373k) this.j).f14855e;
                    if (abstractC1464a != null) {
                        abstractC1464a.b();
                        break;
                    }
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
                    break;
                }
                break;
            default:
                int i7 = this.f8636i + 1;
                this.f8636i = i7;
                C1373k c1373k = (C1373k) this.j;
                if (i7 == ((ArrayList) c1373k.f14853c).size()) {
                    AbstractC1464a abstractC1464a = (AbstractC1464a) c1373k.f14855e;
                    if (abstractC1464a != null) {
                        abstractC1464a.c();
                    }
                    this.f8636i = 0;
                    this.f8635h = false;
                    c1373k.f14852b = false;
                    break;
                }
                break;
        }
    }

    public i1(C1373k c1373k) {
        this.f8634g = 1;
        this.j = c1373k;
        this.f8635h = false;
        this.f8636i = 0;
    }
}
