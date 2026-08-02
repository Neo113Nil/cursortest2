package com.facebook;

import androidx.core.os.EnvironmentCompat;
import com.facebook.C0688a;
import com.facebook.C0717k;
import com.facebook.internal.u;
import com.google.firebase.messaging.Constants;
import java.io.IOException;
import java.io.InputStream;
import java.net.HttpURLConnection;
import java.util.AbstractList;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;
import java.util.Iterator;
import java.util.Locale;
import kotlin.collections.CollectionsKt__IterablesKt;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.jvm.internal.StringCompanionObject;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import org.json.JSONTokener;

/* loaded from: classes3.dex */
public final class E {
    public static final a Companion = new a();
    public final HttpURLConnection a;
    public final JSONObject b;
    public final t c;
    public final JSONObject d;

    @SourceDebugExtension({"SMAP\nGraphResponse.kt\nKotlin\n*S Kotlin\n*F\n+ 1 GraphResponse.kt\ncom/facebook/GraphResponse$Companion\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,359:1\n1549#2:360\n1620#2,3:361\n*S KotlinDebug\n*F\n+ 1 GraphResponse.kt\ncom/facebook/GraphResponse$Companion\n*L\n355#1:360\n355#1:361,3\n*E\n"})
    public static final class a {
        @JvmStatic
        public static ArrayList a(AbstractList requests, HttpURLConnection httpURLConnection, C0728q c0728q) {
            int collectionSizeOrDefault;
            Intrinsics.checkNotNullParameter(requests, "requests");
            collectionSizeOrDefault = CollectionsKt__IterablesKt.collectionSizeOrDefault(requests, 10);
            ArrayList arrayList = new ArrayList(collectionSizeOrDefault);
            Iterator it = requests.iterator();
            while (it.hasNext()) {
                arrayList.add(new E((z) it.next(), httpURLConnection, new t(c0728q)));
            }
            return arrayList;
        }

        /* JADX WARN: Removed duplicated region for block: B:33:0x0129  */
        /* JADX WARN: Removed duplicated region for block: B:52:0x01b8  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public static E b(z request, HttpURLConnection httpURLConnection, Object obj, Object obj2) throws JSONException {
            t tVar;
            int optInt;
            String str;
            boolean z;
            int optInt2;
            String str2;
            String str3;
            String str4;
            Object NULL = obj;
            if (NULL instanceof JSONObject) {
                JSONObject singleResult = (JSONObject) NULL;
                t.Companion.getClass();
                Intrinsics.checkNotNullParameter(singleResult, "singleResult");
                if (singleResult.has("code")) {
                    int i = singleResult.getInt("code");
                    Object s = com.facebook.internal.E.s(singleResult, "body", "FACEBOOK_NON_JSON_RESULT");
                    if (s != null && (s instanceof JSONObject)) {
                        if (((JSONObject) s).has(Constants.IPC_BUNDLE_KEY_SEND_ERROR)) {
                            JSONObject jSONObject = (JSONObject) com.facebook.internal.E.s((JSONObject) s, Constants.IPC_BUNDLE_KEY_SEND_ERROR, null);
                            String optString = jSONObject != null ? jSONObject.optString("type", null) : null;
                            String optString2 = jSONObject != null ? jSONObject.optString(io.flutter.plugins.firebase.crashlytics.Constants.MESSAGE, null) : null;
                            int optInt3 = jSONObject != null ? jSONObject.optInt("code", -1) : -1;
                            int optInt4 = jSONObject != null ? jSONObject.optInt("error_subcode", -1) : -1;
                            String optString3 = jSONObject != null ? jSONObject.optString("error_user_msg", null) : null;
                            str2 = jSONObject != null ? jSONObject.optString("error_user_title", null) : null;
                            str = optString2;
                            str3 = optString3;
                            z = jSONObject != null ? jSONObject.optBoolean("is_transient", false) : false;
                            optInt2 = optInt4;
                            r14 = true;
                            str4 = optString;
                            optInt = optInt3;
                        } else {
                            if (!((JSONObject) s).has("error_code") && !((JSONObject) s).has("error_msg") && !((JSONObject) s).has("error_reason")) {
                                z = false;
                                optInt2 = -1;
                                optInt = -1;
                                str4 = null;
                                str = null;
                                str2 = null;
                                str3 = null;
                            }
                            String optString4 = ((JSONObject) s).optString("error_reason", null);
                            String optString5 = ((JSONObject) s).optString("error_msg", null);
                            optInt = ((JSONObject) s).optInt("error_code", -1);
                            str = optString5;
                            z = false;
                            optInt2 = ((JSONObject) s).optInt("error_subcode", -1);
                            r14 = true;
                            str2 = null;
                            str3 = null;
                            str4 = optString4;
                        }
                        if (r14) {
                            tVar = new t(i, optInt, optInt2, str4, str, str2, str3, obj2, null, z);
                            if (tVar != null) {
                                tVar.toString();
                                if (tVar.b == 190) {
                                    C0688a c0688a = request.a;
                                    com.facebook.internal.E e = com.facebook.internal.E.a;
                                    if (c0688a != null) {
                                        C0688a.Companion.getClass();
                                        if (Intrinsics.areEqual(c0688a, C0688a.b.b())) {
                                            if (tVar.c != 493) {
                                                C0717k.Companion.a().c(null, true);
                                            } else {
                                                C0688a b = C0688a.b.b();
                                                if (b != null && !new Date().after(b.a)) {
                                                    C0717k.a aVar = C0717k.Companion;
                                                    C0688a current = aVar.a().c;
                                                    if (current != null) {
                                                        Intrinsics.checkNotNullParameter(current, "current");
                                                        aVar.a().c(new C0688a(current.e, current.j, current.k, current.b, current.c, current.d, current.f, new Date(), new Date(), current.l), true);
                                                    }
                                                }
                                            }
                                        }
                                    }
                                }
                                return new E(request, httpURLConnection, tVar);
                            }
                            Object s2 = com.facebook.internal.E.s(singleResult, "body", "FACEBOOK_NON_JSON_RESULT");
                            if (s2 instanceof JSONObject) {
                                JSONObject jSONObject2 = (JSONObject) s2;
                                return new E(request, httpURLConnection, jSONObject2.toString(), jSONObject2);
                            }
                            if (s2 instanceof JSONArray) {
                                JSONArray graphObjects = (JSONArray) s2;
                                String rawResponse = graphObjects.toString();
                                Intrinsics.checkNotNullParameter(request, "request");
                                Intrinsics.checkNotNullParameter(rawResponse, "rawResponse");
                                Intrinsics.checkNotNullParameter(graphObjects, "graphObjects");
                                return new E(request, httpURLConnection, null, graphObjects, null);
                            }
                            NULL = JSONObject.NULL;
                            Intrinsics.checkNotNullExpressionValue(NULL, "NULL");
                        }
                    }
                    if (i > 299 || 200 > i) {
                        if (singleResult.has("body")) {
                        }
                        tVar = new t(i, -1, -1, null, null, null, null, obj2, null, false);
                        if (tVar != null) {
                        }
                    }
                }
                tVar = null;
                if (tVar != null) {
                }
            }
            if (NULL == JSONObject.NULL) {
                return new E(request, httpURLConnection, NULL.toString(), null);
            }
            throw new C0728q("Got unexpected object type in response, class: ".concat(NULL.getClass().getSimpleName()));
        }

        /* JADX WARN: Removed duplicated region for block: B:11:0x0093  */
        @JvmStatic
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public static ArrayList c(InputStream inputStream, HttpURLConnection httpURLConnection, D requests) throws C0728q, JSONException, IOException {
            Object obj;
            Intrinsics.checkNotNullParameter(requests, "requests");
            String responseString = com.facebook.internal.E.H(inputStream);
            u.a aVar = com.facebook.internal.u.Companion;
            Object[] objArr = {Integer.valueOf(responseString.length()), responseString};
            aVar.getClass();
            u.a.b(G.c, "Response", "Response (raw)\n  Size: %d\n  Response:\n%s\n", objArr);
            Intrinsics.checkNotNullParameter(responseString, "responseString");
            Intrinsics.checkNotNullParameter(requests, "requests");
            Object resultObject = new JSONTokener(responseString).nextValue();
            Intrinsics.checkNotNullExpressionValue(resultObject, "resultObject");
            int size = requests.c.size();
            ArrayList arrayList = new ArrayList(size);
            if (size == 1) {
                z zVar = (z) requests.get(0);
                try {
                    JSONObject jSONObject = new JSONObject();
                    jSONObject.put("body", resultObject);
                    jSONObject.put("code", httpURLConnection != null ? httpURLConnection.getResponseCode() : 200);
                    JSONArray jSONArray = new JSONArray();
                    jSONArray.put(jSONObject);
                    obj = jSONArray;
                } catch (IOException e) {
                    arrayList.add(new E(zVar, httpURLConnection, new t(e)));
                } catch (JSONException e2) {
                    arrayList.add(new E(zVar, httpURLConnection, new t(e2)));
                }
                if (obj instanceof JSONArray) {
                    JSONArray jSONArray2 = (JSONArray) obj;
                    if (jSONArray2.length() == size) {
                        int length = jSONArray2.length();
                        for (int i = 0; i < length; i++) {
                            z zVar2 = (z) requests.get(i);
                            try {
                                Object obj2 = ((JSONArray) obj).get(i);
                                Intrinsics.checkNotNullExpressionValue(obj2, "obj");
                                arrayList.add(b(zVar2, httpURLConnection, obj2, resultObject));
                            } catch (C0728q e3) {
                                arrayList.add(new E(zVar2, httpURLConnection, new t(e3)));
                            } catch (JSONException e4) {
                                arrayList.add(new E(zVar2, httpURLConnection, new t(e4)));
                            }
                        }
                        u.a aVar2 = com.facebook.internal.u.Companion;
                        Object[] objArr2 = {requests.b, Integer.valueOf(responseString.length()), arrayList};
                        aVar2.getClass();
                        u.a.b(G.a, "Response", "Response\n  Id: %s\n  Size: %d\n  Responses:\n%s\n", objArr2);
                        return arrayList;
                    }
                }
                throw new C0728q("Unexpected number of results");
            }
            obj = resultObject;
            if (obj instanceof JSONArray) {
            }
            throw new C0728q("Unexpected number of results");
        }
    }

    public E(z request, HttpURLConnection httpURLConnection, JSONObject jSONObject, JSONArray jSONArray, t tVar) {
        Intrinsics.checkNotNullParameter(request, "request");
        this.a = httpURLConnection;
        this.b = jSONObject;
        this.c = tVar;
        this.d = jSONObject;
    }

    public final String toString() {
        String str;
        try {
            StringCompanionObject stringCompanionObject = StringCompanionObject.INSTANCE;
            Locale locale = Locale.US;
            HttpURLConnection httpURLConnection = this.a;
            str = String.format(locale, "%d", Arrays.copyOf(new Object[]{Integer.valueOf(httpURLConnection != null ? httpURLConnection.getResponseCode() : 200)}, 1));
            Intrinsics.checkNotNullExpressionValue(str, "format(locale, format, *args)");
        } catch (IOException unused) {
            str = EnvironmentCompat.MEDIA_UNKNOWN;
        }
        StringBuilder a2 = androidx.appcompat.view.a.a("{Response:  responseCode: ", str, ", graphObject: ");
        a2.append(this.b);
        a2.append(", error: ");
        a2.append(this.c);
        a2.append("}");
        String sb = a2.toString();
        Intrinsics.checkNotNullExpressionValue(sb, "StringBuilder()\n        …(\"}\")\n        .toString()");
        return sb;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public E(z request, HttpURLConnection httpURLConnection, String rawResponse, JSONObject jSONObject) {
        this(request, httpURLConnection, jSONObject, null, null);
        Intrinsics.checkNotNullParameter(request, "request");
        Intrinsics.checkNotNullParameter(rawResponse, "rawResponse");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public E(z request, HttpURLConnection httpURLConnection, t error) {
        this(request, httpURLConnection, null, null, error);
        Intrinsics.checkNotNullParameter(request, "request");
        Intrinsics.checkNotNullParameter(error, "error");
    }
}
