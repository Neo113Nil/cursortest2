package p000;

import java.util.List;
import java.util.Objects;

/* JADX INFO: compiled from: r8-map-id-738170b7fb69b873ed7524d5270c8e05c6f5fb40ea1ade7a72c8ed7a70699269 */
/* JADX INFO: loaded from: classes.dex */
public final class d40 {

    /* JADX INFO: renamed from: a */
    public String f1547a;

    /* JADX INFO: renamed from: b */
    public String f1548b;

    /* JADX INFO: renamed from: c */
    public List f1549c;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof d40)) {
            return false;
        }
        d40 d40Var = (d40) obj;
        return Objects.equals(this.f1547a, d40Var.f1547a) && Objects.equals(this.f1548b, d40Var.f1548b) && Objects.equals(this.f1549c, d40Var.f1549c);
    }

    public final int hashCode() {
        return Objects.hash(this.f1547a, this.f1548b, this.f1549c);
    }
}
