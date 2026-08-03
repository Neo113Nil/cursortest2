package com.google.android.gms.internal.measurement;

/* compiled from: com.google.android.gms:play-services-measurement-impl@@22.5.0 */
/* loaded from: classes4.dex */
public final class zzjl implements com.google.android.gms.internal.measurement.zzjh {
    private final java.util.concurrent.atomic.AtomicBoolean zza = new java.util.concurrent.atomic.AtomicBoolean();
    private java.util.HashMap zzb = null;
    private final java.util.HashMap zzc = new java.util.HashMap(16, 1.0f);
    private final java.util.HashMap zzd = new java.util.HashMap(16, 1.0f);
    private final java.util.HashMap zze = new java.util.HashMap(16, 1.0f);
    private final java.util.HashMap zzf = new java.util.HashMap(16, 1.0f);
    private java.lang.Object zzg = null;
    private boolean zzh = false;
    private final java.lang.String[] zzi = new java.lang.String[0];

    @Override // com.google.android.gms.internal.measurement.zzjh
    public final java.lang.String zza(android.content.ContentResolver contentResolver, java.lang.String str, java.lang.String str2) {
        java.lang.String str3;
        if (contentResolver == null) {
            throw new java.lang.IllegalStateException("ContentResolver needed with GservicesDelegateSupplier.init()");
        }
        synchronized (this) {
            java.lang.String str4 = null;
            if (this.zzb == null) {
                this.zza.set(false);
                this.zzb = new java.util.HashMap(16, 1.0f);
                this.zzg = new java.lang.Object();
                contentResolver.registerContentObserver(com.google.android.gms.internal.measurement.zzjg.zza, true, new com.google.android.gms.internal.measurement.zzjj(this, null));
            } else if (this.zza.getAndSet(false)) {
                this.zzb.clear();
                this.zzc.clear();
                this.zzd.clear();
                this.zze.clear();
                this.zzf.clear();
                this.zzg = new java.lang.Object();
                this.zzh = false;
            }
            java.lang.Object obj = this.zzg;
            if (this.zzb.containsKey(str)) {
                java.lang.String str5 = (java.lang.String) this.zzb.get(str);
                if (str5 != null) {
                    str4 = str5;
                }
                return str4;
            }
            try {
                android.net.Uri uri = com.google.android.gms.internal.measurement.zzjg.zza;
                android.content.ContentProviderClient acquireUnstableContentProviderClient = contentResolver.acquireUnstableContentProviderClient(uri);
                try {
                    if (acquireUnstableContentProviderClient == null) {
                        throw new com.google.android.gms.internal.measurement.zzjk("Unable to acquire ContentProviderClient");
                    }
                    try {
                        android.database.Cursor query = acquireUnstableContentProviderClient.query(uri, null, null, new java.lang.String[]{str}, null);
                        try {
                            if (query == null) {
                                throw new com.google.android.gms.internal.measurement.zzjk("ContentProvider query returned null cursor");
                            }
                            if (query.moveToFirst()) {
                                str3 = query.getString(1);
                                query.close();
                            } else {
                                query.close();
                                str3 = null;
                            }
                            if (str3 != null && str3.equals(null)) {
                                str3 = null;
                            }
                            synchronized (this) {
                                if (obj == this.zzg) {
                                    this.zzb.put(str, str3);
                                }
                            }
                            if (str3 != null) {
                                return str3;
                            }
                            return null;
                        } catch (java.lang.Throwable th) {
                            if (query != null) {
                                try {
                                    query.close();
                                } catch (java.lang.Throwable th2) {
                                    th.addSuppressed(th2);
                                }
                            }
                            throw th;
                        }
                    } catch (android.os.RemoteException e) {
                        throw new com.google.android.gms.internal.measurement.zzjk("ContentProvider query failed", e);
                    }
                } finally {
                    acquireUnstableContentProviderClient.release();
                }
            } catch (com.google.android.gms.internal.measurement.zzjk unused) {
                return null;
            }
        }
    }

    final /* synthetic */ java.util.concurrent.atomic.AtomicBoolean zzb() {
        return this.zza;
    }
}
