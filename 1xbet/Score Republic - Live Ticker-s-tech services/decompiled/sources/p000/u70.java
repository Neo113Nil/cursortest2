package p000;

import java.util.Iterator;
import java.util.NoSuchElementException;

/* JADX INFO: compiled from: r8-map-id-738170b7fb69b873ed7524d5270c8e05c6f5fb40ea1ade7a72c8ed7a70699269 */
/* JADX INFO: loaded from: classes.dex */
public final class u70 implements Iterator, sg0 {

    /* JADX INFO: renamed from: j */
    public Object f7698j;

    /* JADX INFO: renamed from: k */
    public int f7699k = -2;

    /* JADX INFO: renamed from: l */
    public final /* synthetic */ v70 f7700l;

    public u70(v70 v70Var) {
        this.f7700l = v70Var;
    }

    /* JADX INFO: renamed from: a */
    public final void m4897a() {
        Object objMo1083a;
        int i = this.f7699k;
        v70 v70Var = this.f7700l;
        if (i == -2) {
            objMo1083a = v70Var.f8124a.mo1083a();
        } else {
            ab0 ab0Var = v70Var.f8125b;
            this.f7698j.getClass();
            objMo1083a = ((C0124d3) ab0Var.f127k).mo1083a();
        }
        this.f7698j = objMo1083a;
        this.f7699k = 1;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        if (this.f7699k < 0) {
            m4897a();
        }
        return this.f7699k == 1;
    }

    @Override // java.util.Iterator
    public final Object next() {
        if (this.f7699k < 0) {
            m4897a();
        }
        if (this.f7699k == 0) {
            throw new NoSuchElementException();
        }
        Object obj = this.f7698j;
        obj.getClass();
        this.f7699k = -1;
        return obj;
    }

    @Override // java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}
