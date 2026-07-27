package com.bytedance.sdk.component.vj.pcc;

import android.util.Log;
import com.bytedance.sdk.component.utils.ork;
import com.bytedance.sdk.component.vj.vj;
import java.io.ByteArrayOutputStream;
import java.io.Closeable;
import java.io.IOException;
import java.io.InputStream;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* loaded from: classes4.dex */
public class pcc implements com.bytedance.sdk.component.vj.oo<gm> {
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r6v5 */
    /* JADX WARN: Type inference failed for: r6v7 */
    @Override // com.bytedance.sdk.component.vj.oo
    /* renamed from: sf, reason: merged with bridge method [inline-methods] */
    public gm<byte[]> pcc(vj vjVar) {
        Closeable closeable;
        InputStream inputStream;
        byte[] bArr;
        ByteArrayOutputStream byteArrayOutputStream;
        String message;
        Closeable closeable2;
        HttpURLConnection httpURLConnection;
        InputStream inputStream2 = null;
        Map<String, String> map = null;
        int i = 0;
        try {
            try {
                httpURLConnection = (HttpURLConnection) new URL(vjVar.pcc()).openConnection();
                httpURLConnection.setRequestMethod("GET");
                httpURLConnection.setConnectTimeout(5000);
                httpURLConnection.setReadTimeout(5000);
                httpURLConnection.connect();
                inputStream = httpURLConnection.getInputStream();
            } catch (Throwable th) {
                th = th;
            }
            try {
                byte[] bArr2 = new byte[1024];
                byteArrayOutputStream = new ByteArrayOutputStream();
                while (true) {
                    try {
                        int read = inputStream.read(bArr2);
                        if (read == -1) {
                            break;
                        }
                        byteArrayOutputStream.write(bArr2, 0, read);
                    } catch (MalformedURLException e) {
                        e = e;
                        bArr = null;
                    } catch (IOException e2) {
                        e = e2;
                        bArr = null;
                    }
                }
                i = 200;
                bArr = byteArrayOutputStream.toByteArray();
                try {
                    map = vjVar.sf() ? pcc(httpURLConnection) : null;
                    ork.pcc(inputStream);
                    ork.pcc(byteArrayOutputStream);
                    message = "success";
                } catch (MalformedURLException e3) {
                    e = e3;
                    Log.w("InternalHttpClient", "MalformedURLException:" + e.getMessage());
                    message = e.getMessage();
                    closeable2 = byteArrayOutputStream;
                    ork.pcc(inputStream);
                    ork.pcc(closeable2);
                    return new gm<>(i, bArr, message, map);
                } catch (IOException e4) {
                    e = e4;
                    Log.w("InternalHttpClient", "IOException:" + e.getMessage());
                    message = e.getMessage();
                    closeable2 = byteArrayOutputStream;
                    ork.pcc(inputStream);
                    ork.pcc(closeable2);
                    return new gm<>(i, bArr, message, map);
                }
            } catch (MalformedURLException e5) {
                e = e5;
                bArr = null;
                byteArrayOutputStream = bArr;
                Log.w("InternalHttpClient", "MalformedURLException:" + e.getMessage());
                message = e.getMessage();
                closeable2 = byteArrayOutputStream;
                ork.pcc(inputStream);
                ork.pcc(closeable2);
                return new gm<>(i, bArr, message, map);
            } catch (IOException e6) {
                e = e6;
                bArr = null;
                byteArrayOutputStream = bArr;
                Log.w("InternalHttpClient", "IOException:" + e.getMessage());
                message = e.getMessage();
                closeable2 = byteArrayOutputStream;
                ork.pcc(inputStream);
                ork.pcc(closeable2);
                return new gm<>(i, bArr, message, map);
            } catch (Throwable th2) {
                th = th2;
                closeable = null;
                inputStream2 = inputStream;
                ork.pcc(inputStream2);
                ork.pcc(closeable);
                throw th;
            }
        } catch (MalformedURLException e7) {
            e = e7;
            inputStream = null;
            bArr = null;
        } catch (IOException e8) {
            e = e8;
            inputStream = null;
            bArr = null;
        } catch (Throwable th3) {
            th = th3;
            closeable = null;
            ork.pcc(inputStream2);
            ork.pcc(closeable);
            throw th;
        }
        return new gm<>(i, bArr, message, map);
    }

    private Map<String, String> pcc(HttpURLConnection httpURLConnection) {
        HashMap hashMap = new HashMap();
        Map<String, List<String>> headerFields = httpURLConnection.getHeaderFields();
        for (String str : headerFields.keySet()) {
            List<String> list = headerFields.get(str);
            if (list != null && list.size() > 0) {
                hashMap.put(str, list.get(0));
            }
        }
        return hashMap;
    }
}
