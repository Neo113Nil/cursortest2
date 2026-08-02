package com.google.android.gms.internal.ads;

/* renamed from: com.google.android.gms.internal.ads.fd, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0981fd {

    /* renamed from: b, reason: collision with root package name */
    public static final C0981fd f13473b;

    /* renamed from: a, reason: collision with root package name */
    public final AbstractC1044gv f13474a;

    static {
        C0954ev c0954ev = AbstractC1044gv.f13676l;
        f13473b = new C0981fd(C1761wv.f16184o);
        Integer.toString(0, 36);
    }

    public C0981fd(AbstractC1044gv abstractC1044gv) {
        this.f13474a = AbstractC1044gv.l(abstractC1044gv);
    }

    public final boolean a(int i) {
        int i5 = 0;
        while (true) {
            AbstractC1044gv abstractC1044gv = this.f13474a;
            if (i5 >= abstractC1044gv.size()) {
                return false;
            }
            C0682Sc c0682Sc = (C0682Sc) abstractC1044gv.get(i5);
            boolean[] zArr = c0682Sc.f11536e;
            int length = zArr.length;
            int i6 = 0;
            while (true) {
                if (i6 >= length) {
                    break;
                }
                if (!zArr[i6]) {
                    i6++;
                } else if (c0682Sc.f11533b.f14497c == i) {
                    return true;
                }
            }
            i5++;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C0981fd.class != obj.getClass()) {
            return false;
        }
        return this.f13474a.equals(((C0981fd) obj).f13474a);
    }

    public final int hashCode() {
        return this.f13474a.hashCode();
    }
}
