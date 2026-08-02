package com.google.android.libraries.places.widget.internal.placedetails;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes8.dex */
final class zzae {
    public static final com.google.android.libraries.places.widget.internal.placedetails.zzae zza;
    public static final com.google.android.libraries.places.widget.internal.placedetails.zzae zzb;
    public static final com.google.android.libraries.places.widget.internal.placedetails.zzae zzc;
    public static final com.google.android.libraries.places.widget.internal.placedetails.zzae zzd;
    public static final com.google.android.libraries.places.widget.internal.placedetails.zzae zze;
    public static final com.google.android.libraries.places.widget.internal.placedetails.zzae zzf;
    private static final /* synthetic */ com.google.android.libraries.places.widget.internal.placedetails.zzae[] zzg;

    static {
        com.google.android.libraries.places.widget.internal.placedetails.zzae zzaeVar = new com.google.android.libraries.places.widget.internal.placedetails.zzae("UNKNOWN", 0);
        zza = zzaeVar;
        com.google.android.libraries.places.widget.internal.placedetails.zzae zzaeVar2 = new com.google.android.libraries.places.widget.internal.placedetails.zzae("OPEN_NOW", 1);
        zzb = zzaeVar2;
        com.google.android.libraries.places.widget.internal.placedetails.zzae zzaeVar3 = new com.google.android.libraries.places.widget.internal.placedetails.zzae("OPEN_24_HOURS", 2);
        zzc = zzaeVar3;
        com.google.android.libraries.places.widget.internal.placedetails.zzae zzaeVar4 = new com.google.android.libraries.places.widget.internal.placedetails.zzae("CLOSED", 3);
        zzd = zzaeVar4;
        com.google.android.libraries.places.widget.internal.placedetails.zzae zzaeVar5 = new com.google.android.libraries.places.widget.internal.placedetails.zzae("TEMPORARILY_CLOSED", 4);
        zze = zzaeVar5;
        com.google.android.libraries.places.widget.internal.placedetails.zzae zzaeVar6 = new com.google.android.libraries.places.widget.internal.placedetails.zzae("PERMANENTLY_CLOSED", 5);
        zzf = zzaeVar6;
        com.google.android.libraries.places.widget.internal.placedetails.zzae[] zzaeVarArr = {zzaeVar, zzaeVar2, zzaeVar3, zzaeVar4, zzaeVar5, zzaeVar6};
        zzg = zzaeVarArr;
        kotlin.enums.EnumEntriesKt.enumEntries(zzaeVarArr);
    }

    private zzae(java.lang.String str, int i) {
    }

    public static com.google.android.libraries.places.widget.internal.placedetails.zzae[] values() {
        return (com.google.android.libraries.places.widget.internal.placedetails.zzae[]) zzg.clone();
    }

    public static com.google.android.libraries.places.widget.internal.placedetails.zzae valueOf(java.lang.String str) {
        return (com.google.android.libraries.places.widget.internal.placedetails.zzae) java.lang.Enum.valueOf(com.google.android.libraries.places.widget.internal.placedetails.zzae.class, str);
    }
}
