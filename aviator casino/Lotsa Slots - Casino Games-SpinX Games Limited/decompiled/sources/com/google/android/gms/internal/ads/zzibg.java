package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@25.2.0 */
/* loaded from: classes4.dex */
public class zzibg {
    @java.lang.Deprecated
    public zzibg() {
    }

    public final java.lang.String toString() {
        try {
            java.lang.StringBuilder sb = new java.lang.StringBuilder();
            com.google.android.gms.internal.ads.zzicf zzicfVar = new com.google.android.gms.internal.ads.zzicf(com.google.android.gms.internal.ads.zzica.zza(sb));
            zzicfVar.zza(com.google.android.gms.internal.ads.zzibl.LENIENT);
            com.google.android.gms.internal.ads.zzicb.zza.zza(zzicfVar, this);
            return sb.toString();
        } catch (java.io.IOException e) {
            throw new java.lang.AssertionError(e);
        }
    }

    public java.lang.String zzd() {
        throw new java.lang.UnsupportedOperationException(getClass().getSimpleName());
    }

    public final com.google.android.gms.internal.ads.zzibi zze() {
        if (this instanceof com.google.android.gms.internal.ads.zzibi) {
            return (com.google.android.gms.internal.ads.zzibi) this;
        }
        throw new java.lang.IllegalStateException("Not a JSON Object: ".concat(toString()));
    }

    public final com.google.android.gms.internal.ads.zzibf zzf() {
        if (this instanceof com.google.android.gms.internal.ads.zzibf) {
            return (com.google.android.gms.internal.ads.zzibf) this;
        }
        throw new java.lang.IllegalStateException("Not a JSON Array: ".concat(toString()));
    }

    public final com.google.android.gms.internal.ads.zzibk zzg() {
        if (this instanceof com.google.android.gms.internal.ads.zzibk) {
            return (com.google.android.gms.internal.ads.zzibk) this;
        }
        throw new java.lang.IllegalStateException("Not a JSON Primitive: ".concat(toString()));
    }
}
