package com.google.android.gms.internal.ads;

import Y4.D;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;

/* loaded from: classes.dex */
public final class zzbkm extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzbkm> CREATOR = new zzbkn();
    public final boolean zza;
    public final String zzb;
    public final int zzc;
    public final byte[] zzd;
    public final String[] zze;
    public final String[] zzf;
    public final boolean zzg;
    public final long zzh;

    public zzbkm(boolean z4, String str, int i7, byte[] bArr, String[] strArr, String[] strArr2, boolean z7, long j) {
        this.zza = z4;
        this.zzb = str;
        this.zzc = i7;
        this.zzd = bArr;
        this.zze = strArr;
        this.zzf = strArr2;
        this.zzg = z7;
        this.zzh = j;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i7) {
        boolean z4 = this.zza;
        int x02 = D.x0(20293, parcel);
        D.B0(parcel, 1, 4);
        parcel.writeInt(z4 ? 1 : 0);
        D.s0(parcel, 2, this.zzb, false);
        int i8 = this.zzc;
        D.B0(parcel, 3, 4);
        parcel.writeInt(i8);
        D.l0(parcel, 4, this.zzd, false);
        D.t0(parcel, 5, this.zze, false);
        D.t0(parcel, 6, this.zzf, false);
        boolean z7 = this.zzg;
        D.B0(parcel, 7, 4);
        parcel.writeInt(z7 ? 1 : 0);
        long j = this.zzh;
        D.B0(parcel, 8, 8);
        parcel.writeLong(j);
        D.z0(x02, parcel);
    }
}
