package com.google.android.gms.internal.firebase_database;

import com.google.firebase.database.collection.ImmutableSortedSet;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

/* loaded from: classes.dex */
public final class zzit implements Iterable<zziz> {
    private static final ImmutableSortedSet<zziz> zzrw = new ImmutableSortedSet<>(Collections.emptyList(), null);
    private final zzis zzpd;
    private final zzja zzrx;
    private ImmutableSortedSet<zziz> zzry;

    private zzit(zzja zzjaVar, zzis zzisVar) {
        this.zzpd = zzisVar;
        this.zzrx = zzjaVar;
        this.zzry = null;
    }

    private zzit(zzja zzjaVar, zzis zzisVar, ImmutableSortedSet<zziz> immutableSortedSet) {
        this.zzpd = zzisVar;
        this.zzrx = zzjaVar;
        this.zzry = immutableSortedSet;
    }

    public static zzit zza(zzja zzjaVar, zzis zzisVar) {
        return new zzit(zzjaVar, zzisVar);
    }

    private final void zzfy() {
        if (this.zzry == null) {
            if (!this.zzpd.equals(zziu.zzgb())) {
                ArrayList arrayList = new ArrayList();
                boolean z = false;
                for (zziz zzizVar : this.zzrx) {
                    z = z || this.zzpd.zzi(zzizVar.zzd());
                    arrayList.add(new zziz(zzizVar.zzge(), zzizVar.zzd()));
                }
                if (z) {
                    this.zzry = new ImmutableSortedSet<>(arrayList, this.zzpd);
                    return;
                }
            }
            this.zzry = zzrw;
        }
    }

    public static zzit zzj(zzja zzjaVar) {
        return new zzit(zzjaVar, zzjf.zzgf());
    }

    @Override // java.lang.Iterable
    public final Iterator<zziz> iterator() {
        zzfy();
        ImmutableSortedSet<zziz> immutableSortedSet = this.zzry;
        return immutableSortedSet == zzrw ? this.zzrx.iterator() : immutableSortedSet.iterator();
    }

    public final Iterator<zziz> reverseIterator() {
        zzfy();
        ImmutableSortedSet<zziz> immutableSortedSet = this.zzry;
        return immutableSortedSet == zzrw ? this.zzrx.reverseIterator() : immutableSortedSet.reverseIterator();
    }

    public final zzid zza(zzid zzidVar, zzja zzjaVar, zzis zzisVar) {
        if (!this.zzpd.equals(zziu.zzgb()) && !this.zzpd.equals(zzisVar)) {
            throw new IllegalArgumentException("Index not available in IndexedNode!");
        }
        zzfy();
        ImmutableSortedSet<zziz> immutableSortedSet = this.zzry;
        if (immutableSortedSet == zzrw) {
            return this.zzrx.zzl(zzidVar);
        }
        zziz predecessorEntry = immutableSortedSet.getPredecessorEntry(new zziz(zzidVar, zzjaVar));
        if (predecessorEntry != null) {
            return predecessorEntry.zzge();
        }
        return null;
    }

    public final zzja zzd() {
        return this.zzrx;
    }

    public final zziz zzfz() {
        if (!(this.zzrx instanceof zzif)) {
            return null;
        }
        zzfy();
        ImmutableSortedSet<zziz> immutableSortedSet = this.zzry;
        if (immutableSortedSet != zzrw) {
            return immutableSortedSet.getMinEntry();
        }
        zzid zzfm = ((zzif) this.zzrx).zzfm();
        return new zziz(zzfm, this.zzrx.zzm(zzfm));
    }

    public final zzit zzg(zzid zzidVar, zzja zzjaVar) {
        zzja zze = this.zzrx.zze(zzidVar, zzjaVar);
        if (this.zzry == zzrw && !this.zzpd.zzi(zzjaVar)) {
            return new zzit(zze, this.zzpd, zzrw);
        }
        ImmutableSortedSet<zziz> immutableSortedSet = this.zzry;
        if (immutableSortedSet == null || immutableSortedSet == zzrw) {
            return new zzit(zze, this.zzpd, null);
        }
        ImmutableSortedSet<zziz> remove = this.zzry.remove(new zziz(zzidVar, this.zzrx.zzm(zzidVar)));
        if (!zzjaVar.isEmpty()) {
            remove = remove.insert(new zziz(zzidVar, zzjaVar));
        }
        return new zzit(zze, this.zzpd, remove);
    }

    public final zziz zzga() {
        if (!(this.zzrx instanceof zzif)) {
            return null;
        }
        zzfy();
        ImmutableSortedSet<zziz> immutableSortedSet = this.zzry;
        if (immutableSortedSet != zzrw) {
            return immutableSortedSet.getMaxEntry();
        }
        zzid zzfn = ((zzif) this.zzrx).zzfn();
        return new zziz(zzfn, this.zzrx.zzm(zzfn));
    }

    public final zzit zzk(zzja zzjaVar) {
        return new zzit(this.zzrx.zzf(zzjaVar), this.zzpd, this.zzry);
    }
}
