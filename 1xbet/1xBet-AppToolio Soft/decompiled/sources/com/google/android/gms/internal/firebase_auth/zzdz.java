package com.google.android.gms.internal.firebase_auth;

import java.io.IOException;

/* loaded from: classes.dex */
public final class zzdz<K, V> {
    static <K, V> int zza(zzea<K, V> zzeaVar, K k, V v) {
        return zzcs.zza(zzeaVar.zztb, 1, k) + zzcs.zza(zzeaVar.zztd, 2, v);
    }

    static <K, V> void zza(zzci zzciVar, zzea<K, V> zzeaVar, K k, V v) throws IOException {
        zzcs.zza(zzciVar, zzeaVar.zztb, 1, k);
        zzcs.zza(zzciVar, zzeaVar.zztd, 2, v);
    }
}
