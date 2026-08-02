package com.zettle.sdk.headless.readers;

@kotlin.Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\"\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J\u000f\u0010\u0003\u001a\u00020\u0002H&¢\u0006\u0004\b\u0003\u0010\u0004R \u0010\n\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00070\u00060\u00058'X¦\u0004¢\u0006\u0006\u001a\u0004\b\b\u0010\tR\u0014\u0010\f\u001a\u00020\u000b8'X¦\u0004¢\u0006\u0006\u001a\u0004\b\f\u0010\r"}, d2 = {"Lcom/zettle/sdk/headless/readers/DiscoverySession;", "", "", "stop", "()V", "Lkotlinx/coroutines/flow/Flow;", "", "Lcom/zettle/sdk/headless/readers/DiscoveredReader;", "getDiscoveredReaders", "()Lkotlinx/coroutines/flow/Flow;", "discoveredReaders", "", "isActive", "()Z"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes17.dex */
public interface DiscoverySession {
    kotlinx.coroutines.flow.Flow<java.util.Set<com.zettle.sdk.headless.readers.DiscoveredReader>> getDiscoveredReaders();

    boolean isActive();

    void stop();
}
