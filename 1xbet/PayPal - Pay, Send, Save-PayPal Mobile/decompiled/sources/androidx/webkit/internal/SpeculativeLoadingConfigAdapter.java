package androidx.webkit.internal;

/* loaded from: classes7.dex */
public class SpeculativeLoadingConfigAdapter implements org.chromium.support_lib_boundary.SpeculativeLoadingConfigBoundaryInterface {
    private final androidx.webkit.SpeculativeLoadingConfig getHighSpeedVideoFpsRangesFor;

    public SpeculativeLoadingConfigAdapter(androidx.webkit.SpeculativeLoadingConfig speculativeLoadingConfig) {
        this.getHighSpeedVideoFpsRangesFor = speculativeLoadingConfig;
    }

    @Override // org.chromium.support_lib_boundary.SpeculativeLoadingConfigBoundaryInterface
    public int getMaxPrefetches() {
        return this.getHighSpeedVideoFpsRangesFor.getMaxPrefetches();
    }

    @Override // org.chromium.support_lib_boundary.SpeculativeLoadingConfigBoundaryInterface
    public int getPrefetchTTLSeconds() {
        return this.getHighSpeedVideoFpsRangesFor.getPrefetchTtlSeconds();
    }

    @Override // org.chromium.support_lib_boundary.SpeculativeLoadingConfigBoundaryInterface
    public int getMaxPrerenders() {
        return this.getHighSpeedVideoFpsRangesFor.getMaxPrerenders();
    }
}
