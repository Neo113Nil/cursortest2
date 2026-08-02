package Q2;

import a.AbstractC0444a;
import android.location.Location;
import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.internal.ads.C1639u7;
import java.util.ArrayList;

/* renamed from: Q2.d0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0354d0 implements Parcelable.Creator {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f5008a;

    public /* synthetic */ C0354d0(int i) {
        this.f5008a = i;
    }

    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        switch (this.f5008a) {
            case 0:
                int g02 = AbstractC0444a.g0(parcel);
                String str = null;
                String str2 = null;
                while (parcel.dataPosition() < g02) {
                    int readInt = parcel.readInt();
                    char c5 = (char) readInt;
                    if (c5 == 1) {
                        str = AbstractC0444a.B(parcel, readInt);
                    } else if (c5 != 2) {
                        AbstractC0444a.b0(parcel, readInt);
                    } else {
                        str2 = AbstractC0444a.B(parcel, readInt);
                    }
                }
                AbstractC0444a.G(parcel, g02);
                return new M(str, str2);
            case 1:
                int g03 = AbstractC0444a.g0(parcel);
                int i = 0;
                while (parcel.dataPosition() < g03) {
                    int readInt2 = parcel.readInt();
                    if (((char) readInt2) != 2) {
                        AbstractC0444a.b0(parcel, readInt2);
                    } else {
                        i = AbstractC0444a.X(parcel, readInt2);
                    }
                }
                AbstractC0444a.G(parcel, g03);
                return new C0395y0(i);
            case 2:
                int g04 = AbstractC0444a.g0(parcel);
                String str3 = null;
                String str4 = null;
                C0387u0 c0387u0 = null;
                IBinder iBinder = null;
                int i5 = 0;
                while (parcel.dataPosition() < g04) {
                    int readInt3 = parcel.readInt();
                    char c6 = (char) readInt3;
                    if (c6 == 1) {
                        i5 = AbstractC0444a.X(parcel, readInt3);
                    } else if (c6 == 2) {
                        str3 = AbstractC0444a.B(parcel, readInt3);
                    } else if (c6 == 3) {
                        str4 = AbstractC0444a.B(parcel, readInt3);
                    } else if (c6 == 4) {
                        c0387u0 = (C0387u0) AbstractC0444a.A(parcel, readInt3, C0387u0.CREATOR);
                    } else if (c6 != 5) {
                        AbstractC0444a.b0(parcel, readInt3);
                    } else {
                        iBinder = AbstractC0444a.W(parcel, readInt3);
                    }
                }
                AbstractC0444a.G(parcel, g04);
                return new C0387u0(i5, str3, str4, c0387u0, iBinder);
            case 3:
                int g05 = AbstractC0444a.g0(parcel);
                String str5 = null;
                int i6 = 0;
                int i7 = 0;
                while (parcel.dataPosition() < g05) {
                    int readInt4 = parcel.readInt();
                    char c7 = (char) readInt4;
                    if (c7 == 1) {
                        i6 = AbstractC0444a.X(parcel, readInt4);
                    } else if (c7 == 2) {
                        i7 = AbstractC0444a.X(parcel, readInt4);
                    } else if (c7 != 3) {
                        AbstractC0444a.b0(parcel, readInt4);
                    } else {
                        str5 = AbstractC0444a.B(parcel, readInt4);
                    }
                }
                AbstractC0444a.G(parcel, g05);
                return new I0(i6, i7, str5);
            case 4:
                int g06 = AbstractC0444a.g0(parcel);
                int i8 = 0;
                String str6 = null;
                X0 x02 = null;
                int i9 = 0;
                while (parcel.dataPosition() < g06) {
                    int readInt5 = parcel.readInt();
                    char c8 = (char) readInt5;
                    if (c8 == 1) {
                        str6 = AbstractC0444a.B(parcel, readInt5);
                    } else if (c8 == 2) {
                        i8 = AbstractC0444a.X(parcel, readInt5);
                    } else if (c8 == 3) {
                        x02 = (X0) AbstractC0444a.A(parcel, readInt5, X0.CREATOR);
                    } else if (c8 != 4) {
                        AbstractC0444a.b0(parcel, readInt5);
                    } else {
                        i9 = AbstractC0444a.X(parcel, readInt5);
                    }
                }
                AbstractC0444a.G(parcel, g06);
                return new R0(str6, i8, x02, i9);
            case 5:
                int g07 = AbstractC0444a.g0(parcel);
                int i10 = 0;
                int i11 = 0;
                while (parcel.dataPosition() < g07) {
                    int readInt6 = parcel.readInt();
                    char c9 = (char) readInt6;
                    if (c9 == 1) {
                        i10 = AbstractC0444a.X(parcel, readInt6);
                    } else if (c9 != 2) {
                        AbstractC0444a.b0(parcel, readInt6);
                    } else {
                        i11 = AbstractC0444a.X(parcel, readInt6);
                    }
                }
                AbstractC0444a.G(parcel, g07);
                return new S0(i10, i11);
            case 6:
                int g08 = AbstractC0444a.g0(parcel);
                String str7 = null;
                while (parcel.dataPosition() < g08) {
                    int readInt7 = parcel.readInt();
                    if (((char) readInt7) != 15) {
                        AbstractC0444a.b0(parcel, readInt7);
                    } else {
                        str7 = AbstractC0444a.B(parcel, readInt7);
                    }
                }
                AbstractC0444a.G(parcel, g08);
                return new T0(str7);
            case 7:
                int g09 = AbstractC0444a.g0(parcel);
                boolean z3 = false;
                boolean z5 = false;
                boolean z6 = false;
                while (parcel.dataPosition() < g09) {
                    int readInt8 = parcel.readInt();
                    char c10 = (char) readInt8;
                    if (c10 == 2) {
                        z3 = AbstractC0444a.V(parcel, readInt8);
                    } else if (c10 == 3) {
                        z5 = AbstractC0444a.V(parcel, readInt8);
                    } else if (c10 != 4) {
                        AbstractC0444a.b0(parcel, readInt8);
                    } else {
                        z6 = AbstractC0444a.V(parcel, readInt8);
                    }
                }
                AbstractC0444a.G(parcel, g09);
                return new V0(z3, z5, z6);
            case 8:
                int g010 = AbstractC0444a.g0(parcel);
                long j5 = 0;
                long j6 = 0;
                int i12 = 0;
                int i13 = 0;
                boolean z7 = false;
                int i14 = 0;
                boolean z8 = false;
                boolean z9 = false;
                int i15 = 0;
                int i16 = 0;
                int i17 = 0;
                Bundle bundle = null;
                ArrayList arrayList = null;
                String str8 = null;
                T0 t02 = null;
                Location location = null;
                String str9 = null;
                Bundle bundle2 = null;
                Bundle bundle3 = null;
                ArrayList arrayList2 = null;
                String str10 = null;
                String str11 = null;
                M m5 = null;
                String str12 = null;
                ArrayList arrayList3 = null;
                String str13 = null;
                while (parcel.dataPosition() < g010) {
                    int readInt9 = parcel.readInt();
                    switch ((char) readInt9) {
                        case 1:
                            i12 = AbstractC0444a.X(parcel, readInt9);
                            break;
                        case 2:
                            j5 = AbstractC0444a.Y(parcel, readInt9);
                            break;
                        case 3:
                            bundle = AbstractC0444a.y(parcel, readInt9);
                            break;
                        case 4:
                            i13 = AbstractC0444a.X(parcel, readInt9);
                            break;
                        case 5:
                            arrayList = AbstractC0444a.D(parcel, readInt9);
                            break;
                        case 6:
                            z7 = AbstractC0444a.V(parcel, readInt9);
                            break;
                        case 7:
                            i14 = AbstractC0444a.X(parcel, readInt9);
                            break;
                        case '\b':
                            z8 = AbstractC0444a.V(parcel, readInt9);
                            break;
                        case '\t':
                            str8 = AbstractC0444a.B(parcel, readInt9);
                            break;
                        case '\n':
                            t02 = (T0) AbstractC0444a.A(parcel, readInt9, T0.CREATOR);
                            break;
                        case 11:
                            location = (Location) AbstractC0444a.A(parcel, readInt9, Location.CREATOR);
                            break;
                        case '\f':
                            str9 = AbstractC0444a.B(parcel, readInt9);
                            break;
                        case '\r':
                            bundle2 = AbstractC0444a.y(parcel, readInt9);
                            break;
                        case 14:
                            bundle3 = AbstractC0444a.y(parcel, readInt9);
                            break;
                        case 15:
                            arrayList2 = AbstractC0444a.D(parcel, readInt9);
                            break;
                        case 16:
                            str10 = AbstractC0444a.B(parcel, readInt9);
                            break;
                        case 17:
                            str11 = AbstractC0444a.B(parcel, readInt9);
                            break;
                        case 18:
                            z9 = AbstractC0444a.V(parcel, readInt9);
                            break;
                        case 19:
                            m5 = (M) AbstractC0444a.A(parcel, readInt9, M.CREATOR);
                            break;
                        case 20:
                            i15 = AbstractC0444a.X(parcel, readInt9);
                            break;
                        case C1639u7.zzm /* 21 */:
                            str12 = AbstractC0444a.B(parcel, readInt9);
                            break;
                        case 22:
                            arrayList3 = AbstractC0444a.D(parcel, readInt9);
                            break;
                        case 23:
                            i16 = AbstractC0444a.X(parcel, readInt9);
                            break;
                        case 24:
                            str13 = AbstractC0444a.B(parcel, readInt9);
                            break;
                        case 25:
                            i17 = AbstractC0444a.X(parcel, readInt9);
                            break;
                        case 26:
                            j6 = AbstractC0444a.Y(parcel, readInt9);
                            break;
                        default:
                            AbstractC0444a.b0(parcel, readInt9);
                            break;
                    }
                }
                AbstractC0444a.G(parcel, g010);
                return new X0(i12, j5, bundle, i13, arrayList, z7, i14, z8, str8, t02, location, str9, bundle2, bundle3, arrayList2, str10, str11, z9, m5, i15, str12, arrayList3, i16, str13, i17, j6);
            case 9:
                int g011 = AbstractC0444a.g0(parcel);
                int i18 = 0;
                int i19 = 0;
                boolean z10 = false;
                int i20 = 0;
                int i21 = 0;
                boolean z11 = false;
                boolean z12 = false;
                boolean z13 = false;
                boolean z14 = false;
                boolean z15 = false;
                boolean z16 = false;
                boolean z17 = false;
                boolean z18 = false;
                String str14 = null;
                a1[] a1VarArr = null;
                while (parcel.dataPosition() < g011) {
                    int readInt10 = parcel.readInt();
                    switch ((char) readInt10) {
                        case 2:
                            str14 = AbstractC0444a.B(parcel, readInt10);
                            break;
                        case 3:
                            i18 = AbstractC0444a.X(parcel, readInt10);
                            break;
                        case 4:
                            i19 = AbstractC0444a.X(parcel, readInt10);
                            break;
                        case 5:
                            z10 = AbstractC0444a.V(parcel, readInt10);
                            break;
                        case 6:
                            i20 = AbstractC0444a.X(parcel, readInt10);
                            break;
                        case 7:
                            i21 = AbstractC0444a.X(parcel, readInt10);
                            break;
                        case '\b':
                            a1VarArr = (a1[]) AbstractC0444a.E(parcel, readInt10, a1.CREATOR);
                            break;
                        case '\t':
                            z11 = AbstractC0444a.V(parcel, readInt10);
                            break;
                        case '\n':
                            z12 = AbstractC0444a.V(parcel, readInt10);
                            break;
                        case 11:
                            z13 = AbstractC0444a.V(parcel, readInt10);
                            break;
                        case '\f':
                            z14 = AbstractC0444a.V(parcel, readInt10);
                            break;
                        case '\r':
                            z15 = AbstractC0444a.V(parcel, readInt10);
                            break;
                        case 14:
                            z16 = AbstractC0444a.V(parcel, readInt10);
                            break;
                        case 15:
                            z17 = AbstractC0444a.V(parcel, readInt10);
                            break;
                        case 16:
                            z18 = AbstractC0444a.V(parcel, readInt10);
                            break;
                        default:
                            AbstractC0444a.b0(parcel, readInt10);
                            break;
                    }
                }
                AbstractC0444a.G(parcel, g011);
                return new a1(str14, i18, i19, z10, i20, i21, a1VarArr, z11, z12, z13, z14, z15, z16, z17, z18);
            case 10:
                int g012 = AbstractC0444a.g0(parcel);
                long j7 = 0;
                String str15 = null;
                int i22 = 0;
                int i23 = 0;
                while (parcel.dataPosition() < g012) {
                    int readInt11 = parcel.readInt();
                    char c11 = (char) readInt11;
                    if (c11 == 1) {
                        i22 = AbstractC0444a.X(parcel, readInt11);
                    } else if (c11 == 2) {
                        i23 = AbstractC0444a.X(parcel, readInt11);
                    } else if (c11 == 3) {
                        str15 = AbstractC0444a.B(parcel, readInt11);
                    } else if (c11 != 4) {
                        AbstractC0444a.b0(parcel, readInt11);
                    } else {
                        j7 = AbstractC0444a.Y(parcel, readInt11);
                    }
                }
                AbstractC0444a.G(parcel, g012);
                return new b1(i22, i23, j7, str15);
            case 11:
                int g013 = AbstractC0444a.g0(parcel);
                String str16 = null;
                C0387u0 c0387u02 = null;
                Bundle bundle4 = null;
                String str17 = null;
                String str18 = null;
                String str19 = null;
                String str20 = null;
                long j8 = 0;
                while (parcel.dataPosition() < g013) {
                    int readInt12 = parcel.readInt();
                    switch ((char) readInt12) {
                        case 1:
                            str16 = AbstractC0444a.B(parcel, readInt12);
                            break;
                        case 2:
                            j8 = AbstractC0444a.Y(parcel, readInt12);
                            break;
                        case 3:
                            c0387u02 = (C0387u0) AbstractC0444a.A(parcel, readInt12, C0387u0.CREATOR);
                            break;
                        case 4:
                            bundle4 = AbstractC0444a.y(parcel, readInt12);
                            break;
                        case 5:
                            str17 = AbstractC0444a.B(parcel, readInt12);
                            break;
                        case 6:
                            str18 = AbstractC0444a.B(parcel, readInt12);
                            break;
                        case 7:
                            str19 = AbstractC0444a.B(parcel, readInt12);
                            break;
                        case '\b':
                            str20 = AbstractC0444a.B(parcel, readInt12);
                            break;
                        default:
                            AbstractC0444a.b0(parcel, readInt12);
                            break;
                    }
                }
                AbstractC0444a.G(parcel, g013);
                return new c1(str16, j8, c0387u02, bundle4, str17, str18, str19, str20);
            default:
                int g014 = AbstractC0444a.g0(parcel);
                int i24 = 0;
                while (parcel.dataPosition() < g014) {
                    int readInt13 = parcel.readInt();
                    if (((char) readInt13) != 2) {
                        AbstractC0444a.b0(parcel, readInt13);
                    } else {
                        i24 = AbstractC0444a.X(parcel, readInt13);
                    }
                }
                AbstractC0444a.G(parcel, g014);
                return new d1(i24);
        }
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i) {
        switch (this.f5008a) {
            case 0:
                return new M[i];
            case 1:
                return new C0395y0[i];
            case 2:
                return new C0387u0[i];
            case 3:
                return new I0[i];
            case 4:
                return new R0[i];
            case 5:
                return new S0[i];
            case 6:
                return new T0[i];
            case 7:
                return new V0[i];
            case 8:
                return new X0[i];
            case 9:
                return new a1[i];
            case 10:
                return new b1[i];
            case 11:
                return new c1[i];
            default:
                return new d1[i];
        }
    }
}
