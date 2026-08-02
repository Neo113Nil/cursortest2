package com.google.android.gms.wallet.button;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.a;
import com.google.android.gms.common.internal.safeparcel.c;

/* loaded from: classes4.dex */
public final class zzc extends a {
    public static final Parcelable.Creator<zzc> CREATOR = new zzd();
    String zza;
    int zzb;
    boolean zzc;
    String zzd;
    String zze;
    String zzf;
    String zzg;
    String zzh;
    String zzi;

    private zzc() {
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int q = c.q(parcel, 20293);
        c.l(parcel, 1, this.zza, false);
        int i2 = this.zzb;
        c.s(parcel, 2, 4);
        parcel.writeInt(i2);
        boolean z = this.zzc;
        c.s(parcel, 3, 4);
        parcel.writeInt(z ? 1 : 0);
        c.l(parcel, 4, this.zzd, false);
        c.l(parcel, 5, this.zze, false);
        c.l(parcel, 6, this.zzf, false);
        c.l(parcel, 7, this.zzg, false);
        c.l(parcel, 8, this.zzh, false);
        c.l(parcel, 9, this.zzi, false);
        c.r(parcel, q);
    }

    public zzc(String str, int i, boolean z, String str2, String str3, String str4, String str5, String str6, String str7) {
        this.zza = str;
        this.zzb = i;
        this.zzc = z;
        this.zzd = str2;
        this.zze = str3;
        this.zzf = str4;
        this.zzg = str5;
        this.zzh = str6;
        this.zzi = str7;
    }
}
