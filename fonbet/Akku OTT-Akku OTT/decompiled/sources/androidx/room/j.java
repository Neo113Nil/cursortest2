package androidx.room;

import androidx.compose.runtime.snapshots.m;
import androidx.core.app.NotificationCompat;
import androidx.credentials.exceptions.publickeycredential.DomExceptionUtils;
import com.facebook.G;
import com.facebook.appevents.cloudbridge.a;
import com.facebook.appevents.cloudbridge.g;
import com.facebook.appevents.cloudbridge.h;
import com.facebook.appevents.cloudbridge.n;
import com.facebook.internal.E;
import com.facebook.internal.u;
import com.facebook.z;
import com.google.android.exoplayer2.source.rtsp.RtspHeaders;
import java.io.BufferedOutputStream;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLConnection;
import java.net.UnknownHostException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.ExceptionsKt;
import kotlin.TuplesKt;
import kotlin.UninitializedPropertyAccessException;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.collections.MapsKt;
import kotlin.io.CloseableKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.TypeIntrinsics;
import kotlin.ranges.IntRange;
import kotlin.text.StringsKt__StringsKt;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes3.dex */
public final /* synthetic */ class j implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ j(Object obj, int i) {
        this.a = i;
        this.b = obj;
    }

    /* JADX WARN: Finally extract failed */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:167:0x0393  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0496  */
    /* JADX WARN: Removed duplicated region for block: B:96:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r0v115, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r0v117, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r0v118 */
    /* JADX WARN: Type inference failed for: r0v17 */
    /* JADX WARN: Type inference failed for: r0v18, types: [java.util.Collection] */
    /* JADX WARN: Type inference failed for: r1v20, types: [java.lang.Throwable] */
    @Override // java.lang.Runnable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void run() {
        G g;
        String str;
        String str2;
        String str3;
        boolean z;
        h.a aVar;
        ?? r0;
        String str4;
        Set<String> keySet;
        com.facebook.appevents.cloudbridge.b field;
        String str5;
        String str6;
        String str7;
        LinkedHashMap linkedHashMap;
        int i;
        String str8;
        ArrayList arrayList;
        n nVar;
        LinkedHashMap linkedHashMap2;
        int i2;
        g.b bVar;
        int i3;
        int i4 = this.a;
        Object obj = this.b;
        switch (i4) {
            case 0:
                QueryInterceptorDatabase.beginTransactionWithListener$lambda$2((QueryInterceptorDatabase) obj);
                return;
            default:
                z request = (z) obj;
                HashSet<Integer> hashSet = com.facebook.appevents.cloudbridge.h.a;
                Intrinsics.checkNotNullParameter(request, "$request");
                String str9 = request.b;
                List split$default = str9 != null ? StringsKt__StringsKt.split$default(str9, new String[]{DomExceptionUtils.SEPARATOR}, false, 0, 6, (Object) null) : null;
                G g2 = G.e;
                String str10 = "CAPITransformerWebRequests";
                if (split$default == null || split$default.size() != 2) {
                    u.Companion.getClass();
                    u.a.b(g2, "CAPITransformerWebRequests", "\n GraphPathComponents Error when logging: \n%s", request);
                    return;
                }
                try {
                    h.a aVar2 = com.facebook.appevents.cloudbridge.h.c;
                    if (aVar2 == null) {
                        Intrinsics.throwUninitializedPropertyAccessException("credentials");
                        aVar2 = null;
                    }
                    String str11 = aVar2.b;
                    h.a aVar3 = com.facebook.appevents.cloudbridge.h.c;
                    if (aVar3 == null) {
                        Intrinsics.throwUninitializedPropertyAccessException("credentials");
                        aVar3 = null;
                    }
                    String str12 = str11 + "/capi/" + aVar3.a + "/events";
                    JSONObject jSONObject = request.c;
                    G g3 = G.d;
                    if (jSONObject != null) {
                        Map parameters = MapsKt.toMutableMap(E.g(jSONObject));
                        String str13 = request.e;
                        Intrinsics.checkNotNull(str13, "null cannot be cast to non-null type kotlin.Any");
                        String str14 = "custom_events";
                        parameters.put("custom_events", str13);
                        StringBuilder sb = new StringBuilder();
                        for (String str15 : parameters.keySet()) {
                            sb.append(str15);
                            sb.append(" : ");
                            sb.append(parameters.get(str15));
                            sb.append(System.getProperty("line.separator"));
                        }
                        aVar = null;
                        u.Companion.getClass();
                        u.a.b(g3, "CAPITransformerWebRequests", "\nGraph Request data: \n\n%s \n\n", sb);
                        Map<com.facebook.appevents.cloudbridge.b, g.b> map = com.facebook.appevents.cloudbridge.g.a;
                        Intrinsics.checkNotNullParameter(parameters, "parameters");
                        LinkedHashMap linkedHashMap3 = new LinkedHashMap();
                        LinkedHashMap linkedHashMap4 = new LinkedHashMap();
                        ArrayList customEvents = new ArrayList();
                        LinkedHashMap restOfData = new LinkedHashMap();
                        Object obj2 = parameters.get(NotificationCompat.CATEGORY_EVENT);
                        a.C0072a c0072a = com.facebook.appevents.cloudbridge.a.Companion;
                        Intrinsics.checkNotNull(obj2, "null cannot be cast to non-null type kotlin.String");
                        String rawValue = (String) obj2;
                        c0072a.getClass();
                        Intrinsics.checkNotNullParameter(rawValue, "rawValue");
                        com.facebook.appevents.cloudbridge.a eventType = Intrinsics.areEqual(rawValue, "MOBILE_APP_INSTALL") ? com.facebook.appevents.cloudbridge.a.a : Intrinsics.areEqual(rawValue, "CUSTOM_APP_EVENTS") ? com.facebook.appevents.cloudbridge.a.b : com.facebook.appevents.cloudbridge.a.c;
                        str2 = "credentials";
                        String str16 = "appData";
                        g = g2;
                        String str17 = "userData";
                        if (eventType != com.facebook.appevents.cloudbridge.a.c) {
                            for (Map.Entry entry : parameters.entrySet()) {
                                String rawValue2 = (String) entry.getKey();
                                String str18 = str10;
                                Object value = entry.getValue();
                                com.facebook.appevents.cloudbridge.b.Companion.getClass();
                                Intrinsics.checkNotNullParameter(rawValue2, "rawValue");
                                String str19 = str12;
                                com.facebook.appevents.cloudbridge.b[] values = com.facebook.appevents.cloudbridge.b.values();
                                Map map2 = parameters;
                                int length = values.length;
                                int i5 = 0;
                                while (true) {
                                    if (i5 < length) {
                                        int i6 = i5;
                                        field = values[i6];
                                        int i7 = length;
                                        if (!Intrinsics.areEqual(field.a, rawValue2)) {
                                            i5 = i6 + 1;
                                            length = i7;
                                        }
                                    } else {
                                        field = null;
                                    }
                                }
                                LinkedHashMap linkedHashMap5 = restOfData;
                                if (field != null) {
                                    Intrinsics.checkNotNullParameter(linkedHashMap3, str17);
                                    Intrinsics.checkNotNullParameter(linkedHashMap4, str16);
                                    Intrinsics.checkNotNullParameter(field, "field");
                                    Intrinsics.checkNotNullParameter(value, "value");
                                    Map<com.facebook.appevents.cloudbridge.b, g.b> map3 = com.facebook.appevents.cloudbridge.g.a;
                                    str6 = str16;
                                    g.b bVar2 = map3.get(field);
                                    if (bVar2 != null) {
                                        int ordinal = bVar2.a.ordinal();
                                        if (ordinal != 0) {
                                            str5 = str17;
                                            if (ordinal == 1 && (bVar = map3.get(field)) != null && (i3 = bVar.b) != 0) {
                                                linkedHashMap4.put(m.a(i3), value);
                                            }
                                        } else {
                                            str5 = str17;
                                            if (field == com.facebook.appevents.cloudbridge.b.USER_DATA) {
                                                try {
                                                    Intrinsics.checkNotNull(value, "null cannot be cast to non-null type kotlin.String");
                                                    linkedHashMap3.putAll(E.g(new JSONObject((String) value)));
                                                } catch (JSONException e) {
                                                    u.Companion.getClass();
                                                    u.a.b(g3, "AppEventsConversionsAPITransformer", "\n transformEvents JSONException: \n%s\n%s", value, e);
                                                }
                                            } else {
                                                g.b bVar3 = map3.get(field);
                                                if (bVar3 != null && (i2 = bVar3.b) != 0) {
                                                    linkedHashMap3.put(m.a(i2), value);
                                                }
                                            }
                                        }
                                    } else {
                                        str5 = str17;
                                    }
                                    str7 = str14;
                                    linkedHashMap = linkedHashMap4;
                                } else {
                                    str5 = str17;
                                    str6 = str16;
                                    boolean areEqual = Intrinsics.areEqual(rawValue2, str14);
                                    boolean z2 = value instanceof String;
                                    if (eventType == com.facebook.appevents.cloudbridge.a.b && areEqual && z2) {
                                        Intrinsics.checkNotNull(value, "null cannot be cast to non-null type kotlin.String");
                                        String appEvents = (String) value;
                                        Intrinsics.checkNotNullParameter(appEvents, "appEvents");
                                        ArrayList arrayList2 = new ArrayList();
                                        try {
                                            Iterator it = E.f(new JSONArray(appEvents)).iterator();
                                            while (it.hasNext()) {
                                                arrayList2.add(E.g(new JSONObject((String) it.next())));
                                            }
                                        } catch (JSONException e2) {
                                            str7 = str14;
                                            linkedHashMap = linkedHashMap4;
                                            u.Companion.getClass();
                                            u.a.b(g3, "AppEventsConversionsAPITransformer", "\n transformEvents JSONException: \n%s\n%s", appEvents, e2);
                                        }
                                        if (arrayList2.isEmpty()) {
                                            str7 = str14;
                                            linkedHashMap = linkedHashMap4;
                                            arrayList = null;
                                            if (arrayList != null) {
                                                customEvents.addAll(arrayList);
                                            }
                                        } else {
                                            arrayList = new ArrayList();
                                            Iterator it2 = arrayList2.iterator();
                                            while (it2.hasNext()) {
                                                Map map4 = (Map) it2.next();
                                                LinkedHashMap linkedHashMap6 = new LinkedHashMap();
                                                LinkedHashMap linkedHashMap7 = new LinkedHashMap();
                                                for (String rawValue3 : map4.keySet()) {
                                                    n.Companion.getClass();
                                                    Intrinsics.checkNotNullParameter(rawValue3, "rawValue");
                                                    Iterator it3 = it2;
                                                    n[] values2 = n.values();
                                                    String str20 = str14;
                                                    int length2 = values2.length;
                                                    int i8 = 0;
                                                    while (true) {
                                                        if (i8 < length2) {
                                                            int i9 = i8;
                                                            nVar = values2[i9];
                                                            int i10 = length2;
                                                            if (!Intrinsics.areEqual(nVar.a, rawValue3)) {
                                                                i8 = i9 + 1;
                                                                length2 = i10;
                                                            }
                                                        } else {
                                                            nVar = null;
                                                        }
                                                    }
                                                    g.a aVar4 = com.facebook.appevents.cloudbridge.g.b.get(nVar);
                                                    if (nVar == null || aVar4 == null) {
                                                        linkedHashMap2 = linkedHashMap4;
                                                    } else {
                                                        linkedHashMap2 = linkedHashMap4;
                                                        com.facebook.appevents.cloudbridge.k kVar = aVar4.b;
                                                        com.facebook.appevents.cloudbridge.m mVar = aVar4.a;
                                                        if (mVar == null) {
                                                            try {
                                                                String str21 = kVar.a;
                                                                if (nVar == n.EVENT_NAME && ((String) map4.get(rawValue3)) != null) {
                                                                    Object obj3 = map4.get(rawValue3);
                                                                    Intrinsics.checkNotNull(obj3, "null cannot be cast to non-null type kotlin.String");
                                                                    String str22 = (String) obj3;
                                                                    Map<String, com.facebook.appevents.cloudbridge.l> map5 = com.facebook.appevents.cloudbridge.g.c;
                                                                    if (map5.containsKey(str22)) {
                                                                        com.facebook.appevents.cloudbridge.l lVar = map5.get(str22);
                                                                        str22 = lVar != null ? lVar.a : "";
                                                                    }
                                                                    linkedHashMap7.put(str21, str22);
                                                                } else if (nVar == n.EVENT_TIME && ((Integer) map4.get(rawValue3)) != null) {
                                                                    Object obj4 = map4.get(rawValue3);
                                                                    Intrinsics.checkNotNull(obj4, "null cannot be cast to non-null type kotlin.Any");
                                                                    Object a = com.facebook.appevents.cloudbridge.g.a(obj4, rawValue3);
                                                                    Intrinsics.checkNotNull(a, "null cannot be cast to non-null type kotlin.Any");
                                                                    linkedHashMap7.put(str21, a);
                                                                }
                                                            } catch (ClassCastException e3) {
                                                                u.a aVar5 = u.Companion;
                                                                Object[] objArr = {ExceptionsKt.stackTraceToString(e3)};
                                                                aVar5.getClass();
                                                                u.a.b(g3, "AppEventsConversionsAPITransformer", "\n transformEvents ClassCastException: \n %s ", objArr);
                                                            }
                                                        } else if (mVar == com.facebook.appevents.cloudbridge.m.c) {
                                                            String str23 = kVar.a;
                                                            Object obj5 = map4.get(rawValue3);
                                                            Intrinsics.checkNotNull(obj5, "null cannot be cast to non-null type kotlin.Any");
                                                            Object a2 = com.facebook.appevents.cloudbridge.g.a(obj5, rawValue3);
                                                            Intrinsics.checkNotNull(a2, "null cannot be cast to non-null type kotlin.Any");
                                                            linkedHashMap6.put(str23, a2);
                                                        }
                                                    }
                                                    it2 = it3;
                                                    str14 = str20;
                                                    linkedHashMap4 = linkedHashMap2;
                                                }
                                                Iterator it4 = it2;
                                                String str24 = str14;
                                                LinkedHashMap linkedHashMap8 = linkedHashMap4;
                                                if (!linkedHashMap6.isEmpty()) {
                                                    linkedHashMap7.put("custom_data", linkedHashMap6);
                                                }
                                                arrayList.add(linkedHashMap7);
                                                it2 = it4;
                                                str14 = str24;
                                                linkedHashMap4 = linkedHashMap8;
                                            }
                                            str7 = str14;
                                            linkedHashMap = linkedHashMap4;
                                            if (arrayList != null) {
                                            }
                                        }
                                    } else {
                                        str7 = str14;
                                        linkedHashMap = linkedHashMap4;
                                        com.facebook.appevents.cloudbridge.f.a.getClass();
                                        Intrinsics.checkNotNullParameter(rawValue2, "rawValue");
                                        int[] b = com.bumptech.glide.request.e.b(3);
                                        int length3 = b.length;
                                        int i11 = 0;
                                        while (true) {
                                            if (i11 >= length3) {
                                                i = 0;
                                            } else {
                                                i = b[i11];
                                                if (i == 1) {
                                                    str8 = "data_processing_options";
                                                } else if (i == 2) {
                                                    str8 = "data_processing_options_country";
                                                } else {
                                                    if (i != 3) {
                                                        throw null;
                                                    }
                                                    str8 = "data_processing_options_state";
                                                }
                                                if (!Intrinsics.areEqual(str8, rawValue2)) {
                                                    i11++;
                                                }
                                            }
                                        }
                                        restOfData = linkedHashMap5;
                                        if (i != 0) {
                                            restOfData.put(rawValue2, value);
                                        }
                                        str10 = str18;
                                        str12 = str19;
                                        parameters = map2;
                                        str17 = str5;
                                        str16 = str6;
                                        str14 = str7;
                                        linkedHashMap4 = linkedHashMap;
                                    }
                                }
                                restOfData = linkedHashMap5;
                                str10 = str18;
                                str12 = str19;
                                parameters = map2;
                                str17 = str5;
                                str16 = str6;
                                str14 = str7;
                                linkedHashMap4 = linkedHashMap;
                            }
                        }
                        String str25 = str17;
                        str = str10;
                        String str26 = str16;
                        str3 = str12;
                        Map map6 = parameters;
                        LinkedHashMap linkedHashMap9 = linkedHashMap4;
                        if (eventType == com.facebook.appevents.cloudbridge.a.c) {
                            r0 = 0;
                            z = true;
                        } else {
                            Object obj6 = map6.get("install_timestamp");
                            Intrinsics.checkNotNullParameter(eventType, "eventType");
                            Intrinsics.checkNotNullParameter(linkedHashMap3, str25);
                            Intrinsics.checkNotNullParameter(linkedHashMap9, str26);
                            Intrinsics.checkNotNullParameter(restOfData, "restOfData");
                            Intrinsics.checkNotNullParameter(customEvents, "customEvents");
                            Intrinsics.checkNotNullParameter(linkedHashMap3, str25);
                            Intrinsics.checkNotNullParameter(linkedHashMap9, str26);
                            Intrinsics.checkNotNullParameter(restOfData, "restOfData");
                            LinkedHashMap linkedHashMap10 = new LinkedHashMap();
                            linkedHashMap10.put("action_source", "app");
                            linkedHashMap10.put("user_data", linkedHashMap3);
                            linkedHashMap10.put("app_data", linkedHashMap9);
                            linkedHashMap10.putAll(restOfData);
                            int ordinal2 = eventType.ordinal();
                            if (ordinal2 != 0) {
                                z = true;
                                if (ordinal2 == 1 && !customEvents.isEmpty()) {
                                    r0 = new ArrayList();
                                    Iterator it5 = customEvents.iterator();
                                    while (it5.hasNext()) {
                                        Map map7 = (Map) it5.next();
                                        LinkedHashMap linkedHashMap11 = new LinkedHashMap();
                                        linkedHashMap11.putAll(linkedHashMap10);
                                        linkedHashMap11.putAll(map7);
                                        r0.add(linkedHashMap11);
                                    }
                                }
                            } else {
                                z = true;
                                if (obj6 != null) {
                                    LinkedHashMap linkedHashMap12 = new LinkedHashMap();
                                    linkedHashMap12.putAll(linkedHashMap10);
                                    linkedHashMap12.put("event_name", "MobileAppInstall");
                                    linkedHashMap12.put("event_time", obj6);
                                    r0 = CollectionsKt.listOf(linkedHashMap12);
                                }
                            }
                        }
                        if (r0 != 0) {
                            return;
                        }
                        com.facebook.appevents.cloudbridge.h.b().addAll(r0);
                        int max = Math.max(0, com.facebook.appevents.cloudbridge.h.b().size() - 1000);
                        if (max > 0) {
                            List drop = CollectionsKt.drop(com.facebook.appevents.cloudbridge.h.b(), max);
                            Intrinsics.checkNotNull(drop, "null cannot be cast to non-null type kotlin.collections.MutableList<kotlin.collections.Map<kotlin.String, kotlin.Any>>");
                            List<Map<String, Object>> asMutableList = TypeIntrinsics.asMutableList(drop);
                            Intrinsics.checkNotNullParameter(asMutableList, "<set-?>");
                            com.facebook.appevents.cloudbridge.h.d = asMutableList;
                        }
                        int min = Math.min(com.facebook.appevents.cloudbridge.h.b().size(), 10);
                        List slice = CollectionsKt.slice(com.facebook.appevents.cloudbridge.h.b(), new IntRange(0, min - 1));
                        com.facebook.appevents.cloudbridge.h.b().subList(0, min).clear();
                        JSONArray jSONArray = new JSONArray((Collection) slice);
                        LinkedHashMap linkedHashMap13 = new LinkedHashMap();
                        linkedHashMap13.put("data", jSONArray);
                        h.a aVar6 = com.facebook.appevents.cloudbridge.h.c;
                        if (aVar6 == null) {
                            Intrinsics.throwUninitializedPropertyAccessException(str2);
                            aVar6 = aVar;
                        }
                        linkedHashMap13.put("accessKey", aVar6.c);
                        String jSONObject2 = new JSONObject(linkedHashMap13).toString();
                        Map mapOf = MapsKt.mapOf(TuplesKt.to(RtspHeaders.CONTENT_TYPE, "application/json"));
                        com.facebook.appevents.cloudbridge.j jVar = new com.facebook.appevents.cloudbridge.j(slice);
                        String urlStr = str3;
                        Intrinsics.checkNotNullParameter(urlStr, "urlStr");
                        Intrinsics.checkNotNullParameter("POST", "requestMethod");
                        try {
                            URLConnection openConnection = new URL(urlStr).openConnection();
                            Intrinsics.checkNotNull(openConnection, "null cannot be cast to non-null type java.net.HttpURLConnection");
                            HttpURLConnection httpURLConnection = (HttpURLConnection) openConnection;
                            httpURLConnection.setRequestMethod("POST");
                            if (mapOf != null && (keySet = mapOf.keySet()) != null) {
                                for (String str27 : keySet) {
                                    httpURLConnection.setRequestProperty(str27, (String) mapOf.get(str27));
                                }
                            }
                            httpURLConnection.setDoOutput((httpURLConnection.getRequestMethod().equals("POST") || httpURLConnection.getRequestMethod().equals("PUT")) ? z : false);
                            httpURLConnection.setConnectTimeout(60000);
                            BufferedOutputStream bufferedOutputStream = new BufferedOutputStream(httpURLConnection.getOutputStream());
                            BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter(bufferedOutputStream, "UTF-8"));
                            bufferedWriter.write(jSONObject2);
                            bufferedWriter.flush();
                            bufferedWriter.close();
                            bufferedOutputStream.close();
                            StringBuilder sb2 = new StringBuilder();
                            if (com.facebook.appevents.cloudbridge.h.a.contains(Integer.valueOf(httpURLConnection.getResponseCode()))) {
                                BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(httpURLConnection.getInputStream(), "UTF-8"));
                                while (true) {
                                    try {
                                        String readLine = bufferedReader.readLine();
                                        if (readLine != null) {
                                            sb2.append(readLine);
                                        } else {
                                            Unit unit = Unit.INSTANCE;
                                            CloseableKt.closeFinally(bufferedReader, aVar);
                                        }
                                    } catch (Throwable th) {
                                        try {
                                            throw th;
                                        } catch (Throwable th2) {
                                            CloseableKt.closeFinally(bufferedReader, th);
                                            throw th2;
                                        }
                                    }
                                }
                            }
                            String sb3 = sb2.toString();
                            Intrinsics.checkNotNullExpressionValue(sb3, "connResponseSB.toString()");
                            u.a aVar7 = u.Companion;
                            Object[] objArr2 = {sb3, Integer.valueOf(httpURLConnection.getResponseCode())};
                            aVar7.getClass();
                            str4 = str;
                            try {
                                u.a.b(g3, str4, "\nResponse Received: \n%s\n%s", objArr2);
                                jVar.invoke(sb3, Integer.valueOf(httpURLConnection.getResponseCode()));
                                return;
                            } catch (UnknownHostException e4) {
                                e = e4;
                                u.a aVar8 = u.Companion;
                                Object[] objArr3 = {e.toString()};
                                aVar8.getClass();
                                u.a.b(g3, str4, "Connection failed, retrying: \n%s", objArr3);
                                jVar.invoke(null, 503);
                                return;
                            } catch (IOException e5) {
                                e = e5;
                                u.a aVar9 = u.Companion;
                                Object[] objArr4 = {e.toString()};
                                aVar9.getClass();
                                u.a.b(g, str4, "Send to server failed: \n%s", objArr4);
                                return;
                            }
                        } catch (UnknownHostException e6) {
                            e = e6;
                            str4 = str;
                            u.a aVar82 = u.Companion;
                            Object[] objArr32 = {e.toString()};
                            aVar82.getClass();
                            u.a.b(g3, str4, "Connection failed, retrying: \n%s", objArr32);
                            jVar.invoke(null, 503);
                            return;
                        } catch (IOException e7) {
                            e = e7;
                            str4 = str;
                            u.a aVar92 = u.Companion;
                            Object[] objArr42 = {e.toString()};
                            aVar92.getClass();
                            u.a.b(g, str4, "Send to server failed: \n%s", objArr42);
                            return;
                        }
                    }
                    g = g2;
                    str = "CAPITransformerWebRequests";
                    str2 = "credentials";
                    str3 = str12;
                    z = true;
                    aVar = null;
                    r0 = aVar;
                    if (r0 != 0) {
                    }
                } catch (UninitializedPropertyAccessException e8) {
                    u.Companion.getClass();
                    u.a.b(g2, "CAPITransformerWebRequests", "\n Credentials not initialized Error when logging: \n%s", e8);
                    return;
                }
                break;
        }
    }
}
