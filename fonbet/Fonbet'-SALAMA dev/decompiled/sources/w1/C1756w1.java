package w1;

import android.util.Log;
import com.google.android.gms.common.internal.C0859k;
import e3.C1023h;
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

/* renamed from: w1.w1, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1756w1 extends AbstractC1765z1 {

    /* renamed from: B, reason: collision with root package name */
    public static BufferedOutputStream f17911B;

    /* renamed from: A, reason: collision with root package name */
    public Object f17912A;

    /* renamed from: z, reason: collision with root package name */
    public Object f17913z;

    public C1756w1() {
        super(AbstractC1753v1.a(EnumC1747t1.f17863a), false);
        this.f17913z = null;
        this.f17912A = new ReentrantLock(true);
        this.f17913z = new C1722m0(28);
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x0098 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static void h(C1756w1 c1756w1, C2 c22) {
        byte[] bArr;
        DataOutputStream dataOutputStream;
        synchronized (((C1722m0) c1756w1.f17913z)) {
            bArr = null;
            try {
                x2 x2Var = new x2();
                ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream(640);
                DigestOutputStream digestOutputStream = new DigestOutputStream(byteArrayOutputStream, x2Var);
                dataOutputStream = new DataOutputStream(digestOutputStream);
                try {
                    Objects.toString(c22.a());
                    c22.b();
                    dataOutputStream.writeByte((byte) ((!c22.f17317d ? 1 : 0) | 128));
                    byte b7 = (byte) 0;
                    byte[] bArr2 = {b7, b7, (byte) c22.a().f17357a, 0};
                    for (int i7 = 0; i7 < 3; i7++) {
                        dataOutputStream.write(bArr2[i7]);
                    }
                    dataOutputStream.writeLong(c22.f17314a);
                    dataOutputStream.writeLong(c22.f17315b);
                    byte[] bytes = c22.b().getBytes("UTF-8");
                    dataOutputStream.writeInt(bytes.length);
                    dataOutputStream.write(bytes);
                    if (c22.f17317d) {
                        digestOutputStream.on(false);
                        dataOutputStream.writeInt(ByteBuffer.wrap(x2Var.engineDigest()).getInt());
                    }
                    dataOutputStream.close();
                    bArr = byteArrayOutputStream.toByteArray();
                } catch (Throwable th) {
                    th = th;
                    try {
                        Log.getStackTraceString(th);
                        if (bArr != null) {
                        }
                        Objects.toString(c22.a());
                    } finally {
                        AbstractC1706i0.h(dataOutputStream);
                    }
                }
            } catch (Throwable th2) {
                th = th2;
                dataOutputStream = null;
            }
        }
        if (bArr != null) {
            try {
                f17911B.write(bArr);
                f17911B.flush();
            } catch (IOException e7) {
                e7.getMessage();
            }
        }
        Objects.toString(c22.a());
    }

    public static void j(boolean z4) {
        C1759x1.z().A(new R1(new q2(z4, 1), 27));
    }

    public static byte[] l(File file) {
        int length = (int) file.length();
        byte[] bArr = new byte[length];
        byte[] bArr2 = new byte[length];
        FileInputStream fileInputStream = new FileInputStream(file);
        try {
            try {
                int read = fileInputStream.read(bArr, 0, length);
                if (read < length) {
                    int i7 = length - read;
                    while (i7 > 0) {
                        int read2 = fileInputStream.read(bArr2, 0, i7);
                        System.arraycopy(bArr2, 0, bArr, length - i7, read2);
                        i7 -= read2;
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

    public void i(C2 c22, C1023h c1023h) {
        Objects.toString(c22.a());
        d(new C1737q(this, c22, c1023h));
    }

    public boolean k(String str, String str2) {
        boolean z4;
        ReentrantLock reentrantLock = (ReentrantLock) this.f17912A;
        reentrantLock.lock();
        try {
            try {
                File file = new File(str, str2);
                if (!file.exists() && !AbstractC1715k1.g(file)) {
                    throw new IOException("Frame file: Error creating directory for :" + file.getAbsolutePath());
                }
                z4 = true;
                f17911B = new BufferedOutputStream(new FileOutputStream(file, true));
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
        ReentrantLock reentrantLock = (ReentrantLock) this.f17912A;
        reentrantLock.lock();
        try {
            AbstractC1706i0.h(f17911B);
            f17911B = null;
        } finally {
            reentrantLock.unlock();
        }
    }

    public void n() {
        AbstractC1706i0.o(4, " Starting processNextFile " + ((PriorityQueue) this.f17913z).size());
        if (((PriorityQueue) this.f17913z).peek() == null) {
            AbstractC1706i0.o(4, "No file present to process.");
            return;
        }
        String str = (String) ((PriorityQueue) this.f17913z).poll();
        if (AbstractC1715k1.j(str)) {
            AbstractC1706i0.o(4, "Starting to upload file: ".concat(String.valueOf(str)));
            byte[] bArr = new byte[0];
            try {
                bArr = l(new File(str));
            } catch (IOException e7) {
                e7.getMessage();
            }
            String b7 = C0859k.a().b();
            C1726n0.a();
            C1743s0 c1743s0 = (C1743s0) this.f17912A;
            c1743s0.getClass();
            if (bArr.length != 0) {
                c1743s0.d(new C1737q(c1743s0, bArr, b7));
                c1743s0.d(new C1717l(c1743s0, 4));
            }
            ((C1743s0) this.f17912A).f17853B = new C1718l0(28);
            synchronized (this) {
                AbstractC1706i0.o(4, "File upload status: ".concat(String.valueOf(str)));
                File file = new File(str);
                if (file.exists()) {
                    file.delete();
                }
                n();
            }
            AbstractC1706i0.o(4, "File appended for upload: ".concat(String.valueOf(str)));
        }
    }
}
