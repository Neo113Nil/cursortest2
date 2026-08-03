package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@25.2.0 */
/* loaded from: classes4.dex */
final class zzcec implements android.content.SharedPreferences.OnSharedPreferenceChangeListener {
    final /* synthetic */ com.google.android.gms.internal.ads.zzcef zza;
    private final java.lang.String zzb;

    public zzcec(com.google.android.gms.internal.ads.zzcef zzcefVar, java.lang.String str) {
        java.util.Objects.requireNonNull(zzcefVar);
        this.zza = zzcefVar;
        this.zzb = str;
    }

    @Override // android.content.SharedPreferences.OnSharedPreferenceChangeListener
    public final void onSharedPreferenceChanged(android.content.SharedPreferences sharedPreferences, java.lang.String str) {
        com.google.android.gms.internal.ads.zzcef zzcefVar = this.zza;
        synchronized (zzcefVar) {
            java.util.Iterator it = zzcefVar.zzd().iterator();
            while (it.hasNext()) {
                ((com.google.android.gms.internal.ads.zzced) it.next()).zza(sharedPreferences, this.zzb, str);
            }
        }
    }
}
