package com.google.android.gms.internal.identity_googleid;

/* loaded from: classes8.dex */
final class zzh extends com.google.android.gms.internal.identity_googleid.zzc {
    private final com.google.android.gms.internal.identity_googleid.zzj zza;

    zzh(com.google.android.gms.internal.identity_googleid.zzj zzjVar, int i) {
        super(zzjVar.size(), i);
        this.zza = zzjVar;
    }

    @Override // com.google.android.gms.internal.identity_googleid.zzc
    protected final java.lang.Object zza(int i) {
        return this.zza.get(i);
    }
}
