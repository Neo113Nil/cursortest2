package com.google.android.gms.internal.ads;

import android.provider.Settings;
import java.lang.reflect.InvocationTargetException;

/* JADX INFO: loaded from: classes.dex */
public final class zzawd extends zzaxe {
    public zzawd(zzavr zzavrVar, String str, String str2, zzarr zzarrVar, int i7, int i8) {
        super(zzavrVar, "paWE2wqxriEOnjKmZda4l7aMFrHfqXX/fY1F1oJ1dgH9mE52a/hg9qIyflHpJMem", "tie4Nx2Rx4mPGYaXTS6CVbCX9qOpzvyYTYhXBAGWcg8=", zzarrVar, i7, 49);
    }

    @Override // com.google.android.gms.internal.ads.zzaxe
    public final void zza() throws InvocationTargetException {
        this.zzd.zzY(3);
        try {
            boolean zBooleanValue = ((Boolean) this.zze.invoke(null, this.zza.zzb())).booleanValue();
            zzarr zzarrVar = this.zzd;
            int i7 = 1;
            if (true == zBooleanValue) {
                i7 = 2;
            }
            zzarrVar.zzY(i7);
        } catch (InvocationTargetException e7) {
            if (!(e7.getTargetException() instanceof Settings.SettingNotFoundException)) {
                throw e7;
            }
        }
    }
}
