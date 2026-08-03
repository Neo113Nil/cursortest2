package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads-api@@25.2.0 */
/* loaded from: classes4.dex */
public abstract class zzfzw implements java.io.Closeable {
    public static com.google.android.gms.internal.ads.zzgai zza() {
        return new com.google.android.gms.internal.ads.zzgai();
    }

    public static com.google.android.gms.internal.ads.zzgai zzb(com.google.android.gms.internal.ads.zzgub<java.lang.Integer> zzgubVar, com.google.android.gms.internal.ads.zzgub<java.lang.Integer> zzgubVar2, com.google.android.gms.internal.ads.zzfzy zzfzyVar) {
        return new com.google.android.gms.internal.ads.zzgai(zzgubVar, zzgubVar2, zzfzyVar);
    }

    public static com.google.android.gms.internal.ads.zzgai zzc(final int i, com.google.android.gms.internal.ads.zzfzy zzfzyVar) {
        return new com.google.android.gms.internal.ads.zzgai(new com.google.android.gms.internal.ads.zzgub() { // from class: com.google.android.gms.internal.ads.zzfzv
            @Override // com.google.android.gms.internal.ads.zzgub
            public final /* synthetic */ java.lang.Object zza() {
                java.lang.Integer valueOf;
                valueOf = java.lang.Integer.valueOf(i);
                return valueOf;
            }
        }, com.google.android.gms.internal.ads.zzfzu.zza, zzfzyVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ java.lang.Integer zzf() {
        return -1;
    }
}
