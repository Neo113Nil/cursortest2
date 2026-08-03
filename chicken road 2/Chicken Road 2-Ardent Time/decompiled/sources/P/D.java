package P;

/* loaded from: classes.dex */
public final class D extends E.c {
    public static final android.os.Parcelable.Creator<P.D> CREATOR = new E.b(1);

    /* renamed from: c, reason: collision with root package name */
    public android.os.Parcelable f1192c;

    public D(android.os.Parcel parcel, java.lang.ClassLoader classLoader) {
        super(parcel, classLoader);
        this.f1192c = parcel.readParcelable(classLoader == null ? P.v.class.getClassLoader() : classLoader);
    }

    @Override // E.c, android.os.Parcelable
    public final void writeToParcel(android.os.Parcel parcel, int i2) {
        super.writeToParcel(parcel, i2);
        parcel.writeParcelable(this.f1192c, 0);
    }
}
