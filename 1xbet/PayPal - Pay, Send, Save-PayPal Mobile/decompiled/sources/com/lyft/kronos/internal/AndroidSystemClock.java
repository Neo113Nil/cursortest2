package com.lyft.kronos.internal;

@kotlin.Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0003\b\u0000\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u000f\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\u0007\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0007\u0010\u0006"}, d2 = {"Lcom/lyft/kronos/internal/AndroidSystemClock;", "Lcom/lyft/kronos/Clock;", "<init>", "()V", "", "getCurrentTimeMs", "()J", "getElapsedTimeMs"}, k = 1, mv = {1, 4, 0})
/* loaded from: classes9.dex */
public final class AndroidSystemClock implements com.lyft.kronos.Clock {
    @Override // com.lyft.kronos.Clock
    public final long getCurrentTimeMs() {
        return java.lang.System.currentTimeMillis();
    }

    @Override // com.lyft.kronos.Clock
    public final long getElapsedTimeMs() {
        return android.os.SystemClock.elapsedRealtime();
    }
}
