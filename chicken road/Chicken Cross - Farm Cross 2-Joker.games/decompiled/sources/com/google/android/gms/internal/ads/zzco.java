package com.google.android.gms.internal.ads;

import io.ktor.sse.ServerSentEventKt;

/* compiled from: com.google.android.gms:play-services-ads@@25.4.0 */
/* loaded from: classes9.dex */
public final class zzco extends Exception {
    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public zzco(String str, zzcl zzclVar) {
        super(r2.toString());
        String valueOf = String.valueOf(zzclVar);
        StringBuilder sb = new StringBuilder(str.length() + 1 + String.valueOf(valueOf).length());
        sb.append(str);
        sb.append(ServerSentEventKt.SPACE);
        sb.append(valueOf);
    }
}
