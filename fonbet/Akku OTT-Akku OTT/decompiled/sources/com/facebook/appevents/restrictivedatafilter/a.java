package com.facebook.appevents.restrictivedatafilter;

import androidx.annotation.RestrictTo;
import com.facebook.internal.E;
import com.facebook.internal.n;
import com.facebook.internal.p;
import com.facebook.w;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArraySet;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONObject;

@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
/* loaded from: classes3.dex */
public final class a {
    public static boolean b;
    public static final a a = new a();
    public static final ArrayList c = new ArrayList();
    public static final CopyOnWriteArraySet d = new CopyOnWriteArraySet();

    /* renamed from: com.facebook.appevents.restrictivedatafilter.a$a, reason: collision with other inner class name */
    public static final class C0085a {
        public String a;
        public HashMap b;

        public C0085a() {
            throw null;
        }
    }

    public final String a(String str, String str2) {
        if (!com.facebook.internal.instrument.crashshield.a.b(this)) {
            try {
                Iterator it = new ArrayList(c).iterator();
                while (it.hasNext()) {
                    C0085a c0085a = (C0085a) it.next();
                    if (c0085a != null && Intrinsics.areEqual(str, c0085a.a)) {
                        for (String str3 : c0085a.b.keySet()) {
                            if (Intrinsics.areEqual(str2, str3)) {
                                return (String) c0085a.b.get(str3);
                            }
                        }
                    }
                }
            } catch (Exception unused) {
            } catch (Throwable th) {
                com.facebook.internal.instrument.crashshield.a.a(th, this);
            }
        }
        return null;
    }

    public final void b() {
        String str;
        CopyOnWriteArraySet copyOnWriteArraySet = d;
        ArrayList arrayList = c;
        if (com.facebook.internal.instrument.crashshield.a.b(this)) {
            return;
        }
        try {
            n k = p.k(w.b(), false);
            if (k != null && (str = k.l) != null && str.length() != 0) {
                JSONObject jSONObject = new JSONObject(str);
                arrayList.clear();
                copyOnWriteArraySet.clear();
                Iterator<String> keys = jSONObject.keys();
                while (keys.hasNext()) {
                    String eventName = keys.next();
                    JSONObject jSONObject2 = jSONObject.getJSONObject(eventName);
                    if (jSONObject2 != null) {
                        JSONObject optJSONObject = jSONObject2.optJSONObject("restrictive_param");
                        Intrinsics.checkNotNullExpressionValue(eventName, "key");
                        HashMap restrictiveParams = new HashMap();
                        Intrinsics.checkNotNullParameter(eventName, "eventName");
                        Intrinsics.checkNotNullParameter(restrictiveParams, "restrictiveParams");
                        C0085a c0085a = new C0085a();
                        c0085a.a = eventName;
                        c0085a.b = restrictiveParams;
                        if (optJSONObject != null) {
                            HashMap h = E.h(optJSONObject);
                            Intrinsics.checkNotNullParameter(h, "<set-?>");
                            c0085a.b = h;
                            arrayList.add(c0085a);
                        }
                        if (jSONObject2.has("process_event_name")) {
                            copyOnWriteArraySet.add(eventName);
                        }
                    }
                }
            }
        } catch (Exception unused) {
        } catch (Throwable th) {
            com.facebook.internal.instrument.crashshield.a.a(th, this);
        }
    }
}
