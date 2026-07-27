package sg.bigo.ads.C;

import android.graphics.Bitmap;

/* loaded from: classes3.dex */
public final class v implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f12241a;
    public final /* synthetic */ Bitmap b;
    public final /* synthetic */ w c;

    public v(w wVar, int i, Bitmap bitmap) {
        this.c = wVar;
        this.f12241a = i;
        this.b = bitmap;
    }

    @Override // java.lang.Runnable
    public final void run() {
        try {
            if (this.f12241a == 1) {
                this.c.V = sg.bigo.ads.E0.p.a(this.b);
            } else {
                this.c.U = sg.bigo.ads.E0.p.a(this.b);
            }
        } catch (Throwable unused) {
        }
    }
}
