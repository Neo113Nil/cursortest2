package w4;

import com.google.android.gms.common.internal.w;
import java.io.DataInputStream;
import java.io.IOException;
import java.net.SocketTimeoutException;
import java.util.ArrayList;
import l4.x;
import l4.y;
import n4.I;
import w1.L;

/* renamed from: w4.e, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C1779e {

    /* renamed from: a, reason: collision with root package name */
    public DataInputStream f18062a;

    /* renamed from: b, reason: collision with root package name */
    public C1777c f18063b;

    /* renamed from: c, reason: collision with root package name */
    public w f18064c;

    /* renamed from: d, reason: collision with root package name */
    public byte[] f18065d;

    /* renamed from: e, reason: collision with root package name */
    public InterfaceC1775a f18066e;

    /* renamed from: f, reason: collision with root package name */
    public volatile boolean f18067f;

    public static long b(byte[] bArr) {
        return (bArr[2] << 56) + ((bArr[3] & 255) << 48) + ((bArr[4] & 255) << 40) + ((bArr[5] & 255) << 32) + ((bArr[6] & 255) << 24) + ((bArr[7] & 255) << 16) + ((bArr[8] & 255) << 8) + (bArr[9] & 255);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void a(boolean z4, byte b7, byte[] bArr) {
        C1776b c1776b;
        if (b7 == 9) {
            if (!z4) {
                throw new C1778d("PING must not fragment across frames");
            }
            if (bArr.length > 125) {
                throw new C1778d("PING frame too long");
            }
            C1777c c1777c = this.f18063b;
            synchronized (c1777c) {
                c1777c.e((byte) 10, bArr);
            }
            return;
        }
        InterfaceC1775a interfaceC1775a = this.f18066e;
        if (interfaceC1775a != null && b7 != 0) {
            throw new C1778d("Failed to continue outstanding frame");
        }
        if (interfaceC1775a == null && b7 == 0) {
            throw new C1778d("Received continuing frame, but there's nothing to continue");
        }
        if (interfaceC1775a == null) {
            if (b7 == 2) {
                I i7 = new I();
                i7.f15375b = 0;
                i7.f15374a = new ArrayList();
                c1776b = i7;
            } else {
                C1776b c1776b2 = new C1776b();
                c1776b2.f18047a = new StringBuilder();
                c1776b = c1776b2;
            }
            this.f18066e = c1776b;
        }
        if (!this.f18066e.a(bArr)) {
            throw new C1778d("Failed to decode frame");
        }
        if (z4) {
            J2.e b8 = this.f18066e.b();
            this.f18066e = null;
            w wVar = this.f18064c;
            wVar.getClass();
            String str = b8.f3813a;
            y yVar = (y) wVar.f11336c;
            if (yVar.j.r0()) {
                yVar.j.W(null, L.i("ws message: ", str), new Object[0]);
            }
            yVar.f15028i.execute(new x(0, wVar, str));
        }
    }

    public final void c() {
        byte[] bArr;
        byte b7;
        boolean z4;
        long j;
        this.f18064c = this.f18063b.f18054c;
        while (!this.f18067f) {
            try {
                this.f18062a.readFully(this.f18065d, 0, 1);
                bArr = this.f18065d;
                b7 = bArr[0];
                z4 = (b7 & 128) != 0;
            } catch (SocketTimeoutException unused) {
            } catch (IOException e7) {
                C1778d c1778d = new C1778d("IO Error", e7);
                this.f18067f = true;
                C1777c c1777c = this.f18063b;
                c1777c.f18054c.J(c1778d);
                if (c1777c.f18052a == 3) {
                    c1777c.a();
                }
                c1777c.b();
            } catch (C1778d e8) {
                this.f18067f = true;
                C1777c c1777c2 = this.f18063b;
                c1777c2.f18054c.J(e8);
                if (c1777c2.f18052a == 3) {
                    c1777c2.a();
                }
                c1777c2.b();
            }
            if ((b7 & 112) != 0) {
                throw new C1778d("Invalid frame received");
            }
            byte b8 = (byte) (b7 & 15);
            this.f18062a.readFully(bArr, 1, 1);
            byte[] bArr2 = this.f18065d;
            byte b9 = bArr2[1];
            if (b9 < 126) {
                j = b9;
            } else if (b9 == 126) {
                this.f18062a.readFully(bArr2, 2, 2);
                byte[] bArr3 = this.f18065d;
                j = ((bArr3[2] & 255) << 8) | (bArr3[3] & 255);
            } else if (b9 == Byte.MAX_VALUE) {
                this.f18062a.readFully(bArr2, 2, 8);
                j = b(this.f18065d);
            } else {
                j = 0;
            }
            int i7 = (int) j;
            byte[] bArr4 = new byte[i7];
            this.f18062a.readFully(bArr4, 0, i7);
            if (b8 == 8) {
                this.f18063b.b();
            } else if (b8 != 10) {
                if (b8 != 1 && b8 != 2 && b8 != 9 && b8 != 0) {
                    throw new C1778d("Unsupported opcode: " + ((int) b8));
                }
                a(z4, b8, bArr4);
            }
        }
    }
}
