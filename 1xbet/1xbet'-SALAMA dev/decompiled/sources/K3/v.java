package K3;

import A1.AbstractC0021h;
import V3.b0;
import com.google.crypto.tink.shaded.protobuf.AbstractC0821a;
import com.google.crypto.tink.shaded.protobuf.AbstractC0829i;
import com.google.crypto.tink.shaded.protobuf.C;
import java.nio.BufferUnderflowException;
import java.nio.ByteBuffer;
import java.security.GeneralSecurityException;
import java.util.Map;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes2.dex */
public final class v implements J3.a {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final byte[] f3953c = new byte[0];

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final b0 f3954a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final P3.b f3955b;

    public v(b0 b0Var, P3.b bVar) {
        this.f3954a = b0Var;
        this.f3955b = bVar;
    }

    @Override // J3.a
    public final byte[] a(byte[] bArr, byte[] bArr2) {
        AbstractC0821a abstractC0821aB;
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
                AbstractC0829i abstractC0829iE = b0Var.E();
                try {
                    AbstractC0021h abstractC0021hN = dVar.n();
                    AbstractC0821a abstractC0821aM = abstractC0021hN.m(abstractC0829iE);
                    abstractC0021hN.p(abstractC0821aM);
                    abstractC0821aB = abstractC0021hN.b(abstractC0821aM);
                } catch (C e7) {
                    throw new GeneralSecurityException("Failures parsing proto of type ".concat(((Class) dVar.n().f364a).getName()), e7);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        byte[] bArrE = abstractC0821aB.e();
        byte[] bArrA = this.f3955b.a(bArrE, f3953c);
        byte[] bArrA2 = ((J3.a) J3.n.d(this.f3954a.D(), bArrE)).a(bArr, bArr2);
        return ByteBuffer.allocate(bArrA.length + 4 + bArrA2.length).putInt(bArrA.length).put(bArrA).put(bArrA2).array();
    }

    @Override // J3.a
    public final byte[] b(byte[] bArr, byte[] bArr2) throws GeneralSecurityException {
        try {
            ByteBuffer byteBufferWrap = ByteBuffer.wrap(bArr);
            int i7 = byteBufferWrap.getInt();
            if (i7 <= 0 || i7 > bArr.length - 4) {
                throw new GeneralSecurityException("invalid ciphertext");
            }
            byte[] bArr3 = new byte[i7];
            byteBufferWrap.get(bArr3, 0, i7);
            byte[] bArr4 = new byte[byteBufferWrap.remaining()];
            byteBufferWrap.get(bArr4, 0, byteBufferWrap.remaining());
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
