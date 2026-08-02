package com.google.android.gms.internal.ads;

import java.util.Collections;
import java.util.List;
import java.util.Map;

/* loaded from: classes.dex */
final class zzgzn extends zzgzs {
    public zzgzn() {
        super(null);
    }

    @Override // com.google.android.gms.internal.ads.zzgzs
    public final void zza() {
        if (!zzj()) {
            for (int i7 = 0; i7 < zzc(); i7++) {
                Map.Entry zzg = zzg(i7);
                if (((zzgwu) ((zzgzo) zzg).zza()).zze()) {
                    zzg.setValue(Collections.unmodifiableList((List) zzg.getValue()));
                }
            }
            for (Map.Entry entry : zzd()) {
                if (((zzgwu) entry.getKey()).zze()) {
                    entry.setValue(Collections.unmodifiableList((List) entry.getValue()));
                }
            }
        }
        super.zza();
    }
}
