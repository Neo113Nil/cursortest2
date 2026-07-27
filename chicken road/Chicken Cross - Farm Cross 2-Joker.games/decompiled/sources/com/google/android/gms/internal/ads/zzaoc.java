package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.media3.common.MimeTypes;
import java.io.EOFException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;

/* compiled from: com.google.android.gms:play-services-ads@@25.4.0 */
/* loaded from: classes9.dex */
final class zzaoc implements zzaht {
    private final zzaht zza;
    private final zzanx zzb;
    private zzanz zzg;
    private zzv zzh;
    private boolean zzi;
    private int zzd = 0;
    private int zze = 0;
    private byte[] zzf = zzfm.zzb;
    private final zzeu zzc = new zzeu();

    public zzaoc(zzaht zzahtVar, zzanx zzanxVar) {
        this.zza = zzahtVar;
        this.zzb = zzanxVar;
    }

    private final void zzi(int i) {
        int length = this.zzf.length;
        int i2 = this.zze;
        if (length - i2 >= i) {
            return;
        }
        int i3 = i2 - this.zzd;
        int max = Math.max(i3 + i3, i + i3);
        byte[] bArr = this.zzf;
        byte[] bArr2 = max <= bArr.length ? bArr : new byte[max];
        System.arraycopy(bArr, this.zzd, bArr2, 0, i3);
        this.zzd = 0;
        this.zze = i3;
        this.zzf = bArr2;
    }

    @Override // com.google.android.gms.internal.ads.zzaht
    public final void zzA(zzv zzvVar) {
        String str = zzvVar.zzp;
        str.getClass();
        zzguk.zza(zzas.zzf(str) == 3);
        if (!zzvVar.equals(this.zzh)) {
            this.zzh = zzvVar;
            zzanx zzanxVar = this.zzb;
            this.zzg = zzanxVar.zza(zzvVar) ? zzanxVar.zzc(zzvVar) : null;
        }
        if (this.zzg == null) {
            this.zza.zzA(zzvVar);
            return;
        }
        zzaht zzahtVar = this.zza;
        zzt zza = zzvVar.zza();
        zza.zzo(MimeTypes.APPLICATION_MEDIA3_CUES);
        zza.zzk(str);
        zza.zzt(Long.MAX_VALUE);
        zza.zzO(this.zzb.zzb(zzvVar));
        zzahtVar.zzA(zza.zzQ());
    }

    @Override // com.google.android.gms.internal.ads.zzaht
    public final int zzb(zzj zzjVar, int i, boolean z, int i2) throws IOException {
        if (this.zzg == null) {
            return this.zza.zzb(zzjVar, i, z, 0);
        }
        zzi(i);
        int zza = zzjVar.zza(this.zzf, this.zze, i);
        if (zza != -1) {
            this.zze += zza;
            return zza;
        }
        if (z) {
            return -1;
        }
        throw new EOFException();
    }

    @Override // com.google.android.gms.internal.ads.zzaht
    public final void zzd(zzeu zzeuVar, int i, int i2) {
        if (this.zzg == null) {
            this.zza.zzd(zzeuVar, i, i2);
            return;
        }
        zzi(i);
        zzeuVar.zzm(this.zzf, this.zze, i);
        this.zze += i;
    }

    @Override // com.google.android.gms.internal.ads.zzaht
    public final void zze(final long j, final int i, int i2, int i3, zzahs zzahsVar) {
        if (this.zzg == null) {
            this.zza.zze(j, i, i2, i3, zzahsVar);
            return;
        }
        zzguk.zzb(zzahsVar == null, "DRM on subtitles is not supported");
        int i4 = (this.zze - i3) - i2;
        try {
            this.zzg.zza(this.zzf, i4, i2, zzany.zza(), new zzdu() { // from class: com.google.android.gms.internal.ads.zzaob
                @Override // com.google.android.gms.internal.ads.zzdu
                public final /* synthetic */ void zza(Object obj) {
                    zzaoc.this.zzh(j, i, (zzanr) obj);
                }
            });
        } catch (RuntimeException e) {
            if (!this.zzi) {
                throw e;
            }
            zzeh.zzd("SubtitleTranscodingTO", "Parsing subtitles failed, ignoring sample.", e);
        }
        int i5 = i4 + i2;
        this.zzd = i5;
        if (i5 == this.zze) {
            this.zzd = 0;
            this.zze = 0;
        }
    }

    public final void zzf(boolean z) {
        this.zzi = true;
    }

    final /* synthetic */ void zzh(long j, int i, zzanr zzanrVar) {
        this.zzh.getClass();
        zzgxm zzgxmVar = zzanrVar.zza;
        long j2 = zzanrVar.zzc;
        ArrayList<? extends Parcelable> arrayList = new ArrayList<>(zzgxmVar.size());
        Iterator<E> it = zzgxmVar.iterator();
        while (it.hasNext()) {
            arrayList.add(((zzcy) it.next()).zzb());
        }
        Bundle bundle = new Bundle();
        bundle.putParcelableArrayList("c", arrayList);
        bundle.putLong("d", j2);
        Parcel obtain = Parcel.obtain();
        obtain.writeBundle(bundle);
        byte[] marshall = obtain.marshall();
        obtain.recycle();
        zzeu zzeuVar = this.zzc;
        int length = marshall.length;
        zzeuVar.zzb(marshall, length);
        zzaht zzahtVar = this.zza;
        zzahtVar.zzc(zzeuVar, length);
        long j3 = zzanrVar.zzb;
        if (j3 == -9223372036854775807L) {
            zzguk.zzi(this.zzh.zzu == Long.MAX_VALUE);
        } else {
            long j4 = this.zzh.zzu;
            j = j4 == Long.MAX_VALUE ? j + j3 : j3 + j4;
        }
        zzahtVar.zze(j, i | 1, length, 0, null);
    }
}
