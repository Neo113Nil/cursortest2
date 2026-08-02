package com.facebook.appevents.integrity;

import android.os.Bundle;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import kotlin.collections.CollectionsKt;
import kotlin.collections.SetsKt;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes3.dex */
public final class i {
    public static final i a = new i();
    public static final Set<String> b = SetsKt.setOf((Object[]) new String[]{"fb_content_ids", "fb_content_id"});
    public static boolean c;
    public static volatile b d;

    public static final class a {
        public final int a;
        public final Pattern b;
        public final Pattern c;
        public final Pattern d;

        public a(int i, Pattern pattern, Pattern pattern2, Pattern pattern3) {
            this.a = i;
            this.b = pattern;
            this.c = pattern2;
            this.d = pattern3;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return this.a == aVar.a && Intrinsics.areEqual(this.b, aVar.b) && Intrinsics.areEqual(this.c, aVar.c) && Intrinsics.areEqual(this.d, aVar.d);
        }

        public final int hashCode() {
            int hashCode = Integer.hashCode(this.a) * 31;
            Pattern pattern = this.b;
            int hashCode2 = (hashCode + (pattern == null ? 0 : pattern.hashCode())) * 31;
            Pattern pattern2 = this.c;
            int hashCode3 = (hashCode2 + (pattern2 == null ? 0 : pattern2.hashCode())) * 31;
            Pattern pattern3 = this.d;
            return hashCode3 + (pattern3 != null ? pattern3.hashCode() : 0);
        }

        public final String toString() {
            return "CompiledRule(place=" + this.a + ", keyRegex=" + this.b + ", keyNegativeRegex=" + this.c + ", valueRegex=" + this.d + ')';
        }
    }

    public static final class b {
        public final List<a> a;
        public final Set<String> b;
        public final Set<String> c;
        public final boolean d;

        public b(List rules, Set standardParams, HashSet hashSet, boolean z) {
            Intrinsics.checkNotNullParameter(rules, "rules");
            Intrinsics.checkNotNullParameter(standardParams, "standardParams");
            this.a = rules;
            this.b = standardParams;
            this.c = hashSet;
            this.d = z;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof b)) {
                return false;
            }
            b bVar = (b) obj;
            return Intrinsics.areEqual(this.a, bVar.a) && Intrinsics.areEqual(this.b, bVar.b) && Intrinsics.areEqual(this.c, bVar.c) && this.d == bVar.d;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public final int hashCode() {
            int hashCode = (this.b.hashCode() + (this.a.hashCode() * 31)) * 31;
            Set<String> set = this.c;
            int hashCode2 = (hashCode + (set == null ? 0 : set.hashCode())) * 31;
            boolean z = this.d;
            int i = z;
            if (z != 0) {
                i = 1;
            }
            return hashCode2 + i;
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("VVPConfig(rules=");
            sb.append(this.a);
            sb.append(", standardParams=");
            sb.append(this.b);
            sb.append(", inScopeEventNames=");
            sb.append(this.c);
            sb.append(", isShadowEnabled=");
            return androidx.appcompat.view.menu.a.c(sb, this.d, ')');
        }
    }

    @JvmStatic
    public static final void f(Bundle bundle, String eventName) {
        b bVar;
        Pattern pattern;
        Matcher matcher;
        String obj;
        Matcher matcher2;
        Matcher matcher3;
        Matcher matcher4;
        if (com.facebook.internal.instrument.crashshield.a.b(i.class)) {
            return;
        }
        try {
            Intrinsics.checkNotNullParameter(eventName, "eventName");
            if (c && bundle != null && !bundle.isEmpty() && (bVar = d) != null) {
                Set<String> set = bVar.c;
                if (set == null || set.isEmpty() || set.contains(eventName)) {
                    LinkedHashSet linkedHashSet = new LinkedHashSet();
                    LinkedHashSet linkedHashSet2 = new LinkedHashSet();
                    boolean z = false;
                    for (a aVar : bVar.a) {
                        int i = aVar.a;
                        if (i == 1) {
                            Set<String> keySet = bundle.keySet();
                            Intrinsics.checkNotNullExpressionValue(keySet, "parameters.keySet()");
                            for (String str : CollectionsKt.toList(keySet)) {
                                Object obj2 = bundle.get(str);
                                if (obj2 != null && (obj = obj2.toString()) != null) {
                                    Pattern pattern2 = aVar.b;
                                    boolean find = (pattern2 == null || (matcher4 = pattern2.matcher(str)) == null) ? true : matcher4.find();
                                    Pattern pattern3 = aVar.c;
                                    boolean z2 = find && !((pattern3 == null || (matcher3 = pattern3.matcher(str)) == null) ? false : matcher3.find());
                                    Pattern pattern4 = aVar.d;
                                    boolean find2 = (pattern4 == null || (matcher2 = pattern4.matcher(obj)) == null) ? true : matcher2.find();
                                    if (z2 && find2) {
                                        linkedHashSet.add(str);
                                        z = true;
                                    }
                                }
                            }
                        } else if (i == 3 && (pattern = aVar.b) != null && pattern.matcher(eventName).find()) {
                            Pattern pattern5 = aVar.c;
                            if (!((pattern5 == null || (matcher = pattern5.matcher(eventName)) == null) ? false : matcher.find())) {
                                linkedHashSet2.add("1");
                                z = true;
                            }
                        }
                    }
                    if (z) {
                        if (!bVar.d && !bVar.b.isEmpty()) {
                            Set<String> keySet2 = bundle.keySet();
                            Intrinsics.checkNotNullExpressionValue(keySet2, "parameters.keySet()");
                            for (String str2 : CollectionsKt.toList(keySet2)) {
                                if (!bVar.b.contains(str2)) {
                                    if (b.contains(str2)) {
                                        bundle.putString(str2, "_removed_");
                                    } else {
                                        bundle.remove(str2);
                                    }
                                }
                            }
                            a.g(bundle);
                        }
                        bundle.putString("vvp", "1");
                        if (linkedHashSet.isEmpty() && linkedHashSet2.isEmpty()) {
                            return;
                        }
                        JSONObject jSONObject = new JSONObject();
                        if (!linkedHashSet.isEmpty()) {
                            jSONObject.put("vp_rp", new JSONArray((Collection) CollectionsKt.toList(linkedHashSet)));
                        }
                        if (!linkedHashSet2.isEmpty()) {
                            jSONObject.put("vp_rp_ev", new JSONArray((Collection) CollectionsKt.toList(linkedHashSet2)));
                        }
                        bundle.putString("vvp_md", jSONObject.toString());
                    }
                }
            }
        } catch (Throwable th) {
            com.facebook.internal.instrument.crashshield.a.a(th, i.class);
        }
    }

    public final Pattern a(String str, JSONObject jSONObject) {
        if (!com.facebook.internal.instrument.crashshield.a.b(this)) {
            try {
                if (jSONObject.has(str) && !jSONObject.isNull(str)) {
                    String raw = jSONObject.optString(str, "");
                    Intrinsics.checkNotNullExpressionValue(raw, "raw");
                    if (raw.length() != 0) {
                        try {
                            return Pattern.compile(raw, 2);
                        } catch (Exception unused) {
                        }
                    }
                }
            } catch (Throwable th) {
                com.facebook.internal.instrument.crashshield.a.a(th, this);
                return null;
            }
        }
        return null;
    }

    public final b b(String jsonStr) {
        if (!com.facebook.internal.instrument.crashshield.a.b(this)) {
            try {
                Intrinsics.checkNotNullParameter(jsonStr, "jsonStr");
                try {
                    JSONObject jSONObject = new JSONObject(jsonStr);
                    if (jSONObject.optBoolean("enabled", false)) {
                        List<a> d2 = d(jSONObject);
                        if (!d2.isEmpty()) {
                            return new b(d2, e(jSONObject), c(jSONObject), jSONObject.optBoolean("isShadowEnabled", true));
                        }
                    }
                } catch (JSONException unused) {
                }
            } catch (Throwable th) {
                com.facebook.internal.instrument.crashshield.a.a(th, this);
                return null;
            }
        }
        return null;
    }

    public final HashSet c(JSONObject jSONObject) {
        JSONArray optJSONArray;
        if (!com.facebook.internal.instrument.crashshield.a.b(this)) {
            try {
                if (jSONObject.has("inScopeEventNames") && !jSONObject.isNull("inScopeEventNames") && (optJSONArray = jSONObject.optJSONArray("inScopeEventNames")) != null) {
                    HashSet hashSet = new HashSet();
                    int length = optJSONArray.length();
                    for (int i = 0; i < length; i++) {
                        String s = optJSONArray.optString(i, "");
                        Intrinsics.checkNotNullExpressionValue(s, "s");
                        if (s.length() > 0) {
                            hashSet.add(s);
                        }
                    }
                    return hashSet;
                }
            } catch (Throwable th) {
                com.facebook.internal.instrument.crashshield.a.a(th, this);
                return null;
            }
        }
        return null;
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x006a  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x006b A[Catch: all -> 0x0015, TRY_LEAVE, TryCatch #1 {all -> 0x0015, blocks: (B:6:0x0008, B:8:0x0010, B:10:0x0017, B:12:0x0023, B:17:0x002a, B:23:0x006b, B:38:0x0064, B:26:0x0032, B:31:0x0045, B:35:0x005d), top: B:5:0x0008, inners: #0 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final List<a> d(JSONObject jSONObject) {
        int optInt;
        a aVar;
        if (com.facebook.internal.instrument.crashshield.a.b(this)) {
            return null;
        }
        try {
            JSONArray optJSONArray = jSONObject.optJSONArray("rules");
            if (optJSONArray == null) {
                return CollectionsKt.emptyList();
            }
            ArrayList arrayList = new ArrayList();
            int length = optJSONArray.length();
            for (int i = 0; i < length; i++) {
                JSONObject ruleObj = optJSONArray.optJSONObject(i);
                if (ruleObj != null) {
                    if (!com.facebook.internal.instrument.crashshield.a.b(this)) {
                        try {
                            Intrinsics.checkNotNullParameter(ruleObj, "ruleObj");
                            optInt = ruleObj.optInt("place", -1);
                        } catch (Throwable th) {
                            com.facebook.internal.instrument.crashshield.a.a(th, this);
                        }
                        if (optInt == 1 || optInt == 3) {
                            Pattern a2 = a("keyRegex", ruleObj);
                            Pattern a3 = a("keyNegativeRegex", ruleObj);
                            Pattern a4 = a("valueRegex", ruleObj);
                            if (a2 != null || a4 != null) {
                                aVar = new a(optInt, a2, a3, a4);
                                if (aVar == null) {
                                    arrayList.add(aVar);
                                }
                            }
                        }
                    }
                    aVar = null;
                    if (aVar == null) {
                    }
                }
            }
            return arrayList;
        } catch (Throwable th2) {
            com.facebook.internal.instrument.crashshield.a.a(th2, this);
            return null;
        }
    }

    public final Set<String> e(JSONObject jSONObject) {
        if (com.facebook.internal.instrument.crashshield.a.b(this)) {
            return null;
        }
        try {
            JSONObject optJSONObject = jSONObject.optJSONObject("standardParams");
            if (optJSONObject == null) {
                return SetsKt.emptySet();
            }
            HashSet hashSet = new HashSet();
            Iterator<String> keys = optJSONObject.keys();
            while (keys.hasNext()) {
                String next = keys.next();
                if (optJSONObject.optBoolean(next, false)) {
                    hashSet.add(next);
                }
            }
            return hashSet;
        } catch (Throwable th) {
            com.facebook.internal.instrument.crashshield.a.a(th, this);
            return null;
        }
    }

    public final void g(Bundle parameters) {
        if (com.facebook.internal.instrument.crashshield.a.b(this)) {
            return;
        }
        try {
            Intrinsics.checkNotNullParameter(parameters, "parameters");
            String string = parameters.getString("fb_content");
            if (string == null) {
                return;
            }
            try {
                JSONArray jSONArray = new JSONArray(string);
                int length = jSONArray.length();
                boolean z = false;
                for (int i = 0; i < length; i++) {
                    JSONObject optJSONObject = jSONArray.optJSONObject(i);
                    if (optJSONObject != null && optJSONObject.has("id")) {
                        optJSONObject.put("id", "_removed_");
                        z = true;
                    }
                }
                if (z) {
                    parameters.putString("fb_content", jSONArray.toString());
                }
            } catch (JSONException unused) {
            }
        } catch (Throwable th) {
            com.facebook.internal.instrument.crashshield.a.a(th, this);
        }
    }
}
