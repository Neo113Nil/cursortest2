package androidx.work;

import android.annotation.SuppressLint;
import android.app.PendingIntent;
import android.content.Context;
import androidx.lifecycle.LiveData;
import androidx.work.impl.WorkManagerImpl;
import com.google.common.util.concurrent.u;
import java.util.List;
import java.util.UUID;
import kotlin.Deprecated;
import kotlin.Metadata;
import kotlin.ReplaceWith;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.flow.InterfaceC1060e;

@Metadata(d1 = {"\u0000\u0096\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\b'\u0018\u0000 U2\u00020\u0001:\u0002UVB\t\b\u0000¢\u0006\u0004\b\u0002\u0010\u0003J\u0015\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0007\u0010\bJ\u001d\u0010\u0007\u001a\u00020\u00062\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00040\tH&¢\u0006\u0004\b\u0007\u0010\u000bJ\u0015\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0005\u001a\u00020\f¢\u0006\u0004\b\u000e\u0010\u000fJ\u001d\u0010\u000e\u001a\u00020\r2\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\f0\tH&¢\u0006\u0004\b\u000e\u0010\u0010J%\u0010\u0015\u001a\u00020\r2\u0006\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0005\u001a\u00020\f¢\u0006\u0004\b\u0015\u0010\u0016J-\u0010\u0015\u001a\u00020\r2\u0006\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0014\u001a\u00020\u00132\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\f0\tH&¢\u0006\u0004\b\u0015\u0010\u0017J'\u0010\u0018\u001a\u00020\u00062\u0006\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0005\u001a\u00020\fH\u0016¢\u0006\u0004\b\u0018\u0010\u0019J-\u0010\u0018\u001a\u00020\u00062\u0006\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0014\u001a\u00020\u00132\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\f0\tH&¢\u0006\u0004\b\u0018\u0010\u001aJ'\u0010\u001e\u001a\u00020\u00062\u0006\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u001c\u001a\u00020\u001b2\u0006\u0010\u0005\u001a\u00020\u001dH&¢\u0006\u0004\b\u001e\u0010\u001fJ\u0017\u0010\"\u001a\u00020\u00062\u0006\u0010!\u001a\u00020 H&¢\u0006\u0004\b\"\u0010#J\u0017\u0010%\u001a\u00020\u00062\u0006\u0010$\u001a\u00020\u0011H&¢\u0006\u0004\b%\u0010&J\u0017\u0010'\u001a\u00020\u00062\u0006\u0010\u0012\u001a\u00020\u0011H&¢\u0006\u0004\b'\u0010&J\u000f\u0010(\u001a\u00020\u0006H&¢\u0006\u0004\b(\u0010)J\u0017\u0010+\u001a\u00020*2\u0006\u0010!\u001a\u00020 H&¢\u0006\u0004\b+\u0010,J\u000f\u0010-\u001a\u00020\u0006H&¢\u0006\u0004\b-\u0010)J\u0015\u00100\u001a\b\u0012\u0004\u0012\u00020/0.H&¢\u0006\u0004\b0\u00101J\u0015\u00103\u001a\b\u0012\u0004\u0012\u00020/02H&¢\u0006\u0004\b3\u00104J\u001f\u00106\u001a\n\u0012\u0006\u0012\u0004\u0018\u0001050.2\u0006\u0010!\u001a\u00020 H&¢\u0006\u0004\b6\u00107J\u001f\u00109\u001a\n\u0012\u0006\u0012\u0004\u0018\u000105082\u0006\u0010!\u001a\u00020 H&¢\u0006\u0004\b9\u0010:J\u001f\u0010;\u001a\n\u0012\u0006\u0012\u0004\u0018\u000105022\u0006\u0010!\u001a\u00020 H&¢\u0006\u0004\b;\u0010<J#\u0010=\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u0002050\t0.2\u0006\u0010$\u001a\u00020\u0011H&¢\u0006\u0004\b=\u0010>J#\u0010?\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u0002050\t082\u0006\u0010$\u001a\u00020\u0011H&¢\u0006\u0004\b?\u0010@J#\u0010A\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u0002050\t022\u0006\u0010$\u001a\u00020\u0011H&¢\u0006\u0004\bA\u0010BJ#\u0010C\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u0002050\t0.2\u0006\u0010\u0012\u001a\u00020\u0011H&¢\u0006\u0004\bC\u0010>J#\u0010D\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u0002050\t082\u0006\u0010\u0012\u001a\u00020\u0011H&¢\u0006\u0004\bD\u0010@J#\u0010E\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u0002050\t022\u0006\u0010\u0012\u001a\u00020\u0011H&¢\u0006\u0004\bE\u0010BJ#\u0010H\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u0002050\t0.2\u0006\u0010G\u001a\u00020FH&¢\u0006\u0004\bH\u0010IJ#\u0010J\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u0002050\t082\u0006\u0010G\u001a\u00020FH&¢\u0006\u0004\bJ\u0010KJ#\u0010L\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u0002050\t022\u0006\u0010G\u001a\u00020FH&¢\u0006\u0004\bL\u0010MJ\u001d\u0010O\u001a\b\u0012\u0004\u0012\u00020N022\u0006\u0010\u0005\u001a\u00020\u0004H&¢\u0006\u0004\bO\u0010PR\u0014\u0010T\u001a\u00020Q8&X¦\u0004¢\u0006\u0006\u001a\u0004\bR\u0010S¨\u0006W"}, d2 = {"Landroidx/work/WorkManager;", "", "<init>", "()V", "Landroidx/work/WorkRequest;", "request", "Landroidx/work/Operation;", "enqueue", "(Landroidx/work/WorkRequest;)Landroidx/work/Operation;", "", "requests", "(Ljava/util/List;)Landroidx/work/Operation;", "Landroidx/work/OneTimeWorkRequest;", "Landroidx/work/WorkContinuation;", "beginWith", "(Landroidx/work/OneTimeWorkRequest;)Landroidx/work/WorkContinuation;", "(Ljava/util/List;)Landroidx/work/WorkContinuation;", "", "uniqueWorkName", "Landroidx/work/ExistingWorkPolicy;", "existingWorkPolicy", "beginUniqueWork", "(Ljava/lang/String;Landroidx/work/ExistingWorkPolicy;Landroidx/work/OneTimeWorkRequest;)Landroidx/work/WorkContinuation;", "(Ljava/lang/String;Landroidx/work/ExistingWorkPolicy;Ljava/util/List;)Landroidx/work/WorkContinuation;", "enqueueUniqueWork", "(Ljava/lang/String;Landroidx/work/ExistingWorkPolicy;Landroidx/work/OneTimeWorkRequest;)Landroidx/work/Operation;", "(Ljava/lang/String;Landroidx/work/ExistingWorkPolicy;Ljava/util/List;)Landroidx/work/Operation;", "Landroidx/work/ExistingPeriodicWorkPolicy;", "existingPeriodicWorkPolicy", "Landroidx/work/PeriodicWorkRequest;", "enqueueUniquePeriodicWork", "(Ljava/lang/String;Landroidx/work/ExistingPeriodicWorkPolicy;Landroidx/work/PeriodicWorkRequest;)Landroidx/work/Operation;", "Ljava/util/UUID;", "id", "cancelWorkById", "(Ljava/util/UUID;)Landroidx/work/Operation;", "tag", "cancelAllWorkByTag", "(Ljava/lang/String;)Landroidx/work/Operation;", "cancelUniqueWork", "cancelAllWork", "()Landroidx/work/Operation;", "Landroid/app/PendingIntent;", "createCancelPendingIntent", "(Ljava/util/UUID;)Landroid/app/PendingIntent;", "pruneWork", "Landroidx/lifecycle/LiveData;", "", "getLastCancelAllTimeMillisLiveData", "()Landroidx/lifecycle/LiveData;", "Lcom/google/common/util/concurrent/u;", "getLastCancelAllTimeMillis", "()Lcom/google/common/util/concurrent/u;", "Landroidx/work/WorkInfo;", "getWorkInfoByIdLiveData", "(Ljava/util/UUID;)Landroidx/lifecycle/LiveData;", "Lkotlinx/coroutines/flow/e;", "getWorkInfoByIdFlow", "(Ljava/util/UUID;)Lkotlinx/coroutines/flow/e;", "getWorkInfoById", "(Ljava/util/UUID;)Lcom/google/common/util/concurrent/u;", "getWorkInfosByTagLiveData", "(Ljava/lang/String;)Landroidx/lifecycle/LiveData;", "getWorkInfosByTagFlow", "(Ljava/lang/String;)Lkotlinx/coroutines/flow/e;", "getWorkInfosByTag", "(Ljava/lang/String;)Lcom/google/common/util/concurrent/u;", "getWorkInfosForUniqueWorkLiveData", "getWorkInfosForUniqueWorkFlow", "getWorkInfosForUniqueWork", "Landroidx/work/WorkQuery;", "workQuery", "getWorkInfosLiveData", "(Landroidx/work/WorkQuery;)Landroidx/lifecycle/LiveData;", "getWorkInfosFlow", "(Landroidx/work/WorkQuery;)Lkotlinx/coroutines/flow/e;", "getWorkInfos", "(Landroidx/work/WorkQuery;)Lcom/google/common/util/concurrent/u;", "Landroidx/work/WorkManager$UpdateResult;", "updateWork", "(Landroidx/work/WorkRequest;)Lcom/google/common/util/concurrent/u;", "Landroidx/work/Configuration;", "getConfiguration", "()Landroidx/work/Configuration;", "configuration", "Companion", "UpdateResult", "work-runtime_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
@SuppressLint({"AddedAbstractMethod"})
/* loaded from: classes3.dex */
public abstract class WorkManager {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\b\u0010\u0003\u001a\u00020\u0004H\u0017J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0017J\u0018\u0010\u0007\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\nH\u0017J\b\u0010\u000b\u001a\u00020\fH\u0017¨\u0006\r"}, d2 = {"Landroidx/work/WorkManager$Companion;", "", "()V", "getInstance", "Landroidx/work/WorkManager;", "context", "Landroid/content/Context;", "initialize", "", "configuration", "Landroidx/work/Configuration;", "isInitialized", "", "work-runtime_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @Deprecated(message = "Use the overload receiving Context", replaceWith = @ReplaceWith(expression = "WorkManager.getContext(context)", imports = {}))
        @JvmStatic
        public WorkManager getInstance() {
            WorkManagerImpl workManagerImpl = WorkManagerImpl.getInstance();
            if (workManagerImpl != null) {
                return workManagerImpl;
            }
            throw new IllegalStateException("WorkManager is not initialized properly.  The most likely cause is that you disabled WorkManagerInitializer in your manifest but forgot to call WorkManager#initialize in your Application#onCreate or a ContentProvider.");
        }

        @JvmStatic
        public void initialize(Context context, Configuration configuration) {
            Intrinsics.checkNotNullParameter(context, "context");
            Intrinsics.checkNotNullParameter(configuration, "configuration");
            WorkManagerImpl.initialize(context, configuration);
        }

        @JvmStatic
        public boolean isInitialized() {
            return WorkManagerImpl.isInitialized();
        }

        private Companion() {
        }

        @JvmStatic
        public WorkManager getInstance(Context context) {
            Intrinsics.checkNotNullParameter(context, "context");
            WorkManagerImpl workManagerImpl = WorkManagerImpl.getInstance(context);
            Intrinsics.checkNotNullExpressionValue(workManagerImpl, "getInstance(context)");
            return workManagerImpl;
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0005\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002j\u0002\b\u0003j\u0002\b\u0004j\u0002\b\u0005¨\u0006\u0006"}, d2 = {"Landroidx/work/WorkManager$UpdateResult;", "", "(Ljava/lang/String;I)V", "NOT_APPLIED", "APPLIED_IMMEDIATELY", "APPLIED_FOR_NEXT_RUN", "work-runtime_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public enum UpdateResult {
        NOT_APPLIED,
        APPLIED_IMMEDIATELY,
        APPLIED_FOR_NEXT_RUN
    }

    @Deprecated(message = "Use the overload receiving Context", replaceWith = @ReplaceWith(expression = "WorkManager.getContext(context)", imports = {}))
    @JvmStatic
    public static WorkManager getInstance() {
        return INSTANCE.getInstance();
    }

    @JvmStatic
    public static void initialize(Context context, Configuration configuration) {
        INSTANCE.initialize(context, configuration);
    }

    @JvmStatic
    public static boolean isInitialized() {
        return INSTANCE.isInitialized();
    }

    public final WorkContinuation beginUniqueWork(String uniqueWorkName, ExistingWorkPolicy existingWorkPolicy, OneTimeWorkRequest request) {
        Intrinsics.checkNotNullParameter(uniqueWorkName, "uniqueWorkName");
        Intrinsics.checkNotNullParameter(existingWorkPolicy, "existingWorkPolicy");
        Intrinsics.checkNotNullParameter(request, "request");
        return beginUniqueWork(uniqueWorkName, existingWorkPolicy, CollectionsKt.listOf(request));
    }

    public abstract WorkContinuation beginUniqueWork(String uniqueWorkName, ExistingWorkPolicy existingWorkPolicy, List<OneTimeWorkRequest> requests);

    public final WorkContinuation beginWith(OneTimeWorkRequest request) {
        Intrinsics.checkNotNullParameter(request, "request");
        return beginWith(CollectionsKt.listOf(request));
    }

    public abstract WorkContinuation beginWith(List<OneTimeWorkRequest> requests);

    public abstract Operation cancelAllWork();

    public abstract Operation cancelAllWorkByTag(String tag);

    public abstract Operation cancelUniqueWork(String uniqueWorkName);

    public abstract Operation cancelWorkById(UUID id2);

    public abstract PendingIntent createCancelPendingIntent(UUID id2);

    public final Operation enqueue(WorkRequest request) {
        Intrinsics.checkNotNullParameter(request, "request");
        return enqueue(CollectionsKt.listOf(request));
    }

    public abstract Operation enqueue(List<? extends WorkRequest> requests);

    public abstract Operation enqueueUniquePeriodicWork(String uniqueWorkName, ExistingPeriodicWorkPolicy existingPeriodicWorkPolicy, PeriodicWorkRequest request);

    public Operation enqueueUniqueWork(String uniqueWorkName, ExistingWorkPolicy existingWorkPolicy, OneTimeWorkRequest request) {
        Intrinsics.checkNotNullParameter(uniqueWorkName, "uniqueWorkName");
        Intrinsics.checkNotNullParameter(existingWorkPolicy, "existingWorkPolicy");
        Intrinsics.checkNotNullParameter(request, "request");
        return enqueueUniqueWork(uniqueWorkName, existingWorkPolicy, CollectionsKt.listOf(request));
    }

    public abstract Operation enqueueUniqueWork(String uniqueWorkName, ExistingWorkPolicy existingWorkPolicy, List<OneTimeWorkRequest> requests);

    public abstract Configuration getConfiguration();

    public abstract u<Long> getLastCancelAllTimeMillis();

    public abstract LiveData<Long> getLastCancelAllTimeMillisLiveData();

    public abstract u<WorkInfo> getWorkInfoById(UUID id2);

    public abstract InterfaceC1060e<WorkInfo> getWorkInfoByIdFlow(UUID id2);

    public abstract LiveData<WorkInfo> getWorkInfoByIdLiveData(UUID id2);

    public abstract u<List<WorkInfo>> getWorkInfos(WorkQuery workQuery);

    public abstract u<List<WorkInfo>> getWorkInfosByTag(String tag);

    public abstract InterfaceC1060e<List<WorkInfo>> getWorkInfosByTagFlow(String tag);

    public abstract LiveData<List<WorkInfo>> getWorkInfosByTagLiveData(String tag);

    public abstract InterfaceC1060e<List<WorkInfo>> getWorkInfosFlow(WorkQuery workQuery);

    public abstract u<List<WorkInfo>> getWorkInfosForUniqueWork(String uniqueWorkName);

    public abstract InterfaceC1060e<List<WorkInfo>> getWorkInfosForUniqueWorkFlow(String uniqueWorkName);

    public abstract LiveData<List<WorkInfo>> getWorkInfosForUniqueWorkLiveData(String uniqueWorkName);

    public abstract LiveData<List<WorkInfo>> getWorkInfosLiveData(WorkQuery workQuery);

    public abstract Operation pruneWork();

    public abstract u<UpdateResult> updateWork(WorkRequest request);

    @JvmStatic
    public static WorkManager getInstance(Context context) {
        return INSTANCE.getInstance(context);
    }
}
