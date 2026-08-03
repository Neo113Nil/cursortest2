package androidx.work.impl.model;

/* compiled from: WorkSpecDao.kt */
@kotlin.Metadata(d1 = {"\u0000^\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u000b\n\u0002\b\u0012\bg\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H'J\u0016\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u00072\u0006\u0010\t\u001a\u00020\nH'J\u000e\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00050\u0007H'J\u000e\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00050\u0007H'J\u0014\u0010\r\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u00070\u000eH'J\u0016\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\b0\u00072\u0006\u0010\u0010\u001a\u00020\nH'J\u0016\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00120\u00072\u0006\u0010\u0004\u001a\u00020\u0005H'J\u0016\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\b0\u00072\u0006\u0010\u0014\u001a\u00020\u0015H'J\u000e\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\b0\u0007H'J\u0016\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00150\u000e2\u0006\u0010\u0004\u001a\u00020\u0005H'J\u000e\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\b0\u0007H'J\u0012\u0010\u0019\u001a\u0004\u0018\u00010\u001a2\u0006\u0010\u0004\u001a\u00020\u0005H'J\u0016\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u00050\u00072\u0006\u0010\u001c\u001a\u00020\u0005H'J\u0016\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\u00050\u00072\u0006\u0010\u001e\u001a\u00020\u0005H'J\u0012\u0010\u001f\u001a\u0004\u0018\u00010\b2\u0006\u0010\u0004\u001a\u00020\u0005H'J\u0016\u0010 \u001a\b\u0012\u0004\u0012\u00020!0\u00072\u0006\u0010\u001c\u001a\u00020\u0005H'J\u0012\u0010\"\u001a\u0004\u0018\u00010#2\u0006\u0010\u0004\u001a\u00020\u0005H'J\u001c\u0010$\u001a\b\u0012\u0004\u0012\u00020#0\u00072\f\u0010%\u001a\b\u0012\u0004\u0012\u00020\u00050\u0007H'J\u0016\u0010&\u001a\b\u0012\u0004\u0012\u00020#0\u00072\u0006\u0010\u001c\u001a\u00020\u0005H'J\u0016\u0010'\u001a\b\u0012\u0004\u0012\u00020#0\u00072\u0006\u0010\u001e\u001a\u00020\u0005H'J\"\u0010(\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020#0\u00070\u000e2\f\u0010%\u001a\b\u0012\u0004\u0012\u00020\u00050\u0007H'J\u001c\u0010)\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020#0\u00070\u000e2\u0006\u0010\u001c\u001a\u00020\u0005H'J\u001c\u0010*\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020#0\u00070\u000e2\u0006\u0010\u001e\u001a\u00020\u0005H'J\b\u0010+\u001a\u00020,H'J\u0010\u0010-\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H'J\u0010\u0010.\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H'J\u0010\u0010/\u001a\u00020\n2\u0006\u0010\u0004\u001a\u00020\u0005H'J\u0010\u00100\u001a\u00020\u00032\u0006\u00101\u001a\u00020\bH'J\u0018\u00102\u001a\u00020\n2\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u00103\u001a\u00020\u0015H'J\b\u00104\u001a\u00020\u0003H'J\b\u00105\u001a\u00020\nH'J\u0010\u00106\u001a\u00020\n2\u0006\u0010\u0004\u001a\u00020\u0005H'J\u0018\u00107\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u00108\u001a\u00020\u0015H'J\u0018\u00109\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010:\u001a\u00020\u0012H'J\u0018\u0010;\u001a\u00020\n2\u0006\u0010<\u001a\u00020\u001a2\u0006\u0010\u0004\u001a\u00020\u0005H'J\u0010\u0010=\u001a\u00020\u00032\u0006\u00101\u001a\u00020\bH'¨\u0006>"}, d2 = {"Landroidx/work/impl/model/WorkSpecDao;", "", "delete", "", "id", "", "getAllEligibleWorkSpecsForScheduling", "", "Landroidx/work/impl/model/WorkSpec;", "maxLimit", "", "getAllUnfinishedWork", "getAllWorkSpecIds", "getAllWorkSpecIdsLiveData", "Landroidx/lifecycle/LiveData;", "getEligibleWorkForScheduling", "schedulerLimit", "getInputsFromPrerequisites", "Landroidx/work/Data;", "getRecentlyCompletedWork", "startingAt", "", "getRunningWork", "getScheduleRequestedAtLiveData", "getScheduledWork", "getState", "Landroidx/work/WorkInfo$State;", "getUnfinishedWorkWithName", "name", "getUnfinishedWorkWithTag", com.facebook.appevents.internal.ViewHierarchyConstants.TAG_KEY, "getWorkSpec", "getWorkSpecIdAndStatesForName", "Landroidx/work/impl/model/WorkSpec$IdAndState;", "getWorkStatusPojoForId", "Landroidx/work/impl/model/WorkSpec$WorkInfoPojo;", "getWorkStatusPojoForIds", "ids", "getWorkStatusPojoForName", "getWorkStatusPojoForTag", "getWorkStatusPojoLiveDataForIds", "getWorkStatusPojoLiveDataForName", "getWorkStatusPojoLiveDataForTag", "hasUnfinishedWork", "", "incrementGeneration", "incrementPeriodCount", "incrementWorkSpecRunAttemptCount", "insertWorkSpec", "workSpec", "markWorkSpecScheduled", "startTime", "pruneFinishedWorkWithZeroDependentsIgnoringKeepForAtLeast", "resetScheduledState", "resetWorkSpecRunAttemptCount", "setLastEnqueuedTime", "enqueueTime", "setOutput", "output", "setState", "state", "updateWorkSpec", "work-runtime_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
/* loaded from: classes2.dex */
public interface WorkSpecDao {
    void delete(java.lang.String id);

    java.util.List<androidx.work.impl.model.WorkSpec> getAllEligibleWorkSpecsForScheduling(int maxLimit);

    java.util.List<java.lang.String> getAllUnfinishedWork();

    java.util.List<java.lang.String> getAllWorkSpecIds();

    androidx.lifecycle.LiveData<java.util.List<java.lang.String>> getAllWorkSpecIdsLiveData();

    java.util.List<androidx.work.impl.model.WorkSpec> getEligibleWorkForScheduling(int schedulerLimit);

    java.util.List<androidx.work.Data> getInputsFromPrerequisites(java.lang.String id);

    java.util.List<androidx.work.impl.model.WorkSpec> getRecentlyCompletedWork(long startingAt);

    java.util.List<androidx.work.impl.model.WorkSpec> getRunningWork();

    androidx.lifecycle.LiveData<java.lang.Long> getScheduleRequestedAtLiveData(java.lang.String id);

    java.util.List<androidx.work.impl.model.WorkSpec> getScheduledWork();

    androidx.work.WorkInfo.State getState(java.lang.String id);

    java.util.List<java.lang.String> getUnfinishedWorkWithName(java.lang.String name);

    java.util.List<java.lang.String> getUnfinishedWorkWithTag(java.lang.String tag);

    androidx.work.impl.model.WorkSpec getWorkSpec(java.lang.String id);

    java.util.List<androidx.work.impl.model.WorkSpec.IdAndState> getWorkSpecIdAndStatesForName(java.lang.String name);

    androidx.work.impl.model.WorkSpec.WorkInfoPojo getWorkStatusPojoForId(java.lang.String id);

    java.util.List<androidx.work.impl.model.WorkSpec.WorkInfoPojo> getWorkStatusPojoForIds(java.util.List<java.lang.String> ids);

    java.util.List<androidx.work.impl.model.WorkSpec.WorkInfoPojo> getWorkStatusPojoForName(java.lang.String name);

    java.util.List<androidx.work.impl.model.WorkSpec.WorkInfoPojo> getWorkStatusPojoForTag(java.lang.String tag);

    androidx.lifecycle.LiveData<java.util.List<androidx.work.impl.model.WorkSpec.WorkInfoPojo>> getWorkStatusPojoLiveDataForIds(java.util.List<java.lang.String> ids);

    androidx.lifecycle.LiveData<java.util.List<androidx.work.impl.model.WorkSpec.WorkInfoPojo>> getWorkStatusPojoLiveDataForName(java.lang.String name);

    androidx.lifecycle.LiveData<java.util.List<androidx.work.impl.model.WorkSpec.WorkInfoPojo>> getWorkStatusPojoLiveDataForTag(java.lang.String tag);

    boolean hasUnfinishedWork();

    void incrementGeneration(java.lang.String id);

    void incrementPeriodCount(java.lang.String id);

    int incrementWorkSpecRunAttemptCount(java.lang.String id);

    void insertWorkSpec(androidx.work.impl.model.WorkSpec workSpec);

    int markWorkSpecScheduled(java.lang.String id, long startTime);

    void pruneFinishedWorkWithZeroDependentsIgnoringKeepForAtLeast();

    int resetScheduledState();

    int resetWorkSpecRunAttemptCount(java.lang.String id);

    void setLastEnqueuedTime(java.lang.String id, long enqueueTime);

    void setOutput(java.lang.String id, androidx.work.Data output);

    int setState(androidx.work.WorkInfo.State state, java.lang.String id);

    void updateWorkSpec(androidx.work.impl.model.WorkSpec workSpec);
}
