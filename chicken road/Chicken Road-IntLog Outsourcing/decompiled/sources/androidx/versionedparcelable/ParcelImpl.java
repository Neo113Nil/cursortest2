package androidx.versionedparcelable;

import B1.c;
import android.os.Parcel;
import android.os.Parcelable;
import h0.b;

/* loaded from: classes.dex */
public class ParcelImpl implements Parcelable {
    public static final Parcelable.Creator<ParcelImpl> CREATOR = new c(15);

    /* renamed from: a, reason: collision with root package name */
    public final h0.c f4700a;

    public ParcelImpl(Parcel parcel) {
        this.f4700a = new b(parcel).g();
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i2) {
        new b(parcel).i(this.f4700a);
    }
}
