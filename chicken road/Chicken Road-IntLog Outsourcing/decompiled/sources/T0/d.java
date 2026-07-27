package T0;

import U0.e;
import U0.f;
import U0.h;
import U0.i;
import U0.j;
import U0.k;
import U0.l;
import U0.n;
import U0.o;
import U0.q;
import U0.r;
import U0.s;
import U0.t;
import U0.u;
import U0.v;
import W0.g;
import android.content.Context;
import android.content.pm.PackageManager;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.os.Build;
import android.telephony.TelephonyManager;
import android.util.SparseArray;
import e1.InterfaceC0410a;
import h2.C0482c;
import io.appmetrica.analytics.AppMetricaDefaultValues;
import io.appmetrica.analytics.networktasks.internal.CommonUrlParts;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.Calendar;
import java.util.HashMap;
import java.util.Locale;
import java.util.TimeZone;
import n2.AbstractC1341c;

/* loaded from: classes.dex */
public final class d implements g {

    /* renamed from: a, reason: collision with root package name */
    public final C0482c f2775a;

    /* renamed from: b, reason: collision with root package name */
    public final ConnectivityManager f2776b;

    /* renamed from: c, reason: collision with root package name */
    public final Context f2777c;

    /* renamed from: d, reason: collision with root package name */
    public final URL f2778d;

    /* renamed from: e, reason: collision with root package name */
    public final InterfaceC0410a f2779e;

    /* renamed from: f, reason: collision with root package name */
    public final InterfaceC0410a f2780f;

    /* renamed from: g, reason: collision with root package name */
    public final int f2781g;

    public d(Context context, InterfaceC0410a interfaceC0410a, InterfaceC0410a interfaceC0410a2) {
        T1.d dVar = new T1.d();
        U0.c cVar = U0.c.f3090a;
        dVar.a(o.class, cVar);
        dVar.a(i.class, cVar);
        f fVar = f.f3103a;
        dVar.a(s.class, fVar);
        dVar.a(l.class, fVar);
        U0.d dVar2 = U0.d.f3092a;
        dVar.a(q.class, dVar2);
        dVar.a(j.class, dVar2);
        U0.b bVar = U0.b.f3077a;
        dVar.a(U0.a.class, bVar);
        dVar.a(h.class, bVar);
        e eVar = e.f3095a;
        dVar.a(r.class, eVar);
        dVar.a(k.class, eVar);
        U0.g gVar = U0.g.f3111a;
        dVar.a(v.class, gVar);
        dVar.a(n.class, gVar);
        dVar.f2792d = true;
        this.f2775a = new C0482c(29, dVar);
        this.f2777c = context;
        this.f2776b = (ConnectivityManager) context.getSystemService("connectivity");
        this.f2778d = b(a.f2763c);
        this.f2779e = interfaceC0410a2;
        this.f2780f = interfaceC0410a;
        this.f2781g = 130000;
    }

    public static URL b(String str) {
        try {
            return new URL(str);
        } catch (MalformedURLException e3) {
            throw new IllegalArgumentException(B0.o.i("Invalid url: ", str), e3);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:31:0x00a7, code lost:
    
        if (((U0.t) U0.t.f3146a.get(r0)) != null) goto L21;
     */
    /* JADX WARN: Removed duplicated region for block: B:16:0x00af  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x010a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final V0.h a(V0.h hVar) {
        int type;
        int subtype;
        HashMap hashMap;
        NetworkInfo activeNetworkInfo = this.f2776b.getActiveNetworkInfo();
        M0.e c2 = hVar.c();
        int i2 = Build.VERSION.SDK_INT;
        HashMap hashMap2 = (HashMap) c2.f1788h;
        if (hashMap2 == null) {
            throw new IllegalStateException("Property \"autoMetadata\" has not been set");
        }
        hashMap2.put("sdk-version", String.valueOf(i2));
        c2.a(CommonUrlParts.MODEL, Build.MODEL);
        c2.a("hardware", Build.HARDWARE);
        c2.a("device", Build.DEVICE);
        c2.a("product", Build.PRODUCT);
        c2.a("os-uild", Build.ID);
        c2.a(CommonUrlParts.MANUFACTURER, Build.MANUFACTURER);
        c2.a("fingerprint", Build.FINGERPRINT);
        Calendar.getInstance();
        long offset = TimeZone.getDefault().getOffset(Calendar.getInstance().getTimeInMillis()) / AppMetricaDefaultValues.DEFAULT_MAX_REPORTS_IN_DATABASE_COUNT;
        HashMap hashMap3 = (HashMap) c2.f1788h;
        if (hashMap3 == null) {
            throw new IllegalStateException("Property \"autoMetadata\" has not been set");
        }
        hashMap3.put("tz-offset", String.valueOf(offset));
        int i3 = -1;
        if (activeNetworkInfo == null) {
            SparseArray sparseArray = u.f3148a;
            type = -1;
        } else {
            type = activeNetworkInfo.getType();
        }
        HashMap hashMap4 = (HashMap) c2.f1788h;
        if (hashMap4 == null) {
            throw new IllegalStateException("Property \"autoMetadata\" has not been set");
        }
        hashMap4.put("net-type", String.valueOf(type));
        if (activeNetworkInfo != null) {
            subtype = activeNetworkInfo.getSubtype();
            if (subtype == -1) {
                SparseArray sparseArray2 = t.f3146a;
                subtype = 100;
            }
            hashMap = (HashMap) c2.f1788h;
            if (hashMap != null) {
                throw new IllegalStateException("Property \"autoMetadata\" has not been set");
            }
            hashMap.put("mobile-subtype", String.valueOf(subtype));
            c2.a("country", Locale.getDefault().getCountry());
            c2.a(CommonUrlParts.LOCALE, Locale.getDefault().getLanguage());
            Context context = this.f2777c;
            c2.a("mcc_mnc", ((TelephonyManager) context.getSystemService("phone")).getSimOperator());
            try {
                i3 = context.getPackageManager().getPackageInfo(context.getPackageName(), 0).versionCode;
            } catch (PackageManager.NameNotFoundException e3) {
                AbstractC1341c.h("CctTransportBackend", "Unable to find version code for package", e3);
            }
            c2.a("application_build", Integer.toString(i3));
            return c2.c();
        }
        SparseArray sparseArray3 = t.f3146a;
        subtype = 0;
        hashMap = (HashMap) c2.f1788h;
        if (hashMap != null) {
        }
    }
}
