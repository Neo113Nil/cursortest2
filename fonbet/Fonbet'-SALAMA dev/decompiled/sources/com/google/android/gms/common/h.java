package com.google.android.gms.common;

import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;
import android.content.pm.Signature;
import android.text.TextUtils;
import android.util.Log;
import com.google.android.gms.common.internal.D;
import w1.P2;

/* loaded from: classes.dex */
public final class h implements J0.b {

    /* renamed from: b, reason: collision with root package name */
    public static h f11218b;

    /* renamed from: a, reason: collision with root package name */
    public final Context f11219a;

    public h(Context context, int i7) {
        switch (i7) {
            case 1:
                this.f11219a = context;
                break;
            default:
                this.f11219a = context.getApplicationContext();
                break;
        }
    }

    public static h a(Context context) {
        D.i(context);
        synchronized (h.class) {
            if (f11218b == null) {
                k kVar = o.f11365a;
                synchronized (o.class) {
                    if (o.f11367c == null) {
                        o.f11367c = context.getApplicationContext();
                    } else {
                        Log.w("GoogleCertificates", "GoogleCertificates has been initialized already");
                    }
                }
                f11218b = new h(context, 0);
            }
        }
        return f11218b;
    }

    public static final l b(PackageInfo packageInfo, l... lVarArr) {
        Signature[] signatureArr = packageInfo.signatures;
        if (signatureArr != null) {
            if (signatureArr.length != 1) {
                Log.w("GoogleSignatureVerifier", "Package has more than one signature.");
                return null;
            }
            m mVar = new m(packageInfo.signatures[0].toByteArray());
            for (int i7 = 0; i7 < lVarArr.length; i7++) {
                if (lVarArr[i7].equals(mVar)) {
                    return lVarArr[i7];
                }
            }
        }
        return null;
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x0032  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0047 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0039  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final boolean c(PackageInfo packageInfo, boolean z4) {
        PackageInfo packageInfo2;
        if (z4) {
            if (packageInfo == null) {
                packageInfo2 = null;
                if (packageInfo != null && packageInfo2.signatures != null) {
                    if ((!z4 ? b(packageInfo2, n.f11364a) : b(packageInfo2, n.f11364a[0])) == null) {
                        return true;
                    }
                }
                return false;
            }
            if ("com.android.vending".equals(packageInfo.packageName) || "com.google.android.gms".equals(packageInfo.packageName)) {
                ApplicationInfo applicationInfo = packageInfo.applicationInfo;
                z4 = (applicationInfo == null || (applicationInfo.flags & 129) == 0) ? false : true;
            }
        }
        packageInfo2 = packageInfo;
        if (packageInfo != null) {
            if ((!z4 ? b(packageInfo2, n.f11364a) : b(packageInfo2, n.f11364a[0])) == null) {
            }
        }
        return false;
    }

    @Override // J0.b
    public J0.c i(D3.j jVar) {
        P2 p22 = (P2) jVar.f1726e;
        if (p22 == null) {
            throw new IllegalArgumentException("Must set a callback to create the configuration.");
        }
        Context context = this.f11219a;
        if (context == null) {
            throw new IllegalArgumentException("Must set a non-null context to create the configuration.");
        }
        String str = (String) jVar.f1723b;
        if (TextUtils.isEmpty(str)) {
            throw new IllegalArgumentException("Must set a non-null database name to a configuration that uses the no backup directory.");
        }
        D3.j jVar2 = new D3.j(context, str, p22, true, 3);
        return new K0.e((Context) jVar2.f1725d, (String) jVar2.f1723b, (P2) jVar2.f1726e, jVar2.f1724c);
    }
}
