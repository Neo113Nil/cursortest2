package com.google.android.gms.internal.measurement;

import java.util.Collections;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
final class zzlx extends zzmh {
    public zzlx(int i7) {
        super(i7, null);
    }

    @Override // com.google.android.gms.internal.measurement.zzmh
    public final void zza() {
        if (!zzj()) {
            for (int i7 = 0; i7 < zzb(); i7++) {
                Map.Entry entryZzg = zzg(i7);
                if (((zzjs) entryZzg.getKey()).zzc()) {
                    entryZzg.setValue(Collections.unmodifiableList((List) entryZzg.getValue()));
                }
            }
            for (Map.Entry entry : zzc()) {
                if (((zzjs) entry.getKey()).zzc()) {
                    entry.setValue(Collections.unmodifiableList((List) entry.getValue()));
                }
            }
        }
        super.zza();
    }
}
