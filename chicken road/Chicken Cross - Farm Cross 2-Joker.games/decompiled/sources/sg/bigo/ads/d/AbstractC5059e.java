package sg.bigo.ads.d;

import sg.bigo.ads.ConsentOptions;

/* renamed from: sg.bigo.ads.d.e, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public abstract /* synthetic */ class AbstractC5059e {

    /* renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int[] f12723a;

    static {
        int[] iArr = new int[ConsentOptions.values().length];
        f12723a = iArr;
        try {
            iArr[ConsentOptions.GDPR.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            f12723a[ConsentOptions.CCPA.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            f12723a[ConsentOptions.LGPD.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            f12723a[ConsentOptions.COPPA.ordinal()] = 4;
        } catch (NoSuchFieldError unused4) {
        }
    }
}
