package com.microblink.blinkid.entities.detectors.quad.mrtd;

/* loaded from: classes9.dex */
public class MrtdSpecification extends com.microblink.blinkid.entities.detectors.quad.Specification {
    private MrtdSpecification(com.microblink.blinkid.entities.detectors.quad.mrtd.MrtdSpecificationPreset mrtdSpecificationPreset) {
        super(nativeCreateFromPreset(mrtdSpecificationPreset.ordinal()), true);
        this.llIIlIlIIl = nativeCreateFromPreset(mrtdSpecificationPreset.ordinal());
    }

    public static com.microblink.blinkid.entities.detectors.quad.mrtd.MrtdSpecification createFromPreset(com.microblink.blinkid.entities.detectors.quad.mrtd.MrtdSpecificationPreset mrtdSpecificationPreset) {
        if (mrtdSpecificationPreset != null) {
            return new com.microblink.blinkid.entities.detectors.quad.mrtd.MrtdSpecification(mrtdSpecificationPreset);
        }
        throw new java.lang.IllegalArgumentException("Preset cannot be null!");
    }

    private static native long nativeCreateFromPreset(int i);

    private static native void nativeDestruct(long j);

    public long getNativeContext() {
        return this.llIIlIlIIl;
    }

    @Override // com.microblink.blinkid.entities.detectors.quad.Specification
    public final void llIIlIlIIl(long j) {
        nativeDestruct(j);
    }

    public MrtdSpecification(long j) {
        super(j, false);
    }
}
