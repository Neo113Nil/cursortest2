package net.idrnd.face.iad.capture.internal;

/* loaded from: classes17.dex */
public final class a3 implements android.os.Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final java.lang.Object createFromParcel(android.os.Parcel parcel) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(parcel, "");
        int i = android.os.Build.VERSION.SDK_INT;
        android.os.Parcelable[] readParcelableArray = i >= 33 ? (android.os.Parcelable[]) parcel.readParcelableArray(net.idrnd.face.iad.capture.internal.p0.class.getClassLoader(), net.idrnd.face.iad.capture.internal.p0.class) : parcel.readParcelableArray(net.idrnd.face.iad.capture.internal.p0.class.getClassLoader());
        kotlin.jvm.internal.Intrinsics.checkNotNull(readParcelableArray);
        net.idrnd.face.iad.capture.internal.p0[] p0VarArr = (net.idrnd.face.iad.capture.internal.p0[]) readParcelableArray;
        java.lang.ClassLoader classLoader = net.idrnd.face.iad.capture.internal.p0.class.getClassLoader();
        android.os.Parcelable readParcelable = i >= 33 ? (android.os.Parcelable) parcel.readParcelable(classLoader, net.idrnd.face.iad.capture.internal.p0.class) : parcel.readParcelable(classLoader);
        kotlin.jvm.internal.Intrinsics.checkNotNull(readParcelable);
        net.idrnd.face.iad.capture.internal.p0 p0Var = (net.idrnd.face.iad.capture.internal.p0) readParcelable;
        java.lang.ClassLoader classLoader2 = net.idrnd.face.iad.capture.internal.v.class.getClassLoader();
        return new net.idrnd.face.iad.capture.internal.b3(kotlin.collections.ArraysKt.asList(p0VarArr), p0Var, (net.idrnd.face.iad.capture.internal.v) (i >= 33 ? (android.os.Parcelable) parcel.readParcelable(classLoader2, net.idrnd.face.iad.capture.internal.v.class) : parcel.readParcelable(classLoader2)));
    }

    @Override // android.os.Parcelable.Creator
    public final java.lang.Object[] newArray(int i) {
        return new net.idrnd.face.iad.capture.internal.b3[i];
    }
}
