package com.inmobi.media;

import android.content.Context;
import com.inmobi.media.core.config.models.SignalsConfig;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.Lazy;
import kotlin.ResultKt;
import kotlin.Triple;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.PropertyReference1Impl;
import kotlin.jvm.internal.Reflection;
import kotlin.reflect.KProperty;
import kotlin.sequences.SequencesKt;
import kotlin.text.StringsKt;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.sync.Mutex;
import kotlinx.coroutines.sync.MutexKt;
import org.json.JSONArray;
import org.json.JSONObject;

/* renamed from: com.inmobi.media.hi, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C3770hi {
    public static Rh d;
    public static final /* synthetic */ KProperty[] b = {Reflection.property1(new PropertyReference1Impl(C3770hi.class, "cachedJson", "getCachedJson()Lorg/json/JSONObject;", 0)), Reflection.property1(new PropertyReference1Impl(C3770hi.class, "impressionDepth", "getImpressionDepth()Lorg/json/JSONObject;", 0))};

    /* renamed from: a, reason: collision with root package name */
    public static final C3770hi f7146a = new C3770hi();
    public static final List c = CollectionsKt.listOf((Object[]) new String[]{"ban", "int", "rew", "nat"});
    public static final C3584b2 e = new C3584b2(new JSONObject(), new Function0() { // from class: com.inmobi.media.hi$$ExternalSyntheticLambda1
        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            return C3770hi.a();
        }
    }, true, true);
    public static final C3584b2 f = new C3584b2(new JSONObject(), new Function0() { // from class: com.inmobi.media.hi$$ExternalSyntheticLambda2
        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            return C3770hi.g();
        }
    }, true, true);
    public static volatile JSONObject g = new JSONObject();
    public static final Object h = new Object();
    public static final Mutex i = MutexKt.Mutex$default(false, 1, null);
    public static final AtomicBoolean j = new AtomicBoolean(false);

    public static final void a(C3770hi c3770hi) {
        c3770hi.getClass();
        synchronized (h) {
            JSONArray optJSONArray = g.optJSONArray("a_s_dep");
            JSONObject jSONObject = new JSONObject();
            if (optJSONArray != null) {
                jSONObject.put("a_s_dep", optJSONArray);
            }
            g = jSONObject;
            Unit unit = Unit.INSTANCE;
        }
    }

    public static final JSONObject b(C3770hi c3770hi) {
        c3770hi.getClass();
        JSONObject jSONObject = new JSONObject();
        Iterator<String> keys = f7146a.c().keys();
        Intrinsics.checkNotNullExpressionValue(keys, "keys(...)");
        while (keys.hasNext()) {
            String next = keys.next();
            Intrinsics.checkNotNull(next);
            if (StringsKt.startsWith$default(next, "obj_", false, 2, (Object) null) || StringsKt.startsWith$default(next, "auto_", false, 2, (Object) null) || StringsKt.startsWith$default(next, "dir_", false, 2, (Object) null)) {
                jSONObject.put(next, f7146a.c().opt(next));
            }
        }
        return jSONObject;
    }

    public static final Object c(C3770hi c3770hi, Map map, SignalsConfig.PublisherConfig publisherConfig, C3684ei c3684ei) {
        c3770hi.getClass();
        if (!publisherConfig.getObj().getEnabled()) {
            Kc.a((byte) 1, "PubSignals", "Object signals are disabled by InMobi");
            return Unit.INSTANCE;
        }
        int count = publisherConfig.getObj().getCount();
        Triple b2 = AbstractC3797ii.b(map, publisherConfig);
        String str = (String) b2.component1();
        JSONObject jSONObject = (JSONObject) b2.component2();
        String str2 = (String) b2.component3();
        if (jSONObject == null) {
            return Unit.INSTANCE;
        }
        c3770hi.b(str2, "o_i_dep");
        c(str2, "o_s_dep");
        Object a2 = c3770hi.a(AbstractC3797ii.a(c3770hi.c(), str, jSONObject, count), c3684ei);
        return a2 == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? a2 : Unit.INSTANCE;
    }

    public static SignalsConfig.PublisherConfig d() {
        J4 j4 = AbstractC4260z4.f7518a;
        Intrinsics.checkNotNullParameter(SignalsConfig.class, "clazz");
        return ((SignalsConfig) AbstractC4260z4.f7518a.a(SignalsConfig.class)).getPublisher();
    }

    public static final JSONObject g() {
        f7146a.getClass();
        Context context = AbstractC3914mk.f7252a;
        JSONObject jSONObject = null;
        if (context != null) {
            if (d == null) {
                d = new Rh(context, "pub_signals_store");
            }
            Rh rh = d;
            if (rh == null) {
                Intrinsics.throwUninitializedPropertyAccessException("prefDao");
                rh = null;
            }
            String a2 = rh.a("imp_depth");
            if (a2 != null) {
                jSONObject = new JSONObject(a2);
            }
        }
        return jSONObject == null ? new JSONObject() : jSONObject;
    }

    public final LinkedHashMap e() {
        JSONObject c2 = c();
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        Map<String, SignalsConfig.PublisherConfig.KeyData> allowedKeysAnd = d().getObj().getAllowedKeysAnd();
        Map<String, SignalsConfig.PublisherConfig.KeyData> allowedKeys = d().getAuto().getAllowedKeys();
        List<String> list = c;
        SignalsConfig.PublisherConfig d2 = d();
        for (String str : list) {
            AbstractC3797ii.a(AbstractC3797ii.a(AbstractC3797ii.a(linkedHashMap, c2, "obj_", str, AbstractC3797ii.c(allowedKeysAnd)), c2, "auto_", str, AbstractC3797ii.c(allowedKeys)), c2, "dir_", str, d2.getDirect().getAllowedKeys());
        }
        return linkedHashMap;
    }

    public final JSONObject f() {
        JSONObject c2 = c();
        JSONObject jSONObject = new JSONObject();
        Iterator<String> keys = c2.keys();
        Intrinsics.checkNotNullExpressionValue(keys, "keys(...)");
        while (keys.hasNext()) {
            String next = keys.next();
            Intrinsics.checkNotNull(next);
            if (!StringsKt.startsWith$default(next, "obj_", false, 2, (Object) null) && !StringsKt.startsWith$default(next, "auto_", false, 2, (Object) null) && !StringsKt.startsWith$default(next, "dir_", false, 2, (Object) null)) {
                jSONObject.put(next, c2.opt(next));
            }
        }
        for (String str : c) {
            f7146a.getClass();
            if (d().getObj().getEnabled()) {
                Map<String, SignalsConfig.PublisherConfig.KeyData> allowedKeysAnd = d().getObj().getAllowedKeysAnd();
                ArrayList arrayList = new ArrayList(allowedKeysAnd.size());
                Iterator<Map.Entry<String, SignalsConfig.PublisherConfig.KeyData>> it = allowedKeysAnd.entrySet().iterator();
                while (it.hasNext()) {
                    arrayList.add(it.next().getValue().getName());
                }
                AbstractC3797ii.a(jSONObject, c2, str, "obj_", CollectionsKt.toSet(arrayList));
            }
            f7146a.getClass();
            if (d().getAuto().getEnabled()) {
                Map<String, SignalsConfig.PublisherConfig.KeyData> allowedKeys = d().getAuto().getAllowedKeys();
                ArrayList arrayList2 = new ArrayList(allowedKeys.size());
                Iterator<Map.Entry<String, SignalsConfig.PublisherConfig.KeyData>> it2 = allowedKeys.entrySet().iterator();
                while (it2.hasNext()) {
                    arrayList2.add(it2.next().getValue().getName());
                }
                AbstractC3797ii.a(jSONObject, c2, str, "auto_", CollectionsKt.toSet(arrayList2));
            }
            f7146a.getClass();
            if (d().getDirect().getEnabled()) {
                AbstractC3797ii.a(jSONObject, c2, str, "dir_", d().getDirect().getAllowedKeys().keySet());
            }
        }
        Boolean valueOf = Boolean.valueOf(d().getObj().getDepth().getEnabled());
        C3584b2 c3584b2 = f;
        KProperty[] kPropertyArr = b;
        for (Triple triple : CollectionsKt.listOf((Object[]) new Triple[]{new Triple(valueOf, "o_i_dep", (JSONObject) c3584b2.getValue(this, kPropertyArr[1])), new Triple(Boolean.valueOf(d().getDirect().getDepth().getEnabled()), "d_i_dep", (JSONObject) c3584b2.getValue(this, kPropertyArr[1])), new Triple(Boolean.valueOf(d().getAuto().getDepth().getEnabled()), "a_i_dep", (JSONObject) c3584b2.getValue(this, kPropertyArr[1])), new Triple(Boolean.valueOf(d().getObj().getDepth().getSessionEnabled()), "o_s_dep", g), new Triple(Boolean.valueOf(d().getDirect().getDepth().getSessionEnabled()), "d_s_dep", g), new Triple(Boolean.valueOf(d().getAuto().getDepth().getSessionEnabled()), "a_s_dep", g)})) {
            boolean booleanValue = ((Boolean) triple.component1()).booleanValue();
            String str2 = (String) triple.component2();
            JSONObject jSONObject2 = (JSONObject) triple.component3();
            if (booleanValue) {
                JSONArray optJSONArray = jSONObject2.optJSONArray(str2);
                if (optJSONArray == null) {
                    optJSONArray = AbstractC3797ii.a();
                }
                jSONObject.put(str2, optJSONArray);
            }
        }
        String str3 = "Publisher signals JSON: " + jSONObject;
        return jSONObject;
    }

    public static final Object a(C3770hi c3770hi, Map map, SignalsConfig.PublisherConfig publisherConfig, C3684ei c3684ei) {
        c3770hi.getClass();
        if (!publisherConfig.getAuto().getEnabled()) {
            return Unit.INSTANCE;
        }
        int count = publisherConfig.getAuto().getCount();
        Triple a2 = AbstractC3797ii.a(map, publisherConfig);
        String str = (String) a2.component1();
        JSONObject jSONObject = (JSONObject) a2.component2();
        String str2 = (String) a2.component3();
        if (jSONObject == null) {
            return Unit.INSTANCE;
        }
        c3770hi.b(str2, "a_i_dep");
        c(str2, "a_s_dep");
        Object a3 = c3770hi.a(AbstractC3797ii.a(c3770hi.c(), str, jSONObject, count), c3684ei);
        return a3 == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? a3 : Unit.INSTANCE;
    }

    public static final void c(C3770hi c3770hi) {
        c3770hi.getClass();
        try {
            synchronized (h) {
                JSONObject jSONObject = new JSONObject();
                jSONObject.put("d_s_dep", AbstractC3797ii.a());
                jSONObject.put("o_s_dep", AbstractC3797ii.a());
                jSONObject.put("a_s_dep", AbstractC3797ii.a());
                g = jSONObject;
                Unit unit = Unit.INSTANCE;
            }
        } catch (Exception e2) {
            Lazy lazy = Ba.f6473a;
            U9.a(e2);
        }
    }

    public static final JSONObject a() {
        C3770hi c3770hi = f7146a;
        c3770hi.getClass();
        Context context = AbstractC3914mk.f7252a;
        JSONObject jSONObject = null;
        if (context != null) {
            c3770hi.getClass();
            if (d == null) {
                d = new Rh(context, "pub_signals_store");
            }
            Rh rh = d;
            if (rh == null) {
                Intrinsics.throwUninitializedPropertyAccessException("prefDao");
                rh = null;
            }
            String a2 = rh.a("saved_signals");
            if (a2 != null) {
                jSONObject = new JSONObject(a2);
            }
        }
        return jSONObject == null ? new JSONObject() : jSONObject;
    }

    public static void a(Map signals) {
        Intrinsics.checkNotNullParameter(signals, "signals");
        try {
            SignalsConfig.PublisherConfig d2 = d();
            Map map = AbstractC3797ii.f7164a;
            Intrinsics.checkNotNullParameter(d2, "<this>");
            if (!d2.getEnableMCO() && !d2.getEnableAB()) {
                Kc.a((byte) 1, "PubSignals", "Publisher signals are disabled from InMobi");
                return;
            }
            BuildersKt__Builders_commonKt.launch$default(AbstractC3904ma.f, null, null, new C3684ei(signals, d2, null), 3, null);
        } catch (Exception e2) {
            Lazy lazy = Ba.f6473a;
            Ba.a(new C3810j3(e2));
            Kc.a((byte) 1, "PubSignals", "Publisher signals could not be saved due to an Internal Error.");
        }
    }

    public final JSONObject c() {
        return (JSONObject) e.getValue(this, b[0]);
    }

    public static void c(String adFormat, String key) {
        int i2;
        Intrinsics.checkNotNullParameter(adFormat, "adFormat");
        Intrinsics.checkNotNullParameter(key, "key");
        int hashCode = adFormat.hashCode();
        if (hashCode == 97295) {
            if (adFormat.equals("ban")) {
                i2 = 0;
            }
            i2 = -1;
        } else if (hashCode == 104431) {
            if (adFormat.equals("int")) {
                i2 = 1;
            }
            i2 = -1;
        } else if (hashCode != 108833) {
            if (hashCode == 112804 && adFormat.equals("rew")) {
                i2 = 2;
            }
            i2 = -1;
        } else {
            if (adFormat.equals("nat")) {
                i2 = 3;
            }
            i2 = -1;
        }
        if (i2 == -1) {
            return;
        }
        synchronized (h) {
            JSONObject jSONObject = new JSONObject(g.toString());
            JSONArray optJSONArray = jSONObject.optJSONArray(key);
            if (optJSONArray == null) {
                optJSONArray = AbstractC3797ii.a();
            }
            optJSONArray.put(i2, optJSONArray.optInt(i2, 0) + 1);
            jSONObject.put(key, optJSONArray);
            g = jSONObject;
            Unit unit = Unit.INSTANCE;
        }
    }

    public static final Object b(C3770hi c3770hi, Map map, SignalsConfig.PublisherConfig publisherConfig, C3684ei c3684ei) {
        c3770hi.getClass();
        if (!publisherConfig.getDirect().getEnabled()) {
            Kc.a((byte) 1, "PubSignals", "Direct signals are disabled by InMobi");
            return Unit.INSTANCE;
        }
        int count = publisherConfig.getDirect().getCount();
        Triple c2 = AbstractC3797ii.c(map, publisherConfig);
        String str = (String) c2.component1();
        JSONObject jSONObject = (JSONObject) c2.component2();
        String str2 = (String) c2.component3();
        if (jSONObject == null) {
            return Unit.INSTANCE;
        }
        c3770hi.b(str2, "d_i_dep");
        c(str2, "d_s_dep");
        Object a2 = c3770hi.a(AbstractC3797ii.a(c3770hi.c(), str, jSONObject, count), c3684ei);
        return a2 == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? a2 : Unit.INSTANCE;
    }

    public static void b() {
        final String str = "a_i_dep";
        Rh rh = null;
        try {
            Rh rh2 = d;
            if (rh2 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("prefDao");
                rh2 = null;
            }
            String a2 = rh2.a("imp_depth");
            if (a2 != null) {
                JSONObject jSONObject = new JSONObject(a2);
                Iterator<String> keys = jSONObject.keys();
                Intrinsics.checkNotNullExpressionValue(keys, "keys(...)");
                Iterator it = SequencesKt.toList(SequencesKt.filterNot(SequencesKt.asSequence(keys), new Function1() { // from class: com.inmobi.media.hi$$ExternalSyntheticLambda0
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        return Boolean.valueOf(C3770hi.a(str, (String) obj));
                    }
                })).iterator();
                while (it.hasNext()) {
                    jSONObject.remove((String) it.next());
                }
                Rh rh3 = d;
                if (rh3 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("prefDao");
                    rh3 = null;
                }
                String value = jSONObject.toString();
                Intrinsics.checkNotNullExpressionValue(value, "toString(...)");
                rh3.getClass();
                Intrinsics.checkNotNullParameter("imp_depth", "key");
                Intrinsics.checkNotNullParameter(value, "value");
                Db db = rh3.f6829a;
                ConcurrentHashMap concurrentHashMap = Db.b;
                db.a("imp_depth", value, false);
            }
        } catch (Exception unused) {
            Rh rh4 = d;
            if (rh4 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("prefDao");
            } else {
                rh = rh4;
            }
            rh.getClass();
            Intrinsics.checkNotNullParameter("imp_depth", "key");
            rh.f6829a.a("imp_depth");
        }
    }

    public static final boolean a(String str, String str2) {
        return Intrinsics.areEqual(str2, str);
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0064 A[Catch: all -> 0x00ad, TryCatch #0 {all -> 0x00ad, blocks: (B:11:0x0060, B:13:0x0064, B:14:0x006a), top: B:10:0x0060 }] */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0036  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(JSONObject jSONObject, ContinuationImpl continuationImpl) {
        C3713fi c3713fi;
        int i2;
        JSONObject jSONObject2;
        Mutex mutex;
        Rh rh;
        try {
            if (continuationImpl instanceof C3713fi) {
                c3713fi = (C3713fi) continuationImpl;
                int i3 = c3713fi.e;
                if ((i3 & Integer.MIN_VALUE) != 0) {
                    c3713fi.e = i3 - Integer.MIN_VALUE;
                    Object obj = c3713fi.c;
                    Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    i2 = c3713fi.e;
                    if (i2 != 0) {
                        ResultKt.throwOnFailure(obj);
                        Context context = AbstractC3914mk.f7252a;
                        if (context != null) {
                            f7146a.getClass();
                            if (d == null) {
                                d = new Rh(context, "pub_signals_store");
                            }
                            Mutex mutex2 = i;
                            c3713fi.f7108a = jSONObject;
                            c3713fi.b = mutex2;
                            c3713fi.e = 1;
                            if (mutex2.lock(null, c3713fi) == coroutine_suspended) {
                                return coroutine_suspended;
                            }
                            jSONObject2 = jSONObject;
                            mutex = mutex2;
                        }
                        return Unit.INSTANCE;
                    }
                    if (i2 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    mutex = c3713fi.b;
                    jSONObject2 = c3713fi.f7108a;
                    ResultKt.throwOnFailure(obj);
                    rh = d;
                    if (rh == null) {
                        Intrinsics.throwUninitializedPropertyAccessException("prefDao");
                        rh = null;
                    }
                    String value = jSONObject2.toString();
                    Intrinsics.checkNotNullExpressionValue(value, "toString(...)");
                    rh.getClass();
                    Intrinsics.checkNotNullParameter("saved_signals", "key");
                    Intrinsics.checkNotNullParameter(value, "value");
                    rh.f6829a.a("saved_signals", value, true);
                    Unit unit = Unit.INSTANCE;
                    mutex.unlock(null);
                    C3584b2 c3584b2 = e;
                    c3584b2.c = c3584b2.f7022a.invoke();
                    Kc.a((byte) 2, "PubSignals", "Publisher Signals saved successfully.");
                    String str = "Signals saved: " + jSONObject2;
                    return Unit.INSTANCE;
                }
            }
            rh = d;
            if (rh == null) {
            }
            String value2 = jSONObject2.toString();
            Intrinsics.checkNotNullExpressionValue(value2, "toString(...)");
            rh.getClass();
            Intrinsics.checkNotNullParameter("saved_signals", "key");
            Intrinsics.checkNotNullParameter(value2, "value");
            rh.f6829a.a("saved_signals", value2, true);
            Unit unit2 = Unit.INSTANCE;
            mutex.unlock(null);
            C3584b2 c3584b22 = e;
            c3584b22.c = c3584b22.f7022a.invoke();
            Kc.a((byte) 2, "PubSignals", "Publisher Signals saved successfully.");
            String str2 = "Signals saved: " + jSONObject2;
            return Unit.INSTANCE;
        } catch (Throwable th) {
            mutex.unlock(null);
            throw th;
        }
        c3713fi = new C3713fi(this, continuationImpl);
        Object obj2 = c3713fi.c;
        Object coroutine_suspended2 = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i2 = c3713fi.e;
        if (i2 != 0) {
        }
    }

    public final void b(String adFormat, String key) {
        int i2;
        Intrinsics.checkNotNullParameter(adFormat, "adFormat");
        Intrinsics.checkNotNullParameter(key, "key");
        C3584b2 c3584b2 = f;
        c3584b2.c = c3584b2.f7022a.invoke();
        JSONObject jSONObject = (JSONObject) c3584b2.getValue(this, b[1]);
        JSONArray optJSONArray = jSONObject.optJSONArray(key);
        if (optJSONArray == null) {
            optJSONArray = AbstractC3797ii.a();
        }
        int hashCode = adFormat.hashCode();
        if (hashCode == 97295) {
            if (adFormat.equals("ban")) {
                i2 = 0;
            }
            i2 = -1;
        } else if (hashCode == 104431) {
            if (adFormat.equals("int")) {
                i2 = 1;
            }
            i2 = -1;
        } else if (hashCode != 108833) {
            if (hashCode == 112804 && adFormat.equals("rew")) {
                i2 = 2;
            }
            i2 = -1;
        } else {
            if (adFormat.equals("nat")) {
                i2 = 3;
            }
            i2 = -1;
        }
        if (i2 != -1) {
            optJSONArray.put(i2, optJSONArray.optInt(i2, 0) + 1);
            a(jSONObject, key, optJSONArray);
        }
    }

    public static void a(JSONObject jSONObject, String key, JSONArray value) {
        Intrinsics.checkNotNullParameter(jSONObject, "<this>");
        Intrinsics.checkNotNullParameter(key, "key");
        Intrinsics.checkNotNullParameter(value, "value");
        jSONObject.put(key, value);
        Context context = AbstractC3914mk.f7252a;
        if (context != null) {
            f7146a.getClass();
            if (d == null) {
                d = new Rh(context, "pub_signals_store");
            }
            String str = "Saving impression depth array: " + jSONObject;
            Rh rh = d;
            if (rh == null) {
                Intrinsics.throwUninitializedPropertyAccessException("prefDao");
                rh = null;
            }
            String value2 = jSONObject.toString();
            Intrinsics.checkNotNullExpressionValue(value2, "toString(...)");
            rh.getClass();
            Intrinsics.checkNotNullParameter("imp_depth", "key");
            Intrinsics.checkNotNullParameter(value2, "value");
            Db db = rh.f6829a;
            ConcurrentHashMap concurrentHashMap = Db.b;
            db.a("imp_depth", value2, false);
            C3584b2 c3584b2 = f;
            c3584b2.c = c3584b2.f7022a.invoke();
        }
    }
}
