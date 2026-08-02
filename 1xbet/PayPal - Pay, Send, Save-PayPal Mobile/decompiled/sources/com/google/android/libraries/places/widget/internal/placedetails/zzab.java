package com.google.android.libraries.places.widget.internal.placedetails;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes8.dex */
public final class zzab {
    public static final com.google.android.libraries.places.widget.internal.placedetails.zzab zza;
    public static final com.google.android.libraries.places.widget.internal.placedetails.zzab zzb;
    public static final com.google.android.libraries.places.widget.internal.placedetails.zzab zzc;
    private static final /* synthetic */ com.google.android.libraries.places.widget.internal.placedetails.zzab[] zzd;

    static {
        com.google.android.libraries.places.widget.internal.placedetails.zzab zzabVar = new com.google.android.libraries.places.widget.internal.placedetails.zzab("PLACE_DETAILS_COMPACT", 0);
        zza = zzabVar;
        com.google.android.libraries.places.widget.internal.placedetails.zzab zzabVar2 = new com.google.android.libraries.places.widget.internal.placedetails.zzab("PLACE_DETAILS_FULL", 1);
        zzb = zzabVar2;
        com.google.android.libraries.places.widget.internal.placedetails.zzab zzabVar3 = new com.google.android.libraries.places.widget.internal.placedetails.zzab("PLACE_SEARCH", 2);
        zzc = zzabVar3;
        com.google.android.libraries.places.widget.internal.placedetails.zzab[] zzabVarArr = {zzabVar, zzabVar2, zzabVar3};
        zzd = zzabVarArr;
        kotlin.enums.EnumEntriesKt.enumEntries(zzabVarArr);
    }

    private zzab(java.lang.String str, int i) {
    }

    public static com.google.android.libraries.places.widget.internal.placedetails.zzab[] values() {
        return (com.google.android.libraries.places.widget.internal.placedetails.zzab[]) zzd.clone();
    }

    public static com.google.android.libraries.places.widget.internal.placedetails.zzab valueOf(java.lang.String str) {
        return (com.google.android.libraries.places.widget.internal.placedetails.zzab) java.lang.Enum.valueOf(com.google.android.libraries.places.widget.internal.placedetails.zzab.class, str);
    }
}
