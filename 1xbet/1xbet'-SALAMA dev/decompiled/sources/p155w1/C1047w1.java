package p155w1;

import android.util.Log;
import com.google.android.gms.common.internal.C0815k;
import java.io.BufferedOutputStream;
import java.io.ByteArrayOutputStream;
import java.io.DataOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.security.DigestOutputStream;
import java.util.Objects;
import java.util.PriorityQueue;
import java.util.concurrent.locks.ReentrantLock;
import p033e3.h;

/* JADX INFO: renamed from: w1.w1, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C1047w1 extends AbstractC1056z1 {

    /* JADX INFO: renamed from: B, reason: collision with root package name */
    public static BufferedOutputStream f17917B;

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    public Object f17918A;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public Object f17919z;

    public C1047w1() {
        super(AbstractC1044v1.a(EnumC1038t1.f17869a), false);
        this.f17919z = null;
        this.f17918A = new ReentrantLock(true);
        this.f17919z = new C1013m0(28);
    }

    public static void h(C1047w1 c1047w1, C2 c3) {
        byte[] byteArray;
        DataOutputStream dataOutputStream;
        synchronized (((C1013m0) c1047w1.f17919z)) {
            byteArray = null;
            try {
                x2 x2Var = new x2();
                ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream(640);
                DigestOutputStream digestOutputStream = new DigestOutputStream(byteArrayOutputStream, x2Var);
                dataOutputStream = new DataOutputStream(digestOutputStream);
                try {
                    Objects.toString(c3.a());
                    c3.b();
                    dataOutputStream.writeByte((byte) ((!c3.f17323d ? 1 : 0) | 128));
                    byte b7 = (byte) 0;
                    byte[] bArr = {b7, b7, (byte) c3.a().f17363a, 0};
                    for (int i7 = 0; i7 < 3; i7++) {
                        dataOutputStream.write(bArr[i7]);
                    }
                    dataOutputStream.writeLong(c3.f17320a);
                    dataOutputStream.writeLong(c3.f17321b);
                    byte[] bytes = c3.b().getBytes("UTF-8");
                    dataOutputStream.writeInt(bytes.length);
                    dataOutputStream.write(bytes);
                    if (c3.f17323d) {
                        digestOutputStream.on(false);
                        dataOutputStream.writeInt(ByteBuffer.wrap(x2Var.engineDigest()).getInt());
                    }
                    dataOutputStream.close();
                    byteArray = byteArrayOutputStream.toByteArray();
                } catch (Throwable th) {
                    th = th;
                    try {
                        Log.getStackTraceString(th);
                    } catch (Throwable th2) {
                        AbstractC0997i0.h(dataOutputStream);
                        throw th2;
                    }
                }
            } catch (Throwable th3) {
                th = th3;
                dataOutputStream = null;
            }
            AbstractC0997i0.h(dataOutputStream);
        }
        if (byteArray != null) {
            try {
                f17917B.write(byteArray);
                f17917B.flush();
            } catch (IOException e7) {
                e7.getMessage();
            }
        }
        Objects.toString(c3.a());
    }

    public static void j(boolean z4) {
        C1050x1.z().A(new R1(new q2(z4, 1), 27));
    }

    public static byte[] l(File file) throws IOException {
        int length = (int) file.length();
        byte[] bArr = new byte[length];
        byte[] bArr2 = new byte[length];
        FileInputStream fileInputStream = new FileInputStream(file);
        try {
            try {
                int i7 = fileInputStream.read(bArr, 0, length);
                if (i7 < length) {
                    int i8 = length - i7;
                    while (i8 > 0) {
                        int i9 = fileInputStream.read(bArr2, 0, i8);
                        System.arraycopy(bArr2, 0, bArr, length - i8, i9);
                        i8 -= i9;
                    }
                }
            } catch (IOException e7) {
                "Error reading file. ".concat(String.valueOf(e7));
            }
            return bArr;
        } finally {
            fileInputStream.close();
        }
    }

    public void i(C2 c3, h hVar) {
        Objects.toString(c3.a());
        d(new C1028q(this, c3, hVar));
    }

    public boolean k(String str, String str2) {
        boolean z4;
        ReentrantLock reentrantLock = (ReentrantLock) this.f17918A;
        reentrantLock.lock();
        try {
            try {
                File file = new File(str, str2);
                if (!file.exists() && !AbstractC1006k1.g(file)) {
                    throw new IOException("Frame file: Error creating directory for :" + file.getAbsolutePath());
                }
                z4 = true;
                f17917B = new BufferedOutputStream(new FileOutputStream(file, true));
            } catch (IOException e7) {
                e7.getMessage();
                z4 = false;
            }
            reentrantLock.unlock();
            return z4;
        } catch (Throwable th) {
            reentrantLock.unlock();
            throw th;
        }
    }

    public void m() {
        ReentrantLock reentrantLock = (ReentrantLock) this.f17918A;
        reentrantLock.lock();
        try {
            AbstractC0997i0.h(f17917B);
            f17917B = null;
        } finally {
            reentrantLock.unlock();
        }
    }

    public void n() {
        AbstractC0997i0.o(4, " Starting processNextFile " + ((PriorityQueue) this.f17919z).size());
        if (((PriorityQueue) this.f17919z).peek() == null) {
            AbstractC0997i0.o(4, "No file present to process.");
            return;
        }
        String str = (String) ((PriorityQueue) this.f17919z).poll();
        if (AbstractC1006k1.j(str)) {
            AbstractC0997i0.o(4, "Starting to upload file: ".concat(String.valueOf(str)));
            byte[] bArrL = new byte[0];
            try {
                bArrL = l(new File(str));
            } catch (IOException e7) {
                e7.getMessage();
            }
            String strB = C0815k.a().b();
            C1017n0.a();
            C1034s0 c1034s0 = (C1034s0) this.f17918A;
            c1034s0.getClass();
            if (bArrL.length != 0) {
                c1034s0.d(new C1028q(c1034s0, bArrL, strB));
                c1034s0.d(new C1008l(c1034s0, 4));
            }
            ((C1034s0) this.f17918A).f17859B = new C1009l0(28);
            synchronized (this) {
                AbstractC0997i0.o(4, "File upload status: ".concat(String.valueOf(str)));
                File file = new File(str);
                if (file.exists()) {
                    file.delete();
                }
                n();
            }
            AbstractC0997i0.o(4, "File appended for upload: ".concat(String.valueOf(str)));
        }
    }
}
