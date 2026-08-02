package com.google.android.gms.internal.firebase_auth;

import com.google.android.gms.internal.firebase_auth.zzcu;
import java.io.IOException;
import java.util.Map;

/* loaded from: classes.dex */
abstract class zzcp<T extends zzcu<T>> {
    zzcp() {
    }

    abstract int zza(Map.Entry<?, ?> entry);

    abstract Object zza(zzco zzcoVar, zzeh zzehVar, int i);

    abstract <UT, UB> UB zza(zzeu zzeuVar, Object obj, zzco zzcoVar, zzcs<T> zzcsVar, UB ub, zzfp<UT, UB> zzfpVar) throws IOException;

    abstract void zza(zzbu zzbuVar, Object obj, zzco zzcoVar, zzcs<T> zzcsVar) throws IOException;

    abstract void zza(zzeu zzeuVar, Object obj, zzco zzcoVar, zzcs<T> zzcsVar) throws IOException;

    abstract void zza(zzgj zzgjVar, Map.Entry<?, ?> entry) throws IOException;

    abstract void zza(Object obj, zzcs<T> zzcsVar);

    abstract zzcs<T> zzc(Object obj);

    abstract zzcs<T> zzd(Object obj);

    abstract void zze(Object obj);

    abstract boolean zze(zzeh zzehVar);
}
