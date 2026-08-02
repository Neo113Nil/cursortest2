package com.facebook.internal;

import android.app.Application;
import android.content.Context;
import android.content.SharedPreferences;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import com.facebook.S;
import com.facebook.appevents.l;
import com.facebook.internal.B;
import com.facebook.internal.C0712h;
import com.facebook.internal.n;
import com.facebook.internal.p;
import com.facebook.z;
import io.flutter.plugins.firebase.crashlytics.Constants;
import java.util.ArrayList;
import java.util.EnumSet;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.atomic.AtomicReference;
import kotlin.Pair;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.jvm.internal.StringCompanionObject;
import kotlin.text.StringsKt__StringsJVMKt;
import kotlin.text.StringsKt__StringsKt;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

@SourceDebugExtension({"SMAP\nFetchedAppSettingsManager.kt\nKotlin\n*S Kotlin\n*F\n+ 1 FetchedAppSettingsManager.kt\ncom/facebook/internal/FetchedAppSettingsManager\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,573:1\n1#2:574\n*E\n"})
/* loaded from: classes3.dex */
public final class p {
    public static final p a = new p();
    public static final List<String> b = CollectionsKt.listOf((Object[]) new String[]{"supports_implicit_sdk_logging", "gdpv4_nux_content", "gdpv4_nux_enabled", "android_dialog_configs", "android_sdk_error_categories", "app_events_session_timeout", "app_events_feature_bitmask", "auto_event_mapping_android", "seamless_login", "smart_login_bookmark_icon_url", "smart_login_menu_icon_url", "restrictive_data_filter_params", "aam_rules", "suggested_events_setting", "protected_mode_rules", "auto_log_app_events_default", "auto_log_app_events_enabled", androidx.compose.runtime.t.b(')', Build.VERSION.RELEASE, new StringBuilder("app_events_config.os_version("))});
    public static final ConcurrentHashMap c = new ConcurrentHashMap();
    public static final AtomicReference<a> d = new AtomicReference<>(a.a);
    public static final ConcurrentLinkedQueue<b> e = new ConcurrentLinkedQueue<>();
    public static volatile boolean f;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    public static final class a {
        public static final a a;
        public static final a b;
        public static final a c;
        public static final a d;
        public static final /* synthetic */ a[] e;

        static {
            a aVar = new a("NOT_LOADED", 0);
            a = aVar;
            a aVar2 = new a("LOADING", 1);
            b = aVar2;
            a aVar3 = new a("SUCCESS", 2);
            c = aVar3;
            a aVar4 = new a("ERROR", 3);
            d = aVar4;
            e = new a[]{aVar, aVar2, aVar3, aVar4};
        }

        public a() {
            throw null;
        }

        public static a valueOf(String str) {
            return (a) Enum.valueOf(a.class, str);
        }

        public static a[] values() {
            return (a[]) e.clone();
        }
    }

    public interface b {
        void onSuccess();
    }

    public static JSONObject a() {
        Bundle bundle = new Bundle();
        ArrayList arrayList = new ArrayList();
        arrayList.addAll(b);
        bundle.putString("fields", TextUtils.join(",", arrayList));
        com.facebook.z.Companion.getClass();
        com.facebook.z g = z.c.g(null, "app", null);
        g.i = true;
        Intrinsics.checkNotNullParameter(bundle, "<set-?>");
        g.d = bundle;
        JSONObject jSONObject = g.c().d;
        return jSONObject == null ? new JSONObject() : jSONObject;
    }

    @JvmStatic
    public static final n b(String str) {
        return (n) c.get(str);
    }

    @JvmStatic
    public static final HashMap c() {
        JSONObject jSONObject;
        Context a2 = com.facebook.w.a();
        String b2 = com.facebook.w.b();
        StringCompanionObject stringCompanionObject = StringCompanionObject.INSTANCE;
        String string = a2.getSharedPreferences("com.facebook.internal.preferences.APP_SETTINGS", 0).getString(androidx.credentials.provider.p.a(new Object[]{b2}, 1, "com.facebook.internal.APP_SETTINGS.%s", "format(format, *args)"), null);
        if (!E.z(string)) {
            if (string == null) {
                throw new IllegalStateException("Required value was null.");
            }
            try {
                jSONObject = new JSONObject(string);
            } catch (JSONException unused) {
                com.facebook.w wVar = com.facebook.w.a;
                jSONObject = null;
            }
            if (jSONObject != null) {
                a.getClass();
                return h(jSONObject);
            }
        }
        return null;
    }

    @JvmStatic
    public static final void d() {
        final Context a2 = com.facebook.w.a();
        final String b2 = com.facebook.w.b();
        boolean z = E.z(b2);
        a aVar = a.d;
        p pVar = a;
        AtomicReference<a> atomicReference = d;
        if (z) {
            atomicReference.set(aVar);
            pVar.j();
            return;
        }
        if (c.containsKey(b2)) {
            atomicReference.set(a.c);
            pVar.j();
            return;
        }
        while (true) {
            a aVar2 = a.a;
            a aVar3 = a.b;
            if (atomicReference.compareAndSet(aVar2, aVar3)) {
                break;
            }
            if (atomicReference.get() != aVar2) {
                while (!atomicReference.compareAndSet(aVar, aVar3)) {
                    if (atomicReference.get() != aVar) {
                        pVar.j();
                        return;
                    }
                }
            }
        }
        StringCompanionObject stringCompanionObject = StringCompanionObject.INSTANCE;
        final String a3 = androidx.credentials.provider.p.a(new Object[]{b2}, 1, "com.facebook.internal.APP_SETTINGS.%s", "format(format, *args)");
        com.facebook.w.c().execute(new Runnable() { // from class: com.facebook.internal.o
            @Override // java.lang.Runnable
            public final void run() {
                JSONObject jSONObject;
                Context context = a2;
                String settingsKey = a3;
                String applicationId = b2;
                Intrinsics.checkNotNullParameter(context, "$context");
                Intrinsics.checkNotNullParameter(settingsKey, "$settingsKey");
                Intrinsics.checkNotNullParameter(applicationId, "$applicationId");
                SharedPreferences sharedPreferences = context.getSharedPreferences("com.facebook.internal.preferences.APP_SETTINGS", 0);
                n nVar = null;
                String string = sharedPreferences.getString(settingsKey, null);
                if (!E.z(string)) {
                    if (string == null) {
                        throw new IllegalStateException("Required value was null.");
                    }
                    try {
                        jSONObject = new JSONObject(string);
                    } catch (JSONException unused) {
                        com.facebook.w wVar = com.facebook.w.a;
                        jSONObject = null;
                    }
                    if (jSONObject != null) {
                        p.a.getClass();
                        nVar = p.e(applicationId, jSONObject);
                    }
                }
                p pVar2 = p.a;
                pVar2.getClass();
                JSONObject a4 = p.a();
                p.e(applicationId, a4);
                sharedPreferences.edit().putString(settingsKey, a4.toString()).apply();
                if (nVar != null) {
                    String str = nVar.i;
                    if (!p.f && str != null && str.length() > 0) {
                        p.f = true;
                    }
                }
                m mVar = m.a;
                Intrinsics.checkNotNullParameter(applicationId, "applicationId");
                JSONObject a5 = m.a();
                Context a6 = com.facebook.w.a();
                StringCompanionObject stringCompanionObject2 = StringCompanionObject.INSTANCE;
                a6.getSharedPreferences("com.facebook.internal.preferences.APP_GATEKEEPERS", 0).edit().putString(androidx.credentials.provider.p.a(new Object[]{applicationId}, 1, "com.facebook.internal.APP_GATEKEEPERS.%s", "format(format, *args)"), a5.toString()).apply();
                m.e(applicationId, a5);
                com.facebook.appevents.internal.k kVar = com.facebook.appevents.internal.k.a;
                Context a7 = com.facebook.w.a();
                String b3 = com.facebook.w.b();
                if (S.c() && (a7 instanceof Application)) {
                    com.facebook.appevents.l.Companion.getClass();
                    l.a.a((Application) a7, b3);
                }
                p.d.set(p.c.containsKey(applicationId) ? p.a.c : p.a.d);
                pVar2.j();
            }
        });
    }

    public static n e(String applicationId, JSONObject settingsJSON) {
        C0712h c0712h;
        String optString;
        boolean equals;
        JSONArray jSONArray;
        boolean equals2;
        boolean equals3;
        Long l;
        String str;
        Long valueOf;
        String str2;
        JSONArray optJSONArray;
        List split$default;
        String str3;
        String str4;
        EnumSet enumSet;
        n.b bVar;
        int i;
        Intrinsics.checkNotNullParameter(applicationId, "applicationId");
        Intrinsics.checkNotNullParameter(settingsJSON, "settingsJSON");
        JSONArray optJSONArray2 = settingsJSON.optJSONArray("android_sdk_error_categories");
        C0712h.Companion.getClass();
        String str5 = "name";
        n.b bVar2 = null;
        if (optJSONArray2 == null) {
            c0712h = null;
        } else {
            int length = optJSONArray2.length();
            HashMap hashMap = null;
            HashMap hashMap2 = null;
            HashMap hashMap3 = null;
            String str6 = null;
            String str7 = null;
            String str8 = null;
            int i2 = 0;
            while (i2 < length) {
                JSONObject optJSONObject = optJSONArray2.optJSONObject(i2);
                if (optJSONObject == null || (optString = optJSONObject.optString("name")) == null) {
                    jSONArray = optJSONArray2;
                } else {
                    equals = StringsKt__StringsJVMKt.equals(optString, "other", true);
                    jSONArray = optJSONArray2;
                    if (equals) {
                        str6 = optJSONObject.optString("recovery_message", null);
                        hashMap = C0712h.a.c(optJSONObject);
                    } else {
                        equals2 = StringsKt__StringsJVMKt.equals(optString, "transient", true);
                        if (equals2) {
                            str7 = optJSONObject.optString("recovery_message", null);
                            hashMap2 = C0712h.a.c(optJSONObject);
                        } else {
                            equals3 = StringsKt__StringsJVMKt.equals(optString, "login_recoverable", true);
                            if (equals3) {
                                str8 = optJSONObject.optString("recovery_message", null);
                                hashMap3 = C0712h.a.c(optJSONObject);
                            }
                        }
                    }
                }
                i2++;
                optJSONArray2 = jSONArray;
            }
            c0712h = new C0712h(hashMap, hashMap2, hashMap3, str6, str7, str8);
        }
        if (c0712h == null) {
            c0712h = C0712h.Companion.a();
        }
        C0712h c0712h2 = c0712h;
        int optInt = settingsJSON.optInt("app_events_feature_bitmask", 0);
        boolean z = (optInt & 8) != 0;
        boolean z2 = (optInt & 16) != 0;
        boolean z3 = (optInt & 32) != 0;
        JSONArray optJSONArray3 = settingsJSON.optJSONArray("auto_event_mapping_android");
        JSONObject optJSONObject2 = settingsJSON.optJSONObject("app_events_config");
        boolean optBoolean = settingsJSON.optBoolean("supports_implicit_sdk_logging", false);
        String optString2 = settingsJSON.optString("gdpv4_nux_content", "");
        Intrinsics.checkNotNullExpressionValue(optString2, "settingsJSON.optString(A…_SETTING_NUX_CONTENT, \"\")");
        settingsJSON.optBoolean("gdpv4_nux_enabled", false);
        int optInt2 = settingsJSON.optInt("app_events_session_timeout", 60);
        B.a aVar = B.Companion;
        long optLong = settingsJSON.optLong("seamless_login");
        aVar.getClass();
        EnumSet result = EnumSet.noneOf(B.class);
        Iterator<E> it = B.b.iterator();
        while (it.hasNext()) {
            B b2 = (B) it.next();
            if ((b2.a & optLong) != 0) {
                result.add(b2);
            }
        }
        Intrinsics.checkNotNullExpressionValue(result, "result");
        JSONObject optJSONObject3 = settingsJSON.optJSONObject("android_dialog_configs");
        HashMap hashMap4 = new HashMap();
        if (optJSONObject3 != null && (optJSONArray = optJSONObject3.optJSONArray("data")) != null) {
            int length2 = optJSONArray.length();
            int i3 = 0;
            while (i3 < length2) {
                n.b.a aVar2 = n.b.Companion;
                JSONObject dialogConfigJSON = optJSONArray.optJSONObject(i3);
                Intrinsics.checkNotNullExpressionValue(dialogConfigJSON, "dialogConfigData.optJSONObject(i)");
                aVar2.getClass();
                Intrinsics.checkNotNullParameter(dialogConfigJSON, "dialogConfigJSON");
                String dialogNameWithFeature = dialogConfigJSON.optString(str5);
                if (E.z(dialogNameWithFeature)) {
                    str3 = str5;
                    bVar = bVar2;
                    str4 = optString2;
                    enumSet = result;
                } else {
                    Intrinsics.checkNotNullExpressionValue(dialogNameWithFeature, "dialogNameWithFeature");
                    split$default = StringsKt__StringsKt.split$default(dialogNameWithFeature, new String[]{"|"}, false, 0, 6, (Object) null);
                    if (split$default.size() == 2) {
                        String str9 = (String) CollectionsKt.first(split$default);
                        String str10 = (String) CollectionsKt.last(split$default);
                        if (!E.z(str9) && !E.z(str10)) {
                            String optString3 = dialogConfigJSON.optString("url");
                            if (!E.z(optString3)) {
                                Uri.parse(optString3);
                            }
                            JSONArray optJSONArray4 = dialogConfigJSON.optJSONArray("versions");
                            if (optJSONArray4 != null) {
                                int length3 = optJSONArray4.length();
                                int[] iArr = new int[length3];
                                str3 = str5;
                                int i4 = 0;
                                while (i4 < length3) {
                                    String str11 = optString2;
                                    EnumSet enumSet2 = result;
                                    int optInt3 = optJSONArray4.optInt(i4, -1);
                                    if (optInt3 == -1) {
                                        String versionString = optJSONArray4.optString(i4);
                                        if (!E.z(versionString)) {
                                            try {
                                                Intrinsics.checkNotNullExpressionValue(versionString, "versionString");
                                                i = Integer.parseInt(versionString);
                                            } catch (NumberFormatException unused) {
                                                com.facebook.w wVar = com.facebook.w.a;
                                                i = -1;
                                            }
                                            optInt3 = i;
                                        }
                                    }
                                    iArr[i4] = optInt3;
                                    i4++;
                                    optString2 = str11;
                                    result = enumSet2;
                                }
                            } else {
                                str3 = str5;
                            }
                            str4 = optString2;
                            enumSet = result;
                            bVar = new n.b(str9, str10);
                        }
                    }
                    str3 = str5;
                    str4 = optString2;
                    enumSet = result;
                    bVar = null;
                }
                if (bVar != null) {
                    String str12 = bVar.a;
                    Map map = (Map) hashMap4.get(str12);
                    if (map == null) {
                        map = new HashMap();
                        hashMap4.put(str12, map);
                    }
                    map.put(bVar.b, bVar);
                }
                i3++;
                str5 = str3;
                optString2 = str4;
                result = enumSet;
                bVar2 = null;
            }
        }
        String str13 = optString2;
        EnumSet enumSet3 = result;
        String optString4 = settingsJSON.optString("smart_login_bookmark_icon_url");
        Intrinsics.checkNotNullExpressionValue(optString4, "settingsJSON.optString(S…_LOGIN_BOOKMARK_ICON_URL)");
        String optString5 = settingsJSON.optString("smart_login_menu_icon_url");
        Intrinsics.checkNotNullExpressionValue(optString5, "settingsJSON.optString(SMART_LOGIN_MENU_ICON_URL)");
        String optString6 = settingsJSON.optString("sdk_update_message");
        Intrinsics.checkNotNullExpressionValue(optString6, "settingsJSON.optString(SDK_UPDATE_MESSAGE)");
        String optString7 = settingsJSON.optString("aam_rules");
        String optString8 = settingsJSON.optString("suggested_events_setting");
        String optString9 = settingsJSON.optString("restrictive_data_filter_params");
        JSONArray i5 = i("standard_params", settingsJSON.optJSONObject("protected_mode_rules"));
        JSONArray i6 = i("maca_rules", settingsJSON.optJSONObject("protected_mode_rules"));
        HashMap h = h(settingsJSON);
        JSONArray i7 = i("blocklist_events", settingsJSON.optJSONObject("protected_mode_rules"));
        JSONArray i8 = i("redacted_events", settingsJSON.optJSONObject("protected_mode_rules"));
        JSONArray i9 = i("sensitive_params", settingsJSON.optJSONObject("protected_mode_rules"));
        JSONArray i10 = i("standard_params_schema", settingsJSON.optJSONObject("protected_mode_rules"));
        JSONArray i11 = i("standard_params_blocked", settingsJSON.optJSONObject("protected_mode_rules"));
        JSONObject optJSONObject4 = settingsJSON.optJSONObject("protected_mode_rules");
        if (optJSONObject4 == null || optJSONObject4.isNull("vvp_config")) {
            l = null;
            str = null;
        } else {
            l = null;
            str = optJSONObject4.optString("vvp_config", null);
        }
        ArrayList f2 = f("fb_currency", optJSONObject2);
        ArrayList f3 = f("_valueToSum", optJSONObject2);
        ArrayList g = g(optJSONObject2, false);
        ArrayList g2 = g(optJSONObject2, true);
        JSONObject optJSONObject5 = settingsJSON.optJSONObject("app_events_config");
        if (optJSONObject5 != null) {
            try {
                valueOf = Long.valueOf(optJSONObject5.optLong("iap_manual_and_auto_log_dedup_window_millis"));
                str2 = optString6;
            } catch (Exception unused2) {
            }
            n nVar = new n(optBoolean, str13, optInt2, enumSet3, hashMap4, z, c0712h2, optString4, optString5, z2, z3, optJSONArray3, str2, optString7, optString8, optString9, i5, i6, h, i7, i8, i9, i10, i11, str, f2, f3, g, g2, valueOf);
            c.put(applicationId, nVar);
            return nVar;
        }
        str2 = optString6;
        valueOf = l;
        n nVar2 = new n(optBoolean, str13, optInt2, enumSet3, hashMap4, z, c0712h2, optString4, optString5, z2, z3, optJSONArray3, str2, optString7, optString8, optString9, i5, i6, h, i7, i8, i9, i10, i11, str, f2, f3, g, g2, valueOf);
        c.put(applicationId, nVar2);
        return nVar2;
    }

    public static ArrayList f(String str, JSONObject jSONObject) {
        JSONArray jSONArray;
        if (jSONObject != null) {
            try {
                jSONArray = jSONObject.getJSONArray("iap_manual_and_auto_log_dedup_keys");
            } catch (Exception unused) {
            }
        } else {
            jSONArray = null;
        }
        if (jSONArray != null) {
            int length = jSONArray.length();
            for (int i = 0; i < length; i++) {
                JSONObject jSONObject2 = jSONArray.getJSONObject(i);
                if (Intrinsics.areEqual(jSONObject2.getString(Constants.KEY), "prod_keys")) {
                    JSONArray jSONArray2 = jSONObject2.getJSONArray("value");
                    int length2 = jSONArray2.length();
                    for (int i2 = 0; i2 < length2; i2++) {
                        JSONObject jSONObject3 = jSONArray2.getJSONObject(i2);
                        if (Intrinsics.areEqual(jSONObject3.getString(Constants.KEY), str)) {
                            JSONArray jSONArray3 = jSONObject3.getJSONArray("value");
                            ArrayList arrayList = new ArrayList();
                            int length3 = jSONArray3.length();
                            for (int i3 = 0; i3 < length3; i3++) {
                                arrayList.add(jSONArray3.getJSONObject(i3).getString("value"));
                            }
                            ArrayList arrayList2 = new ArrayList();
                            arrayList2.addAll(arrayList);
                            return arrayList2;
                        }
                    }
                }
            }
        }
        return null;
    }

    public static ArrayList g(JSONObject jSONObject, boolean z) {
        JSONArray jSONArray;
        if (jSONObject != null) {
            try {
                jSONArray = jSONObject.getJSONArray("iap_manual_and_auto_log_dedup_keys");
            } catch (Exception unused) {
            }
        } else {
            jSONArray = null;
        }
        if (jSONArray == null) {
            return null;
        }
        int length = jSONArray.length();
        ArrayList arrayList = null;
        for (int i = 0; i < length; i++) {
            JSONObject jSONObject2 = jSONArray.getJSONObject(i);
            String string = jSONObject2.getString(Constants.KEY);
            if ((!Intrinsics.areEqual(string, "prod_keys") || !z) && (!Intrinsics.areEqual(string, "test_keys") || z)) {
                JSONArray jSONArray2 = jSONObject2.getJSONArray("value");
                int length2 = jSONArray2.length();
                for (int i2 = 0; i2 < length2; i2++) {
                    JSONObject jSONObject3 = jSONArray2.getJSONObject(i2);
                    String string2 = jSONObject3.getString(Constants.KEY);
                    if (!Intrinsics.areEqual(string2, "_valueToSum") && !Intrinsics.areEqual(string2, "fb_currency")) {
                        JSONArray jSONArray3 = jSONObject3.getJSONArray("value");
                        ArrayList arrayList2 = new ArrayList();
                        int length3 = jSONArray3.length();
                        for (int i3 = 0; i3 < length3; i3++) {
                            try {
                                arrayList2.add(jSONArray3.getJSONObject(i3).getString("value"));
                            } catch (Exception unused2) {
                                return null;
                            }
                        }
                        if (arrayList == null) {
                            arrayList = new ArrayList();
                        }
                        arrayList.add(new Pair(string2, arrayList2));
                    }
                }
            }
        }
        return arrayList;
    }

    public static HashMap h(JSONObject jSONObject) {
        HashMap hashMap = new HashMap();
        if (!jSONObject.isNull("auto_log_app_events_default")) {
            try {
                hashMap.put("auto_log_app_events_default", Boolean.valueOf(jSONObject.getBoolean("auto_log_app_events_default")));
            } catch (JSONException unused) {
                E e2 = E.a;
                com.facebook.w wVar = com.facebook.w.a;
            }
        }
        if (!jSONObject.isNull("auto_log_app_events_enabled")) {
            try {
                hashMap.put("auto_log_app_events_enabled", Boolean.valueOf(jSONObject.getBoolean("auto_log_app_events_enabled")));
            } catch (JSONException unused2) {
                E e3 = E.a;
                com.facebook.w wVar2 = com.facebook.w.a;
            }
        }
        if (hashMap.isEmpty()) {
            return null;
        }
        return hashMap;
    }

    public static JSONArray i(String str, JSONObject jSONObject) {
        if (jSONObject != null) {
            return jSONObject.optJSONArray(str);
        }
        return null;
    }

    @JvmStatic
    public static final n k(String applicationId, boolean z) {
        Intrinsics.checkNotNullParameter(applicationId, "applicationId");
        if (!z) {
            ConcurrentHashMap concurrentHashMap = c;
            if (concurrentHashMap.containsKey(applicationId)) {
                return (n) concurrentHashMap.get(applicationId);
            }
        }
        p pVar = a;
        pVar.getClass();
        n e2 = e(applicationId, a());
        if (Intrinsics.areEqual(applicationId, com.facebook.w.b())) {
            d.set(a.c);
            pVar.j();
        }
        return e2;
    }

    public final synchronized void j() {
        a aVar = d.get();
        if (a.a != aVar && a.b != aVar) {
            n nVar = (n) c.get(com.facebook.w.b());
            Handler handler = new Handler(Looper.getMainLooper());
            if (a.d == aVar) {
                while (true) {
                    ConcurrentLinkedQueue<b> concurrentLinkedQueue = e;
                    if (concurrentLinkedQueue.isEmpty()) {
                        return;
                    } else {
                        handler.post(new androidx.media3.exoplayer.dash.c(concurrentLinkedQueue.poll(), 1));
                    }
                }
            } else {
                while (true) {
                    ConcurrentLinkedQueue<b> concurrentLinkedQueue2 = e;
                    if (concurrentLinkedQueue2.isEmpty()) {
                        return;
                    } else {
                        handler.post(new androidx.media3.exoplayer.dash.d(concurrentLinkedQueue2.poll(), nVar));
                    }
                }
            }
        }
    }
}
