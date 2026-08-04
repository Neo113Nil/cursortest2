package p158w4;

import com.google.android.gms.common.internal.w;
import java.io.DataInputStream;
import java.io.IOException;
import java.net.SocketTimeoutException;
import java.util.ArrayList;
import p083l4.x;
import p083l4.y;
import p098n4.I;
import p155w1.L;

/* JADX INFO: loaded from: classes2.dex */
public final class e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public DataInputStream f18068a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public c f18069b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public w f18070c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public byte[] f18071d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public a f18072e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public volatile boolean f18073f;

    public static long b(byte[] bArr) {
        return (((long) bArr[2]) << 56) + (((long) (bArr[3] & 255)) << 48) + (((long) (bArr[4] & 255)) << 40) + (((long) (bArr[5] & 255)) << 32) + (((long) (bArr[6] & 255)) << 24) + ((long) ((bArr[7] & 255) << 16)) + ((long) ((bArr[8] & 255) << 8)) + ((long) (bArr[9] & 255));
    }

    public final void a(boolean z4, byte b7, byte[] bArr) {
        a aVar;
        if (b7 == 9) {
            if (!z4) {
                throw new d("PING must not fragment across frames");
            }
            if (bArr.length > 125) {
                throw new d("PING frame too long");
            }
            c cVar = this.f18069b;
            synchronized (cVar) {
                cVar.e((byte) 10, bArr);
            }
            return;
        }
        a aVar2 = this.f18072e;
        if (aVar2 != null && b7 != 0) {
            throw new d("Failed to continue outstanding frame");
        }
        if (aVar2 == null && b7 == 0) {
            throw new d("Received continuing frame, but there's nothing to continue");
        }
        if (aVar2 == null) {
            if (b7 == 2) {
                I i7 = new I();
                i7.f15381b = 0;
                i7.f15380a = new ArrayList();
                aVar = i7;
            } else {
                b bVar = new b();
                bVar.f18053a = new StringBuilder();
                aVar = bVar;
            }
            this.f18072e = aVar;
        }
        if (!this.f18072e.a(bArr)) {
            throw new d("Failed to decode frame");
        }
        if (z4) {
            J2.e eVarB = this.f18072e.b();
            this.f18072e = null;
            w wVar = this.f18070c;
            wVar.getClass();
            String str = eVarB.f3813a;
            y yVar = (y) wVar.f11336c;
            if (yVar.j.r0()) {
                yVar.j.W(null, L.i("ws message: ", str), new Object[0]);
            }
            yVar.f15034i.execute(new x(0, wVar, str));
        }
    }

    public final void c() {
        long jB;
        this.f18070c = this.f18069b.f18060c;
        while (!this.f18073f) {
            try {
                this.f18068a.readFully(this.f18071d, 0, 1);
                byte[] bArr = this.f18071d;
                byte b7 = bArr[0];
                boolean z4 = (b7 & 128) != 0;
                if ((b7 & 112) != 0) {
                    throw new d("Invalid frame received");
                }
                byte b8 = (byte) (b7 & 15);
                this.f18068a.readFully(bArr, 1, 1);
                byte[] bArr2 = this.f18071d;
                byte b9 = bArr2[1];
                if (b9 < 126) {
                    jB = b9;
                } else if (b9 == 126) {
                    this.f18068a.readFully(bArr2, 2, 2);
                    byte[] bArr3 = this.f18071d;
                    jB = (((long) (bArr3[2] & 255)) << 8) | ((long) (bArr3[3] & 255));
                } else if (b9 == 127) {
                    this.f18068a.readFully(bArr2, 2, 8);
                    jB = b(this.f18071d);
                } else {
                    jB = 0;
                }
                int i7 = (int) jB;
                byte[] bArr4 = new byte[i7];
                this.f18068a.readFully(bArr4, 0, i7);
                if (b8 == 8) {
                    this.f18069b.b();
                } else if (b8 != 10) {
                    if (b8 != 1 && b8 != 2 && b8 != 9 && b8 != 0) {
                        throw new d("Unsupported opcode: " + ((int) b8));
                    }
                    a(z4, b8, bArr4);
                }
            } catch (SocketTimeoutException unused) {
            } catch (IOException e7) {
                d dVar = new d("IO Error", e7);
                this.f18073f = true;
                c cVar = this.f18069b;
                cVar.f18060c.J(dVar);
                if (cVar.f18058a == 3) {
                    cVar.a();
                }
                cVar.b();
            } catch (d e8) {
                this.f18073f = true;
                c cVar2 = this.f18069b;
                cVar2.f18060c.J(e8);
                if (cVar2.f18058a == 3) {
                    cVar2.a();
                }
                cVar2.b();
            }
        }
    }
}
