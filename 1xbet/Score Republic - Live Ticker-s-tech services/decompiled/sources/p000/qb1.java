package p000;

import java.io.Serializable;
import java.util.Arrays;

/* JADX INFO: compiled from: r8-map-id-738170b7fb69b873ed7524d5270c8e05c6f5fb40ea1ade7a72c8ed7a70699269 */
/* JADX INFO: loaded from: classes.dex */
public final class qb1 implements nb1, Serializable {

    /* JADX INFO: renamed from: j */
    public final Object f6457j;

    public qb1(Object obj) {
        this.f6457j = obj;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof qb1) {
            return AbstractC0875xf.m5649f(this.f6457j, ((qb1) obj).f6457j);
        }
        return false;
    }

    @Override // p000.nb1
    public final Object get() {
        return this.f6457j;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f6457j});
    }

    public final String toString() {
        return "Suppliers.ofInstance(" + this.f6457j + ")";
    }
}
