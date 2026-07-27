package W;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;

/* loaded from: classes.dex */
public final class H implements Parcelable {
    public static final Parcelable.Creator<H> CREATOR = new B1.c(11);

    /* renamed from: a, reason: collision with root package name */
    public int f3272a;

    /* renamed from: b, reason: collision with root package name */
    public int f3273b;

    /* renamed from: c, reason: collision with root package name */
    public int[] f3274c;

    /* renamed from: d, reason: collision with root package name */
    public boolean f3275d;

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final String toString() {
        return "FullSpanItem{mPosition=" + this.f3272a + ", mGapDir=" + this.f3273b + ", mHasUnwantedGapAfter=" + this.f3275d + ", mGapPerSpan=" + Arrays.toString(this.f3274c) + '}';
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i2) {
        parcel.writeInt(this.f3272a);
        parcel.writeInt(this.f3273b);
        parcel.writeInt(this.f3275d ? 1 : 0);
        int[] iArr = this.f3274c;
        if (iArr == null || iArr.length <= 0) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(iArr.length);
            parcel.writeIntArray(this.f3274c);
        }
    }
}
