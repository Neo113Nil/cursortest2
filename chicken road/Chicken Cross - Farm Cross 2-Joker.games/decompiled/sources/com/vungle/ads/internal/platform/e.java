package com.vungle.ads.internal.platform;

import android.content.Context;
import android.hardware.SensorManager;
import android.net.ConnectivityManager;
import android.net.LinkProperties;
import android.net.Network;
import android.net.NetworkCapabilities;
import android.net.ProxyInfo;
import android.net.Uri;
import android.os.Build;
import android.provider.Settings;
import com.ironsource.Q3;
import java.net.ConnectException;
import java.net.SocketException;
import java.net.SocketTimeoutException;
import java.net.UnknownHostException;
import java.security.cert.CertificateException;
import java.util.Iterator;
import java.util.Locale;
import javax.net.ssl.SSLException;
import javax.net.ssl.SSLHandshakeException;
import javax.net.ssl.SSLPeerUnverifiedException;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.collections.ArraysKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.sequences.SequencesKt;
import kotlin.text.StringsKt;

/* loaded from: classes7.dex */
public abstract class e {
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
    public static boolean a() {
        String str;
        String str2;
        String str3;
        String str4;
        String str5;
        String str6 = Build.FINGERPRINT;
        String str7 = "";
        if (str6 != null) {
            str = str6.toLowerCase(Locale.ROOT);
            Intrinsics.checkNotNullExpressionValue(str, "this as java.lang.String).toLowerCase(Locale.ROOT)");
        }
        str = "";
        String str8 = Build.MODEL;
        if (str8 != null) {
            str2 = str8.toLowerCase(Locale.ROOT);
            Intrinsics.checkNotNullExpressionValue(str2, "this as java.lang.String).toLowerCase(Locale.ROOT)");
        }
        str2 = "";
        String str9 = Build.PRODUCT;
        if (str9 != null) {
            str3 = str9.toLowerCase(Locale.ROOT);
            Intrinsics.checkNotNullExpressionValue(str3, "this as java.lang.String).toLowerCase(Locale.ROOT)");
        }
        str3 = "";
        String str10 = Build.BRAND;
        if (str10 != null) {
            str4 = str10.toLowerCase(Locale.ROOT);
            Intrinsics.checkNotNullExpressionValue(str4, "this as java.lang.String).toLowerCase(Locale.ROOT)");
        }
        str4 = "";
        String str11 = Build.MANUFACTURER;
        if (str11 != null) {
            str5 = str11.toLowerCase(Locale.ROOT);
            Intrinsics.checkNotNullExpressionValue(str5, "this as java.lang.String).toLowerCase(Locale.ROOT)");
        }
        str5 = "";
        String str12 = Build.BOARD;
        if (str12 != null) {
            String lowerCase = str12.toLowerCase(Locale.ROOT);
            Intrinsics.checkNotNullExpressionValue(lowerCase, "this as java.lang.String).toLowerCase(Locale.ROOT)");
            if (lowerCase != null) {
                str7 = lowerCase;
            }
        }
        String[] SUPPORTED_ABIS = Build.SUPPORTED_ABIS;
        Intrinsics.checkNotNullExpressionValue(SUPPORTED_ABIS, "SUPPORTED_ABIS");
        String lowerCase2 = ArraysKt.joinToString$default(SUPPORTED_ABIS, (CharSequence) null, (CharSequence) null, (CharSequence) null, 0, (CharSequence) null, (Function1) null, 63, (Object) null).toLowerCase(Locale.ROOT);
        Intrinsics.checkNotNullExpressionValue(lowerCase2, "this as java.lang.String).toLowerCase(Locale.ROOT)");
        return StringsKt.contains$default((CharSequence) str, (CharSequence) "generic", false, 2, (Object) null) || StringsKt.contains$default((CharSequence) str, (CharSequence) "emulator", false, 2, (Object) null) || StringsKt.contains$default((CharSequence) str2, (CharSequence) "google_sdk", false, 2, (Object) null) || StringsKt.contains$default((CharSequence) str2, (CharSequence) "emulator", false, 2, (Object) null) || StringsKt.contains$default((CharSequence) str3, (CharSequence) "sdk", false, 2, (Object) null) || StringsKt.contains$default((CharSequence) str3, (CharSequence) "vbox", false, 2, (Object) null) || StringsKt.contains$default((CharSequence) str4, (CharSequence) "generic", false, 2, (Object) null) || StringsKt.contains$default((CharSequence) str5, (CharSequence) "genymotion", false, 2, (Object) null) || StringsKt.contains$default((CharSequence) str7, (CharSequence) "nox", false, 2, (Object) null) || StringsKt.contains$default((CharSequence) lowerCase2, (CharSequence) "x86", false, 2, (Object) null);
    }

    public static String b(Context context) {
        Object m8079constructorimpl;
        Intrinsics.checkNotNullParameter(context, "context");
        if (Build.VERSION.SDK_INT < 28) {
            return "n/a";
        }
        try {
            Result.Companion companion = Result.INSTANCE;
            String string = Settings.Global.getString(context.getContentResolver(), "private_dns_mode");
            if (string == null) {
                string = "opportunistic";
            } else {
                Intrinsics.checkNotNullExpressionValue(string, "Settings.Global.getStrin…mode\") ?: \"opportunistic\"");
            }
            if (Intrinsics.areEqual(string, "hostname")) {
                String string2 = Settings.Global.getString(context.getContentResolver(), "private_dns_specifier");
                if (string2 == null) {
                    string2 = "";
                } else {
                    Intrinsics.checkNotNullExpressionValue(string2, "Settings.Global.getStrin…ate_dns_specifier\") ?: \"\"");
                }
                string = "hostname(" + string2 + ')';
            }
            m8079constructorimpl = Result.m8079constructorimpl(string);
        } catch (Throwable th) {
            Result.Companion companion2 = Result.INSTANCE;
            m8079constructorimpl = Result.m8079constructorimpl(ResultKt.createFailure(th));
        }
        if (Result.m8085isFailureimpl(m8079constructorimpl)) {
            m8079constructorimpl = "unknown";
        }
        return (String) m8079constructorimpl;
    }

    public static int c(Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        Object systemService = context.getSystemService("sensor");
        Intrinsics.checkNotNull(systemService, "null cannot be cast to non-null type android.hardware.SensorManager");
        return ((SensorManager) systemService).getSensorList(-1).size();
    }

    public static boolean e(Context context) {
        Object m8079constructorimpl;
        boolean a2;
        Intrinsics.checkNotNullParameter(context, "context");
        try {
            Result.Companion companion = Result.INSTANCE;
            Object systemService = context.getSystemService("connectivity");
            Intrinsics.checkNotNull(systemService, "null cannot be cast to non-null type android.net.ConnectivityManager");
            ConnectivityManager connectivityManager = (ConnectivityManager) systemService;
            Network activeNetwork = connectivityManager.getActiveNetwork();
            if (activeNetwork == null) {
                a2 = false;
            } else {
                Intrinsics.checkNotNullExpressionValue(activeNetwork, "cm.activeNetwork ?: return@runCatching false");
                LinkProperties linkProperties = connectivityManager.getLinkProperties(activeNetwork);
                a2 = a(linkProperties != null ? linkProperties.getHttpProxy() : null);
            }
            m8079constructorimpl = Result.m8079constructorimpl(Boolean.valueOf(a2));
        } catch (Throwable th) {
            Result.Companion companion2 = Result.INSTANCE;
            m8079constructorimpl = Result.m8079constructorimpl(ResultKt.createFailure(th));
        }
        Boolean bool = Boolean.FALSE;
        if (Result.m8085isFailureimpl(m8079constructorimpl)) {
            m8079constructorimpl = bool;
        }
        return ((Boolean) m8079constructorimpl).booleanValue();
    }

    public static boolean f(Context context) {
        Object m8079constructorimpl;
        Intrinsics.checkNotNullParameter(context, "context");
        try {
            Result.Companion companion = Result.INSTANCE;
            Object systemService = context.getSystemService("connectivity");
            Intrinsics.checkNotNull(systemService, "null cannot be cast to non-null type android.net.ConnectivityManager");
            ConnectivityManager connectivityManager = (ConnectivityManager) systemService;
            Network[] allNetworks = connectivityManager.getAllNetworks();
            Intrinsics.checkNotNullExpressionValue(allNetworks, "cm.allNetworks");
            int length = allNetworks.length;
            boolean z = false;
            int i = 0;
            while (true) {
                if (i < length) {
                    NetworkCapabilities networkCapabilities = connectivityManager.getNetworkCapabilities(allNetworks[i]);
                    if (networkCapabilities != null && networkCapabilities.hasTransport(4)) {
                        z = true;
                        break;
                    }
                    i++;
                } else {
                    break;
                }
            }
            m8079constructorimpl = Result.m8079constructorimpl(Boolean.valueOf(z));
        } catch (Throwable th) {
            Result.Companion companion2 = Result.INSTANCE;
            m8079constructorimpl = Result.m8079constructorimpl(ResultKt.createFailure(th));
        }
        Boolean bool = Boolean.FALSE;
        if (Result.m8085isFailureimpl(m8079constructorimpl)) {
            m8079constructorimpl = bool;
        }
        return ((Boolean) m8079constructorimpl).booleanValue();
    }

    public static boolean d(Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        return Settings.canDrawOverlays(context);
    }

    public static boolean a(ProxyInfo proxyInfo) {
        if (proxyInfo == null) {
            return false;
        }
        String host = proxyInfo.getHost();
        return (host != null && host.length() > 0 && proxyInfo.getPort() > 0) || (proxyInfo.getPacFileUrl() != null && !Intrinsics.areEqual(proxyInfo.getPacFileUrl(), Uri.EMPTY));
    }

    public static String a(Context context) {
        Object obj;
        String sb;
        Intrinsics.checkNotNullParameter(context, "context");
        try {
            Result.Companion companion = Result.INSTANCE;
            Object systemService = context.getSystemService("connectivity");
            Intrinsics.checkNotNull(systemService, "null cannot be cast to non-null type android.net.ConnectivityManager");
            ConnectivityManager connectivityManager = (ConnectivityManager) systemService;
            Network activeNetwork = connectivityManager.getActiveNetwork();
            if (activeNetwork == null) {
                sb = "none";
            } else {
                Intrinsics.checkNotNullExpressionValue(activeNetwork, "cm.activeNetwork ?: return@runCatching \"none\"");
                NetworkCapabilities networkCapabilities = connectivityManager.getNetworkCapabilities(activeNetwork);
                if (networkCapabilities == null) {
                    sb = "unknown";
                } else {
                    Intrinsics.checkNotNullExpressionValue(networkCapabilities, "cm.getNetworkCapabilitie…urn@runCatching \"unknown\"");
                    StringBuilder sb2 = new StringBuilder();
                    if (networkCapabilities.hasTransport(1)) {
                        sb2.append(Q3.b);
                    } else if (networkCapabilities.hasTransport(0)) {
                        sb2.append(Q3.g);
                    } else if (networkCapabilities.hasTransport(3)) {
                        sb2.append(Q3.e);
                    } else {
                        sb2.append("other");
                    }
                    if (networkCapabilities.hasTransport(4)) {
                        sb2.append("+vpn");
                    }
                    if (connectivityManager.isActiveNetworkMetered()) {
                        sb2.append("+metered");
                    }
                    sb = sb2.toString();
                    Intrinsics.checkNotNullExpressionValue(sb, "StringBuilder().apply(builderAction).toString()");
                }
            }
            obj = Result.m8079constructorimpl(sb);
        } catch (Throwable th) {
            Result.Companion companion2 = Result.INSTANCE;
            obj = Result.m8079constructorimpl(ResultKt.createFailure(th));
        }
        return (String) (Result.m8085isFailureimpl(obj) ? "unknown" : obj);
    }

    public static String a(Throwable th) {
        boolean z;
        if (th == null) {
            return "none";
        }
        Iterator it = SequencesKt.generateSequence(th, d.f12077a).iterator();
        while (true) {
            if (!it.hasNext()) {
                z = false;
                break;
            }
            if (((Throwable) it.next()) instanceof CertificateException) {
                z = true;
                break;
            }
        }
        boolean z2 = th instanceof SSLHandshakeException;
        if (z2 && z) {
            return "SSL_CERT_ERROR";
        }
        if (z2) {
            return "SSL_HANDSHAKE";
        }
        if (th instanceof SSLPeerUnverifiedException) {
            return "SSL_PEER_UNVERIFIED";
        }
        if (th instanceof SSLException) {
            return "SSL_ERROR";
        }
        if (th instanceof UnknownHostException) {
            return "DNS_FAILURE";
        }
        if (th instanceof ConnectException) {
            return "CONNECT_FAILURE";
        }
        if (th instanceof SocketTimeoutException) {
            return "TIMEOUT";
        }
        if (th instanceof SocketException) {
            SocketException socketException = (SocketException) th;
            String message = socketException.getMessage();
            if (message != null && StringsKt.contains((CharSequence) message, (CharSequence) "reset", true)) {
                return "CONNECTION_RESET";
            }
            String message2 = socketException.getMessage();
            if (message2 != null && StringsKt.contains((CharSequence) message2, (CharSequence) "abort", true)) {
                return "CONNECTION_ABORT";
            }
            String message3 = socketException.getMessage();
            return (message3 == null || !StringsKt.contains((CharSequence) message3, (CharSequence) "closed", true)) ? "SOCKET_ERROR" : "CONNECTION_CLOSED";
        }
        String simpleName = th.getClass().getSimpleName();
        Intrinsics.checkNotNullExpressionValue(simpleName, "cause.javaClass.simpleName");
        return simpleName;
    }
}
