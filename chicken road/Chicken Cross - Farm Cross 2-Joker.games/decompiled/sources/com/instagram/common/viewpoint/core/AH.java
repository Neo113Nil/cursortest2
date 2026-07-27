package com.instagram.common.viewpoint.core;

import android.net.Uri;
import java.io.IOException;
import java.util.Arrays;
import java.util.List;
import java.util.Map;

/* loaded from: assets/audience_network/classes2.dex */
public final class AH implements InterfaceC3426pF {
    public static byte[] A03;
    public final int A00;
    public final AbstractC16953d A01;
    public final InterfaceC3426pF A02;

    static {
        A01();
    }

    public static String A00(int i, int i2, int i3) {
        byte[] copyOfRange = Arrays.copyOfRange(A03, i, i + i2);
        for (int i4 = 0; i4 < copyOfRange.length; i4++) {
            copyOfRange[i4] = (byte) ((copyOfRange[i4] - i3) - 41);
        }
        return new String(copyOfRange);
    }

    public static void A01() {
        A03 = new byte[]{1, 3, 0, -12, -10, -10, -11, -32, 3, -27, -7, 3, 0, 8};
    }

    public AH(InterfaceC3426pF interfaceC3426pF, AbstractC16953d abstractC16953d, int i) {
        this.A02 = (InterfaceC3426pF) AbstractC17143y.A01(interfaceC3426pF);
        AbstractC17143y.A01(abstractC16953d);
        this.A01 = null;
        this.A00 = i;
    }

    @Override // com.instagram.common.viewpoint.core.InterfaceC3426pF
    public final void A43(InterfaceC17615t interfaceC17615t) {
        AbstractC17143y.A01(interfaceC17615t);
        this.A02.A43(interfaceC17615t);
    }

    @Override // com.instagram.common.viewpoint.core.InterfaceC3426pF
    public final Map<String, List<String>> A8t() {
        return this.A02.A8t();
    }

    @Override // com.instagram.common.viewpoint.core.InterfaceC3426pF
    public final Uri A9P() {
        return this.A02.A9P();
    }

    @Override // com.instagram.common.viewpoint.core.InterfaceC3426pF
    public final long AGi(C17505i c17505i) throws IOException {
        throw new NullPointerException(A00(0, 14, 104));
    }

    @Override // com.instagram.common.viewpoint.core.InterfaceC3426pF
    public final void close() throws IOException {
        this.A02.close();
    }

    @Override // com.instagram.common.viewpoint.core.InterfaceC16702c
    public final int read(byte[] bArr, int i, int i2) throws IOException {
        throw new NullPointerException(A00(0, 14, 104));
    }
}
