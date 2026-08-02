package p000;

import android.accounts.Account;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.auth.api.signin.GoogleSignInAccount;

/* JADX INFO: compiled from: r8-map-id-738170b7fb69b873ed7524d5270c8e05c6f5fb40ea1ade7a72c8ed7a70699269 */
/* JADX INFO: loaded from: classes.dex */
public final class fm1 extends AbstractC0823w0 {
    public static final Parcelable.Creator<fm1> CREATOR = new C0936z2(27);

    /* JADX INFO: renamed from: j */
    public final int f2448j;

    /* JADX INFO: renamed from: k */
    public final Account f2449k;

    /* JADX INFO: renamed from: l */
    public final int f2450l;

    /* JADX INFO: renamed from: m */
    public final GoogleSignInAccount f2451m;

    public fm1(int i, Account account, int i2, GoogleSignInAccount googleSignInAccount) {
        this.f2448j = i;
        this.f2449k = account;
        this.f2450l = i2;
        this.f2451m = googleSignInAccount;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iM4663q = t22.m4663q(parcel, 20293);
        t22.m4662p(parcel, 1, 4);
        parcel.writeInt(this.f2448j);
        t22.m4657k(parcel, 2, this.f2449k, i);
        t22.m4662p(parcel, 3, 4);
        parcel.writeInt(this.f2450l);
        t22.m4657k(parcel, 4, this.f2451m, i);
        t22.m4665s(parcel, iM4663q);
    }
}
