package com.google.android.gms.internal.tapandpay;

/* loaded from: classes8.dex */
final class zzbw extends com.google.android.gms.internal.tapandpay.zzbt {
    private final com.google.android.gms.internal.tapandpay.zzby zza;

    zzbw(com.google.android.gms.internal.tapandpay.zzby zzbyVar, int i) {
        super(zzbyVar.size(), i);
        this.zza = zzbyVar;
    }

    @Override // com.google.android.gms.internal.tapandpay.zzbt
    protected final java.lang.Object zza(int i) {
        return this.zza.get(i);
    }
}
