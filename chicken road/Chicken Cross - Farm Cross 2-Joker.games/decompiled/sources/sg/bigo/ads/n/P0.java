package sg.bigo.ads.n;

import android.content.Context;
import android.graphics.Bitmap;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import sg.bigo.ads.K0.AbstractC4962t;
import sg.bigo.ads.q0.AbstractC5446j;

/* loaded from: classes3.dex */
public final class P0 implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ ViewGroup f13146a;
    public final /* synthetic */ Bitmap b;
    public final /* synthetic */ ImageView c;
    public final /* synthetic */ int d;
    public final /* synthetic */ int e;
    public final /* synthetic */ View f;
    public final /* synthetic */ S0 g;

    public P0(S0 s0, ViewGroup viewGroup, Bitmap bitmap, ImageView imageView, int i, int i2, View view) {
        this.g = s0;
        this.f13146a = viewGroup;
        this.b = bitmap;
        this.c = imageView;
        this.d = i;
        this.e = i2;
        this.f = view;
    }

    @Override // java.lang.Runnable
    public final void run() {
        Context context = this.f13146a.getContext();
        Bitmap bitmap = this.b;
        AbstractC5446j.e();
        Bitmap a2 = AbstractC4962t.a(context, bitmap);
        if (a2 == null || this.g.d.t) {
            return;
        }
        this.c.post(new O0(this, a2));
    }
}
