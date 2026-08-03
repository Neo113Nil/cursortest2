package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads-api@@25.2.0 */
/* loaded from: classes4.dex */
public final class zzigs extends java.lang.RuntimeException {
    public zzigs(com.google.android.gms.internal.ads.zzifp zzifpVar) {
        super("Message was missing required fields.  (Lite runtime could not determine which fields were missing).");
    }

    public final com.google.android.gms.internal.ads.zziet zza() {
        return new com.google.android.gms.internal.ads.zziet(getMessage());
    }
}
