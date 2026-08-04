package p031e1;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import p023d1.n;
import p023d1.o;
import p097n3.a;

/* JADX INFO: loaded from: classes.dex */
public final class e extends a {

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static final String f12527l = n.g("WorkContinuationImpl");

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final l f12528g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final List f12529h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final ArrayList f12530i;
    public final ArrayList j = new ArrayList();

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public boolean f12531k;

    public e(l lVar, List list) {
        this.f12528g = lVar;
        this.f12529h = list;
        this.f12530i = new ArrayList(list.size());
        for (int i7 = 0; i7 < list.size(); i7++) {
            String string = ((o) list.get(i7)).f12372a.toString();
            this.f12530i.add(string);
            this.j.add(string);
        }
    }

    public static boolean h0(e eVar, HashSet hashSet) {
        hashSet.addAll(eVar.f12530i);
        HashSet hashSetI0 = i0(eVar);
        Iterator it = hashSet.iterator();
        while (it.hasNext()) {
            if (hashSetI0.contains((String) it.next())) {
                return true;
            }
        }
        hashSet.removeAll(eVar.f12530i);
        return false;
    }

    public static HashSet i0(e eVar) {
        HashSet hashSet = new HashSet();
        eVar.getClass();
        return hashSet;
    }
}
