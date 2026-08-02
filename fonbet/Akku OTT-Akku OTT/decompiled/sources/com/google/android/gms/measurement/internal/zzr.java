package com.google.android.gms.measurement.internal;

import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import androidx.annotation.Nullable;
import com.google.android.gms.common.internal.C0875q;
import com.google.android.gms.common.internal.safeparcel.c;
import java.util.List;

/* loaded from: classes4.dex */
public final class zzr extends com.google.android.gms.common.internal.safeparcel.a {
    public static final Parcelable.Creator<zzr> CREATOR = new zzs();
    public final long zzA;

    @Nullable
    public final String zzB;
    public final String zzC;
    public final long zzD;
    public final int zzE;

    @Nullable
    public final String zza;

    @Nullable
    public final String zzb;

    @Nullable
    public final String zzc;

    @Nullable
    public final String zzd;
    public final long zze;
    public final long zzf;

    @Nullable
    public final String zzg;
    public final boolean zzh;
    public final boolean zzi;
    public final long zzj;

    @Nullable
    public final String zzk;
    public final long zzl;
    public final int zzm;
    public final boolean zzn;
    public final boolean zzo;

    @Nullable
    public final Boolean zzp;
    public final long zzq;

    @Nullable
    public final List zzr;
    public final String zzs;
    public final String zzt;

    @Nullable
    public final String zzu;
    public final boolean zzv;
    public final long zzw;
    public final int zzx;
    public final String zzy;
    public final int zzz;

    public zzr(@Nullable String str, @Nullable String str2, @Nullable String str3, long j, @Nullable String str4, long j2, long j3, @Nullable String str5, boolean z, boolean z2, @Nullable String str6, long j4, int i, boolean z3, boolean z4, @Nullable Boolean bool, long j5, @Nullable List list, String str7, String str8, @Nullable String str9, boolean z5, long j6, int i2, String str10, int i3, long j7, @Nullable String str11, String str12, long j8, int i4) {
        C0875q.d(str);
        this.zza = str;
        this.zzb = true == TextUtils.isEmpty(str2) ? null : str2;
        this.zzc = str3;
        this.zzj = j;
        this.zzd = str4;
        this.zze = j2;
        this.zzf = j3;
        this.zzg = str5;
        this.zzh = z;
        this.zzi = z2;
        this.zzk = str6;
        this.zzl = j4;
        this.zzm = i;
        this.zzn = z3;
        this.zzo = z4;
        this.zzp = bool;
        this.zzq = j5;
        this.zzr = list;
        this.zzs = str7;
        this.zzt = str8;
        this.zzu = str9;
        this.zzv = z5;
        this.zzw = j6;
        this.zzx = i2;
        this.zzy = str10;
        this.zzz = i3;
        this.zzA = j7;
        this.zzB = str11;
        this.zzC = str12;
        this.zzD = j8;
        this.zzE = i4;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        String str = this.zza;
        int q = c.q(parcel, 20293);
        c.l(parcel, 2, str, false);
        c.l(parcel, 3, this.zzb, false);
        c.l(parcel, 4, this.zzc, false);
        c.l(parcel, 5, this.zzd, false);
        long j = this.zze;
        c.s(parcel, 6, 8);
        parcel.writeLong(j);
        long j2 = this.zzf;
        c.s(parcel, 7, 8);
        parcel.writeLong(j2);
        c.l(parcel, 8, this.zzg, false);
        boolean z = this.zzh;
        c.s(parcel, 9, 4);
        parcel.writeInt(z ? 1 : 0);
        boolean z2 = this.zzi;
        c.s(parcel, 10, 4);
        parcel.writeInt(z2 ? 1 : 0);
        long j3 = this.zzj;
        c.s(parcel, 11, 8);
        parcel.writeLong(j3);
        c.l(parcel, 12, this.zzk, false);
        long j4 = this.zzl;
        c.s(parcel, 14, 8);
        parcel.writeLong(j4);
        int i2 = this.zzm;
        c.s(parcel, 15, 4);
        parcel.writeInt(i2);
        boolean z3 = this.zzn;
        c.s(parcel, 16, 4);
        parcel.writeInt(z3 ? 1 : 0);
        boolean z4 = this.zzo;
        c.s(parcel, 18, 4);
        parcel.writeInt(z4 ? 1 : 0);
        c.a(parcel, 21, this.zzp);
        long j5 = this.zzq;
        c.s(parcel, 22, 8);
        parcel.writeLong(j5);
        c.n(parcel, 23, this.zzr);
        c.l(parcel, 25, this.zzs, false);
        c.l(parcel, 26, this.zzt, false);
        c.l(parcel, 27, this.zzu, false);
        boolean z5 = this.zzv;
        c.s(parcel, 28, 4);
        parcel.writeInt(z5 ? 1 : 0);
        long j6 = this.zzw;
        c.s(parcel, 29, 8);
        parcel.writeLong(j6);
        int i3 = this.zzx;
        c.s(parcel, 30, 4);
        parcel.writeInt(i3);
        c.l(parcel, 31, this.zzy, false);
        int i4 = this.zzz;
        c.s(parcel, 32, 4);
        parcel.writeInt(i4);
        long j7 = this.zzA;
        c.s(parcel, 34, 8);
        parcel.writeLong(j7);
        c.l(parcel, 35, this.zzB, false);
        c.l(parcel, 36, this.zzC, false);
        long j8 = this.zzD;
        c.s(parcel, 37, 8);
        parcel.writeLong(j8);
        int i5 = this.zzE;
        c.s(parcel, 38, 4);
        parcel.writeInt(i5);
        c.r(parcel, q);
    }

    public zzr(@Nullable String str, @Nullable String str2, @Nullable String str3, @Nullable String str4, long j, long j2, @Nullable String str5, boolean z, boolean z2, long j3, @Nullable String str6, long j4, int i, boolean z3, boolean z4, @Nullable Boolean bool, long j5, @Nullable List list, String str7, String str8, String str9, boolean z5, long j6, int i2, String str10, int i3, long j7, @Nullable String str11, String str12, long j8, int i4) {
        this.zza = str;
        this.zzb = str2;
        this.zzc = str3;
        this.zzj = j3;
        this.zzd = str4;
        this.zze = j;
        this.zzf = j2;
        this.zzg = str5;
        this.zzh = z;
        this.zzi = z2;
        this.zzk = str6;
        this.zzl = j4;
        this.zzm = i;
        this.zzn = z3;
        this.zzo = z4;
        this.zzp = bool;
        this.zzq = j5;
        this.zzr = list;
        this.zzs = str7;
        this.zzt = str8;
        this.zzu = str9;
        this.zzv = z5;
        this.zzw = j6;
        this.zzx = i2;
        this.zzy = str10;
        this.zzz = i3;
        this.zzA = j7;
        this.zzB = str11;
        this.zzC = str12;
        this.zzD = j8;
        this.zzE = i4;
    }
}
