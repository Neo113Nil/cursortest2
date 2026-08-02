package p000;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;

/* JADX INFO: renamed from: lz */
/* JADX INFO: compiled from: r8-map-id-738170b7fb69b873ed7524d5270c8e05c6f5fb40ea1ade7a72c8ed7a70699269 */
/* JADX INFO: loaded from: classes.dex */
public final class C0451lz extends AbstractC0823w0 {
    public static final Parcelable.Creator<C0451lz> CREATOR = new jm1(6);

    /* JADX INFO: renamed from: j */
    public final String f4928j;

    /* JADX INFO: renamed from: k */
    public final int f4929k;

    /* JADX INFO: renamed from: l */
    public final long f4930l;

    /* JADX INFO: renamed from: m */
    public final boolean f4931m;

    public C0451lz(String str, int i, long j, boolean z) {
        this.f4928j = str;
        this.f4929k = i;
        this.f4930l = j;
        this.f4931m = z;
    }

    /* JADX INFO: renamed from: b */
    public final long m3294b() {
        long j = this.f4930l;
        return j == -1 ? this.f4929k : j;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof C0451lz) {
            C0451lz c0451lz = (C0451lz) obj;
            if (AbstractC0477mo.m3406e(this.f4928j, c0451lz.f4928j) && m3294b() == c0451lz.m3294b() && this.f4931m == c0451lz.f4931m) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f4928j, Long.valueOf(m3294b()), Boolean.valueOf(this.f4931m)});
    }

    public final String toString() {
        f50 f50Var = new f50(this);
        f50Var.m1627j(this.f4928j, "name");
        f50Var.m1627j(Long.valueOf(m3294b()), "version");
        f50Var.m1627j(Boolean.valueOf(this.f4931m), "is_fully_rolled_out");
        return f50Var.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iM4663q = t22.m4663q(parcel, 20293);
        t22.m4658l(parcel, 1, this.f4928j);
        t22.m4662p(parcel, 2, 4);
        parcel.writeInt(this.f4929k);
        long jM3294b = m3294b();
        t22.m4662p(parcel, 3, 8);
        parcel.writeLong(jM3294b);
        t22.m4662p(parcel, 4, 4);
        parcel.writeInt(this.f4931m ? 1 : 0);
        t22.m4665s(parcel, iM4663q);
    }

    public C0451lz(String str) {
        this(str, -1, 1L, false);
    }
}
