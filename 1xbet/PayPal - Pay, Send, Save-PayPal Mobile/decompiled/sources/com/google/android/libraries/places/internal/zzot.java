package com.google.android.libraries.places.internal;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes8.dex */
public final class zzot {
    public static final com.google.android.libraries.places.internal.zzot zza;
    public static final com.google.android.libraries.places.internal.zzot zzb;
    public static final com.google.android.libraries.places.internal.zzot zzc;
    private static final /* synthetic */ com.google.android.libraries.places.internal.zzot[] zzf;
    private final int zzd;
    private final int zze;

    static {
        com.google.android.libraries.places.internal.zzot zzotVar = new com.google.android.libraries.places.internal.zzot("WHITE", 0, 0, com.google.android.libraries.places.R.color.place_details_attribution_color_white);
        zza = zzotVar;
        com.google.android.libraries.places.internal.zzot zzotVar2 = new com.google.android.libraries.places.internal.zzot("GRAY", 1, 1, com.google.android.libraries.places.R.color.place_details_attribution_color_gray);
        zzb = zzotVar2;
        com.google.android.libraries.places.internal.zzot zzotVar3 = new com.google.android.libraries.places.internal.zzot("BLACK", 2, 2, com.google.android.libraries.places.R.color.place_details_attribution_color_black);
        zzc = zzotVar3;
        com.google.android.libraries.places.internal.zzot[] zzotVarArr = {zzotVar, zzotVar2, zzotVar3};
        zzf = zzotVarArr;
        kotlin.enums.EnumEntriesKt.enumEntries(zzotVarArr);
    }

    private zzot(java.lang.String str, int i, int i2, int i3) {
        this.zzd = i2;
        this.zze = i3;
    }

    public final int zzb() {
        return this.zze;
    }

    public final int zza() {
        return this.zzd;
    }

    public static com.google.android.libraries.places.internal.zzot[] values() {
        return (com.google.android.libraries.places.internal.zzot[]) zzf.clone();
    }

    public static com.google.android.libraries.places.internal.zzot valueOf(java.lang.String str) {
        return (com.google.android.libraries.places.internal.zzot) java.lang.Enum.valueOf(com.google.android.libraries.places.internal.zzot.class, str);
    }
}
