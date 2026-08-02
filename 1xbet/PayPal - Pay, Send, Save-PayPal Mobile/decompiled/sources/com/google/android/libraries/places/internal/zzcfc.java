package com.google.android.libraries.places.internal;

/* loaded from: classes4.dex */
public final class zzcfc implements com.google.android.libraries.places.internal.zzcft {
    final /* synthetic */ com.google.android.libraries.places.internal.zzcft zza;

    @Override // com.google.android.libraries.places.internal.zzcft, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        try {
            try {
                this.zza.close();
                kotlin.Unit unit = kotlin.Unit.INSTANCE;
            } catch (java.io.IOException e) {
                com.google.android.libraries.places.internal.zzcfe.zza();
                throw e;
            }
        } finally {
            com.google.android.libraries.places.internal.zzcfe.zza();
        }
    }

    @Override // com.google.android.libraries.places.internal.zzcft, java.io.Flushable
    public final void flush() {
        try {
            try {
                this.zza.flush();
                kotlin.Unit unit = kotlin.Unit.INSTANCE;
            } catch (java.io.IOException e) {
                com.google.android.libraries.places.internal.zzcfe.zza();
                throw e;
            }
        } finally {
            com.google.android.libraries.places.internal.zzcfe.zza();
        }
    }

    public final java.lang.String toString() {
        com.google.android.libraries.places.internal.zzcft zzcftVar = this.zza;
        java.lang.StringBuilder sb = new java.lang.StringBuilder(zzcftVar.toString().length() + 19);
        sb.append("AsyncTimeout.sink(");
        sb.append(zzcftVar);
        sb.append(")");
        return sb.toString();
    }

    @Override // com.google.android.libraries.places.internal.zzcft
    public final void zzc(com.google.android.libraries.places.internal.zzcff zzcffVar, long j) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(zzcffVar, "");
        com.google.android.libraries.places.internal.zzcfb.zza(zzcffVar.zzb(), 0L, j);
        while (true) {
            long j2 = 0;
            if (j <= 0) {
                return;
            }
            com.google.android.libraries.places.internal.zzcfq zzcfqVar = zzcffVar.zza;
            kotlin.jvm.internal.Intrinsics.checkNotNull(zzcfqVar);
            while (true) {
                if (j2 >= 65536) {
                    break;
                }
                j2 += zzcfqVar.zzc - zzcfqVar.zzb;
                if (j2 >= j) {
                    j2 = j;
                    break;
                } else {
                    zzcfqVar = zzcfqVar.zzf;
                    kotlin.jvm.internal.Intrinsics.checkNotNull(zzcfqVar);
                }
            }
            try {
                try {
                    this.zza.zzc(zzcffVar, j2);
                    kotlin.Unit unit = kotlin.Unit.INSTANCE;
                    com.google.android.libraries.places.internal.zzcfe.zza();
                    j -= j2;
                } catch (java.io.IOException e) {
                    com.google.android.libraries.places.internal.zzcfe.zza();
                    throw e;
                }
            } catch (java.lang.Throwable th) {
                com.google.android.libraries.places.internal.zzcfe.zza();
                throw th;
            }
        }
    }

    zzcfc(com.google.android.libraries.places.internal.zzcfe zzcfeVar, com.google.android.libraries.places.internal.zzcft zzcftVar) {
        this.zza = zzcftVar;
    }
}
