package com.google.android.libraries.places.internal;

/* loaded from: classes4.dex */
final class zzccn extends com.google.android.libraries.places.internal.zzccr {
    private final com.google.android.libraries.places.internal.zzccm zzb;
    private final com.google.android.libraries.places.internal.zzccm zzc;
    private final com.google.android.libraries.places.internal.zzccm zzd;
    private final com.google.android.libraries.places.internal.zzccm zze;
    private final int zzf;

    public zzccn(com.google.android.libraries.places.internal.zzccm zzccmVar, com.google.android.libraries.places.internal.zzccm zzccmVar2, java.lang.reflect.Method method, java.lang.reflect.Method method2, com.google.android.libraries.places.internal.zzccm zzccmVar3, com.google.android.libraries.places.internal.zzccm zzccmVar4, java.security.Provider provider, int i) {
        super(provider);
        this.zzb = zzccmVar;
        this.zzc = zzccmVar2;
        this.zzd = zzccmVar3;
        this.zze = zzccmVar4;
        this.zzf = i;
    }

    @Override // com.google.android.libraries.places.internal.zzccr
    public final void zza(javax.net.ssl.SSLSocket sSLSocket, java.lang.String str, java.util.List list) {
        if (str != null) {
            this.zzb.zzb(sSLSocket, java.lang.Boolean.TRUE);
            this.zzc.zzb(sSLSocket, str);
        }
        com.google.android.libraries.places.internal.zzccm zzccmVar = this.zze;
        if (zzccmVar.zza(sSLSocket)) {
            zzccmVar.zzc(sSLSocket, zzg(list));
        }
    }

    @Override // com.google.android.libraries.places.internal.zzccr
    public final java.lang.String zzb(javax.net.ssl.SSLSocket sSLSocket) {
        byte[] bArr;
        com.google.android.libraries.places.internal.zzccm zzccmVar = this.zzd;
        if (!zzccmVar.zza(sSLSocket) || (bArr = (byte[]) zzccmVar.zzc(sSLSocket, new java.lang.Object[0])) == null) {
            return null;
        }
        return new java.lang.String(bArr, com.google.android.libraries.places.internal.zzccu.zzb);
    }

    @Override // com.google.android.libraries.places.internal.zzccr
    public final int zzc() {
        return this.zzf;
    }
}
