package com.lyft.kronos;

@kotlin.Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u000b\bf\u0018\u00002\u00020\u0001J\u000f\u0010\u0003\u001a\u00020\u0002H&¢\u0006\u0004\b\u0003\u0010\u0004R\u001c\u0010\n\u001a\u00020\u00058'@'X¦\u000e¢\u0006\f\u001a\u0004\b\u0006\u0010\u0007\"\u0004\b\b\u0010\tR\u001c\u0010\r\u001a\u00020\u00058'@'X¦\u000e¢\u0006\f\u001a\u0004\b\u000b\u0010\u0007\"\u0004\b\f\u0010\tR\u001c\u0010\u0010\u001a\u00020\u00058'@'X¦\u000e¢\u0006\f\u001a\u0004\b\u000e\u0010\u0007\"\u0004\b\u000f\u0010\t"}, d2 = {"Lcom/lyft/kronos/SyncResponseCache;", "", "", "clear", "()V", "", "getCurrentOffset", "()J", "setCurrentOffset", "(J)V", "currentOffset", "getCurrentTime", "setCurrentTime", "currentTime", "getElapsedTime", "setElapsedTime", "elapsedTime"}, k = 1, mv = {1, 4, 0})
/* loaded from: classes9.dex */
public interface SyncResponseCache {
    void clear();

    long getCurrentOffset();

    long getCurrentTime();

    long getElapsedTime();

    void setCurrentOffset(long j);

    void setCurrentTime(long j);

    void setElapsedTime(long j);
}
