package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@25.2.0 */
/* loaded from: classes4.dex */
public final class zzahm {
    public static final /* synthetic */ int zza = 0;
    private static final com.google.android.gms.internal.ads.zzhaf zzb = com.google.android.gms.internal.ads.zzhaf.zzb(0, 2, 1);
    private static final com.google.android.gms.internal.ads.zzhaf zzc = com.google.android.gms.internal.ads.zzhaf.zzc(0, 2, 1, 3, 4);
    private static final com.google.android.gms.internal.ads.zzhaf zzd = com.google.android.gms.internal.ads.zzhaf.zzd(0, 2, 1, 5, 3, 4);
    private static final com.google.android.gms.internal.ads.zzhaf zze = com.google.android.gms.internal.ads.zzhaf.zze(0, 2, 1, 6, 5, 3, 4);
    private static final com.google.android.gms.internal.ads.zzhaf zzf = com.google.android.gms.internal.ads.zzhaf.zze(0, 2, 1, 7, 5, 6, 3, 4);

    public static com.google.android.gms.internal.ads.zzhaf zza(int i) {
        if (i == 3) {
            return zzb;
        }
        if (i == 5) {
            return zzc;
        }
        if (i == 6) {
            return zzd;
        }
        if (i == 7) {
            return zze;
        }
        if (i != 8) {
            return null;
        }
        return zzf;
    }

    public static com.google.android.gms.internal.ads.zzap zzb(java.util.List list) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        for (int i = 0; i < list.size(); i++) {
            java.lang.String str = (java.lang.String) list.get(i);
            java.lang.String str2 = com.google.android.gms.internal.ads.zzfl.zza;
            java.lang.String[] split = str.split(com.ironsource.X3.j.b, 2);
            if (split.length != 2) {
                java.lang.String.valueOf(str);
                com.google.android.gms.internal.ads.zzeg.zzc("VorbisUtil", "Failed to parse Vorbis comment: ".concat(java.lang.String.valueOf(str)));
            } else if (split[0].equals("METADATA_BLOCK_PICTURE")) {
                try {
                    arrayList.add(com.google.android.gms.internal.ads.zzajc.zzb(new com.google.android.gms.internal.ads.zzet(android.util.Base64.decode(split[1], 0))));
                } catch (java.lang.RuntimeException e) {
                    com.google.android.gms.internal.ads.zzeg.zzd("VorbisUtil", "Failed to parse vorbis picture", e);
                }
            } else {
                arrayList.add(new com.google.android.gms.internal.ads.zzajy(split[0], split[1]));
            }
        }
        if (arrayList.isEmpty()) {
            return null;
        }
        return new com.google.android.gms.internal.ads.zzap(arrayList);
    }
}
