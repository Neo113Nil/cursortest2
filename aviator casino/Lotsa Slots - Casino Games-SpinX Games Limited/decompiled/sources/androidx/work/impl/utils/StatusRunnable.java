package androidx.work.impl.utils;

/* loaded from: classes2.dex */
public abstract class StatusRunnable<T> implements java.lang.Runnable {
    private final androidx.work.impl.utils.futures.SettableFuture<T> mFuture = androidx.work.impl.utils.futures.SettableFuture.create();

    abstract T runInternal();

    @Override // java.lang.Runnable
    public void run() {
        try {
            this.mFuture.set(runInternal());
        } catch (java.lang.Throwable th) {
            this.mFuture.setException(th);
        }
    }

    public com.google.common.util.concurrent.ListenableFuture<T> getFuture() {
        return this.mFuture;
    }

    public static androidx.work.impl.utils.StatusRunnable<java.util.List<androidx.work.WorkInfo>> forStringIds(final androidx.work.impl.WorkManagerImpl workManager, final java.util.List<java.lang.String> ids) {
        return new androidx.work.impl.utils.StatusRunnable<java.util.List<androidx.work.WorkInfo>>() { // from class: androidx.work.impl.utils.StatusRunnable.1
            @Override // androidx.work.impl.utils.StatusRunnable
            public java.util.List<androidx.work.WorkInfo> runInternal() {
                return androidx.work.impl.model.WorkSpec.WORK_INFO_MAPPER.apply(androidx.work.impl.WorkManagerImpl.this.getWorkDatabase().workSpecDao().getWorkStatusPojoForIds(ids));
            }
        };
    }

    public static androidx.work.impl.utils.StatusRunnable<androidx.work.WorkInfo> forUUID(final androidx.work.impl.WorkManagerImpl workManager, final java.util.UUID id) {
        return new androidx.work.impl.utils.StatusRunnable<androidx.work.WorkInfo>() { // from class: androidx.work.impl.utils.StatusRunnable.2
            /* JADX INFO: Access modifiers changed from: package-private */
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // androidx.work.impl.utils.StatusRunnable
            public androidx.work.WorkInfo runInternal() {
                androidx.work.impl.model.WorkSpec.WorkInfoPojo workStatusPojoForId = androidx.work.impl.WorkManagerImpl.this.getWorkDatabase().workSpecDao().getWorkStatusPojoForId(id.toString());
                if (workStatusPojoForId != null) {
                    return workStatusPojoForId.toWorkInfo();
                }
                return null;
            }
        };
    }

    public static androidx.work.impl.utils.StatusRunnable<java.util.List<androidx.work.WorkInfo>> forTag(final androidx.work.impl.WorkManagerImpl workManager, final java.lang.String tag) {
        return new androidx.work.impl.utils.StatusRunnable<java.util.List<androidx.work.WorkInfo>>() { // from class: androidx.work.impl.utils.StatusRunnable.3
            /* JADX INFO: Access modifiers changed from: package-private */
            @Override // androidx.work.impl.utils.StatusRunnable
            public java.util.List<androidx.work.WorkInfo> runInternal() {
                return androidx.work.impl.model.WorkSpec.WORK_INFO_MAPPER.apply(androidx.work.impl.WorkManagerImpl.this.getWorkDatabase().workSpecDao().getWorkStatusPojoForTag(tag));
            }
        };
    }

    public static androidx.work.impl.utils.StatusRunnable<java.util.List<androidx.work.WorkInfo>> forUniqueWork(final androidx.work.impl.WorkManagerImpl workManager, final java.lang.String name) {
        return new androidx.work.impl.utils.StatusRunnable<java.util.List<androidx.work.WorkInfo>>() { // from class: androidx.work.impl.utils.StatusRunnable.4
            /* JADX INFO: Access modifiers changed from: package-private */
            @Override // androidx.work.impl.utils.StatusRunnable
            public java.util.List<androidx.work.WorkInfo> runInternal() {
                return androidx.work.impl.model.WorkSpec.WORK_INFO_MAPPER.apply(androidx.work.impl.WorkManagerImpl.this.getWorkDatabase().workSpecDao().getWorkStatusPojoForName(name));
            }
        };
    }

    public static androidx.work.impl.utils.StatusRunnable<java.util.List<androidx.work.WorkInfo>> forWorkQuerySpec(final androidx.work.impl.WorkManagerImpl workManager, final androidx.work.WorkQuery querySpec) {
        return new androidx.work.impl.utils.StatusRunnable<java.util.List<androidx.work.WorkInfo>>() { // from class: androidx.work.impl.utils.StatusRunnable.5
            /* JADX INFO: Access modifiers changed from: package-private */
            @Override // androidx.work.impl.utils.StatusRunnable
            public java.util.List<androidx.work.WorkInfo> runInternal() {
                return androidx.work.impl.model.WorkSpec.WORK_INFO_MAPPER.apply(androidx.work.impl.WorkManagerImpl.this.getWorkDatabase().rawWorkInfoDao().getWorkInfoPojos(androidx.work.impl.utils.RawQueries.toRawQuery(querySpec)));
            }
        };
    }
}
