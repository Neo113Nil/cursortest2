package sg.bigo.ads.m;

import android.graphics.Bitmap;
import android.view.ViewGroup;
import sg.bigo.ads.h.AbstractC5140Q;

/* loaded from: classes3.dex */
public final class g0 implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Bitmap f13081a;
    public final /* synthetic */ h0 b;

    public g0(h0 h0Var, Bitmap bitmap) {
        this.b = h0Var;
        this.f13081a = bitmap;
    }

    @Override // java.lang.Runnable
    public final void run() {
        h0 h0Var = this.b;
        h0Var.b.j = this.f13081a;
        AbstractC5140Q.a((ViewGroup) h0Var.f13083a);
        this.b.f13083a.removeAllViews();
        h0 h0Var2 = this.b;
        h0Var2.b.b((ViewGroup) h0Var2.f13083a);
        this.b.f13083a.a(this.f13081a);
    }
}
