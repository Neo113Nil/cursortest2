package com.google.android.gms.internal.auth;

import java.util.Collections;
import java.util.List;
import java.util.Map;

/* loaded from: classes.dex */
final class zzgk extends zzgu {
    public zzgk(int i7) {
        super(i7, null);
    }

    @Override // com.google.android.gms.internal.auth.zzgu
    public final void zza() {
        if (!zzj()) {
            for (int i7 = 0; i7 < zzb(); i7++) {
                Map.Entry zzg = zzg(i7);
                if (((zzeo) zzg.getKey()).zzc()) {
                    zzg.setValue(Collections.unmodifiableList((List) zzg.getValue()));
                }
            }
            for (Map.Entry entry : zzc()) {
                if (((zzeo) entry.getKey()).zzc()) {
                    entry.setValue(Collections.unmodifiableList((List) entry.getValue()));
                }
            }
        }
        super.zza();
    }
}
