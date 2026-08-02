package com.google.android.gms.internal.firebase_database;

/* loaded from: classes.dex */
final class zzay {
    private final zzbb zzem;
    private final zzaw zzen;
    private final zzai zzeo;
    private final Long zzep;

    private zzay(zzbb zzbbVar, zzaw zzawVar, Long l, zzai zzaiVar) {
        this.zzem = zzbbVar;
        this.zzen = zzawVar;
        this.zzeo = zzaiVar;
        this.zzep = l;
    }

    /* synthetic */ zzay(zzbb zzbbVar, zzaw zzawVar, Long l, zzai zzaiVar, zzam zzamVar) {
        this(zzbbVar, zzawVar, l, zzaiVar);
    }

    public final String toString() {
        String zzawVar = this.zzen.toString();
        String valueOf = String.valueOf(this.zzep);
        StringBuilder sb = new StringBuilder(String.valueOf(zzawVar).length() + 8 + String.valueOf(valueOf).length());
        sb.append(zzawVar);
        sb.append(" (Tag: ");
        sb.append(valueOf);
        sb.append(")");
        return sb.toString();
    }

    public final zzaw zzaj() {
        return this.zzen;
    }

    public final Long zzak() {
        return this.zzep;
    }

    public final zzai zzal() {
        return this.zzeo;
    }
}
