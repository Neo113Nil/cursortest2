package org.chromium.net.impl;

import org.chromium.net.impl.CronetLogger;

/* loaded from: classes4.dex */
public final class NoOpLogger extends CronetLogger {
    @Override // org.chromium.net.impl.CronetLogger
    public long generateId() {
        return 0L;
    }

    @Override // org.chromium.net.impl.CronetLogger
    public void logCronetEngineBuilderInitializedInfo(CronetLogger.CronetEngineBuilderInitializedInfo info) {
    }

    @Override // org.chromium.net.impl.CronetLogger
    public void logCronetEngineCreation(long cronetEngineId, CronetLogger.CronetEngineBuilderInfo engineBuilderInfo, CronetLogger.CronetVersion version, CronetLogger.CronetSource source) {
    }

    @Override // org.chromium.net.impl.CronetLogger
    public void logCronetInitializedInfo(CronetLogger.CronetInitializedInfo info) {
    }

    @Override // org.chromium.net.impl.CronetLogger
    public void logCronetTrafficInfo(long cronetEngineId, CronetLogger.CronetTrafficInfo trafficInfo) {
    }
}
