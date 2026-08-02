package com.google.android.gms.internal.firebase_database;

/* loaded from: classes.dex */
public final class zzfn {
    public static final zzfn zzmu = new zzfn(zzfo.User, null, false);
    public static final zzfn zzmv = new zzfn(zzfo.Server, null, false);
    private final zzfo zzmw;
    private final zzhe zzmx;
    private final boolean zzmy;

    private zzfn(zzfo zzfoVar, zzhe zzheVar, boolean z) {
        this.zzmw = zzfoVar;
        this.zzmx = zzheVar;
        this.zzmy = z;
    }

    public static zzfn zzc(zzhe zzheVar) {
        return new zzfn(zzfo.Server, zzheVar, true);
    }

    public final String toString() {
        String valueOf = String.valueOf(this.zzmw);
        String valueOf2 = String.valueOf(this.zzmx);
        boolean z = this.zzmy;
        StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 52 + String.valueOf(valueOf2).length());
        sb.append("OperationSource{source=");
        sb.append(valueOf);
        sb.append(", queryParams=");
        sb.append(valueOf2);
        sb.append(", tagged=");
        sb.append(z);
        sb.append('}');
        return sb.toString();
    }

    public final boolean zzda() {
        return this.zzmw == zzfo.User;
    }

    public final boolean zzdb() {
        return this.zzmy;
    }

    public final zzhe zzdc() {
        return this.zzmx;
    }
}
