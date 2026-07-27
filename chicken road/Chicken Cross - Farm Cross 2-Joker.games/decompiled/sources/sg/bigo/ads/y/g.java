package sg.bigo.ads.y;

import android.graphics.Bitmap;

/* loaded from: classes3.dex */
public final class g implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Bitmap f13413a;
    public final /* synthetic */ h b;

    public g(h hVar, Bitmap bitmap) {
        this.b = hVar;
        this.f13413a = bitmap;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.b.f13414a.n.setImageBitmap(this.f13413a);
    }
}
