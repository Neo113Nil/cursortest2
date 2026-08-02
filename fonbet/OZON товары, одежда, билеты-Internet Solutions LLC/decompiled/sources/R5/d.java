package R5;

import Am.C2438a;
import android.util.Log;
import androidx.annotation.NonNull;
import com.google.android.gms.fido.fido2.api.common.UserVerificationMethods;
import java.nio.BufferUnderflowException;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.Arrays;

/* loaded from: classes8.dex */
public final class d {

    /* renamed from: b, reason: collision with root package name */
    private ByteBuffer f24576b;

    /* renamed from: c, reason: collision with root package name */
    private c f24577c;

    /* renamed from: a, reason: collision with root package name */
    private final byte[] f24575a = new byte[256];

    /* renamed from: d, reason: collision with root package name */
    private int f24578d = 0;

    private boolean b() {
        return this.f24577c.f24565b != 0;
    }

    private int d() {
        try {
            return this.f24576b.get() & 255;
        } catch (Exception unused) {
            this.f24577c.f24565b = 1;
            return 0;
        }
    }

    private void e() {
        int d11 = d();
        this.f24578d = d11;
        if (d11 <= 0) {
            return;
        }
        int i11 = 0;
        int i12 = 0;
        while (true) {
            try {
                i12 = this.f24578d;
                if (i11 >= i12) {
                    return;
                }
                i12 -= i11;
                this.f24576b.get(this.f24575a, i11, i12);
                i11 += i12;
            } catch (Exception e11) {
                if (Log.isLoggable("GifHeaderParser", 3)) {
                    StringBuilder a11 = C2438a.a("Error Reading Block n: ", i11, " count: ", " blockSize: ", i12);
                    a11.append(this.f24578d);
                    Log.d("GifHeaderParser", a11.toString(), e11);
                }
                this.f24577c.f24565b = 1;
                return;
            }
        }
    }

    private int[] f(int i11) {
        byte[] bArr = new byte[i11 * 3];
        int[] iArr = null;
        try {
            this.f24576b.get(bArr);
            iArr = new int[256];
            int i12 = 0;
            int i13 = 0;
            while (i12 < i11) {
                int i14 = bArr[i13] & 255;
                int i15 = i13 + 2;
                int i16 = bArr[i13 + 1] & 255;
                i13 += 3;
                int i17 = i12 + 1;
                iArr[i12] = (i16 << 8) | (i14 << 16) | (-16777216) | (bArr[i15] & 255);
                i12 = i17;
            }
            return iArr;
        } catch (BufferUnderflowException e11) {
            if (Log.isLoggable("GifHeaderParser", 3)) {
                Log.d("GifHeaderParser", "Format Error Reading Color Table", e11);
            }
            this.f24577c.f24565b = 1;
            return iArr;
        }
    }

    private void h() {
        int d11;
        do {
            d11 = d();
            this.f24576b.position(Math.min(this.f24576b.position() + d11, this.f24576b.limit()));
        } while (d11 > 0);
    }

    public final void a() {
        this.f24576b = null;
        this.f24577c = null;
    }

    @NonNull
    public final c c() {
        byte[] bArr;
        if (this.f24576b == null) {
            throw new IllegalStateException("You must call setData() before parseHeader()");
        }
        if (b()) {
            return this.f24577c;
        }
        StringBuilder sb2 = new StringBuilder();
        for (int i11 = 0; i11 < 6; i11++) {
            sb2.append((char) d());
        }
        if (sb2.toString().startsWith("GIF")) {
            this.f24577c.f24569f = this.f24576b.getShort();
            this.f24577c.f24570g = this.f24576b.getShort();
            int d11 = d();
            c cVar = this.f24577c;
            cVar.f24571h = (d11 & UserVerificationMethods.USER_VERIFY_PATTERN) != 0;
            cVar.f24572i = (int) Math.pow(2.0d, (d11 & 7) + 1);
            this.f24577c.f24573j = d();
            c cVar2 = this.f24577c;
            d();
            cVar2.getClass();
            if (this.f24577c.f24571h && !b()) {
                c cVar3 = this.f24577c;
                cVar3.f24564a = f(cVar3.f24572i);
                c cVar4 = this.f24577c;
                cVar4.f24574k = cVar4.f24564a[cVar4.f24573j];
            }
        } else {
            this.f24577c.f24565b = 1;
        }
        if (!b()) {
            boolean z11 = false;
            while (!z11 && !b() && this.f24577c.f24566c <= Integer.MAX_VALUE) {
                int d12 = d();
                if (d12 == 33) {
                    int d13 = d();
                    if (d13 == 1) {
                        h();
                    } else if (d13 == 249) {
                        this.f24577c.f24567d = new b();
                        d();
                        int d14 = d();
                        b bVar = this.f24577c.f24567d;
                        int i12 = (d14 & 28) >> 2;
                        bVar.f24559g = i12;
                        if (i12 == 0) {
                            bVar.f24559g = 1;
                        }
                        bVar.f24558f = (d14 & 1) != 0;
                        short s11 = this.f24576b.getShort();
                        if (s11 < 2) {
                            s11 = 10;
                        }
                        b bVar2 = this.f24577c.f24567d;
                        bVar2.f24561i = s11 * 10;
                        bVar2.f24560h = d();
                        d();
                    } else if (d13 == 254) {
                        h();
                    } else if (d13 != 255) {
                        h();
                    } else {
                        e();
                        StringBuilder sb3 = new StringBuilder();
                        int i13 = 0;
                        while (true) {
                            bArr = this.f24575a;
                            if (i13 >= 11) {
                                break;
                            }
                            sb3.append((char) bArr[i13]);
                            i13++;
                        }
                        if (sb3.toString().equals("NETSCAPE2.0")) {
                            do {
                                e();
                                if (bArr[0] == 1) {
                                    byte b11 = bArr[1];
                                    byte b12 = bArr[2];
                                    this.f24577c.getClass();
                                }
                                if (this.f24578d > 0) {
                                }
                            } while (!b());
                        } else {
                            h();
                        }
                    }
                } else if (d12 == 44) {
                    c cVar5 = this.f24577c;
                    if (cVar5.f24567d == null) {
                        cVar5.f24567d = new b();
                    }
                    this.f24577c.f24567d.f24553a = this.f24576b.getShort();
                    this.f24577c.f24567d.f24554b = this.f24576b.getShort();
                    this.f24577c.f24567d.f24555c = this.f24576b.getShort();
                    this.f24577c.f24567d.f24556d = this.f24576b.getShort();
                    int d15 = d();
                    boolean z12 = (d15 & UserVerificationMethods.USER_VERIFY_PATTERN) != 0;
                    int pow = (int) Math.pow(2.0d, (d15 & 7) + 1);
                    b bVar3 = this.f24577c.f24567d;
                    bVar3.f24557e = (d15 & 64) != 0;
                    if (z12) {
                        bVar3.f24563k = f(pow);
                    } else {
                        bVar3.f24563k = null;
                    }
                    this.f24577c.f24567d.f24562j = this.f24576b.position();
                    d();
                    h();
                    if (!b()) {
                        c cVar6 = this.f24577c;
                        cVar6.f24566c++;
                        cVar6.f24568e.add(cVar6.f24567d);
                    }
                } else if (d12 != 59) {
                    this.f24577c.f24565b = 1;
                } else {
                    z11 = true;
                }
            }
            c cVar7 = this.f24577c;
            if (cVar7.f24566c < 0) {
                cVar7.f24565b = 1;
            }
        }
        return this.f24577c;
    }

    public final void g(@NonNull ByteBuffer byteBuffer) {
        this.f24576b = null;
        Arrays.fill(this.f24575a, (byte) 0);
        this.f24577c = new c();
        this.f24578d = 0;
        ByteBuffer asReadOnlyBuffer = byteBuffer.asReadOnlyBuffer();
        this.f24576b = asReadOnlyBuffer;
        asReadOnlyBuffer.position(0);
        this.f24576b.order(ByteOrder.LITTLE_ENDIAN);
    }
}
