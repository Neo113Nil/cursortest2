package com.google.android.play.core.splitcompat;

/* loaded from: classes9.dex */
public final class zza {
    private final com.google.android.play.core.splitcompat.zze zza;

    public static final int zzc(android.content.res.AssetManager assetManager, java.io.File file) {
        return ((java.lang.Integer) com.google.android.play.core.splitinstall.internal.zzbk.zzd(assetManager, "addAssetPath", java.lang.Integer.class, java.lang.String.class, file.getPath())).intValue();
    }

    public final void zza(android.content.Context context, java.util.Set set) {
        synchronized (this) {
            android.content.res.AssetManager assets = context.getAssets();
            java.util.Iterator it = set.iterator();
            while (it.hasNext()) {
                zzc(assets, (java.io.File) it.next());
            }
        }
    }

    final boolean zzb(android.content.Context context, java.util.Set set) {
        android.os.StrictMode.ThreadPolicy threadPolicy;
        synchronized (this) {
            try {
                threadPolicy = android.os.StrictMode.getThreadPolicy();
                try {
                    android.os.StrictMode.allowThreadDiskReads();
                    android.os.StrictMode.allowThreadDiskWrites();
                } catch (java.lang.Exception unused) {
                }
            } catch (java.lang.Exception unused2) {
                threadPolicy = null;
            }
            try {
                java.util.HashSet hashSet = new java.util.HashSet();
                java.util.Iterator it = set.iterator();
                while (it.hasNext()) {
                    hashSet.add(this.zza.zzg((java.lang.String) it.next()));
                }
                zza(context, hashSet);
                if (threadPolicy != null) {
                    android.os.StrictMode.setThreadPolicy(threadPolicy);
                }
            } catch (java.lang.Exception unused3) {
                if (threadPolicy == null) {
                    return false;
                }
                android.os.StrictMode.setThreadPolicy(threadPolicy);
                return false;
            } catch (java.lang.Throwable th) {
                if (threadPolicy != null) {
                    android.os.StrictMode.setThreadPolicy(threadPolicy);
                }
                throw th;
            }
        }
        return true;
    }

    public zza(com.google.android.play.core.splitcompat.zze zzeVar) {
        this.zza = zzeVar;
    }
}
