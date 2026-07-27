package com.bytedance.sdk.component.sf.pcc.pcc.pcc;

import com.bytedance.sdk.component.sf.pcc.jr;
import java.io.BufferedReader;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;

/* loaded from: classes4.dex */
public class vy extends jr {
    InputStream gm;
    HttpURLConnection pcc;
    InputStream sf;

    vy(HttpURLConnection httpURLConnection) throws IOException {
        this.pcc = httpURLConnection;
        InputStream inputStream = httpURLConnection.getInputStream();
        this.gm = inputStream;
        this.sf = new qf(inputStream, httpURLConnection);
    }

    vy(HttpURLConnection httpURLConnection, InputStream inputStream) {
        this.pcc = httpURLConnection;
        this.gm = inputStream;
        this.sf = new qf(inputStream, httpURLConnection);
    }

    @Override // com.bytedance.sdk.component.sf.pcc.jr
    public long pcc() {
        try {
            return this.pcc.getContentLength();
        } catch (Exception unused) {
            return 0L;
        }
    }

    @Override // com.bytedance.sdk.component.sf.pcc.jr
    public String sf() {
        try {
            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(this.sf));
            StringBuffer stringBuffer = new StringBuffer();
            while (true) {
                String readLine = bufferedReader.readLine();
                if (readLine != null) {
                    stringBuffer.append(readLine + "\n");
                } else {
                    String stringBuffer2 = stringBuffer.toString();
                    close();
                    return stringBuffer2;
                }
            }
        } catch (Exception unused) {
            return "";
        }
    }

    @Override // com.bytedance.sdk.component.sf.pcc.jr, java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        try {
            this.sf.close();
            this.pcc.disconnect();
        } catch (Exception unused) {
        }
    }

    @Override // com.bytedance.sdk.component.sf.pcc.jr
    public InputStream gm() {
        return this.sf;
    }

    @Override // com.bytedance.sdk.component.sf.pcc.jr
    public byte[] oo() {
        try {
            if (this.gm == null) {
                return new byte[0];
            }
            byte[] bArr = new byte[1024];
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            while (true) {
                int read = this.sf.read(bArr);
                if (read != -1) {
                    byteArrayOutputStream.write(bArr, 0, read);
                } else {
                    return byteArrayOutputStream.toByteArray();
                }
            }
        } catch (Exception unused) {
            return new byte[0];
        }
    }

    @Override // com.bytedance.sdk.component.sf.pcc.jr
    public com.bytedance.sdk.component.sf.pcc.vy vj() {
        if (this.pcc.getContentType() != null) {
            return com.bytedance.sdk.component.sf.pcc.vy.pcc(this.pcc.getContentType());
        }
        return null;
    }

    @Override // com.bytedance.sdk.component.sf.pcc.jr
    public String wh() {
        return this.pcc.getContentEncoding();
    }
}
