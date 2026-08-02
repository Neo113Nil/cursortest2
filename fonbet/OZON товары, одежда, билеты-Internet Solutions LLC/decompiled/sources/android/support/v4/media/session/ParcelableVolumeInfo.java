package android.support.v4.media.session;

import android.annotation.SuppressLint;
import android.os.Parcel;
import android.os.Parcelable;

@SuppressLint({"BanParcelableUsage"})
/* loaded from: classes8.dex */
public class ParcelableVolumeInfo implements Parcelable {
    public static final Parcelable.Creator<ParcelableVolumeInfo> CREATOR = new a();

    /* renamed from: a, reason: collision with root package name */
    public int f36892a;

    /* renamed from: b, reason: collision with root package name */
    public int f36893b;

    /* renamed from: c, reason: collision with root package name */
    public int f36894c;

    /* renamed from: d, reason: collision with root package name */
    public int f36895d;

    /* renamed from: e, reason: collision with root package name */
    public int f36896e;

    final class a implements Parcelable.Creator<ParcelableVolumeInfo> {
        @Override // android.os.Parcelable.Creator
        public final ParcelableVolumeInfo createFromParcel(Parcel parcel) {
            ParcelableVolumeInfo parcelableVolumeInfo = new ParcelableVolumeInfo();
            parcelableVolumeInfo.f36892a = parcel.readInt();
            parcelableVolumeInfo.f36894c = parcel.readInt();
            parcelableVolumeInfo.f36895d = parcel.readInt();
            parcelableVolumeInfo.f36896e = parcel.readInt();
            parcelableVolumeInfo.f36893b = parcel.readInt();
            return parcelableVolumeInfo;
        }

        @Override // android.os.Parcelable.Creator
        public final ParcelableVolumeInfo[] newArray(int i11) {
            return new ParcelableVolumeInfo[i11];
        }
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i11) {
        parcel.writeInt(this.f36892a);
        parcel.writeInt(this.f36894c);
        parcel.writeInt(this.f36895d);
        parcel.writeInt(this.f36896e);
        parcel.writeInt(this.f36893b);
    }
}
