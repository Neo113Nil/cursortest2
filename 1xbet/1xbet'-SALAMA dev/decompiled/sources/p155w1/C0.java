package p155w1;

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

/* JADX INFO: loaded from: classes.dex */
public final class C0 implements Runnable {

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    public static String f17308C;

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    public String f17309A;

    /* JADX INFO: renamed from: B, reason: collision with root package name */
    public boolean f17310B;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public String f17311a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public C1049x0 f17312b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public String f17313c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public String f17314d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public String f17315e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public String f17316f;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public String f17317x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public String f17318y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public HttpsURLConnection f17319z;

    public final InputStream a() throws Throwable {
        BufferedWriter bufferedWriter;
        Throwable th;
        OutputStream outputStream;
        HttpsURLConnection httpsURLConnection = (HttpsURLConnection) new URL(this.f17311a).openConnection();
        this.f17319z = httpsURLConnection;
        httpsURLConnection.setReadTimeout(10000);
        this.f17319z.setConnectTimeout(15000);
        this.f17319z.setRequestMethod("POST");
        this.f17319z.setRequestProperty("User-Agent", f17308C);
        this.f17319z.setRequestProperty("Content-Type", "application/json");
        this.f17319z.setDoInput(true);
        this.f17319z.setDoOutput(true);
        TrafficStats.setThreadStatsTag(1234);
        this.f17319z.connect();
        P0.a(this.f17319z);
        this.f17313c = UUID.randomUUID().toString().toUpperCase(Locale.ENGLISH);
        try {
            outputStream = this.f17319z.getOutputStream();
            try {
                bufferedWriter = new BufferedWriter(new OutputStreamWriter(outputStream, "UTF-8"));
                try {
                    bufferedWriter.write(AbstractC1006k1.b(this.f17313c));
                    bufferedWriter.close();
                    if (outputStream != null) {
                        outputStream.close();
                    }
                    int responseCode = this.f17319z.getResponseCode();
                    if (responseCode >= 400) {
                        throw new IOException("Server response code is ".concat(String.valueOf(responseCode)));
                    }
                    this.f17309A = this.f17319z.getHeaderField("Content-Signature");
                    this.f17317x = this.f17319z.getHeaderField("ETag");
                    if (responseCode == 304) {
                        if (b(this.f17313c)) {
                            this.f17312b = C1049x0.f17925e;
                            AbstractC0997i0.o(3, "Empty 304 payload; No Change.");
                        } else {
                            this.f17312b = new C1049x0(5, "GUID Signature Error.", 0);
                            AbstractC0997i0.q("Authentication error: " + this.f17312b);
                        }
                    }
                    return this.f17319z.getInputStream();
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
        String str2 = this.f17309A;
        if (TextUtils.isEmpty(str2)) {
            AbstractC0997i0.q("Content-Signature is empty.");
        } else {
            HashMap map = new HashMap();
            for (String str3 : str2.split(";")) {
                int iIndexOf = str3.indexOf("=");
                if (iIndexOf > 0) {
                    map.put(str3.substring(0, iIndexOf), str3.substring(iIndexOf + 1));
                }
            }
            String str4 = (String) map.get("keyid");
            this.f17314d = str4;
            if (TextUtils.isEmpty(str4)) {
                AbstractC0997i0.q("Error to get keyid from Signature.");
            } else {
                String str5 = (String) E0.f17365a.get(this.f17314d);
                this.f17315e = str5;
                if (str5 == null) {
                    AbstractC0997i0.q("Unknown keyid from Signature.");
                } else {
                    boolean zContainsKey = map.containsKey("sha256ecdsa");
                    this.f17310B = zContainsKey;
                    String str6 = (String) map.get(zContainsKey ? "sha256ecdsa" : "sha256rsa");
                    this.f17316f = str6;
                    if (!TextUtils.isEmpty(str6)) {
                        if (this.f17310B ? D0.c(this.f17315e, str, this.f17316f, "EC", "SHA256withECDSA") : D0.c(this.f17315e, str, this.f17316f, "RSA", "SHA256withRSA")) {
                            return true;
                        }
                        AbstractC0997i0.q("Incorrect signature for response.");
                        return false;
                    }
                    AbstractC0997i0.q("Error to get rsa from Signature.");
                }
            }
        }
        return false;
    }

    public final void c() {
        HttpsURLConnection httpsURLConnection = this.f17319z;
        if (httpsURLConnection != null) {
            httpsURLConnection.disconnect();
        }
    }

    public final boolean d() {
        return "https://cfg.flurry.com/sdk/v1/config".equals(this.f17311a);
    }

    @Override // java.lang.Runnable
    public final void run() {
        C1049x0 c1049x0 = C1049x0.f17924d;
        this.f17312b = c1049x0;
        InputStream inputStream = null;
        try {
            try {
                try {
                    try {
                        try {
                            InputStream inputStreamA = a();
                            if (this.f17312b != c1049x0) {
                                if (inputStreamA != null) {
                                    try {
                                        inputStreamA.close();
                                    } catch (IOException e7) {
                                        e7.getMessage();
                                        Log.getStackTraceString(e7);
                                    }
                                }
                                c();
                                return;
                            }
                            if (inputStreamA == null) {
                                AbstractC0997i0.q("Null InputStream");
                                this.f17312b = new C1049x0(3, "Null InputStream", 0);
                                if (inputStreamA != null) {
                                    try {
                                        inputStreamA.close();
                                    } catch (IOException e8) {
                                        e8.getMessage();
                                        Log.getStackTraceString(e8);
                                    }
                                }
                                c();
                                return;
                            }
                            ReadableByteChannel readableByteChannelNewChannel = Channels.newChannel(inputStreamA);
                            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                            WritableByteChannel writableByteChannelNewChannel = Channels.newChannel(byteArrayOutputStream);
                            ByteBuffer byteBufferAllocateDirect = ByteBuffer.allocateDirect(16384);
                            while (true) {
                                if (readableByteChannelNewChannel.read(byteBufferAllocateDirect) < 0 && byteBufferAllocateDirect.position() <= 0) {
                                    break;
                                }
                                byteBufferAllocateDirect.flip();
                                writableByteChannelNewChannel.write(byteBufferAllocateDirect);
                                byteBufferAllocateDirect.compact();
                            }
                            byteArrayOutputStream.flush();
                            if (b(byteArrayOutputStream.toString())) {
                                this.f17318y = new String(byteArrayOutputStream.toByteArray(), "utf-8");
                                try {
                                    inputStreamA.close();
                                } catch (IOException e9) {
                                    e9.getMessage();
                                    Log.getStackTraceString(e9);
                                }
                                c();
                                return;
                            }
                            this.f17312b = new C1049x0(5, "Signature Error.", 0);
                            try {
                                inputStreamA.close();
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
                        AbstractC0997i0.r(e12.getMessage(), e12);
                        this.f17312b = new C1049x0(6, e12.toString(), 0);
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
                    AbstractC0997i0.r(e14.getMessage(), e14);
                    this.f17312b = new C1049x0(3, e14.toString(), 0);
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
                this.f17312b = new C1049x0(7, e16.toString(), 0);
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
            this.f17312b = new C1049x0(7, e18.toString(), 0);
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
