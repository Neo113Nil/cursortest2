package com.facebook.appevents.eventdeactivation;

import androidx.annotation.RestrictTo;
import com.facebook.appevents.C0692d;
import com.facebook.internal.E;
import com.facebook.internal.n;
import com.facebook.internal.p;
import com.facebook.w;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONArray;
import org.json.JSONObject;

@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
/* loaded from: classes3.dex */
public final class a {
    public static boolean b;
    public static final a a = new a();
    public static final ArrayList c = new ArrayList();
    public static final HashSet d = new HashSet();

    /* renamed from: com.facebook.appevents.eventdeactivation.a$a, reason: collision with other inner class name */
    public static final class C0076a {
        public String a;
        public ArrayList b;

        public C0076a() {
            throw null;
        }
    }

    @JvmStatic
    public static final void b(List<C0692d> events) {
        if (com.facebook.internal.instrument.crashshield.a.b(a.class)) {
            return;
        }
        try {
            Intrinsics.checkNotNullParameter(events, "events");
            if (b) {
                Iterator<C0692d> it = events.iterator();
                while (it.hasNext()) {
                    if (d.contains(it.next().e)) {
                        it.remove();
                    }
                }
            }
        } catch (Throwable th) {
            com.facebook.internal.instrument.crashshield.a.a(th, a.class);
        }
    }

    public final synchronized void a() {
        n k;
        if (com.facebook.internal.instrument.crashshield.a.b(this)) {
            return;
        }
        try {
            k = p.k(w.b(), false);
        } catch (Exception unused) {
        } catch (Throwable th) {
            com.facebook.internal.instrument.crashshield.a.a(th, this);
            return;
        }
        if (k == null) {
            return;
        }
        String str = k.l;
        if (str != null && str.length() > 0) {
            JSONObject jSONObject = new JSONObject(str);
            c.clear();
            Iterator<String> keys = jSONObject.keys();
            while (keys.hasNext()) {
                String key = keys.next();
                JSONObject jSONObject2 = jSONObject.getJSONObject(key);
                if (jSONObject2 != null) {
                    if (jSONObject2.optBoolean("is_deprecated_event")) {
                        HashSet hashSet = d;
                        Intrinsics.checkNotNullExpressionValue(key, "key");
                        hashSet.add(key);
                    } else {
                        JSONArray optJSONArray = jSONObject2.optJSONArray("deprecated_param");
                        Intrinsics.checkNotNullExpressionValue(key, "key");
                        ArrayList deprecateParams = new ArrayList();
                        Intrinsics.checkNotNullParameter(key, "eventName");
                        Intrinsics.checkNotNullParameter(deprecateParams, "deprecateParams");
                        C0076a c0076a = new C0076a();
                        c0076a.a = key;
                        c0076a.b = deprecateParams;
                        if (optJSONArray != null) {
                            ArrayList f = E.f(optJSONArray);
                            Intrinsics.checkNotNullParameter(f, "<set-?>");
                            c0076a.b = f;
                        }
                        c.add(c0076a);
                    }
                }
            }
        }
    }
}
