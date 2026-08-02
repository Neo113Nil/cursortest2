package util.h.xy.dh;

/* loaded from: classes5.dex */
public final class an extends util.h.xy.dh.rd {
    private static int getHighSpeedVideoSizesFor = 1;
    private static int getInputFormats;

    @Override // util.h.xy.dh.rd, util.h.xy.dh.mi
    final util.h.xy.dh.mi getHighSpeedVideoFpsRangesFor() {
        int i = (getInputFormats + 29) % 128;
        getHighSpeedVideoSizesFor = i;
        int i2 = ((i | 53) << 1) - (i ^ 53);
        getInputFormats = i2 % 128;
        if (i2 % 2 == 0) {
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
            dVar.m26290(this.Camera2StreamConfigurationMap.getHighSpeedVideoFpsRangesFor());
        }
        dVar.m26290(new util.h.xy.dh.at(this.getHighSpeedVideoFpsRanges == 0, this.getHighSpeedVideoFpsRanges, this.getOutputFormats));
        return new util.h.xy.dh.aq(dVar);
    }

    public an(util.h.xy.dh.i iVar, util.h.xy.dh.f fVar, util.h.xy.dh.mi miVar, int i, util.h.xy.dh.mi miVar2) {
        super(iVar, fVar, miVar, i, miVar2);
    }

    public an(util.h.xy.dh.aq aqVar) {
        super(aqVar);
    }

    public an(util.h.xy.dh.d dVar) {
        this(util.h.xy.dh.ao.getHighSpeedVideoFpsRanges(dVar));
    }
}
