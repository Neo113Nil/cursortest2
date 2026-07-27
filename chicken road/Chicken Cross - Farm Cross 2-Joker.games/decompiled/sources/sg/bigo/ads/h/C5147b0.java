package sg.bigo.ads.h;

import android.graphics.Rect;

/* renamed from: sg.bigo.ads.h.b0, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C5147b0 implements InterfaceC5216w {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ AbstractC5151c0 f12873a;

    public C5147b0(AbstractC5151c0 abstractC5151c0) {
        this.f12873a = abstractC5151c0;
    }

    @Override // sg.bigo.ads.h.InterfaceC5216w
    public final void a(Rect rect) {
        this.f12873a.e.V = rect;
    }

    @Override // sg.bigo.ads.h.InterfaceC5216w
    public final void a() {
        AbstractC5151c0 abstractC5151c0 = this.f12873a;
        if (abstractC5151c0.e.c(abstractC5151c0.E())) {
            abstractC5151c0.c(true);
        }
    }
}
