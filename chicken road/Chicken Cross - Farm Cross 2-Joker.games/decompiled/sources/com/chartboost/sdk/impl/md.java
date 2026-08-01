package com.chartboost.sdk.impl;

import androidx.compose.animation.core.MutatorMutex$$ExternalSyntheticBackportWithForwarding0;
import com.chartboost.sdk.impl.a3;
import com.chartboost.sdk.internal.Model.CBError;
import com.chartboost.sdk.tracking.g;
import java.io.BufferedInputStream;
import java.io.DataOutputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InterruptedIOException;
import java.net.SocketException;
import java.net.SocketTimeoutException;
import java.net.UnknownHostException;
import java.util.Map;
import java.util.concurrent.Executor;
import javax.net.ssl.HttpsURLConnection;
import javax.net.ssl.SSLException;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* loaded from: classes4.dex */
public class md implements Runnable, Comparable {
    public final Executor b;
    public final nd c;
    public final f3 d;
    public final ph e;
    public final oi f;
    public final a3 g;
    public final h7 h;
    public c3 i;
    public d3 j;
    public boolean k = true;

    public static /* synthetic */ class a {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f4878a;

        static {
            int[] iArr = new int[a3.b.values().length];
            f4878a = iArr;
            try {
                iArr[a3.b.b.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f4878a[a3.b.c.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
        }
    }

    public md(Executor executor, nd ndVar, f3 f3Var, ph phVar, oi oiVar, a3 a3Var, h7 h7Var) {
        this.b = executor;
        this.c = ndVar;
        this.d = f3Var;
        this.e = phVar;
        this.f = oiVar;
        this.g = a3Var;
        this.h = h7Var;
    }

    public static boolean b(int i) {
        return ((100 <= i && i < 200) || i == 204 || i == 304) ? false : true;
    }

    public final c3 a(int i) {
        return c3.a(new CBError(CBError.Internal.NETWORK_FAILURE, "Failure due to HTTP status code " + i));
    }

    public final /* synthetic */ Unit b() {
        run();
        return Unit.INSTANCE;
    }

    public final void c() {
        a3 a3Var = this.g;
        if (a3Var == null || a3Var.d == null || !(a3Var instanceof ok)) {
            return;
        }
        File file = new File(this.g.d.getParentFile(), this.g.d.getName() + ".tmp");
        if (file.exists()) {
            file.delete();
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:33:0x00f0 A[Catch: all -> 0x0133, TryCatch #1 {all -> 0x0133, blocks: (B:48:0x009c, B:50:0x00a4, B:51:0x00b1, B:58:0x00ab, B:31:0x00e8, B:33:0x00f0, B:34:0x00fd, B:43:0x00f7, B:7:0x0039, B:9:0x0041, B:11:0x004f, B:21:0x005a, B:22:0x0067), top: B:6:0x0039, inners: #4, #6, #4 }] */
    /* JADX WARN: Removed duplicated region for block: B:37:0x011f  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x0128  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x00f7 A[Catch: all -> 0x0133, TryCatch #1 {all -> 0x0133, blocks: (B:48:0x009c, B:50:0x00a4, B:51:0x00b1, B:58:0x00ab, B:31:0x00e8, B:33:0x00f0, B:34:0x00fd, B:43:0x00f7, B:7:0x0039, B:9:0x0041, B:11:0x004f, B:21:0x005a, B:22:0x0067), top: B:6:0x0039, inners: #4, #6, #4 }] */
    @Override // java.lang.Runnable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void run() {
        int i;
        c3 c3Var = this.i;
        if (c3Var != null) {
            try {
                CBError cBError = c3Var.b;
                if (cBError == null) {
                    this.g.a(c3Var.f4703a, this.j);
                    return;
                } else {
                    this.g.a(cBError, this.j);
                    return;
                }
            } catch (Exception e) {
                mb.b("deliver result: ", e);
                return;
            }
        }
        if (!MutatorMutex$$ExternalSyntheticBackportWithForwarding0.m(this.g.e, a3.d.c, a3.d.d)) {
            return;
        }
        long b = this.e.b();
        try {
            try {
                if (this.d.e()) {
                    d3 a2 = a(this.g);
                    this.j = a2;
                    if (a2.c()) {
                        this.i = this.g.a(this.j);
                    } else {
                        this.i = a(this.j.b());
                    }
                } else {
                    this.i = a();
                }
                this.g.f = this.e.b() - b;
                int i2 = a.f4878a[this.g.i.ordinal()];
                if (i2 == 1) {
                    this.f.a(new Function0() { // from class: com.chartboost.sdk.impl.md$$ExternalSyntheticLambda0
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            return md.this.b();
                        }
                    });
                } else {
                    if (i2 != 2) {
                        return;
                    }
                    this.b.execute(this);
                }
            } catch (Throwable th) {
                this.g.f = this.e.b() - b;
                int i3 = a.f4878a[this.g.i.ordinal()];
                if (i3 == 1) {
                    this.f.a(new Function0() { // from class: com.chartboost.sdk.impl.md$$ExternalSyntheticLambda0
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            return md.this.b();
                        }
                    });
                } else if (i3 == 2) {
                    this.b.execute(this);
                }
                throw th;
            }
        } catch (InterruptedIOException e2) {
            e = e2;
            if (this.d.e()) {
                this.i = a();
            } else {
                this.i = a(e);
            }
            a(g.h.f, e.toString());
            this.g.f = this.e.b() - b;
            i = a.f4878a[this.g.i.ordinal()];
            if (i != 1) {
                this.f.a(new Function0() { // from class: com.chartboost.sdk.impl.md$$ExternalSyntheticLambda0
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return md.this.b();
                    }
                });
                return;
            }
            if (i != 2) {
                return;
            }
            this.b.execute(this);
        } catch (SocketException e3) {
            e = e3;
            if (this.d.e()) {
            }
            a(g.h.f, e.toString());
            this.g.f = this.e.b() - b;
            i = a.f4878a[this.g.i.ordinal()];
            if (i != 1) {
            }
        } catch (UnknownHostException e4) {
            e = e4;
            if (this.d.e()) {
            }
            a(g.h.f, e.toString());
            this.g.f = this.e.b() - b;
            i = a.f4878a[this.g.i.ordinal()];
            if (i != 1) {
            }
        } catch (SSLException e5) {
            e = e5;
            if (this.d.e()) {
            }
            a(g.h.f, e.toString());
            this.g.f = this.e.b() - b;
            i = a.f4878a[this.g.i.ordinal()];
            if (i != 1) {
            }
        } catch (Throwable th2) {
            if (this.d.e()) {
                this.i = a(th2);
            } else {
                this.i = a();
            }
            a(g.h.c, th2.toString());
            this.g.f = this.e.b() - b;
            int i4 = a.f4878a[this.g.i.ordinal()];
            if (i4 == 1) {
                this.f.a(new Function0() { // from class: com.chartboost.sdk.impl.md$$ExternalSyntheticLambda0
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return md.this.b();
                    }
                });
                return;
            }
            if (i4 != 2) {
                return;
            }
            this.b.execute(this);
        }
    }

    public final c3 a() {
        return c3.a(new CBError(CBError.Internal.INTERNET_UNAVAILABLE, "Internet Unavailable"));
    }

    public final c3 a(IOException iOException) {
        return c3.a(new CBError(CBError.Internal.NETWORK_FAILURE, iOException.toString()));
    }

    public final byte[] b(HttpsURLConnection httpsURLConnection) {
        InputStream errorStream;
        byte[] bArr;
        InputStream inputStream = null;
        try {
            try {
                errorStream = httpsURLConnection.getInputStream();
            } catch (IOException unused) {
                errorStream = httpsURLConnection.getErrorStream();
            }
            InputStream inputStream2 = errorStream;
            if (inputStream2 != null) {
                bArr = u4.f5025a.a(new BufferedInputStream(inputStream2));
            } else {
                bArr = new byte[0];
            }
            if (inputStream2 != null) {
                try {
                    inputStream2.close();
                } catch (IOException unused2) {
                }
            }
            return bArr;
        } catch (Throwable th) {
            if (0 != 0) {
                try {
                    inputStream.close();
                } catch (IOException unused3) {
                }
            }
            throw th;
        }
    }

    public final void c(HttpsURLConnection httpsURLConnection) {
        File file = new File(this.g.d.getParentFile(), this.g.d.getName() + ".tmp");
        if (this.g instanceof ok) {
            if (file.exists()) {
                return;
            }
            if (!file.createNewFile()) {
                throw new IOException("Video temp file was not created and doesn't exist");
            }
        }
        a3 a3Var = this.g;
        if (a3Var instanceof ok) {
            a(a3Var.e(), a(httpsURLConnection));
        }
        InputStream inputStream = httpsURLConnection.getInputStream();
        try {
            FileOutputStream fileOutputStream = new FileOutputStream(file);
            try {
                if (this.g instanceof ok) {
                    byte[] bArr = new byte[8192];
                    while (true) {
                        int read = inputStream.read(bArr);
                        if (read == -1) {
                            break;
                        } else if (file.exists()) {
                            fileOutputStream.write(bArr, 0, read);
                        } else {
                            throw new IOException("Temp file was deleted during download");
                        }
                    }
                } else {
                    u4.f5025a.a(inputStream, fileOutputStream);
                }
                fileOutputStream.close();
                if (inputStream != null) {
                    inputStream.close();
                }
                if (file.renameTo(this.g.d)) {
                    return;
                }
                if (!file.delete()) {
                    String str = "Unable to delete " + file.getAbsolutePath() + " after failing to rename to " + this.g.d.getAbsolutePath();
                    a(str);
                    throw new IOException(str);
                }
                String str2 = "Unable to move " + file.getAbsolutePath() + " to " + this.g.d.getAbsolutePath();
                a(str2);
                throw new IOException(str2);
            } finally {
            }
        } catch (Throwable th) {
            if (inputStream != null) {
                try {
                    inputStream.close();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
            }
            throw th;
        }
    }

    public final c3 a(Throwable th) {
        return c3.a(new CBError(CBError.Internal.MISCELLANEOUS, th.toString()));
    }

    public final void a(com.chartboost.sdk.tracking.g gVar, String str) {
        try {
            c();
            this.h.mo4759track(com.chartboost.sdk.tracking.a.a(gVar, str));
        } catch (Exception unused) {
        }
    }

    public final d3 a(a3 a3Var) {
        int i = 10000;
        int i2 = 0;
        while (true) {
            try {
                return a(a3Var, i);
            } catch (SocketTimeoutException e) {
                if (i2 >= 1) {
                    throw e;
                }
                i *= 2;
                i2++;
            }
        }
    }

    public final d3 a(a3 a3Var, int i) {
        this.k = true;
        b3 a2 = a3Var.a();
        Map map = a2.f4688a;
        HttpsURLConnection a3 = this.c.a(a3Var);
        a3.setSSLSocketFactory(i3.a());
        a3.setConnectTimeout(i);
        a3.setReadTimeout(i);
        a3.setUseCaches(false);
        a3.setDoInput(true);
        try {
            a(map, a3);
            a3.setRequestMethod(a3Var.c().name());
            a(a2, a3);
            long b = this.e.b();
            try {
                int responseCode = a3.getResponseCode();
                long b2 = this.e.b();
                a3Var.g = b2 - b;
                if (responseCode != -1) {
                    return new d3(responseCode, a(a3, responseCode, b2));
                }
                throw new IOException("Could not retrieve response code from HttpsURLConnection.");
            } catch (Throwable th) {
                a3Var.g = this.e.b() - b;
                throw th;
            }
        } finally {
            a3.disconnect();
        }
    }

    public final void a(Map map, HttpsURLConnection httpsURLConnection) {
        if (map != null) {
            for (String str : map.keySet()) {
                httpsURLConnection.addRequestProperty(str, (String) map.get(str));
            }
        }
    }

    public final void a(b3 b3Var, HttpsURLConnection httpsURLConnection) {
        if (!a3.c.c.equals(this.g.c()) || b3Var.b == null) {
            return;
        }
        httpsURLConnection.setDoOutput(true);
        httpsURLConnection.setFixedLengthStreamingMode(b3Var.b.length);
        if (b3Var.a() != null) {
            httpsURLConnection.addRequestProperty("Content-Type", b3Var.a());
        }
        DataOutputStream dataOutputStream = new DataOutputStream(httpsURLConnection.getOutputStream());
        try {
            dataOutputStream.write(b3Var.b);
            dataOutputStream.close();
        } catch (Throwable th) {
            try {
                dataOutputStream.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    public final byte[] a(HttpsURLConnection httpsURLConnection, int i, long j) {
        byte[] bArr;
        byte[] bArr2 = new byte[0];
        try {
            if (b(i)) {
                if (this.g.d != null) {
                    c(httpsURLConnection);
                    return bArr2;
                }
                bArr = b(httpsURLConnection);
            } else {
                bArr = new byte[0];
            }
            bArr2 = bArr;
            return bArr2;
        } finally {
            this.g.h = this.e.b() - j;
        }
    }

    public final void a(String str) {
        this.h.mo4759track(com.chartboost.sdk.tracking.a.a(g.h.e, str));
    }

    public final void a(String str, long j) {
        if (this.k) {
            this.k = false;
            this.g.a(str, j);
        }
    }

    @Override // java.lang.Comparable
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public int compareTo(md mdVar) {
        return this.g.d().b() - mdVar.g.d().b();
    }

    public final long a(HttpsURLConnection httpsURLConnection) {
        return httpsURLConnection.getContentLengthLong();
    }
}
