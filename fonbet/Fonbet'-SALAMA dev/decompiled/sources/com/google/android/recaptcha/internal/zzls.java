package com.google.android.recaptcha.internal;

/* loaded from: classes.dex */
final class zzls {
    public static final boolean zza(Object obj) {
        return !((zzlr) obj).zze();
    }

    public static final Object zzb(Object obj, Object obj2) {
        zzlr zzlrVar = (zzlr) obj;
        zzlr zzlrVar2 = (zzlr) obj2;
        if (!zzlrVar2.isEmpty()) {
            if (!zzlrVar.zze()) {
                zzlrVar = zzlrVar.zzb();
            }
            zzlrVar.zzd(zzlrVar2);
        }
        return zzlrVar;
    }
}
