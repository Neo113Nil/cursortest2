package p000;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: compiled from: r8-map-id-738170b7fb69b873ed7524d5270c8e05c6f5fb40ea1ade7a72c8ed7a70699269 */
/* JADX INFO: loaded from: classes.dex */
public final class z01 extends AbstractC0823w0 {
    public static final Parcelable.Creator<z01> CREATOR = new C0936z2(18);

    /* JADX INFO: renamed from: j */
    public final Bundle f9561j;

    /* JADX INFO: renamed from: k */
    public f50 f9562k;

    public z01(Bundle bundle) {
        this.f9561j = bundle;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iM4663q = t22.m4663q(parcel, 20293);
        t22.m4652f(parcel, 2, this.f9561j);
        t22.m4665s(parcel, iM4663q);
    }
}
