package C2;

import G1.C0141l;
import T2.C0438p;
import a.AbstractC0444a;
import android.accounts.Account;
import android.app.PendingIntent;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.versionedparcelable.ParcelImpl;
import com.google.android.gms.ads.internal.overlay.AdOverlayInfoParcel;
import com.google.android.gms.auth.api.signin.GoogleSignInAccount;
import com.google.android.gms.common.api.Scope;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.internal.ads.C1639u7;
import g.C1954a;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import k4.AbstractC2036a;
import kotlin.jvm.internal.l;
import m3.B;
import m3.C2096f;
import m3.C2097g;
import m3.j;
import m3.m;
import m3.q;
import m3.r;

/* loaded from: classes.dex */
public final class a implements Parcelable.Creator {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f817a;

    public /* synthetic */ a(int i) {
        this.f817a = i;
    }

    public static void a(C2097g c2097g, Parcel parcel, int i) {
        int k02 = AbstractC2036a.k0(parcel, 20293);
        AbstractC2036a.n0(parcel, 1, 4);
        parcel.writeInt(c2097g.f18052k);
        AbstractC2036a.n0(parcel, 2, 4);
        parcel.writeInt(c2097g.f18053l);
        AbstractC2036a.n0(parcel, 3, 4);
        parcel.writeInt(c2097g.f18054m);
        AbstractC2036a.f0(parcel, 4, c2097g.f18055n);
        AbstractC2036a.d0(parcel, 5, c2097g.f18056o);
        AbstractC2036a.i0(parcel, 6, c2097g.f18057p, i);
        AbstractC2036a.b0(parcel, 7, c2097g.f18058q);
        AbstractC2036a.e0(parcel, 8, c2097g.f18059r, i);
        AbstractC2036a.i0(parcel, 10, c2097g.f18060s, i);
        AbstractC2036a.i0(parcel, 11, c2097g.f18061t, i);
        AbstractC2036a.n0(parcel, 12, 4);
        parcel.writeInt(c2097g.f18062u ? 1 : 0);
        AbstractC2036a.n0(parcel, 13, 4);
        parcel.writeInt(c2097g.f18063v);
        boolean z3 = c2097g.f18064w;
        AbstractC2036a.n0(parcel, 14, 4);
        parcel.writeInt(z3 ? 1 : 0);
        AbstractC2036a.f0(parcel, 15, c2097g.f18065x);
        AbstractC2036a.m0(parcel, k02);
    }

    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        int readInt;
        switch (this.f817a) {
            case 0:
                String readString = parcel.readString();
                l.c(readString);
                int readInt2 = parcel.readInt();
                LinkedHashMap linkedHashMap = new LinkedHashMap(readInt2);
                for (int i = 0; i < readInt2; i++) {
                    String readString2 = parcel.readString();
                    l.c(readString2);
                    String readString3 = parcel.readString();
                    l.c(readString3);
                    linkedHashMap.put(readString2, readString3);
                }
                return new b(readString, linkedHashMap);
            case 1:
                int g02 = AbstractC0444a.g0(parcel);
                int i5 = 0;
                Intent intent = null;
                int i6 = 0;
                while (parcel.dataPosition() < g02) {
                    int readInt3 = parcel.readInt();
                    char c5 = (char) readInt3;
                    if (c5 == 1) {
                        i5 = AbstractC0444a.X(parcel, readInt3);
                    } else if (c5 == 2) {
                        i6 = AbstractC0444a.X(parcel, readInt3);
                    } else if (c5 != 3) {
                        AbstractC0444a.b0(parcel, readInt3);
                    } else {
                        intent = (Intent) AbstractC0444a.A(parcel, readInt3, Intent.CREATOR);
                    }
                }
                AbstractC0444a.G(parcel, g02);
                return new C3.b(i5, i6, intent);
            case 2:
                int g03 = AbstractC0444a.g0(parcel);
                ArrayList arrayList = null;
                String str = null;
                while (parcel.dataPosition() < g03) {
                    int readInt4 = parcel.readInt();
                    char c6 = (char) readInt4;
                    if (c6 == 1) {
                        arrayList = AbstractC0444a.D(parcel, readInt4);
                    } else if (c6 != 2) {
                        AbstractC0444a.b0(parcel, readInt4);
                    } else {
                        str = AbstractC0444a.B(parcel, readInt4);
                    }
                }
                AbstractC0444a.G(parcel, g03);
                return new C3.e(arrayList, str);
            case 3:
                int g04 = AbstractC0444a.g0(parcel);
                int i7 = 0;
                j3.b bVar = null;
                r rVar = null;
                while (parcel.dataPosition() < g04) {
                    int readInt5 = parcel.readInt();
                    char c7 = (char) readInt5;
                    if (c7 == 1) {
                        i7 = AbstractC0444a.X(parcel, readInt5);
                    } else if (c7 == 2) {
                        bVar = (j3.b) AbstractC0444a.A(parcel, readInt5, j3.b.CREATOR);
                    } else if (c7 != 3) {
                        AbstractC0444a.b0(parcel, readInt5);
                    } else {
                        rVar = (r) AbstractC0444a.A(parcel, readInt5, r.CREATOR);
                    }
                }
                AbstractC0444a.G(parcel, g04);
                return new C3.f(i7, bVar, rVar);
            case 4:
                l.f("inParcel", parcel);
                return new C0141l(parcel);
            case 5:
                int g05 = AbstractC0444a.g0(parcel);
                IBinder iBinder = null;
                boolean z3 = false;
                while (parcel.dataPosition() < g05) {
                    int readInt6 = parcel.readInt();
                    char c8 = (char) readInt6;
                    if (c8 == 1) {
                        z3 = AbstractC0444a.V(parcel, readInt6);
                    } else if (c8 != 2) {
                        AbstractC0444a.b0(parcel, readInt6);
                    } else {
                        iBinder = AbstractC0444a.W(parcel, readInt6);
                    }
                }
                AbstractC0444a.G(parcel, g05);
                return new M2.a(z3, iBinder);
            case 6:
                int g06 = AbstractC0444a.g0(parcel);
                IBinder iBinder2 = null;
                boolean z5 = false;
                IBinder iBinder3 = null;
                while (parcel.dataPosition() < g06) {
                    int readInt7 = parcel.readInt();
                    char c9 = (char) readInt7;
                    if (c9 == 1) {
                        z5 = AbstractC0444a.V(parcel, readInt7);
                    } else if (c9 == 2) {
                        iBinder2 = AbstractC0444a.W(parcel, readInt7);
                    } else if (c9 != 3) {
                        AbstractC0444a.b0(parcel, readInt7);
                    } else {
                        iBinder3 = AbstractC0444a.W(parcel, readInt7);
                    }
                }
                AbstractC0444a.G(parcel, g06);
                return new M2.d(z5, iBinder2, iBinder3);
            case 7:
                int g07 = AbstractC0444a.g0(parcel);
                boolean z6 = false;
                boolean z7 = false;
                boolean z8 = false;
                int i8 = 0;
                boolean z9 = false;
                boolean z10 = false;
                boolean z11 = false;
                float f = 0.0f;
                String str2 = null;
                while (parcel.dataPosition() < g07) {
                    int readInt8 = parcel.readInt();
                    switch ((char) readInt8) {
                        case 2:
                            z6 = AbstractC0444a.V(parcel, readInt8);
                            break;
                        case 3:
                            z7 = AbstractC0444a.V(parcel, readInt8);
                            break;
                        case 4:
                            str2 = AbstractC0444a.B(parcel, readInt8);
                            break;
                        case 5:
                            z8 = AbstractC0444a.V(parcel, readInt8);
                            break;
                        case 6:
                            AbstractC0444a.i0(parcel, readInt8, 4);
                            f = parcel.readFloat();
                            break;
                        case 7:
                            i8 = AbstractC0444a.X(parcel, readInt8);
                            break;
                        case '\b':
                            z9 = AbstractC0444a.V(parcel, readInt8);
                            break;
                        case '\t':
                            z10 = AbstractC0444a.V(parcel, readInt8);
                            break;
                        case '\n':
                            z11 = AbstractC0444a.V(parcel, readInt8);
                            break;
                        default:
                            AbstractC0444a.b0(parcel, readInt8);
                            break;
                    }
                }
                AbstractC0444a.G(parcel, g07);
                return new P2.h(z6, z7, str2, z8, f, i8, z9, z10, z11);
            case 8:
                int g08 = AbstractC0444a.g0(parcel);
                String str3 = null;
                String str4 = null;
                String str5 = null;
                while (parcel.dataPosition() < g08) {
                    int readInt9 = parcel.readInt();
                    char c10 = (char) readInt9;
                    if (c10 == 1) {
                        str3 = AbstractC0444a.B(parcel, readInt9);
                    } else if (c10 == 2) {
                        str4 = AbstractC0444a.B(parcel, readInt9);
                    } else if (c10 != 3) {
                        AbstractC0444a.b0(parcel, readInt9);
                    } else {
                        str5 = AbstractC0444a.B(parcel, readInt9);
                    }
                }
                AbstractC0444a.G(parcel, g08);
                return new R2.a(str3, str4, str5);
            case 9:
                int g09 = AbstractC0444a.g0(parcel);
                boolean z12 = false;
                String str6 = null;
                String str7 = null;
                String str8 = null;
                String str9 = null;
                String str10 = null;
                String str11 = null;
                String str12 = null;
                Intent intent2 = null;
                IBinder iBinder4 = null;
                while (parcel.dataPosition() < g09) {
                    int readInt10 = parcel.readInt();
                    switch ((char) readInt10) {
                        case 2:
                            str6 = AbstractC0444a.B(parcel, readInt10);
                            break;
                        case 3:
                            str7 = AbstractC0444a.B(parcel, readInt10);
                            break;
                        case 4:
                            str8 = AbstractC0444a.B(parcel, readInt10);
                            break;
                        case 5:
                            str9 = AbstractC0444a.B(parcel, readInt10);
                            break;
                        case 6:
                            str10 = AbstractC0444a.B(parcel, readInt10);
                            break;
                        case 7:
                            str11 = AbstractC0444a.B(parcel, readInt10);
                            break;
                        case '\b':
                            str12 = AbstractC0444a.B(parcel, readInt10);
                            break;
                        case '\t':
                            intent2 = (Intent) AbstractC0444a.A(parcel, readInt10, Intent.CREATOR);
                            break;
                        case '\n':
                            iBinder4 = AbstractC0444a.W(parcel, readInt10);
                            break;
                        case 11:
                            z12 = AbstractC0444a.V(parcel, readInt10);
                            break;
                        default:
                            AbstractC0444a.b0(parcel, readInt10);
                            break;
                    }
                }
                AbstractC0444a.G(parcel, g09);
                return new S2.e(str6, str7, str8, str9, str10, str11, str12, intent2, iBinder4, z12);
            case 10:
                int g010 = AbstractC0444a.g0(parcel);
                long j5 = 0;
                boolean z13 = false;
                int i9 = 0;
                int i10 = 0;
                boolean z14 = false;
                S2.e eVar = null;
                IBinder iBinder5 = null;
                IBinder iBinder6 = null;
                IBinder iBinder7 = null;
                IBinder iBinder8 = null;
                String str13 = null;
                String str14 = null;
                IBinder iBinder9 = null;
                String str15 = null;
                U2.a aVar = null;
                String str16 = null;
                P2.h hVar = null;
                IBinder iBinder10 = null;
                String str17 = null;
                String str18 = null;
                String str19 = null;
                IBinder iBinder11 = null;
                IBinder iBinder12 = null;
                IBinder iBinder13 = null;
                while (parcel.dataPosition() < g010) {
                    int readInt11 = parcel.readInt();
                    switch ((char) readInt11) {
                        case 2:
                            eVar = (S2.e) AbstractC0444a.A(parcel, readInt11, S2.e.CREATOR);
                            break;
                        case 3:
                            iBinder5 = AbstractC0444a.W(parcel, readInt11);
                            break;
                        case 4:
                            iBinder6 = AbstractC0444a.W(parcel, readInt11);
                            break;
                        case 5:
                            iBinder7 = AbstractC0444a.W(parcel, readInt11);
                            break;
                        case 6:
                            iBinder8 = AbstractC0444a.W(parcel, readInt11);
                            break;
                        case 7:
                            str13 = AbstractC0444a.B(parcel, readInt11);
                            break;
                        case '\b':
                            z13 = AbstractC0444a.V(parcel, readInt11);
                            break;
                        case '\t':
                            str14 = AbstractC0444a.B(parcel, readInt11);
                            break;
                        case '\n':
                            iBinder9 = AbstractC0444a.W(parcel, readInt11);
                            break;
                        case 11:
                            i9 = AbstractC0444a.X(parcel, readInt11);
                            break;
                        case '\f':
                            i10 = AbstractC0444a.X(parcel, readInt11);
                            break;
                        case '\r':
                            str15 = AbstractC0444a.B(parcel, readInt11);
                            break;
                        case 14:
                            aVar = (U2.a) AbstractC0444a.A(parcel, readInt11, U2.a.CREATOR);
                            break;
                        case 15:
                        case 20:
                        case C1639u7.zzm /* 21 */:
                        case 22:
                        case 23:
                        default:
                            AbstractC0444a.b0(parcel, readInt11);
                            break;
                        case 16:
                            str16 = AbstractC0444a.B(parcel, readInt11);
                            break;
                        case 17:
                            hVar = (P2.h) AbstractC0444a.A(parcel, readInt11, P2.h.CREATOR);
                            break;
                        case 18:
                            iBinder10 = AbstractC0444a.W(parcel, readInt11);
                            break;
                        case 19:
                            str17 = AbstractC0444a.B(parcel, readInt11);
                            break;
                        case 24:
                            str18 = AbstractC0444a.B(parcel, readInt11);
                            break;
                        case 25:
                            str19 = AbstractC0444a.B(parcel, readInt11);
                            break;
                        case 26:
                            iBinder11 = AbstractC0444a.W(parcel, readInt11);
                            break;
                        case 27:
                            iBinder12 = AbstractC0444a.W(parcel, readInt11);
                            break;
                        case 28:
                            iBinder13 = AbstractC0444a.W(parcel, readInt11);
                            break;
                        case 29:
                            z14 = AbstractC0444a.V(parcel, readInt11);
                            break;
                        case 30:
                            j5 = AbstractC0444a.Y(parcel, readInt11);
                            break;
                    }
                }
                AbstractC0444a.G(parcel, g010);
                return new AdOverlayInfoParcel(eVar, iBinder5, iBinder6, iBinder7, iBinder8, str13, z13, str14, iBinder9, i9, i10, str15, aVar, str16, hVar, iBinder10, str17, str18, str19, iBinder11, iBinder12, iBinder13, z14, j5);
            case 11:
                int g011 = AbstractC0444a.g0(parcel);
                int i11 = 0;
                String str20 = null;
                while (parcel.dataPosition() < g011) {
                    int readInt12 = parcel.readInt();
                    char c11 = (char) readInt12;
                    if (c11 == 1) {
                        str20 = AbstractC0444a.B(parcel, readInt12);
                    } else if (c11 != 2) {
                        AbstractC0444a.b0(parcel, readInt12);
                    } else {
                        i11 = AbstractC0444a.X(parcel, readInt12);
                    }
                }
                AbstractC0444a.G(parcel, g011);
                return new C0438p(str20, i11);
            case 12:
                int g012 = AbstractC0444a.g0(parcel);
                int i12 = 0;
                int i13 = 0;
                boolean z15 = false;
                boolean z16 = false;
                String str21 = null;
                while (parcel.dataPosition() < g012) {
                    int readInt13 = parcel.readInt();
                    char c12 = (char) readInt13;
                    if (c12 == 2) {
                        str21 = AbstractC0444a.B(parcel, readInt13);
                    } else if (c12 == 3) {
                        i12 = AbstractC0444a.X(parcel, readInt13);
                    } else if (c12 == 4) {
                        i13 = AbstractC0444a.X(parcel, readInt13);
                    } else if (c12 == 5) {
                        z15 = AbstractC0444a.V(parcel, readInt13);
                    } else if (c12 != 6) {
                        AbstractC0444a.b0(parcel, readInt13);
                    } else {
                        z16 = AbstractC0444a.V(parcel, readInt13);
                    }
                }
                AbstractC0444a.G(parcel, g012);
                return new U2.a(str21, i12, i13, z15, z16);
            case 13:
                return new ParcelImpl(parcel);
            case 14:
                l.f("parcel", parcel);
                return new C1954a(parcel.readInt(), parcel.readInt() == 0 ? null : (Intent) Intent.CREATOR.createFromParcel(parcel));
            case 15:
                int g013 = AbstractC0444a.g0(parcel);
                String str22 = null;
                int i14 = 0;
                while (parcel.dataPosition() < g013) {
                    int readInt14 = parcel.readInt();
                    char c13 = (char) readInt14;
                    if (c13 == 1) {
                        str22 = AbstractC0444a.B(parcel, readInt14);
                    } else if (c13 != 2) {
                        AbstractC0444a.b0(parcel, readInt14);
                    } else {
                        i14 = AbstractC0444a.X(parcel, readInt14);
                    }
                }
                AbstractC0444a.G(parcel, g013);
                return new g3.c(str22, i14);
            case 16:
                int g014 = AbstractC0444a.g0(parcel);
                long j6 = 0;
                int i15 = 0;
                String str23 = null;
                String str24 = null;
                String str25 = null;
                String str26 = null;
                Uri uri = null;
                String str27 = null;
                String str28 = null;
                ArrayList arrayList2 = null;
                String str29 = null;
                String str30 = null;
                while (true) {
                    long j7 = j6;
                    while (parcel.dataPosition() < g014) {
                        readInt = parcel.readInt();
                        switch ((char) readInt) {
                            case 1:
                                i15 = AbstractC0444a.X(parcel, readInt);
                                break;
                            case 2:
                                str23 = AbstractC0444a.B(parcel, readInt);
                                break;
                            case 3:
                                str24 = AbstractC0444a.B(parcel, readInt);
                                break;
                            case 4:
                                str25 = AbstractC0444a.B(parcel, readInt);
                                break;
                            case 5:
                                str26 = AbstractC0444a.B(parcel, readInt);
                                break;
                            case 6:
                                uri = (Uri) AbstractC0444a.A(parcel, readInt, Uri.CREATOR);
                                break;
                            case 7:
                                str27 = AbstractC0444a.B(parcel, readInt);
                                break;
                            case '\b':
                                break;
                            case '\t':
                                str28 = AbstractC0444a.B(parcel, readInt);
                                break;
                            case '\n':
                                Parcelable.Creator<Scope> creator = Scope.CREATOR;
                                int Z4 = AbstractC0444a.Z(parcel, readInt);
                                int dataPosition = parcel.dataPosition();
                                if (Z4 == 0) {
                                    arrayList2 = null;
                                    break;
                                } else {
                                    ArrayList createTypedArrayList = parcel.createTypedArrayList(creator);
                                    parcel.setDataPosition(dataPosition + Z4);
                                    arrayList2 = createTypedArrayList;
                                    break;
                                }
                            case 11:
                                str29 = AbstractC0444a.B(parcel, readInt);
                                break;
                            case '\f':
                                str30 = AbstractC0444a.B(parcel, readInt);
                                break;
                            default:
                                AbstractC0444a.b0(parcel, readInt);
                                break;
                        }
                    }
                    AbstractC0444a.G(parcel, g014);
                    return new GoogleSignInAccount(i15, str23, str24, str25, str26, uri, str27, j7, str28, arrayList2, str29, str30);
                    j6 = AbstractC0444a.Y(parcel, readInt);
                    break;
                }
                break;
            case 17:
                int g015 = AbstractC0444a.g0(parcel);
                PendingIntent pendingIntent = null;
                int i16 = 0;
                int i17 = 0;
                String str31 = null;
                while (parcel.dataPosition() < g015) {
                    int readInt15 = parcel.readInt();
                    char c14 = (char) readInt15;
                    if (c14 == 1) {
                        i16 = AbstractC0444a.X(parcel, readInt15);
                    } else if (c14 == 2) {
                        i17 = AbstractC0444a.X(parcel, readInt15);
                    } else if (c14 == 3) {
                        pendingIntent = (PendingIntent) AbstractC0444a.A(parcel, readInt15, PendingIntent.CREATOR);
                    } else if (c14 != 4) {
                        AbstractC0444a.b0(parcel, readInt15);
                    } else {
                        str31 = AbstractC0444a.B(parcel, readInt15);
                    }
                }
                AbstractC0444a.G(parcel, g015);
                return new j3.b(i16, i17, pendingIntent, str31);
            case 18:
                int g016 = AbstractC0444a.g0(parcel);
                long j8 = -1;
                int i18 = 0;
                String str32 = null;
                while (parcel.dataPosition() < g016) {
                    int readInt16 = parcel.readInt();
                    char c15 = (char) readInt16;
                    if (c15 == 1) {
                        str32 = AbstractC0444a.B(parcel, readInt16);
                    } else if (c15 == 2) {
                        i18 = AbstractC0444a.X(parcel, readInt16);
                    } else if (c15 != 3) {
                        AbstractC0444a.b0(parcel, readInt16);
                    } else {
                        j8 = AbstractC0444a.Y(parcel, readInt16);
                    }
                }
                AbstractC0444a.G(parcel, g016);
                return new j3.d(i18, j8, str32);
            case 19:
                int g017 = AbstractC0444a.g0(parcel);
                String str33 = null;
                int i19 = 0;
                while (parcel.dataPosition() < g017) {
                    int readInt17 = parcel.readInt();
                    char c16 = (char) readInt17;
                    if (c16 == 1) {
                        i19 = AbstractC0444a.X(parcel, readInt17);
                    } else if (c16 != 2) {
                        AbstractC0444a.b0(parcel, readInt17);
                    } else {
                        str33 = AbstractC0444a.B(parcel, readInt17);
                    }
                }
                AbstractC0444a.G(parcel, g017);
                return new Scope(str33, i19);
            case 20:
                int g018 = AbstractC0444a.g0(parcel);
                String str34 = null;
                j3.b bVar2 = null;
                int i20 = 0;
                PendingIntent pendingIntent2 = null;
                while (parcel.dataPosition() < g018) {
                    int readInt18 = parcel.readInt();
                    char c17 = (char) readInt18;
                    if (c17 == 1) {
                        i20 = AbstractC0444a.X(parcel, readInt18);
                    } else if (c17 == 2) {
                        str34 = AbstractC0444a.B(parcel, readInt18);
                    } else if (c17 == 3) {
                        pendingIntent2 = (PendingIntent) AbstractC0444a.A(parcel, readInt18, PendingIntent.CREATOR);
                    } else if (c17 != 4) {
                        AbstractC0444a.b0(parcel, readInt18);
                    } else {
                        bVar2 = (j3.b) AbstractC0444a.A(parcel, readInt18, j3.b.CREATOR);
                    }
                }
                AbstractC0444a.G(parcel, g018);
                return new Status(i20, str34, pendingIntent2, bVar2);
            case C1639u7.zzm /* 21 */:
                int g019 = AbstractC0444a.g0(parcel);
                int i21 = 0;
                while (true) {
                    ArrayList arrayList3 = null;
                    while (parcel.dataPosition() < g019) {
                        int readInt19 = parcel.readInt();
                        char c18 = (char) readInt19;
                        if (c18 == 1) {
                            i21 = AbstractC0444a.X(parcel, readInt19);
                        } else if (c18 != 2) {
                            AbstractC0444a.b0(parcel, readInt19);
                        } else {
                            Parcelable.Creator<j> creator2 = j.CREATOR;
                            int Z5 = AbstractC0444a.Z(parcel, readInt19);
                            int dataPosition2 = parcel.dataPosition();
                            if (Z5 == 0) {
                                break;
                            }
                            arrayList3 = parcel.createTypedArrayList(creator2);
                            parcel.setDataPosition(dataPosition2 + Z5);
                        }
                    }
                    AbstractC0444a.G(parcel, g019);
                    return new m(i21, arrayList3);
                    break;
                }
            case 22:
                int g020 = AbstractC0444a.g0(parcel);
                int i22 = 0;
                int i23 = 0;
                int i24 = 0;
                int i25 = 0;
                long j9 = 0;
                long j10 = 0;
                String str35 = null;
                String str36 = null;
                int i26 = -1;
                while (parcel.dataPosition() < g020) {
                    int readInt20 = parcel.readInt();
                    switch ((char) readInt20) {
                        case 1:
                            i22 = AbstractC0444a.X(parcel, readInt20);
                            break;
                        case 2:
                            i23 = AbstractC0444a.X(parcel, readInt20);
                            break;
                        case 3:
                            i24 = AbstractC0444a.X(parcel, readInt20);
                            break;
                        case 4:
                            j9 = AbstractC0444a.Y(parcel, readInt20);
                            break;
                        case 5:
                            j10 = AbstractC0444a.Y(parcel, readInt20);
                            break;
                        case 6:
                            str35 = AbstractC0444a.B(parcel, readInt20);
                            break;
                        case 7:
                            str36 = AbstractC0444a.B(parcel, readInt20);
                            break;
                        case '\b':
                            i25 = AbstractC0444a.X(parcel, readInt20);
                            break;
                        case '\t':
                            i26 = AbstractC0444a.X(parcel, readInt20);
                            break;
                        default:
                            AbstractC0444a.b0(parcel, readInt20);
                            break;
                    }
                }
                AbstractC0444a.G(parcel, g020);
                return new j(i22, i23, i24, j9, j10, str35, str36, i25, i26);
            case 23:
                int g021 = AbstractC0444a.g0(parcel);
                int i27 = 0;
                Account account = null;
                GoogleSignInAccount googleSignInAccount = null;
                int i28 = 0;
                while (parcel.dataPosition() < g021) {
                    int readInt21 = parcel.readInt();
                    char c19 = (char) readInt21;
                    if (c19 == 1) {
                        i27 = AbstractC0444a.X(parcel, readInt21);
                    } else if (c19 == 2) {
                        account = (Account) AbstractC0444a.A(parcel, readInt21, Account.CREATOR);
                    } else if (c19 == 3) {
                        i28 = AbstractC0444a.X(parcel, readInt21);
                    } else if (c19 != 4) {
                        AbstractC0444a.b0(parcel, readInt21);
                    } else {
                        googleSignInAccount = (GoogleSignInAccount) AbstractC0444a.A(parcel, readInt21, GoogleSignInAccount.CREATOR);
                    }
                }
                AbstractC0444a.G(parcel, g021);
                return new q(i27, account, i28, googleSignInAccount);
            case 24:
                int g022 = AbstractC0444a.g0(parcel);
                int i29 = 0;
                boolean z17 = false;
                boolean z18 = false;
                IBinder iBinder14 = null;
                j3.b bVar3 = null;
                while (parcel.dataPosition() < g022) {
                    int readInt22 = parcel.readInt();
                    char c20 = (char) readInt22;
                    if (c20 == 1) {
                        i29 = AbstractC0444a.X(parcel, readInt22);
                    } else if (c20 == 2) {
                        iBinder14 = AbstractC0444a.W(parcel, readInt22);
                    } else if (c20 == 3) {
                        bVar3 = (j3.b) AbstractC0444a.A(parcel, readInt22, j3.b.CREATOR);
                    } else if (c20 == 4) {
                        z17 = AbstractC0444a.V(parcel, readInt22);
                    } else if (c20 != 5) {
                        AbstractC0444a.b0(parcel, readInt22);
                    } else {
                        z18 = AbstractC0444a.V(parcel, readInt22);
                    }
                }
                AbstractC0444a.G(parcel, g022);
                return new r(i29, iBinder14, bVar3, z17, z18);
            case 25:
                int g023 = AbstractC0444a.g0(parcel);
                int i30 = 0;
                int i31 = 0;
                int i32 = 0;
                boolean z19 = false;
                boolean z20 = false;
                while (parcel.dataPosition() < g023) {
                    int readInt23 = parcel.readInt();
                    char c21 = (char) readInt23;
                    if (c21 == 1) {
                        i30 = AbstractC0444a.X(parcel, readInt23);
                    } else if (c21 == 2) {
                        z19 = AbstractC0444a.V(parcel, readInt23);
                    } else if (c21 == 3) {
                        z20 = AbstractC0444a.V(parcel, readInt23);
                    } else if (c21 == 4) {
                        i31 = AbstractC0444a.X(parcel, readInt23);
                    } else if (c21 != 5) {
                        AbstractC0444a.b0(parcel, readInt23);
                    } else {
                        i32 = AbstractC0444a.X(parcel, readInt23);
                    }
                }
                AbstractC0444a.G(parcel, g023);
                return new m3.l(i30, i31, i32, z19, z20);
            case 26:
                int g024 = AbstractC0444a.g0(parcel);
                Bundle bundle = null;
                C2096f c2096f = null;
                int i33 = 0;
                j3.d[] dVarArr = null;
                while (parcel.dataPosition() < g024) {
                    int readInt24 = parcel.readInt();
                    char c22 = (char) readInt24;
                    if (c22 == 1) {
                        bundle = AbstractC0444a.y(parcel, readInt24);
                    } else if (c22 == 2) {
                        dVarArr = (j3.d[]) AbstractC0444a.E(parcel, readInt24, j3.d.CREATOR);
                    } else if (c22 == 3) {
                        i33 = AbstractC0444a.X(parcel, readInt24);
                    } else if (c22 != 4) {
                        AbstractC0444a.b0(parcel, readInt24);
                    } else {
                        c2096f = (C2096f) AbstractC0444a.A(parcel, readInt24, C2096f.CREATOR);
                    }
                }
                AbstractC0444a.G(parcel, g024);
                B b3 = new B();
                b3.f17999k = bundle;
                b3.f18000l = dVarArr;
                b3.f18001m = i33;
                b3.f18002n = c2096f;
                return b3;
            case 27:
                int g025 = AbstractC0444a.g0(parcel);
                m3.l lVar = null;
                int[] iArr = null;
                int[] iArr2 = null;
                boolean z21 = false;
                boolean z22 = false;
                int i34 = 0;
                while (parcel.dataPosition() < g025) {
                    int readInt25 = parcel.readInt();
                    switch ((char) readInt25) {
                        case 1:
                            lVar = (m3.l) AbstractC0444a.A(parcel, readInt25, m3.l.CREATOR);
                            break;
                        case 2:
                            z21 = AbstractC0444a.V(parcel, readInt25);
                            break;
                        case 3:
                            z22 = AbstractC0444a.V(parcel, readInt25);
                            break;
                        case 4:
                            int Z6 = AbstractC0444a.Z(parcel, readInt25);
                            int dataPosition3 = parcel.dataPosition();
                            if (Z6 == 0) {
                                iArr = null;
                                break;
                            } else {
                                iArr = parcel.createIntArray();
                                parcel.setDataPosition(dataPosition3 + Z6);
                                break;
                            }
                        case 5:
                            i34 = AbstractC0444a.X(parcel, readInt25);
                            break;
                        case 6:
                            int Z7 = AbstractC0444a.Z(parcel, readInt25);
                            int dataPosition4 = parcel.dataPosition();
                            if (Z7 == 0) {
                                iArr2 = null;
                                break;
                            } else {
                                iArr2 = parcel.createIntArray();
                                parcel.setDataPosition(dataPosition4 + Z7);
                                break;
                            }
                        default:
                            AbstractC0444a.b0(parcel, readInt25);
                            break;
                    }
                }
                AbstractC0444a.G(parcel, g025);
                return new C2096f(lVar, z21, z22, iArr, i34, iArr2);
            default:
                int g026 = AbstractC0444a.g0(parcel);
                Scope[] scopeArr = C2097g.f18050y;
                Bundle bundle2 = new Bundle();
                j3.d[] dVarArr2 = C2097g.f18051z;
                j3.d[] dVarArr3 = dVarArr2;
                String str37 = null;
                IBinder iBinder15 = null;
                Account account2 = null;
                String str38 = null;
                int i35 = 0;
                int i36 = 0;
                int i37 = 0;
                boolean z23 = false;
                int i38 = 0;
                boolean z24 = false;
                while (parcel.dataPosition() < g026) {
                    int readInt26 = parcel.readInt();
                    switch ((char) readInt26) {
                        case 1:
                            i35 = AbstractC0444a.X(parcel, readInt26);
                            break;
                        case 2:
                            i36 = AbstractC0444a.X(parcel, readInt26);
                            break;
                        case 3:
                            i37 = AbstractC0444a.X(parcel, readInt26);
                            break;
                        case 4:
                            str37 = AbstractC0444a.B(parcel, readInt26);
                            break;
                        case 5:
                            iBinder15 = AbstractC0444a.W(parcel, readInt26);
                            break;
                        case 6:
                            scopeArr = (Scope[]) AbstractC0444a.E(parcel, readInt26, Scope.CREATOR);
                            break;
                        case 7:
                            bundle2 = AbstractC0444a.y(parcel, readInt26);
                            break;
                        case '\b':
                            account2 = (Account) AbstractC0444a.A(parcel, readInt26, Account.CREATOR);
                            break;
                        case '\t':
                        default:
                            AbstractC0444a.b0(parcel, readInt26);
                            break;
                        case '\n':
                            dVarArr2 = (j3.d[]) AbstractC0444a.E(parcel, readInt26, j3.d.CREATOR);
                            break;
                        case 11:
                            dVarArr3 = (j3.d[]) AbstractC0444a.E(parcel, readInt26, j3.d.CREATOR);
                            break;
                        case '\f':
                            z23 = AbstractC0444a.V(parcel, readInt26);
                            break;
                        case '\r':
                            i38 = AbstractC0444a.X(parcel, readInt26);
                            break;
                        case 14:
                            z24 = AbstractC0444a.V(parcel, readInt26);
                            break;
                        case 15:
                            str38 = AbstractC0444a.B(parcel, readInt26);
                            break;
                    }
                }
                AbstractC0444a.G(parcel, g026);
                return new C2097g(i35, i36, i37, str37, iBinder15, scopeArr, bundle2, account2, dVarArr2, dVarArr3, z23, i38, z24, str38);
        }
    }

    @Override // android.os.Parcelable.Creator
    public final Object[] newArray(int i) {
        switch (this.f817a) {
            case 0:
                return new b[i];
            case 1:
                return new C3.b[i];
            case 2:
                return new C3.e[i];
            case 3:
                return new C3.f[i];
            case 4:
                return new C0141l[i];
            case 5:
                return new M2.a[i];
            case 6:
                return new M2.d[i];
            case 7:
                return new P2.h[i];
            case 8:
                return new R2.a[i];
            case 9:
                return new S2.e[i];
            case 10:
                return new AdOverlayInfoParcel[i];
            case 11:
                return new C0438p[i];
            case 12:
                return new U2.a[i];
            case 13:
                return new ParcelImpl[i];
            case 14:
                return new C1954a[i];
            case 15:
                return new g3.c[i];
            case 16:
                return new GoogleSignInAccount[i];
            case 17:
                return new j3.b[i];
            case 18:
                return new j3.d[i];
            case 19:
                return new Scope[i];
            case 20:
                return new Status[i];
            case C1639u7.zzm /* 21 */:
                return new m[i];
            case 22:
                return new j[i];
            case 23:
                return new q[i];
            case 24:
                return new r[i];
            case 25:
                return new m3.l[i];
            case 26:
                return new B[i];
            case 27:
                return new C2096f[i];
            default:
                return new C2097g[i];
        }
    }
}
