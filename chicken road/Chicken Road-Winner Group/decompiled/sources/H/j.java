package H;

import S0.C0060c;
import S0.x;
import U.C0074n;
import U.J;
import U.L;
import a.AbstractC0086a;
import android.accounts.Account;
import android.app.PendingIntent;
import android.content.Intent;
import android.content.IntentSender;
import android.location.Location;
import android.net.Uri;
import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.versionedparcelable.ParcelImpl;
import com.google.android.gms.auth.api.signin.GoogleSignInAccount;
import com.google.android.gms.common.api.Scope;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.location.LocationAvailability;
import com.google.android.gms.location.LocationRequest;
import com.google.android.gms.location.LocationResult;
import e.C0280a;
import e.C0285f;
import io.appmetrica.analytics.AppMetricaDefaultValues;
import io.appmetrica.analytics.impl.C0644l9;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes.dex */
public final class j implements Parcelable.Creator {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f478a;

    public /* synthetic */ j(int i3) {
        this.f478a = i3;
    }

    public static void a(S0.d dVar, Parcel parcel, int i3) {
        int Q2 = F2.b.Q(parcel, 20293);
        F2.b.S(parcel, 1, 4);
        parcel.writeInt(dVar.f1306a);
        F2.b.S(parcel, 2, 4);
        parcel.writeInt(dVar.f1307b);
        F2.b.S(parcel, 3, 4);
        parcel.writeInt(dVar.f1308c);
        F2.b.N(parcel, 4, dVar.f1309d);
        F2.b.L(parcel, 5, dVar.f1310e);
        F2.b.O(parcel, 6, dVar.f, i3);
        Bundle bundle = dVar.f1311g;
        if (bundle != null) {
            int Q3 = F2.b.Q(parcel, 7);
            parcel.writeBundle(bundle);
            F2.b.R(parcel, Q3);
        }
        F2.b.M(parcel, 8, dVar.f1312h, i3);
        F2.b.O(parcel, 10, dVar.f1313i, i3);
        F2.b.O(parcel, 11, dVar.f1314j, i3);
        F2.b.S(parcel, 12, 4);
        parcel.writeInt(dVar.f1315k ? 1 : 0);
        F2.b.S(parcel, 13, 4);
        parcel.writeInt(dVar.f1316l);
        boolean z3 = dVar.f1317m;
        F2.b.S(parcel, 14, 4);
        parcel.writeInt(z3 ? 1 : 0);
        F2.b.N(parcel, 15, dVar.f1318n);
        F2.b.R(parcel, Q2);
    }

    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel inParcel) {
        switch (this.f478a) {
            case 0:
                k kVar = new k(inParcel);
                kVar.f479a = inParcel.readInt();
                return kVar;
            case 1:
                int e02 = AbstractC0086a.e0(inParcel);
                String str = null;
                int i3 = 0;
                while (inParcel.dataPosition() < e02) {
                    int readInt = inParcel.readInt();
                    char c3 = (char) readInt;
                    if (c3 == 1) {
                        str = AbstractC0086a.o(inParcel, readInt);
                    } else if (c3 != 2) {
                        AbstractC0086a.Y(inParcel, readInt);
                    } else {
                        i3 = AbstractC0086a.Q(inParcel, readInt);
                    }
                }
                AbstractC0086a.u(inParcel, e02);
                return new M0.b(str, i3);
            case 2:
                int e03 = AbstractC0086a.e0(inParcel);
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
                long j3 = 0;
                int i4 = 0;
                while (inParcel.dataPosition() < e03) {
                    int readInt2 = inParcel.readInt();
                    switch ((char) readInt2) {
                        case 1:
                            i4 = AbstractC0086a.Q(inParcel, readInt2);
                            break;
                        case 2:
                            str2 = AbstractC0086a.o(inParcel, readInt2);
                            break;
                        case 3:
                            str3 = AbstractC0086a.o(inParcel, readInt2);
                            break;
                        case 4:
                            str4 = AbstractC0086a.o(inParcel, readInt2);
                            break;
                        case 5:
                            str5 = AbstractC0086a.o(inParcel, readInt2);
                            break;
                        case 6:
                            uri = (Uri) AbstractC0086a.n(inParcel, readInt2, Uri.CREATOR);
                            break;
                        case 7:
                            str6 = AbstractC0086a.o(inParcel, readInt2);
                            break;
                        case '\b':
                            j3 = AbstractC0086a.R(inParcel, readInt2);
                            break;
                        case '\t':
                            str7 = AbstractC0086a.o(inParcel, readInt2);
                            break;
                        case '\n':
                            arrayList = AbstractC0086a.q(inParcel, readInt2, Scope.CREATOR);
                            break;
                        case 11:
                            str8 = AbstractC0086a.o(inParcel, readInt2);
                            break;
                        case '\f':
                            str9 = AbstractC0086a.o(inParcel, readInt2);
                            break;
                        default:
                            AbstractC0086a.Y(inParcel, readInt2);
                            break;
                    }
                }
                AbstractC0086a.u(inParcel, e03);
                return new GoogleSignInAccount(i4, str2, str3, str4, str5, uri, str6, j3, str7, arrayList, str8, str9);
            case 3:
                int e04 = AbstractC0086a.e0(inParcel);
                PendingIntent pendingIntent = null;
                int i5 = 0;
                int i6 = 0;
                String str10 = null;
                while (inParcel.dataPosition() < e04) {
                    int readInt3 = inParcel.readInt();
                    char c4 = (char) readInt3;
                    if (c4 == 1) {
                        i5 = AbstractC0086a.Q(inParcel, readInt3);
                    } else if (c4 == 2) {
                        i6 = AbstractC0086a.Q(inParcel, readInt3);
                    } else if (c4 == 3) {
                        pendingIntent = (PendingIntent) AbstractC0086a.n(inParcel, readInt3, PendingIntent.CREATOR);
                    } else if (c4 != 4) {
                        AbstractC0086a.Y(inParcel, readInt3);
                    } else {
                        str10 = AbstractC0086a.o(inParcel, readInt3);
                    }
                }
                AbstractC0086a.u(inParcel, e04);
                return new P0.b(i5, i6, pendingIntent, str10);
            case 4:
                int e05 = AbstractC0086a.e0(inParcel);
                long j4 = -1;
                int i7 = 0;
                String str11 = null;
                while (inParcel.dataPosition() < e05) {
                    int readInt4 = inParcel.readInt();
                    char c5 = (char) readInt4;
                    if (c5 == 1) {
                        str11 = AbstractC0086a.o(inParcel, readInt4);
                    } else if (c5 == 2) {
                        i7 = AbstractC0086a.Q(inParcel, readInt4);
                    } else if (c5 != 3) {
                        AbstractC0086a.Y(inParcel, readInt4);
                    } else {
                        j4 = AbstractC0086a.R(inParcel, readInt4);
                    }
                }
                AbstractC0086a.u(inParcel, e05);
                return new P0.d(str11, i7, j4);
            case 5:
                int e06 = AbstractC0086a.e0(inParcel);
                String str12 = null;
                int i8 = 0;
                while (inParcel.dataPosition() < e06) {
                    int readInt5 = inParcel.readInt();
                    char c6 = (char) readInt5;
                    if (c6 == 1) {
                        i8 = AbstractC0086a.Q(inParcel, readInt5);
                    } else if (c6 != 2) {
                        AbstractC0086a.Y(inParcel, readInt5);
                    } else {
                        str12 = AbstractC0086a.o(inParcel, readInt5);
                    }
                }
                AbstractC0086a.u(inParcel, e06);
                return new Scope(i8, str12);
            case 6:
                int e07 = AbstractC0086a.e0(inParcel);
                String str13 = null;
                P0.b bVar = null;
                int i9 = 0;
                PendingIntent pendingIntent2 = null;
                while (inParcel.dataPosition() < e07) {
                    int readInt6 = inParcel.readInt();
                    char c7 = (char) readInt6;
                    if (c7 == 1) {
                        i9 = AbstractC0086a.Q(inParcel, readInt6);
                    } else if (c7 == 2) {
                        str13 = AbstractC0086a.o(inParcel, readInt6);
                    } else if (c7 == 3) {
                        pendingIntent2 = (PendingIntent) AbstractC0086a.n(inParcel, readInt6, PendingIntent.CREATOR);
                    } else if (c7 != 4) {
                        AbstractC0086a.Y(inParcel, readInt6);
                    } else {
                        bVar = (P0.b) AbstractC0086a.n(inParcel, readInt6, P0.b.CREATOR);
                    }
                }
                AbstractC0086a.u(inParcel, e07);
                return new Status(i9, str13, pendingIntent2, bVar);
            case 7:
                int e08 = AbstractC0086a.e0(inParcel);
                ArrayList arrayList2 = null;
                int i10 = 0;
                while (inParcel.dataPosition() < e08) {
                    int readInt7 = inParcel.readInt();
                    char c8 = (char) readInt7;
                    if (c8 == 1) {
                        i10 = AbstractC0086a.Q(inParcel, readInt7);
                    } else if (c8 != 2) {
                        AbstractC0086a.Y(inParcel, readInt7);
                    } else {
                        arrayList2 = AbstractC0086a.q(inParcel, readInt7, S0.f.CREATOR);
                    }
                }
                AbstractC0086a.u(inParcel, e08);
                return new S0.i(i10, arrayList2);
            case 8:
                int e09 = AbstractC0086a.e0(inParcel);
                int i11 = -1;
                int i12 = 0;
                int i13 = 0;
                int i14 = 0;
                int i15 = 0;
                String str14 = null;
                String str15 = null;
                long j5 = 0;
                long j6 = 0;
                while (inParcel.dataPosition() < e09) {
                    int readInt8 = inParcel.readInt();
                    switch ((char) readInt8) {
                        case 1:
                            i12 = AbstractC0086a.Q(inParcel, readInt8);
                            break;
                        case 2:
                            i13 = AbstractC0086a.Q(inParcel, readInt8);
                            break;
                        case 3:
                            i14 = AbstractC0086a.Q(inParcel, readInt8);
                            break;
                        case 4:
                            j5 = AbstractC0086a.R(inParcel, readInt8);
                            break;
                        case 5:
                            j6 = AbstractC0086a.R(inParcel, readInt8);
                            break;
                        case 6:
                            str14 = AbstractC0086a.o(inParcel, readInt8);
                            break;
                        case 7:
                            str15 = AbstractC0086a.o(inParcel, readInt8);
                            break;
                        case '\b':
                            i15 = AbstractC0086a.Q(inParcel, readInt8);
                            break;
                        case '\t':
                            i11 = AbstractC0086a.Q(inParcel, readInt8);
                            break;
                        default:
                            AbstractC0086a.Y(inParcel, readInt8);
                            break;
                    }
                }
                AbstractC0086a.u(inParcel, e09);
                return new S0.f(i12, i13, i14, j5, j6, str14, str15, i15, i11);
            case 9:
                int e010 = AbstractC0086a.e0(inParcel);
                Account account = null;
                int i16 = 0;
                int i17 = 0;
                GoogleSignInAccount googleSignInAccount = null;
                while (inParcel.dataPosition() < e010) {
                    int readInt9 = inParcel.readInt();
                    char c9 = (char) readInt9;
                    if (c9 == 1) {
                        i16 = AbstractC0086a.Q(inParcel, readInt9);
                    } else if (c9 == 2) {
                        account = (Account) AbstractC0086a.n(inParcel, readInt9, Account.CREATOR);
                    } else if (c9 == 3) {
                        i17 = AbstractC0086a.Q(inParcel, readInt9);
                    } else if (c9 != 4) {
                        AbstractC0086a.Y(inParcel, readInt9);
                    } else {
                        googleSignInAccount = (GoogleSignInAccount) AbstractC0086a.n(inParcel, readInt9, GoogleSignInAccount.CREATOR);
                    }
                }
                AbstractC0086a.u(inParcel, e010);
                return new S0.m(i16, account, i17, googleSignInAccount);
            case 10:
                int e011 = AbstractC0086a.e0(inParcel);
                int i18 = 0;
                boolean z3 = false;
                boolean z4 = false;
                IBinder iBinder = null;
                P0.b bVar2 = null;
                while (inParcel.dataPosition() < e011) {
                    int readInt10 = inParcel.readInt();
                    char c10 = (char) readInt10;
                    if (c10 == 1) {
                        i18 = AbstractC0086a.Q(inParcel, readInt10);
                    } else if (c10 == 2) {
                        iBinder = AbstractC0086a.P(inParcel, readInt10);
                    } else if (c10 == 3) {
                        bVar2 = (P0.b) AbstractC0086a.n(inParcel, readInt10, P0.b.CREATOR);
                    } else if (c10 == 4) {
                        z3 = AbstractC0086a.M(inParcel, readInt10);
                    } else if (c10 != 5) {
                        AbstractC0086a.Y(inParcel, readInt10);
                    } else {
                        z4 = AbstractC0086a.M(inParcel, readInt10);
                    }
                }
                AbstractC0086a.u(inParcel, e011);
                return new S0.n(i18, iBinder, bVar2, z3, z4);
            case 11:
                int e012 = AbstractC0086a.e0(inParcel);
                int i19 = 0;
                boolean z5 = false;
                boolean z6 = false;
                int i20 = 0;
                int i21 = 0;
                while (inParcel.dataPosition() < e012) {
                    int readInt11 = inParcel.readInt();
                    char c11 = (char) readInt11;
                    if (c11 == 1) {
                        i19 = AbstractC0086a.Q(inParcel, readInt11);
                    } else if (c11 == 2) {
                        z5 = AbstractC0086a.M(inParcel, readInt11);
                    } else if (c11 == 3) {
                        z6 = AbstractC0086a.M(inParcel, readInt11);
                    } else if (c11 == 4) {
                        i20 = AbstractC0086a.Q(inParcel, readInt11);
                    } else if (c11 != 5) {
                        AbstractC0086a.Y(inParcel, readInt11);
                    } else {
                        i21 = AbstractC0086a.Q(inParcel, readInt11);
                    }
                }
                AbstractC0086a.u(inParcel, e012);
                return new S0.h(i19, z5, z6, i20, i21);
            case 12:
                int e013 = AbstractC0086a.e0(inParcel);
                int i22 = 0;
                Bundle bundle = null;
                P0.d[] dVarArr = null;
                C0060c c0060c = null;
                while (inParcel.dataPosition() < e013) {
                    int readInt12 = inParcel.readInt();
                    char c12 = (char) readInt12;
                    if (c12 == 1) {
                        int S2 = AbstractC0086a.S(inParcel, readInt12);
                        int dataPosition = inParcel.dataPosition();
                        if (S2 == 0) {
                            bundle = null;
                        } else {
                            Bundle readBundle = inParcel.readBundle();
                            inParcel.setDataPosition(dataPosition + S2);
                            bundle = readBundle;
                        }
                    } else if (c12 == 2) {
                        dVarArr = (P0.d[]) AbstractC0086a.p(inParcel, readInt12, P0.d.CREATOR);
                    } else if (c12 == 3) {
                        i22 = AbstractC0086a.Q(inParcel, readInt12);
                    } else if (c12 != 4) {
                        AbstractC0086a.Y(inParcel, readInt12);
                    } else {
                        c0060c = (C0060c) AbstractC0086a.n(inParcel, readInt12, C0060c.CREATOR);
                    }
                }
                AbstractC0086a.u(inParcel, e013);
                x xVar = new x();
                xVar.f1369a = bundle;
                xVar.f1370b = dVarArr;
                xVar.f1371c = i22;
                xVar.f1372d = c0060c;
                return xVar;
            case 13:
                int e014 = AbstractC0086a.e0(inParcel);
                S0.h hVar = null;
                int[] iArr = null;
                int[] iArr2 = null;
                boolean z7 = false;
                boolean z8 = false;
                int i23 = 0;
                while (inParcel.dataPosition() < e014) {
                    int readInt13 = inParcel.readInt();
                    switch ((char) readInt13) {
                        case 1:
                            hVar = (S0.h) AbstractC0086a.n(inParcel, readInt13, S0.h.CREATOR);
                            break;
                        case 2:
                            z7 = AbstractC0086a.M(inParcel, readInt13);
                            break;
                        case 3:
                            z8 = AbstractC0086a.M(inParcel, readInt13);
                            break;
                        case 4:
                            int S3 = AbstractC0086a.S(inParcel, readInt13);
                            int dataPosition2 = inParcel.dataPosition();
                            if (S3 != 0) {
                                iArr = inParcel.createIntArray();
                                inParcel.setDataPosition(dataPosition2 + S3);
                                break;
                            } else {
                                iArr = null;
                                break;
                            }
                        case 5:
                            i23 = AbstractC0086a.Q(inParcel, readInt13);
                            break;
                        case 6:
                            int S4 = AbstractC0086a.S(inParcel, readInt13);
                            int dataPosition3 = inParcel.dataPosition();
                            if (S4 != 0) {
                                iArr2 = inParcel.createIntArray();
                                inParcel.setDataPosition(dataPosition3 + S4);
                                break;
                            } else {
                                iArr2 = null;
                                break;
                            }
                        default:
                            AbstractC0086a.Y(inParcel, readInt13);
                            break;
                    }
                }
                AbstractC0086a.u(inParcel, e014);
                return new C0060c(hVar, z7, z8, iArr, i23, iArr2);
            case 14:
                int e015 = AbstractC0086a.e0(inParcel);
                Scope[] scopeArr = S0.d.f1304o;
                Bundle bundle2 = new Bundle();
                P0.d[] dVarArr2 = S0.d.f1305p;
                P0.d[] dVarArr3 = dVarArr2;
                String str16 = null;
                IBinder iBinder2 = null;
                Account account2 = null;
                String str17 = null;
                int i24 = 0;
                int i25 = 0;
                int i26 = 0;
                boolean z9 = false;
                int i27 = 0;
                boolean z10 = false;
                while (inParcel.dataPosition() < e015) {
                    int readInt14 = inParcel.readInt();
                    switch ((char) readInt14) {
                        case 1:
                            i24 = AbstractC0086a.Q(inParcel, readInt14);
                            break;
                        case 2:
                            i25 = AbstractC0086a.Q(inParcel, readInt14);
                            break;
                        case 3:
                            i26 = AbstractC0086a.Q(inParcel, readInt14);
                            break;
                        case 4:
                            str16 = AbstractC0086a.o(inParcel, readInt14);
                            break;
                        case 5:
                            iBinder2 = AbstractC0086a.P(inParcel, readInt14);
                            break;
                        case 6:
                            scopeArr = (Scope[]) AbstractC0086a.p(inParcel, readInt14, Scope.CREATOR);
                            break;
                        case 7:
                            int S5 = AbstractC0086a.S(inParcel, readInt14);
                            int dataPosition4 = inParcel.dataPosition();
                            if (S5 != 0) {
                                Bundle readBundle2 = inParcel.readBundle();
                                inParcel.setDataPosition(dataPosition4 + S5);
                                bundle2 = readBundle2;
                                break;
                            } else {
                                bundle2 = null;
                                break;
                            }
                        case '\b':
                            account2 = (Account) AbstractC0086a.n(inParcel, readInt14, Account.CREATOR);
                            break;
                        case '\t':
                        default:
                            AbstractC0086a.Y(inParcel, readInt14);
                            break;
                        case '\n':
                            dVarArr2 = (P0.d[]) AbstractC0086a.p(inParcel, readInt14, P0.d.CREATOR);
                            break;
                        case 11:
                            dVarArr3 = (P0.d[]) AbstractC0086a.p(inParcel, readInt14, P0.d.CREATOR);
                            break;
                        case '\f':
                            z9 = AbstractC0086a.M(inParcel, readInt14);
                            break;
                        case '\r':
                            i27 = AbstractC0086a.Q(inParcel, readInt14);
                            break;
                        case 14:
                            z10 = AbstractC0086a.M(inParcel, readInt14);
                            break;
                        case 15:
                            str17 = AbstractC0086a.o(inParcel, readInt14);
                            break;
                    }
                }
                AbstractC0086a.u(inParcel, e015);
                return new S0.d(i24, i25, i26, str16, iBinder2, scopeArr, bundle2, account2, dVarArr2, dVarArr3, z9, i27, z10, str17);
            case 15:
                C0074n c0074n = new C0074n();
                c0074n.f1577a = inParcel.readInt();
                c0074n.f1578b = inParcel.readInt();
                c0074n.f1579c = inParcel.readInt() == 1;
                return c0074n;
            case 16:
                J j7 = new J();
                j7.f1496a = inParcel.readInt();
                j7.f1497b = inParcel.readInt();
                j7.f1499d = inParcel.readInt() == 1;
                int readInt15 = inParcel.readInt();
                if (readInt15 > 0) {
                    int[] iArr3 = new int[readInt15];
                    j7.f1498c = iArr3;
                    inParcel.readIntArray(iArr3);
                }
                return j7;
            case 17:
                L l3 = new L();
                l3.f1501a = inParcel.readInt();
                l3.f1502b = inParcel.readInt();
                int readInt16 = inParcel.readInt();
                l3.f1503c = readInt16;
                if (readInt16 > 0) {
                    int[] iArr4 = new int[readInt16];
                    l3.f1504d = iArr4;
                    inParcel.readIntArray(iArr4);
                }
                int readInt17 = inParcel.readInt();
                l3.f1505e = readInt17;
                if (readInt17 > 0) {
                    int[] iArr5 = new int[readInt17];
                    l3.f = iArr5;
                    inParcel.readIntArray(iArr5);
                }
                l3.f1507h = inParcel.readInt() == 1;
                l3.f1508i = inParcel.readInt() == 1;
                l3.f1509j = inParcel.readInt() == 1;
                l3.f1506g = inParcel.readArrayList(J.class.getClassLoader());
                return l3;
            case 18:
                return new ParcelImpl(inParcel);
            case C0644l9.f7759C /* 19 */:
                return new C0280a(inParcel);
            case C0644l9.f7760D /* 20 */:
                kotlin.jvm.internal.j.e(inParcel, "inParcel");
                Parcelable readParcelable = inParcel.readParcelable(IntentSender.class.getClassLoader());
                kotlin.jvm.internal.j.b(readParcelable);
                return new C0285f((IntentSender) readParcelable, (Intent) inParcel.readParcelable(Intent.class.getClassLoader()), inParcel.readInt(), inParcel.readInt());
            case C0644l9.f7761E /* 21 */:
                int e016 = AbstractC0086a.e0(inParcel);
                int i28 = AppMetricaDefaultValues.DEFAULT_MAX_REPORTS_IN_DATABASE_COUNT;
                long j8 = 0;
                f1.c[] cVarArr = null;
                int i29 = 1;
                int i30 = 1;
                while (inParcel.dataPosition() < e016) {
                    int readInt18 = inParcel.readInt();
                    char c13 = (char) readInt18;
                    if (c13 == 1) {
                        i29 = AbstractC0086a.Q(inParcel, readInt18);
                    } else if (c13 == 2) {
                        i30 = AbstractC0086a.Q(inParcel, readInt18);
                    } else if (c13 == 3) {
                        j8 = AbstractC0086a.R(inParcel, readInt18);
                    } else if (c13 == 4) {
                        i28 = AbstractC0086a.Q(inParcel, readInt18);
                    } else if (c13 != 5) {
                        AbstractC0086a.Y(inParcel, readInt18);
                    } else {
                        cVarArr = (f1.c[]) AbstractC0086a.p(inParcel, readInt18, f1.c.CREATOR);
                    }
                }
                AbstractC0086a.u(inParcel, e016);
                LocationAvailability locationAvailability = new LocationAvailability();
                locationAvailability.f2862d = i28;
                locationAvailability.f2859a = i29;
                locationAvailability.f2860b = i30;
                locationAvailability.f2861c = j8;
                locationAvailability.f2863e = cVarArr;
                return locationAvailability;
            case 22:
                int e017 = AbstractC0086a.e0(inParcel);
                int i31 = 102;
                long j9 = 3600000;
                long j10 = 600000;
                boolean z11 = false;
                long j11 = 0;
                float f = 0.0f;
                int i32 = Integer.MAX_VALUE;
                long j12 = Long.MAX_VALUE;
                boolean z12 = false;
                while (inParcel.dataPosition() < e017) {
                    int readInt19 = inParcel.readInt();
                    boolean z13 = z12;
                    switch ((char) readInt19) {
                        case 1:
                            i31 = AbstractC0086a.Q(inParcel, readInt19);
                            break;
                        case 2:
                            j9 = AbstractC0086a.R(inParcel, readInt19);
                            break;
                        case 3:
                            j10 = AbstractC0086a.R(inParcel, readInt19);
                            break;
                        case 4:
                            z11 = AbstractC0086a.M(inParcel, readInt19);
                            break;
                        case 5:
                            j12 = AbstractC0086a.R(inParcel, readInt19);
                            break;
                        case 6:
                            i32 = AbstractC0086a.Q(inParcel, readInt19);
                            break;
                        case 7:
                            AbstractC0086a.i0(inParcel, readInt19, 4);
                            f = inParcel.readFloat();
                            break;
                        case '\b':
                            j11 = AbstractC0086a.R(inParcel, readInt19);
                            break;
                        case '\t':
                            z12 = AbstractC0086a.M(inParcel, readInt19);
                            continue;
                        default:
                            AbstractC0086a.Y(inParcel, readInt19);
                            break;
                    }
                    z12 = z13;
                }
                AbstractC0086a.u(inParcel, e017);
                LocationRequest locationRequest = new LocationRequest();
                locationRequest.f2864a = i31;
                locationRequest.f2865b = j9;
                locationRequest.f2866c = j10;
                locationRequest.f2867d = z11;
                locationRequest.f2868e = j12;
                locationRequest.f = i32;
                locationRequest.f2869g = f;
                locationRequest.f2870h = j11;
                locationRequest.f2871i = z12;
                return locationRequest;
            case 23:
                int e018 = AbstractC0086a.e0(inParcel);
                List list = LocationResult.f2872b;
                while (inParcel.dataPosition() < e018) {
                    int readInt20 = inParcel.readInt();
                    if (((char) readInt20) != 1) {
                        AbstractC0086a.Y(inParcel, readInt20);
                    } else {
                        list = AbstractC0086a.q(inParcel, readInt20, Location.CREATOR);
                    }
                }
                AbstractC0086a.u(inParcel, e018);
                return new LocationResult(list);
            case 24:
                int e019 = AbstractC0086a.e0(inParcel);
                int i33 = 1;
                int i34 = 1;
                long j13 = -1;
                long j14 = -1;
                while (inParcel.dataPosition() < e019) {
                    int readInt21 = inParcel.readInt();
                    char c14 = (char) readInt21;
                    if (c14 == 1) {
                        i33 = AbstractC0086a.Q(inParcel, readInt21);
                    } else if (c14 == 2) {
                        i34 = AbstractC0086a.Q(inParcel, readInt21);
                    } else if (c14 == 3) {
                        j13 = AbstractC0086a.R(inParcel, readInt21);
                    } else if (c14 != 4) {
                        AbstractC0086a.Y(inParcel, readInt21);
                    } else {
                        j14 = AbstractC0086a.R(inParcel, readInt21);
                    }
                }
                AbstractC0086a.u(inParcel, e019);
                return new f1.c(i33, i34, j13, j14);
            case C0644l9.f7762F /* 25 */:
                int e020 = AbstractC0086a.e0(inParcel);
                Intent intent = null;
                int i35 = 0;
                int i36 = 0;
                while (inParcel.dataPosition() < e020) {
                    int readInt22 = inParcel.readInt();
                    char c15 = (char) readInt22;
                    if (c15 == 1) {
                        i35 = AbstractC0086a.Q(inParcel, readInt22);
                    } else if (c15 == 2) {
                        i36 = AbstractC0086a.Q(inParcel, readInt22);
                    } else if (c15 != 3) {
                        AbstractC0086a.Y(inParcel, readInt22);
                    } else {
                        intent = (Intent) AbstractC0086a.n(inParcel, readInt22, Intent.CREATOR);
                    }
                }
                AbstractC0086a.u(inParcel, e020);
                return new h1.b(i35, i36, intent);
            case C0644l9.f7763G /* 26 */:
                int e021 = AbstractC0086a.e0(inParcel);
                ArrayList<String> arrayList3 = null;
                String str18 = null;
                while (inParcel.dataPosition() < e021) {
                    int readInt23 = inParcel.readInt();
                    char c16 = (char) readInt23;
                    if (c16 == 1) {
                        int S6 = AbstractC0086a.S(inParcel, readInt23);
                        int dataPosition5 = inParcel.dataPosition();
                        if (S6 == 0) {
                            arrayList3 = null;
                        } else {
                            ArrayList<String> createStringArrayList = inParcel.createStringArrayList();
                            inParcel.setDataPosition(dataPosition5 + S6);
                            arrayList3 = createStringArrayList;
                        }
                    } else if (c16 != 2) {
                        AbstractC0086a.Y(inParcel, readInt23);
                    } else {
                        str18 = AbstractC0086a.o(inParcel, readInt23);
                    }
                }
                AbstractC0086a.u(inParcel, e021);
                return new h1.d(arrayList3, str18);
            default:
                int e022 = AbstractC0086a.e0(inParcel);
                P0.b bVar3 = null;
                int i37 = 0;
                S0.n nVar = null;
                while (inParcel.dataPosition() < e022) {
                    int readInt24 = inParcel.readInt();
                    char c17 = (char) readInt24;
                    if (c17 == 1) {
                        i37 = AbstractC0086a.Q(inParcel, readInt24);
                    } else if (c17 == 2) {
                        bVar3 = (P0.b) AbstractC0086a.n(inParcel, readInt24, P0.b.CREATOR);
                    } else if (c17 != 3) {
                        AbstractC0086a.Y(inParcel, readInt24);
                    } else {
                        nVar = (S0.n) AbstractC0086a.n(inParcel, readInt24, S0.n.CREATOR);
                    }
                }
                AbstractC0086a.u(inParcel, e022);
                return new h1.e(i37, bVar3, nVar);
        }
    }

    @Override // android.os.Parcelable.Creator
    public final Object[] newArray(int i3) {
        switch (this.f478a) {
            case 0:
                return new k[i3];
            case 1:
                return new M0.b[i3];
            case 2:
                return new GoogleSignInAccount[i3];
            case 3:
                return new P0.b[i3];
            case 4:
                return new P0.d[i3];
            case 5:
                return new Scope[i3];
            case 6:
                return new Status[i3];
            case 7:
                return new S0.i[i3];
            case 8:
                return new S0.f[i3];
            case 9:
                return new S0.m[i3];
            case 10:
                return new S0.n[i3];
            case 11:
                return new S0.h[i3];
            case 12:
                return new x[i3];
            case 13:
                return new C0060c[i3];
            case 14:
                return new S0.d[i3];
            case 15:
                return new C0074n[i3];
            case 16:
                return new J[i3];
            case 17:
                return new L[i3];
            case 18:
                return new ParcelImpl[i3];
            case C0644l9.f7759C /* 19 */:
                return new C0280a[i3];
            case C0644l9.f7760D /* 20 */:
                return new C0285f[i3];
            case C0644l9.f7761E /* 21 */:
                return new LocationAvailability[i3];
            case 22:
                return new LocationRequest[i3];
            case 23:
                return new LocationResult[i3];
            case 24:
                return new f1.c[i3];
            case C0644l9.f7762F /* 25 */:
                return new h1.b[i3];
            case C0644l9.f7763G /* 26 */:
                return new h1.d[i3];
            default:
                return new h1.e[i3];
        }
    }
}
