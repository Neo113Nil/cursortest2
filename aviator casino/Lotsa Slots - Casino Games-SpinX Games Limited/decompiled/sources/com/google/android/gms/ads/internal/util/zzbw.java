package com.google.android.gms.ads.internal.util;

/* compiled from: com.google.android.gms:play-services-ads@@25.2.0 */
/* loaded from: classes3.dex */
final class zzbw implements android.content.SharedPreferences.OnSharedPreferenceChangeListener {
    final /* synthetic */ com.google.android.gms.ads.internal.util.zzbz zza;
    private final java.lang.String zzb;

    public zzbw(com.google.android.gms.ads.internal.util.zzbz zzbzVar, java.lang.String str) {
        java.util.Objects.requireNonNull(zzbzVar);
        this.zza = zzbzVar;
        this.zzb = str;
    }

    @Override // android.content.SharedPreferences.OnSharedPreferenceChangeListener
    public final void onSharedPreferenceChanged(android.content.SharedPreferences sharedPreferences, java.lang.String str) {
        com.google.android.gms.ads.internal.util.zzbz zzbzVar = this.zza;
        synchronized (zzbzVar) {
            java.util.Iterator it = zzbzVar.zzd().iterator();
            while (it.hasNext()) {
                ((com.google.android.gms.ads.internal.util.zzbx) it.next()).zza(sharedPreferences, this.zzb, str);
            }
        }
    }
}
