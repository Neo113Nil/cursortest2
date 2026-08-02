package com.facebook.appevents.aam;

import androidx.annotation.RestrictTo;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArraySet;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt__StringsKt;
import org.json.JSONObject;

@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
/* loaded from: classes3.dex */
public final class d {
    public static final a Companion = new a();
    public static final CopyOnWriteArraySet d = new CopyOnWriteArraySet();
    public final String a;
    public final String b;
    public final List<String> c;

    public static final class a {
        public static void a(JSONObject jSONObject) {
            List split$default;
            Iterator<String> keys = jSONObject.keys();
            while (keys.hasNext()) {
                String key = keys.next();
                JSONObject optJSONObject = jSONObject.optJSONObject(key);
                if (optJSONObject != null) {
                    String k = optJSONObject.optString("k");
                    String v = optJSONObject.optString("v");
                    Intrinsics.checkNotNullExpressionValue(k, "k");
                    if (k.length() != 0) {
                        CopyOnWriteArraySet a = d.a();
                        Intrinsics.checkNotNullExpressionValue(key, "key");
                        split$default = StringsKt__StringsKt.split$default(k, new String[]{","}, false, 0, 6, (Object) null);
                        Intrinsics.checkNotNullExpressionValue(v, "v");
                        a.add(new d(key, split$default, v));
                    }
                }
            }
        }
    }

    public d() {
        throw null;
    }

    public d(String str, List list, String str2) {
        this.a = str;
        this.b = str2;
        this.c = list;
    }

    public static final /* synthetic */ CopyOnWriteArraySet a() {
        if (com.facebook.internal.instrument.crashshield.a.b(d.class)) {
            return null;
        }
        try {
            return d;
        } catch (Throwable th) {
            com.facebook.internal.instrument.crashshield.a.a(th, d.class);
            return null;
        }
    }

    public final String b() {
        if (com.facebook.internal.instrument.crashshield.a.b(this)) {
            return null;
        }
        try {
            return this.a;
        } catch (Throwable th) {
            com.facebook.internal.instrument.crashshield.a.a(th, this);
            return null;
        }
    }
}
