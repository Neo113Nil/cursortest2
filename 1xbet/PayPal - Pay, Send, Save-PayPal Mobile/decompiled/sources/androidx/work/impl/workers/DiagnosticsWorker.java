package androidx.work.impl.workers;

@kotlin.Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0000\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u000f\u0010\t\u001a\u00020\bH\u0016¢\u0006\u0004\b\t\u0010\n"}, d2 = {"Landroidx/work/impl/workers/DiagnosticsWorker;", "Landroidx/work/Worker;", "Landroid/content/Context;", "context", "Landroidx/work/WorkerParameters;", "parameters", "<init>", "(Landroid/content/Context;Landroidx/work/WorkerParameters;)V", "Landroidx/work/ListenableWorker$Result;", "doWork", "()Landroidx/work/ListenableWorker$Result;"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class DiagnosticsWorker extends androidx.work.Worker {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DiagnosticsWorker(android.content.Context context, androidx.work.WorkerParameters workerParameters) {
        super(context, workerParameters);
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(context, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(workerParameters, "");
    }

    @Override // androidx.work.Worker
    public final androidx.work.ListenableWorker.Result doWork() {
        java.lang.String str;
        java.lang.String str2;
        java.lang.String str3;
        java.lang.String str4;
        java.lang.String str5;
        java.lang.String str6;
        androidx.work.impl.WorkManagerImpl workManagerImpl = androidx.work.impl.WorkManagerImpl.getInstance(getApplicationContext());
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(workManagerImpl, "");
        androidx.work.impl.WorkDatabase workDatabase = workManagerImpl.getWorkDatabase();
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(workDatabase, "");
        androidx.work.impl.model.WorkSpecDao workSpecDao = workDatabase.workSpecDao();
        androidx.work.impl.model.WorkNameDao workNameDao = workDatabase.workNameDao();
        androidx.work.impl.model.WorkTagDao workTagDao = workDatabase.workTagDao();
        androidx.work.impl.model.SystemIdInfoDao systemIdInfoDao = workDatabase.systemIdInfoDao();
        java.util.List<androidx.work.impl.model.WorkSpec> recentlyCompletedWork = workSpecDao.getRecentlyCompletedWork(workManagerImpl.getConfiguration().getClock().currentTimeMillis() - java.util.concurrent.TimeUnit.DAYS.toMillis(1L));
        java.util.List<androidx.work.impl.model.WorkSpec> runningWork = workSpecDao.getRunningWork();
        java.util.List<androidx.work.impl.model.WorkSpec> allEligibleWorkSpecsForScheduling = workSpecDao.getAllEligibleWorkSpecsForScheduling(200);
        if (!recentlyCompletedWork.isEmpty()) {
            androidx.work.Logger logger = androidx.work.Logger.get();
            str5 = androidx.work.impl.workers.DiagnosticsWorkerKt.getHighResolutionOutputSizeshNQ4ISI;
            logger.info(str5, "Recently completed work:\n\n");
            androidx.work.Logger logger2 = androidx.work.Logger.get();
            str6 = androidx.work.impl.workers.DiagnosticsWorkerKt.getHighResolutionOutputSizeshNQ4ISI;
            logger2.info(str6, androidx.work.impl.workers.DiagnosticsWorkerKt.access$workSpecRows(workNameDao, workTagDao, systemIdInfoDao, recentlyCompletedWork));
        }
        if (!runningWork.isEmpty()) {
            androidx.work.Logger logger3 = androidx.work.Logger.get();
            str3 = androidx.work.impl.workers.DiagnosticsWorkerKt.getHighResolutionOutputSizeshNQ4ISI;
            logger3.info(str3, "Running work:\n\n");
            androidx.work.Logger logger4 = androidx.work.Logger.get();
            str4 = androidx.work.impl.workers.DiagnosticsWorkerKt.getHighResolutionOutputSizeshNQ4ISI;
            logger4.info(str4, androidx.work.impl.workers.DiagnosticsWorkerKt.access$workSpecRows(workNameDao, workTagDao, systemIdInfoDao, runningWork));
        }
        if (!allEligibleWorkSpecsForScheduling.isEmpty()) {
            androidx.work.Logger logger5 = androidx.work.Logger.get();
            str = androidx.work.impl.workers.DiagnosticsWorkerKt.getHighResolutionOutputSizeshNQ4ISI;
            logger5.info(str, "Enqueued work:\n\n");
            androidx.work.Logger logger6 = androidx.work.Logger.get();
            str2 = androidx.work.impl.workers.DiagnosticsWorkerKt.getHighResolutionOutputSizeshNQ4ISI;
            logger6.info(str2, androidx.work.impl.workers.DiagnosticsWorkerKt.access$workSpecRows(workNameDao, workTagDao, systemIdInfoDao, allEligibleWorkSpecsForScheduling));
        }
        androidx.work.ListenableWorker.Result success = androidx.work.ListenableWorker.Result.success();
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(success, "");
        return success;
    }
}
