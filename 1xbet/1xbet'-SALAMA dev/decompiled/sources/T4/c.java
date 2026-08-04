package T4;

import Y3.i;
import android.content.Context;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.net.Uri;
import android.text.TextUtils;
import android.util.Log;
import com.google.android.gms.common.internal.D;
import com.google.android.gms.tasks.TaskCompletionSource;
import java.io.BufferedOutputStream;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.net.HttpURLConnection;
import java.net.SocketException;
import java.net.URL;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;
import p155w1.C1017n0;

/* JADX INFO: loaded from: classes2.dex */
public abstract class c {

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static final Uri f6351k = Uri.parse("https://firebasestorage.googleapis.com/v0");

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static final p036e6.c f6352l = new p036e6.c(12);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public Exception f6353a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final C1017n0 f6354b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Context f6355c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public Map f6356d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f6357e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public String f6358f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public int f6359g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public InputStream f6360h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public HttpURLConnection f6361i;
    public final HashMap j = new HashMap();

    public c(C1017n0 c1017n0, i iVar) {
        D.i(iVar);
        this.f6354b = c1017n0;
        iVar.b();
        this.f6355c = iVar.f7663a;
        iVar.b();
        q("x-firebase-gmpid", iVar.f7665c.f7673b);
    }

    public final void a(TaskCompletionSource taskCompletionSource, Object obj) {
        Exception exc = this.f6353a;
        if (l() && exc == null) {
            taskCompletionSource.setResult(obj);
        } else {
            taskCompletionSource.setException(com.google.firebase.storage.i.b(exc, this.f6357e));
        }
    }

    public final void b(HttpURLConnection httpURLConnection, String str, String str2) throws IOException {
        byte[] bArrF;
        int iG;
        D.i(httpURLConnection);
        if (TextUtils.isEmpty(str)) {
            Log.w("NetworkRequest", "no auth token for request");
        } else {
            httpURLConnection.setRequestProperty("Authorization", "Firebase " + str);
        }
        if (TextUtils.isEmpty(str2)) {
            Log.w("NetworkRequest", "No App Check token for request.");
        } else {
            httpURLConnection.setRequestProperty("x-firebase-appcheck", str2);
        }
        httpURLConnection.setRequestProperty("X-Firebase-Storage-Version", "Android/21.0.1");
        for (Map.Entry entry : this.j.entrySet()) {
            httpURLConnection.setRequestProperty((String) entry.getKey(), (String) entry.getValue());
        }
        JSONObject jSONObjectE = e();
        if (jSONObjectE != null) {
            bArrF = jSONObjectE.toString().getBytes("UTF-8");
            iG = bArrF.length;
        } else {
            bArrF = f();
            iG = g();
            if (iG == 0 && bArrF != null) {
                iG = bArrF.length;
            }
        }
        if (bArrF == null || bArrF.length <= 0) {
            httpURLConnection.setRequestProperty("Content-Length", "0");
        } else {
            if (jSONObjectE != null) {
                httpURLConnection.setRequestProperty("Content-Type", "application/json");
            }
            httpURLConnection.setDoOutput(true);
            httpURLConnection.setRequestProperty("Content-Length", Integer.toString(iG));
        }
        httpURLConnection.setUseCaches(false);
        httpURLConnection.setDoInput(true);
        if (bArrF == null || bArrF.length <= 0) {
            return;
        }
        OutputStream outputStream = httpURLConnection.getOutputStream();
        if (outputStream == null) {
            Log.e("NetworkRequest", "Unable to write to the http request!");
            return;
        }
        BufferedOutputStream bufferedOutputStream = new BufferedOutputStream(outputStream);
        try {
            bufferedOutputStream.write(bArrF, 0, iG);
        } finally {
            bufferedOutputStream.close();
        }
    }

    public final HttpURLConnection c() {
        Uri uriK = k();
        Map mapH = h();
        if (mapH != null) {
            Uri.Builder builderBuildUpon = uriK.buildUpon();
            for (Map.Entry entry : mapH.entrySet()) {
                builderBuildUpon.appendQueryParameter((String) entry.getKey(), (String) entry.getValue());
            }
            uriK = builderBuildUpon.build();
        }
        URL url = new URL(uriK.toString());
        f6352l.getClass();
        return (HttpURLConnection) url.openConnection();
    }

    public abstract String d();

    public JSONObject e() {
        return null;
    }

    public byte[] f() {
        return null;
    }

    public int g() {
        return 0;
    }

    public Map h() {
        return null;
    }

    public final JSONObject i() {
        if (TextUtils.isEmpty(this.f6358f)) {
            return new JSONObject();
        }
        try {
            return new JSONObject(this.f6358f);
        } catch (JSONException e7) {
            Log.e("NetworkRequest", "error parsing result into JSON:" + this.f6358f, e7);
            return new JSONObject();
        }
    }

    public final String j(String str) {
        List list;
        Map map = this.f6356d;
        if (map == null || (list = (List) map.get(str)) == null || list.size() <= 0) {
            return null;
        }
        return (String) list.get(0);
    }

    public Uri k() {
        return (Uri) this.f6354b.f17812c;
    }

    public final boolean l() {
        int i7 = this.f6357e;
        return i7 >= 200 && i7 < 300;
    }

    public final void m(InputStream inputStream) throws IOException {
        StringBuilder sb = new StringBuilder();
        if (inputStream != null) {
            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(inputStream, "UTF-8"));
            while (true) {
                try {
                    String line = bufferedReader.readLine();
                    if (line == null) {
                        break;
                    } else {
                        sb.append(line);
                    }
                } catch (Throwable th) {
                    bufferedReader.close();
                    throw th;
                }
            }
            bufferedReader.close();
        }
        this.f6358f = sb.toString();
        if (l()) {
            return;
        }
        this.f6353a = new IOException(this.f6358f);
    }

    public final void n(Context context, String str, String str2) {
        NetworkInfo activeNetworkInfo = ((ConnectivityManager) context.getSystemService("connectivity")).getActiveNetworkInfo();
        if (activeNetworkInfo == null || !activeNetworkInfo.isConnected()) {
            this.f6353a = new SocketException("Network subsystem is unavailable");
            this.f6357e = -2;
            return;
        }
        p(str, str2);
        try {
            if (l()) {
                m(this.f6360h);
            } else {
                m(this.f6360h);
            }
        } catch (IOException e7) {
            Log.w("NetworkRequest", "error sending network request " + d() + " " + k(), e7);
            this.f6353a = e7;
            this.f6357e = -2;
        }
        o();
    }

    public final void o() {
        HttpURLConnection httpURLConnection = this.f6361i;
        if (httpURLConnection != null) {
            httpURLConnection.disconnect();
        }
    }

    public final void p(String str, String str2) {
        if (this.f6353a != null) {
            this.f6357e = -1;
            return;
        }
        if (Log.isLoggable("NetworkRequest", 3)) {
            Log.d("NetworkRequest", "sending network request " + d() + " " + k());
        }
        NetworkInfo activeNetworkInfo = ((ConnectivityManager) this.f6355c.getSystemService("connectivity")).getActiveNetworkInfo();
        if (activeNetworkInfo == null || !activeNetworkInfo.isConnected()) {
            this.f6357e = -2;
            this.f6353a = new SocketException("Network subsystem is unavailable");
            return;
        }
        try {
            HttpURLConnection httpURLConnectionC = c();
            this.f6361i = httpURLConnectionC;
            httpURLConnectionC.setRequestMethod(d());
            b(this.f6361i, str, str2);
            HttpURLConnection httpURLConnection = this.f6361i;
            D.i(httpURLConnection);
            this.f6357e = httpURLConnection.getResponseCode();
            this.f6356d = httpURLConnection.getHeaderFields();
            this.f6359g = httpURLConnection.getContentLength();
            if (l()) {
                this.f6360h = httpURLConnection.getInputStream();
            } else {
                this.f6360h = httpURLConnection.getErrorStream();
            }
            if (Log.isLoggable("NetworkRequest", 3)) {
                Log.d("NetworkRequest", "network request result " + this.f6357e);
            }
        } catch (IOException e7) {
            Log.w("NetworkRequest", "error sending network request " + d() + " " + k(), e7);
            this.f6353a = e7;
            this.f6357e = -2;
        }
    }

    public final void q(String str, String str2) {
        this.j.put(str, str2);
    }
}
