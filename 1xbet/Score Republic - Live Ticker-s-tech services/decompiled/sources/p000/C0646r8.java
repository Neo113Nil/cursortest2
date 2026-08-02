package p000;

/* JADX INFO: renamed from: r8 */
/* JADX INFO: compiled from: r8-map-id-738170b7fb69b873ed7524d5270c8e05c6f5fb40ea1ade7a72c8ed7a70699269 */
/* JADX INFO: loaded from: classes.dex */
public final class C0646r8 implements dy0 {

    /* JADX INFO: renamed from: b */
    public final int f6728b;

    public C0646r8(int i) {
        this.f6728b = i;
    }

    @Override // java.lang.annotation.Annotation
    public final Class annotationType() {
        return dy0.class;
    }

    @Override // java.lang.annotation.Annotation
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof dy0)) {
            return false;
        }
        dy0 dy0Var = (dy0) obj;
        return this.f6728b == dy0Var.tag() && cy0.f1489j.equals(dy0Var.intEncoding());
    }

    @Override // java.lang.annotation.Annotation
    public final int hashCode() {
        return (this.f6728b ^ 14552422) + (cy0.f1489j.hashCode() ^ 2041407134);
    }

    @Override // p000.dy0
    public final cy0 intEncoding() {
        return cy0.f1489j;
    }

    @Override // p000.dy0
    public final int tag() {
        return this.f6728b;
    }

    @Override // java.lang.annotation.Annotation
    public final String toString() {
        return "@com.google.firebase.encoders.proto.Protobuf(tag=" + this.f6728b + "intEncoding=" + cy0.f1489j + ')';
    }
}
