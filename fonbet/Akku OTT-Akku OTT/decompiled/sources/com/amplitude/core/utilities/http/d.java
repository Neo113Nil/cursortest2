package com.amplitude.core.utilities.http;

import androidx.browser.trusted.sharing.ShareTarget;
import androidx.compose.runtime.t;
import androidx.core.view.accessibility.AccessibilityNodeInfoCompat;
import com.google.android.exoplayer2.source.rtsp.RtspHeaders;
import com.google.firebase.messaging.Constants;
import j$.util.DesugarTimeZone;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import kotlin.TuplesKt;
import kotlin.collections.CollectionsKt;
import kotlin.collections.MapsKt;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;
import kotlin.io.CloseableKt;
import kotlin.io.TextStreamsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.ranges.IntRange;
import kotlin.text.Charsets;
import org.json.JSONObject;

@SourceDebugExtension({"SMAP\nHttpClient.kt\nKotlin\n*S Kotlin\n*F\n+ 1 HttpClient.kt\ncom/amplitude/core/utilities/http/HttpClient\n+ 2 _Maps.kt\nkotlin/collections/MapsKt___MapsKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,172:1\n215#2,2:173\n215#2,2:175\n1#3:177\n*S KotlinDebug\n*F\n+ 1 HttpClient.kt\ncom/amplitude/core/utilities/http/HttpClient\n*L\n62#1:173,2\n65#1:175,2\n*E\n"})
/* loaded from: classes3.dex */
public final class d implements e {
    public final com.amplitude.android.h a;
    public final com.amplitude.common.a b;

    public static final class a {
        public static final C0046a Companion = new C0046a();
        public static final Map<String, String> g = MapsKt.mapOf(TuplesKt.to(RtspHeaders.CONTENT_TYPE, "application/json; charset=utf-8"), TuplesKt.to(RtspHeaders.ACCEPT, "application/json"));
        public final String a;
        public final b b;
        public final Map<String, String> c;
        public final String d;
        public final int e;
        public final int f;

        /* renamed from: com.amplitude.core.utilities.http.d$a$a, reason: collision with other inner class name */
        public static final class C0046a {
        }

        /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
        /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
        public static final class b {
            public static final b a;
            public static final /* synthetic */ b[] b;
            public static final /* synthetic */ EnumEntries c;

            static {
                b bVar = new b(ShareTarget.METHOD_GET, 0);
                b bVar2 = new b("POST", 1);
                a = bVar2;
                b[] bVarArr = {bVar, bVar2, new b("PUT", 2), new b("DELETE", 3), new b("PATCH", 4)};
                b = bVarArr;
                c = EnumEntriesKt.enumEntries(bVarArr);
            }

            public b() {
                throw null;
            }

            public static b valueOf(String str) {
                return (b) Enum.valueOf(b.class, str);
            }

            public static b[] values() {
                return (b[]) b.clone();
            }
        }

        public a() {
            throw null;
        }

        public a(String url, String str) {
            b method = b.a;
            Map<String, String> headers = MapsKt.emptyMap();
            Intrinsics.checkNotNullParameter(url, "url");
            Intrinsics.checkNotNullParameter(method, "method");
            Intrinsics.checkNotNullParameter(headers, "headers");
            this.a = url;
            this.b = method;
            this.c = headers;
            this.d = str;
            this.e = 15000;
            this.f = AccessibilityNodeInfoCompat.EXTRA_DATA_TEXT_CHARACTER_LOCATION_ARG_MAX_LENGTH;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return Intrinsics.areEqual(this.a, aVar.a) && this.b == aVar.b && Intrinsics.areEqual(this.c, aVar.c) && Intrinsics.areEqual(this.d, aVar.d) && this.e == aVar.e && this.f == aVar.f;
        }

        public final int hashCode() {
            int hashCode = (this.c.hashCode() + ((this.b.hashCode() + (this.a.hashCode() * 31)) * 31)) * 31;
            String str = this.d;
            return Integer.hashCode(this.f) + androidx.collection.g.a(this.e, (hashCode + (str == null ? 0 : str.hashCode())) * 31, 31);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("Request(url=");
            sb.append(this.a);
            sb.append(", method=");
            sb.append(this.b);
            sb.append(", headers=");
            sb.append(this.c);
            sb.append(", body=");
            sb.append(this.d);
            sb.append(", connectTimeoutMs=");
            sb.append(this.e);
            sb.append(", readTimeoutMs=");
            return androidx.collection.i.c(sb, this.f, ')');
        }
    }

    public static final class b {
        public final int a;
        public final String b;
        public final Map<String, List<String>> c;
        public final String d;

        /* JADX WARN: Multi-variable type inference failed */
        public b(int i, String str, Map<String, ? extends List<String>> headers, String str2) {
            Intrinsics.checkNotNullParameter(headers, "headers");
            this.a = i;
            this.b = str;
            this.c = headers;
            this.d = str2;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof b)) {
                return false;
            }
            b bVar = (b) obj;
            return this.a == bVar.a && Intrinsics.areEqual(this.b, bVar.b) && Intrinsics.areEqual(this.c, bVar.c) && Intrinsics.areEqual(this.d, bVar.d);
        }

        public final int hashCode() {
            int hashCode = Integer.hashCode(this.a) * 31;
            String str = this.b;
            int hashCode2 = (this.c.hashCode() + ((hashCode + (str == null ? 0 : str.hashCode())) * 31)) * 31;
            String str2 = this.d;
            return hashCode2 + (str2 != null ? str2.hashCode() : 0);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("Response(statusCode=");
            sb.append(this.a);
            sb.append(", body=");
            sb.append(this.b);
            sb.append(", headers=");
            sb.append(this.c);
            sb.append(", statusMessage=");
            return t.b(')', this.d, sb);
        }
    }

    public d(com.amplitude.android.h configuration, com.amplitude.common.a logger) {
        Intrinsics.checkNotNullParameter(configuration, "configuration");
        Intrinsics.checkNotNullParameter(logger, "logger");
        this.a = configuration;
        this.b = logger;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r10v0, types: [com.amplitude.core.utilities.http.d] */
    /* JADX WARN: Type inference failed for: r3v3, types: [java.net.URL] */
    /* JADX WARN: Type inference failed for: r3v5, types: [java.net.HttpURLConnection] */
    /* JADX WARN: Type inference failed for: r3v7, types: [java.net.HttpURLConnection, java.net.URLConnection] */
    /* JADX WARN: Type inference failed for: r5v11 */
    /* JADX WARN: Type inference failed for: r5v12, types: [java.io.InputStream] */
    /* JADX WARN: Type inference failed for: r5v13 */
    /* JADX WARN: Type inference failed for: r5v19 */
    /* JADX WARN: Type inference failed for: r5v20 */
    @Override // com.amplitude.core.utilities.http.e
    public final com.amplitude.core.utilities.http.a a(String events, String str) {
        b bVar;
        int last;
        int i;
        int last2;
        String str2;
        IntRange intRange;
        IntRange intRange2;
        IntRange intRange3;
        JSONObject jSONObject;
        int responseCode;
        String responseMessage;
        InputStream inputStream;
        Intrinsics.checkNotNullParameter(events, "events");
        com.amplitude.android.h hVar = this.a;
        String str3 = hVar.n;
        if (str3 == null) {
            com.amplitude.core.i iVar = hVar.m;
            com.amplitude.core.i iVar2 = com.amplitude.core.i.b;
            str3 = (iVar == iVar2 && hVar.l) ? "https://api.eu.amplitude.com/batch" : iVar == iVar2 ? "https://api.eu.amplitude.com/2/httpapi" : hVar.l ? "https://api2.amplitude.com/batch" : "https://api2.amplitude.com/2/httpapi";
        }
        String apiKey = hVar.a;
        Integer num = hVar.i;
        long currentTimeMillis = System.currentTimeMillis();
        Intrinsics.checkNotNullParameter(apiKey, "apiKey");
        Intrinsics.checkNotNullParameter(events, "events");
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss.SSS'Z'", Locale.US);
        simpleDateFormat.setTimeZone(DesugarTimeZone.getTimeZone("UTC"));
        StringBuilder sb = new StringBuilder();
        StringBuilder a2 = androidx.appcompat.view.a.a("{\"api_key\":\"", apiKey, "\",\"client_upload_time\":\"");
        String format = simpleDateFormat.format(new Date(currentTimeMillis));
        Intrinsics.checkNotNullExpressionValue(format, "format(...)");
        a2.append(format);
        a2.append("\",\"events\":");
        a2.append(events);
        sb.append(a2.toString());
        if (num != null) {
            sb.append(",\"options\":{\"min_id_length\":" + num + '}');
        }
        if (str != null) {
            sb.append(",\"request_metadata\":{\"sdk\":" + str + '}');
        }
        sb.append("}");
        String sb2 = sb.toString();
        Intrinsics.checkNotNullExpressionValue(sb2, "toString(...)");
        a.b bVar2 = a.b.a;
        a request = new a(str3, sb2);
        String str4 = request.a;
        com.amplitude.common.a aVar = this.b;
        Intrinsics.checkNotNullParameter(request, "request");
        try {
            ?? url = new URL(str4);
            try {
                try {
                    URLConnection openConnection = url.openConnection();
                    Intrinsics.checkNotNull(openConnection, "null cannot be cast to non-null type java.net.HttpURLConnection");
                    url = (HttpURLConnection) openConnection;
                    try {
                        url.setRequestMethod(request.b.name());
                        url.setConnectTimeout(request.e);
                        url.setReadTimeout(request.f);
                        url.setDoInput(true);
                        a.Companion.getClass();
                        for (Map.Entry<String, String> entry : a.g.entrySet()) {
                            url.setRequestProperty(entry.getKey(), entry.getValue());
                        }
                        Iterator<Map.Entry<String, String>> it = request.c.entrySet().iterator();
                        while (it.hasNext()) {
                            Map.Entry<String, String> next = it.next();
                            url.setRequestProperty(next.getKey(), next.getValue());
                        }
                        String str5 = request.d;
                        ?? r5 = it;
                        if (str5 != null) {
                            url.setDoOutput(true);
                            byte[] bytes = str5.getBytes(Charsets.UTF_8);
                            Intrinsics.checkNotNullExpressionValue(bytes, "getBytes(...)");
                            OutputStream outputStream = url.getOutputStream();
                            int length = bytes.length;
                            outputStream.write(bytes, 0, length);
                            url.getOutputStream().close();
                            r5 = length;
                        }
                        try {
                            responseCode = url.getResponseCode();
                            responseMessage = url.getResponseMessage();
                        } catch (Throwable th) {
                            th = th;
                        }
                        try {
                            inputStream = b(url);
                            try {
                                BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(inputStream, Charsets.UTF_8), 8192);
                                try {
                                    String readText = TextStreamsKt.readText(bufferedReader);
                                    CloseableKt.closeFinally(bufferedReader, null);
                                    if (inputStream != null) {
                                        inputStream.close();
                                    }
                                    LinkedHashMap linkedHashMap = new LinkedHashMap();
                                    Map<String, List<String>> headerFields = url.getHeaderFields();
                                    Intrinsics.checkNotNullExpressionValue(headerFields, "getHeaderFields(...)");
                                    for (Map.Entry<String, List<String>> entry2 : headerFields.entrySet()) {
                                        String key = entry2.getKey();
                                        List<String> value = entry2.getValue();
                                        if (key != null) {
                                            if (value == null) {
                                                value = CollectionsKt.emptyList();
                                            }
                                            linkedHashMap.put(key, value);
                                        }
                                    }
                                    bVar = new b(responseCode, readText, linkedHashMap, responseMessage);
                                } catch (Throwable th2) {
                                    try {
                                        throw th2;
                                    } catch (Throwable th3) {
                                        CloseableKt.closeFinally(bufferedReader, th2);
                                        throw th3;
                                    }
                                }
                            } catch (IOException e) {
                                e = e;
                                aVar.b("Failed to read response from server: " + e.getMessage());
                                bVar = new b(408, null, MapsKt.emptyMap(), "Request timeout");
                                if (inputStream != null) {
                                    inputStream.close();
                                }
                                url.disconnect();
                                com.amplitude.core.utilities.http.a.Companion.getClass();
                                IntRange intRange4 = f.b.a;
                                int first = intRange4.getFirst();
                                last = intRange4.getLast();
                                i = bVar.a;
                                if (i > last) {
                                }
                                IntRange intRange5 = f.c.a;
                                int first2 = intRange5.getFirst();
                                last2 = intRange5.getLast();
                                str2 = bVar.b;
                                if (i > last2) {
                                }
                                intRange = f.e.a;
                                int first3 = intRange.getFirst();
                                if (i > intRange.getLast()) {
                                }
                                intRange2 = f.f.a;
                                int first4 = intRange2.getFirst();
                                if (i > intRange2.getLast()) {
                                }
                                intRange3 = f.d.a;
                                int first5 = intRange3.getFirst();
                                if (i > intRange3.getLast()) {
                                }
                                jSONObject = new JSONObject();
                                if (str2 != null) {
                                    try {
                                        jSONObject = new JSONObject(str2);
                                    } catch (Exception unused) {
                                        jSONObject.put(Constants.IPC_BUNDLE_KEY_SEND_ERROR, str2);
                                    }
                                }
                                return new c(jSONObject);
                            }
                        } catch (IOException e2) {
                            e = e2;
                            inputStream = null;
                        } catch (Throwable th4) {
                            th = th4;
                            r5 = 0;
                            if (r5 != 0) {
                                r5.close();
                            }
                            throw th;
                        }
                    } catch (Exception e3) {
                        aVar.b("Request failed: " + e3.getClass().getName() + ": " + e3.getMessage());
                        Map emptyMap = MapsKt.emptyMap();
                        StringBuilder sb3 = new StringBuilder();
                        sb3.append("Request failed: ");
                        sb3.append(e3.getMessage());
                        bVar = new b(500, null, emptyMap, sb3.toString());
                    }
                    url.disconnect();
                } catch (Throwable th5) {
                    url.disconnect();
                    throw th5;
                }
            } catch (IOException e4) {
                aVar.b("Failed to open connection: " + e4.getMessage());
                bVar = new b(500, null, MapsKt.emptyMap(), "Connection failed");
            }
        } catch (MalformedURLException e5) {
            StringBuilder a3 = androidx.appcompat.view.a.a("Attempted to use malformed url: ", str4, ", error: ");
            a3.append(e5.getMessage());
            aVar.b(a3.toString());
            bVar = new b(400, null, MapsKt.emptyMap(), "Malformed URL");
        }
        com.amplitude.core.utilities.http.a.Companion.getClass();
        IntRange intRange42 = f.b.a;
        int first6 = intRange42.getFirst();
        last = intRange42.getLast();
        i = bVar.a;
        if (i > last && first6 <= i) {
            return new i();
        }
        IntRange intRange52 = f.c.a;
        int first22 = intRange52.getFirst();
        last2 = intRange52.getLast();
        str2 = bVar.b;
        if (i > last2 && first22 <= i) {
            return new com.amplitude.core.utilities.http.b(new JSONObject(str2));
        }
        intRange = f.e.a;
        int first32 = intRange.getFirst();
        if (i > intRange.getLast() && first32 <= i) {
            return new g(new JSONObject(str2));
        }
        intRange2 = f.f.a;
        int first42 = intRange2.getFirst();
        if (i > intRange2.getLast() && first42 <= i) {
            return new k(new JSONObject(str2));
        }
        intRange3 = f.d.a;
        int first52 = intRange3.getFirst();
        if (i > intRange3.getLast() && first52 <= i) {
            return new j();
        }
        jSONObject = new JSONObject();
        if (str2 != null && str2.length() != 0) {
            jSONObject = new JSONObject(str2);
        }
        return new c(jSONObject);
    }

    public final InputStream b(HttpURLConnection httpURLConnection) {
        try {
            InputStream inputStream = httpURLConnection.getInputStream();
            Intrinsics.checkNotNull(inputStream);
            return inputStream;
        } catch (IOException e) {
            this.b.d("Failed to get input stream, falling back to error stream: " + e.getMessage());
            InputStream errorStream = httpURLConnection.getErrorStream();
            Intrinsics.checkNotNull(errorStream);
            return errorStream;
        }
    }
}
