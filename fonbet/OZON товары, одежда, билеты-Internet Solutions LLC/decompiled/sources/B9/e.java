package B9;

import o9.C8659a;

/* loaded from: classes9.dex */
final class e extends i {

    /* renamed from: c, reason: collision with root package name */
    private final String f3074c;

    /* renamed from: d, reason: collision with root package name */
    private final String f3075d;

    e(C8659a c8659a, String str, String str2) {
        super(c8659a);
        this.f3074c = str2;
        this.f3075d = str;
    }

    @Override // B9.j
    public final String d() throws h9.m {
        if (c().j() != 84) {
            throw h9.m.a();
        }
        StringBuilder sb2 = new StringBuilder();
        e(8, sb2);
        i(sb2, 48, 20);
        int c11 = b().c(68, 16);
        if (c11 != 38400) {
            sb2.append('(');
            sb2.append(this.f3074c);
            sb2.append(')');
            int i11 = c11 % 32;
            int i12 = c11 / 32;
            int i13 = (i12 % 12) + 1;
            int i14 = i12 / 12;
            if (i14 / 10 == 0) {
                sb2.append('0');
            }
            sb2.append(i14);
            if (i13 / 10 == 0) {
                sb2.append('0');
            }
            sb2.append(i13);
            if (i11 / 10 == 0) {
                sb2.append('0');
            }
            sb2.append(i11);
        }
        return sb2.toString();
    }

    @Override // B9.i
    protected final void g(int i11, StringBuilder sb2) {
        sb2.append('(');
        sb2.append(this.f3075d);
        sb2.append(i11 / 100000);
        sb2.append(')');
    }

    @Override // B9.i
    protected final int h(int i11) {
        return i11 % 100000;
    }
}
