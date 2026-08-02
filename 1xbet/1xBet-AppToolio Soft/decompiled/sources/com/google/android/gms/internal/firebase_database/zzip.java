package com.google.android.gms.internal.firebase_database;

import java.util.Map;

/* loaded from: classes.dex */
public final class zzip extends zziv<zzip> {
    private Map<Object, Object> zzrt;

    public zzip(Map<Object, Object> map, zzja zzjaVar) {
        super(zzjaVar);
        this.zzrt = map;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof zzip)) {
            return false;
        }
        zzip zzipVar = (zzip) obj;
        return this.zzrt.equals(zzipVar.zzrt) && this.zzrd.equals(zzipVar.zzrd);
    }

    @Override // com.google.android.gms.internal.firebase_database.zzja
    public final Object getValue() {
        return this.zzrt;
    }

    public final int hashCode() {
        return this.zzrt.hashCode() + this.zzrd.hashCode();
    }

    @Override // com.google.android.gms.internal.firebase_database.zziv
    protected final /* bridge */ /* synthetic */ int zza(zzip zzipVar) {
        return 0;
    }

    @Override // com.google.android.gms.internal.firebase_database.zzja
    public final String zza(zzjc zzjcVar) {
        String zzb = zzb(zzjcVar);
        String valueOf = String.valueOf(this.zzrt);
        StringBuilder sb = new StringBuilder(String.valueOf(zzb).length() + 14 + String.valueOf(valueOf).length());
        sb.append(zzb);
        sb.append("deferredValue:");
        sb.append(valueOf);
        return sb.toString();
    }

    @Override // com.google.android.gms.internal.firebase_database.zzja
    public final /* synthetic */ zzja zzf(zzja zzjaVar) {
        return new zzip(this.zzrt, zzjaVar);
    }

    @Override // com.google.android.gms.internal.firebase_database.zziv
    protected final zzix zzfb() {
        return zzix.DeferredValue;
    }
}
