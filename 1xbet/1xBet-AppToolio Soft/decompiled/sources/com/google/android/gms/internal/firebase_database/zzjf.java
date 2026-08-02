package com.google.android.gms.internal.firebase_database;

/* loaded from: classes.dex */
public final class zzjf extends zzis {
    private static final zzjf zzsn = new zzjf();

    private zzjf() {
    }

    public static zzjf zzgf() {
        return zzsn;
    }

    @Override // java.util.Comparator
    public final /* synthetic */ int compare(zziz zzizVar, zziz zzizVar2) {
        zziz zzizVar3 = zzizVar;
        zziz zzizVar4 = zzizVar2;
        zzja zzfl = zzizVar3.zzd().zzfl();
        zzja zzfl2 = zzizVar4.zzd().zzfl();
        zzid zzge = zzizVar3.zzge();
        zzid zzge2 = zzizVar4.zzge();
        int compareTo = zzfl.compareTo(zzfl2);
        return compareTo != 0 ? compareTo : zzge.compareTo(zzge2);
    }

    @Override // java.util.Comparator
    public final boolean equals(Object obj) {
        return obj instanceof zzjf;
    }

    public final int hashCode() {
        return 3155577;
    }

    public final String toString() {
        return "PriorityIndex";
    }

    @Override // com.google.android.gms.internal.firebase_database.zzis
    public final zziz zzf(zzid zzidVar, zzja zzjaVar) {
        return new zziz(zzidVar, new zzji("[PRIORITY-POST]", zzjaVar));
    }

    @Override // com.google.android.gms.internal.firebase_database.zzis
    public final zziz zzfw() {
        return zzf(zzid.zzfd(), zzja.zzsi);
    }

    @Override // com.google.android.gms.internal.firebase_database.zzis
    public final String zzfx() {
        throw new IllegalArgumentException("Can't get query definition on priority index!");
    }

    @Override // com.google.android.gms.internal.firebase_database.zzis
    public final boolean zzi(zzja zzjaVar) {
        return !zzjaVar.zzfl().isEmpty();
    }
}
