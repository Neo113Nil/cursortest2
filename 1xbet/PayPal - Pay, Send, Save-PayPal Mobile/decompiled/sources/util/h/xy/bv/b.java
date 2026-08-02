package util.h.xy.bv;

/* loaded from: classes5.dex */
public class b extends java.util.Observable {
    private static int getHighSpeedVideoFpsRangesFor = 0;
    private static int getHighSpeedVideoSizes = 1;
    private util.h.xy.bv.b.ma.EnumC0265b getHighSpeedVideoFpsRanges = util.h.xy.bv.b.ma.EnumC0265b.f1058;

    static {
        int i = getHighSpeedVideoFpsRangesFor;
        int i2 = (i & 63) + (i | 63);
        getHighSpeedVideoSizes = i2 % 128;
        if (i2 % 2 == 0) {
            throw new java.lang.ArithmeticException();
        }
    }

    /* renamed from: ˋ, reason: contains not printable characters */
    public void m25681(util.h.xy.bv.b.ma.EnumC0265b enumC0265b) {
        int i = getHighSpeedVideoFpsRangesFor;
        getHighSpeedVideoSizes = (((i | 59) << 1) - (i ^ 59)) % 128;
        this.getHighSpeedVideoFpsRanges = enumC0265b;
        setChanged();
        notifyObservers(enumC0265b);
        int i2 = getHighSpeedVideoSizes;
        int i3 = ((i2 | 75) << 1) - (i2 ^ 75);
        getHighSpeedVideoFpsRangesFor = i3 % 128;
        if (i3 % 2 != 0) {
            throw new java.lang.ArithmeticException();
        }
    }

    /* renamed from: ˋ, reason: contains not printable characters */
    public void m25680(java.util.Observer observer) {
        int i = getHighSpeedVideoSizes;
        getHighSpeedVideoFpsRangesFor = ((i ^ 49) + ((i & 49) << 1)) % 128;
        observer.update(this, this.getHighSpeedVideoFpsRanges);
        getHighSpeedVideoSizes = (getHighSpeedVideoFpsRangesFor + 119) % 128;
    }

    public interface ma {
        void onUpdate(util.h.xy.bv.b.ma.EnumC0265b enumC0265b);

        /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
        /* renamed from: util.h.xy.bv.b$ma$b, reason: collision with other inner class name */
        public static final class EnumC0265b {
            private static int Camera2StreamConfigurationMap = 1;
            private static int getHighResolutionOutputSizeshNQ4ISI = 0;
            private static int getHighSpeedVideoFpsRanges = 0;
            private static int getHighSpeedVideoFpsRangesFor = 0;
            private static boolean getHighSpeedVideoSizes = false;
            private static char[] getInputFormats = null;
            private static int getInputSizeshNQ4ISI = 1;
            private static final /* synthetic */ util.h.xy.bv.b.ma.EnumC0265b[] getOutputFormats;
            private static boolean getOutputMinFrameDuration;

            /* renamed from: ˋ, reason: contains not printable characters */
            public static final util.h.xy.bv.b.ma.EnumC0265b f1056;

            /* renamed from: ˎ, reason: contains not printable characters */
            public static final util.h.xy.bv.b.ma.EnumC0265b f1057;

            /* renamed from: ᐝ, reason: contains not printable characters */
            public static final util.h.xy.bv.b.ma.EnumC0265b f1058;

            private EnumC0265b(java.lang.String str, int i) {
            }

            public static util.h.xy.bv.b.ma.EnumC0265b valueOf(java.lang.String str) {
                getInputSizeshNQ4ISI = (getHighResolutionOutputSizeshNQ4ISI + 99) % 128;
                util.h.xy.bv.b.ma.EnumC0265b enumC0265b = (util.h.xy.bv.b.ma.EnumC0265b) java.lang.Enum.valueOf(util.h.xy.bv.b.ma.EnumC0265b.class, str);
                getInputSizeshNQ4ISI = (getHighResolutionOutputSizeshNQ4ISI + 35) % 128;
                return enumC0265b;
            }

            public static util.h.xy.bv.b.ma.EnumC0265b[] values() {
                getHighResolutionOutputSizeshNQ4ISI = (getInputSizeshNQ4ISI + com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_CALENDAR_VALUE) % 128;
                util.h.xy.bv.b.ma.EnumC0265b[] enumC0265bArr = (util.h.xy.bv.b.ma.EnumC0265b[]) getOutputFormats.clone();
                getInputSizeshNQ4ISI = (getHighResolutionOutputSizeshNQ4ISI + 39) % 128;
                return enumC0265bArr;
            }

            static {
                util.h.xy.bv.b.ma.EnumC0265b[] enumC0265bArr;
                getHighResolutionOutputSizeshNQ4ISI();
                java.lang.Object[] objArr = new java.lang.Object[1];
                getHighSpeedVideoFpsRangesFor(126 - android.graphics.ImageFormat.getBitsPerPixel(0), "\u0082\u0085\u0084\u0082\u0083\u0082\u0081", objArr);
                util.h.xy.bv.b.ma.EnumC0265b enumC0265b = new util.h.xy.bv.b.ma.EnumC0265b(((java.lang.String) objArr[0]).intern(), 0);
                f1058 = enumC0265b;
                java.lang.Object[] objArr2 = new java.lang.Object[1];
                getHighSpeedVideoFpsRangesFor(127 - android.view.Gravity.getAbsoluteGravity(0, 0), "\u0087\u0084\u0087\u0087\u0086", objArr2);
                util.h.xy.bv.b.ma.EnumC0265b enumC0265b2 = new util.h.xy.bv.b.ma.EnumC0265b(((java.lang.String) objArr2[0]).intern(), 1);
                f1056 = enumC0265b2;
                java.lang.Object[] objArr3 = new java.lang.Object[1];
                getHighSpeedVideoFpsRangesFor(android.text.TextUtils.lastIndexOf("", com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask) + 128, "\u0088\u0088\u0086\u0089\u0089\u0081\u0088", objArr3);
                util.h.xy.bv.b.ma.EnumC0265b enumC0265b3 = new util.h.xy.bv.b.ma.EnumC0265b(((java.lang.String) objArr3[0]).intern(), 2);
                f1057 = enumC0265b3;
                int i = getHighResolutionOutputSizeshNQ4ISI;
                int i2 = i + 41;
                getInputSizeshNQ4ISI = i2 % 128;
                if (i2 % 2 == 0) {
                    enumC0265bArr = new util.h.xy.bv.b.ma.EnumC0265b[5];
                    enumC0265bArr[0] = enumC0265b;
                    enumC0265bArr[0] = enumC0265b2;
                    enumC0265bArr[2] = enumC0265b3;
                } else {
                    enumC0265bArr = new util.h.xy.bv.b.ma.EnumC0265b[]{enumC0265b, enumC0265b2, enumC0265b3};
                }
                int i3 = (i + 25) % 128;
                getInputSizeshNQ4ISI = i3;
                getOutputFormats = enumC0265bArr;
                getHighResolutionOutputSizeshNQ4ISI = (i3 + 75) % 128;
            }

            private static void getHighSpeedVideoFpsRangesFor(int i, java.lang.String str, java.lang.Object[] objArr) {
                byte[] bytes = str.getBytes("ISO-8859-1");
                util.h.xz.b.md mdVar = new util.h.xz.b.md();
                char[] cArr = getInputFormats;
                if (cArr != null) {
                    Camera2StreamConfigurationMap = (getHighSpeedVideoFpsRangesFor + 5) % 128;
                    int length = cArr.length;
                    char[] cArr2 = new char[length];
                    int i2 = 0;
                    while (i2 < length) {
                        int i3 = getHighSpeedVideoFpsRangesFor + 41;
                        Camera2StreamConfigurationMap = i3 % 128;
                        if (i3 % 2 == 0) {
                            cArr2[i2] = (char) (cArr[i2] % (-3299939579226817547L));
                        } else {
                            cArr2[i2] = (char) (cArr[i2] ^ (-3299939579226817547L));
                            i2++;
                        }
                    }
                    cArr = cArr2;
                }
                int i4 = (int) ((-3299939579226817547L) ^ getHighSpeedVideoFpsRanges);
                if (!getOutputMinFrameDuration) {
                    if (!getHighSpeedVideoSizes) {
                        throw null;
                    }
                    getHighSpeedVideoFpsRangesFor = (Camera2StreamConfigurationMap + 45) % 128;
                    throw null;
                }
                Camera2StreamConfigurationMap = (getHighSpeedVideoFpsRangesFor + 15) % 128;
                mdVar.f2642 = bytes.length;
                char[] cArr3 = new char[mdVar.f2642];
                mdVar.f2643 = 0;
                while (mdVar.f2643 < mdVar.f2642) {
                    cArr3[mdVar.f2643] = (char) (cArr[bytes[(mdVar.f2642 - 1) - mdVar.f2643] + i] - i4);
                    mdVar.f2643++;
                    getHighSpeedVideoFpsRangesFor = (Camera2StreamConfigurationMap + 1) % 128;
                }
                objArr[0] = new java.lang.String(cArr3);
            }

            static void getHighResolutionOutputSizeshNQ4ISI() {
                getInputFormats = new char[]{64352, 64379, 64382, 64378, 64354, 64368, 64359, 64358, 64374};
                getHighSpeedVideoFpsRanges = -1074857035;
                getHighSpeedVideoSizes = true;
                getOutputMinFrameDuration = true;
            }
        }
    }
}
