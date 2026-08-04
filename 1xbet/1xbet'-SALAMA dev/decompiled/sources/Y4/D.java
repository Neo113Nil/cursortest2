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
import android.webkit.DownloadListener;
import android.webkit.HttpAuthHandler;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import androidx.datastore.preferences.protobuf.C0662g;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.internal.ads.zzbbd;
import com.google.android.gms.internal.ads.zzfak;
import com.google.android.gms.tasks.TaskCompletionSource;
import com.google.firebase.auth.AuthCredential;
import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.auth.internal.zzaj;
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
import kotlin.jvm.functions.Function1;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import p010b0.C0735f;
import p010b0.C0737h;
import p010b0.C0741l;
import p098n4.C0929b;
import p098n4.C0934g;
import p146u2.C0957p;
import p146u2.C0958q;
import p155w1.V0;

/* JADX INFO: loaded from: classes2.dex */
public abstract class D {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static volatile H2.r f7689a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static volatile H2.r f7690b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static volatile H2.r f7691c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static volatile H2.r f7692d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static volatile H2.r f7693e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static U5.p0 f7694f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static U5.p0 f7695g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static U5.p0 f7696h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static p056h4.j f7697i;
    public static Executor j;

    public static boolean A(I0 i7) {
        I0 i0Z = i7 == null ? null : i7.N().z("__type__");
        return i0Z != null && "server_timestamp".equals(i0Z.P());
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
    public static p044f6.b B(s6.a aVar) {
        p044f6.c[] cVarArr = p044f6.c.f13005a;
        t6.h.e(aVar, "initializer");
        p044f6.h hVar = p044f6.h.f13013a;
        p044f6.j jVar = new p044f6.j();
        jVar.f13015a = (t6.i) aVar;
        jVar.f13016b = hVar;
        return jVar;
    }

    public static void B0(Parcel parcel, int i7, int i8) {
        parcel.writeInt(i7 | (i8 << 16));
    }

    public static p044f6.g C(s6.a aVar) {
        t6.h.e(aVar, "initializer");
        return new p044f6.g(aVar);
    }

    public static ArrayList C0(JsonReader jsonReader) throws IOException {
        ArrayList arrayList = new ArrayList();
        jsonReader.beginArray();
        while (jsonReader.hasNext()) {
            arrayList.add(jsonReader.nextString());
        }
        jsonReader.endArray();
        return arrayList;
    }

    public static List D(Object obj) {
        List listSingletonList = Collections.singletonList(obj);
        t6.h.d(listSingletonList, "singletonList(...)");
        return listSingletonList;
    }

    public static JSONArray D0(JsonReader jsonReader) throws JSONException, IOException {
        JSONArray jSONArray = new JSONArray();
        jsonReader.beginArray();
        while (jsonReader.hasNext()) {
            JsonToken jsonTokenPeek = jsonReader.peek();
            if (JsonToken.BEGIN_ARRAY.equals(jsonTokenPeek)) {
                jSONArray.put(D0(jsonReader));
            } else if (JsonToken.BEGIN_OBJECT.equals(jsonTokenPeek)) {
                jSONArray.put(F0(jsonReader));
            } else if (JsonToken.BOOLEAN.equals(jsonTokenPeek)) {
                jSONArray.put(jsonReader.nextBoolean());
            } else if (JsonToken.NUMBER.equals(jsonTokenPeek)) {
                jSONArray.put(jsonReader.nextDouble());
            } else {
                if (!JsonToken.STRING.equals(jsonTokenPeek)) {
                    throw new IllegalStateException("unexpected json token: ".concat(String.valueOf(jsonTokenPeek)));
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

    public static JSONObject E0(JSONObject jSONObject, String str) throws JSONException {
        try {
            return jSONObject.getJSONObject(str);
        } catch (JSONException unused) {
            JSONObject jSONObject2 = new JSONObject();
            jSONObject.put(str, jSONObject2);
            return jSONObject2;
        }
    }

    public static JSONObject F0(JsonReader jsonReader) throws JSONException, IOException {
        JSONObject jSONObject = new JSONObject();
        jsonReader.beginObject();
        while (jsonReader.hasNext()) {
            String strNextName = jsonReader.nextName();
            JsonToken jsonTokenPeek = jsonReader.peek();
            if (JsonToken.BEGIN_ARRAY.equals(jsonTokenPeek)) {
                jSONObject.put(strNextName, D0(jsonReader));
            } else if (JsonToken.BEGIN_OBJECT.equals(jsonTokenPeek)) {
                jSONObject.put(strNextName, F0(jsonReader));
            } else if (JsonToken.BOOLEAN.equals(jsonTokenPeek)) {
                jSONObject.put(strNextName, jsonReader.nextBoolean());
            } else if (JsonToken.NUMBER.equals(jsonTokenPeek)) {
                jSONObject.put(strNextName, jsonReader.nextDouble());
            } else {
                if (!JsonToken.STRING.equals(jsonTokenPeek)) {
                    throw new IllegalStateException("unexpected json token: ".concat(String.valueOf(jsonTokenPeek)));
                }
                jSONObject.put(strNextName, jsonReader.nextString());
            }
        }
        jsonReader.endObject();
        return jSONObject;
    }

    public static void G0(JsonWriter jsonWriter, JSONArray jSONArray) throws IOException {
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

    public static void H0(JsonWriter jsonWriter, JSONObject jSONObject) throws IOException {
        try {
            jsonWriter.beginObject();
            Iterator<String> itKeys = jSONObject.keys();
            while (itKeys.hasNext()) {
                String next = itKeys.next();
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

    public static void K0(JsonWriter jsonWriter, Object obj) throws IOException {
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
        HashMap map = new HashMap();
        if (exc instanceof p034e4.g) {
            p034e4.g gVar = (p034e4.g) exc;
            HashMap map2 = new HashMap();
            zzaj zzajVar = gVar.f12683b;
            ArrayList arrayListJ = zzajVar.j();
            String string = UUID.randomUUID().toString();
            C0195m.f2387b.put(string, zzajVar.f11920b);
            String string2 = UUID.randomUUID().toString();
            C0195m.f2388c.put(string2, zzajVar);
            ArrayList arrayList = new ArrayList();
            Iterator it = p097n3.a.I(arrayListJ).iterator();
            while (it.hasNext()) {
                arrayList.add(((E5.J) it.next()).b());
            }
            Y3.i iVar = FirebaseAuth.getInstance(Y3.i.f(zzajVar.f11921c)).f11849a;
            iVar.b();
            map2.put("appName", iVar.f7664b);
            map2.put("multiFactorHints", arrayList);
            map2.put("multiFactorSessionId", string);
            map2.put("multiFactorResolverId", string2);
            return new C0203v(gVar.f12682a, gVar.getLocalizedMessage(), map2);
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
        String str = exc instanceof p034e4.e ? ((p034e4.e) exc).f12682a : "UNKNOWN";
        if (exc instanceof p034e4.i) {
            message = ((p034e4.i) exc).f12686b;
        }
        if (exc instanceof p034e4.h) {
            p034e4.h hVar = (p034e4.h) exc;
            String str2 = hVar.f12685c;
            if (str2 != null) {
                map.put("email", str2);
            }
            AuthCredential authCredential = hVar.f12684b;
            if (authCredential != null) {
                map.put("authCredential", p097n3.a.J(authCredential));
            }
        }
        return new C0203v(str, message, map);
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

    /* JADX WARN: Code duplicated, block: B:39:0x008b  */
    public static Object O(Object obj, p003a.a aVar, HashMap map) {
        Number number;
        Object obj2;
        if (!(obj instanceof Map)) {
            return obj;
        }
        Map map2 = (Map) obj;
        if (!map2.containsKey(".sv")) {
            return obj;
        }
        Object obj3 = map2.get(".sv");
        Object objValueOf = null;
        objValueOf = null;
        objValueOf = null;
        objValueOf = null;
        objValueOf = null;
        if (obj3 instanceof String) {
            String str = (String) obj3;
            if ("timestamp".equals(str) && map.containsKey(str)) {
                obj2 = map.get(str);
            }
        } else if (obj3 instanceof Map) {
            Map map3 = (Map) obj3;
            if (map3.containsKey("increment")) {
                Object obj4 = map3.get("increment");
                if (obj4 instanceof Number) {
                    number = (Number) obj4;
                    v4.r rVarF0 = aVar.f0();
                    if (rVarF0.r() && (rVarF0.getValue() instanceof Number)) {
                        Number number2 = (Number) rVarF0.getValue();
                        if ((number instanceof Double) || (number instanceof Float) || (number2 instanceof Double) || (number2 instanceof Float)) {
                            objValueOf = number;
                            objValueOf = number;
                            objValueOf = number;
                            objValueOf = number;
                            objValueOf = number;
                            objValueOf = number;
                            objValueOf = number;
                            objValueOf = number;
                            objValueOf = number;
                            objValueOf = number;
                            objValueOf = Double.valueOf(number2.doubleValue() + number.doubleValue());
                        } else {
                            long jLongValue = number.longValue();
                            long jLongValue2 = number2.longValue();
                            long j3 = jLongValue + jLongValue2;
                            if (((jLongValue ^ j3) & (jLongValue2 ^ j3)) >= 0) {
                                objValueOf = number;
                                objValueOf = number;
                                objValueOf = Long.valueOf(j3);
                            } else {
                                objValueOf = number;
                                objValueOf = number;
                                objValueOf = number;
                                objValueOf = number;
                                objValueOf = number;
                                objValueOf = number;
                                objValueOf = number;
                                objValueOf = number;
                                objValueOf = number;
                                objValueOf = number;
                                objValueOf = Double.valueOf(number2.doubleValue() + number.doubleValue());
                            }
                        }
                    }
                }
            }
        }
        if (objValueOf == null) {
            objValueOf = obj2;
            return obj;
        }
        objValueOf = obj2;
        return objValueOf;
    }

    public static C0929b P(C0929b c0929b, p098n4.D d7, C0934g c0934g, HashMap map) {
        C0929b c0929bL = C0929b.f15397b;
        for (Map.Entry entry : c0929b.f15398a) {
            c0929bL = c0929bL.l((C0934g) entry.getKey(), Q((v4.r) entry.getValue(), new p098n4.K(d7, c0934g.m((C0934g) entry.getKey())), map));
        }
        return c0929bL;
    }

    public static v4.r Q(v4.r rVar, p003a.a aVar, HashMap map) {
        Object value = rVar.e().getValue();
        Object objO = O(value, aVar.Y(v4.c.b(".priority")), map);
        boolean zEquals = false;
        if (!rVar.r()) {
            if (rVar.isEmpty()) {
                return rVar;
            }
            v4.f fVar = (v4.f) rVar;
            p096n1.e eVar = new p096n1.e(fVar, 18);
            fVar.m(new p098n4.p(aVar, map, eVar), false);
            return !((v4.r) eVar.f15314b).e().equals(objO) ? ((v4.r) eVar.f15314b).v(p115p6.c.k(null, objO)) : (v4.r) eVar.f15314b;
        }
        Object objO2 = O(rVar.getValue(), aVar, map);
        if (objO2.equals(rVar.getValue())) {
            if (objO == value) {
                zEquals = true;
            } else if (objO != null && value != null) {
                zEquals = objO.equals(value);
            }
            if (zEquals) {
                return rVar;
            }
        }
        return p115p6.a.a(objO2, p115p6.c.k(null, objO));
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
        p044f6.g gVar = C0409e.f6156b;
        Object obj = null;
        p155w1.F0 f7 = new p155w1.F0(fVar, "dev.flutter.pigeon.webview_flutter_android.PigeonInternalInstanceManager.removeStrongReference", (A5.n) gVar.getValue(), obj, 1);
        if (c0407c != null) {
            final int i7 = 0;
            f7.M(new A5.b() { // from class: R5.d
                @Override // A5.b
                public final void i(Object obj2, V0 v6) {
                    List listW0;
                    List listW1;
                    switch (i7) {
                        case 0:
                            C0407c c0407c2 = c0407c;
                            t6.h.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj3 = ((List) obj2).get(0);
                            t6.h.c(obj3, "null cannot be cast to non-null type kotlin.Long");
                            Long l7 = (Long) obj3;
                            long jLongValue = l7.longValue();
                            try {
                                c0407c2.f();
                                Object objE = c0407c2.e(jLongValue);
                                if (objE instanceof i0) {
                                    ((i0) objE).destroy();
                                }
                                c0407c2.f6138d.remove(l7);
                                listW0 = Y4.D.D(null);
                            } catch (Throwable th) {
                                listW0 = p003a.a.w0(th);
                            }
                            v6.f(listW0);
                            break;
                        default:
                            C0407c c0407c3 = c0407c;
                            try {
                                c0407c3.f6136b.clear();
                                c0407c3.f6137c.clear();
                                c0407c3.f6138d.clear();
                                c0407c3.f6140f.clear();
                                listW1 = Y4.D.D(null);
                            } catch (Throwable th2) {
                                listW1 = p003a.a.w0(th2);
                            }
                            v6.f(listW1);
                            break;
                    }
                }
            });
        } else {
            f7.M(null);
        }
        p155w1.F0 f8 = new p155w1.F0(fVar, "dev.flutter.pigeon.webview_flutter_android.PigeonInternalInstanceManager.clear", (A5.n) gVar.getValue(), obj, 1);
        if (c0407c == null) {
            f8.M(null);
        } else {
            final int i8 = 1;
            f8.M(new A5.b() { // from class: R5.d
                @Override // A5.b
                public final void i(Object obj2, V0 v6) {
                    List listW0;
                    List listW1;
                    switch (i8) {
                        case 0:
                            C0407c c0407c2 = c0407c;
                            t6.h.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj3 = ((List) obj2).get(0);
                            t6.h.c(obj3, "null cannot be cast to non-null type kotlin.Long");
                            Long l7 = (Long) obj3;
                            long jLongValue = l7.longValue();
                            try {
                                c0407c2.f();
                                Object objE = c0407c2.e(jLongValue);
                                if (objE instanceof i0) {
                                    ((i0) objE).destroy();
                                }
                                c0407c2.f6138d.remove(l7);
                                listW0 = Y4.D.D(null);
                            } catch (Throwable th) {
                                listW0 = p003a.a.w0(th);
                            }
                            v6.f(listW0);
                            break;
                        default:
                            C0407c c0407c3 = c0407c;
                            try {
                                c0407c3.f6136b.clear();
                                c0407c3.f6137c.clear();
                                c0407c3.f6138d.clear();
                                c0407c3.f6140f.clear();
                                listW1 = Y4.D.D(null);
                            } catch (Throwable th2) {
                                listW1 = p003a.a.w0(th2);
                            }
                            v6.f(listW1);
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
        p155w1.F0 f7 = new p155w1.F0(fVar, "dev.flutter.pigeon.webview_flutter_android.WebView.pigeon_defaultConstructor", c0406b, obj, 1);
        if (c0413i != null) {
            final int i7 = 0;
            f7.M(new A5.b() { // from class: R5.N
                @Override // A5.b
                public final void i(Object obj2, V0 v6) {
                    List listW0;
                    List listW1;
                    List listW2;
                    List listW3;
                    List listW4;
                    List listW5;
                    List listW6;
                    List listW7;
                    List listW8;
                    List listW9;
                    List listW10;
                    List listW11;
                    List listW12;
                    List listW13;
                    List listW14;
                    List listW15;
                    List listW16;
                    List listW17;
                    List listW18;
                    List listW19;
                    List listW20;
                    List listW21;
                    switch (i7) {
                        case 0:
                            C0413i c0413i2 = c0413i;
                            t6.h.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj3 = ((List) obj2).get(0);
                            t6.h.c(obj3, "null cannot be cast to non-null type kotlin.Long");
                            try {
                                ((C0407c) c0413i2.f6174a.f3679c).a(((Long) obj3).longValue(), c0413i2.a());
                                listW0 = Y4.D.D(null);
                            } catch (Throwable th) {
                                listW0 = p003a.a.w0(th);
                            }
                            v6.f(listW0);
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
                                listW1 = Y4.D.D(null);
                            } catch (Throwable th2) {
                                listW1 = p003a.a.w0(th2);
                            }
                            v6.f(listW1);
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
                                listW2 = Y4.D.D(null);
                            } catch (Throwable th3) {
                                listW2 = p003a.a.w0(th3);
                            }
                            v6.f(listW2);
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
                                listW3 = Y4.D.D(null);
                            } catch (Throwable th4) {
                                listW3 = p003a.a.w0(th4);
                            }
                            v6.f(listW3);
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
                            long jLongValue = ((Long) obj9).longValue();
                            try {
                                c0413i6.getClass();
                                webView4.setBackgroundColor((int) jLongValue);
                                listW4 = Y4.D.D(null);
                            } catch (Throwable th5) {
                                listW4 = p003a.a.w0(th5);
                            }
                            v6.f(listW4);
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
                                listW5 = Y4.D.D(null);
                            } catch (Throwable th6) {
                                listW5 = p003a.a.w0(th6);
                            }
                            v6.f(listW5);
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
                                listW6 = Y4.D.D(null);
                            } catch (Throwable th7) {
                                listW6 = p003a.a.w0(th7);
                            }
                            v6.f(listW6);
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
                                listW7 = Y4.D.D(null);
                            } catch (Throwable th8) {
                                listW7 = p003a.a.w0(th8);
                            }
                            v6.f(listW7);
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
                                listW8 = Y4.D.D(null);
                            } catch (Throwable th9) {
                                listW8 = p003a.a.w0(th9);
                            }
                            v6.f(listW8);
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
                                listW9 = Y4.D.D(null);
                            } catch (Throwable th10) {
                                listW9 = p003a.a.w0(th10);
                            }
                            v6.f(listW9);
                            break;
                        case 10:
                            C0413i c0413i12 = c0413i;
                            t6.h.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj21 = ((List) obj2).get(0);
                            t6.h.c(obj21, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView10 = (WebView) obj21;
                            try {
                                c0413i12.getClass();
                                listW10 = Y4.D.D(webView10.getUrl());
                            } catch (Throwable th11) {
                                listW10 = p003a.a.w0(th11);
                            }
                            v6.f(listW10);
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
                                listW11 = Y4.D.D(null);
                            } catch (Throwable th12) {
                                listW11 = p003a.a.w0(th12);
                            }
                            v6.f(listW11);
                            break;
                        case 12:
                            C0413i c0413i14 = c0413i;
                            t6.h.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj23 = ((List) obj2).get(0);
                            t6.h.c(obj23, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView12 = (WebView) obj23;
                            try {
                                c0413i14.getClass();
                                listW12 = Y4.D.D(Boolean.valueOf(webView12.canGoBack()));
                            } catch (Throwable th13) {
                                listW12 = p003a.a.w0(th13);
                            }
                            v6.f(listW12);
                            break;
                        case 13:
                            C0413i c0413i15 = c0413i;
                            t6.h.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj24 = ((List) obj2).get(0);
                            t6.h.c(obj24, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView13 = (WebView) obj24;
                            try {
                                c0413i15.getClass();
                                listW13 = Y4.D.D(Boolean.valueOf(webView13.canGoForward()));
                            } catch (Throwable th14) {
                                listW13 = p003a.a.w0(th14);
                            }
                            v6.f(listW13);
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
                                listW14 = Y4.D.D(null);
                            } catch (Throwable th15) {
                                listW14 = p003a.a.w0(th15);
                            }
                            v6.f(listW14);
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
                                listW15 = Y4.D.D(null);
                            } catch (Throwable th16) {
                                listW15 = p003a.a.w0(th16);
                            }
                            v6.f(listW15);
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
                            boolean zBooleanValue = ((Boolean) obj28).booleanValue();
                            try {
                                c0413i18.getClass();
                                webView16.clearCache(zBooleanValue);
                                listW16 = Y4.D.D(null);
                            } catch (Throwable th17) {
                                listW16 = p003a.a.w0(th17);
                            }
                            v6.f(listW16);
                            break;
                        case 17:
                            t6.h.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list10 = (List) obj2;
                            Object obj29 = list10.get(0);
                            t6.h.c(obj29, "null cannot be cast to non-null type android.webkit.WebView");
                            Object obj30 = list10.get(1);
                            t6.h.c(obj30, "null cannot be cast to non-null type kotlin.String");
                            B b7 = new B(v6, 1);
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
                                listW17 = Y4.D.D(webView17.getTitle());
                            } catch (Throwable th18) {
                                listW17 = p003a.a.w0(th18);
                            }
                            v6.f(listW17);
                            break;
                        case 19:
                            C0413i c0413i20 = c0413i;
                            t6.h.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj32 = ((List) obj2).get(0);
                            t6.h.c(obj32, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean zBooleanValue2 = ((Boolean) obj32).booleanValue();
                            try {
                                c0413i20.getClass();
                                WebView.setWebContentsDebuggingEnabled(zBooleanValue2);
                                listW18 = Y4.D.D(null);
                            } catch (Throwable th19) {
                                listW18 = p003a.a.w0(th19);
                            }
                            v6.f(listW18);
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
                                listW19 = Y4.D.D(null);
                            } catch (Throwable th20) {
                                listW19 = p003a.a.w0(th20);
                            }
                            v6.f(listW19);
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
                                listW20 = Y4.D.D(null);
                            } catch (Throwable th21) {
                                listW20 = p003a.a.w0(th21);
                            }
                            v6.f(listW20);
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
                                listW21 = Y4.D.D(null);
                            } catch (Throwable th22) {
                                listW21 = p003a.a.w0(th22);
                            }
                            v6.f(listW21);
                            break;
                    }
                }
            });
        } else {
            f7.M(null);
        }
        p155w1.F0 f8 = new p155w1.F0(fVar, "dev.flutter.pigeon.webview_flutter_android.WebView.settings", c0406b, obj, 1);
        if (c0413i != null) {
            final int i8 = 2;
            f8.M(new A5.b() { // from class: R5.N
                @Override // A5.b
                public final void i(Object obj2, V0 v6) {
                    List listW0;
                    List listW1;
                    List listW2;
                    List listW3;
                    List listW4;
                    List listW5;
                    List listW6;
                    List listW7;
                    List listW8;
                    List listW9;
                    List listW10;
                    List listW11;
                    List listW12;
                    List listW13;
                    List listW14;
                    List listW15;
                    List listW16;
                    List listW17;
                    List listW18;
                    List listW19;
                    List listW20;
                    List listW21;
                    switch (i8) {
                        case 0:
                            C0413i c0413i2 = c0413i;
                            t6.h.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj3 = ((List) obj2).get(0);
                            t6.h.c(obj3, "null cannot be cast to non-null type kotlin.Long");
                            try {
                                ((C0407c) c0413i2.f6174a.f3679c).a(((Long) obj3).longValue(), c0413i2.a());
                                listW0 = Y4.D.D(null);
                            } catch (Throwable th) {
                                listW0 = p003a.a.w0(th);
                            }
                            v6.f(listW0);
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
                                listW1 = Y4.D.D(null);
                            } catch (Throwable th2) {
                                listW1 = p003a.a.w0(th2);
                            }
                            v6.f(listW1);
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
                                listW2 = Y4.D.D(null);
                            } catch (Throwable th3) {
                                listW2 = p003a.a.w0(th3);
                            }
                            v6.f(listW2);
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
                                listW3 = Y4.D.D(null);
                            } catch (Throwable th4) {
                                listW3 = p003a.a.w0(th4);
                            }
                            v6.f(listW3);
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
                            long jLongValue = ((Long) obj9).longValue();
                            try {
                                c0413i6.getClass();
                                webView4.setBackgroundColor((int) jLongValue);
                                listW4 = Y4.D.D(null);
                            } catch (Throwable th5) {
                                listW4 = p003a.a.w0(th5);
                            }
                            v6.f(listW4);
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
                                listW5 = Y4.D.D(null);
                            } catch (Throwable th6) {
                                listW5 = p003a.a.w0(th6);
                            }
                            v6.f(listW5);
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
                                listW6 = Y4.D.D(null);
                            } catch (Throwable th7) {
                                listW6 = p003a.a.w0(th7);
                            }
                            v6.f(listW6);
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
                                listW7 = Y4.D.D(null);
                            } catch (Throwable th8) {
                                listW7 = p003a.a.w0(th8);
                            }
                            v6.f(listW7);
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
                                listW8 = Y4.D.D(null);
                            } catch (Throwable th9) {
                                listW8 = p003a.a.w0(th9);
                            }
                            v6.f(listW8);
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
                                listW9 = Y4.D.D(null);
                            } catch (Throwable th10) {
                                listW9 = p003a.a.w0(th10);
                            }
                            v6.f(listW9);
                            break;
                        case 10:
                            C0413i c0413i12 = c0413i;
                            t6.h.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj21 = ((List) obj2).get(0);
                            t6.h.c(obj21, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView10 = (WebView) obj21;
                            try {
                                c0413i12.getClass();
                                listW10 = Y4.D.D(webView10.getUrl());
                            } catch (Throwable th11) {
                                listW10 = p003a.a.w0(th11);
                            }
                            v6.f(listW10);
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
                                listW11 = Y4.D.D(null);
                            } catch (Throwable th12) {
                                listW11 = p003a.a.w0(th12);
                            }
                            v6.f(listW11);
                            break;
                        case 12:
                            C0413i c0413i14 = c0413i;
                            t6.h.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj23 = ((List) obj2).get(0);
                            t6.h.c(obj23, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView12 = (WebView) obj23;
                            try {
                                c0413i14.getClass();
                                listW12 = Y4.D.D(Boolean.valueOf(webView12.canGoBack()));
                            } catch (Throwable th13) {
                                listW12 = p003a.a.w0(th13);
                            }
                            v6.f(listW12);
                            break;
                        case 13:
                            C0413i c0413i15 = c0413i;
                            t6.h.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj24 = ((List) obj2).get(0);
                            t6.h.c(obj24, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView13 = (WebView) obj24;
                            try {
                                c0413i15.getClass();
                                listW13 = Y4.D.D(Boolean.valueOf(webView13.canGoForward()));
                            } catch (Throwable th14) {
                                listW13 = p003a.a.w0(th14);
                            }
                            v6.f(listW13);
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
                                listW14 = Y4.D.D(null);
                            } catch (Throwable th15) {
                                listW14 = p003a.a.w0(th15);
                            }
                            v6.f(listW14);
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
                                listW15 = Y4.D.D(null);
                            } catch (Throwable th16) {
                                listW15 = p003a.a.w0(th16);
                            }
                            v6.f(listW15);
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
                            boolean zBooleanValue = ((Boolean) obj28).booleanValue();
                            try {
                                c0413i18.getClass();
                                webView16.clearCache(zBooleanValue);
                                listW16 = Y4.D.D(null);
                            } catch (Throwable th17) {
                                listW16 = p003a.a.w0(th17);
                            }
                            v6.f(listW16);
                            break;
                        case 17:
                            t6.h.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list10 = (List) obj2;
                            Object obj29 = list10.get(0);
                            t6.h.c(obj29, "null cannot be cast to non-null type android.webkit.WebView");
                            Object obj30 = list10.get(1);
                            t6.h.c(obj30, "null cannot be cast to non-null type kotlin.String");
                            B b7 = new B(v6, 1);
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
                                listW17 = Y4.D.D(webView17.getTitle());
                            } catch (Throwable th18) {
                                listW17 = p003a.a.w0(th18);
                            }
                            v6.f(listW17);
                            break;
                        case 19:
                            C0413i c0413i20 = c0413i;
                            t6.h.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj32 = ((List) obj2).get(0);
                            t6.h.c(obj32, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean zBooleanValue2 = ((Boolean) obj32).booleanValue();
                            try {
                                c0413i20.getClass();
                                WebView.setWebContentsDebuggingEnabled(zBooleanValue2);
                                listW18 = Y4.D.D(null);
                            } catch (Throwable th19) {
                                listW18 = p003a.a.w0(th19);
                            }
                            v6.f(listW18);
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
                                listW19 = Y4.D.D(null);
                            } catch (Throwable th20) {
                                listW19 = p003a.a.w0(th20);
                            }
                            v6.f(listW19);
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
                                listW20 = Y4.D.D(null);
                            } catch (Throwable th21) {
                                listW20 = p003a.a.w0(th21);
                            }
                            v6.f(listW20);
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
                                listW21 = Y4.D.D(null);
                            } catch (Throwable th22) {
                                listW21 = p003a.a.w0(th22);
                            }
                            v6.f(listW21);
                            break;
                    }
                }
            });
        } else {
            f8.M(null);
        }
        p155w1.F0 f9 = new p155w1.F0(fVar, "dev.flutter.pigeon.webview_flutter_android.WebView.loadData", c0406b, obj, 1);
        if (c0413i != null) {
            final int i9 = 6;
            f9.M(new A5.b() { // from class: R5.N
                @Override // A5.b
                public final void i(Object obj2, V0 v6) {
                    List listW0;
                    List listW1;
                    List listW2;
                    List listW3;
                    List listW4;
                    List listW5;
                    List listW6;
                    List listW7;
                    List listW8;
                    List listW9;
                    List listW10;
                    List listW11;
                    List listW12;
                    List listW13;
                    List listW14;
                    List listW15;
                    List listW16;
                    List listW17;
                    List listW18;
                    List listW19;
                    List listW20;
                    List listW21;
                    switch (i9) {
                        case 0:
                            C0413i c0413i2 = c0413i;
                            t6.h.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj3 = ((List) obj2).get(0);
                            t6.h.c(obj3, "null cannot be cast to non-null type kotlin.Long");
                            try {
                                ((C0407c) c0413i2.f6174a.f3679c).a(((Long) obj3).longValue(), c0413i2.a());
                                listW0 = Y4.D.D(null);
                            } catch (Throwable th) {
                                listW0 = p003a.a.w0(th);
                            }
                            v6.f(listW0);
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
                                listW1 = Y4.D.D(null);
                            } catch (Throwable th2) {
                                listW1 = p003a.a.w0(th2);
                            }
                            v6.f(listW1);
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
                                listW2 = Y4.D.D(null);
                            } catch (Throwable th3) {
                                listW2 = p003a.a.w0(th3);
                            }
                            v6.f(listW2);
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
                                listW3 = Y4.D.D(null);
                            } catch (Throwable th4) {
                                listW3 = p003a.a.w0(th4);
                            }
                            v6.f(listW3);
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
                            long jLongValue = ((Long) obj9).longValue();
                            try {
                                c0413i6.getClass();
                                webView4.setBackgroundColor((int) jLongValue);
                                listW4 = Y4.D.D(null);
                            } catch (Throwable th5) {
                                listW4 = p003a.a.w0(th5);
                            }
                            v6.f(listW4);
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
                                listW5 = Y4.D.D(null);
                            } catch (Throwable th6) {
                                listW5 = p003a.a.w0(th6);
                            }
                            v6.f(listW5);
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
                                listW6 = Y4.D.D(null);
                            } catch (Throwable th7) {
                                listW6 = p003a.a.w0(th7);
                            }
                            v6.f(listW6);
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
                                listW7 = Y4.D.D(null);
                            } catch (Throwable th8) {
                                listW7 = p003a.a.w0(th8);
                            }
                            v6.f(listW7);
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
                                listW8 = Y4.D.D(null);
                            } catch (Throwable th9) {
                                listW8 = p003a.a.w0(th9);
                            }
                            v6.f(listW8);
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
                                listW9 = Y4.D.D(null);
                            } catch (Throwable th10) {
                                listW9 = p003a.a.w0(th10);
                            }
                            v6.f(listW9);
                            break;
                        case 10:
                            C0413i c0413i12 = c0413i;
                            t6.h.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj21 = ((List) obj2).get(0);
                            t6.h.c(obj21, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView10 = (WebView) obj21;
                            try {
                                c0413i12.getClass();
                                listW10 = Y4.D.D(webView10.getUrl());
                            } catch (Throwable th11) {
                                listW10 = p003a.a.w0(th11);
                            }
                            v6.f(listW10);
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
                                listW11 = Y4.D.D(null);
                            } catch (Throwable th12) {
                                listW11 = p003a.a.w0(th12);
                            }
                            v6.f(listW11);
                            break;
                        case 12:
                            C0413i c0413i14 = c0413i;
                            t6.h.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj23 = ((List) obj2).get(0);
                            t6.h.c(obj23, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView12 = (WebView) obj23;
                            try {
                                c0413i14.getClass();
                                listW12 = Y4.D.D(Boolean.valueOf(webView12.canGoBack()));
                            } catch (Throwable th13) {
                                listW12 = p003a.a.w0(th13);
                            }
                            v6.f(listW12);
                            break;
                        case 13:
                            C0413i c0413i15 = c0413i;
                            t6.h.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj24 = ((List) obj2).get(0);
                            t6.h.c(obj24, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView13 = (WebView) obj24;
                            try {
                                c0413i15.getClass();
                                listW13 = Y4.D.D(Boolean.valueOf(webView13.canGoForward()));
                            } catch (Throwable th14) {
                                listW13 = p003a.a.w0(th14);
                            }
                            v6.f(listW13);
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
                                listW14 = Y4.D.D(null);
                            } catch (Throwable th15) {
                                listW14 = p003a.a.w0(th15);
                            }
                            v6.f(listW14);
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
                                listW15 = Y4.D.D(null);
                            } catch (Throwable th16) {
                                listW15 = p003a.a.w0(th16);
                            }
                            v6.f(listW15);
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
                            boolean zBooleanValue = ((Boolean) obj28).booleanValue();
                            try {
                                c0413i18.getClass();
                                webView16.clearCache(zBooleanValue);
                                listW16 = Y4.D.D(null);
                            } catch (Throwable th17) {
                                listW16 = p003a.a.w0(th17);
                            }
                            v6.f(listW16);
                            break;
                        case 17:
                            t6.h.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list10 = (List) obj2;
                            Object obj29 = list10.get(0);
                            t6.h.c(obj29, "null cannot be cast to non-null type android.webkit.WebView");
                            Object obj30 = list10.get(1);
                            t6.h.c(obj30, "null cannot be cast to non-null type kotlin.String");
                            B b7 = new B(v6, 1);
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
                                listW17 = Y4.D.D(webView17.getTitle());
                            } catch (Throwable th18) {
                                listW17 = p003a.a.w0(th18);
                            }
                            v6.f(listW17);
                            break;
                        case 19:
                            C0413i c0413i20 = c0413i;
                            t6.h.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj32 = ((List) obj2).get(0);
                            t6.h.c(obj32, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean zBooleanValue2 = ((Boolean) obj32).booleanValue();
                            try {
                                c0413i20.getClass();
                                WebView.setWebContentsDebuggingEnabled(zBooleanValue2);
                                listW18 = Y4.D.D(null);
                            } catch (Throwable th19) {
                                listW18 = p003a.a.w0(th19);
                            }
                            v6.f(listW18);
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
                                listW19 = Y4.D.D(null);
                            } catch (Throwable th20) {
                                listW19 = p003a.a.w0(th20);
                            }
                            v6.f(listW19);
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
                                listW20 = Y4.D.D(null);
                            } catch (Throwable th21) {
                                listW20 = p003a.a.w0(th21);
                            }
                            v6.f(listW20);
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
                                listW21 = Y4.D.D(null);
                            } catch (Throwable th22) {
                                listW21 = p003a.a.w0(th22);
                            }
                            v6.f(listW21);
                            break;
                    }
                }
            });
        } else {
            f9.M(null);
        }
        p155w1.F0 f10 = new p155w1.F0(fVar, "dev.flutter.pigeon.webview_flutter_android.WebView.loadDataWithBaseUrl", c0406b, obj, 1);
        if (c0413i != null) {
            final int i10 = 7;
            f10.M(new A5.b() { // from class: R5.N
                @Override // A5.b
                public final void i(Object obj2, V0 v6) {
                    List listW0;
                    List listW1;
                    List listW2;
                    List listW3;
                    List listW4;
                    List listW5;
                    List listW6;
                    List listW7;
                    List listW8;
                    List listW9;
                    List listW10;
                    List listW11;
                    List listW12;
                    List listW13;
                    List listW14;
                    List listW15;
                    List listW16;
                    List listW17;
                    List listW18;
                    List listW19;
                    List listW20;
                    List listW21;
                    switch (i10) {
                        case 0:
                            C0413i c0413i2 = c0413i;
                            t6.h.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj3 = ((List) obj2).get(0);
                            t6.h.c(obj3, "null cannot be cast to non-null type kotlin.Long");
                            try {
                                ((C0407c) c0413i2.f6174a.f3679c).a(((Long) obj3).longValue(), c0413i2.a());
                                listW0 = Y4.D.D(null);
                            } catch (Throwable th) {
                                listW0 = p003a.a.w0(th);
                            }
                            v6.f(listW0);
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
                                listW1 = Y4.D.D(null);
                            } catch (Throwable th2) {
                                listW1 = p003a.a.w0(th2);
                            }
                            v6.f(listW1);
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
                                listW2 = Y4.D.D(null);
                            } catch (Throwable th3) {
                                listW2 = p003a.a.w0(th3);
                            }
                            v6.f(listW2);
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
                                listW3 = Y4.D.D(null);
                            } catch (Throwable th4) {
                                listW3 = p003a.a.w0(th4);
                            }
                            v6.f(listW3);
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
                            long jLongValue = ((Long) obj9).longValue();
                            try {
                                c0413i6.getClass();
                                webView4.setBackgroundColor((int) jLongValue);
                                listW4 = Y4.D.D(null);
                            } catch (Throwable th5) {
                                listW4 = p003a.a.w0(th5);
                            }
                            v6.f(listW4);
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
                                listW5 = Y4.D.D(null);
                            } catch (Throwable th6) {
                                listW5 = p003a.a.w0(th6);
                            }
                            v6.f(listW5);
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
                                listW6 = Y4.D.D(null);
                            } catch (Throwable th7) {
                                listW6 = p003a.a.w0(th7);
                            }
                            v6.f(listW6);
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
                                listW7 = Y4.D.D(null);
                            } catch (Throwable th8) {
                                listW7 = p003a.a.w0(th8);
                            }
                            v6.f(listW7);
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
                                listW8 = Y4.D.D(null);
                            } catch (Throwable th9) {
                                listW8 = p003a.a.w0(th9);
                            }
                            v6.f(listW8);
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
                                listW9 = Y4.D.D(null);
                            } catch (Throwable th10) {
                                listW9 = p003a.a.w0(th10);
                            }
                            v6.f(listW9);
                            break;
                        case 10:
                            C0413i c0413i12 = c0413i;
                            t6.h.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj21 = ((List) obj2).get(0);
                            t6.h.c(obj21, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView10 = (WebView) obj21;
                            try {
                                c0413i12.getClass();
                                listW10 = Y4.D.D(webView10.getUrl());
                            } catch (Throwable th11) {
                                listW10 = p003a.a.w0(th11);
                            }
                            v6.f(listW10);
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
                                listW11 = Y4.D.D(null);
                            } catch (Throwable th12) {
                                listW11 = p003a.a.w0(th12);
                            }
                            v6.f(listW11);
                            break;
                        case 12:
                            C0413i c0413i14 = c0413i;
                            t6.h.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj23 = ((List) obj2).get(0);
                            t6.h.c(obj23, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView12 = (WebView) obj23;
                            try {
                                c0413i14.getClass();
                                listW12 = Y4.D.D(Boolean.valueOf(webView12.canGoBack()));
                            } catch (Throwable th13) {
                                listW12 = p003a.a.w0(th13);
                            }
                            v6.f(listW12);
                            break;
                        case 13:
                            C0413i c0413i15 = c0413i;
                            t6.h.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj24 = ((List) obj2).get(0);
                            t6.h.c(obj24, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView13 = (WebView) obj24;
                            try {
                                c0413i15.getClass();
                                listW13 = Y4.D.D(Boolean.valueOf(webView13.canGoForward()));
                            } catch (Throwable th14) {
                                listW13 = p003a.a.w0(th14);
                            }
                            v6.f(listW13);
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
                                listW14 = Y4.D.D(null);
                            } catch (Throwable th15) {
                                listW14 = p003a.a.w0(th15);
                            }
                            v6.f(listW14);
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
                                listW15 = Y4.D.D(null);
                            } catch (Throwable th16) {
                                listW15 = p003a.a.w0(th16);
                            }
                            v6.f(listW15);
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
                            boolean zBooleanValue = ((Boolean) obj28).booleanValue();
                            try {
                                c0413i18.getClass();
                                webView16.clearCache(zBooleanValue);
                                listW16 = Y4.D.D(null);
                            } catch (Throwable th17) {
                                listW16 = p003a.a.w0(th17);
                            }
                            v6.f(listW16);
                            break;
                        case 17:
                            t6.h.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list10 = (List) obj2;
                            Object obj29 = list10.get(0);
                            t6.h.c(obj29, "null cannot be cast to non-null type android.webkit.WebView");
                            Object obj30 = list10.get(1);
                            t6.h.c(obj30, "null cannot be cast to non-null type kotlin.String");
                            B b7 = new B(v6, 1);
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
                                listW17 = Y4.D.D(webView17.getTitle());
                            } catch (Throwable th18) {
                                listW17 = p003a.a.w0(th18);
                            }
                            v6.f(listW17);
                            break;
                        case 19:
                            C0413i c0413i20 = c0413i;
                            t6.h.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj32 = ((List) obj2).get(0);
                            t6.h.c(obj32, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean zBooleanValue2 = ((Boolean) obj32).booleanValue();
                            try {
                                c0413i20.getClass();
                                WebView.setWebContentsDebuggingEnabled(zBooleanValue2);
                                listW18 = Y4.D.D(null);
                            } catch (Throwable th19) {
                                listW18 = p003a.a.w0(th19);
                            }
                            v6.f(listW18);
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
                                listW19 = Y4.D.D(null);
                            } catch (Throwable th20) {
                                listW19 = p003a.a.w0(th20);
                            }
                            v6.f(listW19);
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
                                listW20 = Y4.D.D(null);
                            } catch (Throwable th21) {
                                listW20 = p003a.a.w0(th21);
                            }
                            v6.f(listW20);
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
                                listW21 = Y4.D.D(null);
                            } catch (Throwable th22) {
                                listW21 = p003a.a.w0(th22);
                            }
                            v6.f(listW21);
                            break;
                    }
                }
            });
        } else {
            f10.M(null);
        }
        p155w1.F0 f11 = new p155w1.F0(fVar, "dev.flutter.pigeon.webview_flutter_android.WebView.loadUrl", c0406b, obj, 1);
        if (c0413i != null) {
            final int i11 = 8;
            f11.M(new A5.b() { // from class: R5.N
                @Override // A5.b
                public final void i(Object obj2, V0 v6) {
                    List listW0;
                    List listW1;
                    List listW2;
                    List listW3;
                    List listW4;
                    List listW5;
                    List listW6;
                    List listW7;
                    List listW8;
                    List listW9;
                    List listW10;
                    List listW11;
                    List listW12;
                    List listW13;
                    List listW14;
                    List listW15;
                    List listW16;
                    List listW17;
                    List listW18;
                    List listW19;
                    List listW20;
                    List listW21;
                    switch (i11) {
                        case 0:
                            C0413i c0413i2 = c0413i;
                            t6.h.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj3 = ((List) obj2).get(0);
                            t6.h.c(obj3, "null cannot be cast to non-null type kotlin.Long");
                            try {
                                ((C0407c) c0413i2.f6174a.f3679c).a(((Long) obj3).longValue(), c0413i2.a());
                                listW0 = Y4.D.D(null);
                            } catch (Throwable th) {
                                listW0 = p003a.a.w0(th);
                            }
                            v6.f(listW0);
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
                                listW1 = Y4.D.D(null);
                            } catch (Throwable th2) {
                                listW1 = p003a.a.w0(th2);
                            }
                            v6.f(listW1);
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
                                listW2 = Y4.D.D(null);
                            } catch (Throwable th3) {
                                listW2 = p003a.a.w0(th3);
                            }
                            v6.f(listW2);
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
                                listW3 = Y4.D.D(null);
                            } catch (Throwable th4) {
                                listW3 = p003a.a.w0(th4);
                            }
                            v6.f(listW3);
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
                            long jLongValue = ((Long) obj9).longValue();
                            try {
                                c0413i6.getClass();
                                webView4.setBackgroundColor((int) jLongValue);
                                listW4 = Y4.D.D(null);
                            } catch (Throwable th5) {
                                listW4 = p003a.a.w0(th5);
                            }
                            v6.f(listW4);
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
                                listW5 = Y4.D.D(null);
                            } catch (Throwable th6) {
                                listW5 = p003a.a.w0(th6);
                            }
                            v6.f(listW5);
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
                                listW6 = Y4.D.D(null);
                            } catch (Throwable th7) {
                                listW6 = p003a.a.w0(th7);
                            }
                            v6.f(listW6);
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
                                listW7 = Y4.D.D(null);
                            } catch (Throwable th8) {
                                listW7 = p003a.a.w0(th8);
                            }
                            v6.f(listW7);
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
                                listW8 = Y4.D.D(null);
                            } catch (Throwable th9) {
                                listW8 = p003a.a.w0(th9);
                            }
                            v6.f(listW8);
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
                                listW9 = Y4.D.D(null);
                            } catch (Throwable th10) {
                                listW9 = p003a.a.w0(th10);
                            }
                            v6.f(listW9);
                            break;
                        case 10:
                            C0413i c0413i12 = c0413i;
                            t6.h.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj21 = ((List) obj2).get(0);
                            t6.h.c(obj21, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView10 = (WebView) obj21;
                            try {
                                c0413i12.getClass();
                                listW10 = Y4.D.D(webView10.getUrl());
                            } catch (Throwable th11) {
                                listW10 = p003a.a.w0(th11);
                            }
                            v6.f(listW10);
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
                                listW11 = Y4.D.D(null);
                            } catch (Throwable th12) {
                                listW11 = p003a.a.w0(th12);
                            }
                            v6.f(listW11);
                            break;
                        case 12:
                            C0413i c0413i14 = c0413i;
                            t6.h.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj23 = ((List) obj2).get(0);
                            t6.h.c(obj23, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView12 = (WebView) obj23;
                            try {
                                c0413i14.getClass();
                                listW12 = Y4.D.D(Boolean.valueOf(webView12.canGoBack()));
                            } catch (Throwable th13) {
                                listW12 = p003a.a.w0(th13);
                            }
                            v6.f(listW12);
                            break;
                        case 13:
                            C0413i c0413i15 = c0413i;
                            t6.h.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj24 = ((List) obj2).get(0);
                            t6.h.c(obj24, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView13 = (WebView) obj24;
                            try {
                                c0413i15.getClass();
                                listW13 = Y4.D.D(Boolean.valueOf(webView13.canGoForward()));
                            } catch (Throwable th14) {
                                listW13 = p003a.a.w0(th14);
                            }
                            v6.f(listW13);
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
                                listW14 = Y4.D.D(null);
                            } catch (Throwable th15) {
                                listW14 = p003a.a.w0(th15);
                            }
                            v6.f(listW14);
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
                                listW15 = Y4.D.D(null);
                            } catch (Throwable th16) {
                                listW15 = p003a.a.w0(th16);
                            }
                            v6.f(listW15);
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
                            boolean zBooleanValue = ((Boolean) obj28).booleanValue();
                            try {
                                c0413i18.getClass();
                                webView16.clearCache(zBooleanValue);
                                listW16 = Y4.D.D(null);
                            } catch (Throwable th17) {
                                listW16 = p003a.a.w0(th17);
                            }
                            v6.f(listW16);
                            break;
                        case 17:
                            t6.h.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list10 = (List) obj2;
                            Object obj29 = list10.get(0);
                            t6.h.c(obj29, "null cannot be cast to non-null type android.webkit.WebView");
                            Object obj30 = list10.get(1);
                            t6.h.c(obj30, "null cannot be cast to non-null type kotlin.String");
                            B b7 = new B(v6, 1);
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
                                listW17 = Y4.D.D(webView17.getTitle());
                            } catch (Throwable th18) {
                                listW17 = p003a.a.w0(th18);
                            }
                            v6.f(listW17);
                            break;
                        case 19:
                            C0413i c0413i20 = c0413i;
                            t6.h.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj32 = ((List) obj2).get(0);
                            t6.h.c(obj32, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean zBooleanValue2 = ((Boolean) obj32).booleanValue();
                            try {
                                c0413i20.getClass();
                                WebView.setWebContentsDebuggingEnabled(zBooleanValue2);
                                listW18 = Y4.D.D(null);
                            } catch (Throwable th19) {
                                listW18 = p003a.a.w0(th19);
                            }
                            v6.f(listW18);
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
                                listW19 = Y4.D.D(null);
                            } catch (Throwable th20) {
                                listW19 = p003a.a.w0(th20);
                            }
                            v6.f(listW19);
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
                                listW20 = Y4.D.D(null);
                            } catch (Throwable th21) {
                                listW20 = p003a.a.w0(th21);
                            }
                            v6.f(listW20);
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
                                listW21 = Y4.D.D(null);
                            } catch (Throwable th22) {
                                listW21 = p003a.a.w0(th22);
                            }
                            v6.f(listW21);
                            break;
                    }
                }
            });
        } else {
            f11.M(null);
        }
        p155w1.F0 f12 = new p155w1.F0(fVar, "dev.flutter.pigeon.webview_flutter_android.WebView.postUrl", c0406b, obj, 1);
        if (c0413i != null) {
            final int i12 = 9;
            f12.M(new A5.b() { // from class: R5.N
                @Override // A5.b
                public final void i(Object obj2, V0 v6) {
                    List listW0;
                    List listW1;
                    List listW2;
                    List listW3;
                    List listW4;
                    List listW5;
                    List listW6;
                    List listW7;
                    List listW8;
                    List listW9;
                    List listW10;
                    List listW11;
                    List listW12;
                    List listW13;
                    List listW14;
                    List listW15;
                    List listW16;
                    List listW17;
                    List listW18;
                    List listW19;
                    List listW20;
                    List listW21;
                    switch (i12) {
                        case 0:
                            C0413i c0413i2 = c0413i;
                            t6.h.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj3 = ((List) obj2).get(0);
                            t6.h.c(obj3, "null cannot be cast to non-null type kotlin.Long");
                            try {
                                ((C0407c) c0413i2.f6174a.f3679c).a(((Long) obj3).longValue(), c0413i2.a());
                                listW0 = Y4.D.D(null);
                            } catch (Throwable th) {
                                listW0 = p003a.a.w0(th);
                            }
                            v6.f(listW0);
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
                                listW1 = Y4.D.D(null);
                            } catch (Throwable th2) {
                                listW1 = p003a.a.w0(th2);
                            }
                            v6.f(listW1);
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
                                listW2 = Y4.D.D(null);
                            } catch (Throwable th3) {
                                listW2 = p003a.a.w0(th3);
                            }
                            v6.f(listW2);
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
                                listW3 = Y4.D.D(null);
                            } catch (Throwable th4) {
                                listW3 = p003a.a.w0(th4);
                            }
                            v6.f(listW3);
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
                            long jLongValue = ((Long) obj9).longValue();
                            try {
                                c0413i6.getClass();
                                webView4.setBackgroundColor((int) jLongValue);
                                listW4 = Y4.D.D(null);
                            } catch (Throwable th5) {
                                listW4 = p003a.a.w0(th5);
                            }
                            v6.f(listW4);
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
                                listW5 = Y4.D.D(null);
                            } catch (Throwable th6) {
                                listW5 = p003a.a.w0(th6);
                            }
                            v6.f(listW5);
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
                                listW6 = Y4.D.D(null);
                            } catch (Throwable th7) {
                                listW6 = p003a.a.w0(th7);
                            }
                            v6.f(listW6);
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
                                listW7 = Y4.D.D(null);
                            } catch (Throwable th8) {
                                listW7 = p003a.a.w0(th8);
                            }
                            v6.f(listW7);
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
                                listW8 = Y4.D.D(null);
                            } catch (Throwable th9) {
                                listW8 = p003a.a.w0(th9);
                            }
                            v6.f(listW8);
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
                                listW9 = Y4.D.D(null);
                            } catch (Throwable th10) {
                                listW9 = p003a.a.w0(th10);
                            }
                            v6.f(listW9);
                            break;
                        case 10:
                            C0413i c0413i12 = c0413i;
                            t6.h.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj21 = ((List) obj2).get(0);
                            t6.h.c(obj21, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView10 = (WebView) obj21;
                            try {
                                c0413i12.getClass();
                                listW10 = Y4.D.D(webView10.getUrl());
                            } catch (Throwable th11) {
                                listW10 = p003a.a.w0(th11);
                            }
                            v6.f(listW10);
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
                                listW11 = Y4.D.D(null);
                            } catch (Throwable th12) {
                                listW11 = p003a.a.w0(th12);
                            }
                            v6.f(listW11);
                            break;
                        case 12:
                            C0413i c0413i14 = c0413i;
                            t6.h.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj23 = ((List) obj2).get(0);
                            t6.h.c(obj23, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView12 = (WebView) obj23;
                            try {
                                c0413i14.getClass();
                                listW12 = Y4.D.D(Boolean.valueOf(webView12.canGoBack()));
                            } catch (Throwable th13) {
                                listW12 = p003a.a.w0(th13);
                            }
                            v6.f(listW12);
                            break;
                        case 13:
                            C0413i c0413i15 = c0413i;
                            t6.h.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj24 = ((List) obj2).get(0);
                            t6.h.c(obj24, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView13 = (WebView) obj24;
                            try {
                                c0413i15.getClass();
                                listW13 = Y4.D.D(Boolean.valueOf(webView13.canGoForward()));
                            } catch (Throwable th14) {
                                listW13 = p003a.a.w0(th14);
                            }
                            v6.f(listW13);
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
                                listW14 = Y4.D.D(null);
                            } catch (Throwable th15) {
                                listW14 = p003a.a.w0(th15);
                            }
                            v6.f(listW14);
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
                                listW15 = Y4.D.D(null);
                            } catch (Throwable th16) {
                                listW15 = p003a.a.w0(th16);
                            }
                            v6.f(listW15);
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
                            boolean zBooleanValue = ((Boolean) obj28).booleanValue();
                            try {
                                c0413i18.getClass();
                                webView16.clearCache(zBooleanValue);
                                listW16 = Y4.D.D(null);
                            } catch (Throwable th17) {
                                listW16 = p003a.a.w0(th17);
                            }
                            v6.f(listW16);
                            break;
                        case 17:
                            t6.h.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list10 = (List) obj2;
                            Object obj29 = list10.get(0);
                            t6.h.c(obj29, "null cannot be cast to non-null type android.webkit.WebView");
                            Object obj30 = list10.get(1);
                            t6.h.c(obj30, "null cannot be cast to non-null type kotlin.String");
                            B b7 = new B(v6, 1);
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
                                listW17 = Y4.D.D(webView17.getTitle());
                            } catch (Throwable th18) {
                                listW17 = p003a.a.w0(th18);
                            }
                            v6.f(listW17);
                            break;
                        case 19:
                            C0413i c0413i20 = c0413i;
                            t6.h.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj32 = ((List) obj2).get(0);
                            t6.h.c(obj32, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean zBooleanValue2 = ((Boolean) obj32).booleanValue();
                            try {
                                c0413i20.getClass();
                                WebView.setWebContentsDebuggingEnabled(zBooleanValue2);
                                listW18 = Y4.D.D(null);
                            } catch (Throwable th19) {
                                listW18 = p003a.a.w0(th19);
                            }
                            v6.f(listW18);
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
                                listW19 = Y4.D.D(null);
                            } catch (Throwable th20) {
                                listW19 = p003a.a.w0(th20);
                            }
                            v6.f(listW19);
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
                                listW20 = Y4.D.D(null);
                            } catch (Throwable th21) {
                                listW20 = p003a.a.w0(th21);
                            }
                            v6.f(listW20);
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
                                listW21 = Y4.D.D(null);
                            } catch (Throwable th22) {
                                listW21 = p003a.a.w0(th22);
                            }
                            v6.f(listW21);
                            break;
                    }
                }
            });
        } else {
            f12.M(null);
        }
        p155w1.F0 f13 = new p155w1.F0(fVar, "dev.flutter.pigeon.webview_flutter_android.WebView.getUrl", c0406b, obj, 1);
        if (c0413i != null) {
            final int i13 = 10;
            f13.M(new A5.b() { // from class: R5.N
                @Override // A5.b
                public final void i(Object obj2, V0 v6) {
                    List listW0;
                    List listW1;
                    List listW2;
                    List listW3;
                    List listW4;
                    List listW5;
                    List listW6;
                    List listW7;
                    List listW8;
                    List listW9;
                    List listW10;
                    List listW11;
                    List listW12;
                    List listW13;
                    List listW14;
                    List listW15;
                    List listW16;
                    List listW17;
                    List listW18;
                    List listW19;
                    List listW20;
                    List listW21;
                    switch (i13) {
                        case 0:
                            C0413i c0413i2 = c0413i;
                            t6.h.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj3 = ((List) obj2).get(0);
                            t6.h.c(obj3, "null cannot be cast to non-null type kotlin.Long");
                            try {
                                ((C0407c) c0413i2.f6174a.f3679c).a(((Long) obj3).longValue(), c0413i2.a());
                                listW0 = Y4.D.D(null);
                            } catch (Throwable th) {
                                listW0 = p003a.a.w0(th);
                            }
                            v6.f(listW0);
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
                                listW1 = Y4.D.D(null);
                            } catch (Throwable th2) {
                                listW1 = p003a.a.w0(th2);
                            }
                            v6.f(listW1);
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
                                listW2 = Y4.D.D(null);
                            } catch (Throwable th3) {
                                listW2 = p003a.a.w0(th3);
                            }
                            v6.f(listW2);
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
                                listW3 = Y4.D.D(null);
                            } catch (Throwable th4) {
                                listW3 = p003a.a.w0(th4);
                            }
                            v6.f(listW3);
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
                            long jLongValue = ((Long) obj9).longValue();
                            try {
                                c0413i6.getClass();
                                webView4.setBackgroundColor((int) jLongValue);
                                listW4 = Y4.D.D(null);
                            } catch (Throwable th5) {
                                listW4 = p003a.a.w0(th5);
                            }
                            v6.f(listW4);
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
                                listW5 = Y4.D.D(null);
                            } catch (Throwable th6) {
                                listW5 = p003a.a.w0(th6);
                            }
                            v6.f(listW5);
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
                                listW6 = Y4.D.D(null);
                            } catch (Throwable th7) {
                                listW6 = p003a.a.w0(th7);
                            }
                            v6.f(listW6);
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
                                listW7 = Y4.D.D(null);
                            } catch (Throwable th8) {
                                listW7 = p003a.a.w0(th8);
                            }
                            v6.f(listW7);
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
                                listW8 = Y4.D.D(null);
                            } catch (Throwable th9) {
                                listW8 = p003a.a.w0(th9);
                            }
                            v6.f(listW8);
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
                                listW9 = Y4.D.D(null);
                            } catch (Throwable th10) {
                                listW9 = p003a.a.w0(th10);
                            }
                            v6.f(listW9);
                            break;
                        case 10:
                            C0413i c0413i12 = c0413i;
                            t6.h.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj21 = ((List) obj2).get(0);
                            t6.h.c(obj21, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView10 = (WebView) obj21;
                            try {
                                c0413i12.getClass();
                                listW10 = Y4.D.D(webView10.getUrl());
                            } catch (Throwable th11) {
                                listW10 = p003a.a.w0(th11);
                            }
                            v6.f(listW10);
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
                                listW11 = Y4.D.D(null);
                            } catch (Throwable th12) {
                                listW11 = p003a.a.w0(th12);
                            }
                            v6.f(listW11);
                            break;
                        case 12:
                            C0413i c0413i14 = c0413i;
                            t6.h.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj23 = ((List) obj2).get(0);
                            t6.h.c(obj23, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView12 = (WebView) obj23;
                            try {
                                c0413i14.getClass();
                                listW12 = Y4.D.D(Boolean.valueOf(webView12.canGoBack()));
                            } catch (Throwable th13) {
                                listW12 = p003a.a.w0(th13);
                            }
                            v6.f(listW12);
                            break;
                        case 13:
                            C0413i c0413i15 = c0413i;
                            t6.h.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj24 = ((List) obj2).get(0);
                            t6.h.c(obj24, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView13 = (WebView) obj24;
                            try {
                                c0413i15.getClass();
                                listW13 = Y4.D.D(Boolean.valueOf(webView13.canGoForward()));
                            } catch (Throwable th14) {
                                listW13 = p003a.a.w0(th14);
                            }
                            v6.f(listW13);
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
                                listW14 = Y4.D.D(null);
                            } catch (Throwable th15) {
                                listW14 = p003a.a.w0(th15);
                            }
                            v6.f(listW14);
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
                                listW15 = Y4.D.D(null);
                            } catch (Throwable th16) {
                                listW15 = p003a.a.w0(th16);
                            }
                            v6.f(listW15);
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
                            boolean zBooleanValue = ((Boolean) obj28).booleanValue();
                            try {
                                c0413i18.getClass();
                                webView16.clearCache(zBooleanValue);
                                listW16 = Y4.D.D(null);
                            } catch (Throwable th17) {
                                listW16 = p003a.a.w0(th17);
                            }
                            v6.f(listW16);
                            break;
                        case 17:
                            t6.h.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list10 = (List) obj2;
                            Object obj29 = list10.get(0);
                            t6.h.c(obj29, "null cannot be cast to non-null type android.webkit.WebView");
                            Object obj30 = list10.get(1);
                            t6.h.c(obj30, "null cannot be cast to non-null type kotlin.String");
                            B b7 = new B(v6, 1);
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
                                listW17 = Y4.D.D(webView17.getTitle());
                            } catch (Throwable th18) {
                                listW17 = p003a.a.w0(th18);
                            }
                            v6.f(listW17);
                            break;
                        case 19:
                            C0413i c0413i20 = c0413i;
                            t6.h.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj32 = ((List) obj2).get(0);
                            t6.h.c(obj32, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean zBooleanValue2 = ((Boolean) obj32).booleanValue();
                            try {
                                c0413i20.getClass();
                                WebView.setWebContentsDebuggingEnabled(zBooleanValue2);
                                listW18 = Y4.D.D(null);
                            } catch (Throwable th19) {
                                listW18 = p003a.a.w0(th19);
                            }
                            v6.f(listW18);
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
                                listW19 = Y4.D.D(null);
                            } catch (Throwable th20) {
                                listW19 = p003a.a.w0(th20);
                            }
                            v6.f(listW19);
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
                                listW20 = Y4.D.D(null);
                            } catch (Throwable th21) {
                                listW20 = p003a.a.w0(th21);
                            }
                            v6.f(listW20);
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
                                listW21 = Y4.D.D(null);
                            } catch (Throwable th22) {
                                listW21 = p003a.a.w0(th22);
                            }
                            v6.f(listW21);
                            break;
                    }
                }
            });
        } else {
            f13.M(null);
        }
        p155w1.F0 f14 = new p155w1.F0(fVar, "dev.flutter.pigeon.webview_flutter_android.WebView.canGoBack", c0406b, obj, 1);
        if (c0413i != null) {
            final int i14 = 12;
            f14.M(new A5.b() { // from class: R5.N
                @Override // A5.b
                public final void i(Object obj2, V0 v6) {
                    List listW0;
                    List listW1;
                    List listW2;
                    List listW3;
                    List listW4;
                    List listW5;
                    List listW6;
                    List listW7;
                    List listW8;
                    List listW9;
                    List listW10;
                    List listW11;
                    List listW12;
                    List listW13;
                    List listW14;
                    List listW15;
                    List listW16;
                    List listW17;
                    List listW18;
                    List listW19;
                    List listW20;
                    List listW21;
                    switch (i14) {
                        case 0:
                            C0413i c0413i2 = c0413i;
                            t6.h.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj3 = ((List) obj2).get(0);
                            t6.h.c(obj3, "null cannot be cast to non-null type kotlin.Long");
                            try {
                                ((C0407c) c0413i2.f6174a.f3679c).a(((Long) obj3).longValue(), c0413i2.a());
                                listW0 = Y4.D.D(null);
                            } catch (Throwable th) {
                                listW0 = p003a.a.w0(th);
                            }
                            v6.f(listW0);
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
                                listW1 = Y4.D.D(null);
                            } catch (Throwable th2) {
                                listW1 = p003a.a.w0(th2);
                            }
                            v6.f(listW1);
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
                                listW2 = Y4.D.D(null);
                            } catch (Throwable th3) {
                                listW2 = p003a.a.w0(th3);
                            }
                            v6.f(listW2);
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
                                listW3 = Y4.D.D(null);
                            } catch (Throwable th4) {
                                listW3 = p003a.a.w0(th4);
                            }
                            v6.f(listW3);
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
                            long jLongValue = ((Long) obj9).longValue();
                            try {
                                c0413i6.getClass();
                                webView4.setBackgroundColor((int) jLongValue);
                                listW4 = Y4.D.D(null);
                            } catch (Throwable th5) {
                                listW4 = p003a.a.w0(th5);
                            }
                            v6.f(listW4);
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
                                listW5 = Y4.D.D(null);
                            } catch (Throwable th6) {
                                listW5 = p003a.a.w0(th6);
                            }
                            v6.f(listW5);
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
                                listW6 = Y4.D.D(null);
                            } catch (Throwable th7) {
                                listW6 = p003a.a.w0(th7);
                            }
                            v6.f(listW6);
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
                                listW7 = Y4.D.D(null);
                            } catch (Throwable th8) {
                                listW7 = p003a.a.w0(th8);
                            }
                            v6.f(listW7);
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
                                listW8 = Y4.D.D(null);
                            } catch (Throwable th9) {
                                listW8 = p003a.a.w0(th9);
                            }
                            v6.f(listW8);
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
                                listW9 = Y4.D.D(null);
                            } catch (Throwable th10) {
                                listW9 = p003a.a.w0(th10);
                            }
                            v6.f(listW9);
                            break;
                        case 10:
                            C0413i c0413i12 = c0413i;
                            t6.h.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj21 = ((List) obj2).get(0);
                            t6.h.c(obj21, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView10 = (WebView) obj21;
                            try {
                                c0413i12.getClass();
                                listW10 = Y4.D.D(webView10.getUrl());
                            } catch (Throwable th11) {
                                listW10 = p003a.a.w0(th11);
                            }
                            v6.f(listW10);
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
                                listW11 = Y4.D.D(null);
                            } catch (Throwable th12) {
                                listW11 = p003a.a.w0(th12);
                            }
                            v6.f(listW11);
                            break;
                        case 12:
                            C0413i c0413i14 = c0413i;
                            t6.h.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj23 = ((List) obj2).get(0);
                            t6.h.c(obj23, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView12 = (WebView) obj23;
                            try {
                                c0413i14.getClass();
                                listW12 = Y4.D.D(Boolean.valueOf(webView12.canGoBack()));
                            } catch (Throwable th13) {
                                listW12 = p003a.a.w0(th13);
                            }
                            v6.f(listW12);
                            break;
                        case 13:
                            C0413i c0413i15 = c0413i;
                            t6.h.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj24 = ((List) obj2).get(0);
                            t6.h.c(obj24, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView13 = (WebView) obj24;
                            try {
                                c0413i15.getClass();
                                listW13 = Y4.D.D(Boolean.valueOf(webView13.canGoForward()));
                            } catch (Throwable th14) {
                                listW13 = p003a.a.w0(th14);
                            }
                            v6.f(listW13);
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
                                listW14 = Y4.D.D(null);
                            } catch (Throwable th15) {
                                listW14 = p003a.a.w0(th15);
                            }
                            v6.f(listW14);
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
                                listW15 = Y4.D.D(null);
                            } catch (Throwable th16) {
                                listW15 = p003a.a.w0(th16);
                            }
                            v6.f(listW15);
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
                            boolean zBooleanValue = ((Boolean) obj28).booleanValue();
                            try {
                                c0413i18.getClass();
                                webView16.clearCache(zBooleanValue);
                                listW16 = Y4.D.D(null);
                            } catch (Throwable th17) {
                                listW16 = p003a.a.w0(th17);
                            }
                            v6.f(listW16);
                            break;
                        case 17:
                            t6.h.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list10 = (List) obj2;
                            Object obj29 = list10.get(0);
                            t6.h.c(obj29, "null cannot be cast to non-null type android.webkit.WebView");
                            Object obj30 = list10.get(1);
                            t6.h.c(obj30, "null cannot be cast to non-null type kotlin.String");
                            B b7 = new B(v6, 1);
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
                                listW17 = Y4.D.D(webView17.getTitle());
                            } catch (Throwable th18) {
                                listW17 = p003a.a.w0(th18);
                            }
                            v6.f(listW17);
                            break;
                        case 19:
                            C0413i c0413i20 = c0413i;
                            t6.h.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj32 = ((List) obj2).get(0);
                            t6.h.c(obj32, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean zBooleanValue2 = ((Boolean) obj32).booleanValue();
                            try {
                                c0413i20.getClass();
                                WebView.setWebContentsDebuggingEnabled(zBooleanValue2);
                                listW18 = Y4.D.D(null);
                            } catch (Throwable th19) {
                                listW18 = p003a.a.w0(th19);
                            }
                            v6.f(listW18);
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
                                listW19 = Y4.D.D(null);
                            } catch (Throwable th20) {
                                listW19 = p003a.a.w0(th20);
                            }
                            v6.f(listW19);
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
                                listW20 = Y4.D.D(null);
                            } catch (Throwable th21) {
                                listW20 = p003a.a.w0(th21);
                            }
                            v6.f(listW20);
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
                                listW21 = Y4.D.D(null);
                            } catch (Throwable th22) {
                                listW21 = p003a.a.w0(th22);
                            }
                            v6.f(listW21);
                            break;
                    }
                }
            });
        } else {
            f14.M(null);
        }
        p155w1.F0 f15 = new p155w1.F0(fVar, "dev.flutter.pigeon.webview_flutter_android.WebView.canGoForward", c0406b, obj, 1);
        if (c0413i != null) {
            final int i15 = 13;
            f15.M(new A5.b() { // from class: R5.N
                @Override // A5.b
                public final void i(Object obj2, V0 v6) {
                    List listW0;
                    List listW1;
                    List listW2;
                    List listW3;
                    List listW4;
                    List listW5;
                    List listW6;
                    List listW7;
                    List listW8;
                    List listW9;
                    List listW10;
                    List listW11;
                    List listW12;
                    List listW13;
                    List listW14;
                    List listW15;
                    List listW16;
                    List listW17;
                    List listW18;
                    List listW19;
                    List listW20;
                    List listW21;
                    switch (i15) {
                        case 0:
                            C0413i c0413i2 = c0413i;
                            t6.h.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj3 = ((List) obj2).get(0);
                            t6.h.c(obj3, "null cannot be cast to non-null type kotlin.Long");
                            try {
                                ((C0407c) c0413i2.f6174a.f3679c).a(((Long) obj3).longValue(), c0413i2.a());
                                listW0 = Y4.D.D(null);
                            } catch (Throwable th) {
                                listW0 = p003a.a.w0(th);
                            }
                            v6.f(listW0);
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
                                listW1 = Y4.D.D(null);
                            } catch (Throwable th2) {
                                listW1 = p003a.a.w0(th2);
                            }
                            v6.f(listW1);
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
                                listW2 = Y4.D.D(null);
                            } catch (Throwable th3) {
                                listW2 = p003a.a.w0(th3);
                            }
                            v6.f(listW2);
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
                                listW3 = Y4.D.D(null);
                            } catch (Throwable th4) {
                                listW3 = p003a.a.w0(th4);
                            }
                            v6.f(listW3);
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
                            long jLongValue = ((Long) obj9).longValue();
                            try {
                                c0413i6.getClass();
                                webView4.setBackgroundColor((int) jLongValue);
                                listW4 = Y4.D.D(null);
                            } catch (Throwable th5) {
                                listW4 = p003a.a.w0(th5);
                            }
                            v6.f(listW4);
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
                                listW5 = Y4.D.D(null);
                            } catch (Throwable th6) {
                                listW5 = p003a.a.w0(th6);
                            }
                            v6.f(listW5);
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
                                listW6 = Y4.D.D(null);
                            } catch (Throwable th7) {
                                listW6 = p003a.a.w0(th7);
                            }
                            v6.f(listW6);
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
                                listW7 = Y4.D.D(null);
                            } catch (Throwable th8) {
                                listW7 = p003a.a.w0(th8);
                            }
                            v6.f(listW7);
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
                                listW8 = Y4.D.D(null);
                            } catch (Throwable th9) {
                                listW8 = p003a.a.w0(th9);
                            }
                            v6.f(listW8);
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
                                listW9 = Y4.D.D(null);
                            } catch (Throwable th10) {
                                listW9 = p003a.a.w0(th10);
                            }
                            v6.f(listW9);
                            break;
                        case 10:
                            C0413i c0413i12 = c0413i;
                            t6.h.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj21 = ((List) obj2).get(0);
                            t6.h.c(obj21, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView10 = (WebView) obj21;
                            try {
                                c0413i12.getClass();
                                listW10 = Y4.D.D(webView10.getUrl());
                            } catch (Throwable th11) {
                                listW10 = p003a.a.w0(th11);
                            }
                            v6.f(listW10);
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
                                listW11 = Y4.D.D(null);
                            } catch (Throwable th12) {
                                listW11 = p003a.a.w0(th12);
                            }
                            v6.f(listW11);
                            break;
                        case 12:
                            C0413i c0413i14 = c0413i;
                            t6.h.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj23 = ((List) obj2).get(0);
                            t6.h.c(obj23, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView12 = (WebView) obj23;
                            try {
                                c0413i14.getClass();
                                listW12 = Y4.D.D(Boolean.valueOf(webView12.canGoBack()));
                            } catch (Throwable th13) {
                                listW12 = p003a.a.w0(th13);
                            }
                            v6.f(listW12);
                            break;
                        case 13:
                            C0413i c0413i15 = c0413i;
                            t6.h.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj24 = ((List) obj2).get(0);
                            t6.h.c(obj24, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView13 = (WebView) obj24;
                            try {
                                c0413i15.getClass();
                                listW13 = Y4.D.D(Boolean.valueOf(webView13.canGoForward()));
                            } catch (Throwable th14) {
                                listW13 = p003a.a.w0(th14);
                            }
                            v6.f(listW13);
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
                                listW14 = Y4.D.D(null);
                            } catch (Throwable th15) {
                                listW14 = p003a.a.w0(th15);
                            }
                            v6.f(listW14);
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
                                listW15 = Y4.D.D(null);
                            } catch (Throwable th16) {
                                listW15 = p003a.a.w0(th16);
                            }
                            v6.f(listW15);
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
                            boolean zBooleanValue = ((Boolean) obj28).booleanValue();
                            try {
                                c0413i18.getClass();
                                webView16.clearCache(zBooleanValue);
                                listW16 = Y4.D.D(null);
                            } catch (Throwable th17) {
                                listW16 = p003a.a.w0(th17);
                            }
                            v6.f(listW16);
                            break;
                        case 17:
                            t6.h.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list10 = (List) obj2;
                            Object obj29 = list10.get(0);
                            t6.h.c(obj29, "null cannot be cast to non-null type android.webkit.WebView");
                            Object obj30 = list10.get(1);
                            t6.h.c(obj30, "null cannot be cast to non-null type kotlin.String");
                            B b7 = new B(v6, 1);
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
                                listW17 = Y4.D.D(webView17.getTitle());
                            } catch (Throwable th18) {
                                listW17 = p003a.a.w0(th18);
                            }
                            v6.f(listW17);
                            break;
                        case 19:
                            C0413i c0413i20 = c0413i;
                            t6.h.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj32 = ((List) obj2).get(0);
                            t6.h.c(obj32, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean zBooleanValue2 = ((Boolean) obj32).booleanValue();
                            try {
                                c0413i20.getClass();
                                WebView.setWebContentsDebuggingEnabled(zBooleanValue2);
                                listW18 = Y4.D.D(null);
                            } catch (Throwable th19) {
                                listW18 = p003a.a.w0(th19);
                            }
                            v6.f(listW18);
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
                                listW19 = Y4.D.D(null);
                            } catch (Throwable th20) {
                                listW19 = p003a.a.w0(th20);
                            }
                            v6.f(listW19);
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
                                listW20 = Y4.D.D(null);
                            } catch (Throwable th21) {
                                listW20 = p003a.a.w0(th21);
                            }
                            v6.f(listW20);
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
                                listW21 = Y4.D.D(null);
                            } catch (Throwable th22) {
                                listW21 = p003a.a.w0(th22);
                            }
                            v6.f(listW21);
                            break;
                    }
                }
            });
        } else {
            f15.M(null);
        }
        p155w1.F0 f16 = new p155w1.F0(fVar, "dev.flutter.pigeon.webview_flutter_android.WebView.goBack", c0406b, obj, 1);
        if (c0413i != null) {
            final int i16 = 14;
            f16.M(new A5.b() { // from class: R5.N
                @Override // A5.b
                public final void i(Object obj2, V0 v6) {
                    List listW0;
                    List listW1;
                    List listW2;
                    List listW3;
                    List listW4;
                    List listW5;
                    List listW6;
                    List listW7;
                    List listW8;
                    List listW9;
                    List listW10;
                    List listW11;
                    List listW12;
                    List listW13;
                    List listW14;
                    List listW15;
                    List listW16;
                    List listW17;
                    List listW18;
                    List listW19;
                    List listW20;
                    List listW21;
                    switch (i16) {
                        case 0:
                            C0413i c0413i2 = c0413i;
                            t6.h.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj3 = ((List) obj2).get(0);
                            t6.h.c(obj3, "null cannot be cast to non-null type kotlin.Long");
                            try {
                                ((C0407c) c0413i2.f6174a.f3679c).a(((Long) obj3).longValue(), c0413i2.a());
                                listW0 = Y4.D.D(null);
                            } catch (Throwable th) {
                                listW0 = p003a.a.w0(th);
                            }
                            v6.f(listW0);
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
                                listW1 = Y4.D.D(null);
                            } catch (Throwable th2) {
                                listW1 = p003a.a.w0(th2);
                            }
                            v6.f(listW1);
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
                                listW2 = Y4.D.D(null);
                            } catch (Throwable th3) {
                                listW2 = p003a.a.w0(th3);
                            }
                            v6.f(listW2);
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
                                listW3 = Y4.D.D(null);
                            } catch (Throwable th4) {
                                listW3 = p003a.a.w0(th4);
                            }
                            v6.f(listW3);
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
                            long jLongValue = ((Long) obj9).longValue();
                            try {
                                c0413i6.getClass();
                                webView4.setBackgroundColor((int) jLongValue);
                                listW4 = Y4.D.D(null);
                            } catch (Throwable th5) {
                                listW4 = p003a.a.w0(th5);
                            }
                            v6.f(listW4);
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
                                listW5 = Y4.D.D(null);
                            } catch (Throwable th6) {
                                listW5 = p003a.a.w0(th6);
                            }
                            v6.f(listW5);
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
                                listW6 = Y4.D.D(null);
                            } catch (Throwable th7) {
                                listW6 = p003a.a.w0(th7);
                            }
                            v6.f(listW6);
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
                                listW7 = Y4.D.D(null);
                            } catch (Throwable th8) {
                                listW7 = p003a.a.w0(th8);
                            }
                            v6.f(listW7);
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
                                listW8 = Y4.D.D(null);
                            } catch (Throwable th9) {
                                listW8 = p003a.a.w0(th9);
                            }
                            v6.f(listW8);
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
                                listW9 = Y4.D.D(null);
                            } catch (Throwable th10) {
                                listW9 = p003a.a.w0(th10);
                            }
                            v6.f(listW9);
                            break;
                        case 10:
                            C0413i c0413i12 = c0413i;
                            t6.h.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj21 = ((List) obj2).get(0);
                            t6.h.c(obj21, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView10 = (WebView) obj21;
                            try {
                                c0413i12.getClass();
                                listW10 = Y4.D.D(webView10.getUrl());
                            } catch (Throwable th11) {
                                listW10 = p003a.a.w0(th11);
                            }
                            v6.f(listW10);
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
                                listW11 = Y4.D.D(null);
                            } catch (Throwable th12) {
                                listW11 = p003a.a.w0(th12);
                            }
                            v6.f(listW11);
                            break;
                        case 12:
                            C0413i c0413i14 = c0413i;
                            t6.h.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj23 = ((List) obj2).get(0);
                            t6.h.c(obj23, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView12 = (WebView) obj23;
                            try {
                                c0413i14.getClass();
                                listW12 = Y4.D.D(Boolean.valueOf(webView12.canGoBack()));
                            } catch (Throwable th13) {
                                listW12 = p003a.a.w0(th13);
                            }
                            v6.f(listW12);
                            break;
                        case 13:
                            C0413i c0413i15 = c0413i;
                            t6.h.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj24 = ((List) obj2).get(0);
                            t6.h.c(obj24, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView13 = (WebView) obj24;
                            try {
                                c0413i15.getClass();
                                listW13 = Y4.D.D(Boolean.valueOf(webView13.canGoForward()));
                            } catch (Throwable th14) {
                                listW13 = p003a.a.w0(th14);
                            }
                            v6.f(listW13);
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
                                listW14 = Y4.D.D(null);
                            } catch (Throwable th15) {
                                listW14 = p003a.a.w0(th15);
                            }
                            v6.f(listW14);
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
                                listW15 = Y4.D.D(null);
                            } catch (Throwable th16) {
                                listW15 = p003a.a.w0(th16);
                            }
                            v6.f(listW15);
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
                            boolean zBooleanValue = ((Boolean) obj28).booleanValue();
                            try {
                                c0413i18.getClass();
                                webView16.clearCache(zBooleanValue);
                                listW16 = Y4.D.D(null);
                            } catch (Throwable th17) {
                                listW16 = p003a.a.w0(th17);
                            }
                            v6.f(listW16);
                            break;
                        case 17:
                            t6.h.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list10 = (List) obj2;
                            Object obj29 = list10.get(0);
                            t6.h.c(obj29, "null cannot be cast to non-null type android.webkit.WebView");
                            Object obj30 = list10.get(1);
                            t6.h.c(obj30, "null cannot be cast to non-null type kotlin.String");
                            B b7 = new B(v6, 1);
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
                                listW17 = Y4.D.D(webView17.getTitle());
                            } catch (Throwable th18) {
                                listW17 = p003a.a.w0(th18);
                            }
                            v6.f(listW17);
                            break;
                        case 19:
                            C0413i c0413i20 = c0413i;
                            t6.h.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj32 = ((List) obj2).get(0);
                            t6.h.c(obj32, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean zBooleanValue2 = ((Boolean) obj32).booleanValue();
                            try {
                                c0413i20.getClass();
                                WebView.setWebContentsDebuggingEnabled(zBooleanValue2);
                                listW18 = Y4.D.D(null);
                            } catch (Throwable th19) {
                                listW18 = p003a.a.w0(th19);
                            }
                            v6.f(listW18);
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
                                listW19 = Y4.D.D(null);
                            } catch (Throwable th20) {
                                listW19 = p003a.a.w0(th20);
                            }
                            v6.f(listW19);
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
                                listW20 = Y4.D.D(null);
                            } catch (Throwable th21) {
                                listW20 = p003a.a.w0(th21);
                            }
                            v6.f(listW20);
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
                                listW21 = Y4.D.D(null);
                            } catch (Throwable th22) {
                                listW21 = p003a.a.w0(th22);
                            }
                            v6.f(listW21);
                            break;
                    }
                }
            });
        } else {
            f16.M(null);
        }
        p155w1.F0 f17 = new p155w1.F0(fVar, "dev.flutter.pigeon.webview_flutter_android.WebView.goForward", c0406b, obj, 1);
        if (c0413i != null) {
            final int i17 = 11;
            f17.M(new A5.b() { // from class: R5.N
                @Override // A5.b
                public final void i(Object obj2, V0 v6) {
                    List listW0;
                    List listW1;
                    List listW2;
                    List listW3;
                    List listW4;
                    List listW5;
                    List listW6;
                    List listW7;
                    List listW8;
                    List listW9;
                    List listW10;
                    List listW11;
                    List listW12;
                    List listW13;
                    List listW14;
                    List listW15;
                    List listW16;
                    List listW17;
                    List listW18;
                    List listW19;
                    List listW20;
                    List listW21;
                    switch (i17) {
                        case 0:
                            C0413i c0413i2 = c0413i;
                            t6.h.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj3 = ((List) obj2).get(0);
                            t6.h.c(obj3, "null cannot be cast to non-null type kotlin.Long");
                            try {
                                ((C0407c) c0413i2.f6174a.f3679c).a(((Long) obj3).longValue(), c0413i2.a());
                                listW0 = Y4.D.D(null);
                            } catch (Throwable th) {
                                listW0 = p003a.a.w0(th);
                            }
                            v6.f(listW0);
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
                                listW1 = Y4.D.D(null);
                            } catch (Throwable th2) {
                                listW1 = p003a.a.w0(th2);
                            }
                            v6.f(listW1);
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
                                listW2 = Y4.D.D(null);
                            } catch (Throwable th3) {
                                listW2 = p003a.a.w0(th3);
                            }
                            v6.f(listW2);
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
                                listW3 = Y4.D.D(null);
                            } catch (Throwable th4) {
                                listW3 = p003a.a.w0(th4);
                            }
                            v6.f(listW3);
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
                            long jLongValue = ((Long) obj9).longValue();
                            try {
                                c0413i6.getClass();
                                webView4.setBackgroundColor((int) jLongValue);
                                listW4 = Y4.D.D(null);
                            } catch (Throwable th5) {
                                listW4 = p003a.a.w0(th5);
                            }
                            v6.f(listW4);
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
                                listW5 = Y4.D.D(null);
                            } catch (Throwable th6) {
                                listW5 = p003a.a.w0(th6);
                            }
                            v6.f(listW5);
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
                                listW6 = Y4.D.D(null);
                            } catch (Throwable th7) {
                                listW6 = p003a.a.w0(th7);
                            }
                            v6.f(listW6);
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
                                listW7 = Y4.D.D(null);
                            } catch (Throwable th8) {
                                listW7 = p003a.a.w0(th8);
                            }
                            v6.f(listW7);
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
                                listW8 = Y4.D.D(null);
                            } catch (Throwable th9) {
                                listW8 = p003a.a.w0(th9);
                            }
                            v6.f(listW8);
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
                                listW9 = Y4.D.D(null);
                            } catch (Throwable th10) {
                                listW9 = p003a.a.w0(th10);
                            }
                            v6.f(listW9);
                            break;
                        case 10:
                            C0413i c0413i12 = c0413i;
                            t6.h.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj21 = ((List) obj2).get(0);
                            t6.h.c(obj21, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView10 = (WebView) obj21;
                            try {
                                c0413i12.getClass();
                                listW10 = Y4.D.D(webView10.getUrl());
                            } catch (Throwable th11) {
                                listW10 = p003a.a.w0(th11);
                            }
                            v6.f(listW10);
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
                                listW11 = Y4.D.D(null);
                            } catch (Throwable th12) {
                                listW11 = p003a.a.w0(th12);
                            }
                            v6.f(listW11);
                            break;
                        case 12:
                            C0413i c0413i14 = c0413i;
                            t6.h.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj23 = ((List) obj2).get(0);
                            t6.h.c(obj23, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView12 = (WebView) obj23;
                            try {
                                c0413i14.getClass();
                                listW12 = Y4.D.D(Boolean.valueOf(webView12.canGoBack()));
                            } catch (Throwable th13) {
                                listW12 = p003a.a.w0(th13);
                            }
                            v6.f(listW12);
                            break;
                        case 13:
                            C0413i c0413i15 = c0413i;
                            t6.h.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj24 = ((List) obj2).get(0);
                            t6.h.c(obj24, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView13 = (WebView) obj24;
                            try {
                                c0413i15.getClass();
                                listW13 = Y4.D.D(Boolean.valueOf(webView13.canGoForward()));
                            } catch (Throwable th14) {
                                listW13 = p003a.a.w0(th14);
                            }
                            v6.f(listW13);
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
                                listW14 = Y4.D.D(null);
                            } catch (Throwable th15) {
                                listW14 = p003a.a.w0(th15);
                            }
                            v6.f(listW14);
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
                                listW15 = Y4.D.D(null);
                            } catch (Throwable th16) {
                                listW15 = p003a.a.w0(th16);
                            }
                            v6.f(listW15);
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
                            boolean zBooleanValue = ((Boolean) obj28).booleanValue();
                            try {
                                c0413i18.getClass();
                                webView16.clearCache(zBooleanValue);
                                listW16 = Y4.D.D(null);
                            } catch (Throwable th17) {
                                listW16 = p003a.a.w0(th17);
                            }
                            v6.f(listW16);
                            break;
                        case 17:
                            t6.h.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list10 = (List) obj2;
                            Object obj29 = list10.get(0);
                            t6.h.c(obj29, "null cannot be cast to non-null type android.webkit.WebView");
                            Object obj30 = list10.get(1);
                            t6.h.c(obj30, "null cannot be cast to non-null type kotlin.String");
                            B b7 = new B(v6, 1);
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
                                listW17 = Y4.D.D(webView17.getTitle());
                            } catch (Throwable th18) {
                                listW17 = p003a.a.w0(th18);
                            }
                            v6.f(listW17);
                            break;
                        case 19:
                            C0413i c0413i20 = c0413i;
                            t6.h.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj32 = ((List) obj2).get(0);
                            t6.h.c(obj32, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean zBooleanValue2 = ((Boolean) obj32).booleanValue();
                            try {
                                c0413i20.getClass();
                                WebView.setWebContentsDebuggingEnabled(zBooleanValue2);
                                listW18 = Y4.D.D(null);
                            } catch (Throwable th19) {
                                listW18 = p003a.a.w0(th19);
                            }
                            v6.f(listW18);
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
                                listW19 = Y4.D.D(null);
                            } catch (Throwable th20) {
                                listW19 = p003a.a.w0(th20);
                            }
                            v6.f(listW19);
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
                                listW20 = Y4.D.D(null);
                            } catch (Throwable th21) {
                                listW20 = p003a.a.w0(th21);
                            }
                            v6.f(listW20);
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
                                listW21 = Y4.D.D(null);
                            } catch (Throwable th22) {
                                listW21 = p003a.a.w0(th22);
                            }
                            v6.f(listW21);
                            break;
                    }
                }
            });
        } else {
            f17.M(null);
        }
        p155w1.F0 f18 = new p155w1.F0(fVar, "dev.flutter.pigeon.webview_flutter_android.WebView.reload", c0406b, obj, 1);
        if (c0413i != null) {
            final int i18 = 15;
            f18.M(new A5.b() { // from class: R5.N
                @Override // A5.b
                public final void i(Object obj2, V0 v6) {
                    List listW0;
                    List listW1;
                    List listW2;
                    List listW3;
                    List listW4;
                    List listW5;
                    List listW6;
                    List listW7;
                    List listW8;
                    List listW9;
                    List listW10;
                    List listW11;
                    List listW12;
                    List listW13;
                    List listW14;
                    List listW15;
                    List listW16;
                    List listW17;
                    List listW18;
                    List listW19;
                    List listW20;
                    List listW21;
                    switch (i18) {
                        case 0:
                            C0413i c0413i2 = c0413i;
                            t6.h.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj3 = ((List) obj2).get(0);
                            t6.h.c(obj3, "null cannot be cast to non-null type kotlin.Long");
                            try {
                                ((C0407c) c0413i2.f6174a.f3679c).a(((Long) obj3).longValue(), c0413i2.a());
                                listW0 = Y4.D.D(null);
                            } catch (Throwable th) {
                                listW0 = p003a.a.w0(th);
                            }
                            v6.f(listW0);
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
                                listW1 = Y4.D.D(null);
                            } catch (Throwable th2) {
                                listW1 = p003a.a.w0(th2);
                            }
                            v6.f(listW1);
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
                                listW2 = Y4.D.D(null);
                            } catch (Throwable th3) {
                                listW2 = p003a.a.w0(th3);
                            }
                            v6.f(listW2);
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
                                listW3 = Y4.D.D(null);
                            } catch (Throwable th4) {
                                listW3 = p003a.a.w0(th4);
                            }
                            v6.f(listW3);
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
                            long jLongValue = ((Long) obj9).longValue();
                            try {
                                c0413i6.getClass();
                                webView4.setBackgroundColor((int) jLongValue);
                                listW4 = Y4.D.D(null);
                            } catch (Throwable th5) {
                                listW4 = p003a.a.w0(th5);
                            }
                            v6.f(listW4);
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
                                listW5 = Y4.D.D(null);
                            } catch (Throwable th6) {
                                listW5 = p003a.a.w0(th6);
                            }
                            v6.f(listW5);
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
                                listW6 = Y4.D.D(null);
                            } catch (Throwable th7) {
                                listW6 = p003a.a.w0(th7);
                            }
                            v6.f(listW6);
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
                                listW7 = Y4.D.D(null);
                            } catch (Throwable th8) {
                                listW7 = p003a.a.w0(th8);
                            }
                            v6.f(listW7);
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
                                listW8 = Y4.D.D(null);
                            } catch (Throwable th9) {
                                listW8 = p003a.a.w0(th9);
                            }
                            v6.f(listW8);
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
                                listW9 = Y4.D.D(null);
                            } catch (Throwable th10) {
                                listW9 = p003a.a.w0(th10);
                            }
                            v6.f(listW9);
                            break;
                        case 10:
                            C0413i c0413i12 = c0413i;
                            t6.h.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj21 = ((List) obj2).get(0);
                            t6.h.c(obj21, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView10 = (WebView) obj21;
                            try {
                                c0413i12.getClass();
                                listW10 = Y4.D.D(webView10.getUrl());
                            } catch (Throwable th11) {
                                listW10 = p003a.a.w0(th11);
                            }
                            v6.f(listW10);
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
                                listW11 = Y4.D.D(null);
                            } catch (Throwable th12) {
                                listW11 = p003a.a.w0(th12);
                            }
                            v6.f(listW11);
                            break;
                        case 12:
                            C0413i c0413i14 = c0413i;
                            t6.h.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj23 = ((List) obj2).get(0);
                            t6.h.c(obj23, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView12 = (WebView) obj23;
                            try {
                                c0413i14.getClass();
                                listW12 = Y4.D.D(Boolean.valueOf(webView12.canGoBack()));
                            } catch (Throwable th13) {
                                listW12 = p003a.a.w0(th13);
                            }
                            v6.f(listW12);
                            break;
                        case 13:
                            C0413i c0413i15 = c0413i;
                            t6.h.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj24 = ((List) obj2).get(0);
                            t6.h.c(obj24, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView13 = (WebView) obj24;
                            try {
                                c0413i15.getClass();
                                listW13 = Y4.D.D(Boolean.valueOf(webView13.canGoForward()));
                            } catch (Throwable th14) {
                                listW13 = p003a.a.w0(th14);
                            }
                            v6.f(listW13);
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
                                listW14 = Y4.D.D(null);
                            } catch (Throwable th15) {
                                listW14 = p003a.a.w0(th15);
                            }
                            v6.f(listW14);
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
                                listW15 = Y4.D.D(null);
                            } catch (Throwable th16) {
                                listW15 = p003a.a.w0(th16);
                            }
                            v6.f(listW15);
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
                            boolean zBooleanValue = ((Boolean) obj28).booleanValue();
                            try {
                                c0413i18.getClass();
                                webView16.clearCache(zBooleanValue);
                                listW16 = Y4.D.D(null);
                            } catch (Throwable th17) {
                                listW16 = p003a.a.w0(th17);
                            }
                            v6.f(listW16);
                            break;
                        case 17:
                            t6.h.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list10 = (List) obj2;
                            Object obj29 = list10.get(0);
                            t6.h.c(obj29, "null cannot be cast to non-null type android.webkit.WebView");
                            Object obj30 = list10.get(1);
                            t6.h.c(obj30, "null cannot be cast to non-null type kotlin.String");
                            B b7 = new B(v6, 1);
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
                                listW17 = Y4.D.D(webView17.getTitle());
                            } catch (Throwable th18) {
                                listW17 = p003a.a.w0(th18);
                            }
                            v6.f(listW17);
                            break;
                        case 19:
                            C0413i c0413i20 = c0413i;
                            t6.h.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj32 = ((List) obj2).get(0);
                            t6.h.c(obj32, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean zBooleanValue2 = ((Boolean) obj32).booleanValue();
                            try {
                                c0413i20.getClass();
                                WebView.setWebContentsDebuggingEnabled(zBooleanValue2);
                                listW18 = Y4.D.D(null);
                            } catch (Throwable th19) {
                                listW18 = p003a.a.w0(th19);
                            }
                            v6.f(listW18);
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
                                listW19 = Y4.D.D(null);
                            } catch (Throwable th20) {
                                listW19 = p003a.a.w0(th20);
                            }
                            v6.f(listW19);
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
                                listW20 = Y4.D.D(null);
                            } catch (Throwable th21) {
                                listW20 = p003a.a.w0(th21);
                            }
                            v6.f(listW20);
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
                                listW21 = Y4.D.D(null);
                            } catch (Throwable th22) {
                                listW21 = p003a.a.w0(th22);
                            }
                            v6.f(listW21);
                            break;
                    }
                }
            });
        } else {
            f18.M(null);
        }
        p155w1.F0 f19 = new p155w1.F0(fVar, "dev.flutter.pigeon.webview_flutter_android.WebView.clearCache", c0406b, obj, 1);
        if (c0413i != null) {
            final int i19 = 16;
            f19.M(new A5.b() { // from class: R5.N
                @Override // A5.b
                public final void i(Object obj2, V0 v6) {
                    List listW0;
                    List listW1;
                    List listW2;
                    List listW3;
                    List listW4;
                    List listW5;
                    List listW6;
                    List listW7;
                    List listW8;
                    List listW9;
                    List listW10;
                    List listW11;
                    List listW12;
                    List listW13;
                    List listW14;
                    List listW15;
                    List listW16;
                    List listW17;
                    List listW18;
                    List listW19;
                    List listW20;
                    List listW21;
                    switch (i19) {
                        case 0:
                            C0413i c0413i2 = c0413i;
                            t6.h.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj3 = ((List) obj2).get(0);
                            t6.h.c(obj3, "null cannot be cast to non-null type kotlin.Long");
                            try {
                                ((C0407c) c0413i2.f6174a.f3679c).a(((Long) obj3).longValue(), c0413i2.a());
                                listW0 = Y4.D.D(null);
                            } catch (Throwable th) {
                                listW0 = p003a.a.w0(th);
                            }
                            v6.f(listW0);
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
                                listW1 = Y4.D.D(null);
                            } catch (Throwable th2) {
                                listW1 = p003a.a.w0(th2);
                            }
                            v6.f(listW1);
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
                                listW2 = Y4.D.D(null);
                            } catch (Throwable th3) {
                                listW2 = p003a.a.w0(th3);
                            }
                            v6.f(listW2);
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
                                listW3 = Y4.D.D(null);
                            } catch (Throwable th4) {
                                listW3 = p003a.a.w0(th4);
                            }
                            v6.f(listW3);
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
                            long jLongValue = ((Long) obj9).longValue();
                            try {
                                c0413i6.getClass();
                                webView4.setBackgroundColor((int) jLongValue);
                                listW4 = Y4.D.D(null);
                            } catch (Throwable th5) {
                                listW4 = p003a.a.w0(th5);
                            }
                            v6.f(listW4);
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
                                listW5 = Y4.D.D(null);
                            } catch (Throwable th6) {
                                listW5 = p003a.a.w0(th6);
                            }
                            v6.f(listW5);
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
                                listW6 = Y4.D.D(null);
                            } catch (Throwable th7) {
                                listW6 = p003a.a.w0(th7);
                            }
                            v6.f(listW6);
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
                                listW7 = Y4.D.D(null);
                            } catch (Throwable th8) {
                                listW7 = p003a.a.w0(th8);
                            }
                            v6.f(listW7);
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
                                listW8 = Y4.D.D(null);
                            } catch (Throwable th9) {
                                listW8 = p003a.a.w0(th9);
                            }
                            v6.f(listW8);
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
                                listW9 = Y4.D.D(null);
                            } catch (Throwable th10) {
                                listW9 = p003a.a.w0(th10);
                            }
                            v6.f(listW9);
                            break;
                        case 10:
                            C0413i c0413i12 = c0413i;
                            t6.h.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj21 = ((List) obj2).get(0);
                            t6.h.c(obj21, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView10 = (WebView) obj21;
                            try {
                                c0413i12.getClass();
                                listW10 = Y4.D.D(webView10.getUrl());
                            } catch (Throwable th11) {
                                listW10 = p003a.a.w0(th11);
                            }
                            v6.f(listW10);
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
                                listW11 = Y4.D.D(null);
                            } catch (Throwable th12) {
                                listW11 = p003a.a.w0(th12);
                            }
                            v6.f(listW11);
                            break;
                        case 12:
                            C0413i c0413i14 = c0413i;
                            t6.h.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj23 = ((List) obj2).get(0);
                            t6.h.c(obj23, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView12 = (WebView) obj23;
                            try {
                                c0413i14.getClass();
                                listW12 = Y4.D.D(Boolean.valueOf(webView12.canGoBack()));
                            } catch (Throwable th13) {
                                listW12 = p003a.a.w0(th13);
                            }
                            v6.f(listW12);
                            break;
                        case 13:
                            C0413i c0413i15 = c0413i;
                            t6.h.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj24 = ((List) obj2).get(0);
                            t6.h.c(obj24, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView13 = (WebView) obj24;
                            try {
                                c0413i15.getClass();
                                listW13 = Y4.D.D(Boolean.valueOf(webView13.canGoForward()));
                            } catch (Throwable th14) {
                                listW13 = p003a.a.w0(th14);
                            }
                            v6.f(listW13);
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
                                listW14 = Y4.D.D(null);
                            } catch (Throwable th15) {
                                listW14 = p003a.a.w0(th15);
                            }
                            v6.f(listW14);
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
                                listW15 = Y4.D.D(null);
                            } catch (Throwable th16) {
                                listW15 = p003a.a.w0(th16);
                            }
                            v6.f(listW15);
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
                            boolean zBooleanValue = ((Boolean) obj28).booleanValue();
                            try {
                                c0413i18.getClass();
                                webView16.clearCache(zBooleanValue);
                                listW16 = Y4.D.D(null);
                            } catch (Throwable th17) {
                                listW16 = p003a.a.w0(th17);
                            }
                            v6.f(listW16);
                            break;
                        case 17:
                            t6.h.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list10 = (List) obj2;
                            Object obj29 = list10.get(0);
                            t6.h.c(obj29, "null cannot be cast to non-null type android.webkit.WebView");
                            Object obj30 = list10.get(1);
                            t6.h.c(obj30, "null cannot be cast to non-null type kotlin.String");
                            B b7 = new B(v6, 1);
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
                                listW17 = Y4.D.D(webView17.getTitle());
                            } catch (Throwable th18) {
                                listW17 = p003a.a.w0(th18);
                            }
                            v6.f(listW17);
                            break;
                        case 19:
                            C0413i c0413i20 = c0413i;
                            t6.h.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj32 = ((List) obj2).get(0);
                            t6.h.c(obj32, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean zBooleanValue2 = ((Boolean) obj32).booleanValue();
                            try {
                                c0413i20.getClass();
                                WebView.setWebContentsDebuggingEnabled(zBooleanValue2);
                                listW18 = Y4.D.D(null);
                            } catch (Throwable th19) {
                                listW18 = p003a.a.w0(th19);
                            }
                            v6.f(listW18);
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
                                listW19 = Y4.D.D(null);
                            } catch (Throwable th20) {
                                listW19 = p003a.a.w0(th20);
                            }
                            v6.f(listW19);
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
                                listW20 = Y4.D.D(null);
                            } catch (Throwable th21) {
                                listW20 = p003a.a.w0(th21);
                            }
                            v6.f(listW20);
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
                                listW21 = Y4.D.D(null);
                            } catch (Throwable th22) {
                                listW21 = p003a.a.w0(th22);
                            }
                            v6.f(listW21);
                            break;
                    }
                }
            });
        } else {
            f19.M(null);
        }
        p155w1.F0 f20 = new p155w1.F0(fVar, "dev.flutter.pigeon.webview_flutter_android.WebView.evaluateJavascript", c0406b, obj, 1);
        if (c0413i != null) {
            final int i20 = 17;
            f20.M(new A5.b() { // from class: R5.N
                @Override // A5.b
                public final void i(Object obj2, V0 v6) {
                    List listW0;
                    List listW1;
                    List listW2;
                    List listW3;
                    List listW4;
                    List listW5;
                    List listW6;
                    List listW7;
                    List listW8;
                    List listW9;
                    List listW10;
                    List listW11;
                    List listW12;
                    List listW13;
                    List listW14;
                    List listW15;
                    List listW16;
                    List listW17;
                    List listW18;
                    List listW19;
                    List listW20;
                    List listW21;
                    switch (i20) {
                        case 0:
                            C0413i c0413i2 = c0413i;
                            t6.h.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj3 = ((List) obj2).get(0);
                            t6.h.c(obj3, "null cannot be cast to non-null type kotlin.Long");
                            try {
                                ((C0407c) c0413i2.f6174a.f3679c).a(((Long) obj3).longValue(), c0413i2.a());
                                listW0 = Y4.D.D(null);
                            } catch (Throwable th) {
                                listW0 = p003a.a.w0(th);
                            }
                            v6.f(listW0);
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
                                listW1 = Y4.D.D(null);
                            } catch (Throwable th2) {
                                listW1 = p003a.a.w0(th2);
                            }
                            v6.f(listW1);
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
                                listW2 = Y4.D.D(null);
                            } catch (Throwable th3) {
                                listW2 = p003a.a.w0(th3);
                            }
                            v6.f(listW2);
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
                                listW3 = Y4.D.D(null);
                            } catch (Throwable th4) {
                                listW3 = p003a.a.w0(th4);
                            }
                            v6.f(listW3);
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
                            long jLongValue = ((Long) obj9).longValue();
                            try {
                                c0413i6.getClass();
                                webView4.setBackgroundColor((int) jLongValue);
                                listW4 = Y4.D.D(null);
                            } catch (Throwable th5) {
                                listW4 = p003a.a.w0(th5);
                            }
                            v6.f(listW4);
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
                                listW5 = Y4.D.D(null);
                            } catch (Throwable th6) {
                                listW5 = p003a.a.w0(th6);
                            }
                            v6.f(listW5);
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
                                listW6 = Y4.D.D(null);
                            } catch (Throwable th7) {
                                listW6 = p003a.a.w0(th7);
                            }
                            v6.f(listW6);
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
                                listW7 = Y4.D.D(null);
                            } catch (Throwable th8) {
                                listW7 = p003a.a.w0(th8);
                            }
                            v6.f(listW7);
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
                                listW8 = Y4.D.D(null);
                            } catch (Throwable th9) {
                                listW8 = p003a.a.w0(th9);
                            }
                            v6.f(listW8);
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
                                listW9 = Y4.D.D(null);
                            } catch (Throwable th10) {
                                listW9 = p003a.a.w0(th10);
                            }
                            v6.f(listW9);
                            break;
                        case 10:
                            C0413i c0413i12 = c0413i;
                            t6.h.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj21 = ((List) obj2).get(0);
                            t6.h.c(obj21, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView10 = (WebView) obj21;
                            try {
                                c0413i12.getClass();
                                listW10 = Y4.D.D(webView10.getUrl());
                            } catch (Throwable th11) {
                                listW10 = p003a.a.w0(th11);
                            }
                            v6.f(listW10);
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
                                listW11 = Y4.D.D(null);
                            } catch (Throwable th12) {
                                listW11 = p003a.a.w0(th12);
                            }
                            v6.f(listW11);
                            break;
                        case 12:
                            C0413i c0413i14 = c0413i;
                            t6.h.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj23 = ((List) obj2).get(0);
                            t6.h.c(obj23, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView12 = (WebView) obj23;
                            try {
                                c0413i14.getClass();
                                listW12 = Y4.D.D(Boolean.valueOf(webView12.canGoBack()));
                            } catch (Throwable th13) {
                                listW12 = p003a.a.w0(th13);
                            }
                            v6.f(listW12);
                            break;
                        case 13:
                            C0413i c0413i15 = c0413i;
                            t6.h.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj24 = ((List) obj2).get(0);
                            t6.h.c(obj24, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView13 = (WebView) obj24;
                            try {
                                c0413i15.getClass();
                                listW13 = Y4.D.D(Boolean.valueOf(webView13.canGoForward()));
                            } catch (Throwable th14) {
                                listW13 = p003a.a.w0(th14);
                            }
                            v6.f(listW13);
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
                                listW14 = Y4.D.D(null);
                            } catch (Throwable th15) {
                                listW14 = p003a.a.w0(th15);
                            }
                            v6.f(listW14);
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
                                listW15 = Y4.D.D(null);
                            } catch (Throwable th16) {
                                listW15 = p003a.a.w0(th16);
                            }
                            v6.f(listW15);
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
                            boolean zBooleanValue = ((Boolean) obj28).booleanValue();
                            try {
                                c0413i18.getClass();
                                webView16.clearCache(zBooleanValue);
                                listW16 = Y4.D.D(null);
                            } catch (Throwable th17) {
                                listW16 = p003a.a.w0(th17);
                            }
                            v6.f(listW16);
                            break;
                        case 17:
                            t6.h.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list10 = (List) obj2;
                            Object obj29 = list10.get(0);
                            t6.h.c(obj29, "null cannot be cast to non-null type android.webkit.WebView");
                            Object obj30 = list10.get(1);
                            t6.h.c(obj30, "null cannot be cast to non-null type kotlin.String");
                            B b7 = new B(v6, 1);
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
                                listW17 = Y4.D.D(webView17.getTitle());
                            } catch (Throwable th18) {
                                listW17 = p003a.a.w0(th18);
                            }
                            v6.f(listW17);
                            break;
                        case 19:
                            C0413i c0413i20 = c0413i;
                            t6.h.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj32 = ((List) obj2).get(0);
                            t6.h.c(obj32, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean zBooleanValue2 = ((Boolean) obj32).booleanValue();
                            try {
                                c0413i20.getClass();
                                WebView.setWebContentsDebuggingEnabled(zBooleanValue2);
                                listW18 = Y4.D.D(null);
                            } catch (Throwable th19) {
                                listW18 = p003a.a.w0(th19);
                            }
                            v6.f(listW18);
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
                                listW19 = Y4.D.D(null);
                            } catch (Throwable th20) {
                                listW19 = p003a.a.w0(th20);
                            }
                            v6.f(listW19);
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
                                listW20 = Y4.D.D(null);
                            } catch (Throwable th21) {
                                listW20 = p003a.a.w0(th21);
                            }
                            v6.f(listW20);
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
                                listW21 = Y4.D.D(null);
                            } catch (Throwable th22) {
                                listW21 = p003a.a.w0(th22);
                            }
                            v6.f(listW21);
                            break;
                    }
                }
            });
        } else {
            f20.M(null);
        }
        p155w1.F0 f21 = new p155w1.F0(fVar, "dev.flutter.pigeon.webview_flutter_android.WebView.getTitle", c0406b, obj, 1);
        if (c0413i != null) {
            final int i21 = 18;
            f21.M(new A5.b() { // from class: R5.N
                @Override // A5.b
                public final void i(Object obj2, V0 v6) {
                    List listW0;
                    List listW1;
                    List listW2;
                    List listW3;
                    List listW4;
                    List listW5;
                    List listW6;
                    List listW7;
                    List listW8;
                    List listW9;
                    List listW10;
                    List listW11;
                    List listW12;
                    List listW13;
                    List listW14;
                    List listW15;
                    List listW16;
                    List listW17;
                    List listW18;
                    List listW19;
                    List listW20;
                    List listW21;
                    switch (i21) {
                        case 0:
                            C0413i c0413i2 = c0413i;
                            t6.h.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj3 = ((List) obj2).get(0);
                            t6.h.c(obj3, "null cannot be cast to non-null type kotlin.Long");
                            try {
                                ((C0407c) c0413i2.f6174a.f3679c).a(((Long) obj3).longValue(), c0413i2.a());
                                listW0 = Y4.D.D(null);
                            } catch (Throwable th) {
                                listW0 = p003a.a.w0(th);
                            }
                            v6.f(listW0);
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
                                listW1 = Y4.D.D(null);
                            } catch (Throwable th2) {
                                listW1 = p003a.a.w0(th2);
                            }
                            v6.f(listW1);
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
                                listW2 = Y4.D.D(null);
                            } catch (Throwable th3) {
                                listW2 = p003a.a.w0(th3);
                            }
                            v6.f(listW2);
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
                                listW3 = Y4.D.D(null);
                            } catch (Throwable th4) {
                                listW3 = p003a.a.w0(th4);
                            }
                            v6.f(listW3);
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
                            long jLongValue = ((Long) obj9).longValue();
                            try {
                                c0413i6.getClass();
                                webView4.setBackgroundColor((int) jLongValue);
                                listW4 = Y4.D.D(null);
                            } catch (Throwable th5) {
                                listW4 = p003a.a.w0(th5);
                            }
                            v6.f(listW4);
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
                                listW5 = Y4.D.D(null);
                            } catch (Throwable th6) {
                                listW5 = p003a.a.w0(th6);
                            }
                            v6.f(listW5);
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
                                listW6 = Y4.D.D(null);
                            } catch (Throwable th7) {
                                listW6 = p003a.a.w0(th7);
                            }
                            v6.f(listW6);
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
                                listW7 = Y4.D.D(null);
                            } catch (Throwable th8) {
                                listW7 = p003a.a.w0(th8);
                            }
                            v6.f(listW7);
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
                                listW8 = Y4.D.D(null);
                            } catch (Throwable th9) {
                                listW8 = p003a.a.w0(th9);
                            }
                            v6.f(listW8);
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
                                listW9 = Y4.D.D(null);
                            } catch (Throwable th10) {
                                listW9 = p003a.a.w0(th10);
                            }
                            v6.f(listW9);
                            break;
                        case 10:
                            C0413i c0413i12 = c0413i;
                            t6.h.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj21 = ((List) obj2).get(0);
                            t6.h.c(obj21, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView10 = (WebView) obj21;
                            try {
                                c0413i12.getClass();
                                listW10 = Y4.D.D(webView10.getUrl());
                            } catch (Throwable th11) {
                                listW10 = p003a.a.w0(th11);
                            }
                            v6.f(listW10);
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
                                listW11 = Y4.D.D(null);
                            } catch (Throwable th12) {
                                listW11 = p003a.a.w0(th12);
                            }
                            v6.f(listW11);
                            break;
                        case 12:
                            C0413i c0413i14 = c0413i;
                            t6.h.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj23 = ((List) obj2).get(0);
                            t6.h.c(obj23, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView12 = (WebView) obj23;
                            try {
                                c0413i14.getClass();
                                listW12 = Y4.D.D(Boolean.valueOf(webView12.canGoBack()));
                            } catch (Throwable th13) {
                                listW12 = p003a.a.w0(th13);
                            }
                            v6.f(listW12);
                            break;
                        case 13:
                            C0413i c0413i15 = c0413i;
                            t6.h.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj24 = ((List) obj2).get(0);
                            t6.h.c(obj24, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView13 = (WebView) obj24;
                            try {
                                c0413i15.getClass();
                                listW13 = Y4.D.D(Boolean.valueOf(webView13.canGoForward()));
                            } catch (Throwable th14) {
                                listW13 = p003a.a.w0(th14);
                            }
                            v6.f(listW13);
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
                                listW14 = Y4.D.D(null);
                            } catch (Throwable th15) {
                                listW14 = p003a.a.w0(th15);
                            }
                            v6.f(listW14);
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
                                listW15 = Y4.D.D(null);
                            } catch (Throwable th16) {
                                listW15 = p003a.a.w0(th16);
                            }
                            v6.f(listW15);
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
                            boolean zBooleanValue = ((Boolean) obj28).booleanValue();
                            try {
                                c0413i18.getClass();
                                webView16.clearCache(zBooleanValue);
                                listW16 = Y4.D.D(null);
                            } catch (Throwable th17) {
                                listW16 = p003a.a.w0(th17);
                            }
                            v6.f(listW16);
                            break;
                        case 17:
                            t6.h.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list10 = (List) obj2;
                            Object obj29 = list10.get(0);
                            t6.h.c(obj29, "null cannot be cast to non-null type android.webkit.WebView");
                            Object obj30 = list10.get(1);
                            t6.h.c(obj30, "null cannot be cast to non-null type kotlin.String");
                            B b7 = new B(v6, 1);
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
                                listW17 = Y4.D.D(webView17.getTitle());
                            } catch (Throwable th18) {
                                listW17 = p003a.a.w0(th18);
                            }
                            v6.f(listW17);
                            break;
                        case 19:
                            C0413i c0413i20 = c0413i;
                            t6.h.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj32 = ((List) obj2).get(0);
                            t6.h.c(obj32, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean zBooleanValue2 = ((Boolean) obj32).booleanValue();
                            try {
                                c0413i20.getClass();
                                WebView.setWebContentsDebuggingEnabled(zBooleanValue2);
                                listW18 = Y4.D.D(null);
                            } catch (Throwable th19) {
                                listW18 = p003a.a.w0(th19);
                            }
                            v6.f(listW18);
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
                                listW19 = Y4.D.D(null);
                            } catch (Throwable th20) {
                                listW19 = p003a.a.w0(th20);
                            }
                            v6.f(listW19);
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
                                listW20 = Y4.D.D(null);
                            } catch (Throwable th21) {
                                listW20 = p003a.a.w0(th21);
                            }
                            v6.f(listW20);
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
                                listW21 = Y4.D.D(null);
                            } catch (Throwable th22) {
                                listW21 = p003a.a.w0(th22);
                            }
                            v6.f(listW21);
                            break;
                    }
                }
            });
        } else {
            f21.M(null);
        }
        p155w1.F0 f22 = new p155w1.F0(fVar, "dev.flutter.pigeon.webview_flutter_android.WebView.setWebContentsDebuggingEnabled", c0406b, obj, 1);
        if (c0413i != null) {
            final int i22 = 19;
            f22.M(new A5.b() { // from class: R5.N
                @Override // A5.b
                public final void i(Object obj2, V0 v6) {
                    List listW0;
                    List listW1;
                    List listW2;
                    List listW3;
                    List listW4;
                    List listW5;
                    List listW6;
                    List listW7;
                    List listW8;
                    List listW9;
                    List listW10;
                    List listW11;
                    List listW12;
                    List listW13;
                    List listW14;
                    List listW15;
                    List listW16;
                    List listW17;
                    List listW18;
                    List listW19;
                    List listW20;
                    List listW21;
                    switch (i22) {
                        case 0:
                            C0413i c0413i2 = c0413i;
                            t6.h.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj3 = ((List) obj2).get(0);
                            t6.h.c(obj3, "null cannot be cast to non-null type kotlin.Long");
                            try {
                                ((C0407c) c0413i2.f6174a.f3679c).a(((Long) obj3).longValue(), c0413i2.a());
                                listW0 = Y4.D.D(null);
                            } catch (Throwable th) {
                                listW0 = p003a.a.w0(th);
                            }
                            v6.f(listW0);
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
                                listW1 = Y4.D.D(null);
                            } catch (Throwable th2) {
                                listW1 = p003a.a.w0(th2);
                            }
                            v6.f(listW1);
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
                                listW2 = Y4.D.D(null);
                            } catch (Throwable th3) {
                                listW2 = p003a.a.w0(th3);
                            }
                            v6.f(listW2);
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
                                listW3 = Y4.D.D(null);
                            } catch (Throwable th4) {
                                listW3 = p003a.a.w0(th4);
                            }
                            v6.f(listW3);
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
                            long jLongValue = ((Long) obj9).longValue();
                            try {
                                c0413i6.getClass();
                                webView4.setBackgroundColor((int) jLongValue);
                                listW4 = Y4.D.D(null);
                            } catch (Throwable th5) {
                                listW4 = p003a.a.w0(th5);
                            }
                            v6.f(listW4);
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
                                listW5 = Y4.D.D(null);
                            } catch (Throwable th6) {
                                listW5 = p003a.a.w0(th6);
                            }
                            v6.f(listW5);
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
                                listW6 = Y4.D.D(null);
                            } catch (Throwable th7) {
                                listW6 = p003a.a.w0(th7);
                            }
                            v6.f(listW6);
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
                                listW7 = Y4.D.D(null);
                            } catch (Throwable th8) {
                                listW7 = p003a.a.w0(th8);
                            }
                            v6.f(listW7);
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
                                listW8 = Y4.D.D(null);
                            } catch (Throwable th9) {
                                listW8 = p003a.a.w0(th9);
                            }
                            v6.f(listW8);
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
                                listW9 = Y4.D.D(null);
                            } catch (Throwable th10) {
                                listW9 = p003a.a.w0(th10);
                            }
                            v6.f(listW9);
                            break;
                        case 10:
                            C0413i c0413i12 = c0413i;
                            t6.h.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj21 = ((List) obj2).get(0);
                            t6.h.c(obj21, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView10 = (WebView) obj21;
                            try {
                                c0413i12.getClass();
                                listW10 = Y4.D.D(webView10.getUrl());
                            } catch (Throwable th11) {
                                listW10 = p003a.a.w0(th11);
                            }
                            v6.f(listW10);
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
                                listW11 = Y4.D.D(null);
                            } catch (Throwable th12) {
                                listW11 = p003a.a.w0(th12);
                            }
                            v6.f(listW11);
                            break;
                        case 12:
                            C0413i c0413i14 = c0413i;
                            t6.h.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj23 = ((List) obj2).get(0);
                            t6.h.c(obj23, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView12 = (WebView) obj23;
                            try {
                                c0413i14.getClass();
                                listW12 = Y4.D.D(Boolean.valueOf(webView12.canGoBack()));
                            } catch (Throwable th13) {
                                listW12 = p003a.a.w0(th13);
                            }
                            v6.f(listW12);
                            break;
                        case 13:
                            C0413i c0413i15 = c0413i;
                            t6.h.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj24 = ((List) obj2).get(0);
                            t6.h.c(obj24, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView13 = (WebView) obj24;
                            try {
                                c0413i15.getClass();
                                listW13 = Y4.D.D(Boolean.valueOf(webView13.canGoForward()));
                            } catch (Throwable th14) {
                                listW13 = p003a.a.w0(th14);
                            }
                            v6.f(listW13);
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
                                listW14 = Y4.D.D(null);
                            } catch (Throwable th15) {
                                listW14 = p003a.a.w0(th15);
                            }
                            v6.f(listW14);
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
                                listW15 = Y4.D.D(null);
                            } catch (Throwable th16) {
                                listW15 = p003a.a.w0(th16);
                            }
                            v6.f(listW15);
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
                            boolean zBooleanValue = ((Boolean) obj28).booleanValue();
                            try {
                                c0413i18.getClass();
                                webView16.clearCache(zBooleanValue);
                                listW16 = Y4.D.D(null);
                            } catch (Throwable th17) {
                                listW16 = p003a.a.w0(th17);
                            }
                            v6.f(listW16);
                            break;
                        case 17:
                            t6.h.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list10 = (List) obj2;
                            Object obj29 = list10.get(0);
                            t6.h.c(obj29, "null cannot be cast to non-null type android.webkit.WebView");
                            Object obj30 = list10.get(1);
                            t6.h.c(obj30, "null cannot be cast to non-null type kotlin.String");
                            B b7 = new B(v6, 1);
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
                                listW17 = Y4.D.D(webView17.getTitle());
                            } catch (Throwable th18) {
                                listW17 = p003a.a.w0(th18);
                            }
                            v6.f(listW17);
                            break;
                        case 19:
                            C0413i c0413i20 = c0413i;
                            t6.h.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj32 = ((List) obj2).get(0);
                            t6.h.c(obj32, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean zBooleanValue2 = ((Boolean) obj32).booleanValue();
                            try {
                                c0413i20.getClass();
                                WebView.setWebContentsDebuggingEnabled(zBooleanValue2);
                                listW18 = Y4.D.D(null);
                            } catch (Throwable th19) {
                                listW18 = p003a.a.w0(th19);
                            }
                            v6.f(listW18);
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
                                listW19 = Y4.D.D(null);
                            } catch (Throwable th20) {
                                listW19 = p003a.a.w0(th20);
                            }
                            v6.f(listW19);
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
                                listW20 = Y4.D.D(null);
                            } catch (Throwable th21) {
                                listW20 = p003a.a.w0(th21);
                            }
                            v6.f(listW20);
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
                                listW21 = Y4.D.D(null);
                            } catch (Throwable th22) {
                                listW21 = p003a.a.w0(th22);
                            }
                            v6.f(listW21);
                            break;
                    }
                }
            });
        } else {
            f22.M(null);
        }
        p155w1.F0 f23 = new p155w1.F0(fVar, "dev.flutter.pigeon.webview_flutter_android.WebView.setWebViewClient", c0406b, obj, 1);
        if (c0413i != null) {
            final int i23 = 20;
            f23.M(new A5.b() { // from class: R5.N
                @Override // A5.b
                public final void i(Object obj2, V0 v6) {
                    List listW0;
                    List listW1;
                    List listW2;
                    List listW3;
                    List listW4;
                    List listW5;
                    List listW6;
                    List listW7;
                    List listW8;
                    List listW9;
                    List listW10;
                    List listW11;
                    List listW12;
                    List listW13;
                    List listW14;
                    List listW15;
                    List listW16;
                    List listW17;
                    List listW18;
                    List listW19;
                    List listW20;
                    List listW21;
                    switch (i23) {
                        case 0:
                            C0413i c0413i2 = c0413i;
                            t6.h.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj3 = ((List) obj2).get(0);
                            t6.h.c(obj3, "null cannot be cast to non-null type kotlin.Long");
                            try {
                                ((C0407c) c0413i2.f6174a.f3679c).a(((Long) obj3).longValue(), c0413i2.a());
                                listW0 = Y4.D.D(null);
                            } catch (Throwable th) {
                                listW0 = p003a.a.w0(th);
                            }
                            v6.f(listW0);
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
                                listW1 = Y4.D.D(null);
                            } catch (Throwable th2) {
                                listW1 = p003a.a.w0(th2);
                            }
                            v6.f(listW1);
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
                                listW2 = Y4.D.D(null);
                            } catch (Throwable th3) {
                                listW2 = p003a.a.w0(th3);
                            }
                            v6.f(listW2);
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
                                listW3 = Y4.D.D(null);
                            } catch (Throwable th4) {
                                listW3 = p003a.a.w0(th4);
                            }
                            v6.f(listW3);
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
                            long jLongValue = ((Long) obj9).longValue();
                            try {
                                c0413i6.getClass();
                                webView4.setBackgroundColor((int) jLongValue);
                                listW4 = Y4.D.D(null);
                            } catch (Throwable th5) {
                                listW4 = p003a.a.w0(th5);
                            }
                            v6.f(listW4);
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
                                listW5 = Y4.D.D(null);
                            } catch (Throwable th6) {
                                listW5 = p003a.a.w0(th6);
                            }
                            v6.f(listW5);
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
                                listW6 = Y4.D.D(null);
                            } catch (Throwable th7) {
                                listW6 = p003a.a.w0(th7);
                            }
                            v6.f(listW6);
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
                                listW7 = Y4.D.D(null);
                            } catch (Throwable th8) {
                                listW7 = p003a.a.w0(th8);
                            }
                            v6.f(listW7);
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
                                listW8 = Y4.D.D(null);
                            } catch (Throwable th9) {
                                listW8 = p003a.a.w0(th9);
                            }
                            v6.f(listW8);
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
                                listW9 = Y4.D.D(null);
                            } catch (Throwable th10) {
                                listW9 = p003a.a.w0(th10);
                            }
                            v6.f(listW9);
                            break;
                        case 10:
                            C0413i c0413i12 = c0413i;
                            t6.h.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj21 = ((List) obj2).get(0);
                            t6.h.c(obj21, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView10 = (WebView) obj21;
                            try {
                                c0413i12.getClass();
                                listW10 = Y4.D.D(webView10.getUrl());
                            } catch (Throwable th11) {
                                listW10 = p003a.a.w0(th11);
                            }
                            v6.f(listW10);
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
                                listW11 = Y4.D.D(null);
                            } catch (Throwable th12) {
                                listW11 = p003a.a.w0(th12);
                            }
                            v6.f(listW11);
                            break;
                        case 12:
                            C0413i c0413i14 = c0413i;
                            t6.h.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj23 = ((List) obj2).get(0);
                            t6.h.c(obj23, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView12 = (WebView) obj23;
                            try {
                                c0413i14.getClass();
                                listW12 = Y4.D.D(Boolean.valueOf(webView12.canGoBack()));
                            } catch (Throwable th13) {
                                listW12 = p003a.a.w0(th13);
                            }
                            v6.f(listW12);
                            break;
                        case 13:
                            C0413i c0413i15 = c0413i;
                            t6.h.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj24 = ((List) obj2).get(0);
                            t6.h.c(obj24, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView13 = (WebView) obj24;
                            try {
                                c0413i15.getClass();
                                listW13 = Y4.D.D(Boolean.valueOf(webView13.canGoForward()));
                            } catch (Throwable th14) {
                                listW13 = p003a.a.w0(th14);
                            }
                            v6.f(listW13);
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
                                listW14 = Y4.D.D(null);
                            } catch (Throwable th15) {
                                listW14 = p003a.a.w0(th15);
                            }
                            v6.f(listW14);
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
                                listW15 = Y4.D.D(null);
                            } catch (Throwable th16) {
                                listW15 = p003a.a.w0(th16);
                            }
                            v6.f(listW15);
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
                            boolean zBooleanValue = ((Boolean) obj28).booleanValue();
                            try {
                                c0413i18.getClass();
                                webView16.clearCache(zBooleanValue);
                                listW16 = Y4.D.D(null);
                            } catch (Throwable th17) {
                                listW16 = p003a.a.w0(th17);
                            }
                            v6.f(listW16);
                            break;
                        case 17:
                            t6.h.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list10 = (List) obj2;
                            Object obj29 = list10.get(0);
                            t6.h.c(obj29, "null cannot be cast to non-null type android.webkit.WebView");
                            Object obj30 = list10.get(1);
                            t6.h.c(obj30, "null cannot be cast to non-null type kotlin.String");
                            B b7 = new B(v6, 1);
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
                                listW17 = Y4.D.D(webView17.getTitle());
                            } catch (Throwable th18) {
                                listW17 = p003a.a.w0(th18);
                            }
                            v6.f(listW17);
                            break;
                        case 19:
                            C0413i c0413i20 = c0413i;
                            t6.h.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj32 = ((List) obj2).get(0);
                            t6.h.c(obj32, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean zBooleanValue2 = ((Boolean) obj32).booleanValue();
                            try {
                                c0413i20.getClass();
                                WebView.setWebContentsDebuggingEnabled(zBooleanValue2);
                                listW18 = Y4.D.D(null);
                            } catch (Throwable th19) {
                                listW18 = p003a.a.w0(th19);
                            }
                            v6.f(listW18);
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
                                listW19 = Y4.D.D(null);
                            } catch (Throwable th20) {
                                listW19 = p003a.a.w0(th20);
                            }
                            v6.f(listW19);
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
                                listW20 = Y4.D.D(null);
                            } catch (Throwable th21) {
                                listW20 = p003a.a.w0(th21);
                            }
                            v6.f(listW20);
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
                                listW21 = Y4.D.D(null);
                            } catch (Throwable th22) {
                                listW21 = p003a.a.w0(th22);
                            }
                            v6.f(listW21);
                            break;
                    }
                }
            });
        } else {
            f23.M(null);
        }
        p155w1.F0 f24 = new p155w1.F0(fVar, "dev.flutter.pigeon.webview_flutter_android.WebView.addJavaScriptChannel", c0406b, obj, 1);
        if (c0413i != null) {
            final int i24 = 21;
            f24.M(new A5.b() { // from class: R5.N
                @Override // A5.b
                public final void i(Object obj2, V0 v6) {
                    List listW0;
                    List listW1;
                    List listW2;
                    List listW3;
                    List listW4;
                    List listW5;
                    List listW6;
                    List listW7;
                    List listW8;
                    List listW9;
                    List listW10;
                    List listW11;
                    List listW12;
                    List listW13;
                    List listW14;
                    List listW15;
                    List listW16;
                    List listW17;
                    List listW18;
                    List listW19;
                    List listW20;
                    List listW21;
                    switch (i24) {
                        case 0:
                            C0413i c0413i2 = c0413i;
                            t6.h.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj3 = ((List) obj2).get(0);
                            t6.h.c(obj3, "null cannot be cast to non-null type kotlin.Long");
                            try {
                                ((C0407c) c0413i2.f6174a.f3679c).a(((Long) obj3).longValue(), c0413i2.a());
                                listW0 = Y4.D.D(null);
                            } catch (Throwable th) {
                                listW0 = p003a.a.w0(th);
                            }
                            v6.f(listW0);
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
                                listW1 = Y4.D.D(null);
                            } catch (Throwable th2) {
                                listW1 = p003a.a.w0(th2);
                            }
                            v6.f(listW1);
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
                                listW2 = Y4.D.D(null);
                            } catch (Throwable th3) {
                                listW2 = p003a.a.w0(th3);
                            }
                            v6.f(listW2);
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
                                listW3 = Y4.D.D(null);
                            } catch (Throwable th4) {
                                listW3 = p003a.a.w0(th4);
                            }
                            v6.f(listW3);
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
                            long jLongValue = ((Long) obj9).longValue();
                            try {
                                c0413i6.getClass();
                                webView4.setBackgroundColor((int) jLongValue);
                                listW4 = Y4.D.D(null);
                            } catch (Throwable th5) {
                                listW4 = p003a.a.w0(th5);
                            }
                            v6.f(listW4);
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
                                listW5 = Y4.D.D(null);
                            } catch (Throwable th6) {
                                listW5 = p003a.a.w0(th6);
                            }
                            v6.f(listW5);
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
                                listW6 = Y4.D.D(null);
                            } catch (Throwable th7) {
                                listW6 = p003a.a.w0(th7);
                            }
                            v6.f(listW6);
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
                                listW7 = Y4.D.D(null);
                            } catch (Throwable th8) {
                                listW7 = p003a.a.w0(th8);
                            }
                            v6.f(listW7);
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
                                listW8 = Y4.D.D(null);
                            } catch (Throwable th9) {
                                listW8 = p003a.a.w0(th9);
                            }
                            v6.f(listW8);
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
                                listW9 = Y4.D.D(null);
                            } catch (Throwable th10) {
                                listW9 = p003a.a.w0(th10);
                            }
                            v6.f(listW9);
                            break;
                        case 10:
                            C0413i c0413i12 = c0413i;
                            t6.h.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj21 = ((List) obj2).get(0);
                            t6.h.c(obj21, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView10 = (WebView) obj21;
                            try {
                                c0413i12.getClass();
                                listW10 = Y4.D.D(webView10.getUrl());
                            } catch (Throwable th11) {
                                listW10 = p003a.a.w0(th11);
                            }
                            v6.f(listW10);
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
                                listW11 = Y4.D.D(null);
                            } catch (Throwable th12) {
                                listW11 = p003a.a.w0(th12);
                            }
                            v6.f(listW11);
                            break;
                        case 12:
                            C0413i c0413i14 = c0413i;
                            t6.h.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj23 = ((List) obj2).get(0);
                            t6.h.c(obj23, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView12 = (WebView) obj23;
                            try {
                                c0413i14.getClass();
                                listW12 = Y4.D.D(Boolean.valueOf(webView12.canGoBack()));
                            } catch (Throwable th13) {
                                listW12 = p003a.a.w0(th13);
                            }
                            v6.f(listW12);
                            break;
                        case 13:
                            C0413i c0413i15 = c0413i;
                            t6.h.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj24 = ((List) obj2).get(0);
                            t6.h.c(obj24, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView13 = (WebView) obj24;
                            try {
                                c0413i15.getClass();
                                listW13 = Y4.D.D(Boolean.valueOf(webView13.canGoForward()));
                            } catch (Throwable th14) {
                                listW13 = p003a.a.w0(th14);
                            }
                            v6.f(listW13);
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
                                listW14 = Y4.D.D(null);
                            } catch (Throwable th15) {
                                listW14 = p003a.a.w0(th15);
                            }
                            v6.f(listW14);
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
                                listW15 = Y4.D.D(null);
                            } catch (Throwable th16) {
                                listW15 = p003a.a.w0(th16);
                            }
                            v6.f(listW15);
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
                            boolean zBooleanValue = ((Boolean) obj28).booleanValue();
                            try {
                                c0413i18.getClass();
                                webView16.clearCache(zBooleanValue);
                                listW16 = Y4.D.D(null);
                            } catch (Throwable th17) {
                                listW16 = p003a.a.w0(th17);
                            }
                            v6.f(listW16);
                            break;
                        case 17:
                            t6.h.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list10 = (List) obj2;
                            Object obj29 = list10.get(0);
                            t6.h.c(obj29, "null cannot be cast to non-null type android.webkit.WebView");
                            Object obj30 = list10.get(1);
                            t6.h.c(obj30, "null cannot be cast to non-null type kotlin.String");
                            B b7 = new B(v6, 1);
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
                                listW17 = Y4.D.D(webView17.getTitle());
                            } catch (Throwable th18) {
                                listW17 = p003a.a.w0(th18);
                            }
                            v6.f(listW17);
                            break;
                        case 19:
                            C0413i c0413i20 = c0413i;
                            t6.h.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj32 = ((List) obj2).get(0);
                            t6.h.c(obj32, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean zBooleanValue2 = ((Boolean) obj32).booleanValue();
                            try {
                                c0413i20.getClass();
                                WebView.setWebContentsDebuggingEnabled(zBooleanValue2);
                                listW18 = Y4.D.D(null);
                            } catch (Throwable th19) {
                                listW18 = p003a.a.w0(th19);
                            }
                            v6.f(listW18);
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
                                listW19 = Y4.D.D(null);
                            } catch (Throwable th20) {
                                listW19 = p003a.a.w0(th20);
                            }
                            v6.f(listW19);
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
                                listW20 = Y4.D.D(null);
                            } catch (Throwable th21) {
                                listW20 = p003a.a.w0(th21);
                            }
                            v6.f(listW20);
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
                                listW21 = Y4.D.D(null);
                            } catch (Throwable th22) {
                                listW21 = p003a.a.w0(th22);
                            }
                            v6.f(listW21);
                            break;
                    }
                }
            });
        } else {
            f24.M(null);
        }
        p155w1.F0 f25 = new p155w1.F0(fVar, "dev.flutter.pigeon.webview_flutter_android.WebView.removeJavaScriptChannel", c0406b, obj, 1);
        if (c0413i != null) {
            final int i25 = 22;
            f25.M(new A5.b() { // from class: R5.N
                @Override // A5.b
                public final void i(Object obj2, V0 v6) {
                    List listW0;
                    List listW1;
                    List listW2;
                    List listW3;
                    List listW4;
                    List listW5;
                    List listW6;
                    List listW7;
                    List listW8;
                    List listW9;
                    List listW10;
                    List listW11;
                    List listW12;
                    List listW13;
                    List listW14;
                    List listW15;
                    List listW16;
                    List listW17;
                    List listW18;
                    List listW19;
                    List listW20;
                    List listW21;
                    switch (i25) {
                        case 0:
                            C0413i c0413i2 = c0413i;
                            t6.h.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj3 = ((List) obj2).get(0);
                            t6.h.c(obj3, "null cannot be cast to non-null type kotlin.Long");
                            try {
                                ((C0407c) c0413i2.f6174a.f3679c).a(((Long) obj3).longValue(), c0413i2.a());
                                listW0 = Y4.D.D(null);
                            } catch (Throwable th) {
                                listW0 = p003a.a.w0(th);
                            }
                            v6.f(listW0);
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
                                listW1 = Y4.D.D(null);
                            } catch (Throwable th2) {
                                listW1 = p003a.a.w0(th2);
                            }
                            v6.f(listW1);
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
                                listW2 = Y4.D.D(null);
                            } catch (Throwable th3) {
                                listW2 = p003a.a.w0(th3);
                            }
                            v6.f(listW2);
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
                                listW3 = Y4.D.D(null);
                            } catch (Throwable th4) {
                                listW3 = p003a.a.w0(th4);
                            }
                            v6.f(listW3);
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
                            long jLongValue = ((Long) obj9).longValue();
                            try {
                                c0413i6.getClass();
                                webView4.setBackgroundColor((int) jLongValue);
                                listW4 = Y4.D.D(null);
                            } catch (Throwable th5) {
                                listW4 = p003a.a.w0(th5);
                            }
                            v6.f(listW4);
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
                                listW5 = Y4.D.D(null);
                            } catch (Throwable th6) {
                                listW5 = p003a.a.w0(th6);
                            }
                            v6.f(listW5);
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
                                listW6 = Y4.D.D(null);
                            } catch (Throwable th7) {
                                listW6 = p003a.a.w0(th7);
                            }
                            v6.f(listW6);
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
                                listW7 = Y4.D.D(null);
                            } catch (Throwable th8) {
                                listW7 = p003a.a.w0(th8);
                            }
                            v6.f(listW7);
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
                                listW8 = Y4.D.D(null);
                            } catch (Throwable th9) {
                                listW8 = p003a.a.w0(th9);
                            }
                            v6.f(listW8);
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
                                listW9 = Y4.D.D(null);
                            } catch (Throwable th10) {
                                listW9 = p003a.a.w0(th10);
                            }
                            v6.f(listW9);
                            break;
                        case 10:
                            C0413i c0413i12 = c0413i;
                            t6.h.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj21 = ((List) obj2).get(0);
                            t6.h.c(obj21, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView10 = (WebView) obj21;
                            try {
                                c0413i12.getClass();
                                listW10 = Y4.D.D(webView10.getUrl());
                            } catch (Throwable th11) {
                                listW10 = p003a.a.w0(th11);
                            }
                            v6.f(listW10);
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
                                listW11 = Y4.D.D(null);
                            } catch (Throwable th12) {
                                listW11 = p003a.a.w0(th12);
                            }
                            v6.f(listW11);
                            break;
                        case 12:
                            C0413i c0413i14 = c0413i;
                            t6.h.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj23 = ((List) obj2).get(0);
                            t6.h.c(obj23, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView12 = (WebView) obj23;
                            try {
                                c0413i14.getClass();
                                listW12 = Y4.D.D(Boolean.valueOf(webView12.canGoBack()));
                            } catch (Throwable th13) {
                                listW12 = p003a.a.w0(th13);
                            }
                            v6.f(listW12);
                            break;
                        case 13:
                            C0413i c0413i15 = c0413i;
                            t6.h.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj24 = ((List) obj2).get(0);
                            t6.h.c(obj24, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView13 = (WebView) obj24;
                            try {
                                c0413i15.getClass();
                                listW13 = Y4.D.D(Boolean.valueOf(webView13.canGoForward()));
                            } catch (Throwable th14) {
                                listW13 = p003a.a.w0(th14);
                            }
                            v6.f(listW13);
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
                                listW14 = Y4.D.D(null);
                            } catch (Throwable th15) {
                                listW14 = p003a.a.w0(th15);
                            }
                            v6.f(listW14);
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
                                listW15 = Y4.D.D(null);
                            } catch (Throwable th16) {
                                listW15 = p003a.a.w0(th16);
                            }
                            v6.f(listW15);
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
                            boolean zBooleanValue = ((Boolean) obj28).booleanValue();
                            try {
                                c0413i18.getClass();
                                webView16.clearCache(zBooleanValue);
                                listW16 = Y4.D.D(null);
                            } catch (Throwable th17) {
                                listW16 = p003a.a.w0(th17);
                            }
                            v6.f(listW16);
                            break;
                        case 17:
                            t6.h.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list10 = (List) obj2;
                            Object obj29 = list10.get(0);
                            t6.h.c(obj29, "null cannot be cast to non-null type android.webkit.WebView");
                            Object obj30 = list10.get(1);
                            t6.h.c(obj30, "null cannot be cast to non-null type kotlin.String");
                            B b7 = new B(v6, 1);
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
                                listW17 = Y4.D.D(webView17.getTitle());
                            } catch (Throwable th18) {
                                listW17 = p003a.a.w0(th18);
                            }
                            v6.f(listW17);
                            break;
                        case 19:
                            C0413i c0413i20 = c0413i;
                            t6.h.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj32 = ((List) obj2).get(0);
                            t6.h.c(obj32, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean zBooleanValue2 = ((Boolean) obj32).booleanValue();
                            try {
                                c0413i20.getClass();
                                WebView.setWebContentsDebuggingEnabled(zBooleanValue2);
                                listW18 = Y4.D.D(null);
                            } catch (Throwable th19) {
                                listW18 = p003a.a.w0(th19);
                            }
                            v6.f(listW18);
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
                                listW19 = Y4.D.D(null);
                            } catch (Throwable th20) {
                                listW19 = p003a.a.w0(th20);
                            }
                            v6.f(listW19);
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
                                listW20 = Y4.D.D(null);
                            } catch (Throwable th21) {
                                listW20 = p003a.a.w0(th21);
                            }
                            v6.f(listW20);
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
                                listW21 = Y4.D.D(null);
                            } catch (Throwable th22) {
                                listW21 = p003a.a.w0(th22);
                            }
                            v6.f(listW21);
                            break;
                    }
                }
            });
        } else {
            f25.M(null);
        }
        p155w1.F0 f26 = new p155w1.F0(fVar, "dev.flutter.pigeon.webview_flutter_android.WebView.setDownloadListener", c0406b, obj, 1);
        if (c0413i != null) {
            final int i26 = 1;
            f26.M(new A5.b() { // from class: R5.N
                @Override // A5.b
                public final void i(Object obj2, V0 v6) {
                    List listW0;
                    List listW1;
                    List listW2;
                    List listW3;
                    List listW4;
                    List listW5;
                    List listW6;
                    List listW7;
                    List listW8;
                    List listW9;
                    List listW10;
                    List listW11;
                    List listW12;
                    List listW13;
                    List listW14;
                    List listW15;
                    List listW16;
                    List listW17;
                    List listW18;
                    List listW19;
                    List listW20;
                    List listW21;
                    switch (i26) {
                        case 0:
                            C0413i c0413i2 = c0413i;
                            t6.h.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj3 = ((List) obj2).get(0);
                            t6.h.c(obj3, "null cannot be cast to non-null type kotlin.Long");
                            try {
                                ((C0407c) c0413i2.f6174a.f3679c).a(((Long) obj3).longValue(), c0413i2.a());
                                listW0 = Y4.D.D(null);
                            } catch (Throwable th) {
                                listW0 = p003a.a.w0(th);
                            }
                            v6.f(listW0);
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
                                listW1 = Y4.D.D(null);
                            } catch (Throwable th2) {
                                listW1 = p003a.a.w0(th2);
                            }
                            v6.f(listW1);
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
                                listW2 = Y4.D.D(null);
                            } catch (Throwable th3) {
                                listW2 = p003a.a.w0(th3);
                            }
                            v6.f(listW2);
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
                                listW3 = Y4.D.D(null);
                            } catch (Throwable th4) {
                                listW3 = p003a.a.w0(th4);
                            }
                            v6.f(listW3);
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
                            long jLongValue = ((Long) obj9).longValue();
                            try {
                                c0413i6.getClass();
                                webView4.setBackgroundColor((int) jLongValue);
                                listW4 = Y4.D.D(null);
                            } catch (Throwable th5) {
                                listW4 = p003a.a.w0(th5);
                            }
                            v6.f(listW4);
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
                                listW5 = Y4.D.D(null);
                            } catch (Throwable th6) {
                                listW5 = p003a.a.w0(th6);
                            }
                            v6.f(listW5);
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
                                listW6 = Y4.D.D(null);
                            } catch (Throwable th7) {
                                listW6 = p003a.a.w0(th7);
                            }
                            v6.f(listW6);
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
                                listW7 = Y4.D.D(null);
                            } catch (Throwable th8) {
                                listW7 = p003a.a.w0(th8);
                            }
                            v6.f(listW7);
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
                                listW8 = Y4.D.D(null);
                            } catch (Throwable th9) {
                                listW8 = p003a.a.w0(th9);
                            }
                            v6.f(listW8);
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
                                listW9 = Y4.D.D(null);
                            } catch (Throwable th10) {
                                listW9 = p003a.a.w0(th10);
                            }
                            v6.f(listW9);
                            break;
                        case 10:
                            C0413i c0413i12 = c0413i;
                            t6.h.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj21 = ((List) obj2).get(0);
                            t6.h.c(obj21, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView10 = (WebView) obj21;
                            try {
                                c0413i12.getClass();
                                listW10 = Y4.D.D(webView10.getUrl());
                            } catch (Throwable th11) {
                                listW10 = p003a.a.w0(th11);
                            }
                            v6.f(listW10);
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
                                listW11 = Y4.D.D(null);
                            } catch (Throwable th12) {
                                listW11 = p003a.a.w0(th12);
                            }
                            v6.f(listW11);
                            break;
                        case 12:
                            C0413i c0413i14 = c0413i;
                            t6.h.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj23 = ((List) obj2).get(0);
                            t6.h.c(obj23, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView12 = (WebView) obj23;
                            try {
                                c0413i14.getClass();
                                listW12 = Y4.D.D(Boolean.valueOf(webView12.canGoBack()));
                            } catch (Throwable th13) {
                                listW12 = p003a.a.w0(th13);
                            }
                            v6.f(listW12);
                            break;
                        case 13:
                            C0413i c0413i15 = c0413i;
                            t6.h.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj24 = ((List) obj2).get(0);
                            t6.h.c(obj24, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView13 = (WebView) obj24;
                            try {
                                c0413i15.getClass();
                                listW13 = Y4.D.D(Boolean.valueOf(webView13.canGoForward()));
                            } catch (Throwable th14) {
                                listW13 = p003a.a.w0(th14);
                            }
                            v6.f(listW13);
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
                                listW14 = Y4.D.D(null);
                            } catch (Throwable th15) {
                                listW14 = p003a.a.w0(th15);
                            }
                            v6.f(listW14);
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
                                listW15 = Y4.D.D(null);
                            } catch (Throwable th16) {
                                listW15 = p003a.a.w0(th16);
                            }
                            v6.f(listW15);
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
                            boolean zBooleanValue = ((Boolean) obj28).booleanValue();
                            try {
                                c0413i18.getClass();
                                webView16.clearCache(zBooleanValue);
                                listW16 = Y4.D.D(null);
                            } catch (Throwable th17) {
                                listW16 = p003a.a.w0(th17);
                            }
                            v6.f(listW16);
                            break;
                        case 17:
                            t6.h.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list10 = (List) obj2;
                            Object obj29 = list10.get(0);
                            t6.h.c(obj29, "null cannot be cast to non-null type android.webkit.WebView");
                            Object obj30 = list10.get(1);
                            t6.h.c(obj30, "null cannot be cast to non-null type kotlin.String");
                            B b7 = new B(v6, 1);
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
                                listW17 = Y4.D.D(webView17.getTitle());
                            } catch (Throwable th18) {
                                listW17 = p003a.a.w0(th18);
                            }
                            v6.f(listW17);
                            break;
                        case 19:
                            C0413i c0413i20 = c0413i;
                            t6.h.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj32 = ((List) obj2).get(0);
                            t6.h.c(obj32, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean zBooleanValue2 = ((Boolean) obj32).booleanValue();
                            try {
                                c0413i20.getClass();
                                WebView.setWebContentsDebuggingEnabled(zBooleanValue2);
                                listW18 = Y4.D.D(null);
                            } catch (Throwable th19) {
                                listW18 = p003a.a.w0(th19);
                            }
                            v6.f(listW18);
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
                                listW19 = Y4.D.D(null);
                            } catch (Throwable th20) {
                                listW19 = p003a.a.w0(th20);
                            }
                            v6.f(listW19);
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
                                listW20 = Y4.D.D(null);
                            } catch (Throwable th21) {
                                listW20 = p003a.a.w0(th21);
                            }
                            v6.f(listW20);
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
                                listW21 = Y4.D.D(null);
                            } catch (Throwable th22) {
                                listW21 = p003a.a.w0(th22);
                            }
                            v6.f(listW21);
                            break;
                    }
                }
            });
        } else {
            f26.M(null);
        }
        p155w1.F0 f27 = new p155w1.F0(fVar, "dev.flutter.pigeon.webview_flutter_android.WebView.setWebChromeClient", c0406b, obj, 1);
        if (c0413i != null) {
            final int i27 = 3;
            f27.M(new A5.b() { // from class: R5.N
                @Override // A5.b
                public final void i(Object obj2, V0 v6) {
                    List listW0;
                    List listW1;
                    List listW2;
                    List listW3;
                    List listW4;
                    List listW5;
                    List listW6;
                    List listW7;
                    List listW8;
                    List listW9;
                    List listW10;
                    List listW11;
                    List listW12;
                    List listW13;
                    List listW14;
                    List listW15;
                    List listW16;
                    List listW17;
                    List listW18;
                    List listW19;
                    List listW20;
                    List listW21;
                    switch (i27) {
                        case 0:
                            C0413i c0413i2 = c0413i;
                            t6.h.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj3 = ((List) obj2).get(0);
                            t6.h.c(obj3, "null cannot be cast to non-null type kotlin.Long");
                            try {
                                ((C0407c) c0413i2.f6174a.f3679c).a(((Long) obj3).longValue(), c0413i2.a());
                                listW0 = Y4.D.D(null);
                            } catch (Throwable th) {
                                listW0 = p003a.a.w0(th);
                            }
                            v6.f(listW0);
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
                                listW1 = Y4.D.D(null);
                            } catch (Throwable th2) {
                                listW1 = p003a.a.w0(th2);
                            }
                            v6.f(listW1);
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
                                listW2 = Y4.D.D(null);
                            } catch (Throwable th3) {
                                listW2 = p003a.a.w0(th3);
                            }
                            v6.f(listW2);
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
                                listW3 = Y4.D.D(null);
                            } catch (Throwable th4) {
                                listW3 = p003a.a.w0(th4);
                            }
                            v6.f(listW3);
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
                            long jLongValue = ((Long) obj9).longValue();
                            try {
                                c0413i6.getClass();
                                webView4.setBackgroundColor((int) jLongValue);
                                listW4 = Y4.D.D(null);
                            } catch (Throwable th5) {
                                listW4 = p003a.a.w0(th5);
                            }
                            v6.f(listW4);
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
                                listW5 = Y4.D.D(null);
                            } catch (Throwable th6) {
                                listW5 = p003a.a.w0(th6);
                            }
                            v6.f(listW5);
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
                                listW6 = Y4.D.D(null);
                            } catch (Throwable th7) {
                                listW6 = p003a.a.w0(th7);
                            }
                            v6.f(listW6);
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
                                listW7 = Y4.D.D(null);
                            } catch (Throwable th8) {
                                listW7 = p003a.a.w0(th8);
                            }
                            v6.f(listW7);
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
                                listW8 = Y4.D.D(null);
                            } catch (Throwable th9) {
                                listW8 = p003a.a.w0(th9);
                            }
                            v6.f(listW8);
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
                                listW9 = Y4.D.D(null);
                            } catch (Throwable th10) {
                                listW9 = p003a.a.w0(th10);
                            }
                            v6.f(listW9);
                            break;
                        case 10:
                            C0413i c0413i12 = c0413i;
                            t6.h.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj21 = ((List) obj2).get(0);
                            t6.h.c(obj21, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView10 = (WebView) obj21;
                            try {
                                c0413i12.getClass();
                                listW10 = Y4.D.D(webView10.getUrl());
                            } catch (Throwable th11) {
                                listW10 = p003a.a.w0(th11);
                            }
                            v6.f(listW10);
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
                                listW11 = Y4.D.D(null);
                            } catch (Throwable th12) {
                                listW11 = p003a.a.w0(th12);
                            }
                            v6.f(listW11);
                            break;
                        case 12:
                            C0413i c0413i14 = c0413i;
                            t6.h.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj23 = ((List) obj2).get(0);
                            t6.h.c(obj23, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView12 = (WebView) obj23;
                            try {
                                c0413i14.getClass();
                                listW12 = Y4.D.D(Boolean.valueOf(webView12.canGoBack()));
                            } catch (Throwable th13) {
                                listW12 = p003a.a.w0(th13);
                            }
                            v6.f(listW12);
                            break;
                        case 13:
                            C0413i c0413i15 = c0413i;
                            t6.h.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj24 = ((List) obj2).get(0);
                            t6.h.c(obj24, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView13 = (WebView) obj24;
                            try {
                                c0413i15.getClass();
                                listW13 = Y4.D.D(Boolean.valueOf(webView13.canGoForward()));
                            } catch (Throwable th14) {
                                listW13 = p003a.a.w0(th14);
                            }
                            v6.f(listW13);
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
                                listW14 = Y4.D.D(null);
                            } catch (Throwable th15) {
                                listW14 = p003a.a.w0(th15);
                            }
                            v6.f(listW14);
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
                                listW15 = Y4.D.D(null);
                            } catch (Throwable th16) {
                                listW15 = p003a.a.w0(th16);
                            }
                            v6.f(listW15);
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
                            boolean zBooleanValue = ((Boolean) obj28).booleanValue();
                            try {
                                c0413i18.getClass();
                                webView16.clearCache(zBooleanValue);
                                listW16 = Y4.D.D(null);
                            } catch (Throwable th17) {
                                listW16 = p003a.a.w0(th17);
                            }
                            v6.f(listW16);
                            break;
                        case 17:
                            t6.h.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list10 = (List) obj2;
                            Object obj29 = list10.get(0);
                            t6.h.c(obj29, "null cannot be cast to non-null type android.webkit.WebView");
                            Object obj30 = list10.get(1);
                            t6.h.c(obj30, "null cannot be cast to non-null type kotlin.String");
                            B b7 = new B(v6, 1);
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
                                listW17 = Y4.D.D(webView17.getTitle());
                            } catch (Throwable th18) {
                                listW17 = p003a.a.w0(th18);
                            }
                            v6.f(listW17);
                            break;
                        case 19:
                            C0413i c0413i20 = c0413i;
                            t6.h.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj32 = ((List) obj2).get(0);
                            t6.h.c(obj32, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean zBooleanValue2 = ((Boolean) obj32).booleanValue();
                            try {
                                c0413i20.getClass();
                                WebView.setWebContentsDebuggingEnabled(zBooleanValue2);
                                listW18 = Y4.D.D(null);
                            } catch (Throwable th19) {
                                listW18 = p003a.a.w0(th19);
                            }
                            v6.f(listW18);
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
                                listW19 = Y4.D.D(null);
                            } catch (Throwable th20) {
                                listW19 = p003a.a.w0(th20);
                            }
                            v6.f(listW19);
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
                                listW20 = Y4.D.D(null);
                            } catch (Throwable th21) {
                                listW20 = p003a.a.w0(th21);
                            }
                            v6.f(listW20);
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
                                listW21 = Y4.D.D(null);
                            } catch (Throwable th22) {
                                listW21 = p003a.a.w0(th22);
                            }
                            v6.f(listW21);
                            break;
                    }
                }
            });
        } else {
            f27.M(null);
        }
        p155w1.F0 f28 = new p155w1.F0(fVar, "dev.flutter.pigeon.webview_flutter_android.WebView.setBackgroundColor", c0406b, obj, 1);
        if (c0413i != null) {
            final int i28 = 4;
            f28.M(new A5.b() { // from class: R5.N
                @Override // A5.b
                public final void i(Object obj2, V0 v6) {
                    List listW0;
                    List listW1;
                    List listW2;
                    List listW3;
                    List listW4;
                    List listW5;
                    List listW6;
                    List listW7;
                    List listW8;
                    List listW9;
                    List listW10;
                    List listW11;
                    List listW12;
                    List listW13;
                    List listW14;
                    List listW15;
                    List listW16;
                    List listW17;
                    List listW18;
                    List listW19;
                    List listW20;
                    List listW21;
                    switch (i28) {
                        case 0:
                            C0413i c0413i2 = c0413i;
                            t6.h.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj3 = ((List) obj2).get(0);
                            t6.h.c(obj3, "null cannot be cast to non-null type kotlin.Long");
                            try {
                                ((C0407c) c0413i2.f6174a.f3679c).a(((Long) obj3).longValue(), c0413i2.a());
                                listW0 = Y4.D.D(null);
                            } catch (Throwable th) {
                                listW0 = p003a.a.w0(th);
                            }
                            v6.f(listW0);
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
                                listW1 = Y4.D.D(null);
                            } catch (Throwable th2) {
                                listW1 = p003a.a.w0(th2);
                            }
                            v6.f(listW1);
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
                                listW2 = Y4.D.D(null);
                            } catch (Throwable th3) {
                                listW2 = p003a.a.w0(th3);
                            }
                            v6.f(listW2);
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
                                listW3 = Y4.D.D(null);
                            } catch (Throwable th4) {
                                listW3 = p003a.a.w0(th4);
                            }
                            v6.f(listW3);
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
                            long jLongValue = ((Long) obj9).longValue();
                            try {
                                c0413i6.getClass();
                                webView4.setBackgroundColor((int) jLongValue);
                                listW4 = Y4.D.D(null);
                            } catch (Throwable th5) {
                                listW4 = p003a.a.w0(th5);
                            }
                            v6.f(listW4);
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
                                listW5 = Y4.D.D(null);
                            } catch (Throwable th6) {
                                listW5 = p003a.a.w0(th6);
                            }
                            v6.f(listW5);
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
                                listW6 = Y4.D.D(null);
                            } catch (Throwable th7) {
                                listW6 = p003a.a.w0(th7);
                            }
                            v6.f(listW6);
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
                                listW7 = Y4.D.D(null);
                            } catch (Throwable th8) {
                                listW7 = p003a.a.w0(th8);
                            }
                            v6.f(listW7);
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
                                listW8 = Y4.D.D(null);
                            } catch (Throwable th9) {
                                listW8 = p003a.a.w0(th9);
                            }
                            v6.f(listW8);
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
                                listW9 = Y4.D.D(null);
                            } catch (Throwable th10) {
                                listW9 = p003a.a.w0(th10);
                            }
                            v6.f(listW9);
                            break;
                        case 10:
                            C0413i c0413i12 = c0413i;
                            t6.h.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj21 = ((List) obj2).get(0);
                            t6.h.c(obj21, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView10 = (WebView) obj21;
                            try {
                                c0413i12.getClass();
                                listW10 = Y4.D.D(webView10.getUrl());
                            } catch (Throwable th11) {
                                listW10 = p003a.a.w0(th11);
                            }
                            v6.f(listW10);
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
                                listW11 = Y4.D.D(null);
                            } catch (Throwable th12) {
                                listW11 = p003a.a.w0(th12);
                            }
                            v6.f(listW11);
                            break;
                        case 12:
                            C0413i c0413i14 = c0413i;
                            t6.h.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj23 = ((List) obj2).get(0);
                            t6.h.c(obj23, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView12 = (WebView) obj23;
                            try {
                                c0413i14.getClass();
                                listW12 = Y4.D.D(Boolean.valueOf(webView12.canGoBack()));
                            } catch (Throwable th13) {
                                listW12 = p003a.a.w0(th13);
                            }
                            v6.f(listW12);
                            break;
                        case 13:
                            C0413i c0413i15 = c0413i;
                            t6.h.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj24 = ((List) obj2).get(0);
                            t6.h.c(obj24, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView13 = (WebView) obj24;
                            try {
                                c0413i15.getClass();
                                listW13 = Y4.D.D(Boolean.valueOf(webView13.canGoForward()));
                            } catch (Throwable th14) {
                                listW13 = p003a.a.w0(th14);
                            }
                            v6.f(listW13);
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
                                listW14 = Y4.D.D(null);
                            } catch (Throwable th15) {
                                listW14 = p003a.a.w0(th15);
                            }
                            v6.f(listW14);
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
                                listW15 = Y4.D.D(null);
                            } catch (Throwable th16) {
                                listW15 = p003a.a.w0(th16);
                            }
                            v6.f(listW15);
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
                            boolean zBooleanValue = ((Boolean) obj28).booleanValue();
                            try {
                                c0413i18.getClass();
                                webView16.clearCache(zBooleanValue);
                                listW16 = Y4.D.D(null);
                            } catch (Throwable th17) {
                                listW16 = p003a.a.w0(th17);
                            }
                            v6.f(listW16);
                            break;
                        case 17:
                            t6.h.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list10 = (List) obj2;
                            Object obj29 = list10.get(0);
                            t6.h.c(obj29, "null cannot be cast to non-null type android.webkit.WebView");
                            Object obj30 = list10.get(1);
                            t6.h.c(obj30, "null cannot be cast to non-null type kotlin.String");
                            B b7 = new B(v6, 1);
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
                                listW17 = Y4.D.D(webView17.getTitle());
                            } catch (Throwable th18) {
                                listW17 = p003a.a.w0(th18);
                            }
                            v6.f(listW17);
                            break;
                        case 19:
                            C0413i c0413i20 = c0413i;
                            t6.h.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj32 = ((List) obj2).get(0);
                            t6.h.c(obj32, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean zBooleanValue2 = ((Boolean) obj32).booleanValue();
                            try {
                                c0413i20.getClass();
                                WebView.setWebContentsDebuggingEnabled(zBooleanValue2);
                                listW18 = Y4.D.D(null);
                            } catch (Throwable th19) {
                                listW18 = p003a.a.w0(th19);
                            }
                            v6.f(listW18);
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
                                listW19 = Y4.D.D(null);
                            } catch (Throwable th20) {
                                listW19 = p003a.a.w0(th20);
                            }
                            v6.f(listW19);
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
                                listW20 = Y4.D.D(null);
                            } catch (Throwable th21) {
                                listW20 = p003a.a.w0(th21);
                            }
                            v6.f(listW20);
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
                                listW21 = Y4.D.D(null);
                            } catch (Throwable th22) {
                                listW21 = p003a.a.w0(th22);
                            }
                            v6.f(listW21);
                            break;
                    }
                }
            });
        } else {
            f28.M(null);
        }
        p155w1.F0 f29 = new p155w1.F0(fVar, "dev.flutter.pigeon.webview_flutter_android.WebView.destroy", c0406b, obj, 1);
        if (c0413i == null) {
            f29.M(null);
        } else {
            final int i29 = 5;
            f29.M(new A5.b() { // from class: R5.N
                @Override // A5.b
                public final void i(Object obj2, V0 v6) {
                    List listW0;
                    List listW1;
                    List listW2;
                    List listW3;
                    List listW4;
                    List listW5;
                    List listW6;
                    List listW7;
                    List listW8;
                    List listW9;
                    List listW10;
                    List listW11;
                    List listW12;
                    List listW13;
                    List listW14;
                    List listW15;
                    List listW16;
                    List listW17;
                    List listW18;
                    List listW19;
                    List listW20;
                    List listW21;
                    switch (i29) {
                        case 0:
                            C0413i c0413i2 = c0413i;
                            t6.h.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj3 = ((List) obj2).get(0);
                            t6.h.c(obj3, "null cannot be cast to non-null type kotlin.Long");
                            try {
                                ((C0407c) c0413i2.f6174a.f3679c).a(((Long) obj3).longValue(), c0413i2.a());
                                listW0 = Y4.D.D(null);
                            } catch (Throwable th) {
                                listW0 = p003a.a.w0(th);
                            }
                            v6.f(listW0);
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
                                listW1 = Y4.D.D(null);
                            } catch (Throwable th2) {
                                listW1 = p003a.a.w0(th2);
                            }
                            v6.f(listW1);
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
                                listW2 = Y4.D.D(null);
                            } catch (Throwable th3) {
                                listW2 = p003a.a.w0(th3);
                            }
                            v6.f(listW2);
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
                                listW3 = Y4.D.D(null);
                            } catch (Throwable th4) {
                                listW3 = p003a.a.w0(th4);
                            }
                            v6.f(listW3);
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
                            long jLongValue = ((Long) obj9).longValue();
                            try {
                                c0413i6.getClass();
                                webView4.setBackgroundColor((int) jLongValue);
                                listW4 = Y4.D.D(null);
                            } catch (Throwable th5) {
                                listW4 = p003a.a.w0(th5);
                            }
                            v6.f(listW4);
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
                                listW5 = Y4.D.D(null);
                            } catch (Throwable th6) {
                                listW5 = p003a.a.w0(th6);
                            }
                            v6.f(listW5);
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
                                listW6 = Y4.D.D(null);
                            } catch (Throwable th7) {
                                listW6 = p003a.a.w0(th7);
                            }
                            v6.f(listW6);
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
                                listW7 = Y4.D.D(null);
                            } catch (Throwable th8) {
                                listW7 = p003a.a.w0(th8);
                            }
                            v6.f(listW7);
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
                                listW8 = Y4.D.D(null);
                            } catch (Throwable th9) {
                                listW8 = p003a.a.w0(th9);
                            }
                            v6.f(listW8);
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
                                listW9 = Y4.D.D(null);
                            } catch (Throwable th10) {
                                listW9 = p003a.a.w0(th10);
                            }
                            v6.f(listW9);
                            break;
                        case 10:
                            C0413i c0413i12 = c0413i;
                            t6.h.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj21 = ((List) obj2).get(0);
                            t6.h.c(obj21, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView10 = (WebView) obj21;
                            try {
                                c0413i12.getClass();
                                listW10 = Y4.D.D(webView10.getUrl());
                            } catch (Throwable th11) {
                                listW10 = p003a.a.w0(th11);
                            }
                            v6.f(listW10);
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
                                listW11 = Y4.D.D(null);
                            } catch (Throwable th12) {
                                listW11 = p003a.a.w0(th12);
                            }
                            v6.f(listW11);
                            break;
                        case 12:
                            C0413i c0413i14 = c0413i;
                            t6.h.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj23 = ((List) obj2).get(0);
                            t6.h.c(obj23, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView12 = (WebView) obj23;
                            try {
                                c0413i14.getClass();
                                listW12 = Y4.D.D(Boolean.valueOf(webView12.canGoBack()));
                            } catch (Throwable th13) {
                                listW12 = p003a.a.w0(th13);
                            }
                            v6.f(listW12);
                            break;
                        case 13:
                            C0413i c0413i15 = c0413i;
                            t6.h.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj24 = ((List) obj2).get(0);
                            t6.h.c(obj24, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView13 = (WebView) obj24;
                            try {
                                c0413i15.getClass();
                                listW13 = Y4.D.D(Boolean.valueOf(webView13.canGoForward()));
                            } catch (Throwable th14) {
                                listW13 = p003a.a.w0(th14);
                            }
                            v6.f(listW13);
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
                                listW14 = Y4.D.D(null);
                            } catch (Throwable th15) {
                                listW14 = p003a.a.w0(th15);
                            }
                            v6.f(listW14);
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
                                listW15 = Y4.D.D(null);
                            } catch (Throwable th16) {
                                listW15 = p003a.a.w0(th16);
                            }
                            v6.f(listW15);
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
                            boolean zBooleanValue = ((Boolean) obj28).booleanValue();
                            try {
                                c0413i18.getClass();
                                webView16.clearCache(zBooleanValue);
                                listW16 = Y4.D.D(null);
                            } catch (Throwable th17) {
                                listW16 = p003a.a.w0(th17);
                            }
                            v6.f(listW16);
                            break;
                        case 17:
                            t6.h.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list10 = (List) obj2;
                            Object obj29 = list10.get(0);
                            t6.h.c(obj29, "null cannot be cast to non-null type android.webkit.WebView");
                            Object obj30 = list10.get(1);
                            t6.h.c(obj30, "null cannot be cast to non-null type kotlin.String");
                            B b7 = new B(v6, 1);
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
                                listW17 = Y4.D.D(webView17.getTitle());
                            } catch (Throwable th18) {
                                listW17 = p003a.a.w0(th18);
                            }
                            v6.f(listW17);
                            break;
                        case 19:
                            C0413i c0413i20 = c0413i;
                            t6.h.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj32 = ((List) obj2).get(0);
                            t6.h.c(obj32, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean zBooleanValue2 = ((Boolean) obj32).booleanValue();
                            try {
                                c0413i20.getClass();
                                WebView.setWebContentsDebuggingEnabled(zBooleanValue2);
                                listW18 = Y4.D.D(null);
                            } catch (Throwable th19) {
                                listW18 = p003a.a.w0(th19);
                            }
                            v6.f(listW18);
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
                                listW19 = Y4.D.D(null);
                            } catch (Throwable th20) {
                                listW19 = p003a.a.w0(th20);
                            }
                            v6.f(listW19);
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
                                listW20 = Y4.D.D(null);
                            } catch (Throwable th21) {
                                listW20 = p003a.a.w0(th21);
                            }
                            v6.f(listW20);
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
                                listW21 = Y4.D.D(null);
                            } catch (Throwable th22) {
                                listW21 = p003a.a.w0(th22);
                            }
                            v6.f(listW21);
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
        p155w1.F0 f7 = new p155w1.F0(fVar, "dev.flutter.pigeon.webview_flutter_android.HttpAuthHandler.useHttpAuthUsernamePassword", c0406b, obj, 1);
        if (c0424u != null) {
            final int i7 = 0;
            f7.M(new A5.b() { // from class: R5.E
                @Override // A5.b
                public final void i(Object obj2, V0 v6) {
                    List listW0;
                    List listW1;
                    List listW2;
                    switch (i7) {
                        case 0:
                            C0424u c0424u2 = c0424u;
                            t6.h.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj3 = ((List) obj2).get(0);
                            t6.h.c(obj3, "null cannot be cast to non-null type android.webkit.HttpAuthHandler");
                            HttpAuthHandler httpAuthHandler = (HttpAuthHandler) obj3;
                            try {
                                c0424u2.getClass();
                                listW0 = Y4.D.D(Boolean.valueOf(httpAuthHandler.useHttpAuthUsernamePassword()));
                            } catch (Throwable th) {
                                listW0 = p003a.a.w0(th);
                            }
                            v6.f(listW0);
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
                                listW1 = Y4.D.D(null);
                            } catch (Throwable th2) {
                                listW1 = p003a.a.w0(th2);
                            }
                            v6.f(listW1);
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
                                listW2 = Y4.D.D(null);
                            } catch (Throwable th3) {
                                listW2 = p003a.a.w0(th3);
                            }
                            v6.f(listW2);
                            break;
                    }
                }
            });
        } else {
            f7.M(null);
        }
        p155w1.F0 f8 = new p155w1.F0(fVar, "dev.flutter.pigeon.webview_flutter_android.HttpAuthHandler.cancel", c0406b, obj, 1);
        if (c0424u != null) {
            final int i8 = 1;
            f8.M(new A5.b() { // from class: R5.E
                @Override // A5.b
                public final void i(Object obj2, V0 v6) {
                    List listW0;
                    List listW1;
                    List listW2;
                    switch (i8) {
                        case 0:
                            C0424u c0424u2 = c0424u;
                            t6.h.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj3 = ((List) obj2).get(0);
                            t6.h.c(obj3, "null cannot be cast to non-null type android.webkit.HttpAuthHandler");
                            HttpAuthHandler httpAuthHandler = (HttpAuthHandler) obj3;
                            try {
                                c0424u2.getClass();
                                listW0 = Y4.D.D(Boolean.valueOf(httpAuthHandler.useHttpAuthUsernamePassword()));
                            } catch (Throwable th) {
                                listW0 = p003a.a.w0(th);
                            }
                            v6.f(listW0);
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
                                listW1 = Y4.D.D(null);
                            } catch (Throwable th2) {
                                listW1 = p003a.a.w0(th2);
                            }
                            v6.f(listW1);
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
                                listW2 = Y4.D.D(null);
                            } catch (Throwable th3) {
                                listW2 = p003a.a.w0(th3);
                            }
                            v6.f(listW2);
                            break;
                    }
                }
            });
        } else {
            f8.M(null);
        }
        p155w1.F0 f9 = new p155w1.F0(fVar, "dev.flutter.pigeon.webview_flutter_android.HttpAuthHandler.proceed", c0406b, obj, 1);
        if (c0424u == null) {
            f9.M(null);
        } else {
            final int i9 = 2;
            f9.M(new A5.b() { // from class: R5.E
                @Override // A5.b
                public final void i(Object obj2, V0 v6) {
                    List listW0;
                    List listW1;
                    List listW2;
                    switch (i9) {
                        case 0:
                            C0424u c0424u2 = c0424u;
                            t6.h.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj3 = ((List) obj2).get(0);
                            t6.h.c(obj3, "null cannot be cast to non-null type android.webkit.HttpAuthHandler");
                            HttpAuthHandler httpAuthHandler = (HttpAuthHandler) obj3;
                            try {
                                c0424u2.getClass();
                                listW0 = Y4.D.D(Boolean.valueOf(httpAuthHandler.useHttpAuthUsernamePassword()));
                            } catch (Throwable th) {
                                listW0 = p003a.a.w0(th);
                            }
                            v6.f(listW0);
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
                                listW1 = Y4.D.D(null);
                            } catch (Throwable th2) {
                                listW1 = p003a.a.w0(th2);
                            }
                            v6.f(listW1);
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
                                listW2 = Y4.D.D(null);
                            } catch (Throwable th3) {
                                listW2 = p003a.a.w0(th3);
                            }
                            v6.f(listW2);
                            break;
                    }
                }
            });
        }
    }

    public static ArrayList Y(String str) {
        ArrayList arrayList = new ArrayList();
        String[] strArrSplit = str.split("/", -1);
        for (int i7 = 0; i7 < strArrSplit.length; i7++) {
            if (!strArrSplit[i7].isEmpty()) {
                arrayList.add(strArrSplit[i7]);
            }
        }
        return arrayList;
    }

    /* JADX WARN: Code duplicated, block: B:27:0x006d  */
    /* JADX WARN: Code duplicated, block: B:37:0x0096  */
    /* JADX WARN: Code duplicated, block: B:39:0x0099  */
    /* JADX WARN: Code duplicated, block: B:43:0x0098 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:45:? A[LOOP:0: B:25:0x0067->B:45:?, LOOP_END, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:33:0x0087 -> B:25:0x0067). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:34:0x008a -> B:25:0x0067). Please report as a decompilation issue!!! */
    public static final Object a(List list, C0741l c0741l, p077k6.c cVar) throws Throwable {
        C0735f c0735f;
        List list2;
        t6.p pVar;
        Iterator it;
        Throwable th;
        Function1 function1;
        if (cVar instanceof C0735f) {
            c0735f = (C0735f) cVar;
            int i7 = c0735f.f10037d;
            if ((i7 & Integer.MIN_VALUE) != 0) {
                c0735f.f10037d = i7 - Integer.MIN_VALUE;
            } else {
                c0735f = new C0735f(cVar);
            }
        } else {
            c0735f = new C0735f(cVar);
        }
        Object obj = c0735f.f10036c;
        Object obj2 = j6.a.f14648a;
        int i8 = c0735f.f10037d;
        if (i8 != 0) {
            if (i8 == 1) {
                list2 = (List) c0735f.f10034a;
                p003a.a.p0(obj);
            } else {
                if (i8 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                it = c0735f.f10035b;
                pVar = (t6.p) c0735f.f10034a;
                try {
                    p003a.a.p0(obj);
                } catch (Throwable th2) {
                    Object obj3 = pVar.f16478a;
                    if (obj3 == null) {
                        pVar.f16478a = th2;
                    } else {
                        Q0.a.c((Throwable) obj3, th2);
                    }
                }
            }
            while (it.hasNext()) {
                function1 = (Function1) it.next();
                c0735f.f10034a = pVar;
                c0735f.f10035b = it;
                c0735f.f10037d = 2;
                if (function1.invoke(c0735f) == obj2) {
                    return obj2;
                }
            }
            th = (Throwable) pVar.f16478a;
            if (th == null) {
                return p044f6.i.f13014a;
            }
            throw th;
        }
        p003a.a.p0(obj);
        ArrayList arrayList = new ArrayList();
        C0737h c0737h = new C0737h(list, arrayList, null);
        c0735f.f10034a = arrayList;
        c0735f.f10037d = 1;
        if (c0741l.a(c0737h, c0735f) == obj2) {
            return obj2;
        }
        list2 = arrayList;
        pVar = new t6.p();
        it = list2.iterator();
        while (it.hasNext()) {
            function1 = (Function1) it.next();
            c0735f.f10034a = pVar;
            c0735f.f10035b = it;
            c0735f.f10037d = 2;
            if (function1.invoke(c0735f) == obj2) {
                return obj2;
            }
        }
        th = (Throwable) pVar.f16478a;
        if (th == null) {
            return p044f6.i.f13014a;
        }
        throw th;
    }

    public static String a0(String str) {
        int length = str.length();
        int i7 = 0;
        while (i7 < length) {
            char cCharAt = str.charAt(i7);
            if (cCharAt >= 'A' && cCharAt <= 'Z') {
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
        List listUnmodifiableList = Collections.unmodifiableList(c0171d.f2171a);
        if (listUnmodifiableList.size() == 1) {
            return b((AbstractC0178k) listUnmodifiableList.get(0));
        }
        Iterator it = c0171d.f2171a.iterator();
        while (it.hasNext()) {
            if (((AbstractC0178k) it.next()) instanceof C0171d) {
                ArrayList arrayList = new ArrayList();
                Iterator it2 = listUnmodifiableList.iterator();
                while (it2.hasNext()) {
                    arrayList.add(b((AbstractC0178k) it2.next()));
                }
                ArrayList arrayList2 = new ArrayList();
                Iterator it3 = arrayList.iterator();
                while (true) {
                    boolean zHasNext = it3.hasNext();
                    i7 = c0171d.f2172b;
                    if (!zHasNext) {
                        break;
                    }
                    AbstractC0178k abstractC0178k2 = (AbstractC0178k) it3.next();
                    if (abstractC0178k2 instanceof C0177j) {
                        arrayList2.add(abstractC0178k2);
                    } else if (abstractC0178k2 instanceof C0171d) {
                        C0171d c0171d2 = (C0171d) abstractC0178k2;
                        if (p136t.e.b(c0171d2.f2172b, i7)) {
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
            char cCharAt = str.charAt(i7);
            if (cCharAt >= 'a' && cCharAt <= 'z') {
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
        boolean zE = c0171d.e();
        ArrayList arrayList = c0171d.f2171a;
        if (zE) {
            List listSingletonList = Collections.singletonList(c0177j);
            ArrayList arrayList2 = new ArrayList(arrayList);
            arrayList2.addAll(listSingletonList);
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
        C0171d c0171dC;
        e(abstractC0178k);
        e(abstractC0178k2);
        boolean z4 = abstractC0178k instanceof C0177j;
        if (z4 && (abstractC0178k2 instanceof C0177j)) {
            c0171dC = new C0171d(1, Arrays.asList((C0177j) abstractC0178k, (C0177j) abstractC0178k2));
        } else if (z4 && (abstractC0178k2 instanceof C0171d)) {
            c0171dC = c((C0177j) abstractC0178k, (C0171d) abstractC0178k2);
        } else if ((abstractC0178k instanceof C0171d) && (abstractC0178k2 instanceof C0177j)) {
            c0171dC = c((C0177j) abstractC0178k2, (C0171d) abstractC0178k);
        } else {
            C0171d c0171d2 = (C0171d) abstractC0178k;
            C0171d c0171d3 = (C0171d) abstractC0178k2;
            p113p3.f.O("Found an empty composite filter", (Collections.unmodifiableList(c0171d2.f2171a).isEmpty() || Collections.unmodifiableList(c0171d3.f2171a).isEmpty()) ? false : true, new Object[0]);
            boolean zE = c0171d2.e();
            int i7 = c0171d2.f2172b;
            if (zE && c0171d3.e()) {
                List listUnmodifiableList = Collections.unmodifiableList(c0171d3.f2171a);
                ArrayList arrayList = new ArrayList(c0171d2.f2171a);
                arrayList.addAll(listUnmodifiableList);
                c0171d = new C0171d(i7, arrayList);
            } else {
                C0171d c0171d4 = i7 == 2 ? c0171d2 : c0171d3;
                if (i7 == 2) {
                    c0171d2 = c0171d3;
                }
                ArrayList arrayList2 = new ArrayList();
                Iterator it = Collections.unmodifiableList(c0171d4.f2171a).iterator();
                while (it.hasNext()) {
                    arrayList2.add(d((AbstractC0178k) it.next(), c0171d2));
                }
                c0171d = new C0171d(2, arrayList2);
            }
            c0171dC = c0171d;
        }
        return b(c0171dC);
    }

    public static void e(AbstractC0178k abstractC0178k) {
        p113p3.f.O("Only field filters and composite filters are accepted.", (abstractC0178k instanceof C0177j) || (abstractC0178k instanceof C0171d), new Object[0]);
    }

    public static Object e0(Object obj) {
        if (obj == null) {
            return JSONObject.NULL;
        }
        if ((obj instanceof JSONArray) || (obj instanceof JSONObject) || obj.equals(JSONObject.NULL)) {
            return obj;
        }
        try {
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
        } catch (Exception unused) {
        }
    }

    public static C0958q f(g2.m mVar, String str, g2.j jVar, int i7) {
        C0957p c0957p = new C0957p();
        c0957p.f16806a = p151v2.a.D(str, jVar.f13159c);
        c0957p.f16809d = jVar.f13157a;
        c0957p.f16810e = jVar.f13158b;
        String strA = mVar.a();
        if (strA == null) {
            strA = p151v2.a.D(((g2.b) mVar.f13165b.get(0)).f13111a, jVar.f13159c).toString();
        }
        c0957p.f16811f = strA;
        c0957p.f16812g = i7;
        if (c0957p.f16806a != null) {
            return new C0958q(c0957p.f16806a, c0957p.f16807b, null, c0957p.f16808c, c0957p.f16809d, c0957p.f16810e, c0957p.f16811f, c0957p.f16812g);
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

    public static void g(Context context, S5.b bVar) throws Exception {
        Rect rect;
        P.i0 g0Var;
        P.q0 q0VarB;
        Activity activityQ = q(context);
        if (activityQ != null) {
            X0.n.f7458a.getClass();
            int i7 = X0.o.f7459b;
            int i8 = Build.VERSION.SDK_INT;
            if (i8 >= 30) {
                rect = ((WindowManager) activityQ.getSystemService(WindowManager.class)).getMaximumWindowMetrics().getBounds();
                t6.h.d(rect, "wm.maximumWindowMetrics.bounds");
            } else {
                Object systemService = activityQ.getSystemService("window");
                t6.h.c(systemService, "null cannot be cast to non-null type android.view.WindowManager");
                Display defaultDisplay = ((WindowManager) systemService).getDefaultDisplay();
                t6.h.d(defaultDisplay, "display");
                Point point = new Point();
                defaultDisplay.getRealSize(point);
                rect = new Rect(0, 0, point.x, point.y);
            }
            if (i8 < 30) {
                if (i8 >= 30) {
                    g0Var = new P.h0();
                } else {
                    g0Var = i8 >= 29 ? new P.g0() : new P.f0();
                }
                q0VarB = g0Var.b();
                t6.h.d(q0VarB, "{\n            WindowInse…ilder().build()\n        }");
            } else {
                if (i8 < 30) {
                    throw new Exception("Incompatible SDK version");
                }
                q0VarB = p011b1.a.f10125a.a(activityQ);
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
            t6.h.e(q0VarB, "_windowInsetsCompat");
            ((p128r5.b) bVar).f16037a.updateDisplayMetrics(0, new Rect(i9, i10, i11, i12).width(), new Rect(i9, i10, i11, i12).height(), context.getResources().getDisplayMetrics().density);
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

    /* JADX WARN: Code duplicated, block: B:52:0x00a7  */
    /* JADX WARN: Code duplicated, block: B:54:0x00b7 A[LOOP:0: B:53:0x00b5->B:54:0x00b7, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:63:? A[RETURN, SYNTHETIC] */
    public static boolean h(C0095a c0095a, F1.o oVar, int i7, E4.y yVar) {
        int iT;
        byte[] bArr;
        int i8;
        int i9;
        long jU = c0095a.u();
        long j3 = jU >>> 16;
        if (j3 != i7) {
            return false;
        }
        boolean z4 = (j3 & 1) == 1;
        int i10 = (int) ((jU >> 12) & 15);
        int i11 = (int) ((jU >> 8) & 15);
        int i12 = (int) ((jU >> 4) & 15);
        int i13 = (int) ((jU >> 1) & 7);
        boolean z7 = (jU & 1) == 1;
        if (i12 > 7 ? !(i12 > 10 || oVar.f2555g != 2) : i12 == oVar.f2555g - 1) {
            if ((i13 == 0 || i13 == oVar.f2557i) && !z7) {
                try {
                    long jZ = c0095a.z();
                    if (!z4) {
                        jZ *= (long) oVar.f2550b;
                    }
                    yVar.f2247a = jZ;
                    int iN = N(i10, c0095a);
                    if (iN != -1 && iN <= oVar.f2550b) {
                        if (i11 == 0) {
                            iT = c0095a.t();
                            int i14 = c0095a.f1463a;
                            bArr = (byte[]) c0095a.f1465c;
                            i8 = i14 - 1;
                            int i15 = p151v2.t.f17159a;
                            i9 = 0;
                            for (int i16 = c0095a.f1463a; i16 < i8; i16++) {
                                i9 = p151v2.t.f17171n[i9 ^ (bArr[i16] & 255)];
                            }
                            if (iT == i9) {
                                return true;
                            }
                        } else if (i11 > 11) {
                            int i17 = oVar.f2553e;
                            if (i11 == 12) {
                                if (c0095a.t() * zzbbd.zzq.zzf == i17) {
                                    iT = c0095a.t();
                                    int i18 = c0095a.f1463a;
                                    bArr = (byte[]) c0095a.f1465c;
                                    i8 = i18 - 1;
                                    int i19 = p151v2.t.f17159a;
                                    i9 = 0;
                                    while (i16 < i8) {
                                        i9 = p151v2.t.f17171n[i9 ^ (bArr[i16] & 255)];
                                    }
                                    if (iT == i9) {
                                        return true;
                                    }
                                }
                            } else if (i11 <= 14) {
                                int iY = c0095a.y();
                                if (i11 == 14) {
                                    iY *= 10;
                                }
                                if (iY == i17) {
                                    iT = c0095a.t();
                                    int i110 = c0095a.f1463a;
                                    bArr = (byte[]) c0095a.f1465c;
                                    i8 = i110 - 1;
                                    int i111 = p151v2.t.f17159a;
                                    i9 = 0;
                                    while (i16 < i8) {
                                        i9 = p151v2.t.f17171n[i9 ^ (bArr[i16] & 255)];
                                    }
                                    if (iT == i9) {
                                        return true;
                                    }
                                }
                            }
                        } else if (i11 == oVar.f2554f) {
                            iT = c0095a.t();
                            int i112 = c0095a.f1463a;
                            bArr = (byte[]) c0095a.f1465c;
                            i8 = i112 - 1;
                            int i113 = p151v2.t.f17159a;
                            i9 = 0;
                            while (i16 < i8) {
                                i9 = p151v2.t.f17171n[i9 ^ (bArr[i16] & 255)];
                            }
                            if (iT == i9) {
                                return true;
                            }
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
        AbstractC0178k abstractC0178kB = b(new C0171d(c0171d.f2172b, arrayList));
        if (x(abstractC0178kB)) {
            return abstractC0178kB;
        }
        p113p3.f.O("field filters are already in DNF form.", abstractC0178kB instanceof C0171d, new Object[0]);
        C0171d c0171d2 = (C0171d) abstractC0178kB;
        p113p3.f.O("Disjunction of filters all of which are already in DNF form is itself in DNF form.", c0171d2.e(), new Object[0]);
        ArrayList arrayList2 = c0171d2.f2171a;
        p113p3.f.O("Single-filter composite filters are already in DNF form.", Collections.unmodifiableList(arrayList2).size() > 1, new Object[0]);
        AbstractC0178k abstractC0178kD = (AbstractC0178k) Collections.unmodifiableList(arrayList2).get(0);
        for (int i7 = 1; i7 < Collections.unmodifiableList(arrayList2).size(); i7++) {
            abstractC0178kD = d(abstractC0178kD, (AbstractC0178k) Collections.unmodifiableList(arrayList2).get(i7));
        }
        return abstractC0178kD;
    }

    public static void k0(Parcel parcel, int i7, Bundle bundle, boolean z4) {
        if (bundle == null) {
            if (z4) {
                B0(parcel, i7, 0);
            }
        } else {
            int iX0 = x0(i7, parcel);
            parcel.writeBundle(bundle);
            z0(iX0, parcel);
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
        for (I0 i7 : uVar.f2200b.G().a()) {
            arrayList.add(C0177j.e(uVar.f2201c, EnumC0176i.EQUAL, i7));
        }
        return new C0171d(2, arrayList);
    }

    public static void l0(Parcel parcel, int i7, byte[] bArr, boolean z4) {
        if (bArr == null) {
            if (z4) {
                B0(parcel, i7, 0);
            }
        } else {
            int iX0 = x0(i7, parcel);
            parcel.writeByteArray(bArr);
            z0(iX0, parcel);
        }
    }

    public static HashMap m(Exception exc) {
        H5.a aVar;
        HashMap map = new HashMap();
        if (exc == null) {
            return map;
        }
        if (exc instanceof B4.I) {
            aVar = new H5.a((B4.I) exc, exc.getCause());
        } else if (exc.getCause() == null || !(exc.getCause() instanceof B4.I)) {
            aVar = null;
        } else {
            aVar = new H5.a((B4.I) exc.getCause(), exc.getCause().getCause() != null ? exc.getCause().getCause() : exc.getCause());
        }
        if (aVar != null) {
            map.put("code", aVar.f3349a);
            map.put("message", aVar.f3350b);
        }
        if (map.containsKey("code")) {
            String str = (String) map.get("code");
            Objects.requireNonNull(str);
            if (str.equals("unknown")) {
                Log.e("FLTFirebaseFirestore", "An unknown error occurred", exc);
            }
        }
        return map;
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
            char cCharAt = str.charAt(i7);
            char cCharAt2 = str2.charAt(i7);
            if (cCharAt != cCharAt2 && ((c3 = (char) ((cCharAt | ' ') - 97)) >= 26 || c3 != ((char) ((cCharAt2 | ' ') - 97)))) {
                return false;
            }
        }
        return true;
    }

    public static void n0(Parcel parcel, int i7, IBinder iBinder) {
        if (iBinder == null) {
            return;
        }
        int iX0 = x0(i7, parcel);
        parcel.writeStrongBinder(iBinder);
        z0(iX0, parcel);
    }

    public static String o(C0662g c0662g) {
        StringBuilder sb = new StringBuilder(c0662g.size());
        for (int i7 = 0; i7 < c0662g.size(); i7++) {
            byte bL = c0662g.l(i7);
            if (bL == 34) {
                sb.append("\\\"");
            } else if (bL == 39) {
                sb.append("\\'");
            } else if (bL != 92) {
                switch (bL) {
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
                        if (bL < 32 || bL > 126) {
                            sb.append('\\');
                            sb.append((char) (((bL >>> 6) & 3) + 48));
                            sb.append((char) (((bL >>> 3) & 7) + 48));
                            sb.append((char) ((bL & 7) + 48));
                        } else {
                            sb.append((char) bL);
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
            int iX0 = x0(i7, parcel);
            parcel.writeIntArray(iArr);
            z0(iX0, parcel);
        }
    }

    public static HashMap p(p120q4.a aVar) {
        HashMap map = new HashMap();
        map.put("timestamp", Long.valueOf(aVar.k()));
        return map;
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
            int iX0 = x0(i7, parcel);
            parcelable.writeToParcel(parcel, i8);
            z0(iX0, parcel);
        }
    }

    public static com.google.protobuf.z0 s(I0 i7) {
        return i7.N().A("__local_write_time__").Q();
    }

    public static void s0(Parcel parcel, int i7, String str, boolean z4) {
        if (str == null) {
            if (z4) {
                B0(parcel, i7, 0);
            }
        } else {
            int iX0 = x0(i7, parcel);
            parcel.writeString(str);
            z0(iX0, parcel);
        }
    }

    public static I0 t(I0 i7) {
        I0 i0Z = i7.N().z("__previous_value__");
        return A(i0Z) ? t(i0Z) : i0Z;
    }

    public static void t0(Parcel parcel, int i7, String[] strArr, boolean z4) {
        if (strArr == null) {
            if (z4) {
                B0(parcel, i7, 0);
            }
        } else {
            int iX0 = x0(i7, parcel);
            parcel.writeStringArray(strArr);
            z0(iX0, parcel);
        }
    }

    public static void u0(Parcel parcel, int i7, List list) {
        if (list == null) {
            return;
        }
        int iX0 = x0(i7, parcel);
        parcel.writeStringList(list);
        z0(iX0, parcel);
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
        int iX0 = x0(i7, parcel);
        parcel.writeInt(parcelableArr.length);
        for (Parcelable parcelable : parcelableArr) {
            if (parcelable == null) {
                parcel.writeInt(0);
            } else {
                int iDataPosition = parcel.dataPosition();
                parcel.writeInt(1);
                int iDataPosition2 = parcel.dataPosition();
                parcelable.writeToParcel(parcel, i8);
                int iDataPosition3 = parcel.dataPosition();
                parcel.setDataPosition(iDataPosition);
                parcel.writeInt(iDataPosition3 - iDataPosition2);
                parcel.setDataPosition(iDataPosition3);
            }
        }
        z0(iX0, parcel);
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
        int iX0 = x0(i7, parcel);
        int size = list.size();
        parcel.writeInt(size);
        for (int i8 = 0; i8 < size; i8++) {
            Parcelable parcelable = (Parcelable) list.get(i8);
            if (parcelable == null) {
                parcel.writeInt(0);
            } else {
                int iDataPosition = parcel.dataPosition();
                parcel.writeInt(1);
                int iDataPosition2 = parcel.dataPosition();
                parcelable.writeToParcel(parcel, 0);
                int iDataPosition3 = parcel.dataPosition();
                parcel.setDataPosition(iDataPosition);
                parcel.writeInt(iDataPosition3 - iDataPosition2);
                parcel.setDataPosition(iDataPosition3);
            }
        }
        z0(iX0, parcel);
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
        Iterator<String> itKeys = jSONObject.keys();
        Bundle bundle = new Bundle();
        while (itKeys.hasNext()) {
            String next = itKeys.next();
            Object objOpt = jSONObject.opt(next);
            if (objOpt != null) {
                if (objOpt instanceof Boolean) {
                    bundle.putBoolean(next, ((Boolean) objOpt).booleanValue());
                } else if (objOpt instanceof Double) {
                    bundle.putDouble(next, ((Double) objOpt).doubleValue());
                } else if (objOpt instanceof Integer) {
                    bundle.putInt(next, ((Integer) objOpt).intValue());
                } else if (objOpt instanceof Long) {
                    bundle.putLong(next, ((Long) objOpt).longValue());
                } else if (objOpt instanceof String) {
                    bundle.putString(next, (String) objOpt);
                } else if (objOpt instanceof JSONArray) {
                    JSONArray jSONArray = (JSONArray) objOpt;
                    if (jSONArray.length() != 0) {
                        int length = jSONArray.length();
                        int i7 = 0;
                        Object objOpt2 = null;
                        for (int i8 = 0; objOpt2 == null && i8 < length; i8++) {
                            objOpt2 = !jSONArray.isNull(i8) ? jSONArray.opt(i8) : null;
                        }
                        if (objOpt2 == null) {
                            String strValueOf = String.valueOf(next);
                            int i9 = I2.J.f3546b;
                            J2.j.g("Expected JSONArray with at least 1 non-null element for key:".concat(strValueOf));
                        } else if (objOpt2 instanceof JSONObject) {
                            Bundle[] bundleArr = new Bundle[length];
                            while (i7 < length) {
                                bundleArr[i7] = !jSONArray.isNull(i7) ? y0(jSONArray.optJSONObject(i7)) : null;
                                i7++;
                            }
                            bundle.putParcelableArray(next, bundleArr);
                        } else if (objOpt2 instanceof Number) {
                            double[] dArr = new double[jSONArray.length()];
                            while (i7 < length) {
                                dArr[i7] = jSONArray.optDouble(i7);
                                i7++;
                            }
                            bundle.putDoubleArray(next, dArr);
                        } else if (objOpt2 instanceof CharSequence) {
                            String[] strArr = new String[length];
                            while (i7 < length) {
                                strArr[i7] = !jSONArray.isNull(i7) ? jSONArray.optString(i7) : null;
                                i7++;
                            }
                            bundle.putStringArray(next, strArr);
                        } else if (objOpt2 instanceof Boolean) {
                            boolean[] zArr = new boolean[length];
                            while (i7 < length) {
                                zArr[i7] = jSONArray.optBoolean(i7);
                                i7++;
                            }
                            bundle.putBooleanArray(next, zArr);
                        } else {
                            String strF = p150v0.a.f("JSONArray with unsupported type ", objOpt2.getClass().getCanonicalName(), " for key:", next);
                            int i10 = I2.J.f3546b;
                            J2.j.g(strF);
                        }
                    }
                } else if (objOpt instanceof JSONObject) {
                    bundle.putBundle(next, y0((JSONObject) objOpt));
                } else {
                    String strValueOf2 = String.valueOf(next);
                    int i11 = I2.J.f3546b;
                    J2.j.g("Unsupported type for key:".concat(strValueOf2));
                }
            }
        }
        return bundle;
    }

    public static boolean z(AbstractC0178k abstractC0178k) {
        if (abstractC0178k instanceof C0171d) {
            C0171d c0171d = (C0171d) abstractC0178k;
            Iterator it = c0171d.f2171a.iterator();
            while (it.hasNext()) {
                if (((AbstractC0178k) it.next()) instanceof C0171d) {
                }
            }
            if (c0171d.e()) {
                return true;
            }
        }
        return false;
    }

    public static void z0(int i7, Parcel parcel) {
        int iDataPosition = parcel.dataPosition();
        parcel.setDataPosition(i7 - 4);
        parcel.writeInt(iDataPosition - i7);
        parcel.setDataPosition(iDataPosition);
    }

    public abstract void F(int i7, int i8);

    public abstract void G(int i7);

    public abstract void H(View view);

    public abstract void I(int i7);

    public abstract void J(View view, int i7);

    public abstract void K(View view, float f7);

    public abstract void S(boolean z4);

    public abstract void T(boolean z4);

    public void Z() throws InterruptedIOException {
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
