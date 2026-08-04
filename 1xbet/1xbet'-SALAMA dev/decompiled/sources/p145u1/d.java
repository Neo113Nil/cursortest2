package p145u1;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import p031e1.k;

/* JADX INFO: loaded from: classes.dex */
public final class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final HashMap f16598a;

    public d(String str, HashSet hashSet) {
        String string;
        HashMap mapM = k.m("gpp", str);
        if (hashSet.isEmpty()) {
            string = "";
        } else {
            StringBuilder sb = new StringBuilder();
            Iterator it = hashSet.iterator();
            while (true) {
                sb.append(it.next());
                if (!it.hasNext()) {
                    break;
                } else {
                    sb.append(',');
                }
            }
            string = sb.toString();
        }
        mapM.put("gppSid", string);
        this.f16598a = mapM;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && d.class == obj.getClass()) {
            HashMap map = this.f16598a;
            HashMap map2 = ((d) obj).f16598a;
            if (map == null ? map2 == null : map.equals(map2)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        HashMap map = this.f16598a;
        if (map != null) {
            return map.hashCode();
        }
        return 0;
    }
}
