package sg.bigo.ads.n;

import android.graphics.Bitmap;
import android.webkit.ValueCallback;

/* renamed from: sg.bigo.ads.n.d0, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C5372d0 implements ValueCallback {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ boolean f13164a;
    public final /* synthetic */ sg.bigo.ads.v.d b;
    public final /* synthetic */ U0 c;

    public C5372d0(U0 u0, boolean z, sg.bigo.ads.v.d dVar) {
        this.c = u0;
        this.f13164a = z;
        this.b = dVar;
    }

    @Override // android.webkit.ValueCallback
    public final void onReceiveValue(Object obj) {
        Bitmap bitmap = (Bitmap) obj;
        if (bitmap != null) {
            if (this.f13164a) {
                synchronized (this.c.L) {
                    this.c.L.remove(this.b);
                }
            }
            this.b.b(bitmap);
        }
    }
}
