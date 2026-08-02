package org.chromium.net.impl;

/* loaded from: classes5.dex */
public final class NoOpLogger extends org.chromium.net.impl.CronetLogger {
    @Override // org.chromium.net.impl.CronetLogger
    public final long generateId() {
        return 0L;
    }

    @Override // org.chromium.net.impl.CronetLogger
    public final void logCronetEngineBuilderInitializedInfo(org.chromium.net.impl.CronetLogger.CronetEngineBuilderInitializedInfo cronetEngineBuilderInitializedInfo) {
    }

    @Override // org.chromium.net.impl.CronetLogger
    public final void logCronetEngineCreation(long j, org.chromium.net.impl.CronetLogger.CronetEngineBuilderInfo cronetEngineBuilderInfo, org.chromium.net.impl.CronetLogger.CronetVersion cronetVersion, org.chromium.net.impl.CronetLogger.CronetSource cronetSource) {
    }

    @Override // org.chromium.net.impl.CronetLogger
    public final void logCronetInitializedInfo(org.chromium.net.impl.CronetLogger.CronetInitializedInfo cronetInitializedInfo) {
    }

    @Override // org.chromium.net.impl.CronetLogger
    public final void logCronetTrafficInfo(long j, org.chromium.net.impl.CronetLogger.CronetTrafficInfo cronetTrafficInfo) {
    }
}
