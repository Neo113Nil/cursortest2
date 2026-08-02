package com.knotapi.knot.utilities;

/* loaded from: classes9.dex */
class WebViewURLs {

    /* renamed from: com.knotapi.knot.utilities.WebViewURLs$1, reason: invalid class name */
    public static /* synthetic */ class AnonymousClass1 {
        static final /* synthetic */ int[] $SwitchMap$com$knotapi$knot$models$Environment;

        static {
            int[] iArr = new int[com.knotapi.knot.models.Environment.values().length];
            $SwitchMap$com$knotapi$knot$models$Environment = iArr;
            try {
                iArr[com.knotapi.knot.models.Environment.sandbox.ordinal()] = 1;
            } catch (java.lang.NoSuchFieldError unused) {
            }
            try {
                $SwitchMap$com$knotapi$knot$models$Environment[com.knotapi.knot.models.Environment.development.ordinal()] = 2;
            } catch (java.lang.NoSuchFieldError unused2) {
            }
        }
    }

    public static java.lang.String getSwitcherURL(com.knotapi.knot.models.Environment environment, java.lang.String str) {
        return com.knotapi.knot.utilities.Helper.isValidURL(str) ? str : getURL(environment);
    }

    private static java.lang.String getURL(com.knotapi.knot.models.Environment environment) {
        int i = com.knotapi.knot.utilities.WebViewURLs.AnonymousClass1.$SwitchMap$com$knotapi$knot$models$Environment[environment.ordinal()];
        return (i != 1 ? i != 2 ? "https://" : "https://development-" : "https://sandbox-").concat("knotapi.vercel.app");
    }
}
