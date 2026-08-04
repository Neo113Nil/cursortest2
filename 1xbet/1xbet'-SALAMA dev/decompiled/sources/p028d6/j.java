package p028d6;

import U5.C0453u;
import java.net.SocketAddress;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import p113p3.f;

/* JADX INFO: loaded from: classes2.dex */
public final class j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String[] f12443a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f12444b;

    public j(C0453u c0453u) {
        f.k(c0453u, "eag");
        List list = c0453u.f6592a;
        this.f12443a = new String[list.size()];
        Iterator it = list.iterator();
        int i7 = 0;
        while (it.hasNext()) {
            this.f12443a[i7] = ((SocketAddress) it.next()).toString();
            i7++;
        }
        Arrays.sort(this.f12443a);
        this.f12444b = Arrays.hashCode(this.f12443a);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof j)) {
            return false;
        }
        j jVar = (j) obj;
        if (jVar.f12444b == this.f12444b) {
            String[] strArr = jVar.f12443a;
            int length = strArr.length;
            String[] strArr2 = this.f12443a;
            if (length == strArr2.length) {
                return Arrays.equals(strArr, strArr2);
            }
        }
        return false;
    }

    public final int hashCode() {
        return this.f12444b;
    }

    public final String toString() {
        return Arrays.toString(this.f12443a);
    }
}
