package com.google.android.libraries.places.internal;

/* loaded from: classes4.dex */
public class zzccr {
    public static final java.util.logging.Logger zza = java.util.logging.Logger.getLogger(com.google.android.libraries.places.internal.zzccr.class.getName());
    private static final java.lang.String[] zzb = {"com.google.android.gms.org.conscrypt.OpenSSLProvider", "org.conscrypt.OpenSSLProvider", "com.android.org.conscrypt.OpenSSLProvider", "org.apache.harmony.xnet.provider.jsse.OpenSSLProvider", "com.google.android.libraries.stitch.sslguard.SslGuardProvider"};
    private static final com.google.android.libraries.places.internal.zzccr zzc = zzh();
    private final java.security.Provider zzd;

    public static byte[] zzg(java.util.List list) {
        com.google.android.libraries.places.internal.zzcff zzcffVar = new com.google.android.libraries.places.internal.zzcff();
        int size = list.size();
        for (int i = 0; i < size; i++) {
            com.google.android.libraries.places.internal.zzccs zzccsVar = (com.google.android.libraries.places.internal.zzccs) list.get(i);
            if (zzccsVar != com.google.android.libraries.places.internal.zzccs.HTTP_1_0) {
                zzcffVar.zzA(zzccsVar.toString().length());
                zzcffVar.zzv(zzccsVar.toString());
            }
        }
        return zzcffVar.zzr(zzcffVar.zzb());
    }

    private static com.google.android.libraries.places.internal.zzccr zzh() {
        java.lang.reflect.Method method;
        java.security.Provider provider;
        java.lang.reflect.Method method2;
        java.lang.reflect.Method method3;
        int i;
        java.security.Provider[] providers = java.security.Security.getProviders();
        int length = providers.length;
        int i2 = 0;
        loop0: while (true) {
            method = null;
            if (i2 >= length) {
                provider = null;
                break;
            }
            java.security.Provider provider2 = providers[i2];
            java.lang.String[] strArr = zzb;
            int length2 = strArr.length;
            for (int i3 = 0; i3 < 5; i3++) {
                java.lang.String str = strArr[i3];
                if (str.equals(provider2.getClass().getName())) {
                    zza.logp(java.util.logging.Level.FINE, "io.grpc.okhttp.internal.Platform", "getAndroidSecurityProvider", "Found registered provider {0}", str);
                    provider = provider2;
                    break loop0;
                }
            }
            i2++;
        }
        if (provider == null) {
            try {
                java.security.Provider provider3 = javax.net.ssl.SSLContext.getDefault().getProvider();
                try {
                    try {
                        javax.net.ssl.SSLContext sSLContext = javax.net.ssl.SSLContext.getInstance("TLS", provider3);
                        sSLContext.init(null, null, null);
                        javax.net.ssl.SSLEngine.class.getMethod("getApplicationProtocol", new java.lang.Class[0]).invoke(sSLContext.createSSLEngine(), new java.lang.Object[0]);
                        return new com.google.android.libraries.places.internal.zzcco(provider3, javax.net.ssl.SSLParameters.class.getMethod("setApplicationProtocols", java.lang.String[].class), javax.net.ssl.SSLSocket.class.getMethod("getApplicationProtocol", new java.lang.Class[0]), null);
                    } catch (java.lang.ClassNotFoundException | java.lang.NoSuchMethodException unused) {
                        return new com.google.android.libraries.places.internal.zzccr(provider3);
                    }
                } catch (java.lang.IllegalAccessException | java.lang.NoSuchMethodException | java.lang.reflect.InvocationTargetException | java.security.KeyManagementException | java.security.NoSuchAlgorithmException unused2) {
                    java.lang.Class<?> cls = java.lang.Class.forName("org.eclipse.jetty.alpn.ALPN");
                    java.lang.StringBuilder sb = new java.lang.StringBuilder(36);
                    sb.append("org.eclipse.jetty.alpn.ALPN");
                    sb.append("$Provider");
                    java.lang.Class<?> cls2 = java.lang.Class.forName(sb.toString());
                    java.lang.StringBuilder sb2 = new java.lang.StringBuilder(42);
                    sb2.append("org.eclipse.jetty.alpn.ALPN");
                    sb2.append("$ClientProvider");
                    java.lang.Class<?> cls3 = java.lang.Class.forName(sb2.toString());
                    java.lang.StringBuilder sb3 = new java.lang.StringBuilder(42);
                    sb3.append("org.eclipse.jetty.alpn.ALPN");
                    sb3.append("$ServerProvider");
                    return new com.google.android.libraries.places.internal.zzccp(cls.getMethod("put", javax.net.ssl.SSLSocket.class, cls2), cls.getMethod("get", javax.net.ssl.SSLSocket.class), cls.getMethod("remove", javax.net.ssl.SSLSocket.class), cls3, java.lang.Class.forName(sb3.toString()), provider3);
                }
            } catch (java.security.NoSuchAlgorithmException e) {
                throw new java.lang.RuntimeException(e);
            }
        }
        com.google.android.libraries.places.internal.zzccm zzccmVar = new com.google.android.libraries.places.internal.zzccm(null, "setUseSessionTickets", java.lang.Boolean.TYPE);
        com.google.android.libraries.places.internal.zzccm zzccmVar2 = new com.google.android.libraries.places.internal.zzccm(null, "setHostname", java.lang.String.class);
        com.google.android.libraries.places.internal.zzccm zzccmVar3 = new com.google.android.libraries.places.internal.zzccm(byte[].class, "getAlpnSelectedProtocol", new java.lang.Class[0]);
        com.google.android.libraries.places.internal.zzccm zzccmVar4 = new com.google.android.libraries.places.internal.zzccm(null, "setAlpnProtocols", byte[].class);
        try {
            java.lang.Class<?> cls4 = java.lang.Class.forName("android.net.TrafficStats");
            java.lang.reflect.Method method4 = cls4.getMethod("tagSocket", java.net.Socket.class);
            try {
                method = cls4.getMethod("untagSocket", java.net.Socket.class);
            } catch (java.lang.ClassNotFoundException | java.lang.NoSuchMethodException unused3) {
            }
            method2 = method4;
            method3 = method;
        } catch (java.lang.ClassNotFoundException | java.lang.NoSuchMethodException unused4) {
            method2 = null;
            method3 = null;
        }
        if (!provider.getName().equals(com.google.android.gms.security.ProviderInstaller.PROVIDER_NAME) && !provider.getName().equals("Conscrypt") && !provider.getName().equals("Ssl_Guard")) {
            try {
                com.google.android.libraries.places.internal.zzccr.class.getClassLoader().loadClass("android.net.Network");
            } catch (java.lang.ClassNotFoundException e2) {
                zza.logp(java.util.logging.Level.FINE, "io.grpc.okhttp.internal.Platform", "isAtLeastAndroid5", "Can't find class", (java.lang.Throwable) e2);
                try {
                    com.google.android.libraries.places.internal.zzccr.class.getClassLoader().loadClass("android.app.ActivityOptions");
                    i = 2;
                } catch (java.lang.ClassNotFoundException e3) {
                    zza.logp(java.util.logging.Level.FINE, "io.grpc.okhttp.internal.Platform", "isAtLeastAndroid41", "Can't find class", (java.lang.Throwable) e3);
                    i = 3;
                }
            }
        }
        i = 1;
        return new com.google.android.libraries.places.internal.zzccn(zzccmVar, zzccmVar2, method2, method3, zzccmVar3, zzccmVar4, provider, i);
    }

    public void zza(javax.net.ssl.SSLSocket sSLSocket, java.lang.String str, java.util.List list) {
    }

    public java.lang.String zzb(javax.net.ssl.SSLSocket sSLSocket) {
        return null;
    }

    public int zzc() {
        return 3;
    }

    public void zzd(javax.net.ssl.SSLSocket sSLSocket) {
    }

    public final java.security.Provider zzf() {
        return this.zzd;
    }

    public static com.google.android.libraries.places.internal.zzccr zze() {
        return zzc;
    }

    public zzccr(java.security.Provider provider) {
        this.zzd = provider;
    }
}
