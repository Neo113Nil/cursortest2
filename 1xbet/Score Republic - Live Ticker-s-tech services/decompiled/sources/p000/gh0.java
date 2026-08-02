package p000;

import android.text.TextUtils;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-738170b7fb69b873ed7524d5270c8e05c6f5fb40ea1ade7a72c8ed7a70699269 */
/* JADX INFO: loaded from: classes.dex */
public final class gh0 implements sa0 {

    /* JADX INFO: renamed from: b */
    public final Map f2736b;

    /* JADX INFO: renamed from: c */
    public volatile Map f2737c;

    public gh0(Map map) {
        this.f2736b = Collections.unmodifiableMap(map);
    }

    @Override // p000.sa0
    /* JADX INFO: renamed from: a */
    public final Map mo2054a() {
        if (this.f2737c == null) {
            synchronized (this) {
                try {
                    if (this.f2737c == null) {
                        this.f2737c = Collections.unmodifiableMap(m2055b());
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return this.f2737c;
    }

    /* JADX INFO: renamed from: b */
    public final HashMap m2055b() {
        HashMap map = new HashMap();
        for (Map.Entry entry : this.f2736b.entrySet()) {
            List list = (List) entry.getValue();
            StringBuilder sb = new StringBuilder();
            int size = list.size();
            for (int i = 0; i < size; i++) {
                String str = ((fh0) list.get(i)).f2407a;
                if (!TextUtils.isEmpty(str)) {
                    sb.append(str);
                    if (i != list.size() - 1) {
                        sb.append(',');
                    }
                }
            }
            String string = sb.toString();
            if (!TextUtils.isEmpty(string)) {
                map.put((String) entry.getKey(), string);
            }
        }
        return map;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof gh0) {
            return this.f2736b.equals(((gh0) obj).f2736b);
        }
        return false;
    }

    public final int hashCode() {
        return this.f2736b.hashCode();
    }

    public final String toString() {
        return "LazyHeaders{headers=" + this.f2736b + '}';
    }
}
