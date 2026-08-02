package T7;

import com.google.crypto.tink.shaded.protobuf.AbstractC5903i;
import com.google.crypto.tink.shaded.protobuf.C5910p;
import f8.E;
import f8.G;
import java.nio.BufferUnderflowException;
import java.nio.ByteBuffer;
import java.security.GeneralSecurityException;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

/* loaded from: classes9.dex */
public final class C implements S7.a {

    /* renamed from: d, reason: collision with root package name */
    private static final byte[] f26711d = new byte[0];

    /* renamed from: e, reason: collision with root package name */
    private static final Set<String> f26712e;

    /* renamed from: a, reason: collision with root package name */
    private final String f26713a;

    /* renamed from: b, reason: collision with root package name */
    private final S7.q f26714b;

    /* renamed from: c, reason: collision with root package name */
    private final S7.a f26715c;

    static {
        HashSet hashSet = new HashSet();
        hashSet.add("type.googleapis.com/google.crypto.tink.AesGcmKey");
        hashSet.add("type.googleapis.com/google.crypto.tink.ChaCha20Poly1305Key");
        hashSet.add("type.googleapis.com/google.crypto.tink.XChaCha20Poly1305Key");
        hashSet.add("type.googleapis.com/google.crypto.tink.AesCtrHmacAeadKey");
        hashSet.add("type.googleapis.com/google.crypto.tink.AesGcmSivKey");
        hashSet.add("type.googleapis.com/google.crypto.tink.AesEaxKey");
        f26712e = Collections.unmodifiableSet(hashSet);
    }

    @Deprecated
    public C(f8.G g10, S7.a aVar) throws GeneralSecurityException {
        if (!f26712e.contains(g10.J())) {
            throw new IllegalArgumentException("Unsupported DEK key type: " + g10.J() + ". Only Tink AEAD key types are supported.");
        }
        this.f26713a = g10.J();
        G.b M11 = f8.G.M(g10);
        M11.i(f8.O.RAW);
        this.f26714b = S7.t.a(M11.b().f());
        this.f26715c = aVar;
    }

    public static C c(AbstractC4021c abstractC4021c, S7.a aVar) throws GeneralSecurityException {
        try {
            return new C(f8.G.N(S7.t.b(abstractC4021c), C5910p.b()), aVar);
        } catch (com.google.crypto.tink.shaded.protobuf.A e11) {
            throw new GeneralSecurityException(e11);
        }
    }

    @Override // S7.a
    public final byte[] a(byte[] bArr, byte[] bArr2) throws GeneralSecurityException {
        He.g b11 = com.google.crypto.tink.internal.p.c().b(this.f26714b, null);
        byte[] a11 = this.f26715c.a(((com.google.crypto.tink.internal.F) com.google.crypto.tink.internal.u.a().j(b11, S7.e.a())).g().n(), f26711d);
        if (a11.length > 4096) {
            throw new GeneralSecurityException("length of encrypted DEK too large");
        }
        byte[] a12 = ((S7.a) com.google.crypto.tink.internal.t.b().a(b11, S7.a.class)).a(bArr, bArr2);
        return ByteBuffer.allocate(a11.length + 4 + a12.length).putInt(a11.length).put(a11).put(a12).array();
    }

    @Override // S7.a
    public final byte[] b(byte[] bArr, byte[] bArr2) throws GeneralSecurityException {
        try {
            ByteBuffer wrap = ByteBuffer.wrap(bArr);
            int i11 = wrap.getInt();
            if (i11 <= 0 || i11 > 4096 || i11 > bArr.length - 4) {
                throw new GeneralSecurityException("length of encrypted DEK too large");
            }
            byte[] bArr3 = new byte[i11];
            wrap.get(bArr3, 0, i11);
            byte[] bArr4 = new byte[wrap.remaining()];
            wrap.get(bArr4, 0, wrap.remaining());
            byte[] b11 = this.f26715c.b(bArr3, f26711d);
            String str = this.f26713a;
            AbstractC5903i abstractC5903i = AbstractC5903i.f59377b;
            return ((S7.a) com.google.crypto.tink.internal.t.b().a(com.google.crypto.tink.internal.u.a().b(com.google.crypto.tink.internal.F.a(str, AbstractC5903i.e(0, b11.length, b11), E.c.SYMMETRIC, f8.O.RAW, null), S7.e.a()), S7.a.class)).b(bArr4, bArr2);
        } catch (IndexOutOfBoundsException e11) {
            e = e11;
            throw new GeneralSecurityException("invalid ciphertext", e);
        } catch (NegativeArraySizeException e12) {
            e = e12;
            throw new GeneralSecurityException("invalid ciphertext", e);
        } catch (BufferUnderflowException e13) {
            e = e13;
            throw new GeneralSecurityException("invalid ciphertext", e);
        }
    }
}
