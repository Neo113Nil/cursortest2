package com.google.android.recaptcha.internal;

import java.util.Iterator;
import java.util.Map;

/* loaded from: classes.dex */
final class zzmn extends zzmu {
    public zzmn(int i7) {
        super(i7, null);
    }

    @Override // com.google.android.recaptcha.internal.zzmu
    public final void zza() {
        if (!zzj()) {
            for (int i7 = 0; i7 < zzb(); i7++) {
                ((zzkh) zzg(i7).getKey()).zzg();
            }
            Iterator it = zzc().iterator();
            while (it.hasNext()) {
                ((zzkh) ((Map.Entry) it.next()).getKey()).zzg();
            }
        }
        super.zza();
    }
}
