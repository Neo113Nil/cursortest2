package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@25.2.0 */
/* loaded from: classes4.dex */
public final class zzgav extends com.google.android.gms.internal.ads.zzidy implements com.google.android.gms.internal.ads.zzifq {
    private zzgav() {
        throw null;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    /* synthetic */ zzgav(byte[] bArr) {
        super(r1);
        com.google.android.gms.internal.ads.zzgax zzgaxVar;
        zzgaxVar = com.google.android.gms.internal.ads.zzgax.zzb;
    }

    public final com.google.android.gms.internal.ads.zzgav zza(java.lang.String str) {
        str.getClass();
        zzbg();
        ((com.google.android.gms.internal.ads.zzgax) this.zza).zze().remove(str);
        return this;
    }

    public final java.util.Map zzb() {
        return java.util.Collections.unmodifiableMap(((com.google.android.gms.internal.ads.zzgax) this.zza).zzb());
    }

    public final com.google.android.gms.internal.ads.zzgav zzc(java.lang.String str, com.google.android.gms.internal.ads.zzgat zzgatVar) {
        str.getClass();
        zzgatVar.getClass();
        zzbg();
        ((com.google.android.gms.internal.ads.zzgax) this.zza).zze().put(str, zzgatVar);
        return this;
    }
}
