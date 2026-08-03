package com.google.android.gms.ads.mediation.customevent;

/* compiled from: com.google.android.gms:play-services-ads-api@@25.2.0 */
@java.lang.Deprecated
/* loaded from: classes3.dex */
public final class CustomEventExtras {
    private final java.util.HashMap zza = new java.util.HashMap();

    public java.lang.Object getExtra(java.lang.String str) {
        return this.zza.get(str);
    }

    public void setExtra(java.lang.String str, java.lang.Object obj) {
        this.zza.put(str, obj);
    }
}
