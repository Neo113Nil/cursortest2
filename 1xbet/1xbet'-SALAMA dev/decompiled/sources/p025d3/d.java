package p025d3;

import Q0.a;
import android.accounts.Account;
import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.auth.api.signin.GoogleSignInAccount;
import com.google.android.gms.auth.api.signin.GoogleSignInOptions;
import com.google.android.gms.auth.api.signin.SignInAccount;
import com.google.android.gms.auth.api.signin.internal.GoogleSignInOptionsExtensionParcelable;
import com.google.android.gms.common.api.Scope;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes.dex */
public final class d implements Parcelable.Creator {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f12407a;

    public /* synthetic */ d(int i7) {
        this.f12407a = i7;
    }

    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        switch (this.f12407a) {
            case 0:
                int iA0 = a.a0(parcel);
                int iN = 0;
                String strN = null;
                String strN2 = null;
                String strN3 = null;
                String strN4 = null;
                Uri uri = null;
                String strN5 = null;
                String strN6 = null;
                ArrayList arrayListR = null;
                String strN7 = null;
                String strN8 = null;
                long jP = 0;
                while (parcel.dataPosition() < iA0) {
                    int i7 = parcel.readInt();
                    switch ((char) i7) {
                        case 1:
                            iN = a.N(i7, parcel);
                            break;
                        case 2:
                            strN = a.n(i7, parcel);
                            break;
                        case 3:
                            strN2 = a.n(i7, parcel);
                            break;
                        case 4:
                            strN3 = a.n(i7, parcel);
                            break;
                        case 5:
                            strN4 = a.n(i7, parcel);
                            break;
                        case 6:
                            uri = (Uri) a.m(parcel, i7, Uri.CREATOR);
                            break;
                        case 7:
                            strN5 = a.n(i7, parcel);
                            break;
                        case '\b':
                            jP = a.P(i7, parcel);
                            break;
                        case '\t':
                            strN6 = a.n(i7, parcel);
                            break;
                        case '\n':
                            arrayListR = a.r(parcel, i7, Scope.CREATOR);
                            break;
                        case 11:
                            strN7 = a.n(i7, parcel);
                            break;
                        case '\f':
                            strN8 = a.n(i7, parcel);
                            break;
                        default:
                            a.X(i7, parcel);
                            break;
                    }
                }
                a.y(iA0, parcel);
                return new GoogleSignInAccount(iN, strN, strN2, strN3, strN4, uri, strN5, jP, strN6, arrayListR, strN7, strN8);
            case 1:
                int iA1 = a.a0(parcel);
                ArrayList arrayListR2 = null;
                int iN2 = 0;
                boolean zK = false;
                boolean zK2 = false;
                boolean zK3 = false;
                ArrayList arrayListR3 = null;
                Account account = null;
                String strN9 = null;
                String strN10 = null;
                String strN11 = null;
                while (parcel.dataPosition() < iA1) {
                    int i8 = parcel.readInt();
                    switch ((char) i8) {
                        case 1:
                            iN2 = a.N(i8, parcel);
                            break;
                        case 2:
                            arrayListR3 = a.r(parcel, i8, Scope.CREATOR);
                            break;
                        case 3:
                            account = (Account) a.m(parcel, i8, Account.CREATOR);
                            break;
                        case 4:
                            zK = a.K(i8, parcel);
                            break;
                        case 5:
                            zK2 = a.K(i8, parcel);
                            break;
                        case 6:
                            zK3 = a.K(i8, parcel);
                            break;
                        case 7:
                            strN9 = a.n(i8, parcel);
                            break;
                        case '\b':
                            strN10 = a.n(i8, parcel);
                            break;
                        case '\t':
                            arrayListR2 = a.r(parcel, i8, GoogleSignInOptionsExtensionParcelable.CREATOR);
                            break;
                        case '\n':
                            strN11 = a.n(i8, parcel);
                            break;
                        default:
                            a.X(i8, parcel);
                            break;
                    }
                }
                a.y(iA1, parcel);
                return new GoogleSignInOptions(iN2, arrayListR3, account, zK, zK2, zK3, strN9, strN10, GoogleSignInOptions.k(arrayListR2), strN11);
            default:
                int iA2 = a.a0(parcel);
                String strN12 = "";
                GoogleSignInAccount googleSignInAccount = null;
                String strN13 = "";
                while (parcel.dataPosition() < iA2) {
                    int i9 = parcel.readInt();
                    char c3 = (char) i9;
                    if (c3 == 4) {
                        strN12 = a.n(i9, parcel);
                    } else if (c3 == 7) {
                        googleSignInAccount = (GoogleSignInAccount) a.m(parcel, i9, GoogleSignInAccount.CREATOR);
                    } else if (c3 != '\b') {
                        a.X(i9, parcel);
                    } else {
                        strN13 = a.n(i9, parcel);
                    }
                }
                a.y(iA2, parcel);
                return new SignInAccount(strN12, googleSignInAccount, strN13);
        }
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i7) {
        switch (this.f12407a) {
            case 0:
                return new GoogleSignInAccount[i7];
            case 1:
                return new GoogleSignInOptions[i7];
            default:
                return new SignInAccount[i7];
        }
    }
}
