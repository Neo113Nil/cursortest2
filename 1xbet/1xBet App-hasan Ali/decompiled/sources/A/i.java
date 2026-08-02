package A;

import B.C0079h;
import B.K;
import P.C0315s;

/* loaded from: classes.dex */
public final class i extends kotlin.jvm.internal.m implements i4.e {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ k f52l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ int f53m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i(k kVar, int i) {
        super(2);
        this.f52l = kVar;
        this.f53m = i;
    }

    @Override // i4.e
    public final Object invoke(Object obj, Object obj2) {
        C0315s c0315s = (C0315s) obj;
        if ((((Number) obj2).intValue() & 3) == 2 && c0315s.B()) {
            c0315s.S();
        } else {
            k kVar = this.f52l;
            K k5 = kVar.f59b.f51a;
            int i = this.f53m;
            C0079h f = k5.f(i);
            int i5 = i - f.f675a;
            ((X.d) f.f677c.f20434n).e(kVar.f60c, Integer.valueOf(i5), c0315s, 0);
        }
        return W3.o.f6046a;
    }
}
