package com.ironsource.adqualitysdk.sdk.i;

import android.content.Context;
import android.os.SystemClock;
import android.text.TextUtils;
import com.ironsource.adqualitysdk.sdk.StringFog;
import com.vungle.ads.internal.protos.Sdk;
import io.ktor.sse.ServerSentEventKt;
import io.ktor.util.date.GMTDateParser;
import java.io.BufferedReader;
import java.io.ByteArrayOutputStream;
import java.io.Closeable;
import java.io.DataOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.Iterator;
import java.util.Map;
import java.util.UUID;
import java.util.zip.GZIPOutputStream;
import javax.crypto.Mac;
import javax.crypto.spec.SecretKeySpec;
import org.json.JSONObject;

/* renamed from: com.ironsource.adqualitysdk.sdk.i.ء, reason: contains not printable characters */
/* loaded from: classes6.dex */
public abstract class AbstractC0592 {

    /* renamed from: ﾒ, reason: contains not printable characters */
    public static final String f1546 = StringFog.decrypt("RXNsn0QtSLA=\n", "CxYYyjBEJMM=\n");

    /* renamed from: ﾇ, reason: contains not printable characters */
    public static C1138 m5538(String str) {
        try {
            HttpURLConnection httpURLConnection = (HttpURLConnection) new URL(str).openConnection();
            httpURLConnection.setRequestMethod(StringFog.decrypt("vi8P\n", "+WpbfMffj+o=\n"));
            String str2 = AbstractC0494.f1141;
            long elapsedRealtime = SystemClock.elapsedRealtime();
            String m5541 = m5541(httpURLConnection, (String) null);
            int responseCode = httpURLConnection.getResponseCode();
            String responseMessage = httpURLConnection.getResponseMessage();
            if (responseCode >= 400) {
                httpURLConnection.disconnect();
            }
            return new C1138(m5541, responseCode, responseMessage, SystemClock.elapsedRealtime() - elapsedRealtime);
        } catch (Throwable th) {
            String str3 = f1546;
            AbstractC0544.m5511(str3, str3, StringFog.decrypt("stZbkxj3vcSZwECSDfepxIOEW5kboqvSg54J\n", "96Qp/GrXzqE=\n") + th.getLocalizedMessage(), th, null, false);
            return null;
        }
    }

    /* renamed from: ﾒ, reason: contains not printable characters */
    public static String m5541(HttpURLConnection httpURLConnection, String str) {
        Throwable th;
        InputStream inputStream;
        BufferedReader bufferedReader;
        String str2 = null;
        if (str != null) {
            C0460 c0460 = C0874.f2494.f2497;
            if (c0460 == null) {
                AbstractC0544.m5504(f1546, StringFog.decrypt("GSTSsBPLC/MpReOPUt4F6CAE9I1Wk0TiLQv4jkeIAOQvF++RR4gW5D8V+Y9AzUTnIxe2k1bZEeQ/\nEd+FDg==\n", "TGWW4TOoZIE=\n") + str);
                return null;
            }
            try {
                if (httpURLConnection.getResponseCode() == 200) {
                    String m5542 = m5542(httpURLConnection, str, c0460);
                    if (m5542 != null) {
                        return m5542;
                    }
                    AbstractC0544.m5504(f1546, StringFog.decrypt("inZ1J61+meCvWF8F6CyY9rxFSAb5ZZP9/1FQH+FpmKj/RVQF/WOS4LoXUxnpddz6rBdfA+Fg3Lus\nQ0MT7GHc8rNFVBfpddzwsFlCA+BpmLo=\n", "3zcxdo0M/JM=\n"));
                    return null;
                }
            } catch (IOException e) {
                String str3 = f1546;
                AbstractC0544.m5505(str3, str3, StringFog.decrypt("PvC2RstH9y5M9qpSwQnnIwn2rhbCSO0nCfHpFtFa7SULtbVaxUDqax7wpFKeCQ==\n", "bJXFNqQphEs=\n") + e.getMessage(), false);
            }
        }
        try {
            inputStream = httpURLConnection.getInputStream();
        } catch (Throwable th2) {
            th = th2;
            inputStream = null;
        }
        try {
            bufferedReader = new BufferedReader(new InputStreamReader(inputStream));
            try {
                StringBuffer stringBuffer = new StringBuffer();
                while (true) {
                    String readLine = bufferedReader.readLine();
                    if (readLine == null) {
                        break;
                    }
                    if (stringBuffer.length() > 0) {
                        stringBuffer.append('\r');
                    }
                    stringBuffer.append(readLine);
                }
                str2 = stringBuffer.toString();
            } catch (Throwable th3) {
                th = th3;
                Throwable th4 = th;
                try {
                    String str4 = f1546;
                    AbstractC0544.m5511(str4, str4, StringFog.decrypt("toTmpsg1HiqHgv2n3TULKoCG+6fJcA==\n", "8/aUyboVeU8=\n"), th4, null, false);
                    return str2;
                } finally {
                    m5545(inputStream);
                    m5545(bufferedReader);
                }
            }
        } catch (Throwable th5) {
            th = th5;
            bufferedReader = null;
            Throwable th42 = th;
            String str42 = f1546;
            AbstractC0544.m5511(str42, str42, StringFog.decrypt("toTmpsg1HiqHgv2n3TULKoCG+6fJcA==\n", "8/aUyboVeU8=\n"), th42, null, false);
            return str2;
        }
        return str2;
    }

    /* JADX WARN: Removed duplicated region for block: B:38:0x011b  */
    /* renamed from: ﾒ, reason: contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static C0512 m5539(HttpURLConnection httpURLConnection, JSONObject jSONObject, String str, C0439 c0439, Context context) {
        String str2;
        String str3;
        C0460 c0460;
        Iterator it;
        String path;
        if (c0439 == null || context == null || TextUtils.isEmpty(c0439.f604) || (str2 = c0439.f604) == null || str2.trim().isEmpty()) {
            return null;
        }
        if (str != null && !str.isEmpty()) {
            try {
                path = new URL(str).getPath();
            } catch (MalformedURLException unused) {
            }
            if (path != null && !path.isEmpty()) {
                String replaceFirst = path.replaceFirst(StringFog.decrypt("sXg=\n", "71f+I37ivuw=\n"), "");
                int lastIndexOf = replaceFirst.lastIndexOf(47);
                if (lastIndexOf >= 0) {
                    replaceFirst = replaceFirst.substring(lastIndexOf + 1);
                }
                if (!replaceFirst.isEmpty()) {
                    str3 = replaceFirst;
                    if (str3 != null || (c0460 = C0874.f2494.f2497) == null) {
                        return null;
                    }
                    String uuid = UUID.randomUUID().toString();
                    byte[] bytes = m5543(jSONObject).getBytes(StringFog.decrypt("RLH7CBU=\n", "EeW9JS3hu3U=\n"));
                    C1236 c1236 = c0460.f851;
                    C0510 c0510 = c0460.f855;
                    c0510.getClass();
                    try {
                        byte[] m5537 = c0510.f1163.m5537();
                        C0610 m5592 = c0510.f1164.m5592();
                        byte[] bArr = new byte[12];
                        c0510.f1164.f1731.nextBytes(bArr);
                        long currentTimeMillis = System.currentTimeMillis();
                        byte[] m5658 = AbstractC0769.m5658(bytes);
                        byte[] m5593 = c0510.f1164.m5593(m5592.f1584, m5537);
                        byte[] bArr2 = C0630.f1725;
                        byte[] bArr3 = new byte[bArr2.length + 3];
                        System.arraycopy(bArr2, 0, bArr3, 0, bArr2.length);
                        bArr3[bArr2.length] = (byte) 0;
                        bArr3[bArr2.length + 1] = (byte) 1;
                        bArr3[bArr2.length + 2] = (byte) 2;
                        byte[] m5594 = c0510.f1164.m5594(m5593, bArr, bArr3);
                        byte[] m5485 = c0510.m5485(str3, uuid, currentTimeMillis, c1236);
                        byte[] m5484 = C0510.m5484(currentTimeMillis, bArr, m5592.f1583, m5485, c0510.f1164.m5591(m5594, bArr, m5658, m5485).f1598);
                        c0460.f858.getClass();
                        C1199 c1199 = new C1199(uuid, m5593, System.currentTimeMillis());
                        C0864 c0864 = c0460.f854;
                        c0864.getClass();
                        long currentTimeMillis2 = System.currentTimeMillis();
                        it = c0864.f2482.entrySet().iterator();
                        while (it.hasNext()) {
                            if (currentTimeMillis2 - ((C1199) ((Map.Entry) it.next()).getValue()).f3396 > c0864.f2483) {
                                it.remove();
                            }
                        }
                        c0864.f2482.put(c1199.f3398, c1199);
                        httpURLConnection.setRequestProperty(StringFog.decrypt("s0ndt/aq0+ukX8Om\n", "8Cazw5PEp8Y=\n"), StringFog.decrypt("4/Z8EZ8HIkrr6WJSmQc3W/arfwmEASJT\n", "goYMffZkQz4=\n"));
                        httpURLConnection.setRequestProperty(StringFog.decrypt("J+pv+tvl\n", "ZokMn6uRNGE=\n"), StringFog.decrypt("hx8tupPF7XmPADP5lcX4aJJCLqKIw+1g\n", "5m9d1vqmjA0=\n"));
                        httpURLConnection.setRequestProperty(StringFog.decrypt("xQnxmQ==\n", "vSSe6ioFx5U=\n"), StringFog.decrypt("BQ==\n", "ZGV+A5zR1zw=\n"));
                        httpURLConnection.setDoOutput(true);
                        return new C0512(m5484, uuid);
                    } catch (Exception e) {
                        throw new RuntimeException(StringFog.decrypt("SamZmjTaYMlg6JKDONIknWqmhpM90TDY\n", "D8jw9lG+QL0=\n"), e);
                    }
                }
            }
        }
        str3 = null;
        if (str3 != null) {
            return null;
        }
        String uuid2 = UUID.randomUUID().toString();
        byte[] bytes2 = m5543(jSONObject).getBytes(StringFog.decrypt("RLH7CBU=\n", "EeW9JS3hu3U=\n"));
        C1236 c12362 = c0460.f851;
        C0510 c05102 = c0460.f855;
        c05102.getClass();
        byte[] m55372 = c05102.f1163.m5537();
        C0610 m55922 = c05102.f1164.m5592();
        byte[] bArr4 = new byte[12];
        c05102.f1164.f1731.nextBytes(bArr4);
        long currentTimeMillis3 = System.currentTimeMillis();
        byte[] m56582 = AbstractC0769.m5658(bytes2);
        byte[] m55932 = c05102.f1164.m5593(m55922.f1584, m55372);
        byte[] bArr22 = C0630.f1725;
        byte[] bArr32 = new byte[bArr22.length + 3];
        System.arraycopy(bArr22, 0, bArr32, 0, bArr22.length);
        bArr32[bArr22.length] = (byte) 0;
        bArr32[bArr22.length + 1] = (byte) 1;
        bArr32[bArr22.length + 2] = (byte) 2;
        byte[] m55942 = c05102.f1164.m5594(m55932, bArr4, bArr32);
        byte[] m54852 = c05102.m5485(str3, uuid2, currentTimeMillis3, c12362);
        byte[] m54842 = C0510.m5484(currentTimeMillis3, bArr4, m55922.f1583, m54852, c05102.f1164.m5591(m55942, bArr4, m56582, m54852).f1598);
        c0460.f858.getClass();
        C1199 c11992 = new C1199(uuid2, m55932, System.currentTimeMillis());
        C0864 c08642 = c0460.f854;
        c08642.getClass();
        long currentTimeMillis22 = System.currentTimeMillis();
        it = c08642.f2482.entrySet().iterator();
        while (it.hasNext()) {
        }
        c08642.f2482.put(c11992.f3398, c11992);
        httpURLConnection.setRequestProperty(StringFog.decrypt("s0ndt/aq0+ukX8Om\n", "8Cazw5PEp8Y=\n"), StringFog.decrypt("4/Z8EZ8HIkrr6WJSmQc3W/arfwmEASJT\n", "goYMffZkQz4=\n"));
        httpURLConnection.setRequestProperty(StringFog.decrypt("J+pv+tvl\n", "ZokMn6uRNGE=\n"), StringFog.decrypt("hx8tupPF7XmPADP5lcX4aJJCLqKIw+1g\n", "5m9d1vqmjA0=\n"));
        httpURLConnection.setRequestProperty(StringFog.decrypt("xQnxmQ==\n", "vSSe6ioFx5U=\n"), StringFog.decrypt("BQ==\n", "ZGV+A5zR1zw=\n"));
        httpURLConnection.setDoOutput(true);
        return new C0512(m54842, uuid2);
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0069 A[Catch: all -> 0x0083, TryCatch #0 {all -> 0x0083, blocks: (B:3:0x0001, B:26:0x0007, B:28:0x000d, B:7:0x003a, B:8:0x003e, B:11:0x0056, B:13:0x0069, B:14:0x006c, B:21:0x0082, B:24:0x007f, B:31:0x0013, B:10:0x0050, B:20:0x007a), top: B:2:0x0001, inners: #1, #2, #3 }] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x003a A[Catch: all -> 0x0083, TryCatch #0 {all -> 0x0083, blocks: (B:3:0x0001, B:26:0x0007, B:28:0x000d, B:7:0x003a, B:8:0x003e, B:11:0x0056, B:13:0x0069, B:14:0x006c, B:21:0x0082, B:24:0x007f, B:31:0x0013, B:10:0x0050, B:20:0x007a), top: B:2:0x0001, inners: #1, #2, #3 }] */
    /* renamed from: ﾒ, reason: contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static C1138 m5540(JSONObject jSONObject, String str, C0439 c0439, Context context, boolean z) {
        C0512 m5539;
        byte[] bArr;
        String str2;
        int responseCode;
        try {
            HttpURLConnection m5544 = m5544(str);
            try {
                if (z) {
                    try {
                        m5539 = m5539(m5544, jSONObject, str, c0439, context);
                    } catch (Exception e) {
                        String str3 = f1546;
                        AbstractC0544.m5505(str3, str3, StringFog.decrypt("GrwiC5wdmG8wvGEKjgScdjq2YRaXTYpnNr4kHclNmXU2vCZZlQGNbzHoYQ==\n", "X9JBeeVt7AY=\n") + e.getMessage(), false);
                    }
                    if (m5539 != null) {
                        bArr = m5539.f1167;
                        str2 = m5539.f1166;
                        if (bArr == null) {
                            bArr = m5546(m5544, jSONObject);
                        }
                        String str4 = AbstractC0494.f1141;
                        long elapsedRealtime = SystemClock.elapsedRealtime();
                        m5544.connect();
                        DataOutputStream dataOutputStream = new DataOutputStream(m5544.getOutputStream());
                        dataOutputStream.write(bArr);
                        dataOutputStream.flush();
                        dataOutputStream.close();
                        String m5541 = m5541(m5544, str2);
                        responseCode = m5544.getResponseCode();
                        String responseMessage = m5544.getResponseMessage();
                        if (responseCode >= 400) {
                            m5544.disconnect();
                        }
                        return new C1138(m5541, responseCode, responseMessage, SystemClock.elapsedRealtime() - elapsedRealtime);
                    }
                }
                dataOutputStream.write(bArr);
                dataOutputStream.flush();
                dataOutputStream.close();
                String m55412 = m5541(m5544, str2);
                responseCode = m5544.getResponseCode();
                String responseMessage2 = m5544.getResponseMessage();
                if (responseCode >= 400) {
                }
                return new C1138(m55412, responseCode, responseMessage2, SystemClock.elapsedRealtime() - elapsedRealtime);
            } finally {
            }
            str2 = null;
            bArr = null;
            if (bArr == null) {
            }
            String str42 = AbstractC0494.f1141;
            long elapsedRealtime2 = SystemClock.elapsedRealtime();
            m5544.connect();
            DataOutputStream dataOutputStream2 = new DataOutputStream(m5544.getOutputStream());
        } catch (Throwable th) {
            String str5 = f1546;
            AbstractC0544.m5511(str5, str5, StringFog.decrypt("KHb1pz9Tr5gDYO6mKlOskh5wp7ooAqmYHnC96A==\n", "bQSHyE1z3P0=\n") + th.getLocalizedMessage(), th, null, false);
            return null;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:23:0x0059 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* renamed from: ﾒ, reason: contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static byte[] m5546(HttpURLConnection httpURLConnection, JSONObject jSONObject) {
        GZIPOutputStream gZIPOutputStream;
        Exception e;
        Throwable th;
        String m5543 = m5543(jSONObject);
        byte[] bytes = m5543.getBytes(StringFog.decrypt("ZojUjfA=\n", "M9ySoMiy3Ec=\n"));
        if (m5543.length() <= 256) {
            return bytes;
        }
        httpURLConnection.setRequestProperty(StringFog.decrypt("7Zy9MMbpvU7rnbArx+6nBA==\n", "rvPTRKOHyWM=\n"), StringFog.decrypt("/mCVyw==\n", "mRr8u8G8mto=\n"));
        GZIPOutputStream gZIPOutputStream2 = null;
        try {
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            gZIPOutputStream = new GZIPOutputStream(byteArrayOutputStream);
            try {
                gZIPOutputStream.write(bytes);
                gZIPOutputStream.flush();
                gZIPOutputStream.close();
                return byteArrayOutputStream.toByteArray();
            } catch (Exception e2) {
                e = e2;
                try {
                    throw new RuntimeException(e);
                } catch (Throwable th2) {
                    th = th2;
                    gZIPOutputStream2 = gZIPOutputStream;
                    gZIPOutputStream = gZIPOutputStream2;
                    th = th;
                    if (gZIPOutputStream != null) {
                        try {
                            gZIPOutputStream.close();
                        } catch (Exception unused) {
                        }
                    }
                    throw th;
                }
            } catch (Throwable th3) {
                th = th3;
                if (gZIPOutputStream != null) {
                }
                throw th;
            }
        } catch (Exception e3) {
            gZIPOutputStream = null;
            e = e3;
        } catch (Throwable th4) {
            th = th4;
            gZIPOutputStream = gZIPOutputStream2;
            th = th;
            if (gZIPOutputStream != null) {
            }
            throw th;
        }
    }

    /* renamed from: ﾒ, reason: contains not printable characters */
    public static HttpURLConnection m5544(String str) {
        HttpURLConnection httpURLConnection = (HttpURLConnection) new URL(str).openConnection();
        httpURLConnection.setRequestMethod(StringFog.decrypt("QCY9mQ==\n", "EGluzdmxOuM=\n"));
        httpURLConnection.setRequestProperty(StringFog.decrypt("09EUdCAmtpLExwpl\n", "kL56AEVIwr8=\n"), StringFog.decrypt("U3qts8VkYnZbZbPwxnRsbAkqvrfNdXBnRjeoq8oqOw==\n", "Mgrd36wHAwI=\n"));
        httpURLConnection.setUseCaches(false);
        httpURLConnection.setDoInput(true);
        httpURLConnection.setDoOutput(true);
        httpURLConnection.setConnectTimeout(60000);
        httpURLConnection.setReadTimeout(60000);
        return httpURLConnection;
    }

    /* renamed from: ﾒ, reason: contains not printable characters */
    public static String m5542(HttpURLConnection httpURLConnection, String str, C0460 c0460) {
        InputStream inputStream;
        Throwable th;
        ByteArrayOutputStream byteArrayOutputStream;
        try {
            inputStream = httpURLConnection.getInputStream();
            try {
                int contentLength = httpURLConnection.getContentLength();
                if (contentLength <= 0) {
                    contentLength = 65536;
                }
                ByteArrayOutputStream byteArrayOutputStream2 = new ByteArrayOutputStream(contentLength);
                try {
                    byte[] bArr = new byte[65536];
                    while (true) {
                        int read = inputStream.read(bArr);
                        if (read == -1) {
                            break;
                        }
                        byteArrayOutputStream2.write(bArr, 0, read);
                    }
                    byte[] m5452 = c0460.m5452(byteArrayOutputStream2.toByteArray(), str);
                    if (m5452 == null) {
                        AbstractC0544.m5504(f1546, StringFog.decrypt("p2w/zpfrpOWAVAvr5eqy9p1DCPqX/aTyh18V+tOvr/OeQQ==\n", "8i17n7ePwYY=\n"));
                        m5545(inputStream);
                        m5545(byteArrayOutputStream2);
                        return null;
                    }
                    String str2 = new String(m5452, StringFog.decrypt("8TVel34=\n", "pGEYukbBdEY=\n"));
                    m5545(inputStream);
                    m5545(byteArrayOutputStream2);
                    return str2;
                } catch (Throwable th2) {
                    th = th2;
                    byteArrayOutputStream = byteArrayOutputStream2;
                    try {
                        String str3 = f1546;
                        AbstractC0544.m5504(str3, StringFog.decrypt("eL6ng+Rv9n5dkI2hoT33aE6NmqKwdPxjDZmCu6h49zcN\n", "Lf/j0sQdkw0=\n") + th.getMessage());
                        AbstractC0544.m5511(str3, str3, StringFog.decrypt("0nrITB3ttcXjfNNNCOK2xfR6w1MbpLzHt3rfUB+ivNPy\n", "lwi6I2/N0qA=\n"), th, null, false);
                        return null;
                    } finally {
                        m5545(inputStream);
                        m5545(byteArrayOutputStream);
                    }
                }
            } catch (Throwable th3) {
                th = th3;
                th = th;
                byteArrayOutputStream = null;
                String str32 = f1546;
                AbstractC0544.m5504(str32, StringFog.decrypt("eL6ng+Rv9n5dkI2hoT33aE6NmqKwdPxjDZmCu6h49zcN\n", "Lf/j0sQdkw0=\n") + th.getMessage());
                AbstractC0544.m5511(str32, str32, StringFog.decrypt("0nrITB3ttcXjfNNNCOK2xfR6w1MbpLzHt3rfUB+ivNPy\n", "lwi6I2/N0qA=\n"), th, null, false);
                return null;
            }
        } catch (Throwable th4) {
            th = th4;
            inputStream = null;
        }
    }

    /* renamed from: ﾒ, reason: contains not printable characters */
    public static void m5545(Closeable closeable) {
        if (closeable != null) {
            try {
                closeable.close();
            } catch (Throwable unused) {
            }
        }
    }

    /* renamed from: ﾒ, reason: contains not printable characters */
    public static String m5543(JSONObject jSONObject) {
        String str;
        String jSONObject2 = jSONObject.toString();
        String str2 = AbstractC0701.f1898;
        try {
            Mac mac = Mac.getInstance(new String(new char[]{'H', GMTDateParser.MINUTES, 'a', 'c', 'S', 'H', 'A', '1'}));
            mac.init(new SecretKeySpec(AbstractC0701.f1897.getBytes(StringFog.decrypt("KuB+2R0=\n", "f7Q49CXofqY=\n")), mac.getAlgorithm()));
            str = AbstractC0852.m5682(mac.doFinal(jSONObject2.replaceAll(ServerSentEventKt.SPACE, "").replaceAll("\n", "").getBytes(StringFog.decrypt("bEBvO9g=\n", "ORQpFuBXRy0=\n"))));
        } catch (Exception e) {
            AbstractC0544.m5502(AbstractC0701.f1898, StringFog.decrypt("SyZu+J6eRA==\n", "DlQcl+ykZDY=\n") + e.getLocalizedMessage());
            str = null;
        }
        return AbstractC1257.m5940("rMw=\n", "jrE6CAa7S00=\n", AbstractC1196.m5920("s8dhUD2tew==\n", "n+UJIx+XWd4=\n", new StringBuilder().append(jSONObject2.substring(0, jSONObject2.lastIndexOf(Sdk.SDKError.Reason.INVALID_METRICS_ENDPOINT_VALUE))), str));
    }
}
