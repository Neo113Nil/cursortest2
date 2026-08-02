package com.google.android.gms.internal.ads;

import java.io.Closeable;

/* loaded from: classes.dex */
public final class zzaqm extends zzhdr implements Closeable {
    static {
        zzhdy.zzb(zzaqm.class);
    }

    public zzaqm(zzhds zzhdsVar, zzaql zzaqlVar) {
        zze(zzhdsVar, zzhdsVar.zzc(), zzaqlVar);
    }

    @Override // com.google.android.gms.internal.ads.zzhdr, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
    }

    @Override // com.google.android.gms.internal.ads.zzhdr
    public final String toString() {
        String obj = this.zzc.toString();
        StringBuilder sb = new StringBuilder(String.valueOf(obj).length() + 7);
        sb.append("model(");
        sb.append(obj);
        sb.append(")");
        return sb.toString();
    }
}
