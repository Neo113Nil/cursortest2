package kotlinx.coroutines.internal;

@kotlin.Metadata(d1 = {"\u0000\u0010\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0005\u001a\u0019\u0010\u0002\u001a\u0004\u0018\u00010\u00002\u0006\u0010\u0001\u001a\u00020\u0000H\u0000¢\u0006\u0004\b\u0002\u0010\u0003\"\u001a\u0010\t\u001a\u00020\u00048\u0001X\u0080\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\b"}, d2 = {"", "p0", "systemProp", "(Ljava/lang/String;)Ljava/lang/String;", "", "getHighSpeedVideoFpsRanges", com.visa.cbp.getEncExpo.warmup, "getAVAILABLE_PROCESSORS", "()I", "Camera2StreamConfigurationMap"}, k = 5, mv = {2, 1, 0}, xi = 48, xs = "kotlinx/coroutines/internal/SystemPropsKt")
/* loaded from: classes5.dex */
final /* synthetic */ class SystemPropsKt__SystemPropsKt {
    private static final int getHighSpeedVideoFpsRanges = java.lang.Runtime.getRuntime().availableProcessors();

    public static final int getAVAILABLE_PROCESSORS() {
        return getHighSpeedVideoFpsRanges;
    }

    public static final java.lang.String systemProp(java.lang.String str) {
        try {
            return java.lang.System.getProperty(str);
        } catch (java.lang.SecurityException unused) {
            return null;
        }
    }
}
