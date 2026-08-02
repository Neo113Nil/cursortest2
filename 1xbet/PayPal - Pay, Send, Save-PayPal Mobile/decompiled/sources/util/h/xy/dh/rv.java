package util.h.xy.dh;

/* loaded from: classes5.dex */
public final class rv extends util.h.xy.dh.rd {
    private static int getHighSpeedVideoSizesFor = 0;
    private static int getInputFormats = 1;

    @Override // util.h.xy.dh.rd, util.h.xy.dh.mi
    final util.h.xy.dh.mi getHighSpeedVideoFpsRangesFor() {
        int i = getInputFormats;
        getHighSpeedVideoSizesFor = ((i ^ 23) + ((i & 23) << 1)) % 128;
        int i2 = (i & 31) + (i | 31);
        getHighSpeedVideoSizesFor = i2 % 128;
        if (i2 % 2 == 0) {
            return this;
        }
        throw new java.lang.ArithmeticException();
    }

    @Override // util.h.xy.dh.rd, util.h.xy.dh.mi
    final util.h.xy.dh.mi Camera2StreamConfigurationMap() {
        int i = getHighSpeedVideoSizesFor + 97;
        getInputFormats = i % 128;
        if (i % 2 != 0) {
            return this;
        }
        throw null;
    }

    @Override // util.h.xy.dh.rd
    final util.h.xy.dh.l getHighSpeedVideoFpsRanges() {
        util.h.xy.dh.d dVar = new util.h.xy.dh.d(4);
        if (this.getHighResolutionOutputSizeshNQ4ISI != null) {
            dVar.m26290(this.getHighResolutionOutputSizeshNQ4ISI);
        }
        if (this.getHighSpeedVideoSizes != null) {
            dVar.m26290(this.getHighSpeedVideoSizes);
        }
        if (this.Camera2StreamConfigurationMap != null) {
            dVar.m26290(this.Camera2StreamConfigurationMap.Camera2StreamConfigurationMap());
        }
        dVar.m26290(new util.h.xy.dh.ag(this.getHighSpeedVideoFpsRanges == 0, this.getHighSpeedVideoFpsRanges, this.getOutputFormats));
        return new util.h.xy.dh.aa(dVar);
    }

    public rv(util.h.xy.dh.i iVar, util.h.xy.dh.f fVar, util.h.xy.dh.mi miVar, int i, util.h.xy.dh.mi miVar2) {
        super(iVar, fVar, miVar, i, miVar2);
    }

    public rv(util.h.xy.dh.aa aaVar) {
        super(aaVar);
    }
}
