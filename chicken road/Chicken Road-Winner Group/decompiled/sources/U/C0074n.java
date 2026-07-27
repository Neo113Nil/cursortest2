package U;

import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: U.n, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0074n implements Parcelable {
    public static final Parcelable.Creator<C0074n> CREATOR = new H.j(15);

    /* renamed from: a, reason: collision with root package name */
    public int f1577a;

    /* renamed from: b, reason: collision with root package name */
    public int f1578b;

    /* renamed from: c, reason: collision with root package name */
    public boolean f1579c;

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i3) {
        parcel.writeInt(this.f1577a);
        parcel.writeInt(this.f1578b);
        parcel.writeInt(this.f1579c ? 1 : 0);
    }
}
