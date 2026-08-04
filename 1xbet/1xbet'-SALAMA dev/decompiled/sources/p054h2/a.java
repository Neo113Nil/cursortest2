package p054h2;

import android.net.Uri;
import java.io.IOException;
import java.security.InvalidAlgorithmParameterException;
import java.security.InvalidKeyException;
import java.security.NoSuchAlgorithmException;
import java.util.Map;
import javax.crypto.Cipher;
import javax.crypto.CipherInputStream;
import javax.crypto.NoSuchPaddingException;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;
import p146u2.C0956o;
import p146u2.C0958q;
import p146u2.InterfaceC0954m;
import p146u2.U;

/* JADX INFO: loaded from: classes.dex */
public final class a implements InterfaceC0954m {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final InterfaceC0954m f13361a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final byte[] f13362b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final byte[] f13363c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public CipherInputStream f13364d;

    public a(InterfaceC0954m interfaceC0954m, byte[] bArr, byte[] bArr2) {
        this.f13361a = interfaceC0954m;
        this.f13362b = bArr;
        this.f13363c = bArr2;
    }

    @Override // p146u2.InterfaceC0954m
    public final void close() {
        if (this.f13364d != null) {
            this.f13364d = null;
            this.f13361a.close();
        }
    }

    @Override // p146u2.InterfaceC0954m
    public final Map k() {
        return this.f13361a.k();
    }

    @Override // p146u2.InterfaceC0954m
    public final long o(C0958q c0958q) {
        try {
            Cipher cipher = Cipher.getInstance("AES/CBC/PKCS7Padding");
            try {
                cipher.init(2, new SecretKeySpec(this.f13362b, "AES"), new IvParameterSpec(this.f13363c));
                C0956o c0956o = new C0956o(this.f13361a, c0958q);
                this.f13364d = new CipherInputStream(c0956o, cipher);
                c0956o.a();
                return -1L;
            } catch (InvalidAlgorithmParameterException | InvalidKeyException e7) {
                throw new RuntimeException(e7);
            }
        } catch (NoSuchAlgorithmException | NoSuchPaddingException e8) {
            throw new RuntimeException(e8);
        }
    }

    @Override // p146u2.InterfaceC0951j
    public final int read(byte[] bArr, int i7, int i8) throws IOException {
        this.f13364d.getClass();
        int i9 = this.f13364d.read(bArr, i7, i8);
        if (i9 < 0) {
            return -1;
        }
        return i9;
    }

    @Override // p146u2.InterfaceC0954m
    public final Uri t() {
        return this.f13361a.t();
    }

    @Override // p146u2.InterfaceC0954m
    public final void x(U u4) {
        u4.getClass();
        this.f13361a.x(u4);
    }
}
