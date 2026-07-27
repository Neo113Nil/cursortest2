package sg.bigo.ads.h;

import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;

/* loaded from: classes3.dex */
public final class L1 implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Bitmap f12838a;
    public final /* synthetic */ long b;
    public final /* synthetic */ M1 c;

    public L1(M1 m1, Bitmap bitmap, long j, Bitmap bitmap2) {
        this.c = m1;
        this.f12838a = bitmap;
        this.b = j;
    }

    @Override // java.lang.Runnable
    public final void run() {
        sg.bigo.ads.E0.p.a(this.c.f12840a, new BitmapDrawable(this.c.f12840a.getResources(), this.f12838a), this.b);
        this.c.getClass();
    }
}
