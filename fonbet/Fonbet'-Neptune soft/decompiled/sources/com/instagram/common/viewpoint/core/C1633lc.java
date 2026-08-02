package com.instagram.common.viewpoint.core;

import android.os.Looper;
import android.os.SystemClock;
import com.facebook.video.heroplayer.exocustom.MetaExoPlayerCustomization;
import com.google.common.base.Ascii;
import java.io.IOException;
import java.util.Arrays;
import java.util.concurrent.ExecutorService;

/* renamed from: com.facebook.ads.redexgen.X.lc, reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public final class C1633lc {
    public static byte[] A03;
    public static String[] A04 = {"unLJAGqnT9K2C6pR52hzklfZHwTRg6Yr", "LeSEUls9Myr0akOYyr4ALINYOEymKOkL", "W8GYPv6JCblyMHrg4mb8qhrlE9HlP5p8", "LeDDfwbzgRXTDhaT1cwFWvWAB6ITTWPz", "taf7WKL89SeyG6P6BerDozU5lBYArJ2v", "", "BSTJObkWS6NqTAYjIRk7bCGrxc9Lgut2", "ohz3nwuOVveogY5495fLWWA936p3Bkwf"};
    public static final C0393Eh A05;
    public static final C0393Eh A06;
    public static final C0393Eh A07;
    public static final C0393Eh A08;
    public HandlerC0394Ei<? extends InterfaceC0395Ej> A00;
    public IOException A01;
    public final InterfaceExecutorC0411Ez A02;

    public static String A06(int i, int i2, int i3) {
        byte[] copyOfRange = Arrays.copyOfRange(A03, i, i + i2);
        for (int i4 = 0; i4 < copyOfRange.length; i4++) {
            copyOfRange[i4] = (byte) ((copyOfRange[i4] ^ i3) ^ 59);
        }
        return new String(copyOfRange);
    }

    public static void A07() {
        A03 = new byte[]{62, 3, Ascii.DC4, 43, Ascii.ETB, Ascii.SUB, 2, Ascii.RS, 9, 65, 55, Ascii.DC4, Ascii.SUB, Ascii.US, Ascii.RS, 9, 65};
    }

    static {
        A07();
        A07 = A01(false, -9223372036854775807L);
        A08 = A01(true, -9223372036854775807L);
        A05 = new C0393Eh(2, -9223372036854775807L);
        A06 = new C0393Eh(3, -9223372036854775807L);
    }

    @MetaExoPlayerCustomization(type = {"MERGED"})
    public C1633lc(InterfaceExecutorC0411Ez interfaceExecutorC0411Ez) {
        this.A02 = interfaceExecutorC0411Ez;
    }

    @MetaExoPlayerCustomization(type = {"MERGED"})
    public C1633lc(String str) {
        this(AbstractC0410Ey.A00(AbstractC01424a.A0u(A06(0, 17, 64) + str), new C3X() { // from class: com.facebook.ads.redexgen.X.ld
            @Override // com.instagram.common.viewpoint.core.C3X
            public final void A31(Object obj) {
                ((ExecutorService) obj).shutdown();
            }
        }));
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.Eg != com.facebook.ads.androidx.media3.exoplayer.upstream.Loader$Callback<T extends com.facebook.ads.redexgen.X.Ej> */
    @MetaExoPlayerCustomization("D14742363 Needed to accept supplied looper for Exo2DashLiveManifestFetcher manifest loading")
    private final <T extends InterfaceC0395Ej> long A00(Looper looper, T t, InterfaceC0392Eg<T> interfaceC0392Eg, int i) {
        C3M.A08(looper != null);
        this.A01 = null;
        long elapsedRealtime = SystemClock.elapsedRealtime();
        new HandlerC0394Ei(this, looper, t, interfaceC0392Eg, i, elapsedRealtime).A06(0L);
        return elapsedRealtime;
    }

    public static C0393Eh A01(boolean z, long j) {
        return new C0393Eh(z ? 1 : 0, j);
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.Eg != com.facebook.ads.androidx.media3.exoplayer.upstream.Loader$Callback<T extends com.facebook.ads.redexgen.X.Ej> */
    public final <T extends InterfaceC0395Ej> long A08(T t, InterfaceC0392Eg<T> interfaceC0392Eg, int i) {
        Looper looper = (Looper) C3M.A02(Looper.myLooper());
        return A00(looper, t, interfaceC0392Eg, i);
    }

    public final void A09() {
        ((HandlerC0394Ei) C3M.A02(this.A00)).A07(false);
    }

    public final void A0A() {
        this.A01 = null;
    }

    public final void A0B(int i) throws IOException {
        if (this.A01 == null) {
            if (this.A00 != null) {
                HandlerC0394Ei<? extends InterfaceC0395Ej> handlerC0394Ei = this.A00;
                if (i == Integer.MIN_VALUE) {
                    HandlerC0394Ei<? extends InterfaceC0395Ej> handlerC0394Ei2 = this.A00;
                    String[] strArr = A04;
                    if (strArr[6].charAt(7) == strArr[1].charAt(7)) {
                        throw new RuntimeException();
                    }
                    A04[2] = "wo2YdO45DQEJfRTdGKzxAcazBLTDj4mX";
                    i = handlerC0394Ei2.A07;
                }
                handlerC0394Ei.A05(i);
                return;
            }
            return;
        }
        throw this.A01;
    }

    public final void A0C(InterfaceC0396Ek interfaceC0396Ek) {
        if (this.A00 != null) {
            HandlerC0394Ei<? extends InterfaceC0395Ej> handlerC0394Ei = this.A00;
            String[] strArr = A04;
            if (strArr[5].length() == strArr[3].length()) {
                throw new RuntimeException();
            }
            String[] strArr2 = A04;
            strArr2[4] = "XVuhTdSnDMDRP6HltjyP328n9S8al0u6";
            strArr2[0] = "1piWh3nqPhJ4K6qVEs9qRP5dHkNT6n7u";
            handlerC0394Ei.A07(true);
        }
        if (interfaceC0396Ek != null) {
            this.A02.execute(new RunnableC0397El(interfaceC0396Ek));
        }
        this.A02.AGr();
    }

    public final boolean A0D() {
        return this.A01 != null;
    }

    public final boolean A0E() {
        return this.A00 != null;
    }
}
