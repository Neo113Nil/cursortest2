package com.inmobi.media;

import android.content.Context;
import android.content.SharedPreferences;
import android.preference.PreferenceManager;
import io.ktor.sse.ServerSentEventKt;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.inmobi.media.ra, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public abstract class AbstractC4045ra {

    /* renamed from: a, reason: collision with root package name */
    public static final Object f7347a = new Object();
    public static final Object b = new Object();
    public static boolean c;
    public static boolean d;
    public static JSONObject e;
    public static JSONObject f;

    public static final void a(JSONObject jSONObject) {
        synchronized (b) {
            String str = "setPublisherProvidedUnifiedId " + f + ServerSentEventKt.SPACE + jSONObject;
            f = jSONObject;
            d = true;
            Context context = AbstractC3914mk.f7252a;
            if (context != null) {
                ConcurrentHashMap concurrentHashMap = Db.b;
                Db a2 = Cb.a(context, "unified_id_info_store");
                JSONObject jSONObject2 = f;
                if (jSONObject2 == null) {
                    a2.a("publisher_provided_unified_id");
                } else {
                    a2.a("publisher_provided_unified_id", String.valueOf(jSONObject2), false);
                    Unit unit = Unit.INSTANCE;
                }
            }
        }
    }

    public static final JSONObject b() {
        synchronized (f7347a) {
            if (c) {
                return e;
            }
            c = true;
            Context context = AbstractC3914mk.f7252a;
            if (context != null) {
                ConcurrentHashMap concurrentHashMap = Db.b;
                Db a2 = Cb.a(context, "unified_id_info_store");
                Intrinsics.checkNotNullParameter("ufids", "key");
                String string = a2.f6510a.getString("ufids", null);
                if (string != null) {
                    try {
                        e = new JSONObject(string);
                    } catch (JSONException e2) {
                        String str = "Exception caught in getUnifiedIds : " + e2.getMessage();
                    }
                    return e;
                }
            }
            return null;
        }
    }

    public static final JSONObject a() {
        synchronized (b) {
            if (d) {
                String str = "publisherProvidedUnifiedIdInitialised initialised " + f;
                return f;
            }
            d = true;
            Context context = AbstractC3914mk.f7252a;
            String str2 = null;
            if (context != null) {
                ConcurrentHashMap concurrentHashMap = Db.b;
                Db a2 = Cb.a(context, "unified_id_info_store");
                Intrinsics.checkNotNullParameter("publisher_provided_unified_id", "key");
                str2 = a2.f6510a.getString("publisher_provided_unified_id", null);
            }
            try {
                f = new JSONObject(str2);
            } catch (NullPointerException e2) {
                String str3 = "Exception caught in getPublisherProvidedUnifiedIds : " + e2.getMessage();
            } catch (JSONException e3) {
                String str4 = "Exception caught in getPublisherProvidedUnifiedIds : " + e3.getMessage();
            }
            String str5 = "publisherProvidedUnifiedIdInitialised after initialising " + f;
            return f;
        }
    }

    public static final void b(JSONObject jSONObject) {
        synchronized (f7347a) {
            e = jSONObject;
            c = true;
            Context context = AbstractC3914mk.f7252a;
            if (context != null) {
                ConcurrentHashMap concurrentHashMap = Db.b;
                Db a2 = Cb.a(context, "unified_id_info_store");
                JSONObject jSONObject2 = e;
                if (jSONObject2 == null) {
                    a2.a("ufids");
                } else {
                    a2.a("ufids", String.valueOf(jSONObject2), false);
                }
                SharedPreferences.Editor edit = PreferenceManager.getDefaultSharedPreferences(context).edit();
                JSONObject jSONObject3 = e;
                if (jSONObject3 == null) {
                    edit.remove("InMobi_unifiedId");
                } else {
                    edit.putString("InMobi_unifiedId", String.valueOf(jSONObject3));
                }
                edit.apply();
            }
        }
    }
}
