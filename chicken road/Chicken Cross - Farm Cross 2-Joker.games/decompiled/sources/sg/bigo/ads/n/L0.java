package sg.bigo.ads.n;

import android.graphics.Bitmap;
import android.view.View;
import android.view.ViewGroup;

/* loaded from: classes3.dex */
public final class L0 implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Bitmap f13142a;
    public final /* synthetic */ M0 b;

    public L0(M0 m0, Bitmap bitmap) {
        this.b = m0;
        this.f13142a = bitmap;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.b.b.setImageBitmap(this.f13142a);
        ViewGroup.LayoutParams layoutParams = this.b.b.getLayoutParams();
        int height = this.b.d.C.getHeight();
        layoutParams.height = height;
        layoutParams.width = this.b.d.w();
        this.b.b.setLayoutParams(layoutParams);
        View view = this.b.c;
        if (view != null) {
            ViewGroup.LayoutParams layoutParams2 = view.getLayoutParams();
            layoutParams2.height = height;
            layoutParams2.width = this.b.d.w();
            this.b.c.setLayoutParams(layoutParams2);
        }
    }
}
