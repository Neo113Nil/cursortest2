package p000;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: compiled from: r8-map-id-738170b7fb69b873ed7524d5270c8e05c6f5fb40ea1ade7a72c8ed7a70699269 */
/* JADX INFO: loaded from: classes.dex */
public final class hr1 extends AbstractC0823w0 {
    public static final Parcelable.Creator<hr1> CREATOR = new jm1(3);

    /* JADX INFO: renamed from: j */
    public String f3299j;

    /* JADX INFO: renamed from: k */
    public String f3300k;

    /* JADX INFO: renamed from: l */
    public b72 f3301l;

    /* JADX INFO: renamed from: m */
    public long f3302m;

    /* JADX INFO: renamed from: n */
    public boolean f3303n;

    /* JADX INFO: renamed from: o */
    public String f3304o;

    /* JADX INFO: renamed from: p */
    public final fu1 f3305p;

    /* JADX INFO: renamed from: q */
    public long f3306q;

    /* JADX INFO: renamed from: r */
    public fu1 f3307r;

    /* JADX INFO: renamed from: s */
    public final long f3308s;

    /* JADX INFO: renamed from: t */
    public final fu1 f3309t;

    public hr1(hr1 hr1Var) {
        p80.m3863h(hr1Var);
        this.f3299j = hr1Var.f3299j;
        this.f3300k = hr1Var.f3300k;
        this.f3301l = hr1Var.f3301l;
        this.f3302m = hr1Var.f3302m;
        this.f3303n = hr1Var.f3303n;
        this.f3304o = hr1Var.f3304o;
        this.f3305p = hr1Var.f3305p;
        this.f3306q = hr1Var.f3306q;
        this.f3307r = hr1Var.f3307r;
        this.f3308s = hr1Var.f3308s;
        this.f3309t = hr1Var.f3309t;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iM4663q = t22.m4663q(parcel, 20293);
        t22.m4658l(parcel, 2, this.f3299j);
        t22.m4658l(parcel, 3, this.f3300k);
        t22.m4657k(parcel, 4, this.f3301l, i);
        long j = this.f3302m;
        t22.m4662p(parcel, 5, 8);
        parcel.writeLong(j);
        boolean z = this.f3303n;
        t22.m4662p(parcel, 6, 4);
        parcel.writeInt(z ? 1 : 0);
        t22.m4658l(parcel, 7, this.f3304o);
        t22.m4657k(parcel, 8, this.f3305p, i);
        long j2 = this.f3306q;
        t22.m4662p(parcel, 9, 8);
        parcel.writeLong(j2);
        t22.m4657k(parcel, 10, this.f3307r, i);
        t22.m4662p(parcel, 11, 8);
        parcel.writeLong(this.f3308s);
        t22.m4657k(parcel, 12, this.f3309t, i);
        t22.m4665s(parcel, iM4663q);
    }

    public hr1(String str, String str2, b72 b72Var, long j, boolean z, String str3, fu1 fu1Var, long j2, fu1 fu1Var2, long j3, fu1 fu1Var3) {
        this.f3299j = str;
        this.f3300k = str2;
        this.f3301l = b72Var;
        this.f3302m = j;
        this.f3303n = z;
        this.f3304o = str3;
        this.f3305p = fu1Var;
        this.f3306q = j2;
        this.f3307r = fu1Var2;
        this.f3308s = j3;
        this.f3309t = fu1Var3;
    }
}
