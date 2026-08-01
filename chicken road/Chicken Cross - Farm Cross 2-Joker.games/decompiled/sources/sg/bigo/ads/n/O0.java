package sg.bigo.ads.n;

import android.graphics.Bitmap;
import android.view.View;
import android.view.ViewGroup;

/* loaded from: classes3.dex */
public final class O0 implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Bitmap f13145a;
    public final /* synthetic */ P0 b;

    public O0(P0 p0, Bitmap bitmap) {
        this.b = p0;
        this.f13145a = bitmap;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.b.c.setImageBitmap(this.f13145a);
        ViewGroup.LayoutParams layoutParams = this.b.c.getLayoutParams();
        P0 p0 = this.b;
        layoutParams.width = p0.d;
        layoutParams.height = p0.e;
        p0.c.setLayoutParams(layoutParams);
        View view = this.b.f;
        if (view != null) {
            ViewGroup.LayoutParams layoutParams2 = view.getLayoutParams();
            P0 p02 = this.b;
            layoutParams2.width = p02.d;
            layoutParams2.height = p02.e;
            p02.f.setLayoutParams(layoutParams2);
        }
    }
}
