package w1;

import android.text.TextUtils;
import java.util.HashSet;

/* loaded from: classes.dex */
public final class J1 implements K1 {

    /* renamed from: m, reason: collision with root package name */
    public final HashSet f17418m = new HashSet();

    /* renamed from: n, reason: collision with root package name */
    public final HashSet f17419n = new HashSet();

    /* renamed from: o, reason: collision with root package name */
    public final HashSet f17420o = new HashSet();

    /* renamed from: p, reason: collision with root package name */
    public final HashSet f17421p = new HashSet();

    /* renamed from: q, reason: collision with root package name */
    public final HashSet f17422q = new HashSet();

    @Override // w1.K1
    public final C1758x0 a(C2 c22) {
        boolean equals = c22.a().equals(D2.FLUSH_FRAME);
        HashSet hashSet = this.f17418m;
        HashSet hashSet2 = this.f17419n;
        if (equals) {
            return new C1758x0(1, new R1(new C1676a2(hashSet.size(), hashSet2.isEmpty()), 3), 1);
        }
        boolean equals2 = c22.a().equals(D2.ANALYTICS_EVENT);
        C1758x0 c1758x0 = K1.f17432a;
        if (!equals2) {
            return c1758x0;
        }
        Z1 z12 = (Z1) c22.f17316c;
        String str = z12.f17620c;
        int i7 = z12.f17621d;
        hashSet.add(Integer.valueOf(i7));
        int i8 = z12.f17622e;
        boolean z4 = z12.f17626z;
        boolean z7 = z12.f17625y;
        if (i8 != 2) {
            HashSet hashSet3 = this.f17422q;
            if (hashSet3.size() < 1000 || (z7 && !z4)) {
                hashSet3.add(Integer.valueOf(i7));
                return c1758x0;
            }
            hashSet2.add(Integer.valueOf(i7));
            return K1.f17436e;
        }
        if (TextUtils.isEmpty(str)) {
            hashSet2.add(Integer.valueOf(i7));
            return K1.f17434c;
        }
        boolean z8 = z7 && !z4;
        HashSet hashSet4 = this.f17421p;
        if (z8 && !hashSet4.contains(Integer.valueOf(i7))) {
            hashSet2.add(Integer.valueOf(i7));
            return K1.f17437f;
        }
        if (hashSet4.size() >= 1000 && (!z7 || z4)) {
            hashSet2.add(Integer.valueOf(i7));
            return K1.f17435d;
        }
        HashSet hashSet5 = this.f17420o;
        if (!hashSet5.contains(str) && hashSet5.size() >= 500) {
            hashSet2.add(Integer.valueOf(i7));
            return K1.f17433b;
        }
        hashSet5.add(str);
        hashSet4.add(Integer.valueOf(i7));
        return c1758x0;
    }

    @Override // w1.K1
    public final void a() {
        this.f17418m.clear();
        this.f17419n.clear();
        this.f17420o.clear();
        this.f17421p.clear();
        this.f17422q.clear();
    }
}
