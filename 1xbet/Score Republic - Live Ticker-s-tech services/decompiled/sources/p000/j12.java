package p000;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: compiled from: r8-map-id-738170b7fb69b873ed7524d5270c8e05c6f5fb40ea1ade7a72c8ed7a70699269 */
/* JADX INFO: loaded from: classes.dex */
public final class j12 extends AbstractC0823w0 {
    public static final Parcelable.Creator<j12> CREATOR = new jm1(15);

    /* JADX INFO: renamed from: j */
    public final byte[] f3774j;

    public j12(byte[] bArr) {
        this.f3774j = bArr;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iM4663q = t22.m4663q(parcel, 20293);
        t22.m4653g(parcel, 2, this.f3774j);
        t22.m4665s(parcel, iM4663q);
    }
}
