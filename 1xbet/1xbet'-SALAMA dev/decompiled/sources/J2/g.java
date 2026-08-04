package J2;

import B.v;
import android.util.JsonWriter;
import java.io.IOException;
import java.io.StringWriter;
import java.net.HttpURLConnection;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.UUID;
import p155w1.F0;

/* JADX INFO: loaded from: classes.dex */
public final class g {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static boolean f3815c = false;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static boolean f3816d = false;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f3818a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final Object f3814b = new Object();

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final HashSet f3817e = new HashSet(Arrays.asList(new String[0]));

    public g() {
        this.f3818a = !c() ? new ArrayList() : Arrays.asList("network_request_".concat(String.valueOf(UUID.randomUUID().toString())));
    }

    public static boolean c() {
        boolean z4;
        synchronized (f3814b) {
            try {
                z4 = false;
                if (f3815c && f3816d) {
                    z4 = true;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return z4;
    }

    public static void e(JsonWriter jsonWriter, Map map) {
        if (map == null) {
            return;
        }
        jsonWriter.name("headers").beginArray();
        for (Map.Entry entry : map.entrySet()) {
            String str = (String) entry.getKey();
            if (!f3817e.contains(str)) {
                if (!(entry.getValue() instanceof List)) {
                    if (!(entry.getValue() instanceof String)) {
                        j.d("Connection headers should be either Map<String, String> or Map<String, List<String>>");
                        break;
                    }
                    jsonWriter.beginObject();
                    jsonWriter.name("name").value(str);
                    jsonWriter.name("value").value((String) entry.getValue());
                    jsonWriter.endObject();
                } else {
                    for (String str2 : (List) entry.getValue()) {
                        jsonWriter.beginObject();
                        jsonWriter.name("name").value(str);
                        jsonWriter.name("value").value(str2);
                        jsonWriter.endObject();
                    }
                }
            }
        }
        jsonWriter.endArray();
    }

    public final void a(HttpURLConnection httpURLConnection, byte[] bArr) {
        if (c()) {
            d("onNetworkRequest", new F0(new String(httpURLConnection.getURL().toString()), new String(httpURLConnection.getRequestMethod()), httpURLConnection.getRequestProperties() == null ? null : new HashMap(httpURLConnection.getRequestProperties()), bArr, 3));
        }
    }

    public final void b(HttpURLConnection httpURLConnection, int i7) {
        if (c()) {
            String responseMessage = null;
            d("onNetworkResponse", new v(i7, httpURLConnection.getHeaderFields() == null ? null : new HashMap(httpURLConnection.getHeaderFields()), 1));
            if (i7 < 200 || i7 >= 300) {
                try {
                    responseMessage = httpURLConnection.getResponseMessage();
                } catch (IOException e7) {
                    j.g("Can not get error message from error HttpURLConnection\n".concat(String.valueOf(e7.getMessage())));
                }
                d("onNetworkRequestError", new e(responseMessage));
            }
        }
    }

    public final void d(String str, f fVar) {
        StringWriter stringWriter = new StringWriter();
        JsonWriter jsonWriter = new JsonWriter(stringWriter);
        try {
            jsonWriter.beginObject();
            jsonWriter.name("timestamp").value(System.currentTimeMillis());
            jsonWriter.name("event").value(str);
            jsonWriter.name("components").beginArray();
            Iterator it = this.f3818a.iterator();
            while (it.hasNext()) {
                jsonWriter.value((String) it.next());
            }
            jsonWriter.endArray();
            fVar.c(jsonWriter);
            jsonWriter.endObject();
            jsonWriter.flush();
            jsonWriter.close();
        } catch (IOException e7) {
            j.e("unable to log", e7);
        }
        String string = stringWriter.toString();
        synchronized (g.class) {
            try {
                j.f("GMA Debug BEGIN");
                int i7 = 0;
                while (i7 < string.length()) {
                    int i8 = i7 + 4000;
                    j.f("GMA Debug CONTENT ".concat(String.valueOf(string.substring(i7, Math.min(i8, string.length())))));
                    i7 = i8;
                }
                j.f("GMA Debug FINISH");
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
