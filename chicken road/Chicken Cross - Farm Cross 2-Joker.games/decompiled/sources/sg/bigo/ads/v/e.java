package sg.bigo.ads.v;

import android.graphics.Bitmap;

/* loaded from: classes3.dex */
public final class e implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Bitmap f13346a;
    public final /* synthetic */ f b;

    public e(f fVar, Bitmap bitmap) {
        this.b = fVar;
        this.f13346a = bitmap;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.b.a(this.f13346a);
    }
}
