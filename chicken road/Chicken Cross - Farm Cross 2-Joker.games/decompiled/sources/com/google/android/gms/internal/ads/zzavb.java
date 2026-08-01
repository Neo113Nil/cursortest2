package com.google.android.gms.internal.ads;

import java.io.Closeable;
import java.io.IOException;

/* compiled from: com.google.android.gms:play-services-ads@@25.4.0 */
/* loaded from: classes9.dex */
public final class zzavb extends zzinh implements Closeable {
    static {
        zzino.zzb(zzavb.class);
    }

    public zzavb(zzini zziniVar, zzava zzavaVar) throws IOException {
        zzd(zziniVar, zziniVar.zzb(), zzavaVar);
    }

    @Override // com.google.android.gms.internal.ads.zzinh, java.io.Closeable, java.lang.AutoCloseable
    public final void close() throws IOException {
    }

    @Override // com.google.android.gms.internal.ads.zzinh
    public final String toString() {
        String obj = this.zzc.toString();
        StringBuilder sb = new StringBuilder(String.valueOf(obj).length() + 7);
        sb.append("model(");
        sb.append(obj);
        sb.append(")");
        return sb.toString();
    }
}
