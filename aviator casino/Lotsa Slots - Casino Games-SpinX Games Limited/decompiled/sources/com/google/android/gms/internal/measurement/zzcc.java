package com.google.android.gms.internal.measurement;

/* compiled from: com.google.android.gms:play-services-measurement-impl@@22.5.0 */
/* loaded from: classes4.dex */
final class zzcc implements android.content.SharedPreferences.Editor {
    boolean zza;
    final java.util.Set zzb;
    final java.util.Map zzc;
    final /* synthetic */ com.google.android.gms.internal.measurement.zzcd zzd;

    /* synthetic */ zzcc(com.google.android.gms.internal.measurement.zzcd zzcdVar, byte[] bArr) {
        java.util.Objects.requireNonNull(zzcdVar);
        this.zzd = zzcdVar;
        this.zza = false;
        this.zzb = new java.util.HashSet();
        this.zzc = new java.util.HashMap();
    }

    private final void zza(java.lang.String str, java.lang.Object obj) {
        if (obj != null) {
            this.zzc.put(str, obj);
        } else {
            remove(str);
        }
    }

    @Override // android.content.SharedPreferences.Editor
    public final void apply() {
        commit();
    }

    @Override // android.content.SharedPreferences.Editor
    public final android.content.SharedPreferences.Editor clear() {
        this.zza = true;
        return this;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // android.content.SharedPreferences.Editor
    public final boolean commit() {
        if (this.zza) {
            this.zzd.zza().clear();
        }
        com.google.android.gms.internal.measurement.zzcd zzcdVar = this.zzd;
        java.util.Set set = this.zzb;
        zzcdVar.zza().keySet().removeAll(set);
        java.util.Map map = this.zzc;
        for (java.util.Map.Entry entry : map.entrySet()) {
            zzcdVar.zza().put((java.lang.String) entry.getKey(), entry.getValue());
        }
        for (android.content.SharedPreferences.OnSharedPreferenceChangeListener onSharedPreferenceChangeListener : zzcdVar.zzb()) {
            com.google.common.collect.UnmodifiableIterator it = com.google.common.collect.Sets.union(set, map.keySet()).iterator();
            while (it.hasNext()) {
                onSharedPreferenceChangeListener.onSharedPreferenceChanged(zzcdVar, (java.lang.String) it.next());
            }
        }
        return (!this.zza && set.isEmpty() && map.isEmpty()) ? false : true;
    }

    @Override // android.content.SharedPreferences.Editor
    public final android.content.SharedPreferences.Editor putBoolean(java.lang.String str, boolean z) {
        zza(str, java.lang.Boolean.valueOf(z));
        return this;
    }

    @Override // android.content.SharedPreferences.Editor
    public final android.content.SharedPreferences.Editor putFloat(java.lang.String str, float f) {
        zza(str, java.lang.Float.valueOf(f));
        return this;
    }

    @Override // android.content.SharedPreferences.Editor
    public final android.content.SharedPreferences.Editor putInt(java.lang.String str, int i) {
        zza(str, java.lang.Integer.valueOf(i));
        return this;
    }

    @Override // android.content.SharedPreferences.Editor
    public final android.content.SharedPreferences.Editor putLong(java.lang.String str, long j) {
        zza(str, java.lang.Long.valueOf(j));
        return this;
    }

    @Override // android.content.SharedPreferences.Editor
    public final android.content.SharedPreferences.Editor putString(java.lang.String str, java.lang.String str2) {
        zza(str, str2);
        return this;
    }

    @Override // android.content.SharedPreferences.Editor
    public final android.content.SharedPreferences.Editor putStringSet(java.lang.String str, java.util.Set set) {
        zza(str, set);
        return this;
    }

    @Override // android.content.SharedPreferences.Editor
    public final android.content.SharedPreferences.Editor remove(java.lang.String str) {
        this.zzb.add(str);
        return this;
    }
}
