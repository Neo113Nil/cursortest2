package p000;

import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-738170b7fb69b873ed7524d5270c8e05c6f5fb40ea1ade7a72c8ed7a70699269 */
/* JADX INFO: loaded from: classes.dex */
public final class m41 implements Map.Entry {

    /* JADX INFO: renamed from: j */
    public final Object f4972j;

    /* JADX INFO: renamed from: k */
    public final Object f4973k;

    /* JADX INFO: renamed from: l */
    public m41 f4974l;

    /* JADX INFO: renamed from: m */
    public m41 f4975m;

    public m41(Object obj, Object obj2) {
        this.f4972j = obj;
        this.f4973k = obj2;
    }

    @Override // java.util.Map.Entry
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof m41)) {
            return false;
        }
        m41 m41Var = (m41) obj;
        return this.f4972j.equals(m41Var.f4972j) && this.f4973k.equals(m41Var.f4973k);
    }

    @Override // java.util.Map.Entry
    public final Object getKey() {
        return this.f4972j;
    }

    @Override // java.util.Map.Entry
    public final Object getValue() {
        return this.f4973k;
    }

    @Override // java.util.Map.Entry
    public final int hashCode() {
        return this.f4973k.hashCode() ^ this.f4972j.hashCode();
    }

    @Override // java.util.Map.Entry
    public final Object setValue(Object obj) {
        throw new UnsupportedOperationException("An entry modification is not supported");
    }

    public final String toString() {
        return this.f4972j + "=" + this.f4973k;
    }
}
