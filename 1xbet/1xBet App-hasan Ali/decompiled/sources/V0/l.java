package V0;

import java.util.ArrayList;

/* loaded from: classes.dex */
public final class l {

    /* renamed from: b, reason: collision with root package name */
    public static final l f5944b = new l(0);

    /* renamed from: c, reason: collision with root package name */
    public static final l f5945c = new l(1);

    /* renamed from: d, reason: collision with root package name */
    public static final l f5946d = new l(2);

    /* renamed from: a, reason: collision with root package name */
    public final int f5947a;

    public l(int i) {
        this.f5947a = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof l) {
            return this.f5947a == ((l) obj).f5947a;
        }
        return false;
    }

    public final int hashCode() {
        return this.f5947a;
    }

    public final String toString() {
        int i = this.f5947a;
        if (i == 0) {
            return "TextDecoration.None";
        }
        ArrayList arrayList = new ArrayList();
        if ((i & 1) != 0) {
            arrayList.add("Underline");
        }
        if ((i & 2) != 0) {
            arrayList.add("LineThrough");
        }
        if (arrayList.size() != 1) {
            return L1.a.p(new StringBuilder("TextDecoration["), Y0.a.a(arrayList, ", ", null, 62), ']');
        }
        return "TextDecoration." + ((String) arrayList.get(0));
    }
}
