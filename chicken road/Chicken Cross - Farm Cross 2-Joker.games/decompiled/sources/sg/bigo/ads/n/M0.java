package sg.bigo.ads.n;

import android.content.Context;
import android.graphics.Bitmap;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import sg.bigo.ads.K0.AbstractC4962t;
import sg.bigo.ads.q0.AbstractC5446j;

/* loaded from: classes3.dex */
public final class M0 implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ ViewGroup f13143a;
    public final /* synthetic */ ImageView b;
    public final /* synthetic */ View c;
    public final /* synthetic */ S0 d;

    public M0(S0 s0, ViewGroup viewGroup, ImageView imageView, View view) {
        this.d = s0;
        this.f13143a = viewGroup;
        this.b = imageView;
        this.c = view;
    }

    @Override // java.lang.Runnable
    public final void run() {
        Context context = this.f13143a.getContext();
        Bitmap bitmap = this.d.F;
        AbstractC5446j.e();
        Bitmap a2 = AbstractC4962t.a(context, bitmap);
        if (a2 == null || this.d.d.t) {
            return;
        }
        this.b.post(new L0(this, a2));
    }
}
