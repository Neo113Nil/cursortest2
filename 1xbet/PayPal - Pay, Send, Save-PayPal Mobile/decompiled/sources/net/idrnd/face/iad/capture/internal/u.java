package net.idrnd.face.iad.capture.internal;

/* loaded from: classes17.dex */
public final class u implements android.os.Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final java.lang.Object createFromParcel(android.os.Parcel parcel) {
        java.lang.Object obj;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(parcel, "");
        java.lang.ClassLoader classLoader = net.idrnd.face.iad.capture.internal.t.class.getClassLoader();
        if (android.os.Build.VERSION.SDK_INT >= 33) {
            obj = (java.io.Serializable) parcel.readSerializable(classLoader, net.idrnd.face.iad.capture.internal.t.class);
        } else {
            java.io.Serializable readSerializable = parcel.readSerializable();
            if (!(readSerializable instanceof net.idrnd.face.iad.capture.internal.t)) {
                readSerializable = null;
            }
            obj = (net.idrnd.face.iad.capture.internal.t) readSerializable;
        }
        kotlin.jvm.internal.Intrinsics.checkNotNull(obj);
        return new net.idrnd.face.iad.capture.internal.v((net.idrnd.face.iad.capture.internal.t) obj, parcel.readInt(), parcel.readInt(), parcel.readInt());
    }

    @Override // android.os.Parcelable.Creator
    public final java.lang.Object[] newArray(int i) {
        return new net.idrnd.face.iad.capture.internal.v[i];
    }
}
