package U5;

import W5.C0492c1;
import W5.C0545u1;
import java.io.InputStream;
import java.io.OutputStream;
import java.nio.ByteBuffer;
import java.security.cert.Certificate;
import java.util.Arrays;
import java.util.List;
import java.util.logging.Level;
import java.util.zip.GZIPInputStream;
import java.util.zip.GZIPOutputStream;
import javax.net.ssl.SSLPeerUnverifiedException;
import javax.net.ssl.SSLSession;

/* JADX INFO: renamed from: U5.j, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C0443j implements InterfaceC0444k, a0, j0, X {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final C0443j f6510b = new C0443j(0);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final byte[] f6511c = {48, 49, 50, 51, 52, 53, 54, 55, 56, 57, 65, 66, 67, 68, 69, 70};

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f6512a;

    public /* synthetic */ C0443j(int i7) {
        this.f6512a = i7;
    }

    @Override // U5.X
    public String a(Object obj) {
        return (String) obj;
    }

    @Override // U5.j0
    public boolean b(Object obj) {
        switch (this.f6512a) {
            case 6:
                return ((O) obj).c();
            case 7:
                return ((T) obj).b();
            default:
                return ((g0) obj).b();
        }
    }

    @Override // U5.j0
    public int c(Object obj) {
        switch (this.f6512a) {
            case 6:
                return ((O) obj).b();
            case 7:
                return ((T) obj).c();
            default:
                return ((g0) obj).c();
        }
    }

    @Override // U5.InterfaceC0444k
    public String d() {
        switch (this.f6512a) {
            case 0:
                return "identity";
            default:
                return "gzip";
        }
    }

    @Override // U5.a0
    public Object f(byte[] bArr) {
        int i7;
        byte b7;
        switch (this.f6512a) {
            case 1:
                for (int i8 = 0; i8 < bArr.length; i8++) {
                    byte b8 = bArr[i8];
                    if (b8 < 32 || b8 >= 126 || (b8 == 37 && i8 + 2 < bArr.length)) {
                        ByteBuffer byteBufferAllocate = ByteBuffer.allocate(bArr.length);
                        int i9 = 0;
                        while (i9 < bArr.length) {
                            if (bArr[i9] == 37 && i9 + 2 < bArr.length) {
                                try {
                                    byteBufferAllocate.put((byte) Integer.parseInt(new String(bArr, i9 + 1, 2, D3.f.f1717a), 16));
                                    i9 += 3;
                                } catch (NumberFormatException unused) {
                                    byteBufferAllocate.put(bArr[i9]);
                                    i9++;
                                }
                            }
                            byteBufferAllocate.put(bArr[i9]);
                            i9++;
                        }
                        return new String(byteBufferAllocate.array(), 0, byteBufferAllocate.position(), D3.f.f1719c);
                    }
                }
                return new String(bArr, 0);
            default:
                char c3 = 0;
                if (bArr.length == 1 && bArr[0] == 48) {
                    return l0.f6536e;
                }
                int length = bArr.length;
                if (length != 1) {
                    if (length == 2 && (b7 = bArr[0]) >= 48 && b7 <= 57) {
                        i7 = (b7 - 48) * 10;
                        c3 = 1;
                    }
                    return l0.f6538g.g("Unknown code ".concat(new String(bArr, D3.f.f1717a)));
                }
                i7 = 0;
                byte b9 = bArr[c3];
                if (b9 >= 48 && b9 <= 57) {
                    int i10 = (b9 - 48) + i7;
                    List list = l0.f6535d;
                    if (i10 < list.size()) {
                        return (l0) list.get(i10);
                    }
                }
                return l0.f6538g.g("Unknown code ".concat(new String(bArr, D3.f.f1717a)));
        }
    }

    @Override // U5.InterfaceC0444k
    public OutputStream g(C0492c1 c0492c1) {
        switch (this.f6512a) {
            case 0:
                return c0492c1;
            default:
                return new GZIPOutputStream(c0492c1);
        }
    }

    @Override // U5.InterfaceC0444k
    public InputStream h(C0545u1 c0545u1) {
        switch (this.f6512a) {
            case 0:
                return c0545u1;
            default:
                return new GZIPInputStream(c0545u1);
        }
    }

    public String toString() {
        switch (this.f6512a) {
            case 5:
                return "internal:health-check-consumer-listener";
            default:
                return super.toString();
        }
    }

    public C0443j(SSLSession sSLSession) {
        this.f6512a = 4;
        sSLSession.getCipherSuite();
        Certificate[] localCertificates = sSLSession.getLocalCertificates();
        if (localCertificates != null) {
            Certificate certificate = localCertificates[0];
        }
        try {
            Certificate[] peerCertificates = sSLSession.getPeerCertificates();
            if (peerCertificates != null) {
                Certificate certificate2 = peerCertificates[0];
            }
        } catch (SSLPeerUnverifiedException e7) {
            C.f6411d.log(Level.FINE, "Peer cert not available for peerHost=" + sSLSession.getPeerHost(), (Throwable) e7);
        }
    }

    @Override // U5.a0
    /* JADX INFO: renamed from: a, reason: collision with other method in class */
    public byte[] mo0a(Object obj) {
        switch (this.f6512a) {
            case 1:
                byte[] bytes = ((String) obj).getBytes(D3.f.f1719c);
                int i7 = 0;
                while (i7 < bytes.length) {
                    byte b7 = bytes[i7];
                    if (b7 < 32 || b7 >= 126 || b7 == 37) {
                        byte[] bArr = new byte[((bytes.length - i7) * 3) + i7];
                        if (i7 != 0) {
                            System.arraycopy(bytes, 0, bArr, 0, i7);
                        }
                        int i8 = i7;
                        while (i7 < bytes.length) {
                            byte b8 = bytes[i7];
                            if (b8 < 32 || b8 >= 126 || b8 == 37) {
                                bArr[i8] = 37;
                                byte[] bArr2 = f6511c;
                                bArr[i8 + 1] = bArr2[(b8 >> 4) & 15];
                                bArr[i8 + 2] = bArr2[b8 & 15];
                                i8 += 3;
                            } else {
                                bArr[i8] = b8;
                                i8++;
                            }
                            i7++;
                        }
                        return Arrays.copyOf(bArr, i8);
                    }
                    i7++;
                }
                return bytes;
            default:
                return ((l0) obj).f6547a.f6532b;
        }
    }

    @Override // U5.X
    public Object e(String str) {
        return str;
    }
}
