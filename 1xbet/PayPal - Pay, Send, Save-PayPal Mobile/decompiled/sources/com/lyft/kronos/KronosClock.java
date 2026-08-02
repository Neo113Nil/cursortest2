package com.lyft.kronos;

@kotlin.Metadata(bv = {1, 0, 3}, d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001J\u0011\u0010\u0003\u001a\u0004\u0018\u00010\u0002H&¢\u0006\u0004\b\u0003\u0010\u0004J\u000f\u0010\u0006\u001a\u00020\u0005H&¢\u0006\u0004\b\u0006\u0010\u0007J\u000f\u0010\b\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\b\u0010\tJ\u000f\u0010\u000b\u001a\u00020\nH&¢\u0006\u0004\b\u000b\u0010\fJ\u000f\u0010\u000e\u001a\u00020\rH&¢\u0006\u0004\b\u000e\u0010\u000fJ\u000f\u0010\u0010\u001a\u00020\nH&¢\u0006\u0004\b\u0010\u0010\f"}, d2 = {"Lcom/lyft/kronos/KronosClock;", "Lcom/lyft/kronos/Clock;", "", "getCurrentNtpTimeMs", "()Ljava/lang/Long;", "Lcom/lyft/kronos/KronosTime;", "getCurrentTime", "()Lcom/lyft/kronos/KronosTime;", "getCurrentTimeMs", "()J", "", "shutdown", "()V", "", "sync", "()Z", "syncInBackground"}, k = 1, mv = {1, 4, 0})
/* loaded from: classes9.dex */
public interface KronosClock extends com.lyft.kronos.Clock {
    java.lang.Long getCurrentNtpTimeMs();

    com.lyft.kronos.KronosTime getCurrentTime();

    @Override // com.lyft.kronos.Clock
    long getCurrentTimeMs();

    void shutdown();

    boolean sync();

    void syncInBackground();

    @kotlin.Metadata(bv = {1, 0, 3}, k = 3, mv = {1, 4, 0})
    public static final class DefaultImpls {
        public static long getCurrentTimeMs(com.lyft.kronos.KronosClock kronosClock) {
            return kronosClock.getCurrentTime().getPosixTimeMs();
        }
    }
}
