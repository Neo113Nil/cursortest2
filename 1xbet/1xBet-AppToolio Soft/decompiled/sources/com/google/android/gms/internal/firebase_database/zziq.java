package com.google.android.gms.internal.firebase_database;

/* loaded from: classes.dex */
public final class zziq extends zziv<zziq> {
    private final Double zzru;

    public zziq(Double d, zzja zzjaVar) {
        super(zzjaVar);
        this.zzru = d;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof zziq)) {
            return false;
        }
        zziq zziqVar = (zziq) obj;
        return this.zzru.equals(zziqVar.zzru) && this.zzrd.equals(zziqVar.zzrd);
    }

    @Override // com.google.android.gms.internal.firebase_database.zzja
    public final Object getValue() {
        return this.zzru;
    }

    public final int hashCode() {
        return this.zzru.hashCode() + this.zzrd.hashCode();
    }

    @Override // com.google.android.gms.internal.firebase_database.zziv
    protected final /* synthetic */ int zza(zziq zziqVar) {
        return this.zzru.compareTo(zziqVar.zzru);
    }

    @Override // com.google.android.gms.internal.firebase_database.zzja
    public final String zza(zzjc zzjcVar) {
        String valueOf = String.valueOf(String.valueOf(zzb(zzjcVar)).concat("number:"));
        String valueOf2 = String.valueOf(zzkq.zzc(this.zzru.doubleValue()));
        return valueOf2.length() != 0 ? valueOf.concat(valueOf2) : new String(valueOf);
    }

    @Override // com.google.android.gms.internal.firebase_database.zzja
    public final /* synthetic */ zzja zzf(zzja zzjaVar) {
        return new zziq(this.zzru, zzjaVar);
    }

    @Override // com.google.android.gms.internal.firebase_database.zziv
    protected final zzix zzfb() {
        return zzix.Number;
    }
}
