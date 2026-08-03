package com.google.android.gms.internal.auth;

/* compiled from: com.google.android.gms:play-services-auth-base@@18.0.10 */
/* loaded from: classes4.dex */
public final class zzgy extends java.lang.RuntimeException {
    public zzgy(com.google.android.gms.internal.auth.zzfx zzfxVar) {
        super("Message was missing required fields.  (Lite runtime could not determine which fields were missing).");
    }

    public final com.google.android.gms.internal.auth.zzfb zza() {
        return new com.google.android.gms.internal.auth.zzfb(getMessage());
    }
}
