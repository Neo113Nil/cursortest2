package com.google.android.exoplayer2.upstream;

@java.lang.Deprecated
/* loaded from: classes3.dex */
public final class PriorityDataSourceFactory implements com.google.android.exoplayer2.upstream.DataSource.Factory {
    private final int priority;
    private final com.google.android.exoplayer2.util.PriorityTaskManager priorityTaskManager;
    private final com.google.android.exoplayer2.upstream.DataSource.Factory upstreamFactory;

    public PriorityDataSourceFactory(com.google.android.exoplayer2.upstream.DataSource.Factory factory, com.google.android.exoplayer2.util.PriorityTaskManager priorityTaskManager, int i) {
        this.upstreamFactory = factory;
        this.priorityTaskManager = priorityTaskManager;
        this.priority = i;
    }

    @Override // com.google.android.exoplayer2.upstream.DataSource.Factory
    public com.google.android.exoplayer2.upstream.PriorityDataSource createDataSource() {
        return new com.google.android.exoplayer2.upstream.PriorityDataSource(this.upstreamFactory.createDataSource(), this.priorityTaskManager, this.priority);
    }
}
