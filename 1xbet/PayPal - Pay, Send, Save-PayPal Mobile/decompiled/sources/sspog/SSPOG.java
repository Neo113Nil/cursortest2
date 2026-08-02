package sspog;

/* loaded from: classes18.dex */
public class SSPOG {
    @java.lang.Deprecated
    static native int a(android.content.Context context, sspog.SSPOGProvider sSPOGProvider);

    static native int ae(android.content.Context context, java.lang.String str, sspog.SSPOGProvider sSPOGProvider, int i);

    static native int cinit(android.content.Context context, sspog.SSPOGProvider sSPOGProvider, boolean z, boolean z2, java.lang.String str, int i, long j, byte b);

    static native java.lang.Object[] co(android.content.Context context, sspog.SSPOGProvider sSPOGProvider, byte[] bArr);

    static native java.lang.Object[] eo(android.content.Context context, sspog.SSPOGProvider sSPOGProvider, boolean z, byte[] bArr, boolean z2);

    static native int g(java.lang.String str, long j);

    static native java.lang.Object[] gi();

    static native java.lang.Object[] gt(android.content.Context context, sspog.SSPOGProvider sSPOGProvider, long j);

    static native java.lang.Object[] ho(android.content.Context context, sspog.SSPOGProvider sSPOGProvider, byte[] bArr);

    static native boolean ke(android.content.Context context, sspog.SSPOGProvider sSPOGProvider);

    static native boolean lc();

    static native int li(android.content.Context context, sspog.SSPOGProvider sSPOGProvider, java.lang.String str);

    static native void lo(android.content.Context context, sspog.SSPOGProvider sSPOGProvider);

    static native java.lang.String[] ls();

    static native long p(byte[] bArr, byte[] bArr2, byte[] bArr3);

    static native long pa(android.widget.ImageView[] imageViewArr, byte[] bArr, java.util.function.Function<java.lang.Byte, android.graphics.Bitmap> function, boolean z);

    static native byte[] pc(long j);

    static native int pd(long j);

    static native int pe(long j, byte b);

    static native void pf(long j);

    static native int pl(long j);

    static native int ra(android.content.Context context, sspog.SSPOGProvider sSPOGProvider);

    static native int rp(android.content.Context context, sspog.SSPOGProvider sSPOGProvider, java.lang.String str);

    static native int rs();

    static native int rt();

    static native boolean unlock(android.content.Context context, java.lang.String str, java.lang.String str2, java.lang.String str3);

    static native int up(android.content.Context context, sspog.SSPOGProvider sSPOGProvider, java.lang.String str, java.lang.String str2);

    public static java.lang.Object[] h(int i, java.lang.String str, java.lang.String str2, java.lang.String str3) {
        return sspog.SSPOGService.getInstance().httpRequest(i, str, str2, str3);
    }

    public static java.lang.Object[] l(java.lang.String str, java.lang.String str2, int i, int i2, java.lang.String str3) {
        return sspog.SSPOGService.getInstance().auditLogging(str, str2, i, i2, str3);
    }

    public static java.lang.Object[] tl(java.lang.Long l, java.lang.String str) {
        return sspog.SSPOGService.getInstance().attestTransactionLogging(l.longValue(), str);
    }

    public static java.lang.Object[] sn(android.content.Context context, byte[] bArr) {
        return sspog.SSPOGService.getInstance().performPlayIntegrityAttestation(context, android.util.Base64.encodeToString(bArr, 10));
    }

    public static java.lang.Object[] ipc(android.content.Context context) {
        return sspog.SSPOGService.getInstance().performIsolatedProcessCheck(context);
    }

    public static java.lang.Object[] z(android.content.Context context, boolean z, byte[] bArr, boolean z2) {
        return sspog.SSPOGService.getInstance().performCOTSAttestation(context, z, bArr, z2);
    }

    public static java.lang.Object[] cp(android.content.Context context, java.lang.String[] strArr) {
        return sspog.SSPOGService.getInstance().performAttestationCheckPackage(context, strArr);
    }

    public static java.lang.Object[] awp(android.content.Context context, java.lang.String str) {
        return sspog.SSPOGService.getInstance().performAttestationCheckPackage(context, str);
    }

    public static int rac(sspog.SSPOGSuggestedAction[] sSPOGSuggestedActionArr) {
        return sspog.SSPOGService.getInstance().cacheRecoverableAction(sSPOGSuggestedActionArr);
    }

    public static int a(java.lang.String str, java.lang.String str2) {
        return sspog.SSPOGService.getInstance().setServiceAppInfo(str, str2);
    }

    public static int s(byte[] bArr) {
        return sspog.SSPOGService.getInstance().setRandomSeed(bArr);
    }

    public static byte[] s() {
        return sspog.SSPOGService.getInstance().getRandomSeed();
    }

    public static java.lang.Object[] pc() {
        return sspog.SSPOGService.getInstance().getPaymentCACert();
    }
}
