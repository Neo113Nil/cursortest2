package com.google.android.libraries.places.internal;

/* loaded from: classes4.dex */
final class zzcco extends com.google.android.libraries.places.internal.zzccr {
    private final java.lang.reflect.Method zzb;
    private final java.lang.reflect.Method zzc;

    /* synthetic */ zzcco(java.security.Provider provider, java.lang.reflect.Method method, java.lang.reflect.Method method2, byte[] bArr) {
        super(provider);
        this.zzb = method;
        this.zzc = method2;
    }

    @Override // com.google.android.libraries.places.internal.zzccr
    public final void zza(javax.net.ssl.SSLSocket sSLSocket, java.lang.String str, java.util.List list) {
        javax.net.ssl.SSLParameters sSLParameters = sSLSocket.getSSLParameters();
        java.util.ArrayList arrayList = new java.util.ArrayList(list.size());
        java.util.Iterator it = list.iterator();
        while (it.hasNext()) {
            com.google.android.libraries.places.internal.zzccs zzccsVar = (com.google.android.libraries.places.internal.zzccs) it.next();
            if (zzccsVar != com.google.android.libraries.places.internal.zzccs.HTTP_1_0) {
                arrayList.add(zzccsVar.toString());
            }
        }
        try {
            this.zzb.invoke(sSLParameters, arrayList.toArray(new java.lang.String[arrayList.size()]));
            sSLSocket.setSSLParameters(sSLParameters);
        } catch (java.lang.IllegalAccessException e) {
            throw new java.lang.RuntimeException(e);
        } catch (java.lang.reflect.InvocationTargetException e2) {
            throw new java.lang.RuntimeException(e2);
        }
    }

    @Override // com.google.android.libraries.places.internal.zzccr
    public final java.lang.String zzb(javax.net.ssl.SSLSocket sSLSocket) {
        try {
            return (java.lang.String) this.zzc.invoke(sSLSocket, new java.lang.Object[0]);
        } catch (java.lang.IllegalAccessException e) {
            throw new java.lang.RuntimeException(e);
        } catch (java.lang.reflect.InvocationTargetException e2) {
            throw new java.lang.RuntimeException(e2);
        }
    }

    @Override // com.google.android.libraries.places.internal.zzccr
    public final int zzc() {
        return 1;
    }
}
