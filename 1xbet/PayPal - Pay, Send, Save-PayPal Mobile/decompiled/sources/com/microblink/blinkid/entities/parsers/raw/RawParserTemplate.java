package com.microblink.blinkid.entities.parsers.raw;

/* loaded from: classes9.dex */
class RawParserTemplate {

    /* renamed from: com.microblink.blinkid.entities.parsers.raw.RawParserTemplate$1, reason: invalid class name */
    public static /* synthetic */ class AnonymousClass1 {
        static final /* synthetic */ int[] getHighResolutionOutputSizeshNQ4ISI;

        static {
            int[] iArr = new int[com.microblink.blinkid.secured.llIlIIIIIl.IlIllIlIIl(2).length];
            getHighResolutionOutputSizeshNQ4ISI = iArr;
            try {
                iArr[0] = 1;
            } catch (java.lang.NoSuchFieldError unused) {
            }
            try {
                getHighResolutionOutputSizeshNQ4ISI[1] = 2;
            } catch (java.lang.NoSuchFieldError unused2) {
            }
        }
    }

    public class Result {
        public java.lang.String toString() {
            return null;
        }
    }

    private static native long ocrEngineOptionsNativeGet(long j);

    private static native void ocrEngineOptionsNativeSet(long j, long j2, int i);

    private static native int ocrEngineOptionsTypeNativeGet(long j);

    private static native boolean useSieveNativeGet(long j);

    private static native void useSieveNativeSet(long j, boolean z);
}
