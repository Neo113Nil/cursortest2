package Y3;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.firebase.Timestamp;

/* JADX INFO: loaded from: classes2.dex */
public final class n implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        t6.h.e(parcel, "source");
        return new Timestamp(parcel.readLong(), parcel.readInt());
    }

    @Override // android.os.Parcelable.Creator
    public final Object[] newArray(int i7) {
        return new Timestamp[i7];
    }
}
