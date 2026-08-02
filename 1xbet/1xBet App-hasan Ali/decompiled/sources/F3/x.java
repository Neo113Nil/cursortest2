package F3;

import a3.AbstractC0467k;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes.dex */
public abstract class x {

    /* renamed from: k, reason: collision with root package name */
    public static final t f1561k;

    /* renamed from: l, reason: collision with root package name */
    public static final u f1562l;

    /* renamed from: m, reason: collision with root package name */
    public static final /* synthetic */ x[] f1563m;

    static {
        t tVar = new t();
        f1561k = tVar;
        u uVar = new u();
        f1562l = uVar;
        f1563m = new x[]{tVar, uVar, new x() { // from class: F3.v
            public static Double b(String str, N3.a aVar) {
                try {
                    Double valueOf = Double.valueOf(str);
                    if (!valueOf.isInfinite()) {
                        if (valueOf.isNaN()) {
                        }
                        return valueOf;
                    }
                    if (aVar.f3777y != 1) {
                        throw new N3.c("JSON forbids NaN and infinities: " + valueOf + "; at path " + aVar.m(true));
                    }
                    return valueOf;
                } catch (NumberFormatException e3) {
                    StringBuilder w5 = AbstractC0467k.w("Cannot parse ", str, "; at path ");
                    w5.append(aVar.m(true));
                    throw new D2.e(w5.toString(), e3);
                }
            }

            @Override // F3.x
            public final Number a(N3.a aVar) {
                String I5 = aVar.I();
                if (I5.indexOf(46) >= 0) {
                    return b(I5, aVar);
                }
                try {
                    return Long.valueOf(Long.parseLong(I5));
                } catch (NumberFormatException unused) {
                    return b(I5, aVar);
                }
            }
        }, new x() { // from class: F3.w
            @Override // F3.x
            public final Number a(N3.a aVar) {
                String I5 = aVar.I();
                try {
                    return H3.d.i(I5);
                } catch (NumberFormatException e3) {
                    StringBuilder w5 = AbstractC0467k.w("Cannot parse ", I5, "; at path ");
                    w5.append(aVar.m(true));
                    throw new D2.e(w5.toString(), e3);
                }
            }
        }};
    }

    public static x valueOf(String str) {
        return (x) Enum.valueOf(x.class, str);
    }

    public static x[] values() {
        return (x[]) f1563m.clone();
    }

    public abstract Number a(N3.a aVar);
}
