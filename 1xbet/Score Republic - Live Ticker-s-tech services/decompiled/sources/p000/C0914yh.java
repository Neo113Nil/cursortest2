package p000;

import android.content.Intent;
import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: renamed from: yh */
/* JADX INFO: compiled from: r8-map-id-738170b7fb69b873ed7524d5270c8e05c6f5fb40ea1ade7a72c8ed7a70699269 */
/* JADX INFO: loaded from: classes.dex */
public final class C0914yh extends AbstractC0823w0 {
    public static final Parcelable.Creator<C0914yh> CREATOR = new k82(1);

    /* JADX INFO: renamed from: j */
    public final Intent f9303j;

    public C0914yh(Intent intent) {
        this.f9303j = intent;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iM4663q = t22.m4663q(parcel, 20293);
        t22.m4657k(parcel, 1, this.f9303j, i);
        t22.m4665s(parcel, iM4663q);
    }
}
