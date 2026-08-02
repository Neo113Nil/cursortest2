package Y4;

import C1.C0095a;
import E4.AbstractC0178k;
import E4.C0171d;
import E4.C0177j;
import E4.EnumC0176i;
import E5.C0195m;
import E5.C0203v;
import R5.C0406b;
import R5.C0407c;
import R5.C0409e;
import R5.C0413i;
import R5.C0424u;
import W5.AbstractC0486a1;
import a.AbstractC0603a;
import android.app.Activity;
import android.content.Context;
import android.content.ContextWrapper;
import android.graphics.Point;
import android.graphics.Rect;
import android.os.Build;
import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.InputFilter;
import android.text.method.TransformationMethod;
import android.util.JsonReader;
import android.util.JsonToken;
import android.util.JsonWriter;
import android.util.Log;
import android.view.Display;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowManager;
import android.view.WindowMetrics;
import android.webkit.DownloadListener;
import android.webkit.HttpAuthHandler;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import androidx.datastore.preferences.protobuf.C0683g;
import b0.C0758f;
import b0.C0760h;
import b0.C0764l;
import b1.C0778a;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.internal.ads.zzbbd;
import com.google.android.gms.internal.ads.zzfak;
import com.google.android.gms.tasks.TaskCompletionSource;
import com.google.firebase.auth.AuthCredential;
import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.auth.internal.zzaj;
import e4.C1031e;
import e4.C1033g;
import e4.C1034h;
import e4.C1035i;
import f6.C1114g;
import f6.C1115h;
import f6.C1116i;
import f6.C1117j;
import f6.EnumC1110c;
import f6.InterfaceC1109b;
import h4.ExecutorC1207j;
import java.io.IOException;
import java.io.InterruptedIOException;
import java.io.StringWriter;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.UUID;
import java.util.concurrent.Executor;
import k6.AbstractC1356c;
import kotlin.jvm.functions.Function1;
import n1.C1450e;
import n3.AbstractC1464a;
import n4.C1468b;
import n4.C1473g;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import p6.AbstractC1539a;
import q4.InterfaceC1556a;
import r5.C1577b;
import u2.C1639p;
import u2.C1640q;
import v0.AbstractC1663a;
import v2.AbstractC1664a;
import w1.V0;

/* loaded from: classes2.dex */
public abstract class D {

    /* renamed from: a, reason: collision with root package name */
    public static volatile H2.r f7689a;

    /* renamed from: b, reason: collision with root package name */
    public static volatile H2.r f7690b;

    /* renamed from: c, reason: collision with root package name */
    public static volatile H2.r f7691c;

    /* renamed from: d, reason: collision with root package name */
    public static volatile H2.r f7692d;

    /* renamed from: e, reason: collision with root package name */
    public static volatile H2.r f7693e;

    /* renamed from: f, reason: collision with root package name */
    public static U5.p0 f7694f;

    /* renamed from: g, reason: collision with root package name */
    public static U5.p0 f7695g;

    /* renamed from: h, reason: collision with root package name */
    public static U5.p0 f7696h;

    /* renamed from: i, reason: collision with root package name */
    public static ExecutorC1207j f7697i;
    public static Executor j;

    public static boolean A(I0 i02) {
        I0 z4 = i02 == null ? null : i02.N().z("__type__");
        return z4 != null && "server_timestamp".equals(z4.P());
    }

    public static List A0(JSONArray jSONArray, ArrayList arrayList) {
        if (arrayList == null) {
            arrayList = new ArrayList();
        }
        if (jSONArray != null) {
            for (int i7 = 0; i7 < jSONArray.length(); i7++) {
                arrayList.add(jSONArray.getString(i7));
            }
        }
        return arrayList;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static InterfaceC1109b B(s6.a aVar) {
        EnumC1110c[] enumC1110cArr = EnumC1110c.f12999a;
        t6.h.e(aVar, "initializer");
        C1115h c1115h = C1115h.f13007a;
        C1117j c1117j = new C1117j();
        c1117j.f13009a = (t6.i) aVar;
        c1117j.f13010b = c1115h;
        return c1117j;
    }

    public static void B0(Parcel parcel, int i7, int i8) {
        parcel.writeInt(i7 | (i8 << 16));
    }

    public static C1114g C(s6.a aVar) {
        t6.h.e(aVar, "initializer");
        return new C1114g(aVar);
    }

    public static ArrayList C0(JsonReader jsonReader) {
        ArrayList arrayList = new ArrayList();
        jsonReader.beginArray();
        while (jsonReader.hasNext()) {
            arrayList.add(jsonReader.nextString());
        }
        jsonReader.endArray();
        return arrayList;
    }

    public static List D(Object obj) {
        List singletonList = Collections.singletonList(obj);
        t6.h.d(singletonList, "singletonList(...)");
        return singletonList;
    }

    public static JSONArray D0(JsonReader jsonReader) {
        JSONArray jSONArray = new JSONArray();
        jsonReader.beginArray();
        while (jsonReader.hasNext()) {
            JsonToken peek = jsonReader.peek();
            if (JsonToken.BEGIN_ARRAY.equals(peek)) {
                jSONArray.put(D0(jsonReader));
            } else if (JsonToken.BEGIN_OBJECT.equals(peek)) {
                jSONArray.put(F0(jsonReader));
            } else if (JsonToken.BOOLEAN.equals(peek)) {
                jSONArray.put(jsonReader.nextBoolean());
            } else if (JsonToken.NUMBER.equals(peek)) {
                jSONArray.put(jsonReader.nextDouble());
            } else {
                if (!JsonToken.STRING.equals(peek)) {
                    throw new IllegalStateException("unexpected json token: ".concat(String.valueOf(peek)));
                }
                jSONArray.put(jsonReader.nextString());
            }
        }
        jsonReader.endArray();
        return jSONArray;
    }

    public static C0203v E() {
        return new C0203v("NO_CURRENT_USER", "No user currently signed in.", null);
    }

    public static JSONObject E0(JSONObject jSONObject, String str) {
        try {
            return jSONObject.getJSONObject(str);
        } catch (JSONException unused) {
            JSONObject jSONObject2 = new JSONObject();
            jSONObject.put(str, jSONObject2);
            return jSONObject2;
        }
    }

    public static JSONObject F0(JsonReader jsonReader) {
        JSONObject jSONObject = new JSONObject();
        jsonReader.beginObject();
        while (jsonReader.hasNext()) {
            String nextName = jsonReader.nextName();
            JsonToken peek = jsonReader.peek();
            if (JsonToken.BEGIN_ARRAY.equals(peek)) {
                jSONObject.put(nextName, D0(jsonReader));
            } else if (JsonToken.BEGIN_OBJECT.equals(peek)) {
                jSONObject.put(nextName, F0(jsonReader));
            } else if (JsonToken.BOOLEAN.equals(peek)) {
                jSONObject.put(nextName, jsonReader.nextBoolean());
            } else if (JsonToken.NUMBER.equals(peek)) {
                jSONObject.put(nextName, jsonReader.nextDouble());
            } else {
                if (!JsonToken.STRING.equals(peek)) {
                    throw new IllegalStateException("unexpected json token: ".concat(String.valueOf(peek)));
                }
                jSONObject.put(nextName, jsonReader.nextString());
            }
        }
        jsonReader.endObject();
        return jSONObject;
    }

    public static void G0(JsonWriter jsonWriter, JSONArray jSONArray) {
        try {
            jsonWriter.beginArray();
            for (int i7 = 0; i7 < jSONArray.length(); i7++) {
                Object obj = jSONArray.get(i7);
                if (obj instanceof String) {
                    jsonWriter.value((String) obj);
                } else if (obj instanceof Number) {
                    jsonWriter.value((Number) obj);
                } else if (obj instanceof Boolean) {
                    jsonWriter.value(((Boolean) obj).booleanValue());
                } else if (obj instanceof JSONObject) {
                    H0(jsonWriter, (JSONObject) obj);
                } else {
                    if (!(obj instanceof JSONArray)) {
                        throw new JSONException("unable to write field: " + String.valueOf(obj));
                    }
                    G0(jsonWriter, (JSONArray) obj);
                }
            }
            jsonWriter.endArray();
        } catch (JSONException e7) {
            throw new IOException(e7);
        }
    }

    public static void H0(JsonWriter jsonWriter, JSONObject jSONObject) {
        try {
            jsonWriter.beginObject();
            Iterator<String> keys = jSONObject.keys();
            while (keys.hasNext()) {
                String next = keys.next();
                Object obj = jSONObject.get(next);
                if (obj instanceof String) {
                    jsonWriter.name(next).value((String) obj);
                } else if (obj instanceof Number) {
                    jsonWriter.name(next).value((Number) obj);
                } else if (obj instanceof Boolean) {
                    jsonWriter.name(next).value(((Boolean) obj).booleanValue());
                } else if (obj instanceof JSONObject) {
                    H0(jsonWriter.name(next), (JSONObject) obj);
                } else {
                    if (!(obj instanceof JSONArray)) {
                        throw new JSONException("unable to write field: " + String.valueOf(obj));
                    }
                    G0(jsonWriter.name(next), (JSONArray) obj);
                }
            }
            jsonWriter.endObject();
        } catch (JSONException e7) {
            throw new IOException(e7);
        }
    }

    public static String I0(zzfak zzfakVar) {
        if (zzfakVar == null) {
            return null;
        }
        StringWriter stringWriter = new StringWriter();
        try {
            JsonWriter jsonWriter = new JsonWriter(stringWriter);
            K0(jsonWriter, zzfakVar);
            jsonWriter.close();
            return stringWriter.toString();
        } catch (IOException e7) {
            int i7 = I2.J.f3546b;
            J2.j.e("Error when writing JSON.", e7);
            return null;
        }
    }

    public static JSONObject J0(JSONObject jSONObject, String[] strArr) {
        for (int i7 = 0; i7 < strArr.length - 1; i7 = 1) {
            if (jSONObject == null) {
                return null;
            }
            jSONObject = jSONObject.optJSONObject(strArr[0]);
        }
        return jSONObject;
    }

    public static void K0(JsonWriter jsonWriter, Object obj) {
        if (obj == null) {
            jsonWriter.nullValue();
            return;
        }
        if (obj instanceof Number) {
            jsonWriter.value((Number) obj);
            return;
        }
        if (obj instanceof Boolean) {
            jsonWriter.value(((Boolean) obj).booleanValue());
            return;
        }
        if (obj instanceof String) {
            jsonWriter.value((String) obj);
            return;
        }
        if (obj instanceof zzfak) {
            H0(jsonWriter, ((zzfak) obj).zzd);
            return;
        }
        if (!(obj instanceof Map)) {
            if (!(obj instanceof List)) {
                jsonWriter.nullValue();
                return;
            }
            jsonWriter.beginArray();
            Iterator it = ((List) obj).iterator();
            while (it.hasNext()) {
                K0(jsonWriter, it.next());
            }
            jsonWriter.endArray();
            return;
        }
        jsonWriter.beginObject();
        for (Map.Entry entry : ((Map) obj).entrySet()) {
            Object key = entry.getKey();
            if (key instanceof String) {
                K0(jsonWriter.name((String) key), entry.getValue());
            }
        }
        jsonWriter.endObject();
    }

    public static C0203v L(Exception exc) {
        if (exc == null) {
            return new C0203v("UNKNOWN", null, null);
        }
        String message = exc.getMessage();
        HashMap hashMap = new HashMap();
        if (exc instanceof C1033g) {
            C1033g c1033g = (C1033g) exc;
            HashMap hashMap2 = new HashMap();
            zzaj zzajVar = c1033g.f12677b;
            ArrayList j3 = zzajVar.j();
            String uuid = UUID.randomUUID().toString();
            C0195m.f2387b.put(uuid, zzajVar.f11920b);
            String uuid2 = UUID.randomUUID().toString();
            C0195m.f2388c.put(uuid2, zzajVar);
            ArrayList arrayList = new ArrayList();
            Iterator it = AbstractC1464a.I(j3).iterator();
            while (it.hasNext()) {
                arrayList.add(((E5.J) it.next()).b());
            }
            Y3.i iVar = FirebaseAuth.getInstance(Y3.i.f(zzajVar.f11921c)).f11849a;
            iVar.b();
            hashMap2.put("appName", iVar.f7664b);
            hashMap2.put("multiFactorHints", arrayList);
            hashMap2.put("multiFactorSessionId", uuid);
            hashMap2.put("multiFactorResolverId", uuid2);
            return new C0203v(c1033g.f12676a, c1033g.getLocalizedMessage(), hashMap2);
        }
        if ((exc instanceof Y3.k) || (exc.getCause() != null && (exc.getCause() instanceof Y3.k))) {
            return new C0203v("network-request-failed", "A network error (such as timeout, interrupted connection or unreachable host) has occurred.", null);
        }
        if ((exc instanceof Y3.c) || (exc.getCause() != null && (exc.getCause() instanceof Y3.c))) {
            return new C0203v("api-not-available", "The requested API is not available.", null);
        }
        if ((exc instanceof Y3.m) || (exc.getCause() != null && (exc.getCause() instanceof Y3.m))) {
            return new C0203v("too-many-requests", "We have blocked all requests from this device due to unusual activity. Try again later.", null);
        }
        if (exc.getMessage() != null && exc.getMessage().startsWith("Cannot create PhoneAuthCredential without either verificationProof")) {
            return new C0203v("invalid-verification-code", "The verification ID used to create the phone auth credential is invalid.", null);
        }
        if (message != null && message.contains("User has already been linked to the given provider.")) {
            return new C0203v("PROVIDER_ALREADY_LINKED", "User has already been linked to the given provider.", null);
        }
        String str = exc instanceof C1031e ? ((C1031e) exc).f12676a : "UNKNOWN";
        if (exc instanceof C1035i) {
            message = ((C1035i) exc).f12680b;
        }
        if (exc instanceof C1034h) {
            C1034h c1034h = (C1034h) exc;
            String str2 = c1034h.f12679c;
            if (str2 != null) {
                hashMap.put("email", str2);
            }
            AuthCredential authCredential = c1034h.f12678b;
            if (authCredential != null) {
                hashMap.put("authCredential", AbstractC1464a.J(authCredential));
            }
        }
        return new C0203v(str, message, hashMap);
    }

    public static String M(List list) {
        if (list.isEmpty()) {
            return "/";
        }
        StringBuilder sb = new StringBuilder();
        Iterator it = list.iterator();
        boolean z4 = true;
        while (it.hasNext()) {
            String str = (String) it.next();
            if (!z4) {
                sb.append("/");
            }
            sb.append(str);
            z4 = false;
        }
        return sb.toString();
    }

    public static int N(int i7, C0095a c0095a) {
        switch (i7) {
            case 1:
                return 192;
            case 2:
            case 3:
            case 4:
            case 5:
                return 576 << (i7 - 2);
            case 6:
                return c0095a.t() + 1;
            case 7:
                return c0095a.y() + 1;
            case 8:
            case 9:
            case 10:
            case 11:
            case 12:
            case 13:
            case 14:
            case 15:
                return 256 << (i7 - 8);
            default:
                return -1;
        }
    }

    public static Object O(Object obj, AbstractC0603a abstractC0603a, HashMap hashMap) {
        if (!(obj instanceof Map)) {
            return obj;
        }
        Map map = (Map) obj;
        if (!map.containsKey(".sv")) {
            return obj;
        }
        Object obj2 = map.get(".sv");
        Object obj3 = null;
        obj3 = null;
        obj3 = null;
        obj3 = null;
        obj3 = null;
        if (obj2 instanceof String) {
            String str = (String) obj2;
            if ("timestamp".equals(str) && hashMap.containsKey(str)) {
                obj3 = hashMap.get(str);
            }
        } else if (obj2 instanceof Map) {
            Map map2 = (Map) obj2;
            if (map2.containsKey("increment")) {
                Object obj4 = map2.get("increment");
                if (obj4 instanceof Number) {
                    Number number = (Number) obj4;
                    v4.r f02 = abstractC0603a.f0();
                    obj3 = number;
                    if (f02.r()) {
                        obj3 = number;
                        if (f02.getValue() instanceof Number) {
                            Number number2 = (Number) f02.getValue();
                            if (!(number instanceof Double) && !(number instanceof Float) && !(number2 instanceof Double) && !(number2 instanceof Float)) {
                                long longValue = number.longValue();
                                long longValue2 = number2.longValue();
                                long j3 = longValue + longValue2;
                                if (((longValue ^ j3) & (longValue2 ^ j3)) >= 0) {
                                    obj3 = Long.valueOf(j3);
                                }
                            }
                            obj3 = Double.valueOf(number2.doubleValue() + number.doubleValue());
                        }
                    }
                }
            }
        }
        return obj3 == null ? obj : obj3;
    }

    public static C1468b P(C1468b c1468b, n4.D d7, C1473g c1473g, HashMap hashMap) {
        C1468b c1468b2 = C1468b.f15391b;
        Iterator it = c1468b.f15392a.iterator();
        while (it.hasNext()) {
            Map.Entry entry = (Map.Entry) it.next();
            c1468b2 = c1468b2.l((C1473g) entry.getKey(), Q((v4.r) entry.getValue(), new n4.K(d7, c1473g.m((C1473g) entry.getKey())), hashMap));
        }
        return c1468b2;
    }

    public static v4.r Q(v4.r rVar, AbstractC0603a abstractC0603a, HashMap hashMap) {
        Object value = rVar.e().getValue();
        Object O7 = O(value, abstractC0603a.Y(v4.c.b(".priority")), hashMap);
        boolean z4 = false;
        if (!rVar.r()) {
            if (rVar.isEmpty()) {
                return rVar;
            }
            v4.f fVar = (v4.f) rVar;
            C1450e c1450e = new C1450e(fVar, 18);
            fVar.m(new n4.p(abstractC0603a, hashMap, c1450e), false);
            return !((v4.r) c1450e.f15308b).e().equals(O7) ? ((v4.r) c1450e.f15308b).v(p6.c.k(null, O7)) : (v4.r) c1450e.f15308b;
        }
        Object O8 = O(rVar.getValue(), abstractC0603a, hashMap);
        if (O8.equals(rVar.getValue())) {
            if (O7 == value) {
                z4 = true;
            } else if (O7 != null && value != null) {
                z4 = O7.equals(value);
            }
            if (z4) {
                return rVar;
            }
        }
        return AbstractC1539a.a(O8, p6.c.k(null, O7));
    }

    public static void R(H5.x xVar, Exception exc) {
        xVar.a(new H5.n("firebase_firestore", exc.getMessage(), m(exc)));
    }

    public static void U(Status status, Object obj, TaskCompletionSource taskCompletionSource) {
        if (status.j()) {
            taskCompletionSource.setResult(obj);
        } else {
            taskCompletionSource.setException(com.google.android.gms.common.internal.D.n(status));
        }
    }

    public static void V(A5.f fVar, final C0407c c0407c) {
        t6.h.e(fVar, "binaryMessenger");
        C1114g c1114g = C0409e.f6156b;
        Object obj = null;
        w1.F0 f02 = new w1.F0(fVar, "dev.flutter.pigeon.webview_flutter_android.PigeonInternalInstanceManager.removeStrongReference", (A5.n) c1114g.getValue(), obj, 1);
        if (c0407c != null) {
            final int i7 = 0;
            f02.M(new A5.b() { // from class: R5.d
                @Override // A5.b
                public final void i(Object obj2, V0 v02) {
                    List w02;
                    List w03;
                    switch (i7) {
                        case 0:
                            C0407c c0407c2 = c0407c;
                            t6.h.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj3 = ((List) obj2).get(0);
                            t6.h.c(obj3, "null cannot be cast to non-null type kotlin.Long");
                            Long l7 = (Long) obj3;
                            long longValue = l7.longValue();
                            try {
                                c0407c2.f();
                                Object e7 = c0407c2.e(longValue);
                                if (e7 instanceof i0) {
                                    ((i0) e7).destroy();
                                }
                                c0407c2.f6138d.remove(l7);
                                w02 = Y4.D.D(null);
                            } catch (Throwable th) {
                                w02 = AbstractC0603a.w0(th);
                            }
                            v02.f(w02);
                            break;
                        default:
                            C0407c c0407c3 = c0407c;
                            try {
                                c0407c3.f6136b.clear();
                                c0407c3.f6137c.clear();
                                c0407c3.f6138d.clear();
                                c0407c3.f6140f.clear();
                                w03 = Y4.D.D(null);
                            } catch (Throwable th2) {
                                w03 = AbstractC0603a.w0(th2);
                            }
                            v02.f(w03);
                            break;
                    }
                }
            });
        } else {
            f02.M(null);
        }
        w1.F0 f03 = new w1.F0(fVar, "dev.flutter.pigeon.webview_flutter_android.PigeonInternalInstanceManager.clear", (A5.n) c1114g.getValue(), obj, 1);
        if (c0407c == null) {
            f03.M(null);
        } else {
            final int i8 = 1;
            f03.M(new A5.b() { // from class: R5.d
                @Override // A5.b
                public final void i(Object obj2, V0 v02) {
                    List w02;
                    List w03;
                    switch (i8) {
                        case 0:
                            C0407c c0407c2 = c0407c;
                            t6.h.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj3 = ((List) obj2).get(0);
                            t6.h.c(obj3, "null cannot be cast to non-null type kotlin.Long");
                            Long l7 = (Long) obj3;
                            long longValue = l7.longValue();
                            try {
                                c0407c2.f();
                                Object e7 = c0407c2.e(longValue);
                                if (e7 instanceof i0) {
                                    ((i0) e7).destroy();
                                }
                                c0407c2.f6138d.remove(l7);
                                w02 = Y4.D.D(null);
                            } catch (Throwable th) {
                                w02 = AbstractC0603a.w0(th);
                            }
                            v02.f(w02);
                            break;
                        default:
                            C0407c c0407c3 = c0407c;
                            try {
                                c0407c3.f6136b.clear();
                                c0407c3.f6137c.clear();
                                c0407c3.f6138d.clear();
                                c0407c3.f6140f.clear();
                                w03 = Y4.D.D(null);
                            } catch (Throwable th2) {
                                w03 = AbstractC0603a.w0(th2);
                            }
                            v02.f(w03);
                            break;
                    }
                }
            });
        }
    }

    public static void W(A5.f fVar, final C0413i c0413i) {
        I4.j jVar;
        t6.h.e(fVar, "binaryMessenger");
        A5.n c0406b = (c0413i == null || (jVar = c0413i.f6174a) == null) ? new C0406b() : jVar.a();
        Object obj = null;
        w1.F0 f02 = new w1.F0(fVar, "dev.flutter.pigeon.webview_flutter_android.WebView.pigeon_defaultConstructor", c0406b, obj, 1);
        if (c0413i != null) {
            final int i7 = 0;
            f02.M(new A5.b() { // from class: R5.N
                @Override // A5.b
                public final void i(Object obj2, V0 v02) {
                    List w02;
                    List w03;
                    List w04;
                    List w05;
                    List w06;
                    List w07;
                    List w08;
                    List w09;
                    List w010;
                    List w011;
                    List w012;
                    List w013;
                    List w014;
                    List w015;
                    List w016;
                    List w017;
                    List w018;
                    List w019;
                    List w020;
                    List w021;
                    List w022;
                    List w023;
                    switch (i7) {
                        case 0:
                            C0413i c0413i2 = c0413i;
                            t6.h.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj3 = ((List) obj2).get(0);
                            t6.h.c(obj3, "null cannot be cast to non-null type kotlin.Long");
                            try {
                                ((C0407c) c0413i2.f6174a.f3679c).a(((Long) obj3).longValue(), c0413i2.a());
                                w02 = Y4.D.D(null);
                            } catch (Throwable th) {
                                w02 = AbstractC0603a.w0(th);
                            }
                            v02.f(w02);
                            break;
                        case 1:
                            C0413i c0413i3 = c0413i;
                            t6.h.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list = (List) obj2;
                            Object obj4 = list.get(0);
                            t6.h.c(obj4, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView = (WebView) obj4;
                            DownloadListener downloadListener = (DownloadListener) list.get(1);
                            try {
                                c0413i3.getClass();
                                webView.setDownloadListener(downloadListener);
                                w03 = Y4.D.D(null);
                            } catch (Throwable th2) {
                                w03 = AbstractC0603a.w0(th2);
                            }
                            v02.f(w03);
                            break;
                        case 2:
                            C0413i c0413i4 = c0413i;
                            t6.h.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list2 = (List) obj2;
                            Object obj5 = list2.get(0);
                            t6.h.c(obj5, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView2 = (WebView) obj5;
                            Object obj6 = list2.get(1);
                            t6.h.c(obj6, "null cannot be cast to non-null type kotlin.Long");
                            try {
                                ((C0407c) c0413i4.f6174a.f3679c).a(((Long) obj6).longValue(), webView2.getSettings());
                                w04 = Y4.D.D(null);
                            } catch (Throwable th3) {
                                w04 = AbstractC0603a.w0(th3);
                            }
                            v02.f(w04);
                            break;
                        case 3:
                            C0413i c0413i5 = c0413i;
                            t6.h.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list3 = (List) obj2;
                            Object obj7 = list3.get(0);
                            t6.h.c(obj7, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView3 = (WebView) obj7;
                            Z z4 = (Z) list3.get(1);
                            try {
                                c0413i5.getClass();
                                webView3.setWebChromeClient(z4);
                                w05 = Y4.D.D(null);
                            } catch (Throwable th4) {
                                w05 = AbstractC0603a.w0(th4);
                            }
                            v02.f(w05);
                            break;
                        case 4:
                            C0413i c0413i6 = c0413i;
                            t6.h.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list4 = (List) obj2;
                            Object obj8 = list4.get(0);
                            t6.h.c(obj8, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView4 = (WebView) obj8;
                            Object obj9 = list4.get(1);
                            t6.h.c(obj9, "null cannot be cast to non-null type kotlin.Long");
                            long longValue = ((Long) obj9).longValue();
                            try {
                                c0413i6.getClass();
                                webView4.setBackgroundColor((int) longValue);
                                w06 = Y4.D.D(null);
                            } catch (Throwable th5) {
                                w06 = AbstractC0603a.w0(th5);
                            }
                            v02.f(w06);
                            break;
                        case 5:
                            C0413i c0413i7 = c0413i;
                            t6.h.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj10 = ((List) obj2).get(0);
                            t6.h.c(obj10, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView5 = (WebView) obj10;
                            try {
                                c0413i7.getClass();
                                webView5.destroy();
                                w07 = Y4.D.D(null);
                            } catch (Throwable th6) {
                                w07 = AbstractC0603a.w0(th6);
                            }
                            v02.f(w07);
                            break;
                        case 6:
                            C0413i c0413i8 = c0413i;
                            t6.h.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list5 = (List) obj2;
                            Object obj11 = list5.get(0);
                            t6.h.c(obj11, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView6 = (WebView) obj11;
                            Object obj12 = list5.get(1);
                            t6.h.c(obj12, "null cannot be cast to non-null type kotlin.String");
                            String str = (String) obj12;
                            String str2 = (String) list5.get(2);
                            String str3 = (String) list5.get(3);
                            try {
                                c0413i8.getClass();
                                webView6.loadData(str, str2, str3);
                                w08 = Y4.D.D(null);
                            } catch (Throwable th7) {
                                w08 = AbstractC0603a.w0(th7);
                            }
                            v02.f(w08);
                            break;
                        case 7:
                            C0413i c0413i9 = c0413i;
                            t6.h.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list6 = (List) obj2;
                            Object obj13 = list6.get(0);
                            t6.h.c(obj13, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView7 = (WebView) obj13;
                            String str4 = (String) list6.get(1);
                            Object obj14 = list6.get(2);
                            t6.h.c(obj14, "null cannot be cast to non-null type kotlin.String");
                            String str5 = (String) obj14;
                            String str6 = (String) list6.get(3);
                            String str7 = (String) list6.get(4);
                            String str8 = (String) list6.get(5);
                            try {
                                c0413i9.getClass();
                                webView7.loadDataWithBaseURL(str4, str5, str6, str7, str8);
                                w09 = Y4.D.D(null);
                            } catch (Throwable th8) {
                                w09 = AbstractC0603a.w0(th8);
                            }
                            v02.f(w09);
                            break;
                        case 8:
                            C0413i c0413i10 = c0413i;
                            t6.h.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list7 = (List) obj2;
                            Object obj15 = list7.get(0);
                            t6.h.c(obj15, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView8 = (WebView) obj15;
                            Object obj16 = list7.get(1);
                            t6.h.c(obj16, "null cannot be cast to non-null type kotlin.String");
                            String str9 = (String) obj16;
                            Object obj17 = list7.get(2);
                            t6.h.c(obj17, "null cannot be cast to non-null type kotlin.collections.Map<kotlin.String, kotlin.String>");
                            Map<String, String> map = (Map) obj17;
                            try {
                                c0413i10.getClass();
                                webView8.loadUrl(str9, map);
                                w010 = Y4.D.D(null);
                            } catch (Throwable th9) {
                                w010 = AbstractC0603a.w0(th9);
                            }
                            v02.f(w010);
                            break;
                        case 9:
                            C0413i c0413i11 = c0413i;
                            t6.h.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list8 = (List) obj2;
                            Object obj18 = list8.get(0);
                            t6.h.c(obj18, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView9 = (WebView) obj18;
                            Object obj19 = list8.get(1);
                            t6.h.c(obj19, "null cannot be cast to non-null type kotlin.String");
                            String str10 = (String) obj19;
                            Object obj20 = list8.get(2);
                            t6.h.c(obj20, "null cannot be cast to non-null type kotlin.ByteArray");
                            byte[] bArr = (byte[]) obj20;
                            try {
                                c0413i11.getClass();
                                webView9.postUrl(str10, bArr);
                                w011 = Y4.D.D(null);
                            } catch (Throwable th10) {
                                w011 = AbstractC0603a.w0(th10);
                            }
                            v02.f(w011);
                            break;
                        case 10:
                            C0413i c0413i12 = c0413i;
                            t6.h.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj21 = ((List) obj2).get(0);
                            t6.h.c(obj21, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView10 = (WebView) obj21;
                            try {
                                c0413i12.getClass();
                                w012 = Y4.D.D(webView10.getUrl());
                            } catch (Throwable th11) {
                                w012 = AbstractC0603a.w0(th11);
                            }
                            v02.f(w012);
                            break;
                        case 11:
                            C0413i c0413i13 = c0413i;
                            t6.h.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj22 = ((List) obj2).get(0);
                            t6.h.c(obj22, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView11 = (WebView) obj22;
                            try {
                                c0413i13.getClass();
                                webView11.goForward();
                                w013 = Y4.D.D(null);
                            } catch (Throwable th12) {
                                w013 = AbstractC0603a.w0(th12);
                            }
                            v02.f(w013);
                            break;
                        case 12:
                            C0413i c0413i14 = c0413i;
                            t6.h.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj23 = ((List) obj2).get(0);
                            t6.h.c(obj23, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView12 = (WebView) obj23;
                            try {
                                c0413i14.getClass();
                                w014 = Y4.D.D(Boolean.valueOf(webView12.canGoBack()));
                            } catch (Throwable th13) {
                                w014 = AbstractC0603a.w0(th13);
                            }
                            v02.f(w014);
                            break;
                        case 13:
                            C0413i c0413i15 = c0413i;
                            t6.h.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj24 = ((List) obj2).get(0);
                            t6.h.c(obj24, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView13 = (WebView) obj24;
                            try {
                                c0413i15.getClass();
                                w015 = Y4.D.D(Boolean.valueOf(webView13.canGoForward()));
                            } catch (Throwable th14) {
                                w015 = AbstractC0603a.w0(th14);
                            }
                            v02.f(w015);
                            break;
                        case 14:
                            C0413i c0413i16 = c0413i;
                            t6.h.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj25 = ((List) obj2).get(0);
                            t6.h.c(obj25, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView14 = (WebView) obj25;
                            try {
                                c0413i16.getClass();
                                webView14.goBack();
                                w016 = Y4.D.D(null);
                            } catch (Throwable th15) {
                                w016 = AbstractC0603a.w0(th15);
                            }
                            v02.f(w016);
                            break;
                        case 15:
                            C0413i c0413i17 = c0413i;
                            t6.h.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj26 = ((List) obj2).get(0);
                            t6.h.c(obj26, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView15 = (WebView) obj26;
                            try {
                                c0413i17.getClass();
                                webView15.reload();
                                w017 = Y4.D.D(null);
                            } catch (Throwable th16) {
                                w017 = AbstractC0603a.w0(th16);
                            }
                            v02.f(w017);
                            break;
                        case 16:
                            C0413i c0413i18 = c0413i;
                            t6.h.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list9 = (List) obj2;
                            Object obj27 = list9.get(0);
                            t6.h.c(obj27, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView16 = (WebView) obj27;
                            Object obj28 = list9.get(1);
                            t6.h.c(obj28, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean booleanValue = ((Boolean) obj28).booleanValue();
                            try {
                                c0413i18.getClass();
                                webView16.clearCache(booleanValue);
                                w018 = Y4.D.D(null);
                            } catch (Throwable th17) {
                                w018 = AbstractC0603a.w0(th17);
                            }
                            v02.f(w018);
                            break;
                        case 17:
                            t6.h.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list10 = (List) obj2;
                            Object obj29 = list10.get(0);
                            t6.h.c(obj29, "null cannot be cast to non-null type android.webkit.WebView");
                            Object obj30 = list10.get(1);
                            t6.h.c(obj30, "null cannot be cast to non-null type kotlin.String");
                            B b7 = new B(v02, 1);
                            c0413i.getClass();
                            ((WebView) obj29).evaluateJavascript((String) obj30, new C0416l(1, b7));
                            break;
                        case 18:
                            C0413i c0413i19 = c0413i;
                            t6.h.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj31 = ((List) obj2).get(0);
                            t6.h.c(obj31, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView17 = (WebView) obj31;
                            try {
                                c0413i19.getClass();
                                w019 = Y4.D.D(webView17.getTitle());
                            } catch (Throwable th18) {
                                w019 = AbstractC0603a.w0(th18);
                            }
                            v02.f(w019);
                            break;
                        case 19:
                            C0413i c0413i20 = c0413i;
                            t6.h.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj32 = ((List) obj2).get(0);
                            t6.h.c(obj32, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean booleanValue2 = ((Boolean) obj32).booleanValue();
                            try {
                                c0413i20.getClass();
                                WebView.setWebContentsDebuggingEnabled(booleanValue2);
                                w020 = Y4.D.D(null);
                            } catch (Throwable th19) {
                                w020 = AbstractC0603a.w0(th19);
                            }
                            v02.f(w020);
                            break;
                        case 20:
                            C0413i c0413i21 = c0413i;
                            t6.h.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list11 = (List) obj2;
                            Object obj33 = list11.get(0);
                            t6.h.c(obj33, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView18 = (WebView) obj33;
                            WebViewClient webViewClient = (WebViewClient) list11.get(1);
                            try {
                                c0413i21.getClass();
                                webView18.setWebViewClient(webViewClient);
                                w021 = Y4.D.D(null);
                            } catch (Throwable th20) {
                                w021 = AbstractC0603a.w0(th20);
                            }
                            v02.f(w021);
                            break;
                        case zzbbd.zzt.zzm /* 21 */:
                            C0413i c0413i22 = c0413i;
                            t6.h.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list12 = (List) obj2;
                            Object obj34 = list12.get(0);
                            t6.h.c(obj34, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView19 = (WebView) obj34;
                            Object obj35 = list12.get(1);
                            t6.h.c(obj35, "null cannot be cast to non-null type io.flutter.plugins.webviewflutter.JavaScriptChannel");
                            C0425v c0425v = (C0425v) obj35;
                            try {
                                c0413i22.getClass();
                                webView19.addJavascriptInterface(c0425v, c0425v.f6215a);
                                w022 = Y4.D.D(null);
                            } catch (Throwable th21) {
                                w022 = AbstractC0603a.w0(th21);
                            }
                            v02.f(w022);
                            break;
                        default:
                            C0413i c0413i23 = c0413i;
                            t6.h.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list13 = (List) obj2;
                            Object obj36 = list13.get(0);
                            t6.h.c(obj36, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView20 = (WebView) obj36;
                            Object obj37 = list13.get(1);
                            t6.h.c(obj37, "null cannot be cast to non-null type kotlin.String");
                            String str11 = (String) obj37;
                            try {
                                c0413i23.getClass();
                                webView20.removeJavascriptInterface(str11);
                                w023 = Y4.D.D(null);
                            } catch (Throwable th22) {
                                w023 = AbstractC0603a.w0(th22);
                            }
                            v02.f(w023);
                            break;
                    }
                }
            });
        } else {
            f02.M(null);
        }
        w1.F0 f03 = new w1.F0(fVar, "dev.flutter.pigeon.webview_flutter_android.WebView.settings", c0406b, obj, 1);
        if (c0413i != null) {
            final int i8 = 2;
            f03.M(new A5.b() { // from class: R5.N
                @Override // A5.b
                public final void i(Object obj2, V0 v02) {
                    List w02;
                    List w03;
                    List w04;
                    List w05;
                    List w06;
                    List w07;
                    List w08;
                    List w09;
                    List w010;
                    List w011;
                    List w012;
                    List w013;
                    List w014;
                    List w015;
                    List w016;
                    List w017;
                    List w018;
                    List w019;
                    List w020;
                    List w021;
                    List w022;
                    List w023;
                    switch (i8) {
                        case 0:
                            C0413i c0413i2 = c0413i;
                            t6.h.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj3 = ((List) obj2).get(0);
                            t6.h.c(obj3, "null cannot be cast to non-null type kotlin.Long");
                            try {
                                ((C0407c) c0413i2.f6174a.f3679c).a(((Long) obj3).longValue(), c0413i2.a());
                                w02 = Y4.D.D(null);
                            } catch (Throwable th) {
                                w02 = AbstractC0603a.w0(th);
                            }
                            v02.f(w02);
                            break;
                        case 1:
                            C0413i c0413i3 = c0413i;
                            t6.h.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list = (List) obj2;
                            Object obj4 = list.get(0);
                            t6.h.c(obj4, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView = (WebView) obj4;
                            DownloadListener downloadListener = (DownloadListener) list.get(1);
                            try {
                                c0413i3.getClass();
                                webView.setDownloadListener(downloadListener);
                                w03 = Y4.D.D(null);
                            } catch (Throwable th2) {
                                w03 = AbstractC0603a.w0(th2);
                            }
                            v02.f(w03);
                            break;
                        case 2:
                            C0413i c0413i4 = c0413i;
                            t6.h.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list2 = (List) obj2;
                            Object obj5 = list2.get(0);
                            t6.h.c(obj5, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView2 = (WebView) obj5;
                            Object obj6 = list2.get(1);
                            t6.h.c(obj6, "null cannot be cast to non-null type kotlin.Long");
                            try {
                                ((C0407c) c0413i4.f6174a.f3679c).a(((Long) obj6).longValue(), webView2.getSettings());
                                w04 = Y4.D.D(null);
                            } catch (Throwable th3) {
                                w04 = AbstractC0603a.w0(th3);
                            }
                            v02.f(w04);
                            break;
                        case 3:
                            C0413i c0413i5 = c0413i;
                            t6.h.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list3 = (List) obj2;
                            Object obj7 = list3.get(0);
                            t6.h.c(obj7, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView3 = (WebView) obj7;
                            Z z4 = (Z) list3.get(1);
                            try {
                                c0413i5.getClass();
                                webView3.setWebChromeClient(z4);
                                w05 = Y4.D.D(null);
                            } catch (Throwable th4) {
                                w05 = AbstractC0603a.w0(th4);
                            }
                            v02.f(w05);
                            break;
                        case 4:
                            C0413i c0413i6 = c0413i;
                            t6.h.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list4 = (List) obj2;
                            Object obj8 = list4.get(0);
                            t6.h.c(obj8, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView4 = (WebView) obj8;
                            Object obj9 = list4.get(1);
                            t6.h.c(obj9, "null cannot be cast to non-null type kotlin.Long");
                            long longValue = ((Long) obj9).longValue();
                            try {
                                c0413i6.getClass();
                                webView4.setBackgroundColor((int) longValue);
                                w06 = Y4.D.D(null);
                            } catch (Throwable th5) {
                                w06 = AbstractC0603a.w0(th5);
                            }
                            v02.f(w06);
                            break;
                        case 5:
                            C0413i c0413i7 = c0413i;
                            t6.h.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj10 = ((List) obj2).get(0);
                            t6.h.c(obj10, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView5 = (WebView) obj10;
                            try {
                                c0413i7.getClass();
                                webView5.destroy();
                                w07 = Y4.D.D(null);
                            } catch (Throwable th6) {
                                w07 = AbstractC0603a.w0(th6);
                            }
                            v02.f(w07);
                            break;
                        case 6:
                            C0413i c0413i8 = c0413i;
                            t6.h.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list5 = (List) obj2;
                            Object obj11 = list5.get(0);
                            t6.h.c(obj11, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView6 = (WebView) obj11;
                            Object obj12 = list5.get(1);
                            t6.h.c(obj12, "null cannot be cast to non-null type kotlin.String");
                            String str = (String) obj12;
                            String str2 = (String) list5.get(2);
                            String str3 = (String) list5.get(3);
                            try {
                                c0413i8.getClass();
                                webView6.loadData(str, str2, str3);
                                w08 = Y4.D.D(null);
                            } catch (Throwable th7) {
                                w08 = AbstractC0603a.w0(th7);
                            }
                            v02.f(w08);
                            break;
                        case 7:
                            C0413i c0413i9 = c0413i;
                            t6.h.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list6 = (List) obj2;
                            Object obj13 = list6.get(0);
                            t6.h.c(obj13, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView7 = (WebView) obj13;
                            String str4 = (String) list6.get(1);
                            Object obj14 = list6.get(2);
                            t6.h.c(obj14, "null cannot be cast to non-null type kotlin.String");
                            String str5 = (String) obj14;
                            String str6 = (String) list6.get(3);
                            String str7 = (String) list6.get(4);
                            String str8 = (String) list6.get(5);
                            try {
                                c0413i9.getClass();
                                webView7.loadDataWithBaseURL(str4, str5, str6, str7, str8);
                                w09 = Y4.D.D(null);
                            } catch (Throwable th8) {
                                w09 = AbstractC0603a.w0(th8);
                            }
                            v02.f(w09);
                            break;
                        case 8:
                            C0413i c0413i10 = c0413i;
                            t6.h.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list7 = (List) obj2;
                            Object obj15 = list7.get(0);
                            t6.h.c(obj15, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView8 = (WebView) obj15;
                            Object obj16 = list7.get(1);
                            t6.h.c(obj16, "null cannot be cast to non-null type kotlin.String");
                            String str9 = (String) obj16;
                            Object obj17 = list7.get(2);
                            t6.h.c(obj17, "null cannot be cast to non-null type kotlin.collections.Map<kotlin.String, kotlin.String>");
                            Map<String, String> map = (Map) obj17;
                            try {
                                c0413i10.getClass();
                                webView8.loadUrl(str9, map);
                                w010 = Y4.D.D(null);
                            } catch (Throwable th9) {
                                w010 = AbstractC0603a.w0(th9);
                            }
                            v02.f(w010);
                            break;
                        case 9:
                            C0413i c0413i11 = c0413i;
                            t6.h.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list8 = (List) obj2;
                            Object obj18 = list8.get(0);
                            t6.h.c(obj18, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView9 = (WebView) obj18;
                            Object obj19 = list8.get(1);
                            t6.h.c(obj19, "null cannot be cast to non-null type kotlin.String");
                            String str10 = (String) obj19;
                            Object obj20 = list8.get(2);
                            t6.h.c(obj20, "null cannot be cast to non-null type kotlin.ByteArray");
                            byte[] bArr = (byte[]) obj20;
                            try {
                                c0413i11.getClass();
                                webView9.postUrl(str10, bArr);
                                w011 = Y4.D.D(null);
                            } catch (Throwable th10) {
                                w011 = AbstractC0603a.w0(th10);
                            }
                            v02.f(w011);
                            break;
                        case 10:
                            C0413i c0413i12 = c0413i;
                            t6.h.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj21 = ((List) obj2).get(0);
                            t6.h.c(obj21, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView10 = (WebView) obj21;
                            try {
                                c0413i12.getClass();
                                w012 = Y4.D.D(webView10.getUrl());
                            } catch (Throwable th11) {
                                w012 = AbstractC0603a.w0(th11);
                            }
                            v02.f(w012);
                            break;
                        case 11:
                            C0413i c0413i13 = c0413i;
                            t6.h.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj22 = ((List) obj2).get(0);
                            t6.h.c(obj22, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView11 = (WebView) obj22;
                            try {
                                c0413i13.getClass();
                                webView11.goForward();
                                w013 = Y4.D.D(null);
                            } catch (Throwable th12) {
                                w013 = AbstractC0603a.w0(th12);
                            }
                            v02.f(w013);
                            break;
                        case 12:
                            C0413i c0413i14 = c0413i;
                            t6.h.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj23 = ((List) obj2).get(0);
                            t6.h.c(obj23, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView12 = (WebView) obj23;
                            try {
                                c0413i14.getClass();
                                w014 = Y4.D.D(Boolean.valueOf(webView12.canGoBack()));
                            } catch (Throwable th13) {
                                w014 = AbstractC0603a.w0(th13);
                            }
                            v02.f(w014);
                            break;
                        case 13:
                            C0413i c0413i15 = c0413i;
                            t6.h.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj24 = ((List) obj2).get(0);
                            t6.h.c(obj24, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView13 = (WebView) obj24;
                            try {
                                c0413i15.getClass();
                                w015 = Y4.D.D(Boolean.valueOf(webView13.canGoForward()));
                            } catch (Throwable th14) {
                                w015 = AbstractC0603a.w0(th14);
                            }
                            v02.f(w015);
                            break;
                        case 14:
                            C0413i c0413i16 = c0413i;
                            t6.h.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj25 = ((List) obj2).get(0);
                            t6.h.c(obj25, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView14 = (WebView) obj25;
                            try {
                                c0413i16.getClass();
                                webView14.goBack();
                                w016 = Y4.D.D(null);
                            } catch (Throwable th15) {
                                w016 = AbstractC0603a.w0(th15);
                            }
                            v02.f(w016);
                            break;
                        case 15:
                            C0413i c0413i17 = c0413i;
                            t6.h.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj26 = ((List) obj2).get(0);
                            t6.h.c(obj26, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView15 = (WebView) obj26;
                            try {
                                c0413i17.getClass();
                                webView15.reload();
                                w017 = Y4.D.D(null);
                            } catch (Throwable th16) {
                                w017 = AbstractC0603a.w0(th16);
                            }
                            v02.f(w017);
                            break;
                        case 16:
                            C0413i c0413i18 = c0413i;
                            t6.h.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list9 = (List) obj2;
                            Object obj27 = list9.get(0);
                            t6.h.c(obj27, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView16 = (WebView) obj27;
                            Object obj28 = list9.get(1);
                            t6.h.c(obj28, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean booleanValue = ((Boolean) obj28).booleanValue();
                            try {
                                c0413i18.getClass();
                                webView16.clearCache(booleanValue);
                                w018 = Y4.D.D(null);
                            } catch (Throwable th17) {
                                w018 = AbstractC0603a.w0(th17);
                            }
                            v02.f(w018);
                            break;
                        case 17:
                            t6.h.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list10 = (List) obj2;
                            Object obj29 = list10.get(0);
                            t6.h.c(obj29, "null cannot be cast to non-null type android.webkit.WebView");
                            Object obj30 = list10.get(1);
                            t6.h.c(obj30, "null cannot be cast to non-null type kotlin.String");
                            B b7 = new B(v02, 1);
                            c0413i.getClass();
                            ((WebView) obj29).evaluateJavascript((String) obj30, new C0416l(1, b7));
                            break;
                        case 18:
                            C0413i c0413i19 = c0413i;
                            t6.h.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj31 = ((List) obj2).get(0);
                            t6.h.c(obj31, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView17 = (WebView) obj31;
                            try {
                                c0413i19.getClass();
                                w019 = Y4.D.D(webView17.getTitle());
                            } catch (Throwable th18) {
                                w019 = AbstractC0603a.w0(th18);
                            }
                            v02.f(w019);
                            break;
                        case 19:
                            C0413i c0413i20 = c0413i;
                            t6.h.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj32 = ((List) obj2).get(0);
                            t6.h.c(obj32, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean booleanValue2 = ((Boolean) obj32).booleanValue();
                            try {
                                c0413i20.getClass();
                                WebView.setWebContentsDebuggingEnabled(booleanValue2);
                                w020 = Y4.D.D(null);
                            } catch (Throwable th19) {
                                w020 = AbstractC0603a.w0(th19);
                            }
                            v02.f(w020);
                            break;
                        case 20:
                            C0413i c0413i21 = c0413i;
                            t6.h.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list11 = (List) obj2;
                            Object obj33 = list11.get(0);
                            t6.h.c(obj33, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView18 = (WebView) obj33;
                            WebViewClient webViewClient = (WebViewClient) list11.get(1);
                            try {
                                c0413i21.getClass();
                                webView18.setWebViewClient(webViewClient);
                                w021 = Y4.D.D(null);
                            } catch (Throwable th20) {
                                w021 = AbstractC0603a.w0(th20);
                            }
                            v02.f(w021);
                            break;
                        case zzbbd.zzt.zzm /* 21 */:
                            C0413i c0413i22 = c0413i;
                            t6.h.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list12 = (List) obj2;
                            Object obj34 = list12.get(0);
                            t6.h.c(obj34, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView19 = (WebView) obj34;
                            Object obj35 = list12.get(1);
                            t6.h.c(obj35, "null cannot be cast to non-null type io.flutter.plugins.webviewflutter.JavaScriptChannel");
                            C0425v c0425v = (C0425v) obj35;
                            try {
                                c0413i22.getClass();
                                webView19.addJavascriptInterface(c0425v, c0425v.f6215a);
                                w022 = Y4.D.D(null);
                            } catch (Throwable th21) {
                                w022 = AbstractC0603a.w0(th21);
                            }
                            v02.f(w022);
                            break;
                        default:
                            C0413i c0413i23 = c0413i;
                            t6.h.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list13 = (List) obj2;
                            Object obj36 = list13.get(0);
                            t6.h.c(obj36, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView20 = (WebView) obj36;
                            Object obj37 = list13.get(1);
                            t6.h.c(obj37, "null cannot be cast to non-null type kotlin.String");
                            String str11 = (String) obj37;
                            try {
                                c0413i23.getClass();
                                webView20.removeJavascriptInterface(str11);
                                w023 = Y4.D.D(null);
                            } catch (Throwable th22) {
                                w023 = AbstractC0603a.w0(th22);
                            }
                            v02.f(w023);
                            break;
                    }
                }
            });
        } else {
            f03.M(null);
        }
        w1.F0 f04 = new w1.F0(fVar, "dev.flutter.pigeon.webview_flutter_android.WebView.loadData", c0406b, obj, 1);
        if (c0413i != null) {
            final int i9 = 6;
            f04.M(new A5.b() { // from class: R5.N
                @Override // A5.b
                public final void i(Object obj2, V0 v02) {
                    List w02;
                    List w03;
                    List w04;
                    List w05;
                    List w06;
                    List w07;
                    List w08;
                    List w09;
                    List w010;
                    List w011;
                    List w012;
                    List w013;
                    List w014;
                    List w015;
                    List w016;
                    List w017;
                    List w018;
                    List w019;
                    List w020;
                    List w021;
                    List w022;
                    List w023;
                    switch (i9) {
                        case 0:
                            C0413i c0413i2 = c0413i;
                            t6.h.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj3 = ((List) obj2).get(0);
                            t6.h.c(obj3, "null cannot be cast to non-null type kotlin.Long");
                            try {
                                ((C0407c) c0413i2.f6174a.f3679c).a(((Long) obj3).longValue(), c0413i2.a());
                                w02 = Y4.D.D(null);
                            } catch (Throwable th) {
                                w02 = AbstractC0603a.w0(th);
                            }
                            v02.f(w02);
                            break;
                        case 1:
                            C0413i c0413i3 = c0413i;
                            t6.h.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list = (List) obj2;
                            Object obj4 = list.get(0);
                            t6.h.c(obj4, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView = (WebView) obj4;
                            DownloadListener downloadListener = (DownloadListener) list.get(1);
                            try {
                                c0413i3.getClass();
                                webView.setDownloadListener(downloadListener);
                                w03 = Y4.D.D(null);
                            } catch (Throwable th2) {
                                w03 = AbstractC0603a.w0(th2);
                            }
                            v02.f(w03);
                            break;
                        case 2:
                            C0413i c0413i4 = c0413i;
                            t6.h.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list2 = (List) obj2;
                            Object obj5 = list2.get(0);
                            t6.h.c(obj5, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView2 = (WebView) obj5;
                            Object obj6 = list2.get(1);
                            t6.h.c(obj6, "null cannot be cast to non-null type kotlin.Long");
                            try {
                                ((C0407c) c0413i4.f6174a.f3679c).a(((Long) obj6).longValue(), webView2.getSettings());
                                w04 = Y4.D.D(null);
                            } catch (Throwable th3) {
                                w04 = AbstractC0603a.w0(th3);
                            }
                            v02.f(w04);
                            break;
                        case 3:
                            C0413i c0413i5 = c0413i;
                            t6.h.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list3 = (List) obj2;
                            Object obj7 = list3.get(0);
                            t6.h.c(obj7, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView3 = (WebView) obj7;
                            Z z4 = (Z) list3.get(1);
                            try {
                                c0413i5.getClass();
                                webView3.setWebChromeClient(z4);
                                w05 = Y4.D.D(null);
                            } catch (Throwable th4) {
                                w05 = AbstractC0603a.w0(th4);
                            }
                            v02.f(w05);
                            break;
                        case 4:
                            C0413i c0413i6 = c0413i;
                            t6.h.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list4 = (List) obj2;
                            Object obj8 = list4.get(0);
                            t6.h.c(obj8, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView4 = (WebView) obj8;
                            Object obj9 = list4.get(1);
                            t6.h.c(obj9, "null cannot be cast to non-null type kotlin.Long");
                            long longValue = ((Long) obj9).longValue();
                            try {
                                c0413i6.getClass();
                                webView4.setBackgroundColor((int) longValue);
                                w06 = Y4.D.D(null);
                            } catch (Throwable th5) {
                                w06 = AbstractC0603a.w0(th5);
                            }
                            v02.f(w06);
                            break;
                        case 5:
                            C0413i c0413i7 = c0413i;
                            t6.h.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj10 = ((List) obj2).get(0);
                            t6.h.c(obj10, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView5 = (WebView) obj10;
                            try {
                                c0413i7.getClass();
                                webView5.destroy();
                                w07 = Y4.D.D(null);
                            } catch (Throwable th6) {
                                w07 = AbstractC0603a.w0(th6);
                            }
                            v02.f(w07);
                            break;
                        case 6:
                            C0413i c0413i8 = c0413i;
                            t6.h.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list5 = (List) obj2;
                            Object obj11 = list5.get(0);
                            t6.h.c(obj11, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView6 = (WebView) obj11;
                            Object obj12 = list5.get(1);
                            t6.h.c(obj12, "null cannot be cast to non-null type kotlin.String");
                            String str = (String) obj12;
                            String str2 = (String) list5.get(2);
                            String str3 = (String) list5.get(3);
                            try {
                                c0413i8.getClass();
                                webView6.loadData(str, str2, str3);
                                w08 = Y4.D.D(null);
                            } catch (Throwable th7) {
                                w08 = AbstractC0603a.w0(th7);
                            }
                            v02.f(w08);
                            break;
                        case 7:
                            C0413i c0413i9 = c0413i;
                            t6.h.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list6 = (List) obj2;
                            Object obj13 = list6.get(0);
                            t6.h.c(obj13, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView7 = (WebView) obj13;
                            String str4 = (String) list6.get(1);
                            Object obj14 = list6.get(2);
                            t6.h.c(obj14, "null cannot be cast to non-null type kotlin.String");
                            String str5 = (String) obj14;
                            String str6 = (String) list6.get(3);
                            String str7 = (String) list6.get(4);
                            String str8 = (String) list6.get(5);
                            try {
                                c0413i9.getClass();
                                webView7.loadDataWithBaseURL(str4, str5, str6, str7, str8);
                                w09 = Y4.D.D(null);
                            } catch (Throwable th8) {
                                w09 = AbstractC0603a.w0(th8);
                            }
                            v02.f(w09);
                            break;
                        case 8:
                            C0413i c0413i10 = c0413i;
                            t6.h.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list7 = (List) obj2;
                            Object obj15 = list7.get(0);
                            t6.h.c(obj15, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView8 = (WebView) obj15;
                            Object obj16 = list7.get(1);
                            t6.h.c(obj16, "null cannot be cast to non-null type kotlin.String");
                            String str9 = (String) obj16;
                            Object obj17 = list7.get(2);
                            t6.h.c(obj17, "null cannot be cast to non-null type kotlin.collections.Map<kotlin.String, kotlin.String>");
                            Map<String, String> map = (Map) obj17;
                            try {
                                c0413i10.getClass();
                                webView8.loadUrl(str9, map);
                                w010 = Y4.D.D(null);
                            } catch (Throwable th9) {
                                w010 = AbstractC0603a.w0(th9);
                            }
                            v02.f(w010);
                            break;
                        case 9:
                            C0413i c0413i11 = c0413i;
                            t6.h.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list8 = (List) obj2;
                            Object obj18 = list8.get(0);
                            t6.h.c(obj18, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView9 = (WebView) obj18;
                            Object obj19 = list8.get(1);
                            t6.h.c(obj19, "null cannot be cast to non-null type kotlin.String");
                            String str10 = (String) obj19;
                            Object obj20 = list8.get(2);
                            t6.h.c(obj20, "null cannot be cast to non-null type kotlin.ByteArray");
                            byte[] bArr = (byte[]) obj20;
                            try {
                                c0413i11.getClass();
                                webView9.postUrl(str10, bArr);
                                w011 = Y4.D.D(null);
                            } catch (Throwable th10) {
                                w011 = AbstractC0603a.w0(th10);
                            }
                            v02.f(w011);
                            break;
                        case 10:
                            C0413i c0413i12 = c0413i;
                            t6.h.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj21 = ((List) obj2).get(0);
                            t6.h.c(obj21, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView10 = (WebView) obj21;
                            try {
                                c0413i12.getClass();
                                w012 = Y4.D.D(webView10.getUrl());
                            } catch (Throwable th11) {
                                w012 = AbstractC0603a.w0(th11);
                            }
                            v02.f(w012);
                            break;
                        case 11:
                            C0413i c0413i13 = c0413i;
                            t6.h.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj22 = ((List) obj2).get(0);
                            t6.h.c(obj22, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView11 = (WebView) obj22;
                            try {
                                c0413i13.getClass();
                                webView11.goForward();
                                w013 = Y4.D.D(null);
                            } catch (Throwable th12) {
                                w013 = AbstractC0603a.w0(th12);
                            }
                            v02.f(w013);
                            break;
                        case 12:
                            C0413i c0413i14 = c0413i;
                            t6.h.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj23 = ((List) obj2).get(0);
                            t6.h.c(obj23, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView12 = (WebView) obj23;
                            try {
                                c0413i14.getClass();
                                w014 = Y4.D.D(Boolean.valueOf(webView12.canGoBack()));
                            } catch (Throwable th13) {
                                w014 = AbstractC0603a.w0(th13);
                            }
                            v02.f(w014);
                            break;
                        case 13:
                            C0413i c0413i15 = c0413i;
                            t6.h.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj24 = ((List) obj2).get(0);
                            t6.h.c(obj24, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView13 = (WebView) obj24;
                            try {
                                c0413i15.getClass();
                                w015 = Y4.D.D(Boolean.valueOf(webView13.canGoForward()));
                            } catch (Throwable th14) {
                                w015 = AbstractC0603a.w0(th14);
                            }
                            v02.f(w015);
                            break;
                        case 14:
                            C0413i c0413i16 = c0413i;
                            t6.h.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj25 = ((List) obj2).get(0);
                            t6.h.c(obj25, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView14 = (WebView) obj25;
                            try {
                                c0413i16.getClass();
                                webView14.goBack();
                                w016 = Y4.D.D(null);
                            } catch (Throwable th15) {
                                w016 = AbstractC0603a.w0(th15);
                            }
                            v02.f(w016);
                            break;
                        case 15:
                            C0413i c0413i17 = c0413i;
                            t6.h.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj26 = ((List) obj2).get(0);
                            t6.h.c(obj26, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView15 = (WebView) obj26;
                            try {
                                c0413i17.getClass();
                                webView15.reload();
                                w017 = Y4.D.D(null);
                            } catch (Throwable th16) {
                                w017 = AbstractC0603a.w0(th16);
                            }
                            v02.f(w017);
                            break;
                        case 16:
                            C0413i c0413i18 = c0413i;
                            t6.h.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list9 = (List) obj2;
                            Object obj27 = list9.get(0);
                            t6.h.c(obj27, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView16 = (WebView) obj27;
                            Object obj28 = list9.get(1);
                            t6.h.c(obj28, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean booleanValue = ((Boolean) obj28).booleanValue();
                            try {
                                c0413i18.getClass();
                                webView16.clearCache(booleanValue);
                                w018 = Y4.D.D(null);
                            } catch (Throwable th17) {
                                w018 = AbstractC0603a.w0(th17);
                            }
                            v02.f(w018);
                            break;
                        case 17:
                            t6.h.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list10 = (List) obj2;
                            Object obj29 = list10.get(0);
                            t6.h.c(obj29, "null cannot be cast to non-null type android.webkit.WebView");
                            Object obj30 = list10.get(1);
                            t6.h.c(obj30, "null cannot be cast to non-null type kotlin.String");
                            B b7 = new B(v02, 1);
                            c0413i.getClass();
                            ((WebView) obj29).evaluateJavascript((String) obj30, new C0416l(1, b7));
                            break;
                        case 18:
                            C0413i c0413i19 = c0413i;
                            t6.h.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj31 = ((List) obj2).get(0);
                            t6.h.c(obj31, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView17 = (WebView) obj31;
                            try {
                                c0413i19.getClass();
                                w019 = Y4.D.D(webView17.getTitle());
                            } catch (Throwable th18) {
                                w019 = AbstractC0603a.w0(th18);
                            }
                            v02.f(w019);
                            break;
                        case 19:
                            C0413i c0413i20 = c0413i;
                            t6.h.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj32 = ((List) obj2).get(0);
                            t6.h.c(obj32, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean booleanValue2 = ((Boolean) obj32).booleanValue();
                            try {
                                c0413i20.getClass();
                                WebView.setWebContentsDebuggingEnabled(booleanValue2);
                                w020 = Y4.D.D(null);
                            } catch (Throwable th19) {
                                w020 = AbstractC0603a.w0(th19);
                            }
                            v02.f(w020);
                            break;
                        case 20:
                            C0413i c0413i21 = c0413i;
                            t6.h.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list11 = (List) obj2;
                            Object obj33 = list11.get(0);
                            t6.h.c(obj33, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView18 = (WebView) obj33;
                            WebViewClient webViewClient = (WebViewClient) list11.get(1);
                            try {
                                c0413i21.getClass();
                                webView18.setWebViewClient(webViewClient);
                                w021 = Y4.D.D(null);
                            } catch (Throwable th20) {
                                w021 = AbstractC0603a.w0(th20);
                            }
                            v02.f(w021);
                            break;
                        case zzbbd.zzt.zzm /* 21 */:
                            C0413i c0413i22 = c0413i;
                            t6.h.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list12 = (List) obj2;
                            Object obj34 = list12.get(0);
                            t6.h.c(obj34, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView19 = (WebView) obj34;
                            Object obj35 = list12.get(1);
                            t6.h.c(obj35, "null cannot be cast to non-null type io.flutter.plugins.webviewflutter.JavaScriptChannel");
                            C0425v c0425v = (C0425v) obj35;
                            try {
                                c0413i22.getClass();
                                webView19.addJavascriptInterface(c0425v, c0425v.f6215a);
                                w022 = Y4.D.D(null);
                            } catch (Throwable th21) {
                                w022 = AbstractC0603a.w0(th21);
                            }
                            v02.f(w022);
                            break;
                        default:
                            C0413i c0413i23 = c0413i;
                            t6.h.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list13 = (List) obj2;
                            Object obj36 = list13.get(0);
                            t6.h.c(obj36, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView20 = (WebView) obj36;
                            Object obj37 = list13.get(1);
                            t6.h.c(obj37, "null cannot be cast to non-null type kotlin.String");
                            String str11 = (String) obj37;
                            try {
                                c0413i23.getClass();
                                webView20.removeJavascriptInterface(str11);
                                w023 = Y4.D.D(null);
                            } catch (Throwable th22) {
                                w023 = AbstractC0603a.w0(th22);
                            }
                            v02.f(w023);
                            break;
                    }
                }
            });
        } else {
            f04.M(null);
        }
        w1.F0 f05 = new w1.F0(fVar, "dev.flutter.pigeon.webview_flutter_android.WebView.loadDataWithBaseUrl", c0406b, obj, 1);
        if (c0413i != null) {
            final int i10 = 7;
            f05.M(new A5.b() { // from class: R5.N
                @Override // A5.b
                public final void i(Object obj2, V0 v02) {
                    List w02;
                    List w03;
                    List w04;
                    List w05;
                    List w06;
                    List w07;
                    List w08;
                    List w09;
                    List w010;
                    List w011;
                    List w012;
                    List w013;
                    List w014;
                    List w015;
                    List w016;
                    List w017;
                    List w018;
                    List w019;
                    List w020;
                    List w021;
                    List w022;
                    List w023;
                    switch (i10) {
                        case 0:
                            C0413i c0413i2 = c0413i;
                            t6.h.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj3 = ((List) obj2).get(0);
                            t6.h.c(obj3, "null cannot be cast to non-null type kotlin.Long");
                            try {
                                ((C0407c) c0413i2.f6174a.f3679c).a(((Long) obj3).longValue(), c0413i2.a());
                                w02 = Y4.D.D(null);
                            } catch (Throwable th) {
                                w02 = AbstractC0603a.w0(th);
                            }
                            v02.f(w02);
                            break;
                        case 1:
                            C0413i c0413i3 = c0413i;
                            t6.h.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list = (List) obj2;
                            Object obj4 = list.get(0);
                            t6.h.c(obj4, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView = (WebView) obj4;
                            DownloadListener downloadListener = (DownloadListener) list.get(1);
                            try {
                                c0413i3.getClass();
                                webView.setDownloadListener(downloadListener);
                                w03 = Y4.D.D(null);
                            } catch (Throwable th2) {
                                w03 = AbstractC0603a.w0(th2);
                            }
                            v02.f(w03);
                            break;
                        case 2:
                            C0413i c0413i4 = c0413i;
                            t6.h.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list2 = (List) obj2;
                            Object obj5 = list2.get(0);
                            t6.h.c(obj5, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView2 = (WebView) obj5;
                            Object obj6 = list2.get(1);
                            t6.h.c(obj6, "null cannot be cast to non-null type kotlin.Long");
                            try {
                                ((C0407c) c0413i4.f6174a.f3679c).a(((Long) obj6).longValue(), webView2.getSettings());
                                w04 = Y4.D.D(null);
                            } catch (Throwable th3) {
                                w04 = AbstractC0603a.w0(th3);
                            }
                            v02.f(w04);
                            break;
                        case 3:
                            C0413i c0413i5 = c0413i;
                            t6.h.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list3 = (List) obj2;
                            Object obj7 = list3.get(0);
                            t6.h.c(obj7, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView3 = (WebView) obj7;
                            Z z4 = (Z) list3.get(1);
                            try {
                                c0413i5.getClass();
                                webView3.setWebChromeClient(z4);
                                w05 = Y4.D.D(null);
                            } catch (Throwable th4) {
                                w05 = AbstractC0603a.w0(th4);
                            }
                            v02.f(w05);
                            break;
                        case 4:
                            C0413i c0413i6 = c0413i;
                            t6.h.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list4 = (List) obj2;
                            Object obj8 = list4.get(0);
                            t6.h.c(obj8, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView4 = (WebView) obj8;
                            Object obj9 = list4.get(1);
                            t6.h.c(obj9, "null cannot be cast to non-null type kotlin.Long");
                            long longValue = ((Long) obj9).longValue();
                            try {
                                c0413i6.getClass();
                                webView4.setBackgroundColor((int) longValue);
                                w06 = Y4.D.D(null);
                            } catch (Throwable th5) {
                                w06 = AbstractC0603a.w0(th5);
                            }
                            v02.f(w06);
                            break;
                        case 5:
                            C0413i c0413i7 = c0413i;
                            t6.h.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj10 = ((List) obj2).get(0);
                            t6.h.c(obj10, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView5 = (WebView) obj10;
                            try {
                                c0413i7.getClass();
                                webView5.destroy();
                                w07 = Y4.D.D(null);
                            } catch (Throwable th6) {
                                w07 = AbstractC0603a.w0(th6);
                            }
                            v02.f(w07);
                            break;
                        case 6:
                            C0413i c0413i8 = c0413i;
                            t6.h.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list5 = (List) obj2;
                            Object obj11 = list5.get(0);
                            t6.h.c(obj11, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView6 = (WebView) obj11;
                            Object obj12 = list5.get(1);
                            t6.h.c(obj12, "null cannot be cast to non-null type kotlin.String");
                            String str = (String) obj12;
                            String str2 = (String) list5.get(2);
                            String str3 = (String) list5.get(3);
                            try {
                                c0413i8.getClass();
                                webView6.loadData(str, str2, str3);
                                w08 = Y4.D.D(null);
                            } catch (Throwable th7) {
                                w08 = AbstractC0603a.w0(th7);
                            }
                            v02.f(w08);
                            break;
                        case 7:
                            C0413i c0413i9 = c0413i;
                            t6.h.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list6 = (List) obj2;
                            Object obj13 = list6.get(0);
                            t6.h.c(obj13, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView7 = (WebView) obj13;
                            String str4 = (String) list6.get(1);
                            Object obj14 = list6.get(2);
                            t6.h.c(obj14, "null cannot be cast to non-null type kotlin.String");
                            String str5 = (String) obj14;
                            String str6 = (String) list6.get(3);
                            String str7 = (String) list6.get(4);
                            String str8 = (String) list6.get(5);
                            try {
                                c0413i9.getClass();
                                webView7.loadDataWithBaseURL(str4, str5, str6, str7, str8);
                                w09 = Y4.D.D(null);
                            } catch (Throwable th8) {
                                w09 = AbstractC0603a.w0(th8);
                            }
                            v02.f(w09);
                            break;
                        case 8:
                            C0413i c0413i10 = c0413i;
                            t6.h.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list7 = (List) obj2;
                            Object obj15 = list7.get(0);
                            t6.h.c(obj15, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView8 = (WebView) obj15;
                            Object obj16 = list7.get(1);
                            t6.h.c(obj16, "null cannot be cast to non-null type kotlin.String");
                            String str9 = (String) obj16;
                            Object obj17 = list7.get(2);
                            t6.h.c(obj17, "null cannot be cast to non-null type kotlin.collections.Map<kotlin.String, kotlin.String>");
                            Map<String, String> map = (Map) obj17;
                            try {
                                c0413i10.getClass();
                                webView8.loadUrl(str9, map);
                                w010 = Y4.D.D(null);
                            } catch (Throwable th9) {
                                w010 = AbstractC0603a.w0(th9);
                            }
                            v02.f(w010);
                            break;
                        case 9:
                            C0413i c0413i11 = c0413i;
                            t6.h.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list8 = (List) obj2;
                            Object obj18 = list8.get(0);
                            t6.h.c(obj18, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView9 = (WebView) obj18;
                            Object obj19 = list8.get(1);
                            t6.h.c(obj19, "null cannot be cast to non-null type kotlin.String");
                            String str10 = (String) obj19;
                            Object obj20 = list8.get(2);
                            t6.h.c(obj20, "null cannot be cast to non-null type kotlin.ByteArray");
                            byte[] bArr = (byte[]) obj20;
                            try {
                                c0413i11.getClass();
                                webView9.postUrl(str10, bArr);
                                w011 = Y4.D.D(null);
                            } catch (Throwable th10) {
                                w011 = AbstractC0603a.w0(th10);
                            }
                            v02.f(w011);
                            break;
                        case 10:
                            C0413i c0413i12 = c0413i;
                            t6.h.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj21 = ((List) obj2).get(0);
                            t6.h.c(obj21, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView10 = (WebView) obj21;
                            try {
                                c0413i12.getClass();
                                w012 = Y4.D.D(webView10.getUrl());
                            } catch (Throwable th11) {
                                w012 = AbstractC0603a.w0(th11);
                            }
                            v02.f(w012);
                            break;
                        case 11:
                            C0413i c0413i13 = c0413i;
                            t6.h.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj22 = ((List) obj2).get(0);
                            t6.h.c(obj22, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView11 = (WebView) obj22;
                            try {
                                c0413i13.getClass();
                                webView11.goForward();
                                w013 = Y4.D.D(null);
                            } catch (Throwable th12) {
                                w013 = AbstractC0603a.w0(th12);
                            }
                            v02.f(w013);
                            break;
                        case 12:
                            C0413i c0413i14 = c0413i;
                            t6.h.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj23 = ((List) obj2).get(0);
                            t6.h.c(obj23, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView12 = (WebView) obj23;
                            try {
                                c0413i14.getClass();
                                w014 = Y4.D.D(Boolean.valueOf(webView12.canGoBack()));
                            } catch (Throwable th13) {
                                w014 = AbstractC0603a.w0(th13);
                            }
                            v02.f(w014);
                            break;
                        case 13:
                            C0413i c0413i15 = c0413i;
                            t6.h.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj24 = ((List) obj2).get(0);
                            t6.h.c(obj24, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView13 = (WebView) obj24;
                            try {
                                c0413i15.getClass();
                                w015 = Y4.D.D(Boolean.valueOf(webView13.canGoForward()));
                            } catch (Throwable th14) {
                                w015 = AbstractC0603a.w0(th14);
                            }
                            v02.f(w015);
                            break;
                        case 14:
                            C0413i c0413i16 = c0413i;
                            t6.h.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj25 = ((List) obj2).get(0);
                            t6.h.c(obj25, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView14 = (WebView) obj25;
                            try {
                                c0413i16.getClass();
                                webView14.goBack();
                                w016 = Y4.D.D(null);
                            } catch (Throwable th15) {
                                w016 = AbstractC0603a.w0(th15);
                            }
                            v02.f(w016);
                            break;
                        case 15:
                            C0413i c0413i17 = c0413i;
                            t6.h.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj26 = ((List) obj2).get(0);
                            t6.h.c(obj26, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView15 = (WebView) obj26;
                            try {
                                c0413i17.getClass();
                                webView15.reload();
                                w017 = Y4.D.D(null);
                            } catch (Throwable th16) {
                                w017 = AbstractC0603a.w0(th16);
                            }
                            v02.f(w017);
                            break;
                        case 16:
                            C0413i c0413i18 = c0413i;
                            t6.h.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list9 = (List) obj2;
                            Object obj27 = list9.get(0);
                            t6.h.c(obj27, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView16 = (WebView) obj27;
                            Object obj28 = list9.get(1);
                            t6.h.c(obj28, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean booleanValue = ((Boolean) obj28).booleanValue();
                            try {
                                c0413i18.getClass();
                                webView16.clearCache(booleanValue);
                                w018 = Y4.D.D(null);
                            } catch (Throwable th17) {
                                w018 = AbstractC0603a.w0(th17);
                            }
                            v02.f(w018);
                            break;
                        case 17:
                            t6.h.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list10 = (List) obj2;
                            Object obj29 = list10.get(0);
                            t6.h.c(obj29, "null cannot be cast to non-null type android.webkit.WebView");
                            Object obj30 = list10.get(1);
                            t6.h.c(obj30, "null cannot be cast to non-null type kotlin.String");
                            B b7 = new B(v02, 1);
                            c0413i.getClass();
                            ((WebView) obj29).evaluateJavascript((String) obj30, new C0416l(1, b7));
                            break;
                        case 18:
                            C0413i c0413i19 = c0413i;
                            t6.h.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj31 = ((List) obj2).get(0);
                            t6.h.c(obj31, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView17 = (WebView) obj31;
                            try {
                                c0413i19.getClass();
                                w019 = Y4.D.D(webView17.getTitle());
                            } catch (Throwable th18) {
                                w019 = AbstractC0603a.w0(th18);
                            }
                            v02.f(w019);
                            break;
                        case 19:
                            C0413i c0413i20 = c0413i;
                            t6.h.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj32 = ((List) obj2).get(0);
                            t6.h.c(obj32, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean booleanValue2 = ((Boolean) obj32).booleanValue();
                            try {
                                c0413i20.getClass();
                                WebView.setWebContentsDebuggingEnabled(booleanValue2);
                                w020 = Y4.D.D(null);
                            } catch (Throwable th19) {
                                w020 = AbstractC0603a.w0(th19);
                            }
                            v02.f(w020);
                            break;
                        case 20:
                            C0413i c0413i21 = c0413i;
                            t6.h.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list11 = (List) obj2;
                            Object obj33 = list11.get(0);
                            t6.h.c(obj33, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView18 = (WebView) obj33;
                            WebViewClient webViewClient = (WebViewClient) list11.get(1);
                            try {
                                c0413i21.getClass();
                                webView18.setWebViewClient(webViewClient);
                                w021 = Y4.D.D(null);
                            } catch (Throwable th20) {
                                w021 = AbstractC0603a.w0(th20);
                            }
                            v02.f(w021);
                            break;
                        case zzbbd.zzt.zzm /* 21 */:
                            C0413i c0413i22 = c0413i;
                            t6.h.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list12 = (List) obj2;
                            Object obj34 = list12.get(0);
                            t6.h.c(obj34, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView19 = (WebView) obj34;
                            Object obj35 = list12.get(1);
                            t6.h.c(obj35, "null cannot be cast to non-null type io.flutter.plugins.webviewflutter.JavaScriptChannel");
                            C0425v c0425v = (C0425v) obj35;
                            try {
                                c0413i22.getClass();
                                webView19.addJavascriptInterface(c0425v, c0425v.f6215a);
                                w022 = Y4.D.D(null);
                            } catch (Throwable th21) {
                                w022 = AbstractC0603a.w0(th21);
                            }
                            v02.f(w022);
                            break;
                        default:
                            C0413i c0413i23 = c0413i;
                            t6.h.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list13 = (List) obj2;
                            Object obj36 = list13.get(0);
                            t6.h.c(obj36, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView20 = (WebView) obj36;
                            Object obj37 = list13.get(1);
                            t6.h.c(obj37, "null cannot be cast to non-null type kotlin.String");
                            String str11 = (String) obj37;
                            try {
                                c0413i23.getClass();
                                webView20.removeJavascriptInterface(str11);
                                w023 = Y4.D.D(null);
                            } catch (Throwable th22) {
                                w023 = AbstractC0603a.w0(th22);
                            }
                            v02.f(w023);
                            break;
                    }
                }
            });
        } else {
            f05.M(null);
        }
        w1.F0 f06 = new w1.F0(fVar, "dev.flutter.pigeon.webview_flutter_android.WebView.loadUrl", c0406b, obj, 1);
        if (c0413i != null) {
            final int i11 = 8;
            f06.M(new A5.b() { // from class: R5.N
                @Override // A5.b
                public final void i(Object obj2, V0 v02) {
                    List w02;
                    List w03;
                    List w04;
                    List w05;
                    List w06;
                    List w07;
                    List w08;
                    List w09;
                    List w010;
                    List w011;
                    List w012;
                    List w013;
                    List w014;
                    List w015;
                    List w016;
                    List w017;
                    List w018;
                    List w019;
                    List w020;
                    List w021;
                    List w022;
                    List w023;
                    switch (i11) {
                        case 0:
                            C0413i c0413i2 = c0413i;
                            t6.h.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj3 = ((List) obj2).get(0);
                            t6.h.c(obj3, "null cannot be cast to non-null type kotlin.Long");
                            try {
                                ((C0407c) c0413i2.f6174a.f3679c).a(((Long) obj3).longValue(), c0413i2.a());
                                w02 = Y4.D.D(null);
                            } catch (Throwable th) {
                                w02 = AbstractC0603a.w0(th);
                            }
                            v02.f(w02);
                            break;
                        case 1:
                            C0413i c0413i3 = c0413i;
                            t6.h.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list = (List) obj2;
                            Object obj4 = list.get(0);
                            t6.h.c(obj4, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView = (WebView) obj4;
                            DownloadListener downloadListener = (DownloadListener) list.get(1);
                            try {
                                c0413i3.getClass();
                                webView.setDownloadListener(downloadListener);
                                w03 = Y4.D.D(null);
                            } catch (Throwable th2) {
                                w03 = AbstractC0603a.w0(th2);
                            }
                            v02.f(w03);
                            break;
                        case 2:
                            C0413i c0413i4 = c0413i;
                            t6.h.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list2 = (List) obj2;
                            Object obj5 = list2.get(0);
                            t6.h.c(obj5, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView2 = (WebView) obj5;
                            Object obj6 = list2.get(1);
                            t6.h.c(obj6, "null cannot be cast to non-null type kotlin.Long");
                            try {
                                ((C0407c) c0413i4.f6174a.f3679c).a(((Long) obj6).longValue(), webView2.getSettings());
                                w04 = Y4.D.D(null);
                            } catch (Throwable th3) {
                                w04 = AbstractC0603a.w0(th3);
                            }
                            v02.f(w04);
                            break;
                        case 3:
                            C0413i c0413i5 = c0413i;
                            t6.h.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list3 = (List) obj2;
                            Object obj7 = list3.get(0);
                            t6.h.c(obj7, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView3 = (WebView) obj7;
                            Z z4 = (Z) list3.get(1);
                            try {
                                c0413i5.getClass();
                                webView3.setWebChromeClient(z4);
                                w05 = Y4.D.D(null);
                            } catch (Throwable th4) {
                                w05 = AbstractC0603a.w0(th4);
                            }
                            v02.f(w05);
                            break;
                        case 4:
                            C0413i c0413i6 = c0413i;
                            t6.h.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list4 = (List) obj2;
                            Object obj8 = list4.get(0);
                            t6.h.c(obj8, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView4 = (WebView) obj8;
                            Object obj9 = list4.get(1);
                            t6.h.c(obj9, "null cannot be cast to non-null type kotlin.Long");
                            long longValue = ((Long) obj9).longValue();
                            try {
                                c0413i6.getClass();
                                webView4.setBackgroundColor((int) longValue);
                                w06 = Y4.D.D(null);
                            } catch (Throwable th5) {
                                w06 = AbstractC0603a.w0(th5);
                            }
                            v02.f(w06);
                            break;
                        case 5:
                            C0413i c0413i7 = c0413i;
                            t6.h.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj10 = ((List) obj2).get(0);
                            t6.h.c(obj10, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView5 = (WebView) obj10;
                            try {
                                c0413i7.getClass();
                                webView5.destroy();
                                w07 = Y4.D.D(null);
                            } catch (Throwable th6) {
                                w07 = AbstractC0603a.w0(th6);
                            }
                            v02.f(w07);
                            break;
                        case 6:
                            C0413i c0413i8 = c0413i;
                            t6.h.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list5 = (List) obj2;
                            Object obj11 = list5.get(0);
                            t6.h.c(obj11, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView6 = (WebView) obj11;
                            Object obj12 = list5.get(1);
                            t6.h.c(obj12, "null cannot be cast to non-null type kotlin.String");
                            String str = (String) obj12;
                            String str2 = (String) list5.get(2);
                            String str3 = (String) list5.get(3);
                            try {
                                c0413i8.getClass();
                                webView6.loadData(str, str2, str3);
                                w08 = Y4.D.D(null);
                            } catch (Throwable th7) {
                                w08 = AbstractC0603a.w0(th7);
                            }
                            v02.f(w08);
                            break;
                        case 7:
                            C0413i c0413i9 = c0413i;
                            t6.h.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list6 = (List) obj2;
                            Object obj13 = list6.get(0);
                            t6.h.c(obj13, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView7 = (WebView) obj13;
                            String str4 = (String) list6.get(1);
                            Object obj14 = list6.get(2);
                            t6.h.c(obj14, "null cannot be cast to non-null type kotlin.String");
                            String str5 = (String) obj14;
                            String str6 = (String) list6.get(3);
                            String str7 = (String) list6.get(4);
                            String str8 = (String) list6.get(5);
                            try {
                                c0413i9.getClass();
                                webView7.loadDataWithBaseURL(str4, str5, str6, str7, str8);
                                w09 = Y4.D.D(null);
                            } catch (Throwable th8) {
                                w09 = AbstractC0603a.w0(th8);
                            }
                            v02.f(w09);
                            break;
                        case 8:
                            C0413i c0413i10 = c0413i;
                            t6.h.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list7 = (List) obj2;
                            Object obj15 = list7.get(0);
                            t6.h.c(obj15, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView8 = (WebView) obj15;
                            Object obj16 = list7.get(1);
                            t6.h.c(obj16, "null cannot be cast to non-null type kotlin.String");
                            String str9 = (String) obj16;
                            Object obj17 = list7.get(2);
                            t6.h.c(obj17, "null cannot be cast to non-null type kotlin.collections.Map<kotlin.String, kotlin.String>");
                            Map<String, String> map = (Map) obj17;
                            try {
                                c0413i10.getClass();
                                webView8.loadUrl(str9, map);
                                w010 = Y4.D.D(null);
                            } catch (Throwable th9) {
                                w010 = AbstractC0603a.w0(th9);
                            }
                            v02.f(w010);
                            break;
                        case 9:
                            C0413i c0413i11 = c0413i;
                            t6.h.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list8 = (List) obj2;
                            Object obj18 = list8.get(0);
                            t6.h.c(obj18, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView9 = (WebView) obj18;
                            Object obj19 = list8.get(1);
                            t6.h.c(obj19, "null cannot be cast to non-null type kotlin.String");
                            String str10 = (String) obj19;
                            Object obj20 = list8.get(2);
                            t6.h.c(obj20, "null cannot be cast to non-null type kotlin.ByteArray");
                            byte[] bArr = (byte[]) obj20;
                            try {
                                c0413i11.getClass();
                                webView9.postUrl(str10, bArr);
                                w011 = Y4.D.D(null);
                            } catch (Throwable th10) {
                                w011 = AbstractC0603a.w0(th10);
                            }
                            v02.f(w011);
                            break;
                        case 10:
                            C0413i c0413i12 = c0413i;
                            t6.h.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj21 = ((List) obj2).get(0);
                            t6.h.c(obj21, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView10 = (WebView) obj21;
                            try {
                                c0413i12.getClass();
                                w012 = Y4.D.D(webView10.getUrl());
                            } catch (Throwable th11) {
                                w012 = AbstractC0603a.w0(th11);
                            }
                            v02.f(w012);
                            break;
                        case 11:
                            C0413i c0413i13 = c0413i;
                            t6.h.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj22 = ((List) obj2).get(0);
                            t6.h.c(obj22, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView11 = (WebView) obj22;
                            try {
                                c0413i13.getClass();
                                webView11.goForward();
                                w013 = Y4.D.D(null);
                            } catch (Throwable th12) {
                                w013 = AbstractC0603a.w0(th12);
                            }
                            v02.f(w013);
                            break;
                        case 12:
                            C0413i c0413i14 = c0413i;
                            t6.h.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj23 = ((List) obj2).get(0);
                            t6.h.c(obj23, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView12 = (WebView) obj23;
                            try {
                                c0413i14.getClass();
                                w014 = Y4.D.D(Boolean.valueOf(webView12.canGoBack()));
                            } catch (Throwable th13) {
                                w014 = AbstractC0603a.w0(th13);
                            }
                            v02.f(w014);
                            break;
                        case 13:
                            C0413i c0413i15 = c0413i;
                            t6.h.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj24 = ((List) obj2).get(0);
                            t6.h.c(obj24, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView13 = (WebView) obj24;
                            try {
                                c0413i15.getClass();
                                w015 = Y4.D.D(Boolean.valueOf(webView13.canGoForward()));
                            } catch (Throwable th14) {
                                w015 = AbstractC0603a.w0(th14);
                            }
                            v02.f(w015);
                            break;
                        case 14:
                            C0413i c0413i16 = c0413i;
                            t6.h.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj25 = ((List) obj2).get(0);
                            t6.h.c(obj25, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView14 = (WebView) obj25;
                            try {
                                c0413i16.getClass();
                                webView14.goBack();
                                w016 = Y4.D.D(null);
                            } catch (Throwable th15) {
                                w016 = AbstractC0603a.w0(th15);
                            }
                            v02.f(w016);
                            break;
                        case 15:
                            C0413i c0413i17 = c0413i;
                            t6.h.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj26 = ((List) obj2).get(0);
                            t6.h.c(obj26, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView15 = (WebView) obj26;
                            try {
                                c0413i17.getClass();
                                webView15.reload();
                                w017 = Y4.D.D(null);
                            } catch (Throwable th16) {
                                w017 = AbstractC0603a.w0(th16);
                            }
                            v02.f(w017);
                            break;
                        case 16:
                            C0413i c0413i18 = c0413i;
                            t6.h.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list9 = (List) obj2;
                            Object obj27 = list9.get(0);
                            t6.h.c(obj27, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView16 = (WebView) obj27;
                            Object obj28 = list9.get(1);
                            t6.h.c(obj28, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean booleanValue = ((Boolean) obj28).booleanValue();
                            try {
                                c0413i18.getClass();
                                webView16.clearCache(booleanValue);
                                w018 = Y4.D.D(null);
                            } catch (Throwable th17) {
                                w018 = AbstractC0603a.w0(th17);
                            }
                            v02.f(w018);
                            break;
                        case 17:
                            t6.h.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list10 = (List) obj2;
                            Object obj29 = list10.get(0);
                            t6.h.c(obj29, "null cannot be cast to non-null type android.webkit.WebView");
                            Object obj30 = list10.get(1);
                            t6.h.c(obj30, "null cannot be cast to non-null type kotlin.String");
                            B b7 = new B(v02, 1);
                            c0413i.getClass();
                            ((WebView) obj29).evaluateJavascript((String) obj30, new C0416l(1, b7));
                            break;
                        case 18:
                            C0413i c0413i19 = c0413i;
                            t6.h.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj31 = ((List) obj2).get(0);
                            t6.h.c(obj31, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView17 = (WebView) obj31;
                            try {
                                c0413i19.getClass();
                                w019 = Y4.D.D(webView17.getTitle());
                            } catch (Throwable th18) {
                                w019 = AbstractC0603a.w0(th18);
                            }
                            v02.f(w019);
                            break;
                        case 19:
                            C0413i c0413i20 = c0413i;
                            t6.h.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj32 = ((List) obj2).get(0);
                            t6.h.c(obj32, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean booleanValue2 = ((Boolean) obj32).booleanValue();
                            try {
                                c0413i20.getClass();
                                WebView.setWebContentsDebuggingEnabled(booleanValue2);
                                w020 = Y4.D.D(null);
                            } catch (Throwable th19) {
                                w020 = AbstractC0603a.w0(th19);
                            }
                            v02.f(w020);
                            break;
                        case 20:
                            C0413i c0413i21 = c0413i;
                            t6.h.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list11 = (List) obj2;
                            Object obj33 = list11.get(0);
                            t6.h.c(obj33, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView18 = (WebView) obj33;
                            WebViewClient webViewClient = (WebViewClient) list11.get(1);
                            try {
                                c0413i21.getClass();
                                webView18.setWebViewClient(webViewClient);
                                w021 = Y4.D.D(null);
                            } catch (Throwable th20) {
                                w021 = AbstractC0603a.w0(th20);
                            }
                            v02.f(w021);
                            break;
                        case zzbbd.zzt.zzm /* 21 */:
                            C0413i c0413i22 = c0413i;
                            t6.h.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list12 = (List) obj2;
                            Object obj34 = list12.get(0);
                            t6.h.c(obj34, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView19 = (WebView) obj34;
                            Object obj35 = list12.get(1);
                            t6.h.c(obj35, "null cannot be cast to non-null type io.flutter.plugins.webviewflutter.JavaScriptChannel");
                            C0425v c0425v = (C0425v) obj35;
                            try {
                                c0413i22.getClass();
                                webView19.addJavascriptInterface(c0425v, c0425v.f6215a);
                                w022 = Y4.D.D(null);
                            } catch (Throwable th21) {
                                w022 = AbstractC0603a.w0(th21);
                            }
                            v02.f(w022);
                            break;
                        default:
                            C0413i c0413i23 = c0413i;
                            t6.h.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list13 = (List) obj2;
                            Object obj36 = list13.get(0);
                            t6.h.c(obj36, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView20 = (WebView) obj36;
                            Object obj37 = list13.get(1);
                            t6.h.c(obj37, "null cannot be cast to non-null type kotlin.String");
                            String str11 = (String) obj37;
                            try {
                                c0413i23.getClass();
                                webView20.removeJavascriptInterface(str11);
                                w023 = Y4.D.D(null);
                            } catch (Throwable th22) {
                                w023 = AbstractC0603a.w0(th22);
                            }
                            v02.f(w023);
                            break;
                    }
                }
            });
        } else {
            f06.M(null);
        }
        w1.F0 f07 = new w1.F0(fVar, "dev.flutter.pigeon.webview_flutter_android.WebView.postUrl", c0406b, obj, 1);
        if (c0413i != null) {
            final int i12 = 9;
            f07.M(new A5.b() { // from class: R5.N
                @Override // A5.b
                public final void i(Object obj2, V0 v02) {
                    List w02;
                    List w03;
                    List w04;
                    List w05;
                    List w06;
                    List w07;
                    List w08;
                    List w09;
                    List w010;
                    List w011;
                    List w012;
                    List w013;
                    List w014;
                    List w015;
                    List w016;
                    List w017;
                    List w018;
                    List w019;
                    List w020;
                    List w021;
                    List w022;
                    List w023;
                    switch (i12) {
                        case 0:
                            C0413i c0413i2 = c0413i;
                            t6.h.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj3 = ((List) obj2).get(0);
                            t6.h.c(obj3, "null cannot be cast to non-null type kotlin.Long");
                            try {
                                ((C0407c) c0413i2.f6174a.f3679c).a(((Long) obj3).longValue(), c0413i2.a());
                                w02 = Y4.D.D(null);
                            } catch (Throwable th) {
                                w02 = AbstractC0603a.w0(th);
                            }
                            v02.f(w02);
                            break;
                        case 1:
                            C0413i c0413i3 = c0413i;
                            t6.h.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list = (List) obj2;
                            Object obj4 = list.get(0);
                            t6.h.c(obj4, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView = (WebView) obj4;
                            DownloadListener downloadListener = (DownloadListener) list.get(1);
                            try {
                                c0413i3.getClass();
                                webView.setDownloadListener(downloadListener);
                                w03 = Y4.D.D(null);
                            } catch (Throwable th2) {
                                w03 = AbstractC0603a.w0(th2);
                            }
                            v02.f(w03);
                            break;
                        case 2:
                            C0413i c0413i4 = c0413i;
                            t6.h.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list2 = (List) obj2;
                            Object obj5 = list2.get(0);
                            t6.h.c(obj5, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView2 = (WebView) obj5;
                            Object obj6 = list2.get(1);
                            t6.h.c(obj6, "null cannot be cast to non-null type kotlin.Long");
                            try {
                                ((C0407c) c0413i4.f6174a.f3679c).a(((Long) obj6).longValue(), webView2.getSettings());
                                w04 = Y4.D.D(null);
                            } catch (Throwable th3) {
                                w04 = AbstractC0603a.w0(th3);
                            }
                            v02.f(w04);
                            break;
                        case 3:
                            C0413i c0413i5 = c0413i;
                            t6.h.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list3 = (List) obj2;
                            Object obj7 = list3.get(0);
                            t6.h.c(obj7, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView3 = (WebView) obj7;
                            Z z4 = (Z) list3.get(1);
                            try {
                                c0413i5.getClass();
                                webView3.setWebChromeClient(z4);
                                w05 = Y4.D.D(null);
                            } catch (Throwable th4) {
                                w05 = AbstractC0603a.w0(th4);
                            }
                            v02.f(w05);
                            break;
                        case 4:
                            C0413i c0413i6 = c0413i;
                            t6.h.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list4 = (List) obj2;
                            Object obj8 = list4.get(0);
                            t6.h.c(obj8, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView4 = (WebView) obj8;
                            Object obj9 = list4.get(1);
                            t6.h.c(obj9, "null cannot be cast to non-null type kotlin.Long");
                            long longValue = ((Long) obj9).longValue();
                            try {
                                c0413i6.getClass();
                                webView4.setBackgroundColor((int) longValue);
                                w06 = Y4.D.D(null);
                            } catch (Throwable th5) {
                                w06 = AbstractC0603a.w0(th5);
                            }
                            v02.f(w06);
                            break;
                        case 5:
                            C0413i c0413i7 = c0413i;
                            t6.h.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj10 = ((List) obj2).get(0);
                            t6.h.c(obj10, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView5 = (WebView) obj10;
                            try {
                                c0413i7.getClass();
                                webView5.destroy();
                                w07 = Y4.D.D(null);
                            } catch (Throwable th6) {
                                w07 = AbstractC0603a.w0(th6);
                            }
                            v02.f(w07);
                            break;
                        case 6:
                            C0413i c0413i8 = c0413i;
                            t6.h.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list5 = (List) obj2;
                            Object obj11 = list5.get(0);
                            t6.h.c(obj11, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView6 = (WebView) obj11;
                            Object obj12 = list5.get(1);
                            t6.h.c(obj12, "null cannot be cast to non-null type kotlin.String");
                            String str = (String) obj12;
                            String str2 = (String) list5.get(2);
                            String str3 = (String) list5.get(3);
                            try {
                                c0413i8.getClass();
                                webView6.loadData(str, str2, str3);
                                w08 = Y4.D.D(null);
                            } catch (Throwable th7) {
                                w08 = AbstractC0603a.w0(th7);
                            }
                            v02.f(w08);
                            break;
                        case 7:
                            C0413i c0413i9 = c0413i;
                            t6.h.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list6 = (List) obj2;
                            Object obj13 = list6.get(0);
                            t6.h.c(obj13, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView7 = (WebView) obj13;
                            String str4 = (String) list6.get(1);
                            Object obj14 = list6.get(2);
                            t6.h.c(obj14, "null cannot be cast to non-null type kotlin.String");
                            String str5 = (String) obj14;
                            String str6 = (String) list6.get(3);
                            String str7 = (String) list6.get(4);
                            String str8 = (String) list6.get(5);
                            try {
                                c0413i9.getClass();
                                webView7.loadDataWithBaseURL(str4, str5, str6, str7, str8);
                                w09 = Y4.D.D(null);
                            } catch (Throwable th8) {
                                w09 = AbstractC0603a.w0(th8);
                            }
                            v02.f(w09);
                            break;
                        case 8:
                            C0413i c0413i10 = c0413i;
                            t6.h.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list7 = (List) obj2;
                            Object obj15 = list7.get(0);
                            t6.h.c(obj15, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView8 = (WebView) obj15;
                            Object obj16 = list7.get(1);
                            t6.h.c(obj16, "null cannot be cast to non-null type kotlin.String");
                            String str9 = (String) obj16;
                            Object obj17 = list7.get(2);
                            t6.h.c(obj17, "null cannot be cast to non-null type kotlin.collections.Map<kotlin.String, kotlin.String>");
                            Map<String, String> map = (Map) obj17;
                            try {
                                c0413i10.getClass();
                                webView8.loadUrl(str9, map);
                                w010 = Y4.D.D(null);
                            } catch (Throwable th9) {
                                w010 = AbstractC0603a.w0(th9);
                            }
                            v02.f(w010);
                            break;
                        case 9:
                            C0413i c0413i11 = c0413i;
                            t6.h.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list8 = (List) obj2;
                            Object obj18 = list8.get(0);
                            t6.h.c(obj18, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView9 = (WebView) obj18;
                            Object obj19 = list8.get(1);
                            t6.h.c(obj19, "null cannot be cast to non-null type kotlin.String");
                            String str10 = (String) obj19;
                            Object obj20 = list8.get(2);
                            t6.h.c(obj20, "null cannot be cast to non-null type kotlin.ByteArray");
                            byte[] bArr = (byte[]) obj20;
                            try {
                                c0413i11.getClass();
                                webView9.postUrl(str10, bArr);
                                w011 = Y4.D.D(null);
                            } catch (Throwable th10) {
                                w011 = AbstractC0603a.w0(th10);
                            }
                            v02.f(w011);
                            break;
                        case 10:
                            C0413i c0413i12 = c0413i;
                            t6.h.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj21 = ((List) obj2).get(0);
                            t6.h.c(obj21, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView10 = (WebView) obj21;
                            try {
                                c0413i12.getClass();
                                w012 = Y4.D.D(webView10.getUrl());
                            } catch (Throwable th11) {
                                w012 = AbstractC0603a.w0(th11);
                            }
                            v02.f(w012);
                            break;
                        case 11:
                            C0413i c0413i13 = c0413i;
                            t6.h.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj22 = ((List) obj2).get(0);
                            t6.h.c(obj22, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView11 = (WebView) obj22;
                            try {
                                c0413i13.getClass();
                                webView11.goForward();
                                w013 = Y4.D.D(null);
                            } catch (Throwable th12) {
                                w013 = AbstractC0603a.w0(th12);
                            }
                            v02.f(w013);
                            break;
                        case 12:
                            C0413i c0413i14 = c0413i;
                            t6.h.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj23 = ((List) obj2).get(0);
                            t6.h.c(obj23, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView12 = (WebView) obj23;
                            try {
                                c0413i14.getClass();
                                w014 = Y4.D.D(Boolean.valueOf(webView12.canGoBack()));
                            } catch (Throwable th13) {
                                w014 = AbstractC0603a.w0(th13);
                            }
                            v02.f(w014);
                            break;
                        case 13:
                            C0413i c0413i15 = c0413i;
                            t6.h.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj24 = ((List) obj2).get(0);
                            t6.h.c(obj24, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView13 = (WebView) obj24;
                            try {
                                c0413i15.getClass();
                                w015 = Y4.D.D(Boolean.valueOf(webView13.canGoForward()));
                            } catch (Throwable th14) {
                                w015 = AbstractC0603a.w0(th14);
                            }
                            v02.f(w015);
                            break;
                        case 14:
                            C0413i c0413i16 = c0413i;
                            t6.h.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj25 = ((List) obj2).get(0);
                            t6.h.c(obj25, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView14 = (WebView) obj25;
                            try {
                                c0413i16.getClass();
                                webView14.goBack();
                                w016 = Y4.D.D(null);
                            } catch (Throwable th15) {
                                w016 = AbstractC0603a.w0(th15);
                            }
                            v02.f(w016);
                            break;
                        case 15:
                            C0413i c0413i17 = c0413i;
                            t6.h.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj26 = ((List) obj2).get(0);
                            t6.h.c(obj26, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView15 = (WebView) obj26;
                            try {
                                c0413i17.getClass();
                                webView15.reload();
                                w017 = Y4.D.D(null);
                            } catch (Throwable th16) {
                                w017 = AbstractC0603a.w0(th16);
                            }
                            v02.f(w017);
                            break;
                        case 16:
                            C0413i c0413i18 = c0413i;
                            t6.h.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list9 = (List) obj2;
                            Object obj27 = list9.get(0);
                            t6.h.c(obj27, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView16 = (WebView) obj27;
                            Object obj28 = list9.get(1);
                            t6.h.c(obj28, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean booleanValue = ((Boolean) obj28).booleanValue();
                            try {
                                c0413i18.getClass();
                                webView16.clearCache(booleanValue);
                                w018 = Y4.D.D(null);
                            } catch (Throwable th17) {
                                w018 = AbstractC0603a.w0(th17);
                            }
                            v02.f(w018);
                            break;
                        case 17:
                            t6.h.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list10 = (List) obj2;
                            Object obj29 = list10.get(0);
                            t6.h.c(obj29, "null cannot be cast to non-null type android.webkit.WebView");
                            Object obj30 = list10.get(1);
                            t6.h.c(obj30, "null cannot be cast to non-null type kotlin.String");
                            B b7 = new B(v02, 1);
                            c0413i.getClass();
                            ((WebView) obj29).evaluateJavascript((String) obj30, new C0416l(1, b7));
                            break;
                        case 18:
                            C0413i c0413i19 = c0413i;
                            t6.h.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj31 = ((List) obj2).get(0);
                            t6.h.c(obj31, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView17 = (WebView) obj31;
                            try {
                                c0413i19.getClass();
                                w019 = Y4.D.D(webView17.getTitle());
                            } catch (Throwable th18) {
                                w019 = AbstractC0603a.w0(th18);
                            }
                            v02.f(w019);
                            break;
                        case 19:
                            C0413i c0413i20 = c0413i;
                            t6.h.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj32 = ((List) obj2).get(0);
                            t6.h.c(obj32, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean booleanValue2 = ((Boolean) obj32).booleanValue();
                            try {
                                c0413i20.getClass();
                                WebView.setWebContentsDebuggingEnabled(booleanValue2);
                                w020 = Y4.D.D(null);
                            } catch (Throwable th19) {
                                w020 = AbstractC0603a.w0(th19);
                            }
                            v02.f(w020);
                            break;
                        case 20:
                            C0413i c0413i21 = c0413i;
                            t6.h.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list11 = (List) obj2;
                            Object obj33 = list11.get(0);
                            t6.h.c(obj33, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView18 = (WebView) obj33;
                            WebViewClient webViewClient = (WebViewClient) list11.get(1);
                            try {
                                c0413i21.getClass();
                                webView18.setWebViewClient(webViewClient);
                                w021 = Y4.D.D(null);
                            } catch (Throwable th20) {
                                w021 = AbstractC0603a.w0(th20);
                            }
                            v02.f(w021);
                            break;
                        case zzbbd.zzt.zzm /* 21 */:
                            C0413i c0413i22 = c0413i;
                            t6.h.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list12 = (List) obj2;
                            Object obj34 = list12.get(0);
                            t6.h.c(obj34, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView19 = (WebView) obj34;
                            Object obj35 = list12.get(1);
                            t6.h.c(obj35, "null cannot be cast to non-null type io.flutter.plugins.webviewflutter.JavaScriptChannel");
                            C0425v c0425v = (C0425v) obj35;
                            try {
                                c0413i22.getClass();
                                webView19.addJavascriptInterface(c0425v, c0425v.f6215a);
                                w022 = Y4.D.D(null);
                            } catch (Throwable th21) {
                                w022 = AbstractC0603a.w0(th21);
                            }
                            v02.f(w022);
                            break;
                        default:
                            C0413i c0413i23 = c0413i;
                            t6.h.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list13 = (List) obj2;
                            Object obj36 = list13.get(0);
                            t6.h.c(obj36, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView20 = (WebView) obj36;
                            Object obj37 = list13.get(1);
                            t6.h.c(obj37, "null cannot be cast to non-null type kotlin.String");
                            String str11 = (String) obj37;
                            try {
                                c0413i23.getClass();
                                webView20.removeJavascriptInterface(str11);
                                w023 = Y4.D.D(null);
                            } catch (Throwable th22) {
                                w023 = AbstractC0603a.w0(th22);
                            }
                            v02.f(w023);
                            break;
                    }
                }
            });
        } else {
            f07.M(null);
        }
        w1.F0 f08 = new w1.F0(fVar, "dev.flutter.pigeon.webview_flutter_android.WebView.getUrl", c0406b, obj, 1);
        if (c0413i != null) {
            final int i13 = 10;
            f08.M(new A5.b() { // from class: R5.N
                @Override // A5.b
                public final void i(Object obj2, V0 v02) {
                    List w02;
                    List w03;
                    List w04;
                    List w05;
                    List w06;
                    List w07;
                    List w08;
                    List w09;
                    List w010;
                    List w011;
                    List w012;
                    List w013;
                    List w014;
                    List w015;
                    List w016;
                    List w017;
                    List w018;
                    List w019;
                    List w020;
                    List w021;
                    List w022;
                    List w023;
                    switch (i13) {
                        case 0:
                            C0413i c0413i2 = c0413i;
                            t6.h.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj3 = ((List) obj2).get(0);
                            t6.h.c(obj3, "null cannot be cast to non-null type kotlin.Long");
                            try {
                                ((C0407c) c0413i2.f6174a.f3679c).a(((Long) obj3).longValue(), c0413i2.a());
                                w02 = Y4.D.D(null);
                            } catch (Throwable th) {
                                w02 = AbstractC0603a.w0(th);
                            }
                            v02.f(w02);
                            break;
                        case 1:
                            C0413i c0413i3 = c0413i;
                            t6.h.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list = (List) obj2;
                            Object obj4 = list.get(0);
                            t6.h.c(obj4, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView = (WebView) obj4;
                            DownloadListener downloadListener = (DownloadListener) list.get(1);
                            try {
                                c0413i3.getClass();
                                webView.setDownloadListener(downloadListener);
                                w03 = Y4.D.D(null);
                            } catch (Throwable th2) {
                                w03 = AbstractC0603a.w0(th2);
                            }
                            v02.f(w03);
                            break;
                        case 2:
                            C0413i c0413i4 = c0413i;
                            t6.h.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list2 = (List) obj2;
                            Object obj5 = list2.get(0);
                            t6.h.c(obj5, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView2 = (WebView) obj5;
                            Object obj6 = list2.get(1);
                            t6.h.c(obj6, "null cannot be cast to non-null type kotlin.Long");
                            try {
                                ((C0407c) c0413i4.f6174a.f3679c).a(((Long) obj6).longValue(), webView2.getSettings());
                                w04 = Y4.D.D(null);
                            } catch (Throwable th3) {
                                w04 = AbstractC0603a.w0(th3);
                            }
                            v02.f(w04);
                            break;
                        case 3:
                            C0413i c0413i5 = c0413i;
                            t6.h.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list3 = (List) obj2;
                            Object obj7 = list3.get(0);
                            t6.h.c(obj7, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView3 = (WebView) obj7;
                            Z z4 = (Z) list3.get(1);
                            try {
                                c0413i5.getClass();
                                webView3.setWebChromeClient(z4);
                                w05 = Y4.D.D(null);
                            } catch (Throwable th4) {
                                w05 = AbstractC0603a.w0(th4);
                            }
                            v02.f(w05);
                            break;
                        case 4:
                            C0413i c0413i6 = c0413i;
                            t6.h.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list4 = (List) obj2;
                            Object obj8 = list4.get(0);
                            t6.h.c(obj8, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView4 = (WebView) obj8;
                            Object obj9 = list4.get(1);
                            t6.h.c(obj9, "null cannot be cast to non-null type kotlin.Long");
                            long longValue = ((Long) obj9).longValue();
                            try {
                                c0413i6.getClass();
                                webView4.setBackgroundColor((int) longValue);
                                w06 = Y4.D.D(null);
                            } catch (Throwable th5) {
                                w06 = AbstractC0603a.w0(th5);
                            }
                            v02.f(w06);
                            break;
                        case 5:
                            C0413i c0413i7 = c0413i;
                            t6.h.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj10 = ((List) obj2).get(0);
                            t6.h.c(obj10, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView5 = (WebView) obj10;
                            try {
                                c0413i7.getClass();
                                webView5.destroy();
                                w07 = Y4.D.D(null);
                            } catch (Throwable th6) {
                                w07 = AbstractC0603a.w0(th6);
                            }
                            v02.f(w07);
                            break;
                        case 6:
                            C0413i c0413i8 = c0413i;
                            t6.h.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list5 = (List) obj2;
                            Object obj11 = list5.get(0);
                            t6.h.c(obj11, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView6 = (WebView) obj11;
                            Object obj12 = list5.get(1);
                            t6.h.c(obj12, "null cannot be cast to non-null type kotlin.String");
                            String str = (String) obj12;
                            String str2 = (String) list5.get(2);
                            String str3 = (String) list5.get(3);
                            try {
                                c0413i8.getClass();
                                webView6.loadData(str, str2, str3);
                                w08 = Y4.D.D(null);
                            } catch (Throwable th7) {
                                w08 = AbstractC0603a.w0(th7);
                            }
                            v02.f(w08);
                            break;
                        case 7:
                            C0413i c0413i9 = c0413i;
                            t6.h.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list6 = (List) obj2;
                            Object obj13 = list6.get(0);
                            t6.h.c(obj13, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView7 = (WebView) obj13;
                            String str4 = (String) list6.get(1);
                            Object obj14 = list6.get(2);
                            t6.h.c(obj14, "null cannot be cast to non-null type kotlin.String");
                            String str5 = (String) obj14;
                            String str6 = (String) list6.get(3);
                            String str7 = (String) list6.get(4);
                            String str8 = (String) list6.get(5);
                            try {
                                c0413i9.getClass();
                                webView7.loadDataWithBaseURL(str4, str5, str6, str7, str8);
                                w09 = Y4.D.D(null);
                            } catch (Throwable th8) {
                                w09 = AbstractC0603a.w0(th8);
                            }
                            v02.f(w09);
                            break;
                        case 8:
                            C0413i c0413i10 = c0413i;
                            t6.h.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list7 = (List) obj2;
                            Object obj15 = list7.get(0);
                            t6.h.c(obj15, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView8 = (WebView) obj15;
                            Object obj16 = list7.get(1);
                            t6.h.c(obj16, "null cannot be cast to non-null type kotlin.String");
                            String str9 = (String) obj16;
                            Object obj17 = list7.get(2);
                            t6.h.c(obj17, "null cannot be cast to non-null type kotlin.collections.Map<kotlin.String, kotlin.String>");
                            Map<String, String> map = (Map) obj17;
                            try {
                                c0413i10.getClass();
                                webView8.loadUrl(str9, map);
                                w010 = Y4.D.D(null);
                            } catch (Throwable th9) {
                                w010 = AbstractC0603a.w0(th9);
                            }
                            v02.f(w010);
                            break;
                        case 9:
                            C0413i c0413i11 = c0413i;
                            t6.h.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list8 = (List) obj2;
                            Object obj18 = list8.get(0);
                            t6.h.c(obj18, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView9 = (WebView) obj18;
                            Object obj19 = list8.get(1);
                            t6.h.c(obj19, "null cannot be cast to non-null type kotlin.String");
                            String str10 = (String) obj19;
                            Object obj20 = list8.get(2);
                            t6.h.c(obj20, "null cannot be cast to non-null type kotlin.ByteArray");
                            byte[] bArr = (byte[]) obj20;
                            try {
                                c0413i11.getClass();
                                webView9.postUrl(str10, bArr);
                                w011 = Y4.D.D(null);
                            } catch (Throwable th10) {
                                w011 = AbstractC0603a.w0(th10);
                            }
                            v02.f(w011);
                            break;
                        case 10:
                            C0413i c0413i12 = c0413i;
                            t6.h.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj21 = ((List) obj2).get(0);
                            t6.h.c(obj21, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView10 = (WebView) obj21;
                            try {
                                c0413i12.getClass();
                                w012 = Y4.D.D(webView10.getUrl());
                            } catch (Throwable th11) {
                                w012 = AbstractC0603a.w0(th11);
                            }
                            v02.f(w012);
                            break;
                        case 11:
                            C0413i c0413i13 = c0413i;
                            t6.h.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj22 = ((List) obj2).get(0);
                            t6.h.c(obj22, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView11 = (WebView) obj22;
                            try {
                                c0413i13.getClass();
                                webView11.goForward();
                                w013 = Y4.D.D(null);
                            } catch (Throwable th12) {
                                w013 = AbstractC0603a.w0(th12);
                            }
                            v02.f(w013);
                            break;
                        case 12:
                            C0413i c0413i14 = c0413i;
                            t6.h.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj23 = ((List) obj2).get(0);
                            t6.h.c(obj23, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView12 = (WebView) obj23;
                            try {
                                c0413i14.getClass();
                                w014 = Y4.D.D(Boolean.valueOf(webView12.canGoBack()));
                            } catch (Throwable th13) {
                                w014 = AbstractC0603a.w0(th13);
                            }
                            v02.f(w014);
                            break;
                        case 13:
                            C0413i c0413i15 = c0413i;
                            t6.h.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj24 = ((List) obj2).get(0);
                            t6.h.c(obj24, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView13 = (WebView) obj24;
                            try {
                                c0413i15.getClass();
                                w015 = Y4.D.D(Boolean.valueOf(webView13.canGoForward()));
                            } catch (Throwable th14) {
                                w015 = AbstractC0603a.w0(th14);
                            }
                            v02.f(w015);
                            break;
                        case 14:
                            C0413i c0413i16 = c0413i;
                            t6.h.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj25 = ((List) obj2).get(0);
                            t6.h.c(obj25, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView14 = (WebView) obj25;
                            try {
                                c0413i16.getClass();
                                webView14.goBack();
                                w016 = Y4.D.D(null);
                            } catch (Throwable th15) {
                                w016 = AbstractC0603a.w0(th15);
                            }
                            v02.f(w016);
                            break;
                        case 15:
                            C0413i c0413i17 = c0413i;
                            t6.h.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj26 = ((List) obj2).get(0);
                            t6.h.c(obj26, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView15 = (WebView) obj26;
                            try {
                                c0413i17.getClass();
                                webView15.reload();
                                w017 = Y4.D.D(null);
                            } catch (Throwable th16) {
                                w017 = AbstractC0603a.w0(th16);
                            }
                            v02.f(w017);
                            break;
                        case 16:
                            C0413i c0413i18 = c0413i;
                            t6.h.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list9 = (List) obj2;
                            Object obj27 = list9.get(0);
                            t6.h.c(obj27, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView16 = (WebView) obj27;
                            Object obj28 = list9.get(1);
                            t6.h.c(obj28, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean booleanValue = ((Boolean) obj28).booleanValue();
                            try {
                                c0413i18.getClass();
                                webView16.clearCache(booleanValue);
                                w018 = Y4.D.D(null);
                            } catch (Throwable th17) {
                                w018 = AbstractC0603a.w0(th17);
                            }
                            v02.f(w018);
                            break;
                        case 17:
                            t6.h.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list10 = (List) obj2;
                            Object obj29 = list10.get(0);
                            t6.h.c(obj29, "null cannot be cast to non-null type android.webkit.WebView");
                            Object obj30 = list10.get(1);
                            t6.h.c(obj30, "null cannot be cast to non-null type kotlin.String");
                            B b7 = new B(v02, 1);
                            c0413i.getClass();
                            ((WebView) obj29).evaluateJavascript((String) obj30, new C0416l(1, b7));
                            break;
                        case 18:
                            C0413i c0413i19 = c0413i;
                            t6.h.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj31 = ((List) obj2).get(0);
                            t6.h.c(obj31, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView17 = (WebView) obj31;
                            try {
                                c0413i19.getClass();
                                w019 = Y4.D.D(webView17.getTitle());
                            } catch (Throwable th18) {
                                w019 = AbstractC0603a.w0(th18);
                            }
                            v02.f(w019);
                            break;
                        case 19:
                            C0413i c0413i20 = c0413i;
                            t6.h.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj32 = ((List) obj2).get(0);
                            t6.h.c(obj32, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean booleanValue2 = ((Boolean) obj32).booleanValue();
                            try {
                                c0413i20.getClass();
                                WebView.setWebContentsDebuggingEnabled(booleanValue2);
                                w020 = Y4.D.D(null);
                            } catch (Throwable th19) {
                                w020 = AbstractC0603a.w0(th19);
                            }
                            v02.f(w020);
                            break;
                        case 20:
                            C0413i c0413i21 = c0413i;
                            t6.h.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list11 = (List) obj2;
                            Object obj33 = list11.get(0);
                            t6.h.c(obj33, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView18 = (WebView) obj33;
                            WebViewClient webViewClient = (WebViewClient) list11.get(1);
                            try {
                                c0413i21.getClass();
                                webView18.setWebViewClient(webViewClient);
                                w021 = Y4.D.D(null);
                            } catch (Throwable th20) {
                                w021 = AbstractC0603a.w0(th20);
                            }
                            v02.f(w021);
                            break;
                        case zzbbd.zzt.zzm /* 21 */:
                            C0413i c0413i22 = c0413i;
                            t6.h.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list12 = (List) obj2;
                            Object obj34 = list12.get(0);
                            t6.h.c(obj34, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView19 = (WebView) obj34;
                            Object obj35 = list12.get(1);
                            t6.h.c(obj35, "null cannot be cast to non-null type io.flutter.plugins.webviewflutter.JavaScriptChannel");
                            C0425v c0425v = (C0425v) obj35;
                            try {
                                c0413i22.getClass();
                                webView19.addJavascriptInterface(c0425v, c0425v.f6215a);
                                w022 = Y4.D.D(null);
                            } catch (Throwable th21) {
                                w022 = AbstractC0603a.w0(th21);
                            }
                            v02.f(w022);
                            break;
                        default:
                            C0413i c0413i23 = c0413i;
                            t6.h.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list13 = (List) obj2;
                            Object obj36 = list13.get(0);
                            t6.h.c(obj36, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView20 = (WebView) obj36;
                            Object obj37 = list13.get(1);
                            t6.h.c(obj37, "null cannot be cast to non-null type kotlin.String");
                            String str11 = (String) obj37;
                            try {
                                c0413i23.getClass();
                                webView20.removeJavascriptInterface(str11);
                                w023 = Y4.D.D(null);
                            } catch (Throwable th22) {
                                w023 = AbstractC0603a.w0(th22);
                            }
                            v02.f(w023);
                            break;
                    }
                }
            });
        } else {
            f08.M(null);
        }
        w1.F0 f09 = new w1.F0(fVar, "dev.flutter.pigeon.webview_flutter_android.WebView.canGoBack", c0406b, obj, 1);
        if (c0413i != null) {
            final int i14 = 12;
            f09.M(new A5.b() { // from class: R5.N
                @Override // A5.b
                public final void i(Object obj2, V0 v02) {
                    List w02;
                    List w03;
                    List w04;
                    List w05;
                    List w06;
                    List w07;
                    List w08;
                    List w09;
                    List w010;
                    List w011;
                    List w012;
                    List w013;
                    List w014;
                    List w015;
                    List w016;
                    List w017;
                    List w018;
                    List w019;
                    List w020;
                    List w021;
                    List w022;
                    List w023;
                    switch (i14) {
                        case 0:
                            C0413i c0413i2 = c0413i;
                            t6.h.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj3 = ((List) obj2).get(0);
                            t6.h.c(obj3, "null cannot be cast to non-null type kotlin.Long");
                            try {
                                ((C0407c) c0413i2.f6174a.f3679c).a(((Long) obj3).longValue(), c0413i2.a());
                                w02 = Y4.D.D(null);
                            } catch (Throwable th) {
                                w02 = AbstractC0603a.w0(th);
                            }
                            v02.f(w02);
                            break;
                        case 1:
                            C0413i c0413i3 = c0413i;
                            t6.h.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list = (List) obj2;
                            Object obj4 = list.get(0);
                            t6.h.c(obj4, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView = (WebView) obj4;
                            DownloadListener downloadListener = (DownloadListener) list.get(1);
                            try {
                                c0413i3.getClass();
                                webView.setDownloadListener(downloadListener);
                                w03 = Y4.D.D(null);
                            } catch (Throwable th2) {
                                w03 = AbstractC0603a.w0(th2);
                            }
                            v02.f(w03);
                            break;
                        case 2:
                            C0413i c0413i4 = c0413i;
                            t6.h.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list2 = (List) obj2;
                            Object obj5 = list2.get(0);
                            t6.h.c(obj5, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView2 = (WebView) obj5;
                            Object obj6 = list2.get(1);
                            t6.h.c(obj6, "null cannot be cast to non-null type kotlin.Long");
                            try {
                                ((C0407c) c0413i4.f6174a.f3679c).a(((Long) obj6).longValue(), webView2.getSettings());
                                w04 = Y4.D.D(null);
                            } catch (Throwable th3) {
                                w04 = AbstractC0603a.w0(th3);
                            }
                            v02.f(w04);
                            break;
                        case 3:
                            C0413i c0413i5 = c0413i;
                            t6.h.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list3 = (List) obj2;
                            Object obj7 = list3.get(0);
                            t6.h.c(obj7, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView3 = (WebView) obj7;
                            Z z4 = (Z) list3.get(1);
                            try {
                                c0413i5.getClass();
                                webView3.setWebChromeClient(z4);
                                w05 = Y4.D.D(null);
                            } catch (Throwable th4) {
                                w05 = AbstractC0603a.w0(th4);
                            }
                            v02.f(w05);
                            break;
                        case 4:
                            C0413i c0413i6 = c0413i;
                            t6.h.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list4 = (List) obj2;
                            Object obj8 = list4.get(0);
                            t6.h.c(obj8, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView4 = (WebView) obj8;
                            Object obj9 = list4.get(1);
                            t6.h.c(obj9, "null cannot be cast to non-null type kotlin.Long");
                            long longValue = ((Long) obj9).longValue();
                            try {
                                c0413i6.getClass();
                                webView4.setBackgroundColor((int) longValue);
                                w06 = Y4.D.D(null);
                            } catch (Throwable th5) {
                                w06 = AbstractC0603a.w0(th5);
                            }
                            v02.f(w06);
                            break;
                        case 5:
                            C0413i c0413i7 = c0413i;
                            t6.h.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj10 = ((List) obj2).get(0);
                            t6.h.c(obj10, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView5 = (WebView) obj10;
                            try {
                                c0413i7.getClass();
                                webView5.destroy();
                                w07 = Y4.D.D(null);
                            } catch (Throwable th6) {
                                w07 = AbstractC0603a.w0(th6);
                            }
                            v02.f(w07);
                            break;
                        case 6:
                            C0413i c0413i8 = c0413i;
                            t6.h.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list5 = (List) obj2;
                            Object obj11 = list5.get(0);
                            t6.h.c(obj11, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView6 = (WebView) obj11;
                            Object obj12 = list5.get(1);
                            t6.h.c(obj12, "null cannot be cast to non-null type kotlin.String");
                            String str = (String) obj12;
                            String str2 = (String) list5.get(2);
                            String str3 = (String) list5.get(3);
                            try {
                                c0413i8.getClass();
                                webView6.loadData(str, str2, str3);
                                w08 = Y4.D.D(null);
                            } catch (Throwable th7) {
                                w08 = AbstractC0603a.w0(th7);
                            }
                            v02.f(w08);
                            break;
                        case 7:
                            C0413i c0413i9 = c0413i;
                            t6.h.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list6 = (List) obj2;
                            Object obj13 = list6.get(0);
                            t6.h.c(obj13, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView7 = (WebView) obj13;
                            String str4 = (String) list6.get(1);
                            Object obj14 = list6.get(2);
                            t6.h.c(obj14, "null cannot be cast to non-null type kotlin.String");
                            String str5 = (String) obj14;
                            String str6 = (String) list6.get(3);
                            String str7 = (String) list6.get(4);
                            String str8 = (String) list6.get(5);
                            try {
                                c0413i9.getClass();
                                webView7.loadDataWithBaseURL(str4, str5, str6, str7, str8);
                                w09 = Y4.D.D(null);
                            } catch (Throwable th8) {
                                w09 = AbstractC0603a.w0(th8);
                            }
                            v02.f(w09);
                            break;
                        case 8:
                            C0413i c0413i10 = c0413i;
                            t6.h.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list7 = (List) obj2;
                            Object obj15 = list7.get(0);
                            t6.h.c(obj15, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView8 = (WebView) obj15;
                            Object obj16 = list7.get(1);
                            t6.h.c(obj16, "null cannot be cast to non-null type kotlin.String");
                            String str9 = (String) obj16;
                            Object obj17 = list7.get(2);
                            t6.h.c(obj17, "null cannot be cast to non-null type kotlin.collections.Map<kotlin.String, kotlin.String>");
                            Map<String, String> map = (Map) obj17;
                            try {
                                c0413i10.getClass();
                                webView8.loadUrl(str9, map);
                                w010 = Y4.D.D(null);
                            } catch (Throwable th9) {
                                w010 = AbstractC0603a.w0(th9);
                            }
                            v02.f(w010);
                            break;
                        case 9:
                            C0413i c0413i11 = c0413i;
                            t6.h.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list8 = (List) obj2;
                            Object obj18 = list8.get(0);
                            t6.h.c(obj18, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView9 = (WebView) obj18;
                            Object obj19 = list8.get(1);
                            t6.h.c(obj19, "null cannot be cast to non-null type kotlin.String");
                            String str10 = (String) obj19;
                            Object obj20 = list8.get(2);
                            t6.h.c(obj20, "null cannot be cast to non-null type kotlin.ByteArray");
                            byte[] bArr = (byte[]) obj20;
                            try {
                                c0413i11.getClass();
                                webView9.postUrl(str10, bArr);
                                w011 = Y4.D.D(null);
                            } catch (Throwable th10) {
                                w011 = AbstractC0603a.w0(th10);
                            }
                            v02.f(w011);
                            break;
                        case 10:
                            C0413i c0413i12 = c0413i;
                            t6.h.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj21 = ((List) obj2).get(0);
                            t6.h.c(obj21, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView10 = (WebView) obj21;
                            try {
                                c0413i12.getClass();
                                w012 = Y4.D.D(webView10.getUrl());
                            } catch (Throwable th11) {
                                w012 = AbstractC0603a.w0(th11);
                            }
                            v02.f(w012);
                            break;
                        case 11:
                            C0413i c0413i13 = c0413i;
                            t6.h.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj22 = ((List) obj2).get(0);
                            t6.h.c(obj22, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView11 = (WebView) obj22;
                            try {
                                c0413i13.getClass();
                                webView11.goForward();
                                w013 = Y4.D.D(null);
                            } catch (Throwable th12) {
                                w013 = AbstractC0603a.w0(th12);
                            }
                            v02.f(w013);
                            break;
                        case 12:
                            C0413i c0413i14 = c0413i;
                            t6.h.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj23 = ((List) obj2).get(0);
                            t6.h.c(obj23, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView12 = (WebView) obj23;
                            try {
                                c0413i14.getClass();
                                w014 = Y4.D.D(Boolean.valueOf(webView12.canGoBack()));
                            } catch (Throwable th13) {
                                w014 = AbstractC0603a.w0(th13);
                            }
                            v02.f(w014);
                            break;
                        case 13:
                            C0413i c0413i15 = c0413i;
                            t6.h.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj24 = ((List) obj2).get(0);
                            t6.h.c(obj24, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView13 = (WebView) obj24;
                            try {
                                c0413i15.getClass();
                                w015 = Y4.D.D(Boolean.valueOf(webView13.canGoForward()));
                            } catch (Throwable th14) {
                                w015 = AbstractC0603a.w0(th14);
                            }
                            v02.f(w015);
                            break;
                        case 14:
                            C0413i c0413i16 = c0413i;
                            t6.h.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj25 = ((List) obj2).get(0);
                            t6.h.c(obj25, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView14 = (WebView) obj25;
                            try {
                                c0413i16.getClass();
                                webView14.goBack();
                                w016 = Y4.D.D(null);
                            } catch (Throwable th15) {
                                w016 = AbstractC0603a.w0(th15);
                            }
                            v02.f(w016);
                            break;
                        case 15:
                            C0413i c0413i17 = c0413i;
                            t6.h.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj26 = ((List) obj2).get(0);
                            t6.h.c(obj26, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView15 = (WebView) obj26;
                            try {
                                c0413i17.getClass();
                                webView15.reload();
                                w017 = Y4.D.D(null);
                            } catch (Throwable th16) {
                                w017 = AbstractC0603a.w0(th16);
                            }
                            v02.f(w017);
                            break;
                        case 16:
                            C0413i c0413i18 = c0413i;
                            t6.h.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list9 = (List) obj2;
                            Object obj27 = list9.get(0);
                            t6.h.c(obj27, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView16 = (WebView) obj27;
                            Object obj28 = list9.get(1);
                            t6.h.c(obj28, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean booleanValue = ((Boolean) obj28).booleanValue();
                            try {
                                c0413i18.getClass();
                                webView16.clearCache(booleanValue);
                                w018 = Y4.D.D(null);
                            } catch (Throwable th17) {
                                w018 = AbstractC0603a.w0(th17);
                            }
                            v02.f(w018);
                            break;
                        case 17:
                            t6.h.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list10 = (List) obj2;
                            Object obj29 = list10.get(0);
                            t6.h.c(obj29, "null cannot be cast to non-null type android.webkit.WebView");
                            Object obj30 = list10.get(1);
                            t6.h.c(obj30, "null cannot be cast to non-null type kotlin.String");
                            B b7 = new B(v02, 1);
                            c0413i.getClass();
                            ((WebView) obj29).evaluateJavascript((String) obj30, new C0416l(1, b7));
                            break;
                        case 18:
                            C0413i c0413i19 = c0413i;
                            t6.h.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj31 = ((List) obj2).get(0);
                            t6.h.c(obj31, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView17 = (WebView) obj31;
                            try {
                                c0413i19.getClass();
                                w019 = Y4.D.D(webView17.getTitle());
                            } catch (Throwable th18) {
                                w019 = AbstractC0603a.w0(th18);
                            }
                            v02.f(w019);
                            break;
                        case 19:
                            C0413i c0413i20 = c0413i;
                            t6.h.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj32 = ((List) obj2).get(0);
                            t6.h.c(obj32, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean booleanValue2 = ((Boolean) obj32).booleanValue();
                            try {
                                c0413i20.getClass();
                                WebView.setWebContentsDebuggingEnabled(booleanValue2);
                                w020 = Y4.D.D(null);
                            } catch (Throwable th19) {
                                w020 = AbstractC0603a.w0(th19);
                            }
                            v02.f(w020);
                            break;
                        case 20:
                            C0413i c0413i21 = c0413i;
                            t6.h.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list11 = (List) obj2;
                            Object obj33 = list11.get(0);
                            t6.h.c(obj33, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView18 = (WebView) obj33;
                            WebViewClient webViewClient = (WebViewClient) list11.get(1);
                            try {
                                c0413i21.getClass();
                                webView18.setWebViewClient(webViewClient);
                                w021 = Y4.D.D(null);
                            } catch (Throwable th20) {
                                w021 = AbstractC0603a.w0(th20);
                            }
                            v02.f(w021);
                            break;
                        case zzbbd.zzt.zzm /* 21 */:
                            C0413i c0413i22 = c0413i;
                            t6.h.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list12 = (List) obj2;
                            Object obj34 = list12.get(0);
                            t6.h.c(obj34, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView19 = (WebView) obj34;
                            Object obj35 = list12.get(1);
                            t6.h.c(obj35, "null cannot be cast to non-null type io.flutter.plugins.webviewflutter.JavaScriptChannel");
                            C0425v c0425v = (C0425v) obj35;
                            try {
                                c0413i22.getClass();
                                webView19.addJavascriptInterface(c0425v, c0425v.f6215a);
                                w022 = Y4.D.D(null);
                            } catch (Throwable th21) {
                                w022 = AbstractC0603a.w0(th21);
                            }
                            v02.f(w022);
                            break;
                        default:
                            C0413i c0413i23 = c0413i;
                            t6.h.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list13 = (List) obj2;
                            Object obj36 = list13.get(0);
                            t6.h.c(obj36, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView20 = (WebView) obj36;
                            Object obj37 = list13.get(1);
                            t6.h.c(obj37, "null cannot be cast to non-null type kotlin.String");
                            String str11 = (String) obj37;
                            try {
                                c0413i23.getClass();
                                webView20.removeJavascriptInterface(str11);
                                w023 = Y4.D.D(null);
                            } catch (Throwable th22) {
                                w023 = AbstractC0603a.w0(th22);
                            }
                            v02.f(w023);
                            break;
                    }
                }
            });
        } else {
            f09.M(null);
        }
        w1.F0 f010 = new w1.F0(fVar, "dev.flutter.pigeon.webview_flutter_android.WebView.canGoForward", c0406b, obj, 1);
        if (c0413i != null) {
            final int i15 = 13;
            f010.M(new A5.b() { // from class: R5.N
                @Override // A5.b
                public final void i(Object obj2, V0 v02) {
                    List w02;
                    List w03;
                    List w04;
                    List w05;
                    List w06;
                    List w07;
                    List w08;
                    List w09;
                    List w010;
                    List w011;
                    List w012;
                    List w013;
                    List w014;
                    List w015;
                    List w016;
                    List w017;
                    List w018;
                    List w019;
                    List w020;
                    List w021;
                    List w022;
                    List w023;
                    switch (i15) {
                        case 0:
                            C0413i c0413i2 = c0413i;
                            t6.h.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj3 = ((List) obj2).get(0);
                            t6.h.c(obj3, "null cannot be cast to non-null type kotlin.Long");
                            try {
                                ((C0407c) c0413i2.f6174a.f3679c).a(((Long) obj3).longValue(), c0413i2.a());
                                w02 = Y4.D.D(null);
                            } catch (Throwable th) {
                                w02 = AbstractC0603a.w0(th);
                            }
                            v02.f(w02);
                            break;
                        case 1:
                            C0413i c0413i3 = c0413i;
                            t6.h.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list = (List) obj2;
                            Object obj4 = list.get(0);
                            t6.h.c(obj4, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView = (WebView) obj4;
                            DownloadListener downloadListener = (DownloadListener) list.get(1);
                            try {
                                c0413i3.getClass();
                                webView.setDownloadListener(downloadListener);
                                w03 = Y4.D.D(null);
                            } catch (Throwable th2) {
                                w03 = AbstractC0603a.w0(th2);
                            }
                            v02.f(w03);
                            break;
                        case 2:
                            C0413i c0413i4 = c0413i;
                            t6.h.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list2 = (List) obj2;
                            Object obj5 = list2.get(0);
                            t6.h.c(obj5, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView2 = (WebView) obj5;
                            Object obj6 = list2.get(1);
                            t6.h.c(obj6, "null cannot be cast to non-null type kotlin.Long");
                            try {
                                ((C0407c) c0413i4.f6174a.f3679c).a(((Long) obj6).longValue(), webView2.getSettings());
                                w04 = Y4.D.D(null);
                            } catch (Throwable th3) {
                                w04 = AbstractC0603a.w0(th3);
                            }
                            v02.f(w04);
                            break;
                        case 3:
                            C0413i c0413i5 = c0413i;
                            t6.h.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list3 = (List) obj2;
                            Object obj7 = list3.get(0);
                            t6.h.c(obj7, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView3 = (WebView) obj7;
                            Z z4 = (Z) list3.get(1);
                            try {
                                c0413i5.getClass();
                                webView3.setWebChromeClient(z4);
                                w05 = Y4.D.D(null);
                            } catch (Throwable th4) {
                                w05 = AbstractC0603a.w0(th4);
                            }
                            v02.f(w05);
                            break;
                        case 4:
                            C0413i c0413i6 = c0413i;
                            t6.h.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list4 = (List) obj2;
                            Object obj8 = list4.get(0);
                            t6.h.c(obj8, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView4 = (WebView) obj8;
                            Object obj9 = list4.get(1);
                            t6.h.c(obj9, "null cannot be cast to non-null type kotlin.Long");
                            long longValue = ((Long) obj9).longValue();
                            try {
                                c0413i6.getClass();
                                webView4.setBackgroundColor((int) longValue);
                                w06 = Y4.D.D(null);
                            } catch (Throwable th5) {
                                w06 = AbstractC0603a.w0(th5);
                            }
                            v02.f(w06);
                            break;
                        case 5:
                            C0413i c0413i7 = c0413i;
                            t6.h.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj10 = ((List) obj2).get(0);
                            t6.h.c(obj10, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView5 = (WebView) obj10;
                            try {
                                c0413i7.getClass();
                                webView5.destroy();
                                w07 = Y4.D.D(null);
                            } catch (Throwable th6) {
                                w07 = AbstractC0603a.w0(th6);
                            }
                            v02.f(w07);
                            break;
                        case 6:
                            C0413i c0413i8 = c0413i;
                            t6.h.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list5 = (List) obj2;
                            Object obj11 = list5.get(0);
                            t6.h.c(obj11, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView6 = (WebView) obj11;
                            Object obj12 = list5.get(1);
                            t6.h.c(obj12, "null cannot be cast to non-null type kotlin.String");
                            String str = (String) obj12;
                            String str2 = (String) list5.get(2);
                            String str3 = (String) list5.get(3);
                            try {
                                c0413i8.getClass();
                                webView6.loadData(str, str2, str3);
                                w08 = Y4.D.D(null);
                            } catch (Throwable th7) {
                                w08 = AbstractC0603a.w0(th7);
                            }
                            v02.f(w08);
                            break;
                        case 7:
                            C0413i c0413i9 = c0413i;
                            t6.h.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list6 = (List) obj2;
                            Object obj13 = list6.get(0);
                            t6.h.c(obj13, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView7 = (WebView) obj13;
                            String str4 = (String) list6.get(1);
                            Object obj14 = list6.get(2);
                            t6.h.c(obj14, "null cannot be cast to non-null type kotlin.String");
                            String str5 = (String) obj14;
                            String str6 = (String) list6.get(3);
                            String str7 = (String) list6.get(4);
                            String str8 = (String) list6.get(5);
                            try {
                                c0413i9.getClass();
                                webView7.loadDataWithBaseURL(str4, str5, str6, str7, str8);
                                w09 = Y4.D.D(null);
                            } catch (Throwable th8) {
                                w09 = AbstractC0603a.w0(th8);
                            }
                            v02.f(w09);
                            break;
                        case 8:
                            C0413i c0413i10 = c0413i;
                            t6.h.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list7 = (List) obj2;
                            Object obj15 = list7.get(0);
                            t6.h.c(obj15, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView8 = (WebView) obj15;
                            Object obj16 = list7.get(1);
                            t6.h.c(obj16, "null cannot be cast to non-null type kotlin.String");
                            String str9 = (String) obj16;
                            Object obj17 = list7.get(2);
                            t6.h.c(obj17, "null cannot be cast to non-null type kotlin.collections.Map<kotlin.String, kotlin.String>");
                            Map<String, String> map = (Map) obj17;
                            try {
                                c0413i10.getClass();
                                webView8.loadUrl(str9, map);
                                w010 = Y4.D.D(null);
                            } catch (Throwable th9) {
                                w010 = AbstractC0603a.w0(th9);
                            }
                            v02.f(w010);
                            break;
                        case 9:
                            C0413i c0413i11 = c0413i;
                            t6.h.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list8 = (List) obj2;
                            Object obj18 = list8.get(0);
                            t6.h.c(obj18, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView9 = (WebView) obj18;
                            Object obj19 = list8.get(1);
                            t6.h.c(obj19, "null cannot be cast to non-null type kotlin.String");
                            String str10 = (String) obj19;
                            Object obj20 = list8.get(2);
                            t6.h.c(obj20, "null cannot be cast to non-null type kotlin.ByteArray");
                            byte[] bArr = (byte[]) obj20;
                            try {
                                c0413i11.getClass();
                                webView9.postUrl(str10, bArr);
                                w011 = Y4.D.D(null);
                            } catch (Throwable th10) {
                                w011 = AbstractC0603a.w0(th10);
                            }
                            v02.f(w011);
                            break;
                        case 10:
                            C0413i c0413i12 = c0413i;
                            t6.h.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj21 = ((List) obj2).get(0);
                            t6.h.c(obj21, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView10 = (WebView) obj21;
                            try {
                                c0413i12.getClass();
                                w012 = Y4.D.D(webView10.getUrl());
                            } catch (Throwable th11) {
                                w012 = AbstractC0603a.w0(th11);
                            }
                            v02.f(w012);
                            break;
                        case 11:
                            C0413i c0413i13 = c0413i;
                            t6.h.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj22 = ((List) obj2).get(0);
                            t6.h.c(obj22, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView11 = (WebView) obj22;
                            try {
                                c0413i13.getClass();
                                webView11.goForward();
                                w013 = Y4.D.D(null);
                            } catch (Throwable th12) {
                                w013 = AbstractC0603a.w0(th12);
                            }
                            v02.f(w013);
                            break;
                        case 12:
                            C0413i c0413i14 = c0413i;
                            t6.h.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj23 = ((List) obj2).get(0);
                            t6.h.c(obj23, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView12 = (WebView) obj23;
                            try {
                                c0413i14.getClass();
                                w014 = Y4.D.D(Boolean.valueOf(webView12.canGoBack()));
                            } catch (Throwable th13) {
                                w014 = AbstractC0603a.w0(th13);
                            }
                            v02.f(w014);
                            break;
                        case 13:
                            C0413i c0413i15 = c0413i;
                            t6.h.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj24 = ((List) obj2).get(0);
                            t6.h.c(obj24, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView13 = (WebView) obj24;
                            try {
                                c0413i15.getClass();
                                w015 = Y4.D.D(Boolean.valueOf(webView13.canGoForward()));
                            } catch (Throwable th14) {
                                w015 = AbstractC0603a.w0(th14);
                            }
                            v02.f(w015);
                            break;
                        case 14:
                            C0413i c0413i16 = c0413i;
                            t6.h.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj25 = ((List) obj2).get(0);
                            t6.h.c(obj25, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView14 = (WebView) obj25;
                            try {
                                c0413i16.getClass();
                                webView14.goBack();
                                w016 = Y4.D.D(null);
                            } catch (Throwable th15) {
                                w016 = AbstractC0603a.w0(th15);
                            }
                            v02.f(w016);
                            break;
                        case 15:
                            C0413i c0413i17 = c0413i;
                            t6.h.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj26 = ((List) obj2).get(0);
                            t6.h.c(obj26, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView15 = (WebView) obj26;
                            try {
                                c0413i17.getClass();
                                webView15.reload();
                                w017 = Y4.D.D(null);
                            } catch (Throwable th16) {
                                w017 = AbstractC0603a.w0(th16);
                            }
                            v02.f(w017);
                            break;
                        case 16:
                            C0413i c0413i18 = c0413i;
                            t6.h.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list9 = (List) obj2;
                            Object obj27 = list9.get(0);
                            t6.h.c(obj27, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView16 = (WebView) obj27;
                            Object obj28 = list9.get(1);
                            t6.h.c(obj28, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean booleanValue = ((Boolean) obj28).booleanValue();
                            try {
                                c0413i18.getClass();
                                webView16.clearCache(booleanValue);
                                w018 = Y4.D.D(null);
                            } catch (Throwable th17) {
                                w018 = AbstractC0603a.w0(th17);
                            }
                            v02.f(w018);
                            break;
                        case 17:
                            t6.h.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list10 = (List) obj2;
                            Object obj29 = list10.get(0);
                            t6.h.c(obj29, "null cannot be cast to non-null type android.webkit.WebView");
                            Object obj30 = list10.get(1);
                            t6.h.c(obj30, "null cannot be cast to non-null type kotlin.String");
                            B b7 = new B(v02, 1);
                            c0413i.getClass();
                            ((WebView) obj29).evaluateJavascript((String) obj30, new C0416l(1, b7));
                            break;
                        case 18:
                            C0413i c0413i19 = c0413i;
                            t6.h.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj31 = ((List) obj2).get(0);
                            t6.h.c(obj31, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView17 = (WebView) obj31;
                            try {
                                c0413i19.getClass();
                                w019 = Y4.D.D(webView17.getTitle());
                            } catch (Throwable th18) {
                                w019 = AbstractC0603a.w0(th18);
                            }
                            v02.f(w019);
                            break;
                        case 19:
                            C0413i c0413i20 = c0413i;
                            t6.h.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj32 = ((List) obj2).get(0);
                            t6.h.c(obj32, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean booleanValue2 = ((Boolean) obj32).booleanValue();
                            try {
                                c0413i20.getClass();
                                WebView.setWebContentsDebuggingEnabled(booleanValue2);
                                w020 = Y4.D.D(null);
                            } catch (Throwable th19) {
                                w020 = AbstractC0603a.w0(th19);
                            }
                            v02.f(w020);
                            break;
                        case 20:
                            C0413i c0413i21 = c0413i;
                            t6.h.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list11 = (List) obj2;
                            Object obj33 = list11.get(0);
                            t6.h.c(obj33, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView18 = (WebView) obj33;
                            WebViewClient webViewClient = (WebViewClient) list11.get(1);
                            try {
                                c0413i21.getClass();
                                webView18.setWebViewClient(webViewClient);
                                w021 = Y4.D.D(null);
                            } catch (Throwable th20) {
                                w021 = AbstractC0603a.w0(th20);
                            }
                            v02.f(w021);
                            break;
                        case zzbbd.zzt.zzm /* 21 */:
                            C0413i c0413i22 = c0413i;
                            t6.h.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list12 = (List) obj2;
                            Object obj34 = list12.get(0);
                            t6.h.c(obj34, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView19 = (WebView) obj34;
                            Object obj35 = list12.get(1);
                            t6.h.c(obj35, "null cannot be cast to non-null type io.flutter.plugins.webviewflutter.JavaScriptChannel");
                            C0425v c0425v = (C0425v) obj35;
                            try {
                                c0413i22.getClass();
                                webView19.addJavascriptInterface(c0425v, c0425v.f6215a);
                                w022 = Y4.D.D(null);
                            } catch (Throwable th21) {
                                w022 = AbstractC0603a.w0(th21);
                            }
                            v02.f(w022);
                            break;
                        default:
                            C0413i c0413i23 = c0413i;
                            t6.h.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list13 = (List) obj2;
                            Object obj36 = list13.get(0);
                            t6.h.c(obj36, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView20 = (WebView) obj36;
                            Object obj37 = list13.get(1);
                            t6.h.c(obj37, "null cannot be cast to non-null type kotlin.String");
                            String str11 = (String) obj37;
                            try {
                                c0413i23.getClass();
                                webView20.removeJavascriptInterface(str11);
                                w023 = Y4.D.D(null);
                            } catch (Throwable th22) {
                                w023 = AbstractC0603a.w0(th22);
                            }
                            v02.f(w023);
                            break;
                    }
                }
            });
        } else {
            f010.M(null);
        }
        w1.F0 f011 = new w1.F0(fVar, "dev.flutter.pigeon.webview_flutter_android.WebView.goBack", c0406b, obj, 1);
        if (c0413i != null) {
            final int i16 = 14;
            f011.M(new A5.b() { // from class: R5.N
                @Override // A5.b
                public final void i(Object obj2, V0 v02) {
                    List w02;
                    List w03;
                    List w04;
                    List w05;
                    List w06;
                    List w07;
                    List w08;
                    List w09;
                    List w010;
                    List w011;
                    List w012;
                    List w013;
                    List w014;
                    List w015;
                    List w016;
                    List w017;
                    List w018;
                    List w019;
                    List w020;
                    List w021;
                    List w022;
                    List w023;
                    switch (i16) {
                        case 0:
                            C0413i c0413i2 = c0413i;
                            t6.h.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj3 = ((List) obj2).get(0);
                            t6.h.c(obj3, "null cannot be cast to non-null type kotlin.Long");
                            try {
                                ((C0407c) c0413i2.f6174a.f3679c).a(((Long) obj3).longValue(), c0413i2.a());
                                w02 = Y4.D.D(null);
                            } catch (Throwable th) {
                                w02 = AbstractC0603a.w0(th);
                            }
                            v02.f(w02);
                            break;
                        case 1:
                            C0413i c0413i3 = c0413i;
                            t6.h.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list = (List) obj2;
                            Object obj4 = list.get(0);
                            t6.h.c(obj4, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView = (WebView) obj4;
                            DownloadListener downloadListener = (DownloadListener) list.get(1);
                            try {
                                c0413i3.getClass();
                                webView.setDownloadListener(downloadListener);
                                w03 = Y4.D.D(null);
                            } catch (Throwable th2) {
                                w03 = AbstractC0603a.w0(th2);
                            }
                            v02.f(w03);
                            break;
                        case 2:
                            C0413i c0413i4 = c0413i;
                            t6.h.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list2 = (List) obj2;
                            Object obj5 = list2.get(0);
                            t6.h.c(obj5, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView2 = (WebView) obj5;
                            Object obj6 = list2.get(1);
                            t6.h.c(obj6, "null cannot be cast to non-null type kotlin.Long");
                            try {
                                ((C0407c) c0413i4.f6174a.f3679c).a(((Long) obj6).longValue(), webView2.getSettings());
                                w04 = Y4.D.D(null);
                            } catch (Throwable th3) {
                                w04 = AbstractC0603a.w0(th3);
                            }
                            v02.f(w04);
                            break;
                        case 3:
                            C0413i c0413i5 = c0413i;
                            t6.h.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list3 = (List) obj2;
                            Object obj7 = list3.get(0);
                            t6.h.c(obj7, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView3 = (WebView) obj7;
                            Z z4 = (Z) list3.get(1);
                            try {
                                c0413i5.getClass();
                                webView3.setWebChromeClient(z4);
                                w05 = Y4.D.D(null);
                            } catch (Throwable th4) {
                                w05 = AbstractC0603a.w0(th4);
                            }
                            v02.f(w05);
                            break;
                        case 4:
                            C0413i c0413i6 = c0413i;
                            t6.h.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list4 = (List) obj2;
                            Object obj8 = list4.get(0);
                            t6.h.c(obj8, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView4 = (WebView) obj8;
                            Object obj9 = list4.get(1);
                            t6.h.c(obj9, "null cannot be cast to non-null type kotlin.Long");
                            long longValue = ((Long) obj9).longValue();
                            try {
                                c0413i6.getClass();
                                webView4.setBackgroundColor((int) longValue);
                                w06 = Y4.D.D(null);
                            } catch (Throwable th5) {
                                w06 = AbstractC0603a.w0(th5);
                            }
                            v02.f(w06);
                            break;
                        case 5:
                            C0413i c0413i7 = c0413i;
                            t6.h.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj10 = ((List) obj2).get(0);
                            t6.h.c(obj10, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView5 = (WebView) obj10;
                            try {
                                c0413i7.getClass();
                                webView5.destroy();
                                w07 = Y4.D.D(null);
                            } catch (Throwable th6) {
                                w07 = AbstractC0603a.w0(th6);
                            }
                            v02.f(w07);
                            break;
                        case 6:
                            C0413i c0413i8 = c0413i;
                            t6.h.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list5 = (List) obj2;
                            Object obj11 = list5.get(0);
                            t6.h.c(obj11, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView6 = (WebView) obj11;
                            Object obj12 = list5.get(1);
                            t6.h.c(obj12, "null cannot be cast to non-null type kotlin.String");
                            String str = (String) obj12;
                            String str2 = (String) list5.get(2);
                            String str3 = (String) list5.get(3);
                            try {
                                c0413i8.getClass();
                                webView6.loadData(str, str2, str3);
                                w08 = Y4.D.D(null);
                            } catch (Throwable th7) {
                                w08 = AbstractC0603a.w0(th7);
                            }
                            v02.f(w08);
                            break;
                        case 7:
                            C0413i c0413i9 = c0413i;
                            t6.h.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list6 = (List) obj2;
                            Object obj13 = list6.get(0);
                            t6.h.c(obj13, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView7 = (WebView) obj13;
                            String str4 = (String) list6.get(1);
                            Object obj14 = list6.get(2);
                            t6.h.c(obj14, "null cannot be cast to non-null type kotlin.String");
                            String str5 = (String) obj14;
                            String str6 = (String) list6.get(3);
                            String str7 = (String) list6.get(4);
                            String str8 = (String) list6.get(5);
                            try {
                                c0413i9.getClass();
                                webView7.loadDataWithBaseURL(str4, str5, str6, str7, str8);
                                w09 = Y4.D.D(null);
                            } catch (Throwable th8) {
                                w09 = AbstractC0603a.w0(th8);
                            }
                            v02.f(w09);
                            break;
                        case 8:
                            C0413i c0413i10 = c0413i;
                            t6.h.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list7 = (List) obj2;
                            Object obj15 = list7.get(0);
                            t6.h.c(obj15, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView8 = (WebView) obj15;
                            Object obj16 = list7.get(1);
                            t6.h.c(obj16, "null cannot be cast to non-null type kotlin.String");
                            String str9 = (String) obj16;
                            Object obj17 = list7.get(2);
                            t6.h.c(obj17, "null cannot be cast to non-null type kotlin.collections.Map<kotlin.String, kotlin.String>");
                            Map<String, String> map = (Map) obj17;
                            try {
                                c0413i10.getClass();
                                webView8.loadUrl(str9, map);
                                w010 = Y4.D.D(null);
                            } catch (Throwable th9) {
                                w010 = AbstractC0603a.w0(th9);
                            }
                            v02.f(w010);
                            break;
                        case 9:
                            C0413i c0413i11 = c0413i;
                            t6.h.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list8 = (List) obj2;
                            Object obj18 = list8.get(0);
                            t6.h.c(obj18, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView9 = (WebView) obj18;
                            Object obj19 = list8.get(1);
                            t6.h.c(obj19, "null cannot be cast to non-null type kotlin.String");
                            String str10 = (String) obj19;
                            Object obj20 = list8.get(2);
                            t6.h.c(obj20, "null cannot be cast to non-null type kotlin.ByteArray");
                            byte[] bArr = (byte[]) obj20;
                            try {
                                c0413i11.getClass();
                                webView9.postUrl(str10, bArr);
                                w011 = Y4.D.D(null);
                            } catch (Throwable th10) {
                                w011 = AbstractC0603a.w0(th10);
                            }
                            v02.f(w011);
                            break;
                        case 10:
                            C0413i c0413i12 = c0413i;
                            t6.h.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj21 = ((List) obj2).get(0);
                            t6.h.c(obj21, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView10 = (WebView) obj21;
                            try {
                                c0413i12.getClass();
                                w012 = Y4.D.D(webView10.getUrl());
                            } catch (Throwable th11) {
                                w012 = AbstractC0603a.w0(th11);
                            }
                            v02.f(w012);
                            break;
                        case 11:
                            C0413i c0413i13 = c0413i;
                            t6.h.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj22 = ((List) obj2).get(0);
                            t6.h.c(obj22, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView11 = (WebView) obj22;
                            try {
                                c0413i13.getClass();
                                webView11.goForward();
                                w013 = Y4.D.D(null);
                            } catch (Throwable th12) {
                                w013 = AbstractC0603a.w0(th12);
                            }
                            v02.f(w013);
                            break;
                        case 12:
                            C0413i c0413i14 = c0413i;
                            t6.h.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj23 = ((List) obj2).get(0);
                            t6.h.c(obj23, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView12 = (WebView) obj23;
                            try {
                                c0413i14.getClass();
                                w014 = Y4.D.D(Boolean.valueOf(webView12.canGoBack()));
                            } catch (Throwable th13) {
                                w014 = AbstractC0603a.w0(th13);
                            }
                            v02.f(w014);
                            break;
                        case 13:
                            C0413i c0413i15 = c0413i;
                            t6.h.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj24 = ((List) obj2).get(0);
                            t6.h.c(obj24, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView13 = (WebView) obj24;
                            try {
                                c0413i15.getClass();
                                w015 = Y4.D.D(Boolean.valueOf(webView13.canGoForward()));
                            } catch (Throwable th14) {
                                w015 = AbstractC0603a.w0(th14);
                            }
                            v02.f(w015);
                            break;
                        case 14:
                            C0413i c0413i16 = c0413i;
                            t6.h.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj25 = ((List) obj2).get(0);
                            t6.h.c(obj25, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView14 = (WebView) obj25;
                            try {
                                c0413i16.getClass();
                                webView14.goBack();
                                w016 = Y4.D.D(null);
                            } catch (Throwable th15) {
                                w016 = AbstractC0603a.w0(th15);
                            }
                            v02.f(w016);
                            break;
                        case 15:
                            C0413i c0413i17 = c0413i;
                            t6.h.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj26 = ((List) obj2).get(0);
                            t6.h.c(obj26, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView15 = (WebView) obj26;
                            try {
                                c0413i17.getClass();
                                webView15.reload();
                                w017 = Y4.D.D(null);
                            } catch (Throwable th16) {
                                w017 = AbstractC0603a.w0(th16);
                            }
                            v02.f(w017);
                            break;
                        case 16:
                            C0413i c0413i18 = c0413i;
                            t6.h.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list9 = (List) obj2;
                            Object obj27 = list9.get(0);
                            t6.h.c(obj27, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView16 = (WebView) obj27;
                            Object obj28 = list9.get(1);
                            t6.h.c(obj28, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean booleanValue = ((Boolean) obj28).booleanValue();
                            try {
                                c0413i18.getClass();
                                webView16.clearCache(booleanValue);
                                w018 = Y4.D.D(null);
                            } catch (Throwable th17) {
                                w018 = AbstractC0603a.w0(th17);
                            }
                            v02.f(w018);
                            break;
                        case 17:
                            t6.h.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list10 = (List) obj2;
                            Object obj29 = list10.get(0);
                            t6.h.c(obj29, "null cannot be cast to non-null type android.webkit.WebView");
                            Object obj30 = list10.get(1);
                            t6.h.c(obj30, "null cannot be cast to non-null type kotlin.String");
                            B b7 = new B(v02, 1);
                            c0413i.getClass();
                            ((WebView) obj29).evaluateJavascript((String) obj30, new C0416l(1, b7));
                            break;
                        case 18:
                            C0413i c0413i19 = c0413i;
                            t6.h.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj31 = ((List) obj2).get(0);
                            t6.h.c(obj31, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView17 = (WebView) obj31;
                            try {
                                c0413i19.getClass();
                                w019 = Y4.D.D(webView17.getTitle());
                            } catch (Throwable th18) {
                                w019 = AbstractC0603a.w0(th18);
                            }
                            v02.f(w019);
                            break;
                        case 19:
                            C0413i c0413i20 = c0413i;
                            t6.h.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj32 = ((List) obj2).get(0);
                            t6.h.c(obj32, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean booleanValue2 = ((Boolean) obj32).booleanValue();
                            try {
                                c0413i20.getClass();
                                WebView.setWebContentsDebuggingEnabled(booleanValue2);
                                w020 = Y4.D.D(null);
                            } catch (Throwable th19) {
                                w020 = AbstractC0603a.w0(th19);
                            }
                            v02.f(w020);
                            break;
                        case 20:
                            C0413i c0413i21 = c0413i;
                            t6.h.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list11 = (List) obj2;
                            Object obj33 = list11.get(0);
                            t6.h.c(obj33, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView18 = (WebView) obj33;
                            WebViewClient webViewClient = (WebViewClient) list11.get(1);
                            try {
                                c0413i21.getClass();
                                webView18.setWebViewClient(webViewClient);
                                w021 = Y4.D.D(null);
                            } catch (Throwable th20) {
                                w021 = AbstractC0603a.w0(th20);
                            }
                            v02.f(w021);
                            break;
                        case zzbbd.zzt.zzm /* 21 */:
                            C0413i c0413i22 = c0413i;
                            t6.h.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list12 = (List) obj2;
                            Object obj34 = list12.get(0);
                            t6.h.c(obj34, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView19 = (WebView) obj34;
                            Object obj35 = list12.get(1);
                            t6.h.c(obj35, "null cannot be cast to non-null type io.flutter.plugins.webviewflutter.JavaScriptChannel");
                            C0425v c0425v = (C0425v) obj35;
                            try {
                                c0413i22.getClass();
                                webView19.addJavascriptInterface(c0425v, c0425v.f6215a);
                                w022 = Y4.D.D(null);
                            } catch (Throwable th21) {
                                w022 = AbstractC0603a.w0(th21);
                            }
                            v02.f(w022);
                            break;
                        default:
                            C0413i c0413i23 = c0413i;
                            t6.h.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list13 = (List) obj2;
                            Object obj36 = list13.get(0);
                            t6.h.c(obj36, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView20 = (WebView) obj36;
                            Object obj37 = list13.get(1);
                            t6.h.c(obj37, "null cannot be cast to non-null type kotlin.String");
                            String str11 = (String) obj37;
                            try {
                                c0413i23.getClass();
                                webView20.removeJavascriptInterface(str11);
                                w023 = Y4.D.D(null);
                            } catch (Throwable th22) {
                                w023 = AbstractC0603a.w0(th22);
                            }
                            v02.f(w023);
                            break;
                    }
                }
            });
        } else {
            f011.M(null);
        }
        w1.F0 f012 = new w1.F0(fVar, "dev.flutter.pigeon.webview_flutter_android.WebView.goForward", c0406b, obj, 1);
        if (c0413i != null) {
            final int i17 = 11;
            f012.M(new A5.b() { // from class: R5.N
                @Override // A5.b
                public final void i(Object obj2, V0 v02) {
                    List w02;
                    List w03;
                    List w04;
                    List w05;
                    List w06;
                    List w07;
                    List w08;
                    List w09;
                    List w010;
                    List w011;
                    List w012;
                    List w013;
                    List w014;
                    List w015;
                    List w016;
                    List w017;
                    List w018;
                    List w019;
                    List w020;
                    List w021;
                    List w022;
                    List w023;
                    switch (i17) {
                        case 0:
                            C0413i c0413i2 = c0413i;
                            t6.h.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj3 = ((List) obj2).get(0);
                            t6.h.c(obj3, "null cannot be cast to non-null type kotlin.Long");
                            try {
                                ((C0407c) c0413i2.f6174a.f3679c).a(((Long) obj3).longValue(), c0413i2.a());
                                w02 = Y4.D.D(null);
                            } catch (Throwable th) {
                                w02 = AbstractC0603a.w0(th);
                            }
                            v02.f(w02);
                            break;
                        case 1:
                            C0413i c0413i3 = c0413i;
                            t6.h.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list = (List) obj2;
                            Object obj4 = list.get(0);
                            t6.h.c(obj4, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView = (WebView) obj4;
                            DownloadListener downloadListener = (DownloadListener) list.get(1);
                            try {
                                c0413i3.getClass();
                                webView.setDownloadListener(downloadListener);
                                w03 = Y4.D.D(null);
                            } catch (Throwable th2) {
                                w03 = AbstractC0603a.w0(th2);
                            }
                            v02.f(w03);
                            break;
                        case 2:
                            C0413i c0413i4 = c0413i;
                            t6.h.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list2 = (List) obj2;
                            Object obj5 = list2.get(0);
                            t6.h.c(obj5, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView2 = (WebView) obj5;
                            Object obj6 = list2.get(1);
                            t6.h.c(obj6, "null cannot be cast to non-null type kotlin.Long");
                            try {
                                ((C0407c) c0413i4.f6174a.f3679c).a(((Long) obj6).longValue(), webView2.getSettings());
                                w04 = Y4.D.D(null);
                            } catch (Throwable th3) {
                                w04 = AbstractC0603a.w0(th3);
                            }
                            v02.f(w04);
                            break;
                        case 3:
                            C0413i c0413i5 = c0413i;
                            t6.h.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list3 = (List) obj2;
                            Object obj7 = list3.get(0);
                            t6.h.c(obj7, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView3 = (WebView) obj7;
                            Z z4 = (Z) list3.get(1);
                            try {
                                c0413i5.getClass();
                                webView3.setWebChromeClient(z4);
                                w05 = Y4.D.D(null);
                            } catch (Throwable th4) {
                                w05 = AbstractC0603a.w0(th4);
                            }
                            v02.f(w05);
                            break;
                        case 4:
                            C0413i c0413i6 = c0413i;
                            t6.h.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list4 = (List) obj2;
                            Object obj8 = list4.get(0);
                            t6.h.c(obj8, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView4 = (WebView) obj8;
                            Object obj9 = list4.get(1);
                            t6.h.c(obj9, "null cannot be cast to non-null type kotlin.Long");
                            long longValue = ((Long) obj9).longValue();
                            try {
                                c0413i6.getClass();
                                webView4.setBackgroundColor((int) longValue);
                                w06 = Y4.D.D(null);
                            } catch (Throwable th5) {
                                w06 = AbstractC0603a.w0(th5);
                            }
                            v02.f(w06);
                            break;
                        case 5:
                            C0413i c0413i7 = c0413i;
                            t6.h.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj10 = ((List) obj2).get(0);
                            t6.h.c(obj10, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView5 = (WebView) obj10;
                            try {
                                c0413i7.getClass();
                                webView5.destroy();
                                w07 = Y4.D.D(null);
                            } catch (Throwable th6) {
                                w07 = AbstractC0603a.w0(th6);
                            }
                            v02.f(w07);
                            break;
                        case 6:
                            C0413i c0413i8 = c0413i;
                            t6.h.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list5 = (List) obj2;
                            Object obj11 = list5.get(0);
                            t6.h.c(obj11, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView6 = (WebView) obj11;
                            Object obj12 = list5.get(1);
                            t6.h.c(obj12, "null cannot be cast to non-null type kotlin.String");
                            String str = (String) obj12;
                            String str2 = (String) list5.get(2);
                            String str3 = (String) list5.get(3);
                            try {
                                c0413i8.getClass();
                                webView6.loadData(str, str2, str3);
                                w08 = Y4.D.D(null);
                            } catch (Throwable th7) {
                                w08 = AbstractC0603a.w0(th7);
                            }
                            v02.f(w08);
                            break;
                        case 7:
                            C0413i c0413i9 = c0413i;
                            t6.h.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list6 = (List) obj2;
                            Object obj13 = list6.get(0);
                            t6.h.c(obj13, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView7 = (WebView) obj13;
                            String str4 = (String) list6.get(1);
                            Object obj14 = list6.get(2);
                            t6.h.c(obj14, "null cannot be cast to non-null type kotlin.String");
                            String str5 = (String) obj14;
                            String str6 = (String) list6.get(3);
                            String str7 = (String) list6.get(4);
                            String str8 = (String) list6.get(5);
                            try {
                                c0413i9.getClass();
                                webView7.loadDataWithBaseURL(str4, str5, str6, str7, str8);
                                w09 = Y4.D.D(null);
                            } catch (Throwable th8) {
                                w09 = AbstractC0603a.w0(th8);
                            }
                            v02.f(w09);
                            break;
                        case 8:
                            C0413i c0413i10 = c0413i;
                            t6.h.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list7 = (List) obj2;
                            Object obj15 = list7.get(0);
                            t6.h.c(obj15, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView8 = (WebView) obj15;
                            Object obj16 = list7.get(1);
                            t6.h.c(obj16, "null cannot be cast to non-null type kotlin.String");
                            String str9 = (String) obj16;
                            Object obj17 = list7.get(2);
                            t6.h.c(obj17, "null cannot be cast to non-null type kotlin.collections.Map<kotlin.String, kotlin.String>");
                            Map<String, String> map = (Map) obj17;
                            try {
                                c0413i10.getClass();
                                webView8.loadUrl(str9, map);
                                w010 = Y4.D.D(null);
                            } catch (Throwable th9) {
                                w010 = AbstractC0603a.w0(th9);
                            }
                            v02.f(w010);
                            break;
                        case 9:
                            C0413i c0413i11 = c0413i;
                            t6.h.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list8 = (List) obj2;
                            Object obj18 = list8.get(0);
                            t6.h.c(obj18, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView9 = (WebView) obj18;
                            Object obj19 = list8.get(1);
                            t6.h.c(obj19, "null cannot be cast to non-null type kotlin.String");
                            String str10 = (String) obj19;
                            Object obj20 = list8.get(2);
                            t6.h.c(obj20, "null cannot be cast to non-null type kotlin.ByteArray");
                            byte[] bArr = (byte[]) obj20;
                            try {
                                c0413i11.getClass();
                                webView9.postUrl(str10, bArr);
                                w011 = Y4.D.D(null);
                            } catch (Throwable th10) {
                                w011 = AbstractC0603a.w0(th10);
                            }
                            v02.f(w011);
                            break;
                        case 10:
                            C0413i c0413i12 = c0413i;
                            t6.h.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj21 = ((List) obj2).get(0);
                            t6.h.c(obj21, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView10 = (WebView) obj21;
                            try {
                                c0413i12.getClass();
                                w012 = Y4.D.D(webView10.getUrl());
                            } catch (Throwable th11) {
                                w012 = AbstractC0603a.w0(th11);
                            }
                            v02.f(w012);
                            break;
                        case 11:
                            C0413i c0413i13 = c0413i;
                            t6.h.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj22 = ((List) obj2).get(0);
                            t6.h.c(obj22, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView11 = (WebView) obj22;
                            try {
                                c0413i13.getClass();
                                webView11.goForward();
                                w013 = Y4.D.D(null);
                            } catch (Throwable th12) {
                                w013 = AbstractC0603a.w0(th12);
                            }
                            v02.f(w013);
                            break;
                        case 12:
                            C0413i c0413i14 = c0413i;
                            t6.h.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj23 = ((List) obj2).get(0);
                            t6.h.c(obj23, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView12 = (WebView) obj23;
                            try {
                                c0413i14.getClass();
                                w014 = Y4.D.D(Boolean.valueOf(webView12.canGoBack()));
                            } catch (Throwable th13) {
                                w014 = AbstractC0603a.w0(th13);
                            }
                            v02.f(w014);
                            break;
                        case 13:
                            C0413i c0413i15 = c0413i;
                            t6.h.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj24 = ((List) obj2).get(0);
                            t6.h.c(obj24, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView13 = (WebView) obj24;
                            try {
                                c0413i15.getClass();
                                w015 = Y4.D.D(Boolean.valueOf(webView13.canGoForward()));
                            } catch (Throwable th14) {
                                w015 = AbstractC0603a.w0(th14);
                            }
                            v02.f(w015);
                            break;
                        case 14:
                            C0413i c0413i16 = c0413i;
                            t6.h.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj25 = ((List) obj2).get(0);
                            t6.h.c(obj25, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView14 = (WebView) obj25;
                            try {
                                c0413i16.getClass();
                                webView14.goBack();
                                w016 = Y4.D.D(null);
                            } catch (Throwable th15) {
                                w016 = AbstractC0603a.w0(th15);
                            }
                            v02.f(w016);
                            break;
                        case 15:
                            C0413i c0413i17 = c0413i;
                            t6.h.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj26 = ((List) obj2).get(0);
                            t6.h.c(obj26, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView15 = (WebView) obj26;
                            try {
                                c0413i17.getClass();
                                webView15.reload();
                                w017 = Y4.D.D(null);
                            } catch (Throwable th16) {
                                w017 = AbstractC0603a.w0(th16);
                            }
                            v02.f(w017);
                            break;
                        case 16:
                            C0413i c0413i18 = c0413i;
                            t6.h.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list9 = (List) obj2;
                            Object obj27 = list9.get(0);
                            t6.h.c(obj27, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView16 = (WebView) obj27;
                            Object obj28 = list9.get(1);
                            t6.h.c(obj28, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean booleanValue = ((Boolean) obj28).booleanValue();
                            try {
                                c0413i18.getClass();
                                webView16.clearCache(booleanValue);
                                w018 = Y4.D.D(null);
                            } catch (Throwable th17) {
                                w018 = AbstractC0603a.w0(th17);
                            }
                            v02.f(w018);
                            break;
                        case 17:
                            t6.h.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list10 = (List) obj2;
                            Object obj29 = list10.get(0);
                            t6.h.c(obj29, "null cannot be cast to non-null type android.webkit.WebView");
                            Object obj30 = list10.get(1);
                            t6.h.c(obj30, "null cannot be cast to non-null type kotlin.String");
                            B b7 = new B(v02, 1);
                            c0413i.getClass();
                            ((WebView) obj29).evaluateJavascript((String) obj30, new C0416l(1, b7));
                            break;
                        case 18:
                            C0413i c0413i19 = c0413i;
                            t6.h.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj31 = ((List) obj2).get(0);
                            t6.h.c(obj31, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView17 = (WebView) obj31;
                            try {
                                c0413i19.getClass();
                                w019 = Y4.D.D(webView17.getTitle());
                            } catch (Throwable th18) {
                                w019 = AbstractC0603a.w0(th18);
                            }
                            v02.f(w019);
                            break;
                        case 19:
                            C0413i c0413i20 = c0413i;
                            t6.h.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj32 = ((List) obj2).get(0);
                            t6.h.c(obj32, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean booleanValue2 = ((Boolean) obj32).booleanValue();
                            try {
                                c0413i20.getClass();
                                WebView.setWebContentsDebuggingEnabled(booleanValue2);
                                w020 = Y4.D.D(null);
                            } catch (Throwable th19) {
                                w020 = AbstractC0603a.w0(th19);
                            }
                            v02.f(w020);
                            break;
                        case 20:
                            C0413i c0413i21 = c0413i;
                            t6.h.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list11 = (List) obj2;
                            Object obj33 = list11.get(0);
                            t6.h.c(obj33, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView18 = (WebView) obj33;
                            WebViewClient webViewClient = (WebViewClient) list11.get(1);
                            try {
                                c0413i21.getClass();
                                webView18.setWebViewClient(webViewClient);
                                w021 = Y4.D.D(null);
                            } catch (Throwable th20) {
                                w021 = AbstractC0603a.w0(th20);
                            }
                            v02.f(w021);
                            break;
                        case zzbbd.zzt.zzm /* 21 */:
                            C0413i c0413i22 = c0413i;
                            t6.h.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list12 = (List) obj2;
                            Object obj34 = list12.get(0);
                            t6.h.c(obj34, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView19 = (WebView) obj34;
                            Object obj35 = list12.get(1);
                            t6.h.c(obj35, "null cannot be cast to non-null type io.flutter.plugins.webviewflutter.JavaScriptChannel");
                            C0425v c0425v = (C0425v) obj35;
                            try {
                                c0413i22.getClass();
                                webView19.addJavascriptInterface(c0425v, c0425v.f6215a);
                                w022 = Y4.D.D(null);
                            } catch (Throwable th21) {
                                w022 = AbstractC0603a.w0(th21);
                            }
                            v02.f(w022);
                            break;
                        default:
                            C0413i c0413i23 = c0413i;
                            t6.h.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list13 = (List) obj2;
                            Object obj36 = list13.get(0);
                            t6.h.c(obj36, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView20 = (WebView) obj36;
                            Object obj37 = list13.get(1);
                            t6.h.c(obj37, "null cannot be cast to non-null type kotlin.String");
                            String str11 = (String) obj37;
                            try {
                                c0413i23.getClass();
                                webView20.removeJavascriptInterface(str11);
                                w023 = Y4.D.D(null);
                            } catch (Throwable th22) {
                                w023 = AbstractC0603a.w0(th22);
                            }
                            v02.f(w023);
                            break;
                    }
                }
            });
        } else {
            f012.M(null);
        }
        w1.F0 f013 = new w1.F0(fVar, "dev.flutter.pigeon.webview_flutter_android.WebView.reload", c0406b, obj, 1);
        if (c0413i != null) {
            final int i18 = 15;
            f013.M(new A5.b() { // from class: R5.N
                @Override // A5.b
                public final void i(Object obj2, V0 v02) {
                    List w02;
                    List w03;
                    List w04;
                    List w05;
                    List w06;
                    List w07;
                    List w08;
                    List w09;
                    List w010;
                    List w011;
                    List w012;
                    List w013;
                    List w014;
                    List w015;
                    List w016;
                    List w017;
                    List w018;
                    List w019;
                    List w020;
                    List w021;
                    List w022;
                    List w023;
                    switch (i18) {
                        case 0:
                            C0413i c0413i2 = c0413i;
                            t6.h.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj3 = ((List) obj2).get(0);
                            t6.h.c(obj3, "null cannot be cast to non-null type kotlin.Long");
                            try {
                                ((C0407c) c0413i2.f6174a.f3679c).a(((Long) obj3).longValue(), c0413i2.a());
                                w02 = Y4.D.D(null);
                            } catch (Throwable th) {
                                w02 = AbstractC0603a.w0(th);
                            }
                            v02.f(w02);
                            break;
                        case 1:
                            C0413i c0413i3 = c0413i;
                            t6.h.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list = (List) obj2;
                            Object obj4 = list.get(0);
                            t6.h.c(obj4, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView = (WebView) obj4;
                            DownloadListener downloadListener = (DownloadListener) list.get(1);
                            try {
                                c0413i3.getClass();
                                webView.setDownloadListener(downloadListener);
                                w03 = Y4.D.D(null);
                            } catch (Throwable th2) {
                                w03 = AbstractC0603a.w0(th2);
                            }
                            v02.f(w03);
                            break;
                        case 2:
                            C0413i c0413i4 = c0413i;
                            t6.h.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list2 = (List) obj2;
                            Object obj5 = list2.get(0);
                            t6.h.c(obj5, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView2 = (WebView) obj5;
                            Object obj6 = list2.get(1);
                            t6.h.c(obj6, "null cannot be cast to non-null type kotlin.Long");
                            try {
                                ((C0407c) c0413i4.f6174a.f3679c).a(((Long) obj6).longValue(), webView2.getSettings());
                                w04 = Y4.D.D(null);
                            } catch (Throwable th3) {
                                w04 = AbstractC0603a.w0(th3);
                            }
                            v02.f(w04);
                            break;
                        case 3:
                            C0413i c0413i5 = c0413i;
                            t6.h.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list3 = (List) obj2;
                            Object obj7 = list3.get(0);
                            t6.h.c(obj7, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView3 = (WebView) obj7;
                            Z z4 = (Z) list3.get(1);
                            try {
                                c0413i5.getClass();
                                webView3.setWebChromeClient(z4);
                                w05 = Y4.D.D(null);
                            } catch (Throwable th4) {
                                w05 = AbstractC0603a.w0(th4);
                            }
                            v02.f(w05);
                            break;
                        case 4:
                            C0413i c0413i6 = c0413i;
                            t6.h.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list4 = (List) obj2;
                            Object obj8 = list4.get(0);
                            t6.h.c(obj8, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView4 = (WebView) obj8;
                            Object obj9 = list4.get(1);
                            t6.h.c(obj9, "null cannot be cast to non-null type kotlin.Long");
                            long longValue = ((Long) obj9).longValue();
                            try {
                                c0413i6.getClass();
                                webView4.setBackgroundColor((int) longValue);
                                w06 = Y4.D.D(null);
                            } catch (Throwable th5) {
                                w06 = AbstractC0603a.w0(th5);
                            }
                            v02.f(w06);
                            break;
                        case 5:
                            C0413i c0413i7 = c0413i;
                            t6.h.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj10 = ((List) obj2).get(0);
                            t6.h.c(obj10, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView5 = (WebView) obj10;
                            try {
                                c0413i7.getClass();
                                webView5.destroy();
                                w07 = Y4.D.D(null);
                            } catch (Throwable th6) {
                                w07 = AbstractC0603a.w0(th6);
                            }
                            v02.f(w07);
                            break;
                        case 6:
                            C0413i c0413i8 = c0413i;
                            t6.h.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list5 = (List) obj2;
                            Object obj11 = list5.get(0);
                            t6.h.c(obj11, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView6 = (WebView) obj11;
                            Object obj12 = list5.get(1);
                            t6.h.c(obj12, "null cannot be cast to non-null type kotlin.String");
                            String str = (String) obj12;
                            String str2 = (String) list5.get(2);
                            String str3 = (String) list5.get(3);
                            try {
                                c0413i8.getClass();
                                webView6.loadData(str, str2, str3);
                                w08 = Y4.D.D(null);
                            } catch (Throwable th7) {
                                w08 = AbstractC0603a.w0(th7);
                            }
                            v02.f(w08);
                            break;
                        case 7:
                            C0413i c0413i9 = c0413i;
                            t6.h.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list6 = (List) obj2;
                            Object obj13 = list6.get(0);
                            t6.h.c(obj13, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView7 = (WebView) obj13;
                            String str4 = (String) list6.get(1);
                            Object obj14 = list6.get(2);
                            t6.h.c(obj14, "null cannot be cast to non-null type kotlin.String");
                            String str5 = (String) obj14;
                            String str6 = (String) list6.get(3);
                            String str7 = (String) list6.get(4);
                            String str8 = (String) list6.get(5);
                            try {
                                c0413i9.getClass();
                                webView7.loadDataWithBaseURL(str4, str5, str6, str7, str8);
                                w09 = Y4.D.D(null);
                            } catch (Throwable th8) {
                                w09 = AbstractC0603a.w0(th8);
                            }
                            v02.f(w09);
                            break;
                        case 8:
                            C0413i c0413i10 = c0413i;
                            t6.h.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list7 = (List) obj2;
                            Object obj15 = list7.get(0);
                            t6.h.c(obj15, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView8 = (WebView) obj15;
                            Object obj16 = list7.get(1);
                            t6.h.c(obj16, "null cannot be cast to non-null type kotlin.String");
                            String str9 = (String) obj16;
                            Object obj17 = list7.get(2);
                            t6.h.c(obj17, "null cannot be cast to non-null type kotlin.collections.Map<kotlin.String, kotlin.String>");
                            Map<String, String> map = (Map) obj17;
                            try {
                                c0413i10.getClass();
                                webView8.loadUrl(str9, map);
                                w010 = Y4.D.D(null);
                            } catch (Throwable th9) {
                                w010 = AbstractC0603a.w0(th9);
                            }
                            v02.f(w010);
                            break;
                        case 9:
                            C0413i c0413i11 = c0413i;
                            t6.h.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list8 = (List) obj2;
                            Object obj18 = list8.get(0);
                            t6.h.c(obj18, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView9 = (WebView) obj18;
                            Object obj19 = list8.get(1);
                            t6.h.c(obj19, "null cannot be cast to non-null type kotlin.String");
                            String str10 = (String) obj19;
                            Object obj20 = list8.get(2);
                            t6.h.c(obj20, "null cannot be cast to non-null type kotlin.ByteArray");
                            byte[] bArr = (byte[]) obj20;
                            try {
                                c0413i11.getClass();
                                webView9.postUrl(str10, bArr);
                                w011 = Y4.D.D(null);
                            } catch (Throwable th10) {
                                w011 = AbstractC0603a.w0(th10);
                            }
                            v02.f(w011);
                            break;
                        case 10:
                            C0413i c0413i12 = c0413i;
                            t6.h.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj21 = ((List) obj2).get(0);
                            t6.h.c(obj21, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView10 = (WebView) obj21;
                            try {
                                c0413i12.getClass();
                                w012 = Y4.D.D(webView10.getUrl());
                            } catch (Throwable th11) {
                                w012 = AbstractC0603a.w0(th11);
                            }
                            v02.f(w012);
                            break;
                        case 11:
                            C0413i c0413i13 = c0413i;
                            t6.h.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj22 = ((List) obj2).get(0);
                            t6.h.c(obj22, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView11 = (WebView) obj22;
                            try {
                                c0413i13.getClass();
                                webView11.goForward();
                                w013 = Y4.D.D(null);
                            } catch (Throwable th12) {
                                w013 = AbstractC0603a.w0(th12);
                            }
                            v02.f(w013);
                            break;
                        case 12:
                            C0413i c0413i14 = c0413i;
                            t6.h.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj23 = ((List) obj2).get(0);
                            t6.h.c(obj23, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView12 = (WebView) obj23;
                            try {
                                c0413i14.getClass();
                                w014 = Y4.D.D(Boolean.valueOf(webView12.canGoBack()));
                            } catch (Throwable th13) {
                                w014 = AbstractC0603a.w0(th13);
                            }
                            v02.f(w014);
                            break;
                        case 13:
                            C0413i c0413i15 = c0413i;
                            t6.h.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj24 = ((List) obj2).get(0);
                            t6.h.c(obj24, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView13 = (WebView) obj24;
                            try {
                                c0413i15.getClass();
                                w015 = Y4.D.D(Boolean.valueOf(webView13.canGoForward()));
                            } catch (Throwable th14) {
                                w015 = AbstractC0603a.w0(th14);
                            }
                            v02.f(w015);
                            break;
                        case 14:
                            C0413i c0413i16 = c0413i;
                            t6.h.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj25 = ((List) obj2).get(0);
                            t6.h.c(obj25, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView14 = (WebView) obj25;
                            try {
                                c0413i16.getClass();
                                webView14.goBack();
                                w016 = Y4.D.D(null);
                            } catch (Throwable th15) {
                                w016 = AbstractC0603a.w0(th15);
                            }
                            v02.f(w016);
                            break;
                        case 15:
                            C0413i c0413i17 = c0413i;
                            t6.h.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj26 = ((List) obj2).get(0);
                            t6.h.c(obj26, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView15 = (WebView) obj26;
                            try {
                                c0413i17.getClass();
                                webView15.reload();
                                w017 = Y4.D.D(null);
                            } catch (Throwable th16) {
                                w017 = AbstractC0603a.w0(th16);
                            }
                            v02.f(w017);
                            break;
                        case 16:
                            C0413i c0413i18 = c0413i;
                            t6.h.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list9 = (List) obj2;
                            Object obj27 = list9.get(0);
                            t6.h.c(obj27, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView16 = (WebView) obj27;
                            Object obj28 = list9.get(1);
                            t6.h.c(obj28, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean booleanValue = ((Boolean) obj28).booleanValue();
                            try {
                                c0413i18.getClass();
                                webView16.clearCache(booleanValue);
                                w018 = Y4.D.D(null);
                            } catch (Throwable th17) {
                                w018 = AbstractC0603a.w0(th17);
                            }
                            v02.f(w018);
                            break;
                        case 17:
                            t6.h.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list10 = (List) obj2;
                            Object obj29 = list10.get(0);
                            t6.h.c(obj29, "null cannot be cast to non-null type android.webkit.WebView");
                            Object obj30 = list10.get(1);
                            t6.h.c(obj30, "null cannot be cast to non-null type kotlin.String");
                            B b7 = new B(v02, 1);
                            c0413i.getClass();
                            ((WebView) obj29).evaluateJavascript((String) obj30, new C0416l(1, b7));
                            break;
                        case 18:
                            C0413i c0413i19 = c0413i;
                            t6.h.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj31 = ((List) obj2).get(0);
                            t6.h.c(obj31, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView17 = (WebView) obj31;
                            try {
                                c0413i19.getClass();
                                w019 = Y4.D.D(webView17.getTitle());
                            } catch (Throwable th18) {
                                w019 = AbstractC0603a.w0(th18);
                            }
                            v02.f(w019);
                            break;
                        case 19:
                            C0413i c0413i20 = c0413i;
                            t6.h.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj32 = ((List) obj2).get(0);
                            t6.h.c(obj32, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean booleanValue2 = ((Boolean) obj32).booleanValue();
                            try {
                                c0413i20.getClass();
                                WebView.setWebContentsDebuggingEnabled(booleanValue2);
                                w020 = Y4.D.D(null);
                            } catch (Throwable th19) {
                                w020 = AbstractC0603a.w0(th19);
                            }
                            v02.f(w020);
                            break;
                        case 20:
                            C0413i c0413i21 = c0413i;
                            t6.h.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list11 = (List) obj2;
                            Object obj33 = list11.get(0);
                            t6.h.c(obj33, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView18 = (WebView) obj33;
                            WebViewClient webViewClient = (WebViewClient) list11.get(1);
                            try {
                                c0413i21.getClass();
                                webView18.setWebViewClient(webViewClient);
                                w021 = Y4.D.D(null);
                            } catch (Throwable th20) {
                                w021 = AbstractC0603a.w0(th20);
                            }
                            v02.f(w021);
                            break;
                        case zzbbd.zzt.zzm /* 21 */:
                            C0413i c0413i22 = c0413i;
                            t6.h.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list12 = (List) obj2;
                            Object obj34 = list12.get(0);
                            t6.h.c(obj34, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView19 = (WebView) obj34;
                            Object obj35 = list12.get(1);
                            t6.h.c(obj35, "null cannot be cast to non-null type io.flutter.plugins.webviewflutter.JavaScriptChannel");
                            C0425v c0425v = (C0425v) obj35;
                            try {
                                c0413i22.getClass();
                                webView19.addJavascriptInterface(c0425v, c0425v.f6215a);
                                w022 = Y4.D.D(null);
                            } catch (Throwable th21) {
                                w022 = AbstractC0603a.w0(th21);
                            }
                            v02.f(w022);
                            break;
                        default:
                            C0413i c0413i23 = c0413i;
                            t6.h.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list13 = (List) obj2;
                            Object obj36 = list13.get(0);
                            t6.h.c(obj36, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView20 = (WebView) obj36;
                            Object obj37 = list13.get(1);
                            t6.h.c(obj37, "null cannot be cast to non-null type kotlin.String");
                            String str11 = (String) obj37;
                            try {
                                c0413i23.getClass();
                                webView20.removeJavascriptInterface(str11);
                                w023 = Y4.D.D(null);
                            } catch (Throwable th22) {
                                w023 = AbstractC0603a.w0(th22);
                            }
                            v02.f(w023);
                            break;
                    }
                }
            });
        } else {
            f013.M(null);
        }
        w1.F0 f014 = new w1.F0(fVar, "dev.flutter.pigeon.webview_flutter_android.WebView.clearCache", c0406b, obj, 1);
        if (c0413i != null) {
            final int i19 = 16;
            f014.M(new A5.b() { // from class: R5.N
                @Override // A5.b
                public final void i(Object obj2, V0 v02) {
                    List w02;
                    List w03;
                    List w04;
                    List w05;
                    List w06;
                    List w07;
                    List w08;
                    List w09;
                    List w010;
                    List w011;
                    List w012;
                    List w013;
                    List w014;
                    List w015;
                    List w016;
                    List w017;
                    List w018;
                    List w019;
                    List w020;
                    List w021;
                    List w022;
                    List w023;
                    switch (i19) {
                        case 0:
                            C0413i c0413i2 = c0413i;
                            t6.h.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj3 = ((List) obj2).get(0);
                            t6.h.c(obj3, "null cannot be cast to non-null type kotlin.Long");
                            try {
                                ((C0407c) c0413i2.f6174a.f3679c).a(((Long) obj3).longValue(), c0413i2.a());
                                w02 = Y4.D.D(null);
                            } catch (Throwable th) {
                                w02 = AbstractC0603a.w0(th);
                            }
                            v02.f(w02);
                            break;
                        case 1:
                            C0413i c0413i3 = c0413i;
                            t6.h.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list = (List) obj2;
                            Object obj4 = list.get(0);
                            t6.h.c(obj4, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView = (WebView) obj4;
                            DownloadListener downloadListener = (DownloadListener) list.get(1);
                            try {
                                c0413i3.getClass();
                                webView.setDownloadListener(downloadListener);
                                w03 = Y4.D.D(null);
                            } catch (Throwable th2) {
                                w03 = AbstractC0603a.w0(th2);
                            }
                            v02.f(w03);
                            break;
                        case 2:
                            C0413i c0413i4 = c0413i;
                            t6.h.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list2 = (List) obj2;
                            Object obj5 = list2.get(0);
                            t6.h.c(obj5, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView2 = (WebView) obj5;
                            Object obj6 = list2.get(1);
                            t6.h.c(obj6, "null cannot be cast to non-null type kotlin.Long");
                            try {
                                ((C0407c) c0413i4.f6174a.f3679c).a(((Long) obj6).longValue(), webView2.getSettings());
                                w04 = Y4.D.D(null);
                            } catch (Throwable th3) {
                                w04 = AbstractC0603a.w0(th3);
                            }
                            v02.f(w04);
                            break;
                        case 3:
                            C0413i c0413i5 = c0413i;
                            t6.h.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list3 = (List) obj2;
                            Object obj7 = list3.get(0);
                            t6.h.c(obj7, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView3 = (WebView) obj7;
                            Z z4 = (Z) list3.get(1);
                            try {
                                c0413i5.getClass();
                                webView3.setWebChromeClient(z4);
                                w05 = Y4.D.D(null);
                            } catch (Throwable th4) {
                                w05 = AbstractC0603a.w0(th4);
                            }
                            v02.f(w05);
                            break;
                        case 4:
                            C0413i c0413i6 = c0413i;
                            t6.h.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list4 = (List) obj2;
                            Object obj8 = list4.get(0);
                            t6.h.c(obj8, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView4 = (WebView) obj8;
                            Object obj9 = list4.get(1);
                            t6.h.c(obj9, "null cannot be cast to non-null type kotlin.Long");
                            long longValue = ((Long) obj9).longValue();
                            try {
                                c0413i6.getClass();
                                webView4.setBackgroundColor((int) longValue);
                                w06 = Y4.D.D(null);
                            } catch (Throwable th5) {
                                w06 = AbstractC0603a.w0(th5);
                            }
                            v02.f(w06);
                            break;
                        case 5:
                            C0413i c0413i7 = c0413i;
                            t6.h.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj10 = ((List) obj2).get(0);
                            t6.h.c(obj10, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView5 = (WebView) obj10;
                            try {
                                c0413i7.getClass();
                                webView5.destroy();
                                w07 = Y4.D.D(null);
                            } catch (Throwable th6) {
                                w07 = AbstractC0603a.w0(th6);
                            }
                            v02.f(w07);
                            break;
                        case 6:
                            C0413i c0413i8 = c0413i;
                            t6.h.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list5 = (List) obj2;
                            Object obj11 = list5.get(0);
                            t6.h.c(obj11, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView6 = (WebView) obj11;
                            Object obj12 = list5.get(1);
                            t6.h.c(obj12, "null cannot be cast to non-null type kotlin.String");
                            String str = (String) obj12;
                            String str2 = (String) list5.get(2);
                            String str3 = (String) list5.get(3);
                            try {
                                c0413i8.getClass();
                                webView6.loadData(str, str2, str3);
                                w08 = Y4.D.D(null);
                            } catch (Throwable th7) {
                                w08 = AbstractC0603a.w0(th7);
                            }
                            v02.f(w08);
                            break;
                        case 7:
                            C0413i c0413i9 = c0413i;
                            t6.h.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list6 = (List) obj2;
                            Object obj13 = list6.get(0);
                            t6.h.c(obj13, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView7 = (WebView) obj13;
                            String str4 = (String) list6.get(1);
                            Object obj14 = list6.get(2);
                            t6.h.c(obj14, "null cannot be cast to non-null type kotlin.String");
                            String str5 = (String) obj14;
                            String str6 = (String) list6.get(3);
                            String str7 = (String) list6.get(4);
                            String str8 = (String) list6.get(5);
                            try {
                                c0413i9.getClass();
                                webView7.loadDataWithBaseURL(str4, str5, str6, str7, str8);
                                w09 = Y4.D.D(null);
                            } catch (Throwable th8) {
                                w09 = AbstractC0603a.w0(th8);
                            }
                            v02.f(w09);
                            break;
                        case 8:
                            C0413i c0413i10 = c0413i;
                            t6.h.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list7 = (List) obj2;
                            Object obj15 = list7.get(0);
                            t6.h.c(obj15, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView8 = (WebView) obj15;
                            Object obj16 = list7.get(1);
                            t6.h.c(obj16, "null cannot be cast to non-null type kotlin.String");
                            String str9 = (String) obj16;
                            Object obj17 = list7.get(2);
                            t6.h.c(obj17, "null cannot be cast to non-null type kotlin.collections.Map<kotlin.String, kotlin.String>");
                            Map<String, String> map = (Map) obj17;
                            try {
                                c0413i10.getClass();
                                webView8.loadUrl(str9, map);
                                w010 = Y4.D.D(null);
                            } catch (Throwable th9) {
                                w010 = AbstractC0603a.w0(th9);
                            }
                            v02.f(w010);
                            break;
                        case 9:
                            C0413i c0413i11 = c0413i;
                            t6.h.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list8 = (List) obj2;
                            Object obj18 = list8.get(0);
                            t6.h.c(obj18, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView9 = (WebView) obj18;
                            Object obj19 = list8.get(1);
                            t6.h.c(obj19, "null cannot be cast to non-null type kotlin.String");
                            String str10 = (String) obj19;
                            Object obj20 = list8.get(2);
                            t6.h.c(obj20, "null cannot be cast to non-null type kotlin.ByteArray");
                            byte[] bArr = (byte[]) obj20;
                            try {
                                c0413i11.getClass();
                                webView9.postUrl(str10, bArr);
                                w011 = Y4.D.D(null);
                            } catch (Throwable th10) {
                                w011 = AbstractC0603a.w0(th10);
                            }
                            v02.f(w011);
                            break;
                        case 10:
                            C0413i c0413i12 = c0413i;
                            t6.h.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj21 = ((List) obj2).get(0);
                            t6.h.c(obj21, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView10 = (WebView) obj21;
                            try {
                                c0413i12.getClass();
                                w012 = Y4.D.D(webView10.getUrl());
                            } catch (Throwable th11) {
                                w012 = AbstractC0603a.w0(th11);
                            }
                            v02.f(w012);
                            break;
                        case 11:
                            C0413i c0413i13 = c0413i;
                            t6.h.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj22 = ((List) obj2).get(0);
                            t6.h.c(obj22, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView11 = (WebView) obj22;
                            try {
                                c0413i13.getClass();
                                webView11.goForward();
                                w013 = Y4.D.D(null);
                            } catch (Throwable th12) {
                                w013 = AbstractC0603a.w0(th12);
                            }
                            v02.f(w013);
                            break;
                        case 12:
                            C0413i c0413i14 = c0413i;
                            t6.h.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj23 = ((List) obj2).get(0);
                            t6.h.c(obj23, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView12 = (WebView) obj23;
                            try {
                                c0413i14.getClass();
                                w014 = Y4.D.D(Boolean.valueOf(webView12.canGoBack()));
                            } catch (Throwable th13) {
                                w014 = AbstractC0603a.w0(th13);
                            }
                            v02.f(w014);
                            break;
                        case 13:
                            C0413i c0413i15 = c0413i;
                            t6.h.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj24 = ((List) obj2).get(0);
                            t6.h.c(obj24, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView13 = (WebView) obj24;
                            try {
                                c0413i15.getClass();
                                w015 = Y4.D.D(Boolean.valueOf(webView13.canGoForward()));
                            } catch (Throwable th14) {
                                w015 = AbstractC0603a.w0(th14);
                            }
                            v02.f(w015);
                            break;
                        case 14:
                            C0413i c0413i16 = c0413i;
                            t6.h.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj25 = ((List) obj2).get(0);
                            t6.h.c(obj25, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView14 = (WebView) obj25;
                            try {
                                c0413i16.getClass();
                                webView14.goBack();
                                w016 = Y4.D.D(null);
                            } catch (Throwable th15) {
                                w016 = AbstractC0603a.w0(th15);
                            }
                            v02.f(w016);
                            break;
                        case 15:
                            C0413i c0413i17 = c0413i;
                            t6.h.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj26 = ((List) obj2).get(0);
                            t6.h.c(obj26, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView15 = (WebView) obj26;
                            try {
                                c0413i17.getClass();
                                webView15.reload();
                                w017 = Y4.D.D(null);
                            } catch (Throwable th16) {
                                w017 = AbstractC0603a.w0(th16);
                            }
                            v02.f(w017);
                            break;
                        case 16:
                            C0413i c0413i18 = c0413i;
                            t6.h.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list9 = (List) obj2;
                            Object obj27 = list9.get(0);
                            t6.h.c(obj27, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView16 = (WebView) obj27;
                            Object obj28 = list9.get(1);
                            t6.h.c(obj28, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean booleanValue = ((Boolean) obj28).booleanValue();
                            try {
                                c0413i18.getClass();
                                webView16.clearCache(booleanValue);
                                w018 = Y4.D.D(null);
                            } catch (Throwable th17) {
                                w018 = AbstractC0603a.w0(th17);
                            }
                            v02.f(w018);
                            break;
                        case 17:
                            t6.h.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list10 = (List) obj2;
                            Object obj29 = list10.get(0);
                            t6.h.c(obj29, "null cannot be cast to non-null type android.webkit.WebView");
                            Object obj30 = list10.get(1);
                            t6.h.c(obj30, "null cannot be cast to non-null type kotlin.String");
                            B b7 = new B(v02, 1);
                            c0413i.getClass();
                            ((WebView) obj29).evaluateJavascript((String) obj30, new C0416l(1, b7));
                            break;
                        case 18:
                            C0413i c0413i19 = c0413i;
                            t6.h.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj31 = ((List) obj2).get(0);
                            t6.h.c(obj31, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView17 = (WebView) obj31;
                            try {
                                c0413i19.getClass();
                                w019 = Y4.D.D(webView17.getTitle());
                            } catch (Throwable th18) {
                                w019 = AbstractC0603a.w0(th18);
                            }
                            v02.f(w019);
                            break;
                        case 19:
                            C0413i c0413i20 = c0413i;
                            t6.h.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj32 = ((List) obj2).get(0);
                            t6.h.c(obj32, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean booleanValue2 = ((Boolean) obj32).booleanValue();
                            try {
                                c0413i20.getClass();
                                WebView.setWebContentsDebuggingEnabled(booleanValue2);
                                w020 = Y4.D.D(null);
                            } catch (Throwable th19) {
                                w020 = AbstractC0603a.w0(th19);
                            }
                            v02.f(w020);
                            break;
                        case 20:
                            C0413i c0413i21 = c0413i;
                            t6.h.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list11 = (List) obj2;
                            Object obj33 = list11.get(0);
                            t6.h.c(obj33, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView18 = (WebView) obj33;
                            WebViewClient webViewClient = (WebViewClient) list11.get(1);
                            try {
                                c0413i21.getClass();
                                webView18.setWebViewClient(webViewClient);
                                w021 = Y4.D.D(null);
                            } catch (Throwable th20) {
                                w021 = AbstractC0603a.w0(th20);
                            }
                            v02.f(w021);
                            break;
                        case zzbbd.zzt.zzm /* 21 */:
                            C0413i c0413i22 = c0413i;
                            t6.h.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list12 = (List) obj2;
                            Object obj34 = list12.get(0);
                            t6.h.c(obj34, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView19 = (WebView) obj34;
                            Object obj35 = list12.get(1);
                            t6.h.c(obj35, "null cannot be cast to non-null type io.flutter.plugins.webviewflutter.JavaScriptChannel");
                            C0425v c0425v = (C0425v) obj35;
                            try {
                                c0413i22.getClass();
                                webView19.addJavascriptInterface(c0425v, c0425v.f6215a);
                                w022 = Y4.D.D(null);
                            } catch (Throwable th21) {
                                w022 = AbstractC0603a.w0(th21);
                            }
                            v02.f(w022);
                            break;
                        default:
                            C0413i c0413i23 = c0413i;
                            t6.h.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list13 = (List) obj2;
                            Object obj36 = list13.get(0);
                            t6.h.c(obj36, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView20 = (WebView) obj36;
                            Object obj37 = list13.get(1);
                            t6.h.c(obj37, "null cannot be cast to non-null type kotlin.String");
                            String str11 = (String) obj37;
                            try {
                                c0413i23.getClass();
                                webView20.removeJavascriptInterface(str11);
                                w023 = Y4.D.D(null);
                            } catch (Throwable th22) {
                                w023 = AbstractC0603a.w0(th22);
                            }
                            v02.f(w023);
                            break;
                    }
                }
            });
        } else {
            f014.M(null);
        }
        w1.F0 f015 = new w1.F0(fVar, "dev.flutter.pigeon.webview_flutter_android.WebView.evaluateJavascript", c0406b, obj, 1);
        if (c0413i != null) {
            final int i20 = 17;
            f015.M(new A5.b() { // from class: R5.N
                @Override // A5.b
                public final void i(Object obj2, V0 v02) {
                    List w02;
                    List w03;
                    List w04;
                    List w05;
                    List w06;
                    List w07;
                    List w08;
                    List w09;
                    List w010;
                    List w011;
                    List w012;
                    List w013;
                    List w014;
                    List w015;
                    List w016;
                    List w017;
                    List w018;
                    List w019;
                    List w020;
                    List w021;
                    List w022;
                    List w023;
                    switch (i20) {
                        case 0:
                            C0413i c0413i2 = c0413i;
                            t6.h.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj3 = ((List) obj2).get(0);
                            t6.h.c(obj3, "null cannot be cast to non-null type kotlin.Long");
                            try {
                                ((C0407c) c0413i2.f6174a.f3679c).a(((Long) obj3).longValue(), c0413i2.a());
                                w02 = Y4.D.D(null);
                            } catch (Throwable th) {
                                w02 = AbstractC0603a.w0(th);
                            }
                            v02.f(w02);
                            break;
                        case 1:
                            C0413i c0413i3 = c0413i;
                            t6.h.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list = (List) obj2;
                            Object obj4 = list.get(0);
                            t6.h.c(obj4, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView = (WebView) obj4;
                            DownloadListener downloadListener = (DownloadListener) list.get(1);
                            try {
                                c0413i3.getClass();
                                webView.setDownloadListener(downloadListener);
                                w03 = Y4.D.D(null);
                            } catch (Throwable th2) {
                                w03 = AbstractC0603a.w0(th2);
                            }
                            v02.f(w03);
                            break;
                        case 2:
                            C0413i c0413i4 = c0413i;
                            t6.h.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list2 = (List) obj2;
                            Object obj5 = list2.get(0);
                            t6.h.c(obj5, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView2 = (WebView) obj5;
                            Object obj6 = list2.get(1);
                            t6.h.c(obj6, "null cannot be cast to non-null type kotlin.Long");
                            try {
                                ((C0407c) c0413i4.f6174a.f3679c).a(((Long) obj6).longValue(), webView2.getSettings());
                                w04 = Y4.D.D(null);
                            } catch (Throwable th3) {
                                w04 = AbstractC0603a.w0(th3);
                            }
                            v02.f(w04);
                            break;
                        case 3:
                            C0413i c0413i5 = c0413i;
                            t6.h.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list3 = (List) obj2;
                            Object obj7 = list3.get(0);
                            t6.h.c(obj7, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView3 = (WebView) obj7;
                            Z z4 = (Z) list3.get(1);
                            try {
                                c0413i5.getClass();
                                webView3.setWebChromeClient(z4);
                                w05 = Y4.D.D(null);
                            } catch (Throwable th4) {
                                w05 = AbstractC0603a.w0(th4);
                            }
                            v02.f(w05);
                            break;
                        case 4:
                            C0413i c0413i6 = c0413i;
                            t6.h.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list4 = (List) obj2;
                            Object obj8 = list4.get(0);
                            t6.h.c(obj8, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView4 = (WebView) obj8;
                            Object obj9 = list4.get(1);
                            t6.h.c(obj9, "null cannot be cast to non-null type kotlin.Long");
                            long longValue = ((Long) obj9).longValue();
                            try {
                                c0413i6.getClass();
                                webView4.setBackgroundColor((int) longValue);
                                w06 = Y4.D.D(null);
                            } catch (Throwable th5) {
                                w06 = AbstractC0603a.w0(th5);
                            }
                            v02.f(w06);
                            break;
                        case 5:
                            C0413i c0413i7 = c0413i;
                            t6.h.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj10 = ((List) obj2).get(0);
                            t6.h.c(obj10, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView5 = (WebView) obj10;
                            try {
                                c0413i7.getClass();
                                webView5.destroy();
                                w07 = Y4.D.D(null);
                            } catch (Throwable th6) {
                                w07 = AbstractC0603a.w0(th6);
                            }
                            v02.f(w07);
                            break;
                        case 6:
                            C0413i c0413i8 = c0413i;
                            t6.h.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list5 = (List) obj2;
                            Object obj11 = list5.get(0);
                            t6.h.c(obj11, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView6 = (WebView) obj11;
                            Object obj12 = list5.get(1);
                            t6.h.c(obj12, "null cannot be cast to non-null type kotlin.String");
                            String str = (String) obj12;
                            String str2 = (String) list5.get(2);
                            String str3 = (String) list5.get(3);
                            try {
                                c0413i8.getClass();
                                webView6.loadData(str, str2, str3);
                                w08 = Y4.D.D(null);
                            } catch (Throwable th7) {
                                w08 = AbstractC0603a.w0(th7);
                            }
                            v02.f(w08);
                            break;
                        case 7:
                            C0413i c0413i9 = c0413i;
                            t6.h.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list6 = (List) obj2;
                            Object obj13 = list6.get(0);
                            t6.h.c(obj13, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView7 = (WebView) obj13;
                            String str4 = (String) list6.get(1);
                            Object obj14 = list6.get(2);
                            t6.h.c(obj14, "null cannot be cast to non-null type kotlin.String");
                            String str5 = (String) obj14;
                            String str6 = (String) list6.get(3);
                            String str7 = (String) list6.get(4);
                            String str8 = (String) list6.get(5);
                            try {
                                c0413i9.getClass();
                                webView7.loadDataWithBaseURL(str4, str5, str6, str7, str8);
                                w09 = Y4.D.D(null);
                            } catch (Throwable th8) {
                                w09 = AbstractC0603a.w0(th8);
                            }
                            v02.f(w09);
                            break;
                        case 8:
                            C0413i c0413i10 = c0413i;
                            t6.h.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list7 = (List) obj2;
                            Object obj15 = list7.get(0);
                            t6.h.c(obj15, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView8 = (WebView) obj15;
                            Object obj16 = list7.get(1);
                            t6.h.c(obj16, "null cannot be cast to non-null type kotlin.String");
                            String str9 = (String) obj16;
                            Object obj17 = list7.get(2);
                            t6.h.c(obj17, "null cannot be cast to non-null type kotlin.collections.Map<kotlin.String, kotlin.String>");
                            Map<String, String> map = (Map) obj17;
                            try {
                                c0413i10.getClass();
                                webView8.loadUrl(str9, map);
                                w010 = Y4.D.D(null);
                            } catch (Throwable th9) {
                                w010 = AbstractC0603a.w0(th9);
                            }
                            v02.f(w010);
                            break;
                        case 9:
                            C0413i c0413i11 = c0413i;
                            t6.h.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list8 = (List) obj2;
                            Object obj18 = list8.get(0);
                            t6.h.c(obj18, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView9 = (WebView) obj18;
                            Object obj19 = list8.get(1);
                            t6.h.c(obj19, "null cannot be cast to non-null type kotlin.String");
                            String str10 = (String) obj19;
                            Object obj20 = list8.get(2);
                            t6.h.c(obj20, "null cannot be cast to non-null type kotlin.ByteArray");
                            byte[] bArr = (byte[]) obj20;
                            try {
                                c0413i11.getClass();
                                webView9.postUrl(str10, bArr);
                                w011 = Y4.D.D(null);
                            } catch (Throwable th10) {
                                w011 = AbstractC0603a.w0(th10);
                            }
                            v02.f(w011);
                            break;
                        case 10:
                            C0413i c0413i12 = c0413i;
                            t6.h.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj21 = ((List) obj2).get(0);
                            t6.h.c(obj21, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView10 = (WebView) obj21;
                            try {
                                c0413i12.getClass();
                                w012 = Y4.D.D(webView10.getUrl());
                            } catch (Throwable th11) {
                                w012 = AbstractC0603a.w0(th11);
                            }
                            v02.f(w012);
                            break;
                        case 11:
                            C0413i c0413i13 = c0413i;
                            t6.h.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj22 = ((List) obj2).get(0);
                            t6.h.c(obj22, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView11 = (WebView) obj22;
                            try {
                                c0413i13.getClass();
                                webView11.goForward();
                                w013 = Y4.D.D(null);
                            } catch (Throwable th12) {
                                w013 = AbstractC0603a.w0(th12);
                            }
                            v02.f(w013);
                            break;
                        case 12:
                            C0413i c0413i14 = c0413i;
                            t6.h.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj23 = ((List) obj2).get(0);
                            t6.h.c(obj23, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView12 = (WebView) obj23;
                            try {
                                c0413i14.getClass();
                                w014 = Y4.D.D(Boolean.valueOf(webView12.canGoBack()));
                            } catch (Throwable th13) {
                                w014 = AbstractC0603a.w0(th13);
                            }
                            v02.f(w014);
                            break;
                        case 13:
                            C0413i c0413i15 = c0413i;
                            t6.h.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj24 = ((List) obj2).get(0);
                            t6.h.c(obj24, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView13 = (WebView) obj24;
                            try {
                                c0413i15.getClass();
                                w015 = Y4.D.D(Boolean.valueOf(webView13.canGoForward()));
                            } catch (Throwable th14) {
                                w015 = AbstractC0603a.w0(th14);
                            }
                            v02.f(w015);
                            break;
                        case 14:
                            C0413i c0413i16 = c0413i;
                            t6.h.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj25 = ((List) obj2).get(0);
                            t6.h.c(obj25, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView14 = (WebView) obj25;
                            try {
                                c0413i16.getClass();
                                webView14.goBack();
                                w016 = Y4.D.D(null);
                            } catch (Throwable th15) {
                                w016 = AbstractC0603a.w0(th15);
                            }
                            v02.f(w016);
                            break;
                        case 15:
                            C0413i c0413i17 = c0413i;
                            t6.h.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj26 = ((List) obj2).get(0);
                            t6.h.c(obj26, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView15 = (WebView) obj26;
                            try {
                                c0413i17.getClass();
                                webView15.reload();
                                w017 = Y4.D.D(null);
                            } catch (Throwable th16) {
                                w017 = AbstractC0603a.w0(th16);
                            }
                            v02.f(w017);
                            break;
                        case 16:
                            C0413i c0413i18 = c0413i;
                            t6.h.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list9 = (List) obj2;
                            Object obj27 = list9.get(0);
                            t6.h.c(obj27, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView16 = (WebView) obj27;
                            Object obj28 = list9.get(1);
                            t6.h.c(obj28, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean booleanValue = ((Boolean) obj28).booleanValue();
                            try {
                                c0413i18.getClass();
                                webView16.clearCache(booleanValue);
                                w018 = Y4.D.D(null);
                            } catch (Throwable th17) {
                                w018 = AbstractC0603a.w0(th17);
                            }
                            v02.f(w018);
                            break;
                        case 17:
                            t6.h.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list10 = (List) obj2;
                            Object obj29 = list10.get(0);
                            t6.h.c(obj29, "null cannot be cast to non-null type android.webkit.WebView");
                            Object obj30 = list10.get(1);
                            t6.h.c(obj30, "null cannot be cast to non-null type kotlin.String");
                            B b7 = new B(v02, 1);
                            c0413i.getClass();
                            ((WebView) obj29).evaluateJavascript((String) obj30, new C0416l(1, b7));
                            break;
                        case 18:
                            C0413i c0413i19 = c0413i;
                            t6.h.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj31 = ((List) obj2).get(0);
                            t6.h.c(obj31, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView17 = (WebView) obj31;
                            try {
                                c0413i19.getClass();
                                w019 = Y4.D.D(webView17.getTitle());
                            } catch (Throwable th18) {
                                w019 = AbstractC0603a.w0(th18);
                            }
                            v02.f(w019);
                            break;
                        case 19:
                            C0413i c0413i20 = c0413i;
                            t6.h.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj32 = ((List) obj2).get(0);
                            t6.h.c(obj32, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean booleanValue2 = ((Boolean) obj32).booleanValue();
                            try {
                                c0413i20.getClass();
                                WebView.setWebContentsDebuggingEnabled(booleanValue2);
                                w020 = Y4.D.D(null);
                            } catch (Throwable th19) {
                                w020 = AbstractC0603a.w0(th19);
                            }
                            v02.f(w020);
                            break;
                        case 20:
                            C0413i c0413i21 = c0413i;
                            t6.h.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list11 = (List) obj2;
                            Object obj33 = list11.get(0);
                            t6.h.c(obj33, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView18 = (WebView) obj33;
                            WebViewClient webViewClient = (WebViewClient) list11.get(1);
                            try {
                                c0413i21.getClass();
                                webView18.setWebViewClient(webViewClient);
                                w021 = Y4.D.D(null);
                            } catch (Throwable th20) {
                                w021 = AbstractC0603a.w0(th20);
                            }
                            v02.f(w021);
                            break;
                        case zzbbd.zzt.zzm /* 21 */:
                            C0413i c0413i22 = c0413i;
                            t6.h.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list12 = (List) obj2;
                            Object obj34 = list12.get(0);
                            t6.h.c(obj34, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView19 = (WebView) obj34;
                            Object obj35 = list12.get(1);
                            t6.h.c(obj35, "null cannot be cast to non-null type io.flutter.plugins.webviewflutter.JavaScriptChannel");
                            C0425v c0425v = (C0425v) obj35;
                            try {
                                c0413i22.getClass();
                                webView19.addJavascriptInterface(c0425v, c0425v.f6215a);
                                w022 = Y4.D.D(null);
                            } catch (Throwable th21) {
                                w022 = AbstractC0603a.w0(th21);
                            }
                            v02.f(w022);
                            break;
                        default:
                            C0413i c0413i23 = c0413i;
                            t6.h.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list13 = (List) obj2;
                            Object obj36 = list13.get(0);
                            t6.h.c(obj36, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView20 = (WebView) obj36;
                            Object obj37 = list13.get(1);
                            t6.h.c(obj37, "null cannot be cast to non-null type kotlin.String");
                            String str11 = (String) obj37;
                            try {
                                c0413i23.getClass();
                                webView20.removeJavascriptInterface(str11);
                                w023 = Y4.D.D(null);
                            } catch (Throwable th22) {
                                w023 = AbstractC0603a.w0(th22);
                            }
                            v02.f(w023);
                            break;
                    }
                }
            });
        } else {
            f015.M(null);
        }
        w1.F0 f016 = new w1.F0(fVar, "dev.flutter.pigeon.webview_flutter_android.WebView.getTitle", c0406b, obj, 1);
        if (c0413i != null) {
            final int i21 = 18;
            f016.M(new A5.b() { // from class: R5.N
                @Override // A5.b
                public final void i(Object obj2, V0 v02) {
                    List w02;
                    List w03;
                    List w04;
                    List w05;
                    List w06;
                    List w07;
                    List w08;
                    List w09;
                    List w010;
                    List w011;
                    List w012;
                    List w013;
                    List w014;
                    List w015;
                    List w016;
                    List w017;
                    List w018;
                    List w019;
                    List w020;
                    List w021;
                    List w022;
                    List w023;
                    switch (i21) {
                        case 0:
                            C0413i c0413i2 = c0413i;
                            t6.h.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj3 = ((List) obj2).get(0);
                            t6.h.c(obj3, "null cannot be cast to non-null type kotlin.Long");
                            try {
                                ((C0407c) c0413i2.f6174a.f3679c).a(((Long) obj3).longValue(), c0413i2.a());
                                w02 = Y4.D.D(null);
                            } catch (Throwable th) {
                                w02 = AbstractC0603a.w0(th);
                            }
                            v02.f(w02);
                            break;
                        case 1:
                            C0413i c0413i3 = c0413i;
                            t6.h.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list = (List) obj2;
                            Object obj4 = list.get(0);
                            t6.h.c(obj4, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView = (WebView) obj4;
                            DownloadListener downloadListener = (DownloadListener) list.get(1);
                            try {
                                c0413i3.getClass();
                                webView.setDownloadListener(downloadListener);
                                w03 = Y4.D.D(null);
                            } catch (Throwable th2) {
                                w03 = AbstractC0603a.w0(th2);
                            }
                            v02.f(w03);
                            break;
                        case 2:
                            C0413i c0413i4 = c0413i;
                            t6.h.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list2 = (List) obj2;
                            Object obj5 = list2.get(0);
                            t6.h.c(obj5, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView2 = (WebView) obj5;
                            Object obj6 = list2.get(1);
                            t6.h.c(obj6, "null cannot be cast to non-null type kotlin.Long");
                            try {
                                ((C0407c) c0413i4.f6174a.f3679c).a(((Long) obj6).longValue(), webView2.getSettings());
                                w04 = Y4.D.D(null);
                            } catch (Throwable th3) {
                                w04 = AbstractC0603a.w0(th3);
                            }
                            v02.f(w04);
                            break;
                        case 3:
                            C0413i c0413i5 = c0413i;
                            t6.h.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list3 = (List) obj2;
                            Object obj7 = list3.get(0);
                            t6.h.c(obj7, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView3 = (WebView) obj7;
                            Z z4 = (Z) list3.get(1);
                            try {
                                c0413i5.getClass();
                                webView3.setWebChromeClient(z4);
                                w05 = Y4.D.D(null);
                            } catch (Throwable th4) {
                                w05 = AbstractC0603a.w0(th4);
                            }
                            v02.f(w05);
                            break;
                        case 4:
                            C0413i c0413i6 = c0413i;
                            t6.h.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list4 = (List) obj2;
                            Object obj8 = list4.get(0);
                            t6.h.c(obj8, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView4 = (WebView) obj8;
                            Object obj9 = list4.get(1);
                            t6.h.c(obj9, "null cannot be cast to non-null type kotlin.Long");
                            long longValue = ((Long) obj9).longValue();
                            try {
                                c0413i6.getClass();
                                webView4.setBackgroundColor((int) longValue);
                                w06 = Y4.D.D(null);
                            } catch (Throwable th5) {
                                w06 = AbstractC0603a.w0(th5);
                            }
                            v02.f(w06);
                            break;
                        case 5:
                            C0413i c0413i7 = c0413i;
                            t6.h.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj10 = ((List) obj2).get(0);
                            t6.h.c(obj10, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView5 = (WebView) obj10;
                            try {
                                c0413i7.getClass();
                                webView5.destroy();
                                w07 = Y4.D.D(null);
                            } catch (Throwable th6) {
                                w07 = AbstractC0603a.w0(th6);
                            }
                            v02.f(w07);
                            break;
                        case 6:
                            C0413i c0413i8 = c0413i;
                            t6.h.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list5 = (List) obj2;
                            Object obj11 = list5.get(0);
                            t6.h.c(obj11, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView6 = (WebView) obj11;
                            Object obj12 = list5.get(1);
                            t6.h.c(obj12, "null cannot be cast to non-null type kotlin.String");
                            String str = (String) obj12;
                            String str2 = (String) list5.get(2);
                            String str3 = (String) list5.get(3);
                            try {
                                c0413i8.getClass();
                                webView6.loadData(str, str2, str3);
                                w08 = Y4.D.D(null);
                            } catch (Throwable th7) {
                                w08 = AbstractC0603a.w0(th7);
                            }
                            v02.f(w08);
                            break;
                        case 7:
                            C0413i c0413i9 = c0413i;
                            t6.h.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list6 = (List) obj2;
                            Object obj13 = list6.get(0);
                            t6.h.c(obj13, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView7 = (WebView) obj13;
                            String str4 = (String) list6.get(1);
                            Object obj14 = list6.get(2);
                            t6.h.c(obj14, "null cannot be cast to non-null type kotlin.String");
                            String str5 = (String) obj14;
                            String str6 = (String) list6.get(3);
                            String str7 = (String) list6.get(4);
                            String str8 = (String) list6.get(5);
                            try {
                                c0413i9.getClass();
                                webView7.loadDataWithBaseURL(str4, str5, str6, str7, str8);
                                w09 = Y4.D.D(null);
                            } catch (Throwable th8) {
                                w09 = AbstractC0603a.w0(th8);
                            }
                            v02.f(w09);
                            break;
                        case 8:
                            C0413i c0413i10 = c0413i;
                            t6.h.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list7 = (List) obj2;
                            Object obj15 = list7.get(0);
                            t6.h.c(obj15, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView8 = (WebView) obj15;
                            Object obj16 = list7.get(1);
                            t6.h.c(obj16, "null cannot be cast to non-null type kotlin.String");
                            String str9 = (String) obj16;
                            Object obj17 = list7.get(2);
                            t6.h.c(obj17, "null cannot be cast to non-null type kotlin.collections.Map<kotlin.String, kotlin.String>");
                            Map<String, String> map = (Map) obj17;
                            try {
                                c0413i10.getClass();
                                webView8.loadUrl(str9, map);
                                w010 = Y4.D.D(null);
                            } catch (Throwable th9) {
                                w010 = AbstractC0603a.w0(th9);
                            }
                            v02.f(w010);
                            break;
                        case 9:
                            C0413i c0413i11 = c0413i;
                            t6.h.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list8 = (List) obj2;
                            Object obj18 = list8.get(0);
                            t6.h.c(obj18, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView9 = (WebView) obj18;
                            Object obj19 = list8.get(1);
                            t6.h.c(obj19, "null cannot be cast to non-null type kotlin.String");
                            String str10 = (String) obj19;
                            Object obj20 = list8.get(2);
                            t6.h.c(obj20, "null cannot be cast to non-null type kotlin.ByteArray");
                            byte[] bArr = (byte[]) obj20;
                            try {
                                c0413i11.getClass();
                                webView9.postUrl(str10, bArr);
                                w011 = Y4.D.D(null);
                            } catch (Throwable th10) {
                                w011 = AbstractC0603a.w0(th10);
                            }
                            v02.f(w011);
                            break;
                        case 10:
                            C0413i c0413i12 = c0413i;
                            t6.h.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj21 = ((List) obj2).get(0);
                            t6.h.c(obj21, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView10 = (WebView) obj21;
                            try {
                                c0413i12.getClass();
                                w012 = Y4.D.D(webView10.getUrl());
                            } catch (Throwable th11) {
                                w012 = AbstractC0603a.w0(th11);
                            }
                            v02.f(w012);
                            break;
                        case 11:
                            C0413i c0413i13 = c0413i;
                            t6.h.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj22 = ((List) obj2).get(0);
                            t6.h.c(obj22, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView11 = (WebView) obj22;
                            try {
                                c0413i13.getClass();
                                webView11.goForward();
                                w013 = Y4.D.D(null);
                            } catch (Throwable th12) {
                                w013 = AbstractC0603a.w0(th12);
                            }
                            v02.f(w013);
                            break;
                        case 12:
                            C0413i c0413i14 = c0413i;
                            t6.h.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj23 = ((List) obj2).get(0);
                            t6.h.c(obj23, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView12 = (WebView) obj23;
                            try {
                                c0413i14.getClass();
                                w014 = Y4.D.D(Boolean.valueOf(webView12.canGoBack()));
                            } catch (Throwable th13) {
                                w014 = AbstractC0603a.w0(th13);
                            }
                            v02.f(w014);
                            break;
                        case 13:
                            C0413i c0413i15 = c0413i;
                            t6.h.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj24 = ((List) obj2).get(0);
                            t6.h.c(obj24, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView13 = (WebView) obj24;
                            try {
                                c0413i15.getClass();
                                w015 = Y4.D.D(Boolean.valueOf(webView13.canGoForward()));
                            } catch (Throwable th14) {
                                w015 = AbstractC0603a.w0(th14);
                            }
                            v02.f(w015);
                            break;
                        case 14:
                            C0413i c0413i16 = c0413i;
                            t6.h.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj25 = ((List) obj2).get(0);
                            t6.h.c(obj25, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView14 = (WebView) obj25;
                            try {
                                c0413i16.getClass();
                                webView14.goBack();
                                w016 = Y4.D.D(null);
                            } catch (Throwable th15) {
                                w016 = AbstractC0603a.w0(th15);
                            }
                            v02.f(w016);
                            break;
                        case 15:
                            C0413i c0413i17 = c0413i;
                            t6.h.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj26 = ((List) obj2).get(0);
                            t6.h.c(obj26, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView15 = (WebView) obj26;
                            try {
                                c0413i17.getClass();
                                webView15.reload();
                                w017 = Y4.D.D(null);
                            } catch (Throwable th16) {
                                w017 = AbstractC0603a.w0(th16);
                            }
                            v02.f(w017);
                            break;
                        case 16:
                            C0413i c0413i18 = c0413i;
                            t6.h.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list9 = (List) obj2;
                            Object obj27 = list9.get(0);
                            t6.h.c(obj27, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView16 = (WebView) obj27;
                            Object obj28 = list9.get(1);
                            t6.h.c(obj28, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean booleanValue = ((Boolean) obj28).booleanValue();
                            try {
                                c0413i18.getClass();
                                webView16.clearCache(booleanValue);
                                w018 = Y4.D.D(null);
                            } catch (Throwable th17) {
                                w018 = AbstractC0603a.w0(th17);
                            }
                            v02.f(w018);
                            break;
                        case 17:
                            t6.h.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list10 = (List) obj2;
                            Object obj29 = list10.get(0);
                            t6.h.c(obj29, "null cannot be cast to non-null type android.webkit.WebView");
                            Object obj30 = list10.get(1);
                            t6.h.c(obj30, "null cannot be cast to non-null type kotlin.String");
                            B b7 = new B(v02, 1);
                            c0413i.getClass();
                            ((WebView) obj29).evaluateJavascript((String) obj30, new C0416l(1, b7));
                            break;
                        case 18:
                            C0413i c0413i19 = c0413i;
                            t6.h.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj31 = ((List) obj2).get(0);
                            t6.h.c(obj31, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView17 = (WebView) obj31;
                            try {
                                c0413i19.getClass();
                                w019 = Y4.D.D(webView17.getTitle());
                            } catch (Throwable th18) {
                                w019 = AbstractC0603a.w0(th18);
                            }
                            v02.f(w019);
                            break;
                        case 19:
                            C0413i c0413i20 = c0413i;
                            t6.h.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj32 = ((List) obj2).get(0);
                            t6.h.c(obj32, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean booleanValue2 = ((Boolean) obj32).booleanValue();
                            try {
                                c0413i20.getClass();
                                WebView.setWebContentsDebuggingEnabled(booleanValue2);
                                w020 = Y4.D.D(null);
                            } catch (Throwable th19) {
                                w020 = AbstractC0603a.w0(th19);
                            }
                            v02.f(w020);
                            break;
                        case 20:
                            C0413i c0413i21 = c0413i;
                            t6.h.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list11 = (List) obj2;
                            Object obj33 = list11.get(0);
                            t6.h.c(obj33, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView18 = (WebView) obj33;
                            WebViewClient webViewClient = (WebViewClient) list11.get(1);
                            try {
                                c0413i21.getClass();
                                webView18.setWebViewClient(webViewClient);
                                w021 = Y4.D.D(null);
                            } catch (Throwable th20) {
                                w021 = AbstractC0603a.w0(th20);
                            }
                            v02.f(w021);
                            break;
                        case zzbbd.zzt.zzm /* 21 */:
                            C0413i c0413i22 = c0413i;
                            t6.h.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list12 = (List) obj2;
                            Object obj34 = list12.get(0);
                            t6.h.c(obj34, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView19 = (WebView) obj34;
                            Object obj35 = list12.get(1);
                            t6.h.c(obj35, "null cannot be cast to non-null type io.flutter.plugins.webviewflutter.JavaScriptChannel");
                            C0425v c0425v = (C0425v) obj35;
                            try {
                                c0413i22.getClass();
                                webView19.addJavascriptInterface(c0425v, c0425v.f6215a);
                                w022 = Y4.D.D(null);
                            } catch (Throwable th21) {
                                w022 = AbstractC0603a.w0(th21);
                            }
                            v02.f(w022);
                            break;
                        default:
                            C0413i c0413i23 = c0413i;
                            t6.h.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list13 = (List) obj2;
                            Object obj36 = list13.get(0);
                            t6.h.c(obj36, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView20 = (WebView) obj36;
                            Object obj37 = list13.get(1);
                            t6.h.c(obj37, "null cannot be cast to non-null type kotlin.String");
                            String str11 = (String) obj37;
                            try {
                                c0413i23.getClass();
                                webView20.removeJavascriptInterface(str11);
                                w023 = Y4.D.D(null);
                            } catch (Throwable th22) {
                                w023 = AbstractC0603a.w0(th22);
                            }
                            v02.f(w023);
                            break;
                    }
                }
            });
        } else {
            f016.M(null);
        }
        w1.F0 f017 = new w1.F0(fVar, "dev.flutter.pigeon.webview_flutter_android.WebView.setWebContentsDebuggingEnabled", c0406b, obj, 1);
        if (c0413i != null) {
            final int i22 = 19;
            f017.M(new A5.b() { // from class: R5.N
                @Override // A5.b
                public final void i(Object obj2, V0 v02) {
                    List w02;
                    List w03;
                    List w04;
                    List w05;
                    List w06;
                    List w07;
                    List w08;
                    List w09;
                    List w010;
                    List w011;
                    List w012;
                    List w013;
                    List w014;
                    List w015;
                    List w016;
                    List w017;
                    List w018;
                    List w019;
                    List w020;
                    List w021;
                    List w022;
                    List w023;
                    switch (i22) {
                        case 0:
                            C0413i c0413i2 = c0413i;
                            t6.h.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj3 = ((List) obj2).get(0);
                            t6.h.c(obj3, "null cannot be cast to non-null type kotlin.Long");
                            try {
                                ((C0407c) c0413i2.f6174a.f3679c).a(((Long) obj3).longValue(), c0413i2.a());
                                w02 = Y4.D.D(null);
                            } catch (Throwable th) {
                                w02 = AbstractC0603a.w0(th);
                            }
                            v02.f(w02);
                            break;
                        case 1:
                            C0413i c0413i3 = c0413i;
                            t6.h.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list = (List) obj2;
                            Object obj4 = list.get(0);
                            t6.h.c(obj4, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView = (WebView) obj4;
                            DownloadListener downloadListener = (DownloadListener) list.get(1);
                            try {
                                c0413i3.getClass();
                                webView.setDownloadListener(downloadListener);
                                w03 = Y4.D.D(null);
                            } catch (Throwable th2) {
                                w03 = AbstractC0603a.w0(th2);
                            }
                            v02.f(w03);
                            break;
                        case 2:
                            C0413i c0413i4 = c0413i;
                            t6.h.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list2 = (List) obj2;
                            Object obj5 = list2.get(0);
                            t6.h.c(obj5, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView2 = (WebView) obj5;
                            Object obj6 = list2.get(1);
                            t6.h.c(obj6, "null cannot be cast to non-null type kotlin.Long");
                            try {
                                ((C0407c) c0413i4.f6174a.f3679c).a(((Long) obj6).longValue(), webView2.getSettings());
                                w04 = Y4.D.D(null);
                            } catch (Throwable th3) {
                                w04 = AbstractC0603a.w0(th3);
                            }
                            v02.f(w04);
                            break;
                        case 3:
                            C0413i c0413i5 = c0413i;
                            t6.h.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list3 = (List) obj2;
                            Object obj7 = list3.get(0);
                            t6.h.c(obj7, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView3 = (WebView) obj7;
                            Z z4 = (Z) list3.get(1);
                            try {
                                c0413i5.getClass();
                                webView3.setWebChromeClient(z4);
                                w05 = Y4.D.D(null);
                            } catch (Throwable th4) {
                                w05 = AbstractC0603a.w0(th4);
                            }
                            v02.f(w05);
                            break;
                        case 4:
                            C0413i c0413i6 = c0413i;
                            t6.h.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list4 = (List) obj2;
                            Object obj8 = list4.get(0);
                            t6.h.c(obj8, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView4 = (WebView) obj8;
                            Object obj9 = list4.get(1);
                            t6.h.c(obj9, "null cannot be cast to non-null type kotlin.Long");
                            long longValue = ((Long) obj9).longValue();
                            try {
                                c0413i6.getClass();
                                webView4.setBackgroundColor((int) longValue);
                                w06 = Y4.D.D(null);
                            } catch (Throwable th5) {
                                w06 = AbstractC0603a.w0(th5);
                            }
                            v02.f(w06);
                            break;
                        case 5:
                            C0413i c0413i7 = c0413i;
                            t6.h.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj10 = ((List) obj2).get(0);
                            t6.h.c(obj10, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView5 = (WebView) obj10;
                            try {
                                c0413i7.getClass();
                                webView5.destroy();
                                w07 = Y4.D.D(null);
                            } catch (Throwable th6) {
                                w07 = AbstractC0603a.w0(th6);
                            }
                            v02.f(w07);
                            break;
                        case 6:
                            C0413i c0413i8 = c0413i;
                            t6.h.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list5 = (List) obj2;
                            Object obj11 = list5.get(0);
                            t6.h.c(obj11, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView6 = (WebView) obj11;
                            Object obj12 = list5.get(1);
                            t6.h.c(obj12, "null cannot be cast to non-null type kotlin.String");
                            String str = (String) obj12;
                            String str2 = (String) list5.get(2);
                            String str3 = (String) list5.get(3);
                            try {
                                c0413i8.getClass();
                                webView6.loadData(str, str2, str3);
                                w08 = Y4.D.D(null);
                            } catch (Throwable th7) {
                                w08 = AbstractC0603a.w0(th7);
                            }
                            v02.f(w08);
                            break;
                        case 7:
                            C0413i c0413i9 = c0413i;
                            t6.h.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list6 = (List) obj2;
                            Object obj13 = list6.get(0);
                            t6.h.c(obj13, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView7 = (WebView) obj13;
                            String str4 = (String) list6.get(1);
                            Object obj14 = list6.get(2);
                            t6.h.c(obj14, "null cannot be cast to non-null type kotlin.String");
                            String str5 = (String) obj14;
                            String str6 = (String) list6.get(3);
                            String str7 = (String) list6.get(4);
                            String str8 = (String) list6.get(5);
                            try {
                                c0413i9.getClass();
                                webView7.loadDataWithBaseURL(str4, str5, str6, str7, str8);
                                w09 = Y4.D.D(null);
                            } catch (Throwable th8) {
                                w09 = AbstractC0603a.w0(th8);
                            }
                            v02.f(w09);
                            break;
                        case 8:
                            C0413i c0413i10 = c0413i;
                            t6.h.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list7 = (List) obj2;
                            Object obj15 = list7.get(0);
                            t6.h.c(obj15, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView8 = (WebView) obj15;
                            Object obj16 = list7.get(1);
                            t6.h.c(obj16, "null cannot be cast to non-null type kotlin.String");
                            String str9 = (String) obj16;
                            Object obj17 = list7.get(2);
                            t6.h.c(obj17, "null cannot be cast to non-null type kotlin.collections.Map<kotlin.String, kotlin.String>");
                            Map<String, String> map = (Map) obj17;
                            try {
                                c0413i10.getClass();
                                webView8.loadUrl(str9, map);
                                w010 = Y4.D.D(null);
                            } catch (Throwable th9) {
                                w010 = AbstractC0603a.w0(th9);
                            }
                            v02.f(w010);
                            break;
                        case 9:
                            C0413i c0413i11 = c0413i;
                            t6.h.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list8 = (List) obj2;
                            Object obj18 = list8.get(0);
                            t6.h.c(obj18, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView9 = (WebView) obj18;
                            Object obj19 = list8.get(1);
                            t6.h.c(obj19, "null cannot be cast to non-null type kotlin.String");
                            String str10 = (String) obj19;
                            Object obj20 = list8.get(2);
                            t6.h.c(obj20, "null cannot be cast to non-null type kotlin.ByteArray");
                            byte[] bArr = (byte[]) obj20;
                            try {
                                c0413i11.getClass();
                                webView9.postUrl(str10, bArr);
                                w011 = Y4.D.D(null);
                            } catch (Throwable th10) {
                                w011 = AbstractC0603a.w0(th10);
                            }
                            v02.f(w011);
                            break;
                        case 10:
                            C0413i c0413i12 = c0413i;
                            t6.h.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj21 = ((List) obj2).get(0);
                            t6.h.c(obj21, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView10 = (WebView) obj21;
                            try {
                                c0413i12.getClass();
                                w012 = Y4.D.D(webView10.getUrl());
                            } catch (Throwable th11) {
                                w012 = AbstractC0603a.w0(th11);
                            }
                            v02.f(w012);
                            break;
                        case 11:
                            C0413i c0413i13 = c0413i;
                            t6.h.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj22 = ((List) obj2).get(0);
                            t6.h.c(obj22, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView11 = (WebView) obj22;
                            try {
                                c0413i13.getClass();
                                webView11.goForward();
                                w013 = Y4.D.D(null);
                            } catch (Throwable th12) {
                                w013 = AbstractC0603a.w0(th12);
                            }
                            v02.f(w013);
                            break;
                        case 12:
                            C0413i c0413i14 = c0413i;
                            t6.h.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj23 = ((List) obj2).get(0);
                            t6.h.c(obj23, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView12 = (WebView) obj23;
                            try {
                                c0413i14.getClass();
                                w014 = Y4.D.D(Boolean.valueOf(webView12.canGoBack()));
                            } catch (Throwable th13) {
                                w014 = AbstractC0603a.w0(th13);
                            }
                            v02.f(w014);
                            break;
                        case 13:
                            C0413i c0413i15 = c0413i;
                            t6.h.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj24 = ((List) obj2).get(0);
                            t6.h.c(obj24, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView13 = (WebView) obj24;
                            try {
                                c0413i15.getClass();
                                w015 = Y4.D.D(Boolean.valueOf(webView13.canGoForward()));
                            } catch (Throwable th14) {
                                w015 = AbstractC0603a.w0(th14);
                            }
                            v02.f(w015);
                            break;
                        case 14:
                            C0413i c0413i16 = c0413i;
                            t6.h.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj25 = ((List) obj2).get(0);
                            t6.h.c(obj25, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView14 = (WebView) obj25;
                            try {
                                c0413i16.getClass();
                                webView14.goBack();
                                w016 = Y4.D.D(null);
                            } catch (Throwable th15) {
                                w016 = AbstractC0603a.w0(th15);
                            }
                            v02.f(w016);
                            break;
                        case 15:
                            C0413i c0413i17 = c0413i;
                            t6.h.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj26 = ((List) obj2).get(0);
                            t6.h.c(obj26, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView15 = (WebView) obj26;
                            try {
                                c0413i17.getClass();
                                webView15.reload();
                                w017 = Y4.D.D(null);
                            } catch (Throwable th16) {
                                w017 = AbstractC0603a.w0(th16);
                            }
                            v02.f(w017);
                            break;
                        case 16:
                            C0413i c0413i18 = c0413i;
                            t6.h.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list9 = (List) obj2;
                            Object obj27 = list9.get(0);
                            t6.h.c(obj27, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView16 = (WebView) obj27;
                            Object obj28 = list9.get(1);
                            t6.h.c(obj28, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean booleanValue = ((Boolean) obj28).booleanValue();
                            try {
                                c0413i18.getClass();
                                webView16.clearCache(booleanValue);
                                w018 = Y4.D.D(null);
                            } catch (Throwable th17) {
                                w018 = AbstractC0603a.w0(th17);
                            }
                            v02.f(w018);
                            break;
                        case 17:
                            t6.h.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list10 = (List) obj2;
                            Object obj29 = list10.get(0);
                            t6.h.c(obj29, "null cannot be cast to non-null type android.webkit.WebView");
                            Object obj30 = list10.get(1);
                            t6.h.c(obj30, "null cannot be cast to non-null type kotlin.String");
                            B b7 = new B(v02, 1);
                            c0413i.getClass();
                            ((WebView) obj29).evaluateJavascript((String) obj30, new C0416l(1, b7));
                            break;
                        case 18:
                            C0413i c0413i19 = c0413i;
                            t6.h.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj31 = ((List) obj2).get(0);
                            t6.h.c(obj31, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView17 = (WebView) obj31;
                            try {
                                c0413i19.getClass();
                                w019 = Y4.D.D(webView17.getTitle());
                            } catch (Throwable th18) {
                                w019 = AbstractC0603a.w0(th18);
                            }
                            v02.f(w019);
                            break;
                        case 19:
                            C0413i c0413i20 = c0413i;
                            t6.h.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj32 = ((List) obj2).get(0);
                            t6.h.c(obj32, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean booleanValue2 = ((Boolean) obj32).booleanValue();
                            try {
                                c0413i20.getClass();
                                WebView.setWebContentsDebuggingEnabled(booleanValue2);
                                w020 = Y4.D.D(null);
                            } catch (Throwable th19) {
                                w020 = AbstractC0603a.w0(th19);
                            }
                            v02.f(w020);
                            break;
                        case 20:
                            C0413i c0413i21 = c0413i;
                            t6.h.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list11 = (List) obj2;
                            Object obj33 = list11.get(0);
                            t6.h.c(obj33, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView18 = (WebView) obj33;
                            WebViewClient webViewClient = (WebViewClient) list11.get(1);
                            try {
                                c0413i21.getClass();
                                webView18.setWebViewClient(webViewClient);
                                w021 = Y4.D.D(null);
                            } catch (Throwable th20) {
                                w021 = AbstractC0603a.w0(th20);
                            }
                            v02.f(w021);
                            break;
                        case zzbbd.zzt.zzm /* 21 */:
                            C0413i c0413i22 = c0413i;
                            t6.h.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list12 = (List) obj2;
                            Object obj34 = list12.get(0);
                            t6.h.c(obj34, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView19 = (WebView) obj34;
                            Object obj35 = list12.get(1);
                            t6.h.c(obj35, "null cannot be cast to non-null type io.flutter.plugins.webviewflutter.JavaScriptChannel");
                            C0425v c0425v = (C0425v) obj35;
                            try {
                                c0413i22.getClass();
                                webView19.addJavascriptInterface(c0425v, c0425v.f6215a);
                                w022 = Y4.D.D(null);
                            } catch (Throwable th21) {
                                w022 = AbstractC0603a.w0(th21);
                            }
                            v02.f(w022);
                            break;
                        default:
                            C0413i c0413i23 = c0413i;
                            t6.h.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list13 = (List) obj2;
                            Object obj36 = list13.get(0);
                            t6.h.c(obj36, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView20 = (WebView) obj36;
                            Object obj37 = list13.get(1);
                            t6.h.c(obj37, "null cannot be cast to non-null type kotlin.String");
                            String str11 = (String) obj37;
                            try {
                                c0413i23.getClass();
                                webView20.removeJavascriptInterface(str11);
                                w023 = Y4.D.D(null);
                            } catch (Throwable th22) {
                                w023 = AbstractC0603a.w0(th22);
                            }
                            v02.f(w023);
                            break;
                    }
                }
            });
        } else {
            f017.M(null);
        }
        w1.F0 f018 = new w1.F0(fVar, "dev.flutter.pigeon.webview_flutter_android.WebView.setWebViewClient", c0406b, obj, 1);
        if (c0413i != null) {
            final int i23 = 20;
            f018.M(new A5.b() { // from class: R5.N
                @Override // A5.b
                public final void i(Object obj2, V0 v02) {
                    List w02;
                    List w03;
                    List w04;
                    List w05;
                    List w06;
                    List w07;
                    List w08;
                    List w09;
                    List w010;
                    List w011;
                    List w012;
                    List w013;
                    List w014;
                    List w015;
                    List w016;
                    List w017;
                    List w018;
                    List w019;
                    List w020;
                    List w021;
                    List w022;
                    List w023;
                    switch (i23) {
                        case 0:
                            C0413i c0413i2 = c0413i;
                            t6.h.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj3 = ((List) obj2).get(0);
                            t6.h.c(obj3, "null cannot be cast to non-null type kotlin.Long");
                            try {
                                ((C0407c) c0413i2.f6174a.f3679c).a(((Long) obj3).longValue(), c0413i2.a());
                                w02 = Y4.D.D(null);
                            } catch (Throwable th) {
                                w02 = AbstractC0603a.w0(th);
                            }
                            v02.f(w02);
                            break;
                        case 1:
                            C0413i c0413i3 = c0413i;
                            t6.h.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list = (List) obj2;
                            Object obj4 = list.get(0);
                            t6.h.c(obj4, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView = (WebView) obj4;
                            DownloadListener downloadListener = (DownloadListener) list.get(1);
                            try {
                                c0413i3.getClass();
                                webView.setDownloadListener(downloadListener);
                                w03 = Y4.D.D(null);
                            } catch (Throwable th2) {
                                w03 = AbstractC0603a.w0(th2);
                            }
                            v02.f(w03);
                            break;
                        case 2:
                            C0413i c0413i4 = c0413i;
                            t6.h.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list2 = (List) obj2;
                            Object obj5 = list2.get(0);
                            t6.h.c(obj5, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView2 = (WebView) obj5;
                            Object obj6 = list2.get(1);
                            t6.h.c(obj6, "null cannot be cast to non-null type kotlin.Long");
                            try {
                                ((C0407c) c0413i4.f6174a.f3679c).a(((Long) obj6).longValue(), webView2.getSettings());
                                w04 = Y4.D.D(null);
                            } catch (Throwable th3) {
                                w04 = AbstractC0603a.w0(th3);
                            }
                            v02.f(w04);
                            break;
                        case 3:
                            C0413i c0413i5 = c0413i;
                            t6.h.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list3 = (List) obj2;
                            Object obj7 = list3.get(0);
                            t6.h.c(obj7, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView3 = (WebView) obj7;
                            Z z4 = (Z) list3.get(1);
                            try {
                                c0413i5.getClass();
                                webView3.setWebChromeClient(z4);
                                w05 = Y4.D.D(null);
                            } catch (Throwable th4) {
                                w05 = AbstractC0603a.w0(th4);
                            }
                            v02.f(w05);
                            break;
                        case 4:
                            C0413i c0413i6 = c0413i;
                            t6.h.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list4 = (List) obj2;
                            Object obj8 = list4.get(0);
                            t6.h.c(obj8, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView4 = (WebView) obj8;
                            Object obj9 = list4.get(1);
                            t6.h.c(obj9, "null cannot be cast to non-null type kotlin.Long");
                            long longValue = ((Long) obj9).longValue();
                            try {
                                c0413i6.getClass();
                                webView4.setBackgroundColor((int) longValue);
                                w06 = Y4.D.D(null);
                            } catch (Throwable th5) {
                                w06 = AbstractC0603a.w0(th5);
                            }
                            v02.f(w06);
                            break;
                        case 5:
                            C0413i c0413i7 = c0413i;
                            t6.h.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj10 = ((List) obj2).get(0);
                            t6.h.c(obj10, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView5 = (WebView) obj10;
                            try {
                                c0413i7.getClass();
                                webView5.destroy();
                                w07 = Y4.D.D(null);
                            } catch (Throwable th6) {
                                w07 = AbstractC0603a.w0(th6);
                            }
                            v02.f(w07);
                            break;
                        case 6:
                            C0413i c0413i8 = c0413i;
                            t6.h.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list5 = (List) obj2;
                            Object obj11 = list5.get(0);
                            t6.h.c(obj11, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView6 = (WebView) obj11;
                            Object obj12 = list5.get(1);
                            t6.h.c(obj12, "null cannot be cast to non-null type kotlin.String");
                            String str = (String) obj12;
                            String str2 = (String) list5.get(2);
                            String str3 = (String) list5.get(3);
                            try {
                                c0413i8.getClass();
                                webView6.loadData(str, str2, str3);
                                w08 = Y4.D.D(null);
                            } catch (Throwable th7) {
                                w08 = AbstractC0603a.w0(th7);
                            }
                            v02.f(w08);
                            break;
                        case 7:
                            C0413i c0413i9 = c0413i;
                            t6.h.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list6 = (List) obj2;
                            Object obj13 = list6.get(0);
                            t6.h.c(obj13, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView7 = (WebView) obj13;
                            String str4 = (String) list6.get(1);
                            Object obj14 = list6.get(2);
                            t6.h.c(obj14, "null cannot be cast to non-null type kotlin.String");
                            String str5 = (String) obj14;
                            String str6 = (String) list6.get(3);
                            String str7 = (String) list6.get(4);
                            String str8 = (String) list6.get(5);
                            try {
                                c0413i9.getClass();
                                webView7.loadDataWithBaseURL(str4, str5, str6, str7, str8);
                                w09 = Y4.D.D(null);
                            } catch (Throwable th8) {
                                w09 = AbstractC0603a.w0(th8);
                            }
                            v02.f(w09);
                            break;
                        case 8:
                            C0413i c0413i10 = c0413i;
                            t6.h.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list7 = (List) obj2;
                            Object obj15 = list7.get(0);
                            t6.h.c(obj15, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView8 = (WebView) obj15;
                            Object obj16 = list7.get(1);
                            t6.h.c(obj16, "null cannot be cast to non-null type kotlin.String");
                            String str9 = (String) obj16;
                            Object obj17 = list7.get(2);
                            t6.h.c(obj17, "null cannot be cast to non-null type kotlin.collections.Map<kotlin.String, kotlin.String>");
                            Map<String, String> map = (Map) obj17;
                            try {
                                c0413i10.getClass();
                                webView8.loadUrl(str9, map);
                                w010 = Y4.D.D(null);
                            } catch (Throwable th9) {
                                w010 = AbstractC0603a.w0(th9);
                            }
                            v02.f(w010);
                            break;
                        case 9:
                            C0413i c0413i11 = c0413i;
                            t6.h.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list8 = (List) obj2;
                            Object obj18 = list8.get(0);
                            t6.h.c(obj18, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView9 = (WebView) obj18;
                            Object obj19 = list8.get(1);
                            t6.h.c(obj19, "null cannot be cast to non-null type kotlin.String");
                            String str10 = (String) obj19;
                            Object obj20 = list8.get(2);
                            t6.h.c(obj20, "null cannot be cast to non-null type kotlin.ByteArray");
                            byte[] bArr = (byte[]) obj20;
                            try {
                                c0413i11.getClass();
                                webView9.postUrl(str10, bArr);
                                w011 = Y4.D.D(null);
                            } catch (Throwable th10) {
                                w011 = AbstractC0603a.w0(th10);
                            }
                            v02.f(w011);
                            break;
                        case 10:
                            C0413i c0413i12 = c0413i;
                            t6.h.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj21 = ((List) obj2).get(0);
                            t6.h.c(obj21, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView10 = (WebView) obj21;
                            try {
                                c0413i12.getClass();
                                w012 = Y4.D.D(webView10.getUrl());
                            } catch (Throwable th11) {
                                w012 = AbstractC0603a.w0(th11);
                            }
                            v02.f(w012);
                            break;
                        case 11:
                            C0413i c0413i13 = c0413i;
                            t6.h.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj22 = ((List) obj2).get(0);
                            t6.h.c(obj22, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView11 = (WebView) obj22;
                            try {
                                c0413i13.getClass();
                                webView11.goForward();
                                w013 = Y4.D.D(null);
                            } catch (Throwable th12) {
                                w013 = AbstractC0603a.w0(th12);
                            }
                            v02.f(w013);
                            break;
                        case 12:
                            C0413i c0413i14 = c0413i;
                            t6.h.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj23 = ((List) obj2).get(0);
                            t6.h.c(obj23, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView12 = (WebView) obj23;
                            try {
                                c0413i14.getClass();
                                w014 = Y4.D.D(Boolean.valueOf(webView12.canGoBack()));
                            } catch (Throwable th13) {
                                w014 = AbstractC0603a.w0(th13);
                            }
                            v02.f(w014);
                            break;
                        case 13:
                            C0413i c0413i15 = c0413i;
                            t6.h.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj24 = ((List) obj2).get(0);
                            t6.h.c(obj24, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView13 = (WebView) obj24;
                            try {
                                c0413i15.getClass();
                                w015 = Y4.D.D(Boolean.valueOf(webView13.canGoForward()));
                            } catch (Throwable th14) {
                                w015 = AbstractC0603a.w0(th14);
                            }
                            v02.f(w015);
                            break;
                        case 14:
                            C0413i c0413i16 = c0413i;
                            t6.h.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj25 = ((List) obj2).get(0);
                            t6.h.c(obj25, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView14 = (WebView) obj25;
                            try {
                                c0413i16.getClass();
                                webView14.goBack();
                                w016 = Y4.D.D(null);
                            } catch (Throwable th15) {
                                w016 = AbstractC0603a.w0(th15);
                            }
                            v02.f(w016);
                            break;
                        case 15:
                            C0413i c0413i17 = c0413i;
                            t6.h.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj26 = ((List) obj2).get(0);
                            t6.h.c(obj26, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView15 = (WebView) obj26;
                            try {
                                c0413i17.getClass();
                                webView15.reload();
                                w017 = Y4.D.D(null);
                            } catch (Throwable th16) {
                                w017 = AbstractC0603a.w0(th16);
                            }
                            v02.f(w017);
                            break;
                        case 16:
                            C0413i c0413i18 = c0413i;
                            t6.h.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list9 = (List) obj2;
                            Object obj27 = list9.get(0);
                            t6.h.c(obj27, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView16 = (WebView) obj27;
                            Object obj28 = list9.get(1);
                            t6.h.c(obj28, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean booleanValue = ((Boolean) obj28).booleanValue();
                            try {
                                c0413i18.getClass();
                                webView16.clearCache(booleanValue);
                                w018 = Y4.D.D(null);
                            } catch (Throwable th17) {
                                w018 = AbstractC0603a.w0(th17);
                            }
                            v02.f(w018);
                            break;
                        case 17:
                            t6.h.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list10 = (List) obj2;
                            Object obj29 = list10.get(0);
                            t6.h.c(obj29, "null cannot be cast to non-null type android.webkit.WebView");
                            Object obj30 = list10.get(1);
                            t6.h.c(obj30, "null cannot be cast to non-null type kotlin.String");
                            B b7 = new B(v02, 1);
                            c0413i.getClass();
                            ((WebView) obj29).evaluateJavascript((String) obj30, new C0416l(1, b7));
                            break;
                        case 18:
                            C0413i c0413i19 = c0413i;
                            t6.h.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj31 = ((List) obj2).get(0);
                            t6.h.c(obj31, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView17 = (WebView) obj31;
                            try {
                                c0413i19.getClass();
                                w019 = Y4.D.D(webView17.getTitle());
                            } catch (Throwable th18) {
                                w019 = AbstractC0603a.w0(th18);
                            }
                            v02.f(w019);
                            break;
                        case 19:
                            C0413i c0413i20 = c0413i;
                            t6.h.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj32 = ((List) obj2).get(0);
                            t6.h.c(obj32, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean booleanValue2 = ((Boolean) obj32).booleanValue();
                            try {
                                c0413i20.getClass();
                                WebView.setWebContentsDebuggingEnabled(booleanValue2);
                                w020 = Y4.D.D(null);
                            } catch (Throwable th19) {
                                w020 = AbstractC0603a.w0(th19);
                            }
                            v02.f(w020);
                            break;
                        case 20:
                            C0413i c0413i21 = c0413i;
                            t6.h.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list11 = (List) obj2;
                            Object obj33 = list11.get(0);
                            t6.h.c(obj33, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView18 = (WebView) obj33;
                            WebViewClient webViewClient = (WebViewClient) list11.get(1);
                            try {
                                c0413i21.getClass();
                                webView18.setWebViewClient(webViewClient);
                                w021 = Y4.D.D(null);
                            } catch (Throwable th20) {
                                w021 = AbstractC0603a.w0(th20);
                            }
                            v02.f(w021);
                            break;
                        case zzbbd.zzt.zzm /* 21 */:
                            C0413i c0413i22 = c0413i;
                            t6.h.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list12 = (List) obj2;
                            Object obj34 = list12.get(0);
                            t6.h.c(obj34, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView19 = (WebView) obj34;
                            Object obj35 = list12.get(1);
                            t6.h.c(obj35, "null cannot be cast to non-null type io.flutter.plugins.webviewflutter.JavaScriptChannel");
                            C0425v c0425v = (C0425v) obj35;
                            try {
                                c0413i22.getClass();
                                webView19.addJavascriptInterface(c0425v, c0425v.f6215a);
                                w022 = Y4.D.D(null);
                            } catch (Throwable th21) {
                                w022 = AbstractC0603a.w0(th21);
                            }
                            v02.f(w022);
                            break;
                        default:
                            C0413i c0413i23 = c0413i;
                            t6.h.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list13 = (List) obj2;
                            Object obj36 = list13.get(0);
                            t6.h.c(obj36, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView20 = (WebView) obj36;
                            Object obj37 = list13.get(1);
                            t6.h.c(obj37, "null cannot be cast to non-null type kotlin.String");
                            String str11 = (String) obj37;
                            try {
                                c0413i23.getClass();
                                webView20.removeJavascriptInterface(str11);
                                w023 = Y4.D.D(null);
                            } catch (Throwable th22) {
                                w023 = AbstractC0603a.w0(th22);
                            }
                            v02.f(w023);
                            break;
                    }
                }
            });
        } else {
            f018.M(null);
        }
        w1.F0 f019 = new w1.F0(fVar, "dev.flutter.pigeon.webview_flutter_android.WebView.addJavaScriptChannel", c0406b, obj, 1);
        if (c0413i != null) {
            final int i24 = 21;
            f019.M(new A5.b() { // from class: R5.N
                @Override // A5.b
                public final void i(Object obj2, V0 v02) {
                    List w02;
                    List w03;
                    List w04;
                    List w05;
                    List w06;
                    List w07;
                    List w08;
                    List w09;
                    List w010;
                    List w011;
                    List w012;
                    List w013;
                    List w014;
                    List w015;
                    List w016;
                    List w017;
                    List w018;
                    List w019;
                    List w020;
                    List w021;
                    List w022;
                    List w023;
                    switch (i24) {
                        case 0:
                            C0413i c0413i2 = c0413i;
                            t6.h.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj3 = ((List) obj2).get(0);
                            t6.h.c(obj3, "null cannot be cast to non-null type kotlin.Long");
                            try {
                                ((C0407c) c0413i2.f6174a.f3679c).a(((Long) obj3).longValue(), c0413i2.a());
                                w02 = Y4.D.D(null);
                            } catch (Throwable th) {
                                w02 = AbstractC0603a.w0(th);
                            }
                            v02.f(w02);
                            break;
                        case 1:
                            C0413i c0413i3 = c0413i;
                            t6.h.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list = (List) obj2;
                            Object obj4 = list.get(0);
                            t6.h.c(obj4, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView = (WebView) obj4;
                            DownloadListener downloadListener = (DownloadListener) list.get(1);
                            try {
                                c0413i3.getClass();
                                webView.setDownloadListener(downloadListener);
                                w03 = Y4.D.D(null);
                            } catch (Throwable th2) {
                                w03 = AbstractC0603a.w0(th2);
                            }
                            v02.f(w03);
                            break;
                        case 2:
                            C0413i c0413i4 = c0413i;
                            t6.h.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list2 = (List) obj2;
                            Object obj5 = list2.get(0);
                            t6.h.c(obj5, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView2 = (WebView) obj5;
                            Object obj6 = list2.get(1);
                            t6.h.c(obj6, "null cannot be cast to non-null type kotlin.Long");
                            try {
                                ((C0407c) c0413i4.f6174a.f3679c).a(((Long) obj6).longValue(), webView2.getSettings());
                                w04 = Y4.D.D(null);
                            } catch (Throwable th3) {
                                w04 = AbstractC0603a.w0(th3);
                            }
                            v02.f(w04);
                            break;
                        case 3:
                            C0413i c0413i5 = c0413i;
                            t6.h.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list3 = (List) obj2;
                            Object obj7 = list3.get(0);
                            t6.h.c(obj7, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView3 = (WebView) obj7;
                            Z z4 = (Z) list3.get(1);
                            try {
                                c0413i5.getClass();
                                webView3.setWebChromeClient(z4);
                                w05 = Y4.D.D(null);
                            } catch (Throwable th4) {
                                w05 = AbstractC0603a.w0(th4);
                            }
                            v02.f(w05);
                            break;
                        case 4:
                            C0413i c0413i6 = c0413i;
                            t6.h.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list4 = (List) obj2;
                            Object obj8 = list4.get(0);
                            t6.h.c(obj8, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView4 = (WebView) obj8;
                            Object obj9 = list4.get(1);
                            t6.h.c(obj9, "null cannot be cast to non-null type kotlin.Long");
                            long longValue = ((Long) obj9).longValue();
                            try {
                                c0413i6.getClass();
                                webView4.setBackgroundColor((int) longValue);
                                w06 = Y4.D.D(null);
                            } catch (Throwable th5) {
                                w06 = AbstractC0603a.w0(th5);
                            }
                            v02.f(w06);
                            break;
                        case 5:
                            C0413i c0413i7 = c0413i;
                            t6.h.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj10 = ((List) obj2).get(0);
                            t6.h.c(obj10, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView5 = (WebView) obj10;
                            try {
                                c0413i7.getClass();
                                webView5.destroy();
                                w07 = Y4.D.D(null);
                            } catch (Throwable th6) {
                                w07 = AbstractC0603a.w0(th6);
                            }
                            v02.f(w07);
                            break;
                        case 6:
                            C0413i c0413i8 = c0413i;
                            t6.h.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list5 = (List) obj2;
                            Object obj11 = list5.get(0);
                            t6.h.c(obj11, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView6 = (WebView) obj11;
                            Object obj12 = list5.get(1);
                            t6.h.c(obj12, "null cannot be cast to non-null type kotlin.String");
                            String str = (String) obj12;
                            String str2 = (String) list5.get(2);
                            String str3 = (String) list5.get(3);
                            try {
                                c0413i8.getClass();
                                webView6.loadData(str, str2, str3);
                                w08 = Y4.D.D(null);
                            } catch (Throwable th7) {
                                w08 = AbstractC0603a.w0(th7);
                            }
                            v02.f(w08);
                            break;
                        case 7:
                            C0413i c0413i9 = c0413i;
                            t6.h.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list6 = (List) obj2;
                            Object obj13 = list6.get(0);
                            t6.h.c(obj13, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView7 = (WebView) obj13;
                            String str4 = (String) list6.get(1);
                            Object obj14 = list6.get(2);
                            t6.h.c(obj14, "null cannot be cast to non-null type kotlin.String");
                            String str5 = (String) obj14;
                            String str6 = (String) list6.get(3);
                            String str7 = (String) list6.get(4);
                            String str8 = (String) list6.get(5);
                            try {
                                c0413i9.getClass();
                                webView7.loadDataWithBaseURL(str4, str5, str6, str7, str8);
                                w09 = Y4.D.D(null);
                            } catch (Throwable th8) {
                                w09 = AbstractC0603a.w0(th8);
                            }
                            v02.f(w09);
                            break;
                        case 8:
                            C0413i c0413i10 = c0413i;
                            t6.h.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list7 = (List) obj2;
                            Object obj15 = list7.get(0);
                            t6.h.c(obj15, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView8 = (WebView) obj15;
                            Object obj16 = list7.get(1);
                            t6.h.c(obj16, "null cannot be cast to non-null type kotlin.String");
                            String str9 = (String) obj16;
                            Object obj17 = list7.get(2);
                            t6.h.c(obj17, "null cannot be cast to non-null type kotlin.collections.Map<kotlin.String, kotlin.String>");
                            Map<String, String> map = (Map) obj17;
                            try {
                                c0413i10.getClass();
                                webView8.loadUrl(str9, map);
                                w010 = Y4.D.D(null);
                            } catch (Throwable th9) {
                                w010 = AbstractC0603a.w0(th9);
                            }
                            v02.f(w010);
                            break;
                        case 9:
                            C0413i c0413i11 = c0413i;
                            t6.h.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list8 = (List) obj2;
                            Object obj18 = list8.get(0);
                            t6.h.c(obj18, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView9 = (WebView) obj18;
                            Object obj19 = list8.get(1);
                            t6.h.c(obj19, "null cannot be cast to non-null type kotlin.String");
                            String str10 = (String) obj19;
                            Object obj20 = list8.get(2);
                            t6.h.c(obj20, "null cannot be cast to non-null type kotlin.ByteArray");
                            byte[] bArr = (byte[]) obj20;
                            try {
                                c0413i11.getClass();
                                webView9.postUrl(str10, bArr);
                                w011 = Y4.D.D(null);
                            } catch (Throwable th10) {
                                w011 = AbstractC0603a.w0(th10);
                            }
                            v02.f(w011);
                            break;
                        case 10:
                            C0413i c0413i12 = c0413i;
                            t6.h.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj21 = ((List) obj2).get(0);
                            t6.h.c(obj21, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView10 = (WebView) obj21;
                            try {
                                c0413i12.getClass();
                                w012 = Y4.D.D(webView10.getUrl());
                            } catch (Throwable th11) {
                                w012 = AbstractC0603a.w0(th11);
                            }
                            v02.f(w012);
                            break;
                        case 11:
                            C0413i c0413i13 = c0413i;
                            t6.h.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj22 = ((List) obj2).get(0);
                            t6.h.c(obj22, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView11 = (WebView) obj22;
                            try {
                                c0413i13.getClass();
                                webView11.goForward();
                                w013 = Y4.D.D(null);
                            } catch (Throwable th12) {
                                w013 = AbstractC0603a.w0(th12);
                            }
                            v02.f(w013);
                            break;
                        case 12:
                            C0413i c0413i14 = c0413i;
                            t6.h.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj23 = ((List) obj2).get(0);
                            t6.h.c(obj23, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView12 = (WebView) obj23;
                            try {
                                c0413i14.getClass();
                                w014 = Y4.D.D(Boolean.valueOf(webView12.canGoBack()));
                            } catch (Throwable th13) {
                                w014 = AbstractC0603a.w0(th13);
                            }
                            v02.f(w014);
                            break;
                        case 13:
                            C0413i c0413i15 = c0413i;
                            t6.h.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj24 = ((List) obj2).get(0);
                            t6.h.c(obj24, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView13 = (WebView) obj24;
                            try {
                                c0413i15.getClass();
                                w015 = Y4.D.D(Boolean.valueOf(webView13.canGoForward()));
                            } catch (Throwable th14) {
                                w015 = AbstractC0603a.w0(th14);
                            }
                            v02.f(w015);
                            break;
                        case 14:
                            C0413i c0413i16 = c0413i;
                            t6.h.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj25 = ((List) obj2).get(0);
                            t6.h.c(obj25, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView14 = (WebView) obj25;
                            try {
                                c0413i16.getClass();
                                webView14.goBack();
                                w016 = Y4.D.D(null);
                            } catch (Throwable th15) {
                                w016 = AbstractC0603a.w0(th15);
                            }
                            v02.f(w016);
                            break;
                        case 15:
                            C0413i c0413i17 = c0413i;
                            t6.h.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj26 = ((List) obj2).get(0);
                            t6.h.c(obj26, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView15 = (WebView) obj26;
                            try {
                                c0413i17.getClass();
                                webView15.reload();
                                w017 = Y4.D.D(null);
                            } catch (Throwable th16) {
                                w017 = AbstractC0603a.w0(th16);
                            }
                            v02.f(w017);
                            break;
                        case 16:
                            C0413i c0413i18 = c0413i;
                            t6.h.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list9 = (List) obj2;
                            Object obj27 = list9.get(0);
                            t6.h.c(obj27, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView16 = (WebView) obj27;
                            Object obj28 = list9.get(1);
                            t6.h.c(obj28, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean booleanValue = ((Boolean) obj28).booleanValue();
                            try {
                                c0413i18.getClass();
                                webView16.clearCache(booleanValue);
                                w018 = Y4.D.D(null);
                            } catch (Throwable th17) {
                                w018 = AbstractC0603a.w0(th17);
                            }
                            v02.f(w018);
                            break;
                        case 17:
                            t6.h.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list10 = (List) obj2;
                            Object obj29 = list10.get(0);
                            t6.h.c(obj29, "null cannot be cast to non-null type android.webkit.WebView");
                            Object obj30 = list10.get(1);
                            t6.h.c(obj30, "null cannot be cast to non-null type kotlin.String");
                            B b7 = new B(v02, 1);
                            c0413i.getClass();
                            ((WebView) obj29).evaluateJavascript((String) obj30, new C0416l(1, b7));
                            break;
                        case 18:
                            C0413i c0413i19 = c0413i;
                            t6.h.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj31 = ((List) obj2).get(0);
                            t6.h.c(obj31, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView17 = (WebView) obj31;
                            try {
                                c0413i19.getClass();
                                w019 = Y4.D.D(webView17.getTitle());
                            } catch (Throwable th18) {
                                w019 = AbstractC0603a.w0(th18);
                            }
                            v02.f(w019);
                            break;
                        case 19:
                            C0413i c0413i20 = c0413i;
                            t6.h.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj32 = ((List) obj2).get(0);
                            t6.h.c(obj32, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean booleanValue2 = ((Boolean) obj32).booleanValue();
                            try {
                                c0413i20.getClass();
                                WebView.setWebContentsDebuggingEnabled(booleanValue2);
                                w020 = Y4.D.D(null);
                            } catch (Throwable th19) {
                                w020 = AbstractC0603a.w0(th19);
                            }
                            v02.f(w020);
                            break;
                        case 20:
                            C0413i c0413i21 = c0413i;
                            t6.h.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list11 = (List) obj2;
                            Object obj33 = list11.get(0);
                            t6.h.c(obj33, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView18 = (WebView) obj33;
                            WebViewClient webViewClient = (WebViewClient) list11.get(1);
                            try {
                                c0413i21.getClass();
                                webView18.setWebViewClient(webViewClient);
                                w021 = Y4.D.D(null);
                            } catch (Throwable th20) {
                                w021 = AbstractC0603a.w0(th20);
                            }
                            v02.f(w021);
                            break;
                        case zzbbd.zzt.zzm /* 21 */:
                            C0413i c0413i22 = c0413i;
                            t6.h.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list12 = (List) obj2;
                            Object obj34 = list12.get(0);
                            t6.h.c(obj34, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView19 = (WebView) obj34;
                            Object obj35 = list12.get(1);
                            t6.h.c(obj35, "null cannot be cast to non-null type io.flutter.plugins.webviewflutter.JavaScriptChannel");
                            C0425v c0425v = (C0425v) obj35;
                            try {
                                c0413i22.getClass();
                                webView19.addJavascriptInterface(c0425v, c0425v.f6215a);
                                w022 = Y4.D.D(null);
                            } catch (Throwable th21) {
                                w022 = AbstractC0603a.w0(th21);
                            }
                            v02.f(w022);
                            break;
                        default:
                            C0413i c0413i23 = c0413i;
                            t6.h.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list13 = (List) obj2;
                            Object obj36 = list13.get(0);
                            t6.h.c(obj36, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView20 = (WebView) obj36;
                            Object obj37 = list13.get(1);
                            t6.h.c(obj37, "null cannot be cast to non-null type kotlin.String");
                            String str11 = (String) obj37;
                            try {
                                c0413i23.getClass();
                                webView20.removeJavascriptInterface(str11);
                                w023 = Y4.D.D(null);
                            } catch (Throwable th22) {
                                w023 = AbstractC0603a.w0(th22);
                            }
                            v02.f(w023);
                            break;
                    }
                }
            });
        } else {
            f019.M(null);
        }
        w1.F0 f020 = new w1.F0(fVar, "dev.flutter.pigeon.webview_flutter_android.WebView.removeJavaScriptChannel", c0406b, obj, 1);
        if (c0413i != null) {
            final int i25 = 22;
            f020.M(new A5.b() { // from class: R5.N
                @Override // A5.b
                public final void i(Object obj2, V0 v02) {
                    List w02;
                    List w03;
                    List w04;
                    List w05;
                    List w06;
                    List w07;
                    List w08;
                    List w09;
                    List w010;
                    List w011;
                    List w012;
                    List w013;
                    List w014;
                    List w015;
                    List w016;
                    List w017;
                    List w018;
                    List w019;
                    List w020;
                    List w021;
                    List w022;
                    List w023;
                    switch (i25) {
                        case 0:
                            C0413i c0413i2 = c0413i;
                            t6.h.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj3 = ((List) obj2).get(0);
                            t6.h.c(obj3, "null cannot be cast to non-null type kotlin.Long");
                            try {
                                ((C0407c) c0413i2.f6174a.f3679c).a(((Long) obj3).longValue(), c0413i2.a());
                                w02 = Y4.D.D(null);
                            } catch (Throwable th) {
                                w02 = AbstractC0603a.w0(th);
                            }
                            v02.f(w02);
                            break;
                        case 1:
                            C0413i c0413i3 = c0413i;
                            t6.h.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list = (List) obj2;
                            Object obj4 = list.get(0);
                            t6.h.c(obj4, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView = (WebView) obj4;
                            DownloadListener downloadListener = (DownloadListener) list.get(1);
                            try {
                                c0413i3.getClass();
                                webView.setDownloadListener(downloadListener);
                                w03 = Y4.D.D(null);
                            } catch (Throwable th2) {
                                w03 = AbstractC0603a.w0(th2);
                            }
                            v02.f(w03);
                            break;
                        case 2:
                            C0413i c0413i4 = c0413i;
                            t6.h.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list2 = (List) obj2;
                            Object obj5 = list2.get(0);
                            t6.h.c(obj5, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView2 = (WebView) obj5;
                            Object obj6 = list2.get(1);
                            t6.h.c(obj6, "null cannot be cast to non-null type kotlin.Long");
                            try {
                                ((C0407c) c0413i4.f6174a.f3679c).a(((Long) obj6).longValue(), webView2.getSettings());
                                w04 = Y4.D.D(null);
                            } catch (Throwable th3) {
                                w04 = AbstractC0603a.w0(th3);
                            }
                            v02.f(w04);
                            break;
                        case 3:
                            C0413i c0413i5 = c0413i;
                            t6.h.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list3 = (List) obj2;
                            Object obj7 = list3.get(0);
                            t6.h.c(obj7, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView3 = (WebView) obj7;
                            Z z4 = (Z) list3.get(1);
                            try {
                                c0413i5.getClass();
                                webView3.setWebChromeClient(z4);
                                w05 = Y4.D.D(null);
                            } catch (Throwable th4) {
                                w05 = AbstractC0603a.w0(th4);
                            }
                            v02.f(w05);
                            break;
                        case 4:
                            C0413i c0413i6 = c0413i;
                            t6.h.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list4 = (List) obj2;
                            Object obj8 = list4.get(0);
                            t6.h.c(obj8, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView4 = (WebView) obj8;
                            Object obj9 = list4.get(1);
                            t6.h.c(obj9, "null cannot be cast to non-null type kotlin.Long");
                            long longValue = ((Long) obj9).longValue();
                            try {
                                c0413i6.getClass();
                                webView4.setBackgroundColor((int) longValue);
                                w06 = Y4.D.D(null);
                            } catch (Throwable th5) {
                                w06 = AbstractC0603a.w0(th5);
                            }
                            v02.f(w06);
                            break;
                        case 5:
                            C0413i c0413i7 = c0413i;
                            t6.h.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj10 = ((List) obj2).get(0);
                            t6.h.c(obj10, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView5 = (WebView) obj10;
                            try {
                                c0413i7.getClass();
                                webView5.destroy();
                                w07 = Y4.D.D(null);
                            } catch (Throwable th6) {
                                w07 = AbstractC0603a.w0(th6);
                            }
                            v02.f(w07);
                            break;
                        case 6:
                            C0413i c0413i8 = c0413i;
                            t6.h.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list5 = (List) obj2;
                            Object obj11 = list5.get(0);
                            t6.h.c(obj11, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView6 = (WebView) obj11;
                            Object obj12 = list5.get(1);
                            t6.h.c(obj12, "null cannot be cast to non-null type kotlin.String");
                            String str = (String) obj12;
                            String str2 = (String) list5.get(2);
                            String str3 = (String) list5.get(3);
                            try {
                                c0413i8.getClass();
                                webView6.loadData(str, str2, str3);
                                w08 = Y4.D.D(null);
                            } catch (Throwable th7) {
                                w08 = AbstractC0603a.w0(th7);
                            }
                            v02.f(w08);
                            break;
                        case 7:
                            C0413i c0413i9 = c0413i;
                            t6.h.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list6 = (List) obj2;
                            Object obj13 = list6.get(0);
                            t6.h.c(obj13, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView7 = (WebView) obj13;
                            String str4 = (String) list6.get(1);
                            Object obj14 = list6.get(2);
                            t6.h.c(obj14, "null cannot be cast to non-null type kotlin.String");
                            String str5 = (String) obj14;
                            String str6 = (String) list6.get(3);
                            String str7 = (String) list6.get(4);
                            String str8 = (String) list6.get(5);
                            try {
                                c0413i9.getClass();
                                webView7.loadDataWithBaseURL(str4, str5, str6, str7, str8);
                                w09 = Y4.D.D(null);
                            } catch (Throwable th8) {
                                w09 = AbstractC0603a.w0(th8);
                            }
                            v02.f(w09);
                            break;
                        case 8:
                            C0413i c0413i10 = c0413i;
                            t6.h.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list7 = (List) obj2;
                            Object obj15 = list7.get(0);
                            t6.h.c(obj15, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView8 = (WebView) obj15;
                            Object obj16 = list7.get(1);
                            t6.h.c(obj16, "null cannot be cast to non-null type kotlin.String");
                            String str9 = (String) obj16;
                            Object obj17 = list7.get(2);
                            t6.h.c(obj17, "null cannot be cast to non-null type kotlin.collections.Map<kotlin.String, kotlin.String>");
                            Map<String, String> map = (Map) obj17;
                            try {
                                c0413i10.getClass();
                                webView8.loadUrl(str9, map);
                                w010 = Y4.D.D(null);
                            } catch (Throwable th9) {
                                w010 = AbstractC0603a.w0(th9);
                            }
                            v02.f(w010);
                            break;
                        case 9:
                            C0413i c0413i11 = c0413i;
                            t6.h.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list8 = (List) obj2;
                            Object obj18 = list8.get(0);
                            t6.h.c(obj18, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView9 = (WebView) obj18;
                            Object obj19 = list8.get(1);
                            t6.h.c(obj19, "null cannot be cast to non-null type kotlin.String");
                            String str10 = (String) obj19;
                            Object obj20 = list8.get(2);
                            t6.h.c(obj20, "null cannot be cast to non-null type kotlin.ByteArray");
                            byte[] bArr = (byte[]) obj20;
                            try {
                                c0413i11.getClass();
                                webView9.postUrl(str10, bArr);
                                w011 = Y4.D.D(null);
                            } catch (Throwable th10) {
                                w011 = AbstractC0603a.w0(th10);
                            }
                            v02.f(w011);
                            break;
                        case 10:
                            C0413i c0413i12 = c0413i;
                            t6.h.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj21 = ((List) obj2).get(0);
                            t6.h.c(obj21, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView10 = (WebView) obj21;
                            try {
                                c0413i12.getClass();
                                w012 = Y4.D.D(webView10.getUrl());
                            } catch (Throwable th11) {
                                w012 = AbstractC0603a.w0(th11);
                            }
                            v02.f(w012);
                            break;
                        case 11:
                            C0413i c0413i13 = c0413i;
                            t6.h.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj22 = ((List) obj2).get(0);
                            t6.h.c(obj22, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView11 = (WebView) obj22;
                            try {
                                c0413i13.getClass();
                                webView11.goForward();
                                w013 = Y4.D.D(null);
                            } catch (Throwable th12) {
                                w013 = AbstractC0603a.w0(th12);
                            }
                            v02.f(w013);
                            break;
                        case 12:
                            C0413i c0413i14 = c0413i;
                            t6.h.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj23 = ((List) obj2).get(0);
                            t6.h.c(obj23, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView12 = (WebView) obj23;
                            try {
                                c0413i14.getClass();
                                w014 = Y4.D.D(Boolean.valueOf(webView12.canGoBack()));
                            } catch (Throwable th13) {
                                w014 = AbstractC0603a.w0(th13);
                            }
                            v02.f(w014);
                            break;
                        case 13:
                            C0413i c0413i15 = c0413i;
                            t6.h.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj24 = ((List) obj2).get(0);
                            t6.h.c(obj24, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView13 = (WebView) obj24;
                            try {
                                c0413i15.getClass();
                                w015 = Y4.D.D(Boolean.valueOf(webView13.canGoForward()));
                            } catch (Throwable th14) {
                                w015 = AbstractC0603a.w0(th14);
                            }
                            v02.f(w015);
                            break;
                        case 14:
                            C0413i c0413i16 = c0413i;
                            t6.h.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj25 = ((List) obj2).get(0);
                            t6.h.c(obj25, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView14 = (WebView) obj25;
                            try {
                                c0413i16.getClass();
                                webView14.goBack();
                                w016 = Y4.D.D(null);
                            } catch (Throwable th15) {
                                w016 = AbstractC0603a.w0(th15);
                            }
                            v02.f(w016);
                            break;
                        case 15:
                            C0413i c0413i17 = c0413i;
                            t6.h.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj26 = ((List) obj2).get(0);
                            t6.h.c(obj26, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView15 = (WebView) obj26;
                            try {
                                c0413i17.getClass();
                                webView15.reload();
                                w017 = Y4.D.D(null);
                            } catch (Throwable th16) {
                                w017 = AbstractC0603a.w0(th16);
                            }
                            v02.f(w017);
                            break;
                        case 16:
                            C0413i c0413i18 = c0413i;
                            t6.h.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list9 = (List) obj2;
                            Object obj27 = list9.get(0);
                            t6.h.c(obj27, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView16 = (WebView) obj27;
                            Object obj28 = list9.get(1);
                            t6.h.c(obj28, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean booleanValue = ((Boolean) obj28).booleanValue();
                            try {
                                c0413i18.getClass();
                                webView16.clearCache(booleanValue);
                                w018 = Y4.D.D(null);
                            } catch (Throwable th17) {
                                w018 = AbstractC0603a.w0(th17);
                            }
                            v02.f(w018);
                            break;
                        case 17:
                            t6.h.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list10 = (List) obj2;
                            Object obj29 = list10.get(0);
                            t6.h.c(obj29, "null cannot be cast to non-null type android.webkit.WebView");
                            Object obj30 = list10.get(1);
                            t6.h.c(obj30, "null cannot be cast to non-null type kotlin.String");
                            B b7 = new B(v02, 1);
                            c0413i.getClass();
                            ((WebView) obj29).evaluateJavascript((String) obj30, new C0416l(1, b7));
                            break;
                        case 18:
                            C0413i c0413i19 = c0413i;
                            t6.h.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj31 = ((List) obj2).get(0);
                            t6.h.c(obj31, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView17 = (WebView) obj31;
                            try {
                                c0413i19.getClass();
                                w019 = Y4.D.D(webView17.getTitle());
                            } catch (Throwable th18) {
                                w019 = AbstractC0603a.w0(th18);
                            }
                            v02.f(w019);
                            break;
                        case 19:
                            C0413i c0413i20 = c0413i;
                            t6.h.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj32 = ((List) obj2).get(0);
                            t6.h.c(obj32, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean booleanValue2 = ((Boolean) obj32).booleanValue();
                            try {
                                c0413i20.getClass();
                                WebView.setWebContentsDebuggingEnabled(booleanValue2);
                                w020 = Y4.D.D(null);
                            } catch (Throwable th19) {
                                w020 = AbstractC0603a.w0(th19);
                            }
                            v02.f(w020);
                            break;
                        case 20:
                            C0413i c0413i21 = c0413i;
                            t6.h.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list11 = (List) obj2;
                            Object obj33 = list11.get(0);
                            t6.h.c(obj33, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView18 = (WebView) obj33;
                            WebViewClient webViewClient = (WebViewClient) list11.get(1);
                            try {
                                c0413i21.getClass();
                                webView18.setWebViewClient(webViewClient);
                                w021 = Y4.D.D(null);
                            } catch (Throwable th20) {
                                w021 = AbstractC0603a.w0(th20);
                            }
                            v02.f(w021);
                            break;
                        case zzbbd.zzt.zzm /* 21 */:
                            C0413i c0413i22 = c0413i;
                            t6.h.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list12 = (List) obj2;
                            Object obj34 = list12.get(0);
                            t6.h.c(obj34, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView19 = (WebView) obj34;
                            Object obj35 = list12.get(1);
                            t6.h.c(obj35, "null cannot be cast to non-null type io.flutter.plugins.webviewflutter.JavaScriptChannel");
                            C0425v c0425v = (C0425v) obj35;
                            try {
                                c0413i22.getClass();
                                webView19.addJavascriptInterface(c0425v, c0425v.f6215a);
                                w022 = Y4.D.D(null);
                            } catch (Throwable th21) {
                                w022 = AbstractC0603a.w0(th21);
                            }
                            v02.f(w022);
                            break;
                        default:
                            C0413i c0413i23 = c0413i;
                            t6.h.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list13 = (List) obj2;
                            Object obj36 = list13.get(0);
                            t6.h.c(obj36, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView20 = (WebView) obj36;
                            Object obj37 = list13.get(1);
                            t6.h.c(obj37, "null cannot be cast to non-null type kotlin.String");
                            String str11 = (String) obj37;
                            try {
                                c0413i23.getClass();
                                webView20.removeJavascriptInterface(str11);
                                w023 = Y4.D.D(null);
                            } catch (Throwable th22) {
                                w023 = AbstractC0603a.w0(th22);
                            }
                            v02.f(w023);
                            break;
                    }
                }
            });
        } else {
            f020.M(null);
        }
        w1.F0 f021 = new w1.F0(fVar, "dev.flutter.pigeon.webview_flutter_android.WebView.setDownloadListener", c0406b, obj, 1);
        if (c0413i != null) {
            final int i26 = 1;
            f021.M(new A5.b() { // from class: R5.N
                @Override // A5.b
                public final void i(Object obj2, V0 v02) {
                    List w02;
                    List w03;
                    List w04;
                    List w05;
                    List w06;
                    List w07;
                    List w08;
                    List w09;
                    List w010;
                    List w011;
                    List w012;
                    List w013;
                    List w014;
                    List w015;
                    List w016;
                    List w017;
                    List w018;
                    List w019;
                    List w020;
                    List w021;
                    List w022;
                    List w023;
                    switch (i26) {
                        case 0:
                            C0413i c0413i2 = c0413i;
                            t6.h.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj3 = ((List) obj2).get(0);
                            t6.h.c(obj3, "null cannot be cast to non-null type kotlin.Long");
                            try {
                                ((C0407c) c0413i2.f6174a.f3679c).a(((Long) obj3).longValue(), c0413i2.a());
                                w02 = Y4.D.D(null);
                            } catch (Throwable th) {
                                w02 = AbstractC0603a.w0(th);
                            }
                            v02.f(w02);
                            break;
                        case 1:
                            C0413i c0413i3 = c0413i;
                            t6.h.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list = (List) obj2;
                            Object obj4 = list.get(0);
                            t6.h.c(obj4, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView = (WebView) obj4;
                            DownloadListener downloadListener = (DownloadListener) list.get(1);
                            try {
                                c0413i3.getClass();
                                webView.setDownloadListener(downloadListener);
                                w03 = Y4.D.D(null);
                            } catch (Throwable th2) {
                                w03 = AbstractC0603a.w0(th2);
                            }
                            v02.f(w03);
                            break;
                        case 2:
                            C0413i c0413i4 = c0413i;
                            t6.h.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list2 = (List) obj2;
                            Object obj5 = list2.get(0);
                            t6.h.c(obj5, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView2 = (WebView) obj5;
                            Object obj6 = list2.get(1);
                            t6.h.c(obj6, "null cannot be cast to non-null type kotlin.Long");
                            try {
                                ((C0407c) c0413i4.f6174a.f3679c).a(((Long) obj6).longValue(), webView2.getSettings());
                                w04 = Y4.D.D(null);
                            } catch (Throwable th3) {
                                w04 = AbstractC0603a.w0(th3);
                            }
                            v02.f(w04);
                            break;
                        case 3:
                            C0413i c0413i5 = c0413i;
                            t6.h.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list3 = (List) obj2;
                            Object obj7 = list3.get(0);
                            t6.h.c(obj7, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView3 = (WebView) obj7;
                            Z z4 = (Z) list3.get(1);
                            try {
                                c0413i5.getClass();
                                webView3.setWebChromeClient(z4);
                                w05 = Y4.D.D(null);
                            } catch (Throwable th4) {
                                w05 = AbstractC0603a.w0(th4);
                            }
                            v02.f(w05);
                            break;
                        case 4:
                            C0413i c0413i6 = c0413i;
                            t6.h.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list4 = (List) obj2;
                            Object obj8 = list4.get(0);
                            t6.h.c(obj8, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView4 = (WebView) obj8;
                            Object obj9 = list4.get(1);
                            t6.h.c(obj9, "null cannot be cast to non-null type kotlin.Long");
                            long longValue = ((Long) obj9).longValue();
                            try {
                                c0413i6.getClass();
                                webView4.setBackgroundColor((int) longValue);
                                w06 = Y4.D.D(null);
                            } catch (Throwable th5) {
                                w06 = AbstractC0603a.w0(th5);
                            }
                            v02.f(w06);
                            break;
                        case 5:
                            C0413i c0413i7 = c0413i;
                            t6.h.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj10 = ((List) obj2).get(0);
                            t6.h.c(obj10, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView5 = (WebView) obj10;
                            try {
                                c0413i7.getClass();
                                webView5.destroy();
                                w07 = Y4.D.D(null);
                            } catch (Throwable th6) {
                                w07 = AbstractC0603a.w0(th6);
                            }
                            v02.f(w07);
                            break;
                        case 6:
                            C0413i c0413i8 = c0413i;
                            t6.h.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list5 = (List) obj2;
                            Object obj11 = list5.get(0);
                            t6.h.c(obj11, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView6 = (WebView) obj11;
                            Object obj12 = list5.get(1);
                            t6.h.c(obj12, "null cannot be cast to non-null type kotlin.String");
                            String str = (String) obj12;
                            String str2 = (String) list5.get(2);
                            String str3 = (String) list5.get(3);
                            try {
                                c0413i8.getClass();
                                webView6.loadData(str, str2, str3);
                                w08 = Y4.D.D(null);
                            } catch (Throwable th7) {
                                w08 = AbstractC0603a.w0(th7);
                            }
                            v02.f(w08);
                            break;
                        case 7:
                            C0413i c0413i9 = c0413i;
                            t6.h.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list6 = (List) obj2;
                            Object obj13 = list6.get(0);
                            t6.h.c(obj13, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView7 = (WebView) obj13;
                            String str4 = (String) list6.get(1);
                            Object obj14 = list6.get(2);
                            t6.h.c(obj14, "null cannot be cast to non-null type kotlin.String");
                            String str5 = (String) obj14;
                            String str6 = (String) list6.get(3);
                            String str7 = (String) list6.get(4);
                            String str8 = (String) list6.get(5);
                            try {
                                c0413i9.getClass();
                                webView7.loadDataWithBaseURL(str4, str5, str6, str7, str8);
                                w09 = Y4.D.D(null);
                            } catch (Throwable th8) {
                                w09 = AbstractC0603a.w0(th8);
                            }
                            v02.f(w09);
                            break;
                        case 8:
                            C0413i c0413i10 = c0413i;
                            t6.h.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list7 = (List) obj2;
                            Object obj15 = list7.get(0);
                            t6.h.c(obj15, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView8 = (WebView) obj15;
                            Object obj16 = list7.get(1);
                            t6.h.c(obj16, "null cannot be cast to non-null type kotlin.String");
                            String str9 = (String) obj16;
                            Object obj17 = list7.get(2);
                            t6.h.c(obj17, "null cannot be cast to non-null type kotlin.collections.Map<kotlin.String, kotlin.String>");
                            Map<String, String> map = (Map) obj17;
                            try {
                                c0413i10.getClass();
                                webView8.loadUrl(str9, map);
                                w010 = Y4.D.D(null);
                            } catch (Throwable th9) {
                                w010 = AbstractC0603a.w0(th9);
                            }
                            v02.f(w010);
                            break;
                        case 9:
                            C0413i c0413i11 = c0413i;
                            t6.h.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list8 = (List) obj2;
                            Object obj18 = list8.get(0);
                            t6.h.c(obj18, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView9 = (WebView) obj18;
                            Object obj19 = list8.get(1);
                            t6.h.c(obj19, "null cannot be cast to non-null type kotlin.String");
                            String str10 = (String) obj19;
                            Object obj20 = list8.get(2);
                            t6.h.c(obj20, "null cannot be cast to non-null type kotlin.ByteArray");
                            byte[] bArr = (byte[]) obj20;
                            try {
                                c0413i11.getClass();
                                webView9.postUrl(str10, bArr);
                                w011 = Y4.D.D(null);
                            } catch (Throwable th10) {
                                w011 = AbstractC0603a.w0(th10);
                            }
                            v02.f(w011);
                            break;
                        case 10:
                            C0413i c0413i12 = c0413i;
                            t6.h.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj21 = ((List) obj2).get(0);
                            t6.h.c(obj21, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView10 = (WebView) obj21;
                            try {
                                c0413i12.getClass();
                                w012 = Y4.D.D(webView10.getUrl());
                            } catch (Throwable th11) {
                                w012 = AbstractC0603a.w0(th11);
                            }
                            v02.f(w012);
                            break;
                        case 11:
                            C0413i c0413i13 = c0413i;
                            t6.h.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj22 = ((List) obj2).get(0);
                            t6.h.c(obj22, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView11 = (WebView) obj22;
                            try {
                                c0413i13.getClass();
                                webView11.goForward();
                                w013 = Y4.D.D(null);
                            } catch (Throwable th12) {
                                w013 = AbstractC0603a.w0(th12);
                            }
                            v02.f(w013);
                            break;
                        case 12:
                            C0413i c0413i14 = c0413i;
                            t6.h.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj23 = ((List) obj2).get(0);
                            t6.h.c(obj23, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView12 = (WebView) obj23;
                            try {
                                c0413i14.getClass();
                                w014 = Y4.D.D(Boolean.valueOf(webView12.canGoBack()));
                            } catch (Throwable th13) {
                                w014 = AbstractC0603a.w0(th13);
                            }
                            v02.f(w014);
                            break;
                        case 13:
                            C0413i c0413i15 = c0413i;
                            t6.h.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj24 = ((List) obj2).get(0);
                            t6.h.c(obj24, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView13 = (WebView) obj24;
                            try {
                                c0413i15.getClass();
                                w015 = Y4.D.D(Boolean.valueOf(webView13.canGoForward()));
                            } catch (Throwable th14) {
                                w015 = AbstractC0603a.w0(th14);
                            }
                            v02.f(w015);
                            break;
                        case 14:
                            C0413i c0413i16 = c0413i;
                            t6.h.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj25 = ((List) obj2).get(0);
                            t6.h.c(obj25, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView14 = (WebView) obj25;
                            try {
                                c0413i16.getClass();
                                webView14.goBack();
                                w016 = Y4.D.D(null);
                            } catch (Throwable th15) {
                                w016 = AbstractC0603a.w0(th15);
                            }
                            v02.f(w016);
                            break;
                        case 15:
                            C0413i c0413i17 = c0413i;
                            t6.h.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj26 = ((List) obj2).get(0);
                            t6.h.c(obj26, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView15 = (WebView) obj26;
                            try {
                                c0413i17.getClass();
                                webView15.reload();
                                w017 = Y4.D.D(null);
                            } catch (Throwable th16) {
                                w017 = AbstractC0603a.w0(th16);
                            }
                            v02.f(w017);
                            break;
                        case 16:
                            C0413i c0413i18 = c0413i;
                            t6.h.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list9 = (List) obj2;
                            Object obj27 = list9.get(0);
                            t6.h.c(obj27, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView16 = (WebView) obj27;
                            Object obj28 = list9.get(1);
                            t6.h.c(obj28, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean booleanValue = ((Boolean) obj28).booleanValue();
                            try {
                                c0413i18.getClass();
                                webView16.clearCache(booleanValue);
                                w018 = Y4.D.D(null);
                            } catch (Throwable th17) {
                                w018 = AbstractC0603a.w0(th17);
                            }
                            v02.f(w018);
                            break;
                        case 17:
                            t6.h.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list10 = (List) obj2;
                            Object obj29 = list10.get(0);
                            t6.h.c(obj29, "null cannot be cast to non-null type android.webkit.WebView");
                            Object obj30 = list10.get(1);
                            t6.h.c(obj30, "null cannot be cast to non-null type kotlin.String");
                            B b7 = new B(v02, 1);
                            c0413i.getClass();
                            ((WebView) obj29).evaluateJavascript((String) obj30, new C0416l(1, b7));
                            break;
                        case 18:
                            C0413i c0413i19 = c0413i;
                            t6.h.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj31 = ((List) obj2).get(0);
                            t6.h.c(obj31, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView17 = (WebView) obj31;
                            try {
                                c0413i19.getClass();
                                w019 = Y4.D.D(webView17.getTitle());
                            } catch (Throwable th18) {
                                w019 = AbstractC0603a.w0(th18);
                            }
                            v02.f(w019);
                            break;
                        case 19:
                            C0413i c0413i20 = c0413i;
                            t6.h.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj32 = ((List) obj2).get(0);
                            t6.h.c(obj32, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean booleanValue2 = ((Boolean) obj32).booleanValue();
                            try {
                                c0413i20.getClass();
                                WebView.setWebContentsDebuggingEnabled(booleanValue2);
                                w020 = Y4.D.D(null);
                            } catch (Throwable th19) {
                                w020 = AbstractC0603a.w0(th19);
                            }
                            v02.f(w020);
                            break;
                        case 20:
                            C0413i c0413i21 = c0413i;
                            t6.h.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list11 = (List) obj2;
                            Object obj33 = list11.get(0);
                            t6.h.c(obj33, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView18 = (WebView) obj33;
                            WebViewClient webViewClient = (WebViewClient) list11.get(1);
                            try {
                                c0413i21.getClass();
                                webView18.setWebViewClient(webViewClient);
                                w021 = Y4.D.D(null);
                            } catch (Throwable th20) {
                                w021 = AbstractC0603a.w0(th20);
                            }
                            v02.f(w021);
                            break;
                        case zzbbd.zzt.zzm /* 21 */:
                            C0413i c0413i22 = c0413i;
                            t6.h.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list12 = (List) obj2;
                            Object obj34 = list12.get(0);
                            t6.h.c(obj34, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView19 = (WebView) obj34;
                            Object obj35 = list12.get(1);
                            t6.h.c(obj35, "null cannot be cast to non-null type io.flutter.plugins.webviewflutter.JavaScriptChannel");
                            C0425v c0425v = (C0425v) obj35;
                            try {
                                c0413i22.getClass();
                                webView19.addJavascriptInterface(c0425v, c0425v.f6215a);
                                w022 = Y4.D.D(null);
                            } catch (Throwable th21) {
                                w022 = AbstractC0603a.w0(th21);
                            }
                            v02.f(w022);
                            break;
                        default:
                            C0413i c0413i23 = c0413i;
                            t6.h.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list13 = (List) obj2;
                            Object obj36 = list13.get(0);
                            t6.h.c(obj36, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView20 = (WebView) obj36;
                            Object obj37 = list13.get(1);
                            t6.h.c(obj37, "null cannot be cast to non-null type kotlin.String");
                            String str11 = (String) obj37;
                            try {
                                c0413i23.getClass();
                                webView20.removeJavascriptInterface(str11);
                                w023 = Y4.D.D(null);
                            } catch (Throwable th22) {
                                w023 = AbstractC0603a.w0(th22);
                            }
                            v02.f(w023);
                            break;
                    }
                }
            });
        } else {
            f021.M(null);
        }
        w1.F0 f022 = new w1.F0(fVar, "dev.flutter.pigeon.webview_flutter_android.WebView.setWebChromeClient", c0406b, obj, 1);
        if (c0413i != null) {
            final int i27 = 3;
            f022.M(new A5.b() { // from class: R5.N
                @Override // A5.b
                public final void i(Object obj2, V0 v02) {
                    List w02;
                    List w03;
                    List w04;
                    List w05;
                    List w06;
                    List w07;
                    List w08;
                    List w09;
                    List w010;
                    List w011;
                    List w012;
                    List w013;
                    List w014;
                    List w015;
                    List w016;
                    List w017;
                    List w018;
                    List w019;
                    List w020;
                    List w021;
                    List w022;
                    List w023;
                    switch (i27) {
                        case 0:
                            C0413i c0413i2 = c0413i;
                            t6.h.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj3 = ((List) obj2).get(0);
                            t6.h.c(obj3, "null cannot be cast to non-null type kotlin.Long");
                            try {
                                ((C0407c) c0413i2.f6174a.f3679c).a(((Long) obj3).longValue(), c0413i2.a());
                                w02 = Y4.D.D(null);
                            } catch (Throwable th) {
                                w02 = AbstractC0603a.w0(th);
                            }
                            v02.f(w02);
                            break;
                        case 1:
                            C0413i c0413i3 = c0413i;
                            t6.h.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list = (List) obj2;
                            Object obj4 = list.get(0);
                            t6.h.c(obj4, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView = (WebView) obj4;
                            DownloadListener downloadListener = (DownloadListener) list.get(1);
                            try {
                                c0413i3.getClass();
                                webView.setDownloadListener(downloadListener);
                                w03 = Y4.D.D(null);
                            } catch (Throwable th2) {
                                w03 = AbstractC0603a.w0(th2);
                            }
                            v02.f(w03);
                            break;
                        case 2:
                            C0413i c0413i4 = c0413i;
                            t6.h.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list2 = (List) obj2;
                            Object obj5 = list2.get(0);
                            t6.h.c(obj5, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView2 = (WebView) obj5;
                            Object obj6 = list2.get(1);
                            t6.h.c(obj6, "null cannot be cast to non-null type kotlin.Long");
                            try {
                                ((C0407c) c0413i4.f6174a.f3679c).a(((Long) obj6).longValue(), webView2.getSettings());
                                w04 = Y4.D.D(null);
                            } catch (Throwable th3) {
                                w04 = AbstractC0603a.w0(th3);
                            }
                            v02.f(w04);
                            break;
                        case 3:
                            C0413i c0413i5 = c0413i;
                            t6.h.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list3 = (List) obj2;
                            Object obj7 = list3.get(0);
                            t6.h.c(obj7, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView3 = (WebView) obj7;
                            Z z4 = (Z) list3.get(1);
                            try {
                                c0413i5.getClass();
                                webView3.setWebChromeClient(z4);
                                w05 = Y4.D.D(null);
                            } catch (Throwable th4) {
                                w05 = AbstractC0603a.w0(th4);
                            }
                            v02.f(w05);
                            break;
                        case 4:
                            C0413i c0413i6 = c0413i;
                            t6.h.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list4 = (List) obj2;
                            Object obj8 = list4.get(0);
                            t6.h.c(obj8, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView4 = (WebView) obj8;
                            Object obj9 = list4.get(1);
                            t6.h.c(obj9, "null cannot be cast to non-null type kotlin.Long");
                            long longValue = ((Long) obj9).longValue();
                            try {
                                c0413i6.getClass();
                                webView4.setBackgroundColor((int) longValue);
                                w06 = Y4.D.D(null);
                            } catch (Throwable th5) {
                                w06 = AbstractC0603a.w0(th5);
                            }
                            v02.f(w06);
                            break;
                        case 5:
                            C0413i c0413i7 = c0413i;
                            t6.h.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj10 = ((List) obj2).get(0);
                            t6.h.c(obj10, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView5 = (WebView) obj10;
                            try {
                                c0413i7.getClass();
                                webView5.destroy();
                                w07 = Y4.D.D(null);
                            } catch (Throwable th6) {
                                w07 = AbstractC0603a.w0(th6);
                            }
                            v02.f(w07);
                            break;
                        case 6:
                            C0413i c0413i8 = c0413i;
                            t6.h.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list5 = (List) obj2;
                            Object obj11 = list5.get(0);
                            t6.h.c(obj11, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView6 = (WebView) obj11;
                            Object obj12 = list5.get(1);
                            t6.h.c(obj12, "null cannot be cast to non-null type kotlin.String");
                            String str = (String) obj12;
                            String str2 = (String) list5.get(2);
                            String str3 = (String) list5.get(3);
                            try {
                                c0413i8.getClass();
                                webView6.loadData(str, str2, str3);
                                w08 = Y4.D.D(null);
                            } catch (Throwable th7) {
                                w08 = AbstractC0603a.w0(th7);
                            }
                            v02.f(w08);
                            break;
                        case 7:
                            C0413i c0413i9 = c0413i;
                            t6.h.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list6 = (List) obj2;
                            Object obj13 = list6.get(0);
                            t6.h.c(obj13, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView7 = (WebView) obj13;
                            String str4 = (String) list6.get(1);
                            Object obj14 = list6.get(2);
                            t6.h.c(obj14, "null cannot be cast to non-null type kotlin.String");
                            String str5 = (String) obj14;
                            String str6 = (String) list6.get(3);
                            String str7 = (String) list6.get(4);
                            String str8 = (String) list6.get(5);
                            try {
                                c0413i9.getClass();
                                webView7.loadDataWithBaseURL(str4, str5, str6, str7, str8);
                                w09 = Y4.D.D(null);
                            } catch (Throwable th8) {
                                w09 = AbstractC0603a.w0(th8);
                            }
                            v02.f(w09);
                            break;
                        case 8:
                            C0413i c0413i10 = c0413i;
                            t6.h.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list7 = (List) obj2;
                            Object obj15 = list7.get(0);
                            t6.h.c(obj15, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView8 = (WebView) obj15;
                            Object obj16 = list7.get(1);
                            t6.h.c(obj16, "null cannot be cast to non-null type kotlin.String");
                            String str9 = (String) obj16;
                            Object obj17 = list7.get(2);
                            t6.h.c(obj17, "null cannot be cast to non-null type kotlin.collections.Map<kotlin.String, kotlin.String>");
                            Map<String, String> map = (Map) obj17;
                            try {
                                c0413i10.getClass();
                                webView8.loadUrl(str9, map);
                                w010 = Y4.D.D(null);
                            } catch (Throwable th9) {
                                w010 = AbstractC0603a.w0(th9);
                            }
                            v02.f(w010);
                            break;
                        case 9:
                            C0413i c0413i11 = c0413i;
                            t6.h.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list8 = (List) obj2;
                            Object obj18 = list8.get(0);
                            t6.h.c(obj18, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView9 = (WebView) obj18;
                            Object obj19 = list8.get(1);
                            t6.h.c(obj19, "null cannot be cast to non-null type kotlin.String");
                            String str10 = (String) obj19;
                            Object obj20 = list8.get(2);
                            t6.h.c(obj20, "null cannot be cast to non-null type kotlin.ByteArray");
                            byte[] bArr = (byte[]) obj20;
                            try {
                                c0413i11.getClass();
                                webView9.postUrl(str10, bArr);
                                w011 = Y4.D.D(null);
                            } catch (Throwable th10) {
                                w011 = AbstractC0603a.w0(th10);
                            }
                            v02.f(w011);
                            break;
                        case 10:
                            C0413i c0413i12 = c0413i;
                            t6.h.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj21 = ((List) obj2).get(0);
                            t6.h.c(obj21, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView10 = (WebView) obj21;
                            try {
                                c0413i12.getClass();
                                w012 = Y4.D.D(webView10.getUrl());
                            } catch (Throwable th11) {
                                w012 = AbstractC0603a.w0(th11);
                            }
                            v02.f(w012);
                            break;
                        case 11:
                            C0413i c0413i13 = c0413i;
                            t6.h.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj22 = ((List) obj2).get(0);
                            t6.h.c(obj22, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView11 = (WebView) obj22;
                            try {
                                c0413i13.getClass();
                                webView11.goForward();
                                w013 = Y4.D.D(null);
                            } catch (Throwable th12) {
                                w013 = AbstractC0603a.w0(th12);
                            }
                            v02.f(w013);
                            break;
                        case 12:
                            C0413i c0413i14 = c0413i;
                            t6.h.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj23 = ((List) obj2).get(0);
                            t6.h.c(obj23, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView12 = (WebView) obj23;
                            try {
                                c0413i14.getClass();
                                w014 = Y4.D.D(Boolean.valueOf(webView12.canGoBack()));
                            } catch (Throwable th13) {
                                w014 = AbstractC0603a.w0(th13);
                            }
                            v02.f(w014);
                            break;
                        case 13:
                            C0413i c0413i15 = c0413i;
                            t6.h.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj24 = ((List) obj2).get(0);
                            t6.h.c(obj24, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView13 = (WebView) obj24;
                            try {
                                c0413i15.getClass();
                                w015 = Y4.D.D(Boolean.valueOf(webView13.canGoForward()));
                            } catch (Throwable th14) {
                                w015 = AbstractC0603a.w0(th14);
                            }
                            v02.f(w015);
                            break;
                        case 14:
                            C0413i c0413i16 = c0413i;
                            t6.h.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj25 = ((List) obj2).get(0);
                            t6.h.c(obj25, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView14 = (WebView) obj25;
                            try {
                                c0413i16.getClass();
                                webView14.goBack();
                                w016 = Y4.D.D(null);
                            } catch (Throwable th15) {
                                w016 = AbstractC0603a.w0(th15);
                            }
                            v02.f(w016);
                            break;
                        case 15:
                            C0413i c0413i17 = c0413i;
                            t6.h.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj26 = ((List) obj2).get(0);
                            t6.h.c(obj26, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView15 = (WebView) obj26;
                            try {
                                c0413i17.getClass();
                                webView15.reload();
                                w017 = Y4.D.D(null);
                            } catch (Throwable th16) {
                                w017 = AbstractC0603a.w0(th16);
                            }
                            v02.f(w017);
                            break;
                        case 16:
                            C0413i c0413i18 = c0413i;
                            t6.h.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list9 = (List) obj2;
                            Object obj27 = list9.get(0);
                            t6.h.c(obj27, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView16 = (WebView) obj27;
                            Object obj28 = list9.get(1);
                            t6.h.c(obj28, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean booleanValue = ((Boolean) obj28).booleanValue();
                            try {
                                c0413i18.getClass();
                                webView16.clearCache(booleanValue);
                                w018 = Y4.D.D(null);
                            } catch (Throwable th17) {
                                w018 = AbstractC0603a.w0(th17);
                            }
                            v02.f(w018);
                            break;
                        case 17:
                            t6.h.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list10 = (List) obj2;
                            Object obj29 = list10.get(0);
                            t6.h.c(obj29, "null cannot be cast to non-null type android.webkit.WebView");
                            Object obj30 = list10.get(1);
                            t6.h.c(obj30, "null cannot be cast to non-null type kotlin.String");
                            B b7 = new B(v02, 1);
                            c0413i.getClass();
                            ((WebView) obj29).evaluateJavascript((String) obj30, new C0416l(1, b7));
                            break;
                        case 18:
                            C0413i c0413i19 = c0413i;
                            t6.h.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj31 = ((List) obj2).get(0);
                            t6.h.c(obj31, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView17 = (WebView) obj31;
                            try {
                                c0413i19.getClass();
                                w019 = Y4.D.D(webView17.getTitle());
                            } catch (Throwable th18) {
                                w019 = AbstractC0603a.w0(th18);
                            }
                            v02.f(w019);
                            break;
                        case 19:
                            C0413i c0413i20 = c0413i;
                            t6.h.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj32 = ((List) obj2).get(0);
                            t6.h.c(obj32, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean booleanValue2 = ((Boolean) obj32).booleanValue();
                            try {
                                c0413i20.getClass();
                                WebView.setWebContentsDebuggingEnabled(booleanValue2);
                                w020 = Y4.D.D(null);
                            } catch (Throwable th19) {
                                w020 = AbstractC0603a.w0(th19);
                            }
                            v02.f(w020);
                            break;
                        case 20:
                            C0413i c0413i21 = c0413i;
                            t6.h.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list11 = (List) obj2;
                            Object obj33 = list11.get(0);
                            t6.h.c(obj33, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView18 = (WebView) obj33;
                            WebViewClient webViewClient = (WebViewClient) list11.get(1);
                            try {
                                c0413i21.getClass();
                                webView18.setWebViewClient(webViewClient);
                                w021 = Y4.D.D(null);
                            } catch (Throwable th20) {
                                w021 = AbstractC0603a.w0(th20);
                            }
                            v02.f(w021);
                            break;
                        case zzbbd.zzt.zzm /* 21 */:
                            C0413i c0413i22 = c0413i;
                            t6.h.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list12 = (List) obj2;
                            Object obj34 = list12.get(0);
                            t6.h.c(obj34, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView19 = (WebView) obj34;
                            Object obj35 = list12.get(1);
                            t6.h.c(obj35, "null cannot be cast to non-null type io.flutter.plugins.webviewflutter.JavaScriptChannel");
                            C0425v c0425v = (C0425v) obj35;
                            try {
                                c0413i22.getClass();
                                webView19.addJavascriptInterface(c0425v, c0425v.f6215a);
                                w022 = Y4.D.D(null);
                            } catch (Throwable th21) {
                                w022 = AbstractC0603a.w0(th21);
                            }
                            v02.f(w022);
                            break;
                        default:
                            C0413i c0413i23 = c0413i;
                            t6.h.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list13 = (List) obj2;
                            Object obj36 = list13.get(0);
                            t6.h.c(obj36, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView20 = (WebView) obj36;
                            Object obj37 = list13.get(1);
                            t6.h.c(obj37, "null cannot be cast to non-null type kotlin.String");
                            String str11 = (String) obj37;
                            try {
                                c0413i23.getClass();
                                webView20.removeJavascriptInterface(str11);
                                w023 = Y4.D.D(null);
                            } catch (Throwable th22) {
                                w023 = AbstractC0603a.w0(th22);
                            }
                            v02.f(w023);
                            break;
                    }
                }
            });
        } else {
            f022.M(null);
        }
        w1.F0 f023 = new w1.F0(fVar, "dev.flutter.pigeon.webview_flutter_android.WebView.setBackgroundColor", c0406b, obj, 1);
        if (c0413i != null) {
            final int i28 = 4;
            f023.M(new A5.b() { // from class: R5.N
                @Override // A5.b
                public final void i(Object obj2, V0 v02) {
                    List w02;
                    List w03;
                    List w04;
                    List w05;
                    List w06;
                    List w07;
                    List w08;
                    List w09;
                    List w010;
                    List w011;
                    List w012;
                    List w013;
                    List w014;
                    List w015;
                    List w016;
                    List w017;
                    List w018;
                    List w019;
                    List w020;
                    List w021;
                    List w022;
                    List w023;
                    switch (i28) {
                        case 0:
                            C0413i c0413i2 = c0413i;
                            t6.h.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj3 = ((List) obj2).get(0);
                            t6.h.c(obj3, "null cannot be cast to non-null type kotlin.Long");
                            try {
                                ((C0407c) c0413i2.f6174a.f3679c).a(((Long) obj3).longValue(), c0413i2.a());
                                w02 = Y4.D.D(null);
                            } catch (Throwable th) {
                                w02 = AbstractC0603a.w0(th);
                            }
                            v02.f(w02);
                            break;
                        case 1:
                            C0413i c0413i3 = c0413i;
                            t6.h.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list = (List) obj2;
                            Object obj4 = list.get(0);
                            t6.h.c(obj4, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView = (WebView) obj4;
                            DownloadListener downloadListener = (DownloadListener) list.get(1);
                            try {
                                c0413i3.getClass();
                                webView.setDownloadListener(downloadListener);
                                w03 = Y4.D.D(null);
                            } catch (Throwable th2) {
                                w03 = AbstractC0603a.w0(th2);
                            }
                            v02.f(w03);
                            break;
                        case 2:
                            C0413i c0413i4 = c0413i;
                            t6.h.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list2 = (List) obj2;
                            Object obj5 = list2.get(0);
                            t6.h.c(obj5, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView2 = (WebView) obj5;
                            Object obj6 = list2.get(1);
                            t6.h.c(obj6, "null cannot be cast to non-null type kotlin.Long");
                            try {
                                ((C0407c) c0413i4.f6174a.f3679c).a(((Long) obj6).longValue(), webView2.getSettings());
                                w04 = Y4.D.D(null);
                            } catch (Throwable th3) {
                                w04 = AbstractC0603a.w0(th3);
                            }
                            v02.f(w04);
                            break;
                        case 3:
                            C0413i c0413i5 = c0413i;
                            t6.h.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list3 = (List) obj2;
                            Object obj7 = list3.get(0);
                            t6.h.c(obj7, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView3 = (WebView) obj7;
                            Z z4 = (Z) list3.get(1);
                            try {
                                c0413i5.getClass();
                                webView3.setWebChromeClient(z4);
                                w05 = Y4.D.D(null);
                            } catch (Throwable th4) {
                                w05 = AbstractC0603a.w0(th4);
                            }
                            v02.f(w05);
                            break;
                        case 4:
                            C0413i c0413i6 = c0413i;
                            t6.h.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list4 = (List) obj2;
                            Object obj8 = list4.get(0);
                            t6.h.c(obj8, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView4 = (WebView) obj8;
                            Object obj9 = list4.get(1);
                            t6.h.c(obj9, "null cannot be cast to non-null type kotlin.Long");
                            long longValue = ((Long) obj9).longValue();
                            try {
                                c0413i6.getClass();
                                webView4.setBackgroundColor((int) longValue);
                                w06 = Y4.D.D(null);
                            } catch (Throwable th5) {
                                w06 = AbstractC0603a.w0(th5);
                            }
                            v02.f(w06);
                            break;
                        case 5:
                            C0413i c0413i7 = c0413i;
                            t6.h.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj10 = ((List) obj2).get(0);
                            t6.h.c(obj10, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView5 = (WebView) obj10;
                            try {
                                c0413i7.getClass();
                                webView5.destroy();
                                w07 = Y4.D.D(null);
                            } catch (Throwable th6) {
                                w07 = AbstractC0603a.w0(th6);
                            }
                            v02.f(w07);
                            break;
                        case 6:
                            C0413i c0413i8 = c0413i;
                            t6.h.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list5 = (List) obj2;
                            Object obj11 = list5.get(0);
                            t6.h.c(obj11, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView6 = (WebView) obj11;
                            Object obj12 = list5.get(1);
                            t6.h.c(obj12, "null cannot be cast to non-null type kotlin.String");
                            String str = (String) obj12;
                            String str2 = (String) list5.get(2);
                            String str3 = (String) list5.get(3);
                            try {
                                c0413i8.getClass();
                                webView6.loadData(str, str2, str3);
                                w08 = Y4.D.D(null);
                            } catch (Throwable th7) {
                                w08 = AbstractC0603a.w0(th7);
                            }
                            v02.f(w08);
                            break;
                        case 7:
                            C0413i c0413i9 = c0413i;
                            t6.h.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list6 = (List) obj2;
                            Object obj13 = list6.get(0);
                            t6.h.c(obj13, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView7 = (WebView) obj13;
                            String str4 = (String) list6.get(1);
                            Object obj14 = list6.get(2);
                            t6.h.c(obj14, "null cannot be cast to non-null type kotlin.String");
                            String str5 = (String) obj14;
                            String str6 = (String) list6.get(3);
                            String str7 = (String) list6.get(4);
                            String str8 = (String) list6.get(5);
                            try {
                                c0413i9.getClass();
                                webView7.loadDataWithBaseURL(str4, str5, str6, str7, str8);
                                w09 = Y4.D.D(null);
                            } catch (Throwable th8) {
                                w09 = AbstractC0603a.w0(th8);
                            }
                            v02.f(w09);
                            break;
                        case 8:
                            C0413i c0413i10 = c0413i;
                            t6.h.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list7 = (List) obj2;
                            Object obj15 = list7.get(0);
                            t6.h.c(obj15, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView8 = (WebView) obj15;
                            Object obj16 = list7.get(1);
                            t6.h.c(obj16, "null cannot be cast to non-null type kotlin.String");
                            String str9 = (String) obj16;
                            Object obj17 = list7.get(2);
                            t6.h.c(obj17, "null cannot be cast to non-null type kotlin.collections.Map<kotlin.String, kotlin.String>");
                            Map<String, String> map = (Map) obj17;
                            try {
                                c0413i10.getClass();
                                webView8.loadUrl(str9, map);
                                w010 = Y4.D.D(null);
                            } catch (Throwable th9) {
                                w010 = AbstractC0603a.w0(th9);
                            }
                            v02.f(w010);
                            break;
                        case 9:
                            C0413i c0413i11 = c0413i;
                            t6.h.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list8 = (List) obj2;
                            Object obj18 = list8.get(0);
                            t6.h.c(obj18, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView9 = (WebView) obj18;
                            Object obj19 = list8.get(1);
                            t6.h.c(obj19, "null cannot be cast to non-null type kotlin.String");
                            String str10 = (String) obj19;
                            Object obj20 = list8.get(2);
                            t6.h.c(obj20, "null cannot be cast to non-null type kotlin.ByteArray");
                            byte[] bArr = (byte[]) obj20;
                            try {
                                c0413i11.getClass();
                                webView9.postUrl(str10, bArr);
                                w011 = Y4.D.D(null);
                            } catch (Throwable th10) {
                                w011 = AbstractC0603a.w0(th10);
                            }
                            v02.f(w011);
                            break;
                        case 10:
                            C0413i c0413i12 = c0413i;
                            t6.h.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj21 = ((List) obj2).get(0);
                            t6.h.c(obj21, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView10 = (WebView) obj21;
                            try {
                                c0413i12.getClass();
                                w012 = Y4.D.D(webView10.getUrl());
                            } catch (Throwable th11) {
                                w012 = AbstractC0603a.w0(th11);
                            }
                            v02.f(w012);
                            break;
                        case 11:
                            C0413i c0413i13 = c0413i;
                            t6.h.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj22 = ((List) obj2).get(0);
                            t6.h.c(obj22, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView11 = (WebView) obj22;
                            try {
                                c0413i13.getClass();
                                webView11.goForward();
                                w013 = Y4.D.D(null);
                            } catch (Throwable th12) {
                                w013 = AbstractC0603a.w0(th12);
                            }
                            v02.f(w013);
                            break;
                        case 12:
                            C0413i c0413i14 = c0413i;
                            t6.h.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj23 = ((List) obj2).get(0);
                            t6.h.c(obj23, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView12 = (WebView) obj23;
                            try {
                                c0413i14.getClass();
                                w014 = Y4.D.D(Boolean.valueOf(webView12.canGoBack()));
                            } catch (Throwable th13) {
                                w014 = AbstractC0603a.w0(th13);
                            }
                            v02.f(w014);
                            break;
                        case 13:
                            C0413i c0413i15 = c0413i;
                            t6.h.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj24 = ((List) obj2).get(0);
                            t6.h.c(obj24, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView13 = (WebView) obj24;
                            try {
                                c0413i15.getClass();
                                w015 = Y4.D.D(Boolean.valueOf(webView13.canGoForward()));
                            } catch (Throwable th14) {
                                w015 = AbstractC0603a.w0(th14);
                            }
                            v02.f(w015);
                            break;
                        case 14:
                            C0413i c0413i16 = c0413i;
                            t6.h.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj25 = ((List) obj2).get(0);
                            t6.h.c(obj25, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView14 = (WebView) obj25;
                            try {
                                c0413i16.getClass();
                                webView14.goBack();
                                w016 = Y4.D.D(null);
                            } catch (Throwable th15) {
                                w016 = AbstractC0603a.w0(th15);
                            }
                            v02.f(w016);
                            break;
                        case 15:
                            C0413i c0413i17 = c0413i;
                            t6.h.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj26 = ((List) obj2).get(0);
                            t6.h.c(obj26, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView15 = (WebView) obj26;
                            try {
                                c0413i17.getClass();
                                webView15.reload();
                                w017 = Y4.D.D(null);
                            } catch (Throwable th16) {
                                w017 = AbstractC0603a.w0(th16);
                            }
                            v02.f(w017);
                            break;
                        case 16:
                            C0413i c0413i18 = c0413i;
                            t6.h.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list9 = (List) obj2;
                            Object obj27 = list9.get(0);
                            t6.h.c(obj27, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView16 = (WebView) obj27;
                            Object obj28 = list9.get(1);
                            t6.h.c(obj28, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean booleanValue = ((Boolean) obj28).booleanValue();
                            try {
                                c0413i18.getClass();
                                webView16.clearCache(booleanValue);
                                w018 = Y4.D.D(null);
                            } catch (Throwable th17) {
                                w018 = AbstractC0603a.w0(th17);
                            }
                            v02.f(w018);
                            break;
                        case 17:
                            t6.h.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list10 = (List) obj2;
                            Object obj29 = list10.get(0);
                            t6.h.c(obj29, "null cannot be cast to non-null type android.webkit.WebView");
                            Object obj30 = list10.get(1);
                            t6.h.c(obj30, "null cannot be cast to non-null type kotlin.String");
                            B b7 = new B(v02, 1);
                            c0413i.getClass();
                            ((WebView) obj29).evaluateJavascript((String) obj30, new C0416l(1, b7));
                            break;
                        case 18:
                            C0413i c0413i19 = c0413i;
                            t6.h.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj31 = ((List) obj2).get(0);
                            t6.h.c(obj31, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView17 = (WebView) obj31;
                            try {
                                c0413i19.getClass();
                                w019 = Y4.D.D(webView17.getTitle());
                            } catch (Throwable th18) {
                                w019 = AbstractC0603a.w0(th18);
                            }
                            v02.f(w019);
                            break;
                        case 19:
                            C0413i c0413i20 = c0413i;
                            t6.h.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj32 = ((List) obj2).get(0);
                            t6.h.c(obj32, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean booleanValue2 = ((Boolean) obj32).booleanValue();
                            try {
                                c0413i20.getClass();
                                WebView.setWebContentsDebuggingEnabled(booleanValue2);
                                w020 = Y4.D.D(null);
                            } catch (Throwable th19) {
                                w020 = AbstractC0603a.w0(th19);
                            }
                            v02.f(w020);
                            break;
                        case 20:
                            C0413i c0413i21 = c0413i;
                            t6.h.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list11 = (List) obj2;
                            Object obj33 = list11.get(0);
                            t6.h.c(obj33, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView18 = (WebView) obj33;
                            WebViewClient webViewClient = (WebViewClient) list11.get(1);
                            try {
                                c0413i21.getClass();
                                webView18.setWebViewClient(webViewClient);
                                w021 = Y4.D.D(null);
                            } catch (Throwable th20) {
                                w021 = AbstractC0603a.w0(th20);
                            }
                            v02.f(w021);
                            break;
                        case zzbbd.zzt.zzm /* 21 */:
                            C0413i c0413i22 = c0413i;
                            t6.h.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list12 = (List) obj2;
                            Object obj34 = list12.get(0);
                            t6.h.c(obj34, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView19 = (WebView) obj34;
                            Object obj35 = list12.get(1);
                            t6.h.c(obj35, "null cannot be cast to non-null type io.flutter.plugins.webviewflutter.JavaScriptChannel");
                            C0425v c0425v = (C0425v) obj35;
                            try {
                                c0413i22.getClass();
                                webView19.addJavascriptInterface(c0425v, c0425v.f6215a);
                                w022 = Y4.D.D(null);
                            } catch (Throwable th21) {
                                w022 = AbstractC0603a.w0(th21);
                            }
                            v02.f(w022);
                            break;
                        default:
                            C0413i c0413i23 = c0413i;
                            t6.h.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list13 = (List) obj2;
                            Object obj36 = list13.get(0);
                            t6.h.c(obj36, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView20 = (WebView) obj36;
                            Object obj37 = list13.get(1);
                            t6.h.c(obj37, "null cannot be cast to non-null type kotlin.String");
                            String str11 = (String) obj37;
                            try {
                                c0413i23.getClass();
                                webView20.removeJavascriptInterface(str11);
                                w023 = Y4.D.D(null);
                            } catch (Throwable th22) {
                                w023 = AbstractC0603a.w0(th22);
                            }
                            v02.f(w023);
                            break;
                    }
                }
            });
        } else {
            f023.M(null);
        }
        w1.F0 f024 = new w1.F0(fVar, "dev.flutter.pigeon.webview_flutter_android.WebView.destroy", c0406b, obj, 1);
        if (c0413i == null) {
            f024.M(null);
        } else {
            final int i29 = 5;
            f024.M(new A5.b() { // from class: R5.N
                @Override // A5.b
                public final void i(Object obj2, V0 v02) {
                    List w02;
                    List w03;
                    List w04;
                    List w05;
                    List w06;
                    List w07;
                    List w08;
                    List w09;
                    List w010;
                    List w011;
                    List w012;
                    List w013;
                    List w014;
                    List w015;
                    List w016;
                    List w017;
                    List w018;
                    List w019;
                    List w020;
                    List w021;
                    List w022;
                    List w023;
                    switch (i29) {
                        case 0:
                            C0413i c0413i2 = c0413i;
                            t6.h.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj3 = ((List) obj2).get(0);
                            t6.h.c(obj3, "null cannot be cast to non-null type kotlin.Long");
                            try {
                                ((C0407c) c0413i2.f6174a.f3679c).a(((Long) obj3).longValue(), c0413i2.a());
                                w02 = Y4.D.D(null);
                            } catch (Throwable th) {
                                w02 = AbstractC0603a.w0(th);
                            }
                            v02.f(w02);
                            break;
                        case 1:
                            C0413i c0413i3 = c0413i;
                            t6.h.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list = (List) obj2;
                            Object obj4 = list.get(0);
                            t6.h.c(obj4, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView = (WebView) obj4;
                            DownloadListener downloadListener = (DownloadListener) list.get(1);
                            try {
                                c0413i3.getClass();
                                webView.setDownloadListener(downloadListener);
                                w03 = Y4.D.D(null);
                            } catch (Throwable th2) {
                                w03 = AbstractC0603a.w0(th2);
                            }
                            v02.f(w03);
                            break;
                        case 2:
                            C0413i c0413i4 = c0413i;
                            t6.h.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list2 = (List) obj2;
                            Object obj5 = list2.get(0);
                            t6.h.c(obj5, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView2 = (WebView) obj5;
                            Object obj6 = list2.get(1);
                            t6.h.c(obj6, "null cannot be cast to non-null type kotlin.Long");
                            try {
                                ((C0407c) c0413i4.f6174a.f3679c).a(((Long) obj6).longValue(), webView2.getSettings());
                                w04 = Y4.D.D(null);
                            } catch (Throwable th3) {
                                w04 = AbstractC0603a.w0(th3);
                            }
                            v02.f(w04);
                            break;
                        case 3:
                            C0413i c0413i5 = c0413i;
                            t6.h.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list3 = (List) obj2;
                            Object obj7 = list3.get(0);
                            t6.h.c(obj7, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView3 = (WebView) obj7;
                            Z z4 = (Z) list3.get(1);
                            try {
                                c0413i5.getClass();
                                webView3.setWebChromeClient(z4);
                                w05 = Y4.D.D(null);
                            } catch (Throwable th4) {
                                w05 = AbstractC0603a.w0(th4);
                            }
                            v02.f(w05);
                            break;
                        case 4:
                            C0413i c0413i6 = c0413i;
                            t6.h.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list4 = (List) obj2;
                            Object obj8 = list4.get(0);
                            t6.h.c(obj8, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView4 = (WebView) obj8;
                            Object obj9 = list4.get(1);
                            t6.h.c(obj9, "null cannot be cast to non-null type kotlin.Long");
                            long longValue = ((Long) obj9).longValue();
                            try {
                                c0413i6.getClass();
                                webView4.setBackgroundColor((int) longValue);
                                w06 = Y4.D.D(null);
                            } catch (Throwable th5) {
                                w06 = AbstractC0603a.w0(th5);
                            }
                            v02.f(w06);
                            break;
                        case 5:
                            C0413i c0413i7 = c0413i;
                            t6.h.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj10 = ((List) obj2).get(0);
                            t6.h.c(obj10, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView5 = (WebView) obj10;
                            try {
                                c0413i7.getClass();
                                webView5.destroy();
                                w07 = Y4.D.D(null);
                            } catch (Throwable th6) {
                                w07 = AbstractC0603a.w0(th6);
                            }
                            v02.f(w07);
                            break;
                        case 6:
                            C0413i c0413i8 = c0413i;
                            t6.h.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list5 = (List) obj2;
                            Object obj11 = list5.get(0);
                            t6.h.c(obj11, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView6 = (WebView) obj11;
                            Object obj12 = list5.get(1);
                            t6.h.c(obj12, "null cannot be cast to non-null type kotlin.String");
                            String str = (String) obj12;
                            String str2 = (String) list5.get(2);
                            String str3 = (String) list5.get(3);
                            try {
                                c0413i8.getClass();
                                webView6.loadData(str, str2, str3);
                                w08 = Y4.D.D(null);
                            } catch (Throwable th7) {
                                w08 = AbstractC0603a.w0(th7);
                            }
                            v02.f(w08);
                            break;
                        case 7:
                            C0413i c0413i9 = c0413i;
                            t6.h.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list6 = (List) obj2;
                            Object obj13 = list6.get(0);
                            t6.h.c(obj13, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView7 = (WebView) obj13;
                            String str4 = (String) list6.get(1);
                            Object obj14 = list6.get(2);
                            t6.h.c(obj14, "null cannot be cast to non-null type kotlin.String");
                            String str5 = (String) obj14;
                            String str6 = (String) list6.get(3);
                            String str7 = (String) list6.get(4);
                            String str8 = (String) list6.get(5);
                            try {
                                c0413i9.getClass();
                                webView7.loadDataWithBaseURL(str4, str5, str6, str7, str8);
                                w09 = Y4.D.D(null);
                            } catch (Throwable th8) {
                                w09 = AbstractC0603a.w0(th8);
                            }
                            v02.f(w09);
                            break;
                        case 8:
                            C0413i c0413i10 = c0413i;
                            t6.h.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list7 = (List) obj2;
                            Object obj15 = list7.get(0);
                            t6.h.c(obj15, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView8 = (WebView) obj15;
                            Object obj16 = list7.get(1);
                            t6.h.c(obj16, "null cannot be cast to non-null type kotlin.String");
                            String str9 = (String) obj16;
                            Object obj17 = list7.get(2);
                            t6.h.c(obj17, "null cannot be cast to non-null type kotlin.collections.Map<kotlin.String, kotlin.String>");
                            Map<String, String> map = (Map) obj17;
                            try {
                                c0413i10.getClass();
                                webView8.loadUrl(str9, map);
                                w010 = Y4.D.D(null);
                            } catch (Throwable th9) {
                                w010 = AbstractC0603a.w0(th9);
                            }
                            v02.f(w010);
                            break;
                        case 9:
                            C0413i c0413i11 = c0413i;
                            t6.h.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list8 = (List) obj2;
                            Object obj18 = list8.get(0);
                            t6.h.c(obj18, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView9 = (WebView) obj18;
                            Object obj19 = list8.get(1);
                            t6.h.c(obj19, "null cannot be cast to non-null type kotlin.String");
                            String str10 = (String) obj19;
                            Object obj20 = list8.get(2);
                            t6.h.c(obj20, "null cannot be cast to non-null type kotlin.ByteArray");
                            byte[] bArr = (byte[]) obj20;
                            try {
                                c0413i11.getClass();
                                webView9.postUrl(str10, bArr);
                                w011 = Y4.D.D(null);
                            } catch (Throwable th10) {
                                w011 = AbstractC0603a.w0(th10);
                            }
                            v02.f(w011);
                            break;
                        case 10:
                            C0413i c0413i12 = c0413i;
                            t6.h.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj21 = ((List) obj2).get(0);
                            t6.h.c(obj21, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView10 = (WebView) obj21;
                            try {
                                c0413i12.getClass();
                                w012 = Y4.D.D(webView10.getUrl());
                            } catch (Throwable th11) {
                                w012 = AbstractC0603a.w0(th11);
                            }
                            v02.f(w012);
                            break;
                        case 11:
                            C0413i c0413i13 = c0413i;
                            t6.h.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj22 = ((List) obj2).get(0);
                            t6.h.c(obj22, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView11 = (WebView) obj22;
                            try {
                                c0413i13.getClass();
                                webView11.goForward();
                                w013 = Y4.D.D(null);
                            } catch (Throwable th12) {
                                w013 = AbstractC0603a.w0(th12);
                            }
                            v02.f(w013);
                            break;
                        case 12:
                            C0413i c0413i14 = c0413i;
                            t6.h.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj23 = ((List) obj2).get(0);
                            t6.h.c(obj23, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView12 = (WebView) obj23;
                            try {
                                c0413i14.getClass();
                                w014 = Y4.D.D(Boolean.valueOf(webView12.canGoBack()));
                            } catch (Throwable th13) {
                                w014 = AbstractC0603a.w0(th13);
                            }
                            v02.f(w014);
                            break;
                        case 13:
                            C0413i c0413i15 = c0413i;
                            t6.h.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj24 = ((List) obj2).get(0);
                            t6.h.c(obj24, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView13 = (WebView) obj24;
                            try {
                                c0413i15.getClass();
                                w015 = Y4.D.D(Boolean.valueOf(webView13.canGoForward()));
                            } catch (Throwable th14) {
                                w015 = AbstractC0603a.w0(th14);
                            }
                            v02.f(w015);
                            break;
                        case 14:
                            C0413i c0413i16 = c0413i;
                            t6.h.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj25 = ((List) obj2).get(0);
                            t6.h.c(obj25, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView14 = (WebView) obj25;
                            try {
                                c0413i16.getClass();
                                webView14.goBack();
                                w016 = Y4.D.D(null);
                            } catch (Throwable th15) {
                                w016 = AbstractC0603a.w0(th15);
                            }
                            v02.f(w016);
                            break;
                        case 15:
                            C0413i c0413i17 = c0413i;
                            t6.h.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj26 = ((List) obj2).get(0);
                            t6.h.c(obj26, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView15 = (WebView) obj26;
                            try {
                                c0413i17.getClass();
                                webView15.reload();
                                w017 = Y4.D.D(null);
                            } catch (Throwable th16) {
                                w017 = AbstractC0603a.w0(th16);
                            }
                            v02.f(w017);
                            break;
                        case 16:
                            C0413i c0413i18 = c0413i;
                            t6.h.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list9 = (List) obj2;
                            Object obj27 = list9.get(0);
                            t6.h.c(obj27, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView16 = (WebView) obj27;
                            Object obj28 = list9.get(1);
                            t6.h.c(obj28, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean booleanValue = ((Boolean) obj28).booleanValue();
                            try {
                                c0413i18.getClass();
                                webView16.clearCache(booleanValue);
                                w018 = Y4.D.D(null);
                            } catch (Throwable th17) {
                                w018 = AbstractC0603a.w0(th17);
                            }
                            v02.f(w018);
                            break;
                        case 17:
                            t6.h.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list10 = (List) obj2;
                            Object obj29 = list10.get(0);
                            t6.h.c(obj29, "null cannot be cast to non-null type android.webkit.WebView");
                            Object obj30 = list10.get(1);
                            t6.h.c(obj30, "null cannot be cast to non-null type kotlin.String");
                            B b7 = new B(v02, 1);
                            c0413i.getClass();
                            ((WebView) obj29).evaluateJavascript((String) obj30, new C0416l(1, b7));
                            break;
                        case 18:
                            C0413i c0413i19 = c0413i;
                            t6.h.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj31 = ((List) obj2).get(0);
                            t6.h.c(obj31, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView17 = (WebView) obj31;
                            try {
                                c0413i19.getClass();
                                w019 = Y4.D.D(webView17.getTitle());
                            } catch (Throwable th18) {
                                w019 = AbstractC0603a.w0(th18);
                            }
                            v02.f(w019);
                            break;
                        case 19:
                            C0413i c0413i20 = c0413i;
                            t6.h.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj32 = ((List) obj2).get(0);
                            t6.h.c(obj32, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean booleanValue2 = ((Boolean) obj32).booleanValue();
                            try {
                                c0413i20.getClass();
                                WebView.setWebContentsDebuggingEnabled(booleanValue2);
                                w020 = Y4.D.D(null);
                            } catch (Throwable th19) {
                                w020 = AbstractC0603a.w0(th19);
                            }
                            v02.f(w020);
                            break;
                        case 20:
                            C0413i c0413i21 = c0413i;
                            t6.h.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list11 = (List) obj2;
                            Object obj33 = list11.get(0);
                            t6.h.c(obj33, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView18 = (WebView) obj33;
                            WebViewClient webViewClient = (WebViewClient) list11.get(1);
                            try {
                                c0413i21.getClass();
                                webView18.setWebViewClient(webViewClient);
                                w021 = Y4.D.D(null);
                            } catch (Throwable th20) {
                                w021 = AbstractC0603a.w0(th20);
                            }
                            v02.f(w021);
                            break;
                        case zzbbd.zzt.zzm /* 21 */:
                            C0413i c0413i22 = c0413i;
                            t6.h.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list12 = (List) obj2;
                            Object obj34 = list12.get(0);
                            t6.h.c(obj34, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView19 = (WebView) obj34;
                            Object obj35 = list12.get(1);
                            t6.h.c(obj35, "null cannot be cast to non-null type io.flutter.plugins.webviewflutter.JavaScriptChannel");
                            C0425v c0425v = (C0425v) obj35;
                            try {
                                c0413i22.getClass();
                                webView19.addJavascriptInterface(c0425v, c0425v.f6215a);
                                w022 = Y4.D.D(null);
                            } catch (Throwable th21) {
                                w022 = AbstractC0603a.w0(th21);
                            }
                            v02.f(w022);
                            break;
                        default:
                            C0413i c0413i23 = c0413i;
                            t6.h.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list13 = (List) obj2;
                            Object obj36 = list13.get(0);
                            t6.h.c(obj36, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView20 = (WebView) obj36;
                            Object obj37 = list13.get(1);
                            t6.h.c(obj37, "null cannot be cast to non-null type kotlin.String");
                            String str11 = (String) obj37;
                            try {
                                c0413i23.getClass();
                                webView20.removeJavascriptInterface(str11);
                                w023 = Y4.D.D(null);
                            } catch (Throwable th22) {
                                w023 = AbstractC0603a.w0(th22);
                            }
                            v02.f(w023);
                            break;
                    }
                }
            });
        }
    }

    public static void X(A5.f fVar, final C0424u c0424u) {
        I4.j jVar;
        t6.h.e(fVar, "binaryMessenger");
        A5.n c0406b = (c0424u == null || (jVar = c0424u.f6214a) == null) ? new C0406b() : jVar.a();
        Object obj = null;
        w1.F0 f02 = new w1.F0(fVar, "dev.flutter.pigeon.webview_flutter_android.HttpAuthHandler.useHttpAuthUsernamePassword", c0406b, obj, 1);
        if (c0424u != null) {
            final int i7 = 0;
            f02.M(new A5.b() { // from class: R5.E
                @Override // A5.b
                public final void i(Object obj2, V0 v02) {
                    List w02;
                    List w03;
                    List w04;
                    switch (i7) {
                        case 0:
                            C0424u c0424u2 = c0424u;
                            t6.h.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj3 = ((List) obj2).get(0);
                            t6.h.c(obj3, "null cannot be cast to non-null type android.webkit.HttpAuthHandler");
                            HttpAuthHandler httpAuthHandler = (HttpAuthHandler) obj3;
                            try {
                                c0424u2.getClass();
                                w02 = Y4.D.D(Boolean.valueOf(httpAuthHandler.useHttpAuthUsernamePassword()));
                            } catch (Throwable th) {
                                w02 = AbstractC0603a.w0(th);
                            }
                            v02.f(w02);
                            break;
                        case 1:
                            C0424u c0424u3 = c0424u;
                            t6.h.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj4 = ((List) obj2).get(0);
                            t6.h.c(obj4, "null cannot be cast to non-null type android.webkit.HttpAuthHandler");
                            HttpAuthHandler httpAuthHandler2 = (HttpAuthHandler) obj4;
                            try {
                                c0424u3.getClass();
                                httpAuthHandler2.cancel();
                                w03 = Y4.D.D(null);
                            } catch (Throwable th2) {
                                w03 = AbstractC0603a.w0(th2);
                            }
                            v02.f(w03);
                            break;
                        default:
                            C0424u c0424u4 = c0424u;
                            t6.h.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list = (List) obj2;
                            Object obj5 = list.get(0);
                            t6.h.c(obj5, "null cannot be cast to non-null type android.webkit.HttpAuthHandler");
                            HttpAuthHandler httpAuthHandler3 = (HttpAuthHandler) obj5;
                            Object obj6 = list.get(1);
                            t6.h.c(obj6, "null cannot be cast to non-null type kotlin.String");
                            String str = (String) obj6;
                            Object obj7 = list.get(2);
                            t6.h.c(obj7, "null cannot be cast to non-null type kotlin.String");
                            String str2 = (String) obj7;
                            try {
                                c0424u4.getClass();
                                httpAuthHandler3.proceed(str, str2);
                                w04 = Y4.D.D(null);
                            } catch (Throwable th3) {
                                w04 = AbstractC0603a.w0(th3);
                            }
                            v02.f(w04);
                            break;
                    }
                }
            });
        } else {
            f02.M(null);
        }
        w1.F0 f03 = new w1.F0(fVar, "dev.flutter.pigeon.webview_flutter_android.HttpAuthHandler.cancel", c0406b, obj, 1);
        if (c0424u != null) {
            final int i8 = 1;
            f03.M(new A5.b() { // from class: R5.E
                @Override // A5.b
                public final void i(Object obj2, V0 v02) {
                    List w02;
                    List w03;
                    List w04;
                    switch (i8) {
                        case 0:
                            C0424u c0424u2 = c0424u;
                            t6.h.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj3 = ((List) obj2).get(0);
                            t6.h.c(obj3, "null cannot be cast to non-null type android.webkit.HttpAuthHandler");
                            HttpAuthHandler httpAuthHandler = (HttpAuthHandler) obj3;
                            try {
                                c0424u2.getClass();
                                w02 = Y4.D.D(Boolean.valueOf(httpAuthHandler.useHttpAuthUsernamePassword()));
                            } catch (Throwable th) {
                                w02 = AbstractC0603a.w0(th);
                            }
                            v02.f(w02);
                            break;
                        case 1:
                            C0424u c0424u3 = c0424u;
                            t6.h.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj4 = ((List) obj2).get(0);
                            t6.h.c(obj4, "null cannot be cast to non-null type android.webkit.HttpAuthHandler");
                            HttpAuthHandler httpAuthHandler2 = (HttpAuthHandler) obj4;
                            try {
                                c0424u3.getClass();
                                httpAuthHandler2.cancel();
                                w03 = Y4.D.D(null);
                            } catch (Throwable th2) {
                                w03 = AbstractC0603a.w0(th2);
                            }
                            v02.f(w03);
                            break;
                        default:
                            C0424u c0424u4 = c0424u;
                            t6.h.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list = (List) obj2;
                            Object obj5 = list.get(0);
                            t6.h.c(obj5, "null cannot be cast to non-null type android.webkit.HttpAuthHandler");
                            HttpAuthHandler httpAuthHandler3 = (HttpAuthHandler) obj5;
                            Object obj6 = list.get(1);
                            t6.h.c(obj6, "null cannot be cast to non-null type kotlin.String");
                            String str = (String) obj6;
                            Object obj7 = list.get(2);
                            t6.h.c(obj7, "null cannot be cast to non-null type kotlin.String");
                            String str2 = (String) obj7;
                            try {
                                c0424u4.getClass();
                                httpAuthHandler3.proceed(str, str2);
                                w04 = Y4.D.D(null);
                            } catch (Throwable th3) {
                                w04 = AbstractC0603a.w0(th3);
                            }
                            v02.f(w04);
                            break;
                    }
                }
            });
        } else {
            f03.M(null);
        }
        w1.F0 f04 = new w1.F0(fVar, "dev.flutter.pigeon.webview_flutter_android.HttpAuthHandler.proceed", c0406b, obj, 1);
        if (c0424u == null) {
            f04.M(null);
        } else {
            final int i9 = 2;
            f04.M(new A5.b() { // from class: R5.E
                @Override // A5.b
                public final void i(Object obj2, V0 v02) {
                    List w02;
                    List w03;
                    List w04;
                    switch (i9) {
                        case 0:
                            C0424u c0424u2 = c0424u;
                            t6.h.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj3 = ((List) obj2).get(0);
                            t6.h.c(obj3, "null cannot be cast to non-null type android.webkit.HttpAuthHandler");
                            HttpAuthHandler httpAuthHandler = (HttpAuthHandler) obj3;
                            try {
                                c0424u2.getClass();
                                w02 = Y4.D.D(Boolean.valueOf(httpAuthHandler.useHttpAuthUsernamePassword()));
                            } catch (Throwable th) {
                                w02 = AbstractC0603a.w0(th);
                            }
                            v02.f(w02);
                            break;
                        case 1:
                            C0424u c0424u3 = c0424u;
                            t6.h.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj4 = ((List) obj2).get(0);
                            t6.h.c(obj4, "null cannot be cast to non-null type android.webkit.HttpAuthHandler");
                            HttpAuthHandler httpAuthHandler2 = (HttpAuthHandler) obj4;
                            try {
                                c0424u3.getClass();
                                httpAuthHandler2.cancel();
                                w03 = Y4.D.D(null);
                            } catch (Throwable th2) {
                                w03 = AbstractC0603a.w0(th2);
                            }
                            v02.f(w03);
                            break;
                        default:
                            C0424u c0424u4 = c0424u;
                            t6.h.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list = (List) obj2;
                            Object obj5 = list.get(0);
                            t6.h.c(obj5, "null cannot be cast to non-null type android.webkit.HttpAuthHandler");
                            HttpAuthHandler httpAuthHandler3 = (HttpAuthHandler) obj5;
                            Object obj6 = list.get(1);
                            t6.h.c(obj6, "null cannot be cast to non-null type kotlin.String");
                            String str = (String) obj6;
                            Object obj7 = list.get(2);
                            t6.h.c(obj7, "null cannot be cast to non-null type kotlin.String");
                            String str2 = (String) obj7;
                            try {
                                c0424u4.getClass();
                                httpAuthHandler3.proceed(str, str2);
                                w04 = Y4.D.D(null);
                            } catch (Throwable th3) {
                                w04 = AbstractC0603a.w0(th3);
                            }
                            v02.f(w04);
                            break;
                    }
                }
            });
        }
    }

    public static ArrayList Y(String str) {
        ArrayList arrayList = new ArrayList();
        String[] split = str.split("/", -1);
        for (int i7 = 0; i7 < split.length; i7++) {
            if (!split[i7].isEmpty()) {
                arrayList.add(split[i7]);
            }
        }
        return arrayList;
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x006d  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0096  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0099  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0044  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:28:0x0087 -> B:13:0x0067). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:29:0x008a -> B:13:0x0067). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object a(List list, C0764l c0764l, AbstractC1356c abstractC1356c) {
        C0758f c0758f;
        int i7;
        List list2;
        t6.p pVar;
        Iterator it;
        Throwable th;
        if (abstractC1356c instanceof C0758f) {
            c0758f = (C0758f) abstractC1356c;
            int i8 = c0758f.f10037d;
            if ((i8 & Integer.MIN_VALUE) != 0) {
                c0758f.f10037d = i8 - Integer.MIN_VALUE;
                Object obj = c0758f.f10036c;
                Object obj2 = j6.a.f14642a;
                i7 = c0758f.f10037d;
                if (i7 != 0) {
                    AbstractC0603a.p0(obj);
                    ArrayList arrayList = new ArrayList();
                    C0760h c0760h = new C0760h(list, arrayList, null);
                    c0758f.f10034a = arrayList;
                    c0758f.f10037d = 1;
                    if (c0764l.a(c0760h, c0758f) == obj2) {
                        return obj2;
                    }
                    list2 = arrayList;
                } else {
                    if (i7 != 1) {
                        if (i7 != 2) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        it = c0758f.f10035b;
                        pVar = (t6.p) c0758f.f10034a;
                        try {
                            AbstractC0603a.p0(obj);
                        } catch (Throwable th2) {
                            Object obj3 = pVar.f16472a;
                            if (obj3 == null) {
                                pVar.f16472a = th2;
                            } else {
                                Q0.a.c((Throwable) obj3, th2);
                            }
                        }
                        while (it.hasNext()) {
                            Function1 function1 = (Function1) it.next();
                            c0758f.f10034a = pVar;
                            c0758f.f10035b = it;
                            c0758f.f10037d = 2;
                            if (function1.invoke(c0758f) == obj2) {
                                return obj2;
                            }
                        }
                        th = (Throwable) pVar.f16472a;
                        if (th == null) {
                            return C1116i.f13008a;
                        }
                        throw th;
                    }
                    list2 = (List) c0758f.f10034a;
                    AbstractC0603a.p0(obj);
                }
                pVar = new t6.p();
                it = list2.iterator();
                while (it.hasNext()) {
                }
                th = (Throwable) pVar.f16472a;
                if (th == null) {
                }
            }
        }
        c0758f = new C0758f(abstractC1356c);
        Object obj4 = c0758f.f10036c;
        Object obj22 = j6.a.f14642a;
        i7 = c0758f.f10037d;
        if (i7 != 0) {
        }
        pVar = new t6.p();
        it = list2.iterator();
        while (it.hasNext()) {
        }
        th = (Throwable) pVar.f16472a;
        if (th == null) {
        }
    }

    public static String a0(String str) {
        int length = str.length();
        int i7 = 0;
        while (i7 < length) {
            char charAt = str.charAt(i7);
            if (charAt >= 'A' && charAt <= 'Z') {
                char[] charArray = str.toCharArray();
                while (i7 < length) {
                    char c3 = charArray[i7];
                    if (c3 >= 'A' && c3 <= 'Z') {
                        charArray[i7] = (char) (c3 ^ ' ');
                    }
                    i7++;
                }
                return String.valueOf(charArray);
            }
            i7++;
        }
        return str;
    }

    public static AbstractC0178k b(AbstractC0178k abstractC0178k) {
        int i7;
        e(abstractC0178k);
        if (abstractC0178k instanceof C0177j) {
            return abstractC0178k;
        }
        C0171d c0171d = (C0171d) abstractC0178k;
        List unmodifiableList = Collections.unmodifiableList(c0171d.f2171a);
        if (unmodifiableList.size() == 1) {
            return b((AbstractC0178k) unmodifiableList.get(0));
        }
        Iterator it = c0171d.f2171a.iterator();
        while (it.hasNext()) {
            if (((AbstractC0178k) it.next()) instanceof C0171d) {
                ArrayList arrayList = new ArrayList();
                Iterator it2 = unmodifiableList.iterator();
                while (it2.hasNext()) {
                    arrayList.add(b((AbstractC0178k) it2.next()));
                }
                ArrayList arrayList2 = new ArrayList();
                Iterator it3 = arrayList.iterator();
                while (true) {
                    boolean hasNext = it3.hasNext();
                    i7 = c0171d.f2172b;
                    if (!hasNext) {
                        break;
                    }
                    AbstractC0178k abstractC0178k2 = (AbstractC0178k) it3.next();
                    if (abstractC0178k2 instanceof C0177j) {
                        arrayList2.add(abstractC0178k2);
                    } else if (abstractC0178k2 instanceof C0171d) {
                        C0171d c0171d2 = (C0171d) abstractC0178k2;
                        if (t.e.b(c0171d2.f2172b, i7)) {
                            arrayList2.addAll(Collections.unmodifiableList(c0171d2.f2171a));
                        } else {
                            arrayList2.add(c0171d2);
                        }
                    }
                }
                return arrayList2.size() == 1 ? (AbstractC0178k) arrayList2.get(0) : new C0171d(i7, arrayList2);
            }
        }
        return c0171d;
    }

    public static String b0(String str) {
        int length = str.length();
        int i7 = 0;
        while (i7 < length) {
            char charAt = str.charAt(i7);
            if (charAt >= 'a' && charAt <= 'z') {
                char[] charArray = str.toCharArray();
                while (i7 < length) {
                    char c3 = charArray[i7];
                    if (c3 >= 'a' && c3 <= 'z') {
                        charArray[i7] = (char) (c3 ^ ' ');
                    }
                    i7++;
                }
                return String.valueOf(charArray);
            }
            i7++;
        }
        return str;
    }

    public static C0171d c(C0177j c0177j, C0171d c0171d) {
        boolean e7 = c0171d.e();
        ArrayList arrayList = c0171d.f2171a;
        if (e7) {
            List singletonList = Collections.singletonList(c0177j);
            ArrayList arrayList2 = new ArrayList(arrayList);
            arrayList2.addAll(singletonList);
            return new C0171d(c0171d.f2172b, arrayList2);
        }
        ArrayList arrayList3 = new ArrayList();
        Iterator it = Collections.unmodifiableList(arrayList).iterator();
        while (it.hasNext()) {
            arrayList3.add(d(c0177j, (AbstractC0178k) it.next()));
        }
        return new C0171d(2, arrayList3);
    }

    public static boolean c0(View view, S5.c cVar) {
        if (view == null) {
            return false;
        }
        if (cVar.c(view)) {
            return true;
        }
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            for (int i7 = 0; i7 < viewGroup.getChildCount(); i7++) {
                if (c0(viewGroup.getChildAt(i7), cVar)) {
                    return true;
                }
            }
        }
        return false;
    }

    public static AbstractC0178k d(AbstractC0178k abstractC0178k, AbstractC0178k abstractC0178k2) {
        C0171d c0171d;
        C0171d c0171d2;
        e(abstractC0178k);
        e(abstractC0178k2);
        boolean z4 = abstractC0178k instanceof C0177j;
        if (z4 && (abstractC0178k2 instanceof C0177j)) {
            c0171d2 = new C0171d(1, Arrays.asList((C0177j) abstractC0178k, (C0177j) abstractC0178k2));
        } else if (z4 && (abstractC0178k2 instanceof C0171d)) {
            c0171d2 = c((C0177j) abstractC0178k, (C0171d) abstractC0178k2);
        } else if ((abstractC0178k instanceof C0171d) && (abstractC0178k2 instanceof C0177j)) {
            c0171d2 = c((C0177j) abstractC0178k2, (C0171d) abstractC0178k);
        } else {
            C0171d c0171d3 = (C0171d) abstractC0178k;
            C0171d c0171d4 = (C0171d) abstractC0178k2;
            p3.f.O("Found an empty composite filter", (Collections.unmodifiableList(c0171d3.f2171a).isEmpty() || Collections.unmodifiableList(c0171d4.f2171a).isEmpty()) ? false : true, new Object[0]);
            boolean e7 = c0171d3.e();
            int i7 = c0171d3.f2172b;
            if (e7 && c0171d4.e()) {
                List unmodifiableList = Collections.unmodifiableList(c0171d4.f2171a);
                ArrayList arrayList = new ArrayList(c0171d3.f2171a);
                arrayList.addAll(unmodifiableList);
                c0171d = new C0171d(i7, arrayList);
            } else {
                C0171d c0171d5 = i7 == 2 ? c0171d3 : c0171d4;
                if (i7 == 2) {
                    c0171d3 = c0171d4;
                }
                ArrayList arrayList2 = new ArrayList();
                Iterator it = Collections.unmodifiableList(c0171d5.f2171a).iterator();
                while (it.hasNext()) {
                    arrayList2.add(d((AbstractC0178k) it.next(), c0171d3));
                }
                c0171d = new C0171d(2, arrayList2);
            }
            c0171d2 = c0171d;
        }
        return b(c0171d2);
    }

    public static void e(AbstractC0178k abstractC0178k) {
        p3.f.O("Only field filters and composite filters are accepted.", (abstractC0178k instanceof C0177j) || (abstractC0178k instanceof C0171d), new Object[0]);
    }

    public static Object e0(Object obj) {
        if (obj == null) {
            return JSONObject.NULL;
        }
        if ((obj instanceof JSONArray) || (obj instanceof JSONObject)) {
            return obj;
        }
        if (obj.equals(JSONObject.NULL)) {
            return obj;
        }
        if (obj instanceof Collection) {
            JSONArray jSONArray = new JSONArray();
            Iterator it = ((Collection) obj).iterator();
            while (it.hasNext()) {
                jSONArray.put(e0(it.next()));
            }
            return jSONArray;
        }
        if (obj.getClass().isArray()) {
            JSONArray jSONArray2 = new JSONArray();
            int length = Array.getLength(obj);
            for (int i7 = 0; i7 < length; i7++) {
                jSONArray2.put(e0(Array.get(obj, i7)));
            }
            return jSONArray2;
        }
        if (obj instanceof Map) {
            JSONObject jSONObject = new JSONObject();
            for (Map.Entry entry : ((Map) obj).entrySet()) {
                jSONObject.put((String) entry.getKey(), e0(entry.getValue()));
            }
            return jSONObject;
        }
        if (!(obj instanceof Boolean) && !(obj instanceof Byte) && !(obj instanceof Character) && !(obj instanceof Double) && !(obj instanceof Float) && !(obj instanceof Integer) && !(obj instanceof Long) && !(obj instanceof Short) && !(obj instanceof String)) {
            if (obj.getClass().getPackage().getName().startsWith("java.")) {
                return obj.toString();
            }
            return null;
        }
        return obj;
    }

    public static C1640q f(g2.m mVar, String str, g2.j jVar, int i7) {
        C1639p c1639p = new C1639p();
        c1639p.f16800a = AbstractC1664a.D(str, jVar.f13153c);
        c1639p.f16803d = jVar.f13151a;
        c1639p.f16804e = jVar.f13152b;
        String a2 = mVar.a();
        if (a2 == null) {
            a2 = AbstractC1664a.D(((g2.b) mVar.f13159b.get(0)).f13105a, jVar.f13153c).toString();
        }
        c1639p.f16805f = a2;
        c1639p.f16806g = i7;
        if (c1639p.f16800a != null) {
            return new C1640q(c1639p.f16800a, c1639p.f16801b, null, c1639p.f16802c, c1639p.f16803d, c1639p.f16804e, c1639p.f16805f, c1639p.f16806g);
        }
        throw new IllegalStateException("The uri must be set.");
    }

    public static ArrayList f0(Exception exc) {
        ArrayList arrayList = new ArrayList(3);
        arrayList.add(exc.toString());
        arrayList.add(exc.getClass().getSimpleName());
        arrayList.add("Cause: " + exc.getCause() + ", Stacktrace: " + Log.getStackTraceString(exc));
        return arrayList;
    }

    public static void g(Context context, S5.b bVar) {
        Rect rect;
        P.q0 b7;
        WindowMetrics maximumWindowMetrics;
        Activity q7 = q(context);
        if (q7 != null) {
            X0.n.f7458a.getClass();
            int i7 = X0.o.f7459b;
            int i8 = Build.VERSION.SDK_INT;
            if (i8 >= 30) {
                maximumWindowMetrics = ((WindowManager) q7.getSystemService(WindowManager.class)).getMaximumWindowMetrics();
                rect = maximumWindowMetrics.getBounds();
                t6.h.d(rect, "wm.maximumWindowMetrics.bounds");
            } else {
                Object systemService = q7.getSystemService("window");
                t6.h.c(systemService, "null cannot be cast to non-null type android.view.WindowManager");
                Display defaultDisplay = ((WindowManager) systemService).getDefaultDisplay();
                t6.h.d(defaultDisplay, "display");
                Point point = new Point();
                defaultDisplay.getRealSize(point);
                rect = new Rect(0, 0, point.x, point.y);
            }
            if (i8 < 30) {
                b7 = (i8 >= 30 ? new P.h0() : i8 >= 29 ? new P.g0() : new P.f0()).b();
                t6.h.d(b7, "{\n            WindowInse…ilder().build()\n        }");
            } else {
                if (i8 < 30) {
                    throw new Exception("Incompatible SDK version");
                }
                b7 = C0778a.f10125a.a(q7);
            }
            int i9 = rect.left;
            int i10 = rect.top;
            int i11 = rect.right;
            int i12 = rect.bottom;
            if (i9 > i11) {
                throw new IllegalArgumentException(AbstractC0486a1.e(i9, i11, "Left must be less than or equal to right, left: ", ", right: ").toString());
            }
            if (i10 > i12) {
                throw new IllegalArgumentException(AbstractC0486a1.e(i10, i12, "top must be less than or equal to bottom, top: ", ", bottom: ").toString());
            }
            t6.h.e(b7, "_windowInsetsCompat");
            ((C1577b) bVar).f16031a.updateDisplayMetrics(0, new Rect(i9, i10, i11, i12).width(), new Rect(i9, i10, i11, i12).height(), context.getResources().getDisplayMetrics().density);
        }
    }

    public static ArrayList g0(Throwable th) {
        ArrayList arrayList = new ArrayList(3);
        if (th instanceof K5.i) {
            K5.i iVar = (K5.i) th;
            arrayList.add(iVar.f4111a);
            arrayList.add(iVar.getMessage());
            arrayList.add(null);
        } else {
            arrayList.add(th.toString());
            arrayList.add(th.getClass().getSimpleName());
            arrayList.add("Cause: " + th.getCause() + ", Stacktrace: " + Log.getStackTraceString(th));
        }
        return arrayList;
    }

    /* JADX WARN: Code restructure failed: missing block: B:33:0x0088, code lost:
    
        if (r13 == r21.f2554f) goto L52;
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x0097, code lost:
    
        if ((r20.t() * com.google.android.gms.internal.ads.zzbbd.zzq.zzf) == r1) goto L52;
     */
    /* JADX WARN: Code restructure failed: missing block: B:43:0x00a5, code lost:
    
        if (r6 == r1) goto L52;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static boolean h(C0095a c0095a, F1.o oVar, int i7, E4.y yVar) {
        long u4 = c0095a.u();
        long j3 = u4 >>> 16;
        if (j3 != i7) {
            return false;
        }
        boolean z4 = (j3 & 1) == 1;
        int i8 = (int) ((u4 >> 12) & 15);
        int i9 = (int) ((u4 >> 8) & 15);
        int i10 = (int) ((u4 >> 4) & 15);
        int i11 = (int) ((u4 >> 1) & 7);
        boolean z7 = (u4 & 1) == 1;
        if (i10 > 7 ? !(i10 > 10 || oVar.f2555g != 2) : i10 == oVar.f2555g - 1) {
            if ((i11 == 0 || i11 == oVar.f2557i) && !z7) {
                try {
                    long z8 = c0095a.z();
                    if (!z4) {
                        z8 *= oVar.f2550b;
                    }
                    yVar.f2247a = z8;
                    int N7 = N(i8, c0095a);
                    if (N7 != -1 && N7 <= oVar.f2550b) {
                        if (i9 != 0) {
                            if (i9 > 11) {
                                int i12 = oVar.f2553e;
                                if (i9 != 12) {
                                    if (i9 <= 14) {
                                        int y4 = c0095a.y();
                                        if (i9 == 14) {
                                            y4 *= 10;
                                        }
                                    }
                                }
                            }
                        }
                        int t7 = c0095a.t();
                        int i13 = c0095a.f1463a;
                        byte[] bArr = (byte[]) c0095a.f1465c;
                        int i14 = i13 - 1;
                        int i15 = v2.t.f17153a;
                        int i16 = 0;
                        for (int i17 = c0095a.f1463a; i17 < i14; i17++) {
                            i16 = v2.t.f17165n[i16 ^ (bArr[i17] & 255)];
                        }
                        if (t7 == i16) {
                            return true;
                        }
                    }
                } catch (NumberFormatException unused) {
                }
            }
        }
        return false;
    }

    public static ArrayList h0(Throwable th) {
        ArrayList arrayList = new ArrayList(3);
        arrayList.add(th.toString());
        arrayList.add(th.getClass().getSimpleName());
        arrayList.add("Cause: " + th.getCause() + ", Stacktrace: " + Log.getStackTraceString(th));
        return arrayList;
    }

    public static ArrayList i0(Throwable th) {
        ArrayList arrayList = new ArrayList(3);
        arrayList.add(th.toString());
        arrayList.add(th.getClass().getSimpleName());
        arrayList.add("Cause: " + th.getCause() + ", Stacktrace: " + Log.getStackTraceString(th));
        return arrayList;
    }

    public static AbstractC0178k k(AbstractC0178k abstractC0178k) {
        e(abstractC0178k);
        if (abstractC0178k instanceof C0177j) {
            return abstractC0178k;
        }
        C0171d c0171d = (C0171d) abstractC0178k;
        if (Collections.unmodifiableList(c0171d.f2171a).size() == 1) {
            return k((AbstractC0178k) abstractC0178k.b().get(0));
        }
        ArrayList arrayList = new ArrayList();
        Iterator it = Collections.unmodifiableList(c0171d.f2171a).iterator();
        while (it.hasNext()) {
            arrayList.add(k((AbstractC0178k) it.next()));
        }
        AbstractC0178k b7 = b(new C0171d(c0171d.f2172b, arrayList));
        if (x(b7)) {
            return b7;
        }
        p3.f.O("field filters are already in DNF form.", b7 instanceof C0171d, new Object[0]);
        C0171d c0171d2 = (C0171d) b7;
        p3.f.O("Disjunction of filters all of which are already in DNF form is itself in DNF form.", c0171d2.e(), new Object[0]);
        ArrayList arrayList2 = c0171d2.f2171a;
        p3.f.O("Single-filter composite filters are already in DNF form.", Collections.unmodifiableList(arrayList2).size() > 1, new Object[0]);
        AbstractC0178k abstractC0178k2 = (AbstractC0178k) Collections.unmodifiableList(arrayList2).get(0);
        for (int i7 = 1; i7 < Collections.unmodifiableList(arrayList2).size(); i7++) {
            abstractC0178k2 = d(abstractC0178k2, (AbstractC0178k) Collections.unmodifiableList(arrayList2).get(i7));
        }
        return abstractC0178k2;
    }

    public static void k0(Parcel parcel, int i7, Bundle bundle, boolean z4) {
        if (bundle == null) {
            if (z4) {
                B0(parcel, i7, 0);
            }
        } else {
            int x02 = x0(i7, parcel);
            parcel.writeBundle(bundle);
            z0(x02, parcel);
        }
    }

    public static AbstractC0178k l(AbstractC0178k abstractC0178k) {
        e(abstractC0178k);
        ArrayList arrayList = new ArrayList();
        if (!(abstractC0178k instanceof C0177j)) {
            C0171d c0171d = (C0171d) abstractC0178k;
            Iterator it = Collections.unmodifiableList(c0171d.f2171a).iterator();
            while (it.hasNext()) {
                arrayList.add(l((AbstractC0178k) it.next()));
            }
            return new C0171d(c0171d.f2172b, arrayList);
        }
        if (!(abstractC0178k instanceof E4.u)) {
            return abstractC0178k;
        }
        E4.u uVar = (E4.u) abstractC0178k;
        for (I0 i02 : uVar.f2200b.G().a()) {
            arrayList.add(C0177j.e(uVar.f2201c, EnumC0176i.EQUAL, i02));
        }
        return new C0171d(2, arrayList);
    }

    public static void l0(Parcel parcel, int i7, byte[] bArr, boolean z4) {
        if (bArr == null) {
            if (z4) {
                B0(parcel, i7, 0);
            }
        } else {
            int x02 = x0(i7, parcel);
            parcel.writeByteArray(bArr);
            z0(x02, parcel);
        }
    }

    public static HashMap m(Exception exc) {
        H5.a aVar;
        HashMap hashMap = new HashMap();
        if (exc == null) {
            return hashMap;
        }
        if (exc instanceof B4.I) {
            aVar = new H5.a((B4.I) exc, exc.getCause());
        } else if (exc.getCause() == null || !(exc.getCause() instanceof B4.I)) {
            aVar = null;
        } else {
            aVar = new H5.a((B4.I) exc.getCause(), exc.getCause().getCause() != null ? exc.getCause().getCause() : exc.getCause());
        }
        if (aVar != null) {
            hashMap.put("code", aVar.f3349a);
            hashMap.put("message", aVar.f3350b);
        }
        if (hashMap.containsKey("code")) {
            String str = (String) hashMap.get("code");
            Objects.requireNonNull(str);
            if (str.equals("unknown")) {
                Log.e("FLTFirebaseFirestore", "An unknown error occurred", exc);
            }
        }
        return hashMap;
    }

    public static void m0(Parcel parcel, int i7, Double d7) {
        if (d7 == null) {
            return;
        }
        B0(parcel, i7, 8);
        parcel.writeDouble(d7.doubleValue());
    }

    public static boolean n(String str, String str2) {
        char c3;
        int length = str.length();
        if (str == str2) {
            return true;
        }
        if (length != str2.length()) {
            return false;
        }
        for (int i7 = 0; i7 < length; i7++) {
            if (str.charAt(i7) != str2.charAt(i7) && ((c3 = (char) ((r4 | ' ') - 97)) >= 26 || c3 != ((char) ((r5 | ' ') - 97)))) {
                return false;
            }
        }
        return true;
    }

    public static void n0(Parcel parcel, int i7, IBinder iBinder) {
        if (iBinder == null) {
            return;
        }
        int x02 = x0(i7, parcel);
        parcel.writeStrongBinder(iBinder);
        z0(x02, parcel);
    }

    public static String o(C0683g c0683g) {
        StringBuilder sb = new StringBuilder(c0683g.size());
        for (int i7 = 0; i7 < c0683g.size(); i7++) {
            byte l7 = c0683g.l(i7);
            if (l7 == 34) {
                sb.append("\\\"");
            } else if (l7 == 39) {
                sb.append("\\'");
            } else if (l7 != 92) {
                switch (l7) {
                    case 7:
                        sb.append("\\a");
                        break;
                    case 8:
                        sb.append("\\b");
                        break;
                    case 9:
                        sb.append("\\t");
                        break;
                    case 10:
                        sb.append("\\n");
                        break;
                    case 11:
                        sb.append("\\v");
                        break;
                    case 12:
                        sb.append("\\f");
                        break;
                    case 13:
                        sb.append("\\r");
                        break;
                    default:
                        if (l7 < 32 || l7 > 126) {
                            sb.append('\\');
                            sb.append((char) (((l7 >>> 6) & 3) + 48));
                            sb.append((char) (((l7 >>> 3) & 7) + 48));
                            sb.append((char) ((l7 & 7) + 48));
                            break;
                        } else {
                            sb.append((char) l7);
                            break;
                        }
                        break;
                }
            } else {
                sb.append("\\\\");
            }
        }
        return sb.toString();
    }

    public static void o0(Parcel parcel, int i7, int[] iArr, boolean z4) {
        if (iArr == null) {
            if (z4) {
                B0(parcel, i7, 0);
            }
        } else {
            int x02 = x0(i7, parcel);
            parcel.writeIntArray(iArr);
            z0(x02, parcel);
        }
    }

    public static HashMap p(InterfaceC1556a interfaceC1556a) {
        HashMap hashMap = new HashMap();
        hashMap.put("timestamp", Long.valueOf(interfaceC1556a.k()));
        return hashMap;
    }

    public static void p0(Parcel parcel, int i7, Integer num) {
        if (num == null) {
            return;
        }
        B0(parcel, i7, 4);
        parcel.writeInt(num.intValue());
    }

    public static Activity q(Context context) {
        if (context == null) {
            return null;
        }
        if (context instanceof Activity) {
            return (Activity) context;
        }
        if (context instanceof ContextWrapper) {
            return q(((ContextWrapper) context).getBaseContext());
        }
        return null;
    }

    public static void q0(Parcel parcel, int i7, Long l7) {
        if (l7 == null) {
            return;
        }
        B0(parcel, i7, 8);
        parcel.writeLong(l7.longValue());
    }

    public static void r0(Parcel parcel, int i7, Parcelable parcelable, int i8, boolean z4) {
        if (parcelable == null) {
            if (z4) {
                B0(parcel, i7, 0);
            }
        } else {
            int x02 = x0(i7, parcel);
            parcelable.writeToParcel(parcel, i8);
            z0(x02, parcel);
        }
    }

    public static com.google.protobuf.z0 s(I0 i02) {
        return i02.N().A("__local_write_time__").Q();
    }

    public static void s0(Parcel parcel, int i7, String str, boolean z4) {
        if (str == null) {
            if (z4) {
                B0(parcel, i7, 0);
            }
        } else {
            int x02 = x0(i7, parcel);
            parcel.writeString(str);
            z0(x02, parcel);
        }
    }

    public static I0 t(I0 i02) {
        I0 z4 = i02.N().z("__previous_value__");
        return A(z4) ? t(z4) : z4;
    }

    public static void t0(Parcel parcel, int i7, String[] strArr, boolean z4) {
        if (strArr == null) {
            if (z4) {
                B0(parcel, i7, 0);
            }
        } else {
            int x02 = x0(i7, parcel);
            parcel.writeStringArray(strArr);
            z0(x02, parcel);
        }
    }

    public static void u0(Parcel parcel, int i7, List list) {
        if (list == null) {
            return;
        }
        int x02 = x0(i7, parcel);
        parcel.writeStringList(list);
        z0(x02, parcel);
    }

    public static void v(String str, boolean z4, Object... objArr) {
        if (!z4) {
            throw new AssertionError("hardAssert failed: ".concat(String.format(str, objArr)));
        }
    }

    public static void v0(Parcel parcel, int i7, Parcelable[] parcelableArr, int i8) {
        if (parcelableArr == null) {
            return;
        }
        int x02 = x0(i7, parcel);
        parcel.writeInt(parcelableArr.length);
        for (Parcelable parcelable : parcelableArr) {
            if (parcelable == null) {
                parcel.writeInt(0);
            } else {
                int dataPosition = parcel.dataPosition();
                parcel.writeInt(1);
                int dataPosition2 = parcel.dataPosition();
                parcelable.writeToParcel(parcel, i8);
                int dataPosition3 = parcel.dataPosition();
                parcel.setDataPosition(dataPosition);
                parcel.writeInt(dataPosition3 - dataPosition2);
                parcel.setDataPosition(dataPosition3);
            }
        }
        z0(x02, parcel);
    }

    public static C0203v w() {
        return new C0203v("INVALID_CREDENTIAL", "The supplied auth credential is malformed, has expired or is not currently supported.", null);
    }

    public static void w0(Parcel parcel, int i7, List list, boolean z4) {
        if (list == null) {
            if (z4) {
                B0(parcel, i7, 0);
                return;
            }
            return;
        }
        int x02 = x0(i7, parcel);
        int size = list.size();
        parcel.writeInt(size);
        for (int i8 = 0; i8 < size; i8++) {
            Parcelable parcelable = (Parcelable) list.get(i8);
            if (parcelable == null) {
                parcel.writeInt(0);
            } else {
                int dataPosition = parcel.dataPosition();
                parcel.writeInt(1);
                int dataPosition2 = parcel.dataPosition();
                parcelable.writeToParcel(parcel, 0);
                int dataPosition3 = parcel.dataPosition();
                parcel.setDataPosition(dataPosition);
                parcel.writeInt(dataPosition3 - dataPosition2);
                parcel.setDataPosition(dataPosition3);
            }
        }
        z0(x02, parcel);
    }

    public static boolean x(AbstractC0178k abstractC0178k) {
        if (!(abstractC0178k instanceof C0177j) && !z(abstractC0178k)) {
            if (abstractC0178k instanceof C0171d) {
                C0171d c0171d = (C0171d) abstractC0178k;
                if (c0171d.f2172b == 2) {
                    for (AbstractC0178k abstractC0178k2 : Collections.unmodifiableList(c0171d.f2171a)) {
                        if ((abstractC0178k2 instanceof C0177j) || z(abstractC0178k2)) {
                        }
                    }
                }
            }
            return false;
        }
        return true;
    }

    public static int x0(int i7, Parcel parcel) {
        parcel.writeInt(i7 | (-65536));
        parcel.writeInt(0);
        return parcel.dataPosition();
    }

    public static Bundle y0(JSONObject jSONObject) {
        if (jSONObject == null) {
            return null;
        }
        Iterator<String> keys = jSONObject.keys();
        Bundle bundle = new Bundle();
        while (keys.hasNext()) {
            String next = keys.next();
            Object opt = jSONObject.opt(next);
            if (opt != null) {
                if (opt instanceof Boolean) {
                    bundle.putBoolean(next, ((Boolean) opt).booleanValue());
                } else if (opt instanceof Double) {
                    bundle.putDouble(next, ((Double) opt).doubleValue());
                } else if (opt instanceof Integer) {
                    bundle.putInt(next, ((Integer) opt).intValue());
                } else if (opt instanceof Long) {
                    bundle.putLong(next, ((Long) opt).longValue());
                } else if (opt instanceof String) {
                    bundle.putString(next, (String) opt);
                } else if (opt instanceof JSONArray) {
                    JSONArray jSONArray = (JSONArray) opt;
                    if (jSONArray.length() != 0) {
                        int length = jSONArray.length();
                        int i7 = 0;
                        Object obj = null;
                        for (int i8 = 0; obj == null && i8 < length; i8++) {
                            obj = !jSONArray.isNull(i8) ? jSONArray.opt(i8) : null;
                        }
                        if (obj == null) {
                            String valueOf = String.valueOf(next);
                            int i9 = I2.J.f3546b;
                            J2.j.g("Expected JSONArray with at least 1 non-null element for key:".concat(valueOf));
                        } else if (obj instanceof JSONObject) {
                            Bundle[] bundleArr = new Bundle[length];
                            while (i7 < length) {
                                bundleArr[i7] = !jSONArray.isNull(i7) ? y0(jSONArray.optJSONObject(i7)) : null;
                                i7++;
                            }
                            bundle.putParcelableArray(next, bundleArr);
                        } else if (obj instanceof Number) {
                            double[] dArr = new double[jSONArray.length()];
                            while (i7 < length) {
                                dArr[i7] = jSONArray.optDouble(i7);
                                i7++;
                            }
                            bundle.putDoubleArray(next, dArr);
                        } else if (obj instanceof CharSequence) {
                            String[] strArr = new String[length];
                            while (i7 < length) {
                                strArr[i7] = !jSONArray.isNull(i7) ? jSONArray.optString(i7) : null;
                                i7++;
                            }
                            bundle.putStringArray(next, strArr);
                        } else if (obj instanceof Boolean) {
                            boolean[] zArr = new boolean[length];
                            while (i7 < length) {
                                zArr[i7] = jSONArray.optBoolean(i7);
                                i7++;
                            }
                            bundle.putBooleanArray(next, zArr);
                        } else {
                            String f7 = AbstractC1663a.f("JSONArray with unsupported type ", obj.getClass().getCanonicalName(), " for key:", next);
                            int i10 = I2.J.f3546b;
                            J2.j.g(f7);
                        }
                    }
                } else if (opt instanceof JSONObject) {
                    bundle.putBundle(next, y0((JSONObject) opt));
                } else {
                    String valueOf2 = String.valueOf(next);
                    int i11 = I2.J.f3546b;
                    J2.j.g("Unsupported type for key:".concat(valueOf2));
                }
            }
        }
        return bundle;
    }

    public static boolean z(AbstractC0178k abstractC0178k) {
        if (abstractC0178k instanceof C0171d) {
            C0171d c0171d = (C0171d) abstractC0178k;
            Iterator it = c0171d.f2171a.iterator();
            while (true) {
                if (it.hasNext()) {
                    if (((AbstractC0178k) it.next()) instanceof C0171d) {
                        break;
                    }
                } else if (c0171d.e()) {
                    return true;
                }
            }
        }
        return false;
    }

    public static void z0(int i7, Parcel parcel) {
        int dataPosition = parcel.dataPosition();
        parcel.setDataPosition(i7 - 4);
        parcel.writeInt(dataPosition - i7);
        parcel.setDataPosition(dataPosition);
    }

    public abstract void F(int i7, int i8);

    public abstract void G(int i7);

    public abstract void H(View view);

    public abstract void I(int i7);

    public abstract void J(View view, int i7);

    public abstract void K(View view, float f7);

    public abstract void S(boolean z4);

    public abstract void T(boolean z4);

    public void Z() {
        if (Thread.currentThread().isInterrupted()) {
            throw new InterruptedIOException("interrupted");
        }
    }

    public abstract boolean d0(View view);

    public abstract int i(View view, int i7);

    public abstract int j(View view);

    public abstract TransformationMethod j0(TransformationMethod transformationMethod);

    public abstract InputFilter[] r(InputFilter[] inputFilterArr);

    public abstract int u(View view);

    public abstract boolean y();
}
