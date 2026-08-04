package com.google.android.recaptcha.internal;

import A5.w;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Arrays;
import p050g6.g;
import p113p3.f;
import p115p6.a;
import t6.h;

/* JADX INFO: loaded from: classes.dex */
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
            byte[] bArrCopyOf = new byte[i7];
            int i8 = i7;
            int i9 = 0;
            while (i8 > 0) {
                int i10 = fileInputStream.read(bArrCopyOf, i9, i8);
                if (i10 < 0) {
                    break;
                }
                i8 -= i10;
                i9 += i10;
            }
            if (i8 > 0) {
                bArrCopyOf = Arrays.copyOf(bArrCopyOf, i9);
                h.d(bArrCopyOf, "copyOf(...)");
            } else {
                int i11 = fileInputStream.read();
                if (i11 != -1) {
                    w wVar = new w(8193);
                    wVar.write(i11);
                    f.u(fileInputStream, wVar, 8192);
                    int size = wVar.size() + i7;
                    if (size < 0) {
                        throw new OutOfMemoryError("File " + file + " is too big to fit in memory.");
                    }
                    byte[] bArrB = wVar.b();
                    bArrCopyOf = Arrays.copyOf(bArrCopyOf, size);
                    h.d(bArrCopyOf, "copyOf(...)");
                    g.q0(bArrB, i7, bArrCopyOf, 0, wVar.size());
                }
            }
            a.e(fileInputStream, null);
            return bArrCopyOf;
        } catch (Throwable th) {
            try {
                throw th;
            } catch (Throwable th2) {
                a.e(fileInputStream, th);
                throw th2;
            }
        }
    }

    public static final void zzb(File file, byte[] bArr) throws IOException {
        if (file.exists() && !file.delete()) {
            throw new IOException("Unable to delete existing encrypted file");
        }
        h.e(bArr, "array");
        FileOutputStream fileOutputStream = new FileOutputStream(file);
        try {
            fileOutputStream.write(bArr);
            a.e(fileOutputStream, null);
        } catch (Throwable th) {
            try {
                throw th;
            } catch (Throwable th2) {
                a.e(fileOutputStream, th);
                throw th2;
            }
        }
    }
}
