package com.google.android.libraries.places.internal;

/* loaded from: classes4.dex */
final class zzccp extends com.google.android.libraries.places.internal.zzccr {
    private final java.lang.reflect.Method zzb;
    private final java.lang.reflect.Method zzc;
    private final java.lang.reflect.Method zzd;
    private final java.lang.Class zze;
    private final java.lang.Class zzf;

    public zzccp(java.lang.reflect.Method method, java.lang.reflect.Method method2, java.lang.reflect.Method method3, java.lang.Class cls, java.lang.Class cls2, java.security.Provider provider) {
        super(provider);
        this.zzb = method;
        this.zzc = method2;
        this.zzd = method3;
        this.zze = cls;
        this.zzf = cls2;
    }

    @Override // com.google.android.libraries.places.internal.zzccr
    public final void zza(javax.net.ssl.SSLSocket sSLSocket, java.lang.String str, java.util.List list) {
        java.util.ArrayList arrayList = new java.util.ArrayList(list.size());
        int size = list.size();
        for (int i = 0; i < size; i++) {
            com.google.android.libraries.places.internal.zzccs zzccsVar = (com.google.android.libraries.places.internal.zzccs) list.get(i);
            if (zzccsVar != com.google.android.libraries.places.internal.zzccs.HTTP_1_0) {
                arrayList.add(zzccsVar.toString());
            }
        }
        try {
            this.zzb.invoke(null, sSLSocket, java.lang.reflect.Proxy.newProxyInstance(com.google.android.libraries.places.internal.zzccr.class.getClassLoader(), new java.lang.Class[]{this.zze, this.zzf}, new com.google.android.libraries.places.internal.zzccq(arrayList)));
        } catch (java.lang.IllegalAccessException e) {
            throw new java.lang.AssertionError(e);
        } catch (java.lang.reflect.InvocationTargetException e2) {
            throw new java.lang.AssertionError(e2);
        }
    }

    @Override // com.google.android.libraries.places.internal.zzccr
    public final java.lang.String zzb(javax.net.ssl.SSLSocket sSLSocket) {
        try {
            com.google.android.libraries.places.internal.zzccq zzccqVar = (com.google.android.libraries.places.internal.zzccq) java.lang.reflect.Proxy.getInvocationHandler(this.zzc.invoke(null, sSLSocket));
            if (!zzccqVar.zza() && zzccqVar.zzb() == null) {
                zza.logp(java.util.logging.Level.INFO, "io.grpc.okhttp.internal.Platform$JdkWithJettyBootPlatform", "getSelectedProtocol", "ALPN callback dropped: SPDY and HTTP/2 are disabled. Is alpn-boot on the boot class path?");
                return null;
            }
            if (zzccqVar.zza()) {
                return null;
            }
            return zzccqVar.zzb();
        } catch (java.lang.IllegalAccessException unused) {
            throw new java.lang.AssertionError();
        } catch (java.lang.reflect.InvocationTargetException unused2) {
            throw new java.lang.AssertionError();
        }
    }

    @Override // com.google.android.libraries.places.internal.zzccr
    public final int zzc() {
        return 1;
    }

    @Override // com.google.android.libraries.places.internal.zzccr
    public final void zzd(javax.net.ssl.SSLSocket sSLSocket) {
        try {
            this.zzd.invoke(null, sSLSocket);
        } catch (java.lang.IllegalAccessException unused) {
            throw new java.lang.AssertionError();
        } catch (java.lang.reflect.InvocationTargetException e) {
            zza.logp(java.util.logging.Level.FINE, "io.grpc.okhttp.internal.Platform$JdkWithJettyBootPlatform", "afterHandshake", "Failed to remove SSLSocket from Jetty ALPN", (java.lang.Throwable) e);
        }
    }
}
