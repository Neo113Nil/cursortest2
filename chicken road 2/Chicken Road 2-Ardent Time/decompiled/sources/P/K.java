package P;

/* loaded from: classes.dex */
public final class K implements android.os.Parcelable {
    public static final android.os.Parcelable.Creator<P.K> CREATOR = new C.l(5);

    /* renamed from: a, reason: collision with root package name */
    public int f1207a;

    /* renamed from: b, reason: collision with root package name */
    public int f1208b;

    /* renamed from: c, reason: collision with root package name */
    public int[] f1209c;

    /* renamed from: d, reason: collision with root package name */
    public boolean f1210d;

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final java.lang.String toString() {
        return "FullSpanItem{mPosition=" + this.f1207a + ", mGapDir=" + this.f1208b + ", mHasUnwantedGapAfter=" + this.f1210d + ", mGapPerSpan=" + java.util.Arrays.toString(this.f1209c) + '}';
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(android.os.Parcel parcel, int i2) {
        parcel.writeInt(this.f1207a);
        parcel.writeInt(this.f1208b);
        parcel.writeInt(this.f1210d ? 1 : 0);
        int[] iArr = this.f1209c;
        if (iArr == null || iArr.length <= 0) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(iArr.length);
            parcel.writeIntArray(this.f1209c);
        }
    }
}
