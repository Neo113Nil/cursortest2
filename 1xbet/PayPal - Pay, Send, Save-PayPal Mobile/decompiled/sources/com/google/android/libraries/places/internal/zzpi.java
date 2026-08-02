package com.google.android.libraries.places.internal;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes8.dex */
public final class zzpi {
    public static final com.google.android.libraries.places.internal.zzpi zza;
    public static final com.google.android.libraries.places.internal.zzpi zzb;
    public static final com.google.android.libraries.places.internal.zzpi zzc;
    public static final com.google.android.libraries.places.internal.zzpi zzd;
    private static final /* synthetic */ com.google.android.libraries.places.internal.zzpi[] zze;

    static {
        com.google.android.libraries.places.internal.zzpi zzpiVar = new com.google.android.libraries.places.internal.zzpi("REVIEWS_ARENT_VERIFIED", 0);
        zza = zzpiVar;
        com.google.android.libraries.places.internal.zzpi zzpiVar2 = new com.google.android.libraries.places.internal.zzpi("ABOUT_RESULTS", 1);
        zzb = zzpiVar2;
        com.google.android.libraries.places.internal.zzpi zzpiVar3 = new com.google.android.libraries.places.internal.zzpi("REVIEW_ORDERING", 2);
        zzc = zzpiVar3;
        com.google.android.libraries.places.internal.zzpi zzpiVar4 = new com.google.android.libraries.places.internal.zzpi("REPORT_BUSINESS_CONDUCT", 3);
        zzd = zzpiVar4;
        com.google.android.libraries.places.internal.zzpi[] zzpiVarArr = {zzpiVar, zzpiVar2, zzpiVar3, zzpiVar4};
        zze = zzpiVarArr;
        kotlin.enums.EnumEntriesKt.enumEntries(zzpiVarArr);
    }

    private zzpi(java.lang.String str, int i) {
    }

    public static com.google.android.libraries.places.internal.zzpi[] values() {
        return (com.google.android.libraries.places.internal.zzpi[]) zze.clone();
    }

    public static com.google.android.libraries.places.internal.zzpi valueOf(java.lang.String str) {
        return (com.google.android.libraries.places.internal.zzpi) java.lang.Enum.valueOf(com.google.android.libraries.places.internal.zzpi.class, str);
    }
}
