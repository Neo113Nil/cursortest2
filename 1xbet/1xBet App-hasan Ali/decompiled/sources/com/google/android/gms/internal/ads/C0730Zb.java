package com.google.android.gms.internal.ads;

import Q2.C0395y0;
import a.AbstractC0444a;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;
import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;

/* renamed from: com.google.android.gms.internal.ads.Zb, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0730Zb implements Parcelable.Creator {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f12485a;

    public /* synthetic */ C0730Zb(int i) {
        this.f12485a = i;
    }

    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        switch (this.f12485a) {
            case 0:
                int g02 = AbstractC0444a.g0(parcel);
                IBinder iBinder = null;
                IBinder iBinder2 = null;
                while (parcel.dataPosition() < g02) {
                    int readInt = parcel.readInt();
                    char c5 = (char) readInt;
                    if (c5 == 1) {
                        iBinder = AbstractC0444a.W(parcel, readInt);
                    } else if (c5 != 2) {
                        AbstractC0444a.b0(parcel, readInt);
                    } else {
                        iBinder2 = AbstractC0444a.W(parcel, readInt);
                    }
                }
                AbstractC0444a.G(parcel, g02);
                return new C0723Yb(iBinder, iBinder2);
            case 1:
                int g03 = AbstractC0444a.g0(parcel);
                float f = 0.0f;
                float f5 = 0.0f;
                long j5 = 0;
                long j6 = 0;
                int i = 0;
                Bundle bundle = null;
                Q2.X0 x02 = null;
                Q2.a1 a1Var = null;
                String str = null;
                ApplicationInfo applicationInfo = null;
                PackageInfo packageInfo = null;
                String str2 = null;
                String str3 = null;
                String str4 = null;
                U2.a aVar = null;
                Bundle bundle2 = null;
                int i5 = 0;
                ArrayList arrayList = null;
                Bundle bundle3 = null;
                boolean z3 = false;
                int i6 = 0;
                int i7 = 0;
                String str5 = null;
                String str6 = null;
                ArrayList arrayList2 = null;
                String str7 = null;
                B8 b8 = null;
                ArrayList arrayList3 = null;
                String str8 = null;
                boolean z5 = false;
                int i8 = 0;
                int i9 = 0;
                boolean z6 = false;
                String str9 = null;
                String str10 = null;
                boolean z7 = false;
                int i10 = 0;
                Bundle bundle4 = null;
                String str11 = null;
                C0395y0 c0395y0 = null;
                boolean z8 = false;
                Bundle bundle5 = null;
                String str12 = null;
                String str13 = null;
                String str14 = null;
                boolean z9 = false;
                ArrayList arrayList4 = null;
                String str15 = null;
                ArrayList arrayList5 = null;
                int i11 = 0;
                boolean z10 = false;
                boolean z11 = false;
                boolean z12 = false;
                ArrayList arrayList6 = null;
                String str16 = null;
                X9 x9 = null;
                String str17 = null;
                Bundle bundle6 = null;
                while (parcel.dataPosition() < g03) {
                    int readInt2 = parcel.readInt();
                    switch ((char) readInt2) {
                        case 1:
                            i = AbstractC0444a.X(parcel, readInt2);
                            break;
                        case 2:
                            bundle = AbstractC0444a.y(parcel, readInt2);
                            break;
                        case 3:
                            x02 = (Q2.X0) AbstractC0444a.A(parcel, readInt2, Q2.X0.CREATOR);
                            break;
                        case 4:
                            a1Var = (Q2.a1) AbstractC0444a.A(parcel, readInt2, Q2.a1.CREATOR);
                            break;
                        case 5:
                            str = AbstractC0444a.B(parcel, readInt2);
                            break;
                        case 6:
                            applicationInfo = (ApplicationInfo) AbstractC0444a.A(parcel, readInt2, ApplicationInfo.CREATOR);
                            break;
                        case 7:
                            packageInfo = (PackageInfo) AbstractC0444a.A(parcel, readInt2, PackageInfo.CREATOR);
                            break;
                        case '\b':
                            str2 = AbstractC0444a.B(parcel, readInt2);
                            break;
                        case '\t':
                            str3 = AbstractC0444a.B(parcel, readInt2);
                            break;
                        case '\n':
                            str4 = AbstractC0444a.B(parcel, readInt2);
                            break;
                        case 11:
                            aVar = (U2.a) AbstractC0444a.A(parcel, readInt2, U2.a.CREATOR);
                            break;
                        case '\f':
                            bundle2 = AbstractC0444a.y(parcel, readInt2);
                            break;
                        case '\r':
                            i5 = AbstractC0444a.X(parcel, readInt2);
                            break;
                        case 14:
                            arrayList = AbstractC0444a.D(parcel, readInt2);
                            break;
                        case 15:
                            bundle3 = AbstractC0444a.y(parcel, readInt2);
                            break;
                        case 16:
                            z3 = AbstractC0444a.V(parcel, readInt2);
                            break;
                        case 17:
                        case 22:
                        case 23:
                        case 24:
                        case ' ':
                        case '&':
                        case '>':
                        default:
                            AbstractC0444a.b0(parcel, readInt2);
                            break;
                        case 18:
                            i6 = AbstractC0444a.X(parcel, readInt2);
                            break;
                        case 19:
                            i7 = AbstractC0444a.X(parcel, readInt2);
                            break;
                        case 20:
                            AbstractC0444a.i0(parcel, readInt2, 4);
                            f = parcel.readFloat();
                            break;
                        case C1639u7.zzm /* 21 */:
                            str5 = AbstractC0444a.B(parcel, readInt2);
                            break;
                        case 25:
                            j5 = AbstractC0444a.Y(parcel, readInt2);
                            break;
                        case 26:
                            str6 = AbstractC0444a.B(parcel, readInt2);
                            break;
                        case 27:
                            arrayList2 = AbstractC0444a.D(parcel, readInt2);
                            break;
                        case 28:
                            str7 = AbstractC0444a.B(parcel, readInt2);
                            break;
                        case 29:
                            b8 = (B8) AbstractC0444a.A(parcel, readInt2, B8.CREATOR);
                            break;
                        case 30:
                            arrayList3 = AbstractC0444a.D(parcel, readInt2);
                            break;
                        case 31:
                            j6 = AbstractC0444a.Y(parcel, readInt2);
                            break;
                        case '!':
                            str8 = AbstractC0444a.B(parcel, readInt2);
                            break;
                        case '\"':
                            AbstractC0444a.i0(parcel, readInt2, 4);
                            f5 = parcel.readFloat();
                            break;
                        case '#':
                            i8 = AbstractC0444a.X(parcel, readInt2);
                            break;
                        case '$':
                            i9 = AbstractC0444a.X(parcel, readInt2);
                            break;
                        case '%':
                            z6 = AbstractC0444a.V(parcel, readInt2);
                            break;
                        case '\'':
                            str9 = AbstractC0444a.B(parcel, readInt2);
                            break;
                        case '(':
                            z5 = AbstractC0444a.V(parcel, readInt2);
                            break;
                        case ')':
                            str10 = AbstractC0444a.B(parcel, readInt2);
                            break;
                        case '*':
                            z7 = AbstractC0444a.V(parcel, readInt2);
                            break;
                        case '+':
                            i10 = AbstractC0444a.X(parcel, readInt2);
                            break;
                        case ',':
                            bundle4 = AbstractC0444a.y(parcel, readInt2);
                            break;
                        case '-':
                            str11 = AbstractC0444a.B(parcel, readInt2);
                            break;
                        case '.':
                            c0395y0 = (C0395y0) AbstractC0444a.A(parcel, readInt2, C0395y0.CREATOR);
                            break;
                        case '/':
                            z8 = AbstractC0444a.V(parcel, readInt2);
                            break;
                        case '0':
                            bundle5 = AbstractC0444a.y(parcel, readInt2);
                            break;
                        case '1':
                            str12 = AbstractC0444a.B(parcel, readInt2);
                            break;
                        case '2':
                            str13 = AbstractC0444a.B(parcel, readInt2);
                            break;
                        case '3':
                            str14 = AbstractC0444a.B(parcel, readInt2);
                            break;
                        case '4':
                            z9 = AbstractC0444a.V(parcel, readInt2);
                            break;
                        case '5':
                            int Z4 = AbstractC0444a.Z(parcel, readInt2);
                            int dataPosition = parcel.dataPosition();
                            if (Z4 == 0) {
                                arrayList4 = null;
                                break;
                            } else {
                                ArrayList arrayList7 = new ArrayList();
                                int readInt3 = parcel.readInt();
                                for (int i12 = 0; i12 < readInt3; i12++) {
                                    arrayList7.add(Integer.valueOf(parcel.readInt()));
                                }
                                parcel.setDataPosition(dataPosition + Z4);
                                arrayList4 = arrayList7;
                                break;
                            }
                        case '6':
                            str15 = AbstractC0444a.B(parcel, readInt2);
                            break;
                        case '7':
                            arrayList5 = AbstractC0444a.D(parcel, readInt2);
                            break;
                        case '8':
                            i11 = AbstractC0444a.X(parcel, readInt2);
                            break;
                        case '9':
                            z10 = AbstractC0444a.V(parcel, readInt2);
                            break;
                        case ':':
                            z11 = AbstractC0444a.V(parcel, readInt2);
                            break;
                        case ';':
                            z12 = AbstractC0444a.V(parcel, readInt2);
                            break;
                        case '<':
                            arrayList6 = AbstractC0444a.D(parcel, readInt2);
                            break;
                        case '=':
                            str16 = AbstractC0444a.B(parcel, readInt2);
                            break;
                        case '?':
                            x9 = (X9) AbstractC0444a.A(parcel, readInt2, X9.CREATOR);
                            break;
                        case '@':
                            str17 = AbstractC0444a.B(parcel, readInt2);
                            break;
                        case 'A':
                            bundle6 = AbstractC0444a.y(parcel, readInt2);
                            break;
                    }
                }
                AbstractC0444a.G(parcel, g03);
                return new C0935ec(i, bundle, x02, a1Var, str, applicationInfo, packageInfo, str2, str3, str4, aVar, bundle2, i5, arrayList, bundle3, z3, i6, i7, f, str5, j5, str6, arrayList2, str7, b8, arrayList3, j6, str8, f5, z5, i8, i9, z6, str9, str10, z7, i10, bundle4, str11, c0395y0, z8, bundle5, str12, str13, str14, z9, arrayList4, str15, arrayList5, i11, z10, z11, z12, arrayList6, str16, x9, str17, bundle6);
            case 2:
                int g04 = AbstractC0444a.g0(parcel);
                ArrayList arrayList8 = null;
                boolean z13 = false;
                while (parcel.dataPosition() < g04) {
                    int readInt4 = parcel.readInt();
                    char c6 = (char) readInt4;
                    if (c6 == 2) {
                        z13 = AbstractC0444a.V(parcel, readInt4);
                    } else if (c6 != 3) {
                        AbstractC0444a.b0(parcel, readInt4);
                    } else {
                        arrayList8 = AbstractC0444a.D(parcel, readInt4);
                    }
                }
                AbstractC0444a.G(parcel, g04);
                return new C0980fc(z13, arrayList8);
            case 3:
                int g05 = AbstractC0444a.g0(parcel);
                String str18 = null;
                while (parcel.dataPosition() < g05) {
                    int readInt5 = parcel.readInt();
                    if (((char) readInt5) != 1) {
                        AbstractC0444a.b0(parcel, readInt5);
                    } else {
                        str18 = AbstractC0444a.B(parcel, readInt5);
                    }
                }
                AbstractC0444a.G(parcel, g05);
                return new C1025gc(str18);
            case 4:
                int g06 = AbstractC0444a.g0(parcel);
                Bundle bundle7 = null;
                U2.a aVar2 = null;
                ApplicationInfo applicationInfo2 = null;
                String str19 = null;
                ArrayList arrayList9 = null;
                PackageInfo packageInfo2 = null;
                String str20 = null;
                String str21 = null;
                C1353nr c1353nr = null;
                String str22 = null;
                Bundle bundle8 = null;
                Bundle bundle9 = null;
                boolean z14 = false;
                boolean z15 = false;
                while (parcel.dataPosition() < g06) {
                    int readInt6 = parcel.readInt();
                    switch ((char) readInt6) {
                        case 1:
                            bundle7 = AbstractC0444a.y(parcel, readInt6);
                            break;
                        case 2:
                            aVar2 = (U2.a) AbstractC0444a.A(parcel, readInt6, U2.a.CREATOR);
                            break;
                        case 3:
                            applicationInfo2 = (ApplicationInfo) AbstractC0444a.A(parcel, readInt6, ApplicationInfo.CREATOR);
                            break;
                        case 4:
                            str19 = AbstractC0444a.B(parcel, readInt6);
                            break;
                        case 5:
                            arrayList9 = AbstractC0444a.D(parcel, readInt6);
                            break;
                        case 6:
                            packageInfo2 = (PackageInfo) AbstractC0444a.A(parcel, readInt6, PackageInfo.CREATOR);
                            break;
                        case 7:
                            str20 = AbstractC0444a.B(parcel, readInt6);
                            break;
                        case '\b':
                        default:
                            AbstractC0444a.b0(parcel, readInt6);
                            break;
                        case '\t':
                            str21 = AbstractC0444a.B(parcel, readInt6);
                            break;
                        case '\n':
                            c1353nr = (C1353nr) AbstractC0444a.A(parcel, readInt6, C1353nr.CREATOR);
                            break;
                        case 11:
                            str22 = AbstractC0444a.B(parcel, readInt6);
                            break;
                        case '\f':
                            z14 = AbstractC0444a.V(parcel, readInt6);
                            break;
                        case '\r':
                            z15 = AbstractC0444a.V(parcel, readInt6);
                            break;
                        case 14:
                            bundle8 = AbstractC0444a.y(parcel, readInt6);
                            break;
                        case 15:
                            bundle9 = AbstractC0444a.y(parcel, readInt6);
                            break;
                    }
                }
                AbstractC0444a.G(parcel, g06);
                return new C1428pc(bundle7, aVar2, applicationInfo2, str19, arrayList9, packageInfo2, str20, str21, c1353nr, str22, z14, z15, bundle8, bundle9);
            case 5:
                int g07 = AbstractC0444a.g0(parcel);
                Q2.X0 x03 = null;
                String str23 = null;
                while (parcel.dataPosition() < g07) {
                    int readInt7 = parcel.readInt();
                    char c7 = (char) readInt7;
                    if (c7 == 2) {
                        x03 = (Q2.X0) AbstractC0444a.A(parcel, readInt7, Q2.X0.CREATOR);
                    } else if (c7 != 3) {
                        AbstractC0444a.b0(parcel, readInt7);
                    } else {
                        str23 = AbstractC0444a.B(parcel, readInt7);
                    }
                }
                AbstractC0444a.G(parcel, g07);
                return new C1877zc(x03, str23);
            case 6:
                int g08 = AbstractC0444a.g0(parcel);
                int i13 = 0;
                String str24 = null;
                while (parcel.dataPosition() < g08) {
                    int readInt8 = parcel.readInt();
                    char c8 = (char) readInt8;
                    if (c8 == 2) {
                        str24 = AbstractC0444a.B(parcel, readInt8);
                    } else if (c8 != 3) {
                        AbstractC0444a.b0(parcel, readInt8);
                    } else {
                        i13 = AbstractC0444a.X(parcel, readInt8);
                    }
                }
                AbstractC0444a.G(parcel, g08);
                return new C0575Dc(str24, i13);
            case 7:
                int g09 = AbstractC0444a.g0(parcel);
                String str25 = null;
                String str26 = null;
                while (parcel.dataPosition() < g09) {
                    int readInt9 = parcel.readInt();
                    char c9 = (char) readInt9;
                    if (c9 == 1) {
                        str25 = AbstractC0444a.B(parcel, readInt9);
                    } else if (c9 != 2) {
                        AbstractC0444a.b0(parcel, readInt9);
                    } else {
                        str26 = AbstractC0444a.B(parcel, readInt9);
                    }
                }
                AbstractC0444a.G(parcel, g09);
                return new C0696Uc(str25, str26);
            case 8:
                int g010 = AbstractC0444a.g0(parcel);
                String str27 = null;
                String str28 = null;
                ArrayList arrayList10 = null;
                ArrayList arrayList11 = null;
                boolean z16 = false;
                boolean z17 = false;
                boolean z18 = false;
                boolean z19 = false;
                while (parcel.dataPosition() < g010) {
                    int readInt10 = parcel.readInt();
                    switch ((char) readInt10) {
                        case 2:
                            str27 = AbstractC0444a.B(parcel, readInt10);
                            break;
                        case 3:
                            str28 = AbstractC0444a.B(parcel, readInt10);
                            break;
                        case 4:
                            z16 = AbstractC0444a.V(parcel, readInt10);
                            break;
                        case 5:
                            z17 = AbstractC0444a.V(parcel, readInt10);
                            break;
                        case 6:
                            arrayList10 = AbstractC0444a.D(parcel, readInt10);
                            break;
                        case 7:
                            z18 = AbstractC0444a.V(parcel, readInt10);
                            break;
                        case '\b':
                            z19 = AbstractC0444a.V(parcel, readInt10);
                            break;
                        case '\t':
                            arrayList11 = AbstractC0444a.D(parcel, readInt10);
                            break;
                        default:
                            AbstractC0444a.b0(parcel, readInt10);
                            break;
                    }
                }
                AbstractC0444a.G(parcel, g010);
                return new C0731Zc(str27, str28, z16, z17, arrayList10, z18, z19, arrayList11);
            case 9:
                int g011 = AbstractC0444a.g0(parcel);
                String str29 = null;
                String str30 = null;
                Q2.a1 a1Var2 = null;
                Q2.X0 x04 = null;
                String str31 = null;
                int i14 = 0;
                while (parcel.dataPosition() < g011) {
                    int readInt11 = parcel.readInt();
                    switch ((char) readInt11) {
                        case 1:
                            str29 = AbstractC0444a.B(parcel, readInt11);
                            break;
                        case 2:
                            str30 = AbstractC0444a.B(parcel, readInt11);
                            break;
                        case 3:
                            a1Var2 = (Q2.a1) AbstractC0444a.A(parcel, readInt11, Q2.a1.CREATOR);
                            break;
                        case 4:
                            x04 = (Q2.X0) AbstractC0444a.A(parcel, readInt11, Q2.X0.CREATOR);
                            break;
                        case 5:
                            i14 = AbstractC0444a.X(parcel, readInt11);
                            break;
                        case 6:
                            str31 = AbstractC0444a.B(parcel, readInt11);
                            break;
                        default:
                            AbstractC0444a.b0(parcel, readInt11);
                            break;
                    }
                }
                AbstractC0444a.G(parcel, g011);
                return new C1743wd(str29, str30, a1Var2, x04, i14, str31);
            case 10:
                return new Uo(parcel);
            case 11:
                return new Hp(parcel);
            case 12:
                return new C0771aq(parcel);
            case 13:
                int g012 = AbstractC0444a.g0(parcel);
                int i15 = 0;
                int i16 = 0;
                int i17 = 0;
                int i18 = 0;
                int i19 = 0;
                int i20 = 0;
                String str32 = null;
                while (parcel.dataPosition() < g012) {
                    int readInt12 = parcel.readInt();
                    switch ((char) readInt12) {
                        case 1:
                            i15 = AbstractC0444a.X(parcel, readInt12);
                            break;
                        case 2:
                            i16 = AbstractC0444a.X(parcel, readInt12);
                            break;
                        case 3:
                            i17 = AbstractC0444a.X(parcel, readInt12);
                            break;
                        case 4:
                            i18 = AbstractC0444a.X(parcel, readInt12);
                            break;
                        case 5:
                            str32 = AbstractC0444a.B(parcel, readInt12);
                            break;
                        case 6:
                            i19 = AbstractC0444a.X(parcel, readInt12);
                            break;
                        case 7:
                            i20 = AbstractC0444a.X(parcel, readInt12);
                            break;
                        default:
                            AbstractC0444a.b0(parcel, readInt12);
                            break;
                    }
                }
                AbstractC0444a.G(parcel, g012);
                return new C1353nr(i15, i16, i17, i18, str32, i19, i20);
            case 14:
                int g013 = AbstractC0444a.g0(parcel);
                byte[] bArr = null;
                int i21 = 0;
                while (parcel.dataPosition() < g013) {
                    int readInt13 = parcel.readInt();
                    char c10 = (char) readInt13;
                    if (c10 == 1) {
                        i21 = AbstractC0444a.X(parcel, readInt13);
                    } else if (c10 != 2) {
                        AbstractC0444a.b0(parcel, readInt13);
                    } else {
                        bArr = AbstractC0444a.z(parcel, readInt13);
                    }
                }
                AbstractC0444a.G(parcel, g013);
                return new C1534rt(i21, bArr);
            case 15:
                int g014 = AbstractC0444a.g0(parcel);
                String str33 = null;
                int i22 = 0;
                String str34 = null;
                while (parcel.dataPosition() < g014) {
                    int readInt14 = parcel.readInt();
                    char c11 = (char) readInt14;
                    if (c11 == 1) {
                        i22 = AbstractC0444a.X(parcel, readInt14);
                    } else if (c11 == 2) {
                        str33 = AbstractC0444a.B(parcel, readInt14);
                    } else if (c11 != 3) {
                        AbstractC0444a.b0(parcel, readInt14);
                    } else {
                        str34 = AbstractC0444a.B(parcel, readInt14);
                    }
                }
                AbstractC0444a.G(parcel, g014);
                return new C1624tt(i22, str33, str34);
            case 16:
                int g015 = AbstractC0444a.g0(parcel);
                byte[] bArr2 = null;
                int i23 = 0;
                while (parcel.dataPosition() < g015) {
                    int readInt15 = parcel.readInt();
                    char c12 = (char) readInt15;
                    if (c12 == 1) {
                        i23 = AbstractC0444a.X(parcel, readInt15);
                    } else if (c12 != 2) {
                        AbstractC0444a.b0(parcel, readInt15);
                    } else {
                        bArr2 = AbstractC0444a.z(parcel, readInt15);
                    }
                }
                AbstractC0444a.G(parcel, g015);
                return new C1669ut(i23, bArr2);
            case 17:
                int g016 = AbstractC0444a.g0(parcel);
                String str35 = null;
                String str36 = null;
                int i24 = 0;
                int i25 = 0;
                int i26 = 0;
                while (parcel.dataPosition() < g016) {
                    int readInt16 = parcel.readInt();
                    char c13 = (char) readInt16;
                    if (c13 == 1) {
                        i24 = AbstractC0444a.X(parcel, readInt16);
                    } else if (c13 == 2) {
                        i25 = AbstractC0444a.X(parcel, readInt16);
                    } else if (c13 == 3) {
                        str35 = AbstractC0444a.B(parcel, readInt16);
                    } else if (c13 == 4) {
                        str36 = AbstractC0444a.B(parcel, readInt16);
                    } else if (c13 != 5) {
                        AbstractC0444a.b0(parcel, readInt16);
                    } else {
                        i26 = AbstractC0444a.X(parcel, readInt16);
                    }
                }
                AbstractC0444a.G(parcel, g016);
                return new C1759wt(i24, i25, i26, str35, str36);
            case 18:
                int g017 = AbstractC0444a.g0(parcel);
                int i27 = 0;
                byte[] bArr3 = null;
                int i28 = 0;
                while (parcel.dataPosition() < g017) {
                    int readInt17 = parcel.readInt();
                    char c14 = (char) readInt17;
                    if (c14 == 1) {
                        i27 = AbstractC0444a.X(parcel, readInt17);
                    } else if (c14 == 2) {
                        bArr3 = AbstractC0444a.z(parcel, readInt17);
                    } else if (c14 != 3) {
                        AbstractC0444a.b0(parcel, readInt17);
                    } else {
                        i28 = AbstractC0444a.X(parcel, readInt17);
                    }
                }
                AbstractC0444a.G(parcel, g017);
                return new C1849yt(bArr3, i27, i28);
            case 19:
                return new C1334nG(parcel);
            default:
                return new XF(parcel);
        }
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i) {
        switch (this.f12485a) {
            case 0:
                return new C0723Yb[i];
            case 1:
                return new C0935ec[i];
            case 2:
                return new C0980fc[i];
            case 3:
                return new C1025gc[i];
            case 4:
                return new C1428pc[i];
            case 5:
                return new C1877zc[i];
            case 6:
                return new C0575Dc[i];
            case 7:
                return new C0696Uc[i];
            case 8:
                return new C0731Zc[i];
            case 9:
                return new C1743wd[i];
            case 10:
                return new Uo[i];
            case 11:
                return new Hp[i];
            case 12:
                return new C0771aq[i];
            case 13:
                return new C1353nr[i];
            case 14:
                return new C1534rt[i];
            case 15:
                return new C1624tt[i];
            case 16:
                return new C1669ut[i];
            case 17:
                return new C1759wt[i];
            case 18:
                return new C1849yt[i];
            case 19:
                return new C1334nG[i];
            default:
                return new XF[i];
        }
    }
}
