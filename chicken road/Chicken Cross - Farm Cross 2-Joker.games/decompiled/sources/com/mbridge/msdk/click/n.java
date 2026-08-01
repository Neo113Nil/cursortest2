package com.mbridge.msdk.click;

import android.net.Uri;
import android.text.TextUtils;
import com.facebook.share.internal.ShareConstants;
import com.google.common.net.HttpHeaders;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import com.mbridge.msdk.foundation.tools.m0;
import com.mbridge.msdk.foundation.tools.q0;
import com.tiktok.util.UrlConst;
import com.vungle.ads.internal.protos.Sdk;
import io.ktor.sse.ServerSentEventKt;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.DataInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.zip.GZIPInputStream;
import java.util.zip.GZIPOutputStream;
import org.json.JSONObject;

/* compiled from: SocketSpider.java */
/* loaded from: classes6.dex */
public class n {
    private static final AtomicInteger d = new AtomicInteger(1);

    /* renamed from: a, reason: collision with root package name */
    private com.mbridge.msdk.setting.g f8878a;
    private String b;
    private int c = 9377;

    public n() {
        com.mbridge.msdk.setting.g f = com.mbridge.msdk.setting.i.b().f(com.mbridge.msdk.foundation.controller.c.n().b());
        this.f8878a = f;
        if (f == null) {
            this.f8878a = com.mbridge.msdk.setting.i.b().a();
        }
    }

    private JSONObject b(String str, CampaignEx campaignEx, boolean z, boolean z2) {
        JSONObject jSONObject = new JSONObject();
        try {
            Uri parse = Uri.parse(str);
            if (parse != null) {
                String host = parse.getHost();
                String path = parse.getPath();
                String encodedQuery = parse.getEncodedQuery();
                this.b = host;
                jSONObject.put(ShareConstants.MEDIA_URI, UrlConst.HTTPS + host + path);
                jSONObject.put("data", encodedQuery);
            }
        } catch (Throwable th) {
            q0.b("SocketSpider", th.getMessage());
        }
        try {
            JSONObject jSONObject2 = new JSONObject();
            if (!z && !z2) {
                jSONObject2.put("User-Agent", m0.i());
            }
            if (campaignEx != null) {
                if (z && campaignEx.getcUA() == 1) {
                    jSONObject2.put("User-Agent", m0.i());
                }
                if (z2 && campaignEx.getImpUA() == 1) {
                    jSONObject2.put("User-Agent", m0.i());
                }
            } else {
                jSONObject2.put("User-Agent", m0.i());
            }
            jSONObject2.put(HttpHeaders.ACCEPT_ENCODING, "gzip");
            if (this.f8878a.O0() && !TextUtils.isEmpty(str)) {
                jSONObject2.put("referer", str);
            }
            jSONObject.put("header", jSONObject2);
        } catch (Throwable th2) {
            q0.b("SocketSpider", th2.getMessage());
        }
        return jSONObject;
    }

    public com.mbridge.msdk.click.entity.a a(String str, CampaignEx campaignEx, boolean z, boolean z2) {
        com.mbridge.msdk.click.entity.a aVar = new com.mbridge.msdk.click.entity.a();
        aVar.g = str;
        if (TextUtils.isEmpty(str)) {
            aVar.h = "request url can not null.";
            return aVar;
        }
        String replace = str.replace(ServerSentEventKt.SPACE, "%20");
        JSONObject b = b(replace, campaignEx, z, z2);
        if (b.length() == 0) {
            aVar.h = "request content generation failed.";
            return aVar;
        }
        if (TextUtils.isEmpty(b.optString(ShareConstants.MEDIA_URI))) {
            aVar.h = "request url parse error.";
            return aVar;
        }
        if (campaignEx != null) {
            int trackingTcpPort = campaignEx.getTrackingTcpPort();
            if (trackingTcpPort == 0) {
                trackingTcpPort = 9377;
            }
            this.c = trackingTcpPort;
        }
        if (!TextUtils.isEmpty(this.b)) {
            return a(replace, b.toString());
        }
        aVar.h = "request url parse error.";
        return aVar;
    }

    private com.mbridge.msdk.click.entity.a a(String str, String str2) {
        OutputStream outputStream;
        Socket socket;
        int length;
        InputStream inputStream;
        int i;
        byte b;
        boolean z;
        boolean z2;
        byte[] bArr;
        String str3;
        com.mbridge.msdk.click.entity.a aVar = new com.mbridge.msdk.click.entity.a();
        Socket socket2 = null;
        OutputStream outputStream2 = null;
        try {
            socket = new Socket(this.b, this.c);
            try {
                socket.setSoTimeout(15000);
                outputStream2 = socket.getOutputStream();
                ByteBuffer wrap = ByteBuffer.wrap(new byte[8]);
                ByteOrder byteOrder = ByteOrder.BIG_ENDIAN;
                wrap.order(byteOrder);
                wrap.put((byte) 2);
                wrap.put((byte) 3);
                wrap.putShort((short) d.getAndIncrement());
                if (TextUtils.isEmpty(str2)) {
                    wrap.putInt(0);
                    outputStream2.write(wrap.array());
                    length = 0;
                } else {
                    byte[] a2 = a(str2);
                    length = a2.length;
                    wrap.putInt(length);
                    outputStream2.write(wrap.array());
                    outputStream2.write(a2);
                }
                outputStream2.flush();
                q0.a("SocketSpider", "Socket Request : header : " + Arrays.toString(wrap.array()) + " length : " + length);
                inputStream = socket.getInputStream();
                byte[] bArr2 = new byte[8];
                inputStream.read(bArr2, 0, 8);
                ByteBuffer wrap2 = ByteBuffer.wrap(bArr2);
                wrap2.order(byteOrder);
                i = wrap2.getInt(4);
                byte b2 = bArr2[1];
                if (b2 == 3) {
                    z = true;
                    b = 2;
                } else {
                    b = 2;
                    z = false;
                }
                z2 = b2 == b;
                q0.b("SocketSpider", "Socket Response : header : " + Arrays.toString(bArr2) + " length : " + i + " isGzip : " + z);
                bArr = new byte[i];
                new DataInputStream(socket.getInputStream()).readFully(bArr);
                if (!z && i > 2 && ((bArr[0] << 8) | (bArr[1] & 255)) == 8075) {
                    z = true;
                }
            } catch (Throwable th) {
                th = th;
                outputStream = outputStream2;
                socket2 = socket;
                try {
                    q0.a("SocketSpider", "Socket exception: " + th.getMessage());
                    aVar.h = th.getMessage();
                    if (socket2 != null) {
                        try {
                            socket2.close();
                            if (outputStream != null) {
                                outputStream.close();
                            }
                        } catch (Exception e) {
                            q0.b("SocketSpider", e.getMessage());
                        }
                    }
                    return aVar;
                } finally {
                }
            }
        } catch (Throwable th2) {
            th = th2;
            outputStream = null;
        }
        if (z2 && i == 0) {
            aVar.f = 200;
            aVar.g = str;
            aVar.e = 0;
            try {
                socket.close();
                outputStream2.close();
            } catch (Exception e2) {
                q0.b("SocketSpider", e2.getMessage());
            }
            return aVar;
        }
        if (i < 1) {
            aVar.f = 200;
            aVar.g = str;
            aVar.e = 0;
            try {
                socket.close();
                outputStream2.close();
            } catch (Exception e3) {
                q0.b("SocketSpider", e3.getMessage());
            }
            return aVar;
        }
        try {
            if (z) {
                str3 = a(bArr);
            } else {
                str3 = new String(bArr);
            }
            if (!TextUtils.isEmpty(str3)) {
                aVar.f = 200;
                aVar.g = str;
                aVar.e = 0;
                try {
                    JSONObject optJSONObject = new JSONObject(str3).optJSONObject("data");
                    if (optJSONObject != null) {
                        String optString = optJSONObject.optString(FirebaseAnalytics.Param.LOCATION);
                        if (!TextUtils.isEmpty(optString)) {
                            aVar.f = Sdk.SDKError.Reason.INVALID_IFA_STATUS_VALUE;
                            aVar.f8871a = optString;
                        }
                    }
                } catch (Throwable th3) {
                    q0.b("SocketSpider", th3.getMessage());
                }
                try {
                    socket.close();
                    outputStream2.close();
                } catch (Exception e4) {
                    q0.b("SocketSpider", e4.getMessage());
                }
                return aVar;
            }
        } catch (Throwable th4) {
            q0.b("SocketSpider", th4.getMessage());
            aVar.h = th4.getMessage();
        }
        inputStream.close();
        try {
            socket.close();
            outputStream2.close();
        } catch (Exception e5) {
            q0.b("SocketSpider", e5.getMessage());
        }
        return aVar;
    }

    public byte[] a(String str) throws IOException {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        GZIPOutputStream gZIPOutputStream = new GZIPOutputStream(byteArrayOutputStream);
        gZIPOutputStream.write(str.getBytes());
        gZIPOutputStream.close();
        return byteArrayOutputStream.toByteArray();
    }

    public String a(byte[] bArr) throws IOException {
        if (bArr == null || bArr.length == 0) {
            return null;
        }
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(bArr);
        GZIPInputStream gZIPInputStream = new GZIPInputStream(byteArrayInputStream);
        byte[] bArr2 = new byte[1024];
        while (true) {
            int read = gZIPInputStream.read(bArr2, 0, 1024);
            if (read > 0) {
                byteArrayOutputStream.write(bArr2, 0, read);
            } else {
                gZIPInputStream.close();
                byteArrayInputStream.close();
                byteArrayOutputStream.flush();
                byteArrayOutputStream.close();
                return byteArrayOutputStream.toString();
            }
        }
    }
}
