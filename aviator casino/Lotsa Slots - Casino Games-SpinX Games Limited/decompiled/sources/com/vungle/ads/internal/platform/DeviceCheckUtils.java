package com.vungle.ads.internal.platform;

/* compiled from: DeviceCheckUtils.kt */
@kotlin.Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0010\u0010\u0003\u001a\u00020\u00042\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006J\u000e\u0010\u0007\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\tJ\u000e\u0010\n\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\tJ\u000e\u0010\u000b\u001a\u00020\f2\u0006\u0010\b\u001a\u00020\tJ\u000e\u0010\r\u001a\u00020\u000e2\u0006\u0010\b\u001a\u00020\tJ\u0006\u0010\u000f\u001a\u00020\u000eJ\u000e\u0010\u0010\u001a\u00020\u000e2\u0006\u0010\b\u001a\u00020\tJ\u000e\u0010\u0011\u001a\u00020\u000e2\u0006\u0010\b\u001a\u00020\tJ\u000e\u0010\u0012\u001a\u00020\u000e*\u0004\u0018\u00010\u0013H\u0002¨\u0006\u0014"}, d2 = {"Lcom/vungle/ads/internal/platform/DeviceCheckUtils;", "", "()V", "classifyNetworkError", "", "cause", "", "getActiveNetworkType", "context", "Landroid/content/Context;", "getPrivateDnsInfo", "getSensorCount", "", "hasSystemAlertWindowPermission", "", "isEmulator", "isProxyEnabled", "isVpnConnected", "isEnabled", "Landroid/net/ProxyInfo;", "vungle-ads_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
/* loaded from: classes6.dex */
public final class DeviceCheckUtils {
    public static final com.vungle.ads.internal.platform.DeviceCheckUtils INSTANCE = new com.vungle.ads.internal.platform.DeviceCheckUtils();

    private DeviceCheckUtils() {
    }

    /* JADX WARN: Code restructure failed: missing block: B:12:0x0031, code lost:
    
        if (r4 == null) goto L16;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x0041, code lost:
    
        if (r5 == null) goto L21;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x0051, code lost:
    
        if (r6 == null) goto L26;
     */
    /* JADX WARN: Code restructure failed: missing block: B:4:0x0011, code lost:
    
        if (r0 == null) goto L6;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x0021, code lost:
    
        if (r3 == null) goto L11;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean isEmulator() {
        java.lang.String str;
        java.lang.String str2;
        java.lang.String str3;
        java.lang.String str4;
        java.lang.String str5;
        java.lang.String str6 = android.os.Build.FINGERPRINT;
        java.lang.String str7 = "";
        if (str6 != null) {
            str = str6.toLowerCase(java.util.Locale.ROOT);
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(str, "this as java.lang.String).toLowerCase(Locale.ROOT)");
        }
        str = "";
        java.lang.String str8 = android.os.Build.MODEL;
        if (str8 != null) {
            str2 = str8.toLowerCase(java.util.Locale.ROOT);
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(str2, "this as java.lang.String).toLowerCase(Locale.ROOT)");
        }
        str2 = "";
        java.lang.String str9 = android.os.Build.PRODUCT;
        if (str9 != null) {
            str3 = str9.toLowerCase(java.util.Locale.ROOT);
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(str3, "this as java.lang.String).toLowerCase(Locale.ROOT)");
        }
        str3 = "";
        java.lang.String str10 = android.os.Build.BRAND;
        if (str10 != null) {
            str4 = str10.toLowerCase(java.util.Locale.ROOT);
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(str4, "this as java.lang.String).toLowerCase(Locale.ROOT)");
        }
        str4 = "";
        java.lang.String str11 = android.os.Build.MANUFACTURER;
        if (str11 != null) {
            str5 = str11.toLowerCase(java.util.Locale.ROOT);
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(str5, "this as java.lang.String).toLowerCase(Locale.ROOT)");
        }
        str5 = "";
        java.lang.String str12 = android.os.Build.BOARD;
        if (str12 != null) {
            java.lang.String lowerCase = str12.toLowerCase(java.util.Locale.ROOT);
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(lowerCase, "this as java.lang.String).toLowerCase(Locale.ROOT)");
            if (lowerCase != null) {
                str7 = lowerCase;
            }
        }
        java.lang.String[] SUPPORTED_ABIS = android.os.Build.SUPPORTED_ABIS;
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(SUPPORTED_ABIS, "SUPPORTED_ABIS");
        java.lang.String lowerCase2 = kotlin.collections.ArraysKt.joinToString$default(SUPPORTED_ABIS, (java.lang.CharSequence) null, (java.lang.CharSequence) null, (java.lang.CharSequence) null, 0, (java.lang.CharSequence) null, (kotlin.jvm.functions.Function1) null, 63, (java.lang.Object) null).toLowerCase(java.util.Locale.ROOT);
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(lowerCase2, "this as java.lang.String).toLowerCase(Locale.ROOT)");
        java.lang.String str13 = str;
        if (!kotlin.text.StringsKt.contains$default((java.lang.CharSequence) str13, (java.lang.CharSequence) "generic", false, 2, (java.lang.Object) null) && !kotlin.text.StringsKt.contains$default((java.lang.CharSequence) str13, (java.lang.CharSequence) "emulator", false, 2, (java.lang.Object) null)) {
            java.lang.String str14 = str2;
            if (!kotlin.text.StringsKt.contains$default((java.lang.CharSequence) str14, (java.lang.CharSequence) "google_sdk", false, 2, (java.lang.Object) null) && !kotlin.text.StringsKt.contains$default((java.lang.CharSequence) str14, (java.lang.CharSequence) "emulator", false, 2, (java.lang.Object) null)) {
                java.lang.String str15 = str3;
                if (!kotlin.text.StringsKt.contains$default((java.lang.CharSequence) str15, (java.lang.CharSequence) "sdk", false, 2, (java.lang.Object) null) && !kotlin.text.StringsKt.contains$default((java.lang.CharSequence) str15, (java.lang.CharSequence) "vbox", false, 2, (java.lang.Object) null) && !kotlin.text.StringsKt.contains$default((java.lang.CharSequence) str4, (java.lang.CharSequence) "generic", false, 2, (java.lang.Object) null) && !kotlin.text.StringsKt.contains$default((java.lang.CharSequence) str5, (java.lang.CharSequence) "genymotion", false, 2, (java.lang.Object) null) && !kotlin.text.StringsKt.contains$default((java.lang.CharSequence) str7, (java.lang.CharSequence) "nox", false, 2, (java.lang.Object) null) && !kotlin.text.StringsKt.contains$default((java.lang.CharSequence) lowerCase2, (java.lang.CharSequence) "x86", false, 2, (java.lang.Object) null)) {
                    return false;
                }
            }
        }
        return true;
    }

    public final boolean isVpnConnected(android.content.Context context) {
        java.lang.Object m10798constructorimpl;
        boolean z;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(context, "context");
        try {
            kotlin.Result.Companion companion = kotlin.Result.INSTANCE;
            com.vungle.ads.internal.platform.DeviceCheckUtils deviceCheckUtils = this;
            java.lang.Object systemService = context.getSystemService("connectivity");
            kotlin.jvm.internal.Intrinsics.checkNotNull(systemService, "null cannot be cast to non-null type android.net.ConnectivityManager");
            android.net.ConnectivityManager connectivityManager = (android.net.ConnectivityManager) systemService;
            android.net.Network[] allNetworks = connectivityManager.getAllNetworks();
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(allNetworks, "cm.allNetworks");
            android.net.Network[] networkArr = allNetworks;
            int length = networkArr.length;
            int i = 0;
            while (true) {
                if (i >= length) {
                    z = false;
                    break;
                }
                android.net.NetworkCapabilities networkCapabilities = connectivityManager.getNetworkCapabilities(networkArr[i]);
                if (networkCapabilities != null) {
                    z = true;
                    if (networkCapabilities.hasTransport(4)) {
                        break;
                    }
                }
                i++;
            }
            m10798constructorimpl = kotlin.Result.m10798constructorimpl(java.lang.Boolean.valueOf(z));
        } catch (java.lang.Throwable th) {
            kotlin.Result.Companion companion2 = kotlin.Result.INSTANCE;
            m10798constructorimpl = kotlin.Result.m10798constructorimpl(kotlin.ResultKt.createFailure(th));
        }
        if (kotlin.Result.m10804isFailureimpl(m10798constructorimpl)) {
            m10798constructorimpl = false;
        }
        return ((java.lang.Boolean) m10798constructorimpl).booleanValue();
    }

    public final boolean hasSystemAlertWindowPermission(android.content.Context context) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(context, "context");
        if (android.os.Build.VERSION.SDK_INT >= 23) {
            return android.provider.Settings.canDrawOverlays(context);
        }
        return context.checkCallingOrSelfPermission("android.permission.SYSTEM_ALERT_WINDOW") == 0;
    }

    public final int getSensorCount(android.content.Context context) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(context, "context");
        java.lang.Object systemService = context.getSystemService("sensor");
        kotlin.jvm.internal.Intrinsics.checkNotNull(systemService, "null cannot be cast to non-null type android.hardware.SensorManager");
        return ((android.hardware.SensorManager) systemService).getSensorList(-1).size();
    }

    private final boolean isEnabled(android.net.ProxyInfo proxyInfo) {
        if (proxyInfo == null) {
            return false;
        }
        java.lang.String host = proxyInfo.getHost();
        return (host != null && host.length() > 0 && proxyInfo.getPort() > 0) || (proxyInfo.getPacFileUrl() != null && !kotlin.jvm.internal.Intrinsics.areEqual(proxyInfo.getPacFileUrl(), android.net.Uri.EMPTY));
    }

    public final java.lang.String getPrivateDnsInfo(android.content.Context context) {
        java.lang.Object m10798constructorimpl;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(context, "context");
        if (android.os.Build.VERSION.SDK_INT < 28) {
            return "n/a";
        }
        try {
            kotlin.Result.Companion companion = kotlin.Result.INSTANCE;
            com.vungle.ads.internal.platform.DeviceCheckUtils deviceCheckUtils = this;
            java.lang.String string = android.provider.Settings.Global.getString(context.getContentResolver(), "private_dns_mode");
            if (string == null) {
                string = "opportunistic";
            } else {
                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(string, "Settings.Global.getStrin…mode\") ?: \"opportunistic\"");
            }
            if (kotlin.jvm.internal.Intrinsics.areEqual(string, "hostname")) {
                java.lang.String string2 = android.provider.Settings.Global.getString(context.getContentResolver(), "private_dns_specifier");
                if (string2 == null) {
                    string2 = "";
                } else {
                    kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(string2, "Settings.Global.getStrin…ate_dns_specifier\") ?: \"\"");
                }
                string = "hostname(" + string2 + ')';
            }
            m10798constructorimpl = kotlin.Result.m10798constructorimpl(string);
        } catch (java.lang.Throwable th) {
            kotlin.Result.Companion companion2 = kotlin.Result.INSTANCE;
            m10798constructorimpl = kotlin.Result.m10798constructorimpl(kotlin.ResultKt.createFailure(th));
        }
        if (kotlin.Result.m10804isFailureimpl(m10798constructorimpl)) {
            m10798constructorimpl = "unknown";
        }
        return (java.lang.String) m10798constructorimpl;
    }

    public final java.lang.String getActiveNetworkType(android.content.Context context) {
        java.lang.Object obj;
        java.lang.String typeName;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(context, "context");
        try {
            kotlin.Result.Companion companion = kotlin.Result.INSTANCE;
            com.vungle.ads.internal.platform.DeviceCheckUtils deviceCheckUtils = this;
            java.lang.Object systemService = context.getSystemService("connectivity");
            kotlin.jvm.internal.Intrinsics.checkNotNull(systemService, "null cannot be cast to non-null type android.net.ConnectivityManager");
            android.net.ConnectivityManager connectivityManager = (android.net.ConnectivityManager) systemService;
            java.lang.String str = "none";
            if (android.os.Build.VERSION.SDK_INT >= 23) {
                android.net.Network activeNetwork = connectivityManager.getActiveNetwork();
                if (activeNetwork != null) {
                    kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(activeNetwork, "cm.activeNetwork ?: return@runCatching \"none\"");
                    android.net.NetworkCapabilities networkCapabilities = connectivityManager.getNetworkCapabilities(activeNetwork);
                    if (networkCapabilities == null) {
                        str = "unknown";
                    } else {
                        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(networkCapabilities, "cm.getNetworkCapabilitie…urn@runCatching \"unknown\"");
                        java.lang.StringBuilder sb = new java.lang.StringBuilder();
                        if (networkCapabilities.hasTransport(1)) {
                            sb.append(com.ironsource.T3.b);
                        } else if (networkCapabilities.hasTransport(0)) {
                            sb.append(com.ironsource.T3.g);
                        } else if (networkCapabilities.hasTransport(3)) {
                            sb.append(com.ironsource.T3.e);
                        } else {
                            sb.append("other");
                        }
                        if (networkCapabilities.hasTransport(4)) {
                            sb.append("+vpn");
                        }
                        if (connectivityManager.isActiveNetworkMetered()) {
                            sb.append("+metered");
                        }
                        str = sb.toString();
                        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(str, "StringBuilder().apply(builderAction).toString()");
                    }
                }
            } else {
                android.net.NetworkInfo activeNetworkInfo = connectivityManager.getActiveNetworkInfo();
                if (activeNetworkInfo != null && (typeName = activeNetworkInfo.getTypeName()) != null) {
                    kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(typeName, "typeName");
                    java.lang.String lowerCase = typeName.toLowerCase(java.util.Locale.ROOT);
                    kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(lowerCase, "this as java.lang.String).toLowerCase(Locale.ROOT)");
                    if (lowerCase != null) {
                        str = lowerCase;
                    }
                }
            }
            obj = kotlin.Result.m10798constructorimpl(str);
        } catch (java.lang.Throwable th) {
            kotlin.Result.Companion companion2 = kotlin.Result.INSTANCE;
            obj = kotlin.Result.m10798constructorimpl(kotlin.ResultKt.createFailure(th));
        }
        return (java.lang.String) (kotlin.Result.m10804isFailureimpl(obj) ? "unknown" : obj);
    }

    public final java.lang.String classifyNetworkError(java.lang.Throwable cause) {
        boolean z;
        if (cause == null) {
            return "none";
        }
        java.util.Iterator it = kotlin.sequences.SequencesKt.generateSequence(cause, new kotlin.jvm.functions.Function1<java.lang.Throwable, java.lang.Throwable>() { // from class: com.vungle.ads.internal.platform.DeviceCheckUtils$classifyNetworkError$hasCertFailure$1
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Throwable invoke(java.lang.Throwable it2) {
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(it2, "it");
                return it2.getCause();
            }
        }).iterator();
        while (true) {
            if (!it.hasNext()) {
                z = false;
                break;
            }
            if (((java.lang.Throwable) it.next()) instanceof java.security.cert.CertificateException) {
                z = true;
                break;
            }
        }
        boolean z2 = cause instanceof javax.net.ssl.SSLHandshakeException;
        if (z2 && z) {
            return "SSL_CERT_ERROR";
        }
        if (z2) {
            return "SSL_HANDSHAKE";
        }
        if (cause instanceof javax.net.ssl.SSLPeerUnverifiedException) {
            return "SSL_PEER_UNVERIFIED";
        }
        if (cause instanceof javax.net.ssl.SSLException) {
            return "SSL_ERROR";
        }
        if (cause instanceof java.net.UnknownHostException) {
            return "DNS_FAILURE";
        }
        if (cause instanceof java.net.ConnectException) {
            return "CONNECT_FAILURE";
        }
        if (cause instanceof java.net.SocketTimeoutException) {
            return "TIMEOUT";
        }
        if (cause instanceof java.net.SocketException) {
            java.net.SocketException socketException = (java.net.SocketException) cause;
            java.lang.String message = socketException.getMessage();
            if (message != null && kotlin.text.StringsKt.contains((java.lang.CharSequence) message, (java.lang.CharSequence) "reset", true)) {
                return "CONNECTION_RESET";
            }
            java.lang.String message2 = socketException.getMessage();
            if (message2 != null && kotlin.text.StringsKt.contains((java.lang.CharSequence) message2, (java.lang.CharSequence) "abort", true)) {
                return "CONNECTION_ABORT";
            }
            java.lang.String message3 = socketException.getMessage();
            return (message3 == null || !kotlin.text.StringsKt.contains((java.lang.CharSequence) message3, (java.lang.CharSequence) "closed", true)) ? "SOCKET_ERROR" : "CONNECTION_CLOSED";
        }
        java.lang.String simpleName = cause.getClass().getSimpleName();
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(simpleName, "cause.javaClass.simpleName");
        return simpleName;
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0090  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean isProxyEnabled(android.content.Context context) {
        java.lang.Object m10798constructorimpl;
        android.net.ConnectivityManager connectivityManager;
        boolean z;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(context, "context");
        try {
            kotlin.Result.Companion companion = kotlin.Result.INSTANCE;
            com.vungle.ads.internal.platform.DeviceCheckUtils deviceCheckUtils = this;
            java.lang.Object systemService = context.getSystemService("connectivity");
            kotlin.jvm.internal.Intrinsics.checkNotNull(systemService, "null cannot be cast to non-null type android.net.ConnectivityManager");
            connectivityManager = (android.net.ConnectivityManager) systemService;
        } catch (java.lang.Throwable th) {
            kotlin.Result.Companion companion2 = kotlin.Result.INSTANCE;
            m10798constructorimpl = kotlin.Result.m10798constructorimpl(kotlin.ResultKt.createFailure(th));
        }
        if (android.os.Build.VERSION.SDK_INT >= 23) {
            android.net.Network activeNetwork = connectivityManager.getActiveNetwork();
            if (activeNetwork != null) {
                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(activeNetwork, "cm.activeNetwork ?: return@runCatching false");
                android.net.LinkProperties linkProperties = connectivityManager.getLinkProperties(activeNetwork);
                z = isEnabled(linkProperties != null ? linkProperties.getHttpProxy() : null);
                m10798constructorimpl = kotlin.Result.m10798constructorimpl(java.lang.Boolean.valueOf(z));
                if (kotlin.Result.m10804isFailureimpl(m10798constructorimpl)) {
                    m10798constructorimpl = false;
                }
                return ((java.lang.Boolean) m10798constructorimpl).booleanValue();
            }
            z = false;
            m10798constructorimpl = kotlin.Result.m10798constructorimpl(java.lang.Boolean.valueOf(z));
            if (kotlin.Result.m10804isFailureimpl(m10798constructorimpl)) {
            }
            return ((java.lang.Boolean) m10798constructorimpl).booleanValue();
        }
        android.net.Network[] allNetworks = connectivityManager.getAllNetworks();
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(allNetworks, "cm.allNetworks");
        for (android.net.Network network : allNetworks) {
            android.net.NetworkInfo networkInfo = connectivityManager.getNetworkInfo(network);
            if (networkInfo != null && networkInfo.isConnected()) {
                android.net.LinkProperties linkProperties2 = connectivityManager.getLinkProperties(network);
                if (isEnabled(linkProperties2 != null ? linkProperties2.getHttpProxy() : null)) {
                    z = true;
                    break;
                }
            }
        }
        z = false;
        m10798constructorimpl = kotlin.Result.m10798constructorimpl(java.lang.Boolean.valueOf(z));
        if (kotlin.Result.m10804isFailureimpl(m10798constructorimpl)) {
        }
        return ((java.lang.Boolean) m10798constructorimpl).booleanValue();
        kotlin.Result.Companion companion22 = kotlin.Result.INSTANCE;
        m10798constructorimpl = kotlin.Result.m10798constructorimpl(kotlin.ResultKt.createFailure(th));
        if (kotlin.Result.m10804isFailureimpl(m10798constructorimpl)) {
        }
        return ((java.lang.Boolean) m10798constructorimpl).booleanValue();
    }
}
