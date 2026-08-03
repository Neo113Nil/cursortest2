package com.google.android.gms.internal.play_billing;

/* compiled from: com.android.billingclient:billing@@7.0.0 */
/* loaded from: classes4.dex */
final class zzag extends com.google.android.gms.internal.play_billing.zzac {
    private final com.google.android.gms.internal.play_billing.zzai zza;

    zzag(com.google.android.gms.internal.play_billing.zzai zzaiVar, int i) {
        super(zzaiVar.size(), i);
        this.zza = zzaiVar;
    }

    @Override // com.google.android.gms.internal.play_billing.zzac
    protected final java.lang.Object zza(int i) {
        return this.zza.get(i);
    }
}
