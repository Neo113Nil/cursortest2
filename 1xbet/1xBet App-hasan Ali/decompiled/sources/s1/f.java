package s1;

import android.os.Parcel;
import android.os.Parcelable;
import android.view.View;
import y3.C2671g;

/* loaded from: classes.dex */
public final class f extends View.BaseSavedState {
    public static final Parcelable.Creator<f> CREATOR = new C2671g(1);

    /* renamed from: k, reason: collision with root package name */
    public int f19200k;

    public final String toString() {
        StringBuilder sb = new StringBuilder("HorizontalScrollView.SavedState{");
        sb.append(Integer.toHexString(System.identityHashCode(this)));
        sb.append(" scrollPosition=");
        return L1.a.o(sb, this.f19200k, "}");
    }

    @Override // android.view.View.BaseSavedState, android.view.AbsSavedState, android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        super.writeToParcel(parcel, i);
        parcel.writeInt(this.f19200k);
    }
}
