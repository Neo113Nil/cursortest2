package com.google.android.gms.internal.play_billing;

import com.ironsource.U3;
import java.util.Objects;

/* compiled from: com.android.billingclient:billing@@8.3.0 */
/* loaded from: classes8.dex */
final class zzs extends zzo {
    final /* synthetic */ zzt zzg;

    zzs(zzt zztVar) {
        Objects.requireNonNull(zztVar);
        this.zzg = zztVar;
    }

    @Override // com.google.android.gms.internal.play_billing.zzo
    protected final String zza() {
        zzp zzpVar = (zzp) this.zzg.zza.get();
        if (zzpVar == null) {
            return "Completer object has been garbage collected, future will fail soon";
        }
        return "tag=[" + String.valueOf(zzpVar.zza) + U3.j.e;
    }
}
