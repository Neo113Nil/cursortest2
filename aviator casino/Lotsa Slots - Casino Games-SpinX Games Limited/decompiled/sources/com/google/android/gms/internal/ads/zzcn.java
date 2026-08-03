package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@25.2.0 */
/* loaded from: classes4.dex */
public final class zzcn extends java.lang.Exception {
    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public zzcn(java.lang.String str, com.google.android.gms.internal.ads.zzcl zzclVar) {
        super(r2.toString());
        java.lang.String valueOf = java.lang.String.valueOf(zzclVar);
        java.lang.StringBuilder sb = new java.lang.StringBuilder(str.length() + 1 + java.lang.String.valueOf(valueOf).length());
        sb.append(str);
        sb.append(io.ktor.sse.ServerSentEventKt.SPACE);
        sb.append(valueOf);
    }
}
