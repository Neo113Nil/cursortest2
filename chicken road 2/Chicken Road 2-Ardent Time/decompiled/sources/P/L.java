package P;

/* loaded from: classes.dex */
public final class L implements android.os.Parcelable {
    public static final android.os.Parcelable.Creator<P.L> CREATOR = new C.l(6);

    /* renamed from: a, reason: collision with root package name */
    public int f1211a;

    /* renamed from: b, reason: collision with root package name */
    public int f1212b;

    /* renamed from: c, reason: collision with root package name */
    public int f1213c;

    /* renamed from: d, reason: collision with root package name */
    public int[] f1214d;

    /* renamed from: e, reason: collision with root package name */
    public int f1215e;

    /* renamed from: f, reason: collision with root package name */
    public int[] f1216f;

    /* renamed from: g, reason: collision with root package name */
    public java.util.ArrayList f1217g;

    /* renamed from: h, reason: collision with root package name */
    public boolean f1218h;

    /* renamed from: i, reason: collision with root package name */
    public boolean f1219i;

    /* renamed from: j, reason: collision with root package name */
    public boolean f1220j;

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(android.os.Parcel parcel, int i2) {
        parcel.writeInt(this.f1211a);
        parcel.writeInt(this.f1212b);
        parcel.writeInt(this.f1213c);
        if (this.f1213c > 0) {
            parcel.writeIntArray(this.f1214d);
        }
        parcel.writeInt(this.f1215e);
        if (this.f1215e > 0) {
            parcel.writeIntArray(this.f1216f);
        }
        parcel.writeInt(this.f1218h ? 1 : 0);
        parcel.writeInt(this.f1219i ? 1 : 0);
        parcel.writeInt(this.f1220j ? 1 : 0);
        parcel.writeList(this.f1217g);
    }
}
