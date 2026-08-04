package com.google.android.gms.internal.ads;

import java.io.Closeable;

/* JADX INFO: loaded from: classes.dex */
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
        String string = this.zzc.toString();
        StringBuilder sb = new StringBuilder(String.valueOf(string).length() + 7);
        sb.append("model(");
        sb.append(string);
        sb.append(")");
        return sb.toString();
    }
}
