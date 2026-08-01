package sg.bigo.ads.h;

import android.view.ViewGroup;

/* renamed from: sg.bigo.ads.h.p1, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C5197p1 implements P1 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ ViewGroup f12914a;
    public final /* synthetic */ F1 b;

    public C5197p1(F1 f1, ViewGroup viewGroup) {
        this.b = f1;
        this.f12914a = viewGroup;
    }

    @Override // sg.bigo.ads.h.P1
    public final void a() {
        Integer a2 = sg.bigo.ads.E0.p.a(this.b.j);
        if (a2 != null) {
            this.b.f.a(a2.intValue());
        }
        this.b.a(this.f12914a);
    }
}
