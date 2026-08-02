package net.idrnd.face.iad.capture.internal;

/* loaded from: classes17.dex */
public final class n3 extends net.idrnd.face.iad.capture.internal.o3 {

    /* renamed from: a, reason: collision with root package name */
    public final java.lang.Object f6991a;

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof net.idrnd.face.iad.capture.internal.n3) && kotlin.jvm.internal.Intrinsics.areEqual(this.f6991a, ((net.idrnd.face.iad.capture.internal.n3) obj).f6991a);
    }

    public final int hashCode() {
        java.lang.Object obj = this.f6991a;
        if (obj == null) {
            return 0;
        }
        return obj.hashCode();
    }

    public final java.lang.String toString() {
        java.lang.Object obj = this.f6991a;
        java.lang.StringBuilder sb = new java.lang.StringBuilder("Success(value=");
        sb.append(obj);
        sb.append(")");
        return sb.toString();
    }

    public n3(java.lang.Object obj) {
        super(0);
        this.f6991a = obj;
    }
}
