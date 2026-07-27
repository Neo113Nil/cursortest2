package com.bykv.vk.openvk.pcc.pcc.sf.oo;

import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;

/* loaded from: classes5.dex */
public class sf {
    public static long pcc(String str, String str2) {
        File gm = gm(str, str2);
        if (gm.exists()) {
            return gm.length();
        }
        File sf = sf(str, str2);
        if (sf.exists()) {
            return sf.length();
        }
        return 0L;
    }

    public static File sf(String str, String str2) {
        File file = new File(str);
        if (file.isFile()) {
            file.delete();
        }
        if (!file.exists()) {
            file.mkdirs();
        }
        return new File(file, str2 + ".temp");
    }

    public static File gm(String str, String str2) {
        File file = new File(str);
        if (file.isFile()) {
            file.delete();
        }
        if (!file.exists()) {
            file.mkdirs();
        }
        return new File(file, str2);
    }

    public static void pcc(RandomAccessFile randomAccessFile, byte[] bArr, int i, int i2, String str) throws IOException {
        try {
            randomAccessFile.seek(i);
            randomAccessFile.write(bArr, 0, i2);
        } catch (Throwable unused) {
        }
    }
}
