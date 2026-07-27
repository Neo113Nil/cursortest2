package y0;

import B0.h;
import android.content.Context;
import android.content.pm.PackageManager;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.os.Build;
import android.telephony.TelephonyManager;
import android.util.SparseArray;
import b0.j;
import io.appmetrica.analytics.AppMetricaDefaultValues;
import io.appmetrica.analytics.networktasks.internal.CommonUrlParts;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.Calendar;
import java.util.HashMap;
import java.util.Locale;
import java.util.TimeZone;
import l1.d;
import z0.AbstractC1258a;
import z0.C1259b;
import z0.C1260c;
import z0.C1261d;
import z0.e;
import z0.f;
import z0.g;
import z0.i;
import z0.k;
import z0.l;
import z0.n;
import z0.o;
import z0.q;
import z0.r;
import z0.s;
import z0.t;
import z0.u;
import z0.v;

/* loaded from: classes.dex */
public final class c implements h {

    /* renamed from: a, reason: collision with root package name */
    public final j f10577a;

    /* renamed from: b, reason: collision with root package name */
    public final ConnectivityManager f10578b;

    /* renamed from: c, reason: collision with root package name */
    public final Context f10579c;

    /* renamed from: d, reason: collision with root package name */
    public final URL f10580d;

    /* renamed from: e, reason: collision with root package name */
    public final P0.j f10581e;
    public final P0.j f;

    /* renamed from: g, reason: collision with root package name */
    public final int f10582g;

    public c(Context context, P0.j jVar, P0.j jVar2) {
        d dVar = new d();
        C1260c c1260c = C1260c.f10643a;
        dVar.a(o.class, c1260c);
        dVar.a(i.class, c1260c);
        f fVar = f.f10655a;
        dVar.a(s.class, fVar);
        dVar.a(l.class, fVar);
        C1261d c1261d = C1261d.f10645a;
        dVar.a(q.class, c1261d);
        dVar.a(z0.j.class, c1261d);
        C1259b c1259b = C1259b.f10631a;
        dVar.a(AbstractC1258a.class, c1259b);
        dVar.a(z0.h.class, c1259b);
        e eVar = e.f10648a;
        dVar.a(r.class, eVar);
        dVar.a(k.class, eVar);
        g gVar = g.f10662a;
        dVar.a(v.class, gVar);
        dVar.a(n.class, gVar);
        dVar.f9926d = true;
        this.f10577a = new j(dVar);
        this.f10579c = context;
        this.f10578b = (ConnectivityManager) context.getSystemService("connectivity");
        this.f10580d = b(C1251a.f10569c);
        this.f10581e = jVar2;
        this.f = jVar;
        this.f10582g = 130000;
    }

    public static URL b(String str) {
        try {
            return new URL(str);
        } catch (MalformedURLException e3) {
            throw new IllegalArgumentException(B0.c.j("Invalid url: ", str), e3);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:31:0x00a7, code lost:
    
        if (((z0.t) z0.t.f10694a.get(r0)) != null) goto L21;
     */
    /* JADX WARN: Removed duplicated region for block: B:16:0x00af  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x010a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final A0.i a(A0.i iVar) {
        int type;
        int subtype;
        HashMap hashMap;
        NetworkInfo activeNetworkInfo = this.f10578b.getActiveNetworkInfo();
        A0.h c3 = iVar.c();
        int i3 = Build.VERSION.SDK_INT;
        HashMap hashMap2 = (HashMap) c3.f58g;
        if (hashMap2 == null) {
            throw new IllegalStateException("Property \"autoMetadata\" has not been set");
        }
        hashMap2.put("sdk-version", String.valueOf(i3));
        c3.a(CommonUrlParts.MODEL, Build.MODEL);
        c3.a("hardware", Build.HARDWARE);
        c3.a("device", Build.DEVICE);
        c3.a("product", Build.PRODUCT);
        c3.a("os-uild", Build.ID);
        c3.a(CommonUrlParts.MANUFACTURER, Build.MANUFACTURER);
        c3.a("fingerprint", Build.FINGERPRINT);
        Calendar.getInstance();
        long offset = TimeZone.getDefault().getOffset(Calendar.getInstance().getTimeInMillis()) / AppMetricaDefaultValues.DEFAULT_MAX_REPORTS_IN_DATABASE_COUNT;
        HashMap hashMap3 = (HashMap) c3.f58g;
        if (hashMap3 == null) {
            throw new IllegalStateException("Property \"autoMetadata\" has not been set");
        }
        hashMap3.put("tz-offset", String.valueOf(offset));
        int i4 = -1;
        if (activeNetworkInfo == null) {
            SparseArray sparseArray = u.f10696a;
            type = -1;
        } else {
            type = activeNetworkInfo.getType();
        }
        HashMap hashMap4 = (HashMap) c3.f58g;
        if (hashMap4 == null) {
            throw new IllegalStateException("Property \"autoMetadata\" has not been set");
        }
        hashMap4.put("net-type", String.valueOf(type));
        if (activeNetworkInfo != null) {
            subtype = activeNetworkInfo.getSubtype();
            if (subtype == -1) {
                SparseArray sparseArray2 = t.f10694a;
                subtype = 100;
            }
            hashMap = (HashMap) c3.f58g;
            if (hashMap != null) {
                throw new IllegalStateException("Property \"autoMetadata\" has not been set");
            }
            hashMap.put("mobile-subtype", String.valueOf(subtype));
            c3.a("country", Locale.getDefault().getCountry());
            c3.a(CommonUrlParts.LOCALE, Locale.getDefault().getLanguage());
            Context context = this.f10579c;
            c3.a("mcc_mnc", ((TelephonyManager) context.getSystemService("phone")).getSimOperator());
            try {
                i4 = context.getPackageManager().getPackageInfo(context.getPackageName(), 0).versionCode;
            } catch (PackageManager.NameNotFoundException e3) {
                X0.a.r("CctTransportBackend", "Unable to find version code for package", e3);
            }
            c3.a("application_build", Integer.toString(i4));
            return c3.c();
        }
        SparseArray sparseArray3 = t.f10694a;
        subtype = 0;
        hashMap = (HashMap) c3.f58g;
        if (hashMap != null) {
        }
    }
}
