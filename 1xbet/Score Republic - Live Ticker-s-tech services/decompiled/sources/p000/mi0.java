package p000;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-738170b7fb69b873ed7524d5270c8e05c6f5fb40ea1ade7a72c8ed7a70699269 */
/* JADX INFO: loaded from: classes.dex */
public final class mi0 extends oi0 {

    /* JADX INFO: renamed from: c */
    public static final Class f5049c = Collections.unmodifiableList(Collections.EMPTY_LIST).getClass();

    /* JADX INFO: renamed from: d */
    public static List m3391d(Object obj, long j, int i) {
        List list = (List) fg1.f2399c.m1207i(obj, j);
        if (list.isEmpty()) {
            List ih0Var = list instanceof jh0 ? new ih0(i) : new ArrayList(i);
            fg1.m1790p(j, obj, ih0Var);
            return ih0Var;
        }
        if (f5049c.isAssignableFrom(list.getClass())) {
            ArrayList arrayList = new ArrayList(list.size() + i);
            arrayList.addAll(list);
            fg1.m1790p(j, obj, arrayList);
            return arrayList;
        }
        if (!(list instanceof vf1)) {
            return list;
        }
        vf1 vf1Var = (vf1) list;
        ih0 ih0Var2 = new ih0(vf1Var.size() + i);
        ih0Var2.addAll(vf1Var);
        fg1.m1790p(j, obj, ih0Var2);
        return ih0Var2;
    }

    @Override // p000.oi0
    /* JADX INFO: renamed from: a */
    public final void mo3392a(Object obj, long j) {
        Object objUnmodifiableList;
        List list = (List) fg1.f2399c.m1207i(obj, j);
        if (list instanceof jh0) {
            objUnmodifiableList = ((jh0) list).mo2638k();
        } else if (f5049c.isAssignableFrom(list.getClass())) {
            return;
        } else {
            objUnmodifiableList = Collections.unmodifiableList(list);
        }
        fg1.m1790p(j, obj, objUnmodifiableList);
    }

    @Override // p000.oi0
    /* JADX INFO: renamed from: b */
    public final void mo3393b(long j, Object obj, Object obj2) {
        List list = (List) fg1.f2399c.m1207i(obj2, j);
        List listM3391d = m3391d(obj, j, list.size());
        int size = listM3391d.size();
        int size2 = list.size();
        if (size > 0 && size2 > 0) {
            listM3391d.addAll(list);
        }
        if (size > 0) {
            list = listM3391d;
        }
        fg1.m1790p(j, obj, list);
    }

    @Override // p000.oi0
    /* JADX INFO: renamed from: c */
    public final List mo3394c(Object obj, long j) {
        return m3391d(obj, j, 10);
    }
}
