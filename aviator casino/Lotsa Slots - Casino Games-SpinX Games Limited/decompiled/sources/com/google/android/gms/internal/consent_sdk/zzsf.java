package com.google.android.gms.internal.consent_sdk;

/* compiled from: com.google.android.ump:user-messaging-platform@@4.0.0 */
/* loaded from: classes4.dex */
final class zzsf implements java.util.Iterator {
    final /* synthetic */ com.google.android.gms.internal.consent_sdk.zzsi zza;
    private int zzb;
    private boolean zzc;
    private java.util.Iterator zzd;

    /* synthetic */ zzsf(com.google.android.gms.internal.consent_sdk.zzsi zzsiVar, com.google.android.gms.internal.consent_sdk.zzsh zzshVar) {
        java.util.Objects.requireNonNull(zzsiVar);
        this.zza = zzsiVar;
        this.zzb = -1;
    }

    private final java.util.Iterator zza() {
        java.util.Map map;
        if (this.zzd == null) {
            map = this.zza.zzc;
            this.zzd = map.entrySet().iterator();
        }
        return this.zzd;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        int i;
        java.util.Map map;
        int i2 = this.zzb + 1;
        com.google.android.gms.internal.consent_sdk.zzsi zzsiVar = this.zza;
        i = zzsiVar.zzb;
        if (i2 < i) {
            return true;
        }
        map = zzsiVar.zzc;
        return !map.isEmpty() && zza().hasNext();
    }

    @Override // java.util.Iterator
    public final /* bridge */ /* synthetic */ java.lang.Object next() {
        int i;
        java.lang.Object[] objArr;
        this.zzc = true;
        int i2 = this.zzb + 1;
        this.zzb = i2;
        com.google.android.gms.internal.consent_sdk.zzsi zzsiVar = this.zza;
        i = zzsiVar.zzb;
        if (i2 >= i) {
            return (java.util.Map.Entry) zza().next();
        }
        objArr = zzsiVar.zza;
        return (com.google.android.gms.internal.consent_sdk.zzse) objArr[i2];
    }

    @Override // java.util.Iterator
    public final void remove() {
        int i;
        if (!this.zzc) {
            throw new java.lang.IllegalStateException("remove() was called before next()");
        }
        this.zzc = false;
        com.google.android.gms.internal.consent_sdk.zzsi zzsiVar = this.zza;
        zzsiVar.zzo();
        int i2 = this.zzb;
        i = zzsiVar.zzb;
        if (i2 >= i) {
            zza().remove();
        } else {
            this.zzb = i2 - 1;
            zzsiVar.zzm(i2);
        }
    }
}
