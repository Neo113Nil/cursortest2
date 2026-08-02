package com.google.android.play.core.splitinstall;

/* loaded from: classes9.dex */
public final class zzbe {
    private final android.content.Context zza;

    private final android.content.SharedPreferences zze() {
        return this.zza.getSharedPreferences("playcore_split_install_internal", 0);
    }

    public final java.util.Set zza() {
        java.util.Set<java.lang.String> hashSet;
        synchronized (com.google.android.play.core.splitinstall.zzbe.class) {
            try {
                hashSet = zze().getStringSet("modules_to_uninstall_if_emulated", new java.util.HashSet());
                if (hashSet == null) {
                    hashSet = new java.util.HashSet<>();
                }
            } catch (java.lang.Exception unused) {
                hashSet = new java.util.HashSet<>();
            }
        }
        return hashSet;
    }

    public final void zzb() {
        synchronized (com.google.android.play.core.splitinstall.zzbe.class) {
            zze().edit().putStringSet("modules_to_uninstall_if_emulated", new java.util.HashSet()).apply();
        }
    }

    final void zzc(java.util.Collection collection) {
        synchronized (com.google.android.play.core.splitinstall.zzbe.class) {
            java.util.HashSet hashSet = new java.util.HashSet(zza());
            java.util.Iterator it = collection.iterator();
            boolean z = false;
            while (it.hasNext()) {
                z |= hashSet.add((java.lang.String) it.next());
            }
            if (z) {
                try {
                    zze().edit().putStringSet("modules_to_uninstall_if_emulated", hashSet).apply();
                } catch (java.lang.Exception unused) {
                }
            }
        }
    }

    final void zzd(java.util.Collection collection) {
        synchronized (com.google.android.play.core.splitinstall.zzbe.class) {
            java.util.Set<java.lang.String> zza = zza();
            java.util.HashSet hashSet = new java.util.HashSet();
            boolean z = false;
            for (java.lang.String str : zza) {
                if (collection.contains(str)) {
                    z = true;
                } else {
                    hashSet.add(str);
                }
            }
            if (z) {
                try {
                    zze().edit().putStringSet("modules_to_uninstall_if_emulated", hashSet).apply();
                } catch (java.lang.Exception unused) {
                }
            }
        }
    }

    public zzbe(android.content.Context context) {
        this.zza = context;
    }
}
