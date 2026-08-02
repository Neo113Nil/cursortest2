package com.google.android.gms.internal.auth;

/* loaded from: classes8.dex */
public final class zzgy extends java.lang.RuntimeException {
    public zzgy(com.google.android.gms.internal.auth.zzfx zzfxVar) {
        super("Message was missing required fields.  (Lite runtime could not determine which fields were missing).");
    }

    public final com.google.android.gms.internal.auth.zzfb zza() {
        return new com.google.android.gms.internal.auth.zzfb(getMessage());
    }
}
