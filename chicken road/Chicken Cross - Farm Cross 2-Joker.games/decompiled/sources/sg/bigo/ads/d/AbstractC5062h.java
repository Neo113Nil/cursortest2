package sg.bigo.ads.d;

import sg.bigo.ads.ConsentOptions;

/* renamed from: sg.bigo.ads.d.h, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public abstract /* synthetic */ class AbstractC5062h {

    /* renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int[] f12725a;

    static {
        int[] iArr = new int[ConsentOptions.values().length];
        f12725a = iArr;
        try {
            iArr[ConsentOptions.LGPD.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            f12725a[ConsentOptions.CCPA.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            f12725a[ConsentOptions.COPPA.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            f12725a[ConsentOptions.GDPR.ordinal()] = 4;
        } catch (NoSuchFieldError unused4) {
        }
    }
}
