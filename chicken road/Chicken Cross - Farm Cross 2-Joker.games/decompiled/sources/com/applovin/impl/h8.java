package com.applovin.impl;

import android.net.Uri;
import android.webkit.MimeTypeMap;
import com.applovin.impl.sdk.utils.CollectionUtils;
import com.applovin.impl.sdk.utils.JsonUtils;
import com.applovin.impl.sdk.utils.StringUtils;
import io.ktor.sse.ServerSentEventKt;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.TimeUnit;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;
import org.json.JSONArray;
import org.json.JSONObject;

/* loaded from: classes5.dex */
public class h8 implements v4 {

    /* renamed from: a, reason: collision with root package name */
    private List f4233a;
    private List b;
    private int c;
    private Uri d;
    private final Set e;
    private a8 f;
    private final Map g;

    private h8() {
        this.f4233a = Collections.emptyList();
        this.b = Collections.emptyList();
        this.e = new HashSet();
        this.g = new HashMap();
    }

    public static h8 a(t8 t8Var, h8 h8Var, y7 y7Var, com.applovin.impl.sdk.l lVar) {
        t8 c;
        a8 a2;
        List a3;
        t8 c2;
        List a4;
        t8 c3;
        int a5;
        if (t8Var == null) {
            throw new IllegalArgumentException("No node specified.");
        }
        if (y7Var == null) {
            throw new IllegalArgumentException("No context specified.");
        }
        if (lVar == null) {
            throw new IllegalArgumentException("No sdk specified.");
        }
        if (h8Var == null) {
            try {
                h8Var = new h8(y7Var);
            } catch (Throwable th) {
                lVar.Q();
                if (com.applovin.impl.sdk.p.a()) {
                    lVar.Q().a("VastVideoCreative", "Error occurred while initializing", th);
                }
                lVar.E().a("VastVideoCreative", th);
                return null;
            }
        }
        if (h8Var.c == 0 && (c3 = t8Var.c(com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.k.s)) != null && (a5 = a(c3.d(), lVar)) > 0) {
            h8Var.c = a5;
        }
        t8 c4 = t8Var.c(com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.k.t);
        if (c4 != null && (a4 = a(c4, lVar)) != null && a4.size() > 0) {
            List list = h8Var.f4233a;
            if (list != null) {
                a4.addAll(list);
            }
            h8Var.f4233a = a4;
        }
        t8 c5 = t8Var.c(com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.k.x);
        if (c5 != null) {
            if (h8Var.d == null && (c2 = c5.c(com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.k.y)) != null) {
                String d = c2.d();
                if (StringUtils.isValidString(d)) {
                    h8Var.d = Uri.parse(d);
                }
            }
            g8.a(c5.a(com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.k.z), h8Var.e, y7Var, lVar);
        }
        t8 c6 = t8Var.c(com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.k.B);
        if (c6 != null && (a2 = a8.a((c = c6.c(com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.k.C)), lVar)) != null) {
            t8 c7 = c.c(com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.k.G);
            if (c7 != null && (a3 = c7.a(com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.k.I)) != null) {
                g8.a(a3, a2.f4109a, y7Var, lVar);
            }
            List a6 = c.a(com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.k.J);
            if (a6 != null) {
                g8.a(a6, a2.b, y7Var, lVar);
            }
            h8Var.f = a2;
        }
        g8.a(t8Var, h8Var.g, y7Var, lVar);
        return h8Var;
    }

    public Set b() {
        return this.e;
    }

    public Uri c() {
        return this.d;
    }

    public int d() {
        return this.c;
    }

    public Map e() {
        return this.g;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof h8)) {
            return false;
        }
        h8 h8Var = (h8) obj;
        if (this.c != h8Var.c) {
            return false;
        }
        List list = this.f4233a;
        if (list == null ? h8Var.f4233a != null : !list.equals(h8Var.f4233a)) {
            return false;
        }
        Uri uri = this.d;
        if (uri == null ? h8Var.d != null : !uri.equals(h8Var.d)) {
            return false;
        }
        Set set = this.e;
        if (set == null ? h8Var.e != null : !set.equals(h8Var.e)) {
            return false;
        }
        Map map = this.g;
        Map map2 = h8Var.g;
        return map != null ? map.equals(map2) : map2 == null;
    }

    public a8 f() {
        return this.f;
    }

    public List g() {
        return this.f4233a;
    }

    public int hashCode() {
        List list = this.f4233a;
        int hashCode = (((list != null ? list.hashCode() : 0) * 31) + this.c) * 31;
        Uri uri = this.d;
        int hashCode2 = (hashCode + (uri != null ? uri.hashCode() : 0)) * 31;
        Set set = this.e;
        int hashCode3 = (hashCode2 + (set != null ? set.hashCode() : 0)) * 31;
        Map map = this.g;
        return hashCode3 + (map != null ? map.hashCode() : 0);
    }

    public String toString() {
        return "VastVideoCreative{videoFiles=" + this.f4233a + ", durationSeconds=" + this.c + ", destinationUri=" + this.d + ", clickTrackers=" + this.e + ", eventTrackers=" + this.g + ", industryIcon=" + this.f + AbstractJsonLexerKt.END_OBJ;
    }

    private h8(y7 y7Var) {
        this.f4233a = Collections.emptyList();
        this.b = Collections.emptyList();
        this.e = new HashSet();
        this.g = new HashMap();
        this.b = y7Var.f();
    }

    private static int a(String str, com.applovin.impl.sdk.l lVar) {
        try {
            if (CollectionUtils.explode(str, ServerSentEventKt.COLON).size() == 3) {
                return (int) (TimeUnit.HOURS.toSeconds(StringUtils.parseInt(r1.get(0))) + TimeUnit.MINUTES.toSeconds(StringUtils.parseInt(r1.get(1))) + StringUtils.parseInt(r1.get(2)));
            }
        } catch (Throwable unused) {
            lVar.Q();
            if (com.applovin.impl.sdk.p.a()) {
                lVar.Q().b("VastVideoCreative", "Unable to parse duration from \"" + str + "\"");
            }
        }
        return 0;
    }

    private static List a(t8 t8Var, com.applovin.impl.sdk.l lVar) {
        List a2 = t8Var.a(com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.k.u);
        ArrayList arrayList = new ArrayList(a2.size());
        List<String> explode = CollectionUtils.explode((String) lVar.a(c5.c5));
        List<String> explode2 = CollectionUtils.explode((String) lVar.a(c5.b5));
        Iterator it = a2.iterator();
        while (it.hasNext()) {
            i8 a3 = i8.a((t8) it.next(), lVar);
            if (a3 != null) {
                try {
                    String c = a3.c();
                    if (StringUtils.isValidString(c) && !explode.contains(c)) {
                        arrayList.add(a3);
                    } else {
                        if (((Boolean) lVar.a(c5.d5)).booleanValue()) {
                            String fileExtensionFromUrl = MimeTypeMap.getFileExtensionFromUrl(a3.e().toString());
                            if (StringUtils.isValidString(fileExtensionFromUrl) && !explode2.contains(fileExtensionFromUrl)) {
                                arrayList.add(a3);
                            }
                        }
                        lVar.Q();
                        if (com.applovin.impl.sdk.p.a()) {
                            lVar.Q().k("VastVideoCreative", "Video file not supported: " + a3);
                        }
                    }
                } catch (Throwable th) {
                    lVar.Q();
                    if (com.applovin.impl.sdk.p.a()) {
                        lVar.Q().a("VastVideoCreative", "Failed to validate video file: " + a3, th);
                    }
                }
            }
        }
        return arrayList;
    }

    public i8 a(long j) {
        List list = this.f4233a;
        i8 i8Var = null;
        if (list == null || list.size() == 0) {
            return null;
        }
        List<i8> arrayList = new ArrayList(3);
        for (String str : this.b) {
            for (i8 i8Var2 : this.f4233a) {
                String c = i8Var2.c();
                if (StringUtils.isValidString(c) && str.equalsIgnoreCase(c)) {
                    arrayList.add(i8Var2);
                }
            }
            if (!arrayList.isEmpty()) {
                break;
            }
        }
        if (arrayList.isEmpty()) {
            arrayList = this.f4233a;
        }
        Collections.sort(arrayList, new Comparator() { // from class: com.applovin.impl.h8$$ExternalSyntheticLambda0
            @Override // java.util.Comparator
            public final int compare(Object obj, Object obj2) {
                int a2;
                a2 = h8.a((i8) obj, (i8) obj2);
                return a2;
            }
        });
        for (i8 i8Var3 : arrayList) {
            if (i8Var3.b() > j) {
                break;
            }
            i8Var = i8Var3;
        }
        return i8Var != null ? i8Var : (i8) arrayList.get(0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ int a(i8 i8Var, i8 i8Var2) {
        return Long.compare(i8Var.b(), i8Var2.b());
    }

    public static h8 a(JSONObject jSONObject, com.applovin.impl.sdk.l lVar) {
        if (jSONObject == null) {
            return null;
        }
        h8 h8Var = new h8();
        JSONArray jSONArray = JsonUtils.getJSONArray(jSONObject, "video_files", new JSONArray());
        h8Var.f4233a = new ArrayList();
        for (int i = 0; i < jSONArray.length(); i++) {
            i8 a2 = i8.a(JsonUtils.getJSONObject(jSONArray, i, (JSONObject) null), lVar);
            if (a2 != null) {
                h8Var.f4233a.add(a2);
            }
        }
        h8Var.b = JsonUtils.getStringList(jSONObject, "preferred_video_file_types", Collections.emptyList());
        h8Var.c = JsonUtils.getInt(jSONObject, "duration_seconds", 0);
        String string = JsonUtils.getString(jSONObject, "destination_uri", null);
        h8Var.d = StringUtils.isValidString(string) ? Uri.parse(string) : null;
        JSONArray jSONArray2 = JsonUtils.getJSONArray(jSONObject, "click_trackers", new JSONArray());
        for (int i2 = 0; i2 < jSONArray2.length(); i2++) {
            e8 a3 = e8.a(JsonUtils.getJSONObject(jSONArray2, i2, (JSONObject) null), lVar);
            if (a3 != null) {
                h8Var.e.add(a3);
            }
        }
        h8Var.f = a8.a(JsonUtils.getJSONObject(jSONObject, "industry_icon", (JSONObject) null), lVar);
        JSONObject jSONObject2 = JsonUtils.getJSONObject(jSONObject, "event_trackers", new JSONObject());
        Iterator<String> keys = jSONObject2.keys();
        while (keys.hasNext()) {
            HashSet hashSet = new HashSet();
            String next = keys.next();
            JSONArray jSONArray3 = JsonUtils.getJSONArray(jSONObject2, next, new JSONArray());
            for (int i3 = 0; i3 < jSONArray3.length(); i3++) {
                e8 a4 = e8.a(JsonUtils.getJSONObject(jSONArray3, i3, (JSONObject) null), lVar);
                if (a4 != null) {
                    hashSet.add(a4);
                }
            }
            h8Var.g.put(next, hashSet);
        }
        return h8Var;
    }

    @Override // com.applovin.impl.v4
    public JSONObject a() {
        JSONObject jSONObject = new JSONObject();
        JSONArray jSONArray = new JSONArray();
        List list = this.f4233a;
        if (list != null) {
            Iterator it = list.iterator();
            while (it.hasNext()) {
                jSONArray.put(((i8) it.next()).a());
            }
        }
        JsonUtils.putJsonArray(jSONObject, "video_files", jSONArray);
        JsonUtils.putJsonArray(jSONObject, "preferred_video_file_types", new JSONArray((Collection) this.b));
        JsonUtils.putInt(jSONObject, "duration_seconds", this.c);
        Uri uri = this.d;
        JsonUtils.putString(jSONObject, "destination_uri", uri == null ? null : uri.toString());
        JSONArray jSONArray2 = new JSONArray();
        Iterator it2 = this.e.iterator();
        while (it2.hasNext()) {
            jSONArray2.put(((e8) it2.next()).a());
        }
        JsonUtils.putJsonArray(jSONObject, "click_trackers", jSONArray2);
        a8 a8Var = this.f;
        if (a8Var != null) {
            JsonUtils.putJSONObject(jSONObject, "industry_icon", a8Var.a());
        }
        JSONObject jSONObject2 = new JSONObject();
        for (String str : this.g.keySet()) {
            Set set = (Set) this.g.get(str);
            if (set != null) {
                JSONArray jSONArray3 = new JSONArray();
                Iterator it3 = set.iterator();
                while (it3.hasNext()) {
                    jSONArray3.put(((e8) it3.next()).a());
                }
                JsonUtils.putJsonArray(jSONObject2, str, jSONArray3);
            }
        }
        JsonUtils.putJSONObject(jSONObject, "event_trackers", jSONObject2);
        return jSONObject;
    }
}
