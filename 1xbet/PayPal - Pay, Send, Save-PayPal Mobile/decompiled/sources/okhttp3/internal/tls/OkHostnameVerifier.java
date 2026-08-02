package okhttp3.internal.tls;

@kotlin.Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010 \n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001f\u0010\t\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\t\u0010\nJ\u001d\u0010\t\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\t\u0010\rJ\u0013\u0010\u000e\u001a\u00020\u0004*\u00020\u0004H\u0002¢\u0006\u0004\b\u000e\u0010\u000fJ\u0013\u0010\u0010\u001a\u00020\b*\u00020\u0004H\u0002¢\u0006\u0004\b\u0010\u0010\u0011J\u001b\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00040\u00122\u0006\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\u0013\u0010\u0014J%\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00040\u00122\u0006\u0010\u0015\u001a\u00020\u000b2\u0006\u0010\u0017\u001a\u00020\u0016H\u0002¢\u0006\u0004\b\u000e\u0010\u0018"}, d2 = {"Lokhttp3/internal/tls/OkHostnameVerifier;", "Ljavax/net/ssl/HostnameVerifier;", "<init>", "()V", "", com.datadog.android.log.LogAttributes.HOST, "Ljavax/net/ssl/SSLSession;", "session", "", "verify", "(Ljava/lang/String;Ljavax/net/ssl/SSLSession;)Z", "Ljava/security/cert/X509Certificate;", "certificate", "(Ljava/lang/String;Ljava/security/cert/X509Certificate;)Z", "getHighResolutionOutputSizeshNQ4ISI", "(Ljava/lang/String;)Ljava/lang/String;", "Camera2StreamConfigurationMap", "(Ljava/lang/String;)Z", "", "allSubjectAltNames", "(Ljava/security/cert/X509Certificate;)Ljava/util/List;", "p0", "", "p1", "(Ljava/security/cert/X509Certificate;I)Ljava/util/List;"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class OkHostnameVerifier implements javax.net.ssl.HostnameVerifier {
    public static final okhttp3.internal.tls.OkHostnameVerifier INSTANCE = new okhttp3.internal.tls.OkHostnameVerifier();

    private OkHostnameVerifier() {
    }

    @Override // javax.net.ssl.HostnameVerifier
    public final boolean verify(java.lang.String host, javax.net.ssl.SSLSession session) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(host, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(session, "");
        if (!Camera2StreamConfigurationMap(host)) {
            return false;
        }
        try {
            java.security.cert.Certificate certificate = session.getPeerCertificates()[0];
            kotlin.jvm.internal.Intrinsics.checkNotNull(certificate, "");
            return verify(host, (java.security.cert.X509Certificate) certificate);
        } catch (javax.net.ssl.SSLException unused) {
            return false;
        }
    }

    public final boolean verify(java.lang.String host, java.security.cert.X509Certificate certificate) {
        java.lang.String str;
        java.lang.String str2;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(host, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(certificate, "");
        if (okhttp3.internal._HostnamesCommonKt.canParseAsIpAddress(host)) {
            java.lang.String canonicalHost = okhttp3.internal._HostnamesCommonKt.toCanonicalHost(host);
            java.util.List<java.lang.String> highResolutionOutputSizeshNQ4ISI = getHighResolutionOutputSizeshNQ4ISI(certificate, 7);
            if (!(highResolutionOutputSizeshNQ4ISI instanceof java.util.Collection) || !highResolutionOutputSizeshNQ4ISI.isEmpty()) {
                java.util.Iterator<T> it = highResolutionOutputSizeshNQ4ISI.iterator();
                while (it.hasNext()) {
                    if (kotlin.jvm.internal.Intrinsics.areEqual(canonicalHost, okhttp3.internal._HostnamesCommonKt.toCanonicalHost((java.lang.String) it.next()))) {
                        return true;
                    }
                }
            }
            return false;
        }
        java.lang.String highResolutionOutputSizeshNQ4ISI2 = getHighResolutionOutputSizeshNQ4ISI(host);
        java.util.List<java.lang.String> highResolutionOutputSizeshNQ4ISI3 = getHighResolutionOutputSizeshNQ4ISI(certificate, 2);
        if (!(highResolutionOutputSizeshNQ4ISI3 instanceof java.util.Collection) || !highResolutionOutputSizeshNQ4ISI3.isEmpty()) {
            for (java.lang.String str3 : highResolutionOutputSizeshNQ4ISI3) {
                java.lang.String str4 = highResolutionOutputSizeshNQ4ISI2;
                if (str4 != null && str4.length() != 0 && !kotlin.text.StringsKt.startsWith$default(highResolutionOutputSizeshNQ4ISI2, ".", false, 2, (java.lang.Object) null) && !kotlin.text.StringsKt.endsWith$default(highResolutionOutputSizeshNQ4ISI2, "..", false, 2, (java.lang.Object) null) && (str = str3) != null && str.length() != 0 && !kotlin.text.StringsKt.startsWith$default(str3, ".", false, 2, (java.lang.Object) null) && !kotlin.text.StringsKt.endsWith$default(str3, "..", false, 2, (java.lang.Object) null)) {
                    if (kotlin.text.StringsKt.endsWith$default(highResolutionOutputSizeshNQ4ISI2, ".", false, 2, (java.lang.Object) null)) {
                        str2 = highResolutionOutputSizeshNQ4ISI2;
                    } else {
                        java.lang.StringBuilder sb = new java.lang.StringBuilder();
                        sb.append(highResolutionOutputSizeshNQ4ISI2);
                        sb.append(com.paypal.oslo.core.money.MoneyKt.DECIMALSEPARATOR);
                        str2 = sb.toString();
                    }
                    if (!kotlin.text.StringsKt.endsWith$default(str3, ".", false, 2, (java.lang.Object) null)) {
                        java.lang.StringBuilder sb2 = new java.lang.StringBuilder();
                        sb2.append(str3);
                        sb2.append(com.paypal.oslo.core.money.MoneyKt.DECIMALSEPARATOR);
                        str3 = sb2.toString();
                    }
                    java.lang.String highResolutionOutputSizeshNQ4ISI4 = getHighResolutionOutputSizeshNQ4ISI(str3);
                    java.lang.String str5 = highResolutionOutputSizeshNQ4ISI4;
                    if (!kotlin.text.StringsKt.contains$default((java.lang.CharSequence) str5, (java.lang.CharSequence) "*", false, 2, (java.lang.Object) null)) {
                        if (kotlin.jvm.internal.Intrinsics.areEqual(str2, highResolutionOutputSizeshNQ4ISI4)) {
                            return true;
                        }
                    } else if (kotlin.text.StringsKt.startsWith$default(highResolutionOutputSizeshNQ4ISI4, "*.", false, 2, (java.lang.Object) null) && kotlin.text.StringsKt.indexOf$default((java.lang.CharSequence) str5, '*', 1, false, 4, (java.lang.Object) null) == -1 && str2.length() >= highResolutionOutputSizeshNQ4ISI4.length() && !kotlin.jvm.internal.Intrinsics.areEqual("*.", highResolutionOutputSizeshNQ4ISI4)) {
                        java.lang.String substring = highResolutionOutputSizeshNQ4ISI4.substring(1);
                        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(substring, "");
                        if (kotlin.text.StringsKt.endsWith$default(str2, substring, false, 2, (java.lang.Object) null)) {
                            int length = str2.length() - substring.length();
                            if (length > 0 && kotlin.text.StringsKt.lastIndexOf$default((java.lang.CharSequence) str2, com.paypal.oslo.core.money.MoneyKt.DECIMALSEPARATOR, length - 1, false, 4, (java.lang.Object) null) != -1) {
                            }
                            return true;
                        }
                        continue;
                    }
                }
            }
        }
        return false;
    }

    private static java.lang.String getHighResolutionOutputSizeshNQ4ISI(java.lang.String str) {
        if (!Camera2StreamConfigurationMap(str)) {
            return str;
        }
        java.util.Locale locale = java.util.Locale.US;
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(locale, "");
        java.lang.String lowerCase = str.toLowerCase(locale);
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(lowerCase, "");
        return lowerCase;
    }

    private static boolean Camera2StreamConfigurationMap(java.lang.String str) {
        return str.length() == ((int) okio.Utf8.size$default(str, 0, 0, 3, null));
    }

    public final java.util.List<java.lang.String> allSubjectAltNames(java.security.cert.X509Certificate certificate) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(certificate, "");
        return kotlin.collections.CollectionsKt.plus((java.util.Collection) getHighResolutionOutputSizeshNQ4ISI(certificate, 7), (java.lang.Iterable) getHighResolutionOutputSizeshNQ4ISI(certificate, 2));
    }

    private static java.util.List<java.lang.String> getHighResolutionOutputSizeshNQ4ISI(java.security.cert.X509Certificate p0, int p1) {
        java.lang.Object obj;
        try {
            java.util.Collection<java.util.List<?>> subjectAlternativeNames = p0.getSubjectAlternativeNames();
            if (subjectAlternativeNames == null) {
                return kotlin.collections.CollectionsKt.emptyList();
            }
            java.util.ArrayList arrayList = new java.util.ArrayList();
            for (java.util.List<?> list : subjectAlternativeNames) {
                if (list != null && list.size() >= 2 && kotlin.jvm.internal.Intrinsics.areEqual(list.get(0), java.lang.Integer.valueOf(p1)) && (obj = list.get(1)) != null) {
                    arrayList.add((java.lang.String) obj);
                }
            }
            return arrayList;
        } catch (java.security.cert.CertificateParsingException unused) {
            return kotlin.collections.CollectionsKt.emptyList();
        }
    }
}
