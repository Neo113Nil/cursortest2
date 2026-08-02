package com.instagram.common.viewpoint.core;

import android.os.Bundle;
import android.os.Message;
import android.util.Log;
import androidx.core.view.InputDeviceCompat;
import androidx.core.view.PointerIconCompat;
import com.facebook.ads.AdError;
import com.facebook.ads.InterstitialAd;
import com.facebook.ads.InterstitialAdExtendedListener;
import com.facebook.ads.InterstitialAdListener;
import com.google.common.base.Ascii;
import java.util.Arrays;
import kotlin.io.encoding.Base64;
import okio.Utf8;
import org.objectweb.asm.Opcodes;

/* renamed from: com.facebook.ads.redexgen.X.gs, reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public final class C1367gs implements InterfaceC0630Nm {
    public static byte[] A06;
    public static String[] A07 = {"41kFMkgYcMqjBdEAHWyZzQ9Q1YQDMkZo", "a1qrqbdzoLKte5dp2TdqsHV2Btmo8HIO", "VlRnhGghZyM7Xz", "WVmrs7jRPAo6ieNv", "abQhu9SgesOIRxLkCU6L7yAdrfeNFYXV", "iVqBhi5IkesALAcr", "e6wMTa30i0R6i9", "GTVyj1NjpD4uWxM1mBTnBnh1LH0X6W6g"};
    public boolean A00;
    public final AbstractC1387hD A01;
    public final InterfaceC0618Na A02;
    public final C1370gv A03;
    public final HandlerC0625Nh A04;
    public final C1153dL A05;

    public static String A00(int i, int i2, int i3) {
        byte[] copyOfRange = Arrays.copyOfRange(A06, i, i + i2);
        for (int i4 = 0; i4 < copyOfRange.length; i4++) {
            copyOfRange[i4] = (byte) ((copyOfRange[i4] ^ i3) ^ 112);
        }
        return new String(copyOfRange);
    }

    public static void A01() {
        A06 = new byte[]{110, 75, Ascii.SI, 64, 77, 69, 74, 76, 91, Ascii.SI, 70, 92, Ascii.SI, 65, 90, 67, 67, 9, Ascii.RS, 5, Ascii.SI, 7, Ascii.SO, Ascii.DC4, Ascii.SO, 19, Ascii.US, Ascii.EM, 10, Ascii.CAN, Ascii.DC4, 0, Ascii.SO, Ascii.DC2, 47, 43, 40, Ascii.FS, Ascii.CR, 0, Ascii.FF, 7, 10, Ascii.FF, 39, Ascii.FF, Ascii.GS, Ascii.RS, 6, Ascii.ESC, 2, 87, 80, 74, 65, 91, 76, 76, 81, 76, 65, 93, 81, 90, 91, 65, 85, 91, 71, Ascii.SO, Ascii.CR, Ascii.FF, 5, Ascii.GS, Ascii.VT, Ascii.FF, Ascii.DC4, 3, Ascii.SO, Ascii.VT, 6, 3, Ascii.SYN, Ascii.VT, Ascii.CR, Ascii.FF, Ascii.GS, Ascii.SYN, Ascii.VT, Ascii.SI, 7, Ascii.GS, 9, 7, Ascii.ESC, 39, Ascii.SI, Ascii.EM, Ascii.EM, Ascii.VT, Ascii.CR, Ascii.SI, 80, 74, 118, 82, 72, 72, 82, 85, 92, Ascii.ESC, 89, 78, 85, 95, 87, 94, Ascii.ESC, 93, 84, 73, Ascii.ESC, 86, 94, 72, 72, 90, 92, 94, Ascii.NAK, 35, 36, 34, 47, 53, 34, 34, Utf8.REPLACEMENT_BYTE, 34, 47, Base64.padSymbol, 53, 35, 35, 49, 55, 53, 47, 59, 53, 41, 72, 89, 64};
    }

    static {
        A01();
    }

    public C1367gs(C1153dL c1153dL, C1370gv c1370gv, InterfaceC0618Na interfaceC0618Na, AbstractC1387hD abstractC1387hD, HandlerC0625Nh handlerC0625Nh) {
        this.A05 = c1153dL;
        this.A03 = c1370gv;
        this.A02 = interfaceC0618Na;
        this.A01 = abstractC1387hD;
        this.A04 = handlerC0625Nh;
    }

    @Override // com.instagram.common.viewpoint.core.InterfaceC0630Nm
    public final Bundle A5J(String str) {
        return AbstractC0637Nt.A02(str, this.A03);
    }

    @Override // com.instagram.common.viewpoint.core.InterfaceC0630Nm
    public final void A5n() {
        this.A04.A0F(PointerIconCompat.TYPE_NO_DROP, null);
        this.A04.A0C();
        this.A03.A0D(null);
    }

    @Override // com.instagram.common.viewpoint.core.InterfaceC0630Nm
    public final int A8H() {
        return PointerIconCompat.TYPE_ALIAS;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Removed duplicated region for block: B:19:0x00db A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0111  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0139  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0143  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x014d  */
    @Override // com.instagram.common.viewpoint.core.InterfaceC0630Nm
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void A9b(Message message) {
        InterstitialAd A6c = this.A03.A6c();
        String A00 = A00(Opcodes.DCMPG, 3, 89);
        if (A6c == null) {
            this.A05.A08().AAy(A00, AbstractC0766Sv.A0K, new C0767Sw(A00(0, 17, 95)));
            return;
        }
        int i = message.what;
        String A002 = A00(95, 9, 26);
        String A003 = A00(104, 27, 75);
        String A004 = A00(17, 17, 59);
        switch (i) {
            case 10:
            case 1023:
                Bundle bundle = message.getData().getBundle(A004);
                if (bundle != null) {
                    int i2 = bundle.getInt(A00(51, 18, 110));
                    String string = bundle.getString(A00(Opcodes.LXOR, 21, 0));
                    AdError adError = new AdError(i2, string);
                    this.A02.AIh(adError);
                    if (this.A03.A6g() != null) {
                        InterstitialAdListener A6g = this.A03.A6g();
                        String[] strArr = A07;
                        String str = strArr[1];
                        String str2 = strArr[0];
                        int errorCode = str.charAt(1);
                        if (errorCode != str2.charAt(1)) {
                            throw new RuntimeException();
                        }
                        String[] strArr2 = A07;
                        strArr2[2] = "mejJWXlfs8BbYc";
                        strArr2[6] = "mZxW76dM1wQ3lj";
                        A6g.onError(A6c, adError);
                    } else {
                        Log.e(A00(34, 17, 25), string);
                    }
                } else {
                    this.A02.AIc(NZ.A04);
                    this.A05.A08().AAy(A00, AbstractC0766Sv.A0V, new C0767Sw(A003, A002 + message));
                }
                this.A03.A0D(null);
                return;
            case PointerIconCompat.TYPE_GRAB /* 1020 */:
                this.A02.AIm();
                Bundle bundle2 = message.getData().getBundle(A004);
                if (bundle2 != null) {
                    this.A03.A0C(bundle2.getLong(A00(69, 26, 50)));
                } else {
                    this.A05.A08().AAy(A00, AbstractC0766Sv.A0V, new C0767Sw(A003, A002 + message));
                }
                this.A03.A0D(null);
                break;
            case 1022:
                this.A02.AJ2();
                break;
        }
        if (this.A03.A6g() == null) {
            return;
        }
        int i3 = message.what;
        String[] strArr3 = A07;
        if (strArr3[4].charAt(13) == strArr3[7].charAt(13)) {
            String[] strArr4 = A07;
            strArr4[1] = "311XYum1gU07qORRQ11S6l3eVKorNtDz";
            strArr4[0] = "91xN7y0ETPjwD6LsGrgnzhnoOTtOTKl3";
            switch (i3) {
                case PointerIconCompat.TYPE_GRAB /* 1020 */:
                    if (!this.A00) {
                        this.A03.A6g().onAdLoaded(A6c);
                        return;
                    } else {
                        this.A00 = false;
                        return;
                    }
                case PointerIconCompat.TYPE_GRABBING /* 1021 */:
                    this.A03.A6g().onInterstitialDisplayed(A6c);
                    return;
                case 1022:
                    this.A03.A6g().onInterstitialDismissed(A6c);
                    return;
                case 1023:
                default:
                    if (this.A03.A04() != null) {
                        return;
                    }
                    int i4 = message.what;
                    String[] strArr5 = A07;
                    if (strArr5[5].length() == strArr5[3].length()) {
                        String[] strArr6 = A07;
                        strArr6[4] = "s5jamizIFVbotxZqKkKlcngcWbLxgQvF";
                        strArr6[7] = "aiBjTIjz8RGRWx4VpHoYFj9LDTOMQV9R";
                        switch (i4) {
                            case 3000:
                                break;
                            case AdError.MEDIATION_ERROR_CODE /* 3001 */:
                                break;
                            case 3002:
                                break;
                            default:
                                return;
                        }
                    } else {
                        switch (i4) {
                            case 3000:
                                this.A03.A04().onRewardedAdCompleted();
                                return;
                            case AdError.MEDIATION_ERROR_CODE /* 3001 */:
                                this.A03.A04().onRewardedAdServerSucceeded();
                                return;
                            case 3002:
                                this.A03.A04().onRewardedAdServerFailed();
                                return;
                            default:
                                return;
                        }
                    }
                case 1024:
                    this.A03.A6g().onAdClicked(A6c);
                    return;
                case InputDeviceCompat.SOURCE_GAMEPAD /* 1025 */:
                    this.A03.A6g().onLoggingImpression(A6c);
                    return;
                case 1026:
                    boolean z = this.A03.A6g() instanceof InterstitialAdExtendedListener;
                    String[] strArr7 = A07;
                    if (strArr7[2].length() == strArr7[6].length()) {
                        String[] strArr8 = A07;
                        strArr8[2] = "qw7ApZ7ipfHbwj";
                        strArr8[6] = "LJsV5SavG50yIX";
                        if (z) {
                            ((InterstitialAdExtendedListener) this.A03.A6g()).onInterstitialActivityDestroyed();
                        }
                        if (this.A03.A04() != null) {
                        }
                    }
                    break;
            }
        }
        throw new RuntimeException();
    }

    @Override // com.instagram.common.viewpoint.core.InterfaceC0630Nm
    public final void AJ3(boolean z) {
        this.A00 = z;
    }
}
