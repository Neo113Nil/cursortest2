package io.appmetrica.analytics.impl;

/* loaded from: classes.dex */
public final class G1 {

    /* renamed from: a, reason: collision with root package name */
    public final io.appmetrica.analytics.coreutils.internal.services.SafePackageManager f4318a = new io.appmetrica.analytics.coreutils.internal.services.SafePackageManager();

    public final android.content.Intent a(android.content.Context context) {
        android.os.Bundle bundle;
        io.appmetrica.analytics.impl.C0259bj c0259bj;
        io.appmetrica.analytics.impl.C0244b4.l().f5510u.getClass();
        android.content.Intent data = new android.content.Intent(context, (java.lang.Class<?>) io.appmetrica.analytics.internal.AppMetricaService.class).setAction("io.appmetrica.analytics.IAppMetricaService").setData(new android.net.Uri.Builder().scheme(io.appmetrica.analytics.impl.G7.f4323b).authority(context.getPackageName()).path("client").appendQueryParameter("pid", java.lang.String.valueOf(android.os.Process.myPid())).appendQueryParameter("psid", io.appmetrica.analytics.impl.Bf.f4122c).build());
        android.content.pm.ApplicationInfo applicationInfo = this.f4318a.getApplicationInfo(context, context.getPackageName(), 128);
        if (applicationInfo == null || (bundle = applicationInfo.metaData) == null) {
            bundle = new android.os.Bundle();
        }
        android.content.Intent putExtras = data.putExtras(bundle);
        io.appmetrica.analytics.impl.C0244b4 l2 = io.appmetrica.analytics.impl.C0244b4.l();
        synchronized (l2) {
            try {
                if (l2.f5505o == null) {
                    io.appmetrica.analytics.impl.C0259bj c0259bj2 = new io.appmetrica.analytics.impl.C0259bj();
                    l2.f5505o = c0259bj2;
                    l2.f5498h.a(c0259bj2);
                }
                c0259bj = l2.f5505o;
            } catch (java.lang.Throwable th) {
                throw th;
            }
        }
        io.appmetrica.analytics.coreapi.internal.model.ScreenInfo b2 = c0259bj.b(context);
        return putExtras.putExtra("screen_size", b2 != null ? io.appmetrica.analytics.impl.AbstractC0380gb.a(b2) : null);
    }
}
