package sg.bigo.ads.n;

import android.graphics.Bitmap;
import android.webkit.ValueCallback;
import sg.bigo.ads.api.MediaView;

/* renamed from: sg.bigo.ads.n.c0, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C5370c0 implements ValueCallback {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ boolean f13162a;
    public final /* synthetic */ U0 b;

    public C5370c0(U0 u0, boolean z) {
        this.b = u0;
        this.f13162a = z;
    }

    @Override // android.webkit.ValueCallback
    public final void onReceiveValue(Object obj) {
        Bitmap bitmap = (Bitmap) obj;
        if (bitmap != null) {
            if (this.f13162a) {
                synchronized (this.b.L) {
                    U0 u0 = this.b;
                    u0.L.remove(u0.J);
                }
            }
            sg.bigo.ads.v.f fVar = this.b.J;
            ((MediaView) fVar.g).post(new sg.bigo.ads.v.e(fVar, bitmap));
        }
    }
}
