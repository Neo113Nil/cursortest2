package androidx.media3.exoplayer.hls;

import android.net.Uri;
import java.io.IOException;
import java.security.InvalidAlgorithmParameterException;
import java.security.InvalidKeyException;
import java.security.NoSuchAlgorithmException;
import java.util.List;
import java.util.Map;
import javax.crypto.Cipher;
import javax.crypto.CipherInputStream;
import javax.crypto.NoSuchPaddingException;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;
import p3.C8848h;
import p3.InterfaceC8846f;
import p3.z;

/* loaded from: classes8.dex */
final class a implements InterfaceC8846f {

    /* renamed from: a, reason: collision with root package name */
    private final InterfaceC8846f f43895a;

    /* renamed from: b, reason: collision with root package name */
    private final byte[] f43896b;

    /* renamed from: c, reason: collision with root package name */
    private final byte[] f43897c;

    /* renamed from: d, reason: collision with root package name */
    private CipherInputStream f43898d;

    public a(InterfaceC8846f interfaceC8846f, byte[] bArr, byte[] bArr2) {
        this.f43895a = interfaceC8846f;
        this.f43896b = bArr;
        this.f43897c = bArr2;
    }

    @Override // p3.InterfaceC8846f
    public final void addTransferListener(z zVar) {
        zVar.getClass();
        this.f43895a.addTransferListener(zVar);
    }

    @Override // p3.InterfaceC8846f
    public final void close() throws IOException {
        if (this.f43898d != null) {
            this.f43898d = null;
            this.f43895a.close();
        }
    }

    @Override // p3.InterfaceC8846f
    public final Map<String, List<String>> getResponseHeaders() {
        return this.f43895a.getResponseHeaders();
    }

    @Override // p3.InterfaceC8846f
    public final Uri getUri() {
        return this.f43895a.getUri();
    }

    @Override // p3.InterfaceC8846f
    public final long open(p3.i iVar) throws IOException {
        try {
            Cipher cipher = Cipher.getInstance("AES/CBC/PKCS7Padding");
            try {
                cipher.init(2, new SecretKeySpec(this.f43896b, "AES"), new IvParameterSpec(this.f43897c));
                C8848h c8848h = new C8848h(this.f43895a, iVar);
                this.f43898d = new CipherInputStream(c8848h, cipher);
                c8848h.c();
                return -1L;
            } catch (InvalidAlgorithmParameterException | InvalidKeyException e11) {
                throw new RuntimeException(e11);
            }
        } catch (NoSuchAlgorithmException | NoSuchPaddingException e12) {
            throw new RuntimeException(e12);
        }
    }

    @Override // j3.InterfaceC7268j
    public final int read(byte[] bArr, int i11, int i12) throws IOException {
        this.f43898d.getClass();
        int read = this.f43898d.read(bArr, i11, i12);
        if (read < 0) {
            return -1;
        }
        return read;
    }
}
