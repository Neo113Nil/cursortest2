package com.google.android.gms.internal.fido;

/* compiled from: com.google.android.gms:play-services-fido@@20.0.1 */
/* loaded from: classes4.dex */
final class zzar extends com.google.android.gms.internal.fido.zzao {
    private final com.google.android.gms.internal.fido.zzat zza;

    zzar(com.google.android.gms.internal.fido.zzat zzatVar, int i) {
        super(zzatVar.size(), i);
        this.zza = zzatVar;
    }

    @Override // com.google.android.gms.internal.fido.zzao
    protected final java.lang.Object zza(int i) {
        return this.zza.get(i);
    }
}
