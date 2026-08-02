package net.idrnd.face.iad.capture.internal;

/* loaded from: classes17.dex */
public final class m3 extends net.idrnd.face.iad.capture.internal.o3 {

    /* renamed from: a, reason: collision with root package name */
    public final java.lang.Object f6987a;

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof net.idrnd.face.iad.capture.internal.m3) && kotlin.jvm.internal.Intrinsics.areEqual(this.f6987a, ((net.idrnd.face.iad.capture.internal.m3) obj).f6987a);
    }

    public final int hashCode() {
        java.lang.Object obj = this.f6987a;
        if (obj == null) {
            return 0;
        }
        return obj.hashCode();
    }

    public final java.lang.String toString() {
        java.lang.Object obj = this.f6987a;
        java.lang.StringBuilder sb = new java.lang.StringBuilder("Failure(error=");
        sb.append(obj);
        sb.append(")");
        return sb.toString();
    }

    public m3(java.lang.Object obj) {
        super(0);
        this.f6987a = obj;
    }
}
