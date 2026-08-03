package C0;

/* loaded from: classes.dex */
public final class e extends q0.AbstractC0980a {
    public static final android.os.Parcelable.Creator<C0.e> CREATOR = new C.l(2);

    /* renamed from: a, reason: collision with root package name */
    public final java.util.ArrayList f106a;

    /* renamed from: b, reason: collision with root package name */
    public final java.lang.String f107b;

    public e(java.util.ArrayList arrayList, java.lang.String str) {
        this.f106a = arrayList;
        this.f107b = str;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(android.os.Parcel parcel, int i2) {
        int G = a.AbstractC0059a.G(parcel, 20293);
        java.util.ArrayList arrayList = this.f106a;
        if (arrayList != null) {
            int G2 = a.AbstractC0059a.G(parcel, 1);
            parcel.writeStringList(arrayList);
            a.AbstractC0059a.H(parcel, G2);
        }
        a.AbstractC0059a.D(parcel, 2, this.f107b);
        a.AbstractC0059a.H(parcel, G);
    }
}
