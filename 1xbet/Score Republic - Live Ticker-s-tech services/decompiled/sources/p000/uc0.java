package p000;

import java.util.Collections;
import java.util.Comparator;
import java.util.NavigableSet;
import java.util.SortedSet;

/* JADX INFO: compiled from: r8-map-id-738170b7fb69b873ed7524d5270c8e05c6f5fb40ea1ade7a72c8ed7a70699269 */
/* JADX INFO: loaded from: classes.dex */
public abstract class uc0 extends sc0 implements NavigableSet, Iterable {

    /* JADX INFO: renamed from: o */
    public static final /* synthetic */ int f7792o = 0;

    /* JADX INFO: renamed from: m */
    public final transient Comparator f7793m;

    /* JADX INFO: renamed from: n */
    public transient uc0 f7794n;

    public uc0(Comparator comparator) {
        this.f7793m = comparator;
    }

    @Override // java.util.SortedSet
    public final Comparator comparator() {
        return this.f7793m;
    }

    @Override // java.util.NavigableSet
    public final NavigableSet descendingSet() {
        uc0 x01Var = this.f7794n;
        if (x01Var == null) {
            x01 x01Var2 = (x01) this;
            Comparator comparatorReverseOrder = Collections.reverseOrder(x01Var2.f7793m);
            if (x01Var2.isEmpty()) {
                x01Var = ir0.f3639j != comparatorReverseOrder ? new x01(q01.f6303n, comparatorReverseOrder) : x01.f8733q;
            } else {
                x01Var = new x01(x01Var2.f8734p.mo3680s(), comparatorReverseOrder);
            }
            this.f7794n = x01Var;
            x01Var.f7794n = this;
        }
        return x01Var;
    }

    @Override // java.util.NavigableSet
    public final NavigableSet headSet(Object obj, boolean z) {
        obj.getClass();
        x01 x01Var = (x01) this;
        return x01Var.m5492s(0, x01Var.m5493t(obj, z));
    }

    @Override // java.util.NavigableSet
    public final Object pollFirst() {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.NavigableSet
    public final Object pollLast() {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.NavigableSet
    /* JADX INFO: renamed from: r, reason: merged with bridge method [inline-methods] */
    public final x01 subSet(Object obj, boolean z, Object obj2, boolean z2) {
        obj.getClass();
        obj2.getClass();
        a90.m123g(this.f7793m.compare(obj, obj2) <= 0);
        x01 x01Var = (x01) this;
        x01 x01VarM5492s = x01Var.m5492s(x01Var.m5494u(obj, z), x01Var.f8734p.size());
        return x01VarM5492s.m5492s(0, x01VarM5492s.m5493t(obj2, z2));
    }

    @Override // java.util.NavigableSet, java.util.SortedSet
    public final SortedSet subSet(Object obj, Object obj2) {
        return subSet(obj, true, obj2, false);
    }

    @Override // java.util.NavigableSet, java.util.SortedSet
    public final SortedSet tailSet(Object obj) {
        obj.getClass();
        x01 x01Var = (x01) this;
        return x01Var.m5492s(x01Var.m5494u(obj, true), x01Var.f8734p.size());
    }

    @Override // java.util.NavigableSet, java.util.SortedSet
    public final SortedSet headSet(Object obj) {
        obj.getClass();
        x01 x01Var = (x01) this;
        return x01Var.m5492s(0, x01Var.m5493t(obj, false));
    }

    @Override // java.util.NavigableSet
    public final NavigableSet tailSet(Object obj, boolean z) {
        obj.getClass();
        x01 x01Var = (x01) this;
        return x01Var.m5492s(x01Var.m5494u(obj, z), x01Var.f8734p.size());
    }
}
