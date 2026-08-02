package A0;

import G1.C0145p;
import android.content.Context;
import android.content.pm.PackageManager;
import android.os.IBinder;
import c.C0522a;
import com.google.android.gms.internal.ads.AbstractC0613Id;
import com.google.android.gms.internal.ads.AbstractC1400ot;
import com.google.android.gms.internal.ads.AbstractC1674uy;
import com.google.android.gms.internal.ads.C0634Ld;
import com.google.android.gms.internal.ads.C0709Wb;
import com.google.android.gms.internal.ads.C1390oj;
import com.google.android.gms.internal.ads.F7;
import com.google.android.gms.internal.ads.InterfaceC0641Md;
import com.google.android.gms.internal.ads.InterfaceC0648Nd;
import com.google.android.gms.internal.ads.Kw;
import com.google.android.gms.internal.ads.Qt;
import e.C1918a;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.security.GeneralSecurityException;
import java.security.MessageDigest;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import javax.crypto.AEADBadTagException;
import n.AbstractC2107A;
import r0.AbstractC2346c;
import s3.C2362c;

/* renamed from: A0.c, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC0015c {

    /* renamed from: a, reason: collision with root package name */
    public Object f474a;

    /* renamed from: b, reason: collision with root package name */
    public Object f475b;

    public AbstractC0015c(C1390oj c1390oj, T2.I i) {
        this.f475b = c1390oj;
        this.f474a = i;
    }

    public abstract int[] a(int i);

    public int[] b(int i, int i5) {
        if (i < 0 || i5 < 0 || i == i5) {
            return null;
        }
        int[] iArr = (int[]) this.f475b;
        iArr[0] = i;
        iArr[1] = i5;
        return iArr;
    }

    public abstract Object c(IBinder iBinder);

    public Object d(Context context) {
        Context context2;
        if (this.f475b == null) {
            m3.v.e(context);
            AtomicBoolean atomicBoolean = j3.h.f17515a;
            try {
                context2 = context.createPackageContext("com.google.android.gms", 3);
            } catch (PackageManager.NameNotFoundException unused) {
                context2 = null;
            }
            if (context2 == null) {
                throw new C2362c("Could not get remote context.");
            }
            try {
                this.f475b = c((IBinder) context2.getClassLoader().loadClass((String) this.f474a).newInstance());
            } catch (ClassNotFoundException e3) {
                throw new C2362c("Could not load creator class.", e3);
            } catch (IllegalAccessException e5) {
                throw new C2362c("Could not access creator.", e5);
            } catch (InstantiationException e6) {
                throw new C2362c("Could not instantiate creator.", e6);
            }
        }
        return this.f475b;
    }

    public String e() {
        String str = (String) this.f474a;
        if (str != null) {
            return str;
        }
        kotlin.jvm.internal.l.k("text");
        throw null;
    }

    public boolean f() {
        return ((C0145p) this.f474a).f1926b && ((C1918a) this.f475b).f2571b;
    }

    public abstract void h();

    public abstract int[] k(int i);

    public abstract AbstractC1674uy l(int i, byte[] bArr);

    public byte[] m(ByteBuffer byteBuffer, byte[] bArr, byte[] bArr2) {
        if (byteBuffer.remaining() < 16) {
            throw new GeneralSecurityException("ciphertext too short");
        }
        int position = byteBuffer.position();
        byte[] bArr3 = new byte[16];
        byteBuffer.position(byteBuffer.limit() - 16);
        byteBuffer.get(bArr3);
        byteBuffer.position(position);
        byteBuffer.limit(byteBuffer.limit() - 16);
        if (bArr2 == null) {
            bArr2 = new byte[0];
        }
        try {
            byte[] bArr4 = new byte[32];
            ((AbstractC1674uy) this.f475b).p(0, bArr).get(bArr4);
            int length = bArr2.length;
            int i = length & 15;
            int i5 = i == 0 ? length : (length + 16) - i;
            int remaining = byteBuffer.remaining();
            int i6 = remaining % 16;
            int i7 = (i6 == 0 ? remaining : (remaining + 16) - i6) + i5;
            ByteBuffer order = ByteBuffer.allocate(i7 + 16).order(ByteOrder.LITTLE_ENDIAN);
            order.put(bArr2);
            order.position(i5);
            order.put(byteBuffer);
            order.position(i7);
            order.putLong(length);
            order.putLong(remaining);
            if (!MessageDigest.isEqual(AbstractC1400ot.s(bArr4, order.array()), bArr3)) {
                throw new GeneralSecurityException("invalid MAC");
            }
            byteBuffer.position(position);
            AbstractC1674uy abstractC1674uy = (AbstractC1674uy) this.f474a;
            abstractC1674uy.getClass();
            ByteBuffer allocate = ByteBuffer.allocate(byteBuffer.remaining());
            if (bArr.length != abstractC1674uy.l()) {
                throw new GeneralSecurityException(AbstractC2107A.q("The nonce length (in bytes) must be ", abstractC1674uy.l()));
            }
            int remaining2 = byteBuffer.remaining();
            int i8 = remaining2 / 64;
            for (int i9 = 0; i9 < i8 + 1; i9++) {
                ByteBuffer p5 = abstractC1674uy.p(abstractC1674uy.f15938k + i9, bArr);
                if (i9 == i8) {
                    AbstractC1400ot.m(allocate, byteBuffer, p5, remaining2 % 64);
                } else {
                    AbstractC1400ot.m(allocate, byteBuffer, p5, 64);
                }
            }
            return allocate.array();
        } catch (GeneralSecurityException e3) {
            throw new AEADBadTagException(e3.toString());
        }
    }

    public void n() {
        ((C0634Ld) this.f474a).c(new Exception());
    }

    public void o(String str, Throwable th) {
        ((C0634Ld) this.f474a).c(th);
        if (((Boolean) Q2.r.f5053d.f5056c.a(F7.p7)).booleanValue()) {
            P2.o.f4767B.f4774g.h(str, th);
        }
    }

    public void p(InterfaceC0648Nd interfaceC0648Nd, InterfaceC0641Md interfaceC0641Md) {
        C0709Wb c0709Wb = new C0709Wb(11, interfaceC0648Nd, interfaceC0641Md);
        C0634Ld c0634Ld = (C0634Ld) this.f474a;
        c0634Ld.a(new Kw(0, c0634Ld, c0709Wb), AbstractC0613Id.f9544g);
    }

    public AbstractC0015c(AbstractC2346c abstractC2346c) {
        this.f474a = new C0145p(2, this);
        this.f475b = new C1918a(this, abstractC2346c);
    }

    public AbstractC0015c(int i) {
        switch (i) {
            case 1:
                C0634Ld c0634Ld = new C0634Ld();
                this.f474a = c0634Ld;
                this.f475b = new AtomicInteger(0);
                Qt qt = new Qt(10, this);
                c0634Ld.a(new Kw(0, c0634Ld, qt), AbstractC0613Id.f9544g);
                break;
            default:
                this.f475b = new int[2];
                break;
        }
    }

    public void g() {
    }

    public void j() {
    }

    public void i(C0522a c0522a) {
    }
}
