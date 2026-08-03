package androidx.work.impl.workers;

/* compiled from: DiagnosticsWorker.kt */
@kotlin.Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\b\u0010\u0007\u001a\u00020\bH\u0016¨\u0006\t"}, d2 = {"Landroidx/work/impl/workers/DiagnosticsWorker;", "Landroidx/work/Worker;", "context", "Landroid/content/Context;", "parameters", "Landroidx/work/WorkerParameters;", "(Landroid/content/Context;Landroidx/work/WorkerParameters;)V", "doWork", "Landroidx/work/ListenableWorker$Result;", "work-runtime_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
/* loaded from: classes2.dex */
public final class DiagnosticsWorker extends androidx.work.Worker {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DiagnosticsWorker(android.content.Context context, androidx.work.WorkerParameters parameters) {
        super(context, parameters);
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(context, "context");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(parameters, "parameters");
    }

    @Override // androidx.work.Worker
    public androidx.work.ListenableWorker.Result doWork() {
        java.lang.String str;
        java.lang.String str2;
        java.lang.String workSpecRows;
        java.lang.String str3;
        java.lang.String str4;
        java.lang.String workSpecRows2;
        java.lang.String str5;
        java.lang.String str6;
        java.lang.String workSpecRows3;
        androidx.work.impl.WorkManagerImpl workManagerImpl = androidx.work.impl.WorkManagerImpl.getInstance(getApplicationContext());
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(workManagerImpl, "getInstance(applicationContext)");
        androidx.work.impl.WorkDatabase workDatabase = workManagerImpl.getWorkDatabase();
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(workDatabase, "workManager.workDatabase");
        androidx.work.impl.model.WorkSpecDao workSpecDao = workDatabase.workSpecDao();
        androidx.work.impl.model.WorkNameDao workNameDao = workDatabase.workNameDao();
        androidx.work.impl.model.WorkTagDao workTagDao = workDatabase.workTagDao();
        androidx.work.impl.model.SystemIdInfoDao systemIdInfoDao = workDatabase.systemIdInfoDao();
        java.util.List<androidx.work.impl.model.WorkSpec> recentlyCompletedWork = workSpecDao.getRecentlyCompletedWork(java.lang.System.currentTimeMillis() - java.util.concurrent.TimeUnit.DAYS.toMillis(1L));
        java.util.List<androidx.work.impl.model.WorkSpec> runningWork = workSpecDao.getRunningWork();
        java.util.List<androidx.work.impl.model.WorkSpec> allEligibleWorkSpecsForScheduling = workSpecDao.getAllEligibleWorkSpecsForScheduling(200);
        if (!recentlyCompletedWork.isEmpty()) {
            androidx.work.Logger logger = androidx.work.Logger.get();
            str5 = androidx.work.impl.workers.DiagnosticsWorkerKt.TAG;
            logger.info(str5, "Recently completed work:\n\n");
            androidx.work.Logger logger2 = androidx.work.Logger.get();
            str6 = androidx.work.impl.workers.DiagnosticsWorkerKt.TAG;
            workSpecRows3 = androidx.work.impl.workers.DiagnosticsWorkerKt.workSpecRows(workNameDao, workTagDao, systemIdInfoDao, recentlyCompletedWork);
            logger2.info(str6, workSpecRows3);
        }
        if (!runningWork.isEmpty()) {
            androidx.work.Logger logger3 = androidx.work.Logger.get();
            str3 = androidx.work.impl.workers.DiagnosticsWorkerKt.TAG;
            logger3.info(str3, "Running work:\n\n");
            androidx.work.Logger logger4 = androidx.work.Logger.get();
            str4 = androidx.work.impl.workers.DiagnosticsWorkerKt.TAG;
            workSpecRows2 = androidx.work.impl.workers.DiagnosticsWorkerKt.workSpecRows(workNameDao, workTagDao, systemIdInfoDao, runningWork);
            logger4.info(str4, workSpecRows2);
        }
        if (!allEligibleWorkSpecsForScheduling.isEmpty()) {
            androidx.work.Logger logger5 = androidx.work.Logger.get();
            str = androidx.work.impl.workers.DiagnosticsWorkerKt.TAG;
            logger5.info(str, "Enqueued work:\n\n");
            androidx.work.Logger logger6 = androidx.work.Logger.get();
            str2 = androidx.work.impl.workers.DiagnosticsWorkerKt.TAG;
            workSpecRows = androidx.work.impl.workers.DiagnosticsWorkerKt.workSpecRows(workNameDao, workTagDao, systemIdInfoDao, allEligibleWorkSpecsForScheduling);
            logger6.info(str2, workSpecRows);
        }
        androidx.work.ListenableWorker.Result success = androidx.work.ListenableWorker.Result.success();
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(success, "success()");
        return success;
    }
}
