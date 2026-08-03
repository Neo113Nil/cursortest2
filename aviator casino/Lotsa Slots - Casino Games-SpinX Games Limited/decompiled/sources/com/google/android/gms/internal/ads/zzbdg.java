package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@25.2.0 */
/* loaded from: classes4.dex */
public final class zzbdg {
    private final java.util.Map zza = new java.util.HashMap();

    public final java.util.concurrent.atomic.AtomicReference zza(java.lang.String str) {
        synchronized (this) {
            java.util.Map map = this.zza;
            if (!map.containsKey(str)) {
                map.put(str, new java.util.concurrent.atomic.AtomicReference());
            }
        }
        return (java.util.concurrent.atomic.AtomicReference) this.zza.get(str);
    }
}
