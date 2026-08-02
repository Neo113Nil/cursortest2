package Ve;

import android.os.Parcel;
import android.os.Parcelable;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: Ve.z1, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C4802z1 implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        Intrinsics.checkNotNullParameter(parcel, "parcel");
        return new C4258g2();
    }

    @Override // android.os.Parcelable.Creator
    public final Object[] newArray(int i11) {
        return new C4258g2[i11];
    }
}
