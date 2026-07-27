package sg.bigo.ads.h;

import android.graphics.Bitmap;

/* renamed from: sg.bigo.ads.h.w0, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C5217w0 implements sg.bigo.ads.s0.z {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ sg.bigo.ads.P.c f12937a;
    public final /* synthetic */ String b;
    public final /* synthetic */ Y0 c;

    public C5217w0(Y0 y0, sg.bigo.ads.P.c cVar, String str) {
        this.c = y0;
        this.f12937a = cVar;
        this.b = str;
    }

    @Override // sg.bigo.ads.s0.z
    public final void a(int i, String str, sg.bigo.ads.s0.y yVar) {
        this.c.L.a(this.f12937a, 4, this.b, -1, i, str);
    }

    @Override // sg.bigo.ads.s0.z
    public final void a(Bitmap bitmap, sg.bigo.ads.s0.y yVar) {
        this.c.L.a(4, -1, this.b, this.f12937a);
    }
}
