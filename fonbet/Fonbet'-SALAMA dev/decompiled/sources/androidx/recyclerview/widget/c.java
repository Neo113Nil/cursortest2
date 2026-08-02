package androidx.recyclerview.widget;

import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: classes.dex */
public final class c implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        StaggeredGridLayoutManager$LazySpanLookup$FullSpanItem staggeredGridLayoutManager$LazySpanLookup$FullSpanItem = new StaggeredGridLayoutManager$LazySpanLookup$FullSpanItem();
        staggeredGridLayoutManager$LazySpanLookup$FullSpanItem.f9754a = parcel.readInt();
        staggeredGridLayoutManager$LazySpanLookup$FullSpanItem.f9755b = parcel.readInt();
        staggeredGridLayoutManager$LazySpanLookup$FullSpanItem.f9757d = parcel.readInt() == 1;
        int readInt = parcel.readInt();
        if (readInt > 0) {
            int[] iArr = new int[readInt];
            staggeredGridLayoutManager$LazySpanLookup$FullSpanItem.f9756c = iArr;
            parcel.readIntArray(iArr);
        }
        return staggeredGridLayoutManager$LazySpanLookup$FullSpanItem;
    }

    @Override // android.os.Parcelable.Creator
    public final Object[] newArray(int i7) {
        return new StaggeredGridLayoutManager$LazySpanLookup$FullSpanItem[i7];
    }
}
