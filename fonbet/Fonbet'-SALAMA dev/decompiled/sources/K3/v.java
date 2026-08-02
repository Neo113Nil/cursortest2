package K3;

import A1.AbstractC0021h;
import V3.b0;
import com.google.crypto.tink.shaded.protobuf.AbstractC0865a;
import com.google.crypto.tink.shaded.protobuf.AbstractC0873i;
import com.google.crypto.tink.shaded.protobuf.C;
import java.nio.BufferUnderflowException;
import java.nio.ByteBuffer;
import java.security.GeneralSecurityException;
import java.util.Map;
import java.util.concurrent.atomic.AtomicReference;

/* loaded from: classes2.dex */
public final class v implements J3.a {

    /* renamed from: c, reason: collision with root package name */
    public static final byte[] f3953c = new byte[0];

    /* renamed from: a, reason: collision with root package name */
    public final b0 f3954a;

    /* renamed from: b, reason: collision with root package name */
    public final P3.b f3955b;

    public v(b0 b0Var, P3.b bVar) {
        this.f3954a = b0Var;
        this.f3955b = bVar;
    }

    @Override // J3.a
    public final byte[] a(byte[] bArr, byte[] bArr2) {
        AbstractC0865a b7;
        b0 b0Var = this.f3954a;
        AtomicReference atomicReference = J3.n.f3855a;
        synchronized (J3.n.class) {
            try {
                Q3.d dVar = ((J3.e) J3.n.f3855a.get()).a(b0Var.D()).f3835a;
                Class cls = (Class) dVar.f5805b;
                if (!((Map) dVar.f5806c).keySet().contains(cls) && !Void.class.equals(cls)) {
                    throw new IllegalArgumentException("Given internalKeyMananger " + dVar.toString() + " does not support primitive class " + cls.getName());
                }
                if (!((Boolean) J3.n.f3857c.get(b0Var.D())).booleanValue()) {
                    throw new GeneralSecurityException("newKey-operation not permitted for key type " + b0Var.D());
                }
                AbstractC0873i E7 = b0Var.E();
                try {
                    AbstractC0021h n2 = dVar.n();
                    AbstractC0865a m7 = n2.m(E7);
                    n2.p(m7);
                    b7 = n2.b(m7);
                } catch (C e7) {
                    throw new GeneralSecurityException("Failures parsing proto of type ".concat(((Class) dVar.n().f364a).getName()), e7);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        byte[] e8 = b7.e();
        byte[] a2 = this.f3955b.a(e8, f3953c);
        byte[] a4 = ((J3.a) J3.n.d(this.f3954a.D(), e8)).a(bArr, bArr2);
        return ByteBuffer.allocate(a2.length + 4 + a4.length).putInt(a2.length).put(a2).put(a4).array();
    }

    @Override // J3.a
    public final byte[] b(byte[] bArr, byte[] bArr2) {
        try {
            ByteBuffer wrap = ByteBuffer.wrap(bArr);
            int i7 = wrap.getInt();
            if (i7 <= 0 || i7 > bArr.length - 4) {
                throw new GeneralSecurityException("invalid ciphertext");
            }
            byte[] bArr3 = new byte[i7];
            wrap.get(bArr3, 0, i7);
            byte[] bArr4 = new byte[wrap.remaining()];
            wrap.get(bArr4, 0, wrap.remaining());
            return ((J3.a) J3.n.d(this.f3954a.D(), this.f3955b.b(bArr3, f3953c))).b(bArr4, bArr2);
        } catch (IndexOutOfBoundsException e7) {
            e = e7;
            throw new GeneralSecurityException("invalid ciphertext", e);
        } catch (NegativeArraySizeException e8) {
            e = e8;
            throw new GeneralSecurityException("invalid ciphertext", e);
        } catch (BufferUnderflowException e9) {
            e = e9;
            throw new GeneralSecurityException("invalid ciphertext", e);
        }
    }
}
