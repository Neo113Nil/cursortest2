package com.google.android.libraries.places.internal;

/* loaded from: classes4.dex */
public final class zzbfx extends java.lang.RuntimeException {
    public zzbfx(com.google.android.libraries.places.internal.zzbex zzbexVar) {
        super("Message was missing required fields.  (Lite runtime could not determine which fields were missing).");
    }

    public final com.google.android.libraries.places.internal.zzbed zza() {
        return new com.google.android.libraries.places.internal.zzbed(getMessage());
    }
}
