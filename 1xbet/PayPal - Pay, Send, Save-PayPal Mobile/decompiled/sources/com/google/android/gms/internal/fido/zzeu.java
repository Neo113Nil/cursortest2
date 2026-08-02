package com.google.android.gms.internal.fido;

/* loaded from: classes8.dex */
public final class zzeu extends com.google.android.gms.internal.fido.zzei {
    private static final java.util.Set zza;
    private static final com.google.android.gms.internal.fido.zzea zzb;
    private static final com.google.android.gms.internal.fido.zzer zzc;
    private final java.lang.String zzd;
    private final com.google.android.gms.internal.fido.zzdn zze;
    private final java.util.logging.Level zzf;
    private final java.util.Set zzg;
    private final com.google.android.gms.internal.fido.zzea zzh;

    static {
        java.util.Set unmodifiableSet = java.util.Collections.unmodifiableSet(new java.util.HashSet(java.util.Arrays.asList(com.google.android.gms.internal.fido.zzdh.zza, com.google.android.gms.internal.fido.zzdm.zza)));
        zza = unmodifiableSet;
        zzb = com.google.android.gms.internal.fido.zzed.zza(unmodifiableSet).zzd();
        zzc = new com.google.android.gms.internal.fido.zzer(null);
    }

    /* synthetic */ zzeu(java.lang.String str, java.lang.String str2, boolean z, com.google.android.gms.internal.fido.zzdn zzdnVar, java.util.logging.Level level, java.util.Set set, com.google.android.gms.internal.fido.zzea zzeaVar, com.google.android.gms.internal.fido.zzet zzetVar) {
        super(str2);
        if (str2.length() > 23) {
            int i = -1;
            for (int length = str2.length() - 1; length >= 0; length--) {
                char charAt = str2.charAt(length);
                if (charAt == '.' || charAt == '$') {
                    i = length;
                    break;
                }
            }
            str2 = str2.substring(i + 1);
        }
        java.lang.String concat = "".concat(java.lang.String.valueOf(str2));
        this.zzd = concat.substring(0, java.lang.Math.min(concat.length(), 23));
        this.zze = zzdnVar;
        this.zzf = level;
        this.zzg = set;
        this.zzh = zzeaVar;
    }

    public static com.google.android.gms.internal.fido.zzer zzc() {
        return zzc;
    }
}
