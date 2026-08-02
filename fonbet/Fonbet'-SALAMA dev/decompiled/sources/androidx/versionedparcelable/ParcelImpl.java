package androidx.versionedparcelable;

import B2.e;
import Q0.c;
import Q0.d;
import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: classes.dex */
public class ParcelImpl implements Parcelable {
    public static final Parcelable.Creator<ParcelImpl> CREATOR = new e(22);

    /* renamed from: a, reason: collision with root package name */
    public final d f9841a;

    public ParcelImpl(d dVar) {
        this.f9841a = dVar;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i7) {
        new c(parcel).l(this.f9841a);
    }

    public ParcelImpl(Parcel parcel) {
        this.f9841a = new c(parcel).h();
    }
}
