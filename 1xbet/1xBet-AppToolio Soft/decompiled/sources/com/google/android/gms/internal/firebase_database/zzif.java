package com.google.android.gms.internal.firebase_database;

import com.google.firebase.database.collection.ImmutableSortedMap;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/* loaded from: classes.dex */
public class zzif implements zzja {
    public static Comparator<zzid> zzrc = new zzig();
    private final ImmutableSortedMap<zzid, zzja> zzob;
    private final zzja zzrd;
    private String zzre;

    protected zzif() {
        this.zzre = null;
        this.zzob = ImmutableSortedMap.Builder.emptyMap(zzrc);
        this.zzrd = zzir.zzfv();
    }

    protected zzif(ImmutableSortedMap<zzid, zzja> immutableSortedMap, zzja zzjaVar) {
        this.zzre = null;
        if (immutableSortedMap.isEmpty() && !zzjaVar.isEmpty()) {
            throw new IllegalArgumentException("Can't create empty ChildrenNode with priority!");
        }
        this.zzrd = zzjaVar;
        this.zzob = immutableSortedMap;
    }

    private static void zza(StringBuilder sb, int i) {
        for (int i2 = 0; i2 < i; i2++) {
            sb.append(" ");
        }
    }

    private final void zzb(StringBuilder sb, int i) {
        String str;
        if (this.zzob.isEmpty() && this.zzrd.isEmpty()) {
            str = "{ }";
        } else {
            sb.append("{\n");
            Iterator<Map.Entry<zzid, zzja>> it = this.zzob.iterator();
            while (it.hasNext()) {
                Map.Entry<zzid, zzja> next = it.next();
                int i2 = i + 2;
                zza(sb, i2);
                sb.append(next.getKey().zzfg());
                sb.append("=");
                if (next.getValue() instanceof zzif) {
                    ((zzif) next.getValue()).zzb(sb, i2);
                } else {
                    sb.append(next.getValue().toString());
                }
                sb.append("\n");
            }
            if (!this.zzrd.isEmpty()) {
                zza(sb, i + 2);
                sb.append(".priority=");
                sb.append(this.zzrd.toString());
                sb.append("\n");
            }
            zza(sb, i);
            str = "}";
        }
        sb.append(str);
    }

    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof zzif)) {
            return false;
        }
        zzif zzifVar = (zzif) obj;
        if (!zzfl().equals(zzifVar.zzfl()) || this.zzob.size() != zzifVar.zzob.size()) {
            return false;
        }
        Iterator<Map.Entry<zzid, zzja>> it = this.zzob.iterator();
        Iterator<Map.Entry<zzid, zzja>> it2 = zzifVar.zzob.iterator();
        while (it.hasNext() && it2.hasNext()) {
            Map.Entry<zzid, zzja> next = it.next();
            Map.Entry<zzid, zzja> next2 = it2.next();
            if (!next.getKey().equals(next2.getKey()) || !next.getValue().equals(next2.getValue())) {
                return false;
            }
        }
        if (it.hasNext() || it2.hasNext()) {
            throw new IllegalStateException("Something went wrong internally.");
        }
        return true;
    }

    @Override // com.google.android.gms.internal.firebase_database.zzja
    public int getChildCount() {
        return this.zzob.size();
    }

    @Override // com.google.android.gms.internal.firebase_database.zzja
    public Object getValue() {
        return getValue(false);
    }

    @Override // com.google.android.gms.internal.firebase_database.zzja
    public Object getValue(boolean z) {
        Integer zzaa;
        if (isEmpty()) {
            return null;
        }
        HashMap hashMap = new HashMap();
        Iterator<Map.Entry<zzid, zzja>> it = this.zzob.iterator();
        int i = 0;
        boolean z2 = true;
        int i2 = 0;
        while (it.hasNext()) {
            Map.Entry<zzid, zzja> next = it.next();
            String zzfg = next.getKey().zzfg();
            hashMap.put(zzfg, next.getValue().getValue(z));
            i++;
            if (z2) {
                if ((zzfg.length() > 1 && zzfg.charAt(0) == '0') || (zzaa = zzkq.zzaa(zzfg)) == null || zzaa.intValue() < 0) {
                    z2 = false;
                } else if (zzaa.intValue() > i2) {
                    i2 = zzaa.intValue();
                }
            }
        }
        if (z || !z2 || i2 >= i * 2) {
            if (z && !this.zzrd.isEmpty()) {
                hashMap.put(".priority", this.zzrd.getValue());
            }
            return hashMap;
        }
        ArrayList arrayList = new ArrayList(i2 + 1);
        for (int i3 = 0; i3 <= i2; i3++) {
            StringBuilder sb = new StringBuilder(11);
            sb.append(i3);
            arrayList.add(hashMap.get(sb.toString()));
        }
        return arrayList;
    }

    public int hashCode() {
        Iterator<zziz> it = iterator();
        int i = 0;
        while (it.hasNext()) {
            zziz next = it.next();
            i = (((i * 31) + next.zzge().hashCode()) * 17) + next.zzd().hashCode();
        }
        return i;
    }

    @Override // com.google.android.gms.internal.firebase_database.zzja
    public boolean isEmpty() {
        return this.zzob.isEmpty();
    }

    @Override // java.lang.Iterable
    public Iterator<zziz> iterator() {
        return new zzij(this.zzob.iterator());
    }

    @Override // com.google.android.gms.internal.firebase_database.zzja
    public Iterator<zziz> reverseIterator() {
        return new zzij(this.zzob.reverseIterator());
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        zzb(sb, 0);
        return sb.toString();
    }

    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    @Override // com.google.android.gms.internal.firebase_database.zzja
    public String zza(zzjc zzjcVar) {
        boolean z;
        if (zzjcVar != zzjc.V1) {
            throw new IllegalArgumentException("Hashes on children nodes only supported for V1");
        }
        StringBuilder sb = new StringBuilder();
        if (!this.zzrd.isEmpty()) {
            sb.append("priority:");
            sb.append(this.zzrd.zza(zzjc.V1));
            sb.append(":");
        }
        ArrayList arrayList = new ArrayList();
        Iterator<zziz> it = iterator();
        int i = 0;
        loop0: while (true) {
            while (it.hasNext()) {
                zziz next = it.next();
                arrayList.add(next);
                z = z || !next.zzd().zzfl().isEmpty();
            }
        }
        if (z) {
            Collections.sort(arrayList, zzjf.zzgf());
        }
        ArrayList arrayList2 = arrayList;
        int size = arrayList2.size();
        while (i < size) {
            Object obj = arrayList2.get(i);
            i++;
            zziz zzizVar = (zziz) obj;
            String zzfj = zzizVar.zzd().zzfj();
            if (!zzfj.equals("")) {
                sb.append(":");
                sb.append(zzizVar.zzge().zzfg());
                sb.append(":");
                sb.append(zzfj);
            }
        }
        return sb.toString();
    }

    public final void zza(zzii zziiVar, boolean z) {
        if (!z || zzfl().isEmpty()) {
            this.zzob.inOrderTraversal(zziiVar);
        } else {
            this.zzob.inOrderTraversal(new zzih(this, zziiVar));
        }
    }

    @Override // com.google.android.gms.internal.firebase_database.zzja
    public zzja zzam(zzch zzchVar) {
        zzid zzbw = zzchVar.zzbw();
        return zzbw == null ? this : zzm(zzbw).zzam(zzchVar.zzbx());
    }

    @Override // com.google.android.gms.internal.firebase_database.zzja
    public zzja zze(zzid zzidVar, zzja zzjaVar) {
        if (zzidVar.zzfh()) {
            return zzf(zzjaVar);
        }
        ImmutableSortedMap<zzid, zzja> immutableSortedMap = this.zzob;
        if (immutableSortedMap.containsKey(zzidVar)) {
            immutableSortedMap = immutableSortedMap.remove(zzidVar);
        }
        if (!zzjaVar.isEmpty()) {
            immutableSortedMap = immutableSortedMap.insert(zzidVar, zzjaVar);
        }
        return immutableSortedMap.isEmpty() ? zzir.zzfv() : new zzif(immutableSortedMap, this.zzrd);
    }

    @Override // com.google.android.gms.internal.firebase_database.zzja
    public zzja zzf(zzja zzjaVar) {
        return this.zzob.isEmpty() ? zzir.zzfv() : new zzif(this.zzob, zzjaVar);
    }

    @Override // com.google.android.gms.internal.firebase_database.zzja
    public String zzfj() {
        if (this.zzre == null) {
            String zza = zza(zzjc.V1);
            this.zzre = zza.isEmpty() ? "" : zzkq.zzy(zza);
        }
        return this.zzre;
    }

    @Override // com.google.android.gms.internal.firebase_database.zzja
    public boolean zzfk() {
        return false;
    }

    @Override // com.google.android.gms.internal.firebase_database.zzja
    public zzja zzfl() {
        return this.zzrd;
    }

    public final zzid zzfm() {
        return this.zzob.getMinKey();
    }

    public final zzid zzfn() {
        return this.zzob.getMaxKey();
    }

    @Override // java.lang.Comparable
    /* renamed from: zzg, reason: merged with bridge method [inline-methods] */
    public int compareTo(zzja zzjaVar) {
        if (isEmpty()) {
            return zzjaVar.isEmpty() ? 0 : -1;
        }
        if (zzjaVar.zzfk() || zzjaVar.isEmpty()) {
            return 1;
        }
        return zzjaVar == zzja.zzsi ? -1 : 0;
    }

    @Override // com.google.android.gms.internal.firebase_database.zzja
    public boolean zzk(zzid zzidVar) {
        return !zzm(zzidVar).isEmpty();
    }

    @Override // com.google.android.gms.internal.firebase_database.zzja
    public zzid zzl(zzid zzidVar) {
        return this.zzob.getPredecessorKey(zzidVar);
    }

    @Override // com.google.android.gms.internal.firebase_database.zzja
    public zzja zzl(zzch zzchVar, zzja zzjaVar) {
        zzid zzbw = zzchVar.zzbw();
        return zzbw == null ? zzjaVar : zzbw.zzfh() ? zzf(zzjaVar) : zze(zzbw, zzm(zzbw).zzl(zzchVar.zzbx(), zzjaVar));
    }

    @Override // com.google.android.gms.internal.firebase_database.zzja
    public zzja zzm(zzid zzidVar) {
        return (!zzidVar.zzfh() || this.zzrd.isEmpty()) ? this.zzob.containsKey(zzidVar) ? this.zzob.get(zzidVar) : zzir.zzfv() : this.zzrd;
    }
}
