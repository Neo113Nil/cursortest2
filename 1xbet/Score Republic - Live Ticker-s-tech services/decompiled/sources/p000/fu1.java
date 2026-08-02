package p000;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: compiled from: r8-map-id-738170b7fb69b873ed7524d5270c8e05c6f5fb40ea1ade7a72c8ed7a70699269 */
/* JADX INFO: loaded from: classes.dex */
public final class fu1 extends AbstractC0823w0 {
    public static final Parcelable.Creator<fu1> CREATOR = new jm1(8);

    /* JADX INFO: renamed from: j */
    public final String f2501j;

    /* JADX INFO: renamed from: k */
    public final eu1 f2502k;

    /* JADX INFO: renamed from: l */
    public final String f2503l;

    /* JADX INFO: renamed from: m */
    public final long f2504m;

    /* JADX INFO: renamed from: n */
    public final long f2505n;

    public fu1(fu1 fu1Var, long j, long j2) {
        p80.m3863h(fu1Var);
        this.f2501j = fu1Var.f2501j;
        this.f2502k = fu1Var.f2502k;
        this.f2503l = fu1Var.f2503l;
        this.f2504m = j;
        this.f2505n = j2;
    }

    public final String toString() {
        String strValueOf = String.valueOf(this.f2502k);
        String str = this.f2503l;
        int length = String.valueOf(str).length();
        String str2 = this.f2501j;
        StringBuilder sb = new StringBuilder(length + 13 + String.valueOf(str2).length() + 8 + strValueOf.length());
        sb.append("origin=");
        sb.append(str);
        sb.append(",name=");
        sb.append(str2);
        return AbstractC0024an.m285h(sb, ",params=", strValueOf);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        jm1.m2936b(this, parcel, i);
    }

    public fu1(String str, eu1 eu1Var, String str2, long j, long j2) {
        this.f2501j = str;
        this.f2502k = eu1Var;
        this.f2503l = str2;
        this.f2504m = j;
        this.f2505n = j2;
    }
}
