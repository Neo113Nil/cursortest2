package io.appmetrica.analytics.impl;

import android.content.Context;
import android.content.pm.Signature;
import android.content.pm.SigningInfo;
import io.appmetrica.analytics.coreutils.internal.AndroidUtils;
import io.appmetrica.analytics.coreutils.internal.StringUtils;
import io.appmetrica.analytics.coreutils.internal.services.SafePackageManager;
import java.security.MessageDigest;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* renamed from: io.appmetrica.analytics.impl.u3, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1020u3 {

    /* renamed from: a, reason: collision with root package name */
    public final Context f9333a;

    /* renamed from: b, reason: collision with root package name */
    public final C0541bf f9334b;

    /* renamed from: c, reason: collision with root package name */
    public final String f9335c;

    /* renamed from: d, reason: collision with root package name */
    public final SafePackageManager f9336d;

    public C1020u3(Context context, C0541bf c0541bf, String str, SafePackageManager safePackageManager) {
        this.f9333a = context;
        this.f9334b = c0541bf;
        this.f9335c = str;
        this.f9336d = safePackageManager;
    }

    public final List a() {
        Signature[] signatureArr;
        String str;
        SigningInfo signingInfo;
        boolean hasMultipleSigners;
        List<String> g6 = this.f9334b.g();
        boolean isEmpty = g6.isEmpty();
        List<String> list = g6;
        if (isEmpty) {
            ArrayList arrayList = new ArrayList();
            try {
                if (AndroidUtils.isApiAchieved(28)) {
                    signingInfo = this.f9336d.getPackageInfo(this.f9333a, this.f9335c, 134217728).signingInfo;
                    hasMultipleSigners = signingInfo.hasMultipleSigners();
                    signatureArr = hasMultipleSigners ? signingInfo.getApkContentsSigners() : signingInfo.getSigningCertificateHistory();
                } else {
                    signatureArr = this.f9336d.getPackageInfo(this.f9333a, this.f9335c, 64).signatures;
                }
                if (signatureArr != null) {
                    for (Signature signature : signatureArr) {
                        try {
                            str = StringUtils.formatSha1(MessageDigest.getInstance("SHA1").digest(signature.toByteArray()));
                        } catch (Throwable unused) {
                            str = null;
                        }
                        if (str != null) {
                            arrayList.add(str);
                        }
                    }
                }
            } catch (Throwable unused2) {
            }
            Collections.sort(arrayList);
            boolean isEmpty2 = arrayList.isEmpty();
            list = arrayList;
            if (!isEmpty2) {
                this.f9334b.a(arrayList).b();
                list = arrayList;
            }
        }
        return list;
    }
}
