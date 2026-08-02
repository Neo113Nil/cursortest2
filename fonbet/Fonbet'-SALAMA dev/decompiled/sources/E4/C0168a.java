package E4;

import Y4.I0;
import java.util.Iterator;

/* renamed from: E4.a, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C0168a extends C0177j {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f2165d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C0168a(H4.j jVar, EnumC0176i enumC0176i, I0 i02, int i7) {
        super(jVar, enumC0176i, i02);
        this.f2165d = i7;
    }

    @Override // E4.C0177j, E4.AbstractC0178k
    public final boolean d(H4.k kVar) {
        I0 f7;
        switch (this.f2165d) {
            case 0:
                I0 f8 = kVar.f3327e.f(this.f2201c);
                if (H4.o.f(f8)) {
                    Iterator it = f8.G().a().iterator();
                    while (it.hasNext()) {
                        if (H4.o.d(this.f2200b.G(), (I0) it.next())) {
                            break;
                        }
                    }
                    break;
                }
                break;
            case 1:
                I0 f9 = kVar.f3327e.f(this.f2201c);
                if (!H4.o.f(f9) || !H4.o.d(f9.G(), this.f2200b)) {
                }
                break;
            default:
                I0 i02 = this.f2200b;
                if (!H4.o.d(i02.G(), H4.o.f3335b) && (f7 = kVar.f3327e.f(this.f2201c)) != null && !H4.o.d(i02.G(), f7)) {
                }
                break;
        }
        return false;
    }
}
