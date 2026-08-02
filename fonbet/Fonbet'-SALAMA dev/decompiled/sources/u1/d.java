package u1;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;

/* loaded from: classes.dex */
public final class d {

    /* renamed from: a, reason: collision with root package name */
    public final HashMap f16592a;

    public d(String str, HashSet hashSet) {
        String sb;
        HashMap m7 = e1.k.m("gpp", str);
        if (hashSet.isEmpty()) {
            sb = "";
        } else {
            StringBuilder sb2 = new StringBuilder();
            Iterator it = hashSet.iterator();
            while (true) {
                sb2.append(it.next());
                if (!it.hasNext()) {
                    break;
                } else {
                    sb2.append(',');
                }
            }
            sb = sb2.toString();
        }
        m7.put("gppSid", sb);
        this.f16592a = m7;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && d.class == obj.getClass()) {
            HashMap hashMap = this.f16592a;
            HashMap hashMap2 = ((d) obj).f16592a;
            if (hashMap == null ? hashMap2 == null : hashMap.equals(hashMap2)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        HashMap hashMap = this.f16592a;
        if (hashMap != null) {
            return hashMap.hashCode();
        }
        return 0;
    }
}
