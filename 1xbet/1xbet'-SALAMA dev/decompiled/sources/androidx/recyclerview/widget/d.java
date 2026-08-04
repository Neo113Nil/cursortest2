package androidx.recyclerview.widget;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes.dex */
public final class d implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        StaggeredGridLayoutManager.SavedState savedState = new StaggeredGridLayoutManager.SavedState();
        savedState.f9759a = parcel.readInt();
        savedState.f9760b = parcel.readInt();
        int i7 = parcel.readInt();
        savedState.f9761c = i7;
        if (i7 > 0) {
            int[] iArr = new int[i7];
            savedState.f9762d = iArr;
            parcel.readIntArray(iArr);
        }
        int i8 = parcel.readInt();
        savedState.f9763e = i8;
        if (i8 > 0) {
            int[] iArr2 = new int[i8];
            savedState.f9764f = iArr2;
            parcel.readIntArray(iArr2);
        }
        savedState.f9766y = parcel.readInt() == 1;
        savedState.f9767z = parcel.readInt() == 1;
        savedState.f9758A = parcel.readInt() == 1;
        savedState.f9765x = parcel.readArrayList(StaggeredGridLayoutManager$LazySpanLookup$FullSpanItem.class.getClassLoader());
        return savedState;
    }

    @Override // android.os.Parcelable.Creator
    public final Object[] newArray(int i7) {
        return new StaggeredGridLayoutManager.SavedState[i7];
    }
}
