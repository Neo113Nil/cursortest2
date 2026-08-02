package p000;

import java.util.Iterator;

/* JADX INFO: compiled from: r8-map-id-738170b7fb69b873ed7524d5270c8e05c6f5fb40ea1ade7a72c8ed7a70699269 */
/* JADX INFO: loaded from: classes.dex */
public final class n41 extends o41 implements Iterator {

    /* JADX INFO: renamed from: j */
    public m41 f5294j;

    /* JADX INFO: renamed from: k */
    public boolean f5295k = true;

    /* JADX INFO: renamed from: l */
    public final /* synthetic */ p41 f5296l;

    public n41(p41 p41Var) {
        this.f5296l = p41Var;
    }

    @Override // p000.o41
    /* JADX INFO: renamed from: a */
    public final void mo3169a(m41 m41Var) {
        m41 m41Var2 = this.f5294j;
        if (m41Var == m41Var2) {
            m41 m41Var3 = m41Var2.f4975m;
            this.f5294j = m41Var3;
            this.f5295k = m41Var3 == null;
        }
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        if (this.f5295k) {
            return this.f5296l.f5982j != null;
        }
        m41 m41Var = this.f5294j;
        return (m41Var == null || m41Var.f4974l == null) ? false : true;
    }

    @Override // java.util.Iterator
    public final Object next() {
        if (this.f5295k) {
            this.f5295k = false;
            this.f5294j = this.f5296l.f5982j;
        } else {
            m41 m41Var = this.f5294j;
            this.f5294j = m41Var != null ? m41Var.f4974l : null;
        }
        return this.f5294j;
    }
}
