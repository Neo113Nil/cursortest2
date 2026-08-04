package p064i5;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public final class l {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f14067a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final List f14068b;

    public l(String str, List list) {
        this.f14067a = str;
        this.f14068b = list == null ? new ArrayList() : list;
    }

    public static Object a(Object obj) {
        if (obj == null) {
            return null;
        }
        if (!(obj instanceof List)) {
            return obj;
        }
        List list = (List) obj;
        byte[] bArr = new byte[list.size()];
        for (int i7 = 0; i7 < list.size(); i7++) {
            bArr[i7] = (byte) ((Integer) list.get(i7)).intValue();
        }
        return bArr;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof l)) {
            return false;
        }
        l lVar = (l) obj;
        String str = this.f14067a;
        if (str != null) {
            if (!str.equals(lVar.f14067a)) {
                return false;
            }
        } else if (lVar.f14067a != null) {
            return false;
        }
        List list = this.f14068b;
        if (list.size() != lVar.f14068b.size()) {
            return false;
        }
        for (int i7 = 0; i7 < list.size(); i7++) {
            boolean z4 = list.get(i7) instanceof byte[];
            List list2 = lVar.f14068b;
            if (z4 && (list2.get(i7) instanceof byte[])) {
                if (!Arrays.equals((byte[]) list.get(i7), (byte[]) list2.get(i7))) {
                    return false;
                }
            } else if (!list.get(i7).equals(list2.get(i7))) {
                return false;
            }
        }
        return true;
    }

    public final int hashCode() {
        String str = this.f14067a;
        if (str != null) {
            return str.hashCode();
        }
        return 0;
    }

    public final String toString() {
        String str;
        StringBuilder sb = new StringBuilder();
        sb.append(this.f14067a);
        List list = this.f14068b;
        if (list == null || list.isEmpty()) {
            str = "";
        } else {
            str = " " + list;
        }
        sb.append(str);
        return sb.toString();
    }
}
