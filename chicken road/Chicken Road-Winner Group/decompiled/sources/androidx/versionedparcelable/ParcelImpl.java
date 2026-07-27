package androidx.versionedparcelable;

import H.j;
import Z.b;
import Z.c;
import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: classes.dex */
public class ParcelImpl implements Parcelable {
    public static final Parcelable.Creator<ParcelImpl> CREATOR = new j(18);

    /* renamed from: a, reason: collision with root package name */
    public final c f2438a;

    public ParcelImpl(Parcel parcel) {
        this.f2438a = new b(parcel).g();
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i3) {
        new b(parcel).i(this.f2438a);
    }
}
