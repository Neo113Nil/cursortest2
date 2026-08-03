package com.google.android.gms.internal.consent_sdk;

/* compiled from: com.google.android.ump:user-messaging-platform@@4.0.0 */
/* loaded from: classes4.dex */
final class zzpf extends com.google.android.gms.internal.consent_sdk.zzpg {
    final /* synthetic */ com.google.android.gms.internal.consent_sdk.zzpm zza;
    private int zzb;
    private final int zzc;

    zzpf(com.google.android.gms.internal.consent_sdk.zzpm zzpmVar) {
        java.util.Objects.requireNonNull(zzpmVar);
        this.zza = zzpmVar;
        this.zzb = 0;
        this.zzc = zzpmVar.zzd();
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.zzb < this.zzc;
    }

    @Override // com.google.android.gms.internal.consent_sdk.zzpi
    public final byte zza() {
        int i = this.zzb;
        if (i >= this.zzc) {
            throw new java.util.NoSuchElementException();
        }
        this.zzb = i + 1;
        return this.zza.zzb(i);
    }
}
