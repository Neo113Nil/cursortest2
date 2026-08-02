package com.google.android.gms.internal.ads;

import F2.C0254t;
import android.view.View;
import android.view.ViewParent;

/* loaded from: classes.dex */
public final class zzdie {
    private final zzdqq zza;

    public zzdie(zzdqq zzdqqVar) {
        this.zza = zzdqqVar;
    }

    public final void zza(View view, zzfaf zzfafVar) {
        String str;
        if (!((Boolean) C0254t.f2723d.f2726c.zzb(zzbby.zzmP)).booleanValue() || view == null) {
            return;
        }
        ViewParent parent = view.getParent();
        while (true) {
            if (parent == null) {
                str = "0";
                break;
            } else {
                if (parent.getClass().getName().startsWith("androidx.compose.ui")) {
                    str = "1";
                    break;
                }
                parent = parent.getParent();
            }
        }
        zzdqp zza = this.zza.zza();
        zza.zzb("action", "hcp");
        zza.zzb("hcp", str);
        zza.zzc(zzfafVar);
        zza.zzj();
    }
}
