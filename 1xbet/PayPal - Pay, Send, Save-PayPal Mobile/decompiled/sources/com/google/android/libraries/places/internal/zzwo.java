package com.google.android.libraries.places.internal;

/* loaded from: classes8.dex */
public final class zzwo {
    public static final /* synthetic */ int zza = 0;
    private static final java.util.Comparator zzb = new com.google.android.libraries.places.internal.zzwh();
    private static final com.google.android.libraries.places.internal.zzwo zzc = new com.google.android.libraries.places.internal.zzwo(new com.google.android.libraries.places.internal.zzwm(java.util.Collections.emptyList()));
    private final com.google.android.libraries.places.internal.zzwm zzd;

    public final boolean equals(java.lang.Object obj) {
        return (obj instanceof com.google.android.libraries.places.internal.zzwo) && ((com.google.android.libraries.places.internal.zzwo) obj).zzd.equals(this.zzd);
    }

    public final int hashCode() {
        return ~this.zzd.hashCode();
    }

    public final java.lang.String toString() {
        return this.zzd.toString();
    }

    public final boolean zzc() {
        return this.zzd.isEmpty();
    }

    public final com.google.android.libraries.places.internal.zzwo zzd(com.google.android.libraries.places.internal.zzwo zzwoVar) {
        com.google.android.libraries.places.internal.zzwm zzwmVar = zzwoVar.zzd;
        if (zzwmVar.isEmpty()) {
            return this;
        }
        com.google.android.libraries.places.internal.zzwm zzwmVar2 = this.zzd;
        return zzwmVar2.isEmpty() ? zzwoVar : new com.google.android.libraries.places.internal.zzwo(new com.google.android.libraries.places.internal.zzwm(zzwmVar2, zzwmVar));
    }

    public final java.util.Map zzb() {
        return this.zzd;
    }

    public static com.google.android.libraries.places.internal.zzwo zza() {
        return zzc;
    }

    private zzwo(com.google.android.libraries.places.internal.zzwm zzwmVar) {
        this.zzd = zzwmVar;
    }
}
