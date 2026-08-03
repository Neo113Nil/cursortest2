package io.appmetrica.analytics.impl;

/* renamed from: io.appmetrica.analytics.impl.m3, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0527m3 {

    /* renamed from: a, reason: collision with root package name */
    public final android.content.Context f6384a;

    /* renamed from: b, reason: collision with root package name */
    public final io.appmetrica.analytics.impl.We f6385b;

    /* renamed from: c, reason: collision with root package name */
    public final java.lang.String f6386c;

    /* renamed from: d, reason: collision with root package name */
    public final io.appmetrica.analytics.coreutils.internal.services.SafePackageManager f6387d;

    public C0527m3(android.content.Context context, io.appmetrica.analytics.impl.We we, java.lang.String str, io.appmetrica.analytics.coreutils.internal.services.SafePackageManager safePackageManager) {
        this.f6384a = context;
        this.f6385b = we;
        this.f6386c = str;
        this.f6387d = safePackageManager;
    }

    public final java.util.List a() {
        android.content.pm.Signature[] signatureArr;
        java.lang.String str;
        android.content.pm.SigningInfo signingInfo;
        boolean hasMultipleSigners;
        java.util.List<java.lang.String> g2 = this.f6385b.g();
        boolean isEmpty = g2.isEmpty();
        java.util.List<java.lang.String> list = g2;
        if (isEmpty) {
            java.util.ArrayList arrayList = new java.util.ArrayList();
            try {
                if (io.appmetrica.analytics.coreutils.internal.AndroidUtils.isApiAchieved(28)) {
                    signingInfo = this.f6387d.getPackageInfo(this.f6384a, this.f6386c, 134217728).signingInfo;
                    hasMultipleSigners = signingInfo.hasMultipleSigners();
                    signatureArr = hasMultipleSigners ? signingInfo.getApkContentsSigners() : signingInfo.getSigningCertificateHistory();
                } else {
                    signatureArr = this.f6387d.getPackageInfo(this.f6384a, this.f6386c, 64).signatures;
                }
                if (signatureArr != null) {
                    for (android.content.pm.Signature signature : signatureArr) {
                        try {
                            str = io.appmetrica.analytics.coreutils.internal.StringUtils.formatSha1(java.security.MessageDigest.getInstance("SHA1").digest(signature.toByteArray()));
                        } catch (java.lang.Throwable unused) {
                            str = null;
                        }
                        if (str != null) {
                            arrayList.add(str);
                        }
                    }
                }
            } catch (java.lang.Throwable unused2) {
            }
            java.util.Collections.sort(arrayList);
            boolean isEmpty2 = arrayList.isEmpty();
            list = arrayList;
            if (!isEmpty2) {
                this.f6385b.a(arrayList).b();
                list = arrayList;
            }
        }
        return list;
    }
}
