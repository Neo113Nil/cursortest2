package com.instagram.common.viewpoint.core;

import com.google.common.base.Ascii;
import com.vungle.ads.internal.protos.Sdk;
import java.io.IOException;
import java.util.Arrays;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;

/* renamed from: com.facebook.ads.redexgen.X.nx, reason: case insensitive filesystem */
/* loaded from: assets/audience_network/classes2.dex */
public final class C3347nx implements CH {
    public static byte[] A08;
    public static String[] A09 = {"6Pd6msxcVNGBSX02eJXjJuTK1755qRBj", "HohFYYIoFYVFLjySAriRsbI1EyK3MfzH", "CeUiguCmFwn8TW5CDLSIDkbyI8ACimQb", "zlyrIOO0KfkMjpYTb9psfC0NNgHcfA", "hplEZcFLtp2y3xCWfrXOGnyD7Ln2K5MA", "IDL7x3RfZufseciwLxrhiUDjrsxZNied", "XKrD5ajpOT4k5Fxpc35DaF0adCV7zARl", "Sdgzg0MlhPfZZU1TENhiXzUXxxUExQMT"};
    public CG A00;
    public final AbstractC16953d A01;
    public final C17505i A02;
    public final C8B A03;
    public final C2167Me A04;
    public final Executor A05;
    public volatile AbstractRunnableFutureC17404y<Void, IOException> A06;
    public volatile boolean A07;

    public static String A01(int i, int i2, int i3) {
        byte[] copyOfRange = Arrays.copyOfRange(A08, i, i + i2);
        int i4 = 0;
        while (true) {
            int length = copyOfRange.length;
            String[] strArr = A09;
            if (strArr[5].charAt(20) == strArr[2].charAt(20)) {
                throw new RuntimeException();
            }
            String[] strArr2 = A09;
            strArr2[1] = "fxMtGUUqqO78zEEYN3IhZEPjI2AJG4xW";
            strArr2[6] = "cS7s2KNWeBHf1m4W4BuqIbsBl519HGHJ";
            if (i4 >= length) {
                return new String(copyOfRange);
            }
            copyOfRange[i4] = (byte) ((copyOfRange[i4] - i3) - 68);
            i4++;
        }
    }

    public static void A02() {
        A08 = new byte[]{Ascii.US, 34, 34, Ascii.FS, Ascii.RS, Ascii.ESC, Ascii.SI, 17, 17, Ascii.DLE, Ascii.FF, -1, 7, 9, Ascii.DLE, -1};
    }

    /* JADX WARN: Failed to parse debug info
    java.lang.ArrayIndexOutOfBoundsException
     */
    @Override // com.instagram.common.viewpoint.core.CH
    public final void A63(CG cg) throws IOException, InterruptedException {
        this.A00 = cg;
        if (0 != 0) {
            throw new NullPointerException(A01(0, 3, Sdk.SDKError.Reason.INVALID_ADS_ENDPOINT_VALUE));
        }
        boolean z = false;
        while (!z) {
            try {
                if (this.A07) {
                    break;
                }
                this.A06 = new C3348ny(this);
                if (0 != 0) {
                    throw new NullPointerException(A01(3, 7, 104));
                }
                this.A05.execute(this.A06);
                try {
                    this.A06.get();
                    z = true;
                } catch (ExecutionException e) {
                    Throwable th = (Throwable) AbstractC17143y.A01(e.getCause());
                    if (0 == 0) {
                        if (th instanceof IOException) {
                            throw ((IOException) th);
                        }
                        C5C.A11(th);
                        throw null;
                    }
                }
            } catch (Throwable th2) {
                ((AbstractRunnableFutureC17404y) AbstractC17143y.A01(this.A06)).A02();
                if (0 == 0) {
                    throw th2;
                }
                throw new NullPointerException(A01(10, 6, 86));
            }
        }
        ((AbstractRunnableFutureC17404y) AbstractC17143y.A01(this.A06)).A02();
        if (0 != 0) {
            throw new NullPointerException(A01(10, 6, 86));
        }
    }

    static {
        A02();
    }

    public C3347nx(C3479q7 c3479q7, C3146kT c3146kT, Executor executor) {
        this.A05 = (Executor) AbstractC17143y.A01(executor);
        AbstractC17143y.A01(c3479q7.A03);
        this.A02 = new C17475f().A06(c3479q7.A03.A00).A08(c3479q7.A03.A04).A02(4).A09();
        this.A03 = c3146kT.A07();
        this.A04 = new C2167Me(this.A03, this.A02, null, new InterfaceC2166Md() { // from class: com.facebook.ads.redexgen.X.nz
            @Override // com.instagram.common.viewpoint.core.InterfaceC2166Md
            public final void AFX(long j, long j2, long j3) {
                C3347nx.this.A03(j, j2, j3);
            }
        });
        this.A01 = c3146kT.A02();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void A03(long j, long j2, long j3) {
        float f;
        if (this.A00 == null) {
            return;
        }
        if (j == -1 || j == 0) {
            f = -1.0f;
        } else {
            f = (j2 * 100.0f) / j;
        }
        this.A00.AFW(j, j2, f);
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.4y != com.facebook.ads.androidx.media3.common.util.RunnableFutureTask<java.lang.Void, java.io.IOException> */
    @Override // com.instagram.common.viewpoint.core.CH
    public final void cancel() {
        this.A07 = true;
        AbstractRunnableFutureC17404y<Void, IOException> abstractRunnableFutureC17404y = this.A06;
        if (abstractRunnableFutureC17404y != null) {
            abstractRunnableFutureC17404y.cancel(true);
        }
    }

    @Override // com.instagram.common.viewpoint.core.CH
    public final void remove() {
        this.A03.A0E().AIU(this.A03.A0F().A4l(this.A02));
    }
}
