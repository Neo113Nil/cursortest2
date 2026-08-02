package p000;

import java.util.HashMap;

/* JADX INFO: compiled from: r8-map-id-738170b7fb69b873ed7524d5270c8e05c6f5fb40ea1ade7a72c8ed7a70699269 */
/* JADX INFO: loaded from: classes.dex */
public final class pm1 {

    /* JADX INFO: renamed from: d */
    public static final sc0 f6211d = sc0.m4514l(3, "_syn", "_err", "_el");

    /* JADX INFO: renamed from: a */
    public String f6212a;

    /* JADX INFO: renamed from: b */
    public final long f6213b;

    /* JADX INFO: renamed from: c */
    public final HashMap f6214c;

    public pm1(String str, long j, HashMap map) {
        this.f6212a = str;
        this.f6213b = j;
        HashMap map2 = new HashMap();
        this.f6214c = map2;
        if (map != null) {
            map2.putAll(map);
        }
    }

    /* JADX INFO: renamed from: b */
    public static Object m3970b(Object obj, Object obj2, String str) {
        if (f6211d.contains(str) && (obj2 instanceof Double)) {
            return Long.valueOf(Math.round(((Double) obj2).doubleValue()));
        }
        if (str.startsWith("_")) {
            if (!(obj instanceof String) && obj != null) {
                return obj;
            }
        } else if (!(obj instanceof Double)) {
            if (obj instanceof Long) {
                return Long.valueOf(Math.round(((Double) obj2).doubleValue()));
            }
            if (obj instanceof String) {
                return obj2.toString();
            }
        }
        return obj2;
    }

    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public final pm1 clone() {
        return new pm1(this.f6212a, this.f6213b, new HashMap(this.f6214c));
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof pm1)) {
            return false;
        }
        pm1 pm1Var = (pm1) obj;
        if (this.f6213b == pm1Var.f6213b && this.f6212a.equals(pm1Var.f6212a)) {
            return this.f6214c.equals(pm1Var.f6214c);
        }
        return false;
    }

    public final int hashCode() {
        int iHashCode = this.f6212a.hashCode() * 31;
        long j = this.f6213b;
        return this.f6214c.hashCode() + ((iHashCode + ((int) (j ^ (j >>> 32)))) * 31);
    }

    public final String toString() {
        String str = this.f6212a;
        String string = this.f6214c.toString();
        int length = String.valueOf(str).length();
        long j = this.f6213b;
        StringBuilder sb = new StringBuilder(length + 25 + String.valueOf(j).length() + 9 + string.length() + 1);
        sb.append("Event{name='");
        sb.append(str);
        sb.append("', timestamp=");
        sb.append(j);
        sb.append(", params=");
        sb.append(string);
        sb.append("}");
        return sb.toString();
    }
}
