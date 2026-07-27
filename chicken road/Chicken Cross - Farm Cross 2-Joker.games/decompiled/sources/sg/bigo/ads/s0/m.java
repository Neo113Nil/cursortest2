package sg.bigo.ads.s0;

import android.graphics.Bitmap;
import android.widget.ImageView;
import java.lang.ref.WeakReference;
import java.util.Iterator;

/* loaded from: classes3.dex */
public final class m implements z {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ WeakReference f13294a;
    public final /* synthetic */ p b;

    public m(p pVar, WeakReference weakReference) {
        this.b = pVar;
        this.f13294a = weakReference;
    }

    @Override // sg.bigo.ads.s0.z
    public final void a(int i, String str, y yVar) {
        Iterator it = this.b.c.iterator();
        while (it.hasNext()) {
            z zVar = (z) ((WeakReference) it.next()).get();
            if (zVar != null) {
                zVar.a(i, str, yVar);
            }
        }
    }

    @Override // sg.bigo.ads.s0.z
    public final void a(Bitmap bitmap, y yVar) {
        ImageView imageView = (ImageView) this.f13294a.get();
        if (imageView != null) {
            imageView.setImageBitmap(bitmap);
        }
        Iterator it = this.b.c.iterator();
        while (it.hasNext()) {
            z zVar = (z) ((WeakReference) it.next()).get();
            if (zVar != null) {
                zVar.a(bitmap, yVar);
            }
        }
    }
}
