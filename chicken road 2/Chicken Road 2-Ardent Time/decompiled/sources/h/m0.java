package h;

/* loaded from: classes.dex */
public final class m0 extends E.c {
    public static final android.os.Parcelable.Creator<h.m0> CREATOR = new E.b(3);

    /* renamed from: c, reason: collision with root package name */
    public int f3198c;

    /* renamed from: d, reason: collision with root package name */
    public boolean f3199d;

    public m0(android.os.Parcel parcel, java.lang.ClassLoader classLoader) {
        super(parcel, classLoader);
        this.f3198c = parcel.readInt();
        this.f3199d = parcel.readInt() != 0;
    }

    @Override // E.c, android.os.Parcelable
    public final void writeToParcel(android.os.Parcel parcel, int i2) {
        super.writeToParcel(parcel, i2);
        parcel.writeInt(this.f3198c);
        parcel.writeInt(this.f3199d ? 1 : 0);
    }
}
