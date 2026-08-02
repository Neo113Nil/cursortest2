package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import java.io.EOFException;
import java.util.ArrayList;
import java.util.Iterator;

/* loaded from: classes.dex */
final class zzajv implements zzaeb {
    private final zzaeb zza;
    private final zzajq zzb;
    private zzajs zzg;
    private zzz zzh;
    private boolean zzi;
    private int zzd = 0;
    private int zze = 0;
    private byte[] zzf = zzen.zzc;
    private final zzed zzc = new zzed();

    public zzajv(zzaeb zzaebVar, zzajq zzajqVar) {
        this.zza = zzaebVar;
        this.zzb = zzajqVar;
    }

    public static /* synthetic */ void zza(zzajv zzajvVar, long j, int i7, zzajk zzajkVar) {
        zzcv.zzb(zzajvVar.zzh);
        zzfwh zzfwhVar = zzajkVar.zza;
        long j3 = zzajkVar.zzc;
        ArrayList<? extends Parcelable> arrayList = new ArrayList<>(zzfwhVar.size());
        Iterator<E> it = zzfwhVar.iterator();
        while (it.hasNext()) {
            arrayList.add(((zzcn) it.next()).zza());
        }
        Bundle bundle = new Bundle();
        bundle.putParcelableArrayList("c", arrayList);
        bundle.putLong("d", j3);
        Parcel obtain = Parcel.obtain();
        obtain.writeBundle(bundle);
        byte[] marshall = obtain.marshall();
        obtain.recycle();
        zzed zzedVar = zzajvVar.zzc;
        int length = marshall.length;
        zzedVar.zzJ(marshall, length);
        zzajvVar.zza.zzr(zzajvVar.zzc, length);
        long j7 = zzajkVar.zzb;
        if (j7 == -9223372036854775807L) {
            zzcv.zzf(zzajvVar.zzh.zzt == Long.MAX_VALUE);
        } else {
            long j8 = zzajvVar.zzh.zzt;
            j = j8 == Long.MAX_VALUE ? j + j7 : j7 + j8;
        }
        zzajvVar.zza.zzt(j, i7 | 1, length, 0, null);
    }

    private final void zzc(int i7) {
        int length = this.zzf.length;
        int i8 = this.zze;
        if (length - i8 >= i7) {
            return;
        }
        int i9 = i8 - this.zzd;
        int max = Math.max(i9 + i9, i7 + i9);
        byte[] bArr = this.zzf;
        byte[] bArr2 = max <= bArr.length ? bArr : new byte[max];
        System.arraycopy(bArr, this.zzd, bArr2, 0, i9);
        this.zzd = 0;
        this.zze = i9;
        this.zzf = bArr2;
    }

    public final void zzb(boolean z4) {
        this.zzi = true;
    }

    @Override // com.google.android.gms.internal.ads.zzaeb
    public final /* synthetic */ int zzf(zzl zzlVar, int i7, boolean z4) {
        return zzadz.zza(this, zzlVar, i7, z4);
    }

    @Override // com.google.android.gms.internal.ads.zzaeb
    public final int zzg(zzl zzlVar, int i7, boolean z4, int i8) {
        if (this.zzg == null) {
            return this.zza.zzg(zzlVar, i7, z4, 0);
        }
        zzc(i7);
        int zza = zzlVar.zza(this.zzf, this.zze, i7);
        if (zza != -1) {
            this.zze += zza;
            return zza;
        }
        if (z4) {
            return -1;
        }
        throw new EOFException();
    }

    @Override // com.google.android.gms.internal.ads.zzaeb
    public final /* synthetic */ void zzl(long j) {
    }

    @Override // com.google.android.gms.internal.ads.zzaeb
    public final void zzm(zzz zzzVar) {
        String str = zzzVar.zzo;
        str.getClass();
        zzcv.zzd(zzay.zzb(str) == 3);
        if (!zzzVar.equals(this.zzh)) {
            this.zzh = zzzVar;
            this.zzg = this.zzb.zzc(zzzVar) ? this.zzb.zzb(zzzVar) : null;
        }
        if (this.zzg == null) {
            this.zza.zzm(zzzVar);
            return;
        }
        zzaeb zzaebVar = this.zza;
        zzx zzb = zzzVar.zzb();
        zzb.zzad("application/x-media3-cues");
        zzb.zzC(zzzVar.zzo);
        zzb.zzah(Long.MAX_VALUE);
        zzb.zzG(this.zzb.zza(zzzVar));
        zzaebVar.zzm(zzb.zzaj());
    }

    @Override // com.google.android.gms.internal.ads.zzaeb
    public final /* synthetic */ void zzr(zzed zzedVar, int i7) {
        zzadz.zzb(this, zzedVar, i7);
    }

    @Override // com.google.android.gms.internal.ads.zzaeb
    public final void zzs(zzed zzedVar, int i7, int i8) {
        if (this.zzg == null) {
            this.zza.zzs(zzedVar, i7, i8);
            return;
        }
        zzc(i7);
        zzedVar.zzH(this.zzf, this.zze, i7);
        this.zze += i7;
    }

    @Override // com.google.android.gms.internal.ads.zzaeb
    public final void zzt(final long j, final int i7, int i8, int i9, zzaea zzaeaVar) {
        if (this.zzg == null) {
            this.zza.zzt(j, i7, i8, i9, zzaeaVar);
            return;
        }
        zzcv.zze(zzaeaVar == null, "DRM on subtitles is not supported");
        int i10 = (this.zze - i9) - i8;
        try {
            this.zzg.zza(this.zzf, i10, i8, zzajr.zza(), new zzdd() { // from class: com.google.android.gms.internal.ads.zzaju
                @Override // com.google.android.gms.internal.ads.zzdd
                public final void zza(Object obj) {
                    zzajv.zza(zzajv.this, j, i7, (zzajk) obj);
                }
            });
        } catch (RuntimeException e7) {
            if (!this.zzi) {
                throw e7;
            }
            zzdq.zzg("SubtitleTranscodingTO", "Parsing subtitles failed, ignoring sample.", e7);
        }
        int i11 = i10 + i8;
        this.zzd = i11;
        if (i11 == this.zze) {
            this.zzd = 0;
            this.zze = 0;
        }
    }
}
