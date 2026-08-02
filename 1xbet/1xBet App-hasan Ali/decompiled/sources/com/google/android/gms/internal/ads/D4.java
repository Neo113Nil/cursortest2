package com.google.android.gms.internal.ads;

import java.nio.ByteBuffer;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.security.SecureRandom;
import java.util.Arrays;
import java.util.Vector;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;

/* loaded from: classes.dex */
public abstract class D4 {

    /* renamed from: a, reason: collision with root package name */
    public static boolean f8159a = false;

    /* renamed from: b, reason: collision with root package name */
    public static MessageDigest f8160b;

    /* renamed from: c, reason: collision with root package name */
    public static final Object f8161c = new Object();

    /* renamed from: d, reason: collision with root package name */
    public static final Object f8162d = new Object();

    /* renamed from: e, reason: collision with root package name */
    public static final CountDownLatch f8163e = new CountDownLatch(1);

    public static C1771x4 a(String str, byte[] bArr) {
        Vector vector;
        int length = bArr.length;
        if (length > 0) {
            int i = length + 254;
            vector = new Vector();
            for (int i5 = 0; i5 < i / 255; i5++) {
                int i6 = i5 * 255;
                try {
                    int length2 = bArr.length;
                    if (length2 - i6 > 255) {
                        length2 = i6 + 255;
                    }
                    vector.add(Arrays.copyOfRange(bArr, i6, length2));
                } catch (IndexOutOfBoundsException unused) {
                }
            }
            if (vector != null || vector.isEmpty()) {
                return null;
            }
            C1771x4 w5 = C1816y4.w();
            int size = vector.size();
            for (int i7 = 0; i7 < size; i7++) {
                C1733wB r5 = AbstractC1823yB.r(d((byte[]) vector.get(i7), str, false), 0, 256);
                w5.e();
                C1816y4.x((C1816y4) w5.f10141l, r5);
            }
            byte[] c5 = c(bArr);
            C1733wB c1733wB = AbstractC1823yB.f16414l;
            C1733wB r6 = AbstractC1823yB.r(c5, 0, c5.length);
            w5.e();
            C1816y4.y((C1816y4) w5.f10141l, r6);
            return w5;
        }
        vector = null;
        if (vector != null) {
        }
        return null;
    }

    public static void b() {
        synchronized (f8162d) {
            try {
                if (!f8159a) {
                    f8159a = true;
                    new Thread(new C4(0)).start();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:14:0x001f, code lost:
    
        r1.reset();
        r1.update(r6);
        r6 = com.google.android.gms.internal.ads.D4.f8160b.digest();
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static byte[] c(byte[] bArr) {
        byte[] digest;
        MessageDigest messageDigest;
        synchronized (f8161c) {
            try {
                b();
                MessageDigest messageDigest2 = null;
                try {
                    if (f8163e.await(2L, TimeUnit.SECONDS) && (messageDigest = f8160b) != null) {
                        messageDigest2 = messageDigest;
                    }
                } catch (InterruptedException unused) {
                }
                throw new NoSuchAlgorithmException("Cannot compute hash");
            } finally {
            }
        }
        return digest;
        throw new NoSuchAlgorithmException("Cannot compute hash");
    }

    public static byte[] d(byte[] bArr, String str, boolean z3) {
        byte[] array;
        int length = bArr.length;
        int i = true != z3 ? 255 : 239;
        if (length > i) {
            C0919e4 W4 = C1367o4.W();
            W4.e();
            C1367o4.H((C1367o4) W4.f10141l, 4096L);
            bArr = ((C1367o4) W4.b()).d();
        }
        int i5 = i + 1;
        int length2 = bArr.length;
        byte b3 = (byte) length2;
        if (length2 < i) {
            byte[] bArr2 = new byte[i - length2];
            new SecureRandom().nextBytes(bArr2);
            array = ByteBuffer.allocate(i5).put(b3).put(bArr).put(bArr2).array();
        } else {
            array = ByteBuffer.allocate(i5).put(b3).put(bArr).array();
        }
        if (z3) {
            array = ByteBuffer.allocate(256).put(c(array)).put(array).array();
        }
        byte[] bArr3 = new byte[256];
        E4[] e4Arr = new J4().f9706G2;
        for (int i6 = 0; i6 < 12; i6++) {
            e4Arr[i6].a(array, bArr3);
        }
        if (str != null && str.length() > 0) {
            if (str.length() > 32) {
                str = str.substring(0, 32);
            }
            Mt mt = new Mt(str.getBytes("UTF-8"));
            int i7 = 0;
            int i8 = 0;
            for (int i9 = 0; i9 < 256; i9++) {
                i7 = (i7 + 1) & 255;
                byte[] bArr4 = (byte[]) mt.f10741l;
                byte b5 = bArr4[i7];
                i8 = (i8 + b5) & 255;
                bArr4[i7] = bArr4[i8];
                bArr4[i8] = b5;
                bArr3[i9] = (byte) (bArr4[(bArr4[i7] + b5) & 255] ^ bArr3[i9]);
            }
        }
        return bArr3;
    }
}
