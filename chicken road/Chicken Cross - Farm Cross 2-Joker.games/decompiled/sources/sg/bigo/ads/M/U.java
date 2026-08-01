package sg.bigo.ads.M;

import android.graphics.Bitmap;
import android.widget.ImageView;

/* loaded from: classes3.dex */
public final class U implements sg.bigo.ads.s0.z {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ ImageView f12438a;
    public final /* synthetic */ W b;

    public U(W w, ImageView imageView) {
        this.b = w;
        this.f12438a = imageView;
    }

    @Override // sg.bigo.ads.s0.z
    public final void a(int i, String str, sg.bigo.ads.s0.y yVar) {
    }

    @Override // sg.bigo.ads.s0.z
    public final void a(Bitmap bitmap, sg.bigo.ads.s0.y yVar) {
        if (this.b.f == 2) {
            this.f12438a.setImageBitmap(bitmap);
        }
    }
}
