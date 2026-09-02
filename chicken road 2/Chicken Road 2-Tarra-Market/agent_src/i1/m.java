package i1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

/* loaded from: classes.dex */
public final class m {

    /* renamed from: a, reason: collision with root package name */
    public final String[] f1366a;

    public m(l lVar) {
        ArrayList arrayList = lVar.f1365a;
        this.f1366a = (String[]) arrayList.toArray(new String[arrayList.size()]);
    }

    public final String a(String str) {
        String[] strArr = this.f1366a;
        for (int length = strArr.length - 2; length >= 0; length -= 2) {
            if (str.equalsIgnoreCase(strArr[length])) {
                return strArr[length + 1];
            }
        }
        return null;
    }

    public final String b(int i2) {
        return this.f1366a[i2 * 2];
    }

    public final l c() {
        l lVar = new l(0);
        Collections.addAll(lVar.f1365a, this.f1366a);
        return lVar;
    }

    public final int d() {
        return this.f1366a.length / 2;
    }

    public final String e(int i2) {
        return this.f1366a[(i2 * 2) + 1];
    }

    public final boolean equals(Object obj) {
        return (obj instanceof m) && Arrays.equals(((m) obj).f1366a, this.f1366a);
    }

    public final int hashCode() {
        return Arrays.hashCode(this.f1366a);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        int d2 = d();
        for (int i2 = 0; i2 < d2; i2++) {
            sb.append(b(i2));
            sb.append(": ");
            sb.append(e(i2));
            sb.append("\n");
        }
        return sb.toString();
    }
}
