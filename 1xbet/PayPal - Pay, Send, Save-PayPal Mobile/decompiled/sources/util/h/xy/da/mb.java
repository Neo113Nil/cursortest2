package util.h.xy.da;

/* loaded from: classes5.dex */
public abstract class mb {
    private static int getHighResolutionOutputSizeshNQ4ISI = 1;
    private static int getHighSpeedVideoFpsRangesFor;

    public interface a {
        /* renamed from: ˊ */
        util.h.xy.da.mb.a mo26090(util.h.xy.da.a aVar);

        /* renamed from: ˎ */
        util.h.xy.da.mb mo26094();

        /* renamed from: ᐝ */
        util.h.xy.da.mb.a mo26095(java.lang.String str, java.lang.Object obj);
    }

    /* renamed from: ˎ, reason: contains not printable characters */
    public static util.h.xy.da.mb.a m26261(byte[] bArr) {
        util.h.xy.cw.mb.ra raVar = new util.h.xy.cw.mb.ra(bArr);
        int i = getHighResolutionOutputSizeshNQ4ISI;
        getHighSpeedVideoFpsRangesFor = ((i & 107) + (i | 107)) % 128;
        return raVar;
    }
}
