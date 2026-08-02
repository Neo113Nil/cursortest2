package com.google.android.gms.internal.firebase_database;

/* loaded from: classes.dex */
public final class zzji extends zziv<zzji> {
    private final String value;

    public zzji(String str, zzja zzjaVar) {
        super(zzjaVar);
        this.value = str;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof zzji)) {
            return false;
        }
        zzji zzjiVar = (zzji) obj;
        return this.value.equals(zzjiVar.value) && this.zzrd.equals(zzjiVar.zzrd);
    }

    @Override // com.google.android.gms.internal.firebase_database.zzja
    public final Object getValue() {
        return this.value;
    }

    public final int hashCode() {
        return this.value.hashCode() + this.zzrd.hashCode();
    }

    @Override // com.google.android.gms.internal.firebase_database.zziv
    protected final /* synthetic */ int zza(zzji zzjiVar) {
        return this.value.compareTo(zzjiVar.value);
    }

    @Override // com.google.android.gms.internal.firebase_database.zzja
    public final String zza(zzjc zzjcVar) {
        String zzb;
        String str;
        StringBuilder sb;
        switch (zzjj.zzsa[zzjcVar.ordinal()]) {
            case 1:
                zzb = zzb(zzjcVar);
                str = this.value;
                sb = new StringBuilder(String.valueOf(zzb).length() + 7 + String.valueOf(str).length());
                break;
            case 2:
                zzb = zzb(zzjcVar);
                str = zzkq.zzz(this.value);
                sb = new StringBuilder(String.valueOf(zzb).length() + 7 + String.valueOf(str).length());
                break;
            default:
                String valueOf = String.valueOf(zzjcVar);
                StringBuilder sb2 = new StringBuilder(String.valueOf(valueOf).length() + 38);
                sb2.append("Invalid hash version for string node: ");
                sb2.append(valueOf);
                throw new IllegalArgumentException(sb2.toString());
        }
        sb.append(zzb);
        sb.append("string:");
        sb.append(str);
        return sb.toString();
    }

    @Override // com.google.android.gms.internal.firebase_database.zzja
    public final /* synthetic */ zzja zzf(zzja zzjaVar) {
        return new zzji(this.value, zzjaVar);
    }

    @Override // com.google.android.gms.internal.firebase_database.zziv
    protected final zzix zzfb() {
        return zzix.String;
    }
}
