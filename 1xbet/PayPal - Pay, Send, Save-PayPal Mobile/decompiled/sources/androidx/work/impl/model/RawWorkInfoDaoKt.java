package androidx.work.impl.model;

@kotlin.Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\u001a-\u0010\b\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00070\u00060\u0005*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\b\u0010\t"}, d2 = {"Landroidx/work/impl/model/RawWorkInfoDao;", "Lkotlinx/coroutines/CoroutineDispatcher;", "dispatcher", "Landroidx/sqlite/db/SupportSQLiteQuery;", "query", "Lkotlinx/coroutines/flow/Flow;", "", "Landroidx/work/WorkInfo;", "getWorkInfoPojosFlow", "(Landroidx/work/impl/model/RawWorkInfoDao;Lkotlinx/coroutines/CoroutineDispatcher;Landroidx/sqlite/db/SupportSQLiteQuery;)Lkotlinx/coroutines/flow/Flow;"}, k = 2, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class RawWorkInfoDaoKt {
    public static final kotlinx.coroutines.flow.Flow<java.util.List<androidx.work.WorkInfo>> getWorkInfoPojosFlow(androidx.work.impl.model.RawWorkInfoDao rawWorkInfoDao, kotlinx.coroutines.CoroutineDispatcher coroutineDispatcher, androidx.database.db.SupportSQLiteQuery supportSQLiteQuery) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(rawWorkInfoDao, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(coroutineDispatcher, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(supportSQLiteQuery, "");
        return androidx.work.impl.model.WorkSpecDaoKt.dedup(rawWorkInfoDao.getWorkInfoPojosFlow(supportSQLiteQuery), coroutineDispatcher);
    }
}
