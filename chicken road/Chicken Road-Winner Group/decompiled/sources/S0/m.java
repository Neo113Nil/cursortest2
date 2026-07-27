package S0;

import android.accounts.Account;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.auth.api.signin.GoogleSignInAccount;

/* loaded from: classes.dex */
public final class m extends T0.a {
    public static final Parcelable.Creator<m> CREATOR = new H.j(9);

    /* renamed from: a, reason: collision with root package name */
    public final int f1343a;

    /* renamed from: b, reason: collision with root package name */
    public final Account f1344b;

    /* renamed from: c, reason: collision with root package name */
    public final int f1345c;

    /* renamed from: d, reason: collision with root package name */
    public final GoogleSignInAccount f1346d;

    public m(int i3, Account account, int i4, GoogleSignInAccount googleSignInAccount) {
        this.f1343a = i3;
        this.f1344b = account;
        this.f1345c = i4;
        this.f1346d = googleSignInAccount;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i3) {
        int Q2 = F2.b.Q(parcel, 20293);
        F2.b.S(parcel, 1, 4);
        parcel.writeInt(this.f1343a);
        F2.b.M(parcel, 2, this.f1344b, i3);
        F2.b.S(parcel, 3, 4);
        parcel.writeInt(this.f1345c);
        F2.b.M(parcel, 4, this.f1346d, i3);
        F2.b.R(parcel, Q2);
    }
}
