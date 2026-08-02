package d6;

import U5.C0453u;
import java.net.SocketAddress;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

/* renamed from: d6.j, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C0976j {

    /* renamed from: a, reason: collision with root package name */
    public final String[] f12437a;

    /* renamed from: b, reason: collision with root package name */
    public final int f12438b;

    public C0976j(C0453u c0453u) {
        p3.f.k(c0453u, "eag");
        List list = c0453u.f6592a;
        this.f12437a = new String[list.size()];
        Iterator it = list.iterator();
        int i7 = 0;
        while (it.hasNext()) {
            this.f12437a[i7] = ((SocketAddress) it.next()).toString();
            i7++;
        }
        Arrays.sort(this.f12437a);
        this.f12438b = Arrays.hashCode(this.f12437a);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof C0976j)) {
            return false;
        }
        C0976j c0976j = (C0976j) obj;
        if (c0976j.f12438b == this.f12438b) {
            String[] strArr = c0976j.f12437a;
            int length = strArr.length;
            String[] strArr2 = this.f12437a;
            if (length == strArr2.length) {
                return Arrays.equals(strArr, strArr2);
            }
        }
        return false;
    }

    public final int hashCode() {
        return this.f12438b;
    }

    public final String toString() {
        return Arrays.toString(this.f12437a);
    }
}
