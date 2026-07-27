package sg.bigo.ads.h;

import android.graphics.Bitmap;
import android.widget.ImageView;

/* renamed from: sg.bigo.ads.h.x1, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C5221x1 implements sg.bigo.ads.s0.z {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ F1 f12941a;

    public C5221x1(F1 f1) {
        this.f12941a = f1;
    }

    @Override // sg.bigo.ads.s0.z
    public final void a(int i, String str, sg.bigo.ads.s0.y yVar) {
    }

    @Override // sg.bigo.ads.s0.z
    public final void a(Bitmap bitmap, sg.bigo.ads.s0.y yVar) {
        ImageView imageView = this.f12941a.g;
        if (imageView != null) {
            imageView.setImageBitmap(bitmap);
        }
    }
}
