package A0;

import P.C0315s;

/* loaded from: classes.dex */
public final class F0 extends kotlin.jvm.internal.m implements i4.e {

    /* renamed from: l, reason: collision with root package name */
    public static final F0 f269l = new F0(2);

    @Override // i4.e
    public final Object invoke(Object obj, Object obj2) {
        C0315s c0315s = (C0315s) obj;
        int intValue = ((Number) obj2).intValue();
        if (!c0315s.P(intValue & 1, (intValue & 3) != 2)) {
            c0315s.S();
        }
        return W3.o.f6046a;
    }
}
