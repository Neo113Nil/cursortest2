package androidx.work.impl;

/* loaded from: classes2.dex */
public class WorkContinuationImpl extends androidx.work.WorkContinuation {
    private static final java.lang.String TAG = androidx.work.Logger.tagWithPrefix("WorkContinuationImpl");
    private final java.util.List<java.lang.String> mAllIds;
    private boolean mEnqueued;
    private final androidx.work.ExistingWorkPolicy mExistingWorkPolicy;
    private final java.util.List<java.lang.String> mIds;
    private final java.lang.String mName;
    private androidx.work.Operation mOperation;
    private final java.util.List<androidx.work.impl.WorkContinuationImpl> mParents;
    private final java.util.List<? extends androidx.work.WorkRequest> mWork;
    private final androidx.work.impl.WorkManagerImpl mWorkManagerImpl;

    public androidx.work.impl.WorkManagerImpl getWorkManagerImpl() {
        return this.mWorkManagerImpl;
    }

    public java.lang.String getName() {
        return this.mName;
    }

    public androidx.work.ExistingWorkPolicy getExistingWorkPolicy() {
        return this.mExistingWorkPolicy;
    }

    public java.util.List<? extends androidx.work.WorkRequest> getWork() {
        return this.mWork;
    }

    public java.util.List<java.lang.String> getIds() {
        return this.mIds;
    }

    public java.util.List<java.lang.String> getAllIds() {
        return this.mAllIds;
    }

    public boolean isEnqueued() {
        return this.mEnqueued;
    }

    public void markEnqueued() {
        this.mEnqueued = true;
    }

    public java.util.List<androidx.work.impl.WorkContinuationImpl> getParents() {
        return this.mParents;
    }

    public WorkContinuationImpl(androidx.work.impl.WorkManagerImpl workManagerImpl, java.util.List<? extends androidx.work.WorkRequest> work) {
        this(workManagerImpl, null, androidx.work.ExistingWorkPolicy.KEEP, work, null);
    }

    public WorkContinuationImpl(androidx.work.impl.WorkManagerImpl workManagerImpl, java.lang.String name, androidx.work.ExistingWorkPolicy existingWorkPolicy, java.util.List<? extends androidx.work.WorkRequest> work) {
        this(workManagerImpl, name, existingWorkPolicy, work, null);
    }

    public WorkContinuationImpl(androidx.work.impl.WorkManagerImpl workManagerImpl, java.lang.String name, androidx.work.ExistingWorkPolicy existingWorkPolicy, java.util.List<? extends androidx.work.WorkRequest> work, java.util.List<androidx.work.impl.WorkContinuationImpl> parents) {
        this.mWorkManagerImpl = workManagerImpl;
        this.mName = name;
        this.mExistingWorkPolicy = existingWorkPolicy;
        this.mWork = work;
        this.mParents = parents;
        this.mIds = new java.util.ArrayList(work.size());
        this.mAllIds = new java.util.ArrayList();
        if (parents != null) {
            java.util.Iterator<androidx.work.impl.WorkContinuationImpl> it = parents.iterator();
            while (it.hasNext()) {
                this.mAllIds.addAll(it.next().mAllIds);
            }
        }
        for (int i = 0; i < work.size(); i++) {
            java.lang.String stringId = work.get(i).getStringId();
            this.mIds.add(stringId);
            this.mAllIds.add(stringId);
        }
    }

    @Override // androidx.work.WorkContinuation
    public androidx.work.WorkContinuation then(java.util.List<androidx.work.OneTimeWorkRequest> work) {
        return work.isEmpty() ? this : new androidx.work.impl.WorkContinuationImpl(this.mWorkManagerImpl, this.mName, androidx.work.ExistingWorkPolicy.KEEP, work, java.util.Collections.singletonList(this));
    }

    @Override // androidx.work.WorkContinuation
    public androidx.lifecycle.LiveData<java.util.List<androidx.work.WorkInfo>> getWorkInfosLiveData() {
        return this.mWorkManagerImpl.getWorkInfosById(this.mAllIds);
    }

    @Override // androidx.work.WorkContinuation
    public com.google.common.util.concurrent.ListenableFuture<java.util.List<androidx.work.WorkInfo>> getWorkInfos() {
        androidx.work.impl.utils.StatusRunnable<java.util.List<androidx.work.WorkInfo>> forStringIds = androidx.work.impl.utils.StatusRunnable.forStringIds(this.mWorkManagerImpl, this.mAllIds);
        this.mWorkManagerImpl.getWorkTaskExecutor().executeOnTaskThread(forStringIds);
        return forStringIds.getFuture();
    }

    @Override // androidx.work.WorkContinuation
    public androidx.work.Operation enqueue() {
        if (!this.mEnqueued) {
            androidx.work.impl.utils.EnqueueRunnable enqueueRunnable = new androidx.work.impl.utils.EnqueueRunnable(this);
            this.mWorkManagerImpl.getWorkTaskExecutor().executeOnTaskThread(enqueueRunnable);
            this.mOperation = enqueueRunnable.getOperation();
        } else {
            androidx.work.Logger.get().warning(TAG, "Already enqueued work ids (" + android.text.TextUtils.join(", ", this.mIds) + ")");
        }
        return this.mOperation;
    }

    @Override // androidx.work.WorkContinuation
    protected androidx.work.WorkContinuation combineInternal(java.util.List<androidx.work.WorkContinuation> continuations) {
        androidx.work.OneTimeWorkRequest build = new androidx.work.OneTimeWorkRequest.Builder(androidx.work.impl.workers.CombineContinuationsWorker.class).setInputMerger(androidx.work.ArrayCreatingInputMerger.class).build();
        java.util.ArrayList arrayList = new java.util.ArrayList(continuations.size());
        java.util.Iterator<androidx.work.WorkContinuation> it = continuations.iterator();
        while (it.hasNext()) {
            arrayList.add((androidx.work.impl.WorkContinuationImpl) it.next());
        }
        return new androidx.work.impl.WorkContinuationImpl(this.mWorkManagerImpl, null, androidx.work.ExistingWorkPolicy.KEEP, java.util.Collections.singletonList(build), arrayList);
    }

    public boolean hasCycles() {
        return hasCycles(this, new java.util.HashSet());
    }

    private static boolean hasCycles(androidx.work.impl.WorkContinuationImpl continuation, java.util.Set<java.lang.String> visited) {
        visited.addAll(continuation.getIds());
        java.util.Set<java.lang.String> prerequisitesFor = prerequisitesFor(continuation);
        java.util.Iterator<java.lang.String> it = visited.iterator();
        while (it.hasNext()) {
            if (prerequisitesFor.contains(it.next())) {
                return true;
            }
        }
        java.util.List<androidx.work.impl.WorkContinuationImpl> parents = continuation.getParents();
        if (parents != null && !parents.isEmpty()) {
            java.util.Iterator<androidx.work.impl.WorkContinuationImpl> it2 = parents.iterator();
            while (it2.hasNext()) {
                if (hasCycles(it2.next(), visited)) {
                    return true;
                }
            }
        }
        visited.removeAll(continuation.getIds());
        return false;
    }

    public static java.util.Set<java.lang.String> prerequisitesFor(androidx.work.impl.WorkContinuationImpl continuation) {
        java.util.HashSet hashSet = new java.util.HashSet();
        java.util.List<androidx.work.impl.WorkContinuationImpl> parents = continuation.getParents();
        if (parents != null && !parents.isEmpty()) {
            java.util.Iterator<androidx.work.impl.WorkContinuationImpl> it = parents.iterator();
            while (it.hasNext()) {
                hashSet.addAll(it.next().getIds());
            }
        }
        return hashSet;
    }
}
