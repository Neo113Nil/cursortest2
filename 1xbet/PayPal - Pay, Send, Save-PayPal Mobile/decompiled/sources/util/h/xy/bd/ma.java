package util.h.xy.bd;

/* loaded from: classes18.dex */
public final class ma extends util.h.xy.bd.mb {
    private static int getHighSpeedVideoFpsRanges = 1;
    private static int getHighSpeedVideoFpsRangesFor;

    @Override // util.h.xy.bd.mb, util.h.xy.bd.b
    /* renamed from: ˊ */
    public final byte[] mo25372(byte[] bArr) throws com.gemalto.mfs.mwsdk.exception.InternalComponentException {
        new util.h.xy.bl.mb().m25510(com.gemalto.mfs.mwsdk.dcm.PaymentType.CONTACTLESS);
        byte[] mo25372 = super.mo25372(bArr);
        int i = getHighSpeedVideoFpsRanges;
        getHighSpeedVideoFpsRangesFor = ((i & 89) + (i | 89)) % 128;
        return mo25372;
    }
}
