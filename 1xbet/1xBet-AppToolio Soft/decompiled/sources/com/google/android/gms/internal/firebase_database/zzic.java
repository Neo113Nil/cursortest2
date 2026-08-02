package com.google.android.gms.internal.firebase_database;

/* loaded from: classes.dex */
public final class zzic extends zziv<zzic> {
    private final boolean value;

    public zzic(Boolean bool, zzja zzjaVar) {
        super(zzjaVar);
        this.value = bool.booleanValue();
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof zzic)) {
            return false;
        }
        zzic zzicVar = (zzic) obj;
        return this.value == zzicVar.value && this.zzrd.equals(zzicVar.zzrd);
    }

    @Override // com.google.android.gms.internal.firebase_database.zzja
    public final Object getValue() {
        return Boolean.valueOf(this.value);
    }

    public final int hashCode() {
        boolean z = this.value;
        return (z ? 1 : 0) + this.zzrd.hashCode();
    }

    @Override // com.google.android.gms.internal.firebase_database.zziv
    protected final /* synthetic */ int zza(zzic zzicVar) {
        boolean z = this.value;
        if (z == zzicVar.value) {
            return 0;
        }
        return z ? 1 : -1;
    }

    @Override // com.google.android.gms.internal.firebase_database.zzja
    public final String zza(zzjc zzjcVar) {
        String zzb = zzb(zzjcVar);
        boolean z = this.value;
        StringBuilder sb = new StringBuilder(String.valueOf(zzb).length() + 13);
        sb.append(zzb);
        sb.append("boolean:");
        sb.append(z);
        return sb.toString();
    }

    @Override // com.google.android.gms.internal.firebase_database.zzja
    public final /* synthetic */ zzja zzf(zzja zzjaVar) {
        return new zzic(Boolean.valueOf(this.value), zzjaVar);
    }

    @Override // com.google.android.gms.internal.firebase_database.zziv
    protected final zzix zzfb() {
        return zzix.Boolean;
    }
}
