package net.idrnd.face.iad.capture.internal;

/* loaded from: classes17.dex */
public final class p0 implements android.os.Parcelable {
    public static final net.idrnd.face.iad.capture.internal.o0 CREATOR = new net.idrnd.face.iad.capture.internal.o0();

    /* renamed from: a, reason: collision with root package name */
    public final net.idrnd.face.iad.capture.internal.m2 f6995a;
    public final java.lang.Integer b;

    public p0(net.idrnd.face.iad.capture.internal.m2 m2Var, java.lang.Integer num) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(m2Var, "");
        this.f6995a = m2Var;
        this.b = num;
        if (num != null && !new kotlin.ranges.IntRange(0, 100).contains(num.intValue())) {
            throw new java.lang.IllegalArgumentException("Failed requirement.".toString());
        }
        if (m2Var == net.idrnd.face.iad.capture.internal.m2.b && num != null) {
            throw new java.lang.IllegalArgumentException("If the image format is PNG then the JPEG quality should be null".toString());
        }
        if (m2Var == net.idrnd.face.iad.capture.internal.m2.f6986a && num == null) {
            throw new java.lang.IllegalArgumentException("If the image format is JPEG then the JPEG quality should be not null".toString());
        }
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof net.idrnd.face.iad.capture.internal.p0)) {
            return false;
        }
        net.idrnd.face.iad.capture.internal.p0 p0Var = (net.idrnd.face.iad.capture.internal.p0) obj;
        return this.f6995a == p0Var.f6995a && kotlin.jvm.internal.Intrinsics.areEqual(this.b, p0Var.b);
    }

    public final int hashCode() {
        int hashCode = this.f6995a.hashCode();
        java.lang.Integer num = this.b;
        return (hashCode * 31) + (num == null ? 0 : num.hashCode());
    }

    public final java.lang.String toString() {
        net.idrnd.face.iad.capture.internal.m2 m2Var = this.f6995a;
        java.lang.Integer num = this.b;
        java.lang.StringBuilder sb = new java.lang.StringBuilder("ImageParameters(format=");
        sb.append(m2Var);
        sb.append(", jpegQuality=");
        sb.append(num);
        sb.append(")");
        return sb.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(android.os.Parcel parcel, int i) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(parcel, "");
        parcel.writeSerializable(this.f6995a);
        parcel.writeValue(this.b);
    }

    public final net.idrnd.face.iad.capture.internal.m2 a() {
        return this.f6995a;
    }

    public final java.lang.Integer b() {
        return this.b;
    }
}
