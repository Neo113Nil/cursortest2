package p000;

import java.net.SocketAddress;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-738170b7fb69b873ed7524d5270c8e05c6f5fb40ea1ade7a72c8ed7a70699269 */
/* JADX INFO: loaded from: classes.dex */
public final class rq0 {

    /* JADX INFO: renamed from: a */
    public final String[] f6942a;

    /* JADX INFO: renamed from: b */
    public final int f6943b;

    public rq0(C0190ex c0190ex) {
        a90.m127k(c0190ex, "eag");
        List list = c0190ex.f2195a;
        this.f6942a = new String[list.size()];
        Iterator it = list.iterator();
        int i = 0;
        while (it.hasNext()) {
            this.f6942a[i] = ((SocketAddress) it.next()).toString();
            i++;
        }
        Arrays.sort(this.f6942a);
        this.f6943b = Arrays.hashCode(this.f6942a);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof rq0)) {
            return false;
        }
        rq0 rq0Var = (rq0) obj;
        if (rq0Var.f6943b == this.f6943b) {
            String[] strArr = rq0Var.f6942a;
            int length = strArr.length;
            String[] strArr2 = this.f6942a;
            if (length == strArr2.length) {
                return Arrays.equals(strArr, strArr2);
            }
        }
        return false;
    }

    public final int hashCode() {
        return this.f6943b;
    }

    public final String toString() {
        return Arrays.toString(this.f6942a);
    }
}
