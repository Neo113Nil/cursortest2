package com.google.android.gms.measurement.internal;

/* compiled from: com.google.android.gms:play-services-measurement-impl@@22.5.0 */
/* loaded from: classes4.dex */
public enum zzjh {
    UNINITIALIZED("uninitialized"),
    POLICY("eu_consent_policy"),
    DENIED("denied"),
    GRANTED("granted");

    private final java.lang.String zze;

    zzjh(java.lang.String str) {
        this.zze = str;
    }

    @Override // java.lang.Enum
    public final java.lang.String toString() {
        return this.zze;
    }
}
