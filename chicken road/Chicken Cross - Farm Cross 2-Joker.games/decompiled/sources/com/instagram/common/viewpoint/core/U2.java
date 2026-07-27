package com.instagram.common.viewpoint.core;

import android.content.SharedPreferences;
import android.util.Log;
import com.facebook.ads.AudienceNetworkActivity;
import com.facebook.ads.AudienceNetworkAds;
import com.facebook.ads.internal.api.BuildConfigApi;
import com.facebook.ads.internal.dynamicloading.FlashPreferences;
import com.facebook.ads.internal.settings.AdInternalSettings;
import com.facebook.ads.internal.settings.MultithreadedBundleWrapper;
import com.facebook.ads.internal.util.activity.ActivityUtils;
import com.facebook.ads.internal.util.process.ProcessUtils;
import com.google.common.base.Ascii;
import com.vungle.ads.internal.protos.Sdk;
import java.lang.Thread;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicBoolean;

/* loaded from: assets/audience_network/classes2.dex */
public final class U2 {
    public static boolean A00;
    public static boolean A01;
    public static byte[] A02;
    public static String[] A03 = {"i0FOsf0o9fpBvAlaEaGgnCYFRbNnwBKJ", "ZsBa2nEfyhltTo", "ZG6g5nWnUhxh", "6zjosiDwJWE47kuMvKAUCDrCWUeR8P3q", "Gh89HIHHDqfPtiuASbXLVil627eRz", "Lsbp3nhJR34oAmuvtJAouWbaxC4Ny9OM", "s0Y", "C"};
    public static final AtomicBoolean A04;
    public static final AtomicBoolean A05;
    public static final AtomicBoolean A06;

    public static String A02(int i, int i2, int i3) {
        byte[] copyOfRange = Arrays.copyOfRange(A02, i, i + i2);
        for (int i4 = 0; i4 < copyOfRange.length; i4++) {
            copyOfRange[i4] = (byte) ((copyOfRange[i4] - i3) - 33);
        }
        return new String(copyOfRange);
    }

    public static void A03() {
        A02 = new byte[]{-89, -39, -39, -89, -39, -88, -40, -84, -54, -58, -59, -7, -24, -19, -23, -14, -25, -23, -46, -23, -8, -5, -13, -10, -17, -88, -103, -96, 117, -66, -61, -66, -55, -66, -74, -63, -66, -49, -74, -55, -66, -60, -61, 117, -56, -55, -74, -57, -55, -70, -71, -84, -67, -60, 121, -48, -70, -52, 121, -70, -59, -53, -66, -70, -67, -46, 121, -62, -57, -62, -51, -62, -70, -59, -62, -45, -66, -67, 122, 121, -84, -60, -62, -55, -55, -62, -57, -64, -121, -90, -68, -62, 109, -79, -68, -69, 116, -63, 109, -80, -82, -71, -71, 109, -114, -62, -79, -74, -78, -69, -80, -78, -101, -78, -63, -60, -68, -65, -72, -114, -79, -64, 123, -74, -69, -74, -63, -74, -82, -71, -74, -57, -78, 117, 118, 123, 109, -96, -68, -70, -78, 109, -77, -62, -69, -80, -63, -74, -68, -69, -82, -71, -74, -63, -58, 109, -70, -82, -58, 109, -69, -68, -63, 109, -60, -68, -65, -72, 109, -67, -65, -68, -67, -78, -65, -71, -58, 123, -120, -105, -112, -58, -52, -63, -45, -56, 0, 6, -5, Ascii.CR, 2, -7, -3, 9, 8, 0, 3, 1, -42, -44, -35, -44, -31, -40, -46, -3, 2, -3, 8, -3, -11, 0, -3, Ascii.SO, -7, -51, -46, -51, -40, -51, -59, -48, -51, -34, -55, -116, -115, -124, -46, -45, -40, -124, -57, -59, -48, -48, -55, -56, -110, 1, -10, 8, 9, -12, 7, -6, 8, 10, 1, 9};
    }

    static {
        A03();
        A06 = new AtomicBoolean();
        A04 = new AtomicBoolean();
        A05 = new AtomicBoolean();
    }

    public static C2774eB A00() {
        return new C2774eB();
    }

    public static C2773eA A01(C2926ge c2926ge) {
        return new C2773eA(c2926ge);
    }

    public static void A04(AudienceNetworkAds.InitListener initListener, AudienceNetworkAds.InitResult initResult) {
        Y4.A01.execute(new C2775eC(initListener, initResult));
    }

    public static void A06(C2926ge c2926ge) {
        if (AbstractC2382Ur.A0P(c2926ge) && !A05.getAndSet(true)) {
            try {
                Thread.UncaughtExceptionHandler defaultUncaughtExceptionHandler = new TT(Thread.getDefaultUncaughtExceptionHandler(), c2926ge, new C2708d6());
                Thread.setDefaultUncaughtExceptionHandler(defaultUncaughtExceptionHandler);
            } catch (Exception e) {
                c2926ge.A08().ABC(A02(198, 7, 78), AbstractC2342Td.A1X, new C2343Te(e));
            }
        }
    }

    public static void A07(C2926ge c2926ge) {
        A0H(c2926ge, null, null, 3);
    }

    public static void A08(C2926ge c2926ge) {
        A0H(c2926ge, null, null, 3);
    }

    public static void A09(C2926ge c2926ge) {
        if (C2380Up.A2O(c2926ge)) {
            A0F(c2926ge, 0);
        }
        if (C2380Up.A2X(c2926ge)) {
            A0B(c2926ge);
        }
    }

    public static void A0A(C2926ge c2926ge) {
        if (C2380Up.A2P(c2926ge)) {
            String[] strArr = A03;
            if (strArr[1].length() == strArr[6].length()) {
                throw new RuntimeException();
            }
            String[] strArr2 = A03;
            strArr2[1] = "XjvPwbQrSqkAxC";
            strArr2[6] = "skO";
            A0G(c2926ge, null, 3);
        }
    }

    public static void A0B(C2926ge c2926ge) {
        YG.A06.execute(new C2776eD(c2926ge));
    }

    public static void A0C(C2926ge c2926ge) {
        OP.A02(c2926ge);
        TX.A0C(c2926ge, new C2678cc(c2926ge), new C2826f2(), BuildConfigApi.isDebug());
        c2926ge.A0A();
        A0D(c2926ge);
    }

    public static void A0D(C2926ge c2926ge) {
        if (ProcessUtils.isRemoteRenderingProcess()) {
            return;
        }
        SharedPreferences sharedPreferences = FlashPreferences.getSharedPreferences(c2926ge);
        String string = sharedPreferences.getString(A02(186, 12, Sdk.SDKError.Reason.TPAT_ERROR_VALUE), null);
        String string2 = sharedPreferences.getString(A02(239, 11, 116), null);
        if (string != null && string2 != null) {
            InterfaceC2341Tc A08 = c2926ge.A08();
            C2343Te c2343Te = new C2343Te(string2);
            String flashConfig = A02(181, 5, 63);
            A08.ABz(flashConfig, 3701, c2343Te);
        }
    }

    public static void A0F(C2926ge c2926ge, int i) {
        T7.A01(c2926ge);
        if (A04.getAndSet(true)) {
            return;
        }
        if (AdInternalSettings.isDebugBuild() || AdInternalSettings.isDebuggerOn()) {
            AbstractC2413Vy.A02();
        }
        A06(c2926ge);
        AbstractC2420Wf.A00(C2380Up.A0q(c2926ge), BuildConfigApi.isDebug(), A00(), A01(c2926ge));
        C2321Si.A03(C2380Up.A04(c2926ge));
        if (!ProcessUtils.isRemoteRenderingProcess()) {
            C2899gD.A09(new C2764e1(c2926ge));
        }
        if (i == 3) {
            Log.e(A02(8, 17, 99), A02(89, 89, 44));
            c2926ge.A08().ABz(A02(178, 3, 6), AbstractC2342Td.A0R, new C2343Te(A02(Sdk.SDKError.Reason.AD_RESPONSE_EMPTY_VALUE, 24, 67)));
        }
        ActivityUtils.A04(c2926ge, AudienceNetworkActivity.class);
        YG.A05(c2926ge);
        VL.A05(c2926ge);
        N8.A01(c2926ge);
        if (C2380Up.A16(c2926ge)) {
            RX.A00(c2926ge);
        }
        if (C2380Up.A1z(c2926ge)) {
            ZR.A02().A90(c2926ge);
        }
    }

    public static void A0G(C2926ge c2926ge, AudienceNetworkAds.InitListener initListener, int i) {
        T7.A01(c2926ge);
        boolean z = false;
        synchronized (U2.class) {
            boolean execute = A00;
            if (!execute) {
                if (i != 1 && i != 2) {
                    if (i == 3) {
                        boolean execute2 = A01;
                        if (!execute2) {
                            A01 = true;
                            z = true;
                        }
                    }
                }
                A00 = true;
                z = true;
            }
        }
        if (z) {
            A0F(c2926ge, i);
            YG.A08.execute(new C2801ed(c2926ge, initListener));
        } else {
            if (i != 1) {
                return;
            }
            String A022 = A02(51, 38, 56);
            if (initListener != null) {
                A04(initListener, new U1(true, A022));
            } else {
                Log.w(A02(8, 17, 99), A022);
            }
        }
    }

    public static void A0H(C2926ge c2926ge, MultithreadedBundleWrapper multithreadedBundleWrapper, AudienceNetworkAds.InitListener initListener, int i) {
        AbstractC2413Vy.A05(A02(205, 10, 115), A02(25, 26, 52), A02(0, 8, 82));
        C2899gD.A06();
        A0G(c2926ge, initListener, i);
    }

    public static synchronized boolean A0I() {
        boolean z;
        synchronized (U2.class) {
            z = A00;
        }
        return z;
    }
}
