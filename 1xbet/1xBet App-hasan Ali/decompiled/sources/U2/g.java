package U2;

import android.util.JsonWriter;
import com.google.android.gms.internal.ads.C1071hd;
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

/* loaded from: classes.dex */
public final class g {

    /* renamed from: c, reason: collision with root package name */
    public static boolean f5869c = false;

    /* renamed from: d, reason: collision with root package name */
    public static boolean f5870d = false;

    /* renamed from: a, reason: collision with root package name */
    public final List f5872a;

    /* renamed from: b, reason: collision with root package name */
    public static final Object f5868b = new Object();

    /* renamed from: e, reason: collision with root package name */
    public static final HashSet f5871e = new HashSet(Arrays.asList(new String[0]));

    public g() {
        this.f5872a = !c() ? new ArrayList() : Arrays.asList("network_request_".concat(String.valueOf(UUID.randomUUID().toString())));
    }

    public static boolean c() {
        boolean z3;
        synchronized (f5868b) {
            try {
                z3 = false;
                if (f5869c && f5870d) {
                    z3 = true;
                }
            } finally {
            }
        }
        return z3;
    }

    public static void e(JsonWriter jsonWriter, Map map) {
        if (map == null) {
            return;
        }
        jsonWriter.name("headers").beginArray();
        Iterator it = map.entrySet().iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            Map.Entry entry = (Map.Entry) it.next();
            String str = (String) entry.getKey();
            if (!f5871e.contains(str)) {
                if (!(entry.getValue() instanceof List)) {
                    if (!(entry.getValue() instanceof String)) {
                        j.f("Connection headers should be either Map<String, String> or Map<String, List<String>>");
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
            d("onNetworkRequest", new C1071hd(new String(httpURLConnection.getURL().toString()), new String(httpURLConnection.getRequestMethod()), httpURLConnection.getRequestProperties() == null ? null : new HashMap(httpURLConnection.getRequestProperties()), bArr, 2));
        }
    }

    public final void b(HttpURLConnection httpURLConnection, int i) {
        if (c()) {
            String str = null;
            d("onNetworkResponse", new C2.h(i, (Map) (httpURLConnection.getHeaderFields() == null ? null : new HashMap(httpURLConnection.getHeaderFields()))));
            if (i < 200 || i >= 300) {
                try {
                    str = httpURLConnection.getResponseMessage();
                } catch (IOException e3) {
                    j.i("Can not get error message from error HttpURLConnection\n".concat(String.valueOf(e3.getMessage())));
                }
                d("onNetworkRequestError", new H3.g(str, 3));
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
            Iterator it = this.f5872a.iterator();
            while (it.hasNext()) {
                jsonWriter.value((String) it.next());
            }
            jsonWriter.endArray();
            fVar.e(jsonWriter);
            jsonWriter.endObject();
            jsonWriter.flush();
            jsonWriter.close();
        } catch (IOException e3) {
            j.g("unable to log", e3);
        }
        String stringWriter2 = stringWriter.toString();
        synchronized (g.class) {
            try {
                j.h("GMA Debug BEGIN");
                int i = 0;
                while (i < stringWriter2.length()) {
                    int i5 = i + 4000;
                    j.h("GMA Debug CONTENT ".concat(String.valueOf(stringWriter2.substring(i, Math.min(i5, stringWriter2.length())))));
                    i = i5;
                }
                j.h("GMA Debug FINISH");
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
