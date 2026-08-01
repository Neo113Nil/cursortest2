package sg.bigo.ads.h;

import android.content.Context;
import android.graphics.Bitmap;
import android.widget.FrameLayout;
import android.widget.ImageView;
import sg.bigo.ads.common.view.RoundedFrameLayout;
import sg.bigo.ads.q0.AbstractC5446j;

/* loaded from: classes3.dex */
public final class C0 implements sg.bigo.ads.s0.z {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ FrameLayout f12807a;
    public final /* synthetic */ ImageView b;
    public final /* synthetic */ FrameLayout c;
    public final /* synthetic */ sg.bigo.ads.C.l d;
    public final /* synthetic */ Context e;
    public final /* synthetic */ sg.bigo.ads.P.c f;
    public final /* synthetic */ String g;
    public final /* synthetic */ Y0 h;

    public C0(Y0 y0, FrameLayout frameLayout, ImageView imageView, RoundedFrameLayout roundedFrameLayout, sg.bigo.ads.C.l lVar, Context context, sg.bigo.ads.P.c cVar, String str) {
        this.h = y0;
        this.f12807a = frameLayout;
        this.b = imageView;
        this.c = roundedFrameLayout;
        this.d = lVar;
        this.e = context;
        this.f = cVar;
        this.g = str;
    }

    @Override // sg.bigo.ads.s0.z
    public final void a(int i, String str, sg.bigo.ads.s0.y yVar) {
        Y0 y0 = this.h;
        Context context = this.e;
        sg.bigo.ads.C.l lVar = this.d;
        sg.bigo.ads.P.c cVar = this.f;
        y0.x = 2;
        AbstractC5446j.b(new G0(y0, context, lVar, cVar));
        this.h.L.a(this.f, 3, this.g, 100, i, str);
    }

    @Override // sg.bigo.ads.s0.z
    public final void a(Bitmap bitmap, sg.bigo.ads.s0.y yVar) {
        this.f12807a.post(new B0(this, bitmap.getWidth(), bitmap.getHeight()));
        this.b.setImageBitmap(bitmap);
        Y0 y0 = this.h;
        FrameLayout frameLayout = this.c;
        ImageView imageView = this.b;
        sg.bigo.ads.C.l lVar = this.d;
        T0 t0 = y0.J;
        t0.a(lVar, frameLayout, imageView, 5, T0.a(t0, lVar, t0.c ? lVar : t0.r));
        Y0 y02 = this.h;
        FrameLayout frameLayout2 = this.c;
        sg.bigo.ads.C.l lVar2 = this.d;
        T0 t02 = y02.J;
        t02.a(lVar2, frameLayout2, frameLayout2, 18, T0.a(t02, lVar2, t02.d ? lVar2 : t02.r));
        this.h.a(3, false);
        this.h.L.a(3, 100, this.g, this.f);
    }
}
