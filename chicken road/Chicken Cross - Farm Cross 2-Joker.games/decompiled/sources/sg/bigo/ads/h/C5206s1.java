package sg.bigo.ads.h;

import android.graphics.Bitmap;

/* renamed from: sg.bigo.ads.h.s1, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C5206s1 implements sg.bigo.ads.s0.z {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ F1 f12924a;

    public C5206s1(F1 f1) {
        this.f12924a = f1;
    }

    @Override // sg.bigo.ads.s0.z
    public final void a(int i, String str, sg.bigo.ads.s0.y yVar) {
        this.f12924a.p.set(false);
    }

    @Override // sg.bigo.ads.s0.z
    public final void a(Bitmap bitmap, sg.bigo.ads.s0.y yVar) {
        F1 f1 = this.f12924a;
        f1.n = bitmap;
        Integer a2 = sg.bigo.ads.E0.p.a(bitmap);
        f1.o = a2 != null ? a2.intValue() : 0;
        this.f12924a.p.set(false);
    }
}
