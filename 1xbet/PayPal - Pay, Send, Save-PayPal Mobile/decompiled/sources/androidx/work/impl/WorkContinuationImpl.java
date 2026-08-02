package androidx.work.impl;

/* loaded from: classes3.dex */
public class WorkContinuationImpl extends androidx.work.WorkContinuation {
    private static final java.lang.String getHighSpeedVideoFpsRanges = androidx.work.Logger.tagWithPrefix("WorkContinuationImpl");
    private final java.util.List<java.lang.String> Camera2StreamConfigurationMap;
    private final java.util.List<java.lang.String> getHighResolutionOutputSizeshNQ4ISI;
    private final androidx.work.ExistingWorkPolicy getHighSpeedVideoFpsRangesFor;
    private boolean getHighSpeedVideoSizes;
    private final androidx.work.impl.WorkManagerImpl getHighSpeedVideoSizesFor;
    private androidx.work.Operation getInputFormats;
    private final java.lang.String getInputSizeshNQ4ISI;
    private final java.util.List<androidx.work.impl.WorkContinuationImpl> getOutputFormats;
    private final java.util.List<? extends androidx.work.WorkRequest> getOutputMinFrameDuration;

    public androidx.work.impl.WorkManagerImpl getWorkManagerImpl() {
        return this.getHighSpeedVideoSizesFor;
    }

    public java.lang.String getName() {
        return this.getInputSizeshNQ4ISI;
    }

    public androidx.work.ExistingWorkPolicy getExistingWorkPolicy() {
        return this.getHighSpeedVideoFpsRangesFor;
    }

    public java.util.List<? extends androidx.work.WorkRequest> getWork() {
        return this.getOutputMinFrameDuration;
    }

    public java.util.List<java.lang.String> getIds() {
        return this.getHighResolutionOutputSizeshNQ4ISI;
    }

    public java.util.List<java.lang.String> getAllIds() {
        return this.Camera2StreamConfigurationMap;
    }

    public boolean isEnqueued() {
        return this.getHighSpeedVideoSizes;
    }

    public void markEnqueued() {
        this.getHighSpeedVideoSizes = true;
    }

    public java.util.List<androidx.work.impl.WorkContinuationImpl> getParents() {
        return this.getOutputFormats;
    }

    public WorkContinuationImpl(androidx.work.impl.WorkManagerImpl workManagerImpl, java.util.List<? extends androidx.work.WorkRequest> list) {
        this(workManagerImpl, null, androidx.work.ExistingWorkPolicy.KEEP, list, null);
    }

    public WorkContinuationImpl(androidx.work.impl.WorkManagerImpl workManagerImpl, java.lang.String str, androidx.work.ExistingWorkPolicy existingWorkPolicy, java.util.List<? extends androidx.work.WorkRequest> list) {
        this(workManagerImpl, str, existingWorkPolicy, list, null);
    }

    public WorkContinuationImpl(androidx.work.impl.WorkManagerImpl workManagerImpl, java.lang.String str, androidx.work.ExistingWorkPolicy existingWorkPolicy, java.util.List<? extends androidx.work.WorkRequest> list, java.util.List<androidx.work.impl.WorkContinuationImpl> list2) {
        this.getHighSpeedVideoSizesFor = workManagerImpl;
        this.getInputSizeshNQ4ISI = str;
        this.getHighSpeedVideoFpsRangesFor = existingWorkPolicy;
        this.getOutputMinFrameDuration = list;
        this.getOutputFormats = list2;
        this.getHighResolutionOutputSizeshNQ4ISI = new java.util.ArrayList(list.size());
        this.Camera2StreamConfigurationMap = new java.util.ArrayList();
        if (list2 != null) {
            java.util.Iterator<androidx.work.impl.WorkContinuationImpl> it = list2.iterator();
            while (it.hasNext()) {
                this.Camera2StreamConfigurationMap.addAll(it.next().Camera2StreamConfigurationMap);
            }
        }
        for (int i = 0; i < list.size(); i++) {
            if (existingWorkPolicy == androidx.work.ExistingWorkPolicy.REPLACE && list.get(i).getWorkSpec().getNextScheduleTimeOverride() != Long.MAX_VALUE) {
                throw new java.lang.IllegalArgumentException("Next Schedule Time Override must be used with ExistingPeriodicWorkPolicyUPDATE (preferably) or KEEP");
            }
            java.lang.String stringId = list.get(i).getStringId();
            this.getHighResolutionOutputSizeshNQ4ISI.add(stringId);
            this.Camera2StreamConfigurationMap.add(stringId);
        }
    }

    @Override // androidx.work.WorkContinuation
    public androidx.work.WorkContinuation then(java.util.List<androidx.work.OneTimeWorkRequest> list) {
        return list.isEmpty() ? this : new androidx.work.impl.WorkContinuationImpl(this.getHighSpeedVideoSizesFor, this.getInputSizeshNQ4ISI, androidx.work.ExistingWorkPolicy.KEEP, list, java.util.Collections.singletonList(this));
    }

    @Override // androidx.work.WorkContinuation
    public androidx.view.LiveData<java.util.List<androidx.work.WorkInfo>> getWorkInfosLiveData() {
        androidx.work.impl.WorkManagerImpl workManagerImpl = this.getHighSpeedVideoSizesFor;
        return androidx.work.impl.utils.LiveDataUtils.dedupedMappedLiveDataFor(workManagerImpl.getHighResolutionOutputSizeshNQ4ISI.workSpecDao().getWorkStatusPojoLiveDataForIds(this.Camera2StreamConfigurationMap), androidx.work.impl.model.WorkSpec.WORK_INFO_MAPPER, workManagerImpl.getHighSpeedVideoSizes);
    }

    @Override // androidx.work.WorkContinuation
    public com.google.common.util.concurrent.ListenableFuture<java.util.List<androidx.work.WorkInfo>> getWorkInfos() {
        return androidx.work.impl.utils.StatusRunnable.forStringIds(this.getHighSpeedVideoSizesFor.getWorkDatabase(), this.getHighSpeedVideoSizesFor.getWorkTaskExecutor(), this.Camera2StreamConfigurationMap);
    }

    @Override // androidx.work.WorkContinuation
    public androidx.work.Operation enqueue() {
        if (!this.getHighSpeedVideoSizes) {
            androidx.work.Tracer tracer = this.getHighSpeedVideoSizesFor.getConfiguration().getTracer();
            java.lang.StringBuilder sb = new java.lang.StringBuilder("EnqueueRunnable_");
            sb.append(getExistingWorkPolicy().name());
            this.getInputFormats = androidx.work.OperationKt.launchOperation(tracer, sb.toString(), this.getHighSpeedVideoSizesFor.getWorkTaskExecutor().getSerialTaskExecutor(), new kotlin.jvm.functions.Function0() { // from class: androidx.work.impl.WorkContinuationImpl$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function0
                public final java.lang.Object invoke() {
                    androidx.work.impl.utils.EnqueueRunnable.enqueue(androidx.work.impl.WorkContinuationImpl.this);
                    return kotlin.Unit.INSTANCE;
                }
            });
        } else {
            androidx.work.Logger logger = androidx.work.Logger.get();
            java.lang.String str = getHighSpeedVideoFpsRanges;
            java.lang.StringBuilder sb2 = new java.lang.StringBuilder("Already enqueued work ids (");
            sb2.append(android.text.TextUtils.join(", ", this.getHighResolutionOutputSizeshNQ4ISI));
            sb2.append(")");
            logger.warning(str, sb2.toString());
        }
        return this.getInputFormats;
    }

    @Override // androidx.work.WorkContinuation
    public androidx.work.WorkContinuation combineInternal(java.util.List<androidx.work.WorkContinuation> list) {
        androidx.work.OneTimeWorkRequest build = new androidx.work.OneTimeWorkRequest.Builder((java.lang.Class<? extends androidx.work.ListenableWorker>) androidx.work.impl.workers.CombineContinuationsWorker.class).setInputMerger(androidx.work.ArrayCreatingInputMerger.class).build();
        java.util.ArrayList arrayList = new java.util.ArrayList(list.size());
        java.util.Iterator<androidx.work.WorkContinuation> it = list.iterator();
        while (it.hasNext()) {
            arrayList.add((androidx.work.impl.WorkContinuationImpl) it.next());
        }
        return new androidx.work.impl.WorkContinuationImpl(this.getHighSpeedVideoSizesFor, null, androidx.work.ExistingWorkPolicy.KEEP, java.util.Collections.singletonList(build), arrayList);
    }

    public boolean hasCycles() {
        return Camera2StreamConfigurationMap(this, new java.util.HashSet());
    }

    private static boolean Camera2StreamConfigurationMap(androidx.work.impl.WorkContinuationImpl workContinuationImpl, java.util.Set<java.lang.String> set) {
        set.addAll(workContinuationImpl.getIds());
        java.util.Set<java.lang.String> prerequisitesFor = prerequisitesFor(workContinuationImpl);
        java.util.Iterator<java.lang.String> it = set.iterator();
        while (it.hasNext()) {
            if (prerequisitesFor.contains(it.next())) {
                return true;
            }
        }
        java.util.List<androidx.work.impl.WorkContinuationImpl> parents = workContinuationImpl.getParents();
        if (parents != null && !parents.isEmpty()) {
            java.util.Iterator<androidx.work.impl.WorkContinuationImpl> it2 = parents.iterator();
            while (it2.hasNext()) {
                if (Camera2StreamConfigurationMap(it2.next(), set)) {
                    return true;
                }
            }
        }
        set.removeAll(workContinuationImpl.getIds());
        return false;
    }

    public static java.util.Set<java.lang.String> prerequisitesFor(androidx.work.impl.WorkContinuationImpl workContinuationImpl) {
        java.util.HashSet hashSet = new java.util.HashSet();
        java.util.List<androidx.work.impl.WorkContinuationImpl> parents = workContinuationImpl.getParents();
        if (parents != null && !parents.isEmpty()) {
            java.util.Iterator<androidx.work.impl.WorkContinuationImpl> it = parents.iterator();
            while (it.hasNext()) {
                hashSet.addAll(it.next().getIds());
            }
        }
        return hashSet;
    }
}
