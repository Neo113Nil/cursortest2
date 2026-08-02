package com.google.android.datatransport.cct;

import android.content.Context;
import android.content.pm.PackageManager;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.os.Build;
import android.telephony.TelephonyManager;
import android.util.Log;
import android.util.SparseArray;
import androidx.annotation.Nullable;
import com.google.android.datatransport.cct.internal.e;
import com.google.android.datatransport.cct.internal.f;
import com.google.android.datatransport.cct.internal.j;
import com.google.android.datatransport.cct.internal.k;
import com.google.android.datatransport.cct.internal.p;
import com.google.android.datatransport.cct.internal.w;
import com.google.android.datatransport.cct.internal.x;
import com.google.android.datatransport.runtime.b;
import com.google.android.datatransport.runtime.backends.g;
import com.google.android.datatransport.runtime.backends.m;
import com.google.android.datatransport.runtime.h;
import com.google.android.datatransport.runtime.i;
import com.google.firebase.encoders.DataEncoder;
import com.google.firebase.encoders.json.JsonDataEncoderBuilder;
import defpackage.g;
import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.TimeZone;

/* loaded from: classes.dex */
public final class c implements m {
    public final ConnectivityManager b;
    public final Context c;
    public final com.google.android.datatransport.runtime.time.a e;
    public final com.google.android.datatransport.runtime.time.a f;
    public final DataEncoder a = new JsonDataEncoderBuilder().configureWith(com.google.android.datatransport.cct.internal.b.a).ignoreNullValues(true).build();
    public final URL d = c(com.google.android.datatransport.cct.a.c);
    public final int g = 130000;

    public static final class a {
        public final URL a;
        public final com.google.android.datatransport.cct.internal.d b;

        @Nullable
        public final String c;

        public a(URL url, com.google.android.datatransport.cct.internal.d dVar, @Nullable String str) {
            this.a = url;
            this.b = dVar;
            this.c = str;
        }
    }

    public static final class b {
        public final int a;

        @Nullable
        public final URL b;
        public final long c;

        public b(int i, @Nullable URL url, long j) {
            this.a = i;
            this.b = url;
            this.c = j;
        }
    }

    public c(Context context, com.google.android.datatransport.runtime.time.a aVar, com.google.android.datatransport.runtime.time.a aVar2) {
        this.c = context;
        this.b = (ConnectivityManager) context.getSystemService("connectivity");
        this.e = aVar2;
        this.f = aVar;
    }

    public static URL c(String str) {
        try {
            return new URL(str);
        } catch (MalformedURLException e) {
            throw new IllegalArgumentException(g.a("Invalid url: ", str), e);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:33:0x00a1, code lost:
    
        if (com.google.android.datatransport.cct.internal.w.a.a.get(r0) != null) goto L21;
     */
    /* JADX WARN: Removed duplicated region for block: B:16:0x00a7  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0109  */
    @Override // com.google.android.datatransport.runtime.backends.m
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final com.google.android.datatransport.runtime.b a(com.google.android.datatransport.runtime.b bVar) {
        int type;
        int subtype;
        HashMap hashMap;
        NetworkInfo activeNetworkInfo = this.b.getActiveNetworkInfo();
        b.a m = bVar.m();
        int i = Build.VERSION.SDK_INT;
        HashMap hashMap2 = m.f;
        if (hashMap2 == null) {
            throw new IllegalStateException("Property \"autoMetadata\" has not been set");
        }
        hashMap2.put("sdk-version", String.valueOf(i));
        m.a("model", Build.MODEL);
        m.a("hardware", Build.HARDWARE);
        m.a("device", Build.DEVICE);
        m.a("product", Build.PRODUCT);
        m.a("os-uild", Build.ID);
        m.a("manufacturer", Build.MANUFACTURER);
        m.a("fingerprint", Build.FINGERPRINT);
        Calendar.getInstance();
        long offset = TimeZone.getDefault().getOffset(Calendar.getInstance().getTimeInMillis()) / 1000;
        HashMap hashMap3 = m.f;
        if (hashMap3 == null) {
            throw new IllegalStateException("Property \"autoMetadata\" has not been set");
        }
        hashMap3.put("tz-offset", String.valueOf(offset));
        int i2 = -1;
        if (activeNetworkInfo == null) {
            SparseArray<w.b> sparseArray = w.b.a;
            type = -1;
        } else {
            type = activeNetworkInfo.getType();
        }
        HashMap hashMap4 = m.f;
        if (hashMap4 == null) {
            throw new IllegalStateException("Property \"autoMetadata\" has not been set");
        }
        hashMap4.put("net-type", String.valueOf(type));
        if (activeNetworkInfo != null) {
            subtype = activeNetworkInfo.getSubtype();
            if (subtype == -1) {
                SparseArray<w.a> sparseArray2 = w.a.a;
                subtype = 100;
            }
            hashMap = m.f;
            if (hashMap != null) {
                throw new IllegalStateException("Property \"autoMetadata\" has not been set");
            }
            hashMap.put("mobile-subtype", String.valueOf(subtype));
            m.a("country", Locale.getDefault().getCountry());
            m.a("locale", Locale.getDefault().getLanguage());
            Context context = this.c;
            String simOperator = ((TelephonyManager) context.getSystemService("phone")).getSimOperator();
            if (simOperator == null) {
                simOperator = "";
            }
            m.a("mcc_mnc", simOperator);
            try {
                i2 = context.getPackageManager().getPackageInfo(context.getPackageName(), 0).versionCode;
            } catch (PackageManager.NameNotFoundException unused) {
                Log.isLoggable(com.google.android.datatransport.runtime.logging.a.b("CctTransportBackend"), 6);
            }
            m.a("application_build", Integer.toString(i2));
            return m.b();
        }
        SparseArray<w.a> sparseArray3 = w.a.a;
        subtype = 0;
        hashMap = m.f;
        if (hashMap != null) {
        }
    }

    @Override // com.google.android.datatransport.runtime.backends.m
    public final com.google.android.datatransport.runtime.backends.b b(com.google.android.datatransport.runtime.backends.a aVar) {
        String str;
        b a2;
        String str2;
        Integer num;
        j.a aVar2;
        g.a aVar3 = g.a.b;
        HashMap hashMap = new HashMap();
        Iterator it = aVar.a.iterator();
        while (it.hasNext()) {
            i iVar = (i) it.next();
            String k = iVar.k();
            if (hashMap.containsKey(k)) {
                ((List) hashMap.get(k)).add(iVar);
            } else {
                ArrayList arrayList = new ArrayList();
                arrayList.add(iVar);
                hashMap.put(k, arrayList);
            }
        }
        ArrayList arrayList2 = new ArrayList();
        Iterator it2 = hashMap.entrySet().iterator();
        while (it2.hasNext()) {
            Map.Entry entry = (Map.Entry) it2.next();
            i iVar2 = (i) ((List) entry.getValue()).get(0);
            x xVar = x.a;
            long a3 = this.f.a();
            long a4 = this.e.a();
            e eVar = new e(new com.google.android.datatransport.cct.internal.c(iVar2.a("model"), iVar2.a("hardware"), iVar2.a("device"), iVar2.a("product"), iVar2.a("os-uild"), iVar2.a("manufacturer"), iVar2.a("fingerprint"), iVar2.a("locale"), iVar2.a("country"), iVar2.a("mcc_mnc"), iVar2.a("application_build"), Integer.valueOf(iVar2.h("sdk-version"))));
            try {
                num = Integer.valueOf(Integer.parseInt((String) entry.getKey()));
                str2 = null;
            } catch (NumberFormatException unused) {
                str2 = (String) entry.getKey();
                num = null;
            }
            ArrayList arrayList3 = new ArrayList();
            Iterator it3 = ((List) entry.getValue()).iterator();
            while (it3.hasNext()) {
                i iVar3 = (i) it3.next();
                h d = iVar3.d();
                com.google.android.datatransport.c cVar = d.a;
                byte[] bArr = d.b;
                Iterator it4 = it2;
                Iterator it5 = it3;
                if (cVar.equals(new com.google.android.datatransport.c("proto"))) {
                    aVar2 = new j.a();
                    aVar2.e = bArr;
                } else if (cVar.equals(new com.google.android.datatransport.c("json"))) {
                    String str3 = new String(bArr, Charset.forName("UTF-8"));
                    j.a aVar4 = new j.a();
                    aVar4.f = str3;
                    aVar2 = aVar4;
                } else {
                    if (Log.isLoggable(com.google.android.datatransport.runtime.logging.a.b("CctTransportBackend"), 5)) {
                        new StringBuilder("Received event of unsupported encoding ").append(cVar);
                    }
                    it2 = it4;
                    it3 = it5;
                }
                aVar2.a = Long.valueOf(iVar3.e());
                aVar2.d = Long.valueOf(iVar3.l());
                String str4 = iVar3.b().get("tz-offset");
                aVar2.g = Long.valueOf(str4 == null ? 0L : Long.valueOf(str4).longValue());
                aVar2.h = new com.google.android.datatransport.cct.internal.m(w.b.a.get(iVar3.h("net-type")), w.a.a.get(iVar3.h("mobile-subtype")));
                if (iVar3.c() != null) {
                    aVar2.b = iVar3.c();
                }
                if (iVar3.i() != null) {
                    com.google.android.datatransport.cct.internal.i iVar4 = new com.google.android.datatransport.cct.internal.i(new com.google.android.datatransport.cct.internal.h(iVar3.i()));
                    p.a aVar5 = p.a.a;
                    aVar2.c = new f(iVar4);
                }
                if (iVar3.f() != null || iVar3.g() != null) {
                    aVar2.i = new com.google.android.datatransport.cct.internal.g(iVar3.f() != null ? iVar3.f() : null, iVar3.g() != null ? iVar3.g() : null);
                }
                String str5 = aVar2.a == null ? " eventTimeMs" : "";
                if (aVar2.d == null) {
                    str5 = str5.concat(" eventUptimeMs");
                }
                if (aVar2.g == null) {
                    str5 = androidx.compose.runtime.changelist.d.b(str5, " timezoneOffsetSeconds");
                }
                if (!str5.isEmpty()) {
                    throw new IllegalStateException("Missing required properties:".concat(str5));
                }
                arrayList3.add(new j(aVar2.a.longValue(), aVar2.b, aVar2.c, aVar2.d.longValue(), aVar2.e, aVar2.f, aVar2.g.longValue(), aVar2.h, aVar2.i));
                it2 = it4;
                it3 = it5;
            }
            arrayList2.add(new k(a3, a4, eVar, num, str2, arrayList3));
        }
        com.google.android.datatransport.cct.internal.d dVar = new com.google.android.datatransport.cct.internal.d(arrayList2);
        byte[] bArr2 = aVar.b;
        g.a aVar6 = g.a.c;
        URL url = this.d;
        if (bArr2 != null) {
            try {
                com.google.android.datatransport.cct.a b2 = com.google.android.datatransport.cct.a.b(bArr2);
                str = b2.b;
                if (str == null) {
                    str = null;
                }
                String str6 = b2.a;
                if (str6 != null) {
                    url = c(str6);
                }
            } catch (IllegalArgumentException unused2) {
                return new com.google.android.datatransport.runtime.backends.b(aVar6, -1L);
            }
        } else {
            str = null;
        }
        try {
            a aVar7 = new a(url, dVar, str);
            com.google.android.datatransport.cct.b bVar = new com.google.android.datatransport.cct.b(this, 0);
            int i = 5;
            do {
                a2 = bVar.a(aVar7);
                URL url2 = a2.b;
                if (url2 != null) {
                    com.google.android.datatransport.runtime.logging.a.a("CctTransportBackend", "Following redirect to: %s", url2);
                    aVar7 = new a(url2, aVar7.b, aVar7.c);
                } else {
                    aVar7 = null;
                }
                if (aVar7 == null) {
                    break;
                }
                i--;
            } while (i >= 1);
            int i2 = a2.a;
            if (i2 == 200) {
                return new com.google.android.datatransport.runtime.backends.b(g.a.a, a2.c);
            }
            if (i2 < 500 && i2 != 404) {
                return i2 == 400 ? new com.google.android.datatransport.runtime.backends.b(g.a.d, -1L) : new com.google.android.datatransport.runtime.backends.b(aVar6, -1L);
            }
            return new com.google.android.datatransport.runtime.backends.b(aVar3, -1L);
        } catch (IOException unused3) {
            Log.isLoggable(com.google.android.datatransport.runtime.logging.a.b("CctTransportBackend"), 6);
            return new com.google.android.datatransport.runtime.backends.b(aVar3, -1L);
        }
    }
}
