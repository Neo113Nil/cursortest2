package com.google.android.gms.internal.ads;

import java.lang.reflect.InvocationTargetException;

/* JADX INFO: loaded from: classes.dex */
public final class zzawt extends zzaxe {
    public zzawt(zzavr zzavrVar, String str, String str2, zzarr zzarrVar, int i7, int i8) {
        super(zzavrVar, "ZQuMSqLu1gdm/gMzUvHWBkU0Sn7gMow0arYusmUfoGeG+b5t8M6fSL0HewVMmbAc", "fXma+90wsiayVNPFngiOIHN3H33XPFacSJs09CpdE6Q=", zzarrVar, i7, 73);
    }

    @Override // com.google.android.gms.internal.ads.zzaxe
    public final void zza() {
        try {
            boolean zBooleanValue = ((Boolean) this.zze.invoke(null, this.zza.zzb())).booleanValue();
            zzarr zzarrVar = this.zzd;
            int i7 = 1;
            if (true == zBooleanValue) {
                i7 = 2;
            }
            zzarrVar.zzac(i7);
        } catch (InvocationTargetException unused) {
            this.zzd.zzac(3);
        }
    }
}
