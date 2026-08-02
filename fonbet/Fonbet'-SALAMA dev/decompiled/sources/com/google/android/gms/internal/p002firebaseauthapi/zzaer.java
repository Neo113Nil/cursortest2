package com.google.android.gms.internal.p002firebaseauthapi;

import android.app.Activity;
import e4.AbstractC1039m;
import java.util.Map;
import java.util.concurrent.Executor;
import r.b;

/* loaded from: classes.dex */
public final class zzaer {
    private static final Map<String, zzaet> zza = new b();

    public static AbstractC1039m zza(String str, AbstractC1039m abstractC1039m, zzady zzadyVar) {
        zza(str, zzadyVar);
        return new zzaeu(abstractC1039m, str);
    }

    public static void zza() {
        zza.clear();
    }

    private static void zza(String str, zzady zzadyVar) {
        zza.put(str, new zzaet(zzadyVar, System.currentTimeMillis()));
    }

    public static boolean zza(String str, AbstractC1039m abstractC1039m, Activity activity, Executor executor) {
        Map<String, zzaet> map = zza;
        if (map.containsKey(str)) {
            zzaet zzaetVar = map.get(str);
            if (System.currentTimeMillis() - zzaetVar.zzb < 120000) {
                zzady zzadyVar = zzaetVar.zza;
                if (zzadyVar == null) {
                    return true;
                }
                zzadyVar.zza(abstractC1039m, activity, executor, str);
                return true;
            }
            zza(str, null);
            return false;
        }
        zza(str, null);
        return false;
    }
}
