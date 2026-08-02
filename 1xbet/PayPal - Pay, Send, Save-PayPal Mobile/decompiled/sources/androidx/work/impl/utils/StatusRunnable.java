package androidx.work.impl.utils;

@kotlin.Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a5\u0010\b\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00070\u00030\u0006*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003H\u0000¢\u0006\u0004\b\b\u0010\t\u001a+\u0010\f\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00070\u0006*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u000b\u001a\u00020\nH\u0000¢\u0006\u0004\b\f\u0010\r\u001a/\u0010\u000f\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00070\u00030\u0006*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u000e\u001a\u00020\u0004H\u0000¢\u0006\u0004\b\u000f\u0010\u0010\u001a/\u0010\u0012\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00070\u00030\u0006*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u0011\u001a\u00020\u0004H\u0000¢\u0006\u0004\b\u0012\u0010\u0010\u001a/\u0010\u0015\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00070\u00030\u0006*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u0014\u001a\u00020\u0013H\u0000¢\u0006\u0004\b\u0015\u0010\u0016"}, d2 = {"Landroidx/work/impl/WorkDatabase;", "Landroidx/work/impl/utils/taskexecutor/TaskExecutor;", "executor", "", "", "ids", "Lcom/google/common/util/concurrent/ListenableFuture;", "Landroidx/work/WorkInfo;", "forStringIds", "(Landroidx/work/impl/WorkDatabase;Landroidx/work/impl/utils/taskexecutor/TaskExecutor;Ljava/util/List;)Lcom/google/common/util/concurrent/ListenableFuture;", "Ljava/util/UUID;", "id", "forUUID", "(Landroidx/work/impl/WorkDatabase;Landroidx/work/impl/utils/taskexecutor/TaskExecutor;Ljava/util/UUID;)Lcom/google/common/util/concurrent/ListenableFuture;", "tag", "forTag", "(Landroidx/work/impl/WorkDatabase;Landroidx/work/impl/utils/taskexecutor/TaskExecutor;Ljava/lang/String;)Lcom/google/common/util/concurrent/ListenableFuture;", "name", "forUniqueWork", "Landroidx/work/WorkQuery;", "querySpec", "forWorkQuerySpec", "(Landroidx/work/impl/WorkDatabase;Landroidx/work/impl/utils/taskexecutor/TaskExecutor;Landroidx/work/WorkQuery;)Lcom/google/common/util/concurrent/ListenableFuture;"}, k = 2, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class StatusRunnable {
    public static final com.google.common.util.concurrent.ListenableFuture<java.util.List<androidx.work.WorkInfo>> forStringIds(androidx.work.impl.WorkDatabase workDatabase, androidx.work.impl.utils.taskexecutor.TaskExecutor taskExecutor, final java.util.List<java.lang.String> list) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(workDatabase, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(taskExecutor, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(list, "");
        kotlin.jvm.functions.Function1 function1 = new kotlin.jvm.functions.Function1() { // from class: androidx.work.impl.utils.StatusRunnable$$ExternalSyntheticLambda5
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return androidx.work.impl.utils.StatusRunnable.$r8$lambda$YuPJK2_Qcz6dKUIEpT68CVnqE2c(list, (androidx.work.impl.WorkDatabase) obj);
            }
        };
        androidx.work.impl.utils.taskexecutor.SerialExecutor serialTaskExecutor = taskExecutor.getSerialTaskExecutor();
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(serialTaskExecutor, "");
        return androidx.work.ListenableFutureKt.executeAsync(serialTaskExecutor, "loadStatusFuture", new androidx.work.impl.utils.StatusRunnable$$ExternalSyntheticLambda0(function1, workDatabase));
    }

    public static final com.google.common.util.concurrent.ListenableFuture<androidx.work.WorkInfo> forUUID(androidx.work.impl.WorkDatabase workDatabase, androidx.work.impl.utils.taskexecutor.TaskExecutor taskExecutor, final java.util.UUID uuid) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(workDatabase, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(taskExecutor, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(uuid, "");
        kotlin.jvm.functions.Function1 function1 = new kotlin.jvm.functions.Function1() { // from class: androidx.work.impl.utils.StatusRunnable$$ExternalSyntheticLambda1
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return androidx.work.impl.utils.StatusRunnable.$r8$lambda$wUNH3umbT3t7b3tjKaEoryTIlAA(uuid, (androidx.work.impl.WorkDatabase) obj);
            }
        };
        androidx.work.impl.utils.taskexecutor.SerialExecutor serialTaskExecutor = taskExecutor.getSerialTaskExecutor();
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(serialTaskExecutor, "");
        return androidx.work.ListenableFutureKt.executeAsync(serialTaskExecutor, "loadStatusFuture", new androidx.work.impl.utils.StatusRunnable$$ExternalSyntheticLambda0(function1, workDatabase));
    }

    public static final com.google.common.util.concurrent.ListenableFuture<java.util.List<androidx.work.WorkInfo>> forTag(androidx.work.impl.WorkDatabase workDatabase, androidx.work.impl.utils.taskexecutor.TaskExecutor taskExecutor, final java.lang.String str) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(workDatabase, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(taskExecutor, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
        kotlin.jvm.functions.Function1 function1 = new kotlin.jvm.functions.Function1() { // from class: androidx.work.impl.utils.StatusRunnable$$ExternalSyntheticLambda3
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return androidx.work.impl.utils.StatusRunnable.$r8$lambda$Ip7LZkcDd61ZxxDYkHF6f3aa1lY(str, (androidx.work.impl.WorkDatabase) obj);
            }
        };
        androidx.work.impl.utils.taskexecutor.SerialExecutor serialTaskExecutor = taskExecutor.getSerialTaskExecutor();
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(serialTaskExecutor, "");
        return androidx.work.ListenableFutureKt.executeAsync(serialTaskExecutor, "loadStatusFuture", new androidx.work.impl.utils.StatusRunnable$$ExternalSyntheticLambda0(function1, workDatabase));
    }

    public static final com.google.common.util.concurrent.ListenableFuture<java.util.List<androidx.work.WorkInfo>> forUniqueWork(androidx.work.impl.WorkDatabase workDatabase, androidx.work.impl.utils.taskexecutor.TaskExecutor taskExecutor, final java.lang.String str) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(workDatabase, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(taskExecutor, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
        kotlin.jvm.functions.Function1 function1 = new kotlin.jvm.functions.Function1() { // from class: androidx.work.impl.utils.StatusRunnable$$ExternalSyntheticLambda2
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return androidx.work.impl.utils.StatusRunnable.$r8$lambda$GTFfHu_BH8r78lKa8gMa7h2QP_Q(str, (androidx.work.impl.WorkDatabase) obj);
            }
        };
        androidx.work.impl.utils.taskexecutor.SerialExecutor serialTaskExecutor = taskExecutor.getSerialTaskExecutor();
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(serialTaskExecutor, "");
        return androidx.work.ListenableFutureKt.executeAsync(serialTaskExecutor, "loadStatusFuture", new androidx.work.impl.utils.StatusRunnable$$ExternalSyntheticLambda0(function1, workDatabase));
    }

    public static final com.google.common.util.concurrent.ListenableFuture<java.util.List<androidx.work.WorkInfo>> forWorkQuerySpec(androidx.work.impl.WorkDatabase workDatabase, androidx.work.impl.utils.taskexecutor.TaskExecutor taskExecutor, final androidx.work.WorkQuery workQuery) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(workDatabase, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(taskExecutor, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(workQuery, "");
        kotlin.jvm.functions.Function1 function1 = new kotlin.jvm.functions.Function1() { // from class: androidx.work.impl.utils.StatusRunnable$$ExternalSyntheticLambda4
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return androidx.work.impl.utils.StatusRunnable.$r8$lambda$KQmF8A3Upi8cceYi1L2hXN4WQNY(androidx.work.WorkQuery.this, (androidx.work.impl.WorkDatabase) obj);
            }
        };
        androidx.work.impl.utils.taskexecutor.SerialExecutor serialTaskExecutor = taskExecutor.getSerialTaskExecutor();
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(serialTaskExecutor, "");
        return androidx.work.ListenableFutureKt.executeAsync(serialTaskExecutor, "loadStatusFuture", new androidx.work.impl.utils.StatusRunnable$$ExternalSyntheticLambda0(function1, workDatabase));
    }

    public static /* synthetic */ java.util.List $r8$lambda$GTFfHu_BH8r78lKa8gMa7h2QP_Q(java.lang.String str, androidx.work.impl.WorkDatabase workDatabase) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(workDatabase, "");
        java.util.List<androidx.work.WorkInfo> apply = androidx.work.impl.model.WorkSpec.WORK_INFO_MAPPER.apply(workDatabase.workSpecDao().getWorkStatusPojoForName(str));
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(apply, "");
        return apply;
    }

    public static /* synthetic */ java.util.List $r8$lambda$Ip7LZkcDd61ZxxDYkHF6f3aa1lY(java.lang.String str, androidx.work.impl.WorkDatabase workDatabase) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(workDatabase, "");
        java.util.List<androidx.work.WorkInfo> apply = androidx.work.impl.model.WorkSpec.WORK_INFO_MAPPER.apply(workDatabase.workSpecDao().getWorkStatusPojoForTag(str));
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(apply, "");
        return apply;
    }

    public static /* synthetic */ java.util.List $r8$lambda$KQmF8A3Upi8cceYi1L2hXN4WQNY(androidx.work.WorkQuery workQuery, androidx.work.impl.WorkDatabase workDatabase) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(workDatabase, "");
        java.util.List<androidx.work.WorkInfo> apply = androidx.work.impl.model.WorkSpec.WORK_INFO_MAPPER.apply(workDatabase.rawWorkInfoDao().getWorkInfoPojos(androidx.work.impl.utils.RawQueries.toRawQuery(workQuery)));
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(apply, "");
        return apply;
    }

    public static /* synthetic */ java.util.List $r8$lambda$YuPJK2_Qcz6dKUIEpT68CVnqE2c(java.util.List list, androidx.work.impl.WorkDatabase workDatabase) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(workDatabase, "");
        java.util.List<androidx.work.WorkInfo> apply = androidx.work.impl.model.WorkSpec.WORK_INFO_MAPPER.apply(workDatabase.workSpecDao().getWorkStatusPojoForIds(list));
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(apply, "");
        return apply;
    }

    public static /* synthetic */ androidx.work.WorkInfo $r8$lambda$wUNH3umbT3t7b3tjKaEoryTIlAA(java.util.UUID uuid, androidx.work.impl.WorkDatabase workDatabase) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(workDatabase, "");
        androidx.work.impl.model.WorkSpecDao workSpecDao = workDatabase.workSpecDao();
        java.lang.String obj = uuid.toString();
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(obj, "");
        androidx.work.impl.model.WorkSpec.WorkInfoPojo workStatusPojoForId = workSpecDao.getWorkStatusPojoForId(obj);
        if (workStatusPojoForId != null) {
            return workStatusPojoForId.toWorkInfo();
        }
        return null;
    }
}
