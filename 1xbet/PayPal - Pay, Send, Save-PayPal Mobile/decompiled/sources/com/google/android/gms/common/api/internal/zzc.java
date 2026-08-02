package com.google.android.gms.common.api.internal;

/* loaded from: classes4.dex */
final class zzc {
    private final java.util.Map zza = java.util.Collections.synchronizedMap(new androidx.collection.ArrayMap());
    private int zzb = 0;
    private android.os.Bundle zzc;

    zzc() {
    }

    final com.google.android.gms.common.api.internal.LifecycleCallback zza(java.lang.String str, java.lang.Class cls) {
        return (com.google.android.gms.common.api.internal.LifecycleCallback) cls.cast(this.zza.get(str));
    }

    final void zzb(java.lang.String str, com.google.android.gms.common.api.internal.LifecycleCallback lifecycleCallback) {
        java.util.Map map = this.zza;
        if (map.containsKey(str)) {
            java.lang.StringBuilder sb = new java.lang.StringBuilder(java.lang.String.valueOf(str).length() + 59);
            sb.append("LifecycleCallback with tag ");
            sb.append(str);
            sb.append(" already added to this fragment.");
            throw new java.lang.IllegalArgumentException(sb.toString());
        }
        map.put(str, lifecycleCallback);
        if (this.zzb > 0) {
            new com.google.android.gms.internal.common.zzg(android.os.Looper.getMainLooper()).post(new com.google.android.gms.common.api.internal.zzb(this, lifecycleCallback, str));
        }
    }

    final void zze(android.os.Bundle bundle) {
        this.zzb = 1;
        this.zzc = bundle;
        for (java.util.Map.Entry entry : this.zza.entrySet()) {
            ((com.google.android.gms.common.api.internal.LifecycleCallback) entry.getValue()).onCreate(bundle != null ? bundle.getBundle((java.lang.String) entry.getKey()) : null);
        }
    }

    final void zzf() {
        this.zzb = 2;
        java.util.Iterator it = this.zza.values().iterator();
        while (it.hasNext()) {
            ((com.google.android.gms.common.api.internal.LifecycleCallback) it.next()).onStart();
        }
    }

    final void zzg() {
        this.zzb = 3;
        java.util.Iterator it = this.zza.values().iterator();
        while (it.hasNext()) {
            ((com.google.android.gms.common.api.internal.LifecycleCallback) it.next()).onResume();
        }
    }

    final void zzh(int i, int i2, android.content.Intent intent) {
        java.util.Iterator it = this.zza.values().iterator();
        while (it.hasNext()) {
            ((com.google.android.gms.common.api.internal.LifecycleCallback) it.next()).onActivityResult(i, i2, intent);
        }
    }

    final void zzi(android.os.Bundle bundle) {
        if (bundle == null) {
            return;
        }
        for (java.util.Map.Entry entry : this.zza.entrySet()) {
            android.os.Bundle bundle2 = new android.os.Bundle();
            ((com.google.android.gms.common.api.internal.LifecycleCallback) entry.getValue()).onSaveInstanceState(bundle2);
            bundle.putBundle((java.lang.String) entry.getKey(), bundle2);
        }
    }

    final void zzj() {
        this.zzb = 4;
        java.util.Iterator it = this.zza.values().iterator();
        while (it.hasNext()) {
            ((com.google.android.gms.common.api.internal.LifecycleCallback) it.next()).onStop();
        }
    }

    final void zzk() {
        this.zzb = 5;
        java.util.Iterator it = this.zza.values().iterator();
        while (it.hasNext()) {
            ((com.google.android.gms.common.api.internal.LifecycleCallback) it.next()).onDestroy();
        }
    }

    final void zzl(java.lang.String str, java.io.FileDescriptor fileDescriptor, java.io.PrintWriter printWriter, java.lang.String[] strArr) {
        java.util.Iterator it = this.zza.values().iterator();
        while (it.hasNext()) {
            ((com.google.android.gms.common.api.internal.LifecycleCallback) it.next()).dump(str, fileDescriptor, printWriter, strArr);
        }
    }

    final /* synthetic */ android.os.Bundle zzn() {
        return this.zzc;
    }

    final /* synthetic */ int zzm() {
        return this.zzb;
    }

    final boolean zzd() {
        return this.zzb >= 2;
    }

    final boolean zzc() {
        return this.zzb > 0;
    }
}
