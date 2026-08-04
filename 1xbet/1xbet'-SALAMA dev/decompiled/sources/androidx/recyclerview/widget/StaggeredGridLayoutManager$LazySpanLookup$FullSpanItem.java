package androidx.recyclerview.widget;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;

/* JADX INFO: loaded from: classes.dex */
class StaggeredGridLayoutManager$LazySpanLookup$FullSpanItem implements Parcelable {
    public static final Parcelable.Creator<StaggeredGridLayoutManager$LazySpanLookup$FullSpanItem> CREATOR = new c();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f9754a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f9755b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int[] f9756c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public boolean f9757d;

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final String toString() {
        return "FullSpanItem{mPosition=" + this.f9754a + ", mGapDir=" + this.f9755b + ", mHasUnwantedGapAfter=" + this.f9757d + ", mGapPerSpan=" + Arrays.toString(this.f9756c) + '}';
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i7) {
        parcel.writeInt(this.f9754a);
        parcel.writeInt(this.f9755b);
        parcel.writeInt(this.f9757d ? 1 : 0);
        int[] iArr = this.f9756c;
        if (iArr == null || iArr.length <= 0) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(iArr.length);
            parcel.writeIntArray(this.f9756c);
        }
    }
}
