package sg.bigo.ads.M;

import android.graphics.Bitmap;

/* renamed from: sg.bigo.ads.M.d, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class RunnableC4987d implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Bitmap f12442a;
    public final /* synthetic */ C4988e b;

    public RunnableC4987d(C4988e c4988e, Bitmap bitmap) {
        this.b = c4988e;
        this.f12442a = bitmap;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.b.f12443a.setImageBitmap(this.f12442a);
    }
}
