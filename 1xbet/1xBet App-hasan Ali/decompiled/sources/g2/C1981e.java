package g2;

import f2.n;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import r3.AbstractC2349a;

/* renamed from: g2.e, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1981e extends AbstractC2349a {

    /* renamed from: s, reason: collision with root package name */
    public static final String f17107s = f2.m.f("WorkContinuationImpl");

    /* renamed from: n, reason: collision with root package name */
    public final l f17108n;

    /* renamed from: o, reason: collision with root package name */
    public final List f17109o;

    /* renamed from: p, reason: collision with root package name */
    public final ArrayList f17110p;

    /* renamed from: q, reason: collision with root package name */
    public final ArrayList f17111q = new ArrayList();

    /* renamed from: r, reason: collision with root package name */
    public boolean f17112r;

    public C1981e(l lVar, List list) {
        this.f17108n = lVar;
        this.f17109o = list;
        this.f17110p = new ArrayList(list.size());
        for (int i = 0; i < list.size(); i++) {
            String uuid = ((n) list.get(i)).f17004a.toString();
            this.f17110p.add(uuid);
            this.f17111q.add(uuid);
        }
    }

    public static boolean Q(C1981e c1981e, HashSet hashSet) {
        hashSet.addAll(c1981e.f17110p);
        HashSet R4 = R(c1981e);
        Iterator it = hashSet.iterator();
        while (it.hasNext()) {
            if (R4.contains((String) it.next())) {
                return true;
            }
        }
        hashSet.removeAll(c1981e.f17110p);
        return false;
    }

    public static HashSet R(C1981e c1981e) {
        HashSet hashSet = new HashSet();
        c1981e.getClass();
        return hashSet;
    }
}
