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
    public static final SafePackageManager f6755a = new SafePackageManager();

    public static Intent a(Context context) {
        Bundle bundle;
        C0674gj c0674gj;
        Intent addFlags = new Intent(context, (Class<?>) AppMetricaService.class).setAction("io.appmetrica.analytics.IAppMetricaService").setData(new Uri.Builder().scheme("appmetrica").authority(context.getPackageName()).build()).addFlags(32);
        try {
            bundle = f6755a.getApplicationInfo(context, context.getPackageName(), 128).metaData;
            if (bundle == null) {
                bundle = new Bundle();
            }
        } catch (Throwable unused) {
            bundle = new Bundle();
        }
        Intent putExtras = addFlags.putExtras(bundle);
        putExtras.setData(putExtras.getData().buildUpon().path("client").appendQueryParameter("pid", String.valueOf(Process.myPid())).appendQueryParameter("psid", Gf.f6836c).build());
        C0736j4 l2 = C0736j4.l();
        synchronized (l2) {
            try {
                if (l2.f8496o == null) {
                    C0674gj c0674gj2 = new C0674gj();
                    l2.f8496o = c0674gj2;
                    l2.f8489h.a(c0674gj2);
                }
                c0674gj = l2.f8496o;
            } catch (Throwable th) {
                throw th;
            }
        }
        ScreenInfo a6 = c0674gj.a(context);
        putExtras.putExtra("screen_size", a6 == null ? null : AbstractC0847nb.a(a6));
        return putExtras.setPackage(context.getApplicationContext().getPackageName());
    }
}
