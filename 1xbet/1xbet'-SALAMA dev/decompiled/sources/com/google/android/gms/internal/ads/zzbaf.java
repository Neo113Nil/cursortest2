package com.google.android.gms.internal.ads;

import Y4.D;
import android.os.Parcel;
import android.os.ParcelFileDescriptor;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import java.io.InputStream;

/* JADX INFO: loaded from: classes.dex */
public final class zzbaf extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzbaf> CREATOR = new zzbag();
    private ParcelFileDescriptor zza;
    private final boolean zzb;
    private final boolean zzc;
    private final long zzd;
    private final boolean zze;

    public zzbaf(ParcelFileDescriptor parcelFileDescriptor, boolean z4, boolean z7, long j, boolean z8) {
        this.zza = parcelFileDescriptor;
        this.zzb = z4;
        this.zzc = z7;
        this.zzd = j;
        this.zze = z8;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i7) {
        int iX0 = D.x0(20293, parcel);
        D.r0(parcel, 2, zzb(), i7, false);
        boolean zZzd = zzd();
        D.B0(parcel, 3, 4);
        parcel.writeInt(zZzd ? 1 : 0);
        boolean zZzf = zzf();
        D.B0(parcel, 4, 4);
        parcel.writeInt(zZzf ? 1 : 0);
        long jZza = zza();
        D.B0(parcel, 5, 8);
        parcel.writeLong(jZza);
        boolean zZzg = zzg();
        D.B0(parcel, 6, 4);
        parcel.writeInt(zZzg ? 1 : 0);
        D.z0(iX0, parcel);
    }

    public final synchronized long zza() {
        return this.zzd;
    }

    public final synchronized ParcelFileDescriptor zzb() {
        return this.zza;
    }

    public final synchronized InputStream zzc() {
        if (this.zza == null) {
            return null;
        }
        ParcelFileDescriptor.AutoCloseInputStream autoCloseInputStream = new ParcelFileDescriptor.AutoCloseInputStream(this.zza);
        this.zza = null;
        return autoCloseInputStream;
    }

    public final synchronized boolean zzd() {
        return this.zzb;
    }

    public final synchronized boolean zze() {
        return this.zza != null;
    }

    public final synchronized boolean zzf() {
        return this.zzc;
    }

    public final synchronized boolean zzg() {
        return this.zze;
    }

    public zzbaf() {
        this(null, false, false, 0L, false);
    }
}
