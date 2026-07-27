package sg.bigo.ads.M;

import android.graphics.Bitmap;
import android.widget.ImageView;

/* renamed from: sg.bigo.ads.M.a, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C4984a implements sg.bigo.ads.s0.z {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ ImageView f12440a;
    public final /* synthetic */ C4989f b;

    public C4984a(C4989f c4989f, ImageView imageView) {
        this.b = c4989f;
        this.f12440a = imageView;
    }

    @Override // sg.bigo.ads.s0.z
    public final void a(int i, String str, sg.bigo.ads.s0.y yVar) {
        sg.bigo.ads.L.r.a(this.b.c.U, new C4988e(this.f12440a));
    }

    @Override // sg.bigo.ads.s0.z
    public final void a(Bitmap bitmap, sg.bigo.ads.s0.y yVar) {
        this.f12440a.setImageBitmap(bitmap);
    }
}
