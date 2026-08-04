package E4;

import Y4.I0;
import java.util.Iterator;

/* JADX INFO: renamed from: E4.a, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C0168a extends C0177j {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f2165d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C0168a(H4.j jVar, EnumC0176i enumC0176i, I0 i7, int i8) {
        super(jVar, enumC0176i, i7);
        this.f2165d = i8;
    }

    @Override // E4.C0177j, E4.AbstractC0178k
    public final boolean d(H4.k kVar) {
        I0 i0F;
        switch (this.f2165d) {
            case 0:
                I0 i0F2 = kVar.f3327e.f(this.f2201c);
                if (!H4.o.f(i0F2)) {
                    return false;
                }
                Iterator it = i0F2.G().a().iterator();
                while (it.hasNext()) {
                    if (H4.o.d(this.f2200b.G(), (I0) it.next())) {
                        return true;
                    }
                }
                return false;
            case 1:
                I0 i0F3 = kVar.f3327e.f(this.f2201c);
                return H4.o.f(i0F3) && H4.o.d(i0F3.G(), this.f2200b);
            default:
                I0 i7 = this.f2200b;
                return (H4.o.d(i7.G(), H4.o.f3335b) || (i0F = kVar.f3327e.f(this.f2201c)) == null || H4.o.d(i7.G(), i0F)) ? false : true;
        }
    }
}
