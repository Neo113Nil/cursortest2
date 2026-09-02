package com.goldenboot.saga.zone;

/* compiled from: r8-map-id-8a937589efc37ca14c210e73e18b8757b60a107ea08aacc80d18a198c868531e */
/* loaded from: classes2.dex */
public class KeyboardMeter extends ScaleCounter implements HapticDiff {
    public final boolean connectPatch;

    public KeyboardMeter(DrawableSynthesizer drawableSynthesizer) {
        super(true);
        growCallback(drawableSynthesizer);
        this.connectPatch = closeSource();
    }

    public final boolean closeSource() {
        ScaleCounter drawRequest;
        TrackballPool protectGauge = protectGauge();
        DoubleTapBridge doubleTapBridge = protectGauge instanceof DoubleTapBridge ? (DoubleTapBridge) protectGauge : null;
        if (doubleTapBridge != null && (drawRequest = doubleTapBridge.drawRequest()) != null) {
            while (!drawRequest.emitStrategy()) {
                TrackballPool protectGauge2 = drawRequest.protectGauge();
                DoubleTapBridge doubleTapBridge2 = protectGauge2 instanceof DoubleTapBridge ? (DoubleTapBridge) protectGauge2 : null;
                if (doubleTapBridge2 != null && (drawRequest = doubleTapBridge2.drawRequest()) != null) {
                }
            }
            return true;
        }
        return false;
    }

    @Override // com.goldenboot.saga.zone.ScaleCounter
    public boolean emitStrategy() {
        return this.connectPatch;
    }

    @Override // com.goldenboot.saga.zone.ScaleCounter
    public boolean handleFooter() {
        return true;
    }

    @Override // com.goldenboot.saga.zone.HapticDiff
    public boolean releaseHeader(Throwable th) {
        return executeRecord(new JoystickLauncher(th, false, 2, null));
    }
}
