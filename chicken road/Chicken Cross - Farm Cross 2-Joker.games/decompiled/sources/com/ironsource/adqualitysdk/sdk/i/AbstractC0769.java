package com.ironsource.adqualitysdk.sdk.i;

import java.io.ByteArrayOutputStream;
import java.util.zip.GZIPOutputStream;

/* renamed from: com.ironsource.adqualitysdk.sdk.i.ᒉ, reason: contains not printable characters */
/* loaded from: classes6.dex */
public abstract class AbstractC0769 {
    /* renamed from: ﾒ, reason: contains not printable characters */
    public static byte[] m5658(byte[] bArr) {
        if (bArr.length == 0) {
            return bArr;
        }
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream(bArr.length);
        GZIPOutputStream gZIPOutputStream = new GZIPOutputStream(byteArrayOutputStream);
        try {
            gZIPOutputStream.write(bArr);
            gZIPOutputStream.finish();
            gZIPOutputStream.close();
            return byteArrayOutputStream.toByteArray();
        } catch (Throwable th) {
            try {
                gZIPOutputStream.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }
}
