package com.tekartik.sqflite;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/* loaded from: classes4.dex */
public final class v {
    public final String a;
    public final List<Object> b;

    public v(String str, List<Object> list) {
        this.a = str;
        this.b = list == null ? new ArrayList<>() : list;
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
        for (int i = 0; i < list.size(); i++) {
            bArr[i] = (byte) ((Integer) list.get(i)).intValue();
        }
        return bArr;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof v)) {
            return false;
        }
        v vVar = (v) obj;
        String str = this.a;
        if (str != null) {
            if (!str.equals(vVar.a)) {
                return false;
            }
        } else if (vVar.a != null) {
            return false;
        }
        List<Object> list = this.b;
        int size = list.size();
        List<Object> list2 = vVar.b;
        List<Object> list3 = vVar.b;
        if (size != list2.size()) {
            return false;
        }
        for (int i = 0; i < list.size(); i++) {
            if ((list.get(i) instanceof byte[]) && (list3.get(i) instanceof byte[])) {
                if (!Arrays.equals((byte[]) list.get(i), (byte[]) list3.get(i))) {
                    return false;
                }
            } else if (!list.get(i).equals(list3.get(i))) {
                return false;
            }
        }
        return true;
    }

    public final int hashCode() {
        String str = this.a;
        if (str != null) {
            return str.hashCode();
        }
        return 0;
    }

    public final String toString() {
        String str;
        StringBuilder sb = new StringBuilder();
        sb.append(this.a);
        List<Object> list = this.b;
        if (list == null || list.isEmpty()) {
            str = "";
        } else {
            str = " " + list;
        }
        sb.append(str);
        return sb.toString();
    }
}
