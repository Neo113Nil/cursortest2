package com.google.android.gms.measurement.internal;

/* compiled from: com.google.android.gms:play-services-measurement@@22.5.0 */
/* loaded from: classes4.dex */
final class zzac extends com.google.android.gms.measurement.internal.zzab {
    final /* synthetic */ com.google.android.gms.measurement.internal.zzad zza;
    private final com.google.android.gms.internal.measurement.zzfn zzh;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    zzac(com.google.android.gms.measurement.internal.zzad zzadVar, java.lang.String str, int i, com.google.android.gms.internal.measurement.zzfn zzfnVar) {
        super(str, i);
        java.util.Objects.requireNonNull(zzadVar);
        this.zza = zzadVar;
        this.zzh = zzfnVar;
    }

    @Override // com.google.android.gms.measurement.internal.zzab
    final int zza() {
        return this.zzh.zzb();
    }

    @Override // com.google.android.gms.measurement.internal.zzab
    final boolean zzb() {
        return true;
    }

    @Override // com.google.android.gms.measurement.internal.zzab
    final boolean zzc() {
        return false;
    }

    final boolean zzd(java.lang.Long l, java.lang.Long l2, com.google.android.gms.internal.measurement.zziu zziuVar, boolean z) {
        com.google.android.gms.internal.measurement.zzpq.zza();
        com.google.android.gms.measurement.internal.zzib zzibVar = this.zza.zzu;
        boolean zzp = zzibVar.zzc().zzp(this.zzb, com.google.android.gms.measurement.internal.zzfx.zzaD);
        com.google.android.gms.internal.measurement.zzfn zzfnVar = this.zzh;
        boolean zze = zzfnVar.zze();
        boolean zzf = zzfnVar.zzf();
        boolean zzh = zzfnVar.zzh();
        boolean z2 = zze || zzf || zzh;
        java.lang.Boolean bool = null;
        bool = null;
        bool = null;
        bool = null;
        bool = null;
        if (z && !z2) {
            zzibVar.zzaV().zzk().zzc("Property filter already evaluated true and it is not associated with an enhanced audience. audience ID, filter ID", java.lang.Integer.valueOf(this.zzc), zzfnVar.zza() ? java.lang.Integer.valueOf(zzfnVar.zzb()) : null);
            return true;
        }
        com.google.android.gms.internal.measurement.zzfh zzd = zzfnVar.zzd();
        boolean zzf2 = zzd.zzf();
        if (zziuVar.zzf()) {
            if (zzd.zzc()) {
                bool = zze(zzg(zziuVar.zzg(), zzd.zzd()), zzf2);
            } else {
                zzibVar.zzaV().zze().zzb("No number filter for long property. property", zzibVar.zzl().zzc(zziuVar.zzc()));
            }
        } else if (zziuVar.zzj()) {
            if (zzd.zzc()) {
                bool = zze(zzh(zziuVar.zzk(), zzd.zzd()), zzf2);
            } else {
                zzibVar.zzaV().zze().zzb("No number filter for double property. property", zzibVar.zzl().zzc(zziuVar.zzc()));
            }
        } else if (!zziuVar.zzd()) {
            zzibVar.zzaV().zze().zzb("User property has no value, property", zzibVar.zzl().zzc(zziuVar.zzc()));
        } else if (zzd.zza()) {
            bool = zze(zzf(zziuVar.zze(), zzd.zzb(), zzibVar.zzaV()), zzf2);
        } else if (!zzd.zzc()) {
            zzibVar.zzaV().zze().zzb("No string or number filter defined. property", zzibVar.zzl().zzc(zziuVar.zzc()));
        } else if (com.google.android.gms.measurement.internal.zzpj.zzm(zziuVar.zze())) {
            bool = zze(zzi(zziuVar.zze(), zzd.zzd()), zzf2);
        } else {
            zzibVar.zzaV().zze().zzc("Invalid user property value for Numeric number filter. property, value", zzibVar.zzl().zzc(zziuVar.zzc()), zziuVar.zze());
        }
        zzibVar.zzaV().zzk().zzb("Property filter result", bool == null ? kotlinx.serialization.json.internal.AbstractJsonLexerKt.NULL : bool);
        if (bool == null) {
            return false;
        }
        this.zzd = true;
        if (zzh && !bool.booleanValue()) {
            return true;
        }
        if (!z || zzfnVar.zze()) {
            this.zze = bool;
        }
        if (bool.booleanValue() && z2 && zziuVar.zza()) {
            long zzb = zziuVar.zzb();
            if (l != null) {
                zzb = l.longValue();
            }
            if (zzp && zzfnVar.zze() && !zzfnVar.zzf() && l2 != null) {
                zzb = l2.longValue();
            }
            if (zzfnVar.zzf()) {
                this.zzg = java.lang.Long.valueOf(zzb);
            } else {
                this.zzf = java.lang.Long.valueOf(zzb);
            }
        }
        return true;
    }
}
