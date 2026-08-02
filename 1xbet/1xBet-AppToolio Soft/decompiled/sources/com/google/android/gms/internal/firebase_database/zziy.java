package com.google.android.gms.internal.firebase_database;

/* loaded from: classes.dex */
public final class zziy extends zziv<zziy> {
    private final long value;

    public zziy(Long l, zzja zzjaVar) {
        super(zzjaVar);
        this.value = l.longValue();
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof zziy)) {
            return false;
        }
        zziy zziyVar = (zziy) obj;
        return this.value == zziyVar.value && this.zzrd.equals(zziyVar.zzrd);
    }

    @Override // com.google.android.gms.internal.firebase_database.zzja
    public final Object getValue() {
        return Long.valueOf(this.value);
    }

    public final int hashCode() {
        long j = this.value;
        return ((int) (j ^ (j >>> 32))) + this.zzrd.hashCode();
    }

    @Override // com.google.android.gms.internal.firebase_database.zziv
    protected final /* synthetic */ int zza(zziy zziyVar) {
        return zzkq.zzb(this.value, zziyVar.value);
    }

    @Override // com.google.android.gms.internal.firebase_database.zzja
    public final String zza(zzjc zzjcVar) {
        String valueOf = String.valueOf(String.valueOf(zzb(zzjcVar)).concat("number:"));
        String valueOf2 = String.valueOf(zzkq.zzc(this.value));
        return valueOf2.length() != 0 ? valueOf.concat(valueOf2) : new String(valueOf);
    }

    @Override // com.google.android.gms.internal.firebase_database.zzja
    public final /* synthetic */ zzja zzf(zzja zzjaVar) {
        return new zziy(Long.valueOf(this.value), zzjaVar);
    }

    @Override // com.google.android.gms.internal.firebase_database.zziv
    protected final zzix zzfb() {
        return zzix.Number;
    }
}
