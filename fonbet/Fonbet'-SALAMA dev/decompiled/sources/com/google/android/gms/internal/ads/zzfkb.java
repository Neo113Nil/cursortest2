package com.google.android.gms.internal.ads;

import android.view.View;
import java.util.Iterator;

/* loaded from: classes.dex */
public final class zzfkb extends zzfke {
    private static final zzfkb zzb = new zzfkb();

    private zzfkb() {
    }

    public static zzfkb zza() {
        return zzb;
    }

    @Override // com.google.android.gms.internal.ads.zzfke
    public final void zzb(boolean z4) {
        Iterator it = zzfkc.zza().zzc().iterator();
        while (it.hasNext()) {
            ((zzfjl) it.next()).zzg().zzk(z4);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzfke
    public final boolean zzc() {
        Iterator it = zzfkc.zza().zzb().iterator();
        while (it.hasNext()) {
            View zzf = ((zzfjl) it.next()).zzf();
            if (zzf != null && zzf.hasWindowFocus()) {
                return true;
            }
        }
        return false;
    }
}
