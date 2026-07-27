package io.appmetrica.analytics.impl;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.os.Process;
import io.appmetrica.analytics.coreapi.internal.model.ScreenInfo;
import io.appmetrica.analytics.coreutils.internal.services.SafePackageManager;
import io.appmetrica.analytics.internal.AppMetricaService;

/* loaded from: classes.dex */
public abstract class Ek {

    /* renamed from: a, reason: collision with root package name */
    public static final SafePackageManager f5914a = new SafePackageManager();

    public static Intent a(Context context) {
        Bundle bundle;
        C0525gj c0525gj;
        Intent addFlags = new Intent(context, (Class<?>) AppMetricaService.class).setAction("io.appmetrica.analytics.IAppMetricaService").setData(new Uri.Builder().scheme("appmetrica").authority(context.getPackageName()).build()).addFlags(32);
        try {
            bundle = f5914a.getApplicationInfo(context, context.getPackageName(), 128).metaData;
            if (bundle == null) {
                bundle = new Bundle();
            }
        } catch (Throwable unused) {
            bundle = new Bundle();
        }
        Intent putExtras = addFlags.putExtras(bundle);
        putExtras.setData(putExtras.getData().buildUpon().path("client").appendQueryParameter("pid", String.valueOf(Process.myPid())).appendQueryParameter("psid", Gf.f5991c).build());
        C0587j4 l3 = C0587j4.l();
        synchronized (l3) {
            try {
                if (l3.f7583o == null) {
                    C0525gj c0525gj2 = new C0525gj();
                    l3.f7583o = c0525gj2;
                    l3.f7576h.a(c0525gj2);
                }
                c0525gj = l3.f7583o;
            } catch (Throwable th) {
                throw th;
            }
        }
        ScreenInfo a3 = c0525gj.a(context);
        putExtras.putExtra("screen_size", a3 == null ? null : AbstractC0698nb.a(a3));
        return putExtras.setPackage(context.getApplicationContext().getPackageName());
    }
}
