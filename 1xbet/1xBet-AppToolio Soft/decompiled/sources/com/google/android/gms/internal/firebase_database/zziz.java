package com.google.android.gms.internal.firebase_database;

/* loaded from: classes.dex */
public final class zziz {
    private static final zziz zzsg = new zziz(zzid.zzfc(), zzir.zzfv());
    private static final zziz zzsh = new zziz(zzid.zzfd(), zzja.zzsi);
    private final zzid zzog;
    private final zzja zzrx;

    public zziz(zzid zzidVar, zzja zzjaVar) {
        this.zzog = zzidVar;
        this.zzrx = zzjaVar;
    }

    public static zziz zzgc() {
        return zzsg;
    }

    public static zziz zzgd() {
        return zzsh;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        zziz zzizVar = (zziz) obj;
        return this.zzog.equals(zzizVar.zzog) && this.zzrx.equals(zzizVar.zzrx);
    }

    public final int hashCode() {
        return (this.zzog.hashCode() * 31) + this.zzrx.hashCode();
    }

    public final String toString() {
        String valueOf = String.valueOf(this.zzog);
        String valueOf2 = String.valueOf(this.zzrx);
        StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 23 + String.valueOf(valueOf2).length());
        sb.append("NamedNode{name=");
        sb.append(valueOf);
        sb.append(", node=");
        sb.append(valueOf2);
        sb.append('}');
        return sb.toString();
    }

    public final zzja zzd() {
        return this.zzrx;
    }

    public final zzid zzge() {
        return this.zzog;
    }
}
