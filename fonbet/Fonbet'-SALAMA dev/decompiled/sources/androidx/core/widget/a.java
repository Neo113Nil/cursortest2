package androidx.core.widget;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.core.widget.NestedScrollView;

/* loaded from: classes.dex */
public final class a implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        NestedScrollView.SavedState savedState = new NestedScrollView.SavedState(parcel);
        savedState.f9096a = parcel.readInt();
        return savedState;
    }

    @Override // android.os.Parcelable.Creator
    public final Object[] newArray(int i7) {
        return new NestedScrollView.SavedState[i7];
    }
}
