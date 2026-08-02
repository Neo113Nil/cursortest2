package net.idrnd.face.iad.capture.internal;

/* loaded from: classes17.dex */
public final class o0 implements android.os.Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final java.lang.Object createFromParcel(android.os.Parcel parcel) {
        java.lang.Object obj;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(parcel, "");
        java.lang.ClassLoader classLoader = net.idrnd.face.iad.capture.internal.m2.class.getClassLoader();
        if (android.os.Build.VERSION.SDK_INT >= 33) {
            obj = (java.io.Serializable) parcel.readSerializable(classLoader, net.idrnd.face.iad.capture.internal.m2.class);
        } else {
            java.io.Serializable readSerializable = parcel.readSerializable();
            if (!(readSerializable instanceof net.idrnd.face.iad.capture.internal.m2)) {
                readSerializable = null;
            }
            obj = (net.idrnd.face.iad.capture.internal.m2) readSerializable;
        }
        kotlin.jvm.internal.Intrinsics.checkNotNull(obj);
        return new net.idrnd.face.iad.capture.internal.p0((net.idrnd.face.iad.capture.internal.m2) obj, (java.lang.Integer) parcel.readValue(java.lang.Integer.TYPE.getClassLoader()));
    }

    @Override // android.os.Parcelable.Creator
    public final java.lang.Object[] newArray(int i) {
        return new net.idrnd.face.iad.capture.internal.p0[i];
    }
}
