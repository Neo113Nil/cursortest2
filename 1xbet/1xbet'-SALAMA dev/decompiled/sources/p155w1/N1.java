package p155w1;

import android.text.TextUtils;
import java.util.HashSet;

/* JADX INFO: loaded from: classes.dex */
public final class N1 implements K1 {

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final HashSet f17480m = new HashSet();

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public int f17481n = 0;

    @Override // p155w1.K1
    public final C1049x0 a(C2 c3) {
        boolean zEquals = c3.a().equals(D2.USER_PROPERTY);
        C1049x0 c1049x0 = K1.f17438a;
        if (!zEquals) {
            return c1049x0;
        }
        String str = ((B2) c3.f17322c).f17300e;
        if (TextUtils.isEmpty(str)) {
            return K1.j;
        }
        int i7 = this.f17481n;
        this.f17481n = i7 + 1;
        if (i7 >= 200) {
            return K1.f17447k;
        }
        HashSet hashSet = this.f17480m;
        if (!hashSet.contains(str) && hashSet.size() >= 100) {
            return K1.f17448l;
        }
        hashSet.add(str);
        return c1049x0;
    }

    @Override // p155w1.K1
    public final void a() {
        this.f17480m.clear();
        this.f17481n = 0;
    }
}
