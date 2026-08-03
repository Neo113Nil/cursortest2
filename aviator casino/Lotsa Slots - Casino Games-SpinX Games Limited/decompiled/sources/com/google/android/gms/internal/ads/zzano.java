package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@25.2.0 */
/* loaded from: classes4.dex */
final class zzano implements com.google.android.gms.internal.ads.zzahk {
    private final com.google.android.gms.internal.ads.zzahk zza;
    private final com.google.android.gms.internal.ads.zzanj zzb;
    private com.google.android.gms.internal.ads.zzanl zzg;
    private com.google.android.gms.internal.ads.zzv zzh;
    private boolean zzi;
    private int zzd = 0;
    private int zze = 0;
    private byte[] zzf = com.google.android.gms.internal.ads.zzfl.zzb;
    private final com.google.android.gms.internal.ads.zzet zzc = new com.google.android.gms.internal.ads.zzet();

    public zzano(com.google.android.gms.internal.ads.zzahk zzahkVar, com.google.android.gms.internal.ads.zzanj zzanjVar) {
        this.zza = zzahkVar;
        this.zzb = zzanjVar;
    }

    private final void zzi(int i) {
        int length = this.zzf.length;
        int i2 = this.zze;
        if (length - i2 >= i) {
            return;
        }
        int i3 = i2 - this.zzd;
        int max = java.lang.Math.max(i3 + i3, i + i3);
        byte[] bArr = this.zzf;
        byte[] bArr2 = max <= bArr.length ? bArr : new byte[max];
        java.lang.System.arraycopy(bArr, this.zzd, bArr2, 0, i3);
        this.zzd = 0;
        this.zze = i3;
        this.zzf = bArr2;
    }

    @Override // com.google.android.gms.internal.ads.zzahk
    public final void zzA(com.google.android.gms.internal.ads.zzv zzvVar) {
        java.lang.String str = zzvVar.zzp;
        str.getClass();
        com.google.android.gms.internal.ads.zzgtj.zza(com.google.android.gms.internal.ads.zzas.zzf(str) == 3);
        if (!zzvVar.equals(this.zzh)) {
            this.zzh = zzvVar;
            com.google.android.gms.internal.ads.zzanj zzanjVar = this.zzb;
            this.zzg = zzanjVar.zza(zzvVar) ? zzanjVar.zzc(zzvVar) : null;
        }
        if (this.zzg == null) {
            this.zza.zzA(zzvVar);
            return;
        }
        com.google.android.gms.internal.ads.zzahk zzahkVar = this.zza;
        com.google.android.gms.internal.ads.zzt zza = zzvVar.zza();
        zza.zzo(androidx.media3.common.MimeTypes.APPLICATION_MEDIA3_CUES);
        zza.zzk(str);
        zza.zzt(Long.MAX_VALUE);
        zza.zzM(this.zzb.zzb(zzvVar));
        zzahkVar.zzA(zza.zzO());
    }

    @Override // com.google.android.gms.internal.ads.zzahk
    public /* synthetic */ void zzO(long j) {
        com.google.android.gms.internal.ads.zzahk.CC.$default$zzO(this, j);
    }

    @Override // com.google.android.gms.internal.ads.zzahk
    public /* synthetic */ int zza(com.google.android.gms.internal.ads.zzj zzjVar, int i, boolean z) {
        int zzb;
        zzb = zzb(zzjVar, i, z, 0);
        return zzb;
    }

    @Override // com.google.android.gms.internal.ads.zzahk
    public final int zzb(com.google.android.gms.internal.ads.zzj zzjVar, int i, boolean z, int i2) throws java.io.IOException {
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
        throw new java.io.EOFException();
    }

    @Override // com.google.android.gms.internal.ads.zzahk
    public /* synthetic */ void zzc(com.google.android.gms.internal.ads.zzet zzetVar, int i) {
        zzd(zzetVar, i, 0);
    }

    @Override // com.google.android.gms.internal.ads.zzahk
    public final void zzd(com.google.android.gms.internal.ads.zzet zzetVar, int i, int i2) {
        if (this.zzg == null) {
            this.zza.zzd(zzetVar, i, i2);
            return;
        }
        zzi(i);
        zzetVar.zzm(this.zzf, this.zze, i);
        this.zze += i;
    }

    @Override // com.google.android.gms.internal.ads.zzahk
    public final void zze(final long j, final int i, int i2, int i3, com.google.android.gms.internal.ads.zzahj zzahjVar) {
        if (this.zzg == null) {
            this.zza.zze(j, i, i2, i3, zzahjVar);
            return;
        }
        com.google.android.gms.internal.ads.zzgtj.zzb(zzahjVar == null, "DRM on subtitles is not supported");
        int i4 = (this.zze - i3) - i2;
        try {
            this.zzg.zza(this.zzf, i4, i2, com.google.android.gms.internal.ads.zzank.zza(), new com.google.android.gms.internal.ads.zzdt() { // from class: com.google.android.gms.internal.ads.zzann
                @Override // com.google.android.gms.internal.ads.zzdt
                public final /* synthetic */ void zza(java.lang.Object obj) {
                    com.google.android.gms.internal.ads.zzano.this.zzh(j, i, (com.google.android.gms.internal.ads.zzand) obj);
                }
            });
        } catch (java.lang.RuntimeException e) {
            if (!this.zzi) {
                throw e;
            }
            com.google.android.gms.internal.ads.zzeg.zzd("SubtitleTranscodingTO", "Parsing subtitles failed, ignoring sample.", e);
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

    final /* synthetic */ void zzh(long j, int i, com.google.android.gms.internal.ads.zzand zzandVar) {
        this.zzh.getClass();
        com.google.android.gms.internal.ads.zzgwm zzgwmVar = zzandVar.zza;
        long j2 = zzandVar.zzc;
        java.util.ArrayList<? extends android.os.Parcelable> arrayList = new java.util.ArrayList<>(zzgwmVar.size());
        java.util.Iterator<E> it = zzgwmVar.iterator();
        while (it.hasNext()) {
            arrayList.add(((com.google.android.gms.internal.ads.zzcx) it.next()).zzb());
        }
        android.os.Bundle bundle = new android.os.Bundle();
        bundle.putParcelableArrayList("c", arrayList);
        bundle.putLong("d", j2);
        android.os.Parcel obtain = android.os.Parcel.obtain();
        obtain.writeBundle(bundle);
        byte[] marshall = obtain.marshall();
        obtain.recycle();
        com.google.android.gms.internal.ads.zzet zzetVar = this.zzc;
        int length = marshall.length;
        zzetVar.zzb(marshall, length);
        com.google.android.gms.internal.ads.zzahk zzahkVar = this.zza;
        zzahkVar.zzc(zzetVar, length);
        long j3 = zzandVar.zzb;
        if (j3 == -9223372036854775807L) {
            com.google.android.gms.internal.ads.zzgtj.zzi(this.zzh.zzu == Long.MAX_VALUE);
        } else {
            long j4 = this.zzh.zzu;
            j = j4 == Long.MAX_VALUE ? j + j3 : j3 + j4;
        }
        zzahkVar.zze(j, i | 1, length, 0, null);
    }
}
