package com.google.android.gms.internal.ads;

import E2.o;
import java.io.IOException;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
final class zzbil implements zzbiz {
    @Override // com.google.android.gms.internal.ads.zzbiz
    public final void zza(Object obj, Map map) {
        zzceb zzcebVar = (zzceb) obj;
        try {
            zzfpy.zzj(zzcebVar.getContext()).zzk();
            zzfpz.zzi(zzcebVar.getContext()).zzj();
            zzfqa.zza(zzcebVar.getContext()).zzb(null);
        } catch (IOException e7) {
            o.f1952C.f1961g.zzw(e7, "DefaultGmsgHandlers.ResetPaid");
        }
    }
}
