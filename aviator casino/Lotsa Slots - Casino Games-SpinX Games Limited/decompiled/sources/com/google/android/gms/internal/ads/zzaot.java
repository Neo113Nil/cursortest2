package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@25.2.0 */
/* loaded from: classes4.dex */
public final class zzaot implements com.google.android.gms.internal.ads.zzanl {
    private final com.google.android.gms.internal.ads.zzet zza = new com.google.android.gms.internal.ads.zzet();

    @Override // com.google.android.gms.internal.ads.zzanl
    public final void zza(byte[] bArr, int i, int i2, com.google.android.gms.internal.ads.zzank zzankVar, com.google.android.gms.internal.ads.zzdt zzdtVar) {
        com.google.android.gms.internal.ads.zzcx zzr;
        com.google.android.gms.internal.ads.zzet zzetVar = this.zza;
        zzetVar.zzb(bArr, i2 + i);
        zzetVar.zzh(i);
        java.util.ArrayList arrayList = new java.util.ArrayList();
        while (zzetVar.zzd() > 0) {
            com.google.android.gms.internal.ads.zzgtj.zzb(zzetVar.zzd() >= 8, "Incomplete Mp4Webvtt Top Level box header found.");
            int zzB = zzetVar.zzB() - 8;
            if (zzetVar.zzB() == 1987343459) {
                java.lang.CharSequence charSequence = null;
                com.google.android.gms.internal.ads.zzcw zzcwVar = null;
                while (zzB > 0) {
                    com.google.android.gms.internal.ads.zzgtj.zzb(zzB >= 8, "Incomplete vtt cue box header found.");
                    int zzB2 = zzetVar.zzB();
                    int zzB3 = zzetVar.zzB();
                    int i3 = zzB - 8;
                    int i4 = zzB2 - 8;
                    java.lang.String zzk = com.google.android.gms.internal.ads.zzfl.zzk(zzetVar.zzi(), zzetVar.zzg(), i4);
                    zzetVar.zzk(i4);
                    if (zzB3 == 1937011815) {
                        zzcwVar = com.google.android.gms.internal.ads.zzapc.zzb(zzk);
                    } else if (zzB3 == 1885436268) {
                        charSequence = com.google.android.gms.internal.ads.zzapc.zzc(null, zzk.trim(), java.util.Collections.emptyList());
                    }
                    zzB = i3 - i4;
                }
                if (charSequence == null) {
                    charSequence = "";
                }
                if (zzcwVar != null) {
                    zzcwVar.zza(charSequence);
                    zzr = zzcwVar.zzr();
                } else {
                    java.util.regex.Pattern pattern = com.google.android.gms.internal.ads.zzapc.zza;
                    com.google.android.gms.internal.ads.zzapb zzapbVar = new com.google.android.gms.internal.ads.zzapb();
                    zzapbVar.zzc = charSequence;
                    zzr = zzapbVar.zza().zzr();
                }
                arrayList.add(zzr);
            } else {
                zzetVar.zzk(zzB);
            }
        }
        zzdtVar.zza(new com.google.android.gms.internal.ads.zzand(arrayList, -9223372036854775807L, -9223372036854775807L));
    }
}
