package com.facebook.appevents;

import android.os.Bundle;
import androidx.annotation.RestrictTo;
import com.facebook.C0728q;
import com.facebook.appevents.eventdeactivation.a;
import com.facebook.internal.u;
import java.io.ObjectStreamException;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.UUID;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.collections.MapsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.jvm.internal.StringCompanionObject;
import kotlin.jvm.internal.TypeIntrinsics;
import kotlin.text.Regex;
import org.json.JSONException;
import org.json.JSONObject;

@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
/* renamed from: com.facebook.appevents.d, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C0692d implements Serializable {
    public static final a Companion = new a();
    public static final HashSet<String> f = new HashSet<>();
    private static final long serialVersionUID = 1;
    public final JSONObject a;
    public final JSONObject b;
    public final boolean c;
    public final boolean d;
    public final String e;

    @SourceDebugExtension({"SMAP\nAppEvent.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AppEvent.kt\ncom/facebook/appevents/AppEvent$Companion\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,236:1\n1#2:237\n*E\n"})
    /* renamed from: com.facebook.appevents.d$a */
    public static final class a {
        public static void a(String identifier) {
            boolean contains;
            Intrinsics.checkNotNullParameter(identifier, "identifier");
            if (identifier.length() == 0 || identifier.length() > 40) {
                StringCompanionObject stringCompanionObject = StringCompanionObject.INSTANCE;
                String format = String.format(Locale.ROOT, "Identifier '%s' must be less than %d characters", Arrays.copyOf(new Object[]{identifier, 40}, 2));
                Intrinsics.checkNotNullExpressionValue(format, "format(locale, format, *args)");
                throw new C0728q(format);
            }
            HashSet<String> hashSet = C0692d.f;
            synchronized (hashSet) {
                contains = hashSet.contains(identifier);
                Unit unit = Unit.INSTANCE;
            }
            if (contains) {
                return;
            }
            if (!new Regex("^[0-9a-zA-Z_]+[0-9a-zA-Z _-]*$").matches(identifier)) {
                StringCompanionObject stringCompanionObject2 = StringCompanionObject.INSTANCE;
                throw new C0728q(androidx.credentials.provider.p.a(new Object[]{identifier}, 1, "Skipping event named '%s' due to illegal name - must be under 40 chars and alphanumeric, _, - or space, and not start with a space or hyphen.", "format(format, *args)"));
            }
            synchronized (hashSet) {
                hashSet.add(identifier);
            }
        }
    }

    /* renamed from: com.facebook.appevents.d$b */
    public static final class b implements Serializable {
        public static final a Companion = new a();
        private static final long serialVersionUID = 20160803001L;
        public final String a;
        public final String b;
        public final boolean c;
        public final boolean d;

        /* renamed from: com.facebook.appevents.d$b$a */
        public static final class a {
        }

        public b(String jsonString, String operationalJsonString, boolean z, boolean z2) {
            Intrinsics.checkNotNullParameter(jsonString, "jsonString");
            Intrinsics.checkNotNullParameter(operationalJsonString, "operationalJsonString");
            this.a = jsonString;
            this.b = operationalJsonString;
            this.c = z;
            this.d = z2;
        }

        private final Object readResolve() throws JSONException, ObjectStreamException {
            return new C0692d(this.a, this.b, this.c, this.d);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:18:0x0103, code lost:
    
        if (r11 == null) goto L58;
     */
    /* JADX WARN: Removed duplicated region for block: B:165:0x0309  */
    /* JADX WARN: Removed duplicated region for block: B:168:0x0318  */
    /* JADX WARN: Removed duplicated region for block: B:171:0x0321  */
    /* JADX WARN: Removed duplicated region for block: B:174:0x0327  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x0125  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x012c  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x00b6  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public C0692d(String contextName, String eventName, Double d, Bundle bundle, boolean z, boolean z2, UUID uuid, A a2) throws JSONException, C0728q {
        JSONObject jSONObject;
        String str;
        Intrinsics.checkNotNullParameter(contextName, "contextName");
        Intrinsics.checkNotNullParameter(eventName, "eventName");
        this.c = z;
        this.d = z2;
        this.e = eventName;
        String str2 = null;
        if (a2 != null) {
            try {
                LinkedHashMap linkedHashMap = a2.a;
                LinkedHashMap linkedHashMap2 = new LinkedHashMap(MapsKt.mapCapacity(linkedHashMap.size()));
                for (Object obj : linkedHashMap.entrySet()) {
                    ((B) ((Map.Entry) obj).getKey()).getClass();
                    linkedHashMap2.put("iap_parameters", ((Map.Entry) obj).getValue());
                }
                jSONObject = new JSONObject(MapsKt.toMap(linkedHashMap2));
            } catch (Exception unused) {
                jSONObject = null;
            }
            if (jSONObject == null) {
                jSONObject = new JSONObject();
            }
        } else {
            jSONObject = new JSONObject();
        }
        this.b = jSONObject;
        Companion.getClass();
        a.a(eventName);
        JSONObject jSONObject2 = new JSONObject();
        com.facebook.appevents.restrictivedatafilter.a aVar = com.facebook.appevents.restrictivedatafilter.a.a;
        if (!com.facebook.internal.instrument.crashshield.a.b(com.facebook.appevents.restrictivedatafilter.a.class)) {
            try {
                Intrinsics.checkNotNullParameter(eventName, "eventName");
            } catch (Throwable th) {
                com.facebook.internal.instrument.crashshield.a.a(th, com.facebook.appevents.restrictivedatafilter.a.class);
            }
            if (com.facebook.appevents.restrictivedatafilter.a.b) {
                com.facebook.appevents.restrictivedatafilter.a aVar2 = com.facebook.appevents.restrictivedatafilter.a.a;
                aVar2.getClass();
                boolean z3 = false;
                if (!com.facebook.internal.instrument.crashshield.a.b(aVar2)) {
                    try {
                        z3 = com.facebook.appevents.restrictivedatafilter.a.d.contains(eventName);
                    } catch (Throwable th2) {
                        com.facebook.internal.instrument.crashshield.a.a(th2, aVar2);
                    }
                }
                if (z3) {
                    str = "_removed_";
                    if (Intrinsics.areEqual(str, eventName)) {
                        com.facebook.appevents.integrity.f fVar = com.facebook.appevents.integrity.f.a;
                        if (!com.facebook.internal.instrument.crashshield.a.b(com.facebook.appevents.integrity.f.class)) {
                            try {
                                Intrinsics.checkNotNullParameter(eventName, "eventName");
                                if (com.facebook.appevents.integrity.f.b) {
                                    com.facebook.appevents.integrity.f fVar2 = com.facebook.appevents.integrity.f.a;
                                    fVar2.getClass();
                                    if (!com.facebook.internal.instrument.crashshield.a.b(fVar2)) {
                                        try {
                                            Iterator it = com.facebook.appevents.integrity.f.c.keySet().iterator();
                                            while (true) {
                                                if (!it.hasNext()) {
                                                    break;
                                                }
                                                String str3 = (String) it.next();
                                                HashSet hashSet = (HashSet) com.facebook.appevents.integrity.f.c.get(str3);
                                                if (hashSet != null && hashSet.contains(eventName)) {
                                                    str2 = str3;
                                                    break;
                                                }
                                            }
                                        } catch (Throwable th3) {
                                            com.facebook.internal.instrument.crashshield.a.a(th3, fVar2);
                                        }
                                    }
                                }
                            } catch (Throwable th4) {
                                com.facebook.internal.instrument.crashshield.a.a(th4, com.facebook.appevents.integrity.f.class);
                            }
                            str = eventName;
                        }
                        eventName = str2;
                        str = eventName;
                    }
                    jSONObject2.put("_eventName", str);
                    jSONObject2.put("_logTime", System.currentTimeMillis() / 1000);
                    jSONObject2.put("_ui", contextName);
                    if (uuid != null) {
                        jSONObject2.put("_session_id", uuid);
                    }
                    if (bundle != null) {
                        String eventName2 = this.e;
                        HashMap parameters = new HashMap();
                        for (String key : bundle.keySet()) {
                            a aVar3 = Companion;
                            Intrinsics.checkNotNullExpressionValue(key, "key");
                            aVar3.getClass();
                            a.a(key);
                            Object obj2 = bundle.get(key);
                            if (!(obj2 instanceof String) && !(obj2 instanceof Number)) {
                                StringCompanionObject stringCompanionObject = StringCompanionObject.INSTANCE;
                                throw new C0728q(androidx.credentials.provider.p.a(new Object[]{obj2, key}, 2, "Parameter value '%s' for key '%s' should be a string or a numeric type.", "format(format, *args)"));
                            }
                            parameters.put(key, obj2.toString());
                        }
                        com.facebook.appevents.integrity.c cVar = com.facebook.appevents.integrity.c.a;
                        if (!com.facebook.internal.instrument.crashshield.a.b(com.facebook.appevents.integrity.c.class)) {
                            try {
                                Intrinsics.checkNotNullParameter(parameters, "parameters");
                                if (com.facebook.appevents.integrity.c.b && !parameters.isEmpty()) {
                                    try {
                                        List<String> list = CollectionsKt.toList(parameters.keySet());
                                        JSONObject jSONObject3 = new JSONObject();
                                        for (String str4 : list) {
                                            Object obj3 = parameters.get(str4);
                                            if (obj3 == null) {
                                                throw new IllegalStateException("Required value was null.");
                                            }
                                            String str5 = (String) obj3;
                                            com.facebook.appevents.integrity.c cVar2 = com.facebook.appevents.integrity.c.a;
                                            if (!cVar2.a(str4) && !cVar2.a(str5)) {
                                            }
                                            parameters.remove(str4);
                                            if (!com.facebook.appevents.integrity.c.c) {
                                                str5 = "";
                                            }
                                            jSONObject3.put(str4, str5);
                                        }
                                        if (jSONObject3.length() != 0) {
                                            String jSONObject4 = jSONObject3.toString();
                                            Intrinsics.checkNotNullExpressionValue(jSONObject4, "restrictiveParamJson.toString()");
                                            parameters.put("_onDeviceParams", jSONObject4);
                                        }
                                    } catch (Exception unused2) {
                                    }
                                }
                            } catch (Throwable th5) {
                                com.facebook.internal.instrument.crashshield.a.a(th5, com.facebook.appevents.integrity.c.class);
                            }
                        }
                        Map parameters2 = TypeIntrinsics.asMutableMap(parameters);
                        com.facebook.appevents.restrictivedatafilter.a aVar4 = com.facebook.appevents.restrictivedatafilter.a.a;
                        if (!com.facebook.internal.instrument.crashshield.a.b(com.facebook.appevents.restrictivedatafilter.a.class)) {
                            try {
                                Intrinsics.checkNotNullParameter(parameters2, "parameters");
                                Intrinsics.checkNotNullParameter(eventName2, "eventName");
                                if (com.facebook.appevents.restrictivedatafilter.a.b) {
                                    HashMap hashMap = new HashMap();
                                    Iterator it2 = new ArrayList(parameters2.keySet()).iterator();
                                    while (it2.hasNext()) {
                                        String str6 = (String) it2.next();
                                        String a3 = com.facebook.appevents.restrictivedatafilter.a.a.a(eventName2, str6);
                                        if (a3 != null) {
                                            hashMap.put(str6, a3);
                                            parameters2.remove(str6);
                                        }
                                    }
                                    if (!hashMap.isEmpty()) {
                                        try {
                                            JSONObject jSONObject5 = new JSONObject();
                                            for (Map.Entry entry : hashMap.entrySet()) {
                                                jSONObject5.put((String) entry.getKey(), (String) entry.getValue());
                                            }
                                            parameters2.put("_restrictedParams", jSONObject5.toString());
                                        } catch (JSONException unused3) {
                                        }
                                    }
                                }
                            } catch (Throwable th6) {
                                com.facebook.internal.instrument.crashshield.a.a(th6, com.facebook.appevents.restrictivedatafilter.a.class);
                            }
                        }
                        Map parameters3 = TypeIntrinsics.asMutableMap(parameters);
                        com.facebook.appevents.eventdeactivation.a aVar5 = com.facebook.appevents.eventdeactivation.a.a;
                        if (!com.facebook.internal.instrument.crashshield.a.b(com.facebook.appevents.eventdeactivation.a.class)) {
                            try {
                                Intrinsics.checkNotNullParameter(parameters3, "parameters");
                                Intrinsics.checkNotNullParameter(eventName2, "eventName");
                                if (com.facebook.appevents.eventdeactivation.a.b) {
                                    ArrayList arrayList = new ArrayList(parameters3.keySet());
                                    Iterator it3 = new ArrayList(com.facebook.appevents.eventdeactivation.a.c).iterator();
                                    while (it3.hasNext()) {
                                        a.C0076a c0076a = (a.C0076a) it3.next();
                                        if (Intrinsics.areEqual(c0076a.a, eventName2)) {
                                            Iterator it4 = arrayList.iterator();
                                            while (it4.hasNext()) {
                                                String str7 = (String) it4.next();
                                                if (c0076a.b.contains(str7)) {
                                                    parameters3.remove(str7);
                                                }
                                            }
                                        }
                                    }
                                }
                            } catch (Throwable th7) {
                                com.facebook.internal.instrument.crashshield.a.a(th7, com.facebook.appevents.eventdeactivation.a.class);
                            }
                        }
                        for (String str8 : parameters.keySet()) {
                            jSONObject2.put(str8, parameters.get(str8));
                        }
                    }
                    if (d != null) {
                        jSONObject2.put("_valueToSum", d.doubleValue());
                    }
                    if (this.d) {
                        jSONObject2.put("_inBackground", "1");
                    }
                    if (this.c) {
                        jSONObject2.put("_implicitlyLogged", "1");
                    } else {
                        u.a aVar6 = com.facebook.internal.u.Companion;
                        String jSONObject6 = jSONObject2.toString();
                        Intrinsics.checkNotNullExpressionValue(jSONObject6, "eventObject.toString()");
                        aVar6.getClass();
                        u.a.b(com.facebook.G.d, "AppEvents", "Created app event '%s'", jSONObject6);
                    }
                    this.a = jSONObject2;
                }
            }
            str = eventName;
            if (Intrinsics.areEqual(str, eventName)) {
            }
            jSONObject2.put("_eventName", str);
            jSONObject2.put("_logTime", System.currentTimeMillis() / 1000);
            jSONObject2.put("_ui", contextName);
            if (uuid != null) {
            }
            if (bundle != null) {
            }
            if (d != null) {
            }
            if (this.d) {
            }
            if (this.c) {
            }
            this.a = jSONObject2;
        }
        str = null;
        if (Intrinsics.areEqual(str, eventName)) {
        }
        jSONObject2.put("_eventName", str);
        jSONObject2.put("_logTime", System.currentTimeMillis() / 1000);
        jSONObject2.put("_ui", contextName);
        if (uuid != null) {
        }
        if (bundle != null) {
        }
        if (d != null) {
        }
        if (this.d) {
        }
        if (this.c) {
        }
        this.a = jSONObject2;
    }

    private final Object writeReplace() throws ObjectStreamException {
        String jSONObject = this.a.toString();
        Intrinsics.checkNotNullExpressionValue(jSONObject, "jsonObject.toString()");
        String jSONObject2 = this.b.toString();
        Intrinsics.checkNotNullExpressionValue(jSONObject2, "operationalJsonObject.toString()");
        return new b(jSONObject, jSONObject2, this.c, this.d);
    }

    public final String toString() {
        StringCompanionObject stringCompanionObject = StringCompanionObject.INSTANCE;
        JSONObject jSONObject = this.a;
        return androidx.credentials.provider.p.a(new Object[]{jSONObject.optString("_eventName"), Boolean.valueOf(this.c), jSONObject.toString()}, 3, "\"%s\", implicit: %b, json: %s", "format(format, *args)");
    }

    public C0692d(String str, String str2, boolean z, boolean z2) {
        JSONObject jSONObject = new JSONObject(str);
        this.a = jSONObject;
        this.b = new JSONObject(str2);
        this.c = z;
        String optString = jSONObject.optString("_eventName");
        Intrinsics.checkNotNullExpressionValue(optString, "jsonObject.optString(Con…nts.EVENT_NAME_EVENT_KEY)");
        this.e = optString;
        this.d = z2;
    }
}
