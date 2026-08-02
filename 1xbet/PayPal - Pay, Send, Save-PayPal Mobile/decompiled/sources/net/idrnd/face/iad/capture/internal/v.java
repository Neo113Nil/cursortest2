package net.idrnd.face.iad.capture.internal;

/* loaded from: classes17.dex */
public final class v implements android.os.Parcelable {
    public static final net.idrnd.face.iad.capture.internal.u CREATOR = new net.idrnd.face.iad.capture.internal.u();

    /* renamed from: a, reason: collision with root package name */
    public final net.idrnd.face.iad.capture.internal.t f7011a;
    public final int b;
    public final int c;
    public final int d;

    public v(net.idrnd.face.iad.capture.internal.t tVar, int i, int i2, int i3) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(tVar, "");
        this.f7011a = tVar;
        this.b = i;
        this.c = i2;
        this.d = i3;
        if (i3 < 0 || i3 >= 101) {
            throw new java.lang.IllegalArgumentException("Failed requirement.".toString());
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
        if (!(obj instanceof net.idrnd.face.iad.capture.internal.v)) {
            return false;
        }
        net.idrnd.face.iad.capture.internal.v vVar = (net.idrnd.face.iad.capture.internal.v) obj;
        return this.f7011a == vVar.f7011a && this.b == vVar.b && this.c == vVar.c && this.d == vVar.d;
    }

    public final int hashCode() {
        int hashCode = this.f7011a.hashCode();
        int hashCode2 = java.lang.Integer.hashCode(this.b);
        return java.lang.Integer.hashCode(this.d) + ((java.lang.Integer.hashCode(this.c) + ((hashCode2 + (hashCode * 31)) * 31)) * 31);
    }

    public final java.lang.String toString() {
        net.idrnd.face.iad.capture.internal.t tVar = this.f7011a;
        int i = this.b;
        int i2 = this.c;
        int i3 = this.d;
        java.lang.StringBuilder sb = new java.lang.StringBuilder("CropsParameters(format=");
        sb.append(tVar);
        sb.append(", width=");
        sb.append(i);
        sb.append(", height=");
        sb.append(i2);
        sb.append(", jpegQuality=");
        sb.append(i3);
        sb.append(")");
        return sb.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(android.os.Parcel parcel, int i) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(parcel, "");
        parcel.writeSerializable(this.f7011a);
        parcel.writeInt(this.b);
        parcel.writeInt(this.c);
        parcel.writeInt(this.d);
    }
}
