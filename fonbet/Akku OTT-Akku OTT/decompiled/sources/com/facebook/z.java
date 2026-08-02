package com.facebook;

import android.database.Cursor;
import android.graphics.Bitmap;
import android.net.Uri;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.Parcel;
import android.os.ParcelFileDescriptor;
import android.os.Parcelable;
import android.text.TextUtils;
import android.util.Pair;
import androidx.browser.trusted.sharing.ShareTarget;
import com.facebook.D;
import com.facebook.E;
import com.facebook.internal.u;
import com.google.android.exoplayer2.source.rtsp.RtspHeaders;
import com.razorpay.C$0o__;
import io.flutter.plugins.firebase.crashlytics.Constants;
import java.io.BufferedOutputStream;
import java.io.Closeable;
import java.io.FilterOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;
import java.net.URLEncoder;
import java.nio.charset.Charset;
import java.security.SecureRandom;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.zip.GZIPOutputStream;
import kotlin.collections.ArraysKt;
import kotlin.jvm.JvmField;
import kotlin.jvm.JvmOverloads;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.jvm.internal.StringCompanionObject;
import kotlin.text.Charsets;
import kotlin.text.StringsKt__StringsJVMKt;
import kotlin.text.StringsKt__StringsKt;
import kotlin.time.DurationKt;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes3.dex */
public final class z {
    public static final c Companion = new c();
    public static final String j;
    public static final Pattern k;
    public static volatile String l;
    public final C0688a a;
    public final String b;
    public JSONObject c;
    public Bundle d;
    public String e;
    public final String f;
    public b g;
    public F h;
    public boolean i;

    public static final class a {
        public final z a;
        public final Object b;

        public a(z request, Object obj) {
            Intrinsics.checkNotNullParameter(request, "request");
            this.a = request;
            this.b = obj;
        }
    }

    public interface b {
        void a(E e);
    }

    @SourceDebugExtension({"SMAP\nGraphRequest.kt\nKotlin\n*S Kotlin\n*F\n+ 1 GraphRequest.kt\ncom/facebook/GraphRequest$Companion\n+ 2 _Maps.kt\nkotlin/collections/MapsKt___MapsKt\n*L\n1#1,1994:1\n215#2,2:1995\n*S KotlinDebug\n*F\n+ 1 GraphRequest.kt\ncom/facebook/GraphRequest$Companion\n*L\n1311#1:1995,2\n*E\n"})
    public static final class c {
        public static final String a(c cVar, Object obj) {
            cVar.getClass();
            if (obj instanceof String) {
                return (String) obj;
            }
            if ((obj instanceof Boolean) || (obj instanceof Number)) {
                return obj.toString();
            }
            if (!(obj instanceof Date)) {
                throw new IllegalArgumentException("Unsupported parameter type.");
            }
            String format = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ssZ", Locale.US).format((Date) obj);
            Intrinsics.checkNotNullExpressionValue(format, "iso8601DateFormat.format(value)");
            return format;
        }

        public static HttpURLConnection b(URL url) throws IOException {
            URLConnection openConnection = url.openConnection();
            Intrinsics.checkNotNull(openConnection, "null cannot be cast to non-null type java.net.HttpURLConnection");
            HttpURLConnection httpURLConnection = (HttpURLConnection) openConnection;
            if (z.l == null) {
                StringCompanionObject stringCompanionObject = StringCompanionObject.INSTANCE;
                z.l = androidx.credentials.provider.p.a(new Object[]{"FBAndroidSDK", "18.3.0"}, 2, "%s.%s", "format(format, *args)");
                com.facebook.internal.E e = com.facebook.internal.E.a;
            }
            httpURLConnection.setRequestProperty(RtspHeaders.USER_AGENT, z.l);
            httpURLConnection.setRequestProperty("Accept-Language", Locale.getDefault().toString());
            httpURLConnection.setChunkedStreamingMode(0);
            return httpURLConnection;
        }

        @JvmStatic
        public static ArrayList c(D requests) {
            Exception exc;
            HttpURLConnection httpURLConnection;
            ArrayList arrayList;
            Intrinsics.checkNotNullParameter(requests, "requests");
            com.facebook.internal.F.d(requests);
            HttpURLConnection httpURLConnection2 = null;
            try {
                httpURLConnection = o(requests);
                exc = null;
            } catch (Exception e) {
                exc = e;
                httpURLConnection = null;
            } catch (Throwable th) {
                th = th;
                com.facebook.internal.E.j(httpURLConnection2);
                throw th;
            }
            try {
                if (httpURLConnection != null) {
                    arrayList = d(requests, httpURLConnection);
                } else {
                    E.a aVar = E.Companion;
                    ArrayList arrayList2 = requests.c;
                    C0728q c0728q = new C0728q(exc);
                    aVar.getClass();
                    ArrayList a = E.a.a(arrayList2, null, c0728q);
                    l(requests, a);
                    arrayList = a;
                }
                com.facebook.internal.E.j(httpURLConnection);
                return arrayList;
            } catch (Throwable th2) {
                th = th2;
                httpURLConnection2 = httpURLConnection;
                com.facebook.internal.E.j(httpURLConnection2);
                throw th;
            }
        }

        /* JADX WARN: Code restructure failed: missing block: B:29:0x0040, code lost:
        
            r0.close();
         */
        /* JADX WARN: Code restructure failed: missing block: B:48:0x0078, code lost:
        
            if (0 == 0) goto L29;
         */
        /* JADX WARN: Code restructure failed: missing block: B:53:0x0063, code lost:
        
            if (0 == 0) goto L29;
         */
        /* JADX WARN: Code restructure failed: missing block: B:9:0x003e, code lost:
        
            if (r0 != null) goto L55;
         */
        @JvmStatic
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public static ArrayList d(D requests, HttpURLConnection connection) {
            ArrayList a;
            Intrinsics.checkNotNullParameter(connection, "connection");
            Intrinsics.checkNotNullParameter(requests, "requests");
            E.Companion.getClass();
            G g = G.a;
            Intrinsics.checkNotNullParameter(connection, "connection");
            Intrinsics.checkNotNullParameter(requests, "requests");
            InputStream inputStream = null;
            try {
                try {
                    if (!w.g()) {
                        throw new C0728q("GraphRequest can't be used when Facebook SDK isn't fully initialized");
                    }
                    inputStream = connection.getResponseCode() >= 400 ? connection.getErrorStream() : connection.getInputStream();
                    a = E.a.c(inputStream, connection, requests);
                } catch (C0728q e) {
                    com.facebook.internal.u.Companion.getClass();
                    u.a.b(g, "Response", "Response <Error>: %s", e);
                    a = E.a.a(requests, connection, e);
                    com.facebook.internal.E e2 = com.facebook.internal.E.a;
                } catch (Exception e3) {
                    com.facebook.internal.u.Companion.getClass();
                    u.a.b(g, "Response", "Response <Error>: %s", e3);
                    a = E.a.a(requests, connection, new C0728q(e3));
                    com.facebook.internal.E e4 = com.facebook.internal.E.a;
                }
                com.facebook.internal.E.j(connection);
                int size = requests.c.size();
                if (size != a.size()) {
                    StringCompanionObject stringCompanionObject = StringCompanionObject.INSTANCE;
                    String format = String.format(Locale.US, "Received %d responses while expecting %d", Arrays.copyOf(new Object[]{Integer.valueOf(a.size()), Integer.valueOf(size)}, 2));
                    Intrinsics.checkNotNullExpressionValue(format, "format(locale, format, *args)");
                    throw new C0728q(format);
                }
                l(requests, a);
                C0717k a2 = C0717k.Companion.a();
                C0688a c0688a = a2.c;
                if (c0688a != null) {
                    long time = new Date().getTime();
                    if (c0688a.f.a && time - a2.e.getTime() > DurationKt.MILLIS_IN_HOUR && time - c0688a.i.getTime() > DurationKt.MILLIS_IN_DAY) {
                        if (Intrinsics.areEqual(Looper.getMainLooper(), Looper.myLooper())) {
                            a2.a();
                        } else {
                            new Handler(Looper.getMainLooper()).post(new RunnableC0699d(a2, 0));
                        }
                    }
                }
                return a;
            } catch (Throwable th) {
                com.facebook.internal.E e5 = com.facebook.internal.E.a;
                if (0 != 0) {
                    try {
                        inputStream.close();
                    } catch (IOException unused) {
                    }
                }
                throw th;
            }
        }

        public static boolean e(Object obj) {
            return (obj instanceof Bitmap) || (obj instanceof byte[]) || (obj instanceof Uri) || (obj instanceof ParcelFileDescriptor) || (obj instanceof f);
        }

        public static boolean f(Object obj) {
            return (obj instanceof String) || (obj instanceof Boolean) || (obj instanceof Number) || (obj instanceof Date);
        }

        @JvmStatic
        public static z g(C0688a c0688a, String str, b bVar) {
            return new z(c0688a, str, null, null, bVar, 32);
        }

        @JvmStatic
        public static z h(C0688a c0688a, String str, JSONObject jSONObject, b bVar) {
            z zVar = new z(c0688a, str, null, F.b, bVar, 32);
            zVar.c = jSONObject;
            return zVar;
        }

        /* JADX WARN: Code restructure failed: missing block: B:7:0x0027, code lost:
        
            if (r0 != false) goto L12;
         */
        /* JADX WARN: Removed duplicated region for block: B:12:0x004c  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public static void i(JSONObject jSONObject, String str, d dVar) {
            String str2;
            boolean startsWith$default;
            int indexOf$default;
            int indexOf$default2;
            boolean z;
            Iterator<String> keys;
            boolean z2;
            boolean equals;
            boolean startsWith$default2;
            Matcher matcher = z.k.matcher(str);
            if (matcher.matches()) {
                str2 = matcher.group(1);
                Intrinsics.checkNotNullExpressionValue(str2, "matcher.group(1)");
            } else {
                str2 = str;
            }
            startsWith$default = StringsKt__StringsJVMKt.startsWith$default(str2, "me/", false, 2, null);
            if (!startsWith$default) {
                startsWith$default2 = StringsKt__StringsJVMKt.startsWith$default(str2, "/me/", false, 2, null);
            }
            indexOf$default = StringsKt__StringsKt.indexOf$default(str, ":", 0, false, 6, (Object) null);
            indexOf$default2 = StringsKt__StringsKt.indexOf$default(str, "?", 0, false, 6, (Object) null);
            if (indexOf$default > 3 && (indexOf$default2 == -1 || indexOf$default < indexOf$default2)) {
                z = true;
                keys = jSONObject.keys();
                while (keys.hasNext()) {
                    String key = keys.next();
                    Object value = jSONObject.opt(key);
                    if (z) {
                        equals = StringsKt__StringsJVMKt.equals(key, "image", true);
                        if (equals) {
                            z2 = true;
                            Intrinsics.checkNotNullExpressionValue(key, "key");
                            Intrinsics.checkNotNullExpressionValue(value, "value");
                            j(key, value, dVar, z2);
                        }
                    }
                    z2 = false;
                    Intrinsics.checkNotNullExpressionValue(key, "key");
                    Intrinsics.checkNotNullExpressionValue(value, "value");
                    j(key, value, dVar, z2);
                }
            }
            z = false;
            keys = jSONObject.keys();
            while (keys.hasNext()) {
            }
        }

        public static void j(String str, Object obj, d dVar, boolean z) {
            Class<?> cls = obj.getClass();
            if (JSONObject.class.isAssignableFrom(cls)) {
                Intrinsics.checkNotNull(obj, "null cannot be cast to non-null type org.json.JSONObject");
                JSONObject jSONObject = (JSONObject) obj;
                if (z) {
                    Iterator<String> keys = jSONObject.keys();
                    while (keys.hasNext()) {
                        String next = keys.next();
                        StringCompanionObject stringCompanionObject = StringCompanionObject.INSTANCE;
                        String a = androidx.credentials.provider.p.a(new Object[]{str, next}, 2, "%s[%s]", "format(format, *args)");
                        Object opt = jSONObject.opt(next);
                        Intrinsics.checkNotNullExpressionValue(opt, "jsonObject.opt(propertyName)");
                        j(a, opt, dVar, z);
                    }
                    return;
                }
                if (jSONObject.has("id")) {
                    String optString = jSONObject.optString("id");
                    Intrinsics.checkNotNullExpressionValue(optString, "jsonObject.optString(\"id\")");
                    j(str, optString, dVar, z);
                    return;
                } else if (jSONObject.has("url")) {
                    String optString2 = jSONObject.optString("url");
                    Intrinsics.checkNotNullExpressionValue(optString2, "jsonObject.optString(\"url\")");
                    j(str, optString2, dVar, z);
                    return;
                } else {
                    if (jSONObject.has("fbsdk:create_object")) {
                        String jSONObject2 = jSONObject.toString();
                        Intrinsics.checkNotNullExpressionValue(jSONObject2, "jsonObject.toString()");
                        j(str, jSONObject2, dVar, z);
                        return;
                    }
                    return;
                }
            }
            if (JSONArray.class.isAssignableFrom(cls)) {
                Intrinsics.checkNotNull(obj, "null cannot be cast to non-null type org.json.JSONArray");
                JSONArray jSONArray = (JSONArray) obj;
                int length = jSONArray.length();
                for (int i = 0; i < length; i++) {
                    StringCompanionObject stringCompanionObject2 = StringCompanionObject.INSTANCE;
                    String format = String.format(Locale.ROOT, "%s[%d]", Arrays.copyOf(new Object[]{str, Integer.valueOf(i)}, 2));
                    Intrinsics.checkNotNullExpressionValue(format, "format(locale, format, *args)");
                    Object opt2 = jSONArray.opt(i);
                    Intrinsics.checkNotNullExpressionValue(opt2, "jsonArray.opt(i)");
                    j(format, opt2, dVar, z);
                }
                return;
            }
            if (String.class.isAssignableFrom(cls) || Number.class.isAssignableFrom(cls) || Boolean.class.isAssignableFrom(cls)) {
                dVar.a(str, obj.toString());
                return;
            }
            if (!Date.class.isAssignableFrom(cls)) {
                c cVar = z.Companion;
                com.facebook.internal.E e = com.facebook.internal.E.a;
                w wVar = w.a;
            } else {
                Intrinsics.checkNotNull(obj, "null cannot be cast to non-null type java.util.Date");
                String format2 = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ssZ", Locale.US).format((Date) obj);
                Intrinsics.checkNotNullExpressionValue(format2, "iso8601DateFormat.format(date)");
                dVar.a(str, format2);
            }
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r7v0 */
        /* JADX WARN: Type inference failed for: r7v1, types: [boolean, int] */
        /* JADX WARN: Type inference failed for: r7v5 */
        public static void k(D requests, com.facebook.internal.u uVar, int i, URL url, OutputStream outputStream, boolean z) {
            String b;
            g gVar = new g(outputStream, uVar, z);
            ?? r7 = 1;
            if (i == 1) {
                z zVar = (z) requests.c.get(0);
                HashMap hashMap = new HashMap();
                for (String key : zVar.d.keySet()) {
                    Object obj = zVar.d.get(key);
                    if (e(obj)) {
                        Intrinsics.checkNotNullExpressionValue(key, "key");
                        hashMap.put(key, new a(zVar, obj));
                    }
                }
                if (uVar != null) {
                    Intrinsics.checkNotNullParameter("  Parameters:\n", "string");
                    uVar.c();
                }
                Bundle bundle = zVar.d;
                for (String key2 : bundle.keySet()) {
                    Object obj2 = bundle.get(key2);
                    if (f(obj2)) {
                        Intrinsics.checkNotNullExpressionValue(key2, "key");
                        gVar.g(key2, obj2, zVar);
                    }
                }
                if (uVar != null) {
                    Intrinsics.checkNotNullParameter("  Attachments:\n", "string");
                    uVar.c();
                }
                m(hashMap, gVar);
                JSONObject jSONObject = zVar.c;
                if (jSONObject != null) {
                    String path = url.getPath();
                    Intrinsics.checkNotNullExpressionValue(path, "url.path");
                    i(jSONObject, path, gVar);
                    return;
                }
                return;
            }
            requests.getClass();
            Iterator<z> it = requests.iterator();
            while (true) {
                if (it.hasNext()) {
                    C0688a c0688a = it.next().a;
                    if (c0688a != null) {
                        b = c0688a.j;
                        break;
                    }
                } else {
                    c cVar = z.Companion;
                    b = w.b();
                    break;
                }
            }
            if (b.length() == 0) {
                throw new C0728q("App ID was not specified at the request or Settings.");
            }
            gVar.a("batch_app_id", b);
            HashMap hashMap2 = new HashMap();
            JSONArray requestJsonArray = new JSONArray();
            Iterator<z> it2 = requests.iterator();
            while (it2.hasNext()) {
                z next = it2.next();
                next.getClass();
                JSONObject jSONObject2 = new JSONObject();
                int i2 = com.facebook.internal.A.a;
                StringCompanionObject stringCompanionObject = StringCompanionObject.INSTANCE;
                String format = String.format("https://graph.%s", Arrays.copyOf(new Object[]{w.e()}, (int) r7));
                Intrinsics.checkNotNullExpressionValue(format, "format(format, *args)");
                String h = next.h(format);
                next.a();
                Uri parse = Uri.parse(next.b(h, r7));
                String a = androidx.credentials.provider.p.a(new Object[]{parse.getPath(), parse.getQuery()}, 2, "%s?%s", "format(format, *args)");
                jSONObject2.put("relative_url", a);
                jSONObject2.put("method", next.h);
                C0688a c0688a2 = next.a;
                if (c0688a2 != null) {
                    com.facebook.internal.u.Companion.d(c0688a2.e);
                }
                ArrayList arrayList = new ArrayList();
                Iterator<String> it3 = next.d.keySet().iterator();
                while (it3.hasNext()) {
                    Object obj3 = next.d.get(it3.next());
                    z.Companion.getClass();
                    if (e(obj3)) {
                        StringCompanionObject stringCompanionObject2 = StringCompanionObject.INSTANCE;
                        String format2 = String.format(Locale.ROOT, "%s%d", Arrays.copyOf(new Object[]{Constants.FILE, Integer.valueOf(hashMap2.size())}, 2));
                        Intrinsics.checkNotNullExpressionValue(format2, "format(locale, format, *args)");
                        arrayList.add(format2);
                        hashMap2.put(format2, new a(next, obj3));
                        it2 = it2;
                    }
                }
                Iterator<z> it4 = it2;
                if (!arrayList.isEmpty()) {
                    jSONObject2.put("attached_files", TextUtils.join(",", arrayList));
                }
                JSONObject jSONObject3 = next.c;
                if (jSONObject3 != null) {
                    ArrayList arrayList2 = new ArrayList();
                    c cVar2 = z.Companion;
                    B b2 = new B(arrayList2);
                    cVar2.getClass();
                    i(jSONObject3, a, b2);
                    jSONObject2.put("body", TextUtils.join("&", arrayList2));
                }
                requestJsonArray.put(jSONObject2);
                it2 = it4;
                r7 = 1;
            }
            Intrinsics.checkNotNullParameter("batch", Constants.KEY);
            Intrinsics.checkNotNullParameter(requestJsonArray, "requestJsonArray");
            Intrinsics.checkNotNullParameter(requests, "requests");
            Closeable closeable = gVar.a;
            if (closeable instanceof N) {
                Intrinsics.checkNotNull(closeable, "null cannot be cast to non-null type com.facebook.RequestOutputStream");
                N n = (N) closeable;
                gVar.c("batch", null, null);
                gVar.b("[", new Object[0]);
                Iterator<z> it5 = requests.iterator();
                int i3 = 0;
                while (it5.hasNext()) {
                    int i4 = i3 + 1;
                    z next2 = it5.next();
                    JSONObject jSONObject4 = requestJsonArray.getJSONObject(i3);
                    n.d(next2);
                    if (i3 > 0) {
                        gVar.b(",%s", jSONObject4.toString());
                    } else {
                        gVar.b("%s", jSONObject4.toString());
                    }
                    i3 = i4;
                }
                gVar.b("]", new Object[0]);
                com.facebook.internal.u uVar2 = gVar.b;
                if (uVar2 != null) {
                    String jSONArray = requestJsonArray.toString();
                    Intrinsics.checkNotNullExpressionValue(jSONArray, "requestJsonArray.toString()");
                    uVar2.a(jSONArray, "    batch");
                }
            } else {
                String jSONArray2 = requestJsonArray.toString();
                Intrinsics.checkNotNullExpressionValue(jSONArray2, "requestJsonArray.toString()");
                gVar.a("batch", jSONArray2);
            }
            if (uVar != null) {
                Intrinsics.checkNotNullParameter("  Attachments:\n", "string");
                uVar.c();
            }
            m(hashMap2, gVar);
        }

        @JvmStatic
        public static void l(D requests, ArrayList responses) {
            Intrinsics.checkNotNullParameter(requests, "requests");
            Intrinsics.checkNotNullParameter(responses, "responses");
            int size = requests.c.size();
            ArrayList arrayList = new ArrayList();
            for (int i = 0; i < size; i++) {
                z zVar = (z) requests.c.get(i);
                if (zVar.g != null) {
                    arrayList.add(new Pair(zVar.g, responses.get(i)));
                }
            }
            if (arrayList.size() > 0) {
                androidx.fragment.app.strictmode.a aVar = new androidx.fragment.app.strictmode.a(1, arrayList, requests);
                Handler handler = requests.a;
                if (handler != null) {
                    handler.post(aVar);
                } else {
                    aVar.run();
                }
            }
        }

        public static void m(HashMap hashMap, g gVar) {
            for (Map.Entry entry : hashMap.entrySet()) {
                c cVar = z.Companion;
                Object obj = ((a) entry.getValue()).b;
                cVar.getClass();
                if (e(obj)) {
                    gVar.g((String) entry.getKey(), ((a) entry.getValue()).b, ((a) entry.getValue()).a);
                }
            }
        }

        /* JADX WARN: Code restructure failed: missing block: B:36:0x012a, code lost:
        
            r7 = new com.facebook.L(r13.a);
            k(r13, null, r3, r6, r7, r8);
            r1 = r13;
            r3 = r3;
            r13 = r6;
         */
        /* JADX WARN: Code restructure failed: missing block: B:37:0x0141, code lost:
        
            r6 = r14;
         */
        /* JADX WARN: Code restructure failed: missing block: B:39:0x0144, code lost:
        
            r5 = new com.facebook.M(r6, r1, r7.b, r7.e);
         */
        /* JADX WARN: Code restructure failed: missing block: B:40:0x0147, code lost:
        
            r6 = r8;
         */
        /* JADX WARN: Code restructure failed: missing block: B:56:0x014a, code lost:
        
            r0 = th;
         */
        /* JADX WARN: Code restructure failed: missing block: B:57:0x014b, code lost:
        
            r13 = r0;
         */
        /* JADX WARN: Code restructure failed: missing block: B:60:0x014e, code lost:
        
            r0 = th;
         */
        /* JADX WARN: Code restructure failed: missing block: B:61:0x014f, code lost:
        
            r6 = r14;
         */
        /* JADX WARN: Code restructure failed: missing block: B:67:0x0114, code lost:
        
            r0 = r13.iterator();
         */
        /* JADX WARN: Code restructure failed: missing block: B:69:0x011c, code lost:
        
            if (r0.hasNext() == false) goto L94;
         */
        /* JADX WARN: Code restructure failed: missing block: B:71:0x0128, code lost:
        
            if ((r0.next().g instanceof com.facebook.z.e) == false) goto L57;
         */
        /* JADX WARN: Code restructure failed: missing block: B:74:0x0153, code lost:
        
            r1 = r13;
            r13 = r6;
            r5 = r14;
            r6 = r8;
         */
        /* JADX WARN: Removed duplicated region for block: B:52:0x016f  */
        /* JADX WARN: Removed duplicated region for block: B:54:? A[SYNTHETIC] */
        @JvmStatic
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public static void n(D requests, HttpURLConnection connection) throws IOException, JSONException {
            boolean z;
            Throwable th;
            FilterOutputStream gZIPOutputStream;
            FilterOutputStream filterOutputStream;
            D d;
            URL url;
            FilterOutputStream filterOutputStream2;
            boolean z2;
            Intrinsics.checkNotNullParameter(requests, "requests");
            Intrinsics.checkNotNullParameter(connection, "connection");
            com.facebook.internal.u uVar = new com.facebook.internal.u();
            int size = requests.c.size();
            Iterator<z> it = requests.iterator();
            loop0: while (true) {
                if (!it.hasNext()) {
                    z = true;
                    break;
                }
                z next = it.next();
                Iterator<String> it2 = next.d.keySet().iterator();
                while (it2.hasNext()) {
                    if (e(next.d.get(it2.next()))) {
                        z = false;
                        break loop0;
                    }
                }
            }
            FilterOutputStream filterOutputStream3 = null;
            F f = size == 1 ? ((z) requests.c.get(0)).h : null;
            F f2 = F.b;
            if (f == null) {
                f = f2;
            }
            connection.setRequestMethod(f.name());
            if (z) {
                connection.setRequestProperty(RtspHeaders.CONTENT_TYPE, ShareTarget.ENCODING_TYPE_URL_ENCODED);
                connection.setRequestProperty(RtspHeaders.CONTENT_ENCODING, "gzip");
            } else {
                StringCompanionObject stringCompanionObject = StringCompanionObject.INSTANCE;
                connection.setRequestProperty(RtspHeaders.CONTENT_TYPE, androidx.credentials.provider.p.a(new Object[]{z.j}, 1, "multipart/form-data; boundary=%s", "format(format, *args)"));
            }
            boolean z3 = z;
            URL url2 = connection.getURL();
            Intrinsics.checkNotNullParameter("Request:\n", "string");
            uVar.c();
            uVar.a(requests.b, "Id");
            Intrinsics.checkNotNullExpressionValue(url2, "url");
            uVar.a(url2, C$0o__.URL);
            String requestMethod = connection.getRequestMethod();
            Intrinsics.checkNotNullExpressionValue(requestMethod, "connection.requestMethod");
            uVar.a(requestMethod, "Method");
            String requestProperty = connection.getRequestProperty(RtspHeaders.USER_AGENT);
            Intrinsics.checkNotNullExpressionValue(requestProperty, "connection.getRequestProperty(\"User-Agent\")");
            uVar.a(requestProperty, RtspHeaders.USER_AGENT);
            String requestProperty2 = connection.getRequestProperty(RtspHeaders.CONTENT_TYPE);
            Intrinsics.checkNotNullExpressionValue(requestProperty2, "connection.getRequestProperty(\"Content-Type\")");
            uVar.a(requestProperty2, RtspHeaders.CONTENT_TYPE);
            connection.setConnectTimeout(0);
            connection.setReadTimeout(0);
            if (f != f2) {
                uVar.b();
                return;
            }
            connection.setDoOutput(true);
            try {
                BufferedOutputStream bufferedOutputStream = new BufferedOutputStream(connection.getOutputStream());
                if (z3) {
                    try {
                        gZIPOutputStream = new GZIPOutputStream(bufferedOutputStream);
                    } catch (Throwable th2) {
                        th = th2;
                        filterOutputStream3 = bufferedOutputStream;
                        if (filterOutputStream3 != null) {
                        }
                    }
                } else {
                    gZIPOutputStream = bufferedOutputStream;
                }
                try {
                    Iterator it3 = requests.d.iterator();
                    while (true) {
                        if (!it3.hasNext()) {
                            break;
                        }
                        try {
                            if (!(((D.a) it3.next()) instanceof D.c)) {
                            }
                        } catch (Throwable th3) {
                            th = th3;
                            filterOutputStream = gZIPOutputStream;
                            filterOutputStream3 = filterOutputStream;
                            if (filterOutputStream3 != null) {
                                throw th;
                            }
                            filterOutputStream3.close();
                            throw th;
                        }
                    }
                    try {
                        k(d, uVar, size, url, filterOutputStream2, z2);
                        filterOutputStream2.close();
                        uVar.b();
                    } catch (Throwable th4) {
                        th = th4;
                        filterOutputStream3 = filterOutputStream2;
                        th = th;
                        if (filterOutputStream3 != null) {
                        }
                    }
                } catch (Throwable th5) {
                    th = th5;
                    filterOutputStream = gZIPOutputStream;
                }
            } catch (Throwable th6) {
                th = th6;
            }
        }

        @JvmStatic
        public static HttpURLConnection o(D requests) {
            URL url;
            Intrinsics.checkNotNullParameter(requests, "requests");
            Intrinsics.checkNotNullParameter(requests, "requests");
            Iterator<z> it = requests.iterator();
            while (it.hasNext()) {
                z next = it.next();
                if (F.a == next.h && com.facebook.internal.E.z(next.d.getString("fields"))) {
                    u.a aVar = com.facebook.internal.u.Companion;
                    StringBuilder sb = new StringBuilder("GET requests for /");
                    String str = next.b;
                    if (str == null) {
                        str = "";
                    }
                    sb.append(str);
                    sb.append(" should contain an explicit \"fields\" parameter.");
                    String sb2 = sb.toString();
                    aVar.getClass();
                    u.a.c(G.e, "Request", sb2);
                }
            }
            try {
                if (requests.c.size() == 1) {
                    url = new URL(((z) requests.c.get(0)).g());
                } else {
                    int i = com.facebook.internal.A.a;
                    StringCompanionObject stringCompanionObject = StringCompanionObject.INSTANCE;
                    String format = String.format("https://graph.%s", Arrays.copyOf(new Object[]{w.e()}, 1));
                    Intrinsics.checkNotNullExpressionValue(format, "format(format, *args)");
                    url = new URL(format);
                }
                HttpURLConnection httpURLConnection = null;
                try {
                    httpURLConnection = b(url);
                    n(requests, httpURLConnection);
                    return httpURLConnection;
                } catch (IOException e) {
                    com.facebook.internal.E.j(httpURLConnection);
                    throw new C0728q("could not construct request body", e);
                } catch (JSONException e2) {
                    com.facebook.internal.E.j(httpURLConnection);
                    throw new C0728q("could not construct request body", e2);
                }
            } catch (MalformedURLException e3) {
                throw new C0728q("could not construct URL for request", e3);
            }
        }
    }

    public interface d {
        void a(String str, String str2);
    }

    public interface e extends b {
        void b();
    }

    public static final class g implements d {
        public final OutputStream a;
        public final com.facebook.internal.u b;
        public boolean c;
        public final boolean d;

        public g(OutputStream outputStream, com.facebook.internal.u uVar, boolean z) {
            Intrinsics.checkNotNullParameter(outputStream, "outputStream");
            this.a = outputStream;
            this.b = uVar;
            this.c = true;
            this.d = z;
        }

        @Override // com.facebook.z.d
        public final void a(String key, String value) {
            Intrinsics.checkNotNullParameter(key, "key");
            Intrinsics.checkNotNullParameter(value, "value");
            c(key, null, null);
            f("%s", value);
            h();
            com.facebook.internal.u uVar = this.b;
            if (uVar != null) {
                uVar.a(value, "    " + key);
            }
        }

        public final void b(String format, Object... args) {
            Intrinsics.checkNotNullParameter(format, "format");
            Intrinsics.checkNotNullParameter(args, "args");
            boolean z = this.d;
            OutputStream outputStream = this.a;
            if (z) {
                StringCompanionObject stringCompanionObject = StringCompanionObject.INSTANCE;
                Locale locale = Locale.US;
                Object[] copyOf = Arrays.copyOf(args, args.length);
                String format2 = String.format(locale, format, Arrays.copyOf(copyOf, copyOf.length));
                Intrinsics.checkNotNullExpressionValue(format2, "format(locale, format, *args)");
                String encode = URLEncoder.encode(format2, "UTF-8");
                Intrinsics.checkNotNullExpressionValue(encode, "encode(String.format(Loc… format, *args), \"UTF-8\")");
                byte[] bytes = encode.getBytes(Charsets.UTF_8);
                Intrinsics.checkNotNullExpressionValue(bytes, "this as java.lang.String).getBytes(charset)");
                outputStream.write(bytes);
                return;
            }
            if (this.c) {
                Charset charset = Charsets.UTF_8;
                byte[] bytes2 = "--".getBytes(charset);
                Intrinsics.checkNotNullExpressionValue(bytes2, "this as java.lang.String).getBytes(charset)");
                outputStream.write(bytes2);
                byte[] bytes3 = z.j.getBytes(charset);
                Intrinsics.checkNotNullExpressionValue(bytes3, "this as java.lang.String).getBytes(charset)");
                outputStream.write(bytes3);
                byte[] bytes4 = "\r\n".getBytes(charset);
                Intrinsics.checkNotNullExpressionValue(bytes4, "this as java.lang.String).getBytes(charset)");
                outputStream.write(bytes4);
                this.c = false;
            }
            StringCompanionObject stringCompanionObject2 = StringCompanionObject.INSTANCE;
            Object[] copyOf2 = Arrays.copyOf(args, args.length);
            byte[] bytes5 = androidx.credentials.provider.p.a(copyOf2, copyOf2.length, format, "format(format, *args)").getBytes(Charsets.UTF_8);
            Intrinsics.checkNotNullExpressionValue(bytes5, "this as java.lang.String).getBytes(charset)");
            outputStream.write(bytes5);
        }

        public final void c(String str, String str2, String str3) {
            if (this.d) {
                StringCompanionObject stringCompanionObject = StringCompanionObject.INSTANCE;
                byte[] bytes = androidx.credentials.provider.p.a(new Object[]{str}, 1, "%s=", "format(format, *args)").getBytes(Charsets.UTF_8);
                Intrinsics.checkNotNullExpressionValue(bytes, "this as java.lang.String).getBytes(charset)");
                this.a.write(bytes);
                return;
            }
            b("Content-Disposition: form-data; name=\"%s\"", str);
            if (str2 != null) {
                b("; filename=\"%s\"", str2);
            }
            f("", new Object[0]);
            if (str3 != null) {
                f("%s: %s", RtspHeaders.CONTENT_TYPE, str3);
            }
            f("", new Object[0]);
        }

        public final void d(Uri contentUri, String key, String str) {
            int i;
            long j;
            Intrinsics.checkNotNullParameter(key, "key");
            Intrinsics.checkNotNullParameter(contentUri, "contentUri");
            if (str == null) {
                str = "content/unknown";
            }
            c(key, key, str);
            OutputStream outputStream = this.a;
            if (outputStream instanceof L) {
                com.facebook.internal.E e = com.facebook.internal.E.a;
                Intrinsics.checkNotNullParameter(contentUri, "contentUri");
                Cursor cursor = null;
                try {
                    cursor = w.a().getContentResolver().query(contentUri, null, null, null, null);
                    if (cursor == null) {
                        j = 0;
                    } else {
                        int columnIndex = cursor.getColumnIndex("_size");
                        cursor.moveToFirst();
                        long j2 = cursor.getLong(columnIndex);
                        cursor.close();
                        j = j2;
                    }
                    ((L) outputStream).l(j);
                    i = 0;
                } finally {
                }
            } else {
                i = com.facebook.internal.E.i(w.a().getContentResolver().openInputStream(contentUri), outputStream);
            }
            f("", new Object[0]);
            h();
            com.facebook.internal.u uVar = this.b;
            if (uVar != null) {
                String a = defpackage.g.a("    ", key);
                StringCompanionObject stringCompanionObject = StringCompanionObject.INSTANCE;
                String format = String.format(Locale.ROOT, "<Data: %d>", Arrays.copyOf(new Object[]{Integer.valueOf(i)}, 1));
                Intrinsics.checkNotNullExpressionValue(format, "format(locale, format, *args)");
                uVar.a(format, a);
            }
        }

        public final void e(String key, ParcelFileDescriptor descriptor, String str) {
            int i;
            Intrinsics.checkNotNullParameter(key, "key");
            Intrinsics.checkNotNullParameter(descriptor, "descriptor");
            if (str == null) {
                str = "content/unknown";
            }
            c(key, key, str);
            OutputStream outputStream = this.a;
            if (outputStream instanceof L) {
                ((L) outputStream).l(descriptor.getStatSize());
                i = 0;
            } else {
                i = com.facebook.internal.E.i(new ParcelFileDescriptor.AutoCloseInputStream(descriptor), outputStream);
            }
            f("", new Object[0]);
            h();
            com.facebook.internal.u uVar = this.b;
            if (uVar != null) {
                String a = defpackage.g.a("    ", key);
                StringCompanionObject stringCompanionObject = StringCompanionObject.INSTANCE;
                String format = String.format(Locale.ROOT, "<Data: %d>", Arrays.copyOf(new Object[]{Integer.valueOf(i)}, 1));
                Intrinsics.checkNotNullExpressionValue(format, "format(locale, format, *args)");
                uVar.a(format, a);
            }
        }

        public final void f(String format, Object... args) {
            Intrinsics.checkNotNullParameter(format, "format");
            Intrinsics.checkNotNullParameter(args, "args");
            b(format, Arrays.copyOf(args, args.length));
            if (this.d) {
                return;
            }
            b("\r\n", new Object[0]);
        }

        /* JADX WARN: Multi-variable type inference failed */
        public final void g(String key, Object obj, z zVar) {
            Intrinsics.checkNotNullParameter(key, "key");
            OutputStream outputStream = this.a;
            if (outputStream instanceof N) {
                Intrinsics.checkNotNull(outputStream, "null cannot be cast to non-null type com.facebook.RequestOutputStream");
                ((N) outputStream).d(zVar);
            }
            c cVar = z.Companion;
            cVar.getClass();
            if (c.f(obj)) {
                a(key, c.a(cVar, obj));
                return;
            }
            boolean z = obj instanceof Bitmap;
            com.facebook.internal.u uVar = this.b;
            if (z) {
                Bitmap bitmap = (Bitmap) obj;
                Intrinsics.checkNotNullParameter(key, "key");
                Intrinsics.checkNotNullParameter(bitmap, "bitmap");
                c(key, key, "image/png");
                bitmap.compress(Bitmap.CompressFormat.PNG, 100, outputStream);
                f("", new Object[0]);
                h();
                if (uVar != null) {
                    uVar.a("<Image>", "    " + key);
                    return;
                }
                return;
            }
            if (obj instanceof byte[]) {
                byte[] bytes = (byte[]) obj;
                Intrinsics.checkNotNullParameter(key, "key");
                Intrinsics.checkNotNullParameter(bytes, "bytes");
                c(key, key, "content/unknown");
                outputStream.write(bytes);
                f("", new Object[0]);
                h();
                if (uVar != null) {
                    String a = defpackage.g.a("    ", key);
                    StringCompanionObject stringCompanionObject = StringCompanionObject.INSTANCE;
                    String format = String.format(Locale.ROOT, "<Data: %d>", Arrays.copyOf(new Object[]{Integer.valueOf(bytes.length)}, 1));
                    Intrinsics.checkNotNullExpressionValue(format, "format(locale, format, *args)");
                    uVar.a(format, a);
                    return;
                }
                return;
            }
            if (obj instanceof Uri) {
                d((Uri) obj, key, null);
                return;
            }
            if (obj instanceof ParcelFileDescriptor) {
                e(key, (ParcelFileDescriptor) obj, null);
                return;
            }
            if (!(obj instanceof f)) {
                throw new IllegalArgumentException("value is not a supported type.");
            }
            f fVar = (f) obj;
            RESOURCE resource = fVar.b;
            String str = fVar.a;
            if (resource instanceof ParcelFileDescriptor) {
                e(key, (ParcelFileDescriptor) resource, str);
            } else {
                if (!(resource instanceof Uri)) {
                    throw new IllegalArgumentException("value is not a supported type.");
                }
                d((Uri) resource, key, str);
            }
        }

        public final void h() {
            if (!this.d) {
                f("--%s", z.j);
                return;
            }
            byte[] bytes = "&".getBytes(Charsets.UTF_8);
            Intrinsics.checkNotNullExpressionValue(bytes, "this as java.lang.String).getBytes(charset)");
            this.a.write(bytes);
        }
    }

    static {
        char[] charArray = "-_1234567890abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ".toCharArray();
        Intrinsics.checkNotNullExpressionValue(charArray, "this as java.lang.String).toCharArray()");
        StringBuilder sb = new StringBuilder();
        SecureRandom secureRandom = new SecureRandom();
        int nextInt = secureRandom.nextInt(11) + 30;
        for (int i = 0; i < nextInt; i++) {
            sb.append(charArray[secureRandom.nextInt(charArray.length)]);
        }
        String sb2 = sb.toString();
        Intrinsics.checkNotNullExpressionValue(sb2, "buffer.toString()");
        j = sb2;
        k = Pattern.compile("^/?v\\d+\\.\\d+/(.*)");
    }

    @JvmOverloads
    public z() {
        this(null, null, null, null, null, 63);
    }

    public static String f() {
        String b2 = w.b();
        com.facebook.internal.F.f();
        String str = w.g;
        if (str == null) {
            throw new C0728q("A valid Facebook client token must be set in the AndroidManifest.xml or set by calling FacebookSdk.setClientToken before initializing the sdk. Visit https://developers.facebook.com/docs/android/getting-started#add-app_id for more information.");
        }
        if (b2.length() <= 0 || str.length() <= 0) {
            com.facebook.internal.E e2 = com.facebook.internal.E.a;
            return null;
        }
        return b2 + '|' + str;
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0023, code lost:
    
        if (i() != false) goto L20;
     */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0054  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void a() {
        boolean startsWith$default;
        Bundle bundle = this.d;
        String e2 = e();
        boolean contains$default = e2 != null ? StringsKt__StringsKt.contains$default(e2, "|", false, 2, (Object) null) : false;
        if (e2 != null) {
            startsWith$default = StringsKt__StringsJVMKt.startsWith$default(e2, "IG", false, 2, null);
            if (startsWith$default) {
                if (!contains$default) {
                }
            }
        }
        if ((Intrinsics.areEqual(w.e(), "instagram.com") ? true ^ i() : true) || contains$default) {
            String e3 = e();
            if (e3 != null) {
                bundle.putString("access_token", e3);
            }
            if (!bundle.containsKey("access_token")) {
                w wVar = w.a;
                com.facebook.internal.F.f();
                if (w.g == null) {
                    throw new C0728q("A valid Facebook client token must be set in the AndroidManifest.xml or set by calling FacebookSdk.setClientToken before initializing the sdk. Visit https://developers.facebook.com/docs/android/getting-started#add-app_id for more information.");
                }
                com.facebook.internal.E e4 = com.facebook.internal.E.a;
            }
            bundle.putString("sdk", "android");
            bundle.putString("format", "json");
            w.h(G.i);
            w.h(G.f);
        }
        bundle.putString("access_token", f());
        if (!bundle.containsKey("access_token")) {
        }
        bundle.putString("sdk", "android");
        bundle.putString("format", "json");
        w.h(G.i);
        w.h(G.f);
    }

    public final String b(String str, boolean z) {
        if (!z && this.h == F.b) {
            return str;
        }
        Uri.Builder buildUpon = Uri.parse(str).buildUpon();
        for (String str2 : this.d.keySet()) {
            Object obj = this.d.get(str2);
            if (obj == null) {
                obj = "";
            }
            c cVar = Companion;
            cVar.getClass();
            if (c.f(obj)) {
                buildUpon.appendQueryParameter(str2, c.a(cVar, obj).toString());
            } else if (this.h != F.a) {
                StringCompanionObject stringCompanionObject = StringCompanionObject.INSTANCE;
                String format = String.format(Locale.US, "Unsupported parameter type for GET request: %s", Arrays.copyOf(new Object[]{obj.getClass().getSimpleName()}, 1));
                Intrinsics.checkNotNullExpressionValue(format, "format(locale, format, *args)");
                throw new IllegalArgumentException(format);
            }
        }
        String builder = buildUpon.toString();
        Intrinsics.checkNotNullExpressionValue(builder, "uriBuilder.toString()");
        return builder;
    }

    public final E c() {
        Companion.getClass();
        Intrinsics.checkNotNullParameter(this, "request");
        z[] requests = {this};
        Intrinsics.checkNotNullParameter(requests, "requests");
        List requests2 = ArraysKt.toList(requests);
        Intrinsics.checkNotNullParameter(requests2, "requests");
        ArrayList c2 = c.c(new D(requests2));
        if (c2.size() == 1) {
            return (E) c2.get(0);
        }
        throw new C0728q("invalid state: expected a single response");
    }

    public final C d() {
        z[] requests = {this};
        Companion.getClass();
        Intrinsics.checkNotNullParameter(requests, "requests");
        List requests2 = ArraysKt.toList(requests);
        Intrinsics.checkNotNullParameter(requests2, "requests");
        D requests3 = new D(requests2);
        Intrinsics.checkNotNullParameter(requests3, "requests");
        com.facebook.internal.F.d(requests3);
        C c2 = new C(requests3);
        c2.executeOnExecutor(w.c(), new Void[0]);
        return c2;
    }

    public final String e() {
        C0688a c0688a = this.a;
        if (c0688a != null) {
            if (!this.d.containsKey("access_token")) {
                String str = c0688a.e;
                com.facebook.internal.u.Companion.d(str);
                return str;
            }
        } else if (!this.d.containsKey("access_token")) {
            return f();
        }
        return this.d.getString("access_token");
    }

    public final String g() {
        String a2;
        String str;
        boolean endsWith$default;
        if (this.h == F.b && (str = this.b) != null) {
            endsWith$default = StringsKt__StringsJVMKt.endsWith$default(str, "/videos", false, 2, null);
            if (endsWith$default) {
                int i = com.facebook.internal.A.a;
                StringCompanionObject stringCompanionObject = StringCompanionObject.INSTANCE;
                a2 = androidx.credentials.provider.p.a(new Object[]{w.e()}, 1, "https://graph-video.%s", "format(format, *args)");
                String h = h(a2);
                a();
                return b(h, false);
            }
        }
        String subdomain = w.e();
        int i2 = com.facebook.internal.A.a;
        Intrinsics.checkNotNullParameter(subdomain, "subdomain");
        StringCompanionObject stringCompanionObject2 = StringCompanionObject.INSTANCE;
        a2 = androidx.credentials.provider.p.a(new Object[]{subdomain}, 1, "https://graph.%s", "format(format, *args)");
        String h2 = h(a2);
        a();
        return b(h2, false);
    }

    public final String h(String str) {
        if (!(!Intrinsics.areEqual(w.e(), "instagram.com") ? true : !i())) {
            int i = com.facebook.internal.A.a;
            StringCompanionObject stringCompanionObject = StringCompanionObject.INSTANCE;
            str = androidx.credentials.provider.p.a(new Object[]{w.s}, 1, "https://graph.%s", "format(format, *args)");
        }
        StringCompanionObject stringCompanionObject2 = StringCompanionObject.INSTANCE;
        Pattern pattern = k;
        String str2 = this.b;
        if (!pattern.matcher(str2).matches()) {
            str2 = androidx.credentials.provider.p.a(new Object[]{this.f, str2}, 2, "%s/%s", "format(format, *args)");
        }
        return androidx.credentials.provider.p.a(new Object[]{str, str2}, 2, "%s/%s", "format(format, *args)");
    }

    public final boolean i() {
        String str = this.b;
        if (str == null) {
            return false;
        }
        StringBuilder sb = new StringBuilder("^/?");
        sb.append(w.b());
        sb.append("/?.*");
        return this.i || Pattern.matches(sb.toString(), str) || Pattern.matches("^/?app/?.*", str);
    }

    public final void j(b bVar) {
        w.h(G.i);
        w.h(G.f);
        this.g = bVar;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("{Request:  accessToken: ");
        Object obj = this.a;
        if (obj == null) {
            obj = "null";
        }
        sb.append(obj);
        sb.append(", graphPath: ");
        sb.append(this.b);
        sb.append(", graphObject: ");
        sb.append(this.c);
        sb.append(", httpMethod: ");
        sb.append(this.h);
        sb.append(", parameters: ");
        sb.append(this.d);
        sb.append("}");
        String sb2 = sb.toString();
        Intrinsics.checkNotNullExpressionValue(sb2, "StringBuilder()\n        …(\"}\")\n        .toString()");
        return sb2;
    }

    public z(C0688a c0688a, String str, Bundle bundle, F f2, b bVar, int i) {
        c0688a = (i & 1) != 0 ? null : c0688a;
        str = (i & 2) != 0 ? null : str;
        bundle = (i & 4) != 0 ? null : bundle;
        f2 = (i & 8) != 0 ? null : f2;
        bVar = (i & 16) != 0 ? null : bVar;
        this.a = c0688a;
        this.b = str;
        this.f = null;
        j(bVar);
        this.h = f2 == null ? F.a : f2;
        if (bundle != null) {
            this.d = new Bundle(bundle);
        } else {
            this.d = new Bundle();
        }
        this.f = w.d();
    }

    public static final class f<RESOURCE extends Parcelable> implements Parcelable {
        public final String a;
        public final RESOURCE b;
        public static final b Companion = new b();

        @JvmField
        public static final Parcelable.Creator<f<?>> CREATOR = new a();

        public static final class a implements Parcelable.Creator<f<?>> {
            @Override // android.os.Parcelable.Creator
            public final f<?> createFromParcel(Parcel source) {
                Intrinsics.checkNotNullParameter(source, "source");
                return new f<>(source);
            }

            @Override // android.os.Parcelable.Creator
            public final f<?>[] newArray(int i) {
                return new f[i];
            }
        }

        public static final class b {
        }

        /* JADX WARN: Multi-variable type inference failed */
        public f(Parcelable parcelable) {
            this.a = "image/png";
            this.b = parcelable;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 1;
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel out, int i) {
            Intrinsics.checkNotNullParameter(out, "out");
            out.writeString(this.a);
            out.writeParcelable(this.b, i);
        }

        public f(Parcel parcel) {
            this.a = parcel.readString();
            this.b = (RESOURCE) parcel.readParcelable(w.a().getClassLoader());
        }
    }
}
