package com.google.android.recaptcha.internal;

import C6.o;
import g6.AbstractC1159h;
import java.util.Iterator;
import java.util.Set;
import t6.h;

/* loaded from: classes.dex */
public final class zzeb {
    private Set zza;
    private Set zzb;
    private Long zzc;
    private int zzd;

    private static final boolean zzc(String str, Set set) {
        h.e(str, "<this>");
        Iterator it = o.z0(str, 0, String.valueOf(new char[]{'.'}[0]), false).iterator();
        String str2 = "";
        while (it.hasNext()) {
            String concat = str2.concat(String.valueOf((String) it.next()));
            if (set.contains(concat)) {
                return true;
            }
            str2 = concat.concat(".");
        }
        return false;
    }

    public final void zza(zzpj zzpjVar) {
        this.zza = AbstractC1159h.e1(zzpjVar.zzf().zzi());
        this.zzb = AbstractC1159h.e1(zzpjVar.zzg().zzi());
    }

    public final boolean zzb(String str) {
        Set set = this.zza;
        if (set == null || this.zzb == null) {
            if (this.zzc == null) {
                this.zzc = Long.valueOf(System.currentTimeMillis());
            }
            this.zzd++;
            return true;
        }
        if (set.isEmpty()) {
            return true;
        }
        Set set2 = this.zzb;
        h.c(set2, "null cannot be cast to non-null type kotlin.collections.Set<kotlin.String>");
        if (zzc(str, set2)) {
            return false;
        }
        return zzc(str, set);
    }
}
