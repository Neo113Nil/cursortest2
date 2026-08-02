package org.chromium.net;

import java.util.concurrent.Executor;

/* loaded from: classes4.dex */
public abstract class NetworkQualityRttListener {
    private final Executor mExecutor;

    public abstract void onRttObservation(int rttMs, long whenMs, int source);

    public NetworkQualityRttListener(Executor executor) {
        if (executor == null) {
            throw new IllegalStateException("Executor must not be null");
        }
        this.mExecutor = executor;
    }

    public Executor getExecutor() {
        return this.mExecutor;
    }
}
