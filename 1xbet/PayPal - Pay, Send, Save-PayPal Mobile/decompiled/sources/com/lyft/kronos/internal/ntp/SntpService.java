package com.lyft.kronos.internal.ntp;

@kotlin.Metadata(bv = {1, 0, 3}, d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\b`\u0018\u00002\u00020\u0001J\u0011\u0010\u0003\u001a\u0004\u0018\u00010\u0002H&¢\u0006\u0004\b\u0003\u0010\u0004J\u000f\u0010\u0006\u001a\u00020\u0005H\u0016¢\u0006\u0004\b\u0006\u0010\u0007J\u000f\u0010\t\u001a\u00020\bH&¢\u0006\u0004\b\t\u0010\nJ\u000f\u0010\f\u001a\u00020\u000bH&¢\u0006\u0004\b\f\u0010\rJ\u000f\u0010\u000e\u001a\u00020\bH&¢\u0006\u0004\b\u000e\u0010\n"}, d2 = {"Lcom/lyft/kronos/internal/ntp/SntpService;", "", "Lcom/lyft/kronos/KronosTime;", "currentTime", "()Lcom/lyft/kronos/KronosTime;", "", "currentTimeMs", "()J", "", "shutdown", "()V", "", "sync", "()Z", "syncInBackground"}, k = 1, mv = {1, 4, 0})
/* loaded from: classes9.dex */
public interface SntpService {
    com.lyft.kronos.KronosTime currentTime();

    long currentTimeMs();

    void shutdown();

    boolean sync();

    void syncInBackground();

    @kotlin.Metadata(bv = {1, 0, 3}, k = 3, mv = {1, 4, 0})
    public static final class DefaultImpls {
        public static long currentTimeMs(com.lyft.kronos.internal.ntp.SntpService sntpService) {
            com.lyft.kronos.KronosTime currentTime = sntpService.currentTime();
            if (currentTime != null) {
                return currentTime.getPosixTimeMs();
            }
            return 0L;
        }
    }
}
