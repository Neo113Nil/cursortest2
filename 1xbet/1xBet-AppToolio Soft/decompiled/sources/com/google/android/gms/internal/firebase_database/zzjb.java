package com.google.android.gms.internal.firebase_database;

/* loaded from: classes.dex */
final class zzjb extends zzif {
    zzjb() {
    }

    @Override // com.google.android.gms.internal.firebase_database.zzif, java.lang.Comparable
    public final /* synthetic */ int compareTo(zzja zzjaVar) {
        return compareTo(zzjaVar);
    }

    @Override // com.google.android.gms.internal.firebase_database.zzif
    public final boolean equals(Object obj) {
        return obj == this;
    }

    @Override // com.google.android.gms.internal.firebase_database.zzif, com.google.android.gms.internal.firebase_database.zzja
    public final boolean isEmpty() {
        return false;
    }

    @Override // com.google.android.gms.internal.firebase_database.zzif
    public final String toString() {
        return "<Max Node>";
    }

    @Override // com.google.android.gms.internal.firebase_database.zzif, com.google.android.gms.internal.firebase_database.zzja
    public final zzja zzfl() {
        return this;
    }

    @Override // com.google.android.gms.internal.firebase_database.zzif
    /* renamed from: zzg */
    public final int compareTo(zzja zzjaVar) {
        return zzjaVar == this ? 0 : 1;
    }

    @Override // com.google.android.gms.internal.firebase_database.zzif, com.google.android.gms.internal.firebase_database.zzja
    public final boolean zzk(zzid zzidVar) {
        return false;
    }

    @Override // com.google.android.gms.internal.firebase_database.zzif, com.google.android.gms.internal.firebase_database.zzja
    public final zzja zzm(zzid zzidVar) {
        return zzidVar.zzfh() ? this : zzir.zzfv();
    }
}
