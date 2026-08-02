package m3;

import android.accounts.Account;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.auth.api.signin.GoogleSignInAccount;
import k4.AbstractC2036a;
import n3.AbstractC2187a;

/* loaded from: classes.dex */
public final class q extends AbstractC2187a {
    public static final Parcelable.Creator<q> CREATOR = new C2.a(23);

    /* renamed from: k, reason: collision with root package name */
    public final int f18092k;

    /* renamed from: l, reason: collision with root package name */
    public final Account f18093l;

    /* renamed from: m, reason: collision with root package name */
    public final int f18094m;

    /* renamed from: n, reason: collision with root package name */
    public final GoogleSignInAccount f18095n;

    public q(int i, Account account, int i5, GoogleSignInAccount googleSignInAccount) {
        this.f18092k = i;
        this.f18093l = account;
        this.f18094m = i5;
        this.f18095n = googleSignInAccount;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int k02 = AbstractC2036a.k0(parcel, 20293);
        AbstractC2036a.n0(parcel, 1, 4);
        parcel.writeInt(this.f18092k);
        AbstractC2036a.e0(parcel, 2, this.f18093l, i);
        AbstractC2036a.n0(parcel, 3, 4);
        parcel.writeInt(this.f18094m);
        AbstractC2036a.e0(parcel, 4, this.f18095n, i);
        AbstractC2036a.m0(parcel, k02);
    }
}
