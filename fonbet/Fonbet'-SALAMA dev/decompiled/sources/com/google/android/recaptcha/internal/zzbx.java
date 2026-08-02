package com.google.android.recaptcha.internal;

import A5.w;
import g6.AbstractC1158g;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Arrays;
import p3.f;
import p6.AbstractC1539a;
import t6.h;

/* loaded from: classes.dex */
public final class zzbx {
    public static final byte[] zza(File file) {
        h.e(file, "<this>");
        FileInputStream fileInputStream = new FileInputStream(file);
        try {
            long length = file.length();
            if (length > 2147483647L) {
                throw new OutOfMemoryError("File " + file + " is too big (" + length + " bytes) to fit in memory.");
            }
            int i7 = (int) length;
            byte[] bArr = new byte[i7];
            int i8 = i7;
            int i9 = 0;
            while (i8 > 0) {
                int read = fileInputStream.read(bArr, i9, i8);
                if (read < 0) {
                    break;
                }
                i8 -= read;
                i9 += read;
            }
            if (i8 > 0) {
                bArr = Arrays.copyOf(bArr, i9);
                h.d(bArr, "copyOf(...)");
            } else {
                int read2 = fileInputStream.read();
                if (read2 != -1) {
                    w wVar = new w(8193);
                    wVar.write(read2);
                    f.u(fileInputStream, wVar, 8192);
                    int size = wVar.size() + i7;
                    if (size < 0) {
                        throw new OutOfMemoryError("File " + file + " is too big to fit in memory.");
                    }
                    byte[] b7 = wVar.b();
                    bArr = Arrays.copyOf(bArr, size);
                    h.d(bArr, "copyOf(...)");
                    AbstractC1158g.q0(b7, i7, bArr, 0, wVar.size());
                }
            }
            AbstractC1539a.e(fileInputStream, null);
            return bArr;
        } catch (Throwable th) {
            try {
                throw th;
            } catch (Throwable th2) {
                AbstractC1539a.e(fileInputStream, th);
                throw th2;
            }
        }
    }

    public static final void zzb(File file, byte[] bArr) {
        if (file.exists() && !file.delete()) {
            throw new IOException("Unable to delete existing encrypted file");
        }
        h.e(bArr, "array");
        FileOutputStream fileOutputStream = new FileOutputStream(file);
        try {
            fileOutputStream.write(bArr);
            AbstractC1539a.e(fileOutputStream, null);
        } finally {
        }
    }
}
