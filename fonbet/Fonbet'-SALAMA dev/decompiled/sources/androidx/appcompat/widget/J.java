package androidx.appcompat.widget;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.appcompat.widget.AppCompatSpinner;

/* loaded from: classes.dex */
public final class J implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        AppCompatSpinner.SavedState savedState = new AppCompatSpinner.SavedState(parcel);
        savedState.f8305a = parcel.readByte() != 0;
        return savedState;
    }

    @Override // android.os.Parcelable.Creator
    public final Object[] newArray(int i7) {
        return new AppCompatSpinner.SavedState[i7];
    }
}
