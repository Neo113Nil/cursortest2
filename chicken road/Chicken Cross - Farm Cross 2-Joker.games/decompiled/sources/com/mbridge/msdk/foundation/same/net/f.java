package com.mbridge.msdk.foundation.same.net;

import android.text.TextUtils;
import com.mbridge.msdk.foundation.tools.q0;
import com.mbridge.msdk.foundation.tools.v0;
import io.ktor.sse.ServerSentEventKt;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.DataInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;
import java.net.URLEncoder;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.Arrays;
import java.util.concurrent.Executors;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.zip.GZIPInputStream;
import java.util.zip.GZIPOutputStream;
import org.json.JSONObject;

/* compiled from: SocketManager.java */
/* loaded from: classes6.dex */
public class f {
    private static volatile AtomicInteger b = new AtomicInteger(1);

    /* renamed from: a, reason: collision with root package name */
    private ThreadPoolExecutor f9349a;

    /* compiled from: SocketManager.java */
    class a implements ThreadFactory {
        a() {
        }

        @Override // java.util.concurrent.ThreadFactory
        public Thread newThread(Runnable runnable) {
            Thread newThread = Executors.defaultThreadFactory().newThread(runnable);
            newThread.setName("SocketThreadPool");
            return newThread;
        }
    }

    /* compiled from: SocketManager.java */
    class b implements Runnable {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ c f9351a;

        b(c cVar) {
            this.f9351a = cVar;
        }

        @Override // java.lang.Runnable
        public void run() {
            this.f9351a.a();
        }
    }

    /* compiled from: SocketManager.java */
    private static final class d {

        /* renamed from: a, reason: collision with root package name */
        private static f f9353a = new f(null);
    }

    /* synthetic */ f(a aVar) {
        this();
    }

    public static f b() {
        return d.f9353a;
    }

    private f() {
        ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(5, 5, 5L, TimeUnit.MILLISECONDS, new LinkedBlockingQueue(), new a(), new ThreadPoolExecutor.DiscardPolicy());
        this.f9349a = threadPoolExecutor;
        threadPoolExecutor.allowCoreThreadTimeOut(true);
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

    public void a(String str, int i, String str2, boolean z, com.mbridge.msdk.foundation.same.net.b bVar, boolean z2) {
        if (z2) {
            try {
                JSONObject jSONObject = new JSONObject(str2);
                jSONObject.put("data", "p=" + URLEncoder.encode(v0.b(jSONObject.optString("data"), "ebmclXzZOhtU2sRlZxGL8A"), "UTF-8"));
                str2 = jSONObject.toString();
            } catch (Exception e) {
                q0.b("SocketManager", "send error", e);
            }
        }
        this.f9349a.execute(new b(new c(str, i, str2, z, bVar)));
    }

    /* compiled from: SocketManager.java */
    public class c {

        /* renamed from: a, reason: collision with root package name */
        private ByteBuffer f9352a;
        private String b;
        private boolean c;
        private com.mbridge.msdk.foundation.same.net.b d;
        private OutputStream e;
        private int f;
        private Socket g;
        private String h;

        c(String str, int i, String str2, boolean z, com.mbridge.msdk.foundation.same.net.b bVar) {
            this.b = str;
            this.f = i;
            this.h = str2;
            this.c = z;
            this.d = bVar;
        }

        /* JADX WARN: Finally extract failed */
        /* JADX WARN: Removed duplicated region for block: B:108:0x0141  */
        /* JADX WARN: Removed duplicated region for block: B:109:0x013b  */
        /* JADX WARN: Removed duplicated region for block: B:110:0x00c9 A[Catch: all -> 0x02a3, TryCatch #4 {all -> 0x02a3, blocks: (B:3:0x0010, B:5:0x0030, B:9:0x0042, B:11:0x008f, B:12:0x00a1, B:14:0x00b7, B:15:0x00f2, B:21:0x0142, B:25:0x017d, B:28:0x018a, B:43:0x01ab, B:55:0x01d4, B:68:0x01f6, B:70:0x01fa, B:81:0x0208, B:89:0x0287, B:104:0x0271, B:107:0x0284, B:110:0x00c9, B:112:0x00cd, B:113:0x00dc, B:114:0x00d6, B:115:0x0095, B:118:0x009e, B:84:0x0228, B:85:0x0235, B:87:0x023b, B:88:0x0242, B:102:0x022f), top: B:2:0x0010, inners: #0 }] */
        /* JADX WARN: Removed duplicated region for block: B:115:0x0095 A[Catch: all -> 0x02a3, TryCatch #4 {all -> 0x02a3, blocks: (B:3:0x0010, B:5:0x0030, B:9:0x0042, B:11:0x008f, B:12:0x00a1, B:14:0x00b7, B:15:0x00f2, B:21:0x0142, B:25:0x017d, B:28:0x018a, B:43:0x01ab, B:55:0x01d4, B:68:0x01f6, B:70:0x01fa, B:81:0x0208, B:89:0x0287, B:104:0x0271, B:107:0x0284, B:110:0x00c9, B:112:0x00cd, B:113:0x00dc, B:114:0x00d6, B:115:0x0095, B:118:0x009e, B:84:0x0228, B:85:0x0235, B:87:0x023b, B:88:0x0242, B:102:0x022f), top: B:2:0x0010, inners: #0 }] */
        /* JADX WARN: Removed duplicated region for block: B:11:0x008f A[Catch: all -> 0x02a3, TryCatch #4 {all -> 0x02a3, blocks: (B:3:0x0010, B:5:0x0030, B:9:0x0042, B:11:0x008f, B:12:0x00a1, B:14:0x00b7, B:15:0x00f2, B:21:0x0142, B:25:0x017d, B:28:0x018a, B:43:0x01ab, B:55:0x01d4, B:68:0x01f6, B:70:0x01fa, B:81:0x0208, B:89:0x0287, B:104:0x0271, B:107:0x0284, B:110:0x00c9, B:112:0x00cd, B:113:0x00dc, B:114:0x00d6, B:115:0x0095, B:118:0x009e, B:84:0x0228, B:85:0x0235, B:87:0x023b, B:88:0x0242, B:102:0x022f), top: B:2:0x0010, inners: #0 }] */
        /* JADX WARN: Removed duplicated region for block: B:14:0x00b7 A[Catch: all -> 0x02a3, TryCatch #4 {all -> 0x02a3, blocks: (B:3:0x0010, B:5:0x0030, B:9:0x0042, B:11:0x008f, B:12:0x00a1, B:14:0x00b7, B:15:0x00f2, B:21:0x0142, B:25:0x017d, B:28:0x018a, B:43:0x01ab, B:55:0x01d4, B:68:0x01f6, B:70:0x01fa, B:81:0x0208, B:89:0x0287, B:104:0x0271, B:107:0x0284, B:110:0x00c9, B:112:0x00cd, B:113:0x00dc, B:114:0x00d6, B:115:0x0095, B:118:0x009e, B:84:0x0228, B:85:0x0235, B:87:0x023b, B:88:0x0242, B:102:0x022f), top: B:2:0x0010, inners: #0 }] */
        /* JADX WARN: Removed duplicated region for block: B:17:0x0139  */
        /* JADX WARN: Removed duplicated region for block: B:20:0x013f  */
        /* JADX WARN: Removed duplicated region for block: B:30:0x018e  */
        /* JADX WARN: Removed duplicated region for block: B:41:0x01a7  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public void a() {
            boolean z;
            int length;
            boolean z2;
            com.mbridge.msdk.foundation.same.net.b bVar;
            try {
                Socket socket = new Socket(this.b, this.f);
                this.g = socket;
                socket.setSoTimeout(15000);
                if (!this.b.contains(com.mbridge.msdk.foundation.same.net.utils.d.h().j) && !this.b.contains(com.mbridge.msdk.foundation.same.net.utils.d.h().l)) {
                    z = false;
                    q0.b("SocketManager", "Socket connect : " + this.b + " : " + this.f + " isAnalytics : " + z);
                    this.e = this.g.getOutputStream();
                    ByteBuffer wrap = ByteBuffer.wrap(new byte[8]);
                    this.f9352a = wrap;
                    ByteOrder byteOrder = ByteOrder.BIG_ENDIAN;
                    wrap.order(byteOrder);
                    this.f9352a.put((byte) 2);
                    if (TextUtils.isEmpty(this.h)) {
                        this.f9352a.put(this.c ? (byte) 3 : (byte) 2);
                    } else {
                        this.f9352a.put((byte) 1);
                    }
                    this.f9352a.putShort((short) f.b.getAndIncrement());
                    if (TextUtils.isEmpty(this.h)) {
                        byte[] a2 = this.c ? f.this.a(this.h) : this.h.getBytes();
                        length = a2.length;
                        this.f9352a.putInt(length);
                        this.e.write(this.f9352a.array());
                        this.e.write(a2);
                    } else {
                        this.f9352a.putInt(0);
                        this.e.write(this.f9352a.array());
                        length = 0;
                    }
                    this.e.flush();
                    q0.a("SocketManager", "Socket Request : header : " + Arrays.toString(this.f9352a.array()) + " length : " + length);
                    InputStream inputStream = this.g.getInputStream();
                    byte[] bArr = new byte[8];
                    inputStream.read(bArr, 0, 8);
                    ByteBuffer wrap2 = ByteBuffer.wrap(bArr);
                    this.f9352a = wrap2;
                    wrap2.order(byteOrder);
                    int i = this.f9352a.getInt(4);
                    byte b = bArr[1];
                    z2 = b != 3;
                    boolean z3 = b != 2;
                    q0.b("SocketManager", "Socket Response : header : " + Arrays.toString(bArr) + " length : " + i + " isGzip : " + z2);
                    byte[] bArr2 = new byte[i];
                    new DataInputStream(this.g.getInputStream()).readFully(bArr2);
                    if (!z2 && i > 2 && ((bArr2[0] << 8) | (bArr2[1] & 255)) == 8075) {
                        z2 = true;
                    }
                    bVar = this.d;
                    if (bVar != null) {
                        Socket socket2 = this.g;
                        if (socket2 != null) {
                            try {
                                socket2.close();
                                this.f9352a = null;
                                this.e.close();
                                return;
                            } catch (IOException e) {
                                q0.b("SocketManager", e.getMessage());
                                return;
                            }
                        }
                        return;
                    }
                    if (z3 && i == 0) {
                        bVar.onSuccess(e.a(null, new com.mbridge.msdk.foundation.same.net.toolbox.a(204, null, null)));
                        Socket socket3 = this.g;
                        if (socket3 != null) {
                            try {
                                socket3.close();
                                this.f9352a = null;
                                this.e.close();
                                return;
                            } catch (IOException e2) {
                                q0.b("SocketManager", e2.getMessage());
                                return;
                            }
                        }
                        return;
                    }
                    if (i < 1) {
                        a("The response data less than 1");
                        Socket socket4 = this.g;
                        if (socket4 != null) {
                            try {
                                socket4.close();
                                this.f9352a = null;
                                this.e.close();
                                return;
                            } catch (IOException e3) {
                                q0.b("SocketManager", e3.getMessage());
                                return;
                            }
                        }
                        return;
                    }
                    if (z) {
                        if (bArr2[0] == 1) {
                            bVar.onSuccess(e.a(null, new com.mbridge.msdk.foundation.same.net.toolbox.a(200, null, null)));
                        } else {
                            a("The server returns fail");
                        }
                        Socket socket5 = this.g;
                        if (socket5 != null) {
                            try {
                                socket5.close();
                                this.f9352a = null;
                                this.e.close();
                                return;
                            } catch (IOException e4) {
                                q0.b("SocketManager", e4.getMessage());
                                return;
                            }
                        }
                        return;
                    }
                    try {
                        String a3 = z2 ? f.this.a(bArr2) : new String(bArr2);
                        JSONObject jSONObject = !TextUtils.isEmpty(a3) ? new JSONObject(a3) : null;
                        q0.b("SocketManager", "Socket Response length : " + i + ServerSentEventKt.SPACE + a3.length());
                        this.d.onSuccess(e.a(jSONObject, new com.mbridge.msdk.foundation.same.net.toolbox.a(200, null, null)));
                    } catch (Throwable th) {
                        String message = th.getMessage();
                        q0.b("SocketManager", th.getMessage());
                        if (TextUtils.isEmpty(message)) {
                            message = "The JSON data is illegal";
                        }
                        a(message);
                    }
                    inputStream.close();
                    Socket socket6 = this.g;
                    if (socket6 != null) {
                        try {
                            socket6.close();
                            this.f9352a = null;
                            this.e.close();
                            return;
                        } catch (IOException e5) {
                            q0.b("SocketManager", e5.getMessage());
                            return;
                        }
                    }
                    return;
                }
                z = true;
                q0.b("SocketManager", "Socket connect : " + this.b + " : " + this.f + " isAnalytics : " + z);
                this.e = this.g.getOutputStream();
                ByteBuffer wrap3 = ByteBuffer.wrap(new byte[8]);
                this.f9352a = wrap3;
                ByteOrder byteOrder2 = ByteOrder.BIG_ENDIAN;
                wrap3.order(byteOrder2);
                this.f9352a.put((byte) 2);
                if (TextUtils.isEmpty(this.h)) {
                }
                this.f9352a.putShort((short) f.b.getAndIncrement());
                if (TextUtils.isEmpty(this.h)) {
                }
                this.e.flush();
                q0.a("SocketManager", "Socket Request : header : " + Arrays.toString(this.f9352a.array()) + " length : " + length);
                InputStream inputStream2 = this.g.getInputStream();
                byte[] bArr3 = new byte[8];
                inputStream2.read(bArr3, 0, 8);
                ByteBuffer wrap22 = ByteBuffer.wrap(bArr3);
                this.f9352a = wrap22;
                wrap22.order(byteOrder2);
                int i2 = this.f9352a.getInt(4);
                byte b2 = bArr3[1];
                if (b2 != 3) {
                }
                if (b2 != 2) {
                }
                q0.b("SocketManager", "Socket Response : header : " + Arrays.toString(bArr3) + " length : " + i2 + " isGzip : " + z2);
                byte[] bArr22 = new byte[i2];
                new DataInputStream(this.g.getInputStream()).readFully(bArr22);
                if (!z2) {
                    z2 = true;
                }
                bVar = this.d;
                if (bVar != null) {
                }
            } catch (Throwable th2) {
                try {
                    String message2 = th2.getMessage();
                    q0.a("SocketManager", "Socket exception: " + message2);
                    a(message2);
                    Socket socket7 = this.g;
                    if (socket7 != null) {
                        try {
                            socket7.close();
                            this.f9352a = null;
                            this.e.close();
                        } catch (IOException e6) {
                            q0.b("SocketManager", e6.getMessage());
                        }
                    }
                } catch (Throwable th3) {
                    Socket socket8 = this.g;
                    if (socket8 == null) {
                        throw th3;
                    }
                    try {
                        socket8.close();
                        this.f9352a = null;
                        this.e.close();
                        throw th3;
                    } catch (IOException e7) {
                        q0.b("SocketManager", e7.getMessage());
                        throw th3;
                    }
                }
            }
        }

        private void a(String str) {
            if (this.d != null) {
                if (TextUtils.isEmpty(str)) {
                    str = "Unknown exception";
                }
                this.d.onError(new com.mbridge.msdk.foundation.same.net.exception.a(13, new com.mbridge.msdk.foundation.same.net.toolbox.a(404, str.getBytes(), null)));
            }
        }
    }
}
