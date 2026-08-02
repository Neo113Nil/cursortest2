package com.zettle.sdk.meta;

@kotlin.Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\t\n\u0002\b\t\bf\u0018\u00002\u00020\u0001R\u0014\u0010\u0005\u001a\u00020\u00028'X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004R\u0014\u0010\u0007\u001a\u00020\u00028'X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0006\u0010\u0004R\u0014\u0010\t\u001a\u00020\u00028'X¦\u0004¢\u0006\u0006\u001a\u0004\b\b\u0010\u0004R\u0014\u0010\u000b\u001a\u00020\u00028'X¦\u0004¢\u0006\u0006\u001a\u0004\b\n\u0010\u0004"}, d2 = {"Lcom/zettle/sdk/meta/PlatformClock;", "", "", "getCurrentWallTime", "()J", "currentWallTime", "getTimeSinceBoot", "timeSinceBoot", "getTimeSinceBootInNanos", "timeSinceBootInNanos", "getUptimeSinceBoot", "uptimeSinceBoot"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes17.dex */
public interface PlatformClock {
    long getCurrentWallTime();

    long getTimeSinceBoot();

    long getTimeSinceBootInNanos();

    long getUptimeSinceBoot();
}
