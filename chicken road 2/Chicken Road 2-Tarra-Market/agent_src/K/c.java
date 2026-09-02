package K;

import Q.C0006d;
import Q.C0007e;
import Q.g;
import Q.i;
import Q.j;
import Q.n;
import Q.o;
import Q.y;
import a.AbstractC0009a;
import android.accounts.Account;
import android.app.PendingIntent;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.versionedparcelable.ParcelImpl;
import com.google.android.gms.auth.api.signin.GoogleSignInAccount;
import com.google.android.gms.common.api.Scope;
import com.google.android.gms.common.api.Status;
import d0.C0053b;
import d0.C0055d;
import d0.C0056e;
import java.util.ArrayList;

/* loaded from: classes.dex */
public final class c implements Parcelable.Creator {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f196a;

    public /* synthetic */ c(int i2) {
        this.f196a = i2;
    }

    public static void a(C0007e c0007e, Parcel parcel, int i2) {
        int L = V.a.L(parcel, 20293);
        int i3 = c0007e.f414a;
        V.a.N(parcel, 1, 4);
        parcel.writeInt(i3);
        V.a.N(parcel, 2, 4);
        parcel.writeInt(c0007e.f415b);
        V.a.N(parcel, 3, 4);
        parcel.writeInt(c0007e.f416c);
        V.a.I(parcel, 4, c0007e.f417d);
        IBinder iBinder = c0007e.f418e;
        if (iBinder != null) {
            int L2 = V.a.L(parcel, 5);
            parcel.writeStrongBinder(iBinder);
            V.a.M(parcel, L2);
        }
        V.a.J(parcel, 6, c0007e.f419f, i2);
        Bundle bundle = c0007e.f420g;
        if (bundle != null) {
            int L3 = V.a.L(parcel, 7);
            parcel.writeBundle(bundle);
            V.a.M(parcel, L3);
        }
        V.a.H(parcel, 8, c0007e.f421h, i2);
        V.a.J(parcel, 10, c0007e.f422i, i2);
        V.a.J(parcel, 11, c0007e.f423j, i2);
        V.a.N(parcel, 12, 4);
        parcel.writeInt(c0007e.f424k ? 1 : 0);
        V.a.N(parcel, 13, 4);
        parcel.writeInt(c0007e.f425l);
        boolean z2 = c0007e.f426m;
        V.a.N(parcel, 14, 4);
        parcel.writeInt(z2 ? 1 : 0);
        V.a.I(parcel, 15, c0007e.f427n);
        V.a.M(parcel, L);
    }

    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        switch (this.f196a) {
            case 0:
                int I2 = AbstractC0009a.I(parcel);
                String str = null;
                int i2 = 0;
                while (parcel.dataPosition() < I2) {
                    int readInt = parcel.readInt();
                    char c2 = (char) readInt;
                    if (c2 == 1) {
                        str = AbstractC0009a.g(parcel, readInt);
                    } else if (c2 != 2) {
                        AbstractC0009a.F(parcel, readInt);
                    } else {
                        i2 = AbstractC0009a.A(parcel, readInt);
                    }
                }
                AbstractC0009a.j(parcel, I2);
                return new b(str, i2);
            case 1:
                int I3 = AbstractC0009a.I(parcel);
                String str2 = null;
                String str3 = null;
                String str4 = null;
                String str5 = null;
                Uri uri = null;
                String str6 = null;
                String str7 = null;
                ArrayList arrayList = null;
                String str8 = null;
                String str9 = null;
                long j2 = 0;
                int i3 = 0;
                while (parcel.dataPosition() < I3) {
                    int readInt2 = parcel.readInt();
                    switch ((char) readInt2) {
                        case 1:
                            i3 = AbstractC0009a.A(parcel, readInt2);
                            break;
                        case 2:
                            str2 = AbstractC0009a.g(parcel, readInt2);
                            break;
                        case 3:
                            str3 = AbstractC0009a.g(parcel, readInt2);
                            break;
                        case 4:
                            str4 = AbstractC0009a.g(parcel, readInt2);
                            break;
                        case 5:
                            str5 = AbstractC0009a.g(parcel, readInt2);
                            break;
                        case 6:
                            uri = (Uri) AbstractC0009a.f(parcel, readInt2, Uri.CREATOR);
                            break;
                        case 7:
                            str6 = AbstractC0009a.g(parcel, readInt2);
                            break;
                        case '\b':
                            AbstractC0009a.K(parcel, readInt2, 8);
                            j2 = parcel.readLong();
                            break;
                        case '\t':
                            str7 = AbstractC0009a.g(parcel, readInt2);
                            break;
                        case '\n':
                            Parcelable.Creator<Scope> creator = Scope.CREATOR;
                            int B2 = AbstractC0009a.B(parcel, readInt2);
                            int dataPosition = parcel.dataPosition();
                            if (B2 != 0) {
                                ArrayList createTypedArrayList = parcel.createTypedArrayList(creator);
                                parcel.setDataPosition(dataPosition + B2);
                                arrayList = createTypedArrayList;
                                break;
                            } else {
                                arrayList = null;
                                break;
                            }
                        case 11:
                            str8 = AbstractC0009a.g(parcel, readInt2);
                            break;
                        case '\f':
                            str9 = AbstractC0009a.g(parcel, readInt2);
                            break;
                        default:
                            AbstractC0009a.F(parcel, readInt2);
                            break;
                    }
                }
                AbstractC0009a.j(parcel, I3);
                return new GoogleSignInAccount(i3, str2, str3, str4, str5, uri, str6, j2, str7, arrayList, str8, str9);
            case 2:
                int I4 = AbstractC0009a.I(parcel);
                PendingIntent pendingIntent = null;
                int i4 = 0;
                int i5 = 0;
                String str10 = null;
                while (parcel.dataPosition() < I4) {
                    int readInt3 = parcel.readInt();
                    char c3 = (char) readInt3;
                    if (c3 == 1) {
                        i4 = AbstractC0009a.A(parcel, readInt3);
                    } else if (c3 == 2) {
                        i5 = AbstractC0009a.A(parcel, readInt3);
                    } else if (c3 == 3) {
                        pendingIntent = (PendingIntent) AbstractC0009a.f(parcel, readInt3, PendingIntent.CREATOR);
                    } else if (c3 != 4) {
                        AbstractC0009a.F(parcel, readInt3);
                    } else {
                        str10 = AbstractC0009a.g(parcel, readInt3);
                    }
                }
                AbstractC0009a.j(parcel, I4);
                return new N.b(i4, i5, pendingIntent, str10);
            case 3:
                int I5 = AbstractC0009a.I(parcel);
                long j3 = -1;
                int i6 = 0;
                String str11 = null;
                while (parcel.dataPosition() < I5) {
                    int readInt4 = parcel.readInt();
                    char c4 = (char) readInt4;
                    if (c4 == 1) {
                        str11 = AbstractC0009a.g(parcel, readInt4);
                    } else if (c4 == 2) {
                        i6 = AbstractC0009a.A(parcel, readInt4);
                    } else if (c4 != 3) {
                        AbstractC0009a.F(parcel, readInt4);
                    } else {
                        AbstractC0009a.K(parcel, readInt4, 8);
                        j3 = parcel.readLong();
                    }
                }
                AbstractC0009a.j(parcel, I5);
                return new N.d(str11, i6, j3);
            case 4:
                int I6 = AbstractC0009a.I(parcel);
                String str12 = null;
                int i7 = 0;
                while (parcel.dataPosition() < I6) {
                    int readInt5 = parcel.readInt();
                    char c5 = (char) readInt5;
                    if (c5 == 1) {
                        i7 = AbstractC0009a.A(parcel, readInt5);
                    } else if (c5 != 2) {
                        AbstractC0009a.F(parcel, readInt5);
                    } else {
                        str12 = AbstractC0009a.g(parcel, readInt5);
                    }
                }
                AbstractC0009a.j(parcel, I6);
                return new Scope(i7, str12);
            case 5:
                int I7 = AbstractC0009a.I(parcel);
                String str13 = null;
                N.b bVar = null;
                int i8 = 0;
                PendingIntent pendingIntent2 = null;
                while (parcel.dataPosition() < I7) {
                    int readInt6 = parcel.readInt();
                    char c6 = (char) readInt6;
                    if (c6 == 1) {
                        i8 = AbstractC0009a.A(parcel, readInt6);
                    } else if (c6 == 2) {
                        str13 = AbstractC0009a.g(parcel, readInt6);
                    } else if (c6 == 3) {
                        pendingIntent2 = (PendingIntent) AbstractC0009a.f(parcel, readInt6, PendingIntent.CREATOR);
                    } else if (c6 != 4) {
                        AbstractC0009a.F(parcel, readInt6);
                    } else {
                        bVar = (N.b) AbstractC0009a.f(parcel, readInt6, N.b.CREATOR);
                    }
                }
                AbstractC0009a.j(parcel, I7);
                return new Status(i8, str13, pendingIntent2, bVar);
            case 6:
                int I8 = AbstractC0009a.I(parcel);
                int i9 = 0;
                while (true) {
                    ArrayList arrayList2 = null;
                    while (parcel.dataPosition() < I8) {
                        int readInt7 = parcel.readInt();
                        char c7 = (char) readInt7;
                        if (c7 == 1) {
                            i9 = AbstractC0009a.A(parcel, readInt7);
                        } else if (c7 != 2) {
                            AbstractC0009a.F(parcel, readInt7);
                        } else {
                            Parcelable.Creator<g> creator2 = g.CREATOR;
                            int B3 = AbstractC0009a.B(parcel, readInt7);
                            int dataPosition2 = parcel.dataPosition();
                            if (B3 == 0) {
                                break;
                            }
                            arrayList2 = parcel.createTypedArrayList(creator2);
                            parcel.setDataPosition(dataPosition2 + B3);
                        }
                    }
                    AbstractC0009a.j(parcel, I8);
                    return new j(i9, arrayList2);
                    break;
                }
            case 7:
                int I9 = AbstractC0009a.I(parcel);
                int i10 = -1;
                int i11 = 0;
                int i12 = 0;
                int i13 = 0;
                int i14 = 0;
                String str14 = null;
                String str15 = null;
                long j4 = 0;
                long j5 = 0;
                while (parcel.dataPosition() < I9) {
                    int readInt8 = parcel.readInt();
                    switch ((char) readInt8) {
                        case 1:
                            i11 = AbstractC0009a.A(parcel, readInt8);
                            break;
                        case 2:
                            i12 = AbstractC0009a.A(parcel, readInt8);
                            break;
                        case 3:
                            i13 = AbstractC0009a.A(parcel, readInt8);
                            break;
                        case 4:
                            AbstractC0009a.K(parcel, readInt8, 8);
                            j4 = parcel.readLong();
                            break;
                        case 5:
                            AbstractC0009a.K(parcel, readInt8, 8);
                            j5 = parcel.readLong();
                            break;
                        case 6:
                            str14 = AbstractC0009a.g(parcel, readInt8);
                            break;
                        case 7:
                            str15 = AbstractC0009a.g(parcel, readInt8);
                            break;
                        case '\b':
                            i14 = AbstractC0009a.A(parcel, readInt8);
                            break;
                        case '\t':
                            i10 = AbstractC0009a.A(parcel, readInt8);
                            break;
                        default:
                            AbstractC0009a.F(parcel, readInt8);
                            break;
                    }
                }
                AbstractC0009a.j(parcel, I9);
                return new g(i11, i12, i13, j4, j5, str14, str15, i14, i10);
            case 8:
                int I10 = AbstractC0009a.I(parcel);
                Account account = null;
                int i15 = 0;
                int i16 = 0;
                GoogleSignInAccount googleSignInAccount = null;
                while (parcel.dataPosition() < I10) {
                    int readInt9 = parcel.readInt();
                    char c8 = (char) readInt9;
                    if (c8 == 1) {
                        i15 = AbstractC0009a.A(parcel, readInt9);
                    } else if (c8 == 2) {
                        account = (Account) AbstractC0009a.f(parcel, readInt9, Account.CREATOR);
                    } else if (c8 == 3) {
                        i16 = AbstractC0009a.A(parcel, readInt9);
                    } else if (c8 != 4) {
                        AbstractC0009a.F(parcel, readInt9);
                    } else {
                        googleSignInAccount = (GoogleSignInAccount) AbstractC0009a.f(parcel, readInt9, GoogleSignInAccount.CREATOR);
                    }
                }
                AbstractC0009a.j(parcel, I10);
                return new n(i15, account, i16, googleSignInAccount);
            case 9:
                int I11 = AbstractC0009a.I(parcel);
                int i17 = 0;
                boolean z2 = false;
                boolean z3 = false;
                IBinder iBinder = null;
                N.b bVar2 = null;
                while (parcel.dataPosition() < I11) {
                    int readInt10 = parcel.readInt();
                    char c9 = (char) readInt10;
                    if (c9 == 1) {
                        i17 = AbstractC0009a.A(parcel, readInt10);
                    } else if (c9 == 2) {
                        int B4 = AbstractC0009a.B(parcel, readInt10);
                        int dataPosition3 = parcel.dataPosition();
                        if (B4 == 0) {
                            iBinder = null;
                        } else {
                            iBinder = parcel.readStrongBinder();
                            parcel.setDataPosition(dataPosition3 + B4);
                        }
                    } else if (c9 == 3) {
                        bVar2 = (N.b) AbstractC0009a.f(parcel, readInt10, N.b.CREATOR);
                    } else if (c9 == 4) {
                        z2 = AbstractC0009a.y(parcel, readInt10);
                    } else if (c9 != 5) {
                        AbstractC0009a.F(parcel, readInt10);
                    } else {
                        z3 = AbstractC0009a.y(parcel, readInt10);
                    }
                }
                AbstractC0009a.j(parcel, I11);
                return new o(i17, iBinder, bVar2, z2, z3);
            case 10:
                int I12 = AbstractC0009a.I(parcel);
                int i18 = 0;
                int i19 = 0;
                int i20 = 0;
                boolean z4 = false;
                boolean z5 = false;
                while (parcel.dataPosition() < I12) {
                    int readInt11 = parcel.readInt();
                    char c10 = (char) readInt11;
                    if (c10 == 1) {
                        i18 = AbstractC0009a.A(parcel, readInt11);
                    } else if (c10 == 2) {
                        z4 = AbstractC0009a.y(parcel, readInt11);
                    } else if (c10 == 3) {
                        z5 = AbstractC0009a.y(parcel, readInt11);
                    } else if (c10 == 4) {
                        i19 = AbstractC0009a.A(parcel, readInt11);
                    } else if (c10 != 5) {
                        AbstractC0009a.F(parcel, readInt11);
                    } else {
                        i20 = AbstractC0009a.A(parcel, readInt11);
                    }
                }
                AbstractC0009a.j(parcel, I12);
                return new i(i18, i19, i20, z4, z5);
            case 11:
                int I13 = AbstractC0009a.I(parcel);
                int i21 = 0;
                Bundle bundle = null;
                N.d[] dVarArr = null;
                C0006d c0006d = null;
                while (parcel.dataPosition() < I13) {
                    int readInt12 = parcel.readInt();
                    char c11 = (char) readInt12;
                    if (c11 == 1) {
                        int B5 = AbstractC0009a.B(parcel, readInt12);
                        int dataPosition4 = parcel.dataPosition();
                        if (B5 == 0) {
                            bundle = null;
                        } else {
                            Bundle readBundle = parcel.readBundle();
                            parcel.setDataPosition(dataPosition4 + B5);
                            bundle = readBundle;
                        }
                    } else if (c11 == 2) {
                        dVarArr = (N.d[]) AbstractC0009a.h(parcel, readInt12, N.d.CREATOR);
                    } else if (c11 == 3) {
                        i21 = AbstractC0009a.A(parcel, readInt12);
                    } else if (c11 != 4) {
                        AbstractC0009a.F(parcel, readInt12);
                    } else {
                        c0006d = (C0006d) AbstractC0009a.f(parcel, readInt12, C0006d.CREATOR);
                    }
                }
                AbstractC0009a.j(parcel, I13);
                y yVar = new y();
                yVar.f480a = bundle;
                yVar.f481b = dVarArr;
                yVar.f482c = i21;
                yVar.f483d = c0006d;
                return yVar;
            case 12:
                int I14 = AbstractC0009a.I(parcel);
                i iVar = null;
                int[] iArr = null;
                int[] iArr2 = null;
                boolean z6 = false;
                boolean z7 = false;
                int i22 = 0;
                while (parcel.dataPosition() < I14) {
                    int readInt13 = parcel.readInt();
                    switch ((char) readInt13) {
                        case 1:
                            iVar = (i) AbstractC0009a.f(parcel, readInt13, i.CREATOR);
                            break;
                        case 2:
                            z6 = AbstractC0009a.y(parcel, readInt13);
                            break;
                        case 3:
                            z7 = AbstractC0009a.y(parcel, readInt13);
                            break;
                        case 4:
                            int B6 = AbstractC0009a.B(parcel, readInt13);
                            int dataPosition5 = parcel.dataPosition();
                            if (B6 != 0) {
                                iArr = parcel.createIntArray();
                                parcel.setDataPosition(dataPosition5 + B6);
                                break;
                            } else {
                                iArr = null;
                                break;
                            }
                        case 5:
                            i22 = AbstractC0009a.A(parcel, readInt13);
                            break;
                        case 6:
                            int B7 = AbstractC0009a.B(parcel, readInt13);
                            int dataPosition6 = parcel.dataPosition();
                            if (B7 != 0) {
                                iArr2 = parcel.createIntArray();
                                parcel.setDataPosition(dataPosition6 + B7);
                                break;
                            } else {
                                iArr2 = null;
                                break;
                            }
                        default:
                            AbstractC0009a.F(parcel, readInt13);
                            break;
                    }
                }
                AbstractC0009a.j(parcel, I14);
                return new C0006d(iVar, z6, z7, iArr, i22, iArr2);
            case 13:
                int I15 = AbstractC0009a.I(parcel);
                Scope[] scopeArr = C0007e.f412o;
                Bundle bundle2 = new Bundle();
                N.d[] dVarArr2 = C0007e.f413p;
                N.d[] dVarArr3 = dVarArr2;
                String str16 = null;
                IBinder iBinder2 = null;
                Account account2 = null;
                String str17 = null;
                int i23 = 0;
                int i24 = 0;
                int i25 = 0;
                boolean z8 = false;
                int i26 = 0;
                boolean z9 = false;
                while (parcel.dataPosition() < I15) {
                    int readInt14 = parcel.readInt();
                    switch ((char) readInt14) {
                        case 1:
                            i23 = AbstractC0009a.A(parcel, readInt14);
                            break;
                        case 2:
                            i24 = AbstractC0009a.A(parcel, readInt14);
                            break;
                        case 3:
                            i25 = AbstractC0009a.A(parcel, readInt14);
                            break;
                        case 4:
                            str16 = AbstractC0009a.g(parcel, readInt14);
                            break;
                        case 5:
                            int B8 = AbstractC0009a.B(parcel, readInt14);
                            int dataPosition7 = parcel.dataPosition();
                            if (B8 != 0) {
                                IBinder readStrongBinder = parcel.readStrongBinder();
                                parcel.setDataPosition(dataPosition7 + B8);
                                iBinder2 = readStrongBinder;
                                break;
                            } else {
                                iBinder2 = null;
                                break;
                            }
                        case 6:
                            scopeArr = (Scope[]) AbstractC0009a.h(parcel, readInt14, Scope.CREATOR);
                            break;
                        case 7:
                            int B9 = AbstractC0009a.B(parcel, readInt14);
                            int dataPosition8 = parcel.dataPosition();
                            if (B9 != 0) {
                                Bundle readBundle2 = parcel.readBundle();
                                parcel.setDataPosition(dataPosition8 + B9);
                                bundle2 = readBundle2;
                                break;
                            } else {
                                bundle2 = null;
                                break;
                            }
                        case '\b':
                            account2 = (Account) AbstractC0009a.f(parcel, readInt14, Account.CREATOR);
                            break;
                        case '\t':
                        default:
                            AbstractC0009a.F(parcel, readInt14);
                            break;
                        case '\n':
                            dVarArr2 = (N.d[]) AbstractC0009a.h(parcel, readInt14, N.d.CREATOR);
                            break;
                        case 11:
                            dVarArr3 = (N.d[]) AbstractC0009a.h(parcel, readInt14, N.d.CREATOR);
                            break;
                        case '\f':
                            z8 = AbstractC0009a.y(parcel, readInt14);
                            break;
                        case '\r':
                            i26 = AbstractC0009a.A(parcel, readInt14);
                            break;
                        case 14:
                            z9 = AbstractC0009a.y(parcel, readInt14);
                            break;
                        case 15:
                            str17 = AbstractC0009a.g(parcel, readInt14);
                            break;
                    }
                }
                AbstractC0009a.j(parcel, I15);
                return new C0007e(i23, i24, i25, str16, iBinder2, scopeArr, bundle2, account2, dVarArr2, dVarArr3, z8, i26, z9, str17);
            case 14:
                int I16 = AbstractC0009a.I(parcel);
                Intent intent = null;
                int i27 = 0;
                int i28 = 0;
                while (parcel.dataPosition() < I16) {
                    int readInt15 = parcel.readInt();
                    char c12 = (char) readInt15;
                    if (c12 == 1) {
                        i27 = AbstractC0009a.A(parcel, readInt15);
                    } else if (c12 == 2) {
                        i28 = AbstractC0009a.A(parcel, readInt15);
                    } else if (c12 != 3) {
                        AbstractC0009a.F(parcel, readInt15);
                    } else {
                        intent = (Intent) AbstractC0009a.f(parcel, readInt15, Intent.CREATOR);
                    }
                }
                AbstractC0009a.j(parcel, I16);
                return new C0053b(i27, i28, intent);
            case 15:
                int I17 = AbstractC0009a.I(parcel);
                ArrayList<String> arrayList3 = null;
                String str18 = null;
                while (parcel.dataPosition() < I17) {
                    int readInt16 = parcel.readInt();
                    char c13 = (char) readInt16;
                    if (c13 == 1) {
                        int B10 = AbstractC0009a.B(parcel, readInt16);
                        int dataPosition9 = parcel.dataPosition();
                        if (B10 == 0) {
                            arrayList3 = null;
                        } else {
                            ArrayList<String> createStringArrayList = parcel.createStringArrayList();
                            parcel.setDataPosition(dataPosition9 + B10);
                            arrayList3 = createStringArrayList;
                        }
                    } else if (c13 != 2) {
                        AbstractC0009a.F(parcel, readInt16);
                    } else {
                        str18 = AbstractC0009a.g(parcel, readInt16);
                    }
                }
                AbstractC0009a.j(parcel, I17);
                return new C0055d(arrayList3, str18);
            case 16:
                int I18 = AbstractC0009a.I(parcel);
                N.b bVar3 = null;
                int i29 = 0;
                o oVar = null;
                while (parcel.dataPosition() < I18) {
                    int readInt17 = parcel.readInt();
                    char c14 = (char) readInt17;
                    if (c14 == 1) {
                        i29 = AbstractC0009a.A(parcel, readInt17);
                    } else if (c14 == 2) {
                        bVar3 = (N.b) AbstractC0009a.f(parcel, readInt17, N.b.CREATOR);
                    } else if (c14 != 3) {
                        AbstractC0009a.F(parcel, readInt17);
                    } else {
                        oVar = (o) AbstractC0009a.f(parcel, readInt17, o.CREATOR);
                    }
                }
                AbstractC0009a.j(parcel, I18);
                return new C0056e(i29, bVar3, oVar);
            default:
                return new ParcelImpl(parcel);
        }
    }

    @Override // android.os.Parcelable.Creator
    public final Object[] newArray(int i2) {
        switch (this.f196a) {
            case 0:
                return new b[i2];
            case 1:
                return new GoogleSignInAccount[i2];
            case 2:
                return new N.b[i2];
            case 3:
                return new N.d[i2];
            case 4:
                return new Scope[i2];
            case 5:
                return new Status[i2];
            case 6:
                return new j[i2];
            case 7:
                return new g[i2];
            case 8:
                return new n[i2];
            case 9:
                return new o[i2];
            case 10:
                return new i[i2];
            case 11:
                return new y[i2];
            case 12:
                return new C0006d[i2];
            case 13:
                return new C0007e[i2];
            case 14:
                return new C0053b[i2];
            case 15:
                return new C0055d[i2];
            case 16:
                return new C0056e[i2];
            default:
                return new ParcelImpl[i2];
        }
    }
}
