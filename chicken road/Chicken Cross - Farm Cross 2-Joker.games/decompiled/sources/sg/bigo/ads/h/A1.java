package sg.bigo.ads.h;

import android.graphics.Bitmap;
import android.widget.ImageView;

/* loaded from: classes3.dex */
public final class A1 implements sg.bigo.ads.s0.z {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ ImageView f12800a;

    public A1(ImageView imageView) {
        this.f12800a = imageView;
    }

    @Override // sg.bigo.ads.s0.z
    public final void a(int i, String str, sg.bigo.ads.s0.y yVar) {
    }

    @Override // sg.bigo.ads.s0.z
    public final void a(Bitmap bitmap, sg.bigo.ads.s0.y yVar) {
        this.f12800a.setImageBitmap(bitmap);
    }
}
