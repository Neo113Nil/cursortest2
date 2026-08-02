package com.google.android.gms.internal.p002firebaseauthapi;

import java.util.Iterator;
import java.util.Map;

/* loaded from: classes.dex */
final class zzaky implements zzakz {
    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzakz
    public final int zza(int i7, Object obj, Object obj2) {
        zzakw zzakwVar = (zzakw) obj;
        if (zzakwVar.isEmpty()) {
            return 0;
        }
        Iterator it = zzakwVar.entrySet().iterator();
        if (!it.hasNext()) {
            return 0;
        }
        Map.Entry entry = (Map.Entry) it.next();
        entry.getKey();
        entry.getValue();
        throw new NoSuchMethodError();
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzakz
    public final Object zzb(Object obj) {
        return zzakw.zza().zzb();
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzakz
    public final Object zzc(Object obj) {
        ((zzakw) obj).zzc();
        return obj;
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzakz
    public final Map<?, ?> zzd(Object obj) {
        return (zzakw) obj;
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzakz
    public final Map<?, ?> zze(Object obj) {
        return (zzakw) obj;
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzakz
    public final boolean zzf(Object obj) {
        return !((zzakw) obj).zzd();
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzakz
    public final zzakx<?, ?> zza(Object obj) {
        throw new NoSuchMethodError();
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzakz
    public final Object zza(Object obj, Object obj2) {
        zzakw zzakwVar = (zzakw) obj;
        zzakw zzakwVar2 = (zzakw) obj2;
        if (!zzakwVar2.isEmpty()) {
            if (!zzakwVar.zzd()) {
                zzakwVar = zzakwVar.zzb();
            }
            zzakwVar.zza(zzakwVar2);
        }
        return zzakwVar;
    }
}
