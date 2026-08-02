package androidx.work.impl.utils;

@kotlin.Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u001a\u0011\u0010\u0002\u001a\u00020\u0001*\u00020\u0000¢\u0006\u0004\b\u0002\u0010\u0003\u001a#\u0010\n\u001a\u00020\t2\n\u0010\u0006\u001a\u00060\u0004j\u0002`\u00052\u0006\u0010\b\u001a\u00020\u0007H\u0002¢\u0006\u0004\b\n\u0010\u000b"}, d2 = {"Landroidx/work/WorkQuery;", "Landroidx/sqlite/db/SupportSQLiteQuery;", "toRawQuery", "(Landroidx/work/WorkQuery;)Landroidx/sqlite/db/SupportSQLiteQuery;", "Ljava/lang/StringBuilder;", "Lkotlin/text/getHighSpeedVideoSizes;", "p0", "", "p1", "", "getHighSpeedVideoFpsRangesFor", "(Ljava/lang/StringBuilder;I)V"}, k = 2, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class RawQueries {
    public static final androidx.database.db.SupportSQLiteQuery toRawQuery(androidx.work.WorkQuery workQuery) {
        java.lang.String str;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(workQuery, "");
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.lang.StringBuilder sb = new java.lang.StringBuilder("SELECT * FROM workspec");
        java.lang.String str2 = " AND";
        if (workQuery.getStates().isEmpty()) {
            str = " WHERE";
        } else {
            java.util.List<androidx.work.WorkInfo.State> states = workQuery.getStates();
            java.util.ArrayList arrayList2 = new java.util.ArrayList(kotlin.collections.CollectionsKt.collectionSizeOrDefault(states, 10));
            java.util.Iterator<T> it = states.iterator();
            while (it.hasNext()) {
                arrayList2.add(java.lang.Integer.valueOf(androidx.work.impl.model.WorkTypeConverters.stateToInt((androidx.work.WorkInfo.State) it.next())));
            }
            java.util.ArrayList arrayList3 = arrayList2;
            sb.append(" WHERE state IN (");
            getHighSpeedVideoFpsRangesFor(sb, arrayList3.size());
            sb.append(")");
            arrayList.addAll(arrayList3);
            str = " AND";
        }
        if (!workQuery.getIds().isEmpty()) {
            java.util.List<java.util.UUID> ids = workQuery.getIds();
            java.util.ArrayList arrayList4 = new java.util.ArrayList(kotlin.collections.CollectionsKt.collectionSizeOrDefault(ids, 10));
            java.util.Iterator<T> it2 = ids.iterator();
            while (it2.hasNext()) {
                arrayList4.add(((java.util.UUID) it2.next()).toString());
            }
            sb.append(str.concat(" id IN ("));
            getHighSpeedVideoFpsRangesFor(sb, workQuery.getIds().size());
            sb.append(")");
            arrayList.addAll(arrayList4);
            str = " AND";
        }
        if (workQuery.getTags().isEmpty()) {
            str2 = str;
        } else {
            sb.append(str.concat(" id IN (SELECT work_spec_id FROM worktag WHERE tag IN ("));
            getHighSpeedVideoFpsRangesFor(sb, workQuery.getTags().size());
            sb.append("))");
            arrayList.addAll(workQuery.getTags());
        }
        if (!workQuery.getUniqueWorkNames().isEmpty()) {
            sb.append(str2.concat(" id IN (SELECT work_spec_id FROM workname WHERE name IN ("));
            getHighSpeedVideoFpsRangesFor(sb, workQuery.getUniqueWorkNames().size());
            sb.append("))");
            arrayList.addAll(workQuery.getUniqueWorkNames());
        }
        sb.append(";");
        java.lang.String obj = sb.toString();
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(obj, "");
        return new androidx.database.db.SimpleSQLiteQuery(obj, arrayList.toArray(new java.lang.Object[0]));
    }

    private static final void getHighSpeedVideoFpsRangesFor(java.lang.StringBuilder sb, int i) {
        if (i <= 0) {
            return;
        }
        java.util.ArrayList arrayList = new java.util.ArrayList(i);
        for (int i2 = 0; i2 < i; i2++) {
            arrayList.add(com.datadog.android.core.internal.CoreFeature.DEFAULT_APP_VERSION);
        }
        sb.append(kotlin.collections.CollectionsKt.joinToString$default(arrayList, ",", null, null, 0, null, null, 62, null));
    }
}
