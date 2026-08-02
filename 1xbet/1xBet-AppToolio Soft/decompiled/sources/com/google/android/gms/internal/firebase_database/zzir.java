package com.google.android.gms.internal.firebase_database;

import java.util.Collections;
import java.util.Iterator;

/* loaded from: classes.dex */
public final class zzir extends zzif implements zzja {
    private static final zzir zzrv = new zzir();

    private zzir() {
    }

    public static zzir zzfv() {
        return zzrv;
    }

    @Override // com.google.android.gms.internal.firebase_database.zzif, java.lang.Comparable
    public final /* synthetic */ int compareTo(zzja zzjaVar) {
        return compareTo(zzjaVar);
    }

    @Override // com.google.android.gms.internal.firebase_database.zzif
    public final boolean equals(Object obj) {
        if (obj instanceof zzir) {
            return true;
        }
        if (!(obj instanceof zzja)) {
            return false;
        }
        zzja zzjaVar = (zzja) obj;
        return zzjaVar.isEmpty() && equals(zzjaVar.zzfl());
    }

    @Override // com.google.android.gms.internal.firebase_database.zzif, com.google.android.gms.internal.firebase_database.zzja
    public final int getChildCount() {
        return 0;
    }

    @Override // com.google.android.gms.internal.firebase_database.zzif, com.google.android.gms.internal.firebase_database.zzja
    public final Object getValue() {
        return null;
    }

    @Override // com.google.android.gms.internal.firebase_database.zzif, com.google.android.gms.internal.firebase_database.zzja
    public final Object getValue(boolean z) {
        return null;
    }

    @Override // com.google.android.gms.internal.firebase_database.zzif
    public final int hashCode() {
        return 0;
    }

    @Override // com.google.android.gms.internal.firebase_database.zzif, com.google.android.gms.internal.firebase_database.zzja
    public final boolean isEmpty() {
        return true;
    }

    @Override // com.google.android.gms.internal.firebase_database.zzif, java.lang.Iterable
    public final Iterator<zziz> iterator() {
        return Collections.emptyList().iterator();
    }

    @Override // com.google.android.gms.internal.firebase_database.zzif, com.google.android.gms.internal.firebase_database.zzja
    public final Iterator<zziz> reverseIterator() {
        return Collections.emptyList().iterator();
    }

    @Override // com.google.android.gms.internal.firebase_database.zzif
    public final String toString() {
        return "<Empty Node>";
    }

    @Override // com.google.android.gms.internal.firebase_database.zzif, com.google.android.gms.internal.firebase_database.zzja
    public final String zza(zzjc zzjcVar) {
        return "";
    }

    @Override // com.google.android.gms.internal.firebase_database.zzif, com.google.android.gms.internal.firebase_database.zzja
    public final zzja zzam(zzch zzchVar) {
        return this;
    }

    @Override // com.google.android.gms.internal.firebase_database.zzif, com.google.android.gms.internal.firebase_database.zzja
    public final zzja zze(zzid zzidVar, zzja zzjaVar) {
        return (zzjaVar.isEmpty() || zzidVar.zzfh()) ? this : new zzif().zze(zzidVar, zzjaVar);
    }

    @Override // com.google.android.gms.internal.firebase_database.zzif, com.google.android.gms.internal.firebase_database.zzja
    public final /* bridge */ /* synthetic */ zzja zzf(zzja zzjaVar) {
        return this;
    }

    @Override // com.google.android.gms.internal.firebase_database.zzif, com.google.android.gms.internal.firebase_database.zzja
    public final String zzfj() {
        return "";
    }

    @Override // com.google.android.gms.internal.firebase_database.zzif, com.google.android.gms.internal.firebase_database.zzja
    public final boolean zzfk() {
        return false;
    }

    @Override // com.google.android.gms.internal.firebase_database.zzif, com.google.android.gms.internal.firebase_database.zzja
    public final zzja zzfl() {
        return this;
    }

    @Override // com.google.android.gms.internal.firebase_database.zzif
    /* renamed from: zzg */
    public final int compareTo(zzja zzjaVar) {
        return zzjaVar.isEmpty() ? 0 : -1;
    }

    @Override // com.google.android.gms.internal.firebase_database.zzif, com.google.android.gms.internal.firebase_database.zzja
    public final boolean zzk(zzid zzidVar) {
        return false;
    }

    @Override // com.google.android.gms.internal.firebase_database.zzif, com.google.android.gms.internal.firebase_database.zzja
    public final zzid zzl(zzid zzidVar) {
        return null;
    }

    @Override // com.google.android.gms.internal.firebase_database.zzif, com.google.android.gms.internal.firebase_database.zzja
    public final zzja zzl(zzch zzchVar, zzja zzjaVar) {
        return zzchVar.isEmpty() ? zzjaVar : zze(zzchVar.zzbw(), zzl(zzchVar.zzbx(), zzjaVar));
    }

    @Override // com.google.android.gms.internal.firebase_database.zzif, com.google.android.gms.internal.firebase_database.zzja
    public final zzja zzm(zzid zzidVar) {
        return this;
    }
}
