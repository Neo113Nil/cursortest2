package com.google.android.libraries.places.internal;

/* loaded from: classes4.dex */
final class zzbpc extends com.google.android.libraries.places.internal.zzbiv {
    private final com.google.android.libraries.places.internal.zzbpd zza;

    zzbpc(com.google.android.libraries.places.internal.zzbpd zzbpdVar, com.google.android.libraries.places.internal.zzcag zzcagVar) {
        this.zza = (com.google.android.libraries.places.internal.zzbpd) com.google.common.base.Preconditions.checkNotNull(zzbpdVar, "tracer");
    }

    static void zzc(com.google.android.libraries.places.internal.zzbku zzbkuVar, int i, java.lang.String str) {
        java.util.logging.Level zzf = zzf(i);
        if (com.google.android.libraries.places.internal.zzbpd.zza.isLoggable(zzf)) {
            com.google.android.libraries.places.internal.zzbpd.zzc(zzbkuVar, zzf, str);
        }
    }

    static void zzd(com.google.android.libraries.places.internal.zzbku zzbkuVar, int i, java.lang.String str, java.lang.Object... objArr) {
        java.util.logging.Level zzf = zzf(2);
        if (com.google.android.libraries.places.internal.zzbpd.zza.isLoggable(zzf)) {
            com.google.android.libraries.places.internal.zzbpd.zzc(zzbkuVar, zzf, java.text.MessageFormat.format(str, objArr));
        }
    }

    private final boolean zze(int i) {
        if (i == 1) {
            return false;
        }
        this.zza.zzb();
        return false;
    }

    @Override // com.google.android.libraries.places.internal.zzbiv
    public final void zza(int i, java.lang.String str) {
        zzc(this.zza.zzd(), i, str);
        zze(i);
    }

    @Override // com.google.android.libraries.places.internal.zzbiv
    public final void zzb(int i, java.lang.String str, java.lang.Object... objArr) {
        java.util.logging.Level zzf = zzf(i);
        zze(i);
        zza(i, com.google.android.libraries.places.internal.zzbpd.zza.isLoggable(zzf) ? java.text.MessageFormat.format(str, objArr) : null);
    }

    private static java.util.logging.Level zzf(int i) {
        int i2 = i - 1;
        return i2 != 1 ? (i2 == 2 || i2 == 3) ? java.util.logging.Level.FINE : java.util.logging.Level.FINEST : java.util.logging.Level.FINER;
    }
}
