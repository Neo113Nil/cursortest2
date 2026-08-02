package com.zettle.sdk.meta;

@kotlin.Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\t\b\u0000\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0007\u001a\u00020\u00048WX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0005\u0010\u0006R\u0014\u0010\t\u001a\u00020\u00048WX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\b\u0010\u0006R\u0014\u0010\u000b\u001a\u00020\u00048WX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\n\u0010\u0006R\u0014\u0010\r\u001a\u00020\u00048WX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\f\u0010\u0006"}, d2 = {"Lcom/zettle/sdk/meta/PlatformSystemClock;", "Lcom/zettle/sdk/meta/PlatformClock;", "<init>", "()V", "", "getCurrentWallTime", "()J", "currentWallTime", "getTimeSinceBoot", "timeSinceBoot", "getTimeSinceBootInNanos", "timeSinceBootInNanos", "getUptimeSinceBoot", "uptimeSinceBoot"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes17.dex */
public final class PlatformSystemClock implements com.zettle.sdk.meta.PlatformClock {
    @Override // com.zettle.sdk.meta.PlatformClock
    public final long getUptimeSinceBoot() {
        return android.os.SystemClock.uptimeMillis();
    }

    @Override // com.zettle.sdk.meta.PlatformClock
    public final long getTimeSinceBoot() {
        return android.os.SystemClock.elapsedRealtime();
    }

    @Override // com.zettle.sdk.meta.PlatformClock
    public final long getTimeSinceBootInNanos() {
        return android.os.SystemClock.elapsedRealtimeNanos();
    }

    @Override // com.zettle.sdk.meta.PlatformClock
    public final long getCurrentWallTime() {
        return java.lang.System.currentTimeMillis();
    }
}
