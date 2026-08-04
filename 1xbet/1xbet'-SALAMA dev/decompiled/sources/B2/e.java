package B2;

import android.content.Intent;
import android.location.Location;
import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.versionedparcelable.ParcelImpl;
import com.google.android.exoplayer2.drm.DrmInitData;
import com.google.android.exoplayer2.metadata.dvbsi.AppInfoTable;
import com.google.android.exoplayer2.metadata.emsg.EventMessage;
import com.google.android.exoplayer2.metadata.flac.PictureFrame;
import com.google.android.exoplayer2.metadata.flac.VorbisComment;
import com.google.android.gms.ads.formats.AdManagerAdViewOptions;
import com.google.android.gms.ads.formats.PublisherAdViewOptions;
import com.google.android.gms.ads.internal.client.zzc;
import com.google.android.gms.ads.internal.client.zze;
import com.google.android.gms.ads.internal.client.zzee;
import com.google.android.gms.ads.internal.client.zzey;
import com.google.android.gms.ads.internal.client.zzfq;
import com.google.android.gms.ads.internal.client.zzfs;
import com.google.android.gms.ads.internal.client.zzfu;
import com.google.android.gms.ads.internal.client.zzfx;
import com.google.android.gms.ads.internal.client.zzm;
import com.google.android.gms.ads.internal.client.zzr;
import com.google.android.gms.ads.internal.client.zzt;
import com.google.android.gms.ads.internal.client.zzv;
import com.google.android.gms.ads.internal.client.zzx;
import com.google.android.gms.ads.internal.offline.buffering.zza;
import com.google.android.gms.ads.internal.overlay.AdOverlayInfoParcel;
import com.google.android.gms.ads.internal.util.client.VersionInfoParcel;
import com.google.android.gms.ads.internal.util.zzbb;
import com.google.android.gms.ads.internal.zzl;
import com.google.android.gms.auth.AccountChangeEvent;
import com.google.android.gms.internal.ads.zzbbd;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes.dex */
public final class e implements Parcelable.Creator {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f1053a;

    public /* synthetic */ e(int i7) {
        this.f1053a = i7;
    }

    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        switch (this.f1053a) {
            case 0:
                int iA0 = Q0.a.a0(parcel);
                boolean zK = false;
                while (parcel.dataPosition() < iA0) {
                    int i7 = parcel.readInt();
                    if (((char) i7) != 1) {
                        Q0.a.X(i7, parcel);
                    } else {
                        zK = Q0.a.K(i7, parcel);
                    }
                }
                Q0.a.y(iA0, parcel);
                return new AdManagerAdViewOptions(zK);
            case 1:
                int iA1 = Q0.a.a0(parcel);
                IBinder iBinderM = null;
                boolean zK2 = false;
                IBinder iBinderM2 = null;
                while (parcel.dataPosition() < iA1) {
                    int i8 = parcel.readInt();
                    char c3 = (char) i8;
                    if (c3 == 1) {
                        zK2 = Q0.a.K(i8, parcel);
                    } else if (c3 == 2) {
                        iBinderM = Q0.a.M(i8, parcel);
                    } else if (c3 != 3) {
                        Q0.a.X(i8, parcel);
                    } else {
                        iBinderM2 = Q0.a.M(i8, parcel);
                    }
                }
                Q0.a.y(iA1, parcel);
                return new PublisherAdViewOptions(zK2, iBinderM, iBinderM2);
            case 2:
                return new DrmInitData(parcel);
            case 3:
                int iA2 = Q0.a.a0(parcel);
                boolean zK3 = false;
                boolean zK4 = false;
                boolean zK5 = false;
                int iN = 0;
                boolean zK6 = false;
                boolean zK7 = false;
                boolean zK8 = false;
                float f7 = 0.0f;
                String strN = null;
                while (parcel.dataPosition() < iA2) {
                    int i9 = parcel.readInt();
                    switch ((char) i9) {
                        case 2:
                            zK3 = Q0.a.K(i9, parcel);
                            break;
                        case 3:
                            zK4 = Q0.a.K(i9, parcel);
                            break;
                        case 4:
                            strN = Q0.a.n(i9, parcel);
                            break;
                        case 5:
                            zK5 = Q0.a.K(i9, parcel);
                            break;
                        case 6:
                            Q0.a.j0(parcel, i9, 4);
                            f7 = parcel.readFloat();
                            break;
                        case 7:
                            iN = Q0.a.N(i9, parcel);
                            break;
                        case '\b':
                            zK6 = Q0.a.K(i9, parcel);
                            break;
                        case '\t':
                            zK7 = Q0.a.K(i9, parcel);
                            break;
                        case '\n':
                            zK8 = Q0.a.K(i9, parcel);
                            break;
                        default:
                            Q0.a.X(i9, parcel);
                            break;
                    }
                }
                Q0.a.y(iA2, parcel);
                return new zzl(zK3, zK4, strN, zK5, f7, iN, zK6, zK7, zK8);
            case 4:
                int iA3 = Q0.a.a0(parcel);
                String strN2 = null;
                String strN3 = null;
                while (parcel.dataPosition() < iA3) {
                    int i10 = parcel.readInt();
                    char c4 = (char) i10;
                    if (c4 == 1) {
                        strN2 = Q0.a.n(i10, parcel);
                    } else if (c4 != 2) {
                        Q0.a.X(i10, parcel);
                    } else {
                        strN3 = Q0.a.n(i10, parcel);
                    }
                }
                Q0.a.y(iA3, parcel);
                return new zzc(strN2, strN3);
            case 5:
                int iA4 = Q0.a.a0(parcel);
                int iN2 = 0;
                while (parcel.dataPosition() < iA4) {
                    int i11 = parcel.readInt();
                    if (((char) i11) != 2) {
                        Q0.a.X(i11, parcel);
                    } else {
                        iN2 = Q0.a.N(i11, parcel);
                    }
                }
                Q0.a.y(iA4, parcel);
                return new zzee(iN2);
            case 6:
                int iA5 = Q0.a.a0(parcel);
                String strN4 = null;
                int iN3 = 0;
                int iN4 = 0;
                while (parcel.dataPosition() < iA5) {
                    int i12 = parcel.readInt();
                    char c7 = (char) i12;
                    if (c7 == 1) {
                        iN3 = Q0.a.N(i12, parcel);
                    } else if (c7 == 2) {
                        iN4 = Q0.a.N(i12, parcel);
                    } else if (c7 != 3) {
                        Q0.a.X(i12, parcel);
                    } else {
                        strN4 = Q0.a.n(i12, parcel);
                    }
                }
                Q0.a.y(iA5, parcel);
                return new zzey(iN3, iN4, strN4);
            case 7:
                int iA6 = Q0.a.a0(parcel);
                String strN5 = null;
                String strN6 = null;
                zze zzeVar = null;
                IBinder iBinderM3 = null;
                int iN5 = 0;
                while (parcel.dataPosition() < iA6) {
                    int i13 = parcel.readInt();
                    char c8 = (char) i13;
                    if (c8 == 1) {
                        iN5 = Q0.a.N(i13, parcel);
                    } else if (c8 == 2) {
                        strN5 = Q0.a.n(i13, parcel);
                    } else if (c8 == 3) {
                        strN6 = Q0.a.n(i13, parcel);
                    } else if (c8 == 4) {
                        zzeVar = (zze) Q0.a.m(parcel, i13, zze.CREATOR);
                    } else if (c8 != 5) {
                        Q0.a.X(i13, parcel);
                    } else {
                        iBinderM3 = Q0.a.M(i13, parcel);
                    }
                }
                Q0.a.y(iA6, parcel);
                return new zze(iN5, strN5, strN6, zzeVar, iBinderM3);
            case 8:
                int iA7 = Q0.a.a0(parcel);
                int iN6 = 0;
                String strN7 = null;
                zzm zzmVar = null;
                int iN7 = 0;
                while (parcel.dataPosition() < iA7) {
                    int i14 = parcel.readInt();
                    char c9 = (char) i14;
                    if (c9 == 1) {
                        strN7 = Q0.a.n(i14, parcel);
                    } else if (c9 == 2) {
                        iN6 = Q0.a.N(i14, parcel);
                    } else if (c9 == 3) {
                        zzmVar = (zzm) Q0.a.m(parcel, i14, zzm.CREATOR);
                    } else if (c9 != 4) {
                        Q0.a.X(i14, parcel);
                    } else {
                        iN7 = Q0.a.N(i14, parcel);
                    }
                }
                Q0.a.y(iA7, parcel);
                return new zzfq(strN7, iN6, zzmVar, iN7);
            case 9:
                int iA8 = Q0.a.a0(parcel);
                int iN8 = 0;
                int iN9 = 0;
                while (parcel.dataPosition() < iA8) {
                    int i15 = parcel.readInt();
                    char c10 = (char) i15;
                    if (c10 == 1) {
                        iN8 = Q0.a.N(i15, parcel);
                    } else if (c10 != 2) {
                        Q0.a.X(i15, parcel);
                    } else {
                        iN9 = Q0.a.N(i15, parcel);
                    }
                }
                Q0.a.y(iA8, parcel);
                return new zzfs(iN8, iN9);
            case 10:
                int iA9 = Q0.a.a0(parcel);
                String strN8 = null;
                while (parcel.dataPosition() < iA9) {
                    int i16 = parcel.readInt();
                    if (((char) i16) != 15) {
                        Q0.a.X(i16, parcel);
                    } else {
                        strN8 = Q0.a.n(i16, parcel);
                    }
                }
                Q0.a.y(iA9, parcel);
                return new zzfu(strN8);
            case 11:
                int iA10 = Q0.a.a0(parcel);
                boolean zK9 = false;
                boolean zK10 = false;
                boolean zK11 = false;
                while (parcel.dataPosition() < iA10) {
                    int i17 = parcel.readInt();
                    char c11 = (char) i17;
                    if (c11 == 2) {
                        zK9 = Q0.a.K(i17, parcel);
                    } else if (c11 == 3) {
                        zK10 = Q0.a.K(i17, parcel);
                    } else if (c11 != 4) {
                        Q0.a.X(i17, parcel);
                    } else {
                        zK11 = Q0.a.K(i17, parcel);
                    }
                }
                Q0.a.y(iA10, parcel);
                return new zzfx(zK9, zK10, zK11);
            case 12:
                int iA11 = Q0.a.a0(parcel);
                long jP = 0;
                long jP2 = 0;
                int iN10 = 0;
                int iN11 = 0;
                boolean zK12 = false;
                int iN12 = 0;
                boolean zK13 = false;
                boolean zK14 = false;
                int iN13 = 0;
                int iN14 = 0;
                int iN15 = 0;
                Bundle bundleJ = null;
                ArrayList arrayListP = null;
                String strN9 = null;
                zzfu zzfuVar = null;
                Location location = null;
                String strN10 = null;
                Bundle bundleJ2 = null;
                Bundle bundleJ3 = null;
                ArrayList arrayListP2 = null;
                String strN11 = null;
                String strN12 = null;
                zzc zzcVar = null;
                String strN13 = null;
                ArrayList arrayListP3 = null;
                String strN14 = null;
                while (parcel.dataPosition() < iA11) {
                    int i18 = parcel.readInt();
                    switch ((char) i18) {
                        case 1:
                            iN10 = Q0.a.N(i18, parcel);
                            break;
                        case 2:
                            jP = Q0.a.P(i18, parcel);
                            break;
                        case 3:
                            bundleJ = Q0.a.j(i18, parcel);
                            break;
                        case 4:
                            iN11 = Q0.a.N(i18, parcel);
                            break;
                        case 5:
                            arrayListP = Q0.a.p(i18, parcel);
                            break;
                        case 6:
                            zK12 = Q0.a.K(i18, parcel);
                            break;
                        case 7:
                            iN12 = Q0.a.N(i18, parcel);
                            break;
                        case '\b':
                            zK13 = Q0.a.K(i18, parcel);
                            break;
                        case '\t':
                            strN9 = Q0.a.n(i18, parcel);
                            break;
                        case '\n':
                            zzfuVar = (zzfu) Q0.a.m(parcel, i18, zzfu.CREATOR);
                            break;
                        case 11:
                            location = (Location) Q0.a.m(parcel, i18, Location.CREATOR);
                            break;
                        case '\f':
                            strN10 = Q0.a.n(i18, parcel);
                            break;
                        case '\r':
                            bundleJ2 = Q0.a.j(i18, parcel);
                            break;
                        case 14:
                            bundleJ3 = Q0.a.j(i18, parcel);
                            break;
                        case 15:
                            arrayListP2 = Q0.a.p(i18, parcel);
                            break;
                        case 16:
                            strN11 = Q0.a.n(i18, parcel);
                            break;
                        case 17:
                            strN12 = Q0.a.n(i18, parcel);
                            break;
                        case 18:
                            zK14 = Q0.a.K(i18, parcel);
                            break;
                        case 19:
                            zzcVar = (zzc) Q0.a.m(parcel, i18, zzc.CREATOR);
                            break;
                        case 20:
                            iN13 = Q0.a.N(i18, parcel);
                            break;
                        case zzbbd.zzt.zzm /* 21 */:
                            strN13 = Q0.a.n(i18, parcel);
                            break;
                        case 22:
                            arrayListP3 = Q0.a.p(i18, parcel);
                            break;
                        case 23:
                            iN14 = Q0.a.N(i18, parcel);
                            break;
                        case 24:
                            strN14 = Q0.a.n(i18, parcel);
                            break;
                        case 25:
                            iN15 = Q0.a.N(i18, parcel);
                            break;
                        case 26:
                            jP2 = Q0.a.P(i18, parcel);
                            break;
                        default:
                            Q0.a.X(i18, parcel);
                            break;
                    }
                }
                Q0.a.y(iA11, parcel);
                return new zzm(iN10, jP, bundleJ, iN11, arrayListP, zK12, iN12, zK13, strN9, zzfuVar, location, strN10, bundleJ2, bundleJ3, arrayListP2, strN11, strN12, zK14, zzcVar, iN13, strN13, arrayListP3, iN14, strN14, iN15, jP2);
            case 13:
                int iA12 = Q0.a.a0(parcel);
                int iN16 = 0;
                int iN17 = 0;
                boolean zK15 = false;
                int iN18 = 0;
                int iN19 = 0;
                boolean zK16 = false;
                boolean zK17 = false;
                boolean zK18 = false;
                boolean zK19 = false;
                boolean zK20 = false;
                boolean zK21 = false;
                boolean zK22 = false;
                boolean zK23 = false;
                String strN15 = null;
                zzr[] zzrVarArr = null;
                while (parcel.dataPosition() < iA12) {
                    int i19 = parcel.readInt();
                    switch ((char) i19) {
                        case 2:
                            strN15 = Q0.a.n(i19, parcel);
                            break;
                        case 3:
                            iN16 = Q0.a.N(i19, parcel);
                            break;
                        case 4:
                            iN17 = Q0.a.N(i19, parcel);
                            break;
                        case 5:
                            zK15 = Q0.a.K(i19, parcel);
                            break;
                        case 6:
                            iN18 = Q0.a.N(i19, parcel);
                            break;
                        case 7:
                            iN19 = Q0.a.N(i19, parcel);
                            break;
                        case '\b':
                            zzrVarArr = (zzr[]) Q0.a.q(parcel, i19, zzr.CREATOR);
                            break;
                        case '\t':
                            zK16 = Q0.a.K(i19, parcel);
                            break;
                        case '\n':
                            zK17 = Q0.a.K(i19, parcel);
                            break;
                        case 11:
                            zK18 = Q0.a.K(i19, parcel);
                            break;
                        case '\f':
                            zK19 = Q0.a.K(i19, parcel);
                            break;
                        case '\r':
                            zK20 = Q0.a.K(i19, parcel);
                            break;
                        case 14:
                            zK21 = Q0.a.K(i19, parcel);
                            break;
                        case 15:
                            zK22 = Q0.a.K(i19, parcel);
                            break;
                        case 16:
                            zK23 = Q0.a.K(i19, parcel);
                            break;
                        default:
                            Q0.a.X(i19, parcel);
                            break;
                    }
                }
                Q0.a.y(iA12, parcel);
                return new zzr(strN15, iN16, iN17, zK15, iN18, iN19, zzrVarArr, zK16, zK17, zK18, zK19, zK20, zK21, zK22, zK23);
            case 14:
                int iA13 = Q0.a.a0(parcel);
                long jP3 = 0;
                String strN16 = null;
                int iN20 = 0;
                int iN21 = 0;
                while (parcel.dataPosition() < iA13) {
                    int i20 = parcel.readInt();
                    char c12 = (char) i20;
                    if (c12 == 1) {
                        iN20 = Q0.a.N(i20, parcel);
                    } else if (c12 == 2) {
                        iN21 = Q0.a.N(i20, parcel);
                    } else if (c12 == 3) {
                        strN16 = Q0.a.n(i20, parcel);
                    } else if (c12 != 4) {
                        Q0.a.X(i20, parcel);
                    } else {
                        jP3 = Q0.a.P(i20, parcel);
                    }
                }
                Q0.a.y(iA13, parcel);
                return new zzt(iN20, iN21, jP3, strN16);
            case 15:
                int iA14 = Q0.a.a0(parcel);
                String strN17 = null;
                zze zzeVar2 = null;
                Bundle bundleJ4 = null;
                String strN18 = null;
                String strN19 = null;
                String strN20 = null;
                String strN21 = null;
                long jP4 = 0;
                while (parcel.dataPosition() < iA14) {
                    int i21 = parcel.readInt();
                    switch ((char) i21) {
                        case 1:
                            strN17 = Q0.a.n(i21, parcel);
                            break;
                        case 2:
                            jP4 = Q0.a.P(i21, parcel);
                            break;
                        case 3:
                            zzeVar2 = (zze) Q0.a.m(parcel, i21, zze.CREATOR);
                            break;
                        case 4:
                            bundleJ4 = Q0.a.j(i21, parcel);
                            break;
                        case 5:
                            strN18 = Q0.a.n(i21, parcel);
                            break;
                        case 6:
                            strN19 = Q0.a.n(i21, parcel);
                            break;
                        case 7:
                            strN20 = Q0.a.n(i21, parcel);
                            break;
                        case '\b':
                            strN21 = Q0.a.n(i21, parcel);
                            break;
                        default:
                            Q0.a.X(i21, parcel);
                            break;
                    }
                }
                Q0.a.y(iA14, parcel);
                return new zzv(strN17, jP4, zzeVar2, bundleJ4, strN18, strN19, strN20, strN21);
            case 16:
                int iA15 = Q0.a.a0(parcel);
                int iN22 = 0;
                while (parcel.dataPosition() < iA15) {
                    int i22 = parcel.readInt();
                    if (((char) i22) != 2) {
                        Q0.a.X(i22, parcel);
                    } else {
                        iN22 = Q0.a.N(i22, parcel);
                    }
                }
                Q0.a.y(iA15, parcel);
                return new zzx(iN22);
            case 17:
                int iA16 = Q0.a.a0(parcel);
                String strN22 = null;
                String strN23 = null;
                String strN24 = null;
                while (parcel.dataPosition() < iA16) {
                    int i23 = parcel.readInt();
                    char c13 = (char) i23;
                    if (c13 == 1) {
                        strN22 = Q0.a.n(i23, parcel);
                    } else if (c13 == 2) {
                        strN23 = Q0.a.n(i23, parcel);
                    } else if (c13 != 3) {
                        Q0.a.X(i23, parcel);
                    } else {
                        strN24 = Q0.a.n(i23, parcel);
                    }
                }
                Q0.a.y(iA16, parcel);
                return new zza(strN22, strN23, strN24);
            case 18:
                int iA17 = Q0.a.a0(parcel);
                boolean zK24 = false;
                String strN25 = null;
                String strN26 = null;
                String strN27 = null;
                String strN28 = null;
                String strN29 = null;
                String strN30 = null;
                String strN31 = null;
                Intent intent = null;
                IBinder iBinderM4 = null;
                while (parcel.dataPosition() < iA17) {
                    int i24 = parcel.readInt();
                    switch ((char) i24) {
                        case 2:
                            strN25 = Q0.a.n(i24, parcel);
                            break;
                        case 3:
                            strN26 = Q0.a.n(i24, parcel);
                            break;
                        case 4:
                            strN27 = Q0.a.n(i24, parcel);
                            break;
                        case 5:
                            strN28 = Q0.a.n(i24, parcel);
                            break;
                        case 6:
                            strN29 = Q0.a.n(i24, parcel);
                            break;
                        case 7:
                            strN30 = Q0.a.n(i24, parcel);
                            break;
                        case '\b':
                            strN31 = Q0.a.n(i24, parcel);
                            break;
                        case '\t':
                            intent = (Intent) Q0.a.m(parcel, i24, Intent.CREATOR);
                            break;
                        case '\n':
                            iBinderM4 = Q0.a.M(i24, parcel);
                            break;
                        case 11:
                            zK24 = Q0.a.K(i24, parcel);
                            break;
                        default:
                            Q0.a.X(i24, parcel);
                            break;
                    }
                }
                Q0.a.y(iA17, parcel);
                return new com.google.android.gms.ads.internal.overlay.zzc(strN25, strN26, strN27, strN28, strN29, strN30, strN31, intent, iBinderM4, zK24);
            case 19:
                int iA18 = Q0.a.a0(parcel);
                long jP5 = 0;
                boolean zK25 = false;
                int iN23 = 0;
                int iN24 = 0;
                boolean zK26 = false;
                com.google.android.gms.ads.internal.overlay.zzc zzcVar2 = null;
                IBinder iBinderM5 = null;
                IBinder iBinderM6 = null;
                IBinder iBinderM7 = null;
                IBinder iBinderM8 = null;
                String strN32 = null;
                String strN33 = null;
                IBinder iBinderM9 = null;
                String strN34 = null;
                VersionInfoParcel versionInfoParcel = null;
                String strN35 = null;
                zzl zzlVar = null;
                IBinder iBinderM10 = null;
                String strN36 = null;
                String strN37 = null;
                String strN38 = null;
                IBinder iBinderM11 = null;
                IBinder iBinderM12 = null;
                IBinder iBinderM13 = null;
                while (parcel.dataPosition() < iA18) {
                    int i25 = parcel.readInt();
                    switch ((char) i25) {
                        case 2:
                            zzcVar2 = (com.google.android.gms.ads.internal.overlay.zzc) Q0.a.m(parcel, i25, com.google.android.gms.ads.internal.overlay.zzc.CREATOR);
                            break;
                        case 3:
                            iBinderM5 = Q0.a.M(i25, parcel);
                            break;
                        case 4:
                            iBinderM6 = Q0.a.M(i25, parcel);
                            break;
                        case 5:
                            iBinderM7 = Q0.a.M(i25, parcel);
                            break;
                        case 6:
                            iBinderM8 = Q0.a.M(i25, parcel);
                            break;
                        case 7:
                            strN32 = Q0.a.n(i25, parcel);
                            break;
                        case '\b':
                            zK25 = Q0.a.K(i25, parcel);
                            break;
                        case '\t':
                            strN33 = Q0.a.n(i25, parcel);
                            break;
                        case '\n':
                            iBinderM9 = Q0.a.M(i25, parcel);
                            break;
                        case 11:
                            iN23 = Q0.a.N(i25, parcel);
                            break;
                        case '\f':
                            iN24 = Q0.a.N(i25, parcel);
                            break;
                        case '\r':
                            strN34 = Q0.a.n(i25, parcel);
                            break;
                        case 14:
                            versionInfoParcel = (VersionInfoParcel) Q0.a.m(parcel, i25, VersionInfoParcel.CREATOR);
                            break;
                        case 15:
                        case 20:
                        case zzbbd.zzt.zzm /* 21 */:
                        case 22:
                        case 23:
                        default:
                            Q0.a.X(i25, parcel);
                            break;
                        case 16:
                            strN35 = Q0.a.n(i25, parcel);
                            break;
                        case 17:
                            zzlVar = (zzl) Q0.a.m(parcel, i25, zzl.CREATOR);
                            break;
                        case 18:
                            iBinderM10 = Q0.a.M(i25, parcel);
                            break;
                        case 19:
                            strN36 = Q0.a.n(i25, parcel);
                            break;
                        case 24:
                            strN37 = Q0.a.n(i25, parcel);
                            break;
                        case 25:
                            strN38 = Q0.a.n(i25, parcel);
                            break;
                        case 26:
                            iBinderM11 = Q0.a.M(i25, parcel);
                            break;
                        case 27:
                            iBinderM12 = Q0.a.M(i25, parcel);
                            break;
                        case 28:
                            iBinderM13 = Q0.a.M(i25, parcel);
                            break;
                        case 29:
                            zK26 = Q0.a.K(i25, parcel);
                            break;
                        case 30:
                            jP5 = Q0.a.P(i25, parcel);
                            break;
                    }
                }
                Q0.a.y(iA18, parcel);
                return new AdOverlayInfoParcel(zzcVar2, iBinderM5, iBinderM6, iBinderM7, iBinderM8, strN32, zK25, strN33, iBinderM9, iN23, iN24, strN34, versionInfoParcel, strN35, zzlVar, iBinderM10, strN36, strN37, strN38, iBinderM11, iBinderM12, iBinderM13, zK26, jP5);
            case 20:
                int iA19 = Q0.a.a0(parcel);
                int iN25 = 0;
                String strN39 = null;
                while (parcel.dataPosition() < iA19) {
                    int i26 = parcel.readInt();
                    char c14 = (char) i26;
                    if (c14 == 1) {
                        strN39 = Q0.a.n(i26, parcel);
                    } else if (c14 != 2) {
                        Q0.a.X(i26, parcel);
                    } else {
                        iN25 = Q0.a.N(i26, parcel);
                    }
                }
                Q0.a.y(iA19, parcel);
                return new zzbb(strN39, iN25);
            case zzbbd.zzt.zzm /* 21 */:
                int iA20 = Q0.a.a0(parcel);
                int iN26 = 0;
                int iN27 = 0;
                boolean zK27 = false;
                boolean zK28 = false;
                String strN40 = null;
                while (parcel.dataPosition() < iA20) {
                    int i27 = parcel.readInt();
                    char c15 = (char) i27;
                    if (c15 == 2) {
                        strN40 = Q0.a.n(i27, parcel);
                    } else if (c15 == 3) {
                        iN26 = Q0.a.N(i27, parcel);
                    } else if (c15 == 4) {
                        iN27 = Q0.a.N(i27, parcel);
                    } else if (c15 == 5) {
                        zK27 = Q0.a.K(i27, parcel);
                    } else if (c15 != 6) {
                        Q0.a.X(i27, parcel);
                    } else {
                        zK28 = Q0.a.K(i27, parcel);
                    }
                }
                Q0.a.y(iA20, parcel);
                return new VersionInfoParcel(strN40, iN26, iN27, zK27, zK28);
            case 22:
                return new ParcelImpl(parcel);
            case 23:
                String string = parcel.readString();
                string.getClass();
                return new AppInfoTable(parcel.readInt(), string);
            case 24:
                return new EventMessage(parcel);
            case 25:
                int iA21 = Q0.a.a0(parcel);
                String strN41 = null;
                String strN42 = null;
                while (parcel.dataPosition() < iA21) {
                    int i28 = parcel.readInt();
                    char c16 = (char) i28;
                    if (c16 == 1) {
                        strN41 = Q0.a.n(i28, parcel);
                    } else if (c16 != 2) {
                        Q0.a.X(i28, parcel);
                    } else {
                        strN42 = Q0.a.n(i28, parcel);
                    }
                }
                Q0.a.y(iA21, parcel);
                return new com.google.android.gms.appset.zza(strN41, strN42);
            case 26:
                int iA22 = Q0.a.a0(parcel);
                String strN43 = null;
                int iN28 = 0;
                while (parcel.dataPosition() < iA22) {
                    int i29 = parcel.readInt();
                    char c17 = (char) i29;
                    if (c17 == 1) {
                        strN43 = Q0.a.n(i29, parcel);
                    } else if (c17 != 2) {
                        Q0.a.X(i29, parcel);
                    } else {
                        iN28 = Q0.a.N(i29, parcel);
                    }
                }
                Q0.a.y(iA22, parcel);
                return new com.google.android.gms.appset.zzc(strN43, iN28);
            case 27:
                return new PictureFrame(parcel);
            case 28:
                return new VorbisComment(parcel);
            default:
                int iA23 = Q0.a.a0(parcel);
                int iN29 = 0;
                int iN30 = 0;
                int iN31 = 0;
                long jP6 = 0;
                String strN44 = null;
                String strN45 = null;
                while (parcel.dataPosition() < iA23) {
                    int i30 = parcel.readInt();
                    switch ((char) i30) {
                        case 1:
                            iN29 = Q0.a.N(i30, parcel);
                            break;
                        case 2:
                            jP6 = Q0.a.P(i30, parcel);
                            break;
                        case 3:
                            strN44 = Q0.a.n(i30, parcel);
                            break;
                        case 4:
                            iN30 = Q0.a.N(i30, parcel);
                            break;
                        case 5:
                            iN31 = Q0.a.N(i30, parcel);
                            break;
                        case 6:
                            strN45 = Q0.a.n(i30, parcel);
                            break;
                        default:
                            Q0.a.X(i30, parcel);
                            break;
                    }
                }
                Q0.a.y(iA23, parcel);
                return new AccountChangeEvent(iN29, jP6, strN44, iN30, iN31, strN45);
        }
    }

    @Override // android.os.Parcelable.Creator
    public final Object[] newArray(int i7) {
        switch (this.f1053a) {
            case 0:
                return new AdManagerAdViewOptions[i7];
            case 1:
                return new PublisherAdViewOptions[i7];
            case 2:
                return new DrmInitData[i7];
            case 3:
                return new zzl[i7];
            case 4:
                return new zzc[i7];
            case 5:
                return new zzee[i7];
            case 6:
                return new zzey[i7];
            case 7:
                return new zze[i7];
            case 8:
                return new zzfq[i7];
            case 9:
                return new zzfs[i7];
            case 10:
                return new zzfu[i7];
            case 11:
                return new zzfx[i7];
            case 12:
                return new zzm[i7];
            case 13:
                return new zzr[i7];
            case 14:
                return new zzt[i7];
            case 15:
                return new zzv[i7];
            case 16:
                return new zzx[i7];
            case 17:
                return new zza[i7];
            case 18:
                return new com.google.android.gms.ads.internal.overlay.zzc[i7];
            case 19:
                return new AdOverlayInfoParcel[i7];
            case 20:
                return new zzbb[i7];
            case zzbbd.zzt.zzm /* 21 */:
                return new VersionInfoParcel[i7];
            case 22:
                return new ParcelImpl[i7];
            case 23:
                return new AppInfoTable[i7];
            case 24:
                return new EventMessage[i7];
            case 25:
                return new com.google.android.gms.appset.zza[i7];
            case 26:
                return new com.google.android.gms.appset.zzc[i7];
            case 27:
                return new PictureFrame[i7];
            case 28:
                return new VorbisComment[i7];
            default:
                return new AccountChangeEvent[i7];
        }
    }
}
