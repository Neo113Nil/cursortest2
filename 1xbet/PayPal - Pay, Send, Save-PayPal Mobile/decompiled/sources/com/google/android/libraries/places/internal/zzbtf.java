package com.google.android.libraries.places.internal;

/* loaded from: classes.dex */
public final class zzbtf {
    private final java.util.ArrayList zza = new java.util.ArrayList();

    public final java.lang.String toString() {
        return this.zza.toString();
    }

    public final com.google.android.libraries.places.internal.zzbtf zza(@javax.annotation.Nullable java.lang.Object obj) {
        this.zza.add(java.lang.String.valueOf(obj));
        return this;
    }

    public final com.google.android.libraries.places.internal.zzbtf zzb(java.lang.String str, @javax.annotation.Nullable java.lang.Object obj) {
        java.lang.String valueOf = java.lang.String.valueOf(obj);
        java.lang.StringBuilder sb = new java.lang.StringBuilder(str.length() + 1 + java.lang.String.valueOf(valueOf).length());
        sb.append(str);
        sb.append("=");
        sb.append(valueOf);
        this.zza.add(sb.toString());
        return this;
    }
}
