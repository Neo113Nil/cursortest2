package com.google.android.gms.internal.firebase_auth;

import com.google.android.gms.internal.firebase_auth.zzdb;
import java.io.IOException;
import java.util.Map;

/* loaded from: classes.dex */
final class zzcq extends zzcp<Object> {
    zzcq() {
    }

    @Override // com.google.android.gms.internal.firebase_auth.zzcp
    final int zza(Map.Entry<?, ?> entry) {
        entry.getKey();
        throw new NoSuchMethodError();
    }

    @Override // com.google.android.gms.internal.firebase_auth.zzcp
    final Object zza(zzco zzcoVar, zzeh zzehVar, int i) {
        return zzcoVar.zza(zzehVar, i);
    }

    @Override // com.google.android.gms.internal.firebase_auth.zzcp
    final <UT, UB> UB zza(zzeu zzeuVar, Object obj, zzco zzcoVar, zzcs<Object> zzcsVar, UB ub, zzfp<UT, UB> zzfpVar) throws IOException {
        throw new NoSuchMethodError();
    }

    @Override // com.google.android.gms.internal.firebase_auth.zzcp
    final void zza(zzbu zzbuVar, Object obj, zzco zzcoVar, zzcs<Object> zzcsVar) throws IOException {
        throw new NoSuchMethodError();
    }

    @Override // com.google.android.gms.internal.firebase_auth.zzcp
    final void zza(zzeu zzeuVar, Object obj, zzco zzcoVar, zzcs<Object> zzcsVar) throws IOException {
        throw new NoSuchMethodError();
    }

    @Override // com.google.android.gms.internal.firebase_auth.zzcp
    final void zza(zzgj zzgjVar, Map.Entry<?, ?> entry) throws IOException {
        entry.getKey();
        throw new NoSuchMethodError();
    }

    @Override // com.google.android.gms.internal.firebase_auth.zzcp
    final void zza(Object obj, zzcs<Object> zzcsVar) {
        ((zzdb.zzc) obj).zzrd = zzcsVar;
    }

    @Override // com.google.android.gms.internal.firebase_auth.zzcp
    final zzcs<Object> zzc(Object obj) {
        return ((zzdb.zzc) obj).zzrd;
    }

    @Override // com.google.android.gms.internal.firebase_auth.zzcp
    final zzcs<Object> zzd(Object obj) {
        zzcs<Object> zzc = zzc(obj);
        if (!zzc.isImmutable()) {
            return zzc;
        }
        zzcs<Object> zzcsVar = (zzcs) zzc.clone();
        zza(obj, zzcsVar);
        return zzcsVar;
    }

    @Override // com.google.android.gms.internal.firebase_auth.zzcp
    final void zze(Object obj) {
        zzc(obj).zzbs();
    }

    @Override // com.google.android.gms.internal.firebase_auth.zzcp
    final boolean zze(zzeh zzehVar) {
        return zzehVar instanceof zzdb.zzc;
    }
}
