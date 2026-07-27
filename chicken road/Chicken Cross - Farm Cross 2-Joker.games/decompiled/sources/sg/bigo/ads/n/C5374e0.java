package sg.bigo.ads.n;

import android.graphics.Bitmap;
import android.webkit.ValueCallback;
import java.util.HashSet;
import java.util.Set;
import sg.bigo.ads.api.MediaView;

/* renamed from: sg.bigo.ads.n.e0, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C5374e0 implements ValueCallback {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Set f13166a;
    public final /* synthetic */ U0 b;

    public C5374e0(U0 u0, HashSet hashSet) {
        this.b = u0;
        this.f13166a = hashSet;
    }

    @Override // android.webkit.ValueCallback
    public final void onReceiveValue(Object obj) {
        Bitmap bitmap = (Bitmap) obj;
        if (bitmap == null) {
            synchronized (this.b.L) {
                this.b.L.addAll(this.f13166a);
            }
            return;
        }
        for (sg.bigo.ads.v.u uVar : this.f13166a) {
            if (uVar instanceof sg.bigo.ads.v.f) {
                sg.bigo.ads.v.f fVar = (sg.bigo.ads.v.f) uVar;
                ((MediaView) fVar.g).post(new sg.bigo.ads.v.e(fVar, bitmap));
            } else if (uVar instanceof sg.bigo.ads.v.d) {
                ((sg.bigo.ads.v.d) uVar).b(bitmap);
            }
        }
    }
}
