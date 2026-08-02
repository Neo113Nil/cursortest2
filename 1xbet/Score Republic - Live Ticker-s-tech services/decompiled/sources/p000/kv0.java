package p000;

import java.io.Serializable;

/* JADX INFO: compiled from: r8-map-id-738170b7fb69b873ed7524d5270c8e05c6f5fb40ea1ade7a72c8ed7a70699269 */
/* JADX INFO: loaded from: classes.dex */
public final class kv0 implements Serializable {

    /* JADX INFO: renamed from: j */
    public final Object f4582j;

    /* JADX INFO: renamed from: k */
    public final Object f4583k;

    public kv0(Object obj, Object obj2) {
        this.f4582j = obj;
        this.f4583k = obj2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof kv0)) {
            return false;
        }
        kv0 kv0Var = (kv0) obj;
        return af0.m187a(this.f4582j, kv0Var.f4582j) && af0.m187a(this.f4583k, kv0Var.f4583k);
    }

    public final int hashCode() {
        Object obj = this.f4582j;
        int iHashCode = (obj == null ? 0 : obj.hashCode()) * 31;
        Object obj2 = this.f4583k;
        return iHashCode + (obj2 != null ? obj2.hashCode() : 0);
    }

    public final String toString() {
        return "(" + this.f4582j + ", " + this.f4583k + ')';
    }
}
