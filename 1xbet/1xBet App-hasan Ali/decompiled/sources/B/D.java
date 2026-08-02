package B;

import n.AbstractC2107A;
import p4.AbstractC2282w;

/* loaded from: classes.dex */
public final class D extends kotlin.jvm.internal.m implements i4.c {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ int f613l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ F f614m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ D(F f, int i) {
        super(1);
        this.f613l = i;
        this.f614m = f;
    }

    @Override // i4.c
    public final Object c(Object obj) {
        switch (this.f613l) {
            case 0:
                A.k kVar = (A.k) this.f614m.f623y.invoke();
                int c5 = kVar.c();
                int i = 0;
                while (true) {
                    if (i >= c5) {
                        i = -1;
                    } else if (!kVar.d(i).equals(obj)) {
                        i++;
                    }
                }
                return Integer.valueOf(i);
            default:
                int intValue = ((Number) obj).intValue();
                F f = this.f614m;
                A.k kVar2 = (A.k) f.f623y.invoke();
                if (intValue >= 0 && intValue < kVar2.c()) {
                    AbstractC2282w.p(f.k0(), null, new E(f, intValue, null), 3);
                    return Boolean.TRUE;
                }
                StringBuilder v4 = AbstractC2107A.v(intValue, "Can't scroll to index ", ", it is out of bounds [0, ");
                v4.append(kVar2.c());
                v4.append(')');
                throw new IllegalArgumentException(v4.toString().toString());
        }
    }
}
