package sg.bigo.ads.M;

import android.graphics.Bitmap;
import android.widget.ImageView;

/* renamed from: sg.bigo.ads.M.l, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C4995l implements sg.bigo.ads.s0.z {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ ImageView f12449a;
    public final /* synthetic */ sg.bigo.ads.C.l b;
    public final /* synthetic */ C5002t c;

    public C4995l(C5002t c5002t, ImageView imageView, sg.bigo.ads.C.l lVar) {
        this.c = c5002t;
        this.f12449a = imageView;
        this.b = lVar;
    }

    @Override // sg.bigo.ads.s0.z
    public final void a(int i, String str, sg.bigo.ads.s0.y yVar) {
        if (this.c.l == 2) {
            sg.bigo.ads.L.r.a(this.b, new C4998o(this.f12449a));
        }
    }

    @Override // sg.bigo.ads.s0.z
    public final void a(Bitmap bitmap, sg.bigo.ads.s0.y yVar) {
        if (this.c.l == 2) {
            this.f12449a.setImageBitmap(bitmap);
        }
    }
}
