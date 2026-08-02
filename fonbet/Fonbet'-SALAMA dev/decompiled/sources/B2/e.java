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

/* loaded from: classes.dex */
public final class e implements Parcelable.Creator {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f1053a;

    public /* synthetic */ e(int i7) {
        this.f1053a = i7;
    }

    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        switch (this.f1053a) {
            case 0:
                int a02 = Q0.a.a0(parcel);
                boolean z4 = false;
                while (parcel.dataPosition() < a02) {
                    int readInt = parcel.readInt();
                    if (((char) readInt) != 1) {
                        Q0.a.X(readInt, parcel);
                    } else {
                        z4 = Q0.a.K(readInt, parcel);
                    }
                }
                Q0.a.y(a02, parcel);
                return new AdManagerAdViewOptions(z4);
            case 1:
                int a03 = Q0.a.a0(parcel);
                IBinder iBinder = null;
                boolean z7 = false;
                IBinder iBinder2 = null;
                while (parcel.dataPosition() < a03) {
                    int readInt2 = parcel.readInt();
                    char c3 = (char) readInt2;
                    if (c3 == 1) {
                        z7 = Q0.a.K(readInt2, parcel);
                    } else if (c3 == 2) {
                        iBinder = Q0.a.M(readInt2, parcel);
                    } else if (c3 != 3) {
                        Q0.a.X(readInt2, parcel);
                    } else {
                        iBinder2 = Q0.a.M(readInt2, parcel);
                    }
                }
                Q0.a.y(a03, parcel);
                return new PublisherAdViewOptions(z7, iBinder, iBinder2);
            case 2:
                return new DrmInitData(parcel);
            case 3:
                int a04 = Q0.a.a0(parcel);
                boolean z8 = false;
                boolean z9 = false;
                boolean z10 = false;
                int i7 = 0;
                boolean z11 = false;
                boolean z12 = false;
                boolean z13 = false;
                float f7 = 0.0f;
                String str = null;
                while (parcel.dataPosition() < a04) {
                    int readInt3 = parcel.readInt();
                    switch ((char) readInt3) {
                        case 2:
                            z8 = Q0.a.K(readInt3, parcel);
                            break;
                        case 3:
                            z9 = Q0.a.K(readInt3, parcel);
                            break;
                        case 4:
                            str = Q0.a.n(readInt3, parcel);
                            break;
                        case 5:
                            z10 = Q0.a.K(readInt3, parcel);
                            break;
                        case 6:
                            Q0.a.j0(parcel, readInt3, 4);
                            f7 = parcel.readFloat();
                            break;
                        case 7:
                            i7 = Q0.a.N(readInt3, parcel);
                            break;
                        case '\b':
                            z11 = Q0.a.K(readInt3, parcel);
                            break;
                        case '\t':
                            z12 = Q0.a.K(readInt3, parcel);
                            break;
                        case '\n':
                            z13 = Q0.a.K(readInt3, parcel);
                            break;
                        default:
                            Q0.a.X(readInt3, parcel);
                            break;
                    }
                }
                Q0.a.y(a04, parcel);
                return new zzl(z8, z9, str, z10, f7, i7, z11, z12, z13);
            case 4:
                int a05 = Q0.a.a0(parcel);
                String str2 = null;
                String str3 = null;
                while (parcel.dataPosition() < a05) {
                    int readInt4 = parcel.readInt();
                    char c4 = (char) readInt4;
                    if (c4 == 1) {
                        str2 = Q0.a.n(readInt4, parcel);
                    } else if (c4 != 2) {
                        Q0.a.X(readInt4, parcel);
                    } else {
                        str3 = Q0.a.n(readInt4, parcel);
                    }
                }
                Q0.a.y(a05, parcel);
                return new zzc(str2, str3);
            case 5:
                int a06 = Q0.a.a0(parcel);
                int i8 = 0;
                while (parcel.dataPosition() < a06) {
                    int readInt5 = parcel.readInt();
                    if (((char) readInt5) != 2) {
                        Q0.a.X(readInt5, parcel);
                    } else {
                        i8 = Q0.a.N(readInt5, parcel);
                    }
                }
                Q0.a.y(a06, parcel);
                return new zzee(i8);
            case 6:
                int a07 = Q0.a.a0(parcel);
                String str4 = null;
                int i9 = 0;
                int i10 = 0;
                while (parcel.dataPosition() < a07) {
                    int readInt6 = parcel.readInt();
                    char c7 = (char) readInt6;
                    if (c7 == 1) {
                        i9 = Q0.a.N(readInt6, parcel);
                    } else if (c7 == 2) {
                        i10 = Q0.a.N(readInt6, parcel);
                    } else if (c7 != 3) {
                        Q0.a.X(readInt6, parcel);
                    } else {
                        str4 = Q0.a.n(readInt6, parcel);
                    }
                }
                Q0.a.y(a07, parcel);
                return new zzey(i9, i10, str4);
            case 7:
                int a08 = Q0.a.a0(parcel);
                String str5 = null;
                String str6 = null;
                zze zzeVar = null;
                IBinder iBinder3 = null;
                int i11 = 0;
                while (parcel.dataPosition() < a08) {
                    int readInt7 = parcel.readInt();
                    char c8 = (char) readInt7;
                    if (c8 == 1) {
                        i11 = Q0.a.N(readInt7, parcel);
                    } else if (c8 == 2) {
                        str5 = Q0.a.n(readInt7, parcel);
                    } else if (c8 == 3) {
                        str6 = Q0.a.n(readInt7, parcel);
                    } else if (c8 == 4) {
                        zzeVar = (zze) Q0.a.m(parcel, readInt7, zze.CREATOR);
                    } else if (c8 != 5) {
                        Q0.a.X(readInt7, parcel);
                    } else {
                        iBinder3 = Q0.a.M(readInt7, parcel);
                    }
                }
                Q0.a.y(a08, parcel);
                return new zze(i11, str5, str6, zzeVar, iBinder3);
            case 8:
                int a09 = Q0.a.a0(parcel);
                int i12 = 0;
                String str7 = null;
                zzm zzmVar = null;
                int i13 = 0;
                while (parcel.dataPosition() < a09) {
                    int readInt8 = parcel.readInt();
                    char c9 = (char) readInt8;
                    if (c9 == 1) {
                        str7 = Q0.a.n(readInt8, parcel);
                    } else if (c9 == 2) {
                        i12 = Q0.a.N(readInt8, parcel);
                    } else if (c9 == 3) {
                        zzmVar = (zzm) Q0.a.m(parcel, readInt8, zzm.CREATOR);
                    } else if (c9 != 4) {
                        Q0.a.X(readInt8, parcel);
                    } else {
                        i13 = Q0.a.N(readInt8, parcel);
                    }
                }
                Q0.a.y(a09, parcel);
                return new zzfq(str7, i12, zzmVar, i13);
            case 9:
                int a010 = Q0.a.a0(parcel);
                int i14 = 0;
                int i15 = 0;
                while (parcel.dataPosition() < a010) {
                    int readInt9 = parcel.readInt();
                    char c10 = (char) readInt9;
                    if (c10 == 1) {
                        i14 = Q0.a.N(readInt9, parcel);
                    } else if (c10 != 2) {
                        Q0.a.X(readInt9, parcel);
                    } else {
                        i15 = Q0.a.N(readInt9, parcel);
                    }
                }
                Q0.a.y(a010, parcel);
                return new zzfs(i14, i15);
            case 10:
                int a011 = Q0.a.a0(parcel);
                String str8 = null;
                while (parcel.dataPosition() < a011) {
                    int readInt10 = parcel.readInt();
                    if (((char) readInt10) != 15) {
                        Q0.a.X(readInt10, parcel);
                    } else {
                        str8 = Q0.a.n(readInt10, parcel);
                    }
                }
                Q0.a.y(a011, parcel);
                return new zzfu(str8);
            case 11:
                int a012 = Q0.a.a0(parcel);
                boolean z14 = false;
                boolean z15 = false;
                boolean z16 = false;
                while (parcel.dataPosition() < a012) {
                    int readInt11 = parcel.readInt();
                    char c11 = (char) readInt11;
                    if (c11 == 2) {
                        z14 = Q0.a.K(readInt11, parcel);
                    } else if (c11 == 3) {
                        z15 = Q0.a.K(readInt11, parcel);
                    } else if (c11 != 4) {
                        Q0.a.X(readInt11, parcel);
                    } else {
                        z16 = Q0.a.K(readInt11, parcel);
                    }
                }
                Q0.a.y(a012, parcel);
                return new zzfx(z14, z15, z16);
            case 12:
                int a013 = Q0.a.a0(parcel);
                long j = 0;
                long j3 = 0;
                int i16 = 0;
                int i17 = 0;
                boolean z17 = false;
                int i18 = 0;
                boolean z18 = false;
                boolean z19 = false;
                int i19 = 0;
                int i20 = 0;
                int i21 = 0;
                Bundle bundle = null;
                ArrayList arrayList = null;
                String str9 = null;
                zzfu zzfuVar = null;
                Location location = null;
                String str10 = null;
                Bundle bundle2 = null;
                Bundle bundle3 = null;
                ArrayList arrayList2 = null;
                String str11 = null;
                String str12 = null;
                zzc zzcVar = null;
                String str13 = null;
                ArrayList arrayList3 = null;
                String str14 = null;
                while (parcel.dataPosition() < a013) {
                    int readInt12 = parcel.readInt();
                    switch ((char) readInt12) {
                        case 1:
                            i16 = Q0.a.N(readInt12, parcel);
                            break;
                        case 2:
                            j = Q0.a.P(readInt12, parcel);
                            break;
                        case 3:
                            bundle = Q0.a.j(readInt12, parcel);
                            break;
                        case 4:
                            i17 = Q0.a.N(readInt12, parcel);
                            break;
                        case 5:
                            arrayList = Q0.a.p(readInt12, parcel);
                            break;
                        case 6:
                            z17 = Q0.a.K(readInt12, parcel);
                            break;
                        case 7:
                            i18 = Q0.a.N(readInt12, parcel);
                            break;
                        case '\b':
                            z18 = Q0.a.K(readInt12, parcel);
                            break;
                        case '\t':
                            str9 = Q0.a.n(readInt12, parcel);
                            break;
                        case '\n':
                            zzfuVar = (zzfu) Q0.a.m(parcel, readInt12, zzfu.CREATOR);
                            break;
                        case 11:
                            location = (Location) Q0.a.m(parcel, readInt12, Location.CREATOR);
                            break;
                        case '\f':
                            str10 = Q0.a.n(readInt12, parcel);
                            break;
                        case '\r':
                            bundle2 = Q0.a.j(readInt12, parcel);
                            break;
                        case 14:
                            bundle3 = Q0.a.j(readInt12, parcel);
                            break;
                        case 15:
                            arrayList2 = Q0.a.p(readInt12, parcel);
                            break;
                        case 16:
                            str11 = Q0.a.n(readInt12, parcel);
                            break;
                        case 17:
                            str12 = Q0.a.n(readInt12, parcel);
                            break;
                        case 18:
                            z19 = Q0.a.K(readInt12, parcel);
                            break;
                        case 19:
                            zzcVar = (zzc) Q0.a.m(parcel, readInt12, zzc.CREATOR);
                            break;
                        case 20:
                            i19 = Q0.a.N(readInt12, parcel);
                            break;
                        case zzbbd.zzt.zzm /* 21 */:
                            str13 = Q0.a.n(readInt12, parcel);
                            break;
                        case 22:
                            arrayList3 = Q0.a.p(readInt12, parcel);
                            break;
                        case 23:
                            i20 = Q0.a.N(readInt12, parcel);
                            break;
                        case 24:
                            str14 = Q0.a.n(readInt12, parcel);
                            break;
                        case 25:
                            i21 = Q0.a.N(readInt12, parcel);
                            break;
                        case 26:
                            j3 = Q0.a.P(readInt12, parcel);
                            break;
                        default:
                            Q0.a.X(readInt12, parcel);
                            break;
                    }
                }
                Q0.a.y(a013, parcel);
                return new zzm(i16, j, bundle, i17, arrayList, z17, i18, z18, str9, zzfuVar, location, str10, bundle2, bundle3, arrayList2, str11, str12, z19, zzcVar, i19, str13, arrayList3, i20, str14, i21, j3);
            case 13:
                int a014 = Q0.a.a0(parcel);
                int i22 = 0;
                int i23 = 0;
                boolean z20 = false;
                int i24 = 0;
                int i25 = 0;
                boolean z21 = false;
                boolean z22 = false;
                boolean z23 = false;
                boolean z24 = false;
                boolean z25 = false;
                boolean z26 = false;
                boolean z27 = false;
                boolean z28 = false;
                String str15 = null;
                zzr[] zzrVarArr = null;
                while (parcel.dataPosition() < a014) {
                    int readInt13 = parcel.readInt();
                    switch ((char) readInt13) {
                        case 2:
                            str15 = Q0.a.n(readInt13, parcel);
                            break;
                        case 3:
                            i22 = Q0.a.N(readInt13, parcel);
                            break;
                        case 4:
                            i23 = Q0.a.N(readInt13, parcel);
                            break;
                        case 5:
                            z20 = Q0.a.K(readInt13, parcel);
                            break;
                        case 6:
                            i24 = Q0.a.N(readInt13, parcel);
                            break;
                        case 7:
                            i25 = Q0.a.N(readInt13, parcel);
                            break;
                        case '\b':
                            zzrVarArr = (zzr[]) Q0.a.q(parcel, readInt13, zzr.CREATOR);
                            break;
                        case '\t':
                            z21 = Q0.a.K(readInt13, parcel);
                            break;
                        case '\n':
                            z22 = Q0.a.K(readInt13, parcel);
                            break;
                        case 11:
                            z23 = Q0.a.K(readInt13, parcel);
                            break;
                        case '\f':
                            z24 = Q0.a.K(readInt13, parcel);
                            break;
                        case '\r':
                            z25 = Q0.a.K(readInt13, parcel);
                            break;
                        case 14:
                            z26 = Q0.a.K(readInt13, parcel);
                            break;
                        case 15:
                            z27 = Q0.a.K(readInt13, parcel);
                            break;
                        case 16:
                            z28 = Q0.a.K(readInt13, parcel);
                            break;
                        default:
                            Q0.a.X(readInt13, parcel);
                            break;
                    }
                }
                Q0.a.y(a014, parcel);
                return new zzr(str15, i22, i23, z20, i24, i25, zzrVarArr, z21, z22, z23, z24, z25, z26, z27, z28);
            case 14:
                int a015 = Q0.a.a0(parcel);
                long j7 = 0;
                String str16 = null;
                int i26 = 0;
                int i27 = 0;
                while (parcel.dataPosition() < a015) {
                    int readInt14 = parcel.readInt();
                    char c12 = (char) readInt14;
                    if (c12 == 1) {
                        i26 = Q0.a.N(readInt14, parcel);
                    } else if (c12 == 2) {
                        i27 = Q0.a.N(readInt14, parcel);
                    } else if (c12 == 3) {
                        str16 = Q0.a.n(readInt14, parcel);
                    } else if (c12 != 4) {
                        Q0.a.X(readInt14, parcel);
                    } else {
                        j7 = Q0.a.P(readInt14, parcel);
                    }
                }
                Q0.a.y(a015, parcel);
                return new zzt(i26, i27, j7, str16);
            case 15:
                int a016 = Q0.a.a0(parcel);
                String str17 = null;
                zze zzeVar2 = null;
                Bundle bundle4 = null;
                String str18 = null;
                String str19 = null;
                String str20 = null;
                String str21 = null;
                long j8 = 0;
                while (parcel.dataPosition() < a016) {
                    int readInt15 = parcel.readInt();
                    switch ((char) readInt15) {
                        case 1:
                            str17 = Q0.a.n(readInt15, parcel);
                            break;
                        case 2:
                            j8 = Q0.a.P(readInt15, parcel);
                            break;
                        case 3:
                            zzeVar2 = (zze) Q0.a.m(parcel, readInt15, zze.CREATOR);
                            break;
                        case 4:
                            bundle4 = Q0.a.j(readInt15, parcel);
                            break;
                        case 5:
                            str18 = Q0.a.n(readInt15, parcel);
                            break;
                        case 6:
                            str19 = Q0.a.n(readInt15, parcel);
                            break;
                        case 7:
                            str20 = Q0.a.n(readInt15, parcel);
                            break;
                        case '\b':
                            str21 = Q0.a.n(readInt15, parcel);
                            break;
                        default:
                            Q0.a.X(readInt15, parcel);
                            break;
                    }
                }
                Q0.a.y(a016, parcel);
                return new zzv(str17, j8, zzeVar2, bundle4, str18, str19, str20, str21);
            case 16:
                int a017 = Q0.a.a0(parcel);
                int i28 = 0;
                while (parcel.dataPosition() < a017) {
                    int readInt16 = parcel.readInt();
                    if (((char) readInt16) != 2) {
                        Q0.a.X(readInt16, parcel);
                    } else {
                        i28 = Q0.a.N(readInt16, parcel);
                    }
                }
                Q0.a.y(a017, parcel);
                return new zzx(i28);
            case 17:
                int a018 = Q0.a.a0(parcel);
                String str22 = null;
                String str23 = null;
                String str24 = null;
                while (parcel.dataPosition() < a018) {
                    int readInt17 = parcel.readInt();
                    char c13 = (char) readInt17;
                    if (c13 == 1) {
                        str22 = Q0.a.n(readInt17, parcel);
                    } else if (c13 == 2) {
                        str23 = Q0.a.n(readInt17, parcel);
                    } else if (c13 != 3) {
                        Q0.a.X(readInt17, parcel);
                    } else {
                        str24 = Q0.a.n(readInt17, parcel);
                    }
                }
                Q0.a.y(a018, parcel);
                return new zza(str22, str23, str24);
            case 18:
                int a019 = Q0.a.a0(parcel);
                boolean z29 = false;
                String str25 = null;
                String str26 = null;
                String str27 = null;
                String str28 = null;
                String str29 = null;
                String str30 = null;
                String str31 = null;
                Intent intent = null;
                IBinder iBinder4 = null;
                while (parcel.dataPosition() < a019) {
                    int readInt18 = parcel.readInt();
                    switch ((char) readInt18) {
                        case 2:
                            str25 = Q0.a.n(readInt18, parcel);
                            break;
                        case 3:
                            str26 = Q0.a.n(readInt18, parcel);
                            break;
                        case 4:
                            str27 = Q0.a.n(readInt18, parcel);
                            break;
                        case 5:
                            str28 = Q0.a.n(readInt18, parcel);
                            break;
                        case 6:
                            str29 = Q0.a.n(readInt18, parcel);
                            break;
                        case 7:
                            str30 = Q0.a.n(readInt18, parcel);
                            break;
                        case '\b':
                            str31 = Q0.a.n(readInt18, parcel);
                            break;
                        case '\t':
                            intent = (Intent) Q0.a.m(parcel, readInt18, Intent.CREATOR);
                            break;
                        case '\n':
                            iBinder4 = Q0.a.M(readInt18, parcel);
                            break;
                        case 11:
                            z29 = Q0.a.K(readInt18, parcel);
                            break;
                        default:
                            Q0.a.X(readInt18, parcel);
                            break;
                    }
                }
                Q0.a.y(a019, parcel);
                return new com.google.android.gms.ads.internal.overlay.zzc(str25, str26, str27, str28, str29, str30, str31, intent, iBinder4, z29);
            case 19:
                int a020 = Q0.a.a0(parcel);
                long j9 = 0;
                boolean z30 = false;
                int i29 = 0;
                int i30 = 0;
                boolean z31 = false;
                com.google.android.gms.ads.internal.overlay.zzc zzcVar2 = null;
                IBinder iBinder5 = null;
                IBinder iBinder6 = null;
                IBinder iBinder7 = null;
                IBinder iBinder8 = null;
                String str32 = null;
                String str33 = null;
                IBinder iBinder9 = null;
                String str34 = null;
                VersionInfoParcel versionInfoParcel = null;
                String str35 = null;
                zzl zzlVar = null;
                IBinder iBinder10 = null;
                String str36 = null;
                String str37 = null;
                String str38 = null;
                IBinder iBinder11 = null;
                IBinder iBinder12 = null;
                IBinder iBinder13 = null;
                while (parcel.dataPosition() < a020) {
                    int readInt19 = parcel.readInt();
                    switch ((char) readInt19) {
                        case 2:
                            zzcVar2 = (com.google.android.gms.ads.internal.overlay.zzc) Q0.a.m(parcel, readInt19, com.google.android.gms.ads.internal.overlay.zzc.CREATOR);
                            break;
                        case 3:
                            iBinder5 = Q0.a.M(readInt19, parcel);
                            break;
                        case 4:
                            iBinder6 = Q0.a.M(readInt19, parcel);
                            break;
                        case 5:
                            iBinder7 = Q0.a.M(readInt19, parcel);
                            break;
                        case 6:
                            iBinder8 = Q0.a.M(readInt19, parcel);
                            break;
                        case 7:
                            str32 = Q0.a.n(readInt19, parcel);
                            break;
                        case '\b':
                            z30 = Q0.a.K(readInt19, parcel);
                            break;
                        case '\t':
                            str33 = Q0.a.n(readInt19, parcel);
                            break;
                        case '\n':
                            iBinder9 = Q0.a.M(readInt19, parcel);
                            break;
                        case 11:
                            i29 = Q0.a.N(readInt19, parcel);
                            break;
                        case '\f':
                            i30 = Q0.a.N(readInt19, parcel);
                            break;
                        case '\r':
                            str34 = Q0.a.n(readInt19, parcel);
                            break;
                        case 14:
                            versionInfoParcel = (VersionInfoParcel) Q0.a.m(parcel, readInt19, VersionInfoParcel.CREATOR);
                            break;
                        case 15:
                        case 20:
                        case zzbbd.zzt.zzm /* 21 */:
                        case 22:
                        case 23:
                        default:
                            Q0.a.X(readInt19, parcel);
                            break;
                        case 16:
                            str35 = Q0.a.n(readInt19, parcel);
                            break;
                        case 17:
                            zzlVar = (zzl) Q0.a.m(parcel, readInt19, zzl.CREATOR);
                            break;
                        case 18:
                            iBinder10 = Q0.a.M(readInt19, parcel);
                            break;
                        case 19:
                            str36 = Q0.a.n(readInt19, parcel);
                            break;
                        case 24:
                            str37 = Q0.a.n(readInt19, parcel);
                            break;
                        case 25:
                            str38 = Q0.a.n(readInt19, parcel);
                            break;
                        case 26:
                            iBinder11 = Q0.a.M(readInt19, parcel);
                            break;
                        case 27:
                            iBinder12 = Q0.a.M(readInt19, parcel);
                            break;
                        case 28:
                            iBinder13 = Q0.a.M(readInt19, parcel);
                            break;
                        case 29:
                            z31 = Q0.a.K(readInt19, parcel);
                            break;
                        case 30:
                            j9 = Q0.a.P(readInt19, parcel);
                            break;
                    }
                }
                Q0.a.y(a020, parcel);
                return new AdOverlayInfoParcel(zzcVar2, iBinder5, iBinder6, iBinder7, iBinder8, str32, z30, str33, iBinder9, i29, i30, str34, versionInfoParcel, str35, zzlVar, iBinder10, str36, str37, str38, iBinder11, iBinder12, iBinder13, z31, j9);
            case 20:
                int a021 = Q0.a.a0(parcel);
                int i31 = 0;
                String str39 = null;
                while (parcel.dataPosition() < a021) {
                    int readInt20 = parcel.readInt();
                    char c14 = (char) readInt20;
                    if (c14 == 1) {
                        str39 = Q0.a.n(readInt20, parcel);
                    } else if (c14 != 2) {
                        Q0.a.X(readInt20, parcel);
                    } else {
                        i31 = Q0.a.N(readInt20, parcel);
                    }
                }
                Q0.a.y(a021, parcel);
                return new zzbb(str39, i31);
            case zzbbd.zzt.zzm /* 21 */:
                int a022 = Q0.a.a0(parcel);
                int i32 = 0;
                int i33 = 0;
                boolean z32 = false;
                boolean z33 = false;
                String str40 = null;
                while (parcel.dataPosition() < a022) {
                    int readInt21 = parcel.readInt();
                    char c15 = (char) readInt21;
                    if (c15 == 2) {
                        str40 = Q0.a.n(readInt21, parcel);
                    } else if (c15 == 3) {
                        i32 = Q0.a.N(readInt21, parcel);
                    } else if (c15 == 4) {
                        i33 = Q0.a.N(readInt21, parcel);
                    } else if (c15 == 5) {
                        z32 = Q0.a.K(readInt21, parcel);
                    } else if (c15 != 6) {
                        Q0.a.X(readInt21, parcel);
                    } else {
                        z33 = Q0.a.K(readInt21, parcel);
                    }
                }
                Q0.a.y(a022, parcel);
                return new VersionInfoParcel(str40, i32, i33, z32, z33);
            case 22:
                return new ParcelImpl(parcel);
            case 23:
                String readString = parcel.readString();
                readString.getClass();
                return new AppInfoTable(parcel.readInt(), readString);
            case 24:
                return new EventMessage(parcel);
            case 25:
                int a023 = Q0.a.a0(parcel);
                String str41 = null;
                String str42 = null;
                while (parcel.dataPosition() < a023) {
                    int readInt22 = parcel.readInt();
                    char c16 = (char) readInt22;
                    if (c16 == 1) {
                        str41 = Q0.a.n(readInt22, parcel);
                    } else if (c16 != 2) {
                        Q0.a.X(readInt22, parcel);
                    } else {
                        str42 = Q0.a.n(readInt22, parcel);
                    }
                }
                Q0.a.y(a023, parcel);
                return new com.google.android.gms.appset.zza(str41, str42);
            case 26:
                int a024 = Q0.a.a0(parcel);
                String str43 = null;
                int i34 = 0;
                while (parcel.dataPosition() < a024) {
                    int readInt23 = parcel.readInt();
                    char c17 = (char) readInt23;
                    if (c17 == 1) {
                        str43 = Q0.a.n(readInt23, parcel);
                    } else if (c17 != 2) {
                        Q0.a.X(readInt23, parcel);
                    } else {
                        i34 = Q0.a.N(readInt23, parcel);
                    }
                }
                Q0.a.y(a024, parcel);
                return new com.google.android.gms.appset.zzc(str43, i34);
            case 27:
                return new PictureFrame(parcel);
            case 28:
                return new VorbisComment(parcel);
            default:
                int a025 = Q0.a.a0(parcel);
                int i35 = 0;
                int i36 = 0;
                int i37 = 0;
                long j10 = 0;
                String str44 = null;
                String str45 = null;
                while (parcel.dataPosition() < a025) {
                    int readInt24 = parcel.readInt();
                    switch ((char) readInt24) {
                        case 1:
                            i35 = Q0.a.N(readInt24, parcel);
                            break;
                        case 2:
                            j10 = Q0.a.P(readInt24, parcel);
                            break;
                        case 3:
                            str44 = Q0.a.n(readInt24, parcel);
                            break;
                        case 4:
                            i36 = Q0.a.N(readInt24, parcel);
                            break;
                        case 5:
                            i37 = Q0.a.N(readInt24, parcel);
                            break;
                        case 6:
                            str45 = Q0.a.n(readInt24, parcel);
                            break;
                        default:
                            Q0.a.X(readInt24, parcel);
                            break;
                    }
                }
                Q0.a.y(a025, parcel);
                return new AccountChangeEvent(i35, j10, str44, i36, i37, str45);
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
