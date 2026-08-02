package com.microblink.blinkid.entities.detectors.quad;

/* loaded from: classes9.dex */
public abstract class Specification {
    private final boolean Camera2StreamConfigurationMap;
    public long llIIlIlIIl;

    public Specification(long j, boolean z) {
        this.llIIlIlIIl = j;
        this.Camera2StreamConfigurationMap = z;
    }

    private static native float nativeGetPhysicalHeightInInches(long j);

    protected final void finalize() {
        super.finalize();
        long j = this.llIIlIlIIl;
        if (j == 0 || !this.Camera2StreamConfigurationMap) {
            return;
        }
        llIIlIlIIl(j);
    }

    public float getPhysicalHeightInInches() {
        return nativeGetPhysicalHeightInInches(this.llIIlIlIIl);
    }

    protected abstract void llIIlIlIIl(long j);
}
