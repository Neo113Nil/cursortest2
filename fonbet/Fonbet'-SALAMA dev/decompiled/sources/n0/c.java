package n0;

import B3.g;
import androidx.lifecycle.S;
import e3.C1018c;
import r.m;
import w1.C1718l0;

/* loaded from: classes.dex */
public class c extends S {

    /* renamed from: f, reason: collision with root package name */
    public static final C1718l0 f15290f = new C1718l0(19);

    /* renamed from: d, reason: collision with root package name */
    public final m f15291d = new m();

    /* renamed from: e, reason: collision with root package name */
    public boolean f15292e = false;

    @Override // androidx.lifecycle.S
    public final void b() {
        m mVar = this.f15291d;
        int i7 = mVar.f16011c;
        for (int i8 = 0; i8 < i7; i8++) {
            b bVar = (b) mVar.f16010b[i8];
            C1018c c1018c = bVar.f15287l;
            c1018c.a();
            c1018c.f12654c = true;
            g gVar = bVar.f15289n;
            if (gVar != null) {
                bVar.h(gVar);
            }
            b bVar2 = c1018c.f12652a;
            if (bVar2 == null) {
                throw new IllegalStateException("No listener register");
            }
            if (bVar2 != bVar) {
                throw new IllegalArgumentException("Attempting to unregister the wrong listener");
            }
            c1018c.f12652a = null;
            if (gVar != null) {
                boolean z4 = gVar.f1063b;
            }
            c1018c.f12655d = true;
            c1018c.f12653b = false;
            c1018c.f12654c = false;
            c1018c.f12656e = false;
        }
        int i9 = mVar.f16011c;
        Object[] objArr = mVar.f16010b;
        for (int i10 = 0; i10 < i9; i10++) {
            objArr[i10] = null;
        }
        mVar.f16011c = 0;
    }
}
