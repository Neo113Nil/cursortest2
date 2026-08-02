package com.google.android.libraries.places.internal;

/* loaded from: classes4.dex */
public final class zzcfd implements com.google.android.libraries.places.internal.zzcfv {
    final /* synthetic */ com.google.android.libraries.places.internal.zzcfv zza;

    @Override // com.google.android.libraries.places.internal.zzcfv, java.io.Closeable, java.lang.AutoCloseable
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

    public final java.lang.String toString() {
        com.google.android.libraries.places.internal.zzcfv zzcfvVar = this.zza;
        java.lang.StringBuilder sb = new java.lang.StringBuilder(zzcfvVar.toString().length() + 21);
        sb.append("AsyncTimeout.source(");
        sb.append(zzcfvVar);
        sb.append(")");
        return sb.toString();
    }

    @Override // com.google.android.libraries.places.internal.zzcfv
    public final long zza(com.google.android.libraries.places.internal.zzcff zzcffVar, long j) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(zzcffVar, "");
        try {
            try {
                return this.zza.zza(zzcffVar, j);
            } catch (java.io.IOException e) {
                com.google.android.libraries.places.internal.zzcfe.zza();
                throw e;
            }
        } finally {
            com.google.android.libraries.places.internal.zzcfe.zza();
        }
    }

    zzcfd(com.google.android.libraries.places.internal.zzcfe zzcfeVar, com.google.android.libraries.places.internal.zzcfv zzcfvVar) {
        this.zza = zzcfvVar;
    }
}
