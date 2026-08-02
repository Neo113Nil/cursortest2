package util.h.xy.ea;

/* loaded from: classes18.dex */
public final class rb extends util.h.xy.ea.c {
    private static int Camera2StreamConfigurationMap = 1;
    private static int getHighSpeedVideoFpsRangesFor;

    /* renamed from: ᐝ, reason: contains not printable characters */
    public final util.h.xy.ea.b m26487(util.h.xy.ea.e eVar, util.h.xy.ew.me meVar) throws util.h.xy.ea.d {
        int i = Camera2StreamConfigurationMap;
        getHighSpeedVideoFpsRangesFor = (((i | 19) << 1) - (i ^ 19)) % 128;
        util.h.xy.ea.b Camera2StreamConfigurationMap2 = Camera2StreamConfigurationMap(eVar, meVar);
        int i2 = getHighSpeedVideoFpsRangesFor;
        Camera2StreamConfigurationMap = ((i2 & 29) + (i2 | 29)) % 128;
        return Camera2StreamConfigurationMap2;
    }

    private util.h.xy.ea.b Camera2StreamConfigurationMap(util.h.xy.ea.e eVar, util.h.xy.ew.me meVar) throws util.h.xy.ea.d {
        util.h.xy.dh.d dVar = new util.h.xy.dh.d();
        java.io.ByteArrayOutputStream byteArrayOutputStream = new java.io.ByteArrayOutputStream();
        try {
            java.io.OutputStream mo26572 = meVar.mo26572(byteArrayOutputStream);
            eVar.mo26484(mo26572);
            mo26572.close();
            if (meVar instanceof util.h.xy.ew.d) {
                int i = getHighSpeedVideoFpsRangesFor;
                int i2 = (i & 29) + (i | 29);
                Camera2StreamConfigurationMap = i2 % 128;
                if (i2 % 2 == 0) {
                    byte[] bArr = ((util.h.xy.ew.d) meVar).mo26575();
                    byteArrayOutputStream.write(bArr, 0, bArr.length);
                } else {
                    byte[] bArr2 = ((util.h.xy.ew.d) meVar).mo26575();
                    byteArrayOutputStream.write(bArr2, 0, bArr2.length);
                }
                Camera2StreamConfigurationMap = (getHighSpeedVideoFpsRangesFor + 73) % 128;
            }
            int i3 = getHighSpeedVideoFpsRangesFor;
            Camera2StreamConfigurationMap = (((i3 | 91) << 1) - (i3 ^ 91)) % 128;
            byte[] byteArray = byteArrayOutputStream.toByteArray();
            util.h.xy.ed.a mo26574 = meVar.mo26574();
            util.h.xy.dh.rr rrVar = new util.h.xy.dh.rr(byteArray);
            util.h.xy.ew.rc mo26573 = meVar.mo26573();
            java.util.Iterator it = this.getHighSpeedVideoSizes.iterator();
            int i4 = Camera2StreamConfigurationMap;
            getHighSpeedVideoFpsRangesFor = ((i4 & 45) + (i4 | 45)) % 128;
            while (it.hasNext()) {
                int i5 = getHighSpeedVideoFpsRangesFor;
                int i6 = (i5 & 37) + (i5 | 37);
                Camera2StreamConfigurationMap = i6 % 128;
                dVar.m26290(((util.h.xy.ea.j) it.next()).mo26483(mo26573));
                if (i6 % 2 == 0) {
                    throw new java.lang.ArithmeticException();
                }
                Camera2StreamConfigurationMap = (getHighSpeedVideoFpsRangesFor + 39) % 128;
            }
            util.h.xy.ea.b bVar = new util.h.xy.ea.b(new util.h.xy.dj.ma(util.h.xy.dj.ra.f1323, new util.h.xy.dj.d(this.f1905, new util.h.xy.dh.ae(dVar), new util.h.xy.dj.a(eVar.mo26482(), mo26574, rrVar), this.f1904 != null ? new util.h.xy.dh.ms(this.f1904.m26486(java.util.Collections.EMPTY_MAP).m26357()) : null)));
            int i7 = getHighSpeedVideoFpsRangesFor;
            Camera2StreamConfigurationMap = ((i7 ^ 63) + ((i7 & 63) << 1)) % 128;
            return bVar;
        } catch (java.io.IOException unused) {
            throw new util.h.xy.ea.d("");
        }
    }
}
