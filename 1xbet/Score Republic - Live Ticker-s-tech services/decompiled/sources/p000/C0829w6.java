package p000;

import android.os.Parcel;
import android.os.Parcelable;
import android.view.View;

/* JADX INFO: renamed from: w6 */
/* JADX INFO: compiled from: r8-map-id-738170b7fb69b873ed7524d5270c8e05c6f5fb40ea1ade7a72c8ed7a70699269 */
/* JADX INFO: loaded from: classes.dex */
public final class C0829w6 extends View.BaseSavedState {
    public static final Parcelable.Creator<C0829w6> CREATOR = new C0936z2(1);

    /* JADX INFO: renamed from: j */
    public boolean f8438j;

    @Override // android.view.View.BaseSavedState, android.view.AbsSavedState, android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        super.writeToParcel(parcel, i);
        parcel.writeByte(this.f8438j ? (byte) 1 : (byte) 0);
    }
}
