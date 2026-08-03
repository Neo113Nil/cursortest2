package P;

/* renamed from: P.n, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0041n implements android.os.Parcelable {
    public static final android.os.Parcelable.Creator<P.C0041n> CREATOR = new C.l(4);

    /* renamed from: a, reason: collision with root package name */
    public int f1292a;

    /* renamed from: b, reason: collision with root package name */
    public int f1293b;

    /* renamed from: c, reason: collision with root package name */
    public boolean f1294c;

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(android.os.Parcel parcel, int i2) {
        parcel.writeInt(this.f1292a);
        parcel.writeInt(this.f1293b);
        parcel.writeInt(this.f1294c ? 1 : 0);
    }
}
