package com.google.android.gms.internal.ads;

import F2.C0254t;
import android.app.Activity;
import android.content.Context;
import android.content.pm.PackageManager;
import android.view.ViewGroup;
import android.view.Window;
import io.sentry.protocol.SentryStackFrame;
import java.util.Set;
import java.util.concurrent.Callable;

/* JADX INFO: loaded from: classes.dex */
public final class zzept implements zzesh {
    private final zzgbn zza;
    private final ViewGroup zzb;
    private final Context zzc;
    private final Set zzd;

    public zzept(zzgbn zzgbnVar, ViewGroup viewGroup, Context context, Set set) {
        this.zza = zzgbnVar;
        this.zzd = set;
        this.zzb = viewGroup;
        this.zzc = context;
    }

    public static zzepu zzc(zzept zzeptVar) {
        zzbbp zzbbpVar = zzbby.zzfR;
        C0254t c0254t = C0254t.f2723d;
        if (((Boolean) c0254t.f2726c.zzb(zzbbpVar)).booleanValue() && zzeptVar.zzb != null && zzeptVar.zzd.contains("banner")) {
            return new zzepu(Boolean.valueOf(zzeptVar.zzb.isHardwareAccelerated()));
        }
        boolean zBooleanValue = ((Boolean) c0254t.f2726c.zzb(zzbby.zzfS)).booleanValue();
        Boolean boolValueOf = null;
        if (zBooleanValue && zzeptVar.zzd.contains(SentryStackFrame.JsonKeys.NATIVE)) {
            Context context = zzeptVar.zzc;
            if (context instanceof Activity) {
                Activity activity = (Activity) context;
                Window window = activity.getWindow();
                if (window == null || (window.getAttributes().flags & 16777216) == 0) {
                    try {
                        boolValueOf = Boolean.valueOf((activity.getPackageManager().getActivityInfo(activity.getComponentName(), 0).flags & 512) != 0);
                    } catch (PackageManager.NameNotFoundException unused) {
                    }
                } else {
                    boolValueOf = Boolean.TRUE;
                }
                return new zzepu(boolValueOf);
            }
        }
        return new zzepu(null);
    }

    @Override // com.google.android.gms.internal.ads.zzesh
    public final int zza() {
        return 22;
    }

    @Override // com.google.android.gms.internal.ads.zzesh
    public final I3.b zzb() {
        return this.zza.zzb(new Callable() { // from class: com.google.android.gms.internal.ads.zzeps
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return zzept.zzc(this.zza);
            }
        });
    }
}
