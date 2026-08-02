package com.google.android.gms.internal.identity;

/* loaded from: classes8.dex */
final class zzev extends com.google.android.gms.internal.identity.zzet {
    private final com.google.android.gms.internal.identity.zzex zza;

    zzev(com.google.android.gms.internal.identity.zzex zzexVar, int i) {
        super(zzexVar.size(), i);
        this.zza = zzexVar;
    }

    @Override // com.google.android.gms.internal.identity.zzet
    protected final java.lang.Object zza(int i) {
        return this.zza.get(i);
    }
}
