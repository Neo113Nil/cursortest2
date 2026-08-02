package p000;

import android.util.Log;
import java.nio.BufferUnderflowException;
import java.nio.ByteBuffer;

/* JADX INFO: compiled from: r8-map-id-738170b7fb69b873ed7524d5270c8e05c6f5fb40ea1ade7a72c8ed7a70699269 */
/* JADX INFO: loaded from: classes.dex */
public final class j80 {

    /* JADX INFO: renamed from: b */
    public ByteBuffer f3849b;

    /* JADX INFO: renamed from: c */
    public i80 f3850c;

    /* JADX INFO: renamed from: a */
    public final byte[] f3848a = new byte[256];

    /* JADX INFO: renamed from: d */
    public int f3851d = 0;

    /* JADX INFO: renamed from: a */
    public final boolean m2826a() {
        return this.f3850c.f3464b != 0;
    }

    /* JADX INFO: renamed from: b */
    public final i80 m2827b() {
        byte[] bArr;
        if (this.f3849b == null) {
            C0270h1.m2191g("You must call setData() before parseHeader()");
            return null;
        }
        if (m2826a()) {
            return this.f3850c;
        }
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < 6; i++) {
            sb.append((char) m2828c());
        }
        boolean zStartsWith = sb.toString().startsWith("GIF");
        i80 i80Var = this.f3850c;
        if (zStartsWith) {
            i80Var.f3468f = this.f3849b.getShort();
            this.f3850c.f3469g = this.f3849b.getShort();
            int iM2828c = m2828c();
            i80 i80Var2 = this.f3850c;
            i80Var2.f3470h = (iM2828c & 128) != 0;
            i80Var2.f3471i = (int) Math.pow(2.0d, (iM2828c & 7) + 1);
            this.f3850c.f3472j = m2828c();
            i80 i80Var3 = this.f3850c;
            m2828c();
            i80Var3.getClass();
            if (this.f3850c.f3470h && !m2826a()) {
                i80 i80Var4 = this.f3850c;
                i80Var4.f3463a = m2830e(i80Var4.f3471i);
                i80 i80Var5 = this.f3850c;
                i80Var5.f3473k = i80Var5.f3463a[i80Var5.f3472j];
            }
        } else {
            i80Var.f3464b = 1;
        }
        if (!m2826a()) {
            boolean z = false;
            while (!z && !m2826a() && this.f3850c.f3465c <= Integer.MAX_VALUE) {
                int iM2828c2 = m2828c();
                if (iM2828c2 == 33) {
                    int iM2828c3 = m2828c();
                    if (iM2828c3 == 1) {
                        m2831f();
                    } else if (iM2828c3 == 249) {
                        this.f3850c.f3466d = new e80();
                        m2828c();
                        int iM2828c4 = m2828c();
                        e80 e80Var = this.f3850c.f3466d;
                        int i2 = (iM2828c4 & 28) >> 2;
                        e80Var.f2003g = i2;
                        if (i2 == 0) {
                            e80Var.f2003g = 1;
                        }
                        e80Var.f2002f = (iM2828c4 & 1) != 0;
                        short s = this.f3849b.getShort();
                        if (s < 2) {
                            s = 10;
                        }
                        e80 e80Var2 = this.f3850c.f3466d;
                        e80Var2.f2005i = s * 10;
                        e80Var2.f2004h = m2828c();
                        m2828c();
                    } else if (iM2828c3 == 254) {
                        m2831f();
                    } else if (iM2828c3 != 255) {
                        m2831f();
                    } else {
                        m2829d();
                        StringBuilder sb2 = new StringBuilder();
                        int i3 = 0;
                        while (true) {
                            bArr = this.f3848a;
                            if (i3 >= 11) {
                                break;
                            }
                            sb2.append((char) bArr[i3]);
                            i3++;
                        }
                        if (sb2.toString().equals("NETSCAPE2.0")) {
                            do {
                                m2829d();
                                if (bArr[0] == 1) {
                                    byte b = bArr[1];
                                    byte b2 = bArr[2];
                                    this.f3850c.getClass();
                                }
                                if (this.f3851d <= 0) {
                                    break;
                                }
                            } while (!m2826a());
                        } else {
                            m2831f();
                        }
                    }
                } else if (iM2828c2 == 44) {
                    i80 i80Var6 = this.f3850c;
                    if (i80Var6.f3466d == null) {
                        i80Var6.f3466d = new e80();
                    }
                    i80Var6.f3466d.f1997a = this.f3849b.getShort();
                    this.f3850c.f3466d.f1998b = this.f3849b.getShort();
                    this.f3850c.f3466d.f1999c = this.f3849b.getShort();
                    this.f3850c.f3466d.f2000d = this.f3849b.getShort();
                    int iM2828c5 = m2828c();
                    boolean z2 = (iM2828c5 & 128) != 0;
                    int iPow = (int) Math.pow(2.0d, (iM2828c5 & 7) + 1);
                    e80 e80Var3 = this.f3850c.f3466d;
                    e80Var3.f2001e = (iM2828c5 & 64) != 0;
                    if (z2) {
                        e80Var3.f2007k = m2830e(iPow);
                    } else {
                        e80Var3.f2007k = null;
                    }
                    this.f3850c.f3466d.f2006j = this.f3849b.position();
                    m2828c();
                    m2831f();
                    if (!m2826a()) {
                        i80 i80Var7 = this.f3850c;
                        i80Var7.f3465c++;
                        i80Var7.f3467e.add(i80Var7.f3466d);
                    }
                } else if (iM2828c2 != 59) {
                    this.f3850c.f3464b = 1;
                } else {
                    z = true;
                }
            }
            i80 i80Var8 = this.f3850c;
            if (i80Var8.f3465c < 0) {
                i80Var8.f3464b = 1;
            }
        }
        return this.f3850c;
    }

    /* JADX INFO: renamed from: c */
    public final int m2828c() {
        try {
            return this.f3849b.get() & 255;
        } catch (Exception unused) {
            this.f3850c.f3464b = 1;
            return 0;
        }
    }

    /* JADX INFO: renamed from: d */
    public final void m2829d() {
        int iM2828c = m2828c();
        this.f3851d = iM2828c;
        if (iM2828c <= 0) {
            return;
        }
        int i = 0;
        int i2 = 0;
        while (true) {
            try {
                int i3 = this.f3851d;
                if (i >= i3) {
                    return;
                }
                i2 = i3 - i;
                this.f3849b.get(this.f3848a, i, i2);
                i += i2;
            } catch (Exception e) {
                if (Log.isLoggable("GifHeaderParser", 3)) {
                    Log.d("GifHeaderParser", "Error Reading Block n: " + i + " count: " + i2 + " blockSize: " + this.f3851d, e);
                }
                this.f3850c.f3464b = 1;
                return;
            }
        }
    }

    /* JADX INFO: renamed from: e */
    public final int[] m2830e(int i) {
        byte[] bArr = new byte[i * 3];
        int[] iArr = null;
        try {
            this.f3849b.get(bArr);
            iArr = new int[256];
            int i2 = 0;
            int i3 = 0;
            while (i2 < i) {
                int i4 = bArr[i3] & 255;
                int i5 = i3 + 2;
                int i6 = bArr[i3 + 1] & 255;
                i3 += 3;
                int i7 = i2 + 1;
                iArr[i2] = (i6 << 8) | (i4 << 16) | (-16777216) | (bArr[i5] & 255);
                i2 = i7;
            }
            return iArr;
        } catch (BufferUnderflowException e) {
            if (Log.isLoggable("GifHeaderParser", 3)) {
                Log.d("GifHeaderParser", "Format Error Reading Color Table", e);
            }
            this.f3850c.f3464b = 1;
            return iArr;
        }
    }

    /* JADX INFO: renamed from: f */
    public final void m2831f() {
        int iM2828c;
        do {
            iM2828c = m2828c();
            this.f3849b.position(Math.min(this.f3849b.position() + iM2828c, this.f3849b.limit()));
        } while (iM2828c > 0);
    }
}
