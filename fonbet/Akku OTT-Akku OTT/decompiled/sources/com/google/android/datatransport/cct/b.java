package com.google.android.datatransport.cct;

import android.util.Log;
import com.google.android.datatransport.cct.c;
import com.google.android.datatransport.cct.internal.v;
import com.google.android.exoplayer2.source.rtsp.RtspHeaders;
import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.firebase.encoders.EncodingException;
import io.flutter.plugin.common.BasicMessageChannel;
import io.flutter.plugins.firebase.auth.FlutterFirebaseAuthPlugin;
import io.flutter.plugins.firebase.auth.GeneratedAndroidFirebaseAuth;
import io.flutter.plugins.googlesignin.GoogleSignInApi;
import io.flutter.plugins.webviewflutter.AndroidWebkitLibraryPigeonInstanceManager;
import io.flutter.plugins.webviewflutter.AndroidWebkitLibraryPigeonInstanceManagerApi;
import io.flutter.plugins.webviewflutter.PigeonApiJavaScriptChannel;
import io.flutter.plugins.webviewflutter.PigeonApiWebStorage;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.net.ConnectException;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.UnknownHostException;
import java.util.zip.GZIPInputStream;
import java.util.zip.GZIPOutputStream;

/* loaded from: classes.dex */
public final /* synthetic */ class b implements OnCompleteListener, BasicMessageChannel.MessageHandler {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ b(Object obj, int i) {
        this.a = i;
        this.b = obj;
    }

    public c.b a(c.a aVar) {
        c cVar = (c) this.b;
        URL url = aVar.a;
        if (Log.isLoggable(com.google.android.datatransport.runtime.logging.a.b("CctTransportBackend"), 4)) {
            String.format("Making request to: %s", url);
        }
        HttpURLConnection httpURLConnection = (HttpURLConnection) url.openConnection();
        httpURLConnection.setConnectTimeout(30000);
        httpURLConnection.setReadTimeout(cVar.g);
        httpURLConnection.setDoOutput(true);
        httpURLConnection.setInstanceFollowRedirects(false);
        httpURLConnection.setRequestMethod("POST");
        httpURLConnection.setRequestProperty(RtspHeaders.USER_AGENT, "datatransport/3.3.0 android/");
        httpURLConnection.setRequestProperty(RtspHeaders.CONTENT_ENCODING, "gzip");
        httpURLConnection.setRequestProperty(RtspHeaders.CONTENT_TYPE, "application/json");
        httpURLConnection.setRequestProperty("Accept-Encoding", "gzip");
        String str = aVar.c;
        if (str != null) {
            httpURLConnection.setRequestProperty("X-Goog-Api-Key", str);
        }
        try {
            OutputStream outputStream = httpURLConnection.getOutputStream();
            try {
                GZIPOutputStream gZIPOutputStream = new GZIPOutputStream(outputStream);
                try {
                    cVar.a.encode(aVar.b, new BufferedWriter(new OutputStreamWriter(gZIPOutputStream)));
                    gZIPOutputStream.close();
                    if (outputStream != null) {
                        outputStream.close();
                    }
                    int responseCode = httpURLConnection.getResponseCode();
                    Integer valueOf = Integer.valueOf(responseCode);
                    if (Log.isLoggable(com.google.android.datatransport.runtime.logging.a.b("CctTransportBackend"), 4)) {
                        String.format("Status Code: %d", valueOf);
                    }
                    com.google.android.datatransport.runtime.logging.a.a("CctTransportBackend", "Content-Type: %s", httpURLConnection.getHeaderField(RtspHeaders.CONTENT_TYPE));
                    com.google.android.datatransport.runtime.logging.a.a("CctTransportBackend", "Content-Encoding: %s", httpURLConnection.getHeaderField(RtspHeaders.CONTENT_ENCODING));
                    if (responseCode == 302 || responseCode == 301 || responseCode == 307) {
                        return new c.b(responseCode, new URL(httpURLConnection.getHeaderField(RtspHeaders.LOCATION)), 0L);
                    }
                    if (responseCode != 200) {
                        return new c.b(responseCode, null, 0L);
                    }
                    InputStream inputStream = httpURLConnection.getInputStream();
                    try {
                        InputStream gZIPInputStream = "gzip".equals(httpURLConnection.getHeaderField(RtspHeaders.CONTENT_ENCODING)) ? new GZIPInputStream(inputStream) : inputStream;
                        try {
                            c.b bVar = new c.b(responseCode, null, v.a(new BufferedReader(new InputStreamReader(gZIPInputStream))).a);
                            if (gZIPInputStream != null) {
                                gZIPInputStream.close();
                            }
                            if (inputStream != null) {
                                inputStream.close();
                            }
                            return bVar;
                        } finally {
                        }
                    } finally {
                    }
                } finally {
                }
            } finally {
            }
        } catch (EncodingException | IOException unused) {
            Log.isLoggable(com.google.android.datatransport.runtime.logging.a.b("CctTransportBackend"), 6);
            return new c.b(400, null, 0L);
        } catch (ConnectException | UnknownHostException unused2) {
            Log.isLoggable(com.google.android.datatransport.runtime.logging.a.b("CctTransportBackend"), 6);
            return new c.b(500, null, 0L);
        }
    }

    @Override // com.google.android.gms.tasks.OnCompleteListener
    public void onComplete(Task task) {
        FlutterFirebaseAuthPlugin.lambda$signInWithCredential$5((GeneratedAndroidFirebaseAuth.Result) this.b, task);
    }

    @Override // io.flutter.plugin.common.BasicMessageChannel.MessageHandler
    public void onMessage(Object obj, BasicMessageChannel.Reply reply) {
        switch (this.a) {
            case 2:
                GeneratedAndroidFirebaseAuth.FirebaseAuthUserHostApi.lambda$setUp$4((GeneratedAndroidFirebaseAuth.FirebaseAuthUserHostApi) this.b, obj, reply);
                break;
            case 3:
                GoogleSignInApi.Companion.setUp$lambda$0$0((GoogleSignInApi) this.b, obj, reply);
                break;
            case 4:
                AndroidWebkitLibraryPigeonInstanceManagerApi.Companion.setUpMessageHandlers$lambda$0$0((AndroidWebkitLibraryPigeonInstanceManager) this.b, obj, reply);
                break;
            case 5:
                PigeonApiJavaScriptChannel.Companion.setUpMessageHandlers$lambda$0$0((PigeonApiJavaScriptChannel) this.b, obj, reply);
                break;
            default:
                PigeonApiWebStorage.Companion.setUpMessageHandlers$lambda$1$0((PigeonApiWebStorage) this.b, obj, reply);
                break;
        }
    }
}
