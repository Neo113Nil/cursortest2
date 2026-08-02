package B;

import P.C0305m0;
import P.Z;
import P.d1;
import a.AbstractC0444a;
import l4.C2062d;

/* loaded from: classes.dex */
public final class v implements d1 {

    /* renamed from: k, reason: collision with root package name */
    public final C0305m0 f716k;

    /* renamed from: l, reason: collision with root package name */
    public int f717l;

    public v(int i) {
        int i5 = (i / 30) * 30;
        this.f716k = new C0305m0(AbstractC0444a.f0(Math.max(i5 - 100, 0), i5 + 130), Z.f4434p);
        this.f717l = i;
    }

    @Override // P.d1
    public final Object getValue() {
        return (C2062d) this.f716k.getValue();
    }
}
