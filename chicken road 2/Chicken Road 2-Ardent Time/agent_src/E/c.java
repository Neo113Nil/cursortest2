package E;

/* loaded from: classes.dex */
public abstract class c implements android.os.Parcelable {

    /* renamed from: a, reason: collision with root package name */
    public final android.os.Parcelable f258a;

    /* renamed from: b, reason: collision with root package name */
    public static final E.a f257b = new E.a();
    public static final android.os.Parcelable.Creator<E.c> CREATOR = new E.b(0);

    public c() {
        this.f258a = null;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(android.os.Parcel parcel, int i2) {
        parcel.writeParcelable(this.f258a, i2);
    }

    public c(android.os.Parcelable parcelable) {
        if (parcelable != null) {
            this.f258a = parcelable == f257b ? null : parcelable;
            return;
        }
        throw new java.lang.IllegalArgumentException("superState must not be null");
    }

    public c(android.os.Parcel parcel, java.lang.ClassLoader classLoader) {
        android.os.Parcelable readParcelable = parcel.readParcelable(classLoader);
        this.f258a = readParcelable == null ? f257b : readParcelable;
    }
}
