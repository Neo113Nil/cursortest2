package net.idrnd.face.iad.capture.internal;

/* loaded from: classes17.dex */
public final class b3 implements android.os.Parcelable {
    public static final net.idrnd.face.iad.capture.internal.a3 CREATOR = new net.idrnd.face.iad.capture.internal.a3();

    /* renamed from: a, reason: collision with root package name */
    public final java.util.List f6957a;
    public final net.idrnd.face.iad.capture.internal.p0 b;
    public final net.idrnd.face.iad.capture.internal.v c;

    public b3(java.util.List list, net.idrnd.face.iad.capture.internal.p0 p0Var, net.idrnd.face.iad.capture.internal.v vVar) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(list, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(p0Var, "");
        this.f6957a = list;
        this.b = p0Var;
        this.c = vVar;
        if (list.isEmpty()) {
            throw new java.lang.IllegalArgumentException("No one from the existed product supports the payload without the photo.".toString());
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
        if (!(obj instanceof net.idrnd.face.iad.capture.internal.b3)) {
            return false;
        }
        net.idrnd.face.iad.capture.internal.b3 b3Var = (net.idrnd.face.iad.capture.internal.b3) obj;
        return kotlin.jvm.internal.Intrinsics.areEqual(this.f6957a, b3Var.f6957a) && kotlin.jvm.internal.Intrinsics.areEqual(this.b, b3Var.b) && kotlin.jvm.internal.Intrinsics.areEqual(this.c, b3Var.c);
    }

    public final int hashCode() {
        int hashCode = this.f6957a.hashCode();
        int hashCode2 = this.b.hashCode();
        net.idrnd.face.iad.capture.internal.v vVar = this.c;
        return ((hashCode2 + (hashCode * 31)) * 31) + (vVar == null ? 0 : vVar.hashCode());
    }

    public final java.lang.String toString() {
        java.util.List list = this.f6957a;
        net.idrnd.face.iad.capture.internal.p0 p0Var = this.b;
        net.idrnd.face.iad.capture.internal.v vVar = this.c;
        java.lang.StringBuilder sb = new java.lang.StringBuilder("PayloadParameters(photoParameters=");
        sb.append(list);
        sb.append(", controlPhotoParameters=");
        sb.append(p0Var);
        sb.append(", cropsParameters=");
        sb.append(vVar);
        sb.append(")");
        return sb.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(android.os.Parcel parcel, int i) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(parcel, "");
        parcel.writeParcelableArray((android.os.Parcelable[]) this.f6957a.toArray(new net.idrnd.face.iad.capture.internal.p0[0]), 0);
        parcel.writeParcelable(this.b, 0);
        parcel.writeParcelable(this.c, 0);
    }

    public final java.util.List b() {
        return this.f6957a;
    }

    public final int a() {
        java.util.Iterator it = this.f6957a.iterator();
        if (it.hasNext()) {
            java.lang.Object next = it.next();
            int i = 0;
            if (it.hasNext()) {
                java.lang.Integer num = ((net.idrnd.face.iad.capture.internal.p0) next).b;
                int intValue = num != null ? num.intValue() : 0;
                do {
                    java.lang.Object next2 = it.next();
                    java.lang.Integer num2 = ((net.idrnd.face.iad.capture.internal.p0) next2).b;
                    int intValue2 = num2 != null ? num2.intValue() : 0;
                    if (intValue < intValue2) {
                        next = next2;
                        intValue = intValue2;
                    }
                } while (it.hasNext());
            }
            net.idrnd.face.iad.capture.internal.p0 p0Var = (net.idrnd.face.iad.capture.internal.p0) next;
            java.util.Iterator it2 = this.f6957a.iterator();
            while (it2.hasNext()) {
                if (kotlin.jvm.internal.Intrinsics.areEqual(((net.idrnd.face.iad.capture.internal.p0) it2.next()).b, p0Var.b)) {
                    return i;
                }
                i++;
            }
            return -1;
        }
        throw new java.util.NoSuchElementException();
    }
}
