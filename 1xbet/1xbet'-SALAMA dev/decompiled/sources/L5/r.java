package L5;

import A1.AbstractC0021h;
import F2.L0;
import android.os.Bundle;
import android.text.TextUtils;
import com.google.ads.mediation.admob.AdMobAdapter;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Objects;

/* JADX INFO: loaded from: classes2.dex */
public class r {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f4496a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f4497b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Boolean f4498c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final List f4499d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final Integer f4500e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final String f4501f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final Map f4502g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final String f4503h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final List f4504i;

    public r(List list, String str, Boolean bool, List list2, Integer num, String str2, Map map, String str3, List list3) {
        this.f4496a = list;
        this.f4497b = str;
        this.f4498c = bool;
        this.f4499d = list2;
        this.f4500e = num;
        this.f4501f = str2;
        this.f4502g = map;
        this.f4503h = str3;
        this.f4504i = list3;
    }

    public final p167y2.i a() {
        p167y2.h hVar = new p167y2.h(6);
        b(hVar);
        return new p167y2.i(hVar);
    }

    public final void b(AbstractC0021h abstractC0021h) {
        L0 l7 = (L0) abstractC0021h.f364a;
        List list = this.f4496a;
        if (list != null) {
            Iterator it = list.iterator();
            while (it.hasNext()) {
                ((HashSet) l7.f2592d).add((String) it.next());
            }
        }
        String str = this.f4497b;
        if (str != null) {
            com.google.android.gms.common.internal.D.f(str, "Content URL must be non-empty.");
            int length = str.length();
            Object[] objArr = {512, Integer.valueOf(str.length())};
            if (!(length <= 512)) {
                throw new IllegalArgumentException(String.format("Content URL must not exceed %d in length.  Provided length was %d.", objArr));
            }
            l7.j = str;
        }
        HashMap map = new HashMap();
        List list2 = this.f4504i;
        if (list2 != null) {
            Iterator it2 = list2.iterator();
            if (it2.hasNext()) {
                it2.next().getClass();
                throw new ClassCastException();
            }
        }
        Map map2 = this.f4502g;
        if (map2 != null && !map2.isEmpty()) {
            Bundle bundle = new Bundle();
            for (Map.Entry entry : map2.entrySet()) {
                bundle.putString((String) entry.getKey(), (String) entry.getValue());
            }
            map.put(AdMobAdapter.class, bundle);
        }
        Boolean bool = this.f4498c;
        if (bool != null && bool.booleanValue()) {
            Bundle bundle2 = (Bundle) map.get(AdMobAdapter.class);
            if (bundle2 == null) {
                bundle2 = new Bundle();
            }
            bundle2.putString("npa", "1");
            map.put(AdMobAdapter.class, bundle2);
        }
        for (Map.Entry entry2 : map.entrySet()) {
            abstractC0021h.a((Bundle) entry2.getValue(), (Class) entry2.getKey());
        }
        List<String> list3 = this.f4499d;
        if (list3 != null) {
            ArrayList arrayList = (ArrayList) l7.f2600m;
            arrayList.clear();
            for (String str2 : list3) {
                if (TextUtils.isEmpty(str2)) {
                    J2.j.g("neighboring content URL should not be null or empty");
                } else {
                    arrayList.add(str2);
                }
            }
        }
        Integer num = this.f4500e;
        if (num != null) {
            l7.f2590b = num.intValue();
        }
        l7.f2599l = this.f4503h;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof r)) {
            return false;
        }
        r rVar = (r) obj;
        return Objects.equals(this.f4496a, rVar.f4496a) && Objects.equals(this.f4497b, rVar.f4497b) && Objects.equals(this.f4498c, rVar.f4498c) && Objects.equals(this.f4499d, rVar.f4499d) && Objects.equals(this.f4500e, rVar.f4500e) && Objects.equals(this.f4501f, rVar.f4501f) && Objects.equals(this.f4502g, rVar.f4502g) && Objects.equals(this.f4504i, rVar.f4504i);
    }

    public int hashCode() {
        return Objects.hash(this.f4496a, this.f4497b, this.f4498c, this.f4499d, this.f4500e, this.f4501f, null, this.f4504i);
    }
}
