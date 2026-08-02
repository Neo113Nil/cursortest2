package f4;

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

/* renamed from: f4.d, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C1092d implements Parcelable.Creator {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f12934a;

    public /* synthetic */ C1092d(int i7) {
        this.f12934a = i7;
    }

    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        switch (this.f12934a) {
            case 0:
                int a02 = Q0.a.a0(parcel);
                zzad zzadVar = null;
                zzv zzvVar = null;
                zze zzeVar = null;
                while (parcel.dataPosition() < a02) {
                    int readInt = parcel.readInt();
                    char c3 = (char) readInt;
                    if (c3 == 1) {
                        zzadVar = (zzad) Q0.a.m(parcel, readInt, zzad.CREATOR);
                    } else if (c3 == 2) {
                        zzvVar = (zzv) Q0.a.m(parcel, readInt, zzv.CREATOR);
                    } else if (c3 != 3) {
                        Q0.a.X(readInt, parcel);
                    } else {
                        zzeVar = (zze) Q0.a.m(parcel, readInt, zze.CREATOR);
                    }
                }
                Q0.a.y(a02, parcel);
                return new zzx(zzadVar, zzvVar, zzeVar);
            case 1:
                int a03 = Q0.a.a0(parcel);
                String str = null;
                String str2 = null;
                String str3 = null;
                String str4 = null;
                String str5 = null;
                String str6 = null;
                String str7 = null;
                boolean z4 = false;
                while (parcel.dataPosition() < a03) {
                    int readInt2 = parcel.readInt();
                    switch ((char) readInt2) {
                        case 1:
                            str = Q0.a.n(readInt2, parcel);
                            break;
                        case 2:
                            str2 = Q0.a.n(readInt2, parcel);
                            break;
                        case 3:
                            str5 = Q0.a.n(readInt2, parcel);
                            break;
                        case 4:
                            str4 = Q0.a.n(readInt2, parcel);
                            break;
                        case 5:
                            str3 = Q0.a.n(readInt2, parcel);
                            break;
                        case 6:
                            str6 = Q0.a.n(readInt2, parcel);
                            break;
                        case 7:
                            z4 = Q0.a.K(readInt2, parcel);
                            break;
                        case '\b':
                            str7 = Q0.a.n(readInt2, parcel);
                            break;
                        default:
                            Q0.a.X(readInt2, parcel);
                            break;
                    }
                }
                Q0.a.y(a03, parcel);
                return new zzz(str, str2, str3, str4, str5, str6, z4, str7);
            case 2:
                int a04 = Q0.a.a0(parcel);
                zzbl zzblVar = null;
                ArrayList arrayList = null;
                zzagl zzaglVar = null;
                zzz zzzVar = null;
                String str8 = null;
                String str9 = null;
                ArrayList arrayList2 = null;
                ArrayList arrayList3 = null;
                String str10 = null;
                Boolean bool = null;
                zzaf zzafVar = null;
                boolean z7 = false;
                zze zzeVar2 = null;
                while (parcel.dataPosition() < a04) {
                    int readInt3 = parcel.readInt();
                    ArrayList arrayList4 = arrayList;
                    switch ((char) readInt3) {
                        case 1:
                            zzaglVar = (zzagl) Q0.a.m(parcel, readInt3, zzagl.CREATOR);
                            break;
                        case 2:
                            zzzVar = (zzz) Q0.a.m(parcel, readInt3, zzz.CREATOR);
                            break;
                        case 3:
                            str8 = Q0.a.n(readInt3, parcel);
                            break;
                        case 4:
                            str9 = Q0.a.n(readInt3, parcel);
                            break;
                        case 5:
                            arrayList2 = Q0.a.r(parcel, readInt3, zzz.CREATOR);
                            break;
                        case 6:
                            arrayList3 = Q0.a.p(readInt3, parcel);
                            break;
                        case 7:
                            str10 = Q0.a.n(readInt3, parcel);
                            break;
                        case '\b':
                            int R6 = Q0.a.R(readInt3, parcel);
                            if (R6 != 0) {
                                Q0.a.f0(parcel, R6, 4);
                                bool = Boolean.valueOf(parcel.readInt() != 0);
                                break;
                            } else {
                                bool = null;
                                break;
                            }
                        case '\t':
                            zzafVar = (zzaf) Q0.a.m(parcel, readInt3, zzaf.CREATOR);
                            break;
                        case '\n':
                            z7 = Q0.a.K(readInt3, parcel);
                            break;
                        case 11:
                            zzeVar2 = (zze) Q0.a.m(parcel, readInt3, zze.CREATOR);
                            break;
                        case '\f':
                            zzblVar = (zzbl) Q0.a.m(parcel, readInt3, zzbl.CREATOR);
                            break;
                        case '\r':
                            arrayList = Q0.a.r(parcel, readInt3, zzan.CREATOR);
                            continue;
                        default:
                            Q0.a.X(readInt3, parcel);
                            break;
                    }
                    arrayList = arrayList4;
                }
                Q0.a.y(a04, parcel);
                zzad zzadVar2 = new zzad();
                zzadVar2.f11908a = zzaglVar;
                zzadVar2.f11909b = zzzVar;
                zzadVar2.f11910c = str8;
                zzadVar2.f11911d = str9;
                zzadVar2.f11912e = arrayList2;
                zzadVar2.f11913f = arrayList3;
                zzadVar2.f11914x = str10;
                zzadVar2.f11915y = bool;
                zzadVar2.f11916z = zzafVar;
                zzadVar2.f11904A = z7;
                zzadVar2.f11905B = zzeVar2;
                zzadVar2.f11906C = zzblVar;
                zzadVar2.f11907D = arrayList;
                return zzadVar2;
            case 3:
                int a05 = Q0.a.a0(parcel);
                long j = 0;
                long j3 = 0;
                while (parcel.dataPosition() < a05) {
                    int readInt4 = parcel.readInt();
                    char c4 = (char) readInt4;
                    if (c4 == 1) {
                        j = Q0.a.P(readInt4, parcel);
                    } else if (c4 != 2) {
                        Q0.a.X(readInt4, parcel);
                    } else {
                        j3 = Q0.a.P(readInt4, parcel);
                    }
                }
                Q0.a.y(a05, parcel);
                return new zzaf(j, j3);
            case 4:
                int a06 = Q0.a.a0(parcel);
                ArrayList arrayList5 = null;
                zzao zzaoVar = null;
                String str11 = null;
                zze zzeVar3 = null;
                zzad zzadVar3 = null;
                ArrayList arrayList6 = null;
                while (parcel.dataPosition() < a06) {
                    int readInt5 = parcel.readInt();
                    switch ((char) readInt5) {
                        case 1:
                            arrayList5 = Q0.a.r(parcel, readInt5, PhoneMultiFactorInfo.CREATOR);
                            break;
                        case 2:
                            zzaoVar = (zzao) Q0.a.m(parcel, readInt5, zzao.CREATOR);
                            break;
                        case 3:
                            str11 = Q0.a.n(readInt5, parcel);
                            break;
                        case 4:
                            zzeVar3 = (zze) Q0.a.m(parcel, readInt5, zze.CREATOR);
                            break;
                        case 5:
                            zzadVar3 = (zzad) Q0.a.m(parcel, readInt5, zzad.CREATOR);
                            break;
                        case 6:
                            arrayList6 = Q0.a.r(parcel, readInt5, TotpMultiFactorInfo.CREATOR);
                            break;
                        default:
                            Q0.a.X(readInt5, parcel);
                            break;
                    }
                }
                Q0.a.y(a06, parcel);
                return new zzaj(arrayList5, zzaoVar, str11, zzeVar3, zzadVar3, arrayList6);
            case 5:
                int a07 = Q0.a.a0(parcel);
                String str12 = null;
                String str13 = null;
                ArrayList arrayList7 = null;
                ArrayList arrayList8 = null;
                zzad zzadVar4 = null;
                while (parcel.dataPosition() < a07) {
                    int readInt6 = parcel.readInt();
                    char c7 = (char) readInt6;
                    if (c7 == 1) {
                        str12 = Q0.a.n(readInt6, parcel);
                    } else if (c7 == 2) {
                        str13 = Q0.a.n(readInt6, parcel);
                    } else if (c7 == 3) {
                        arrayList7 = Q0.a.r(parcel, readInt6, PhoneMultiFactorInfo.CREATOR);
                    } else if (c7 == 4) {
                        arrayList8 = Q0.a.r(parcel, readInt6, TotpMultiFactorInfo.CREATOR);
                    } else if (c7 != 5) {
                        Q0.a.X(readInt6, parcel);
                    } else {
                        zzadVar4 = (zzad) Q0.a.m(parcel, readInt6, zzad.CREATOR);
                    }
                }
                Q0.a.y(a07, parcel);
                zzao zzaoVar2 = new zzao();
                zzaoVar2.f11925a = str12;
                zzaoVar2.f11926b = str13;
                zzaoVar2.f11927c = arrayList7;
                zzaoVar2.f11928d = arrayList8;
                zzaoVar2.f11929e = zzadVar4;
                return zzaoVar2;
            case 6:
                int a08 = Q0.a.a0(parcel);
                ArrayList arrayList9 = null;
                ArrayList arrayList10 = null;
                while (parcel.dataPosition() < a08) {
                    int readInt7 = parcel.readInt();
                    char c8 = (char) readInt7;
                    if (c8 == 1) {
                        arrayList9 = Q0.a.r(parcel, readInt7, PhoneMultiFactorInfo.CREATOR);
                    } else if (c8 != 2) {
                        Q0.a.X(readInt7, parcel);
                    } else {
                        arrayList10 = Q0.a.r(parcel, readInt7, TotpMultiFactorInfo.CREATOR);
                    }
                }
                Q0.a.y(a08, parcel);
                return new zzbl(arrayList9, arrayList10);
            default:
                int a09 = Q0.a.a0(parcel);
                String str14 = null;
                boolean z8 = false;
                String str15 = null;
                while (parcel.dataPosition() < a09) {
                    int readInt8 = parcel.readInt();
                    char c9 = (char) readInt8;
                    if (c9 == 1) {
                        str14 = Q0.a.n(readInt8, parcel);
                    } else if (c9 == 2) {
                        str15 = Q0.a.n(readInt8, parcel);
                    } else if (c9 != 3) {
                        Q0.a.X(readInt8, parcel);
                    } else {
                        z8 = Q0.a.K(readInt8, parcel);
                    }
                }
                Q0.a.y(a09, parcel);
                return new zzv(str14, str15, z8);
        }
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i7) {
        switch (this.f12934a) {
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
