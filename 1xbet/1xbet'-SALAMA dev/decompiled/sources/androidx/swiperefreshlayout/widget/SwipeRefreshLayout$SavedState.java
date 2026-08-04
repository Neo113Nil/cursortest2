package androidx.swiperefreshlayout.widget;

import android.os.Parcel;
import android.os.Parcelable;
import android.view.View;

/* JADX INFO: loaded from: classes.dex */
class SwipeRefreshLayout$SavedState extends View.BaseSavedState {
    public static final Parcelable.Creator<SwipeRefreshLayout$SavedState> CREATOR = new k();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f9798a;

    public SwipeRefreshLayout$SavedState(Parcelable parcelable, boolean z4) {
        super(parcelable);
        this.f9798a = z4;
    }

    @Override // android.view.View.BaseSavedState, android.view.AbsSavedState, android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i7) {
        super.writeToParcel(parcel, i7);
        parcel.writeByte(this.f9798a ? (byte) 1 : (byte) 0);
    }

    public SwipeRefreshLayout$SavedState(Parcel parcel) {
        super(parcel);
        this.f9798a = parcel.readByte() != 0;
    }
}
