package B;

import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: B.e, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0076e implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        return new C0077f(parcel.readInt());
    }

    @Override // android.os.Parcelable.Creator
    public final Object[] newArray(int i) {
        return new C0077f[i];
    }
}
