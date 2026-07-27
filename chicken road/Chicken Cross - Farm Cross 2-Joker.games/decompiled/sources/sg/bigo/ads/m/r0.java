package sg.bigo.ads.m;

import android.view.View;
import android.view.ViewGroup;
import sg.bigo.ads.h.AbstractC5140Q;

/* loaded from: classes3.dex */
public final class r0 implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f13099a;
    public final /* synthetic */ ViewGroup b;
    public final /* synthetic */ ViewGroup c;
    public final /* synthetic */ ViewGroup d;
    public final /* synthetic */ y0 e;

    public r0(y0 y0Var, int i, ViewGroup viewGroup, ViewGroup viewGroup2, ViewGroup viewGroup3) {
        this.e = y0Var;
        this.f13099a = i;
        this.b = viewGroup;
        this.c = viewGroup2;
        this.d = viewGroup3;
    }

    @Override // java.lang.Runnable
    public final void run() {
        if (sg.bigo.ads.e.h.a((sg.bigo.ads.e.h) this.e.d)) {
            return;
        }
        int i = this.f13099a;
        if (1 == i) {
            AbstractC5140Q.a((View) this.b);
            ViewGroup viewGroup = this.c;
            if (viewGroup != null) {
                AbstractC5140Q.a((View) viewGroup);
                return;
            }
            return;
        }
        if (2 == i) {
            y0 y0Var = this.e;
            y0.a(y0Var, y0Var.p);
            ViewGroup viewGroup2 = this.d;
            if (viewGroup2 != null) {
                y0.a(this.e, viewGroup2);
            }
        }
    }
}
