package com.vungle.ads.internal.model;

import com.vungle.ads.AdConfig;
import com.vungle.ads.TpatError;
import com.vungle.ads.internal.protos.Sdk;
import java.io.File;
import java.net.URI;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.regex.Pattern;
import kotlin.Pair;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.TuplesKt;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import kotlin.reflect.KClass;
import kotlin.text.Regex;
import kotlin.text.StringsKt;
import kotlinx.io.files.FileSystemKt;
import kotlinx.serialization.ContextualSerializer;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.encoding.CompositeEncoder;
import kotlinx.serialization.internal.ArrayListSerializer;
import kotlinx.serialization.internal.LinkedHashMapSerializer;
import kotlinx.serialization.internal.LongSerializer;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;
import kotlinx.serialization.internal.StringSerializer;
import kotlinx.serialization.json.JsonElementBuildersKt;
import kotlinx.serialization.json.JsonObject;
import kotlinx.serialization.json.JsonObjectBuilder;

/* loaded from: classes7.dex */
public final class i0 {
    public static final p Companion = new p();

    /* renamed from: a, reason: collision with root package name */
    public final List f11977a;
    public final w2 b;
    public Long c;
    public ConcurrentHashMap d;
    public Map e;
    public boolean f;
    public AdConfig g;
    public com.vungle.ads.internal.util.s h;
    public String i;
    public final LinkedHashMap j;

    public /* synthetic */ i0(int i, List list, w2 w2Var, Long l, ConcurrentHashMap concurrentHashMap, Map map, boolean z, String str) {
        if ((i & 1) == 0) {
            this.f11977a = null;
        } else {
            this.f11977a = list;
        }
        if ((i & 2) == 0) {
            this.b = null;
        } else {
            this.b = w2Var;
        }
        if ((i & 4) == 0) {
            this.c = null;
        } else {
            this.c = l;
        }
        if ((i & 8) == 0) {
            this.d = new ConcurrentHashMap();
        } else {
            this.d = concurrentHashMap;
        }
        if ((i & 16) == 0) {
            this.e = new HashMap();
        } else {
            this.e = map;
        }
        if ((i & 32) == 0) {
            this.f = false;
        } else {
            this.f = z;
        }
        this.g = null;
        this.h = null;
        if ((i & 64) == 0) {
            this.i = null;
        } else {
            this.i = str;
        }
        this.j = new LinkedHashMap();
    }

    public static final void a(i0 self, CompositeEncoder output, PluginGeneratedSerialDescriptor serialDesc) {
        Intrinsics.checkNotNullParameter(self, "self");
        Intrinsics.checkNotNullParameter(output, "output");
        Intrinsics.checkNotNullParameter(serialDesc, "serialDesc");
        if (output.shouldEncodeElementDefault(serialDesc, 0) || self.f11977a != null) {
            output.encodeNullableSerializableElement(serialDesc, 0, new ArrayListSerializer(q.f12003a), self.f11977a);
        }
        if (output.shouldEncodeElementDefault(serialDesc, 1) || self.b != null) {
            output.encodeNullableSerializableElement(serialDesc, 1, v1.f12021a, self.b);
        }
        if (output.shouldEncodeElementDefault(serialDesc, 2) || self.c != null) {
            output.encodeNullableSerializableElement(serialDesc, 2, LongSerializer.INSTANCE, self.c);
        }
        if (output.shouldEncodeElementDefault(serialDesc, 3) || !Intrinsics.areEqual(self.d, new ConcurrentHashMap())) {
            KClass orCreateKotlinClass = Reflection.getOrCreateKotlinClass(ConcurrentHashMap.class);
            StringSerializer stringSerializer = StringSerializer.INSTANCE;
            output.encodeSerializableElement(serialDesc, 3, new ContextualSerializer(orCreateKotlinClass, null, new KSerializer[]{stringSerializer, stringSerializer}), self.d);
        }
        if (output.shouldEncodeElementDefault(serialDesc, 4) || !Intrinsics.areEqual(self.e, new HashMap())) {
            StringSerializer stringSerializer2 = StringSerializer.INSTANCE;
            output.encodeSerializableElement(serialDesc, 4, new LinkedHashMapSerializer(stringSerializer2, stringSerializer2), self.e);
        }
        if (output.shouldEncodeElementDefault(serialDesc, 5) || self.f) {
            output.encodeBooleanElement(serialDesc, 5, self.f);
        }
        if (!output.shouldEncodeElementDefault(serialDesc, 6) && self.i == null) {
            return;
        }
        output.encodeNullableSerializableElement(serialDesc, 6, StringSerializer.INSTANCE, self.i);
    }

    public final boolean A() {
        return Intrinsics.areEqual(G(), "native");
    }

    public final boolean B() {
        Boolean bool;
        i k = k();
        return ((k == null || (bool = k.C) == null) ? false : bool.booleanValue()) && !A();
    }

    public final boolean C() {
        z zVar;
        c0 c0Var;
        Boolean bool;
        i k = k();
        if (k == null || (zVar = k.s) == null || (c0Var = zVar.f12031a) == null || (bool = c0Var.f11958a) == null) {
            return false;
        }
        return bool.booleanValue();
    }

    public final String D() {
        s i = i();
        if (i != null) {
            return i.f12010a;
        }
        return null;
    }

    public final void E() {
        this.c = Long.valueOf(System.currentTimeMillis());
    }

    public final void F() {
        this.f = true;
    }

    public final String G() {
        i k = k();
        if (k != null) {
            return k.t;
        }
        return null;
    }

    public final boolean H() {
        i k = k();
        return (k != null ? Intrinsics.areEqual(k.l(), Boolean.TRUE) : false) && !A();
    }

    public final boolean b() {
        Boolean bool;
        i k = k();
        if (k == null || (bool = k.h) == null) {
            return true;
        }
        return bool.booleanValue();
    }

    public final i c() {
        return k();
    }

    public final int d() {
        f fVar;
        Integer num;
        i k = k();
        if (k == null || (fVar = k.z) == null || (num = fVar.f11966a) == null) {
            return 0;
        }
        return num.intValue();
    }

    public final String e() {
        i k = k();
        if (k != null) {
            return k.w;
        }
        return null;
    }

    public final w2 f() {
        return this.b;
    }

    public final JsonObject g() {
        LinkedHashMap s = s();
        JsonObjectBuilder jsonObjectBuilder = new JsonObjectBuilder();
        for (Map.Entry entry : s.entrySet()) {
            JsonElementBuildersKt.put(jsonObjectBuilder, (String) entry.getKey(), (String) entry.getValue());
        }
        return jsonObjectBuilder.build();
    }

    public final String h() {
        i k = k();
        if (k != null) {
            return k.f11976a;
        }
        return null;
    }

    public final s i() {
        List list = this.f11977a;
        if (list == null || list.isEmpty()) {
            return null;
        }
        return (s) list.get(0);
    }

    public final AdConfig j() {
        return this.g;
    }

    public final i k() {
        s i = i();
        if (i != null) {
            return i.b;
        }
        return null;
    }

    public final String l() {
        i k = k();
        if (k != null) {
            return k.c;
        }
        return null;
    }

    public final l m() {
        s i = i();
        if (i != null) {
            return i.c;
        }
        return null;
    }

    public final String n() {
        String str;
        i k = k();
        return (k == null || (str = k.v) == null) ? "unknown" : str;
    }

    public final String o() {
        v vVar;
        Map map;
        i k = k();
        if (k == null || (vVar = k.u) == null || (map = vVar.f12019a) == null) {
            return null;
        }
        return (String) map.get("OBSERVED_EXPERIMENTS");
    }

    public final String p() {
        return this.i;
    }

    public final com.vungle.ads.internal.util.s q() {
        return this.h;
    }

    public final List r() {
        l lVar;
        s i = i();
        if (i == null || (lVar = i.c) == null) {
            return null;
        }
        return lVar.c;
    }

    public final LinkedHashMap s() {
        v vVar;
        Map map;
        v vVar2;
        Map map2;
        i k = k();
        if ((k != null ? k.u : null) == null) {
            throw new IllegalArgumentException("Advertisement does not have MRAID Arguments!".toString());
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        i k2 = k();
        if (k2 != null && (vVar2 = k2.u) != null && (map2 = vVar2.f12019a) != null) {
            linkedHashMap.putAll(map2);
        }
        i k3 = k();
        if (k3 != null && (vVar = k3.u) != null && (map = vVar.b) != null) {
            for (Map.Entry entry : map.entrySet()) {
                String str = ((o) entry.getValue()).f11997a;
                if (str != null) {
                    linkedHashMap.put(entry.getKey(), str);
                }
            }
        }
        if (!this.d.isEmpty()) {
            linkedHashMap.putAll(this.d);
        }
        if (!this.e.isEmpty()) {
            linkedHashMap.putAll(this.e);
        }
        return linkedHashMap;
    }

    public final String t() {
        i k = k();
        if (k != null) {
            return k.i;
        }
        return null;
    }

    public final String u() {
        i k = k();
        if (k != null) {
            return k.o;
        }
        return null;
    }

    public final f0 v() {
        i k = k();
        if (k != null) {
            return k.A;
        }
        return null;
    }

    public final List w() {
        l lVar;
        s i = i();
        if (i == null || (lVar = i.c) == null) {
            return null;
        }
        return lVar.b;
    }

    public final boolean x() {
        i k = k();
        if (k == null) {
            return false;
        }
        Long l = this.c;
        if (k.e != null && l != null) {
            if ((System.currentTimeMillis() - l.longValue()) / 1000 <= (k.e != null ? Long.valueOf(r0.intValue()) : null).longValue()) {
                return false;
            }
        } else {
            if (k.d == null) {
                return false;
            }
            if (System.currentTimeMillis() / 1000 <= (k.d != null ? Long.valueOf(r0.intValue()) : null).longValue()) {
                return false;
            }
        }
        return true;
    }

    public final boolean y() {
        v j;
        Map b;
        String str;
        i k = k();
        return (k == null || (j = k.j()) == null || (b = j.b()) == null || (str = (String) b.get("AD_PODDING")) == null || !StringsKt.equals(str, "true", true)) ? false : true;
    }

    public final boolean z() {
        Boolean bool;
        i k = k();
        if (k == null || (bool = k.g) == null) {
            return false;
        }
        return bool.booleanValue();
    }

    public final boolean b(String failingUrl) {
        v j;
        Map a2;
        Intrinsics.checkNotNullParameter(failingUrl, "failingUrl");
        if (!A()) {
            i k = k();
            if (Intrinsics.areEqual(k != null ? k.m() : null, failingUrl)) {
                return true;
            }
        }
        i k2 = k();
        if (k2 == null || (j = k2.j()) == null || (a2 = j.a()) == null) {
            return false;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (Map.Entry entry : a2.entrySet()) {
            if (Intrinsics.areEqual(((o) entry.getValue()).c(), failingUrl)) {
                linkedHashMap.put(entry.getKey(), entry.getValue());
            }
        }
        return !linkedHashMap.isEmpty();
    }

    public final int a() {
        f fVar;
        Integer num;
        i k = k();
        if (k == null || (fVar = k.z) == null || (num = fVar.b) == null) {
            return 0;
        }
        return num.intValue();
    }

    public final void a(AdConfig adConfig) {
        this.g = adConfig;
    }

    public final void a(com.vungle.ads.internal.util.s sVar) {
        this.h = sVar;
    }

    public final b a(String remoteUrl) {
        Intrinsics.checkNotNullParameter(remoteUrl, "remoteUrl");
        return (b) this.j.get(remoteUrl);
    }

    /* JADX WARN: Removed duplicated region for block: B:25:0x00a7  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0106  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x01b1  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final ArrayList a(File dir) {
        Pair pair;
        i k;
        v j;
        Map a2;
        Pair pair2;
        i k2;
        String m;
        Object m8079constructorimpl;
        File parentFile;
        Intrinsics.checkNotNullParameter(dir, "dir");
        ArrayList arrayList = new ArrayList();
        int i = 0;
        if (!A() && (k2 = k()) != null && (m = k2.m()) != null) {
            String str = com.vungle.ads.internal.util.n.a(m) ? m : null;
            if (str != null) {
                try {
                    Result.Companion companion = Result.INSTANCE;
                    String path = new URI(str).getPath();
                    Intrinsics.checkNotNullExpressionValue(path, "URI(url).path");
                    List split$default = StringsKt.split$default((CharSequence) StringsKt.trim(path, FileSystemKt.UnixPathSeparator), new char[]{FileSystemKt.UnixPathSeparator}, false, 0, 6, (Object) null);
                    m8079constructorimpl = Result.m8079constructorimpl(split$default.size() >= 2 ? CollectionsKt.joinToString$default(CollectionsKt.takeLast(split$default, 2), "_", null, null, 0, null, null, 62, null) : "index.html");
                } catch (Throwable th) {
                    Result.Companion companion2 = Result.INSTANCE;
                    m8079constructorimpl = Result.m8079constructorimpl(ResultKt.createFailure(th));
                }
                if (Result.m8085isFailureimpl(m8079constructorimpl)) {
                    m8079constructorimpl = null;
                }
                String str2 = (String) m8079constructorimpl;
                if (str2 != null && (parentFile = dir.getParentFile()) != null) {
                    pair = new Pair(str, new File(parentFile, str2));
                    if (pair != null) {
                        String str3 = (String) pair.component1();
                        File file = (File) pair.component2();
                        this.i = file.getAbsolutePath();
                        if (!file.exists()) {
                            boolean z = com.vungle.ads.internal.util.u.f12190a;
                            com.vungle.ads.internal.util.t.a("AdPayload", "No cacheable index file found, creating new one: " + file);
                            String absolutePath = file.getAbsolutePath();
                            Intrinsics.checkNotNullExpressionValue(absolutePath, "indexFile.absolutePath");
                            arrayList.add(new b(str3, absolutePath));
                        }
                    }
                    k = k();
                    if (k != null && (j = k.j()) != null && (a2 = j.a()) != null) {
                        for (Map.Entry entry : a2.entrySet()) {
                            String str4 = (String) entry.getKey();
                            o oVar = (o) entry.getValue();
                            String c = oVar.c();
                            if (c != null && com.vungle.ads.internal.util.n.a(c)) {
                                String filePath = new File(dir, com.vungle.ads.internal.util.n.a(c, oVar.b())).getAbsolutePath();
                                Integer a3 = oVar.a();
                                if (!A() && b()) {
                                    if (B()) {
                                        pair2 = TuplesKt.to(Boolean.TRUE, Integer.valueOf(Math.max(i, a3 != null ? a3.intValue() : i)));
                                    } else {
                                        pair2 = TuplesKt.to(Boolean.FALSE, null);
                                    }
                                } else {
                                    pair2 = TuplesKt.to(Boolean.TRUE, null);
                                }
                                boolean booleanValue = ((Boolean) pair2.component1()).booleanValue();
                                Integer num = (Integer) pair2.component2();
                                Intrinsics.checkNotNullExpressionValue(filePath, "filePath");
                                b bVar = new b(str4, c, filePath, booleanValue, num);
                                String b = oVar.b();
                                if (b != null) {
                                    bVar.a(b);
                                }
                                arrayList.add(bVar);
                                if (booleanValue && num != null) {
                                    this.j.put(c, bVar);
                                }
                                i = 0;
                            }
                        }
                    }
                    if (arrayList.size() > 1) {
                        CollectionsKt.sortWith(arrayList, new h0());
                    }
                    return arrayList;
                }
            }
        }
        pair = null;
        if (pair != null) {
        }
        k = k();
        if (k != null) {
            while (r0.hasNext()) {
            }
        }
        if (arrayList.size() > 1) {
        }
        return arrayList;
    }

    public final List b(String event, String str, String str2) {
        ArrayList arrayList;
        Map k;
        Map k2;
        Intrinsics.checkNotNullParameter(event, "event");
        i k3 = k();
        if (k3 != null && (k2 = k3.k()) != null && !k2.containsKey(event)) {
            new TpatError(Sdk.SDKError.Reason.INVALID_TPAT_KEY, com.iab.omid.library.vungle.d.a("Arbitrary tpat key: ", event)).setLogEntry$vungle_ads_release(this.h).logErrorNoReturnValue$vungle_ads_release();
            return null;
        }
        i k4 = k();
        List list = (k4 == null || (k = k4.k()) == null) ? null : (List) k.get(event);
        if (list == null || list.isEmpty()) {
            new TpatError(Sdk.SDKError.Reason.EMPTY_TPAT_ERROR, com.iab.omid.library.vungle.d.a("Empty tpat key: ", event)).setLogEntry$vungle_ads_release(this.h).logErrorNoReturnValue$vungle_ads_release();
            return null;
        }
        switch (event.hashCode()) {
            case -2125915830:
                if (!event.equals("checkpoint.0")) {
                    return list;
                }
                arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(list, 10));
                Iterator it = list.iterator();
                while (it.hasNext()) {
                    arrayList.add(a(a(a((String) it.next(), "{{{remote_play}}}", String.valueOf(!this.f)), "{{{carrier}}}", str), "{{{vol}}}", str2));
                }
                break;
            case -747709511:
                if (!event.equals("video.length")) {
                    return list;
                }
                arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(list, 10));
                Iterator it2 = list.iterator();
                while (it2.hasNext()) {
                    arrayList.add(a((String) it2.next(), "{{{vlen}}}", str));
                }
                break;
            case -132489083:
                if (!event.equals("ad.loadDuration")) {
                    return list;
                }
                arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(list, 10));
                Iterator it3 = list.iterator();
                while (it3.hasNext()) {
                    arrayList.add(a((String) it3.next(), "{{{time_dl}}}", str));
                }
                break;
            case 1516630125:
                if (!event.equals("ad.close")) {
                    return list;
                }
                arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(list, 10));
                Iterator it4 = list.iterator();
                while (it4.hasNext()) {
                    arrayList.add(a(a((String) it4.next(), "{{{dur}}}", str), "{{{vol}}}", str2));
                }
                break;
            case 1940309120:
                if (!event.equals("deeplink.click")) {
                    return list;
                }
                arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(list, 10));
                Iterator it5 = list.iterator();
                while (it5.hasNext()) {
                    arrayList.add(a((String) it5.next(), "{{{is_success}}}", str));
                }
                break;
            default:
                return list;
        }
        return arrayList;
    }

    public static /* synthetic */ List a(i0 i0Var, String str, String str2, int i) {
        if ((i & 2) != 0) {
            str2 = null;
        }
        return i0Var.b(str, str2, null);
    }

    public final void a(String title, String body, String keepWatching, String close) {
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(body, "body");
        Intrinsics.checkNotNullParameter(keepWatching, "keepWatching");
        Intrinsics.checkNotNullParameter(close, "close");
        if (title.length() > 0) {
            this.e.put("INCENTIVIZED_TITLE_TEXT", title);
        }
        if (body.length() > 0) {
            this.e.put("INCENTIVIZED_BODY_TEXT", body);
        }
        if (keepWatching.length() > 0) {
            this.e.put("INCENTIVIZED_CONTINUE_TEXT", keepWatching);
        }
        if (close.length() > 0) {
            this.e.put("INCENTIVIZED_CLOSE_TEXT", close);
        }
    }

    public final int a(Boolean bool) {
        Integer g;
        Integer h;
        if (Intrinsics.areEqual(bool, Boolean.TRUE)) {
            i k = k();
            if (k == null || (h = k.h()) == null) {
                return 0;
            }
            return h.intValue() * 1000;
        }
        i k2 = k();
        if (k2 == null || (g = k2.g()) == null) {
            return 0;
        }
        return g.intValue() * 1000;
    }

    public static String a(String str, String str2, String str3) {
        if (str3 == null) {
            str3 = "";
        }
        String quote = Pattern.quote(str2);
        Intrinsics.checkNotNullExpressionValue(quote, "quote(oldValue)");
        return new Regex(quote).replace(str, new g0(str3));
    }

    public final synchronized void a(File localFile, String adIdentifier) {
        Intrinsics.checkNotNullParameter(adIdentifier, "adIdentifier");
        Intrinsics.checkNotNullParameter(localFile, "localFile");
        if (localFile.exists()) {
            this.d.put(adIdentifier, com.iab.omid.library.vungle.internal.l.a("file://").append(localFile.getAbsolutePath()).toString());
        }
    }
}
