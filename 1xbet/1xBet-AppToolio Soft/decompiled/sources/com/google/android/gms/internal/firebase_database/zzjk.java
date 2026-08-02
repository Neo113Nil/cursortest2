package com.google.android.gms.internal.firebase_database;

/* loaded from: classes.dex */
public final class zzjk extends zzis {
    private static final zzjk zzsr = new zzjk();

    private zzjk() {
    }

    public static zzjk zzgg() {
        return zzsr;
    }

    @Override // java.util.Comparator
    public final /* synthetic */ int compare(zziz zzizVar, zziz zzizVar2) {
        zziz zzizVar3 = zzizVar;
        zziz zzizVar4 = zzizVar2;
        int compareTo = zzizVar3.zzd().compareTo(zzizVar4.zzd());
        return compareTo == 0 ? zzizVar3.zzge().compareTo(zzizVar4.zzge()) : compareTo;
    }

    @Override // java.util.Comparator
    public final boolean equals(Object obj) {
        return obj instanceof zzjk;
    }

    public final int hashCode() {
        return 4;
    }

    public final String toString() {
        return "ValueIndex";
    }

    @Override // com.google.android.gms.internal.firebase_database.zzis
    public final zziz zzf(zzid zzidVar, zzja zzjaVar) {
        return new zziz(zzidVar, zzjaVar);
    }

    @Override // com.google.android.gms.internal.firebase_database.zzis
    public final zziz zzfw() {
        return new zziz(zzid.zzfd(), zzja.zzsi);
    }

    @Override // com.google.android.gms.internal.firebase_database.zzis
    public final String zzfx() {
        return ".value";
    }

    @Override // com.google.android.gms.internal.firebase_database.zzis
    public final boolean zzi(zzja zzjaVar) {
        return true;
    }
}
