package util.h.xy.bd;

/* loaded from: classes18.dex */
public final class d extends util.h.xy.bd.mb {
    private static int getHighSpeedVideoFpsRangesFor = 0;
    private static int getHighSpeedVideoSizes = 1;

    @Override // util.h.xy.bd.mb, util.h.xy.bd.b
    /* renamed from: ˊ */
    public final byte[] mo25372(byte[] bArr) throws com.gemalto.mfs.mwsdk.exception.InternalComponentException {
        getHighSpeedVideoFpsRangesFor = (getHighSpeedVideoSizes + 97) % 128;
        byte[] mo25372 = super.mo25372(bArr);
        int i = getHighSpeedVideoSizes;
        getHighSpeedVideoFpsRangesFor = ((i & 45) + (i | 45)) % 128;
        return mo25372;
    }
}
