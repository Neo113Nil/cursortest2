package com.facebook.ads.redexgen.core;

/* renamed from: com.facebook.ads.redexgen.X.o0, reason: case insensitive filesystem */
/* loaded from: assets/audience_network/classes2.dex */
public class C2056o0 extends java.lang.Thread implements com.facebook.ads.redexgen.core.CG {
    public static java.lang.String[] A09 = {"WULC9DYlvQgZjojDU2bdZ9xs7wQbeGsA", "0RzPpdpgLbDOZ8gUAj9sr", "fywSSsB8oN823aa6hQ2avodpE9Fj6EUo", "rQ4mhJZFramri", "thNzrz2pgMkLR", "sKcdOZc1ZRugYqEHWVRtFgFPdRxve1CE", "006dlWDsgbMi7GTsUIBgGpVxQZYkiOjN", "1EnGqdZRllbwfzBFLuDlK"};
    public long A00;
    public java.lang.Exception A01;
    public final int A02;
    public final com.facebook.ads.redexgen.core.C6 A03;
    public final com.facebook.ads.androidx.media3.exoplayer.offline.DownloadRequest A04;
    public final com.facebook.ads.redexgen.core.CH A05;
    public final boolean A06;
    public volatile com.facebook.ads.redexgen.core.C2 A07;
    public volatile boolean A08;

    public C2056o0(com.facebook.ads.androidx.media3.exoplayer.offline.DownloadRequest downloadRequest, com.facebook.ads.redexgen.core.CH ch, com.facebook.ads.redexgen.core.C6 c6, boolean z, int i, com.facebook.ads.redexgen.core.C2 c2) {
        this.A04 = downloadRequest;
        this.A05 = ch;
        this.A03 = c6;
        this.A06 = z;
        this.A02 = i;
        this.A07 = c2;
        this.A00 = -1L;
    }

    public static int A00(int i) {
        return java.lang.Math.min((i - 1) * 1000, 5000);
    }

    public final void A05(boolean z) {
        if (z) {
            this.A07 = null;
        }
        if (!this.A08) {
            this.A08 = true;
            this.A05.cancel();
            if (A09[5].charAt(29) == 'B') {
                throw new java.lang.RuntimeException();
            }
            A09[5] = "eeNE7Qy6MuAlBYtV44JqSUiJf46fCooo";
            interrupt();
        }
    }

    @Override // com.facebook.ads.redexgen.core.CG
    public final void AFW(long j, long j2, float f) {
        this.A03.A01 = j2;
        this.A03.A00 = f;
        if (j != this.A00) {
            this.A00 = j;
            com.facebook.ads.redexgen.core.C2 c2 = this.A07;
            if (c2 != null) {
                c2.obtainMessage(10, (int) (j >> 32), (int) j, this).sendToTarget();
            }
        }
    }

    @Override // java.lang.Thread, java.lang.Runnable
    public final void run() {
        if (com.facebook.ads.redexgen.core.WU.A02(this)) {
            return;
        }
        try {
            try {
                if (this.A06) {
                    this.A05.remove();
                } else {
                    int i = 0;
                    long j = -1;
                    while (!this.A08) {
                        try {
                            this.A05.A63(this);
                            break;
                        } catch (java.io.IOException e) {
                            if (!this.A08) {
                                long j2 = this.A03.A01;
                                int errorCount = A09[2].charAt(8);
                                if (errorCount != 71) {
                                    java.lang.String[] strArr = A09;
                                    strArr[0] = "VpOvMV7lY4vr3Fu5UlYiKKcH9ACGqt7g";
                                    strArr[6] = "gAlRMyi1pPzVqBLwURYLCrt7UwpliGsz";
                                    if (j2 != j) {
                                        j = j2;
                                        i = 0;
                                    }
                                    i++;
                                    if (i <= this.A02) {
                                        java.lang.Thread.sleep(A00(i));
                                    } else {
                                        throw e;
                                    }
                                } else {
                                    throw new java.lang.RuntimeException();
                                }
                            }
                        }
                    }
                }
            } catch (java.lang.Throwable th) {
                com.facebook.ads.redexgen.core.WU.A00(th, this);
                if (A09[5].charAt(29) == 'B') {
                    throw new java.lang.RuntimeException();
                }
                java.lang.String[] strArr2 = A09;
                strArr2[0] = "35cAsSHzLcpGFjLAU34RIcGdZnNZcSm1";
                strArr2[6] = "9oN8QLA5AyCkKiMzUX6AKpAi6mTPSF3S";
                return;
            }
        } catch (java.lang.InterruptedException unused) {
            java.lang.Thread.currentThread().interrupt();
        } catch (java.lang.Exception e2) {
            this.A01 = e2;
        }
        android.os.Handler internalHandler = this.A07;
        if (internalHandler != null) {
            internalHandler.obtainMessage(9, this).sendToTarget();
        }
    }
}
