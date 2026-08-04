package p155w1;

import android.text.TextUtils;
import java.util.HashSet;

/* JADX INFO: loaded from: classes.dex */
public final class J1 implements K1 {

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final HashSet f17424m = new HashSet();

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final HashSet f17425n = new HashSet();

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final HashSet f17426o = new HashSet();

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final HashSet f17427p = new HashSet();

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final HashSet f17428q = new HashSet();

    @Override // p155w1.K1
    public final C1049x0 a(C2 c3) {
        boolean zEquals = c3.a().equals(D2.FLUSH_FRAME);
        HashSet hashSet = this.f17424m;
        HashSet hashSet2 = this.f17425n;
        if (zEquals) {
            return new C1049x0(1, new R1(new C0967a2(hashSet.size(), hashSet2.isEmpty()), 3), 1);
        }
        boolean zEquals2 = c3.a().equals(D2.ANALYTICS_EVENT);
        C1049x0 c1049x0 = K1.f17438a;
        if (!zEquals2) {
            return c1049x0;
        }
        Z1 z4 = (Z1) c3.f17322c;
        String str = z4.f17626c;
        int i7 = z4.f17627d;
        hashSet.add(Integer.valueOf(i7));
        int i8 = z4.f17628e;
        boolean z7 = z4.f17632z;
        boolean z8 = z4.f17631y;
        if (i8 != 2) {
            HashSet hashSet3 = this.f17428q;
            if (hashSet3.size() < 1000 || (z8 && !z7)) {
                hashSet3.add(Integer.valueOf(i7));
                return c1049x0;
            }
            hashSet2.add(Integer.valueOf(i7));
            return K1.f17442e;
        }
        if (TextUtils.isEmpty(str)) {
            hashSet2.add(Integer.valueOf(i7));
            return K1.f17440c;
        }
        boolean z9 = z8 && !z7;
        HashSet hashSet4 = this.f17427p;
        if (z9 && !hashSet4.contains(Integer.valueOf(i7))) {
            hashSet2.add(Integer.valueOf(i7));
            return K1.f17443f;
        }
        if (hashSet4.size() >= 1000 && (!z8 || z7)) {
            hashSet2.add(Integer.valueOf(i7));
            return K1.f17441d;
        }
        HashSet hashSet5 = this.f17426o;
        if (!hashSet5.contains(str) && hashSet5.size() >= 500) {
            hashSet2.add(Integer.valueOf(i7));
            return K1.f17439b;
        }
        hashSet5.add(str);
        hashSet4.add(Integer.valueOf(i7));
        return c1049x0;
    }

    @Override // p155w1.K1
    public final void a() {
        this.f17424m.clear();
        this.f17425n.clear();
        this.f17426o.clear();
        this.f17427p.clear();
        this.f17428q.clear();
    }
}
