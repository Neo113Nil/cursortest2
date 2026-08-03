package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@25.2.0 */
/* loaded from: classes4.dex */
final class zzda {
    private static final java.lang.String zza;
    private static final java.lang.String zzb;
    private static final java.lang.String zzc;
    private static final java.lang.String zzd;
    private static final java.lang.String zze;

    static {
        java.lang.String str = com.google.android.gms.internal.ads.zzfl.zza;
        zza = java.lang.Integer.toString(0, 36);
        zzb = java.lang.Integer.toString(1, 36);
        zzc = java.lang.Integer.toString(2, 36);
        zzd = java.lang.Integer.toString(3, 36);
        zze = java.lang.Integer.toString(4, 36);
    }

    public static java.util.ArrayList zza(android.text.Spanned spanned) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        for (com.google.android.gms.internal.ads.zzdc zzdcVar : (com.google.android.gms.internal.ads.zzdc[]) spanned.getSpans(0, spanned.length(), com.google.android.gms.internal.ads.zzdc.class)) {
            arrayList.add(zzb(spanned, zzdcVar, 1, zzdcVar.zza()));
        }
        for (com.google.android.gms.internal.ads.zzde zzdeVar : (com.google.android.gms.internal.ads.zzde[]) spanned.getSpans(0, spanned.length(), com.google.android.gms.internal.ads.zzde.class)) {
            arrayList.add(zzb(spanned, zzdeVar, 2, zzdeVar.zza()));
        }
        for (com.google.android.gms.internal.ads.zzdb zzdbVar : (com.google.android.gms.internal.ads.zzdb[]) spanned.getSpans(0, spanned.length(), com.google.android.gms.internal.ads.zzdb.class)) {
            arrayList.add(zzb(spanned, zzdbVar, 3, null));
        }
        for (com.google.android.gms.internal.ads.zzdf zzdfVar : (com.google.android.gms.internal.ads.zzdf[]) spanned.getSpans(0, spanned.length(), com.google.android.gms.internal.ads.zzdf.class)) {
            arrayList.add(zzb(spanned, zzdfVar, 4, zzdfVar.zza()));
        }
        return arrayList;
    }

    private static android.os.Bundle zzb(android.text.Spanned spanned, java.lang.Object obj, int i, android.os.Bundle bundle) {
        android.os.Bundle bundle2 = new android.os.Bundle();
        bundle2.putInt(zza, spanned.getSpanStart(obj));
        bundle2.putInt(zzb, spanned.getSpanEnd(obj));
        bundle2.putInt(zzc, spanned.getSpanFlags(obj));
        bundle2.putInt(zzd, i);
        if (bundle != null) {
            bundle2.putBundle(zze, bundle);
        }
        return bundle2;
    }
}
