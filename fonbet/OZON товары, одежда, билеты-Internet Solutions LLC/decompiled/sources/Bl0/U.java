package Bl0;

import Bl0.b0;
import Sc.InterfaceC4008j;
import java.net.URL;
import java.net.URLConnection;
import java.util.ArrayList;
import java.util.Map;
import javax.net.ssl.HostnameVerifier;
import javax.net.ssl.HttpsURLConnection;
import javax.net.ssl.SSLSession;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONArray;
import org.json.JSONObject;

/* loaded from: classes8.dex */
public final class U {

    /* renamed from: a, reason: collision with root package name */
    public final C2646g f3948a;

    /* renamed from: b, reason: collision with root package name */
    public final InterfaceC4008j f3949b;

    public U(C2646g endpointProvider, N remoteMetricsEventDtoSerializer, b0.b logger) {
        Intrinsics.checkNotNullParameter(endpointProvider, "endpointProvider");
        Intrinsics.checkNotNullParameter(remoteMetricsEventDtoSerializer, "remoteMetricsEventDtoSerializer");
        Intrinsics.checkNotNullParameter(logger, "logger");
        this.f3948a = endpointProvider;
        this.f3949b = Sc.k.b(new M(this, 0));
    }

    public static String a(ArrayList arrayList) {
        JSONObject jSONObject = new JSONObject();
        JSONArray jSONArray = new JSONArray();
        int size = arrayList.size();
        int i11 = 0;
        while (i11 < size) {
            Object obj = arrayList.get(i11);
            i11++;
            L remoteMetricsEventDto = (L) obj;
            Intrinsics.checkNotNullParameter(remoteMetricsEventDto, "remoteMetricsEventDto");
            JSONObject jSONObject2 = new JSONObject();
            jSONObject2.put("event_name", remoteMetricsEventDto.f3933e.b());
            String str = remoteMetricsEventDto.f3931c;
            jSONObject2.put("user_id", str);
            JSONObject jSONObject3 = new JSONObject();
            jSONObject3.put("package_name", remoteMetricsEventDto.f3929a);
            String str2 = remoteMetricsEventDto.f3932d;
            if (str2 == null) {
                str2 = null;
            }
            jSONObject3.put("appVersion", str2);
            jSONObject3.put("userIdSdk", str);
            Al0.b bVar = remoteMetricsEventDto.f3933e;
            jSONObject3.put("time", String.valueOf(bVar.c()));
            for (Map.Entry<String, String> entry : bVar.a().entrySet()) {
                jSONObject3.put(entry.getKey(), entry.getValue());
            }
            jSONObject2.put("params", jSONObject3);
            String jSONObject4 = jSONObject2.toString();
            Intrinsics.checkNotNullExpressionValue(jSONObject4, "jsonObject.toString()");
            jSONArray.put(new JSONObject(jSONObject4));
        }
        jSONObject.put("events", jSONArray);
        String jSONObject5 = jSONObject.toString();
        Intrinsics.checkNotNullExpressionValue(jSONObject5, "jsonObject.toString()");
        return jSONObject5;
    }

    public final HttpsURLConnection b() {
        InterfaceC4008j interfaceC4008j = this.f3949b;
        URLConnection openConnection = ((URL) interfaceC4008j.getValue()).openConnection();
        Intrinsics.g(openConnection, "null cannot be cast to non-null type javax.net.ssl.HttpsURLConnection");
        HttpsURLConnection httpsURLConnection = (HttpsURLConnection) openConnection;
        final URL backendUrl = (URL) interfaceC4008j.getValue();
        Intrinsics.checkNotNullExpressionValue(backendUrl, "backendUrl");
        httpsURLConnection.setHostnameVerifier(new HostnameVerifier() { // from class: Bl0.S
            @Override // javax.net.ssl.HostnameVerifier
            public final boolean verify(String str, SSLSession sSLSession) {
                return str.equals(backendUrl.getHost());
            }
        });
        httpsURLConnection.setRequestMethod("POST");
        httpsURLConnection.setRequestProperty("content-type", "application/json");
        httpsURLConnection.setRequestProperty("X-Metrics-Request-Time", String.valueOf(System.currentTimeMillis()));
        httpsURLConnection.setConnectTimeout(20000);
        httpsURLConnection.setReadTimeout(20000);
        httpsURLConnection.setDoOutput(true);
        return httpsURLConnection;
    }
}
