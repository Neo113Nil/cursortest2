package com.google.android.gms.internal.fido;

/* loaded from: classes8.dex */
public final class zzfi {
    private static final java.util.Comparator zza = new com.google.android.gms.internal.fido.zzfa();
    private static final java.util.Comparator zzb = new com.google.android.gms.internal.fido.zzfb();
    private static final com.google.android.gms.internal.fido.zzfi zzc = new com.google.android.gms.internal.fido.zzfi(new com.google.android.gms.internal.fido.zzfg(java.util.Collections.emptyList()));
    private final com.google.android.gms.internal.fido.zzfg zzd;

    public final boolean equals(@org.checkerframework.checker.nullness.compatqual.NullableDecl java.lang.Object obj) {
        return (obj instanceof com.google.android.gms.internal.fido.zzfi) && ((com.google.android.gms.internal.fido.zzfi) obj).zzd.equals(this.zzd);
    }

    public final int hashCode() {
        return ~this.zzd.hashCode();
    }

    public final java.lang.String toString() {
        return this.zzd.toString();
    }

    public static com.google.android.gms.internal.fido.zzfi zza() {
        return zzc;
    }

    private zzfi(com.google.android.gms.internal.fido.zzfg zzfgVar) {
        this.zzd = zzfgVar;
    }
}
