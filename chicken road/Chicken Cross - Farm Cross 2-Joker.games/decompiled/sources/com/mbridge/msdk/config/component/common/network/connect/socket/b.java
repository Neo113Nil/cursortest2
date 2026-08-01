package com.mbridge.msdk.config.component.common.network.connect.socket;

import android.text.TextUtils;
import com.mbridge.msdk.config.component.common.network.listener.EventListenerTCP;
import com.mbridge.msdk.foundation.same.net.utils.d;
import com.mbridge.msdk.foundation.tools.q0;
import io.ktor.sse.ServerSentEventKt;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.DataInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.ConnectException;
import java.net.InetSocketAddress;
import java.net.Socket;
import java.net.SocketTimeoutException;
import java.net.UnknownHostException;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.Arrays;
import java.util.Map;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.zip.GZIPInputStream;
import java.util.zip.GZIPOutputStream;
import org.json.JSONObject;

/* compiled from: SocketRequestTask.java */
/* loaded from: classes6.dex */
public class b implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    private String f8957a;
    private final AtomicInteger b = new AtomicInteger(1);
    private boolean c = false;
    private Socket d;
    private OutputStream e;
    private InputStream f;
    private com.mbridge.msdk.config.component.nori.model.a g;
    private com.mbridge.msdk.config.component.common.network.result.a h;
    private com.mbridge.msdk.config.component.common.network.a i;
    private com.mbridge.msdk.config.component.common.network.retry.a j;
    private EventListenerTCP k;
    private boolean l;
    private String m;

    public b(com.mbridge.msdk.config.component.nori.model.a aVar, com.mbridge.msdk.config.component.common.network.result.a aVar2, com.mbridge.msdk.config.component.common.network.a aVar3) {
        this.g = aVar;
        this.i = aVar3;
        this.h = aVar2;
        this.k = new EventListenerTCP(aVar2.b());
    }

    private void b(String str) throws IOException {
        byte[] a2;
        try {
            EventListenerTCP eventListenerTCP = this.k;
            if (eventListenerTCP != null) {
                eventListenerTCP.requestHeadersStart();
            }
            this.l = false;
            ByteBuffer wrap = ByteBuffer.wrap(new byte[8]);
            wrap.order(ByteOrder.BIG_ENDIAN);
            wrap.put((byte) 2);
            if (TextUtils.isEmpty(str)) {
                wrap.put((byte) 1);
            } else {
                wrap.put(this.l ? (byte) 3 : (byte) 2);
            }
            wrap.putShort((short) this.b.getAndIncrement());
            if (TextUtils.isEmpty(str)) {
                wrap.putInt(0);
                a2 = null;
            } else {
                a2 = this.l ? a(str) : str.getBytes();
                wrap.putInt(a2 != null ? a2.length : 0);
            }
            this.e.write(wrap.array());
            EventListenerTCP eventListenerTCP2 = this.k;
            if (eventListenerTCP2 != null) {
                eventListenerTCP2.requestHeadersEnd();
            }
            if (a2 != null) {
                EventListenerTCP eventListenerTCP3 = this.k;
                if (eventListenerTCP3 != null) {
                    eventListenerTCP3.requestBodyStart();
                }
                this.e.write(a2);
                EventListenerTCP eventListenerTCP4 = this.k;
                if (eventListenerTCP4 != null) {
                    eventListenerTCP4.requestBodyEnd(a2.length);
                }
            }
            this.e.flush();
        } catch (IOException e) {
            q0.b("JavaSocketConnection", "Failed to send request: " + e.getMessage());
            throw new IOException("Failed to send request: " + e.getMessage(), e);
        }
    }

    private com.mbridge.msdk.config.component.common.network.result.a d() {
        try {
            JSONObject g = g();
            f();
            b(g.toString());
            return i();
        } catch (ConnectException e) {
            return a(1002, 1002, "Connection refused: " + e.getMessage());
        } catch (SocketTimeoutException e2) {
            return a(1001, 1001, "Connection timeout: " + e2.getMessage());
        } catch (UnknownHostException e3) {
            return a(2001, 2001, "Host unreachable: " + e3.getMessage());
        } catch (IOException e4) {
            return a(2003, 2003, "Network error: " + e4.getMessage());
        } catch (Exception e5) {
            return a(1999, 1999, "Unknown error: " + e5.getMessage());
        }
    }

    private void f() throws IOException {
        try {
            try {
                try {
                    try {
                        EventListenerTCP eventListenerTCP = this.k;
                        if (eventListenerTCP != null) {
                            eventListenerTCP.dnsStart();
                        }
                        this.d = new Socket();
                        InetSocketAddress inetSocketAddress = new InetSocketAddress(this.f8957a, this.g.j());
                        if (inetSocketAddress.isUnresolved()) {
                            throw new IOException("Cannot resolve host: " + this.f8957a);
                        }
                        EventListenerTCP eventListenerTCP2 = this.k;
                        if (eventListenerTCP2 != null) {
                            eventListenerTCP2.dnsEnd(this.f8957a, Arrays.asList(inetSocketAddress.getAddress()));
                        }
                        this.d.setSoTimeout(30000);
                        EventListenerTCP eventListenerTCP3 = this.k;
                        if (eventListenerTCP3 != null) {
                            eventListenerTCP3.connectStart(inetSocketAddress);
                        }
                        this.d.connect(inetSocketAddress, 30000);
                        EventListenerTCP eventListenerTCP4 = this.k;
                        if (eventListenerTCP4 != null) {
                            eventListenerTCP4.connectEnd(inetSocketAddress);
                        }
                        this.e = this.d.getOutputStream();
                        this.f = this.d.getInputStream();
                        q0.a("JavaSocketConnection", "Socket connected to " + this.f8957a + ServerSentEventKt.COLON);
                    } catch (IOException e) {
                        EventListenerTCP eventListenerTCP5 = this.k;
                        if (eventListenerTCP5 != null) {
                            eventListenerTCP5.connectFailed(new InetSocketAddress(this.f8957a, this.g.j()), e);
                        }
                        throw new IOException("Connection failed", e);
                    }
                } catch (UnknownHostException e2) {
                    EventListenerTCP eventListenerTCP6 = this.k;
                    if (eventListenerTCP6 != null) {
                        eventListenerTCP6.connectFailed(new InetSocketAddress(this.f8957a, this.g.j()), e2);
                    }
                    throw new IOException("Host unreachable", e2);
                }
            } catch (ConnectException e3) {
                EventListenerTCP eventListenerTCP7 = this.k;
                if (eventListenerTCP7 != null) {
                    eventListenerTCP7.connectFailed(new InetSocketAddress(this.f8957a, this.g.j()), e3);
                }
                throw new IOException("Connection refused", e3);
            } catch (SocketTimeoutException e4) {
                EventListenerTCP eventListenerTCP8 = this.k;
                if (eventListenerTCP8 != null) {
                    eventListenerTCP8.connectFailed(new InetSocketAddress(this.f8957a, this.g.j()), e4);
                }
                throw new IOException("Connection timeout", e4);
            }
        } finally {
            Socket socket = this.d;
            if (socket == null || !socket.isConnected()) {
                b();
            }
        }
    }

    private JSONObject g() {
        JSONObject jSONObject = new JSONObject();
        try {
            this.f8957a = d.h().m;
            int j = this.g.j();
            Map<String, Object> b = this.g.b();
            JSONObject jSONObject2 = new JSONObject();
            if (b != null) {
                for (Map.Entry<String, Object> entry : b.entrySet()) {
                    jSONObject2.put(entry.getKey(), entry.getValue());
                }
            }
            jSONObject.put("headers", jSONObject2);
            JSONObject jSONObject3 = new JSONObject();
            jSONObject3.put("host", this.f8957a);
            jSONObject3.put("port", j);
            Map<String, Object> a2 = this.g.a();
            if (a2 != null) {
                JSONObject jSONObject4 = new JSONObject();
                for (Map.Entry<String, Object> entry2 : a2.entrySet()) {
                    jSONObject4.put(entry2.getKey(), entry2.getValue());
                }
                jSONObject3.put("data", jSONObject4);
            }
            jSONObject.put("body", jSONObject3);
        } catch (Exception e) {
            q0.b("JavaSocketConnection", "Failed to prepare request content: " + e.getMessage());
        }
        return jSONObject;
    }

    private void h() {
        if (this.i == null) {
            return;
        }
        EventListenerTCP eventListenerTCP = this.k;
        if (eventListenerTCP != null) {
            eventListenerTCP.callEnd();
        }
        if (com.mbridge.msdk.config.component.common.util.c.a(this.h.g())) {
            this.i.b(this.h);
            return;
        }
        if (this.h.g() == 200) {
            this.i.c(this.h);
            com.mbridge.msdk.config.component.common.network.retry.a aVar = this.j;
            if (aVar != null) {
                aVar.a();
                return;
            }
            return;
        }
        com.mbridge.msdk.config.component.common.network.retry.a aVar2 = this.j;
        if (aVar2 != null) {
            aVar2.b();
        } else if (this.g.g() > 0) {
            new com.mbridge.msdk.config.component.common.network.retry.c(this.m, this.g, this.i, this.h).c();
        } else {
            this.i.d(this.h);
        }
    }

    private com.mbridge.msdk.config.component.common.network.result.a i() {
        try {
            EventListenerTCP eventListenerTCP = this.k;
            if (eventListenerTCP != null) {
                eventListenerTCP.responseHeadersStart();
            }
            byte[] bArr = new byte[8];
            if (this.f.read(bArr) != 8) {
                return a(1008, 1008, "Failed to read response header");
            }
            ByteBuffer wrap = ByteBuffer.wrap(bArr);
            wrap.order(ByteOrder.BIG_ENDIAN);
            if (wrap.get() != 2) {
                return a(1008, 1008, "Invalid protocol version");
            }
            byte b = wrap.get();
            wrap.getShort();
            int i = wrap.getInt();
            EventListenerTCP eventListenerTCP2 = this.k;
            if (eventListenerTCP2 != null) {
                eventListenerTCP2.responseHeadersEnd();
            }
            if (i > 0) {
                EventListenerTCP eventListenerTCP3 = this.k;
                if (eventListenerTCP3 != null) {
                    eventListenerTCP3.responseBodyStart();
                }
                boolean z = false;
                boolean z2 = b == 3;
                byte[] bArr2 = new byte[i];
                new DataInputStream(this.f).readFully(bArr2);
                if (i > 2) {
                    if (((bArr2[0] << 8) | (bArr2[1] & 255)) == 8075) {
                        z = true;
                    }
                }
                try {
                    this.h.b((z2 && z) ? a(bArr2) : new String(bArr2));
                    this.h.c(200);
                    this.h.b(1);
                    EventListenerTCP eventListenerTCP4 = this.k;
                    if (eventListenerTCP4 != null) {
                        eventListenerTCP4.responseBodyEnd(i);
                    }
                } catch (Exception e) {
                    return a(1010, 1010, "Failed to process response data: " + e.getMessage());
                }
            } else {
                this.h.c(200);
                this.h.b(1);
            }
            return this.h;
        } catch (SocketTimeoutException e2) {
            return a(1004, 1004, "Read timeout: " + e2.getMessage());
        } catch (IOException e3) {
            return a(1006, 1006, "Failed to read response: " + e3.getMessage());
        } catch (Exception e4) {
            return a(1999, 1999, "Unknown error while processing response: " + e4.getMessage());
        }
    }

    public void a(com.mbridge.msdk.config.component.common.network.retry.a aVar) {
        this.j = aVar;
    }

    public void c(String str) {
        this.m = str;
    }

    public EventListenerTCP e() {
        return this.k;
    }

    @Override // java.lang.Runnable
    public void run() {
        c();
    }

    private void c() {
        this.h = d();
        if (this.c) {
            a(1999, 1999, "Request cancelled");
        }
        h();
    }

    public void a() {
        this.c = true;
        b();
    }

    private byte[] a(String str) throws IOException {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        GZIPOutputStream gZIPOutputStream = new GZIPOutputStream(byteArrayOutputStream);
        gZIPOutputStream.write(str.getBytes());
        gZIPOutputStream.close();
        return byteArrayOutputStream.toByteArray();
    }

    private String a(byte[] bArr) throws IOException {
        if (bArr != null && bArr.length != 0) {
            try {
                ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(bArr);
                GZIPInputStream gZIPInputStream = new GZIPInputStream(byteArrayInputStream);
                ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                byte[] bArr2 = new byte[1024];
                while (true) {
                    int read = gZIPInputStream.read(bArr2);
                    if (read > 0) {
                        byteArrayOutputStream.write(bArr2, 0, read);
                    } else {
                        gZIPInputStream.close();
                        byteArrayInputStream.close();
                        byteArrayOutputStream.close();
                        return byteArrayOutputStream.toString();
                    }
                }
            } catch (IOException e) {
                q0.b("JavaSocketConnection", "Failed to decompress GZIP data: " + e.getMessage());
                throw e;
            }
        } else {
            return "";
        }
    }

    private com.mbridge.msdk.config.component.common.network.result.a a(int i, int i2, String str) {
        this.h.a(str);
        this.h.c(i);
        this.h.a(i2);
        this.h.b(0);
        EventListenerTCP eventListenerTCP = this.k;
        if (eventListenerTCP != null) {
            eventListenerTCP.callFailed(new IOException(str));
        }
        return this.h;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private void b() {
        OutputStream outputStream = this.e;
        try {
            if (outputStream != null) {
                try {
                    outputStream.close();
                } catch (IOException e) {
                    q0.b("JavaSocketConnection", "Error closing output stream: " + e.getMessage());
                }
            }
            InputStream inputStream = this.f;
            if (inputStream != null) {
                try {
                    try {
                        inputStream.close();
                    } catch (IOException e2) {
                        q0.b("JavaSocketConnection", "Error closing input stream: " + e2.getMessage());
                    }
                } finally {
                    this.f = null;
                }
            }
            Socket socket = this.d;
            try {
                if (socket != null) {
                    try {
                        socket.close();
                    } catch (IOException e3) {
                        q0.b("JavaSocketConnection", "Error closing socket: " + e3.getMessage());
                    }
                }
                q0.a("JavaSocketConnection", "All resources closed");
            } finally {
                this.d = null;
            }
        } finally {
            this.e = null;
        }
    }
}
