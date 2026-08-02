package com.facebook.appevents.internal;

import android.content.Context;
import android.content.SharedPreferences;
import android.os.Build;
import androidx.core.app.NotificationCompat;
import com.facebook.S;
import com.facebook.appevents.C0691c;
import com.facebook.appevents.H;
import com.facebook.appevents.internal.i;
import com.facebook.internal.C0705a;
import com.facebook.internal.C0715k;
import com.facebook.internal.E;
import com.facebook.w;
import com.google.android.exoplayer2.source.rtsp.SessionDescription;
import java.util.HashMap;
import java.util.Iterator;
import java.util.concurrent.locks.ReentrantReadWriteLock;
import kotlin.TuplesKt;
import kotlin.collections.MapsKt;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes3.dex */
public final class h {
    public static final HashMap a = MapsKt.hashMapOf(TuplesKt.to(a.a, "MOBILE_APP_INSTALL"), TuplesKt.to(a.b, "CUSTOM_APP_EVENTS"));

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    public static final class a {
        public static final a a;
        public static final a b;
        public static final /* synthetic */ a[] c;

        static {
            a aVar = new a("MOBILE_INSTALL_EVENT", 0);
            a = aVar;
            a aVar2 = new a("CUSTOM_APP_EVENTS", 1);
            b = aVar2;
            c = new a[]{aVar, aVar2};
        }

        public a() {
            throw null;
        }

        public static a valueOf(String str) {
            return (a) Enum.valueOf(a.class, str);
        }

        public static a[] values() {
            return (a[]) c.clone();
        }
    }

    /* JADX WARN: Can't wrap try/catch for region: R(28:0|1|(1:3)|4|5|6|7|(1:9)|10|(1:12)|13|(6:97|98|99|(1:101)|102|(17:104|(1:106)|107|(3:17|(1:19)(1:21)|20)|(10:23|(3:25|(2:27|(2:29|(1:31)))(1:33)|32)|34|(2:36|(3:38|(2:40|(2:42|(1:44)))(1:46)|45)(1:47))|48|(1:50)|51|(5:53|(6:59|60|(1:62)|63|56|(1:58))|55|56|(0))|68|(1:70))|71|(1:73)(1:96)|(1:75)|76|(1:78)|(1:80)|81|82|83|(3:85|(2:88|86)|89)|90|91))|15|(0)|(0)|71|(0)(0)|(0)|76|(0)|(0)|81|82|83|(0)|90|91|(1:(0))) */
    /* JADX WARN: Code restructure failed: missing block: B:94:0x01a2, code lost:
    
        r7 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:95:0x01a3, code lost:
    
        r8 = com.facebook.internal.u.Companion;
        r9 = com.facebook.G.d;
        r7 = new java.lang.Object[]{r7.toString()};
        r8.getClass();
        com.facebook.internal.u.a.b(r9, "AppEvents", "Fetching extended device info parameters failed: '%s'", r7);
     */
    /* JADX WARN: Removed duplicated region for block: B:17:0x00ac  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x00be  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x0169  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x0182  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x018a  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x0195  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x019b  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x01bf  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x0187  */
    @JvmStatic
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final JSONObject a(a activityType, C0705a c0705a, String str, boolean z, Context context) throws JSONException {
        SharedPreferences sharedPreferences;
        Boolean valueOf;
        String a2;
        String a3;
        JSONObject n;
        String D;
        Intrinsics.checkNotNullParameter(activityType, "activityType");
        Intrinsics.checkNotNullParameter(context, "context");
        JSONObject params = new JSONObject();
        params.put(NotificationCompat.CATEGORY_EVENT, a.get(activityType));
        com.facebook.appevents.l.Companion.getClass();
        if (!C0691c.d) {
            C0691c.a.getClass();
            C0691c.a();
        }
        ReentrantReadWriteLock reentrantReadWriteLock = C0691c.b;
        reentrantReadWriteLock.readLock().lock();
        try {
            String str2 = C0691c.c;
            reentrantReadWriteLock.readLock().unlock();
            if (str2 != null) {
                params.put("app_user_id", str2);
            }
            E e = E.a;
            Intrinsics.checkNotNullParameter(params, "params");
            Intrinsics.checkNotNullParameter(context, "context");
            C0715k.b bVar = C0715k.b.ServiceUpdateCompliance;
            if (!C0715k.b(bVar)) {
                params.put("anon_id", str);
            }
            params.put("application_tracking_enabled", !z);
            w wVar = w.a;
            params.put("advertiser_id_collection_enabled", S.b());
            if (!com.facebook.internal.instrument.crashshield.a.b(S.class)) {
                try {
                    S.a.e();
                    sharedPreferences = S.i;
                    if (sharedPreferences == null) {
                        Intrinsics.throwUninitializedPropertyAccessException("userSettingPref");
                        sharedPreferences = null;
                    }
                } catch (Throwable th) {
                    com.facebook.internal.instrument.crashshield.a.a(th, S.class);
                }
                if (sharedPreferences.contains("com.facebook.sdk.AddToMessagingCustomerBaseForWhatsApp")) {
                    SharedPreferences sharedPreferences2 = S.i;
                    if (sharedPreferences2 == null) {
                        Intrinsics.throwUninitializedPropertyAccessException("userSettingPref");
                        sharedPreferences2 = null;
                    }
                    valueOf = Boolean.valueOf(sharedPreferences2.getBoolean("com.facebook.sdk.AddToMessagingCustomerBaseForWhatsApp", false));
                    if (valueOf != null) {
                        params.put("add_to_messaging_customer_base_for_whatsapp", valueOf.booleanValue() ? "1" : SessionDescription.SUPPORTED_SDP_VERSION);
                    }
                    if (c0705a != null) {
                        if (C0715k.b(bVar)) {
                            if (Build.VERSION.SDK_INT >= 31) {
                                e.getClass();
                                if (E.y(context)) {
                                    if (!c0705a.e) {
                                        params.put("anon_id", str);
                                    }
                                }
                            } else {
                                e.getClass();
                            }
                            params.put("anon_id", str);
                        }
                        if (c0705a.c != null) {
                            if (C0715k.b(bVar)) {
                                if (Build.VERSION.SDK_INT >= 31) {
                                    e.getClass();
                                    if (E.y(context)) {
                                        if (!c0705a.e) {
                                            params.put("attribution", c0705a.c);
                                        }
                                    }
                                } else {
                                    e.getClass();
                                }
                                params.put("attribution", c0705a.c);
                            } else {
                                params.put("attribution", c0705a.c);
                            }
                        }
                        if (c0705a.a() != null) {
                            params.put("advertiser_id", c0705a.a());
                            params.put("advertiser_tracking_enabled", !c0705a.e);
                        }
                        if (!c0705a.e) {
                            H h = H.a;
                            if (!com.facebook.internal.instrument.crashshield.a.b(H.class)) {
                                try {
                                    if (!H.c.get()) {
                                        h.b();
                                    }
                                    HashMap hashMap = new HashMap();
                                    hashMap.putAll(H.d);
                                    hashMap.putAll(h.a());
                                    D = E.D(hashMap);
                                } catch (Throwable th2) {
                                    com.facebook.internal.instrument.crashshield.a.a(th2, H.class);
                                }
                                if (D.length() != 0) {
                                    params.put("ud", D);
                                }
                            }
                            D = null;
                            if (D.length() != 0) {
                            }
                        }
                        String str3 = c0705a.d;
                        if (str3 != null) {
                            params.put("installer_package", str3);
                        }
                    }
                    i.a aVar = i.Companion;
                    i a4 = aVar.a();
                    a2 = a4 == null ? a4.a("campaign_ids") : null;
                    if (a2 != null) {
                        params.put("campaign_ids", a2);
                    }
                    i a5 = aVar.a();
                    a3 = a5 != null ? a5.a("click_id") : null;
                    if (a3 != null) {
                        params.put("click_id", a3);
                    }
                    E.I(params, context);
                    n = E.n();
                    if (n != null) {
                        Iterator<String> keys = n.keys();
                        while (keys.hasNext()) {
                            String next = keys.next();
                            params.put(next, n.get(next));
                        }
                    }
                    params.put("application_package_name", context.getPackageName());
                    return params;
                }
            }
            valueOf = null;
            if (valueOf != null) {
            }
            if (c0705a != null) {
            }
            i.a aVar2 = i.Companion;
            i a42 = aVar2.a();
            if (a42 == null) {
            }
            if (a2 != null) {
            }
            i a52 = aVar2.a();
            if (a52 != null) {
            }
            if (a3 != null) {
            }
            E.I(params, context);
            n = E.n();
            if (n != null) {
            }
            params.put("application_package_name", context.getPackageName());
            return params;
        } catch (Throwable th3) {
            C0691c.b.readLock().unlock();
            throw th3;
        }
    }
}
