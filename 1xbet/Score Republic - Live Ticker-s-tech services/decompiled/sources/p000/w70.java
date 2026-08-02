package p000;

/* JADX INFO: compiled from: r8-map-id-738170b7fb69b873ed7524d5270c8e05c6f5fb40ea1ade7a72c8ed7a70699269 */
/* JADX INFO: loaded from: classes.dex */
public final class w70 implements Cloneable {

    /* JADX INFO: renamed from: j */
    public x80 f8450j;

    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public final w70 clone() {
        try {
            return (w70) super.clone();
        } catch (CloneNotSupportedException e) {
            dd0.m1163h(e);
            return null;
        }
    }

    /* JADX INFO: renamed from: b */
    public final boolean m5292b(Object obj) {
        if (obj instanceof w70) {
            return zg1.m5892c(this.f8450j, ((w70) obj).f8450j);
        }
        return false;
    }

    /* JADX INFO: renamed from: c */
    public final int m5293c() {
        x80 x80Var = this.f8450j;
        if (x80Var != null) {
            return x80Var.hashCode();
        }
        return 0;
    }

    public final boolean equals(Object obj) {
        return (obj instanceof w70) && m5292b(obj);
    }

    public final int hashCode() {
        return m5293c();
    }
}
