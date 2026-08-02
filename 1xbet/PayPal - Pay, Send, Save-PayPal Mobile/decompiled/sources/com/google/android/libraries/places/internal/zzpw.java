package com.google.android.libraries.places.internal;

/* loaded from: classes8.dex */
public final class zzpw {
    private final com.google.android.libraries.places.internal.zzane zza;
    private final java.util.List zzb;
    private final boolean zzc;
    private final boolean zzd;
    private final com.google.android.libraries.places.internal.zzamz zze;
    private final com.google.android.libraries.places.internal.zzanj zzf;
    private com.google.android.libraries.places.internal.zzpu zzg;
    private final com.google.android.libraries.places.internal.zzapa zzh;
    private com.google.android.libraries.places.internal.zzang zzi;

    public zzpw(com.google.android.libraries.places.internal.zzane zzaneVar, java.util.List list, boolean z, boolean z2, com.google.android.libraries.places.internal.zzamz zzamzVar, com.google.android.libraries.places.internal.zzanj zzanjVar, android.content.Context context, int i) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(zzaneVar, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(list, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(zzamzVar, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(zzanjVar, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(context, "");
        this.zza = zzaneVar;
        this.zzb = list;
        this.zzc = z;
        this.zzd = z2;
        this.zze = zzamzVar;
        this.zzf = zzanjVar;
        this.zzh = com.google.android.libraries.places.internal.zzox.zza(context, i);
        this.zzi = com.google.android.libraries.places.internal.zzang.UNDEFINED;
    }

    private final void zzg(int i) {
        com.google.android.libraries.places.internal.zzamx zza = com.google.android.libraries.places.internal.zzanh.zza();
        zza.zzi(i);
        zza.zza(this.zza);
        zza.zzb(this.zzb);
        zza.zzc(this.zzi);
        zza.zzd(this.zzc);
        zza.zze(this.zzd);
        zza.zzf(this.zze);
        zza.zzg(this.zzf);
        zza.zzh(this.zzh);
        com.google.android.libraries.places.internal.zzbdq zzG = zza.zzG();
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(zzG, "");
        com.google.android.libraries.places.internal.zzanh zzanhVar = (com.google.android.libraries.places.internal.zzanh) zzG;
        com.google.android.libraries.places.internal.zzpu zzpuVar = this.zzg;
        if (zzpuVar != null) {
            zzpuVar.zzc(zzanhVar);
        }
    }

    public final void zzc() {
        zzg(2);
    }

    public final void zzd() {
        zzg(3);
    }

    public final void zze() {
        zzg(4);
    }

    public final void zzf() {
        zzg(5);
    }

    public final void zzb(com.google.android.libraries.places.internal.zzang zzangVar) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(zzangVar, "");
        this.zzi = zzangVar;
    }

    public final void zza(com.google.android.libraries.places.internal.zzpu zzpuVar) {
        this.zzg = zzpuVar;
    }
}
