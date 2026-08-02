package com.facebook.appevents.integrity;

import com.facebook.internal.E;
import com.facebook.internal.n;
import com.facebook.internal.p;
import com.facebook.w;
import io.flutter.plugins.firebase.crashlytics.Constants;
import java.util.HashMap;
import java.util.HashSet;
import kotlin.jvm.internal.SourceDebugExtension;
import org.json.JSONArray;
import org.json.JSONObject;

@SourceDebugExtension({"SMAP\nRedactedEventsManager.kt\nKotlin\n*S Kotlin\n*F\n+ 1 RedactedEventsManager.kt\ncom/facebook/appevents/integrity/RedactedEventsManager\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,83:1\n1855#2,2:84\n*S KotlinDebug\n*F\n+ 1 RedactedEventsManager.kt\ncom/facebook/appevents/integrity/RedactedEventsManager\n*L\n73#1:84,2\n*E\n"})
/* loaded from: classes3.dex */
public final class f {
    public static boolean b;
    public static final f a = new f();
    public static HashMap c = new HashMap();

    public final void a() {
        HashSet<String> e;
        if (com.facebook.internal.instrument.crashshield.a.b(this)) {
            return;
        }
        try {
            n k = p.k(w.b(), false);
            if (k == null) {
                return;
            }
            try {
                c = new HashMap();
                JSONArray jSONArray = k.q;
                if (jSONArray == null || jSONArray.length() == 0) {
                    return;
                }
                int length = jSONArray.length();
                for (int i = 0; i < length; i++) {
                    JSONObject jSONObject = jSONArray.getJSONObject(i);
                    boolean has = jSONObject.has(Constants.KEY);
                    boolean has2 = jSONObject.has("value");
                    if (has && has2) {
                        String string = jSONObject.getString(Constants.KEY);
                        JSONArray jSONArray2 = jSONObject.getJSONArray("value");
                        if (string != null && (e = E.e(jSONArray2)) != null) {
                            c.put(string, e);
                        }
                    }
                }
            } catch (Exception unused) {
            }
        } catch (Throwable th) {
            com.facebook.internal.instrument.crashshield.a.a(th, this);
        }
    }
}
