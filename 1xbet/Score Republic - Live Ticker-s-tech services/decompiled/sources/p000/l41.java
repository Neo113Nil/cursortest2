package p000;

import java.util.Iterator;

/* JADX INFO: compiled from: r8-map-id-738170b7fb69b873ed7524d5270c8e05c6f5fb40ea1ade7a72c8ed7a70699269 */
/* JADX INFO: loaded from: classes.dex */
public final class l41 extends o41 implements Iterator {

    /* JADX INFO: renamed from: j */
    public m41 f4673j;

    /* JADX INFO: renamed from: k */
    public m41 f4674k;

    /* JADX INFO: renamed from: l */
    public final /* synthetic */ int f4675l;

    public l41(m41 m41Var, m41 m41Var2, int i) {
        this.f4675l = i;
        this.f4673j = m41Var2;
        this.f4674k = m41Var;
    }

    @Override // p000.o41
    /* JADX INFO: renamed from: a */
    public final void mo3169a(m41 m41Var) {
        m41 m41Var2;
        m41 m41VarM3170b = null;
        if (this.f4673j == m41Var && m41Var == this.f4674k) {
            this.f4674k = null;
            this.f4673j = null;
        }
        m41 m41Var3 = this.f4673j;
        if (m41Var3 == m41Var) {
            switch (this.f4675l) {
                case 0:
                    m41Var2 = m41Var3.f4975m;
                    break;
                default:
                    m41Var2 = m41Var3.f4974l;
                    break;
            }
            this.f4673j = m41Var2;
        }
        m41 m41Var4 = this.f4674k;
        if (m41Var4 == m41Var) {
            m41 m41Var5 = this.f4673j;
            if (m41Var4 != m41Var5 && m41Var5 != null) {
                m41VarM3170b = m3170b(m41Var4);
            }
            this.f4674k = m41VarM3170b;
        }
    }

    /* JADX INFO: renamed from: b */
    public final m41 m3170b(m41 m41Var) {
        switch (this.f4675l) {
            case 0:
                return m41Var.f4974l;
            default:
                return m41Var.f4975m;
        }
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.f4674k != null;
    }

    @Override // java.util.Iterator
    public final Object next() {
        m41 m41Var = this.f4674k;
        m41 m41Var2 = this.f4673j;
        this.f4674k = (m41Var == m41Var2 || m41Var2 == null) ? null : m3170b(m41Var);
        return m41Var;
    }
}
