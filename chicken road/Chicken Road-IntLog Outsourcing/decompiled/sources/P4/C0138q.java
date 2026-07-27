package P4;

import b2.AbstractC0279e;
import u1.AbstractC1477a;

/* renamed from: P4.q, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0138q implements M4.a {

    /* renamed from: a, reason: collision with root package name */
    public static final C0138q f2390a = new C0138q();

    /* renamed from: b, reason: collision with root package name */
    public static final N f2391b = new N("kotlin.time.Duration", N4.c.f2173j);

    @Override // M4.a
    public final Object a(O4.b decoder) {
        kotlin.jvm.internal.i.e(decoder, "decoder");
        int i2 = C4.a.f392d;
        String value = decoder.u();
        kotlin.jvm.internal.i.e(value, "value");
        try {
            return new C4.a(AbstractC1477a.a(value));
        } catch (IllegalArgumentException e3) {
            throw new IllegalArgumentException(AbstractC0279e.f("Invalid ISO duration string format: '", value, "'."), e3);
        }
    }

    @Override // M4.a
    public final void b(R4.s sVar, Object obj) {
        long j2;
        long j6 = ((C4.a) obj).f393a;
        int i2 = C4.a.f392d;
        StringBuilder sb = new StringBuilder();
        if (j6 < 0) {
            sb.append('-');
        }
        sb.append("PT");
        boolean z = true;
        if (j6 < 0) {
            j2 = ((-(j6 >> 1)) << 1) + (((int) j6) & 1);
            int i3 = C4.b.f394a;
        } else {
            j2 = j6;
        }
        long f3 = C4.a.f(j2, C4.c.f399f);
        int f6 = C4.a.d(j2) ? 0 : (int) (C4.a.f(j2, C4.c.f398e) % 60);
        int f7 = C4.a.d(j2) ? 0 : (int) (C4.a.f(j2, C4.c.f397d) % 60);
        int c2 = C4.a.c(j2);
        if (C4.a.d(j6)) {
            f3 = 9999999999999L;
        }
        boolean z5 = f3 != 0;
        boolean z6 = (f7 == 0 && c2 == 0) ? false : true;
        if (f6 == 0 && (!z6 || !z5)) {
            z = false;
        }
        if (z5) {
            sb.append(f3);
            sb.append('H');
        }
        if (z) {
            sb.append(f6);
            sb.append('M');
        }
        if (z6 || (!z5 && !z)) {
            C4.a.b(sb, f7, c2, 9, "S", true);
        }
        sVar.o(sb.toString());
    }

    @Override // M4.a
    public final N4.e c() {
        return f2391b;
    }
}
