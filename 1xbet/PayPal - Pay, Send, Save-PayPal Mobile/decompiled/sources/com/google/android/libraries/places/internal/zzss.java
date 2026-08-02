package com.google.android.libraries.places.internal;

/* loaded from: classes.dex */
public abstract class zzss<API extends com.google.android.libraries.places.internal.zzts<API>> {
    private final com.google.android.libraries.places.internal.zzup zza;

    protected zzss(com.google.android.libraries.places.internal.zzup zzupVar) {
        this.zza = zzupVar;
    }

    private static void zzf(java.lang.String str, com.google.android.libraries.places.internal.zzun zzunVar) {
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append(new java.text.SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss.SSSZ").format(new java.util.Date(java.util.concurrent.TimeUnit.NANOSECONDS.toMillis(zzunVar.zzf()))));
        sb.append(": logging error [");
        com.google.android.libraries.places.internal.zzuo.zza(1, zzunVar.zzg(), sb);
        sb.append("]: ");
        sb.append(str);
        java.lang.System.err.println(sb);
        java.lang.System.err.flush();
    }

    public abstract com.google.android.libraries.places.internal.zzts zza(java.util.logging.Level level);

    protected final boolean zzd(java.util.logging.Level level) {
        return this.zza.zzb(level);
    }

    final void zze(com.google.android.libraries.places.internal.zzun zzunVar) {
        try {
            com.google.android.libraries.places.internal.zzxd zzc = com.google.android.libraries.places.internal.zzxd.zzc();
            try {
                if (zzc.zzb() <= 100) {
                    this.zza.zzc(zzunVar);
                } else {
                    zzf("unbounded recursion in log statement", zzunVar);
                }
                if (zzc != null) {
                    zzc.close();
                }
            } finally {
            }
        } catch (java.lang.RuntimeException e) {
            try {
                this.zza.zzd(e, zzunVar);
            } catch (com.google.android.libraries.places.internal.zzuq e2) {
                throw e2;
            } catch (java.lang.RuntimeException e3) {
                java.lang.String name2 = e3.getClass().getName();
                java.lang.String message = e3.getMessage();
                java.lang.StringBuilder sb = new java.lang.StringBuilder(java.lang.String.valueOf(name2).length() + 2 + java.lang.String.valueOf(message).length());
                sb.append(name2);
                sb.append(": ");
                sb.append(message);
                zzf(sb.toString(), zzunVar);
                try {
                    e3.printStackTrace(java.lang.System.err);
                } catch (java.lang.RuntimeException unused) {
                }
            }
        }
    }

    protected final java.lang.String zzc() {
        return this.zza.zza();
    }

    public final com.google.android.libraries.places.internal.zzts zzb() {
        return zza(java.util.logging.Level.WARNING);
    }
}
