package com.instagram.common.viewpoint.core;

import android.media.MediaCodecInfo;
import android.media.MediaCodecList;
import com.google.common.base.Ascii;
import java.util.Arrays;

/* renamed from: com.facebook.ads.redexgen.X.mk, reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public final class C1702mk implements InterfaceC0307Aw {
    public static byte[] A00;

    static {
        A01();
    }

    public static String A00(int i, int i2, int i3) {
        byte[] copyOfRange = Arrays.copyOfRange(A00, i, i + i2);
        for (int i4 = 0; i4 < copyOfRange.length; i4++) {
            copyOfRange[i4] = (byte) ((copyOfRange[i4] ^ i3) ^ 11);
        }
        return new String(copyOfRange);
    }

    public static void A01() {
        A00 = new byte[]{Ascii.CR, Ascii.ESC, Ascii.GS, Ascii.VT, Ascii.FF, Ascii.ESC, 83, Ascii.SO, Ascii.DC2, Ascii.US, 7, Ascii.FS, Ascii.US, Ascii.GS, Ascii.NAK, 10, Ascii.NAK, Ascii.CAN, Ascii.EM, 19, 83, Ascii.GS, 10, Ascii.US};
    }

    public C1702mk() {
    }

    @Override // com.instagram.common.viewpoint.core.InterfaceC0307Aw
    public final int A7H() {
        return MediaCodecList.getCodecCount();
    }

    @Override // com.instagram.common.viewpoint.core.InterfaceC0307Aw
    public final MediaCodecInfo A7I(int i) {
        return MediaCodecList.getCodecInfoAt(i);
    }

    @Override // com.instagram.common.viewpoint.core.InterfaceC0307Aw
    public final boolean AAI(String str, String str2, MediaCodecInfo.CodecCapabilities codecCapabilities) {
        return false;
    }

    @Override // com.instagram.common.viewpoint.core.InterfaceC0307Aw
    public final boolean AAJ(String str, String str2, MediaCodecInfo.CodecCapabilities codecCapabilities) {
        return A00(0, 15, 117).equals(str) && A00(15, 9, 119).equals(str2);
    }

    @Override // com.instagram.common.viewpoint.core.InterfaceC0307Aw
    public final boolean AIK() {
        return false;
    }
}
