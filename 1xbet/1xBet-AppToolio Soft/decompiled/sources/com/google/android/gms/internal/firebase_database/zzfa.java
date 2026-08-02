package com.google.android.gms.internal.firebase_database;

/* loaded from: classes.dex */
public final class zzfa {
    private final zzch zzap;
    private final long zzls;
    private final zzja zzlt;
    private final zzbv zzlu;
    private final boolean zzlv;

    public zzfa(long j, zzch zzchVar, zzbv zzbvVar) {
        this.zzls = j;
        this.zzap = zzchVar;
        this.zzlt = null;
        this.zzlu = zzbvVar;
        this.zzlv = true;
    }

    public zzfa(long j, zzch zzchVar, zzja zzjaVar, boolean z) {
        this.zzls = j;
        this.zzap = zzchVar;
        this.zzlt = zzjaVar;
        this.zzlu = null;
        this.zzlv = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        zzfa zzfaVar = (zzfa) obj;
        if (this.zzls != zzfaVar.zzls || !this.zzap.equals(zzfaVar.zzap) || this.zzlv != zzfaVar.zzlv) {
            return false;
        }
        zzja zzjaVar = this.zzlt;
        if (zzjaVar == null ? zzfaVar.zzlt != null : !zzjaVar.equals(zzfaVar.zzlt)) {
            return false;
        }
        zzbv zzbvVar = this.zzlu;
        return zzbvVar == null ? zzfaVar.zzlu == null : zzbvVar.equals(zzfaVar.zzlu);
    }

    public final int hashCode() {
        int hashCode = ((((Long.valueOf(this.zzls).hashCode() * 31) + Boolean.valueOf(this.zzlv).hashCode()) * 31) + this.zzap.hashCode()) * 31;
        zzja zzjaVar = this.zzlt;
        int hashCode2 = (hashCode + (zzjaVar != null ? zzjaVar.hashCode() : 0)) * 31;
        zzbv zzbvVar = this.zzlu;
        return hashCode2 + (zzbvVar != null ? zzbvVar.hashCode() : 0);
    }

    public final boolean isVisible() {
        return this.zzlv;
    }

    public final String toString() {
        long j = this.zzls;
        String valueOf = String.valueOf(this.zzap);
        boolean z = this.zzlv;
        String valueOf2 = String.valueOf(this.zzlt);
        String valueOf3 = String.valueOf(this.zzlu);
        StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 78 + String.valueOf(valueOf2).length() + String.valueOf(valueOf3).length());
        sb.append("UserWriteRecord{id=");
        sb.append(j);
        sb.append(" path=");
        sb.append(valueOf);
        sb.append(" visible=");
        sb.append(z);
        sb.append(" overwrite=");
        sb.append(valueOf2);
        sb.append(" merge=");
        sb.append(valueOf3);
        sb.append("}");
        return sb.toString();
    }

    public final long zzcn() {
        return this.zzls;
    }

    public final zzja zzco() {
        zzja zzjaVar = this.zzlt;
        if (zzjaVar != null) {
            return zzjaVar;
        }
        throw new IllegalArgumentException("Can't access overwrite when write is a merge!");
    }

    public final zzbv zzcp() {
        zzbv zzbvVar = this.zzlu;
        if (zzbvVar != null) {
            return zzbvVar;
        }
        throw new IllegalArgumentException("Can't access merge when write is an overwrite!");
    }

    public final boolean zzcq() {
        return this.zzlt != null;
    }

    public final zzch zzg() {
        return this.zzap;
    }
}
