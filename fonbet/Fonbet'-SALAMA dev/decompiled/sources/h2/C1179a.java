package h2;

import android.net.Uri;
import java.security.InvalidAlgorithmParameterException;
import java.security.InvalidKeyException;
import java.security.NoSuchAlgorithmException;
import java.util.Map;
import javax.crypto.Cipher;
import javax.crypto.CipherInputStream;
import javax.crypto.NoSuchPaddingException;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;
import u2.C1638o;
import u2.C1640q;
import u2.InterfaceC1636m;
import u2.U;

/* renamed from: h2.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1179a implements InterfaceC1636m {

    /* renamed from: a, reason: collision with root package name */
    public final InterfaceC1636m f13355a;

    /* renamed from: b, reason: collision with root package name */
    public final byte[] f13356b;

    /* renamed from: c, reason: collision with root package name */
    public final byte[] f13357c;

    /* renamed from: d, reason: collision with root package name */
    public CipherInputStream f13358d;

    public C1179a(InterfaceC1636m interfaceC1636m, byte[] bArr, byte[] bArr2) {
        this.f13355a = interfaceC1636m;
        this.f13356b = bArr;
        this.f13357c = bArr2;
    }

    @Override // u2.InterfaceC1636m
    public final void close() {
        if (this.f13358d != null) {
            this.f13358d = null;
            this.f13355a.close();
        }
    }

    @Override // u2.InterfaceC1636m
    public final Map k() {
        return this.f13355a.k();
    }

    @Override // u2.InterfaceC1636m
    public final long o(C1640q c1640q) {
        try {
            Cipher cipher = Cipher.getInstance("AES/CBC/PKCS7Padding");
            try {
                cipher.init(2, new SecretKeySpec(this.f13356b, "AES"), new IvParameterSpec(this.f13357c));
                C1638o c1638o = new C1638o(this.f13355a, c1640q);
                this.f13358d = new CipherInputStream(c1638o, cipher);
                c1638o.a();
                return -1L;
            } catch (InvalidAlgorithmParameterException | InvalidKeyException e7) {
                throw new RuntimeException(e7);
            }
        } catch (NoSuchAlgorithmException | NoSuchPaddingException e8) {
            throw new RuntimeException(e8);
        }
    }

    @Override // u2.InterfaceC1633j
    public final int read(byte[] bArr, int i7, int i8) {
        this.f13358d.getClass();
        int read = this.f13358d.read(bArr, i7, i8);
        if (read < 0) {
            return -1;
        }
        return read;
    }

    @Override // u2.InterfaceC1636m
    public final Uri t() {
        return this.f13355a.t();
    }

    @Override // u2.InterfaceC1636m
    public final void x(U u4) {
        u4.getClass();
        this.f13355a.x(u4);
    }
}
