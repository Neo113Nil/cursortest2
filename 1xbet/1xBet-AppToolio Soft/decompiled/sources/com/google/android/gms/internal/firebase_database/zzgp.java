package com.google.android.gms.internal.firebase_database;

import java.util.Map;

/* loaded from: classes.dex */
public final class zzgp<T> {
    private zzid zzog;
    private zzgp<T> zzoh;
    private zzgt<T> zzoi;

    public zzgp() {
        this(null, null, new zzgt());
    }

    private zzgp(zzid zzidVar, zzgp<T> zzgpVar, zzgt<T> zzgtVar) {
        this.zzog = zzidVar;
        this.zzoh = zzgpVar;
        this.zzoi = zzgtVar;
    }

    private final void zzdn() {
        zzgp<T> zzgpVar = this;
        while (true) {
            zzgp<T> zzgpVar2 = zzgpVar.zzoh;
            if (zzgpVar2 == null) {
                return;
            }
            zzid zzidVar = zzgpVar.zzog;
            boolean z = zzgpVar.zzoi.value == null && zzgpVar.zzoi.zzkk.isEmpty();
            boolean containsKey = zzgpVar2.zzoi.zzkk.containsKey(zzidVar);
            if (z && containsKey) {
                zzgpVar2.zzoi.zzkk.remove(zzidVar);
            } else if (z || containsKey) {
                return;
            } else {
                zzgpVar2.zzoi.zzkk.put(zzidVar, zzgpVar.zzoi);
            }
            zzgpVar = zzgpVar2;
        }
    }

    public final T getValue() {
        return this.zzoi.value;
    }

    public final boolean hasChildren() {
        return !this.zzoi.zzkk.isEmpty();
    }

    public final void setValue(T t) {
        this.zzoi.value = t;
        zzdn();
    }

    public final String toString() {
        zzid zzidVar = this.zzog;
        String zzfg = zzidVar == null ? "<anon>" : zzidVar.zzfg();
        String zzgtVar = this.zzoi.toString(String.valueOf("").concat("\t"));
        StringBuilder sb = new StringBuilder(String.valueOf("").length() + 1 + String.valueOf(zzfg).length() + String.valueOf(zzgtVar).length());
        sb.append("");
        sb.append(zzfg);
        sb.append("\n");
        sb.append(zzgtVar);
        return sb.toString();
    }

    public final void zza(zzgs<T> zzgsVar) {
        for (Object obj : this.zzoi.zzkk.entrySet().toArray()) {
            Map.Entry entry = (Map.Entry) obj;
            zzgsVar.zzd(new zzgp<>((zzid) entry.getKey(), this, (zzgt) entry.getValue()));
        }
    }

    public final void zza(zzgs<T> zzgsVar, boolean z, boolean z2) {
        if (z && !z2) {
            zzgsVar.zzd(this);
        }
        zza(new zzgq(this, zzgsVar, z2));
        if (z && z2) {
            zzgsVar.zzd(this);
        }
    }

    public final boolean zza(zzgr<T> zzgrVar, boolean z) {
        for (zzgp<T> zzgpVar = this.zzoh; zzgpVar != null; zzgpVar = zzgpVar.zzoh) {
            zzgrVar.zze(zzgpVar);
        }
        return false;
    }

    public final zzgp<T> zzaj(zzch zzchVar) {
        zzid zzbw = zzchVar.zzbw();
        zzch zzchVar2 = zzchVar;
        zzgp<T> zzgpVar = this;
        while (zzbw != null) {
            zzgp<T> zzgpVar2 = new zzgp<>(zzbw, zzgpVar, zzgpVar.zzoi.zzkk.containsKey(zzbw) ? zzgpVar.zzoi.zzkk.get(zzbw) : new zzgt<>());
            zzchVar2 = zzchVar2.zzbx();
            zzbw = zzchVar2.zzbw();
            zzgpVar = zzgpVar2;
        }
        return zzgpVar;
    }

    public final zzch zzg() {
        zzgp<T> zzgpVar = this.zzoh;
        if (zzgpVar != null) {
            return zzgpVar.zzg().zza(this.zzog);
        }
        zzid zzidVar = this.zzog;
        return zzidVar != null ? new zzch(zzidVar) : zzch.zzbt();
    }
}
