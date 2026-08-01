package com.google.android.gms.internal.ads;

import java.util.Iterator;

/* compiled from: com.google.android.gms:play-services-ads@@25.4.0 */
/* loaded from: classes9.dex */
final class zzgyb extends zzgvk {
    final /* synthetic */ Iterator zza;
    final /* synthetic */ zzgul zzb;

    zzgyb(Iterator it, zzgul zzgulVar) {
        this.zza = it;
        this.zzb = zzgulVar;
    }

    @Override // com.google.android.gms.internal.ads.zzgvk
    protected final Object zza() {
        zzgul zzgulVar;
        Object next;
        do {
            Iterator it = this.zza;
            if (!it.hasNext()) {
                zzb();
                return null;
            }
            zzgulVar = this.zzb;
            next = it.next();
        } while (!zzgulVar.zza(next));
        return next;
    }
}
