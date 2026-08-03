package androidx.versionedparcelable;

@android.annotation.SuppressLint({"BanParcelableUsage"})
/* loaded from: classes.dex */
public class ParcelImpl implements android.os.Parcelable {
    public static final android.os.Parcelable.Creator<androidx.versionedparcelable.ParcelImpl> CREATOR = new C.l(7);

    /* renamed from: a, reason: collision with root package name */
    public final U.c f2509a;

    public ParcelImpl(android.os.Parcel parcel) {
        this.f2509a = new U.b(parcel).g();
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(android.os.Parcel parcel, int i2) {
        new U.b(parcel).i(this.f2509a);
    }
}
