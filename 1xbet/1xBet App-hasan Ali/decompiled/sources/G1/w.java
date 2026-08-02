package G1;

import android.os.Bundle;

/* loaded from: classes.dex */
public final class w implements Comparable {

    /* renamed from: k, reason: collision with root package name */
    public final y f1956k;

    /* renamed from: l, reason: collision with root package name */
    public final Bundle f1957l;

    /* renamed from: m, reason: collision with root package name */
    public final boolean f1958m;

    /* renamed from: n, reason: collision with root package name */
    public final int f1959n;

    /* renamed from: o, reason: collision with root package name */
    public final boolean f1960o;

    public w(y yVar, Bundle bundle, boolean z3, int i, boolean z5) {
        kotlin.jvm.internal.l.f("destination", yVar);
        this.f1956k = yVar;
        this.f1957l = bundle;
        this.f1958m = z3;
        this.f1959n = i;
        this.f1960o = z5;
    }

    @Override // java.lang.Comparable
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final int compareTo(w wVar) {
        kotlin.jvm.internal.l.f("other", wVar);
        boolean z3 = wVar.f1958m;
        boolean z5 = this.f1958m;
        if (z5 && !z3) {
            return 1;
        }
        if (!z5 && z3) {
            return -1;
        }
        int i = this.f1959n - wVar.f1959n;
        if (i > 0) {
            return 1;
        }
        if (i < 0) {
            return -1;
        }
        Bundle bundle = wVar.f1957l;
        Bundle bundle2 = this.f1957l;
        if (bundle2 != null && bundle == null) {
            return 1;
        }
        if (bundle2 == null && bundle != null) {
            return -1;
        }
        if (bundle2 != null) {
            int size = bundle2.size();
            kotlin.jvm.internal.l.c(bundle);
            int size2 = size - bundle.size();
            if (size2 > 0) {
                return 1;
            }
            if (size2 < 0) {
                return -1;
            }
        }
        boolean z6 = wVar.f1960o;
        boolean z7 = this.f1960o;
        if (!z7 || z6) {
            return (z7 || !z6) ? 0 : -1;
        }
        return 1;
    }
}
