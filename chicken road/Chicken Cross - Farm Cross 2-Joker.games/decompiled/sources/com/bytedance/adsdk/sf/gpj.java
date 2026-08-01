package com.bytedance.adsdk.sf;

/* loaded from: classes4.dex */
public enum gpj {
    AUTOMATIC,
    HARDWARE,
    SOFTWARE;

    /* renamed from: com.bytedance.adsdk.sf.gpj$1, reason: invalid class name */
    static /* synthetic */ class AnonymousClass1 {
        static final /* synthetic */ int[] pcc;

        static {
            int[] iArr = new int[gpj.values().length];
            pcc = iArr;
            try {
                iArr[gpj.HARDWARE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                pcc[gpj.SOFTWARE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                pcc[gpj.AUTOMATIC.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
        }
    }

    public boolean pcc(int i, boolean z, int i2) {
        int i3 = AnonymousClass1.pcc[ordinal()];
        if (i3 == 1) {
            return false;
        }
        if (i3 != 2) {
            return (z && i < 28) || i2 > 4 || i <= 25;
        }
        return true;
    }
}
