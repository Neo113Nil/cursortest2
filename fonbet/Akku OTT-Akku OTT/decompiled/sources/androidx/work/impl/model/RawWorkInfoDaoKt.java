package androidx.work.impl.model;

import androidx.sqlite.db.SupportSQLiteQuery;
import androidx.work.WorkInfo;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.I;
import kotlinx.coroutines.flow.InterfaceC1060e;

@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\u001a-\u0010\b\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00070\u00060\u0005*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"Landroidx/work/impl/model/RawWorkInfoDao;", "Lkotlinx/coroutines/I;", "dispatcher", "Landroidx/sqlite/db/SupportSQLiteQuery;", "query", "Lkotlinx/coroutines/flow/e;", "", "Landroidx/work/WorkInfo;", "getWorkInfoPojosFlow", "(Landroidx/work/impl/model/RawWorkInfoDao;Lkotlinx/coroutines/I;Landroidx/sqlite/db/SupportSQLiteQuery;)Lkotlinx/coroutines/flow/e;", "work-runtime_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class RawWorkInfoDaoKt {
    public static final InterfaceC1060e<List<WorkInfo>> getWorkInfoPojosFlow(RawWorkInfoDao rawWorkInfoDao, I dispatcher, SupportSQLiteQuery query) {
        Intrinsics.checkNotNullParameter(rawWorkInfoDao, "<this>");
        Intrinsics.checkNotNullParameter(dispatcher, "dispatcher");
        Intrinsics.checkNotNullParameter(query, "query");
        return WorkSpecDaoKt.dedup(rawWorkInfoDao.getWorkInfoPojosFlow(query), dispatcher);
    }
}
