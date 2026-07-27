package com.mbridge.msdk.config.component.info.provider.subprovider;

import android.content.ContentResolver;
import android.content.Context;
import android.os.Build;
import android.provider.Settings;
import android.text.TextUtils;
import com.google.android.gms.ads.identifier.AdvertisingIdClient;
import com.ironsource.sdk.controller.f;
import com.mbridge.msdk.foundation.tools.c;
import com.mbridge.msdk.foundation.tools.k0;
import com.mbridge.msdk.foundation.tools.q0;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.atomic.AtomicBoolean;
import org.json.JSONObject;

/* compiled from: ADIDProvider.java */
/* loaded from: classes6.dex */
public class a {
    private static volatile a h;

    /* renamed from: a, reason: collision with root package name */
    private String f8976a = "";
    private String b = "";
    private int c = -1;
    private int d = -1;
    private String e = "";
    private String f = "";
    public AtomicBoolean g = new AtomicBoolean(false);

    private a() {
    }

    public static a b() {
        if (h == null) {
            synchronized (a.class) {
                if (h == null) {
                    h = new a();
                }
            }
        }
        return h;
    }

    private void c() {
        Context d = com.mbridge.msdk.foundation.controller.c.n().d();
        this.b = com.mbridge.msdk.config.component.common.util.b.a(d).a(f.b.c, "");
        this.d = com.mbridge.msdk.config.component.common.util.b.a(d).a("isLimitAdId", -1);
    }

    public Map<String, Object> a() {
        HashMap hashMap = new HashMap();
        String str = TextUtils.isEmpty(this.f8976a) ? TextUtils.isEmpty(this.b) ? "" : this.b : this.f8976a;
        int i = this.c;
        if (i == -1 && (i = this.d) == -1) {
            i = 0;
        }
        hashMap.put(f.b.c, str);
        hashMap.put("adIdB64", TextUtils.isEmpty(str) ? "" : k0.b(str));
        hashMap.put("adIdLimit", String.valueOf(i));
        hashMap.put("amazonIdInfo", this.e);
        hashMap.put("amazonIdInfoB64", this.f);
        return hashMap;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void b(com.mbridge.msdk.config.component.info.provider.listener.a aVar) {
        try {
            Map<String, Object> a2 = a(com.mbridge.msdk.foundation.controller.c.n().d());
            a(this.f8976a, this.c);
            if (aVar != null) {
                aVar.a(a2);
            }
        } catch (Throwable th) {
            q0.b("ADIDProvider", th.getMessage());
        }
    }

    public void a(final com.mbridge.msdk.config.component.info.provider.listener.a aVar) {
        com.mbridge.msdk.foundation.same.threadpool.a.b().execute(new Runnable() { // from class: com.mbridge.msdk.config.component.info.provider.subprovider.a$$ExternalSyntheticLambda0
            @Override // java.lang.Runnable
            public final void run() {
                a.this.b(aVar);
            }
        });
    }

    public Map<String, Object> a(Context context) {
        if (context == null) {
            return new HashMap();
        }
        try {
            c();
            try {
                try {
                    Class.forName("com.google.android.gms.ads.identifier.AdvertisingIdClient");
                    AdvertisingIdClient.Info advertisingIdInfo = AdvertisingIdClient.getAdvertisingIdInfo(context);
                    this.f8976a = advertisingIdInfo.getId();
                    this.c = advertisingIdInfo.isLimitAdTrackingEnabled() ? 1 : 0;
                } catch (Exception unused) {
                    q0.d("ADIDProvider", "GET ADID FROM GOOGLE PLAY APP ERROR");
                }
            } catch (Exception unused2) {
                c.b a2 = new com.mbridge.msdk.foundation.tools.c().a(context);
                this.f8976a = a2.a();
                this.c = a2.b() ? 1 : 0;
            } catch (Throwable th) {
                q0.b("ADIDProvider", th.getMessage());
            }
            if (!b(context)) {
                JSONObject jSONObject = new JSONObject();
                try {
                    ContentResolver contentResolver = com.mbridge.msdk.foundation.controller.c.n().d().getContentResolver();
                    int i = Settings.Secure.getInt(contentResolver, "limit_ad_tracking");
                    String string = Settings.Secure.getString(contentResolver, "advertising_id");
                    jSONObject.put("status", i);
                    jSONObject.put("amazonId", string);
                    String jSONObject2 = jSONObject.toString();
                    if (!TextUtils.isEmpty(jSONObject2)) {
                        this.e = jSONObject2;
                        this.f = k0.b(jSONObject2);
                    }
                } catch (Throwable th2) {
                    q0.b("ADIDProvider", th2.getMessage());
                }
            }
        } catch (Throwable th3) {
            q0.b("ADIDProvider", th3.getMessage());
        }
        this.f8976a = TextUtils.isEmpty(this.f8976a) ? TextUtils.isEmpty(this.b) ? "" : this.b : this.f8976a;
        int i2 = this.c;
        if (i2 == -1 && (i2 = this.d) == -1) {
            i2 = 0;
        }
        this.c = i2;
        this.g.set(true);
        HashMap hashMap = new HashMap();
        hashMap.put(f.b.c, this.f8976a);
        hashMap.put("adIdB64", k0.b(this.f8976a));
        hashMap.put("isLimitAdId", Integer.valueOf(this.c));
        hashMap.put("amazonIdInfo", this.e);
        hashMap.put("amazonIdInfoB64", this.f);
        return hashMap;
    }

    private boolean b(Context context) {
        return "amazon".equalsIgnoreCase(Build.MANUFACTURER) || (context != null ? context.getPackageManager().hasSystemFeature("amazon.hardware.fire_tv") : false);
    }

    private void a(String str, int i) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        Context d = com.mbridge.msdk.foundation.controller.c.n().d();
        if (str.equals(this.b) && i == this.d) {
            return;
        }
        com.mbridge.msdk.config.component.common.util.b.a(d).b(f.b.c, str);
        com.mbridge.msdk.config.component.common.util.b.a(d).b("isLimitAdId", i);
    }
}
