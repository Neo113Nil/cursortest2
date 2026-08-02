package L5;

import F2.L0;
import android.os.Bundle;
import android.text.TextUtils;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import z2.C1815a;

/* renamed from: L5.m, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C0334m extends r {
    public final Map j;

    /* renamed from: k, reason: collision with root package name */
    public final Map f4484k;

    /* renamed from: l, reason: collision with root package name */
    public final String f4485l;

    public C0334m(List list, String str, Map map, Map map2, Boolean bool, List list2, Integer num, String str2, String str3, Map map3, String str4, List list3) {
        super(list, str, bool, list2, num, str3, map3, str4, list3);
        this.j = map;
        this.f4484k = map2;
        this.f4485l = str2;
    }

    public final z2.b c() {
        C1815a c1815a = new C1815a(6);
        b(c1815a);
        L0 l02 = (L0) c1815a.f364a;
        Map map = this.j;
        if (map != null) {
            for (Map.Entry entry : map.entrySet()) {
                String str = (String) entry.getKey();
                String str2 = (String) entry.getValue();
                if (!TextUtils.isEmpty(str2) && str2.contains(",")) {
                    J2.j.g("Value " + str2 + " contains invalid character ',' (comma). The server will parse it as a list of comma-separated values.");
                }
                ((Bundle) l02.f2596h).putString(str, str2);
            }
        }
        Map map2 = this.f4484k;
        if (map2 != null) {
            for (Map.Entry entry2 : map2.entrySet()) {
                String str3 = (String) entry2.getKey();
                List<String> list = (List) entry2.getValue();
                if (list != null) {
                    for (String str4 : list) {
                        if (!TextUtils.isEmpty(str4) && str4.contains(",")) {
                            J2.j.g("Value " + str4 + " contains invalid character ',' (comma). The server will parse it as a list of comma-separated values.");
                        }
                    }
                    ((Bundle) l02.f2596h).putString(str3, TextUtils.join(",", list));
                }
            }
        }
        String str5 = this.f4485l;
        if (str5 != null) {
            l02.f2598k = str5;
        }
        return new z2.b(c1815a);
    }

    @Override // L5.r
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C0334m)) {
            return false;
        }
        C0334m c0334m = (C0334m) obj;
        if (super.equals(obj)) {
            if (Objects.equals(this.j, c0334m.j) && Objects.equals(this.f4484k, c0334m.f4484k)) {
                return true;
            }
        }
        return false;
    }

    @Override // L5.r
    public final int hashCode() {
        return Objects.hash(Integer.valueOf(super.hashCode()), this.j, this.f4484k);
    }
}
