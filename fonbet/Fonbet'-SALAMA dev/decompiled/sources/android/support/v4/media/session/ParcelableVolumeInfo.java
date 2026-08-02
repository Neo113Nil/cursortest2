package android.support.v4.media.session;

import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: classes.dex */
public class ParcelableVolumeInfo implements Parcelable {
    public static final Parcelable.Creator<ParcelableVolumeInfo> CREATOR = new s(3);

    /* renamed from: a, reason: collision with root package name */
    public int f8019a;

    /* renamed from: b, reason: collision with root package name */
    public int f8020b;

    /* renamed from: c, reason: collision with root package name */
    public int f8021c;

    /* renamed from: d, reason: collision with root package name */
    public int f8022d;

    /* renamed from: e, reason: collision with root package name */
    public int f8023e;

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i7) {
        parcel.writeInt(this.f8019a);
        parcel.writeInt(this.f8021c);
        parcel.writeInt(this.f8022d);
        parcel.writeInt(this.f8023e);
        parcel.writeInt(this.f8020b);
    }
}
