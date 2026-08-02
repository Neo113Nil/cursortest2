package com.google.android.libraries.places.internal;

/* loaded from: classes4.dex */
final class zzcbt extends com.google.android.libraries.places.internal.zzcbu {
    private static final com.google.android.libraries.places.internal.zzccm zzb = new com.google.android.libraries.places.internal.zzccm(null, "setUseSessionTickets", java.lang.Boolean.TYPE);
    private static final com.google.android.libraries.places.internal.zzccm zzc = new com.google.android.libraries.places.internal.zzccm(null, "setHostname", java.lang.String.class);
    private static final com.google.android.libraries.places.internal.zzccm zzd = new com.google.android.libraries.places.internal.zzccm(byte[].class, "getAlpnSelectedProtocol", new java.lang.Class[0]);
    private static final com.google.android.libraries.places.internal.zzccm zze = new com.google.android.libraries.places.internal.zzccm(null, "setAlpnProtocols", byte[].class);
    private static final com.google.android.libraries.places.internal.zzccm zzf = new com.google.android.libraries.places.internal.zzccm(byte[].class, "getNpnSelectedProtocol", new java.lang.Class[0]);
    private static final com.google.android.libraries.places.internal.zzccm zzg = new com.google.android.libraries.places.internal.zzccm(null, "setNpnProtocols", byte[].class);
    private static final java.lang.reflect.Method zzh;
    private static final java.lang.reflect.Method zzi;
    private static final java.lang.reflect.Method zzj;
    private static final java.lang.reflect.Method zzk;
    private static final java.lang.reflect.Method zzl;
    private static final java.lang.reflect.Method zzm;
    private static final java.lang.reflect.Constructor zzn;

    static {
        java.lang.reflect.Method method;
        java.lang.reflect.Method method2;
        java.lang.reflect.Method method3;
        java.lang.NoSuchMethodException noSuchMethodException;
        java.lang.reflect.Method method4;
        java.lang.ClassNotFoundException classNotFoundException;
        java.util.logging.Logger logger;
        java.lang.reflect.Method method5;
        java.lang.reflect.Method method6;
        java.lang.reflect.Method method7;
        java.lang.reflect.Method method8;
        java.util.logging.Logger logger2;
        java.lang.NoSuchMethodException noSuchMethodException2;
        java.lang.reflect.Method method9;
        java.lang.ClassNotFoundException classNotFoundException2;
        java.util.logging.Logger logger3;
        java.util.logging.Logger logger4;
        java.lang.reflect.Constructor<?> constructor = null;
        try {
            method = javax.net.ssl.SSLParameters.class.getMethod("setApplicationProtocols", java.lang.String[].class);
            try {
                method5 = javax.net.ssl.SSLParameters.class.getMethod("getApplicationProtocols", new java.lang.Class[0]);
                try {
                    method6 = javax.net.ssl.SSLSocket.class.getMethod("getApplicationProtocol", new java.lang.Class[0]);
                    try {
                        java.lang.Class<?> cls = java.lang.Class.forName("android.net.ssl.SSLSockets");
                        method7 = cls.getMethod("isSupportedSocket", javax.net.ssl.SSLSocket.class);
                        try {
                            method8 = cls.getMethod("setUseSessionTickets", javax.net.ssl.SSLSocket.class, java.lang.Boolean.TYPE);
                        } catch (java.lang.ClassNotFoundException e) {
                            classNotFoundException = e;
                            method4 = method5;
                            method2 = method6;
                            method3 = method7;
                            logger2 = com.google.android.libraries.places.internal.zzcbu.zzb;
                            logger2.logp(java.util.logging.Level.FINER, "io.grpc.okhttp.OkHttpProtocolNegotiator$AndroidNegotiator", "<clinit>", "Failed to find Android 10.0+ APIs", (java.lang.Throwable) classNotFoundException);
                            method5 = method4;
                            method6 = method2;
                            method7 = method3;
                            method8 = null;
                            zzj = method;
                            zzk = method5;
                            zzl = method6;
                            zzh = method7;
                            zzi = method8;
                            java.lang.reflect.Method method10 = javax.net.ssl.SSLParameters.class.getMethod("setServerNames", java.util.List.class);
                            try {
                                constructor = java.lang.Class.forName("javax.net.ssl.SNIHostName").getConstructor(java.lang.String.class);
                            } catch (java.lang.ClassNotFoundException e2) {
                                classNotFoundException2 = e2;
                                method9 = method10;
                                logger4 = com.google.android.libraries.places.internal.zzcbu.zzb;
                                logger4.logp(java.util.logging.Level.FINER, "io.grpc.okhttp.OkHttpProtocolNegotiator$AndroidNegotiator", "<clinit>", "Failed to find Android 7.0+ APIs", (java.lang.Throwable) classNotFoundException2);
                                method10 = method9;
                                zzm = method10;
                                zzn = constructor;
                            } catch (java.lang.NoSuchMethodException e3) {
                                noSuchMethodException2 = e3;
                                method9 = method10;
                                logger3 = com.google.android.libraries.places.internal.zzcbu.zzb;
                                logger3.logp(java.util.logging.Level.FINER, "io.grpc.okhttp.OkHttpProtocolNegotiator$AndroidNegotiator", "<clinit>", "Failed to find Android 7.0+ APIs", (java.lang.Throwable) noSuchMethodException2);
                                method10 = method9;
                                zzm = method10;
                                zzn = constructor;
                            }
                            zzm = method10;
                            zzn = constructor;
                        } catch (java.lang.NoSuchMethodException e4) {
                            noSuchMethodException = e4;
                            method4 = method5;
                            method2 = method6;
                            method3 = method7;
                            logger = com.google.android.libraries.places.internal.zzcbu.zzb;
                            logger.logp(java.util.logging.Level.FINER, "io.grpc.okhttp.OkHttpProtocolNegotiator$AndroidNegotiator", "<clinit>", "Failed to find Android 10.0+ APIs", (java.lang.Throwable) noSuchMethodException);
                            method5 = method4;
                            method6 = method2;
                            method7 = method3;
                            method8 = null;
                            zzj = method;
                            zzk = method5;
                            zzl = method6;
                            zzh = method7;
                            zzi = method8;
                            java.lang.reflect.Method method102 = javax.net.ssl.SSLParameters.class.getMethod("setServerNames", java.util.List.class);
                            constructor = java.lang.Class.forName("javax.net.ssl.SNIHostName").getConstructor(java.lang.String.class);
                            zzm = method102;
                            zzn = constructor;
                        }
                    } catch (java.lang.ClassNotFoundException e5) {
                        method3 = null;
                        classNotFoundException = e5;
                        method4 = method5;
                        method2 = method6;
                    } catch (java.lang.NoSuchMethodException e6) {
                        method3 = null;
                        noSuchMethodException = e6;
                        method4 = method5;
                        method2 = method6;
                    }
                } catch (java.lang.ClassNotFoundException e7) {
                    method2 = null;
                    method3 = null;
                    classNotFoundException = e7;
                    method4 = method5;
                } catch (java.lang.NoSuchMethodException e8) {
                    method2 = null;
                    method3 = null;
                    noSuchMethodException = e8;
                    method4 = method5;
                }
            } catch (java.lang.ClassNotFoundException e9) {
                e = e9;
                method2 = null;
                method3 = null;
                classNotFoundException = e;
                method4 = null;
                logger2 = com.google.android.libraries.places.internal.zzcbu.zzb;
                logger2.logp(java.util.logging.Level.FINER, "io.grpc.okhttp.OkHttpProtocolNegotiator$AndroidNegotiator", "<clinit>", "Failed to find Android 10.0+ APIs", (java.lang.Throwable) classNotFoundException);
                method5 = method4;
                method6 = method2;
                method7 = method3;
                method8 = null;
                zzj = method;
                zzk = method5;
                zzl = method6;
                zzh = method7;
                zzi = method8;
                java.lang.reflect.Method method1022 = javax.net.ssl.SSLParameters.class.getMethod("setServerNames", java.util.List.class);
                constructor = java.lang.Class.forName("javax.net.ssl.SNIHostName").getConstructor(java.lang.String.class);
                zzm = method1022;
                zzn = constructor;
            } catch (java.lang.NoSuchMethodException e10) {
                e = e10;
                method2 = null;
                method3 = null;
                noSuchMethodException = e;
                method4 = null;
                logger = com.google.android.libraries.places.internal.zzcbu.zzb;
                logger.logp(java.util.logging.Level.FINER, "io.grpc.okhttp.OkHttpProtocolNegotiator$AndroidNegotiator", "<clinit>", "Failed to find Android 10.0+ APIs", (java.lang.Throwable) noSuchMethodException);
                method5 = method4;
                method6 = method2;
                method7 = method3;
                method8 = null;
                zzj = method;
                zzk = method5;
                zzl = method6;
                zzh = method7;
                zzi = method8;
                java.lang.reflect.Method method10222 = javax.net.ssl.SSLParameters.class.getMethod("setServerNames", java.util.List.class);
                constructor = java.lang.Class.forName("javax.net.ssl.SNIHostName").getConstructor(java.lang.String.class);
                zzm = method10222;
                zzn = constructor;
            }
        } catch (java.lang.ClassNotFoundException e11) {
            e = e11;
            method = null;
        } catch (java.lang.NoSuchMethodException e12) {
            e = e12;
            method = null;
        }
        zzj = method;
        zzk = method5;
        zzl = method6;
        zzh = method7;
        zzi = method8;
        try {
            java.lang.reflect.Method method102222 = javax.net.ssl.SSLParameters.class.getMethod("setServerNames", java.util.List.class);
            constructor = java.lang.Class.forName("javax.net.ssl.SNIHostName").getConstructor(java.lang.String.class);
        } catch (java.lang.ClassNotFoundException e13) {
            classNotFoundException2 = e13;
            method9 = null;
        } catch (java.lang.NoSuchMethodException e14) {
            noSuchMethodException2 = e14;
            method9 = null;
        }
        zzm = method102222;
        zzn = constructor;
    }

    zzcbt(com.google.android.libraries.places.internal.zzccr zzccrVar) {
        super(zzccrVar);
    }

    @Override // com.google.android.libraries.places.internal.zzcbu
    public final java.lang.String zza(javax.net.ssl.SSLSocket sSLSocket, java.lang.String str, java.util.List list) throws java.io.IOException {
        java.lang.String zzc2 = zzc(sSLSocket);
        return zzc2 == null ? super.zza(sSLSocket, str, list) : zzc2;
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x010b  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0117  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x011d  */
    @Override // com.google.android.libraries.places.internal.zzcbu
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    protected final void zzb(javax.net.ssl.SSLSocket sSLSocket, java.lang.String str, java.util.List list) {
        java.lang.reflect.Constructor constructor;
        java.util.logging.Logger logger;
        boolean z;
        com.google.android.libraries.places.internal.zzccr zzccrVar;
        java.lang.reflect.Method method;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.util.Iterator it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(((com.google.android.libraries.places.internal.zzccs) it.next()).toString());
        }
        java.lang.String[] strArr = (java.lang.String[]) arrayList.toArray(new java.lang.String[0]);
        javax.net.ssl.SSLParameters sSLParameters = sSLSocket.getSSLParameters();
        if (str != null) {
            try {
                try {
                    if (!str.contains("_")) {
                        try {
                            com.google.common.base.Preconditions.checkArgument(com.google.android.libraries.places.internal.zzbsz.zzb(str).getAuthority().indexOf(64) == -1, "Userinfo must not be present on authority: '%s'", str);
                            java.lang.reflect.Method method2 = zzh;
                            if (method2 == null || !((java.lang.Boolean) method2.invoke(null, sSLSocket)).booleanValue()) {
                                zzb.zzb(sSLSocket, java.lang.Boolean.TRUE);
                            } else {
                                zzi.invoke(null, sSLSocket, java.lang.Boolean.TRUE);
                            }
                            java.lang.reflect.Method method3 = zzm;
                            if (method3 == null || (constructor = zzn) == null || com.google.common.net.InetAddresses.isInetAddress(com.google.common.net.HostAndPort.fromString(str).getHost())) {
                                zzc.zzb(sSLSocket, str);
                            } else {
                                method3.invoke(sSLParameters, java.util.Collections.singletonList(constructor.newInstance(str)));
                            }
                        } catch (java.lang.IllegalArgumentException unused) {
                        }
                    }
                } catch (java.lang.reflect.InvocationTargetException e) {
                    throw new java.lang.RuntimeException(e);
                }
            } catch (java.lang.IllegalAccessException e2) {
                throw new java.lang.RuntimeException(e2);
            } catch (java.lang.InstantiationException e3) {
                throw new java.lang.RuntimeException(e3);
            }
        }
        java.lang.reflect.Method method4 = zzl;
        if (method4 != null) {
            try {
                method4.invoke(sSLSocket, new java.lang.Object[0]);
                zzj.invoke(sSLParameters, strArr);
                z = true;
            } catch (java.lang.reflect.InvocationTargetException e4) {
                if (!(e4.getTargetException() instanceof java.lang.UnsupportedOperationException)) {
                    throw e4;
                }
                logger = com.google.android.libraries.places.internal.zzcbu.zzb;
                logger.logp(java.util.logging.Level.FINER, "io.grpc.okhttp.OkHttpProtocolNegotiator$AndroidNegotiator", "configureTlsExtensions", "setApplicationProtocol unsupported, will try old methods");
            }
            sSLSocket.setSSLParameters(sSLParameters);
            if (z || (method = zzk) == null || !java.util.Arrays.equals(strArr, (java.lang.String[]) method.invoke(sSLSocket.getSSLParameters(), new java.lang.Object[0]))) {
                java.lang.Object[] objArr = {com.google.android.libraries.places.internal.zzccr.zzg(list)};
                zzccrVar = this.zza;
                if (zzccrVar.zzc() == 1) {
                    zze.zzc(sSLSocket, objArr);
                }
                if (zzccrVar.zzc() != 3) {
                    throw new java.lang.RuntimeException("We can not do TLS handshake on this Android version, please install the Google Play Services Dynamic Security Provider to use TLS");
                }
                zzg.zzc(sSLSocket, objArr);
                return;
            }
            return;
        }
        z = false;
        sSLSocket.setSSLParameters(sSLParameters);
        if (z) {
        }
        java.lang.Object[] objArr2 = {com.google.android.libraries.places.internal.zzccr.zzg(list)};
        zzccrVar = this.zza;
        if (zzccrVar.zzc() == 1) {
        }
        if (zzccrVar.zzc() != 3) {
        }
    }

    @Override // com.google.android.libraries.places.internal.zzcbu
    public final java.lang.String zzc(javax.net.ssl.SSLSocket sSLSocket) {
        java.util.logging.Logger logger;
        java.util.logging.Logger logger2;
        java.util.logging.Logger logger3;
        java.lang.reflect.Method method = zzl;
        if (method != null) {
            try {
                return (java.lang.String) method.invoke(sSLSocket, new java.lang.Object[0]);
            } catch (java.lang.IllegalAccessException e) {
                throw new java.lang.RuntimeException(e);
            } catch (java.lang.reflect.InvocationTargetException e2) {
                if (!(e2.getTargetException() instanceof java.lang.UnsupportedOperationException)) {
                    throw new java.lang.RuntimeException(e2);
                }
                logger = com.google.android.libraries.places.internal.zzcbu.zzb;
                logger.logp(java.util.logging.Level.FINER, "io.grpc.okhttp.OkHttpProtocolNegotiator$AndroidNegotiator", "getSelectedProtocol", "Socket unsupported for getApplicationProtocol, will try old methods");
            }
        }
        if (this.zza.zzc() == 1) {
            try {
                byte[] bArr = (byte[]) zzd.zzc(sSLSocket, new java.lang.Object[0]);
                if (bArr != null) {
                    return new java.lang.String(bArr, com.google.android.libraries.places.internal.zzccu.zzb);
                }
            } catch (java.lang.Exception e3) {
                logger2 = com.google.android.libraries.places.internal.zzcbu.zzb;
                logger2.logp(java.util.logging.Level.FINE, "io.grpc.okhttp.OkHttpProtocolNegotiator$AndroidNegotiator", "getSelectedProtocol", "Failed calling getAlpnSelectedProtocol()", (java.lang.Throwable) e3);
            }
        }
        if (this.zza.zzc() == 3) {
            return null;
        }
        try {
            byte[] bArr2 = (byte[]) zzf.zzc(sSLSocket, new java.lang.Object[0]);
            if (bArr2 != null) {
                return new java.lang.String(bArr2, com.google.android.libraries.places.internal.zzccu.zzb);
            }
            return null;
        } catch (java.lang.Exception e4) {
            logger3 = com.google.android.libraries.places.internal.zzcbu.zzb;
            logger3.logp(java.util.logging.Level.FINE, "io.grpc.okhttp.OkHttpProtocolNegotiator$AndroidNegotiator", "getSelectedProtocol", "Failed calling getNpnSelectedProtocol()", (java.lang.Throwable) e4);
            return null;
        }
    }
}
