package C8;

import B0.A0;
import C8.d;
import C8.f;
import android.content.Context;
import android.content.pm.PackageManager;
import android.net.TrafficStats;
import android.text.TextUtils;
import android.util.JsonReader;
import android.util.Log;
import androidx.annotation.NonNull;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.util.AndroidUtilsLight;
import com.google.android.gms.common.util.Hex;
import com.google.android.gms.common.util.VisibleForTesting;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import com.google.android.gms.tasks.Tasks;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.nio.charset.Charset;
import java.util.concurrent.ExecutionException;
import java.util.regex.Pattern;
import java.util.zip.GZIPOutputStream;
import org.json.JSONException;
import org.json.JSONObject;
import w8.h;
import y8.InterfaceC10861a;
import z8.C11000c;

/* loaded from: classes.dex */
public final class c {

    /* renamed from: d, reason: collision with root package name */
    private static final Pattern f4486d = Pattern.compile("[0-9]+s");

    /* renamed from: e, reason: collision with root package name */
    private static final Charset f4487e = Charset.forName("UTF-8");

    /* renamed from: a, reason: collision with root package name */
    private final Context f4488a;

    /* renamed from: b, reason: collision with root package name */
    private final InterfaceC10861a<h> f4489b;

    /* renamed from: c, reason: collision with root package name */
    private final e f4490c = new e();

    public c(@NonNull Context context, @NonNull InterfaceC10861a<h> interfaceC10861a) {
        this.f4488a = context;
        this.f4489b = interfaceC10861a;
    }

    private static URL c(String str) throws C11000c {
        try {
            return new URL("https://firebaseinstallations.googleapis.com/v1/".concat(str));
        } catch (MalformedURLException e11) {
            throw new C11000c(e11.getMessage());
        }
    }

    private static void d(HttpURLConnection httpURLConnection, String str, @NonNull String str2, @NonNull String str3) {
        InputStream errorStream = httpURLConnection.getErrorStream();
        String str4 = null;
        if (errorStream != null) {
            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(errorStream, f4487e));
            try {
                StringBuilder sb2 = new StringBuilder();
                while (true) {
                    String readLine = bufferedReader.readLine();
                    if (readLine == null) {
                        break;
                    }
                    sb2.append(readLine);
                    sb2.append('\n');
                }
                str4 = String.format("Error when communicating with the Firebase Installations server API. HTTP response: [%d %s: %s]", Integer.valueOf(httpURLConnection.getResponseCode()), httpURLConnection.getResponseMessage(), sb2);
            } catch (IOException unused) {
            } catch (Throwable th2) {
                try {
                    bufferedReader.close();
                } catch (IOException unused2) {
                }
                throw th2;
            }
            try {
                bufferedReader.close();
            } catch (IOException unused3) {
            }
        }
        if (TextUtils.isEmpty(str4)) {
            return;
        }
        Log.w("Firebase-Installations", str4);
        Log.w("Firebase-Installations", V.e.a("Firebase options used while communicating with Firebase server APIs: ", str2, ", ", str3, TextUtils.isEmpty(str) ? "" : Nk.a.b(", ", str)));
    }

    private HttpURLConnection e(URL url, String str) throws C11000c {
        try {
            HttpURLConnection httpURLConnection = (HttpURLConnection) url.openConnection();
            httpURLConnection.setConnectTimeout(10000);
            httpURLConnection.setUseCaches(false);
            httpURLConnection.setReadTimeout(10000);
            httpURLConnection.addRequestProperty("Content-Type", "application/json");
            httpURLConnection.addRequestProperty("Accept", "application/json");
            httpURLConnection.addRequestProperty("Content-Encoding", "gzip");
            httpURLConnection.addRequestProperty("Cache-Control", "no-cache");
            Context context = this.f4488a;
            httpURLConnection.addRequestProperty("X-Android-Package", context.getPackageName());
            h hVar = this.f4489b.get();
            if (hVar != null) {
                try {
                    httpURLConnection.addRequestProperty("x-firebase-client", (String) Tasks.await(hVar.a()));
                } catch (InterruptedException e11) {
                    Thread.currentThread().interrupt();
                    Log.w("ContentValues", "Failed to get heartbeats header", e11);
                } catch (ExecutionException e12) {
                    Log.w("ContentValues", "Failed to get heartbeats header", e12);
                }
            }
            String str2 = null;
            try {
                byte[] packageCertificateHashBytes = AndroidUtilsLight.getPackageCertificateHashBytes(context, context.getPackageName());
                if (packageCertificateHashBytes == null) {
                    Log.e("ContentValues", "Could not get fingerprint hash for package: " + context.getPackageName());
                } else {
                    str2 = Hex.bytesToStringUppercase(packageCertificateHashBytes, false);
                }
            } catch (PackageManager.NameNotFoundException e13) {
                Log.e("ContentValues", "No such package: " + context.getPackageName(), e13);
            }
            httpURLConnection.addRequestProperty("X-Android-Cert", str2);
            httpURLConnection.addRequestProperty("x-goog-api-key", str);
            return httpURLConnection;
        } catch (IOException unused) {
            throw new C11000c("Firebase Installations Service is unavailable. Please try again later.");
        }
    }

    @VisibleForTesting
    static long f(String str) {
        Preconditions.checkArgument(f4486d.matcher(str).matches(), "Invalid Expiration Timestamp.");
        if (str == null || str.length() == 0) {
            return 0L;
        }
        return Long.parseLong(str.substring(0, str.length() - 1));
    }

    private static d g(HttpURLConnection httpURLConnection) throws AssertionError, IOException {
        InputStream inputStream = httpURLConnection.getInputStream();
        JsonReader jsonReader = new JsonReader(new InputStreamReader(inputStream, f4487e));
        f.a a11 = f.a();
        d.a a12 = d.a();
        jsonReader.beginObject();
        while (jsonReader.hasNext()) {
            String nextName = jsonReader.nextName();
            if (nextName.equals(AppMeasurementSdk.ConditionalUserProperty.NAME)) {
                a12.f(jsonReader.nextString());
            } else if (nextName.equals("fid")) {
                a12.c(jsonReader.nextString());
            } else if (nextName.equals("refreshToken")) {
                a12.d(jsonReader.nextString());
            } else if (nextName.equals("authToken")) {
                jsonReader.beginObject();
                while (jsonReader.hasNext()) {
                    String nextName2 = jsonReader.nextName();
                    if (nextName2.equals("token")) {
                        a11.c(jsonReader.nextString());
                    } else if (nextName2.equals("expiresIn")) {
                        a11.d(f(jsonReader.nextString()));
                    } else {
                        jsonReader.skipValue();
                    }
                }
                a12.b(a11.a());
                jsonReader.endObject();
            } else {
                jsonReader.skipValue();
            }
        }
        jsonReader.endObject();
        jsonReader.close();
        inputStream.close();
        a12.e(d.b.OK);
        return a12.a();
    }

    private static f h(HttpURLConnection httpURLConnection) throws AssertionError, IOException {
        InputStream inputStream = httpURLConnection.getInputStream();
        JsonReader jsonReader = new JsonReader(new InputStreamReader(inputStream, f4487e));
        f.a a11 = f.a();
        jsonReader.beginObject();
        while (jsonReader.hasNext()) {
            String nextName = jsonReader.nextName();
            if (nextName.equals("token")) {
                a11.c(jsonReader.nextString());
            } else if (nextName.equals("expiresIn")) {
                a11.d(f(jsonReader.nextString()));
            } else {
                jsonReader.skipValue();
            }
        }
        jsonReader.endObject();
        jsonReader.close();
        inputStream.close();
        a11.b(f.b.OK);
        return a11.a();
    }

    private static void i(HttpURLConnection httpURLConnection, String str, @NonNull String str2) throws IOException {
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("fid", str);
            jSONObject.put("appId", str2);
            jSONObject.put("authVersion", "FIS_v2");
            jSONObject.put("sdkVersion", "a:17.2.0");
            k(httpURLConnection, jSONObject.toString().getBytes("UTF-8"));
        } catch (JSONException e11) {
            throw new IllegalStateException(e11);
        }
    }

    private static void j(HttpURLConnection httpURLConnection) throws IOException {
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("sdkVersion", "a:17.2.0");
            JSONObject jSONObject2 = new JSONObject();
            jSONObject2.put("installation", jSONObject);
            k(httpURLConnection, jSONObject2.toString().getBytes("UTF-8"));
        } catch (JSONException e11) {
            throw new IllegalStateException(e11);
        }
    }

    private static void k(HttpURLConnection httpURLConnection, byte[] bArr) throws IOException {
        OutputStream outputStream = httpURLConnection.getOutputStream();
        if (outputStream == null) {
            throw new IOException("Cannot send request to FIS servers. No OutputStream available.");
        }
        GZIPOutputStream gZIPOutputStream = new GZIPOutputStream(outputStream);
        try {
            gZIPOutputStream.write(bArr);
        } finally {
            try {
                gZIPOutputStream.close();
                outputStream.close();
            } catch (IOException unused) {
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:27:0x006e, code lost:
    
        android.util.Log.e("Firebase-Installations", "Firebase Installations can not communicate with Firebase server APIs due to invalid configuration. Please update your Firebase initialization process and set valid Firebase options (API key, Project ID, Application ID) when initializing Firebase.");
        r5 = C8.d.a();
        r5.e(C8.d.b.BAD_CONFIG);
        r10 = r5.a();
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x0051, code lost:
    
        r6.disconnect();
        android.net.TrafficStats.clearThreadStatsTag();
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x0057, code lost:
    
        return r10;
     */
    @NonNull
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final d a(@NonNull String str, String str2, @NonNull String str3, @NonNull String str4, String str5) throws C11000c {
        int responseCode;
        e eVar = this.f4490c;
        if (!eVar.a()) {
            throw new C11000c("Firebase Installations Service is unavailable. Please try again later.");
        }
        URL c11 = c(A0.b("projects/", str3, "/installations"));
        int i11 = 0;
        while (true) {
            boolean z11 = true;
            if (i11 > 1) {
                throw new C11000c("Firebase Installations Service is unavailable. Please try again later.");
            }
            TrafficStats.setThreadStatsTag(32769);
            HttpURLConnection e11 = e(c11, str);
            try {
                try {
                    e11.setRequestMethod("POST");
                    e11.setDoOutput(true);
                    if (str5 != null) {
                        e11.addRequestProperty("x-goog-fis-android-iid-migration-auth", str5);
                    }
                    i(e11, str2, str4);
                    responseCode = e11.getResponseCode();
                    eVar.b(responseCode);
                    if (responseCode < 200 || responseCode >= 300) {
                        z11 = false;
                    }
                } catch (Throwable th2) {
                    e11.disconnect();
                    TrafficStats.clearThreadStatsTag();
                    throw th2;
                }
            } catch (IOException | AssertionError unused) {
            }
            if (z11) {
                d g10 = g(e11);
                break;
            }
            d(e11, str4, str, str3);
            if (responseCode == 429) {
                throw new C11000c("Firebase servers have received too many requests from this client in a short period of time. Please try again later.");
            }
            if (responseCode < 500 || responseCode >= 600) {
                break;
            }
            e11.disconnect();
            TrafficStats.clearThreadStatsTag();
            i11++;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:38:0x00a5, code lost:
    
        r4 = C8.f.a();
        r4.b(C8.f.b.AUTH_ERROR);
        r10 = r4.a();
     */
    @NonNull
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final f b(@NonNull String str, @NonNull String str2, @NonNull String str3, @NonNull String str4) throws C11000c {
        int responseCode;
        f h11;
        e eVar = this.f4490c;
        if (!eVar.a()) {
            throw new C11000c("Firebase Installations Service is unavailable. Please try again later.");
        }
        URL c11 = c(V.e.a("projects/", str3, "/installations/", str2, "/authTokens:generate"));
        int i11 = 0;
        while (true) {
            boolean z11 = true;
            if (i11 > 1) {
                throw new C11000c("Firebase Installations Service is unavailable. Please try again later.");
            }
            TrafficStats.setThreadStatsTag(32771);
            HttpURLConnection e11 = e(c11, str);
            try {
                try {
                    e11.setRequestMethod("POST");
                    e11.addRequestProperty("Authorization", "FIS_v2 " + str4);
                    e11.setDoOutput(true);
                    j(e11);
                    responseCode = e11.getResponseCode();
                    eVar.b(responseCode);
                    if (responseCode < 200 || responseCode >= 300) {
                        z11 = false;
                    }
                } finally {
                    e11.disconnect();
                    TrafficStats.clearThreadStatsTag();
                }
            } catch (IOException | AssertionError unused) {
            }
            if (z11) {
                h11 = h(e11);
                break;
            }
            d(e11, null, str, str3);
            if (responseCode == 401 || responseCode == 404) {
                break;
            }
            if (responseCode == 429) {
                throw new C11000c("Firebase servers have received too many requests from this client in a short period of time. Please try again later.");
            }
            if (responseCode < 500 || responseCode >= 600) {
                break;
            }
            i11++;
        }
        Log.e("Firebase-Installations", "Firebase Installations can not communicate with Firebase server APIs due to invalid configuration. Please update your Firebase initialization process and set valid Firebase options (API key, Project ID, Application ID) when initializing Firebase.");
        f.a a11 = f.a();
        a11.b(f.b.BAD_CONFIG);
        h11 = a11.a();
        return h11;
    }
}
