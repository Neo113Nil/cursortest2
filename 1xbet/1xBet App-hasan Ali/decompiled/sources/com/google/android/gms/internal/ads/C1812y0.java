package com.google.android.gms.internal.ads;

import a.AbstractC0444a;
import android.os.Bundle;
import android.os.Parcel;
import android.os.ParcelFileDescriptor;
import android.os.Parcelable;
import java.util.ArrayList;

/* renamed from: com.google.android.gms.internal.ads.y0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1812y0 implements Parcelable.Creator {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f16376a;

    public /* synthetic */ C1812y0(int i) {
        this.f16376a = i;
    }

    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        switch (this.f16376a) {
            case 0:
                return new C1857z0(parcel);
            case 1:
                return new A0(parcel);
            case 2:
                return new B0(parcel);
            case 3:
                return new C0(parcel);
            case 4:
                return new D0(parcel);
            case 5:
                return new E0(parcel);
            case 6:
                return new F0(parcel);
            case 7:
                return new G0(parcel);
            case 8:
                return new H0(parcel);
            case 9:
                return new I0(parcel);
            case 10:
                return new M0(parcel);
            case 11:
                return new N0(parcel);
            case 12:
                return new O0(parcel);
            case 13:
                String readString = parcel.readString();
                readString.getClass();
                String readString2 = parcel.readString();
                String[] createStringArray = parcel.createStringArray();
                createStringArray.getClass();
                return new P0(readString, readString2, AbstractC1044gv.m(createStringArray));
            case 14:
                return new Q0(parcel);
            case 15:
                return new R0(parcel);
            case 16:
                ArrayList arrayList = new ArrayList();
                parcel.readList(arrayList, S0.class.getClassLoader());
                return new T0(arrayList);
            case 17:
                return new S0(parcel.readInt(), parcel.readLong(), parcel.readLong());
            case 18:
                return new V0(parcel);
            case 19:
                return new W0(parcel);
            case 20:
                return new C5(parcel);
            case C1639u7.zzm /* 21 */:
                int g02 = AbstractC0444a.g0(parcel);
                boolean z3 = false;
                boolean z5 = false;
                boolean z6 = false;
                long j5 = 0;
                ParcelFileDescriptor parcelFileDescriptor = null;
                while (parcel.dataPosition() < g02) {
                    int readInt = parcel.readInt();
                    char c5 = (char) readInt;
                    if (c5 == 2) {
                        parcelFileDescriptor = (ParcelFileDescriptor) AbstractC0444a.A(parcel, readInt, ParcelFileDescriptor.CREATOR);
                    } else if (c5 == 3) {
                        z3 = AbstractC0444a.V(parcel, readInt);
                    } else if (c5 == 4) {
                        z5 = AbstractC0444a.V(parcel, readInt);
                    } else if (c5 == 5) {
                        j5 = AbstractC0444a.Y(parcel, readInt);
                    } else if (c5 != 6) {
                        AbstractC0444a.b0(parcel, readInt);
                    } else {
                        z6 = AbstractC0444a.V(parcel, readInt);
                    }
                }
                AbstractC0444a.G(parcel, g02);
                return new C1369o6(parcelFileDescriptor, z3, z5, j5, z6);
            case 22:
                int g03 = AbstractC0444a.g0(parcel);
                boolean z7 = false;
                int i = 0;
                String str = null;
                String str2 = null;
                String str3 = null;
                String str4 = null;
                Bundle bundle = null;
                String str5 = null;
                long j6 = 0;
                long j7 = 0;
                while (parcel.dataPosition() < g03) {
                    int readInt2 = parcel.readInt();
                    switch ((char) readInt2) {
                        case 2:
                            str = AbstractC0444a.B(parcel, readInt2);
                            break;
                        case 3:
                            j6 = AbstractC0444a.Y(parcel, readInt2);
                            break;
                        case 4:
                            str2 = AbstractC0444a.B(parcel, readInt2);
                            break;
                        case 5:
                            str3 = AbstractC0444a.B(parcel, readInt2);
                            break;
                        case 6:
                            str4 = AbstractC0444a.B(parcel, readInt2);
                            break;
                        case 7:
                            bundle = AbstractC0444a.y(parcel, readInt2);
                            break;
                        case '\b':
                            z7 = AbstractC0444a.V(parcel, readInt2);
                            break;
                        case '\t':
                            j7 = AbstractC0444a.Y(parcel, readInt2);
                            break;
                        case '\n':
                            str5 = AbstractC0444a.B(parcel, readInt2);
                            break;
                        case 11:
                            i = AbstractC0444a.X(parcel, readInt2);
                            break;
                        default:
                            AbstractC0444a.b0(parcel, readInt2);
                            break;
                    }
                }
                AbstractC0444a.G(parcel, g03);
                return new C1459q6(str, j6, str2, str3, str4, bundle, z7, j7, str5, i);
            case 23:
                int g04 = AbstractC0444a.g0(parcel);
                int i5 = 0;
                boolean z8 = false;
                int i6 = 0;
                boolean z9 = false;
                int i7 = 0;
                boolean z10 = false;
                int i8 = 0;
                int i9 = 0;
                boolean z11 = false;
                int i10 = 0;
                Q2.V0 v02 = null;
                while (parcel.dataPosition() < g04) {
                    int readInt3 = parcel.readInt();
                    switch ((char) readInt3) {
                        case 1:
                            i5 = AbstractC0444a.X(parcel, readInt3);
                            break;
                        case 2:
                            z8 = AbstractC0444a.V(parcel, readInt3);
                            break;
                        case 3:
                            i6 = AbstractC0444a.X(parcel, readInt3);
                            break;
                        case 4:
                            z9 = AbstractC0444a.V(parcel, readInt3);
                            break;
                        case 5:
                            i7 = AbstractC0444a.X(parcel, readInt3);
                            break;
                        case 6:
                            v02 = (Q2.V0) AbstractC0444a.A(parcel, readInt3, Q2.V0.CREATOR);
                            break;
                        case 7:
                            z10 = AbstractC0444a.V(parcel, readInt3);
                            break;
                        case '\b':
                            i8 = AbstractC0444a.X(parcel, readInt3);
                            break;
                        case '\t':
                            i9 = AbstractC0444a.X(parcel, readInt3);
                            break;
                        case '\n':
                            z11 = AbstractC0444a.V(parcel, readInt3);
                            break;
                        case 11:
                            i10 = AbstractC0444a.X(parcel, readInt3);
                            break;
                        default:
                            AbstractC0444a.b0(parcel, readInt3);
                            break;
                    }
                }
                AbstractC0444a.G(parcel, g04);
                return new B8(i5, z8, i6, z9, i7, v02, z10, i8, i9, z11, i10);
            case 24:
                int g05 = AbstractC0444a.g0(parcel);
                String str6 = null;
                String[] strArr = null;
                String[] strArr2 = null;
                while (parcel.dataPosition() < g05) {
                    int readInt4 = parcel.readInt();
                    char c6 = (char) readInt4;
                    if (c6 == 1) {
                        str6 = AbstractC0444a.B(parcel, readInt4);
                    } else if (c6 == 2) {
                        strArr = AbstractC0444a.C(parcel, readInt4);
                    } else if (c6 != 3) {
                        AbstractC0444a.b0(parcel, readInt4);
                    } else {
                        strArr2 = AbstractC0444a.C(parcel, readInt4);
                    }
                }
                AbstractC0444a.G(parcel, g05);
                return new J9(str6, strArr, strArr2);
            case 25:
                int g06 = AbstractC0444a.g0(parcel);
                long j8 = 0;
                boolean z12 = false;
                int i11 = 0;
                boolean z13 = false;
                String str7 = null;
                byte[] bArr = null;
                String[] strArr3 = null;
                String[] strArr4 = null;
                while (parcel.dataPosition() < g06) {
                    int readInt5 = parcel.readInt();
                    switch ((char) readInt5) {
                        case 1:
                            z12 = AbstractC0444a.V(parcel, readInt5);
                            break;
                        case 2:
                            str7 = AbstractC0444a.B(parcel, readInt5);
                            break;
                        case 3:
                            i11 = AbstractC0444a.X(parcel, readInt5);
                            break;
                        case 4:
                            bArr = AbstractC0444a.z(parcel, readInt5);
                            break;
                        case 5:
                            strArr3 = AbstractC0444a.C(parcel, readInt5);
                            break;
                        case 6:
                            strArr4 = AbstractC0444a.C(parcel, readInt5);
                            break;
                        case 7:
                            z13 = AbstractC0444a.V(parcel, readInt5);
                            break;
                        case '\b':
                            j8 = AbstractC0444a.Y(parcel, readInt5);
                            break;
                        default:
                            AbstractC0444a.b0(parcel, readInt5);
                            break;
                    }
                }
                AbstractC0444a.G(parcel, g06);
                return new K9(z12, str7, i11, bArr, strArr3, strArr4, z13, j8);
            case 26:
                int g07 = AbstractC0444a.g0(parcel);
                String str8 = null;
                boolean z14 = false;
                int i12 = 0;
                String str9 = null;
                while (parcel.dataPosition() < g07) {
                    int readInt6 = parcel.readInt();
                    char c7 = (char) readInt6;
                    if (c7 == 1) {
                        str8 = AbstractC0444a.B(parcel, readInt6);
                    } else if (c7 == 2) {
                        z14 = AbstractC0444a.V(parcel, readInt6);
                    } else if (c7 == 3) {
                        i12 = AbstractC0444a.X(parcel, readInt6);
                    } else if (c7 != 4) {
                        AbstractC0444a.b0(parcel, readInt6);
                    } else {
                        str9 = AbstractC0444a.B(parcel, readInt6);
                    }
                }
                AbstractC0444a.G(parcel, g07);
                return new Q9(str8, i12, str9, z14);
            case 27:
                int g08 = AbstractC0444a.g0(parcel);
                String str10 = null;
                Bundle bundle2 = null;
                while (parcel.dataPosition() < g08) {
                    int readInt7 = parcel.readInt();
                    char c8 = (char) readInt7;
                    if (c8 == 1) {
                        str10 = AbstractC0444a.B(parcel, readInt7);
                    } else if (c8 != 2) {
                        AbstractC0444a.b0(parcel, readInt7);
                    } else {
                        bundle2 = AbstractC0444a.y(parcel, readInt7);
                    }
                }
                AbstractC0444a.G(parcel, g08);
                return new W9(str10, bundle2);
            case 28:
                int g09 = AbstractC0444a.g0(parcel);
                int i13 = 0;
                int i14 = 0;
                String str11 = null;
                int i15 = 0;
                while (parcel.dataPosition() < g09) {
                    int readInt8 = parcel.readInt();
                    char c9 = (char) readInt8;
                    if (c9 == 1) {
                        i15 = AbstractC0444a.X(parcel, readInt8);
                    } else if (c9 == 2) {
                        str11 = AbstractC0444a.B(parcel, readInt8);
                    } else if (c9 == 3) {
                        i14 = AbstractC0444a.X(parcel, readInt8);
                    } else if (c9 != 1000) {
                        AbstractC0444a.b0(parcel, readInt8);
                    } else {
                        i13 = AbstractC0444a.X(parcel, readInt8);
                    }
                }
                AbstractC0444a.G(parcel, g09);
                return new X9(i13, i15, i14, str11);
            default:
                int g010 = AbstractC0444a.g0(parcel);
                int i16 = 0;
                int i17 = 0;
                int i18 = 0;
                while (parcel.dataPosition() < g010) {
                    int readInt9 = parcel.readInt();
                    char c10 = (char) readInt9;
                    if (c10 == 1) {
                        i16 = AbstractC0444a.X(parcel, readInt9);
                    } else if (c10 == 2) {
                        i17 = AbstractC0444a.X(parcel, readInt9);
                    } else if (c10 != 3) {
                        AbstractC0444a.b0(parcel, readInt9);
                    } else {
                        i18 = AbstractC0444a.X(parcel, readInt9);
                    }
                }
                AbstractC0444a.G(parcel, g010);
                return new C1651ub(i16, i17, i18);
        }
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i) {
        switch (this.f16376a) {
            case 0:
                return new C1857z0[i];
            case 1:
                return new A0[i];
            case 2:
                return new B0[i];
            case 3:
                return new C0[i];
            case 4:
                return new D0[i];
            case 5:
                return new E0[i];
            case 6:
                return new F0[i];
            case 7:
                return new G0[i];
            case 8:
                return new H0[i];
            case 9:
                return new I0[i];
            case 10:
                return new M0[i];
            case 11:
                return new N0[i];
            case 12:
                return new O0[i];
            case 13:
                return new P0[i];
            case 14:
                return new Q0[i];
            case 15:
                return new R0[i];
            case 16:
                return new T0[i];
            case 17:
                return new S0[i];
            case 18:
                return new V0[i];
            case 19:
                return new W0[i];
            case 20:
                return new C5[i];
            case C1639u7.zzm /* 21 */:
                return new C1369o6[i];
            case 22:
                return new C1459q6[i];
            case 23:
                return new B8[i];
            case 24:
                return new J9[i];
            case 25:
                return new K9[i];
            case 26:
                return new Q9[i];
            case 27:
                return new W9[i];
            case 28:
                return new X9[i];
            default:
                return new C1651ub[i];
        }
    }
}
