package Q;

import android.accounts.Account;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.auth.api.signin.GoogleSignInAccount;

/* loaded from: classes.dex */
public final class n extends R.a {
    public static final Parcelable.Creator<n> CREATOR = new K.c(8);

    /* renamed from: a, reason: collision with root package name */
    public final int f453a;

    /* renamed from: b, reason: collision with root package name */
    public final Account f454b;

    /* renamed from: c, reason: collision with root package name */
    public final int f455c;

    /* renamed from: d, reason: collision with root package name */
    public final GoogleSignInAccount f456d;

    public n(int i2, Account account, int i3, GoogleSignInAccount googleSignInAccount) {
        this.f453a = i2;
        this.f454b = account;
        this.f455c = i3;
        this.f456d = googleSignInAccount;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i2) {
        int L = V.a.L(parcel, 20293);
        V.a.N(parcel, 1, 4);
        parcel.writeInt(this.f453a);
        V.a.H(parcel, 2, this.f454b, i2);
        V.a.N(parcel, 3, 4);
        parcel.writeInt(this.f455c);
        V.a.H(parcel, 4, this.f456d, i2);
        V.a.M(parcel, L);
    }
}
