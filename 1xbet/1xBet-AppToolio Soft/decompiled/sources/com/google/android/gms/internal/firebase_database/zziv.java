package com.google.android.gms.internal.firebase_database;

import com.google.android.gms.internal.firebase_database.zziv;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;

/* loaded from: classes.dex */
public abstract class zziv<T extends zziv> implements zzja {
    protected final zzja zzrd;
    private String zzre;

    zziv(zzja zzjaVar) {
        this.zzrd = zzjaVar;
    }

    private static int zza(zziy zziyVar, zziq zziqVar) {
        return Double.valueOf(((Long) zziyVar.getValue()).longValue()).compareTo((Double) zziqVar.getValue());
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.lang.Comparable
    public /* synthetic */ int compareTo(zzja zzjaVar) {
        zzja zzjaVar2 = zzjaVar;
        if (zzjaVar2.isEmpty()) {
            return 1;
        }
        if (zzjaVar2 instanceof zzif) {
            return -1;
        }
        if ((this instanceof zziy) && (zzjaVar2 instanceof zziq)) {
            return zza((zziy) this, (zziq) zzjaVar2);
        }
        if ((this instanceof zziq) && (zzjaVar2 instanceof zziy)) {
            return zza((zziy) zzjaVar2, (zziq) this) * (-1);
        }
        zziv zzivVar = (zziv) zzjaVar2;
        zzix zzfb = zzfb();
        zzix zzfb2 = zzivVar.zzfb();
        return zzfb.equals(zzfb2) ? zza((zziv<T>) zzivVar) : zzfb.compareTo(zzfb2);
    }

    @Override // com.google.android.gms.internal.firebase_database.zzja
    public final int getChildCount() {
        return 0;
    }

    @Override // com.google.android.gms.internal.firebase_database.zzja
    public final Object getValue(boolean z) {
        if (!z || this.zzrd.isEmpty()) {
            return getValue();
        }
        HashMap hashMap = new HashMap();
        hashMap.put(".value", getValue());
        hashMap.put(".priority", this.zzrd.getValue());
        return hashMap;
    }

    @Override // com.google.android.gms.internal.firebase_database.zzja
    public final boolean isEmpty() {
        return false;
    }

    @Override // java.lang.Iterable
    public Iterator<zziz> iterator() {
        return Collections.emptyList().iterator();
    }

    @Override // com.google.android.gms.internal.firebase_database.zzja
    public final Iterator<zziz> reverseIterator() {
        return Collections.emptyList().iterator();
    }

    public String toString() {
        String obj = getValue(true).toString();
        return obj.length() <= 100 ? obj : String.valueOf(obj.substring(0, 100)).concat("...");
    }

    protected abstract int zza(T t);

    @Override // com.google.android.gms.internal.firebase_database.zzja
    public final zzja zzam(zzch zzchVar) {
        return zzchVar.isEmpty() ? this : zzchVar.zzbw().zzfh() ? this.zzrd : zzir.zzfv();
    }

    protected final String zzb(zzjc zzjcVar) {
        switch (zziw.zzsa[zzjcVar.ordinal()]) {
            case 1:
            case 2:
                if (this.zzrd.isEmpty()) {
                    return "";
                }
                String zza = this.zzrd.zza(zzjcVar);
                StringBuilder sb = new StringBuilder(String.valueOf(zza).length() + 10);
                sb.append("priority:");
                sb.append(zza);
                sb.append(":");
                return sb.toString();
            default:
                String valueOf = String.valueOf(zzjcVar);
                StringBuilder sb2 = new StringBuilder(String.valueOf(valueOf).length() + 22);
                sb2.append("Unknown hash version: ");
                sb2.append(valueOf);
                throw new IllegalArgumentException(sb2.toString());
        }
    }

    @Override // com.google.android.gms.internal.firebase_database.zzja
    public final zzja zze(zzid zzidVar, zzja zzjaVar) {
        return zzidVar.zzfh() ? zzf(zzjaVar) : zzjaVar.isEmpty() ? this : zzir.zzfv().zze(zzidVar, zzjaVar).zzf(this.zzrd);
    }

    protected abstract zzix zzfb();

    @Override // com.google.android.gms.internal.firebase_database.zzja
    public final String zzfj() {
        if (this.zzre == null) {
            this.zzre = zzkq.zzy(zza(zzjc.V1));
        }
        return this.zzre;
    }

    @Override // com.google.android.gms.internal.firebase_database.zzja
    public final boolean zzfk() {
        return true;
    }

    @Override // com.google.android.gms.internal.firebase_database.zzja
    public final zzja zzfl() {
        return this.zzrd;
    }

    @Override // com.google.android.gms.internal.firebase_database.zzja
    public final boolean zzk(zzid zzidVar) {
        return false;
    }

    @Override // com.google.android.gms.internal.firebase_database.zzja
    public final zzid zzl(zzid zzidVar) {
        return null;
    }

    @Override // com.google.android.gms.internal.firebase_database.zzja
    public final zzja zzl(zzch zzchVar, zzja zzjaVar) {
        zzid zzbw = zzchVar.zzbw();
        return zzbw == null ? zzjaVar : (!zzjaVar.isEmpty() || zzbw.zzfh()) ? zze(zzbw, zzir.zzfv().zzl(zzchVar.zzbx(), zzjaVar)) : this;
    }

    @Override // com.google.android.gms.internal.firebase_database.zzja
    public final zzja zzm(zzid zzidVar) {
        return zzidVar.zzfh() ? this.zzrd : zzir.zzfv();
    }
}
