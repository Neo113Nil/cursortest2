package w1;

import android.net.TrafficStats;
import android.text.TextUtils;
import android.util.Log;
import java.io.BufferedWriter;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.net.MalformedURLException;
import java.net.URL;
import java.nio.ByteBuffer;
import java.nio.channels.Channels;
import java.nio.channels.ReadableByteChannel;
import java.nio.channels.WritableByteChannel;
import java.util.HashMap;
import java.util.Locale;
import java.util.UUID;
import javax.net.ssl.HttpsURLConnection;
import javax.net.ssl.SSLException;

/* loaded from: classes.dex */
public final class C0 implements Runnable {

    /* renamed from: C, reason: collision with root package name */
    public static String f17302C;

    /* renamed from: A, reason: collision with root package name */
    public String f17303A;

    /* renamed from: B, reason: collision with root package name */
    public boolean f17304B;

    /* renamed from: a, reason: collision with root package name */
    public String f17305a;

    /* renamed from: b, reason: collision with root package name */
    public C1758x0 f17306b;

    /* renamed from: c, reason: collision with root package name */
    public String f17307c;

    /* renamed from: d, reason: collision with root package name */
    public String f17308d;

    /* renamed from: e, reason: collision with root package name */
    public String f17309e;

    /* renamed from: f, reason: collision with root package name */
    public String f17310f;

    /* renamed from: x, reason: collision with root package name */
    public String f17311x;

    /* renamed from: y, reason: collision with root package name */
    public String f17312y;

    /* renamed from: z, reason: collision with root package name */
    public HttpsURLConnection f17313z;

    public final InputStream a() {
        BufferedWriter bufferedWriter;
        Throwable th;
        OutputStream outputStream;
        HttpsURLConnection httpsURLConnection = (HttpsURLConnection) new URL(this.f17305a).openConnection();
        this.f17313z = httpsURLConnection;
        httpsURLConnection.setReadTimeout(10000);
        this.f17313z.setConnectTimeout(15000);
        this.f17313z.setRequestMethod("POST");
        this.f17313z.setRequestProperty("User-Agent", f17302C);
        this.f17313z.setRequestProperty("Content-Type", "application/json");
        this.f17313z.setDoInput(true);
        this.f17313z.setDoOutput(true);
        TrafficStats.setThreadStatsTag(1234);
        this.f17313z.connect();
        P0.a(this.f17313z);
        this.f17307c = UUID.randomUUID().toString().toUpperCase(Locale.ENGLISH);
        try {
            outputStream = this.f17313z.getOutputStream();
            try {
                bufferedWriter = new BufferedWriter(new OutputStreamWriter(outputStream, "UTF-8"));
                try {
                    bufferedWriter.write(AbstractC1715k1.b(this.f17307c));
                    bufferedWriter.close();
                    if (outputStream != null) {
                        outputStream.close();
                    }
                    int responseCode = this.f17313z.getResponseCode();
                    if (responseCode >= 400) {
                        throw new IOException("Server response code is ".concat(String.valueOf(responseCode)));
                    }
                    this.f17303A = this.f17313z.getHeaderField("Content-Signature");
                    this.f17311x = this.f17313z.getHeaderField("ETag");
                    if (responseCode == 304) {
                        if (b(this.f17307c)) {
                            this.f17306b = C1758x0.f17919e;
                            AbstractC1706i0.o(3, "Empty 304 payload; No Change.");
                        } else {
                            this.f17306b = new C1758x0(5, "GUID Signature Error.", 0);
                            AbstractC1706i0.q("Authentication error: " + this.f17306b);
                        }
                    }
                    return this.f17313z.getInputStream();
                } catch (Throwable th2) {
                    th = th2;
                    if (bufferedWriter != null) {
                        bufferedWriter.close();
                    }
                    if (outputStream != null) {
                        outputStream.close();
                    }
                    throw th;
                }
            } catch (Throwable th3) {
                bufferedWriter = null;
                th = th3;
            }
        } catch (Throwable th4) {
            bufferedWriter = null;
            th = th4;
            outputStream = null;
        }
    }

    public final boolean b(String str) {
        String str2 = this.f17303A;
        if (TextUtils.isEmpty(str2)) {
            AbstractC1706i0.q("Content-Signature is empty.");
        } else {
            HashMap hashMap = new HashMap();
            for (String str3 : str2.split(";")) {
                int indexOf = str3.indexOf("=");
                if (indexOf > 0) {
                    hashMap.put(str3.substring(0, indexOf), str3.substring(indexOf + 1));
                }
            }
            String str4 = (String) hashMap.get("keyid");
            this.f17308d = str4;
            if (TextUtils.isEmpty(str4)) {
                AbstractC1706i0.q("Error to get keyid from Signature.");
            } else {
                String str5 = (String) E0.f17359a.get(this.f17308d);
                this.f17309e = str5;
                if (str5 == null) {
                    AbstractC1706i0.q("Unknown keyid from Signature.");
                } else {
                    boolean containsKey = hashMap.containsKey("sha256ecdsa");
                    this.f17304B = containsKey;
                    String str6 = (String) hashMap.get(containsKey ? "sha256ecdsa" : "sha256rsa");
                    this.f17310f = str6;
                    if (!TextUtils.isEmpty(str6)) {
                        if (this.f17304B ? D0.c(this.f17309e, str, this.f17310f, "EC", "SHA256withECDSA") : D0.c(this.f17309e, str, this.f17310f, "RSA", "SHA256withRSA")) {
                            return true;
                        }
                        AbstractC1706i0.q("Incorrect signature for response.");
                        return false;
                    }
                    AbstractC1706i0.q("Error to get rsa from Signature.");
                }
            }
        }
        return false;
    }

    public final void c() {
        HttpsURLConnection httpsURLConnection = this.f17313z;
        if (httpsURLConnection != null) {
            httpsURLConnection.disconnect();
        }
    }

    public final boolean d() {
        return "https://cfg.flurry.com/sdk/v1/config".equals(this.f17305a);
    }

    @Override // java.lang.Runnable
    public final void run() {
        C1758x0 c1758x0 = C1758x0.f17918d;
        this.f17306b = c1758x0;
        InputStream inputStream = null;
        try {
            try {
                try {
                    try {
                        try {
                            InputStream a2 = a();
                            if (this.f17306b != c1758x0) {
                                if (a2 != null) {
                                    try {
                                        a2.close();
                                    } catch (IOException e7) {
                                        e7.getMessage();
                                        Log.getStackTraceString(e7);
                                    }
                                }
                                c();
                                return;
                            }
                            if (a2 == null) {
                                AbstractC1706i0.q("Null InputStream");
                                this.f17306b = new C1758x0(3, "Null InputStream", 0);
                                if (a2 != null) {
                                    try {
                                        a2.close();
                                    } catch (IOException e8) {
                                        e8.getMessage();
                                        Log.getStackTraceString(e8);
                                    }
                                }
                                c();
                                return;
                            }
                            ReadableByteChannel newChannel = Channels.newChannel(a2);
                            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                            WritableByteChannel newChannel2 = Channels.newChannel(byteArrayOutputStream);
                            ByteBuffer allocateDirect = ByteBuffer.allocateDirect(16384);
                            while (true) {
                                if (newChannel.read(allocateDirect) < 0 && allocateDirect.position() <= 0) {
                                    break;
                                }
                                allocateDirect.flip();
                                newChannel2.write(allocateDirect);
                                allocateDirect.compact();
                            }
                            byteArrayOutputStream.flush();
                            if (b(byteArrayOutputStream.toString())) {
                                this.f17312y = new String(byteArrayOutputStream.toByteArray(), "utf-8");
                                try {
                                    a2.close();
                                } catch (IOException e9) {
                                    e9.getMessage();
                                    Log.getStackTraceString(e9);
                                }
                                c();
                                return;
                            }
                            this.f17306b = new C1758x0(5, "Signature Error.", 0);
                            try {
                                a2.close();
                            } catch (IOException e10) {
                                e10.getMessage();
                                Log.getStackTraceString(e10);
                            }
                            c();
                        } catch (Throwable th) {
                            if (0 != 0) {
                                try {
                                    inputStream.close();
                                } catch (IOException e11) {
                                    e11.getMessage();
                                    Log.getStackTraceString(e11);
                                }
                            }
                            c();
                            throw th;
                        }
                    } catch (SSLException e12) {
                        AbstractC1706i0.r(e12.getMessage(), e12);
                        this.f17306b = new C1758x0(6, e12.toString(), 0);
                        if (0 != 0) {
                            try {
                                inputStream.close();
                            } catch (IOException e13) {
                                e13.getMessage();
                                Log.getStackTraceString(e13);
                            }
                        }
                        c();
                    }
                } catch (IOException e14) {
                    AbstractC1706i0.r(e14.getMessage(), e14);
                    this.f17306b = new C1758x0(3, e14.toString(), 0);
                    if (0 != 0) {
                        try {
                            inputStream.close();
                        } catch (IOException e15) {
                            e15.getMessage();
                            Log.getStackTraceString(e15);
                        }
                    }
                    c();
                }
            } catch (MalformedURLException e16) {
                this.f17306b = new C1758x0(7, e16.toString(), 0);
                if (0 != 0) {
                    try {
                        inputStream.close();
                    } catch (IOException e17) {
                        e17.getMessage();
                        Log.getStackTraceString(e17);
                    }
                }
                c();
            }
        } catch (Exception e18) {
            this.f17306b = new C1758x0(7, e18.toString(), 0);
            if (0 != 0) {
                try {
                    inputStream.close();
                } catch (IOException e19) {
                    e19.getMessage();
                    Log.getStackTraceString(e19);
                }
            }
            c();
        }
    }
}
