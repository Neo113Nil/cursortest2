package U;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;

/* loaded from: classes.dex */
public final class J implements Parcelable {
    public static final Parcelable.Creator<J> CREATOR = new H.j(16);

    /* renamed from: a, reason: collision with root package name */
    public int f1496a;

    /* renamed from: b, reason: collision with root package name */
    public int f1497b;

    /* renamed from: c, reason: collision with root package name */
    public int[] f1498c;

    /* renamed from: d, reason: collision with root package name */
    public boolean f1499d;

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final String toString() {
        return "FullSpanItem{mPosition=" + this.f1496a + ", mGapDir=" + this.f1497b + ", mHasUnwantedGapAfter=" + this.f1499d + ", mGapPerSpan=" + Arrays.toString(this.f1498c) + '}';
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i3) {
        parcel.writeInt(this.f1496a);
        parcel.writeInt(this.f1497b);
        parcel.writeInt(this.f1499d ? 1 : 0);
        int[] iArr = this.f1498c;
        if (iArr == null || iArr.length <= 0) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(iArr.length);
            parcel.writeIntArray(this.f1498c);
        }
    }
}
