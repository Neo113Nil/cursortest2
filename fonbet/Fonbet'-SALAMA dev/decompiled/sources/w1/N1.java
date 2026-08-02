package w1;

import android.text.TextUtils;
import java.util.HashSet;

/* loaded from: classes.dex */
public final class N1 implements K1 {

    /* renamed from: m, reason: collision with root package name */
    public final HashSet f17474m = new HashSet();

    /* renamed from: n, reason: collision with root package name */
    public int f17475n = 0;

    @Override // w1.K1
    public final C1758x0 a(C2 c22) {
        boolean equals = c22.a().equals(D2.USER_PROPERTY);
        C1758x0 c1758x0 = K1.f17432a;
        if (!equals) {
            return c1758x0;
        }
        String str = ((B2) c22.f17316c).f17294e;
        if (TextUtils.isEmpty(str)) {
            return K1.j;
        }
        int i7 = this.f17475n;
        this.f17475n = i7 + 1;
        if (i7 >= 200) {
            return K1.f17441k;
        }
        HashSet hashSet = this.f17474m;
        if (!hashSet.contains(str) && hashSet.size() >= 100) {
            return K1.f17442l;
        }
        hashSet.add(str);
        return c1758x0;
    }

    @Override // w1.K1
    public final void a() {
        this.f17474m.clear();
        this.f17475n = 0;
    }
}
