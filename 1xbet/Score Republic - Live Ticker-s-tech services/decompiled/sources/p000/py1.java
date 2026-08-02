package p000;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLConnection;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.zip.GZIPOutputStream;

/* JADX INFO: compiled from: r8-map-id-738170b7fb69b873ed7524d5270c8e05c6f5fb40ea1ade7a72c8ed7a70699269 */
/* JADX INFO: loaded from: classes.dex */
public final class py1 implements Runnable {

    /* JADX INFO: renamed from: j */
    public final /* synthetic */ int f6289j = 1;

    /* JADX INFO: renamed from: k */
    public final URL f6290k;

    /* JADX INFO: renamed from: l */
    public final byte[] f6291l;

    /* JADX INFO: renamed from: m */
    public final String f6292m;

    /* JADX INFO: renamed from: n */
    public final Map f6293n;

    /* JADX INFO: renamed from: o */
    public final Object f6294o;

    /* JADX INFO: renamed from: p */
    public final /* synthetic */ sq1 f6295p;

    public py1(ry1 ry1Var, String str, URL url, byte[] bArr, Map map, ny1 ny1Var) {
        Objects.requireNonNull(ry1Var);
        this.f6295p = ry1Var;
        p80.m3860e(str);
        p80.m3863h(url);
        this.f6290k = url;
        this.f6291l = bArr;
        this.f6294o = ny1Var;
        this.f6292m = str;
        this.f6293n = map;
    }

    /* JADX INFO: renamed from: a */
    public void m4007a(final int i, final IOException iOException, final byte[] bArr, final Map map) {
        a02 a02Var = ((f02) ((a32) this.f6295p).f7192j).f2248p;
        f02.m1560m(a02Var);
        a02Var.m6J(new Runnable() { // from class: z22
            @Override // java.lang.Runnable
            public final /* synthetic */ void run() {
                py1 py1Var = this.f9584j;
                ((y22) py1Var.f6294o).mo1075a(py1Var.f6292m, i, iOException, bArr, map);
            }
        });
    }

    /* JADX WARN: Code duplicated, block: B:164:0x02c4  */
    /* JADX WARN: Code duplicated, block: B:174:0x0302  */
    /* JADX WARN: Code duplicated, block: B:177:0x02af A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:179:0x02ed A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:181:0x0167 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:183:0x0143 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:81:0x0158  */
    /* JADX WARN: Code duplicated, block: B:91:0x017c  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r24v0, types: [py1] */
    /* JADX WARN: Type inference failed for: r6v24 */
    /* JADX WARN: Type inference failed for: r6v5 */
    /* JADX WARN: Type inference failed for: r6v7, types: [java.util.Map] */
    /* JADX WARN: Type inference failed for: r7v12 */
    /* JADX WARN: Type inference failed for: r7v3 */
    /* JADX WARN: Type inference failed for: r7v4, types: [java.util.Map] */
    @Override // java.lang.Runnable
    public final void run() throws Throwable {
        Throwable th;
        int responseCode;
        HttpURLConnection httpURLConnection;
        IOException iOException;
        Map map;
        gy1 gy1Var;
        a02 a02Var;
        InputStream inputStream;
        Throwable th2;
        OutputStream outputStream;
        HttpURLConnection httpURLConnection2;
        ?? r7;
        IOException iOException2;
        OutputStream outputStream2;
        ?? r6;
        String str;
        Object obj;
        String str2;
        InputStream inputStream2;
        Object obj2 = this.f6294o;
        int i = this.f6289j;
        String str3 = "Content-Encoding";
        byte[] bArr = this.f6291l;
        Map map2 = this.f6293n;
        URL url = this.f6290k;
        sq1 sq1Var = this.f6295p;
        int responseCode2 = 0;
        String str4 = this.f6292m;
        switch (i) {
            case 0:
                OutputStream outputStream3 = null;
                Map map3 = null;
                outputStream = null;
                outputStream3 = null;
                outputStream = null;
                outputStream3 = null;
                OutputStream outputStream4 = null;
                ry1 ry1Var = (ry1) sq1Var;
                f02 f02Var = (f02) ry1Var.f7192j;
                f02 f02Var2 = (f02) ry1Var.f7192j;
                a02 a02Var2 = f02Var.f2248p;
                f02.m1560m(a02Var2);
                a02Var2.m1E();
                try {
                    URLConnection uRLConnectionOpenConnection = url.openConnection();
                    if (!(uRLConnectionOpenConnection instanceof HttpURLConnection)) {
                        throw new IOException("Failed to obtain HTTP connection");
                    }
                    httpURLConnection = (HttpURLConnection) uRLConnectionOpenConnection;
                    httpURLConnection.setDefaultUseCaches(false);
                    f02Var2.getClass();
                    httpURLConnection.setConnectTimeout(60000);
                    httpURLConnection.setReadTimeout(61000);
                    httpURLConnection.setInstanceFollowRedirects(false);
                    httpURLConnection.setDoInput(true);
                    if (map2 != null) {
                        try {
                            for (Map.Entry entry : map2.entrySet()) {
                                httpURLConnection.addRequestProperty((String) entry.getKey(), (String) entry.getValue());
                            }
                        } catch (IOException e) {
                            iOException = e;
                            responseCode = 0;
                            map = null;
                            if (outputStream4 != null) {
                                try {
                                    outputStream4.close();
                                } catch (IOException e2) {
                                    ky1 ky1Var = f02Var2.f2247o;
                                    f02.m1560m(ky1Var);
                                    ky1Var.f4600o.m5314c(ky1.m3106I(str4), e2, "Error closing HTTP compressed POST connection output stream. appId");
                                }
                                break;
                            }
                            if (httpURLConnection != null) {
                                httpURLConnection.disconnect();
                            }
                            a02Var = f02Var2.f2248p;
                            f02.m1560m(a02Var);
                            gy1Var = new gy1(this.f6292m, (ny1) obj2, responseCode, iOException, (byte[]) null, map);
                            a02Var.m6J(gy1Var);
                            return;
                        } catch (Throwable th3) {
                            th = th3;
                            responseCode = 0;
                            th = th;
                            if (outputStream3 != null) {
                                try {
                                    outputStream3.close();
                                } catch (IOException e3) {
                                    ky1 ky1Var2 = f02Var2.f2247o;
                                    f02.m1560m(ky1Var2);
                                    ky1Var2.f4600o.m5314c(ky1.m3106I(str4), e3, "Error closing HTTP compressed POST connection output stream. appId");
                                }
                                break;
                            }
                            if (httpURLConnection != null) {
                                httpURLConnection.disconnect();
                            }
                            a02 a02Var3 = f02Var2.f2248p;
                            f02.m1560m(a02Var3);
                            a02Var3.m6J(new gy1(this.f6292m, (ny1) obj2, responseCode, (IOException) null, (byte[]) null, map3));
                            throw th;
                        }
                    }
                    if (bArr != null) {
                        a72 a72Var = ry1Var.f1566k.f8827p;
                        x62.m5533U(a72Var);
                        byte[] bArrM76k0 = a72Var.m76k0(bArr);
                        ky1 ky1Var3 = f02Var2.f2247o;
                        f02.m1560m(ky1Var3);
                        wc1 wc1Var = ky1Var3.f4608w;
                        int length = bArrM76k0.length;
                        wc1Var.m5313b(Integer.valueOf(length), "Uploading data. size");
                        httpURLConnection.setDoOutput(true);
                        httpURLConnection.addRequestProperty("Content-Encoding", "gzip");
                        httpURLConnection.setFixedLengthStreamingMode(length);
                        httpURLConnection.connect();
                        OutputStream outputStream5 = httpURLConnection.getOutputStream();
                        try {
                            outputStream5.write(bArrM76k0);
                            outputStream5.close();
                        } catch (IOException e4) {
                            iOException = e4;
                            responseCode = 0;
                            map = null;
                            outputStream4 = outputStream5;
                            if (outputStream4 != null) {
                                outputStream4.close();
                                break;
                            }
                            if (httpURLConnection != null) {
                                httpURLConnection.disconnect();
                            }
                            a02Var = f02Var2.f2248p;
                            f02.m1560m(a02Var);
                            gy1Var = new gy1(this.f6292m, (ny1) obj2, responseCode, iOException, (byte[]) null, map);
                            a02Var.m6J(gy1Var);
                            return;
                        } catch (Throwable th4) {
                            th = th4;
                            responseCode = 0;
                            outputStream3 = outputStream5;
                            httpURLConnection = httpURLConnection;
                            th = th;
                            if (outputStream3 != null) {
                                outputStream3.close();
                                break;
                            }
                            if (httpURLConnection != null) {
                                httpURLConnection.disconnect();
                            }
                            a02 a02Var4 = f02Var2.f2248p;
                            f02.m1560m(a02Var4);
                            a02Var4.m6J(new gy1(this.f6292m, (ny1) obj2, responseCode, (IOException) null, (byte[]) null, map3));
                            throw th;
                        }
                    }
                    responseCode = httpURLConnection.getResponseCode();
                    try {
                        try {
                            Map<String, List<String>> headerFields = httpURLConnection.getHeaderFields();
                            try {
                                ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                                inputStream = httpURLConnection.getInputStream();
                                try {
                                    byte[] bArr2 = new byte[1024];
                                    while (true) {
                                        int i2 = inputStream.read(bArr2);
                                        if (i2 <= 0) {
                                            byte[] byteArray = byteArrayOutputStream.toByteArray();
                                            inputStream.close();
                                            httpURLConnection.disconnect();
                                            a02Var = f02Var2.f2248p;
                                            f02.m1560m(a02Var);
                                            gy1Var = new gy1(this.f6292m, (ny1) obj2, responseCode, (IOException) null, byteArray, headerFields);
                                            a02Var.m6J(gy1Var);
                                            return;
                                        }
                                        byteArrayOutputStream.write(bArr2, 0, i2);
                                    }
                                } catch (Throwable th5) {
                                    th = th5;
                                    if (inputStream != null) {
                                        inputStream.close();
                                    }
                                    throw th;
                                }
                            } catch (Throwable th6) {
                                th = th6;
                                inputStream = null;
                            }
                        } catch (IOException e5) {
                            iOException = e5;
                            if (outputStream4 != null) {
                                outputStream4.close();
                            }
                            if (httpURLConnection != null) {
                                httpURLConnection.disconnect();
                            }
                            a02Var = f02Var2.f2248p;
                            f02.m1560m(a02Var);
                            gy1Var = new gy1(this.f6292m, (ny1) obj2, responseCode, iOException, (byte[]) null, map);
                            break;
                        } catch (Throwable th7) {
                            th = th7;
                            httpURLConnection = httpURLConnection;
                            th = th;
                            if (outputStream3 != null) {
                                outputStream3.close();
                                break;
                            }
                            if (httpURLConnection != null) {
                                httpURLConnection.disconnect();
                            }
                            a02 a02Var5 = f02Var2.f2248p;
                            f02.m1560m(a02Var5);
                            a02Var5.m6J(new gy1(this.f6292m, (ny1) obj2, responseCode, (IOException) null, (byte[]) null, map3));
                            throw th;
                        }
                    } catch (IOException e6) {
                        iOException = e6;
                        map = null;
                        if (outputStream4 != null) {
                            outputStream4.close();
                        }
                        if (httpURLConnection != null) {
                            httpURLConnection.disconnect();
                        }
                        a02Var = f02Var2.f2248p;
                        f02.m1560m(a02Var);
                        gy1Var = new gy1(this.f6292m, (ny1) obj2, responseCode, iOException, (byte[]) null, map);
                        break;
                    } catch (Throwable th8) {
                        th = th8;
                        th = th;
                        if (outputStream3 != null) {
                            outputStream3.close();
                            break;
                        }
                        if (httpURLConnection != null) {
                            httpURLConnection.disconnect();
                        }
                        a02 a02Var6 = f02Var2.f2248p;
                        f02.m1560m(a02Var6);
                        a02Var6.m6J(new gy1(this.f6292m, (ny1) obj2, responseCode, (IOException) null, (byte[]) null, map3));
                        throw th;
                    }
                } catch (IOException e7) {
                    iOException = e7;
                    responseCode = 0;
                    httpURLConnection = null;
                    map = null;
                } catch (Throwable th9) {
                    th = th9;
                    responseCode = 0;
                    httpURLConnection = null;
                    map3 = null;
                }
                break;
            default:
                a32 a32Var = (a32) sq1Var;
                f02 f02Var3 = (f02) a32Var.f7192j;
                f02 f02Var4 = (f02) a32Var.f7192j;
                a02 a02Var7 = f02Var3.f2248p;
                f02.m1560m(a02Var7);
                a02Var7.m1E();
                try {
                    URLConnection uRLConnectionOpenConnection2 = url.openConnection();
                    if (!(uRLConnectionOpenConnection2 instanceof HttpURLConnection)) {
                        throw new IOException("Failed to obtain HTTP connection");
                    }
                    httpURLConnection2 = (HttpURLConnection) uRLConnectionOpenConnection2;
                    httpURLConnection2.setDefaultUseCaches(false);
                    f02Var4.getClass();
                    httpURLConnection2.setConnectTimeout(60000);
                    httpURLConnection2.setReadTimeout(61000);
                    httpURLConnection2.setInstanceFollowRedirects(false);
                    httpURLConnection2.setDoInput(true);
                    if (map2 != null) {
                        try {
                            try {
                                for (Map.Entry entry2 : map2.entrySet()) {
                                    httpURLConnection2.addRequestProperty((String) entry2.getKey(), (String) entry2.getValue());
                                }
                            } catch (Throwable th10) {
                                th = th10;
                                outputStream = null;
                                obj = null;
                                th2 = th;
                                r7 = obj;
                                if (outputStream != null) {
                                    try {
                                        outputStream.close();
                                    } catch (IOException e8) {
                                        ky1 ky1Var4 = f02Var4.f2247o;
                                        f02.m1560m(ky1Var4);
                                        ky1Var4.f4600o.m5314c(ky1.m3106I(str4), e8, "Error closing HTTP compressed POST connection output stream. appId");
                                    }
                                    break;
                                }
                                if (httpURLConnection2 != null) {
                                    httpURLConnection2.disconnect();
                                }
                                m4007a(responseCode2, null, null, r7);
                                throw th2;
                            }
                        } catch (IOException e9) {
                            e = e9;
                            str = null;
                            iOException2 = e;
                            outputStream2 = null;
                            r6 = str;
                            if (outputStream2 != null) {
                                try {
                                    outputStream2.close();
                                } catch (IOException e10) {
                                    ky1 ky1Var5 = f02Var4.f2247o;
                                    f02.m1560m(ky1Var5);
                                    ky1Var5.f4600o.m5314c(ky1.m3106I(str4), e10, "Error closing HTTP compressed POST connection output stream. appId");
                                }
                                break;
                            }
                            if (httpURLConnection2 != null) {
                                httpURLConnection2.disconnect();
                            }
                            m4007a(responseCode2, iOException2, null, r6);
                            return;
                        }
                    }
                    if (bArr != null) {
                        try {
                            ByteArrayOutputStream byteArrayOutputStream2 = new ByteArrayOutputStream();
                            GZIPOutputStream gZIPOutputStream = new GZIPOutputStream(byteArrayOutputStream2);
                            gZIPOutputStream.write(bArr);
                            gZIPOutputStream.close();
                            byteArrayOutputStream2.close();
                            byte[] byteArray2 = byteArrayOutputStream2.toByteArray();
                            ky1 ky1Var6 = f02Var4.f2247o;
                            f02.m1560m(ky1Var6);
                            wc1 wc1Var2 = ky1Var6.f4608w;
                            int length2 = byteArray2.length;
                            wc1Var2.m5313b(Integer.valueOf(length2), "Uploading data. size");
                            httpURLConnection2.setDoOutput(true);
                            httpURLConnection2.addRequestProperty("Content-Encoding", "gzip");
                            httpURLConnection2.setFixedLengthStreamingMode(length2);
                            httpURLConnection2.connect();
                            outputStream = httpURLConnection2.getOutputStream();
                            try {
                                outputStream.write(byteArray2);
                                outputStream.close();
                            } catch (IOException e11) {
                                iOException2 = e11;
                                outputStream2 = outputStream;
                                httpURLConnection2 = httpURLConnection2;
                                r6 = 0;
                                if (outputStream2 != null) {
                                    outputStream2.close();
                                    break;
                                }
                                if (httpURLConnection2 != null) {
                                    httpURLConnection2.disconnect();
                                }
                                m4007a(responseCode2, iOException2, null, r6);
                                return;
                            } catch (Throwable th11) {
                                th = th11;
                                httpURLConnection2 = httpURLConnection2;
                                obj = null;
                                th2 = th;
                                r7 = obj;
                                if (outputStream != null) {
                                    outputStream.close();
                                    break;
                                }
                                if (httpURLConnection2 != null) {
                                    httpURLConnection2.disconnect();
                                }
                                m4007a(responseCode2, null, null, r7);
                                throw th2;
                            }
                        } catch (IOException e12) {
                            ky1 ky1Var7 = f02Var4.f2247o;
                            f02.m1560m(ky1Var7);
                            ky1Var7.f4600o.m5313b(e12, "Failed to gzip post request content");
                            throw e12;
                        }
                    }
                    responseCode2 = httpURLConnection2.getResponseCode();
                    try {
                        try {
                            Map<String, List<String>> headerFields2 = httpURLConnection2.getHeaderFields();
                            try {
                                ByteArrayOutputStream byteArrayOutputStream3 = new ByteArrayOutputStream();
                                inputStream2 = httpURLConnection2.getInputStream();
                                try {
                                    byte[] bArr3 = new byte[1024];
                                    while (true) {
                                        int i3 = inputStream2.read(bArr3);
                                        if (i3 <= 0) {
                                            byte[] byteArray3 = byteArrayOutputStream3.toByteArray();
                                            inputStream2.close();
                                            httpURLConnection2.disconnect();
                                            m4007a(responseCode2, null, byteArray3, headerFields2);
                                            return;
                                        }
                                        byteArrayOutputStream3.write(bArr3, 0, i3);
                                    }
                                } catch (Throwable th12) {
                                    th = th12;
                                    if (inputStream2 != null) {
                                        inputStream2.close();
                                    }
                                    throw th;
                                }
                            } catch (Throwable th13) {
                                th = th13;
                                inputStream2 = null;
                            }
                        } catch (IOException e13) {
                            e = e13;
                            str2 = null;
                            str = str2;
                            iOException2 = e;
                            outputStream2 = null;
                            r6 = str;
                            if (outputStream2 != null) {
                                outputStream2.close();
                                break;
                            }
                            if (httpURLConnection2 != null) {
                                httpURLConnection2.disconnect();
                            }
                            m4007a(responseCode2, iOException2, null, r6);
                            return;
                        } catch (Throwable th14) {
                            th = th14;
                            responseCode2 = responseCode2;
                            outputStream = null;
                            obj = null;
                            th2 = th;
                            r7 = obj;
                            if (outputStream != null) {
                                outputStream.close();
                                break;
                            }
                            if (httpURLConnection2 != null) {
                                httpURLConnection2.disconnect();
                            }
                            m4007a(responseCode2, null, null, r7);
                            throw th2;
                        }
                    } catch (IOException e14) {
                        e = e14;
                        str2 = str3;
                        str = str2;
                        iOException2 = e;
                        outputStream2 = null;
                        r6 = str;
                        if (outputStream2 != null) {
                            outputStream2.close();
                            break;
                        }
                        if (httpURLConnection2 != null) {
                            httpURLConnection2.disconnect();
                        }
                        m4007a(responseCode2, iOException2, null, r6);
                        return;
                    } catch (Throwable th15) {
                        th = th15;
                        responseCode2 = responseCode2;
                        obj = "Content-Encoding";
                        outputStream = null;
                        httpURLConnection2 = httpURLConnection2;
                        th2 = th;
                        r7 = obj;
                        if (outputStream != null) {
                            outputStream.close();
                            break;
                        }
                        if (httpURLConnection2 != null) {
                            httpURLConnection2.disconnect();
                        }
                        m4007a(responseCode2, null, null, r7);
                        throw th2;
                    }
                } catch (IOException e15) {
                    iOException2 = e15;
                    outputStream2 = null;
                    httpURLConnection2 = null;
                } catch (Throwable th16) {
                    th2 = th16;
                    outputStream = null;
                    httpURLConnection2 = null;
                    r7 = 0;
                }
                break;
        }
    }

    public py1(a32 a32Var, String str, URL url, byte[] bArr, HashMap map, y22 y22Var) {
        Objects.requireNonNull(a32Var);
        this.f6295p = a32Var;
        p80.m3860e(str);
        this.f6290k = url;
        this.f6291l = bArr;
        this.f6294o = y22Var;
        this.f6292m = str;
        this.f6293n = map;
    }
}
