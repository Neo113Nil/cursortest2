package com.google.android.gms.internal.ads;

import F2.C0254t;
import android.app.Activity;
import android.view.View;

/* JADX INFO: loaded from: classes.dex */
public final class zzawb extends zzaxe {
    private final Activity zzh;
    private final View zzi;

    public zzawb(zzavr zzavrVar, String str, String str2, zzarr zzarrVar, int i7, int i8, View view, Activity activity) {
        super(zzavrVar, "rbM1+IJKml7pK+8stsIEoLVWU08Pr9FbdEoZJlCacgPQDaiImdRY7YZ1yR+usDwp", "qIQ8RScVvIrhv3pJZgjHxMU1QEZI7Qp5PW5iOiVriA8=", zzarrVar, i7, 62);
        this.zzi = view;
        this.zzh = activity;
    }

    @Override // com.google.android.gms.internal.ads.zzaxe
    public final void zza() {
        if (this.zzi == null) {
            return;
        }
        Boolean bool = (Boolean) C0254t.f2723d.f2726c.zzb(zzbby.zzcN);
        boolean zBooleanValue = bool.booleanValue();
        Object[] objArr = (Object[]) this.zze.invoke(null, this.zzi, this.zzh, bool);
        synchronized (this.zzd) {
            try {
                this.zzd.zzc(((Long) objArr[0]).longValue());
                this.zzd.zze(((Long) objArr[1]).longValue());
                if (zBooleanValue) {
                    this.zzd.zzd((String) objArr[2]);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
