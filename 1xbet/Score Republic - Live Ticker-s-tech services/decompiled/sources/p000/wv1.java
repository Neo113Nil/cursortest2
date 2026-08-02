package p000;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: compiled from: r8-map-id-738170b7fb69b873ed7524d5270c8e05c6f5fb40ea1ade7a72c8ed7a70699269 */
/* JADX INFO: loaded from: classes.dex */
public final class wv1 extends AbstractC0823w0 {
    public static final Parcelable.Creator<wv1> CREATOR = new jm1(10);

    /* JADX INFO: renamed from: j */
    public final long f8710j;

    /* JADX INFO: renamed from: k */
    public final long f8711k;

    /* JADX INFO: renamed from: l */
    public final boolean f8712l;

    /* JADX INFO: renamed from: m */
    public final Bundle f8713m;

    /* JADX INFO: renamed from: n */
    public final String f8714n;

    public wv1(long j, long j2, boolean z, Bundle bundle, String str) {
        this.f8710j = j;
        this.f8711k = j2;
        this.f8712l = z;
        this.f8713m = bundle;
        this.f8714n = str;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iM4663q = t22.m4663q(parcel, 20293);
        t22.m4662p(parcel, 1, 8);
        parcel.writeLong(this.f8710j);
        t22.m4662p(parcel, 2, 8);
        parcel.writeLong(this.f8711k);
        t22.m4662p(parcel, 3, 4);
        parcel.writeInt(this.f8712l ? 1 : 0);
        t22.m4652f(parcel, 7, this.f8713m);
        t22.m4658l(parcel, 8, this.f8714n);
        t22.m4665s(parcel, iM4663q);
    }
}
