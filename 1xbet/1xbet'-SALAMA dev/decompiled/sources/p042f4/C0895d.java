package p042f4;

import Q0.a;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.internal.p002firebaseauthapi.zzagl;
import com.google.firebase.auth.PhoneMultiFactorInfo;
import com.google.firebase.auth.TotpMultiFactorInfo;
import com.google.firebase.auth.internal.zzad;
import com.google.firebase.auth.internal.zzaf;
import com.google.firebase.auth.internal.zzaj;
import com.google.firebase.auth.internal.zzao;
import com.google.firebase.auth.internal.zzbl;
import com.google.firebase.auth.internal.zzv;
import com.google.firebase.auth.internal.zzx;
import com.google.firebase.auth.internal.zzz;
import com.google.firebase.auth.zzan;
import com.google.firebase.auth.zze;
import java.util.ArrayList;

/* JADX INFO: renamed from: f4.d, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C0895d implements Parcelable.Creator {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f12940a;

    public /* synthetic */ C0895d(int i7) {
        this.f12940a = i7;
    }

    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        switch (this.f12940a) {
            case 0:
                int iA0 = a.a0(parcel);
                zzad zzadVar = null;
                zzv zzvVar = null;
                zze zzeVar = null;
                while (parcel.dataPosition() < iA0) {
                    int i7 = parcel.readInt();
                    char c3 = (char) i7;
                    if (c3 == 1) {
                        zzadVar = (zzad) a.m(parcel, i7, zzad.CREATOR);
                    } else if (c3 == 2) {
                        zzvVar = (zzv) a.m(parcel, i7, zzv.CREATOR);
                    } else if (c3 != 3) {
                        a.X(i7, parcel);
                    } else {
                        zzeVar = (zze) a.m(parcel, i7, zze.CREATOR);
                    }
                }
                a.y(iA0, parcel);
                return new zzx(zzadVar, zzvVar, zzeVar);
            case 1:
                int iA1 = a.a0(parcel);
                String strN = null;
                String strN2 = null;
                String strN3 = null;
                String strN4 = null;
                String strN5 = null;
                String strN6 = null;
                String strN7 = null;
                boolean zK = false;
                while (parcel.dataPosition() < iA1) {
                    int i8 = parcel.readInt();
                    switch ((char) i8) {
                        case 1:
                            strN = a.n(i8, parcel);
                            break;
                        case 2:
                            strN2 = a.n(i8, parcel);
                            break;
                        case 3:
                            strN5 = a.n(i8, parcel);
                            break;
                        case 4:
                            strN4 = a.n(i8, parcel);
                            break;
                        case 5:
                            strN3 = a.n(i8, parcel);
                            break;
                        case 6:
                            strN6 = a.n(i8, parcel);
                            break;
                        case 7:
                            zK = a.K(i8, parcel);
                            break;
                        case '\b':
                            strN7 = a.n(i8, parcel);
                            break;
                        default:
                            a.X(i8, parcel);
                            break;
                    }
                }
                a.y(iA1, parcel);
                return new zzz(strN, strN2, strN3, strN4, strN5, strN6, zK, strN7);
            case 2:
                int iA2 = a.a0(parcel);
                zzbl zzblVar = null;
                ArrayList arrayListR = null;
                zzagl zzaglVar = null;
                zzz zzzVar = null;
                String strN8 = null;
                String strN9 = null;
                ArrayList arrayListR2 = null;
                ArrayList arrayListP = null;
                String strN10 = null;
                Boolean boolValueOf = null;
                zzaf zzafVar = null;
                boolean zK2 = false;
                zze zzeVar2 = null;
                while (parcel.dataPosition() < iA2) {
                    int i9 = parcel.readInt();
                    ArrayList arrayList = arrayListR;
                    switch ((char) i9) {
                        case 1:
                            zzaglVar = (zzagl) a.m(parcel, i9, zzagl.CREATOR);
                            break;
                        case 2:
                            zzzVar = (zzz) a.m(parcel, i9, zzz.CREATOR);
                            break;
                        case 3:
                            strN8 = a.n(i9, parcel);
                            break;
                        case 4:
                            strN9 = a.n(i9, parcel);
                            break;
                        case 5:
                            arrayListR2 = a.r(parcel, i9, zzz.CREATOR);
                            break;
                        case 6:
                            arrayListP = a.p(i9, parcel);
                            break;
                        case 7:
                            strN10 = a.n(i9, parcel);
                            break;
                        case '\b':
                            int iR = a.R(i9, parcel);
                            if (iR != 0) {
                                a.f0(parcel, iR, 4);
                                boolValueOf = Boolean.valueOf(parcel.readInt() != 0);
                            } else {
                                boolValueOf = null;
                            }
                            break;
                        case '\t':
                            zzafVar = (zzaf) a.m(parcel, i9, zzaf.CREATOR);
                            break;
                        case '\n':
                            zK2 = a.K(i9, parcel);
                            break;
                        case 11:
                            zzeVar2 = (zze) a.m(parcel, i9, zze.CREATOR);
                            break;
                        case '\f':
                            zzblVar = (zzbl) a.m(parcel, i9, zzbl.CREATOR);
                            break;
                        case '\r':
                            arrayListR = a.r(parcel, i9, zzan.CREATOR);
                            continue;
                        default:
                            a.X(i9, parcel);
                            break;
                    }
                    arrayListR = arrayList;
                }
                a.y(iA2, parcel);
                zzad zzadVar2 = new zzad();
                zzadVar2.f11908a = zzaglVar;
                zzadVar2.f11909b = zzzVar;
                zzadVar2.f11910c = strN8;
                zzadVar2.f11911d = strN9;
                zzadVar2.f11912e = arrayListR2;
                zzadVar2.f11913f = arrayListP;
                zzadVar2.f11914x = strN10;
                zzadVar2.f11915y = boolValueOf;
                zzadVar2.f11916z = zzafVar;
                zzadVar2.f11904A = zK2;
                zzadVar2.f11905B = zzeVar2;
                zzadVar2.f11906C = zzblVar;
                zzadVar2.f11907D = arrayListR;
                return zzadVar2;
            case 3:
                int iA3 = a.a0(parcel);
                long jP = 0;
                long jP2 = 0;
                while (parcel.dataPosition() < iA3) {
                    int i10 = parcel.readInt();
                    char c4 = (char) i10;
                    if (c4 == 1) {
                        jP = a.P(i10, parcel);
                    } else if (c4 != 2) {
                        a.X(i10, parcel);
                    } else {
                        jP2 = a.P(i10, parcel);
                    }
                }
                a.y(iA3, parcel);
                return new zzaf(jP, jP2);
            case 4:
                int iA4 = a.a0(parcel);
                ArrayList arrayListR3 = null;
                zzao zzaoVar = null;
                String strN11 = null;
                zze zzeVar3 = null;
                zzad zzadVar3 = null;
                ArrayList arrayListR4 = null;
                while (parcel.dataPosition() < iA4) {
                    int i11 = parcel.readInt();
                    switch ((char) i11) {
                        case 1:
                            arrayListR3 = a.r(parcel, i11, PhoneMultiFactorInfo.CREATOR);
                            break;
                        case 2:
                            zzaoVar = (zzao) a.m(parcel, i11, zzao.CREATOR);
                            break;
                        case 3:
                            strN11 = a.n(i11, parcel);
                            break;
                        case 4:
                            zzeVar3 = (zze) a.m(parcel, i11, zze.CREATOR);
                            break;
                        case 5:
                            zzadVar3 = (zzad) a.m(parcel, i11, zzad.CREATOR);
                            break;
                        case 6:
                            arrayListR4 = a.r(parcel, i11, TotpMultiFactorInfo.CREATOR);
                            break;
                        default:
                            a.X(i11, parcel);
                            break;
                    }
                }
                a.y(iA4, parcel);
                return new zzaj(arrayListR3, zzaoVar, strN11, zzeVar3, zzadVar3, arrayListR4);
            case 5:
                int iA5 = a.a0(parcel);
                String strN12 = null;
                String strN13 = null;
                ArrayList arrayListR5 = null;
                ArrayList arrayListR6 = null;
                zzad zzadVar4 = null;
                while (parcel.dataPosition() < iA5) {
                    int i12 = parcel.readInt();
                    char c7 = (char) i12;
                    if (c7 == 1) {
                        strN12 = a.n(i12, parcel);
                    } else if (c7 == 2) {
                        strN13 = a.n(i12, parcel);
                    } else if (c7 == 3) {
                        arrayListR5 = a.r(parcel, i12, PhoneMultiFactorInfo.CREATOR);
                    } else if (c7 == 4) {
                        arrayListR6 = a.r(parcel, i12, TotpMultiFactorInfo.CREATOR);
                    } else if (c7 != 5) {
                        a.X(i12, parcel);
                    } else {
                        zzadVar4 = (zzad) a.m(parcel, i12, zzad.CREATOR);
                    }
                }
                a.y(iA5, parcel);
                zzao zzaoVar2 = new zzao();
                zzaoVar2.f11925a = strN12;
                zzaoVar2.f11926b = strN13;
                zzaoVar2.f11927c = arrayListR5;
                zzaoVar2.f11928d = arrayListR6;
                zzaoVar2.f11929e = zzadVar4;
                return zzaoVar2;
            case 6:
                int iA6 = a.a0(parcel);
                ArrayList arrayListR7 = null;
                ArrayList arrayListR8 = null;
                while (parcel.dataPosition() < iA6) {
                    int i13 = parcel.readInt();
                    char c8 = (char) i13;
                    if (c8 == 1) {
                        arrayListR7 = a.r(parcel, i13, PhoneMultiFactorInfo.CREATOR);
                    } else if (c8 != 2) {
                        a.X(i13, parcel);
                    } else {
                        arrayListR8 = a.r(parcel, i13, TotpMultiFactorInfo.CREATOR);
                    }
                }
                a.y(iA6, parcel);
                return new zzbl(arrayListR7, arrayListR8);
            default:
                int iA7 = a.a0(parcel);
                String strN14 = null;
                boolean zK3 = false;
                String strN15 = null;
                while (parcel.dataPosition() < iA7) {
                    int i14 = parcel.readInt();
                    char c9 = (char) i14;
                    if (c9 == 1) {
                        strN14 = a.n(i14, parcel);
                    } else if (c9 == 2) {
                        strN15 = a.n(i14, parcel);
                    } else if (c9 != 3) {
                        a.X(i14, parcel);
                    } else {
                        zK3 = a.K(i14, parcel);
                    }
                }
                a.y(iA7, parcel);
                return new zzv(strN14, strN15, zK3);
        }
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i7) {
        switch (this.f12940a) {
            case 0:
                return new zzx[i7];
            case 1:
                return new zzz[i7];
            case 2:
                return new zzad[i7];
            case 3:
                return new zzaf[i7];
            case 4:
                return new zzaj[i7];
            case 5:
                return new zzao[i7];
            case 6:
                return new zzbl[i7];
            default:
                return new zzv[i7];
        }
    }
}
