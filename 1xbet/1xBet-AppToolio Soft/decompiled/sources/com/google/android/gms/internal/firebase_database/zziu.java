package com.google.android.gms.internal.firebase_database;

/* loaded from: classes.dex */
public final class zziu extends zzis {
    private static final zziu zzrz = new zziu();

    private zziu() {
    }

    public static zziu zzgb() {
        return zzrz;
    }

    @Override // java.util.Comparator
    public final /* synthetic */ int compare(zziz zzizVar, zziz zzizVar2) {
        return zzizVar.zzge().compareTo(zzizVar2.zzge());
    }

    @Override // java.util.Comparator
    public final boolean equals(Object obj) {
        return obj instanceof zziu;
    }

    public final int hashCode() {
        return 37;
    }

    public final String toString() {
        return "KeyIndex";
    }

    @Override // com.google.android.gms.internal.firebase_database.zzis
    public final zziz zzf(zzid zzidVar, zzja zzjaVar) {
        return new zziz(zzid.zzt((String) zzjaVar.getValue()), zzir.zzfv());
    }

    @Override // com.google.android.gms.internal.firebase_database.zzis
    public final zziz zzfw() {
        return zziz.zzgd();
    }

    @Override // com.google.android.gms.internal.firebase_database.zzis
    public final String zzfx() {
        return ".key";
    }

    @Override // com.google.android.gms.internal.firebase_database.zzis
    public final boolean zzi(zzja zzjaVar) {
        return true;
    }
}
