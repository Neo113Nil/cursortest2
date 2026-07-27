package io.appmetrica.analytics.network.impl;

import java.io.ByteArrayOutputStream;
import java.io.InputStream;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import t4.InterfaceC1430a;
import u1.AbstractC1477a;

/* loaded from: classes.dex */
public abstract class e {
    public static byte[] a(int i2, InterfaceC1430a interfaceC1430a) {
        try {
            InputStream inputStream = (InputStream) interfaceC1430a.invoke();
            if (inputStream != null) {
                try {
                    ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                    try {
                        byte[] bArr = new byte[8192];
                        int i3 = 0;
                        while (true) {
                            int read = inputStream.read(bArr);
                            if (-1 == read || i3 > i2) {
                                break;
                            }
                            if (read > 0) {
                                byteArrayOutputStream.write(bArr, 0, read);
                                i3 += read;
                            }
                        }
                        byte[] byteArray = byteArrayOutputStream.toByteArray();
                        AbstractC1477a.e(byteArrayOutputStream, null);
                        AbstractC1477a.e(inputStream, null);
                        return byteArray;
                    } catch (Throwable unused) {
                        AbstractC1477a.e(byteArrayOutputStream, null);
                        AbstractC1477a.e(inputStream, null);
                    }
                } finally {
                }
            }
        } catch (Throwable unused2) {
        }
        return new byte[0];
    }

    public static final Map a(Map map) {
        return Collections.unmodifiableMap(new HashMap(map));
    }
}
