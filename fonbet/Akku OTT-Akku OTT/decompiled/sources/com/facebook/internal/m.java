package com.facebook.internal;

import android.content.Context;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import androidx.annotation.RestrictTo;
import androidx.annotation.VisibleForTesting;
import androidx.media3.ui.RunnableC0622c;
import com.facebook.internal.C0715k;
import com.facebook.z;
import io.flutter.plugins.firebase.crashlytics.Constants;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.jvm.internal.StringCompanionObject;
import kotlin.time.DurationKt;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
@SourceDebugExtension({"SMAP\nFetchedAppGateKeepersManager.kt\nKotlin\n*S Kotlin\n*F\n+ 1 FetchedAppGateKeepersManager.kt\ncom/facebook/internal/FetchedAppGateKeepersManager\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 3 _Maps.kt\nkotlin/collections/MapsKt___MapsKt\n*L\n1#1,274:1\n1855#2,2:275\n125#3:277\n152#3,3:278\n*S KotlinDebug\n*F\n+ 1 FetchedAppGateKeepersManager.kt\ncom/facebook/internal/FetchedAppGateKeepersManager\n*L\n170#1:275,2\n181#1:277\n181#1:278,3\n*E\n"})
/* loaded from: classes3.dex */
public final class m {
    public static final m a = new m();
    public static final AtomicBoolean b = new AtomicBoolean(false);
    public static final ConcurrentLinkedQueue<a> c = new ConcurrentLinkedQueue<>();
    public static final ConcurrentHashMap d = new ConcurrentHashMap();
    public static volatile Long e;
    public static volatile com.facebook.internal.gatekeeper.b f;

    public interface a {
        void a();
    }

    public static JSONObject a() {
        Bundle bundle = new Bundle();
        bundle.putString("platform", "android");
        com.facebook.w wVar = com.facebook.w.a;
        bundle.putString("sdk_version", "18.3.0");
        bundle.putString("fields", "gatekeepers");
        z.c cVar = com.facebook.z.Companion;
        StringCompanionObject stringCompanionObject = StringCompanionObject.INSTANCE;
        String format = String.format("app/%s", Arrays.copyOf(new Object[]{"mobile_sdk_gk"}, 1));
        Intrinsics.checkNotNullExpressionValue(format, "format(format, *args)");
        cVar.getClass();
        com.facebook.z g = z.c.g(null, format, null);
        Intrinsics.checkNotNullParameter(bundle, "<set-?>");
        g.d = bundle;
        JSONObject jSONObject = g.c().d;
        return jSONObject == null ? new JSONObject() : jSONObject;
    }

    @JvmStatic
    public static final boolean b(String name, String appId, boolean z) {
        HashMap hashMap;
        Boolean bool;
        Intrinsics.checkNotNullParameter(name, "name");
        m mVar = a;
        ArrayList<com.facebook.internal.gatekeeper.a> arrayList = null;
        d(null);
        if (mVar.c(appId) == null) {
            hashMap = new HashMap();
        } else {
            com.facebook.internal.gatekeeper.b bVar = f;
            if (bVar != null) {
                Intrinsics.checkNotNullParameter(appId, "appId");
                ConcurrentHashMap<String, com.facebook.internal.gatekeeper.a> concurrentHashMap = bVar.a.get(appId);
                if (concurrentHashMap != null) {
                    arrayList = new ArrayList(concurrentHashMap.size());
                    Iterator<Map.Entry<String, com.facebook.internal.gatekeeper.a>> it = concurrentHashMap.entrySet().iterator();
                    while (it.hasNext()) {
                        arrayList.add(it.next().getValue());
                    }
                }
            }
            if (arrayList != null) {
                hashMap = new HashMap();
                for (com.facebook.internal.gatekeeper.a aVar : arrayList) {
                    hashMap.put(aVar.a, Boolean.valueOf(aVar.b));
                }
            } else {
                HashMap hashMap2 = new HashMap();
                JSONObject c2 = mVar.c(appId);
                if (c2 == null) {
                    c2 = new JSONObject();
                }
                Iterator<String> keys = c2.keys();
                while (keys.hasNext()) {
                    String key = keys.next();
                    Intrinsics.checkNotNullExpressionValue(key, "key");
                    hashMap2.put(key, Boolean.valueOf(c2.optBoolean(key)));
                }
                com.facebook.internal.gatekeeper.b bVar2 = f;
                if (bVar2 == null) {
                    bVar2 = new com.facebook.internal.gatekeeper.b();
                }
                ArrayList gateKeeperList = new ArrayList(hashMap2.size());
                for (Map.Entry entry : hashMap2.entrySet()) {
                    gateKeeperList.add(new com.facebook.internal.gatekeeper.a((String) entry.getKey(), ((Boolean) entry.getValue()).booleanValue()));
                }
                Intrinsics.checkNotNullParameter(appId, "appId");
                Intrinsics.checkNotNullParameter(gateKeeperList, "gateKeeperList");
                ConcurrentHashMap<String, com.facebook.internal.gatekeeper.a> concurrentHashMap2 = new ConcurrentHashMap<>();
                Iterator it2 = gateKeeperList.iterator();
                while (it2.hasNext()) {
                    com.facebook.internal.gatekeeper.a aVar2 = (com.facebook.internal.gatekeeper.a) it2.next();
                    concurrentHashMap2.put(aVar2.a, aVar2);
                }
                bVar2.a.put(appId, concurrentHashMap2);
                f = bVar2;
                hashMap = hashMap2;
            }
        }
        return (hashMap.containsKey(name) && (bool = (Boolean) hashMap.get(name)) != null) ? bool.booleanValue() : z;
    }

    @JvmStatic
    public static final synchronized void d(C0715k.d dVar) {
        synchronized (m.class) {
            if (dVar != null) {
                try {
                    c.add(dVar);
                } catch (Throwable th) {
                    throw th;
                }
            }
            String b2 = com.facebook.w.b();
            m mVar = a;
            Long l = e;
            if (l != null && System.currentTimeMillis() - l.longValue() < DurationKt.MILLIS_IN_HOUR && mVar.c(b2) != null) {
                f();
                return;
            }
            Context a2 = com.facebook.w.a();
            StringCompanionObject stringCompanionObject = StringCompanionObject.INSTANCE;
            String format = String.format("com.facebook.internal.APP_GATEKEEPERS.%s", Arrays.copyOf(new Object[]{b2}, 1));
            Intrinsics.checkNotNullExpressionValue(format, "format(format, *args)");
            if (a2 == null) {
                return;
            }
            JSONObject jSONObject = null;
            String string = a2.getSharedPreferences("com.facebook.internal.preferences.APP_GATEKEEPERS", 0).getString(format, null);
            if (!E.z(string)) {
                try {
                    jSONObject = new JSONObject(string);
                } catch (JSONException unused) {
                    com.facebook.w wVar = com.facebook.w.a;
                }
                if (jSONObject != null) {
                    e(b2, jSONObject);
                }
            }
            Executor c2 = com.facebook.w.c();
            if (b.compareAndSet(false, true)) {
                c2.execute(new l(a2, b2, format));
            }
        }
    }

    @JvmStatic
    @VisibleForTesting(otherwise = 2)
    public static final synchronized JSONObject e(String applicationId, JSONObject jSONObject) {
        JSONObject jSONObject2;
        synchronized (m.class) {
            try {
                Intrinsics.checkNotNullParameter(applicationId, "applicationId");
                JSONObject c2 = a.c(applicationId);
                jSONObject2 = c2 != null ? new JSONObject(c2.toString()) : new JSONObject();
                JSONArray optJSONArray = jSONObject.optJSONArray("data");
                JSONObject optJSONObject = optJSONArray != null ? optJSONArray.optJSONObject(0) : null;
                if (optJSONObject == null) {
                    optJSONObject = new JSONObject();
                }
                JSONArray optJSONArray2 = optJSONObject.optJSONArray("gatekeepers");
                if (optJSONArray2 == null) {
                    optJSONArray2 = new JSONArray();
                }
                int length = optJSONArray2.length();
                for (int i = 0; i < length; i++) {
                    try {
                        JSONObject jSONObject3 = optJSONArray2.getJSONObject(i);
                        jSONObject2.put(jSONObject3.getString(Constants.KEY), jSONObject3.getBoolean("value"));
                    } catch (JSONException unused) {
                        E e2 = E.a;
                        com.facebook.w wVar = com.facebook.w.a;
                    }
                }
                synchronized (a) {
                    d.put(applicationId, jSONObject2);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return jSONObject2;
    }

    public static void f() {
        Handler handler = new Handler(Looper.getMainLooper());
        while (true) {
            ConcurrentLinkedQueue<a> concurrentLinkedQueue = c;
            if (concurrentLinkedQueue.isEmpty()) {
                return;
            }
            a poll = concurrentLinkedQueue.poll();
            if (poll != null) {
                handler.post(new RunnableC0622c(poll, 3));
            }
        }
    }

    public final synchronized JSONObject c(String str) {
        return (JSONObject) d.get(str);
    }
}
