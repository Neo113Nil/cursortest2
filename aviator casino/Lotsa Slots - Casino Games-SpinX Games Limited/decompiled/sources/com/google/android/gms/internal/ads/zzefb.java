package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@25.2.0 */
/* loaded from: classes4.dex */
public final class zzefb implements com.google.android.gms.internal.ads.zzimu {
    public static com.google.android.gms.internal.ads.zzefb zza() {
        return com.google.android.gms.internal.ads.zzefa.zza;
    }

    @Override // com.google.android.gms.internal.ads.zzinj, com.google.android.gms.internal.ads.zzini
    public final /* synthetic */ java.lang.Object zzb() {
        com.google.android.gms.ads.internal.zzt.zzc();
        java.lang.String uuid = java.util.UUID.randomUUID().toString();
        com.google.android.gms.internal.ads.zzinc.zzb(uuid);
        return uuid;
    }
}
