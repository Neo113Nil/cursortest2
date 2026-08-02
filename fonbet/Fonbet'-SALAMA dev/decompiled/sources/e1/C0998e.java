package e1;

import d1.n;
import d1.o;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import n3.AbstractC1464a;

/* renamed from: e1.e, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0998e extends AbstractC1464a {

    /* renamed from: l, reason: collision with root package name */
    public static final String f12521l = n.g("WorkContinuationImpl");

    /* renamed from: g, reason: collision with root package name */
    public final l f12522g;

    /* renamed from: h, reason: collision with root package name */
    public final List f12523h;

    /* renamed from: i, reason: collision with root package name */
    public final ArrayList f12524i;
    public final ArrayList j = new ArrayList();

    /* renamed from: k, reason: collision with root package name */
    public boolean f12525k;

    public C0998e(l lVar, List list) {
        this.f12522g = lVar;
        this.f12523h = list;
        this.f12524i = new ArrayList(list.size());
        for (int i7 = 0; i7 < list.size(); i7++) {
            String uuid = ((o) list.get(i7)).f12366a.toString();
            this.f12524i.add(uuid);
            this.j.add(uuid);
        }
    }

    public static boolean h0(C0998e c0998e, HashSet hashSet) {
        hashSet.addAll(c0998e.f12524i);
        HashSet i02 = i0(c0998e);
        Iterator it = hashSet.iterator();
        while (it.hasNext()) {
            if (i02.contains((String) it.next())) {
                return true;
            }
        }
        hashSet.removeAll(c0998e.f12524i);
        return false;
    }

    public static HashSet i0(C0998e c0998e) {
        HashSet hashSet = new HashSet();
        c0998e.getClass();
        return hashSet;
    }
}
