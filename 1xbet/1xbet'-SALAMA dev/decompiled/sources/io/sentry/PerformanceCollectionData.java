package io.sentry;

/* JADX INFO: loaded from: classes2.dex */
public final class PerformanceCollectionData {
    private final long nanoTimestamp;
    private Double cpuUsagePercentage = null;
    private Long usedHeapMemory = null;
    private Long usedNativeMemory = null;

    public PerformanceCollectionData(long j) {
        this.nanoTimestamp = j;
    }

    public Double getCpuUsagePercentage() {
        return this.cpuUsagePercentage;
    }

    public long getNanoTimestamp() {
        return this.nanoTimestamp;
    }

    public Long getUsedHeapMemory() {
        return this.usedHeapMemory;
    }

    public Long getUsedNativeMemory() {
        return this.usedNativeMemory;
    }

    public void setCpuUsagePercentage(Double d7) {
        this.cpuUsagePercentage = d7;
    }

    public void setUsedHeapMemory(Long l7) {
        this.usedHeapMemory = l7;
    }

    public void setUsedNativeMemory(Long l7) {
        this.usedNativeMemory = l7;
    }
}
