package androidx.versionedparcelable;

import C2.a;
import android.os.Parcel;
import android.os.Parcelable;
import c2.C0537b;
import c2.InterfaceC0538c;

/* loaded from: classes.dex */
public class ParcelImpl implements Parcelable {
    public static final Parcelable.Creator<ParcelImpl> CREATOR = new a(13);

    /* renamed from: k, reason: collision with root package name */
    public final InterfaceC0538c f7082k;

    public ParcelImpl(Parcel parcel) {
        this.f7082k = new C0537b(parcel).g();
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        new C0537b(parcel).i(this.f7082k);
    }
}
