package d3;

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

/* renamed from: d3.d, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0963d implements Parcelable.Creator {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f12401a;

    public /* synthetic */ C0963d(int i7) {
        this.f12401a = i7;
    }

    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        switch (this.f12401a) {
            case 0:
                int a02 = Q0.a.a0(parcel);
                int i7 = 0;
                String str = null;
                String str2 = null;
                String str3 = null;
                String str4 = null;
                Uri uri = null;
                String str5 = null;
                String str6 = null;
                ArrayList arrayList = null;
                String str7 = null;
                String str8 = null;
                long j = 0;
                while (parcel.dataPosition() < a02) {
                    int readInt = parcel.readInt();
                    switch ((char) readInt) {
                        case 1:
                            i7 = Q0.a.N(readInt, parcel);
                            break;
                        case 2:
                            str = Q0.a.n(readInt, parcel);
                            break;
                        case 3:
                            str2 = Q0.a.n(readInt, parcel);
                            break;
                        case 4:
                            str3 = Q0.a.n(readInt, parcel);
                            break;
                        case 5:
                            str4 = Q0.a.n(readInt, parcel);
                            break;
                        case 6:
                            uri = (Uri) Q0.a.m(parcel, readInt, Uri.CREATOR);
                            break;
                        case 7:
                            str5 = Q0.a.n(readInt, parcel);
                            break;
                        case '\b':
                            j = Q0.a.P(readInt, parcel);
                            break;
                        case '\t':
                            str6 = Q0.a.n(readInt, parcel);
                            break;
                        case '\n':
                            arrayList = Q0.a.r(parcel, readInt, Scope.CREATOR);
                            break;
                        case 11:
                            str7 = Q0.a.n(readInt, parcel);
                            break;
                        case '\f':
                            str8 = Q0.a.n(readInt, parcel);
                            break;
                        default:
                            Q0.a.X(readInt, parcel);
                            break;
                    }
                }
                Q0.a.y(a02, parcel);
                return new GoogleSignInAccount(i7, str, str2, str3, str4, uri, str5, j, str6, arrayList, str7, str8);
            case 1:
                int a03 = Q0.a.a0(parcel);
                ArrayList arrayList2 = null;
                int i8 = 0;
                boolean z4 = false;
                boolean z7 = false;
                boolean z8 = false;
                ArrayList arrayList3 = null;
                Account account = null;
                String str9 = null;
                String str10 = null;
                String str11 = null;
                while (parcel.dataPosition() < a03) {
                    int readInt2 = parcel.readInt();
                    switch ((char) readInt2) {
                        case 1:
                            i8 = Q0.a.N(readInt2, parcel);
                            break;
                        case 2:
                            arrayList3 = Q0.a.r(parcel, readInt2, Scope.CREATOR);
                            break;
                        case 3:
                            account = (Account) Q0.a.m(parcel, readInt2, Account.CREATOR);
                            break;
                        case 4:
                            z4 = Q0.a.K(readInt2, parcel);
                            break;
                        case 5:
                            z7 = Q0.a.K(readInt2, parcel);
                            break;
                        case 6:
                            z8 = Q0.a.K(readInt2, parcel);
                            break;
                        case 7:
                            str9 = Q0.a.n(readInt2, parcel);
                            break;
                        case '\b':
                            str10 = Q0.a.n(readInt2, parcel);
                            break;
                        case '\t':
                            arrayList2 = Q0.a.r(parcel, readInt2, GoogleSignInOptionsExtensionParcelable.CREATOR);
                            break;
                        case '\n':
                            str11 = Q0.a.n(readInt2, parcel);
                            break;
                        default:
                            Q0.a.X(readInt2, parcel);
                            break;
                    }
                }
                Q0.a.y(a03, parcel);
                return new GoogleSignInOptions(i8, arrayList3, account, z4, z7, z8, str9, str10, GoogleSignInOptions.k(arrayList2), str11);
            default:
                int a04 = Q0.a.a0(parcel);
                String str12 = "";
                GoogleSignInAccount googleSignInAccount = null;
                String str13 = "";
                while (parcel.dataPosition() < a04) {
                    int readInt3 = parcel.readInt();
                    char c3 = (char) readInt3;
                    if (c3 == 4) {
                        str12 = Q0.a.n(readInt3, parcel);
                    } else if (c3 == 7) {
                        googleSignInAccount = (GoogleSignInAccount) Q0.a.m(parcel, readInt3, GoogleSignInAccount.CREATOR);
                    } else if (c3 != '\b') {
                        Q0.a.X(readInt3, parcel);
                    } else {
                        str13 = Q0.a.n(readInt3, parcel);
                    }
                }
                Q0.a.y(a04, parcel);
                return new SignInAccount(str12, googleSignInAccount, str13);
        }
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i7) {
        switch (this.f12401a) {
            case 0:
                return new GoogleSignInAccount[i7];
            case 1:
                return new GoogleSignInOptions[i7];
            default:
                return new SignInAccount[i7];
        }
    }
}
