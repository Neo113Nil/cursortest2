package p000;

import java.io.Closeable;
import java.io.IOException;
import java.util.Locale;
import java.util.logging.Level;
import java.util.logging.Logger;

/* JADX INFO: renamed from: m8 */
/* JADX INFO: compiled from: r8-map-id-738170b7fb69b873ed7524d5270c8e05c6f5fb40ea1ade7a72c8ed7a70699269 */
/* JADX INFO: loaded from: classes.dex */
public final class C0461m8 implements Closeable {

    /* JADX INFO: renamed from: j */
    public final nb0 f4998j;

    /* JADX INFO: renamed from: k */
    public final /* synthetic */ C0535o8 f4999k;

    public C0461m8(C0535o8 c0535o8, nb0 nb0Var) {
        this.f4999k = c0535o8;
        this.f4998j = nb0Var;
    }

    /* JADX INFO: renamed from: a */
    public final void m3332a(C0678s3 c0678s3) {
        this.f4999k.f5660u++;
        nb0 nb0Var = this.f4998j;
        synchronized (nb0Var) {
            if (nb0Var.f5359n) {
                throw new IOException("closed");
            }
            int i = nb0Var.f5358m;
            if ((c0678s3.f7021j & 32) != 0) {
                i = ((int[]) c0678s3.f7022k)[5];
            }
            nb0Var.f5358m = i;
            nb0Var.m3511a(0, 0, (byte) 4, (byte) 1);
            nb0Var.f5355j.flush();
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        this.f4998j.close();
    }

    /* JADX INFO: renamed from: e */
    public final void m3333e() {
        nb0 nb0Var = this.f4998j;
        synchronized (nb0Var) {
            try {
                if (nb0Var.f5359n) {
                    throw new IOException("closed");
                }
                Logger logger = ob0.f5688a;
                if (logger.isLoggable(Level.FINE)) {
                    logger.fine(">> CONNECTION " + ob0.f5689b.mo2557c());
                }
                nb0Var.f5355j.m1552e(ob0.f5689b.mo2563j());
                nb0Var.f5355j.flush();
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void flush() {
        nb0 nb0Var = this.f4998j;
        synchronized (nb0Var) {
            if (nb0Var.f5359n) {
                throw new IOException("closed");
            }
            nb0Var.f5355j.flush();
        }
    }

    /* JADX INFO: renamed from: i */
    public final void m3334i(EnumC0227fx enumC0227fx, byte[] bArr) {
        nb0 nb0Var = this.f4998j;
        synchronized (nb0Var) {
            try {
                if (nb0Var.f5359n) {
                    throw new IOException("closed");
                }
                if (enumC0227fx.f2527j == -1) {
                    Locale locale = Locale.US;
                    throw new IllegalArgumentException("errorCode.httpCode == -1");
                }
                nb0Var.m3511a(0, bArr.length + 8, (byte) 7, (byte) 0);
                nb0Var.f5355j.m1555j(0);
                nb0Var.f5355j.m1555j(enumC0227fx.f2527j);
                if (bArr.length > 0) {
                    nb0Var.f5355j.m1552e(bArr);
                }
                nb0Var.f5355j.flush();
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* JADX INFO: renamed from: j */
    public final void m3335j(int i, int i2, boolean z) {
        if (z) {
            this.f4999k.f5660u++;
        }
        nb0 nb0Var = this.f4998j;
        synchronized (nb0Var) {
            if (nb0Var.f5359n) {
                throw new IOException("closed");
            }
            nb0Var.m3511a(0, 8, (byte) 6, z ? (byte) 1 : (byte) 0);
            nb0Var.f5355j.m1555j(i);
            nb0Var.f5355j.m1555j(i2);
            nb0Var.f5355j.flush();
        }
    }

    /* JADX INFO: renamed from: l */
    public final void m3336l(int i, EnumC0227fx enumC0227fx) {
        this.f4999k.f5660u++;
        nb0 nb0Var = this.f4998j;
        synchronized (nb0Var) {
            if (nb0Var.f5359n) {
                throw new IOException("closed");
            }
            if (enumC0227fx.f2527j == -1) {
                throw new IllegalArgumentException();
            }
            nb0Var.m3511a(i, 4, (byte) 3, (byte) 0);
            nb0Var.f5355j.m1555j(enumC0227fx.f2527j);
            nb0Var.f5355j.flush();
        }
    }

    /* JADX INFO: renamed from: m */
    public final void m3337m(C0678s3 c0678s3) {
        int i;
        nb0 nb0Var = this.f4998j;
        synchronized (nb0Var) {
            try {
                if (nb0Var.f5359n) {
                    throw new IOException("closed");
                }
                int i2 = 0;
                nb0Var.m3511a(0, Integer.bitCount(c0678s3.f7021j) * 6, (byte) 4, (byte) 0);
                while (i2 < 10) {
                    if (c0678s3.m4472b(i2)) {
                        if (i2 == 4) {
                            i = 3;
                        } else {
                            i = i2 == 7 ? 4 : i2;
                        }
                        f01 f01Var = nb0Var.f5355j;
                        if (f01Var.f2226l) {
                            throw new IllegalStateException("closed");
                        }
                        C0539oc c0539oc = f01Var.f2225k;
                        f61 f61VarM3677r = c0539oc.m3677r(2);
                        byte[] bArr = f61VarM3677r.f2319a;
                        int i3 = f61VarM3677r.f2321c;
                        bArr[i3] = (byte) ((i >>> 8) & 255);
                        bArr[i3 + 1] = (byte) (i & 255);
                        f61VarM3677r.f2321c = i3 + 2;
                        c0539oc.f5698k += 2;
                        f01Var.m1551a();
                        nb0Var.f5355j.m1555j(((int[]) c0678s3.f7022k)[i2]);
                    }
                    i2++;
                }
                nb0Var.f5355j.flush();
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* JADX INFO: renamed from: o */
    public final void m3338o(int i, long j) {
        nb0 nb0Var = this.f4998j;
        synchronized (nb0Var) {
            if (nb0Var.f5359n) {
                throw new IOException("closed");
            }
            if (j == 0 || j > 2147483647L) {
                Locale locale = Locale.US;
                throw new IllegalArgumentException("windowSizeIncrement == 0 || windowSizeIncrement > 0x7fffffffL: " + j);
            }
            nb0Var.m3511a(i, 4, (byte) 8, (byte) 0);
            nb0Var.f5355j.m1555j((int) j);
            nb0Var.f5355j.flush();
        }
    }
}
