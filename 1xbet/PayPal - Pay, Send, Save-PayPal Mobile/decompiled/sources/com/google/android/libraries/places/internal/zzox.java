package com.google.android.libraries.places.internal;

/* loaded from: classes8.dex */
public final class zzox {
    public static final com.google.android.libraries.places.internal.zzapa zza(android.content.Context context, int i) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(context, "");
        com.google.android.libraries.places.internal.zzaoz zzg = com.google.android.libraries.places.internal.zzapa.zzg();
        zzg.zza(com.google.android.libraries.places.internal.zzoy.zzb(context, i));
        zzg.zzb(com.google.android.libraries.places.internal.zzoy.zzf(context, i));
        boolean z = true;
        if (!com.google.android.libraries.places.internal.zzoy.zzc(context, i) && !com.google.android.libraries.places.internal.zzoy.zze(context, i)) {
            z = false;
        }
        zzg.zzc(z);
        zzg.zzd(com.google.android.libraries.places.internal.zzoy.zzd(context, i));
        zzg.zze(com.google.android.libraries.places.internal.zzoy.zza(context, i));
        com.google.android.libraries.places.internal.zzbdq zzG = zzg.zzG();
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(zzG, "");
        return (com.google.android.libraries.places.internal.zzapa) zzG;
    }
}
