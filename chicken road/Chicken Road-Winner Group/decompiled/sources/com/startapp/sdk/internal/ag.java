package com.startapp.sdk.internal;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ResolveInfo;
import android.content.pm.ServiceInfo;
import android.content.pm.Signature;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;

/* loaded from: classes.dex */
public final class ag extends y1 {
    public final qe n0;

    /* renamed from: o0, reason: collision with root package name */
    public final String f3462o0;

    public ag(Context context) {
        super(1);
        ServiceInfo serviceInfo;
        String str;
        Signature[] signatureArr;
        if (je.f3927a == null) {
            try {
                Intent intent = new Intent("com.google.android.finsky.BIND_GET_INSTALL_REFERRER_SERVICE");
                intent.setComponent(new ComponentName("com.android.vending", "com.google.android.finsky.externalreferrer.GetInstallReferrerService"));
                List<ResolveInfo> queryIntentServices = context.getPackageManager().queryIntentServices(intent, 0);
                if (queryIntentServices != null && !queryIntentServices.isEmpty() && (serviceInfo = queryIntentServices.get(0).serviceInfo) != null) {
                    String str2 = serviceInfo.packageName;
                    String str3 = serviceInfo.name;
                    if ("com.android.vending".equals(str2) && str3 != null && context.getPackageManager().getPackageInfo("com.android.vending", 128).versionCode >= 80837300) {
                        Intent intent2 = new Intent(intent);
                        CountDownLatch countDownLatch = new CountDownLatch(1);
                        ie ieVar = new ie(context.getPackageName(), countDownLatch);
                        if (context.bindService(intent2, ieVar, 1)) {
                            try {
                                countDownLatch.await(1L, TimeUnit.SECONDS);
                            } catch (InterruptedException unused) {
                            }
                            int i3 = p0.f4197a;
                            context.unbindService(ieVar);
                        }
                    }
                }
            } catch (Throwable unused2) {
            }
        }
        this.n0 = je.f3927a;
        int i4 = p0.f4197a;
        try {
            signatureArr = context.getPackageManager().getPackageInfo(context.getPackageName(), 64).signatures;
        } catch (Throwable unused3) {
        }
        if (signatureArr != null && signatureArr.length > 0) {
            if (signatureArr.length == 1) {
                str = signatureArr[0].toCharsString();
            } else {
                Arrays.sort(signatureArr, new o0());
                StringBuilder sb = new StringBuilder();
                for (int i5 = 0; i5 < signatureArr.length; i5++) {
                    sb.append(signatureArr[i5].toCharsString());
                    if (i5 < signatureArr.length - 1) {
                        sb.append(';');
                    }
                }
                str = sb.toString();
            }
            this.f3462o0 = str;
        }
        str = null;
        this.f3462o0 = str;
    }

    @Override // com.startapp.sdk.internal.y1
    public final void a(se seVar) {
        super.a(seVar);
        seVar.a("placement", "INAPP_DOWNLOAD", true, true);
        qe qeVar = this.n0;
        if (qeVar != null) {
            seVar.a("install_referrer", qeVar.f4276a.getString("install_referrer"), true, true);
            seVar.a("referrer_click_timestamp_seconds", Long.valueOf(this.n0.f4276a.getLong("referrer_click_timestamp_seconds")), true, true);
            seVar.a("install_begin_timestamp_seconds", Long.valueOf(this.n0.f4276a.getLong("install_begin_timestamp_seconds")), true, true);
        }
        seVar.a("apkSig", this.f3462o0, true, true);
        long j3 = com.startapp.sdk.adsbase.g.f3222c;
        if (j3 != 0) {
            seVar.a("firstInstalledAppTS", Long.valueOf(j3), false, true);
        }
    }
}
