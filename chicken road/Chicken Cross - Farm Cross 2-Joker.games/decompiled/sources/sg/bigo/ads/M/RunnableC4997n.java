package sg.bigo.ads.M;

import android.graphics.Bitmap;

/* renamed from: sg.bigo.ads.M.n, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class RunnableC4997n implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Bitmap f12450a;
    public final /* synthetic */ C4998o b;

    public RunnableC4997n(C4998o c4998o, Bitmap bitmap) {
        this.b = c4998o;
        this.f12450a = bitmap;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.b.f12451a.setImageBitmap(this.f12450a);
    }
}
