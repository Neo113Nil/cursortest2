package com.google.android.gms.wallet.wobs;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.NonNull;
import com.google.android.gms.common.annotation.KeepName;
import com.google.android.gms.common.internal.safeparcel.a;
import com.google.android.gms.common.internal.safeparcel.c;
import com.google.android.gms.common.util.ArrayUtils;
import java.util.ArrayList;

@KeepName
/* loaded from: classes4.dex */
public class CommonWalletObject extends a {

    @NonNull
    public static final Parcelable.Creator<CommonWalletObject> CREATOR = new zzc();
    String zza;
    String zzb;
    String zzc;
    String zzd;
    String zze;
    String zzf;
    String zzg;

    @Deprecated
    String zzh;
    int zzi;
    final ArrayList zzj;
    TimeInterval zzk;
    final ArrayList zzl;

    @Deprecated
    String zzm;

    @Deprecated
    String zzn;
    final ArrayList zzo;
    boolean zzp;
    final ArrayList zzq;
    final ArrayList zzr;
    final ArrayList zzs;

    public CommonWalletObject() {
        this.zzj = ArrayUtils.newArrayList();
        this.zzl = ArrayUtils.newArrayList();
        this.zzo = ArrayUtils.newArrayList();
        this.zzq = ArrayUtils.newArrayList();
        this.zzr = ArrayUtils.newArrayList();
        this.zzs = ArrayUtils.newArrayList();
    }

    public static zzb zzb() {
        return new zzb(new CommonWalletObject(), null);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@NonNull Parcel parcel, int i) {
        int q = c.q(parcel, 20293);
        c.l(parcel, 2, this.zza, false);
        c.l(parcel, 3, this.zzb, false);
        c.l(parcel, 4, this.zzc, false);
        c.l(parcel, 5, this.zzd, false);
        c.l(parcel, 6, this.zze, false);
        c.l(parcel, 7, this.zzf, false);
        c.l(parcel, 8, this.zzg, false);
        c.l(parcel, 9, this.zzh, false);
        int i2 = this.zzi;
        c.s(parcel, 10, 4);
        parcel.writeInt(i2);
        c.p(parcel, 11, this.zzj, false);
        c.k(parcel, 12, this.zzk, i, false);
        c.p(parcel, 13, this.zzl, false);
        c.l(parcel, 14, this.zzm, false);
        c.l(parcel, 15, this.zzn, false);
        c.p(parcel, 16, this.zzo, false);
        boolean z = this.zzp;
        c.s(parcel, 17, 4);
        parcel.writeInt(z ? 1 : 0);
        c.p(parcel, 18, this.zzq, false);
        c.p(parcel, 19, this.zzr, false);
        c.p(parcel, 20, this.zzs, false);
        c.r(parcel, q);
    }

    public final int zza() {
        return this.zzi;
    }

    @NonNull
    public final TimeInterval zzc() {
        return this.zzk;
    }

    @NonNull
    public final String zzd() {
        return this.zze;
    }

    @NonNull
    @Deprecated
    public final String zze() {
        return this.zzh;
    }

    @NonNull
    public final String zzf() {
        return this.zzf;
    }

    @NonNull
    public final String zzg() {
        return this.zzg;
    }

    @NonNull
    public final String zzh() {
        return this.zzb;
    }

    @NonNull
    public final String zzi() {
        return this.zza;
    }

    @NonNull
    @Deprecated
    public final String zzj() {
        return this.zzn;
    }

    @NonNull
    @Deprecated
    public final String zzk() {
        return this.zzm;
    }

    @NonNull
    public final String zzl() {
        return this.zzd;
    }

    @NonNull
    public final String zzm() {
        return this.zzc;
    }

    @NonNull
    public final ArrayList zzn() {
        return this.zzq;
    }

    @NonNull
    public final ArrayList zzo() {
        return this.zzo;
    }

    @NonNull
    public final ArrayList zzp() {
        return this.zzs;
    }

    @NonNull
    public final ArrayList zzq() {
        return this.zzl;
    }

    @NonNull
    public final ArrayList zzr() {
        return this.zzj;
    }

    @NonNull
    public final ArrayList zzs() {
        return this.zzr;
    }

    public final boolean zzt() {
        return this.zzp;
    }

    public CommonWalletObject(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, int i, ArrayList arrayList, TimeInterval timeInterval, ArrayList arrayList2, String str9, String str10, ArrayList arrayList3, boolean z, ArrayList arrayList4, ArrayList arrayList5, ArrayList arrayList6) {
        this.zza = str;
        this.zzb = str2;
        this.zzc = str3;
        this.zzd = str4;
        this.zze = str5;
        this.zzf = str6;
        this.zzg = str7;
        this.zzh = str8;
        this.zzi = i;
        this.zzj = arrayList;
        this.zzk = timeInterval;
        this.zzl = arrayList2;
        this.zzm = str9;
        this.zzn = str10;
        this.zzo = arrayList3;
        this.zzp = z;
        this.zzq = arrayList4;
        this.zzr = arrayList5;
        this.zzs = arrayList6;
    }
}
