package sg.bigo.ads.v;

import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.widget.ImageView;

/* loaded from: classes3.dex */
public final class o implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Bitmap f13352a;
    public final /* synthetic */ int b;
    public final /* synthetic */ u c;

    public o(u uVar, Bitmap bitmap, int i) {
        this.c = uVar;
        this.f13352a = bitmap;
        this.b = i;
    }

    @Override // java.lang.Runnable
    public final void run() {
        BitmapDrawable bitmapDrawable = new BitmapDrawable(this.c.h.getResources(), this.f13352a);
        bitmapDrawable.setAlpha(this.b);
        this.c.h.setScaleType(ImageView.ScaleType.CENTER_CROP);
        this.c.h.setImageDrawable(bitmapDrawable);
    }
}
