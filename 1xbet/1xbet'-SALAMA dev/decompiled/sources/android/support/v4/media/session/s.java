package android.support.v4.media.session;

import android.os.Parcel;
import android.os.Parcelable;
import android.os.ResultReceiver;

/* JADX INFO: loaded from: classes.dex */
public final class s implements Parcelable.Creator {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f8072a;

    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        switch (this.f8072a) {
            case 0:
                MediaSessionCompat$ResultReceiverWrapper mediaSessionCompat$ResultReceiverWrapper = new MediaSessionCompat$ResultReceiverWrapper();
                mediaSessionCompat$ResultReceiverWrapper.f8014a = (ResultReceiver) ResultReceiver.CREATOR.createFromParcel(parcel);
                return mediaSessionCompat$ResultReceiverWrapper;
            case 1:
                return new MediaSessionCompat$QueueItem(parcel);
            case 2:
                return new MediaSessionCompat$Token(parcel.readParcelable(null), null);
            case 3:
                ParcelableVolumeInfo parcelableVolumeInfo = new ParcelableVolumeInfo();
                parcelableVolumeInfo.f8019a = parcel.readInt();
                parcelableVolumeInfo.f8021c = parcel.readInt();
                parcelableVolumeInfo.f8022d = parcel.readInt();
                parcelableVolumeInfo.f8023e = parcel.readInt();
                parcelableVolumeInfo.f8020b = parcel.readInt();
                return parcelableVolumeInfo;
            default:
                return new PlaybackStateCompat(parcel);
        }
    }

    @Override // android.os.Parcelable.Creator
    public final Object[] newArray(int i7) {
        switch (this.f8072a) {
            case 0:
                return new MediaSessionCompat$ResultReceiverWrapper[i7];
            case 1:
                return new MediaSessionCompat$QueueItem[i7];
            case 2:
                return new MediaSessionCompat$Token[i7];
            case 3:
                return new ParcelableVolumeInfo[i7];
            default:
                return new PlaybackStateCompat[i7];
        }
    }
}
