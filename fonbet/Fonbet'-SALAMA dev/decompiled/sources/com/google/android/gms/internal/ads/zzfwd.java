package com.google.android.gms.internal.ads;

import java.io.Serializable;

/* loaded from: classes.dex */
final class zzfwd extends zzfvb implements Serializable {
    final Object zza;
    final Object zzb;

    public zzfwd(Object obj, Object obj2) {
        this.zza = obj;
        this.zzb = obj2;
    }

    @Override // com.google.android.gms.internal.ads.zzfvb, java.util.Map.Entry
    public final Object getKey() {
        return this.zza;
    }

    @Override // com.google.android.gms.internal.ads.zzfvb, java.util.Map.Entry
    public final Object getValue() {
        return this.zzb;
    }

    @Override // com.google.android.gms.internal.ads.zzfvb, java.util.Map.Entry
    public final Object setValue(Object obj) {
        throw new UnsupportedOperationException();
    }
}
