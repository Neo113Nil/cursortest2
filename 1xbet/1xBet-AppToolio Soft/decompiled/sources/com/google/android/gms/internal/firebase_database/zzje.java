package com.google.android.gms.internal.firebase_database;

/* loaded from: classes.dex */
public final class zzje extends zzis {
    private final zzch zzsm;

    public zzje(zzch zzchVar) {
        if (zzchVar.size() == 1 && zzchVar.zzbw().zzfh()) {
            throw new IllegalArgumentException("Can't create PathIndex with '.priority' as key. Please use PriorityIndex instead!");
        }
        this.zzsm = zzchVar;
    }

    @Override // java.util.Comparator
    public final /* synthetic */ int compare(zziz zzizVar, zziz zzizVar2) {
        zziz zzizVar3 = zzizVar;
        zziz zzizVar4 = zzizVar2;
        int compareTo = zzizVar3.zzd().zzam(this.zzsm).compareTo(zzizVar4.zzd().zzam(this.zzsm));
        return compareTo == 0 ? zzizVar3.zzge().compareTo(zzizVar4.zzge()) : compareTo;
    }

    @Override // java.util.Comparator
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return obj != null && getClass() == obj.getClass() && this.zzsm.equals(((zzje) obj).zzsm);
    }

    public final int hashCode() {
        return this.zzsm.hashCode();
    }

    @Override // com.google.android.gms.internal.firebase_database.zzis
    public final zziz zzf(zzid zzidVar, zzja zzjaVar) {
        return new zziz(zzidVar, zzir.zzfv().zzl(this.zzsm, zzjaVar));
    }

    @Override // com.google.android.gms.internal.firebase_database.zzis
    public final zziz zzfw() {
        return new zziz(zzid.zzfd(), zzir.zzfv().zzl(this.zzsm, zzja.zzsi));
    }

    @Override // com.google.android.gms.internal.firebase_database.zzis
    public final String zzfx() {
        return this.zzsm.zzbu();
    }

    @Override // com.google.android.gms.internal.firebase_database.zzis
    public final boolean zzi(zzja zzjaVar) {
        return !zzjaVar.zzam(this.zzsm).isEmpty();
    }
}
