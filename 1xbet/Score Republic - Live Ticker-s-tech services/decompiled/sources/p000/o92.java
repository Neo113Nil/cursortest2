package p000;

import android.text.TextUtils;
import java.util.UUID;

/* JADX INFO: compiled from: r8-map-id-738170b7fb69b873ed7524d5270c8e05c6f5fb40ea1ade7a72c8ed7a70699269 */
/* JADX INFO: loaded from: classes.dex */
public final class o92 {

    /* JADX INFO: renamed from: a */
    public final q01 f5674a;

    /* JADX INFO: renamed from: b */
    public final q01 f5675b;

    /* JADX INFO: renamed from: c */
    public final UUID f5676c;

    public o92(q01 q01Var, q01 q01Var2, UUID uuid) {
        this.f5674a = q01Var;
        this.f5675b = q01Var2;
        this.f5676c = uuid;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof o92)) {
            return false;
        }
        o92 o92Var = (o92) obj;
        return this.f5674a.equals(o92Var.f5674a) && this.f5675b.equals(o92Var.f5675b) && this.f5676c.equals(o92Var.f5676c);
    }

    public final int hashCode() {
        return (this.f5676c.hashCode() ^ ((((this.f5674a.hashCode() ^ 1000003) * 1000003) ^ this.f5675b.hashCode()) * 1000003)) * 1000003;
    }

    public final String toString() {
        return TextUtils.join(" -> ", this.f5674a);
    }
}
