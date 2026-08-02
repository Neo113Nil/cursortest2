package p000;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: renamed from: jl */
/* JADX INFO: compiled from: r8-map-id-738170b7fb69b873ed7524d5270c8e05c6f5fb40ea1ade7a72c8ed7a70699269 */
/* JADX INFO: loaded from: classes.dex */
public final class C0363jl extends AbstractC0823w0 {
    public static final Parcelable.Creator<C0363jl> CREATOR = new jm1(22);

    /* JADX INFO: renamed from: j */
    public final p31 f3959j;

    /* JADX INFO: renamed from: k */
    public final boolean f3960k;

    /* JADX INFO: renamed from: l */
    public final boolean f3961l;

    /* JADX INFO: renamed from: m */
    public final int[] f3962m;

    /* JADX INFO: renamed from: n */
    public final int f3963n;

    /* JADX INFO: renamed from: o */
    public final int[] f3964o;

    public C0363jl(p31 p31Var, boolean z, boolean z2, int[] iArr, int i, int[] iArr2) {
        this.f3959j = p31Var;
        this.f3960k = z;
        this.f3961l = z2;
        this.f3962m = iArr;
        this.f3963n = i;
        this.f3964o = iArr2;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iM4663q = t22.m4663q(parcel, 20293);
        t22.m4657k(parcel, 1, this.f3959j, i);
        t22.m4662p(parcel, 2, 4);
        parcel.writeInt(this.f3960k ? 1 : 0);
        t22.m4662p(parcel, 3, 4);
        parcel.writeInt(this.f3961l ? 1 : 0);
        t22.m4656j(parcel, 4, this.f3962m);
        t22.m4662p(parcel, 5, 4);
        parcel.writeInt(this.f3963n);
        t22.m4656j(parcel, 6, this.f3964o);
        t22.m4665s(parcel, iM4663q);
    }
}
