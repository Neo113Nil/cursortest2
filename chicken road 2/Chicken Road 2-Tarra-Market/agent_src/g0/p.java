package g0;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/* loaded from: classes.dex */
public final class p {

    /* renamed from: a, reason: collision with root package name */
    public final String f1134a;

    /* renamed from: b, reason: collision with root package name */
    public final List f1135b;

    public p(String str, List list) {
        this.f1134a = str;
        this.f1135b = list == null ? new ArrayList() : list;
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
        for (int i2 = 0; i2 < list.size(); i2++) {
            bArr[i2] = (byte) ((Integer) list.get(i2)).intValue();
        }
        return bArr;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof p)) {
            return false;
        }
        p pVar = (p) obj;
        String str = this.f1134a;
        if (str != null) {
            if (!str.equals(pVar.f1134a)) {
                return false;
            }
        } else if (pVar.f1134a != null) {
            return false;
        }
        List list = this.f1135b;
        if (list.size() != pVar.f1135b.size()) {
            return false;
        }
        for (int i2 = 0; i2 < list.size(); i2++) {
            boolean z2 = list.get(i2) instanceof byte[];
            List list2 = pVar.f1135b;
            if (z2 && (list2.get(i2) instanceof byte[])) {
                if (!Arrays.equals((byte[]) list.get(i2), (byte[]) list2.get(i2))) {
                    return false;
                }
            } else if (!list.get(i2).equals(list2.get(i2))) {
                return false;
            }
        }
        return true;
    }

    public final int hashCode() {
        String str = this.f1134a;
        if (str != null) {
            return str.hashCode();
        }
        return 0;
    }

    public final String toString() {
        String str;
        StringBuilder sb = new StringBuilder();
        sb.append(this.f1134a);
        List list = this.f1135b;
        if (list == null || list.isEmpty()) {
            str = "";
        } else {
            str = " " + list;
        }
        sb.append(str);
        return sb.toString();
    }
}
